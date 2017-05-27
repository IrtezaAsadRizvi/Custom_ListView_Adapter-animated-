package asad.irteza.sample;

import android.content.Context;
import android.support.annotation.LayoutRes;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ArrayAdapter;
import android.widget.ImageSwitcher;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by Irteza on 25-May-17.
 */

public class ContactListAdapter extends ArrayAdapter<contact>{
    private static final String TAG = "ContactListAdapter";
    private Context mContext;
    int mResource;
    private int lastPosition = -1;

    static class ViewHolder {
        TextView name;
        TextView email;
        ImageView pic;
    }

    public ContactListAdapter(@NonNull Context context, @LayoutRes int resource, @NonNull ArrayList<contact> objects) {
        super(context, resource, objects);
        mContext = context;
        mResource = resource;

    }

    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @NonNull ViewGroup parent) {
        //get the contact info
        int image = getItem(position).getImageResource();
        String name = getItem(position).getName();
        String email = getItem(position).getEmail();
        //creating an object
        contact contact = new contact(image,name,email);
        //creating the view
        ViewHolder holder;
        //creating a view to show the animation
        final View result;

        if (convertView == null){
            LayoutInflater layoutInflater = LayoutInflater.from(mContext);
            convertView = layoutInflater.inflate(mResource,parent,false);

            holder = new ViewHolder();
            holder.pic = (ImageView) convertView.findViewById(R.id.contact_image);
            holder.email = (TextView) convertView.findViewById(R.id.contact_email);
            holder.name = (TextView) convertView.findViewById(R.id.contact_name);

            result = convertView;
            convertView.setTag(holder);
        }else {
            holder = (ViewHolder)convertView.getTag();
            result = convertView;
        }

        Animation animation = AnimationUtils.loadAnimation(mContext,
                (position > lastPosition)? R.anim.scrolling_down_anim : R.anim.scrolling_up_anim);
        result.startAnimation(animation);

        holder.pic.setImageResource(image);
        holder.name.setText(name);
        holder.email.setText(email);


        return convertView;
    }
}

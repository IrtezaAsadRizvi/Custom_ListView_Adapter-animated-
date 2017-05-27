package asad.irteza.sample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {
    ListView customListView;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().setTitle("CONTACTS");
        customListView = (ListView)findViewById(R.id.customListview);
        contact[] contacts = new contact[]{
                new contact(R.drawable.contact1,"Irteza","irteza@email.com"),
                new contact(R.drawable.contact2,"Link","link@email.com"),
                new contact(R.drawable.contact3,"Lana","lana@email.com"),
                new contact(R.drawable.contact4,"Chen","chen@email.com"),
                new contact(R.drawable.contact5,"Mark","mark@email.com"),
                new contact(R.drawable.contact6,"Alex","alex@email.com"),
                new contact(R.drawable.contact7,"David","david@email.com"),
                new contact(R.drawable.contact8,"Ellie","ellie@email.com"),
                new contact(R.drawable.contact6,"Alex","alex@email.com"),
                new contact(R.drawable.contact7,"David","david@email.com"),
                new contact(R.drawable.contact4,"Chen","chen@email.com"),
                new contact(R.drawable.contact5,"Mark","mark@email.com"),
                new contact(R.drawable.contact6,"Alex","alex@email.com"),
                new contact(R.drawable.contact8,"Ellie","ellie@email.com"),
                new contact(R.drawable.contact9,"John","john@email.com"),
                new contact(R.drawable.contact1,"Irteza","irteza@email.com"),
                new contact(R.drawable.contact2,"Link","link@email.com"),
                new contact(R.drawable.contact3,"Lana","lana@email.com"),
                new contact(R.drawable.contact4,"Chen","chen@email.com"),
                new contact(R.drawable.contact5,"Mark","mark@email.com"),
                new contact(R.drawable.contact6,"Alex","alex@email.com"),
                new contact(R.drawable.contact7,"David","david@email.com"),
                new contact(R.drawable.contact8,"Ellie","ellie@email.com"),
                new contact(R.drawable.contact6,"Alex","alex@email.com"),
                new contact(R.drawable.contact7,"David","david@email.com"),
                new contact(R.drawable.contact4,"Chen","chen@email.com"),
                new contact(R.drawable.contact5,"Mark","mark@email.com")
        };
        ArrayList<contact> contactList = new ArrayList<contact>();
        for (contact item : contacts){
            contactList.add(item);
        }
        ContactListAdapter contactListAdapter = new ContactListAdapter(this,R.layout.custom_item_layout,contactList);
        customListView.setAdapter(contactListAdapter);
    }
    /*
 echo "# Custom-ListView-Adapter" >> README.md
git init
git add README.md
git commit -m "first commit"
git remote add origin https://github.com/IrtezaAsadRizvi/Custom-ListView-Adapter.git
git push -u origin master*/
}

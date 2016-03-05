package timagos.com.bookshelfone;

import android.app.Dialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.ArrayList;

import timagos.com.bookshelfone.ListviewFragment;

public class MainActivity extends AppCompatActivity {

//    private Button button;
    private Spinner spinner;
    private ListviewFragment mListviewFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);


        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        mListviewFragment = ListviewFragment.newInstance();


        getSupportFragmentManager()
                .beginTransaction()
                .replace(R.id.fragmentContainer, mListviewFragment)
                .commit();

        //button = (Button) findViewById(R.id.buttonClick);
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent in = new Intent(MainActivity.this, InfoBook.class);
//
//                startActivity(in);
//            }
//        });
//        ArrayList<String> searchBy = new ArrayList<String>();
//        spinner = (Spinner) findViewById(R.id.spnSearchBy);
//
//        searchBy.add("Author");
//        searchBy.add("Genre");
//
//        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(MainActivity.this
//                ,android.R.layout.simple_spinner_item,searchBy);
//
//
//        spinner.setAdapter(arrayAdapter);
//        spinner.setOnItemSelectedListener(new  AdapterView.OnItemSelectedListener() {
//
//            public void onItemSelected(AdapterView<?> adapterView,
//                                       View view, int i, long l) {
//                // TODO Auto-generated method stub
////                Toast.makeText(MainActivity.this,"You Selected : "
////                        + difficultyLevelOptionsList.get(i)+" Level ",Toast.LENGTH_SHORT).show();
//
//            }
//            // If no option selected
//            public void onNothingSelected(AdapterView<?> arg0) {
//                // TODO Auto-generated method stub
//
//            }
//
//        });

    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();


        if (id == R.id.search) {

            final Dialog dialog = new Dialog(MainActivity.this);
            dialog.setContentView(R.layout.dialog_box);
            dialog.setTitle("Search Something");

            // set values for custom dialog components - text, image and button
            EditText text = (EditText) dialog.findViewById(R.id.etSearch);



            dialog.show();



        }
        return super.onOptionsItemSelected(item);
    }
}

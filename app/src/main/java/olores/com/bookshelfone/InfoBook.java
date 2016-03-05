package timagos.com.bookshelfone;

import android.app.Dialog;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.Icon;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.EditText;


public class InfoBook extends AppCompatActivity {


    private EditText mTitle;
    private EditText mGenre;
    private EditText mAuthor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.book_info);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        mTitle = (EditText) findViewById(R.id.bookTitle);
        mGenre = (EditText) findViewById(R.id.bookGenre);
        mAuthor = (EditText) findViewById(R.id.bookAuthor);


        Intent intent = getIntent();
        String id = intent.getStringExtra("id");
        mTitle.setText(id);
        mTitle.setEnabled(false);
        mGenre.setEnabled(false);
        mAuthor.setEnabled(false);

    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_book, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.edit) {
            item.setIcon(R.mipmap.ic_done);
            mTitle.setEnabled(true);
            mAuthor.setEnabled(true);
            mGenre.setEnabled(true);
        }
        if (id == R.id.delete){
            final Dialog dialog = new Dialog(InfoBook.this);
            dialog.setContentView(R.layout.dialog_box);
            dialog.setTitle("Search Something");

            // set values for custom dialog components - text, image and button
            EditText text = (EditText) dialog.findViewById(R.id.etSearch);



            dialog.show();
        }




        return super.onOptionsItemSelected(item);
    }
}

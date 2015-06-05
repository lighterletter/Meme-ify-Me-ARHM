package nyc.c4q.rosmaryfc.meme_ify_me;

import android.os.Bundle;
import android.content.ComponentName;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Parcelable;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.util.Log;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;



import java.util.ArrayList;
import java.util.List;







public class VanillaMemeEdit extends ActionBarActivity {
    private Uri imageUri;
    private TextView topTextView;
    private TextView midTextView;
    private TextView btmTextView;
    private EditText topEditText;
    private EditText midEditText;
    private EditText btmEditText;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vanilla_meme_edit);

        //Drawable myIcon = getResources().getDrawable( R.drawable.);


        Button topEditTxtPreviewBtn = (Button) findViewById(R.id.top_editText_preview_btn);
        topEditTxtPreviewBtn.setOnClickListener(topPreviewBtnListener);

        Button midEditTxtPreviewBtn = (Button) findViewById(R.id.mid_editText_preview_btn);
        midEditTxtPreviewBtn.setOnClickListener(midPreviewBtnListener);

        Button btmEditTxtPreviewBtn = (Button) findViewById(R.id.btm_editText_preview_btn);
        btmEditTxtPreviewBtn.setOnClickListener(btmPreviewBtnListener);

    }

    private View.OnClickListener topPreviewBtnListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            topEditText = (EditText) findViewById(R.id.top_editText);
            topTextView = (TextView) findViewById(R.id.top_textView);
            topTextView.setText(topEditText.getText().toString());
        }
    };

    private View.OnClickListener midPreviewBtnListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            midEditText = (EditText) findViewById(R.id.mid_editText);
            midTextView = (TextView) findViewById(R.id.mid_textView);
            midTextView.setText(midEditText.getText().toString());
        }
    };

    private View.OnClickListener btmPreviewBtnListener = new View.OnClickListener() {
        @Override
        public void onClick(View view) {
            btmEditText = (EditText) findViewById(R.id.btm_editText);
            btmTextView = (TextView) findViewById(R.id.btm_textView);
            btmTextView.setText(btmEditText.getText().toString());
        }
    };



    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_vanilla_meme_edit, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }
}

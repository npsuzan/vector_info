package com.vector.xuzan.vector_info;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.TextView;


public class Start extends Activity implements View.OnClickListener{

    TextView dial,login_up;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layout_start);
        dial=(TextView)findViewById(R.id.dial_call);
        login_up=(TextView)findViewById(R.id.login_signup);
        dial.setOnClickListener(this);
    }

    @Override
    public void onClick(View v)
    {
     if(v==dial)
     {
         Intent calli=new Intent(Intent.ACTION_CALL);
         calli.setData(Uri.parse("tel:015011778"));
         startActivity(calli);
     }
    }
}

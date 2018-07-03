package com.example.d064036.greenwaste;import android.content.Intent;import android.support.v4.widget.DrawerLayout;import android.support.v7.app.ActionBar;import android.support.v7.app.ActionBarDrawerToggle;import android.support.v7.app.AppCompatActivity;import android.os.Bundle;import android.view.Gravity;import android.view.MenuItem;import android.view.View;import android.widget.Button;import android.widget.SearchView;import android.widget.TextView;import android.widget.Toolbar;import java.io.UnsupportedEncodingException;import java.net.URLEncoder;public class MainActivity extends AppCompatActivity {    android.support.v7.widget.Toolbar toolbar;    ActionBar actionbar;    SearchView search;    Abfallkalender_Async AK_Sync;    String table_muellkalender;    protected static Button BtnTonne1;    protected static Button BtnTonne2;    protected static Button BtnTonne3;    protected static Button BtnTonne4;    protected static TextView EdtEntleerung1;    protected static TextView EdtEntleerung2;    protected static TextView EdtEntleerung3;    protected static TextView EdtEntleerung4;    @Override    protected void onCreate(Bundle savedInstanceState) {        super.onCreate(savedInstanceState);        setContentView(R.layout.activity_main);        toolbar = findViewById(R.id.toolbar);        setSupportActionBar(toolbar);        BtnTonne1 = findViewById(R.id.BtnTonne1);        BtnTonne2 = findViewById(R.id.BtnTonne2);        BtnTonne3 = findViewById(R.id.BtnTonne3);        BtnTonne4 = findViewById(R.id.BtnTonne4);        EdtEntleerung1 = findViewById(R.id.Entleerung1);        EdtEntleerung2 = findViewById(R.id.Entleerung2);        EdtEntleerung3 = findViewById(R.id.Entleerung3);        EdtEntleerung4 = findViewById(R.id.Entleerung4);        actionbar = getSupportActionBar();        actionbar.setDisplayHomeAsUpEnabled(true);        actionbar.setHomeAsUpIndicator(R.drawable.ic_menu);        AK_Sync = new Abfallkalender_Async();        table_muellkalender = "Muellkalender"; //Tabelle nach der gesucht werden soll        String url = null;        try {            url = "http://mobile.5bbiz.com/php/db.php?table=" + URLEncoder.encode(table_muellkalender, "UTF-8");        } catch (UnsupportedEncodingException e) {            e.printStackTrace();        }        AK_Sync.execute(url);    }    //das ist das wo man auf den setting scheiß button oben links clickt    @Override    public boolean onOptionsItemSelected(MenuItem item) {        System.out.println(item.getItemId());        switch (item.getItemId()) {            case 16908332://R.id.action_settings:                Intent intent = new Intent(this, EinstellungenActivity.class);                startActivity(intent);                return true;            default:                // If we got here, the user's action was not recognized.                // Invoke the superclass to handle it.                return super.onOptionsItemSelected(item);        }    }}
package com.example.d064036.greenwaste;import android.content.Intent;import android.support.v4.widget.DrawerLayout;import android.support.v7.app.ActionBar;import android.support.v7.app.ActionBarDrawerToggle;import android.support.v7.app.AppCompatActivity;import android.os.Bundle;import android.view.Gravity;import android.view.MenuItem;import android.view.View;import android.widget.SearchView;import android.widget.TextView;import android.widget.Toolbar;public class MainActivity extends AppCompatActivity {    android.support.v7.widget.Toolbar toolbar;    ActionBar actionbar;    SearchView search;    @Override    protected void onCreate(Bundle savedInstanceState) {        super.onCreate(savedInstanceState);        setContentView(R.layout.activity_main);        toolbar = findViewById(R.id.toolbar);        setSupportActionBar(toolbar);        actionbar = getSupportActionBar();        actionbar.setDisplayHomeAsUpEnabled(true);        actionbar.setHomeAsUpIndicator(R.drawable.ic_menu);    }    //das ist das wo man auf den setting scheiß button oben links clickt    @Override    public boolean onOptionsItemSelected(MenuItem item) {        System.out.println(item.getItemId());        switch (item.getItemId()) {            case 16908332://R.id.action_settings:                Intent intent = new Intent(this, EinstellungenActivity.class);                startActivity(intent);                return true;            default:                // If we got here, the user's action was not recognized.                // Invoke the superclass to handle it.                return super.onOptionsItemSelected(item);        }    }}
package com.spencerstudios.androidstudioshortcuts;

import android.app.Dialog;
import android.os.Bundle;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.SearchView;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener,
        SearchView.OnQueryTextListener {

    private List<Data> temp;
    private ListView listView;
    private ShortCutAdapter shortCutAdapter;
    private boolean windowsSelected = true;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        setSubtitle();

        //l = ShortCuts.list();
        temp = new ArrayList<>();

        listView = (ListView)findViewById(R.id.list_view) ;
        shortCutAdapter = new ShortCutAdapter(this, ShortCuts.list(), windowsSelected);
        listView.setAdapter(shortCutAdapter);


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.setDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        MenuInflater menuInflater = getMenuInflater();
        menuInflater.inflate(R.menu.main, menu);
        SearchView searchView = (SearchView) menu.findItem(R.id.action_search).getActionView();
        searchView.setQueryHint("search titles...");
        searchView.setOnQueryTextListener(this);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        int id = item.getItemId();

        if (id == R.id.action_search) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();

        if (id == R.id.nav_windows) {
            windowsSelected = true;
            listView.setAdapter(new ShortCutAdapter(MainActivity.this, ShortCuts.list(), windowsSelected ));
            setSubtitle();

        } else if (id == R.id.nav_mac) {
            windowsSelected = false;
            listView.setAdapter(new ShortCutAdapter(MainActivity.this, ShortCuts.list(), windowsSelected ));
            setSubtitle();
        }else if (id == R.id.nav_attr){
            displayAttrDialog();
        }


        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }

    @Override
    public boolean onQueryTextSubmit(String query) {
        return false;
    }

    @Override
    public boolean onQueryTextChange(String entry) {

        temp.clear();
        for (int i = 0; i < ShortCuts.list().size(); i++) {
            if (ShortCuts.list().get(i).getShortcut().toLowerCase().contains(entry.toLowerCase())) {
                temp.add(ShortCuts.list().get(i));
            }
        }
        if (entry.length() > 0) listView.setAdapter(new ShortCutAdapter(this, temp, windowsSelected));
        else listView.setAdapter(new ShortCutAdapter(this, ShortCuts.list(), windowsSelected));

        return false;
    }

    private void setSubtitle(){
        if (getSupportActionBar()!=null){
            invalidateOptionsMenu();
            getSupportActionBar().setSubtitle(windowsSelected ? "Windows/Linux" : "Mac");
        }
    }

    private void displayAttrDialog(){

        final Dialog dialog = new Dialog(MainActivity.this);
        dialog.setContentView(R.layout.attribution_dialog);

        dialog.show();
    }
}

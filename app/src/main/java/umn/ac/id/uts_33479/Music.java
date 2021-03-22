package umn.ac.id.uts_33479;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AlertDialog;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.DialogInterface;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.MenuItem;
import static umn.ac.id.uts_33479.MainActivity.lagu;

public class Music {
    RecyclerView recyclerView;
    MusicAdapter musicAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.music_);
        recyclerView = (RecyclerView) findViewById(R.id.recyclerView);
        recyclerView.setHasFixedSize(true);
        if (!(lagu.size() < 1)){
            musicAdapter = new MusicAdapter(this, lagu);
            recyclerView.setAdapter((musicAdapter));
            recyclerView.setLayoutManager(new LinearLayoutManager(this, RecyclerView.VERTICAL, false));
        }
    }
    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.menu, menu);
        return super.onCreateOptionsMenu(menu);
    }

    private LayoutInflater getMenuInflater() {
        return null;
    }

    @Override
    public boolean onOptionsItemSelected(@NonNull MenuItem item) {
        int id = item.getItemId();
        if(id == R.id.Profile){
            Intent i = new Intent(Music.this, ProfilePage.class);
            MainActivity(i);
            finish();
            return true;
        }else if(id == R.id.Logout){
            Intent i = new Intent(Music.this, MainActivity.class);
            MainActivity(i);
            finish();
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private void showStartDialog() {
        new AlertDialog.Builder(this).setTitle("Selamat Datang").setMessage("Kiagus Fathur Rahman - 33479").setPositiveButton("Ok", new DialogInterface.OnClickListener(){
            @Override
            public void onClick(DialogInterface dialog, int which) {
                dialog.dismiss();
            }
        }).create().show();
    }
}

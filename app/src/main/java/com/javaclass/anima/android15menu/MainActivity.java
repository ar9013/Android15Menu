package com.javaclass.anima.android15menu;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.PopupMenu;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    private Button btnClick;
    private TextView tvshow;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btnClick = (Button) findViewById(R.id.click1);
        tvshow = (TextView) findViewById(R.id.tvShow);


    }

    public void showPopupMenu(View v){
        PopupMenu popupMenu = new PopupMenu(this,v);
        MenuInflater inflater = popupMenu.getMenuInflater();
        inflater.inflate(R.menu.main,popupMenu.getMenu());

        popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener(){

            @Override
            public boolean onMenuItemClick(MenuItem menuItem) {
                switch (menuItem.getItemId()){
                    case R.id.list_item1:{
                        Toast.makeText(MainActivity.this,"編輯",Toast.LENGTH_LONG).show();
                    }
                        break;
                    case R.id.list_item2:{
                        Toast.makeText(MainActivity.this,"刪除",Toast.LENGTH_LONG).show();
                    }
                        break;
                    case R.id.list_item3:{
                        Toast.makeText(MainActivity.this,"列表",Toast.LENGTH_LONG).show();
                    }
                    break;
                    case R.id.list_item4:{
                        Toast.makeText(MainActivity.this,"測試",Toast.LENGTH_LONG).show();
                    }
                    break;

                }
                return false;
            }
        });
        popupMenu.show();
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.main,menu);

        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()){
            case R.id.action_about:{
                Toast.makeText(this,"選擇了 about",Toast.LENGTH_LONG).show();
            }
                break;
            case R.id.action_help:{
                Toast.makeText(this,"選擇了 help",Toast.LENGTH_LONG).show();
            }
            break;

            case R.id.action_setting:{
                Toast.makeText(this,"選擇了 setting",Toast.LENGTH_LONG).show();
            }
            break;
        }

        return super.onOptionsItemSelected(item);
    }
}

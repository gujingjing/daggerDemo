package huanxin.gjj.daggerdemo;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.util.Log;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Toast;

import javax.inject.Inject;

import huanxin.gjj.daggerdemo.model.TestModel1;

public class MainActivity extends AppCompatActivity {

     @Inject
    TestModel1 testModel1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toast.makeText(this,testModel1.toString(),Toast.LENGTH_LONG).show();
    }
}

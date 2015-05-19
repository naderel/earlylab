package naderelchebib.firewall;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.Menu;
import android.view.MenuItem;

/**
 * Created by naderelchebib on 4/18/15.
 */
public class settings extends ActionBarActivity {
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.settingsview);
        System.out.println("First phase");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_settings, menu);
        System.out.println("Second phase");
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();
        System.out.println("Third phase");
        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            // actionsettings();
            return true;
        }
        if (id == R.id.action_save) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }
}

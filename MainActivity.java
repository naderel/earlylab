package naderelchebib.firewall;

import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import naderelchebib.firewall.Network;
import naderelchebib.firewall.terminal;
import android.app.Activity;
import android.content.Intent;
import android.view.View;

public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        System.out.println("First phase");
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
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
            actionsettings();
            return true;
        }
        if (id == R.id.action_save) {
            return true;
        }
        return super.onOptionsItemSelected(item);
    }

    private void actionsettings() {
        // open settings view
        System.out.println("opening settings for applications");
    }
    private void Terminal() {
        // open settings view
        View view;
        view = findViewById(R.id.Teriminal);
        Intent myIntent = new Intent(view.getContext(), terminal.class);
        startActivityForResult(myIntent, 0);
        System.out.println("Terminal view");

    }
    private void blocktrafficfromIP(){
       /* BLOCK_THIS_IP="x.x.x.x"
        iptables -A INPUT -s "$BLOCK_THIS_IP" -j DROP*/

    }

    private void loadbalance(){
     /*   iptables -A PREROUTING -i eth0 -p tcp --dport 443 -m state --state NEW -m nth --counter 0 --every 3 --packet 0 -j DNAT --to-destination 192.168.1.101:443
        iptables -A PREROUTING -i eth0 -p tcp --dport 443 -m state --state NEW -m nth --counter 0 --every 3 --packet 1 -j DNAT --to-destination 192.168.1.102:443
        iptables -A PREROUTING -i eth0 -p tcp --dport 443 -m state --state NEW -m nth --counter 0 --every 3 --packet 2 -j DNAT --to-destination 192.168.1.103:443
    */

    }

    private void blockservice(){

    }

    private void blockservicebyname(){

    }

    private void portforwarding(){
      /*  iptables -t nat -A PREROUTING -p tcp -d 192.168.102.37 --dport 422 -j DNAT --to 192.168.102.37:22
        iptables -A INPUT -i eth0 -p tcp --dport 422 -m state --state NEW,ESTABLISHED -j ACCEPT
        iptables -A OUTPUT -o eth0 -p tcp --sport 422 -m state --state ESTABLISHED -j ACCEPT
        */
    }

    private void noDOSing(int limit,String timedomain,int lburst){
        try {
            Process su = Runtime.getRuntime().exec("");
        }
        catch(Exception eX){
            eX.printStackTrace();
        }
      /*  iptables -A INPUT -p tcp --dport 80 -m limit --limit 25/minute --limit-burst 100 -j ACCEPT
    */
    }

    private void logdrops(){

       /* iptables -N LOGGING
        iptables -A INPUT -j LOGGING
        iptables -A LOGGING -m limit --limit 2/min -j LOG --log-prefix "IPTables Packet Dropped: " --log-level 7
        iptables -A LOGGING -j DROP
    */}
     public void launchbuttonpressed() {
         try {
             /*
             iptables -A PREROUTING -i eth0 -p tcp --dport 443 -m state --state NEW -m nth --counter 0 --every 3 --packet 0 -j DNAT --to-destination 192.168.1.101:443
             iptables -A PREROUTING -i eth0 -p tcp --dport 443 -m state --state NEW -m nth --counter 0 --every 3 --packet 1 -j DNAT --to-destination 192.168.1.102:443
             iptables -A PREROUTING -i eth0 -p tcp --dport 443 -m state --state NEW -m nth --counter 0 --every 3 --packet 2 -j DNAT --to-destination 192.168.1.103:443
             iptables -A LOGGING -j DROP
              */
             /*iptables -L -n -v
             iptables -L INPUT -n -v
             service iptables stop
             service iptables start
             service iptables restart
             service iptables save
             iptables-save > /root/my.active.firewall.rules
             cat /root/my.active.firewall.rules
             iptables-restore < /root/my.active.firewall.rules
             # iptables -P INPUT DROP
             # iptables -P OUTPUT DROP
             # iptables -P FORWARD DROP
             # iptables -P INPUT DROP
             # iptables -P FORWARD DROP
             # iptables -P OUTPUT ACCEPT
             # iptables -A INPUT -m state --state NEW,ESTABLISHED -j ACCEPT
             # iptables -A INPUT -i eth1 -s 192.168.0.0/24 -j DROP
             # iptables -A INPUT -i eth1 -s 10.0.0.0/8 -j DROP
             10.0.0.0/8 -j (A)
             172.16.0.0/12 (B)
             192.168.0.0/16 (C)
             224.0.0.0/4 (MULTICAST D)
             240.0.0.0/5 (E)
             127.0.0.0/8 (LOOPBACK)
             */
         } catch (Exception eX) {
             eX.printStackTrace();
         }
     }
}
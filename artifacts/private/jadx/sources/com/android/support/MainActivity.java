package com.android.support;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;

/* JADX INFO: loaded from: classes14.dex */
public class MainActivity extends Activity {
    public String GameActivity = "com.unity3d.player.UnityPlayerActivity";
    public boolean hasLaunched = false;

    @Override // android.app.Activity
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (!this.hasLaunched) {
            try {
                this.hasLaunched = true;
                startActivity(new Intent(this, Class.forName(this.GameActivity)));
                Main.Start(this);
                return;
            } catch (ClassNotFoundException e10) {
                Log.e("Mod_menu", "Error. Game's main activity does not exist");
            }
        }
        Main.Start(this);
    }
}

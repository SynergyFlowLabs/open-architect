package net.openid.appauth;

import android.app.Activity;
import android.os.Bundle;

/* JADX INFO: loaded from: classes4.dex */
public class RedirectUriReceiverActivity extends Activity {
    @Override // android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        startActivity(AuthorizationManagementActivity.b(this, getIntent().getData()));
        finish();
    }
}

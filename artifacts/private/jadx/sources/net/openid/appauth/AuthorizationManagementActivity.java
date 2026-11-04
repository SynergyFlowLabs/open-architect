package net.openid.appauth;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import androidx.annotation.l1;
import org.json.JSONException;

/* JADX INFO: loaded from: classes4.dex */
public class AuthorizationManagementActivity extends Activity {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @l1
    static final String f332786f = "authIntent";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @l1
    static final String f332787g = "authRequest";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @l1
    static final String f332788h = "completeIntent";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @l1
    static final String f332789i = "cancelIntent";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @l1
    static final String f332790j = "authStarted";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f332791a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Intent f332792b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private f f332793c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private PendingIntent f332794d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private PendingIntent f332795e;

    private static Intent a(Context context) {
        return new Intent(context, (Class<?>) AuthorizationManagementActivity.class);
    }

    public static Intent b(Context context, Uri uri) {
        Intent intentA = a(context);
        intentA.setData(uri);
        intentA.addFlags(603979776);
        return intentA;
    }

    public static Intent c(Context context, f fVar, Intent intent) {
        return d(context, fVar, intent, null, null);
    }

    public static Intent d(Context context, f fVar, Intent intent, PendingIntent pendingIntent, PendingIntent pendingIntent2) {
        Intent intentA = a(context);
        intentA.putExtra(f332786f, intent);
        intentA.putExtra(f332787g, fVar.i());
        intentA.putExtra(f332788h, pendingIntent);
        intentA.putExtra(f332789i, pendingIntent2);
        return intentA;
    }

    private Intent e(Uri uri) {
        if (uri.getQueryParameterNames().contains("error")) {
            return e.k(uri).p();
        }
        g gVarA = new g.b(this.f332793c).b(uri).a();
        String str = this.f332793c.f332969i;
        if ((str != null || gVarA.f333019b == null) && (str == null || str.equals(gVarA.f333019b))) {
            return gVarA.l();
        }
        net.openid.appauth.internal.a.l("State returned in authorization response (%s) does not match state from request (%s) - discarding response", gVarA.f333019b, this.f332793c.f332969i);
        return e.a.f332924j.p();
    }

    private void f(Bundle bundle) {
        if (bundle == null) {
            net.openid.appauth.internal.a.l("No stored state - unable to handle response", new Object[0]);
            finish();
            return;
        }
        this.f332792b = (Intent) bundle.getParcelable(f332786f);
        this.f332791a = bundle.getBoolean(f332790j, false);
        try {
            String string = bundle.getString(f332787g, null);
            this.f332793c = string != null ? f.f(string) : null;
            this.f332794d = (PendingIntent) bundle.getParcelable(f332788h);
            this.f332795e = (PendingIntent) bundle.getParcelable(f332789i);
        } catch (JSONException e10) {
            throw new IllegalStateException("Unable to deserialize authorization request", e10);
        }
    }

    private void g() {
        net.openid.appauth.internal.a.a("Authorization flow canceled by user", new Object[0]);
        Intent intentP = e.m(e.b.f332927b, null).p();
        PendingIntent pendingIntent = this.f332795e;
        if (pendingIntent == null) {
            setResult(0, intentP);
            net.openid.appauth.internal.a.a("No cancel intent set - will return to previous activity", new Object[0]);
        } else {
            try {
                pendingIntent.send(this, 0, intentP);
            } catch (PendingIntent.CanceledException e10) {
                net.openid.appauth.internal.a.c("Failed to send cancel intent", e10);
            }
        }
    }

    private void h() {
        Uri data = getIntent().getData();
        Intent intentE = e(data);
        if (intentE == null) {
            net.openid.appauth.internal.a.c("Failed to extract OAuth2 response from redirect", new Object[0]);
            return;
        }
        intentE.setData(data);
        if (this.f332794d == null) {
            setResult(-1, intentE);
            return;
        }
        net.openid.appauth.internal.a.a("Authorization complete - invoking completion intent", new Object[0]);
        try {
            this.f332794d.send(this, 0, intentE);
        } catch (PendingIntent.CanceledException e10) {
            net.openid.appauth.internal.a.c("Failed to send completion intent", e10);
        }
    }

    @Override // android.app.Activity
    protected void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (bundle == null) {
            f(getIntent().getExtras());
        } else {
            f(bundle);
        }
    }

    @Override // android.app.Activity
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        setIntent(intent);
    }

    @Override // android.app.Activity
    protected void onResume() {
        super.onResume();
        if (!this.f332791a) {
            startActivity(this.f332792b);
            this.f332791a = true;
        } else {
            if (getIntent().getData() != null) {
                h();
            } else {
                g();
            }
            finish();
        }
    }

    @Override // android.app.Activity
    protected void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean(f332790j, this.f332791a);
        bundle.putParcelable(f332786f, this.f332792b);
        bundle.putString(f332787g, this.f332793c.i());
        bundle.putParcelable(f332788h, this.f332794d);
        bundle.putParcelable(f332789i, this.f332795e);
    }
}

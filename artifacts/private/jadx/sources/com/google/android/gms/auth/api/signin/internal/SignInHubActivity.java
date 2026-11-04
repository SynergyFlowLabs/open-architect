package com.google.android.gms.auth.api.signin.internal;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.os.Bundle;
import android.view.accessibility.AccessibilityEvent;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.SignInAccount;
import com.google.android.gms.common.annotation.KeepName;
import com.google.android.gms.common.api.Status;

/* JADX INFO: loaded from: classes4.dex */
@KeepName
public class SignInHubActivity extends androidx.fragment.app.s {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static boolean f105662f;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f105663a = false;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private SignInConfiguration f105664b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f105665c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f105666d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Intent f105667e;

    private final void E() {
        getSupportLoaderManager().g(0, null, new y(this, null));
        f105662f = false;
    }

    private final void F(int i10) {
        Status status = new Status(i10);
        Intent intent = new Intent();
        intent.putExtra("googleSignInStatus", status);
        setResult(0, intent);
        finish();
        f105662f = false;
    }

    private final void G(String str) {
        Intent intent = new Intent(str);
        if (str.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN")) {
            intent.setPackage("com.google.android.gms");
        } else {
            intent.setPackage(getPackageName());
        }
        intent.putExtra("config", this.f105664b);
        try {
            startActivityForResult(intent, 40962);
        } catch (ActivityNotFoundException unused) {
            this.f105663a = true;
            F(17);
        }
    }

    @Override // android.app.Activity, android.view.Window.Callback
    public final boolean dispatchPopulateAccessibilityEvent(@NonNull AccessibilityEvent accessibilityEvent) {
        return true;
    }

    @Override // androidx.fragment.app.s, androidx.activity.l, android.app.Activity
    protected final void onActivityResult(int i10, int i11, @p0 Intent intent) {
        if (this.f105663a) {
            return;
        }
        setResult(0);
        if (i10 != 40962) {
            return;
        }
        if (intent != null) {
            SignInAccount signInAccount = (SignInAccount) intent.getParcelableExtra(com.google.android.gms.auth.api.signin.b.f105647a);
            if (signInAccount != null && signInAccount.O1() != null) {
                GoogleSignInAccount googleSignInAccountO1 = signInAccount.O1();
                if (googleSignInAccountO1 == null) {
                    F(com.google.android.gms.auth.api.signin.f.f105654t);
                    return;
                }
                q.c(this).e(this.f105664b.O1(), googleSignInAccountO1);
                intent.removeExtra(com.google.android.gms.auth.api.signin.b.f105647a);
                intent.putExtra("googleSignInAccount", googleSignInAccountO1);
                this.f105665c = true;
                this.f105666d = i11;
                this.f105667e = intent;
                E();
                return;
            }
            if (intent.hasExtra("errorCode")) {
                int intExtra = intent.getIntExtra("errorCode", 8);
                if (intExtra == 13) {
                    intExtra = com.google.android.gms.auth.api.signin.f.f105655u;
                }
                F(intExtra);
                return;
            }
        }
        F(8);
    }

    @Override // androidx.fragment.app.s, androidx.activity.l, androidx.core.app.m, android.app.Activity
    protected final void onCreate(@p0 Bundle bundle) {
        super.onCreate(bundle);
        Intent intent = getIntent();
        String action = intent.getAction();
        if (action == null) {
            F(com.google.android.gms.auth.api.signin.f.f105654t);
            return;
        }
        if (action.equals("com.google.android.gms.auth.NO_IMPL")) {
            F(com.google.android.gms.auth.api.signin.f.f105654t);
            return;
        }
        if (!action.equals("com.google.android.gms.auth.GOOGLE_SIGN_IN") && !action.equals("com.google.android.gms.auth.APPAUTH_SIGN_IN")) {
            "Unknown action: ".concat(String.valueOf(intent.getAction()));
            finish();
            return;
        }
        Bundle bundleExtra = intent.getBundleExtra("config");
        if (bundleExtra == null) {
            setResult(0);
            finish();
            return;
        }
        SignInConfiguration signInConfiguration = (SignInConfiguration) bundleExtra.getParcelable("config");
        if (signInConfiguration == null) {
            setResult(0);
            finish();
            return;
        }
        this.f105664b = signInConfiguration;
        if (bundle == null) {
            if (f105662f) {
                setResult(0);
                F(com.google.android.gms.auth.api.signin.f.f105656v);
                return;
            } else {
                f105662f = true;
                G(action);
                return;
            }
        }
        boolean z10 = bundle.getBoolean("signingInGoogleApiClients");
        this.f105665c = z10;
        if (z10) {
            this.f105666d = bundle.getInt("signInResultCode");
            Intent intent2 = (Intent) bundle.getParcelable("signInResultData");
            if (intent2 == null) {
                setResult(0);
                finish();
            } else {
                this.f105667e = intent2;
                E();
            }
        }
    }

    @Override // androidx.fragment.app.s, android.app.Activity
    public final void onDestroy() {
        super.onDestroy();
        f105662f = false;
    }

    @Override // androidx.activity.l, androidx.core.app.m, android.app.Activity
    protected final void onSaveInstanceState(@NonNull Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("signingInGoogleApiClients", this.f105665c);
        if (this.f105665c) {
            bundle.putInt("signInResultCode", this.f105666d);
            bundle.putParcelable("signInResultData", this.f105667e);
        }
    }
}

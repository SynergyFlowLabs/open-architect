package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.content.SharedPreferences;
import android.text.TextUtils;
import androidx.annotation.NonNull;
import androidx.annotation.l1;
import androidx.annotation.p0;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;
import org.json.JSONException;

/* JADX INFO: loaded from: classes4.dex */
@g6.a
public class b {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Lock f105669c = new ReentrantLock();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @p0
    private static b f105670d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Lock f105671a = new ReentrantLock();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final SharedPreferences f105672b;

    @l1
    b(Context context) {
        this.f105672b = context.getSharedPreferences("com.google.android.gms.signin", 0);
    }

    @NonNull
    @g6.a
    public static b b(@NonNull Context context) {
        com.google.android.gms.common.internal.w.r(context);
        Lock lock = f105669c;
        lock.lock();
        try {
            if (f105670d == null) {
                f105670d = new b(context.getApplicationContext());
            }
            b bVar = f105670d;
            lock.unlock();
            return bVar;
        } catch (Throwable th2) {
            f105669c.unlock();
            throw th2;
        }
    }

    private static final String k(String str, String str2) {
        return str + ":" + str2;
    }

    @g6.a
    public void a() {
        this.f105671a.lock();
        try {
            this.f105672b.edit().clear().apply();
        } finally {
            this.f105671a.unlock();
        }
    }

    @p0
    @g6.a
    public GoogleSignInAccount c() {
        String strG;
        String strG2 = g("defaultGoogleSignInAccount");
        if (!TextUtils.isEmpty(strG2) && (strG = g(k("googleSignInAccount", strG2))) != null) {
            try {
                return GoogleSignInAccount.h3(strG);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    @p0
    @g6.a
    public GoogleSignInOptions d() {
        String strG = g("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(strG)) {
            return null;
        }
        String strG2 = g(k("googleSignInOptions", strG));
        if (strG2 != null) {
            try {
                return GoogleSignInOptions.u2(strG2);
            } catch (JSONException unused) {
            }
        }
        return null;
    }

    @p0
    @g6.a
    public String e() {
        return g("refreshToken");
    }

    @g6.a
    public void f(@NonNull GoogleSignInAccount googleSignInAccount, @NonNull GoogleSignInOptions googleSignInOptions) {
        com.google.android.gms.common.internal.w.r(googleSignInAccount);
        com.google.android.gms.common.internal.w.r(googleSignInOptions);
        j("defaultGoogleSignInAccount", googleSignInAccount.k3());
        com.google.android.gms.common.internal.w.r(googleSignInAccount);
        com.google.android.gms.common.internal.w.r(googleSignInOptions);
        String strK3 = googleSignInAccount.k3();
        j(k("googleSignInAccount", strK3), googleSignInAccount.r3());
        j(k("googleSignInOptions", strK3), googleSignInOptions.U2());
    }

    @p0
    protected final String g(@NonNull String str) {
        this.f105671a.lock();
        try {
            String string = this.f105672b.getString(str, null);
            this.f105671a.unlock();
            return string;
        } catch (Throwable th2) {
            this.f105671a.unlock();
            throw th2;
        }
    }

    protected final void h(@NonNull String str) {
        this.f105671a.lock();
        try {
            this.f105672b.edit().remove(str).apply();
        } finally {
            this.f105671a.unlock();
        }
    }

    public final void i() {
        String strG = g("defaultGoogleSignInAccount");
        h("defaultGoogleSignInAccount");
        if (TextUtils.isEmpty(strG)) {
            return;
        }
        h(k("googleSignInAccount", strG));
        h(k("googleSignInOptions", strG));
    }

    protected final void j(@NonNull String str, @NonNull String str2) {
        this.f105671a.lock();
        try {
            this.f105672b.edit().putString(str, str2).apply();
            this.f105671a.unlock();
        } catch (Throwable th2) {
            this.f105671a.unlock();
            throw th2;
        }
    }
}

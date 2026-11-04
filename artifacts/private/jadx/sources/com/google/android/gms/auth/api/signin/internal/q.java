package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.l1;
import androidx.annotation.p0;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

/* JADX INFO: loaded from: classes4.dex */
public final class q {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @p0
    private static q f105687d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @l1
    final b f105688a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @l1
    @p0
    GoogleSignInAccount f105689b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @l1
    @p0
    GoogleSignInOptions f105690c;

    private q(Context context) {
        b bVarB = b.b(context);
        this.f105688a = bVarB;
        this.f105689b = bVarB.c();
        this.f105690c = bVarB.d();
    }

    public static synchronized q c(@NonNull Context context) {
        return f(context.getApplicationContext());
    }

    private static synchronized q f(Context context) {
        q qVar = f105687d;
        if (qVar != null) {
            return qVar;
        }
        q qVar2 = new q(context);
        f105687d = qVar2;
        return qVar2;
    }

    @p0
    public final synchronized GoogleSignInAccount a() {
        return this.f105689b;
    }

    @p0
    public final synchronized GoogleSignInOptions b() {
        return this.f105690c;
    }

    public final synchronized void d() {
        try {
            this.f105688a.a();
            this.f105689b = null;
            this.f105690c = null;
        } catch (Throwable th2) {
            throw th2;
        }
    }

    public final synchronized void e(GoogleSignInOptions googleSignInOptions, GoogleSignInAccount googleSignInAccount) {
        try {
            this.f105688a.f(googleSignInAccount, googleSignInOptions);
            this.f105689b = googleSignInAccount;
            this.f105690c = googleSignInOptions;
        } catch (Throwable th2) {
            throw th2;
        }
    }
}

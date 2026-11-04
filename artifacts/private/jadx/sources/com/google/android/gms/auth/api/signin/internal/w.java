package com.google.android.gms.auth.api.signin.internal;

import android.content.Context;
import android.os.Binder;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;
import com.google.android.gms.common.util.c0;

/* JADX INFO: loaded from: classes4.dex */
public final class w extends r {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Context f105691a;

    public w(Context context) {
        this.f105691a = context;
    }

    private final void k() {
        if (c0.a(this.f105691a, Binder.getCallingUid())) {
            return;
        }
        throw new SecurityException("Calling UID " + Binder.getCallingUid() + " is not Google Play services.");
    }

    @Override // com.google.android.gms.auth.api.signin.internal.s
    public final void T1() {
        k();
        q.c(this.f105691a).d();
    }

    @Override // com.google.android.gms.auth.api.signin.internal.s
    public final void w2() {
        k();
        b bVarB = b.b(this.f105691a);
        GoogleSignInAccount googleSignInAccountC = bVarB.c();
        GoogleSignInOptions googleSignInOptionsD = GoogleSignInOptions.f105616l;
        if (googleSignInAccountC != null) {
            googleSignInOptionsD = bVarB.d();
        }
        com.google.android.gms.auth.api.signin.c cVarD = com.google.android.gms.auth.api.signin.a.d(this.f105691a, googleSignInOptionsD);
        if (googleSignInAccountC != null) {
            cVarD.L0();
        } else {
            cVarD.g0();
        }
    }
}

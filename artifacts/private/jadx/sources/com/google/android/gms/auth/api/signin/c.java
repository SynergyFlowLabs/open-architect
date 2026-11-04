package com.google.android.gms.auth.api.signin;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import androidx.annotation.NonNull;
import androidx.annotation.l1;
import com.google.android.gms.auth.api.signin.internal.p;
import com.google.android.gms.common.api.internal.z;
import com.google.android.gms.common.internal.v;
import com.google.android.gms.dynamite.DynamiteModule;
import com.google.android.gms.tasks.Task;

/* JADX INFO: loaded from: classes4.dex */
@Deprecated
public class c extends com.google.android.gms.common.api.k<GoogleSignInOptions> {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final l f105648n = new l(null);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @l1
    static int f105649o = 1;

    c(@NonNull Activity activity, GoogleSignInOptions googleSignInOptions) {
        super(activity, com.google.android.gms.auth.api.a.f105077b, googleSignInOptions, (z) new com.google.android.gms.common.api.internal.b());
    }

    private final synchronized int N0() {
        int i10;
        try {
            i10 = f105649o;
            if (i10 == 1) {
                Context contextA0 = A0();
                com.google.android.gms.common.f fVarX = com.google.android.gms.common.f.x();
                int iK = fVarX.k(contextA0, 12451000);
                if (iK == 0) {
                    i10 = 4;
                    f105649o = 4;
                } else if (fVarX.e(contextA0, iK, null) != null || DynamiteModule.a(contextA0, "com.google.android.gms.auth.api.fallback") == 0) {
                    i10 = 2;
                    f105649o = 2;
                } else {
                    i10 = 3;
                    f105649o = 3;
                }
            }
        } finally {
        }
        return i10;
    }

    @NonNull
    public Intent K0() {
        Context contextA0 = A0();
        int iN0 = N0();
        int i10 = iN0 - 1;
        if (iN0 == 0) {
            throw null;
        }
        if (i10 != 2) {
            return i10 != 3 ? p.b(contextA0, z0()) : p.c(contextA0, z0());
        }
        return p.a(contextA0, z0());
    }

    @NonNull
    public Task<Void> L0() {
        return v.c(p.f(l0(), A0(), N0() == 3));
    }

    @NonNull
    public Task<GoogleSignInAccount> M0() {
        return v.b(p.e(l0(), A0(), z0(), N0() == 3), f105648n);
    }

    @NonNull
    public Task<Void> g0() {
        return v.c(p.g(l0(), A0(), N0() == 3));
    }

    c(@NonNull Context context, GoogleSignInOptions googleSignInOptions) {
        super(context, com.google.android.gms.auth.api.a.f105077b, googleSignInOptions, new com.google.android.gms.common.api.k.a.C0970a().c(new com.google.android.gms.common.api.internal.b()).a());
    }
}

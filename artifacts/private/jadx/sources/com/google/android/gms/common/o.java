package com.google.android.gms.common;

import android.content.Context;
import androidx.annotation.NonNull;
import androidx.annotation.l1;
import io.intercom.android.sdk.tickets.create.model.CreateTicketViewModelKt;

/* JADX INFO: loaded from: classes4.dex */
@com.google.android.gms.common.internal.a0
@g6.a
public class o {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.p0
    private static k0 f106798a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @l1
    @androidx.annotation.p0
    static volatile j0 f106799b;

    private static k0 c(Context context) {
        k0 k0Var;
        synchronized (o.class) {
            try {
                if (f106798a == null) {
                    f106798a = new k0(context);
                }
                k0Var = f106798a;
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return k0Var;
    }

    @NonNull
    @com.google.android.gms.common.internal.a0
    @g6.a
    public p a(@NonNull Context context, @NonNull String str) {
        boolean zK = k.k(context);
        c(context);
        if (!b1.e()) {
            throw new l0();
        }
        String strConcat = String.valueOf(str).concat(true != zK ? "-0" : CreateTicketViewModelKt.EmailId);
        if (f106799b != null && f106799b.f106702a.equals(strConcat)) {
            return f106799b.f106703b;
        }
        c(context);
        f1 f1Var = new f1(null);
        f1Var.c(str);
        f1Var.a(zK);
        f1Var.b(false);
        e0 e0VarB = b1.b(f1Var.d());
        if (e0VarB.f106397a) {
            f106799b = new j0(strConcat, p.d(str, e0VarB.f106401e));
            return f106799b.f106703b;
        }
        com.google.android.gms.common.internal.w.r(e0VarB.f106398b);
        return p.a(str, e0VarB.f106398b, e0VarB.f106399c);
    }

    @NonNull
    @com.google.android.gms.common.internal.a0
    @g6.a
    public p b(@NonNull Context context, @NonNull String str) {
        try {
            p pVarA = a(context, str);
            pVarA.b();
            return pVarA;
        } catch (SecurityException unused) {
            p pVarA2 = a(context, str);
            pVarA2.c();
            return pVarA2;
        }
    }
}

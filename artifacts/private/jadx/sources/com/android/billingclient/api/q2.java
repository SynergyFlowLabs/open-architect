package com.android.billingclient.api;

import com.google.android.gms.internal.play_billing.aa;
import com.google.android.gms.internal.play_billing.ba;
import com.google.android.gms.internal.play_billing.fa;
import com.google.android.gms.internal.play_billing.t9;
import com.google.android.gms.internal.play_billing.v9;
import com.google.android.gms.internal.play_billing.y9;

/* JADX INFO: loaded from: classes3.dex */
public final /* synthetic */ class q2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final /* synthetic */ int f89223a = 0;

    static {
        int i10 = r2.f89229a;
    }

    @androidx.annotation.p0
    public static String a(Exception exc) {
        if (exc == null) {
            return null;
        }
        try {
            String str = exc.getClass().getSimpleName() + ":" + com.google.android.gms.internal.play_billing.h0.b(exc.getMessage());
            int i10 = com.google.android.gms.internal.play_billing.p3.f109248a;
            return str.length() > 40 ? str.substring(0, 40) : str;
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.p3.m("BillingLogger", "Unable to get truncated exception info", th2);
            return null;
        }
    }

    @androidx.annotation.p0
    public static v9 b(int i10, int i11, n nVar) {
        try {
            t9 t9VarH = v9.H();
            ba baVarH = fa.H();
            baVarH.t(nVar.b());
            baVarH.s(nVar.a());
            baVarH.u(i10);
            t9VarH.r(baVarH);
            t9VarH.t(i11);
            return (v9) t9VarH.n();
        } catch (Exception e10) {
            com.google.android.gms.internal.play_billing.p3.m("BillingLogger", "Unable to create logging payload", e10);
            return null;
        }
    }

    @androidx.annotation.p0
    public static v9 c(int i10, int i11, n nVar, @androidx.annotation.p0 String str) {
        try {
            ba baVarH = fa.H();
            baVarH.t(nVar.b());
            baVarH.s(nVar.a());
            baVarH.u(i10);
            if (str != null) {
                baVarH.r(str);
            }
            t9 t9VarH = v9.H();
            t9VarH.r(baVarH);
            t9VarH.t(i11);
            return (v9) t9VarH.n();
        } catch (Throwable th2) {
            com.google.android.gms.internal.play_billing.p3.m("BillingLogger", "Unable to create logging payload", th2);
            return null;
        }
    }

    @androidx.annotation.p0
    public static aa d(int i10) {
        try {
            y9 y9VarG = aa.G();
            y9VarG.t(i10);
            return (aa) y9VarG.n();
        } catch (Exception e10) {
            com.google.android.gms.internal.play_billing.p3.m("BillingLogger", "Unable to create logging payload", e10);
            return null;
        }
    }
}

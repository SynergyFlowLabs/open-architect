package com.google.android.gms.measurement.internal;

import android.util.Log;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
final class t5 implements Runnable {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final /* synthetic */ int f110516a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final /* synthetic */ String f110517b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    final /* synthetic */ Object f110518c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final /* synthetic */ Object f110519d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    final /* synthetic */ Object f110520e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final /* synthetic */ w5 f110521f;

    t5(w5 w5Var, int i10, String str, Object obj, Object obj2, Object obj3) {
        this.f110516a = i10;
        this.f110517b = str;
        this.f110518c = obj;
        this.f110519d = obj2;
        this.f110520e = obj3;
        Objects.requireNonNull(w5Var);
        this.f110521f = w5Var;
    }

    @Override // java.lang.Runnable
    public final void run() {
        w5 w5Var = this.f110521f;
        k6 k6VarX = w5Var.f110184a.x();
        if (!k6VarX.k()) {
            Log.println(6, w5Var.z(), "Persisted config not initialized. Not logging error/warn");
            return;
        }
        if (w5Var.D() == 0) {
            h7 h7Var = w5Var.f110184a;
            if (h7Var.w().B()) {
                h7Var.c();
                w5Var.E('C');
            } else {
                h7Var.c();
                w5Var.E('c');
            }
        }
        if (w5Var.F() < 0) {
            w5Var.f110184a.w().A();
            w5Var.G(133005L);
        }
        int i10 = this.f110516a;
        char cD = w5Var.D();
        long jF = w5Var.F();
        String str = this.f110517b;
        Object obj = this.f110518c;
        Object obj2 = this.f110519d;
        Object obj3 = this.f110520e;
        char cCharAt = "01VDIWEA?".charAt(i10);
        String strA = w5.A(true, str, obj, obj2, obj3);
        int length = String.valueOf(cCharAt).length();
        StringBuilder sb2 = new StringBuilder(length + 1 + String.valueOf(cD).length() + String.valueOf(jF).length() + 1 + strA.length());
        sb2.append("2");
        sb2.append(cCharAt);
        sb2.append(cD);
        sb2.append(jF);
        sb2.append(":");
        sb2.append(strA);
        String string = sb2.toString();
        if (string.length() > 1024) {
            string = str.substring(0, 1024);
        }
        i6 i6Var = k6VarX.f110160e;
        if (i6Var != null) {
            i6Var.a(string, 1L);
        }
    }
}

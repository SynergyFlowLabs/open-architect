package com.google.android.gms.internal.auth;

import android.os.Binder;

/* JADX INFO: loaded from: classes4.dex */
public final /* synthetic */ class f1 {
    public static Object a(g1 g1Var) {
        try {
            return g1Var.a();
        } catch (SecurityException unused) {
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                Object objA = g1Var.a();
                Binder.restoreCallingIdentity(jClearCallingIdentity);
                return objA;
            } catch (Throwable th2) {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
                throw th2;
            }
        }
    }
}

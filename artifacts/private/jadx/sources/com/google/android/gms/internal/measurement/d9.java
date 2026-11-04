package com.google.android.gms.internal.measurement;

import android.os.Binder;

/* JADX INFO: loaded from: classes4.dex */
interface d9 {
    static Object b(c9 c9Var) {
        try {
            return c9Var.a();
        } catch (SecurityException unused) {
            long jClearCallingIdentity = Binder.clearCallingIdentity();
            try {
                Object objA = c9Var.a();
                Binder.restoreCallingIdentity(jClearCallingIdentity);
                return objA;
            } catch (Throwable th2) {
                Binder.restoreCallingIdentity(jClearCallingIdentity);
                throw th2;
            }
        }
    }

    @androidx.annotation.p0
    Object a(String str);
}

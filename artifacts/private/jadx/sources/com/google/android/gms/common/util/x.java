package com.google.android.gms.common.util;

import android.app.Application;
import android.os.Process;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes4.dex */
@g6.a
public class x {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @fj.h
    private static String f106976a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static int f106977b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @fj.h
    private static Boolean f106978c;

    private x() {
    }

    @p0
    @g6.a
    public static String a() {
        if (f106976a == null) {
            f106976a = Application.getProcessName();
        }
        return f106976a;
    }

    public static boolean b() {
        Boolean boolValueOf = f106978c;
        if (boolValueOf == null) {
            if (v.o()) {
                boolValueOf = Boolean.valueOf(Process.isIsolated());
            } else {
                try {
                    Object objA = com.google.android.gms.internal.common.b0.a(Process.class, "isIsolated", new com.google.android.gms.internal.common.z[0]);
                    Object[] objArr = new Object[0];
                    if (objA == null) {
                        throw new com.google.android.gms.internal.common.d(com.google.android.gms.internal.common.c.a("expected a non-null reference", objArr));
                    }
                    boolValueOf = (Boolean) objA;
                } catch (ReflectiveOperationException unused) {
                    boolValueOf = Boolean.FALSE;
                }
            }
            f106978c = boolValueOf;
        }
        return boolValueOf.booleanValue();
    }
}

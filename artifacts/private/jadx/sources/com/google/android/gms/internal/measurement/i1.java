package com.google.android.gms.internal.measurement;

import android.content.Context;
import android.content.SharedPreferences;

/* JADX INFO: loaded from: classes4.dex */
public final class i1 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final ThreadLocal f108559a = new h1();

    public static SharedPreferences a(Context context, String str, int i10, d1 d1Var) {
        x0.a();
        g1 g1Var = str.equals("") ? new g1() : null;
        if (g1Var != null) {
            return g1Var;
        }
        ThreadLocal threadLocal = f108559a;
        com.google.common.base.j0.d(((Boolean) threadLocal.get()).booleanValue());
        threadLocal.set(Boolean.FALSE);
        try {
            return context.getSharedPreferences(str, 0);
        } finally {
            f108559a.set(Boolean.TRUE);
        }
    }
}

package com.google.vr.ndk.base;

import android.content.Context;

/* JADX INFO: loaded from: classes5.dex */
public class g0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final String f127079a = "SdkConfigurationReader";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final com.google.common.logging.nano.a.C1088a.m f127080b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static com.google.common.logging.nano.a.C1088a.m f127081c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final com.google.common.logging.nano.a.C1088a.m f127082d;

    static {
        com.google.common.logging.nano.a.C1088a.m mVar = new com.google.common.logging.nano.a.C1088a.m();
        f127080b = mVar;
        Boolean bool = Boolean.TRUE;
        mVar.f119285d = bool;
        mVar.f119286e = bool;
        mVar.f119293l = bool;
        mVar.f119287f = bool;
        mVar.f119288g = bool;
        mVar.f119289h = 1;
        mVar.f119290i = new com.google.common.logging.nano.a.C1088a.m.C1100a();
        mVar.f119291j = bool;
        mVar.f119292k = bool;
        mVar.f119294m = bool;
        mVar.f119295n = bool;
        mVar.f119301v = bool;
        mVar.f119296o = bool;
        mVar.f119299s = bool;
        mVar.f119302w = new com.google.common.logging.nano.a.C1088a.m.c();
        mVar.Y = bool;
        mVar.X = bool;
        mVar.Z = bool;
        mVar.f119297p0 = bool;
        mVar.f119298p1 = bool;
        com.google.common.logging.nano.a.C1088a.m mVar2 = new com.google.common.logging.nano.a.C1088a.m();
        f127082d = mVar2;
        Boolean bool2 = Boolean.FALSE;
        mVar2.f119285d = bool2;
        mVar2.f119286e = bool2;
        mVar2.f119293l = bool2;
        mVar2.f119287f = bool2;
        mVar2.f119288g = bool2;
        mVar2.f119289h = 3;
        mVar2.f119290i = null;
        mVar2.f119291j = bool2;
        mVar2.f119292k = bool2;
        mVar2.f119294m = bool2;
        mVar2.f119295n = bool2;
        mVar2.f119301v = bool2;
        mVar2.f119296o = bool2;
        mVar2.f119299s = bool2;
        mVar2.f119302w = null;
        mVar2.Y = bool2;
        mVar2.X = bool2;
        mVar2.Z = bool2;
        mVar2.f119297p0 = bool2;
        mVar2.f119298p1 = bool;
    }

    public static com.google.common.logging.nano.a.C1088a.m a(Context context) {
        synchronized (g0.class) {
            try {
                com.google.common.logging.nano.a.C1088a.m mVar = f127081c;
                if (mVar != null) {
                    return mVar;
                }
                com.google.vr.cardboard.a0 a0VarA = com.google.vr.cardboard.b0.a(context);
                com.google.common.logging.nano.a.C1088a.m mVarB = b(a0VarA);
                synchronized (g0.class) {
                    try {
                        f127081c = mVarB;
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                a0VarA.close();
                return f127081c;
            } catch (Throwable th3) {
                throw th3;
            }
        }
    }

    private static com.google.common.logging.nano.a.C1088a.m b(com.google.vr.cardboard.a0 a0Var) {
        com.google.vr.sdk.proto.nano.d.a aVar = new com.google.vr.sdk.proto.nano.d.a();
        aVar.f129941d = f127080b;
        aVar.f129940c = "1.190.0";
        com.google.common.logging.nano.a.C1088a.m mVarE = a0Var.e(aVar);
        if (mVarE == null) {
            return f127082d;
        }
        new StringBuilder(String.valueOf(mVarE).length() + 38);
        return mVarE;
    }
}

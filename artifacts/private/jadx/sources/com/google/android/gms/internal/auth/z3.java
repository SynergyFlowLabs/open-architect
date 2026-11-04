package com.google.android.gms.internal.auth;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes4.dex */
public final class z3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final Charset f107902a = Charset.forName("US-ASCII");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    static final Charset f107903b = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    static final Charset f107904c = Charset.forName("ISO-8859-1");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final byte[] f107905d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final ByteBuffer f107906e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final h3 f107907f;

    static {
        byte[] bArr = new byte[0];
        f107905d = bArr;
        f107906e = ByteBuffer.wrap(bArr);
        int i10 = h3.f107649b;
        f3 f3Var = new f3(bArr, 0, 0, false, null);
        try {
            f3Var.c(0);
            f107907f = f3Var;
        } catch (a4 e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    public static int a(boolean z10) {
        return z10 ? 1231 : 1237;
    }

    static int b(int i10, byte[] bArr, int i11, int i12) {
        for (int i13 = 0; i13 < i12; i13++) {
            i10 = (i10 * 31) + bArr[i13];
        }
        return i10;
    }

    static Object c(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("messageType");
    }

    public static String d(byte[] bArr) {
        return new String(bArr, f107903b);
    }
}

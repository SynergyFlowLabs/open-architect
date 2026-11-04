package com.google.vr.sdk.deps;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes5.dex */
public final class k3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final Charset f129468a = Charset.forName("UTF-8");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f129469b;

    static {
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f129469b = bArr;
        ByteBuffer.wrap(bArr);
        x5.m(bArr);
    }

    static int a(int i10, byte[] bArr, int i11, int i12) {
        for (int i13 = i11; i13 < i11 + i12; i13++) {
            i10 = (i10 * 31) + bArr[i13];
        }
        return i10;
    }

    public static int b(long j10) {
        return (int) (j10 ^ (j10 >>> 32));
    }

    public static int c(boolean z10) {
        return z10 ? 1231 : 1237;
    }

    static <T> T d(T t10) {
        t10.getClass();
        return t10;
    }

    static Object e(Object obj, Object obj2) {
        return ((t4) obj).r1().Ik((t4) obj2).B1();
    }

    static <T> T f(T t10, String str) {
        if (t10 != null) {
            return t10;
        }
        throw new NullPointerException(str);
    }

    static boolean g(t4 t4Var) {
        return false;
    }

    public static boolean h(byte[] bArr) {
        return i6.g(bArr);
    }

    public static String i(byte[] bArr) {
        return new String(bArr, f129468a);
    }

    public static int j(byte[] bArr) {
        int length = bArr.length;
        int iA = a(length, bArr, 0, length);
        if (iA == 0) {
            iA = 1;
        }
        return iA;
    }
}

package com.google.android.gms.internal.measurement;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes4.dex */
public final class ac {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final Charset f108280a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f108281b;

    static {
        Charset.forName("US-ASCII");
        f108280a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f108281b = bArr;
        ByteBuffer.wrap(bArr);
        int i10 = ta.f108878b;
        try {
            new sa(bArr, 0, 0, false, null).c(0);
        } catch (cc e10) {
            throw new IllegalArgumentException(e10);
        }
    }

    static Object a(Object obj, String str) {
        if (obj != null) {
            return obj;
        }
        throw new NullPointerException("messageType");
    }

    public static int b(boolean z10) {
        return z10 ? 1231 : 1237;
    }

    static int c(int i10, byte[] bArr, int i11, int i12) {
        for (int i13 = 0; i13 < i12; i13++) {
            i10 = (i10 * 31) + bArr[i13];
        }
        return i10;
    }

    static boolean d(yc ycVar) {
        if (ycVar instanceof ca) {
            throw null;
        }
        return false;
    }
}

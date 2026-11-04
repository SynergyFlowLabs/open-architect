package com.google.android.gms.internal.play_billing;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes4.dex */
public final class j7 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    static final Charset f109151a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final byte[] f109152b;

    static {
        Charset.forName("US-ASCII");
        f109151a = Charset.forName("UTF-8");
        Charset.forName("ISO-8859-1");
        byte[] bArr = new byte[0];
        f109152b = bArr;
        ByteBuffer.wrap(bArr);
        int i10 = g6.f109134b;
        try {
            new e6(bArr, 0, 0, false, null).c(0);
        } catch (l7 e10) {
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
}

package com.google.android.gms.internal.fido;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
public abstract class h0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final h0 f108014a = new f0("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/", '=');

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final h0 f108015b = new f0("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_", '=');

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final h0 f108016c = new g0("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", '=');

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final h0 f108017d = new g0("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", '=');

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final h0 f108018e = new e0("base16()", "0123456789ABCDEF");

    h0() {
    }

    public static h0 c() {
        return f108018e;
    }

    abstract void a(Appendable appendable, byte[] bArr, int i10, int i11) throws IOException;

    abstract int b(int i10);

    public final String d(byte[] bArr, int i10, int i11) {
        n.e(0, i11, bArr.length);
        StringBuilder sb2 = new StringBuilder(b(i11));
        try {
            a(sb2, bArr, 0, i11);
            return sb2.toString();
        } catch (IOException e10) {
            throw new AssertionError(e10);
        }
    }
}

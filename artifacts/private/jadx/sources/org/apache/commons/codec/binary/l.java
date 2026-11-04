package org.apache.commons.codec.binary;

import java.nio.ByteBuffer;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes9.dex */
public class l implements nk.b, nk.a {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final String f335226c = "UTF-8";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Charset f335229a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final Charset f335225b = nk.d.f333413f;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final char[] f335227d = {org.locationtech.jts.geom.l.f338160j, org.locationtech.jts.geom.l.f338161k, org.locationtech.jts.geom.l.f338162l, '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', ni.f.f333369f, 'e', 'f'};

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final char[] f335228e = {org.locationtech.jts.geom.l.f338160j, org.locationtech.jts.geom.l.f338161k, org.locationtech.jts.geom.l.f338162l, '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', org.locationtech.jts.geom.l.f338157g};

    public l() {
        this.f335229a = f335225b;
    }

    public static byte[] h(String str) throws nk.f {
        return i(str.toCharArray());
    }

    public static byte[] i(char[] cArr) throws nk.f {
        int length = cArr.length;
        if ((length & 1) != 0) {
            throw new nk.f("Odd number of characters.");
        }
        byte[] bArr = new byte[length >> 1];
        int i10 = 0;
        int i11 = 0;
        while (i10 < length) {
            int i12 = i10 + 1;
            int iW = (w(cArr[i10], i10) << 4) | w(cArr[i12], i12);
            i10 += 2;
            bArr[i11] = (byte) (iW & 255);
            i11++;
        }
        return bArr;
    }

    public static char[] k(ByteBuffer byteBuffer) {
        return l(byteBuffer, true);
    }

    public static char[] l(ByteBuffer byteBuffer, boolean z10) {
        return m(byteBuffer, z10 ? f335227d : f335228e);
    }

    protected static char[] m(ByteBuffer byteBuffer, char[] cArr) {
        return p(byteBuffer.array(), cArr);
    }

    public static char[] n(byte[] bArr) {
        return o(bArr, true);
    }

    public static char[] o(byte[] bArr, boolean z10) {
        return p(bArr, z10 ? f335227d : f335228e);
    }

    protected static char[] p(byte[] bArr, char[] cArr) {
        char[] cArr2 = new char[bArr.length << 1];
        int i10 = 0;
        for (byte b10 : bArr) {
            int i11 = i10 + 1;
            cArr2[i10] = cArr[(b10 & 240) >>> 4];
            i10 += 2;
            cArr2[i11] = cArr[b10 & com.google.common.base.c.f116464q];
        }
        return cArr2;
    }

    public static String q(ByteBuffer byteBuffer) {
        return new String(k(byteBuffer));
    }

    public static String r(ByteBuffer byteBuffer, boolean z10) {
        return new String(l(byteBuffer, z10));
    }

    public static String s(byte[] bArr) {
        return new String(n(bArr));
    }

    public static String t(byte[] bArr, boolean z10) {
        return new String(o(bArr, z10));
    }

    protected static int w(char c10, int i10) throws nk.f {
        int iDigit = Character.digit(c10, 16);
        if (iDigit != -1) {
            return iDigit;
        }
        throw new nk.f("Illegal hexadecimal character " + c10 + " at index " + i10);
    }

    @Override // nk.g
    public Object a(Object obj) throws nk.h {
        byte[] bArrArray;
        if (obj instanceof String) {
            bArrArray = ((String) obj).getBytes(u());
        } else if (obj instanceof ByteBuffer) {
            bArrArray = ((ByteBuffer) obj).array();
        } else {
            try {
                bArrArray = (byte[]) obj;
            } catch (ClassCastException e10) {
                throw new nk.h(e10.getMessage(), e10);
            }
        }
        return n(bArrArray);
    }

    @Override // nk.e
    public Object b(Object obj) throws nk.f {
        if (obj instanceof String) {
            return b(((String) obj).toCharArray());
        }
        if (obj instanceof byte[]) {
            return d((byte[]) obj);
        }
        if (obj instanceof ByteBuffer) {
            return g((ByteBuffer) obj);
        }
        try {
            return i((char[]) obj);
        } catch (ClassCastException e10) {
            throw new nk.f(e10.getMessage(), e10);
        }
    }

    @Override // nk.a
    public byte[] d(byte[] bArr) throws nk.f {
        return i(new String(bArr, u()).toCharArray());
    }

    @Override // nk.b
    public byte[] e(byte[] bArr) {
        return s(bArr).getBytes(u());
    }

    public byte[] g(ByteBuffer byteBuffer) throws nk.f {
        return i(new String(byteBuffer.array(), u()).toCharArray());
    }

    public byte[] j(ByteBuffer byteBuffer) {
        return q(byteBuffer).getBytes(u());
    }

    public String toString() {
        return super.toString() + "[charsetName=" + this.f335229a + "]";
    }

    public Charset u() {
        return this.f335229a;
    }

    public String v() {
        return this.f335229a.name();
    }

    public l(Charset charset) {
        this.f335229a = charset;
    }

    public l(String str) {
        this(Charset.forName(str));
    }
}

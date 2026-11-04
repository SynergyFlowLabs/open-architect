package org.apache.commons.codec.net;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.BitSet;
import nk.h;
import nk.i;
import nk.j;
import org.apache.commons.codec.binary.m;

/* JADX INFO: loaded from: classes9.dex */
public class c implements nk.b, nk.a, j, i {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final BitSet f335472c = new BitSet(256);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final byte f335473d = 61;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final byte f335474e = 9;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final byte f335475f = 32;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final byte f335476g = 13;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final byte f335477h = 10;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f335478i = 73;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Charset f335479a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f335480b;

    static {
        for (int i10 = 33; i10 <= 60; i10++) {
            f335472c.set(i10);
        }
        for (int i11 = 62; i11 <= 126; i11++) {
            f335472c.set(i11);
        }
        BitSet bitSet = f335472c;
        bitSet.set(9);
        bitSet.set(32);
    }

    public c() {
        this(nk.d.f333413f, false);
    }

    public static final byte[] i(byte[] bArr) throws nk.f {
        if (bArr == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i10 = 0;
        while (i10 < bArr.length) {
            byte b10 = bArr[i10];
            if (b10 == 61) {
                int i11 = i10 + 1;
                try {
                    byte b11 = bArr[i11];
                    if (b11 == 13) {
                        i10 = i11;
                    } else {
                        i10 += 2;
                        byteArrayOutputStream.write((char) ((f.a(b11) << 4) + f.a(bArr[i10])));
                    }
                } catch (ArrayIndexOutOfBoundsException e10) {
                    throw new nk.f("Invalid quoted-printable encoding", e10);
                }
            } else if (b10 != 13 && b10 != 10) {
                byteArrayOutputStream.write(b10);
            }
            i10++;
        }
        return byteArrayOutputStream.toByteArray();
    }

    private static int l(int i10, boolean z10, ByteArrayOutputStream byteArrayOutputStream) {
        if (z10) {
            return m(i10, byteArrayOutputStream);
        }
        byteArrayOutputStream.write(i10);
        return 1;
    }

    private static final int m(int i10, ByteArrayOutputStream byteArrayOutputStream) {
        byteArrayOutputStream.write(61);
        char cB = f.b(i10 >> 4);
        char cB2 = f.b(i10);
        byteArrayOutputStream.write(cB);
        byteArrayOutputStream.write(cB2);
        return 3;
    }

    public static final byte[] n(BitSet bitSet, byte[] bArr) {
        return o(bitSet, bArr, false);
    }

    public static final byte[] o(BitSet bitSet, byte[] bArr, boolean z10) {
        if (bArr == null) {
            return null;
        }
        if (bitSet == null) {
            bitSet = f335472c;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        if (z10) {
            int iL = 1;
            for (int i10 = 0; i10 < bArr.length - 3; i10++) {
                int iR = r(i10, bArr);
                if (iL < 73) {
                    iL += l(iR, !bitSet.get(iR), byteArrayOutputStream);
                } else {
                    l(iR, !bitSet.get(iR) || s(iR), byteArrayOutputStream);
                    byteArrayOutputStream.write(61);
                    byteArrayOutputStream.write(13);
                    byteArrayOutputStream.write(10);
                    iL = 1;
                }
            }
            int iR2 = r(bArr.length - 3, bArr);
            if (iL + l(iR2, !bitSet.get(iR2) || (s(iR2) && iL > 68), byteArrayOutputStream) > 71) {
                byteArrayOutputStream.write(61);
                byteArrayOutputStream.write(13);
                byteArrayOutputStream.write(10);
            }
            int length = bArr.length - 2;
            while (length < bArr.length) {
                int iR3 = r(length, bArr);
                l(iR3, !bitSet.get(iR3) || (length > bArr.length + (-2) && s(iR3)), byteArrayOutputStream);
                length++;
            }
        } else {
            int length2 = bArr.length;
            for (int i11 = 0; i11 < length2; i11++) {
                int i12 = bArr[i11];
                if (i12 < 0) {
                    i12 += 256;
                }
                if (bitSet.get(i12)) {
                    byteArrayOutputStream.write(i12);
                } else {
                    m(i12, byteArrayOutputStream);
                }
            }
        }
        return byteArrayOutputStream.toByteArray();
    }

    private static int r(int i10, byte[] bArr) {
        byte b10 = bArr[i10];
        return b10 < 0 ? b10 + 256 : b10;
    }

    private static boolean s(int i10) {
        return i10 == 32 || i10 == 9;
    }

    @Override // nk.g
    public Object a(Object obj) throws h {
        if (obj == null) {
            return null;
        }
        if (obj instanceof byte[]) {
            return e((byte[]) obj);
        }
        if (obj instanceof String) {
            return f((String) obj);
        }
        throw new h("Objects of type " + obj.getClass().getName() + " cannot be quoted-printable encoded");
    }

    @Override // nk.e
    public Object b(Object obj) throws nk.f {
        if (obj == null) {
            return null;
        }
        if (obj instanceof byte[]) {
            return d((byte[]) obj);
        }
        if (obj instanceof String) {
            return c((String) obj);
        }
        throw new nk.f("Objects of type " + obj.getClass().getName() + " cannot be quoted-printable decoded");
    }

    @Override // nk.i
    public String c(String str) throws nk.f {
        return h(str, p());
    }

    @Override // nk.a
    public byte[] d(byte[] bArr) throws nk.f {
        return i(bArr);
    }

    @Override // nk.b
    public byte[] e(byte[] bArr) {
        return o(f335472c, bArr, this.f335480b);
    }

    @Override // nk.j
    public String f(String str) throws h {
        return k(str, p());
    }

    public String g(String str, String str2) throws nk.f, UnsupportedEncodingException {
        if (str == null) {
            return null;
        }
        return new String(d(m.g(str)), str2);
    }

    public String h(String str, Charset charset) throws nk.f {
        if (str == null) {
            return null;
        }
        return new String(d(m.g(str)), charset);
    }

    public String j(String str, String str2) throws UnsupportedEncodingException {
        if (str == null) {
            return null;
        }
        return m.p(e(str.getBytes(str2)));
    }

    public String k(String str, Charset charset) {
        if (str == null) {
            return null;
        }
        return m.p(e(str.getBytes(charset)));
    }

    public Charset p() {
        return this.f335479a;
    }

    public String q() {
        return this.f335479a.name();
    }

    public c(boolean z10) {
        this(nk.d.f333413f, z10);
    }

    public c(Charset charset) {
        this(charset, false);
    }

    public c(Charset charset, boolean z10) {
        this.f335479a = charset;
        this.f335480b = z10;
    }

    public c(String str) throws IllegalArgumentException {
        this(Charset.forName(str), false);
    }
}

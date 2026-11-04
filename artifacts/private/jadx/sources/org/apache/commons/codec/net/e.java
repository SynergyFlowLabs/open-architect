package org.apache.commons.codec.net;

import java.io.ByteArrayOutputStream;
import java.io.UnsupportedEncodingException;
import java.util.BitSet;
import nk.h;
import nk.i;
import nk.j;
import org.apache.commons.codec.binary.m;

/* JADX INFO: loaded from: classes9.dex */
public class e implements nk.b, nk.a, j, i {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected static final byte f335484b = 37;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @Deprecated
    protected static final BitSet f335485c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final BitSet f335486d = new BitSet(256);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @Deprecated
    protected volatile String f335487a;

    static {
        for (int i10 = 97; i10 <= 122; i10++) {
            f335486d.set(i10);
        }
        for (int i11 = 65; i11 <= 90; i11++) {
            f335486d.set(i11);
        }
        for (int i12 = 48; i12 <= 57; i12++) {
            f335486d.set(i12);
        }
        BitSet bitSet = f335486d;
        bitSet.set(45);
        bitSet.set(95);
        bitSet.set(46);
        bitSet.set(42);
        bitSet.set(32);
        f335485c = (BitSet) bitSet.clone();
    }

    public e() {
        this("UTF-8");
    }

    public static final byte[] h(byte[] bArr) throws nk.f {
        if (bArr == null) {
            return null;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int i10 = 0;
        while (i10 < bArr.length) {
            byte b10 = bArr[i10];
            if (b10 == 43) {
                byteArrayOutputStream.write(32);
            } else if (b10 == 37) {
                try {
                    int iA = f.a(bArr[i10 + 1]);
                    i10 += 2;
                    byteArrayOutputStream.write((char) ((iA << 4) + f.a(bArr[i10])));
                } catch (ArrayIndexOutOfBoundsException e10) {
                    throw new nk.f("Invalid URL encoding: ", e10);
                }
            } else {
                byteArrayOutputStream.write(b10);
            }
            i10++;
        }
        return byteArrayOutputStream.toByteArray();
    }

    public static final byte[] j(BitSet bitSet, byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        if (bitSet == null) {
            bitSet = f335486d;
        }
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        int length = bArr.length;
        for (int i10 = 0; i10 < length; i10++) {
            int i11 = bArr[i10];
            if (i11 < 0) {
                i11 += 256;
            }
            if (bitSet.get(i11)) {
                if (i11 == 32) {
                    i11 = 43;
                }
                byteArrayOutputStream.write(i11);
            } else {
                byteArrayOutputStream.write(37);
                char cB = f.b(i11 >> 4);
                char cB2 = f.b(i11);
                byteArrayOutputStream.write(cB);
                byteArrayOutputStream.write(cB2);
            }
        }
        return byteArrayOutputStream.toByteArray();
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
        throw new h("Objects of type " + obj.getClass().getName() + " cannot be URL encoded");
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
        throw new nk.f("Objects of type " + obj.getClass().getName() + " cannot be URL decoded");
    }

    @Override // nk.i
    public String c(String str) throws nk.f {
        if (str == null) {
            return null;
        }
        try {
            return g(str, k());
        } catch (UnsupportedEncodingException e10) {
            throw new nk.f(e10.getMessage(), e10);
        }
    }

    @Override // nk.a
    public byte[] d(byte[] bArr) throws nk.f {
        return h(bArr);
    }

    @Override // nk.b
    public byte[] e(byte[] bArr) {
        return j(f335486d, bArr);
    }

    @Override // nk.j
    public String f(String str) throws h {
        if (str == null) {
            return null;
        }
        try {
            return i(str, k());
        } catch (UnsupportedEncodingException e10) {
            throw new h(e10.getMessage(), e10);
        }
    }

    public String g(String str, String str2) throws nk.f, UnsupportedEncodingException {
        if (str == null) {
            return null;
        }
        return new String(d(m.g(str)), str2);
    }

    public String i(String str, String str2) throws UnsupportedEncodingException {
        if (str == null) {
            return null;
        }
        return m.p(e(str.getBytes(str2)));
    }

    public String k() {
        return this.f335487a;
    }

    @Deprecated
    public String l() {
        return this.f335487a;
    }

    public e(String str) {
        this.f335487a = str;
    }
}

package org.apache.commons.codec.net;

import java.io.UnsupportedEncodingException;
import java.nio.charset.Charset;
import java.util.BitSet;
import nk.h;
import nk.i;
import nk.j;
import okhttp3.internal.ws.g;

/* JADX INFO: loaded from: classes9.dex */
public class b extends d implements j, i {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final BitSet f335467f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final byte f335468g = 32;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final byte f335469h = 95;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Charset f335470d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f335471e;

    static {
        BitSet bitSet = new BitSet(256);
        f335467f = bitSet;
        bitSet.set(32);
        bitSet.set(33);
        bitSet.set(34);
        bitSet.set(35);
        bitSet.set(36);
        bitSet.set(37);
        bitSet.set(38);
        bitSet.set(39);
        bitSet.set(40);
        bitSet.set(41);
        bitSet.set(42);
        bitSet.set(43);
        bitSet.set(44);
        bitSet.set(45);
        bitSet.set(46);
        bitSet.set(47);
        for (int i10 = 48; i10 <= 57; i10++) {
            f335467f.set(i10);
        }
        BitSet bitSet2 = f335467f;
        bitSet2.set(58);
        bitSet2.set(59);
        bitSet2.set(60);
        bitSet2.set(62);
        bitSet2.set(64);
        for (int i11 = 65; i11 <= 90; i11++) {
            f335467f.set(i11);
        }
        BitSet bitSet3 = f335467f;
        bitSet3.set(91);
        bitSet3.set(92);
        bitSet3.set(93);
        bitSet3.set(94);
        bitSet3.set(96);
        for (int i12 = 97; i12 <= 122; i12++) {
            f335467f.set(i12);
        }
        BitSet bitSet4 = f335467f;
        bitSet4.set(123);
        bitSet4.set(124);
        bitSet4.set(125);
        bitSet4.set(g.f334652s);
    }

    public b() {
        this(nk.d.f333413f);
    }

    @Override // nk.g
    public Object a(Object obj) throws h {
        if (obj == null) {
            return null;
        }
        if (obj instanceof String) {
            return f((String) obj);
        }
        throw new h("Objects of type " + obj.getClass().getName() + " cannot be encoded using Q codec");
    }

    @Override // nk.e
    public Object b(Object obj) throws nk.f {
        if (obj == null) {
            return null;
        }
        if (obj instanceof String) {
            return c((String) obj);
        }
        throw new nk.f("Objects of type " + obj.getClass().getName() + " cannot be decoded using Q codec");
    }

    @Override // nk.i
    public String c(String str) throws nk.f {
        if (str == null) {
            return null;
        }
        try {
            return g(str);
        } catch (UnsupportedEncodingException e10) {
            throw new nk.f(e10.getMessage(), e10);
        }
    }

    @Override // nk.j
    public String f(String str) throws h {
        if (str == null) {
            return null;
        }
        return n(str, o());
    }

    @Override // org.apache.commons.codec.net.d
    protected byte[] h(byte[] bArr) throws nk.f {
        if (bArr == null) {
            return null;
        }
        for (byte b10 : bArr) {
            if (b10 == 95) {
                byte[] bArr2 = new byte[bArr.length];
                for (int i10 = 0; i10 < bArr.length; i10++) {
                    byte b11 = bArr[i10];
                    if (b11 != 95) {
                        bArr2[i10] = b11;
                    } else {
                        bArr2[i10] = 32;
                    }
                }
                return c.i(bArr2);
            }
        }
        return c.i(bArr);
    }

    @Override // org.apache.commons.codec.net.d
    protected byte[] i(byte[] bArr) {
        if (bArr == null) {
            return null;
        }
        byte[] bArrN = c.n(f335467f, bArr);
        if (this.f335471e) {
            for (int i10 = 0; i10 < bArrN.length; i10++) {
                if (bArrN[i10] == 32) {
                    bArrN[i10] = f335469h;
                }
            }
        }
        return bArrN;
    }

    @Override // org.apache.commons.codec.net.d
    protected String l() {
        return "Q";
    }

    public String m(String str, String str2) throws h {
        if (str == null) {
            return null;
        }
        try {
            return j(str, str2);
        } catch (UnsupportedEncodingException e10) {
            throw new h(e10.getMessage(), e10);
        }
    }

    public String n(String str, Charset charset) throws h {
        if (str == null) {
            return null;
        }
        return k(str, charset);
    }

    public Charset o() {
        return this.f335470d;
    }

    public String p() {
        return this.f335470d.name();
    }

    public boolean q() {
        return this.f335471e;
    }

    public void r(boolean z10) {
        this.f335471e = z10;
    }

    public b(Charset charset) {
        this.f335471e = false;
        this.f335470d = charset;
    }

    public b(String str) {
        this(Charset.forName(str));
    }
}

package com.google.vr.sdk.deps;

import java.io.IOException;
import java.io.Serializable;
import java.nio.charset.Charset;

/* JADX INFO: loaded from: classes5.dex */
public abstract class k2 implements Serializable, Iterable<Byte> {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final k2 f129465b = new r2(k3.f129469b);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final p2 f129466c;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f129467a;

    static {
        f129466c = g2.b() ? new b5((byte) 0) : new m4((byte) 0);
        new m2();
    }

    k2() {
        this.f129467a = 0;
    }

    static int A(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) >= 0) {
            return i13;
        }
        if (i10 < 0) {
            StringBuilder sb2 = new StringBuilder(32);
            sb2.append("Beginning index: ");
            sb2.append(i10);
            sb2.append(" < 0");
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        if (i11 < i10) {
            StringBuilder sb3 = new StringBuilder(66);
            sb3.append("Beginning index larger than ending index: ");
            sb3.append(i10);
            sb3.append(", ");
            sb3.append(i11);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
        StringBuilder sb4 = new StringBuilder(37);
        sb4.append("End index: ");
        sb4.append(i11);
        sb4.append(" >= ");
        sb4.append(i12);
        throw new IndexOutOfBoundsException(sb4.toString());
    }

    static k2 B(byte[] bArr, int i10, int i11) {
        return new o2(bArr, i10, i11);
    }

    static n4 C(int i10) {
        return new n4(i10, (byte) 0);
    }

    public static k2 l(String str) {
        return new r2(str.getBytes(k3.f129468a));
    }

    static k2 m(byte[] bArr) {
        return new r2(bArr);
    }

    public static k2 n(byte[] bArr, int i10, int i11) {
        A(i10, i10 + i11, bArr.length);
        return new r2(f129466c.a(bArr, i10, i11));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int w(byte b10) {
        return b10 & 255;
    }

    public final String D() {
        return v() == 0 ? "" : r(k3.f129468a);
    }

    public abstract boolean F();

    protected final int G() {
        return this.f129467a;
    }

    public abstract byte c(int i10);

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int i10 = this.f129467a;
        if (i10 == 0) {
            int iV = v();
            i10 = i(iV, 0, iV);
            if (i10 == 0) {
                i10 = 1;
            }
            this.f129467a = i10;
        }
        return i10;
    }

    protected abstract int i(int i10, int i11, int i12);

    public abstract k2 k(int i10, int i11);

    @Override // java.lang.Iterable
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public final q2 iterator() {
        return new l2(this);
    }

    protected abstract String r(Charset charset);

    abstract void s(j2 j2Var) throws IOException;

    protected abstract void t(byte[] bArr, int i10, int i11, int i12);

    public final String toString() {
        return String.format("<ByteString@%s size=%d>", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(v()));
    }

    abstract byte u(int i10);

    public abstract int v();

    k2(byte b10) {
        this();
    }
}

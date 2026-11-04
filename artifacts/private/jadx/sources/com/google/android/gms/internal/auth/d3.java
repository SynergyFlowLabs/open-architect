package com.google.android.gms.internal.auth;

import java.io.Serializable;
import java.nio.charset.Charset;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public abstract class d3 implements Iterable, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d3 f107612b = new a3(z3.f107905d);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final Comparator f107613c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final c3 f107614d;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f107615a = 0;

    static {
        int i10 = p2.f107733a;
        f107614d = new c3(null);
        f107613c = new u2();
    }

    d3() {
    }

    static int p(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) >= 0) {
            return i13;
        }
        if (i10 < 0) {
            throw new IndexOutOfBoundsException("Beginning index: " + i10 + " < 0");
        }
        if (i11 < i10) {
            throw new IndexOutOfBoundsException("Beginning index larger than ending index: " + i10 + ", " + i11);
        }
        throw new IndexOutOfBoundsException("End index: " + i11 + " >= " + i12);
    }

    public static d3 s(byte[] bArr, int i10, int i11) {
        p(i10, i10 + i11, bArr.length);
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        return new a3(bArr2);
    }

    public abstract byte c(int i10);

    abstract byte d(int i10);

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int iK = this.f107615a;
        if (iK == 0) {
            int i10 = i();
            iK = k(i10, 0, i10);
            if (iK == 0) {
                iK = 1;
            }
            this.f107615a = iK;
        }
        return iK;
    }

    public abstract int i();

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new t2(this);
    }

    protected abstract int k(int i10, int i11, int i12);

    public abstract d3 l(int i10, int i11);

    protected abstract String m(Charset charset);

    public abstract boolean n();

    protected final int r() {
        return this.f107615a;
    }

    public final String t(Charset charset) {
        return i() == 0 ? "" : m(charset);
    }

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(i()), i() <= 50 ? x5.a(this) : x5.a(l(0, 47)).concat("..."));
    }
}

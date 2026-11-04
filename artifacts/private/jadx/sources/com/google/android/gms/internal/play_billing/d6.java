package com.google.android.gms.internal.play_billing;

import java.io.IOException;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public abstract class d6 implements Iterable, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final d6 f109102b = new b6(j7.f109152b);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f109103a = 0;

    static {
        int i10 = q5.f109268a;
    }

    d6() {
    }

    static int n(int i10, int i11, int i12) {
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

    public static d6 r(byte[] bArr, int i10, int i11) {
        n(i10, i10 + i11, bArr.length);
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        return new b6(bArr2);
    }

    public abstract byte c(int i10);

    abstract byte d(int i10);

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int iK = this.f109103a;
        if (iK == 0) {
            int i10 = i();
            iK = k(i10, 0, i10);
            if (iK == 0) {
                iK = 1;
            }
            this.f109103a = iK;
        }
        return iK;
    }

    public abstract int i();

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new w5(this);
    }

    protected abstract int k(int i10, int i11, int i12);

    public abstract d6 l(int i10, int i11);

    abstract void m(v5 v5Var) throws IOException;

    protected final int p() {
        return this.f109103a;
    }

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(i()), i() <= 50 ? d9.a(this) : d9.a(l(0, 47)).concat("..."));
    }
}

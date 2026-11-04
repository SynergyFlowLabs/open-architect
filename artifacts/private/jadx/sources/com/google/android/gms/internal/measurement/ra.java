package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.io.Serializable;
import java.util.Iterator;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
public abstract class ra implements Iterable, Serializable {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final ra f108771b = new qa(ac.f108281b);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f108772a = 0;

    static {
        int i10 = ea.f108389a;
    }

    ra() {
    }

    public static ra n(byte[] bArr, int i10, int i11) {
        r(i10, i10 + i11, bArr.length);
        byte[] bArr2 = new byte[i11];
        System.arraycopy(bArr, i10, bArr2, 0, i11);
        return new qa(bArr2);
    }

    static int r(int i10, int i11, int i12) {
        int i13 = i11 - i10;
        if ((i10 | i11 | i13 | (i12 - i11)) >= 0) {
            return i13;
        }
        if (i10 < 0) {
            StringBuilder sb2 = new StringBuilder(String.valueOf(i10).length() + 21);
            sb2.append("Beginning index: ");
            sb2.append(i10);
            sb2.append(" < 0");
            throw new IndexOutOfBoundsException(sb2.toString());
        }
        if (i11 < i10) {
            StringBuilder sb3 = new StringBuilder(String.valueOf(i10).length() + 44 + String.valueOf(i11).length());
            sb3.append("Beginning index larger than ending index: ");
            sb3.append(i10);
            sb3.append(", ");
            sb3.append(i11);
            throw new IndexOutOfBoundsException(sb3.toString());
        }
        StringBuilder sb4 = new StringBuilder(String.valueOf(i11).length() + 15 + String.valueOf(i12).length());
        sb4.append("End index: ");
        sb4.append(i11);
        sb4.append(" >= ");
        sb4.append(i12);
        throw new IndexOutOfBoundsException(sb4.toString());
    }

    public abstract byte c(int i10);

    abstract byte d(int i10);

    public abstract boolean equals(Object obj);

    public final int hashCode() {
        int iM = this.f108772a;
        if (iM == 0) {
            int i10 = i();
            iM = m(i10, 0, i10);
            if (iM == 0) {
                iM = 1;
            }
            this.f108772a = iM;
        }
        return iM;
    }

    public abstract int i();

    @Override // java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return new ka(this);
    }

    public abstract ra k(int i10, int i11);

    abstract void l(ia iaVar) throws IOException;

    protected abstract int m(int i10, int i11, int i12);

    protected final int p() {
        return this.f108772a;
    }

    public final String toString() {
        return String.format(Locale.ROOT, "<ByteString@%s size=%d contents=\"%s\">", Integer.toHexString(System.identityHashCode(this)), Integer.valueOf(i()), i() <= 50 ? td.a(this) : td.a(k(0, 47)).concat("..."));
    }
}

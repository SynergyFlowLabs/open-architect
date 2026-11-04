package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
final class ua extends wa {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final byte[] f108903e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int f108904f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f108905g;

    ua(byte[] bArr, int i10, int i11) {
        super(null);
        int length = bArr.length;
        if (((length - i11) | i11) < 0) {
            throw new IllegalArgumentException(String.format(Locale.US, "Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i11)));
        }
        this.f108903e = bArr;
        this.f108905g = 0;
        this.f108904f = i11;
    }

    @Override // com.google.android.gms.internal.measurement.wa
    public final void A(int i10) throws IOException {
        int i11 = this.f108905g;
        try {
            byte[] bArr = this.f108903e;
            bArr[i11] = (byte) i10;
            bArr[i11 + 1] = (byte) (i10 >> 8);
            bArr[i11 + 2] = (byte) (i10 >> 16);
            bArr[i11 + 3] = (byte) (i10 >> 24);
            this.f108905g = i11 + 4;
        } catch (IndexOutOfBoundsException e10) {
            throw new va(i11, this.f108904f, 4, e10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.wa
    public final void B(long j10) throws IOException {
        int i10;
        IndexOutOfBoundsException indexOutOfBoundsException;
        boolean z10 = wa.f108945c;
        int i11 = this.f108905g;
        if (!z10 || this.f108904f - i11 < 10) {
            while ((j10 & (-128)) != 0) {
                try {
                    int i12 = i11 + 1;
                    try {
                        this.f108903e[i11] = (byte) (((int) j10) | 128);
                        j10 >>>= 7;
                        i11 = i12;
                    } catch (IndexOutOfBoundsException e10) {
                        indexOutOfBoundsException = e10;
                        i11 = i12;
                        throw new va(i11, this.f108904f, 1, indexOutOfBoundsException);
                    }
                } catch (IndexOutOfBoundsException e11) {
                    indexOutOfBoundsException = e11;
                }
            }
            i10 = i11 + 1;
            try {
                this.f108903e[i11] = (byte) j10;
            } catch (IndexOutOfBoundsException e12) {
                indexOutOfBoundsException = e12;
                i11 = i10;
                throw new va(i11, this.f108904f, 1, indexOutOfBoundsException);
            }
        } else {
            while ((j10 & (-128)) != 0) {
                ce.u(this.f108903e, i11, (byte) (((int) j10) | 128));
                j10 >>>= 7;
                i11++;
            }
            i10 = i11 + 1;
            ce.u(this.f108903e, i11, (byte) j10);
        }
        this.f108905g = i10;
    }

    @Override // com.google.android.gms.internal.measurement.wa
    public final void C(long j10) throws IOException {
        int i10 = this.f108905g;
        try {
            byte[] bArr = this.f108903e;
            bArr[i10] = (byte) j10;
            bArr[i10 + 1] = (byte) (j10 >> 8);
            bArr[i10 + 2] = (byte) (j10 >> 16);
            bArr[i10 + 3] = (byte) (j10 >> 24);
            bArr[i10 + 4] = (byte) (j10 >> 32);
            bArr[i10 + 5] = (byte) (j10 >> 40);
            bArr[i10 + 6] = (byte) (j10 >> 48);
            bArr[i10 + 7] = (byte) (j10 >> 56);
            this.f108905g = i10 + 8;
        } catch (IndexOutOfBoundsException e10) {
            throw new va(i10, this.f108904f, 8, e10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.wa
    public final void D(byte[] bArr, int i10, int i11) throws IOException {
        H(bArr, 0, i11);
    }

    @Override // com.google.android.gms.internal.measurement.wa
    public final void E(String str) throws IOException {
        int i10 = this.f108905g;
        try {
            int iG = wa.G(str.length() * 3);
            int iG2 = wa.G(str.length());
            if (iG2 != iG) {
                z(fe.b(str));
                byte[] bArr = this.f108903e;
                int i11 = this.f108905g;
                this.f108905g = fe.c(str, bArr, i11, this.f108904f - i11);
                return;
            }
            int i12 = i10 + iG2;
            this.f108905g = i12;
            int iC = fe.c(str, this.f108903e, i12, this.f108904f - i12);
            this.f108905g = i10;
            z((iC - i10) - iG2);
            this.f108905g = iC;
        } catch (ee e10) {
            this.f108905g = i10;
            f(str, e10);
        } catch (IndexOutOfBoundsException e11) {
            throw new va(e11);
        }
    }

    @Override // com.google.android.gms.internal.measurement.wa
    public final int F() {
        return this.f108904f - this.f108905g;
    }

    public final void H(byte[] bArr, int i10, int i11) throws IOException {
        try {
            System.arraycopy(bArr, 0, this.f108903e, this.f108905g, i11);
            this.f108905g += i11;
        } catch (IndexOutOfBoundsException e10) {
            throw new va(this.f108905g, this.f108904f, i11, e10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.wa
    public final void i(int i10, int i11) throws IOException {
        z((i10 << 3) | i11);
    }

    @Override // com.google.android.gms.internal.measurement.wa
    public final void j(int i10, int i11) throws IOException {
        z(i10 << 3);
        y(i11);
    }

    @Override // com.google.android.gms.internal.measurement.wa
    public final void k(int i10, int i11) throws IOException {
        z(i10 << 3);
        z(i11);
    }

    @Override // com.google.android.gms.internal.measurement.wa
    public final void l(int i10, int i11) throws IOException {
        z((i10 << 3) | 5);
        A(i11);
    }

    @Override // com.google.android.gms.internal.measurement.wa
    public final void m(int i10, long j10) throws IOException {
        z(i10 << 3);
        B(j10);
    }

    @Override // com.google.android.gms.internal.measurement.wa
    public final void n(int i10, long j10) throws IOException {
        z((i10 << 3) | 1);
        C(j10);
    }

    @Override // com.google.android.gms.internal.measurement.wa
    public final void o(int i10, boolean z10) throws IOException {
        z(i10 << 3);
        x(z10 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.measurement.wa
    public final void p(int i10, String str) throws IOException {
        z((i10 << 3) | 2);
        E(str);
    }

    @Override // com.google.android.gms.internal.measurement.wa
    public final void q(int i10, ra raVar) throws IOException {
        z((i10 << 3) | 2);
        r(raVar);
    }

    @Override // com.google.android.gms.internal.measurement.wa
    public final void r(ra raVar) throws IOException {
        z(raVar.i());
        raVar.l(this);
    }

    @Override // com.google.android.gms.internal.measurement.wa
    public final void s(byte[] bArr, int i10, int i11) throws IOException {
        z(i11);
        H(bArr, 0, i11);
    }

    @Override // com.google.android.gms.internal.measurement.wa
    final void t(int i10, yc ycVar, jd jdVar) throws IOException {
        z((i10 << 3) | 2);
        z(((ba) ycVar).h(jdVar));
        jdVar.f(ycVar, this.f108947a);
    }

    @Override // com.google.android.gms.internal.measurement.wa
    public final void u(int i10, yc ycVar) throws IOException {
        z(11);
        k(2, i10);
        z(26);
        w(ycVar);
        z(12);
    }

    @Override // com.google.android.gms.internal.measurement.wa
    public final void v(int i10, ra raVar) throws IOException {
        z(11);
        k(2, i10);
        q(3, raVar);
        z(12);
    }

    @Override // com.google.android.gms.internal.measurement.wa
    public final void w(yc ycVar) throws IOException {
        z(ycVar.e());
        ycVar.f(this);
    }

    @Override // com.google.android.gms.internal.measurement.wa
    public final void x(byte b10) throws IOException {
        int i10 = this.f108905g;
        try {
            int i11 = i10 + 1;
            try {
                this.f108903e[i10] = b10;
                this.f108905g = i11;
            } catch (IndexOutOfBoundsException e10) {
                e = e10;
                i10 = i11;
                throw new va(i10, this.f108904f, 1, e);
            }
        } catch (IndexOutOfBoundsException e11) {
            e = e11;
        }
    }

    @Override // com.google.android.gms.internal.measurement.wa
    public final void y(int i10) throws IOException {
        if (i10 >= 0) {
            z(i10);
        } else {
            B(i10);
        }
    }

    @Override // com.google.android.gms.internal.measurement.wa
    public final void z(int i10) throws IOException {
        int i11;
        IndexOutOfBoundsException indexOutOfBoundsException;
        int i12 = this.f108905g;
        while ((i10 & (-128)) != 0) {
            try {
                i11 = i12 + 1;
                try {
                    this.f108903e[i12] = (byte) (i10 | 128);
                    i10 >>>= 7;
                    i12 = i11;
                } catch (IndexOutOfBoundsException e10) {
                    indexOutOfBoundsException = e10;
                    i12 = i11;
                    throw new va(i12, this.f108904f, 1, indexOutOfBoundsException);
                }
            } catch (IndexOutOfBoundsException e11) {
                indexOutOfBoundsException = e11;
                throw new va(i12, this.f108904f, 1, indexOutOfBoundsException);
            }
        }
        i11 = i12 + 1;
        this.f108903e[i12] = (byte) i10;
        this.f108905g = i11;
    }
}

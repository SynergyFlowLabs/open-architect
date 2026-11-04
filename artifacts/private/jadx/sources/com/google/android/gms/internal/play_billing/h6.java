package com.google.android.gms.internal.play_billing;

import java.io.IOException;
import java.util.Locale;

/* JADX INFO: loaded from: classes4.dex */
final class h6 extends k6 {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final byte[] f109144d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final int f109145e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f109146f;

    h6(byte[] bArr, int i10, int i11) {
        super(null);
        int length = bArr.length;
        if (((length - i11) | i11) < 0) {
            throw new IllegalArgumentException(String.format(Locale.US, "Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(length), 0, Integer.valueOf(i11)));
        }
        this.f109144d = bArr;
        this.f109146f = 0;
        this.f109145e = i11;
    }

    public final void C(byte[] bArr, int i10, int i11) throws IOException {
        try {
            System.arraycopy(bArr, 0, this.f109144d, this.f109146f, i11);
            this.f109146f += i11;
        } catch (IndexOutOfBoundsException e10) {
            throw new i6(this.f109146f, this.f109145e, i11, e10);
        }
    }

    public final void D(String str) throws IOException {
        int i10 = this.f109146f;
        try {
            int iB = k6.B(str.length() * 3);
            int iB2 = k6.B(str.length());
            if (iB2 != iB) {
                v(p9.c(str));
                byte[] bArr = this.f109144d;
                int i11 = this.f109146f;
                this.f109146f = p9.b(str, bArr, i11, this.f109145e - i11);
                return;
            }
            int i12 = i10 + iB2;
            this.f109146f = i12;
            int iB3 = p9.b(str, this.f109144d, i12, this.f109145e - i12);
            this.f109146f = i10;
            v((iB3 - i10) - iB2);
            this.f109146f = iB3;
        } catch (o9 e10) {
            this.f109146f = i10;
            c(str, e10);
        } catch (IndexOutOfBoundsException e11) {
            throw new i6(e11);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.k6
    public final int e() {
        return this.f109145e - this.f109146f;
    }

    @Override // com.google.android.gms.internal.play_billing.k6
    public final void f(byte b10) throws IOException {
        int i10 = this.f109146f;
        try {
            int i11 = i10 + 1;
            try {
                this.f109144d[i10] = b10;
                this.f109146f = i11;
            } catch (IndexOutOfBoundsException e10) {
                e = e10;
                i10 = i11;
                throw new i6(i10, this.f109145e, 1, e);
            }
        } catch (IndexOutOfBoundsException e11) {
            e = e11;
        }
    }

    @Override // com.google.android.gms.internal.play_billing.k6
    public final void g(int i10, boolean z10) throws IOException {
        v(i10 << 3);
        f(z10 ? (byte) 1 : (byte) 0);
    }

    @Override // com.google.android.gms.internal.play_billing.k6
    public final void h(int i10, d6 d6Var) throws IOException {
        v((i10 << 3) | 2);
        v(d6Var.i());
        d6Var.m(this);
    }

    @Override // com.google.android.gms.internal.play_billing.k6
    public final void i(int i10, int i11) throws IOException {
        v((i10 << 3) | 5);
        j(i11);
    }

    @Override // com.google.android.gms.internal.play_billing.k6
    public final void j(int i10) throws IOException {
        int i11 = this.f109146f;
        try {
            byte[] bArr = this.f109144d;
            bArr[i11] = (byte) (i10 & 255);
            bArr[i11 + 1] = (byte) ((i10 >> 8) & 255);
            bArr[i11 + 2] = (byte) ((i10 >> 16) & 255);
            bArr[i11 + 3] = (byte) ((i10 >> 24) & 255);
            this.f109146f = i11 + 4;
        } catch (IndexOutOfBoundsException e10) {
            throw new i6(i11, this.f109145e, 4, e10);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.k6
    public final void k(int i10, long j10) throws IOException {
        v((i10 << 3) | 1);
        l(j10);
    }

    @Override // com.google.android.gms.internal.play_billing.k6
    public final void l(long j10) throws IOException {
        int i10 = this.f109146f;
        try {
            byte[] bArr = this.f109144d;
            bArr[i10] = (byte) (((int) j10) & 255);
            bArr[i10 + 1] = (byte) (((int) (j10 >> 8)) & 255);
            bArr[i10 + 2] = (byte) (((int) (j10 >> 16)) & 255);
            bArr[i10 + 3] = (byte) (((int) (j10 >> 24)) & 255);
            bArr[i10 + 4] = (byte) (((int) (j10 >> 32)) & 255);
            bArr[i10 + 5] = (byte) (((int) (j10 >> 40)) & 255);
            bArr[i10 + 6] = (byte) (((int) (j10 >> 48)) & 255);
            bArr[i10 + 7] = (byte) (((int) (j10 >> 56)) & 255);
            this.f109146f = i10 + 8;
        } catch (IndexOutOfBoundsException e10) {
            throw new i6(i10, this.f109145e, 8, e10);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.k6
    public final void m(int i10, int i11) throws IOException {
        v(i10 << 3);
        n(i11);
    }

    @Override // com.google.android.gms.internal.play_billing.k6
    public final void n(int i10) throws IOException {
        if (i10 >= 0) {
            v(i10);
        } else {
            x(i10);
        }
    }

    @Override // com.google.android.gms.internal.play_billing.k6
    public final void o(byte[] bArr, int i10, int i11) throws IOException {
        C(bArr, 0, i11);
    }

    @Override // com.google.android.gms.internal.play_billing.k6
    final void p(int i10, h8 h8Var, s8 s8Var) throws IOException {
        v((i10 << 3) | 2);
        v(((n5) h8Var).g(s8Var));
        s8Var.e(h8Var, this.f109165a);
    }

    @Override // com.google.android.gms.internal.play_billing.k6
    public final void q(int i10, h8 h8Var) throws IOException {
        v(11);
        u(2, i10);
        v(26);
        v(h8Var.d());
        h8Var.a(this);
        v(12);
    }

    @Override // com.google.android.gms.internal.play_billing.k6
    public final void r(int i10, d6 d6Var) throws IOException {
        v(11);
        u(2, i10);
        h(3, d6Var);
        v(12);
    }

    @Override // com.google.android.gms.internal.play_billing.k6
    public final void s(int i10, String str) throws IOException {
        v((i10 << 3) | 2);
        D(str);
    }

    @Override // com.google.android.gms.internal.play_billing.k6
    public final void t(int i10, int i11) throws IOException {
        v((i10 << 3) | i11);
    }

    @Override // com.google.android.gms.internal.play_billing.k6
    public final void u(int i10, int i11) throws IOException {
        v(i10 << 3);
        v(i11);
    }

    @Override // com.google.android.gms.internal.play_billing.k6
    public final void v(int i10) throws IOException {
        while ((i10 & (-128)) != 0) {
            try {
                byte[] bArr = this.f109144d;
                int i11 = this.f109146f;
                this.f109146f = i11 + 1;
                bArr[i11] = (byte) ((i10 | 128) & 255);
                i10 >>>= 7;
            } catch (IndexOutOfBoundsException e10) {
                throw new i6(this.f109146f, this.f109145e, 1, e10);
            }
        }
        byte[] bArr2 = this.f109144d;
        int i12 = this.f109146f;
        this.f109146f = i12 + 1;
        bArr2[i12] = (byte) i10;
    }

    @Override // com.google.android.gms.internal.play_billing.k6
    public final void w(int i10, long j10) throws IOException {
        v(i10 << 3);
        x(j10);
    }

    @Override // com.google.android.gms.internal.play_billing.k6
    public final void x(long j10) throws IOException {
        if (!k6.f109164c || this.f109145e - this.f109146f < 10) {
            while ((j10 & (-128)) != 0) {
                try {
                    byte[] bArr = this.f109144d;
                    int i10 = this.f109146f;
                    this.f109146f = i10 + 1;
                    bArr[i10] = (byte) ((((int) j10) | 128) & 255);
                    j10 >>>= 7;
                } catch (IndexOutOfBoundsException e10) {
                    throw new i6(this.f109146f, this.f109145e, 1, e10);
                }
            }
            byte[] bArr2 = this.f109144d;
            int i11 = this.f109146f;
            this.f109146f = i11 + 1;
            bArr2[i11] = (byte) j10;
            return;
        }
        while (true) {
            int i12 = (int) j10;
            if ((j10 & (-128)) == 0) {
                byte[] bArr3 = this.f109144d;
                int i13 = this.f109146f;
                this.f109146f = i13 + 1;
                m9.s(bArr3, i13, (byte) i12);
                return;
            }
            byte[] bArr4 = this.f109144d;
            int i14 = this.f109146f;
            this.f109146f = i14 + 1;
            m9.s(bArr4, i14, (byte) ((i12 | 128) & 255));
            j10 >>>= 7;
        }
    }
}

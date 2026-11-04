package com.google.android.gms.internal.fido;

import java.io.IOException;
import java.math.RoundingMode;

/* JADX INFO: loaded from: classes4.dex */
class g0 extends h0 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    final d0 f108012f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @fj.a
    final Character f108013g;

    g0(d0 d0Var, @fj.a Character ch2) {
        this.f108012f = d0Var;
        if (ch2 != null && d0Var.b('=')) {
            throw new IllegalArgumentException(o.a("Padding character %s was already in alphabet", ch2));
        }
        this.f108013g = ch2;
    }

    @Override // com.google.android.gms.internal.fido.h0
    void a(Appendable appendable, byte[] bArr, int i10, int i11) throws IOException {
        int i12 = 0;
        n.e(0, i11, bArr.length);
        while (i12 < i11) {
            e(appendable, bArr, i12, Math.min(this.f108012f.f108007f, i11 - i12));
            i12 += this.f108012f.f108007f;
        }
    }

    @Override // com.google.android.gms.internal.fido.h0
    final int b(int i10) {
        d0 d0Var = this.f108012f;
        return d0Var.f108006e * j0.a(i10, d0Var.f108007f, RoundingMode.CEILING);
    }

    final void e(Appendable appendable, byte[] bArr, int i10, int i11) throws IOException {
        n.e(i10, i10 + i11, bArr.length);
        int i12 = 0;
        n.c(i11 <= this.f108012f.f108007f);
        long j10 = 0;
        for (int i13 = 0; i13 < i11; i13++) {
            j10 = (j10 | ((long) (bArr[i10 + i13] & 255))) << 8;
        }
        int i14 = ((i11 + 1) * 8) - this.f108012f.f108005d;
        while (i12 < i11 * 8) {
            d0 d0Var = this.f108012f;
            appendable.append(d0Var.a(d0Var.f108004c & ((int) (j10 >>> (i14 - i12)))));
            i12 += this.f108012f.f108005d;
        }
        if (this.f108013g != null) {
            while (i12 < this.f108012f.f108007f * 8) {
                this.f108013g.getClass();
                appendable.append('=');
                i12 += this.f108012f.f108005d;
            }
        }
    }

    public final boolean equals(@fj.a Object obj) {
        Character ch2;
        Character ch3;
        if (obj instanceof g0) {
            g0 g0Var = (g0) obj;
            if (this.f108012f.equals(g0Var.f108012f) && ((ch2 = this.f108013g) == (ch3 = g0Var.f108013g) || (ch2 != null && ch2.equals(ch3)))) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int iHashCode = this.f108012f.hashCode();
        Character ch2 = this.f108013g;
        return (ch2 == null ? 0 : ch2.hashCode()) ^ iHashCode;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BaseEncoding.");
        sb2.append(this.f108012f);
        if (8 % this.f108012f.f108005d != 0) {
            if (this.f108013g == null) {
                sb2.append(".omitPadding()");
            } else {
                sb2.append(".withPadChar('");
                sb2.append(this.f108013g);
                sb2.append("')");
            }
        }
        return sb2.toString();
    }

    g0(String str, String str2, @fj.a Character ch2) {
        this(new d0(str, str2.toCharArray()), ch2);
    }
}

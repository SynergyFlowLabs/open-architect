package com.google.android.gms.internal.fido;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class f0 extends g0 {
    f0(String str, String str2, @fj.a Character ch2) {
        d0 d0Var = new d0(str, str2.toCharArray());
        super(d0Var, ch2);
        n.c(d0Var.f108003b.length == 64);
    }

    @Override // com.google.android.gms.internal.fido.g0, com.google.android.gms.internal.fido.h0
    final void a(Appendable appendable, byte[] bArr, int i10, int i11) throws IOException {
        int i12 = 0;
        n.e(0, i11, bArr.length);
        for (int i13 = i11; i13 >= 3; i13 -= 3) {
            int i14 = bArr[i12] & 255;
            int i15 = ((bArr[i12 + 1] & 255) << 8) | (i14 << 16) | (bArr[i12 + 2] & 255);
            appendable.append(this.f108012f.a(i15 >>> 18));
            appendable.append(this.f108012f.a((i15 >>> 12) & 63));
            appendable.append(this.f108012f.a((i15 >>> 6) & 63));
            appendable.append(this.f108012f.a(i15 & 63));
            i12 += 3;
        }
        if (i12 < i11) {
            e(appendable, bArr, i12, i11 - i12);
        }
    }
}

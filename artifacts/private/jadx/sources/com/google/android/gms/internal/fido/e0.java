package com.google.android.gms.internal.fido;

import java.io.IOException;

/* JADX INFO: loaded from: classes4.dex */
final class e0 extends g0 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    final char[] f108010h;

    e0(String str, String str2) {
        d0 d0Var = new d0("base16()", "0123456789ABCDEF".toCharArray());
        super(d0Var, null);
        this.f108010h = new char[512];
        n.c(d0Var.f108003b.length == 16);
        for (int i10 = 0; i10 < 256; i10++) {
            this.f108010h[i10] = d0Var.a(i10 >>> 4);
            this.f108010h[i10 | 256] = d0Var.a(i10 & 15);
        }
    }

    @Override // com.google.android.gms.internal.fido.g0, com.google.android.gms.internal.fido.h0
    final void a(Appendable appendable, byte[] bArr, int i10, int i11) throws IOException {
        n.e(0, i11, bArr.length);
        for (int i12 = 0; i12 < i11; i12++) {
            int i13 = bArr[i12] & 255;
            appendable.append(this.f108010h[i13]);
            appendable.append(this.f108010h[i13 | 256]);
        }
    }
}

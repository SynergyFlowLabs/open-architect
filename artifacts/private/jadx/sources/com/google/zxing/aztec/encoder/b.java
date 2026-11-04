package com.google.zxing.aztec.encoder;

import kotlin.text.b0;

/* JADX INFO: loaded from: classes5.dex */
final class b extends g {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final short f130121c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final short f130122d;

    b(g gVar, int i10, int i11) {
        super(gVar);
        this.f130121c = (short) i10;
        this.f130122d = (short) i11;
    }

    @Override // com.google.zxing.aztec.encoder.g
    public void c(com.google.zxing.common.a aVar, byte[] bArr) {
        int i10 = 0;
        while (true) {
            short s10 = this.f130122d;
            if (i10 >= s10) {
                return;
            }
            if (i10 == 0 || (i10 == 31 && s10 <= 62)) {
                aVar.c(31, 5);
                short s11 = this.f130122d;
                if (s11 > 62) {
                    aVar.c(s11 - 31, 16);
                } else if (i10 == 0) {
                    aVar.c(Math.min((int) s11, 31), 5);
                } else {
                    aVar.c(s11 - 31, 5);
                }
            }
            aVar.c(bArr[this.f130121c + i10], 8);
            i10++;
        }
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("<");
        sb2.append((int) this.f130121c);
        sb2.append("::");
        sb2.append((this.f130121c + this.f130122d) - 1);
        sb2.append(b0.f313281f);
        return sb2.toString();
    }
}

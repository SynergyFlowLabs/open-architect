package com.google.zxing.oned;

import java.util.Map;

/* JADX INFO: loaded from: classes5.dex */
public final class t extends y {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final y f130724k = new i();

    private static com.google.zxing.r s(com.google.zxing.r rVar) throws com.google.zxing.h {
        String strG = rVar.g();
        if (strG.charAt(0) != '0') {
            throw com.google.zxing.h.a();
        }
        com.google.zxing.r rVar2 = new com.google.zxing.r(strG.substring(1), null, rVar.f(), com.google.zxing.a.UPC_A);
        if (rVar.e() != null) {
            rVar2.i(rVar.e());
        }
        return rVar2;
    }

    @Override // com.google.zxing.oned.r, com.google.zxing.p
    public com.google.zxing.r a(com.google.zxing.c cVar, Map<com.google.zxing.e, ?> map) throws com.google.zxing.m, com.google.zxing.h {
        return s(this.f130724k.a(cVar, map));
    }

    @Override // com.google.zxing.oned.y, com.google.zxing.oned.r
    public com.google.zxing.r b(int i10, com.google.zxing.common.a aVar, Map<com.google.zxing.e, ?> map) throws com.google.zxing.m, com.google.zxing.d, com.google.zxing.h {
        return s(this.f130724k.b(i10, aVar, map));
    }

    @Override // com.google.zxing.oned.r, com.google.zxing.p
    public com.google.zxing.r c(com.google.zxing.c cVar) throws com.google.zxing.m, com.google.zxing.h {
        return s(this.f130724k.c(cVar));
    }

    @Override // com.google.zxing.oned.y
    protected int l(com.google.zxing.common.a aVar, int[] iArr, StringBuilder sb2) throws com.google.zxing.m {
        return this.f130724k.l(aVar, iArr, sb2);
    }

    @Override // com.google.zxing.oned.y
    public com.google.zxing.r m(int i10, com.google.zxing.common.a aVar, int[] iArr, Map<com.google.zxing.e, ?> map) throws com.google.zxing.m, com.google.zxing.d, com.google.zxing.h {
        return s(this.f130724k.m(i10, aVar, iArr, map));
    }

    @Override // com.google.zxing.oned.y
    com.google.zxing.a q() {
        return com.google.zxing.a.UPC_A;
    }
}

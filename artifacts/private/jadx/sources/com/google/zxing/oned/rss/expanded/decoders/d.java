package com.google.zxing.oned.rss.expanded.decoders;

/* JADX INFO: loaded from: classes5.dex */
final class d extends h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f130684d = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f130685e = 2;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f130686f = 10;

    d(com.google.zxing.common.a aVar) {
        super(aVar);
    }

    @Override // com.google.zxing.oned.rss.expanded.decoders.j
    public String d() throws com.google.zxing.m, com.google.zxing.h {
        if (c().l() < 48) {
            throw com.google.zxing.m.a();
        }
        StringBuilder sb2 = new StringBuilder();
        f(sb2, 8);
        int iF = b().f(48, 2);
        sb2.append("(393");
        sb2.append(iF);
        sb2.append(')');
        int iF2 = b().f(50, 10);
        if (iF2 / 100 == 0) {
            sb2.append(org.locationtech.jts.geom.l.f338160j);
        }
        if (iF2 / 10 == 0) {
            sb2.append(org.locationtech.jts.geom.l.f338160j);
        }
        sb2.append(iF2);
        sb2.append(b().c(60, null).b());
        return sb2.toString();
    }
}

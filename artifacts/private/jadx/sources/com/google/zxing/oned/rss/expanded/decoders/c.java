package com.google.zxing.oned.rss.expanded.decoders;

/* JADX INFO: loaded from: classes5.dex */
final class c extends h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f130682d = 8;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f130683e = 2;

    c(com.google.zxing.common.a aVar) {
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
        sb2.append("(392");
        sb2.append(iF);
        sb2.append(')');
        sb2.append(b().c(50, null).b());
        return sb2.toString();
    }
}

package com.google.zxing.oned.rss.expanded.decoders;

/* JADX INFO: loaded from: classes5.dex */
abstract class f extends i {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f130692d = 5;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f130693e = 15;

    f(com.google.zxing.common.a aVar) {
        super(aVar);
    }

    @Override // com.google.zxing.oned.rss.expanded.decoders.j
    public String d() throws com.google.zxing.m {
        if (c().l() != 60) {
            throw com.google.zxing.m.a();
        }
        StringBuilder sb2 = new StringBuilder();
        f(sb2, 5);
        j(sb2, 45, 15);
        return sb2.toString();
    }
}

package com.google.zxing.oned.rss.expanded.decoders;

/* JADX INFO: loaded from: classes5.dex */
final class g extends h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f130694d = 4;

    g(com.google.zxing.common.a aVar) {
        super(aVar);
    }

    @Override // com.google.zxing.oned.rss.expanded.decoders.j
    public String d() throws com.google.zxing.m, com.google.zxing.h {
        StringBuilder sb2 = new StringBuilder();
        sb2.append("(01)");
        int length = sb2.length();
        sb2.append(b().f(4, 4));
        g(sb2, 8, length);
        return b().a(sb2, 48);
    }
}

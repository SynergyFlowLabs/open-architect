package com.google.zxing.oned.rss.expanded.decoders;

/* JADX INFO: loaded from: classes5.dex */
final class e extends i {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f130687f = 8;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f130688g = 20;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f130689h = 16;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final String f130690d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final String f130691e;

    e(com.google.zxing.common.a aVar, String str, String str2) {
        super(aVar);
        this.f130690d = str2;
        this.f130691e = str;
    }

    private void k(StringBuilder sb2, int i10) {
        int iF = b().f(i10, 16);
        if (iF == 38400) {
            return;
        }
        sb2.append('(');
        sb2.append(this.f130690d);
        sb2.append(')');
        int i11 = iF % 32;
        int i12 = iF / 32;
        int i13 = (i12 % 12) + 1;
        int i14 = i12 / 12;
        if (i14 / 10 == 0) {
            sb2.append(org.locationtech.jts.geom.l.f338160j);
        }
        sb2.append(i14);
        if (i13 / 10 == 0) {
            sb2.append(org.locationtech.jts.geom.l.f338160j);
        }
        sb2.append(i13);
        if (i11 / 10 == 0) {
            sb2.append(org.locationtech.jts.geom.l.f338160j);
        }
        sb2.append(i11);
    }

    @Override // com.google.zxing.oned.rss.expanded.decoders.j
    public String d() throws com.google.zxing.m {
        if (c().l() != 84) {
            throw com.google.zxing.m.a();
        }
        StringBuilder sb2 = new StringBuilder();
        f(sb2, 8);
        j(sb2, 48, 20);
        k(sb2, 68);
        return sb2.toString();
    }

    @Override // com.google.zxing.oned.rss.expanded.decoders.i
    protected void h(StringBuilder sb2, int i10) {
        sb2.append('(');
        sb2.append(this.f130691e);
        sb2.append(i10 / 100000);
        sb2.append(')');
    }

    @Override // com.google.zxing.oned.rss.expanded.decoders.i
    protected int i(int i10) {
        return i10 % 100000;
    }
}

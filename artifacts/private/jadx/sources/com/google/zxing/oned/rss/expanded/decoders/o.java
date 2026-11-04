package com.google.zxing.oned.rss.expanded.decoders;

/* JADX INFO: loaded from: classes5.dex */
final class o extends q {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final String f130709b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f130710c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final boolean f130711d;

    o(int i10, String str) {
        super(i10);
        this.f130709b = str;
        this.f130711d = false;
        this.f130710c = 0;
    }

    String b() {
        return this.f130709b;
    }

    int c() {
        return this.f130710c;
    }

    boolean d() {
        return this.f130711d;
    }

    o(int i10, String str, int i11) {
        super(i10);
        this.f130711d = true;
        this.f130710c = i11;
        this.f130709b = str;
    }
}

package com.google.zxing.oned.rss.expanded;

import kotlinx.serialization.json.internal.AbstractJsonLexerKt;

/* JADX INFO: loaded from: classes5.dex */
final class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final boolean f130659a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final com.google.zxing.oned.rss.b f130660b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final com.google.zxing.oned.rss.b f130661c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.google.zxing.oned.rss.c f130662d;

    b(com.google.zxing.oned.rss.b bVar, com.google.zxing.oned.rss.b bVar2, com.google.zxing.oned.rss.c cVar, boolean z10) {
        this.f130660b = bVar;
        this.f130661c = bVar2;
        this.f130662d = cVar;
        this.f130659a = z10;
    }

    private static boolean a(Object obj, Object obj2) {
        if (obj == null) {
            return obj2 == null;
        }
        return obj.equals(obj2);
    }

    private static int e(Object obj) {
        if (obj == null) {
            return 0;
        }
        return obj.hashCode();
    }

    com.google.zxing.oned.rss.c b() {
        return this.f130662d;
    }

    com.google.zxing.oned.rss.b c() {
        return this.f130660b;
    }

    com.google.zxing.oned.rss.b d() {
        return this.f130661c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof b)) {
            return false;
        }
        b bVar = (b) obj;
        return a(this.f130660b, bVar.f130660b) && a(this.f130661c, bVar.f130661c) && a(this.f130662d, bVar.f130662d);
    }

    boolean f() {
        return this.f130659a;
    }

    public boolean g() {
        return this.f130661c == null;
    }

    public int hashCode() {
        return e(this.f130662d) ^ (e(this.f130660b) ^ e(this.f130661c));
    }

    public String toString() {
        StringBuilder sb2 = new StringBuilder("[ ");
        sb2.append(this.f130660b);
        sb2.append(" , ");
        sb2.append(this.f130661c);
        sb2.append(" : ");
        com.google.zxing.oned.rss.c cVar = this.f130662d;
        sb2.append(cVar == null ? AbstractJsonLexerKt.NULL : Integer.valueOf(cVar.c()));
        sb2.append(" ]");
        return sb2.toString();
    }
}

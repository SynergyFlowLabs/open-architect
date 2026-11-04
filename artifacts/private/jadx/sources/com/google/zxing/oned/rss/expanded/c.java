package com.google.zxing.oned.rss.expanded;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
final class c {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<b> f130663a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f130664b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f130665c;

    c(List<b> list, int i10, boolean z10) {
        this.f130663a = new ArrayList(list);
        this.f130664b = i10;
        this.f130665c = z10;
    }

    List<b> a() {
        return this.f130663a;
    }

    int b() {
        return this.f130664b;
    }

    boolean c(List<b> list) {
        return this.f130663a.equals(list);
    }

    boolean d() {
        return this.f130665c;
    }

    public boolean equals(Object obj) {
        if (!(obj instanceof c)) {
            return false;
        }
        c cVar = (c) obj;
        return this.f130663a.equals(cVar.a()) && this.f130665c == cVar.f130665c;
    }

    public int hashCode() {
        return Boolean.valueOf(this.f130665c).hashCode() ^ this.f130663a.hashCode();
    }

    public String toString() {
        return "{ " + this.f130663a + " }";
    }
}

package org.locationtech.jts.index.strtree;

import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes14.dex */
public class j extends org.locationtech.jts.index.strtree.b {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Comparator f338460g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private org.locationtech.jts.index.strtree.b.a f338461h;

    class a implements Comparator {
        a() {
        }

        @Override // java.util.Comparator
        public int compare(Object obj, Object obj2) {
            return org.locationtech.jts.index.strtree.b.h(((g) ((org.locationtech.jts.index.strtree.c) obj).getBounds()).b(), ((g) ((org.locationtech.jts.index.strtree.c) obj2).getBounds()).b());
        }
    }

    class b implements org.locationtech.jts.index.strtree.b.a {
        b() {
        }

        @Override // org.locationtech.jts.index.strtree.b.a
        public boolean a(Object obj, Object obj2) {
            return ((g) obj).c((g) obj2);
        }
    }

    class c extends org.locationtech.jts.index.strtree.a {
        c(int i10) {
            super(i10);
        }

        @Override // org.locationtech.jts.index.strtree.a
        protected Object b() {
            g gVar = null;
            for (org.locationtech.jts.index.strtree.c cVar : c()) {
                if (gVar == null) {
                    gVar = new g((g) cVar.getBounds());
                } else {
                    gVar.a((g) cVar.getBounds());
                }
            }
            return gVar;
        }
    }

    public j() {
        this(10);
    }

    public void F(double d10, double d11, Object obj) {
        super.r(new g(Math.min(d10, d11), Math.max(d10, d11)), obj);
    }

    public List G(double d10) {
        return H(d10, d10);
    }

    public List H(double d10, double d11) {
        return super.w(new g(Math.min(d10, d11), Math.max(d10, d11)));
    }

    @Override // org.locationtech.jts.index.strtree.b
    protected org.locationtech.jts.index.strtree.a j(int i10) {
        return new c(i10);
    }

    @Override // org.locationtech.jts.index.strtree.b
    protected Comparator n() {
        return this.f338460g;
    }

    @Override // org.locationtech.jts.index.strtree.b
    protected org.locationtech.jts.index.strtree.b.a o() {
        return this.f338461h;
    }

    public j(int i10) {
        super(i10);
        this.f338460g = new a();
        this.f338461h = new b();
    }
}

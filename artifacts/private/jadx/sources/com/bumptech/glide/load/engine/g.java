package com.bumptech.glide.load.engine;

import java.io.File;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
final class g<Transcode> {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<com.bumptech.glide.load.model.n.a<?>> f96545a = new ArrayList();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final List<com.bumptech.glide.load.g> f96546b = new ArrayList();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private com.bumptech.glide.d f96547c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Object f96548d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f96549e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f96550f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private Class<?> f96551g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private h.e f96552h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private com.bumptech.glide.load.j f96553i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Map<Class<?>, com.bumptech.glide.load.n<?>> f96554j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Class<Transcode> f96555k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f96556l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f96557m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private com.bumptech.glide.load.g f96558n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private com.bumptech.glide.h f96559o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private j f96560p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private boolean f96561q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private boolean f96562r;

    g() {
    }

    void a() {
        this.f96547c = null;
        this.f96548d = null;
        this.f96558n = null;
        this.f96551g = null;
        this.f96555k = null;
        this.f96553i = null;
        this.f96559o = null;
        this.f96554j = null;
        this.f96560p = null;
        this.f96545a.clear();
        this.f96556l = false;
        this.f96546b.clear();
        this.f96557m = false;
    }

    com.bumptech.glide.load.engine.bitmap_recycle.b b() {
        return this.f96547c.b();
    }

    List<com.bumptech.glide.load.g> c() {
        if (!this.f96557m) {
            this.f96557m = true;
            this.f96546b.clear();
            List<com.bumptech.glide.load.model.n.a<?>> listG = g();
            int size = listG.size();
            for (int i10 = 0; i10 < size; i10++) {
                com.bumptech.glide.load.model.n.a<?> aVar = listG.get(i10);
                if (!this.f96546b.contains(aVar.f96864a)) {
                    this.f96546b.add(aVar.f96864a);
                }
                for (int i11 = 0; i11 < aVar.f96865b.size(); i11++) {
                    if (!this.f96546b.contains(aVar.f96865b.get(i11))) {
                        this.f96546b.add(aVar.f96865b.get(i11));
                    }
                }
            }
        }
        return this.f96546b;
    }

    com.bumptech.glide.load.engine.cache.a d() {
        return this.f96552h.a();
    }

    j e() {
        return this.f96560p;
    }

    int f() {
        return this.f96550f;
    }

    List<com.bumptech.glide.load.model.n.a<?>> g() {
        if (!this.f96556l) {
            this.f96556l = true;
            this.f96545a.clear();
            List listI = this.f96547c.h().i(this.f96548d);
            int size = listI.size();
            for (int i10 = 0; i10 < size; i10++) {
                com.bumptech.glide.load.model.n.a<?> aVarA = ((com.bumptech.glide.load.model.n) listI.get(i10)).a(this.f96548d, this.f96549e, this.f96550f, this.f96553i);
                if (aVarA != null) {
                    this.f96545a.add(aVarA);
                }
            }
        }
        return this.f96545a;
    }

    <Data> t<Data, ?, Transcode> h(Class<Data> cls) {
        return this.f96547c.h().h(cls, this.f96551g, this.f96555k);
    }

    Class<?> i() {
        return this.f96548d.getClass();
    }

    List<com.bumptech.glide.load.model.n<File, ?>> j(File file) throws com.bumptech.glide.j.c {
        return this.f96547c.h().i(file);
    }

    com.bumptech.glide.load.j k() {
        return this.f96553i;
    }

    com.bumptech.glide.h l() {
        return this.f96559o;
    }

    List<Class<?>> m() {
        return this.f96547c.h().j(this.f96548d.getClass(), this.f96551g, this.f96555k);
    }

    <Z> com.bumptech.glide.load.m<Z> n(v<Z> vVar) {
        return this.f96547c.h().k(vVar);
    }

    com.bumptech.glide.load.g o() {
        return this.f96558n;
    }

    <X> com.bumptech.glide.load.d<X> p(X x10) throws com.bumptech.glide.j.e {
        return this.f96547c.h().m(x10);
    }

    Class<?> q() {
        return this.f96555k;
    }

    <Z> com.bumptech.glide.load.n<Z> r(Class<Z> cls) {
        com.bumptech.glide.load.n<Z> nVar = (com.bumptech.glide.load.n) this.f96554j.get(cls);
        if (nVar == null) {
            for (Map.Entry<Class<?>, com.bumptech.glide.load.n<?>> entry : this.f96554j.entrySet()) {
                if (entry.getKey().isAssignableFrom(cls)) {
                    nVar = (com.bumptech.glide.load.n) entry.getValue();
                    break;
                }
            }
        }
        if (nVar != null) {
            return nVar;
        }
        if (!this.f96554j.isEmpty() || !this.f96561q) {
            return com.bumptech.glide.load.resource.c.c();
        }
        throw new IllegalArgumentException("Missing transformation for " + cls + ". If you wish to ignore unknown resource types, use the optional transformation methods.");
    }

    int s() {
        return this.f96549e;
    }

    /* JADX WARN: Multi-variable type inference failed */
    boolean t(Class<?> cls) {
        return h(cls) != null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    <R> void u(com.bumptech.glide.d dVar, Object obj, com.bumptech.glide.load.g gVar, int i10, int i11, j jVar, Class<?> cls, Class<R> cls2, com.bumptech.glide.h hVar, com.bumptech.glide.load.j jVar2, Map<Class<?>, com.bumptech.glide.load.n<?>> map, boolean z10, boolean z11, h.e eVar) {
        this.f96547c = dVar;
        this.f96548d = obj;
        this.f96558n = gVar;
        this.f96549e = i10;
        this.f96550f = i11;
        this.f96560p = jVar;
        this.f96551g = cls;
        this.f96552h = eVar;
        this.f96555k = cls2;
        this.f96559o = hVar;
        this.f96553i = jVar2;
        this.f96554j = map;
        this.f96561q = z10;
        this.f96562r = z11;
    }

    boolean v(v<?> vVar) {
        return this.f96547c.h().n(vVar);
    }

    boolean w() {
        return this.f96562r;
    }

    boolean x(com.bumptech.glide.load.g gVar) {
        List<com.bumptech.glide.load.model.n.a<?>> listG = g();
        int size = listG.size();
        for (int i10 = 0; i10 < size; i10++) {
            if (listG.get(i10).f96864a.equals(gVar)) {
                return true;
            }
        }
        return false;
    }
}

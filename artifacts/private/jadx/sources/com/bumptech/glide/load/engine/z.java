package com.bumptech.glide.load.engine;

import android.util.Log;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import java.util.Collections;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
class z implements f, f.a {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f96773h = "SourceGenerator";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final g<?> f96774a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final f.a f96775b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f96776c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private c f96777d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Object f96778e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private volatile com.bumptech.glide.load.model.n.a<?> f96779f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private d f96780g;

    class a implements com.bumptech.glide.load.data.d.a<Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ com.bumptech.glide.load.model.n.a f96781a;

        a(com.bumptech.glide.load.model.n.a aVar) {
            this.f96781a = aVar;
        }

        @Override // com.bumptech.glide.load.data.d.a
        public void d(@p0 Object obj) {
            if (z.this.e(this.f96781a)) {
                z.this.f(this.f96781a, obj);
            }
        }

        @Override // com.bumptech.glide.load.data.d.a
        public void e(@NonNull Exception exc) {
            if (z.this.e(this.f96781a)) {
                z.this.g(this.f96781a, exc);
            }
        }
    }

    z(g<?> gVar, f.a aVar) {
        this.f96774a = gVar;
        this.f96775b = aVar;
    }

    private void c(Object obj) {
        long jB = com.bumptech.glide.util.g.b();
        try {
            com.bumptech.glide.load.d<X> dVarP = this.f96774a.p(obj);
            e eVar = new e(dVarP, obj, this.f96774a.k());
            this.f96780g = new d(this.f96779f.f96864a, this.f96774a.o());
            this.f96774a.d().a(this.f96780g, eVar);
            if (Log.isLoggable(f96773h, 2)) {
                Objects.toString(this.f96780g);
                Objects.toString(obj);
                Objects.toString(dVarP);
                com.bumptech.glide.util.g.a(jB);
            }
            this.f96779f.f96866c.b();
            this.f96777d = new c(Collections.singletonList(this.f96779f.f96864a), this.f96774a, this);
        } catch (Throwable th2) {
            this.f96779f.f96866c.b();
            throw th2;
        }
    }

    private boolean d() {
        return this.f96776c < this.f96774a.g().size();
    }

    private void h(com.bumptech.glide.load.model.n.a<?> aVar) {
        this.f96779f.f96866c.c(this.f96774a.l(), new a(aVar));
    }

    @Override // com.bumptech.glide.load.engine.f
    public boolean a() {
        Object obj = this.f96778e;
        if (obj != null) {
            this.f96778e = null;
            c(obj);
        }
        c cVar = this.f96777d;
        if (cVar != null && cVar.a()) {
            return true;
        }
        this.f96777d = null;
        this.f96779f = null;
        boolean z10 = false;
        while (!z10 && d()) {
            List<com.bumptech.glide.load.model.n.a<?>> listG = this.f96774a.g();
            int i10 = this.f96776c;
            this.f96776c = i10 + 1;
            this.f96779f = listG.get(i10);
            if (this.f96779f != null && (this.f96774a.e().c(this.f96779f.f96866c.getDataSource()) || this.f96774a.t(this.f96779f.f96866c.a()))) {
                h(this.f96779f);
                z10 = true;
            }
        }
        return z10;
    }

    @Override // com.bumptech.glide.load.engine.f.a
    public void b(com.bumptech.glide.load.g gVar, Exception exc, com.bumptech.glide.load.data.d<?> dVar, com.bumptech.glide.load.a aVar) {
        this.f96775b.b(gVar, exc, dVar, this.f96779f.f96866c.getDataSource());
    }

    @Override // com.bumptech.glide.load.engine.f
    public void cancel() {
        com.bumptech.glide.load.model.n.a<?> aVar = this.f96779f;
        if (aVar != null) {
            aVar.f96866c.cancel();
        }
    }

    boolean e(com.bumptech.glide.load.model.n.a<?> aVar) {
        com.bumptech.glide.load.model.n.a<?> aVar2 = this.f96779f;
        return aVar2 != null && aVar2 == aVar;
    }

    void f(com.bumptech.glide.load.model.n.a<?> aVar, Object obj) {
        j jVarE = this.f96774a.e();
        if (obj != null && jVarE.c(aVar.f96866c.getDataSource())) {
            this.f96778e = obj;
            this.f96775b.l();
        } else {
            f.a aVar2 = this.f96775b;
            com.bumptech.glide.load.g gVar = aVar.f96864a;
            com.bumptech.glide.load.data.d<?> dVar = aVar.f96866c;
            aVar2.n(gVar, obj, dVar, dVar.getDataSource(), this.f96780g);
        }
    }

    void g(com.bumptech.glide.load.model.n.a<?> aVar, @NonNull Exception exc) {
        f.a aVar2 = this.f96775b;
        d dVar = this.f96780g;
        com.bumptech.glide.load.data.d<?> dVar2 = aVar.f96866c;
        aVar2.b(dVar, exc, dVar2, dVar2.getDataSource());
    }

    @Override // com.bumptech.glide.load.engine.f.a
    public void l() {
        throw new UnsupportedOperationException();
    }

    @Override // com.bumptech.glide.load.engine.f.a
    public void n(com.bumptech.glide.load.g gVar, Object obj, com.bumptech.glide.load.data.d<?> dVar, com.bumptech.glide.load.a aVar, com.bumptech.glide.load.g gVar2) {
        this.f96775b.n(gVar, obj, dVar, this.f96779f.f96866c.getDataSource(), gVar);
    }
}

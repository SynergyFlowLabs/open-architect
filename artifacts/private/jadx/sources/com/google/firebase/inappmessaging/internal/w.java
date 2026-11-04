package com.google.firebase.inappmessaging.internal;

import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;

/* JADX INFO: loaded from: classes5.dex */
public class w {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Executor f122975a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private Map<com.google.firebase.inappmessaging.o, a> f122976b = new HashMap();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Map<com.google.firebase.inappmessaging.q, b> f122977c = new HashMap();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Map<com.google.firebase.inappmessaging.s, c> f122978d = new HashMap();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Map<com.google.firebase.inappmessaging.t, e> f122979e = new HashMap();

    private static abstract class d<T> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Executor f122983a;

        public d(Executor executor) {
            this.f122983a = executor;
        }

        public abstract T a();

        public Executor b(Executor executor) {
            Executor executor2 = this.f122983a;
            return executor2 == null ? executor : executor2;
        }
    }

    public w(@d8.a Executor executor) {
        this.f122975a = executor;
    }

    public void e(com.google.firebase.inappmessaging.o oVar) {
        this.f122976b.put(oVar, new a(oVar));
    }

    public void f(com.google.firebase.inappmessaging.o oVar, Executor executor) {
        this.f122976b.put(oVar, new a(oVar, executor));
    }

    public void g(com.google.firebase.inappmessaging.q qVar) {
        this.f122977c.put(qVar, new b(qVar));
    }

    public void h(com.google.firebase.inappmessaging.q qVar, Executor executor) {
        this.f122977c.put(qVar, new b(qVar, executor));
    }

    public void i(com.google.firebase.inappmessaging.s sVar) {
        this.f122978d.put(sVar, new c(sVar));
    }

    public void j(com.google.firebase.inappmessaging.s sVar, Executor executor) {
        this.f122978d.put(sVar, new c(sVar, executor));
    }

    public void k(com.google.firebase.inappmessaging.t tVar) {
        this.f122979e.put(tVar, new e(tVar));
    }

    public void l(com.google.firebase.inappmessaging.t tVar, Executor executor) {
        this.f122979e.put(tVar, new e(tVar, executor));
    }

    public void m(final com.google.firebase.inappmessaging.model.i iVar, final com.google.firebase.inappmessaging.r.b bVar) {
        for (final c cVar : this.f122978d.values()) {
            cVar.b(this.f122975a).execute(new Runnable() { // from class: com.google.firebase.inappmessaging.internal.s
                @Override // java.lang.Runnable
                public final void run() {
                    cVar.a().a(iVar, bVar);
                }
            });
        }
    }

    @androidx.annotation.l1
    public Map n() {
        HashMap map = new HashMap();
        map.putAll(this.f122976b);
        map.putAll(this.f122979e);
        map.putAll(this.f122978d);
        map.putAll(this.f122977c);
        return map;
    }

    public void o(final com.google.firebase.inappmessaging.model.i iVar) {
        for (final e eVar : this.f122979e.values()) {
            eVar.b(this.f122975a).execute(new Runnable() { // from class: com.google.firebase.inappmessaging.internal.v
                @Override // java.lang.Runnable
                public final void run() {
                    eVar.a().a(iVar);
                }
            });
        }
    }

    public void p(final com.google.firebase.inappmessaging.model.i iVar, final com.google.firebase.inappmessaging.model.a aVar) {
        for (final a aVar2 : this.f122976b.values()) {
            aVar2.b(this.f122975a).execute(new Runnable() { // from class: com.google.firebase.inappmessaging.internal.t
                @Override // java.lang.Runnable
                public final void run() {
                    aVar2.a().a(iVar, aVar);
                }
            });
        }
    }

    public void q(final com.google.firebase.inappmessaging.model.i iVar) {
        for (final b bVar : this.f122977c.values()) {
            bVar.b(this.f122975a).execute(new Runnable() { // from class: com.google.firebase.inappmessaging.internal.u
                @Override // java.lang.Runnable
                public final void run() {
                    bVar.a().a(iVar);
                }
            });
        }
    }

    public void r() {
        this.f122976b.clear();
        this.f122979e.clear();
        this.f122978d.clear();
        this.f122977c.clear();
    }

    public void s(com.google.firebase.inappmessaging.o oVar) {
        this.f122976b.remove(oVar);
    }

    public void t(com.google.firebase.inappmessaging.q qVar) {
        this.f122977c.remove(qVar);
    }

    public void u(com.google.firebase.inappmessaging.s sVar) {
        this.f122978d.remove(sVar);
    }

    public void v(com.google.firebase.inappmessaging.t tVar) {
        this.f122979e.remove(tVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class a extends d<com.google.firebase.inappmessaging.o> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        com.google.firebase.inappmessaging.o f122980b;

        public a(com.google.firebase.inappmessaging.o oVar, Executor executor) {
            super(executor);
            this.f122980b = oVar;
        }

        @Override // com.google.firebase.inappmessaging.internal.w.d
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public com.google.firebase.inappmessaging.o a() {
            return this.f122980b;
        }

        public a(com.google.firebase.inappmessaging.o oVar) {
            super(null);
            this.f122980b = oVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class b extends d<com.google.firebase.inappmessaging.q> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        com.google.firebase.inappmessaging.q f122981b;

        public b(com.google.firebase.inappmessaging.q qVar, Executor executor) {
            super(executor);
            this.f122981b = qVar;
        }

        @Override // com.google.firebase.inappmessaging.internal.w.d
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public com.google.firebase.inappmessaging.q a() {
            return this.f122981b;
        }

        public b(com.google.firebase.inappmessaging.q qVar) {
            super(null);
            this.f122981b = qVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class c extends d<com.google.firebase.inappmessaging.s> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        com.google.firebase.inappmessaging.s f122982b;

        public c(com.google.firebase.inappmessaging.s sVar, Executor executor) {
            super(executor);
            this.f122982b = sVar;
        }

        @Override // com.google.firebase.inappmessaging.internal.w.d
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public com.google.firebase.inappmessaging.s a() {
            return this.f122982b;
        }

        public c(com.google.firebase.inappmessaging.s sVar) {
            super(null);
            this.f122982b = sVar;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    static class e extends d<com.google.firebase.inappmessaging.t> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        com.google.firebase.inappmessaging.t f122984b;

        public e(com.google.firebase.inappmessaging.t tVar, Executor executor) {
            super(executor);
            this.f122984b = tVar;
        }

        @Override // com.google.firebase.inappmessaging.internal.w.d
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public com.google.firebase.inappmessaging.t a() {
            return this.f122984b;
        }

        public e(com.google.firebase.inappmessaging.t tVar) {
            super(null);
            this.f122984b = tVar;
        }
    }
}

package androidx.lifecycle;

import java.util.Iterator;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class a1<T> extends c1<T> {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private androidx.arch.core.internal.b<w0<?>, a<?>> f52159m;

    private static class a<V> implements d1<V> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final w0<V> f52160a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final d1<? super V> f52161b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f52162c = -1;

        a(w0<V> w0Var, d1<? super V> d1Var) {
            this.f52160a = w0Var;
            this.f52161b = d1Var;
        }

        void a() {
            this.f52160a.l(this);
        }

        void b() {
            this.f52160a.p(this);
        }

        @Override // androidx.lifecycle.d1
        public void c(V v10) {
            if (this.f52162c != this.f52160a.g()) {
                this.f52162c = this.f52160a.g();
                this.f52161b.c(v10);
            }
        }
    }

    public a1() {
        this.f52159m = new androidx.arch.core.internal.b<>();
    }

    @Override // androidx.lifecycle.w0
    @androidx.annotation.i
    protected void m() {
        Iterator<Map.Entry<w0<?>, a<?>>> it = this.f52159m.iterator();
        while (it.hasNext()) {
            it.next().getValue().a();
        }
    }

    @Override // androidx.lifecycle.w0
    @androidx.annotation.i
    protected void n() {
        Iterator<Map.Entry<w0<?>, a<?>>> it = this.f52159m.iterator();
        while (it.hasNext()) {
            it.next().getValue().b();
        }
    }

    @androidx.annotation.l0
    public <S> void s(w0<S> w0Var, d1<? super S> d1Var) {
        if (w0Var == null) {
            throw new NullPointerException("source cannot be null");
        }
        a<?> aVar = new a<>(w0Var, d1Var);
        a<?> aVarM = this.f52159m.m(w0Var, aVar);
        if (aVarM != null && aVarM.f52161b != d1Var) {
            throw new IllegalArgumentException("This source was already added with the different observer");
        }
        if (aVarM == null && h()) {
            aVar.a();
        }
    }

    @androidx.annotation.l0
    public <S> void t(w0<S> w0Var) {
        a<?> aVarN = this.f52159m.n(w0Var);
        if (aVarN != null) {
            aVarN.b();
        }
    }

    public a1(T t10) {
        super(t10);
        this.f52159m = new androidx.arch.core.internal.b<>();
    }
}

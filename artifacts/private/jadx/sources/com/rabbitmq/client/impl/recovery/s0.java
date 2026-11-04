package com.rabbitmq.client.impl.recovery;

import java.util.function.BiPredicate;

/* JADX INFO: loaded from: classes13.dex */
public class s0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private BiPredicate<? super y, Exception> f265773a = new BiPredicate() { // from class: com.rabbitmq.client.impl.recovery.j0
        @Override // java.util.function.BiPredicate
        public final boolean test(Object obj, Object obj2) {
            return s0.i((y) obj, (Exception) obj2);
        }
    };

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private BiPredicate<? super v, Exception> f265774b = new BiPredicate() { // from class: com.rabbitmq.client.impl.recovery.k0
        @Override // java.util.function.BiPredicate
        public final boolean test(Object obj, Object obj2) {
            return s0.g((v) obj, (Exception) obj2);
        }
    };

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private BiPredicate<? super s, Exception> f265775c = new BiPredicate() { // from class: com.rabbitmq.client.impl.recovery.l0
        @Override // java.util.function.BiPredicate
        public final boolean test(Object obj, Object obj2) {
            return s0.c((s) obj, (Exception) obj2);
        }
    };

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private BiPredicate<? super t, Exception> f265776d = new BiPredicate() { // from class: com.rabbitmq.client.impl.recovery.m0
        @Override // java.util.function.BiPredicate
        public final boolean test(Object obj, Object obj2) {
            return s0.h((t) obj, (Exception) obj2);
        }
    };

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private q.a<?> f265777e = new q.a() { // from class: com.rabbitmq.client.impl.recovery.n0
        @Override // com.rabbitmq.client.impl.recovery.q.a
        public final Object c(f0 f0Var) {
            return s0.d(f0Var);
        }
    };

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private q.a<?> f265778f = new q.a() { // from class: com.rabbitmq.client.impl.recovery.o0
        @Override // com.rabbitmq.client.impl.recovery.q.a
        public final Object c(f0 f0Var) {
            return s0.e(f0Var);
        }
    };

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private q.a<?> f265779g = new q.a() { // from class: com.rabbitmq.client.impl.recovery.p0
        @Override // com.rabbitmq.client.impl.recovery.q.a
        public final Object c(f0 f0Var) {
            return s0.a(f0Var);
        }
    };

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private q.a<?> f265780h = new q.a() { // from class: com.rabbitmq.client.impl.recovery.q0
        @Override // com.rabbitmq.client.impl.recovery.q.a
        public final Object c(f0 f0Var) {
            return s0.b(f0Var);
        }
    };

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f265781i = 2;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private n f265782j = new n() { // from class: com.rabbitmq.client.impl.recovery.r0
        @Override // com.rabbitmq.client.impl.recovery.n
        public final void a(int i10) {
            s0.f(i10);
        }
    };

    public static /* synthetic */ Object a(f0 f0Var) {
        return null;
    }

    public static /* synthetic */ Object b(f0 f0Var) {
        return null;
    }

    public static /* synthetic */ boolean c(s sVar, Exception exc) {
        return false;
    }

    public static /* synthetic */ Object d(f0 f0Var) {
        return null;
    }

    public static /* synthetic */ Object e(f0 f0Var) {
        return null;
    }

    public static /* synthetic */ void f(int i10) {
    }

    public static /* synthetic */ boolean g(v vVar, Exception exc) {
        return false;
    }

    public static /* synthetic */ boolean h(t tVar, Exception exc) {
        return false;
    }

    public static /* synthetic */ boolean i(y yVar, Exception exc) {
        return false;
    }

    public static s0 n() {
        return new s0();
    }

    public s0 j(n nVar) {
        this.f265782j = nVar;
        return this;
    }

    public s0 k(BiPredicate<? super s, Exception> biPredicate) {
        this.f265775c = biPredicate;
        return this;
    }

    public s0 l(q.a<?> aVar) {
        this.f265779g = aVar;
        return this;
    }

    public g0 m() {
        return new q(this.f265773a, this.f265774b, this.f265775c, this.f265776d, this.f265777e, this.f265778f, this.f265779g, this.f265780h, this.f265781i, this.f265782j);
    }

    public s0 o(BiPredicate<? super t, Exception> biPredicate) {
        this.f265776d = biPredicate;
        return this;
    }

    public s0 p(q.a<?> aVar) {
        this.f265780h = aVar;
        return this;
    }

    public s0 q(BiPredicate<? super v, Exception> biPredicate) {
        this.f265774b = biPredicate;
        return this;
    }

    public s0 r(q.a<?> aVar) {
        this.f265778f = aVar;
        return this;
    }

    public s0 s(BiPredicate<? super y, Exception> biPredicate) {
        this.f265773a = biPredicate;
        return this;
    }

    public s0 t(q.a<?> aVar) {
        this.f265777e = aVar;
        return this;
    }

    public s0 u(int i10) {
        this.f265781i = i10;
        return this;
    }
}

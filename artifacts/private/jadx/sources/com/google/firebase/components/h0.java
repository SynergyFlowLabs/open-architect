package com.google.firebase.components;

import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes5.dex */
class h0<T> implements z8.b<T>, z8.a<T> {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final z8.a.InterfaceC2541a<Object> f120770c = new z8.a.InterfaceC2541a() { // from class: com.google.firebase.components.e0
        @Override // z8.a.InterfaceC2541a
        public final void a(z8.b bVar) {
            h0.d(bVar);
        }
    };

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final z8.b<Object> f120771d = new z8.b() { // from class: com.google.firebase.components.f0
        @Override // z8.b
        public final Object get() {
            return h0.b();
        }
    };

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @androidx.annotation.b0("this")
    private z8.a.InterfaceC2541a<T> f120772a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private volatile z8.b<T> f120773b;

    private h0(z8.a.InterfaceC2541a<T> interfaceC2541a, z8.b<T> bVar) {
        this.f120772a = interfaceC2541a;
        this.f120773b = bVar;
    }

    public static /* synthetic */ Object b() {
        return null;
    }

    public static /* synthetic */ void c(z8.a.InterfaceC2541a interfaceC2541a, z8.a.InterfaceC2541a interfaceC2541a2, z8.b bVar) {
        interfaceC2541a.a(bVar);
        interfaceC2541a2.a(bVar);
    }

    public static /* synthetic */ void d(z8.b bVar) {
    }

    static <T> h0<T> e() {
        return new h0<>(f120770c, f120771d);
    }

    static <T> h0<T> f(z8.b<T> bVar) {
        return new h0<>(null, bVar);
    }

    @Override // z8.a
    public void a(@NonNull final z8.a.InterfaceC2541a<T> interfaceC2541a) {
        z8.b<T> bVar;
        z8.b<T> bVar2;
        z8.b<T> bVar3 = this.f120773b;
        z8.b<Object> bVar4 = f120771d;
        if (bVar3 != bVar4) {
            interfaceC2541a.a(bVar3);
            return;
        }
        synchronized (this) {
            try {
                bVar = this.f120773b;
                if (bVar != bVar4) {
                    bVar2 = bVar;
                } else {
                    final z8.a.InterfaceC2541a<T> interfaceC2541a2 = this.f120772a;
                    this.f120772a = new z8.a.InterfaceC2541a() { // from class: com.google.firebase.components.g0
                        @Override // z8.a.InterfaceC2541a
                        public final void a(z8.b bVar5) {
                            h0.c(interfaceC2541a2, interfaceC2541a, bVar5);
                        }
                    };
                    bVar2 = null;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
        if (bVar2 != null) {
            interfaceC2541a.a(bVar);
        }
    }

    void g(z8.b<T> bVar) {
        z8.a.InterfaceC2541a<T> interfaceC2541a;
        if (this.f120773b != f120771d) {
            throw new IllegalStateException("provide() can be called only once.");
        }
        synchronized (this) {
            interfaceC2541a = this.f120772a;
            this.f120772a = null;
            this.f120773b = bVar;
        }
        interfaceC2541a.a(bVar);
    }

    @Override // z8.b
    public T get() {
        return this.f120773b.get();
    }
}

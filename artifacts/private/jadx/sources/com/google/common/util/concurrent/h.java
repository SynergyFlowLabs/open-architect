package com.google.common.util.concurrent;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.annotations.c
@com.google.common.annotations.d
@o0
public abstract class h implements j2 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final com.google.common.base.s0<String> f120006a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final j2 f120007b;

    /* JADX INFO: Access modifiers changed from: private */
    final class b extends p {
        private b() {
        }

        public static /* synthetic */ void A(b bVar) throws Exception {
            bVar.getClass();
            try {
                h.this.o();
                bVar.v();
            } catch (Throwable th2) {
                f2.b(th2);
                bVar.u(th2);
            }
        }

        public static /* synthetic */ void z(b bVar) throws Exception {
            bVar.getClass();
            try {
                h.this.n();
                bVar.w();
            } catch (Throwable th2) {
                f2.b(th2);
                bVar.u(th2);
            }
        }

        @Override // com.google.common.util.concurrent.p
        protected final void n() {
            a2.q(h.this.l(), h.this.f120006a).execute(new Runnable() { // from class: com.google.common.util.concurrent.j
                @Override // java.lang.Runnable
                public final void run() throws Exception {
                    h.b.A(this.f120117a);
                }
            });
        }

        @Override // com.google.common.util.concurrent.p
        protected final void o() {
            a2.q(h.this.l(), h.this.f120006a).execute(new Runnable() { // from class: com.google.common.util.concurrent.i
                @Override // java.lang.Runnable
                public final void run() throws Exception {
                    h.b.z(this.f120100a);
                }
            });
        }

        @Override // com.google.common.util.concurrent.p
        public String toString() {
            return h.this.toString();
        }
    }

    private final class c implements com.google.common.base.s0<String> {
        private c() {
        }

        @Override // com.google.common.base.s0
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public String get() {
            return h.this.m() + " " + h.this.h();
        }
    }

    protected h() {
        this.f120006a = new c();
        this.f120007b = new b();
    }

    @Override // com.google.common.util.concurrent.j2
    public final void a(j2.a listener, Executor executor) {
        this.f120007b.a(listener, executor);
    }

    @Override // com.google.common.util.concurrent.j2
    public final void b(long timeout, TimeUnit unit) throws TimeoutException {
        this.f120007b.b(timeout, unit);
    }

    @Override // com.google.common.util.concurrent.j2
    public final void c(long timeout, TimeUnit unit) throws TimeoutException {
        this.f120007b.c(timeout, unit);
    }

    @Override // com.google.common.util.concurrent.j2
    public final void d() {
        this.f120007b.d();
    }

    @Override // com.google.common.util.concurrent.j2
    public final Throwable e() {
        return this.f120007b.e();
    }

    @Override // com.google.common.util.concurrent.j2
    public final void f() {
        this.f120007b.f();
    }

    @Override // com.google.common.util.concurrent.j2
    @z7.a
    public final j2 g() {
        this.f120007b.g();
        return this;
    }

    @Override // com.google.common.util.concurrent.j2
    public final j2.b h() {
        return this.f120007b.h();
    }

    @Override // com.google.common.util.concurrent.j2
    @z7.a
    public final j2 i() {
        this.f120007b.i();
        return this;
    }

    @Override // com.google.common.util.concurrent.j2
    public final boolean isRunning() {
        return this.f120007b.isRunning();
    }

    protected Executor l() {
        return new Executor() { // from class: com.google.common.util.concurrent.g
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                a2.n(this.f119999a.f120006a.get(), runnable).start();
            }
        };
    }

    protected String m() {
        return getClass().getSimpleName();
    }

    protected abstract void n() throws Exception;

    protected abstract void o() throws Exception;

    public String toString() {
        return m() + " [" + h() + "]";
    }
}

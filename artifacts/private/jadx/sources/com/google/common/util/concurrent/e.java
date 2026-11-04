package com.google.common.util.concurrent;

import java.util.concurrent.Executor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.logging.Level;

/* JADX INFO: loaded from: classes5.dex */
@com.google.common.annotations.c
@com.google.common.annotations.d
@o0
public abstract class e implements j2 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final s1 f119956b = new s1(e.class);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final j2 f119957a = new a();

    class a extends p {
        a() {
        }

        public static /* synthetic */ void A(a aVar) throws Exception {
            aVar.getClass();
            try {
                e.this.p();
                aVar.v();
                if (aVar.isRunning()) {
                    try {
                        e.this.m();
                    } catch (Throwable th2) {
                        f2.b(th2);
                        try {
                            e.this.o();
                        } catch (Exception e10) {
                            f2.b(e10);
                            e.f119956b.a().log(Level.WARNING, "Error while attempting to shut down the service after failure.", (Throwable) e10);
                        }
                        aVar.u(th2);
                    }
                }
                e.this.o();
                aVar.w();
            } catch (Throwable th3) {
                f2.b(th3);
                aVar.u(th3);
            }
        }

        @Override // com.google.common.util.concurrent.p
        protected final void n() {
            a2.q(e.this.l(), new com.google.common.base.s0() { // from class: com.google.common.util.concurrent.c
                @Override // com.google.common.base.s0
                public final Object get() {
                    return e.this.n();
                }
            }).execute(new Runnable() { // from class: com.google.common.util.concurrent.d
                @Override // java.lang.Runnable
                public final void run() throws Exception {
                    e.a.A(this.f119953a);
                }
            });
        }

        @Override // com.google.common.util.concurrent.p
        protected void o() {
            e.this.q();
        }

        @Override // com.google.common.util.concurrent.p
        public String toString() {
            return e.this.toString();
        }
    }

    protected e() {
    }

    @Override // com.google.common.util.concurrent.j2
    public final void a(j2.a listener, Executor executor) {
        this.f119957a.a(listener, executor);
    }

    @Override // com.google.common.util.concurrent.j2
    public final void b(long timeout, TimeUnit unit) throws TimeoutException {
        this.f119957a.b(timeout, unit);
    }

    @Override // com.google.common.util.concurrent.j2
    public final void c(long timeout, TimeUnit unit) throws TimeoutException {
        this.f119957a.c(timeout, unit);
    }

    @Override // com.google.common.util.concurrent.j2
    public final void d() {
        this.f119957a.d();
    }

    @Override // com.google.common.util.concurrent.j2
    public final Throwable e() {
        return this.f119957a.e();
    }

    @Override // com.google.common.util.concurrent.j2
    public final void f() {
        this.f119957a.f();
    }

    @Override // com.google.common.util.concurrent.j2
    @z7.a
    public final j2 g() {
        this.f119957a.g();
        return this;
    }

    @Override // com.google.common.util.concurrent.j2
    public final j2.b h() {
        return this.f119957a.h();
    }

    @Override // com.google.common.util.concurrent.j2
    @z7.a
    public final j2 i() {
        this.f119957a.i();
        return this;
    }

    @Override // com.google.common.util.concurrent.j2
    public final boolean isRunning() {
        return this.f119957a.isRunning();
    }

    protected Executor l() {
        return new Executor() { // from class: com.google.common.util.concurrent.b
            @Override // java.util.concurrent.Executor
            public final void execute(Runnable runnable) {
                a2.n(this.f119938a.n(), runnable).start();
            }
        };
    }

    protected abstract void m() throws Exception;

    /* JADX INFO: Access modifiers changed from: protected */
    public String n() {
        return getClass().getSimpleName();
    }

    protected void o() throws Exception {
    }

    protected void p() throws Exception {
    }

    protected void q() {
    }

    public String toString() {
        return n() + " [" + h() + "]";
    }
}

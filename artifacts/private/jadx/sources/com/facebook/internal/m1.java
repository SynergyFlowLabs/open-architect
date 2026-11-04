package com.facebook.internal;

import java.util.concurrent.Executor;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class m1 {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    public static final a f100002g = new a(null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f100003h = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f100004a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Executor f100005b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final ReentrantLock f100006c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @Nullable
    private c f100007d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private c f100008e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f100009f;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final void b(boolean z10) {
            if (!z10) {
                throw new com.facebook.u("Validation failed");
            }
        }

        private a() {
        }
    }

    public interface b {
        void a();

        boolean cancel();

        boolean isRunning();
    }

    /* JADX INFO: Access modifiers changed from: private */
    final class c implements b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final Runnable f100010a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        private c f100011b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        private c f100012c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f100013d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ m1 f100014e;

        public c(@NotNull m1 this$0, Runnable callback) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            Intrinsics.checkNotNullParameter(callback, "callback");
            this.f100014e = this$0;
            this.f100010a = callback;
        }

        @Override // com.facebook.internal.m1.b
        public void a() {
            ReentrantLock reentrantLock = this.f100014e.f100006c;
            m1 m1Var = this.f100014e;
            reentrantLock.lock();
            try {
                if (!isRunning()) {
                    m1Var.f100007d = e(m1Var.f100007d);
                    int i10 = 4 | 1;
                    m1Var.f100007d = b(m1Var.f100007d, true);
                }
                Unit unit = Unit.f312394a;
                reentrantLock.unlock();
            } catch (Throwable th2) {
                reentrantLock.unlock();
                throw th2;
            }
        }

        @NotNull
        public final c b(@Nullable c cVar, boolean z10) {
            a aVar = m1.f100002g;
            aVar.b(this.f100011b == null);
            aVar.b(this.f100012c == null);
            if (cVar == null) {
                this.f100012c = this;
                this.f100011b = this;
                cVar = this;
            } else {
                this.f100011b = cVar;
                c cVar2 = cVar.f100012c;
                this.f100012c = cVar2;
                if (cVar2 != null) {
                    cVar2.f100011b = this;
                }
                c cVar3 = this.f100011b;
                if (cVar3 != null) {
                    cVar3.f100012c = cVar2 == null ? null : cVar2.f100011b;
                }
            }
            return z10 ? this : cVar;
        }

        @NotNull
        public final Runnable c() {
            return this.f100010a;
        }

        @Override // com.facebook.internal.m1.b
        public boolean cancel() {
            ReentrantLock reentrantLock = this.f100014e.f100006c;
            m1 m1Var = this.f100014e;
            reentrantLock.lock();
            try {
                if (!isRunning()) {
                    m1Var.f100007d = e(m1Var.f100007d);
                    reentrantLock.unlock();
                    return true;
                }
                Unit unit = Unit.f312394a;
                reentrantLock.unlock();
                int i10 = 2 & 0;
                return false;
            } catch (Throwable th2) {
                reentrantLock.unlock();
                throw th2;
            }
        }

        @Nullable
        public final c d() {
            return this.f100011b;
        }

        @Nullable
        public final c e(@Nullable c cVar) {
            a aVar = m1.f100002g;
            aVar.b(this.f100011b != null);
            aVar.b(this.f100012c != null);
            if (cVar == this && (cVar = this.f100011b) == this) {
                cVar = null;
            }
            c cVar2 = this.f100011b;
            if (cVar2 != null) {
                cVar2.f100012c = this.f100012c;
            }
            c cVar3 = this.f100012c;
            if (cVar3 != null) {
                cVar3.f100011b = cVar2;
            }
            this.f100012c = null;
            this.f100011b = null;
            return cVar;
        }

        public void f(boolean z10) {
            this.f100013d = z10;
        }

        public final void g(boolean z10) {
            c cVar;
            c cVar2;
            a aVar = m1.f100002g;
            c cVar3 = this.f100012c;
            if (cVar3 == null || (cVar = cVar3.f100011b) == null) {
                cVar = this;
            }
            aVar.b(cVar == this);
            c cVar4 = this.f100011b;
            if (cVar4 == null || (cVar2 = cVar4.f100012c) == null) {
                cVar2 = this;
            }
            aVar.b(cVar2 == this);
            aVar.b(isRunning() == z10);
        }

        @Override // com.facebook.internal.m1.b
        public boolean isRunning() {
            return this.f100013d;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @oj.j
    public m1() {
        this(0, null, 3, 0 == true ? 1 : 0);
    }

    public static /* synthetic */ b g(m1 m1Var, Runnable runnable, boolean z10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = true;
        }
        return m1Var.f(runnable, z10);
    }

    private final void h(final c cVar) {
        this.f100005b.execute(new Runnable() { // from class: com.facebook.internal.l1
            @Override // java.lang.Runnable
            public final void run() {
                m1.i(cVar, this);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void i(c node, m1 this$0) {
        Intrinsics.checkNotNullParameter(node, "$node");
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        try {
            node.c().run();
            this$0.j(node);
        } catch (Throwable th2) {
            this$0.j(node);
            throw th2;
        }
    }

    private final void j(c cVar) {
        c cVar2;
        this.f100006c.lock();
        if (cVar != null) {
            this.f100008e = cVar.e(this.f100008e);
            this.f100009f--;
        }
        if (this.f100009f < this.f100004a) {
            cVar2 = this.f100007d;
            if (cVar2 != null) {
                this.f100007d = cVar2.e(cVar2);
                this.f100008e = cVar2.b(this.f100008e, false);
                this.f100009f++;
                cVar2.f(true);
            }
        } else {
            cVar2 = null;
        }
        this.f100006c.unlock();
        if (cVar2 != null) {
            h(cVar2);
        }
    }

    private final void k() {
        j(null);
    }

    @oj.j
    @NotNull
    public final b e(@NotNull Runnable callback) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        return g(this, callback, false, 2, null);
    }

    @oj.j
    @NotNull
    public final b f(@NotNull Runnable callback, boolean z10) {
        Intrinsics.checkNotNullParameter(callback, "callback");
        c cVar = new c(this, callback);
        ReentrantLock reentrantLock = this.f100006c;
        reentrantLock.lock();
        try {
            this.f100007d = cVar.b(this.f100007d, z10);
            Unit unit = Unit.f312394a;
            reentrantLock.unlock();
            k();
            return cVar;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final void l() {
        ReentrantLock reentrantLock = this.f100006c;
        reentrantLock.lock();
        try {
            c cVarD = this.f100008e;
            int i10 = 0;
            if (cVarD != null) {
                do {
                    if (cVarD == null) {
                        throw new IllegalStateException("Required value was null.");
                    }
                    cVarD.g(true);
                    i10++;
                    cVarD = cVarD.d();
                } while (cVarD != this.f100008e);
            }
            f100002g.b(this.f100009f == i10);
            Unit unit = Unit.f312394a;
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @oj.j
    public m1(int i10) {
        this(i10, null, 2, 0 == true ? 1 : 0);
    }

    @oj.j
    public m1(int i10, @NotNull Executor executor) {
        Intrinsics.checkNotNullParameter(executor, "executor");
        this.f100004a = i10;
        this.f100005b = executor;
        this.f100006c = new ReentrantLock();
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public /* synthetic */ m1(int i10, Executor executor, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        i10 = (i11 & 1) != 0 ? 8 : i10;
        if ((i11 & 2) != 0) {
            com.facebook.g0 g0Var = com.facebook.g0.f99617a;
            executor = com.facebook.g0.y();
        }
        this(i10, executor);
    }
}

package androidx.room;

import java.util.Set;
import java.util.concurrent.Callable;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@e.a({"RestrictedApi"})
public final class i2<T> extends androidx.lifecycle.w0<T> {

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private final b2 f74881m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private final j0 f74882n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final boolean f74883o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    private final Callable<T> f74884p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    private final l0.c f74885q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    private final AtomicBoolean f74886r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private final AtomicBoolean f74887s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    private final AtomicBoolean f74888t;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    private final Runnable f74889u;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    private final Runnable f74890v;

    public static final class a extends l0.c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ i2<T> f74891b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(String[] strArr, i2<T> i2Var) {
            super(strArr);
            this.f74891b = i2Var;
        }

        @Override // androidx.room.l0.c
        public void c(@NotNull Set<String> tables) {
            Intrinsics.checkNotNullParameter(tables, "tables");
            androidx.arch.core.executor.c.h().b(this.f74891b.z());
        }
    }

    public i2(@NotNull b2 database, @NotNull j0 container, boolean z10, @NotNull Callable<T> computeFunction, @NotNull String[] tableNames) {
        Intrinsics.checkNotNullParameter(database, "database");
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(computeFunction, "computeFunction");
        Intrinsics.checkNotNullParameter(tableNames, "tableNames");
        this.f74881m = database;
        this.f74882n = container;
        this.f74883o = z10;
        this.f74884p = computeFunction;
        this.f74885q = new a(tableNames, this);
        this.f74886r = new AtomicBoolean(true);
        this.f74887s = new AtomicBoolean(false);
        this.f74888t = new AtomicBoolean(false);
        this.f74889u = new Runnable() { // from class: androidx.room.g2
            @Override // java.lang.Runnable
            public final void run() {
                i2.F(this.f74840a);
            }
        };
        this.f74890v = new Runnable() { // from class: androidx.room.h2
            @Override // java.lang.Runnable
            public final void run() {
                i2.E(this.f74851a);
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void E(i2 this$0) {
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        boolean zH = this$0.h();
        if (this$0.f74886r.compareAndSet(false, true) && zH) {
            this$0.B().execute(this$0.f74889u);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void F(i2 this$0) {
        boolean z10;
        Intrinsics.checkNotNullParameter(this$0, "this$0");
        if (this$0.f74888t.compareAndSet(false, true)) {
            this$0.f74881m.getInvalidationTracker().d(this$0.f74885q);
        }
        do {
            if (this$0.f74887s.compareAndSet(false, true)) {
                T tCall = null;
                z10 = false;
                while (this$0.f74886r.compareAndSet(true, false)) {
                    try {
                        try {
                            tCall = this$0.f74884p.call();
                            z10 = true;
                        } catch (Exception e10) {
                            throw new RuntimeException("Exception while computing database live data.", e10);
                        }
                    } catch (Throwable th2) {
                        this$0.f74887s.set(false);
                        throw th2;
                    }
                }
                if (z10) {
                    this$0.o(tCall);
                }
                this$0.f74887s.set(false);
            } else {
                z10 = false;
            }
            if (!z10) {
                break;
            }
        } while (this$0.f74886r.get());
    }

    @NotNull
    public final l0.c A() {
        return this.f74885q;
    }

    @NotNull
    public final Executor B() {
        return this.f74883o ? this.f74881m.getTransactionExecutor() : this.f74881m.getQueryExecutor();
    }

    @NotNull
    public final Runnable C() {
        return this.f74889u;
    }

    @NotNull
    public final AtomicBoolean D() {
        return this.f74888t;
    }

    @Override // androidx.lifecycle.w0
    protected void m() {
        super.m();
        j0 j0Var = this.f74882n;
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type androidx.lifecycle.LiveData<kotlin.Any>");
        j0Var.c(this);
        B().execute(this.f74889u);
    }

    @Override // androidx.lifecycle.w0
    protected void n() {
        super.n();
        j0 j0Var = this.f74882n;
        Intrinsics.checkNotNull(this, "null cannot be cast to non-null type androidx.lifecycle.LiveData<kotlin.Any>");
        j0Var.d(this);
    }

    @NotNull
    public final Callable<T> u() {
        return this.f74884p;
    }

    @NotNull
    public final AtomicBoolean v() {
        return this.f74887s;
    }

    @NotNull
    public final b2 w() {
        return this.f74881m;
    }

    public final boolean x() {
        return this.f74883o;
    }

    @NotNull
    public final AtomicBoolean y() {
        return this.f74886r;
    }

    @NotNull
    public final Runnable z() {
        return this.f74890v;
    }
}

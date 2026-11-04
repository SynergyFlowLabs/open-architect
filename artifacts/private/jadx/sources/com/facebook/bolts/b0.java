package com.facebook.bolts;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.locks.Condition;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.q1;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes4.dex */
public final class b0<TResult> {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    public static final a f99290j = new a(null);

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @oj.f
    @NotNull
    public static final ExecutorService f99291k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private static final Executor f99292l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @oj.f
    @NotNull
    public static final Executor f99293m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @Nullable
    private static volatile c f99294n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    private static final b0<?> f99295o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    private static final b0<Boolean> f99296p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    private static final b0<Boolean> f99297q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    private static final b0<?> f99298r;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final ReentrantLock f99299a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Condition f99300b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f99301c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f99302d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private TResult f99303e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private Exception f99304f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f99305g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private d0 f99306h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    private List<l<TResult, Void>> f99307i;

    public static final class a {

        /* JADX INFO: renamed from: com.facebook.bolts.b0$a$a, reason: collision with other inner class name */
        static final class C0907a<TTaskResult, TContinuationResult> implements l {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ ReentrantLock f99308a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ AtomicBoolean f99309b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ AtomicInteger f99310c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ ArrayList<Exception> f99311d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ c0<Void> f99312e;

            C0907a(ReentrantLock reentrantLock, AtomicBoolean atomicBoolean, AtomicInteger atomicInteger, ArrayList<Exception> arrayList, c0<Void> c0Var) {
                this.f99308a = reentrantLock;
                this.f99309b = atomicBoolean;
                this.f99310c = atomicInteger;
                this.f99311d = arrayList;
                this.f99312e = c0Var;
            }

            @Override // com.facebook.bolts.l
            @Nullable
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Void a(@NotNull b0<Object> it) {
                Intrinsics.checkNotNullParameter(it, "it");
                if (it.S()) {
                    ReentrantLock reentrantLock = this.f99308a;
                    ArrayList<Exception> arrayList = this.f99311d;
                    reentrantLock.lock();
                    try {
                        arrayList.add(it.N());
                        reentrantLock.unlock();
                    } catch (Throwable th2) {
                        reentrantLock.unlock();
                        throw th2;
                    }
                }
                if (it.Q()) {
                    this.f99309b.set(true);
                }
                if (this.f99310c.decrementAndGet() == 0) {
                    if (this.f99311d.size() != 0) {
                        if (this.f99311d.size() == 1) {
                            this.f99312e.c(this.f99311d.get(0));
                        } else {
                            q1 q1Var = q1.f312784a;
                            String str = String.format("There were %d exceptions.", Arrays.copyOf(new Object[]{Integer.valueOf(this.f99311d.size())}, 1));
                            Intrinsics.checkNotNullExpressionValue(str, "java.lang.String.format(format, *args)");
                            this.f99312e.c(new com.facebook.bolts.a(str, this.f99311d));
                        }
                    } else if (this.f99309b.get()) {
                        this.f99312e.b();
                    } else {
                        this.f99312e.d(null);
                    }
                }
                return null;
            }
        }

        public static final class b implements l<Void, List<? extends TResult>> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Collection<b0<TResult>> f99313a;

            b(Collection<b0<TResult>> collection) {
                this.f99313a = collection;
            }

            @Override // com.facebook.bolts.l
            @NotNull
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public List<TResult> a(@NotNull b0<Void> task) {
                Intrinsics.checkNotNullParameter(task, "task");
                if (this.f99313a.isEmpty()) {
                    return CollectionsKt.emptyList();
                }
                ArrayList arrayList = new ArrayList();
                Iterator<b0<TResult>> it = this.f99313a.iterator();
                while (it.hasNext()) {
                    arrayList.add(it.next().O());
                }
                return arrayList;
            }
        }

        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void A(c0 tcs) {
            Intrinsics.checkNotNullParameter(tcs, "$tcs");
            tcs.g(null);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void B(ScheduledFuture scheduledFuture, c0 tcs) {
            Intrinsics.checkNotNullParameter(tcs, "$tcs");
            scheduledFuture.cancel(true);
            tcs.e();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Void J(AtomicBoolean isAnyTaskComplete, c0 firstCompleted, b0 it) {
            Intrinsics.checkNotNullParameter(isAnyTaskComplete, "$isAnyTaskComplete");
            Intrinsics.checkNotNullParameter(firstCompleted, "$firstCompleted");
            Intrinsics.checkNotNullParameter(it, "it");
            if (isAnyTaskComplete.compareAndSet(false, true)) {
                firstCompleted.d(it);
            } else {
                it.N();
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Void L(AtomicBoolean isAnyTaskComplete, c0 firstCompleted, b0 it) {
            Intrinsics.checkNotNullParameter(isAnyTaskComplete, "$isAnyTaskComplete");
            Intrinsics.checkNotNullParameter(firstCompleted, "$firstCompleted");
            Intrinsics.checkNotNullParameter(it, "it");
            if (isAnyTaskComplete.compareAndSet(false, true)) {
                firstCompleted.d(it);
                return null;
            }
            it.N();
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public static final void o(h hVar, c0 tcs, Callable callable) {
            Intrinsics.checkNotNullParameter(tcs, "$tcs");
            Intrinsics.checkNotNullParameter(callable, "$callable");
            if (hVar != null && hVar.a()) {
                tcs.b();
                return;
            }
            try {
                tcs.d(callable.call());
            } catch (CancellationException unused) {
                tcs.b();
            } catch (Exception e10) {
                tcs.c(e10);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final <TContinuationResult, TResult> void s(final c0<TContinuationResult> c0Var, final l<TResult, b0<TContinuationResult>> lVar, final b0<TResult> b0Var, Executor executor, final h hVar) {
            try {
                executor.execute(new Runnable() { // from class: com.facebook.bolts.t
                    @Override // java.lang.Runnable
                    public final void run() {
                        b0.a.t(hVar, c0Var, lVar, b0Var);
                    }
                });
            } catch (Exception e10) {
                c0Var.c(new m(e10));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void t(final h hVar, final c0 tcs, l continuation, b0 task) {
            Intrinsics.checkNotNullParameter(tcs, "$tcs");
            Intrinsics.checkNotNullParameter(continuation, "$continuation");
            Intrinsics.checkNotNullParameter(task, "$task");
            if (hVar != null && hVar.a()) {
                tcs.b();
                return;
            }
            try {
                b0 b0Var = (b0) continuation.a(task);
                if (b0Var == null) {
                    tcs.d(null);
                } else {
                    b0Var.y(new l() { // from class: com.facebook.bolts.u
                        @Override // com.facebook.bolts.l
                        public final Object a(b0 b0Var2) {
                            return b0.a.u(hVar, tcs, b0Var2);
                        }
                    });
                }
            } catch (CancellationException unused) {
                tcs.b();
            } catch (Exception e10) {
                tcs.c(e10);
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public static final Void u(h hVar, c0 tcs, b0 task) {
            Intrinsics.checkNotNullParameter(tcs, "$tcs");
            Intrinsics.checkNotNullParameter(task, "task");
            if (hVar != null && hVar.a()) {
                tcs.b();
                return null;
            }
            if (task.Q()) {
                tcs.b();
            } else if (task.S()) {
                tcs.c(task.N());
            } else {
                tcs.d(task.O());
            }
            return null;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public final <TContinuationResult, TResult> void v(final c0<TContinuationResult> c0Var, final l<TResult, TContinuationResult> lVar, final b0<TResult> b0Var, Executor executor, final h hVar) {
            try {
                executor.execute(new Runnable() { // from class: com.facebook.bolts.z
                    @Override // java.lang.Runnable
                    public final void run() {
                        b0.a.w(hVar, c0Var, lVar, b0Var);
                    }
                });
            } catch (Exception e10) {
                c0Var.c(new m(e10));
            }
        }

        /* JADX INFO: Access modifiers changed from: private */
        /* JADX WARN: Multi-variable type inference failed */
        public static final void w(h hVar, c0 tcs, l continuation, b0 task) {
            Intrinsics.checkNotNullParameter(tcs, "$tcs");
            Intrinsics.checkNotNullParameter(continuation, "$continuation");
            Intrinsics.checkNotNullParameter(task, "$task");
            if (hVar != null && hVar.a()) {
                tcs.b();
                return;
            }
            try {
                tcs.d(continuation.a(task));
            } catch (CancellationException unused) {
                tcs.b();
            } catch (Exception e10) {
                tcs.c(e10);
            }
        }

        @oj.n
        @NotNull
        public final <TResult> b0<TResult> C(@Nullable Exception exc) {
            c0 c0Var = new c0();
            c0Var.c(exc);
            return c0Var.a();
        }

        /* JADX WARN: Multi-variable type inference failed */
        @oj.n
        @NotNull
        public final <TResult> b0<TResult> D(@Nullable TResult tresult) {
            if (tresult == 0) {
                return b0.f99295o;
            }
            if (tresult instanceof Boolean) {
                return ((Boolean) tresult).booleanValue() ? b0.f99296p : b0.f99297q;
            }
            c0 c0Var = new c0();
            c0Var.d(tresult);
            return c0Var.a();
        }

        @oj.n
        @Nullable
        public final c E() {
            return b0.f99294n;
        }

        @oj.n
        public final void F(@Nullable c cVar) {
            b0.f99294n = cVar;
        }

        @oj.n
        @NotNull
        public final b0<Void> G(@NotNull Collection<? extends b0<?>> tasks) {
            Intrinsics.checkNotNullParameter(tasks, "tasks");
            if (tasks.isEmpty()) {
                int i10 = 5 >> 0;
                return D(null);
            }
            c0 c0Var = new c0();
            ArrayList arrayList = new ArrayList();
            ReentrantLock reentrantLock = new ReentrantLock();
            AtomicInteger atomicInteger = new AtomicInteger(tasks.size());
            AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            Iterator<? extends b0<?>> it = tasks.iterator();
            while (it.hasNext()) {
                it.next().y(new C0907a(reentrantLock, atomicBoolean, atomicInteger, arrayList, c0Var));
            }
            return c0Var.a();
        }

        @oj.n
        @NotNull
        public final <TResult> b0<List<TResult>> H(@NotNull Collection<b0<TResult>> tasks) {
            Intrinsics.checkNotNullParameter(tasks, "tasks");
            return (b0<List<TResult>>) G(tasks).V(new b(tasks));
        }

        @oj.n
        @NotNull
        public final b0<b0<?>> I(@NotNull Collection<? extends b0<?>> tasks) {
            Intrinsics.checkNotNullParameter(tasks, "tasks");
            if (tasks.isEmpty()) {
                return D(null);
            }
            final c0 c0Var = new c0();
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            Iterator<? extends b0<?>> it = tasks.iterator();
            while (it.hasNext()) {
                it.next().y(new l() { // from class: com.facebook.bolts.a0
                    @Override // com.facebook.bolts.l
                    public final Object a(b0 b0Var) {
                        return b0.a.J(atomicBoolean, c0Var, b0Var);
                    }
                });
            }
            return c0Var.a();
        }

        @oj.n
        @NotNull
        public final <TResult> b0<b0<TResult>> K(@NotNull Collection<b0<TResult>> tasks) {
            Intrinsics.checkNotNullParameter(tasks, "tasks");
            if (tasks.isEmpty()) {
                return D(null);
            }
            final c0 c0Var = new c0();
            final AtomicBoolean atomicBoolean = new AtomicBoolean(false);
            Iterator<b0<TResult>> it = tasks.iterator();
            while (it.hasNext()) {
                it.next().y(new l() { // from class: com.facebook.bolts.v
                    @Override // com.facebook.bolts.l
                    public final Object a(b0 b0Var) {
                        return b0.a.L(atomicBoolean, c0Var, b0Var);
                    }
                });
            }
            return c0Var.a();
        }

        @oj.n
        @NotNull
        public final <TResult> b0<TResult> k(@NotNull Callable<TResult> callable) {
            Intrinsics.checkNotNullParameter(callable, "callable");
            return n(callable, b0.f99292l, null);
        }

        @oj.n
        @NotNull
        public final <TResult> b0<TResult> l(@NotNull Callable<TResult> callable, @Nullable h hVar) {
            Intrinsics.checkNotNullParameter(callable, "callable");
            return n(callable, b0.f99292l, hVar);
        }

        @oj.n
        @NotNull
        public final <TResult> b0<TResult> m(@NotNull Callable<TResult> callable, @NotNull Executor executor) {
            Intrinsics.checkNotNullParameter(callable, "callable");
            Intrinsics.checkNotNullParameter(executor, "executor");
            return n(callable, executor, null);
        }

        @oj.n
        @NotNull
        public final <TResult> b0<TResult> n(@NotNull final Callable<TResult> callable, @NotNull Executor executor, @Nullable final h hVar) {
            Intrinsics.checkNotNullParameter(callable, "callable");
            Intrinsics.checkNotNullParameter(executor, "executor");
            final c0 c0Var = new c0();
            try {
                executor.execute(new Runnable() { // from class: com.facebook.bolts.y
                    @Override // java.lang.Runnable
                    public final void run() {
                        b0.a.o(hVar, c0Var, callable);
                    }
                });
            } catch (Exception e10) {
                c0Var.c(new m(e10));
            }
            return c0Var.a();
        }

        @oj.n
        @NotNull
        public final <TResult> b0<TResult> p(@NotNull Callable<TResult> callable) {
            Intrinsics.checkNotNullParameter(callable, "callable");
            return n(callable, b0.f99291k, null);
        }

        @oj.n
        @NotNull
        public final <TResult> b0<TResult> q(@NotNull Callable<TResult> callable, @Nullable h hVar) {
            Intrinsics.checkNotNullParameter(callable, "callable");
            return n(callable, b0.f99291k, hVar);
        }

        @oj.n
        @NotNull
        public final <TResult> b0<TResult> r() {
            return b0.f99298r;
        }

        @oj.n
        @NotNull
        public final b0<Void> x(long j10) {
            return z(j10, f.f99331d.e(), null);
        }

        @oj.n
        @NotNull
        public final b0<Void> y(long j10, @Nullable h hVar) {
            return z(j10, f.f99331d.e(), hVar);
        }

        @oj.n
        @NotNull
        public final b0<Void> z(long j10, @NotNull ScheduledExecutorService executor, @Nullable h hVar) {
            Intrinsics.checkNotNullParameter(executor, "executor");
            if (hVar != null && hVar.a()) {
                return r();
            }
            if (j10 <= 0) {
                return D(null);
            }
            final c0 c0Var = new c0();
            final ScheduledFuture<?> scheduledFutureSchedule = executor.schedule(new Runnable() { // from class: com.facebook.bolts.w
                @Override // java.lang.Runnable
                public final void run() {
                    b0.a.A(c0Var);
                }
            }, j10, TimeUnit.MILLISECONDS);
            if (hVar != null) {
                hVar.b(new Runnable() { // from class: com.facebook.bolts.x
                    @Override // java.lang.Runnable
                    public final void run() {
                        b0.a.B(scheduledFutureSchedule, c0Var);
                    }
                });
            }
            return c0Var.a();
        }

        private a() {
        }
    }

    @kotlin.l(message = "Please use [TaskCompletionSource] instead. ")
    public final class b extends c0<TResult> {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ b0<TResult> f99314b;

        public b(b0 this$0) {
            Intrinsics.checkNotNullParameter(this$0, "this$0");
            this.f99314b = this$0;
        }
    }

    public interface c {
        void a(@NotNull b0<?> b0Var, @NotNull e0 e0Var);
    }

    public static final class d implements l<Void, b0<Void>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ h f99315a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Callable<Boolean> f99316b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ l<Void, b0<Void>> f99317c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Executor f99318d;

        d(h hVar, Callable<Boolean> callable, l<Void, b0<Void>> lVar, Executor executor) {
            this.f99315a = hVar;
            this.f99316b = callable;
            this.f99317c = lVar;
            this.f99318d = executor;
        }

        @Override // com.facebook.bolts.l
        @NotNull
        /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
        public b0<Void> a(@NotNull b0<Void> task) throws Exception {
            Intrinsics.checkNotNullParameter(task, "task");
            h hVar = this.f99315a;
            if (hVar != null && hVar.a()) {
                return b0.f99290j.r();
            }
            Boolean boolCall = this.f99316b.call();
            Intrinsics.checkNotNullExpressionValue(boolCall, "predicate.call()");
            return boolCall.booleanValue() ? b0.f99290j.D(null).c0(this.f99317c, this.f99318d).c0(this, this.f99318d) : b0.f99290j.D(null);
        }
    }

    static {
        int i10 = 7 & 0;
        f.a aVar = f.f99331d;
        f99291k = aVar.b();
        f99292l = aVar.c();
        f99293m = com.facebook.bolts.b.f99283b.b();
        f99295o = new b0<>((Object) null);
        f99296p = new b0<>(Boolean.TRUE);
        f99297q = new b0<>(Boolean.FALSE);
        f99298r = new b0<>(true);
    }

    public b0() {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f99299a = reentrantLock;
        this.f99300b = reentrantLock.newCondition();
        this.f99307i = new ArrayList();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void C(c0 tcs, l continuation, Executor executor, h hVar, b0 task) {
        Intrinsics.checkNotNullParameter(tcs, "$tcs");
        Intrinsics.checkNotNullParameter(continuation, "$continuation");
        Intrinsics.checkNotNullParameter(executor, "$executor");
        Intrinsics.checkNotNullParameter(task, "task");
        f99290j.v(tcs, continuation, task, executor, hVar);
        return null;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Void H(c0 tcs, l continuation, Executor executor, h hVar, b0 task) {
        Intrinsics.checkNotNullParameter(tcs, "$tcs");
        Intrinsics.checkNotNullParameter(continuation, "$continuation");
        Intrinsics.checkNotNullParameter(executor, "$executor");
        Intrinsics.checkNotNullParameter(task, "task");
        f99290j.s(tcs, continuation, task, executor, hVar);
        return null;
    }

    @oj.n
    @NotNull
    public static final b0<Void> I(long j10) {
        return f99290j.x(j10);
    }

    @oj.n
    @NotNull
    public static final b0<Void> J(long j10, @Nullable h hVar) {
        return f99290j.y(j10, hVar);
    }

    @oj.n
    @NotNull
    public static final b0<Void> K(long j10, @NotNull ScheduledExecutorService scheduledExecutorService, @Nullable h hVar) {
        return f99290j.z(j10, scheduledExecutorService, hVar);
    }

    @oj.n
    @NotNull
    public static final <TResult> b0<TResult> L(@Nullable Exception exc) {
        return f99290j.C(exc);
    }

    @oj.n
    @NotNull
    public static final <TResult> b0<TResult> M(@Nullable TResult tresult) {
        return f99290j.D(tresult);
    }

    @oj.n
    @Nullable
    public static final c P() {
        return f99290j.E();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b0 U(b0 task) {
        Intrinsics.checkNotNullParameter(task, "task");
        if (task.Q()) {
            return f99290j.r();
        }
        return task.S() ? f99290j.C(task.N()) : f99290j.D(null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b0 Z(h hVar, l continuation, b0 task) {
        Intrinsics.checkNotNullParameter(continuation, "$continuation");
        Intrinsics.checkNotNullParameter(task, "task");
        if (hVar != null && hVar.a()) {
            return f99290j.r();
        }
        if (task.S()) {
            return f99290j.C(task.N());
        }
        return task.Q() ? f99290j.r() : task.y(continuation);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final b0 e0(h hVar, l continuation, b0 task) {
        Intrinsics.checkNotNullParameter(continuation, "$continuation");
        Intrinsics.checkNotNullParameter(task, "task");
        if (hVar != null && hVar.a()) {
            return f99290j.r();
        }
        if (task.S()) {
            return f99290j.C(task.N());
        }
        return task.Q() ? f99290j.r() : task.D(continuation);
    }

    private final void f0() {
        ReentrantLock reentrantLock = this.f99299a;
        reentrantLock.lock();
        try {
            List<l<TResult, Void>> list = this.f99307i;
            if (list != null) {
                Iterator<T> it = list.iterator();
                while (it.hasNext()) {
                    try {
                        ((l) it.next()).a(this);
                    } catch (RuntimeException e10) {
                        throw e10;
                    } catch (Throwable th2) {
                        throw new RuntimeException(th2);
                    }
                }
            }
            this.f99307i = null;
            Unit unit = Unit.f312394a;
            reentrantLock.unlock();
        } catch (Throwable th3) {
            reentrantLock.unlock();
            throw th3;
        }
    }

    @oj.n
    public static final void g0(@Nullable c cVar) {
        f99290j.F(cVar);
    }

    @oj.n
    @NotNull
    public static final <TResult> b0<TResult> m(@NotNull Callable<TResult> callable) {
        return f99290j.k(callable);
    }

    @oj.n
    @NotNull
    public static final b0<Void> m0(@NotNull Collection<? extends b0<?>> collection) {
        return f99290j.G(collection);
    }

    @oj.n
    @NotNull
    public static final <TResult> b0<TResult> n(@NotNull Callable<TResult> callable, @Nullable h hVar) {
        return f99290j.l(callable, hVar);
    }

    @oj.n
    @NotNull
    public static final <TResult> b0<List<TResult>> n0(@NotNull Collection<b0<TResult>> collection) {
        return f99290j.H(collection);
    }

    @oj.n
    @NotNull
    public static final <TResult> b0<TResult> o(@NotNull Callable<TResult> callable, @NotNull Executor executor) {
        return f99290j.m(callable, executor);
    }

    @oj.n
    @NotNull
    public static final b0<b0<?>> o0(@NotNull Collection<? extends b0<?>> collection) {
        return f99290j.I(collection);
    }

    @oj.n
    @NotNull
    public static final <TResult> b0<TResult> p(@NotNull Callable<TResult> callable, @NotNull Executor executor, @Nullable h hVar) {
        return f99290j.n(callable, executor, hVar);
    }

    @oj.n
    @NotNull
    public static final <TResult> b0<b0<TResult>> p0(@NotNull Collection<b0<TResult>> collection) {
        return f99290j.K(collection);
    }

    @oj.n
    @NotNull
    public static final <TResult> b0<TResult> q(@NotNull Callable<TResult> callable) {
        return f99290j.p(callable);
    }

    @oj.n
    @NotNull
    public static final <TResult> b0<TResult> r(@NotNull Callable<TResult> callable, @Nullable h hVar) {
        return f99290j.q(callable, hVar);
    }

    @oj.n
    @NotNull
    public static final <TResult> b0<TResult> s() {
        return f99290j.r();
    }

    public static /* synthetic */ b0 x(b0 b0Var, Callable callable, l lVar, Executor executor, h hVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            executor = f99292l;
        }
        if ((i10 & 8) != 0) {
            hVar = null;
        }
        return b0Var.w(callable, lVar, executor, hVar);
    }

    @NotNull
    public final <TContinuationResult> b0<TContinuationResult> A(@NotNull l<TResult, TContinuationResult> continuation, @NotNull Executor executor) {
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        Intrinsics.checkNotNullParameter(executor, "executor");
        return B(continuation, executor, null);
    }

    @NotNull
    public final <TContinuationResult> b0<TContinuationResult> B(@NotNull final l<TResult, TContinuationResult> continuation, @NotNull final Executor executor, @Nullable final h hVar) {
        List<l<TResult, Void>> list;
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        Intrinsics.checkNotNullParameter(executor, "executor");
        final c0 c0Var = new c0();
        ReentrantLock reentrantLock = this.f99299a;
        reentrantLock.lock();
        try {
            boolean zR = R();
            if (!zR && (list = this.f99307i) != null) {
                list.add(new l() { // from class: com.facebook.bolts.p
                    @Override // com.facebook.bolts.l
                    public final Object a(b0 b0Var) {
                        return b0.C(c0Var, continuation, executor, hVar, b0Var);
                    }
                });
            }
            Unit unit = Unit.f312394a;
            reentrantLock.unlock();
            if (zR) {
                f99290j.v(c0Var, continuation, this, executor, hVar);
            }
            return c0Var.a();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    @NotNull
    public final <TContinuationResult> b0<TContinuationResult> D(@NotNull l<TResult, b0<TContinuationResult>> continuation) {
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        return G(continuation, f99292l, null);
    }

    @NotNull
    public final <TContinuationResult> b0<TContinuationResult> E(@NotNull l<TResult, b0<TContinuationResult>> continuation, @Nullable h hVar) {
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        return G(continuation, f99292l, hVar);
    }

    @NotNull
    public final <TContinuationResult> b0<TContinuationResult> F(@NotNull l<TResult, b0<TContinuationResult>> continuation, @NotNull Executor executor) {
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        Intrinsics.checkNotNullParameter(executor, "executor");
        return G(continuation, executor, null);
    }

    @NotNull
    public final <TContinuationResult> b0<TContinuationResult> G(@NotNull final l<TResult, b0<TContinuationResult>> continuation, @NotNull final Executor executor, @Nullable final h hVar) {
        List<l<TResult, Void>> list;
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        Intrinsics.checkNotNullParameter(executor, "executor");
        final c0 c0Var = new c0();
        ReentrantLock reentrantLock = this.f99299a;
        reentrantLock.lock();
        try {
            boolean zR = R();
            if (!zR && (list = this.f99307i) != null) {
                list.add(new l() { // from class: com.facebook.bolts.s
                    @Override // com.facebook.bolts.l
                    public final Object a(b0 b0Var) {
                        return b0.H(c0Var, continuation, executor, hVar, b0Var);
                    }
                });
            }
            Unit unit = Unit.f312394a;
            reentrantLock.unlock();
            if (zR) {
                f99290j.s(c0Var, continuation, this, executor, hVar);
            }
            return c0Var.a();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    @Nullable
    public final Exception N() {
        ReentrantLock reentrantLock = this.f99299a;
        reentrantLock.lock();
        try {
            if (this.f99304f != null) {
                this.f99305g = true;
                d0 d0Var = this.f99306h;
                if (d0Var != null) {
                    d0Var.a();
                    this.f99306h = null;
                }
            }
            Exception exc = this.f99304f;
            reentrantLock.unlock();
            return exc;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    @Nullable
    public final TResult O() {
        ReentrantLock reentrantLock = this.f99299a;
        reentrantLock.lock();
        try {
            return this.f99303e;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean Q() {
        ReentrantLock reentrantLock = this.f99299a;
        reentrantLock.lock();
        try {
            boolean z10 = this.f99302d;
            reentrantLock.unlock();
            return z10;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final boolean R() {
        ReentrantLock reentrantLock = this.f99299a;
        reentrantLock.lock();
        try {
            return this.f99301c;
        } finally {
            reentrantLock.unlock();
        }
    }

    public final boolean S() {
        ReentrantLock reentrantLock = this.f99299a;
        reentrantLock.lock();
        try {
            return this.f99304f != null;
        } finally {
            reentrantLock.unlock();
        }
    }

    @NotNull
    public final b0<Void> T() {
        return D(new l() { // from class: com.facebook.bolts.q
            @Override // com.facebook.bolts.l
            public final Object a(b0 b0Var) {
                return b0.U(b0Var);
            }
        });
    }

    @NotNull
    public final <TContinuationResult> b0<TContinuationResult> V(@NotNull l<TResult, TContinuationResult> continuation) {
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        return Y(continuation, f99292l, null);
    }

    @NotNull
    public final <TContinuationResult> b0<TContinuationResult> W(@NotNull l<TResult, TContinuationResult> continuation, @Nullable h hVar) {
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        return Y(continuation, f99292l, hVar);
    }

    @NotNull
    public final <TContinuationResult> b0<TContinuationResult> X(@NotNull l<TResult, TContinuationResult> continuation, @NotNull Executor executor) {
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        Intrinsics.checkNotNullParameter(executor, "executor");
        return Y(continuation, executor, null);
    }

    @NotNull
    public final <TContinuationResult> b0<TContinuationResult> Y(@NotNull final l<TResult, TContinuationResult> continuation, @NotNull Executor executor, @Nullable final h hVar) {
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        Intrinsics.checkNotNullParameter(executor, "executor");
        return F(new l() { // from class: com.facebook.bolts.r
            @Override // com.facebook.bolts.l
            public final Object a(b0 b0Var) {
                return b0.Z(hVar, continuation, b0Var);
            }
        }, executor);
    }

    @NotNull
    public final <TContinuationResult> b0<TContinuationResult> a0(@NotNull l<TResult, b0<TContinuationResult>> continuation) {
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        return c0(continuation, f99292l);
    }

    @NotNull
    public final <TContinuationResult> b0<TContinuationResult> b0(@NotNull l<TResult, b0<TContinuationResult>> continuation, @Nullable h hVar) {
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        return d0(continuation, f99292l, hVar);
    }

    @NotNull
    public final <TContinuationResult> b0<TContinuationResult> c0(@NotNull l<TResult, b0<TContinuationResult>> continuation, @NotNull Executor executor) {
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        Intrinsics.checkNotNullParameter(executor, "executor");
        return d0(continuation, executor, null);
    }

    @NotNull
    public final <TContinuationResult> b0<TContinuationResult> d0(@NotNull final l<TResult, b0<TContinuationResult>> continuation, @NotNull Executor executor, @Nullable final h hVar) {
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        Intrinsics.checkNotNullParameter(executor, "executor");
        return F(new l() { // from class: com.facebook.bolts.o
            @Override // com.facebook.bolts.l
            public final Object a(b0 b0Var) {
                return b0.e0(hVar, continuation, b0Var);
            }
        }, executor);
    }

    public final boolean h0() {
        ReentrantLock reentrantLock = this.f99299a;
        reentrantLock.lock();
        try {
            if (this.f99301c) {
                reentrantLock.unlock();
                return false;
            }
            this.f99301c = true;
            this.f99302d = true;
            this.f99300b.signalAll();
            f0();
            reentrantLock.unlock();
            return true;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final boolean i0(@Nullable Exception exc) {
        ReentrantLock reentrantLock = this.f99299a;
        reentrantLock.lock();
        try {
            if (this.f99301c) {
                reentrantLock.unlock();
                return false;
            }
            this.f99301c = true;
            this.f99304f = exc;
            this.f99305g = false;
            this.f99300b.signalAll();
            f0();
            if (!this.f99305g && f99294n != null) {
                this.f99306h = new d0(this);
            }
            reentrantLock.unlock();
            return true;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final boolean j0(@Nullable TResult tresult) {
        ReentrantLock reentrantLock = this.f99299a;
        reentrantLock.lock();
        try {
            if (this.f99301c) {
                reentrantLock.unlock();
                return false;
            }
            this.f99301c = true;
            this.f99303e = tresult;
            this.f99300b.signalAll();
            f0();
            reentrantLock.unlock();
            return true;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final void k0() throws InterruptedException {
        ReentrantLock reentrantLock = this.f99299a;
        reentrantLock.lock();
        try {
            if (!R()) {
                this.f99300b.await();
            }
            Unit unit = Unit.f312394a;
            reentrantLock.unlock();
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    public final boolean l0(long j10, @NotNull TimeUnit timeUnit) throws InterruptedException {
        Intrinsics.checkNotNullParameter(timeUnit, "timeUnit");
        ReentrantLock reentrantLock = this.f99299a;
        reentrantLock.lock();
        try {
            if (!R()) {
                this.f99300b.await(j10, timeUnit);
            }
            boolean zR = R();
            reentrantLock.unlock();
            return zR;
        } catch (Throwable th2) {
            reentrantLock.unlock();
            throw th2;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    @NotNull
    public final <TOut> b0<TOut> t() {
        return this;
    }

    @NotNull
    public final b0<Void> u(@NotNull Callable<Boolean> predicate, @NotNull l<Void, b0<Void>> continuation) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        return w(predicate, continuation, f99292l, null);
    }

    @NotNull
    public final b0<Void> v(@NotNull Callable<Boolean> predicate, @NotNull l<Void, b0<Void>> continuation, @Nullable h hVar) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        return w(predicate, continuation, f99292l, hVar);
    }

    @NotNull
    public final b0<Void> w(@NotNull Callable<Boolean> predicate, @NotNull l<Void, b0<Void>> continuation, @NotNull Executor executor, @Nullable h hVar) {
        Intrinsics.checkNotNullParameter(predicate, "predicate");
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        Intrinsics.checkNotNullParameter(executor, "executor");
        return T().F(new d(hVar, predicate, continuation, executor), executor);
    }

    @NotNull
    public final <TContinuationResult> b0<TContinuationResult> y(@NotNull l<TResult, TContinuationResult> continuation) {
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        return B(continuation, f99292l, null);
    }

    @NotNull
    public final <TContinuationResult> b0<TContinuationResult> z(@NotNull l<TResult, TContinuationResult> continuation, @Nullable h hVar) {
        Intrinsics.checkNotNullParameter(continuation, "continuation");
        return B(continuation, f99292l, hVar);
    }

    private b0(TResult tresult) {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f99299a = reentrantLock;
        this.f99300b = reentrantLock.newCondition();
        this.f99307i = new ArrayList();
        j0(tresult);
    }

    private b0(boolean z10) {
        ReentrantLock reentrantLock = new ReentrantLock();
        this.f99299a = reentrantLock;
        this.f99300b = reentrantLock.newCondition();
        this.f99307i = new ArrayList();
        if (z10) {
            h0();
        } else {
            j0(null);
        }
    }
}

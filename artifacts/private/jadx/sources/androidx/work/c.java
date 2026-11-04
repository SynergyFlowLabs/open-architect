package androidx.work;

import androidx.annotation.b1;
import java.util.concurrent.Executor;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
public final class c {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public static final b f76495p = new b(null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f76496q = 20;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Executor f76497a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Executor f76498b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final androidx.work.b f76499c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final p0 f76500d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final q f76501e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final h0 f76502f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @Nullable
    private final androidx.core.util.e<Throwable> f76503g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @Nullable
    private final androidx.core.util.e<Throwable> f76504h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @Nullable
    private final String f76505i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private final int f76506j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f76507k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int f76508l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final int f76509m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final int f76510n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final boolean f76511o;

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private b() {
        }
    }

    /* JADX INFO: renamed from: androidx.work.c$c, reason: collision with other inner class name */
    public interface InterfaceC0774c {
        @NotNull
        c h();
    }

    public c(@NotNull a builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        Executor executorE = builder.e();
        this.f76497a = executorE == null ? d.b(false) : executorE;
        this.f76511o = builder.n() == null;
        Executor executorN = builder.n();
        this.f76498b = executorN == null ? d.b(true) : executorN;
        androidx.work.b bVarB = builder.b();
        this.f76499c = bVarB == null ? new j0() : bVarB;
        p0 p0VarO = builder.o();
        if (p0VarO == null) {
            p0VarO = p0.c();
            Intrinsics.checkNotNullExpressionValue(p0VarO, "getDefaultWorkerFactory()");
        }
        this.f76500d = p0VarO;
        q qVarG = builder.g();
        this.f76501e = qVarG == null ? x.f77456a : qVarG;
        h0 h0VarL = builder.l();
        this.f76502f = h0VarL == null ? new androidx.work.impl.e() : h0VarL;
        this.f76506j = builder.h();
        this.f76507k = builder.k();
        this.f76508l = builder.i();
        this.f76510n = builder.j();
        this.f76503g = builder.f();
        this.f76504h = builder.m();
        this.f76505i = builder.d();
        this.f76509m = builder.c();
    }

    @NotNull
    public final androidx.work.b a() {
        return this.f76499c;
    }

    public final int b() {
        return this.f76509m;
    }

    @Nullable
    public final String c() {
        return this.f76505i;
    }

    @NotNull
    public final Executor d() {
        return this.f76497a;
    }

    @Nullable
    public final androidx.core.util.e<Throwable> e() {
        return this.f76503g;
    }

    @NotNull
    public final q f() {
        return this.f76501e;
    }

    public final int g() {
        return this.f76508l;
    }

    @androidx.annotation.g0(from = 20, to = 50)
    @b1({b1.a.LIBRARY_GROUP})
    public final int h() {
        return this.f76510n;
    }

    public final int i() {
        return this.f76507k;
    }

    @b1({b1.a.LIBRARY_GROUP})
    public final int j() {
        return this.f76506j;
    }

    @NotNull
    public final h0 k() {
        return this.f76502f;
    }

    @Nullable
    public final androidx.core.util.e<Throwable> l() {
        return this.f76504h;
    }

    @NotNull
    public final Executor m() {
        return this.f76498b;
    }

    @NotNull
    public final p0 n() {
        return this.f76500d;
    }

    @b1({b1.a.LIBRARY_GROUP})
    public final boolean o() {
        return this.f76511o;
    }

    public static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @Nullable
        private Executor f76512a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        private p0 f76513b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @Nullable
        private q f76514c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        @Nullable
        private Executor f76515d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @Nullable
        private androidx.work.b f76516e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        private h0 f76517f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @Nullable
        private androidx.core.util.e<Throwable> f76518g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        @Nullable
        private androidx.core.util.e<Throwable> f76519h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        @Nullable
        private String f76520i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private int f76521j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private int f76522k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f76523l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f76524m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f76525n;

        public a() {
            this.f76521j = 4;
            this.f76523l = Integer.MAX_VALUE;
            this.f76524m = 20;
            this.f76525n = d.c();
        }

        public final void A(@Nullable q qVar) {
            this.f76514c = qVar;
        }

        @NotNull
        public final a B(int i10, int i11) {
            if (i11 - i10 < 1000) {
                throw new IllegalArgumentException("WorkManager needs a range of at least 1000 job ids.");
            }
            this.f76522k = i10;
            this.f76523l = i11;
            return this;
        }

        public final void C(int i10) {
            this.f76521j = i10;
        }

        public final void D(int i10) {
            this.f76523l = i10;
        }

        @NotNull
        public final a E(int i10) {
            if (i10 < 20) {
                throw new IllegalArgumentException("WorkManager needs to be able to schedule at least 20 jobs in JobScheduler.");
            }
            this.f76524m = Math.min(i10, 50);
            return this;
        }

        public final void F(int i10) {
            this.f76524m = i10;
        }

        public final void G(int i10) {
            this.f76522k = i10;
        }

        @NotNull
        public final a H(int i10) {
            this.f76521j = i10;
            return this;
        }

        @NotNull
        public final a I(@NotNull h0 runnableScheduler) {
            Intrinsics.checkNotNullParameter(runnableScheduler, "runnableScheduler");
            this.f76517f = runnableScheduler;
            return this;
        }

        public final void J(@Nullable h0 h0Var) {
            this.f76517f = h0Var;
        }

        @NotNull
        public final a K(@NotNull androidx.core.util.e<Throwable> schedulingExceptionHandler) {
            Intrinsics.checkNotNullParameter(schedulingExceptionHandler, "schedulingExceptionHandler");
            this.f76519h = schedulingExceptionHandler;
            return this;
        }

        public final void L(@Nullable androidx.core.util.e<Throwable> eVar) {
            this.f76519h = eVar;
        }

        @NotNull
        public final a M(@NotNull Executor taskExecutor) {
            Intrinsics.checkNotNullParameter(taskExecutor, "taskExecutor");
            this.f76515d = taskExecutor;
            return this;
        }

        public final void N(@Nullable Executor executor) {
            this.f76515d = executor;
        }

        @NotNull
        public final a O(@NotNull p0 workerFactory) {
            Intrinsics.checkNotNullParameter(workerFactory, "workerFactory");
            this.f76513b = workerFactory;
            return this;
        }

        public final void P(@Nullable p0 p0Var) {
            this.f76513b = p0Var;
        }

        @NotNull
        public final c a() {
            return new c(this);
        }

        @Nullable
        public final androidx.work.b b() {
            return this.f76516e;
        }

        public final int c() {
            return this.f76525n;
        }

        @Nullable
        public final String d() {
            return this.f76520i;
        }

        @Nullable
        public final Executor e() {
            return this.f76512a;
        }

        @Nullable
        public final androidx.core.util.e<Throwable> f() {
            return this.f76518g;
        }

        @Nullable
        public final q g() {
            return this.f76514c;
        }

        public final int h() {
            return this.f76521j;
        }

        public final int i() {
            return this.f76523l;
        }

        public final int j() {
            return this.f76524m;
        }

        public final int k() {
            return this.f76522k;
        }

        @Nullable
        public final h0 l() {
            return this.f76517f;
        }

        @Nullable
        public final androidx.core.util.e<Throwable> m() {
            return this.f76519h;
        }

        @Nullable
        public final Executor n() {
            return this.f76515d;
        }

        @Nullable
        public final p0 o() {
            return this.f76513b;
        }

        @NotNull
        public final a p(@NotNull androidx.work.b clock) {
            Intrinsics.checkNotNullParameter(clock, "clock");
            this.f76516e = clock;
            return this;
        }

        public final void q(@Nullable androidx.work.b bVar) {
            this.f76516e = bVar;
        }

        @NotNull
        public final a r(int i10) {
            this.f76525n = Math.max(i10, 0);
            return this;
        }

        public final void s(int i10) {
            this.f76525n = i10;
        }

        @NotNull
        public final a t(@NotNull String processName) {
            Intrinsics.checkNotNullParameter(processName, "processName");
            this.f76520i = processName;
            return this;
        }

        public final void u(@Nullable String str) {
            this.f76520i = str;
        }

        @NotNull
        public final a v(@NotNull Executor executor) {
            Intrinsics.checkNotNullParameter(executor, "executor");
            this.f76512a = executor;
            return this;
        }

        public final void w(@Nullable Executor executor) {
            this.f76512a = executor;
        }

        @NotNull
        public final a x(@NotNull androidx.core.util.e<Throwable> exceptionHandler) {
            Intrinsics.checkNotNullParameter(exceptionHandler, "exceptionHandler");
            this.f76518g = exceptionHandler;
            return this;
        }

        public final void y(@Nullable androidx.core.util.e<Throwable> eVar) {
            this.f76518g = eVar;
        }

        @NotNull
        public final a z(@NotNull q inputMergerFactory) {
            Intrinsics.checkNotNullParameter(inputMergerFactory, "inputMergerFactory");
            this.f76514c = inputMergerFactory;
            return this;
        }

        @b1({b1.a.LIBRARY_GROUP})
        public a(@NotNull c configuration) {
            Intrinsics.checkNotNullParameter(configuration, "configuration");
            this.f76521j = 4;
            this.f76523l = Integer.MAX_VALUE;
            this.f76524m = 20;
            this.f76525n = d.c();
            this.f76512a = configuration.d();
            this.f76513b = configuration.n();
            this.f76514c = configuration.f();
            this.f76515d = configuration.m();
            this.f76516e = configuration.a();
            this.f76521j = configuration.j();
            this.f76522k = configuration.i();
            this.f76523l = configuration.g();
            this.f76524m = configuration.h();
            this.f76517f = configuration.k();
            this.f76518g = configuration.e();
            this.f76519h = configuration.l();
            this.f76520i = configuration.c();
        }
    }
}

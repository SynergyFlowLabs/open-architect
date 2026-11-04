package kotlinx.coroutines.internal;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.k2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nLimitedDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LimitedDispatcher.kt\nkotlinx/coroutines/internal/LimitedDispatcher\n+ 2 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 3 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n*L\n1#1,154:1\n62#1,18:155\n62#1,18:173\n29#2:191\n29#2:193\n16#3:192\n16#3:194\n*S KotlinDebug\n*F\n+ 1 LimitedDispatcher.kt\nkotlinx/coroutines/internal/LimitedDispatcher\n*L\n44#1:155,18\n51#1:173,18\n85#1:191\n98#1:193\n85#1:192\n98#1:194\n*E\n"})
public final class z extends kotlinx.coroutines.n0 implements kotlinx.coroutines.c1 {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f315141h = AtomicIntegerFieldUpdater.newUpdater(z.class, "runningWorkers$volatile");

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final /* synthetic */ kotlinx.coroutines.c1 f315142b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.n0 f315143c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final int f315144d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private final String f315145e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final g0<Runnable> f315146f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final Object f315147g;
    private volatile /* synthetic */ int runningWorkers$volatile;

    @SourceDebugExtension({"SMAP\nLimitedDispatcher.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LimitedDispatcher.kt\nkotlinx/coroutines/internal/LimitedDispatcher$Worker\n+ 2 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 3 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n*L\n1#1,154:1\n29#2:155\n16#3:156\n*S KotlinDebug\n*F\n+ 1 LimitedDispatcher.kt\nkotlinx/coroutines/internal/LimitedDispatcher$Worker\n*L\n139#1:155\n139#1:156\n*E\n"})
    private final class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private Runnable f315148a;

        public a(Runnable runnable) {
            this.f315148a = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            int i10 = 0;
            while (true) {
                try {
                    this.f315148a.run();
                } catch (Throwable th2) {
                    kotlinx.coroutines.p0.b(kotlin.coroutines.h.f312451a, th2);
                }
                try {
                    Runnable runnableH1 = z.this.h1();
                    if (runnableH1 == null) {
                        return;
                    }
                    this.f315148a = runnableH1;
                    i10++;
                    if (i10 >= 16 && n.f(z.this.f315143c, z.this)) {
                        n.e(z.this.f315143c, z.this, this);
                        return;
                    }
                } catch (Throwable th3) {
                    Object obj = z.this.f315147g;
                    z zVar = z.this;
                    synchronized (obj) {
                        try {
                            z.g1().decrementAndGet(zVar);
                            throw th3;
                        } catch (Throwable th4) {
                            throw th4;
                        }
                    }
                }
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public z(@NotNull kotlinx.coroutines.n0 n0Var, int i10, @Nullable String str) {
        kotlinx.coroutines.c1 c1Var = n0Var instanceof kotlinx.coroutines.c1 ? (kotlinx.coroutines.c1) n0Var : null;
        this.f315142b = c1Var == null ? kotlinx.coroutines.z0.a() : c1Var;
        this.f315143c = n0Var;
        this.f315144d = i10;
        this.f315145e = str;
        this.f315146f = new g0<>(false);
        this.f315147g = new Object();
    }

    private final void U0(Runnable runnable, Function1<? super a, Unit> function1) {
        Runnable runnableH1;
        this.f315146f.a(runnable);
        if (f315141h.get(this) < this.f315144d && p1() && (runnableH1 = h1()) != null) {
            try {
                function1.invoke(new a(runnableH1));
            } catch (Throwable th2) {
                f315141h.decrementAndGet(this);
                throw th2;
            }
        }
    }

    private final /* synthetic */ int e1() {
        return this.runningWorkers$volatile;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicIntegerFieldUpdater g1() {
        return f315141h;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Runnable h1() {
        while (true) {
            Runnable runnableJ = this.f315146f.j();
            if (runnableJ != null) {
                return runnableJ;
            }
            synchronized (this.f315147g) {
                try {
                    f315141h.decrementAndGet(this);
                    if (this.f315146f.c() == 0) {
                        return null;
                    }
                    f315141h.incrementAndGet(this);
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    private final /* synthetic */ void j1(int i10) {
        this.runningWorkers$volatile = i10;
    }

    private final boolean p1() {
        synchronized (this.f315147g) {
            if (f315141h.get(this) >= this.f315144d) {
                return false;
            }
            f315141h.incrementAndGet(this);
            return true;
        }
    }

    @Override // kotlinx.coroutines.n0
    @NotNull
    public kotlinx.coroutines.n0 Y(int i10, @Nullable String str) {
        a0.a(i10);
        return i10 >= this.f315144d ? a0.b(this, str) : super.Y(i10, str);
    }

    @Override // kotlinx.coroutines.c1
    public void b(long j10, @NotNull kotlinx.coroutines.n<? super Unit> nVar) {
        this.f315142b.b(j10, nVar);
    }

    @Override // kotlinx.coroutines.c1
    @NotNull
    public kotlinx.coroutines.o1 d(long j10, @NotNull Runnable runnable, @NotNull CoroutineContext coroutineContext) {
        return this.f315142b.d(j10, runnable, coroutineContext);
    }

    @Override // kotlinx.coroutines.c1
    @kotlin.l(level = kotlin.n.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
    @Nullable
    public Object g(long j10, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        return this.f315142b.g(j10, dVar);
    }

    @Override // kotlinx.coroutines.n0
    public void h(@NotNull CoroutineContext coroutineContext, @NotNull Runnable runnable) {
        Runnable runnableH1;
        this.f315146f.a(runnable);
        if (f315141h.get(this) < this.f315144d && p1() && (runnableH1 = h1()) != null) {
            try {
                n.e(this.f315143c, this, new a(runnableH1));
            } catch (Throwable th2) {
                f315141h.decrementAndGet(this);
                throw th2;
            }
        }
    }

    @Override // kotlinx.coroutines.n0
    @k2
    public void j(@NotNull CoroutineContext coroutineContext, @NotNull Runnable runnable) {
        Runnable runnableH1;
        this.f315146f.a(runnable);
        if (f315141h.get(this) >= this.f315144d || !p1() || (runnableH1 = h1()) == null) {
            return;
        }
        try {
            this.f315143c.j(this, new a(runnableH1));
        } catch (Throwable th2) {
            f315141h.decrementAndGet(this);
            throw th2;
        }
    }

    @Override // kotlinx.coroutines.n0
    @NotNull
    public String toString() {
        String str = this.f315145e;
        if (str != null) {
            return str;
        }
        return this.f315143c + ".limitedParallelism(" + this.f315144d + ')';
    }
}

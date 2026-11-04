package okhttp3.internal.concurrent;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;
import java.util.logging.Logger;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import oj.f;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes8.dex */
@SourceDebugExtension({"SMAP\nTaskRunner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskRunner.kt\nokhttp3/internal/concurrent/TaskRunner\n+ 2 Util.kt\nokhttp3/internal/Util\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,314:1\n608#2,4:315\n608#2,4:319\n615#2,4:323\n608#2,4:327\n608#2,4:331\n1#3:335\n*S KotlinDebug\n*F\n+ 1 TaskRunner.kt\nokhttp3/internal/concurrent/TaskRunner\n*L\n79#1:315,4\n97#1:319,4\n108#1:323,4\n126#1:327,4\n152#1:331,4\n*E\n"})
public final class d {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final b f334057h = new b(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @f
    @NotNull
    public static final d f334058i = new d(new c(jk.f.Y(jk.f.f307491i + " TaskRunner", true)));

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private static final Logger f334059j;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final a f334060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f334061b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f334062c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private long f334063d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final List<okhttp3.internal.concurrent.c> f334064e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final List<okhttp3.internal.concurrent.c> f334065f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final Runnable f334066g;

    public interface a {
        long a();

        void b(@NotNull d dVar);

        void c(@NotNull d dVar, long j10);

        void d(@NotNull d dVar);

        void execute(@NotNull Runnable runnable);
    }

    public static final class b {
        public /* synthetic */ b(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final Logger a() {
            return d.f334059j;
        }

        private b() {
        }
    }

    @SourceDebugExtension({"SMAP\nTaskRunner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskRunner.kt\nokhttp3/internal/concurrent/TaskRunner$RealBackend\n+ 2 Util.kt\nokhttp3/internal/Util\n*L\n1#1,314:1\n560#2:315\n*S KotlinDebug\n*F\n+ 1 TaskRunner.kt\nokhttp3/internal/concurrent/TaskRunner$RealBackend\n*L\n281#1:315\n*E\n"})
    public static final class c implements a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NotNull
        private final ThreadPoolExecutor f334067a;

        public c(@NotNull ThreadFactory threadFactory) {
            Intrinsics.checkNotNullParameter(threadFactory, "threadFactory");
            this.f334067a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), threadFactory);
        }

        @Override // okhttp3.internal.concurrent.d.a
        public long a() {
            return System.nanoTime();
        }

        @Override // okhttp3.internal.concurrent.d.a
        public void b(@NotNull d taskRunner) {
            Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
            taskRunner.notify();
        }

        @Override // okhttp3.internal.concurrent.d.a
        public void c(@NotNull d taskRunner, long j10) throws InterruptedException {
            Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
            long j11 = j10 / 1000000;
            long j12 = j10 - (1000000 * j11);
            if (j11 > 0 || j10 > 0) {
                taskRunner.wait(j11, (int) j12);
            }
        }

        @Override // okhttp3.internal.concurrent.d.a
        public void d(@NotNull d taskRunner) {
            Intrinsics.checkNotNullParameter(taskRunner, "taskRunner");
        }

        public final void e() {
            this.f334067a.shutdown();
        }

        @Override // okhttp3.internal.concurrent.d.a
        public void execute(@NotNull Runnable runnable) {
            Intrinsics.checkNotNullParameter(runnable, "runnable");
            this.f334067a.execute(runnable);
        }
    }

    /* JADX INFO: renamed from: okhttp3.internal.concurrent.d$d, reason: collision with other inner class name */
    @SourceDebugExtension({"SMAP\nTaskRunner.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TaskRunner.kt\nokhttp3/internal/concurrent/TaskRunner$runnable$1\n+ 2 TaskLogger.kt\nokhttp3/internal/concurrent/TaskLoggerKt\n*L\n1#1,314:1\n35#2,19:315\n*S KotlinDebug\n*F\n+ 1 TaskRunner.kt\nokhttp3/internal/concurrent/TaskRunner$runnable$1\n*L\n62#1:315,19\n*E\n"})
    public static final class RunnableC2359d implements Runnable {
        RunnableC2359d() {
        }

        @Override // java.lang.Runnable
        public void run() {
            okhttp3.internal.concurrent.a aVarE;
            long jA;
            while (true) {
                d dVar = d.this;
                synchronized (dVar) {
                    try {
                        aVarE = dVar.e();
                    } catch (Throwable th2) {
                        throw th2;
                    }
                }
                if (aVarE == null) {
                    return;
                }
                okhttp3.internal.concurrent.c cVarD = aVarE.d();
                Intrinsics.checkNotNull(cVarD);
                d dVar2 = d.this;
                boolean zIsLoggable = d.f334057h.a().isLoggable(Level.FINE);
                if (zIsLoggable) {
                    jA = cVarD.k().h().a();
                    okhttp3.internal.concurrent.b.c(aVarE, cVarD, "starting");
                } else {
                    jA = -1;
                }
                try {
                    dVar2.k(aVarE);
                    try {
                        Unit unit = Unit.f312394a;
                        if (zIsLoggable) {
                            okhttp3.internal.concurrent.b.c(aVarE, cVarD, "finished run in " + okhttp3.internal.concurrent.b.b(cVarD.k().h().a() - jA));
                        }
                    } catch (Throwable th3) {
                        if (zIsLoggable) {
                            okhttp3.internal.concurrent.b.c(aVarE, cVarD, "failed a run in " + okhttp3.internal.concurrent.b.b(cVarD.k().h().a() - jA));
                        }
                        throw th3;
                    }
                } catch (Throwable th4) {
                    dVar2.h().execute(this);
                    throw th4;
                }
            }
        }
    }

    static {
        int i10 = 0 << 1;
        Logger logger = Logger.getLogger(d.class.getName());
        Intrinsics.checkNotNullExpressionValue(logger, "getLogger(TaskRunner::class.java.name)");
        f334059j = logger;
    }

    public d(@NotNull a backend) {
        Intrinsics.checkNotNullParameter(backend, "backend");
        this.f334060a = backend;
        this.f334061b = 10000;
        this.f334064e = new ArrayList();
        this.f334065f = new ArrayList();
        this.f334066g = new RunnableC2359d();
    }

    private final void d(okhttp3.internal.concurrent.a aVar, long j10) {
        if (jk.f.f307490h && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        okhttp3.internal.concurrent.c cVarD = aVar.d();
        Intrinsics.checkNotNull(cVarD);
        if (cVarD.e() != aVar) {
            throw new IllegalStateException("Check failed.");
        }
        boolean zF = cVarD.f();
        cVarD.s(false);
        cVarD.r(null);
        this.f334064e.remove(cVarD);
        if (j10 != -1 && !zF && !cVarD.j()) {
            int i10 = 5 >> 1;
            cVarD.q(aVar, j10, true);
        }
        if (cVarD.g().isEmpty()) {
            return;
        }
        this.f334065f.add(cVarD);
    }

    private final void f(okhttp3.internal.concurrent.a aVar) {
        if (jk.f.f307490h && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        aVar.g(-1L);
        okhttp3.internal.concurrent.c cVarD = aVar.d();
        Intrinsics.checkNotNull(cVarD);
        cVarD.g().remove(aVar);
        this.f334065f.remove(cVarD);
        cVarD.r(aVar);
        this.f334064e.add(cVarD);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void k(okhttp3.internal.concurrent.a aVar) {
        if (jk.f.f307490h && Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST NOT hold lock on " + this);
        }
        Thread threadCurrentThread = Thread.currentThread();
        String name = threadCurrentThread.getName();
        threadCurrentThread.setName(aVar.b());
        try {
            long jF = aVar.f();
            synchronized (this) {
                try {
                    d(aVar, jF);
                    Unit unit = Unit.f312394a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            threadCurrentThread.setName(name);
        } catch (Throwable th3) {
            synchronized (this) {
                d(aVar, -1L);
                Unit unit2 = Unit.f312394a;
                threadCurrentThread.setName(name);
                throw th3;
            }
        }
    }

    @NotNull
    public final List<okhttp3.internal.concurrent.c> c() {
        List<okhttp3.internal.concurrent.c> listPlus;
        synchronized (this) {
            try {
                listPlus = CollectionsKt.plus((Collection) this.f334064e, (Iterable) this.f334065f);
            } catch (Throwable th2) {
                throw th2;
            }
        }
        return listPlus;
    }

    @Nullable
    public final okhttp3.internal.concurrent.a e() {
        boolean z10;
        if (jk.f.f307490h && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        while (!this.f334065f.isEmpty()) {
            long jA = this.f334060a.a();
            Iterator<okhttp3.internal.concurrent.c> it = this.f334065f.iterator();
            long jMin = Long.MAX_VALUE;
            okhttp3.internal.concurrent.a aVar = null;
            while (true) {
                if (!it.hasNext()) {
                    z10 = false;
                    break;
                }
                okhttp3.internal.concurrent.a aVar2 = it.next().g().get(0);
                long jMax = Math.max(0L, aVar2.c() - jA);
                if (jMax > 0) {
                    jMin = Math.min(jMax, jMin);
                } else {
                    if (aVar != null) {
                        z10 = true;
                        break;
                    }
                    aVar = aVar2;
                }
            }
            if (aVar != null) {
                f(aVar);
                if (z10 || (!this.f334062c && !this.f334065f.isEmpty())) {
                    this.f334060a.execute(this.f334066g);
                }
                return aVar;
            }
            if (this.f334062c) {
                if (jMin < this.f334063d - jA) {
                    this.f334060a.b(this);
                }
                return null;
            }
            this.f334062c = true;
            this.f334063d = jA + jMin;
            try {
                try {
                    this.f334060a.c(this, jMin);
                } catch (InterruptedException unused) {
                    g();
                }
                this.f334062c = false;
            } catch (Throwable th2) {
                this.f334062c = false;
                throw th2;
            }
        }
        return null;
    }

    public final void g() {
        int size = this.f334064e.size();
        while (true) {
            size--;
            if (-1 >= size) {
                break;
            } else {
                this.f334064e.get(size).b();
            }
        }
        for (int size2 = this.f334065f.size() - 1; -1 < size2; size2--) {
            okhttp3.internal.concurrent.c cVar = this.f334065f.get(size2);
            cVar.b();
            if (cVar.g().isEmpty()) {
                this.f334065f.remove(size2);
            }
        }
    }

    @NotNull
    public final a h() {
        return this.f334060a;
    }

    public final void i(@NotNull okhttp3.internal.concurrent.c taskQueue) {
        Intrinsics.checkNotNullParameter(taskQueue, "taskQueue");
        if (jk.f.f307490h && !Thread.holdsLock(this)) {
            throw new AssertionError("Thread " + Thread.currentThread().getName() + " MUST hold lock on " + this);
        }
        if (taskQueue.e() == null) {
            if (taskQueue.g().isEmpty()) {
                this.f334065f.remove(taskQueue);
            } else {
                jk.f.c(this.f334065f, taskQueue);
            }
        }
        if (this.f334062c) {
            this.f334060a.b(this);
        } else {
            this.f334060a.execute(this.f334066g);
        }
    }

    @NotNull
    public final okhttp3.internal.concurrent.c j() {
        int i10;
        synchronized (this) {
            i10 = this.f334061b;
            this.f334061b = i10 + 1;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append('Q');
        sb2.append(i10);
        return new okhttp3.internal.concurrent.c(this, sb2.toString());
    }
}

package kotlinx.coroutines.scheduling;

import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.locks.LockSupport;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.i1;
import kotlin.k0;
import kotlin.ranges.r;
import kotlinx.coroutines.internal.u0;
import kotlinx.coroutines.internal.z0;
import kotlinx.coroutines.x0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nCoroutineScheduler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineScheduler.kt\nkotlinx/coroutines/scheduling/CoroutineScheduler\n+ 2 Tasks.kt\nkotlinx/coroutines/scheduling/TasksKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 5 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n+ 6 CoroutineScheduler.kt\nkotlinx/coroutines/scheduling/CoroutineScheduler$Worker\n*L\n1#1,1041:1\n286#1:1044\n284#1:1045\n284#1:1046\n286#1:1047\n281#1:1050\n282#1,5:1051\n292#1:1057\n284#1:1058\n285#1:1059\n284#1:1062\n285#1:1063\n281#1:1064\n289#1:1065\n284#1:1066\n284#1:1069\n285#1:1070\n286#1:1071\n77#2:1042\n77#2:1056\n77#2:1067\n1#3:1043\n29#4:1048\n29#4:1060\n16#5:1049\n16#5:1061\n619#6:1068\n*S KotlinDebug\n*F\n+ 1 CoroutineScheduler.kt\nkotlinx/coroutines/scheduling/CoroutineScheduler\n*L\n282#1:1044\n289#1:1045\n290#1:1046\n299#1:1047\n348#1:1050\n377#1:1051,5\n400#1:1057\n444#1:1058\n445#1:1059\n481#1:1062\n482#1:1063\n488#1:1064\n497#1:1065\n497#1:1066\n578#1:1069\n579#1:1070\n580#1:1071\n120#1:1042\n397#1:1056\n514#1:1067\n348#1:1048\n477#1:1060\n348#1:1049\n477#1:1061\n521#1:1068\n*E\n"})
public final class a implements Executor, Closeable {
    private static final long H1 = 2097152;
    private static final long X = 9223367638808264704L;
    public static final int Y = 1;
    public static final int Z = 2097150;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    public static final C2316a f315437h = new C2316a(null);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f315438i = AtomicLongFieldUpdater.newUpdater(a.class, "parkedWorkersStack$volatile");

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f315439j = AtomicLongFieldUpdater.newUpdater(a.class, "controlState$volatile");

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f315440k = AtomicIntegerFieldUpdater.newUpdater(a.class, "_isTerminated$volatile");

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @oj.f
    @NotNull
    public static final z0 f315441l = new z0("NOT_IN_STACK");

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int f315442m = -1;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f315443n = 0;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f315444o = 1;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private static final long f315445p0 = 2097151;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private static final long f315446p1 = -2097152;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int f315447s = 21;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final long f315448t = 2097151;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final long f315449v = 4398044413952L;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int f315450w = 42;
    private volatile /* synthetic */ int _isTerminated$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @oj.f
    public final int f315451a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @oj.f
    public final int f315452b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @oj.f
    public final long f315453c;
    private volatile /* synthetic */ long controlState$volatile;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oj.f
    @NotNull
    public final String f315454d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @oj.f
    @NotNull
    public final e f315455e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @oj.f
    @NotNull
    public final e f315456f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @oj.f
    @NotNull
    public final u0<c> f315457g;
    private volatile /* synthetic */ long parkedWorkersStack$volatile;

    /* JADX INFO: renamed from: kotlinx.coroutines.scheduling.a$a, reason: collision with other inner class name */
    public static final class C2316a {
        public /* synthetic */ C2316a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private C2316a() {
        }
    }

    public /* synthetic */ class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f315458a;

        static {
            int[] iArr = new int[d.values().length];
            try {
                iArr[d.PARKING.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[d.BLOCKING.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[d.CPU_ACQUIRED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[d.DORMANT.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[d.TERMINATED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            f315458a = iArr;
        }
    }

    public enum d {
        CPU_ACQUIRED,
        BLOCKING,
        PARKING,
        DORMANT,
        TERMINATED;


        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private static final /* synthetic */ kotlin.enums.a f315474g = kotlin.enums.c.c(k());

        @NotNull
        public static kotlin.enums.a<d> l() {
            return f315474g;
        }
    }

    public a(int i10, int i11, long j10, @NotNull String str) {
        this.f315451a = i10;
        this.f315452b = i11;
        this.f315453c = j10;
        this.f315454d = str;
        if (i10 < 1) {
            throw new IllegalArgumentException(("Core pool size " + i10 + " should be at least 1").toString());
        }
        if (i11 < i10) {
            throw new IllegalArgumentException(("Max pool size " + i11 + " should be greater than or equals to core pool size " + i10).toString());
        }
        if (i11 > 2097150) {
            throw new IllegalArgumentException(("Max pool size " + i11 + " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (j10 > 0) {
            this.f315455e = new e();
            this.f315456f = new e();
            this.f315457g = new u0<>((i10 + 1) * 2);
            this.controlState$volatile = ((long) i10) << 42;
            return;
        }
        throw new IllegalArgumentException(("Idle worker keep alive time " + j10 + " must be positive").toString());
    }

    private final i B0(c cVar, i iVar, boolean z10) {
        d dVar;
        if (cVar != null && (dVar = cVar.f315462c) != d.TERMINATED) {
            if (!iVar.f315485b && dVar == d.BLOCKING) {
                return iVar;
            }
            cVar.f315466g = true;
            return cVar.f315460a.a(iVar, z10);
        }
        return iVar;
    }

    private final /* synthetic */ int H() {
        return this._isTerminated$volatile;
    }

    private final boolean H0() {
        AtomicLongFieldUpdater atomicLongFieldUpdaterT = t();
        while (true) {
            long j10 = atomicLongFieldUpdaterT.get(this);
            if (((int) ((X & j10) >> 42)) == 0) {
                return false;
            }
            a aVar = this;
            if (t().compareAndSet(aVar, j10, j10 - 4398046511104L)) {
                return true;
            }
            this = aVar;
        }
    }

    private final boolean M0(long j10) {
        if (r.u(((int) (2097151 & j10)) - ((int) ((j10 & f315449v) >> 21)), 0) < this.f315451a) {
            int iE = e();
            if (iE == 1 && this.f315451a > 1) {
                e();
            }
            if (iE > 0) {
                return true;
            }
        }
        return false;
    }

    private final long N() {
        return f315439j.addAndGet(this, 2097152L);
    }

    static /* synthetic */ boolean O0(a aVar, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            j10 = f315439j.get(aVar);
        }
        return aVar.M0(j10);
    }

    private final boolean Q0() {
        c cVarY;
        do {
            cVarY = Y();
            if (cVarY == null) {
                return false;
            }
        } while (!c.f315459i.compareAndSet(cVarY, -1, 0));
        LockSupport.unpark(cVarY);
        return true;
    }

    private final int R() {
        return (int) (f315439j.incrementAndGet(this) & 2097151);
    }

    private final /* synthetic */ void T(AtomicLongFieldUpdater atomicLongFieldUpdater, Object obj, Function1<? super Long, Unit> function1) {
        while (true) {
            function1.invoke(Long.valueOf(atomicLongFieldUpdater.get(obj)));
        }
    }

    private final int X(c cVar) {
        Object objH = cVar.h();
        while (objH != f315441l) {
            if (objH == null) {
                return 0;
            }
            c cVar2 = (c) objH;
            int iG = cVar2.g();
            if (iG != 0) {
                return iG;
            }
            objH = cVar2.h();
        }
        return -1;
    }

    private final c Y() {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f315438i;
        while (true) {
            long j10 = atomicLongFieldUpdater.get(this);
            c cVarB = this.f315457g.b((int) (2097151 & j10));
            if (cVarB == null) {
                return null;
            }
            long j11 = (2097152 + j10) & f315446p1;
            int iX = this.X(cVarB);
            if (iX >= 0) {
                a aVar = this;
                if (f315438i.compareAndSet(aVar, j10, ((long) iX) | j11)) {
                    cVarB.t(f315441l);
                    return cVarB;
                }
                this = aVar;
            }
        }
    }

    private final boolean b(i iVar) {
        return iVar.f315485b ? this.f315456f.a(iVar) : this.f315455e.a(iVar);
    }

    private final int d(long j10) {
        return (int) ((j10 & f315449v) >> 21);
    }

    private final int e() {
        synchronized (this.f315457g) {
            try {
                if (isTerminated()) {
                    return -1;
                }
                long j10 = f315439j.get(this);
                int i10 = (int) (j10 & 2097151);
                int iU = r.u(i10 - ((int) ((j10 & f315449v) >> 21)), 0);
                if (iU >= this.f315451a) {
                    return 0;
                }
                if (i10 >= this.f315452b) {
                    return 0;
                }
                int i11 = ((int) (t().get(this) & 2097151)) + 1;
                if (i11 <= 0 || this.f315457g.b(i11) != null) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                c cVar = new c(this, i11);
                this.f315457g.c(i11, cVar);
                if (i11 != ((int) (2097151 & f315439j.incrementAndGet(this)))) {
                    throw new IllegalArgumentException("Failed requirement.");
                }
                int i12 = iU + 1;
                cVar.start();
                return i12;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private final int g(long j10) {
        return (int) (j10 & 2097151);
    }

    private final long g0() {
        return t().addAndGet(this, 4398046511104L);
    }

    private final c h() {
        Thread threadCurrentThread = Thread.currentThread();
        c cVar = threadCurrentThread instanceof c ? (c) threadCurrentThread : null;
        if (cVar == null || !Intrinsics.areEqual(a.this, this)) {
            return null;
        }
        return cVar;
    }

    private final void j() {
        t().addAndGet(this, f315446p1);
    }

    private final /* synthetic */ void k0(long j10) {
        this.controlState$volatile = j10;
    }

    private final int l() {
        return (int) (t().getAndDecrement(this) & 2097151);
    }

    public static /* synthetic */ void o(a aVar, Runnable runnable, boolean z10, boolean z11, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            z11 = false;
        }
        aVar.m(runnable, z10, z11);
    }

    private final /* synthetic */ void o0(long j10) {
        this.parkedWorkersStack$volatile = j10;
    }

    private final int q() {
        return (int) ((f315439j.get(this) & X) >> 42);
    }

    private final /* synthetic */ long r() {
        return this.controlState$volatile;
    }

    private final /* synthetic */ void r0(int i10) {
        this._isTerminated$volatile = i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final /* synthetic */ AtomicLongFieldUpdater t() {
        return f315439j;
    }

    private final int x() {
        return (int) (t().get(this) & 2097151);
    }

    private final void x0(long j10) {
        if (Q0() || M0(j10)) {
            return;
        }
        Q0();
    }

    private final /* synthetic */ long y() {
        return this.parkedWorkersStack$volatile;
    }

    public final int c(long j10) {
        return (int) ((j10 & X) >> 42);
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws InterruptedException {
        w0(10000L);
    }

    public final boolean d0(@NotNull c cVar) {
        if (cVar.h() != f315441l) {
            return false;
        }
        AtomicLongFieldUpdater atomicLongFieldUpdater = f315438i;
        while (true) {
            long j10 = atomicLongFieldUpdater.get(this);
            long j11 = (2097152 + j10) & f315446p1;
            int iG = cVar.g();
            cVar.t(this.f315457g.b((int) (2097151 & j10)));
            long j12 = j11 | ((long) iG);
            a aVar = this;
            if (f315438i.compareAndSet(aVar, j10, j12)) {
                return true;
            }
            this = aVar;
        }
    }

    @Override // java.util.concurrent.Executor
    public void execute(@NotNull Runnable runnable) {
        o(this, runnable, false, false, 6, null);
    }

    @NotNull
    public final i f(@NotNull Runnable runnable, boolean z10) {
        long jA = k.f315492f.a();
        if (!(runnable instanceof i)) {
            return k.b(runnable, jA, z10);
        }
        i iVar = (i) runnable;
        iVar.f315484a = jA;
        iVar.f315485b = z10;
        return iVar;
    }

    public final void f0(@NotNull c cVar, int i10, int i11) {
        AtomicLongFieldUpdater atomicLongFieldUpdater = f315438i;
        while (true) {
            long j10 = atomicLongFieldUpdater.get(this);
            int iX = (int) (2097151 & j10);
            long j11 = (2097152 + j10) & f315446p1;
            if (iX == i10) {
                iX = i11 == 0 ? this.X(cVar) : i11;
            }
            if (iX >= 0) {
                a aVar = this;
                if (f315438i.compareAndSet(aVar, j10, j11 | ((long) iX))) {
                    return;
                } else {
                    this = aVar;
                }
            }
        }
    }

    public final boolean isTerminated() {
        return f315440k.get(this) == 1;
    }

    public final void j0(@NotNull i iVar) {
        try {
            iVar.run();
            kotlinx.coroutines.b bVar = kotlinx.coroutines.c.f313549a;
            if (bVar != null) {
                bVar.f();
            }
        } catch (Throwable th2) {
            try {
                Thread threadCurrentThread = Thread.currentThread();
                threadCurrentThread.getUncaughtExceptionHandler().uncaughtException(threadCurrentThread, th2);
                kotlinx.coroutines.b bVar2 = kotlinx.coroutines.c.f313549a;
                if (bVar2 != null) {
                    bVar2.f();
                }
            } catch (Throwable th3) {
                kotlinx.coroutines.b bVar3 = kotlinx.coroutines.c.f313549a;
                if (bVar3 != null) {
                    bVar3.f();
                }
                throw th3;
            }
        }
    }

    public final void m(@NotNull Runnable runnable, boolean z10, boolean z11) {
        kotlinx.coroutines.b bVar = kotlinx.coroutines.c.f313549a;
        if (bVar != null) {
            bVar.e();
        }
        i iVarF = f(runnable, z10);
        boolean z12 = iVarF.f315485b;
        long jAddAndGet = z12 ? f315439j.addAndGet(this, 2097152L) : 0L;
        i iVarB0 = B0(h(), iVarF, z11);
        if (iVarB0 != null && !b(iVarB0)) {
            throw new RejectedExecutionException(this.f315454d + " was terminated");
        }
        if (z12) {
            x0(jAddAndGet);
        } else {
            y0();
        }
    }

    @NotNull
    public String toString() {
        ArrayList arrayList = new ArrayList();
        int iA = this.f315457g.a();
        int i10 = 0;
        int i11 = 5 | 1;
        int i12 = 0;
        int i13 = 0;
        int i14 = 0;
        int i15 = 0;
        for (int i16 = 1; i16 < iA; i16++) {
            c cVarB = this.f315457g.b(i16);
            if (cVarB != null) {
                int iN = cVarB.f315460a.n();
                int i17 = b.f315458a[cVarB.f315462c.ordinal()];
                if (i17 == 1) {
                    i13++;
                } else if (i17 == 2) {
                    i12++;
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(iN);
                    sb2.append('b');
                    arrayList.add(sb2.toString());
                } else if (i17 == 3) {
                    i10++;
                    StringBuilder sb3 = new StringBuilder();
                    sb3.append(iN);
                    sb3.append('c');
                    arrayList.add(sb3.toString());
                } else if (i17 == 4) {
                    i14++;
                    if (iN > 0) {
                        StringBuilder sb4 = new StringBuilder();
                        sb4.append(iN);
                        sb4.append(ni.f.f333369f);
                        arrayList.add(sb4.toString());
                    }
                } else {
                    if (i17 != 5) {
                        throw new k0();
                    }
                    i15++;
                }
            }
        }
        long j10 = f315439j.get(this);
        return this.f315454d + '@' + x0.b(this) + "[Pool Size {core = " + this.f315451a + ", max = " + this.f315452b + "}, Worker States {CPU = " + i10 + ", blocking = " + i12 + ", parked = " + i13 + ", dormant = " + i14 + ", terminated = " + i15 + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.f315455e.c() + ", global blocking queue size = " + this.f315456f.c() + ", Control State {created workers= " + ((int) (2097151 & j10)) + ", blocking tasks = " + ((int) ((f315449v & j10) >> 21)) + ", CPUs acquired = " + (this.f315451a - ((int) ((X & j10) >> 42))) + "}]";
    }

    /* JADX WARN: Code duplicated, block: B:24:0x006d  */
    public final void w0(long j10) throws InterruptedException {
        int i10;
        i iVarJ;
        if (f315440k.compareAndSet(this, 0, 1)) {
            c cVarH = h();
            synchronized (this.f315457g) {
                i10 = (int) (t().get(this) & 2097151);
            }
            if (1 <= i10) {
                int i11 = 1;
                while (true) {
                    c cVarB = this.f315457g.b(i11);
                    Intrinsics.checkNotNull(cVarB);
                    c cVar = cVarB;
                    if (cVar != cVarH) {
                        while (cVar.getState() != Thread.State.TERMINATED) {
                            LockSupport.unpark(cVar);
                            cVar.join(j10);
                        }
                        cVar.f315460a.o(this.f315456f);
                    }
                    if (i11 == i10) {
                        break;
                    } else {
                        i11++;
                    }
                }
            }
            this.f315456f.b();
            this.f315455e.b();
            while (true) {
                if (cVarH == null) {
                    iVarJ = this.f315455e.j();
                    if (iVarJ == null && (iVarJ = this.f315456f.j()) == null) {
                        break;
                    }
                } else {
                    iVarJ = cVarH.f(true);
                    if (iVarJ == null) {
                        iVarJ = this.f315455e.j();
                        if (iVarJ == null) {
                            continue;
                        }
                    } else {
                        continue;
                    }
                }
                j0(iVarJ);
            }
            if (cVarH != null) {
                cVarH.x(d.TERMINATED);
            }
            f315438i.set(this, 0L);
            f315439j.set(this, 0L);
        }
    }

    public final void y0() {
        if (Q0() || O0(this, 0L, 1, null)) {
            return;
        }
        Q0();
    }

    @SourceDebugExtension({"SMAP\nCoroutineScheduler.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CoroutineScheduler.kt\nkotlinx/coroutines/scheduling/CoroutineScheduler$Worker\n+ 2 CoroutineScheduler.kt\nkotlinx/coroutines/scheduling/CoroutineScheduler\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Tasks.kt\nkotlinx/coroutines/scheduling/TasksKt\n+ 5 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 6 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n*L\n1#1,1041:1\n298#2,2:1042\n286#2:1044\n300#2,4:1045\n305#2:1049\n295#2,2:1050\n295#2,2:1055\n281#2:1059\n290#2:1060\n284#2:1061\n281#2:1062\n1#3:1052\n77#4:1053\n77#4:1054\n29#5:1057\n16#6:1058\n*S KotlinDebug\n*F\n+ 1 CoroutineScheduler.kt\nkotlinx/coroutines/scheduling/CoroutineScheduler$Worker\n*L\n684#1:1042,2\n684#1:1044\n684#1:1045,4\n699#1:1049\n773#1:1050,2\n821#1:1055,2\n872#1:1059\n898#1:1060\n898#1:1061\n971#1:1062\n812#1:1053\n815#1:1054\n868#1:1057\n868#1:1058\n*E\n"})
    public final class c extends Thread {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static final /* synthetic */ AtomicIntegerFieldUpdater f315459i = AtomicIntegerFieldUpdater.newUpdater(c.class, "workerCtl$volatile");

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oj.f
        @NotNull
        public final m f315460a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @NotNull
        private final i1.h<i> f315461b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @oj.f
        @NotNull
        public d f315462c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private long f315463d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private long f315464e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f315465f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        @oj.f
        public boolean f315466g;
        private volatile int indexInArray;

        @Nullable
        private volatile Object nextParkedWorker;
        private volatile /* synthetic */ int workerCtl$volatile;

        private c() {
            setDaemon(true);
            setContextClassLoader(a.this.getClass().getClassLoader());
            this.f315460a = new m();
            this.f315461b = new i1.h<>();
            this.f315462c = d.DORMANT;
            this.nextParkedWorker = a.f315441l;
            int iNanoTime = (int) System.nanoTime();
            this.f315465f = iNanoTime == 0 ? 42 : iNanoTime;
        }

        private final void b(i iVar) {
            this.f315463d = 0L;
            if (this.f315462c == d.PARKING) {
                this.f315462c = d.BLOCKING;
            }
            if (!iVar.f315485b) {
                a.this.j0(iVar);
                return;
            }
            if (x(d.BLOCKING)) {
                a.this.y0();
            }
            a.this.j0(iVar);
            a.t().addAndGet(a.this, a.f315446p1);
            if (this.f315462c != d.TERMINATED) {
                this.f315462c = d.DORMANT;
            }
        }

        private final i c(boolean z10) {
            boolean z11;
            i iVarP;
            i iVarP2;
            if (z10) {
                if (n(a.this.f315451a * 2) == 0) {
                    z11 = true;
                    int i10 = 3 | 1;
                } else {
                    z11 = false;
                }
                if (z11 && (iVarP2 = p()) != null) {
                    return iVarP2;
                }
                i iVarP3 = this.f315460a.p();
                if (iVarP3 != null) {
                    return iVarP3;
                }
                if (!z11 && (iVarP = p()) != null) {
                    return iVarP;
                }
            } else {
                i iVarP4 = p();
                if (iVarP4 != null) {
                    return iVarP4;
                }
            }
            return y(3);
        }

        private final i d() {
            i iVarQ = this.f315460a.q();
            return (iVarQ == null && (iVarQ = a.this.f315456f.j()) == null) ? y(1) : iVarQ;
        }

        private final i e() {
            i iVarS = this.f315460a.s();
            return (iVarS == null && (iVarS = a.this.f315456f.j()) == null) ? y(2) : iVarS;
        }

        private final boolean l() {
            return this.nextParkedWorker != a.f315441l;
        }

        private final void o() {
            if (this.f315463d == 0) {
                this.f315463d = System.nanoTime() + a.this.f315453c;
            }
            LockSupport.parkNanos(a.this.f315453c);
            if (System.nanoTime() - this.f315463d >= 0) {
                this.f315463d = 0L;
                z();
            }
        }

        private final i p() {
            if (n(2) == 0) {
                i iVarJ = a.this.f315455e.j();
                return iVarJ != null ? iVarJ : a.this.f315456f.j();
            }
            i iVarJ2 = a.this.f315456f.j();
            return iVarJ2 != null ? iVarJ2 : a.this.f315455e.j();
        }

        private final void r() {
            loop0: while (true) {
                boolean z10 = false;
                while (true) {
                    if (a.this.isTerminated() || this.f315462c == d.TERMINATED) {
                        break loop0;
                    }
                    i iVarF = f(this.f315466g);
                    if (iVarF != null) {
                        this.f315464e = 0L;
                        b(iVarF);
                        break;
                    }
                    this.f315466g = false;
                    if (this.f315464e == 0) {
                        w();
                    } else {
                        if (z10) {
                            x(d.PARKING);
                            Thread.interrupted();
                            LockSupport.parkNanos(this.f315464e);
                            this.f315464e = 0L;
                            break;
                        }
                        z10 = true;
                        boolean z11 = false | true;
                    }
                }
            }
            x(d.TERMINATED);
        }

        private final boolean v() {
            long j10;
            if (this.f315462c == d.CPU_ACQUIRED) {
                return true;
            }
            a aVar = a.this;
            AtomicLongFieldUpdater atomicLongFieldUpdaterT = a.t();
            do {
                j10 = atomicLongFieldUpdaterT.get(aVar);
                if (((int) ((a.X & j10) >> 42)) == 0) {
                    return false;
                }
            } while (!a.t().compareAndSet(aVar, j10, j10 - 4398046511104L));
            this.f315462c = d.CPU_ACQUIRED;
            return true;
        }

        private final void w() {
            if (!l()) {
                a.this.d0(this);
                return;
            }
            f315459i.set(this, -1);
            while (l() && f315459i.get(this) == -1 && !a.this.isTerminated() && this.f315462c != d.TERMINATED) {
                x(d.PARKING);
                Thread.interrupted();
                o();
            }
        }

        private final i y(int i10) {
            int i11 = (int) (a.t().get(a.this) & 2097151);
            if (i11 < 2) {
                return null;
            }
            int iN = n(i11);
            a aVar = a.this;
            long jMin = Long.MAX_VALUE;
            for (int i12 = 0; i12 < i11; i12++) {
                iN++;
                if (iN > i11) {
                    iN = 1;
                }
                c cVarB = aVar.f315457g.b(iN);
                if (cVarB != null && cVarB != this) {
                    long jB = cVarB.f315460a.B(i10, this.f315461b);
                    if (jB == -1) {
                        i1.h<i> hVar = this.f315461b;
                        i iVar = hVar.f312751a;
                        hVar.f312751a = null;
                        return iVar;
                    }
                    if (jB > 0) {
                        jMin = Math.min(jMin, jB);
                    }
                }
            }
            if (jMin == Long.MAX_VALUE) {
                jMin = 0;
            }
            this.f315464e = jMin;
            return null;
        }

        private final void z() {
            a aVar = a.this;
            synchronized (aVar.f315457g) {
                try {
                    if (aVar.isTerminated()) {
                        return;
                    }
                    if (((int) (a.t().get(aVar) & 2097151)) <= aVar.f315451a) {
                        return;
                    }
                    if (f315459i.compareAndSet(this, -1, 1)) {
                        int i10 = this.indexInArray;
                        s(0);
                        aVar.f0(this, i10, 0);
                        int andDecrement = (int) (a.t().getAndDecrement(aVar) & 2097151);
                        if (andDecrement != i10) {
                            c cVarB = aVar.f315457g.b(andDecrement);
                            Intrinsics.checkNotNull(cVarB);
                            c cVar = cVarB;
                            aVar.f315457g.c(i10, cVar);
                            cVar.s(i10);
                            aVar.f0(cVar, andDecrement, i10);
                        }
                        aVar.f315457g.c(andDecrement, null);
                        Unit unit = Unit.f312394a;
                        this.f315462c = d.TERMINATED;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Nullable
        public final i f(boolean z10) {
            return v() ? c(z10) : d();
        }

        public final int g() {
            return this.indexInArray;
        }

        @Nullable
        public final Object h() {
            return this.nextParkedWorker;
        }

        @NotNull
        public final a i() {
            return a.this;
        }

        public final /* synthetic */ int j() {
            return this.workerCtl$volatile;
        }

        public final boolean m() {
            return this.f315462c == d.BLOCKING;
        }

        public final int n(int i10) {
            int i11 = this.f315465f;
            int i12 = i11 ^ (i11 << 13);
            int i13 = i12 ^ (i12 >> 17);
            int i14 = i13 ^ (i13 << 5);
            this.f315465f = i14;
            int i15 = i10 - 1;
            return (i15 & i10) == 0 ? i15 & i14 : (Integer.MAX_VALUE & i14) % i10;
        }

        public final long q() {
            boolean z10 = this.f315462c == d.CPU_ACQUIRED;
            i iVarE = z10 ? e() : d();
            if (iVarE == null) {
                long j10 = this.f315464e;
                if (j10 == 0) {
                    j10 = -1;
                }
                return j10;
            }
            a.this.j0(iVarE);
            if (!z10) {
                a.t().addAndGet(a.this, a.f315446p1);
            }
            return 0L;
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            r();
        }

        public final void s(int i10) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append(a.this.f315454d);
            sb2.append("-worker-");
            sb2.append(i10 == 0 ? "TERMINATED" : String.valueOf(i10));
            setName(sb2.toString());
            this.indexInArray = i10;
        }

        public final void t(@Nullable Object obj) {
            this.nextParkedWorker = obj;
        }

        public final /* synthetic */ void u(int i10) {
            this.workerCtl$volatile = i10;
        }

        public final boolean x(@NotNull d dVar) {
            d dVar2 = this.f315462c;
            boolean z10 = dVar2 == d.CPU_ACQUIRED;
            if (z10) {
                a.t().addAndGet(a.this, 4398046511104L);
            }
            if (dVar2 != dVar) {
                this.f315462c = dVar;
            }
            return z10;
        }

        public c(a aVar, int i10) {
            this();
            s(i10);
        }
    }

    public /* synthetic */ a(int i10, int i11, long j10, String str, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(i10, i11, (i12 & 4) != 0 ? k.f315491e : j10, (i12 & 8) != 0 ? k.f315487a : str);
    }
}

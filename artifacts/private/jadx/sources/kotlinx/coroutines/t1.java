package kotlinx.coroutines;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@SourceDebugExtension({"SMAP\nEventLoop.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventLoop.common.kt\nkotlinx/coroutines/EventLoopImplBase\n+ 2 EventLoop.kt\nkotlinx/coroutines/EventLoopKt\n+ 3 ThreadSafeHeap.kt\nkotlinx/coroutines/internal/ThreadSafeHeap\n+ 4 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 5 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,547:1\n53#2:548\n51#3:549\n52#3,7:552\n29#4:550\n16#5:551\n1#6:559\n*S KotlinDebug\n*F\n+ 1 EventLoop.common.kt\nkotlinx/coroutines/EventLoopImplBase\n*L\n263#1:548\n336#1:549\n336#1:552,7\n336#1:550\n336#1:551\n*E\n"})
public abstract class t1 extends u1 implements c1 {

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f315634e = AtomicReferenceFieldUpdater.newUpdater(t1.class, Object.class, "_queue$volatile");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f315635f = AtomicReferenceFieldUpdater.newUpdater(t1.class, Object.class, "_delayed$volatile");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f315636g = AtomicIntegerFieldUpdater.newUpdater(t1.class, "_isCompleted$volatile");
    private volatile /* synthetic */ Object _delayed$volatile;
    private volatile /* synthetic */ int _isCompleted$volatile;
    private volatile /* synthetic */ Object _queue$volatile;

    @SourceDebugExtension({"SMAP\nEventLoop.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventLoop.common.kt\nkotlinx/coroutines/EventLoopImplBase$DelayedResumeTask\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,547:1\n1#2:548\n*E\n"})
    private final class a extends c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private final n<Unit> f315637c;

        /* JADX WARN: Multi-variable type inference failed */
        public a(@NotNull long j10, n<? super Unit> nVar) {
            super(j10);
            this.f315637c = nVar;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f315637c.n0(t1.this, Unit.f312394a);
        }

        @Override // kotlinx.coroutines.t1.c
        @NotNull
        public String toString() {
            return super.toString() + this.f315637c;
        }
    }

    private static final class b extends c {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @NotNull
        private final Runnable f315639c;

        public b(long j10, @NotNull Runnable runnable) {
            super(j10);
            this.f315639c = runnable;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f315639c.run();
        }

        @Override // kotlinx.coroutines.t1.c
        @NotNull
        public String toString() {
            return super.toString() + this.f315639c;
        }
    }

    @SourceDebugExtension({"SMAP\nEventLoop.common.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EventLoop.common.kt\nkotlinx/coroutines/EventLoopImplBase$DelayedTask\n+ 2 Synchronized.common.kt\nkotlinx/coroutines/internal/Synchronized_commonKt\n+ 3 Synchronized.kt\nkotlinx/coroutines/internal/SynchronizedKt\n+ 4 ThreadSafeHeap.kt\nkotlinx/coroutines/internal/ThreadSafeHeap\n*L\n1#1,547:1\n29#2:548\n29#2:551\n29#2:560\n16#3:549\n16#3:552\n16#3:561\n63#4:550\n64#4,7:553\n*S KotlinDebug\n*F\n+ 1 EventLoop.common.kt\nkotlinx/coroutines/EventLoopImplBase$DelayedTask\n*L\n441#1:548\n443#1:551\n483#1:560\n441#1:549\n443#1:552\n483#1:561\n443#1:550\n443#1:553,7\n*E\n"})
    public static abstract class c implements Runnable, Comparable<c>, o1, kotlinx.coroutines.internal.n1 {

        @Nullable
        private volatile Object _heap;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @oj.f
        public long f315640a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private int f315641b = -1;

        public c(long j10) {
            this.f315640a = j10;
        }

        @Override // kotlinx.coroutines.internal.n1
        public void b(@Nullable kotlinx.coroutines.internal.m1<?> m1Var) {
            if (this._heap == w1.f315672a) {
                throw new IllegalArgumentException("Failed requirement.");
            }
            this._heap = m1Var;
        }

        @Override // java.lang.Comparable
        /* JADX INFO: renamed from: d, reason: merged with bridge method [inline-methods] */
        public int compareTo(@NotNull c cVar) {
            long j10 = this.f315640a - cVar.f315640a;
            if (j10 > 0) {
                return 1;
            }
            return j10 < 0 ? -1 : 0;
        }

        @Override // kotlinx.coroutines.o1
        public final void dispose() {
            synchronized (this) {
                try {
                    Object obj = this._heap;
                    if (obj == w1.f315672a) {
                        return;
                    }
                    d dVar = obj instanceof d ? (d) obj : null;
                    if (dVar != null) {
                        dVar.l(this);
                    }
                    this._heap = w1.f315672a;
                    Unit unit = Unit.f312394a;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public final int e(long j10, @NotNull d dVar, @NotNull t1 t1Var) {
            synchronized (this) {
                try {
                    if (this._heap == w1.f315672a) {
                        return 2;
                    }
                    synchronized (dVar) {
                        try {
                            c cVarE = dVar.e();
                            if (t1Var.x()) {
                                return 1;
                            }
                            if (cVarE == null) {
                                dVar.f315642c = j10;
                            } else {
                                long j11 = cVarE.f315640a;
                                if (j11 - j10 < 0) {
                                    j10 = j11;
                                }
                                if (j10 - dVar.f315642c > 0) {
                                    dVar.f315642c = j10;
                                }
                            }
                            long j12 = this.f315640a;
                            long j13 = dVar.f315642c;
                            if (j12 - j13 < 0) {
                                this.f315640a = j13;
                            }
                            dVar.a(this);
                            return 0;
                        } catch (Throwable th2) {
                            throw th2;
                        }
                    }
                } catch (Throwable th3) {
                    throw th3;
                }
            }
        }

        public final boolean f(long j10) {
            return j10 - this.f315640a >= 0;
        }

        @Override // kotlinx.coroutines.internal.n1
        public int getIndex() {
            return this.f315641b;
        }

        @Override // kotlinx.coroutines.internal.n1
        @Nullable
        public kotlinx.coroutines.internal.m1<?> k() {
            Object obj = this._heap;
            if (obj instanceof kotlinx.coroutines.internal.m1) {
                return (kotlinx.coroutines.internal.m1) obj;
            }
            return null;
        }

        @Override // kotlinx.coroutines.internal.n1
        public void setIndex(int i10) {
            this.f315641b = i10;
        }

        @NotNull
        public String toString() {
            return "Delayed[nanos=" + this.f315640a + AbstractJsonLexerKt.END_LIST;
        }
    }

    public static final class d extends kotlinx.coroutines.internal.m1<c> {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @oj.f
        public long f315642c;

        public d(long j10) {
            this.f315642c = j10;
        }
    }

    private final int B2(long j10, c cVar) {
        if (x()) {
            return 1;
        }
        d dVar = (d) f315635f.get(this);
        if (dVar == null) {
            androidx.concurrent.futures.b.a(f315635f, this, null, new d(j10));
            Object obj = f315635f.get(this);
            Intrinsics.checkNotNull(obj);
            dVar = (d) obj;
        }
        return cVar.e(j10, dVar, this);
    }

    private final void E2(boolean z10) {
        f315636g.set(this, z10 ? 1 : 0);
    }

    private final /* synthetic */ void G2(Object obj) {
        this._delayed$volatile = obj;
    }

    private final /* synthetic */ void J2(int i10) {
        this._isCompleted$volatile = i10;
    }

    private final /* synthetic */ void L2(Object obj) {
        this._queue$volatile = obj;
    }

    private final boolean N2(c cVar) {
        d dVar = (d) f315635f.get(this);
        return (dVar != null ? dVar.j() : null) == cVar;
    }

    private final void b2() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f315634e;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                int i10 = 2 << 0;
                if (androidx.concurrent.futures.b.a(f315634e, this, null, w1.f315679h)) {
                    return;
                }
            } else if (obj instanceof kotlinx.coroutines.internal.h0) {
                ((kotlinx.coroutines.internal.h0) obj).d();
                return;
            } else {
                if (obj == w1.f315679h) {
                    return;
                }
                kotlinx.coroutines.internal.h0 h0Var = new kotlinx.coroutines.internal.h0(8, true);
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type java.lang.Runnable");
                h0Var.a((Runnable) obj);
                if (androidx.concurrent.futures.b.a(f315634e, this, obj, h0Var)) {
                    return;
                }
            }
        }
    }

    private final Runnable c2() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f315634e;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                return null;
            }
            if (obj instanceof kotlinx.coroutines.internal.h0) {
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable>");
                kotlinx.coroutines.internal.h0 h0Var = (kotlinx.coroutines.internal.h0) obj;
                Object objS = h0Var.s();
                if (objS != kotlinx.coroutines.internal.h0.f315067t) {
                    return (Runnable) objS;
                }
                androidx.concurrent.futures.b.a(f315634e, this, obj, h0Var.r());
            } else {
                if (obj == w1.f315679h) {
                    return null;
                }
                if (androidx.concurrent.futures.b.a(f315634e, this, obj, null)) {
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type java.lang.Runnable");
                    return (Runnable) obj;
                }
            }
        }
    }

    private final void e2() {
        c cVarM;
        d dVar = (d) f315635f.get(this);
        if (dVar == null || dVar.i()) {
            return;
        }
        kotlinx.coroutines.b bVar = kotlinx.coroutines.c.f313549a;
        long jB = bVar != null ? bVar.b() : System.nanoTime();
        do {
            synchronized (dVar) {
                try {
                    c cVarE = dVar.e();
                    cVarM = null;
                    if (cVarE != null) {
                        c cVar = cVarE;
                        cVarM = cVar.f(jB) ? f2(cVar) : false ? dVar.m(0) : null;
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        } while (cVarM != null);
    }

    private final boolean f2(Runnable runnable) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f315634e;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (x()) {
                return false;
            }
            if (obj == null) {
                if (androidx.concurrent.futures.b.a(f315634e, this, null, runnable)) {
                    return true;
                }
            } else if (obj instanceof kotlinx.coroutines.internal.h0) {
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable>");
                kotlinx.coroutines.internal.h0 h0Var = (kotlinx.coroutines.internal.h0) obj;
                int iA = h0Var.a(runnable);
                if (iA == 0) {
                    return true;
                }
                if (iA != 1) {
                    int i10 = 5 >> 2;
                    if (iA == 2) {
                        return false;
                    }
                } else {
                    androidx.concurrent.futures.b.a(f315634e, this, obj, h0Var.r());
                }
            } else {
                if (obj == w1.f315679h) {
                    return false;
                }
                kotlinx.coroutines.internal.h0 h0Var2 = new kotlinx.coroutines.internal.h0(8, true);
                Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type java.lang.Runnable");
                h0Var2.a((Runnable) obj);
                h0Var2.a(runnable);
                if (androidx.concurrent.futures.b.a(f315634e, this, obj, h0Var2)) {
                    return true;
                }
            }
        }
    }

    private final /* synthetic */ Object i2() {
        return this._delayed$volatile;
    }

    private final /* synthetic */ int o2() {
        return this._isCompleted$volatile;
    }

    private final /* synthetic */ Object q2() {
        return this._queue$volatile;
    }

    private final /* synthetic */ void t2(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Object obj, Function1<Object, Unit> function1) {
        while (true) {
            function1.invoke(atomicReferenceFieldUpdater.get(obj));
        }
    }

    private final void w2() {
        c cVarO;
        kotlinx.coroutines.b bVar = kotlinx.coroutines.c.f313549a;
        long jB = bVar != null ? bVar.b() : System.nanoTime();
        while (true) {
            d dVar = (d) f315635f.get(this);
            if (dVar == null || (cVarO = dVar.o()) == null) {
                return;
            } else {
                J1(jB, cVarO);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean x() {
        return f315636g.get(this) == 1;
    }

    @NotNull
    protected final o1 D2(long j10, @NotNull Runnable runnable) {
        long jD = w1.d(j10);
        if (jD >= 4611686018427387903L) {
            return d3.f313923a;
        }
        kotlinx.coroutines.b bVar = kotlinx.coroutines.c.f313549a;
        long jB = bVar != null ? bVar.b() : System.nanoTime();
        b bVar2 = new b(jD + jB, runnable);
        z2(jB, bVar2);
        return bVar2;
    }

    @Override // kotlinx.coroutines.s1
    protected long U0() {
        c cVarJ;
        if (super.U0() == 0) {
            return 0L;
        }
        Object obj = f315634e.get(this);
        if (obj != null) {
            if (!(obj instanceof kotlinx.coroutines.internal.h0)) {
                return obj == w1.f315679h ? Long.MAX_VALUE : 0L;
            }
            if (!((kotlinx.coroutines.internal.h0) obj).m()) {
                return 0L;
            }
        }
        d dVar = (d) f315635f.get(this);
        if (dVar == null || (cVarJ = dVar.j()) == null) {
            return Long.MAX_VALUE;
        }
        long j10 = cVarJ.f315640a;
        kotlinx.coroutines.b bVar = kotlinx.coroutines.c.f313549a;
        return kotlin.ranges.r.v(j10 - (bVar != null ? bVar.b() : System.nanoTime()), 0L);
    }

    @Override // kotlinx.coroutines.c1
    public void b(long j10, @NotNull n<? super Unit> nVar) {
        long jD = w1.d(j10);
        if (jD < 4611686018427387903L) {
            kotlinx.coroutines.b bVar = kotlinx.coroutines.c.f313549a;
            long jB = bVar != null ? bVar.b() : System.nanoTime();
            a aVar = new a(jD + jB, nVar);
            z2(jB, aVar);
            r.a(nVar, aVar);
        }
    }

    @Override // kotlinx.coroutines.c1
    @NotNull
    public o1 d(long j10, @NotNull Runnable runnable, @NotNull CoroutineContext coroutineContext) {
        return c1.a.b(this, j10, runnable, coroutineContext);
    }

    public void d2(@NotNull Runnable runnable) {
        e2();
        if (f2(runnable)) {
            O1();
        } else {
            y0.f315719h.d2(runnable);
        }
    }

    @Override // kotlinx.coroutines.c1
    @kotlin.l(level = kotlin.n.ERROR, message = "Deprecated without replacement as an internal method never intended for public use")
    @Nullable
    public Object g(long j10, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        return c1.a.a(this, j10, dVar);
    }

    @Override // kotlinx.coroutines.n0
    public final void h(@NotNull CoroutineContext coroutineContext, @NotNull Runnable runnable) {
        d2(runnable);
    }

    @Override // kotlinx.coroutines.s1
    protected boolean h1() {
        if (!p1()) {
            return false;
        }
        d dVar = (d) f315635f.get(this);
        if (dVar != null && !dVar.i()) {
            return false;
        }
        Object obj = f315634e.get(this);
        if (obj == null) {
            return true;
        }
        if (obj instanceof kotlinx.coroutines.internal.h0) {
            return ((kotlinx.coroutines.internal.h0) obj).m();
        }
        return obj == w1.f315679h;
    }

    @Override // kotlinx.coroutines.s1
    public long s1() {
        if (u1()) {
            return 0L;
        }
        e2();
        Runnable runnableC2 = c2();
        if (runnableC2 == null) {
            return U0();
        }
        runnableC2.run();
        return 0L;
    }

    @Override // kotlinx.coroutines.s1
    public void shutdown() {
        t3.f315643a.c();
        E2(true);
        b2();
        while (s1() <= 0) {
        }
        w2();
    }

    protected final void y2() {
        f315634e.set(this, null);
        f315635f.set(this, null);
    }

    public final void z2(long j10, @NotNull c cVar) {
        int iB2 = B2(j10, cVar);
        if (iB2 != 0) {
            if (iB2 == 1) {
                J1(j10, cVar);
            } else if (iB2 != 2) {
                throw new IllegalStateException("unexpected result");
            }
        } else if (N2(cVar)) {
            O1();
        }
    }
}

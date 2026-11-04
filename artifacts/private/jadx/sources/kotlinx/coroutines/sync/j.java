package kotlinx.coroutines.sync;

import com.google.common.util.concurrent.x2;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.jvm.internal.g0;
import kotlinx.coroutines.f4;
import kotlinx.coroutines.internal.w0;
import kotlinx.coroutines.internal.x0;
import kotlinx.coroutines.p;
import kotlinx.coroutines.r;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import pj.n;

/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nSemaphore.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Semaphore.kt\nkotlinx/coroutines/sync/SemaphoreAndMutexImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 4 ConcurrentLinkedList.kt\nkotlinx/coroutines/internal/ConcurrentLinkedListKt\n+ 5 Semaphore.kt\nkotlinx/coroutines/sync/SemaphoreSegment\n*L\n1#1,396:1\n200#1,10:410\n200#1,10:420\n1#2:397\n444#3,12:398\n68#4,3:430\n42#4,8:433\n68#4,3:444\n42#4,8:447\n374#5:441\n374#5:442\n366#5:443\n377#5:455\n366#5:456\n374#5:457\n*S KotlinDebug\n*F\n+ 1 Semaphore.kt\nkotlinx/coroutines/sync/SemaphoreAndMutexImpl\n*L\n192#1:410,10\n216#1:420,10\n182#1:398,12\n284#1:430,3\n284#1:433,8\n317#1:444,3\n317#1:447,8\n288#1:441\n294#1:442\n308#1:443\n323#1:455\n329#1:456\n332#1:457\n*E\n"})
public class j {

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f315613c = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "head$volatile");

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f315614d = AtomicLongFieldUpdater.newUpdater(j.class, "deqIdx$volatile");

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f315615e = AtomicReferenceFieldUpdater.newUpdater(j.class, Object.class, "tail$volatile");

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ AtomicLongFieldUpdater f315616f = AtomicLongFieldUpdater.newUpdater(j.class, "enqIdx$volatile");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f315617g = AtomicIntegerFieldUpdater.newUpdater(j.class, "_availablePermits$volatile");
    private volatile /* synthetic */ int _availablePermits$volatile;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f315618a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final n<Throwable, Unit, CoroutineContext, Unit> f315619b;
    private volatile /* synthetic */ long deqIdx$volatile;
    private volatile /* synthetic */ long enqIdx$volatile;
    private volatile /* synthetic */ Object head$volatile;
    private volatile /* synthetic */ Object tail$volatile;

    /* synthetic */ class a extends g0 implements Function2<Long, m, m> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f315620a = new a();

        a() {
            super(2, l.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
        }

        public final m X(long j10, m mVar) {
            return l.j(j10, mVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ m invoke(Long l10, m mVar) {
            return X(l10.longValue(), mVar);
        }
    }

    /* synthetic */ class b extends g0 implements Function2<Long, m, m> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f315621a = new b();

        b() {
            super(2, l.class, "createSegment", "createSegment(JLkotlinx/coroutines/sync/SemaphoreSegment;)Lkotlinx/coroutines/sync/SemaphoreSegment;", 1);
        }

        public final m X(long j10, m mVar) {
            return l.j(j10, mVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ m invoke(Long l10, m mVar) {
            return X(l10.longValue(), mVar);
        }
    }

    public j(int i10, int i11) {
        this.f315618a = i10;
        if (i10 <= 0) {
            throw new IllegalArgumentException(("Semaphore should have at least 1 permit, but had " + i10).toString());
        }
        if (i11 < 0 || i11 > i10) {
            throw new IllegalArgumentException(("The number of acquired permits should be in 0.." + i10).toString());
        }
        m mVar = new m(0L, null, 2);
        this.head$volatile = mVar;
        this.tail$volatile = mVar;
        this._availablePermits$volatile = i10 - i11;
        this.f315619b = new n() { // from class: kotlinx.coroutines.sync.i
            @Override // pj.n
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return j.D(this.f315612a, (Throwable) obj, (Unit) obj2, (CoroutineContext) obj3);
            }
        };
    }

    private final /* synthetic */ int A() {
        return this._availablePermits$volatile;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit D(j jVar, Throwable th2, Unit unit, CoroutineContext coroutineContext) {
        jVar.release();
        return Unit.f312394a;
    }

    private final /* synthetic */ void E(long j10) {
        this.deqIdx$volatile = j10;
    }

    private final /* synthetic */ void F(long j10) {
        this.enqIdx$volatile = j10;
    }

    private final /* synthetic */ void G(Object obj) {
        this.head$volatile = obj;
    }

    private final /* synthetic */ void H(Object obj) {
        this.tail$volatile = obj;
    }

    private final /* synthetic */ void I(int i10) {
        this._availablePermits$volatile = i10;
    }

    private final boolean J(Object obj) {
        if (!(obj instanceof kotlinx.coroutines.n)) {
            if (obj instanceof kotlinx.coroutines.selects.n) {
                return ((kotlinx.coroutines.selects.n) obj).i(this, Unit.f312394a);
            }
            throw new IllegalStateException(("unexpected: " + obj).toString());
        }
        Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
        kotlinx.coroutines.n nVar = (kotlinx.coroutines.n) obj;
        Object objP = nVar.P(Unit.f312394a, null, this.f315619b);
        if (objP == null) {
            return false;
        }
        nVar.b0(objP);
        return true;
    }

    private final boolean K() {
        Object objI;
        m mVar = (m) f315613c.get(this);
        long andIncrement = f315614d.getAndIncrement(this);
        long j10 = andIncrement / ((long) l.f315627f);
        b bVar = b.f315621a;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f315613c;
        loop0: while (true) {
            objI = kotlinx.coroutines.internal.e.i(mVar, j10, bVar);
            if (x0.h(objI)) {
                break;
            }
            w0 w0VarF = x0.f(objI);
            while (true) {
                w0 w0Var = (w0) atomicReferenceFieldUpdater.get(this);
                if (w0Var.f315133c >= w0VarF.f315133c) {
                    break loop0;
                }
                if (!w0VarF.C()) {
                    break;
                }
                if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, w0Var, w0VarF)) {
                    if (!w0Var.v()) {
                        break loop0;
                    }
                    w0Var.q();
                    break loop0;
                }
                if (w0VarF.v()) {
                    w0VarF.q();
                }
            }
        }
        m mVar2 = (m) x0.f(objI);
        mVar2.b();
        if (mVar2.f315133c > j10) {
            return false;
        }
        int i10 = (int) (andIncrement % ((long) l.f315627f));
        Object andSet = mVar2.F().getAndSet(i10, l.f315623b);
        if (andSet != null) {
            if (andSet == l.f315626e) {
                return false;
            }
            return J(andSet);
        }
        int i11 = l.f315622a;
        for (int i12 = 0; i12 < i11; i12++) {
            if (mVar2.F().get(i10) == l.f315624c) {
                return true;
            }
        }
        return !x2.a(mVar2.F(), i10, l.f315623b, l.f315625d);
    }

    private final <W> void m(W w10, Function1<? super W, Boolean> function1, Function1<? super W, Unit> function2) {
        while (r() <= 0) {
            if (function1.invoke(w10).booleanValue()) {
                return;
            }
        }
        function2.invoke(w10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object o(kotlin.coroutines.d<? super Unit> dVar) {
        p pVarB = r.b(kotlin.coroutines.intrinsics.b.e(dVar));
        try {
            if (!p(pVarB)) {
                n(pVarB);
            }
            Object objU = pVarB.u();
            if (objU == kotlin.coroutines.intrinsics.b.l()) {
                kotlin.coroutines.jvm.internal.h.c(dVar);
            }
            return objU == kotlin.coroutines.intrinsics.b.l() ? objU : Unit.f312394a;
        } catch (Throwable th2) {
            pVarB.R();
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean p(f4 f4Var) {
        Object objI;
        m mVar = (m) f315615e.get(this);
        long andIncrement = f315616f.getAndIncrement(this);
        a aVar = a.f315620a;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f315615e;
        long j10 = andIncrement / ((long) l.f315627f);
        loop0: while (true) {
            objI = kotlinx.coroutines.internal.e.i(mVar, j10, aVar);
            if (!x0.h(objI)) {
                w0 w0VarF = x0.f(objI);
                while (true) {
                    w0 w0Var = (w0) atomicReferenceFieldUpdater.get(this);
                    if (w0Var.f315133c >= w0VarF.f315133c) {
                        break loop0;
                    }
                    if (!w0VarF.C()) {
                        break;
                    }
                    if (androidx.concurrent.futures.b.a(atomicReferenceFieldUpdater, this, w0Var, w0VarF)) {
                        if (!w0Var.v()) {
                            break loop0;
                        }
                        w0Var.q();
                        break loop0;
                    }
                    if (w0VarF.v()) {
                        w0VarF.q();
                    }
                }
            } else {
                break;
            }
        }
        m mVar2 = (m) x0.f(objI);
        int i10 = (int) (andIncrement % ((long) l.f315627f));
        if (x2.a(mVar2.F(), i10, null, f4Var)) {
            f4Var.b(mVar2, i10);
            return true;
        }
        if (!x2.a(mVar2.F(), i10, l.f315623b, l.f315624c)) {
            return false;
        }
        if (f4Var instanceof kotlinx.coroutines.n) {
            Intrinsics.checkNotNull(f4Var, "null cannot be cast to non-null type kotlinx.coroutines.CancellableContinuation<kotlin.Unit>");
            ((kotlinx.coroutines.n) f4Var).J(Unit.f312394a, this.f315619b);
        } else {
            if (!(f4Var instanceof kotlinx.coroutines.selects.n)) {
                throw new IllegalStateException(("unexpected: " + f4Var).toString());
            }
            ((kotlinx.coroutines.selects.n) f4Var).f(Unit.f312394a);
        }
        return true;
    }

    private final void q() {
        int i10;
        do {
            i10 = f315617g.get(this);
            if (i10 <= this.f315618a) {
                return;
            }
        } while (!f315617g.compareAndSet(this, i10, this.f315618a));
    }

    private final int r() {
        int andDecrement;
        do {
            andDecrement = f315617g.getAndDecrement(this);
        } while (andDecrement > this.f315618a);
        return andDecrement;
    }

    private final /* synthetic */ long s() {
        return this.deqIdx$volatile;
    }

    private final /* synthetic */ long u() {
        return this.enqIdx$volatile;
    }

    private final /* synthetic */ Object w() {
        return this.head$volatile;
    }

    private final /* synthetic */ Object y() {
        return this.tail$volatile;
    }

    protected final void C(@NotNull kotlinx.coroutines.selects.n<?> nVar, @Nullable Object obj) {
        while (r() <= 0) {
            Intrinsics.checkNotNull(nVar, "null cannot be cast to non-null type kotlinx.coroutines.Waiter");
            if (p((f4) nVar)) {
                return;
            }
        }
        nVar.f(Unit.f312394a);
    }

    public final boolean a() {
        while (true) {
            int i10 = f315617g.get(this);
            if (i10 > this.f315618a) {
                q();
            } else {
                if (i10 <= 0) {
                    return false;
                }
                if (f315617g.compareAndSet(this, i10, i10 - 1)) {
                    return true;
                }
            }
        }
    }

    public final int f() {
        return Math.max(f315617g.get(this), 0);
    }

    @Nullable
    public final Object g(@NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objO;
        if (r() <= 0 && (objO = o(dVar)) == kotlin.coroutines.intrinsics.b.l()) {
            return objO;
        }
        return Unit.f312394a;
    }

    protected final void n(@NotNull kotlinx.coroutines.n<? super Unit> nVar) {
        while (r() <= 0) {
            Intrinsics.checkNotNull(nVar, "null cannot be cast to non-null type kotlinx.coroutines.Waiter");
            if (p((f4) nVar)) {
                return;
            }
        }
        nVar.J(Unit.f312394a, this.f315619b);
    }

    public final void release() {
        do {
            int andIncrement = f315617g.getAndIncrement(this);
            if (andIncrement >= this.f315618a) {
                q();
                throw new IllegalStateException(("The number of released permits cannot be greater than " + this.f315618a).toString());
            }
            if (andIncrement >= 0) {
                return;
            }
        } while (!K());
    }
}

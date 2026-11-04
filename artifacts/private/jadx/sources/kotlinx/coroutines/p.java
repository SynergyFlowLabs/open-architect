package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
@kotlin.a1
@SourceDebugExtension({"SMAP\nCancellableContinuationImpl.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CancellableContinuationImpl.kt\nkotlinx/coroutines/CancellableContinuationImpl\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 CancellableContinuationImpl.kt\nkotlinx/coroutines/CancellableContinuationImplKt\n+ 4 StackTraceRecovery.kt\nkotlinx/coroutines/internal/StackTraceRecoveryKt\n*L\n1#1,701:1\n227#1,10:705\n227#1,10:716\n1#2:702\n20#3:703\n20#3:704\n18#3:715\n17#3:726\n18#3,3:727\n17#3:730\n18#3,3:731\n18#3:738\n17#3,4:739\n57#4,2:734\n57#4,2:736\n57#4,2:743\n*S KotlinDebug\n*F\n+ 1 CancellableContinuationImpl.kt\nkotlinx/coroutines/CancellableContinuationImpl\n*L\n239#1:705,10\n244#1:716,10\n69#1:703\n155#1:704\n242#1:715\n271#1:726\n272#1:727,3\n281#1:730\n282#1:731,3\n387#1:738\n390#1:739,4\n323#1:734,2\n333#1:736,2\n614#1:743,2\n*E\n"})
public class p<T> extends i1<T> implements n<T>, kotlin.coroutines.jvm.internal.e, f4 {

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final /* synthetic */ AtomicIntegerFieldUpdater f315187f = AtomicIntegerFieldUpdater.newUpdater(p.class, "_decisionAndIndex$volatile");

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f315188g = AtomicReferenceFieldUpdater.newUpdater(p.class, Object.class, "_state$volatile");

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f315189h = AtomicReferenceFieldUpdater.newUpdater(p.class, Object.class, "_parentHandle$volatile");
    private volatile /* synthetic */ int _decisionAndIndex$volatile;
    private volatile /* synthetic */ Object _parentHandle$volatile;
    private volatile /* synthetic */ Object _state$volatile;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final kotlin.coroutines.d<T> f315190d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final CoroutineContext f315191e;

    /* JADX WARN: Multi-variable type inference failed */
    public p(@NotNull kotlin.coroutines.d<? super T> dVar, int i10) {
        super(i10);
        this.f315190d = dVar;
        this.f315191e = dVar.getContext();
        this._decisionAndIndex$volatile = 536870911;
        this._state$volatile = d.f313920a;
    }

    private final /* synthetic */ Object A() {
        return this._parentHandle$volatile;
    }

    private final /* synthetic */ Object C() {
        return this._state$volatile;
    }

    private final o1 E() {
        p2 p2Var = (p2) getContext().get(p2.M2);
        if (p2Var == null) {
            return null;
        }
        o1 o1VarB = u2.B(p2Var, false, new t(this), 1, null);
        androidx.concurrent.futures.b.a(f315189h, this, null, o1VarB);
        return o1VarB;
    }

    private final void F(Object obj) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f315188g;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof d) {
                if (androidx.concurrent.futures.b.a(f315188g, this, obj2, obj)) {
                    return;
                }
            } else if ((obj2 instanceof m) || (obj2 instanceof kotlinx.coroutines.internal.w0)) {
                N(obj, obj2);
            } else {
                if (obj2 instanceof c0) {
                    c0 c0Var = (c0) obj2;
                    if (!c0Var.d()) {
                        N(obj, obj2);
                    }
                    if (obj2 instanceof s) {
                        if (obj2 == null) {
                            c0Var = null;
                        }
                        Throwable th2 = c0Var != null ? c0Var.f313551a : null;
                        if (obj instanceof m) {
                            k((m) obj, th2);
                            return;
                        } else {
                            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.internal.Segment<*>");
                            n((kotlinx.coroutines.internal.w0) obj, th2);
                            return;
                        }
                    }
                    return;
                }
                if (obj2 instanceof b0) {
                    b0 b0Var = (b0) obj2;
                    if (b0Var.f313540b != null) {
                        N(obj, obj2);
                    }
                    if (obj instanceof kotlinx.coroutines.internal.w0) {
                        return;
                    }
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                    m mVar = (m) obj;
                    if (b0Var.h()) {
                        k(mVar, b0Var.f313543e);
                        return;
                    } else {
                        boolean z10 = true;
                        if (androidx.concurrent.futures.b.a(f315188g, this, obj2, b0.g(b0Var, null, mVar, null, null, null, 29, null))) {
                            return;
                        }
                    }
                } else {
                    if (obj instanceof kotlinx.coroutines.internal.w0) {
                        return;
                    }
                    Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlinx.coroutines.CancelHandler");
                    int i10 = 7 >> 0;
                    if (androidx.concurrent.futures.b.a(f315188g, this, obj2, new b0(obj2, (m) obj, null, null, null, 28, null))) {
                        return;
                    }
                }
            }
        }
    }

    private final boolean H() {
        if (j1.d(this.f315036c)) {
            kotlin.coroutines.d<T> dVar = this.f315190d;
            Intrinsics.checkNotNull(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
            if (((kotlinx.coroutines.internal.m) dVar).p()) {
                return true;
            }
        }
        return false;
    }

    private final /* synthetic */ void I(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Object obj, Function1<Object, Unit> function1) {
        while (true) {
            function1.invoke(atomicReferenceFieldUpdater.get(obj));
        }
    }

    private final /* synthetic */ void L(AtomicIntegerFieldUpdater atomicIntegerFieldUpdater, Object obj, Function1<? super Integer, Unit> function1) {
        while (true) {
            function1.invoke(Integer.valueOf(atomicIntegerFieldUpdater.get(obj)));
        }
    }

    private final void N(Object obj, Object obj2) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + obj + ", already has " + obj2).toString());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit T(Function1 function1, Throwable th2, Object obj, CoroutineContext coroutineContext) {
        function1.invoke(th2);
        return Unit.f312394a;
    }

    public static /* synthetic */ void V(p pVar, Object obj, int i10, pj.n nVar, int i11, Object obj2) {
        if (obj2 != null) {
            throw new UnsupportedOperationException("Super calls with default arguments not supported in this target, function: resumeImpl");
        }
        if ((i11 & 4) != 0) {
            nVar = null;
        }
        pVar.U(obj, i10, nVar);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0011  */
    /* JADX WARN: Code duplicated, block: B:11:0x0013  */
    /* JADX WARN: Code duplicated, block: B:13:0x0017 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:14:0x0019  */
    /* JADX WARN: Code duplicated, block: B:18:0x0022  */
    /* JADX WARN: Code duplicated, block: B:20:0x0027  */
    private final <R> Object W(e3 e3Var, R r10, int i10, pj.n<? super Throwable, ? super R, ? super CoroutineContext, Unit> nVar, Object obj) {
        m mVar;
        if (r10 instanceof c0) {
            return r10;
        }
        if (j1.c(i10)) {
            if (nVar == null) {
                if (!(e3Var instanceof m)) {
                    if (obj != null) {
                    }
                }
            }
            if (e3Var instanceof m) {
                mVar = (m) e3Var;
            } else {
                mVar = null;
            }
            return new b0(r10, mVar, nVar, obj, null, 16, null);
        }
        if (obj != null) {
            if (nVar == null) {
                if (!(e3Var instanceof m)) {
                    if (obj != null) {
                    }
                }
            }
            if (e3Var instanceof m) {
                mVar = (m) e3Var;
            } else {
                mVar = null;
            }
            return new b0(r10, mVar, nVar, obj, null, 16, null);
        }
        return r10;
    }

    private final /* synthetic */ void X(int i10) {
        this._decisionAndIndex$volatile = i10;
    }

    private final /* synthetic */ void Y(Object obj) {
        this._parentHandle$volatile = obj;
    }

    private final /* synthetic */ void Z(Object obj) {
        this._state$volatile = obj;
    }

    private final boolean a0() {
        int i10;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f315187f;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            int i11 = i10 >> 29;
            if (i11 != 0) {
                if (i11 == 1) {
                    return false;
                }
                throw new IllegalStateException("Already resumed");
            }
        } while (!f315187f.compareAndSet(this, i10, 1073741824 + (536870911 & i10)));
        return true;
    }

    private final <R> kotlinx.coroutines.internal.z0 d0(R r10, Object obj, pj.n<? super Throwable, ? super R, ? super CoroutineContext, Unit> nVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f315188g;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (!(obj2 instanceof e3)) {
                Object obj3 = obj;
                if ((obj2 instanceof b0) && obj3 != null && ((b0) obj2).f313542d == obj3) {
                    return q.f315201g;
                }
                return null;
            }
            p<T> pVar = this;
            R r11 = r10;
            Object obj4 = obj;
            pj.n<? super Throwable, ? super R, ? super CoroutineContext, Unit> nVar2 = nVar;
            if (androidx.concurrent.futures.b.a(f315188g, pVar, obj2, pVar.W((e3) obj2, r11, this.f315036c, nVar2, obj4))) {
                pVar.q();
                return q.f315201g;
            }
            this = pVar;
            r10 = r11;
            nVar = nVar2;
            obj = obj4;
        }
    }

    private final boolean f0() {
        int i10;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f315187f;
        do {
            i10 = atomicIntegerFieldUpdater.get(this);
            int i11 = i10 >> 29;
            if (i11 != 0) {
                if (i11 == 2) {
                    return false;
                }
                throw new IllegalStateException("Already suspended");
            }
        } while (!f315187f.compareAndSet(this, i10, 536870912 + (536870911 & i10)));
        return true;
    }

    private final /* synthetic */ void g0(AtomicIntegerFieldUpdater atomicIntegerFieldUpdater, Object obj, Function1<? super Integer, Integer> function1) {
        int i10;
        do {
            i10 = atomicIntegerFieldUpdater.get(obj);
        } while (!atomicIntegerFieldUpdater.compareAndSet(obj, i10, function1.invoke(Integer.valueOf(i10)).intValue()));
    }

    private final Void j(Object obj) {
        throw new IllegalStateException(("Already resumed, but proposed with update " + obj).toString());
    }

    private final void l(Function0<Unit> function0) {
        try {
            function0.invoke();
        } catch (Throwable th2) {
            p0.b(getContext(), new d0("Exception in invokeOnCancellation handler for " + this, th2));
        }
    }

    private final void n(kotlinx.coroutines.internal.w0<?> w0Var, Throwable th2) {
        int i10 = f315187f.get(this) & 536870911;
        if (i10 == 536870911) {
            throw new IllegalStateException("The index for Segment.onCancellation(..) is broken");
        }
        try {
            w0Var.z(i10, th2, getContext());
        } catch (Throwable th3) {
            p0.b(getContext(), new d0("Exception in invokeOnCancellation handler for " + this, th3));
        }
    }

    private final boolean o(Throwable th2) {
        if (!H()) {
            return false;
        }
        kotlin.coroutines.d<T> dVar = this.f315190d;
        Intrinsics.checkNotNull(dVar, "null cannot be cast to non-null type kotlinx.coroutines.internal.DispatchedContinuation<*>");
        return ((kotlinx.coroutines.internal.m) dVar).r(th2);
    }

    private final void q() {
        if (H()) {
            return;
        }
        p();
    }

    private final void r(int i10) {
        if (a0()) {
            return;
        }
        j1.a(this, i10);
    }

    private final o1 t() {
        return (o1) f315189h.get(this);
    }

    private final String w() {
        Object objV = v();
        if (objV instanceof e3) {
            return "Active";
        }
        return objV instanceof s ? com.facebook.internal.a.f99699u : com.facebook.internal.a.f99695s;
    }

    private final /* synthetic */ int y() {
        return this._decisionAndIndex$volatile;
    }

    public final void G(@NotNull m mVar) {
        F(mVar);
    }

    @Override // kotlinx.coroutines.n
    public <R extends T> void J(R r10, @Nullable pj.n<? super Throwable, ? super R, ? super CoroutineContext, Unit> nVar) {
        U(r10, this.f315036c, nVar);
    }

    @Override // kotlinx.coroutines.n
    public void K(@NotNull n0 n0Var, @NotNull Throwable th2) {
        kotlin.coroutines.d<T> dVar = this.f315190d;
        kotlinx.coroutines.internal.m mVar = dVar instanceof kotlinx.coroutines.internal.m ? (kotlinx.coroutines.internal.m) dVar : null;
        int i10 = 0 >> 2;
        V(this, new c0(th2, false, 2, null), (mVar != null ? mVar.f315092d : null) == n0Var ? 4 : this.f315036c, null, 4, null);
    }

    @Override // kotlinx.coroutines.n
    public void M(T t10, @Nullable final Function1<? super Throwable, Unit> function1) {
        U(t10, this.f315036c, function1 != null ? new pj.n() { // from class: kotlinx.coroutines.o
            @Override // pj.n
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return p.T(function1, (Throwable) obj, obj2, (CoroutineContext) obj3);
            }
        } : null);
    }

    @NotNull
    protected String O() {
        return "CancellableContinuation";
    }

    @Override // kotlinx.coroutines.n
    @Nullable
    public <R extends T> Object P(R r10, @Nullable Object obj, @Nullable pj.n<? super Throwable, ? super R, ? super CoroutineContext, Unit> nVar) {
        return d0(r10, obj, nVar);
    }

    public final void Q(@NotNull Throwable th2) {
        if (o(th2)) {
            return;
        }
        c(th2);
        q();
    }

    public final void R() {
        Throwable thY;
        kotlin.coroutines.d<T> dVar = this.f315190d;
        kotlinx.coroutines.internal.m mVar = dVar instanceof kotlinx.coroutines.internal.m ? (kotlinx.coroutines.internal.m) dVar : null;
        if (mVar == null || (thY = mVar.y(this)) == null) {
            return;
        }
        p();
        c(thY);
    }

    @oj.i(name = "resetStateReusable")
    public final boolean S() {
        Object obj = f315188g.get(this);
        if ((obj instanceof b0) && ((b0) obj).f313542d != null) {
            p();
            return false;
        }
        f315187f.set(this, 536870911);
        f315188g.set(this, d.f313920a);
        return true;
    }

    public final <R> void U(R r10, int i10, @Nullable pj.n<? super Throwable, ? super R, ? super CoroutineContext, Unit> nVar) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f315188g;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof e3)) {
                p<T> pVar = this;
                R r11 = r10;
                pj.n<? super Throwable, ? super R, ? super CoroutineContext, Unit> nVar2 = nVar;
                if (obj instanceof s) {
                    s sVar = (s) obj;
                    if (sVar.h()) {
                        if (nVar2 != null) {
                            pVar.m(nVar2, sVar.f313551a, r11);
                        }
                        return;
                    }
                }
                pVar.j(r11);
                throw new kotlin.a0();
            }
            p<T> pVar2 = this;
            R r12 = r10;
            int i11 = i10;
            pj.n<? super Throwable, ? super R, ? super CoroutineContext, Unit> nVar3 = nVar;
            if (androidx.concurrent.futures.b.a(f315188g, pVar2, obj, pVar2.W((e3) obj, r12, i11, nVar3, null))) {
                pVar2.q();
                pVar2.r(i11);
                return;
            } else {
                this = pVar2;
                r10 = r12;
                i10 = i11;
                nVar = nVar3;
            }
        }
    }

    @Override // kotlinx.coroutines.i1
    public void a(@Nullable Object obj, @NotNull Throwable th2) {
        Throwable th3;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f315188g;
        while (true) {
            Object obj2 = atomicReferenceFieldUpdater.get(this);
            if (obj2 instanceof e3) {
                throw new IllegalStateException("Not completed");
            }
            if (obj2 instanceof c0) {
                return;
            }
            if (obj2 instanceof b0) {
                b0 b0Var = (b0) obj2;
                if (b0Var.h()) {
                    throw new IllegalStateException("Must be called at most once");
                }
                Throwable th4 = th2;
                th3 = th4;
                if (androidx.concurrent.futures.b.a(f315188g, this, obj2, b0.g(b0Var, null, null, null, null, th4, 15, null))) {
                    b0Var.i(this, th3);
                    return;
                }
            } else {
                th3 = th2;
                if (androidx.concurrent.futures.b.a(f315188g, this, obj2, new b0(obj2, null, null, null, th3, 14, null))) {
                    return;
                }
            }
            th2 = th3;
        }
    }

    @Override // kotlinx.coroutines.f4
    public void b(@NotNull kotlinx.coroutines.internal.w0<?> w0Var, int i10) {
        int i11;
        AtomicIntegerFieldUpdater atomicIntegerFieldUpdater = f315187f;
        do {
            i11 = atomicIntegerFieldUpdater.get(this);
            if ((i11 & 536870911) != 536870911) {
                throw new IllegalStateException("invokeOnCancellation should be called at most once");
            }
        } while (!atomicIntegerFieldUpdater.compareAndSet(this, i11, ((i11 >> 29) << 29) + i10));
        F(w0Var);
    }

    @Override // kotlinx.coroutines.n
    public void b0(@NotNull Object obj) {
        r(this.f315036c);
    }

    @Override // kotlinx.coroutines.n
    public boolean c(@Nullable Throwable th2) {
        Object obj;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f315188g;
        do {
            obj = atomicReferenceFieldUpdater.get(this);
            if (!(obj instanceof e3)) {
                return false;
            }
        } while (!androidx.concurrent.futures.b.a(f315188g, this, obj, new s(this, th2, (obj instanceof m) || (obj instanceof kotlinx.coroutines.internal.w0))));
        e3 e3Var = (e3) obj;
        if (e3Var instanceof m) {
            k((m) obj, th2);
        } else if (e3Var instanceof kotlinx.coroutines.internal.w0) {
            n((kotlinx.coroutines.internal.w0) obj, th2);
        }
        q();
        r(this.f315036c);
        return true;
    }

    @Override // kotlinx.coroutines.n
    @Nullable
    public Object c0(T t10, @Nullable Object obj) {
        return d0(t10, obj, null);
    }

    @Override // kotlinx.coroutines.i1
    @NotNull
    public final kotlin.coroutines.d<T> d() {
        return this.f315190d;
    }

    @Override // kotlinx.coroutines.i1
    @Nullable
    public Throwable e(@Nullable Object obj) {
        Throwable thE = super.e(obj);
        if (thE != null) {
            return thE;
        }
        return null;
    }

    @Override // kotlinx.coroutines.n
    public void e0(@NotNull Function1<? super Throwable, Unit> function1) {
        r.c(this, new m.a(function1));
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // kotlinx.coroutines.i1
    public <T> T f(@Nullable Object obj) {
        return obj instanceof b0 ? (T) ((b0) obj).f313539a : obj;
    }

    @Override // kotlin.coroutines.jvm.internal.e
    @Nullable
    public kotlin.coroutines.jvm.internal.e getCallerFrame() {
        kotlin.coroutines.d<T> dVar = this.f315190d;
        if (dVar instanceof kotlin.coroutines.jvm.internal.e) {
            return (kotlin.coroutines.jvm.internal.e) dVar;
        }
        return null;
    }

    @Override // kotlin.coroutines.d
    @NotNull
    public CoroutineContext getContext() {
        return this.f315191e;
    }

    @Override // kotlin.coroutines.jvm.internal.e
    @Nullable
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlinx.coroutines.i1
    @Nullable
    public Object h() {
        return v();
    }

    @Override // kotlinx.coroutines.n
    public boolean isActive() {
        return v() instanceof e3;
    }

    @Override // kotlinx.coroutines.n
    public boolean isCancelled() {
        return v() instanceof s;
    }

    public final void k(@NotNull m mVar, @Nullable Throwable th2) {
        try {
            mVar.e(th2);
        } catch (Throwable th3) {
            p0.b(getContext(), new d0("Exception in invokeOnCancellation handler for " + this, th3));
        }
    }

    @Override // kotlinx.coroutines.n
    @Nullable
    public Object l0(@NotNull Throwable th2) {
        return d0(new c0(th2, false, 2, null), null, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final <R> void m(@NotNull pj.n<? super Throwable, ? super R, ? super CoroutineContext, Unit> nVar, @NotNull Throwable th2, R r10) {
        try {
            nVar.invoke(th2, r10, getContext());
        } catch (Throwable th3) {
            p0.b(getContext(), new d0("Exception in resume onCancellation handler for " + this, th3));
        }
    }

    @Override // kotlinx.coroutines.n
    public void n0(@NotNull n0 n0Var, T t10) {
        kotlin.coroutines.d<T> dVar = this.f315190d;
        kotlinx.coroutines.internal.m mVar = dVar instanceof kotlinx.coroutines.internal.m ? (kotlinx.coroutines.internal.m) dVar : null;
        V(this, t10, (mVar != null ? mVar.f315092d : null) == n0Var ? 4 : this.f315036c, null, 4, null);
    }

    public final void p() {
        o1 o1VarT = t();
        if (o1VarT == null) {
            return;
        }
        o1VarT.dispose();
        f315189h.set(this, d3.f313923a);
    }

    @Override // kotlinx.coroutines.n
    public void p0() {
        o1 o1VarE = E();
        if (o1VarE != null && x()) {
            o1VarE.dispose();
            f315189h.set(this, d3.f313923a);
        }
    }

    @Override // kotlin.coroutines.d
    public void resumeWith(@NotNull Object obj) {
        V(this, f0.c(obj, this), this.f315036c, null, 4, null);
    }

    @NotNull
    public Throwable s(@NotNull p2 p2Var) {
        return p2Var.y0();
    }

    @NotNull
    public String toString() {
        return O() + '(' + x0.c(this.f315190d) + "){" + w() + "}@" + x0.b(this);
    }

    @kotlin.a1
    @Nullable
    public final Object u() {
        p2 p2Var;
        boolean zH = H();
        if (f0()) {
            if (t() == null) {
                E();
            }
            if (zH) {
                R();
            }
            return kotlin.coroutines.intrinsics.b.l();
        }
        if (zH) {
            R();
        }
        Object objV = v();
        if (objV instanceof c0) {
            throw ((c0) objV).f313551a;
        }
        if (!j1.c(this.f315036c) || (p2Var = (p2) getContext().get(p2.M2)) == null || p2Var.isActive()) {
            return f(objV);
        }
        CancellationException cancellationExceptionY0 = p2Var.y0();
        a(objV, cancellationExceptionY0);
        throw cancellationExceptionY0;
    }

    @Nullable
    public final Object v() {
        return f315188g.get(this);
    }

    @Override // kotlinx.coroutines.n
    public boolean x() {
        return !(v() instanceof e3);
    }
}

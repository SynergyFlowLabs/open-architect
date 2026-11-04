package kotlinx.coroutines.internal;

import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.d4;
import kotlinx.coroutines.p2;
import kotlinx.coroutines.s1;
import kotlinx.coroutines.t3;
import kotlinx.serialization.json.internal.AbstractJsonLexerKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes12.dex */
@SourceDebugExtension({"SMAP\nDispatchedContinuation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DispatchedContinuation.kt\nkotlinx/coroutines/internal/DispatchedContinuation\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 DispatchedContinuation.kt\nkotlinx/coroutines/internal/DispatchedContinuationKt\n+ 4 DispatchedTask.kt\nkotlinx/coroutines/DispatchedTaskKt\n+ 5 CoroutineContext.kt\nkotlinx/coroutines/CoroutineContextKt\n*L\n1#1,313:1\n224#1,8:377\n236#1:385\n237#1,2:396\n239#1:400\n1#2:314\n1#2:320\n1#2:361\n293#3,5:315\n298#3,12:321\n310#3:355\n293#3,5:356\n298#3,12:362\n310#3:415\n184#4,3:333\n187#4,14:341\n184#4,3:374\n187#4,14:401\n91#5,5:336\n103#5,10:386\n114#5,2:398\n103#5,13:416\n*S KotlinDebug\n*F\n+ 1 DispatchedContinuation.kt\nkotlinx/coroutines/internal/DispatchedContinuation\n*L\n214#1:377,8\n215#1:385\n215#1:396,2\n215#1:400\n195#1:320\n213#1:361\n195#1:315,5\n195#1:321,12\n195#1:355\n213#1:356,5\n213#1:362,12\n213#1:415\n195#1:333,3\n195#1:341,14\n213#1:374,3\n213#1:401,14\n196#1:336,5\n215#1:386,10\n215#1:398,2\n236#1:416,13\n*E\n"})
public final class m<T> extends kotlinx.coroutines.i1<T> implements kotlin.coroutines.jvm.internal.e, kotlin.coroutines.d<T> {

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final /* synthetic */ AtomicReferenceFieldUpdater f315091h = AtomicReferenceFieldUpdater.newUpdater(m.class, Object.class, "_reusableCancellableContinuation$volatile");
    private volatile /* synthetic */ Object _reusableCancellableContinuation$volatile;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @oj.f
    @NotNull
    public final kotlinx.coroutines.n0 f315092d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @oj.f
    @NotNull
    public final kotlin.coroutines.d<T> f315093e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @oj.f
    @Nullable
    public Object f315094f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @oj.f
    @NotNull
    public final Object f315095g;

    /* JADX WARN: Multi-variable type inference failed */
    public m(@NotNull kotlinx.coroutines.n0 n0Var, @NotNull kotlin.coroutines.d<? super T> dVar) {
        super(-1);
        this.f315092d = n0Var;
        this.f315093e = dVar;
        this.f315094f = n.f315100a;
        this.f315095g = i1.g(getContext());
    }

    private final kotlinx.coroutines.p<?> l() {
        Object obj = f315091h.get(this);
        if (obj instanceof kotlinx.coroutines.p) {
            return (kotlinx.coroutines.p) obj;
        }
        return null;
    }

    private final /* synthetic */ Object m() {
        return this._reusableCancellableContinuation$volatile;
    }

    public static /* synthetic */ void o() {
    }

    private final /* synthetic */ void q(AtomicReferenceFieldUpdater atomicReferenceFieldUpdater, Object obj, Function1<Object, Unit> function1) {
        while (true) {
            function1.invoke(atomicReferenceFieldUpdater.get(obj));
        }
    }

    private final /* synthetic */ void w(Object obj) {
        this._reusableCancellableContinuation$volatile = obj;
    }

    @Override // kotlinx.coroutines.i1
    @NotNull
    public kotlin.coroutines.d<T> d() {
        return this;
    }

    @Override // kotlin.coroutines.jvm.internal.e
    @Nullable
    public kotlin.coroutines.jvm.internal.e getCallerFrame() {
        kotlin.coroutines.d<T> dVar = this.f315093e;
        if (dVar instanceof kotlin.coroutines.jvm.internal.e) {
            return (kotlin.coroutines.jvm.internal.e) dVar;
        }
        return null;
    }

    @Override // kotlin.coroutines.d
    @NotNull
    public CoroutineContext getContext() {
        return this.f315093e.getContext();
    }

    @Override // kotlin.coroutines.jvm.internal.e
    @Nullable
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // kotlinx.coroutines.i1
    @Nullable
    public Object h() {
        Object obj = this.f315094f;
        this.f315094f = n.f315100a;
        return obj;
    }

    public final void i() {
        while (f315091h.get(this) == n.f315101b) {
        }
    }

    @Nullable
    public final kotlinx.coroutines.p<T> j() {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f315091h;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            if (obj == null) {
                f315091h.set(this, n.f315101b);
                return null;
            }
            if (obj instanceof kotlinx.coroutines.p) {
                if (androidx.concurrent.futures.b.a(f315091h, this, obj, n.f315101b)) {
                    return (kotlinx.coroutines.p) obj;
                }
            } else if (obj != n.f315101b && !(obj instanceof Throwable)) {
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        }
    }

    public final void k(@NotNull CoroutineContext coroutineContext, T t10) {
        this.f315094f = t10;
        this.f315036c = 1;
        this.f315092d.j(coroutineContext, this);
    }

    public final boolean p() {
        return f315091h.get(this) != null;
    }

    public final boolean r(@NotNull Throwable th2) {
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f315091h;
        while (true) {
            Object obj = atomicReferenceFieldUpdater.get(this);
            z0 z0Var = n.f315101b;
            if (Intrinsics.areEqual(obj, z0Var)) {
                if (androidx.concurrent.futures.b.a(f315091h, this, z0Var, th2)) {
                    return true;
                }
            } else {
                if (obj instanceof Throwable) {
                    return true;
                }
                if (androidx.concurrent.futures.b.a(f315091h, this, obj, null)) {
                    return false;
                }
            }
        }
    }

    @Override // kotlin.coroutines.d
    public void resumeWith(@NotNull Object obj) {
        Object objB = kotlinx.coroutines.f0.b(obj);
        if (n.f(this.f315092d, getContext())) {
            this.f315094f = objB;
            this.f315036c = 0;
            n.e(this.f315092d, getContext(), this);
            return;
        }
        s1 s1VarB = t3.f315643a.b();
        if (s1VarB.j1()) {
            this.f315094f = objB;
            this.f315036c = 0;
            s1VarB.T0(this);
        } else {
            s1VarB.e1(true);
            try {
                CoroutineContext context = getContext();
                Object objI = i1.i(context, this.f315095g);
                try {
                    this.f315093e.resumeWith(obj);
                    Unit unit = Unit.f312394a;
                    i1.f(context, objI);
                    while (s1VarB.u1()) {
                    }
                } catch (Throwable th2) {
                    i1.f(context, objI);
                    throw th2;
                }
            } catch (Throwable th3) {
                try {
                    g(th3);
                } catch (Throwable th4) {
                    s1VarB.M0(true);
                    throw th4;
                }
            }
            s1VarB.M0(true);
        }
    }

    public final void s() {
        i();
        kotlinx.coroutines.p<?> pVarL = l();
        if (pVarL != null) {
            pVarL.p();
        }
    }

    public final void t(@NotNull Object obj) {
        Object objB = kotlinx.coroutines.f0.b(obj);
        int i10 = 3 ^ 1;
        if (n.f(this.f315092d, getContext())) {
            this.f315094f = objB;
            this.f315036c = 1;
            n.e(this.f315092d, getContext(), this);
            return;
        }
        s1 s1VarB = t3.f315643a.b();
        if (s1VarB.j1()) {
            this.f315094f = objB;
            this.f315036c = 1;
            s1VarB.T0(this);
            return;
        }
        s1VarB.e1(true);
        try {
            p2 p2Var = (p2) getContext().get(p2.M2);
            if (p2Var == null || p2Var.isActive()) {
                kotlin.coroutines.d<T> dVar = this.f315093e;
                Object obj2 = this.f315095g;
                CoroutineContext context = dVar.getContext();
                Object objI = i1.i(context, obj2);
                d4<?> d4VarM = objI != i1.f315077a ? kotlinx.coroutines.l0.m(dVar, context, objI) : null;
                try {
                    this.f315093e.resumeWith(obj);
                    Unit unit = Unit.f312394a;
                    kotlin.jvm.internal.h0.d(1);
                    if (d4VarM == null || d4VarM.j2()) {
                        i1.f(context, objI);
                    }
                    kotlin.jvm.internal.h0.c(1);
                } finally {
                    kotlin.jvm.internal.h0.d(1);
                    if (d4VarM == null || d4VarM.j2()) {
                        i1.f(context, objI);
                    }
                    kotlin.jvm.internal.h0.c(1);
                }
            } else {
                CancellationException cancellationExceptionY0 = p2Var.y0();
                a(objB, cancellationExceptionY0);
                Result.a aVar = Result.Companion;
                resumeWith(Result.m785constructorimpl(ResultKt.createFailure(cancellationExceptionY0)));
            }
            do {
            } while (s1VarB.u1());
            kotlin.jvm.internal.h0.d(1);
        } catch (Throwable th2) {
            try {
                g(th2);
                kotlin.jvm.internal.h0.d(1);
            } catch (Throwable th3) {
                kotlin.jvm.internal.h0.d(1);
                s1VarB.M0(true);
                kotlin.jvm.internal.h0.c(1);
                throw th3;
            }
        }
        s1VarB.M0(true);
    }

    @NotNull
    public String toString() {
        return "DispatchedContinuation[" + this.f315092d + ", " + kotlinx.coroutines.x0.c(this.f315093e) + AbstractJsonLexerKt.END_LIST;
    }

    public final boolean u(@Nullable Object obj) {
        p2 p2Var = (p2) getContext().get(p2.M2);
        if (p2Var == null || p2Var.isActive()) {
            return false;
        }
        CancellationException cancellationExceptionY0 = p2Var.y0();
        a(obj, cancellationExceptionY0);
        Result.a aVar = Result.Companion;
        resumeWith(Result.m785constructorimpl(ResultKt.createFailure(cancellationExceptionY0)));
        return true;
    }

    public final void v(@NotNull Object obj) {
        kotlin.coroutines.d<T> dVar = this.f315093e;
        Object obj2 = this.f315095g;
        CoroutineContext context = dVar.getContext();
        Object objI = i1.i(context, obj2);
        d4<?> d4VarM = objI != i1.f315077a ? kotlinx.coroutines.l0.m(dVar, context, objI) : null;
        try {
            this.f315093e.resumeWith(obj);
            Unit unit = Unit.f312394a;
            kotlin.jvm.internal.h0.d(1);
            if (d4VarM == null || d4VarM.j2()) {
                i1.f(context, objI);
            }
            kotlin.jvm.internal.h0.c(1);
        } catch (Throwable th2) {
            kotlin.jvm.internal.h0.d(1);
            if (d4VarM == null || d4VarM.j2()) {
                i1.f(context, objI);
            }
            kotlin.jvm.internal.h0.c(1);
            throw th2;
        }
    }

    @Nullable
    public final Throwable y(@NotNull kotlinx.coroutines.n<?> nVar) {
        z0 z0Var;
        AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = f315091h;
        do {
            Object obj = atomicReferenceFieldUpdater.get(this);
            z0Var = n.f315101b;
            if (obj != z0Var) {
                if (obj instanceof Throwable) {
                    if (androidx.concurrent.futures.b.a(f315091h, this, obj, null)) {
                        return (Throwable) obj;
                    }
                    throw new IllegalArgumentException("Failed requirement.");
                }
                throw new IllegalStateException(("Inconsistent state " + obj).toString());
            }
        } while (!androidx.concurrent.futures.b.a(f315091h, this, z0Var, nVar));
        return null;
    }
}

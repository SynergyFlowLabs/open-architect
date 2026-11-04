package kotlinx.coroutines.flow;

import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.IndexedValue;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.ranges.IntRange;
import kotlin.sequences.Sequence;
import kotlinx.coroutines.c2;
import kotlinx.coroutines.e2;
import kotlinx.coroutines.p2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes11.dex */
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final String f314634a = "kotlinx.coroutines.flow.defaultConcurrency";

    @NotNull
    public static final kotlinx.coroutines.channels.n0<Unit> A0(@NotNull kotlinx.coroutines.s0 s0Var, long j10) {
        return t.j(s0Var, j10);
    }

    @NotNull
    public static final <T> i<T> A1(@NotNull i<? extends T> iVar, @NotNull pj.o<? super j<? super T>, ? super Throwable, ? super Long, ? super kotlin.coroutines.d<? super Boolean>, ? extends Object> oVar) {
        return y.g(iVar, oVar);
    }

    @Nullable
    public static final <T> Object B(@NotNull i<? extends T> iVar, @NotNull pj.n<? super Integer, ? super T, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> nVar, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        return n.d(iVar, nVar, dVar);
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "Flow analogue is 'flatMapConcat'", replaceWith = @kotlin.b1(expression = "flatMapConcat(mapper)", imports = {}))
    @NotNull
    public static final <T, R> i<R> B0(@NotNull i<? extends T> iVar, @NotNull Function2<? super T, ? super kotlin.coroutines.d<? super i<? extends R>>, ? extends Object> function2) {
        return d0.m(iVar, function2);
    }

    @NotNull
    public static final <T, R> i<R> B1(@NotNull i<? extends T> iVar, R r10, @kotlin.b @NotNull pj.n<? super R, ? super T, ? super kotlin.coroutines.d<? super R>, ? extends Object> nVar) {
        return g0.j(iVar, r10, nVar);
    }

    @Nullable
    public static final <T> Object C(@NotNull i<? extends T> iVar, @NotNull Function2<? super T, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        return n.f(iVar, function2, dVar);
    }

    @c2
    @NotNull
    public static final <T, R> i<R> C0(@NotNull i<? extends T> iVar, @NotNull Function2<? super T, ? super kotlin.coroutines.d<? super i<? extends R>>, ? extends Object> function2) {
        return b0.a(iVar, function2);
    }

    @NotNull
    public static final <T> i<T> C1(@NotNull i<? extends T> iVar, @NotNull pj.n<? super T, ? super T, ? super kotlin.coroutines.d<? super T>, ? extends Object> nVar) {
        return g0.k(iVar, nVar);
    }

    @Nullable
    public static final <T> Object D(@NotNull i<? extends T> iVar, @NotNull Function2<? super T, ? super kotlin.coroutines.d<? super Boolean>, ? extends Object> function2, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        return z.b(iVar, function2, dVar);
    }

    @c2
    @NotNull
    public static final <T, R> i<R> D0(@NotNull i<? extends T> iVar, @kotlin.b @NotNull Function2<? super T, ? super kotlin.coroutines.d<? super i<? extends R>>, ? extends Object> function2) {
        return b0.b(iVar, function2);
    }

    @e2
    @NotNull
    public static final <T> i<T> D1(@NotNull i<? extends T> iVar, long j10) {
        return t.k(iVar, j10);
    }

    @c2
    @NotNull
    public static final <T, R> i<R> E0(@NotNull i<? extends T> iVar, int i10, @NotNull Function2<? super T, ? super kotlin.coroutines.d<? super i<? extends R>>, ? extends Object> function2) {
        return b0.c(iVar, i10, function2);
    }

    @e2
    @NotNull
    public static final <T> i<T> E1(@NotNull i<? extends T> iVar, long j10) {
        return t.l(iVar, j10);
    }

    @NotNull
    public static final <T1, T2, T3, T4, T5, R> i<R> F(@NotNull i<? extends T1> iVar, @NotNull i<? extends T2> iVar2, @NotNull i<? extends T3> iVar3, @NotNull i<? extends T4> iVar4, @NotNull i<? extends T5> iVar5, @NotNull pj.q<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super kotlin.coroutines.d<? super R>, ? extends Object> qVar) {
        return h0.c(iVar, iVar2, iVar3, iVar4, iVar5, qVar);
    }

    @NotNull
    public static final <T, R> i<R> F1(@NotNull i<? extends T> iVar, R r10, @kotlin.b @NotNull pj.n<? super R, ? super T, ? super kotlin.coroutines.d<? super R>, ? extends Object> nVar) {
        return g0.l(iVar, r10, nVar);
    }

    @NotNull
    public static final <T1, T2, T3, T4, R> i<R> G(@NotNull i<? extends T1> iVar, @NotNull i<? extends T2> iVar2, @NotNull i<? extends T3> iVar3, @NotNull i<? extends T4> iVar4, @NotNull pj.p<? super T1, ? super T2, ? super T3, ? super T4, ? super kotlin.coroutines.d<? super R>, ? extends Object> pVar) {
        return h0.d(iVar, iVar2, iVar3, iVar4, pVar);
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "Flow analogue of 'flatten' is 'flattenConcat'", replaceWith = @kotlin.b1(expression = "flattenConcat()", imports = {}))
    @NotNull
    public static final <T> i<T> G0(@NotNull i<? extends i<? extends T>> iVar) {
        return d0.n(iVar);
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "Flow has less verbose 'scan' shortcut", replaceWith = @kotlin.b1(expression = "scan(initial, operation)", imports = {}))
    @NotNull
    public static final <T, R> i<R> G1(@NotNull i<? extends T> iVar, R r10, @kotlin.b @NotNull pj.n<? super R, ? super T, ? super kotlin.coroutines.d<? super R>, ? extends Object> nVar) {
        return d0.D(iVar, r10, nVar);
    }

    @NotNull
    public static final <T1, T2, T3, R> i<R> H(@NotNull i<? extends T1> iVar, @NotNull i<? extends T2> iVar2, @NotNull i<? extends T3> iVar3, @kotlin.b @NotNull pj.o<? super T1, ? super T2, ? super T3, ? super kotlin.coroutines.d<? super R>, ? extends Object> oVar) {
        return h0.e(iVar, iVar2, iVar3, oVar);
    }

    @c2
    @NotNull
    public static final <T> i<T> H0(@NotNull i<? extends i<? extends T>> iVar) {
        return b0.e(iVar);
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "'scanReduce' was renamed to 'runningReduce' to be consistent with Kotlin standard library", replaceWith = @kotlin.b1(expression = "runningReduce(operation)", imports = {}))
    @NotNull
    public static final <T> i<T> H1(@NotNull i<? extends T> iVar, @NotNull pj.n<? super T, ? super T, ? super kotlin.coroutines.d<? super T>, ? extends Object> nVar) {
        return d0.E(iVar, nVar);
    }

    @NotNull
    public static final <T1, T2, R> i<R> I(@NotNull i<? extends T1> iVar, @NotNull i<? extends T2> iVar2, @NotNull pj.n<? super T1, ? super T2, ? super kotlin.coroutines.d<? super R>, ? extends Object> nVar) {
        return h0.f(iVar, iVar2, nVar);
    }

    @c2
    @NotNull
    public static final <T> i<T> I0(@NotNull i<? extends i<? extends T>> iVar, int i10) {
        return b0.f(iVar, i10);
    }

    @NotNull
    public static final <T> o0<T> I1(@NotNull i<? extends T> iVar, @NotNull kotlinx.coroutines.s0 s0Var, @NotNull u0 u0Var, int i10) {
        return f0.g(iVar, s0Var, u0Var, i10);
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @kotlin.b1(expression = "combine(this, other, other2, other3, transform)", imports = {}))
    @NotNull
    public static final <T1, T2, T3, T4, T5, R> i<R> K(@NotNull i<? extends T1> iVar, @NotNull i<? extends T2> iVar2, @NotNull i<? extends T3> iVar3, @NotNull i<? extends T4> iVar4, @NotNull i<? extends T5> iVar5, @NotNull pj.q<? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super kotlin.coroutines.d<? super R>, ? extends Object> qVar) {
        return d0.c(iVar, iVar2, iVar3, iVar4, iVar5, qVar);
    }

    @NotNull
    public static final <T> i<T> K0(@kotlin.b @NotNull Function2<? super j<? super T>, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2) {
        return l.n(function2);
    }

    @Nullable
    public static final <T> Object K1(@NotNull i<? extends T> iVar, @NotNull kotlin.coroutines.d<? super T> dVar) {
        return e0.j(iVar, dVar);
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @kotlin.b1(expression = "combine(this, other, other2, other3, transform)", imports = {}))
    @NotNull
    public static final <T1, T2, T3, T4, R> i<R> L(@NotNull i<? extends T1> iVar, @NotNull i<? extends T2> iVar2, @NotNull i<? extends T3> iVar3, @NotNull i<? extends T4> iVar4, @NotNull pj.p<? super T1, ? super T2, ? super T3, ? super T4, ? super kotlin.coroutines.d<? super R>, ? extends Object> pVar) {
        return d0.d(iVar, iVar2, iVar3, iVar4, pVar);
    }

    @oj.i(name = "flowCombine")
    @NotNull
    public static final <T1, T2, R> i<R> L0(@NotNull i<? extends T1> iVar, @NotNull i<? extends T2> iVar2, @NotNull pj.n<? super T1, ? super T2, ? super kotlin.coroutines.d<? super R>, ? extends Object> nVar) {
        return h0.p(iVar, iVar2, nVar);
    }

    @Nullable
    public static final <T> Object L1(@NotNull i<? extends T> iVar, @NotNull kotlin.coroutines.d<? super T> dVar) {
        return e0.k(iVar, dVar);
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @kotlin.b1(expression = "combine(this, other, other2, transform)", imports = {}))
    @NotNull
    public static final <T1, T2, T3, R> i<R> M(@NotNull i<? extends T1> iVar, @NotNull i<? extends T2> iVar2, @NotNull i<? extends T3> iVar3, @NotNull pj.o<? super T1, ? super T2, ? super T3, ? super kotlin.coroutines.d<? super R>, ? extends Object> oVar) {
        return d0.e(iVar, iVar2, iVar3, oVar);
    }

    @oj.i(name = "flowCombineTransform")
    @NotNull
    public static final <T1, T2, R> i<R> M0(@NotNull i<? extends T1> iVar, @NotNull i<? extends T2> iVar2, @kotlin.b @NotNull pj.o<? super j<? super R>, ? super T1, ? super T2, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> oVar) {
        return h0.q(iVar, iVar2, oVar);
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "Flow analogue of 'skip' is 'drop'", replaceWith = @kotlin.b1(expression = "drop(count)", imports = {}))
    @NotNull
    public static final <T> i<T> M1(@NotNull i<? extends T> iVar, int i10) {
        return d0.F(iVar, i10);
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "Flow analogue of 'combineLatest' is 'combine'", replaceWith = @kotlin.b1(expression = "this.combine(other, transform)", imports = {}))
    @NotNull
    public static final <T1, T2, R> i<R> N(@NotNull i<? extends T1> iVar, @NotNull i<? extends T2> iVar2, @NotNull pj.n<? super T1, ? super T2, ? super kotlin.coroutines.d<? super R>, ? extends Object> nVar) {
        return d0.f(iVar, iVar2, nVar);
    }

    @NotNull
    public static final <T> i<T> N0(T t10) {
        return l.o(t10);
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "Flow analogue of 'startWith' is 'onStart'. Use 'onStart { emit(value) }'", replaceWith = @kotlin.b1(expression = "onStart { emit(value) }", imports = {}))
    @NotNull
    public static final <T> i<T> N1(@NotNull i<? extends T> iVar, T t10) {
        return d0.G(iVar, t10);
    }

    @NotNull
    public static final <T> i<T> O0(@NotNull T... tArr) {
        return l.p(tArr);
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "Flow analogue of 'startWith' is 'onStart'. Use 'onStart { emitAll(other) }'", replaceWith = @kotlin.b1(expression = "onStart { emitAll(other) }", imports = {}))
    @NotNull
    public static final <T> i<T> O1(@NotNull i<? extends T> iVar, @NotNull i<? extends T> iVar2) {
        return d0.H(iVar, iVar2);
    }

    @NotNull
    public static final <T1, T2, T3, T4, T5, R> i<R> P(@NotNull i<? extends T1> iVar, @NotNull i<? extends T2> iVar2, @NotNull i<? extends T3> iVar3, @NotNull i<? extends T4> iVar4, @NotNull i<? extends T5> iVar5, @kotlin.b @NotNull pj.r<? super j<? super R>, ? super T1, ? super T2, ? super T3, ? super T4, ? super T5, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> rVar) {
        return h0.i(iVar, iVar2, iVar3, iVar4, iVar5, rVar);
    }

    @NotNull
    public static final <T> i<T> P0(@NotNull i<? extends T> iVar, @NotNull CoroutineContext coroutineContext) {
        return p.h(iVar, coroutineContext);
    }

    @Nullable
    public static final <T> Object P1(@NotNull i<? extends T> iVar, @NotNull kotlinx.coroutines.s0 s0Var, @NotNull kotlin.coroutines.d<? super z0<? extends T>> dVar) {
        return f0.i(iVar, s0Var, dVar);
    }

    @NotNull
    public static final <T1, T2, T3, T4, R> i<R> Q(@NotNull i<? extends T1> iVar, @NotNull i<? extends T2> iVar2, @NotNull i<? extends T3> iVar3, @NotNull i<? extends T4> iVar4, @kotlin.b @NotNull pj.q<? super j<? super R>, ? super T1, ? super T2, ? super T3, ? super T4, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> qVar) {
        return h0.j(iVar, iVar2, iVar3, iVar4, qVar);
    }

    @Nullable
    public static final <T, R> Object Q0(@NotNull i<? extends T> iVar, R r10, @NotNull pj.n<? super R, ? super T, ? super kotlin.coroutines.d<? super R>, ? extends Object> nVar, @NotNull kotlin.coroutines.d<? super R> dVar) {
        return e0.e(iVar, r10, nVar, dVar);
    }

    @NotNull
    public static final <T> z0<T> Q1(@NotNull i<? extends T> iVar, @NotNull kotlinx.coroutines.s0 s0Var, @NotNull u0 u0Var, T t10) {
        return f0.j(iVar, s0Var, u0Var, t10);
    }

    @NotNull
    public static final <T1, T2, T3, R> i<R> R(@NotNull i<? extends T1> iVar, @NotNull i<? extends T2> iVar2, @NotNull i<? extends T3> iVar3, @kotlin.b @NotNull pj.p<? super j<? super R>, ? super T1, ? super T2, ? super T3, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> pVar) {
        return h0.k(iVar, iVar2, iVar3, pVar);
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "Flow analogue of 'forEach' is 'collect'", replaceWith = @kotlin.b1(expression = "collect(action)", imports = {}))
    public static final <T> void R0(@NotNull i<? extends T> iVar, @NotNull Function2<? super T, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2) {
        d0.o(iVar, function2);
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "Use 'launchIn' with 'onEach', 'onCompletion' and 'catch' instead")
    public static final <T> void R1(@NotNull i<? extends T> iVar) {
        d0.I(iVar);
    }

    @NotNull
    public static final <T1, T2, R> i<R> S(@NotNull i<? extends T1> iVar, @NotNull i<? extends T2> iVar2, @kotlin.b @NotNull pj.o<? super j<? super R>, ? super T1, ? super T2, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> oVar) {
        return h0.l(iVar, iVar2, oVar);
    }

    public static final int S0() {
        return b0.h();
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "Use 'launchIn' with 'onEach', 'onCompletion' and 'catch' instead")
    public static final <T> void S1(@NotNull i<? extends T> iVar, @NotNull Function2<? super T, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2) {
        d0.J(iVar, function2);
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "Use 'launchIn' with 'onEach', 'onCompletion' and 'catch' instead")
    public static final <T> void T1(@NotNull i<? extends T> iVar, @NotNull Function2<? super T, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, @NotNull Function2<? super Throwable, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function3) {
        d0.K(iVar, function2, function3);
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "Flow analogue of 'compose' is 'let'", replaceWith = @kotlin.b1(expression = "let(transformer)", imports = {}))
    @NotNull
    public static final <T, R> i<R> U(@NotNull i<? extends T> iVar, @NotNull Function1<? super i<? extends T>, ? extends i<? extends R>> function1) {
        return d0.g(iVar, function1);
    }

    @Nullable
    public static final <T> Object U0(@NotNull i<? extends T> iVar, @NotNull kotlin.coroutines.d<? super T> dVar) {
        return e0.g(iVar, dVar);
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "Use 'flowOn' instead")
    @NotNull
    public static final <T> i<T> U1(@NotNull i<? extends T> iVar, @NotNull CoroutineContext coroutineContext) {
        return d0.L(iVar, coroutineContext);
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "Flow analogue of 'concatMap' is 'flatMapConcat'", replaceWith = @kotlin.b1(expression = "flatMapConcat(mapper)", imports = {}))
    @NotNull
    public static final <T, R> i<R> V(@NotNull i<? extends T> iVar, @NotNull Function1<? super T, ? extends i<? extends R>> function1) {
        return d0.h(iVar, function1);
    }

    @Nullable
    public static final <T> Object V0(@NotNull i<? extends T> iVar, @NotNull kotlin.coroutines.d<? super T> dVar) {
        return e0.h(iVar, dVar);
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "Flow analogues of 'switchMap' are 'transformLatest', 'flatMapLatest' and 'mapLatest'", replaceWith = @kotlin.b1(expression = "this.flatMapLatest(transform)", imports = {}))
    @NotNull
    public static final <T, R> i<R> V1(@NotNull i<? extends T> iVar, @NotNull Function2<? super T, ? super kotlin.coroutines.d<? super i<? extends R>>, ? extends Object> function2) {
        return d0.M(iVar, function2);
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "Flow analogue of 'concatWith' is 'onCompletion'. Use 'onCompletion { emit(value) }'", replaceWith = @kotlin.b1(expression = "onCompletion { emit(value) }", imports = {}))
    @NotNull
    public static final <T> i<T> W(@NotNull i<? extends T> iVar, T t10) {
        return d0.i(iVar, t10);
    }

    @NotNull
    public static final <T> p2 W0(@NotNull i<? extends T> iVar, @NotNull kotlinx.coroutines.s0 s0Var) {
        return n.h(iVar, s0Var);
    }

    @NotNull
    public static final <T> i<T> W1(@NotNull i<? extends T> iVar, int i10) {
        return z.g(iVar, i10);
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "Flow analogue of 'concatWith' is 'onCompletion'. Use 'onCompletion { if (it == null) emitAll(other) }'", replaceWith = @kotlin.b1(expression = "onCompletion { if (it == null) emitAll(other) }", imports = {}))
    @NotNull
    public static final <T> i<T> X(@NotNull i<? extends T> iVar, @NotNull i<? extends T> iVar2) {
        return d0.j(iVar, iVar2);
    }

    @NotNull
    public static final <T, R> i<R> X0(@NotNull i<? extends T> iVar, @NotNull Function2<? super T, ? super kotlin.coroutines.d<? super R>, ? extends Object> function2) {
        return g0.g(iVar, function2);
    }

    @NotNull
    public static final <T> i<T> X1(@NotNull i<? extends T> iVar, @NotNull Function2<? super T, ? super kotlin.coroutines.d<? super Boolean>, ? extends Object> function2) {
        return z.h(iVar, function2);
    }

    @NotNull
    public static final <T> i<T> Y(@NotNull i<? extends T> iVar) {
        return p.g(iVar);
    }

    @c2
    @NotNull
    public static final <T, R> i<R> Y0(@NotNull i<? extends T> iVar, @kotlin.b @NotNull Function2<? super T, ? super kotlin.coroutines.d<? super R>, ? extends Object> function2) {
        return b0.k(iVar, function2);
    }

    @e2
    @NotNull
    public static final <T> i<T> Y1(@NotNull i<? extends T> iVar, long j10) {
        return t.m(iVar, j10);
    }

    @NotNull
    public static final <T> i<T> Z(@NotNull kotlinx.coroutines.channels.n0<? extends T> n0Var) {
        return m.b(n0Var);
    }

    @NotNull
    public static final <T, R> i<R> Z0(@NotNull i<? extends T> iVar, @NotNull Function2<? super T, ? super kotlin.coroutines.d<? super R>, ? extends Object> function2) {
        return g0.h(iVar, function2);
    }

    @Nullable
    public static final <T, C extends Collection<? super T>> Object Z1(@NotNull i<? extends T> iVar, @NotNull C c10, @NotNull kotlin.coroutines.d<? super C> dVar) {
        return o.a(iVar, c10, dVar);
    }

    @Nullable
    public static final <T> Object a(@NotNull i<? extends T> iVar, @NotNull Function2<? super T, ? super kotlin.coroutines.d<? super Boolean>, ? extends Object> function2, @NotNull kotlin.coroutines.d<? super Boolean> dVar) {
        return a0.a(iVar, function2, dVar);
    }

    @Nullable
    public static final <T> Object a0(@NotNull i<? extends T> iVar, @NotNull kotlin.coroutines.d<? super Integer> dVar) {
        return q.a(iVar, dVar);
    }

    @NotNull
    public static final <T> i<T> a1(@NotNull Iterable<? extends i<? extends T>> iterable) {
        return b0.l(iterable);
    }

    @Nullable
    public static final <T> Object a2(@NotNull i<? extends T> iVar, @NotNull List<T> list, @NotNull kotlin.coroutines.d<? super List<? extends T>> dVar) {
        return o.b(iVar, list, dVar);
    }

    @Nullable
    public static final <T> Object b(@NotNull i<? extends T> iVar, @NotNull Function2<? super T, ? super kotlin.coroutines.d<? super Boolean>, ? extends Object> function2, @NotNull kotlin.coroutines.d<? super Boolean> dVar) {
        return a0.b(iVar, function2, dVar);
    }

    @Nullable
    public static final <T> Object b0(@NotNull i<? extends T> iVar, @NotNull Function2<? super T, ? super kotlin.coroutines.d<? super Boolean>, ? extends Object> function2, @NotNull kotlin.coroutines.d<? super Integer> dVar) {
        return q.b(iVar, function2, dVar);
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "Flow analogue of 'merge' is 'flattenConcat'", replaceWith = @kotlin.b1(expression = "flattenConcat()", imports = {}))
    @NotNull
    public static final <T> i<T> b1(@NotNull i<? extends i<? extends T>> iVar) {
        return d0.p(iVar);
    }

    @NotNull
    public static final <T> i<T> c(@NotNull Iterable<? extends T> iterable) {
        return l.a(iterable);
    }

    @e2
    @NotNull
    public static final <T> i<T> c0(@NotNull i<? extends T> iVar, long j10) {
        return t.c(iVar, j10);
    }

    @NotNull
    public static final <T> i<T> c1(@NotNull i<? extends T>... iVarArr) {
        return b0.m(iVarArr);
    }

    @Nullable
    public static final <T> Object c2(@NotNull i<? extends T> iVar, @NotNull Set<T> set, @NotNull kotlin.coroutines.d<? super Set<? extends T>> dVar) {
        return o.d(iVar, set, dVar);
    }

    @NotNull
    public static final <T> i<T> d(@NotNull Iterator<? extends T> it) {
        return l.b(it);
    }

    @kotlin.u0
    @e2
    @NotNull
    public static final <T> i<T> d0(@NotNull i<? extends T> iVar, @NotNull Function1<? super T, Long> function1) {
        return t.d(iVar, function1);
    }

    @NotNull
    public static final Void d1() {
        return d0.q();
    }

    @NotNull
    public static final <T> i<T> e(@NotNull Function0<? extends T> function0) {
        return l.c(function0);
    }

    @e2
    @NotNull
    public static final <T> i<T> e0(@NotNull i<? extends T> iVar, long j10) {
        return t.g(iVar, j10);
    }

    @Nullable
    public static final <T> Object e1(@NotNull i<? extends T> iVar, @NotNull Function2<? super T, ? super kotlin.coroutines.d<? super Boolean>, ? extends Object> function2, @NotNull kotlin.coroutines.d<? super Boolean> dVar) {
        return a0.c(iVar, function2, dVar);
    }

    @NotNull
    public static final <T, R> i<R> e2(@NotNull i<? extends T> iVar, @kotlin.b @NotNull pj.n<? super j<? super R>, ? super T, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> nVar) {
        return x.g(iVar, nVar);
    }

    @NotNull
    public static final <T> i<T> f(@NotNull Function1<? super kotlin.coroutines.d<? super T>, ? extends Object> function1) {
        return l.d(function1);
    }

    @kotlin.u0
    @e2
    @NotNull
    @oj.i(name = "debounceDuration")
    public static final <T> i<T> f0(@NotNull i<? extends T> iVar, @NotNull Function1<? super T, kotlin.time.c> function1) {
        return t.h(iVar, function1);
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "Collect flow in the desired context instead")
    @NotNull
    public static final <T> i<T> f1(@NotNull i<? extends T> iVar, @NotNull CoroutineContext coroutineContext) {
        return d0.r(iVar, coroutineContext);
    }

    @c2
    @NotNull
    public static final <T, R> i<R> f2(@NotNull i<? extends T> iVar, @kotlin.b @NotNull pj.n<? super j<? super R>, ? super T, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> nVar) {
        return b0.n(iVar, nVar);
    }

    @NotNull
    public static final i<Integer> g(@NotNull IntRange intRange) {
        return l.e(intRange);
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "Use 'onEach { delay(timeMillis) }'", replaceWith = @kotlin.b1(expression = "onEach { delay(timeMillis) }", imports = {}))
    @NotNull
    public static final <T> i<T> g0(@NotNull i<? extends T> iVar, long j10) {
        return d0.k(iVar, j10);
    }

    @NotNull
    public static final <T> i<T> g1(@NotNull i<? extends T> iVar, @NotNull pj.n<? super j<? super T>, ? super Throwable, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> nVar) {
        return x.d(iVar, nVar);
    }

    @NotNull
    public static final <T, R> i<R> g2(@NotNull i<? extends T> iVar, @kotlin.b @NotNull pj.n<? super j<? super R>, ? super T, ? super kotlin.coroutines.d<? super Boolean>, ? extends Object> nVar) {
        return z.i(iVar, nVar);
    }

    @NotNull
    public static final i<Long> h(@NotNull kotlin.ranges.n nVar) {
        return l.f(nVar);
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "Use 'onStart { delay(timeMillis) }'", replaceWith = @kotlin.b1(expression = "onStart { delay(timeMillis) }", imports = {}))
    @NotNull
    public static final <T> i<T> h0(@NotNull i<? extends T> iVar, long j10) {
        return d0.l(iVar, j10);
    }

    @NotNull
    public static final <T> i<T> h1(@NotNull i<? extends T> iVar, @NotNull Function2<? super T, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2) {
        return g0.i(iVar, function2);
    }

    @kotlin.a1
    @NotNull
    public static final <T, R> i<R> h2(@NotNull i<? extends T> iVar, @kotlin.b @NotNull pj.n<? super j<? super R>, ? super T, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> nVar) {
        return x.h(iVar, nVar);
    }

    @NotNull
    public static final <T> i<T> i(@NotNull Sequence<? extends T> sequence) {
        return l.g(sequence);
    }

    @NotNull
    public static final <T> i<T> i0(@NotNull i<? extends T> iVar) {
        return w.e(iVar);
    }

    @NotNull
    public static final <T> i<T> i1(@NotNull i<? extends T> iVar, @NotNull Function2<? super j<? super T>, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2) {
        return x.e(iVar, function2);
    }

    @NotNull
    public static final <T> i<IndexedValue<T>> i2(@NotNull i<? extends T> iVar) {
        return g0.m(iVar);
    }

    @NotNull
    public static final i<Integer> j(@NotNull int[] iArr) {
        return l.h(iArr);
    }

    @NotNull
    public static final <T> i<T> j0(@NotNull i<? extends T> iVar, @NotNull Function2<? super T, ? super T, Boolean> function2) {
        return w.f(iVar, function2);
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { emitAll(fallback) }'", replaceWith = @kotlin.b1(expression = "catch { emitAll(fallback) }", imports = {}))
    @NotNull
    public static final <T> i<T> j1(@NotNull i<? extends T> iVar, @NotNull i<? extends T> iVar2) {
        return d0.s(iVar, iVar2);
    }

    @NotNull
    public static final <T1, T2, R> i<R> j2(@NotNull i<? extends T1> iVar, @NotNull i<? extends T2> iVar2, @NotNull pj.n<? super T1, ? super T2, ? super kotlin.coroutines.d<? super R>, ? extends Object> nVar) {
        return h0.s(iVar, iVar2, nVar);
    }

    @NotNull
    public static final i<Long> k(@NotNull long[] jArr) {
        return l.i(jArr);
    }

    @NotNull
    public static final <T, K> i<T> k0(@NotNull i<? extends T> iVar, @NotNull Function1<? super T, ? extends K> function1) {
        return w.g(iVar, function1);
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { emitAll(fallback) }'", replaceWith = @kotlin.b1(expression = "catch { emitAll(fallback) }", imports = {}))
    @NotNull
    public static final <T> i<T> k1(@NotNull i<? extends T> iVar, @NotNull i<? extends T> iVar2) {
        return d0.t(iVar, iVar2);
    }

    @NotNull
    public static final <T> i<T> l(@NotNull T[] tArr) {
        return l.j(tArr);
    }

    @NotNull
    public static final <T> i<T> l0(@NotNull i<? extends T> iVar, int i10) {
        return z.d(iVar, i10);
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { emit(fallback) }'", replaceWith = @kotlin.b1(expression = "catch { emit(fallback) }", imports = {}))
    @NotNull
    public static final <T> i<T> l1(@NotNull i<? extends T> iVar, T t10) {
        return d0.u(iVar, t10);
    }

    @NotNull
    public static final <T> o0<T> m(@NotNull j0<T> j0Var) {
        return f0.a(j0Var);
    }

    @NotNull
    public static final <T> i<T> m0(@NotNull i<? extends T> iVar, @NotNull Function2<? super T, ? super kotlin.coroutines.d<? super Boolean>, ? extends Object> function2) {
        return z.e(iVar, function2);
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "Flow analogue of 'onErrorXxx' is 'catch'. Use 'catch { e -> if (predicate(e)) emit(fallback) else throw e }'", replaceWith = @kotlin.b1(expression = "catch { e -> if (predicate(e)) emit(fallback) else throw e }", imports = {}))
    @NotNull
    public static final <T> i<T> m1(@NotNull i<? extends T> iVar, T t10, @NotNull Function1<? super Throwable, Boolean> function1) {
        return d0.v(iVar, t10, function1);
    }

    @NotNull
    public static final <T> z0<T> n(@NotNull k0<T> k0Var) {
        return f0.b(k0Var);
    }

    @Nullable
    public static final <T> Object n0(@NotNull j<? super T> jVar, @NotNull kotlinx.coroutines.channels.n0<? extends T> n0Var, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        return m.c(jVar, n0Var, dVar);
    }

    @Nullable
    public static final <T> Object o0(@NotNull j<? super T> jVar, @NotNull i<? extends T> iVar, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        return n.g(jVar, iVar, dVar);
    }

    @NotNull
    public static final <T> i<T> o1(@NotNull i<? extends T> iVar, @NotNull Function2<? super j<? super T>, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2) {
        return x.f(iVar, function2);
    }

    @NotNull
    public static final <T> i<T> p(@NotNull i<? extends T> iVar, int i10, @NotNull kotlinx.coroutines.channels.j jVar) {
        return p.b(iVar, i10, jVar);
    }

    @NotNull
    public static final <T> i<T> p0() {
        return l.m();
    }

    @NotNull
    public static final <T> o0<T> p1(@NotNull o0<? extends T> o0Var, @NotNull Function2<? super j<? super T>, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2) {
        return f0.f(o0Var, function2);
    }

    public static final void q0(@NotNull j<?> jVar) {
        x.b(jVar);
    }

    @NotNull
    public static final <T> kotlinx.coroutines.channels.n0<T> q1(@NotNull i<? extends T> iVar, @NotNull kotlinx.coroutines.s0 s0Var) {
        return m.e(iVar, s0Var);
    }

    @NotNull
    public static final <T> i<T> r0(@NotNull i<? extends T> iVar, @NotNull Function2<? super T, ? super kotlin.coroutines.d<? super Boolean>, ? extends Object> function2) {
        return g0.b(iVar, function2);
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "Flow analogue of 'publish()' is 'shareIn'. \npublish().connect() is the default strategy (no extra call is needed), \npublish().autoConnect() translates to 'started = SharingStarted.Lazily' argument, \npublish().refCount() translates to 'started = SharingStarted.WhileSubscribed()' argument.", replaceWith = @kotlin.b1(expression = "this.shareIn(scope, 0)", imports = {}))
    @NotNull
    public static final <T> i<T> r1(@NotNull i<? extends T> iVar) {
        return d0.y(iVar);
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "Flow analogue of 'cache()' is 'shareIn' with unlimited replay and 'started = SharingStarted.Lazily' argument'", replaceWith = @kotlin.b1(expression = "this.shareIn(scope, started = SharingStarted.Lazily, replay = Int.MAX_VALUE)", imports = {}))
    @NotNull
    public static final <T> i<T> s(@NotNull i<? extends T> iVar) {
        return d0.b(iVar);
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "Flow analogue of 'publish(bufferSize)' is 'buffer' followed by 'shareIn'. \npublish().connect() is the default strategy (no extra call is needed), \npublish().autoConnect() translates to 'started = SharingStarted.Lazily' argument, \npublish().refCount() translates to 'started = SharingStarted.WhileSubscribed()' argument.", replaceWith = @kotlin.b1(expression = "this.buffer(bufferSize).shareIn(scope, 0)", imports = {}))
    @NotNull
    public static final <T> i<T> s1(@NotNull i<? extends T> iVar, int i10) {
        return d0.z(iVar, i10);
    }

    @NotNull
    public static final <T> i<T> t(@kotlin.b @NotNull Function2<? super kotlinx.coroutines.channels.l0<? super T>, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2) {
        return l.k(function2);
    }

    @NotNull
    public static final <R> i<R> t0(@NotNull i<?> iVar, @NotNull kotlin.reflect.d<R> dVar) {
        return g0.d(iVar, dVar);
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "Collect flow in the desired context instead")
    @NotNull
    public static final <T> i<T> t1(@NotNull i<? extends T> iVar, @NotNull CoroutineContext coroutineContext) {
        return d0.A(iVar, coroutineContext);
    }

    @NotNull
    public static final <T> i<T> u(@NotNull i<? extends T> iVar) {
        return p.e(iVar);
    }

    @NotNull
    public static final <T> i<T> u0(@NotNull i<? extends T> iVar, @NotNull Function2<? super T, ? super kotlin.coroutines.d<? super Boolean>, ? extends Object> function2) {
        return g0.e(iVar, function2);
    }

    @NotNull
    public static final <T> i<T> u1(@NotNull kotlinx.coroutines.channels.n0<? extends T> n0Var) {
        return m.f(n0Var);
    }

    @NotNull
    public static final <T> i<T> v(@NotNull i<? extends T> iVar, @NotNull pj.n<? super j<? super T>, ? super Throwable, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> nVar) {
        return y.a(iVar, nVar);
    }

    @NotNull
    public static final <T> i<T> v0(@NotNull i<? extends T> iVar) {
        return g0.f(iVar);
    }

    @Nullable
    public static final <S, T extends S> Object v1(@NotNull i<? extends T> iVar, @NotNull pj.n<? super S, ? super T, ? super kotlin.coroutines.d<? super S>, ? extends Object> nVar, @NotNull kotlin.coroutines.d<? super S> dVar) {
        return e0.i(iVar, nVar, dVar);
    }

    @Nullable
    public static final <T> Object w(@NotNull i<? extends T> iVar, @NotNull j<? super T> jVar, @NotNull kotlin.coroutines.d<? super Throwable> dVar) throws Throwable {
        return y.b(iVar, jVar, dVar);
    }

    @Nullable
    public static final <T> Object w0(@NotNull i<? extends T> iVar, @NotNull kotlin.coroutines.d<? super T> dVar) {
        return e0.a(iVar, dVar);
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "Flow analogue of 'replay()' is 'shareIn' with unlimited replay. \nreplay().connect() is the default strategy (no extra call is needed), \nreplay().autoConnect() translates to 'started = SharingStarted.Lazily' argument, \nreplay().refCount() translates to 'started = SharingStarted.WhileSubscribed()' argument.", replaceWith = @kotlin.b1(expression = "this.shareIn(scope, Int.MAX_VALUE)", imports = {}))
    @NotNull
    public static final <T> i<T> w1(@NotNull i<? extends T> iVar) {
        return d0.B(iVar);
    }

    @NotNull
    public static final <T> i<T> x(@kotlin.b @NotNull Function2<? super kotlinx.coroutines.channels.l0<? super T>, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2) {
        return l.l(function2);
    }

    @Nullable
    public static final <T> Object x0(@NotNull i<? extends T> iVar, @NotNull Function2<? super T, ? super kotlin.coroutines.d<? super Boolean>, ? extends Object> function2, @NotNull kotlin.coroutines.d<? super T> dVar) {
        return e0.b(iVar, function2, dVar);
    }

    @kotlin.l(level = kotlin.n.ERROR, message = "Flow analogue of 'replay(bufferSize)' is 'shareIn' with the specified replay parameter. \nreplay().connect() is the default strategy (no extra call is needed), \nreplay().autoConnect() translates to 'started = SharingStarted.Lazily' argument, \nreplay().refCount() translates to 'started = SharingStarted.WhileSubscribed()' argument.", replaceWith = @kotlin.b1(expression = "this.shareIn(scope, bufferSize)", imports = {}))
    @NotNull
    public static final <T> i<T> x1(@NotNull i<? extends T> iVar, int i10) {
        return d0.C(iVar, i10);
    }

    @c2
    @NotNull
    public static final <T> i<List<T>> y(@NotNull i<? extends T> iVar, int i10) {
        return g0.a(iVar, i10);
    }

    @Nullable
    public static final <T> Object y0(@NotNull i<? extends T> iVar, @NotNull kotlin.coroutines.d<? super T> dVar) {
        return e0.c(iVar, dVar);
    }

    @NotNull
    public static final <T> i<T> y1(@NotNull i<? extends T> iVar, long j10, @NotNull Function2<? super Throwable, ? super kotlin.coroutines.d<? super Boolean>, ? extends Object> function2) {
        return y.e(iVar, j10, function2);
    }

    @Nullable
    public static final Object z(@NotNull i<?> iVar, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        return n.a(iVar, dVar);
    }

    @Nullable
    public static final <T> Object z0(@NotNull i<? extends T> iVar, @NotNull Function2<? super T, ? super kotlin.coroutines.d<? super Boolean>, ? extends Object> function2, @NotNull kotlin.coroutines.d<? super T> dVar) {
        return e0.d(iVar, function2, dVar);
    }
}

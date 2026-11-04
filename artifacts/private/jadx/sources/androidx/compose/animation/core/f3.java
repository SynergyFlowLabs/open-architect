package androidx.compose.animation.core;

import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.CoroutineContext;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nSuspendAnimation.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SuspendAnimation.kt\nandroidx/compose/animation/core/SuspendAnimationKt\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 3 Preconditions.kt\nandroidx/compose/animation/core/PreconditionsKt\n*L\n1#1,363:1\n1#2:364\n53#3,4:365\n*S KotlinDebug\n*F\n+ 1 SuspendAnimation.kt\nandroidx/compose/animation/core/SuspendAnimationKt\n*L\n312#1:365,4\n*E\n"})
public final class f3 {

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.animation.core.SuspendAnimationKt", f = "SuspendAnimation.kt", i = {0, 0, 0, 0, 1, 1, 1, 1}, l = {231, 280}, m = "animate", n = {"$this$animate", "animation", "block", "lateInitScope", "$this$animate", "animation", "block", "lateInitScope"}, s = {"L$0", "L$1", "L$2", "L$3", "L$0", "L$1", "L$2", "L$3"})
    static final class a<T, V extends w> extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f12955a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f12956b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Object f12957c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Object f12958d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        /* synthetic */ Object f12959e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f12960f;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f12959e = obj;
            this.f12960f |= Integer.MIN_VALUE;
            return f3.m(null, null, 0L, null, this);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit A(Function2 function2, n nVar) {
        function2.invoke(nVar.g(), Float.valueOf(((s) nVar.i()).f()));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit B(n nVar) {
        return Unit.f312394a;
    }

    @Nullable
    public static final <T, V extends w> Object C(@NotNull q<T, V> qVar, T t10, @NotNull o<T> oVar, boolean z10, @NotNull Function1<? super n<T, V>, Unit> function1, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objM = m(qVar, new g3(oVar, qVar.d(), qVar.getValue(), t10, qVar.h()), z10 ? qVar.b() : Long.MIN_VALUE, function1, dVar);
        return objM == kotlin.coroutines.intrinsics.b.l() ? objM : Unit.f312394a;
    }

    public static /* synthetic */ Object D(q qVar, Object obj, o oVar, boolean z10, Function1 function1, kotlin.coroutines.d dVar, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            oVar = p.r(0.0f, 0.0f, null, 7, null);
        }
        o oVar2 = oVar;
        if ((i10 & 4) != 0) {
            z10 = false;
        }
        boolean z11 = z10;
        if ((i10 & 8) != 0) {
            function1 = new Function1() { // from class: androidx.compose.animation.core.e3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj3) {
                    return f3.E((n) obj3);
                }
            };
        }
        return C(qVar, obj, oVar2, z11, function1, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit E(n nVar) {
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <R, T, V extends w> Object F(g<T, V> gVar, final Function1<? super Long, ? extends R> function1, kotlin.coroutines.d<? super R> dVar) {
        return gVar.b() ? f1.c(function1, dVar) : androidx.compose.runtime.d3.f(new Function1() { // from class: androidx.compose.animation.core.b3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return f3.G(function1, ((Long) obj).longValue());
            }
        }, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object G(Function1 function1, long j10) {
        return function1.invoke(Long.valueOf(j10));
    }

    private static final <T, V extends w> void H(n<T, V> nVar, long j10, long j11, g<T, V> gVar, q<T, V> qVar, Function1<? super n<T, V>, Unit> function1) {
        nVar.l(j10);
        nVar.n(gVar.g(j11));
        nVar.o(gVar.i(j11));
        if (gVar.d(j11)) {
            nVar.k(nVar.c());
            nVar.m(false);
        }
        K(nVar, qVar);
        function1.invoke(nVar);
    }

    private static final <T, V extends w> void I(n<T, V> nVar, long j10, float f10, g<T, V> gVar, q<T, V> qVar, Function1<? super n<T, V>, Unit> function1) {
        H(nVar, j10, f10 == 0.0f ? gVar.e() : (long) ((j10 - nVar.d()) / f10), gVar, qVar, function1);
    }

    public static final float J(@NotNull CoroutineContext coroutineContext) {
        androidx.compose.ui.c0 c0Var = (androidx.compose.ui.c0) coroutineContext.get(androidx.compose.ui.c0.F);
        float fB0 = c0Var != null ? c0Var.B0() : 1.0f;
        if (!(fB0 >= 0.0f)) {
            c2.e("negative scale factor");
        }
        return fB0;
    }

    public static final <T, V extends w> void K(@NotNull n<T, V> nVar, @NotNull q<T, V> qVar) {
        qVar.E(nVar.g());
        x.f(qVar.h(), nVar.i());
        qVar.s(nVar.b());
        qVar.t(nVar.c());
        qVar.A(nVar.j());
    }

    @Nullable
    public static final Object l(float f10, float f11, float f12, @NotNull o<Float> oVar, @NotNull Function2<? super Float, ? super Float, Unit> function2, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objN = n(t4.P(kotlin.jvm.internal.z.f312833a), kotlin.coroutines.jvm.internal.b.e(f10), kotlin.coroutines.jvm.internal.b.e(f11), kotlin.coroutines.jvm.internal.b.e(f12), oVar, function2, dVar);
        return objN == kotlin.coroutines.intrinsics.b.l() ? objN : Unit.f312394a;
    }

    /* JADX WARN: Code duplicated, block: B:59:0x0156  */
    /* JADX WARN: Code duplicated, block: B:62:0x015f  */
    /* JADX WARN: Code duplicated, block: B:8:0x001a  */
    /* JADX WARN: Type inference failed for: r12v0, types: [T, androidx.compose.animation.core.n] */
    @Nullable
    public static final <T, V extends w> Object m(@NotNull final q<T, V> qVar, @NotNull g<T, V> gVar, long j10, @NotNull final Function1<? super n<T, V>, Unit> function1, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        a aVar;
        final kotlin.jvm.internal.i1.h hVar;
        final q<T, V> qVar2;
        q<T, V> qVar3;
        kotlin.jvm.internal.i1.h hVar2;
        Function1<? super n<T, V>, Unit> function2;
        n nVar;
        n nVar2;
        Function1 function3;
        final g<T, V> gVar2 = gVar;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i10 = aVar.f12960f;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f12960f = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        a aVar2 = aVar;
        Object obj = aVar2.f12959e;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = aVar2.f12960f;
        if (i11 == 0) {
            ResultKt.m(obj);
            final T tG = gVar2.g(0L);
            final w wVarI = gVar2.i(0L);
            hVar = new kotlin.jvm.internal.i1.h();
            if (j10 == Long.MIN_VALUE) {
                try {
                    final float fJ = J(aVar2.getContext());
                    qVar2 = qVar;
                    try {
                        Function1 function4 = new Function1() { // from class: androidx.compose.animation.core.v2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj2) {
                                return f3.u(hVar, tG, gVar2, wVarI, qVar2, fJ, function1, ((Long) obj2).longValue());
                            }
                        };
                        hVar2 = hVar;
                        try {
                            aVar2.f12955a = qVar2;
                            aVar2.f12956b = gVar2;
                            aVar2.f12957c = function1;
                            aVar2.f12958d = hVar2;
                            aVar2.f12960f = 1;
                            if (F(gVar2, function4, aVar2) != objL) {
                                qVar3 = qVar2;
                                function2 = function1;
                                hVar = hVar2;
                            }
                            return objL;
                        } catch (CancellationException e10) {
                            e = e10;
                            qVar3 = qVar2;
                            hVar = hVar2;
                            nVar = (n) hVar.f312751a;
                            if (nVar != null) {
                                nVar.m(false);
                            }
                            nVar2 = (n) hVar.f312751a;
                            if (nVar2 != null) {
                                qVar3.A(false);
                            }
                            throw e;
                        }
                    } catch (CancellationException e11) {
                        e = e11;
                        qVar3 = qVar2;
                        nVar = (n) hVar.f312751a;
                        if (nVar != null) {
                            nVar.m(false);
                        }
                        nVar2 = (n) hVar.f312751a;
                        if (nVar2 != null && nVar2.c() == qVar3.b()) {
                            qVar3.A(false);
                        }
                        throw e;
                    }
                } catch (CancellationException e12) {
                    e = e12;
                    qVar2 = qVar;
                }
            } else {
                hVar2 = hVar;
                try {
                    ?? r12 = (T) new n(tG, gVar2.f(), wVarI, j10, gVar2.c(), j10, true, new Function0() { // from class: androidx.compose.animation.core.w2
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return f3.w(qVar);
                        }
                    });
                    I(r12, j10, J(aVar2.getContext()), gVar2, qVar, function1);
                    hVar2.f312751a = r12;
                    qVar3 = qVar;
                    gVar2 = gVar;
                    function2 = function1;
                    hVar = hVar2;
                } catch (CancellationException e13) {
                    e = e13;
                    qVar3 = qVar;
                    hVar = hVar2;
                    nVar = (n) hVar.f312751a;
                    if (nVar != null) {
                        nVar.m(false);
                    }
                    nVar2 = (n) hVar.f312751a;
                    if (nVar2 != null) {
                        qVar3.A(false);
                    }
                    throw e;
                }
            }
        } else {
            if (i11 != 1 && i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            hVar = (kotlin.jvm.internal.i1.h) aVar2.f12958d;
            function2 = (Function1) aVar2.f12957c;
            gVar2 = (g) aVar2.f12956b;
            qVar3 = (q) aVar2.f12955a;
            try {
                ResultKt.m(obj);
            } catch (CancellationException e14) {
                e = e14;
                nVar = (n) hVar.f312751a;
                if (nVar != null) {
                    nVar.m(false);
                }
                nVar2 = (n) hVar.f312751a;
                if (nVar2 != null) {
                    qVar3.A(false);
                }
                throw e;
            }
        }
        do {
            T t10 = hVar.f312751a;
            Intrinsics.checkNotNull(t10);
            if (!((n) t10).j()) {
                return Unit.f312394a;
            }
            final float fJ2 = J(aVar2.getContext());
            final kotlin.jvm.internal.i1.h hVar3 = hVar;
            final Function1<? super n<T, V>, Unit> function5 = function2;
            final g<T, V> gVar3 = gVar2;
            final q<T, V> qVar4 = qVar3;
            try {
                function3 = new Function1() { // from class: androidx.compose.animation.core.x2
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return f3.r(hVar3, fJ2, gVar3, qVar4, function5, ((Long) obj2).longValue());
                    }
                };
                hVar = hVar3;
                gVar2 = gVar3;
                qVar3 = qVar4;
                function2 = function5;
                aVar2.f12955a = qVar3;
                aVar2.f12956b = gVar2;
                aVar2.f12957c = function2;
                aVar2.f12958d = hVar;
                aVar2.f12960f = 2;
            } catch (CancellationException e15) {
                e = e15;
                hVar = hVar3;
                qVar3 = qVar4;
                nVar = (n) hVar.f312751a;
                if (nVar != null) {
                    nVar.m(false);
                }
                nVar2 = (n) hVar.f312751a;
                if (nVar2 != null) {
                    qVar3.A(false);
                }
                throw e;
            }
        } while (F(gVar2, function3, aVar2) != objL);
        return objL;
    }

    @Nullable
    public static final <T, V extends w> Object n(@NotNull final z3<T, V> z3Var, T t10, T t11, @Nullable T t12, @NotNull o<T> oVar, @NotNull final Function2<? super T, ? super T, Unit> function2, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        V vG;
        if (t12 == null || (vG = z3Var.a().invoke(t12)) == null) {
            vG = x.g(z3Var.a().invoke(t10));
        }
        w wVar = vG;
        Object objP = p(new q(z3Var, t10, wVar, 0L, 0L, false, 56, null), new g3(oVar, z3Var, t10, t11, wVar), 0L, new Function1() { // from class: androidx.compose.animation.core.z2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return f3.s(function2, z3Var, (n) obj);
            }
        }, dVar, 2, null);
        return objP == kotlin.coroutines.intrinsics.b.l() ? objP : Unit.f312394a;
    }

    public static /* synthetic */ Object o(float f10, float f11, float f12, o oVar, Function2 function2, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 4) != 0) {
            f12 = 0.0f;
        }
        if ((i10 & 8) != 0) {
            oVar = p.r(0.0f, 0.0f, null, 7, null);
        }
        return l(f10, f11, f12, oVar, function2, dVar);
    }

    public static /* synthetic */ Object p(q qVar, g gVar, long j10, Function1 function1, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            j10 = Long.MIN_VALUE;
        }
        long j11 = j10;
        if ((i10 & 4) != 0) {
            function1 = new Function1() { // from class: androidx.compose.animation.core.d3
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return f3.t((n) obj2);
                }
            };
        }
        return m(qVar, gVar, j11, function1, dVar);
    }

    public static /* synthetic */ Object q(z3 z3Var, Object obj, Object obj2, Object obj3, o oVar, Function2 function2, kotlin.coroutines.d dVar, int i10, Object obj4) {
        if ((i10 & 8) != 0) {
            obj3 = null;
        }
        if ((i10 & 16) != 0) {
            oVar = p.r(0.0f, 0.0f, null, 7, null);
        }
        return n(z3Var, obj, obj2, obj3, oVar, function2, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit r(kotlin.jvm.internal.i1.h hVar, float f10, g gVar, q qVar, Function1 function1, long j10) {
        T t10 = hVar.f312751a;
        Intrinsics.checkNotNull(t10);
        I((n) t10, j10, f10, gVar, qVar, function1);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s(Function2 function2, z3 z3Var, n nVar) {
        function2.invoke(nVar.g(), z3Var.b().invoke(nVar.i()));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(n nVar) {
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Type inference failed for: r0v0, types: [T, androidx.compose.animation.core.n] */
    public static final Unit u(kotlin.jvm.internal.i1.h hVar, Object obj, g gVar, w wVar, final q qVar, float f10, Function1 function1, long j10) {
        ?? nVar = new n(obj, gVar.f(), wVar, j10, gVar.c(), j10, true, new Function0() { // from class: androidx.compose.animation.core.c3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return f3.v(qVar);
            }
        });
        I(nVar, j10, f10, gVar, qVar, function1);
        hVar.f312751a = nVar;
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit v(q qVar) {
        qVar.A(false);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit w(q qVar) {
        qVar.A(false);
        return Unit.f312394a;
    }

    @Nullable
    public static final Object x(float f10, float f11, @NotNull a1 a1Var, @NotNull final Function2<? super Float, ? super Float, Unit> function2, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objP = p(r.c(f10, f11, 0L, 0L, false, 28, null), l.c(a1Var, f10, f11), 0L, new Function1() { // from class: androidx.compose.animation.core.a3
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return f3.A(function2, (n) obj);
            }
        }, dVar, 2, null);
        return objP == kotlin.coroutines.intrinsics.b.l() ? objP : Unit.f312394a;
    }

    @Nullable
    public static final <T, V extends w> Object y(@NotNull q<T, V> qVar, @NotNull g0<T> g0Var, boolean z10, @NotNull Function1<? super n<T, V>, Unit> function1, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objM = m(qVar, new f0((g0) g0Var, (z3<T, w>) qVar.d(), (Object) qVar.getValue(), qVar.h()), z10 ? qVar.b() : Long.MIN_VALUE, function1, dVar);
        return objM == kotlin.coroutines.intrinsics.b.l() ? objM : Unit.f312394a;
    }

    public static /* synthetic */ Object z(q qVar, g0 g0Var, boolean z10, Function1 function1, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            z10 = false;
        }
        if ((i10 & 4) != 0) {
            function1 = new Function1() { // from class: androidx.compose.animation.core.y2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj2) {
                    return f3.B((n) obj2);
                }
            };
        }
        return y(qVar, g0Var, z10, function1, dVar);
    }
}

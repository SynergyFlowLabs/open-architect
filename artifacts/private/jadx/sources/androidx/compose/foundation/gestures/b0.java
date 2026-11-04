package androidx.compose.foundation.gestures;

import androidx.compose.runtime.d7;
import androidx.compose.runtime.k7;
import androidx.compose.runtime.n7;
import androidx.compose.runtime.w6;
import kotlin.Pair;
import kotlin.ResultKt;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@k7
@SourceDebugExtension({"SMAP\nAnchoredDraggable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnchoredDraggable.kt\nandroidx/compose/foundation/gestures/AnchoredDraggableState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n+ 4 InlineClassHelper.kt\nandroidx/compose/foundation/internal/InlineClassHelperKt\n+ 5 MutatorMutex.kt\nandroidx/compose/foundation/MutatorMutex\n*L\n1#1,1751:1\n85#2:1752\n117#2,2:1753\n85#2:1755\n117#2,2:1756\n85#2:1758\n85#2:1766\n85#2:1770\n117#2,2:1771\n85#2:1773\n117#2,2:1774\n81#3:1759\n114#3,2:1760\n81#3:1767\n114#3,2:1768\n51#4,4:1762\n97#4,4:1776\n188#5,9:1780\n*S KotlinDebug\n*F\n+ 1 AnchoredDraggable.kt\nandroidx/compose/foundation/gestures/AnchoredDraggableState\n*L\n849#1:1752\n849#1:1753,2\n858#1:1755\n858#1:1756,2\n865#1:1758\n938#1:1766\n957#1:1770\n957#1:1771,2\n959#1:1773\n959#1:1774,2\n883#1:1759\n883#1:1760,2\n954#1:1767\n954#1:1768,2\n893#1:1762,4\n1027#1:1776,4\n1224#1:1780,9\n*E\n"})
public final class b0<T> {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public static final a f14336p = new a(null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f14337q = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private Function1<? super T, Boolean> f14338a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public Function1<? super Float, Float> f14339b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public Function0<Float> f14340c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public androidx.compose.animation.core.o<Float> f14341d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public androidx.compose.animation.core.g0<Float> f14342e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final androidx.compose.foundation.s3 f14343f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.n3 f14344g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.n3 f14345h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final n7 f14346i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.k3 f14347j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final n7 f14348k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.k3 f14349l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.n3 f14350m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.n3 f14351n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    private final e f14352o;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ androidx.compose.runtime.saveable.c0 l(a aVar, androidx.compose.animation.core.o oVar, androidx.compose.animation.core.g0 g0Var, Function1 function1, Function0 function0, Function1 function2, int i10, Object obj) {
            if ((i10 & 16) != 0) {
                function2 = new Function1() { // from class: androidx.compose.foundation.gestures.y
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return Boolean.valueOf(b0.a.s(obj2));
                    }
                };
            }
            return aVar.j(oVar, g0Var, function1, function0, function2);
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ androidx.compose.runtime.saveable.c0 m(a aVar, Function1 function1, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                function1 = new Function1() { // from class: androidx.compose.foundation.gestures.v
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return Boolean.valueOf(b0.a.p(obj2));
                    }
                };
            }
            return aVar.k(function1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object n(androidx.compose.runtime.saveable.g0 g0Var, b0 b0Var) {
            return b0Var.t();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final b0 o(Object obj) {
            return new b0(obj);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean p(Object obj) {
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object q(androidx.compose.runtime.saveable.g0 g0Var, b0 b0Var) {
            return b0Var.t();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final b0 r(Function1 function1, Object obj) {
            return new b0(obj, (Function1<? super Object, Boolean>) function1);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean s(Object obj) {
            return true;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object t(androidx.compose.runtime.saveable.g0 g0Var, b0 b0Var) {
            return b0Var.t();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final b0 u(Function1 function1, Function0 function0, androidx.compose.animation.core.o oVar, androidx.compose.animation.core.g0 g0Var, Function1 function2, Object obj) {
            return k.j(obj, function1, function0, oVar, g0Var, function2);
        }

        @NotNull
        public final <T> androidx.compose.runtime.saveable.c0<b0<T>, T> i() {
            return androidx.compose.runtime.saveable.f0.e(new Function2() { // from class: androidx.compose.foundation.gestures.z
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return b0.a.n((androidx.compose.runtime.saveable.g0) obj, (b0) obj2);
                }
            }, new Function1() { // from class: androidx.compose.foundation.gestures.a0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return b0.a.o(obj);
                }
            });
        }

        @kotlin.l(level = kotlin.n.WARNING, message = "This constructor of AnchoredDraggableState has been deprecated. Please pass thresholds and animation specs to AnchoredDraggableDefaults.flingBehavior(..) instead, which can be passed to Modifier.anchoredDraggable.")
        @NotNull
        public final <T> androidx.compose.runtime.saveable.c0<b0<T>, T> j(@NotNull final androidx.compose.animation.core.o<Float> oVar, @NotNull final androidx.compose.animation.core.g0<Float> g0Var, @NotNull final Function1<? super Float, Float> function1, @NotNull final Function0<Float> function0, @NotNull final Function1<? super T, Boolean> function2) {
            return androidx.compose.runtime.saveable.f0.e(new Function2() { // from class: androidx.compose.foundation.gestures.t
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return b0.a.t((androidx.compose.runtime.saveable.g0) obj, (b0) obj2);
                }
            }, new Function1() { // from class: androidx.compose.foundation.gestures.u
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return b0.a.u(function1, function0, oVar, g0Var, function2, obj);
                }
            });
        }

        @kotlin.l(level = kotlin.n.WARNING, message = androidx.compose.material3.internal.d2.f28796a)
        @NotNull
        public final <T> androidx.compose.runtime.saveable.c0<b0<T>, T> k(@NotNull final Function1<? super T, Boolean> function1) {
            return androidx.compose.runtime.saveable.f0.e(new Function2() { // from class: androidx.compose.foundation.gestures.w
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return b0.a.q((androidx.compose.runtime.saveable.g0) obj, (b0) obj2);
                }
            }, new Function1() { // from class: androidx.compose.foundation.gestures.x
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return b0.a.r(function1, obj);
                }
            });
        }

        private a() {
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$2", f = "AnchoredDraggable.kt", i = {}, l = {1123}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function1<kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f14353a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ b0<T> f14354b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ pj.n<androidx.compose.foundation.gestures.b, t2<T>, kotlin.coroutines.d<? super Unit>, Object> f14355c;

        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$2$2", f = "AnchoredDraggable.kt", i = {}, l = {1124}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<t2<T>, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f14356a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f14357b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ pj.n<androidx.compose.foundation.gestures.b, t2<T>, kotlin.coroutines.d<? super Unit>, Object> f14358c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ b0<T> f14359d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(pj.n<? super androidx.compose.foundation.gestures.b, ? super t2<T>, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> nVar, b0<T> b0Var, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f14358c = nVar;
                this.f14359d = b0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                a aVar = new a(this.f14358c, this.f14359d, dVar);
                aVar.f14357b = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f14356a;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    t2<T> t2Var = (t2) this.f14357b;
                    pj.n<androidx.compose.foundation.gestures.b, t2<T>, kotlin.coroutines.d<? super Unit>, Object> nVar = this.f14358c;
                    e eVar = ((b0) this.f14359d).f14352o;
                    this.f14356a = 1;
                    if (nVar.invoke(eVar, t2Var, this) == objL) {
                        return objL;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                }
                return Unit.f312394a;
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public final Object invoke(t2<T> t2Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(t2Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(b0<T> b0Var, pj.n<? super androidx.compose.foundation.gestures.b, ? super t2<T>, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> nVar, kotlin.coroutines.d<? super b> dVar) {
            super(1, dVar);
            this.f14354b = b0Var;
            this.f14355c = nVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final t2 m(b0 b0Var) {
            return b0Var.r();
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
            return new b(this.f14354b, this.f14355c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f14353a;
            if (i10 == 0) {
                ResultKt.m(obj);
                final b0<T> b0Var = this.f14354b;
                Function0 function0 = new Function0() { // from class: androidx.compose.foundation.gestures.c0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return b0.b.m(b0Var);
                    }
                };
                a aVar = new a(this.f14355c, this.f14354b, null);
                this.f14353a = 1;
                if (k.T(function0, aVar, this) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            T tB = this.f14354b.r().b(this.f14354b.y());
            if (tB != null) {
                if (Math.abs(this.f14354b.y() - this.f14354b.r().c(tB)) < 0.5f && this.f14354b.s().invoke(tB).booleanValue()) {
                    this.f14354b.W(tB);
                    this.f14354b.Q(tB);
                }
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.AnchoredDraggableState", f = "AnchoredDraggable.kt", i = {}, l = {1168}, m = "anchoredDrag", n = {}, s = {})
    static final class c extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f14360a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ b0<T> f14361b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f14362c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(b0<T> b0Var, kotlin.coroutines.d<? super c> dVar) {
            super(dVar);
            this.f14361b = b0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f14360a = obj;
            this.f14362c |= Integer.MIN_VALUE;
            return this.f14361b.m(null, null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$4", f = "AnchoredDraggable.kt", i = {}, l = {1170}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends kotlin.coroutines.jvm.internal.o implements Function1<kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f14363a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ b0<T> f14364b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ T f14365c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ pj.o<androidx.compose.foundation.gestures.b, t2<T>, T, kotlin.coroutines.d<? super Unit>, Object> f14366d;

        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.AnchoredDraggableState$anchoredDrag$4$2", f = "AnchoredDraggable.kt", i = {}, l = {1172}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<Pair<? extends t2<T>, ? extends T>, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f14367a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f14368b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ pj.o<androidx.compose.foundation.gestures.b, t2<T>, T, kotlin.coroutines.d<? super Unit>, Object> f14369c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ b0<T> f14370d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(pj.o<? super androidx.compose.foundation.gestures.b, ? super t2<T>, ? super T, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> oVar, b0<T> b0Var, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f14369c = oVar;
                this.f14370d = b0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                a aVar = new a(this.f14369c, this.f14370d, dVar);
                aVar.f14368b = obj;
                return aVar;
            }

            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to androidx.compose.foundation.gestures.b0$d$a for r6v4 'this'  java.lang.Object
                	at jadx.core.dex.instructions.args.SSAVar.setType(SSAVar.java:114)
                	at jadx.core.dex.instructions.args.RegisterArg.setType(RegisterArg.java:52)
                	at jadx.core.dex.visitors.ModVisitor.removeCheckCast(ModVisitor.java:417)
                	at jadx.core.dex.visitors.ModVisitor.replaceStep(ModVisitor.java:152)
                	at jadx.core.dex.visitors.ModVisitor.visit(ModVisitor.java:96)
                */
            @Override // kotlin.coroutines.jvm.internal.a
            public final java.lang.Object invokeSuspend(java.lang.Object r7) {
                /*
                    r6 = this;
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                    r5 = 2
                    int r1 = r6.f14367a
                    r2 = 1
                    r5 = 7
                    if (r1 == 0) goto L1a
                    r5 = 5
                    if (r1 != r2) goto L12
                    kotlin.ResultKt.m(r7)
                    goto L41
                L12:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L1a:
                    kotlin.ResultKt.m(r7)
                    java.lang.Object r7 = r6.f14368b
                    kotlin.Pair r7 = (kotlin.Pair) r7
                    java.lang.Object r1 = r7.component1()
                    r5 = 7
                    androidx.compose.foundation.gestures.t2 r1 = (androidx.compose.foundation.gestures.t2) r1
                    java.lang.Object r7 = r7.component2()
                    pj.o<androidx.compose.foundation.gestures.b, androidx.compose.foundation.gestures.t2<T>, T, kotlin.coroutines.d<? super kotlin.Unit>, java.lang.Object> r3 = r6.f14369c
                    r5 = 0
                    androidx.compose.foundation.gestures.b0<T> r4 = r6.f14370d
                    androidx.compose.foundation.gestures.b0$e r4 = androidx.compose.foundation.gestures.b0.f(r4)
                    r5 = 7
                    r6.f14367a = r2
                    r5 = 4
                    java.lang.Object r6 = r3.invoke(r4, r1, r7, r6)
                    r5 = 6
                    if (r6 != r0) goto L41
                    return r0
                L41:
                    r5 = 4
                    kotlin.Unit r6 = kotlin.Unit.f312394a
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.b0.d.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public final Object invoke(Pair<? extends t2<T>, ? extends T> pair, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(pair, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        d(b0<T> b0Var, T t10, pj.o<? super androidx.compose.foundation.gestures.b, ? super t2<T>, ? super T, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> oVar, kotlin.coroutines.d<? super d> dVar) {
            super(1, dVar);
            this.f14364b = b0Var;
            this.f14365c = t10;
            this.f14366d = oVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Pair m(b0 b0Var) {
            return TuplesKt.to(b0Var.r(), b0Var.F());
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
            return new d(this.f14364b, this.f14365c, this.f14366d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f14363a;
            if (i10 == 0) {
                ResultKt.m(obj);
                this.f14364b.S(this.f14365c);
                final b0<T> b0Var = this.f14364b;
                Function0 function0 = new Function0() { // from class: androidx.compose.foundation.gestures.d0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return b0.d.m(b0Var);
                    }
                };
                a aVar = new a(this.f14366d, this.f14364b, null);
                this.f14363a = 1;
                if (k.T(function0, aVar, this) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            if (this.f14364b.s().invoke(this.f14365c).booleanValue()) {
                ((b0) this.f14364b).f14352o.a(this.f14364b.r().c(this.f14365c), this.f14364b.x());
                this.f14364b.W(this.f14365c);
                this.f14364b.Q(this.f14365c);
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(kotlin.coroutines.d<? super Unit> dVar) {
            return ((d) create(dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public static final class e implements androidx.compose.foundation.gestures.b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private T f14371a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private T f14372b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private float f14373c = Float.NaN;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ b0<T> f14374d;

        e(b0<T> b0Var) {
            this.f14374d = b0Var;
        }

        @Override // androidx.compose.foundation.gestures.b
        public void a(float f10, float f11) {
            float fY = this.f14374d.y();
            this.f14374d.U(f10);
            this.f14374d.T(f11);
            if (Float.isNaN(fY)) {
                return;
            }
            j(f10 >= fY);
        }

        public final float c() {
            return this.f14373c;
        }

        public final T d() {
            return this.f14371a;
        }

        public final T e() {
            return this.f14372b;
        }

        public final void f(float f10) {
            this.f14373c = f10;
        }

        public final void g(T t10) {
            this.f14371a = t10;
        }

        public final void h(T t10) {
            this.f14372b = t10;
        }

        public final void i(boolean z10) {
            if (this.f14374d.y() == this.f14374d.r().c(this.f14374d.t())) {
                T tA = this.f14374d.r().a(this.f14374d.y() + (z10 ? 1.0f : -1.0f), z10);
                if (tA == null) {
                    tA = this.f14374d.t();
                }
                if (z10) {
                    this.f14371a = this.f14374d.t();
                    this.f14372b = tA;
                } else {
                    this.f14371a = tA;
                    this.f14372b = this.f14374d.t();
                }
            } else {
                T tA2 = this.f14374d.r().a(this.f14374d.y(), false);
                if (tA2 == null) {
                    tA2 = this.f14374d.t();
                }
                T tA3 = this.f14374d.r().a(this.f14374d.y(), true);
                if (tA3 == null) {
                    tA3 = this.f14374d.t();
                }
                this.f14371a = tA2;
                this.f14372b = tA3;
            }
            t2<T> t2VarR = this.f14374d.r();
            T t10 = this.f14371a;
            Intrinsics.checkNotNull(t10);
            float fC = t2VarR.c(t10);
            t2<T> t2VarR2 = this.f14374d.r();
            T t11 = this.f14372b;
            Intrinsics.checkNotNull(t11);
            this.f14373c = Math.abs(fC - t2VarR2.c(t11));
        }

        public final void j(boolean z10) {
            i(z10);
            if (Math.abs(this.f14374d.y() - this.f14374d.r().c(this.f14374d.t())) >= this.f14373c / 2.0f) {
                T t10 = z10 ? this.f14372b : this.f14371a;
                if (t10 == null) {
                    t10 = this.f14374d.t();
                }
                if (((Boolean) this.f14374d.s().invoke(t10)).booleanValue()) {
                    this.f14374d.Q(t10);
                }
            }
        }
    }

    public b0(T t10) {
        this.f14338a = new Function1() { // from class: androidx.compose.foundation.gestures.p
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return Boolean.valueOf(b0.p(obj));
            }
        };
        this.f14343f = new androidx.compose.foundation.s3();
        this.f14344g = d7.g(t10, null, 2, null);
        this.f14345h = d7.g(t10, null, 2, null);
        this.f14346i = w6.e(new Function0() { // from class: androidx.compose.foundation.gestures.q
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return b0.b0(this.f14955a);
            }
        });
        this.f14347j = androidx.compose.runtime.g4.b(Float.NaN);
        this.f14348k = w6.d(w6.z(), new Function0() { // from class: androidx.compose.foundation.gestures.r
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Float.valueOf(b0.M(this.f14969a));
            }
        });
        this.f14349l = androidx.compose.runtime.g4.b(0.0f);
        this.f14350m = d7.g(null, null, 2, null);
        this.f14351n = d7.g(k.Q(), null, 2, null);
        this.f14352o = new e(this);
    }

    @kotlin.l(message = "Use the progress function to query the progress between two specified anchors.", replaceWith = @kotlin.b1(expression = "progress(state.settledValue, state.targetValue)", imports = {}))
    public static /* synthetic */ void B() {
    }

    @kotlin.l(level = kotlin.n.WARNING, message = "This constructor of AnchoredDraggableState has been deprecated. Please pass thresholds and animation specs to AnchoredDraggableDefaults.flingBehavior(..) instead, which can be passed to Modifier.anchoredDraggable.")
    public static /* synthetic */ void E() {
    }

    public static /* synthetic */ void H() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final float M(b0 b0Var) {
        float fC = b0Var.r().c(b0Var.C());
        float fC2 = b0Var.r().c(b0Var.F()) - fC;
        float fAbs = Math.abs(fC2);
        if (Float.isNaN(fAbs) || fAbs <= 1.0E-6f) {
            return 1.0f;
        }
        float fN = (b0Var.N() - fC) / fC2;
        if (fN < 1.0E-6f) {
            return 0.0f;
        }
        if (fN > 0.999999f) {
            return 1.0f;
        }
        return fN;
    }

    private final void O(t2<T> t2Var) {
        this.f14351n.setValue(t2Var);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Q(T t10) {
        this.f14344g.setValue(t10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void S(T t10) {
        this.f14350m.setValue(t10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void T(float f10) {
        this.f14349l.q(f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void U(float f10) {
        this.f14347j.q(f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void W(T t10) {
        this.f14345h.setValue(t10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object b0(b0 b0Var) {
        T tB;
        Object objW = b0Var.w();
        if (objW != null) {
            return objW;
        }
        if (!Float.isNaN(b0Var.y()) && (tB = b0Var.r().b(b0Var.y())) != null) {
            return tB;
        }
        return b0Var.t();
    }

    private final boolean c0(T t10) {
        androidx.compose.foundation.s3 s3Var = this.f14343f;
        boolean zH = s3Var.h();
        if (!zH) {
            return zH;
        }
        try {
            e eVar = this.f14352o;
            float fC = r().c(t10);
            if (!Float.isNaN(fC)) {
                androidx.compose.foundation.gestures.b.b(eVar, fC, 0.0f, 2, null);
                S(null);
            }
            Q(t10);
            W(t10);
            return zH;
        } finally {
            s3Var.k();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean e(Object obj) {
        return true;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void e0(b0 b0Var, t2 t2Var, Object obj, int i10, Object obj2) {
        if ((i10 & 2) != 0 && (Float.isNaN(b0Var.y()) || (obj = t2Var.b(b0Var.y())) == null)) {
            obj = b0Var.F();
        }
        b0Var.d0(t2Var, obj);
    }

    public static /* synthetic */ Object n(b0 b0Var, androidx.compose.foundation.q3 q3Var, pj.n nVar, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            q3Var = androidx.compose.foundation.q3.Default;
        }
        return b0Var.l(q3Var, nVar, dVar);
    }

    public static /* synthetic */ Object o(b0 b0Var, Object obj, androidx.compose.foundation.q3 q3Var, pj.o oVar, kotlin.coroutines.d dVar, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            q3Var = androidx.compose.foundation.q3.Default;
        }
        return b0Var.m(obj, q3Var, oVar, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean p(Object obj) {
        return true;
    }

    @kotlin.l(level = kotlin.n.WARNING, message = "This constructor of AnchoredDraggableState has been deprecated. Please pass thresholds and animation specs to AnchoredDraggableDefaults.flingBehavior(..) instead, which can be passed to Modifier.anchoredDraggable.")
    public static /* synthetic */ void v() {
    }

    private final T w() {
        return this.f14350m.getValue();
    }

    @androidx.annotation.x(from = 0.0d, to = 1.0d)
    public final float A() {
        return ((Number) this.f14348k.getValue()).floatValue();
    }

    public final T C() {
        return this.f14345h.getValue();
    }

    @NotNull
    public final androidx.compose.animation.core.o<Float> D() {
        androidx.compose.animation.core.o<Float> oVar = this.f14341d;
        if (oVar != null) {
            return oVar;
        }
        Intrinsics.throwUninitializedPropertyAccessException("snapAnimationSpec");
        return null;
    }

    public final T F() {
        return (T) this.f14346i.getValue();
    }

    public final boolean G() {
        return (this.f14339b == null || this.f14340c == null || this.f14341d == null || this.f14342e == null) ? false : true;
    }

    @NotNull
    public final Function0<Float> I() {
        Function0<Float> function0 = this.f14340c;
        if (function0 != null) {
            return function0;
        }
        Intrinsics.throwUninitializedPropertyAccessException("velocityThreshold");
        return null;
    }

    public final boolean J() {
        return w() != null;
    }

    public final float K(float f10) {
        return kotlin.ranges.r.H((Float.isNaN(y()) ? 0.0f : y()) + f10, r().h(), r().f());
    }

    @androidx.annotation.x(from = 0.0d, to = 1.0d)
    public final float L(T t10, T t11) {
        float fC = r().c(t10);
        float fC2 = r().c(t11);
        float fH = (kotlin.ranges.r.H(y(), Math.min(fC, fC2), Math.max(fC, fC2)) - fC) / (fC2 - fC);
        if (Float.isNaN(fH)) {
            return 1.0f;
        }
        if (fH < 1.0E-6f) {
            return 0.0f;
        }
        if (fH > 0.999999f) {
            return 1.0f;
        }
        return Math.abs(fH);
    }

    public final float N() {
        if (Float.isNaN(y())) {
            androidx.compose.foundation.internal.e.i("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?");
        }
        return y();
    }

    public final void P(@NotNull Function1<? super T, Boolean> function1) {
        this.f14338a = function1;
    }

    public final void R(@NotNull androidx.compose.animation.core.g0<Float> g0Var) {
        this.f14342e = g0Var;
    }

    public final void V(@NotNull Function1<? super Float, Float> function1) {
        this.f14339b = function1;
    }

    public final void X(@NotNull androidx.compose.animation.core.o<Float> oVar) {
        this.f14341d = oVar;
    }

    public final void Y(@NotNull Function0<Float> function0) {
        this.f14340c = function0;
    }

    @kotlin.l(level = kotlin.n.WARNING, message = "settle does not accept a velocity anymore. Please use FlingBehavior#performFling instead. See AnchoredDraggableSample.kt for example usages.")
    @Nullable
    public final Object Z(float f10, @NotNull kotlin.coroutines.d<? super Float> dVar) {
        if (!G()) {
            androidx.compose.foundation.internal.e.g("AnchoredDraggableState was configured through a constructor without providing positional and velocity threshold. This overload of settle has been deprecated. Please refer to AnchoredDraggableState#settle(animationSpec) for more information.");
        }
        T t10 = t();
        Object objO = k.O(r(), N(), f10, z(), I());
        return this.f14338a.invoke(objO).booleanValue() ? k.M(this, objO, f10, null, null, dVar, 12, null) : k.M(this, t10, f10, null, null, dVar, 12, null);
    }

    @Nullable
    public final Object a0(@NotNull androidx.compose.animation.core.o<Float> oVar, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        T t10 = t();
        T tB = r().b(N());
        if (tB == null || !this.f14338a.invoke(tB).booleanValue()) {
            Object objI = k.I(this, t10, oVar, dVar);
            return objI == kotlin.coroutines.intrinsics.b.l() ? objI : Unit.f312394a;
        }
        Object objI2 = k.I(this, tB, oVar, dVar);
        return objI2 == kotlin.coroutines.intrinsics.b.l() ? objI2 : Unit.f312394a;
    }

    public final void d0(@NotNull t2<T> t2Var, T t10) {
        if (!Intrinsics.areEqual(r(), t2Var)) {
            O(t2Var);
            if (!c0(t10)) {
                S(t10);
            }
        }
    }

    @Nullable
    public final Object l(@NotNull androidx.compose.foundation.q3 q3Var, @NotNull pj.n<? super androidx.compose.foundation.gestures.b, ? super t2<T>, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> nVar, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objD = this.f14343f.d(q3Var, new b(this, nVar, null), dVar);
        return objD == kotlin.coroutines.intrinsics.b.l() ? objD : Unit.f312394a;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Nullable
    public final Object m(T t10, @NotNull androidx.compose.foundation.q3 q3Var, @NotNull pj.o<? super androidx.compose.foundation.gestures.b, ? super t2<T>, ? super T, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> oVar, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        c cVar;
        if (dVar instanceof c) {
            cVar = (c) dVar;
            int i10 = cVar.f14362c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar.f14362c = i10 - Integer.MIN_VALUE;
            } else {
                cVar = new c(this, dVar);
            }
        } else {
            cVar = new c(this, dVar);
        }
        Object obj = cVar.f14360a;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = cVar.f14362c;
        try {
            if (i11 == 0) {
                ResultKt.m(obj);
                if (r().d(t10)) {
                    androidx.compose.foundation.s3 s3Var = this.f14343f;
                    d dVar2 = new d(this, t10, oVar, null);
                    cVar.f14362c = 1;
                    if (s3Var.d(q3Var, dVar2, cVar) == objL) {
                        return objL;
                    }
                } else if (this.f14338a.invoke(t10).booleanValue()) {
                    W(t10);
                    Q(t10);
                }
                return Unit.f312394a;
            }
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            S(null);
            return Unit.f312394a;
        } catch (Throwable th2) {
            S(null);
            throw th2;
        }
    }

    public final float q(float f10) {
        float fK = K(f10);
        float fN = fK - N();
        androidx.compose.foundation.gestures.b.b(this.f14352o, fK, 0.0f, 2, null);
        return fN;
    }

    @NotNull
    public final t2<T> r() {
        return (t2) this.f14351n.getValue();
    }

    @NotNull
    public final Function1<T, Boolean> s() {
        return this.f14338a;
    }

    public final T t() {
        return this.f14344g.getValue();
    }

    @NotNull
    public final androidx.compose.animation.core.g0<Float> u() {
        androidx.compose.animation.core.g0<Float> g0Var = this.f14342e;
        if (g0Var != null) {
            return g0Var;
        }
        Intrinsics.throwUninitializedPropertyAccessException("decayAnimationSpec");
        return null;
    }

    public final float x() {
        return this.f14349l.V0();
    }

    public final float y() {
        return this.f14347j.V0();
    }

    @NotNull
    public final Function1<Float, Float> z() {
        Function1 function1 = this.f14339b;
        if (function1 != null) {
            return function1;
        }
        Intrinsics.throwUninitializedPropertyAccessException("positionalThreshold");
        return null;
    }

    public b0(T t10, @NotNull t2<T> t2Var) {
        this(t10);
        O(t2Var);
        c0(t10);
    }

    @kotlin.l(level = kotlin.n.WARNING, message = androidx.compose.material3.internal.d2.f28796a)
    public b0(T t10, @NotNull Function1<? super T, Boolean> function1) {
        this(t10);
        this.f14338a = function1;
    }

    public /* synthetic */ b0(Object obj, t2 t2Var, Function1 function1, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, t2Var, (i10 & 4) != 0 ? new Function1() { // from class: androidx.compose.foundation.gestures.s
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return Boolean.valueOf(b0.e(obj2));
            }
        } : function1);
    }

    @kotlin.l(level = kotlin.n.WARNING, message = androidx.compose.material3.internal.d2.f28796a)
    public b0(T t10, @NotNull t2<T> t2Var, @NotNull Function1<? super T, Boolean> function1) {
        this(t10, function1);
        O(t2Var);
        c0(t10);
    }
}

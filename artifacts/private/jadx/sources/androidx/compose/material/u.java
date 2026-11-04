package androidx.compose.material;

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
@u7
@androidx.compose.runtime.k7
@SourceDebugExtension({"SMAP\nAnchoredDraggable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnchoredDraggable.kt\nandroidx/compose/material/AnchoredDraggableState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n*L\n1#1,875:1\n85#2:876\n117#2,2:877\n85#2:879\n85#2:880\n85#2:884\n85#2:888\n117#2,2:889\n85#2:891\n117#2,2:892\n81#3:881\n114#3,2:882\n81#3:885\n114#3,2:886\n*S KotlinDebug\n*F\n+ 1 AnchoredDraggable.kt\nandroidx/compose/material/AnchoredDraggableState\n*L\n293#1:876\n293#1:877,2\n301#1:879\n316#1:880\n361#1:884\n380#1:888\n380#1:889,2\n382#1:891\n382#1:892,2\n334#1:881\n334#1:882,2\n377#1:885\n377#1:886,2\n*E\n"})
public final class u<T> {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public static final a f25094p = new a(null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f25095q = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function1<Float, Float> f25096a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function0<Float> f25097b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final androidx.compose.animation.core.o<Float> f25098c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final Function1<T, Boolean> f25099d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final m9 f25100e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final androidx.compose.foundation.gestures.a3 f25101f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.n3 f25102g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.n7 f25103h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.n7 f25104i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.k3 f25105j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.n7 f25106k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.k3 f25107l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.n3 f25108m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.n3 f25109n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    private final i f25110o;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object d(androidx.compose.runtime.saveable.g0 g0Var, u uVar) {
            return uVar.y();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final u e(Function1 function1, Function0 function0, androidx.compose.animation.core.o oVar, Function1 function2, Object obj) {
            return new u(obj, function1, function0, oVar, function2);
        }

        @u7
        @NotNull
        public final <T> androidx.compose.runtime.saveable.c0<u<T>, T> c(@NotNull final androidx.compose.animation.core.o<Float> oVar, @NotNull final Function1<? super T, Boolean> function1, @NotNull final Function1<? super Float, Float> function2, @NotNull final Function0<Float> function0) {
            return androidx.compose.runtime.saveable.f0.e(new Function2() { // from class: androidx.compose.material.s
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return u.a.d((androidx.compose.runtime.saveable.g0) obj, (u) obj2);
                }
            }, new Function1() { // from class: androidx.compose.material.t
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return u.a.e(function2, function0, oVar, function1, obj);
                }
            });
        }

        private a() {
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.AnchoredDraggableState", f = "AnchoredDraggable.kt", i = {}, l = {523}, m = "anchoredDrag", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f25111a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ u<T> f25112b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f25113c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(u<T> uVar, kotlin.coroutines.d<? super b> dVar) {
            super(dVar);
            this.f25112b = uVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f25111a = obj;
            this.f25113c |= Integer.MIN_VALUE;
            return this.f25112b.m(null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.AnchoredDraggableState$anchoredDrag$2", f = "AnchoredDraggable.kt", i = {}, l = {524}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends kotlin.coroutines.jvm.internal.o implements Function1<kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f25114a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ u<T> f25115b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ pj.n<i, w5<T>, kotlin.coroutines.d<? super Unit>, Object> f25116c;

        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.AnchoredDraggableState$anchoredDrag$2$2", f = "AnchoredDraggable.kt", i = {}, l = {525}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<w5<T>, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f25117a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f25118b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ pj.n<i, w5<T>, kotlin.coroutines.d<? super Unit>, Object> f25119c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ u<T> f25120d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(pj.n<? super i, ? super w5<T>, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> nVar, u<T> uVar, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f25119c = nVar;
                this.f25120d = uVar;
                int i10 = 7 ^ 2;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                a aVar = new a(this.f25119c, this.f25120d, dVar);
                aVar.f25118b = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f25117a;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    w5<T> w5Var = (w5) this.f25118b;
                    pj.n<i, w5<T>, kotlin.coroutines.d<? super Unit>, Object> nVar = this.f25119c;
                    i iVar = ((u) this.f25120d).f25110o;
                    this.f25117a = 1;
                    if (nVar.invoke(iVar, w5Var, this) == objL) {
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
            public final Object invoke(w5<T> w5Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(w5Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(u<T> uVar, pj.n<? super i, ? super w5<T>, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> nVar, kotlin.coroutines.d<? super c> dVar) {
            super(1, dVar);
            this.f25115b = uVar;
            this.f25116c = nVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final w5 m(u uVar) {
            return uVar.u();
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
            return new c(this.f25115b, this.f25116c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f25114a;
            if (i10 == 0) {
                ResultKt.m(obj);
                final u<T> uVar = this.f25115b;
                Function0 function0 = new Function0() { // from class: androidx.compose.material.v
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return u.c.m(uVar);
                    }
                };
                a aVar = new a(this.f25116c, this.f25115b, null);
                this.f25114a = 1;
                if (k.j(function0, aVar, this) == objL) {
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

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.AnchoredDraggableState", f = "AnchoredDraggable.kt", i = {}, l = {570}, m = "anchoredDrag", n = {}, s = {})
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f25121a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ u<T> f25122b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f25123c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(u<T> uVar, kotlin.coroutines.d<? super d> dVar) {
            super(dVar);
            this.f25122b = uVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f25121a = obj;
            this.f25123c |= Integer.MIN_VALUE;
            return this.f25122b.n(null, null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.AnchoredDraggableState$anchoredDrag$4", f = "AnchoredDraggable.kt", i = {}, l = {572}, m = "invokeSuspend", n = {}, s = {})
    static final class e extends kotlin.coroutines.jvm.internal.o implements Function1<kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f25124a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ u<T> f25125b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ T f25126c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ pj.o<i, w5<T>, T, kotlin.coroutines.d<? super Unit>, Object> f25127d;

        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.AnchoredDraggableState$anchoredDrag$4$2", f = "AnchoredDraggable.kt", i = {}, l = {574}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<Pair<? extends w5<T>, ? extends T>, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f25128a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f25129b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ pj.o<i, w5<T>, T, kotlin.coroutines.d<? super Unit>, Object> f25130c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ u<T> f25131d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(pj.o<? super i, ? super w5<T>, ? super T, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> oVar, u<T> uVar, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f25130c = oVar;
                this.f25131d = uVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                a aVar = new a(this.f25130c, this.f25131d, dVar);
                aVar.f25129b = obj;
                return aVar;
            }

            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to androidx.compose.material.u$e$a for r6v4 'this'  java.lang.Object
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
                    r5 = 2
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                    r5 = 6
                    int r1 = r6.f25128a
                    r2 = 1
                    if (r1 == 0) goto L1c
                    if (r1 != r2) goto L12
                    r5 = 1
                    kotlin.ResultKt.m(r7)
                    goto L42
                L12:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "/isucbe oeohect/ ka /rlrf rso/ tenow /m/uee/lvotnii"
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    throw r6
                L1c:
                    r5 = 0
                    kotlin.ResultKt.m(r7)
                    java.lang.Object r7 = r6.f25129b
                    kotlin.Pair r7 = (kotlin.Pair) r7
                    java.lang.Object r1 = r7.component1()
                    r5 = 3
                    androidx.compose.material.w5 r1 = (androidx.compose.material.w5) r1
                    java.lang.Object r7 = r7.component2()
                    pj.o<androidx.compose.material.i, androidx.compose.material.w5<T>, T, kotlin.coroutines.d<? super kotlin.Unit>, java.lang.Object> r3 = r6.f25130c
                    androidx.compose.material.u<T> r4 = r6.f25131d
                    androidx.compose.material.i r4 = androidx.compose.material.u.i(r4)
                    r6.f25128a = r2
                    java.lang.Object r6 = r3.invoke(r4, r1, r7, r6)
                    r5 = 4
                    if (r6 != r0) goto L42
                    r5 = 2
                    return r0
                L42:
                    r5 = 4
                    kotlin.Unit r6 = kotlin.Unit.f312394a
                    r5 = 5
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material.u.e.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public final Object invoke(Pair<? extends w5<T>, ? extends T> pair, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(pair, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(u<T> uVar, T t10, pj.o<? super i, ? super w5<T>, ? super T, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> oVar, kotlin.coroutines.d<? super e> dVar) {
            super(1, dVar);
            this.f25125b = uVar;
            this.f25126c = t10;
            this.f25127d = oVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Pair m(u uVar) {
            return TuplesKt.to(uVar.u(), uVar.F());
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
            return new e(this.f25125b, this.f25126c, this.f25127d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f25124a;
            if (i10 == 0) {
                ResultKt.m(obj);
                this.f25125b.N(this.f25126c);
                final u<T> uVar = this.f25125b;
                Function0 function0 = new Function0() { // from class: androidx.compose.material.w
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return u.e.m(uVar);
                    }
                };
                a aVar = new a(this.f25127d, this.f25125b, null);
                this.f25124a = 1;
                if (k.j(function0, aVar, this) == objL) {
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

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(kotlin.coroutines.d<? super Unit> dVar) {
            return ((e) create(dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public static final class f implements i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ u<T> f25132a;

        f(u<T> uVar) {
            this.f25132a = uVar;
        }

        @Override // androidx.compose.material.i
        public void a(float f10, float f11) {
            this.f25132a.P(f10);
            this.f25132a.O(f11);
        }
    }

    public static final class g implements androidx.compose.foundation.gestures.a3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final b f25133a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ u<T> f25134b;

        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.AnchoredDraggableState$draggableState$1$drag$2", f = "AnchoredDraggable.kt", i = {}, l = {283}, m = "invokeSuspend", n = {}, s = {})
        @SourceDebugExtension({"SMAP\nAnchoredDraggable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnchoredDraggable.kt\nandroidx/compose/material/AnchoredDraggableState$draggableState$1$drag$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,875:1\n1#2:876\n*E\n"})
        static final class a extends kotlin.coroutines.jvm.internal.o implements pj.n<i, w5<T>, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f25135a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function2<androidx.compose.foundation.gestures.k2, kotlin.coroutines.d<? super Unit>, Object> f25137c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(Function2<? super androidx.compose.foundation.gestures.k2, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, kotlin.coroutines.d<? super a> dVar) {
                super(3, dVar);
                this.f25137c = function2;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f25135a;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    b bVar = g.this.f25133a;
                    Function2<androidx.compose.foundation.gestures.k2, kotlin.coroutines.d<? super Unit>, Object> function2 = this.f25137c;
                    this.f25135a = 1;
                    if (function2.invoke(bVar, this) == objL) {
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

            @Override // pj.n
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public final Object invoke(i iVar, w5<T> w5Var, kotlin.coroutines.d<? super Unit> dVar) {
                return g.this.new a(this.f25137c, dVar).invokeSuspend(Unit.f312394a);
            }
        }

        @SourceDebugExtension({"SMAP\nAnchoredDraggable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnchoredDraggable.kt\nandroidx/compose/material/AnchoredDraggableState$draggableState$1$dragScope$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,875:1\n1#2:876\n*E\n"})
        public static final class b implements androidx.compose.foundation.gestures.k2 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ u<T> f25138a;

            b(u<T> uVar) {
                this.f25138a = uVar;
            }

            @Override // androidx.compose.foundation.gestures.k2
            public void a(float f10) {
                i.b(((u) this.f25138a).f25110o, this.f25138a.I(f10), 0.0f, 2, null);
            }
        }

        g(u<T> uVar) {
            this.f25134b = uVar;
            this.f25133a = new b(uVar);
        }

        @Override // androidx.compose.foundation.gestures.a3
        public Object a(androidx.compose.foundation.q3 q3Var, Function2<? super androidx.compose.foundation.gestures.k2, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, kotlin.coroutines.d<? super Unit> dVar) {
            Object objM = this.f25134b.m(q3Var, new a(function2, null), dVar);
            return objM == kotlin.coroutines.intrinsics.b.l() ? objM : Unit.f312394a;
        }

        @Override // androidx.compose.foundation.gestures.a3
        public void b(float f10) {
            this.f25134b.t(f10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public u(T t10, @NotNull Function1<? super Float, Float> function1, @NotNull Function0<Float> function0, @NotNull androidx.compose.animation.core.o<Float> oVar, @NotNull Function1<? super T, Boolean> function2) {
        this.f25096a = function1;
        this.f25097b = function0;
        this.f25098c = oVar;
        this.f25099d = function2;
        this.f25100e = new m9();
        this.f25101f = new g(this);
        this.f25102g = androidx.compose.runtime.d7.g(t10, null, 2, null);
        this.f25103h = androidx.compose.runtime.w6.e(new Function0() { // from class: androidx.compose.material.m
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return u.R(this.f23720a);
            }
        });
        this.f25104i = androidx.compose.runtime.w6.e(new Function0() { // from class: androidx.compose.material.n
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return u.q(this.f23828a);
            }
        });
        this.f25105j = androidx.compose.runtime.g4.b(Float.NaN);
        this.f25106k = androidx.compose.runtime.w6.d(androidx.compose.runtime.w6.z(), new Function0() { // from class: androidx.compose.material.o
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Float.valueOf(u.J(this.f24008a));
            }
        });
        this.f25107l = androidx.compose.runtime.g4.b(0.0f);
        this.f25108m = androidx.compose.runtime.d7.g(null, null, 2, null);
        this.f25109n = androidx.compose.runtime.d7.g(k.i(), null, 2, null);
        this.f25110o = new f(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final float J(u uVar) {
        float fC = uVar.u().c(uVar.y());
        float fC2 = uVar.u().c(uVar.w()) - fC;
        float fAbs = Math.abs(fC2);
        if (Float.isNaN(fAbs) || fAbs <= 1.0E-6f) {
            return 1.0f;
        }
        float fK = (uVar.K() - fC) / fC2;
        if (fK < 1.0E-6f) {
            return 0.0f;
        }
        if (fK > 0.999999f) {
            return 1.0f;
        }
        return fK;
    }

    private final void L(w5<T> w5Var) {
        this.f25109n.setValue(w5Var);
    }

    private final void M(T t10) {
        this.f25102g.setValue(t10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void N(T t10) {
        this.f25108m.setValue(t10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O(float f10) {
        this.f25107l.q(f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void P(float f10) {
        this.f25105j.q(f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object R(u uVar) {
        Object objZ = uVar.z();
        if (objZ != null) {
            return objZ;
        }
        float fC = uVar.C();
        return !Float.isNaN(fC) ? uVar.r(fC, uVar.y(), 0.0f) : uVar.y();
    }

    private final boolean S(final T t10) {
        return this.f25100e.h(new Function0() { // from class: androidx.compose.material.r
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return u.T(this.f24587a, t10);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit T(u uVar, Object obj) {
        i iVar = uVar.f25110o;
        float fC = uVar.u().c(obj);
        if (!Float.isNaN(fC)) {
            int i10 = 3 & 2;
            i.b(iVar, fC, 0.0f, 2, null);
            uVar.N(null);
        }
        uVar.M(obj);
        return Unit.f312394a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void V(u uVar, w5 w5Var, Object obj, int i10, Object obj2) {
        if ((i10 & 2) != 0 && (Float.isNaN(uVar.C()) || (obj = w5Var.b(uVar.C())) == null)) {
            obj = uVar.F();
        }
        uVar.U(w5Var, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean g(Object obj) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean h(Object obj) {
        return true;
    }

    public static /* synthetic */ Object o(u uVar, androidx.compose.foundation.q3 q3Var, pj.n nVar, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            q3Var = androidx.compose.foundation.q3.Default;
        }
        return uVar.m(q3Var, nVar, dVar);
    }

    public static /* synthetic */ Object p(u uVar, Object obj, androidx.compose.foundation.q3 q3Var, pj.o oVar, kotlin.coroutines.d dVar, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            q3Var = androidx.compose.foundation.q3.Default;
        }
        return uVar.n(obj, q3Var, oVar, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object q(u uVar) {
        Object objZ = uVar.z();
        if (objZ != null) {
            return objZ;
        }
        float fC = uVar.C();
        return !Float.isNaN(fC) ? uVar.s(fC, uVar.y()) : uVar.y();
    }

    private final T r(float f10, T t10, float f11) {
        w5<T> w5VarU = u();
        float fC = w5VarU.c(t10);
        float fFloatValue = this.f25097b.invoke().floatValue();
        if (fC == f10) {
            return t10;
        }
        if (!Float.isNaN(fC)) {
            if (fC < f10) {
                int i10 = 0 >> 1;
                if (f11 >= fFloatValue) {
                    T tA = w5VarU.a(f10, true);
                    Intrinsics.checkNotNull(tA);
                    return tA;
                }
                T tA2 = w5VarU.a(f10, true);
                Intrinsics.checkNotNull(tA2);
                if (f10 >= Math.abs(fC + Math.abs(this.f25096a.invoke(Float.valueOf(Math.abs(w5VarU.c(tA2) - fC))).floatValue()))) {
                    return tA2;
                }
            } else {
                if (f11 <= (-fFloatValue)) {
                    T tA3 = w5VarU.a(f10, false);
                    Intrinsics.checkNotNull(tA3);
                    return tA3;
                }
                T tA4 = w5VarU.a(f10, false);
                Intrinsics.checkNotNull(tA4);
                float fAbs = Math.abs(fC - Math.abs(this.f25096a.invoke(Float.valueOf(Math.abs(fC - w5VarU.c(tA4)))).floatValue()));
                int i11 = 5 << 0;
                if (f10 >= 0.0f ? f10 <= fAbs : Math.abs(f10) >= fAbs) {
                    return tA4;
                }
            }
        }
        return t10;
    }

    private final T s(float f10, T t10) {
        w5<T> w5VarU = u();
        float fC = w5VarU.c(t10);
        if (fC != f10 && !Float.isNaN(fC)) {
            if (fC < f10) {
                T tA = w5VarU.a(f10, true);
                if (tA != null) {
                    return tA;
                }
            } else {
                T tA2 = w5VarU.a(f10, false);
                if (tA2 != null) {
                    return tA2;
                }
            }
        }
        return t10;
    }

    private final T z() {
        return this.f25108m.getValue();
    }

    @NotNull
    public final androidx.compose.foundation.gestures.a3 A() {
        return this.f25101f;
    }

    public final float B() {
        return this.f25107l.V0();
    }

    public final float C() {
        return this.f25105j.V0();
    }

    @NotNull
    public final Function1<Float, Float> D() {
        return this.f25096a;
    }

    @androidx.annotation.x(from = 0.0d, to = 1.0d)
    public final float E() {
        return ((Number) this.f25106k.getValue()).floatValue();
    }

    public final T F() {
        return (T) this.f25103h.getValue();
    }

    @NotNull
    public final Function0<Float> G() {
        return this.f25097b;
    }

    public final boolean H() {
        return z() != null;
    }

    public final float I(float f10) {
        return kotlin.ranges.r.H((Float.isNaN(C()) ? 0.0f : C()) + f10, u().e(), u().f());
    }

    public final float K() {
        if (Float.isNaN(C())) {
            throw new IllegalStateException("The offset was read before being initialized. Did you access the offset in a phase before layout, like effects or composition?");
        }
        return C();
    }

    @Nullable
    public final Object Q(float f10, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        T tY = y();
        T tR = r(K(), tY, f10);
        if (this.f25099d.invoke(tR).booleanValue()) {
            Object objF = k.f(this, tR, f10, dVar);
            return objF == kotlin.coroutines.intrinsics.b.l() ? objF : Unit.f312394a;
        }
        Object objF2 = k.f(this, tY, f10, dVar);
        return objF2 == kotlin.coroutines.intrinsics.b.l() ? objF2 : Unit.f312394a;
    }

    public final void U(@NotNull w5<T> w5Var, T t10) {
        if (Intrinsics.areEqual(u(), w5Var)) {
            return;
        }
        L(w5Var);
        if (S(t10)) {
            return;
        }
        N(t10);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0016  */
    @Nullable
    public final Object m(@NotNull androidx.compose.foundation.q3 q3Var, @NotNull pj.n<? super i, ? super w5<T>, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> nVar, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        b bVar;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i10 = bVar.f25113c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f25113c = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new b(this, dVar);
            }
        } else {
            bVar = new b(this, dVar);
        }
        Object obj = bVar.f25111a;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = bVar.f25113c;
        try {
            if (i11 == 0) {
                ResultKt.m(obj);
                m9 m9Var = this.f25100e;
                c cVar = new c(this, nVar, null);
                bVar.f25113c = 1;
                if (m9Var.d(q3Var, cVar, bVar) == objL) {
                    return objL;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            T tB = u().b(C());
            if (tB != null && Math.abs(C() - u().c(tB)) <= 0.5f && this.f25099d.invoke(tB).booleanValue()) {
                M(tB);
            }
            return Unit.f312394a;
        } catch (Throwable th2) {
            T tB2 = u().b(C());
            if (tB2 != null && Math.abs(C() - u().c(tB2)) <= 0.5f && this.f25099d.invoke(tB2).booleanValue()) {
                M(tB2);
            }
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0014  */
    @Nullable
    public final Object n(T t10, @NotNull androidx.compose.foundation.q3 q3Var, @NotNull pj.o<? super i, ? super w5<T>, ? super T, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> oVar, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        d dVar2;
        if (dVar instanceof d) {
            dVar2 = (d) dVar;
            int i10 = dVar2.f25123c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar2.f25123c = i10 - Integer.MIN_VALUE;
            } else {
                dVar2 = new d(this, dVar);
            }
        } else {
            dVar2 = new d(this, dVar);
        }
        Object obj = dVar2.f25121a;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = dVar2.f25123c;
        try {
            if (i11 == 0) {
                ResultKt.m(obj);
                if (u().d(t10)) {
                    m9 m9Var = this.f25100e;
                    e eVar = new e(this, t10, oVar, null);
                    dVar2.f25123c = 1;
                    if (m9Var.d(q3Var, eVar, dVar2) == objL) {
                        return objL;
                    }
                } else {
                    M(t10);
                }
                return Unit.f312394a;
            }
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            N(null);
            T tB = u().b(C());
            if (tB != null && Math.abs(C() - u().c(tB)) <= 0.5f && this.f25099d.invoke(tB).booleanValue()) {
                M(tB);
            }
            return Unit.f312394a;
        } catch (Throwable th2) {
            N(null);
            T tB2 = u().b(C());
            if (tB2 != null && Math.abs(C() - u().c(tB2)) <= 0.5f && this.f25099d.invoke(tB2).booleanValue()) {
                M(tB2);
            }
            throw th2;
        }
    }

    public final float t(float f10) {
        float fI = I(f10);
        float fC = Float.isNaN(C()) ? 0.0f : C();
        P(fI);
        return fI - fC;
    }

    @NotNull
    public final w5<T> u() {
        return (w5) this.f25109n.getValue();
    }

    @NotNull
    public final androidx.compose.animation.core.o<Float> v() {
        return this.f25098c;
    }

    public final T w() {
        return (T) this.f25104i.getValue();
    }

    @NotNull
    public final Function1<T, Boolean> x() {
        return this.f25099d;
    }

    public final T y() {
        return this.f25102g.getValue();
    }

    public /* synthetic */ u(Object obj, Function1 function1, Function0 function0, androidx.compose.animation.core.o oVar, Function1 function2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, function1, function0, oVar, (i10 & 16) != 0 ? new Function1() { // from class: androidx.compose.material.p
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return Boolean.valueOf(u.g(obj2));
            }
        } : function2);
    }

    public /* synthetic */ u(Object obj, w5 w5Var, Function1 function1, Function0 function0, androidx.compose.animation.core.o oVar, Function1 function2, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, w5Var, function1, function0, oVar, (i10 & 32) != 0 ? new Function1() { // from class: androidx.compose.material.q
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return Boolean.valueOf(u.h(obj2));
            }
        } : function2);
    }

    @u7
    public u(T t10, @NotNull w5<T> w5Var, @NotNull Function1<? super Float, Float> function1, @NotNull Function0<Float> function0, @NotNull androidx.compose.animation.core.o<Float> oVar, @NotNull Function1<? super T, Boolean> function2) {
        this(t10, function1, function0, oVar, function2);
        L(w5Var);
        S(t10);
    }
}

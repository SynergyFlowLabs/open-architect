package androidx.compose.material3.internal;

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
@SourceDebugExtension({"SMAP\nAnchoredDraggable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnchoredDraggable.kt\nandroidx/compose/material3/internal/AnchoredDraggableState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n*L\n1#1,868:1\n85#2:869\n117#2,2:870\n85#2:872\n85#2:873\n85#2:877\n85#2:881\n117#2,2:882\n85#2:884\n117#2,2:885\n81#3:874\n114#3,2:875\n81#3:878\n114#3,2:879\n*S KotlinDebug\n*F\n+ 1 AnchoredDraggable.kt\nandroidx/compose/material3/internal/AnchoredDraggableState\n*L\n287#1:869\n287#1:870,2\n295#1:872\n310#1:873\n355#1:877\n374#1:881\n374#1:882,2\n376#1:884\n376#1:885,2\n328#1:874\n328#1:875,2\n371#1:878\n371#1:879,2\n*E\n"})
public final class d0<T> {

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    public static final a f28749p = new a(null);

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final int f28750q = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private final Function1<Float, Float> f28751a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private final Function0<Float> f28752b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final Function0<androidx.compose.animation.core.o<Float>> f28753c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final Function1<T, Boolean> f28754d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final s2 f28755e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private final androidx.compose.foundation.gestures.a3 f28756f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.n3 f28757g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final n7 f28758h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final n7 f28759i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.k3 f28760j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final n7 f28761k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.k3 f28762l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.n3 f28763m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.n3 f28764n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    private final r f28765o;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Object d(androidx.compose.runtime.saveable.g0 g0Var, d0 d0Var) {
            return d0Var.y();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final d0 e(Function1 function1, Function0 function0, Function0 function2, Function1 function3, Object obj) {
            return new d0(obj, function1, function0, function2, function3);
        }

        @NotNull
        public final <T> androidx.compose.runtime.saveable.c0<d0<T>, T> c(@NotNull final Function0<? extends androidx.compose.animation.core.o<Float>> function0, @NotNull final Function1<? super T, Boolean> function1, @NotNull final Function1<? super Float, Float> function2, @NotNull final Function0<Float> function3) {
            return androidx.compose.runtime.saveable.f0.e(new Function2() { // from class: androidx.compose.material3.internal.b0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return d0.a.d((androidx.compose.runtime.saveable.g0) obj, (d0) obj2);
                }
            }, new Function1() { // from class: androidx.compose.material3.internal.c0
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return d0.a.e(function2, function3, function0, function1, obj);
                }
            });
        }

        private a() {
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.internal.AnchoredDraggableState", f = "AnchoredDraggable.kt", i = {}, l = {517}, m = "anchoredDrag", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f28766a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ d0<T> f28767b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f28768c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(d0<T> d0Var, kotlin.coroutines.d<? super b> dVar) {
            super(dVar);
            this.f28767b = d0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f28766a = obj;
            this.f28768c |= Integer.MIN_VALUE;
            return this.f28767b.m(null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$2", f = "AnchoredDraggable.kt", i = {}, l = {518}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends kotlin.coroutines.jvm.internal.o implements Function1<kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f28769a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ d0<T> f28770b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ pj.n<r, b2<T>, kotlin.coroutines.d<? super Unit>, Object> f28771c;

        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$2$2", f = "AnchoredDraggable.kt", i = {}, l = {519}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<b2<T>, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f28772a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f28773b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ pj.n<r, b2<T>, kotlin.coroutines.d<? super Unit>, Object> f28774c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ d0<T> f28775d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(pj.n<? super r, ? super b2<T>, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> nVar, d0<T> d0Var, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f28774c = nVar;
                this.f28775d = d0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                a aVar = new a(this.f28774c, this.f28775d, dVar);
                aVar.f28773b = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f28772a;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    b2<T> b2Var = (b2) this.f28773b;
                    pj.n<r, b2<T>, kotlin.coroutines.d<? super Unit>, Object> nVar = this.f28774c;
                    r rVar = ((d0) this.f28775d).f28765o;
                    this.f28772a = 1;
                    if (nVar.invoke(rVar, b2Var, this) == objL) {
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
            public final Object invoke(b2<T> b2Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(b2Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c(d0<T> d0Var, pj.n<? super r, ? super b2<T>, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> nVar, kotlin.coroutines.d<? super c> dVar) {
            super(1, dVar);
            this.f28770b = d0Var;
            this.f28771c = nVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final b2 m(d0 d0Var) {
            return d0Var.u();
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
            return new c(this.f28770b, this.f28771c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f28769a;
            if (i10 == 0) {
                ResultKt.m(obj);
                final d0<T> d0Var = this.f28770b;
                Function0 function0 = new Function0() { // from class: androidx.compose.material3.internal.e0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return d0.c.m(d0Var);
                    }
                };
                a aVar = new a(this.f28771c, this.f28770b, null);
                this.f28769a = 1;
                if (t.j(function0, aVar, this) == objL) {
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

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.internal.AnchoredDraggableState", f = "AnchoredDraggable.kt", i = {}, l = {564}, m = "anchoredDrag", n = {}, s = {})
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f28776a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ d0<T> f28777b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f28778c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(d0<T> d0Var, kotlin.coroutines.d<? super d> dVar) {
            super(dVar);
            this.f28777b = d0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f28776a = obj;
            this.f28778c |= Integer.MIN_VALUE;
            return this.f28777b.n(null, null, null, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$4", f = "AnchoredDraggable.kt", i = {}, l = {566}, m = "invokeSuspend", n = {}, s = {})
    static final class e extends kotlin.coroutines.jvm.internal.o implements Function1<kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f28779a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ d0<T> f28780b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ T f28781c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ pj.o<r, b2<T>, T, kotlin.coroutines.d<? super Unit>, Object> f28782d;

        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.internal.AnchoredDraggableState$anchoredDrag$4$2", f = "AnchoredDraggable.kt", i = {}, l = {568}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<Pair<? extends b2<T>, ? extends T>, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f28783a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            /* synthetic */ Object f28784b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ pj.o<r, b2<T>, T, kotlin.coroutines.d<? super Unit>, Object> f28785c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ d0<T> f28786d;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(pj.o<? super r, ? super b2<T>, ? super T, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> oVar, d0<T> d0Var, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f28785c = oVar;
                this.f28786d = d0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                a aVar = new a(this.f28785c, this.f28786d, dVar);
                aVar.f28784b = obj;
                return aVar;
            }

            /*  JADX ERROR: JadxRuntimeException in pass: ModVisitor
                jadx.core.utils.exceptions.JadxRuntimeException: Can't change immutable type java.lang.Object to androidx.compose.material3.internal.d0$e$a for r6v4 'this'  java.lang.Object
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
                    r5 = 4
                    java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                    r5 = 7
                    int r1 = r6.f28783a
                    r2 = 1
                    if (r1 == 0) goto L1d
                    if (r1 != r2) goto L12
                    r5 = 1
                    kotlin.ResultKt.m(r7)
                    goto L46
                L12:
                    java.lang.IllegalStateException r6 = new java.lang.IllegalStateException
                    java.lang.String r7 = "b s/eocewoo it/e//ltkninoe// ime/sur/uvroef a hl ct"
                    java.lang.String r7 = "call to 'resume' before 'invoke' with coroutine"
                    r6.<init>(r7)
                    r5 = 7
                    throw r6
                L1d:
                    kotlin.ResultKt.m(r7)
                    java.lang.Object r7 = r6.f28784b
                    r5 = 1
                    kotlin.Pair r7 = (kotlin.Pair) r7
                    r5 = 3
                    java.lang.Object r1 = r7.component1()
                    r5 = 6
                    androidx.compose.material3.internal.b2 r1 = (androidx.compose.material3.internal.b2) r1
                    java.lang.Object r7 = r7.component2()
                    r5 = 5
                    pj.o<androidx.compose.material3.internal.r, androidx.compose.material3.internal.b2<T>, T, kotlin.coroutines.d<? super kotlin.Unit>, java.lang.Object> r3 = r6.f28785c
                    androidx.compose.material3.internal.d0<T> r4 = r6.f28786d
                    r5 = 7
                    androidx.compose.material3.internal.r r4 = androidx.compose.material3.internal.d0.i(r4)
                    r6.f28783a = r2
                    java.lang.Object r6 = r3.invoke(r4, r1, r7, r6)
                    r5 = 0
                    if (r6 != r0) goto L46
                    r5 = 2
                    return r0
                L46:
                    r5 = 2
                    kotlin.Unit r6 = kotlin.Unit.f312394a
                    r5 = 4
                    return r6
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.internal.d0.e.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // kotlin.jvm.functions.Function2
            /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
            public final Object invoke(Pair<? extends b2<T>, ? extends T> pair, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(pair, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(d0<T> d0Var, T t10, pj.o<? super r, ? super b2<T>, ? super T, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> oVar, kotlin.coroutines.d<? super e> dVar) {
            super(1, dVar);
            this.f28780b = d0Var;
            this.f28781c = t10;
            this.f28782d = oVar;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Pair m(d0 d0Var) {
            return TuplesKt.to(d0Var.u(), d0Var.F());
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
            return new e(this.f28780b, this.f28781c, this.f28782d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f28779a;
            if (i10 == 0) {
                ResultKt.m(obj);
                this.f28780b.N(this.f28781c);
                final d0<T> d0Var = this.f28780b;
                Function0 function0 = new Function0() { // from class: androidx.compose.material3.internal.f0
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return d0.e.m(d0Var);
                    }
                };
                a aVar = new a(this.f28782d, this.f28780b, null);
                this.f28779a = 1;
                if (t.j(function0, aVar, this) == objL) {
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

    public static final class f implements r {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ d0<T> f28787a;

        f(d0<T> d0Var) {
            this.f28787a = d0Var;
        }

        @Override // androidx.compose.material3.internal.r
        public void a(float f10, float f11) {
            this.f28787a.P(f10);
            this.f28787a.O(f11);
        }
    }

    public static final class g implements androidx.compose.foundation.gestures.a3 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final b f28788a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ d0<T> f28789b;

        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.internal.AnchoredDraggableState$draggableState$1$drag$2", f = "AnchoredDraggable.kt", i = {}, l = {277}, m = "invokeSuspend", n = {}, s = {})
        @SourceDebugExtension({"SMAP\nAnchoredDraggable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnchoredDraggable.kt\nandroidx/compose/material3/internal/AnchoredDraggableState$draggableState$1$drag$2\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,868:1\n1#2:869\n*E\n"})
        static final class a extends kotlin.coroutines.jvm.internal.o implements pj.n<r, b2<T>, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f28790a;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ Function2<androidx.compose.foundation.gestures.k2, kotlin.coroutines.d<? super Unit>, Object> f28792c;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            a(Function2<? super androidx.compose.foundation.gestures.k2, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, kotlin.coroutines.d<? super a> dVar) {
                super(3, dVar);
                this.f28792c = function2;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f28790a;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    b bVar = g.this.f28788a;
                    Function2<androidx.compose.foundation.gestures.k2, kotlin.coroutines.d<? super Unit>, Object> function2 = this.f28792c;
                    this.f28790a = 1;
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
            public final Object invoke(r rVar, b2<T> b2Var, kotlin.coroutines.d<? super Unit> dVar) {
                return g.this.new a(this.f28792c, dVar).invokeSuspend(Unit.f312394a);
            }
        }

        @SourceDebugExtension({"SMAP\nAnchoredDraggable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnchoredDraggable.kt\nandroidx/compose/material3/internal/AnchoredDraggableState$draggableState$1$dragScope$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,868:1\n1#2:869\n*E\n"})
        public static final class b implements androidx.compose.foundation.gestures.k2 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ d0<T> f28793a;

            b(d0<T> d0Var) {
                this.f28793a = d0Var;
            }

            @Override // androidx.compose.foundation.gestures.k2
            public void a(float f10) {
                r.b(((d0) this.f28793a).f28765o, this.f28793a.I(f10), 0.0f, 2, null);
            }
        }

        g(d0<T> d0Var) {
            this.f28789b = d0Var;
            this.f28788a = new b(d0Var);
        }

        @Override // androidx.compose.foundation.gestures.a3
        public Object a(androidx.compose.foundation.q3 q3Var, Function2<? super androidx.compose.foundation.gestures.k2, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, kotlin.coroutines.d<? super Unit> dVar) {
            Object objM = this.f28789b.m(q3Var, new a(function2, null), dVar);
            return objM == kotlin.coroutines.intrinsics.b.l() ? objM : Unit.f312394a;
        }

        @Override // androidx.compose.foundation.gestures.a3
        public void b(float f10) {
            this.f28789b.t(f10);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public d0(T t10, @NotNull Function1<? super Float, Float> function1, @NotNull Function0<Float> function0, @NotNull Function0<? extends androidx.compose.animation.core.o<Float>> function2, @NotNull Function1<? super T, Boolean> function3) {
        this.f28751a = function1;
        this.f28752b = function0;
        this.f28753c = function2;
        this.f28754d = function3;
        this.f28755e = new s2();
        this.f28756f = new g(this);
        this.f28757g = d7.g(t10, null, 2, null);
        this.f28758h = w6.e(new Function0() { // from class: androidx.compose.material3.internal.x
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return d0.R(this.f29221a);
            }
        });
        this.f28759i = w6.e(new Function0() { // from class: androidx.compose.material3.internal.y
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return d0.q(this.f29239a);
            }
        });
        this.f28760j = androidx.compose.runtime.g4.b(Float.NaN);
        this.f28761k = w6.d(w6.z(), new Function0() { // from class: androidx.compose.material3.internal.z
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return Float.valueOf(d0.J(this.f29254a));
            }
        });
        this.f28762l = androidx.compose.runtime.g4.b(0.0f);
        this.f28763m = d7.g(null, null, 2, null);
        this.f28764n = d7.g(t.i(), null, 2, null);
        this.f28765o = new f(this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final float J(d0 d0Var) {
        float fC = d0Var.u().c(d0Var.y());
        float fC2 = d0Var.u().c(d0Var.w()) - fC;
        float fAbs = Math.abs(fC2);
        if (Float.isNaN(fAbs) || fAbs <= 1.0E-6f) {
            return 1.0f;
        }
        float fK = (d0Var.K() - fC) / fC2;
        if (fK < 1.0E-6f) {
            return 0.0f;
        }
        if (fK > 0.999999f) {
            return 1.0f;
        }
        return fK;
    }

    private final void L(b2<T> b2Var) {
        this.f28764n.setValue(b2Var);
    }

    private final void M(T t10) {
        this.f28757g.setValue(t10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void N(T t10) {
        this.f28763m.setValue(t10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void O(float f10) {
        this.f28762l.q(f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void P(float f10) {
        this.f28760j.q(f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object R(d0 d0Var) {
        Object objZ = d0Var.z();
        if (objZ != null) {
            return objZ;
        }
        float fC = d0Var.C();
        return !Float.isNaN(fC) ? d0Var.r(fC, d0Var.y(), 0.0f) : d0Var.y();
    }

    private final boolean S(final T t10) {
        return this.f28755e.h(new Function0() { // from class: androidx.compose.material3.internal.a0
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return d0.T(this.f28637a, t10);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Unit T(d0 d0Var, Object obj) {
        r rVar = d0Var.f28765o;
        float fC = d0Var.u().c(obj);
        if (!Float.isNaN(fC)) {
            r.b(rVar, fC, 0.0f, 2, null);
            d0Var.N(null);
        }
        d0Var.M(obj);
        return Unit.f312394a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void V(d0 d0Var, b2 b2Var, Object obj, int i10, Object obj2) {
        if ((i10 & 2) != 0 && (Float.isNaN(d0Var.C()) || (obj = b2Var.b(d0Var.C())) == null)) {
            obj = d0Var.F();
        }
        d0Var.U(b2Var, obj);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean g(Object obj) {
        return true;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean h(Object obj) {
        return true;
    }

    public static /* synthetic */ Object o(d0 d0Var, androidx.compose.foundation.q3 q3Var, pj.n nVar, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            q3Var = androidx.compose.foundation.q3.Default;
        }
        return d0Var.m(q3Var, nVar, dVar);
    }

    public static /* synthetic */ Object p(d0 d0Var, Object obj, androidx.compose.foundation.q3 q3Var, pj.o oVar, kotlin.coroutines.d dVar, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            q3Var = androidx.compose.foundation.q3.Default;
        }
        return d0Var.n(obj, q3Var, oVar, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Multi-variable type inference failed */
    public static final Object q(d0 d0Var) {
        Object objZ = d0Var.z();
        if (objZ != null) {
            return objZ;
        }
        float fC = d0Var.C();
        return !Float.isNaN(fC) ? d0Var.s(fC, d0Var.y()) : d0Var.y();
    }

    private final T r(float f10, T t10, float f11) {
        b2<T> b2VarU = u();
        float fC = b2VarU.c(t10);
        float fFloatValue = this.f28752b.invoke().floatValue();
        if (fC != f10 && !Float.isNaN(fC)) {
            if (fC < f10) {
                if (f11 >= fFloatValue) {
                    T tA = b2VarU.a(f10, true);
                    Intrinsics.checkNotNull(tA);
                    return tA;
                }
                T tA2 = b2VarU.a(f10, true);
                Intrinsics.checkNotNull(tA2);
                if (f10 >= Math.abs(fC + Math.abs(this.f28751a.invoke(Float.valueOf(Math.abs(b2VarU.c(tA2) - fC))).floatValue()))) {
                    return tA2;
                }
            } else {
                if (f11 <= (-fFloatValue)) {
                    T tA3 = b2VarU.a(f10, false);
                    Intrinsics.checkNotNull(tA3);
                    return tA3;
                }
                T tA4 = b2VarU.a(f10, false);
                Intrinsics.checkNotNull(tA4);
                float fAbs = Math.abs(fC - Math.abs(this.f28751a.invoke(Float.valueOf(Math.abs(fC - b2VarU.c(tA4)))).floatValue()));
                if (f10 >= 0.0f ? f10 <= fAbs : Math.abs(f10) >= fAbs) {
                    return tA4;
                }
            }
        }
        return t10;
    }

    private final T s(float f10, T t10) {
        b2<T> b2VarU = u();
        float fC = b2VarU.c(t10);
        if (fC != f10 && !Float.isNaN(fC)) {
            if (fC < f10) {
                T tA = b2VarU.a(f10, true);
                if (tA != null) {
                    return tA;
                }
            } else {
                T tA2 = b2VarU.a(f10, false);
                if (tA2 != null) {
                    return tA2;
                }
            }
        }
        return t10;
    }

    private final T z() {
        return this.f28763m.getValue();
    }

    @NotNull
    public final androidx.compose.foundation.gestures.a3 A() {
        return this.f28756f;
    }

    public final float B() {
        return this.f28762l.V0();
    }

    public final float C() {
        return this.f28760j.V0();
    }

    @NotNull
    public final Function1<Float, Float> D() {
        return this.f28751a;
    }

    @androidx.annotation.x(from = 0.0d, to = 1.0d)
    public final float E() {
        return ((Number) this.f28761k.getValue()).floatValue();
    }

    public final T F() {
        return (T) this.f28758h.getValue();
    }

    @NotNull
    public final Function0<Float> G() {
        return this.f28752b;
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
        if (this.f28754d.invoke(tR).booleanValue()) {
            Object objF = t.f(this, tR, f10, dVar);
            return objF == kotlin.coroutines.intrinsics.b.l() ? objF : Unit.f312394a;
        }
        Object objF2 = t.f(this, tY, f10, dVar);
        return objF2 == kotlin.coroutines.intrinsics.b.l() ? objF2 : Unit.f312394a;
    }

    public final void U(@NotNull b2<T> b2Var, T t10) {
        if (Intrinsics.areEqual(u(), b2Var)) {
            return;
        }
        L(b2Var);
        if (S(t10)) {
            return;
        }
        N(t10);
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0018  */
    @Nullable
    public final Object m(@NotNull androidx.compose.foundation.q3 q3Var, @NotNull pj.n<? super r, ? super b2<T>, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> nVar, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        b bVar;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i10 = bVar.f28768c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f28768c = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new b(this, dVar);
            }
        } else {
            bVar = new b(this, dVar);
        }
        Object obj = bVar.f28766a;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = bVar.f28768c;
        try {
            if (i11 == 0) {
                ResultKt.m(obj);
                s2 s2Var = this.f28755e;
                c cVar = new c(this, nVar, null);
                bVar.f28768c = 1;
                if (s2Var.d(q3Var, cVar, bVar) == objL) {
                    return objL;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            T tB = u().b(C());
            if (tB != null && Math.abs(C() - u().c(tB)) <= 0.5f && this.f28754d.invoke(tB).booleanValue()) {
                M(tB);
            }
            return Unit.f312394a;
        } catch (Throwable th2) {
            T tB2 = u().b(C());
            if (tB2 != null && Math.abs(C() - u().c(tB2)) <= 0.5f && this.f28754d.invoke(tB2).booleanValue()) {
                M(tB2);
            }
            throw th2;
        }
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    @Nullable
    public final Object n(T t10, @NotNull androidx.compose.foundation.q3 q3Var, @NotNull pj.o<? super r, ? super b2<T>, ? super T, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> oVar, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        d dVar2;
        if (dVar instanceof d) {
            dVar2 = (d) dVar;
            int i10 = dVar2.f28778c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar2.f28778c = i10 - Integer.MIN_VALUE;
            } else {
                dVar2 = new d(this, dVar);
            }
        } else {
            dVar2 = new d(this, dVar);
        }
        Object obj = dVar2.f28776a;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = dVar2.f28778c;
        try {
            if (i11 == 0) {
                ResultKt.m(obj);
                if (u().d(t10)) {
                    s2 s2Var = this.f28755e;
                    e eVar = new e(this, t10, oVar, null);
                    dVar2.f28778c = 1;
                    if (s2Var.d(q3Var, eVar, dVar2) == objL) {
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
            if (tB != null && Math.abs(C() - u().c(tB)) <= 0.5f && this.f28754d.invoke(tB).booleanValue()) {
                M(tB);
            }
            return Unit.f312394a;
        } catch (Throwable th2) {
            N(null);
            T tB2 = u().b(C());
            if (tB2 != null && Math.abs(C() - u().c(tB2)) <= 0.5f && this.f28754d.invoke(tB2).booleanValue()) {
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
    public final b2<T> u() {
        return (b2) this.f28764n.getValue();
    }

    @NotNull
    public final Function0<androidx.compose.animation.core.o<Float>> v() {
        return this.f28753c;
    }

    public final T w() {
        return (T) this.f28759i.getValue();
    }

    @NotNull
    public final Function1<T, Boolean> x() {
        return this.f28754d;
    }

    public final T y() {
        return this.f28757g.getValue();
    }

    public /* synthetic */ d0(Object obj, Function1 function1, Function0 function0, Function0 function2, Function1 function3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, function1, function0, function2, (i10 & 16) != 0 ? new Function1() { // from class: androidx.compose.material3.internal.v
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return Boolean.valueOf(d0.g(obj2));
            }
        } : function3);
    }

    public /* synthetic */ d0(Object obj, b2 b2Var, Function1 function1, Function0 function0, Function0 function2, Function1 function3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, b2Var, function1, function0, function2, (i10 & 32) != 0 ? new Function1() { // from class: androidx.compose.material3.internal.w
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj2) {
                return Boolean.valueOf(d0.h(obj2));
            }
        } : function3);
    }

    public d0(T t10, @NotNull b2<T> b2Var, @NotNull Function1<? super Float, Float> function1, @NotNull Function0<Float> function0, @NotNull Function0<? extends androidx.compose.animation.core.o<Float>> function2, @NotNull Function1<? super T, Boolean> function3) {
        this(t10, function1, function0, function2, function3);
        L(b2Var);
        S(t10);
    }
}

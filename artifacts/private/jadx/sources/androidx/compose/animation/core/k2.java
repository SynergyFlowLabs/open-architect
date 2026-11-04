package androidx.compose.animation.core;

import androidx.compose.runtime.d7;
import java.util.concurrent.CancellationException;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.ranges.IntRange;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/SeekableTransitionState\n+ 2 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 3 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n+ 4 VectorConverters.kt\nandroidx/compose/animation/core/VectorConvertersKt\n+ 5 Preconditions.kt\nandroidx/compose/animation/core/PreconditionsKt\n+ 6 CancellableContinuation.kt\nkotlinx/coroutines/CancellableContinuationKt\n+ 7 ObjectList.kt\nandroidx/collection/MutableObjectList\n+ 8 ObjectList.kt\nandroidx/collection/ObjectList\n*L\n1#1,2168:1\n85#2:2169\n117#2,2:2170\n85#2:2172\n117#2,2:2173\n81#3:2175\n114#3,2:2176\n71#4:2178\n34#5,4:2179\n53#5,4:2207\n318#6,11:2183\n318#6,11:2194\n919#7,2:2205\n943#7,4:2217\n947#7,8:2222\n287#8,6:2211\n84#8:2221\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/SeekableTransitionState\n*L\n219#1:2169\n219#1:2170,2\n222#1:2172\n222#1:2173,2\n251#1:2175\n251#1:2176,2\n414#1:2178\n483#1:2179,4\n680#1:2207,4\n524#1:2183,11\n545#1:2194,11\n574#1:2205,2\n308#1:2217,4\n308#1:2222,8\n301#1:2211,6\n308#1:2221\n*E\n"})
public final class k2<S> extends x3<S> {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private static final a f13059s = new a(null);

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f13060t = 8;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    private static final s f13061u = new s(0.0f);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @NotNull
    private static final s f13062v = new s(1.0f);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.n3 f13063c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.n3 f13064d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private S f13065e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private l3<S> f13066f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f13067g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final Function0<Unit> f13068h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.k3 f13069i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @Nullable
    private kotlinx.coroutines.n<? super S> f13070j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final kotlinx.coroutines.sync.a f13071k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private final a2 f13072l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private long f13073m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private final androidx.collection.g2<b> f13074n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @Nullable
    private b f13075o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    private final Function1<Long, Unit> f13076p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private float f13077q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    private final Function1<Long, Unit> f13078r;

    private static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final s a() {
            return k2.f13062v;
        }

        @NotNull
        public final s b() {
            return k2.f13061u;
        }

        private a() {
        }
    }

    @androidx.compose.runtime.internal.w0(parameters = 0)
    public static final class b {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f13079i = 8;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f13080a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        @Nullable
        private u4<s> f13081b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f13082c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private float f13083d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        @NotNull
        private s f13084e = new s(0.0f);

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        @Nullable
        private s f13085f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private long f13086g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private long f13087h;

        @Nullable
        public final u4<s> a() {
            return this.f13081b;
        }

        public final long b() {
            return this.f13087h;
        }

        public final long c() {
            return this.f13086g;
        }

        @Nullable
        public final s d() {
            return this.f13085f;
        }

        public final long e() {
            return this.f13080a;
        }

        @NotNull
        public final s f() {
            return this.f13084e;
        }

        public final float g() {
            return this.f13083d;
        }

        public final boolean h() {
            return this.f13082c;
        }

        public final void i(@Nullable u4<s> u4Var) {
            this.f13081b = u4Var;
        }

        public final void j(long j10) {
            this.f13087h = j10;
        }

        public final void k(boolean z10) {
            this.f13082c = z10;
        }

        public final void l(long j10) {
            this.f13086g = j10;
        }

        public final void m(@Nullable s sVar) {
            this.f13085f = sVar;
        }

        public final void n(long j10) {
            this.f13080a = j10;
        }

        public final void o(@NotNull s sVar) {
            this.f13084e = sVar;
        }

        public final void p(float f10) {
            this.f13083d = f10;
        }

        @NotNull
        public String toString() {
            return "progress nanos: " + this.f13080a + ", animationSpec: " + this.f13081b + ", isComplete: " + this.f13082c + ", value: " + this.f13083d + ", start: " + this.f13084e + ", initialVelocity: " + this.f13085f + ", durationNanos: " + this.f13086g + ", animationSpecDuration: " + this.f13087h;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.animation.core.SeekableTransitionState$animateTo$2", f = "Transition.kt", i = {}, l = {600}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends kotlin.coroutines.jvm.internal.o implements Function1<kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f13088a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ l3<S> f13089b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ k2<S> f13090c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ S f13091d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ y0<Float> f13092e;

        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.animation.core.SeekableTransitionState$animateTo$2$1", f = "Transition.kt", i = {0}, l = {2173, 613, 615, 669, 671}, m = "invokeSuspend", n = {"$this$withLock_u24default$iv"}, s = {"L$0"})
        @SourceDebugExtension({"SMAP\nTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/SeekableTransitionState$animateTo$2$1\n+ 2 Mutex.kt\nkotlinx/coroutines/sync/MutexKt\n*L\n1#1,2168:1\n116#2,10:2169\n*S KotlinDebug\n*F\n+ 1 Transition.kt\nandroidx/compose/animation/core/SeekableTransitionState$animateTo$2$1\n*L\n611#1:2169,10\n*E\n"})
        static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            Object f13093a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            Object f13094b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            int f13095c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ k2<S> f13096d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ S f13097e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ l3<S> f13098f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ y0<Float> f13099g;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(k2<S> k2Var, S s10, l3<S> l3Var, y0<Float> y0Var, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f13096d = k2Var;
                this.f13097e = s10;
                this.f13098f = l3Var;
                this.f13099g = y0Var;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new a(this.f13096d, this.f13097e, this.f13098f, this.f13099g, dVar);
            }

            /* JADX WARN: Code duplicated, block: B:32:0x00bd  */
            /* JADX WARN: Code duplicated, block: B:34:0x00cb  */
            /* JADX WARN: Code duplicated, block: B:36:0x00d7  */
            /* JADX WARN: Code duplicated, block: B:38:0x00e1  */
            /* JADX WARN: Code duplicated, block: B:39:0x00ec  */
            /* JADX WARN: Code duplicated, block: B:41:0x00ef  */
            /* JADX WARN: Code duplicated, block: B:43:0x00f9 A[DONT_INVERT] */
            /* JADX WARN: Code duplicated, block: B:44:0x00fb  */
            /* JADX WARN: Code duplicated, block: B:45:0x0102  */
            /* JADX WARN: Code duplicated, block: B:47:0x0106  */
            /* JADX WARN: Code duplicated, block: B:49:0x011c  */
            /* JADX WARN: Code duplicated, block: B:51:0x012d  */
            /* JADX WARN: Code duplicated, block: B:52:0x012f  */
            /* JADX WARN: Code duplicated, block: B:62:0x0163  */
            /* JADX WARN: Code duplicated, block: B:64:0x016d  */
            /* JADX WARN: Code duplicated, block: B:67:0x01a0  */
            /* JADX WARN: Code duplicated, block: B:68:0x01b1  */
            /* JADX WARN: Code duplicated, block: B:73:0x01e0  */
            /* JADX WARN: Code restructure failed: missing block: B:74:0x01ef, code lost:
            
                if (r2.b0(r18) == r1) goto L75;
             */
            @Override // kotlin.coroutines.jvm.internal.a
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct add '--show-bad-code' argument
            */
            public final java.lang.Object invokeSuspend(java.lang.Object r19) {
                /*
                    Method dump skipped, instruction units count: 511
                    To view this dump add '--comments-level debug' option
                */
                throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.k2.c.a.invokeSuspend(java.lang.Object):java.lang.Object");
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(l3<S> l3Var, k2<S> k2Var, S s10, y0<Float> y0Var, kotlin.coroutines.d<? super c> dVar) {
            super(1, dVar);
            this.f13089b = l3Var;
            this.f13090c = k2Var;
            this.f13091d = s10;
            this.f13092e = y0Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
            return new c(this.f13089b, this.f13090c, this.f13091d, this.f13092e, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f13088a;
            if (i10 == 0) {
                ResultKt.m(obj);
                a aVar = new a(this.f13090c, this.f13091d, this.f13089b, this.f13092e, null);
                this.f13088a = 1;
                if (kotlinx.coroutines.t0.g(aVar, this) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            this.f13089b.J();
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.animation.core.SeekableTransitionState", f = "Transition.kt", i = {}, l = {354, 357}, m = "runAnimations", n = {}, s = {})
    static final class d extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f13100a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ k2<S> f13101b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f13102c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(k2<S> k2Var, kotlin.coroutines.d<? super d> dVar) {
            super(dVar);
            this.f13101b = k2Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f13100a = obj;
            this.f13102c |= Integer.MIN_VALUE;
            return this.f13101b.S(this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.animation.core.SeekableTransitionState$seekTo$3", f = "Transition.kt", i = {}, l = {489}, m = "invokeSuspend", n = {}, s = {})
    static final class e extends kotlin.coroutines.jvm.internal.o implements Function1<kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f13103a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ S f13104b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ S f13105c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ k2<S> f13106d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ l3<S> f13107e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ float f13108f;

        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.animation.core.SeekableTransitionState$seekTo$3$1", f = "Transition.kt", i = {}, l = {511}, m = "invokeSuspend", n = {}, s = {})
        static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f13109a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            private /* synthetic */ Object f13110b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ S f13111c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ S f13112d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ k2<S> f13113e;

            /* JADX INFO: renamed from: f, reason: collision with root package name */
            final /* synthetic */ l3<S> f13114f;

            /* JADX INFO: renamed from: g, reason: collision with root package name */
            final /* synthetic */ float f13115g;

            /* JADX INFO: renamed from: androidx.compose.animation.core.k2$e$a$a, reason: collision with other inner class name */
            @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.animation.core.SeekableTransitionState$seekTo$3$1$1", f = "Transition.kt", i = {}, l = {androidx.constraintlayout.core.motion.utils.v.g.f44095o}, m = "invokeSuspend", n = {}, s = {})
            static final class C0059a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                int f13116a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ k2<S> f13117b;

                /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
                C0059a(k2<S> k2Var, kotlin.coroutines.d<? super C0059a> dVar) {
                    super(2, dVar);
                    this.f13117b = k2Var;
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                    return new C0059a(this.f13117b, dVar);
                }

                @Override // kotlin.coroutines.jvm.internal.a
                public final Object invokeSuspend(Object obj) {
                    Object objL = kotlin.coroutines.intrinsics.b.l();
                    int i10 = this.f13116a;
                    if (i10 == 0) {
                        ResultKt.m(obj);
                        k2<S> k2Var = this.f13117b;
                        this.f13116a = 1;
                        if (k2Var.S(this) == objL) {
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
                public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                    return ((C0059a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
                }
            }

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            a(S s10, S s11, k2<S> k2Var, l3<S> l3Var, float f10, kotlin.coroutines.d<? super a> dVar) {
                super(2, dVar);
                this.f13111c = s10;
                this.f13112d = s11;
                this.f13113e = k2Var;
                this.f13114f = l3Var;
                this.f13115g = f10;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                a aVar = new a(this.f13111c, this.f13112d, this.f13113e, this.f13114f, this.f13115g, dVar);
                aVar.f13110b = obj;
                return aVar;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f13109a;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    kotlinx.coroutines.s0 s0Var = (kotlinx.coroutines.s0) this.f13110b;
                    if (Intrinsics.areEqual(this.f13111c, this.f13112d)) {
                        ((k2) this.f13113e).f13075o = null;
                        if (Intrinsics.areEqual(this.f13113e.a(), this.f13111c)) {
                            return Unit.f312394a;
                        }
                    } else {
                        this.f13113e.N();
                    }
                    if (!Intrinsics.areEqual(this.f13111c, this.f13112d)) {
                        this.f13114f.c0(this.f13111c);
                        this.f13114f.T(0L);
                        this.f13113e.f(this.f13111c);
                        this.f13114f.O(this.f13115g);
                    }
                    this.f13113e.Y(this.f13115g);
                    if (((k2) this.f13113e).f13074n.I()) {
                        int i11 = 3 << 0;
                        kotlinx.coroutines.k.f(s0Var, null, null, new C0059a(this.f13113e, null), 3, null);
                    } else {
                        ((k2) this.f13113e).f13073m = Long.MIN_VALUE;
                    }
                    k2<S> k2Var = this.f13113e;
                    this.f13109a = 1;
                    if (k2Var.c0(this) == objL) {
                        return objL;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.m(obj);
                }
                this.f13113e.V();
                return Unit.f312394a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(S s10, S s11, k2<S> k2Var, l3<S> l3Var, float f10, kotlin.coroutines.d<? super e> dVar) {
            super(1, dVar);
            this.f13104b = s10;
            this.f13105c = s11;
            this.f13106d = k2Var;
            this.f13107e = l3Var;
            this.f13108f = f10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
            return new e(this.f13104b, this.f13105c, this.f13106d, this.f13107e, this.f13108f, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f13103a;
            if (i10 == 0) {
                ResultKt.m(obj);
                a aVar = new a(this.f13104b, this.f13105c, this.f13106d, this.f13107e, this.f13108f, null);
                this.f13103a = 1;
                if (kotlinx.coroutines.t0.g(aVar, this) == objL) {
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

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.animation.core.SeekableTransitionState$snapTo$2", f = "Transition.kt", i = {}, l = {com.facebook.internal.p.f100032p}, m = "invokeSuspend", n = {}, s = {})
    static final class f extends kotlin.coroutines.jvm.internal.o implements Function1<kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f13118a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ k2<S> f13119b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ S f13120c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ l3<S> f13121d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(k2<S> k2Var, S s10, l3<S> l3Var, kotlin.coroutines.d<? super f> dVar) {
            super(1, dVar);
            this.f13119b = k2Var;
            this.f13120c = s10;
            this.f13121d = l3Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(kotlin.coroutines.d<?> dVar) {
            return new f(this.f13119b, this.f13120c, this.f13121d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            float f10;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f13118a;
            if (i10 == 0) {
                ResultKt.m(obj);
                this.f13119b.G();
                ((k2) this.f13119b).f13073m = Long.MIN_VALUE;
                this.f13119b.Y(0.0f);
                S s10 = this.f13120c;
                if (Intrinsics.areEqual(s10, this.f13119b.a())) {
                    f10 = -4.0f;
                } else {
                    f10 = Intrinsics.areEqual(s10, this.f13119b.b()) ? -5.0f : -3.0f;
                }
                this.f13121d.c0(this.f13120c);
                this.f13121d.T(0L);
                this.f13119b.f(this.f13120c);
                this.f13119b.Y(0.0f);
                this.f13119b.d(this.f13120c);
                this.f13121d.O(f10);
                if (f10 == -3.0f) {
                    k2<S> k2Var = this.f13119b;
                    this.f13118a = 1;
                    if (k2Var.c0(this) == objL) {
                        return objL;
                    }
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            this.f13121d.J();
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(kotlin.coroutines.d<? super Unit> dVar) {
            return ((f) create(dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.animation.core.SeekableTransitionState", f = "Transition.kt", i = {0, 1}, l = {544, 2169}, m = "waitForComposition", n = {"expectedState", "expectedState"}, s = {"L$0", "L$0"})
    static final class g extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f13122a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f13123b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ k2<S> f13124c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f13125d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(k2<S> k2Var, kotlin.coroutines.d<? super g> dVar) {
            super(dVar);
            this.f13124c = k2Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f13123b = obj;
            this.f13125d |= Integer.MIN_VALUE;
            return this.f13124c.b0(this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.animation.core.SeekableTransitionState", f = "Transition.kt", i = {0, 1}, l = {520, 2169}, m = "waitForCompositionAfterTargetStateChange", n = {"expectedState", "expectedState"}, s = {"L$0", "L$0"})
    static final class h extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f13126a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f13127b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ k2<S> f13128c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f13129d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        h(k2<S> k2Var, kotlin.coroutines.d<? super h> dVar) {
            super(dVar);
            this.f13128c = k2Var;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f13127b = obj;
            this.f13129d |= Integer.MIN_VALUE;
            return this.f13128c.c0(this);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public k2(S s10) {
        DefaultConstructorMarker defaultConstructorMarker = null;
        super(defaultConstructorMarker);
        this.f13063c = d7.g(s10, null, 2, null);
        this.f13064d = d7.g(s10, null, 2, null);
        this.f13065e = s10;
        this.f13068h = new Function0() { // from class: androidx.compose.animation.core.h2
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return k2.R(this.f12995a);
            }
        };
        int i10 = 5 ^ 0;
        this.f13069i = androidx.compose.runtime.g4.b(0.0f);
        this.f13071k = kotlinx.coroutines.sync.g.b(false, 1, null);
        this.f13072l = new a2();
        this.f13073m = Long.MIN_VALUE;
        this.f13074n = new androidx.collection.g2<>(0, 1, defaultConstructorMarker);
        this.f13076p = new Function1() { // from class: androidx.compose.animation.core.i2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return k2.H(this.f13029a, ((Long) obj).longValue());
            }
        };
        this.f13078r = new Function1() { // from class: androidx.compose.animation.core.j2
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return k2.C(this.f13050a, ((Long) obj).longValue());
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object B(kotlin.coroutines.d<? super Unit> dVar) {
        float fJ = f3.J(dVar.getContext());
        if (fJ <= 0.0f) {
            G();
            return Unit.f312394a;
        }
        this.f13077q = fJ;
        Object objF = androidx.compose.runtime.d3.f(this.f13078r, dVar);
        return objF == kotlin.coroutines.intrinsics.b.l() ? objF : Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit C(k2 k2Var, long j10) {
        long j11 = j10 - k2Var.f13073m;
        k2Var.f13073m = j10;
        long jM0 = kotlin.math.b.M0(j11 / ((double) k2Var.f13077q));
        if (k2Var.f13074n.I()) {
            androidx.collection.g2<b> g2Var = k2Var.f13074n;
            Object[] objArr = g2Var.f12449a;
            int i10 = g2Var.f12450b;
            int i11 = 0;
            int i12 = 6 | 0;
            for (int i13 = 0; i13 < i10; i13++) {
                b bVar = (b) objArr[i13];
                k2Var.Q(bVar, jM0);
                bVar.k(true);
            }
            l3<S> l3Var = k2Var.f13066f;
            if (l3Var != null) {
                l3Var.b0();
            }
            androidx.collection.g2<b> g2Var2 = k2Var.f13074n;
            int i14 = g2Var2.f12450b;
            Object[] objArr2 = g2Var2.f12449a;
            IntRange intRangeW1 = kotlin.ranges.r.W1(0, i14);
            int iL = intRangeW1.l();
            int iM = intRangeW1.m();
            if (iL <= iM) {
                while (true) {
                    objArr2[iL - i11] = objArr2[iL];
                    if (((b) objArr2[iL]).h()) {
                        i11++;
                    }
                    if (iL == iM) {
                        break;
                    }
                    iL++;
                }
            }
            ArraysKt.fill(objArr2, (Object) null, i14 - i11, i14);
            g2Var2.f12450b -= i11;
        }
        b bVar2 = k2Var.f13075o;
        if (bVar2 != null) {
            bVar2.l(k2Var.f13067g);
            k2Var.Q(bVar2, jM0);
            k2Var.Y(bVar2.g());
            if (bVar2.g() == 1.0f) {
                k2Var.f13075o = null;
            }
            k2Var.V();
        }
        return Unit.f312394a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object E(k2 k2Var, Object obj, y0 y0Var, kotlin.coroutines.d dVar, int i10, Object obj2) {
        if ((i10 & 1) != 0) {
            obj = k2Var.b();
        }
        if ((i10 & 2) != 0) {
            y0Var = null;
        }
        return k2Var.D(obj, y0Var, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Object F(kotlin.coroutines.d<? super Unit> dVar) {
        if (this.f13073m == Long.MIN_VALUE) {
            Object objF = androidx.compose.runtime.d3.f(this.f13076p, dVar);
            return objF == kotlin.coroutines.intrinsics.b.l() ? objF : Unit.f312394a;
        }
        Object objB = B(dVar);
        return objB == kotlin.coroutines.intrinsics.b.l() ? objB : Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void G() {
        l3<S> l3Var = this.f13066f;
        if (l3Var != null) {
            l3Var.n();
        }
        this.f13074n.l0();
        if (this.f13075o != null) {
            this.f13075o = null;
            Y(1.0f);
            V();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit H(k2 k2Var, long j10) {
        k2Var.f13073m = j10;
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void N() {
        l3<S> l3Var = this.f13066f;
        if (l3Var == null) {
            return;
        }
        b bVar = this.f13075o;
        if (bVar == null) {
            if (this.f13067g <= 0 || L() == 1.0f || Intrinsics.areEqual(a(), b())) {
                bVar = null;
            } else {
                bVar = new b();
                bVar.p(L());
                long j10 = this.f13067g;
                bVar.l(j10);
                bVar.j(kotlin.math.b.M0(j10 * (1.0d - ((double) L()))));
                bVar.f().e(0, L());
            }
        }
        if (bVar != null) {
            bVar.l(this.f13067g);
            this.f13074n.a0(bVar);
            l3Var.R(bVar);
        }
        this.f13075o = null;
    }

    private final void Q(b bVar, long j10) {
        long jE = bVar.e() + j10;
        bVar.n(jE);
        long jB = bVar.b();
        if (jE >= jB) {
            bVar.p(1.0f);
            return;
        }
        u4<s> u4VarA = bVar.a();
        if (u4VarA == null) {
            float f10 = jE / jB;
            bVar.p((bVar.f().a(0) * (1 - f10)) + (f10 * 1.0f));
            return;
        }
        s sVarF = bVar.f();
        s sVar = f13062v;
        s sVarD = bVar.d();
        if (sVarD == null) {
            sVarD = f13061u;
        }
        int i10 = 2 | 0;
        bVar.p(kotlin.ranges.r.H(((s) u4VarA.i(jE, sVarF, sVar, sVarD)).a(0), 0.0f, 1.0f));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit R(k2 k2Var) {
        l3<S> l3Var = k2Var.f13066f;
        k2Var.f13067g = l3Var != null ? l3Var.z() : 0L;
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object S(kotlin.coroutines.d<? super Unit> dVar) {
        d dVar2;
        if (dVar instanceof d) {
            dVar2 = (d) dVar;
            int i10 = dVar2.f13102c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar2.f13102c = i10 - Integer.MIN_VALUE;
            } else {
                dVar2 = new d(this, dVar);
            }
        } else {
            dVar2 = new d(this, dVar);
        }
        Object obj = dVar2.f13100a;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = dVar2.f13102c;
        if (i11 == 0) {
            ResultKt.m(obj);
            if (this.f13074n.H() && this.f13075o == null) {
                return Unit.f312394a;
            }
            if (f3.J(dVar2.getContext()) == 0.0f) {
                G();
                this.f13073m = Long.MIN_VALUE;
                return Unit.f312394a;
            }
            if (this.f13073m == Long.MIN_VALUE) {
                Function1<Long, Unit> function1 = this.f13076p;
                dVar2.f13102c = 1;
                if (androidx.compose.runtime.d3.f(function1, dVar2) == objL) {
                }
            }
            return objL;
        }
        if (i11 != 1 && i11 != 2) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        ResultKt.m(obj);
        do {
            if (!this.f13074n.I() && this.f13075o == null) {
                this.f13073m = Long.MIN_VALUE;
                return Unit.f312394a;
            }
            dVar2.f13102c = 2;
        } while (B(dVar2) != objL);
        return objL;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ Object U(k2 k2Var, float f10, Object obj, kotlin.coroutines.d dVar, int i10, Object obj2) {
        if ((i10 & 2) != 0) {
            obj = k2Var.b();
        }
        return k2Var.T(f10, obj, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void V() {
        l3<S> l3Var = this.f13066f;
        if (l3Var == null) {
            return;
        }
        l3Var.Q(kotlin.math.b.M0(((double) L()) * l3Var.z()));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void Y(float f10) {
        this.f13069i.q(f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:27:0x0095  */
    /* JADX WARN: Code duplicated, block: B:29:0x0098  */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object b0(kotlin.coroutines.d<? super Unit> dVar) {
        g gVar;
        Object objB;
        Object obj;
        if (dVar instanceof g) {
            gVar = (g) dVar;
            int i10 = gVar.f13125d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                gVar.f13125d = i10 - Integer.MIN_VALUE;
            } else {
                gVar = new g(this, dVar);
            }
        } else {
            gVar = new g(this, dVar);
        }
        Object obj2 = gVar.f13123b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = gVar.f13125d;
        int i12 = 3 << 0;
        if (i11 == 0) {
            ResultKt.m(obj2);
            objB = b();
            kotlinx.coroutines.sync.a aVar = this.f13071k;
            gVar.f13122a = objB;
            gVar.f13125d = 1;
            if (kotlinx.coroutines.sync.a.C2318a.b(aVar, null, gVar, 1, null) != objL) {
            }
            return objL;
        }
        if (i11 == 1) {
            Object obj3 = gVar.f13122a;
            ResultKt.m(obj2);
            objB = obj3;
        } else {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj = gVar.f13122a;
            ResultKt.m(obj2);
        }
        if (Intrinsics.areEqual(obj2, obj)) {
            return Unit.f312394a;
        }
        this.f13073m = Long.MIN_VALUE;
        throw new CancellationException("targetState while waiting for composition");
        gVar.f13122a = objB;
        gVar.f13125d = 2;
        kotlinx.coroutines.p pVar = new kotlinx.coroutines.p(kotlin.coroutines.intrinsics.b.e(gVar), 1);
        pVar.p0();
        X(pVar);
        kotlinx.coroutines.sync.a.C2318a.d(K(), null, 1, null);
        Object objU = pVar.u();
        if (objU == kotlin.coroutines.intrinsics.b.l()) {
            kotlin.coroutines.jvm.internal.h.c(gVar);
        }
        if (objU != objL) {
            obj = objB;
            obj2 = objU;
            if (Intrinsics.areEqual(obj2, obj)) {
                return Unit.f312394a;
            }
            this.f13073m = Long.MIN_VALUE;
            throw new CancellationException("targetState while waiting for composition");
        }
        return objL;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:33:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    /* JADX WARN: Instruction removed from duplicated block: B:33:0x00aa, please report this as an issue */
    public final Object c0(kotlin.coroutines.d<? super Unit> dVar) {
        h hVar;
        Object objB;
        Object obj;
        if (dVar instanceof h) {
            hVar = (h) dVar;
            int i10 = hVar.f13129d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                hVar.f13129d = i10 - Integer.MIN_VALUE;
            } else {
                hVar = new h(this, dVar);
            }
        } else {
            hVar = new h(this, dVar);
        }
        Object obj2 = hVar.f13127b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = hVar.f13129d;
        if (i11 == 0) {
            ResultKt.m(obj2);
            objB = b();
            kotlinx.coroutines.sync.a aVar = this.f13071k;
            hVar.f13126a = objB;
            hVar.f13129d = 1;
            if (kotlinx.coroutines.sync.a.C2318a.b(aVar, null, hVar, 1, null) != objL) {
            }
            return objL;
        }
        if (i11 == 1) {
            Object obj3 = hVar.f13126a;
            ResultKt.m(obj2);
            objB = obj3;
        } else {
            if (i11 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            obj = hVar.f13126a;
            ResultKt.m(obj2);
        }
        if (!Intrinsics.areEqual(obj2, obj)) {
            this.f13073m = Long.MIN_VALUE;
            throw new CancellationException("snapTo() was canceled because state was changed to " + obj2 + " instead of " + obj);
        }
        return Unit.f312394a;
        if (!Intrinsics.areEqual(objB, this.f13065e)) {
            hVar.f13126a = objB;
            hVar.f13129d = 2;
            kotlinx.coroutines.p pVar = new kotlinx.coroutines.p(kotlin.coroutines.intrinsics.b.e(hVar), 1);
            pVar.p0();
            X(pVar);
            kotlinx.coroutines.sync.a.C2318a.d(K(), null, 1, null);
            Object objU = pVar.u();
            if (objU == kotlin.coroutines.intrinsics.b.l()) {
                kotlin.coroutines.jvm.internal.h.c(hVar);
            }
            if (objU != objL) {
                obj = objB;
                obj2 = objU;
                if (!Intrinsics.areEqual(obj2, obj)) {
                    this.f13073m = Long.MIN_VALUE;
                    throw new CancellationException("snapTo() was canceled because state was changed to " + obj2 + " instead of " + obj);
                }
            }
            return objL;
        }
        kotlinx.coroutines.sync.a.C2318a.d(this.f13071k, null, 1, null);
        return Unit.f312394a;
    }

    @Nullable
    public final Object D(S s10, @Nullable y0<Float> y0Var, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objE;
        l3<S> l3Var = this.f13066f;
        return (l3Var != null && (objE = a2.e(this.f13072l, null, new c(l3Var, this, s10, y0Var, null), dVar, 1, null)) == kotlin.coroutines.intrinsics.b.l()) ? objE : Unit.f312394a;
    }

    public final S I() {
        return this.f13065e;
    }

    @Nullable
    public final kotlinx.coroutines.n<S> J() {
        return this.f13070j;
    }

    @NotNull
    public final kotlinx.coroutines.sync.a K() {
        return this.f13071k;
    }

    @androidx.annotation.x(from = 0.0d, to = 1.0d)
    public final float L() {
        return this.f13069i.V0();
    }

    public final long M() {
        return this.f13067g;
    }

    public final void O() {
        w3.F().m(this, w3.f13353b, this.f13068h);
    }

    public final void P() {
        long j10 = this.f13067g;
        O();
        long j11 = this.f13067g;
        if (j10 != j11) {
            b bVar = this.f13075o;
            if (bVar != null) {
                long jE = bVar.e();
                long j12 = this.f13067g;
                if (jE > j12) {
                    G();
                    return;
                }
                bVar.l(j12);
                if (bVar.a() == null) {
                    int i10 = 4 ^ 0;
                    bVar.j(kotlin.math.b.M0((1.0d - ((double) bVar.f().a(0))) * this.f13067g));
                }
            } else if (j11 != 0) {
                V();
            }
        }
    }

    @Nullable
    public final Object T(@androidx.annotation.x(from = 0.0d, to = 1.0d) float f10, S s10, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        boolean z10 = false;
        if (0.0f <= f10 && f10 <= 1.0f) {
            z10 = true;
        }
        if (!z10) {
            c2.d("Expecting fraction between 0 and 1. Got " + f10);
        }
        l3<S> l3Var = this.f13066f;
        if (l3Var == null) {
            return Unit.f312394a;
        }
        Object objE = a2.e(this.f13072l, null, new e(s10, b(), this, l3Var, f10, null), dVar, 1, null);
        return objE == kotlin.coroutines.intrinsics.b.l() ? objE : Unit.f312394a;
    }

    public final void W(S s10) {
        this.f13065e = s10;
    }

    public final void X(@Nullable kotlinx.coroutines.n<? super S> nVar) {
        this.f13070j = nVar;
    }

    public final void Z(long j10) {
        this.f13067g = j10;
    }

    @Override // androidx.compose.animation.core.x3
    public S a() {
        return (S) this.f13064d.getValue();
    }

    @Nullable
    public final Object a0(S s10, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objE;
        l3<S> l3Var = this.f13066f;
        if (l3Var == null) {
            return Unit.f312394a;
        }
        return (!(Intrinsics.areEqual(a(), s10) && Intrinsics.areEqual(b(), s10)) && (objE = a2.e(this.f13072l, null, new f(this, s10, l3Var, null), dVar, 1, null)) == kotlin.coroutines.intrinsics.b.l()) ? objE : Unit.f312394a;
    }

    @Override // androidx.compose.animation.core.x3
    public S b() {
        return (S) this.f13063c.getValue();
    }

    @Override // androidx.compose.animation.core.x3
    public void d(S s10) {
        this.f13064d.setValue(s10);
    }

    @Override // androidx.compose.animation.core.x3
    public void f(S s10) {
        this.f13063c.setValue(s10);
    }

    @Override // androidx.compose.animation.core.x3
    public void g(@NotNull l3<S> l3Var) {
        l3<S> l3Var2 = this.f13066f;
        if (!(l3Var2 == null || Intrinsics.areEqual(l3Var, l3Var2))) {
            c2.e("An instance of SeekableTransitionState has been used in different Transitions. Previous instance: " + this.f13066f + ", new instance: " + l3Var);
        }
        this.f13066f = l3Var;
    }

    @Override // androidx.compose.animation.core.x3
    public void h() {
        this.f13066f = null;
        w3.F().g(this);
    }
}

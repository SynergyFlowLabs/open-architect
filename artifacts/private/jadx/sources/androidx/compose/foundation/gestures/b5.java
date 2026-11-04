package androidx.compose.foundation.gestures;

import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nScrollable2D.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scrollable2D.kt\nandroidx/compose/foundation/gestures/ScrollingLogic2D\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 6 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,540:1\n30#2:541\n30#2:551\n30#2:555\n53#3,3:542\n60#3:547\n70#3:550\n53#3,3:552\n53#3,3:556\n1#4:545\n65#5:546\n69#5:549\n22#6:548\n*S KotlinDebug\n*F\n+ 1 Scrollable2D.kt\nandroidx/compose/foundation/gestures/ScrollingLogic2D\n*L\n361#1:541\n420#1:551\n422#1:555\n361#1:542,3\n412#1:547\n412#1:550\n420#1:552,3\n422#1:556,3\n412#1:546\n412#1:549\n412#1:548\n*E\n"})
final class b5 implements y3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private g4 f14385a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private androidx.compose.foundation.x3 f14386b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private c3 f14387c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private androidx.compose.ui.input.nestedscroll.b f14388d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final Function0<Boolean> f14389e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f14390f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f14391g = androidx.compose.ui.input.nestedscroll.f.f38949b.h();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private t3 f14392h = a4.f14327a;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final c f14393i = new c();

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final Function1<n0.g, n0.g> f14394j = new Function1() { // from class: androidx.compose.foundation.gestures.a5
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return b5.A(this.f14335a, (n0.g) obj);
        }
    };

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.ScrollingLogic2D", f = "Scrollable2D.kt", i = {0}, l = {444}, m = "doFlingAnimation-QWom1Mo", n = {"result"}, s = {"L$0"})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f14395a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f14396b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f14398d;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f14396b = obj;
            this.f14398d |= Integer.MIN_VALUE;
            return b5.this.a(0L, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.ScrollingLogic2D$doFlingAnimation$2", f = "Scrollable2D.kt", i = {}, l = {473}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<o3, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        long f14399a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f14400b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f14401c;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ long f14403e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.i1.g f14404f;

        public static final class a implements z3 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ b5 f14405a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ o3 f14406b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ long f14407c;

            a(b5 b5Var, o3 o3Var, long j10) {
                this.f14405a = b5Var;
                this.f14406b = o3Var;
                this.f14407c = j10;
            }

            @Override // androidx.compose.foundation.gestures.z3
            public float f(float f10) {
                boolean zE;
                long jU = b5.u(f10, this.f14407c);
                if (androidx.compose.foundation.s1.f18606k) {
                    zE = !((Boolean) this.f14405a.f14389e.invoke()).booleanValue();
                } else {
                    zE = this.f14405a.E(jU);
                }
                if (n0.g.l(jU, n0.g.f332700b.e()) || !zE) {
                    return b5.w(this.f14406b.a(jU, androidx.compose.ui.input.nestedscroll.f.f38949b.g()));
                }
                throw new d3();
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(long j10, kotlin.jvm.internal.i1.g gVar, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f14403e = j10;
            this.f14404f = gVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            b bVar = b5.this.new b(this.f14403e, this.f14404f, dVar);
            bVar.f14401c = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            long j10;
            kotlin.jvm.internal.i1.g gVar;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f14400b;
            if (i10 == 0) {
                ResultKt.m(obj);
                a aVar = new a(b5.this, (o3) this.f14401c, this.f14403e);
                b5 b5Var = b5.this;
                long j11 = this.f14403e;
                kotlin.jvm.internal.i1.g gVar2 = this.f14404f;
                c3 c3Var = b5Var.f14387c;
                float f10 = a4.f(j11);
                this.f14401c = gVar2;
                this.f14399a = j11;
                this.f14400b = 1;
                obj = c3Var.a(aVar, f10, this);
                if (obj == objL) {
                    return objL;
                }
                j10 = j11;
                gVar = gVar2;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j10 = this.f14399a;
                gVar = (kotlin.jvm.internal.i1.g) this.f14401c;
                ResultKt.m(obj);
            }
            gVar.f312750a = b5.v(((Number) obj).floatValue(), j10);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o3 o3Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(o3Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @SourceDebugExtension({"SMAP\nScrollable2D.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scrollable2D.kt\nandroidx/compose/foundation/gestures/ScrollingLogic2D$nestedScrollScope$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,540:1\n1#2:541\n*E\n"})
    public static final class c implements o3 {
        c() {
        }

        @Override // androidx.compose.foundation.gestures.o3
        public long a(long j10, int i10) {
            b5.this.f14391g = i10;
            androidx.compose.foundation.x3 x3Var = b5.this.f14386b;
            if (x3Var != null && b5.this.G(j10)) {
                return x3Var.z(j10, b5.this.f14391g, b5.this.f14394j);
            }
            return b5.this.z(b5.this.f14392h, j10, i10);
        }

        @Override // androidx.compose.foundation.gestures.o3
        public long b(long j10, int i10) {
            return b5.this.z(b5.this.f14392h, j10, i10);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.ScrollingLogic2D$onScrollStopped$performFling$1", f = "Scrollable2D.kt", i = {0, 1, 1, 2, 2}, l = {379, 382, 385}, m = "invokeSuspend", n = {"velocity", "velocity", "available", "velocity", "velocityLeft"}, s = {"J$0", "J$0", "J$1", "J$0", "J$1"})
    static final class d extends kotlin.coroutines.jvm.internal.o implements Function2<androidx.compose.ui.unit.c0, kotlin.coroutines.d<? super androidx.compose.ui.unit.c0>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        long f14409a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f14410b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ long f14411c;

        d(kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            d dVar2 = b5.this.new d(dVar);
            dVar2.f14411c = ((androidx.compose.ui.unit.c0) obj).v();
            return dVar2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(androidx.compose.ui.unit.c0 c0Var, kotlin.coroutines.d<? super androidx.compose.ui.unit.c0> dVar) {
            return k(c0Var.v(), dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x0099, code lost:
        
            if (r0 == r6) goto L23;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r15) throws java.lang.Throwable {
            /*
                r14 = this;
                java.lang.Object r6 = kotlin.coroutines.intrinsics.b.l()
                int r0 = r14.f14410b
                r1 = 3
                r2 = 2
                r3 = 1
                if (r0 == 0) goto L38
                if (r0 == r3) goto L30
                r13 = 7
                if (r0 == r2) goto L27
                if (r0 != r1) goto L1e
                long r0 = r14.f14409a
                long r2 = r14.f14411c
                kotlin.ResultKt.m(r15)
                r7 = r2
                r3 = r0
                r0 = r15
                goto L9c
            L1e:
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r13 = 6
                r0.<init>(r1)
                throw r0
            L27:
                long r2 = r14.f14409a
                long r7 = r14.f14411c
                kotlin.ResultKt.m(r15)
                r0 = r15
                goto L75
            L30:
                r13 = 6
                long r3 = r14.f14411c
                kotlin.ResultKt.m(r15)
                r0 = r15
                goto L53
            L38:
                kotlin.ResultKt.m(r15)
                long r7 = r14.f14411c
                androidx.compose.foundation.gestures.b5 r0 = androidx.compose.foundation.gestures.b5.this
                androidx.compose.ui.input.nestedscroll.b r0 = androidx.compose.foundation.gestures.b5.j(r0)
                r13 = 5
                r14.f14411c = r7
                r14.f14410b = r3
                r13 = 1
                java.lang.Object r0 = r0.c(r7, r14)
                r13 = 7
                if (r0 != r6) goto L52
                r13 = 3
                goto L9b
            L52:
                r3 = r7
            L53:
                r13 = 6
                androidx.compose.ui.unit.c0 r0 = (androidx.compose.ui.unit.c0) r0
                long r7 = r0.v()
                r13 = 5
                long r7 = androidx.compose.ui.unit.c0.p(r3, r7)
                androidx.compose.foundation.gestures.b5 r0 = androidx.compose.foundation.gestures.b5.this
                r13 = 7
                r14.f14411c = r3
                r13 = 5
                r14.f14409a = r7
                r14.f14410b = r2
                r13 = 3
                java.lang.Object r0 = r0.a(r7, r14)
                if (r0 != r6) goto L72
                r13 = 7
                goto L9b
            L72:
                r11 = r7
                r7 = r3
                r2 = r11
            L75:
                androidx.compose.ui.unit.c0 r0 = (androidx.compose.ui.unit.c0) r0
                r13 = 3
                long r9 = r0.v()
                androidx.compose.foundation.gestures.b5 r0 = androidx.compose.foundation.gestures.b5.this
                androidx.compose.ui.input.nestedscroll.b r0 = androidx.compose.foundation.gestures.b5.j(r0)
                r13 = 0
                long r2 = androidx.compose.ui.unit.c0.p(r2, r9)
                r13 = 4
                r14.f14411c = r7
                r14.f14409a = r9
                r13 = 6
                r14.f14410b = r1
                r5 = r14
                r5 = r14
                r1 = r2
                r3 = r9
                r13 = 2
                java.lang.Object r0 = r0.a(r1, r3, r5)
                r13 = 5
                if (r0 != r6) goto L9c
            L9b:
                return r6
            L9c:
                androidx.compose.ui.unit.c0 r0 = (androidx.compose.ui.unit.c0) r0
                r13 = 6
                long r0 = r0.v()
                long r0 = androidx.compose.ui.unit.c0.p(r3, r0)
                long r0 = androidx.compose.ui.unit.c0.p(r7, r0)
                androidx.compose.ui.unit.c0 r0 = androidx.compose.ui.unit.c0.b(r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.b5.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        public final Object k(long j10, kotlin.coroutines.d<? super androidx.compose.ui.unit.c0> dVar) {
            return ((d) create(androidx.compose.ui.unit.c0.b(j10), dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.ScrollingLogic2D$scroll$2", f = "Scrollable2D.kt", i = {}, l = {496}, m = "invokeSuspend", n = {}, s = {})
    static final class e extends kotlin.coroutines.jvm.internal.o implements Function2<t3, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f14413a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f14414b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function2<o3, kotlin.coroutines.d<? super Unit>, Object> f14416d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(Function2<? super o3, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, kotlin.coroutines.d<? super e> dVar) {
            super(2, dVar);
            this.f14416d = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            e eVar = b5.this.new e(this.f14416d, dVar);
            eVar.f14414b = obj;
            return eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f14413a;
            if (i10 == 0) {
                ResultKt.m(obj);
                b5.this.f14392h = (t3) this.f14414b;
                Function2<o3, kotlin.coroutines.d<? super Unit>, Object> function2 = this.f14416d;
                c cVar = b5.this.f14393i;
                this.f14413a = 1;
                if (function2.invoke(cVar, this) == objL) {
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
        public final Object invoke(t3 t3Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((e) create(t3Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public b5(@NotNull g4 g4Var, @Nullable androidx.compose.foundation.x3 x3Var, @NotNull c3 c3Var, @NotNull androidx.compose.ui.input.nestedscroll.b bVar, @NotNull Function0<Boolean> function0) {
        this.f14385a = g4Var;
        this.f14386b = x3Var;
        this.f14387c = c3Var;
        this.f14388d = bVar;
        this.f14389e = function0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final n0.g A(b5 b5Var, n0.g gVar) {
        return n0.g.d(b5Var.z(b5Var.f14392h, gVar.B(), b5Var.f14391g));
    }

    public static /* synthetic */ Object C(b5 b5Var, androidx.compose.foundation.q3 q3Var, Function2 function2, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            q3Var = androidx.compose.foundation.q3.Default;
        }
        return b5Var.B(q3Var, function2, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean E(long j10) {
        if (this.f14385a.e(j10) && this.f14389e.invoke().booleanValue()) {
            return false;
        }
        return true;
    }

    private final long t(long j10) {
        return this.f14385a.f(j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long u(float f10, long j10) {
        if (Float.isNaN(a4.e(j10))) {
            return n0.g.g((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(f10)) & com.rabbitmq.client.k0.f265952a));
        }
        return n0.g.g((((long) Float.floatToRawIntBits(Math.abs(((float) Math.cos(a4.e(j10))) * f10) * Math.signum(androidx.compose.ui.unit.c0.l(j10)))) << 32) | (((long) Float.floatToRawIntBits(Math.abs(((float) Math.sin(a4.e(j10))) * f10) * Math.signum(androidx.compose.ui.unit.c0.n(j10)))) & com.rabbitmq.client.k0.f265952a));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long v(float f10, long j10) {
        return Float.isNaN(a4.e(j10)) ? androidx.compose.ui.unit.d0.a(0.0f, f10) : androidx.compose.ui.unit.d0.a(Math.abs(((float) Math.cos(a4.e(j10))) * f10) * Math.signum(androidx.compose.ui.unit.c0.l(j10)), Math.abs(((float) Math.sin(a4.e(j10))) * f10) * Math.signum(androidx.compose.ui.unit.c0.n(j10)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float w(long j10) {
        double d10 = 2;
        return (float) Math.sqrt(((float) Math.pow(Float.intBitsToFloat((int) (j10 >> 32)), d10)) + ((float) Math.pow(Float.intBitsToFloat((int) (j10 & com.rabbitmq.client.k0.f265952a)), d10)));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long z(t3 t3Var, long j10, int i10) {
        long jD = this.f14388d.d(j10, i10);
        long jV = n0.g.v(j10, jD);
        long jA = t3Var.a(jV);
        return n0.g.w(n0.g.w(jD, jA), this.f14388d.b(jA, n0.g.v(jV, jA), i10));
    }

    @Nullable
    public final Object B(@NotNull androidx.compose.foundation.q3 q3Var, @NotNull Function2<? super o3, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objC = this.f14385a.c(q3Var, new e(function2, null), dVar);
        return objC == kotlin.coroutines.intrinsics.b.l() ? objC : Unit.f312394a;
    }

    public final void D(@NotNull g4 g4Var) {
        this.f14385a = g4Var;
    }

    public final boolean F(long j10) {
        g4 g4Var = this.f14385a;
        float fL = androidx.compose.ui.unit.c0.l(j10);
        return g4Var.e(n0.g.g((((long) Float.floatToRawIntBits(androidx.compose.ui.unit.c0.n(j10))) & com.rabbitmq.client.k0.f265952a) | (Float.floatToRawIntBits(fL) << 32)));
    }

    public final boolean G(long j10) {
        return this.f14385a.e(j10);
    }

    public final boolean H() {
        if (!this.f14385a.a()) {
            androidx.compose.foundation.x3 x3Var = this.f14386b;
            if (!(x3Var != null ? x3Var.x() : false)) {
                return false;
            }
        }
        return true;
    }

    public final boolean I(@NotNull g4 g4Var, @Nullable androidx.compose.foundation.x3 x3Var, @NotNull c3 c3Var, @NotNull androidx.compose.ui.input.nestedscroll.b bVar) {
        boolean z10;
        if (Intrinsics.areEqual(this.f14385a, g4Var)) {
            z10 = false;
        } else {
            this.f14385a = g4Var;
            z10 = true;
        }
        this.f14386b = x3Var;
        this.f14387c = c3Var;
        this.f14388d = bVar;
        return z10;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0019  */
    @Override // androidx.compose.foundation.gestures.y3
    @Nullable
    public Object a(long j10, @NotNull kotlin.coroutines.d<? super androidx.compose.ui.unit.c0> dVar) throws Throwable {
        a aVar;
        b5 b5Var;
        Throwable th2;
        kotlin.jvm.internal.i1.g gVar;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i10 = aVar.f14398d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f14398d = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object obj = aVar.f14396b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = aVar.f14398d;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gVar = (kotlin.jvm.internal.i1.g) aVar.f14395a;
            try {
                ResultKt.m(obj);
                b5Var = this;
                b5Var.f14390f = false;
                return androidx.compose.ui.unit.c0.b(gVar.f312750a);
            } catch (Throwable th3) {
                th2 = th3;
                b5Var = this;
                b5Var.f14390f = false;
                throw th2;
            }
        }
        ResultKt.m(obj);
        kotlin.jvm.internal.i1.g gVar2 = new kotlin.jvm.internal.i1.g();
        gVar2.f312750a = j10;
        this.f14390f = true;
        try {
            androidx.compose.foundation.q3 q3Var = androidx.compose.foundation.q3.Default;
            b5Var = this;
            try {
                b bVar = b5Var.new b(j10, gVar2, null);
                aVar.f14395a = gVar2;
                aVar.f14398d = 1;
                if (b5Var.B(q3Var, bVar, aVar) == objL) {
                    return objL;
                }
                gVar = gVar2;
                b5Var.f14390f = false;
                return androidx.compose.ui.unit.c0.b(gVar.f312750a);
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
                b5Var.f14390f = false;
                throw th2;
            }
        } catch (Throwable th5) {
            th = th5;
            b5Var = this;
        }
    }

    @Override // androidx.compose.foundation.gestures.y3
    public boolean b() {
        return this.f14390f;
    }

    @Override // androidx.compose.foundation.gestures.y3
    public long c(long j10) {
        return this.f14385a.a() ? n0.g.f332700b.e() : t(j10);
    }

    @NotNull
    public final g4 x() {
        return this.f14385a;
    }

    @Nullable
    public final Object y(long j10, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        d dVar2 = new d(null);
        androidx.compose.foundation.x3 x3Var = this.f14386b;
        if (x3Var == null || !F(j10)) {
            Object objInvoke = dVar2.invoke(androidx.compose.ui.unit.c0.b(j10), dVar);
            return objInvoke == kotlin.coroutines.intrinsics.b.l() ? objInvoke : Unit.f312394a;
        }
        Object objA = x3Var.A(j10, dVar2, dVar);
        return objA == kotlin.coroutines.intrinsics.b.l() ? objA : Unit.f312394a;
    }
}

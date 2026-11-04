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
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nScrollable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scrollable.kt\nandroidx/compose/foundation/gestures/ScrollingLogic\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 6 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1070:1\n30#2:1071\n30#2:1075\n53#3,3:1072\n53#3,3:1076\n60#3:1080\n70#3:1083\n65#4:1079\n69#4:1082\n22#5:1081\n1#6:1084\n*S KotlinDebug\n*F\n+ 1 Scrollable.kt\nandroidx/compose/foundation/gestures/ScrollingLogic\n*L\n657#1:1071\n658#1:1075\n657#1:1072,3\n658#1:1076,3\n664#1:1080\n664#1:1083\n664#1:1079\n664#1:1082\n664#1:1081\n*E\n"})
public final class z4 implements y3 {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f15452n = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private v4 f15453a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private androidx.compose.foundation.x3 f15454b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private c3 f15455c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private q3 f15456d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f15457e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private androidx.compose.ui.input.nestedscroll.b f15458f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private p3 f15459g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final Function0<Boolean> f15460h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f15461i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f15462j = androidx.compose.ui.input.nestedscroll.f.f38949b.h();

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private z3 f15463k = n4.f14847b;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private final c f15464l = new c();

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private final Function1<n0.g, n0.g> f15465m = new Function1() { // from class: androidx.compose.foundation.gestures.y4
        @Override // kotlin.jvm.functions.Function1
        public final Object invoke(Object obj) {
            return z4.z(this.f15401a, (n0.g) obj);
        }
    };

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.ScrollingLogic", f = "Scrollable.kt", i = {0}, l = {800}, m = "doFlingAnimation-QWom1Mo", n = {"result"}, s = {"L$0"})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f15466a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f15467b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f15469d;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f15467b = obj;
            this.f15469d |= Integer.MIN_VALUE;
            return z4.this.a(0L, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.ScrollingLogic$doFlingAnimation$2", f = "Scrollable.kt", i = {}, l = {837}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<o3, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f15470a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        Object f15471b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        long f15472c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f15473d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private /* synthetic */ Object f15474e;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.i1.g f15476g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ long f15477h;

        public static final class a implements z3 {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ z4 f15478a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ o3 f15479b;

            a(z4 z4Var, o3 o3Var) {
                this.f15478a = z4Var;
                this.f15479b = o3Var;
            }

            @Override // androidx.compose.foundation.gestures.z3
            public float f(float f10) {
                boolean zF;
                if (!androidx.compose.foundation.s1.f18606k) {
                    zF = this.f15478a.F(f10);
                } else if (((Boolean) this.f15478a.f15460h.invoke()).booleanValue()) {
                    zF = false;
                } else {
                    zF = true;
                    int i10 = 5 >> 1;
                }
                if (Math.abs(f10) != 0.0f && zF) {
                    throw new d3();
                }
                z4 z4Var = this.f15478a;
                return z4Var.A(z4Var.K(this.f15479b.a(z4Var.B(z4Var.L(f10)), androidx.compose.ui.input.nestedscroll.f.f38949b.g())));
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        b(kotlin.jvm.internal.i1.g gVar, long j10, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f15476g = gVar;
            this.f15477h = j10;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            b bVar = z4.this.new b(this.f15476g, this.f15477h, dVar);
            bVar.f15474e = obj;
            return bVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            z4 z4Var;
            kotlin.jvm.internal.i1.g gVar;
            long j10;
            z4 z4Var2;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f15473d;
            if (i10 == 0) {
                ResultKt.m(obj);
                a aVar = new a(z4.this, (o3) this.f15474e);
                z4Var = z4.this;
                kotlin.jvm.internal.i1.g gVar2 = this.f15476g;
                long j11 = this.f15477h;
                c3 c3Var = z4Var.f15455c;
                long j12 = gVar2.f312750a;
                float fA = z4Var.A(z4Var.J(j11));
                this.f15474e = z4Var;
                this.f15470a = z4Var;
                this.f15471b = gVar2;
                this.f15472c = j12;
                this.f15473d = 1;
                Object objA = c3Var.a(aVar, fA, this);
                if (objA == objL) {
                    return objL;
                }
                gVar = gVar2;
                j10 = j12;
                obj = objA;
                z4Var2 = z4Var;
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                j10 = this.f15472c;
                gVar = (kotlin.jvm.internal.i1.g) this.f15471b;
                z4Var = (z4) this.f15470a;
                z4Var2 = (z4) this.f15474e;
                ResultKt.m(obj);
            }
            gVar.f312750a = z4Var.O(j10, z4Var2.A(((Number) obj).floatValue()));
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public final Object invoke(o3 o3Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(o3Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @SourceDebugExtension({"SMAP\nScrollable.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Scrollable.kt\nandroidx/compose/foundation/gestures/ScrollingLogic$nestedScrollScope$1\n+ 2 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,1070:1\n1#2:1071\n*E\n"})
    public static final class c implements o3 {
        c() {
        }

        @Override // androidx.compose.foundation.gestures.o3
        public long a(long j10, int i10) {
            z4.this.f15462j = i10;
            androidx.compose.foundation.x3 x3Var = z4.this.f15454b;
            if (x3Var != null && z4.this.v()) {
                return x3Var.z(j10, z4.this.f15462j, z4.this.f15465m);
            }
            return z4.this.y(z4.this.f15463k, j10, i10);
        }

        @Override // androidx.compose.foundation.gestures.o3
        public long b(long j10, int i10) {
            return z4.this.y(z4.this.f15463k, j10, i10);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.ScrollingLogic$onScrollStopped$performFling$1", f = "Scrollable.kt", i = {0, 1, 1, 2, 2}, l = {765, com.google.android.material.internal.p0.f112892a, 771}, m = "invokeSuspend", n = {"velocity", "velocity", "available", "velocity", "velocityLeft"}, s = {"J$0", "J$0", "J$1", "J$0", "J$1"})
    static final class d extends kotlin.coroutines.jvm.internal.o implements Function2<androidx.compose.ui.unit.c0, kotlin.coroutines.d<? super androidx.compose.ui.unit.c0>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        long f15481a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f15482b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        /* synthetic */ long f15483c;

        d(kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            d dVar2 = z4.this.new d(dVar);
            dVar2.f15483c = ((androidx.compose.ui.unit.c0) obj).v();
            return dVar2;
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Object invoke(androidx.compose.ui.unit.c0 c0Var, kotlin.coroutines.d<? super androidx.compose.ui.unit.c0> dVar) {
            return k(c0Var.v(), dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:22:0x009d, code lost:
        
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
                r13 = 7
                int r0 = r14.f15482b
                r1 = 3
                r2 = 7
                r2 = 2
                r3 = 1
                if (r0 == 0) goto L3f
                if (r0 == r3) goto L36
                r13 = 4
                if (r0 == r2) goto L2b
                if (r0 != r1) goto L21
                long r0 = r14.f15481a
                r13 = 4
                long r2 = r14.f15483c
                kotlin.ResultKt.m(r15)
                r7 = r2
                r3 = r0
                r0 = r15
                goto La1
            L21:
                r13 = 5
                java.lang.IllegalStateException r0 = new java.lang.IllegalStateException
                r13 = 2
                java.lang.String r1 = "call to 'resume' before 'invoke' with coroutine"
                r0.<init>(r1)
                throw r0
            L2b:
                long r2 = r14.f15481a
                long r7 = r14.f15483c
                r13 = 4
                kotlin.ResultKt.m(r15)
                r0 = r15
                r13 = 7
                goto L7b
            L36:
                long r3 = r14.f15483c
                r13 = 0
                kotlin.ResultKt.m(r15)
                r0 = r15
                r13 = 0
                goto L5b
            L3f:
                kotlin.ResultKt.m(r15)
                r13 = 0
                long r7 = r14.f15483c
                androidx.compose.foundation.gestures.z4 r0 = androidx.compose.foundation.gestures.z4.this
                androidx.compose.ui.input.nestedscroll.b r0 = androidx.compose.foundation.gestures.z4.g(r0)
                r13 = 4
                r14.f15483c = r7
                r14.f15482b = r3
                r13 = 7
                java.lang.Object r0 = r0.c(r7, r14)
                r13 = 6
                if (r0 != r6) goto L5a
                r13 = 1
                goto L9f
            L5a:
                r3 = r7
            L5b:
                r13 = 0
                androidx.compose.ui.unit.c0 r0 = (androidx.compose.ui.unit.c0) r0
                long r7 = r0.v()
                r13 = 4
                long r7 = androidx.compose.ui.unit.c0.p(r3, r7)
                r13 = 2
                androidx.compose.foundation.gestures.z4 r0 = androidx.compose.foundation.gestures.z4.this
                r14.f15483c = r3
                r14.f15481a = r7
                r14.f15482b = r2
                java.lang.Object r0 = r0.a(r7, r14)
                r13 = 6
                if (r0 != r6) goto L78
                goto L9f
            L78:
                r11 = r7
                r7 = r3
                r2 = r11
            L7b:
                r13 = 4
                androidx.compose.ui.unit.c0 r0 = (androidx.compose.ui.unit.c0) r0
                long r9 = r0.v()
                r13 = 3
                androidx.compose.foundation.gestures.z4 r0 = androidx.compose.foundation.gestures.z4.this
                androidx.compose.ui.input.nestedscroll.b r0 = androidx.compose.foundation.gestures.z4.g(r0)
                r13 = 4
                long r2 = androidx.compose.ui.unit.c0.p(r2, r9)
                r14.f15483c = r7
                r14.f15481a = r9
                r13 = 3
                r14.f15482b = r1
                r5 = r14
                r1 = r2
                r3 = r9
                java.lang.Object r0 = r0.a(r1, r3, r5)
                r13 = 4
                if (r0 != r6) goto La1
            L9f:
                r13 = 3
                return r6
            La1:
                androidx.compose.ui.unit.c0 r0 = (androidx.compose.ui.unit.c0) r0
                long r0 = r0.v()
                r13 = 1
                long r0 = androidx.compose.ui.unit.c0.p(r3, r0)
                long r0 = androidx.compose.ui.unit.c0.p(r7, r0)
                r13 = 5
                androidx.compose.ui.unit.c0 r0 = androidx.compose.ui.unit.c0.b(r0)
                return r0
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.foundation.gestures.z4.d.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        public final Object k(long j10, kotlin.coroutines.d<? super androidx.compose.ui.unit.c0> dVar) {
            return ((d) create(androidx.compose.ui.unit.c0.b(j10), dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.foundation.gestures.ScrollingLogic$scroll$2", f = "Scrollable.kt", i = {}, l = {861}, m = "invokeSuspend", n = {}, s = {})
    static final class e extends kotlin.coroutines.jvm.internal.o implements Function2<z3, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f15485a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private /* synthetic */ Object f15486b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function2<o3, kotlin.coroutines.d<? super Unit>, Object> f15488d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        e(Function2<? super o3, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, kotlin.coroutines.d<? super e> dVar) {
            super(2, dVar);
            this.f15488d = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            e eVar = z4.this.new e(this.f15488d, dVar);
            eVar.f15486b = obj;
            return eVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f15485a;
            if (i10 == 0) {
                ResultKt.m(obj);
                z4.this.f15463k = (z3) this.f15486b;
                Function2<o3, kotlin.coroutines.d<? super Unit>, Object> function2 = this.f15488d;
                c cVar = z4.this.f15464l;
                this.f15485a = 1;
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
        public final Object invoke(z3 z3Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((e) create(z3Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public z4(@NotNull v4 v4Var, @Nullable androidx.compose.foundation.x3 x3Var, @NotNull c3 c3Var, @NotNull q3 q3Var, boolean z10, @NotNull androidx.compose.ui.input.nestedscroll.b bVar, @NotNull p3 p3Var, @NotNull Function0<Boolean> function0) {
        this.f15453a = v4Var;
        this.f15454b = x3Var;
        this.f15455c = c3Var;
        this.f15456d = q3Var;
        this.f15457e = z10;
        this.f15458f = bVar;
        this.f15459g = p3Var;
        this.f15460h = function0;
    }

    public static /* synthetic */ Object D(z4 z4Var, androidx.compose.foundation.q3 q3Var, Function2 function2, kotlin.coroutines.d dVar, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            q3Var = androidx.compose.foundation.q3.Default;
        }
        return z4Var.C(q3Var, function2, dVar);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean F(float f10) {
        if (f10 <= 0.0f || this.f15453a.f()) {
            return (f10 < 0.0f && !this.f15453a.k()) || !this.f15460h.invoke().booleanValue();
        }
        return true;
    }

    private final long I(long j10) {
        return this.f15456d == q3.Horizontal ? androidx.compose.ui.unit.c0.g(j10, 0.0f, 0.0f, 1, null) : androidx.compose.ui.unit.c0.g(j10, 0.0f, 0.0f, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float J(long j10) {
        return this.f15456d == q3.Horizontal ? androidx.compose.ui.unit.c0.l(j10) : androidx.compose.ui.unit.c0.n(j10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long O(long j10, float f10) {
        return this.f15456d == q3.Horizontal ? androidx.compose.ui.unit.c0.g(j10, f10, 0.0f, 2, null) : androidx.compose.ui.unit.c0.g(j10, 0.0f, f10, 1, null);
    }

    private final long t(long j10) {
        return L(A(this.f15453a.b(A(K(j10)))));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean v() {
        return this.f15453a.f() || this.f15453a.k();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final long y(z3 z3Var, long j10, int i10) {
        long jD = this.f15458f.d(j10, i10);
        long jV = n0.g.v(j10, jD);
        long jB = B(L(z3Var.f(K(B(H(jV))))));
        if (androidx.compose.foundation.s1.f18604i) {
            this.f15459g.v1(jB);
        }
        return n0.g.w(n0.g.w(jD, jB), this.f15458f.b(jB, n0.g.v(jV, jB), i10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final n0.g z(z4 z4Var, n0.g gVar) {
        return n0.g.d(z4Var.y(z4Var.f15463k, gVar.B(), z4Var.f15462j));
    }

    public final float A(float f10) {
        return this.f15457e ? f10 * (-1) : f10;
    }

    public final long B(long j10) {
        return this.f15457e ? n0.g.y(j10, -1.0f) : j10;
    }

    @Nullable
    public final Object C(@NotNull androidx.compose.foundation.q3 q3Var, @NotNull Function2<? super o3, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objC = this.f15453a.c(q3Var, new e(function2, null), dVar);
        return objC == kotlin.coroutines.intrinsics.b.l() ? objC : Unit.f312394a;
    }

    public final void E(@NotNull v4 v4Var) {
        this.f15453a = v4Var;
    }

    public final boolean G() {
        if (this.f15453a.a()) {
            return true;
        }
        androidx.compose.foundation.x3 x3Var = this.f15454b;
        return x3Var != null ? x3Var.x() : false;
    }

    public final long H(long j10) {
        return this.f15456d == q3.Horizontal ? n0.g.i(j10, 0.0f, 0.0f, 1, null) : n0.g.i(j10, 0.0f, 0.0f, 2, null);
    }

    public final float K(long j10) {
        return Float.intBitsToFloat((int) (this.f15456d == q3.Horizontal ? j10 >> 32 : j10 & com.rabbitmq.client.k0.f265952a));
    }

    public final long L(float f10) {
        if (f10 == 0.0f) {
            return n0.g.f332700b.e();
        }
        if (this.f15456d == q3.Horizontal) {
            return n0.g.g((((long) Float.floatToRawIntBits(f10)) << 32) | (((long) Float.floatToRawIntBits(0.0f)) & com.rabbitmq.client.k0.f265952a));
        }
        return n0.g.g((((long) Float.floatToRawIntBits(f10)) & com.rabbitmq.client.k0.f265952a) | (Float.floatToRawIntBits(0.0f) << 32));
    }

    public final long M(float f10) {
        if (f10 == 0.0f) {
            return androidx.compose.ui.unit.c0.f42681b.a();
        }
        return this.f15456d == q3.Horizontal ? androidx.compose.ui.unit.d0.a(f10, 0.0f) : androidx.compose.ui.unit.d0.a(0.0f, f10);
    }

    public final boolean N(@NotNull v4 v4Var, @NotNull q3 q3Var, @Nullable androidx.compose.foundation.x3 x3Var, boolean z10, @NotNull c3 c3Var, @NotNull androidx.compose.ui.input.nestedscroll.b bVar) {
        boolean z11;
        boolean z12 = true;
        if (Intrinsics.areEqual(this.f15453a, v4Var)) {
            z11 = false;
        } else {
            this.f15453a = v4Var;
            z11 = true;
        }
        this.f15454b = x3Var;
        if (this.f15456d != q3Var) {
            this.f15456d = q3Var;
            z11 = true;
        }
        if (this.f15457e != z10) {
            this.f15457e = z10;
        } else {
            z12 = z11;
        }
        this.f15455c = c3Var;
        this.f15458f = bVar;
        return z12;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // androidx.compose.foundation.gestures.y3
    @Nullable
    public Object a(long j10, @NotNull kotlin.coroutines.d<? super androidx.compose.ui.unit.c0> dVar) throws Throwable {
        a aVar;
        z4 z4Var;
        Throwable th2;
        kotlin.jvm.internal.i1.g gVar;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i10 = aVar.f15469d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f15469d = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object obj = aVar.f15467b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = aVar.f15469d;
        if (i11 != 0) {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            gVar = (kotlin.jvm.internal.i1.g) aVar.f15466a;
            try {
                ResultKt.m(obj);
                z4Var = this;
                z4Var.f15461i = false;
                return androidx.compose.ui.unit.c0.b(gVar.f312750a);
            } catch (Throwable th3) {
                th2 = th3;
                z4Var = this;
                z4Var.f15461i = false;
                throw th2;
            }
        }
        ResultKt.m(obj);
        kotlin.jvm.internal.i1.g gVar2 = new kotlin.jvm.internal.i1.g();
        gVar2.f312750a = j10;
        this.f15461i = true;
        try {
            androidx.compose.foundation.q3 q3Var = androidx.compose.foundation.q3.Default;
            z4Var = this;
            try {
                b bVar = z4Var.new b(gVar2, j10, null);
                aVar.f15466a = gVar2;
                aVar.f15469d = 1;
                if (z4Var.C(q3Var, bVar, aVar) == objL) {
                    return objL;
                }
                gVar = gVar2;
                z4Var.f15461i = false;
                return androidx.compose.ui.unit.c0.b(gVar.f312750a);
            } catch (Throwable th4) {
                th = th4;
                th2 = th;
                z4Var.f15461i = false;
                throw th2;
            }
        } catch (Throwable th5) {
            th = th5;
            z4Var = this;
        }
    }

    @Override // androidx.compose.foundation.gestures.y3
    public boolean b() {
        return this.f15461i;
    }

    @Override // androidx.compose.foundation.gestures.y3
    public long c(long j10) {
        return this.f15453a.a() ? n0.g.f332700b.e() : t(j10);
    }

    @NotNull
    public final v4 u() {
        return this.f15453a;
    }

    public final boolean w() {
        if (this.f15456d != q3.Vertical) {
            return false;
        }
        boolean z10 = !true;
        return true;
    }

    @Nullable
    public final Object x(long j10, boolean z10, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        if (z10 && !n4.h(this.f15455c)) {
            return Unit.f312394a;
        }
        long jI = I(j10);
        d dVar2 = new d(null);
        androidx.compose.foundation.x3 x3Var = this.f15454b;
        if (x3Var == null || !v()) {
            Object objInvoke = dVar2.invoke(androidx.compose.ui.unit.c0.b(jI), dVar);
            return objInvoke == kotlin.coroutines.intrinsics.b.l() ? objInvoke : Unit.f312394a;
        }
        Object objA = x3Var.A(jI, dVar2, dVar);
        return objA == kotlin.coroutines.intrinsics.b.l() ? objA : Unit.f312394a;
    }
}

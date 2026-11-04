package androidx.compose.animation.core;

import androidx.compose.runtime.d7;
import androidx.compose.runtime.n7;
import androidx.compose.runtime.w6;
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
@SourceDebugExtension({"SMAP\nAnimateAsState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AnimateAsState.kt\nandroidx/compose/animation/core/AnimateAsStateKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,600:1\n1282#2,6:601\n1282#2,6:607\n1282#2,6:613\n1282#2,6:619\n1282#2,6:625\n1282#2,6:631\n1282#2,6:637\n1282#2,6:643\n85#3:649\n85#3:650\n*S KotlinDebug\n*F\n+ 1 AnimateAsState.kt\nandroidx/compose/animation/core/AnimateAsStateKt\n*L\n71#1:601,6\n392#1:607,6\n398#1:613,6\n399#1:619,6\n415#1:625,6\n416#1:631,6\n417#1:637,6\n588#1:643,6\n400#1:649\n402#1:650\n*E\n"})
public final class f {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final q2<Float> f12918a = p.r(0.0f, 0.0f, null, 7, null);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final q2<androidx.compose.ui.unit.h> f12919b = p.r(0.0f, 0.0f, androidx.compose.ui.unit.h.o(j5.a(androidx.compose.ui.unit.h.f42689b)), 3, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final q2<n0.n> f12920c = p.r(0.0f, 0.0f, n0.n.c(j5.g(n0.n.f332724b)), 3, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final q2<n0.g> f12921d = p.r(0.0f, 0.0f, n0.g.d(j5.f(n0.g.f332700b)), 3, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private static final q2<n0.j> f12922e = p.r(0.0f, 0.0f, j5.h(n0.j.f332705e), 3, null);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private static final q2<Integer> f12923f = p.r(0.0f, 0.0f, Integer.valueOf(j5.b(kotlin.jvm.internal.i0.f312739a)), 3, null);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private static final q2<androidx.compose.ui.unit.q> f12924g = p.r(0.0f, 0.0f, androidx.compose.ui.unit.q.c(j5.d(androidx.compose.ui.unit.q.f42709b)), 3, null);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private static final q2<androidx.compose.ui.unit.u> f12925h = p.r(0.0f, 0.0f, androidx.compose.ui.unit.u.b(j5.e(androidx.compose.ui.unit.u.f42720b)), 3, null);

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1", f = "AnimateAsState.kt", i = {0}, l = {418}, m = "invokeSuspend", n = {"$this$LaunchedEffect"}, s = {"L$0"})
    static final class a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f12926a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f12927b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private /* synthetic */ Object f12928c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.channels.p<T> f12929d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ c<T, V> f12930e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ n7<o<T>> f12931f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ n7<Function1<T, Unit>> f12932g;

        /* JADX INFO: renamed from: androidx.compose.animation.core.f$a$a, reason: collision with other inner class name */
        @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.animation.core.AnimateAsStateKt$animateValueAsState$3$1$1", f = "AnimateAsState.kt", i = {}, l = {427}, m = "invokeSuspend", n = {}, s = {})
        static final class C0058a extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            int f12933a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ T f12934b;

            /* JADX INFO: renamed from: c, reason: collision with root package name */
            final /* synthetic */ c<T, V> f12935c;

            /* JADX INFO: renamed from: d, reason: collision with root package name */
            final /* synthetic */ n7<o<T>> f12936d;

            /* JADX INFO: renamed from: e, reason: collision with root package name */
            final /* synthetic */ n7<Function1<T, Unit>> f12937e;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            C0058a(T t10, c<T, V> cVar, n7<? extends o<T>> n7Var, n7<? extends Function1<? super T, Unit>> n7Var2, kotlin.coroutines.d<? super C0058a> dVar) {
                super(2, dVar);
                this.f12934b = t10;
                this.f12935c = cVar;
                this.f12936d = n7Var;
                this.f12937e = n7Var2;
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
                return new C0058a(this.f12934b, this.f12935c, this.f12936d, this.f12937e, dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(Object obj) {
                C0058a c0058a;
                Object objL = kotlin.coroutines.intrinsics.b.l();
                int i10 = this.f12933a;
                if (i10 == 0) {
                    ResultKt.m(obj);
                    if (!Intrinsics.areEqual(this.f12934b, this.f12935c.s())) {
                        c<T, V> cVar = this.f12935c;
                        T t10 = this.f12934b;
                        o oVarW = f.w(this.f12936d);
                        this.f12933a = 1;
                        c0058a = this;
                        if (c.i(cVar, t10, oVarW, null, null, c0058a, 12, null) == objL) {
                            return objL;
                        }
                    }
                    return Unit.f312394a;
                }
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                c0058a = this;
                Function1 function1V = f.v(c0058a.f12937e);
                if (function1V != null) {
                    function1V.invoke(c0058a.f12935c.v());
                }
                return Unit.f312394a;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
                return ((C0058a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(kotlinx.coroutines.channels.p<T> pVar, c<T, V> cVar, n7<? extends o<T>> n7Var, n7<? extends Function1<? super T, Unit>> n7Var2, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f12929d = pVar;
            this.f12930e = cVar;
            this.f12931f = n7Var;
            this.f12932g = n7Var2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            a aVar = new a(this.f12929d, this.f12930e, this.f12931f, this.f12932g, dVar);
            aVar.f12928c = obj;
            return aVar;
        }

        /* JADX WARN: Code duplicated, block: B:11:0x003c  */
        /* JADX WARN: Code duplicated, block: B:15:0x0046  */
        /* JADX WARN: Code duplicated, block: B:17:0x0057  */
        /* JADX WARN: Code duplicated, block: B:18:0x005a  */
        /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:10:0x003a -> B:13:0x003e). Please report as a decompilation issue!!! */
        /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
            jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached at block B:11:0x003c
            	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
            	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
            	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
            */
        @Override // kotlin.coroutines.jvm.internal.a
        public final java.lang.Object invokeSuspend(java.lang.Object r13) {
            /*
                r12 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r12.f12927b
                r2 = 1
                if (r1 == 0) goto L21
                if (r1 != r2) goto L17
                java.lang.Object r1 = r12.f12926a
                kotlinx.coroutines.channels.r r1 = (kotlinx.coroutines.channels.r) r1
                java.lang.Object r3 = r12.f12928c
                kotlinx.coroutines.s0 r3 = (kotlinx.coroutines.s0) r3
                kotlin.ResultKt.m(r13)
                goto L3e
            L17:
                r11 = 4
                java.lang.IllegalStateException r12 = new java.lang.IllegalStateException
                java.lang.String r13 = "call to 'resume' before 'invoke' with coroutine"
                r12.<init>(r13)
                r11 = 3
                throw r12
            L21:
                kotlin.ResultKt.m(r13)
                java.lang.Object r13 = r12.f12928c
                kotlinx.coroutines.s0 r13 = (kotlinx.coroutines.s0) r13
                kotlinx.coroutines.channels.p<T> r1 = r12.f12929d
                r11 = 3
                kotlinx.coroutines.channels.r r1 = r1.iterator()
                r3 = r13
            L30:
                r12.f12928c = r3
                r12.f12926a = r1
                r12.f12927b = r2
                java.lang.Object r13 = r1.c(r12)
                if (r13 != r0) goto L3e
                r11 = 7
                return r0
            L3e:
                java.lang.Boolean r13 = (java.lang.Boolean) r13
                boolean r13 = r13.booleanValue()
                if (r13 == 0) goto L72
                java.lang.Object r13 = r1.next()
                kotlinx.coroutines.channels.p<T> r4 = r12.f12929d
                java.lang.Object r4 = r4.w()
                java.lang.Object r4 = kotlinx.coroutines.channels.t.h(r4)
                r11 = 5
                if (r4 != 0) goto L5a
                r6 = r13
                r11 = 4
                goto L5b
            L5a:
                r6 = r4
            L5b:
                r11 = 0
                androidx.compose.animation.core.f$a$a r5 = new androidx.compose.animation.core.f$a$a
                androidx.compose.animation.core.c<T, V> r7 = r12.f12930e
                androidx.compose.runtime.n7<androidx.compose.animation.core.o<T>> r8 = r12.f12931f
                androidx.compose.runtime.n7<kotlin.jvm.functions.Function1<T, kotlin.Unit>> r9 = r12.f12932g
                r10 = 0
                r5.<init>(r6, r7, r8, r9, r10)
                r7 = 3
                r11 = 2
                r8 = 0
                r4 = 0
                r6 = r5
                r5 = 0
                kotlinx.coroutines.i.e(r3, r4, r5, r6, r7, r8)
                goto L30
            L72:
                r11 = 5
                kotlin.Unit r12 = kotlin.Unit.f312394a
                return r12
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.animation.core.f.a.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @androidx.compose.runtime.o
    @NotNull
    public static final n7<androidx.compose.ui.unit.h> d(float f10, @Nullable o<androidx.compose.ui.unit.h> oVar, @Nullable String str, @Nullable Function1<? super androidx.compose.ui.unit.h, Unit> function1, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        if ((i11 & 2) != 0) {
            oVar = f12919b;
        }
        o<androidx.compose.ui.unit.h> oVar2 = oVar;
        if ((i11 & 4) != 0) {
            str = "DpAnimation";
        }
        String str2 = str;
        if ((i11 & 8) != 0) {
            function1 = null;
        }
        Function1<? super androidx.compose.ui.unit.h, Unit> function2 = function1;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-1407150062, i10, -1, "androidx.compose.animation.core.animateDpAsState (AnimateAsState.kt:111)");
        }
        int i12 = i10 << 6;
        n7<androidx.compose.ui.unit.h> n7VarT = t(androidx.compose.ui.unit.h.o(f10), t4.L(androidx.compose.ui.unit.h.f42689b), oVar2, null, str2, function2, c0Var, (i10 & 14) | ((i10 << 3) & 896) | (57344 & i12) | (i12 & 458752), 8);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return n7VarT;
    }

    @androidx.compose.runtime.o
    @kotlin.l(level = kotlin.n.HIDDEN, message = "animate*AsState APIs now have a new label parameter added.")
    public static final /* synthetic */ n7 e(float f10, o oVar, Function1 function1, androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        if ((i11 & 2) != 0) {
            oVar = f12919b;
        }
        o oVar2 = oVar;
        if ((i11 & 4) != 0) {
            function1 = null;
        }
        Function1 function2 = function1;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(704104481, i10, -1, "androidx.compose.animation.core.animateDpAsState (AnimateAsState.kt:462)");
        }
        n7 n7VarT = t(androidx.compose.ui.unit.h.o(f10), t4.L(androidx.compose.ui.unit.h.f42689b), oVar2, null, null, function2, c0Var, (i10 & 14) | ((i10 << 3) & 896) | ((i10 << 9) & 458752), 24);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return n7VarT;
    }

    @androidx.compose.runtime.o
    @NotNull
    public static final n7<Float> f(float f10, @Nullable o<Float> oVar, float f11, @Nullable String str, @Nullable Function1<? super Float, Unit> function1, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        if ((i11 & 2) != 0) {
            oVar = f12918a;
        }
        if ((i11 & 4) != 0) {
            f11 = 0.01f;
        }
        if ((i11 & 8) != 0) {
            str = "FloatAnimation";
        }
        String str2 = str;
        Function1<? super Float, Unit> function2 = (i11 & 16) != 0 ? null : function1;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(668842840, i10, -1, "androidx.compose.animation.core.animateFloatAsState (AnimateAsState.kt:67)");
        }
        if (oVar == f12918a) {
            c0Var.E(1144108831);
            boolean z10 = (((i10 & 896) ^ androidx.media3.exoplayer.a5.S0) > 256 && c0Var.I(f11)) || (i10 & androidx.media3.exoplayer.a5.S0) == 256;
            Object objI0 = c0Var.i0();
            if (z10 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = p.r(0.0f, 0.0f, Float.valueOf(f11), 3, null);
                c0Var.Y(objI0);
            }
            oVar = (q2) objI0;
            c0Var.A();
        } else {
            c0Var.E(1144218757);
            c0Var.A();
        }
        o<Float> oVar2 = oVar;
        Float fValueOf = Float.valueOf(f10);
        z3<Float, s> z3VarP = t4.P(kotlin.jvm.internal.z.f312833a);
        Float fValueOf2 = Float.valueOf(f11);
        int i12 = i10 << 3;
        n7<Float> n7VarT = t(fValueOf, z3VarP, oVar2, fValueOf2, str2, function2, c0Var, (i10 & 14) | (i12 & 7168) | (57344 & i12) | (i12 & 458752), 0);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return n7VarT;
    }

    @androidx.compose.runtime.o
    @kotlin.l(level = kotlin.n.HIDDEN, message = "animate*AsState APIs now have a new label parameter added.")
    public static final /* synthetic */ n7 g(float f10, o oVar, float f11, Function1 function1, androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        if ((i11 & 2) != 0) {
            oVar = f12918a;
        }
        o oVar2 = oVar;
        if ((i11 & 4) != 0) {
            f11 = 0.01f;
        }
        float f12 = f11;
        if ((i11 & 8) != 0) {
            function1 = null;
        }
        Function1 function2 = function1;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(1091643291, i10, -1, "androidx.compose.animation.core.animateFloatAsState (AnimateAsState.kt:446)");
        }
        n7<Float> n7VarF = f(f10, oVar2, f12, null, function2, c0Var, (i10 & androidx.media3.exoplayer.analytics.b.f62802b0) | ((i10 << 3) & 57344), 8);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return n7VarF;
    }

    @androidx.compose.runtime.o
    @NotNull
    public static final n7<Integer> h(int i10, @Nullable o<Integer> oVar, @Nullable String str, @Nullable Function1<? super Integer, Unit> function1, @Nullable androidx.compose.runtime.c0 c0Var, int i11, int i12) {
        if ((i12 & 2) != 0) {
            oVar = f12923f;
        }
        o<Integer> oVar2 = oVar;
        if ((i12 & 4) != 0) {
            str = "IntAnimation";
        }
        String str2 = str;
        if ((i12 & 8) != 0) {
            function1 = null;
        }
        Function1<? super Integer, Unit> function2 = function1;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(428074472, i11, -1, "androidx.compose.animation.core.animateIntAsState (AnimateAsState.kt:270)");
        }
        int i13 = i11 << 6;
        n7<Integer> n7VarT = t(Integer.valueOf(i10), t4.Q(kotlin.jvm.internal.i0.f312739a), oVar2, null, str2, function2, c0Var, (i11 & 14) | ((i11 << 3) & 896) | (57344 & i13) | (i13 & 458752), 8);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return n7VarT;
    }

    @androidx.compose.runtime.o
    @kotlin.l(level = kotlin.n.HIDDEN, message = "animate*AsState APIs now have a new label parameter added.")
    public static final /* synthetic */ n7 i(int i10, o oVar, Function1 function1, androidx.compose.runtime.c0 c0Var, int i11, int i12) {
        if ((i12 & 2) != 0) {
            oVar = f12923f;
        }
        o oVar2 = oVar;
        if ((i12 & 4) != 0) {
            function1 = null;
        }
        Function1 function2 = function1;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-842612981, i11, -1, "androidx.compose.animation.core.animateIntAsState (AnimateAsState.kt:534)");
        }
        n7 n7VarT = t(Integer.valueOf(i10), t4.Q(kotlin.jvm.internal.i0.f312739a), oVar2, null, null, function2, c0Var, (i11 & 14) | ((i11 << 3) & 896) | ((i11 << 9) & 458752), 24);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return n7VarT;
    }

    @androidx.compose.runtime.o
    @kotlin.l(level = kotlin.n.HIDDEN, message = "animate*AsState APIs now have a new label parameter added.")
    public static final /* synthetic */ n7 j(long j10, o oVar, Function1 function1, androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        if ((i11 & 2) != 0) {
            oVar = f12924g;
        }
        o oVar2 = oVar;
        if ((i11 & 4) != 0) {
            function1 = null;
        }
        Function1 function2 = function1;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(1010307371, i10, -1, "androidx.compose.animation.core.animateIntOffsetAsState (AnimateAsState.kt:552)");
        }
        n7 n7VarT = t(androidx.compose.ui.unit.q.c(j10), t4.N(androidx.compose.ui.unit.q.f42709b), oVar2, null, null, function2, c0Var, (i10 & 14) | ((i10 << 3) & 896) | ((i10 << 9) & 458752), 24);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return n7VarT;
    }

    @androidx.compose.runtime.o
    @NotNull
    public static final n7<androidx.compose.ui.unit.q> k(long j10, @Nullable o<androidx.compose.ui.unit.q> oVar, @Nullable String str, @Nullable Function1<? super androidx.compose.ui.unit.q, Unit> function1, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        if ((i11 & 2) != 0) {
            oVar = f12924g;
        }
        o<androidx.compose.ui.unit.q> oVar2 = oVar;
        if ((i11 & 4) != 0) {
            str = "IntOffsetAnimation";
        }
        String str2 = str;
        if ((i11 & 8) != 0) {
            function1 = null;
        }
        Function1<? super androidx.compose.ui.unit.q, Unit> function2 = function1;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-696782904, i10, -1, "androidx.compose.animation.core.animateIntOffsetAsState (AnimateAsState.kt:309)");
        }
        int i12 = i10 << 6;
        n7<androidx.compose.ui.unit.q> n7VarT = t(androidx.compose.ui.unit.q.c(j10), t4.N(androidx.compose.ui.unit.q.f42709b), oVar2, null, str2, function2, c0Var, (i10 & 14) | ((i10 << 3) & 896) | (57344 & i12) | (i12 & 458752), 8);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return n7VarT;
    }

    @androidx.compose.runtime.o
    @NotNull
    public static final n7<androidx.compose.ui.unit.u> l(long j10, @Nullable o<androidx.compose.ui.unit.u> oVar, @Nullable String str, @Nullable Function1<? super androidx.compose.ui.unit.u, Unit> function1, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        if ((i11 & 2) != 0) {
            oVar = f12925h;
        }
        o<androidx.compose.ui.unit.u> oVar2 = oVar;
        if ((i11 & 4) != 0) {
            str = "IntSizeAnimation";
        }
        String str2 = str;
        if ((i11 & 8) != 0) {
            function1 = null;
        }
        Function1<? super androidx.compose.ui.unit.u, Unit> function2 = function1;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(582576328, i10, -1, "androidx.compose.animation.core.animateIntSizeAsState (AnimateAsState.kt:347)");
        }
        int i12 = i10 << 6;
        n7<androidx.compose.ui.unit.u> n7VarT = t(androidx.compose.ui.unit.u.b(j10), t4.O(androidx.compose.ui.unit.u.f42720b), oVar2, null, str2, function2, c0Var, (i10 & 14) | ((i10 << 3) & 896) | (57344 & i12) | (i12 & 458752), 8);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return n7VarT;
    }

    @androidx.compose.runtime.o
    @kotlin.l(level = kotlin.n.HIDDEN, message = "animate*AsState APIs now have a new label parameter added.")
    public static final /* synthetic */ n7 m(long j10, o oVar, Function1 function1, androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        if ((i11 & 2) != 0) {
            oVar = f12925h;
        }
        o oVar2 = oVar;
        if ((i11 & 4) != 0) {
            function1 = null;
        }
        Function1 function2 = function1;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-1749239765, i10, -1, "androidx.compose.animation.core.animateIntSizeAsState (AnimateAsState.kt:570)");
        }
        n7 n7VarT = t(androidx.compose.ui.unit.u.b(j10), t4.O(androidx.compose.ui.unit.u.f42720b), oVar2, null, null, function2, c0Var, (i10 & 14) | ((i10 << 3) & 896) | ((i10 << 9) & 458752), 24);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return n7VarT;
    }

    @androidx.compose.runtime.o
    @NotNull
    public static final n7<n0.g> n(long j10, @Nullable o<n0.g> oVar, @Nullable String str, @Nullable Function1<? super n0.g, Unit> function1, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        if ((i11 & 2) != 0) {
            oVar = f12921d;
        }
        o<n0.g> oVar2 = oVar;
        if ((i11 & 4) != 0) {
            str = "OffsetAnimation";
        }
        String str2 = str;
        if ((i11 & 8) != 0) {
            function1 = null;
        }
        Function1<? super n0.g, Unit> function2 = function1;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(357896800, i10, -1, "androidx.compose.animation.core.animateOffsetAsState (AnimateAsState.kt:191)");
        }
        int i12 = i10 << 6;
        n7<n0.g> n7VarT = t(n0.g.d(j10), t4.R(n0.g.f332700b), oVar2, null, str2, function2, c0Var, (i10 & 14) | ((i10 << 3) & 896) | (57344 & i12) | (i12 & 458752), 8);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return n7VarT;
    }

    @androidx.compose.runtime.o
    @kotlin.l(level = kotlin.n.HIDDEN, message = "animate*AsState APIs now have a new label parameter added.")
    public static final /* synthetic */ n7 o(long j10, o oVar, Function1 function1, androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        if ((i11 & 2) != 0) {
            oVar = f12921d;
        }
        o oVar2 = oVar;
        if ((i11 & 4) != 0) {
            function1 = null;
        }
        Function1 function2 = function1;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-456513133, i10, -1, "androidx.compose.animation.core.animateOffsetAsState (AnimateAsState.kt:498)");
        }
        n7 n7VarT = t(n0.g.d(j10), t4.R(n0.g.f332700b), oVar2, null, null, function2, c0Var, (i10 & 14) | ((i10 << 3) & 896) | ((i10 << 9) & 458752), 24);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return n7VarT;
    }

    @androidx.compose.runtime.o
    @NotNull
    public static final n7<n0.j> p(@NotNull n0.j jVar, @Nullable o<n0.j> oVar, @Nullable String str, @Nullable Function1<? super n0.j, Unit> function1, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        if ((i11 & 2) != 0) {
            oVar = f12922e;
        }
        o<n0.j> oVar2 = oVar;
        if ((i11 & 4) != 0) {
            str = "RectAnimation";
        }
        String str2 = str;
        if ((i11 & 8) != 0) {
            function1 = null;
        }
        Function1<? super n0.j, Unit> function2 = function1;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(536062978, i10, -1, "androidx.compose.animation.core.animateRectAsState (AnimateAsState.kt:232)");
        }
        int i12 = i10 << 6;
        n7<n0.j> n7VarT = t(jVar, t4.S(n0.j.f332705e), oVar2, null, str2, function2, c0Var, (i10 & 14) | ((i10 << 3) & 896) | (57344 & i12) | (i12 & 458752), 8);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return n7VarT;
    }

    @androidx.compose.runtime.o
    @kotlin.l(level = kotlin.n.HIDDEN, message = "animate*AsState APIs now have a new label parameter added.")
    public static final /* synthetic */ n7 q(n0.j jVar, o oVar, Function1 function1, androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        if ((i11 & 2) != 0) {
            oVar = f12922e;
        }
        o oVar2 = oVar;
        if ((i11 & 4) != 0) {
            function1 = null;
        }
        Function1 function2 = function1;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-782613967, i10, -1, "androidx.compose.animation.core.animateRectAsState (AnimateAsState.kt:516)");
        }
        n7 n7VarT = t(jVar, t4.S(n0.j.f332705e), oVar2, null, null, function2, c0Var, (i10 & 14) | ((i10 << 3) & 896) | ((i10 << 9) & 458752), 24);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return n7VarT;
    }

    @androidx.compose.runtime.o
    @kotlin.l(level = kotlin.n.HIDDEN, message = "animate*AsState APIs now have a new label parameter added.")
    public static final /* synthetic */ n7 r(long j10, o oVar, Function1 function1, androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        if ((i11 & 2) != 0) {
            oVar = f12920c;
        }
        o oVar2 = oVar;
        if ((i11 & 4) != 0) {
            function1 = null;
        }
        Function1 function2 = function1;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(875212471, i10, -1, "androidx.compose.animation.core.animateSizeAsState (AnimateAsState.kt:480)");
        }
        n7 n7VarT = t(n0.n.c(j10), t4.T(n0.n.f332724b), oVar2, null, null, function2, c0Var, (i10 & 14) | ((i10 << 3) & 896) | ((i10 << 9) & 458752), 24);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return n7VarT;
    }

    @androidx.compose.runtime.o
    @NotNull
    public static final n7<n0.n> s(long j10, @Nullable o<n0.n> oVar, @Nullable String str, @Nullable Function1<? super n0.n, Unit> function1, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        if ((i11 & 2) != 0) {
            oVar = f12920c;
        }
        o<n0.n> oVar2 = oVar;
        if ((i11 & 4) != 0) {
            str = "SizeAnimation";
        }
        String str2 = str;
        if ((i11 & 8) != 0) {
            function1 = null;
        }
        Function1<? super n0.n, Unit> function2 = function1;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(1374633148, i10, -1, "androidx.compose.animation.core.animateSizeAsState (AnimateAsState.kt:152)");
        }
        int i12 = i10 << 6;
        n7<n0.n> n7VarT = t(n0.n.c(j10), t4.T(n0.n.f332724b), oVar2, null, str2, function2, c0Var, (i10 & 14) | ((i10 << 3) & 896) | (57344 & i12) | (i12 & 458752), 8);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return n7VarT;
    }

    @androidx.compose.runtime.o
    @NotNull
    public static final <T, V extends w> n7<T> t(final T t10, @NotNull z3<T, V> z3Var, @Nullable o<T> oVar, @Nullable T t11, @Nullable String str, @Nullable Function1<? super T, Unit> function1, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        o<T> oVarQ;
        kotlinx.coroutines.channels.p pVar;
        if ((i11 & 4) != 0) {
            Object objI0 = c0Var.i0();
            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = p.r(0.0f, 0.0f, null, 7, null);
                c0Var.Y(objI0);
            }
            oVarQ = (q2) objI0;
        } else {
            oVarQ = oVar;
        }
        T t12 = (i11 & 8) != 0 ? null : t11;
        String str2 = (i11 & 16) != 0 ? "ValueAnimation" : str;
        Function1<? super T, Unit> function2 = (i11 & 32) != 0 ? null : function1;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-1994373980, i10, -1, "androidx.compose.animation.core.animateValueAsState (AnimateAsState.kt:395)");
        }
        Object objI1 = c0Var.i0();
        androidx.compose.runtime.c0.a aVar = androidx.compose.runtime.c0.f35327a;
        if (objI1 == aVar.a()) {
            objI1 = d7.g(null, null, 2, null);
            c0Var.Y(objI1);
        }
        androidx.compose.runtime.n3 n3Var = (androidx.compose.runtime.n3) objI1;
        Object objI2 = c0Var.i0();
        if (objI2 == aVar.a()) {
            objI2 = new c(t10, z3Var, t12, str2);
            c0Var.Y(objI2);
        }
        c cVar = (c) objI2;
        n7 n7VarW = w6.w(function2, c0Var, (i10 >> 15) & 14);
        if (t12 != null && (oVarQ instanceof q2)) {
            q2 q2Var = (q2) oVarQ;
            if (!Intrinsics.areEqual(q2Var.j(), t12)) {
                oVarQ = p.q(q2Var.h(), q2Var.i(), t12);
            }
        }
        n7 n7VarW2 = w6.w(oVarQ, c0Var, 0);
        Object objI3 = c0Var.i0();
        if (objI3 == aVar.a()) {
            objI3 = kotlinx.coroutines.channels.s.d(-1, null, null, 6, null);
            c0Var.Y(objI3);
        }
        final kotlinx.coroutines.channels.p pVar2 = (kotlinx.coroutines.channels.p) objI3;
        boolean zK0 = ((((i10 & 14) ^ 6) > 4 && c0Var.k0(t10)) || (i10 & 6) == 4) | c0Var.k0(pVar2);
        Object objI4 = c0Var.i0();
        if (zK0 || objI4 == aVar.a()) {
            objI4 = new Function0() { // from class: androidx.compose.animation.core.e
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return f.x(pVar2, t10);
                }
            };
            c0Var.Y(objI4);
        }
        androidx.compose.runtime.b2.m((Function0) objI4, c0Var, 0);
        boolean zK1 = c0Var.k0(pVar2) | c0Var.k0(cVar) | c0Var.D(n7VarW2) | c0Var.D(n7VarW);
        Object objI5 = c0Var.i0();
        if (zK1 || objI5 == aVar.a()) {
            pVar = pVar2;
            Object aVar2 = new a(pVar, cVar, n7VarW2, n7VarW, null);
            c0Var.Y(aVar2);
            objI5 = aVar2;
        } else {
            pVar = pVar2;
        }
        androidx.compose.runtime.b2.i(pVar, (Function2) objI5, c0Var, 0);
        n7<T> n7VarJ = (n7) n3Var.getValue();
        if (n7VarJ == null) {
            n7VarJ = cVar.j();
        }
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return n7VarJ;
    }

    @androidx.compose.runtime.o
    @kotlin.l(level = kotlin.n.HIDDEN, message = "animate*AsState APIs now have a new label parameter added.")
    public static final /* synthetic */ n7 u(Object obj, z3 z3Var, o oVar, Object obj2, Function1 function1, androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        androidx.compose.runtime.c0 c0Var2;
        if ((i11 & 4) != 0) {
            Object objI0 = c0Var.i0();
            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = p.r(0.0f, 0.0f, null, 7, null);
                c0Var2 = c0Var;
                c0Var2.Y(objI0);
            } else {
                c0Var2 = c0Var;
            }
            oVar = (q2) objI0;
        } else {
            c0Var2 = c0Var;
        }
        o oVar2 = oVar;
        Object obj3 = (i11 & 8) != 0 ? null : obj2;
        Function1 function2 = (i11 & 16) != 0 ? null : function1;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-846382129, i10, -1, "androidx.compose.animation.core.animateValueAsState (AnimateAsState.kt:591)");
        }
        int i12 = i10 & 8;
        n7 n7VarT = t(obj, z3Var, oVar2, obj3, "ValueAnimation", function2, c0Var2, (i12 << 9) | i12 | 24576 | (i10 & 14) | (i10 & com.planner5d.library.engine.input.f.b.B) | (i10 & 896) | (i10 & 7168) | ((i10 << 3) & 458752), 0);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return n7VarT;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> Function1<T, Unit> v(n7<? extends Function1<? super T, Unit>> n7Var) {
        return n7Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final <T> o<T> w(n7<? extends o<T>> n7Var) {
        return n7Var.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit x(kotlinx.coroutines.channels.p pVar, Object obj) {
        pVar.p(obj);
        return Unit.f312394a;
    }
}

package androidx.compose.material3.pulltorefresh;

import androidx.compose.runtime.g4;
import androidx.compose.runtime.internal.w0;
import androidx.compose.runtime.k3;
import androidx.compose.ui.unit.c0;
import androidx.compose.ui.unit.d0;
import androidx.media3.exoplayer.a5;
import com.rabbitmq.client.k0;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@w0(parameters = 0)
@SourceDebugExtension({"SMAP\nPullToRefresh.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PullToRefresh.kt\nandroidx/compose/material3/pulltorefresh/PullToRefreshModifierNode\n+ 2 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 6 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 7 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n*L\n1#1,755:1\n81#2:756\n114#2,2:757\n81#2:759\n114#2,2:760\n1#3:762\n69#4:763\n69#4:766\n70#5:764\n70#5:767\n53#5,3:770\n22#6:765\n22#6:768\n30#7:769\n*S KotlinDebug\n*F\n+ 1 PullToRefresh.kt\nandroidx/compose/material3/pulltorefresh/PullToRefreshModifierNode\n*L\n246#1:756\n246#1:757,2\n247#1:759\n247#1:760,2\n269#1:763\n316#1:766\n269#1:764\n316#1:767\n322#1:770,3\n269#1:765\n316#1:768\n322#1:769\n*E\n"})
public final class q extends androidx.compose.ui.node.m implements androidx.compose.ui.input.nestedscroll.a {

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    public static final int f31974g3 = 8;

    @NotNull
    private final k3 H1;

    @NotNull
    private Function0<Unit> X;
    private boolean Y;

    @NotNull
    private r Z;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private float f31975p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    @NotNull
    private androidx.compose.ui.node.j f31976p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    @NotNull
    private final k3 f31977p2;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f31978w;

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode", f = "PullToRefresh.kt", i = {}, l = {a5.S0}, m = "animateToHidden", n = {}, s = {})
    static final class a extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f31979a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f31981c;

        a(kotlin.coroutines.d<? super a> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f31979a = obj;
            this.f31981c |= Integer.MIN_VALUE;
            return q.this.L9(this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode", f = "PullToRefresh.kt", i = {}, l = {371}, m = "animateToThreshold", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        /* synthetic */ Object f31982a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f31984c;

        b(kotlin.coroutines.d<? super b> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f31982a = obj;
            this.f31984c |= Integer.MIN_VALUE;
            return q.this.M9(this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$onAttach$1", f = "PullToRefresh.kt", i = {}, l = {com.planner5d.library.engine.input.b.f160571z3}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f31985a;

        c(kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return q.this.new c(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f31985a;
            if (i10 == 0) {
                ResultKt.m(obj);
                r rVarU9 = q.this.U9();
                float f10 = q.this.Y9() ? 1.0f : 0.0f;
                this.f31985a = 1;
                if (rVarU9.d(f10, this) == objL) {
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
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$onPostScroll$1", f = "PullToRefresh.kt", i = {}, l = {288}, m = "invokeSuspend", n = {}, s = {})
    static final class d extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f31987a;

        d(kotlin.coroutines.d<? super d> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return q.this.new d(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f31987a;
            if (i10 == 0) {
                ResultKt.m(obj);
                if (!q.this.U9().b()) {
                    r rVarU9 = q.this.U9();
                    float fX9 = q.this.X9() / q.this.W9();
                    this.f31987a = 1;
                    if (rVarU9.d(fX9, this) == objL) {
                        return objL;
                    }
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
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((d) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode", f = "PullToRefresh.kt", i = {}, l = {298}, m = "onPreFling-QWom1Mo", n = {}, s = {})
    static final class e extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        float f31989a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f31990b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f31992d;

        e(kotlin.coroutines.d<? super e> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f31990b = obj;
            this.f31992d |= Integer.MIN_VALUE;
            return q.this.a4(0L, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode", f = "PullToRefresh.kt", i = {0}, l = {345}, m = "onRelease", n = {"consumed"}, s = {"F$0"})
    static final class f extends kotlin.coroutines.jvm.internal.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        float f31993a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        /* synthetic */ Object f31994b;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f31996d;

        f(kotlin.coroutines.d<? super f> dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f31994b = obj;
            this.f31996d |= Integer.MIN_VALUE;
            return q.this.Z9(0.0f, this);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.pulltorefresh.PullToRefreshModifierNode$update$1", f = "PullToRefresh.kt", i = {}, l = {304, 306}, m = "invokeSuspend", n = {}, s = {})
    static final class g extends kotlin.coroutines.jvm.internal.o implements Function2<s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f31997a;

        g(kotlin.coroutines.d<? super g> dVar) {
            super(2, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return q.this.new g(dVar);
        }

        /* JADX WARN: Code restructure failed: missing block: B:13:0x0036, code lost:
        
            if (r6.L9(r5) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:16:0x0043, code lost:
        
            if (r6.M9(r5) == r0) goto L17;
         */
        /* JADX WARN: Code restructure failed: missing block: B:17:0x0045, code lost:
        
            return r0;
         */
        @Override // kotlin.coroutines.jvm.internal.a
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct add '--show-bad-code' argument
        */
        public final java.lang.Object invokeSuspend(java.lang.Object r6) {
            /*
                r5 = this;
                java.lang.Object r0 = kotlin.coroutines.intrinsics.b.l()
                int r1 = r5.f31997a
                r2 = 2
                r3 = 1
                r4 = r3
                if (r1 == 0) goto L20
                if (r1 == r3) goto L1b
                if (r1 != r2) goto L11
                r4 = 4
                goto L1b
            L11:
                r4 = 2
                java.lang.IllegalStateException r5 = new java.lang.IllegalStateException
                java.lang.String r6 = "call to 'resume' before 'invoke' with coroutine"
                r5.<init>(r6)
                r4 = 2
                throw r5
            L1b:
                kotlin.ResultKt.m(r6)
                r4 = 5
                goto L46
            L20:
                r4 = 7
                kotlin.ResultKt.m(r6)
                r4 = 2
                androidx.compose.material3.pulltorefresh.q r6 = androidx.compose.material3.pulltorefresh.q.this
                boolean r6 = r6.Y9()
                if (r6 != 0) goto L39
                r4 = 2
                androidx.compose.material3.pulltorefresh.q r6 = androidx.compose.material3.pulltorefresh.q.this
                r5.f31997a = r3
                java.lang.Object r5 = androidx.compose.material3.pulltorefresh.q.G9(r6, r5)
                if (r5 != r0) goto L46
                goto L45
            L39:
                androidx.compose.material3.pulltorefresh.q r6 = androidx.compose.material3.pulltorefresh.q.this
                r4 = 6
                r5.f31997a = r2
                java.lang.Object r5 = androidx.compose.material3.pulltorefresh.q.H9(r6, r5)
                r4 = 0
                if (r5 != r0) goto L46
            L45:
                return r0
            L46:
                kotlin.Unit r5 = kotlin.Unit.f312394a
                r4 = 1
                return r5
            */
            throw new UnsupportedOperationException("Method not decompiled: androidx.compose.material3.pulltorefresh.q.g.invokeSuspend(java.lang.Object):java.lang.Object");
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((g) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public /* synthetic */ q(boolean z10, Function0 function0, boolean z11, r rVar, float f10, DefaultConstructorMarker defaultConstructorMarker) {
        this(z10, function0, z11, rVar, f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r6v2, types: [java.lang.Object, kotlin.Unit] */
    public final Object L9(kotlin.coroutines.d<? super Unit> dVar) {
        a aVar;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i10 = aVar.f31981c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                aVar.f31981c = i10 - Integer.MIN_VALUE;
            } else {
                aVar = new a(dVar);
            }
        } else {
            aVar = new a(dVar);
        }
        Object obj = aVar.f31979a;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = aVar.f31981c;
        try {
            if (i11 == 0) {
                ResultKt.m(obj);
                r rVar = this.Z;
                aVar.f31981c = 1;
                if (rVar.c(aVar) == objL) {
                    return objL;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            aa(0.0f);
            ga(0.0f);
            this = Unit.f312394a;
            return this;
        } catch (Throwable th2) {
            this.aa(0.0f);
            this.ga(0.0f);
            throw th2;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0015  */
    public final Object M9(kotlin.coroutines.d<? super Unit> dVar) {
        b bVar;
        if (dVar instanceof b) {
            bVar = (b) dVar;
            int i10 = bVar.f31984c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                bVar.f31984c = i10 - Integer.MIN_VALUE;
            } else {
                bVar = new b(dVar);
            }
        } else {
            bVar = new b(dVar);
        }
        Object obj = bVar.f31982a;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = bVar.f31984c;
        try {
            if (i11 == 0) {
                ResultKt.m(obj);
                r rVar = this.Z;
                bVar.f31984c = 1;
                if (rVar.e(bVar) == objL) {
                    return objL;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            if (a9()) {
                aa(W9());
                ga(W9());
            }
            return Unit.f312394a;
        } catch (Throwable th2) {
            if (a9()) {
                aa(W9());
                ga(W9());
            }
            throw th2;
        }
    }

    private final float N9() {
        if (P9() <= W9()) {
            return P9();
        }
        float fH = kotlin.ranges.r.H(Math.abs(T9()) - 1.0f, 0.0f, 2.0f);
        return W9() + (W9() * (fH - (((float) Math.pow(fH, 2)) / 4)));
    }

    private final long O9(long j10) {
        float fQ9;
        if (this.f31978w) {
            fQ9 = 0.0f;
        } else {
            float fT = kotlin.ranges.r.t(Q9() + Float.intBitsToFloat((int) (j10 & k0.f265952a)), 0.0f);
            fQ9 = fT - Q9();
            aa(fT);
            ga(N9());
        }
        return n0.g.g((((long) Float.floatToRawIntBits(0.0f)) << 32) | (((long) Float.floatToRawIntBits(fQ9)) & k0.f265952a));
    }

    private final float P9() {
        return Q9() * 0.5f;
    }

    private final float Q9() {
        return this.f31977p2.V0();
    }

    private final float T9() {
        return P9() / W9();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int W9() {
        return androidx.compose.ui.node.k.q(this).g6(this.f31975p0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final float X9() {
        return this.H1.V0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    public final Object Z9(float f10, kotlin.coroutines.d<? super Float> dVar) {
        f fVar;
        if (dVar instanceof f) {
            fVar = (f) dVar;
            int i10 = fVar.f31996d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                fVar.f31996d = i10 - Integer.MIN_VALUE;
            } else {
                fVar = new f(dVar);
            }
        } else {
            fVar = new f(dVar);
        }
        Object obj = fVar.f31994b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = fVar.f31996d;
        if (i11 == 0) {
            ResultKt.m(obj);
            if (this.f31978w) {
                return kotlin.coroutines.jvm.internal.b.e(0.0f);
            }
            if (P9() > W9()) {
                this.X.invoke();
            }
            if (Q9() == 0.0f || f10 < 0.0f) {
                f10 = 0.0f;
            }
            fVar.f31993a = f10;
            fVar.f31996d = 1;
            if (L9(fVar) == objL) {
                return objL;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f10 = fVar.f31993a;
            ResultKt.m(obj);
        }
        aa(0.0f);
        return kotlin.coroutines.jvm.internal.b.e(f10);
    }

    private final void aa(float f10) {
        this.f31977p2.q(f10);
    }

    private final void ga(float f10) {
        this.H1.q(f10);
    }

    @Override // androidx.compose.ui.input.nestedscroll.a
    public long G7(long j10, int i10) {
        if (!this.Z.b() && this.Y) {
            return (!androidx.compose.ui.input.nestedscroll.f.j(i10, androidx.compose.ui.input.nestedscroll.f.f38949b.h()) || Float.intBitsToFloat((int) (k0.f265952a & j10)) >= 0.0f) ? n0.g.f332700b.e() : O9(j10);
        }
        return n0.g.f332700b.e();
    }

    public final boolean R9() {
        return this.Y;
    }

    @NotNull
    public final Function0<Unit> S9() {
        return this.X;
    }

    @NotNull
    public final r U9() {
        return this.Z;
    }

    public final float V9() {
        return this.f31975p0;
    }

    @Override // androidx.compose.ui.a0.d
    public boolean X8() {
        return false;
    }

    public final boolean Y9() {
        return this.f31978w;
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    @Override // androidx.compose.ui.input.nestedscroll.a
    @Nullable
    public Object a4(long j10, @NotNull kotlin.coroutines.d<? super c0> dVar) {
        e eVar;
        float f10;
        if (dVar instanceof e) {
            eVar = (e) dVar;
            int i10 = eVar.f31992d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                eVar.f31992d = i10 - Integer.MIN_VALUE;
            } else {
                eVar = new e(dVar);
            }
        } else {
            eVar = new e(dVar);
        }
        Object objZ9 = eVar.f31990b;
        Object objL = kotlin.coroutines.intrinsics.b.l();
        int i11 = eVar.f31992d;
        if (i11 == 0) {
            ResultKt.m(objZ9);
            float fN = c0.n(j10);
            eVar.f31989a = 0.0f;
            eVar.f31992d = 1;
            objZ9 = Z9(fN, eVar);
            if (objZ9 == objL) {
                return objL;
            }
            f10 = 0.0f;
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            f10 = eVar.f31989a;
            ResultKt.m(objZ9);
        }
        return c0.b(d0.a(f10, ((Number) objZ9).floatValue()));
    }

    @Override // androidx.compose.ui.input.nestedscroll.a
    public long b2(long j10, long j11, int i10) {
        if (!this.Z.b() && this.Y && androidx.compose.ui.input.nestedscroll.f.j(i10, androidx.compose.ui.input.nestedscroll.f.f38949b.h())) {
            long jO9 = O9(j11);
            kotlinx.coroutines.k.f(Q8(), null, null, new d(null), 3, null);
            return jO9;
        }
        return n0.g.f332700b.e();
    }

    public final void ba(boolean z10) {
        this.Y = z10;
    }

    public final void ca(@NotNull Function0<Unit> function0) {
        this.X = function0;
    }

    public final void da(boolean z10) {
        this.f31978w = z10;
    }

    @Override // androidx.compose.ui.a0.d
    public void e9() {
        v9(this.f31976p1);
        kotlinx.coroutines.k.f(Q8(), null, null, new c(null), 3, null);
        ga(this.f31978w ? W9() : 0.0f);
    }

    public final void ea(@NotNull r rVar) {
        this.Z = rVar;
    }

    public final void fa(float f10) {
        this.f31975p0 = f10;
    }

    public final void ha() {
        kotlinx.coroutines.k.f(Q8(), null, null, new g(null), 3, null);
    }

    private q(boolean z10, Function0<Unit> function0, boolean z11, r rVar, float f10) {
        this.f31978w = z10;
        this.X = function0;
        this.Y = z11;
        this.Z = rVar;
        this.f31975p0 = f10;
        this.f31976p1 = androidx.compose.ui.input.nestedscroll.e.c(this, null);
        this.H1 = g4.b(0.0f);
        this.f31977p2 = g4.b(0.0f);
    }
}

package androidx.compose.material3;

import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@af
@androidx.compose.runtime.internal.w0(parameters = 0)
@SourceDebugExtension({"SMAP\nSlider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Slider.kt\nandroidx/compose/material3/SliderState\n+ 2 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n+ 5 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 6 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 7 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 8 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n*L\n1#1,3223:1\n81#2:3224\n114#2,2:3225\n81#2:3249\n114#2,2:3250\n81#2:3252\n114#2,2:3253\n1#3:3227\n78#4:3228\n111#4,2:3229\n78#4:3231\n111#4,2:3232\n78#4:3234\n111#4,2:3235\n78#4:3237\n111#4,2:3238\n85#5:3240\n117#5,2:3241\n69#6:3243\n65#6:3246\n70#7:3244\n60#7:3247\n22#8:3245\n22#8:3248\n*S KotlinDebug\n*F\n+ 1 Slider.kt\nandroidx/compose/material3/SliderState\n*L\n2737#1:3224\n2737#1:3225,2\n2842#1:3249\n2842#1:3250,2\n2843#1:3252\n2843#1:3253,2\n2800#1:3228\n2800#1:3229,2\n2801#1:3231\n2801#1:3232,2\n2803#1:3234\n2803#1:3235,2\n2804#1:3237\n2804#1:3238,2\n2817#1:3240\n2817#1:3241,2\n2835#1:3243\n2837#1:3246\n2835#1:3244\n2837#1:3247\n2835#1:3245\n2837#1:3248\n*E\n"})
public final class t00 implements androidx.compose.foundation.gestures.a3 {

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    @NotNull
    public static final a f33026u = new a(null);

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f33027v = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f33028a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private Function0<Unit> f33029b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final kotlin.ranges.f<Float> f33030c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.k3 f33031d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @Nullable
    private Function1<? super Float, Unit> f33032e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f33033f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final float[] f33034g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.l3 f33035h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.l3 f33036i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f33037j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.l3 f33038k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.l3 f33039l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private androidx.compose.foundation.gestures.q3 f33040m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f33041n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.n3 f33042o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    private final Function0<Unit> f33043p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.k3 f33044q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.k3 f33045r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private final androidx.compose.foundation.gestures.k2 f33046s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    private final androidx.compose.foundation.s3 f33047t;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List d(androidx.compose.runtime.saveable.g0 g0Var, t00 t00Var) {
            return CollectionsKt.listOf(Float.valueOf(t00Var.x()), Integer.valueOf(t00Var.r()));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final t00 e(Function0 function0, kotlin.ranges.f fVar, List list) {
            Object obj = list.get(0);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Float");
            float fFloatValue = ((Float) obj).floatValue();
            Object obj2 = list.get(1);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Int");
            return new t00(fFloatValue, ((Integer) obj2).intValue(), function0, fVar);
        }

        @NotNull
        public final androidx.compose.runtime.saveable.c0<t00, ?> c(@Nullable final Function0<Unit> function0, @NotNull final kotlin.ranges.f<Float> fVar) {
            return androidx.compose.runtime.saveable.b.b(new Function2() { // from class: androidx.compose.material3.r00
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return t00.a.d((androidx.compose.runtime.saveable.g0) obj, (t00) obj2);
                }
            }, new Function1() { // from class: androidx.compose.material3.s00
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return t00.a.e(function0, fVar, (List) obj);
                }
            });
        }

        private a() {
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.SliderState$drag$2", f = "Slider.kt", i = {}, l = {2766}, m = "invokeSuspend", n = {}, s = {})
    static final class b extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f33048a;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.q3 f33050c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.foundation.gestures.k2, kotlin.coroutines.d<? super Unit>, Object> f33051d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        b(androidx.compose.foundation.q3 q3Var, Function2<? super androidx.compose.foundation.gestures.k2, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, kotlin.coroutines.d<? super b> dVar) {
            super(2, dVar);
            this.f33050c = q3Var;
            this.f33051d = function2;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return t00.this.new b(this.f33050c, this.f33051d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f33048a;
            if (i10 == 0) {
                ResultKt.m(obj);
                t00.this.F(true);
                androidx.compose.foundation.s3 s3Var = t00.this.f33047t;
                androidx.compose.foundation.gestures.k2 k2Var = t00.this.f33046s;
                androidx.compose.foundation.q3 q3Var = this.f33050c;
                Function2<androidx.compose.foundation.gestures.k2, kotlin.coroutines.d<? super Unit>, Object> function2 = this.f33051d;
                this.f33048a = 1;
                if (s3Var.f(k2Var, q3Var, function2, this) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            t00.this.F(false);
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((b) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public static final class c implements androidx.compose.foundation.gestures.k2 {
        c() {
        }

        @Override // androidx.compose.foundation.gestures.k2
        public void a(float f10) {
            t00.this.b(f10);
        }
    }

    public t00() {
        this(0.0f, 0, null, null, 15, null);
    }

    private final float D(float f10, float f11, float f12) {
        return j00.C0(this.f33030c.u().floatValue(), this.f33030c.i().floatValue(), f12, f10, f11);
    }

    private final float E(float f10, float f11, float f12) {
        return j00.C0(f10, f11, f12, this.f33030c.u().floatValue(), this.f33030c.i().floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void F(boolean z10) {
        this.f33042o.setValue(Boolean.valueOf(z10));
    }

    private final void J(float f10) {
        this.f33045r.q(f10);
    }

    private final void K(float f10) {
        this.f33044q.q(f10);
    }

    private final void Q(int i10) {
        this.f33036i.j(i10);
    }

    private final void R(int i10) {
        this.f33035h.j(i10);
    }

    private final void T(float f10) {
        this.f33031d.q(f10);
    }

    private final float h(float f10) {
        return j00.J0(kotlin.ranges.r.H(f10, this.f33030c.u().floatValue(), this.f33030c.i().floatValue()), this.f33034g, this.f33030c.u().floatValue(), this.f33030c.i().floatValue());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(t00 t00Var) {
        Function0<Unit> function0;
        if (!t00Var.A() && (function0 = t00Var.f33029b) != null) {
            function0.invoke();
        }
        return Unit.f312394a;
    }

    private final float o() {
        return this.f33045r.V0();
    }

    private final float p() {
        return this.f33044q.V0();
    }

    private final int v() {
        return this.f33036i.m1();
    }

    private final int w() {
        return this.f33035h.m1();
    }

    private final float z() {
        return this.f33031d.V0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean A() {
        return ((Boolean) this.f33042o.getValue()).booleanValue();
    }

    public final boolean B() {
        return this.f33037j;
    }

    public final void C(long j10) {
        float fIntBitsToFloat;
        float fW;
        float fIntBitsToFloat2;
        if (this.f33040m == androidx.compose.foundation.gestures.q3.Vertical) {
            if (this.f33041n) {
                fW = v();
                fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 & com.rabbitmq.client.k0.f265952a));
                fIntBitsToFloat = fW - fIntBitsToFloat2;
            } else {
                fIntBitsToFloat = Float.intBitsToFloat((int) (j10 & com.rabbitmq.client.k0.f265952a));
            }
        } else if (this.f33037j) {
            fW = w();
            fIntBitsToFloat2 = Float.intBitsToFloat((int) (j10 >> 32));
            fIntBitsToFloat = fW - fIntBitsToFloat2;
        } else {
            fIntBitsToFloat = Float.intBitsToFloat((int) (j10 >> 32));
        }
        J(fIntBitsToFloat - p());
    }

    public final void G(@Nullable Function1<? super Float, Unit> function1) {
        this.f33032e = function1;
    }

    public final void H(@Nullable Function0<Unit> function0) {
        this.f33029b = function0;
    }

    public final void I(@NotNull androidx.compose.foundation.gestures.q3 q3Var) {
        this.f33040m = q3Var;
    }

    public final void L(boolean z10) {
        this.f33041n = z10;
    }

    public final void M(boolean z10) {
        this.f33037j = z10;
    }

    public final void N(boolean z10) {
        this.f33033f = z10;
    }

    public final void O(int i10) {
        this.f33039l.j(i10);
    }

    public final void P(int i10) {
        this.f33038k.j(i10);
    }

    public final void S(float f10) {
        if (this.f33033f) {
            f10 = h(f10);
        }
        T(f10);
    }

    @oj.i(name = "shouldAutoSnap")
    public final boolean U() {
        return this.f33033f;
    }

    public final void V(int i10, int i11) {
        R(i10);
        Q(i11);
    }

    @Override // androidx.compose.foundation.gestures.a3
    @Nullable
    public Object a(@NotNull androidx.compose.foundation.q3 q3Var, @NotNull Function2<? super androidx.compose.foundation.gestures.k2, ? super kotlin.coroutines.d<? super Unit>, ? extends Object> function2, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objG = kotlinx.coroutines.t0.g(new b(q3Var, function2, null), dVar);
        return objG == kotlin.coroutines.intrinsics.b.l() ? objG : Unit.f312394a;
    }

    @Override // androidx.compose.foundation.gestures.a3
    public void b(float f10) {
        float fMax;
        float fMin;
        if (this.f33040m == androidx.compose.foundation.gestures.q3.Vertical) {
            fMax = Math.max(v() - (s() / 2.0f), 0.0f);
            fMin = Math.min(s() / 2.0f, fMax);
        } else {
            fMax = Math.max(w() - (t() / 2.0f), 0.0f);
            fMin = Math.min(t() / 2.0f, fMax);
        }
        K(p() + f10 + o());
        J(0.0f);
        float fE = E(fMin, fMax, j00.J0(p(), this.f33034g, fMin, fMax));
        if (fE == x()) {
            return;
        }
        Function1<? super Float, Unit> function1 = this.f33032e;
        if (function1 == null) {
            S(fE);
        } else {
            if (function1 != null) {
                function1.invoke(Float.valueOf(fE));
            }
        }
    }

    public final float j() {
        return j00.k0(this.f33030c.u().floatValue(), this.f33030c.i().floatValue(), kotlin.ranges.r.H(x(), this.f33030c.u().floatValue(), this.f33030c.i().floatValue()));
    }

    @NotNull
    public final Function0<Unit> k() {
        return this.f33043p;
    }

    @Nullable
    public final Function1<Float, Unit> l() {
        return this.f33032e;
    }

    @Nullable
    public final Function0<Unit> m() {
        return this.f33029b;
    }

    @NotNull
    public final androidx.compose.foundation.gestures.q3 n() {
        return this.f33040m;
    }

    public final boolean q() {
        return this.f33041n;
    }

    public final int r() {
        return this.f33028a;
    }

    public final int s() {
        return this.f33039l.m1();
    }

    public final int t() {
        return this.f33038k.m1();
    }

    @NotNull
    public final float[] u() {
        return this.f33034g;
    }

    public final float x() {
        return z();
    }

    @NotNull
    public final kotlin.ranges.f<Float> y() {
        return this.f33030c;
    }

    public t00(float f10, @androidx.annotation.g0(from = 0) int i10, @Nullable Function0<Unit> function0, @NotNull kotlin.ranges.f<Float> fVar) {
        this.f33028a = i10;
        this.f33029b = function0;
        this.f33030c = fVar;
        this.f33031d = androidx.compose.runtime.g4.b(f10);
        this.f33033f = true;
        this.f33034g = j00.K0(i10);
        this.f33035h = androidx.compose.runtime.e6.b(0);
        this.f33036i = androidx.compose.runtime.e6.b(0);
        this.f33038k = androidx.compose.runtime.e6.b(0);
        this.f33039l = androidx.compose.runtime.e6.b(0);
        this.f33040m = androidx.compose.foundation.gestures.q3.Horizontal;
        this.f33042o = androidx.compose.runtime.d7.g(Boolean.FALSE, null, 2, null);
        this.f33043p = new Function0() { // from class: androidx.compose.material3.q00
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return t00.i(this.f32053a);
            }
        };
        this.f33044q = androidx.compose.runtime.g4.b(D(0.0f, 0.0f, f10));
        this.f33045r = androidx.compose.runtime.g4.b(0.0f);
        this.f33046s = new c();
        this.f33047t = new androidx.compose.foundation.s3();
    }

    public /* synthetic */ t00(float f10, int i10, Function0 function0, kotlin.ranges.f fVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0.0f : f10, (i11 & 2) != 0 ? 0 : i10, (i11 & 4) != 0 ? null : function0, (i11 & 8) != 0 ? kotlin.ranges.r.e(0.0f, 1.0f) : fVar);
    }
}

package androidx.compose.material3;

import java.util.List;
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
@SourceDebugExtension({"SMAP\nSlider.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Slider.kt\nandroidx/compose/material3/RangeSliderState\n+ 2 SnapshotFloatState.kt\nandroidx/compose/runtime/PrimitiveSnapshotStateKt__SnapshotFloatStateKt\n+ 3 SnapshotIntState.kt\nandroidx/compose/runtime/SnapshotIntStateKt__SnapshotIntStateKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,3223:1\n81#2:3224\n114#2,2:3225\n81#2:3227\n114#2,2:3228\n81#2:3230\n114#2,2:3231\n81#2:3233\n114#2,2:3234\n81#2:3236\n114#2,2:3237\n81#2:3239\n114#2,2:3240\n81#2:3245\n114#2,2:3246\n81#2:3248\n114#2,2:3249\n81#2:3257\n114#2,2:3258\n81#2:3260\n114#2,2:3261\n78#3:3242\n111#3,2:3243\n85#4:3251\n117#4,2:3252\n85#4:3254\n117#4,2:3255\n1#5:3263\n*S KotlinDebug\n*F\n+ 1 Slider.kt\nandroidx/compose/material3/RangeSliderState\n*L\n2948#1:3224\n2948#1:3225,2\n2949#1:3227\n2949#1:3228,2\n2985#1:3230\n2985#1:3231,2\n2986#1:3233\n2986#1:3234,2\n2987#1:3236\n2987#1:3237,2\n2988#1:3239\n2988#1:3240,2\n2990#1:3245\n2990#1:3246,2\n2991#1:3248\n2991#1:3249,2\n2998#1:3257\n2998#1:3258,2\n2999#1:3260\n2999#1:3261,2\n2989#1:3242\n2989#1:3243,2\n2992#1:3251\n2992#1:3252,2\n2994#1:3254\n2994#1:3255,2\n*E\n"})
public final class bt {

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @NotNull
    public static final a f26346t = new a(null);

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final int f26347u = 8;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f26348a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @Nullable
    private Function0<Unit> f26349b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private final kotlin.ranges.f<Float> f26350c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.k3 f26351d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.k3 f26352e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @Nullable
    private Function1<? super p00, Unit> f26353f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    @NotNull
    private final float[] f26354g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.k3 f26355h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.k3 f26356i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.k3 f26357j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.k3 f26358k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.l3 f26359l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.k3 f26360m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.k3 f26361n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.n3 f26362o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.n3 f26363p;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    @NotNull
    private final Function1<Boolean, Unit> f26364q;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.k3 f26365r;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NotNull
    private final androidx.compose.runtime.k3 f26366s;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final List d(androidx.compose.runtime.saveable.g0 g0Var, bt btVar) {
            return CollectionsKt.listOf(Float.valueOf(btVar.e()), Float.valueOf(btVar.c()), Integer.valueOf(btVar.v()));
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final bt e(Function0 function0, kotlin.ranges.f fVar, List list) {
            Object obj = list.get(0);
            Intrinsics.checkNotNull(obj, "null cannot be cast to non-null type kotlin.Float");
            float fFloatValue = ((Float) obj).floatValue();
            Object obj2 = list.get(1);
            Intrinsics.checkNotNull(obj2, "null cannot be cast to non-null type kotlin.Float");
            float fFloatValue2 = ((Float) obj2).floatValue();
            int i10 = 7 << 2;
            Object obj3 = list.get(2);
            Intrinsics.checkNotNull(obj3, "null cannot be cast to non-null type kotlin.Int");
            return new bt(fFloatValue, fFloatValue2, ((Integer) obj3).intValue(), function0, fVar);
        }

        @NotNull
        public final androidx.compose.runtime.saveable.c0<bt, ?> c(@Nullable final Function0<Unit> function0, @NotNull final kotlin.ranges.f<Float> fVar) {
            return androidx.compose.runtime.saveable.b.b(new Function2() { // from class: androidx.compose.material3.zs
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return bt.a.d((androidx.compose.runtime.saveable.g0) obj, (bt) obj2);
                }
            }, new Function1() { // from class: androidx.compose.material3.at
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return bt.a.e(function0, fVar, (List) obj);
                }
            });
        }

        private a() {
        }
    }

    public bt() {
        this(0.0f, 0.0f, 0, null, null, 31, null);
    }

    private final float C(float f10, float f11, float f12) {
        return j00.C0(this.f26350c.u().floatValue(), this.f26350c.i().floatValue(), f12, f10, f11);
    }

    private final long D(boolean z10, float f10, float f11, long j10) {
        return j00.D0(z10, f10, f11, j10, this.f26350c.u().floatValue(), this.f26350c.i().floatValue());
    }

    private final void F(float f10) {
        this.f26352e.q(f10);
    }

    private final void H(float f10) {
        this.f26351d.q(f10);
    }

    private final void L(float f10) {
        this.f26365r.q(f10);
    }

    private final void M(float f10) {
        this.f26366s.q(f10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b(bt btVar, boolean z10) {
        Function0<Unit> function0 = btVar.f26349b;
        if (function0 != null) {
            function0.invoke();
        }
        return Unit.f312394a;
    }

    private final float d() {
        return this.f26352e.V0();
    }

    private final float f() {
        return this.f26351d.V0();
    }

    private final float m() {
        return this.f26365r.V0();
    }

    private final float n() {
        return this.f26366s.V0();
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean A() {
        return ((Boolean) this.f26363p.getValue()).booleanValue();
    }

    public final void B(boolean z10, float f10) {
        long jU;
        if (z10) {
            Q(r() + f10);
            P(C(n(), m(), c()));
            float fQ = q();
            jU = j00.U(kotlin.ranges.r.A(j00.J0(kotlin.ranges.r.H(r(), n(), fQ), this.f26354g, n(), m()), fQ), fQ);
        } else {
            P(q() + f10);
            Q(C(n(), m(), e()));
            float fR = r();
            jU = j00.U(fR, kotlin.ranges.r.t(j00.J0(kotlin.ranges.r.H(q(), fR, m()), this.f26354g, n(), m()), fR));
        }
        long jD = D(z10, n(), m(), jU);
        if (p00.e(jD, j00.U(e(), c()))) {
            return;
        }
        Function1<? super p00, Unit> function1 = this.f26353f;
        if (function1 == null) {
            G(p00.j(jD));
            E(p00.g(jD));
        } else if (function1 != null) {
            function1.invoke(p00.b(jD));
        }
    }

    public final void E(float f10) {
        F(j00.J0(kotlin.ranges.r.H(f10, e(), this.f26350c.i().floatValue()), this.f26354g, this.f26350c.u().floatValue(), this.f26350c.i().floatValue()));
    }

    public final void G(float f10) {
        H(j00.J0(kotlin.ranges.r.H(f10, this.f26350c.u().floatValue(), c()), this.f26354g, this.f26350c.u().floatValue(), this.f26350c.i().floatValue()));
    }

    public final void I(boolean z10) {
        this.f26362o.setValue(Boolean.valueOf(z10));
    }

    public final void J(float f10) {
        this.f26358k.q(f10);
    }

    public final void K(float f10) {
        this.f26357j.q(f10);
    }

    public final void N(@Nullable Function1<? super p00, Unit> function1) {
        this.f26353f = function1;
    }

    public final void O(@Nullable Function0<Unit> function0) {
        this.f26349b = function0;
    }

    public final void P(float f10) {
        this.f26361n.q(f10);
    }

    public final void Q(float f10) {
        this.f26360m.q(f10);
    }

    public final void R(boolean z10) {
        this.f26363p.setValue(Boolean.valueOf(z10));
    }

    public final void S(float f10) {
        this.f26356i.q(f10);
    }

    public final void T(float f10) {
        this.f26355h.q(f10);
    }

    public final void U(int i10) {
        this.f26359l.j(i10);
    }

    public final void V() {
        float f10 = 2;
        float fMax = Math.max(x() - (k() / f10), 0.0f);
        float fMin = Math.min(u() / f10, fMax);
        if (z()) {
            return;
        }
        if (n() == fMin && m() == fMax && e() == c()) {
            return;
        }
        M(fMin);
        L(fMax);
        Q(C(n(), m(), e()));
        P(C(n(), m(), c()));
    }

    public final float c() {
        return d();
    }

    public final float e() {
        return f();
    }

    public final float g() {
        return j00.k0(this.f26350c.u().floatValue(), this.f26350c.i().floatValue(), c());
    }

    public final float h() {
        return j00.k0(this.f26350c.u().floatValue(), this.f26350c.i().floatValue(), e());
    }

    public final int i() {
        return (int) Math.floor(this.f26348a * (1.0f - h()));
    }

    public final float j() {
        return this.f26358k.V0();
    }

    public final float k() {
        return this.f26357j.V0();
    }

    @NotNull
    public final Function1<Boolean, Unit> l() {
        return this.f26364q;
    }

    @Nullable
    public final Function1<p00, Unit> o() {
        return this.f26353f;
    }

    @Nullable
    public final Function0<Unit> p() {
        return this.f26349b;
    }

    public final float q() {
        return this.f26361n.V0();
    }

    public final float r() {
        return this.f26360m.V0();
    }

    public final int s() {
        return (int) Math.floor(this.f26348a * g());
    }

    public final float t() {
        return this.f26356i.V0();
    }

    public final float u() {
        return this.f26355h.V0();
    }

    public final int v() {
        return this.f26348a;
    }

    @NotNull
    public final float[] w() {
        return this.f26354g;
    }

    public final int x() {
        return this.f26359l.m1();
    }

    @NotNull
    public final kotlin.ranges.f<Float> y() {
        return this.f26350c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public final boolean z() {
        return ((Boolean) this.f26362o.getValue()).booleanValue();
    }

    public bt(float f10, float f11, @androidx.annotation.g0(from = 0) int i10, @Nullable Function0<Unit> function0, @NotNull kotlin.ranges.f<Float> fVar) {
        this.f26348a = i10;
        this.f26349b = function0;
        this.f26350c = fVar;
        this.f26351d = androidx.compose.runtime.g4.b(f10);
        this.f26352e = androidx.compose.runtime.g4.b(f11);
        this.f26354g = j00.K0(i10);
        this.f26355h = androidx.compose.runtime.g4.b(0.0f);
        this.f26356i = androidx.compose.runtime.g4.b(0.0f);
        this.f26357j = androidx.compose.runtime.g4.b(0.0f);
        this.f26358k = androidx.compose.runtime.g4.b(0.0f);
        this.f26359l = androidx.compose.runtime.e6.b(0);
        this.f26360m = androidx.compose.runtime.g4.b(0.0f);
        this.f26361n = androidx.compose.runtime.g4.b(0.0f);
        Boolean bool = Boolean.FALSE;
        this.f26362o = androidx.compose.runtime.d7.g(bool, null, 2, null);
        this.f26363p = androidx.compose.runtime.d7.g(bool, null, 2, null);
        this.f26364q = new Function1() { // from class: androidx.compose.material3.ys
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return bt.b(this.f34829a, ((Boolean) obj).booleanValue());
            }
        };
        this.f26365r = androidx.compose.runtime.g4.b(0.0f);
        this.f26366s = androidx.compose.runtime.g4.b(0.0f);
    }

    public /* synthetic */ bt(float f10, float f11, int i10, Function0 function0, kotlin.ranges.f fVar, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this((i11 & 1) != 0 ? 0.0f : f10, (i11 & 2) != 0 ? 1.0f : f11, (i11 & 4) != 0 ? 0 : i10, (i11 & 8) != 0 ? null : function0, (i11 & 16) != 0 ? kotlin.ranges.r.e(0.0f, 1.0f) : fVar);
    }
}

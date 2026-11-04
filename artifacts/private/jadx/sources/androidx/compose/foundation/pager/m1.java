package androidx.compose.foundation.pager;

import androidx.compose.animation.core.f3;
import androidx.compose.foundation.gestures.q3;
import androidx.compose.foundation.gestures.z3;
import androidx.media3.exoplayer.a5;
import java.util.Map;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nPagerState.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PagerState.kt\nandroidx/compose/foundation/pager/PagerStateKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 6 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,999:1\n902#1,4:1011\n902#1,4:1019\n902#1,4:1023\n902#1,4:1027\n1282#2,6:1000\n1#3:1006\n54#4:1007\n59#4:1009\n54#4:1015\n59#4:1017\n85#5:1008\n90#5:1010\n85#5:1016\n90#5:1018\n113#6:1031\n*S KotlinDebug\n*F\n+ 1 PagerState.kt\nandroidx/compose/foundation/pager/PagerStateKt\n*L\n933#1:1011,4\n979#1:1019,4\n990#1:1023,4\n995#1:1027,4\n91#1:1000,6\n913#1:1007\n913#1:1009\n943#1:1015\n943#1:1017\n913#1:1008\n913#1:1010\n943#1:1016\n943#1:1018\n859#1:1031\n*E\n"})
public final class m1 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f18378b = 3;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int f18379c = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f18377a = androidx.compose.ui.unit.h.r(56);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final u0 f18380d = new u0(CollectionsKt.emptyList(), 0, 0, 0, q3.Horizontal, 0, 0, false, 0, null, null, 0.0f, 0, false, androidx.compose.foundation.gestures.snapping.o.c.f15103a, new a(), false, null, null, kotlinx.coroutines.t0.a(kotlin.coroutines.h.f312451a), 393216, null);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private static final b f18381e = new b();

    public static final class a implements androidx.compose.ui.layout.b1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f18382a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f18383b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Map<androidx.compose.ui.layout.a, Integer> f18384c = MapsKt.emptyMap();

        a() {
        }

        public static /* synthetic */ void a() {
        }

        @Override // androidx.compose.ui.layout.b1
        public int getHeight() {
            return this.f18383b;
        }

        @Override // androidx.compose.ui.layout.b1
        public int getWidth() {
            return this.f18382a;
        }

        @Override // androidx.compose.ui.layout.b1
        public Map<androidx.compose.ui.layout.a, Integer> x() {
            return this.f18384c;
        }

        @Override // androidx.compose.ui.layout.b1
        public void y() {
        }
    }

    public static final class b implements androidx.compose.ui.unit.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final float f18385a = 1.0f;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final float f18386b = 1.0f;

        b() {
        }

        @Override // androidx.compose.ui.unit.d
        public float getDensity() {
            return this.f18385a;
        }

        @Override // androidx.compose.ui.unit.n
        public float m0() {
            return this.f18386b;
        }
    }

    @NotNull
    public static final i1 c(int i10, @androidx.annotation.x(from = -0.5d, to = 0.5d) float f10, @NotNull Function0<Integer> function0) {
        return new e(i10, f10, function0);
    }

    public static /* synthetic */ i1 d(int i10, float f10, Function0 function0, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            i10 = 0;
        }
        if ((i11 & 2) != 0) {
            f10 = 0.0f;
        }
        return c(i10, f10, function0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Object h(final androidx.compose.foundation.lazy.layout.m1 m1Var, int i10, float f10, androidx.compose.animation.core.o<Float> oVar, Function2<? super z3, ? super Integer, Unit> function2, kotlin.coroutines.d<? super Unit> dVar) {
        function2.invoke(m1Var, kotlin.coroutines.jvm.internal.b.f(i10));
        boolean z10 = i10 > m1Var.c();
        int iD = (m1Var.d() - m1Var.c()) + 1;
        if (((z10 && i10 > m1Var.d()) || (!z10 && i10 < m1Var.c())) && Math.abs(i10 - m1Var.c()) >= 3) {
            m1Var.e(z10 ? kotlin.ranges.r.u(i10 - iD, m1Var.c()) : kotlin.ranges.r.B(iD + i10, m1Var.c()), 0);
        }
        float fB = androidx.compose.foundation.lazy.layout.m1.b(m1Var, i10, 0, 2, null) + f10;
        final kotlin.jvm.internal.i1.e eVar = new kotlin.jvm.internal.i1.e();
        Object objO = f3.o(0.0f, fB, 0.0f, oVar, new Function2() { // from class: androidx.compose.foundation.pager.l1
            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                return m1.i(eVar, m1Var, ((Float) obj).floatValue(), ((Float) obj2).floatValue());
            }
        }, dVar, 4, null);
        return objO == kotlin.coroutines.intrinsics.b.l() ? objO : Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(kotlin.jvm.internal.i1.e eVar, androidx.compose.foundation.lazy.layout.m1 m1Var, float f10, float f11) {
        eVar.f312748a += m1Var.f(f10 - eVar.f312748a);
        return Unit.f312394a;
    }

    @Nullable
    public static final Object j(@NotNull i1 i1Var, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objU;
        return (i1Var.E() + 1 >= i1Var.V() || (objU = i1.u(i1Var, i1Var.E() + 1, 0.0f, null, dVar, 6, null)) != kotlin.coroutines.intrinsics.b.l()) ? Unit.f312394a : objU;
    }

    @Nullable
    public static final Object k(@NotNull i1 i1Var, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
        Object objU;
        if (i1Var.E() - 1 >= 0 && (objU = i1.u(i1Var, i1Var.E() - 1, 0.0f, null, dVar, 6, null)) == kotlin.coroutines.intrinsics.b.l()) {
            return objU;
        }
        return Unit.f312394a;
    }

    public static final long l(@NotNull h0 h0Var, int i10) {
        long jX1 = (((((long) i10) * ((long) (h0Var.x1() + h0Var.t1()))) + ((long) h0Var.f())) + ((long) h0Var.b())) - ((long) h0Var.x1());
        int iA = (int) (h0Var.getOrientation() == q3.Horizontal ? h0Var.a() >> 32 : h0Var.a() & com.rabbitmq.client.k0.f265952a);
        return kotlin.ranges.r.v(jX1 - ((long) (iA - kotlin.ranges.r.I(h0Var.u1().a(iA, h0Var.t1(), h0Var.f(), h0Var.b(), i10 - 1, i10), 0, iA))), 0L);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long m(u0 u0Var, int i10) {
        int iA = (int) (u0Var.getOrientation() == q3.Horizontal ? u0Var.a() >> 32 : u0Var.a() & com.rabbitmq.client.k0.f265952a);
        return kotlin.ranges.r.I(u0Var.u1().a(iA, u0Var.t1(), u0Var.f(), u0Var.b(), 0, i10), 0, iA);
    }

    private static final void n(Function0<String> function0) {
    }

    public static final float o() {
        return f18377a;
    }

    @NotNull
    public static final u0 p() {
        return f18380d;
    }

    @androidx.compose.runtime.o
    @NotNull
    public static final i1 q(final int i10, @androidx.annotation.x(from = -0.5d, to = 0.5d) final float f10, @NotNull final Function0<Integer> function0, @Nullable androidx.compose.runtime.c0 c0Var, int i11, int i12) {
        if ((i12 & 1) != 0) {
            i10 = 0;
        }
        if ((i12 & 2) != 0) {
            f10 = 0.0f;
        }
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-1210768637, i11, -1, "androidx.compose.foundation.pager.rememberPagerState (PagerState.kt:89)");
        }
        Object[] objArr = new Object[0];
        androidx.compose.runtime.saveable.c0<e, ?> c0VarA = e.N.a();
        boolean z10 = true;
        boolean z11 = ((((i11 & 14) ^ 6) > 4 && c0Var.K(i10)) || (i11 & 6) == 4) | ((((i11 & com.planner5d.library.engine.input.f.b.B) ^ 48) > 32 && c0Var.I(f10)) || (i11 & 48) == 32);
        if ((((i11 & 896) ^ a5.S0) <= 256 || !c0Var.D(function0)) && (i11 & a5.S0) != 256) {
            z10 = false;
        }
        boolean z12 = z11 | z10;
        Object objI0 = c0Var.i0();
        if (z12 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
            objI0 = new Function0() { // from class: androidx.compose.foundation.pager.k1
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return m1.r(i10, f10, function0);
                }
            };
            c0Var.Y(objI0);
        }
        e eVar = (e) androidx.compose.runtime.saveable.i.j(objArr, c0VarA, (Function0) objI0, c0Var, 0);
        eVar.Y0().setValue(function0);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return eVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final e r(int i10, float f10, Function0 function0) {
        return new e(i10, f10, function0);
    }
}

package androidx.compose.foundation.lazy.staggeredgrid;

import androidx.compose.foundation.g1;
import androidx.compose.foundation.gestures.q3;
import androidx.compose.foundation.layout.d5;
import androidx.compose.foundation.layout.g5;
import androidx.compose.foundation.lazy.layout.n2;
import androidx.compose.ui.graphics.o1;
import androidx.media3.exoplayer.a5;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nLazyStaggeredGridMeasurePolicy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridMeasurePolicy.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasurePolicyKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,176:1\n1282#2,6:177\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridMeasurePolicy.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasurePolicyKt\n*L\n51#1:177,6\n*E\n"})
public final class i0 {

    public /* synthetic */ class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f17863a;

        static {
            int[] iArr = new int[q3.values().length];
            try {
                iArr[q3.Vertical.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[q3.Horizontal.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f17863a = iArr;
        }
    }

    @SourceDebugExtension({"SMAP\nLazyStaggeredGridMeasurePolicy.kt\nKotlin\n*S Kotlin\n*F\n+ 1 LazyStaggeredGridMeasurePolicy.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasurePolicyKt$rememberStaggeredGridMeasurePolicy$1$1\n+ 2 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 5 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,176:1\n32#2:177\n32#2:179\n80#3:178\n80#3:180\n49#4:181\n49#4:183\n1#5:182\n*S KotlinDebug\n*F\n+ 1 LazyStaggeredGridMeasurePolicy.kt\nandroidx/compose/foundation/lazy/staggeredgrid/LazyStaggeredGridMeasurePolicyKt$rememberStaggeredGridMeasurePolicy$1$1\n*L\n85#1:177\n87#1:179\n85#1:178\n87#1:180\n93#1:181\n98#1:183\n*E\n"})
    static final class b implements androidx.compose.foundation.lazy.layout.v0 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ a1 f17864a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ q3 f17865b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.lazy.staggeredgrid.a f17866c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ Function0<r> f17867d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ g5 f17868e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        final /* synthetic */ boolean f17869f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        final /* synthetic */ float f17870g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        final /* synthetic */ kotlinx.coroutines.s0 f17871h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        final /* synthetic */ o1 f17872i;

        /* JADX WARN: Multi-variable type inference failed */
        b(a1 a1Var, q3 q3Var, androidx.compose.foundation.lazy.staggeredgrid.a aVar, Function0<? extends r> function0, g5 g5Var, boolean z10, float f10, kotlinx.coroutines.s0 s0Var, o1 o1Var) {
            this.f17864a = a1Var;
            this.f17865b = q3Var;
            this.f17866c = aVar;
            this.f17867d = function0;
            this.f17868e = g5Var;
            this.f17869f = z10;
            this.f17870g = f10;
            this.f17871h = s0Var;
            this.f17872i = o1Var;
        }

        @Override // androidx.compose.foundation.lazy.layout.v0
        public final androidx.compose.ui.layout.b1 a(androidx.compose.foundation.lazy.layout.w0 w0Var, long j10) {
            long jF;
            n2.a(this.f17864a.N());
            boolean z10 = this.f17864a.G() || w0Var.P5();
            g1.a(j10, this.f17865b);
            v0 v0VarA = this.f17866c.a(w0Var, j10);
            boolean z11 = this.f17865b == q3.Vertical;
            r rVarInvoke = this.f17867d.invoke();
            int iG6 = w0Var.g6(i0.e(this.f17868e, this.f17865b, this.f17869f, w0Var.getLayoutDirection()));
            int iG7 = w0Var.g6(i0.d(this.f17868e, this.f17865b, this.f17869f, w0Var.getLayoutDirection()));
            int iG8 = w0Var.g6(i0.g(this.f17868e, this.f17865b, w0Var.getLayoutDirection()));
            int iO = ((z11 ? androidx.compose.ui.unit.b.o(j10) : androidx.compose.ui.unit.b.p(j10)) - iG6) - iG7;
            if (z11) {
                jF = androidx.compose.ui.unit.q.f((((long) iG6) & com.rabbitmq.client.k0.f265952a) | (((long) iG8) << 32));
            } else {
                jF = androidx.compose.ui.unit.q.f((((long) iG6) << 32) | (((long) iG8) & com.rabbitmq.client.k0.f265952a));
            }
            long j11 = jF;
            g5 g5Var = this.f17868e;
            int iG9 = w0Var.g6(androidx.compose.ui.unit.h.r(d5.o(g5Var, w0Var.getLayoutDirection()) + d5.n(g5Var, w0Var.getLayoutDirection())));
            g5 g5Var2 = this.f17868e;
            int iG10 = w0Var.g6(androidx.compose.ui.unit.h.r(g5Var2.d() + g5Var2.a()));
            k0 k0VarA = h0.A(w0Var, this.f17864a, androidx.compose.foundation.lazy.layout.v.a(rVarInvoke, this.f17864a.R(), this.f17864a.D()), rVarInvoke, v0VarA, androidx.compose.ui.unit.b.d(j10, androidx.compose.ui.unit.c.i(j10, iG9), 0, androidx.compose.ui.unit.c.h(j10, iG10), 0, 10, null), z11, this.f17869f, j11, iO, w0Var.g6(this.f17870g), iG6, iG7, this.f17871h, z10, w0Var.P5(), this.f17864a.B(), this.f17872i);
            a1.x(this.f17864a, k0VarA, w0Var.P5(), false, 4, null);
            return k0VarA;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float d(g5 g5Var, q3 q3Var, boolean z10, androidx.compose.ui.unit.w wVar) {
        int i10 = a.f17863a[q3Var.ordinal()];
        if (i10 == 1) {
            return z10 ? g5Var.d() : g5Var.a();
        }
        if (i10 == 2) {
            return z10 ? d5.o(g5Var, wVar) : d5.n(g5Var, wVar);
        }
        throw new kotlin.k0();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float e(g5 g5Var, q3 q3Var, boolean z10, androidx.compose.ui.unit.w wVar) {
        int i10 = a.f17863a[q3Var.ordinal()];
        if (i10 == 1) {
            return z10 ? g5Var.a() : g5Var.d();
        }
        if (i10 == 2) {
            return z10 ? d5.n(g5Var, wVar) : d5.o(g5Var, wVar);
        }
        throw new kotlin.k0();
    }

    @androidx.compose.runtime.o
    @NotNull
    public static final androidx.compose.foundation.lazy.layout.v0 f(@NotNull a1 a1Var, @NotNull Function0<? extends r> function0, @NotNull g5 g5Var, boolean z10, @NotNull q3 q3Var, float f10, float f11, @NotNull kotlinx.coroutines.s0 s0Var, @NotNull androidx.compose.foundation.lazy.staggeredgrid.a aVar, @NotNull o1 o1Var, @Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(234882793, i10, -1, "androidx.compose.foundation.lazy.staggeredgrid.rememberStaggeredGridMeasurePolicy (LazyStaggeredGridMeasurePolicy.kt:50)");
        }
        boolean zD = ((((i10 & 14) ^ 6) > 4 && c0Var.D(a1Var)) || (i10 & 6) == 4) | ((((i10 & com.planner5d.library.engine.input.f.b.B) ^ 48) > 32 && c0Var.D(function0)) || (i10 & 48) == 32) | ((((i10 & 896) ^ a5.S0) > 256 && c0Var.D(g5Var)) || (i10 & a5.S0) == 256) | ((((i10 & 7168) ^ 3072) > 2048 && c0Var.G(z10)) || (i10 & 3072) == 2048) | ((((57344 & i10) ^ 24576) > 16384 && c0Var.K(q3Var.ordinal())) || (i10 & 24576) == 16384) | ((((458752 & i10) ^ androidx.profileinstaller.n.c.f73814m) > 131072 && c0Var.I(f10)) || (i10 & androidx.profileinstaller.n.c.f73814m) == 131072) | ((((3670016 & i10) ^ 1572864) > 1048576 && c0Var.I(f11)) || (i10 & 1572864) == 1048576) | ((((234881024 & i10) ^ 100663296) > 67108864 && c0Var.D(aVar)) || (i10 & 100663296) == 67108864) | c0Var.D(o1Var);
        Object objI0 = c0Var.i0();
        if (zD || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
            b bVar = new b(a1Var, q3Var, aVar, function0, g5Var, z10, f10, s0Var, o1Var);
            c0Var.Y(bVar);
            objI0 = bVar;
        }
        androidx.compose.foundation.lazy.layout.v0 v0Var = (androidx.compose.foundation.lazy.layout.v0) objI0;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return v0Var;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float g(g5 g5Var, q3 q3Var, androidx.compose.ui.unit.w wVar) {
        int i10 = a.f17863a[q3Var.ordinal()];
        if (i10 == 1) {
            return d5.o(g5Var, wVar);
        }
        if (i10 == 2) {
            return g5Var.d();
        }
        throw new kotlin.k0();
    }
}

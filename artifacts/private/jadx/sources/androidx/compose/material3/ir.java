package androidx.compose.material3;

import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
@SourceDebugExtension({"SMAP\nProgressIndicator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProgressIndicator.kt\nandroidx/compose/material3/ProgressIndicatorDefaults\n+ 2 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 5 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n+ 6 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 7 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 8 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n*L\n1#1,1075:1\n61#2:1076\n61#2:1079\n57#2:1103\n61#2:1106\n57#2:1113\n61#2:1116\n70#3:1077\n70#3:1080\n60#3:1104\n70#3:1107\n53#3,3:1110\n60#3:1114\n70#3:1117\n53#3,3:1120\n53#3,3:1124\n22#4:1078\n22#4:1081\n22#4:1105\n22#4:1108\n22#4:1115\n22#4:1118\n74#5:1082\n167#6,6:1083\n249#6,14:1089\n30#7:1109\n30#7:1119\n33#8:1123\n*S KotlinDebug\n*F\n+ 1 ProgressIndicator.kt\nandroidx/compose/material3/ProgressIndicatorDefaults\n*L\n915#1:1076\n920#1:1079\n896#1:1103\n897#1:1106\n905#1:1113\n906#1:1116\n915#1:1077\n920#1:1080\n896#1:1104\n897#1:1107\n895#1:1110,3\n905#1:1114\n906#1:1117\n904#1:1120,3\n908#1:1124,3\n915#1:1078\n920#1:1081\n896#1:1105\n897#1:1108\n905#1:1115\n906#1:1118\n920#1:1082\n923#1:1083,6\n923#1:1089,14\n895#1:1109\n904#1:1119\n908#1:1123\n*E\n"})
public final class ir {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final ir f29311a = new ir();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f29312b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f29313c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f29314d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f29315e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final float f29316f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final float f29317g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final float f29318h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.animation.core.q2<Float> f29319i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f29320j = 0;

    static {
        d0.r rVar = d0.r.f268722a;
        f29312b = rVar.f();
        androidx.compose.ui.graphics.u3.a aVar = androidx.compose.ui.graphics.u3.f38256b;
        f29313c = aVar.b();
        f29314d = aVar.b();
        f29315e = aVar.b();
        d0.c1 c1Var = d0.c1.f267742a;
        f29316f = c1Var.f();
        f29317g = c1Var.h();
        f29318h = rVar.e();
        f29319i = new androidx.compose.animation.core.q2<>(1.0f, 50.0f, Float.valueOf(0.001f));
    }

    private ir() {
    }

    private static final void b(androidx.compose.ui.graphics.drawscope.f fVar, int i10, long j10, float f10, float f11) {
        if (androidx.compose.ui.graphics.u3.g(i10, androidx.compose.ui.graphics.u3.f38256b.b())) {
            float f12 = f10 / 2.0f;
            float fIntBitsToFloat = (Float.intBitsToFloat((int) (fVar.d() >> 32)) - f12) - f11;
            float fIntBitsToFloat2 = Float.intBitsToFloat((int) (fVar.d() & com.rabbitmq.client.k0.f265952a)) / 2.0f;
            androidx.compose.ui.graphics.drawscope.f.B4(fVar, j10, f12, n0.g.g((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (com.rabbitmq.client.k0.f265952a & ((long) Float.floatToRawIntBits(fIntBitsToFloat2)))), 0.0f, null, null, 0, 120, null);
            return;
        }
        float fIntBitsToFloat3 = (Float.intBitsToFloat((int) (fVar.d() >> 32)) - f10) - f11;
        float fIntBitsToFloat4 = (Float.intBitsToFloat((int) (fVar.d() & com.rabbitmq.client.k0.f265952a)) - f10) / 2.0f;
        androidx.compose.ui.graphics.drawscope.f.V3(fVar, j10, n0.g.g((((long) Float.floatToRawIntBits(fIntBitsToFloat3)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat4)) & com.rabbitmq.client.k0.f265952a)), n0.n.f((((long) Float.floatToRawIntBits(f10)) << 32) | (com.rabbitmq.client.k0.f265952a & ((long) Float.floatToRawIntBits(f10)))), 0.0f, null, null, 0, 120, null);
    }

    @af
    public static /* synthetic */ void i() {
    }

    @kotlin.l(level = kotlin.n.WARNING, message = "Renamed to circularDeterminateTrackColor or circularIndeterminateTrackColor", replaceWith = @kotlin.b1(expression = "ProgressIndicatorDefaults.circularIndeterminateTrackColor", imports = {}))
    public static /* synthetic */ void l() {
    }

    @af
    public static /* synthetic */ void o() {
    }

    @af
    public static /* synthetic */ void s() {
    }

    public final void a(@NotNull androidx.compose.ui.graphics.drawscope.f fVar, float f10, long j10, int i10) {
        float fMin = Math.min(fVar.S7(f10), Float.intBitsToFloat((int) (fVar.d() & com.rabbitmq.client.k0.f265952a)));
        float fS7 = fVar.S7(os.P0());
        float fIntBitsToFloat = (Float.intBitsToFloat((int) (fVar.d() & com.rabbitmq.client.k0.f265952a)) - fMin) / 2;
        float f11 = fIntBitsToFloat > fS7 ? fS7 : fIntBitsToFloat;
        if (fVar.getLayoutDirection() != androidx.compose.ui.unit.w.Rtl) {
            b(fVar, i10, j10, fMin, f11);
            return;
        }
        long jY = fVar.Y();
        androidx.compose.ui.graphics.drawscope.d dVarZ3 = fVar.Z3();
        long jD = dVarZ3.d();
        dVarZ3.f().save();
        try {
            dVarZ3.i().g(-1.0f, 1.0f, jY);
            b(fVar, i10, j10, fMin, f11);
        } finally {
            dVarZ3.f().B();
            dVarZ3.g(jD);
        }
    }

    @androidx.compose.runtime.o
    @oj.i(name = "getCircularColor")
    public final long c(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(1803349725, i10, -1, "androidx.compose.material3.ProgressIndicatorDefaults.<get-circularColor> (ProgressIndicator.kt:817)");
        }
        long jR = o6.r(d0.c2.f267754a.a(), c0Var, 6);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return jR;
    }

    public final int d() {
        return f29314d;
    }

    @androidx.compose.runtime.o
    @oj.i(name = "getCircularDeterminateTrackColor")
    public final long e(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-2143778381, i10, -1, "androidx.compose.material3.ProgressIndicatorDefaults.<get-circularDeterminateTrackColor> (ProgressIndicator.kt:834)");
        }
        long jR = o6.r(d0.c2.f267754a.e(), c0Var, 6);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return jR;
    }

    public final int f() {
        return f29315e;
    }

    @androidx.compose.runtime.o
    @oj.i(name = "getCircularIndeterminateTrackColor")
    public final long g(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-1947901123, i10, -1, "androidx.compose.material3.ProgressIndicatorDefaults.<get-circularIndeterminateTrackColor> (ProgressIndicator.kt:838)");
        }
        long jS = androidx.compose.ui.graphics.q0.f38131b.s();
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return jS;
    }

    public final float h() {
        return f29318h;
    }

    public final float j() {
        return f29312b;
    }

    @androidx.compose.runtime.o
    @oj.i(name = "getCircularTrackColor")
    public final long k(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-404222247, i10, -1, "androidx.compose.material3.ProgressIndicatorDefaults.<get-circularTrackColor> (ProgressIndicator.kt:830)");
        }
        long jS = androidx.compose.ui.graphics.q0.f38131b.s();
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return jS;
    }

    @androidx.compose.runtime.o
    @oj.i(name = "getLinearColor")
    public final long m(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-914312983, i10, -1, "androidx.compose.material3.ProgressIndicatorDefaults.<get-linearColor> (ProgressIndicator.kt:813)");
        }
        long jR = o6.r(d0.c2.f267754a.a(), c0Var, 6);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return jR;
    }

    public final float n() {
        return f29317g;
    }

    public final int p() {
        return f29313c;
    }

    @androidx.compose.runtime.o
    @oj.i(name = "getLinearTrackColor")
    public final long q(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(1677541593, i10, -1, "androidx.compose.material3.ProgressIndicatorDefaults.<get-linearTrackColor> (ProgressIndicator.kt:821)");
        }
        long jR = o6.r(d0.c2.f267754a.e(), c0Var, 6);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return jR;
    }

    public final float r() {
        return f29316f;
    }

    @NotNull
    public final androidx.compose.animation.core.q2<Float> t() {
        return f29319i;
    }
}

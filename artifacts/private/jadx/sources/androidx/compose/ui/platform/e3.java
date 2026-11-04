package androidx.compose.ui.platform;

import android.view.View;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nNestedScrollInteropConnection.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 NestedScrollInteropConnection.android.kt\nandroidx/compose/ui/platform/NestedScrollInteropConnectionKt\n+ 2 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 5 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 6 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 7 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,365:1\n65#2:366\n65#2:369\n65#2:372\n69#2:375\n69#2:378\n69#2:381\n65#2:388\n69#2:391\n60#3:367\n60#3:370\n60#3:373\n70#3:376\n70#3:379\n70#3:382\n53#3,3:385\n60#3:389\n70#3:392\n22#4:368\n22#4:371\n22#4:374\n22#4:377\n22#4:380\n22#4:383\n22#4:390\n22#4:393\n30#5:384\n75#6:394\n75#6:395\n1282#7,6:396\n*S KotlinDebug\n*F\n+ 1 NestedScrollInteropConnection.android.kt\nandroidx/compose/ui/platform/NestedScrollInteropConnectionKt\n*L\n281#1:366\n282#1:369\n284#1:372\n288#1:375\n289#1:378\n291#1:381\n313#1:388\n316#1:391\n281#1:367\n282#1:370\n284#1:373\n288#1:376\n289#1:379\n291#1:382\n294#1:385,3\n313#1:389\n316#1:392\n281#1:368\n282#1:371\n284#1:374\n288#1:377\n289#1:380\n291#1:383\n313#1:390\n316#1:393\n294#1:384\n354#1:394\n356#1:395\n357#1:396,6\n*E\n"})
@oj.i(name = "NestedScrollInteropConnectionKt")
public final class e3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f40434a = 0.5f;

    private static final float e(float f10) {
        return (float) (f10 >= 0.0f ? Math.ceil(f10) : Math.floor(f10));
    }

    public static final int f(float f10) {
        return ((int) e(f10)) * (-1);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int g(long j10) {
        int i10 = Math.abs(Float.intBitsToFloat((int) (j10 >> 32))) >= 0.5f ? 1 : 0;
        return Math.abs(Float.intBitsToFloat((int) (j10 & com.rabbitmq.client.k0.f265952a))) >= 0.5f ? i10 | 2 : i10;
    }

    @androidx.compose.runtime.o
    @NotNull
    public static final androidx.compose.ui.input.nestedscroll.a h(@Nullable View view, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        if ((i11 & 1) != 0) {
            view = (View) c0Var.W(AndroidCompositionLocals_androidKt.m());
        }
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(1075877987, i10, -1, "androidx.compose.ui.platform.rememberNestedScrollInteropConnection (NestedScrollInteropConnection.android.kt:354)");
        }
        o4 o4Var = (o4) c0Var.W(q1.D());
        boolean zD = c0Var.D(view) | c0Var.D(o4Var);
        Object objI0 = c0Var.i0();
        if (zD || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
            objI0 = androidx.compose.ui.k.f39210m ? new d3(view, o4Var.k()) : new z2(view);
            c0Var.Y(objI0);
        }
        androidx.compose.ui.input.nestedscroll.a aVar = (androidx.compose.ui.input.nestedscroll.a) objI0;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return aVar;
    }

    private static final float i(int i10) {
        return i10 * (-1.0f);
    }

    private static final int j(long j10, float f10) {
        int i10 = Math.abs(androidx.compose.ui.unit.c0.l(j10)) >= f10 ? 1 : 0;
        return Math.abs(androidx.compose.ui.unit.c0.n(j10)) >= f10 ? i10 | 2 : i10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long k(int[] iArr, long j10) {
        int i10 = (int) (j10 >> 32);
        float fA = Float.intBitsToFloat(i10) >= 0.0f ? kotlin.ranges.r.A(i(iArr[0]), Float.intBitsToFloat(i10)) : kotlin.ranges.r.t(i(iArr[0]), Float.intBitsToFloat(i10));
        int i11 = (int) (j10 & com.rabbitmq.client.k0.f265952a);
        return n0.g.g((((long) Float.floatToRawIntBits(fA)) << 32) | (((long) Float.floatToRawIntBits(Float.intBitsToFloat(i11) >= 0.0f ? kotlin.ranges.r.A(i(iArr[1]), Float.intBitsToFloat(i11)) : kotlin.ranges.r.t(i(iArr[1]), Float.intBitsToFloat(i11)))) & com.rabbitmq.client.k0.f265952a));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final int l(int i10) {
        return !androidx.compose.ui.input.nestedscroll.f.j(i10, androidx.compose.ui.input.nestedscroll.f.f38949b.h()) ? 1 : 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float m(float f10) {
        return f10 * (-1.0f);
    }
}

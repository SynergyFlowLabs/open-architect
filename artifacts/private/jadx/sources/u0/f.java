package u0;

import android.content.res.Resources;
import androidx.annotation.h0;
import androidx.annotation.q;
import androidx.compose.runtime.c0;
import androidx.compose.runtime.m0;
import androidx.compose.runtime.o;
import androidx.compose.runtime.p4;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import androidx.compose.ui.platform.q1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nPrimitiveResources.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PrimitiveResources.android.kt\nandroidx/compose/ui/res/PrimitiveResources_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,78:1\n75#2:79\n75#2:80\n75#2:81\n75#2:82\n75#2:83\n*S KotlinDebug\n*F\n+ 1 PrimitiveResources.android.kt\nandroidx/compose/ui/res/PrimitiveResources_androidKt\n*L\n38#1:79\n50#1:80\n62#1:81\n74#1:82\n75#1:83\n*E\n"})
public final class f {
    @o
    @p4
    public static final boolean a(@androidx.annotation.h int i10, @Nullable c0 c0Var, int i11) {
        if (m0.l0()) {
            m0.A0(-432394447, i11, -1, "androidx.compose.ui.res.booleanResource (PrimitiveResources.android.kt:60)");
        }
        boolean z10 = ((Resources) c0Var.W(AndroidCompositionLocals_androidKt.k())).getBoolean(i10);
        if (m0.l0()) {
            m0.z0();
        }
        return z10;
    }

    @o
    @p4
    public static final float b(@q int i10, @Nullable c0 c0Var, int i11) {
        if (m0.l0()) {
            m0.A0(804324951, i11, -1, "androidx.compose.ui.res.dimensionResource (PrimitiveResources.android.kt:72)");
        }
        float fR = androidx.compose.ui.unit.h.r(((Resources) c0Var.W(AndroidCompositionLocals_androidKt.k())).getDimension(i10) / ((androidx.compose.ui.unit.d) c0Var.W(q1.m())).getDensity());
        if (m0.l0()) {
            m0.z0();
        }
        return fR;
    }

    @o
    @p4
    @NotNull
    public static final int[] c(@androidx.annotation.e int i10, @Nullable c0 c0Var, int i11) {
        if (m0.l0()) {
            m0.A0(-93991766, i11, -1, "androidx.compose.ui.res.integerArrayResource (PrimitiveResources.android.kt:48)");
        }
        int[] intArray = ((Resources) c0Var.W(AndroidCompositionLocals_androidKt.k())).getIntArray(i10);
        if (m0.l0()) {
            m0.z0();
        }
        return intArray;
    }

    @o
    @p4
    public static final int d(@h0 int i10, @Nullable c0 c0Var, int i11) {
        if (m0.l0()) {
            m0.A0(916701108, i11, -1, "androidx.compose.ui.res.integerResource (PrimitiveResources.android.kt:36)");
        }
        int integer = ((Resources) c0Var.W(AndroidCompositionLocals_androidKt.k())).getInteger(i10);
        if (m0.l0()) {
            m0.z0();
        }
        return integer;
    }
}

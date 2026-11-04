package u0;

import android.content.Context;
import android.content.res.Resources;
import androidx.annotation.n;
import androidx.compose.runtime.c0;
import androidx.compose.runtime.m0;
import androidx.compose.runtime.o;
import androidx.compose.runtime.p4;
import androidx.compose.ui.graphics.s0;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nColorResources.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ColorResources.android.kt\nandroidx/compose/ui/res/ColorResources_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,39:1\n75#2:40\n75#2:41\n*S KotlinDebug\n*F\n+ 1 ColorResources.android.kt\nandroidx/compose/ui/res/ColorResources_androidKt\n*L\n36#1:40\n37#1:41\n*E\n"})
public final class a {
    @o
    @p4
    public static final long a(@n int i10, @Nullable c0 c0Var, int i11) {
        if (m0.l0()) {
            m0.A0(-1777644873, i11, -1, "androidx.compose.ui.res.colorResource (ColorResources.android.kt:34)");
        }
        long jB = s0.b(androidx.core.content.res.i.e((Resources) c0Var.W(AndroidCompositionLocals_androidKt.k()), i10, ((Context) c0Var.W(AndroidCompositionLocals_androidKt.g())).getTheme()));
        if (m0.l0()) {
            m0.z0();
        }
        return jB;
    }
}

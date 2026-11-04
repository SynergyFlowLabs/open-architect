package androidx.compose.material3;

import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nSearchBar.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SearchBar.android.kt\nandroidx/compose/material3/SearchBar_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,29:1\n75#2:30\n113#3:31\n*S KotlinDebug\n*F\n+ 1 SearchBar.android.kt\nandroidx/compose/material3/SearchBar_androidKt\n*L\n28#1:30\n28#1:31\n*E\n"})
public final class yv {
    @androidx.compose.runtime.o
    public static final float a(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(1909557323, i10, -1, "androidx.compose.material3.getWindowContainerHeight (SearchBar.android.kt:27)");
        }
        float fR = androidx.compose.ui.unit.h.r(((Configuration) c0Var.W(AndroidCompositionLocals_androidKt.f())).screenHeightDp);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return fR;
    }
}

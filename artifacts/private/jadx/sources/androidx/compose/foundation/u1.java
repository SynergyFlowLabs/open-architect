package androidx.compose.foundation;

import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nDarkTheme.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 DarkTheme.android.kt\nandroidx/compose/foundation/DarkTheme_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,50:1\n75#2:51\n*S KotlinDebug\n*F\n+ 1 DarkTheme.android.kt\nandroidx/compose/foundation/DarkTheme_androidKt\n*L\n47#1:51\n*E\n"})
public final class u1 {
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p4
    public static final boolean a(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-882615028, i10, -1, "androidx.compose.foundation._isSystemInDarkTheme (DarkTheme.android.kt:45)");
        }
        boolean z10 = (((Configuration) c0Var.W(AndroidCompositionLocals_androidKt.f())).uiMode & 48) == 32;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return z10;
    }
}

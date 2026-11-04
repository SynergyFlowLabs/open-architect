package androidx.compose.material3;

import android.content.res.Configuration;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nTimePicker.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimePicker.android.kt\nandroidx/compose/material3/TimePicker_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,34:1\n75#2:35\n*S KotlinDebug\n*F\n+ 1 TimePicker.android.kt\nandroidx/compose/material3/TimePicker_androidKt\n*L\n27#1:35\n*E\n"})
public final class l80 {
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p4
    public static final int a(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-721362352, i10, -1, "androidx.compose.material3.defaultTimePickerLayoutType (TimePicker.android.kt:26)");
        }
        Configuration configuration = (Configuration) c0Var.W(AndroidCompositionLocals_androidKt.f());
        int iA = configuration.screenHeightDp < configuration.screenWidthDp ? f80.f27609b.a() : f80.f27609b.b();
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return iA;
    }
}

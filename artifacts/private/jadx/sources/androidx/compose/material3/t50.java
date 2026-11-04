package androidx.compose.material3;

import android.content.Context;
import android.text.format.DateFormat;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nTimeFormat.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TimeFormat.android.kt\nandroidx/compose/material3/TimeFormat_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,26:1\n75#2:27\n*S KotlinDebug\n*F\n+ 1 TimeFormat.android.kt\nandroidx/compose/material3/TimeFormat_androidKt\n*L\n25#1:27\n*E\n"})
public final class t50 {
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p4
    @oj.i(name = "is24HourFormat")
    public static final boolean a(@Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-972868615, i10, -1, "androidx.compose.material3.<get-is24HourFormat> (TimeFormat.android.kt:24)");
        }
        boolean zIs24HourFormat = DateFormat.is24HourFormat((Context) c0Var.W(AndroidCompositionLocals_androidKt.g()));
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return zIs24HourFormat;
    }
}

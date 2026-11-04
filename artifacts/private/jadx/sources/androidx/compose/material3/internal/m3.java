package androidx.compose.material3.internal;

import android.content.Context;
import android.content.res.Configuration;
import androidx.compose.runtime.p4;
import androidx.compose.ui.platform.AndroidCompositionLocals_androidKt;
import java.util.Arrays;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nStrings.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Strings.android.kt\nandroidx/compose/material3/internal/Strings_androidKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n*L\n1#1,273:1\n75#2:274\n75#2:275\n75#2:276\n*S KotlinDebug\n*F\n+ 1 Strings.android.kt\nandroidx/compose/material3/internal/Strings_androidKt\n*L\n32#1:274\n33#1:275\n42#1:276\n*E\n"})
public final class m3 {
    @NotNull
    public static final String a(@NotNull String str, @NotNull Object... objArr) {
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        String str2 = String.format(str, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        Intrinsics.checkNotNullExpressionValue(str2, "format(...)");
        return str2;
    }

    @androidx.compose.runtime.o
    @p4
    @NotNull
    public static final String b(int i10, @Nullable androidx.compose.runtime.c0 c0Var, int i11) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-907677715, i11, -1, "androidx.compose.material3.internal.getString (Strings.android.kt:30)");
        }
        c0Var.W(AndroidCompositionLocals_androidKt.f());
        String string = ((Context) c0Var.W(AndroidCompositionLocals_androidKt.g())).getResources().getString(i10);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return string;
    }

    @androidx.compose.runtime.o
    @p4
    @NotNull
    public static final String c(int i10, @NotNull Object[] objArr, @Nullable androidx.compose.runtime.c0 c0Var, int i11) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-1427268608, i11, -1, "androidx.compose.material3.internal.getString (Strings.android.kt:38)");
        }
        String strB = b(i10, c0Var, i11 & 14);
        Locale localeD = androidx.core.os.g.a((Configuration) c0Var.W(AndroidCompositionLocals_androidKt.f())).d(0);
        if (localeD == null) {
            localeD = Locale.getDefault();
        }
        kotlin.jvm.internal.q1 q1Var = kotlin.jvm.internal.q1.f312784a;
        Object[] objArrCopyOf = Arrays.copyOf(objArr, objArr.length);
        String str = String.format(localeD, strB, Arrays.copyOf(objArrCopyOf, objArrCopyOf.length));
        Intrinsics.checkNotNullExpressionValue(str, "format(...)");
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return str;
    }
}

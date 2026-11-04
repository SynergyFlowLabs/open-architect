package androidx.compose.foundation;

import android.os.Build;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nPreferKeepClear.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PreferKeepClear.android.kt\nandroidx/compose/foundation/PreferKeepClear_androidKt\n*L\n1#1,107:1\n65#1:108\n65#1:109\n*S KotlinDebug\n*F\n+ 1 PreferKeepClear.android.kt\nandroidx/compose/foundation/PreferKeepClear_androidKt\n*L\n41#1:108\n59#1:109\n*E\n"})
public final class j4 {
    @NotNull
    public static final androidx.compose.ui.a0 a(@NotNull androidx.compose.ui.a0 a0Var) {
        return Build.VERSION.SDK_INT < 33 ? a0Var : a0Var.B2(new PreferKeepClearElement(null));
    }

    @NotNull
    public static final androidx.compose.ui.a0 b(@NotNull androidx.compose.ui.a0 a0Var, @NotNull Function1<? super androidx.compose.ui.layout.g0, n0.j> function1) {
        return Build.VERSION.SDK_INT < 33 ? a0Var : a0Var.B2(new PreferKeepClearElement(function1));
    }

    @androidx.annotation.w0(33)
    private static final androidx.compose.ui.a0 c(Function1<? super androidx.compose.ui.layout.g0, n0.j> function1) {
        return new PreferKeepClearElement(function1);
    }
}

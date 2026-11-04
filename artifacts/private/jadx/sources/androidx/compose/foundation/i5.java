package androidx.compose.foundation;

import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nSystemGestureExclusion.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SystemGestureExclusion.android.kt\nandroidx/compose/foundation/SystemGestureExclusionKt\n*L\n1#1,109:1\n65#1:110\n65#1:111\n*S KotlinDebug\n*F\n+ 1 SystemGestureExclusion.android.kt\nandroidx/compose/foundation/SystemGestureExclusionKt\n*L\n42#1:110\n58#1:111\n*E\n"})
@oj.i(name = "SystemGestureExclusionKt")
public final class i5 {
    @androidx.annotation.w0(29)
    private static final androidx.compose.ui.a0 a(Function1<? super androidx.compose.ui.layout.g0, n0.j> function1) {
        return new ExcludeFromSystemGestureElement(function1);
    }

    @NotNull
    public static final androidx.compose.ui.a0 b(@NotNull androidx.compose.ui.a0 a0Var) {
        return a0Var.B2(new ExcludeFromSystemGestureElement(null));
    }

    @NotNull
    public static final androidx.compose.ui.a0 c(@NotNull androidx.compose.ui.a0 a0Var, @NotNull Function1<? super androidx.compose.ui.layout.g0, n0.j> function1) {
        return a0Var.B2(new ExcludeFromSystemGestureElement(function1));
    }
}

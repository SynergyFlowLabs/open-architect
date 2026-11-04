package androidx.compose.ui.platform;

import android.graphics.Outline;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
@androidx.annotation.w0(30)
@SourceDebugExtension({"SMAP\nOutlineResolver.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 OutlineResolver.android.kt\nandroidx/compose/ui/platform/OutlineVerificationHelper\n+ 2 AndroidPath.android.kt\nandroidx/compose/ui/graphics/AndroidPath_androidKt\n*L\n1#1,322:1\n36#2,5:323\n*S KotlinDebug\n*F\n+ 1 OutlineResolver.android.kt\nandroidx/compose/ui/platform/OutlineVerificationHelper\n*L\n319#1:323,5\n*E\n"})
public final class h3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final h3 f40505a = new h3();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final int f40506b = 0;

    private h3() {
    }

    @androidx.annotation.u
    public final void a(@NotNull Outline outline, @NotNull androidx.compose.ui.graphics.k2 k2Var) {
        if (!(k2Var instanceof androidx.compose.ui.graphics.n)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        outline.setPath(((androidx.compose.ui.graphics.n) k2Var).Z());
    }
}

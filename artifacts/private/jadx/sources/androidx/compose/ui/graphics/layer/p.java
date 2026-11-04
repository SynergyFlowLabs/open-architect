package androidx.compose.ui.graphics.layer;

import android.graphics.Outline;
import androidx.annotation.w0;
import androidx.compose.ui.graphics.k2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@w0(30)
@SourceDebugExtension({"SMAP\nAndroidGraphicsLayer.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 AndroidGraphicsLayer.android.kt\nandroidx/compose/ui/graphics/layer/OutlineVerificationHelper\n+ 2 AndroidPath.android.kt\nandroidx/compose/ui/graphics/AndroidPath_androidKt\n*L\n1#1,1010:1\n36#2,5:1011\n*S KotlinDebug\n*F\n+ 1 AndroidGraphicsLayer.android.kt\nandroidx/compose/ui/graphics/layer/OutlineVerificationHelper\n*L\n1007#1:1011,5\n*E\n"})
public final class p {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final p f38007a = new p();

    private p() {
    }

    public final void a(@NotNull Outline outline, @NotNull k2 k2Var) {
        if (!(k2Var instanceof androidx.compose.ui.graphics.n)) {
            throw new UnsupportedOperationException("Unable to obtain android.graphics.Path");
        }
        outline.setPath(((androidx.compose.ui.graphics.n) k2Var).Z());
    }
}

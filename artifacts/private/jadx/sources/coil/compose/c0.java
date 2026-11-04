package coil.compose;

import androidx.compose.foundation.layout.j4;
import androidx.compose.runtime.o2;
import androidx.compose.ui.graphics.r0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes3.dex */
@j4
@o2
public interface c0 extends androidx.compose.foundation.layout.c0 {
    @NotNull
    androidx.compose.ui.layout.l a();

    boolean d();

    @Nullable
    r0 e();

    @NotNull
    AsyncImagePainter f();

    @NotNull
    androidx.compose.ui.e getAlignment();

    @Nullable
    String getContentDescription();

    float r();
}

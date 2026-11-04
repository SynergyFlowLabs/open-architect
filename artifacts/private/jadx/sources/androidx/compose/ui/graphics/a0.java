package androidx.compose.ui.graphics;

import android.graphics.Canvas;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class a0 {
    @NotNull
    public static final Canvas.VertexMode a(int i10) {
        c4.a aVar = c4.f37561b;
        if (c4.g(i10, aVar.c())) {
            return Canvas.VertexMode.TRIANGLES;
        }
        if (c4.g(i10, aVar.b())) {
            return Canvas.VertexMode.TRIANGLE_STRIP;
        }
        return c4.g(i10, aVar.a()) ? Canvas.VertexMode.TRIANGLE_FAN : Canvas.VertexMode.TRIANGLES;
    }
}

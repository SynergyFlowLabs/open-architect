package androidx.compose.ui.graphics;

import android.graphics.Rect;
import android.graphics.RectF;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
public final class c3 {
    @NotNull
    public static final Rect a(@NotNull androidx.compose.ui.unit.s sVar) {
        return new Rect(sVar.t(), sVar.B(), sVar.x(), sVar.j());
    }

    @kotlin.l(message = "Converting Rect to android.graphics.Rect is lossy, and requires rounding. The behavior of toAndroidRect() truncates to an integral Rect, but you should choose the method of rounding most suitable for your use case.", replaceWith = @kotlin.b1(expression = "android.graphics.Rect(left.toInt(), top.toInt(), right.toInt(), bottom.toInt())", imports = {}))
    @NotNull
    public static final Rect b(@NotNull n0.j jVar) {
        return new Rect((int) jVar.t(), (int) jVar.B(), (int) jVar.x(), (int) jVar.j());
    }

    @NotNull
    public static final RectF c(@NotNull n0.j jVar) {
        return new RectF(jVar.t(), jVar.B(), jVar.x(), jVar.j());
    }

    @NotNull
    public static final androidx.compose.ui.unit.s d(@NotNull Rect rect) {
        return new androidx.compose.ui.unit.s(rect.left, rect.top, rect.right, rect.bottom);
    }

    @NotNull
    public static final n0.j e(@NotNull Rect rect) {
        return new n0.j(rect.left, rect.top, rect.right, rect.bottom);
    }

    @NotNull
    public static final n0.j f(@NotNull RectF rectF) {
        return new n0.j(rectF.left, rectF.top, rectF.right, rectF.bottom);
    }
}

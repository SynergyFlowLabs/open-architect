package s6;

import android.graphics.Canvas;
import android.graphics.RectF;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes4.dex */
@b1({b1.a.LIBRARY_GROUP})
public class a {

    /* JADX INFO: renamed from: s6.a$a, reason: collision with other inner class name */
    public interface InterfaceC2504a {
        void a(@NonNull Canvas canvas);
    }

    private a() {
    }

    public static int a(@NonNull Canvas canvas, float f10, float f11, float f12, float f13, int i10) {
        return canvas.saveLayerAlpha(f10, f11, f12, f13, i10);
    }

    public static int b(@NonNull Canvas canvas, @p0 RectF rectF, int i10) {
        return canvas.saveLayerAlpha(rectF, i10);
    }
}

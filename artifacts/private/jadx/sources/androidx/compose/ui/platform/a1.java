package androidx.compose.ui.platform;

import android.app.Activity;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
final class a1 implements z0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final a1 f40278b = new a1();

    private a1() {
    }

    @Override // androidx.compose.ui.platform.z0
    @NotNull
    public Rect a(@NotNull Activity activity) {
        int i10;
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        Point point = new Point();
        defaultDisplay.getRealSize(point);
        Rect rect = new Rect();
        int i11 = point.x;
        if (i11 == 0 || (i10 = point.y) == 0) {
            defaultDisplay.getRectSize(rect);
            return rect;
        }
        rect.right = i11;
        rect.bottom = i10;
        return rect;
    }
}

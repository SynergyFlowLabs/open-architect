package androidx.compose.ui.platform;

import android.app.Activity;
import android.graphics.Point;
import android.graphics.Rect;
import android.view.Display;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.w0(24)
final class b1 implements z0 {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    public static final b1 f40316b = new b1();

    private b1() {
    }

    @Override // androidx.compose.ui.platform.z0
    @NotNull
    public Rect a(@NotNull Activity activity) {
        Rect rect = new Rect();
        Display defaultDisplay = activity.getWindowManager().getDefaultDisplay();
        defaultDisplay.getRectSize(rect);
        if (!activity.isInMultiWindowMode()) {
            Point point = new Point();
            defaultDisplay.getRealSize(point);
            int iG = u0.g(activity);
            int i10 = rect.bottom;
            if (i10 + iG == point.y) {
                rect.bottom = i10 + iG;
                return rect;
            }
            int i11 = rect.right;
            if (i11 + iG == point.x) {
                rect.right = i11 + iG;
            }
        }
        return rect;
    }
}

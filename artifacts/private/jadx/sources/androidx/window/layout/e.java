package androidx.window.layout;

import android.app.Activity;
import android.graphics.Rect;
import androidx.annotation.w0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@w0(30)
public final class e {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final e f76378a = new e();

    private e() {
    }

    @NotNull
    public final Rect a(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Rect bounds = activity.getWindowManager().getCurrentWindowMetrics().getBounds();
        Intrinsics.checkNotNullExpressionValue(bounds, "activity.windowManager.currentWindowMetrics.bounds");
        return bounds;
    }

    @NotNull
    public final Rect b(@NotNull Activity activity) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Rect bounds = activity.getWindowManager().getMaximumWindowMetrics().getBounds();
        Intrinsics.checkNotNullExpressionValue(bounds, "activity.windowManager.maximumWindowMetrics.bounds");
        return bounds;
    }
}

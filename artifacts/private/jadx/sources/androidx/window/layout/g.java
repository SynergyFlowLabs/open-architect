package androidx.window.layout;

import android.view.DisplayCutout;
import androidx.annotation.w0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes3.dex */
@w0(28)
public final class g {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final g f76380a = new g();

    private g() {
    }

    public final int a(@NotNull DisplayCutout displayCutout) {
        Intrinsics.checkNotNullParameter(displayCutout, "displayCutout");
        return displayCutout.getSafeInsetBottom();
    }

    public final int b(@NotNull DisplayCutout displayCutout) {
        Intrinsics.checkNotNullParameter(displayCutout, "displayCutout");
        return displayCutout.getSafeInsetLeft();
    }

    public final int c(@NotNull DisplayCutout displayCutout) {
        Intrinsics.checkNotNullParameter(displayCutout, "displayCutout");
        return displayCutout.getSafeInsetRight();
    }

    public final int d(@NotNull DisplayCutout displayCutout) {
        Intrinsics.checkNotNullParameter(displayCutout, "displayCutout");
        return displayCutout.getSafeInsetTop();
    }
}

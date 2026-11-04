package androidx.compose.ui.platform;

import android.view.View;
import android.view.translation.ViewTranslationCallback;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@androidx.annotation.w0(31)
final class z implements ViewTranslationCallback {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final z f40983a = new z();

    private z() {
    }

    public boolean onClearTranslation(@NotNull View view) {
        Intrinsics.checkNotNull(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        ((AndroidComposeView) view).getContentCaptureManager$ui_release().x();
        return true;
    }

    public boolean onHideTranslation(@NotNull View view) {
        Intrinsics.checkNotNull(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        ((AndroidComposeView) view).getContentCaptureManager$ui_release().z();
        return true;
    }

    public boolean onShowTranslation(@NotNull View view) {
        Intrinsics.checkNotNull(view, "null cannot be cast to non-null type androidx.compose.ui.platform.AndroidComposeView");
        ((AndroidComposeView) view).getContentCaptureManager$ui_release().C();
        return true;
    }
}

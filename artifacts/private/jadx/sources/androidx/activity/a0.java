package androidx.activity;

import android.view.Window;
import androidx.annotation.w0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes.dex */
@w0(30)
final class a0 extends z {
    @Override // androidx.activity.y, androidx.activity.b0, androidx.activity.c0
    @androidx.annotation.u
    public void a(@NotNull Window window) {
        Intrinsics.checkNotNullParameter(window, "window");
        window.getAttributes().layoutInDisplayCutoutMode = 3;
    }
}

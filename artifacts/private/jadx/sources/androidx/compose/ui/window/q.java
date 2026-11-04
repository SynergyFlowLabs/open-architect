package androidx.compose.ui.window;

import android.graphics.Rect;
import android.view.View;
import androidx.annotation.w0;
import kotlin.collections.CollectionsKt;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@w0(29)
final class q extends r {
    @Override // androidx.compose.ui.window.r, androidx.compose.ui.window.p
    public void b(@NotNull View view, int i10, int i11) {
        view.setSystemGestureExclusionRects(CollectionsKt.mutableListOf(new Rect(0, 0, i10, i11)));
    }
}

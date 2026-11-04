package androidx.core.widget;

import android.view.View;
import android.widget.ListPopupWindow;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.annotation.v0;

/* JADX INFO: loaded from: classes2.dex */
public final class l {
    private l() {
    }

    @v0(expression = "listPopupWindow.createDragToOpenListener(src)")
    @p0
    @Deprecated
    public static View.OnTouchListener a(@NonNull ListPopupWindow listPopupWindow, @NonNull View view) {
        return listPopupWindow.createDragToOpenListener(view);
    }

    @Deprecated
    public static View.OnTouchListener b(Object obj, View view) {
        return a((ListPopupWindow) obj, view);
    }
}

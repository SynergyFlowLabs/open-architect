package androidx.core.widget;

import android.view.View;
import android.widget.PopupMenu;
import androidx.annotation.NonNull;
import androidx.annotation.p0;

/* JADX INFO: loaded from: classes2.dex */
public final class o {
    private o() {
    }

    @p0
    public static View.OnTouchListener a(@NonNull Object obj) {
        return ((PopupMenu) obj).getDragToOpenListener();
    }
}

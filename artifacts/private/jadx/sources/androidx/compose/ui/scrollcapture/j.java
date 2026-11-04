package androidx.compose.ui.scrollcapture;

import android.graphics.Point;
import android.graphics.Rect;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureTarget;
import android.view.View;

/* JADX INFO: loaded from: classes2.dex */
public final /* synthetic */ class j {
    public static /* synthetic */ ScrollCaptureTarget a(View view, Rect rect, Point point, ScrollCaptureCallback scrollCaptureCallback) {
        return new ScrollCaptureTarget(view, rect, point, scrollCaptureCallback);
    }
}

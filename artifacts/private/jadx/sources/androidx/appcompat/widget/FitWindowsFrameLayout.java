package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
public class FitWindowsFrameLayout extends FrameLayout implements p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private p0.a f10990a;

    public FitWindowsFrameLayout(@NonNull Context context) {
        super(context);
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(Rect rect) {
        p0.a aVar = this.f10990a;
        if (aVar != null) {
            aVar.a(rect);
        }
        return super.fitSystemWindows(rect);
    }

    @Override // androidx.appcompat.widget.p0
    public void setOnFitSystemWindowsListener(p0.a aVar) {
        this.f10990a = aVar;
    }

    public FitWindowsFrameLayout(@NonNull Context context, @androidx.annotation.p0 AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}

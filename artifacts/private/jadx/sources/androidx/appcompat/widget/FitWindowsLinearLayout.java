package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
public class FitWindowsLinearLayout extends LinearLayout implements p0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private p0.a f10991a;

    public FitWindowsLinearLayout(@NonNull Context context) {
        super(context);
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(Rect rect) {
        p0.a aVar = this.f10991a;
        if (aVar != null) {
            aVar.a(rect);
        }
        return super.fitSystemWindows(rect);
    }

    @Override // androidx.appcompat.widget.p0
    public void setOnFitSystemWindowsListener(p0.a aVar) {
        this.f10991a = aVar;
    }

    public FitWindowsLinearLayout(@NonNull Context context, @androidx.annotation.p0 AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}

package com.planner5d.library.widget.editor.propertiesbar;

import android.graphics.PointF;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.View;

/* JADX INFO: loaded from: classes8.dex */
class b {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private float f258133a = 0.0f;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f258134b = 0.0f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private PointF f258135c = new PointF();

    b(View view, final PropertiesBarView propertiesBarView) {
        view.setOnTouchListener(new View.OnTouchListener() { // from class: com.planner5d.library.widget.editor.propertiesbar.a
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                return this.f258131a.b(propertiesBarView, view2, motionEvent);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean b(PropertiesBarView propertiesBarView, View view, MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            propertiesBarView.setMovingUpDown(true);
            this.f258134b = propertiesBarView.e(this.f258135c).y;
            this.f258133a = motionEvent.getRawY();
            view.setPressed(true);
            return true;
        }
        boolean z10 = false & false;
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                float fApplyDimension = TypedValue.applyDimension(1, (this.f258133a - motionEvent.getRawY()) * 0.25f, view.getResources().getDisplayMetrics());
                propertiesBarView.j(fApplyDimension);
                propertiesBarView.m(propertiesBarView.e(this.f258135c).x, this.f258134b - fApplyDimension);
                return true;
            }
            if (actionMasked != 3) {
                return false;
            }
        }
        view.setPressed(false);
        propertiesBarView.setMovingUpDown(false);
        return true;
    }
}

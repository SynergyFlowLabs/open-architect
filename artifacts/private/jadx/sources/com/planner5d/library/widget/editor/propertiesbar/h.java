package com.planner5d.library.widget.editor.propertiesbar;

import android.graphics.PointF;
import android.view.MotionEvent;
import android.view.View;
import com.planner5d.library.math.k;

/* JADX INFO: loaded from: classes8.dex */
class h {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final float f258145d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final PropertiesBarView f258146e;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int[] f258142a = new int[2];

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int[] f258143b = new int[2];

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final k f258144c = new k();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f258147f = 0.0f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final PointF f258148g = new PointF();

    h(View view, final PropertiesBarView propertiesBarView, final boolean z10) {
        this.f258146e = propertiesBarView;
        this.f258145d = view.getResources().getDimension(com.planner5d.library.f.g.Jh) / 2.0f;
        d();
        view.setOnTouchListener(new View.OnTouchListener() { // from class: com.planner5d.library.widget.editor.propertiesbar.g
            @Override // android.view.View.OnTouchListener
            public final boolean onTouch(View view2, MotionEvent motionEvent) {
                return this.f258139a.c(propertiesBarView, z10, view2, motionEvent);
            }
        });
    }

    private float b(MotionEvent motionEvent) {
        k kVar = this.f258144c;
        int[] iArr = this.f258142a;
        int i10 = 6 ^ 0;
        return kVar.U(iArr[0], iArr[1]).b0(motionEvent.getRawX(), motionEvent.getRawY()).c() - 180.0f;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public /* synthetic */ boolean c(PropertiesBarView propertiesBarView, boolean z10, View view, MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            propertiesBarView.setRotating(Boolean.valueOf(z10));
            d();
            this.f258147f = b(motionEvent);
            view.setPressed(true);
            return true;
        }
        if (actionMasked != 1) {
            if (actionMasked == 2) {
                propertiesBarView.l(b(motionEvent) - this.f258147f, z10);
                e(view, motionEvent);
                return true;
            }
            if (actionMasked != 3) {
                return false;
            }
        }
        view.setPressed(false);
        propertiesBarView.setRotating(null);
        return true;
    }

    private void d() {
        this.f258146e.getLocationOnScreen(this.f258143b);
        this.f258142a[0] = this.f258143b[0] + ((int) this.f258146e.e(this.f258148g).x);
        this.f258142a[1] = this.f258143b[1] + ((int) this.f258148g.y);
    }

    private void e(View view, MotionEvent motionEvent) {
        view.setX((motionEvent.getRawX() - this.f258143b[0]) - this.f258145d);
        int i10 = 4 | 1;
        view.setY((motionEvent.getRawY() - this.f258143b[1]) - this.f258145d);
    }
}

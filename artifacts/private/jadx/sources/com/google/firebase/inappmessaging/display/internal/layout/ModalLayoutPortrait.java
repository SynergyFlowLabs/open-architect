package com.google.firebase.inappmessaging.display.internal.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.p0;
import com.google.firebase.inappmessaging.display.g;
import com.google.firebase.inappmessaging.display.internal.l;
import com.google.firebase.inappmessaging.display.internal.layout.util.c;
import com.google.firebase.inappmessaging.display.internal.layout.util.d;

/* JADX INFO: loaded from: classes5.dex */
public class ModalLayoutPortrait extends b {

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f122446i = 24;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private c f122447g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f122448h;

    public ModalLayoutPortrait(Context context, @p0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f122447g = new c();
    }

    private boolean o(View view) {
        return view.getId() == g.d.f122206g || view.getId() == g.d.f122213n;
    }

    @Override // com.google.firebase.inappmessaging.display.internal.layout.b, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        super.onLayout(z10, i10, i11, i12, i13);
        int paddingTop = getPaddingTop();
        int paddingLeft = getPaddingLeft();
        int size = getVisibleChildren().size();
        for (int i16 = 0; i16 < size; i16++) {
            View view = getVisibleChildren().get(i16);
            FrameLayout.LayoutParams layoutParamsH = h(view);
            int measuredHeight = view.getMeasuredHeight();
            int measuredWidth = view.getMeasuredWidth();
            int i17 = measuredHeight + paddingTop;
            if ((layoutParamsH.gravity & 1) == 1) {
                int i18 = (i12 - i10) / 2;
                int i19 = measuredWidth / 2;
                i15 = i18 - i19;
                i14 = i18 + i19;
            } else {
                i14 = paddingLeft + measuredWidth;
                i15 = paddingLeft;
            }
            l.a("Layout child " + i16);
            l.d("\t(top, bottom)", (float) paddingTop, (float) i17);
            l.d("\t(left, right)", (float) i15, (float) i14);
            view.layout(i15, paddingTop, i14, i17);
            paddingTop += view.getMeasuredHeight();
            if (i16 < size - 1) {
                paddingTop += this.f122448h;
            }
        }
    }

    @Override // com.google.firebase.inappmessaging.display.internal.layout.b, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f122448h = c(24);
        int paddingRight = getPaddingRight() + getPaddingLeft();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int iB = b(i10);
        int iA = a(i11);
        int size = paddingBottom + ((getVisibleChildren().size() - 1) * this.f122448h);
        this.f122447g.f(iB, iA);
        for (int i12 = 0; i12 < getChildCount(); i12++) {
            View childAt = getChildAt(i12);
            this.f122447g.a(childAt, o(childAt));
        }
        l.a("Screen dimens: " + getDisplayMetrics());
        l.d("Max pct", getMaxWidthPct(), getMaxHeightPct());
        float f10 = (float) iB;
        l.d("Base dimens", f10, (float) iA);
        for (d dVar : this.f122447g.e()) {
            l.a("Pre-measure child");
            dVar.g(iB, iA);
        }
        int iD = this.f122447g.d() + size;
        l.c("Total reserved height", size);
        l.c("Total desired height", iD);
        boolean z10 = iD > iA;
        l.a("Total height constrained: " + z10);
        if (z10) {
            this.f122447g.b((iA - size) - this.f122447g.c());
        }
        int i13 = iB - paddingRight;
        for (d dVar2 : this.f122447g.e()) {
            l.a("Measuring child");
            com.google.firebase.inappmessaging.display.internal.layout.util.b.b(dVar2.e(), i13, dVar2.c());
            size += e(dVar2.e());
        }
        l.d("Measured dims", f10, size);
        setMeasuredDimension(iB, size);
    }
}

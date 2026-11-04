package com.google.firebase.inappmessaging.display.internal.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.p0;
import com.google.firebase.inappmessaging.display.g;
import com.google.firebase.inappmessaging.display.internal.l;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;

/* JADX INFO: loaded from: classes5.dex */
public class ModalLayoutLandscape extends b {

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int f122436o = 24;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final float f122437s = 0.4f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private View f122438g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private View f122439h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private View f122440i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private View f122441j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f122442k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f122443l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f122444m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f122445n;

    public ModalLayoutLandscape(Context context, @p0 AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    protected void o(View view, int i10, int i11, int i12, int i13) {
        int measuredWidth = view.getMeasuredWidth() / 2;
        int i14 = i10 + ((i12 - i10) / 2);
        m(view, i14 - measuredWidth, i11, i14 + measuredWidth, i13);
    }

    @Override // com.google.firebase.inappmessaging.display.internal.layout.b, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        super.onLayout(z10, i10, i11, i12, i13);
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int measuredWidth = getMeasuredWidth() - getPaddingRight();
        int i16 = this.f122444m;
        int i17 = this.f122445n;
        if (i16 < i17) {
            i15 = (i17 - i16) / 2;
            i14 = 0;
        } else {
            i14 = (i16 - i17) / 2;
            i15 = 0;
        }
        l.a("Layout image");
        int i18 = i15 + paddingTop;
        int iF = paddingLeft + f(this.f122438g);
        m(this.f122438g, paddingLeft, i18, iF, i18 + e(this.f122438g));
        int i19 = iF + this.f122442k;
        l.a("Layout getTitle");
        int i20 = paddingTop + i14;
        int iE = i20 + e(this.f122439h);
        m(this.f122439h, i19, i20, measuredWidth, iE);
        l.a("Layout getBody");
        int i21 = iE + (this.f122439h.getVisibility() == 8 ? 0 : this.f122443l);
        int iE2 = i21 + e(this.f122440i);
        m(this.f122440i, i19, i21, measuredWidth, iE2);
        l.a("Layout button");
        l(this.f122441j, i19, iE2 + (this.f122440i.getVisibility() != 8 ? this.f122443l : 0));
    }

    @Override // com.google.firebase.inappmessaging.display.internal.layout.b, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f122438g = d(g.d.f122213n);
        this.f122439h = d(g.d.f122215p);
        this.f122440i = d(g.d.f122206g);
        this.f122441j = d(g.d.f122207h);
        int iMax = 0;
        this.f122442k = this.f122438g.getVisibility() == 8 ? 0 : c(24);
        this.f122443l = c(24);
        List listAsList = Arrays.asList(this.f122439h, this.f122440i, this.f122441j);
        int paddingLeft = getPaddingLeft() + getPaddingRight();
        int paddingBottom = getPaddingBottom() + getPaddingTop();
        int iB = b(i10);
        int iA = a(i11) - paddingBottom;
        int i12 = iB - paddingLeft;
        l.a("Measuring image");
        com.google.firebase.inappmessaging.display.internal.layout.util.b.b(this.f122438g, (int) (i12 * 0.4f), iA);
        int iF = f(this.f122438g);
        int i13 = i12 - (this.f122442k + iF);
        float f10 = iF;
        l.d("Max col widths (l, r)", f10, i13);
        Iterator it = listAsList.iterator();
        int i14 = 0;
        while (it.hasNext()) {
            if (((View) it.next()).getVisibility() != 8) {
                i14++;
            }
        }
        int iMax2 = Math.max(0, (i14 - 1) * this.f122443l);
        int i15 = iA - iMax2;
        l.a("Measuring getTitle");
        com.google.firebase.inappmessaging.display.internal.layout.util.b.b(this.f122439h, i13, i15);
        l.a("Measuring button");
        com.google.firebase.inappmessaging.display.internal.layout.util.b.b(this.f122441j, i13, i15);
        l.a("Measuring scroll view");
        com.google.firebase.inappmessaging.display.internal.layout.util.b.b(this.f122440i, i13, (i15 - e(this.f122439h)) - e(this.f122441j));
        this.f122444m = e(this.f122438g);
        this.f122445n = iMax2;
        Iterator it2 = listAsList.iterator();
        while (it2.hasNext()) {
            this.f122445n += e((View) it2.next());
        }
        int iMax3 = Math.max(this.f122444m + paddingBottom, this.f122445n + paddingBottom);
        Iterator it3 = listAsList.iterator();
        while (it3.hasNext()) {
            iMax = Math.max(f((View) it3.next()), iMax);
        }
        l.d("Measured columns (l, r)", f10, iMax);
        int i16 = iF + iMax + this.f122442k + paddingLeft;
        l.d("Measured dims", i16, iMax3);
        setMeasuredDimension(i16, iMax3);
    }
}

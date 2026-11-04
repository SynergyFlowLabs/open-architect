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
public class CardLayoutLandscape extends b {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static double f122423k = 0.6d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private View f122424g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private View f122425h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private View f122426i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private View f122427j;

    public CardLayoutLandscape(Context context, @p0 AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.google.firebase.inappmessaging.display.internal.layout.b, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int measuredWidth = getMeasuredWidth();
        int measuredHeight = getMeasuredHeight();
        l.a("Layout image");
        int iF = f(this.f122424g);
        m(this.f122424g, 0, 0, iF, e(this.f122424g));
        l.a("Layout title");
        int iE = e(this.f122425h);
        m(this.f122425h, iF, 0, measuredWidth, iE);
        l.a("Layout scroll");
        m(this.f122426i, iF, iE, measuredWidth, iE + e(this.f122426i));
        l.a("Layout action bar");
        m(this.f122427j, iF, measuredHeight - e(this.f122427j), measuredWidth, measuredHeight);
    }

    @Override // com.google.firebase.inappmessaging.display.internal.layout.b, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f122424g = d(g.d.f122213n);
        this.f122425h = d(g.d.f122215p);
        this.f122426i = d(g.d.f122206g);
        View viewD = d(g.d.f122200a);
        this.f122427j = viewD;
        List listAsList = Arrays.asList(this.f122425h, this.f122426i, viewD);
        int iB = b(i10);
        int iA = a(i11);
        int iN = n((int) (f122423k * ((double) iB)), 4);
        l.a("Measuring image");
        com.google.firebase.inappmessaging.display.internal.layout.util.b.d(this.f122424g, iB, iA);
        if (f(this.f122424g) > iN) {
            l.a("Image exceeded maximum width, remeasuring image");
            com.google.firebase.inappmessaging.display.internal.layout.util.b.e(this.f122424g, iN, iA);
        }
        int iE = e(this.f122424g);
        int iF = f(this.f122424g);
        int i12 = iB - iF;
        float f10 = iF;
        l.d("Max col widths (l, r)", f10, i12);
        l.a("Measuring title");
        com.google.firebase.inappmessaging.display.internal.layout.util.b.b(this.f122425h, i12, iE);
        l.a("Measuring action bar");
        com.google.firebase.inappmessaging.display.internal.layout.util.b.b(this.f122427j, i12, iE);
        l.a("Measuring scroll view");
        com.google.firebase.inappmessaging.display.internal.layout.util.b.d(this.f122426i, i12, (iE - e(this.f122425h)) - e(this.f122427j));
        Iterator it = listAsList.iterator();
        int iMax = 0;
        while (it.hasNext()) {
            iMax = Math.max(f((View) it.next()), iMax);
        }
        l.d("Measured columns (l, r)", f10, iMax);
        int i13 = iF + iMax;
        l.d("Measured dims", i13, iE);
        setMeasuredDimension(i13, iE);
    }
}

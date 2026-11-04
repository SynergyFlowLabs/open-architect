package com.google.firebase.inappmessaging.display.internal.layout;

import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import androidx.annotation.p0;
import com.google.firebase.inappmessaging.display.g;
import com.google.firebase.inappmessaging.display.internal.l;

/* JADX INFO: loaded from: classes5.dex */
public class CardLayoutPortrait extends b {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static double f122428k = 0.8d;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private View f122429g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private View f122430h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private View f122431i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private View f122432j;

    public CardLayoutPortrait(Context context, @p0 AttributeSet attributeSet) {
        super(context, attributeSet);
    }

    @Override // com.google.firebase.inappmessaging.display.internal.layout.b, android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int size = getVisibleChildren().size();
        int measuredHeight = 0;
        for (int i14 = 0; i14 < size; i14++) {
            View view = getVisibleChildren().get(i14);
            int measuredHeight2 = view.getMeasuredHeight();
            int measuredWidth = view.getMeasuredWidth();
            int i15 = measuredHeight2 + measuredHeight;
            l.a("Layout child " + i14);
            l.d("\t(top, bottom)", (float) measuredHeight, (float) i15);
            l.d("\t(left, right)", (float) 0, (float) measuredWidth);
            view.layout(0, measuredHeight, measuredWidth, i15);
            l.d("Child " + i14 + " wants to be ", view.getMeasuredWidth(), view.getMeasuredHeight());
            measuredHeight += view.getMeasuredHeight();
        }
    }

    @Override // com.google.firebase.inappmessaging.display.internal.layout.b, android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        this.f122429g = d(g.d.f122213n);
        this.f122430h = d(g.d.f122215p);
        this.f122431i = d(g.d.f122206g);
        this.f122432j = d(g.d.f122200a);
        int iB = b(i10);
        int iA = a(i11);
        int iN = n((int) (f122428k * ((double) iA)), 4);
        l.a("Measuring image");
        com.google.firebase.inappmessaging.display.internal.layout.util.b.e(this.f122429g, iB, iA);
        if (e(this.f122429g) > iN) {
            l.a("Image exceeded maximum height, remeasuring image");
            com.google.firebase.inappmessaging.display.internal.layout.util.b.d(this.f122429g, iB, iN);
        }
        int iF = f(this.f122429g);
        l.a("Measuring title");
        com.google.firebase.inappmessaging.display.internal.layout.util.b.e(this.f122430h, iF, iA);
        l.a("Measuring action bar");
        com.google.firebase.inappmessaging.display.internal.layout.util.b.e(this.f122432j, iF, iA);
        l.a("Measuring scroll view");
        com.google.firebase.inappmessaging.display.internal.layout.util.b.e(this.f122431i, iF, ((iA - e(this.f122429g)) - e(this.f122430h)) - e(this.f122432j));
        int size = getVisibleChildren().size();
        int iE = 0;
        for (int i12 = 0; i12 < size; i12++) {
            iE += e(getVisibleChildren().get(i12));
        }
        setMeasuredDimension(iF, iE);
    }
}

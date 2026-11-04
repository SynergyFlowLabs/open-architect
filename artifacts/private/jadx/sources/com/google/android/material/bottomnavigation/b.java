package com.google.android.material.bottomnavigation;

import android.content.Context;
import android.content.res.Resources;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.appcompat.view.menu.g;
import androidx.core.view.u1;
import com.google.android.material.navigation.e;
import java.util.ArrayList;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
@b1({b1.a.LIBRARY_GROUP})
public class b extends e {

    /* JADX INFO: renamed from: s3, reason: collision with root package name */
    private final int f111412s3;

    /* JADX INFO: renamed from: t3, reason: collision with root package name */
    private final int f111413t3;

    /* JADX INFO: renamed from: u3, reason: collision with root package name */
    private final int f111414u3;

    /* JADX INFO: renamed from: v3, reason: collision with root package name */
    private final int f111415v3;

    /* JADX INFO: renamed from: w3, reason: collision with root package name */
    private boolean f111416w3;

    /* JADX INFO: renamed from: x3, reason: collision with root package name */
    private final List<Integer> f111417x3;

    public b(@NonNull Context context) {
        super(context);
        this.f111417x3 = new ArrayList();
        FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-2, -2);
        layoutParams.gravity = 17;
        setLayoutParams(layoutParams);
        Resources resources = getResources();
        this.f111412s3 = resources.getDimensionPixelSize(r6.a.f.X0);
        this.f111413t3 = resources.getDimensionPixelSize(r6.a.f.Y0);
        this.f111414u3 = resources.getDimensionPixelSize(r6.a.f.R0);
        this.f111415v3 = resources.getDimensionPixelSize(r6.a.f.S0);
    }

    @Override // com.google.android.material.navigation.e
    @NonNull
    protected com.google.android.material.navigation.c g(@NonNull Context context) {
        return new a(context);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        int measuredWidth = 0;
        for (int i16 = 0; i16 < childCount; i16++) {
            View childAt = getChildAt(i16);
            if (childAt.getVisibility() != 8) {
                if (u1.c0(this) == 1) {
                    int i17 = i14 - measuredWidth;
                    childAt.layout(i17 - childAt.getMeasuredWidth(), 0, i17, i15);
                } else {
                    childAt.layout(measuredWidth, 0, childAt.getMeasuredWidth() + measuredWidth, i15);
                }
                measuredWidth += childAt.getMeasuredWidth();
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        g menu = getMenu();
        int size = View.MeasureSpec.getSize(i10);
        int size2 = menu.H().size();
        int childCount = getChildCount();
        this.f111417x3.clear();
        int size3 = View.MeasureSpec.getSize(i11);
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size3, 1073741824);
        if (l(getLabelVisibilityMode(), size2) && u()) {
            View childAt = getChildAt(getSelectedItemPosition());
            int iMax = this.f111415v3;
            if (childAt.getVisibility() != 8) {
                childAt.measure(View.MeasureSpec.makeMeasureSpec(this.f111414u3, Integer.MIN_VALUE), iMakeMeasureSpec);
                iMax = Math.max(iMax, childAt.getMeasuredWidth());
            }
            int i14 = size2 - (childAt.getVisibility() != 8 ? 1 : 0);
            int iMin = Math.min(size - (this.f111413t3 * i14), Math.min(iMax, this.f111414u3));
            int i15 = size - iMin;
            int iMin2 = Math.min(i15 / (i14 != 0 ? i14 : 1), this.f111412s3);
            int i16 = i15 - (i14 * iMin2);
            int i17 = 0;
            while (i17 < childCount) {
                if (getChildAt(i17).getVisibility() != 8) {
                    i13 = i17 == getSelectedItemPosition() ? iMin : iMin2;
                    if (i16 > 0) {
                        i13++;
                        i16--;
                    }
                } else {
                    i13 = 0;
                }
                this.f111417x3.add(Integer.valueOf(i13));
                i17++;
            }
        } else {
            int iMin3 = Math.min(size / (size2 != 0 ? size2 : 1), this.f111414u3);
            int i18 = size - (size2 * iMin3);
            for (int i19 = 0; i19 < childCount; i19++) {
                if (getChildAt(i19).getVisibility() == 8) {
                    i12 = 0;
                } else if (i18 > 0) {
                    i12 = iMin3 + 1;
                    i18--;
                } else {
                    i12 = iMin3;
                }
                this.f111417x3.add(Integer.valueOf(i12));
            }
        }
        int measuredWidth = 0;
        for (int i20 = 0; i20 < childCount; i20++) {
            View childAt2 = getChildAt(i20);
            if (childAt2.getVisibility() != 8) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec(this.f111417x3.get(i20).intValue(), 1073741824), iMakeMeasureSpec);
                childAt2.getLayoutParams().width = childAt2.getMeasuredWidth();
                measuredWidth += childAt2.getMeasuredWidth();
            }
        }
        setMeasuredDimension(measuredWidth, size3);
    }

    public void setItemHorizontalTranslationEnabled(boolean z10) {
        this.f111416w3 = z10;
    }

    public boolean u() {
        return this.f111416w3;
    }
}

package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;

/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
public class AlertDialogLayout extends LinearLayoutCompat {
    public AlertDialogLayout(@androidx.annotation.p0 Context context) {
        super(context);
    }

    private void C(View view, int i10, int i11, int i12, int i13) {
        view.layout(i10, i11, i12 + i10, i13 + i11);
    }

    private static int D(View view) {
        int iH0 = androidx.core.view.u1.h0(view);
        if (iH0 > 0) {
            return iH0;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            if (viewGroup.getChildCount() == 1) {
                return D(viewGroup.getChildAt(0));
            }
        }
        return 0;
    }

    private boolean E(int i10, int i11) {
        int iCombineMeasuredStates;
        int iD;
        int measuredHeight;
        int measuredHeight2;
        int childCount = getChildCount();
        View view = null;
        View view2 = null;
        View view3 = null;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                int id2 = childAt.getId();
                if (id2 == i.a.g.f286223v0) {
                    view = childAt;
                } else if (id2 == i.a.g.f286212q) {
                    view2 = childAt;
                } else {
                    if ((id2 != i.a.g.f286220u && id2 != i.a.g.f286224w) || view3 != null) {
                        return false;
                    }
                    view3 = childAt;
                }
            }
        }
        int mode = View.MeasureSpec.getMode(i11);
        int size = View.MeasureSpec.getSize(i11);
        int mode2 = View.MeasureSpec.getMode(i10);
        int paddingTop = getPaddingTop() + getPaddingBottom();
        if (view != null) {
            view.measure(i10, 0);
            paddingTop += view.getMeasuredHeight();
            iCombineMeasuredStates = View.combineMeasuredStates(0, view.getMeasuredState());
        } else {
            iCombineMeasuredStates = 0;
        }
        if (view2 != null) {
            view2.measure(i10, 0);
            iD = D(view2);
            measuredHeight = view2.getMeasuredHeight() - iD;
            paddingTop += iD;
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view2.getMeasuredState());
        } else {
            iD = 0;
            measuredHeight = 0;
        }
        if (view3 != null) {
            view3.measure(i10, mode == 0 ? 0 : View.MeasureSpec.makeMeasureSpec(Math.max(0, size - paddingTop), mode));
            measuredHeight2 = view3.getMeasuredHeight();
            paddingTop += measuredHeight2;
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view3.getMeasuredState());
        } else {
            measuredHeight2 = 0;
        }
        int i13 = size - paddingTop;
        if (view2 != null) {
            int i14 = paddingTop - iD;
            int iMin = Math.min(i13, measuredHeight);
            if (iMin > 0) {
                i13 -= iMin;
                iD += iMin;
            }
            view2.measure(i10, View.MeasureSpec.makeMeasureSpec(iD, 1073741824));
            paddingTop = i14 + view2.getMeasuredHeight();
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view2.getMeasuredState());
        }
        if (view3 != null && i13 > 0) {
            view3.measure(i10, View.MeasureSpec.makeMeasureSpec(measuredHeight2 + i13, mode));
            paddingTop = (paddingTop - measuredHeight2) + view3.getMeasuredHeight();
            iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view3.getMeasuredState());
        }
        int iMax = 0;
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt2 = getChildAt(i15);
            if (childAt2.getVisibility() != 8) {
                iMax = Math.max(iMax, childAt2.getMeasuredWidth());
            }
        }
        setMeasuredDimension(View.resolveSizeAndState(iMax + getPaddingLeft() + getPaddingRight(), i10, iCombineMeasuredStates), View.resolveSizeAndState(paddingTop, i11, 0));
        if (mode2 == 1073741824) {
            return true;
        }
        l(childCount, i11);
        return true;
    }

    /* JADX WARN: Code duplicated, block: B:9:0x003e  */
    private void l(int i10, int i11) {
        AlertDialogLayout alertDialogLayout;
        int i12;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        int i13 = 0;
        while (i13 < i10) {
            View childAt = this.getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                LinearLayoutCompat.b bVar = (LinearLayoutCompat.b) childAt.getLayoutParams();
                if (((LinearLayout.LayoutParams) bVar).width == -1) {
                    int i14 = ((LinearLayout.LayoutParams) bVar).height;
                    ((LinearLayout.LayoutParams) bVar).height = childAt.getMeasuredHeight();
                    alertDialogLayout = this;
                    i12 = i11;
                    alertDialogLayout.measureChildWithMargins(childAt, iMakeMeasureSpec, 0, i12, 0);
                    ((LinearLayout.LayoutParams) bVar).height = i14;
                } else {
                    alertDialogLayout = this;
                    i12 = i11;
                }
            } else {
                alertDialogLayout = this;
                i12 = i11;
            }
            i13++;
            this = alertDialogLayout;
            i11 = i12;
        }
    }

    /* JADX WARN: Code duplicated, block: B:32:0x00a0  */
    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int paddingTop;
        AlertDialogLayout alertDialogLayout;
        int i14;
        int i15;
        int i16;
        int paddingLeft = getPaddingLeft();
        int i17 = i12 - i10;
        int paddingRight = i17 - getPaddingRight();
        int paddingRight2 = (i17 - paddingLeft) - getPaddingRight();
        int measuredHeight = getMeasuredHeight();
        int childCount = getChildCount();
        int gravity = getGravity();
        int i18 = gravity & com.planner5d.library.engine.input.f.b.B;
        int i19 = gravity & androidx.core.view.d0.f48645d;
        if (i18 != 16) {
            paddingTop = i18 != 80 ? getPaddingTop() : ((getPaddingTop() + i13) - i11) - measuredHeight;
        } else {
            paddingTop = getPaddingTop() + (((i13 - i11) - measuredHeight) / 2);
        }
        Drawable dividerDrawable = getDividerDrawable();
        int i20 = 0;
        int intrinsicHeight = dividerDrawable == null ? 0 : dividerDrawable.getIntrinsicHeight();
        while (i20 < childCount) {
            View childAt = this.getChildAt(i20);
            if (childAt == null || childAt.getVisibility() == 8) {
                alertDialogLayout = this;
            } else {
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight2 = childAt.getMeasuredHeight();
                LinearLayoutCompat.b bVar = (LinearLayoutCompat.b) childAt.getLayoutParams();
                int i21 = ((LinearLayout.LayoutParams) bVar).gravity;
                if (i21 < 0) {
                    i21 = i19;
                }
                int iD = androidx.core.view.d0.d(i21, this.getLayoutDirection()) & 7;
                if (iD != 1) {
                    if (iD != 5) {
                        i16 = ((LinearLayout.LayoutParams) bVar).leftMargin + paddingLeft;
                    } else {
                        i14 = paddingRight - measuredWidth;
                        i15 = ((LinearLayout.LayoutParams) bVar).rightMargin;
                    }
                    int i22 = i16;
                    if (this.t(i20)) {
                        paddingTop += intrinsicHeight;
                    }
                    int i23 = paddingTop + ((LinearLayout.LayoutParams) bVar).topMargin;
                    alertDialogLayout = this;
                    alertDialogLayout.C(childAt, i22, i23, measuredWidth, measuredHeight2);
                    paddingTop = i23 + measuredHeight2 + ((LinearLayout.LayoutParams) bVar).bottomMargin;
                } else {
                    i14 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + ((LinearLayout.LayoutParams) bVar).leftMargin;
                    i15 = ((LinearLayout.LayoutParams) bVar).rightMargin;
                }
                i16 = i14 - i15;
                int i24 = i16;
                if (this.t(i20)) {
                    paddingTop += intrinsicHeight;
                }
                int i25 = paddingTop + ((LinearLayout.LayoutParams) bVar).topMargin;
                alertDialogLayout = this;
                alertDialogLayout.C(childAt, i24, i25, measuredWidth, measuredHeight2);
                paddingTop = i25 + measuredHeight2 + ((LinearLayout.LayoutParams) bVar).bottomMargin;
            }
            i20++;
            this = alertDialogLayout;
        }
    }

    @Override // androidx.appcompat.widget.LinearLayoutCompat, android.view.View
    protected void onMeasure(int i10, int i11) {
        if (E(i10, i11)) {
            return;
        }
        super.onMeasure(i10, i11);
    }

    public AlertDialogLayout(@androidx.annotation.p0 Context context, @androidx.annotation.p0 AttributeSet attributeSet) {
        super(context, attributeSet);
    }
}

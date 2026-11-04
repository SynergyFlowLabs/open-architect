package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.LinearLayout;
import androidx.annotation.NonNull;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes.dex */
public class LinearLayoutCompat extends ViewGroup {
    private static final int H1 = 4;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    private static final int f10992g3 = 1;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    private static final int f10993h3 = 2;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    private static final int f10994i3 = 3;

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    private static final String f10995j3 = "androidx.appcompat.widget.LinearLayoutCompat";

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final int f10996p0 = 2;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public static final int f10997p1 = 4;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private static final int f10998p2 = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f10999s = 0;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f11000t = 1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final int f11001v = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    public static final int f11002w = 1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f11003a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f11004b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f11005c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f11006d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f11007e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f11008f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f11009g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f11010h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int[] f11011i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int[] f11012j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private Drawable f11013k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f11014l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f11015m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f11016n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f11017o;

    @Retention(RetentionPolicy.SOURCE)
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    public @interface a {
    }

    public static class b extends LinearLayout.LayoutParams {
        public b(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public b(int i10, int i11) {
            super(i10, i11);
        }

        public b(int i10, int i11, float f10) {
            super(i10, i11, f10);
        }

        public b(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public b(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    public @interface c {
    }

    public LinearLayoutCompat(@NonNull Context context) {
        this(context, null);
    }

    private void C(View view, int i10, int i11, int i12, int i13) {
        view.layout(i10, i11, i12 + i10, i13 + i11);
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0040  */
    private void k(int i10, int i11) {
        LinearLayoutCompat linearLayoutCompat;
        int i12;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredHeight(), 1073741824);
        int i13 = 0;
        while (i13 < i10) {
            View viewS = this.s(i13);
            if (viewS.getVisibility() != 8) {
                b bVar = (b) viewS.getLayoutParams();
                if (((LinearLayout.LayoutParams) bVar).height == -1) {
                    int i14 = ((LinearLayout.LayoutParams) bVar).width;
                    ((LinearLayout.LayoutParams) bVar).width = viewS.getMeasuredWidth();
                    linearLayoutCompat = this;
                    i12 = i11;
                    linearLayoutCompat.measureChildWithMargins(viewS, i12, 0, iMakeMeasureSpec, 0);
                    ((LinearLayout.LayoutParams) bVar).width = i14;
                } else {
                    linearLayoutCompat = this;
                    i12 = i11;
                }
            } else {
                linearLayoutCompat = this;
                i12 = i11;
            }
            i13++;
            this = linearLayoutCompat;
            i11 = i12;
        }
    }

    /* JADX WARN: Code duplicated, block: B:10:0x0041  */
    private void l(int i10, int i11) {
        LinearLayoutCompat linearLayoutCompat;
        int i12;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(getMeasuredWidth(), 1073741824);
        int i13 = 0;
        while (i13 < i10) {
            View viewS = this.s(i13);
            if (viewS.getVisibility() != 8) {
                b bVar = (b) viewS.getLayoutParams();
                if (((LinearLayout.LayoutParams) bVar).width == -1) {
                    int i14 = ((LinearLayout.LayoutParams) bVar).height;
                    ((LinearLayout.LayoutParams) bVar).height = viewS.getMeasuredHeight();
                    linearLayoutCompat = this;
                    i12 = i11;
                    linearLayoutCompat.measureChildWithMargins(viewS, iMakeMeasureSpec, 0, i12, 0);
                    ((LinearLayout.LayoutParams) bVar).height = i14;
                } else {
                    linearLayoutCompat = this;
                    i12 = i11;
                }
            } else {
                linearLayoutCompat = this;
                i12 = i11;
            }
            i13++;
            this = linearLayoutCompat;
            i11 = i12;
        }
    }

    int A(int i10) {
        return 0;
    }

    /* JADX WARN: Code duplicated, block: B:64:0x017e A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:66:0x0181  */
    /* JADX WARN: Code duplicated, block: B:68:0x0189 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:70:0x018c  */
    void B(int i10, int i11) {
        int i12;
        int iMax;
        int i13;
        int i14;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        View view;
        boolean z10;
        int iMax2;
        boolean z11;
        int iMax3;
        int i22;
        this.f11008f = 0;
        int virtualChildCount = getVirtualChildCount();
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int i23 = this.f11004b;
        boolean z12 = this.f11010h;
        int iP = 0;
        int i24 = 0;
        int iMax4 = 0;
        int i25 = 0;
        int i26 = 0;
        int iMax5 = 0;
        boolean z13 = false;
        boolean z14 = false;
        float f10 = 0.0f;
        boolean z15 = true;
        while (true) {
            int i27 = 8;
            if (iP >= virtualChildCount) {
                float f11 = f10;
                int i28 = i24;
                int i29 = virtualChildCount;
                int i30 = mode2;
                boolean z16 = z12;
                int i31 = iMax4;
                int iMax6 = i25;
                int iCombineMeasuredStates = i26;
                if (this.f11008f > 0) {
                    i12 = i29;
                    if (t(i12)) {
                        this.f11008f += this.f11015m;
                    }
                } else {
                    i12 = i29;
                }
                int i32 = i30;
                if (z16 && (i32 == Integer.MIN_VALUE || i32 == 0)) {
                    this.f11008f = 0;
                    int iP2 = 0;
                    while (iP2 < i12) {
                        View viewS = s(iP2);
                        if (viewS == null) {
                            this.f11008f += A(iP2);
                        } else if (viewS.getVisibility() == i27) {
                            iP2 += p(viewS, iP2);
                        } else {
                            b bVar = (b) viewS.getLayoutParams();
                            int i33 = this.f11008f;
                            this.f11008f = Math.max(i33, i33 + i31 + ((LinearLayout.LayoutParams) bVar).topMargin + ((LinearLayout.LayoutParams) bVar).bottomMargin + r(viewS));
                        }
                        iP2++;
                        i27 = 8;
                    }
                }
                int paddingTop = this.f11008f + getPaddingTop() + getPaddingBottom();
                this.f11008f = paddingTop;
                int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i11, 0);
                int i34 = (16777215 & iResolveSizeAndState) - this.f11008f;
                if (z13 || (i34 != 0 && f11 > 0.0f)) {
                    float f12 = this.f11009g;
                    if (f12 <= 0.0f) {
                        f12 = f11;
                    }
                    this.f11008f = 0;
                    float f13 = f12;
                    int i35 = i34;
                    int i36 = 0;
                    while (i36 < i12) {
                        View viewS2 = s(i36);
                        if (viewS2.getVisibility() == 8) {
                            i32 = i32;
                            i36 = i36;
                        } else {
                            b bVar2 = (b) viewS2.getLayoutParams();
                            float f14 = ((LinearLayout.LayoutParams) bVar2).weight;
                            if (f14 > 0.0f) {
                                int i37 = (int) ((i35 * f14) / f13);
                                f13 -= f14;
                                i35 -= i37;
                                int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight() + ((LinearLayout.LayoutParams) bVar2).leftMargin + ((LinearLayout.LayoutParams) bVar2).rightMargin, ((LinearLayout.LayoutParams) bVar2).width);
                                if (((LinearLayout.LayoutParams) bVar2).height == 0) {
                                    i14 = 1073741824;
                                    if (i32 == 1073741824) {
                                        viewS2.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(i37 > 0 ? i37 : 0, 1073741824));
                                    }
                                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, viewS2.getMeasuredState() & (-256));
                                } else {
                                    i14 = 1073741824;
                                }
                                int measuredHeight = viewS2.getMeasuredHeight() + i37;
                                if (measuredHeight < 0) {
                                    measuredHeight = 0;
                                }
                                viewS2.measure(childMeasureSpec, View.MeasureSpec.makeMeasureSpec(measuredHeight, i14));
                                iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, viewS2.getMeasuredState() & (-256));
                            } else {
                                i32 = i32;
                            }
                            int i38 = ((LinearLayout.LayoutParams) bVar2).leftMargin + ((LinearLayout.LayoutParams) bVar2).rightMargin;
                            int measuredWidth = viewS2.getMeasuredWidth() + i38;
                            iMax6 = Math.max(iMax6, measuredWidth);
                            if (mode != 1073741824) {
                                i13 = -1;
                                if (((LinearLayout.LayoutParams) bVar2).width == -1) {
                                    measuredWidth = i38;
                                }
                            } else {
                                i13 = -1;
                            }
                            int iMax7 = Math.max(iMax5, measuredWidth);
                            boolean z17 = z15 && ((LinearLayout.LayoutParams) bVar2).width == i13;
                            int i39 = this.f11008f;
                            this.f11008f = Math.max(i39, i39 + viewS2.getMeasuredHeight() + ((LinearLayout.LayoutParams) bVar2).topMargin + ((LinearLayout.LayoutParams) bVar2).bottomMargin + r(viewS2));
                            iMax5 = iMax7;
                            z15 = z17;
                        }
                        i36++;
                        i32 = i32;
                    }
                    this.f11008f += getPaddingTop() + getPaddingBottom();
                    iMax = iMax5;
                } else {
                    iMax = Math.max(iMax5, i28);
                    if (z16 && i32 != 1073741824) {
                        for (int i40 = 0; i40 < i12; i40++) {
                            View viewS3 = s(i40);
                            if (viewS3 != null && viewS3.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((b) viewS3.getLayoutParams())).weight > 0.0f) {
                                viewS3.measure(View.MeasureSpec.makeMeasureSpec(viewS3.getMeasuredWidth(), 1073741824), View.MeasureSpec.makeMeasureSpec(i31, 1073741824));
                            }
                        }
                    }
                }
                if (!z15 && mode != 1073741824) {
                    iMax6 = iMax;
                }
                setMeasuredDimension(View.resolveSizeAndState(Math.max(iMax6 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i10, iCombineMeasuredStates), iResolveSizeAndState);
                if (z14) {
                    l(i12, i11);
                    return;
                }
                return;
            }
            float f15 = f10;
            View viewS4 = s(iP);
            if (viewS4 == null) {
                this.f11008f += A(iP);
            } else {
                if (viewS4.getVisibility() == 8) {
                    iP += p(viewS4, iP);
                } else {
                    if (t(iP)) {
                        this.f11008f += this.f11015m;
                    }
                    b bVar3 = (b) viewS4.getLayoutParams();
                    float f16 = ((LinearLayout.LayoutParams) bVar3).weight;
                    float f17 = f15 + f16;
                    if (mode2 == 1073741824 && ((LinearLayout.LayoutParams) bVar3).height == 0 && f16 > 0.0f) {
                        int i41 = this.f11008f;
                        this.f11008f = Math.max(i41, ((LinearLayout.LayoutParams) bVar3).topMargin + i41 + ((LinearLayout.LayoutParams) bVar3).bottomMargin);
                        iMax2 = i24;
                        i18 = virtualChildCount;
                        i19 = mode2;
                        z13 = true;
                        i21 = i25;
                        i20 = i26;
                        z10 = z12;
                    } else {
                        if (((LinearLayout.LayoutParams) bVar3).height != 0 || f16 <= 0.0f) {
                            i15 = Integer.MIN_VALUE;
                        } else {
                            ((LinearLayout.LayoutParams) bVar3).height = -2;
                            i15 = 0;
                        }
                        if (f17 == 0.0f) {
                            int i42 = i26;
                            i17 = this.f11008f;
                            i16 = i42;
                        } else {
                            i16 = i26;
                            i17 = 0;
                        }
                        int i43 = iMax4;
                        i18 = virtualChildCount;
                        i19 = mode2;
                        i20 = i16;
                        i21 = i25;
                        view = viewS4;
                        z10 = z12;
                        iMax2 = i24;
                        y(view, iP, i10, 0, i11, i17);
                        if (i15 != Integer.MIN_VALUE) {
                            ((LinearLayout.LayoutParams) bVar3).height = i15;
                        }
                        int measuredHeight2 = view.getMeasuredHeight();
                        int i44 = this.f11008f;
                        this.f11008f = Math.max(i44, i44 + measuredHeight2 + ((LinearLayout.LayoutParams) bVar3).topMargin + ((LinearLayout.LayoutParams) bVar3).bottomMargin + r(view));
                        iMax4 = z10 ? Math.max(measuredHeight2, i43) : i43;
                    }
                    if (i23 >= 0 && i23 == iP + 1) {
                        view = viewS4;
                        this.f11005c = this.f11008f;
                    }
                    if (iP < i23 && ((LinearLayout.LayoutParams) bVar3).weight > 0.0f) {
                        throw new RuntimeException("A child of LinearLayout with index less than mBaselineAlignedChildIndex has weight > 0, which won't work.  Either remove the weight, or don't set mBaselineAlignedChildIndex.");
                    }
                    if (mode == 1073741824 || ((LinearLayout.LayoutParams) bVar3).width != -1) {
                        z11 = false;
                    } else {
                        z11 = true;
                        z14 = true;
                    }
                    int i45 = ((LinearLayout.LayoutParams) bVar3).leftMargin + ((LinearLayout.LayoutParams) bVar3).rightMargin;
                    int measuredWidth2 = view.getMeasuredWidth() + i45;
                    iMax3 = Math.max(i21, measuredWidth2);
                    int i46 = iMax4;
                    int iCombineMeasuredStates2 = View.combineMeasuredStates(i20, view.getMeasuredState());
                    if (z15) {
                        i22 = iCombineMeasuredStates2;
                        z15 = ((LinearLayout.LayoutParams) bVar3).width == -1;
                        if (((LinearLayout.LayoutParams) bVar3).weight > 0.0f) {
                            if (!z11) {
                                i45 = measuredWidth2;
                            }
                            iMax2 = Math.max(iMax2, i45);
                        } else {
                            if (!z11) {
                                i45 = measuredWidth2;
                            }
                            iMax5 = Math.max(iMax5, i45);
                        }
                        iP += p(view, iP);
                        f10 = f17;
                        iMax4 = i46;
                        i26 = i22;
                    } else {
                        i22 = iCombineMeasuredStates2;
                    }
                    if (((LinearLayout.LayoutParams) bVar3).weight > 0.0f) {
                        if (!z11) {
                            i45 = measuredWidth2;
                        }
                        iMax2 = Math.max(iMax2, i45);
                    } else {
                        if (!z11) {
                            i45 = measuredWidth2;
                        }
                        iMax5 = Math.max(iMax5, i45);
                    }
                    iP += p(view, iP);
                    f10 = f17;
                    iMax4 = i46;
                    i26 = i22;
                }
                iP++;
                i25 = iMax3;
                i24 = iMax2;
                z12 = z10;
                mode2 = i19;
                virtualChildCount = i18;
            }
            iMax2 = i24;
            i18 = virtualChildCount;
            i19 = mode2;
            z10 = z12;
            f10 = f15;
            iMax3 = i25;
            iP++;
            i25 = iMax3;
            i24 = iMax2;
            z12 = z10;
            mode2 = i19;
            virtualChildCount = i18;
        }
    }

    void c(Canvas canvas) {
        int right;
        int left;
        int i10;
        int virtualChildCount = getVirtualChildCount();
        boolean zB = v1.b(this);
        for (int i11 = 0; i11 < virtualChildCount; i11++) {
            View viewS = s(i11);
            if (viewS != null && viewS.getVisibility() != 8 && t(i11)) {
                b bVar = (b) viewS.getLayoutParams();
                j(canvas, zB ? viewS.getRight() + ((LinearLayout.LayoutParams) bVar).rightMargin : (viewS.getLeft() - ((LinearLayout.LayoutParams) bVar).leftMargin) - this.f11014l);
            }
        }
        if (t(virtualChildCount)) {
            View viewS2 = s(virtualChildCount - 1);
            if (viewS2 != null) {
                b bVar2 = (b) viewS2.getLayoutParams();
                if (zB) {
                    left = viewS2.getLeft() - ((LinearLayout.LayoutParams) bVar2).leftMargin;
                    i10 = this.f11014l;
                    right = left - i10;
                } else {
                    right = viewS2.getRight() + ((LinearLayout.LayoutParams) bVar2).rightMargin;
                }
            } else if (zB) {
                right = getPaddingLeft();
            } else {
                left = getWidth() - getPaddingRight();
                i10 = this.f11014l;
                right = left - i10;
            }
            j(canvas, right);
        }
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof b;
    }

    void f(Canvas canvas) {
        int virtualChildCount = getVirtualChildCount();
        for (int i10 = 0; i10 < virtualChildCount; i10++) {
            View viewS = s(i10);
            if (viewS != null && viewS.getVisibility() != 8 && t(i10)) {
                i(canvas, (viewS.getTop() - ((LinearLayout.LayoutParams) ((b) viewS.getLayoutParams())).topMargin) - this.f11015m);
            }
        }
        if (t(virtualChildCount)) {
            View viewS2 = s(virtualChildCount - 1);
            i(canvas, viewS2 == null ? (getHeight() - getPaddingBottom()) - this.f11015m : viewS2.getBottom() + ((LinearLayout.LayoutParams) ((b) viewS2.getLayoutParams())).bottomMargin);
        }
    }

    @Override // android.view.View
    public int getBaseline() {
        int i10;
        if (this.f11004b < 0) {
            return super.getBaseline();
        }
        int childCount = getChildCount();
        int i11 = this.f11004b;
        if (childCount <= i11) {
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout set to an index that is out of bounds.");
        }
        View childAt = getChildAt(i11);
        int baseline = childAt.getBaseline();
        if (baseline == -1) {
            if (this.f11004b == 0) {
                return -1;
            }
            throw new RuntimeException("mBaselineAlignedChildIndex of LinearLayout points to a View that doesn't know how to get its baseline.");
        }
        int bottom = this.f11005c;
        if (this.f11006d == 1 && (i10 = this.f11007e & com.planner5d.library.engine.input.f.b.B) != 48) {
            if (i10 == 16) {
                bottom += ((((getBottom() - getTop()) - getPaddingTop()) - getPaddingBottom()) - this.f11008f) / 2;
            } else if (i10 == 80) {
                bottom = ((getBottom() - getTop()) - getPaddingBottom()) - this.f11008f;
            }
        }
        return bottom + ((LinearLayout.LayoutParams) ((b) childAt.getLayoutParams())).topMargin + baseline;
    }

    public int getBaselineAlignedChildIndex() {
        return this.f11004b;
    }

    public Drawable getDividerDrawable() {
        return this.f11013k;
    }

    public int getDividerPadding() {
        return this.f11017o;
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    public int getDividerWidth() {
        return this.f11014l;
    }

    @androidx.annotation.a0
    public int getGravity() {
        return this.f11007e;
    }

    public int getOrientation() {
        return this.f11006d;
    }

    public int getShowDividers() {
        return this.f11016n;
    }

    int getVirtualChildCount() {
        return getChildCount();
    }

    public float getWeightSum() {
        return this.f11009g;
    }

    void i(Canvas canvas, int i10) {
        this.f11013k.setBounds(getPaddingLeft() + this.f11017o, i10, (getWidth() - getPaddingRight()) - this.f11017o, this.f11015m + i10);
        this.f11013k.draw(canvas);
    }

    void j(Canvas canvas, int i10) {
        this.f11013k.setBounds(i10, getPaddingTop() + this.f11017o, this.f11014l + i10, (getHeight() - getPaddingBottom()) - this.f11017o);
        this.f11013k.draw(canvas);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public b m() {
        int i10 = this.f11006d;
        if (i10 == 0) {
            return new b(-2, -2);
        }
        if (i10 == 1) {
            return new b(-1, -2);
        }
        return null;
    }

    @Override // android.view.ViewGroup
    public b n(AttributeSet attributeSet) {
        return new b(getContext(), attributeSet);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    public b o(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof b) {
            return new b((ViewGroup.MarginLayoutParams) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new b((ViewGroup.MarginLayoutParams) layoutParams) : new b(layoutParams);
    }

    @Override // android.view.View
    protected void onDraw(@NonNull Canvas canvas) {
        if (this.f11013k == null) {
            return;
        }
        if (this.f11006d == 1) {
            f(canvas);
        } else {
            c(canvas);
        }
    }

    @Override // android.view.View
    public void onInitializeAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        super.onInitializeAccessibilityEvent(accessibilityEvent);
        accessibilityEvent.setClassName(f10995j3);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(f10995j3);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        if (this.f11006d == 1) {
            x(i10, i11, i12, i13);
        } else {
            w(i10, i11, i12, i13);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        if (this.f11006d == 1) {
            B(i10, i11);
        } else {
            z(i10, i11);
        }
    }

    int p(View view, int i10) {
        return 0;
    }

    int q(View view) {
        return 0;
    }

    int r(View view) {
        return 0;
    }

    View s(int i10) {
        return getChildAt(i10);
    }

    public void setBaselineAligned(boolean z10) {
        this.f11003a = z10;
    }

    public void setBaselineAlignedChildIndex(int i10) {
        if (i10 >= 0 && i10 < getChildCount()) {
            this.f11004b = i10;
            return;
        }
        throw new IllegalArgumentException("base aligned child index out of range (0, " + getChildCount() + ")");
    }

    public void setDividerDrawable(Drawable drawable) {
        if (drawable == this.f11013k) {
            return;
        }
        this.f11013k = drawable;
        if (drawable != null) {
            this.f11014l = drawable.getIntrinsicWidth();
            this.f11015m = drawable.getIntrinsicHeight();
        } else {
            this.f11014l = 0;
            this.f11015m = 0;
        }
        setWillNotDraw(drawable == null);
        requestLayout();
    }

    public void setDividerPadding(int i10) {
        this.f11017o = i10;
    }

    public void setGravity(@androidx.annotation.a0 int i10) {
        if (this.f11007e != i10) {
            if ((8388615 & i10) == 0) {
                i10 |= androidx.core.view.d0.f48643b;
            }
            if ((i10 & com.planner5d.library.engine.input.f.b.B) == 0) {
                i10 |= 48;
            }
            this.f11007e = i10;
            requestLayout();
        }
    }

    public void setHorizontalGravity(int i10) {
        int i11 = i10 & androidx.core.view.d0.f48645d;
        int i12 = this.f11007e;
        if ((8388615 & i12) != i11) {
            this.f11007e = i11 | ((-8388616) & i12);
            requestLayout();
        }
    }

    public void setMeasureWithLargestChildEnabled(boolean z10) {
        this.f11010h = z10;
    }

    public void setOrientation(int i10) {
        if (this.f11006d != i10) {
            this.f11006d = i10;
            requestLayout();
        }
    }

    public void setShowDividers(int i10) {
        if (i10 != this.f11016n) {
            requestLayout();
        }
        this.f11016n = i10;
    }

    public void setVerticalGravity(int i10) {
        int i11 = i10 & com.planner5d.library.engine.input.f.b.B;
        int i12 = this.f11007e;
        if ((i12 & com.planner5d.library.engine.input.f.b.B) != i11) {
            this.f11007e = i11 | (i12 & (-113));
            requestLayout();
        }
    }

    public void setWeightSum(float f10) {
        this.f11009g = Math.max(0.0f, f10);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY})
    protected boolean t(int i10) {
        if (i10 == 0) {
            return (this.f11016n & 1) != 0;
        }
        if (i10 == getChildCount()) {
            return (this.f11016n & 4) != 0;
        }
        if ((this.f11016n & 2) != 0) {
            for (int i11 = i10 - 1; i11 >= 0; i11--) {
                if (getChildAt(i11).getVisibility() != 8) {
                    return true;
                }
            }
        }
        return false;
    }

    public boolean u() {
        return this.f11003a;
    }

    public boolean v() {
        return this.f11010h;
    }

    /* JADX WARN: Code duplicated, block: B:29:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:32:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:34:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:36:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:37:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:39:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:41:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:43:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:44:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:47:0x0104  */
    /* JADX WARN: Code duplicated, block: B:48:0x0109  */
    void w(int i10, int i11, int i12, int i13) {
        int paddingLeft;
        int i14;
        int i15;
        char c10;
        char c11;
        int i16;
        int iP;
        int i17;
        int baseline;
        int i18;
        int i19;
        int i20;
        int measuredHeight;
        int i21;
        boolean zB = v1.b(this);
        int paddingTop = getPaddingTop();
        int i22 = i13 - i11;
        int paddingBottom = i22 - getPaddingBottom();
        int paddingBottom2 = (i22 - paddingTop) - getPaddingBottom();
        int virtualChildCount = getVirtualChildCount();
        int i23 = this.f11007e;
        int i24 = i23 & com.planner5d.library.engine.input.f.b.B;
        boolean z10 = this.f11003a;
        int[] iArr = this.f11011i;
        int[] iArr2 = this.f11012j;
        int iD = androidx.core.view.d0.d(8388615 & i23, getLayoutDirection());
        char c12 = 2;
        char c13 = 1;
        if (iD != 1) {
            paddingLeft = iD != 5 ? getPaddingLeft() : ((getPaddingLeft() + i12) - i10) - this.f11008f;
        } else {
            paddingLeft = getPaddingLeft() + (((i12 - i10) - this.f11008f) / 2);
        }
        if (zB) {
            i14 = virtualChildCount - 1;
            i15 = -1;
        } else {
            i14 = 0;
            i15 = 1;
        }
        int i25 = 0;
        while (i25 < virtualChildCount) {
            int i26 = i14 + (i15 * i25);
            int i27 = i25;
            View viewS = s(i26);
            if (viewS == null) {
                paddingLeft += A(i26);
                iP = i27;
                i16 = paddingTop;
                c10 = c12;
                c11 = c13;
            } else {
                c10 = c12;
                c11 = c13;
                if (viewS.getVisibility() != 8) {
                    int measuredWidth = viewS.getMeasuredWidth();
                    int measuredHeight2 = viewS.getMeasuredHeight();
                    b bVar = (b) viewS.getLayoutParams();
                    int i28 = paddingLeft;
                    if (z10) {
                        i17 = measuredHeight2;
                        baseline = ((LinearLayout.LayoutParams) bVar).height != -1 ? viewS.getBaseline() : -1;
                        i18 = ((LinearLayout.LayoutParams) bVar).gravity;
                        if (i18 < 0) {
                            i18 = i24;
                        }
                        i19 = i18 & com.planner5d.library.engine.input.f.b.B;
                        i16 = paddingTop;
                        if (i19 != 16) {
                            if (i19 != 48) {
                                i20 = i16 + ((LinearLayout.LayoutParams) bVar).topMargin;
                                if (baseline != -1) {
                                    i20 += iArr[c11] - baseline;
                                }
                            } else if (i19 != 80) {
                                i20 = i16;
                            } else {
                                i20 = (paddingBottom - i17) - ((LinearLayout.LayoutParams) bVar).bottomMargin;
                                if (baseline != -1) {
                                    measuredHeight = iArr2[c10] - (viewS.getMeasuredHeight() - baseline);
                                }
                            }
                            if (t(i26)) {
                                i21 = i28 + this.f11014l;
                            } else {
                                i21 = i28;
                            }
                            int i29 = ((LinearLayout.LayoutParams) bVar).leftMargin + i21;
                            C(viewS, q(viewS) + i29, i20, measuredWidth, i17);
                            int iR = i29 + ((LinearLayout.LayoutParams) bVar).rightMargin + measuredWidth + r(viewS);
                            iP = p(viewS, i26) + i27;
                            paddingLeft = iR;
                        } else {
                            i20 = i16 + ((paddingBottom2 - i17) / 2) + ((LinearLayout.LayoutParams) bVar).topMargin;
                            measuredHeight = ((LinearLayout.LayoutParams) bVar).bottomMargin;
                        }
                        i20 -= measuredHeight;
                        if (t(i26)) {
                            i21 = i28 + this.f11014l;
                        } else {
                            i21 = i28;
                        }
                        int i210 = ((LinearLayout.LayoutParams) bVar).leftMargin + i21;
                        C(viewS, q(viewS) + i210, i20, measuredWidth, i17);
                        int iR2 = i210 + ((LinearLayout.LayoutParams) bVar).rightMargin + measuredWidth + r(viewS);
                        iP = p(viewS, i26) + i27;
                        paddingLeft = iR2;
                    } else {
                        i17 = measuredHeight2;
                    }
                    i18 = ((LinearLayout.LayoutParams) bVar).gravity;
                    if (i18 < 0) {
                        i18 = i24;
                    }
                    i19 = i18 & com.planner5d.library.engine.input.f.b.B;
                    i16 = paddingTop;
                    if (i19 != 16) {
                        if (i19 != 48) {
                            i20 = i16 + ((LinearLayout.LayoutParams) bVar).topMargin;
                            if (baseline != -1) {
                                i20 += iArr[c11] - baseline;
                            }
                        } else if (i19 != 80) {
                            i20 = i16;
                        } else {
                            i20 = (paddingBottom - i17) - ((LinearLayout.LayoutParams) bVar).bottomMargin;
                            if (baseline != -1) {
                                measuredHeight = iArr2[c10] - (viewS.getMeasuredHeight() - baseline);
                            }
                        }
                        if (t(i26)) {
                            i21 = i28 + this.f11014l;
                        } else {
                            i21 = i28;
                        }
                        int i211 = ((LinearLayout.LayoutParams) bVar).leftMargin + i21;
                        C(viewS, q(viewS) + i211, i20, measuredWidth, i17);
                        int iR3 = i211 + ((LinearLayout.LayoutParams) bVar).rightMargin + measuredWidth + r(viewS);
                        iP = p(viewS, i26) + i27;
                        paddingLeft = iR3;
                    } else {
                        i20 = i16 + ((paddingBottom2 - i17) / 2) + ((LinearLayout.LayoutParams) bVar).topMargin;
                        measuredHeight = ((LinearLayout.LayoutParams) bVar).bottomMargin;
                    }
                    i20 -= measuredHeight;
                    if (t(i26)) {
                        i21 = i28 + this.f11014l;
                    } else {
                        i21 = i28;
                    }
                    int i212 = ((LinearLayout.LayoutParams) bVar).leftMargin + i21;
                    C(viewS, q(viewS) + i212, i20, measuredWidth, i17);
                    int iR4 = i212 + ((LinearLayout.LayoutParams) bVar).rightMargin + measuredWidth + r(viewS);
                    iP = p(viewS, i26) + i27;
                    paddingLeft = iR4;
                } else {
                    i16 = paddingTop;
                    iP = i27;
                }
            }
            i25 = iP + 1;
            c12 = c10;
            c13 = c11;
            paddingTop = i16;
        }
    }

    /* JADX WARN: Code duplicated, block: B:31:0x009a  */
    void x(int i10, int i11, int i12, int i13) {
        int paddingTop;
        int i14;
        int i15;
        int i16;
        LinearLayoutCompat linearLayoutCompat;
        int paddingLeft = getPaddingLeft();
        int i17 = i12 - i10;
        int paddingRight = i17 - getPaddingRight();
        int paddingRight2 = (i17 - paddingLeft) - getPaddingRight();
        int virtualChildCount = getVirtualChildCount();
        int i18 = this.f11007e;
        int i19 = i18 & com.planner5d.library.engine.input.f.b.B;
        int i20 = i18 & androidx.core.view.d0.f48645d;
        if (i19 != 16) {
            paddingTop = i19 != 80 ? getPaddingTop() : ((getPaddingTop() + i13) - i11) - this.f11008f;
        } else {
            paddingTop = getPaddingTop() + (((i13 - i11) - this.f11008f) / 2);
        }
        int iP = 0;
        while (iP < virtualChildCount) {
            View viewS = this.s(iP);
            if (viewS == null) {
                paddingTop += this.A(iP);
            } else {
                if (viewS.getVisibility() != 8) {
                    int measuredWidth = viewS.getMeasuredWidth();
                    int measuredHeight = viewS.getMeasuredHeight();
                    b bVar = (b) viewS.getLayoutParams();
                    int i21 = ((LinearLayout.LayoutParams) bVar).gravity;
                    if (i21 < 0) {
                        i21 = i20;
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
                        if (this.t(iP)) {
                            paddingTop += this.f11015m;
                        }
                        int i23 = paddingTop + ((LinearLayout.LayoutParams) bVar).topMargin;
                        linearLayoutCompat = this;
                        linearLayoutCompat.C(viewS, i22, i23 + this.q(viewS), measuredWidth, measuredHeight);
                        paddingTop = i23 + measuredHeight + ((LinearLayout.LayoutParams) bVar).bottomMargin + linearLayoutCompat.r(viewS);
                        iP += linearLayoutCompat.p(viewS, iP);
                    } else {
                        i14 = ((paddingRight2 - measuredWidth) / 2) + paddingLeft + ((LinearLayout.LayoutParams) bVar).leftMargin;
                        i15 = ((LinearLayout.LayoutParams) bVar).rightMargin;
                    }
                    i16 = i14 - i15;
                    int i24 = i16;
                    if (this.t(iP)) {
                        paddingTop += this.f11015m;
                    }
                    int i25 = paddingTop + ((LinearLayout.LayoutParams) bVar).topMargin;
                    linearLayoutCompat = this;
                    linearLayoutCompat.C(viewS, i24, i25 + this.q(viewS), measuredWidth, measuredHeight);
                    paddingTop = i25 + measuredHeight + ((LinearLayout.LayoutParams) bVar).bottomMargin + linearLayoutCompat.r(viewS);
                    iP += linearLayoutCompat.p(viewS, iP);
                }
                iP++;
                this = linearLayoutCompat;
            }
            linearLayoutCompat = this;
            iP++;
            this = linearLayoutCompat;
        }
    }

    void y(View view, int i10, int i11, int i12, int i13, int i14) {
        measureChildWithMargins(view, i11, i12, i13, i14);
    }

    /* JADX WARN: Code duplicated, block: B:203:0x0495  */
    void z(int i10, int i11) {
        int i12;
        int i13;
        float f10;
        int i14;
        int i15;
        int i16;
        int i17;
        int iMax;
        int i18;
        int baseline;
        int i19;
        int i20;
        byte b10;
        int i21;
        int i22;
        int i23;
        boolean z10;
        View view;
        boolean z11;
        int baseline2;
        this.f11008f = 0;
        int virtualChildCount = getVirtualChildCount();
        int mode = View.MeasureSpec.getMode(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        if (this.f11011i == null || this.f11012j == null) {
            this.f11011i = new int[4];
            this.f11012j = new int[4];
        }
        int[] iArr = this.f11011i;
        int[] iArr2 = this.f11012j;
        iArr[3] = -1;
        iArr[2] = -1;
        iArr[1] = -1;
        iArr[0] = -1;
        iArr2[3] = -1;
        iArr2[2] = -1;
        iArr2[1] = -1;
        iArr2[0] = -1;
        boolean z12 = this.f11003a;
        boolean z13 = this.f11010h;
        int i24 = 1073741824;
        boolean z14 = mode == 1073741824;
        boolean z15 = z13;
        int iP = 0;
        int i25 = 0;
        int iMax2 = 0;
        boolean z16 = false;
        int iCombineMeasuredStates = 0;
        boolean z17 = false;
        boolean z18 = true;
        float f11 = 0.0f;
        int iMax3 = 0;
        int iMax4 = 0;
        while (true) {
            i12 = i25;
            if (iP >= virtualChildCount) {
                break;
            }
            boolean z19 = z12;
            View viewS = s(iP);
            if (viewS == null) {
                this.f11008f += A(iP);
            } else {
                if (viewS.getVisibility() == 8) {
                    iP += p(viewS, iP);
                } else {
                    if (t(iP)) {
                        this.f11008f += this.f11014l;
                    }
                    b bVar = (b) viewS.getLayoutParams();
                    float f12 = ((LinearLayout.LayoutParams) bVar).weight;
                    float f13 = f11 + f12;
                    if (mode == i24 && ((LinearLayout.LayoutParams) bVar).width == 0 && f12 > 0.0f) {
                        if (z14) {
                            this.f11008f += ((LinearLayout.LayoutParams) bVar).leftMargin + ((LinearLayout.LayoutParams) bVar).rightMargin;
                        } else {
                            int i26 = this.f11008f;
                            this.f11008f = Math.max(i26, ((LinearLayout.LayoutParams) bVar).leftMargin + i26 + ((LinearLayout.LayoutParams) bVar).rightMargin);
                        }
                        if (z19) {
                            int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(0, 0);
                            viewS.measure(iMakeMeasureSpec, iMakeMeasureSpec);
                        } else {
                            z16 = true;
                        }
                        i22 = i12;
                        i23 = 1073741824;
                        z10 = z15;
                        view = viewS;
                    } else {
                        if (((LinearLayout.LayoutParams) bVar).width != 0 || f12 <= 0.0f) {
                            b10 = -2;
                            i21 = Integer.MIN_VALUE;
                        } else {
                            b10 = -2;
                            ((LinearLayout.LayoutParams) bVar).width = -2;
                            i21 = 0;
                        }
                        virtualChildCount = virtualChildCount;
                        mode = mode;
                        iArr = iArr;
                        i22 = i12;
                        i23 = 1073741824;
                        z10 = z15;
                        iArr2 = iArr2;
                        int i27 = i21;
                        y(viewS, iP, i10, f13 == 0.0f ? this.f11008f : 0, i11, 0);
                        view = viewS;
                        if (i27 != Integer.MIN_VALUE) {
                            ((LinearLayout.LayoutParams) bVar).width = i27;
                        }
                        int measuredWidth = view.getMeasuredWidth();
                        if (z14) {
                            this.f11008f += ((LinearLayout.LayoutParams) bVar).leftMargin + measuredWidth + ((LinearLayout.LayoutParams) bVar).rightMargin + r(view);
                        } else {
                            int i28 = this.f11008f;
                            this.f11008f = Math.max(i28, i28 + measuredWidth + ((LinearLayout.LayoutParams) bVar).leftMargin + ((LinearLayout.LayoutParams) bVar).rightMargin + r(view));
                        }
                        if (z10) {
                            iMax2 = Math.max(measuredWidth, iMax2);
                        }
                    }
                    if (mode2 == i23 || ((LinearLayout.LayoutParams) bVar).height != -1) {
                        z11 = false;
                    } else {
                        z11 = true;
                        z17 = true;
                    }
                    int i29 = ((LinearLayout.LayoutParams) bVar).topMargin + ((LinearLayout.LayoutParams) bVar).bottomMargin;
                    int measuredHeight = view.getMeasuredHeight() + i29;
                    iCombineMeasuredStates = View.combineMeasuredStates(iCombineMeasuredStates, view.getMeasuredState());
                    if (z19 && (baseline2 = view.getBaseline()) != -1) {
                        int i30 = ((LinearLayout.LayoutParams) bVar).gravity;
                        if (i30 < 0) {
                            i30 = this.f11007e;
                        }
                        int i31 = (((i30 & com.planner5d.library.engine.input.f.b.B) >> 4) & (-2)) >> 1;
                        iArr[i31] = Math.max(iArr[i31], baseline2);
                        iArr2[i31] = Math.max(iArr2[i31], measuredHeight - baseline2);
                    }
                    int iMax5 = Math.max(i22, measuredHeight);
                    z18 = z18 && ((LinearLayout.LayoutParams) bVar).height == -1;
                    if (((LinearLayout.LayoutParams) bVar).weight > 0.0f) {
                        if (!z11) {
                            i29 = measuredHeight;
                        }
                        iMax4 = Math.max(iMax4, i29);
                    } else {
                        if (z11 == 0) {
                            i29 = measuredHeight;
                        }
                        iMax3 = Math.max(iMax3, i29);
                    }
                    iP += p(view, iP);
                    i25 = iMax5;
                    f11 = f13;
                }
                iP++;
                z15 = z10;
                iArr2 = iArr2;
                z12 = z19;
                mode = mode;
                iArr = iArr;
                virtualChildCount = virtualChildCount;
                i24 = 1073741824;
            }
            virtualChildCount = virtualChildCount;
            mode = mode;
            iArr = iArr;
            iArr2 = iArr2;
            i25 = i12;
            z10 = z15;
            iP++;
            z15 = z10;
            iArr2 = iArr2;
            z12 = z19;
            mode = mode;
            iArr = iArr;
            virtualChildCount = virtualChildCount;
            i24 = 1073741824;
        }
        boolean z20 = z12;
        int i32 = virtualChildCount;
        int i33 = mode;
        int[] iArr3 = iArr;
        int[] iArr4 = iArr2;
        int i34 = iCombineMeasuredStates;
        boolean z21 = z15;
        if (this.f11008f > 0) {
            i13 = i32;
            if (t(i13)) {
                this.f11008f += this.f11014l;
            }
        } else {
            i13 = i32;
        }
        int i35 = iArr3[1];
        int iMax6 = (i35 == -1 && iArr3[0] == -1 && iArr3[2] == -1 && iArr3[3] == -1) ? i12 : Math.max(i12, Math.max(iArr3[3], Math.max(iArr3[0], Math.max(i35, iArr3[2]))) + Math.max(iArr4[3], Math.max(iArr4[0], Math.max(iArr4[1], iArr4[2]))));
        if (z21) {
            i14 = i33;
            if (i14 == Integer.MIN_VALUE || i14 == 0) {
                this.f11008f = 0;
                int iP2 = 0;
                while (iP2 < i13) {
                    View viewS2 = s(iP2);
                    if (viewS2 == null) {
                        this.f11008f += A(iP2);
                    } else {
                        if (viewS2.getVisibility() == 8) {
                            iP2 += p(viewS2, iP2);
                        } else {
                            b bVar2 = (b) viewS2.getLayoutParams();
                            if (z14) {
                                this.f11008f += ((LinearLayout.LayoutParams) bVar2).leftMargin + iMax2 + ((LinearLayout.LayoutParams) bVar2).rightMargin + r(viewS2);
                            } else {
                                f11 = f11;
                                int i36 = this.f11008f;
                                this.f11008f = Math.max(i36, i36 + iMax2 + ((LinearLayout.LayoutParams) bVar2).leftMargin + ((LinearLayout.LayoutParams) bVar2).rightMargin + r(viewS2));
                            }
                        }
                        iP2++;
                        f11 = f11;
                        iMax6 = iMax6;
                    }
                    iP2++;
                    f11 = f11;
                    iMax6 = iMax6;
                }
            }
            f10 = f11;
        } else {
            f10 = f11;
            i14 = i33;
        }
        int iMax7 = iMax6;
        int paddingLeft = this.f11008f + getPaddingLeft() + getPaddingRight();
        this.f11008f = paddingLeft;
        int iResolveSizeAndState = View.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i10, 0);
        int i37 = (16777215 & iResolveSizeAndState) - this.f11008f;
        if (z16 || (i37 != 0 && f10 > 0.0f)) {
            float f14 = this.f11009g;
            if (f14 > 0.0f) {
                f10 = f14;
            }
            iArr3[3] = -1;
            iArr3[2] = -1;
            iArr3[1] = -1;
            iArr3[0] = -1;
            iArr4[3] = -1;
            iArr4[2] = -1;
            iArr4[1] = -1;
            iArr4[0] = -1;
            this.f11008f = 0;
            int iCombineMeasuredStates2 = i34;
            int iMax8 = -1;
            int i38 = 0;
            while (i38 < i13) {
                View viewS3 = s(i38);
                if (viewS3 == null || viewS3.getVisibility() == 8) {
                    iResolveSizeAndState = iResolveSizeAndState;
                } else {
                    b bVar3 = (b) viewS3.getLayoutParams();
                    float f15 = ((LinearLayout.LayoutParams) bVar3).weight;
                    if (f15 > 0.0f) {
                        int i39 = (int) ((i37 * f15) / f10);
                        f10 -= f15;
                        i37 -= i39;
                        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i11, getPaddingTop() + getPaddingBottom() + ((LinearLayout.LayoutParams) bVar3).topMargin + ((LinearLayout.LayoutParams) bVar3).bottomMargin, ((LinearLayout.LayoutParams) bVar3).height);
                        if (((LinearLayout.LayoutParams) bVar3).width == 0) {
                            i20 = 1073741824;
                            if (i14 == 1073741824) {
                                if (i39 <= 0) {
                                    i39 = 0;
                                }
                                viewS3.measure(View.MeasureSpec.makeMeasureSpec(i39, 1073741824), childMeasureSpec);
                            }
                            iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, viewS3.getMeasuredState() & (-16777216));
                        } else {
                            i20 = 1073741824;
                        }
                        int measuredWidth2 = viewS3.getMeasuredWidth() + i39;
                        if (measuredWidth2 < 0) {
                            measuredWidth2 = 0;
                        }
                        viewS3.measure(View.MeasureSpec.makeMeasureSpec(measuredWidth2, i20), childMeasureSpec);
                        iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates2, viewS3.getMeasuredState() & (-16777216));
                    }
                    if (z14) {
                        this.f11008f += viewS3.getMeasuredWidth() + ((LinearLayout.LayoutParams) bVar3).leftMargin + ((LinearLayout.LayoutParams) bVar3).rightMargin + r(viewS3);
                    } else {
                        int i40 = this.f11008f;
                        this.f11008f = Math.max(i40, viewS3.getMeasuredWidth() + i40 + ((LinearLayout.LayoutParams) bVar3).leftMargin + ((LinearLayout.LayoutParams) bVar3).rightMargin + r(viewS3));
                    }
                    boolean z22 = mode2 != 1073741824 && ((LinearLayout.LayoutParams) bVar3).height == -1;
                    int i41 = ((LinearLayout.LayoutParams) bVar3).topMargin + ((LinearLayout.LayoutParams) bVar3).bottomMargin;
                    int measuredHeight2 = viewS3.getMeasuredHeight() + i41;
                    iMax8 = Math.max(iMax8, measuredHeight2);
                    if (!z22) {
                        i41 = measuredHeight2;
                    }
                    int iMax9 = Math.max(iMax3, i41);
                    if (z18) {
                        i18 = -1;
                        boolean z23 = ((LinearLayout.LayoutParams) bVar3).height == -1;
                        if (z20 && (baseline = viewS3.getBaseline()) != i18) {
                            i19 = ((LinearLayout.LayoutParams) bVar3).gravity;
                            if (i19 < 0) {
                                i19 = this.f11007e;
                            }
                            int i42 = (((i19 & com.planner5d.library.engine.input.f.b.B) >> 4) & (-2)) >> 1;
                            iArr3[i42] = Math.max(iArr3[i42], baseline);
                            iArr4[i42] = Math.max(iArr4[i42], measuredHeight2 - baseline);
                        }
                        iMax3 = iMax9;
                        z18 = z23;
                    } else {
                        i18 = -1;
                    }
                    if (z20) {
                        i19 = ((LinearLayout.LayoutParams) bVar3).gravity;
                        if (i19 < 0) {
                            i19 = this.f11007e;
                        }
                        int i43 = (((i19 & com.planner5d.library.engine.input.f.b.B) >> 4) & (-2)) >> 1;
                        iArr3[i43] = Math.max(iArr3[i43], baseline);
                        iArr4[i43] = Math.max(iArr4[i43], measuredHeight2 - baseline);
                    }
                    iMax3 = iMax9;
                    z18 = z23;
                }
                i38++;
                iResolveSizeAndState = iResolveSizeAndState;
            }
            i15 = iResolveSizeAndState;
            i16 = -16777216;
            this.f11008f += getPaddingLeft() + getPaddingRight();
            int i44 = iArr3[1];
            iMax7 = (i44 == -1 && iArr3[0] == -1 && iArr3[2] == -1 && iArr3[3] == -1) ? iMax8 : Math.max(iMax8, Math.max(iArr3[3], Math.max(iArr3[0], Math.max(i44, iArr3[2]))) + Math.max(iArr4[3], Math.max(iArr4[0], Math.max(iArr4[1], iArr4[2]))));
            i17 = iCombineMeasuredStates2;
            iMax = iMax3;
        } else {
            iMax = Math.max(iMax3, iMax4);
            if (z21 && i14 != 1073741824) {
                for (int i45 = 0; i45 < i13; i45++) {
                    View viewS4 = s(i45);
                    if (viewS4 != null && viewS4.getVisibility() != 8 && ((LinearLayout.LayoutParams) ((b) viewS4.getLayoutParams())).weight > 0.0f) {
                        viewS4.measure(View.MeasureSpec.makeMeasureSpec(iMax2, 1073741824), View.MeasureSpec.makeMeasureSpec(viewS4.getMeasuredHeight(), 1073741824));
                    }
                }
            }
            i15 = iResolveSizeAndState;
            i17 = i34;
            i16 = -16777216;
        }
        if (z18 || mode2 == 1073741824) {
            iMax = iMax7;
        }
        setMeasuredDimension(i15 | (i17 & i16), View.resolveSizeAndState(Math.max(iMax + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i11, i17 << 16));
        if (z17) {
            k(i13, i10);
        }
    }

    public LinearLayoutCompat(@NonNull Context context, @androidx.annotation.p0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public LinearLayoutCompat(@NonNull Context context, @androidx.annotation.p0 AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f11003a = true;
        this.f11004b = -1;
        this.f11005c = 0;
        this.f11007e = 8388659;
        j1 j1VarG = j1.G(context, attributeSet, i.a.m.L3, i10, 0);
        androidx.core.view.u1.E1(this, context, i.a.m.L3, attributeSet, j1VarG.B(), i10, 0);
        int iO = j1VarG.o(i.a.m.N3, -1);
        if (iO >= 0) {
            setOrientation(iO);
        }
        int iO2 = j1VarG.o(i.a.m.M3, -1);
        if (iO2 >= 0) {
            setGravity(iO2);
        }
        boolean zA = j1VarG.a(i.a.m.O3, true);
        if (!zA) {
            setBaselineAligned(zA);
        }
        this.f11009g = j1VarG.j(i.a.m.Q3, -1.0f);
        this.f11004b = j1VarG.o(i.a.m.P3, -1);
        this.f11010h = j1VarG.a(i.a.m.T3, false);
        setDividerDrawable(j1VarG.h(i.a.m.R3));
        this.f11016n = j1VarG.o(i.a.m.U3, 0);
        this.f11017o = j1VarG.g(i.a.m.S3, 0);
        j1VarG.I();
    }
}

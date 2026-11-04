package androidx.appcompat.widget;

import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.core.view.f2;

/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
public class ActionBarContextView extends androidx.appcompat.widget.a {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private CharSequence f10788j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private CharSequence f10789k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private View f10790l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private View f10791m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private View f10792n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private LinearLayout f10793o;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private boolean f10794p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private int f10795p1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private TextView f10796s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private TextView f10797t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f10798v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f10799w;

    class a implements View.OnClickListener {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.appcompat.view.b f10800a;

        a(androidx.appcompat.view.b bVar) {
            this.f10800a = bVar;
        }

        @Override // android.view.View.OnClickListener
        public void onClick(View view) {
            this.f10800a.c();
        }
    }

    public ActionBarContextView(@NonNull Context context) {
        this(context, null);
    }

    private void r() {
        if (this.f10793o == null) {
            LayoutInflater.from(getContext()).inflate(i.a.j.f286243a, this);
            LinearLayout linearLayout = (LinearLayout) getChildAt(getChildCount() - 1);
            this.f10793o = linearLayout;
            this.f10796s = (TextView) linearLayout.findViewById(i.a.g.f286192g);
            this.f10797t = (TextView) this.f10793o.findViewById(i.a.g.f286190f);
            if (this.f10798v != 0) {
                this.f10796s.setTextAppearance(getContext(), this.f10798v);
            }
            if (this.f10799w != 0) {
                this.f10797t.setTextAppearance(getContext(), this.f10799w);
            }
        }
        this.f10796s.setText(this.f10788j);
        this.f10797t.setText(this.f10789k);
        boolean zIsEmpty = TextUtils.isEmpty(this.f10788j);
        boolean zIsEmpty2 = TextUtils.isEmpty(this.f10789k);
        this.f10797t.setVisibility(!zIsEmpty2 ? 0 : 8);
        this.f10793o.setVisibility((zIsEmpty && zIsEmpty2) ? 8 : 0);
        if (this.f10793o.getParent() == null) {
            addView(this.f10793o);
        }
    }

    @Override // androidx.appcompat.widget.a
    public /* bridge */ /* synthetic */ void c(int i10) {
        super.c(i10);
    }

    @Override // androidx.appcompat.widget.a
    public /* bridge */ /* synthetic */ boolean d() {
        return super.d();
    }

    @Override // androidx.appcompat.widget.a
    public /* bridge */ /* synthetic */ void e() {
        super.e();
    }

    @Override // androidx.appcompat.widget.a
    public boolean f() {
        ActionMenuPresenter actionMenuPresenter = this.f11136d;
        if (actionMenuPresenter != null) {
            return actionMenuPresenter.E();
        }
        return false;
    }

    @Override // androidx.appcompat.widget.a
    public /* bridge */ /* synthetic */ boolean g() {
        return super.g();
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new ViewGroup.MarginLayoutParams(-1, -2);
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new ViewGroup.MarginLayoutParams(getContext(), attributeSet);
    }

    @Override // androidx.appcompat.widget.a
    public /* bridge */ /* synthetic */ int getAnimatedVisibility() {
        return super.getAnimatedVisibility();
    }

    @Override // androidx.appcompat.widget.a
    public /* bridge */ /* synthetic */ int getContentHeight() {
        return super.getContentHeight();
    }

    public CharSequence getSubtitle() {
        return this.f10789k;
    }

    public CharSequence getTitle() {
        return this.f10788j;
    }

    @Override // androidx.appcompat.widget.a
    public boolean h() {
        ActionMenuPresenter actionMenuPresenter = this.f11136d;
        if (actionMenuPresenter != null) {
            return actionMenuPresenter.H();
        }
        return false;
    }

    @Override // androidx.appcompat.widget.a
    public /* bridge */ /* synthetic */ boolean i() {
        return super.i();
    }

    @Override // androidx.appcompat.widget.a
    public /* bridge */ /* synthetic */ void m() {
        super.m();
    }

    @Override // androidx.appcompat.widget.a
    public /* bridge */ /* synthetic */ f2 n(int i10, long j10) {
        return super.n(i10, j10);
    }

    @Override // androidx.appcompat.widget.a
    public boolean o() {
        ActionMenuPresenter actionMenuPresenter = this.f11136d;
        if (actionMenuPresenter != null) {
            return actionMenuPresenter.Q();
        }
        return false;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ActionMenuPresenter actionMenuPresenter = this.f11136d;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.E();
            this.f11136d.F();
        }
    }

    @Override // androidx.appcompat.widget.a, android.view.View
    public /* bridge */ /* synthetic */ boolean onHoverEvent(MotionEvent motionEvent) {
        return super.onHoverEvent(motionEvent);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean zB = v1.b(this);
        int paddingRight = zB ? (i12 - i10) - getPaddingRight() : getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingTop2 = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
        View view = this.f10790l;
        if (view != null && view.getVisibility() != 8) {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f10790l.getLayoutParams();
            int i14 = zB ? marginLayoutParams.rightMargin : marginLayoutParams.leftMargin;
            int i15 = zB ? marginLayoutParams.leftMargin : marginLayoutParams.rightMargin;
            int iK = androidx.appcompat.widget.a.k(paddingRight, i14, zB);
            paddingRight = androidx.appcompat.widget.a.k(iK + l(this.f10790l, iK, paddingTop, paddingTop2, zB), i15, zB);
        }
        int iL = paddingRight;
        LinearLayout linearLayout = this.f10793o;
        if (linearLayout != null && this.f10792n == null && linearLayout.getVisibility() != 8) {
            iL += l(this.f10793o, iL, paddingTop, paddingTop2, zB);
        }
        View view2 = this.f10792n;
        if (view2 != null) {
            l(view2, iL, paddingTop, paddingTop2, zB);
        }
        int paddingLeft = zB ? getPaddingLeft() : (i12 - i10) - getPaddingRight();
        ActionMenuView actionMenuView = this.f11135c;
        if (actionMenuView != null) {
            l(actionMenuView, paddingLeft, paddingTop, paddingTop2, !zB);
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        if (View.MeasureSpec.getMode(i10) != 1073741824) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_width=\"match_parent\" (or fill_parent)");
        }
        if (View.MeasureSpec.getMode(i11) == 0) {
            throw new IllegalStateException(getClass().getSimpleName() + " can only be used with android:layout_height=\"wrap_content\"");
        }
        int size = View.MeasureSpec.getSize(i10);
        int size2 = this.f11137e;
        if (size2 <= 0) {
            size2 = View.MeasureSpec.getSize(i11);
        }
        int paddingTop = getPaddingTop() + getPaddingBottom();
        int paddingLeft = (size - getPaddingLeft()) - getPaddingRight();
        int iMin = size2 - paddingTop;
        int iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMin, Integer.MIN_VALUE);
        View view = this.f10790l;
        if (view != null) {
            int iJ = j(view, paddingLeft, iMakeMeasureSpec, 0);
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) this.f10790l.getLayoutParams();
            paddingLeft = iJ - (marginLayoutParams.leftMargin + marginLayoutParams.rightMargin);
        }
        ActionMenuView actionMenuView = this.f11135c;
        if (actionMenuView != null && actionMenuView.getParent() == this) {
            paddingLeft = j(this.f11135c, paddingLeft, iMakeMeasureSpec, 0);
        }
        LinearLayout linearLayout = this.f10793o;
        if (linearLayout != null && this.f10792n == null) {
            if (this.f10794p0) {
                this.f10793o.measure(View.MeasureSpec.makeMeasureSpec(0, 0), iMakeMeasureSpec);
                int measuredWidth = this.f10793o.getMeasuredWidth();
                boolean z10 = measuredWidth <= paddingLeft;
                if (z10) {
                    paddingLeft -= measuredWidth;
                }
                this.f10793o.setVisibility(z10 ? 0 : 8);
            } else {
                paddingLeft = j(linearLayout, paddingLeft, iMakeMeasureSpec, 0);
            }
        }
        View view2 = this.f10792n;
        if (view2 != null) {
            ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
            int i12 = layoutParams.width;
            int i13 = i12 != -2 ? 1073741824 : Integer.MIN_VALUE;
            if (i12 >= 0) {
                paddingLeft = Math.min(i12, paddingLeft);
            }
            int i14 = layoutParams.height;
            int i15 = i14 == -2 ? Integer.MIN_VALUE : 1073741824;
            if (i14 >= 0) {
                iMin = Math.min(i14, iMin);
            }
            this.f10792n.measure(View.MeasureSpec.makeMeasureSpec(paddingLeft, i13), View.MeasureSpec.makeMeasureSpec(iMin, i15));
        }
        if (this.f11137e > 0) {
            setMeasuredDimension(size, size2);
            return;
        }
        int childCount = getChildCount();
        int i16 = 0;
        for (int i17 = 0; i17 < childCount; i17++) {
            int measuredHeight = getChildAt(i17).getMeasuredHeight() + paddingTop;
            if (measuredHeight > i16) {
                i16 = measuredHeight;
            }
        }
        setMeasuredDimension(size, i16);
    }

    @Override // androidx.appcompat.widget.a, android.view.View
    public /* bridge */ /* synthetic */ boolean onTouchEvent(MotionEvent motionEvent) {
        return super.onTouchEvent(motionEvent);
    }

    public void p() {
        if (this.f10790l == null) {
            t();
        }
    }

    public void q(androidx.appcompat.view.b bVar) {
        View view = this.f10790l;
        if (view == null) {
            View viewInflate = LayoutInflater.from(getContext()).inflate(this.f10795p1, (ViewGroup) this, false);
            this.f10790l = viewInflate;
            addView(viewInflate);
        } else if (view.getParent() == null) {
            addView(this.f10790l);
        }
        View viewFindViewById = this.f10790l.findViewById(i.a.g.f286204m);
        this.f10791m = viewFindViewById;
        viewFindViewById.setOnClickListener(new a(bVar));
        androidx.appcompat.view.menu.g gVar = (androidx.appcompat.view.menu.g) bVar.e();
        ActionMenuPresenter actionMenuPresenter = this.f11136d;
        if (actionMenuPresenter != null) {
            actionMenuPresenter.B();
        }
        ActionMenuPresenter actionMenuPresenter2 = new ActionMenuPresenter(getContext());
        this.f11136d = actionMenuPresenter2;
        actionMenuPresenter2.O(true);
        ViewGroup.LayoutParams layoutParams = new ViewGroup.LayoutParams(-2, -1);
        gVar.c(this.f11136d, this.f11134b);
        ActionMenuView actionMenuView = (ActionMenuView) this.f11136d.n(this);
        this.f11135c = actionMenuView;
        actionMenuView.setBackground(null);
        addView(this.f11135c, layoutParams);
    }

    public boolean s() {
        return this.f10794p0;
    }

    @Override // androidx.appcompat.widget.a
    public void setContentHeight(int i10) {
        this.f11137e = i10;
    }

    public void setCustomView(View view) {
        LinearLayout linearLayout;
        View view2 = this.f10792n;
        if (view2 != null) {
            removeView(view2);
        }
        this.f10792n = view;
        if (view != null && (linearLayout = this.f10793o) != null) {
            removeView(linearLayout);
            this.f10793o = null;
        }
        if (view != null) {
            addView(view);
        }
        requestLayout();
    }

    public void setSubtitle(CharSequence charSequence) {
        this.f10789k = charSequence;
        r();
    }

    public void setTitle(CharSequence charSequence) {
        this.f10788j = charSequence;
        r();
        androidx.core.view.u1.J1(this, charSequence);
    }

    public void setTitleOptional(boolean z10) {
        if (z10 != this.f10794p0) {
            requestLayout();
        }
        this.f10794p0 = z10;
    }

    @Override // androidx.appcompat.widget.a, android.view.View
    public /* bridge */ /* synthetic */ void setVisibility(int i10) {
        super.setVisibility(i10);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    public void t() {
        removeAllViews();
        this.f10792n = null;
        this.f11135c = null;
        this.f11136d = null;
        View view = this.f10791m;
        if (view != null) {
            view.setOnClickListener(null);
        }
    }

    public ActionBarContextView(@NonNull Context context, @androidx.annotation.p0 AttributeSet attributeSet) {
        this(context, attributeSet, i.a.b.C);
    }

    public ActionBarContextView(@NonNull Context context, @androidx.annotation.p0 AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        j1 j1VarG = j1.G(context, attributeSet, i.a.m.J, i10, 0);
        setBackground(j1VarG.h(i.a.m.K));
        this.f10798v = j1VarG.u(i.a.m.P, 0);
        this.f10799w = j1VarG.u(i.a.m.O, 0);
        this.f11137e = j1VarG.q(i.a.m.N, 0);
        this.f10795p1 = j1VarG.u(i.a.m.M, i.a.j.f286248f);
        j1VarG.I();
    }
}

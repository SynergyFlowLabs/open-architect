package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;

/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
public class ActionBarContainer extends FrameLayout {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f10778a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private View f10779b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private View f10780c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private View f10781d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    Drawable f10782e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    Drawable f10783f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    Drawable f10784g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    boolean f10785h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    boolean f10786i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f10787j;

    @androidx.annotation.w0(21)
    private static class a {
        private a() {
        }

        public static void a(ActionBarContainer actionBarContainer) {
            actionBarContainer.invalidateOutline();
        }
    }

    public ActionBarContainer(Context context) {
        this(context, null);
    }

    private int a(View view) {
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
        return view.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
    }

    private boolean b(View view) {
        return view == null || view.getVisibility() == 8 || view.getMeasuredHeight() == 0;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f10782e;
        if (drawable != null && drawable.isStateful()) {
            this.f10782e.setState(getDrawableState());
        }
        Drawable drawable2 = this.f10783f;
        if (drawable2 != null && drawable2.isStateful()) {
            this.f10783f.setState(getDrawableState());
        }
        Drawable drawable3 = this.f10784g;
        if (drawable3 == null || !drawable3.isStateful()) {
            return;
        }
        this.f10784g.setState(getDrawableState());
    }

    public View getTabContainer() {
        return this.f10779b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        Drawable drawable = this.f10782e;
        if (drawable != null) {
            drawable.jumpToCurrentState();
        }
        Drawable drawable2 = this.f10783f;
        if (drawable2 != null) {
            drawable2.jumpToCurrentState();
        }
        Drawable drawable3 = this.f10784g;
        if (drawable3 != null) {
            drawable3.jumpToCurrentState();
        }
    }

    @Override // android.view.View
    public void onFinishInflate() {
        super.onFinishInflate();
        this.f10780c = findViewById(i.a.g.f286180a);
        this.f10781d = findViewById(i.a.g.f286194h);
    }

    @Override // android.view.View
    public boolean onHoverEvent(MotionEvent motionEvent) {
        super.onHoverEvent(motionEvent);
        return true;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        return this.f10778a || super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Code duplicated, block: B:17:0x0050 A[PHI: r0
      0x0050: PHI (r0v9 boolean) = (r0v1 boolean), (r0v1 boolean), (r0v0 boolean) binds: [B:31:0x00bc, B:33:0x00c1, B:15:0x0040] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    public void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        Drawable drawable;
        super.onLayout(z10, i10, i11, i12, i13);
        View view = this.f10779b;
        boolean z11 = true;
        boolean z12 = false;
        boolean z13 = (view == null || view.getVisibility() == 8) ? false : true;
        if (view != null && view.getVisibility() != 8) {
            int measuredHeight = getMeasuredHeight();
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) view.getLayoutParams();
            int measuredHeight2 = measuredHeight - view.getMeasuredHeight();
            int i14 = layoutParams.bottomMargin;
            view.layout(i10, measuredHeight2 - i14, i12, measuredHeight - i14);
        }
        if (this.f10785h) {
            Drawable drawable2 = this.f10784g;
            if (drawable2 != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            } else {
                z11 = z12;
            }
        } else {
            if (this.f10782e != null) {
                if (this.f10780c.getVisibility() == 0) {
                    this.f10782e.setBounds(this.f10780c.getLeft(), this.f10780c.getTop(), this.f10780c.getRight(), this.f10780c.getBottom());
                } else {
                    View view2 = this.f10781d;
                    if (view2 == null || view2.getVisibility() != 0) {
                        this.f10782e.setBounds(0, 0, 0, 0);
                    } else {
                        this.f10782e.setBounds(this.f10781d.getLeft(), this.f10781d.getTop(), this.f10781d.getRight(), this.f10781d.getBottom());
                    }
                }
                z12 = true;
            }
            this.f10786i = z13;
            if (!z13 || (drawable = this.f10783f) == null) {
                z11 = z12;
            } else {
                drawable.setBounds(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            }
        }
        if (z11) {
            invalidate();
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    public void onMeasure(int i10, int i11) {
        int iA;
        int i12;
        if (this.f10780c == null && View.MeasureSpec.getMode(i11) == Integer.MIN_VALUE && (i12 = this.f10787j) >= 0) {
            i11 = View.MeasureSpec.makeMeasureSpec(Math.min(i12, View.MeasureSpec.getSize(i11)), Integer.MIN_VALUE);
        }
        super.onMeasure(i10, i11);
        if (this.f10780c == null) {
            return;
        }
        int mode = View.MeasureSpec.getMode(i11);
        View view = this.f10779b;
        if (view == null || view.getVisibility() == 8 || mode == 1073741824) {
            return;
        }
        if (b(this.f10780c)) {
            iA = !b(this.f10781d) ? a(this.f10781d) : 0;
        } else {
            iA = a(this.f10780c);
        }
        setMeasuredDimension(getMeasuredWidth(), Math.min(iA + a(this.f10779b), mode == Integer.MIN_VALUE ? View.MeasureSpec.getSize(i11) : Integer.MAX_VALUE));
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        super.onTouchEvent(motionEvent);
        return true;
    }

    public void setPrimaryBackground(Drawable drawable) {
        Drawable drawable2 = this.f10782e;
        if (drawable2 != null) {
            drawable2.setCallback(null);
            unscheduleDrawable(this.f10782e);
        }
        this.f10782e = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            View view = this.f10780c;
            if (view != null) {
                this.f10782e.setBounds(view.getLeft(), this.f10780c.getTop(), this.f10780c.getRight(), this.f10780c.getBottom());
            }
        }
        boolean z10 = false;
        if (this.f10785h) {
            if (this.f10784g == null) {
                z10 = true;
            }
        } else if (this.f10782e == null && this.f10783f == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        invalidate();
        a.a(this);
    }

    public void setSplitBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f10784g;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f10784g);
        }
        this.f10784g = drawable;
        boolean z10 = false;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f10785h && (drawable2 = this.f10784g) != null) {
                drawable2.setBounds(0, 0, getMeasuredWidth(), getMeasuredHeight());
            }
        }
        if (!this.f10785h ? !(this.f10782e != null || this.f10783f != null) : this.f10784g == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        invalidate();
        a.a(this);
    }

    public void setStackedBackground(Drawable drawable) {
        Drawable drawable2;
        Drawable drawable3 = this.f10783f;
        if (drawable3 != null) {
            drawable3.setCallback(null);
            unscheduleDrawable(this.f10783f);
        }
        this.f10783f = drawable;
        if (drawable != null) {
            drawable.setCallback(this);
            if (this.f10786i && (drawable2 = this.f10783f) != null) {
                drawable2.setBounds(this.f10779b.getLeft(), this.f10779b.getTop(), this.f10779b.getRight(), this.f10779b.getBottom());
            }
        }
        boolean z10 = false;
        if (!this.f10785h ? !(this.f10782e != null || this.f10783f != null) : this.f10784g == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        invalidate();
        a.a(this);
    }

    public void setTabContainer(z0 z0Var) {
        View view = this.f10779b;
        if (view != null) {
            removeView(view);
        }
        this.f10779b = z0Var;
        if (z0Var != null) {
            addView(z0Var);
            ViewGroup.LayoutParams layoutParams = z0Var.getLayoutParams();
            layoutParams.width = -1;
            layoutParams.height = -2;
            z0Var.setAllowCollapse(false);
        }
    }

    public void setTransitioning(boolean z10) {
        this.f10778a = z10;
        setDescendantFocusability(z10 ? 393216 : 262144);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z10 = i10 == 0;
        Drawable drawable = this.f10782e;
        if (drawable != null) {
            drawable.setVisible(z10, false);
        }
        Drawable drawable2 = this.f10783f;
        if (drawable2 != null) {
            drawable2.setVisible(z10, false);
        }
        Drawable drawable3 = this.f10784g;
        if (drawable3 != null) {
            drawable3.setVisible(z10, false);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback) {
        return null;
    }

    @Override // android.view.View
    protected boolean verifyDrawable(@NonNull Drawable drawable) {
        return (drawable == this.f10782e && !this.f10785h) || (drawable == this.f10783f && this.f10786i) || ((drawable == this.f10784g && this.f10785h) || super.verifyDrawable(drawable));
    }

    public ActionBarContainer(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        setBackground(new b(this));
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.a.m.f286477a);
        this.f10782e = typedArrayObtainStyledAttributes.getDrawable(i.a.m.f286486b);
        this.f10783f = typedArrayObtainStyledAttributes.getDrawable(i.a.m.f286504d);
        this.f10787j = typedArrayObtainStyledAttributes.getDimensionPixelSize(i.a.m.f286601o, -1);
        boolean z10 = true;
        if (getId() == i.a.g.f286199j0) {
            this.f10785h = true;
            this.f10784g = typedArrayObtainStyledAttributes.getDrawable(i.a.m.f286495c);
        }
        typedArrayObtainStyledAttributes.recycle();
        if (!this.f10785h ? this.f10782e != null || this.f10783f != null : this.f10784g != null) {
            z10 = false;
        }
        setWillNotDraw(z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public ActionMode startActionModeForChild(View view, ActionMode.Callback callback, int i10) {
        if (i10 != 0) {
            return super.startActionModeForChild(view, callback, i10);
        }
        return null;
    }
}

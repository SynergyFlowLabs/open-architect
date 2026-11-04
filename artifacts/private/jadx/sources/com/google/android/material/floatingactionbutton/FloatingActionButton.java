package com.google.android.material.floatingactionbutton;

import android.animation.Animator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.d0;
import androidx.annotation.l1;
import androidx.annotation.p0;
import androidx.annotation.q;
import androidx.annotation.t0;
import androidx.annotation.v;
import androidx.annotation.w0;
import androidx.appcompat.widget.n;
import androidx.appcompat.widget.u;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.p1;
import androidx.core.view.u1;
import androidx.core.widget.x;
import com.google.android.material.animation.i;
import com.google.android.material.animation.l;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.google.android.material.internal.g0;
import com.google.android.material.internal.q0;
import com.google.android.material.shape.p;
import com.google.android.material.shape.t;
import com.google.android.material.stateful.ExtendableSavedState;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.util.List;

/* JADX INFO: loaded from: classes4.dex */
public class FloatingActionButton extends q0 implements p1, x, x6.a, t, CoordinatorLayout.b {
    public static final int H1 = 0;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    public static final int f112581g3 = 0;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    private static final int f112582h3 = 470;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private static final int f112583p0 = r6.a.n.Pe;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public static final int f112584p1 = 1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    public static final int f112585p2 = -1;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final String f112586v = "FloatingActionButton";

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final String f112587w = "expandableWidgetHelper";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @p0
    private ColorStateList f112588b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @p0
    private PorterDuff.Mode f112589c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @p0
    private ColorStateList f112590d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @p0
    private PorterDuff.Mode f112591e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @p0
    private ColorStateList f112592f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f112593g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f112594h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f112595i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f112596j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f112597k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    boolean f112598l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    final Rect f112599m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Rect f112600n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NonNull
    private final u f112601o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    @NonNull
    private final x6.c f112602s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private com.google.android.material.floatingactionbutton.d f112603t;

    public static class Behavior extends BaseBehavior<FloatingActionButton> {
        public Behavior() {
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        /* JADX INFO: renamed from: N */
        public /* bridge */ /* synthetic */ boolean i(@NonNull CoordinatorLayout coordinatorLayout, @NonNull FloatingActionButton floatingActionButton, @NonNull Rect rect) {
            return super.i(coordinatorLayout, floatingActionButton, rect);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        public /* bridge */ /* synthetic */ boolean O() {
            return super.O();
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        /* JADX INFO: renamed from: R */
        public /* bridge */ /* synthetic */ boolean p(CoordinatorLayout coordinatorLayout, @NonNull FloatingActionButton floatingActionButton, View view) {
            return super.p(coordinatorLayout, floatingActionButton, view);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        /* JADX INFO: renamed from: S */
        public /* bridge */ /* synthetic */ boolean t(@NonNull CoordinatorLayout coordinatorLayout, @NonNull FloatingActionButton floatingActionButton, int i10) {
            return super.t(coordinatorLayout, floatingActionButton, i10);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        public /* bridge */ /* synthetic */ void T(boolean z10) {
            super.T(z10);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior
        @l1
        public /* bridge */ /* synthetic */ void U(b bVar) {
            super.U(bVar);
        }

        @Override // com.google.android.material.floatingactionbutton.FloatingActionButton.BaseBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public /* bridge */ /* synthetic */ void o(@NonNull CoordinatorLayout.g gVar) {
            super.o(gVar);
        }

        public Behavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }
    }

    class a implements com.google.android.material.floatingactionbutton.d.k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ b f112608a;

        a(b bVar) {
            this.f112608a = bVar;
        }

        @Override // com.google.android.material.floatingactionbutton.d.k
        public void a() {
            this.f112608a.b(FloatingActionButton.this);
        }

        @Override // com.google.android.material.floatingactionbutton.d.k
        public void b() {
            this.f112608a.a(FloatingActionButton.this);
        }
    }

    public static abstract class b {
        public void a(FloatingActionButton floatingActionButton) {
        }

        public void b(FloatingActionButton floatingActionButton) {
        }
    }

    private class c implements com.google.android.material.shadow.c {
        c() {
        }

        @Override // com.google.android.material.shadow.c
        public float R() {
            return FloatingActionButton.this.getSizeDimension() / 2.0f;
        }

        @Override // com.google.android.material.shadow.c
        public void a(int i10, int i11, int i12, int i13) {
            FloatingActionButton.this.f112599m.set(i10, i11, i12, i13);
            FloatingActionButton floatingActionButton = FloatingActionButton.this;
            floatingActionButton.setPadding(i10 + floatingActionButton.f112596j, i11 + FloatingActionButton.this.f112596j, i12 + FloatingActionButton.this.f112596j, i13 + FloatingActionButton.this.f112596j);
        }

        @Override // com.google.android.material.shadow.c
        public void b(@p0 Drawable drawable) {
            if (drawable != null) {
                FloatingActionButton.super.setBackgroundDrawable(drawable);
            }
        }

        @Override // com.google.android.material.shadow.c
        public boolean c() {
            return FloatingActionButton.this.f112598l;
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @b1({b1.a.LIBRARY_GROUP})
    public @interface d {
    }

    class e<T extends FloatingActionButton> implements com.google.android.material.floatingactionbutton.d.j {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        @NonNull
        private final l<T> f112611a;

        e(l<T> lVar) {
            this.f112611a = lVar;
        }

        @Override // com.google.android.material.floatingactionbutton.d.j
        public void a() {
            this.f112611a.a(FloatingActionButton.this);
        }

        @Override // com.google.android.material.floatingactionbutton.d.j
        public void b() {
            this.f112611a.b(FloatingActionButton.this);
        }

        public boolean equals(@p0 Object obj) {
            return (obj instanceof e) && ((e) obj).f112611a.equals(this.f112611a);
        }

        public int hashCode() {
            return this.f112611a.hashCode();
        }
    }

    public FloatingActionButton(@NonNull Context context) {
        this(context, null);
    }

    @p0
    private com.google.android.material.floatingactionbutton.d.k C(@p0 b bVar) {
        if (bVar == null) {
            return null;
        }
        return new a(bVar);
    }

    private com.google.android.material.floatingactionbutton.d getImpl() {
        if (this.f112603t == null) {
            this.f112603t = j();
        }
        return this.f112603t;
    }

    @NonNull
    private com.google.android.material.floatingactionbutton.d j() {
        return new com.google.android.material.floatingactionbutton.e(this, new c());
    }

    private int m(int i10) {
        int i11 = this.f112595i;
        if (i11 != 0) {
            return i11;
        }
        Resources resources = getResources();
        if (i10 != -1) {
            return i10 != 1 ? resources.getDimensionPixelSize(r6.a.f.f360260k1) : resources.getDimensionPixelSize(r6.a.f.f360244j1);
        }
        return Math.max(resources.getConfiguration().screenWidthDp, resources.getConfiguration().screenHeightDp) < f112582h3 ? m(1) : m(0);
    }

    private void n(@NonNull Rect rect) {
        l(rect);
        int i10 = -this.f112603t.w();
        rect.inset(i10, i10);
    }

    private void t(@NonNull Rect rect) {
        int i10 = rect.left;
        Rect rect2 = this.f112599m;
        rect.left = i10 + rect2.left;
        rect.top += rect2.top;
        rect.right -= rect2.right;
        rect.bottom -= rect2.bottom;
    }

    private void u() {
        Drawable drawable = getDrawable();
        if (drawable == null) {
            return;
        }
        ColorStateList colorStateList = this.f112590d;
        if (colorStateList == null) {
            androidx.core.graphics.drawable.c.c(drawable);
            return;
        }
        int colorForState = colorStateList.getColorForState(getDrawableState(), 0);
        PorterDuff.Mode mode = this.f112591e;
        if (mode == null) {
            mode = PorterDuff.Mode.SRC_IN;
        }
        drawable.mutate().setColorFilter(n.e(colorForState, mode));
    }

    public void A(@p0 b bVar) {
        B(bVar, true);
    }

    void B(@p0 b bVar, boolean z10) {
        getImpl().g0(C(bVar), z10);
    }

    @Override // x6.b
    public boolean a(boolean z10) {
        return this.f112602s.f(z10);
    }

    @Override // x6.b
    public boolean b() {
        return this.f112602s.c();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        getImpl().F(getDrawableState());
    }

    public void f(@NonNull Animator.AnimatorListener animatorListener) {
        getImpl().e(animatorListener);
    }

    public void g(@NonNull Animator.AnimatorListener animatorListener) {
        getImpl().f(animatorListener);
    }

    @Override // android.view.View
    @p0
    public ColorStateList getBackgroundTintList() {
        return this.f112588b;
    }

    @Override // android.view.View
    @p0
    public PorterDuff.Mode getBackgroundTintMode() {
        return this.f112589c;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.b
    @NonNull
    public CoordinatorLayout.c<FloatingActionButton> getBehavior() {
        return new Behavior();
    }

    public float getCompatElevation() {
        return getImpl().n();
    }

    public float getCompatHoveredFocusedTranslationZ() {
        return getImpl().q();
    }

    public float getCompatPressedTranslationZ() {
        return getImpl().t();
    }

    @p0
    public Drawable getContentBackground() {
        return getImpl().m();
    }

    @t0
    public int getCustomSize() {
        return this.f112595i;
    }

    @Override // x6.a
    public int getExpandedComponentIdHint() {
        return this.f112602s.b();
    }

    @p0
    public i getHideMotionSpec() {
        return getImpl().p();
    }

    @androidx.annotation.l
    @Deprecated
    public int getRippleColor() {
        ColorStateList colorStateList = this.f112592f;
        if (colorStateList != null) {
            return colorStateList.getDefaultColor();
        }
        return 0;
    }

    @p0
    public ColorStateList getRippleColorStateList() {
        return this.f112592f;
    }

    @Override // com.google.android.material.shape.t
    @NonNull
    public p getShapeAppearanceModel() {
        return (p) androidx.core.util.t.l(getImpl().u());
    }

    @p0
    public i getShowMotionSpec() {
        return getImpl().v();
    }

    public int getSize() {
        return this.f112594h;
    }

    int getSizeDimension() {
        return m(this.f112594h);
    }

    @Override // androidx.core.view.p1
    @p0
    public ColorStateList getSupportBackgroundTintList() {
        return getBackgroundTintList();
    }

    @Override // androidx.core.view.p1
    @p0
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        return getBackgroundTintMode();
    }

    @Override // androidx.core.widget.x
    @p0
    public ColorStateList getSupportImageTintList() {
        return this.f112590d;
    }

    @Override // androidx.core.widget.x
    @p0
    public PorterDuff.Mode getSupportImageTintMode() {
        return this.f112591e;
    }

    public boolean getUseCompatPadding() {
        return this.f112598l;
    }

    public void h(@NonNull l<? extends FloatingActionButton> lVar) {
        getImpl().g(new e(lVar));
    }

    public void i() {
        setCustomSize(0);
    }

    @Override // android.widget.ImageView, android.view.View
    public void jumpDrawablesToCurrentState() {
        super.jumpDrawablesToCurrentState();
        getImpl().B();
    }

    @Deprecated
    public boolean k(@NonNull Rect rect) {
        if (!u1.Y0(this)) {
            return false;
        }
        rect.set(0, 0, getWidth(), getHeight());
        t(rect);
        return true;
    }

    public void l(@NonNull Rect rect) {
        rect.set(0, 0, getMeasuredWidth(), getMeasuredHeight());
        t(rect);
    }

    public void o() {
        p(null);
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        getImpl().C();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getImpl().E();
    }

    @Override // android.widget.ImageView, android.view.View
    protected void onMeasure(int i10, int i11) {
        int sizeDimension = getSizeDimension();
        this.f112596j = (sizeDimension - this.f112597k) / 2;
        getImpl().j0();
        int iMin = Math.min(View.resolveSize(sizeDimension, i10), View.resolveSize(sizeDimension, i11));
        Rect rect = this.f112599m;
        setMeasuredDimension(rect.left + iMin + rect.right, iMin + rect.top + rect.bottom);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof ExtendableSavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        ExtendableSavedState extendableSavedState = (ExtendableSavedState) parcelable;
        super.onRestoreInstanceState(extendableSavedState.a());
        this.f112602s.d((Bundle) androidx.core.util.t.l(extendableSavedState.f113944c.get(f112587w)));
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Parcelable parcelableOnSaveInstanceState = super.onSaveInstanceState();
        if (parcelableOnSaveInstanceState == null) {
            parcelableOnSaveInstanceState = new Bundle();
        }
        ExtendableSavedState extendableSavedState = new ExtendableSavedState(parcelableOnSaveInstanceState);
        extendableSavedState.f113944c.put(f112587w, this.f112602s.e());
        return extendableSavedState;
    }

    @Override // android.view.View
    public boolean onTouchEvent(@NonNull MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            n(this.f112600n);
            if (!this.f112600n.contains((int) motionEvent.getX(), (int) motionEvent.getY())) {
                return false;
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    public void p(@p0 b bVar) {
        q(bVar, true);
    }

    void q(@p0 b bVar, boolean z10) {
        getImpl().x(C(bVar), z10);
    }

    public boolean r() {
        return getImpl().z();
    }

    public boolean s() {
        return getImpl().A();
    }

    @Override // android.view.View
    public void setBackgroundColor(int i10) {
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
    }

    @Override // android.view.View
    public void setBackgroundResource(int i10) {
    }

    @Override // android.view.View
    public void setBackgroundTintList(@p0 ColorStateList colorStateList) {
        if (this.f112588b != colorStateList) {
            this.f112588b = colorStateList;
            getImpl().P(colorStateList);
        }
    }

    @Override // android.view.View
    public void setBackgroundTintMode(@p0 PorterDuff.Mode mode) {
        if (this.f112589c != mode) {
            this.f112589c = mode;
            getImpl().Q(mode);
        }
    }

    public void setCompatElevation(float f10) {
        getImpl().R(f10);
    }

    public void setCompatElevationResource(@q int i10) {
        setCompatElevation(getResources().getDimension(i10));
    }

    public void setCompatHoveredFocusedTranslationZ(float f10) {
        getImpl().U(f10);
    }

    public void setCompatHoveredFocusedTranslationZResource(@q int i10) {
        setCompatHoveredFocusedTranslationZ(getResources().getDimension(i10));
    }

    public void setCompatPressedTranslationZ(float f10) {
        getImpl().Y(f10);
    }

    public void setCompatPressedTranslationZResource(@q int i10) {
        setCompatPressedTranslationZ(getResources().getDimension(i10));
    }

    public void setCustomSize(@t0 int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("Custom size must be non-negative");
        }
        if (i10 != this.f112595i) {
            this.f112595i = i10;
            requestLayout();
        }
    }

    @Override // android.view.View
    @w0(21)
    public void setElevation(float f10) {
        super.setElevation(f10);
        getImpl().k0(f10);
    }

    public void setEnsureMinTouchTargetSize(boolean z10) {
        if (z10 != getImpl().o()) {
            getImpl().S(z10);
            requestLayout();
        }
    }

    @Override // x6.a
    public void setExpandedComponentIdHint(@d0 int i10) {
        this.f112602s.g(i10);
    }

    public void setHideMotionSpec(@p0 i iVar) {
        getImpl().T(iVar);
    }

    public void setHideMotionSpecResource(@androidx.annotation.b int i10) {
        setHideMotionSpec(i.d(getContext(), i10));
    }

    @Override // android.widget.ImageView
    public void setImageDrawable(@p0 Drawable drawable) {
        if (getDrawable() != drawable) {
            super.setImageDrawable(drawable);
            getImpl().i0();
            if (this.f112590d != null) {
                u();
            }
        }
    }

    @Override // android.widget.ImageView
    public void setImageResource(@v int i10) {
        this.f112601o.i(i10);
        u();
    }

    public void setMaxImageSize(int i10) {
        this.f112597k = i10;
        getImpl().W(i10);
    }

    public void setRippleColor(@androidx.annotation.l int i10) {
        setRippleColor(ColorStateList.valueOf(i10));
    }

    @Override // android.view.View
    public void setScaleX(float f10) {
        super.setScaleX(f10);
        getImpl().J();
    }

    @Override // android.view.View
    public void setScaleY(float f10) {
        super.setScaleY(f10);
        getImpl().J();
    }

    @l1
    @b1({b1.a.LIBRARY_GROUP})
    public void setShadowPaddingEnabled(boolean z10) {
        getImpl().a0(z10);
    }

    @Override // com.google.android.material.shape.t
    public void setShapeAppearanceModel(@NonNull p pVar) {
        getImpl().b0(pVar);
    }

    public void setShowMotionSpec(@p0 i iVar) {
        getImpl().c0(iVar);
    }

    public void setShowMotionSpecResource(@androidx.annotation.b int i10) {
        setShowMotionSpec(i.d(getContext(), i10));
    }

    public void setSize(int i10) {
        this.f112595i = 0;
        if (i10 != this.f112594h) {
            this.f112594h = i10;
            requestLayout();
        }
    }

    @Override // androidx.core.view.p1
    public void setSupportBackgroundTintList(@p0 ColorStateList colorStateList) {
        setBackgroundTintList(colorStateList);
    }

    @Override // androidx.core.view.p1
    public void setSupportBackgroundTintMode(@p0 PorterDuff.Mode mode) {
        setBackgroundTintMode(mode);
    }

    @Override // androidx.core.widget.x
    public void setSupportImageTintList(@p0 ColorStateList colorStateList) {
        if (this.f112590d != colorStateList) {
            this.f112590d = colorStateList;
            u();
        }
    }

    @Override // androidx.core.widget.x
    public void setSupportImageTintMode(@p0 PorterDuff.Mode mode) {
        if (this.f112591e != mode) {
            this.f112591e = mode;
            u();
        }
    }

    @Override // android.view.View
    public void setTranslationX(float f10) {
        super.setTranslationX(f10);
        getImpl().K();
    }

    @Override // android.view.View
    public void setTranslationY(float f10) {
        super.setTranslationY(f10);
        getImpl().K();
    }

    @Override // android.view.View
    public void setTranslationZ(float f10) {
        super.setTranslationZ(f10);
        getImpl().K();
    }

    public void setUseCompatPadding(boolean z10) {
        if (this.f112598l != z10) {
            this.f112598l = z10;
            getImpl().D();
        }
    }

    @Override // com.google.android.material.internal.q0, android.widget.ImageView, android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
    }

    public void v(@NonNull Animator.AnimatorListener animatorListener) {
        getImpl().L(animatorListener);
    }

    public void w(@NonNull Animator.AnimatorListener animatorListener) {
        getImpl().M(animatorListener);
    }

    public void x(@NonNull l<? extends FloatingActionButton> lVar) {
        getImpl().N(new e(lVar));
    }

    public boolean y() {
        return getImpl().o();
    }

    public void z() {
        A(null);
    }

    protected static class BaseBehavior<T extends FloatingActionButton> extends CoordinatorLayout.c<T> {

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static final boolean f112604d = true;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private Rect f112605a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private b f112606b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f112607c;

        public BaseBehavior() {
            this.f112607c = true;
        }

        private static boolean P(@NonNull View view) {
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams instanceof CoordinatorLayout.g) {
                return ((CoordinatorLayout.g) layoutParams).f() instanceof BottomSheetBehavior;
            }
            return false;
        }

        private void Q(@NonNull CoordinatorLayout coordinatorLayout, @NonNull FloatingActionButton floatingActionButton) {
            int i10;
            Rect rect = floatingActionButton.f112599m;
            if (rect == null || rect.centerX() <= 0 || rect.centerY() <= 0) {
                return;
            }
            CoordinatorLayout.g gVar = (CoordinatorLayout.g) floatingActionButton.getLayoutParams();
            int i11 = 0;
            if (floatingActionButton.getRight() >= coordinatorLayout.getWidth() - ((ViewGroup.MarginLayoutParams) gVar).rightMargin) {
                i10 = rect.right;
            } else {
                i10 = floatingActionButton.getLeft() <= ((ViewGroup.MarginLayoutParams) gVar).leftMargin ? -rect.left : 0;
            }
            if (floatingActionButton.getBottom() >= coordinatorLayout.getHeight() - ((ViewGroup.MarginLayoutParams) gVar).bottomMargin) {
                i11 = rect.bottom;
            } else if (floatingActionButton.getTop() <= ((ViewGroup.MarginLayoutParams) gVar).topMargin) {
                i11 = -rect.top;
            }
            if (i11 != 0) {
                u1.i1(floatingActionButton, i11);
            }
            if (i10 != 0) {
                u1.h1(floatingActionButton, i10);
            }
        }

        private boolean V(@NonNull View view, @NonNull FloatingActionButton floatingActionButton) {
            CoordinatorLayout.g gVar = (CoordinatorLayout.g) floatingActionButton.getLayoutParams();
            boolean z10 = true;
            if (this.f112607c && gVar.e() == view.getId() && floatingActionButton.getUserSetVisibility() == 0) {
                return true;
            }
            return false;
        }

        private boolean W(CoordinatorLayout coordinatorLayout, @NonNull AppBarLayout appBarLayout, @NonNull FloatingActionButton floatingActionButton) {
            if (!V(appBarLayout, floatingActionButton)) {
                return false;
            }
            if (this.f112605a == null) {
                this.f112605a = new Rect();
            }
            Rect rect = this.f112605a;
            com.google.android.material.internal.d.a(coordinatorLayout, appBarLayout, rect);
            if (rect.bottom <= appBarLayout.getMinimumHeightForVisibleOverlappingContent()) {
                floatingActionButton.q(this.f112606b, false);
            } else {
                floatingActionButton.B(this.f112606b, false);
            }
            return true;
        }

        private boolean X(@NonNull View view, @NonNull FloatingActionButton floatingActionButton) {
            if (!V(view, floatingActionButton)) {
                return false;
            }
            if (view.getTop() < (floatingActionButton.getHeight() / 2) + ((ViewGroup.MarginLayoutParams) ((CoordinatorLayout.g) floatingActionButton.getLayoutParams())).topMargin) {
                floatingActionButton.q(this.f112606b, false);
            } else {
                floatingActionButton.B(this.f112606b, false);
            }
            return true;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: N, reason: merged with bridge method [inline-methods] */
        public boolean i(@NonNull CoordinatorLayout coordinatorLayout, @NonNull FloatingActionButton floatingActionButton, @NonNull Rect rect) {
            Rect rect2 = floatingActionButton.f112599m;
            rect.set(floatingActionButton.getLeft() + rect2.left, floatingActionButton.getTop() + rect2.top, floatingActionButton.getRight() - rect2.right, floatingActionButton.getBottom() - rect2.bottom);
            return true;
        }

        public boolean O() {
            return this.f112607c;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: R, reason: merged with bridge method [inline-methods] */
        public boolean p(CoordinatorLayout coordinatorLayout, @NonNull FloatingActionButton floatingActionButton, View view) {
            if (view instanceof AppBarLayout) {
                W(coordinatorLayout, (AppBarLayout) view, floatingActionButton);
                return false;
            }
            if (!P(view)) {
                return false;
            }
            X(view, floatingActionButton);
            return false;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        /* JADX INFO: renamed from: S, reason: merged with bridge method [inline-methods] */
        public boolean t(@NonNull CoordinatorLayout coordinatorLayout, @NonNull FloatingActionButton floatingActionButton, int i10) {
            List<View> listW = coordinatorLayout.w(floatingActionButton);
            int size = listW.size();
            for (int i11 = 0; i11 < size; i11++) {
                View view = listW.get(i11);
                if (!(view instanceof AppBarLayout)) {
                    if (P(view) && X(view, floatingActionButton)) {
                        break;
                    }
                } else {
                    if (W(coordinatorLayout, (AppBarLayout) view, floatingActionButton)) {
                        break;
                    }
                }
            }
            coordinatorLayout.N(floatingActionButton, i10);
            Q(coordinatorLayout, floatingActionButton);
            return true;
        }

        public void T(boolean z10) {
            this.f112607c = z10;
        }

        @l1
        public void U(b bVar) {
            this.f112606b = bVar;
        }

        @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public void o(@NonNull CoordinatorLayout.g gVar) {
            if (gVar.f46855h == 0) {
                gVar.f46855h = 80;
            }
        }

        public BaseBehavior(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r6.a.o.Fg);
            this.f112607c = typedArrayObtainStyledAttributes.getBoolean(r6.a.o.Gg, true);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public FloatingActionButton(@NonNull Context context, @p0 AttributeSet attributeSet) {
        this(context, attributeSet, r6.a.c.Q7);
    }

    public void setRippleColor(@p0 ColorStateList colorStateList) {
        if (this.f112592f != colorStateList) {
            this.f112592f = colorStateList;
            getImpl().Z(this.f112592f);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public FloatingActionButton(@NonNull Context context, @p0 AttributeSet attributeSet, int i10) {
        int i11 = f112583p0;
        super(a7.a.c(context, attributeSet, i10, i11), attributeSet, i10);
        this.f112599m = new Rect();
        this.f112600n = new Rect();
        Context context2 = getContext();
        boolean z10 = false & false;
        TypedArray typedArrayK = g0.k(context2, attributeSet, r6.a.o.f361929ng, i10, i11, new int[0]);
        this.f112588b = com.google.android.material.resources.c.a(context2, typedArrayK, r6.a.o.f361977pg);
        this.f112589c = com.google.android.material.internal.p0.t(typedArrayK.getInt(r6.a.o.f362001qg, -1), null);
        this.f112592f = com.google.android.material.resources.c.a(context2, typedArrayK, r6.a.o.Ag);
        this.f112594h = typedArrayK.getInt(r6.a.o.f362122vg, -1);
        this.f112595i = typedArrayK.getDimensionPixelSize(r6.a.o.f362098ug, 0);
        this.f112593g = typedArrayK.getDimensionPixelSize(r6.a.o.f362025rg, 0);
        float dimension = typedArrayK.getDimension(r6.a.o.f362050sg, 0.0f);
        float dimension2 = typedArrayK.getDimension(r6.a.o.f362170xg, 0.0f);
        float dimension3 = typedArrayK.getDimension(r6.a.o.f362218zg, 0.0f);
        this.f112598l = typedArrayK.getBoolean(r6.a.o.Eg, false);
        int dimensionPixelSize = getResources().getDimensionPixelSize(r6.a.f.f360415tc);
        setMaxImageSize(typedArrayK.getDimensionPixelSize(r6.a.o.f362194yg, 0));
        i iVarC = i.c(context2, typedArrayK, r6.a.o.Dg);
        i iVarC2 = i.c(context2, typedArrayK, r6.a.o.f362146wg);
        p pVarM = p.g(context2, attributeSet, i10, i11, p.f113595m).m();
        boolean z11 = typedArrayK.getBoolean(r6.a.o.f362074tg, false);
        setEnabled(typedArrayK.getBoolean(r6.a.o.f361953og, true));
        typedArrayK.recycle();
        u uVar = new u(this);
        this.f112601o = uVar;
        uVar.g(attributeSet, i10);
        this.f112602s = new x6.c(this);
        getImpl().b0(pVarM);
        getImpl().y(this.f112588b, this.f112589c, this.f112592f, this.f112593g);
        getImpl().X(dimensionPixelSize);
        getImpl().R(dimension);
        getImpl().U(dimension2);
        getImpl().Y(dimension3);
        getImpl().c0(iVarC);
        getImpl().T(iVarC2);
        getImpl().S(z11);
        setScaleType(ImageView.ScaleType.MATRIX);
    }
}

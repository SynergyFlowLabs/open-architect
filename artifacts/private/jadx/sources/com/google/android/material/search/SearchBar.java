package com.google.android.material.search;

import android.R;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityManager;
import android.view.accessibility.AccessibilityNodeInfo;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.f1;
import androidx.annotation.g1;
import androidx.annotation.m0;
import androidx.annotation.p0;
import androidx.annotation.w0;
import androidx.appcompat.widget.ActionMenuView;
import androidx.appcompat.widget.Toolbar;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.j0;
import androidx.core.view.u1;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.internal.h0;

/* JADX INFO: loaded from: classes4.dex */
public class SearchBar extends Toolbar {

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final int f113343s = r6.a.n.Bh;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final int f113344t = 53;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final String f113345v = "http://schemas.android.com/apk/res-auto";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final TextView f113346a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final boolean f113347b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final boolean f113348c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final j f113349d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Drawable f113350e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final boolean f113351f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final boolean f113352g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @p0
    private View f113353h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    @p0
    private Integer f113354i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @p0
    private Drawable f113355j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f113356k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f113357l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private com.google.android.material.shape.k f113358m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @p0
    private final AccessibilityManager f113359n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final androidx.core.view.accessibility.c.e f113360o;

    static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        String f113361c;

        class a implements Parcelable.ClassLoaderCreator<SavedState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public SavedState(Parcel parcel) {
            this(parcel, null);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeString(this.f113361c);
        }

        public SavedState(Parcel parcel, @p0 ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f113361c = parcel.readString();
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    class a implements View.OnAttachStateChangeListener {
        a() {
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewAttachedToWindow(View view) {
            androidx.core.view.accessibility.c.b(SearchBar.this.f113359n, SearchBar.this.f113360o);
        }

        @Override // android.view.View.OnAttachStateChangeListener
        public void onViewDetachedFromWindow(View view) {
            androidx.core.view.accessibility.c.h(SearchBar.this.f113359n, SearchBar.this.f113360o);
        }
    }

    public static abstract class b {
        public void a() {
        }

        public void b() {
        }
    }

    public SearchBar(@NonNull Context context) {
        this(context, null);
    }

    private int H(int i10, int i11) {
        return i10 == 0 ? i11 : i10;
    }

    private ColorStateList M(@androidx.annotation.l int i10, @androidx.annotation.l int i11) {
        int[][] iArr = {new int[]{R.attr.state_pressed}, new int[]{R.attr.state_focused}, new int[0]};
        int iS = com.google.android.material.color.u.s(i10, i11);
        return new ColorStateList(iArr, new int[]{iS, iS, i10});
    }

    private void N(com.google.android.material.shape.p pVar, @androidx.annotation.l int i10, float f10, float f11, @androidx.annotation.l int i11) {
        com.google.android.material.shape.k kVar = new com.google.android.material.shape.k(pVar);
        this.f113358m = kVar;
        kVar.a0(getContext());
        this.f113358m.o0(f10);
        if (f11 >= 0.0f) {
            this.f113358m.E0(f11, i11);
        }
        int iD = com.google.android.material.color.u.d(this, r6.a.c.f359488q3);
        this.f113358m.p0(ColorStateList.valueOf(i10));
        ColorStateList colorStateListValueOf = ColorStateList.valueOf(iD);
        com.google.android.material.shape.k kVar2 = this.f113358m;
        u1.O1(this, new RippleDrawable(colorStateListValueOf, kVar2, kVar2));
    }

    private void O() {
        setNavigationIcon(getNavigationIcon() == null ? this.f113350e : getNavigationIcon());
        setNavigationIconDecorative(true);
    }

    private void P(@g1 int i10, String str, String str2) {
        if (i10 != -1) {
            androidx.core.widget.r.D(this.f113346a, i10);
        }
        setText(str);
        setHint(str2);
        if (getNavigationIcon() == null) {
            j0.h((ViewGroup.MarginLayoutParams) this.f113346a.getLayoutParams(), getResources().getDimensionPixelSize(r6.a.f.f360299m8));
        }
    }

    private void U() {
        View view = this.f113353h;
        if (view == null) {
            return;
        }
        int measuredWidth = view.getMeasuredWidth();
        int measuredWidth2 = (getMeasuredWidth() / 2) - (measuredWidth / 2);
        int i10 = measuredWidth2 + measuredWidth;
        int measuredHeight = this.f113353h.getMeasuredHeight();
        int measuredHeight2 = (getMeasuredHeight() / 2) - (measuredHeight / 2);
        V(this.f113353h, measuredWidth2, measuredHeight2, i10, measuredHeight2 + measuredHeight);
    }

    private void V(View view, int i10, int i11, int i12, int i13) {
        if (u1.c0(this) == 1) {
            view.layout(getMeasuredWidth() - i12, i11, getMeasuredWidth() - i10, i13);
        } else {
            view.layout(i10, i11, i12, i13);
        }
    }

    @p0
    private Drawable W(@p0 Drawable drawable) {
        int iD;
        if (this.f113351f && drawable != null) {
            Integer num = this.f113354i;
            if (num != null) {
                iD = num.intValue();
            } else {
                iD = com.google.android.material.color.u.d(this, drawable == this.f113350e ? r6.a.c.K3 : r6.a.c.I3);
            }
            drawable = androidx.core.graphics.drawable.c.r(drawable.mutate());
            androidx.core.graphics.drawable.c.n(drawable, iD);
        }
        return drawable;
    }

    private void X(int i10, int i11) {
        View view = this.f113353h;
        if (view != null) {
            view.measure(i10, i11);
        }
    }

    private void b0() {
        if (this.f113348c && (getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            Resources resources = getResources();
            int dimensionPixelSize = resources.getDimensionPixelSize(r6.a.f.f360235i8);
            int dimensionPixelSize2 = resources.getDimensionPixelSize(getDefaultMarginVerticalResource());
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) getLayoutParams();
            marginLayoutParams.leftMargin = H(marginLayoutParams.leftMargin, dimensionPixelSize);
            marginLayoutParams.topMargin = H(marginLayoutParams.topMargin, dimensionPixelSize2);
            marginLayoutParams.rightMargin = H(marginLayoutParams.rightMargin, dimensionPixelSize);
            marginLayoutParams.bottomMargin = H(marginLayoutParams.bottomMargin, dimensionPixelSize2);
        }
    }

    private void c0() {
        int width;
        if (Build.VERSION.SDK_INT < 34) {
            return;
        }
        int right = 0;
        boolean z10 = getLayoutDirection() == 1;
        ImageButton imageButtonE = h0.e(this);
        if (imageButtonE == null || !imageButtonE.isClickable()) {
            width = 0;
        } else {
            width = z10 ? getWidth() - imageButtonE.getLeft() : imageButtonE.getRight();
        }
        ActionMenuView actionMenuViewB = h0.b(this);
        if (actionMenuViewB != null) {
            right = z10 ? actionMenuViewB.getRight() : getWidth() - actionMenuViewB.getLeft();
        }
        float f10 = -(z10 ? right : width);
        if (!z10) {
            width = right;
        }
        setHandwritingBoundsOffsets(f10, 0.0f, -width, 0.0f);
    }

    private void d0() {
        if (getLayoutParams() instanceof AppBarLayout.e) {
            AppBarLayout.e eVar = (AppBarLayout.e) getLayoutParams();
            if (this.f113357l) {
                if (eVar.c() == 0) {
                    eVar.h(53);
                }
            } else if (eVar.c() == 53) {
                eVar.h(0);
            }
        }
    }

    private void e0() {
        AccessibilityManager accessibilityManager = this.f113359n;
        if (accessibilityManager != null) {
            if (accessibilityManager.isEnabled() && this.f113359n.isTouchExplorationEnabled()) {
                setFocusableInTouchMode(true);
            }
            addOnAttachStateChangeListener(new a());
        }
    }

    private void h0(@p0 AttributeSet attributeSet) {
        if (attributeSet == null) {
            return;
        }
        if (attributeSet.getAttributeValue(f113345v, "title") != null) {
            throw new UnsupportedOperationException("SearchBar does not support title. Use hint or text instead.");
        }
        if (attributeSet.getAttributeValue(f113345v, "subtitle") != null) {
            throw new UnsupportedOperationException("SearchBar does not support subtitle. Use hint or text instead.");
        }
    }

    private void setNavigationIconDecorative(boolean z10) {
        ImageButton imageButtonE = h0.e(this);
        if (imageButtonE == null) {
            return;
        }
        imageButtonE.setClickable(!z10);
        imageButtonE.setFocusable(!z10);
        Drawable background = imageButtonE.getBackground();
        if (background != null) {
            this.f113355j = background;
        }
        imageButtonE.setBackgroundDrawable(z10 ? null : this.f113355j);
        c0();
    }

    public void A(@NonNull AnimatorListenerAdapter animatorListenerAdapter) {
        this.f113349d.h(animatorListenerAdapter);
    }

    public void B(@NonNull AnimatorListenerAdapter animatorListenerAdapter) {
        this.f113349d.i(animatorListenerAdapter);
    }

    public void C(@NonNull b bVar) {
        this.f113349d.j(bVar);
    }

    public void D() {
        this.f113346a.setText("");
    }

    @z7.a
    public boolean E(@NonNull View view) {
        return F(view, null);
    }

    @z7.a
    public boolean F(@NonNull View view, @p0 AppBarLayout appBarLayout) {
        return G(view, appBarLayout, false);
    }

    @z7.a
    public boolean G(@NonNull View view, @p0 AppBarLayout appBarLayout, boolean z10) {
        if ((view.getVisibility() != 0 || Q()) && !S()) {
            return false;
        }
        this.f113349d.E(this, view, appBarLayout, z10);
        return true;
    }

    @z7.a
    public boolean I(@NonNull View view) {
        return J(view, null);
    }

    @z7.a
    public boolean J(@NonNull View view, @p0 AppBarLayout appBarLayout) {
        return L(view, appBarLayout, false);
    }

    @z7.a
    public boolean L(@NonNull View view, @p0 AppBarLayout appBarLayout, boolean z10) {
        if ((view.getVisibility() == 0 || S()) && !Q()) {
            return false;
        }
        this.f113349d.F(this, view, appBarLayout, z10);
        return true;
    }

    public boolean Q() {
        return this.f113349d.x();
    }

    public boolean R() {
        return this.f113357l;
    }

    public boolean S() {
        return this.f113349d.y();
    }

    public boolean T() {
        return this.f113349d.z();
    }

    public boolean Y(@NonNull AnimatorListenerAdapter animatorListenerAdapter) {
        return this.f113349d.A(animatorListenerAdapter);
    }

    public boolean Z(@NonNull AnimatorListenerAdapter animatorListenerAdapter) {
        return this.f113349d.B(animatorListenerAdapter);
    }

    public boolean a0(@NonNull b bVar) {
        return this.f113349d.C(bVar);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (this.f113347b && this.f113353h == null && !(view instanceof ActionMenuView)) {
            this.f113353h = view;
            view.setAlpha(0.0f);
        }
        super.addView(view, i10, layoutParams);
    }

    public void f0() {
        post(new Runnable() { // from class: com.google.android.material.search.b
            @Override // java.lang.Runnable
            public final void run() {
                SearchBar searchBar = this.f113403a;
                searchBar.f113349d.G(searchBar);
            }
        });
    }

    public void g0() {
        this.f113349d.H(this);
    }

    @p0
    public View getCenterView() {
        return this.f113353h;
    }

    float getCompatElevation() {
        com.google.android.material.shape.k kVar = this.f113358m;
        return kVar != null ? kVar.y() : u1.T(this);
    }

    public float getCornerSize() {
        return this.f113358m.T();
    }

    @androidx.annotation.q
    @b1({b1.a.LIBRARY_GROUP})
    protected int getDefaultMarginVerticalResource() {
        return r6.a.f.f360251j8;
    }

    @androidx.annotation.v
    @b1({b1.a.LIBRARY_GROUP})
    protected int getDefaultNavigationIconResource() {
        return r6.a.g.f360541h1;
    }

    @p0
    public CharSequence getHint() {
        return this.f113346a.getHint();
    }

    int getMenuResId() {
        return this.f113356k;
    }

    @androidx.annotation.l
    public int getStrokeColor() {
        return this.f113358m.O().getDefaultColor();
    }

    @androidx.annotation.r
    public float getStrokeWidth() {
        return this.f113358m.R();
    }

    @NonNull
    public CharSequence getText() {
        return this.f113346a.getText();
    }

    @NonNull
    public TextView getTextView() {
        return this.f113346a;
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void inflateMenu(@m0 int i10) {
        Menu menu = getMenu();
        boolean z10 = menu instanceof androidx.appcompat.view.menu.g;
        if (z10) {
            ((androidx.appcompat.view.menu.g) menu).n0();
        }
        super.inflateMenu(i10);
        this.f113356k = i10;
        if (z10) {
            ((androidx.appcompat.view.menu.g) menu).m0();
        }
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        com.google.android.material.shape.l.f(this, this.f113358m);
        b0();
        d0();
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        accessibilityNodeInfo.setClassName(EditText.class.getCanonicalName());
        accessibilityNodeInfo.setEditable(isEnabled());
        CharSequence text = getText();
        boolean zIsEmpty = TextUtils.isEmpty(text);
        accessibilityNodeInfo.setHintText(getHint());
        accessibilityNodeInfo.setShowingHintText(zIsEmpty);
        if (zIsEmpty) {
            text = getHint();
        }
        accessibilityNodeInfo.setText(text);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        U();
        c0();
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        X(i10, i11);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        setText(savedState.f113361c);
    }

    @Override // androidx.appcompat.widget.Toolbar, android.view.View
    @NonNull
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        CharSequence text = getText();
        savedState.f113361c = text == null ? null : text.toString();
        return savedState;
    }

    public void setCenterView(@p0 View view) {
        View view2 = this.f113353h;
        if (view2 != null) {
            removeView(view2);
            this.f113353h = null;
        }
        if (view != null) {
            addView(view);
        }
    }

    public void setDefaultScrollFlagsEnabled(boolean z10) {
        this.f113357l = z10;
        d0();
    }

    @Override // android.view.View
    @w0(21)
    public void setElevation(float f10) {
        super.setElevation(f10);
        com.google.android.material.shape.k kVar = this.f113358m;
        if (kVar != null) {
            kVar.o0(f10);
        }
    }

    public void setHint(@p0 CharSequence charSequence) {
        this.f113346a.setHint(charSequence);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationIcon(@p0 Drawable drawable) {
        super.setNavigationIcon(W(drawable));
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setNavigationOnClickListener(View.OnClickListener onClickListener) {
        if (this.f113352g) {
            return;
        }
        super.setNavigationOnClickListener(onClickListener);
        setNavigationIconDecorative(onClickListener == null);
    }

    public void setOnLoadAnimationFadeInEnabled(boolean z10) {
        this.f113349d.D(z10);
    }

    public void setStrokeColor(@androidx.annotation.l int i10) {
        if (getStrokeColor() != i10) {
            this.f113358m.G0(ColorStateList.valueOf(i10));
        }
    }

    public void setStrokeWidth(@androidx.annotation.r float f10) {
        if (getStrokeWidth() != f10) {
            this.f113358m.J0(f10);
        }
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setSubtitle(CharSequence charSequence) {
    }

    public void setText(@p0 CharSequence charSequence) {
        this.f113346a.setText(charSequence);
    }

    @Override // androidx.appcompat.widget.Toolbar
    public void setTitle(CharSequence charSequence) {
    }

    public static class ScrollingViewBehavior extends AppBarLayout.ScrollingViewBehavior {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f113362h;

        public ScrollingViewBehavior() {
            this.f113362h = false;
        }

        private void j0(AppBarLayout appBarLayout) {
            appBarLayout.setBackgroundColor(0);
            appBarLayout.setTargetElevation(0.0f);
        }

        @Override // com.google.android.material.appbar.e
        protected boolean e0() {
            return true;
        }

        @Override // com.google.android.material.appbar.AppBarLayout.ScrollingViewBehavior, androidx.coordinatorlayout.widget.CoordinatorLayout.c
        public boolean p(@NonNull CoordinatorLayout coordinatorLayout, @NonNull View view, @NonNull View view2) {
            boolean zP = super.p(coordinatorLayout, view, view2);
            if (!this.f113362h && (view2 instanceof AppBarLayout)) {
                this.f113362h = true;
                j0((AppBarLayout) view2);
            }
            return zP;
        }

        public ScrollingViewBehavior(@NonNull Context context, @p0 AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f113362h = false;
        }
    }

    public SearchBar(@NonNull Context context, @p0 AttributeSet attributeSet) {
        this(context, attributeSet, r6.a.c.Qc);
    }

    public void setHint(@f1 int i10) {
        this.f113346a.setHint(i10);
    }

    public void setText(@f1 int i10) {
        this.f113346a.setText(i10);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public SearchBar(@NonNull Context context, @p0 AttributeSet attributeSet, int i10) {
        int i11 = f113343s;
        super(a7.a.c(context, attributeSet, i10, i11), attributeSet, i10);
        this.f113356k = -1;
        this.f113360o = new androidx.core.view.accessibility.c.e() { // from class: com.google.android.material.search.c
            @Override // androidx.core.view.accessibility.c.e
            public final void onTouchExplorationStateChanged(boolean z10) {
                this.f113405a.setFocusableInTouchMode(z10);
            }
        };
        Context context2 = getContext();
        h0(attributeSet);
        this.f113350e = j.a.b(context2, getDefaultNavigationIconResource());
        this.f113349d = new j();
        TypedArray typedArrayK = com.google.android.material.internal.g0.k(context2, attributeSet, r6.a.o.ss, i10, i11, new int[0]);
        com.google.android.material.shape.p pVarM = com.google.android.material.shape.p.e(context2, attributeSet, i10, i11).m();
        int color = typedArrayK.getColor(r6.a.o.ws, 0);
        float dimension = typedArrayK.getDimension(r6.a.o.zs, 0.0f);
        this.f113348c = typedArrayK.getBoolean(r6.a.o.xs, true);
        this.f113357l = typedArrayK.getBoolean(r6.a.o.ys, true);
        boolean z10 = typedArrayK.getBoolean(r6.a.o.Bs, false);
        this.f113352g = typedArrayK.getBoolean(r6.a.o.As, false);
        this.f113351f = typedArrayK.getBoolean(r6.a.o.Fs, true);
        if (typedArrayK.hasValue(r6.a.o.Cs)) {
            this.f113354i = Integer.valueOf(typedArrayK.getColor(r6.a.o.Cs, -1));
        }
        int resourceId = typedArrayK.getResourceId(r6.a.o.ts, -1);
        String string = typedArrayK.getString(r6.a.o.us);
        String string2 = typedArrayK.getString(r6.a.o.vs);
        float dimension2 = typedArrayK.getDimension(r6.a.o.Es, -1.0f);
        int color2 = typedArrayK.getColor(r6.a.o.Ds, 0);
        typedArrayK.recycle();
        if (!z10) {
            O();
        }
        setClickable(true);
        setFocusable(true);
        LayoutInflater.from(context2).inflate(r6.a.k.R0, this);
        this.f113347b = true;
        this.f113346a = (TextView) findViewById(r6.a.h.S3);
        u1.U1(this, dimension);
        P(resourceId, string, string2);
        N(pVarM, color, dimension, dimension2, color2);
        this.f113359n = (AccessibilityManager) getContext().getSystemService("accessibility");
        e0();
    }
}

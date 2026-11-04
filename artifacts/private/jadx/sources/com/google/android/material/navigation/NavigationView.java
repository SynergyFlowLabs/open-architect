package com.google.android.material.navigation;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.InsetDrawable;
import android.graphics.drawable.RippleDrawable;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.Pair;
import android.util.TypedValue;
import android.view.Menu;
import android.view.MenuInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.g1;
import androidx.annotation.j0;
import androidx.annotation.l1;
import androidx.annotation.p0;
import androidx.annotation.q;
import androidx.annotation.r;
import androidx.annotation.t0;
import androidx.appcompat.view.menu.j;
import androidx.appcompat.widget.j1;
import androidx.core.view.d0;
import androidx.core.view.g3;
import androidx.core.view.u1;
import androidx.customview.view.AbsSavedState;
import androidx.drawerlayout.widget.DrawerLayout;
import com.google.android.material.internal.g0;
import com.google.android.material.internal.r0;
import com.google.android.material.internal.u;
import com.google.android.material.internal.v;
import com.google.android.material.internal.z;
import com.google.android.material.motion.i;
import com.google.android.material.shape.k;
import com.google.android.material.shape.l;
import com.google.android.material.shape.p;
import java.util.Objects;

/* JADX INFO: loaded from: classes4.dex */
public class NavigationView extends z implements com.google.android.material.motion.b {

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    private static final int[] f113025g3 = {R.attr.state_checked};

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    private static final int[] f113026h3 = {-16842910};

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    private static final int f113027i3 = r6.a.n.Qe;

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    private static final int f113028j3 = 1;
    private final com.google.android.material.motion.c H1;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    @NonNull
    private final u f113029h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final v f113030i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    d f113031j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private final int f113032k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private final int[] f113033l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private MenuInflater f113034m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private ViewTreeObserver.OnGlobalLayoutListener f113035n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f113036o;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private final com.google.android.material.shape.u f113037p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private final i f113038p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private final DrawerLayout.e f113039p2;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f113040s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    @t0
    private int f113041t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final boolean f113042v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @t0
    private final int f113043w;

    class a extends DrawerLayout.g {
        a() {
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.g, androidx.drawerlayout.widget.DrawerLayout.e
        public void a(@NonNull View view) {
            NavigationView navigationView = NavigationView.this;
            if (view == navigationView) {
                final com.google.android.material.motion.c cVar = navigationView.H1;
                Objects.requireNonNull(cVar);
                view.post(new Runnable() { // from class: com.google.android.material.navigation.g
                    @Override // java.lang.Runnable
                    public final void run() {
                        cVar.e();
                    }
                });
            }
        }

        @Override // androidx.drawerlayout.widget.DrawerLayout.g, androidx.drawerlayout.widget.DrawerLayout.e
        public void b(@NonNull View view) {
            NavigationView navigationView = NavigationView.this;
            if (view == navigationView) {
                navigationView.H1.f();
                NavigationView.this.x();
            }
        }
    }

    class b implements androidx.appcompat.view.menu.g.a {
        b() {
        }

        @Override // androidx.appcompat.view.menu.g.a
        public boolean a(androidx.appcompat.view.menu.g gVar, MenuItem menuItem) {
            d dVar = NavigationView.this.f113031j;
            return dVar != null && dVar.a(menuItem);
        }

        @Override // androidx.appcompat.view.menu.g.a
        public void b(androidx.appcompat.view.menu.g gVar) {
        }
    }

    class c implements ViewTreeObserver.OnGlobalLayoutListener {
        c() {
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public void onGlobalLayout() {
            NavigationView navigationView = NavigationView.this;
            navigationView.getLocationOnScreen(navigationView.f113033l);
            boolean z10 = true;
            boolean z11 = NavigationView.this.f113033l[1] == 0;
            NavigationView.this.f113030i.G(z11);
            NavigationView navigationView2 = NavigationView.this;
            navigationView2.setDrawTopInsetForeground(z11 && navigationView2.w());
            NavigationView.this.setDrawLeftInsetForeground(NavigationView.this.f113033l[0] == 0 || NavigationView.this.f113033l[0] + NavigationView.this.getWidth() == 0);
            Activity activityA = com.google.android.material.internal.c.a(NavigationView.this.getContext());
            if (activityA != null) {
                Rect rectB = r0.b(activityA);
                boolean z12 = rectB.height() - NavigationView.this.getHeight() == NavigationView.this.f113033l[1];
                boolean z13 = Color.alpha(activityA.getWindow().getNavigationBarColor()) != 0;
                NavigationView navigationView3 = NavigationView.this;
                navigationView3.setDrawBottomInsetForeground(z12 && z13 && navigationView3.v());
                if (rectB.width() != NavigationView.this.f113033l[0] && rectB.width() - NavigationView.this.getWidth() != NavigationView.this.f113033l[0]) {
                    z10 = false;
                }
                NavigationView.this.setDrawRightInsetForeground(z10);
            }
        }
    }

    public interface d {
        boolean a(@NonNull MenuItem menuItem);
    }

    public NavigationView(@NonNull Context context) {
        this(context, null);
    }

    @z7.a
    private Pair<DrawerLayout, DrawerLayout.f> A() {
        ViewParent parent = getParent();
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if ((parent instanceof DrawerLayout) && (layoutParams instanceof DrawerLayout.f)) {
            return new Pair<>((DrawerLayout) parent, (DrawerLayout.f) layoutParams);
        }
        throw new IllegalStateException("NavigationView back progress requires the direct parent view to be a DrawerLayout.");
    }

    private void B() {
        this.f113035n = new c();
        getViewTreeObserver().addOnGlobalLayoutListener(this.f113035n);
    }

    private MenuInflater getMenuInflater() {
        if (this.f113034m == null) {
            this.f113034m = new androidx.appcompat.view.g(getContext());
        }
        return this.f113034m;
    }

    @p0
    private ColorStateList o(int i10) {
        TypedValue typedValue = new TypedValue();
        if (!getContext().getTheme().resolveAttribute(i10, typedValue, true)) {
            return null;
        }
        ColorStateList colorStateListA = j.a.a(getContext(), typedValue.resourceId);
        if (!getContext().getTheme().resolveAttribute(i.a.b.J0, typedValue, true)) {
            return null;
        }
        int i11 = typedValue.data;
        int defaultColor = colorStateListA.getDefaultColor();
        int[] iArr = f113026h3;
        return new ColorStateList(new int[][]{iArr, f113025g3, FrameLayout.EMPTY_STATE_SET}, new int[]{colorStateListA.getColorForState(iArr, defaultColor), i11, defaultColor});
    }

    @NonNull
    private Drawable p(@NonNull j1 j1Var) {
        return q(j1Var, com.google.android.material.resources.c.b(getContext(), j1Var, r6.a.o.Tq));
    }

    @NonNull
    private Drawable q(@NonNull j1 j1Var, @p0 ColorStateList colorStateList) {
        k kVar = new k(p.b(getContext(), j1Var.u(r6.a.o.Rq, 0), j1Var.u(r6.a.o.Sq, 0)).m());
        kVar.p0(colorStateList);
        return new InsetDrawable((Drawable) kVar, j1Var.g(r6.a.o.Wq, 0), j1Var.g(r6.a.o.Xq, 0), j1Var.g(r6.a.o.Vq, 0), j1Var.g(r6.a.o.Uq, 0));
    }

    private boolean s(@NonNull j1 j1Var) {
        return j1Var.C(r6.a.o.Rq) || j1Var.C(r6.a.o.Sq);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void x() {
        if (!this.f113042v || this.f113041t == 0) {
            return;
        }
        this.f113041t = 0;
        y(getWidth(), getHeight());
    }

    private void y(@t0 int i10, @t0 int i11) {
        if ((getParent() instanceof DrawerLayout) && (getLayoutParams() instanceof DrawerLayout.f)) {
            if ((this.f113041t > 0 || this.f113042v) && (getBackground() instanceof k)) {
                boolean z10 = d0.d(((DrawerLayout.f) getLayoutParams()).f50961a, u1.c0(this)) == 3;
                k kVar = (k) getBackground();
                p.b bVarO = kVar.getShapeAppearanceModel().v().o(this.f113041t);
                if (z10) {
                    bVarO.K(0.0f);
                    bVarO.x(0.0f);
                } else {
                    bVarO.P(0.0f);
                    bVarO.C(0.0f);
                }
                p pVarM = bVarO.m();
                kVar.setShapeAppearanceModel(pVarM);
                this.f113037p0.g(this, pVarM);
                this.f113037p0.f(this, new RectF(0.0f, 0.0f, i10, i11));
                this.f113037p0.i(this, true);
            }
        }
    }

    @Override // com.google.android.material.motion.b
    public void b(@NonNull androidx.activity.d dVar) {
        A();
        this.f113038p1.j(dVar);
    }

    @Override // com.google.android.material.motion.b
    public void c(@NonNull androidx.activity.d dVar) {
        this.f113038p1.l(dVar, ((DrawerLayout.f) A().second).f50961a);
        if (this.f113042v) {
            this.f113041t = com.google.android.material.animation.b.c(0, this.f113043w, this.f113038p1.a(dVar.a()));
            y(getWidth(), getHeight());
        }
    }

    @Override // com.google.android.material.motion.b
    public void d() {
        Pair<DrawerLayout, DrawerLayout.f> pairA = A();
        DrawerLayout drawerLayout = (DrawerLayout) pairA.first;
        androidx.activity.d dVarC = this.f113038p1.c();
        if (dVarC == null || Build.VERSION.SDK_INT < 34) {
            drawerLayout.f(this);
            return;
        }
        this.f113038p1.h(dVarC, ((DrawerLayout.f) pairA.second).f50961a, com.google.android.material.navigation.b.b(drawerLayout, this), com.google.android.material.navigation.b.c(drawerLayout));
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(@NonNull Canvas canvas) {
        this.f113037p0.e(canvas, new s6.a.InterfaceC2504a() { // from class: com.google.android.material.navigation.f
            @Override // s6.a.InterfaceC2504a
            public final void a(Canvas canvas2) {
                super/*android.view.View*/.dispatchDraw(canvas2);
            }
        });
    }

    @Override // com.google.android.material.motion.b
    public void f() {
        A();
        this.f113038p1.f();
        x();
    }

    @l1
    i getBackHelper() {
        return this.f113038p1;
    }

    @p0
    public MenuItem getCheckedItem() {
        return this.f113030i.o();
    }

    @t0
    public int getDividerInsetEnd() {
        return this.f113030i.p();
    }

    @t0
    public int getDividerInsetStart() {
        return this.f113030i.q();
    }

    public int getHeaderCount() {
        return this.f113030i.r();
    }

    @p0
    public Drawable getItemBackground() {
        return this.f113030i.t();
    }

    @r
    public int getItemHorizontalPadding() {
        return this.f113030i.u();
    }

    @r
    public int getItemIconPadding() {
        return this.f113030i.v();
    }

    @p0
    public ColorStateList getItemIconTintList() {
        return this.f113030i.y();
    }

    public int getItemMaxLines() {
        return this.f113030i.w();
    }

    @p0
    public ColorStateList getItemTextColor() {
        return this.f113030i.x();
    }

    @t0
    public int getItemVerticalPadding() {
        return this.f113030i.z();
    }

    @NonNull
    public Menu getMenu() {
        return this.f113029h;
    }

    @t0
    public int getSubheaderInsetEnd() {
        return this.f113030i.A();
    }

    @t0
    public int getSubheaderInsetStart() {
        return this.f113030i.B();
    }

    @Override // com.google.android.material.internal.z
    @b1({b1.a.LIBRARY_GROUP})
    protected void h(@NonNull g3 g3Var) {
        this.f113030i.k(g3Var);
    }

    public void n(@NonNull View view) {
        this.f113030i.d(view);
    }

    @Override // com.google.android.material.internal.z, android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        l.e(this);
        ViewParent parent = getParent();
        if ((parent instanceof DrawerLayout) && this.H1.b()) {
            DrawerLayout drawerLayout = (DrawerLayout) parent;
            drawerLayout.O(this.f113039p2);
            drawerLayout.a(this.f113039p2);
            if (drawerLayout.D(this)) {
                this.H1.e();
            }
        }
    }

    @Override // com.google.android.material.internal.z, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        getViewTreeObserver().removeOnGlobalLayoutListener(this.f113035n);
        ViewParent parent = getParent();
        if (parent instanceof DrawerLayout) {
            ((DrawerLayout) parent).O(this.f113039p2);
        }
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        int mode = View.MeasureSpec.getMode(i10);
        if (mode == Integer.MIN_VALUE) {
            i10 = View.MeasureSpec.makeMeasureSpec(Math.min(View.MeasureSpec.getSize(i10), this.f113032k), 1073741824);
        } else if (mode == 0) {
            i10 = View.MeasureSpec.makeMeasureSpec(this.f113032k, 1073741824);
        }
        super.onMeasure(i10, i11);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        this.f113029h.V(savedState.f113044c);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        Bundle bundle = new Bundle();
        savedState.f113044c = bundle;
        this.f113029h.X(bundle);
        return savedState;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        y(i10, i11);
    }

    public View r(int i10) {
        return this.f113030i.s(i10);
    }

    public void setBottomInsetScrimEnabled(boolean z10) {
        this.f113040s = z10;
    }

    public void setCheckedItem(@androidx.annotation.d0 int i10) {
        MenuItem menuItemFindItem = this.f113029h.findItem(i10);
        if (menuItemFindItem != null) {
            this.f113030i.H((j) menuItemFindItem);
        }
    }

    public void setDividerInsetEnd(@t0 int i10) {
        this.f113030i.I(i10);
    }

    public void setDividerInsetStart(@t0 int i10) {
        this.f113030i.J(i10);
    }

    @Override // android.view.View
    public void setElevation(float f10) {
        super.setElevation(f10);
        l.d(this, f10);
    }

    @l1
    @b1({b1.a.LIBRARY_GROUP})
    public void setForceCompatClippingEnabled(boolean z10) {
        this.f113037p0.h(this, z10);
    }

    public void setItemBackground(@p0 Drawable drawable) {
        this.f113030i.L(drawable);
    }

    public void setItemBackgroundResource(@androidx.annotation.v int i10) {
        setItemBackground(androidx.core.content.d.l(getContext(), i10));
    }

    public void setItemHorizontalPadding(@r int i10) {
        this.f113030i.N(i10);
    }

    public void setItemHorizontalPaddingResource(@q int i10) {
        this.f113030i.N(getResources().getDimensionPixelSize(i10));
    }

    public void setItemIconPadding(@r int i10) {
        this.f113030i.O(i10);
    }

    public void setItemIconPaddingResource(int i10) {
        this.f113030i.O(getResources().getDimensionPixelSize(i10));
    }

    public void setItemIconSize(@r int i10) {
        this.f113030i.P(i10);
    }

    public void setItemIconTintList(@p0 ColorStateList colorStateList) {
        this.f113030i.Q(colorStateList);
    }

    public void setItemMaxLines(int i10) {
        this.f113030i.R(i10);
    }

    public void setItemTextAppearance(@g1 int i10) {
        this.f113030i.S(i10);
    }

    public void setItemTextAppearanceActiveBoldEnabled(boolean z10) {
        this.f113030i.T(z10);
    }

    public void setItemTextColor(@p0 ColorStateList colorStateList) {
        this.f113030i.U(colorStateList);
    }

    public void setItemVerticalPadding(@t0 int i10) {
        this.f113030i.V(i10);
    }

    public void setItemVerticalPaddingResource(@q int i10) {
        this.f113030i.V(getResources().getDimensionPixelSize(i10));
    }

    public void setNavigationItemSelectedListener(@p0 d dVar) {
        this.f113031j = dVar;
    }

    @Override // android.view.View
    public void setOverScrollMode(int i10) {
        super.setOverScrollMode(i10);
        v vVar = this.f113030i;
        if (vVar != null) {
            vVar.W(i10);
        }
    }

    public void setSubheaderInsetEnd(@t0 int i10) {
        this.f113030i.Y(i10);
    }

    public void setSubheaderInsetStart(@t0 int i10) {
        this.f113030i.Z(i10);
    }

    public void setTopInsetScrimEnabled(boolean z10) {
        this.f113036o = z10;
    }

    public View t(@j0 int i10) {
        return this.f113030i.D(i10);
    }

    public void u(int i10) {
        this.f113030i.b0(true);
        getMenuInflater().inflate(i10, this.f113029h);
        this.f113030i.b0(false);
        this.f113030i.f(false);
    }

    public boolean v() {
        return this.f113040s;
    }

    public boolean w() {
        return this.f113036o;
    }

    public void z(@NonNull View view) {
        this.f113030i.F(view);
    }

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @p0
        public Bundle f113044c;

        class a implements Parcelable.ClassLoaderCreator<SavedState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            @p0
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(@NonNull Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            @NonNull
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(@NonNull Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            @NonNull
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public SavedState(@NonNull Parcel parcel, @p0 ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f113044c = parcel.readBundle(classLoader);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeBundle(this.f113044c);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public NavigationView(@NonNull Context context, @p0 AttributeSet attributeSet) {
        this(context, attributeSet, r6.a.c.f359522re);
    }

    /* JADX WARN: Illegal instructions before constructor call */
    public NavigationView(@NonNull Context context, @p0 AttributeSet attributeSet, int i10) {
        ColorStateList colorStateListO;
        int i11;
        int i12;
        int i13 = f113027i3;
        super(a7.a.c(context, attributeSet, i10, i13), attributeSet, i10);
        v vVar = new v();
        this.f113030i = vVar;
        this.f113033l = new int[2];
        this.f113036o = true;
        this.f113040s = true;
        this.f113041t = 0;
        this.f113037p0 = com.google.android.material.shape.u.a(this);
        this.f113038p1 = new i(this);
        this.H1 = new com.google.android.material.motion.c(this);
        this.f113039p2 = new a();
        Context context2 = getContext();
        u uVar = new u(context2);
        this.f113029h = uVar;
        j1 j1VarL = g0.l(context2, attributeSet, r6.a.o.zq, i10, i13, new int[0]);
        if (j1VarL.C(r6.a.o.Bq)) {
            u1.O1(this, j1VarL.h(r6.a.o.Bq));
        }
        int iG = j1VarL.g(r6.a.o.Hq, 0);
        this.f113041t = iG;
        this.f113042v = iG == 0;
        this.f113043w = getResources().getDimensionPixelSize(r6.a.f.E7);
        Drawable background = getBackground();
        ColorStateList colorStateListG = com.google.android.material.drawable.a.g(background);
        if (background == null || colorStateListG != null) {
            k kVar = new k(p.e(context2, attributeSet, i10, i13).m());
            if (colorStateListG != null) {
                kVar.p0(colorStateListG);
            }
            kVar.a0(context2);
            u1.O1(this, kVar);
        }
        if (j1VarL.C(r6.a.o.Iq)) {
            setElevation(j1VarL.g(r6.a.o.Iq, 0));
        }
        setFitsSystemWindows(j1VarL.a(r6.a.o.Cq, false));
        this.f113032k = j1VarL.g(r6.a.o.Dq, 0);
        ColorStateList colorStateListD = j1VarL.C(r6.a.o.fr) ? j1VarL.d(r6.a.o.fr) : null;
        int iU = j1VarL.C(r6.a.o.ir) ? j1VarL.u(r6.a.o.ir, 0) : 0;
        if (iU == 0 && colorStateListD == null) {
            colorStateListD = o(R.attr.textColorSecondary);
        }
        if (j1VarL.C(r6.a.o.Oq)) {
            colorStateListO = j1VarL.d(r6.a.o.Oq);
        } else {
            colorStateListO = o(R.attr.textColorSecondary);
        }
        int iU2 = j1VarL.C(r6.a.o.Yq) ? j1VarL.u(r6.a.o.Yq, 0) : 0;
        boolean zA = j1VarL.a(r6.a.o.Zq, true);
        if (j1VarL.C(r6.a.o.Nq)) {
            setItemIconSize(j1VarL.g(r6.a.o.Nq, 0));
        }
        ColorStateList colorStateListD2 = j1VarL.C(r6.a.o.ar) ? j1VarL.d(r6.a.o.ar) : null;
        if (iU2 == 0 && colorStateListD2 == null) {
            colorStateListD2 = o(R.attr.textColorPrimary);
        }
        Drawable drawableH = j1VarL.h(r6.a.o.Kq);
        if (drawableH == null && s(j1VarL)) {
            drawableH = p(j1VarL);
            ColorStateList colorStateListB = com.google.android.material.resources.c.b(context2, j1VarL, r6.a.o.Qq);
            if (colorStateListB != null) {
                vVar.M(new RippleDrawable(com.google.android.material.ripple.b.e(colorStateListB), null, q(j1VarL, null)));
            }
        }
        if (j1VarL.C(r6.a.o.Lq)) {
            i11 = 0;
            setItemHorizontalPadding(j1VarL.g(r6.a.o.Lq, 0));
        } else {
            i11 = 0;
        }
        if (j1VarL.C(r6.a.o.br)) {
            setItemVerticalPadding(j1VarL.g(r6.a.o.br, i11));
        }
        setDividerInsetStart(j1VarL.g(r6.a.o.Gq, i11));
        setDividerInsetEnd(j1VarL.g(r6.a.o.Fq, i11));
        setSubheaderInsetStart(j1VarL.g(r6.a.o.hr, i11));
        setSubheaderInsetEnd(j1VarL.g(r6.a.o.gr, i11));
        setTopInsetScrimEnabled(j1VarL.a(r6.a.o.jr, this.f113036o));
        setBottomInsetScrimEnabled(j1VarL.a(r6.a.o.Eq, this.f113040s));
        int iG2 = j1VarL.g(r6.a.o.Mq, i11);
        setItemMaxLines(j1VarL.o(r6.a.o.Pq, 1));
        uVar.Y(new b());
        vVar.K(1);
        vVar.i(context2, uVar);
        if (iU != 0) {
            vVar.a0(iU);
        }
        vVar.X(colorStateListD);
        vVar.Q(colorStateListO);
        vVar.W(getOverScrollMode());
        if (iU2 != 0) {
            vVar.S(iU2);
        }
        vVar.T(zA);
        vVar.U(colorStateListD2);
        vVar.L(drawableH);
        vVar.O(iG2);
        uVar.b(vVar);
        addView((View) vVar.n(this));
        if (j1VarL.C(r6.a.o.cr)) {
            i12 = 0;
            u(j1VarL.u(r6.a.o.cr, 0));
        } else {
            i12 = 0;
        }
        if (j1VarL.C(r6.a.o.Jq)) {
            t(j1VarL.u(r6.a.o.Jq, i12));
        }
        j1VarL.I();
        B();
    }

    public void setCheckedItem(@NonNull MenuItem menuItem) {
        MenuItem menuItemFindItem = this.f113029h.findItem(menuItem.getItemId());
        if (menuItemFindItem == null) {
            throw new IllegalArgumentException("Called setCheckedItem(MenuItem) with an item that is not in the current menu.");
        }
        this.f113030i.H((j) menuItemFindItem);
    }
}

package androidx.appcompat.widget;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.content.Context;
import android.content.res.Configuration;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Menu;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewPropertyAnimator;
import android.view.Window;
import android.view.WindowInsets;
import android.widget.OverScroller;
import androidx.annotation.NonNull;
import androidx.core.view.g3;

/* JADX INFO: loaded from: classes.dex */
@e.a({"UnknownNullness"})
@androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
public class ActionBarOverlayLayout extends ViewGroup implements k0, androidx.core.view.z0, androidx.core.view.x0, androidx.core.view.y0 {

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    private static final String f10802p3 = "ActionBarOverlayLayout";

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    private static final int f10803q3 = 600;

    /* JADX INFO: renamed from: r3, reason: collision with root package name */
    static final int[] f10804r3 = {i.a.b.f285897d, R.attr.windowContentOverlay};

    /* JADX INFO: renamed from: s3, reason: collision with root package name */
    private static final g3 f10805s3 = new g3.b().h(androidx.core.graphics.j.d(0, 1, 0, 1)).a();

    /* JADX INFO: renamed from: t3, reason: collision with root package name */
    private static final Rect f10806t3 = new Rect();

    @NonNull
    private g3 H1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f10807a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f10808b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private ContentFrameLayout f10809c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    ActionBarContainer f10810d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private l0 f10811e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Drawable f10812f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f10813g;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    @NonNull
    private g3 f10814g3;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f10815h;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    private d f10816h3;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f10817i;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    private OverScroller f10818i3;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    boolean f10819j;

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    ViewPropertyAnimator f10820j3;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f10821k;

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    final AnimatorListenerAdapter f10822k3;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f10823l;

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    private final Runnable f10824l3;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private final Rect f10825m;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    private final Runnable f10826m3;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final Rect f10827n;

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    private final androidx.core.view.a1 f10828n3;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Rect f10829o;

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    private final f f10830o3;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private final Rect f10831p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    @NonNull
    private g3 f10832p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    @NonNull
    private g3 f10833p2;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private final Rect f10834s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private final Rect f10835t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final Rect f10836v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final Rect f10837w;

    class a extends AnimatorListenerAdapter {
        a() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationCancel(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f10820j3 = null;
            actionBarOverlayLayout.f10819j = false;
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f10820j3 = null;
            actionBarOverlayLayout.f10819j = false;
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.z();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f10820j3 = actionBarOverlayLayout.f10810d.animate().translationY(0.0f).setListener(ActionBarOverlayLayout.this.f10822k3);
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ActionBarOverlayLayout.this.z();
            ActionBarOverlayLayout actionBarOverlayLayout = ActionBarOverlayLayout.this;
            actionBarOverlayLayout.f10820j3 = actionBarOverlayLayout.f10810d.animate().translationY(-ActionBarOverlayLayout.this.f10810d.getHeight()).setListener(ActionBarOverlayLayout.this.f10822k3);
        }
    }

    public interface d {
        void a();

        void b();

        void c();

        void d();

        void e(boolean z10);

        void onWindowVisibilityChanged(int i10);
    }

    public static class e extends ViewGroup.MarginLayoutParams {
        public e(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
        }

        public e(int i10, int i11) {
            super(i10, i11);
        }

        public e(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
        }

        public e(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
        }
    }

    private static final class f extends View {
        f(Context context) {
            super(context);
            setWillNotDraw(true);
        }

        @Override // android.view.View
        public int getWindowSystemUiVisibility() {
            return 0;
        }
    }

    public ActionBarOverlayLayout(@NonNull Context context) {
        this(context, null);
    }

    private void A(Context context) {
        TypedArray typedArrayObtainStyledAttributes = getContext().getTheme().obtainStyledAttributes(f10804r3);
        this.f10807a = typedArrayObtainStyledAttributes.getDimensionPixelSize(0, 0);
        Drawable drawable = typedArrayObtainStyledAttributes.getDrawable(1);
        this.f10812f = drawable;
        setWillNotDraw(drawable == null);
        typedArrayObtainStyledAttributes.recycle();
        this.f10818i3 = new OverScroller(context);
    }

    private void D() {
        z();
        postDelayed(this.f10826m3, 600L);
    }

    private void E() {
        z();
        postDelayed(this.f10824l3, 600L);
    }

    private void G() {
        z();
        this.f10824l3.run();
    }

    private boolean H(float f10) {
        boolean z10 = true | false;
        this.f10818i3.fling(0, 0, 0, (int) f10, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE);
        return this.f10818i3.getFinalY() > this.f10810d.getHeight();
    }

    private void b() {
        z();
        this.f10826m3.run();
    }

    /* JADX WARN: Code duplicated, block: B:7:0x0017  */
    private boolean u(@NonNull View view, @NonNull Rect rect, boolean z10, boolean z11, boolean z12, boolean z13) {
        boolean z14;
        e eVar = (e) view.getLayoutParams();
        if (z10) {
            int i10 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin;
            int i11 = rect.left;
            if (i10 != i11) {
                ((ViewGroup.MarginLayoutParams) eVar).leftMargin = i11;
                z14 = true;
            } else {
                z14 = false;
            }
        } else {
            z14 = false;
        }
        if (z11) {
            int i12 = ((ViewGroup.MarginLayoutParams) eVar).topMargin;
            int i13 = rect.top;
            if (i12 != i13) {
                ((ViewGroup.MarginLayoutParams) eVar).topMargin = i13;
                z14 = true;
            }
        }
        if (z13) {
            int i14 = ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
            int i15 = rect.right;
            if (i14 != i15) {
                ((ViewGroup.MarginLayoutParams) eVar).rightMargin = i15;
                z14 = true;
            }
        }
        if (z12) {
            int i16 = ((ViewGroup.MarginLayoutParams) eVar).bottomMargin;
            int i17 = rect.bottom;
            if (i16 != i17) {
                ((ViewGroup.MarginLayoutParams) eVar).bottomMargin = i17;
                return true;
            }
        }
        return z14;
    }

    private boolean v() {
        androidx.core.view.u1.o(this.f10830o3, f10805s3, this.f10834s);
        return !this.f10834s.equals(f10806t3);
    }

    /* JADX WARN: Multi-variable type inference failed */
    private l0 y(View view) {
        if (view instanceof l0) {
            return (l0) view;
        }
        if (view instanceof Toolbar) {
            return ((Toolbar) view).getWrapper();
        }
        throw new IllegalStateException("Can't make a decor toolbar out of " + view.getClass().getSimpleName());
    }

    public boolean B() {
        return this.f10817i;
    }

    public boolean C() {
        return this.f10813g;
    }

    void F() {
        if (this.f10809c == null) {
            this.f10809c = (ContentFrameLayout) findViewById(i.a.g.f286182b);
            this.f10810d = (ActionBarContainer) findViewById(i.a.g.f286184c);
            this.f10811e = y(findViewById(i.a.g.f286180a));
        }
    }

    @Override // androidx.appcompat.widget.k0
    public boolean a() {
        F();
        return this.f10811e.a();
    }

    @Override // androidx.appcompat.widget.k0
    public boolean c() {
        F();
        return this.f10811e.c();
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof e;
    }

    @Override // androidx.appcompat.widget.k0
    public boolean d() {
        F();
        return this.f10811e.d();
    }

    @Override // android.view.View
    public void draw(@NonNull Canvas canvas) {
        super.draw(canvas);
        if (this.f10812f != null) {
            int bottom = this.f10810d.getVisibility() == 0 ? (int) (this.f10810d.getBottom() + this.f10810d.getTranslationY() + 0.5f) : 0;
            this.f10812f.setBounds(0, bottom, getWidth(), this.f10812f.getIntrinsicHeight() + bottom);
            this.f10812f.draw(canvas);
        }
    }

    @Override // androidx.appcompat.widget.k0
    public boolean e() {
        F();
        return this.f10811e.e();
    }

    @Override // androidx.appcompat.widget.k0
    public boolean f() {
        F();
        return this.f10811e.f();
    }

    @Override // android.view.View
    protected boolean fitSystemWindows(Rect rect) {
        return super.fitSystemWindows(rect);
    }

    @Override // androidx.appcompat.widget.k0
    public void g(Menu menu, androidx.appcompat.view.menu.n.a aVar) {
        F();
        this.f10811e.g(menu, aVar);
    }

    public int getActionBarHideOffset() {
        ActionBarContainer actionBarContainer = this.f10810d;
        if (actionBarContainer != null) {
            return -((int) actionBarContainer.getTranslationY());
        }
        return 0;
    }

    @Override // android.view.ViewGroup, androidx.core.view.z0
    public int getNestedScrollAxes() {
        return this.f10828n3.a();
    }

    @Override // androidx.appcompat.widget.k0
    public CharSequence getTitle() {
        F();
        return this.f10811e.getTitle();
    }

    @Override // androidx.appcompat.widget.k0
    public void h() {
        F();
        this.f10811e.h();
    }

    @Override // androidx.appcompat.widget.k0
    public boolean i() {
        F();
        return this.f10811e.i();
    }

    @Override // androidx.appcompat.widget.k0
    public boolean j() {
        F();
        return this.f10811e.j();
    }

    @Override // androidx.appcompat.widget.k0
    public void k(SparseArray<Parcelable> sparseArray) {
        F();
        this.f10811e.z(sparseArray);
    }

    @Override // androidx.core.view.x0
    public void l(View view, View view2, int i10, int i11) {
        if (i11 == 0) {
            onNestedScrollAccepted(view, view2, i10);
        }
    }

    @Override // androidx.core.view.x0
    public void m(View view, int i10) {
        if (i10 == 0) {
            onStopNestedScroll(view);
        }
    }

    @Override // androidx.appcompat.widget.k0
    public void n(SparseArray<Parcelable> sparseArray) {
        F();
        this.f10811e.R(sparseArray);
    }

    @Override // androidx.core.view.x0
    public void o(View view, int i10, int i11, int i12, int i13, int i14) {
        if (i14 == 0) {
            onNestedScroll(view, i10, i11, i12, i13);
        }
    }

    @Override // android.view.View
    @androidx.annotation.w0(21)
    public WindowInsets onApplyWindowInsets(@NonNull WindowInsets windowInsets) {
        F();
        g3 g3VarL = g3.L(windowInsets, this);
        boolean zU = u(this.f10810d, new Rect(g3VarL.p(), g3VarL.r(), g3VarL.q(), g3VarL.o()), true, true, false, true);
        androidx.core.view.u1.o(this, g3VarL, this.f10825m);
        Rect rect = this.f10825m;
        g3 g3VarX = g3VarL.x(rect.left, rect.top, rect.right, rect.bottom);
        this.f10832p1 = g3VarX;
        boolean z10 = true;
        if (!this.H1.equals(g3VarX)) {
            this.H1 = this.f10832p1;
            zU = true;
        }
        if (this.f10827n.equals(this.f10825m)) {
            z10 = zU;
        } else {
            this.f10827n.set(this.f10825m);
        }
        if (z10) {
            requestLayout();
        }
        return g3VarL.a().c().b().J();
    }

    @Override // android.view.View
    protected void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        A(getContext());
        androidx.core.view.u1.A1(this);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        z();
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int childCount = getChildCount();
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        for (int i14 = 0; i14 < childCount; i14++) {
            View childAt = getChildAt(i14);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                int i15 = ((ViewGroup.MarginLayoutParams) eVar).leftMargin + paddingLeft;
                int i16 = ((ViewGroup.MarginLayoutParams) eVar).topMargin + paddingTop;
                childAt.layout(i15, i16, measuredWidth + i15, measuredHeight + i16);
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        int measuredHeight;
        F();
        measureChildWithMargins(this.f10810d, i10, 0, i11, 0);
        e eVar = (e) this.f10810d.getLayoutParams();
        int iMax = Math.max(0, this.f10810d.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin);
        int iMax2 = Math.max(0, this.f10810d.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar).topMargin + ((ViewGroup.MarginLayoutParams) eVar).bottomMargin);
        int iCombineMeasuredStates = View.combineMeasuredStates(0, this.f10810d.getMeasuredState());
        boolean z10 = (androidx.core.view.u1.F0(this) & 256) != 0;
        if (z10) {
            measuredHeight = this.f10807a;
            if (this.f10815h && this.f10810d.getTabContainer() != null) {
                measuredHeight += this.f10807a;
            }
        } else {
            measuredHeight = this.f10810d.getVisibility() != 8 ? this.f10810d.getMeasuredHeight() : 0;
        }
        this.f10829o.set(this.f10825m);
        this.f10833p2 = this.f10832p1;
        if (this.f10813g || z10 || !v()) {
            this.f10833p2 = new g3.b(this.f10833p2).h(androidx.core.graphics.j.d(this.f10833p2.p(), this.f10833p2.r() + measuredHeight, this.f10833p2.q(), this.f10833p2.o())).a();
        } else {
            Rect rect = this.f10829o;
            rect.top += measuredHeight;
            rect.bottom = rect.bottom;
            this.f10833p2 = this.f10833p2.x(0, measuredHeight, 0, 0);
        }
        u(this.f10809c, this.f10829o, true, true, true, true);
        if (!this.f10814g3.equals(this.f10833p2)) {
            g3 g3Var = this.f10833p2;
            this.f10814g3 = g3Var;
            androidx.core.view.u1.p(this.f10809c, g3Var);
        }
        measureChildWithMargins(this.f10809c, i10, 0, i11, 0);
        e eVar2 = (e) this.f10809c.getLayoutParams();
        int iMax3 = Math.max(iMax, this.f10809c.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) eVar2).leftMargin + ((ViewGroup.MarginLayoutParams) eVar2).rightMargin);
        int iMax4 = Math.max(iMax2, this.f10809c.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) eVar2).topMargin + ((ViewGroup.MarginLayoutParams) eVar2).bottomMargin);
        int iCombineMeasuredStates2 = View.combineMeasuredStates(iCombineMeasuredStates, this.f10809c.getMeasuredState());
        setMeasuredDimension(View.resolveSizeAndState(Math.max(iMax3 + getPaddingLeft() + getPaddingRight(), getSuggestedMinimumWidth()), i10, iCombineMeasuredStates2), View.resolveSizeAndState(Math.max(iMax4 + getPaddingTop() + getPaddingBottom(), getSuggestedMinimumHeight()), i11, iCombineMeasuredStates2 << 16));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.z0
    public boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        if (!this.f10817i || !z10) {
            return false;
        }
        if (H(f11)) {
            b();
        } else {
            G();
        }
        this.f10819j = true;
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.z0
    public boolean onNestedPreFling(View view, float f10, float f11) {
        return false;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.z0
    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.z0
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        int i14 = this.f10821k + i11;
        this.f10821k = i14;
        setActionBarHideOffset(i14);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.z0
    public void onNestedScrollAccepted(View view, View view2, int i10) {
        this.f10828n3.b(view, view2, i10);
        this.f10821k = getActionBarHideOffset();
        z();
        d dVar = this.f10816h3;
        if (dVar != null) {
            dVar.d();
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.z0
    public boolean onStartNestedScroll(View view, View view2, int i10) {
        if ((i10 & 2) == 0 || this.f10810d.getVisibility() != 0) {
            return false;
        }
        return this.f10817i;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.z0
    public void onStopNestedScroll(View view) {
        if (this.f10817i && !this.f10819j) {
            if (this.f10821k <= this.f10810d.getHeight()) {
                E();
            } else {
                D();
            }
        }
        d dVar = this.f10816h3;
        if (dVar != null) {
            dVar.b();
        }
    }

    @Override // android.view.View
    @Deprecated
    public void onWindowSystemUiVisibilityChanged(int i10) {
        super.onWindowSystemUiVisibilityChanged(i10);
        F();
        int i11 = this.f10823l ^ i10;
        this.f10823l = i10;
        boolean z10 = (i10 & 4) == 0;
        boolean z11 = (i10 & 256) != 0;
        d dVar = this.f10816h3;
        if (dVar != null) {
            dVar.e(!z11);
            if (z10 || !z11) {
                this.f10816h3.a();
            } else {
                this.f10816h3.c();
            }
        }
        if ((i11 & 256) == 0 || this.f10816h3 == null) {
            return;
        }
        androidx.core.view.u1.A1(this);
    }

    @Override // android.view.View
    protected void onWindowVisibilityChanged(int i10) {
        super.onWindowVisibilityChanged(i10);
        this.f10808b = i10;
        d dVar = this.f10816h3;
        if (dVar != null) {
            dVar.onWindowVisibilityChanged(i10);
        }
    }

    @Override // androidx.appcompat.widget.k0
    public void p(int i10) {
        F();
        if (i10 == 2) {
            this.f10811e.s();
        } else if (i10 == 5) {
            this.f10811e.D();
        } else {
            if (i10 != 109) {
                return;
            }
            setOverlayMode(true);
        }
    }

    @Override // androidx.core.view.x0
    public void q(View view, int i10, int i11, int[] iArr, int i12) {
        if (i12 == 0) {
            onNestedPreScroll(view, i10, i11, iArr);
        }
    }

    @Override // androidx.appcompat.widget.k0
    public void r() {
        F();
        this.f10811e.v();
    }

    @Override // androidx.core.view.y0
    public void s(View view, int i10, int i11, int i12, int i13, int i14, int[] iArr) {
        o(view, i10, i11, i12, i13, i14);
    }

    public void setActionBarHideOffset(int i10) {
        z();
        this.f10810d.setTranslationY(-Math.max(0, Math.min(i10, this.f10810d.getHeight())));
    }

    public void setActionBarVisibilityCallback(d dVar) {
        this.f10816h3 = dVar;
        if (getWindowToken() != null) {
            this.f10816h3.onWindowVisibilityChanged(this.f10808b);
            int i10 = this.f10823l;
            if (i10 != 0) {
                onWindowSystemUiVisibilityChanged(i10);
                androidx.core.view.u1.A1(this);
            }
        }
    }

    public void setHasNonEmbeddedTabs(boolean z10) {
        this.f10815h = z10;
    }

    public void setHideOnContentScrollEnabled(boolean z10) {
        if (z10 != this.f10817i) {
            this.f10817i = z10;
            if (z10) {
                return;
            }
            z();
            setActionBarHideOffset(0);
        }
    }

    @Override // androidx.appcompat.widget.k0
    public void setIcon(int i10) {
        F();
        this.f10811e.setIcon(i10);
    }

    @Override // androidx.appcompat.widget.k0
    public void setLogo(int i10) {
        F();
        this.f10811e.setLogo(i10);
    }

    public void setOverlayMode(boolean z10) {
        this.f10813g = z10;
    }

    public void setShowingForActionMode(boolean z10) {
    }

    @Override // androidx.appcompat.widget.k0
    public void setUiOptions(int i10) {
    }

    @Override // androidx.appcompat.widget.k0
    public void setWindowCallback(Window.Callback callback) {
        F();
        this.f10811e.setWindowCallback(callback);
    }

    @Override // androidx.appcompat.widget.k0
    public void setWindowTitle(CharSequence charSequence) {
        F();
        this.f10811e.setWindowTitle(charSequence);
    }

    @Override // android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return false;
    }

    @Override // androidx.core.view.x0
    public boolean t(View view, View view2, int i10, int i11) {
        return i11 == 0 && onStartNestedScroll(view, view2, i10);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: w, reason: merged with bridge method [inline-methods] */
    public e generateDefaultLayoutParams() {
        return new e(-1, -1);
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: x, reason: merged with bridge method [inline-methods] */
    public e generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }

    void z() {
        removeCallbacks(this.f10824l3);
        removeCallbacks(this.f10826m3);
        ViewPropertyAnimator viewPropertyAnimator = this.f10820j3;
        if (viewPropertyAnimator != null) {
            viewPropertyAnimator.cancel();
        }
    }

    public ActionBarOverlayLayout(@NonNull Context context, @androidx.annotation.p0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f10808b = 0;
        this.f10825m = new Rect();
        this.f10827n = new Rect();
        this.f10829o = new Rect();
        this.f10834s = new Rect();
        this.f10835t = new Rect();
        this.f10836v = new Rect();
        this.f10837w = new Rect();
        this.f10831p0 = new Rect();
        g3 g3Var = g3.f48754c;
        this.f10832p1 = g3Var;
        this.H1 = g3Var;
        this.f10833p2 = g3Var;
        this.f10814g3 = g3Var;
        this.f10822k3 = new a();
        this.f10824l3 = new b();
        this.f10826m3 = new c();
        A(context);
        this.f10828n3 = new androidx.core.view.a1(this);
        f fVar = new f(context);
        this.f10830o3 = fVar;
        addView(fVar);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new e(layoutParams);
    }

    @Override // androidx.appcompat.widget.k0
    public void setIcon(Drawable drawable) {
        F();
        this.f10811e.setIcon(drawable);
    }
}

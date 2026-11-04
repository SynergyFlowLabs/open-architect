package com.google.android.material.sidesheet;

import android.R;
import android.animation.Animator;
import android.animation.AnimatorListenerAdapter;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.os.Build;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.annotation.NonNull;
import androidx.annotation.a0;
import androidx.annotation.b1;
import androidx.annotation.d0;
import androidx.annotation.l1;
import androidx.annotation.p0;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.u1;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.shape.p;
import java.lang.ref.WeakReference;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Set;

/* JADX INFO: loaded from: classes4.dex */
public class SideSheetBehavior<V extends View> extends CoordinatorLayout.c<V> implements com.google.android.material.sidesheet.c<m> {

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    static final int f113693g3 = 500;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    private static final float f113694h3 = 0.5f;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    private static final float f113695i3 = 0.1f;

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    private static final int f113696j3 = -1;
    private final androidx.customview.widget.d.c H1;

    @d0
    private int X;

    @p0
    private VelocityTracker Y;

    @p0
    private com.google.android.material.motion.i Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private e f113699a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private float f113700b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @p0
    private com.google.android.material.shape.k f113701c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @p0
    private ColorStateList f113702d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private p f113703e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final SideSheetBehavior<V>.c f113704f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f113705g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f113706h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f113707i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f113708j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @p0
    private androidx.customview.widget.d f113709k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f113710l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f113711m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f113712n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f113713o;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private int f113714p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    @NonNull
    private final Set<m> f113715p1;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f113716s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f113717t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    @p0
    private WeakReference<V> f113718v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    @p0
    private WeakReference<View> f113719w;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private static final int f113698p2 = r6.a.m.f360966g2;

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    private static final int f113697k3 = r6.a.n.Ih;

    protected static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f113720c;

        class a implements Parcelable.ClassLoaderCreator<SavedState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            @p0
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(@NonNull Parcel parcel) {
                return new SavedState(parcel, (ClassLoader) null);
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

        public SavedState(@NonNull Parcel parcel) {
            this(parcel, (ClassLoader) null);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(@NonNull Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f113720c);
        }

        public SavedState(@NonNull Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f113720c = parcel.readInt();
        }

        public SavedState(Parcelable parcelable, @NonNull SideSheetBehavior<?> sideSheetBehavior) {
            super(parcelable);
            this.f113720c = ((SideSheetBehavior) sideSheetBehavior).f113707i;
        }
    }

    class a extends androidx.customview.widget.d.c {
        a() {
        }

        @Override // androidx.customview.widget.d.c
        public int a(@NonNull View view, int i10, int i11) {
            return n1.a.e(i10, SideSheetBehavior.this.f113699a.g(), SideSheetBehavior.this.f113699a.f());
        }

        @Override // androidx.customview.widget.d.c
        public int b(@NonNull View view, int i10, int i11) {
            return view.getTop();
        }

        @Override // androidx.customview.widget.d.c
        public int d(@NonNull View view) {
            return SideSheetBehavior.this.f113712n + SideSheetBehavior.this.t0();
        }

        @Override // androidx.customview.widget.d.c
        public void j(int i10) {
            if (i10 == 1 && SideSheetBehavior.this.f113706h) {
                SideSheetBehavior.this.V0(1);
            }
        }

        @Override // androidx.customview.widget.d.c
        public void k(@NonNull View view, int i10, int i11, int i12, int i13) {
            ViewGroup.MarginLayoutParams marginLayoutParams;
            View viewO0 = SideSheetBehavior.this.o0();
            if (viewO0 != null && (marginLayoutParams = (ViewGroup.MarginLayoutParams) viewO0.getLayoutParams()) != null) {
                SideSheetBehavior.this.f113699a.p(marginLayoutParams, view.getLeft(), view.getRight());
                viewO0.setLayoutParams(marginLayoutParams);
            }
            SideSheetBehavior.this.g0(view, i10);
        }

        @Override // androidx.customview.widget.d.c
        public void l(@NonNull View view, float f10, float f11) {
            int iC0 = SideSheetBehavior.this.c0(view, f10, f11);
            SideSheetBehavior sideSheetBehavior = SideSheetBehavior.this;
            sideSheetBehavior.a1(view, iC0, sideSheetBehavior.Z0());
        }

        @Override // androidx.customview.widget.d.c
        public boolean m(@NonNull View view, int i10) {
            if (SideSheetBehavior.this.f113707i == 1) {
                return false;
            }
            return SideSheetBehavior.this.f113718v != null && SideSheetBehavior.this.f113718v.get() == view;
        }
    }

    class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            SideSheetBehavior.this.V0(5);
            if (SideSheetBehavior.this.f113718v != null && SideSheetBehavior.this.f113718v.get() != null) {
                ((View) SideSheetBehavior.this.f113718v.get()).requestLayout();
            }
        }
    }

    class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f113723a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f113724b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Runnable f113725c = new Runnable() { // from class: com.google.android.material.sidesheet.l
            @Override // java.lang.Runnable
            public final void run() {
                SideSheetBehavior.c.a(this.f113755a);
            }
        };

        c() {
        }

        public static /* synthetic */ void a(c cVar) {
            cVar.f113724b = false;
            if (SideSheetBehavior.this.f113709k != null && SideSheetBehavior.this.f113709k.o(true)) {
                cVar.b(cVar.f113723a);
            } else if (SideSheetBehavior.this.f113707i == 2) {
                SideSheetBehavior.this.V0(cVar.f113723a);
            }
        }

        void b(int i10) {
            if (SideSheetBehavior.this.f113718v != null && SideSheetBehavior.this.f113718v.get() != null) {
                this.f113723a = i10;
                if (this.f113724b) {
                    return;
                }
                u1.u1((View) SideSheetBehavior.this.f113718v.get(), this.f113725c);
                this.f113724b = true;
            }
        }
    }

    public SideSheetBehavior() {
        this.f113704f = new c();
        this.f113706h = true;
        this.f113707i = 5;
        this.f113708j = 5;
        this.f113711m = 0.1f;
        this.X = -1;
        this.f113715p1 = new LinkedHashSet();
        this.H1 = new a();
    }

    @p0
    private CoordinatorLayout.g A0() {
        V v10;
        WeakReference<V> weakReference = this.f113718v;
        if (weakReference == null || (v10 = weakReference.get()) == null || !(v10.getLayoutParams() instanceof CoordinatorLayout.g)) {
            return null;
        }
        return (CoordinatorLayout.g) v10.getLayoutParams();
    }

    private boolean C0() {
        CoordinatorLayout.g gVarA0 = A0();
        return gVarA0 != null && ((ViewGroup.MarginLayoutParams) gVarA0).leftMargin > 0;
    }

    private boolean D0() {
        CoordinatorLayout.g gVarA0 = A0();
        return gVarA0 != null && ((ViewGroup.MarginLayoutParams) gVarA0).rightMargin > 0;
    }

    private boolean G0(@NonNull MotionEvent motionEvent) {
        if (W0() && b0(this.f113714p0, motionEvent.getX()) > this.f113709k.E()) {
            return true;
        }
        return false;
    }

    private boolean H0(float f10) {
        return this.f113699a.k(f10);
    }

    private boolean I0(@NonNull V v10) {
        ViewParent parent = v10.getParent();
        return parent != null && parent.isLayoutRequested() && u1.R0(v10);
    }

    private boolean J0(View view, int i10, boolean z10) {
        int iV0 = v0(i10);
        androidx.customview.widget.d dVarZ0 = z0();
        if (dVarZ0 == null) {
            return false;
        }
        if (z10) {
            if (!dVarZ0.V(iV0, view.getTop())) {
                return false;
            }
        } else if (!dVarZ0.X(view, iV0, view.getTop())) {
            return false;
        }
        return true;
    }

    private void K0(@NonNull CoordinatorLayout coordinatorLayout) {
        int i10;
        View viewFindViewById;
        if (this.f113719w != null || (i10 = this.X) == -1 || (viewFindViewById = coordinatorLayout.findViewById(i10)) == null) {
            return;
        }
        this.f113719w = new WeakReference<>(viewFindViewById);
    }

    private void M0(V v10, androidx.core.view.accessibility.j.a aVar, int i10) {
        u1.z1(v10, aVar, null, e0(i10));
    }

    public static /* synthetic */ boolean N(SideSheetBehavior sideSheetBehavior, int i10, View view, androidx.core.view.accessibility.m.a aVar) {
        sideSheetBehavior.g(i10);
        return true;
    }

    private void N0() {
        VelocityTracker velocityTracker = this.Y;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.Y = null;
        }
    }

    public static /* synthetic */ void O(SideSheetBehavior sideSheetBehavior, int i10) {
        V v10 = sideSheetBehavior.f113718v.get();
        if (v10 != null) {
            sideSheetBehavior.a1(v10, i10, false);
        }
    }

    private void O0(@NonNull V v10, Runnable runnable) {
        if (I0(v10)) {
            v10.post(runnable);
        } else {
            runnable.run();
        }
    }

    public static /* synthetic */ void P(SideSheetBehavior sideSheetBehavior, ViewGroup.MarginLayoutParams marginLayoutParams, int i10, View view, ValueAnimator valueAnimator) {
        sideSheetBehavior.f113699a.o(marginLayoutParams, com.google.android.material.animation.b.c(i10, 0, valueAnimator.getAnimatedFraction()));
        view.requestLayout();
    }

    private void T0(int i10) {
        e eVar = this.f113699a;
        if (eVar == null || eVar.j() != i10) {
            if (i10 == 0) {
                this.f113699a = new com.google.android.material.sidesheet.b(this);
                if (this.f113703e == null || D0()) {
                    return;
                }
                p.b bVarV = this.f113703e.v();
                bVarV.P(0.0f).C(0.0f);
                d1(bVarV.m());
                return;
            }
            if (i10 == 1) {
                this.f113699a = new com.google.android.material.sidesheet.a(this);
                if (this.f113703e == null || C0()) {
                    return;
                }
                p.b bVarV2 = this.f113703e.v();
                bVarV2.K(0.0f).x(0.0f);
                d1(bVarV2.m());
                return;
            }
            throw new IllegalArgumentException("Invalid sheet edge position value: " + i10 + ". Must be 0 or 1.");
        }
    }

    private void U0(@NonNull V v10, int i10) {
        T0(androidx.core.view.d0.d(((CoordinatorLayout.g) v10.getLayoutParams()).f46850c, i10) == 3 ? 1 : 0);
    }

    private boolean W0() {
        return this.f113709k != null && (this.f113706h || this.f113707i == 1);
    }

    private boolean Y0(@NonNull V v10) {
        return (v10.isShown() || u1.J(v10) != null) && this.f113706h;
    }

    private int a0(int i10, V v10) {
        int i11 = this.f113707i;
        if (i11 == 1 || i11 == 2) {
            return i10 - this.f113699a.h(v10);
        }
        if (i11 == 3) {
            return 0;
        }
        if (i11 == 5) {
            return this.f113699a.e();
        }
        throw new IllegalStateException("Unexpected value: " + this.f113707i);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a1(View view, int i10, boolean z10) {
        if (!J0(view, i10, z10)) {
            V0(i10);
        } else {
            V0(2);
            this.f113704f.b(i10);
        }
    }

    private float b0(float f10, float f11) {
        return Math.abs(f10 - f11);
    }

    private void b1() {
        V v10;
        WeakReference<V> weakReference = this.f113718v;
        if (weakReference == null || (v10 = weakReference.get()) == null) {
            return;
        }
        u1.w1(v10, 262144);
        u1.w1(v10, 1048576);
        if (this.f113707i != 5) {
            M0(v10, androidx.core.view.accessibility.j.a.f48563z, 5);
        }
        if (this.f113707i != 3) {
            M0(v10, androidx.core.view.accessibility.j.a.f48561x, 3);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public int c0(@NonNull View view, float f10, float f11) {
        if (H0(f10)) {
            return 3;
        }
        if (X0(view, f10)) {
            return (this.f113699a.m(f10, f11) || this.f113699a.l(view)) ? 5 : 3;
        }
        if (f10 != 0.0f && h.a(f10, f11)) {
            return 5;
        }
        int left = view.getLeft();
        return Math.abs(left - p0()) < Math.abs(left - this.f113699a.e()) ? 3 : 5;
    }

    private void c1() {
        ViewGroup.MarginLayoutParams marginLayoutParams;
        WeakReference<V> weakReference = this.f113718v;
        if (weakReference == null || weakReference.get() == null) {
            return;
        }
        V v10 = this.f113718v.get();
        View viewO0 = o0();
        if (viewO0 == null || (marginLayoutParams = (ViewGroup.MarginLayoutParams) viewO0.getLayoutParams()) == null) {
            return;
        }
        this.f113699a.o(marginLayoutParams, (int) ((this.f113712n * v10.getScaleX()) + this.f113717t));
        viewO0.requestLayout();
    }

    private void d0() {
        WeakReference<View> weakReference = this.f113719w;
        if (weakReference != null) {
            weakReference.clear();
        }
        this.f113719w = null;
    }

    private void d1(@NonNull p pVar) {
        com.google.android.material.shape.k kVar = this.f113701c;
        if (kVar != null) {
            kVar.setShapeAppearanceModel(pVar);
        }
    }

    private androidx.core.view.accessibility.m e0(final int i10) {
        return new androidx.core.view.accessibility.m() { // from class: com.google.android.material.sidesheet.j
            @Override // androidx.core.view.accessibility.m
            public final boolean a(View view, androidx.core.view.accessibility.m.a aVar) {
                return SideSheetBehavior.N(this.f113749a, i10, view, aVar);
            }
        };
    }

    private void e1(@NonNull View view) {
        int i10 = this.f113707i == 5 ? 4 : 0;
        if (view.getVisibility() != i10) {
            view.setVisibility(i10);
        }
    }

    private void f0(@NonNull Context context) {
        if (this.f113703e == null) {
            return;
        }
        com.google.android.material.shape.k kVar = new com.google.android.material.shape.k(this.f113703e);
        this.f113701c = kVar;
        kVar.a0(context);
        ColorStateList colorStateList = this.f113702d;
        if (colorStateList != null) {
            this.f113701c.p0(colorStateList);
            return;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
        this.f113701c.setTint(typedValue.data);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void g0(@NonNull View view, int i10) {
        if (this.f113715p1.isEmpty()) {
            return;
        }
        float fB = this.f113699a.b(i10);
        Iterator<m> it = this.f113715p1.iterator();
        while (it.hasNext()) {
            it.next().b(view, fB);
        }
    }

    private void h0(View view) {
        if (u1.J(view) == null) {
            u1.J1(view, view.getResources().getString(f113698p2));
        }
    }

    @NonNull
    public static <V extends View> SideSheetBehavior<V> j0(@NonNull V v10) {
        ViewGroup.LayoutParams layoutParams = v10.getLayoutParams();
        if (!(layoutParams instanceof CoordinatorLayout.g)) {
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        CoordinatorLayout.c cVarF = ((CoordinatorLayout.g) layoutParams).f();
        if (cVarF instanceof SideSheetBehavior) {
            return (SideSheetBehavior) cVarF;
        }
        throw new IllegalArgumentException("The view is not associated with SideSheetBehavior");
    }

    private int l0(int i10, int i11, int i12, int i13) {
        int childMeasureSpec = ViewGroup.getChildMeasureSpec(i10, i11, i13);
        if (i12 == -1) {
            return childMeasureSpec;
        }
        int mode = View.MeasureSpec.getMode(childMeasureSpec);
        int size = View.MeasureSpec.getSize(childMeasureSpec);
        if (mode == 1073741824) {
            return View.MeasureSpec.makeMeasureSpec(Math.min(size, i12), 1073741824);
        }
        if (size != 0) {
            i12 = Math.min(size, i12);
        }
        return View.MeasureSpec.makeMeasureSpec(i12, Integer.MIN_VALUE);
    }

    @p0
    private ValueAnimator.AnimatorUpdateListener n0() {
        final ViewGroup.MarginLayoutParams marginLayoutParams;
        final View viewO0 = o0();
        if (viewO0 == null || (marginLayoutParams = (ViewGroup.MarginLayoutParams) viewO0.getLayoutParams()) == null) {
            return null;
        }
        final int iC = this.f113699a.c(marginLayoutParams);
        return new ValueAnimator.AnimatorUpdateListener() { // from class: com.google.android.material.sidesheet.k
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                SideSheetBehavior.P(this.f113751a, marginLayoutParams, iC, viewO0, valueAnimator);
            }
        };
    }

    @a0
    private int q0() {
        e eVar = this.f113699a;
        if (eVar != null && eVar.j() != 0) {
            return 3;
        }
        return 5;
    }

    float B0() {
        VelocityTracker velocityTracker = this.Y;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000, this.f113700b);
        return this.Y.getXVelocity();
    }

    public void E0() {
        g(5);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void F(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v10, @NonNull Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        if (savedState.a() != null) {
            super.F(coordinatorLayout, v10, savedState.a());
        }
        int i10 = savedState.f113720c;
        if (i10 == 1 || i10 == 2) {
            i10 = 5;
        }
        this.f113707i = i10;
        this.f113708j = i10;
    }

    public boolean F0() {
        return this.f113706h;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    @NonNull
    public Parcelable G(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v10) {
        return new SavedState(super.G(coordinatorLayout, v10), (SideSheetBehavior<?>) this);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean L(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v10, @NonNull MotionEvent motionEvent) {
        if (!v10.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f113707i == 1 && actionMasked == 0) {
            return true;
        }
        if (W0()) {
            this.f113709k.M(motionEvent);
        }
        if (actionMasked == 0) {
            N0();
        }
        if (this.Y == null) {
            this.Y = VelocityTracker.obtain();
        }
        this.Y.addMovement(motionEvent);
        if (W0() && actionMasked == 2 && !this.f113710l && G0(motionEvent)) {
            this.f113709k.d(v10, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.f113710l;
    }

    @Override // com.google.android.material.sidesheet.c
    /* JADX INFO: renamed from: L0, reason: merged with bridge method [inline-methods] */
    public void e(@NonNull m mVar) {
        this.f113715p1.remove(mVar);
    }

    public void P0(@p0 View view) {
        this.X = -1;
        if (view == null) {
            d0();
            return;
        }
        this.f113719w = new WeakReference<>(view);
        WeakReference<V> weakReference = this.f113718v;
        if (weakReference != null) {
            V v10 = weakReference.get();
            if (u1.Y0(v10)) {
                v10.requestLayout();
            }
        }
    }

    public void Q0(@d0 int i10) {
        this.X = i10;
        d0();
        WeakReference<V> weakReference = this.f113718v;
        if (weakReference != null) {
            V v10 = weakReference.get();
            if (i10 != -1 && u1.Y0(v10)) {
                v10.requestLayout();
            }
        }
    }

    public void R0(boolean z10) {
        this.f113706h = z10;
    }

    public void S0(float f10) {
        this.f113711m = f10;
    }

    void V0(int i10) {
        V v10;
        if (this.f113707i == i10) {
            return;
        }
        this.f113707i = i10;
        if (i10 == 3 || i10 == 5) {
            this.f113708j = i10;
        }
        WeakReference<V> weakReference = this.f113718v;
        if (weakReference == null || (v10 = weakReference.get()) == null) {
            return;
        }
        e1(v10);
        Iterator<m> it = this.f113715p1.iterator();
        while (it.hasNext()) {
            it.next().a(v10, i10);
        }
        b1();
    }

    boolean X0(@NonNull View view, float f10) {
        return this.f113699a.n(view, f10);
    }

    @Override // com.google.android.material.sidesheet.c
    /* JADX INFO: renamed from: Z, reason: merged with bridge method [inline-methods] */
    public void a(@NonNull m mVar) {
        this.f113715p1.add(mVar);
    }

    @b1({b1.a.LIBRARY_GROUP})
    public boolean Z0() {
        return true;
    }

    @Override // com.google.android.material.motion.b
    public void b(@NonNull androidx.activity.d dVar) {
        com.google.android.material.motion.i iVar = this.Z;
        if (iVar == null) {
            return;
        }
        iVar.j(dVar);
    }

    @Override // com.google.android.material.motion.b
    public void c(@NonNull androidx.activity.d dVar) {
        com.google.android.material.motion.i iVar = this.Z;
        if (iVar == null) {
            return;
        }
        iVar.l(dVar, q0());
        c1();
    }

    @Override // com.google.android.material.motion.b
    public void d() {
        com.google.android.material.motion.i iVar = this.Z;
        if (iVar == null) {
            return;
        }
        androidx.activity.d dVarC = iVar.c();
        if (dVarC == null || Build.VERSION.SDK_INT < 34) {
            g(5);
        } else {
            this.Z.h(dVarC, q0(), new b(), n0());
        }
    }

    @Override // com.google.android.material.motion.b
    public void f() {
        com.google.android.material.motion.i iVar = this.Z;
        if (iVar == null) {
            return;
        }
        iVar.f();
    }

    @Override // com.google.android.material.sidesheet.c
    public void g(final int i10) {
        if (i10 == 1 || i10 == 2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("STATE_");
            sb2.append(i10 == 1 ? "DRAGGING" : "SETTLING");
            sb2.append(" should not be set externally.");
            throw new IllegalArgumentException(sb2.toString());
        }
        WeakReference<V> weakReference = this.f113718v;
        if (weakReference == null || weakReference.get() == null) {
            V0(i10);
        } else {
            O0(this.f113718v.get(), new Runnable() { // from class: com.google.android.material.sidesheet.i
                @Override // java.lang.Runnable
                public final void run() {
                    SideSheetBehavior.O(this.f113747a, i10);
                }
            });
        }
    }

    @Override // com.google.android.material.sidesheet.c
    public int getState() {
        return this.f113707i;
    }

    public void i0() {
        g(3);
    }

    @l1
    @p0
    com.google.android.material.motion.i k0() {
        return this.Z;
    }

    int m0() {
        return this.f113712n;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void o(@NonNull CoordinatorLayout.g gVar) {
        super.o(gVar);
        this.f113718v = null;
        this.f113709k = null;
        this.Z = null;
    }

    @p0
    public View o0() {
        WeakReference<View> weakReference = this.f113719w;
        if (weakReference != null) {
            return weakReference.get();
        }
        return null;
    }

    public int p0() {
        return this.f113699a.d();
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void r() {
        super.r();
        this.f113718v = null;
        this.f113709k = null;
        this.Z = null;
    }

    public float r0() {
        return this.f113711m;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean s(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v10, @NonNull MotionEvent motionEvent) {
        androidx.customview.widget.d dVar;
        if (!Y0(v10)) {
            this.f113710l = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            N0();
        }
        if (this.Y == null) {
            this.Y = VelocityTracker.obtain();
        }
        this.Y.addMovement(motionEvent);
        if (actionMasked == 0) {
            this.f113714p0 = (int) motionEvent.getX();
        } else if ((actionMasked == 1 || actionMasked == 3) && this.f113710l) {
            this.f113710l = false;
            return false;
        }
        return (this.f113710l || (dVar = this.f113709k) == null || !dVar.W(motionEvent)) ? false : true;
    }

    float s0() {
        return 0.5f;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean t(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v10, int i10) {
        if (u1.W(coordinatorLayout) && !u1.W(v10)) {
            v10.setFitsSystemWindows(true);
        }
        if (this.f113718v == null) {
            this.f113718v = new WeakReference<>(v10);
            this.Z = new com.google.android.material.motion.i(v10);
            com.google.android.material.shape.k kVar = this.f113701c;
            if (kVar != null) {
                u1.O1(v10, kVar);
                com.google.android.material.shape.k kVar2 = this.f113701c;
                float fT = this.f113705g;
                if (fT == -1.0f) {
                    fT = u1.T(v10);
                }
                kVar2.o0(fT);
            } else {
                ColorStateList colorStateList = this.f113702d;
                if (colorStateList != null) {
                    u1.P1(v10, colorStateList);
                }
            }
            e1(v10);
            b1();
            if (u1.X(v10) == 0) {
                u1.Y1(v10, 1);
            }
            h0(v10);
        }
        U0(v10, i10);
        if (this.f113709k == null) {
            this.f113709k = androidx.customview.widget.d.q(coordinatorLayout, this.H1);
        }
        int iH = this.f113699a.h(v10);
        coordinatorLayout.N(v10, i10);
        this.f113713o = coordinatorLayout.getWidth();
        this.f113716s = this.f113699a.i(coordinatorLayout);
        this.f113712n = v10.getWidth();
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v10.getLayoutParams();
        this.f113717t = marginLayoutParams != null ? this.f113699a.a(marginLayoutParams) : 0;
        u1.h1(v10, a0(iH, v10));
        K0(coordinatorLayout);
        for (m mVar : this.f113715p1) {
            if (mVar instanceof m) {
                mVar.c(v10);
            }
        }
        return true;
    }

    int t0() {
        return this.f113717t;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean u(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v10, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v10.getLayoutParams();
        v10.measure(l0(i10, coordinatorLayout.getPaddingLeft() + coordinatorLayout.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, -1, marginLayoutParams.width), l0(i12, coordinatorLayout.getPaddingTop() + coordinatorLayout.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, -1, marginLayoutParams.height));
        return true;
    }

    @b1({b1.a.LIBRARY_GROUP})
    public int u0() {
        return this.f113708j;
    }

    int v0(int i10) {
        if (i10 == 3) {
            return p0();
        }
        if (i10 == 5) {
            return this.f113699a.e();
        }
        throw new IllegalArgumentException("Invalid state to get outer edge offset: " + i10);
    }

    int w0() {
        return this.f113716s;
    }

    int x0() {
        return this.f113713o;
    }

    int y0() {
        return 500;
    }

    @p0
    androidx.customview.widget.d z0() {
        return this.f113709k;
    }

    public SideSheetBehavior(@NonNull Context context, @p0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f113704f = new c();
        this.f113706h = true;
        this.f113707i = 5;
        this.f113708j = 5;
        this.f113711m = 0.1f;
        this.X = -1;
        this.f113715p1 = new LinkedHashSet();
        this.H1 = new a();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r6.a.o.It);
        if (typedArrayObtainStyledAttributes.hasValue(r6.a.o.Mt)) {
            this.f113702d = com.google.android.material.resources.c.a(context, typedArrayObtainStyledAttributes, r6.a.o.Mt);
        }
        if (typedArrayObtainStyledAttributes.hasValue(r6.a.o.Pt)) {
            this.f113703e = p.e(context, attributeSet, 0, f113697k3).m();
        }
        if (typedArrayObtainStyledAttributes.hasValue(r6.a.o.Ot)) {
            Q0(typedArrayObtainStyledAttributes.getResourceId(r6.a.o.Ot, -1));
        }
        f0(context);
        this.f113705g = typedArrayObtainStyledAttributes.getDimension(r6.a.o.Lt, -1.0f);
        R0(typedArrayObtainStyledAttributes.getBoolean(r6.a.o.Nt, true));
        typedArrayObtainStyledAttributes.recycle();
        this.f113700b = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}

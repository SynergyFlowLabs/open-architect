package com.google.android.material.bottomsheet;

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
import android.util.SparseIntArray;
import android.util.TypedValue;
import android.view.MotionEvent;
import android.view.RoundedCorner;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.WindowInsets;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.f1;
import androidx.annotation.l1;
import androidx.annotation.p0;
import androidx.annotation.t0;
import androidx.annotation.w0;
import androidx.annotation.x;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.accessibility.m;
import androidx.core.view.g3;
import androidx.core.view.u1;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.shape.p;
import d0.i1;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes4.dex */
public class BottomSheetBehavior<V extends View> extends CoordinatorLayout.c<V> implements com.google.android.material.motion.b {
    public static final int O3 = 1;
    public static final int P3 = 2;
    public static final int Q3 = 3;
    public static final int R3 = 4;
    public static final int S3 = 5;
    public static final int T3 = 6;
    public static final int U3 = -1;
    public static final int V3 = 1;
    public static final int W3 = 2;
    public static final int X3 = 4;
    public static final int Y3 = 8;
    public static final int Z3 = -1;

    /* JADX INFO: renamed from: a4, reason: collision with root package name */
    public static final int f111489a4 = 0;

    /* JADX INFO: renamed from: b4, reason: collision with root package name */
    private static final String f111490b4 = "BottomSheetBehavior";

    /* JADX INFO: renamed from: c4, reason: collision with root package name */
    @l1
    static final int f111491c4 = 500;

    /* JADX INFO: renamed from: d4, reason: collision with root package name */
    private static final float f111492d4 = 0.5f;

    /* JADX INFO: renamed from: e4, reason: collision with root package name */
    private static final float f111493e4 = 0.1f;

    /* JADX INFO: renamed from: f4, reason: collision with root package name */
    private static final int f111494f4 = 500;

    /* JADX INFO: renamed from: g4, reason: collision with root package name */
    private static final int f111495g4 = -1;

    /* JADX INFO: renamed from: h4, reason: collision with root package name */
    private static final int f111496h4 = 0;

    /* JADX INFO: renamed from: i4, reason: collision with root package name */
    private static final int f111497i4 = -1;

    /* JADX INFO: renamed from: j4, reason: collision with root package name */
    @l1
    static final int f111498j4 = 1;

    /* JADX INFO: renamed from: k4, reason: collision with root package name */
    private static final int f111499k4 = r6.a.n.Ne;
    int A3;
    int B3;

    @p0
    WeakReference<V> C3;

    @p0
    WeakReference<View> D3;

    @p0
    WeakReference<View> E3;

    @NonNull
    private final ArrayList<g> F3;

    @p0
    private VelocityTracker G3;
    private boolean H1;

    @p0
    com.google.android.material.motion.f H3;
    int I3;
    private int J3;
    boolean K3;

    @p0
    private Map<View, Integer> L3;

    @l1
    final SparseIntArray M3;
    private final androidx.customview.widget.d.c N3;
    private boolean X;
    private boolean Y;
    private boolean Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f111500a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f111501b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f111502c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f111503d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f111504e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f111505f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f111506g;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    private boolean f111507g3;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f111508h;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    private final BottomSheetBehavior<V>.k f111509h3;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f111510i;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    @p0
    private ValueAnimator f111511i3;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private com.google.android.material.shape.k f111512j;

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    int f111513j3;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @p0
    private ColorStateList f111514k;

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    int f111515k3;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f111516l;

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    int f111517l3;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f111518m;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    float f111519m3;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f111520n;

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    int f111521n3;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f111522o;

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    float f111523o3;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private int f111524p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private int f111525p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private p f111526p2;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    boolean f111527p3;

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    private boolean f111528q3;

    /* JADX INFO: renamed from: r3, reason: collision with root package name */
    private boolean f111529r3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f111530s;

    /* JADX INFO: renamed from: s3, reason: collision with root package name */
    int f111531s3;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f111532t;

    /* JADX INFO: renamed from: t3, reason: collision with root package name */
    int f111533t3;

    /* JADX INFO: renamed from: u3, reason: collision with root package name */
    @p0
    androidx.customview.widget.d f111534u3;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f111535v;

    /* JADX INFO: renamed from: v3, reason: collision with root package name */
    private boolean f111536v3;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f111537w;

    /* JADX INFO: renamed from: w3, reason: collision with root package name */
    private int f111538w3;

    /* JADX INFO: renamed from: x3, reason: collision with root package name */
    private boolean f111539x3;

    /* JADX INFO: renamed from: y3, reason: collision with root package name */
    private float f111540y3;

    /* JADX INFO: renamed from: z3, reason: collision with root package name */
    private int f111541z3;

    protected static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f111542c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f111543d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        boolean f111544e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f111545f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        boolean f111546g;

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
            parcel.writeInt(this.f111542c);
            parcel.writeInt(this.f111543d);
            parcel.writeInt(this.f111544e ? 1 : 0);
            parcel.writeInt(this.f111545f ? 1 : 0);
            parcel.writeInt(this.f111546g ? 1 : 0);
        }

        public SavedState(@NonNull Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f111542c = parcel.readInt();
            this.f111543d = parcel.readInt();
            this.f111544e = parcel.readInt() == 1;
            this.f111545f = parcel.readInt() == 1;
            this.f111546g = parcel.readInt() == 1;
        }

        public SavedState(Parcelable parcelable, @NonNull BottomSheetBehavior<?> bottomSheetBehavior) {
            super(parcelable);
            this.f111542c = bottomSheetBehavior.f111531s3;
            this.f111543d = ((BottomSheetBehavior) bottomSheetBehavior).f111505f;
            this.f111544e = ((BottomSheetBehavior) bottomSheetBehavior).f111501b;
            this.f111545f = bottomSheetBehavior.f111527p3;
            this.f111546g = ((BottomSheetBehavior) bottomSheetBehavior).f111528q3;
        }

        @Deprecated
        public SavedState(Parcelable parcelable, int i10) {
            super(parcelable);
            this.f111542c = i10;
        }
    }

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f111547a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f111548b;

        a(View view, int i10) {
            this.f111547a = view;
            this.f111548b = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            BottomSheetBehavior.this.D1(this.f111547a, this.f111548b, false);
        }
    }

    class b extends AnimatorListenerAdapter {
        b() {
        }

        @Override // android.animation.AnimatorListenerAdapter, android.animation.Animator.AnimatorListener
        public void onAnimationEnd(Animator animator) {
            BottomSheetBehavior.this.v1(5);
            WeakReference<V> weakReference = BottomSheetBehavior.this.C3;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            BottomSheetBehavior.this.C3.get().requestLayout();
        }
    }

    class c implements ValueAnimator.AnimatorUpdateListener {
        c() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (BottomSheetBehavior.this.f111512j != null) {
                BottomSheetBehavior.this.f111512j.q0(fFloatValue);
            }
        }
    }

    class d implements com.google.android.material.internal.p0.d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f111552a;

        d(boolean z10) {
            this.f111552a = z10;
        }

        /* JADX WARN: Code duplicated, block: B:23:0x0097  */
        /* JADX WARN: Code duplicated, block: B:34:0x00c1  */
        @Override // com.google.android.material.internal.p0.d
        public g3 a(View view, g3 g3Var, com.google.android.material.internal.p0.e eVar) {
            boolean z10;
            androidx.core.graphics.j jVarF = g3Var.f(g3.m.i());
            androidx.core.graphics.j jVarF2 = g3Var.f(g3.m.f());
            BottomSheetBehavior.this.f111525p1 = jVarF.f47824b;
            boolean zS = com.google.android.material.internal.p0.s(view);
            int paddingBottom = view.getPaddingBottom();
            int paddingLeft = view.getPaddingLeft();
            int paddingRight = view.getPaddingRight();
            if (BottomSheetBehavior.this.f111530s) {
                BottomSheetBehavior.this.f111524p0 = g3Var.o();
                paddingBottom = eVar.f112902d + BottomSheetBehavior.this.f111524p0;
            }
            if (BottomSheetBehavior.this.f111532t) {
                paddingLeft = (zS ? eVar.f112901c : eVar.f112899a) + jVarF.f47823a;
            }
            if (BottomSheetBehavior.this.f111535v) {
                paddingRight = (zS ? eVar.f112899a : eVar.f112901c) + jVarF.f47825c;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
            boolean z11 = true;
            if (BottomSheetBehavior.this.X) {
                int i10 = marginLayoutParams.leftMargin;
                int i11 = jVarF.f47823a;
                if (i10 != i11) {
                    marginLayoutParams.leftMargin = i11;
                    z10 = true;
                } else {
                    z10 = false;
                }
            } else {
                z10 = false;
            }
            if (BottomSheetBehavior.this.Y) {
                int i12 = marginLayoutParams.rightMargin;
                int i13 = jVarF.f47825c;
                if (i12 != i13) {
                    marginLayoutParams.rightMargin = i13;
                    z10 = true;
                }
            }
            if (BottomSheetBehavior.this.Z) {
                int i14 = marginLayoutParams.topMargin;
                int i15 = jVarF.f47824b;
                if (i14 != i15) {
                    marginLayoutParams.topMargin = i15;
                } else {
                    z11 = z10;
                }
            } else {
                z11 = z10;
            }
            if (z11) {
                view.setLayoutParams(marginLayoutParams);
            }
            view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
            if (this.f111552a) {
                BottomSheetBehavior.this.f111520n = jVarF2.f47826d;
            }
            if (!BottomSheetBehavior.this.f111530s && !this.f111552a) {
                return g3Var;
            }
            BottomSheetBehavior.this.I1(false);
            return g3Var;
        }
    }

    class e extends androidx.customview.widget.d.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f111554a;

        e() {
        }

        private boolean n(@NonNull View view) {
            int top = view.getTop();
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            return top > (bottomSheetBehavior.B3 + bottomSheetBehavior.A0()) / 2;
        }

        @Override // androidx.customview.widget.d.c
        public int a(@NonNull View view, int i10, int i11) {
            return view.getLeft();
        }

        @Override // androidx.customview.widget.d.c
        public int b(@NonNull View view, int i10, int i11) {
            return n1.a.e(i10, BottomSheetBehavior.this.A0(), e(view));
        }

        @Override // androidx.customview.widget.d.c
        public int e(@NonNull View view) {
            return BottomSheetBehavior.this.p0() ? BottomSheetBehavior.this.B3 : BottomSheetBehavior.this.f111521n3;
        }

        @Override // androidx.customview.widget.d.c
        public void j(int i10) {
            if (i10 == 1 && BottomSheetBehavior.this.f111529r3) {
                BottomSheetBehavior.this.v1(1);
            }
        }

        @Override // androidx.customview.widget.d.c
        public void k(@NonNull View view, int i10, int i11, int i12, int i13) {
            BottomSheetBehavior.this.v0(i11);
        }

        /* JADX WARN: Code duplicated, block: B:39:0x00c6  */
        /* JADX WARN: Code duplicated, block: B:6:0x0012  */
        @Override // androidx.customview.widget.d.c
        public void l(@NonNull View view, float f10, float f11) {
            int i10 = 6;
            if (f11 >= 0.0f) {
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.f111527p3 && bottomSheetBehavior.A1(view, f11)) {
                    if ((Math.abs(f10) < Math.abs(f11) && f11 > BottomSheetBehavior.this.f111504e) || n(view)) {
                        i10 = 5;
                    } else if (BottomSheetBehavior.this.f111501b || Math.abs(view.getTop() - BottomSheetBehavior.this.A0()) < Math.abs(view.getTop() - BottomSheetBehavior.this.f111517l3)) {
                        i10 = 3;
                    }
                } else if (f11 == 0.0f || Math.abs(f10) > Math.abs(f11)) {
                    int top = view.getTop();
                    if (!BottomSheetBehavior.this.f111501b) {
                        BottomSheetBehavior bottomSheetBehavior2 = BottomSheetBehavior.this;
                        int i11 = bottomSheetBehavior2.f111517l3;
                        if (top < i11) {
                            if (top < Math.abs(top - bottomSheetBehavior2.f111521n3)) {
                                i10 = 3;
                            } else if (BottomSheetBehavior.this.B1()) {
                                i10 = 4;
                            }
                        } else if (Math.abs(top - i11) >= Math.abs(top - BottomSheetBehavior.this.f111521n3) || BottomSheetBehavior.this.B1()) {
                            i10 = 4;
                        }
                    } else if (Math.abs(top - BottomSheetBehavior.this.f111515k3) < Math.abs(top - BottomSheetBehavior.this.f111521n3)) {
                        i10 = 3;
                    } else {
                        i10 = 4;
                    }
                } else if (BottomSheetBehavior.this.f111501b) {
                    i10 = 4;
                } else {
                    int top2 = view.getTop();
                    if (Math.abs(top2 - BottomSheetBehavior.this.f111517l3) >= Math.abs(top2 - BottomSheetBehavior.this.f111521n3) || BottomSheetBehavior.this.B1()) {
                        i10 = 4;
                    }
                }
            } else if (BottomSheetBehavior.this.f111501b) {
                i10 = 3;
            } else {
                int top3 = view.getTop();
                long jCurrentTimeMillis = System.currentTimeMillis() - this.f111554a;
                if (BottomSheetBehavior.this.B1()) {
                    BottomSheetBehavior bottomSheetBehavior3 = BottomSheetBehavior.this;
                    if (!bottomSheetBehavior3.y1(jCurrentTimeMillis, (top3 * 100.0f) / bottomSheetBehavior3.B3)) {
                        i10 = 4;
                    }
                } else if (top3 <= BottomSheetBehavior.this.f111517l3) {
                }
                i10 = 3;
            }
            BottomSheetBehavior bottomSheetBehavior4 = BottomSheetBehavior.this;
            bottomSheetBehavior4.D1(view, i10, bottomSheetBehavior4.C1());
        }

        @Override // androidx.customview.widget.d.c
        public boolean m(@NonNull View view, int i10) {
            BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
            int i11 = bottomSheetBehavior.f111531s3;
            if (i11 == 1 || bottomSheetBehavior.K3) {
                return false;
            }
            if (i11 == 3 && bottomSheetBehavior.I3 == i10) {
                WeakReference<View> weakReference = bottomSheetBehavior.E3;
                View view2 = weakReference != null ? weakReference.get() : null;
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            this.f111554a = System.currentTimeMillis();
            WeakReference<V> weakReference2 = BottomSheetBehavior.this.C3;
            return weakReference2 != null && weakReference2.get() == view;
        }
    }

    class f implements m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f111556a;

        f(int i10) {
            this.f111556a = i10;
        }

        @Override // androidx.core.view.accessibility.m
        public boolean a(@NonNull View view, @p0 m.a aVar) {
            BottomSheetBehavior.this.g(this.f111556a);
            return true;
        }
    }

    public static abstract class g {
        void onLayout(@NonNull View view) {
        }

        public abstract void onSlide(@NonNull View view, float f10);

        public abstract void onStateChanged(@NonNull View view, int i10);
    }

    @Retention(RetentionPolicy.SOURCE)
    @b1({b1.a.LIBRARY_GROUP})
    public @interface h {
    }

    @Retention(RetentionPolicy.SOURCE)
    @b1({b1.a.LIBRARY_GROUP})
    public @interface i {
    }

    @Retention(RetentionPolicy.SOURCE)
    @b1({b1.a.LIBRARY_GROUP})
    public @interface j {
    }

    public BottomSheetBehavior() {
        this.f111500a = 0;
        this.f111501b = true;
        this.f111502c = false;
        this.f111516l = -1;
        this.f111518m = -1;
        this.f111509h3 = new k(this, null);
        this.f111519m3 = 0.5f;
        this.f111523o3 = -1.0f;
        this.f111529r3 = true;
        this.f111531s3 = 4;
        this.f111533t3 = 4;
        this.f111540y3 = 0.1f;
        this.F3 = new ArrayList<>();
        this.J3 = -1;
        this.M3 = new SparseIntArray();
        this.N3 = new e();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void D1(View view, int i10, boolean z10) {
        int iM0 = M0(i10);
        androidx.customview.widget.d dVar = this.f111534u3;
        if (dVar == null || (!z10 ? dVar.X(view, view.getLeft(), iM0) : dVar.V(view.getLeft(), iM0))) {
            v1(i10);
            return;
        }
        v1(2);
        G1(i10, true);
        this.f111509h3.c(i10);
    }

    private void E1() {
        WeakReference<V> weakReference = this.C3;
        if (weakReference != null) {
            F1(weakReference.get(), 0);
        }
        WeakReference<View> weakReference2 = this.D3;
        if (weakReference2 != null) {
            int i10 = 3 | 1;
            F1(weakReference2.get(), 1);
        }
    }

    private void F1(View view, int i10) {
        if (view == null) {
            return;
        }
        q0(view, i10);
        if (!this.f111501b && this.f111531s3 != 6) {
            this.M3.put(i10, g0(view, r6.a.m.F, 6));
        }
        if (this.f111527p3 && U0() && this.f111531s3 != 5) {
            Z0(view, androidx.core.view.accessibility.j.a.f48563z, 5);
        }
        int i11 = this.f111531s3;
        if (i11 == 3) {
            Z0(view, androidx.core.view.accessibility.j.a.f48562y, this.f111501b ? 4 : 6);
            return;
        }
        if (i11 == 4) {
            Z0(view, androidx.core.view.accessibility.j.a.f48561x, this.f111501b ? 3 : 6);
        } else {
            if (i11 != 6) {
                return;
            }
            Z0(view, androidx.core.view.accessibility.j.a.f48562y, 4);
            Z0(view, androidx.core.view.accessibility.j.a.f48561x, 3);
        }
    }

    private void G1(int i10, boolean z10) {
        boolean zQ0;
        ValueAnimator valueAnimator;
        if (i10 == 2 || this.f111507g3 == (zQ0 = Q0()) || this.f111512j == null) {
            return;
        }
        this.f111507g3 = zQ0;
        if (!z10 || (valueAnimator = this.f111511i3) == null) {
            ValueAnimator valueAnimator2 = this.f111511i3;
            if (valueAnimator2 != null && valueAnimator2.isRunning()) {
                this.f111511i3.cancel();
            }
            this.f111512j.q0(this.f111507g3 ? l0() : 1.0f);
            return;
        }
        if (valueAnimator.isRunning()) {
            this.f111511i3.reverse();
        } else {
            this.f111511i3.setFloatValues(this.f111512j.A(), zQ0 ? l0() : 1.0f);
            this.f111511i3.start();
        }
    }

    private void H1(boolean z10) {
        Map<View, Integer> map;
        WeakReference<V> weakReference = this.C3;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = weakReference.get().getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z10) {
                if (this.L3 != null) {
                    return;
                } else {
                    this.L3 = new HashMap(childCount);
                }
            }
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = coordinatorLayout.getChildAt(i10);
                if (childAt != this.C3.get()) {
                    if (z10) {
                        this.L3.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        if (this.f111502c) {
                            u1.Y1(childAt, 4);
                        }
                    } else if (this.f111502c && (map = this.L3) != null && map.containsKey(childAt)) {
                        u1.Y1(childAt, this.L3.get(childAt).intValue());
                    }
                }
            }
            if (!z10) {
                this.L3 = null;
            } else if (this.f111502c) {
                this.C3.get().sendAccessibilityEvent(8);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void I1(boolean z10) {
        V v10;
        if (this.C3 != null) {
            i0();
            if (this.f111531s3 != 4 || (v10 = this.C3.get()) == null) {
                return;
            }
            if (z10) {
                g(4);
            } else {
                v10.requestLayout();
            }
        }
    }

    private int M0(int i10) {
        if (i10 == 3) {
            return A0();
        }
        if (i10 == 4) {
            return this.f111521n3;
        }
        if (i10 == 5) {
            return this.B3;
        }
        if (i10 == 6) {
            return this.f111517l3;
        }
        throw new IllegalArgumentException("Invalid state to get top offset: " + i10);
    }

    private float N0() {
        VelocityTracker velocityTracker = this.G3;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000, this.f111503d);
        return this.G3.getYVelocity(this.I3);
    }

    private boolean O0() {
        WeakReference<V> weakReference = this.C3;
        if (weakReference != null && weakReference.get() != null) {
            int[] iArr = new int[2];
            this.C3.get().getLocationOnScreen(iArr);
            if (iArr[1] == 0) {
                return true;
            }
        }
        return false;
    }

    private boolean Q0() {
        return this.f111531s3 == 3 && (this.H1 || O0());
    }

    private boolean V0(V v10) {
        ViewParent parent = v10.getParent();
        return parent != null && parent.isLayoutRequested() && u1.R0(v10);
    }

    private void Z0(View view, androidx.core.view.accessibility.j.a aVar, int i10) {
        u1.z1(view, aVar, null, r0(i10));
    }

    private void a1() {
        this.I3 = -1;
        this.J3 = -1;
        VelocityTracker velocityTracker = this.G3;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.G3 = null;
        }
    }

    private void b1(@NonNull SavedState savedState) {
        int i10 = this.f111500a;
        if (i10 == 0) {
            return;
        }
        if (i10 == -1 || (i10 & 1) == 1) {
            this.f111505f = savedState.f111543d;
        }
        if (i10 == -1 || (i10 & 2) == 2) {
            this.f111501b = savedState.f111544e;
        }
        if (i10 == -1 || (i10 & 4) == 4) {
            this.f111527p3 = savedState.f111545f;
        }
        if (i10 == -1 || (i10 & 8) == 8) {
            this.f111528q3 = savedState.f111546g;
        }
    }

    private void c1(V v10, Runnable runnable) {
        if (V0(v10)) {
            v10.post(runnable);
        } else {
            runnable.run();
        }
    }

    private int g0(View view, @f1 int i10, int i11) {
        return u1.c(view, view.getResources().getString(i10), r0(i11));
    }

    private void i0() {
        int iM0 = m0();
        if (this.f111501b) {
            this.f111521n3 = Math.max(this.B3 - iM0, this.f111515k3);
        } else {
            this.f111521n3 = this.B3 - iM0;
        }
    }

    @w0(31)
    private float j0(float f10, @p0 RoundedCorner roundedCorner) {
        if (roundedCorner != null) {
            float radius = roundedCorner.getRadius();
            if (radius > 0.0f && f10 > 0.0f) {
                return radius / f10;
            }
        }
        return 0.0f;
    }

    private void k0() {
        this.f111517l3 = (int) (this.B3 * (1.0f - this.f111519m3));
    }

    private float l0() {
        WeakReference<V> weakReference;
        WindowInsets rootWindowInsets;
        if (this.f111512j != null && (weakReference = this.C3) != null && weakReference.get() != null && Build.VERSION.SDK_INT >= 31) {
            V v10 = this.C3.get();
            if (O0() && (rootWindowInsets = v10.getRootWindowInsets()) != null) {
                return Math.max(j0(this.f111512j.T(), rootWindowInsets.getRoundedCorner(0)), j0(this.f111512j.U(), rootWindowInsets.getRoundedCorner(1)));
            }
        }
        return 0.0f;
    }

    private int m0() {
        int iMin;
        int i10;
        int i11;
        if (this.f111506g) {
            iMin = Math.min(Math.max(this.f111508h, this.B3 - ((this.A3 * 9) / 16)), this.f111541z3);
            i10 = this.f111524p0;
        } else {
            if (!this.f111522o && !this.f111530s && (i11 = this.f111520n) > 0) {
                return Math.max(this.f111505f, i11 + this.f111510i);
            }
            iMin = this.f111505f;
            i10 = this.f111524p0;
        }
        return iMin + i10;
    }

    private float o0(int i10) {
        float f10;
        float fA0;
        int i11 = this.f111521n3;
        if (i10 > i11 || i11 == A0()) {
            int i12 = this.f111521n3;
            f10 = i12 - i10;
            fA0 = this.B3 - i12;
        } else {
            int i13 = this.f111521n3;
            f10 = i13 - i10;
            fA0 = i13 - A0();
        }
        return f10 / fA0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public boolean p0() {
        return T0() && U0();
    }

    private void q0(View view, int i10) {
        if (view == null) {
            return;
        }
        u1.w1(view, 524288);
        u1.w1(view, 262144);
        u1.w1(view, 1048576);
        int i11 = this.M3.get(i10, -1);
        if (i11 != -1) {
            u1.w1(view, i11);
            this.M3.delete(i10);
        }
    }

    private m r0(int i10) {
        return new f(i10);
    }

    private void s0(@NonNull Context context) {
        if (this.f111526p2 == null) {
            return;
        }
        com.google.android.material.shape.k kVar = new com.google.android.material.shape.k(this.f111526p2);
        this.f111512j = kVar;
        kVar.a0(context);
        ColorStateList colorStateList = this.f111514k;
        if (colorStateList != null) {
            this.f111512j.p0(colorStateList);
            return;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
        this.f111512j.setTint(typedValue.data);
    }

    private void t0() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(l0(), 1.0f);
        this.f111511i3 = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.f111511i3.addUpdateListener(new c());
    }

    @NonNull
    public static <V extends View> BottomSheetBehavior<V> x0(@NonNull V v10) {
        ViewGroup.LayoutParams layoutParams = v10.getLayoutParams();
        if (!(layoutParams instanceof CoordinatorLayout.g)) {
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        CoordinatorLayout.c cVarF = ((CoordinatorLayout.g) layoutParams).f();
        if (cVarF instanceof BottomSheetBehavior) {
            return (BottomSheetBehavior) cVarF;
        }
        throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
    }

    private void x1(@NonNull View view) {
        boolean z10 = (S0() || this.f111506g) ? false : true;
        if (this.f111530s || this.f111532t || this.f111535v || this.X || this.Y || this.Z || z10) {
            com.google.android.material.internal.p0.h(view, new d(z10));
        }
    }

    private int z0(int i10, int i11, int i12, int i13) {
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

    private boolean z1() {
        return this.f111534u3 != null && (this.f111529r3 || this.f111531s3 == 1);
    }

    public int A0() {
        if (this.f111501b) {
            return this.f111515k3;
        }
        return Math.max(this.f111513j3, this.f111537w ? 0 : this.f111525p1);
    }

    boolean A1(@NonNull View view, float f10) {
        if (this.f111528q3) {
            return true;
        }
        if (U0() && view.getTop() >= this.f111521n3) {
            return Math.abs((((float) view.getTop()) + (f10 * this.f111540y3)) - ((float) this.f111521n3)) / ((float) m0()) > 0.5f;
        }
        return false;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void B(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v10, @NonNull View view, int i10, int i11, int i12, int i13, int i14, @NonNull int[] iArr) {
    }

    @x(from = 0.0d, to = 1.0d)
    public float B0() {
        return this.f111519m3;
    }

    @b1({b1.a.LIBRARY_GROUP})
    public boolean B1() {
        return false;
    }

    public float C0() {
        return this.f111540y3;
    }

    @b1({b1.a.LIBRARY_GROUP})
    public boolean C1() {
        return true;
    }

    @b1({b1.a.LIBRARY_GROUP})
    public int D0() {
        return this.f111533t3;
    }

    com.google.android.material.shape.k E0() {
        return this.f111512j;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void F(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v10, @NonNull Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        super.F(coordinatorLayout, v10, savedState.a());
        b1(savedState);
        int i10 = savedState.f111542c;
        if (i10 != 1 && i10 != 2) {
            this.f111531s3 = i10;
            this.f111533t3 = i10;
            return;
        }
        this.f111531s3 = 4;
        this.f111533t3 = 4;
    }

    @t0
    public int F0() {
        return this.f111518m;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    @NonNull
    public Parcelable G(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v10) {
        return new SavedState(super.G(coordinatorLayout, v10), (BottomSheetBehavior<?>) this);
    }

    @t0
    public int G0() {
        return this.f111516l;
    }

    public int H0() {
        if (this.f111506g) {
            return -1;
        }
        return this.f111505f;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean I(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v10, @NonNull View view, @NonNull View view2, int i10, int i11) {
        this.f111538w3 = 0;
        this.f111539x3 = false;
        return (i10 & 2) != 0;
    }

    @l1
    int I0() {
        return this.f111508h;
    }

    public int J0() {
        return this.f111500a;
    }

    /* JADX WARN: Code duplicated, block: B:48:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:51:0x00bc  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void K(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v10, @NonNull View view, int i10) {
        WeakReference<View> weakReference;
        int i11 = 3;
        if (v10.getTop() == A0()) {
            v1(3);
            return;
        }
        if (!W0() || ((weakReference = this.E3) != null && view == weakReference.get() && this.f111539x3)) {
            if (this.f111538w3 > 0) {
                if (!this.f111501b && v10.getTop() > this.f111517l3) {
                    i11 = 6;
                }
            } else if (this.f111527p3 && A1(v10, N0())) {
                i11 = 5;
            } else if (this.f111538w3 == 0) {
                int top = v10.getTop();
                if (!this.f111501b) {
                    int i12 = this.f111517l3;
                    if (top < i12) {
                        if (top >= Math.abs(top - this.f111521n3)) {
                            if (B1()) {
                                i11 = 4;
                            } else {
                                i11 = 6;
                            }
                        }
                    } else if (Math.abs(top - i12) < Math.abs(top - this.f111521n3)) {
                        i11 = 6;
                    } else {
                        i11 = 4;
                    }
                } else if (Math.abs(top - this.f111515k3) >= Math.abs(top - this.f111521n3)) {
                    i11 = 4;
                }
            } else {
                if (!this.f111501b) {
                    int top2 = v10.getTop();
                    if (Math.abs(top2 - this.f111517l3) < Math.abs(top2 - this.f111521n3)) {
                        i11 = 6;
                    }
                }
                i11 = 4;
            }
            D1(v10, i11, false);
            this.f111539x3 = false;
        }
    }

    public int K0() {
        return this.f111504e;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean L(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v10, @NonNull MotionEvent motionEvent) {
        if (!v10.isShown()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (this.f111531s3 == 1 && actionMasked == 0) {
            return true;
        }
        if (z1()) {
            this.f111534u3.M(motionEvent);
        }
        if (actionMasked == 0) {
            a1();
        }
        if (this.G3 == null) {
            this.G3 = VelocityTracker.obtain();
        }
        this.G3.addMovement(motionEvent);
        if (z1() && actionMasked == 2 && !this.f111536v3 && Math.abs(this.J3 - motionEvent.getY()) > this.f111534u3.E()) {
            this.f111534u3.d(v10, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.f111536v3;
    }

    public boolean L0() {
        return this.f111528q3;
    }

    public boolean P0() {
        return this.f111529r3;
    }

    public boolean R0() {
        return this.f111501b;
    }

    public boolean S0() {
        return this.f111522o;
    }

    public boolean T0() {
        return this.f111527p3;
    }

    @b1({b1.a.LIBRARY_GROUP})
    public boolean U0() {
        return true;
    }

    @b1({b1.a.LIBRARY_GROUP})
    public boolean W0() {
        return true;
    }

    public boolean X0() {
        return this.H1;
    }

    public void Y0(@NonNull g gVar) {
        this.F3.remove(gVar);
    }

    @Override // com.google.android.material.motion.b
    public void b(@NonNull androidx.activity.d dVar) {
        com.google.android.material.motion.f fVar = this.H3;
        if (fVar == null) {
            return;
        }
        fVar.j(dVar);
    }

    @Override // com.google.android.material.motion.b
    public void c(@NonNull androidx.activity.d dVar) {
        com.google.android.material.motion.f fVar = this.H3;
        if (fVar == null) {
            return;
        }
        fVar.l(dVar);
    }

    @Override // com.google.android.material.motion.b
    public void d() {
        com.google.android.material.motion.f fVar = this.H3;
        if (fVar == null) {
            return;
        }
        androidx.activity.d dVarC = fVar.c();
        if (dVarC == null || Build.VERSION.SDK_INT < 34) {
            g(this.f111527p3 ? 5 : 4);
        } else if (this.f111527p3) {
            this.H3.h(dVarC, new b());
        } else {
            this.H3.i(dVarC, null);
            g(4);
        }
    }

    void d1(@p0 View view) {
        WeakReference<View> weakReference;
        if (view != null || (weakReference = this.D3) == null) {
            this.D3 = new WeakReference<>(view);
            F1(view, 1);
        } else {
            q0(weakReference.get(), 1);
            this.D3 = null;
        }
    }

    @Deprecated
    public void e1(g gVar) {
        this.F3.clear();
        if (gVar != null) {
            this.F3.add(gVar);
        }
    }

    @Override // com.google.android.material.motion.b
    public void f() {
        com.google.android.material.motion.f fVar = this.H3;
        if (fVar == null) {
            return;
        }
        fVar.f();
    }

    public void f1(boolean z10) {
        this.f111529r3 = z10;
    }

    public void g(int i10) {
        if (i10 == 1 || i10 == 2) {
            StringBuilder sb2 = new StringBuilder();
            sb2.append("STATE_");
            sb2.append(i10 == 1 ? "DRAGGING" : "SETTLING");
            sb2.append(" should not be set externally.");
            throw new IllegalArgumentException(sb2.toString());
        }
        if (this.f111527p3 || i10 != 5) {
            int i11 = (i10 == 6 && this.f111501b && M0(i10) <= this.f111515k3) ? 3 : i10;
            WeakReference<V> weakReference = this.C3;
            if (weakReference == null || weakReference.get() == null) {
                v1(i10);
            } else {
                V v10 = this.C3.get();
                c1(v10, new a(v10, i11));
            }
        }
    }

    public void g1(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("offset must be greater than or equal to 0");
        }
        this.f111513j3 = i10;
        G1(this.f111531s3, true);
    }

    public int getState() {
        return this.f111531s3;
    }

    public void h0(@NonNull g gVar) {
        if (this.F3.contains(gVar)) {
            return;
        }
        this.F3.add(gVar);
    }

    public void h1(boolean z10) {
        if (this.f111501b == z10) {
            return;
        }
        this.f111501b = z10;
        if (this.C3 != null) {
            i0();
        }
        v1((this.f111501b && this.f111531s3 == 6) ? 3 : this.f111531s3);
        G1(this.f111531s3, true);
        E1();
    }

    public void i1(boolean z10) {
        this.f111522o = z10;
    }

    public void j1(@x(from = 0.0d, fromInclusive = false, to = 1.0d, toInclusive = false) float f10) {
        if (f10 <= 0.0f || f10 >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.f111519m3 = f10;
        if (this.C3 != null) {
            k0();
        }
    }

    public void k1(float f10) {
        this.f111540y3 = f10;
    }

    public void l1(boolean z10) {
        if (this.f111527p3 != z10) {
            this.f111527p3 = z10;
            if (!z10 && this.f111531s3 == 5) {
                g(4);
            }
            E1();
        }
    }

    @b1({b1.a.LIBRARY_GROUP})
    public void m1(boolean z10) {
        this.f111527p3 = z10;
    }

    public float n0() {
        WeakReference<V> weakReference = this.C3;
        if (weakReference == null || weakReference.get() == null) {
            return -1.0f;
        }
        return o0(this.C3.get().getTop());
    }

    public void n1(@t0 int i10) {
        this.f111518m = i10;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void o(@NonNull CoordinatorLayout.g gVar) {
        super.o(gVar);
        this.C3 = null;
        this.f111534u3 = null;
        this.H3 = null;
    }

    public void o1(@t0 int i10) {
        this.f111516l = i10;
    }

    public void p1(int i10) {
        q1(i10, false);
    }

    public final void q1(int i10, boolean z10) {
        if (i10 == -1) {
            if (this.f111506g) {
                return;
            } else {
                this.f111506g = true;
            }
        } else {
            if (!this.f111506g && this.f111505f == i10) {
                return;
            }
            this.f111506g = false;
            this.f111505f = Math.max(0, i10);
        }
        I1(z10);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void r() {
        super.r();
        this.C3 = null;
        this.f111534u3 = null;
        this.H3 = null;
    }

    public void r1(int i10) {
        this.f111500a = i10;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean s(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v10, @NonNull MotionEvent motionEvent) {
        int i10;
        androidx.customview.widget.d dVar;
        if (v10.isShown() && this.f111529r3) {
            int actionMasked = motionEvent.getActionMasked();
            if (actionMasked == 0) {
                a1();
            }
            if (this.G3 == null) {
                this.G3 = VelocityTracker.obtain();
            }
            this.G3.addMovement(motionEvent);
            if (actionMasked == 0) {
                int x10 = (int) motionEvent.getX();
                this.J3 = (int) motionEvent.getY();
                if (this.f111531s3 != 2) {
                    WeakReference<View> weakReference = this.E3;
                    View view = weakReference != null ? weakReference.get() : null;
                    if (view != null && coordinatorLayout.G(view, x10, this.J3)) {
                        this.I3 = motionEvent.getPointerId(motionEvent.getActionIndex());
                        this.K3 = true;
                    }
                }
                this.f111536v3 = this.I3 == -1 && !coordinatorLayout.G(v10, x10, this.J3);
            } else if (actionMasked == 1 || actionMasked == 3) {
                this.K3 = false;
                this.I3 = -1;
                if (this.f111536v3) {
                    this.f111536v3 = false;
                    return false;
                }
            }
            if (!this.f111536v3 && (dVar = this.f111534u3) != null && dVar.W(motionEvent)) {
                return true;
            }
            WeakReference<View> weakReference2 = this.E3;
            View view2 = weakReference2 != null ? weakReference2.get() : null;
            return (actionMasked != 2 || view2 == null || this.f111536v3 || this.f111531s3 == 1 || coordinatorLayout.G(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.f111534u3 == null || (i10 = this.J3) == -1 || Math.abs(((float) i10) - motionEvent.getY()) <= ((float) this.f111534u3.E())) ? false : true;
        }
        this.f111536v3 = true;
        return false;
    }

    public void s1(boolean z10) {
        if (this.H1 != z10) {
            this.H1 = z10;
            G1(getState(), true);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean t(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v10, int i10) {
        if (u1.W(coordinatorLayout) && !u1.W(v10)) {
            v10.setFitsSystemWindows(true);
        }
        if (this.C3 == null) {
            this.f111508h = coordinatorLayout.getResources().getDimensionPixelSize(r6.a.f.f360180f1);
            x1(v10);
            u1.G2(v10, new com.google.android.material.bottomsheet.i(v10));
            this.C3 = new WeakReference<>(v10);
            this.H3 = new com.google.android.material.motion.f(v10);
            com.google.android.material.shape.k kVar = this.f111512j;
            if (kVar != null) {
                u1.O1(v10, kVar);
                com.google.android.material.shape.k kVar2 = this.f111512j;
                float fT = this.f111523o3;
                if (fT == -1.0f) {
                    fT = u1.T(v10);
                }
                kVar2.o0(fT);
            } else {
                ColorStateList colorStateList = this.f111514k;
                if (colorStateList != null) {
                    u1.P1(v10, colorStateList);
                }
            }
            E1();
            if (u1.X(v10) == 0) {
                u1.Y1(v10, 1);
            }
        }
        if (this.f111534u3 == null) {
            this.f111534u3 = androidx.customview.widget.d.q(coordinatorLayout, this.N3);
        }
        int top = v10.getTop();
        coordinatorLayout.N(v10, i10);
        this.A3 = coordinatorLayout.getWidth();
        this.B3 = coordinatorLayout.getHeight();
        int height = v10.getHeight();
        this.f111541z3 = height;
        int iMin = this.B3;
        int i11 = iMin - height;
        int i12 = this.f111525p1;
        if (i11 < i12) {
            if (this.f111537w) {
                int i13 = this.f111518m;
                if (i13 != -1) {
                    iMin = Math.min(iMin, i13);
                }
                this.f111541z3 = iMin;
            } else {
                int iMin2 = iMin - i12;
                int i14 = this.f111518m;
                if (i14 != -1) {
                    iMin2 = Math.min(iMin2, i14);
                }
                this.f111541z3 = iMin2;
            }
        }
        this.f111515k3 = Math.max(0, this.B3 - this.f111541z3);
        k0();
        i0();
        int i15 = this.f111531s3;
        if (i15 == 3) {
            u1.i1(v10, A0());
        } else if (i15 == 6) {
            u1.i1(v10, this.f111517l3);
        } else if (this.f111527p3 && i15 == 5) {
            u1.i1(v10, this.B3);
        } else if (i15 == 4) {
            u1.i1(v10, this.f111521n3);
        } else if (i15 == 1 || i15 == 2) {
            u1.i1(v10, top - v10.getTop());
        }
        G1(this.f111531s3, false);
        this.E3 = new WeakReference<>(w0(v10));
        for (int i16 = 0; i16 < this.F3.size(); i16++) {
            this.F3.get(i16).onLayout(v10);
        }
        return true;
    }

    public void t1(int i10) {
        this.f111504e = i10;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean u(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v10, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v10.getLayoutParams();
        v10.measure(z0(i10, coordinatorLayout.getPaddingLeft() + coordinatorLayout.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, this.f111516l, marginLayoutParams.width), z0(i12, coordinatorLayout.getPaddingTop() + coordinatorLayout.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, this.f111518m, marginLayoutParams.height));
        return true;
    }

    @l1
    @b1({b1.a.LIBRARY_GROUP})
    public void u0() {
        this.f111511i3 = null;
    }

    public void u1(boolean z10) {
        this.f111528q3 = z10;
    }

    void v0(int i10) {
        V v10 = this.C3.get();
        if (v10 == null || this.F3.isEmpty()) {
            return;
        }
        float fO0 = o0(i10);
        for (int i11 = 0; i11 < this.F3.size(); i11++) {
            this.F3.get(i11).onSlide(v10, fO0);
        }
    }

    void v1(int i10) {
        V v10;
        if (this.f111531s3 != i10) {
            this.f111531s3 = i10;
            if (i10 == 4 || i10 == 3 || i10 == 6 || (this.f111527p3 && i10 == 5)) {
                this.f111533t3 = i10;
            }
            WeakReference<V> weakReference = this.C3;
            if (weakReference != null && (v10 = weakReference.get()) != null) {
                if (i10 == 3) {
                    H1(true);
                } else if (i10 == 6 || i10 == 5 || i10 == 4) {
                    H1(false);
                }
                G1(i10, true);
                for (int i11 = 0; i11 < this.F3.size(); i11++) {
                    this.F3.get(i11).onStateChanged(v10, i10);
                }
                E1();
            }
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean w(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v10, @NonNull View view, float f10, float f11) {
        WeakReference<View> weakReference;
        return W0() && (weakReference = this.E3) != null && view == weakReference.get() && (this.f111531s3 != 3 || super.w(coordinatorLayout, v10, view, f10, f11));
    }

    @l1
    @p0
    View w0(View view) {
        if (view.getVisibility() != 0) {
            return null;
        }
        if (u1.a1(view)) {
            return view;
        }
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int childCount = viewGroup.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View viewW0 = w0(viewGroup.getChildAt(i10));
                if (viewW0 != null) {
                    return viewW0;
                }
            }
        }
        return null;
    }

    public void w1(boolean z10) {
        this.f111502c = z10;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void y(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v10, @NonNull View view, int i10, int i11, @NonNull int[] iArr, int i12) {
        if (i12 == 1) {
            return;
        }
        WeakReference<View> weakReference = this.E3;
        View view2 = weakReference != null ? weakReference.get() : null;
        if (!W0() || view == view2) {
            int top = v10.getTop();
            int i13 = top - i11;
            if (i11 > 0) {
                if (i13 < A0()) {
                    int iA0 = top - A0();
                    iArr[1] = iA0;
                    u1.i1(v10, -iA0);
                    v1(3);
                } else {
                    if (!this.f111529r3) {
                        return;
                    }
                    iArr[1] = i11;
                    u1.i1(v10, -i11);
                    v1(1);
                }
            } else if (i11 < 0 && !view.canScrollVertically(-1)) {
                if (i13 > this.f111521n3 && !p0()) {
                    int i14 = top - this.f111521n3;
                    iArr[1] = i14;
                    u1.i1(v10, -i14);
                    v1(4);
                } else {
                    if (!this.f111529r3) {
                        return;
                    }
                    iArr[1] = i11;
                    u1.i1(v10, -i11);
                    v1(1);
                }
            }
            v0(v10.getTop());
            this.f111538w3 = i11;
            this.f111539x3 = true;
        }
    }

    @l1
    @p0
    com.google.android.material.motion.f y0() {
        return this.H3;
    }

    @b1({b1.a.LIBRARY_GROUP})
    public boolean y1(long j10, @x(from = 0.0d, to = i1.f268246o) float f10) {
        return false;
    }

    private class k {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f111558a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f111559b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Runnable f111560c;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                k.this.f111559b = false;
                androidx.customview.widget.d dVar = BottomSheetBehavior.this.f111534u3;
                if (dVar != null && dVar.o(true)) {
                    k kVar = k.this;
                    kVar.c(kVar.f111558a);
                    return;
                }
                k kVar2 = k.this;
                BottomSheetBehavior bottomSheetBehavior = BottomSheetBehavior.this;
                if (bottomSheetBehavior.f111531s3 == 2) {
                    bottomSheetBehavior.v1(kVar2.f111558a);
                }
            }
        }

        private k() {
            this.f111560c = new a();
        }

        void c(int i10) {
            WeakReference<V> weakReference = BottomSheetBehavior.this.C3;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            this.f111558a = i10;
            if (this.f111559b) {
                return;
            }
            u1.u1(BottomSheetBehavior.this.C3.get(), this.f111560c);
            this.f111559b = true;
        }

        /* synthetic */ k(BottomSheetBehavior bottomSheetBehavior, a aVar) {
            this();
        }
    }

    public BottomSheetBehavior(@NonNull Context context, @p0 AttributeSet attributeSet) {
        int i10;
        super(context, attributeSet);
        this.f111500a = 0;
        this.f111501b = true;
        this.f111502c = false;
        this.f111516l = -1;
        this.f111518m = -1;
        this.f111509h3 = new k(this, null);
        this.f111519m3 = 0.5f;
        this.f111523o3 = -1.0f;
        this.f111529r3 = true;
        this.f111531s3 = 4;
        this.f111533t3 = 4;
        this.f111540y3 = 0.1f;
        this.F3 = new ArrayList<>();
        this.J3 = -1;
        this.M3 = new SparseIntArray();
        this.N3 = new e();
        this.f111510i = context.getResources().getDimensionPixelSize(r6.a.f.Ec);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r6.a.o.f361822j5);
        if (typedArrayObtainStyledAttributes.hasValue(r6.a.o.f361918n5)) {
            this.f111514k = com.google.android.material.resources.c.a(context, typedArrayObtainStyledAttributes, r6.a.o.f361918n5);
        }
        if (typedArrayObtainStyledAttributes.hasValue(r6.a.o.F5)) {
            this.f111526p2 = p.e(context, attributeSet, r6.a.c.f359417n1, f111499k4).m();
        }
        s0(context);
        t0();
        this.f111523o3 = typedArrayObtainStyledAttributes.getDimension(r6.a.o.f361894m5, -1.0f);
        if (typedArrayObtainStyledAttributes.hasValue(r6.a.o.f361846k5)) {
            o1(typedArrayObtainStyledAttributes.getDimensionPixelSize(r6.a.o.f361846k5, -1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(r6.a.o.f361870l5)) {
            n1(typedArrayObtainStyledAttributes.getDimensionPixelSize(r6.a.o.f361870l5, -1));
        }
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(r6.a.o.f362063t5);
        if (typedValuePeekValue == null || (i10 = typedValuePeekValue.data) != -1) {
            p1(typedArrayObtainStyledAttributes.getDimensionPixelSize(r6.a.o.f362063t5, -1));
        } else {
            p1(i10);
        }
        l1(typedArrayObtainStyledAttributes.getBoolean(r6.a.o.f362039s5, false));
        i1(typedArrayObtainStyledAttributes.getBoolean(r6.a.o.f362159x5, false));
        h1(typedArrayObtainStyledAttributes.getBoolean(r6.a.o.f361990q5, true));
        u1(typedArrayObtainStyledAttributes.getBoolean(r6.a.o.f362135w5, false));
        f1(typedArrayObtainStyledAttributes.getBoolean(r6.a.o.f361942o5, true));
        r1(typedArrayObtainStyledAttributes.getInt(r6.a.o.f362087u5, 0));
        j1(typedArrayObtainStyledAttributes.getFloat(r6.a.o.f362014r5, 0.5f));
        TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(r6.a.o.f361966p5);
        if (typedValuePeekValue2 != null && typedValuePeekValue2.type == 16) {
            g1(typedValuePeekValue2.data);
        } else {
            g1(typedArrayObtainStyledAttributes.getDimensionPixelOffset(r6.a.o.f361966p5, 0));
        }
        t1(typedArrayObtainStyledAttributes.getInt(r6.a.o.f362111v5, 500));
        this.f111530s = typedArrayObtainStyledAttributes.getBoolean(r6.a.o.B5, false);
        this.f111532t = typedArrayObtainStyledAttributes.getBoolean(r6.a.o.C5, false);
        this.f111535v = typedArrayObtainStyledAttributes.getBoolean(r6.a.o.D5, false);
        this.f111537w = typedArrayObtainStyledAttributes.getBoolean(r6.a.o.E5, true);
        this.X = typedArrayObtainStyledAttributes.getBoolean(r6.a.o.f362183y5, false);
        this.Y = typedArrayObtainStyledAttributes.getBoolean(r6.a.o.f362207z5, false);
        this.Z = typedArrayObtainStyledAttributes.getBoolean(r6.a.o.A5, false);
        this.H1 = typedArrayObtainStyledAttributes.getBoolean(r6.a.o.H5, true);
        typedArrayObtainStyledAttributes.recycle();
        this.f111503d = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}

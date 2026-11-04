package com.google.android.material.bottomsheet;

import android.R;
import android.animation.ValueAnimator;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
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
import androidx.annotation.b1;
import androidx.annotation.f1;
import androidx.annotation.l1;
import androidx.annotation.p0;
import androidx.annotation.t0;
import androidx.annotation.x;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.graphics.j;
import androidx.core.view.accessibility.m;
import androidx.core.view.g3;
import androidx.core.view.u1;
import androidx.customview.view.AbsSavedState;
import com.google.android.material.shape.k;
import com.google.android.material.shape.p;
import com.planner5d.library.services.utility.y3;
import d0.i1;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import pj.n;

/* JADX INFO: loaded from: classes4.dex */
public class AdvancedBottomSheetBehavior<V extends View> extends CoordinatorLayout.c<V> {
    public static final int M3 = 1;
    public static final int N3 = 2;
    public static final int O3 = 3;
    public static final int P3 = 4;
    public static final int Q3 = 5;
    public static final int R3 = 6;
    public static final int S3 = 7;
    public static final int T3 = -1;
    public static final int U3 = 1;
    public static final int V3 = 2;
    public static final int W3 = 4;
    public static final int X3 = 8;
    public static final int Y3 = 16;
    public static final int Z3 = -1;

    /* JADX INFO: renamed from: a4, reason: collision with root package name */
    public static final int f111420a4 = 0;

    /* JADX INFO: renamed from: b4, reason: collision with root package name */
    private static final String f111421b4 = "BottomSheetBehavior";

    /* JADX INFO: renamed from: c4, reason: collision with root package name */
    private static final int f111422c4 = 500;

    /* JADX INFO: renamed from: d4, reason: collision with root package name */
    private static final float f111423d4 = 0.5f;

    /* JADX INFO: renamed from: e4, reason: collision with root package name */
    private static final float f111424e4 = 0.1f;

    /* JADX INFO: renamed from: f4, reason: collision with root package name */
    private static final int f111425f4 = 500;

    /* JADX INFO: renamed from: g4, reason: collision with root package name */
    private static final int f111426g4 = -1;

    /* JADX INFO: renamed from: h4, reason: collision with root package name */
    private static final int f111427h4 = r6.a.n.Ne;
    int A3;
    int B3;

    @p0
    WeakReference<V> C3;

    @p0
    WeakReference<View> D3;

    @NonNull
    private final ArrayList<e> E3;

    @p0
    private VelocityTracker F3;
    int G3;
    private p H1;
    private int H3;
    boolean I3;

    @p0
    private Map<View, Integer> J3;
    private int K3;
    private final androidx.customview.widget.d.c L3;
    private boolean X;
    private boolean Y;
    private boolean Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f111428a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f111429b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private boolean f111430c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private float f111431d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f111432e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f111433f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f111434g;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    private final AdvancedBottomSheetBehavior<V>.i f111435g3;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f111436h;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    @p0
    private ValueAnimator f111437h3;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f111438i;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    int f111439i3;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private k f111440j;

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    int f111441j3;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    @p0
    private ColorStateList f111442k;

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    int f111443k3;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f111444l;

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    float f111445l3;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f111446m;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    int f111447m3;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private int f111448n;

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    int f111449n3;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private boolean f111450o;

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    float f111451o3;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private int f111452p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private int f111453p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private boolean f111454p2;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    boolean f111455p3;

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    private boolean f111456q3;

    /* JADX INFO: renamed from: r3, reason: collision with root package name */
    private boolean f111457r3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f111458s;

    /* JADX INFO: renamed from: s3, reason: collision with root package name */
    int f111459s3;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f111460t;

    /* JADX INFO: renamed from: t3, reason: collision with root package name */
    int f111461t3;

    /* JADX INFO: renamed from: u3, reason: collision with root package name */
    @p0
    androidx.customview.widget.d f111462u3;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f111463v;

    /* JADX INFO: renamed from: v3, reason: collision with root package name */
    private boolean f111464v3;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private boolean f111465w;

    /* JADX INFO: renamed from: w3, reason: collision with root package name */
    private int f111466w3;

    /* JADX INFO: renamed from: x3, reason: collision with root package name */
    private boolean f111467x3;

    /* JADX INFO: renamed from: y3, reason: collision with root package name */
    private float f111468y3;

    /* JADX INFO: renamed from: z3, reason: collision with root package name */
    private int f111469z3;

    protected static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final int f111470c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f111471d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f111472e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        boolean f111473f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        boolean f111474g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        boolean f111475h;

        class a implements Parcelable.ClassLoaderCreator<SavedState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
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
            parcel.writeInt(this.f111470c);
            parcel.writeInt(this.f111471d);
            parcel.writeInt(this.f111472e);
            parcel.writeInt(this.f111473f ? 1 : 0);
            parcel.writeInt(this.f111474g ? 1 : 0);
            parcel.writeInt(this.f111475h ? 1 : 0);
        }

        public SavedState(@NonNull Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f111470c = parcel.readInt();
            this.f111471d = parcel.readInt();
            this.f111472e = parcel.readInt();
            this.f111473f = parcel.readInt() == 1;
            this.f111474g = parcel.readInt() == 1;
            this.f111475h = parcel.readInt() == 1;
        }

        public SavedState(Parcelable parcelable, @NonNull AdvancedBottomSheetBehavior<?> advancedBottomSheetBehavior) {
            super(parcelable);
            this.f111470c = advancedBottomSheetBehavior.f111459s3;
            this.f111471d = ((AdvancedBottomSheetBehavior) advancedBottomSheetBehavior).f111432e;
            this.f111472e = ((AdvancedBottomSheetBehavior) advancedBottomSheetBehavior).f111433f;
            this.f111473f = ((AdvancedBottomSheetBehavior) advancedBottomSheetBehavior).f111429b;
            this.f111474g = advancedBottomSheetBehavior.f111455p3;
            this.f111475h = ((AdvancedBottomSheetBehavior) advancedBottomSheetBehavior).f111456q3;
        }

        @Deprecated
        public SavedState(Parcelable parcelable, int i10) {
            super(parcelable);
            this.f111470c = i10;
        }
    }

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ View f111476a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f111477b;

        a(View view, int i10) {
            this.f111476a = view;
            this.f111477b = i10;
        }

        @Override // java.lang.Runnable
        public void run() {
            AdvancedBottomSheetBehavior.this.j1(this.f111476a, this.f111477b, false);
        }
    }

    class b implements ValueAnimator.AnimatorUpdateListener {
        b() {
        }

        @Override // android.animation.ValueAnimator.AnimatorUpdateListener
        public void onAnimationUpdate(@NonNull ValueAnimator valueAnimator) {
            float fFloatValue = ((Float) valueAnimator.getAnimatedValue()).floatValue();
            if (AdvancedBottomSheetBehavior.this.f111440j != null) {
                AdvancedBottomSheetBehavior.this.f111440j.q0(fFloatValue);
            }
        }
    }

    class c extends androidx.customview.widget.d.c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private long f111480a;

        c() {
        }

        private boolean n(@NonNull View view) {
            int top = view.getTop();
            AdvancedBottomSheetBehavior advancedBottomSheetBehavior = AdvancedBottomSheetBehavior.this;
            return top > (advancedBottomSheetBehavior.B3 + advancedBottomSheetBehavior.l0()) / 2;
        }

        @Override // androidx.customview.widget.d.c
        public int a(@NonNull View view, int i10, int i11) {
            return view.getLeft();
        }

        @Override // androidx.customview.widget.d.c
        public int b(@NonNull View view, int i10, int i11) {
            int iL0 = AdvancedBottomSheetBehavior.this.l0();
            AdvancedBottomSheetBehavior advancedBottomSheetBehavior = AdvancedBottomSheetBehavior.this;
            return n1.a.e(i10, iL0, advancedBottomSheetBehavior.f111455p3 ? advancedBottomSheetBehavior.B3 : advancedBottomSheetBehavior.f111449n3);
        }

        @Override // androidx.customview.widget.d.c
        public int e(@NonNull View view) {
            AdvancedBottomSheetBehavior advancedBottomSheetBehavior = AdvancedBottomSheetBehavior.this;
            return advancedBottomSheetBehavior.f111455p3 ? advancedBottomSheetBehavior.B3 : advancedBottomSheetBehavior.f111449n3;
        }

        @Override // androidx.customview.widget.d.c
        public void j(int i10) {
            if (i10 == 1 && AdvancedBottomSheetBehavior.this.f111457r3) {
                AdvancedBottomSheetBehavior.this.b1(1);
            }
        }

        @Override // androidx.customview.widget.d.c
        public void k(@NonNull View view, int i10, int i11, int i12, int i13) {
            AdvancedBottomSheetBehavior.this.g0(i11);
        }

        /* JADX WARN: Code duplicated, block: B:39:0x00c5  */
        /* JADX WARN: Code duplicated, block: B:48:0x010a  */
        /* JADX WARN: Code duplicated, block: B:6:0x0013  */
        @Override // androidx.customview.widget.d.c
        public void l(@NonNull View view, float f10, float f11) {
            int i10 = 6;
            if (f11 >= 0.0f) {
                AdvancedBottomSheetBehavior advancedBottomSheetBehavior = AdvancedBottomSheetBehavior.this;
                if (advancedBottomSheetBehavior.f111455p3 && advancedBottomSheetBehavior.g1(view, f11)) {
                    if ((Math.abs(f10) < Math.abs(f11) && f11 > 500.0f) || n(view)) {
                        i10 = 5;
                    } else if (AdvancedBottomSheetBehavior.this.f111429b || Math.abs(view.getTop() - AdvancedBottomSheetBehavior.this.l0()) < Math.abs(view.getTop() - AdvancedBottomSheetBehavior.this.f111443k3)) {
                        i10 = 3;
                    }
                } else if (f11 == 0.0f || Math.abs(f10) > Math.abs(f11)) {
                    int top = view.getTop();
                    if (!AdvancedBottomSheetBehavior.this.f111429b) {
                        AdvancedBottomSheetBehavior advancedBottomSheetBehavior2 = AdvancedBottomSheetBehavior.this;
                        int i11 = advancedBottomSheetBehavior2.f111443k3;
                        if (top >= i11) {
                            if (Math.abs(top - i11) < Math.abs(top - AdvancedBottomSheetBehavior.this.f111447m3)) {
                                if (AdvancedBottomSheetBehavior.this.h1()) {
                                }
                            } else if (Math.abs(top - AdvancedBottomSheetBehavior.this.f111447m3) >= Math.abs(top - AdvancedBottomSheetBehavior.this.f111449n3)) {
                                i10 = 7;
                            }
                            i10 = 4;
                        } else if (top < Math.abs(top - advancedBottomSheetBehavior2.f111447m3)) {
                            i10 = 3;
                        } else if (AdvancedBottomSheetBehavior.this.h1()) {
                            i10 = 4;
                        }
                    } else if (Math.abs(top - AdvancedBottomSheetBehavior.this.f111441j3) < Math.abs(top - AdvancedBottomSheetBehavior.this.f111447m3)) {
                        i10 = 3;
                    } else if (Math.abs(top - AdvancedBottomSheetBehavior.this.f111441j3) < Math.abs(top - AdvancedBottomSheetBehavior.this.f111449n3)) {
                        i10 = 4;
                    } else {
                        i10 = 7;
                    }
                } else if (AdvancedBottomSheetBehavior.this.f111429b) {
                    i10 = 4;
                } else {
                    int top2 = view.getTop();
                    if (Math.abs(top2 - AdvancedBottomSheetBehavior.this.f111443k3) < Math.abs(top2 - AdvancedBottomSheetBehavior.this.f111447m3)) {
                        if (AdvancedBottomSheetBehavior.this.h1()) {
                        }
                    } else if (Math.abs(top2 - AdvancedBottomSheetBehavior.this.f111447m3) >= Math.abs(top2 - AdvancedBottomSheetBehavior.this.f111449n3)) {
                        i10 = 7;
                    }
                    i10 = 4;
                }
            } else if (AdvancedBottomSheetBehavior.this.f111429b) {
                i10 = 3;
            } else {
                int top3 = view.getTop();
                long jCurrentTimeMillis = System.currentTimeMillis() - this.f111480a;
                if (AdvancedBottomSheetBehavior.this.h1()) {
                    AdvancedBottomSheetBehavior advancedBottomSheetBehavior3 = AdvancedBottomSheetBehavior.this;
                    if (!advancedBottomSheetBehavior3.e1(jCurrentTimeMillis, (top3 * 100.0f) / advancedBottomSheetBehavior3.B3)) {
                        i10 = 4;
                    }
                } else if (top3 <= AdvancedBottomSheetBehavior.this.f111443k3) {
                }
                i10 = 3;
            }
            AdvancedBottomSheetBehavior advancedBottomSheetBehavior4 = AdvancedBottomSheetBehavior.this;
            advancedBottomSheetBehavior4.j1(view, i10, advancedBottomSheetBehavior4.i1());
        }

        @Override // androidx.customview.widget.d.c
        public boolean m(@NonNull View view, int i10) {
            AdvancedBottomSheetBehavior advancedBottomSheetBehavior = AdvancedBottomSheetBehavior.this;
            int i11 = advancedBottomSheetBehavior.f111459s3;
            if (i11 == 1 || advancedBottomSheetBehavior.I3) {
                return false;
            }
            if (i11 == 3 && advancedBottomSheetBehavior.G3 == i10) {
                WeakReference<View> weakReference = advancedBottomSheetBehavior.D3;
                View view2 = weakReference != null ? weakReference.get() : null;
                if (view2 != null && view2.canScrollVertically(-1)) {
                    return false;
                }
            }
            this.f111480a = System.currentTimeMillis();
            WeakReference<V> weakReference2 = AdvancedBottomSheetBehavior.this.C3;
            return weakReference2 != null && weakReference2.get() == view;
        }
    }

    class d implements m {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f111482a;

        d(int i10) {
            this.f111482a = i10;
        }

        @Override // androidx.core.view.accessibility.m
        public boolean a(@NonNull View view, @p0 m.a aVar) {
            AdvancedBottomSheetBehavior.this.g(this.f111482a);
            return true;
        }
    }

    public static abstract class e {
        void a(@NonNull View view) {
        }

        public abstract void b(@NonNull View view, float f10);

        public abstract void c(@NonNull View view, int i10);
    }

    @Retention(RetentionPolicy.SOURCE)
    @b1({b1.a.LIBRARY_GROUP})
    public @interface f {
    }

    @Retention(RetentionPolicy.SOURCE)
    @b1({b1.a.LIBRARY_GROUP})
    public @interface g {
    }

    @Retention(RetentionPolicy.SOURCE)
    @b1({b1.a.LIBRARY_GROUP})
    public @interface h {
    }

    private class i {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private int f111484a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f111485b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final Runnable f111486c;

        class a implements Runnable {
            a() {
            }

            @Override // java.lang.Runnable
            public void run() {
                i.this.f111485b = false;
                androidx.customview.widget.d dVar = AdvancedBottomSheetBehavior.this.f111462u3;
                if (dVar != null && dVar.o(true)) {
                    i iVar = i.this;
                    iVar.c(iVar.f111484a);
                    return;
                }
                i iVar2 = i.this;
                AdvancedBottomSheetBehavior advancedBottomSheetBehavior = AdvancedBottomSheetBehavior.this;
                if (advancedBottomSheetBehavior.f111459s3 == 2) {
                    advancedBottomSheetBehavior.b1(iVar2.f111484a);
                }
            }
        }

        void c(int i10) {
            WeakReference<V> weakReference = AdvancedBottomSheetBehavior.this.C3;
            if (weakReference == null || weakReference.get() == null) {
                return;
            }
            this.f111484a = i10;
            if (this.f111485b) {
                return;
            }
            u1.u1(AdvancedBottomSheetBehavior.this.C3.get(), this.f111486c);
            this.f111485b = true;
        }

        private i() {
            this.f111486c = new a();
        }
    }

    public AdvancedBottomSheetBehavior() {
        this.f111428a = 0;
        this.f111429b = true;
        this.f111430c = false;
        this.f111444l = -1;
        this.f111446m = -1;
        this.f111435g3 = new i();
        this.f111445l3 = 0.5f;
        this.f111451o3 = -1.0f;
        this.f111457r3 = true;
        this.f111459s3 = 4;
        this.f111461t3 = 4;
        this.f111468y3 = 0.1f;
        this.E3 = new ArrayList<>();
        this.K3 = -1;
        this.L3 = new c();
    }

    private boolean C0(V v10) {
        ViewParent parent = v10.getParent();
        return parent != null && parent.isLayoutRequested() && u1.R0(v10);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:22:0x0072  */
    /* JADX WARN: Code duplicated, block: B:33:0x008f  */
    public /* synthetic */ g3 E0(boolean z10, View view, g3 g3Var, y3.a aVar) {
        boolean z11;
        j jVarF = g3Var.f(g3.m.i());
        j jVarF2 = g3Var.f(g3.m.f());
        this.f111453p1 = jVarF.f47824b;
        boolean zT = y3.t(view);
        int paddingBottom = view.getPaddingBottom();
        int paddingLeft = view.getPaddingLeft();
        int paddingRight = view.getPaddingRight();
        if (this.f111458s) {
            int iO = g3Var.o();
            this.f111452p0 = iO;
            paddingBottom = iO + aVar.f229867d;
        }
        if (this.f111460t) {
            paddingLeft = (zT ? aVar.f229866c : aVar.f229864a) + jVarF.f47823a;
        }
        if (this.f111463v) {
            paddingRight = (zT ? aVar.f229864a : aVar.f229866c) + jVarF.f47825c;
        }
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        int i10 = 6 >> 0;
        boolean z12 = true;
        if (this.X) {
            int i11 = marginLayoutParams.leftMargin;
            int i12 = jVarF.f47823a;
            if (i11 != i12) {
                marginLayoutParams.leftMargin = i12;
                z11 = true;
            } else {
                z11 = false;
            }
        } else {
            z11 = false;
        }
        if (this.Y) {
            int i13 = marginLayoutParams.rightMargin;
            int i14 = jVarF.f47825c;
            if (i13 != i14) {
                marginLayoutParams.rightMargin = i14;
                z11 = true;
            }
        }
        if (this.Z) {
            int i15 = marginLayoutParams.topMargin;
            int i16 = jVarF.f47824b;
            if (i15 != i16) {
                marginLayoutParams.topMargin = i16;
            } else {
                z12 = z11;
            }
        } else {
            z12 = z11;
        }
        if (z12) {
            view.setLayoutParams(marginLayoutParams);
        }
        view.setPadding(paddingLeft, view.getPaddingTop(), paddingRight, paddingBottom);
        if (z10) {
            this.f111448n = jVarF2.f47826d;
        }
        if (!this.f111458s && !z10) {
            return g3Var;
        }
        o1(false);
        return g3Var;
    }

    private void G0(V v10, androidx.core.view.accessibility.j.a aVar, int i10) {
        u1.z1(v10, aVar, null, c0(i10));
    }

    private void H0() {
        this.G3 = -1;
        VelocityTracker velocityTracker = this.F3;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.F3 = null;
        }
    }

    private void I0(@NonNull SavedState savedState) {
        int i10 = this.f111428a;
        if (i10 != 0) {
            if (i10 == -1 || (i10 & 1) == 1) {
                this.f111433f = savedState.f111472e;
            }
            if (i10 == -1 || (i10 & 16) == 16) {
                this.f111432e = savedState.f111471d;
            }
            if (i10 == -1 || (i10 & 2) == 2) {
                this.f111429b = savedState.f111473f;
            }
            if (i10 == -1 || (i10 & 4) == 4) {
                this.f111455p3 = savedState.f111474g;
            }
            if (i10 == -1 || (i10 & 8) == 8) {
                this.f111456q3 = savedState.f111475h;
            }
        }
    }

    private void J0(V v10, Runnable runnable) {
        if (C0(v10)) {
            v10.post(runnable);
        } else {
            runnable.run();
        }
    }

    private int V(V v10, @f1 int i10, int i11) {
        return u1.c(v10, v10.getResources().getString(i10), c0(i11));
    }

    private int X() {
        int iMin;
        int i10;
        int i11;
        if (this.f111434g) {
            iMin = Math.min(Math.max(this.f111436h, this.B3 - ((this.A3 * 9) / 16)), this.f111469z3);
            i10 = this.f111452p0;
        } else {
            if (!this.f111450o && !this.f111458s && (i11 = this.f111448n) > 0) {
                return Math.max(this.f111432e, i11 + this.f111438i);
            }
            iMin = this.f111432e;
            i10 = this.f111452p0;
        }
        return iMin + i10;
    }

    private void Y() {
        int iX = X();
        if (this.f111429b) {
            this.f111447m3 = Math.max(this.B3 - iX, this.f111441j3);
        } else {
            this.f111447m3 = this.B3 - iX;
        }
    }

    private void Z() {
        this.f111443k3 = (int) (this.B3 * (1.0f - this.f111445l3));
    }

    private int a0() {
        int iMin;
        int i10;
        int i11;
        if (this.f111434g) {
            iMin = Math.min(Math.max(this.f111436h, this.B3 - ((this.A3 * 9) / 16)), this.f111469z3);
            i10 = this.f111452p0;
        } else {
            if (!this.f111450o && !this.f111458s && (i11 = this.f111448n) > 0) {
                return Math.max(this.f111433f, i11 + this.f111438i);
            }
            iMin = this.f111433f;
            i10 = this.f111452p0;
        }
        return iMin + i10;
    }

    private void b0() {
        int iA0 = a0();
        if (this.f111429b) {
            this.f111449n3 = Math.max(this.B3 - iA0, this.f111441j3);
        } else {
            this.f111449n3 = this.B3 - iA0;
        }
    }

    private m c0(int i10) {
        return new d(i10);
    }

    private void d0(@NonNull Context context) {
        if (this.H1 == null) {
            return;
        }
        k kVar = new k(this.H1);
        this.f111440j = kVar;
        kVar.a0(context);
        ColorStateList colorStateList = this.f111442k;
        if (colorStateList != null) {
            this.f111440j.p0(colorStateList);
            return;
        }
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.colorBackground, typedValue, true);
        this.f111440j.setTint(typedValue.data);
    }

    private void d1(@NonNull View view) {
        final boolean z10 = (A0() || this.f111434g) ? false : true;
        if (this.f111458s || this.f111460t || this.f111463v || this.X || this.Y || this.Z || z10) {
            y3.j(view, new n() { // from class: com.google.android.material.bottomsheet.a
                @Override // pj.n
                public final Object invoke(Object obj, Object obj2, Object obj3) {
                    return this.f111563a.E0(z10, (View) obj, (g3) obj2, (y3.a) obj3);
                }
            });
        }
    }

    private void e0() {
        ValueAnimator valueAnimatorOfFloat = ValueAnimator.ofFloat(0.0f, 1.0f);
        this.f111437h3 = valueAnimatorOfFloat;
        valueAnimatorOfFloat.setDuration(500L);
        this.f111437h3.addUpdateListener(new b());
    }

    private boolean f1() {
        return this.f111462u3 != null && (this.f111457r3 || this.f111459s3 == 1);
    }

    @NonNull
    public static <V extends View> AdvancedBottomSheetBehavior<V> i0(@NonNull V v10) {
        ViewGroup.LayoutParams layoutParams = v10.getLayoutParams();
        if (!(layoutParams instanceof CoordinatorLayout.g)) {
            throw new IllegalArgumentException("The view is not a child of CoordinatorLayout");
        }
        CoordinatorLayout.c cVarF = ((CoordinatorLayout.g) layoutParams).f();
        if (cVarF instanceof AdvancedBottomSheetBehavior) {
            return (AdvancedBottomSheetBehavior) cVarF;
        }
        throw new IllegalArgumentException("The view is not associated with BottomSheetBehavior");
    }

    private int j0(int i10, int i11, int i12, int i13) {
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

    /* JADX INFO: Access modifiers changed from: private */
    public void j1(View view, int i10, boolean z10) {
        int iW0 = w0(i10);
        androidx.customview.widget.d dVar = this.f111462u3;
        if (dVar == null || (!z10 ? dVar.X(view, view.getLeft(), iW0) : dVar.V(view.getLeft(), iW0))) {
            b1(i10);
            return;
        }
        b1(2);
        m1(i10);
        this.f111435g3.c(i10);
    }

    private void k1() {
        V v10;
        WeakReference<V> weakReference = this.C3;
        if (weakReference == null || (v10 = weakReference.get()) == null) {
            return;
        }
        u1.w1(v10, 524288);
        u1.w1(v10, 262144);
        u1.w1(v10, 1048576);
        int i10 = this.K3;
        if (i10 != -1) {
            u1.w1(v10, i10);
        }
        if (!this.f111429b && this.f111459s3 != 6) {
            this.K3 = V(v10, r6.a.m.F, 6);
        }
        if (this.f111455p3 && this.f111459s3 != 5) {
            G0(v10, androidx.core.view.accessibility.j.a.f48563z, 5);
        }
        int i11 = this.f111459s3;
        if (i11 == 3) {
            G0(v10, androidx.core.view.accessibility.j.a.f48562y, this.f111429b ? 4 : 6);
            return;
        }
        if (i11 == 4) {
            G0(v10, androidx.core.view.accessibility.j.a.f48561x, this.f111429b ? 3 : 6);
        } else {
            if (i11 != 6) {
                return;
            }
            G0(v10, androidx.core.view.accessibility.j.a.f48562y, 4);
            G0(v10, androidx.core.view.accessibility.j.a.f48561x, 3);
        }
    }

    private void l1(boolean z10) {
        V v10;
        if (this.C3 != null) {
            Y();
            if (this.f111459s3 != 4 || (v10 = this.C3.get()) == null) {
                return;
            }
            if (z10) {
                g(4);
            } else {
                v10.requestLayout();
            }
        }
    }

    private void m1(int i10) {
        ValueAnimator valueAnimator;
        if (i10 == 2) {
            return;
        }
        boolean z10 = i10 == 3;
        if (this.f111454p2 != z10) {
            this.f111454p2 = z10;
            if (this.f111440j == null || (valueAnimator = this.f111437h3) == null) {
                return;
            }
            if (valueAnimator.isRunning()) {
                this.f111437h3.reverse();
                return;
            }
            float f10 = z10 ? 0.0f : 1.0f;
            this.f111437h3.setFloatValues(1.0f - f10, f10);
            this.f111437h3.start();
        }
    }

    private void n1(boolean z10) {
        Map<View, Integer> map;
        Integer num;
        WeakReference<V> weakReference = this.C3;
        if (weakReference == null) {
            return;
        }
        ViewParent parent = weakReference.get().getParent();
        if (parent instanceof CoordinatorLayout) {
            CoordinatorLayout coordinatorLayout = (CoordinatorLayout) parent;
            int childCount = coordinatorLayout.getChildCount();
            if (z10) {
                if (this.J3 != null) {
                    return;
                } else {
                    this.J3 = new HashMap(childCount);
                }
            }
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = coordinatorLayout.getChildAt(i10);
                if (childAt != this.C3.get()) {
                    if (z10) {
                        this.J3.put(childAt, Integer.valueOf(childAt.getImportantForAccessibility()));
                        if (this.f111430c) {
                            u1.Y1(childAt, 4);
                        }
                    } else if (this.f111430c && (map = this.J3) != null && map.containsKey(childAt) && (num = this.J3.get(childAt)) != null) {
                        u1.Y1(childAt, num.intValue());
                    }
                }
            }
            if (!z10) {
                this.J3 = null;
            } else if (this.f111430c) {
                this.C3.get().sendAccessibilityEvent(8);
            }
        }
    }

    private void o1(boolean z10) {
        V v10;
        if (this.C3 != null) {
            b0();
            if (this.f111459s3 != 7 || (v10 = this.C3.get()) == null) {
                return;
            }
            if (z10) {
                g(7);
            } else {
                v10.requestLayout();
            }
        }
    }

    private int w0(int i10) {
        if (i10 == 3) {
            return l0();
        }
        if (i10 == 4) {
            return this.f111447m3;
        }
        if (i10 == 5) {
            return this.B3;
        }
        if (i10 == 6) {
            return this.f111443k3;
        }
        if (i10 == 7) {
            return this.f111449n3;
        }
        throw new IllegalArgumentException("Invalid state to get top offset: " + i10);
    }

    private float x0() {
        VelocityTracker velocityTracker = this.F3;
        if (velocityTracker == null) {
            return 0.0f;
        }
        velocityTracker.computeCurrentVelocity(1000, this.f111431d);
        return this.F3.getYVelocity(this.G3);
    }

    public boolean A0() {
        return this.f111450o;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void B(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v10, @NonNull View view, int i10, int i11, int i12, int i13, int i14, @NonNull int[] iArr) {
    }

    public boolean B0() {
        return this.f111455p3;
    }

    @b1({b1.a.LIBRARY_GROUP})
    public boolean D0() {
        return true;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void F(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v10, @NonNull Parcelable parcelable) {
        SavedState savedState = (SavedState) parcelable;
        if (savedState.a() != null) {
            super.F(coordinatorLayout, v10, savedState.a());
        }
        I0(savedState);
        int i10 = savedState.f111470c;
        if (i10 == 1 || i10 == 2) {
            this.f111459s3 = 4;
        } else {
            this.f111459s3 = i10;
        }
        this.f111461t3 = this.f111459s3;
    }

    public void F0(@NonNull e eVar) {
        this.E3.remove(eVar);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    @NonNull
    public Parcelable G(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v10) {
        return new SavedState(super.G(coordinatorLayout, v10), (AdvancedBottomSheetBehavior<?>) this);
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean I(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v10, @NonNull View view, @NonNull View view2, int i10, int i11) {
        this.f111466w3 = 0;
        this.f111467x3 = false;
        return (i10 & 2) != 0;
    }

    /* JADX WARN: Code duplicated, block: B:51:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:54:0x00df  */
    /* JADX WARN: Code duplicated, block: B:58:0x00f7  */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void K(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v10, @NonNull View view, int i10) {
        WeakReference<View> weakReference;
        int i11 = 3;
        if (v10.getTop() == l0()) {
            b1(3);
            return;
        }
        if (!D0() || ((weakReference = this.D3) != null && view == weakReference.get() && this.f111467x3)) {
            if (this.f111466w3 > 0) {
                if (!this.f111429b && v10.getTop() > this.f111443k3) {
                    i11 = 6;
                }
            } else if (this.f111455p3 && g1(v10, x0())) {
                i11 = 5;
            } else {
                int i12 = 1 & 4;
                if (this.f111466w3 == 0) {
                    int top = v10.getTop();
                    if (!this.f111429b) {
                        int i13 = this.f111443k3;
                        if (top < i13) {
                            if (top >= Math.abs(top - this.f111447m3)) {
                                if (h1()) {
                                    i11 = 4;
                                } else {
                                    i11 = 6;
                                }
                            }
                        } else if (Math.abs(top - i13) < Math.abs(top - this.f111447m3)) {
                            i11 = 6;
                        } else if (Math.abs(top - this.f111447m3) < Math.abs(top - this.f111449n3)) {
                            i11 = 4;
                        } else {
                            i11 = 7;
                        }
                    } else if (Math.abs(top - this.f111441j3) >= Math.abs(top - this.f111447m3)) {
                        i11 = 4;
                    }
                } else {
                    if (!this.f111429b) {
                        int top2 = v10.getTop();
                        if (Math.abs(top2 - this.f111443k3) < Math.abs(top2 - this.f111447m3)) {
                            i11 = 6;
                        } else if (Math.abs(top2 - this.f111447m3) >= Math.abs(top2 - this.f111449n3)) {
                            i11 = 7;
                        }
                    }
                    i11 = 4;
                }
            }
            j1(v10, i11, false);
            this.f111467x3 = false;
        }
    }

    @Deprecated
    public void K0(e eVar) {
        this.E3.clear();
        if (eVar != null) {
            this.E3.add(eVar);
        }
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean L(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v10, @NonNull MotionEvent motionEvent) {
        if (!v10.isShown()) {
            int i10 = 3 ^ 0;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        int i11 = 4 >> 1;
        if (this.f111459s3 == 1 && actionMasked == 0) {
            return true;
        }
        if (f1()) {
            this.f111462u3.M(motionEvent);
        }
        if (actionMasked == 0) {
            H0();
        }
        if (this.F3 == null) {
            this.F3 = VelocityTracker.obtain();
        }
        this.F3.addMovement(motionEvent);
        if (f1() && actionMasked == 2 && !this.f111464v3 && Math.abs(this.H3 - motionEvent.getY()) > this.f111462u3.E()) {
            this.f111462u3.d(v10, motionEvent.getPointerId(motionEvent.getActionIndex()));
        }
        return !this.f111464v3;
    }

    public void L0(int i10) {
        M0(i10, false);
    }

    public final void M0(int i10, boolean z10) {
        if (this.f111432e != i10) {
            this.f111432e = Math.max(0, i10);
            l1(z10);
        }
    }

    public void N0(boolean z10) {
        this.f111457r3 = z10;
    }

    public void O0(int i10) {
        if (i10 < 0) {
            throw new IllegalArgumentException("offset must be greater than or equal to 0");
        }
        this.f111439i3 = i10;
    }

    public void P0(boolean z10) {
        if (this.f111429b == z10) {
            return;
        }
        this.f111429b = z10;
        if (this.C3 != null) {
            Y();
            b0();
        }
        b1((this.f111429b && this.f111459s3 == 6) ? 3 : this.f111459s3);
        k1();
    }

    public void Q0(boolean z10) {
        this.f111450o = z10;
    }

    public void R0(@x(from = 0.0d, fromInclusive = false, to = 1.0d, toInclusive = false) float f10) {
        if (f10 <= 0.0f || f10 >= 1.0f) {
            throw new IllegalArgumentException("ratio must be a float value between 0 and 1");
        }
        this.f111445l3 = f10;
        if (this.C3 != null) {
            Z();
        }
    }

    public void S0(float f10) {
        this.f111468y3 = f10;
    }

    public void T0(boolean z10) {
        if (this.f111455p3 != z10) {
            this.f111455p3 = z10;
            if (!z10 && this.f111459s3 == 5) {
                g(4);
            }
            k1();
        }
    }

    @b1({b1.a.LIBRARY_GROUP})
    public void U0(boolean z10) {
        this.f111455p3 = z10;
    }

    public void V0(@t0 int i10) {
        this.f111446m = i10;
    }

    public void W(@NonNull e eVar) {
        if (this.E3.contains(eVar)) {
            return;
        }
        this.E3.add(eVar);
    }

    public void W0(@t0 int i10) {
        this.f111444l = i10;
    }

    public void X0(int i10) {
        Y0(i10, false);
    }

    public final void Y0(int i10, boolean z10) {
        if (i10 == -1) {
            if (!this.f111434g) {
                this.f111434g = true;
                o1(z10);
            }
        }
        if (this.f111434g || this.f111433f != i10) {
            this.f111434g = false;
            this.f111433f = Math.max(0, i10);
            o1(z10);
        }
    }

    public void Z0(int i10) {
        this.f111428a = i10;
    }

    public void a1(boolean z10) {
        this.f111456q3 = z10;
    }

    void b1(int i10) {
        V v10;
        if (this.f111459s3 == i10) {
            return;
        }
        this.f111459s3 = i10;
        if (i10 == 4 || i10 == 7 || i10 == 3 || i10 == 6 || (this.f111455p3 && i10 == 5)) {
            this.f111461t3 = i10;
        }
        WeakReference<V> weakReference = this.C3;
        if (weakReference == null || (v10 = weakReference.get()) == null) {
            return;
        }
        if (i10 == 3) {
            n1(true);
        } else if (i10 == 6 || i10 == 5 || i10 == 4) {
            n1(false);
        }
        m1(i10);
        Iterator<e> it = this.E3.iterator();
        while (it.hasNext()) {
            it.next().c(v10, i10);
        }
        k1();
    }

    public void c1(boolean z10) {
        this.f111430c = z10;
    }

    @b1({b1.a.LIBRARY_GROUP})
    public boolean e1(long j10, @x(from = 0.0d, to = i1.f268246o) float f10) {
        return false;
    }

    @l1
    @b1({b1.a.LIBRARY_GROUP})
    public void f0() {
        this.f111437h3 = null;
    }

    public void g(int i10) {
        if (i10 != 1 && i10 != 2) {
            if (this.f111455p3 || i10 != 5) {
                int i11 = (i10 == 6 && this.f111429b && w0(i10) <= this.f111441j3) ? 3 : i10;
                WeakReference<V> weakReference = this.C3;
                if (weakReference == null || weakReference.get() == null) {
                    b1(i10);
                    return;
                } else {
                    V v10 = this.C3.get();
                    J0(v10, new a(v10, i11));
                    return;
                }
            }
            return;
        }
        StringBuilder sb2 = new StringBuilder();
        sb2.append("STATE_");
        sb2.append(i10 == 1 ? "DRAGGING" : "SETTLING");
        sb2.append(" should not be set externally.");
        throw new IllegalArgumentException(sb2.toString());
    }

    public void g0(int i10) {
        V v10;
        float f10;
        float fL0;
        WeakReference<V> weakReference = this.C3;
        if (weakReference == null || (v10 = weakReference.get()) == null || this.E3.isEmpty()) {
            return;
        }
        int i11 = this.f111447m3;
        if (i10 > i11 || i11 == l0()) {
            int i12 = this.f111447m3;
            f10 = i12 - i10;
            fL0 = this.B3 - i12;
        } else {
            int i13 = this.f111447m3;
            f10 = i13 - i10;
            fL0 = i13 - l0();
        }
        float f11 = f10 / fL0;
        Iterator<e> it = this.E3.iterator();
        while (it.hasNext()) {
            it.next().b(v10, f11);
        }
    }

    boolean g1(@NonNull View view, float f10) {
        if (this.f111456q3) {
            return true;
        }
        if (view.getTop() < this.f111447m3) {
            return false;
        }
        return Math.abs((((float) view.getTop()) + (f10 * this.f111468y3)) - ((float) this.f111447m3)) / ((float) X()) > 0.5f;
    }

    public int getState() {
        return this.f111459s3;
    }

    @l1
    @p0
    View h0(View view) {
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
                View viewH0 = h0(viewGroup.getChildAt(i10));
                if (viewH0 != null) {
                    return viewH0;
                }
            }
        }
        return null;
    }

    @b1({b1.a.LIBRARY_GROUP})
    public boolean h1() {
        return false;
    }

    @b1({b1.a.LIBRARY_GROUP})
    public boolean i1() {
        return true;
    }

    public int k0() {
        return this.f111432e;
    }

    public int l0() {
        if (this.f111429b) {
            return this.f111441j3;
        }
        return Math.max(this.f111439i3, this.f111465w ? 0 : this.f111453p1);
    }

    @x(from = 0.0d, to = 1.0d)
    public float m0() {
        return this.f111445l3;
    }

    public float n0() {
        return this.f111468y3;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void o(@NonNull CoordinatorLayout.g gVar) {
        super.o(gVar);
        this.C3 = null;
        this.f111462u3 = null;
    }

    @b1({b1.a.LIBRARY_GROUP})
    public int o0() {
        return this.f111461t3;
    }

    k p0() {
        return this.f111440j;
    }

    @t0
    public int q0() {
        return this.f111446m;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void r() {
        super.r();
        this.C3 = null;
        this.f111462u3 = null;
    }

    @t0
    public int r0() {
        return this.f111444l;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean s(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v10, @NonNull MotionEvent motionEvent) {
        androidx.customview.widget.d dVar;
        if (!v10.isShown() || !this.f111457r3) {
            this.f111464v3 = true;
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            H0();
        }
        if (this.F3 == null) {
            this.F3 = VelocityTracker.obtain();
        }
        this.F3.addMovement(motionEvent);
        if (actionMasked == 0) {
            int x10 = (int) motionEvent.getX();
            this.H3 = (int) motionEvent.getY();
            if (this.f111459s3 != 2) {
                WeakReference<View> weakReference = this.D3;
                View view = weakReference != null ? weakReference.get() : null;
                if (view != null && coordinatorLayout.G(view, x10, this.H3)) {
                    this.G3 = motionEvent.getPointerId(motionEvent.getActionIndex());
                    this.I3 = true;
                }
            }
            this.f111464v3 = this.G3 == -1 && !coordinatorLayout.G(v10, x10, this.H3);
        } else if (actionMasked == 1 || actionMasked == 3) {
            this.I3 = false;
            this.G3 = -1;
            if (this.f111464v3) {
                this.f111464v3 = false;
                return false;
            }
        }
        if (!this.f111464v3 && (dVar = this.f111462u3) != null && dVar.W(motionEvent)) {
            return true;
        }
        WeakReference<View> weakReference2 = this.D3;
        View view2 = weakReference2 != null ? weakReference2.get() : null;
        return (actionMasked != 2 || view2 == null || this.f111464v3 || this.f111459s3 == 1 || coordinatorLayout.G(view2, (int) motionEvent.getX(), (int) motionEvent.getY()) || this.f111462u3 == null || Math.abs(((float) this.H3) - motionEvent.getY()) <= ((float) this.f111462u3.E())) ? false : true;
    }

    public int s0() {
        if (this.f111434g) {
            return -1;
        }
        return this.f111433f;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean t(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v10, int i10) {
        if (u1.W(coordinatorLayout) && !u1.W(v10)) {
            v10.setFitsSystemWindows(true);
        }
        if (this.C3 == null) {
            this.f111436h = coordinatorLayout.getResources().getDimensionPixelSize(r6.a.f.f360180f1);
            d1(v10);
            this.C3 = new WeakReference<>(v10);
            k kVar = this.f111440j;
            if (kVar != null) {
                u1.O1(v10, kVar);
                k kVar2 = this.f111440j;
                float fT = this.f111451o3;
                if (fT == -1.0f) {
                    fT = u1.T(v10);
                }
                kVar2.o0(fT);
                boolean z10 = this.f111459s3 == 3;
                this.f111454p2 = z10;
                this.f111440j.q0(z10 ? 0.0f : 1.0f);
            } else {
                ColorStateList colorStateList = this.f111442k;
                if (colorStateList != null) {
                    u1.P1(v10, colorStateList);
                }
            }
            k1();
            if (u1.X(v10) == 0) {
                u1.Y1(v10, 1);
            }
        }
        if (this.f111462u3 == null) {
            this.f111462u3 = androidx.customview.widget.d.q(coordinatorLayout, this.L3);
        }
        int top = v10.getTop();
        coordinatorLayout.N(v10, i10);
        this.A3 = coordinatorLayout.getWidth();
        this.B3 = coordinatorLayout.getHeight();
        int height = v10.getHeight();
        this.f111469z3 = height;
        int i11 = this.B3;
        int i12 = i11 - height;
        int i13 = this.f111453p1;
        if (i12 < i13) {
            if (this.f111465w) {
                this.f111469z3 = i11;
            } else {
                this.f111469z3 = i11 - i13;
            }
        }
        this.f111441j3 = Math.max(0, i11 - this.f111469z3);
        Z();
        Y();
        b0();
        int i14 = this.f111459s3;
        if (i14 == 3) {
            u1.i1(v10, l0());
        } else if (i14 == 6) {
            u1.i1(v10, this.f111443k3);
        } else if (this.f111455p3 && i14 == 5) {
            u1.i1(v10, this.B3);
        } else if (i14 == 4) {
            u1.i1(v10, this.f111447m3);
        } else if (i14 == 7) {
            u1.i1(v10, this.f111449n3);
        } else if (i14 == 1 || i14 == 2) {
            u1.i1(v10, top - v10.getTop());
        }
        this.D3 = new WeakReference<>(h0(v10));
        Iterator<e> it = this.E3.iterator();
        while (it.hasNext()) {
            it.next().a(v10);
        }
        return true;
    }

    @l1
    int t0() {
        return this.f111436h;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean u(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v10, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) v10.getLayoutParams();
        v10.measure(j0(i10, coordinatorLayout.getPaddingLeft() + coordinatorLayout.getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, this.f111444l, marginLayoutParams.width), j0(i12, coordinatorLayout.getPaddingTop() + coordinatorLayout.getPaddingBottom() + marginLayoutParams.topMargin + marginLayoutParams.bottomMargin + i13, this.f111446m, marginLayoutParams.height));
        return true;
    }

    public int u0() {
        return this.f111428a;
    }

    public boolean v0() {
        return this.f111456q3;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean w(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v10, @NonNull View view, float f10, float f11) {
        WeakReference<View> weakReference;
        return D0() && (weakReference = this.D3) != null && view == weakReference.get() && (this.f111459s3 != 3 || super.w(coordinatorLayout, v10, view, f10, f11));
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public void y(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v10, @NonNull View view, int i10, int i11, @NonNull int[] iArr, int i12) {
        if (i12 == 1) {
            return;
        }
        WeakReference<View> weakReference = this.D3;
        View view2 = weakReference != null ? weakReference.get() : null;
        if (!D0() || view == view2) {
            int top = v10.getTop();
            int i13 = top - i11;
            if (i11 > 0) {
                if (i13 < l0()) {
                    int iL0 = top - l0();
                    iArr[1] = iL0;
                    u1.i1(v10, -iL0);
                    b1(3);
                } else {
                    if (!this.f111457r3) {
                        return;
                    }
                    iArr[1] = i11;
                    u1.i1(v10, -i11);
                    b1(1);
                }
            } else if (i11 < 0 && !view.canScrollVertically(-1)) {
                int i14 = this.f111447m3;
                if (i13 > i14 && !this.f111455p3) {
                    int i15 = top - i14;
                    iArr[1] = i15;
                    u1.i1(v10, -i15);
                    b1(4);
                } else {
                    if (!this.f111457r3) {
                        return;
                    }
                    iArr[1] = i11;
                    u1.i1(v10, -i11);
                    b1(1);
                }
            }
            g0(v10.getTop());
            this.f111466w3 = i11;
            this.f111467x3 = true;
        }
    }

    public boolean y0() {
        return this.f111457r3;
    }

    public boolean z0() {
        return this.f111429b;
    }

    public AdvancedBottomSheetBehavior(@NonNull Context context, @p0 AttributeSet attributeSet) {
        int i10;
        super(context, attributeSet);
        this.f111428a = 0;
        this.f111429b = true;
        this.f111430c = false;
        this.f111444l = -1;
        this.f111446m = -1;
        int i11 = 4 & 0;
        this.f111435g3 = new i();
        this.f111445l3 = 0.5f;
        this.f111451o3 = -1.0f;
        this.f111457r3 = true;
        this.f111459s3 = 4;
        this.f111461t3 = 4;
        this.f111468y3 = 0.1f;
        this.E3 = new ArrayList<>();
        this.K3 = -1;
        this.L3 = new c();
        this.f111438i = context.getResources().getDimensionPixelSize(r6.a.f.Ec);
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, r6.a.o.f361822j5);
        if (typedArrayObtainStyledAttributes.hasValue(r6.a.o.f361918n5)) {
            this.f111442k = y3.p(context, typedArrayObtainStyledAttributes, r6.a.o.f361918n5);
        }
        if (typedArrayObtainStyledAttributes.hasValue(r6.a.o.F5)) {
            this.H1 = p.e(context, attributeSet, r6.a.c.f359417n1, f111427h4).m();
        }
        d0(context);
        e0();
        this.f111451o3 = typedArrayObtainStyledAttributes.getDimension(r6.a.o.f361894m5, -1.0f);
        if (typedArrayObtainStyledAttributes.hasValue(r6.a.o.f361846k5)) {
            W0(typedArrayObtainStyledAttributes.getDimensionPixelSize(r6.a.o.f361846k5, -1));
        }
        if (typedArrayObtainStyledAttributes.hasValue(r6.a.o.f361870l5)) {
            V0(typedArrayObtainStyledAttributes.getDimensionPixelSize(r6.a.o.f361870l5, -1));
        }
        TypedValue typedValuePeekValue = typedArrayObtainStyledAttributes.peekValue(r6.a.o.f362063t5);
        if (typedValuePeekValue != null && (i10 = typedValuePeekValue.data) == -1) {
            X0(i10);
        } else {
            X0(typedArrayObtainStyledAttributes.getDimensionPixelSize(r6.a.o.f362063t5, -1));
        }
        T0(typedArrayObtainStyledAttributes.getBoolean(r6.a.o.f362039s5, false));
        Q0(typedArrayObtainStyledAttributes.getBoolean(r6.a.o.f362159x5, false));
        P0(typedArrayObtainStyledAttributes.getBoolean(r6.a.o.f361990q5, true));
        a1(typedArrayObtainStyledAttributes.getBoolean(r6.a.o.f362135w5, false));
        N0(typedArrayObtainStyledAttributes.getBoolean(r6.a.o.f361942o5, true));
        Z0(typedArrayObtainStyledAttributes.getInt(r6.a.o.f362087u5, 0));
        R0(typedArrayObtainStyledAttributes.getFloat(r6.a.o.f362014r5, 0.5f));
        TypedValue typedValuePeekValue2 = typedArrayObtainStyledAttributes.peekValue(r6.a.o.f361966p5);
        if (typedValuePeekValue2 != null && typedValuePeekValue2.type == 16) {
            O0(typedValuePeekValue2.data);
        } else {
            O0(typedArrayObtainStyledAttributes.getDimensionPixelOffset(r6.a.o.f361966p5, 0));
        }
        this.f111458s = typedArrayObtainStyledAttributes.getBoolean(r6.a.o.B5, false);
        this.f111460t = typedArrayObtainStyledAttributes.getBoolean(r6.a.o.C5, false);
        this.f111463v = typedArrayObtainStyledAttributes.getBoolean(r6.a.o.D5, false);
        this.f111465w = typedArrayObtainStyledAttributes.getBoolean(r6.a.o.E5, true);
        this.X = typedArrayObtainStyledAttributes.getBoolean(r6.a.o.f362183y5, false);
        this.Y = typedArrayObtainStyledAttributes.getBoolean(r6.a.o.f362207z5, false);
        this.Z = typedArrayObtainStyledAttributes.getBoolean(r6.a.o.A5, false);
        typedArrayObtainStyledAttributes.recycle();
        this.f111431d = ViewConfiguration.get(context).getScaledMaximumFlingVelocity();
    }
}

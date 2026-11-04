package androidx.slidingpanelayout.widget;

import android.R;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.accessibility.AccessibilityEvent;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;
import androidx.annotation.l;
import androidx.annotation.p0;
import androidx.annotation.t0;
import androidx.annotation.v;
import androidx.core.view.accessibility.j;
import androidx.core.view.g3;
import androidx.core.view.u1;
import androidx.customview.view.AbsSavedState;
import androidx.window.layout.m;
import androidx.window.layout.t;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/* JADX INFO: loaded from: classes3.dex */
public class SlidingPaneLayout extends ViewGroup implements androidx.customview.widget.c {

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    private static final String f75251k3 = "SlidingPaneLayout";

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    private static final int f75252l3 = 400;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    private static final String f75253m3 = "androidx.slidingpanelayout.widget.SlidingPaneLayout";

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    public static final int f75254n3 = 0;

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    public static final int f75255o3 = 1;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    public static final int f75256p3 = 2;

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    public static final int f75257q3 = 3;

    /* JADX INFO: renamed from: r3, reason: collision with root package name */
    private static boolean f75258r3 = true;
    m H1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f75259a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f75260b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private Drawable f75261c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private Drawable f75262d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private boolean f75263e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    View f75264f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    float f75265g;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    private androidx.slidingpanelayout.widget.a f75266g3;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private float f75267h;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    private Method f75268h3;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    int f75269i;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    private Field f75270i3;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    boolean f75271j;

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    private boolean f75272j3;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f75273k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private float f75274l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private float f75275m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final List<f> f75276n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @p0
    private f f75277o;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    final ArrayList<c> f75278p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private int f75279p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private androidx.slidingpanelayout.widget.a.InterfaceC0750a f75280p2;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    final androidx.customview.widget.d f75281s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    boolean f75282t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f75283v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final Rect f75284w;

    static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f75285c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        int f75286d;

        class a implements Parcelable.ClassLoaderCreator<SavedState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new SavedState(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f75285c ? 1 : 0);
            parcel.writeInt(this.f75286d);
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            this.f75285c = parcel.readInt() != 0;
            this.f75286d = parcel.readInt();
        }
    }

    class a implements androidx.slidingpanelayout.widget.a.InterfaceC0750a {
        a() {
        }

        @Override // androidx.slidingpanelayout.widget.a.InterfaceC0750a
        public void a(@NonNull m mVar) {
            SlidingPaneLayout.this.H1 = mVar;
            androidx.transition.d dVar = new androidx.transition.d();
            dVar.E0(300L);
            dVar.G0(androidx.core.view.animation.b.b(0.2f, 0.0f, 0.0f, 1.0f));
            androidx.transition.p0.b(SlidingPaneLayout.this, dVar);
            SlidingPaneLayout.this.requestLayout();
        }
    }

    class b extends androidx.core.view.a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Rect f75288a = new Rect();

        b() {
        }

        private void c(j jVar, j jVar2) {
            Rect rect = this.f75288a;
            jVar2.t(rect);
            jVar.e1(rect);
            jVar.p2(jVar2.M0());
            jVar.N1(jVar2.S());
            jVar.j1(jVar2.y());
            jVar.o1(jVar2.D());
            jVar.u1(jVar2.x0());
            jVar.k1(jVar2.s0());
            jVar.w1(jVar2.y0());
            jVar.x1(jVar2.z0());
            jVar.a1(jVar2.p0());
            jVar.Y1(jVar2.I0());
            jVar.I1(jVar2.D0());
            jVar.a(jVar2.p());
            jVar.L1(jVar2.Q());
        }

        public boolean d(View view) {
            return SlidingPaneLayout.this.m(view);
        }

        @Override // androidx.core.view.a
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName(SlidingPaneLayout.f75253m3);
        }

        @Override // androidx.core.view.a
        public void onInitializeAccessibilityNodeInfo(View view, j jVar) {
            j jVarQ0 = j.Q0(jVar);
            super.onInitializeAccessibilityNodeInfo(view, jVarQ0);
            c(jVar, jVarQ0);
            jVarQ0.T0();
            jVar.j1(SlidingPaneLayout.f75253m3);
            jVar.a2(view);
            Object objO0 = u1.o0(view);
            if (objO0 instanceof View) {
                jVar.P1((View) objO0);
            }
            int childCount = SlidingPaneLayout.this.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                View childAt = SlidingPaneLayout.this.getChildAt(i10);
                if (!d(childAt) && childAt.getVisibility() == 0) {
                    int i11 = 1 << 1;
                    u1.Y1(childAt, 1);
                    jVar.c(childAt);
                }
            }
        }

        @Override // androidx.core.view.a
        public boolean onRequestSendAccessibilityEvent(ViewGroup viewGroup, View view, AccessibilityEvent accessibilityEvent) {
            if (d(view)) {
                return false;
            }
            return super.onRequestSendAccessibilityEvent(viewGroup, view, accessibilityEvent);
        }
    }

    private class c implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final View f75290a;

        c(View view) {
            this.f75290a = view;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f75290a.getParent() == SlidingPaneLayout.this) {
                this.f75290a.setLayerType(0, null);
                SlidingPaneLayout.this.l(this.f75290a);
            }
            SlidingPaneLayout.this.f75278p0.remove(this);
        }
    }

    private class d extends androidx.customview.widget.d.c {
        d() {
        }

        private boolean n() {
            SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
            if (!slidingPaneLayout.f75271j && slidingPaneLayout.getLockMode() != 3) {
                if (SlidingPaneLayout.this.isOpen() && SlidingPaneLayout.this.getLockMode() == 1) {
                    return false;
                }
                return SlidingPaneLayout.this.isOpen() || SlidingPaneLayout.this.getLockMode() != 2;
            }
            return false;
        }

        @Override // androidx.customview.widget.d.c
        public int a(View view, int i10, int i11) {
            e eVar = (e) SlidingPaneLayout.this.f75264f.getLayoutParams();
            if (SlidingPaneLayout.this.n()) {
                int width = SlidingPaneLayout.this.getWidth() - ((SlidingPaneLayout.this.getPaddingRight() + ((ViewGroup.MarginLayoutParams) eVar).rightMargin) + SlidingPaneLayout.this.f75264f.getWidth());
                return Math.max(Math.min(i10, width), width - SlidingPaneLayout.this.f75269i);
            }
            int paddingLeft = SlidingPaneLayout.this.getPaddingLeft() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin;
            return Math.min(Math.max(i10, paddingLeft), SlidingPaneLayout.this.f75269i + paddingLeft);
        }

        @Override // androidx.customview.widget.d.c
        public int b(View view, int i10, int i11) {
            return view.getTop();
        }

        @Override // androidx.customview.widget.d.c
        public int d(View view) {
            return SlidingPaneLayout.this.f75269i;
        }

        @Override // androidx.customview.widget.d.c
        public void f(int i10, int i11) {
            if (n()) {
                SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
                slidingPaneLayout.f75281s.d(slidingPaneLayout.f75264f, i11);
            }
        }

        @Override // androidx.customview.widget.d.c
        public void h(int i10, int i11) {
            if (n()) {
                SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
                slidingPaneLayout.f75281s.d(slidingPaneLayout.f75264f, i11);
            }
        }

        @Override // androidx.customview.widget.d.c
        public void i(View view, int i10) {
            SlidingPaneLayout.this.v();
        }

        @Override // androidx.customview.widget.d.c
        public void j(int i10) {
            if (SlidingPaneLayout.this.f75281s.F() == 0) {
                SlidingPaneLayout slidingPaneLayout = SlidingPaneLayout.this;
                if (slidingPaneLayout.f75265g != 1.0f) {
                    slidingPaneLayout.g(slidingPaneLayout.f75264f);
                    SlidingPaneLayout.this.f75282t = true;
                } else {
                    slidingPaneLayout.A(slidingPaneLayout.f75264f);
                    SlidingPaneLayout slidingPaneLayout2 = SlidingPaneLayout.this;
                    slidingPaneLayout2.f(slidingPaneLayout2.f75264f);
                    SlidingPaneLayout.this.f75282t = false;
                }
            }
        }

        @Override // androidx.customview.widget.d.c
        public void k(View view, int i10, int i11, int i12, int i13) {
            SlidingPaneLayout.this.q(i10);
            SlidingPaneLayout.this.invalidate();
        }

        @Override // androidx.customview.widget.d.c
        public void l(View view, float f10, float f11) {
            int paddingLeft;
            e eVar = (e) view.getLayoutParams();
            if (SlidingPaneLayout.this.n()) {
                int paddingRight = SlidingPaneLayout.this.getPaddingRight() + ((ViewGroup.MarginLayoutParams) eVar).rightMargin;
                if (f10 < 0.0f || (f10 == 0.0f && SlidingPaneLayout.this.f75265g > 0.5f)) {
                    paddingRight += SlidingPaneLayout.this.f75269i;
                }
                paddingLeft = (SlidingPaneLayout.this.getWidth() - paddingRight) - SlidingPaneLayout.this.f75264f.getWidth();
            } else {
                paddingLeft = ((ViewGroup.MarginLayoutParams) eVar).leftMargin + SlidingPaneLayout.this.getPaddingLeft();
                if (f10 > 0.0f || (f10 == 0.0f && SlidingPaneLayout.this.f75265g > 0.5f)) {
                    paddingLeft += SlidingPaneLayout.this.f75269i;
                }
            }
            SlidingPaneLayout.this.f75281s.V(paddingLeft, view.getTop());
            SlidingPaneLayout.this.invalidate();
        }

        @Override // androidx.customview.widget.d.c
        public boolean m(View view, int i10) {
            if (n()) {
                return ((e) view.getLayoutParams()).f75295b;
            }
            return false;
        }
    }

    public interface f {
        void a(@NonNull View view);

        void b(@NonNull View view);

        void c(@NonNull View view, float f10);
    }

    public static class g implements f {
        @Override // androidx.slidingpanelayout.widget.SlidingPaneLayout.f
        public void a(@NonNull View view) {
        }

        @Override // androidx.slidingpanelayout.widget.SlidingPaneLayout.f
        public void b(@NonNull View view) {
        }

        @Override // androidx.slidingpanelayout.widget.SlidingPaneLayout.f
        public void c(@NonNull View view, float f10) {
        }
    }

    private static class h extends FrameLayout {
        h(View view) {
            super(view.getContext());
            addView(view);
        }

        @Override // android.view.View
        public boolean onGenericMotionEvent(MotionEvent motionEvent) {
            return true;
        }

        @Override // android.view.View
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return true;
        }
    }

    public SlidingPaneLayout(@NonNull Context context) {
        this(context, null);
    }

    private static boolean B(View view) {
        return view.isOpaque();
    }

    private boolean e(int i10) {
        if (!this.f75263e) {
            this.f75282t = false;
        }
        if (!this.f75283v && !y(1.0f, i10)) {
            return false;
        }
        this.f75282t = false;
        return true;
    }

    private androidx.core.graphics.j getSystemGestureInsets() {
        g3 g3VarR0;
        if (!f75258r3 || (g3VarR0 = u1.r0(this)) == null) {
            return null;
        }
        return g3VarR0.n();
    }

    @p0
    private static Activity i(Context context) {
        while (context instanceof ContextWrapper) {
            if (context instanceof Activity) {
                return (Activity) context;
            }
            context = ((ContextWrapper) context).getBaseContext();
        }
        return null;
    }

    private static Rect j(@NonNull m mVar, View view) {
        int[] iArr = new int[2];
        view.getLocationInWindow(iArr);
        int i10 = iArr[0];
        Rect rect = new Rect(i10, iArr[1], view.getWidth() + i10, iArr[1] + view.getWidth());
        Rect rect2 = new Rect(mVar.getBounds());
        boolean zIntersect = rect2.intersect(rect);
        if ((rect2.width() == 0 && rect2.height() == 0) || !zIntersect) {
            return null;
        }
        rect2.offset(-iArr[0], -iArr[1]);
        return rect2;
    }

    private static int k(View view) {
        return view instanceof h ? u1.i0(((h) view).getChildAt(0)) : u1.i0(view);
    }

    private static int p(@NonNull View view, int i10, int i11) {
        e eVar = (e) view.getLayoutParams();
        return (((ViewGroup.MarginLayoutParams) eVar).width != 0 || eVar.f75294a <= 0.0f) ? View.MeasureSpec.makeMeasureSpec(view.getMeasuredHeight(), 1073741824) : ViewGroup.getChildMeasureSpec(i10, i11, ((ViewGroup.MarginLayoutParams) eVar).height);
    }

    private boolean s(int i10) {
        if (!this.f75263e) {
            this.f75282t = true;
        }
        if (!this.f75283v && !y(0.0f, i10)) {
            return false;
        }
        this.f75282t = true;
        return true;
    }

    private void setFoldingFeatureObserver(androidx.slidingpanelayout.widget.a aVar) {
        this.f75266g3 = aVar;
        aVar.f(this.f75280p2);
    }

    private void t(float f10) {
        boolean zN = n();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt != this.f75264f) {
                float f11 = 1.0f - this.f75267h;
                int i11 = this.f75273k;
                this.f75267h = f10;
                int i12 = ((int) (f11 * i11)) - ((int) ((1.0f - f10) * i11));
                if (zN) {
                    i12 = -i12;
                }
                childAt.offsetLeftAndRight(i12);
            }
        }
    }

    private ArrayList<Rect> z() {
        m mVar = this.H1;
        if (mVar != null && mVar.a()) {
            if (this.H1.getBounds().left == 0) {
                return null;
            }
            if (this.H1.getBounds().top == 0) {
                Rect rectJ = j(this.H1, this);
                if (rectJ == null) {
                    return null;
                }
                Rect rect = new Rect(getPaddingLeft(), getPaddingTop(), Math.max(getPaddingLeft(), rectJ.left), getHeight() - getPaddingBottom());
                int width = getWidth() - getPaddingRight();
                return new ArrayList<>(Arrays.asList(rect, new Rect(Math.min(width, rectJ.right), getPaddingTop(), width, getHeight() - getPaddingBottom())));
            }
        }
        return null;
    }

    void A(View view) {
        int left;
        int right;
        int top;
        int bottom;
        View view2 = view;
        boolean zN = n();
        int width = zN ? getWidth() - getPaddingRight() : getPaddingLeft();
        int paddingLeft = zN ? getPaddingLeft() : getWidth() - getPaddingRight();
        int paddingTop = getPaddingTop();
        int height = getHeight() - getPaddingBottom();
        if (view2 == null || !B(view2)) {
            left = 0;
            right = 0;
            top = 0;
            bottom = 0;
        } else {
            left = view2.getLeft();
            right = view2.getRight();
            top = view2.getTop();
            bottom = view2.getBottom();
        }
        int childCount = getChildCount();
        int i10 = 0;
        while (i10 < childCount) {
            View childAt = getChildAt(i10);
            if (childAt == view2) {
                return;
            }
            if (childAt.getVisibility() != 8) {
                childAt.setVisibility((Math.max(zN ? paddingLeft : width, childAt.getLeft()) < left || Math.max(paddingTop, childAt.getTop()) < top || Math.min(zN ? width : paddingLeft, childAt.getRight()) > right || Math.min(height, childAt.getBottom()) > bottom) ? 0 : 4);
            }
            i10++;
            view2 = view;
            zN = zN;
        }
    }

    public void a(@NonNull f fVar) {
        this.f75276n.add(fVar);
    }

    @Override // android.view.ViewGroup
    public void addView(@NonNull View view, int i10, @p0 ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() == 1) {
            super.addView(new h(view), i10, layoutParams);
        } else {
            super.addView(view, i10, layoutParams);
        }
    }

    protected boolean b(View view, boolean z10, int i10, int i11, int i12) {
        int i13;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i14 = i11 + scrollX;
                if (i14 >= childAt.getLeft() && i14 < childAt.getRight() && (i13 = i12 + scrollY) >= childAt.getTop() && i13 < childAt.getBottom() && b(childAt, true, i10, i14 - childAt.getLeft(), i13 - childAt.getTop())) {
                    return true;
                }
            }
        }
        if (!z10) {
            return false;
        }
        if (!n()) {
            i10 = -i10;
        }
        return view.canScrollHorizontally(i10);
    }

    @Deprecated
    public boolean c() {
        return this.f75263e;
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (!(layoutParams instanceof e) || !super.checkLayoutParams(layoutParams)) {
            return false;
        }
        int i10 = 2 | 1;
        return true;
    }

    @Override // androidx.customview.widget.c
    public void close() {
        d();
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.f75281s.o(true)) {
            if (this.f75263e) {
                u1.s1(this);
            } else {
                this.f75281s.a();
            }
        }
    }

    public boolean d() {
        return e(0);
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        int i10;
        int right;
        super.draw(canvas);
        Drawable drawable = n() ? this.f75262d : this.f75261c;
        View childAt = getChildCount() > 1 ? getChildAt(1) : null;
        if (childAt == null || drawable == null) {
            return;
        }
        int top = childAt.getTop();
        int bottom = childAt.getBottom();
        int intrinsicWidth = drawable.getIntrinsicWidth();
        if (n()) {
            right = childAt.getRight();
            i10 = intrinsicWidth + right;
        } else {
            int left = childAt.getLeft();
            int i11 = left - intrinsicWidth;
            i10 = left;
            right = i11;
        }
        drawable.setBounds(right, top, i10, bottom);
        drawable.draw(canvas);
    }

    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j10) {
        if (n() ^ isOpen()) {
            this.f75281s.T(1);
            androidx.core.graphics.j systemGestureInsets = getSystemGestureInsets();
            if (systemGestureInsets != null) {
                androidx.customview.widget.d dVar = this.f75281s;
                dVar.S(Math.max(dVar.A(), systemGestureInsets.f47823a));
            }
        } else {
            this.f75281s.T(2);
            androidx.core.graphics.j systemGestureInsets2 = getSystemGestureInsets();
            if (systemGestureInsets2 != null) {
                androidx.customview.widget.d dVar2 = this.f75281s;
                dVar2.S(Math.max(dVar2.A(), systemGestureInsets2.f47825c));
            }
        }
        e eVar = (e) view.getLayoutParams();
        int iSave = canvas.save();
        if (this.f75263e && !eVar.f75295b && this.f75264f != null) {
            canvas.getClipBounds(this.f75284w);
            if (n()) {
                Rect rect = this.f75284w;
                rect.left = Math.max(rect.left, this.f75264f.getRight());
            } else {
                Rect rect2 = this.f75284w;
                rect2.right = Math.min(rect2.right, this.f75264f.getLeft());
            }
            canvas.clipRect(this.f75284w);
        }
        boolean zDrawChild = super.drawChild(canvas, view, j10);
        canvas.restoreToCount(iSave);
        return zDrawChild;
    }

    void f(@NonNull View view) {
        Iterator<f> it = this.f75276n.iterator();
        while (it.hasNext()) {
            it.next().b(view);
        }
        sendAccessibilityEvent(32);
    }

    void g(@NonNull View view) {
        Iterator<f> it = this.f75276n.iterator();
        while (it.hasNext()) {
            it.next().a(view);
        }
        sendAccessibilityEvent(32);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new e();
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new e((ViewGroup.MarginLayoutParams) layoutParams) : new e(layoutParams);
    }

    @l
    @Deprecated
    public int getCoveredFadeColor() {
        return this.f75260b;
    }

    public final int getLockMode() {
        return this.f75279p1;
    }

    @t0
    public int getParallaxDistance() {
        return this.f75273k;
    }

    @l
    @Deprecated
    public int getSliderFadeColor() {
        return this.f75259a;
    }

    void h(@NonNull View view) {
        Iterator<f> it = this.f75276n.iterator();
        while (it.hasNext()) {
            it.next().c(view, this.f75265g);
        }
    }

    @Override // androidx.customview.widget.c
    public boolean isOpen() {
        if (this.f75263e && this.f75265g != 0.0f) {
            return false;
        }
        return true;
    }

    void l(View view) {
        u1.e2(view, ((e) view.getLayoutParams()).f75297d);
    }

    boolean m(View view) {
        if (view == null) {
            return false;
        }
        return this.f75263e && ((e) view.getLayoutParams()).f75296c && this.f75265g > 0.0f;
    }

    boolean n() {
        return u1.c0(this) == 1;
    }

    public boolean o() {
        return this.f75263e;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        Activity activityI;
        super.onAttachedToWindow();
        this.f75283v = true;
        if (this.f75266g3 == null || (activityI = i(getContext())) == null) {
            return;
        }
        this.f75266g3.e(activityI);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        this.f75283v = true;
        androidx.slidingpanelayout.widget.a aVar = this.f75266g3;
        if (aVar != null) {
            aVar.g();
        }
        int size = this.f75278p0.size();
        for (int i10 = 0; i10 < size; i10++) {
            this.f75278p0.get(i10).run();
        }
        this.f75278p0.clear();
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        boolean z10;
        View childAt;
        int actionMasked = motionEvent.getActionMasked();
        int i10 = 6 & 1;
        if (!this.f75263e && actionMasked == 0 && getChildCount() > 1 && (childAt = getChildAt(1)) != null) {
            this.f75282t = this.f75281s.L(childAt, (int) motionEvent.getX(), (int) motionEvent.getY());
        }
        if (this.f75263e && (!this.f75271j || actionMasked == 0)) {
            if (actionMasked == 3 || actionMasked == 1) {
                this.f75281s.c();
                return false;
            }
            if (actionMasked == 0) {
                this.f75271j = false;
                float x10 = motionEvent.getX();
                float y10 = motionEvent.getY();
                this.f75274l = x10;
                this.f75275m = y10;
                if (this.f75281s.L(this.f75264f, (int) x10, (int) y10) && m(this.f75264f)) {
                    z10 = true;
                }
                return !this.f75281s.W(motionEvent) || z10;
            }
            if (actionMasked == 2) {
                float x11 = motionEvent.getX();
                float y11 = motionEvent.getY();
                float fAbs = Math.abs(x11 - this.f75274l);
                float fAbs2 = Math.abs(y11 - this.f75275m);
                if (fAbs > this.f75281s.E() && fAbs2 > fAbs) {
                    this.f75281s.c();
                    this.f75271j = true;
                    return false;
                }
            }
            z10 = false;
            if (this.f75281s.W(motionEvent)) {
            }
        }
        this.f75281s.c();
        return super.onInterceptTouchEvent(motionEvent);
    }

    /* JADX WARN: Code duplicated, block: B:42:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:43:0x00af  */
    /* JADX WARN: Code duplicated, block: B:51:0x00da  */
    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int i14;
        int i15;
        int i16;
        int i17;
        m mVar;
        int iWidth;
        boolean zN = n();
        int i18 = i12 - i10;
        int paddingRight = zN ? getPaddingRight() : getPaddingLeft();
        int paddingLeft = zN ? getPaddingLeft() : getPaddingRight();
        int paddingTop = getPaddingTop();
        int childCount = getChildCount();
        if (this.f75283v) {
            this.f75265g = (this.f75263e && this.f75282t) ? 0.0f : 1.0f;
        }
        int i19 = paddingRight;
        for (int i20 = 0; i20 < childCount; i20++) {
            View childAt = getChildAt(i20);
            if (childAt.getVisibility() != 8) {
                e eVar = (e) childAt.getLayoutParams();
                int measuredWidth = childAt.getMeasuredWidth();
                if (eVar.f75295b) {
                    int i21 = i18 - paddingLeft;
                    int iMin = (Math.min(paddingRight, i21) - i19) - (((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin);
                    this.f75269i = iMin;
                    int i22 = zN ? ((ViewGroup.MarginLayoutParams) eVar).rightMargin : ((ViewGroup.MarginLayoutParams) eVar).leftMargin;
                    eVar.f75296c = ((i19 + i22) + iMin) + (measuredWidth / 2) > i21;
                    int i23 = (int) (iMin * this.f75265g);
                    i19 += i22 + i23;
                    this.f75265g = i23 / iMin;
                } else {
                    if (!this.f75263e || (i14 = this.f75273k) == 0) {
                        i19 = paddingRight;
                    } else {
                        i15 = (int) ((1.0f - this.f75265g) * i14);
                        i19 = paddingRight;
                    }
                    if (zN) {
                        i17 = (i18 - i19) + i15;
                        i16 = i17 - measuredWidth;
                    } else {
                        i16 = i19 - i15;
                        i17 = i16 + measuredWidth;
                    }
                    childAt.layout(i16, paddingTop, i17, childAt.getMeasuredHeight() + paddingTop);
                    mVar = this.H1;
                    if (mVar == null && mVar.getOrientation() == m.b.f76396c && this.H1.a()) {
                        iWidth = this.H1.getBounds().width();
                    } else {
                        iWidth = 0;
                    }
                    paddingRight += childAt.getWidth() + Math.abs(iWidth);
                }
                i15 = 0;
                if (zN) {
                    i17 = (i18 - i19) + i15;
                    i16 = i17 - measuredWidth;
                } else {
                    i16 = i19 - i15;
                    i17 = i16 + measuredWidth;
                }
                childAt.layout(i16, paddingTop, i17, childAt.getMeasuredHeight() + paddingTop);
                mVar = this.H1;
                if (mVar == null) {
                    iWidth = 0;
                } else {
                    iWidth = 0;
                }
                paddingRight += childAt.getWidth() + Math.abs(iWidth);
            }
        }
        if (this.f75283v) {
            if (this.f75263e && this.f75273k != 0) {
                t(this.f75265g);
            }
            A(this.f75264f);
        }
        this.f75283v = false;
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        int paddingTop;
        int iMin;
        int i12;
        int iMax;
        int iMakeMeasureSpec;
        int i13;
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        if (mode2 != Integer.MIN_VALUE) {
            iMin = mode2 != 1073741824 ? 0 : (size2 - getPaddingTop()) - getPaddingBottom();
            paddingTop = iMin;
        } else {
            paddingTop = (size2 - getPaddingTop()) - getPaddingBottom();
            iMin = 0;
        }
        int iMax2 = Math.max((size - getPaddingLeft()) - getPaddingRight(), 0);
        int childCount = getChildCount();
        this.f75264f = null;
        int i14 = 0;
        boolean z10 = false;
        int i15 = iMax2;
        float f10 = 0.0f;
        while (true) {
            i12 = 8;
            if (i14 >= childCount) {
                break;
            }
            View childAt = getChildAt(i14);
            e eVar = (e) childAt.getLayoutParams();
            int i16 = iMax2;
            if (childAt.getVisibility() == 8) {
                eVar.f75296c = false;
            } else {
                float f11 = eVar.f75294a;
                if (f11 > 0.0f) {
                    f10 += f11;
                    if (((ViewGroup.MarginLayoutParams) eVar).width == 0) {
                    }
                    i14 = i13 + 1;
                    iMax2 = i16;
                }
                int iMax3 = Math.max(i16 - (((ViewGroup.MarginLayoutParams) eVar).leftMargin + ((ViewGroup.MarginLayoutParams) eVar).rightMargin), 0);
                int i17 = ((ViewGroup.MarginLayoutParams) eVar).width;
                i13 = i14;
                childAt.measure(i17 == -2 ? View.MeasureSpec.makeMeasureSpec(iMax3, mode == 0 ? mode : Integer.MIN_VALUE) : i17 == -1 ? View.MeasureSpec.makeMeasureSpec(iMax3, mode) : View.MeasureSpec.makeMeasureSpec(i17, 1073741824), ViewGroup.getChildMeasureSpec(i11, getPaddingTop() + getPaddingBottom(), ((ViewGroup.MarginLayoutParams) eVar).height));
                int measuredWidth = childAt.getMeasuredWidth();
                int measuredHeight = childAt.getMeasuredHeight();
                if (measuredHeight > iMin) {
                    if (mode2 == Integer.MIN_VALUE) {
                        iMin = Math.min(measuredHeight, paddingTop);
                    } else if (mode2 == 0) {
                        iMin = measuredHeight;
                    }
                }
                i15 -= measuredWidth;
                if (i13 != 0) {
                    boolean z11 = i15 < 0;
                    eVar.f75295b = z11;
                    z10 |= z11;
                    if (z11) {
                        this.f75264f = childAt;
                    }
                }
                i14 = i13 + 1;
                iMax2 = i16;
            }
            i13 = i14;
            i14 = i13 + 1;
            iMax2 = i16;
        }
        int i18 = iMax2;
        if (z10 || f10 > 0.0f) {
            int i19 = 0;
            while (i19 < childCount) {
                View childAt2 = getChildAt(i19);
                if (childAt2.getVisibility() != i12) {
                    e eVar2 = (e) childAt2.getLayoutParams();
                    int measuredWidth2 = (((ViewGroup.MarginLayoutParams) eVar2).width != 0 || eVar2.f75294a <= 0.0f) ? childAt2.getMeasuredWidth() : 0;
                    if (z10) {
                        iMax = i18 - (((ViewGroup.MarginLayoutParams) eVar2).leftMargin + ((ViewGroup.MarginLayoutParams) eVar2).rightMargin);
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
                    } else if (eVar2.f75294a > 0.0f) {
                        iMax = ((int) ((eVar2.f75294a * Math.max(0, i15)) / f10)) + measuredWidth2;
                        iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(iMax, 1073741824);
                    } else {
                        iMax = measuredWidth2;
                        iMakeMeasureSpec = 0;
                    }
                    int iP = p(childAt2, i11, getPaddingTop() + getPaddingBottom());
                    if (measuredWidth2 != iMax) {
                        childAt2.measure(iMakeMeasureSpec, iP);
                        int measuredHeight2 = childAt2.getMeasuredHeight();
                        if (measuredHeight2 > iMin) {
                            if (mode2 == Integer.MIN_VALUE) {
                                iMin = Math.min(measuredHeight2, paddingTop);
                            } else if (mode2 == 0) {
                                iMin = measuredHeight2;
                            }
                        }
                    }
                }
                i19++;
                i12 = 8;
            }
        }
        ArrayList<Rect> arrayListZ = z();
        if (arrayListZ != null && !z10) {
            for (int i20 = 0; i20 < childCount; i20++) {
                View childAt3 = getChildAt(i20);
                if (childAt3.getVisibility() != 8) {
                    Rect rect = arrayListZ.get(i20);
                    e eVar3 = (e) childAt3.getLayoutParams();
                    int i21 = ((ViewGroup.MarginLayoutParams) eVar3).leftMargin + ((ViewGroup.MarginLayoutParams) eVar3).rightMargin;
                    int iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(childAt3.getMeasuredHeight(), 1073741824);
                    childAt3.measure(View.MeasureSpec.makeMeasureSpec(rect.width(), Integer.MIN_VALUE), iMakeMeasureSpec2);
                    if ((childAt3.getMeasuredWidthAndState() & 16777216) == 1 || (k(childAt3) != 0 && rect.width() < k(childAt3))) {
                        childAt3.measure(View.MeasureSpec.makeMeasureSpec(i18 - i21, 1073741824), iMakeMeasureSpec2);
                        if (i20 != 0) {
                            eVar3.f75295b = true;
                            this.f75264f = childAt3;
                            z10 = true;
                        }
                    } else {
                        childAt3.measure(View.MeasureSpec.makeMeasureSpec(rect.width(), 1073741824), iMakeMeasureSpec2);
                    }
                }
            }
        }
        setMeasuredDimension(size, iMin + getPaddingTop() + getPaddingBottom());
        this.f75263e = z10;
        if (this.f75281s.F() == 0 || z10) {
            return;
        }
        this.f75281s.a();
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        if (savedState.f75285c) {
            r();
        } else {
            d();
        }
        this.f75282t = savedState.f75285c;
        setLockMode(savedState.f75286d);
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f75285c = o() ? isOpen() : this.f75282t;
        savedState.f75286d = this.f75279p1;
        return savedState;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 != i12) {
            this.f75283v = true;
        }
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (!this.f75263e) {
            return super.onTouchEvent(motionEvent);
        }
        this.f75281s.M(motionEvent);
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            float x10 = motionEvent.getX();
            float y10 = motionEvent.getY();
            this.f75274l = x10;
            this.f75275m = y10;
            return true;
        }
        if (actionMasked == 1 && m(this.f75264f)) {
            float x11 = motionEvent.getX();
            float y11 = motionEvent.getY();
            float f10 = x11 - this.f75274l;
            float f11 = y11 - this.f75275m;
            int iE = this.f75281s.E();
            if ((f10 * f10) + (f11 * f11) < iE * iE && this.f75281s.L(this.f75264f, (int) x11, (int) y11)) {
                e(0);
            }
        }
        return true;
    }

    @Override // androidx.customview.widget.c
    public void open() {
        r();
    }

    void q(int i10) {
        if (this.f75264f == null) {
            this.f75265g = 0.0f;
            return;
        }
        boolean zN = n();
        e eVar = (e) this.f75264f.getLayoutParams();
        int width = this.f75264f.getWidth();
        if (zN) {
            i10 = (getWidth() - i10) - width;
        }
        float paddingRight = (i10 - ((zN ? getPaddingRight() : getPaddingLeft()) + (zN ? ((ViewGroup.MarginLayoutParams) eVar).rightMargin : ((ViewGroup.MarginLayoutParams) eVar).leftMargin))) / this.f75269i;
        this.f75265g = paddingRight;
        if (this.f75273k != 0) {
            t(paddingRight);
        }
        h(this.f75264f);
    }

    public boolean r() {
        return s(0);
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(@NonNull View view) {
        if (view.getParent() instanceof h) {
            super.removeView((View) view.getParent());
        } else {
            super.removeView(view);
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        super.requestChildFocus(view, view2);
        if (isInTouchMode() || this.f75263e) {
            return;
        }
        this.f75282t = view == this.f75264f;
    }

    @Deprecated
    public void setCoveredFadeColor(@l int i10) {
        this.f75260b = i10;
    }

    public final void setLockMode(int i10) {
        this.f75279p1 = i10;
    }

    @Deprecated
    public void setPanelSlideListener(@p0 f fVar) {
        f fVar2 = this.f75277o;
        if (fVar2 != null) {
            u(fVar2);
        }
        if (fVar != null) {
            a(fVar);
        }
        this.f75277o = fVar;
    }

    public void setParallaxDistance(@t0 int i10) {
        this.f75273k = i10;
        requestLayout();
    }

    @Deprecated
    public void setShadowDrawable(Drawable drawable) {
        setShadowDrawableLeft(drawable);
    }

    public void setShadowDrawableLeft(@p0 Drawable drawable) {
        this.f75261c = drawable;
    }

    public void setShadowDrawableRight(@p0 Drawable drawable) {
        this.f75262d = drawable;
    }

    @Deprecated
    public void setShadowResource(@v int i10) {
        setShadowDrawableLeft(getResources().getDrawable(i10));
    }

    public void setShadowResourceLeft(int i10) {
        setShadowDrawableLeft(androidx.core.content.d.l(getContext(), i10));
    }

    public void setShadowResourceRight(int i10) {
        setShadowDrawableRight(androidx.core.content.d.l(getContext(), i10));
    }

    @Deprecated
    public void setSliderFadeColor(@l int i10) {
        this.f75259a = i10;
    }

    public void u(@NonNull f fVar) {
        this.f75276n.remove(fVar);
    }

    void v() {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 4) {
                childAt.setVisibility(0);
            }
        }
    }

    @Deprecated
    public void w() {
        d();
    }

    @Deprecated
    public void x() {
        r();
    }

    boolean y(float f10, int i10) {
        int paddingLeft;
        if (!this.f75263e) {
            return false;
        }
        boolean zN = n();
        e eVar = (e) this.f75264f.getLayoutParams();
        if (zN) {
            paddingLeft = (int) (getWidth() - (((getPaddingRight() + ((ViewGroup.MarginLayoutParams) eVar).rightMargin) + (f10 * this.f75269i)) + this.f75264f.getWidth()));
        } else {
            paddingLeft = (int) (getPaddingLeft() + ((ViewGroup.MarginLayoutParams) eVar).leftMargin + (f10 * this.f75269i));
        }
        androidx.customview.widget.d dVar = this.f75281s;
        View view = this.f75264f;
        if (!dVar.X(view, paddingLeft, view.getTop())) {
            return false;
        }
        v();
        u1.s1(this);
        return true;
    }

    public static class e extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private static final int[] f75293e = {R.attr.layout_weight};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public float f75294a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f75295b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f75296c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Paint f75297d;

        public e() {
            super(-1, -1);
            int i10 = (-1) << 0;
            this.f75294a = 0.0f;
        }

        public e(int i10, int i11) {
            super(i10, i11);
            this.f75294a = 0.0f;
        }

        public e(@NonNull ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f75294a = 0.0f;
        }

        public e(@NonNull ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f75294a = 0.0f;
        }

        public e(@NonNull e eVar) {
            super((ViewGroup.MarginLayoutParams) eVar);
            this.f75294a = 0.0f;
            this.f75294a = eVar.f75294a;
        }

        public e(@NonNull Context context, @p0 AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f75294a = 0.0f;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f75293e);
            this.f75294a = typedArrayObtainStyledAttributes.getFloat(0, 0.0f);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    public SlidingPaneLayout(@NonNull Context context, @p0 AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public SlidingPaneLayout(@NonNull Context context, @p0 AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f75259a = 0;
        this.f75265g = 1.0f;
        this.f75276n = new CopyOnWriteArrayList();
        this.f75283v = true;
        this.f75284w = new Rect();
        this.f75278p0 = new ArrayList<>();
        this.f75280p2 = new a();
        float f10 = context.getResources().getDisplayMetrics().density;
        setWillNotDraw(false);
        u1.G1(this, new b());
        u1.Y1(this, 1);
        androidx.customview.widget.d dVarP = androidx.customview.widget.d.p(this, 0.5f, new d());
        this.f75281s = dVarP;
        dVarP.U(f10 * 400.0f);
        setFoldingFeatureObserver(new androidx.slidingpanelayout.widget.a(t.b(context), androidx.core.content.d.o(context)));
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new e(getContext(), attributeSet);
    }
}

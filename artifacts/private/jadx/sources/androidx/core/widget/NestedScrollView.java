package androidx.core.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.TypedValue;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.AnimationUtils;
import android.widget.EdgeEffect;
import android.widget.FrameLayout;
import android.widget.OverScroller;
import android.widget.ScrollView;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.l1;
import androidx.annotation.p0;
import androidx.core.view.ScrollingView;
import androidx.core.view.a1;
import androidx.core.view.s0;
import androidx.core.view.u0;
import androidx.core.view.u1;
import androidx.core.view.w0;
import androidx.core.view.y0;
import java.util.ArrayList;

/* JADX INFO: loaded from: classes2.dex */
public class NestedScrollView extends FrameLayout implements y0, u0, ScrollingView {

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    static final int f49037m3 = 250;

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    static final float f49038n3 = 0.5f;

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    private static final String f49039o3 = "NestedScrollView";

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    private static final int f49040p3 = 250;

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    private static final float f49041q3 = 0.015f;

    /* JADX INFO: renamed from: r3, reason: collision with root package name */
    private static final float f49042r3 = 0.35f;

    /* JADX INFO: renamed from: t3, reason: collision with root package name */
    private static final float f49044t3 = 4.0f;

    /* JADX INFO: renamed from: u3, reason: collision with root package name */
    private static final int f49045u3 = -1;
    private int H1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f49048a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private long f49049b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final Rect f49050c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private OverScroller f49051d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NonNull
    @l1
    @b1({b1.a.LIBRARY})
    public EdgeEffect f49052e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NonNull
    @l1
    @b1({b1.a.LIBRARY})
    public EdgeEffect f49053f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f49054g;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    private final a1 f49055g3;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f49056h;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    private final w0 f49057h3;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f49058i;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    private float f49059i3;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private View f49060j;

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    private e f49061j3;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f49062k;

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    @l1
    final d f49063k3;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private VelocityTracker f49064l;

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    @l1
    androidx.core.view.v f49065l3;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f49066m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f49067n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f49068o;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private final int[] f49069p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private int f49070p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private SavedState f49071p2;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f49072s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f49073t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private int f49074v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final int[] f49075w;

    /* JADX INFO: renamed from: s3, reason: collision with root package name */
    private static final float f49043s3 = (float) (Math.log(0.78d) / Math.log(0.9d));

    /* JADX INFO: renamed from: v3, reason: collision with root package name */
    private static final a f49046v3 = new a();

    /* JADX INFO: renamed from: w3, reason: collision with root package name */
    private static final int[] f49047w3 = {R.attr.fillViewport};

    static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public int f49076a;

        class a implements Parcelable.Creator<SavedState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return new SavedState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: b, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }

        @NonNull
        public String toString() {
            return "HorizontalScrollView.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " scrollPosition=" + this.f49076a + "}";
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f49076a);
        }

        SavedState(Parcel parcel) {
            super(parcel);
            this.f49076a = parcel.readInt();
        }
    }

    static class a extends androidx.core.view.a {
        a() {
        }

        @Override // androidx.core.view.a
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            accessibilityEvent.setClassName(ScrollView.class.getName());
            accessibilityEvent.setScrollable(nestedScrollView.getScrollRange() > 0);
            accessibilityEvent.setScrollX(nestedScrollView.getScrollX());
            accessibilityEvent.setScrollY(nestedScrollView.getScrollY());
            androidx.core.view.accessibility.l.N(accessibilityEvent, nestedScrollView.getScrollX());
            androidx.core.view.accessibility.l.P(accessibilityEvent, nestedScrollView.getScrollRange());
        }

        @Override // androidx.core.view.a
        public void onInitializeAccessibilityNodeInfo(View view, androidx.core.view.accessibility.j jVar) {
            int scrollRange;
            super.onInitializeAccessibilityNodeInfo(view, jVar);
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            jVar.j1(ScrollView.class.getName());
            if (nestedScrollView.isEnabled() && (scrollRange = nestedScrollView.getScrollRange()) > 0) {
                jVar.X1(true);
                if (nestedScrollView.getScrollY() > 0) {
                    jVar.b(androidx.core.view.accessibility.j.a.f48556s);
                    jVar.b(androidx.core.view.accessibility.j.a.D);
                }
                if (nestedScrollView.getScrollY() < scrollRange) {
                    jVar.b(androidx.core.view.accessibility.j.a.f48555r);
                    jVar.b(androidx.core.view.accessibility.j.a.F);
                }
            }
        }

        @Override // androidx.core.view.a
        public boolean performAccessibilityAction(View view, int i10, Bundle bundle) {
            if (super.performAccessibilityAction(view, i10, bundle)) {
                return true;
            }
            NestedScrollView nestedScrollView = (NestedScrollView) view;
            if (!nestedScrollView.isEnabled()) {
                return false;
            }
            int height = nestedScrollView.getHeight();
            Rect rect = new Rect();
            if (nestedScrollView.getMatrix().isIdentity() && nestedScrollView.getGlobalVisibleRect(rect)) {
                height = rect.height();
            }
            if (i10 != 4096) {
                if (i10 == 8192 || i10 == 16908344) {
                    int iMax = Math.max(nestedScrollView.getScrollY() - ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), 0);
                    if (iMax == nestedScrollView.getScrollY()) {
                        return false;
                    }
                    nestedScrollView.e0(0, iMax, true);
                    return true;
                }
                if (i10 != 16908346) {
                    return false;
                }
            }
            int iMin = Math.min(nestedScrollView.getScrollY() + ((height - nestedScrollView.getPaddingBottom()) - nestedScrollView.getPaddingTop()), nestedScrollView.getScrollRange());
            if (iMin == nestedScrollView.getScrollY()) {
                return false;
            }
            nestedScrollView.e0(0, iMin, true);
            return true;
        }
    }

    @androidx.annotation.w0(21)
    static class b {
        private b() {
        }

        static boolean a(ViewGroup viewGroup) {
            return viewGroup.getClipToPadding();
        }
    }

    @androidx.annotation.w0(35)
    private static final class c {
        private c() {
        }

        public static void a(View view, float f10) {
            try {
                view.setFrameContentVelocity(f10);
            } catch (LinkageError unused) {
            }
        }
    }

    class d implements androidx.core.view.w {
        d() {
        }

        @Override // androidx.core.view.w
        public float a() {
            return -NestedScrollView.this.getVerticalScrollFactorCompat();
        }

        @Override // androidx.core.view.w
        public boolean b(float f10) {
            if (f10 == 0.0f) {
                return false;
            }
            c();
            NestedScrollView.this.z((int) f10);
            return true;
        }

        @Override // androidx.core.view.w
        public void c() {
            NestedScrollView.this.f49051d.abortAnimation();
        }
    }

    public interface e {
        void a(@NonNull NestedScrollView nestedScrollView, int i10, int i11, int i12, int i13);
    }

    public NestedScrollView(@NonNull Context context) {
        this(context, null);
    }

    private float B(int i10) {
        double dLog = Math.log((Math.abs(i10) * f49042r3) / (this.f49048a * f49041q3));
        float f10 = f49043s3;
        return (float) (((double) (this.f49048a * f49041q3)) * Math.exp((((double) f10) / (((double) f10) - 1.0d)) * dLog));
    }

    private boolean C(int i10, int i11) {
        if (getChildCount() > 0) {
            int scrollY = getScrollY();
            View childAt = getChildAt(0);
            if (i11 >= childAt.getTop() - scrollY && i11 < childAt.getBottom() - scrollY && i10 >= childAt.getLeft() && i10 < childAt.getRight()) {
                return true;
            }
        }
        return false;
    }

    private void D() {
        VelocityTracker velocityTracker = this.f49064l;
        if (velocityTracker == null) {
            this.f49064l = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
    }

    private void E() {
        this.f49051d = new OverScroller(getContext());
        setFocusable(true);
        setDescendantFocusability(262144);
        setWillNotDraw(false);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(getContext());
        this.f49068o = viewConfiguration.getScaledTouchSlop();
        this.f49072s = viewConfiguration.getScaledMinimumFlingVelocity();
        this.f49073t = viewConfiguration.getScaledMaximumFlingVelocity();
    }

    private void F() {
        if (this.f49064l == null) {
            this.f49064l = VelocityTracker.obtain();
        }
    }

    private void G(int i10, int i11) {
        this.f49054g = i10;
        this.f49074v = i11;
        f(2, 0);
    }

    private boolean I(View view) {
        return !L(view, 0, getHeight());
    }

    private static boolean K(View view, View view2) {
        if (view == view2) {
            return true;
        }
        Object parent = view.getParent();
        return (parent instanceof ViewGroup) && K((View) parent, view2);
    }

    private boolean L(View view, int i10, int i11) {
        view.getDrawingRect(this.f49050c);
        offsetDescendantRectToMyCoords(view, this.f49050c);
        return this.f49050c.bottom + i10 >= getScrollY() && this.f49050c.top - i10 <= getScrollY() + i11;
    }

    private void M(int i10, int i11, @p0 int[] iArr) {
        int scrollY = getScrollY();
        scrollBy(0, i10);
        int scrollY2 = getScrollY() - scrollY;
        if (iArr != null) {
            iArr[1] = iArr[1] + scrollY2;
        }
        this.f49057h3.e(0, scrollY2, 0, i10 - scrollY2, null, i11, iArr);
    }

    private void N(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f49074v) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.f49054g = (int) motionEvent.getY(i10);
            this.f49074v = motionEvent.getPointerId(i10);
            VelocityTracker velocityTracker = this.f49064l;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private void Q() {
        VelocityTracker velocityTracker = this.f49064l;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f49064l = null;
        }
    }

    /* JADX WARN: Code duplicated, block: B:15:0x006e  */
    private int R(int i10, float f10) {
        float fJ;
        int iRound;
        float width = f10 / getWidth();
        float height = i10 / getHeight();
        float f11 = 0.0f;
        if (j.d(this.f49052e) == 0.0f) {
            if (j.d(this.f49053f) != 0.0f) {
                fJ = j.j(this.f49053f, height, 1.0f - width);
                if (j.d(this.f49053f) == 0.0f) {
                    this.f49053f.onRelease();
                }
            }
            iRound = Math.round(f11 * getHeight());
            if (iRound != 0) {
                invalidate();
            }
            return iRound;
        }
        fJ = -j.j(this.f49052e, -height, width);
        if (j.d(this.f49052e) == 0.0f) {
            this.f49052e.onRelease();
        }
        f11 = fJ;
        iRound = Math.round(f11 * getHeight());
        if (iRound != 0) {
            invalidate();
        }
        return iRound;
    }

    private void S(boolean z10) {
        if (z10) {
            f(2, 1);
        } else {
            c(1);
        }
        this.H1 = getScrollY();
        postInvalidateOnAnimation();
    }

    private boolean T(int i10, int i11, int i12) {
        int height = getHeight();
        int scrollY = getScrollY();
        int i13 = height + scrollY;
        boolean z10 = false;
        int i14 = 2 | 0;
        boolean z11 = i10 == 33;
        View viewY = y(z11, i11, i12);
        if (viewY == null) {
            viewY = this;
        }
        if (i11 < scrollY || i12 > i13) {
            U(z11 ? i11 - scrollY : i12 - i13, 0, 1, true);
            z10 = true;
        }
        if (viewY != findFocus()) {
            viewY.requestFocus(i10);
        }
        return z10;
    }

    private int U(int i10, int i11, int i12, boolean z10) {
        int i13;
        int i14;
        VelocityTracker velocityTracker;
        if (i12 == 1) {
            f(2, i12);
        }
        boolean z11 = false;
        if (b(0, i10, this.f49069p0, this.f49075w, i12)) {
            int i15 = i10 - this.f49069p0[1];
            i14 = this.f49075w[1];
            i13 = i15;
        } else {
            i13 = i10;
            i14 = 0;
        }
        int scrollY = getScrollY();
        int scrollRange = getScrollRange();
        boolean z12 = j() && !z10;
        int i16 = i13;
        boolean z13 = O(0, i13, 0, scrollY, 0, scrollRange, 0, 0, true) && !e(i12);
        int scrollY2 = getScrollY() - scrollY;
        int[] iArr = this.f49069p0;
        iArr[1] = 0;
        d(0, scrollY2, 0, i16 - scrollY2, this.f49075w, i12, iArr);
        int i17 = i14 + this.f49075w[1];
        int i18 = i16 - this.f49069p0[1];
        int i19 = scrollY + i18;
        if (i19 < 0) {
            if (z12) {
                j.j(this.f49052e, (-i18) / getHeight(), i11 / getWidth());
                if (!this.f49053f.isFinished()) {
                    this.f49053f.onRelease();
                }
            }
        } else if (i19 > scrollRange && z12) {
            j.j(this.f49053f, i18 / getHeight(), 1.0f - (i11 / getWidth()));
            if (!this.f49052e.isFinished()) {
                this.f49052e.onRelease();
            }
        }
        if (this.f49052e.isFinished() && this.f49053f.isFinished()) {
            z11 = z13;
        } else {
            postInvalidateOnAnimation();
        }
        if (z11 && i12 == 0 && (velocityTracker = this.f49064l) != null) {
            velocityTracker.clear();
        }
        if (i12 == 1) {
            c(i12);
            this.f49052e.onRelease();
            this.f49053f.onRelease();
        }
        return i17;
    }

    private void V(View view) {
        view.getDrawingRect(this.f49050c);
        offsetDescendantRectToMyCoords(view, this.f49050c);
        int iP = p(this.f49050c);
        if (iP != 0) {
            scrollBy(0, iP);
        }
    }

    private boolean W(Rect rect, boolean z10) {
        int iP = p(rect);
        boolean z11 = iP != 0;
        if (z11) {
            if (z10) {
                scrollBy(0, iP);
                return z11;
            }
            Y(0, iP);
        }
        return z11;
    }

    private boolean X(@NonNull EdgeEffect edgeEffect, int i10) {
        if (i10 > 0) {
            return true;
        }
        return B(-i10) < j.d(edgeEffect) * ((float) getHeight());
    }

    private void a() {
        this.f49051d.abortAnimation();
        c(1);
    }

    private void a0(int i10, int i11, int i12, boolean z10) {
        if (getChildCount() == 0) {
            return;
        }
        if (AnimationUtils.currentAnimationTimeMillis() - this.f49049b > 250) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int height = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            this.f49051d.startScroll(getScrollX(), scrollY, 0, Math.max(0, Math.min(i11 + scrollY, Math.max(0, height - height2))) - scrollY, i12);
            S(z10);
        } else {
            if (!this.f49051d.isFinished()) {
                a();
            }
            scrollBy(i10, i11);
        }
        this.f49049b = AnimationUtils.currentAnimationTimeMillis();
    }

    private boolean f0(MotionEvent motionEvent) {
        boolean z10;
        if (j.d(this.f49052e) != 0.0f) {
            j.j(this.f49052e, 0.0f, motionEvent.getX() / getWidth());
            z10 = true;
        } else {
            z10 = false;
        }
        if (j.d(this.f49053f) == 0.0f) {
            return z10;
        }
        j.j(this.f49053f, 0.0f, 1.0f - (motionEvent.getX() / getWidth()));
        return true;
    }

    private boolean j() {
        int overScrollMode = getOverScrollMode();
        return overScrollMode == 0 || (overScrollMode == 1 && getScrollRange() > 0);
    }

    private boolean k() {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            if (childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin > (getHeight() - getPaddingTop()) - getPaddingBottom()) {
                return true;
            }
        }
        return false;
    }

    private static int n(int i10, int i11, int i12) {
        if (i11 >= i12 || i10 < 0) {
            return 0;
        }
        return i11 + i10 > i12 ? i12 - i11 : i10;
    }

    private void u(int i10) {
        if (i10 != 0) {
            if (this.f49067n) {
                Y(0, i10);
            } else {
                scrollBy(0, i10);
            }
        }
    }

    private boolean v(int i10) {
        if (j.d(this.f49052e) != 0.0f) {
            if (X(this.f49052e, i10)) {
                this.f49052e.onAbsorb(i10);
                return true;
            }
            z(-i10);
            return true;
        }
        if (j.d(this.f49053f) == 0.0f) {
            return false;
        }
        int i11 = -i10;
        if (X(this.f49053f, i11)) {
            this.f49053f.onAbsorb(i11);
            return true;
        }
        z(i11);
        return true;
    }

    private void w() {
        this.f49074v = -1;
        this.f49062k = false;
        Q();
        c(0);
        this.f49052e.onRelease();
        this.f49053f.onRelease();
    }

    private View y(boolean z10, int i10, int i11) {
        ArrayList<View> focusables = getFocusables(2);
        int size = focusables.size();
        View view = null;
        boolean z11 = false;
        for (int i12 = 0; i12 < size; i12++) {
            View view2 = focusables.get(i12);
            int top = view2.getTop();
            int bottom = view2.getBottom();
            if (i10 < bottom && top < i11) {
                boolean z12 = i10 < top && bottom < i11;
                if (view == null) {
                    view = view2;
                    z11 = z12;
                } else {
                    boolean z13 = (z10 && top < view.getTop()) || (!z10 && bottom > view.getBottom());
                    if (z11) {
                        if (z12 && z13) {
                            view = view2;
                        }
                    } else if (z12) {
                        view = view2;
                        z11 = true;
                    } else if (z13) {
                        view = view2;
                    }
                }
            }
        }
        return view;
    }

    public boolean A(int i10) {
        int childCount;
        boolean z10 = i10 == 130;
        int height = getHeight();
        Rect rect = this.f49050c;
        rect.top = 0;
        rect.bottom = height;
        if (z10 && (childCount = getChildCount()) > 0) {
            View childAt = getChildAt(childCount - 1);
            this.f49050c.bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
            Rect rect2 = this.f49050c;
            rect2.top = rect2.bottom - height;
        }
        Rect rect3 = this.f49050c;
        return T(i10, rect3.top, rect3.bottom);
    }

    public boolean H() {
        return this.f49066m;
    }

    public boolean J() {
        return this.f49067n;
    }

    boolean O(int i10, int i11, int i12, int i13, int i14, int i15, int i16, int i17, boolean z10) {
        boolean z11;
        boolean z12;
        int i18;
        int overScrollMode = getOverScrollMode();
        boolean z13 = computeHorizontalScrollRange() > computeHorizontalScrollExtent();
        boolean z14 = computeVerticalScrollRange() > computeVerticalScrollExtent();
        boolean z15 = overScrollMode == 0 || (overScrollMode == 1 && z13);
        boolean z16 = overScrollMode == 0 || (overScrollMode == 1 && z14);
        int i19 = i12 + i10;
        int i20 = !z15 ? 0 : i16;
        int i21 = i13 + i11;
        int i22 = !z16 ? 0 : i17;
        int i23 = -i20;
        int i24 = i20 + i14;
        int i25 = -i22;
        int i26 = i22 + i15;
        if (i19 > i24) {
            i19 = i24;
            z11 = true;
        } else if (i19 < i23) {
            z11 = true;
            i19 = i23;
        } else {
            z11 = false;
        }
        if (i21 > i26) {
            i21 = i26;
            z12 = true;
        } else if (i21 < i25) {
            z12 = true;
            i21 = i25;
        } else {
            z12 = false;
        }
        if (!z12 || e(1)) {
            i18 = i19;
        } else {
            int i27 = i19;
            this.f49051d.springBack(i27, i21, 0, 0, 0, getScrollRange());
            i18 = i27;
        }
        onOverScrolled(i18, i21, z11, z12);
        return z11 || z12;
    }

    public boolean P(int i10) {
        boolean z10 = i10 == 130;
        int height = getHeight();
        if (z10) {
            this.f49050c.top = getScrollY() + height;
            int childCount = getChildCount();
            if (childCount > 0) {
                View childAt = getChildAt(childCount - 1);
                int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin + getPaddingBottom();
                Rect rect = this.f49050c;
                if (rect.top + height > bottom) {
                    rect.top = bottom - height;
                }
            }
        } else {
            this.f49050c.top = getScrollY() - height;
            Rect rect2 = this.f49050c;
            if (rect2.top < 0) {
                rect2.top = 0;
            }
        }
        Rect rect3 = this.f49050c;
        int i11 = rect3.top;
        int i12 = height + i11;
        rect3.bottom = i12;
        return T(i10, i11, i12);
    }

    public final void Y(int i10, int i11) {
        a0(i10, i11, 250, false);
    }

    public final void Z(int i10, int i11, int i12) {
        a0(i10, i11, i12, false);
    }

    @Override // android.view.ViewGroup
    public void addView(@NonNull View view) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view);
    }

    @Override // androidx.core.view.t0
    public boolean b(int i10, int i11, @p0 int[] iArr, @p0 int[] iArr2, int i12) {
        return this.f49057h3.d(i10, i11, iArr, iArr2, i12);
    }

    public final void b0(int i10, int i11) {
        d0(i10, i11, 250, false);
    }

    @Override // androidx.core.view.t0
    public void c(int i10) {
        this.f49057h3.u(i10);
    }

    public final void c0(int i10, int i11, int i12) {
        d0(i10, i11, i12, false);
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    public int computeHorizontalScrollExtent() {
        return super.computeHorizontalScrollExtent();
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    public int computeHorizontalScrollOffset() {
        return super.computeHorizontalScrollOffset();
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    public int computeHorizontalScrollRange() {
        return super.computeHorizontalScrollRange();
    }

    @Override // android.view.View
    public void computeScroll() {
        if (this.f49051d.isFinished()) {
            return;
        }
        this.f49051d.computeScrollOffset();
        int currY = this.f49051d.getCurrY();
        int iR = r(currY - this.H1);
        this.H1 = currY;
        int[] iArr = this.f49069p0;
        iArr[1] = 0;
        int i10 = (6 << 0) >> 0;
        b(0, iR, iArr, null, 1);
        int i11 = iR - this.f49069p0[1];
        int scrollRange = getScrollRange();
        if (androidx.core.os.b.m()) {
            c.a(this, Math.abs(this.f49051d.getCurrVelocity()));
        }
        if (i11 != 0) {
            int scrollY = getScrollY();
            O(0, i11, getScrollX(), scrollY, 0, scrollRange, 0, 0, false);
            int scrollY2 = getScrollY() - scrollY;
            int i12 = i11 - scrollY2;
            int[] iArr2 = this.f49069p0;
            iArr2[1] = 0;
            int i13 = 2 | 0;
            d(0, scrollY2, 0, i12, this.f49075w, 1, iArr2);
            i11 = i12 - this.f49069p0[1];
        }
        if (i11 != 0) {
            int overScrollMode = getOverScrollMode();
            if (overScrollMode == 0 || (overScrollMode == 1 && scrollRange > 0)) {
                if (i11 < 0) {
                    if (this.f49052e.isFinished()) {
                        this.f49052e.onAbsorb((int) this.f49051d.getCurrVelocity());
                    }
                } else if (this.f49053f.isFinished()) {
                    this.f49053f.onAbsorb((int) this.f49051d.getCurrVelocity());
                }
            }
            a();
        }
        if (this.f49051d.isFinished()) {
            c(1);
        } else {
            postInvalidateOnAnimation();
        }
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    public int computeVerticalScrollExtent() {
        return super.computeVerticalScrollExtent();
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    public int computeVerticalScrollOffset() {
        return Math.max(0, super.computeVerticalScrollOffset());
    }

    @Override // android.view.View, androidx.core.view.ScrollingView
    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    public int computeVerticalScrollRange() {
        int childCount = getChildCount();
        int height = (getHeight() - getPaddingBottom()) - getPaddingTop();
        if (childCount == 0) {
            return height;
        }
        View childAt = getChildAt(0);
        int bottom = childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin;
        int scrollY = getScrollY();
        int iMax = Math.max(0, bottom - height);
        if (scrollY < 0) {
            return bottom - scrollY;
        }
        if (scrollY > iMax) {
            bottom += scrollY - iMax;
        }
        return bottom;
    }

    @Override // androidx.core.view.u0
    public void d(int i10, int i11, int i12, int i13, @p0 int[] iArr, int i14, @NonNull int[] iArr2) {
        this.f49057h3.e(i10, i11, i12, i13, iArr, i14, iArr2);
    }

    void d0(int i10, int i11, int i12, boolean z10) {
        a0(i10 - getScrollX(), i11 - getScrollY(), i12, z10);
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || x(keyEvent);
    }

    @Override // android.view.View, androidx.core.view.v0
    public boolean dispatchNestedFling(float f10, float f11, boolean z10) {
        return this.f49057h3.a(f10, f11, z10);
    }

    @Override // android.view.View, androidx.core.view.v0
    public boolean dispatchNestedPreFling(float f10, float f11) {
        return this.f49057h3.b(f10, f11);
    }

    @Override // android.view.View, androidx.core.view.v0
    public boolean dispatchNestedPreScroll(int i10, int i11, @p0 int[] iArr, @p0 int[] iArr2) {
        return b(i10, i11, iArr, iArr2, 0);
    }

    @Override // android.view.View, androidx.core.view.v0
    public boolean dispatchNestedScroll(int i10, int i11, int i12, int i13, @p0 int[] iArr) {
        return this.f49057h3.f(i10, i11, i12, i13, iArr);
    }

    @Override // android.view.View
    public void draw(@NonNull Canvas canvas) {
        int paddingLeft;
        super.draw(canvas);
        int scrollY = getScrollY();
        int paddingLeft2 = 0;
        if (!this.f49052e.isFinished()) {
            int iSave = canvas.save();
            int width = getWidth();
            int height = getHeight();
            int iMin = Math.min(0, scrollY);
            if (b.a(this)) {
                width -= getPaddingLeft() + getPaddingRight();
                paddingLeft = getPaddingLeft();
            } else {
                paddingLeft = 0;
            }
            if (b.a(this)) {
                height -= getPaddingTop() + getPaddingBottom();
                iMin += getPaddingTop();
            }
            canvas.translate(paddingLeft, iMin);
            this.f49052e.setSize(width, height);
            if (this.f49052e.draw(canvas)) {
                postInvalidateOnAnimation();
            }
            canvas.restoreToCount(iSave);
        }
        if (this.f49053f.isFinished()) {
            return;
        }
        int iSave2 = canvas.save();
        int width2 = getWidth();
        int height2 = getHeight();
        int iMax = Math.max(getScrollRange(), scrollY) + height2;
        if (b.a(this)) {
            width2 -= getPaddingLeft() + getPaddingRight();
            paddingLeft2 = getPaddingLeft();
        }
        if (b.a(this)) {
            height2 -= getPaddingTop() + getPaddingBottom();
            iMax -= getPaddingBottom();
        }
        canvas.translate(paddingLeft2 - width2, iMax);
        canvas.rotate(180.0f, width2, 0.0f);
        this.f49053f.setSize(width2, height2);
        if (this.f49053f.draw(canvas)) {
            postInvalidateOnAnimation();
        }
        canvas.restoreToCount(iSave2);
    }

    @Override // androidx.core.view.t0
    public boolean e(int i10) {
        return this.f49057h3.l(i10);
    }

    void e0(int i10, int i11, boolean z10) {
        d0(i10, i11, 250, z10);
    }

    @Override // androidx.core.view.t0
    public boolean f(int i10, int i11) {
        return this.f49057h3.s(i10, i11);
    }

    @Override // androidx.core.view.t0
    public boolean g(int i10, int i11, int i12, int i13, @p0 int[] iArr, int i14) {
        return this.f49057h3.g(i10, i11, i12, i13, iArr, i14);
    }

    @Override // android.view.View
    protected float getBottomFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int bottom = ((childAt.getBottom() + layoutParams.bottomMargin) - getScrollY()) - (getHeight() - getPaddingBottom());
        if (bottom < verticalFadingEdgeLength) {
            return bottom / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    public int getMaxScrollAmount() {
        return (int) (getHeight() * 0.5f);
    }

    @Override // android.view.ViewGroup, androidx.core.view.z0
    public int getNestedScrollAxes() {
        return this.f49055g3.a();
    }

    int getScrollRange() {
        if (getChildCount() <= 0) {
            return 0;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        return Math.max(0, ((childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin) - ((getHeight() - getPaddingTop()) - getPaddingBottom()));
    }

    @Override // android.view.View
    protected float getTopFadingEdgeStrength() {
        if (getChildCount() == 0) {
            return 0.0f;
        }
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        int scrollY = getScrollY();
        if (scrollY < verticalFadingEdgeLength) {
            return scrollY / verticalFadingEdgeLength;
        }
        return 1.0f;
    }

    @l1
    float getVerticalScrollFactorCompat() {
        if (this.f49059i3 == 0.0f) {
            TypedValue typedValue = new TypedValue();
            Context context = getContext();
            if (!context.getTheme().resolveAttribute(R.attr.listPreferredItemHeight, typedValue, true)) {
                throw new IllegalStateException("Expected theme to define listPreferredItemHeight.");
            }
            this.f49059i3 = typedValue.getDimension(context.getResources().getDisplayMetrics());
        }
        return this.f49059i3;
    }

    @Override // android.view.View, androidx.core.view.v0
    public boolean hasNestedScrollingParent() {
        return e(0);
    }

    public boolean i(int i10) {
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i10);
        int maxScrollAmount = getMaxScrollAmount();
        if (viewFindNextFocus == null || !L(viewFindNextFocus, maxScrollAmount, getHeight())) {
            if (i10 == 33 && getScrollY() < maxScrollAmount) {
                maxScrollAmount = getScrollY();
            } else if (i10 == 130 && getChildCount() > 0) {
                View childAt = getChildAt(0);
                maxScrollAmount = Math.min((childAt.getBottom() + ((FrameLayout.LayoutParams) childAt.getLayoutParams()).bottomMargin) - ((getScrollY() + getHeight()) - getPaddingBottom()), maxScrollAmount);
            }
            if (maxScrollAmount == 0) {
                return false;
            }
            if (i10 != 130) {
                maxScrollAmount = -maxScrollAmount;
            }
            U(maxScrollAmount, 0, 1, true);
        } else {
            viewFindNextFocus.getDrawingRect(this.f49050c);
            offsetDescendantRectToMyCoords(viewFindNextFocus, this.f49050c);
            U(p(this.f49050c), 0, 1, true);
            viewFindNextFocus.requestFocus(i10);
        }
        if (viewFindFocus != null && viewFindFocus.isFocused() && I(viewFindFocus)) {
            int descendantFocusability = getDescendantFocusability();
            setDescendantFocusability(131072);
            requestFocus();
            setDescendantFocusability(descendantFocusability);
        }
        return true;
    }

    @Override // android.view.View, androidx.core.view.v0
    public boolean isNestedScrollingEnabled() {
        return this.f49057h3.m();
    }

    @Override // androidx.core.view.x0
    public void l(@NonNull View view, @NonNull View view2, int i10, int i11) {
        this.f49055g3.c(view, view2, i10, i11);
        f(2, i11);
    }

    @Override // androidx.core.view.x0
    public void m(@NonNull View view, int i10) {
        this.f49055g3.e(view, i10);
        c(i10);
    }

    @Override // android.view.ViewGroup
    protected void measureChild(@NonNull View view, int i10, int i11) {
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight(), view.getLayoutParams().width), View.MeasureSpec.makeMeasureSpec(0, 0));
    }

    @Override // android.view.ViewGroup
    protected void measureChildWithMargins(View view, int i10, int i11, int i12, int i13) {
        ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) view.getLayoutParams();
        view.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight() + marginLayoutParams.leftMargin + marginLayoutParams.rightMargin + i11, marginLayoutParams.width), View.MeasureSpec.makeMeasureSpec(marginLayoutParams.topMargin + marginLayoutParams.bottomMargin, 0));
    }

    @Override // androidx.core.view.x0
    public void o(@NonNull View view, int i10, int i11, int i12, int i13, int i14) {
        M(i13, i14, null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.f49058i = false;
    }

    @Override // android.view.View
    public boolean onGenericMotionEvent(@NonNull MotionEvent motionEvent) {
        int i10;
        int width;
        float axisValue;
        if (motionEvent.getAction() == 8 && !this.f49062k) {
            if (s0.l(motionEvent, 2)) {
                i10 = 9;
                axisValue = motionEvent.getAxisValue(9);
                width = (int) motionEvent.getX();
            } else if (s0.l(motionEvent, 4194304)) {
                float axisValue2 = motionEvent.getAxisValue(26);
                width = getWidth() / 2;
                i10 = 26;
                axisValue = axisValue2;
            } else {
                i10 = 0;
                width = 0;
                axisValue = 0.0f;
            }
            if (axisValue != 0.0f) {
                U(-((int) (axisValue * getVerticalScrollFactorCompat())), width, 1, s0.l(motionEvent, 8194));
                if (i10 != 0) {
                    this.f49065l3.g(motionEvent, i10);
                }
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:32:0x0075  */
    /* JADX WARN: Code duplicated, block: B:34:0x0096  */
    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(@NonNull MotionEvent motionEvent) {
        int iFindPointerIndex;
        int action = motionEvent.getAction();
        boolean z10 = true;
        if (action == 2 && this.f49062k) {
            return true;
        }
        int i10 = action & 255;
        if (i10 == 0) {
            int y10 = (int) motionEvent.getY();
            if (C((int) motionEvent.getX(), y10)) {
                this.f49054g = y10;
                this.f49074v = motionEvent.getPointerId(0);
                D();
                this.f49064l.addMovement(motionEvent);
                this.f49051d.computeScrollOffset();
                if (!f0(motionEvent) && this.f49051d.isFinished()) {
                    z10 = false;
                }
                this.f49062k = z10;
                f(2, 0);
            } else {
                if (!f0(motionEvent) && this.f49051d.isFinished()) {
                    z10 = false;
                }
                this.f49062k = z10;
                Q();
            }
        } else if (i10 == 1) {
            this.f49062k = false;
            this.f49074v = -1;
            Q();
            if (this.f49051d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            c(0);
        } else if (i10 == 2) {
            int i11 = this.f49074v;
            if (i11 != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(i11)) != -1) {
                int y11 = (int) motionEvent.getY(iFindPointerIndex);
                if (Math.abs(y11 - this.f49054g) > this.f49068o && (2 & getNestedScrollAxes()) == 0) {
                    this.f49062k = true;
                    this.f49054g = y11;
                    F();
                    this.f49064l.addMovement(motionEvent);
                    this.f49070p1 = 0;
                    ViewParent parent = getParent();
                    if (parent != null) {
                        parent.requestDisallowInterceptTouchEvent(true);
                    }
                }
            }
        } else if (i10 == 3) {
            this.f49062k = false;
            this.f49074v = -1;
            Q();
            if (this.f49051d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                postInvalidateOnAnimation();
            }
            c(0);
        } else if (i10 == 6) {
            N(motionEvent);
        }
        return this.f49062k;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        super.onLayout(z10, i10, i11, i12, i13);
        int measuredHeight = 0;
        this.f49056h = false;
        View view = this.f49060j;
        if (view != null && K(view, this)) {
            V(this.f49060j);
        }
        this.f49060j = null;
        if (!this.f49058i) {
            if (this.f49071p2 != null) {
                scrollTo(getScrollX(), this.f49071p2.f49076a);
                this.f49071p2 = null;
            }
            if (getChildCount() > 0) {
                View childAt = getChildAt(0);
                FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
                measuredHeight = childAt.getMeasuredHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            }
            int paddingTop = ((i13 - i11) - getPaddingTop()) - getPaddingBottom();
            int scrollY = getScrollY();
            int iN = n(scrollY, paddingTop, measuredHeight);
            if (iN != scrollY) {
                scrollTo(getScrollX(), iN);
            }
        }
        scrollTo(getScrollX(), getScrollY());
        this.f49058i = true;
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected void onMeasure(int i10, int i11) {
        super.onMeasure(i10, i11);
        if (this.f49066m && View.MeasureSpec.getMode(i11) != 0 && getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int measuredHeight = childAt.getMeasuredHeight();
            int measuredHeight2 = (((getMeasuredHeight() - getPaddingTop()) - getPaddingBottom()) - layoutParams.topMargin) - layoutParams.bottomMargin;
            if (measuredHeight < measuredHeight2) {
                childAt.measure(ViewGroup.getChildMeasureSpec(i10, getPaddingLeft() + getPaddingRight() + layoutParams.leftMargin + layoutParams.rightMargin, layoutParams.width), View.MeasureSpec.makeMeasureSpec(measuredHeight2, 1073741824));
            }
        }
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.z0
    public boolean onNestedFling(@NonNull View view, float f10, float f11, boolean z10) {
        if (z10) {
            return false;
        }
        dispatchNestedFling(0.0f, f11, true);
        z((int) f11);
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.z0
    public boolean onNestedPreFling(@NonNull View view, float f10, float f11) {
        return dispatchNestedPreFling(f10, f11);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.z0
    public void onNestedPreScroll(@NonNull View view, int i10, int i11, @NonNull int[] iArr) {
        q(view, i10, i11, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.z0
    public void onNestedScroll(@NonNull View view, int i10, int i11, int i12, int i13) {
        M(i13, 0, null);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.z0
    public void onNestedScrollAccepted(@NonNull View view, @NonNull View view2, int i10) {
        l(view, view2, i10, 0);
    }

    @Override // android.view.View
    protected void onOverScrolled(int i10, int i11, boolean z10, boolean z11) {
        super.scrollTo(i10, i11);
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i10, Rect rect) {
        if (i10 == 2) {
            i10 = 130;
        } else if (i10 == 1) {
            i10 = 33;
        }
        View viewFindNextFocus = rect == null ? FocusFinder.getInstance().findNextFocus(this, null, i10) : FocusFinder.getInstance().findNextFocusFromRect(this, rect, i10);
        if (viewFindNextFocus != null && !I(viewFindNextFocus)) {
            return viewFindNextFocus.requestFocus(i10, rect);
        }
        return false;
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f49071p2 = savedState;
        requestLayout();
    }

    @Override // android.view.View
    @NonNull
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f49076a = getScrollY();
        return savedState;
    }

    @Override // android.view.View
    protected void onScrollChanged(int i10, int i11, int i12, int i13) {
        super.onScrollChanged(i10, i11, i12, i13);
        e eVar = this.f49061j3;
        if (eVar != null) {
            eVar.a(this, i10, i11, i12, i13);
        }
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        View viewFindFocus = findFocus();
        if (viewFindFocus == null || this == viewFindFocus || !L(viewFindFocus, 0, i13)) {
            return;
        }
        viewFindFocus.getDrawingRect(this.f49050c);
        offsetDescendantRectToMyCoords(viewFindFocus, this.f49050c);
        u(p(this.f49050c));
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.z0
    public boolean onStartNestedScroll(@NonNull View view, @NonNull View view2, int i10) {
        return t(view, view2, i10, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.z0
    public void onStopNestedScroll(@NonNull View view) {
        m(view, 0);
    }

    @Override // android.view.View
    public boolean onTouchEvent(@NonNull MotionEvent motionEvent) {
        ViewParent parent;
        F();
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f49070p1 = 0;
        }
        MotionEvent motionEventObtain = MotionEvent.obtain(motionEvent);
        motionEventObtain.offsetLocation(0.0f, this.f49070p1);
        if (actionMasked != 0) {
            if (actionMasked == 1) {
                VelocityTracker velocityTracker = this.f49064l;
                velocityTracker.computeCurrentVelocity(1000, this.f49073t);
                int yVelocity = (int) velocityTracker.getYVelocity(this.f49074v);
                if (Math.abs(yVelocity) < this.f49072s) {
                    int i10 = 3 & 0;
                    if (this.f49051d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                        postInvalidateOnAnimation();
                    }
                } else if (!v(yVelocity)) {
                    int i11 = -yVelocity;
                    float f10 = i11;
                    if (!dispatchNestedPreFling(0.0f, f10)) {
                        dispatchNestedFling(0.0f, f10, true);
                        z(i11);
                    }
                }
                w();
            } else if (actionMasked == 2) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f49074v);
                if (iFindPointerIndex != -1) {
                    int y10 = (int) motionEvent.getY(iFindPointerIndex);
                    int i12 = this.f49054g - y10;
                    int iR = i12 - R(i12, motionEvent.getX(iFindPointerIndex));
                    if (!this.f49062k && Math.abs(iR) > this.f49068o) {
                        ViewParent parent2 = getParent();
                        if (parent2 != null) {
                            parent2.requestDisallowInterceptTouchEvent(true);
                        }
                        this.f49062k = true;
                        iR = iR > 0 ? iR - this.f49068o : iR + this.f49068o;
                    }
                    if (this.f49062k) {
                        int iU = U(iR, (int) motionEvent.getX(iFindPointerIndex), 0, false);
                        this.f49054g = y10 - iU;
                        this.f49070p1 += iU;
                    }
                }
            } else if (actionMasked == 3) {
                if (this.f49062k && getChildCount() > 0 && this.f49051d.springBack(getScrollX(), getScrollY(), 0, 0, 0, getScrollRange())) {
                    postInvalidateOnAnimation();
                }
                w();
            } else if (actionMasked == 5) {
                int actionIndex = motionEvent.getActionIndex();
                this.f49054g = (int) motionEvent.getY(actionIndex);
                this.f49074v = motionEvent.getPointerId(actionIndex);
            } else if (actionMasked == 6) {
                N(motionEvent);
                this.f49054g = (int) motionEvent.getY(motionEvent.findPointerIndex(this.f49074v));
            }
        } else {
            if (getChildCount() == 0) {
                return false;
            }
            if (this.f49062k && (parent = getParent()) != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
            if (!this.f49051d.isFinished()) {
                a();
            }
            G((int) motionEvent.getY(), motionEvent.getPointerId(0));
        }
        VelocityTracker velocityTracker2 = this.f49064l;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEventObtain);
        }
        motionEventObtain.recycle();
        return true;
    }

    protected int p(Rect rect) {
        if (getChildCount() == 0) {
            return 0;
        }
        int height = getHeight();
        int scrollY = getScrollY();
        int i10 = scrollY + height;
        int verticalFadingEdgeLength = getVerticalFadingEdgeLength();
        if (rect.top > 0) {
            scrollY += verticalFadingEdgeLength;
        }
        View childAt = getChildAt(0);
        FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
        int i11 = rect.bottom < (childAt.getHeight() + layoutParams.topMargin) + layoutParams.bottomMargin ? i10 - verticalFadingEdgeLength : i10;
        int i12 = rect.bottom;
        if (i12 > i11 && rect.top > scrollY) {
            return Math.min(rect.height() > height ? rect.top - scrollY : rect.bottom - i11, (childAt.getBottom() + layoutParams.bottomMargin) - i10);
        }
        if (rect.top >= scrollY || i12 >= i11) {
            return 0;
        }
        return Math.max(rect.height() > height ? 0 - (i11 - rect.bottom) : 0 - (scrollY - rect.top), -getScrollY());
    }

    @Override // androidx.core.view.x0
    public void q(@NonNull View view, int i10, int i11, @NonNull int[] iArr, int i12) {
        b(i10, i11, iArr, null, i12);
    }

    int r(int i10) {
        int height = getHeight();
        if (i10 > 0 && j.d(this.f49052e) != 0.0f) {
            int iRound = Math.round(((-height) / 4.0f) * j.j(this.f49052e, ((-i10) * 4.0f) / height, 0.5f));
            if (iRound != i10) {
                this.f49052e.finish();
            }
            return i10 - iRound;
        }
        if (i10 >= 0 || j.d(this.f49053f) == 0.0f) {
            return i10;
        }
        float f10 = height;
        int iRound2 = Math.round((f10 / 4.0f) * j.j(this.f49053f, (i10 * 4.0f) / f10, 0.5f));
        if (iRound2 != i10) {
            this.f49053f.finish();
        }
        return i10 - iRound2;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestChildFocus(View view, View view2) {
        if (this.f49056h) {
            this.f49060j = view2;
        } else {
            V(view2);
        }
        super.requestChildFocus(view, view2);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(@NonNull View view, Rect rect, boolean z10) {
        rect.offset(view.getLeft() - view.getScrollX(), view.getTop() - view.getScrollY());
        return W(rect, z10);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        if (z10) {
            Q();
        }
        super.requestDisallowInterceptTouchEvent(z10);
    }

    @Override // android.view.View, android.view.ViewParent
    public void requestLayout() {
        this.f49056h = true;
        super.requestLayout();
    }

    @Override // androidx.core.view.y0
    public void s(@NonNull View view, int i10, int i11, int i12, int i13, int i14, @NonNull int[] iArr) {
        M(i13, i14, iArr);
    }

    @Override // android.view.View
    public void scrollTo(int i10, int i11) {
        if (getChildCount() > 0) {
            View childAt = getChildAt(0);
            FrameLayout.LayoutParams layoutParams = (FrameLayout.LayoutParams) childAt.getLayoutParams();
            int width = (getWidth() - getPaddingLeft()) - getPaddingRight();
            int width2 = childAt.getWidth() + layoutParams.leftMargin + layoutParams.rightMargin;
            int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
            int height2 = childAt.getHeight() + layoutParams.topMargin + layoutParams.bottomMargin;
            int iN = n(i10, width, width2);
            int iN2 = n(i11, height, height2);
            if (iN == getScrollX() && iN2 == getScrollY()) {
                return;
            }
            super.scrollTo(iN, iN2);
        }
    }

    public void setFillViewport(boolean z10) {
        if (z10 != this.f49066m) {
            this.f49066m = z10;
            requestLayout();
        }
    }

    @Override // android.view.View, androidx.core.view.v0
    public void setNestedScrollingEnabled(boolean z10) {
        this.f49057h3.p(z10);
    }

    public void setOnScrollChangeListener(@p0 e eVar) {
        this.f49061j3 = eVar;
    }

    public void setSmoothScrollingEnabled(boolean z10) {
        this.f49067n = z10;
    }

    @Override // android.widget.FrameLayout, android.view.ViewGroup
    public boolean shouldDelayChildPressedState() {
        return true;
    }

    @Override // android.view.View, androidx.core.view.v0
    public boolean startNestedScroll(int i10) {
        return f(i10, 0);
    }

    @Override // android.view.View, androidx.core.view.v0
    public void stopNestedScroll() {
        c(0);
    }

    @Override // androidx.core.view.x0
    public boolean t(@NonNull View view, @NonNull View view2, int i10, int i11) {
        return (i10 & 2) != 0;
    }

    public boolean x(@NonNull KeyEvent keyEvent) {
        this.f49050c.setEmpty();
        if (!k()) {
            if (isFocused() && keyEvent.getKeyCode() != 4) {
                View viewFindFocus = findFocus();
                if (viewFindFocus == this) {
                    viewFindFocus = null;
                }
                View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, 130);
                if (viewFindNextFocus != null && viewFindNextFocus != this && viewFindNextFocus.requestFocus(130)) {
                    return true;
                }
            }
            return false;
        }
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 19) {
                return keyEvent.isAltPressed() ? A(33) : i(33);
            }
            if (keyCode == 20) {
                return keyEvent.isAltPressed() ? A(130) : i(130);
            }
            if (keyCode == 62) {
                P(keyEvent.isShiftPressed() ? 33 : 130);
                return false;
            }
            if (keyCode == 92) {
                return A(33);
            }
            if (keyCode == 93) {
                return A(130);
            }
            if (keyCode == 122) {
                P(33);
                return false;
            }
            if (keyCode == 123) {
                P(130);
                return false;
            }
        }
        return false;
    }

    public void z(int i10) {
        if (getChildCount() > 0) {
            this.f49051d.fling(getScrollX(), getScrollY(), 0, i10, 0, 0, Integer.MIN_VALUE, Integer.MAX_VALUE, 0, 0);
            S(true);
            if (androidx.core.os.b.m()) {
                c.a(this, Math.abs(this.f49051d.getCurrVelocity()));
            }
        }
    }

    public NestedScrollView(@NonNull Context context, @p0 AttributeSet attributeSet) {
        this(context, attributeSet, i1.a.C1919a.f286718o);
    }

    public NestedScrollView(@NonNull Context context, @p0 AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f49050c = new Rect();
        this.f49056h = true;
        this.f49058i = false;
        this.f49060j = null;
        this.f49062k = false;
        this.f49067n = true;
        this.f49074v = -1;
        this.f49075w = new int[2];
        this.f49069p0 = new int[2];
        d dVar = new d();
        this.f49063k3 = dVar;
        this.f49065l3 = new androidx.core.view.v(getContext(), dVar);
        this.f49052e = j.a(context, attributeSet);
        this.f49053f = j.a(context, attributeSet);
        this.f49048a = context.getResources().getDisplayMetrics().density * 160.0f * 386.0878f * 0.84f;
        E();
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, f49047w3, i10, 0);
        setFillViewport(typedArrayObtainStyledAttributes.getBoolean(0, false));
        typedArrayObtainStyledAttributes.recycle();
        this.f49055g3 = new a1(this);
        this.f49057h3 = new w0(this);
        setNestedScrollingEnabled(true);
        u1.G1(this, f49046v3);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10) {
        if (getChildCount() <= 0) {
            super.addView(view, i10);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void addView(View view, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() > 0) {
            throw new IllegalStateException("ScrollView can host only one direct child");
        }
        super.addView(view, layoutParams);
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (getChildCount() <= 0) {
            super.addView(view, i10, layoutParams);
            return;
        }
        throw new IllegalStateException("ScrollView can host only one direct child");
    }
}

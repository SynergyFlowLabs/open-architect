package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.Region;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.ViewTreeObserver;
import androidx.annotation.NonNull;
import androidx.annotation.l;
import androidx.annotation.l1;
import androidx.annotation.p0;
import androidx.annotation.v;
import androidx.annotation.x;
import androidx.core.util.o;
import androidx.core.util.s;
import androidx.core.view.a1;
import androidx.core.view.b1;
import androidx.core.view.d0;
import androidx.core.view.g3;
import androidx.core.view.u1;
import androidx.core.view.x0;
import androidx.core.view.y0;
import androidx.customview.view.AbsSavedState;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.reflect.Constructor;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes2.dex */
public class CoordinatorLayout extends ViewGroup implements x0, y0 {
    static final String H1;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    private static final int f46815g3 = 1;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    static final Class<?>[] f46816h3;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    static final ThreadLocal<Map<String, Constructor<c>>> f46817i3;

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    static final int f46818j3 = 0;

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    static final int f46819k3 = 1;

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    static final int f46820l3 = 2;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    static final Comparator<View> f46821m3;

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    private static final s.a<Rect> f46822n3;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    static final String f46823p1 = "CoordinatorLayout";

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private static final int f46824p2 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final List<View> f46825a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final androidx.coordinatorlayout.widget.a<View> f46826b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final List<View> f46827c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final List<View> f46828d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Paint f46829e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final int[] f46830f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final int[] f46831g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f46832h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f46833i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int[] f46834j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private View f46835k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private View f46836l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private h f46837m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f46838n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private g3 f46839o;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private final a1 f46840p0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f46841s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private Drawable f46842t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    ViewGroup.OnHierarchyChangeListener f46843v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private b1 f46844w;

    class a implements b1 {
        a() {
        }

        @Override // androidx.core.view.b1
        public g3 b(View view, g3 g3Var) {
            return CoordinatorLayout.this.b0(g3Var);
        }
    }

    public interface b {
        @NonNull
        c getBehavior();
    }

    public static abstract class c<V extends View> {
        public c() {
        }

        public static void M(@NonNull View view, @p0 Object obj) {
            ((g) view.getLayoutParams()).f46865r = obj;
        }

        @p0
        public static Object l(@NonNull View view) {
            return ((g) view.getLayoutParams()).f46865r;
        }

        @Deprecated
        public void A(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v10, @NonNull View view, int i10, int i11, int i12, int i13, int i14) {
            if (i14 == 0) {
                z(coordinatorLayout, v10, view, i10, i11, i12, i13);
            }
        }

        public void B(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v10, @NonNull View view, int i10, int i11, int i12, int i13, int i14, @NonNull int[] iArr) {
            iArr[0] = iArr[0] + i12;
            iArr[1] = iArr[1] + i13;
            A(coordinatorLayout, v10, view, i10, i11, i12, i13, i14);
        }

        @Deprecated
        public void C(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v10, @NonNull View view, @NonNull View view2, int i10) {
        }

        public void D(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v10, @NonNull View view, @NonNull View view2, int i10, int i11) {
            if (i11 == 0) {
                C(coordinatorLayout, v10, view, view2, i10);
            }
        }

        public boolean E(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v10, @NonNull Rect rect, boolean z10) {
            return false;
        }

        public void F(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v10, @NonNull Parcelable parcelable) {
        }

        @p0
        public Parcelable G(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v10) {
            return View.BaseSavedState.EMPTY_STATE;
        }

        @Deprecated
        public boolean H(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v10, @NonNull View view, @NonNull View view2, int i10) {
            return false;
        }

        public boolean I(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v10, @NonNull View view, @NonNull View view2, int i10, int i11) {
            if (i11 == 0) {
                return H(coordinatorLayout, v10, view, view2, i10);
            }
            return false;
        }

        @Deprecated
        public void J(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v10, @NonNull View view) {
        }

        public void K(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v10, @NonNull View view, int i10) {
            if (i10 == 0) {
                J(coordinatorLayout, v10, view);
            }
        }

        public boolean L(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v10, @NonNull MotionEvent motionEvent) {
            return false;
        }

        public boolean h(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v10) {
            return k(coordinatorLayout, v10) > 0.0f;
        }

        public boolean i(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v10, @NonNull Rect rect) {
            return false;
        }

        @l
        public int j(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v10) {
            return -16777216;
        }

        @x(from = 0.0d, to = 1.0d)
        public float k(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v10) {
            return 0.0f;
        }

        public boolean m(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v10, @NonNull View view) {
            return false;
        }

        @NonNull
        public g3 n(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v10, @NonNull g3 g3Var) {
            return g3Var;
        }

        public void o(@NonNull g gVar) {
        }

        public boolean p(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v10, @NonNull View view) {
            return false;
        }

        public void q(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v10, @NonNull View view) {
        }

        public void r() {
        }

        public boolean s(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v10, @NonNull MotionEvent motionEvent) {
            return false;
        }

        public boolean t(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v10, int i10) {
            return false;
        }

        public boolean u(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v10, int i10, int i11, int i12, int i13) {
            return false;
        }

        public boolean v(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v10, @NonNull View view, float f10, float f11, boolean z10) {
            return false;
        }

        public boolean w(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v10, @NonNull View view, float f10, float f11) {
            return false;
        }

        @Deprecated
        public void x(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v10, @NonNull View view, int i10, int i11, @NonNull int[] iArr) {
        }

        public void y(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v10, @NonNull View view, int i10, int i11, @NonNull int[] iArr, int i12) {
            if (i12 == 0) {
                x(coordinatorLayout, v10, view, i10, i11, iArr);
            }
        }

        @Deprecated
        public void z(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v10, @NonNull View view, int i10, int i11, int i12, int i13) {
        }

        public c(Context context, AttributeSet attributeSet) {
        }
    }

    @Retention(RetentionPolicy.RUNTIME)
    @Deprecated
    public @interface d {
        Class<? extends c> value();
    }

    @Retention(RetentionPolicy.SOURCE)
    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    public @interface e {
    }

    private class f implements ViewGroup.OnHierarchyChangeListener {
        f() {
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewAdded(View view, View view2) {
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f46843v;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewAdded(view, view2);
            }
        }

        @Override // android.view.ViewGroup.OnHierarchyChangeListener
        public void onChildViewRemoved(View view, View view2) {
            CoordinatorLayout.this.M(2);
            ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener = CoordinatorLayout.this.f46843v;
            if (onHierarchyChangeListener != null) {
                onHierarchyChangeListener.onChildViewRemoved(view, view2);
            }
        }
    }

    class h implements ViewTreeObserver.OnPreDrawListener {
        h() {
        }

        @Override // android.view.ViewTreeObserver.OnPreDrawListener
        public boolean onPreDraw() {
            CoordinatorLayout.this.M(0);
            return true;
        }
    }

    static class i implements Comparator<View> {
        i() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(View view, View view2) {
            float fI0 = u1.I0(view);
            float fI1 = u1.I0(view2);
            if (fI0 > fI1) {
                return -1;
            }
            return fI0 < fI1 ? 1 : 0;
        }
    }

    static {
        Package r10 = CoordinatorLayout.class.getPackage();
        H1 = r10 != null ? r10.getName() : null;
        f46821m3 = new i();
        f46816h3 = new Class[]{Context.class, AttributeSet.class};
        f46817i3 = new ThreadLocal<>();
        f46822n3 = new s.c(12);
    }

    public CoordinatorLayout(@NonNull Context context) {
        this(context, null);
    }

    private void A(View view, int i10, Rect rect, Rect rect2, g gVar, int i11, int i12) {
        int iWidth;
        int iHeight;
        int iD = d0.d(W(gVar.f46850c), i10);
        int iD2 = d0.d(X(gVar.f46851d), i10);
        int i13 = iD & 7;
        int i14 = iD & com.planner5d.library.engine.input.f.b.B;
        int i15 = iD2 & 7;
        int i16 = iD2 & com.planner5d.library.engine.input.f.b.B;
        if (i15 != 1) {
            iWidth = i15 != 5 ? rect.left : rect.right;
        } else {
            iWidth = rect.left + (rect.width() / 2);
        }
        if (i16 != 16) {
            iHeight = i16 != 80 ? rect.top : rect.bottom;
        } else {
            iHeight = rect.top + (rect.height() / 2);
        }
        if (i13 == 1) {
            iWidth -= i11 / 2;
        } else if (i13 != 5) {
            iWidth -= i11;
        }
        if (i14 == 16) {
            iHeight -= i12 / 2;
        } else if (i14 != 80) {
            iHeight -= i12;
        }
        rect2.set(iWidth, iHeight, i11 + iWidth, i12 + iHeight);
    }

    private int B(int i10) {
        int[] iArr = this.f46834j;
        if (iArr == null) {
            toString();
            return 0;
        }
        if (i10 >= 0 && i10 < iArr.length) {
            return iArr[i10];
        }
        toString();
        return 0;
    }

    private void E(List<View> list) {
        list.clear();
        boolean zIsChildrenDrawingOrderEnabled = isChildrenDrawingOrderEnabled();
        int childCount = getChildCount();
        for (int i10 = childCount - 1; i10 >= 0; i10--) {
            list.add(getChildAt(zIsChildrenDrawingOrderEnabled ? getChildDrawingOrder(childCount, i10) : i10));
        }
        Comparator<View> comparator = f46821m3;
        if (comparator != null) {
            Collections.sort(list, comparator);
        }
    }

    private boolean F(View view) {
        return this.f46826b.j(view);
    }

    private void H(View view, int i10) {
        g gVar = (g) view.getLayoutParams();
        Rect rectE = e();
        rectE.set(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) gVar).leftMargin, getPaddingTop() + ((ViewGroup.MarginLayoutParams) gVar).topMargin, (getWidth() - getPaddingRight()) - ((ViewGroup.MarginLayoutParams) gVar).rightMargin, (getHeight() - getPaddingBottom()) - ((ViewGroup.MarginLayoutParams) gVar).bottomMargin);
        if (this.f46839o != null && u1.W(this) && !u1.W(view)) {
            rectE.left += this.f46839o.p();
            rectE.top += this.f46839o.r();
            rectE.right -= this.f46839o.q();
            rectE.bottom -= this.f46839o.o();
        }
        Rect rectE2 = e();
        d0.b(X(gVar.f46850c), view.getMeasuredWidth(), view.getMeasuredHeight(), rectE, rectE2, i10);
        view.layout(rectE2.left, rectE2.top, rectE2.right, rectE2.bottom);
        T(rectE);
        T(rectE2);
    }

    private void I(View view, View view2, int i10) {
        Rect rectE = e();
        Rect rectE2 = e();
        try {
            y(view2, rectE);
            z(view, i10, rectE, rectE2);
            view.layout(rectE2.left, rectE2.top, rectE2.right, rectE2.bottom);
            T(rectE);
            T(rectE2);
        } catch (Throwable th2) {
            T(rectE);
            T(rectE2);
            throw th2;
        }
    }

    private void J(View view, int i10, int i11) {
        int i12;
        g gVar = (g) view.getLayoutParams();
        int iD = d0.d(Y(gVar.f46850c), i11);
        int i13 = iD & 7;
        int i14 = iD & com.planner5d.library.engine.input.f.b.B;
        int width = getWidth();
        int height = getHeight();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        if (i11 == 1) {
            i10 = width - i10;
        }
        int iB = B(i10) - measuredWidth;
        if (i13 == 1) {
            iB += measuredWidth / 2;
        } else if (i13 == 5) {
            iB += measuredWidth;
        }
        if (i14 != 16) {
            i12 = i14 != 80 ? 0 : measuredHeight;
        } else {
            i12 = measuredHeight / 2;
        }
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) gVar).leftMargin, Math.min(iB, ((width - getPaddingRight()) - measuredWidth) - ((ViewGroup.MarginLayoutParams) gVar).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) gVar).topMargin, Math.min(i12, ((height - getPaddingBottom()) - measuredHeight) - ((ViewGroup.MarginLayoutParams) gVar).bottomMargin));
        view.layout(iMax, iMax2, measuredWidth + iMax, measuredHeight + iMax2);
    }

    private void K(View view, Rect rect, int i10) {
        boolean z10;
        boolean z11;
        int width;
        int i11;
        int i12;
        int i13;
        int height;
        int i14;
        int i15;
        int i16;
        if (u1.Y0(view) && view.getWidth() > 0 && view.getHeight() > 0) {
            g gVar = (g) view.getLayoutParams();
            c cVarF = gVar.f();
            Rect rectE = e();
            Rect rectE2 = e();
            rectE2.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
            if (cVarF == null || !cVarF.i(this, view, rectE)) {
                rectE.set(rectE2);
            } else if (!rectE2.contains(rectE)) {
                throw new IllegalArgumentException("Rect should be within the child's bounds. Rect:" + rectE.toShortString() + " | Bounds:" + rectE2.toShortString());
            }
            T(rectE2);
            if (rectE.isEmpty()) {
                T(rectE);
                return;
            }
            int iD = d0.d(gVar.f46855h, i10);
            boolean z12 = true;
            if ((iD & 48) != 48 || (i15 = (rectE.top - ((ViewGroup.MarginLayoutParams) gVar).topMargin) - gVar.f46857j) >= (i16 = rect.top)) {
                z10 = false;
            } else {
                a0(view, i16 - i15);
                z10 = true;
            }
            if ((iD & 80) == 80 && (height = ((getHeight() - rectE.bottom) - ((ViewGroup.MarginLayoutParams) gVar).bottomMargin) + gVar.f46857j) < (i14 = rect.bottom)) {
                a0(view, height - i14);
                z10 = true;
            }
            if (!z10) {
                a0(view, 0);
            }
            if ((iD & 3) != 3 || (i12 = (rectE.left - ((ViewGroup.MarginLayoutParams) gVar).leftMargin) - gVar.f46856i) >= (i13 = rect.left)) {
                z11 = false;
            } else {
                Z(view, i13 - i12);
                z11 = true;
            }
            if ((iD & 5) != 5 || (width = ((getWidth() - rectE.right) - ((ViewGroup.MarginLayoutParams) gVar).rightMargin) + gVar.f46856i) >= (i11 = rect.right)) {
                z12 = z11;
            } else {
                Z(view, width - i11);
            }
            if (!z12) {
                Z(view, 0);
            }
            T(rectE);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    static c P(Context context, AttributeSet attributeSet, String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith(".")) {
            str = context.getPackageName() + str;
        } else if (str.indexOf(46) < 0) {
            String str2 = H1;
            if (!TextUtils.isEmpty(str2)) {
                str = str2 + '.' + str;
            }
        }
        try {
            ThreadLocal<Map<String, Constructor<c>>> threadLocal = f46817i3;
            Map<String, Constructor<c>> map = threadLocal.get();
            if (map == null) {
                map = new HashMap<>();
                threadLocal.set(map);
            }
            Constructor<c> constructor = map.get(str);
            if (constructor == null) {
                constructor = Class.forName(str, false, context.getClassLoader()).getConstructor(f46816h3);
                constructor.setAccessible(true);
                map.put(str, constructor);
            }
            return constructor.newInstance(context, attributeSet);
        } catch (Exception e10) {
            throw new RuntimeException("Could not inflate Behavior subclass " + str, e10);
        }
    }

    private boolean Q(MotionEvent motionEvent, int i10) {
        int actionMasked = motionEvent.getActionMasked();
        List<View> list = this.f46827c;
        E(list);
        int size = list.size();
        MotionEvent motionEventObtain = null;
        boolean zS = false;
        boolean z10 = false;
        for (int i11 = 0; i11 < size; i11++) {
            View view = list.get(i11);
            g gVar = (g) view.getLayoutParams();
            c cVarF = gVar.f();
            if (!(zS || z10) || actionMasked == 0) {
                if (!zS && cVarF != null) {
                    if (i10 == 0) {
                        zS = cVarF.s(this, view, motionEvent);
                    } else if (i10 == 1) {
                        zS = cVarF.L(this, view, motionEvent);
                    }
                    if (zS) {
                        this.f46835k = view;
                    }
                }
                boolean zC = gVar.c();
                boolean zJ = gVar.j(this, view);
                z10 = zJ && !zC;
                if (zJ && !z10) {
                    break;
                }
            } else if (cVarF != null) {
                if (motionEventObtain == null) {
                    long jUptimeMillis = SystemClock.uptimeMillis();
                    motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                }
                if (i10 == 0) {
                    cVarF.s(this, view, motionEventObtain);
                } else if (i10 == 1) {
                    cVarF.L(this, view, motionEventObtain);
                }
            }
        }
        list.clear();
        return zS;
    }

    private void R() {
        this.f46825a.clear();
        this.f46826b.c();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            g gVarD = D(childAt);
            gVarD.d(this, childAt);
            this.f46826b.b(childAt);
            for (int i11 = 0; i11 < childCount; i11++) {
                if (i11 != i10) {
                    View childAt2 = getChildAt(i11);
                    if (gVarD.b(this, childAt, childAt2)) {
                        if (!this.f46826b.d(childAt2)) {
                            this.f46826b.b(childAt2);
                        }
                        this.f46826b.a(childAt2, childAt);
                    }
                }
            }
        }
        this.f46825a.addAll(this.f46826b.i());
        Collections.reverse(this.f46825a);
    }

    private static void T(@NonNull Rect rect) {
        rect.setEmpty();
        f46822n3.a(rect);
    }

    private void V(boolean z10) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            c cVarF = ((g) childAt.getLayoutParams()).f();
            if (cVarF != null) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                if (z10) {
                    cVarF.s(this, childAt, motionEventObtain);
                } else {
                    cVarF.L(this, childAt, motionEventObtain);
                }
                motionEventObtain.recycle();
            }
        }
        for (int i11 = 0; i11 < childCount; i11++) {
            ((g) getChildAt(i11).getLayoutParams()).n();
        }
        this.f46835k = null;
        this.f46832h = false;
    }

    private static int W(int i10) {
        if (i10 == 0) {
            return 17;
        }
        return i10;
    }

    private static int X(int i10) {
        if ((i10 & 7) == 0) {
            i10 |= d0.f48643b;
        }
        if ((i10 & com.planner5d.library.engine.input.f.b.B) == 0) {
            i10 |= 48;
        }
        return i10;
    }

    private static int Y(int i10) {
        if (i10 == 0) {
            i10 = 8388661;
        }
        return i10;
    }

    private void Z(View view, int i10) {
        g gVar = (g) view.getLayoutParams();
        int i11 = gVar.f46856i;
        if (i11 != i10) {
            u1.h1(view, i10 - i11);
            gVar.f46856i = i10;
        }
    }

    private void a0(View view, int i10) {
        g gVar = (g) view.getLayoutParams();
        int i11 = gVar.f46857j;
        if (i11 != i10) {
            u1.i1(view, i10 - i11);
            gVar.f46857j = i10;
        }
    }

    private void c0() {
        if (!u1.W(this)) {
            u1.j2(this, null);
            return;
        }
        if (this.f46844w == null) {
            this.f46844w = new a();
        }
        u1.j2(this, this.f46844w);
        setSystemUiVisibility(1280);
    }

    @NonNull
    private static Rect e() {
        Rect rectAcquire = f46822n3.acquire();
        if (rectAcquire == null) {
            rectAcquire = new Rect();
        }
        return rectAcquire;
    }

    private static int g(int i10, int i11, int i12) {
        if (i10 < i11) {
            return i11;
        }
        return i10 > i12 ? i12 : i10;
    }

    private void h(g gVar, Rect rect, int i10, int i11) {
        int width = getWidth();
        int height = getHeight();
        int iMax = Math.max(getPaddingLeft() + ((ViewGroup.MarginLayoutParams) gVar).leftMargin, Math.min(rect.left, ((width - getPaddingRight()) - i10) - ((ViewGroup.MarginLayoutParams) gVar).rightMargin));
        int iMax2 = Math.max(getPaddingTop() + ((ViewGroup.MarginLayoutParams) gVar).topMargin, Math.min(rect.top, ((height - getPaddingBottom()) - i11) - ((ViewGroup.MarginLayoutParams) gVar).bottomMargin));
        rect.set(iMax, iMax2, i10 + iMax, i11 + iMax2);
    }

    private g3 i(g3 g3Var) {
        c cVarF;
        if (g3Var.A()) {
            return g3Var;
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (u1.W(childAt) && (cVarF = ((g) childAt.getLayoutParams()).f()) != null) {
                g3Var = cVarF.n(this, childAt, g3Var);
                if (g3Var.A()) {
                    return g3Var;
                }
            }
        }
        return g3Var;
    }

    void C(View view, Rect rect) {
        rect.set(((g) view.getLayoutParams()).h());
    }

    /* JADX WARN: Multi-variable type inference failed */
    g D(View view) {
        g gVar = (g) view.getLayoutParams();
        if (!gVar.f46849b) {
            if (view instanceof b) {
                gVar.q(((b) view).getBehavior());
                gVar.f46849b = true;
                return gVar;
            }
            d dVar = null;
            for (Class<?> superclass = view.getClass(); superclass != null; superclass = superclass.getSuperclass()) {
                dVar = (d) superclass.getAnnotation(d.class);
                if (dVar != null) {
                    break;
                }
            }
            if (dVar != null) {
                try {
                    gVar.q(dVar.value().getDeclaredConstructor(null).newInstance(null));
                } catch (Exception unused) {
                    dVar.value().getName();
                }
            }
            gVar.f46849b = true;
        }
        return gVar;
    }

    public boolean G(@NonNull View view, int i10, int i11) {
        Rect rectE = e();
        y(view, rectE);
        try {
            return rectE.contains(i10, i11);
        } finally {
            T(rectE);
        }
    }

    void L(View view, int i10) {
        c cVarF;
        g gVar = (g) view.getLayoutParams();
        if (gVar.f46858k != null) {
            Rect rectE = e();
            Rect rectE2 = e();
            Rect rectE3 = e();
            y(gVar.f46858k, rectE);
            v(view, false, rectE2);
            int measuredWidth = view.getMeasuredWidth();
            int measuredHeight = view.getMeasuredHeight();
            A(view, i10, rectE, rectE3, gVar, measuredWidth, measuredHeight);
            boolean z10 = (rectE3.left == rectE2.left && rectE3.top == rectE2.top) ? false : true;
            h(gVar, rectE3, measuredWidth, measuredHeight);
            int i11 = rectE3.left - rectE2.left;
            int i12 = rectE3.top - rectE2.top;
            if (i11 != 0) {
                u1.h1(view, i11);
            }
            if (i12 != 0) {
                u1.i1(view, i12);
            }
            if (z10 && (cVarF = gVar.f()) != null) {
                cVarF.p(this, view, gVar.f46858k);
            }
            T(rectE);
            T(rectE2);
            T(rectE3);
        }
    }

    /* JADX WARN: Code duplicated, block: B:46:0x00cb  */
    final void M(int i10) {
        int i11;
        c cVarF;
        boolean zP;
        int iC0 = u1.c0(this);
        int size = this.f46825a.size();
        Rect rectE = e();
        Rect rectE2 = e();
        Rect rectE3 = e();
        for (int i12 = 0; i12 < size; i12++) {
            View view = this.f46825a.get(i12);
            g gVar = (g) view.getLayoutParams();
            if (i10 != 0 || view.getVisibility() != 8) {
                for (int i13 = 0; i13 < i12; i13++) {
                    if (gVar.f46859l == this.f46825a.get(i13)) {
                        L(view, iC0);
                    }
                }
                v(view, true, rectE2);
                if (gVar.f46854g != 0 && !rectE2.isEmpty()) {
                    int iD = d0.d(gVar.f46854g, iC0);
                    int i14 = iD & com.planner5d.library.engine.input.f.b.B;
                    if (i14 == 48) {
                        rectE.top = Math.max(rectE.top, rectE2.bottom);
                    } else if (i14 == 80) {
                        rectE.bottom = Math.max(rectE.bottom, getHeight() - rectE2.top);
                    }
                    int i15 = iD & 7;
                    if (i15 == 3) {
                        rectE.left = Math.max(rectE.left, rectE2.right);
                    } else if (i15 == 5) {
                        rectE.right = Math.max(rectE.right, getWidth() - rectE2.left);
                    }
                }
                if (gVar.f46855h != 0 && view.getVisibility() == 0) {
                    K(view, rectE, iC0);
                }
                if (i10 != 2) {
                    C(view, rectE3);
                    if (!rectE3.equals(rectE2)) {
                        S(view, rectE2);
                        for (i11 = i12 + 1; i11 < size; i11++) {
                            View view2 = this.f46825a.get(i11);
                            g gVar2 = (g) view2.getLayoutParams();
                            cVarF = gVar2.f();
                            if (cVarF == null && cVarF.m(this, view2, view)) {
                                if (i10 == 0 && gVar2.g()) {
                                    gVar2.l();
                                } else {
                                    if (i10 != 2) {
                                        zP = cVarF.p(this, view2, view);
                                    } else {
                                        cVarF.q(this, view2, view);
                                        zP = true;
                                    }
                                    if (i10 == 1) {
                                        gVar2.r(zP);
                                    }
                                }
                            }
                        }
                    }
                } else {
                    while (i11 < size) {
                        View view3 = this.f46825a.get(i11);
                        g gVar3 = (g) view3.getLayoutParams();
                        cVarF = gVar3.f();
                        if (cVarF == null) {
                        }
                    }
                }
            }
        }
        T(rectE);
        T(rectE2);
        T(rectE3);
    }

    public void N(@NonNull View view, int i10) {
        g gVar = (g) view.getLayoutParams();
        if (gVar.a()) {
            throw new IllegalStateException("An anchor may not be changed after CoordinatorLayout measurement begins before layout is complete.");
        }
        View view2 = gVar.f46858k;
        if (view2 != null) {
            I(view, view2, i10);
            return;
        }
        int i11 = gVar.f46852e;
        if (i11 >= 0) {
            J(view, i11, i10);
        } else {
            H(view, i10);
        }
    }

    public void O(View view, int i10, int i11, int i12, int i13) {
        measureChildWithMargins(view, i10, i11, i12, i13);
    }

    void S(View view, Rect rect) {
        ((g) view.getLayoutParams()).s(rect);
    }

    void U() {
        if (this.f46833i && this.f46837m != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f46837m);
        }
        this.f46838n = false;
    }

    final g3 b0(g3 g3Var) {
        if (o.a(this.f46839o, g3Var)) {
            return g3Var;
        }
        this.f46839o = g3Var;
        boolean z10 = false;
        boolean z11 = g3Var != null && g3Var.r() > 0;
        this.f46841s = z11;
        if (!z11 && getBackground() == null) {
            z10 = true;
        }
        setWillNotDraw(z10);
        g3 g3VarI = i(g3Var);
        requestLayout();
        return g3VarI;
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof g) && super.checkLayoutParams(layoutParams);
    }

    /* JADX WARN: Code duplicated, block: B:13:0x0091  */
    @Override // android.view.ViewGroup
    protected boolean drawChild(Canvas canvas, View view, long j10) {
        g gVar = (g) view.getLayoutParams();
        c cVar = gVar.f46848a;
        if (cVar != null) {
            float fK = cVar.k(this, view);
            if (fK > 0.0f) {
                if (this.f46829e == null) {
                    this.f46829e = new Paint();
                }
                this.f46829e.setColor(gVar.f46848a.j(this, view));
                this.f46829e.setAlpha(g(Math.round(fK * 255.0f), 0, 255));
                int iSave = canvas.save();
                if (view.isOpaque()) {
                    canvas.clipRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom(), Region.Op.DIFFERENCE);
                }
                canvas.drawRect(getPaddingLeft(), getPaddingTop(), getWidth() - getPaddingRight(), getHeight() - getPaddingBottom(), this.f46829e);
                canvas.restoreToCount(iSave);
            }
        }
        return super.drawChild(canvas, view, j10);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        int[] drawableState = getDrawableState();
        Drawable drawable = this.f46842t;
        if ((drawable == null || !drawable.isStateful()) ? false : drawable.setState(drawableState)) {
            invalidate();
        }
    }

    void f() {
        if (this.f46833i) {
            if (this.f46837m == null) {
                this.f46837m = new h();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f46837m);
        }
        this.f46838n = true;
    }

    @l1
    final List<View> getDependencySortedChildren() {
        R();
        return Collections.unmodifiableList(this.f46825a);
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    public final g3 getLastWindowInsets() {
        return this.f46839o;
    }

    @Override // android.view.ViewGroup, androidx.core.view.z0
    public int getNestedScrollAxes() {
        return this.f46840p0.a();
    }

    @p0
    public Drawable getStatusBarBackground() {
        return this.f46842t;
    }

    @Override // android.view.View
    protected int getSuggestedMinimumHeight() {
        return Math.max(super.getSuggestedMinimumHeight(), getPaddingTop() + getPaddingBottom());
    }

    @Override // android.view.View
    protected int getSuggestedMinimumWidth() {
        return Math.max(super.getSuggestedMinimumWidth(), getPaddingLeft() + getPaddingRight());
    }

    public void j(@NonNull View view) {
        List listG = this.f46826b.g(view);
        if (listG != null && !listG.isEmpty()) {
            for (int i10 = 0; i10 < listG.size(); i10++) {
                View view2 = (View) listG.get(i10);
                c cVarF = ((g) view2.getLayoutParams()).f();
                if (cVarF != null) {
                    cVarF.p(this, view2, view);
                }
            }
        }
    }

    public boolean k(@NonNull View view, @NonNull View view2) {
        boolean z10 = false;
        if (view.getVisibility() != 0 || view2.getVisibility() != 0) {
            return false;
        }
        Rect rectE = e();
        v(view, view.getParent() != this, rectE);
        Rect rectE2 = e();
        v(view2, view2.getParent() != this, rectE2);
        try {
            if (rectE.left <= rectE2.right && rectE.top <= rectE2.bottom && rectE.right >= rectE2.left && rectE.bottom >= rectE2.top) {
                z10 = true;
            }
            return z10;
        } finally {
            T(rectE);
            T(rectE2);
        }
    }

    @Override // androidx.core.view.x0
    public void l(View view, View view2, int i10, int i11) {
        c cVarF;
        CoordinatorLayout coordinatorLayout;
        View view3;
        View view4;
        int i12;
        int i13;
        this.f46840p0.c(view, view2, i10, i11);
        this.f46836l = view2;
        int childCount = getChildCount();
        int i14 = 0;
        while (i14 < childCount) {
            View childAt = this.getChildAt(i14);
            g gVar = (g) childAt.getLayoutParams();
            if (gVar.k(i11) && (cVarF = gVar.f()) != null) {
                coordinatorLayout = this;
                view3 = view;
                view4 = view2;
                i12 = i10;
                i13 = i11;
                cVarF.D(coordinatorLayout, childAt, view3, view4, i12, i13);
            } else {
                coordinatorLayout = this;
                view3 = view;
                view4 = view2;
                i12 = i10;
                i13 = i11;
            }
            i14++;
            this = coordinatorLayout;
            view = view3;
            view2 = view4;
            i10 = i12;
            i11 = i13;
        }
    }

    @Override // androidx.core.view.x0
    public void m(View view, int i10) {
        this.f46840p0.e(view, i10);
        int childCount = getChildCount();
        for (int i11 = 0; i11 < childCount; i11++) {
            View childAt = getChildAt(i11);
            g gVar = (g) childAt.getLayoutParams();
            if (gVar.k(i10)) {
                c cVarF = gVar.f();
                if (cVarF != null) {
                    cVarF.K(this, childAt, view, i10);
                }
                gVar.m(i10);
                gVar.l();
            }
        }
        this.f46836l = null;
    }

    void n() {
        int childCount = getChildCount();
        boolean z10 = false;
        for (int i10 = 0; i10 < childCount; i10++) {
            if (F(getChildAt(i10))) {
                z10 = true;
                break;
            }
        }
        if (z10 != this.f46838n) {
            if (z10) {
                f();
            } else {
                U();
            }
        }
    }

    @Override // androidx.core.view.x0
    public void o(View view, int i10, int i11, int i12, int i13, int i14) {
        s(view, i10, i11, i12, i13, 0, this.f46831g);
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        V(false);
        if (this.f46838n) {
            if (this.f46837m == null) {
                this.f46837m = new h();
            }
            getViewTreeObserver().addOnPreDrawListener(this.f46837m);
        }
        if (this.f46839o == null && u1.W(this)) {
            u1.A1(this);
        }
        this.f46833i = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        V(false);
        if (this.f46838n && this.f46837m != null) {
            getViewTreeObserver().removeOnPreDrawListener(this.f46837m);
        }
        View view = this.f46836l;
        if (view != null) {
            onStopNestedScroll(view);
        }
        this.f46833i = false;
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        if (!this.f46841s || this.f46842t == null) {
            return;
        }
        g3 g3Var = this.f46839o;
        int iR = g3Var != null ? g3Var.r() : 0;
        if (iR > 0) {
            this.f46842t.setBounds(0, 0, getWidth(), iR);
            this.f46842t.draw(canvas);
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            V(true);
        }
        boolean zQ = Q(motionEvent, 0);
        if (actionMasked != 1 && actionMasked != 3) {
            return zQ;
        }
        V(true);
        return zQ;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        c cVarF;
        int iC0 = u1.c0(this);
        int size = this.f46825a.size();
        for (int i14 = 0; i14 < size; i14++) {
            View view = this.f46825a.get(i14);
            if (view.getVisibility() != 8 && ((cVarF = ((g) view.getLayoutParams()).f()) == null || !cVarF.t(this, view, iC0))) {
                N(view, iC0);
            }
        }
    }

    /* JADX WARN: Code duplicated, block: B:38:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:41:0x0109  */
    /* JADX WARN: Code duplicated, block: B:44:0x0117  */
    /* JADX WARN: Code duplicated, block: B:47:0x013b  */
    /* JADX WARN: Code duplicated, block: B:48:0x013e  */
    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        int i12;
        int i13;
        int i14;
        int iMakeMeasureSpec;
        int iMakeMeasureSpec2;
        c cVarF;
        int i15;
        int i16;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        View view;
        int i22;
        int i23;
        boolean zU;
        int iMax;
        CoordinatorLayout coordinatorLayout = this;
        coordinatorLayout.R();
        coordinatorLayout.n();
        int paddingLeft = coordinatorLayout.getPaddingLeft();
        int paddingTop = coordinatorLayout.getPaddingTop();
        int paddingRight = coordinatorLayout.getPaddingRight();
        int paddingBottom = coordinatorLayout.getPaddingBottom();
        int iC0 = u1.c0(coordinatorLayout);
        boolean z10 = iC0 == 1;
        int mode = View.MeasureSpec.getMode(i10);
        int size = View.MeasureSpec.getSize(i10);
        int mode2 = View.MeasureSpec.getMode(i11);
        int size2 = View.MeasureSpec.getSize(i11);
        int i24 = paddingLeft + paddingRight;
        int i25 = paddingTop + paddingBottom;
        int suggestedMinimumWidth = coordinatorLayout.getSuggestedMinimumWidth();
        int suggestedMinimumHeight = coordinatorLayout.getSuggestedMinimumHeight();
        boolean z11 = coordinatorLayout.f46839o != null && u1.W(coordinatorLayout);
        int size3 = coordinatorLayout.f46825a.size();
        int i26 = 0;
        int iCombineMeasuredStates = 0;
        while (i26 < size3) {
            View view2 = coordinatorLayout.f46825a.get(i26);
            int i27 = suggestedMinimumWidth;
            if (view2.getVisibility() == 8) {
                i17 = size3;
                i13 = i26;
                i18 = paddingLeft;
                i15 = iC0;
                suggestedMinimumWidth = i27;
                i22 = paddingRight;
            } else {
                g gVar = (g) view2.getLayoutParams();
                int i28 = gVar.f46852e;
                if (i28 < 0 || mode == 0) {
                    i12 = suggestedMinimumHeight;
                } else {
                    int iB = coordinatorLayout.B(i28);
                    int iD = d0.d(Y(gVar.f46850c), iC0) & 7;
                    i12 = suggestedMinimumHeight;
                    if ((iD != 3 || z10) && !(iD == 5 && z10)) {
                        if ((iD == 5 && !z10) || (iD == 3 && z10)) {
                            iMax = Math.max(0, iB - paddingLeft);
                        }
                        if (z11 || u1.W(view2)) {
                            iMakeMeasureSpec = i10;
                            iMakeMeasureSpec2 = i11;
                        } else {
                            int iP = coordinatorLayout.f46839o.p() + coordinatorLayout.f46839o.q();
                            int iR = coordinatorLayout.f46839o.r() + coordinatorLayout.f46839o.o();
                            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(size - iP, mode);
                            iMakeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(size2 - iR, mode2);
                        }
                        cVarF = gVar.f();
                        if (cVarF != null) {
                            i17 = size3;
                            int i29 = iMakeMeasureSpec;
                            view = view2;
                            int i30 = i12;
                            i15 = iC0;
                            i16 = i30;
                            i18 = paddingLeft;
                            i19 = i27;
                            i22 = paddingRight;
                            i23 = iCombineMeasuredStates;
                            int i31 = iMakeMeasureSpec2;
                            zU = cVarF.u(this, view, i29, i14, i31, 0);
                            i21 = i29;
                            i20 = i31;
                            if (zU) {
                                coordinatorLayout = this;
                            }
                            suggestedMinimumWidth = Math.max(i19, i24 + view.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) gVar).leftMargin + ((ViewGroup.MarginLayoutParams) gVar).rightMargin);
                            int iMax2 = Math.max(i16, i25 + view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) gVar).topMargin + ((ViewGroup.MarginLayoutParams) gVar).bottomMargin);
                            iCombineMeasuredStates = View.combineMeasuredStates(i23, view.getMeasuredState());
                            suggestedMinimumHeight = iMax2;
                        } else {
                            int i32 = i12;
                            i15 = iC0;
                            i16 = i32;
                            i17 = size3;
                            i18 = paddingLeft;
                            i19 = i27;
                            i20 = iMakeMeasureSpec2;
                            i21 = iMakeMeasureSpec;
                            view = view2;
                            i22 = paddingRight;
                            i23 = iCombineMeasuredStates;
                        }
                        View view3 = view;
                        coordinatorLayout = this;
                        coordinatorLayout.O(view3, i21, i14, i20, 0);
                        view = view3;
                        suggestedMinimumWidth = Math.max(i19, i24 + view.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) gVar).leftMargin + ((ViewGroup.MarginLayoutParams) gVar).rightMargin);
                        int iMax3 = Math.max(i16, i25 + view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) gVar).topMargin + ((ViewGroup.MarginLayoutParams) gVar).bottomMargin);
                        iCombineMeasuredStates = View.combineMeasuredStates(i23, view.getMeasuredState());
                        suggestedMinimumHeight = iMax3;
                    } else {
                        iMax = Math.max(0, (size - paddingRight) - iB);
                    }
                    int i33 = i26;
                    i14 = iMax;
                    i13 = i33;
                    if (z11) {
                        iMakeMeasureSpec = i10;
                        iMakeMeasureSpec2 = i11;
                    } else {
                        iMakeMeasureSpec = i10;
                        iMakeMeasureSpec2 = i11;
                    }
                    cVarF = gVar.f();
                    if (cVarF != null) {
                        i17 = size3;
                        int i210 = iMakeMeasureSpec;
                        view = view2;
                        int i34 = i12;
                        i15 = iC0;
                        i16 = i34;
                        i18 = paddingLeft;
                        i19 = i27;
                        i22 = paddingRight;
                        i23 = iCombineMeasuredStates;
                        int i35 = iMakeMeasureSpec2;
                        zU = cVarF.u(this, view, i210, i14, i35, 0);
                        i21 = i210;
                        i20 = i35;
                        if (zU) {
                            coordinatorLayout = this;
                        }
                        suggestedMinimumWidth = Math.max(i19, i24 + view.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) gVar).leftMargin + ((ViewGroup.MarginLayoutParams) gVar).rightMargin);
                        int iMax4 = Math.max(i16, i25 + view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) gVar).topMargin + ((ViewGroup.MarginLayoutParams) gVar).bottomMargin);
                        iCombineMeasuredStates = View.combineMeasuredStates(i23, view.getMeasuredState());
                        suggestedMinimumHeight = iMax4;
                    } else {
                        int i36 = i12;
                        i15 = iC0;
                        i16 = i36;
                        i17 = size3;
                        i18 = paddingLeft;
                        i19 = i27;
                        i20 = iMakeMeasureSpec2;
                        i21 = iMakeMeasureSpec;
                        view = view2;
                        i22 = paddingRight;
                        i23 = iCombineMeasuredStates;
                    }
                    View view4 = view;
                    coordinatorLayout = this;
                    coordinatorLayout.O(view4, i21, i14, i20, 0);
                    view = view4;
                    suggestedMinimumWidth = Math.max(i19, i24 + view.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) gVar).leftMargin + ((ViewGroup.MarginLayoutParams) gVar).rightMargin);
                    int iMax5 = Math.max(i16, i25 + view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) gVar).topMargin + ((ViewGroup.MarginLayoutParams) gVar).bottomMargin);
                    iCombineMeasuredStates = View.combineMeasuredStates(i23, view.getMeasuredState());
                    suggestedMinimumHeight = iMax5;
                }
                i13 = i26;
                i14 = 0;
                if (z11) {
                    iMakeMeasureSpec = i10;
                    iMakeMeasureSpec2 = i11;
                } else {
                    iMakeMeasureSpec = i10;
                    iMakeMeasureSpec2 = i11;
                }
                cVarF = gVar.f();
                if (cVarF != null) {
                    i17 = size3;
                    int i211 = iMakeMeasureSpec;
                    view = view2;
                    int i37 = i12;
                    i15 = iC0;
                    i16 = i37;
                    i18 = paddingLeft;
                    i19 = i27;
                    i22 = paddingRight;
                    i23 = iCombineMeasuredStates;
                    int i38 = iMakeMeasureSpec2;
                    zU = cVarF.u(this, view, i211, i14, i38, 0);
                    i21 = i211;
                    i20 = i38;
                    if (zU) {
                        coordinatorLayout = this;
                    }
                    suggestedMinimumWidth = Math.max(i19, i24 + view.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) gVar).leftMargin + ((ViewGroup.MarginLayoutParams) gVar).rightMargin);
                    int iMax6 = Math.max(i16, i25 + view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) gVar).topMargin + ((ViewGroup.MarginLayoutParams) gVar).bottomMargin);
                    iCombineMeasuredStates = View.combineMeasuredStates(i23, view.getMeasuredState());
                    suggestedMinimumHeight = iMax6;
                } else {
                    int i39 = i12;
                    i15 = iC0;
                    i16 = i39;
                    i17 = size3;
                    i18 = paddingLeft;
                    i19 = i27;
                    i20 = iMakeMeasureSpec2;
                    i21 = iMakeMeasureSpec;
                    view = view2;
                    i22 = paddingRight;
                    i23 = iCombineMeasuredStates;
                }
                View view5 = view;
                coordinatorLayout = this;
                coordinatorLayout.O(view5, i21, i14, i20, 0);
                view = view5;
                suggestedMinimumWidth = Math.max(i19, i24 + view.getMeasuredWidth() + ((ViewGroup.MarginLayoutParams) gVar).leftMargin + ((ViewGroup.MarginLayoutParams) gVar).rightMargin);
                int iMax7 = Math.max(i16, i25 + view.getMeasuredHeight() + ((ViewGroup.MarginLayoutParams) gVar).topMargin + ((ViewGroup.MarginLayoutParams) gVar).bottomMargin);
                iCombineMeasuredStates = View.combineMeasuredStates(i23, view.getMeasuredState());
                suggestedMinimumHeight = iMax7;
            }
            i26 = i13 + 1;
            paddingLeft = i18;
            paddingRight = i22;
            iC0 = i15;
            size3 = i17;
        }
        int i40 = iCombineMeasuredStates;
        coordinatorLayout.setMeasuredDimension(View.resolveSizeAndState(suggestedMinimumWidth, i10, (-16777216) & i40), View.resolveSizeAndState(suggestedMinimumHeight, i11, i40 << 16));
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0016  */
    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.z0
    public boolean onNestedFling(View view, float f10, float f11, boolean z10) {
        c cVarF;
        CoordinatorLayout coordinatorLayout;
        View view2;
        float f12;
        float f13;
        boolean z11;
        int childCount = getChildCount();
        int i10 = 0;
        boolean zV = false;
        while (i10 < childCount) {
            View childAt = this.getChildAt(i10);
            if (childAt.getVisibility() == 8) {
                coordinatorLayout = this;
                view2 = view;
                f12 = f10;
                f13 = f11;
                z11 = z10;
            } else {
                g gVar = (g) childAt.getLayoutParams();
                if (gVar.k(0) && (cVarF = gVar.f()) != null) {
                    coordinatorLayout = this;
                    view2 = view;
                    f12 = f10;
                    f13 = f11;
                    z11 = z10;
                    zV |= cVarF.v(coordinatorLayout, childAt, view2, f12, f13, z11);
                } else {
                    coordinatorLayout = this;
                    view2 = view;
                    f12 = f10;
                    f13 = f11;
                    z11 = z10;
                }
            }
            i10++;
            this = coordinatorLayout;
            view = view2;
            f10 = f12;
            f11 = f13;
            z10 = z11;
        }
        CoordinatorLayout coordinatorLayout2 = this;
        if (zV) {
            coordinatorLayout2.M(1);
        }
        return zV;
    }

    /* JADX WARN: Code duplicated, block: B:6:0x0016  */
    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.z0
    public boolean onNestedPreFling(View view, float f10, float f11) {
        c cVarF;
        CoordinatorLayout coordinatorLayout;
        View view2;
        float f12;
        float f13;
        int childCount = getChildCount();
        int i10 = 0;
        boolean zW = false;
        while (i10 < childCount) {
            View childAt = this.getChildAt(i10);
            if (childAt.getVisibility() == 8) {
                coordinatorLayout = this;
                view2 = view;
                f12 = f10;
                f13 = f11;
            } else {
                g gVar = (g) childAt.getLayoutParams();
                if (gVar.k(0) && (cVarF = gVar.f()) != null) {
                    coordinatorLayout = this;
                    view2 = view;
                    f12 = f10;
                    f13 = f11;
                    zW |= cVarF.w(coordinatorLayout, childAt, view2, f12, f13);
                } else {
                    coordinatorLayout = this;
                    view2 = view;
                    f12 = f10;
                    f13 = f11;
                }
            }
            i10++;
            this = coordinatorLayout;
            view = view2;
            f10 = f12;
            f11 = f13;
        }
        return zW;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.z0
    public void onNestedPreScroll(View view, int i10, int i11, int[] iArr) {
        q(view, i10, i11, iArr, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.z0
    public void onNestedScroll(View view, int i10, int i11, int i12, int i13) {
        o(view, i10, i11, i12, i13, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.z0
    public void onNestedScrollAccepted(View view, View view2, int i10) {
        l(view, view2, i10, 0);
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        Parcelable parcelable2;
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        SparseArray<Parcelable> sparseArray = savedState.f46845c;
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            int id2 = childAt.getId();
            c cVarF = D(childAt).f();
            if (id2 != -1 && cVarF != null && (parcelable2 = sparseArray.get(id2)) != null) {
                cVarF.F(this, childAt, parcelable2);
            }
        }
    }

    @Override // android.view.View
    protected Parcelable onSaveInstanceState() {
        Parcelable parcelableG;
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        SparseArray<Parcelable> sparseArray = new SparseArray<>();
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            int id2 = childAt.getId();
            c cVarF = ((g) childAt.getLayoutParams()).f();
            if (id2 != -1 && cVarF != null && (parcelableG = cVarF.G(this, childAt)) != null) {
                sparseArray.append(id2, parcelableG);
            }
        }
        savedState.f46845c = sparseArray;
        return savedState;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.z0
    public boolean onStartNestedScroll(View view, View view2, int i10) {
        return t(view, view2, i10, 0);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent, androidx.core.view.z0
    public void onStopNestedScroll(View view) {
        m(view, 0);
    }

    /* JADX WARN: Code duplicated, block: B:14:0x0033  */
    /* JADX WARN: Code duplicated, block: B:15:0x0039 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:16:0x003b  */
    /* JADX WARN: Code duplicated, block: B:18:0x004e  */
    /* JADX WARN: Code duplicated, block: B:7:0x0017 A[PHI: r3
      0x0017: PHI (r3v4 boolean) = (r3v2 boolean), (r3v5 boolean) binds: [B:10:0x0026, B:5:0x0014] A[DONT_GENERATE, DONT_INLINE]] */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        boolean zQ;
        boolean zL;
        MotionEvent motionEventObtain;
        int actionMasked = motionEvent.getActionMasked();
        if (this.f46835k == null) {
            zQ = Q(motionEvent, 1);
            if (!zQ) {
                zL = false;
            }
            motionEventObtain = null;
            if (this.f46835k == null) {
                zL |= super.onTouchEvent(motionEvent);
            } else if (zQ) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                super.onTouchEvent(motionEventObtain);
            }
            if (motionEventObtain != null) {
                motionEventObtain.recycle();
            }
            if (actionMasked == 1 && actionMasked != 3) {
                return zL;
            }
            V(false);
            return zL;
        }
        zQ = false;
        c cVarF = ((g) this.f46835k.getLayoutParams()).f();
        if (cVarF != null) {
            zL = cVarF.L(this, this.f46835k, motionEvent);
        } else {
            zL = false;
        }
        motionEventObtain = null;
        if (this.f46835k == null) {
            zL |= super.onTouchEvent(motionEvent);
        } else if (zQ) {
            long jUptimeMillis2 = SystemClock.uptimeMillis();
            motionEventObtain = MotionEvent.obtain(jUptimeMillis2, jUptimeMillis2, 3, 0.0f, 0.0f, 0);
            super.onTouchEvent(motionEventObtain);
        }
        if (motionEventObtain != null) {
            motionEventObtain.recycle();
        }
        if (actionMasked == 1) {
        }
        V(false);
        return zL;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: p, reason: merged with bridge method [inline-methods] */
    public g generateDefaultLayoutParams() {
        return new g(-2, -2);
    }

    @Override // androidx.core.view.x0
    public void q(View view, int i10, int i11, int[] iArr, int i12) {
        c cVarF;
        int childCount = getChildCount();
        boolean z10 = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i13 = 0; i13 < childCount; i13++) {
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8) {
                g gVar = (g) childAt.getLayoutParams();
                if (gVar.k(i12) && (cVarF = gVar.f()) != null) {
                    int[] iArr2 = this.f46830f;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    cVarF.y(this, childAt, view, i10, i11, iArr2, i12);
                    int[] iArr3 = this.f46830f;
                    iMax = i10 > 0 ? Math.max(iMax, iArr3[0]) : Math.min(iMax, iArr3[0]);
                    int[] iArr4 = this.f46830f;
                    iMax2 = i11 > 0 ? Math.max(iMax2, iArr4[1]) : Math.min(iMax2, iArr4[1]);
                    z10 = true;
                }
            }
        }
        iArr[0] = iMax;
        iArr[1] = iMax2;
        if (z10) {
            M(1);
        }
    }

    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: r, reason: merged with bridge method [inline-methods] */
    public g generateLayoutParams(AttributeSet attributeSet) {
        return new g(getContext(), attributeSet);
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public boolean requestChildRectangleOnScreen(View view, Rect rect, boolean z10) {
        c cVarF = ((g) view.getLayoutParams()).f();
        if (cVarF == null || !cVarF.E(this, view, rect, z10)) {
            return super.requestChildRectangleOnScreen(view, rect, z10);
        }
        return true;
    }

    @Override // android.view.ViewGroup, android.view.ViewParent
    public void requestDisallowInterceptTouchEvent(boolean z10) {
        super.requestDisallowInterceptTouchEvent(z10);
        if (!z10 || this.f46832h) {
            return;
        }
        V(false);
        this.f46832h = true;
    }

    @Override // androidx.core.view.y0
    public void s(@NonNull View view, int i10, int i11, int i12, int i13, int i14, @NonNull int[] iArr) {
        c cVarF;
        int childCount = getChildCount();
        boolean z10 = false;
        int iMax = 0;
        int iMax2 = 0;
        for (int i15 = 0; i15 < childCount; i15++) {
            View childAt = getChildAt(i15);
            if (childAt.getVisibility() != 8) {
                g gVar = (g) childAt.getLayoutParams();
                if (gVar.k(i14) && (cVarF = gVar.f()) != null) {
                    int[] iArr2 = this.f46830f;
                    iArr2[0] = 0;
                    iArr2[1] = 0;
                    cVarF.B(this, childAt, view, i10, i11, i12, i13, i14, iArr2);
                    int[] iArr3 = this.f46830f;
                    iMax = i12 > 0 ? Math.max(iMax, iArr3[0]) : Math.min(iMax, iArr3[0]);
                    int[] iArr4 = this.f46830f;
                    iMax2 = i13 > 0 ? Math.max(iMax2, iArr4[1]) : Math.min(iMax2, iArr4[1]);
                    z10 = true;
                }
            }
        }
        iArr[0] = iArr[0] + iMax;
        iArr[1] = iArr[1] + iMax2;
        if (z10) {
            M(1);
        }
    }

    @Override // android.view.View
    public void setFitsSystemWindows(boolean z10) {
        super.setFitsSystemWindows(z10);
        c0();
    }

    @Override // android.view.ViewGroup
    public void setOnHierarchyChangeListener(ViewGroup.OnHierarchyChangeListener onHierarchyChangeListener) {
        this.f46843v = onHierarchyChangeListener;
    }

    public void setStatusBarBackground(@p0 Drawable drawable) {
        Drawable drawable2 = this.f46842t;
        if (drawable2 != drawable) {
            if (drawable2 != null) {
                drawable2.setCallback(null);
            }
            Drawable drawableMutate = drawable != null ? drawable.mutate() : null;
            this.f46842t = drawableMutate;
            if (drawableMutate != null) {
                if (drawableMutate.isStateful()) {
                    this.f46842t.setState(getDrawableState());
                }
                androidx.core.graphics.drawable.c.m(this.f46842t, u1.c0(this));
                this.f46842t.setVisible(getVisibility() == 0, false);
                this.f46842t.setCallback(this);
            }
            u1.s1(this);
        }
    }

    public void setStatusBarBackgroundColor(@l int i10) {
        setStatusBarBackground(new ColorDrawable(i10));
    }

    public void setStatusBarBackgroundResource(@v int i10) {
        setStatusBarBackground(i10 != 0 ? androidx.core.content.d.l(getContext(), i10) : null);
    }

    @Override // android.view.View
    public void setVisibility(int i10) {
        super.setVisibility(i10);
        boolean z10 = i10 == 0;
        Drawable drawable = this.f46842t;
        if (drawable != null && drawable.isVisible() != z10) {
            this.f46842t.setVisible(z10, false);
        }
    }

    @Override // androidx.core.view.x0
    public boolean t(View view, View view2, int i10, int i11) {
        int childCount = getChildCount();
        boolean z10 = false;
        for (int i12 = 0; i12 < childCount; i12++) {
            View childAt = getChildAt(i12);
            if (childAt.getVisibility() != 8) {
                g gVar = (g) childAt.getLayoutParams();
                c cVarF = gVar.f();
                if (cVarF != null) {
                    boolean zI = cVarF.I(this, childAt, view, view2, i10, i11);
                    z10 |= zI;
                    gVar.t(i11, zI);
                } else {
                    gVar.t(i11, false);
                }
            }
        }
        return z10;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // android.view.ViewGroup
    /* JADX INFO: renamed from: u, reason: merged with bridge method [inline-methods] */
    public g generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        if (layoutParams instanceof g) {
            return new g((g) layoutParams);
        }
        return layoutParams instanceof ViewGroup.MarginLayoutParams ? new g((ViewGroup.MarginLayoutParams) layoutParams) : new g(layoutParams);
    }

    void v(View view, boolean z10, Rect rect) {
        if (!view.isLayoutRequested() && view.getVisibility() != 8) {
            if (z10) {
                y(view, rect);
                return;
            } else {
                rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                return;
            }
        }
        rect.setEmpty();
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        if (!super.verifyDrawable(drawable) && drawable != this.f46842t) {
            return false;
        }
        return true;
    }

    @NonNull
    public List<View> w(@NonNull View view) {
        List<View> listH = this.f46826b.h(view);
        this.f46828d.clear();
        if (listH != null) {
            this.f46828d.addAll(listH);
        }
        return this.f46828d;
    }

    @NonNull
    public List<View> x(@NonNull View view) {
        List listG = this.f46826b.g(view);
        this.f46828d.clear();
        if (listG != null) {
            this.f46828d.addAll(listG);
        }
        return this.f46828d;
    }

    void y(View view, Rect rect) {
        androidx.coordinatorlayout.widget.b.a(this, view, rect);
    }

    void z(View view, int i10, Rect rect, Rect rect2) {
        g gVar = (g) view.getLayoutParams();
        int measuredWidth = view.getMeasuredWidth();
        int measuredHeight = view.getMeasuredHeight();
        A(view, i10, rect, rect2, gVar, measuredWidth, measuredHeight);
        h(gVar, rect2, measuredWidth, measuredHeight);
    }

    public CoordinatorLayout(@NonNull Context context, @p0 AttributeSet attributeSet) {
        this(context, attributeSet, h1.a.C1912a.f280089b);
    }

    public CoordinatorLayout(@NonNull Context context, @p0 AttributeSet attributeSet, @androidx.annotation.f int i10) {
        TypedArray typedArrayObtainStyledAttributes;
        CoordinatorLayout coordinatorLayout;
        Context context2;
        super(context, attributeSet, i10);
        this.f46825a = new ArrayList();
        this.f46826b = new androidx.coordinatorlayout.widget.a<>();
        this.f46827c = new ArrayList();
        this.f46828d = new ArrayList();
        this.f46830f = new int[2];
        this.f46831g = new int[2];
        this.f46840p0 = new a1(this);
        if (i10 == 0) {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h1.a.j.f280219g, 0, h1.a.i.f280211h);
        } else {
            typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h1.a.j.f280219g, i10, 0);
        }
        TypedArray typedArray = typedArrayObtainStyledAttributes;
        if (i10 == 0) {
            coordinatorLayout = this;
            context2 = context;
            coordinatorLayout.saveAttributeDataForStyleable(context2, h1.a.j.f280219g, attributeSet, typedArray, 0, h1.a.i.f280211h);
        } else {
            coordinatorLayout = this;
            context2 = context;
            coordinatorLayout.saveAttributeDataForStyleable(context2, h1.a.j.f280219g, attributeSet, typedArray, i10, 0);
        }
        int resourceId = typedArray.getResourceId(h1.a.j.f280220h, 0);
        if (resourceId != 0) {
            Resources resources = context2.getResources();
            coordinatorLayout.f46834j = resources.getIntArray(resourceId);
            float f10 = resources.getDisplayMetrics().density;
            int length = coordinatorLayout.f46834j.length;
            for (int i11 = 0; i11 < length; i11++) {
                int[] iArr = coordinatorLayout.f46834j;
                iArr[i11] = (int) (iArr[i11] * f10);
            }
        }
        coordinatorLayout.f46842t = typedArray.getDrawable(h1.a.j.f280221i);
        typedArray.recycle();
        coordinatorLayout.c0();
        super.setOnHierarchyChangeListener(coordinatorLayout.new f());
        if (u1.X(coordinatorLayout) == 0) {
            u1.Y1(coordinatorLayout, 1);
        }
    }

    protected static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        SparseArray<Parcelable> f46845c;

        static class a implements Parcelable.ClassLoaderCreator<SavedState> {
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
                return new SavedState(parcel, classLoader);
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
            public SavedState[] newArray(int i10) {
                return new SavedState[i10];
            }
        }

        public SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            int i10 = parcel.readInt();
            int[] iArr = new int[i10];
            parcel.readIntArray(iArr);
            Parcelable[] parcelableArray = parcel.readParcelableArray(classLoader);
            this.f46845c = new SparseArray<>(i10);
            for (int i11 = 0; i11 < i10; i11++) {
                this.f46845c.append(iArr[i11], parcelableArray[i11]);
            }
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            SparseArray<Parcelable> sparseArray = this.f46845c;
            int size = sparseArray != null ? sparseArray.size() : 0;
            parcel.writeInt(size);
            int[] iArr = new int[size];
            Parcelable[] parcelableArr = new Parcelable[size];
            for (int i11 = 0; i11 < size; i11++) {
                iArr[i11] = this.f46845c.keyAt(i11);
                parcelableArr[i11] = this.f46845c.valueAt(i11);
            }
            parcel.writeIntArray(iArr);
            parcel.writeParcelableArray(parcelableArr, i10);
        }

        public SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public static class g extends ViewGroup.MarginLayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        c f46848a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        boolean f46849b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        public int f46850c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        public int f46851d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        public int f46852e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f46853f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        public int f46854g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        public int f46855h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        int f46856i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        int f46857j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        View f46858k;

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        View f46859l;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private boolean f46860m;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private boolean f46861n;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private boolean f46862o;

        /* JADX INFO: renamed from: p, reason: collision with root package name */
        private boolean f46863p;

        /* JADX INFO: renamed from: q, reason: collision with root package name */
        final Rect f46864q;

        /* JADX INFO: renamed from: r, reason: collision with root package name */
        Object f46865r;

        public g(int i10, int i11) {
            super(i10, i11);
            this.f46849b = false;
            this.f46850c = 0;
            this.f46851d = 0;
            this.f46852e = -1;
            this.f46853f = -1;
            this.f46854g = 0;
            this.f46855h = 0;
            this.f46864q = new Rect();
        }

        private void o(View view, CoordinatorLayout coordinatorLayout) {
            View viewFindViewById = coordinatorLayout.findViewById(this.f46853f);
            this.f46858k = viewFindViewById;
            if (viewFindViewById == null) {
                if (coordinatorLayout.isInEditMode()) {
                    this.f46859l = null;
                    this.f46858k = null;
                    return;
                }
                throw new IllegalStateException("Could not find CoordinatorLayout descendant view with id " + coordinatorLayout.getResources().getResourceName(this.f46853f) + " to anchor view " + view);
            }
            if (viewFindViewById == coordinatorLayout) {
                if (!coordinatorLayout.isInEditMode()) {
                    throw new IllegalStateException("View can not be anchored to the the parent CoordinatorLayout");
                }
                this.f46859l = null;
                this.f46858k = null;
                return;
            }
            for (ViewParent parent = viewFindViewById.getParent(); parent != coordinatorLayout && parent != null; parent = parent.getParent()) {
                if (parent == view) {
                    if (!coordinatorLayout.isInEditMode()) {
                        throw new IllegalStateException("Anchor must not be a descendant of the anchored view");
                    }
                    this.f46859l = null;
                    this.f46858k = null;
                    return;
                }
                if (parent instanceof View) {
                    viewFindViewById = parent;
                }
            }
            this.f46859l = viewFindViewById;
        }

        private boolean u(View view, int i10) {
            int iD = d0.d(((g) view.getLayoutParams()).f46854g, i10);
            return iD != 0 && (d0.d(this.f46855h, i10) & iD) == iD;
        }

        private boolean v(View view, CoordinatorLayout coordinatorLayout) {
            if (this.f46858k.getId() != this.f46853f) {
                return false;
            }
            View view2 = this.f46858k;
            for (ViewParent parent = view2.getParent(); parent != coordinatorLayout; parent = parent.getParent()) {
                if (parent != null && parent != view) {
                    if (parent instanceof View) {
                        view2 = parent;
                    }
                }
                this.f46859l = null;
                this.f46858k = null;
                return false;
            }
            this.f46859l = view2;
            return true;
        }

        boolean a() {
            return this.f46858k == null && this.f46853f != -1;
        }

        boolean b(CoordinatorLayout coordinatorLayout, View view, View view2) {
            c cVar;
            return view2 == this.f46859l || u(view2, u1.c0(coordinatorLayout)) || ((cVar = this.f46848a) != null && cVar.m(coordinatorLayout, view, view2));
        }

        boolean c() {
            if (this.f46848a == null) {
                this.f46860m = false;
            }
            return this.f46860m;
        }

        View d(CoordinatorLayout coordinatorLayout, View view) {
            if (this.f46853f == -1) {
                this.f46859l = null;
                this.f46858k = null;
                return null;
            }
            if (this.f46858k == null || !v(view, coordinatorLayout)) {
                o(view, coordinatorLayout);
            }
            return this.f46858k;
        }

        @androidx.annotation.d0
        public int e() {
            return this.f46853f;
        }

        @p0
        public c f() {
            return this.f46848a;
        }

        boolean g() {
            return this.f46863p;
        }

        Rect h() {
            return this.f46864q;
        }

        void i() {
            this.f46859l = null;
            this.f46858k = null;
        }

        boolean j(CoordinatorLayout coordinatorLayout, View view) {
            boolean z10 = this.f46860m;
            if (z10) {
                return true;
            }
            c cVar = this.f46848a;
            boolean zH = (cVar != null ? cVar.h(coordinatorLayout, view) : false) | z10;
            this.f46860m = zH;
            return zH;
        }

        boolean k(int i10) {
            if (i10 == 0) {
                return this.f46861n;
            }
            if (i10 != 1) {
                return false;
            }
            return this.f46862o;
        }

        void l() {
            this.f46863p = false;
        }

        void m(int i10) {
            t(i10, false);
        }

        void n() {
            this.f46860m = false;
        }

        public void p(@androidx.annotation.d0 int i10) {
            i();
            this.f46853f = i10;
        }

        public void q(@p0 c cVar) {
            c cVar2 = this.f46848a;
            if (cVar2 != cVar) {
                if (cVar2 != null) {
                    cVar2.r();
                }
                this.f46848a = cVar;
                this.f46865r = null;
                this.f46849b = true;
                if (cVar != null) {
                    cVar.o(this);
                }
            }
        }

        void r(boolean z10) {
            this.f46863p = z10;
        }

        void s(Rect rect) {
            this.f46864q.set(rect);
        }

        void t(int i10, boolean z10) {
            if (i10 == 0) {
                this.f46861n = z10;
            } else {
                if (i10 != 1) {
                    return;
                }
                this.f46862o = z10;
            }
        }

        g(@NonNull Context context, @p0 AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f46849b = false;
            this.f46850c = 0;
            this.f46851d = 0;
            this.f46852e = -1;
            this.f46853f = -1;
            this.f46854g = 0;
            this.f46855h = 0;
            this.f46864q = new Rect();
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, h1.a.j.f280222j);
            this.f46850c = typedArrayObtainStyledAttributes.getInteger(h1.a.j.f280223k, 0);
            this.f46853f = typedArrayObtainStyledAttributes.getResourceId(h1.a.j.f280224l, -1);
            this.f46851d = typedArrayObtainStyledAttributes.getInteger(h1.a.j.f280225m, 0);
            this.f46852e = typedArrayObtainStyledAttributes.getInteger(h1.a.j.f280229q, -1);
            this.f46854g = typedArrayObtainStyledAttributes.getInt(h1.a.j.f280228p, 0);
            this.f46855h = typedArrayObtainStyledAttributes.getInt(h1.a.j.f280227o, 0);
            boolean zHasValue = typedArrayObtainStyledAttributes.hasValue(h1.a.j.f280226n);
            this.f46849b = zHasValue;
            if (zHasValue) {
                this.f46848a = CoordinatorLayout.P(context, attributeSet, typedArrayObtainStyledAttributes.getString(h1.a.j.f280226n));
            }
            typedArrayObtainStyledAttributes.recycle();
            c cVar = this.f46848a;
            if (cVar != null) {
                cVar.o(this);
            }
        }

        public g(g gVar) {
            super((ViewGroup.MarginLayoutParams) gVar);
            this.f46849b = false;
            this.f46850c = 0;
            this.f46851d = 0;
            this.f46852e = -1;
            this.f46853f = -1;
            this.f46854g = 0;
            this.f46855h = 0;
            this.f46864q = new Rect();
        }

        public g(ViewGroup.MarginLayoutParams marginLayoutParams) {
            super(marginLayoutParams);
            this.f46849b = false;
            this.f46850c = 0;
            this.f46851d = 0;
            this.f46852e = -1;
            this.f46853f = -1;
            this.f46854g = 0;
            this.f46855h = 0;
            this.f46864q = new Rect();
        }

        public g(ViewGroup.LayoutParams layoutParams) {
            super(layoutParams);
            this.f46849b = false;
            this.f46850c = 0;
            this.f46851d = 0;
            this.f46852e = -1;
            this.f46853f = -1;
            this.f46854g = 0;
            this.f46855h = 0;
            this.f46864q = new Rect();
        }
    }
}

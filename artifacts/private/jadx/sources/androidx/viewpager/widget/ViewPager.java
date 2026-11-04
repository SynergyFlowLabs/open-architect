package androidx.viewpager.widget;

import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import android.util.AttributeSet;
import android.view.FocusFinder;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.SoundEffectConstants;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.view.accessibility.AccessibilityEvent;
import android.view.animation.Interpolator;
import android.widget.EdgeEffect;
import android.widget.Scroller;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.annotation.t0;
import androidx.annotation.v;
import androidx.core.view.b1;
import androidx.core.view.g3;
import androidx.core.view.u1;
import androidx.customview.view.AbsSavedState;
import java.lang.annotation.ElementType;
import java.lang.annotation.Inherited;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

/* JADX INFO: loaded from: classes3.dex */
public class ViewPager extends ViewGroup {
    private static final String O3 = "ViewPager";
    private static final boolean P3 = false;
    private static final boolean Q3 = false;
    private static final int R3 = 1;
    private static final int S3 = 600;
    private static final int T3 = 25;
    private static final int U3 = 16;
    private static final int V3 = 400;
    private static final int Z3 = -1;

    /* JADX INFO: renamed from: a4, reason: collision with root package name */
    private static final int f76024a4 = 2;

    /* JADX INFO: renamed from: b4, reason: collision with root package name */
    private static final int f76025b4 = 0;

    /* JADX INFO: renamed from: c4, reason: collision with root package name */
    private static final int f76026c4 = 1;

    /* JADX INFO: renamed from: d4, reason: collision with root package name */
    private static final int f76027d4 = 2;

    /* JADX INFO: renamed from: f4, reason: collision with root package name */
    public static final int f76029f4 = 0;

    /* JADX INFO: renamed from: g4, reason: collision with root package name */
    public static final int f76030g4 = 1;

    /* JADX INFO: renamed from: h4, reason: collision with root package name */
    public static final int f76031h4 = 2;
    private boolean A3;
    private boolean B3;
    private boolean C3;
    private int D3;
    private List<j> E3;
    private j F3;
    private j G3;
    private boolean H1;
    private List<i> H3;
    private k I3;
    private int J3;
    private int K3;
    private ArrayList<View> L3;
    private final Runnable M3;
    private int N3;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private int f76032a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final ArrayList<f> f76033b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final f f76034c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Rect f76035d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    androidx.viewpager.widget.a f76036e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    int f76037f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f76038g;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    private int f76039g3;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private Parcelable f76040h;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    private boolean f76041h3;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private ClassLoader f76042i;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    private boolean f76043i3;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private Scroller f76044j;

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    private int f76045j3;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f76046k;

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    private int f76047k3;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private l f76048l;

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    private int f76049l3;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f76050m;

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    private float f76051m3;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private Drawable f76052n;

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    private float f76053n3;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private int f76054o;

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    private float f76055o3;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private int f76056p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private boolean f76057p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private boolean f76058p2;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    private float f76059p3;

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    private int f76060q3;

    /* JADX INFO: renamed from: r3, reason: collision with root package name */
    private VelocityTracker f76061r3;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private int f76062s;

    /* JADX INFO: renamed from: s3, reason: collision with root package name */
    private int f76063s3;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private float f76064t;

    /* JADX INFO: renamed from: t3, reason: collision with root package name */
    private int f76065t3;

    /* JADX INFO: renamed from: u3, reason: collision with root package name */
    private int f76066u3;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private float f76067v;

    /* JADX INFO: renamed from: v3, reason: collision with root package name */
    private int f76068v3;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f76069w;

    /* JADX INFO: renamed from: w3, reason: collision with root package name */
    private boolean f76070w3;

    /* JADX INFO: renamed from: x3, reason: collision with root package name */
    private long f76071x3;

    /* JADX INFO: renamed from: y3, reason: collision with root package name */
    private EdgeEffect f76072y3;

    /* JADX INFO: renamed from: z3, reason: collision with root package name */
    private EdgeEffect f76073z3;
    static final int[] W3 = {R.attr.layout_gravity};
    private static final Comparator<f> X3 = new a();
    private static final Interpolator Y3 = new b();

    /* JADX INFO: renamed from: e4, reason: collision with root package name */
    private static final n f76028e4 = new n();

    public static class SavedState extends AbsSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        int f76074c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        Parcelable f76075d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        ClassLoader f76076e;

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

        public SavedState(@NonNull Parcelable parcelable) {
            super(parcelable);
        }

        public String toString() {
            return "FragmentPager.SavedState{" + Integer.toHexString(System.identityHashCode(this)) + " position=" + this.f76074c + "}";
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f76074c);
            parcel.writeParcelable(this.f76075d, i10);
        }

        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            classLoader = classLoader == null ? getClass().getClassLoader() : classLoader;
            this.f76074c = parcel.readInt();
            this.f76075d = parcel.readParcelable(classLoader);
            this.f76076e = classLoader;
        }
    }

    static class a implements Comparator<f> {
        a() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(f fVar, f fVar2) {
            return fVar.f76081b - fVar2.f76081b;
        }
    }

    static class b implements Interpolator {
        b() {
        }

        @Override // android.animation.TimeInterpolator
        public float getInterpolation(float f10) {
            float f11 = f10 - 1.0f;
            return (f11 * f11 * f11 * f11 * f11) + 1.0f;
        }
    }

    class c implements Runnable {
        c() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewPager.this.setScrollState(0);
            ViewPager.this.J();
        }
    }

    class d implements b1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final Rect f76078a = new Rect();

        d() {
        }

        @Override // androidx.core.view.b1
        public g3 b(View view, g3 g3Var) {
            g3 g3VarJ1 = u1.j1(view, g3Var);
            if (g3VarJ1.A()) {
                return g3VarJ1;
            }
            Rect rect = this.f76078a;
            rect.left = g3VarJ1.p();
            rect.top = g3VarJ1.r();
            rect.right = g3VarJ1.q();
            rect.bottom = g3VarJ1.o();
            int childCount = ViewPager.this.getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                g3 g3VarP = u1.p(ViewPager.this.getChildAt(i10), g3VarJ1);
                rect.left = Math.min(g3VarP.p(), rect.left);
                rect.top = Math.min(g3VarP.r(), rect.top);
                rect.right = Math.min(g3VarP.q(), rect.right);
                rect.bottom = Math.min(g3VarP.o(), rect.bottom);
            }
            return g3VarJ1.D(rect.left, rect.top, rect.right, rect.bottom);
        }
    }

    @Target({ElementType.TYPE})
    @Inherited
    @Retention(RetentionPolicy.RUNTIME)
    public @interface e {
    }

    static class f {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        Object f76080a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f76081b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        boolean f76082c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        float f76083d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        float f76084e;

        f() {
        }
    }

    class h extends androidx.core.view.a {
        h() {
        }

        private boolean c() {
            androidx.viewpager.widget.a aVar = ViewPager.this.f76036e;
            return aVar != null && aVar.getCount() > 1;
        }

        @Override // androidx.core.view.a
        public void onInitializeAccessibilityEvent(View view, AccessibilityEvent accessibilityEvent) {
            androidx.viewpager.widget.a aVar;
            super.onInitializeAccessibilityEvent(view, accessibilityEvent);
            accessibilityEvent.setClassName(ViewPager.class.getName());
            accessibilityEvent.setScrollable(c());
            if (accessibilityEvent.getEventType() != 4096 || (aVar = ViewPager.this.f76036e) == null) {
                return;
            }
            accessibilityEvent.setItemCount(aVar.getCount());
            accessibilityEvent.setFromIndex(ViewPager.this.f76037f);
            accessibilityEvent.setToIndex(ViewPager.this.f76037f);
        }

        @Override // androidx.core.view.a
        public void onInitializeAccessibilityNodeInfo(View view, androidx.core.view.accessibility.j jVar) {
            super.onInitializeAccessibilityNodeInfo(view, jVar);
            jVar.j1(ViewPager.class.getName());
            jVar.X1(c());
            if (ViewPager.this.canScrollHorizontally(1)) {
                jVar.a(4096);
            }
            if (ViewPager.this.canScrollHorizontally(-1)) {
                jVar.a(8192);
            }
        }

        @Override // androidx.core.view.a
        public boolean performAccessibilityAction(View view, int i10, Bundle bundle) {
            if (super.performAccessibilityAction(view, i10, bundle)) {
                return true;
            }
            if (i10 == 4096) {
                if (!ViewPager.this.canScrollHorizontally(1)) {
                    return false;
                }
                ViewPager viewPager = ViewPager.this;
                viewPager.setCurrentItem(viewPager.f76037f + 1);
                return true;
            }
            if (i10 != 8192 || !ViewPager.this.canScrollHorizontally(-1)) {
                return false;
            }
            ViewPager viewPager2 = ViewPager.this;
            viewPager2.setCurrentItem(viewPager2.f76037f - 1);
            return true;
        }
    }

    public interface i {
        void a(@NonNull ViewPager viewPager, @p0 androidx.viewpager.widget.a aVar, @p0 androidx.viewpager.widget.a aVar2);
    }

    public interface j {
        void onPageScrollStateChanged(int i10);

        void onPageScrolled(int i10, float f10, @t0 int i11);

        void onPageSelected(int i10);
    }

    public interface k {
        void a(@NonNull View view, float f10);
    }

    private class l extends DataSetObserver {
        l() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            ViewPager.this.j();
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            ViewPager.this.j();
        }
    }

    public static class m implements j {
        @Override // androidx.viewpager.widget.ViewPager.j
        public void onPageScrollStateChanged(int i10) {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void onPageScrolled(int i10, float f10, int i11) {
        }

        @Override // androidx.viewpager.widget.ViewPager.j
        public void onPageSelected(int i10) {
        }
    }

    static class n implements Comparator<View> {
        n() {
        }

        @Override // java.util.Comparator
        /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
        public int compare(View view, View view2) {
            g gVar = (g) view.getLayoutParams();
            g gVar2 = (g) view2.getLayoutParams();
            boolean z10 = gVar.f76085a;
            if (z10 != gVar2.f76085a) {
                return z10 ? 1 : -1;
            }
            return gVar.f76089e - gVar2.f76089e;
        }
    }

    public ViewPager(@NonNull Context context) {
        super(context);
        this.f76033b = new ArrayList<>();
        this.f76034c = new f();
        this.f76035d = new Rect();
        this.f76038g = -1;
        this.f76040h = null;
        this.f76042i = null;
        this.f76064t = -3.4028235E38f;
        this.f76067v = Float.MAX_VALUE;
        this.f76039g3 = 1;
        this.f76060q3 = -1;
        this.A3 = true;
        this.B3 = false;
        this.M3 = new c();
        this.N3 = 0;
        z();
    }

    private static boolean A(@NonNull View view) {
        return view.getClass().getAnnotation(e.class) != null;
    }

    private boolean C(float f10, float f11) {
        if (f10 >= this.f76047k3 || f11 <= 0.0f) {
            return f10 > ((float) (getWidth() - this.f76047k3)) && f11 < 0.0f;
        }
        return true;
    }

    private void E(MotionEvent motionEvent) {
        int actionIndex = motionEvent.getActionIndex();
        if (motionEvent.getPointerId(actionIndex) == this.f76060q3) {
            int i10 = actionIndex == 0 ? 1 : 0;
            this.f76051m3 = motionEvent.getX(i10);
            this.f76060q3 = motionEvent.getPointerId(i10);
            VelocityTracker velocityTracker = this.f76061r3;
            if (velocityTracker != null) {
                velocityTracker.clear();
            }
        }
    }

    private boolean H(int i10) {
        if (this.f76033b.size() == 0) {
            if (this.A3) {
                return false;
            }
            this.C3 = false;
            D(0, 0.0f, 0);
            if (this.C3) {
                return false;
            }
            throw new IllegalStateException("onPageScrolled did not call superclass implementation");
        }
        f fVarX = x();
        int clientWidth = getClientWidth();
        int i11 = this.f76050m;
        int i12 = clientWidth + i11;
        float f10 = clientWidth;
        int i13 = fVarX.f76081b;
        float f11 = ((i10 / f10) - fVarX.f76084e) / (fVarX.f76083d + (i11 / f10));
        this.C3 = false;
        D(i13, f11, (int) (i12 * f11));
        if (this.C3) {
            return true;
        }
        throw new IllegalStateException("onPageScrolled did not call superclass implementation");
    }

    private boolean I(float f10) {
        boolean z10;
        boolean z11;
        float f11 = this.f76051m3 - f10;
        this.f76051m3 = f10;
        float scrollX = getScrollX() + f11;
        float clientWidth = getClientWidth();
        float f12 = this.f76064t * clientWidth;
        float f13 = this.f76067v * clientWidth;
        boolean z12 = false;
        f fVar = this.f76033b.get(0);
        ArrayList<f> arrayList = this.f76033b;
        f fVar2 = arrayList.get(arrayList.size() - 1);
        if (fVar.f76081b != 0) {
            f12 = fVar.f76084e * clientWidth;
            z10 = false;
        } else {
            z10 = true;
        }
        if (fVar2.f76081b != this.f76036e.getCount() - 1) {
            f13 = fVar2.f76084e * clientWidth;
            z11 = false;
        } else {
            z11 = true;
        }
        if (scrollX < f12) {
            if (z10) {
                this.f76072y3.onPull(Math.abs(f12 - scrollX) / clientWidth);
                z12 = true;
            }
            scrollX = f12;
        } else if (scrollX > f13) {
            if (z11) {
                this.f76073z3.onPull(Math.abs(scrollX - f13) / clientWidth);
                z12 = true;
            }
            scrollX = f13;
        }
        int i10 = (int) scrollX;
        this.f76051m3 += scrollX - i10;
        scrollTo(i10, getScrollY());
        H(i10);
        return z12;
    }

    private void L(int i10, int i11, int i12, int i13) {
        if (i11 > 0 && !this.f76033b.isEmpty()) {
            if (!this.f76044j.isFinished()) {
                this.f76044j.setFinalX(getCurrentItem() * getClientWidth());
                return;
            } else {
                scrollTo((int) ((getScrollX() / (((i11 - getPaddingLeft()) - getPaddingRight()) + i13)) * (((i10 - getPaddingLeft()) - getPaddingRight()) + i12)), getScrollY());
                return;
            }
        }
        f fVarY = y(this.f76037f);
        int iMin = (int) ((fVarY != null ? Math.min(fVarY.f76084e, this.f76067v) : 0.0f) * ((i10 - getPaddingLeft()) - getPaddingRight()));
        if (iMin != getScrollX()) {
            i(false);
            scrollTo(iMin, getScrollY());
        }
    }

    private void M() {
        int i10 = 0;
        while (i10 < getChildCount()) {
            if (!((g) getChildAt(i10).getLayoutParams()).f76085a) {
                removeViewAt(i10);
                i10--;
            }
            i10++;
        }
    }

    private void P(boolean z10) {
        ViewParent parent = getParent();
        if (parent != null) {
            parent.requestDisallowInterceptTouchEvent(z10);
        }
    }

    private boolean Q() {
        this.f76060q3 = -1;
        q();
        this.f76072y3.onRelease();
        this.f76073z3.onRelease();
        return this.f76072y3.isFinished() || this.f76073z3.isFinished();
    }

    private void R(int i10, boolean z10, int i11, boolean z11) {
        f fVarY = y(i10);
        int clientWidth = fVarY != null ? (int) (getClientWidth() * Math.max(this.f76064t, Math.min(fVarY.f76084e, this.f76067v))) : 0;
        if (z10) {
            Z(clientWidth, 0, i11);
            if (z11) {
                m(i10);
                return;
            }
            return;
        }
        if (z11) {
            m(i10);
        }
        i(false);
        scrollTo(clientWidth, 0);
        H(clientWidth);
    }

    private void a0() {
        if (this.K3 != 0) {
            ArrayList<View> arrayList = this.L3;
            if (arrayList == null) {
                this.L3 = new ArrayList<>();
            } else {
                arrayList.clear();
            }
            int childCount = getChildCount();
            for (int i10 = 0; i10 < childCount; i10++) {
                this.L3.add(getChildAt(i10));
            }
            Collections.sort(this.L3, f76028e4);
        }
    }

    private void f(f fVar, int i10, f fVar2) {
        int i11;
        int i12;
        f fVar3;
        f fVar4;
        int count = this.f76036e.getCount();
        int clientWidth = getClientWidth();
        float f10 = clientWidth > 0 ? this.f76050m / clientWidth : 0.0f;
        if (fVar2 != null) {
            int i13 = fVar2.f76081b;
            int i14 = fVar.f76081b;
            if (i13 < i14) {
                float pageWidth = fVar2.f76084e + fVar2.f76083d + f10;
                int i15 = i13 + 1;
                int i16 = 0;
                while (i15 <= fVar.f76081b && i16 < this.f76033b.size()) {
                    f fVar5 = this.f76033b.get(i16);
                    while (true) {
                        fVar4 = fVar5;
                        if (i15 <= fVar4.f76081b || i16 >= this.f76033b.size() - 1) {
                            break;
                        }
                        i16++;
                        fVar5 = this.f76033b.get(i16);
                    }
                    while (i15 < fVar4.f76081b) {
                        pageWidth += this.f76036e.getPageWidth(i15) + f10;
                        i15++;
                    }
                    fVar4.f76084e = pageWidth;
                    pageWidth += fVar4.f76083d + f10;
                    i15++;
                }
            } else if (i13 > i14) {
                int size = this.f76033b.size() - 1;
                float pageWidth2 = fVar2.f76084e;
                while (true) {
                    i13--;
                    if (i13 < fVar.f76081b || size < 0) {
                        break;
                    }
                    f fVar6 = this.f76033b.get(size);
                    while (true) {
                        fVar3 = fVar6;
                        if (i13 >= fVar3.f76081b || size <= 0) {
                            break;
                        }
                        size--;
                        fVar6 = this.f76033b.get(size);
                    }
                    while (i13 > fVar3.f76081b) {
                        pageWidth2 -= this.f76036e.getPageWidth(i13) + f10;
                        i13--;
                    }
                    pageWidth2 -= fVar3.f76083d + f10;
                    fVar3.f76084e = pageWidth2;
                }
            }
        }
        int size2 = this.f76033b.size();
        float pageWidth3 = fVar.f76084e;
        int i17 = fVar.f76081b;
        int i18 = i17 - 1;
        this.f76064t = i17 == 0 ? pageWidth3 : -3.4028235E38f;
        int i19 = count - 1;
        this.f76067v = i17 == i19 ? (fVar.f76083d + pageWidth3) - 1.0f : Float.MAX_VALUE;
        int i20 = i10 - 1;
        while (i20 >= 0) {
            f fVar7 = this.f76033b.get(i20);
            while (true) {
                i12 = fVar7.f76081b;
                if (i18 <= i12) {
                    break;
                }
                pageWidth3 -= this.f76036e.getPageWidth(i18) + f10;
                i18--;
            }
            pageWidth3 -= fVar7.f76083d + f10;
            fVar7.f76084e = pageWidth3;
            if (i12 == 0) {
                this.f76064t = pageWidth3;
            }
            i20--;
            i18--;
        }
        float pageWidth4 = fVar.f76084e + fVar.f76083d + f10;
        int i21 = fVar.f76081b + 1;
        int i22 = i10 + 1;
        while (i22 < size2) {
            f fVar8 = this.f76033b.get(i22);
            while (true) {
                i11 = fVar8.f76081b;
                if (i21 >= i11) {
                    break;
                }
                pageWidth4 += this.f76036e.getPageWidth(i21) + f10;
                i21++;
            }
            if (i11 == i19) {
                this.f76067v = (fVar8.f76083d + pageWidth4) - 1.0f;
            }
            fVar8.f76084e = pageWidth4;
            pageWidth4 += fVar8.f76083d + f10;
            i22++;
            i21++;
        }
        this.B3 = false;
    }

    private int getClientWidth() {
        return (getMeasuredWidth() - getPaddingLeft()) - getPaddingRight();
    }

    private void i(boolean z10) {
        boolean z11 = this.N3 == 2;
        if (z11) {
            setScrollingCacheEnabled(false);
            if (!this.f76044j.isFinished()) {
                this.f76044j.abortAnimation();
                int scrollX = getScrollX();
                int scrollY = getScrollY();
                int currX = this.f76044j.getCurrX();
                int currY = this.f76044j.getCurrY();
                if (scrollX != currX || scrollY != currY) {
                    scrollTo(currX, currY);
                    if (currX != scrollX) {
                        H(currX);
                    }
                }
            }
        }
        this.f76058p2 = false;
        for (int i10 = 0; i10 < this.f76033b.size(); i10++) {
            f fVar = this.f76033b.get(i10);
            if (fVar.f76082c) {
                fVar.f76082c = false;
                z11 = true;
            }
        }
        if (z11) {
            if (z10) {
                u1.u1(this, this.M3);
                return;
            }
            this.M3.run();
        }
    }

    private int k(int i10, float f10, int i11, int i12) {
        if (Math.abs(i12) <= this.f76066u3 || Math.abs(i11) <= this.f76063s3) {
            i10 += (int) (f10 + (i10 >= this.f76037f ? 0.4f : 0.6f));
        } else if (i11 <= 0) {
            i10++;
        }
        if (this.f76033b.size() <= 0) {
            return i10;
        }
        f fVar = this.f76033b.get(0);
        ArrayList<f> arrayList = this.f76033b;
        return Math.max(fVar.f76081b, Math.min(i10, arrayList.get(arrayList.size() - 1).f76081b));
    }

    private void l(int i10, float f10, int i11) {
        j jVar = this.F3;
        if (jVar != null) {
            jVar.onPageScrolled(i10, f10, i11);
        }
        List<j> list = this.E3;
        if (list != null) {
            int size = list.size();
            for (int i12 = 0; i12 < size; i12++) {
                j jVar2 = this.E3.get(i12);
                if (jVar2 != null) {
                    jVar2.onPageScrolled(i10, f10, i11);
                }
            }
        }
        j jVar3 = this.G3;
        if (jVar3 != null) {
            jVar3.onPageScrolled(i10, f10, i11);
        }
    }

    private void m(int i10) {
        j jVar = this.F3;
        if (jVar != null) {
            jVar.onPageSelected(i10);
        }
        List<j> list = this.E3;
        if (list != null) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                j jVar2 = this.E3.get(i11);
                if (jVar2 != null) {
                    jVar2.onPageSelected(i10);
                }
            }
        }
        j jVar3 = this.G3;
        if (jVar3 != null) {
            jVar3.onPageSelected(i10);
        }
    }

    private void n(int i10) {
        j jVar = this.F3;
        if (jVar != null) {
            jVar.onPageScrollStateChanged(i10);
        }
        List<j> list = this.E3;
        if (list != null) {
            int size = list.size();
            for (int i11 = 0; i11 < size; i11++) {
                j jVar2 = this.E3.get(i11);
                if (jVar2 != null) {
                    jVar2.onPageScrollStateChanged(i10);
                }
            }
        }
        j jVar3 = this.G3;
        if (jVar3 != null) {
            jVar3.onPageScrollStateChanged(i10);
        }
    }

    private void p(boolean z10) {
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            getChildAt(i10).setLayerType(z10 ? this.J3 : 0, null);
        }
    }

    private void q() {
        this.f76041h3 = false;
        this.f76043i3 = false;
        VelocityTracker velocityTracker = this.f76061r3;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f76061r3 = null;
        }
    }

    private void setScrollingCacheEnabled(boolean z10) {
        if (this.H1 != z10) {
            this.H1 = z10;
        }
    }

    private Rect u(Rect rect, View view) {
        if (rect == null) {
            rect = new Rect();
        }
        if (view == null) {
            rect.set(0, 0, 0, 0);
            return rect;
        }
        rect.left = view.getLeft();
        rect.right = view.getRight();
        rect.top = view.getTop();
        rect.bottom = view.getBottom();
        ViewParent parent = view.getParent();
        while ((parent instanceof ViewGroup) && parent != this) {
            ViewGroup viewGroup = (ViewGroup) parent;
            rect.left += viewGroup.getLeft();
            rect.right += viewGroup.getRight();
            rect.top += viewGroup.getTop();
            rect.bottom += viewGroup.getBottom();
            parent = viewGroup.getParent();
        }
        return rect;
    }

    private f x() {
        int i10;
        int clientWidth = getClientWidth();
        float f10 = 0.0f;
        float scrollX = clientWidth > 0 ? getScrollX() / clientWidth : 0.0f;
        float f11 = clientWidth > 0 ? this.f76050m / clientWidth : 0.0f;
        int i11 = 0;
        boolean z10 = true;
        f fVar = null;
        int i12 = -1;
        float f12 = 0.0f;
        while (i11 < this.f76033b.size()) {
            f fVar2 = this.f76033b.get(i11);
            if (!z10 && fVar2.f76081b != (i10 = i12 + 1)) {
                fVar2 = this.f76034c;
                fVar2.f76084e = f10 + f12 + f11;
                fVar2.f76081b = i10;
                fVar2.f76083d = this.f76036e.getPageWidth(i10);
                i11--;
            }
            f fVar3 = fVar2;
            f10 = fVar3.f76084e;
            float f13 = fVar3.f76083d + f10 + f11;
            if (!z10 && scrollX < f10) {
                break;
            }
            if (scrollX < f13 || i11 == this.f76033b.size() - 1) {
                return fVar3;
            }
            int i13 = fVar3.f76081b;
            float f14 = fVar3.f76083d;
            i11++;
            i12 = i13;
            f12 = f14;
            fVar = fVar3;
            z10 = false;
        }
        return fVar;
    }

    public boolean B() {
        return this.f76070w3;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0067  */
    @androidx.annotation.i
    protected void D(int i10, float f10, int i11) {
        int iMax;
        int width;
        int left;
        if (this.D3 > 0) {
            int scrollX = getScrollX();
            int paddingLeft = getPaddingLeft();
            int paddingRight = getPaddingRight();
            int width2 = getWidth();
            int childCount = getChildCount();
            for (int i12 = 0; i12 < childCount; i12++) {
                View childAt = getChildAt(i12);
                g gVar = (g) childAt.getLayoutParams();
                if (gVar.f76085a) {
                    int i13 = gVar.f76086b & 7;
                    if (i13 != 1) {
                        if (i13 == 3) {
                            width = childAt.getWidth() + paddingLeft;
                        } else if (i13 != 5) {
                            width = paddingLeft;
                        } else {
                            iMax = (width2 - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                        }
                        left = (paddingLeft + scrollX) - childAt.getLeft();
                        if (left != 0) {
                            childAt.offsetLeftAndRight(left);
                        }
                        paddingLeft = width;
                    } else {
                        iMax = Math.max((width2 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    }
                    int i14 = iMax;
                    width = paddingLeft;
                    paddingLeft = i14;
                    left = (paddingLeft + scrollX) - childAt.getLeft();
                    if (left != 0) {
                        childAt.offsetLeftAndRight(left);
                    }
                    paddingLeft = width;
                }
            }
        }
        l(i10, f10, i11);
        if (this.I3 != null) {
            int scrollX2 = getScrollX();
            int childCount2 = getChildCount();
            for (int i15 = 0; i15 < childCount2; i15++) {
                View childAt2 = getChildAt(i15);
                if (!((g) childAt2.getLayoutParams()).f76085a) {
                    this.I3.a(childAt2, (childAt2.getLeft() - scrollX2) / getClientWidth());
                }
            }
        }
        this.C3 = true;
    }

    boolean F() {
        int i10 = this.f76037f;
        if (i10 <= 0) {
            return false;
        }
        S(i10 - 1, true);
        return true;
    }

    boolean G() {
        androidx.viewpager.widget.a aVar = this.f76036e;
        if (aVar == null || this.f76037f >= aVar.getCount() - 1) {
            return false;
        }
        S(this.f76037f + 1, true);
        return true;
    }

    void J() {
        K(this.f76037f);
    }

    /* JADX WARN: Code duplicated, block: B:55:0x00cf A[PHI: r7 r10 r15
      0x00cf: PHI (r7v7 int) = (r7v6 int), (r7v5 int), (r7v10 int) binds: [B:64:0x00f3, B:61:0x00dd, B:53:0x00c4] A[DONT_GENERATE, DONT_INLINE]
      0x00cf: PHI (r10v9 int) = (r10v1 int), (r10v8 int), (r10v12 int) binds: [B:64:0x00f3, B:61:0x00dd, B:53:0x00c4] A[DONT_GENERATE, DONT_INLINE]
      0x00cf: PHI (r15v7 float) = (r15v5 float), (r15v6 float), (r15v4 float) binds: [B:64:0x00f3, B:61:0x00dd, B:53:0x00c4] A[DONT_GENERATE, DONT_INLINE]] */
    void K(int i10) {
        f fVarY;
        String hexString;
        f fVarA;
        f fVarW;
        f fVar;
        int i11 = this.f76037f;
        if (i11 != i10) {
            fVarY = y(i11);
            this.f76037f = i10;
        } else {
            fVarY = null;
        }
        if (this.f76036e == null) {
            a0();
            return;
        }
        if (this.f76058p2) {
            a0();
            return;
        }
        if (getWindowToken() == null) {
            return;
        }
        this.f76036e.startUpdate((ViewGroup) this);
        int i12 = this.f76039g3;
        int iMax = Math.max(0, this.f76037f - i12);
        int count = this.f76036e.getCount();
        int iMin = Math.min(count - 1, this.f76037f + i12);
        if (count != this.f76032a) {
            try {
                hexString = getResources().getResourceName(getId());
            } catch (Resources.NotFoundException unused) {
                hexString = Integer.toHexString(getId());
            }
            throw new IllegalStateException("The application's PagerAdapter changed the adapter's contents without calling PagerAdapter#notifyDataSetChanged! Expected adapter item count: " + this.f76032a + ", found: " + count + " Pager id: " + hexString + " Pager class: " + getClass() + " Problematic adapter: " + this.f76036e.getClass());
        }
        int i13 = 0;
        while (true) {
            if (i13 < this.f76033b.size()) {
                fVarA = this.f76033b.get(i13);
                int i14 = fVarA.f76081b;
                int i15 = this.f76037f;
                if (i14 >= i15) {
                    if (i14 != i15) {
                        break;
                    } else {
                        break;
                    }
                }
                i13++;
            }
            fVarA = null;
            break;
        }
        if (fVarA == null && count > 0) {
            fVarA = a(this.f76037f, i13);
        }
        if (fVarA != null) {
            int i16 = i13 - 1;
            f fVar2 = i16 >= 0 ? this.f76033b.get(i16) : null;
            int clientWidth = getClientWidth();
            float paddingLeft = clientWidth <= 0 ? 0.0f : (2.0f - fVarA.f76083d) + (getPaddingLeft() / clientWidth);
            float f10 = 0.0f;
            for (int i17 = this.f76037f - 1; i17 >= 0; i17--) {
                if (f10 < paddingLeft || i17 >= iMax) {
                    if (fVar2 == null || i17 != fVar2.f76081b) {
                        f10 += a(i17, i16 + 1).f76083d;
                        i13++;
                        if (i16 >= 0) {
                            fVar = this.f76033b.get(i16);
                        } else {
                            fVar = null;
                        }
                    } else {
                        f10 += fVar2.f76083d;
                        i16--;
                        if (i16 >= 0) {
                            fVar = this.f76033b.get(i16);
                        } else {
                            fVar = null;
                        }
                    }
                    fVar2 = fVar;
                } else {
                    if (fVar2 == null) {
                        break;
                    }
                    if (i17 == fVar2.f76081b && !fVar2.f76082c) {
                        this.f76033b.remove(i16);
                        this.f76036e.destroyItem((ViewGroup) this, i17, fVar2.f76080a);
                        i16--;
                        i13--;
                        if (i16 >= 0) {
                            fVar = this.f76033b.get(i16);
                        } else {
                            fVar = null;
                        }
                        fVar2 = fVar;
                    }
                }
            }
            float f11 = fVarA.f76083d;
            int i18 = i13 + 1;
            if (f11 < 2.0f) {
                f fVar3 = i18 < this.f76033b.size() ? this.f76033b.get(i18) : null;
                float paddingRight = clientWidth <= 0 ? 0.0f : (getPaddingRight() / clientWidth) + 2.0f;
                int i19 = this.f76037f;
                while (true) {
                    i19++;
                    if (i19 >= count) {
                        break;
                    }
                    if (f11 >= paddingRight && i19 > iMin) {
                        if (fVar3 == null) {
                            break;
                        }
                        if (i19 == fVar3.f76081b && !fVar3.f76082c) {
                            this.f76033b.remove(i18);
                            this.f76036e.destroyItem((ViewGroup) this, i19, fVar3.f76080a);
                            if (i18 < this.f76033b.size()) {
                                fVar3 = this.f76033b.get(i18);
                            }
                        }
                    } else if (fVar3 == null || i19 != fVar3.f76081b) {
                        f fVarA2 = a(i19, i18);
                        i18++;
                        f11 += fVarA2.f76083d;
                        fVar3 = i18 < this.f76033b.size() ? this.f76033b.get(i18) : null;
                    } else {
                        f11 += fVar3.f76083d;
                        i18++;
                        if (i18 < this.f76033b.size()) {
                            fVar3 = this.f76033b.get(i18);
                        }
                    }
                }
            }
            f(fVarA, i13, fVarY);
            this.f76036e.setPrimaryItem((ViewGroup) this, this.f76037f, fVarA.f76080a);
        }
        this.f76036e.finishUpdate((ViewGroup) this);
        int childCount = getChildCount();
        for (int i20 = 0; i20 < childCount; i20++) {
            View childAt = getChildAt(i20);
            g gVar = (g) childAt.getLayoutParams();
            gVar.f76090f = i20;
            if (!gVar.f76085a && gVar.f76087c == 0.0f && (fVarW = w(childAt)) != null) {
                gVar.f76087c = fVarW.f76083d;
                gVar.f76089e = fVarW.f76081b;
            }
        }
        a0();
        if (hasFocus()) {
            View viewFindFocus = findFocus();
            f fVarV = viewFindFocus != null ? v(viewFindFocus) : null;
            if (fVarV == null || fVarV.f76081b != this.f76037f) {
                for (int i21 = 0; i21 < getChildCount(); i21++) {
                    View childAt2 = getChildAt(i21);
                    f fVarW2 = w(childAt2);
                    if (fVarW2 != null && fVarW2.f76081b == this.f76037f && childAt2.requestFocus(2)) {
                        return;
                    }
                }
            }
        }
    }

    public void N(@NonNull i iVar) {
        List<i> list = this.H3;
        if (list != null) {
            list.remove(iVar);
        }
    }

    public void O(@NonNull j jVar) {
        List<j> list = this.E3;
        if (list != null) {
            list.remove(jVar);
        }
    }

    public void S(int i10, boolean z10) {
        this.f76058p2 = false;
        T(i10, z10, false);
    }

    void T(int i10, boolean z10, boolean z11) {
        U(i10, z10, z11, 0);
    }

    void U(int i10, boolean z10, boolean z11, int i11) {
        androidx.viewpager.widget.a aVar = this.f76036e;
        if (aVar == null || aVar.getCount() <= 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (!z11 && this.f76037f == i10 && this.f76033b.size() != 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        if (i10 < 0) {
            i10 = 0;
        } else if (i10 >= this.f76036e.getCount()) {
            i10 = this.f76036e.getCount() - 1;
        }
        int i12 = this.f76039g3;
        int i13 = this.f76037f;
        if (i10 > i13 + i12 || i10 < i13 - i12) {
            for (int i14 = 0; i14 < this.f76033b.size(); i14++) {
                this.f76033b.get(i14).f76082c = true;
            }
        }
        boolean z12 = this.f76037f != i10;
        if (!this.A3) {
            K(i10);
            R(i10, z10, i11, z12);
        } else {
            this.f76037f = i10;
            if (z12) {
                m(i10);
            }
            requestLayout();
        }
    }

    j V(j jVar) {
        j jVar2 = this.G3;
        this.G3 = jVar;
        return jVar2;
    }

    public void W(boolean z10, @p0 k kVar) {
        X(z10, kVar, 2);
    }

    public void X(boolean z10, @p0 k kVar, int i10) {
        boolean z11 = kVar != null;
        boolean z12 = z11 != (this.I3 != null);
        this.I3 = kVar;
        setChildrenDrawingOrderEnabled(z11);
        if (z11) {
            this.K3 = z10 ? 2 : 1;
            this.J3 = i10;
        } else {
            this.K3 = 0;
        }
        if (z12) {
            J();
        }
    }

    void Y(int i10, int i11) {
        Z(i10, i11, 0);
    }

    void Z(int i10, int i11, int i12) {
        int scrollX;
        int iAbs;
        if (getChildCount() == 0) {
            setScrollingCacheEnabled(false);
            return;
        }
        Scroller scroller = this.f76044j;
        if (scroller == null || scroller.isFinished()) {
            scrollX = getScrollX();
        } else {
            scrollX = this.f76046k ? this.f76044j.getCurrX() : this.f76044j.getStartX();
            this.f76044j.abortAnimation();
            setScrollingCacheEnabled(false);
        }
        int i13 = scrollX;
        int scrollY = getScrollY();
        int i14 = i10 - i13;
        int i15 = i11 - scrollY;
        if (i14 == 0 && i15 == 0) {
            i(false);
            J();
            setScrollState(0);
            return;
        }
        setScrollingCacheEnabled(true);
        setScrollState(2);
        int clientWidth = getClientWidth();
        int i16 = clientWidth / 2;
        float f10 = clientWidth;
        float f11 = i16;
        float fO = f11 + (o(Math.min(1.0f, (Math.abs(i14) * 1.0f) / f10)) * f11);
        int iAbs2 = Math.abs(i12);
        if (iAbs2 > 0) {
            iAbs = Math.round(Math.abs(fO / iAbs2) * 1000.0f) * 4;
        } else {
            iAbs = (int) (((Math.abs(i14) / ((f10 * this.f76036e.getPageWidth(this.f76037f)) + this.f76050m)) + 1.0f) * 100.0f);
        }
        int iMin = Math.min(iAbs, 600);
        this.f76046k = false;
        this.f76044j.startScroll(i13, scrollY, i14, i15, iMin);
        u1.s1(this);
    }

    f a(int i10, int i11) {
        f fVar = new f();
        fVar.f76081b = i10;
        fVar.f76080a = this.f76036e.instantiateItem((ViewGroup) this, i10);
        fVar.f76083d = this.f76036e.getPageWidth(i10);
        if (i11 < 0 || i11 >= this.f76033b.size()) {
            this.f76033b.add(fVar);
            return fVar;
        }
        this.f76033b.add(i11, fVar);
        return fVar;
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addFocusables(ArrayList<View> arrayList, int i10, int i11) {
        f fVarW;
        int size = arrayList.size();
        int descendantFocusability = getDescendantFocusability();
        if (descendantFocusability != 393216) {
            for (int i12 = 0; i12 < getChildCount(); i12++) {
                View childAt = getChildAt(i12);
                if (childAt.getVisibility() == 0 && (fVarW = w(childAt)) != null && fVarW.f76081b == this.f76037f) {
                    childAt.addFocusables(arrayList, i10, i11);
                }
            }
        }
        if ((descendantFocusability != 262144 || size == arrayList.size()) && isFocusable()) {
            if ((i11 & 1) == 1 && isInTouchMode() && !isFocusableInTouchMode()) {
                return;
            }
            arrayList.add(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public void addTouchables(ArrayList<View> arrayList) {
        f fVarW;
        for (int i10 = 0; i10 < getChildCount(); i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 0 && (fVarW = w(childAt)) != null && fVarW.f76081b == this.f76037f) {
                childAt.addTouchables(arrayList);
            }
        }
    }

    @Override // android.view.ViewGroup
    public void addView(View view, int i10, ViewGroup.LayoutParams layoutParams) {
        if (!checkLayoutParams(layoutParams)) {
            layoutParams = generateLayoutParams(layoutParams);
        }
        g gVar = (g) layoutParams;
        boolean zA = gVar.f76085a | A(view);
        gVar.f76085a = zA;
        if (!this.f76057p1) {
            super.addView(view, i10, layoutParams);
        } else {
            if (zA) {
                throw new IllegalStateException("Cannot add pager decor view during layout");
            }
            gVar.f76088d = true;
            addViewInLayout(view, i10, layoutParams);
        }
    }

    public void b(@NonNull i iVar) {
        if (this.H3 == null) {
            this.H3 = new ArrayList();
        }
        this.H3.add(iVar);
    }

    public void c(@NonNull j jVar) {
        if (this.E3 == null) {
            this.E3 = new ArrayList();
        }
        this.E3.add(jVar);
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i10) {
        if (this.f76036e == null) {
            return false;
        }
        int clientWidth = getClientWidth();
        int scrollX = getScrollX();
        if (i10 < 0) {
            return scrollX > ((int) (((float) clientWidth) * this.f76064t));
        }
        return i10 > 0 && scrollX < ((int) (((float) clientWidth) * this.f76067v));
    }

    @Override // android.view.ViewGroup
    protected boolean checkLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return (layoutParams instanceof g) && super.checkLayoutParams(layoutParams);
    }

    @Override // android.view.View
    public void computeScroll() {
        this.f76046k = true;
        if (this.f76044j.isFinished() || !this.f76044j.computeScrollOffset()) {
            i(true);
            return;
        }
        int scrollX = getScrollX();
        int scrollY = getScrollY();
        int currX = this.f76044j.getCurrX();
        int currY = this.f76044j.getCurrY();
        if (scrollX != currX || scrollY != currY) {
            scrollTo(currX, currY);
            if (!H(currX)) {
                this.f76044j.abortAnimation();
                scrollTo(0, currY);
            }
        }
        u1.s1(this);
    }

    /* JADX WARN: Code duplicated, block: B:43:0x00b8  */
    public boolean d(int i10) {
        boolean zF;
        View viewFindFocus = findFocus();
        if (viewFindFocus == this) {
            viewFindFocus = null;
            break;
        }
        if (viewFindFocus != null) {
            ViewParent parent = viewFindFocus.getParent();
            while (true) {
                if (!(parent instanceof ViewGroup)) {
                    StringBuilder sb2 = new StringBuilder();
                    sb2.append(viewFindFocus.getClass().getSimpleName());
                    for (ViewParent parent2 = viewFindFocus.getParent(); parent2 instanceof ViewGroup; parent2 = parent2.getParent()) {
                        sb2.append(" => ");
                        sb2.append(parent2.getClass().getSimpleName());
                    }
                    viewFindFocus = null;
                    break;
                }
                if (parent == this) {
                    break;
                }
                parent = parent.getParent();
            }
        }
        View viewFindNextFocus = FocusFinder.getInstance().findNextFocus(this, viewFindFocus, i10);
        if (viewFindNextFocus == null || viewFindNextFocus == viewFindFocus) {
            if (i10 == 17 || i10 == 1) {
                zF = F();
            } else if (i10 == 66 || i10 == 2) {
                zF = G();
            } else {
                zF = false;
            }
        } else if (i10 == 17) {
            zF = (viewFindFocus == null || u(this.f76035d, viewFindNextFocus).left < u(this.f76035d, viewFindFocus).left) ? viewFindNextFocus.requestFocus() : F();
        } else if (i10 == 66) {
            zF = (viewFindFocus == null || u(this.f76035d, viewFindNextFocus).left > u(this.f76035d, viewFindFocus).left) ? viewFindNextFocus.requestFocus() : G();
        } else {
            zF = false;
        }
        if (zF) {
            playSoundEffect(SoundEffectConstants.getContantForFocusDirection(i10));
        }
        return zF;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean dispatchKeyEvent(KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent) || s(keyEvent);
    }

    @Override // android.view.View
    public boolean dispatchPopulateAccessibilityEvent(AccessibilityEvent accessibilityEvent) {
        f fVarW;
        if (accessibilityEvent.getEventType() == 4096) {
            return super.dispatchPopulateAccessibilityEvent(accessibilityEvent);
        }
        int childCount = getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = getChildAt(i10);
            if (childAt.getVisibility() == 0 && (fVarW = w(childAt)) != null && fVarW.f76081b == this.f76037f && childAt.dispatchPopulateAccessibilityEvent(accessibilityEvent)) {
                return true;
            }
        }
        return false;
    }

    @Override // android.view.View
    public void draw(Canvas canvas) {
        androidx.viewpager.widget.a aVar;
        super.draw(canvas);
        int overScrollMode = getOverScrollMode();
        boolean zDraw = false;
        if (overScrollMode == 0 || (overScrollMode == 1 && (aVar = this.f76036e) != null && aVar.getCount() > 1)) {
            if (!this.f76072y3.isFinished()) {
                int iSave = canvas.save();
                int height = (getHeight() - getPaddingTop()) - getPaddingBottom();
                int width = getWidth();
                canvas.rotate(270.0f);
                canvas.translate((-height) + getPaddingTop(), this.f76064t * width);
                this.f76072y3.setSize(height, width);
                zDraw = this.f76072y3.draw(canvas);
                canvas.restoreToCount(iSave);
            }
            if (!this.f76073z3.isFinished()) {
                int iSave2 = canvas.save();
                int width2 = getWidth();
                int height2 = (getHeight() - getPaddingTop()) - getPaddingBottom();
                canvas.rotate(90.0f);
                canvas.translate(-getPaddingTop(), (-(this.f76067v + 1.0f)) * width2);
                this.f76073z3.setSize(height2, width2);
                zDraw |= this.f76073z3.draw(canvas);
                canvas.restoreToCount(iSave2);
            }
        } else {
            this.f76072y3.finish();
            this.f76073z3.finish();
        }
        if (zDraw) {
            u1.s1(this);
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        super.drawableStateChanged();
        Drawable drawable = this.f76052n;
        if (drawable == null || !drawable.isStateful()) {
            return;
        }
        drawable.setState(getDrawableState());
    }

    public boolean e() {
        if (this.f76041h3) {
            return false;
        }
        this.f76070w3 = true;
        setScrollState(1);
        this.f76051m3 = 0.0f;
        this.f76055o3 = 0.0f;
        VelocityTracker velocityTracker = this.f76061r3;
        if (velocityTracker == null) {
            this.f76061r3 = VelocityTracker.obtain();
        } else {
            velocityTracker.clear();
        }
        long jUptimeMillis = SystemClock.uptimeMillis();
        MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 0, 0.0f, 0.0f, 0);
        this.f76061r3.addMovement(motionEventObtain);
        motionEventObtain.recycle();
        this.f76071x3 = jUptimeMillis;
        return true;
    }

    protected boolean g(View view, boolean z10, int i10, int i11, int i12) {
        int i13;
        if (view instanceof ViewGroup) {
            ViewGroup viewGroup = (ViewGroup) view;
            int scrollX = view.getScrollX();
            int scrollY = view.getScrollY();
            for (int childCount = viewGroup.getChildCount() - 1; childCount >= 0; childCount--) {
                View childAt = viewGroup.getChildAt(childCount);
                int i14 = i11 + scrollX;
                if (i14 >= childAt.getLeft() && i14 < childAt.getRight() && (i13 = i12 + scrollY) >= childAt.getTop() && i13 < childAt.getBottom() && g(childAt, true, i10, i14 - childAt.getLeft(), i13 - childAt.getTop())) {
                    return true;
                }
            }
        }
        return z10 && view.canScrollHorizontally(-i10);
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new g();
    }

    @Override // android.view.ViewGroup
    protected ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return generateDefaultLayoutParams();
    }

    @p0
    public androidx.viewpager.widget.a getAdapter() {
        return this.f76036e;
    }

    @Override // android.view.ViewGroup
    protected int getChildDrawingOrder(int i10, int i11) {
        if (this.K3 == 2) {
            i11 = (i10 - 1) - i11;
        }
        return ((g) this.L3.get(i11).getLayoutParams()).f76090f;
    }

    public int getCurrentItem() {
        return this.f76037f;
    }

    public int getOffscreenPageLimit() {
        return this.f76039g3;
    }

    public int getPageMargin() {
        return this.f76050m;
    }

    public void h() {
        List<j> list = this.E3;
        if (list != null) {
            list.clear();
        }
    }

    void j() {
        int count = this.f76036e.getCount();
        this.f76032a = count;
        int i10 = 3 | 0;
        boolean z10 = this.f76033b.size() < (this.f76039g3 * 2) + 1 && this.f76033b.size() < count;
        int iMax = this.f76037f;
        int i11 = 0;
        boolean z11 = false;
        while (i11 < this.f76033b.size()) {
            f fVar = this.f76033b.get(i11);
            int itemPosition = this.f76036e.getItemPosition(fVar.f76080a);
            if (itemPosition != -1) {
                if (itemPosition == -2) {
                    this.f76033b.remove(i11);
                    i11--;
                    if (!z11) {
                        this.f76036e.startUpdate((ViewGroup) this);
                        z11 = true;
                    }
                    this.f76036e.destroyItem((ViewGroup) this, fVar.f76081b, fVar.f76080a);
                    int i12 = this.f76037f;
                    if (i12 == fVar.f76081b) {
                        iMax = Math.max(0, Math.min(i12, count - 1));
                    }
                } else {
                    int i13 = fVar.f76081b;
                    if (i13 != itemPosition) {
                        if (i13 == this.f76037f) {
                            iMax = itemPosition;
                        }
                        fVar.f76081b = itemPosition;
                    }
                }
                z10 = true;
            }
            i11++;
        }
        if (z11) {
            this.f76036e.finishUpdate((ViewGroup) this);
        }
        Collections.sort(this.f76033b, X3);
        if (z10) {
            int childCount = getChildCount();
            for (int i14 = 0; i14 < childCount; i14++) {
                g gVar = (g) getChildAt(i14).getLayoutParams();
                if (!gVar.f76085a) {
                    gVar.f76087c = 0.0f;
                }
            }
            T(iMax, false, true);
            requestLayout();
        }
    }

    float o(float f10) {
        return (float) Math.sin((f10 - 0.5f) * 0.47123894f);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.A3 = true;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        removeCallbacks(this.M3);
        Scroller scroller = this.f76044j;
        if (scroller != null && !scroller.isFinished()) {
            this.f76044j.abortAnimation();
        }
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    protected void onDraw(Canvas canvas) {
        int i10;
        float f10;
        super.onDraw(canvas);
        if (this.f76050m <= 0 || this.f76052n == null || this.f76033b.size() <= 0 || this.f76036e == null) {
            return;
        }
        int scrollX = getScrollX();
        int width = getWidth();
        float f11 = width;
        float f12 = this.f76050m / f11;
        int i11 = 0;
        f fVar = this.f76033b.get(0);
        float f13 = fVar.f76084e;
        int size = this.f76033b.size();
        int i12 = fVar.f76081b;
        int i13 = this.f76033b.get(size - 1).f76081b;
        while (i12 < i13) {
            while (true) {
                i10 = fVar.f76081b;
                if (i12 <= i10 || i11 >= size) {
                    break;
                }
                i11++;
                fVar = this.f76033b.get(i11);
            }
            if (i12 == i10) {
                float f14 = fVar.f76084e;
                float f15 = fVar.f76083d;
                f10 = (f14 + f15) * f11;
                f13 = f14 + f15 + f12;
            } else {
                float pageWidth = this.f76036e.getPageWidth(i12);
                f10 = (f13 + pageWidth) * f11;
                f13 += pageWidth + f12;
            }
            if (this.f76050m + f10 > scrollX) {
                this.f76052n.setBounds(Math.round(f10), this.f76054o, Math.round(this.f76050m + f10), this.f76062s);
                this.f76052n.draw(canvas);
            }
            if (f10 > scrollX + width) {
                return;
            }
            i12++;
            scrollX = scrollX;
        }
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
        int action = motionEvent.getAction() & 255;
        int i10 = 6 << 0;
        if (action != 3) {
            int i11 = i10 | 1;
            if (action != 1) {
                if (action != 0) {
                    if (this.f76041h3) {
                        return true;
                    }
                    if (this.f76043i3) {
                        return false;
                    }
                }
                if (action == 0) {
                    float x10 = motionEvent.getX();
                    this.f76055o3 = x10;
                    this.f76051m3 = x10;
                    float y10 = motionEvent.getY();
                    this.f76059p3 = y10;
                    this.f76053n3 = y10;
                    this.f76060q3 = motionEvent.getPointerId(0);
                    this.f76043i3 = false;
                    this.f76046k = true;
                    this.f76044j.computeScrollOffset();
                    if (this.N3 != 2 || Math.abs(this.f76044j.getFinalX() - this.f76044j.getCurrX()) <= this.f76068v3) {
                        i(false);
                        this.f76041h3 = false;
                    } else {
                        this.f76044j.abortAnimation();
                        this.f76058p2 = false;
                        J();
                        this.f76041h3 = true;
                        P(true);
                        setScrollState(1);
                    }
                } else if (action == 2) {
                    int i12 = this.f76060q3;
                    if (i12 != -1) {
                        int iFindPointerIndex = motionEvent.findPointerIndex(i12);
                        float x11 = motionEvent.getX(iFindPointerIndex);
                        float f10 = x11 - this.f76051m3;
                        float fAbs = Math.abs(f10);
                        float y11 = motionEvent.getY(iFindPointerIndex);
                        float fAbs2 = Math.abs(y11 - this.f76059p3);
                        if (f10 != 0.0f && !C(this.f76051m3, f10) && g(this, false, (int) f10, (int) x11, (int) y11)) {
                            this.f76051m3 = x11;
                            this.f76053n3 = y11;
                            this.f76043i3 = true;
                            return false;
                        }
                        int i13 = this.f76049l3;
                        if (fAbs > i13 && fAbs * 0.5f > fAbs2) {
                            this.f76041h3 = true;
                            P(true);
                            setScrollState(1);
                            float f11 = this.f76055o3;
                            float f12 = this.f76049l3;
                            this.f76051m3 = f10 > 0.0f ? f11 + f12 : f11 - f12;
                            this.f76053n3 = y11;
                            setScrollingCacheEnabled(true);
                        } else if (fAbs2 > i13) {
                            this.f76043i3 = true;
                        }
                        if (this.f76041h3 && I(x11)) {
                            u1.s1(this);
                        }
                    }
                } else if (action == 6) {
                    E(motionEvent);
                }
                if (this.f76061r3 == null) {
                    this.f76061r3 = VelocityTracker.obtain();
                }
                this.f76061r3.addMovement(motionEvent);
                return this.f76041h3;
            }
        }
        Q();
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:22:0x0075  */
    /* JADX WARN: Code duplicated, block: B:24:0x0079  */
    /* JADX WARN: Code duplicated, block: B:26:0x007d  */
    /* JADX WARN: Code duplicated, block: B:27:0x0080  */
    /* JADX WARN: Code duplicated, block: B:29:0x0094  */
    /* JADX WARN: Code duplicated, block: B:30:0x009a  */
    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        boolean z11;
        f fVarW;
        int iMax;
        int measuredWidth;
        int iMax2;
        int measuredHeight;
        int childCount = getChildCount();
        int i14 = i12 - i10;
        int i15 = i13 - i11;
        int paddingLeft = getPaddingLeft();
        int paddingTop = getPaddingTop();
        int paddingRight = getPaddingRight();
        int paddingBottom = getPaddingBottom();
        int scrollX = getScrollX();
        int i16 = 0;
        for (int i17 = 0; i17 < childCount; i17++) {
            View childAt = getChildAt(i17);
            if (childAt.getVisibility() != 8) {
                g gVar = (g) childAt.getLayoutParams();
                if (gVar.f76085a) {
                    int i18 = gVar.f76086b;
                    int i19 = i18 & 7;
                    int i20 = i18 & com.planner5d.library.engine.input.f.b.B;
                    if (i19 != 1) {
                        if (i19 == 3) {
                            measuredWidth = childAt.getMeasuredWidth() + paddingLeft;
                        } else if (i19 != 5) {
                            measuredWidth = paddingLeft;
                        } else {
                            iMax = (i14 - paddingRight) - childAt.getMeasuredWidth();
                            paddingRight += childAt.getMeasuredWidth();
                        }
                        if (i20 != 16) {
                            if (i20 != 48) {
                                measuredHeight = childAt.getMeasuredHeight() + paddingTop;
                            } else if (i20 != 80) {
                                measuredHeight = paddingTop;
                            } else {
                                iMax2 = (i15 - paddingBottom) - childAt.getMeasuredHeight();
                                paddingBottom += childAt.getMeasuredHeight();
                            }
                            int i21 = paddingLeft + scrollX;
                            childAt.layout(i21, paddingTop, childAt.getMeasuredWidth() + i21, paddingTop + childAt.getMeasuredHeight());
                            i16++;
                            paddingTop = measuredHeight;
                            paddingLeft = measuredWidth;
                        } else {
                            iMax2 = Math.max((i15 - childAt.getMeasuredHeight()) / 2, paddingTop);
                        }
                        int i22 = iMax2;
                        measuredHeight = paddingTop;
                        paddingTop = i22;
                        int i23 = paddingLeft + scrollX;
                        childAt.layout(i23, paddingTop, childAt.getMeasuredWidth() + i23, paddingTop + childAt.getMeasuredHeight());
                        i16++;
                        paddingTop = measuredHeight;
                        paddingLeft = measuredWidth;
                    } else {
                        iMax = Math.max((i14 - childAt.getMeasuredWidth()) / 2, paddingLeft);
                    }
                    int i24 = iMax;
                    measuredWidth = paddingLeft;
                    paddingLeft = i24;
                    if (i20 != 16) {
                        if (i20 != 48) {
                            measuredHeight = childAt.getMeasuredHeight() + paddingTop;
                        } else if (i20 != 80) {
                            measuredHeight = paddingTop;
                        } else {
                            iMax2 = (i15 - paddingBottom) - childAt.getMeasuredHeight();
                            paddingBottom += childAt.getMeasuredHeight();
                        }
                        int i25 = paddingLeft + scrollX;
                        childAt.layout(i25, paddingTop, childAt.getMeasuredWidth() + i25, paddingTop + childAt.getMeasuredHeight());
                        i16++;
                        paddingTop = measuredHeight;
                        paddingLeft = measuredWidth;
                    } else {
                        iMax2 = Math.max((i15 - childAt.getMeasuredHeight()) / 2, paddingTop);
                    }
                    int i26 = iMax2;
                    measuredHeight = paddingTop;
                    paddingTop = i26;
                    int i27 = paddingLeft + scrollX;
                    childAt.layout(i27, paddingTop, childAt.getMeasuredWidth() + i27, paddingTop + childAt.getMeasuredHeight());
                    i16++;
                    paddingTop = measuredHeight;
                    paddingLeft = measuredWidth;
                }
            }
        }
        int i28 = (i14 - paddingLeft) - paddingRight;
        for (int i29 = 0; i29 < childCount; i29++) {
            View childAt2 = getChildAt(i29);
            if (childAt2.getVisibility() != 8) {
                g gVar2 = (g) childAt2.getLayoutParams();
                if (!gVar2.f76085a && (fVarW = w(childAt2)) != null) {
                    float f10 = i28;
                    int i30 = ((int) (fVarW.f76084e * f10)) + paddingLeft;
                    if (gVar2.f76088d) {
                        gVar2.f76088d = false;
                        childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (f10 * gVar2.f76087c), 1073741824), View.MeasureSpec.makeMeasureSpec((i15 - paddingTop) - paddingBottom, 1073741824));
                    }
                    childAt2.layout(i30, paddingTop, childAt2.getMeasuredWidth() + i30, childAt2.getMeasuredHeight() + paddingTop);
                }
            }
        }
        this.f76054o = paddingTop;
        this.f76062s = i15 - paddingBottom;
        this.D3 = i16;
        if (this.A3) {
            z11 = false;
            R(this.f76037f, false, 0, false);
        } else {
            z11 = false;
        }
        this.A3 = z11;
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        g gVar;
        g gVar2;
        int i12;
        setMeasuredDimension(View.getDefaultSize(0, i10), View.getDefaultSize(0, i11));
        int measuredWidth = getMeasuredWidth();
        this.f76047k3 = Math.min(measuredWidth / 10, this.f76045j3);
        int paddingLeft = (measuredWidth - getPaddingLeft()) - getPaddingRight();
        int measuredHeight = (getMeasuredHeight() - getPaddingTop()) - getPaddingBottom();
        int childCount = getChildCount();
        int i13 = 0;
        while (true) {
            boolean z10 = true;
            int i14 = 1073741824;
            if (i13 >= childCount) {
                break;
            }
            View childAt = getChildAt(i13);
            if (childAt.getVisibility() != 8 && (gVar2 = (g) childAt.getLayoutParams()) != null && gVar2.f76085a) {
                int i15 = gVar2.f76086b;
                int i16 = i15 & 7;
                int i17 = i15 & com.planner5d.library.engine.input.f.b.B;
                boolean z11 = i17 == 48 || i17 == 80;
                if (i16 != 3 && i16 != 5) {
                    z10 = false;
                }
                int i18 = Integer.MIN_VALUE;
                if (z11) {
                    i12 = Integer.MIN_VALUE;
                    i18 = 1073741824;
                } else {
                    i12 = z10 ? 1073741824 : Integer.MIN_VALUE;
                }
                int i19 = ((ViewGroup.LayoutParams) gVar2).width;
                if (i19 != -2) {
                    if (i19 == -1) {
                        i19 = paddingLeft;
                    }
                    i18 = 1073741824;
                } else {
                    i19 = paddingLeft;
                }
                int i20 = ((ViewGroup.LayoutParams) gVar2).height;
                if (i20 == -2) {
                    i20 = measuredHeight;
                    i14 = i12;
                } else if (i20 == -1) {
                    i20 = measuredHeight;
                }
                childAt.measure(View.MeasureSpec.makeMeasureSpec(i19, i18), View.MeasureSpec.makeMeasureSpec(i20, i14));
                if (z11) {
                    measuredHeight -= childAt.getMeasuredHeight();
                } else if (z10) {
                    paddingLeft -= childAt.getMeasuredWidth();
                }
            }
            i13++;
        }
        this.f76069w = View.MeasureSpec.makeMeasureSpec(paddingLeft, 1073741824);
        this.f76056p0 = View.MeasureSpec.makeMeasureSpec(measuredHeight, 1073741824);
        this.f76057p1 = true;
        J();
        this.f76057p1 = false;
        int childCount2 = getChildCount();
        for (int i21 = 0; i21 < childCount2; i21++) {
            View childAt2 = getChildAt(i21);
            if (childAt2.getVisibility() != 8 && ((gVar = (g) childAt2.getLayoutParams()) == null || !gVar.f76085a)) {
                childAt2.measure(View.MeasureSpec.makeMeasureSpec((int) (paddingLeft * gVar.f76087c), 1073741824), this.f76056p0);
            }
        }
    }

    @Override // android.view.ViewGroup
    protected boolean onRequestFocusInDescendants(int i10, Rect rect) {
        int i11;
        int i12;
        int i13;
        f fVarW;
        int childCount = getChildCount();
        if ((i10 & 2) != 0) {
            i12 = childCount;
            i11 = 0;
            i13 = 1;
        } else {
            i11 = childCount - 1;
            i12 = -1;
            i13 = -1;
        }
        while (i11 != i12) {
            View childAt = getChildAt(i11);
            if (childAt.getVisibility() == 0 && (fVarW = w(childAt)) != null && fVarW.f76081b == this.f76037f && childAt.requestFocus(i10, rect)) {
                return true;
            }
            i11 += i13;
        }
        return false;
    }

    @Override // android.view.View
    public void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.a());
        androidx.viewpager.widget.a aVar = this.f76036e;
        if (aVar != null) {
            aVar.restoreState(savedState.f76075d, savedState.f76076e);
            T(savedState.f76074c, false, true);
        } else {
            this.f76038g = savedState.f76074c;
            this.f76040h = savedState.f76075d;
            this.f76042i = savedState.f76076e;
        }
    }

    @Override // android.view.View
    public Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f76074c = this.f76037f;
        androidx.viewpager.widget.a aVar = this.f76036e;
        if (aVar != null) {
            savedState.f76075d = aVar.saveState();
        }
        return savedState;
    }

    @Override // android.view.View
    protected void onSizeChanged(int i10, int i11, int i12, int i13) {
        super.onSizeChanged(i10, i11, i12, i13);
        if (i10 != i12) {
            int i14 = this.f76050m;
            L(i10, i12, i14, i14);
        }
    }

    /* JADX WARN: Code duplicated, block: B:54:0x00fb  */
    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        androidx.viewpager.widget.a aVar;
        if (this.f76070w3) {
            return true;
        }
        boolean zQ = false;
        if ((motionEvent.getAction() == 0 && motionEvent.getEdgeFlags() != 0) || (aVar = this.f76036e) == null || aVar.getCount() == 0) {
            return false;
        }
        if (this.f76061r3 == null) {
            this.f76061r3 = VelocityTracker.obtain();
        }
        this.f76061r3.addMovement(motionEvent);
        int action = motionEvent.getAction() & 255;
        if (action == 0) {
            this.f76044j.abortAnimation();
            this.f76058p2 = false;
            J();
            float x10 = motionEvent.getX();
            this.f76055o3 = x10;
            this.f76051m3 = x10;
            float y10 = motionEvent.getY();
            this.f76059p3 = y10;
            this.f76053n3 = y10;
            this.f76060q3 = motionEvent.getPointerId(0);
        } else if (action != 1) {
            if (action != 2) {
                if (action != 3) {
                    if (action == 5) {
                        int actionIndex = motionEvent.getActionIndex();
                        this.f76051m3 = motionEvent.getX(actionIndex);
                        this.f76060q3 = motionEvent.getPointerId(actionIndex);
                    } else if (action == 6) {
                        E(motionEvent);
                        this.f76051m3 = motionEvent.getX(motionEvent.findPointerIndex(this.f76060q3));
                    }
                } else if (this.f76041h3) {
                    R(this.f76037f, true, 0, false);
                    zQ = Q();
                }
            } else if (!this.f76041h3) {
                int iFindPointerIndex = motionEvent.findPointerIndex(this.f76060q3);
                if (iFindPointerIndex == -1) {
                    zQ = Q();
                } else {
                    float x11 = motionEvent.getX(iFindPointerIndex);
                    float fAbs = Math.abs(x11 - this.f76051m3);
                    float y11 = motionEvent.getY(iFindPointerIndex);
                    float fAbs2 = Math.abs(y11 - this.f76053n3);
                    if (fAbs > this.f76049l3 && fAbs > fAbs2) {
                        this.f76041h3 = true;
                        P(true);
                        float f10 = this.f76055o3;
                        this.f76051m3 = x11 - f10 > 0.0f ? f10 + this.f76049l3 : f10 - this.f76049l3;
                        this.f76053n3 = y11;
                        setScrollState(1);
                        setScrollingCacheEnabled(true);
                        ViewParent parent = getParent();
                        if (parent != null) {
                            parent.requestDisallowInterceptTouchEvent(true);
                        }
                    }
                    if (this.f76041h3) {
                        zQ = I(motionEvent.getX(motionEvent.findPointerIndex(this.f76060q3)));
                    }
                }
            } else if (this.f76041h3) {
                zQ = I(motionEvent.getX(motionEvent.findPointerIndex(this.f76060q3)));
            }
        } else if (this.f76041h3) {
            VelocityTracker velocityTracker = this.f76061r3;
            velocityTracker.computeCurrentVelocity(1000, this.f76065t3);
            int xVelocity = (int) velocityTracker.getXVelocity(this.f76060q3);
            this.f76058p2 = true;
            int clientWidth = getClientWidth();
            int scrollX = getScrollX();
            f fVarX = x();
            float f11 = clientWidth;
            U(k(fVarX.f76081b, ((scrollX / f11) - fVarX.f76084e) / (fVarX.f76083d + (this.f76050m / f11)), xVelocity, (int) (motionEvent.getX(motionEvent.findPointerIndex(this.f76060q3)) - this.f76055o3)), true, true, xVelocity);
            zQ = Q();
        }
        if (zQ) {
            u1.s1(this);
        }
        return true;
    }

    public void r() {
        if (!this.f76070w3) {
            throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
        }
        if (this.f76036e != null) {
            VelocityTracker velocityTracker = this.f76061r3;
            velocityTracker.computeCurrentVelocity(1000, this.f76065t3);
            int xVelocity = (int) velocityTracker.getXVelocity(this.f76060q3);
            this.f76058p2 = true;
            int clientWidth = getClientWidth();
            int scrollX = getScrollX();
            f fVarX = x();
            U(k(fVarX.f76081b, ((scrollX / clientWidth) - fVarX.f76084e) / fVarX.f76083d, xVelocity, (int) (this.f76051m3 - this.f76055o3)), true, true, xVelocity);
        }
        q();
        this.f76070w3 = false;
    }

    @Override // android.view.ViewGroup, android.view.ViewManager
    public void removeView(View view) {
        if (this.f76057p1) {
            removeViewInLayout(view);
        } else {
            super.removeView(view);
        }
    }

    public boolean s(@NonNull KeyEvent keyEvent) {
        if (keyEvent.getAction() == 0) {
            int keyCode = keyEvent.getKeyCode();
            if (keyCode == 21) {
                return keyEvent.hasModifiers(2) ? F() : d(17);
            }
            if (keyCode == 22) {
                return keyEvent.hasModifiers(2) ? G() : d(66);
            }
            if (keyCode == 61) {
                if (keyEvent.hasNoModifiers()) {
                    return d(2);
                }
                if (keyEvent.hasModifiers(1)) {
                    return d(1);
                }
            }
        }
        return false;
    }

    public void setAdapter(@p0 androidx.viewpager.widget.a aVar) {
        androidx.viewpager.widget.a aVar2 = this.f76036e;
        if (aVar2 != null) {
            aVar2.setViewPagerObserver(null);
            this.f76036e.startUpdate((ViewGroup) this);
            for (int i10 = 0; i10 < this.f76033b.size(); i10++) {
                f fVar = this.f76033b.get(i10);
                this.f76036e.destroyItem((ViewGroup) this, fVar.f76081b, fVar.f76080a);
            }
            this.f76036e.finishUpdate((ViewGroup) this);
            this.f76033b.clear();
            M();
            this.f76037f = 0;
            scrollTo(0, 0);
        }
        androidx.viewpager.widget.a aVar3 = this.f76036e;
        this.f76036e = aVar;
        this.f76032a = 0;
        if (aVar != null) {
            if (this.f76048l == null) {
                this.f76048l = new l();
            }
            this.f76036e.setViewPagerObserver(this.f76048l);
            this.f76058p2 = false;
            boolean z10 = this.A3;
            this.A3 = true;
            this.f76032a = this.f76036e.getCount();
            if (this.f76038g >= 0) {
                this.f76036e.restoreState(this.f76040h, this.f76042i);
                T(this.f76038g, false, true);
                this.f76038g = -1;
                this.f76040h = null;
                this.f76042i = null;
            } else if (z10) {
                requestLayout();
            } else {
                J();
            }
        }
        List<i> list = this.H3;
        if (list == null || list.isEmpty()) {
            return;
        }
        int size = this.H3.size();
        for (int i11 = 0; i11 < size; i11++) {
            this.H3.get(i11).a(this, aVar3, aVar);
        }
    }

    public void setCurrentItem(int i10) {
        this.f76058p2 = false;
        T(i10, !this.A3, false);
    }

    public void setOffscreenPageLimit(int i10) {
        if (i10 < 1) {
            i10 = 1;
        }
        if (i10 != this.f76039g3) {
            this.f76039g3 = i10;
            J();
        }
    }

    @Deprecated
    public void setOnPageChangeListener(j jVar) {
        this.F3 = jVar;
    }

    public void setPageMargin(int i10) {
        int i11 = this.f76050m;
        this.f76050m = i10;
        int width = getWidth();
        L(width, width, i10, i11);
        requestLayout();
    }

    public void setPageMarginDrawable(@p0 Drawable drawable) {
        this.f76052n = drawable;
        if (drawable != null) {
            refreshDrawableState();
        }
        setWillNotDraw(drawable == null);
        invalidate();
    }

    void setScrollState(int i10) {
        if (this.N3 == i10) {
            return;
        }
        this.N3 = i10;
        if (this.I3 != null) {
            p(i10 != 0);
        }
        n(i10);
    }

    public void t(float f10) {
        if (!this.f76070w3) {
            throw new IllegalStateException("No fake drag in progress. Call beginFakeDrag first.");
        }
        if (this.f76036e == null) {
            return;
        }
        this.f76051m3 += f10;
        float scrollX = getScrollX() - f10;
        float clientWidth = getClientWidth();
        float f11 = this.f76064t * clientWidth;
        float f12 = this.f76067v * clientWidth;
        f fVar = this.f76033b.get(0);
        ArrayList<f> arrayList = this.f76033b;
        f fVar2 = arrayList.get(arrayList.size() - 1);
        if (fVar.f76081b != 0) {
            f11 = fVar.f76084e * clientWidth;
        }
        if (fVar2.f76081b != this.f76036e.getCount() - 1) {
            f12 = fVar2.f76084e * clientWidth;
        }
        if (scrollX < f11) {
            scrollX = f11;
        } else if (scrollX > f12) {
            scrollX = f12;
        }
        int i10 = (int) scrollX;
        this.f76051m3 += scrollX - i10;
        scrollTo(i10, getScrollY());
        H(i10);
        MotionEvent motionEventObtain = MotionEvent.obtain(this.f76071x3, SystemClock.uptimeMillis(), 2, this.f76051m3, 0.0f, 0);
        this.f76061r3.addMovement(motionEventObtain);
        motionEventObtain.recycle();
    }

    f v(View view) {
        while (true) {
            Object parent = view.getParent();
            if (parent == this) {
                return w(view);
            }
            if (parent != null && (parent instanceof View)) {
                view = (View) parent;
            }
            return null;
        }
    }

    @Override // android.view.View
    protected boolean verifyDrawable(Drawable drawable) {
        return super.verifyDrawable(drawable) || drawable == this.f76052n;
    }

    f w(View view) {
        for (int i10 = 0; i10 < this.f76033b.size(); i10++) {
            f fVar = this.f76033b.get(i10);
            if (this.f76036e.isViewFromObject(view, fVar.f76080a)) {
                return fVar;
            }
        }
        return null;
    }

    f y(int i10) {
        for (int i11 = 0; i11 < this.f76033b.size(); i11++) {
            f fVar = this.f76033b.get(i11);
            if (fVar.f76081b == i10) {
                return fVar;
            }
        }
        return null;
    }

    void z() {
        setWillNotDraw(false);
        setDescendantFocusability(262144);
        setFocusable(true);
        Context context = getContext();
        this.f76044j = new Scroller(context, Y3);
        ViewConfiguration viewConfiguration = ViewConfiguration.get(context);
        float f10 = context.getResources().getDisplayMetrics().density;
        this.f76049l3 = viewConfiguration.getScaledPagingTouchSlop();
        this.f76063s3 = (int) (400.0f * f10);
        this.f76065t3 = viewConfiguration.getScaledMaximumFlingVelocity();
        this.f76072y3 = new EdgeEffect(context);
        this.f76073z3 = new EdgeEffect(context);
        this.f76066u3 = (int) (25.0f * f10);
        this.f76068v3 = (int) (2.0f * f10);
        this.f76045j3 = (int) (f10 * 16.0f);
        u1.G1(this, new h());
        if (u1.X(this) == 0) {
            u1.Y1(this, 1);
        }
        u1.j2(this, new d());
    }

    public static class g extends ViewGroup.LayoutParams {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public boolean f76085a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        public int f76086b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        float f76087c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        boolean f76088d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        int f76089e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        int f76090f;

        public g() {
            super(-1, -1);
            this.f76087c = 0.0f;
        }

        public g(Context context, AttributeSet attributeSet) {
            super(context, attributeSet);
            this.f76087c = 0.0f;
            TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, ViewPager.W3);
            this.f76086b = typedArrayObtainStyledAttributes.getInteger(0, 48);
            typedArrayObtainStyledAttributes.recycle();
        }
    }

    @Override // android.view.ViewGroup
    public ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        return new g(getContext(), attributeSet);
    }

    public void setPageMarginDrawable(@v int i10) {
        setPageMarginDrawable(androidx.core.content.d.l(getContext(), i10));
    }

    public ViewPager(@NonNull Context context, @p0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f76033b = new ArrayList<>();
        this.f76034c = new f();
        this.f76035d = new Rect();
        this.f76038g = -1;
        this.f76040h = null;
        this.f76042i = null;
        this.f76064t = -3.4028235E38f;
        this.f76067v = Float.MAX_VALUE;
        this.f76039g3 = 1;
        this.f76060q3 = -1;
        this.A3 = true;
        this.B3 = false;
        this.M3 = new c();
        this.N3 = 0;
        z();
    }
}

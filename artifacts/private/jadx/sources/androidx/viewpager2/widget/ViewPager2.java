package androidx.viewpager2.widget;

import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.util.SparseArray;
import android.view.Gravity;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.WindowInsets;
import android.view.accessibility.AccessibilityEvent;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.annotation.NonNull;
import androidx.annotation.b1;
import androidx.annotation.g0;
import androidx.annotation.p0;
import androidx.annotation.t0;
import androidx.annotation.w0;
import androidx.core.view.g3;
import androidx.core.view.u1;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.a0;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;

/* JADX INFO: loaded from: classes3.dex */
public final class ViewPager2 extends ViewGroup {
    public static final int H1 = 1;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    public static final int f76174g3 = 1;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    public static final int f76175h3 = 2;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    public static final int f76176i3 = -1;

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    static boolean f76177j3 = true;

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    private static final g3 f76178k3 = new g3.b().a();

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public static final int f76179p1 = 0;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    public static final int f76180p2 = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Rect f76181a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final Rect f76182b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private androidx.viewpager2.widget.b f76183c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    int f76184d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    boolean f76185e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private RecyclerView.j f76186f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    LinearLayoutManager f76187g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f76188h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private Parcelable f76189i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    RecyclerView f76190j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private a0 f76191k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    androidx.viewpager2.widget.g f76192l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private androidx.viewpager2.widget.b f76193m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private androidx.viewpager2.widget.d f76194n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private androidx.viewpager2.widget.f f76195o;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    e f76196p0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private RecyclerView.m f76197s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private boolean f76198t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private boolean f76199v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private int f76200w;

    class a extends g {
        a() {
            super(null);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.g, androidx.recyclerview.widget.RecyclerView.j
        public void a() {
            ViewPager2 viewPager2 = ViewPager2.this;
            viewPager2.f76185e = true;
            viewPager2.f76192l.n();
        }
    }

    class b extends j {
        b() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.j
        public void a(int i10) {
            if (i10 == 0) {
                ViewPager2.this.z();
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.j
        public void c(int i10) {
            ViewPager2 viewPager2 = ViewPager2.this;
            if (viewPager2.f76184d != i10) {
                viewPager2.f76184d = i10;
                viewPager2.f76196p0.r();
            }
        }
    }

    class c extends j {
        c() {
        }

        @Override // androidx.viewpager2.widget.ViewPager2.j
        public void c(int i10) {
            ViewPager2.this.clearFocus();
            if (ViewPager2.this.hasFocus()) {
                ViewPager2.this.f76190j.requestFocus(2);
            }
        }
    }

    class d implements RecyclerView.r {
        d() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.r
        public void b(@NonNull View view) {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.r
        public void d(@NonNull View view) {
            RecyclerView.q qVar = (RecyclerView.q) view.getLayoutParams();
            if (((ViewGroup.MarginLayoutParams) qVar).width != -1 || ((ViewGroup.MarginLayoutParams) qVar).height != -1) {
                throw new IllegalStateException("Pages must fill the whole ViewPager2 (use match_parent)");
            }
        }
    }

    private abstract class e {
        private e() {
        }

        boolean a() {
            return false;
        }

        boolean b(int i10) {
            return false;
        }

        boolean c(int i10, Bundle bundle) {
            return false;
        }

        boolean d() {
            return false;
        }

        void e(@p0 RecyclerView.h<?> hVar) {
        }

        void f(@p0 RecyclerView.h<?> hVar) {
        }

        String g() {
            throw new IllegalStateException("Not implemented.");
        }

        void h(@NonNull androidx.viewpager2.widget.b bVar, @NonNull RecyclerView recyclerView) {
        }

        void i(AccessibilityNodeInfo accessibilityNodeInfo) {
        }

        void j(@NonNull androidx.core.view.accessibility.j jVar) {
        }

        void k(@NonNull View view, @NonNull androidx.core.view.accessibility.j jVar) {
        }

        boolean l(int i10) {
            throw new IllegalStateException("Not implemented.");
        }

        boolean m(int i10, Bundle bundle) {
            throw new IllegalStateException("Not implemented.");
        }

        void n() {
        }

        CharSequence o() {
            throw new IllegalStateException("Not implemented.");
        }

        void p(@NonNull AccessibilityEvent accessibilityEvent) {
        }

        void q() {
        }

        void r() {
        }

        void s() {
        }

        void t() {
        }

        /* synthetic */ e(ViewPager2 viewPager2, a aVar) {
            this();
        }
    }

    class f extends e {
        f() {
            super(ViewPager2.this, null);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public boolean b(int i10) {
            return (i10 == 8192 || i10 == 4096) && !ViewPager2.this.m();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public boolean d() {
            return true;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void j(@NonNull androidx.core.view.accessibility.j jVar) {
            if (ViewPager2.this.m()) {
                return;
            }
            jVar.V0(androidx.core.view.accessibility.j.a.f48556s);
            jVar.V0(androidx.core.view.accessibility.j.a.f48555r);
            jVar.X1(false);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public boolean l(int i10) {
            if (b(i10)) {
                return false;
            }
            throw new IllegalStateException();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public CharSequence o() {
            if (d()) {
                return "androidx.viewpager.widget.ViewPager";
            }
            throw new IllegalStateException();
        }
    }

    private static abstract class g extends RecyclerView.j {
        private g() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public abstract void a();

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void b(int i10, int i11) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void c(int i10, int i11, @p0 Object obj) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void d(int i10, int i11) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void e(int i10, int i11, int i12) {
            a();
        }

        @Override // androidx.recyclerview.widget.RecyclerView.j
        public final void f(int i10, int i11) {
            a();
        }

        /* synthetic */ g(a aVar) {
            this();
        }
    }

    private class h extends LinearLayoutManager {
        h(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.p
        public boolean C1(@NonNull RecyclerView.x xVar, @NonNull RecyclerView.c0 c0Var, int i10, @p0 Bundle bundle) {
            return ViewPager2.this.f76196p0.b(i10) ? ViewPager2.this.f76196p0.l(i10) : super.C1(xVar, c0Var, i10, bundle);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.p
        public boolean Q1(@NonNull RecyclerView recyclerView, @NonNull View view, @NonNull Rect rect, boolean z10, boolean z11) {
            return false;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.p
        public void i1(@NonNull RecyclerView.x xVar, @NonNull RecyclerView.c0 c0Var, @NonNull androidx.core.view.accessibility.j jVar) {
            super.i1(xVar, c0Var, jVar);
            ViewPager2.this.f76196p0.j(jVar);
        }

        @Override // androidx.recyclerview.widget.RecyclerView.p
        public void k1(@NonNull RecyclerView.x xVar, @NonNull RecyclerView.c0 c0Var, @NonNull View view, @NonNull androidx.core.view.accessibility.j jVar) {
            ViewPager2.this.f76196p0.k(view, jVar);
        }

        @Override // androidx.recyclerview.widget.LinearLayoutManager
        protected void o2(@NonNull RecyclerView.c0 c0Var, @NonNull int[] iArr) {
            int offscreenPageLimit = ViewPager2.this.getOffscreenPageLimit();
            if (offscreenPageLimit == -1) {
                super.o2(c0Var, iArr);
                return;
            }
            int pageSize = ViewPager2.this.getPageSize() * offscreenPageLimit;
            iArr[0] = pageSize;
            iArr[1] = pageSize;
        }
    }

    @g0(from = 1)
    @Retention(RetentionPolicy.SOURCE)
    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    public @interface i {
    }

    public static abstract class j {
        public void a(int i10) {
        }

        public void b(int i10, float f10, @t0 int i11) {
        }

        public void c(int i10) {
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    public @interface k {
    }

    class l extends e {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final androidx.core.view.accessibility.m f76210b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final androidx.core.view.accessibility.m f76211c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private RecyclerView.j f76212d;

        class a implements androidx.core.view.accessibility.m {
            a() {
            }

            @Override // androidx.core.view.accessibility.m
            public boolean a(@NonNull View view, @p0 androidx.core.view.accessibility.m.a aVar) {
                l.this.x(((ViewPager2) view).getCurrentItem() + 1);
                return true;
            }
        }

        class b implements androidx.core.view.accessibility.m {
            b() {
            }

            @Override // androidx.core.view.accessibility.m
            public boolean a(@NonNull View view, @p0 androidx.core.view.accessibility.m.a aVar) {
                l.this.x(((ViewPager2) view).getCurrentItem() - 1);
                return true;
            }
        }

        class c extends g {
            c() {
                super(null);
            }

            @Override // androidx.viewpager2.widget.ViewPager2.g, androidx.recyclerview.widget.RecyclerView.j
            public void a() {
                l.this.y();
            }
        }

        l() {
            super(ViewPager2.this, null);
            this.f76210b = new a();
            this.f76211c = new b();
        }

        private void u(androidx.core.view.accessibility.j jVar) {
            int itemCount;
            int itemCount2;
            if (ViewPager2.this.getAdapter() != null) {
                itemCount2 = 1;
                if (ViewPager2.this.getOrientation() == 1) {
                    itemCount2 = ViewPager2.this.getAdapter().getItemCount();
                    itemCount = 1;
                } else {
                    itemCount = ViewPager2.this.getAdapter().getItemCount();
                }
            } else {
                itemCount = 0;
                itemCount2 = 0;
            }
            jVar.l1(androidx.core.view.accessibility.j.f.h(itemCount2, itemCount, false, 0));
        }

        private void v(View view, androidx.core.view.accessibility.j jVar) {
            int i10 = (2 << 1) | 0;
            jVar.m1(androidx.core.view.accessibility.j.g.j(ViewPager2.this.getOrientation() == 1 ? ViewPager2.this.f76187g.w0(view) : 0, 1, ViewPager2.this.getOrientation() == 0 ? ViewPager2.this.f76187g.w0(view) : 0, 1, false, false));
        }

        private void w(androidx.core.view.accessibility.j jVar) {
            int itemCount;
            RecyclerView.h adapter = ViewPager2.this.getAdapter();
            if (adapter != null && (itemCount = adapter.getItemCount()) != 0 && ViewPager2.this.m()) {
                if (ViewPager2.this.f76184d > 0) {
                    jVar.a(8192);
                }
                if (ViewPager2.this.f76184d < itemCount - 1) {
                    jVar.a(4096);
                }
                jVar.X1(true);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public boolean a() {
            return true;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public boolean c(int i10, Bundle bundle) {
            return i10 == 8192 || i10 == 4096;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void e(@p0 RecyclerView.h<?> hVar) {
            y();
            if (hVar != null) {
                hVar.registerAdapterDataObserver(this.f76212d);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void f(@p0 RecyclerView.h<?> hVar) {
            if (hVar != null) {
                hVar.unregisterAdapterDataObserver(this.f76212d);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public String g() {
            if (a()) {
                return "androidx.viewpager.widget.ViewPager";
            }
            throw new IllegalStateException();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void h(@NonNull androidx.viewpager2.widget.b bVar, @NonNull RecyclerView recyclerView) {
            u1.Y1(recyclerView, 2);
            this.f76212d = new c();
            if (u1.X(ViewPager2.this) == 0) {
                u1.Y1(ViewPager2.this, 1);
            }
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void i(AccessibilityNodeInfo accessibilityNodeInfo) {
            androidx.core.view.accessibility.j jVarR2 = androidx.core.view.accessibility.j.r2(accessibilityNodeInfo);
            u(jVarR2);
            w(jVarR2);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        void k(@NonNull View view, @NonNull androidx.core.view.accessibility.j jVar) {
            v(view, jVar);
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public boolean m(int i10, Bundle bundle) {
            if (!c(i10, bundle)) {
                throw new IllegalStateException();
            }
            x(i10 == 8192 ? ViewPager2.this.getCurrentItem() - 1 : ViewPager2.this.getCurrentItem() + 1);
            return true;
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void n() {
            y();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void p(@NonNull AccessibilityEvent accessibilityEvent) {
            accessibilityEvent.setSource(ViewPager2.this);
            accessibilityEvent.setClassName(g());
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void q() {
            y();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void r() {
            y();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void s() {
            y();
        }

        @Override // androidx.viewpager2.widget.ViewPager2.e
        public void t() {
            y();
        }

        void x(int i10) {
            if (ViewPager2.this.m()) {
                ViewPager2.this.u(i10, true);
            }
        }

        void y() {
            int itemCount;
            ViewPager2 viewPager2 = ViewPager2.this;
            int i10 = R.id.accessibilityActionPageLeft;
            u1.w1(viewPager2, R.id.accessibilityActionPageLeft);
            u1.w1(viewPager2, R.id.accessibilityActionPageRight);
            u1.w1(viewPager2, R.id.accessibilityActionPageUp);
            u1.w1(viewPager2, R.id.accessibilityActionPageDown);
            if (ViewPager2.this.getAdapter() != null && (itemCount = ViewPager2.this.getAdapter().getItemCount()) != 0 && ViewPager2.this.m()) {
                if (ViewPager2.this.getOrientation() == 0) {
                    boolean zL = ViewPager2.this.l();
                    int i11 = zL ? 16908360 : 16908361;
                    if (zL) {
                        i10 = 16908361;
                    }
                    if (ViewPager2.this.f76184d < itemCount - 1) {
                        u1.z1(viewPager2, new androidx.core.view.accessibility.j.a(i11, null), null, this.f76210b);
                    }
                    if (ViewPager2.this.f76184d > 0) {
                        u1.z1(viewPager2, new androidx.core.view.accessibility.j.a(i10, null), null, this.f76211c);
                    }
                } else {
                    if (ViewPager2.this.f76184d < itemCount - 1) {
                        u1.z1(viewPager2, new androidx.core.view.accessibility.j.a(R.id.accessibilityActionPageDown, null), null, this.f76210b);
                    }
                    if (ViewPager2.this.f76184d > 0) {
                        u1.z1(viewPager2, new androidx.core.view.accessibility.j.a(R.id.accessibilityActionPageUp, null), null, this.f76211c);
                    }
                }
            }
        }
    }

    public interface m {
        void a(@NonNull View view, float f10);
    }

    private class n extends a0 {
        n() {
        }

        @Override // androidx.recyclerview.widget.a0, androidx.recyclerview.widget.e0
        @p0
        public View h(RecyclerView.p pVar) {
            if (ViewPager2.this.k()) {
                return null;
            }
            return super.h(pVar);
        }
    }

    private class o extends RecyclerView {
        o(Context context) {
            super(context);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup, android.view.View
        @w0(23)
        public CharSequence getAccessibilityClassName() {
            return ViewPager2.this.f76196p0.d() ? ViewPager2.this.f76196p0.o() : super.getAccessibilityClassName();
        }

        @Override // android.view.View
        public void onInitializeAccessibilityEvent(@NonNull AccessibilityEvent accessibilityEvent) {
            super.onInitializeAccessibilityEvent(accessibilityEvent);
            accessibilityEvent.setFromIndex(ViewPager2.this.f76184d);
            accessibilityEvent.setToIndex(ViewPager2.this.f76184d);
            ViewPager2.this.f76196p0.p(accessibilityEvent);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent motionEvent) {
            return ViewPager2.this.m() && super.onInterceptTouchEvent(motionEvent);
        }

        @Override // androidx.recyclerview.widget.RecyclerView, android.view.View
        @e.a({"ClickableViewAccessibility"})
        public boolean onTouchEvent(MotionEvent motionEvent) {
            return ViewPager2.this.m() && super.onTouchEvent(motionEvent);
        }
    }

    @Retention(RetentionPolicy.SOURCE)
    @b1({b1.a.LIBRARY_GROUP_PREFIX})
    public @interface p {
    }

    private static class q implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final int f76218a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final RecyclerView f76219b;

        q(int i10, RecyclerView recyclerView) {
            this.f76218a = i10;
            this.f76219b = recyclerView;
        }

        @Override // java.lang.Runnable
        public void run() {
            this.f76219b.V1(this.f76218a);
        }
    }

    public ViewPager2(@NonNull Context context) {
        super(context);
        this.f76181a = new Rect();
        this.f76182b = new Rect();
        this.f76183c = new androidx.viewpager2.widget.b(3);
        this.f76185e = false;
        this.f76186f = new a();
        this.f76188h = -1;
        this.f76197s = null;
        this.f76198t = false;
        this.f76199v = true;
        this.f76200w = -1;
        i(context, null);
    }

    @w0(api = 21)
    private WindowInsets d(WindowInsets windowInsets) {
        g3 g3Var = f76178k3;
        return g3Var.J() != null ? g3Var.J() : windowInsets.consumeSystemWindowInsets().consumeStableInsets();
    }

    private RecyclerView.r f() {
        return new d();
    }

    private void i(Context context, AttributeSet attributeSet) {
        this.f76196p0 = f76177j3 ? new l() : new f();
        o oVar = new o(context);
        this.f76190j = oVar;
        oVar.setId(u1.D());
        this.f76190j.setDescendantFocusability(131072);
        h hVar = new h(context);
        this.f76187g = hVar;
        this.f76190j.setLayoutManager(hVar);
        this.f76190j.setScrollingTouchSlop(1);
        v(context, attributeSet);
        this.f76190j.setLayoutParams(new ViewGroup.LayoutParams(-1, -1));
        this.f76190j.p(f());
        androidx.viewpager2.widget.g gVar = new androidx.viewpager2.widget.g(this);
        this.f76192l = gVar;
        this.f76194n = new androidx.viewpager2.widget.d(this, gVar, this.f76190j);
        n nVar = new n();
        this.f76191k = nVar;
        nVar.b(this.f76190j);
        this.f76190j.r(this.f76192l);
        androidx.viewpager2.widget.b bVar = new androidx.viewpager2.widget.b(3);
        this.f76193m = bVar;
        this.f76192l.r(bVar);
        b bVar2 = new b();
        c cVar = new c();
        this.f76193m.d(bVar2);
        this.f76193m.d(cVar);
        this.f76196p0.h(this.f76193m, this.f76190j);
        this.f76193m.d(this.f76183c);
        androidx.viewpager2.widget.f fVar = new androidx.viewpager2.widget.f(this.f76187g);
        this.f76195o = fVar;
        this.f76193m.d(fVar);
        RecyclerView recyclerView = this.f76190j;
        attachViewToParent(recyclerView, 0, recyclerView.getLayoutParams());
    }

    private void n(@p0 RecyclerView.h<?> hVar) {
        if (hVar != null) {
            hVar.registerAdapterDataObserver(this.f76186f);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void s() {
        RecyclerView.h adapter;
        int i10 = 7 ^ (-1);
        if (this.f76188h == -1 || (adapter = getAdapter()) == 0) {
            return;
        }
        Parcelable parcelable = this.f76189i;
        if (parcelable != null) {
            if (adapter instanceof androidx.viewpager2.adapter.c) {
                ((androidx.viewpager2.adapter.c) adapter).g(parcelable);
            }
            this.f76189i = null;
        }
        int iMax = Math.max(0, Math.min(this.f76188h, adapter.getItemCount() - 1));
        this.f76184d = iMax;
        this.f76188h = -1;
        this.f76190j.M1(iMax);
        this.f76196p0.n();
    }

    private void v(Context context, AttributeSet attributeSet) {
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, d4.a.C1891a.f269652a);
        u1.E1(this, context, d4.a.C1891a.f269652a, attributeSet, typedArrayObtainStyledAttributes, 0, 0);
        try {
            setOrientation(typedArrayObtainStyledAttributes.getInt(d4.a.C1891a.f269653b, 0));
            typedArrayObtainStyledAttributes.recycle();
        } catch (Throwable th2) {
            typedArrayObtainStyledAttributes.recycle();
            throw th2;
        }
    }

    private void x(@p0 RecyclerView.h<?> hVar) {
        if (hVar != null) {
            hVar.unregisterAdapterDataObserver(this.f76186f);
        }
    }

    public void a(@NonNull RecyclerView.o oVar) {
        this.f76190j.n(oVar);
    }

    public void b(@NonNull RecyclerView.o oVar, int i10) {
        this.f76190j.o(oVar, i10);
    }

    public boolean c() {
        return this.f76194n.b();
    }

    @Override // android.view.View
    public boolean canScrollHorizontally(int i10) {
        return this.f76190j.canScrollHorizontally(i10);
    }

    @Override // android.view.View
    public boolean canScrollVertically(int i10) {
        return this.f76190j.canScrollVertically(i10);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchRestoreInstanceState(SparseArray<Parcelable> sparseArray) {
        Parcelable parcelable = sparseArray.get(getId());
        if (parcelable instanceof SavedState) {
            int i10 = ((SavedState) parcelable).f76201a;
            sparseArray.put(this.f76190j.getId(), sparseArray.get(i10));
            sparseArray.remove(i10);
        }
        super.dispatchRestoreInstanceState(sparseArray);
        s();
    }

    public boolean e() {
        return this.f76194n.d();
    }

    public boolean g(@e.a({"SupportAnnotationUsage"}) @t0 float f10) {
        return this.f76194n.e(f10);
    }

    @Override // android.view.ViewGroup, android.view.View
    @w0(23)
    public CharSequence getAccessibilityClassName() {
        return this.f76196p0.a() ? this.f76196p0.g() : super.getAccessibilityClassName();
    }

    @p0
    public RecyclerView.h getAdapter() {
        return this.f76190j.getAdapter();
    }

    public int getCurrentItem() {
        return this.f76184d;
    }

    public int getItemDecorationCount() {
        return this.f76190j.getItemDecorationCount();
    }

    public int getOffscreenPageLimit() {
        return this.f76200w;
    }

    public int getOrientation() {
        return this.f76187g.Q2();
    }

    int getPageSize() {
        int height;
        int paddingBottom;
        RecyclerView recyclerView = this.f76190j;
        if (getOrientation() == 0) {
            height = recyclerView.getWidth() - recyclerView.getPaddingLeft();
            paddingBottom = recyclerView.getPaddingRight();
        } else {
            height = recyclerView.getHeight() - recyclerView.getPaddingTop();
            paddingBottom = recyclerView.getPaddingBottom();
        }
        return height - paddingBottom;
    }

    public int getScrollState() {
        return this.f76192l.h();
    }

    @NonNull
    public RecyclerView.o h(int i10) {
        return this.f76190j.D0(i10);
    }

    public void j() {
        this.f76190j.O0();
    }

    public boolean k() {
        return this.f76194n.f();
    }

    boolean l() {
        return this.f76187g.m0() == 1;
    }

    public boolean m() {
        return this.f76199v;
    }

    public void o(@NonNull j jVar) {
        this.f76183c.d(jVar);
    }

    @Override // android.view.View
    @NonNull
    @w0(21)
    public WindowInsets onApplyWindowInsets(@NonNull WindowInsets windowInsets) {
        WindowInsets windowInsetsOnApplyWindowInsets = super.onApplyWindowInsets(windowInsets);
        if (windowInsetsOnApplyWindowInsets.isConsumed()) {
            return windowInsetsOnApplyWindowInsets;
        }
        int childCount = this.f76190j.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            this.f76190j.getChildAt(i10).dispatchApplyWindowInsets(new WindowInsets(windowInsetsOnApplyWindowInsets));
        }
        return d(windowInsets);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo accessibilityNodeInfo) {
        super.onInitializeAccessibilityNodeInfo(accessibilityNodeInfo);
        this.f76196p0.i(accessibilityNodeInfo);
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean z10, int i10, int i11, int i12, int i13) {
        int measuredWidth = this.f76190j.getMeasuredWidth();
        int measuredHeight = this.f76190j.getMeasuredHeight();
        this.f76181a.left = getPaddingLeft();
        this.f76181a.right = (i12 - i10) - getPaddingRight();
        this.f76181a.top = getPaddingTop();
        this.f76181a.bottom = (i13 - i11) - getPaddingBottom();
        Gravity.apply(8388659, measuredWidth, measuredHeight, this.f76181a, this.f76182b);
        RecyclerView recyclerView = this.f76190j;
        Rect rect = this.f76182b;
        recyclerView.layout(rect.left, rect.top, rect.right, rect.bottom);
        if (this.f76185e) {
            z();
        }
    }

    @Override // android.view.View
    protected void onMeasure(int i10, int i11) {
        measureChild(this.f76190j, i10, i11);
        int measuredWidth = this.f76190j.getMeasuredWidth();
        int measuredHeight = this.f76190j.getMeasuredHeight();
        int measuredState = this.f76190j.getMeasuredState();
        int paddingLeft = measuredWidth + getPaddingLeft() + getPaddingRight();
        int paddingTop = measuredHeight + getPaddingTop() + getPaddingBottom();
        setMeasuredDimension(View.resolveSizeAndState(Math.max(paddingLeft, getSuggestedMinimumWidth()), i10, measuredState), View.resolveSizeAndState(Math.max(paddingTop, getSuggestedMinimumHeight()), i11, measuredState << 16));
    }

    @Override // android.view.View
    protected void onRestoreInstanceState(Parcelable parcelable) {
        if (!(parcelable instanceof SavedState)) {
            super.onRestoreInstanceState(parcelable);
            return;
        }
        SavedState savedState = (SavedState) parcelable;
        super.onRestoreInstanceState(savedState.getSuperState());
        this.f76188h = savedState.f76202b;
        this.f76189i = savedState.f76203c;
    }

    @Override // android.view.View
    @p0
    protected Parcelable onSaveInstanceState() {
        SavedState savedState = new SavedState(super.onSaveInstanceState());
        savedState.f76201a = this.f76190j.getId();
        int i10 = this.f76188h;
        if (i10 == -1) {
            i10 = this.f76184d;
        }
        savedState.f76202b = i10;
        Parcelable parcelable = this.f76189i;
        if (parcelable != null) {
            savedState.f76203c = parcelable;
            return savedState;
        }
        Object adapter = this.f76190j.getAdapter();
        if (adapter instanceof androidx.viewpager2.adapter.c) {
            savedState.f76203c = ((androidx.viewpager2.adapter.c) adapter).a();
        }
        return savedState;
    }

    @Override // android.view.ViewGroup
    public void onViewAdded(View view) {
        throw new IllegalStateException(ViewPager2.class.getSimpleName() + " does not support direct child views");
    }

    public void p(@NonNull RecyclerView.o oVar) {
        this.f76190j.y1(oVar);
    }

    @Override // android.view.View
    @w0(16)
    public boolean performAccessibilityAction(int i10, Bundle bundle) {
        return this.f76196p0.c(i10, bundle) ? this.f76196p0.m(i10, bundle) : super.performAccessibilityAction(i10, bundle);
    }

    public void q(int i10) {
        this.f76190j.z1(i10);
    }

    public void r() {
        if (this.f76195o.d() == null) {
            return;
        }
        double dG = this.f76192l.g();
        int i10 = (int) dG;
        float f10 = (float) (dG - ((double) i10));
        this.f76195o.b(i10, f10, Math.round(getPageSize() * f10));
    }

    public void setAdapter(@p0 RecyclerView.h hVar) {
        RecyclerView.h adapter = this.f76190j.getAdapter();
        this.f76196p0.f(adapter);
        x(adapter);
        this.f76190j.setAdapter(hVar);
        this.f76184d = 0;
        s();
        this.f76196p0.e(hVar);
        n(hVar);
    }

    public void setCurrentItem(int i10) {
        t(i10, true);
    }

    @Override // android.view.View
    @w0(17)
    public void setLayoutDirection(int i10) {
        super.setLayoutDirection(i10);
        this.f76196p0.q();
    }

    public void setOffscreenPageLimit(int i10) {
        if (i10 < 1 && i10 != -1) {
            throw new IllegalArgumentException("Offscreen page limit must be OFFSCREEN_PAGE_LIMIT_DEFAULT or a number > 0");
        }
        this.f76200w = i10;
        this.f76190j.requestLayout();
    }

    public void setOrientation(int i10) {
        this.f76187g.j3(i10);
        this.f76196p0.s();
    }

    public void setPageTransformer(@p0 m mVar) {
        if (mVar != null) {
            if (!this.f76198t) {
                this.f76197s = this.f76190j.getItemAnimator();
                this.f76198t = true;
            }
            this.f76190j.setItemAnimator(null);
        } else if (this.f76198t) {
            this.f76190j.setItemAnimator(this.f76197s);
            this.f76197s = null;
            this.f76198t = false;
        }
        if (mVar == this.f76195o.d()) {
            return;
        }
        this.f76195o.e(mVar);
        r();
    }

    public void setUserInputEnabled(boolean z10) {
        this.f76199v = z10;
        this.f76196p0.t();
    }

    public void t(int i10, boolean z10) {
        if (k()) {
            throw new IllegalStateException("Cannot change current item when ViewPager2 is fake dragging");
        }
        u(i10, z10);
    }

    void u(int i10, boolean z10) {
        RecyclerView.h adapter = getAdapter();
        if (adapter == null) {
            if (this.f76188h != -1) {
                this.f76188h = Math.max(i10, 0);
                return;
            }
            return;
        }
        if (adapter.getItemCount() <= 0) {
            return;
        }
        int iMin = Math.min(Math.max(i10, 0), adapter.getItemCount() - 1);
        if (iMin == this.f76184d && this.f76192l.k()) {
            return;
        }
        int i11 = this.f76184d;
        if (iMin == i11 && z10) {
            return;
        }
        double dG = i11;
        this.f76184d = iMin;
        this.f76196p0.r();
        if (!this.f76192l.k()) {
            dG = this.f76192l.g();
        }
        this.f76192l.p(iMin, z10);
        if (!z10) {
            this.f76190j.M1(iMin);
            return;
        }
        double d10 = iMin;
        if (Math.abs(d10 - dG) <= 3.0d) {
            this.f76190j.V1(iMin);
            return;
        }
        this.f76190j.M1(d10 > dG ? iMin - 3 : iMin + 3);
        RecyclerView recyclerView = this.f76190j;
        recyclerView.post(new q(iMin, recyclerView));
    }

    void w() {
        View viewH = this.f76191k.h(this.f76187g);
        if (viewH == null) {
            return;
        }
        int[] iArrC = this.f76191k.c(this.f76187g, viewH);
        int i10 = iArrC[0];
        if (i10 == 0 && iArrC[1] == 0) {
            return;
        }
        this.f76190j.R1(i10, iArrC[1]);
    }

    public void y(@NonNull j jVar) {
        this.f76183c.e(jVar);
    }

    void z() {
        a0 a0Var = this.f76191k;
        if (a0Var == null) {
            throw new IllegalStateException("Design assumption violated.");
        }
        View viewH = a0Var.h(this.f76187g);
        if (viewH == null) {
            return;
        }
        int iW0 = this.f76187g.w0(viewH);
        if (iW0 != this.f76184d && getScrollState() == 0) {
            this.f76193m.c(iW0);
        }
        this.f76185e = false;
    }

    static class SavedState extends View.BaseSavedState {
        public static final Parcelable.Creator<SavedState> CREATOR = new a();

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f76201a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        int f76202b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        Parcelable f76203c;

        class a implements Parcelable.ClassLoaderCreator<SavedState> {
            a() {
            }

            @Override // android.os.Parcelable.Creator
            /* JADX INFO: renamed from: a, reason: merged with bridge method [inline-methods] */
            public SavedState createFromParcel(Parcel parcel) {
                return createFromParcel(parcel, null);
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

        @w0(24)
        SavedState(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            a(parcel, classLoader);
        }

        private void a(Parcel parcel, ClassLoader classLoader) {
            this.f76201a = parcel.readInt();
            this.f76202b = parcel.readInt();
            this.f76203c = parcel.readParcelable(classLoader);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public void writeToParcel(Parcel parcel, int i10) {
            super.writeToParcel(parcel, i10);
            parcel.writeInt(this.f76201a);
            parcel.writeInt(this.f76202b);
            parcel.writeParcelable(this.f76203c, i10);
        }

        SavedState(Parcel parcel) {
            super(parcel);
            a(parcel, null);
        }

        SavedState(Parcelable parcelable) {
            super(parcelable);
        }
    }

    public ViewPager2(@NonNull Context context, @p0 AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f76181a = new Rect();
        this.f76182b = new Rect();
        this.f76183c = new androidx.viewpager2.widget.b(3);
        this.f76185e = false;
        this.f76186f = new a();
        this.f76188h = -1;
        this.f76197s = null;
        this.f76198t = false;
        this.f76199v = true;
        this.f76200w = -1;
        i(context, attributeSet);
    }

    public ViewPager2(@NonNull Context context, @p0 AttributeSet attributeSet, int i10) {
        super(context, attributeSet, i10);
        this.f76181a = new Rect();
        this.f76182b = new Rect();
        this.f76183c = new androidx.viewpager2.widget.b(3);
        this.f76185e = false;
        this.f76186f = new a();
        this.f76188h = -1;
        this.f76197s = null;
        this.f76198t = false;
        this.f76199v = true;
        this.f76200w = -1;
        i(context, attributeSet);
    }

    @w0(21)
    public ViewPager2(@NonNull Context context, @p0 AttributeSet attributeSet, int i10, int i11) {
        super(context, attributeSet, i10, i11);
        this.f76181a = new Rect();
        this.f76182b = new Rect();
        this.f76183c = new androidx.viewpager2.widget.b(3);
        int i12 = 0 << 0;
        this.f76185e = false;
        this.f76186f = new a();
        this.f76188h = -1;
        this.f76197s = null;
        this.f76198t = false;
        this.f76199v = true;
        this.f76200w = -1;
        i(context, attributeSet);
    }
}

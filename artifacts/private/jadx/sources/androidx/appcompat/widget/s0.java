package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.database.DataSetObserver;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.util.AttributeSet;
import android.view.KeyEvent;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.LinearLayout;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.PopupWindow;
import androidx.annotation.NonNull;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
public class s0 implements androidx.appcompat.view.menu.q {

    /* JADX INFO: renamed from: m3, reason: collision with root package name */
    private static final String f11525m3 = "ListPopupWindow";

    /* JADX INFO: renamed from: n3, reason: collision with root package name */
    private static final boolean f11526n3 = false;

    /* JADX INFO: renamed from: o3, reason: collision with root package name */
    static final int f11527o3 = 250;

    /* JADX INFO: renamed from: p3, reason: collision with root package name */
    private static Method f11528p3 = null;

    /* JADX INFO: renamed from: q3, reason: collision with root package name */
    private static Method f11529q3 = null;

    /* JADX INFO: renamed from: r3, reason: collision with root package name */
    private static Method f11530r3 = null;

    /* JADX INFO: renamed from: s3, reason: collision with root package name */
    public static final int f11531s3 = 0;

    /* JADX INFO: renamed from: t3, reason: collision with root package name */
    public static final int f11532t3 = 1;

    /* JADX INFO: renamed from: u3, reason: collision with root package name */
    public static final int f11533u3 = -1;

    /* JADX INFO: renamed from: v3, reason: collision with root package name */
    public static final int f11534v3 = -2;

    /* JADX INFO: renamed from: w3, reason: collision with root package name */
    public static final int f11535w3 = 0;

    /* JADX INFO: renamed from: x3, reason: collision with root package name */
    public static final int f11536x3 = 1;

    /* JADX INFO: renamed from: y3, reason: collision with root package name */
    public static final int f11537y3 = 2;
    private final h H1;
    private Drawable X;
    private AdapterView.OnItemClickListener Y;
    private AdapterView.OnItemSelectedListener Z;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private Context f11538a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private ListAdapter f11539b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    n0 f11540c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f11541d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f11542e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f11543f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f11544g;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    private Runnable f11545g3;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f11546h;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    final Handler f11547h3;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f11548i;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    private final Rect f11549i3;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f11550j;

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    private Rect f11551j3;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f11552k;

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    private boolean f11553k3;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f11554l;

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    PopupWindow f11555l3;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f11556m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private boolean f11557n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    int f11558o;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    final j f11559p0;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private final i f11560p1;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    private final f f11561p2;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private View f11562s;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f11563t;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private DataSetObserver f11564v;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private View f11565w;

    class a extends q0 {
        a(View view) {
            super(view);
        }

        @Override // androidx.appcompat.widget.q0
        /* JADX INFO: renamed from: k, reason: merged with bridge method [inline-methods] */
        public s0 b() {
            return s0.this;
        }
    }

    class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            View viewV = s0.this.v();
            if (viewV == null || viewV.getWindowToken() == null) {
                return;
            }
            s0.this.a();
        }
    }

    class c implements AdapterView.OnItemSelectedListener {
        c() {
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onItemSelected(AdapterView<?> adapterView, View view, int i10, long j10) {
            n0 n0Var;
            if (i10 == -1 || (n0Var = s0.this.f11540c) == null) {
                return;
            }
            n0Var.setListSelectionHidden(false);
        }

        @Override // android.widget.AdapterView.OnItemSelectedListener
        public void onNothingSelected(AdapterView<?> adapterView) {
        }
    }

    @androidx.annotation.w0(24)
    static class d {
        private d() {
        }

        @androidx.annotation.u
        static int a(PopupWindow popupWindow, View view, int i10, boolean z10) {
            return popupWindow.getMaxAvailableHeight(view, i10, z10);
        }
    }

    @androidx.annotation.w0(29)
    static class e {
        private e() {
        }

        @androidx.annotation.u
        static void a(PopupWindow popupWindow, Rect rect) {
            popupWindow.setEpicenterBounds(rect);
        }

        @androidx.annotation.u
        static void b(PopupWindow popupWindow, boolean z10) {
            popupWindow.setIsClippedToScreen(z10);
        }
    }

    private class f implements Runnable {
        f() {
        }

        @Override // java.lang.Runnable
        public void run() {
            s0.this.s();
        }
    }

    private class g extends DataSetObserver {
        g() {
        }

        @Override // android.database.DataSetObserver
        public void onChanged() {
            if (s0.this.d()) {
                s0.this.a();
            }
        }

        @Override // android.database.DataSetObserver
        public void onInvalidated() {
            s0.this.dismiss();
        }
    }

    private class h implements AbsListView.OnScrollListener {
        h() {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScroll(AbsListView absListView, int i10, int i11, int i12) {
        }

        @Override // android.widget.AbsListView.OnScrollListener
        public void onScrollStateChanged(AbsListView absListView, int i10) {
            if (i10 == 1 && !s0.this.K() && s0.this.f11555l3.getContentView() != null) {
                s0 s0Var = s0.this;
                s0Var.f11547h3.removeCallbacks(s0Var.f11559p0);
                s0.this.f11559p0.run();
            }
        }
    }

    private class i implements View.OnTouchListener {
        i() {
        }

        @Override // android.view.View.OnTouchListener
        public boolean onTouch(View view, MotionEvent motionEvent) {
            PopupWindow popupWindow;
            int action = motionEvent.getAction();
            int x10 = (int) motionEvent.getX();
            int y10 = (int) motionEvent.getY();
            if (action == 0 && (popupWindow = s0.this.f11555l3) != null && popupWindow.isShowing() && x10 >= 0 && x10 < s0.this.f11555l3.getWidth() && y10 >= 0 && y10 < s0.this.f11555l3.getHeight()) {
                s0 s0Var = s0.this;
                s0Var.f11547h3.postDelayed(s0Var.f11559p0, 250L);
                return false;
            }
            if (action != 1) {
                return false;
            }
            s0 s0Var2 = s0.this;
            s0Var2.f11547h3.removeCallbacks(s0Var2.f11559p0);
            return false;
        }
    }

    private class j implements Runnable {
        j() {
        }

        @Override // java.lang.Runnable
        public void run() {
            n0 n0Var = s0.this.f11540c;
            if (n0Var == null || !n0Var.isAttachedToWindow() || s0.this.f11540c.getCount() <= s0.this.f11540c.getChildCount()) {
                return;
            }
            int childCount = s0.this.f11540c.getChildCount();
            s0 s0Var = s0.this;
            if (childCount <= s0Var.f11558o) {
                s0Var.f11555l3.setInputMethodMode(2);
                s0.this.a();
            }
        }
    }

    public s0(@NonNull Context context) {
        this(context, null, i.a.b.Z1);
    }

    private int A(View view, int i10, boolean z10) {
        return d.a(this.f11555l3, view, i10, z10);
    }

    private static boolean I(int i10) {
        return i10 == 66 || i10 == 23;
    }

    private void R() {
        View view = this.f11562s;
        if (view != null) {
            ViewParent parent = view.getParent();
            if (parent instanceof ViewGroup) {
                ((ViewGroup) parent).removeView(this.f11562s);
            }
        }
    }

    private void i0(boolean z10) {
        e.b(this.f11555l3, z10);
    }

    private int r() {
        int measuredHeight;
        int i10;
        int iMakeMeasureSpec;
        View view;
        int i11;
        if (this.f11540c == null) {
            Context context = this.f11538a;
            this.f11545g3 = new b();
            n0 n0VarU = u(context, !this.f11553k3);
            this.f11540c = n0VarU;
            Drawable drawable = this.X;
            if (drawable != null) {
                n0VarU.setSelector(drawable);
            }
            this.f11540c.setAdapter(this.f11539b);
            this.f11540c.setOnItemClickListener(this.Y);
            this.f11540c.setFocusable(true);
            this.f11540c.setFocusableInTouchMode(true);
            this.f11540c.setOnItemSelectedListener(new c());
            this.f11540c.setOnScrollListener(this.H1);
            AdapterView.OnItemSelectedListener onItemSelectedListener = this.Z;
            if (onItemSelectedListener != null) {
                this.f11540c.setOnItemSelectedListener(onItemSelectedListener);
            }
            n0 n0Var = this.f11540c;
            View view2 = this.f11562s;
            if (view2 != null) {
                LinearLayout linearLayout = new LinearLayout(context);
                linearLayout.setOrientation(1);
                LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-1, 0, 1.0f);
                int i12 = this.f11563t;
                if (i12 == 0) {
                    linearLayout.addView(view2);
                    linearLayout.addView(n0Var, layoutParams);
                } else if (i12 == 1) {
                    linearLayout.addView(n0Var, layoutParams);
                    linearLayout.addView(view2);
                }
                int i13 = this.f11542e;
                if (i13 >= 0) {
                    i11 = Integer.MIN_VALUE;
                } else {
                    i13 = 0;
                    i11 = 0;
                }
                view2.measure(View.MeasureSpec.makeMeasureSpec(i13, i11), 0);
                LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) view2.getLayoutParams();
                measuredHeight = view2.getMeasuredHeight() + layoutParams2.topMargin + layoutParams2.bottomMargin;
                view = linearLayout;
            } else {
                measuredHeight = 0;
                view = n0Var;
            }
            this.f11555l3.setContentView(view);
        } else {
            View view3 = this.f11562s;
            if (view3 != null) {
                LinearLayout.LayoutParams layoutParams3 = (LinearLayout.LayoutParams) view3.getLayoutParams();
                measuredHeight = view3.getMeasuredHeight() + layoutParams3.topMargin + layoutParams3.bottomMargin;
            } else {
                measuredHeight = 0;
            }
        }
        Drawable background = this.f11555l3.getBackground();
        if (background != null) {
            background.getPadding(this.f11549i3);
            Rect rect = this.f11549i3;
            int i14 = rect.top;
            i10 = rect.bottom + i14;
            if (!this.f11548i) {
                this.f11544g = -i14;
            }
        } else {
            this.f11549i3.setEmpty();
            i10 = 0;
        }
        int iA = A(v(), this.f11544g, this.f11555l3.getInputMethodMode() == 2);
        if (this.f11556m || this.f11541d == -1) {
            return iA + i10;
        }
        int i15 = this.f11542e;
        if (i15 == -2) {
            int i16 = this.f11538a.getResources().getDisplayMetrics().widthPixels;
            Rect rect2 = this.f11549i3;
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i16 - (rect2.left + rect2.right), Integer.MIN_VALUE);
        } else if (i15 != -1) {
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i15, 1073741824);
        } else {
            int i17 = this.f11538a.getResources().getDisplayMetrics().widthPixels;
            Rect rect3 = this.f11549i3;
            iMakeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i17 - (rect3.left + rect3.right), 1073741824);
        }
        int iE = this.f11540c.e(iMakeMeasureSpec, 0, -1, iA - measuredHeight, -1);
        if (iE > 0) {
            measuredHeight += i10 + this.f11540c.getPaddingTop() + this.f11540c.getPaddingBottom();
        }
        return iE + measuredHeight;
    }

    public int B() {
        return this.f11563t;
    }

    @androidx.annotation.p0
    public Object C() {
        if (d()) {
            return this.f11540c.getSelectedItem();
        }
        return null;
    }

    public long D() {
        if (d()) {
            return this.f11540c.getSelectedItemId();
        }
        return Long.MIN_VALUE;
    }

    public int E() {
        if (d()) {
            return this.f11540c.getSelectedItemPosition();
        }
        return -1;
    }

    @androidx.annotation.p0
    public View F() {
        if (d()) {
            return this.f11540c.getSelectedView();
        }
        return null;
    }

    public int G() {
        return this.f11555l3.getSoftInputMode();
    }

    public int H() {
        return this.f11542e;
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    public boolean J() {
        return this.f11556m;
    }

    public boolean K() {
        return this.f11555l3.getInputMethodMode() == 2;
    }

    public boolean L() {
        return this.f11553k3;
    }

    public boolean M(int i10, @NonNull KeyEvent keyEvent) {
        int iD;
        int count;
        if (d() && i10 != 62 && (this.f11540c.getSelectedItemPosition() >= 0 || !I(i10))) {
            int selectedItemPosition = this.f11540c.getSelectedItemPosition();
            boolean zIsAboveAnchor = this.f11555l3.isAboveAnchor();
            ListAdapter listAdapter = this.f11539b;
            if (listAdapter != null) {
                boolean zAreAllItemsEnabled = listAdapter.areAllItemsEnabled();
                iD = zAreAllItemsEnabled ? 0 : this.f11540c.d(0, true);
                count = zAreAllItemsEnabled ? listAdapter.getCount() - 1 : this.f11540c.d(listAdapter.getCount() - 1, false);
            } else {
                iD = Integer.MAX_VALUE;
                count = Integer.MIN_VALUE;
            }
            if ((!zIsAboveAnchor && i10 == 19 && selectedItemPosition <= iD) || (zIsAboveAnchor && i10 == 20 && selectedItemPosition >= count)) {
                s();
                this.f11555l3.setInputMethodMode(1);
                a();
                return true;
            }
            this.f11540c.setListSelectionHidden(false);
            if (this.f11540c.onKeyDown(i10, keyEvent)) {
                this.f11555l3.setInputMethodMode(2);
                this.f11540c.requestFocusFromTouch();
                a();
                if (i10 == 19 || i10 == 20 || i10 == 23 || i10 == 66) {
                    return true;
                }
            } else if (zIsAboveAnchor || i10 != 20) {
                if (zIsAboveAnchor && i10 == 19 && selectedItemPosition == iD) {
                    return true;
                }
            } else if (selectedItemPosition == count) {
                return true;
            }
        }
        return false;
    }

    public boolean N(int i10, @NonNull KeyEvent keyEvent) {
        if (i10 != 4 || !d()) {
            return false;
        }
        View view = this.f11565w;
        if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
            KeyEvent.DispatcherState keyDispatcherState = view.getKeyDispatcherState();
            if (keyDispatcherState != null) {
                keyDispatcherState.startTracking(keyEvent, this);
            }
            return true;
        }
        if (keyEvent.getAction() != 1) {
            return false;
        }
        KeyEvent.DispatcherState keyDispatcherState2 = view.getKeyDispatcherState();
        if (keyDispatcherState2 != null) {
            keyDispatcherState2.handleUpEvent(keyEvent);
        }
        if (!keyEvent.isTracking() || keyEvent.isCanceled()) {
            return false;
        }
        dismiss();
        return true;
    }

    public boolean O(int i10, @NonNull KeyEvent keyEvent) {
        if (!d() || this.f11540c.getSelectedItemPosition() < 0) {
            return false;
        }
        boolean zOnKeyUp = this.f11540c.onKeyUp(i10, keyEvent);
        if (zOnKeyUp && I(i10)) {
            dismiss();
        }
        return zOnKeyUp;
    }

    public boolean P(int i10) {
        if (!d()) {
            return false;
        }
        if (this.Y == null) {
            return true;
        }
        n0 n0Var = this.f11540c;
        this.Y.onItemClick(n0Var, n0Var.getChildAt(i10 - n0Var.getFirstVisiblePosition()), i10, n0Var.getAdapter().getItemId(i10));
        return true;
    }

    public void Q() {
        this.f11547h3.post(this.f11545g3);
    }

    public void S(@androidx.annotation.p0 View view) {
        this.f11565w = view;
    }

    public void T(@androidx.annotation.g1 int i10) {
        this.f11555l3.setAnimationStyle(i10);
    }

    public void U(int i10) {
        Drawable background = this.f11555l3.getBackground();
        if (background == null) {
            n0(i10);
            return;
        }
        background.getPadding(this.f11549i3);
        Rect rect = this.f11549i3;
        this.f11542e = rect.left + rect.right + i10;
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    public void V(boolean z10) {
        this.f11556m = z10;
    }

    public void W(int i10) {
        this.f11554l = i10;
    }

    public void X(@androidx.annotation.p0 Rect rect) {
        this.f11551j3 = rect != null ? new Rect(rect) : null;
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    public void Y(boolean z10) {
        this.f11557n = z10;
    }

    public void Z(int i10) {
        if (i10 < 0 && -2 != i10 && -1 != i10) {
            throw new IllegalArgumentException("Invalid height. Must be a positive value, MATCH_PARENT, or WRAP_CONTENT.");
        }
        this.f11541d = i10;
    }

    @Override // androidx.appcompat.view.menu.q
    public void a() {
        int iR = r();
        boolean zK = K();
        androidx.core.widget.p.d(this.f11555l3, this.f11546h);
        if (!this.f11555l3.isShowing()) {
            int width = this.f11542e;
            if (width == -1) {
                width = -1;
            } else if (width == -2) {
                width = v().getWidth();
            }
            int i10 = this.f11541d;
            if (i10 == -1) {
                iR = -1;
            } else if (i10 != -2) {
                iR = i10;
            }
            this.f11555l3.setWidth(width);
            this.f11555l3.setHeight(iR);
            i0(true);
            this.f11555l3.setOutsideTouchable((this.f11557n || this.f11556m) ? false : true);
            this.f11555l3.setTouchInterceptor(this.f11560p1);
            if (this.f11552k) {
                androidx.core.widget.p.c(this.f11555l3, this.f11550j);
            }
            e.a(this.f11555l3, this.f11551j3);
            androidx.core.widget.p.e(this.f11555l3, v(), this.f11543f, this.f11544g, this.f11554l);
            this.f11540c.setSelection(-1);
            if (!this.f11553k3 || this.f11540c.isInTouchMode()) {
                s();
            }
            if (!this.f11553k3) {
                this.f11547h3.post(this.f11561p2);
            }
        } else if (v().isAttachedToWindow()) {
            int width2 = this.f11542e;
            if (width2 == -1) {
                width2 = -1;
            } else if (width2 == -2) {
                width2 = v().getWidth();
            }
            int i11 = this.f11541d;
            if (i11 == -1) {
                if (!zK) {
                    iR = -1;
                }
                if (zK) {
                    this.f11555l3.setWidth(this.f11542e == -1 ? -1 : 0);
                    this.f11555l3.setHeight(0);
                } else {
                    this.f11555l3.setWidth(this.f11542e == -1 ? -1 : 0);
                    this.f11555l3.setHeight(-1);
                }
            } else if (i11 != -2) {
                iR = i11;
            }
            this.f11555l3.setOutsideTouchable((this.f11557n || this.f11556m) ? false : true);
            this.f11555l3.update(v(), this.f11543f, this.f11544g, width2 < 0 ? -1 : width2, iR < 0 ? -1 : iR);
        }
    }

    public void a0(int i10) {
        this.f11555l3.setInputMethodMode(i10);
    }

    public void b(@androidx.annotation.p0 Drawable drawable) {
        this.f11555l3.setBackgroundDrawable(drawable);
    }

    void b0(int i10) {
        this.f11558o = i10;
    }

    @androidx.annotation.p0
    public Drawable c() {
        return this.f11555l3.getBackground();
    }

    public void c0(Drawable drawable) {
        this.X = drawable;
    }

    @Override // androidx.appcompat.view.menu.q
    public boolean d() {
        return this.f11555l3.isShowing();
    }

    public void d0(boolean z10) {
        this.f11553k3 = z10;
        this.f11555l3.setFocusable(z10);
    }

    @Override // androidx.appcompat.view.menu.q
    public void dismiss() {
        this.f11555l3.dismiss();
        R();
        this.f11555l3.setContentView(null);
        this.f11540c = null;
        this.f11547h3.removeCallbacks(this.f11559p0);
    }

    public void e0(@androidx.annotation.p0 PopupWindow.OnDismissListener onDismissListener) {
        this.f11555l3.setOnDismissListener(onDismissListener);
    }

    public void f(int i10) {
        this.f11544g = i10;
        this.f11548i = true;
    }

    public void f0(@androidx.annotation.p0 AdapterView.OnItemClickListener onItemClickListener) {
        this.Y = onItemClickListener;
    }

    public void g0(@androidx.annotation.p0 AdapterView.OnItemSelectedListener onItemSelectedListener) {
        this.Z = onItemSelectedListener;
    }

    @androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
    public void h0(boolean z10) {
        this.f11552k = true;
        this.f11550j = z10;
    }

    public int i() {
        if (this.f11548i) {
            return this.f11544g;
        }
        return 0;
    }

    public void j0(int i10) {
        this.f11563t = i10;
    }

    @Override // androidx.appcompat.view.menu.q
    @androidx.annotation.p0
    public ListView k() {
        return this.f11540c;
    }

    public void k0(@androidx.annotation.p0 View view) {
        boolean zD = d();
        if (zD) {
            R();
        }
        this.f11562s = view;
        if (zD) {
            a();
        }
    }

    public int l() {
        return this.f11543f;
    }

    public void l0(int i10) {
        n0 n0Var = this.f11540c;
        if (!d() || n0Var == null) {
            return;
        }
        n0Var.setListSelectionHidden(false);
        n0Var.setSelection(i10);
        if (n0Var.getChoiceMode() != 0) {
            n0Var.setItemChecked(i10, true);
        }
    }

    public void m(int i10) {
        this.f11543f = i10;
    }

    public void m0(int i10) {
        this.f11555l3.setSoftInputMode(i10);
    }

    public void n0(int i10) {
        this.f11542e = i10;
    }

    public void o0(int i10) {
        this.f11546h = i10;
    }

    public void q(@androidx.annotation.p0 ListAdapter listAdapter) {
        DataSetObserver dataSetObserver = this.f11564v;
        if (dataSetObserver == null) {
            this.f11564v = new g();
        } else {
            ListAdapter listAdapter2 = this.f11539b;
            if (listAdapter2 != null) {
                listAdapter2.unregisterDataSetObserver(dataSetObserver);
            }
        }
        this.f11539b = listAdapter;
        if (listAdapter != null) {
            listAdapter.registerDataSetObserver(this.f11564v);
        }
        n0 n0Var = this.f11540c;
        if (n0Var != null) {
            n0Var.setAdapter(this.f11539b);
        }
    }

    public void s() {
        n0 n0Var = this.f11540c;
        if (n0Var != null) {
            n0Var.setListSelectionHidden(true);
            n0Var.requestLayout();
        }
    }

    public View.OnTouchListener t(View view) {
        return new a(view);
    }

    @NonNull
    n0 u(Context context, boolean z10) {
        return new n0(context, z10);
    }

    @androidx.annotation.p0
    public View v() {
        return this.f11565w;
    }

    @androidx.annotation.g1
    public int w() {
        return this.f11555l3.getAnimationStyle();
    }

    @androidx.annotation.p0
    public Rect x() {
        if (this.f11551j3 != null) {
            return new Rect(this.f11551j3);
        }
        return null;
    }

    public int y() {
        return this.f11541d;
    }

    public int z() {
        return this.f11555l3.getInputMethodMode();
    }

    public s0(@NonNull Context context, @androidx.annotation.p0 AttributeSet attributeSet) {
        this(context, attributeSet, i.a.b.Z1);
    }

    public s0(@NonNull Context context, @androidx.annotation.p0 AttributeSet attributeSet, @androidx.annotation.f int i10) {
        this(context, attributeSet, i10, 0);
    }

    public s0(@NonNull Context context, @androidx.annotation.p0 AttributeSet attributeSet, @androidx.annotation.f int i10, @androidx.annotation.g1 int i11) {
        this.f11541d = -2;
        this.f11542e = -2;
        this.f11546h = 1002;
        this.f11554l = 0;
        this.f11556m = false;
        this.f11557n = false;
        this.f11558o = Integer.MAX_VALUE;
        this.f11563t = 0;
        this.f11559p0 = new j();
        this.f11560p1 = new i();
        this.H1 = new h();
        this.f11561p2 = new f();
        this.f11549i3 = new Rect();
        this.f11538a = context;
        this.f11547h3 = new Handler(context.getMainLooper());
        TypedArray typedArrayObtainStyledAttributes = context.obtainStyledAttributes(attributeSet, i.a.m.f286482a4, i10, i11);
        this.f11543f = typedArrayObtainStyledAttributes.getDimensionPixelOffset(i.a.m.f286491b4, 0);
        int dimensionPixelOffset = typedArrayObtainStyledAttributes.getDimensionPixelOffset(i.a.m.f286500c4, 0);
        this.f11544g = dimensionPixelOffset;
        if (dimensionPixelOffset != 0) {
            this.f11548i = true;
        }
        typedArrayObtainStyledAttributes.recycle();
        y yVar = new y(context, attributeSet, i10, i11);
        this.f11555l3 = yVar;
        yVar.setInputMethodMode(1);
    }
}

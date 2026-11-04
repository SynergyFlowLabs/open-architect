package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AbsListView;
import android.widget.AdapterView;
import android.widget.ListAdapter;
import android.widget.ListView;
import androidx.annotation.NonNull;
import androidx.core.view.f2;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/* JADX INFO: loaded from: classes.dex */
class n0 extends ListView {

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    public static final int f11417n = -1;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    public static final int f11418o = -1;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final Rect f11419a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private int f11420b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f11421c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f11422d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f11423e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private int f11424f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private d f11425g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f11426h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f11427i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private boolean f11428j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private f2 f11429k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private androidx.core.widget.m f11430l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    f f11431m;

    @androidx.annotation.w0(21)
    static class a {
        private a() {
        }

        @androidx.annotation.u
        static void a(View view, float f10, float f11) {
            view.drawableHotspotChanged(f10, f11);
        }
    }

    @androidx.annotation.w0(30)
    static class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static Method f11432a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static Method f11433b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private static Method f11434c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private static boolean f11435d;

        static {
            try {
                Class cls = Integer.TYPE;
                Class cls2 = Boolean.TYPE;
                Class cls3 = Float.TYPE;
                Method declaredMethod = AbsListView.class.getDeclaredMethod("positionSelector", cls, View.class, cls2, cls3, cls3);
                f11432a = declaredMethod;
                declaredMethod.setAccessible(true);
                Method declaredMethod2 = AdapterView.class.getDeclaredMethod("setSelectedPositionInt", cls);
                f11433b = declaredMethod2;
                declaredMethod2.setAccessible(true);
                Method declaredMethod3 = AdapterView.class.getDeclaredMethod("setNextSelectedPositionInt", cls);
                f11434c = declaredMethod3;
                declaredMethod3.setAccessible(true);
                f11435d = true;
            } catch (NoSuchMethodException e10) {
                e10.printStackTrace();
            }
        }

        private b() {
        }

        static boolean a() {
            return f11435d;
        }

        @e.a({"BanUncheckedReflection"})
        static void b(n0 n0Var, int i10, View view) {
            try {
                f11432a.invoke(n0Var, Integer.valueOf(i10), view, Boolean.FALSE, -1, -1);
                f11433b.invoke(n0Var, Integer.valueOf(i10));
                f11434c.invoke(n0Var, Integer.valueOf(i10));
            } catch (IllegalAccessException e10) {
                e10.printStackTrace();
            } catch (InvocationTargetException e11) {
                e11.printStackTrace();
            }
        }
    }

    @androidx.annotation.w0(33)
    static class c {
        private c() {
        }

        @androidx.annotation.u
        static boolean a(AbsListView absListView) {
            return absListView.isSelectedChildViewEnabled();
        }

        @androidx.annotation.u
        static void b(AbsListView absListView, boolean z10) {
            absListView.setSelectedChildViewEnabled(z10);
        }
    }

    private static class d extends androidx.appcompat.graphics.drawable.c {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f11436b;

        d(Drawable drawable) {
            super(drawable);
            this.f11436b = true;
        }

        void c(boolean z10) {
            this.f11436b = z10;
        }

        @Override // androidx.appcompat.graphics.drawable.c, android.graphics.drawable.Drawable
        public void draw(@NonNull Canvas canvas) {
            if (this.f11436b) {
                super.draw(canvas);
            }
        }

        @Override // androidx.appcompat.graphics.drawable.c, android.graphics.drawable.Drawable
        public void setHotspot(float f10, float f11) {
            if (this.f11436b) {
                super.setHotspot(f10, f11);
            }
        }

        @Override // androidx.appcompat.graphics.drawable.c, android.graphics.drawable.Drawable
        public void setHotspotBounds(int i10, int i11, int i12, int i13) {
            if (this.f11436b) {
                super.setHotspotBounds(i10, i11, i12, i13);
            }
        }

        @Override // androidx.appcompat.graphics.drawable.c, android.graphics.drawable.Drawable
        public boolean setState(int[] iArr) {
            if (this.f11436b) {
                return super.setState(iArr);
            }
            return false;
        }

        @Override // androidx.appcompat.graphics.drawable.c, android.graphics.drawable.Drawable
        public boolean setVisible(boolean z10, boolean z11) {
            if (this.f11436b) {
                return super.setVisible(z10, z11);
            }
            return false;
        }
    }

    static class e {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static final Field f11437a;

        static {
            Field declaredField = null;
            try {
                declaredField = AbsListView.class.getDeclaredField("mIsChildViewEnabled");
                declaredField.setAccessible(true);
            } catch (NoSuchFieldException e10) {
                e10.printStackTrace();
            }
            f11437a = declaredField;
        }

        private e() {
        }

        static boolean a(AbsListView absListView) {
            Field field = f11437a;
            if (field == null) {
                return false;
            }
            try {
                return field.getBoolean(absListView);
            } catch (IllegalAccessException e10) {
                e10.printStackTrace();
                return false;
            }
        }

        static void b(AbsListView absListView, boolean z10) {
            Field field = f11437a;
            if (field != null) {
                try {
                    field.set(absListView, Boolean.valueOf(z10));
                } catch (IllegalAccessException e10) {
                    e10.printStackTrace();
                }
            }
        }
    }

    private class f implements Runnable {
        f() {
        }

        public void a() {
            n0 n0Var = n0.this;
            n0Var.f11431m = null;
            n0Var.removeCallbacks(this);
        }

        public void b() {
            n0.this.post(this);
        }

        @Override // java.lang.Runnable
        public void run() {
            n0 n0Var = n0.this;
            n0Var.f11431m = null;
            n0Var.drawableStateChanged();
        }
    }

    n0(@NonNull Context context, boolean z10) {
        super(context, null, i.a.b.f285969p1);
        this.f11419a = new Rect();
        this.f11420b = 0;
        this.f11421c = 0;
        this.f11422d = 0;
        this.f11423e = 0;
        this.f11427i = z10;
        setCacheColorHint(0);
    }

    private void a() {
        this.f11428j = false;
        setPressed(false);
        drawableStateChanged();
        View childAt = getChildAt(this.f11424f - getFirstVisiblePosition());
        if (childAt != null) {
            childAt.setPressed(false);
        }
        f2 f2Var = this.f11429k;
        if (f2Var != null) {
            f2Var.d();
            this.f11429k = null;
        }
    }

    private void b(View view, int i10) {
        performItemClick(view, i10, getItemIdAtPosition(i10));
    }

    private void c(Canvas canvas) {
        Drawable selector;
        if (this.f11419a.isEmpty() || (selector = getSelector()) == null) {
            return;
        }
        selector.setBounds(this.f11419a);
        selector.draw(canvas);
    }

    private void g(int i10, View view) {
        Rect rect = this.f11419a;
        rect.set(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
        rect.left -= this.f11420b;
        rect.top -= this.f11421c;
        rect.right += this.f11422d;
        rect.bottom += this.f11423e;
        boolean zL = l();
        if (view.isEnabled() != zL) {
            m(!zL);
            if (i10 != -1) {
                refreshDrawableState();
            }
        }
    }

    private void h(int i10, View view) {
        Drawable selector = getSelector();
        boolean z10 = (selector == null || i10 == -1) ? false : true;
        if (z10) {
            selector.setVisible(false, false);
        }
        g(i10, view);
        if (z10) {
            Rect rect = this.f11419a;
            float fExactCenterX = rect.exactCenterX();
            float fExactCenterY = rect.exactCenterY();
            selector.setVisible(getVisibility() == 0, false);
            androidx.core.graphics.drawable.c.k(selector, fExactCenterX, fExactCenterY);
        }
    }

    private void i(int i10, View view, float f10, float f11) {
        h(i10, view);
        Drawable selector = getSelector();
        if (selector == null || i10 == -1) {
            return;
        }
        androidx.core.graphics.drawable.c.k(selector, f10, f11);
    }

    private void j(View view, int i10, float f10, float f11) {
        View childAt;
        this.f11428j = true;
        a.a(this, f10, f11);
        if (!isPressed()) {
            setPressed(true);
        }
        layoutChildren();
        int i11 = this.f11424f;
        if (i11 != -1 && (childAt = getChildAt(i11 - getFirstVisiblePosition())) != null && childAt != view && childAt.isPressed()) {
            childAt.setPressed(false);
        }
        this.f11424f = i10;
        a.a(view, f10 - view.getLeft(), f11 - view.getTop());
        if (!view.isPressed()) {
            view.setPressed(true);
        }
        i(i10, view, f10, f11);
        k(false);
        refreshDrawableState();
    }

    private void k(boolean z10) {
        d dVar = this.f11425g;
        if (dVar != null) {
            dVar.c(z10);
        }
    }

    private boolean l() {
        return Build.VERSION.SDK_INT >= 33 ? c.a(this) : e.a(this);
    }

    private void m(boolean z10) {
        if (Build.VERSION.SDK_INT >= 33) {
            c.b(this, z10);
        } else {
            e.b(this, z10);
        }
    }

    private boolean n() {
        return this.f11428j;
    }

    private void o() {
        Drawable selector = getSelector();
        if (selector != null && n() && isPressed()) {
            selector.setState(getDrawableState());
        }
    }

    public int d(int i10, boolean z10) {
        int iMin;
        ListAdapter adapter = getAdapter();
        if (adapter != null && !isInTouchMode()) {
            int count = adapter.getCount();
            if (!getAdapter().areAllItemsEnabled()) {
                if (z10) {
                    iMin = Math.max(0, i10);
                    while (iMin < count && !adapter.isEnabled(iMin)) {
                        iMin++;
                    }
                } else {
                    iMin = Math.min(i10, count - 1);
                    while (iMin >= 0 && !adapter.isEnabled(iMin)) {
                        iMin--;
                    }
                }
                if (iMin < 0 || iMin >= count) {
                    return -1;
                }
                return iMin;
            }
            if (i10 >= 0 && i10 < count) {
                return i10;
            }
        }
        return -1;
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void dispatchDraw(Canvas canvas) {
        c(canvas);
        super.dispatchDraw(canvas);
    }

    @Override // android.widget.AbsListView, android.view.ViewGroup, android.view.View
    protected void drawableStateChanged() {
        if (this.f11431m != null) {
            return;
        }
        super.drawableStateChanged();
        k(true);
        o();
    }

    public int e(int i10, int i11, int i12, int i13, int i14) {
        int listPaddingTop = getListPaddingTop();
        int listPaddingBottom = getListPaddingBottom();
        int dividerHeight = getDividerHeight();
        Drawable divider = getDivider();
        ListAdapter adapter = getAdapter();
        if (adapter == null) {
            return listPaddingTop + listPaddingBottom;
        }
        int measuredHeight = listPaddingTop + listPaddingBottom;
        if (dividerHeight <= 0 || divider == null) {
            dividerHeight = 0;
        }
        int count = adapter.getCount();
        int i15 = 0;
        int i16 = 0;
        int i17 = 0;
        View view = null;
        while (i15 < count) {
            int itemViewType = adapter.getItemViewType(i15);
            if (itemViewType != i16) {
                view = null;
                i16 = itemViewType;
            }
            view = adapter.getView(i15, view, this);
            ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
            if (layoutParams == null) {
                layoutParams = generateDefaultLayoutParams();
                view.setLayoutParams(layoutParams);
            }
            int i18 = layoutParams.height;
            view.measure(i10, i18 > 0 ? View.MeasureSpec.makeMeasureSpec(i18, 1073741824) : View.MeasureSpec.makeMeasureSpec(0, 0));
            view.forceLayout();
            if (i15 > 0) {
                measuredHeight += dividerHeight;
            }
            measuredHeight += view.getMeasuredHeight();
            if (measuredHeight >= i13) {
                return (i14 < 0 || i15 <= i14 || i17 <= 0 || measuredHeight == i13) ? i13 : i17;
            }
            if (i14 >= 0 && i15 >= i14) {
                i17 = measuredHeight;
            }
            i15++;
        }
        return measuredHeight;
    }

    /* JADX WARN: Code duplicated, block: B:23:0x0057  */
    /* JADX WARN: Code duplicated, block: B:26:0x005d  */
    /* JADX WARN: Code duplicated, block: B:28:0x0062  */
    /* JADX WARN: Code duplicated, block: B:31:0x0076  */
    /* JADX WARN: Code duplicated, block: B:33:0x007a  */
    /* JADX WARN: Code duplicated, block: B:9:0x0018  */
    public boolean f(MotionEvent motionEvent, int i10) {
        boolean z10;
        boolean z11;
        androidx.core.widget.m mVar;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1) {
            z10 = false;
        } else {
            if (actionMasked != 2) {
                if (actionMasked != 3) {
                    z10 = true;
                    z11 = false;
                } else {
                    z11 = false;
                    z10 = false;
                }
                if (z10 || z11) {
                    a();
                }
                if (z10) {
                    mVar = this.f11430l;
                    if (mVar != null) {
                        mVar.o(false);
                    }
                    return z10;
                }
                if (this.f11430l == null) {
                    this.f11430l = new androidx.core.widget.m(this);
                }
                this.f11430l.o(true);
                this.f11430l.onTouch(this, motionEvent);
                return z10;
            }
            z10 = true;
        }
        int iFindPointerIndex = motionEvent.findPointerIndex(i10);
        if (iFindPointerIndex < 0) {
            z11 = false;
            z10 = false;
        } else {
            int x10 = (int) motionEvent.getX(iFindPointerIndex);
            int y10 = (int) motionEvent.getY(iFindPointerIndex);
            int iPointToPosition = pointToPosition(x10, y10);
            if (iPointToPosition == -1) {
                z11 = true;
            } else {
                View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
                j(childAt, iPointToPosition, x10, y10);
                if (actionMasked == 1) {
                    b(childAt, iPointToPosition);
                }
                z10 = true;
                z11 = false;
            }
        }
        if (z10) {
            a();
        } else {
            a();
        }
        if (z10) {
            mVar = this.f11430l;
            if (mVar != null) {
                mVar.o(false);
            }
            return z10;
        }
        if (this.f11430l == null) {
            this.f11430l = new androidx.core.widget.m(this);
        }
        this.f11430l.o(true);
        this.f11430l.onTouch(this, motionEvent);
        return z10;
    }

    @Override // android.view.ViewGroup, android.view.View
    public boolean hasFocus() {
        return this.f11427i || super.hasFocus();
    }

    @Override // android.view.View
    public boolean hasWindowFocus() {
        return this.f11427i || super.hasWindowFocus();
    }

    @Override // android.view.View
    public boolean isFocused() {
        return this.f11427i || super.isFocused();
    }

    @Override // android.view.View
    public boolean isInTouchMode() {
        return (this.f11427i && this.f11426h) || super.isInTouchMode();
    }

    @Override // android.widget.ListView, android.widget.AbsListView, android.widget.AdapterView, android.view.ViewGroup, android.view.View
    protected void onDetachedFromWindow() {
        this.f11431m = null;
        super.onDetachedFromWindow();
    }

    @Override // android.view.View
    public boolean onHoverEvent(@NonNull MotionEvent motionEvent) {
        int i10 = Build.VERSION.SDK_INT;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 10 && this.f11431m == null) {
            f fVar = new f();
            this.f11431m = fVar;
            fVar.b();
        }
        boolean zOnHoverEvent = super.onHoverEvent(motionEvent);
        if (actionMasked != 9 && actionMasked != 7) {
            setSelection(-1);
            return zOnHoverEvent;
        }
        int iPointToPosition = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        if (iPointToPosition != -1 && iPointToPosition != getSelectedItemPosition()) {
            View childAt = getChildAt(iPointToPosition - getFirstVisiblePosition());
            if (childAt.isEnabled()) {
                requestFocus();
                if (i10 < 30 || !b.a()) {
                    setSelectionFromTop(iPointToPosition, childAt.getTop() - getTop());
                } else {
                    b.b(this, iPointToPosition, childAt);
                }
            }
            o();
        }
        return zOnHoverEvent;
    }

    @Override // android.widget.AbsListView, android.view.View
    public boolean onTouchEvent(MotionEvent motionEvent) {
        if (motionEvent.getAction() == 0) {
            this.f11424f = pointToPosition((int) motionEvent.getX(), (int) motionEvent.getY());
        }
        f fVar = this.f11431m;
        if (fVar != null) {
            fVar.a();
        }
        return super.onTouchEvent(motionEvent);
    }

    void setListSelectionHidden(boolean z10) {
        this.f11426h = z10;
    }

    @Override // android.widget.AbsListView
    public void setSelector(Drawable drawable) {
        d dVar = drawable != null ? new d(drawable) : null;
        this.f11425g = dVar;
        super.setSelector(dVar);
        Rect rect = new Rect();
        if (drawable != null) {
            drawable.getPadding(rect);
        }
        this.f11420b = rect.left;
        this.f11421c = rect.top;
        this.f11422d = rect.right;
        this.f11423e = rect.bottom;
    }
}

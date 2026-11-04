package androidx.appcompat.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewConfiguration;
import android.view.ViewParent;

/* JADX INFO: loaded from: classes.dex */
@androidx.annotation.b1({androidx.annotation.b1.a.LIBRARY_GROUP_PREFIX})
public abstract class q0 implements View.OnTouchListener, View.OnAttachStateChangeListener {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final float f11495a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final int f11496b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final int f11497c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    final View f11498d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private Runnable f11499e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private Runnable f11500f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private boolean f11501g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f11502h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final int[] f11503i = new int[2];

    private class a implements Runnable {
        a() {
        }

        @Override // java.lang.Runnable
        public void run() {
            ViewParent parent = q0.this.f11498d.getParent();
            if (parent != null) {
                parent.requestDisallowInterceptTouchEvent(true);
            }
        }
    }

    private class b implements Runnable {
        b() {
        }

        @Override // java.lang.Runnable
        public void run() {
            q0.this.e();
        }
    }

    public q0(View view) {
        this.f11498d = view;
        view.setLongClickable(true);
        view.addOnAttachStateChangeListener(this);
        this.f11495a = ViewConfiguration.get(view.getContext()).getScaledTouchSlop();
        int tapTimeout = ViewConfiguration.getTapTimeout();
        this.f11496b = tapTimeout;
        this.f11497c = (tapTimeout + ViewConfiguration.getLongPressTimeout()) / 2;
    }

    private void a() {
        Runnable runnable = this.f11500f;
        if (runnable != null) {
            this.f11498d.removeCallbacks(runnable);
        }
        Runnable runnable2 = this.f11499e;
        if (runnable2 != null) {
            this.f11498d.removeCallbacks(runnable2);
        }
    }

    private boolean f(MotionEvent motionEvent) {
        n0 n0Var;
        View view = this.f11498d;
        androidx.appcompat.view.menu.q qVarB = b();
        if (qVarB != null && qVarB.d() && (n0Var = (n0) qVarB.k()) != null && n0Var.isShown()) {
            MotionEvent motionEventObtainNoHistory = MotionEvent.obtainNoHistory(motionEvent);
            i(view, motionEventObtainNoHistory);
            j(n0Var, motionEventObtainNoHistory);
            boolean zF = n0Var.f(motionEventObtainNoHistory, this.f11502h);
            motionEventObtainNoHistory.recycle();
            int actionMasked = motionEvent.getActionMasked();
            boolean z10 = (actionMasked == 1 || actionMasked == 3) ? false : true;
            if (zF && z10) {
                return true;
            }
        }
        return false;
    }

    /* JADX WARN: Code duplicated, block: B:21:0x0042  */
    private boolean g(MotionEvent motionEvent) {
        View view = this.f11498d;
        if (!view.isEnabled()) {
            return false;
        }
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 0) {
            this.f11502h = motionEvent.getPointerId(0);
            if (this.f11499e == null) {
                this.f11499e = new a();
            }
            view.postDelayed(this.f11499e, this.f11496b);
            if (this.f11500f == null) {
                this.f11500f = new b();
            }
            view.postDelayed(this.f11500f, this.f11497c);
        } else if (actionMasked == 1) {
            a();
        } else if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.f11502h);
            if (iFindPointerIndex >= 0 && !h(view, motionEvent.getX(iFindPointerIndex), motionEvent.getY(iFindPointerIndex), this.f11495a)) {
                a();
                view.getParent().requestDisallowInterceptTouchEvent(true);
                return true;
            }
        } else if (actionMasked == 3) {
            a();
        }
        return false;
    }

    private static boolean h(View view, float f10, float f11, float f12) {
        float f13 = -f12;
        return f10 >= f13 && f11 >= f13 && f10 < ((float) (view.getRight() - view.getLeft())) + f12 && f11 < ((float) (view.getBottom() - view.getTop())) + f12;
    }

    private boolean i(View view, MotionEvent motionEvent) {
        int[] iArr = this.f11503i;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation(iArr[0], iArr[1]);
        return true;
    }

    private boolean j(View view, MotionEvent motionEvent) {
        int[] iArr = this.f11503i;
        view.getLocationOnScreen(iArr);
        motionEvent.offsetLocation(-iArr[0], -iArr[1]);
        return true;
    }

    public abstract androidx.appcompat.view.menu.q b();

    protected boolean c() {
        androidx.appcompat.view.menu.q qVarB = b();
        if (qVarB != null && !qVarB.d()) {
            qVarB.a();
        }
        return true;
    }

    protected boolean d() {
        androidx.appcompat.view.menu.q qVarB = b();
        if (qVarB != null && qVarB.d()) {
            qVarB.dismiss();
        }
        return true;
    }

    void e() {
        a();
        View view = this.f11498d;
        if (view.isEnabled() && !view.isLongClickable() && c()) {
            view.getParent().requestDisallowInterceptTouchEvent(true);
            long jUptimeMillis = SystemClock.uptimeMillis();
            MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
            view.onTouchEvent(motionEventObtain);
            motionEventObtain.recycle();
            this.f11501g = true;
        }
    }

    @Override // android.view.View.OnTouchListener
    public boolean onTouch(View view, MotionEvent motionEvent) {
        boolean z10;
        boolean z11 = this.f11501g;
        if (z11) {
            z10 = f(motionEvent) || !d();
        } else {
            z10 = g(motionEvent) && c();
            if (z10) {
                long jUptimeMillis = SystemClock.uptimeMillis();
                MotionEvent motionEventObtain = MotionEvent.obtain(jUptimeMillis, jUptimeMillis, 3, 0.0f, 0.0f, 0);
                this.f11498d.onTouchEvent(motionEventObtain);
                motionEventObtain.recycle();
            }
        }
        this.f11501g = z10;
        return z10 || z11;
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewAttachedToWindow(View view) {
    }

    @Override // android.view.View.OnAttachStateChangeListener
    public void onViewDetachedFromWindow(View view) {
        this.f11501g = false;
        this.f11502h = -1;
        Runnable runnable = this.f11499e;
        if (runnable != null) {
            this.f11498d.removeCallbacks(runnable);
        }
    }
}

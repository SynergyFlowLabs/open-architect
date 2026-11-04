package com.google.android.material.appbar;

import android.content.Context;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.View;
import android.view.ViewConfiguration;
import android.widget.OverScroller;
import androidx.annotation.NonNull;
import androidx.annotation.p0;
import androidx.coordinatorlayout.widget.CoordinatorLayout;
import androidx.core.view.u1;

/* JADX INFO: loaded from: classes4.dex */
abstract class d<V extends View> extends f<V> {

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f111192k = -1;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @p0
    private Runnable f111193d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    OverScroller f111194e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f111195f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f111196g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private int f111197h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f111198i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    @p0
    private VelocityTracker f111199j;

    private class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private final CoordinatorLayout f111200a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final V f111201b;

        a(CoordinatorLayout coordinatorLayout, V v10) {
            this.f111200a = coordinatorLayout;
            this.f111201b = v10;
        }

        @Override // java.lang.Runnable
        public void run() {
            OverScroller overScroller;
            if (this.f111201b == null || (overScroller = d.this.f111194e) == null) {
                return;
            }
            if (!overScroller.computeScrollOffset()) {
                d.this.c0(this.f111200a, this.f111201b);
                return;
            }
            d dVar = d.this;
            dVar.e0(this.f111200a, this.f111201b, dVar.f111194e.getCurrY());
            u1.u1(this.f111201b, this);
        }
    }

    public d() {
        this.f111196g = -1;
        this.f111198i = -1;
    }

    private void X() {
        if (this.f111199j == null) {
            this.f111199j = VelocityTracker.obtain();
        }
    }

    /* JADX WARN: Code duplicated, block: B:27:0x0099  */
    /* JADX WARN: Code duplicated, block: B:30:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:33:0x00ac A[ADDED_TO_REGION] */
    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean L(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v10, @NonNull MotionEvent motionEvent) {
        boolean z10;
        VelocityTracker velocityTracker;
        VelocityTracker velocityTracker2;
        int actionMasked = motionEvent.getActionMasked();
        if (actionMasked == 1) {
            VelocityTracker velocityTracker3 = this.f111199j;
            if (velocityTracker3 != null) {
                velocityTracker3.addMovement(motionEvent);
                this.f111199j.computeCurrentVelocity(1000);
                Y(coordinatorLayout, v10, -a0(v10), 0, this.f111199j.getYVelocity(this.f111196g));
                z10 = true;
            }
            this.f111195f = false;
            this.f111196g = -1;
            velocityTracker = this.f111199j;
            if (velocityTracker != null) {
                velocityTracker.recycle();
                this.f111199j = null;
            }
            velocityTracker2 = this.f111199j;
            if (velocityTracker2 != null) {
                velocityTracker2.addMovement(motionEvent);
            }
            if (this.f111195f) {
            }
        }
        if (actionMasked == 2) {
            int iFindPointerIndex = motionEvent.findPointerIndex(this.f111196g);
            if (iFindPointerIndex == -1) {
                return false;
            }
            int y10 = (int) motionEvent.getY(iFindPointerIndex);
            int i10 = this.f111197h - y10;
            this.f111197h = y10;
            d0(coordinatorLayout, v10, i10, Z(v10), 0);
        } else if (actionMasked != 3) {
            if (actionMasked == 6) {
                int i11 = motionEvent.getActionIndex() == 0 ? 1 : 0;
                this.f111196g = motionEvent.getPointerId(i11);
                this.f111197h = (int) (motionEvent.getY(i11) + 0.5f);
            }
        }
        z10 = false;
        velocityTracker2 = this.f111199j;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        return !this.f111195f || z10;
        z10 = false;
        this.f111195f = false;
        this.f111196g = -1;
        velocityTracker = this.f111199j;
        if (velocityTracker != null) {
            velocityTracker.recycle();
            this.f111199j = null;
        }
        velocityTracker2 = this.f111199j;
        if (velocityTracker2 != null) {
            velocityTracker2.addMovement(motionEvent);
        }
        if (this.f111195f) {
        }
    }

    boolean W(V v10) {
        return false;
    }

    final boolean Y(CoordinatorLayout coordinatorLayout, @NonNull V v10, int i10, int i11, float f10) {
        Runnable runnable = this.f111193d;
        if (runnable != null) {
            v10.removeCallbacks(runnable);
            this.f111193d = null;
        }
        if (this.f111194e == null) {
            this.f111194e = new OverScroller(v10.getContext());
        }
        this.f111194e.fling(0, O(), 0, Math.round(f10), 0, 0, i10, i11);
        if (!this.f111194e.computeScrollOffset()) {
            c0(coordinatorLayout, v10);
            return false;
        }
        a aVar = new a(coordinatorLayout, v10);
        this.f111193d = aVar;
        u1.u1(v10, aVar);
        return true;
    }

    int Z(@NonNull V v10) {
        return -v10.getHeight();
    }

    int a0(@NonNull V v10) {
        return v10.getHeight();
    }

    int b0() {
        return O();
    }

    void c0(CoordinatorLayout coordinatorLayout, V v10) {
    }

    final int d0(CoordinatorLayout coordinatorLayout, V v10, int i10, int i11, int i12) {
        return f0(coordinatorLayout, v10, b0() - i10, i11, i12);
    }

    int e0(CoordinatorLayout coordinatorLayout, V v10, int i10) {
        return f0(coordinatorLayout, v10, i10, Integer.MIN_VALUE, Integer.MAX_VALUE);
    }

    int f0(CoordinatorLayout coordinatorLayout, V v10, int i10, int i11, int i12) {
        int iE;
        int iO = O();
        if (i11 == 0 || iO < i11 || iO > i12 || iO == (iE = n1.a.e(i10, i11, i12))) {
            return 0;
        }
        U(iE);
        return iO - iE;
    }

    @Override // androidx.coordinatorlayout.widget.CoordinatorLayout.c
    public boolean s(@NonNull CoordinatorLayout coordinatorLayout, @NonNull V v10, @NonNull MotionEvent motionEvent) {
        int iFindPointerIndex;
        if (this.f111198i < 0) {
            this.f111198i = ViewConfiguration.get(coordinatorLayout.getContext()).getScaledTouchSlop();
        }
        if (motionEvent.getActionMasked() == 2 && this.f111195f) {
            int i10 = this.f111196g;
            if (i10 != -1 && (iFindPointerIndex = motionEvent.findPointerIndex(i10)) != -1) {
                int y10 = (int) motionEvent.getY(iFindPointerIndex);
                if (Math.abs(y10 - this.f111197h) > this.f111198i) {
                    this.f111197h = y10;
                    return true;
                }
            }
            return false;
        }
        if (motionEvent.getActionMasked() == 0) {
            this.f111196g = -1;
            int x10 = (int) motionEvent.getX();
            int y11 = (int) motionEvent.getY();
            boolean z10 = W(v10) && coordinatorLayout.G(v10, x10, y11);
            this.f111195f = z10;
            if (z10) {
                this.f111197h = y11;
                this.f111196g = motionEvent.getPointerId(0);
                X();
                OverScroller overScroller = this.f111194e;
                if (overScroller != null && !overScroller.isFinished()) {
                    this.f111194e.abortAnimation();
                    return true;
                }
            }
        }
        VelocityTracker velocityTracker = this.f111199j;
        if (velocityTracker != null) {
            velocityTracker.addMovement(motionEvent);
        }
        return false;
    }

    public d(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f111196g = -1;
        this.f111198i = -1;
    }
}

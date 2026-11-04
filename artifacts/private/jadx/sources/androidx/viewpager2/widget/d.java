package androidx.viewpager2.widget;

import android.os.SystemClock;
import android.view.MotionEvent;
import android.view.VelocityTracker;
import android.view.ViewConfiguration;
import androidx.annotation.k1;
import androidx.recyclerview.widget.RecyclerView;

/* JADX INFO: loaded from: classes3.dex */
final class d {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final ViewPager2 f76225a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final g f76226b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final RecyclerView f76227c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private VelocityTracker f76228d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f76229e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f76230f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private int f76231g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private long f76232h;

    d(ViewPager2 viewPager2, g gVar, RecyclerView recyclerView) {
        this.f76225a = viewPager2;
        this.f76226b = gVar;
        this.f76227c = recyclerView;
    }

    private void a(long j10, int i10, float f10, float f11) {
        MotionEvent motionEventObtain = MotionEvent.obtain(this.f76232h, j10, i10, f10, f11, 0);
        this.f76228d.addMovement(motionEventObtain);
        motionEventObtain.recycle();
    }

    private void c() {
        VelocityTracker velocityTracker = this.f76228d;
        if (velocityTracker != null) {
            velocityTracker.clear();
        } else {
            this.f76228d = VelocityTracker.obtain();
            this.f76229e = ViewConfiguration.get(this.f76225a.getContext()).getScaledMaximumFlingVelocity();
        }
    }

    @k1
    boolean b() {
        if (this.f76226b.i()) {
            return false;
        }
        this.f76231g = 0;
        this.f76230f = 0;
        this.f76232h = SystemClock.uptimeMillis();
        c();
        this.f76226b.m();
        if (!this.f76226b.k()) {
            this.f76227c.Z1();
        }
        a(this.f76232h, 0, 0.0f, 0.0f);
        return true;
    }

    @k1
    boolean d() {
        if (!this.f76226b.j()) {
            return false;
        }
        this.f76226b.o();
        VelocityTracker velocityTracker = this.f76228d;
        velocityTracker.computeCurrentVelocity(1000, this.f76229e);
        if (!this.f76227c.p0((int) velocityTracker.getXVelocity(), (int) velocityTracker.getYVelocity())) {
            this.f76225a.w();
        }
        return true;
    }

    @k1
    boolean e(float f10) {
        if (!this.f76226b.j()) {
            return false;
        }
        float f11 = this.f76230f - f10;
        this.f76230f = f11;
        int iRound = Math.round(f11 - this.f76231g);
        this.f76231g += iRound;
        long jUptimeMillis = SystemClock.uptimeMillis();
        boolean z10 = this.f76225a.getOrientation() == 0;
        int i10 = z10 ? iRound : 0;
        int i11 = z10 ? 0 : iRound;
        float f12 = z10 ? this.f76230f : 0.0f;
        float f13 = z10 ? 0.0f : this.f76230f;
        this.f76227c.scrollBy(i10, i11);
        int i12 = 0 >> 2;
        a(jUptimeMillis, 2, f12, f13);
        return true;
    }

    boolean f() {
        return this.f76226b.j();
    }
}

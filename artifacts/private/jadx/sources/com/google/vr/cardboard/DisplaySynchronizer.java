package com.google.vr.cardboard;

import android.content.Context;
import android.util.DisplayMetrics;
import android.view.Choreographer;
import android.view.Display;
import java.util.concurrent.TimeUnit;

/* JADX INFO: loaded from: classes5.dex */
public class DisplaySynchronizer implements Choreographer.FrameCallback {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final long f126761g = TimeUnit.SECONDS.toNanos(1);

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private volatile long f126762a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private l f126763b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private volatile Display f126764c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private DisplayMetrics f126765d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private volatile int f126766e = -1;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private long f126767f = 0;

    public DisplaySynchronizer(Context context, Display display) {
        this.f126762a = nativeCreate(getClass().getClassLoader(), context.getApplicationContext());
        if (this.f126762a == 0) {
            throw new IllegalStateException("Native DisplaySynchronizer creation failed, implementation unavailable.");
        }
        i(display);
        l lVar = new l(this);
        this.f126763b = lVar;
        lVar.a();
    }

    private void a() {
        if (this.f126762a == 0) {
            throw new IllegalStateException("DisplaySynchronizer has already been shut down.");
        }
    }

    private void e() {
        this.f126766e = -1;
        DisplayMetrics displayMetricsD = g.d(this.f126764c);
        if (displayMetricsD.equals(this.f126765d)) {
            return;
        }
        if (this.f126765d != null) {
            nativeOnMetricsChanged(this.f126762a);
        }
        this.f126765d = displayMetricsD;
    }

    public void b() {
        l lVar = this.f126763b;
        if (lVar != null) {
            lVar.d();
            this.f126763b = null;
        }
    }

    public Display c() {
        return this.f126764c;
    }

    public long d() {
        a();
        return this.f126762a;
    }

    @Override // android.view.Choreographer.FrameCallback
    public void doFrame(long j10) {
        a();
        if (this.f126766e == -1 || j10 - this.f126767f > f126761g) {
            int rotation = this.f126764c.getRotation();
            if (rotation == 0) {
                this.f126766e = 0;
            } else if (rotation == 1) {
                this.f126766e = 90;
            } else if (rotation == 2) {
                this.f126766e = 180;
            } else if (rotation != 3) {
                this.f126766e = 0;
            } else {
                this.f126766e = 270;
            }
            this.f126767f = j10;
        }
        nativeUpdate(this.f126762a, j10, this.f126766e);
    }

    public void f() {
        e();
    }

    protected void finalize() throws Throwable {
        try {
            if (this.f126762a != 0) {
                nativeDestroy(this.f126762a);
            }
            super.finalize();
        } catch (Throwable th2) {
            super.finalize();
            throw th2;
        }
    }

    public void g() {
        l lVar = this.f126763b;
        if (lVar != null) {
            lVar.b();
        }
    }

    public void h() {
        e();
        l lVar = this.f126763b;
        if (lVar != null) {
            lVar.c();
        }
    }

    public void i(Display display) {
        a();
        this.f126764c = display;
        e();
        float refreshRate = display.getRefreshRate();
        nativeReset(this.f126762a, refreshRate >= 30.0f ? (long) (TimeUnit.SECONDS.toNanos(1L) / refreshRate) : 0L, display.getAppVsyncOffsetNanos());
    }

    public void j() {
        if (this.f126762a != 0) {
            g();
            l lVar = this.f126763b;
            if (lVar != null) {
                lVar.d();
            }
            nativeDestroy(this.f126762a);
            this.f126762a = 0L;
        }
    }

    protected native long nativeCreate(ClassLoader classLoader, Context context);

    protected native void nativeDestroy(long j10);

    protected native void nativeOnMetricsChanged(long j10);

    protected native void nativeReset(long j10, long j11, long j12);

    protected native void nativeUpdate(long j10, long j11, int i10);
}

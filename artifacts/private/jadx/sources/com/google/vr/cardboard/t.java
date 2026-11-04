package com.google.vr.cardboard;

import android.graphics.Point;
import android.opengl.GLSurfaceView;
import android.os.Process;
import com.google.vr.ndk.base.GvrApi;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* JADX INFO: loaded from: classes5.dex */
public class t implements GLSurfaceView.Renderer {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final GvrApi f126913a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private com.google.vr.ndk.base.z f126914b;

    class a implements Runnable {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ int f126915a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ int f126916b;

        a(int i10, int i11) {
            this.f126915a = i10;
            this.f126916b = i11;
        }

        @Override // java.lang.Runnable
        public void run() {
            if (this.f126915a <= 0 || this.f126916b <= 0) {
                t.this.f126914b.getHolder().setSizeFromLayout();
            } else {
                t.this.f126914b.getHolder().setFixedSize(this.f126915a, this.f126916b);
            }
        }
    }

    public t(GvrApi gvrApi) {
        if (gvrApi == null) {
            throw new IllegalArgumentException("GvrApi must be supplied for proper scanline rendering");
        }
        this.f126913a = gvrApi;
    }

    public void b() {
        this.f126913a.I();
    }

    public void c() {
        b();
    }

    public void d(int i10, int i11) {
        v.a(new a(i10, i11));
    }

    public void e(com.google.vr.ndk.base.z zVar) {
        if (zVar == null) {
            throw new IllegalArgumentException("GvrSurfaceView must be supplied for proper scanline rendering");
        }
        this.f126914b = zVar;
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onDrawFrame(GL10 gl10) {
        Point pointS = this.f126913a.S();
        if (pointS != null) {
            d(pointS.x, pointS.y);
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceChanged(GL10 gl10, int i10, int i11) {
        this.f126913a.J();
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        Thread.currentThread().setPriority(10);
        com.google.vr.cardboard.a.k(Process.myTid());
        this.f126913a.K();
    }
}

package com.badlogic.gdx.backends.android;

import android.opengl.GLES20;
import android.opengl.GLSurfaceView;
import android.util.DisplayMetrics;
import android.view.View;
import androidx.annotation.l0;
import com.badlogic.gdx.backends.android.surfaceview.d;
import com.badlogic.gdx.graphics.f;
import com.badlogic.gdx.graphics.glutils.j;
import com.badlogic.gdx.math.f0;
import com.planner5d.library.engine.k;
import gc.e;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.opengles.GL10;

/* JADX INFO: loaded from: classes3.dex */
public class a implements k, GLSurfaceView.Renderer, e {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected int f89748b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected int f89749c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final com.planner5d.library.engine.a f89750d;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    protected final vb.b f89762s;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private long f89751e = System.nanoTime();

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f89752f = 0.0f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private long f89753g = System.nanoTime();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private f0 f89754h = new f0(5);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private boolean f89755i = false;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private volatile boolean f89756j = false;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private volatile boolean f89757k = false;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private volatile boolean f89758l = false;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private boolean f89759m = false;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private float f89760n = 1.0f;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final Object f89761o = new Object();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected View f89747a = null;

    public a(com.planner5d.library.engine.a aVar, vb.b bVar) {
        this.f89762s = bVar;
        this.f89750d = aVar;
    }

    private void f(com.planner5d.library.engine.a aVar) {
        f.b(aVar);
        com.badlogic.gdx.graphics.k.G(aVar);
        j.e(aVar);
        com.badlogic.gdx.graphics.glutils.c.e(aVar);
    }

    private GLSurfaceView h() {
        View view = this.f89747a;
        if (view instanceof GLSurfaceView) {
            return (GLSurfaceView) view;
        }
        return null;
    }

    private void j(com.planner5d.library.engine.a aVar) {
        f.D(aVar);
        com.badlogic.gdx.graphics.k.J(aVar);
        j.N(aVar);
        com.badlogic.gdx.graphics.glutils.c.j(aVar);
    }

    private void m(int i10, int i11) {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        this.f89750d.j().getDefaultDisplay().getMetrics(displayMetrics);
        this.f89760n = displayMetrics.density;
        this.f89748b = i10;
        this.f89749c = i11;
        GLES20.glViewport(0, 0, i10, i11);
    }

    @Override // com.planner5d.library.engine.k
    public void a() {
        GLSurfaceView gLSurfaceViewH = h();
        if (gLSurfaceViewH != null) {
            gLSurfaceViewH.requestRender();
        }
    }

    @Override // com.planner5d.library.engine.k
    public k.b b() {
        DisplayMetrics displayMetrics = new DisplayMetrics();
        this.f89750d.j().getDefaultDisplay().getMetrics(displayMetrics);
        return new k.b(displayMetrics.widthPixels, displayMetrics.heightPixels, 0, 0);
    }

    @Override // gc.e
    public void dispose() {
        synchronized (this.f89761o) {
            try {
                if (this.f89759m) {
                    return;
                }
                this.f89759m = true;
                this.f89750d.e();
                f(this.f89750d);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // com.planner5d.library.engine.k
    public float e() {
        return this.f89754h.d() == 0.0f ? this.f89752f : this.f89754h.d();
    }

    protected GLSurfaceView.EGLConfigChooser g() {
        vb.b bVar = this.f89762s;
        return new d(bVar.f385710a, bVar.f385711b, bVar.f385712c, bVar.f385713d, bVar.f385714e, bVar.f385715f, bVar.f385716g);
    }

    @Override // com.planner5d.library.engine.k
    public float getDensity() {
        return this.f89760n;
    }

    @Override // com.planner5d.library.engine.k
    public int getHeight() {
        return this.f89749c;
    }

    @Override // com.planner5d.library.engine.k
    public int getWidth() {
        return this.f89748b;
    }

    public View i() {
        return this.f89747a;
    }

    @l0
    public void l() {
        GLSurfaceView gLSurfaceViewH = h();
        if (gLSurfaceViewH != null) {
            gLSurfaceViewH.onResume();
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onDrawFrame(GL10 gl10) {
        long jNanoTime = System.nanoTime();
        synchronized (this.f89761o) {
            try {
                if (this.f89759m) {
                    return;
                }
                boolean z10 = this.f89756j;
                boolean z11 = this.f89757k;
                boolean z12 = this.f89758l;
                if (this.f89758l) {
                    this.f89758l = false;
                }
                if (this.f89757k) {
                    this.f89757k = false;
                    this.f89761o.notifyAll();
                }
                float f10 = (jNanoTime - this.f89751e) / 1.0E9f;
                this.f89752f = f10;
                this.f89751e = jNanoTime;
                if (z12) {
                    this.f89752f = 0.0f;
                } else {
                    this.f89754h.a(f10);
                }
                if (z12) {
                    this.f89750d.b();
                }
                if (z10) {
                    this.f89750d.f();
                    this.f89750d.h().h();
                    this.f89750d.c().n1();
                }
                if (z11) {
                    this.f89750d.g();
                }
                if (jNanoTime - this.f89753g > 1000000000) {
                    this.f89753g = jNanoTime;
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceChanged(GL10 gl10, int i10, int i11) {
        m(i10, i11);
        if (!this.f89755i) {
            this.f89755i = true;
            this.f89750d.c().k();
            synchronized (this.f89761o) {
                this.f89756j = true;
            }
        }
        this.f89750d.c().c(i10, i11);
        j(this.f89750d);
    }

    @Override // android.opengl.GLSurfaceView.Renderer
    public void onSurfaceCreated(GL10 gl10, EGLConfig eGLConfig) {
        k.b bVarB = b();
        m(bVarB.f160766a, bVarB.f160767b);
        this.f89754h = new f0(5);
        this.f89751e = System.nanoTime();
        j(this.f89750d);
    }

    @androidx.annotation.d
    protected void p() {
        synchronized (this.f89761o) {
            try {
                if (this.f89759m) {
                    return;
                }
                this.f89756j = true;
                this.f89758l = true;
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    @l0
    protected void pause() {
        synchronized (this.f89761o) {
            try {
                if (this.f89756j && !this.f89759m) {
                    this.f89756j = false;
                    this.f89757k = true;
                    for (int i10 = 0; this.f89757k && i10 < 8; i10++) {
                        try {
                            this.f89761o.wait(500L);
                        } catch (InterruptedException unused) {
                        }
                    }
                    GLSurfaceView gLSurfaceViewH = h();
                    if (gLSurfaceViewH != null) {
                        gLSurfaceViewH.onPause();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }
}

package com.badlogic.gdx.graphics.g3d.utils;

import android.opengl.GLES20;

/* JADX INFO: loaded from: classes3.dex */
public class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public final l f94676a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f94677b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private int f94678c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private int f94679d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private int f94680e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private float f94681f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private float f94682g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private boolean f94683h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f94684i;

    public i(l lVar) {
        this.f94676a = lVar;
    }

    public void a() {
        GLES20.glDisable(2929);
        this.f94680e = 0;
        GLES20.glDepthMask(true);
        this.f94683h = true;
        GLES20.glDisable(3042);
        this.f94677b = false;
        GLES20.glDisable(2884);
        this.f94679d = 0;
        this.f94678c = 0;
        this.f94684i = 0;
        this.f94676a.s();
    }

    public void b() {
        if (this.f94680e != 0) {
            GLES20.glDisable(2929);
        }
        if (!this.f94683h) {
            GLES20.glDepthMask(true);
        }
        if (this.f94677b) {
            GLES20.glDisable(3042);
        }
        if (this.f94684i > 0) {
            GLES20.glDisable(2884);
        }
        this.f94676a.end();
    }

    public void c(boolean z10, int i10, int i11) {
        if (z10 != this.f94677b) {
            this.f94677b = z10;
            if (z10) {
                GLES20.glEnable(3042);
            } else {
                GLES20.glDisable(3042);
            }
        }
        if (z10) {
            if (this.f94678c == i10 && this.f94679d == i11) {
                return;
            }
            GLES20.glBlendFunc(i10, i11);
            this.f94678c = i10;
            this.f94679d = i11;
        }
    }

    public void d(int i10) {
        if (i10 != this.f94684i) {
            this.f94684i = i10;
            if (i10 != 1028 && i10 != 1029 && i10 != 1032) {
                GLES20.glDisable(2884);
            } else {
                GLES20.glEnable(2884);
                GLES20.glCullFace(i10);
            }
        }
    }

    public void e(boolean z10) {
        if (this.f94683h != z10) {
            this.f94683h = z10;
            GLES20.glDepthMask(z10);
        }
    }

    public void f(int i10) {
        g(i10, 0.0f, 1.0f);
    }

    public void g(int i10, float f10, float f11) {
        int i11 = this.f94680e;
        boolean z10 = i11 != 0;
        boolean z11 = i10 != 0;
        if (i11 != i10) {
            this.f94680e = i10;
            if (z11) {
                GLES20.glEnable(2929);
                GLES20.glDepthFunc(i10);
            } else {
                GLES20.glDisable(2929);
            }
        }
        if (z11) {
            if (!z10 || this.f94680e != i10) {
                this.f94680e = i10;
                GLES20.glDepthFunc(i10);
            }
            if (z10 && this.f94681f == f10 && this.f94682g == f11) {
                return;
            }
            this.f94681f = f10;
            this.f94682g = f11;
            GLES20.glDepthRangef(f10, f11);
        }
    }
}

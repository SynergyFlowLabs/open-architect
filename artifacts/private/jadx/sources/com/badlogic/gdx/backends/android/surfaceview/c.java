package com.badlogic.gdx.backends.android.surfaceview;

import android.content.Context;
import android.opengl.GLSurfaceView;
import android.view.inputmethod.BaseInputConnection;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;

/* JADX INFO: loaded from: classes3.dex */
public class c extends GLSurfaceView {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final f f89767a;

    private static class a implements GLSurfaceView.EGLConfigChooser {

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private static int f89768h = 4;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private static int[] f89769i = {12324, 4, 12323, 4, 12322, 4, 12352, 4, 12344};

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected int f89770a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        protected int f89771b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        protected int f89772c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        protected int f89773d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        protected int f89774e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        protected int f89775f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int[] f89776g = new int[1];

        public a(int i10, int i11, int i12, int i13, int i14, int i15) {
            this.f89770a = i10;
            this.f89771b = i11;
            this.f89772c = i12;
            this.f89773d = i13;
            this.f89774e = i14;
            this.f89775f = i15;
        }

        private int b(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i10, int i11) {
            return egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, i10, this.f89776g) ? this.f89776g[0] : i11;
        }

        public EGLConfig a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr) {
            int length = eGLConfigArr.length;
            int i10 = 0;
            while (i10 < length) {
                EGLConfig eGLConfig = eGLConfigArr[i10];
                a aVar = this;
                EGL10 egl11 = egl10;
                EGLDisplay eGLDisplay2 = eGLDisplay;
                int iB = aVar.b(egl11, eGLDisplay2, eGLConfig, 12325, 0);
                int iB2 = aVar.b(egl11, eGLDisplay2, eGLConfig, 12326, 0);
                if (iB >= aVar.f89774e && iB2 >= aVar.f89775f) {
                    int iB3 = aVar.b(egl11, eGLDisplay2, eGLConfig, 12324, 0);
                    int iB4 = aVar.b(egl11, eGLDisplay2, eGLConfig, 12323, 0);
                    int iB5 = aVar.b(egl11, eGLDisplay2, eGLConfig, 12322, 0);
                    int iB6 = aVar.b(egl11, eGLDisplay2, eGLConfig, 12321, 0);
                    if (iB3 == aVar.f89770a && iB4 == aVar.f89771b && iB5 == aVar.f89772c && iB6 == aVar.f89773d) {
                        return eGLConfig;
                    }
                }
                i10++;
                this = aVar;
                egl10 = egl11;
                eGLDisplay = eGLDisplay2;
            }
            return null;
        }

        @Override // android.opengl.GLSurfaceView.EGLConfigChooser
        public EGLConfig chooseConfig(EGL10 egl10, EGLDisplay eGLDisplay) {
            int[] iArr = new int[1];
            egl10.eglChooseConfig(eGLDisplay, f89769i, null, 0, iArr);
            int i10 = iArr[0];
            if (i10 <= 0) {
                throw new IllegalArgumentException("No configs match configSpec");
            }
            EGLConfig[] eGLConfigArr = new EGLConfig[i10];
            egl10.eglChooseConfig(eGLDisplay, f89769i, eGLConfigArr, i10, iArr);
            return a(egl10, eGLDisplay, eGLConfigArr);
        }
    }

    static class b implements GLSurfaceView.EGLContextFactory {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private static int f89777a = 12440;

        b() {
        }

        @Override // android.opengl.GLSurfaceView.EGLContextFactory
        public EGLContext createContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
            c.a(egl10);
            EGLContext eGLContextEglCreateContext = egl10.eglCreateContext(eGLDisplay, eGLConfig, EGL10.EGL_NO_CONTEXT, new int[]{f89777a, 2, 12344});
            c.a(egl10);
            return eGLContextEglCreateContext;
        }

        @Override // android.opengl.GLSurfaceView.EGLContextFactory
        public void destroyContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLContext eGLContext) {
            egl10.eglDestroyContext(eGLDisplay, eGLContext);
        }
    }

    public c(Context context) {
        super(context);
        this.f89767a = new com.badlogic.gdx.backends.android.surfaceview.a();
        b(false, 16, 0);
    }

    static void a(EGL10 egl10) {
        while (egl10.eglGetError() != 12288) {
        }
    }

    private void b(boolean z10, int i10, int i11) {
        if (z10) {
            getHolder().setFormat(-3);
        }
        setEGLContextFactory(new b());
        setEGLConfigChooser(z10 ? new a(8, 8, 8, 8, i10, i11) : new a(5, 6, 5, 0, i10, i11));
    }

    @Override // android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        if (editorInfo != null) {
            editorInfo.imeOptions |= 268435456;
        }
        return new BaseInputConnection(this, false);
    }

    @Override // android.view.SurfaceView, android.view.View
    protected void onMeasure(int i10, int i11) {
        f.a aVarA = this.f89767a.a(i10, i11);
        setMeasuredDimension(aVarA.f89790a, aVarA.f89791b);
    }

    public c(Context context, boolean z10, int i10, int i11, f fVar) {
        super(context);
        this.f89767a = fVar;
        b(z10, i10, i11);
    }
}

package com.badlogic.gdx.backends.android.surfaceview;

import android.opengl.GLSurfaceView;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLDisplay;

/* JADX INFO: loaded from: classes3.dex */
public class d implements GLSurfaceView.EGLConfigChooser {

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f89778j = 4;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final String f89779k = "GdxEglConfigChooser";

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    protected int f89780a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    protected int f89781b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    protected int f89782c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    protected int f89783d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    protected int f89784e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    protected int f89785f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    protected int f89786g;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int[] f89788i = new int[1];

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    protected final int[] f89787h = {12324, 4, 12323, 4, 12322, 4, 12352, 4, 12344};

    public d(int i10, int i11, int i12, int i13, int i14, int i15, int i16) {
        this.f89780a = i10;
        this.f89781b = i11;
        this.f89782c = i12;
        this.f89783d = i13;
        this.f89784e = i14;
        this.f89785f = i15;
        this.f89786g = i16;
    }

    private int b(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i10, int i11) {
        return egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, i10, this.f89788i) ? this.f89788i[0] : i11;
    }

    private void c(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
        int[] iArr = {12320, 12321, 12322, 12323, 12324, 12325, 12326, 12327, 12328, 12329, 12330, 12331, 12332, 12333, 12334, 12335, 12336, 12337, 12338, 12339, 12340, 12343, 12342, 12341, 12345, 12346, 12347, 12348, 12349, 12350, 12351, 12352, 12354};
        int[] iArr2 = new int[1];
        for (int i10 = 0; i10 < 33; i10++) {
            if (!egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, iArr[i10], iArr2)) {
                egl10.eglGetError();
            }
        }
    }

    private void d(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr) {
        for (EGLConfig eGLConfig : eGLConfigArr) {
            c(egl10, eGLDisplay, eGLConfig);
        }
    }

    public EGLConfig a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr) {
        EGLConfig[] eGLConfigArr2 = eGLConfigArr;
        int length = eGLConfigArr2.length;
        EGLConfig eGLConfig = null;
        EGLConfig eGLConfig2 = null;
        EGLConfig eGLConfig3 = null;
        int i10 = 0;
        while (i10 < length) {
            EGLConfig eGLConfig4 = eGLConfigArr2[i10];
            int iB = b(egl10, eGLDisplay, eGLConfig4, 12325, 0);
            int iB2 = b(egl10, eGLDisplay, eGLConfig4, 12326, 0);
            if (iB >= this.f89784e && iB2 >= this.f89785f) {
                int iB3 = b(egl10, eGLDisplay, eGLConfig4, 12324, 0);
                int iB4 = b(egl10, eGLDisplay, eGLConfig4, 12323, 0);
                int iB5 = b(egl10, eGLDisplay, eGLConfig4, 12322, 0);
                int iB6 = b(egl10, eGLDisplay, eGLConfig4, 12321, 0);
                if (eGLConfig == null && iB3 == 5 && iB4 == 6 && iB5 == 5 && iB6 == 0) {
                    eGLConfig = eGLConfig4;
                }
                if (eGLConfig2 == null && iB3 == this.f89780a && iB4 == this.f89781b && iB5 == this.f89782c && iB6 == this.f89783d) {
                    eGLConfig2 = eGLConfig4;
                    if (this.f89786g == 0) {
                        break;
                    }
                }
                int iB7 = b(egl10, eGLDisplay, eGLConfig4, 12338, 0);
                int iB8 = b(egl10, eGLDisplay, eGLConfig4, 12337, 0);
                if (eGLConfig3 == null && iB7 == 1 && iB8 >= this.f89786g && iB3 == this.f89780a && iB4 == this.f89781b && iB5 == this.f89782c && iB6 == this.f89783d) {
                    eGLConfig3 = eGLConfig4;
                }
            }
            i10++;
            eGLConfigArr2 = eGLConfigArr;
        }
        if (eGLConfig3 != null) {
            return eGLConfig3;
        }
        return eGLConfig2 != null ? eGLConfig2 : eGLConfig;
    }

    @Override // android.opengl.GLSurfaceView.EGLConfigChooser
    public EGLConfig chooseConfig(EGL10 egl10, EGLDisplay eGLDisplay) {
        int[] iArr = new int[1];
        egl10.eglChooseConfig(eGLDisplay, this.f89787h, null, 0, iArr);
        int i10 = iArr[0];
        if (i10 <= 0) {
            throw new IllegalArgumentException("No configs match configSpec");
        }
        EGLConfig[] eGLConfigArr = new EGLConfig[i10];
        egl10.eglChooseConfig(eGLDisplay, this.f89787h, eGLConfigArr, i10, iArr);
        return a(egl10, eGLDisplay, eGLConfigArr);
    }
}

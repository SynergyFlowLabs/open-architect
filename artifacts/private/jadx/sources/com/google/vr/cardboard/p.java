package com.google.vr.cardboard;

import android.opengl.GLSurfaceView;
import android.os.Build;
import androidx.fragment.app.t0;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLDisplay;

/* JADX INFO: loaded from: classes5.dex */
public class p implements GLSurfaceView.EGLConfigChooser {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final boolean f126846b = Build.FINGERPRINT.contains("generic_x86");

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private boolean f126847a = true;

    public p() {
        int i10 = 0 << 1;
    }

    private static EGLConfig a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr, boolean z10) {
        if (f126846b) {
            return eGLConfigArr[0];
        }
        for (EGLConfig eGLConfig : eGLConfigArr) {
            int iB = b(egl10, eGLDisplay, eGLConfig, 12325, 0);
            int iB2 = b(egl10, eGLDisplay, eGLConfig, 12326, 0);
            int iB3 = b(egl10, eGLDisplay, eGLConfig, 12324, 0);
            int iB4 = b(egl10, eGLDisplay, eGLConfig, 12323, 0);
            int iB5 = b(egl10, eGLDisplay, eGLConfig, 12322, 0);
            int iB6 = b(egl10, eGLDisplay, eGLConfig, 12339, 0);
            if (iB3 == 8 && iB4 == 8 && iB5 == 8 && iB == 0 && iB2 == 0 && (!z10 || (iB6 & 4096) != 0)) {
                return eGLConfig;
            }
        }
        return null;
    }

    private static int b(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i10, int i11) {
        int[] iArr = new int[1];
        return egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, i10, iArr) ? iArr[0] : i11;
    }

    @Override // android.opengl.GLSurfaceView.EGLConfigChooser
    public EGLConfig chooseConfig(EGL10 egl10, EGLDisplay eGLDisplay) {
        int[] iArr = {12324, 8, 12323, 8, 12322, 8, 12321, 0, 12325, 0, 12326, 0, 12352, 64, 12339, t0.L, 12344};
        int[] iArr2 = new int[1];
        int i10 = 2 | 0;
        if (!egl10.eglChooseConfig(eGLDisplay, iArr, null, 0, iArr2) && this.f126847a && !f126846b) {
            throw new IllegalArgumentException("eglChooseConfig failed");
        }
        iArr[15] = 4;
        if (!egl10.eglChooseConfig(eGLDisplay, iArr, null, 0, iArr2)) {
            throw new IllegalArgumentException("eglChooseConfig failed");
        }
        int i11 = iArr2[0];
        if (i11 <= 0) {
            throw new IllegalArgumentException("No configs match configSpec");
        }
        EGLConfig[] eGLConfigArr = new EGLConfig[i11];
        if (!egl10.eglChooseConfig(eGLDisplay, iArr, eGLConfigArr, i11, iArr2)) {
            throw new IllegalArgumentException("eglChooseConfig#2 failed");
        }
        EGLConfig eGLConfigA = a(egl10, eGLDisplay, eGLConfigArr, this.f126847a);
        if (eGLConfigA != null) {
            return eGLConfigA;
        }
        throw new IllegalArgumentException("No config chosen");
    }
}

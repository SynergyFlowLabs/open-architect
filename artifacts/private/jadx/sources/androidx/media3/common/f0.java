package androidx.media3.common;

import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;

/* JADX INFO: loaded from: classes3.dex */
@androidx.media3.common.util.b1
public interface f0 {
    EGLSurface a(EGLDisplay eGLDisplay, Object obj, int i10, boolean z10) throws androidx.media3.common.util.t.a;

    g0 b(int i10, int i11, int i12) throws androidx.media3.common.util.t.a;

    EGLSurface c(EGLContext eGLContext, EGLDisplay eGLDisplay) throws androidx.media3.common.util.t.a;

    EGLContext d(EGLDisplay eGLDisplay, @androidx.annotation.g0(from = 2, to = 3) int i10, int[] iArr) throws androidx.media3.common.util.t.a;

    void e(EGLDisplay eGLDisplay) throws androidx.media3.common.util.t.a;
}

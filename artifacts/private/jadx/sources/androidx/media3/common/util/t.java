package androidx.media3.common.util;

import android.content.Context;
import android.graphics.Bitmap;
import android.opengl.EGL14;
import android.opengl.EGLConfig;
import android.opengl.EGLContext;
import android.opengl.EGLDisplay;
import android.opengl.EGLSurface;
import android.opengl.GLES20;
import android.opengl.GLES30;
import android.opengl.GLU;
import android.opengl.GLUtils;
import android.opengl.Matrix;
import android.os.Build;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.util.Arrays;
import java.util.List;
import java.util.Objects;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class t {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    public static final int f61646a = 4;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f61647b = 2.0f;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final long f61650e = 0;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final String f61651f = "EGL_EXT_protected_content";

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final String f61652g = "EGL_KHR_surfaceless_context";

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final String f61653h = "GL_EXT_YUV_target";

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final String f61654i = "EGL_EXT_gl_colorspace_bt2020_pq";

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final String f61655j = "EGL_EXT_gl_colorspace_bt2020_hlg";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    public static final int[] f61648c = {12352, 4, 12324, 8, 12323, 8, 12322, 8, 12321, 8, 12325, 0, 12326, 0, 12344};

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public static final int[] f61649d = {12352, 4, 12324, 10, 12323, 10, 12322, 10, 12321, 2, 12325, 0, 12326, 0, 12344};

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f61656k = 12445;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f61657l = 13120;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private static final int[] f61658m = {f61656k, f61657l, 12344, 12344};

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final int f61659n = 13632;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final int[] f61660o = {f61656k, f61659n, 12344, 12344};

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    private static final int[] f61661p = {12344};

    public static final class a extends Exception {
        public a(String str) {
            super(str);
        }
    }

    private t() {
    }

    public static void A(int i10) throws a {
        GLES20.glDeleteFramebuffers(1, new int[]{i10}, 0);
        f();
    }

    public static void B(int i10) throws a {
        boolean z10 = false | true;
        GLES20.glDeleteRenderbuffers(1, new int[]{i10}, 0);
        f();
    }

    public static void C(long j10) throws a {
        D(j10);
        f();
    }

    public static void D(long j10) {
        GLES30.glDeleteSync(j10);
    }

    public static void E(int i10) throws a {
        GLES20.glDeleteTextures(1, new int[]{i10}, 0);
        f();
    }

    public static void F(@androidx.annotation.p0 EGLDisplay eGLDisplay, @androidx.annotation.p0 EGLContext eGLContext) throws a {
        if (eGLDisplay == null || eGLDisplay.equals(EGL14.EGL_NO_DISPLAY)) {
            return;
        }
        EGLSurface eGLSurface = EGL14.EGL_NO_SURFACE;
        EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, EGL14.EGL_NO_CONTEXT);
        e("Error releasing context");
        if (eGLContext != null && !eGLContext.equals(EGL14.EGL_NO_CONTEXT)) {
            EGL14.eglDestroyContext(eGLDisplay, eGLContext);
            e("Error destroying context");
        }
        EGL14.eglReleaseThread();
        e("Error releasing thread");
        EGL14.eglTerminate(eGLDisplay);
        e("Error terminating display");
    }

    public static void G(@androidx.annotation.p0 EGLDisplay eGLDisplay, @androidx.annotation.p0 EGLSurface eGLSurface) throws a {
        if (eGLDisplay != null && !eGLDisplay.equals(EGL14.EGL_NO_DISPLAY) && eGLSurface != null && !eGLSurface.equals(EGL14.EGL_NO_SURFACE)) {
            EGL14.eglDestroySurface(eGLDisplay, eGLSurface);
            e("Error destroying surface");
        }
    }

    public static void H(EGLDisplay eGLDisplay, EGLContext eGLContext, EGLSurface eGLSurface, int i10, int i11) throws a {
        K(eGLDisplay, eGLContext, eGLSurface, 0, i10, i11);
    }

    public static void I(EGLDisplay eGLDisplay, EGLContext eGLContext, EGLSurface eGLSurface, int i10, int i11, int i12) throws a {
        K(eGLDisplay, eGLContext, eGLSurface, i10, i11, i12);
    }

    public static void J(int i10, int i11, int i12) throws a {
        int[] iArr = new int[1];
        GLES20.glGetIntegerv(36006, iArr, 0);
        if (iArr[0] != i10) {
            GLES20.glBindFramebuffer(36160, i10);
        }
        f();
        GLES20.glViewport(0, 0, i11, i12);
        f();
    }

    private static void K(EGLDisplay eGLDisplay, EGLContext eGLContext, EGLSurface eGLSurface, int i10, int i11, int i12) throws a {
        EGL14.eglMakeCurrent(eGLDisplay, eGLSurface, eGLSurface, eGLContext);
        e("Error making context current");
        J(i10, i11, i12);
    }

    public static int L() throws a {
        int[] iArr = new int[1];
        GLES20.glGenTextures(1, iArr, 0);
        f();
        return iArr[0];
    }

    public static long M() throws a {
        int[] iArr = new int[1];
        EGL14.eglQueryContext(EGL14.eglGetDisplay(0), EGL14.eglGetCurrentContext(), 12440, iArr, 0);
        f();
        return iArr[0];
    }

    public static EGLContext N() {
        return EGL14.eglGetCurrentContext();
    }

    public static EGLDisplay O() throws a {
        EGLDisplay eGLDisplayEglGetDisplay = EGL14.eglGetDisplay(0);
        g(!eGLDisplayEglGetDisplay.equals(EGL14.EGL_NO_DISPLAY), "No EGL display.");
        g(EGL14.eglInitialize(eGLDisplayEglGetDisplay, new int[1], 0, new int[1], 0), "Error in eglInitialize.");
        f();
        return eGLDisplayEglGetDisplay;
    }

    private static EGLConfig P(EGLDisplay eGLDisplay, int[] iArr) throws a {
        EGLConfig[] eGLConfigArr = new EGLConfig[1];
        if (EGL14.eglChooseConfig(eGLDisplay, iArr, 0, eGLConfigArr, 0, 1, new int[1], 0)) {
            return eGLConfigArr[0];
        }
        throw new a("eglChooseConfig failed.");
    }

    public static float[] Q() {
        return new float[]{-1.0f, -1.0f, 0.0f, 1.0f, 1.0f, -1.0f, 0.0f, 1.0f, -1.0f, 1.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f};
    }

    public static float[] R() {
        return new float[]{0.0f, 0.0f, 0.0f, 1.0f, 1.0f, 0.0f, 0.0f, 1.0f, 0.0f, 1.0f, 0.0f, 1.0f, 1.0f, 1.0f, 0.0f, 1.0f};
    }

    public static boolean S() {
        return U(f61655j);
    }

    public static boolean T() {
        return k1.f61540a >= 33 && U(f61654i);
    }

    private static boolean U(String str) {
        String strEglQueryString = EGL14.eglQueryString(EGL14.eglGetDisplay(0), 12373);
        return strEglQueryString != null && strEglQueryString.contains(str);
    }

    public static boolean V(Context context) {
        int i10 = k1.f61540a;
        if (i10 < 24) {
            return false;
        }
        if (i10 < 26 && ("samsung".equals(Build.MANUFACTURER) || "XT1650".equals(Build.MODEL))) {
            return false;
        }
        if (i10 >= 26 || context.getPackageManager().hasSystemFeature("android.hardware.vr.high_performance")) {
            return U(f61651f);
        }
        return false;
    }

    public static boolean W() {
        return U(f61652g);
    }

    public static boolean X() {
        String strGlGetString;
        if (Objects.equals(EGL14.eglGetCurrentContext(), EGL14.EGL_NO_CONTEXT)) {
            try {
                EGLDisplay eGLDisplayO = O();
                EGLContext eGLContextM = m(eGLDisplayO);
                q(eGLContextM, eGLDisplayO);
                strGlGetString = GLES20.glGetString(7939);
                F(eGLDisplayO, eGLContextM);
            } catch (a unused) {
                return false;
            }
        } else {
            strGlGetString = GLES20.glGetString(7939);
        }
        return strGlGetString != null && strGlGetString.contains(f61653h);
    }

    @androidx.annotation.w0(24)
    public static ByteBuffer Y(int i10, int i11) throws a {
        GLES20.glBindBuffer(35051, i10);
        f();
        ByteBuffer byteBuffer = (ByteBuffer) GLES30.glMapBufferRange(35051, 0, i11, 1);
        f();
        GLES20.glBindBuffer(35051, 0);
        f();
        return byteBuffer;
    }

    @androidx.annotation.w0(24)
    public static void Z(int i10, int i11, int i12, int i13) throws a {
        J(i10, i11, i12);
        GLES20.glBindBuffer(35051, i13);
        f();
        GLES30.glReadBuffer(36064);
        int i14 = 0 >> 0;
        GLES30.glReadPixels(0, 0, i11, i12, 6408, 5121, 0);
        f();
        GLES20.glBindBuffer(35051, 0);
        f();
    }

    private static void a(int i10, int i11) throws a {
        int[] iArr = new int[1];
        GLES20.glGetIntegerv(3379, iArr, 0);
        int i12 = iArr[0];
        androidx.media3.common.util.a.j(i12 > 0, "Create a OpenGL context first or run the GL methods on an OpenGL thread.");
        if (i10 < 0 || i11 < 0) {
            throw new a("width or height is less than 0");
        }
        if (i10 > i12 || i11 > i12) {
            throw new a("width or height is greater than GL_MAX_TEXTURE_SIZE " + i12);
        }
    }

    public static void a0(int i10, Bitmap bitmap) throws a {
        a(bitmap.getWidth(), bitmap.getHeight());
        c(3553, i10, androidx.media3.common.j.I3);
        GLUtils.texImage2D(3553, 0, bitmap, 0);
        f();
    }

    public static void b(long j10) throws a {
        if (j10 == 0) {
            GLES20.glFinish();
        } else {
            GLES30.glWaitSync(j10, 0, -1L);
            f();
        }
    }

    public static void b0(float[] fArr) {
        Matrix.setIdentityM(fArr, 0);
    }

    public static void c(int i10, int i11, int i12) throws a {
        GLES20.glBindTexture(i10, i11);
        f();
        GLES20.glTexParameteri(i10, androidx.work.h.f76563d, i12);
        f();
        GLES20.glTexParameteri(i10, 10241, i12);
        f();
        GLES20.glTexParameteri(i10, 10242, 33071);
        f();
        GLES20.glTexParameteri(i10, 10243, 33071);
        f();
    }

    @androidx.annotation.w0(24)
    public static void c0(int i10) throws a {
        GLES20.glBindBuffer(35051, i10);
        f();
        GLES30.glUnmapBuffer(35051);
        f();
        GLES20.glBindBuffer(35051, 0);
        f();
    }

    public static void d(int i10, s sVar, int i11, s sVar2) throws a {
        int[] iArr = new int[1];
        GLES20.glGetIntegerv(36006, iArr, 0);
        f();
        GLES20.glBindFramebuffer(36008, i10);
        f();
        GLES20.glBindFramebuffer(36009, i11);
        f();
        GLES30.glBlitFramebuffer(sVar.f61642a, sVar.f61643b, sVar.f61644c, sVar.f61645d, sVar2.f61642a, sVar2.f61643b, sVar2.f61644c, sVar2.f61645d, 16384, androidx.media3.common.j.I3);
        f();
        GLES20.glBindFramebuffer(36160, iArr[0]);
        f();
    }

    private static void e(String str) throws a {
        int iEglGetError = EGL14.eglGetError();
        if (iEglGetError == 12288) {
            return;
        }
        throw new a(str + ", error code: 0x" + Integer.toHexString(iEglGetError));
    }

    public static void f() throws a {
        StringBuilder sb2 = new StringBuilder();
        boolean z10 = false;
        while (true) {
            int iGlGetError = GLES20.glGetError();
            if (iGlGetError == 0) {
                break;
            }
            if (z10) {
                sb2.append('\n');
            }
            String strGluErrorString = GLU.gluErrorString(iGlGetError);
            if (strGluErrorString == null) {
                strGluErrorString = "error code: 0x" + Integer.toHexString(iGlGetError);
            }
            sb2.append("glError: ");
            sb2.append(strGluErrorString);
            z10 = true;
        }
        if (z10) {
            throw new a(sb2.toString());
        }
    }

    public static void g(boolean z10, String str) throws a {
        if (!z10) {
            throw new a(str);
        }
    }

    public static void h() throws a {
        GLES20.glClearColor(0.0f, 0.0f, 0.0f, 0.0f);
        GLES20.glClearDepthf(1.0f);
        GLES20.glClear(16640);
        f();
    }

    public static float[] i() {
        float[] fArr = new float[16];
        b0(fArr);
        return fArr;
    }

    private static FloatBuffer j(int i10) {
        return ByteBuffer.allocateDirect(i10 * 4).order(ByteOrder.nativeOrder()).asFloatBuffer();
    }

    public static FloatBuffer k(float[] fArr) {
        return (FloatBuffer) j(fArr.length).put(fArr).flip();
    }

    public static EGLContext l(EGLContext eGLContext, EGLDisplay eGLDisplay, @androidx.annotation.g0(from = 2, to = 3) int i10, int[] iArr) throws a {
        boolean z10 = true;
        androidx.media3.common.util.a.a(Arrays.equals(iArr, f61648c) || Arrays.equals(iArr, f61649d));
        if (i10 != 2 && i10 != 3) {
            z10 = false;
        }
        androidx.media3.common.util.a.a(z10);
        EGLContext eGLContextEglCreateContext = EGL14.eglCreateContext(eGLDisplay, P(eGLDisplay, iArr), eGLContext, new int[]{12440, i10, 12344}, 0);
        if (eGLContextEglCreateContext != null && !eGLContextEglCreateContext.equals(EGL14.EGL_NO_CONTEXT)) {
            f();
            return eGLContextEglCreateContext;
        }
        EGL14.eglTerminate(eGLDisplay);
        throw new a("eglCreateContext() failed to create a valid context. The device may not support EGL version " + i10);
    }

    public static EGLContext m(EGLDisplay eGLDisplay) throws a {
        return l(EGL14.EGL_NO_CONTEXT, eGLDisplay, 2, f61648c);
    }

    public static EGLSurface n(EGLDisplay eGLDisplay, Object obj, int i10, boolean z10) throws a {
        int[] iArr;
        int[] iArr2;
        if (i10 == 3 || i10 == 10) {
            iArr = f61648c;
            iArr2 = f61661p;
        } else {
            if (i10 != 7 && i10 != 6) {
                throw new IllegalArgumentException("Unsupported color transfer: " + i10);
            }
            iArr = f61649d;
            if (z10) {
                iArr2 = f61661p;
            } else if (i10 == 6) {
                if (!T()) {
                    throw new a("BT.2020 PQ OpenGL output isn't supported.");
                }
                iArr2 = f61658m;
            } else {
                if (!S()) {
                    throw new a("BT.2020 HLG OpenGL output isn't supported.");
                }
                iArr2 = f61660o;
            }
        }
        EGLSurface eGLSurfaceEglCreateWindowSurface = EGL14.eglCreateWindowSurface(eGLDisplay, P(eGLDisplay, iArr), obj, iArr2, 0);
        e("Error creating a new EGL surface");
        return eGLSurfaceEglCreateWindowSurface;
    }

    public static int o() throws a {
        int iL = L();
        c(36197, iL, androidx.media3.common.j.I3);
        return iL;
    }

    public static int p(int i10) throws a {
        int[] iArr = new int[1];
        GLES20.glGenFramebuffers(1, iArr, 0);
        f();
        GLES20.glBindFramebuffer(36160, iArr[0]);
        f();
        GLES20.glFramebufferTexture2D(36160, 36064, 3553, i10, 0);
        f();
        return iArr[0];
    }

    public static EGLSurface q(EGLContext eGLContext, EGLDisplay eGLDisplay) throws a {
        EGLSurface eGLSurfaceS = W() ? EGL14.EGL_NO_SURFACE : s(eGLDisplay, 1, 1, f61648c);
        H(eGLDisplay, eGLContext, eGLSurfaceS, 1, 1);
        return eGLSurfaceS;
    }

    public static long r() throws a {
        if (M() < 3) {
            return 0L;
        }
        long jGlFenceSync = GLES30.glFenceSync(37143, 0);
        f();
        GLES20.glFlush();
        f();
        return jGlFenceSync;
    }

    private static EGLSurface s(EGLDisplay eGLDisplay, int i10, int i11, int[] iArr) throws a {
        EGLSurface eGLSurfaceEglCreatePbufferSurface = EGL14.eglCreatePbufferSurface(eGLDisplay, P(eGLDisplay, iArr), new int[]{12375, i10, 12374, i11, 12344}, 0);
        e("Error creating a new EGL Pbuffer surface");
        return eGLSurfaceEglCreatePbufferSurface;
    }

    public static int t(int i10) throws a {
        int[] iArr = new int[1];
        GLES20.glGenBuffers(1, iArr, 0);
        f();
        GLES20.glBindBuffer(35051, iArr[0]);
        f();
        GLES20.glBufferData(35051, i10, null, 35049);
        f();
        GLES20.glBindBuffer(35051, 0);
        f();
        return iArr[0];
    }

    public static int u(int i10, int i11) throws a {
        return x(i10, i11, 32857, 33640);
    }

    public static int v(int i10, int i11, boolean z10) throws a {
        return z10 ? x(i10, i11, 34842, 5131) : x(i10, i11, 6408, 5121);
    }

    public static int w(Bitmap bitmap) throws a {
        int iL = L();
        a0(iL, bitmap);
        return iL;
    }

    private static int x(int i10, int i11, int i12, int i13) throws a {
        a(i10, i11);
        int iL = L();
        c(3553, iL, androidx.media3.common.j.I3);
        GLES20.glTexImage2D(3553, 0, i12, i10, i11, 0, 6408, i13, null);
        f();
        return iL;
    }

    public static float[] y(List<float[]> list) {
        float[] fArr = new float[list.size() * 4];
        for (int i10 = 0; i10 < list.size(); i10++) {
            System.arraycopy(list.get(i10), 0, fArr, i10 * 4, 4);
        }
        return fArr;
    }

    public static void z(int i10) throws a {
        GLES20.glDeleteBuffers(1, new int[]{i10}, 0);
        f();
    }
}

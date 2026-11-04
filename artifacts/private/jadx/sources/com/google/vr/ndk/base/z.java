package com.google.vr.ndk.base;

import android.content.Context;
import android.opengl.EGL14;
import android.opengl.GLDebugHelper;
import android.opengl.GLSurfaceView;
import android.util.AttributeSet;
import android.view.SurfaceHolder;
import android.view.SurfaceView;
import com.google.vr.cardboard.EglReadyListener;
import java.io.Writer;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import javax.microedition.khronos.egl.EGL10;
import javax.microedition.khronos.egl.EGLConfig;
import javax.microedition.khronos.egl.EGLContext;
import javax.microedition.khronos.egl.EGLDisplay;
import javax.microedition.khronos.egl.EGLSurface;
import javax.microedition.khronos.opengles.GL;
import javax.microedition.khronos.opengles.GL10;

/* JADX INFO: loaded from: classes5.dex */
public class z extends SurfaceView implements SurfaceHolder.Callback2 {
    private static final int H1 = 8;

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    public static final int f127345g3 = 1;

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    public static final int f127346h3 = 0;

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    public static final int f127347i3 = 1;

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    public static final int f127348j3 = 2;

    /* JADX INFO: renamed from: k3, reason: collision with root package name */
    public static final int f127349k3 = 1;

    /* JADX INFO: renamed from: l3, reason: collision with root package name */
    public static final int f127350l3 = 2;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private static final String f127351n = "GvrSurfaceView";

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private static final boolean f127352o = false;

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    private static final boolean f127353p0 = false;

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    private static final boolean f127354p1 = false;

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    public static final int f127355p2 = 0;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final boolean f127356s = false;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final boolean f127357t = false;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final boolean f127358v = false;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final boolean f127359w = false;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final WeakReference<z> f127360a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private g f127361b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private GLSurfaceView.Renderer f127362c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private boolean f127363d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private GLSurfaceView.EGLConfigChooser f127364e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private GLSurfaceView.EGLContextFactory f127365f;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private GLSurfaceView.EGLWindowSurfaceFactory f127366g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private h f127367h;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private int f127368i;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private int f127369j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private boolean f127370k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private boolean f127371l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private EglReadyListener f127372m;

    abstract class b implements GLSurfaceView.EGLConfigChooser {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        protected int[] f127373a;

        public b(int[] iArr) {
            this.f127373a = b(iArr);
        }

        private int[] b(int[] iArr) {
            if (z.this.f127369j != 2 && z.this.f127369j != 3) {
                return iArr;
            }
            int length = iArr.length;
            int[] iArr2 = new int[length + 2];
            int i10 = length - 1;
            System.arraycopy(iArr, 0, iArr2, 0, i10);
            iArr2[i10] = 12352;
            if (z.this.f127369j == 2) {
                iArr2[length] = 4;
            } else {
                iArr2[length] = 64;
            }
            iArr2[length + 1] = 12344;
            return iArr2;
        }

        abstract EGLConfig a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr);

        @Override // android.opengl.GLSurfaceView.EGLConfigChooser
        public EGLConfig chooseConfig(EGL10 egl10, EGLDisplay eGLDisplay) {
            int i10 = 1;
            int[] iArr = new int[1];
            if (egl10.eglChooseConfig(eGLDisplay, this.f127373a, null, 0, iArr)) {
                int i11 = iArr[0];
                if (i11 <= 0) {
                    throw new IllegalArgumentException("No configs match configSpec");
                }
                EGLConfig[] eGLConfigArr = new EGLConfig[i11];
                if (!egl10.eglChooseConfig(eGLDisplay, this.f127373a, eGLConfigArr, i11, iArr)) {
                    throw new IllegalArgumentException("eglChooseConfig#2 failed");
                }
                EGLConfig eGLConfigA = a(egl10, eGLDisplay, eGLConfigArr);
                if (eGLConfigA != null) {
                    return eGLConfigA;
                }
                throw new IllegalArgumentException("No config chosen");
            }
            while (true) {
                int[] iArr2 = this.f127373a;
                if (i10 >= iArr2.length) {
                    throw new IllegalArgumentException("eglChooseConfig failed");
                }
                if (iArr2[i10 - 1] == 12352 && iArr2[i10] == 64) {
                    iArr2[i10] = 4;
                    return chooseConfig(egl10, eGLDisplay);
                }
                i10++;
            }
        }
    }

    class c extends b {

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private int[] f127375c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        protected int f127376d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        protected int f127377e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        protected int f127378f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        protected int f127379g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        protected int f127380h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        protected int f127381i;

        public c(z zVar, int i10, int i11, int i12, int i13, int i14, int i15) {
            super(new int[]{12324, i10, 12323, i11, 12322, i12, 12321, i13, 12325, i14, 12326, i15, 12344});
            this.f127375c = new int[1];
            this.f127376d = i10;
            this.f127377e = i11;
            this.f127378f = i12;
            this.f127379g = i13;
            this.f127380h = i14;
            this.f127381i = i15;
        }

        private int c(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, int i10, int i11) {
            return egl10.eglGetConfigAttrib(eGLDisplay, eGLConfig, i10, this.f127375c) ? this.f127375c[0] : i11;
        }

        @Override // com.google.vr.ndk.base.z.b
        public EGLConfig a(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig[] eGLConfigArr) {
            int length = eGLConfigArr.length;
            int i10 = 0;
            while (i10 < length) {
                EGLConfig eGLConfig = eGLConfigArr[i10];
                c cVar = this;
                EGL10 egl11 = egl10;
                EGLDisplay eGLDisplay2 = eGLDisplay;
                int iC = cVar.c(egl11, eGLDisplay2, eGLConfig, 12325, 0);
                int iC2 = cVar.c(egl11, eGLDisplay2, eGLConfig, 12326, 0);
                if (iC >= cVar.f127380h && iC2 >= cVar.f127381i) {
                    int iC3 = cVar.c(egl11, eGLDisplay2, eGLConfig, 12324, 0);
                    int iC4 = cVar.c(egl11, eGLDisplay2, eGLConfig, 12323, 0);
                    int iC5 = cVar.c(egl11, eGLDisplay2, eGLConfig, 12322, 0);
                    int iC6 = cVar.c(egl11, eGLDisplay2, eGLConfig, 12321, 0);
                    if (iC3 == cVar.f127376d && iC4 == cVar.f127377e && iC5 == cVar.f127378f && iC6 == cVar.f127379g) {
                        return eGLConfig;
                    }
                }
                i10++;
                this = cVar;
                egl10 = egl11;
                eGLDisplay = eGLDisplay2;
            }
            return null;
        }
    }

    class d implements GLSurfaceView.EGLContextFactory {

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private static final int f127382b = 12440;

        private d() {
        }

        @Override // android.opengl.GLSurfaceView.EGLContextFactory
        public EGLContext createContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig) {
            int i10 = 0 >> 0;
            int[] iArr = {f127382b, z.this.f127369j, 12344};
            if (z.this.f127369j == 0) {
                iArr = null;
            }
            return egl10.eglCreateContext(eGLDisplay, eGLConfig, EGL10.EGL_NO_CONTEXT, iArr);
        }

        @Override // android.opengl.GLSurfaceView.EGLContextFactory
        public void destroyContext(EGL10 egl10, EGLDisplay eGLDisplay, EGLContext eGLContext) {
            if (egl10.eglDestroyContext(eGLDisplay, eGLContext)) {
                return;
            }
            new StringBuilder(String.valueOf(eGLDisplay).length() + 18 + String.valueOf(eGLContext).length());
            f.q("eglDestroyContext", egl10.eglGetError());
        }
    }

    static class e implements GLSurfaceView.EGLWindowSurfaceFactory {
        private e() {
        }

        @Override // android.opengl.GLSurfaceView.EGLWindowSurfaceFactory
        public EGLSurface createWindowSurface(EGL10 egl10, EGLDisplay eGLDisplay, EGLConfig eGLConfig, Object obj) {
            try {
                return egl10.eglCreateWindowSurface(eGLDisplay, eGLConfig, obj, null);
            } catch (IllegalArgumentException unused) {
                return null;
            }
        }

        @Override // android.opengl.GLSurfaceView.EGLWindowSurfaceFactory
        public void destroySurface(EGL10 egl10, EGLDisplay eGLDisplay, EGLSurface eGLSurface) {
            egl10.eglDestroySurface(eGLDisplay, eGLSurface);
        }
    }

    static class f {

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        public static final int f127384i = 12620;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private WeakReference<z> f127385a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        EGL10 f127386b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        EGLDisplay f127387c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        EGLSurface f127388d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        EGLConfig f127389e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        EGLContext f127390f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        EGLContext f127391g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        EGLDisplay f127392h;

        public f(WeakReference<z> weakReference) {
            this.f127385a = weakReference;
        }

        private void b() {
            EGLContext eGLContextCreateContext;
            EGLDisplay eGLDisplayEglGetDisplay = this.f127386b.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            this.f127392h = eGLDisplayEglGetDisplay;
            if (eGLDisplayEglGetDisplay == EGL10.EGL_NO_DISPLAY) {
                throw new RuntimeException("eglGetDisplay failed");
            }
            if (!this.f127386b.eglInitialize(eGLDisplayEglGetDisplay, new int[2])) {
                throw new RuntimeException("eglInitialize failed");
            }
            z zVar = this.f127385a.get();
            EGLContext eGLContext = EGL10.EGL_NO_CONTEXT;
            EGLContext eGLContext2 = null;
            if (zVar == null) {
                this.f127389e = null;
                eGLContextCreateContext = null;
            } else {
                if (zVar.f127372m != null) {
                    EGLContext eGLContextB = zVar.f127372m.b();
                    if (eGLContextB == null || eGLContextB == eGLContext) {
                        p("Unable to obtain application's OpenGL context.");
                    } else {
                        com.google.vr.cardboard.h hVar = (com.google.vr.cardboard.h) zVar.f127365f;
                        int iC = zVar.f127372m.c();
                        hVar.c(eGLContextB);
                        hVar.b((iC & 8) == 0);
                        hVar.a(zVar.f127372m.d());
                    }
                }
                this.f127389e = zVar.f127364e.chooseConfig(this.f127386b, this.f127392h);
                eGLContextCreateContext = zVar.f127365f.createContext(this.f127386b, this.f127392h, this.f127389e);
            }
            if (eGLContextCreateContext == null || eGLContextCreateContext == eGLContext) {
                int iEglGetError = this.f127386b.eglGetError();
                if (iEglGetError == 12294) {
                    this.f127391g = null;
                    this.f127392h = null;
                    this.f127389e = null;
                    if (zVar.f127372m != null) {
                        zVar.f127372m.a();
                    }
                    return;
                }
                q("createPendingEglContext", iEglGetError);
            } else {
                eGLContext2 = eGLContextCreateContext;
            }
            this.f127391g = eGLContext2;
        }

        private void e() {
            EGLSurface eGLSurface;
            EGLSurface eGLSurface2 = this.f127388d;
            if (eGLSurface2 == null || eGLSurface2 == (eGLSurface = EGL10.EGL_NO_SURFACE)) {
                return;
            }
            this.f127386b.eglMakeCurrent(this.f127387c, eGLSurface, eGLSurface, EGL10.EGL_NO_CONTEXT);
            z zVar = this.f127385a.get();
            if (zVar != null) {
                zVar.f127366g.destroySurface(this.f127386b, this.f127387c, this.f127388d);
            }
            this.f127388d = null;
        }

        public static String g(String str, int i10) {
            String strH = h(i10);
            StringBuilder sb2 = new StringBuilder(String.valueOf(str).length() + 9 + String.valueOf(strH).length());
            sb2.append(str);
            sb2.append(" failed: ");
            sb2.append(strH);
            return sb2.toString();
        }

        private static String h(int i10) {
            switch (i10) {
                case 12288:
                    return "EGL_SUCCESS";
                case 12289:
                    return "EGL_NOT_INITIALIZED";
                case 12290:
                    return "EGL_BAD_ACCESS";
                case 12291:
                    return "EGL_BAD_ALLOC";
                case 12292:
                    return "EGL_BAD_ATTRIBUTE";
                case 12293:
                    return "EGL_BAD_CONFIG";
                case 12294:
                    return "EGL_BAD_CONTEXT";
                case 12295:
                    return "EGL_BAD_CURRENT_SURFACE";
                case 12296:
                    return "EGL_BAD_DISPLAY";
                case 12297:
                    return "EGL_BAD_MATCH";
                case 12298:
                    return "EGL_BAD_NATIVE_PIXMAP";
                case 12299:
                    return "EGL_BAD_NATIVE_WINDOW";
                case 12300:
                    return "EGL_BAD_PARAMETER";
                case 12301:
                    return "EGL_BAD_SURFACE";
                case 12302:
                    return "EGL_CONTEXT_LOST";
                default:
                    return i(i10);
            }
        }

        private static String i(int i10) {
            String strValueOf = String.valueOf(Integer.toHexString(i10));
            return strValueOf.length() != 0 ? "0x".concat(strValueOf) : new String("0x");
        }

        private void j() {
            EGL10 egl10 = (EGL10) EGLContext.getEGL();
            this.f127386b = egl10;
            EGLDisplay eGLDisplayEglGetDisplay = egl10.eglGetDisplay(EGL10.EGL_DEFAULT_DISPLAY);
            this.f127387c = eGLDisplayEglGetDisplay;
            if (eGLDisplayEglGetDisplay == EGL10.EGL_NO_DISPLAY) {
                throw new RuntimeException("eglGetDisplay failed");
            }
            if (!this.f127386b.eglInitialize(eGLDisplayEglGetDisplay, new int[2])) {
                throw new RuntimeException("eglInitialize failed");
            }
            this.f127388d = null;
        }

        public static void k(String str, String str2, int i10) {
            g(str2, i10);
        }

        private void p(String str) {
            q(str, this.f127386b.eglGetError());
        }

        public static void q(String str, int i10) {
            throw new RuntimeException(g(str, i10));
        }

        GL a() {
            GL gl2 = this.f127390f.getGL();
            z zVar = this.f127385a.get();
            if (zVar != null) {
                if (zVar.f127367h != null) {
                    gl2 = zVar.f127367h.wrap(gl2);
                }
                if ((zVar.f127368i & 3) != 0) {
                    return GLDebugHelper.wrap(gl2, (zVar.f127368i & 1) == 0 ? 0 : 1, (zVar.f127368i & 2) != 0 ? new i() : null);
                }
            }
            return gl2;
        }

        public boolean c() {
            if (this.f127386b == null) {
                throw new RuntimeException("egl not initialized");
            }
            if (this.f127387c == null) {
                throw new RuntimeException("eglDisplay not initialized");
            }
            if (this.f127389e == null) {
                throw new RuntimeException("mEglConfig not initialized");
            }
            e();
            z zVar = this.f127385a.get();
            if (zVar != null) {
                this.f127388d = zVar.f127366g.createWindowSurface(this.f127386b, this.f127387c, this.f127389e, zVar.getHolder());
            } else {
                this.f127388d = null;
            }
            EGLSurface eGLSurface = this.f127388d;
            if (eGLSurface == null || eGLSurface == EGL10.EGL_NO_SURFACE) {
                this.f127386b.eglGetError();
                return false;
            }
            if (this.f127386b.eglMakeCurrent(this.f127387c, eGLSurface, eGLSurface, this.f127390f)) {
                return true;
            }
            k("EGLHelper", "eglMakeCurrent", this.f127386b.eglGetError());
            return false;
        }

        public void d() {
            e();
        }

        public void f() {
            if (this.f127390f != null) {
                z zVar = this.f127385a.get();
                if (zVar != null) {
                    zVar.f127365f.destroyContext(this.f127386b, this.f127387c, this.f127390f);
                }
                this.f127390f = null;
            }
            EGLDisplay eGLDisplay = this.f127387c;
            if (eGLDisplay != null) {
                this.f127386b.eglTerminate(eGLDisplay);
                this.f127387c = null;
            }
        }

        public void l() {
            if (this.f127386b == null) {
                j();
            }
            EGLContext eGLContext = this.f127391g;
            if (eGLContext != null) {
                this.f127386b.eglDestroyContext(this.f127387c, eGLContext);
            }
            b();
        }

        public void m(int i10, int i11) {
            EGL14.eglSurfaceAttrib(EGL14.eglGetCurrentDisplay(), EGL14.eglGetCurrentSurface(12377), i10, i11);
        }

        public void n() {
            if (this.f127386b == null) {
                j();
            }
            EGLContext eGLContext = this.f127390f;
            if (eGLContext != null) {
                this.f127386b.eglDestroyContext(this.f127387c, eGLContext);
                this.f127390f = null;
            }
            if (this.f127391g == null) {
                b();
            }
            this.f127390f = this.f127391g;
            this.f127387c = this.f127392h;
            this.f127391g = null;
            this.f127392h = null;
        }

        public int o() {
            if (this.f127386b.eglSwapBuffers(this.f127387c, this.f127388d)) {
                return 12288;
            }
            return this.f127386b.eglGetError();
        }
    }

    static class g extends Thread implements EglReadyListener.a {
        private f Y;
        private WeakReference<z> Z;

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private boolean f127393a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private boolean f127394b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private boolean f127395c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private boolean f127396d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private boolean f127397e;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private boolean f127398f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private boolean f127399g;

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private boolean f127400h;

        /* JADX INFO: renamed from: i, reason: collision with root package name */
        private boolean f127401i;

        /* JADX INFO: renamed from: j, reason: collision with root package name */
        private boolean f127402j;

        /* JADX INFO: renamed from: k, reason: collision with root package name */
        private boolean f127403k;

        /* JADX INFO: renamed from: v, reason: collision with root package name */
        private boolean f127411v;

        /* JADX INFO: renamed from: w, reason: collision with root package name */
        private ArrayList<Runnable> f127412w = new ArrayList<>();
        private boolean X = true;

        /* JADX INFO: renamed from: p0, reason: collision with root package name */
        private final a f127408p0 = new a();

        /* JADX INFO: renamed from: l, reason: collision with root package name */
        private int f127404l = 0;

        /* JADX INFO: renamed from: m, reason: collision with root package name */
        private int f127405m = 0;

        /* JADX INFO: renamed from: s, reason: collision with root package name */
        private boolean f127409s = true;

        /* JADX INFO: renamed from: n, reason: collision with root package name */
        private int f127406n = 1;

        /* JADX INFO: renamed from: o, reason: collision with root package name */
        private int f127407o = 0;

        /* JADX INFO: renamed from: t, reason: collision with root package name */
        private boolean f127410t = false;

        static class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            private static final String f127413a = "GLThreadManager";

            private a() {
            }

            public void a(g gVar) {
                notifyAll();
            }

            public synchronized void b(g gVar) {
                try {
                    gVar.f127394b = true;
                    notifyAll();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        g(WeakReference<z> weakReference) {
            this.Z = weakReference;
            z zVar = weakReference.get();
            if (zVar != null && zVar.f127372m != null) {
                zVar.f127372m.g(this);
            }
        }

        /* JADX WARN: Code duplicated, block: B:119:0x0181 A[Catch: all -> 0x014c, TryCatch #8 {all -> 0x014c, blocks: (B:4:0x0023, B:5:0x0025, B:94:0x0147, B:98:0x0151, B:100:0x0159, B:101:0x015b, B:108:0x016a, B:109:0x016b, B:110:0x016d, B:117:0x017e, B:119:0x0181, B:121:0x018d, B:124:0x01a7, B:126:0x01ac, B:127:0x01af, B:130:0x01b3, B:133:0x01cb, B:135:0x01d0, B:136:0x01d3, B:139:0x01d7, B:144:0x01e8, B:148:0x01f5, B:150:0x01fd, B:153:0x0213, B:161:0x0223, B:165:0x0231, B:167:0x023a, B:168:0x023c, B:175:0x0249, B:155:0x0218, B:156:0x021b, B:183:0x0263, B:170:0x023e, B:171:0x0245, B:152:0x0207, B:103:0x015d, B:104:0x0164, B:6:0x0026, B:8:0x002a, B:19:0x003c, B:21:0x0046, B:92:0x0144, B:23:0x0058, B:25:0x0060, B:27:0x0069, B:29:0x006d, B:31:0x0079, B:33:0x0083, B:35:0x0087, B:37:0x008c, B:39:0x0090, B:44:0x00a2, B:42:0x009c, B:45:0x00a5, B:47:0x00a9, B:49:0x00ad, B:51:0x00b1, B:52:0x00b4, B:53:0x00bf, B:55:0x00c3, B:57:0x00c7, B:59:0x00d1, B:60:0x00dd, B:62:0x00e3, B:74:0x010a, B:76:0x010e, B:78:0x0112, B:79:0x0118, B:81:0x011c, B:83:0x0120, B:84:0x012c, B:87:0x0139, B:66:0x00eb, B:67:0x00f0, B:69:0x00f6, B:71:0x0102, B:72:0x0107, B:181:0x0259, B:123:0x0197, B:112:0x016f, B:113:0x0178, B:132:0x01bd), top: B:207:0x0023, inners: #2, #3, #4, #5, #6, #7, #10 }] */
        /* JADX WARN: Code duplicated, block: B:121:0x018d A[Catch: all -> 0x014c, TRY_LEAVE, TryCatch #8 {all -> 0x014c, blocks: (B:4:0x0023, B:5:0x0025, B:94:0x0147, B:98:0x0151, B:100:0x0159, B:101:0x015b, B:108:0x016a, B:109:0x016b, B:110:0x016d, B:117:0x017e, B:119:0x0181, B:121:0x018d, B:124:0x01a7, B:126:0x01ac, B:127:0x01af, B:130:0x01b3, B:133:0x01cb, B:135:0x01d0, B:136:0x01d3, B:139:0x01d7, B:144:0x01e8, B:148:0x01f5, B:150:0x01fd, B:153:0x0213, B:161:0x0223, B:165:0x0231, B:167:0x023a, B:168:0x023c, B:175:0x0249, B:155:0x0218, B:156:0x021b, B:183:0x0263, B:170:0x023e, B:171:0x0245, B:152:0x0207, B:103:0x015d, B:104:0x0164, B:6:0x0026, B:8:0x002a, B:19:0x003c, B:21:0x0046, B:92:0x0144, B:23:0x0058, B:25:0x0060, B:27:0x0069, B:29:0x006d, B:31:0x0079, B:33:0x0083, B:35:0x0087, B:37:0x008c, B:39:0x0090, B:44:0x00a2, B:42:0x009c, B:45:0x00a5, B:47:0x00a9, B:49:0x00ad, B:51:0x00b1, B:52:0x00b4, B:53:0x00bf, B:55:0x00c3, B:57:0x00c7, B:59:0x00d1, B:60:0x00dd, B:62:0x00e3, B:74:0x010a, B:76:0x010e, B:78:0x0112, B:79:0x0118, B:81:0x011c, B:83:0x0120, B:84:0x012c, B:87:0x0139, B:66:0x00eb, B:67:0x00f0, B:69:0x00f6, B:71:0x0102, B:72:0x0107, B:181:0x0259, B:123:0x0197, B:112:0x016f, B:113:0x0178, B:132:0x01bd), top: B:207:0x0023, inners: #2, #3, #4, #5, #6, #7, #10 }] */
        /* JADX WARN: Code duplicated, block: B:130:0x01b3 A[Catch: all -> 0x014c, TRY_LEAVE, TryCatch #8 {all -> 0x014c, blocks: (B:4:0x0023, B:5:0x0025, B:94:0x0147, B:98:0x0151, B:100:0x0159, B:101:0x015b, B:108:0x016a, B:109:0x016b, B:110:0x016d, B:117:0x017e, B:119:0x0181, B:121:0x018d, B:124:0x01a7, B:126:0x01ac, B:127:0x01af, B:130:0x01b3, B:133:0x01cb, B:135:0x01d0, B:136:0x01d3, B:139:0x01d7, B:144:0x01e8, B:148:0x01f5, B:150:0x01fd, B:153:0x0213, B:161:0x0223, B:165:0x0231, B:167:0x023a, B:168:0x023c, B:175:0x0249, B:155:0x0218, B:156:0x021b, B:183:0x0263, B:170:0x023e, B:171:0x0245, B:152:0x0207, B:103:0x015d, B:104:0x0164, B:6:0x0026, B:8:0x002a, B:19:0x003c, B:21:0x0046, B:92:0x0144, B:23:0x0058, B:25:0x0060, B:27:0x0069, B:29:0x006d, B:31:0x0079, B:33:0x0083, B:35:0x0087, B:37:0x008c, B:39:0x0090, B:44:0x00a2, B:42:0x009c, B:45:0x00a5, B:47:0x00a9, B:49:0x00ad, B:51:0x00b1, B:52:0x00b4, B:53:0x00bf, B:55:0x00c3, B:57:0x00c7, B:59:0x00d1, B:60:0x00dd, B:62:0x00e3, B:74:0x010a, B:76:0x010e, B:78:0x0112, B:79:0x0118, B:81:0x011c, B:83:0x0120, B:84:0x012c, B:87:0x0139, B:66:0x00eb, B:67:0x00f0, B:69:0x00f6, B:71:0x0102, B:72:0x0107, B:181:0x0259, B:123:0x0197, B:112:0x016f, B:113:0x0178, B:132:0x01bd), top: B:207:0x0023, inners: #2, #3, #4, #5, #6, #7, #10 }] */
        /* JADX WARN: Code duplicated, block: B:139:0x01d7 A[Catch: all -> 0x014c, TryCatch #8 {all -> 0x014c, blocks: (B:4:0x0023, B:5:0x0025, B:94:0x0147, B:98:0x0151, B:100:0x0159, B:101:0x015b, B:108:0x016a, B:109:0x016b, B:110:0x016d, B:117:0x017e, B:119:0x0181, B:121:0x018d, B:124:0x01a7, B:126:0x01ac, B:127:0x01af, B:130:0x01b3, B:133:0x01cb, B:135:0x01d0, B:136:0x01d3, B:139:0x01d7, B:144:0x01e8, B:148:0x01f5, B:150:0x01fd, B:153:0x0213, B:161:0x0223, B:165:0x0231, B:167:0x023a, B:168:0x023c, B:175:0x0249, B:155:0x0218, B:156:0x021b, B:183:0x0263, B:170:0x023e, B:171:0x0245, B:152:0x0207, B:103:0x015d, B:104:0x0164, B:6:0x0026, B:8:0x002a, B:19:0x003c, B:21:0x0046, B:92:0x0144, B:23:0x0058, B:25:0x0060, B:27:0x0069, B:29:0x006d, B:31:0x0079, B:33:0x0083, B:35:0x0087, B:37:0x008c, B:39:0x0090, B:44:0x00a2, B:42:0x009c, B:45:0x00a5, B:47:0x00a9, B:49:0x00ad, B:51:0x00b1, B:52:0x00b4, B:53:0x00bf, B:55:0x00c3, B:57:0x00c7, B:59:0x00d1, B:60:0x00dd, B:62:0x00e3, B:74:0x010a, B:76:0x010e, B:78:0x0112, B:79:0x0118, B:81:0x011c, B:83:0x0120, B:84:0x012c, B:87:0x0139, B:66:0x00eb, B:67:0x00f0, B:69:0x00f6, B:71:0x0102, B:72:0x0107, B:181:0x0259, B:123:0x0197, B:112:0x016f, B:113:0x0178, B:132:0x01bd), top: B:207:0x0023, inners: #2, #3, #4, #5, #6, #7, #10 }] */
        /* JADX WARN: Code duplicated, block: B:141:0x01dc  */
        /* JADX WARN: Code duplicated, block: B:143:0x01e5  */
        /* JADX WARN: Code duplicated, block: B:146:0x01f2  */
        /* JADX WARN: Code duplicated, block: B:147:0x01f4  */
        /* JADX WARN: Code duplicated, block: B:149:0x01fb  */
        /* JADX WARN: Code duplicated, block: B:160:0x0221  */
        /* JADX WARN: Code duplicated, block: B:161:0x0223 A[Catch: all -> 0x014c, TryCatch #8 {all -> 0x014c, blocks: (B:4:0x0023, B:5:0x0025, B:94:0x0147, B:98:0x0151, B:100:0x0159, B:101:0x015b, B:108:0x016a, B:109:0x016b, B:110:0x016d, B:117:0x017e, B:119:0x0181, B:121:0x018d, B:124:0x01a7, B:126:0x01ac, B:127:0x01af, B:130:0x01b3, B:133:0x01cb, B:135:0x01d0, B:136:0x01d3, B:139:0x01d7, B:144:0x01e8, B:148:0x01f5, B:150:0x01fd, B:153:0x0213, B:161:0x0223, B:165:0x0231, B:167:0x023a, B:168:0x023c, B:175:0x0249, B:155:0x0218, B:156:0x021b, B:183:0x0263, B:170:0x023e, B:171:0x0245, B:152:0x0207, B:103:0x015d, B:104:0x0164, B:6:0x0026, B:8:0x002a, B:19:0x003c, B:21:0x0046, B:92:0x0144, B:23:0x0058, B:25:0x0060, B:27:0x0069, B:29:0x006d, B:31:0x0079, B:33:0x0083, B:35:0x0087, B:37:0x008c, B:39:0x0090, B:44:0x00a2, B:42:0x009c, B:45:0x00a5, B:47:0x00a9, B:49:0x00ad, B:51:0x00b1, B:52:0x00b4, B:53:0x00bf, B:55:0x00c3, B:57:0x00c7, B:59:0x00d1, B:60:0x00dd, B:62:0x00e3, B:74:0x010a, B:76:0x010e, B:78:0x0112, B:79:0x0118, B:81:0x011c, B:83:0x0120, B:84:0x012c, B:87:0x0139, B:66:0x00eb, B:67:0x00f0, B:69:0x00f6, B:71:0x0102, B:72:0x0107, B:181:0x0259, B:123:0x0197, B:112:0x016f, B:113:0x0178, B:132:0x01bd), top: B:207:0x0023, inners: #2, #3, #4, #5, #6, #7, #10 }] */
        /* JADX WARN: Code duplicated, block: B:163:0x022d  */
        /* JADX WARN: Code duplicated, block: B:165:0x0231 A[Catch: all -> 0x014c, TryCatch #8 {all -> 0x014c, blocks: (B:4:0x0023, B:5:0x0025, B:94:0x0147, B:98:0x0151, B:100:0x0159, B:101:0x015b, B:108:0x016a, B:109:0x016b, B:110:0x016d, B:117:0x017e, B:119:0x0181, B:121:0x018d, B:124:0x01a7, B:126:0x01ac, B:127:0x01af, B:130:0x01b3, B:133:0x01cb, B:135:0x01d0, B:136:0x01d3, B:139:0x01d7, B:144:0x01e8, B:148:0x01f5, B:150:0x01fd, B:153:0x0213, B:161:0x0223, B:165:0x0231, B:167:0x023a, B:168:0x023c, B:175:0x0249, B:155:0x0218, B:156:0x021b, B:183:0x0263, B:170:0x023e, B:171:0x0245, B:152:0x0207, B:103:0x015d, B:104:0x0164, B:6:0x0026, B:8:0x002a, B:19:0x003c, B:21:0x0046, B:92:0x0144, B:23:0x0058, B:25:0x0060, B:27:0x0069, B:29:0x006d, B:31:0x0079, B:33:0x0083, B:35:0x0087, B:37:0x008c, B:39:0x0090, B:44:0x00a2, B:42:0x009c, B:45:0x00a5, B:47:0x00a9, B:49:0x00ad, B:51:0x00b1, B:52:0x00b4, B:53:0x00bf, B:55:0x00c3, B:57:0x00c7, B:59:0x00d1, B:60:0x00dd, B:62:0x00e3, B:74:0x010a, B:76:0x010e, B:78:0x0112, B:79:0x0118, B:81:0x011c, B:83:0x0120, B:84:0x012c, B:87:0x0139, B:66:0x00eb, B:67:0x00f0, B:69:0x00f6, B:71:0x0102, B:72:0x0107, B:181:0x0259, B:123:0x0197, B:112:0x016f, B:113:0x0178, B:132:0x01bd), top: B:207:0x0023, inners: #2, #3, #4, #5, #6, #7, #10 }] */
        /* JADX WARN: Code duplicated, block: B:167:0x023a A[Catch: all -> 0x014c, TryCatch #8 {all -> 0x014c, blocks: (B:4:0x0023, B:5:0x0025, B:94:0x0147, B:98:0x0151, B:100:0x0159, B:101:0x015b, B:108:0x016a, B:109:0x016b, B:110:0x016d, B:117:0x017e, B:119:0x0181, B:121:0x018d, B:124:0x01a7, B:126:0x01ac, B:127:0x01af, B:130:0x01b3, B:133:0x01cb, B:135:0x01d0, B:136:0x01d3, B:139:0x01d7, B:144:0x01e8, B:148:0x01f5, B:150:0x01fd, B:153:0x0213, B:161:0x0223, B:165:0x0231, B:167:0x023a, B:168:0x023c, B:175:0x0249, B:155:0x0218, B:156:0x021b, B:183:0x0263, B:170:0x023e, B:171:0x0245, B:152:0x0207, B:103:0x015d, B:104:0x0164, B:6:0x0026, B:8:0x002a, B:19:0x003c, B:21:0x0046, B:92:0x0144, B:23:0x0058, B:25:0x0060, B:27:0x0069, B:29:0x006d, B:31:0x0079, B:33:0x0083, B:35:0x0087, B:37:0x008c, B:39:0x0090, B:44:0x00a2, B:42:0x009c, B:45:0x00a5, B:47:0x00a9, B:49:0x00ad, B:51:0x00b1, B:52:0x00b4, B:53:0x00bf, B:55:0x00c3, B:57:0x00c7, B:59:0x00d1, B:60:0x00dd, B:62:0x00e3, B:74:0x010a, B:76:0x010e, B:78:0x0112, B:79:0x0118, B:81:0x011c, B:83:0x0120, B:84:0x012c, B:87:0x0139, B:66:0x00eb, B:67:0x00f0, B:69:0x00f6, B:71:0x0102, B:72:0x0107, B:181:0x0259, B:123:0x0197, B:112:0x016f, B:113:0x0178, B:132:0x01bd), top: B:207:0x0023, inners: #2, #3, #4, #5, #6, #7, #10 }] */
        /* JADX WARN: Code duplicated, block: B:169:0x023d  */
        /* JADX WARN: Code duplicated, block: B:176:0x024a  */
        /* JADX WARN: Code duplicated, block: B:180:0x0258  */
        /* JADX WARN: Code duplicated, block: B:198:0x0207 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:203:0x0197 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:208:0x0267 A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:210:0x01bd A[EXC_TOP_SPLITTER, SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:214:0x0253 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:216:0x0179 A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:221:0x011c A[SYNTHETIC] */
        /* JADX WARN: Code duplicated, block: B:83:0x0120 A[Catch: all -> 0x0039, TryCatch #5 {, blocks: (B:6:0x0026, B:8:0x002a, B:19:0x003c, B:21:0x0046, B:92:0x0144, B:23:0x0058, B:25:0x0060, B:27:0x0069, B:29:0x006d, B:31:0x0079, B:33:0x0083, B:35:0x0087, B:37:0x008c, B:39:0x0090, B:44:0x00a2, B:42:0x009c, B:45:0x00a5, B:47:0x00a9, B:49:0x00ad, B:51:0x00b1, B:52:0x00b4, B:53:0x00bf, B:55:0x00c3, B:57:0x00c7, B:59:0x00d1, B:60:0x00dd, B:62:0x00e3, B:74:0x010a, B:76:0x010e, B:78:0x0112, B:79:0x0118, B:81:0x011c, B:83:0x0120, B:84:0x012c, B:87:0x0139, B:66:0x00eb, B:67:0x00f0, B:69:0x00f6, B:71:0x0102, B:72:0x0107, B:181:0x0259), top: B:202:0x0026, outer: #8, inners: #0 }] */
        /* JADX WARN: Code duplicated, block: B:86:0x0138  */
        /* JADX WARN: Code duplicated, block: B:89:0x013d  */
        /* JADX WARN: Code duplicated, block: B:90:0x013f  */
        private void f() throws InterruptedException {
            boolean z10;
            int i10;
            z zVar;
            int iO;
            boolean z11;
            int i11;
            int i12;
            z zVar2;
            z zVar3;
            boolean z12;
            int i13;
            this.Y = new f(this.Z);
            this.f127400h = false;
            this.f127401i = false;
            this.f127410t = false;
            boolean z13 = false;
            boolean z14 = false;
            boolean z15 = false;
            int i14 = 0;
            boolean z16 = false;
            int i15 = 0;
            boolean z17 = false;
            boolean z18 = false;
            boolean z19 = false;
            boolean z20 = false;
            int i16 = 0;
            int i17 = 0;
            GL10 gl10 = null;
            while (true) {
                Runnable runnableRemove = null;
                while (true) {
                    try {
                        synchronized (this.f127408p0) {
                            while (true) {
                                if (this.f127393a) {
                                    synchronized (this.f127408p0) {
                                        s();
                                        r();
                                    }
                                    return;
                                }
                                if (!this.f127412w.isEmpty()) {
                                    z10 = z13;
                                    runnableRemove = this.f127412w.remove(0);
                                    i10 = 0;
                                    break;
                                }
                                z10 = z13;
                                boolean z21 = this.f127396d;
                                boolean z22 = this.f127395c;
                                if (z21 != z22) {
                                    this.f127396d = z22;
                                    this.f127408p0.notifyAll();
                                } else {
                                    z22 = false;
                                }
                                if (this.f127403k) {
                                    s();
                                    r();
                                    this.f127403k = false;
                                    z15 = true;
                                }
                                if (z10) {
                                    s();
                                    r();
                                    z10 = false;
                                }
                                if (z22 && this.f127401i) {
                                    s();
                                }
                                if (z22 && this.f127400h) {
                                    z zVar4 = this.Z.get();
                                    if (!(zVar4 == null ? false : zVar4.f127370k)) {
                                        r();
                                    }
                                }
                                if (!this.f127397e && !this.f127399g) {
                                    if (this.f127401i) {
                                        s();
                                    }
                                    this.f127399g = true;
                                    this.f127398f = false;
                                    this.f127408p0.notifyAll();
                                }
                                if (this.f127397e && this.f127399g) {
                                    this.f127399g = false;
                                    this.f127408p0.notifyAll();
                                }
                                if (z14) {
                                    this.f127410t = false;
                                    this.f127411v = true;
                                    this.f127408p0.notifyAll();
                                    z14 = false;
                                }
                                if (k()) {
                                    if (!this.f127400h) {
                                        if (z15) {
                                            z12 = false;
                                        } else {
                                            try {
                                                this.Y.n();
                                                if (this.Y.f127390f != null) {
                                                    this.f127400h = true;
                                                    this.f127408p0.notifyAll();
                                                    z12 = z15;
                                                    z16 = true;
                                                }
                                            } catch (RuntimeException e10) {
                                                this.f127408p0.a(this);
                                                throw e10;
                                            }
                                        }
                                        if (this.f127400h && !this.f127401i) {
                                            this.f127401i = true;
                                            i15 = 1;
                                            z17 = true;
                                            z18 = true;
                                        }
                                        if (this.f127401i) {
                                            if (this.X) {
                                                i16 = this.f127404l;
                                                i17 = this.f127405m;
                                                this.f127410t = true;
                                                this.X = false;
                                                i15 = 1;
                                                z18 = true;
                                            }
                                            i10 = 0;
                                            this.f127409s = false;
                                            this.f127408p0.notifyAll();
                                            if (this.f127410t) {
                                                z19 = true;
                                            }
                                            i13 = this.f127407o;
                                            if (i13 != i14) {
                                                z20 = true;
                                            } else {
                                                z20 = false;
                                            }
                                            i14 = i13;
                                            z15 = z12;
                                            break;
                                        }
                                        z15 = z12;
                                    }
                                    z12 = z15;
                                    if (this.f127400h) {
                                        this.f127401i = true;
                                        i15 = 1;
                                        z17 = true;
                                        z18 = true;
                                    }
                                    if (this.f127401i) {
                                        if (this.X) {
                                            i16 = this.f127404l;
                                            i17 = this.f127405m;
                                            this.f127410t = true;
                                            this.X = false;
                                            i15 = 1;
                                            z18 = true;
                                        }
                                        i10 = 0;
                                        this.f127409s = false;
                                        this.f127408p0.notifyAll();
                                        if (this.f127410t) {
                                            z19 = true;
                                        }
                                        i13 = this.f127407o;
                                        if (i13 != i14) {
                                            z20 = true;
                                        } else {
                                            z20 = false;
                                        }
                                        i14 = i13;
                                        z15 = z12;
                                        break;
                                    }
                                    z15 = z12;
                                }
                                this.f127408p0.wait();
                                z13 = z10;
                            }
                            z13 = z10;
                        }
                        if (runnableRemove != null) {
                            break;
                        }
                        if (i15 != 0) {
                            if (this.Y.c()) {
                                synchronized (this.f127408p0) {
                                    this.f127402j = true;
                                    this.f127408p0.notifyAll();
                                }
                                i14 = i10;
                                i15 = i14;
                                if (z17) {
                                    gl10 = (GL10) this.Y.a();
                                    z17 = false;
                                }
                                if (z16) {
                                    zVar3 = this.Z.get();
                                    if (zVar3 != null) {
                                        l0.a("onSurfaceCreated");
                                        zVar3.f127362c.onSurfaceCreated(gl10, this.Y.f127389e);
                                        l0.b();
                                    }
                                    z16 = false;
                                }
                                if (z18) {
                                    zVar2 = this.Z.get();
                                    if (zVar2 != null) {
                                        l0.a("onSurfaceChanged");
                                        zVar2.f127362c.onSurfaceChanged(gl10, i16, i17);
                                        l0.b();
                                    }
                                    z18 = false;
                                }
                                if (z20) {
                                    f fVar = this.Y;
                                    if (i14 == 1) {
                                        i11 = 12421;
                                    } else {
                                        i11 = 12420;
                                    }
                                    fVar.m(12422, i11);
                                    f fVar2 = this.Y;
                                    if (i14 == 1) {
                                        i12 = 1;
                                    } else {
                                        i12 = 0;
                                    }
                                    fVar2.m(f.f127384i, i12);
                                }
                                zVar = this.Z.get();
                                if (zVar != null) {
                                    l0.a("onDrawFrame");
                                    zVar.f127362c.onDrawFrame(gl10);
                                    l0.b();
                                }
                                if (z20) {
                                    iO = this.Y.o();
                                    if (iO == 12288) {
                                        z11 = true;
                                        z13 = z13;
                                    } else if (iO != 12302) {
                                        f.k("GLThread", "eglSwapBuffers", iO);
                                        if (i14 == 0) {
                                            synchronized (this.f127408p0) {
                                                z11 = true;
                                                this.f127398f = true;
                                                this.f127408p0.notifyAll();
                                            }
                                        } else {
                                            z11 = true;
                                        }
                                        z13 = z13;
                                    } else {
                                        z11 = true;
                                        z13 = true;
                                    }
                                    if (z19) {
                                        z14 = z11;
                                        z19 = false;
                                    }
                                } else {
                                    iO = this.Y.o();
                                    if (iO == 12288) {
                                        z11 = true;
                                        z13 = z13;
                                    } else if (iO != 12302) {
                                        f.k("GLThread", "eglSwapBuffers", iO);
                                        if (i14 == 0) {
                                            synchronized (this.f127408p0) {
                                                z11 = true;
                                                this.f127398f = true;
                                                this.f127408p0.notifyAll();
                                            }
                                        } else {
                                            z11 = true;
                                        }
                                        z13 = z13;
                                    } else {
                                        z11 = true;
                                        z13 = true;
                                    }
                                    if (z19) {
                                        z14 = z11;
                                        z19 = false;
                                    }
                                }
                            } else {
                                synchronized (this.f127408p0) {
                                    this.f127402j = true;
                                    this.f127398f = true;
                                    this.f127408p0.notifyAll();
                                }
                            }
                            synchronized (this.f127408p0) {
                                s();
                                r();
                                throw th;
                            }
                        }
                        if (z17) {
                            gl10 = (GL10) this.Y.a();
                            z17 = false;
                        }
                        if (z16) {
                            zVar3 = this.Z.get();
                            if (zVar3 != null) {
                                try {
                                    l0.a("onSurfaceCreated");
                                    zVar3.f127362c.onSurfaceCreated(gl10, this.Y.f127389e);
                                    l0.b();
                                } catch (Throwable th2) {
                                    l0.b();
                                    throw th2;
                                }
                            }
                            z16 = false;
                        }
                        if (z18) {
                            zVar2 = this.Z.get();
                            if (zVar2 != null) {
                                try {
                                    l0.a("onSurfaceChanged");
                                    zVar2.f127362c.onSurfaceChanged(gl10, i16, i17);
                                    l0.b();
                                } catch (Throwable th3) {
                                    l0.b();
                                    throw th3;
                                }
                            }
                            z18 = false;
                        }
                        if (z20) {
                            f fVar3 = this.Y;
                            if (i14 == 1) {
                                i11 = 12421;
                            } else {
                                i11 = 12420;
                            }
                            fVar3.m(12422, i11);
                            f fVar4 = this.Y;
                            if (i14 == 1) {
                                i12 = 1;
                            } else {
                                i12 = 0;
                            }
                            fVar4.m(f.f127384i, i12);
                        }
                        zVar = this.Z.get();
                        if (zVar != null) {
                            try {
                                l0.a("onDrawFrame");
                                zVar.f127362c.onDrawFrame(gl10);
                                l0.b();
                            } catch (Throwable th4) {
                                l0.b();
                                throw th4;
                            }
                        }
                        if (z20 || i14 == 0) {
                            iO = this.Y.o();
                            if (iO == 12288) {
                                z11 = true;
                                z13 = z13;
                            } else if (iO != 12302) {
                                f.k("GLThread", "eglSwapBuffers", iO);
                                if (i14 == 0) {
                                    synchronized (this.f127408p0) {
                                        z11 = true;
                                        this.f127398f = true;
                                        this.f127408p0.notifyAll();
                                    }
                                } else {
                                    z11 = true;
                                }
                                z13 = z13;
                            } else {
                                z11 = true;
                                z13 = true;
                            }
                        } else {
                            z11 = true;
                            z13 = z13;
                        }
                        if (z19) {
                            z14 = z11;
                            z19 = false;
                        }
                    } catch (Throwable th5) {
                        synchronized (this.f127408p0) {
                            s();
                            r();
                            throw th5;
                        }
                    }
                }
                runnableRemove.run();
            }
        }

        private boolean k() {
            z zVar = this.Z.get();
            EglReadyListener eglReadyListener = zVar == null ? null : zVar.f127372m;
            return !this.f127396d && (eglReadyListener == null || eglReadyListener.b() != null) && this.f127397e && !this.f127398f && this.f127404l > 0 && this.f127405m > 0 && (this.f127409s || this.f127406n == 1);
        }

        private void r() {
            if (this.f127400h) {
                this.Y.f();
                this.f127400h = false;
                this.f127408p0.a(this);
            }
        }

        private void s() {
            if (this.f127401i) {
                this.f127401i = false;
                this.Y.d();
            }
        }

        @Override // com.google.vr.cardboard.EglReadyListener.a
        public void a() {
            synchronized (this.f127408p0) {
                try {
                    this.Y.l();
                    this.f127408p0.notifyAll();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public boolean b() {
            return this.f127400h && this.f127401i && k();
        }

        public int d() {
            int i10;
            synchronized (this.f127408p0) {
                try {
                    i10 = this.f127406n;
                } catch (Throwable th2) {
                    throw th2;
                }
            }
            return i10;
        }

        public int e() {
            int i10;
            synchronized (this.f127408p0) {
                i10 = this.f127407o;
            }
            return i10;
        }

        public void g(Runnable runnable) {
            synchronized (this.f127408p0) {
                try {
                    this.f127395c = true;
                    if (runnable != null) {
                        this.f127412w.add(runnable);
                    }
                    this.f127408p0.notifyAll();
                    while (!this.f127394b && !this.f127396d) {
                        try {
                            this.f127408p0.wait();
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public void h() {
            synchronized (this.f127408p0) {
                try {
                    this.f127395c = false;
                    this.f127409s = true;
                    this.f127411v = false;
                    this.f127408p0.notifyAll();
                    while (!this.f127394b && this.f127396d && !this.f127411v) {
                        try {
                            this.f127408p0.wait();
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public void i(int i10, int i11) {
            synchronized (this.f127408p0) {
                try {
                    this.f127404l = i10;
                    this.f127405m = i11;
                    this.X = true;
                    this.f127409s = true;
                    this.f127411v = false;
                    if (Thread.currentThread() == this) {
                        return;
                    }
                    this.f127408p0.notifyAll();
                    while (!this.f127394b && !this.f127396d && !this.f127411v && b()) {
                        try {
                            this.f127408p0.wait();
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public void j(Runnable runnable) {
            if (runnable == null) {
                throw new IllegalArgumentException("r must not be null");
            }
            synchronized (this.f127408p0) {
                try {
                    this.f127412w.add(runnable);
                    this.f127408p0.notifyAll();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public void l() {
            synchronized (this.f127408p0) {
                try {
                    this.f127393a = true;
                    this.f127408p0.notifyAll();
                    while (!this.f127394b) {
                        try {
                            this.f127408p0.wait();
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                        }
                    }
                    z zVar = this.Z.get();
                    if (zVar != null && zVar.f127372m != null) {
                        zVar.f127372m.f();
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public void m() {
            this.f127403k = true;
            this.f127408p0.notifyAll();
        }

        public void n() {
            synchronized (this.f127408p0) {
                this.f127409s = true;
                this.f127408p0.notifyAll();
            }
        }

        public void o() {
            synchronized (this.f127408p0) {
                try {
                    if (Thread.currentThread() == this) {
                        return;
                    }
                    this.f127410t = true;
                    this.f127409s = true;
                    this.f127411v = false;
                    this.f127408p0.notifyAll();
                    while (!this.f127394b && !this.f127396d && !this.f127411v && b()) {
                        try {
                            this.f127408p0.wait();
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public void p(int i10) {
            if (i10 < 0 || i10 > 1) {
                throw new IllegalArgumentException("renderMode");
            }
            synchronized (this.f127408p0) {
                this.f127406n = i10;
                this.f127408p0.notifyAll();
            }
        }

        public void q(int i10) {
            if (i10 < 0 || i10 > 2) {
                throw new IllegalArgumentException("swapMode");
            }
            synchronized (this.f127408p0) {
                try {
                    this.f127407o = i10;
                    this.f127408p0.notifyAll();
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public void run() {
            a aVar;
            long id2 = getId();
            StringBuilder sb2 = new StringBuilder(29);
            sb2.append("GLThread ");
            sb2.append(id2);
            setName(sb2.toString());
            try {
                f();
                aVar = this.f127408p0;
            } catch (InterruptedException unused) {
                aVar = this.f127408p0;
            } finally {
                this.f127408p0.b(this);
            }
        }

        public void t() {
            synchronized (this.f127408p0) {
                try {
                    this.f127397e = true;
                    this.f127402j = false;
                    this.f127408p0.notifyAll();
                    while (this.f127399g && !this.f127402j && !this.f127394b) {
                        try {
                            this.f127408p0.wait();
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }

        public void u(Runnable runnable) {
            synchronized (this.f127408p0) {
                try {
                    this.f127397e = false;
                    if (runnable != null) {
                        this.f127412w.add(runnable);
                    }
                    this.f127408p0.notifyAll();
                    while (!this.f127399g && !this.f127394b) {
                        try {
                            this.f127408p0.wait();
                        } catch (InterruptedException unused) {
                            Thread.currentThread().interrupt();
                        }
                    }
                } catch (Throwable th2) {
                    throw th2;
                }
            }
        }
    }

    public interface h {
        GL wrap(GL gl2);
    }

    static class i extends Writer {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        private StringBuilder f127414a = new StringBuilder();

        i() {
        }

        private void a() {
            if (this.f127414a.length() > 0) {
                this.f127414a.toString();
                StringBuilder sb2 = this.f127414a;
                sb2.delete(0, sb2.length());
            }
        }

        @Override // java.io.Writer, java.io.Closeable, java.lang.AutoCloseable
        public void close() {
            a();
        }

        @Override // java.io.Writer, java.io.Flushable
        public void flush() {
            a();
        }

        @Override // java.io.Writer
        public void write(char[] cArr, int i10, int i11) {
            for (int i12 = 0; i12 < i11; i12++) {
                char c10 = cArr[i10 + i12];
                if (c10 == '\n') {
                    a();
                } else {
                    this.f127414a.append(c10);
                }
            }
        }
    }

    class j extends c {
        public j(z zVar, boolean z10) {
            super(zVar, 8, 8, 8, 0, z10 ? 16 : 0, 0);
        }
    }

    public z(Context context) {
        super(context);
        this.f127360a = new WeakReference<>(this);
        k();
    }

    private void j() {
        if (this.f127361b != null) {
            throw new IllegalStateException("setRenderer has already been called for this instance.");
        }
    }

    private void k() {
        getHolder().addCallback(this);
    }

    protected void finalize() throws Throwable {
        try {
            g gVar = this.f127361b;
            if (gVar != null) {
                gVar.l();
            }
        } finally {
            super.finalize();
        }
    }

    public int getDebugFlags() {
        return this.f127368i;
    }

    public boolean getPreserveEGLContextOnPause() {
        return this.f127370k;
    }

    public int getRenderMode() {
        return this.f127361b.d();
    }

    protected boolean l() {
        return this.f127363d;
    }

    public void m() {
        this.f127361b.g(null);
    }

    public void n(Runnable runnable) {
        this.f127361b.g(runnable);
    }

    public void o() {
        this.f127361b.h();
    }

    @Override // android.view.SurfaceView, android.view.View
    protected void onAttachedToWindow() {
        int iE;
        int iD;
        super.onAttachedToWindow();
        if (this.f127363d && this.f127362c != null && !this.f127371l) {
            g gVar = this.f127361b;
            if (gVar != null) {
                iD = gVar.d();
                iE = this.f127361b.e();
            } else {
                iE = 0;
                iD = 1;
            }
            g gVar2 = new g(this.f127360a);
            this.f127361b = gVar2;
            if (iD != 1) {
                gVar2.p(iD);
            }
            if (iE != 0) {
                this.f127361b.q(iE);
            }
            this.f127361b.start();
        }
        this.f127363d = false;
    }

    @Override // android.view.SurfaceView, android.view.View
    protected void onDetachedFromWindow() {
        if (this.f127361b != null && !this.f127371l) {
            r();
        }
        this.f127363d = true;
        super.onDetachedFromWindow();
    }

    public void p(Runnable runnable) {
        this.f127361b.u(runnable);
    }

    public void q(Runnable runnable) {
        this.f127361b.j(runnable);
    }

    public void r() {
        this.f127361b.l();
    }

    public void s() {
        this.f127361b.n();
    }

    public void setDebugFlags(int i10) {
        this.f127368i = i10;
    }

    public void setEGLConfigChooser(GLSurfaceView.EGLConfigChooser eGLConfigChooser) {
        j();
        this.f127364e = eGLConfigChooser;
    }

    public void setEGLContextClientVersion(int i10) {
        j();
        this.f127369j = i10;
    }

    public void setEGLContextFactory(GLSurfaceView.EGLContextFactory eGLContextFactory) {
        j();
        this.f127365f = eGLContextFactory;
    }

    public void setEGLWindowSurfaceFactory(GLSurfaceView.EGLWindowSurfaceFactory eGLWindowSurfaceFactory) {
        j();
        this.f127366g = eGLWindowSurfaceFactory;
    }

    public void setEglReadyListener(EglReadyListener eglReadyListener) {
        this.f127372m = eglReadyListener;
    }

    public void setGLWrapper(h hVar) {
        this.f127367h = hVar;
    }

    public void setPreserveEGLContextOnPause(boolean z10) {
        this.f127370k = z10;
    }

    public void setPreserveGlThreadOnDetachedFromWindow(boolean z10) {
        j();
        this.f127371l = z10;
    }

    public void setRenderMode(int i10) {
        this.f127361b.p(i10);
    }

    public void setRenderer(GLSurfaceView.Renderer renderer) {
        j();
        if (this.f127364e == null) {
            this.f127364e = new j(this, true);
        }
        if (this.f127365f == null) {
            this.f127365f = new d();
        }
        if (this.f127366g == null) {
            this.f127366g = new e();
        }
        this.f127362c = renderer;
        g gVar = new g(this.f127360a);
        this.f127361b = gVar;
        gVar.start();
    }

    public void setSwapMode(int i10) {
        if (i10 == 1 && com.google.vr.cardboard.n.a()) {
            return;
        }
        this.f127361b.q(i10);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceChanged(SurfaceHolder surfaceHolder, int i10, int i11, int i12) {
        this.f127361b.i(i11, i12);
    }

    @Override // android.view.SurfaceHolder.Callback
    public void surfaceCreated(SurfaceHolder surfaceHolder) {
        this.f127361b.t();
    }

    public void surfaceDestroyed(SurfaceHolder surfaceHolder) {
        p(null);
    }

    @Override // android.view.SurfaceHolder.Callback2
    public void surfaceRedrawNeeded(SurfaceHolder surfaceHolder) {
        this.f127361b.o();
    }

    public void t(int i10, int i11, int i12, int i13, int i14, int i15) {
        setEGLConfigChooser(new c(this, i10, i11, i12, i13, i14, i15));
    }

    public void setEGLConfigChooser(boolean z10) {
        setEGLConfigChooser(new j(this, z10));
    }

    public z(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f127360a = new WeakReference<>(this);
        k();
    }
}

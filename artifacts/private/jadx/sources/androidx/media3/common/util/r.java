package androidx.media3.common.util;

import android.content.Context;
import android.opengl.GLES20;
import java.io.IOException;
import java.nio.Buffer;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
@b1
public final class r {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f61619g = 35815;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private final int f61620a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private final a[] f61621b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final b[] f61622c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final Map<String, a> f61623d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final Map<String, b> f61624e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private boolean f61625f;

    private static final class a {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f61626a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f61627b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        @androidx.annotation.p0
        private Buffer f61628c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private int f61629d;

        private a(String str, int i10) {
            this.f61626a = str;
            this.f61627b = i10;
        }

        public static a b(int i10, int i11) {
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(i10, 35722, iArr, 0);
            int i12 = iArr[0];
            byte[] bArr = new byte[i12];
            GLES20.glGetActiveAttrib(i10, i11, i12, new int[1], 0, new int[1], 0, new int[1], 0, bArr, 0);
            String str = new String(bArr, 0, r.j(bArr));
            return new a(str, r.h(i10, str));
        }

        public void a() throws t.a {
            Buffer buffer = (Buffer) androidx.media3.common.util.a.h(this.f61628c, "call setBuffer before bind");
            GLES20.glBindBuffer(34962, 0);
            GLES20.glVertexAttribPointer(this.f61627b, this.f61629d, 5126, false, 0, buffer);
            GLES20.glEnableVertexAttribArray(this.f61627b);
            t.f();
        }

        public void c(float[] fArr, int i10) {
            this.f61628c = t.k(fArr);
            this.f61629d = i10;
        }
    }

    private static final class b {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public final String f61630a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        private final int f61631b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        private final int f61632c;

        /* JADX INFO: renamed from: f, reason: collision with root package name */
        private int f61635f;

        /* JADX INFO: renamed from: g, reason: collision with root package name */
        private int f61636g;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        private final float[] f61633d = new float[16];

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        private final int[] f61634e = new int[4];

        /* JADX INFO: renamed from: h, reason: collision with root package name */
        private int f61637h = androidx.media3.common.j.I3;

        private b(String str, int i10, int i11) {
            this.f61630a = str;
            this.f61631b = i10;
            this.f61632c = i11;
        }

        public static b b(int i10, int i11) {
            int[] iArr = new int[1];
            GLES20.glGetProgramiv(i10, 35719, iArr, 0);
            int[] iArr2 = new int[1];
            int i12 = iArr[0];
            byte[] bArr = new byte[i12];
            GLES20.glGetActiveUniform(i10, i11, i12, new int[1], 0, new int[1], 0, iArr2, 0, bArr, 0);
            String str = new String(bArr, 0, r.j(bArr));
            return new b(str, r.k(i10, str), iArr2[0]);
        }

        public void a(boolean z10) throws t.a {
            int i10 = this.f61632c;
            if (i10 == 5124) {
                GLES20.glUniform1iv(this.f61631b, 1, this.f61634e, 0);
                t.f();
                return;
            }
            if (i10 == 5126) {
                GLES20.glUniform1fv(this.f61631b, 1, this.f61633d, 0);
                t.f();
                return;
            }
            if (i10 == 35678 || i10 == r.f61619g || i10 == 36198) {
                if (this.f61635f == 0) {
                    throw new IllegalStateException("No call to setSamplerTexId() before bind.");
                }
                GLES20.glActiveTexture(this.f61636g + 33984);
                t.f();
                int i11 = this.f61632c;
                t.c(i11 == 35678 ? 3553 : 36197, this.f61635f, (i11 == 35678 || !z10) ? androidx.media3.common.j.I3 : 9728);
                if (this.f61632c == 35678) {
                    if (this.f61637h == 9987) {
                        GLES20.glGenerateMipmap(3553);
                        t.f();
                    }
                    GLES20.glTexParameteri(3553, 10241, this.f61637h);
                    t.f();
                }
                GLES20.glUniform1i(this.f61631b, this.f61636g);
                t.f();
                return;
            }
            switch (i10) {
                case 35664:
                    GLES20.glUniform2fv(this.f61631b, 1, this.f61633d, 0);
                    t.f();
                    return;
                case 35665:
                    GLES20.glUniform3fv(this.f61631b, 1, this.f61633d, 0);
                    t.f();
                    return;
                case 35666:
                    GLES20.glUniform4fv(this.f61631b, 1, this.f61633d, 0);
                    t.f();
                    return;
                case 35667:
                    GLES20.glUniform2iv(this.f61631b, 1, this.f61634e, 0);
                    t.f();
                    return;
                case 35668:
                    GLES20.glUniform3iv(this.f61631b, 1, this.f61634e, 0);
                    t.f();
                    return;
                case 35669:
                    GLES20.glUniform4iv(this.f61631b, 1, this.f61634e, 0);
                    t.f();
                    return;
                default:
                    switch (i10) {
                        case 35675:
                            GLES20.glUniformMatrix3fv(this.f61631b, 1, false, this.f61633d, 0);
                            t.f();
                            return;
                        case 35676:
                            GLES20.glUniformMatrix4fv(this.f61631b, 1, false, this.f61633d, 0);
                            t.f();
                            return;
                        default:
                            throw new IllegalStateException("Unexpected uniform type: " + this.f61632c);
                    }
            }
        }

        public void c(float f10) {
            this.f61633d[0] = f10;
        }

        public void d(float[] fArr) {
            System.arraycopy(fArr, 0, this.f61633d, 0, fArr.length);
        }

        public void e(int i10) {
            this.f61634e[0] = i10;
        }

        public void f(int[] iArr) {
            System.arraycopy(iArr, 0, this.f61634e, 0, iArr.length);
        }

        public void g(int i10, int i11) {
            this.f61635f = i10;
            this.f61636g = i11;
        }

        public void h(int i10) {
            this.f61637h = i10;
        }
    }

    public r(Context context, String str, String str2) throws t.a, IOException {
        this(k1.t1(context, str), k1.t1(context, str2));
    }

    private static void d(int i10, int i11, String str) throws t.a {
        int iGlCreateShader = GLES20.glCreateShader(i11);
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        int[] iArr = {0};
        GLES20.glGetShaderiv(iGlCreateShader, 35713, iArr, 0);
        t.g(iArr[0] == 1, GLES20.glGetShaderInfoLog(iGlCreateShader) + ", source: \n" + str);
        GLES20.glAttachShader(i10, iGlCreateShader);
        GLES20.glDeleteShader(iGlCreateShader);
        t.f();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int h(int i10, String str) {
        return GLES20.glGetAttribLocation(i10, str);
    }

    private int i(String str) {
        return h(this.f61620a, str);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int j(byte[] bArr) {
        for (int i10 = 0; i10 < bArr.length; i10++) {
            if (bArr[i10] == 0) {
                return i10;
            }
        }
        return bArr.length;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static int k(int i10, String str) {
        return GLES20.glGetUniformLocation(i10, str);
    }

    public void e() throws t.a {
        for (a aVar : this.f61621b) {
            aVar.a();
        }
        for (b bVar : this.f61622c) {
            bVar.a(this.f61625f);
        }
    }

    public void f() throws t.a {
        GLES20.glDeleteProgram(this.f61620a);
        t.f();
    }

    public int g(String str) throws t.a {
        int i10 = i(str);
        GLES20.glEnableVertexAttribArray(i10);
        t.f();
        return i10;
    }

    public int l(String str) {
        return k(this.f61620a, str);
    }

    public void m(String str, float[] fArr, int i10) {
        ((a) androidx.media3.common.util.a.g(this.f61623d.get(str))).c(fArr, i10);
    }

    public void n(boolean z10) {
        this.f61625f = z10;
    }

    public void o(String str, float f10) {
        ((b) androidx.media3.common.util.a.g(this.f61624e.get(str))).c(f10);
    }

    public void p(String str, float[] fArr) {
        ((b) androidx.media3.common.util.a.g(this.f61624e.get(str))).d(fArr);
    }

    public void q(String str, float[] fArr) {
        b bVar = this.f61624e.get(str);
        if (bVar == null) {
            return;
        }
        bVar.d(fArr);
    }

    public void r(String str, int i10) {
        ((b) androidx.media3.common.util.a.g(this.f61624e.get(str))).e(i10);
    }

    public void s(String str, int[] iArr) {
        ((b) androidx.media3.common.util.a.g(this.f61624e.get(str))).f(iArr);
    }

    public void t(String str, int i10, int i11) {
        ((b) androidx.media3.common.util.a.g(this.f61624e.get(str))).g(i10, i11);
    }

    public void u(String str, int i10, int i11, int i12) {
        b bVar = (b) androidx.media3.common.util.a.g(this.f61624e.get(str));
        bVar.g(i10, i11);
        bVar.h(i12);
    }

    public void v() throws t.a {
        GLES20.glUseProgram(this.f61620a);
        t.f();
    }

    public r(String str, String str2) throws t.a {
        int iGlCreateProgram = GLES20.glCreateProgram();
        this.f61620a = iGlCreateProgram;
        t.f();
        d(iGlCreateProgram, 35633, str);
        d(iGlCreateProgram, 35632, str2);
        GLES20.glLinkProgram(iGlCreateProgram);
        int[] iArr = {0};
        GLES20.glGetProgramiv(iGlCreateProgram, 35714, iArr, 0);
        t.g(iArr[0] == 1, "Unable to link shader program: \n" + GLES20.glGetProgramInfoLog(iGlCreateProgram));
        GLES20.glUseProgram(iGlCreateProgram);
        this.f61623d = new HashMap();
        int[] iArr2 = new int[1];
        GLES20.glGetProgramiv(iGlCreateProgram, 35721, iArr2, 0);
        this.f61621b = new a[iArr2[0]];
        for (int i10 = 0; i10 < iArr2[0]; i10++) {
            a aVarB = a.b(this.f61620a, i10);
            this.f61621b[i10] = aVarB;
            this.f61623d.put(aVarB.f61626a, aVarB);
        }
        this.f61624e = new HashMap();
        int[] iArr3 = new int[1];
        GLES20.glGetProgramiv(this.f61620a, 35718, iArr3, 0);
        this.f61622c = new b[iArr3[0]];
        for (int i11 = 0; i11 < iArr3[0]; i11++) {
            b bVarB = b.b(this.f61620a, i11);
            this.f61622c[i11] = bVarB;
            this.f61624e.put(bVarB.f61630a, bVarB);
        }
        t.f();
    }
}

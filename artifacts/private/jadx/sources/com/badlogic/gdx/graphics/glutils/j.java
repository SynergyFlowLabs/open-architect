package com.badlogic.gdx.graphics.glutils;

import android.opengl.GLES20;
import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.math.c0;
import com.badlogic.gdx.math.d0;
import com.badlogic.gdx.math.t;
import com.badlogic.gdx.utils.j0;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.FloatBuffer;
import java.nio.IntBuffer;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class j implements gc.e {
    public static final String H1 = "a_color";

    /* JADX INFO: renamed from: g3, reason: collision with root package name */
    public static final String f94729g3 = "a_tangent";

    /* JADX INFO: renamed from: h3, reason: collision with root package name */
    public static final String f94730h3 = "a_binormal";

    /* JADX INFO: renamed from: i3, reason: collision with root package name */
    private static final boolean f94731i3 = true;

    /* JADX INFO: renamed from: j3, reason: collision with root package name */
    private static final Map<com.planner5d.library.engine.a, List<j>> f94732j3 = new HashMap();

    /* JADX INFO: renamed from: p0, reason: collision with root package name */
    public static final String f94733p0 = "a_position";

    /* JADX INFO: renamed from: p1, reason: collision with root package name */
    public static final String f94734p1 = "a_normal";

    /* JADX INFO: renamed from: p2, reason: collision with root package name */
    public static final String f94735p2 = "a_texCoord";

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private boolean f94737b;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private String[] f94741f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private String[] f94745j;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private int f94746k;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private int f94747l;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    private int f94748m;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    private final String f94749n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    private final String f94750o;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private boolean f94751s;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private final com.planner5d.library.engine.a f94753v;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private String f94736a = "";

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private final j0<String> f94738c = new j0<>();

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private final j0<String> f94739d = new j0<>();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final j0<String> f94740e = new j0<>();

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private final j0<String> f94742g = new j0<>();

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private final j0<String> f94743h = new j0<>();

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private final j0<String> f94744i = new j0<>();

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private int f94752t = 0;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private final int[] f94754w = {0};
    private final int[] X = {0};
    private final byte[] Y = new byte[256];
    private final int[] Z = {0};

    public j(com.planner5d.library.engine.a aVar, String str, String str2) {
        if (str == null) {
            throw new IllegalArgumentException("vertex shader must not be null");
        }
        if (str2 == null) {
            throw new IllegalArgumentException("fragment shader must not be null");
        }
        this.f94753v = aVar;
        this.f94749n = str;
        this.f94750o = str2;
        f(str, str2);
        if (P()) {
            o();
            x();
            a(aVar, this);
        }
    }

    public static void N(com.planner5d.library.engine.a aVar) {
        Map<com.planner5d.library.engine.a, List<j>> map = f94732j3;
        synchronized (map) {
            try {
                List<j> list = map.get(aVar);
                if (list != null) {
                    for (j jVar : list) {
                        jVar.f94751s = true;
                        jVar.b();
                    }
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private int Q() {
        int iGlCreateProgram = GLES20.glCreateProgram();
        if (iGlCreateProgram == 0) {
            return -1;
        }
        GLES20.glAttachShader(iGlCreateProgram, this.f94747l);
        GLES20.glAttachShader(iGlCreateProgram, this.f94748m);
        GLES20.glLinkProgram(iGlCreateProgram);
        ByteBuffer byteBufferAllocateDirect = ByteBuffer.allocateDirect(4);
        byteBufferAllocateDirect.order(ByteOrder.nativeOrder());
        IntBuffer intBufferAsIntBuffer = byteBufferAllocateDirect.asIntBuffer();
        GLES20.glGetProgramiv(iGlCreateProgram, 35714, intBufferAsIntBuffer);
        if (intBufferAsIntBuffer.get(0) != 0) {
            return iGlCreateProgram;
        }
        this.f94736a = GLES20.glGetProgramInfoLog(iGlCreateProgram);
        return -1;
    }

    private int X(int i10, String str) {
        int iGlCreateShader = GLES20.glCreateShader(i10);
        if (iGlCreateShader == 0) {
            return -1;
        }
        GLES20.glShaderSource(iGlCreateShader, str);
        GLES20.glCompileShader(iGlCreateShader);
        if (d.i(iGlCreateShader, 35713) != 0) {
            return iGlCreateShader;
        }
        this.f94736a += GLES20.glGetShaderInfoLog(iGlCreateShader);
        return -1;
    }

    private void a(com.planner5d.library.engine.a aVar, j jVar) {
        Map<com.planner5d.library.engine.a, List<j>> map = f94732j3;
        synchronized (map) {
            try {
                List<j> linkedList = map.get(aVar);
                if (linkedList == null) {
                    linkedList = new LinkedList<>();
                    map.put(aVar, linkedList);
                }
                linkedList.add(jVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void b() {
        if (this.f94751s) {
            f(this.f94749n, this.f94750o);
            this.f94751s = false;
        }
    }

    public static void e(com.planner5d.library.engine.a aVar) {
        Map<com.planner5d.library.engine.a, List<j>> map = f94732j3;
        synchronized (map) {
            try {
                map.remove(aVar);
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    private void f(String str, String str2) {
        this.f94747l = X(35633, str);
        int iX = X(35632, str2);
        this.f94748m = iX;
        if (this.f94747l != -1 && iX != -1) {
            int iQ = Q();
            this.f94746k = iQ;
            if (iQ == -1) {
                this.f94737b = false;
                return;
            } else {
                this.f94737b = true;
                return;
            }
        }
        this.f94737b = false;
    }

    private int m(String str) {
        int iP = this.f94742g.p(str, -2);
        if (iP == -2) {
            iP = GLES20.glGetAttribLocation(this.f94746k, str);
            this.f94742g.C(str, iP);
        }
        return iP;
    }

    private void o() {
        int[] iArr = this.f94754w;
        iArr[0] = 0;
        GLES20.glGetProgramiv(this.f94746k, 35721, iArr, 0);
        int i10 = this.f94754w[0];
        this.f94745j = new String[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            int[] iArr2 = this.f94754w;
            iArr2[0] = 1;
            int i12 = this.f94746k;
            byte[] bArr = this.Y;
            GLES20.glGetActiveAttrib(i12, i11, bArr.length, this.Z, 0, iArr2, 0, this.X, 0, bArr, 0);
            String strTrim = new String(this.Y, 0, this.Z[0]).trim();
            this.f94742g.C(strTrim, GLES20.glGetAttribLocation(this.f94746k, strTrim));
            this.f94743h.C(strTrim, this.X[0]);
            this.f94744i.C(strTrim, this.f94754w[0]);
            this.f94745j[i11] = strTrim;
        }
    }

    private int q(String str) {
        return u(str, true);
    }

    private void x() {
        GLES20.glGetProgramiv(this.f94746k, 35718, this.f94754w, 0);
        int i10 = this.f94754w[0];
        this.f94741f = new String[i10];
        for (int i11 = 0; i11 < i10; i11++) {
            int[] iArr = this.f94754w;
            iArr[0] = 1;
            int i12 = this.f94746k;
            byte[] bArr = this.Y;
            GLES20.glGetActiveUniform(i12, i11, bArr.length, this.Z, 0, iArr, 0, this.X, 0, bArr, 0);
            String strTrim = new String(this.Y, 0, this.Z[0]).trim();
            this.f94738c.C(strTrim, GLES20.glGetUniformLocation(this.f94746k, strTrim));
            this.f94739d.C(strTrim, this.X[0]);
            this.f94740e.C(strTrim, this.f94754w[0]);
            this.f94741f[i11] = strTrim;
        }
    }

    public int A(String str) {
        return this.f94743h.p(str, 0);
    }

    public String[] B() {
        return this.f94745j;
    }

    public void B0(String str, t tVar) {
        L0(str, tVar, false);
    }

    public String C() {
        return this.f94750o;
    }

    public String D() {
        if (!this.f94737b) {
            return this.f94736a;
        }
        String strGlGetProgramInfoLog = GLES20.glGetProgramInfoLog(this.f94746k);
        this.f94736a = strGlGetProgramInfoLog;
        return strGlGetProgramInfoLog;
    }

    public void D1(int i10, int i11) {
        b();
        GLES20.glUniform1i(i10, i11);
    }

    public int E(String str) {
        return this.f94738c.p(str, -1);
    }

    public void E1(int i10, int i11, int i12) {
        b();
        GLES20.glUniform2i(i10, i11, i12);
    }

    public int F(String str) {
        return this.f94740e.p(str, 0);
    }

    public void F1(int i10, int i11, int i12, int i13) {
        b();
        GLES20.glUniform3i(i10, i11, i12, i13);
    }

    public int G(String str) {
        return this.f94739d.p(str, 0);
    }

    public String[] H() {
        return this.f94741f;
    }

    public void H1(int i10, int i11, int i12, int i13, int i14) {
        b();
        GLES20.glUniform4i(i10, i11, i12, i13, i14);
    }

    public String I() {
        return this.f94749n;
    }

    public boolean J(String str) {
        return this.f94742g.d(str);
    }

    public void J1(String str, int i10) {
        b();
        GLES20.glUniform1i(q(str), i10);
    }

    public boolean K(String str) {
        return this.f94738c.d(str);
    }

    public void L0(String str, t tVar, boolean z10) {
        t0(q(str), tVar, z10);
    }

    public void M0(String str, Matrix4 matrix4) {
        O0(str, matrix4, false);
    }

    public void M1(String str, int i10, int i11) {
        b();
        GLES20.glUniform2i(q(str), i10, i11);
    }

    public void O0(String str, Matrix4 matrix4, boolean z10) {
        w0(q(str), matrix4, z10);
    }

    public boolean P() {
        return this.f94737b;
    }

    public void Q0(String str, FloatBuffer floatBuffer, int i10, boolean z10) {
        b();
        floatBuffer.position(0);
        GLES20.glUniformMatrix3fv(q(str), i10, z10, floatBuffer);
    }

    public void R0(int i10, float[] fArr, int i11, int i12) {
        b();
        GLES20.glUniformMatrix4fv(i10, i12 / 16, false, fArr, i11);
    }

    public void R1(String str, int i10, int i11, int i12) {
        b();
        GLES20.glUniform3i(q(str), i10, i11, i12);
    }

    public void S1(String str, int i10, int i11, int i12, int i13) {
        b();
        GLES20.glUniform4i(q(str), i10, i11, i12, i13);
    }

    public void T0(String str, FloatBuffer floatBuffer, int i10, boolean z10) {
        b();
        floatBuffer.position(0);
        GLES20.glUniformMatrix4fv(q(str), i10, z10, floatBuffer);
    }

    public void T1(int i10, int i11, int i12, boolean z10, int i13, int i14) {
        b();
        GLES20.glVertexAttribPointer(i10, i11, i12, z10, i13, i14);
    }

    public void U0(String str, float[] fArr, int i10, int i11) {
        R0(q(str), fArr, i10, i11);
    }

    public void U1(int i10, int i11, int i12, boolean z10, int i13, Buffer buffer) {
        b();
        GLES20.glVertexAttribPointer(i10, i11, i12, z10, i13, buffer);
    }

    public void V1(String str, int i10, int i11, boolean z10, int i12, int i13) {
        b();
        int iM = m(str);
        if (iM == -1) {
            return;
        }
        GLES20.glVertexAttribPointer(iM, i10, i11, z10, i12, i13);
    }

    public void W1(String str, int i10, int i11, boolean z10, int i12, Buffer buffer) {
        b();
        int iM = m(str);
        if (iM == -1) {
            return;
        }
        GLES20.glVertexAttribPointer(iM, i10, i11, z10, i12, buffer);
    }

    public void Y0(int i10, float f10) {
        b();
        GLES20.glUniform1f(i10, f10);
    }

    public void Z0(int i10, float f10, float f11) {
        b();
        GLES20.glUniform2f(i10, f10, f11);
    }

    public void b0(String str, float f10, float f11, float f12, float f13) {
        GLES20.glVertexAttrib4f(m(str), f10, f11, f12, f13);
    }

    public void b1(int i10, float f10, float f11, float f12) {
        b();
        GLES20.glUniform3f(i10, f10, f11, f12);
    }

    public void c0(int i10, float[] fArr, int i11, int i12) {
        b();
        GLES20.glUniform1fv(i10, i12, fArr, i11);
    }

    public void d0(String str, float[] fArr, int i10, int i11) {
        b();
        GLES20.glUniform1fv(q(str), i11, fArr, i10);
    }

    @Override // gc.e
    public void dispose() {
        GLES20.glUseProgram(0);
        GLES20.glDeleteShader(this.f94747l);
        GLES20.glDeleteShader(this.f94748m);
        GLES20.glDeleteProgram(this.f94746k);
        Map<com.planner5d.library.engine.a, List<j>> map = f94732j3;
        synchronized (map) {
            try {
                List<j> list = map.get(this.f94753v);
                if (list != null) {
                    list.remove(this);
                }
            } catch (Throwable th2) {
                throw th2;
            }
        }
    }

    public void e1(int i10, float f10, float f11, float f12, float f13) {
        b();
        GLES20.glUniform4f(i10, f10, f11, f12, f13);
    }

    public void end() {
        GLES20.glUseProgram(0);
    }

    public void f0(int i10, float[] fArr, int i11, int i12) {
        b();
        GLES20.glUniform2fv(i10, i12 / 2, fArr, i11);
    }

    public void f1(int i10, com.badlogic.gdx.graphics.b bVar) {
        e1(i10, bVar.f94187a, bVar.f94188b, bVar.f94189c, bVar.f94190d);
    }

    public void g(int i10) {
        b();
        GLES20.glDisableVertexAttribArray(i10);
    }

    public void g0(String str, float[] fArr, int i10, int i11) {
        b();
        GLES20.glUniform2fv(q(str), i11 / 2, fArr, i10);
    }

    public void g1(int i10, c0 c0Var) {
        Z0(i10, c0Var.f94907a, c0Var.f94908b);
    }

    public void h(String str) {
        b();
        int iM = m(str);
        if (iM == -1) {
            return;
        }
        GLES20.glDisableVertexAttribArray(iM);
    }

    public void h0(int i10, float[] fArr, int i11, int i12) {
        b();
        GLES20.glUniform3fv(i10, i12 / 3, fArr, i11);
    }

    public void h1(int i10, d0 d0Var) {
        b1(i10, d0Var.f180482a, d0Var.f180483b, d0Var.f180484c);
    }

    public void i(int i10) {
        b();
        GLES20.glEnableVertexAttribArray(i10);
    }

    public void j(String str) {
        b();
        int iM = m(str);
        if (iM == -1) {
            return;
        }
        GLES20.glEnableVertexAttribArray(iM);
    }

    public void j0(String str, float[] fArr, int i10, int i11) {
        b();
        GLES20.glUniform3fv(q(str), i11 / 3, fArr, i10);
    }

    public void j1(String str, float f10) {
        b();
        GLES20.glUniform1f(q(str), f10);
    }

    public void k0(int i10, float[] fArr, int i11, int i12) {
        b();
        GLES20.glUniform4fv(i10, i12 / 4, fArr, i11);
    }

    public void l1(String str, float f10, float f11) {
        b();
        GLES20.glUniform2f(q(str), f10, f11);
    }

    public void o0(String str, float[] fArr, int i10, int i11) {
        b();
        GLES20.glUniform4fv(q(str), i11 / 4, fArr, i10);
    }

    public void p1(String str, float f10, float f11, float f12) {
        b();
        GLES20.glUniform3f(q(str), f10, f11, f12);
    }

    public void r0(int i10, t tVar) {
        t0(i10, tVar, false);
    }

    public void s() {
        b();
        GLES20.glUseProgram(this.f94746k);
    }

    public void s1(String str, float f10, float f11, float f12, float f13) {
        b();
        GLES20.glUniform4f(q(str), f10, f11, f12, f13);
    }

    public void t0(int i10, t tVar, boolean z10) {
        b();
        GLES20.glUniformMatrix3fv(i10, 1, z10, tVar.f95096a, 0);
    }

    public int u(String str, boolean z10) {
        int iP = this.f94738c.p(str, -2);
        if (iP == -2) {
            iP = GLES20.glGetUniformLocation(this.f94746k, str);
            if (iP == -1 && z10) {
                throw new IllegalArgumentException("no uniform with name '" + str + "' in shader");
            }
            this.f94738c.C(str, iP);
        }
        return iP;
    }

    public void v0(int i10, Matrix4 matrix4) {
        w0(i10, matrix4, false);
    }

    public void w0(int i10, Matrix4 matrix4, boolean z10) {
        b();
        GLES20.glUniformMatrix4fv(i10, 1, z10, matrix4.f94875a, 0);
    }

    public void w1(String str, com.badlogic.gdx.graphics.b bVar) {
        s1(str, bVar.f94187a, bVar.f94188b, bVar.f94189c, bVar.f94190d);
    }

    public void x0(int i10, float[] fArr) {
        y0(i10, fArr, false);
    }

    public int y(String str) {
        return this.f94742g.p(str, -1);
    }

    public void y0(int i10, float[] fArr, boolean z10) {
        b();
        GLES20.glUniformMatrix4fv(i10, 1, z10, fArr, 0);
    }

    public void y1(String str, c0 c0Var) {
        l1(str, c0Var.f94907a, c0Var.f94908b);
    }

    public int z(String str) {
        return this.f94744i.p(str, 0);
    }

    public void z1(String str, d0 d0Var) {
        p1(str, d0Var.f180482a, d0Var.f180483b, d0Var.f180484c);
    }
}

package com.badlogic.gdx.graphics;

import android.opengl.GLES20;
import com.badlogic.gdx.math.Matrix4;
import com.badlogic.gdx.math.d0;
import com.badlogic.gdx.utils.t;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;
import java.util.HashMap;
import java.util.Map;

/* JADX INFO: loaded from: classes3.dex */
public class f implements gc.e {

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    static final Map<com.planner5d.library.engine.a, com.badlogic.gdx.utils.b<f>> f94207g = new HashMap();

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    final com.badlogic.gdx.graphics.glutils.l f94208a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    final com.badlogic.gdx.graphics.glutils.f f94209b;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private final com.planner5d.library.engine.a f94212e;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    boolean f94210c = true;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    public boolean f94211d = false;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private final d0 f94213f = new d0();

    public f(com.planner5d.library.engine.a aVar, int i10, int i11, n nVar) {
        if (i11 <= 0) {
            throw new t("Empty mesh indexes");
        }
        if (i10 <= 0) {
            throw new t("Empty mesh vertices");
        }
        this.f94208a = E(i10, nVar);
        this.f94209b = new com.badlogic.gdx.graphics.glutils.e(true, i11);
        this.f94212e = aVar;
        a(this);
    }

    public static void D(com.planner5d.library.engine.a aVar) {
        com.badlogic.gdx.utils.b<f> bVar = f94207g.get(aVar);
        if (bVar != null) {
            for (int i10 = 0; i10 < bVar.f95174b; i10++) {
                f fVar = bVar.get(i10);
                fVar.f94209b.invalidate();
                fVar.f94208a.invalidate();
            }
        }
    }

    private com.badlogic.gdx.graphics.glutils.l E(int i10, n nVar) {
        return new com.badlogic.gdx.graphics.glutils.k(true, i10, nVar);
    }

    private void a(f fVar) {
        Map<com.planner5d.library.engine.a, com.badlogic.gdx.utils.b<f>> map = f94207g;
        com.badlogic.gdx.utils.b<f> bVar = map.get(this.f94212e);
        if (bVar == null) {
            bVar = new com.badlogic.gdx.utils.b<>();
        }
        bVar.c(fVar);
        map.put(this.f94212e, bVar);
    }

    public static void b(com.planner5d.library.engine.a aVar) {
        f94207g.remove(aVar);
    }

    public float[] A(int i10, int i11, float[] fArr, int i12) {
        int iA0 = (A0() * y()) / 4;
        if (i11 == -1 && (i11 = iA0 - i10) > fArr.length - i12) {
            i11 = fArr.length - i12;
        }
        if (i10 < 0 || i11 <= 0 || i10 + i11 > iA0 || i12 < 0 || i12 >= fArr.length) {
            throw new IndexOutOfBoundsException();
        }
        if (fArr.length - i12 >= i11) {
            FloatBuffer floatBufferC = C();
            int iPosition = floatBufferC.position();
            floatBufferC.position(i10);
            floatBufferC.get(fArr, i12, i11);
            floatBufferC.position(iPosition);
            return fArr;
        }
        throw new IllegalArgumentException("not enough room in vertices array, has " + fArr.length + " floats, needs " + i11);
    }

    public int A0() {
        return this.f94208a.A0();
    }

    public float[] B(float[] fArr) {
        return z(0, -1, fArr);
    }

    public FloatBuffer C() {
        return this.f94208a.n();
    }

    public void F(int i10, int i11, int i12) {
        if (i12 <= 0 || this.f94211d || this.f94209b.v1() <= 0) {
            return;
        }
        GLES20.glDrawElements(i10, i12, 5123, i11 * 2);
    }

    public void G(boolean z10) {
        this.f94210c = z10;
    }

    public f H(short[] sArr, int i10, int i11) {
        if (i11 <= 0) {
            throw new t("Indices is empty: setIndices");
        }
        this.f94209b.S0(sArr, i10, i11);
        return this;
    }

    public f I(float[] fArr, int i10, int i11) {
        if (i11 <= 0) {
            throw new t("Vertices is empty: setVertices");
        }
        this.f94208a.N1(fArr, i10, i11);
        return this;
    }

    public void I1(com.badlogic.gdx.graphics.glutils.j jVar) {
        t1(jVar, null);
    }

    public void K0(com.badlogic.gdx.graphics.glutils.j jVar, int[] iArr) {
        this.f94208a.K0(jVar, iArr);
        if (this.f94209b.v1() > 0) {
            this.f94209b.L();
        }
    }

    @Override // gc.e
    public void dispose() {
        this.f94211d = true;
        com.badlogic.gdx.utils.b<f> bVar = f94207g.get(this.f94212e);
        if (bVar != null) {
            bVar.C(this, true);
        }
        this.f94209b.dispose();
        this.f94208a.dispose();
    }

    public com.planner5d.library.engine.util.math.b e(com.planner5d.library.engine.util.math.b bVar, int i10, int i11) {
        return f(bVar, i10, i11, null);
    }

    public com.planner5d.library.engine.util.math.b f(com.planner5d.library.engine.util.math.b bVar, int i10, int i11, Matrix4 matrix4) {
        int i12;
        int iV1 = v1();
        if (i10 < 0 || i11 < 1 || (i12 = i10 + i11) > iV1) {
            throw new t("Not enough indices ( offset=" + i10 + ", count=" + i11 + ", max=" + iV1 + " )");
        }
        FloatBuffer floatBufferN = this.f94208a.n();
        ShortBuffer shortBufferN = this.f94209b.n();
        m mVarU = u(1);
        int i13 = mVarU.f94828e / 4;
        int i14 = this.f94208a.getAttributes().f94833b / 4;
        int i15 = mVarU.f94825b;
        int i16 = 6 | 0;
        if (i15 == 1) {
            while (i10 < i12) {
                this.f94213f.y0(floatBufferN.get((shortBufferN.get(i10) * i14) + i13), 0.0f, 0.0f);
                if (matrix4 != null) {
                    this.f94213f.j1(matrix4);
                }
                bVar.g(this.f94213f);
                i10++;
            }
        } else if (i15 == 2) {
            while (i10 < i12) {
                int i17 = (shortBufferN.get(i10) * i14) + i13;
                this.f94213f.y0(floatBufferN.get(i17), floatBufferN.get(i17 + 1), 0.0f);
                if (matrix4 != null) {
                    this.f94213f.j1(matrix4);
                }
                bVar.g(this.f94213f);
                i10++;
            }
        } else if (i15 == 3) {
            while (i10 < i12) {
                int i18 = (shortBufferN.get(i10) * i14) + i13;
                this.f94213f.y0(floatBufferN.get(i18), floatBufferN.get(i18 + 1), floatBufferN.get(i18 + 2));
                if (matrix4 != null) {
                    this.f94213f.j1(matrix4);
                }
                bVar.g(this.f94213f);
                i10++;
            }
        }
        return bVar;
    }

    public void g(int i10, int i11, short[] sArr, int i12) {
        int iV1 = v1();
        if (i11 < 0) {
            i11 = iV1 - i10;
        }
        if (i10 < 0 || i10 >= iV1 || i10 + i11 > iV1) {
            throw new IllegalArgumentException("Invalid range specified, offset: " + i10 + ", count: " + i11 + ", max: " + iV1);
        }
        if (sArr.length - i12 >= i11) {
            ShortBuffer shortBufferM = m();
            int iPosition = shortBufferM.position();
            shortBufferM.position(i10);
            shortBufferM.get(sArr, i12, i11);
            shortBufferM.position(iPosition);
            return;
        }
        throw new IllegalArgumentException("not enough room in indices array, has " + sArr.length + " shorts, needs " + i11);
    }

    public void h(int i10, short[] sArr, int i11) {
        g(i10, -1, sArr, i11);
    }

    public void i(short[] sArr) {
        j(sArr, 0);
    }

    public void j(short[] sArr, int i10) {
        h(0, sArr, i10);
    }

    public ShortBuffer m() {
        return this.f94209b.n();
    }

    public int o() {
        return this.f94209b.a1();
    }

    public int q() {
        return this.f94208a.q0();
    }

    public void t1(com.badlogic.gdx.graphics.glutils.j jVar, int[] iArr) {
        this.f94208a.t1(jVar, iArr);
        if (this.f94209b.v1() > 0) {
            this.f94209b.i0();
        }
    }

    public m u(int i10) {
        n attributes = this.f94208a.getAttributes();
        int size = attributes.size();
        for (int i11 = 0; i11 < size; i11++) {
            if (attributes.p(i11).f94824a == i10) {
                return attributes.p(i11);
            }
        }
        return null;
    }

    public int v1() {
        return this.f94209b.v1();
    }

    public n x() {
        return this.f94208a.getAttributes();
    }

    public int y() {
        return this.f94208a.getAttributes().f94833b;
    }

    public float[] z(int i10, int i11, float[] fArr) {
        return A(i10, i11, fArr, 0);
    }
}

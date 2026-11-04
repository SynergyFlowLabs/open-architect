package com.planner5d.library.engine.libgdx.rendering.model.managing;

import androidx.annotation.NonNull;
import com.badlogic.gdx.math.y;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.FloatBuffer;
import java.nio.ShortBuffer;
import java.util.ArrayList;
import java.util.Iterator;
import p9.o;
import p9.p;

/* JADX INFO: loaded from: classes5.dex */
@ij.f
public class j {
    @ij.a
    public j() {
    }

    private void a(float[] fArr, com.badlogic.gdx.graphics.m[] mVarArr) {
        int i10 = 0;
        for (com.badlogic.gdx.graphics.m mVar : mVarArr) {
            if (mVar.f94824a == 16) {
                int i11 = 0;
                for (com.badlogic.gdx.graphics.m mVar2 : mVarArr) {
                    i11 += mVar2.f94825b;
                }
                while (i10 < fArr.length) {
                    int i12 = i10 + 1;
                    fArr[i12] = fArr[i12] + 1.0f;
                    i10 += i11;
                }
                return;
            }
            i10 += mVar.f94825b;
        }
    }

    private com.badlogic.gdx.graphics.m[] b(ByteBuffer byteBuffer) {
        com.badlogic.gdx.utils.b bVar = new com.badlogic.gdx.utils.b();
        int iLimit = byteBuffer.limit();
        int i10 = 0;
        int i11 = 0;
        for (int iPosition = byteBuffer.position(); iPosition < iLimit; iPosition++) {
            switch (byteBuffer.get(iPosition)) {
                case 1:
                    bVar.c(com.badlogic.gdx.graphics.m.f());
                    break;
                case 2:
                    bVar.c(com.badlogic.gdx.graphics.m.e());
                    break;
                case 3:
                    bVar.c(com.badlogic.gdx.graphics.m.d());
                    break;
                case 4:
                    bVar.c(com.badlogic.gdx.graphics.m.c());
                    break;
                case 5:
                    bVar.c(com.badlogic.gdx.graphics.m.g());
                    break;
                case 6:
                    bVar.c(com.badlogic.gdx.graphics.m.a());
                    break;
                case 7:
                    bVar.c(com.badlogic.gdx.graphics.m.h(i10));
                    i10++;
                    break;
                case 8:
                    bVar.c(com.badlogic.gdx.graphics.m.b(i11));
                    i11++;
                    break;
            }
        }
        return (com.badlogic.gdx.graphics.m[]) bVar.Q(com.badlogic.gdx.graphics.m.class);
    }

    private com.badlogic.gdx.graphics.b c(p9.b bVar) {
        if (bVar == null) {
            return null;
        }
        return new com.badlogic.gdx.graphics.b((bVar.g() & 255) / 255.0f, (bVar.f() & 255) / 255.0f, (bVar.d() & 255) / 255.0f, 1.0f);
    }

    private void d(u4.b bVar, p9.h hVar) {
        int iH = hVar.H();
        if (iH <= 0) {
            return;
        }
        bVar.f381124d.n(iH);
        for (int i10 = 0; i10 < iH; i10++) {
            p9.e eVarF = hVar.F(i10);
            l lVar = new l(c(eVarF.T()), eVarF.V(), eVarF.F(), eVarF.c0(), eVarF.b0(), eVarF.J(), eVarF.K(), eVarF.L());
            lVar.f381127a = eVarF.P();
            lVar.f381130d = c(eVarF.H());
            lVar.f381135i = eVarF.S();
            int iA0 = eVarF.a0();
            for (int i11 = 0; i11 < iA0; i11++) {
                p9.m mVarY = eVarF.Y(i11);
                String strZ = mVarY.z();
                if (strZ != null && !strZ.isEmpty()) {
                    u4.j jVar = new u4.j();
                    jVar.f381176a = mVarY.E();
                    jVar.f381177b = strZ;
                    jVar.f381178c = t4.a.b(m(mVarY.L()));
                    jVar.f381179d = t4.a.b(m(mVarY.J()));
                    jVar.f381180e = l(mVarY.I());
                    if (lVar.f381136j == null) {
                        lVar.f381136j = new com.badlogic.gdx.utils.b<>();
                    }
                    lVar.f381136j.c(jVar);
                }
            }
            bVar.f381124d.c(lVar);
        }
    }

    private void e(u4.b bVar, p9.h hVar) {
        int iK = hVar.K();
        if (iK <= 0) {
            return;
        }
        bVar.f381123c.n(iK);
        ArrayList arrayList = new ArrayList();
        for (int i10 = 0; i10 < iK; i10++) {
            p9.f fVarI = hVar.I(i10);
            arrayList.clear();
            for (int i11 = 0; i11 < fVarI.P(); i11++) {
                p9.c cVarN = fVarI.N(i11);
                arrayList.add(new m.a(cVarN.N(), n(cVarN.G()), n(cVarN.A()), m(cVarN.I()), cVarN.D(), cVarN.K(), cVarN.L()));
            }
            m mVar = new m(arrayList.isEmpty() ? null : (m.a[]) arrayList.toArray(new m.a[0]));
            mVar.f381140a = fVarI.K();
            mVar.f381141b = b(fVarI.z());
            FloatBuffer floatBufferAsFloatBuffer = fVarI.Z().asFloatBuffer();
            float[] fArr = new float[floatBufferAsFloatBuffer.limit()];
            mVar.f381142c = fArr;
            floatBufferAsFloatBuffer.get(fArr);
            a(mVar.f381142c, mVar.f381141b);
            com.badlogic.gdx.utils.b bVar2 = new com.badlogic.gdx.utils.b();
            int iS = fVarI.S();
            for (int i12 = 0; i12 < iS; i12++) {
                p9.g gVarQ = fVarI.Q(i12);
                u4.e eVar = new u4.e();
                eVar.f381144a = gVarQ.B();
                eVar.f381146c = j(gVarQ.I());
                ShortBuffer shortBufferAsShortBuffer = gVarQ.F().asShortBuffer();
                short[] sArr = new short[shortBufferAsShortBuffer.limit()];
                eVar.f381145b = sArr;
                shortBufferAsShortBuffer.get(sArr);
                bVar2.c(eVar);
            }
            mVar.f381143d = (u4.e[]) bVar2.Q(u4.e.class);
            bVar.f381123c.c(mVar);
        }
    }

    @NonNull
    private u4.b g(p9.h hVar) {
        u4.b bVar = new u4.b();
        short[] sArr = bVar.f381122b;
        sArr[0] = 0;
        sArr[1] = 1;
        bVar.f381121a = "";
        e(bVar, hVar);
        d(bVar, hVar);
        h(bVar, hVar);
        return bVar;
    }

    private void h(u4.b bVar, p9.h hVar) {
        ArrayList arrayList = new ArrayList();
        int iN = hVar.N();
        for (int i10 = 0; i10 < iN; i10++) {
            p9.i iVarL = hVar.L(i10);
            if (iVarL.K() == null) {
                arrayList.add(i(hVar, iVarL));
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        bVar.f381125e.n(arrayList.size());
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            bVar.f381125e.c((u4.f) it.next());
        }
    }

    private u4.f i(p9.h hVar, p9.i iVar) {
        u4.f fVar = new u4.f();
        fVar.f381147a = iVar.E();
        fVar.f381149c = t4.a.c(n(iVar.W()));
        fVar.f381150d = k(iVar.Q());
        fVar.f381151e = t4.a.c(n(iVar.S()));
        fVar.f381152f = iVar.H();
        int iP = iVar.P();
        if (iP > 0) {
            fVar.f381153g = new u4.i[iP];
            for (int i10 = 0; i10 < iVar.P(); i10++) {
                p9.j jVarN = iVar.N(i10);
                u4.i iVar2 = new u4.i();
                iVar2.f381162b = jVarN.C();
                iVar2.f381161a = jVarN.z();
                fVar.f381153g[i10] = iVar2;
            }
        }
        if (fVar.f381147a != null) {
            ArrayList arrayList = new ArrayList();
            int iN = hVar.N();
            for (int i11 = 0; i11 < iN; i11++) {
                p9.i iVarL = hVar.L(i11);
                if (fVar.f381147a.equals(iVarL.K())) {
                    arrayList.add(i(hVar, iVarL));
                }
            }
            fVar.f381154h = (u4.f[]) arrayList.toArray(new u4.f[0]);
        }
        return fVar;
    }

    private int j(byte b10) {
        if (b10 == 2) {
            return 1;
        }
        if (b10 == 3) {
            return 0;
        }
        int i10 = 5 | 5;
        if (b10 != 4) {
            return b10 != 5 ? 4 : 3;
        }
        return 5;
    }

    private y k(p9.l lVar) {
        if (lVar == null) {
            return null;
        }
        return new y(lVar.f(), lVar.g(), lVar.h(), lVar.e());
    }

    private int l(byte b10) {
        switch (b10) {
            case 1:
                return 4;
            case 2:
                return 8;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 1;
            case 6:
                return 7;
            case 7:
                return 10;
            case 8:
                return 6;
            case 9:
                return 5;
            case 10:
                return 9;
            default:
                return 0;
        }
    }

    private com.planner5d.library.math.k m(o oVar) {
        if (oVar == null) {
            return null;
        }
        return new com.planner5d.library.math.k(oVar.e(), oVar.f());
    }

    private com.planner5d.library.math.m n(p pVar) {
        if (pVar == null) {
            return null;
        }
        return new com.planner5d.library.math.m(pVar.e(), pVar.f(), pVar.g());
    }

    @NonNull
    public u4.b f(@NonNull InputStream inputStream) throws Throwable {
        return g(p9.h.D(ByteBuffer.wrap(org.apache.commons.io.p.o0(inputStream))));
    }
}

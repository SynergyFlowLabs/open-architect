package androidx.constraintlayout.core.state;

import androidx.annotation.NonNull;
import androidx.annotation.b1;
import io.ktor.http.t1;
import java.lang.reflect.Array;

/* JADX INFO: loaded from: classes2.dex */
public class u {
    private static int a(String str, String... strArr) {
        for (int i10 = 0; i10 < strArr.length; i10++) {
            if (strArr[i10].equals(str)) {
                return i10;
            }
        }
        return 0;
    }

    private static void b(androidx.constraintlayout.core.motion.utils.u uVar, int i10, String str, String... strArr) {
        for (int i11 = 0; i11 < strArr.length; i11++) {
            if (strArr[i11].equals(str)) {
                uVar.b(i10, i11);
            }
        }
    }

    @b1({b1.a.LIBRARY_GROUP})
    public static void c(@NonNull androidx.constraintlayout.core.parser.f fVar, @NonNull t tVar) throws androidx.constraintlayout.core.parser.h {
        tVar.b0();
        String strP0 = fVar.p0(androidx.constraintlayout.core.motion.utils.v.h.f44104e);
        androidx.constraintlayout.core.motion.utils.u uVar = new androidx.constraintlayout.core.motion.utils.u();
        boolean z10 = true;
        boolean z11 = false;
        if (strP0 != null) {
            switch (strP0) {
                case "startVertical":
                    uVar.b(509, 1);
                    break;
                case "startHorizontal":
                    uVar.b(509, 2);
                    break;
                case "flip":
                    uVar.b(509, 3);
                    break;
                case "none":
                    uVar.b(509, 0);
                    break;
                case "above":
                    uVar.b(509, 5);
                    break;
                case "below":
                    uVar.b(509, 4);
                    break;
            }
            z11 = true;
        }
        String strP1 = fVar.p0("interpolator");
        if (strP1 != null) {
            uVar.c(androidx.constraintlayout.core.motion.utils.v.h.f44114o, strP1);
            z11 = true;
        }
        float fZ = fVar.Z(androidx.constraintlayout.core.motion.utils.v.h.f44107h);
        if (Float.isNaN(fZ)) {
            z10 = z11;
        } else {
            uVar.a(androidx.constraintlayout.core.motion.utils.v.h.f44115p, fZ);
        }
        if (z10) {
            tVar.d0(uVar);
        }
        androidx.constraintlayout.core.parser.f fVarE0 = fVar.e0("onSwipe");
        if (fVarE0 != null) {
            i(fVarE0, tVar);
        }
        g(fVar, tVar);
    }

    @Deprecated
    public static void d(androidx.constraintlayout.core.parser.f fVar, t tVar, d dVar) throws androidx.constraintlayout.core.parser.h {
        c(fVar, tVar);
    }

    private static void e(androidx.constraintlayout.core.parser.f fVar, t tVar) throws androidx.constraintlayout.core.parser.h {
        androidx.constraintlayout.core.parser.a aVarV;
        androidx.constraintlayout.core.motion.b[][] bVarArr;
        androidx.constraintlayout.core.parser.f fVar2;
        String[] strArr;
        androidx.constraintlayout.core.parser.a aVarV2 = fVar.V(androidx.constraintlayout.core.motion.utils.v.a.M);
        if (aVarV2 == null || (aVarV = fVar.V("frames")) == null) {
            return;
        }
        String strP0 = fVar.p0("transitionEasing");
        String[] strArr2 = {"scaleX", "scaleY", "translationX", "translationY", "translationZ", "rotationX", "rotationY", "rotationZ", "alpha"};
        int[] iArr = {311, 312, 304, 305, 306, 308, 309, 310, 303};
        boolean[] zArr = {false, false, true, true, true, false, false, false, false};
        int size = aVarV.size();
        androidx.constraintlayout.core.motion.utils.u[] uVarArr = new androidx.constraintlayout.core.motion.utils.u[size];
        for (int i10 = 0; i10 < aVarV.size(); i10++) {
            uVarArr[i10] = new androidx.constraintlayout.core.motion.utils.u();
        }
        int i11 = 0;
        for (int i12 = 9; i11 < i12; i12 = 9) {
            String str = strArr2[i11];
            int i13 = iArr[i11];
            boolean z10 = zArr[i11];
            androidx.constraintlayout.core.parser.a aVarV3 = fVar.V(str);
            if (aVarV3 != null && aVarV3.size() != size) {
                throw new androidx.constraintlayout.core.parser.h("incorrect size for " + str + " array, not matching targets array!", fVar);
            }
            if (aVarV3 != null) {
                int i14 = 0;
                while (i14 < size) {
                    float fA = aVarV3.getFloat(i14);
                    String[] strArr3 = strArr2;
                    if (z10) {
                        fA = tVar.f44404r.a(fA);
                    }
                    uVarArr[i14].a(i13, fA);
                    i14++;
                    strArr2 = strArr3;
                }
                strArr = strArr2;
            } else {
                strArr = strArr2;
                float fZ = fVar.Z(str);
                if (!Float.isNaN(fZ)) {
                    if (z10) {
                        fZ = tVar.f44404r.a(fZ);
                    }
                    for (int i15 = 0; i15 < size; i15++) {
                        uVarArr[i15].a(i13, fZ);
                    }
                }
            }
            i11++;
            strArr2 = strArr;
        }
        int i16 = 0;
        androidx.constraintlayout.core.parser.c cVarI0 = fVar.i0(cj.h.L);
        if (cVarI0 == null || !(cVarI0 instanceof androidx.constraintlayout.core.parser.f)) {
            bVarArr = null;
        } else {
            androidx.constraintlayout.core.parser.f fVar3 = (androidx.constraintlayout.core.parser.f) cVarI0;
            int size2 = fVar3.size();
            bVarArr = (androidx.constraintlayout.core.motion.b[][]) Array.newInstance((Class<?>) androidx.constraintlayout.core.motion.b.class, aVarV.size(), size2);
            int i17 = 0;
            while (i17 < size2) {
                androidx.constraintlayout.core.parser.d dVar = (androidx.constraintlayout.core.parser.d) fVar3.P(i17);
                String strK = dVar.k();
                if (dVar.D0() instanceof androidx.constraintlayout.core.parser.a) {
                    androidx.constraintlayout.core.parser.a aVar = (androidx.constraintlayout.core.parser.a) dVar.D0();
                    int size3 = aVar.size();
                    if (size3 != size || size3 <= 0) {
                        fVar2 = fVar3;
                    } else {
                        int i18 = i16;
                        if (aVar.P(i18) instanceof androidx.constraintlayout.core.parser.e) {
                            int i19 = i18;
                            while (i19 < size) {
                                bVarArr[i19][i17] = new androidx.constraintlayout.core.motion.b(strK, 901, aVar.P(i19).r());
                                i19++;
                                fVar3 = fVar3;
                            }
                            fVar2 = fVar3;
                        } else {
                            fVar2 = fVar3;
                            for (int i20 = 0; i20 < size; i20++) {
                                long jH = b.h(aVar.P(i20).k());
                                if (jH != -1) {
                                    bVarArr[i20][i17] = new androidx.constraintlayout.core.motion.b(strK, 902, (int) jH);
                                }
                            }
                        }
                    }
                } else {
                    fVar2 = fVar3;
                    androidx.constraintlayout.core.parser.c cVarD0 = dVar.D0();
                    if (cVarD0 instanceof androidx.constraintlayout.core.parser.e) {
                        float fR = cVarD0.r();
                        for (int i21 = 0; i21 < size; i21++) {
                            bVarArr[i21][i17] = new androidx.constraintlayout.core.motion.b(strK, 901, fR);
                        }
                    } else {
                        long jH2 = b.h(cVarD0.k());
                        if (jH2 != -1) {
                            int i22 = 0;
                            while (i22 < size) {
                                bVarArr[i22][i17] = new androidx.constraintlayout.core.motion.b(strK, 902, (int) jH2);
                                i22++;
                                size2 = size2;
                                jH2 = jH2;
                            }
                        }
                    }
                }
                i17++;
                size2 = size2;
                fVar3 = fVar2;
                i16 = 0;
            }
        }
        String strP1 = fVar.p0("curveFit");
        for (int i23 = 0; i23 < aVarV2.size(); i23++) {
            for (int i24 = 0; i24 < size; i24++) {
                String strL0 = aVarV2.l0(i23);
                androidx.constraintlayout.core.motion.utils.u uVar = uVarArr[i24];
                if (strP1 != null) {
                    uVar.b(androidx.constraintlayout.core.motion.utils.v.g.f44096p, a(strP1, "spline", "linear"));
                }
                uVar.e(501, strP0);
                uVar.b(100, aVarV.getInt(i24));
                tVar.q(strL0, uVar, bVarArr != null ? bVarArr[i24] : null);
            }
        }
    }

    private static void f(androidx.constraintlayout.core.parser.f fVar, t tVar) throws androidx.constraintlayout.core.parser.h {
        int[] iArr;
        androidx.constraintlayout.core.parser.a aVarT = fVar.T(androidx.constraintlayout.core.motion.utils.v.a.M);
        androidx.constraintlayout.core.parser.a aVarT2 = fVar.T("frames");
        String strP0 = fVar.p0("transitionEasing");
        String[] strArr = {"scaleX", "scaleY", "translationX", "translationY", "translationZ", "rotationX", "rotationY", "rotationZ", "alpha", androidx.constraintlayout.core.motion.utils.v.c.Q, androidx.constraintlayout.core.motion.utils.v.c.R, androidx.constraintlayout.core.motion.utils.v.c.S};
        int[] iArr2 = {311, 312, 304, 305, 306, 308, 309, 310, 403, androidx.constraintlayout.core.motion.utils.v.c.f44020u, androidx.constraintlayout.core.motion.utils.v.c.f44021v, androidx.constraintlayout.core.motion.utils.v.c.f44022w};
        int[] iArr3 = {0, 0, 1, 1, 1, 0, 0, 0, 0, 0, 2, 0};
        int size = aVarT2.size();
        androidx.constraintlayout.core.motion.utils.u[] uVarArr = new androidx.constraintlayout.core.motion.utils.u[size];
        for (int i10 = 0; i10 < size; i10++) {
            uVarArr[i10] = new androidx.constraintlayout.core.motion.utils.u();
        }
        boolean z10 = false;
        for (int i11 = 0; i11 < 12; i11++) {
            if (fVar.q0(strArr[i11]) && iArr3[i11] == 1) {
                z10 = true;
            }
        }
        int i12 = 0;
        for (int i13 = 12; i12 < i13; i13 = 12) {
            String str = strArr[i12];
            int i14 = iArr2[i12];
            int i15 = iArr3[i12];
            androidx.constraintlayout.core.parser.a aVarV = fVar.V(str);
            String[] strArr2 = strArr;
            if (aVarV != null && aVarV.size() != size) {
                throw new androidx.constraintlayout.core.parser.h("incorrect size for $attrName array, not matching targets array!", fVar);
            }
            if (aVarV != null) {
                int i16 = 0;
                while (i16 < size) {
                    float fA = aVarV.getFloat(i16);
                    int[] iArr4 = iArr2;
                    if (i15 == 1) {
                        fA = tVar.f44404r.a(fA);
                    } else if (i15 == 2 && z10) {
                        fA = tVar.f44404r.a(fA);
                    }
                    uVarArr[i16].a(i14, fA);
                    i16++;
                    iArr2 = iArr4;
                }
                iArr = iArr2;
            } else {
                iArr = iArr2;
                float fZ = fVar.Z(str);
                if (!Float.isNaN(fZ)) {
                    if (i15 == 1) {
                        fZ = tVar.f44404r.a(fZ);
                    } else if (i15 == 2 && z10) {
                        fZ = tVar.f44404r.a(fZ);
                    }
                    for (int i17 = 0; i17 < size; i17++) {
                        uVarArr[i17].a(i14, fZ);
                    }
                }
            }
            i12++;
            strArr = strArr2;
            iArr2 = iArr;
        }
        String strP1 = fVar.p0("curveFit");
        String strP2 = fVar.p0("easing");
        String strP3 = fVar.p0("waveShape");
        String strP4 = fVar.p0(androidx.constraintlayout.core.motion.utils.v.c.P);
        for (int i18 = 0; i18 < aVarT.size(); i18++) {
            for (int i19 = 0; i19 < size; i19++) {
                String strL0 = aVarT.l0(i18);
                androidx.constraintlayout.core.motion.utils.u uVar = uVarArr[i19];
                if (strP1 != null) {
                    if (strP1.equals("linear")) {
                        uVar.b(401, 1);
                    } else if (strP1.equals("spline")) {
                        uVar.b(401, 0);
                    }
                }
                uVar.e(501, strP0);
                if (strP2 != null) {
                    uVar.c(androidx.constraintlayout.core.motion.utils.v.c.f44017r, strP2);
                }
                if (strP3 != null) {
                    uVar.c(421, strP3);
                }
                if (strP4 != null) {
                    uVar.c(422, strP4);
                }
                uVar.b(100, aVarT2.getInt(i19));
                tVar.r(strL0, uVar);
            }
        }
    }

    public static void g(androidx.constraintlayout.core.parser.f fVar, t tVar) throws androidx.constraintlayout.core.parser.h {
        androidx.constraintlayout.core.parser.f fVarE0 = fVar.e0("KeyFrames");
        if (fVarE0 == null) {
            return;
        }
        androidx.constraintlayout.core.parser.a aVarV = fVarE0.V("KeyPositions");
        if (aVarV != null) {
            for (int i10 = 0; i10 < aVarV.size(); i10++) {
                androidx.constraintlayout.core.parser.c cVarP = aVarV.P(i10);
                if (cVarP instanceof androidx.constraintlayout.core.parser.f) {
                    h((androidx.constraintlayout.core.parser.f) cVarP, tVar);
                }
            }
        }
        androidx.constraintlayout.core.parser.a aVarV2 = fVarE0.V(androidx.constraintlayout.core.motion.utils.v.a.f43958a);
        if (aVarV2 != null) {
            for (int i11 = 0; i11 < aVarV2.size(); i11++) {
                androidx.constraintlayout.core.parser.c cVarP2 = aVarV2.P(i11);
                if (cVarP2 instanceof androidx.constraintlayout.core.parser.f) {
                    e((androidx.constraintlayout.core.parser.f) cVarP2, tVar);
                }
            }
        }
        androidx.constraintlayout.core.parser.a aVarV3 = fVarE0.V("KeyCycles");
        if (aVarV3 != null) {
            for (int i12 = 0; i12 < aVarV3.size(); i12++) {
                androidx.constraintlayout.core.parser.c cVarP3 = aVarV3.P(i12);
                if (cVarP3 instanceof androidx.constraintlayout.core.parser.f) {
                    f((androidx.constraintlayout.core.parser.f) cVarP3, tVar);
                }
            }
        }
    }

    private static void h(androidx.constraintlayout.core.parser.f fVar, t tVar) throws androidx.constraintlayout.core.parser.h {
        androidx.constraintlayout.core.motion.utils.u uVar = new androidx.constraintlayout.core.motion.utils.u();
        androidx.constraintlayout.core.parser.a aVarT = fVar.T(androidx.constraintlayout.core.motion.utils.v.a.M);
        androidx.constraintlayout.core.parser.a aVarT2 = fVar.T("frames");
        androidx.constraintlayout.core.parser.a aVarV = fVar.V("percentX");
        androidx.constraintlayout.core.parser.a aVarV2 = fVar.V("percentY");
        androidx.constraintlayout.core.parser.a aVarV3 = fVar.V("percentWidth");
        androidx.constraintlayout.core.parser.a aVarV4 = fVar.V("percentHeight");
        String strP0 = fVar.p0(androidx.constraintlayout.core.motion.utils.v.h.f44104e);
        String strP1 = fVar.p0("transitionEasing");
        String strP2 = fVar.p0("curveFit");
        String strP3 = fVar.p0("type");
        if (strP3 == null) {
            strP3 = "parentRelative";
        }
        if (aVarV == null || aVarT2.size() == aVarV.size()) {
            if (aVarV2 == null || aVarT2.size() == aVarV2.size()) {
                int i10 = 0;
                while (i10 < aVarT.size()) {
                    String strL0 = aVarT.l0(i10);
                    int iA = a(strP3, "deltaRelative", "pathRelative", "parentRelative");
                    uVar.h();
                    uVar.b(androidx.constraintlayout.core.motion.utils.v.g.f44098r, iA);
                    if (strP2 != null) {
                        b(uVar, androidx.constraintlayout.core.motion.utils.v.g.f44096p, strP2, "spline", "linear");
                    }
                    uVar.e(501, strP1);
                    if (strP0 != null) {
                        b(uVar, 509, strP0, "none", "startVertical", "startHorizontal", "flip", "below", "above");
                    }
                    int i11 = 0;
                    while (i11 < aVarT2.size()) {
                        uVar.b(100, aVarT2.getInt(i11));
                        j(uVar, 506, aVarV, i11);
                        j(uVar, androidx.constraintlayout.core.motion.utils.v.g.f44095o, aVarV2, i11);
                        j(uVar, 503, aVarV3, i11);
                        j(uVar, 504, aVarV4, i11);
                        tVar.t(strL0, uVar);
                        i11++;
                        strP3 = strP3;
                    }
                    i10++;
                    strP3 = strP3;
                }
            }
        }
    }

    private static void i(androidx.constraintlayout.core.parser.b bVar, t tVar) {
        String strP0 = bVar.p0(t1.a.f296107c);
        int iA = a(bVar.p0("side"), t.b.B);
        int iA2 = a(bVar.p0("direction"), t.b.L);
        float fZ = bVar.Z("scale");
        float fZ2 = bVar.Z("threshold");
        float fZ3 = bVar.Z("maxVelocity");
        float fZ4 = bVar.Z("maxAccel");
        String strP1 = bVar.p0("limitBounds");
        int iA3 = a(bVar.p0("mode"), t.b.O);
        int iA4 = a(bVar.p0("touchUp"), t.b.X);
        float fZ5 = bVar.Z("springMass");
        float fZ6 = bVar.Z("springStiffness");
        float fZ7 = bVar.Z("springDamping");
        float fZ8 = bVar.Z("stopThreshold");
        int iA5 = a(bVar.p0("springBoundary"), t.b.f44419c0);
        String strP2 = bVar.p0("around");
        t.b bVarY = tVar.y();
        bVarY.i(strP0);
        bVarY.j(iA);
        bVarY.l(iA2);
        bVarY.m(fZ);
        bVarY.n(fZ2);
        bVarY.q(fZ3);
        bVarY.p(fZ4);
        bVarY.o(strP1);
        bVarY.k(iA3);
        bVarY.r(iA4);
        bVarY.v(fZ5);
        bVarY.w(fZ6);
        bVarY.u(fZ7);
        bVarY.x(fZ8);
        bVarY.t(iA5);
        bVarY.s(strP2);
    }

    private static void j(androidx.constraintlayout.core.motion.utils.u uVar, int i10, androidx.constraintlayout.core.parser.a aVar, int i11) throws androidx.constraintlayout.core.parser.h {
        if (aVar != null) {
            uVar.a(i10, aVar.getFloat(i11));
        }
    }
}

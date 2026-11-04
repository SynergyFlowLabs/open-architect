package androidx.compose.ui.graphics.vector;

import androidx.compose.ui.graphics.k2;
import java.util.List;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlin.k0;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nPathParser.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PathParser.kt\nandroidx/compose/ui/graphics/vector/PathParserKt\n+ 2 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n*L\n1#1,546:1\n545#1:552\n35#2,5:547\n*S KotlinDebug\n*F\n+ 1 PathParser.kt\nandroidx/compose/ui/graphics/vector/PathParserKt\n*L\n405#1:552\n207#1:547,5\n*E\n"})
public final class k {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final float[] f38513a = new float[0];

    private static final void a(k2 k2Var, double d10, double d11, double d12, double d13, double d14, double d15, double d16, double d17, double d18) {
        double d19 = 4;
        int iCeil = (int) Math.ceil(Math.abs((d18 * d19) / 3.141592653589793d));
        double dCos = Math.cos(d16);
        double dSin = Math.sin(d16);
        double dCos2 = Math.cos(d17);
        double dSin2 = Math.sin(d17);
        double d20 = -d12;
        double d21 = d20 * dCos;
        double d22 = d13 * dSin;
        double d23 = (d21 * dSin2) - (d22 * dCos2);
        double d24 = d20 * dSin;
        double d25 = d13 * dCos;
        double d26 = (dSin2 * d24) + (dCos2 * d25);
        double d27 = d18 / ((double) iCeil);
        double d28 = d26;
        double d29 = d23;
        int i10 = 0;
        double d30 = d14;
        double d31 = d15;
        double d32 = d17;
        while (i10 < iCeil) {
            double d33 = d32 + d27;
            double dSin3 = Math.sin(d33);
            double dCos3 = Math.cos(d33);
            int i11 = i10;
            double d34 = (d10 + ((d12 * dCos) * dCos3)) - (d22 * dSin3);
            double d35 = d19;
            double d36 = d11 + (d12 * dSin * dCos3) + (d25 * dSin3);
            double d37 = (d21 * dSin3) - (d22 * dCos3);
            double d38 = (dSin3 * d24) + (dCos3 * d25);
            double d39 = d33 - d32;
            int i12 = iCeil;
            double dTan = Math.tan(d39 / ((double) 2));
            double dSin4 = (Math.sin(d39) * (Math.sqrt(d35 + ((3.0d * dTan) * dTan)) - ((double) 1))) / ((double) 3);
            k2Var.V((float) (d30 + (d29 * dSin4)), (float) (d31 + (d28 * dSin4)), (float) (d34 - (dSin4 * d37)), (float) (d36 - (dSin4 * d38)), (float) d34, (float) d36);
            dSin = dSin;
            d27 = d27;
            d30 = d34;
            d31 = d36;
            i10 = i11 + 1;
            d32 = d33;
            d28 = d38;
            iCeil = i12;
            d29 = d37;
            dCos = dCos;
            d19 = d35;
        }
    }

    private static final void b(k2 k2Var, double d10, double d11, double d12, double d13, double d14, double d15, double d16, boolean z10, boolean z11) {
        double d17;
        double d18;
        double d19 = (d16 / ((double) 180)) * 3.141592653589793d;
        double dCos = Math.cos(d19);
        double dSin = Math.sin(d19);
        double d20 = ((d10 * dCos) + (d11 * dSin)) / d14;
        double d21 = (((-d10) * dSin) + (d11 * dCos)) / d15;
        double d22 = ((d12 * dCos) + (d13 * dSin)) / d14;
        double d23 = (((-d12) * dSin) + (d13 * dCos)) / d15;
        double d24 = d20 - d22;
        double d25 = d21 - d23;
        double d26 = 2;
        double d27 = (d20 + d22) / d26;
        double d28 = (d21 + d23) / d26;
        double d29 = (d24 * d24) + (d25 * d25);
        if (d29 == 0.0d) {
            return;
        }
        double d30 = (1.0d / d29) - 0.25d;
        if (d30 < 0.0d) {
            double dSqrt = (float) (Math.sqrt(d29) / 1.99999d);
            b(k2Var, d10, d11, d12, d13, d14 * dSqrt, d15 * dSqrt, d16, z10, z11);
            return;
        }
        double dSqrt2 = Math.sqrt(d30);
        double d31 = d24 * dSqrt2;
        double d32 = dSqrt2 * d25;
        if (z10 == z11) {
            d17 = d27 - d32;
            d18 = d28 + d31;
        } else {
            d17 = d27 + d32;
            d18 = d28 - d31;
        }
        double dAtan2 = Math.atan2(d21 - d18, d20 - d17);
        double dAtan3 = Math.atan2(d23 - d18, d22 - d17) - dAtan2;
        if (z11 != (dAtan3 >= 0.0d)) {
            dAtan3 = dAtan3 > 0.0d ? dAtan3 - 6.283185307179586d : dAtan3 + 6.283185307179586d;
        }
        double d33 = d17 * d14;
        double d34 = d18 * d15;
        a(k2Var, (d33 * dCos) - (d34 * dSin), (d33 * dSin) + (d34 * dCos), d14, d15, d10, d11, d19, dAtan2, dAtan3);
    }

    @NotNull
    public static final float[] c() {
        return f38513a;
    }

    @NotNull
    public static final k2 d(@NotNull List<? extends h> list, @NotNull k2 k2Var) {
        float f10;
        float f11;
        float fI;
        float fJ;
        float fL;
        float fL2;
        float f12;
        float f13;
        float fI2;
        float fK;
        float fL3;
        List<? extends h> list2 = list;
        k2 k2Var2 = k2Var;
        int iX = k2Var2.x();
        k2Var2.P();
        k2Var2.M(iX);
        h hVar = list2.isEmpty() ? h.b.f38433c : list2.get(0);
        int size = list2.size();
        float f14 = 0.0f;
        int i10 = 0;
        float fL4 = 0.0f;
        float fM = 0.0f;
        float fG = 0.0f;
        float fH = 0.0f;
        float f15 = 0.0f;
        float f16 = 0.0f;
        while (i10 < size) {
            h hVar2 = list2.get(i10);
            if (hVar2 instanceof h.b) {
                k2Var2.close();
                size = size;
                f14 = f14;
                hVar2 = hVar2;
                fL4 = f15;
                fG = fL4;
                fM = f16;
            } else {
                if (hVar2 instanceof h.n) {
                    h.n nVar = (h.n) hVar2;
                    fG += nVar.g();
                    fH += nVar.h();
                    k2Var2.e(nVar.g(), nVar.h());
                    f15 = fG;
                    f16 = fH;
                } else if (hVar2 instanceof h.f) {
                    h.f fVar = (h.f) hVar2;
                    float fG2 = fVar.g();
                    float fH2 = fVar.h();
                    k2Var2.A(fVar.g(), fVar.h());
                    fG = fG2;
                    f15 = fG;
                    fH = fH2;
                    f16 = fH;
                } else {
                    if (hVar2 instanceof h.m) {
                        h.m mVar = (h.m) hVar2;
                        k2Var2.Y(mVar.g(), mVar.h());
                        fG += mVar.g();
                        fL2 = mVar.h();
                    } else {
                        if (hVar2 instanceof h.e) {
                            h.e eVar = (h.e) hVar2;
                            k2Var2.F(eVar.g(), eVar.h());
                            fJ = eVar.g();
                            fL = eVar.h();
                        } else if (hVar2 instanceof h.l) {
                            h.l lVar = (h.l) hVar2;
                            k2Var2.Y(lVar.f(), f14);
                            fG += lVar.f();
                        } else if (hVar2 instanceof h.d) {
                            h.d dVar = (h.d) hVar2;
                            k2Var2.F(dVar.f(), fH);
                            fG = dVar.f();
                        } else if (hVar2 instanceof h.r) {
                            h.r rVar = (h.r) hVar2;
                            k2Var2.Y(f14, rVar.f());
                            fL2 = rVar.f();
                        } else if (hVar2 instanceof h.s) {
                            h.s sVar = (h.s) hVar2;
                            k2Var2.F(fG, sVar.f());
                            fH = sVar.f();
                        } else {
                            if (hVar2 instanceof h.k) {
                                h.k kVar = (h.k) hVar2;
                                k2Var2.f(kVar.k(), kVar.n(), kVar.l(), kVar.o(), kVar.m(), kVar.p());
                                fI2 = kVar.l() + fG;
                                fK = kVar.o() + fH;
                                fG += kVar.m();
                                fL3 = kVar.p();
                            } else {
                                if (hVar2 instanceof h.c) {
                                    h.c cVar = (h.c) hVar2;
                                    k2Var.V(cVar.k(), cVar.n(), cVar.l(), cVar.o(), cVar.m(), cVar.p());
                                    float fL5 = cVar.l();
                                    float fO = cVar.o();
                                    float fM2 = cVar.m();
                                    float fP = cVar.p();
                                    fG = fM2;
                                    fH = fP;
                                    size = size;
                                    f14 = f14;
                                    i10 = i10;
                                    hVar2 = hVar2;
                                    fL4 = fL5;
                                    fM = fO;
                                } else if (hVar2 instanceof h.p) {
                                    if (hVar.a()) {
                                        float f17 = fG - fL4;
                                        f13 = fH - fM;
                                        f12 = f17;
                                    } else {
                                        f12 = f14;
                                        f13 = f12;
                                    }
                                    h.p pVar = (h.p) hVar2;
                                    k2Var.f(f12, f13, pVar.i(), pVar.k(), pVar.j(), pVar.l());
                                    fI2 = pVar.i() + fG;
                                    fK = pVar.k() + fH;
                                    fG += pVar.j();
                                    fL3 = pVar.l();
                                } else {
                                    if (hVar2 instanceof h.C0293h) {
                                        if (hVar.a()) {
                                            float f18 = 2;
                                            fG = (fG * f18) - fL4;
                                            fH = (f18 * fH) - fM;
                                        }
                                        h.C0293h c0293h = (h.C0293h) hVar2;
                                        k2Var.V(fG, fH, c0293h.i(), c0293h.k(), c0293h.j(), c0293h.l());
                                        fI = c0293h.i();
                                        float fK2 = c0293h.k();
                                        float fJ2 = c0293h.j();
                                        float fL6 = c0293h.l();
                                        fG = fJ2;
                                        fH = fL6;
                                        fM = fK2;
                                    } else if (hVar2 instanceof h.o) {
                                        h.o oVar = (h.o) hVar2;
                                        k2Var.r(oVar.i(), oVar.k(), oVar.j(), oVar.l());
                                        fL4 = oVar.i() + fG;
                                        fM = oVar.k() + fH;
                                        fG += oVar.j();
                                        fL2 = oVar.l();
                                    } else if (hVar2 instanceof h.g) {
                                        h.g gVar = (h.g) hVar2;
                                        k2Var.N(gVar.i(), gVar.k(), gVar.j(), gVar.l());
                                        fL4 = gVar.i();
                                        fM = gVar.k();
                                        fJ = gVar.j();
                                        fL = gVar.l();
                                    } else if (hVar2 instanceof h.q) {
                                        if (hVar.b()) {
                                            f10 = fG - fL4;
                                            f11 = fH - fM;
                                        } else {
                                            f10 = f14;
                                            f11 = f10;
                                        }
                                        h.q qVar = (h.q) hVar2;
                                        k2Var.r(f10, f11, qVar.g(), qVar.h());
                                        fI = f10 + fG;
                                        float f19 = f11 + fH;
                                        fG += qVar.g();
                                        fH += qVar.h();
                                        fM = f19;
                                    } else if (hVar2 instanceof h.i) {
                                        if (hVar.b()) {
                                            float f20 = 2;
                                            fG = (fG * f20) - fL4;
                                            fH = (f20 * fH) - fM;
                                        }
                                        h.i iVar = (h.i) hVar2;
                                        k2Var.N(fG, fH, iVar.g(), iVar.h());
                                        float f21 = fG;
                                        fG = iVar.g();
                                        fL4 = f21;
                                        size = size;
                                        f14 = f14;
                                        i10 = i10;
                                        fM = fH;
                                        hVar2 = hVar2;
                                        fH = iVar.h();
                                    } else if (hVar2 instanceof h.j) {
                                        h.j jVar = (h.j) hVar2;
                                        float fL7 = jVar.l() + fG;
                                        float fM3 = jVar.m() + fH;
                                        f14 = f14;
                                        hVar2 = hVar2;
                                        size = size;
                                        b(k2Var, fG, fH, fL7, fM3, jVar.n(), jVar.p(), jVar.o(), jVar.q(), jVar.r());
                                        fL4 = fL7;
                                        fG = fL4;
                                        fM = fM3;
                                    } else {
                                        size = size;
                                        f14 = f14;
                                        hVar2 = hVar2;
                                        if (!(hVar2 instanceof h.a)) {
                                            throw new k0();
                                        }
                                        h.a aVar = (h.a) hVar2;
                                        b(k2Var, fG, fH, aVar.l(), aVar.m(), aVar.n(), aVar.p(), aVar.o(), aVar.q(), aVar.r());
                                        fL4 = aVar.l();
                                        fG = fL4;
                                        fM = aVar.m();
                                    }
                                    fL4 = fI;
                                }
                                i10++;
                                k2Var2 = k2Var;
                                hVar = hVar2;
                                size = size;
                                f14 = f14;
                                list2 = list;
                            }
                            fH += fL3;
                            fL4 = fI2;
                            fM = fK;
                        }
                        fH = fL;
                        fG = fJ;
                    }
                    fH += fL2;
                }
                hVar2 = hVar2;
                i10++;
                k2Var2 = k2Var;
                hVar = hVar2;
                size = size;
                f14 = f14;
                list2 = list;
            }
            fH = fM;
            i10++;
            k2Var2 = k2Var;
            hVar = hVar2;
            size = size;
            f14 = f14;
            list2 = list;
        }
        return k2Var;
    }

    public static /* synthetic */ k2 e(List list, k2 k2Var, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            k2Var = androidx.compose.ui.graphics.u.a();
        }
        return d(list, k2Var);
    }

    private static final double f(double d10) {
        return (d10 / ((double) 180)) * 3.141592653589793d;
    }
}

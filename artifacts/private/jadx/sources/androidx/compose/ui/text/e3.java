package androidx.compose.ui.text;

import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes2.dex */
@SourceDebugExtension({"SMAP\nSpanStyle.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SpanStyle.kt\nandroidx/compose/ui/text/SpanStyleKt\n+ 2 TextUnit.kt\nandroidx/compose/ui/unit/TextUnitKt\n+ 3 Color.kt\nandroidx/compose/ui/graphics/ColorKt\n*L\n1#1,901:1\n252#2:902\n252#2:903\n252#2:904\n247#2,6:907\n247#2,6:914\n252#2:921\n252#2:922\n646#3:905\n635#3:906\n635#3:913\n635#3:920\n646#3:923\n635#3:924\n*S KotlinDebug\n*F\n+ 1 SpanStyle.kt\nandroidx/compose/ui/text/SpanStyleKt\n*L\n713#1:902\n786#1:903\n793#1:904\n837#1:907,6\n843#1:914,6\n874#1:921\n880#1:922\n801#1:905\n801#1:906\n838#1:913\n854#1:920\n888#1:923\n888#1:924\n*E\n"})
public final class e3 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final long f41508a = androidx.compose.ui.unit.a0.m(14);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final long f41509b = androidx.compose.ui.unit.a0.m(0);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final long f41510c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final long f41511d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.ui.text.style.p f41512e;

    static {
        androidx.compose.ui.graphics.q0.a aVar = androidx.compose.ui.graphics.q0.f38131b;
        f41510c = aVar.s();
        long jA = aVar.a();
        f41511d = jA;
        f41512e = androidx.compose.ui.text.style.p.f42231a.b(jA);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x018f  */
    /* JADX WARN: Code duplicated, block: B:102:0x0193  */
    /* JADX WARN: Code duplicated, block: B:105:0x019f  */
    /* JADX WARN: Code duplicated, block: B:106:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:108:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:110:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:112:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:113:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:117:0x01c2  */
    /* JADX WARN: Code duplicated, block: B:119:0x01c8  */
    /* JADX WARN: Code duplicated, block: B:11:0x0040 A[PHI: r11
      0x0040: PHI (r11v7 long) = 
      (r11v1 long)
      (r11v1 long)
      (r11v1 long)
      (r11v1 long)
      (r11v1 long)
      (r11v1 long)
      (r11v1 long)
      (r11v1 long)
      (r11v1 long)
      (r11v1 long)
      (r11v1 long)
      (r11v8 long)
     binds: [B:41:0x00b3, B:53:0x00e5, B:50:0x00d9, B:47:0x00cd, B:44:0x00c1, B:39:0x00a5, B:34:0x0096, B:28:0x007c, B:25:0x0074, B:22:0x0068, B:19:0x005c, B:9:0x003d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:121:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:124:0x01de  */
    /* JADX WARN: Code duplicated, block: B:125:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:83:0x0148  */
    /* JADX WARN: Code duplicated, block: B:84:0x0153  */
    /* JADX WARN: Code duplicated, block: B:87:0x0163  */
    /* JADX WARN: Code duplicated, block: B:88:0x0168  */
    /* JADX WARN: Code duplicated, block: B:91:0x0172  */
    /* JADX WARN: Code duplicated, block: B:93:0x0178  */
    /* JADX WARN: Code duplicated, block: B:94:0x017d  */
    /* JADX WARN: Code duplicated, block: B:96:0x0181  */
    /* JADX WARN: Code duplicated, block: B:97:0x0186  */
    /* JADX WARN: Code duplicated, block: B:99:0x018a  */
    @NotNull
    public static final c3 b(@NotNull c3 c3Var, long j10, @Nullable androidx.compose.ui.graphics.i0 i0Var, float f10, long j11, @Nullable androidx.compose.ui.text.font.v0 v0Var, @Nullable androidx.compose.ui.text.font.q0 q0Var, @Nullable androidx.compose.ui.text.font.r0 r0Var, @Nullable androidx.compose.ui.text.font.y yVar, @Nullable String str, long j12, @Nullable androidx.compose.ui.text.style.a aVar, @Nullable androidx.compose.ui.text.style.q qVar, @Nullable y0.f fVar, long j13, @Nullable androidx.compose.ui.text.style.k kVar, @Nullable androidx.compose.ui.graphics.o3 o3Var, @Nullable y0 y0Var, @Nullable androidx.compose.ui.graphics.drawscope.i iVar) {
        long jQ;
        androidx.compose.ui.text.style.q qVarA;
        long j14;
        androidx.compose.ui.graphics.drawscope.i iVar2;
        androidx.compose.ui.text.style.p pVarB;
        androidx.compose.ui.text.font.y yVarO;
        androidx.compose.ui.text.font.v0 v0VarT;
        androidx.compose.ui.text.font.q0 q0VarR;
        androidx.compose.ui.text.font.r0 r0VarS;
        long jU;
        y0.f fVarV;
        androidx.compose.ui.graphics.drawscope.i iVarN;
        String strP = str;
        androidx.compose.ui.text.style.a aVarK = aVar;
        androidx.compose.ui.text.style.k kVarY = kVar;
        androidx.compose.ui.graphics.o3 o3VarX = o3Var;
        if (!(androidx.compose.ui.unit.z.l(j11) == 0)) {
            jQ = j11;
            if (!androidx.compose.ui.unit.z.j(jQ, c3Var.q())) {
                qVarA = qVar;
                j14 = j13;
                iVar2 = iVar;
            }
            if (i0Var != null) {
                pVarB = androidx.compose.ui.text.style.p.f42231a.a(i0Var, f10);
            } else {
                pVarB = androidx.compose.ui.text.style.p.f42231a.b(j10);
            }
            androidx.compose.ui.text.style.p pVarC = c3Var.z().c(pVarB);
            if (yVar == null) {
                yVarO = c3Var.o();
            } else {
                yVarO = yVar;
            }
            if (androidx.compose.ui.unit.z.l(jQ) == 0) {
                jQ = c3Var.q();
            }
            if (v0Var == null) {
                v0VarT = c3Var.t();
            } else {
                v0VarT = v0Var;
            }
            if (q0Var == null) {
                q0VarR = c3Var.r();
            } else {
                q0VarR = q0Var;
            }
            if (r0Var == null) {
                r0VarS = c3Var.s();
            } else {
                r0VarS = r0Var;
            }
            if (strP == null) {
                strP = c3Var.p();
            }
            if (androidx.compose.ui.unit.z.l(j12) == 0) {
                jU = c3Var.u();
            } else {
                jU = j12;
            }
            if (aVarK == null) {
                aVarK = c3Var.k();
            }
            if (qVarA == null) {
                qVarA = c3Var.A();
            }
            if (fVar == null) {
                fVarV = c3Var.v();
            } else {
                fVarV = fVar;
            }
            if (j14 == 16) {
                j14 = c3Var.j();
            }
            if (kVarY == null) {
                kVarY = c3Var.y();
            }
            if (o3VarX == null) {
                o3VarX = c3Var.x();
            }
            androidx.compose.ui.graphics.o3 o3Var2 = o3VarX;
            y0 y0VarG = g(c3Var, y0Var);
            if (iVar2 == null) {
                iVarN = c3Var.n();
            } else {
                iVarN = iVar2;
            }
            return new c3(pVarC, jQ, v0VarT, q0VarR, r0VarS, yVarO, strP, jU, aVarK, qVarA, fVarV, j14, kVarY, o3Var2, y0VarG, iVarN, (DefaultConstructorMarker) null);
        }
        jQ = j11;
        if ((i0Var != null || j10 == 16 || androidx.compose.ui.graphics.q0.y(j10, c3Var.z().u())) && ((q0Var == null || Intrinsics.areEqual(q0Var, c3Var.r())) && ((v0Var == null || Intrinsics.areEqual(v0Var, c3Var.t())) && (yVar == null || yVar == c3Var.o())))) {
            if ((androidx.compose.ui.unit.z.l(j12) == 0) || androidx.compose.ui.unit.z.j(j12, c3Var.u())) {
                if ((kVarY == null || Intrinsics.areEqual(kVarY, c3Var.y())) && Intrinsics.areEqual(i0Var, c3Var.z().o0()) && ((i0Var == null || f10 == c3Var.z().r()) && ((r0Var == null || Intrinsics.areEqual(r0Var, c3Var.s())) && ((strP == null || Intrinsics.areEqual(strP, c3Var.p())) && (aVarK == null || Intrinsics.areEqual(aVarK, c3Var.k())))))) {
                    if (qVar != null) {
                        qVarA = qVar;
                        if (Intrinsics.areEqual(qVarA, c3Var.A())) {
                        }
                    } else {
                        qVarA = qVar;
                    }
                    if (fVar == null || Intrinsics.areEqual(fVar, c3Var.v())) {
                        if (j13 != 16) {
                            j14 = j13;
                            if (androidx.compose.ui.graphics.q0.y(j14, c3Var.j())) {
                            }
                        } else {
                            j14 = j13;
                        }
                        if ((o3VarX == null || Intrinsics.areEqual(o3VarX, c3Var.x())) && (y0Var == null || Intrinsics.areEqual(y0Var, c3Var.w()))) {
                            iVar2 = iVar;
                            if (iVar2 == null || Intrinsics.areEqual(iVar2, c3Var.n())) {
                                return c3Var;
                            }
                        }
                    }
                    iVar2 = iVar;
                } else {
                    qVarA = qVar;
                }
                j14 = j13;
                iVar2 = iVar;
            } else {
                qVarA = qVar;
                j14 = j13;
                iVar2 = iVar;
            }
        } else {
            qVarA = qVar;
            j14 = j13;
            iVar2 = iVar;
        }
        if (i0Var != null) {
            pVarB = androidx.compose.ui.text.style.p.f42231a.a(i0Var, f10);
        } else {
            pVarB = androidx.compose.ui.text.style.p.f42231a.b(j10);
        }
        androidx.compose.ui.text.style.p pVarC2 = c3Var.z().c(pVarB);
        if (yVar == null) {
            yVarO = c3Var.o();
        } else {
            yVarO = yVar;
        }
        if (androidx.compose.ui.unit.z.l(jQ) == 0) {
            jQ = c3Var.q();
        }
        if (v0Var == null) {
            v0VarT = c3Var.t();
        } else {
            v0VarT = v0Var;
        }
        if (q0Var == null) {
            q0VarR = c3Var.r();
        } else {
            q0VarR = q0Var;
        }
        if (r0Var == null) {
            r0VarS = c3Var.s();
        } else {
            r0VarS = r0Var;
        }
        if (strP == null) {
            strP = c3Var.p();
        }
        if (androidx.compose.ui.unit.z.l(j12) == 0) {
            jU = c3Var.u();
        } else {
            jU = j12;
        }
        if (aVarK == null) {
            aVarK = c3Var.k();
        }
        if (qVarA == null) {
            qVarA = c3Var.A();
        }
        if (fVar == null) {
            fVarV = c3Var.v();
        } else {
            fVarV = fVar;
        }
        if (j14 == 16) {
            j14 = c3Var.j();
        }
        if (kVarY == null) {
            kVarY = c3Var.y();
        }
        if (o3VarX == null) {
            o3VarX = c3Var.x();
        }
        androidx.compose.ui.graphics.o3 o3Var3 = o3VarX;
        y0 y0VarG2 = g(c3Var, y0Var);
        if (iVar2 == null) {
            iVarN = c3Var.n();
        } else {
            iVarN = iVar2;
        }
        return new c3(pVarC2, jQ, v0VarT, q0VarR, r0VarS, yVarO, strP, jU, aVarK, qVarA, fVarV, j14, kVarY, o3Var3, y0VarG2, iVarN, (DefaultConstructorMarker) null);
    }

    @NotNull
    public static final c3 c(@NotNull c3 c3Var, @NotNull c3 c3Var2, float f10) {
        androidx.compose.ui.text.style.p pVarB = androidx.compose.ui.text.style.m.b(c3Var.z(), c3Var2.z(), f10);
        androidx.compose.ui.text.font.y yVar = (androidx.compose.ui.text.font.y) d(c3Var.o(), c3Var2.o(), f10);
        long jF = f(c3Var.q(), c3Var2.q(), f10);
        androidx.compose.ui.text.font.v0 v0VarT = c3Var.t();
        if (v0VarT == null) {
            v0VarT = androidx.compose.ui.text.font.v0.f41742b.m();
        }
        androidx.compose.ui.text.font.v0 v0VarT2 = c3Var2.t();
        if (v0VarT2 == null) {
            v0VarT2 = androidx.compose.ui.text.font.v0.f41742b.m();
        }
        androidx.compose.ui.text.font.v0 v0VarA = androidx.compose.ui.text.font.y0.a(v0VarT, v0VarT2, f10);
        androidx.compose.ui.text.font.q0 q0Var = (androidx.compose.ui.text.font.q0) d(c3Var.r(), c3Var2.r(), f10);
        androidx.compose.ui.text.font.r0 r0Var = (androidx.compose.ui.text.font.r0) d(c3Var.s(), c3Var2.s(), f10);
        String str = (String) d(c3Var.p(), c3Var2.p(), f10);
        long jF2 = f(c3Var.u(), c3Var2.u(), f10);
        androidx.compose.ui.text.style.a aVarK = c3Var.k();
        float fK = aVarK != null ? aVarK.k() : androidx.compose.ui.text.style.a.e(0.0f);
        androidx.compose.ui.text.style.a aVarK2 = c3Var2.k();
        float fA = androidx.compose.ui.text.style.b.a(fK, aVarK2 != null ? aVarK2.k() : androidx.compose.ui.text.style.a.e(0.0f), f10);
        androidx.compose.ui.text.style.q qVarA = c3Var.A();
        if (qVarA == null) {
            qVarA = androidx.compose.ui.text.style.q.f42235c.a();
        }
        androidx.compose.ui.text.style.q qVarA2 = c3Var2.A();
        if (qVarA2 == null) {
            qVarA2 = androidx.compose.ui.text.style.q.f42235c.a();
        }
        androidx.compose.ui.text.style.q qVarA3 = androidx.compose.ui.text.style.r.a(qVarA, qVarA2, f10);
        y0.f fVar = (y0.f) d(c3Var.v(), c3Var2.v(), f10);
        long jQ = androidx.compose.ui.graphics.s0.q(c3Var.j(), c3Var2.j(), f10);
        androidx.compose.ui.text.style.k kVar = (androidx.compose.ui.text.style.k) d(c3Var.y(), c3Var2.y(), f10);
        androidx.compose.ui.graphics.o3 o3VarX = c3Var.x();
        if (o3VarX == null) {
            o3VarX = new androidx.compose.ui.graphics.o3(0L, 0L, 0.0f, 7, null);
        }
        androidx.compose.ui.graphics.o3 o3VarX2 = c3Var2.x();
        if (o3VarX2 == null) {
            o3VarX2 = new androidx.compose.ui.graphics.o3(0L, 0L, 0.0f, 7, null);
        }
        return new c3(pVarB, jF, v0VarA, q0Var, r0Var, yVar, str, jF2, androidx.compose.ui.text.style.a.d(fA), qVarA3, fVar, jQ, kVar, androidx.compose.ui.graphics.p3.a(o3VarX, o3VarX2, f10), e(c3Var.w(), c3Var2.w(), f10), (androidx.compose.ui.graphics.drawscope.i) d(c3Var.n(), c3Var2.n(), f10), (DefaultConstructorMarker) null);
    }

    public static final <T> T d(T t10, T t11, float f10) {
        return ((double) f10) < 0.5d ? t10 : t11;
    }

    private static final y0 e(y0 y0Var, y0 y0Var2, float f10) {
        if (y0Var == null && y0Var2 == null) {
            return null;
        }
        if (y0Var == null) {
            y0Var = y0.f42345a.a();
        }
        if (y0Var2 == null) {
            y0Var2 = y0.f42345a.a();
        }
        return e.c(y0Var, y0Var2, f10);
    }

    public static final long f(long j10, long j11, float f10) {
        return (androidx.compose.ui.unit.z.l(j10) == 0 || androidx.compose.ui.unit.z.l(j11) == 0) ? ((androidx.compose.ui.unit.z) d(androidx.compose.ui.unit.z.c(j10), androidx.compose.ui.unit.z.c(j11), f10)).w() : androidx.compose.ui.unit.a0.u(j10, j11, f10);
    }

    private static final y0 g(c3 c3Var, y0 y0Var) {
        if (c3Var.w() == null) {
            return y0Var;
        }
        return y0Var == null ? c3Var.w() : c3Var.w().b(y0Var);
    }

    @NotNull
    public static final c3 h(@NotNull c3 c3Var) {
        androidx.compose.ui.text.style.p pVarB = c3Var.z().b(new Function0() { // from class: androidx.compose.ui.text.d3
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                return e3.i();
            }
        });
        long jQ = androidx.compose.ui.unit.z.l(c3Var.q()) == 0 ? f41508a : c3Var.q();
        androidx.compose.ui.text.font.v0 v0VarT = c3Var.t();
        if (v0VarT == null) {
            v0VarT = androidx.compose.ui.text.font.v0.f41742b.m();
        }
        androidx.compose.ui.text.font.v0 v0Var = v0VarT;
        androidx.compose.ui.text.font.q0 q0VarR = c3Var.r();
        androidx.compose.ui.text.font.q0 q0VarC = androidx.compose.ui.text.font.q0.c(q0VarR != null ? q0VarR.j() : androidx.compose.ui.text.font.q0.f41690b.c());
        androidx.compose.ui.text.font.r0 r0VarS = c3Var.s();
        androidx.compose.ui.text.font.r0 r0VarE = androidx.compose.ui.text.font.r0.e(r0VarS != null ? r0VarS.m() : androidx.compose.ui.text.font.r0.f41699b.a());
        androidx.compose.ui.text.font.y yVarO = c3Var.o();
        if (yVarO == null) {
            yVarO = androidx.compose.ui.text.font.y.f41770b.b();
        }
        androidx.compose.ui.text.font.y yVar = yVarO;
        String strP = c3Var.p();
        if (strP == null) {
            strP = "";
        }
        String str = strP;
        long jU = androidx.compose.ui.unit.z.l(c3Var.u()) == 0 ? f41509b : c3Var.u();
        androidx.compose.ui.text.style.a aVarK = c3Var.k();
        androidx.compose.ui.text.style.a aVarD = androidx.compose.ui.text.style.a.d(aVarK != null ? aVarK.k() : androidx.compose.ui.text.style.a.f42141b.a());
        androidx.compose.ui.text.style.q qVarA = c3Var.A();
        if (qVarA == null) {
            qVarA = androidx.compose.ui.text.style.q.f42235c.a();
        }
        androidx.compose.ui.text.style.q qVar = qVarA;
        y0.f fVarV = c3Var.v();
        if (fVarV == null) {
            fVarV = y0.f.f390674c.a();
        }
        y0.f fVar = fVarV;
        long j10 = c3Var.j();
        if (j10 == 16) {
            j10 = f41510c;
        }
        long j11 = j10;
        androidx.compose.ui.text.style.k kVarY = c3Var.y();
        if (kVarY == null) {
            kVarY = androidx.compose.ui.text.style.k.f42215b.d();
        }
        androidx.compose.ui.text.style.k kVar = kVarY;
        androidx.compose.ui.graphics.o3 o3VarX = c3Var.x();
        if (o3VarX == null) {
            o3VarX = androidx.compose.ui.graphics.o3.f38091d.a();
        }
        androidx.compose.ui.graphics.o3 o3Var = o3VarX;
        y0 y0VarW = c3Var.w();
        androidx.compose.ui.graphics.drawscope.i iVarN = c3Var.n();
        if (iVarN == null) {
            iVarN = androidx.compose.ui.graphics.drawscope.m.f37744a;
        }
        return new c3(pVarB, jQ, v0Var, q0VarC, r0VarE, yVar, str, jU, aVarD, qVar, fVar, j11, kVar, o3Var, y0VarW, iVarN, (DefaultConstructorMarker) null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.text.style.p i() {
        return f41512e;
    }
}

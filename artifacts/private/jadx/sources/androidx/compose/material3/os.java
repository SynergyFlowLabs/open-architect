package androidx.compose.material3;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nProgressIndicator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProgressIndicator.kt\nandroidx/compose/material3/ProgressIndicatorKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 4 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 5 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 6 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 7 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n+ 8 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 9 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 10 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 11 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 12 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 13 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,1075:1\n1282#2,6:1076\n1282#2,6:1082\n1282#2,6:1088\n1282#2,6:1094\n1282#2,6:1100\n1282#2,6:1106\n1282#2,6:1150\n1282#2,6:1158\n1282#2,6:1164\n1282#2,6:1171\n1282#2,6:1177\n57#3:1112\n61#3:1115\n57#3:1183\n61#3:1208\n61#3:1211\n57#3:1214\n57#3:1217\n61#3:1221\n61#3:1224\n57#3:1227\n57#3:1230\n61#3:1244\n57#3:1247\n57#3:1250\n61#3:1253\n57#3:1256\n57#3:1259\n60#4:1113\n70#4:1116\n53#4,3:1119\n53#4,3:1143\n53#4,3:1147\n60#4:1184\n53#4,3:1187\n53#4,3:1191\n70#4:1209\n70#4:1212\n60#4:1215\n60#4:1218\n70#4:1222\n70#4:1225\n60#4:1228\n60#4:1231\n70#4:1245\n60#4:1248\n60#4:1251\n70#4:1254\n60#4:1257\n60#4:1260\n22#5:1114\n22#5:1117\n22#5:1185\n22#5:1210\n22#5:1213\n22#5:1219\n22#5:1223\n22#5:1226\n22#5:1232\n22#5:1246\n22#5:1252\n22#5:1255\n22#5:1261\n30#6:1118\n30#6:1142\n30#6:1146\n30#6:1186\n65#7,10:1122\n65#7,10:1132\n65#7,10:1198\n65#7,10:1234\n75#8:1156\n75#8:1170\n1#9:1157\n33#10:1190\n60#11,4:1194\n49#11:1216\n63#11:1220\n49#11:1229\n63#11:1233\n49#11:1249\n49#11:1258\n137#12,2:1262\n249#12,14:1264\n113#13:1278\n113#13:1279\n*S KotlinDebug\n*F\n+ 1 ProgressIndicator.kt\nandroidx/compose/material3/ProgressIndicatorKt\n*L\n146#1:1076,6\n155#1:1082,6\n159#1:1088,6\n165#1:1094,6\n286#1:1100,6\n361#1:1106,6\n528#1:1150,6\n532#1:1158,6\n538#1:1164,6\n660#1:1171,6\n707#1:1177,6\n406#1:1112\n407#1:1115\n758#1:1183\n166#1:1208\n168#1:1211\n168#1:1214\n173#1:1217\n287#1:1221\n289#1:1224\n289#1:1227\n294#1:1230\n543#1:1244\n543#1:1247\n548#1:1250\n663#1:1253\n663#1:1256\n668#1:1259\n406#1:1113\n407#1:1116\n418#1:1119,3\n429#1:1143,3\n430#1:1147,3\n758#1:1184\n764#1:1187,3\n765#1:1191,3\n166#1:1209\n168#1:1212\n168#1:1215\n173#1:1218\n287#1:1222\n289#1:1225\n289#1:1228\n294#1:1231\n543#1:1245\n543#1:1248\n548#1:1251\n663#1:1254\n663#1:1257\n668#1:1260\n406#1:1114\n407#1:1117\n758#1:1185\n166#1:1210\n168#1:1213\n173#1:1219\n287#1:1223\n289#1:1226\n294#1:1232\n543#1:1246\n548#1:1252\n663#1:1255\n668#1:1261\n418#1:1118\n429#1:1142\n430#1:1146\n764#1:1186\n422#1:1122,10\n423#1:1132,10\n155#1:1198,10\n528#1:1234,10\n529#1:1156\n632#1:1170\n765#1:1190\n794#1:1194,4\n171#1:1216\n173#1:1220\n292#1:1229\n294#1:1233\n546#1:1249\n666#1:1258\n670#1:1262,2\n670#1:1264,14\n1032#1:1278\n1037#1:1279\n*E\n"})
public final class os {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f31444a = androidx.compose.ui.unit.h.r(240);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f31445b = d0.c1.f267742a.d();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f31446c = androidx.compose.ui.unit.h.r(6);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final float f31447d = d0.r.f268722a.d();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    public static final int f31448e = 1750;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f31449f = 1000;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    public static final int f31450g = 1000;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    public static final int f31451h = 850;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    public static final int f31452i = 850;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    public static final int f31453j = 0;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    public static final int f31454k = 250;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    public static final int f31455l = 650;

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    public static final int f31456m = 900;

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.animation.core.e0 f31457n;

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.animation.core.e0 f31458o;

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    public static final float f31459p = 0.1f;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    public static final float f31460q = 0.87f;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    public static final int f31461r = 6000;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    public static final int f31462s = 1500;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    public static final int f31463t = 300;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    public static final float f31464u = 360.0f;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    public static final float f31465v = 1080.0f;

    static {
        d0.i1 i1Var = d0.i1.f268232a;
        f31457n = i1Var.a();
        f31458o = i1Var.i();
    }

    private static final void A0(androidx.compose.ui.graphics.drawscope.f fVar, float f10, float f11, long j10, androidx.compose.ui.graphics.drawscope.n nVar) {
        y0(fVar, f10, f11, j10, nVar);
    }

    private static final void B0(androidx.compose.ui.graphics.drawscope.f fVar, float f10, float f11, float f12, long j10, androidx.compose.ui.graphics.drawscope.n nVar) {
        y0(fVar, f10 + (androidx.compose.ui.graphics.u3.g(nVar.c(), androidx.compose.ui.graphics.u3.f38256b.a()) ? 0.0f : ((f11 / androidx.compose.ui.unit.h.r(f31447d / 2)) * 57.29578f) / 2.0f), Math.max(f12, 0.1f), j10, nVar);
    }

    private static final void C0(androidx.compose.ui.graphics.drawscope.f fVar, float f10, float f11, long j10, float f12, int i10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (fVar.d() >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (fVar.d() & com.rabbitmq.client.k0.f265952a));
        float f13 = 2;
        float f14 = fIntBitsToFloat2 / f13;
        boolean z10 = fVar.getLayoutDirection() == androidx.compose.ui.unit.w.Ltr;
        float f15 = (z10 ? f10 : 1.0f - f11) * fIntBitsToFloat;
        float f16 = (z10 ? f11 : 1.0f - f10) * fIntBitsToFloat;
        if (androidx.compose.ui.graphics.u3.g(i10, androidx.compose.ui.graphics.u3.f38256b.a()) || fIntBitsToFloat2 > fIntBitsToFloat) {
            androidx.compose.ui.graphics.drawscope.f.j2(fVar, j10, n0.g.g((((long) Float.floatToRawIntBits(f15)) << 32) | (((long) Float.floatToRawIntBits(f14)) & com.rabbitmq.client.k0.f265952a)), n0.g.g((((long) Float.floatToRawIntBits(f16)) << 32) | (((long) Float.floatToRawIntBits(f14)) & com.rabbitmq.client.k0.f265952a)), f12, 0, null, 0.0f, null, 0, 496, null);
            return;
        }
        float f17 = f12 / f13;
        float f18 = fIntBitsToFloat - f17;
        if (f15 < f17) {
            f15 = f17;
        }
        if (f15 > f18) {
            f15 = f18;
        }
        if (f16 < f17) {
            f16 = f17;
        }
        if (f16 <= f18) {
            f18 = f16;
        }
        if (Math.abs(f11 - f10) > 0.0f) {
            androidx.compose.ui.graphics.drawscope.f.j2(fVar, j10, n0.g.g((((long) Float.floatToRawIntBits(f15)) << 32) | (((long) Float.floatToRawIntBits(f14)) & com.rabbitmq.client.k0.f265952a)), n0.g.g((((long) Float.floatToRawIntBits(f18)) << 32) | (((long) Float.floatToRawIntBits(f14)) & com.rabbitmq.client.k0.f265952a)), f12, i10, null, 0.0f, null, 0, 480, null);
        }
    }

    @NotNull
    public static final androidx.compose.animation.core.g1<Float> D0() {
        int i10 = 0 << 0;
        return androidx.compose.animation.core.p.g(androidx.compose.animation.core.p.t(6000, 0, androidx.compose.animation.core.u0.e(), 2, null), null, 0L, 6, null);
    }

    @NotNull
    public static final androidx.compose.animation.core.g1<Float> E0() {
        return androidx.compose.animation.core.p.g(androidx.compose.animation.core.p.h(new Function1() { // from class: androidx.compose.material3.wr
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return os.s0((androidx.compose.animation.core.q1.b) obj);
            }
        }), null, 0L, 6, null);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0139  */
    /* JADX WARN: Code duplicated, block: B:103:0x0145  */
    /* JADX WARN: Code duplicated, block: B:106:0x0224  */
    /* JADX WARN: Code duplicated, block: B:107:0x0226  */
    /* JADX WARN: Code duplicated, block: B:110:0x022f  */
    /* JADX WARN: Code duplicated, block: B:111:0x0231  */
    /* JADX WARN: Code duplicated, block: B:114:0x0239  */
    /* JADX WARN: Code duplicated, block: B:115:0x023b  */
    /* JADX WARN: Code duplicated, block: B:118:0x024f  */
    /* JADX WARN: Code duplicated, block: B:120:0x0255  */
    /* JADX WARN: Code duplicated, block: B:126:0x026a  */
    /* JADX WARN: Code duplicated, block: B:128:0x0270  */
    /* JADX WARN: Code duplicated, block: B:134:0x0281  */
    /* JADX WARN: Code duplicated, block: B:138:0x0291  */
    /* JADX WARN: Code duplicated, block: B:141:0x02b9  */
    /* JADX WARN: Code duplicated, block: B:143:0x02cb  */
    /* JADX WARN: Code duplicated, block: B:146:0x02db  */
    /* JADX WARN: Code duplicated, block: B:148:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0063  */
    /* JADX WARN: Code duplicated, block: B:41:0x0072  */
    /* JADX WARN: Code duplicated, block: B:43:0x0076  */
    /* JADX WARN: Code duplicated, block: B:46:0x007c  */
    /* JADX WARN: Code duplicated, block: B:48:0x0083  */
    /* JADX WARN: Code duplicated, block: B:50:0x0087  */
    /* JADX WARN: Code duplicated, block: B:52:0x008f  */
    /* JADX WARN: Code duplicated, block: B:53:0x0092  */
    /* JADX WARN: Code duplicated, block: B:57:0x009c  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:62:0x00af  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:68:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:71:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f3 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:88:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:90:0x0108  */
    /* JADX WARN: Code duplicated, block: B:93:0x0114  */
    /* JADX WARN: Code duplicated, block: B:94:0x011f  */
    /* JADX WARN: Code duplicated, block: B:96:0x0122  */
    /* JADX WARN: Code duplicated, block: B:98:0x012c  */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void F(@Nullable androidx.compose.ui.a0 a0Var, long j10, float f10, long j11, int i10, float f11, @Nullable androidx.compose.runtime.c0 c0Var, final int i11, final int i12) {
        androidx.compose.ui.a0 a0Var2;
        int i13;
        long jC;
        float fJ;
        long j12;
        int i14;
        int iF;
        int i15;
        int i16;
        float f12;
        int i17;
        boolean z10;
        androidx.compose.runtime.c0 c0Var2;
        final androidx.compose.ui.a0 a0Var3;
        final long j13;
        final float f13;
        final float f14;
        final int i18;
        final long j14;
        androidx.compose.runtime.s5 s5VarT;
        androidx.compose.ui.a0 a0Var4;
        long jG;
        final float fH;
        final int i19;
        final androidx.compose.ui.graphics.drawscope.n nVar;
        final androidx.compose.runtime.n7<Float> n7VarD;
        final androidx.compose.runtime.n7<Float> n7VarD2;
        final androidx.compose.runtime.n7<Float> n7VarD3;
        boolean z11;
        boolean z12;
        boolean z13;
        boolean zD;
        Object objI0;
        final long j15;
        final long j16;
        final float f15;
        int i20;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(333154241);
        int i21 = i12 & 1;
        if (i21 != 0) {
            i13 = i11 | 6;
            a0Var2 = a0Var;
        } else if ((i11 & 6) == 0) {
            a0Var2 = a0Var;
            i13 = (c0VarR.D(a0Var2) ? 4 : 2) | i11;
        } else {
            a0Var2 = a0Var;
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            jC = j10;
            i13 |= ((i12 & 2) == 0 && c0VarR.L(jC)) ? 32 : 16;
        } else {
            jC = j10;
        }
        int i22 = i12 & 4;
        if (i22 == 0) {
            if ((i11 & androidx.media3.exoplayer.a5.S0) == 0) {
                fJ = f10;
                i13 |= c0VarR.I(fJ) ? 256 : 128;
            }
            if ((i11 & 3072) == 0) {
                j12 = j11;
                if ((i12 & 8) == 0 || !c0VarR.L(j12)) {
                    i20 = 1024;
                } else {
                    i20 = 2048;
                }
                i13 |= i20;
            } else {
                j12 = j11;
            }
            i14 = i12 & 16;
            if (i14 != 0) {
                if ((i11 & 24576) == 0) {
                    iF = i10;
                    if (c0VarR.K(iF)) {
                        i15 = 16384;
                    } else {
                        i15 = 8192;
                    }
                    i13 |= i15;
                }
                i16 = i12 & 32;
                if (i16 != 0) {
                    i13 |= androidx.profileinstaller.n.c.f73814m;
                    f12 = f11;
                } else {
                    f12 = f11;
                    if ((i11 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        if (c0VarR.I(f12)) {
                            i17 = 131072;
                        } else {
                            i17 = 65536;
                        }
                        i13 |= i17;
                    }
                }
                if ((i13 & 74899) != 74898) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i13 & 1)) {
                    c0VarR.l0();
                    if ((i11 & 1) != 0 || c0VarR.y()) {
                        if (i21 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if ((i12 & 2) != 0) {
                            jC = ir.f29311a.c(c0VarR, 6);
                            i13 &= -113;
                        }
                        if (i22 != 0) {
                            fJ = ir.f29311a.j();
                        }
                        if ((i12 & 8) != 0) {
                            jG = ir.f29311a.g(c0VarR, 6);
                            i13 &= -7169;
                        } else {
                            jG = j12;
                        }
                        if (i14 != 0) {
                            iF = ir.f29311a.f();
                        }
                        if (i16 != 0) {
                            fH = ir.f29311a.h();
                        } else {
                            fH = f12;
                        }
                        i19 = iF;
                    } else {
                        c0VarR.u();
                        if ((i12 & 2) != 0) {
                            i13 &= -113;
                        }
                        if ((i12 & 8) != 0) {
                            i13 &= -7169;
                        }
                        a0Var4 = a0Var2;
                        fH = f12;
                        i19 = iF;
                        jG = j12;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(333154241, i13, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:630)");
                    }
                    nVar = new androidx.compose.ui.graphics.drawscope.n(((androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m())).S7(fJ), 0.0f, i19, 0, null, 26, null);
                    androidx.compose.animation.core.i1 i1VarJ = androidx.compose.animation.core.n1.j(null, c0VarR, 0, 1);
                    androidx.compose.animation.core.g1<Float> g1VarD0 = D0();
                    int i23 = androidx.compose.animation.core.i1.f13005f;
                    int i24 = androidx.compose.animation.core.g1.f12967d;
                    n7VarD = androidx.compose.animation.core.n1.d(i1VarJ, 0.0f, 1080.0f, g1VarD0, null, c0VarR, i23 | 432 | (i24 << 9), 8);
                    n7VarD2 = androidx.compose.animation.core.n1.d(i1VarJ, 0.0f, 360.0f, F0(), null, c0VarR, i23 | 432 | (i24 << 9), 8);
                    n7VarD3 = androidx.compose.animation.core.n1.d(i1VarJ, 0.1f, 0.87f, E0(), null, c0VarR, i23 | 432 | (i24 << 9), 8);
                    c0Var2 = c0VarR;
                    androidx.compose.ui.a0 a0VarW = androidx.compose.foundation.layout.i6.w(androidx.compose.foundation.m4.c(a0Var4), f31447d);
                    boolean zD2 = c0Var2.D(n7VarD3);
                    androidx.compose.ui.a0 a0Var5 = a0Var4;
                    if ((57344 & i13) == 16384) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    boolean z14 = z11 | zD2;
                    if ((458752 & i13) == 131072) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    boolean z15 = z14 | z12;
                    if ((i13 & 896) == 256) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    zD = z15 | z13 | c0Var2.D(n7VarD) | c0Var2.D(n7VarD2) | ((((i13 & 7168) ^ 3072) <= 2048 && c0Var2.L(jG)) || (i13 & 3072) == 2048) | c0Var2.k0(nVar) | ((((i13 & com.planner5d.library.engine.input.f.b.B) ^ 48) <= 32 && c0Var2.L(jC)) || (i13 & 48) == 32);
                    objI0 = c0Var2.i0();
                    if (!zD || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        j15 = jG;
                        j16 = jC;
                        f15 = fJ;
                        objI0 = new Function1() { // from class: androidx.compose.material3.ls
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return os.M(n7VarD3, i19, fH, f15, n7VarD, n7VarD2, j15, nVar, j16, (androidx.compose.ui.graphics.drawscope.f) obj);
                            }
                        };
                        c0Var2.Y(objI0);
                    } else {
                        j15 = jG;
                        j16 = jC;
                        f15 = fJ;
                    }
                    androidx.compose.foundation.f1.e(a0VarW, (Function1) objI0, c0Var2, 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var5;
                    i18 = i19;
                    f13 = fH;
                    f14 = f15;
                    j14 = j15;
                    j13 = j16;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var3 = a0Var2;
                    j13 = jC;
                    f13 = f12;
                    f14 = fJ;
                    i18 = iF;
                    j14 = j12;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.ms
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return os.N(a0Var3, j13, f14, j14, i18, f13, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 24576;
            iF = i10;
            i16 = i12 & 32;
            if (i16 != 0) {
                i13 |= androidx.profileinstaller.n.c.f73814m;
                f12 = f11;
            } else {
                f12 = f11;
                if ((i11 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    if (c0VarR.I(f12)) {
                        i17 = 131072;
                    } else {
                        i17 = 65536;
                    }
                    i13 |= i17;
                }
            }
            if ((i13 & 74899) != 74898) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i13 & 1)) {
                c0VarR.l0();
                if ((i11 & 1) != 0) {
                    if (i21 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if ((i12 & 2) != 0) {
                        jC = ir.f29311a.c(c0VarR, 6);
                        i13 &= -113;
                    }
                    if (i22 != 0) {
                        fJ = ir.f29311a.j();
                    }
                    if ((i12 & 8) != 0) {
                        jG = ir.f29311a.g(c0VarR, 6);
                        i13 &= -7169;
                    } else {
                        jG = j12;
                    }
                    if (i14 != 0) {
                        iF = ir.f29311a.f();
                    }
                    if (i16 != 0) {
                        fH = ir.f29311a.h();
                    } else {
                        fH = f12;
                    }
                    i19 = iF;
                } else {
                    if (i21 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if ((i12 & 2) != 0) {
                        jC = ir.f29311a.c(c0VarR, 6);
                        i13 &= -113;
                    }
                    if (i22 != 0) {
                        fJ = ir.f29311a.j();
                    }
                    if ((i12 & 8) != 0) {
                        jG = ir.f29311a.g(c0VarR, 6);
                        i13 &= -7169;
                    } else {
                        jG = j12;
                    }
                    if (i14 != 0) {
                        iF = ir.f29311a.f();
                    }
                    if (i16 != 0) {
                        fH = ir.f29311a.h();
                    } else {
                        fH = f12;
                    }
                    i19 = iF;
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(333154241, i13, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:630)");
                }
                nVar = new androidx.compose.ui.graphics.drawscope.n(((androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m())).S7(fJ), 0.0f, i19, 0, null, 26, null);
                androidx.compose.animation.core.i1 i1VarJ2 = androidx.compose.animation.core.n1.j(null, c0VarR, 0, 1);
                androidx.compose.animation.core.g1<Float> g1VarD1 = D0();
                int i25 = androidx.compose.animation.core.i1.f13005f;
                int i26 = androidx.compose.animation.core.g1.f12967d;
                n7VarD = androidx.compose.animation.core.n1.d(i1VarJ2, 0.0f, 1080.0f, g1VarD1, null, c0VarR, i25 | 432 | (i26 << 9), 8);
                n7VarD2 = androidx.compose.animation.core.n1.d(i1VarJ2, 0.0f, 360.0f, F0(), null, c0VarR, i25 | 432 | (i26 << 9), 8);
                n7VarD3 = androidx.compose.animation.core.n1.d(i1VarJ2, 0.1f, 0.87f, E0(), null, c0VarR, i25 | 432 | (i26 << 9), 8);
                c0Var2 = c0VarR;
                androidx.compose.ui.a0 a0VarW2 = androidx.compose.foundation.layout.i6.w(androidx.compose.foundation.m4.c(a0Var4), f31447d);
                boolean zD3 = c0Var2.D(n7VarD3);
                androidx.compose.ui.a0 a0Var6 = a0Var4;
                if ((57344 & i13) == 16384) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                boolean z16 = z11 | zD3;
                if ((458752 & i13) == 131072) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                boolean z17 = z16 | z12;
                if ((i13 & 896) == 256) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                zD = z17 | z13 | c0Var2.D(n7VarD) | c0Var2.D(n7VarD2) | ((((i13 & 7168) ^ 3072) <= 2048 && c0Var2.L(jG)) || (i13 & 3072) == 2048) | c0Var2.k0(nVar) | ((((i13 & com.planner5d.library.engine.input.f.b.B) ^ 48) <= 32 && c0Var2.L(jC)) || (i13 & 48) == 32);
                objI0 = c0Var2.i0();
                if (zD) {
                    j15 = jG;
                    j16 = jC;
                    f15 = fJ;
                    objI0 = new Function1() { // from class: androidx.compose.material3.ls
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return os.M(n7VarD3, i19, fH, f15, n7VarD, n7VarD2, j15, nVar, j16, (androidx.compose.ui.graphics.drawscope.f) obj);
                        }
                    };
                    c0Var2.Y(objI0);
                } else {
                    j15 = jG;
                    j16 = jC;
                    f15 = fJ;
                    objI0 = new Function1() { // from class: androidx.compose.material3.ls
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return os.M(n7VarD3, i19, fH, f15, n7VarD, n7VarD2, j15, nVar, j16, (androidx.compose.ui.graphics.drawscope.f) obj);
                        }
                    };
                    c0Var2.Y(objI0);
                }
                androidx.compose.foundation.f1.e(a0VarW2, (Function1) objI0, c0Var2, 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var6;
                i18 = i19;
                f13 = fH;
                f14 = f15;
                j14 = j15;
                j13 = j16;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var3 = a0Var2;
                j13 = jC;
                f13 = f12;
                f14 = fJ;
                i18 = iF;
                j14 = j12;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.ms
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return os.N(a0Var3, j13, f14, j14, i18, f13, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= androidx.media3.exoplayer.a5.S0;
        fJ = f10;
        if ((i11 & 3072) == 0) {
            j12 = j11;
            if ((i12 & 8) == 0) {
                i20 = 1024;
            } else {
                i20 = 1024;
            }
            i13 |= i20;
        } else {
            j12 = j11;
        }
        i14 = i12 & 16;
        if (i14 != 0) {
            if ((i11 & 24576) == 0) {
                iF = i10;
                if (c0VarR.K(iF)) {
                    i15 = 16384;
                } else {
                    i15 = 8192;
                }
                i13 |= i15;
            }
            i16 = i12 & 32;
            if (i16 != 0) {
                i13 |= androidx.profileinstaller.n.c.f73814m;
                f12 = f11;
            } else {
                f12 = f11;
                if ((i11 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    if (c0VarR.I(f12)) {
                        i17 = 131072;
                    } else {
                        i17 = 65536;
                    }
                    i13 |= i17;
                }
            }
            if ((i13 & 74899) != 74898) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i13 & 1)) {
                c0VarR.l0();
                if ((i11 & 1) != 0) {
                    if (i21 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if ((i12 & 2) != 0) {
                        jC = ir.f29311a.c(c0VarR, 6);
                        i13 &= -113;
                    }
                    if (i22 != 0) {
                        fJ = ir.f29311a.j();
                    }
                    if ((i12 & 8) != 0) {
                        jG = ir.f29311a.g(c0VarR, 6);
                        i13 &= -7169;
                    } else {
                        jG = j12;
                    }
                    if (i14 != 0) {
                        iF = ir.f29311a.f();
                    }
                    if (i16 != 0) {
                        fH = ir.f29311a.h();
                    } else {
                        fH = f12;
                    }
                    i19 = iF;
                } else {
                    if (i21 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if ((i12 & 2) != 0) {
                        jC = ir.f29311a.c(c0VarR, 6);
                        i13 &= -113;
                    }
                    if (i22 != 0) {
                        fJ = ir.f29311a.j();
                    }
                    if ((i12 & 8) != 0) {
                        jG = ir.f29311a.g(c0VarR, 6);
                        i13 &= -7169;
                    } else {
                        jG = j12;
                    }
                    if (i14 != 0) {
                        iF = ir.f29311a.f();
                    }
                    if (i16 != 0) {
                        fH = ir.f29311a.h();
                    } else {
                        fH = f12;
                    }
                    i19 = iF;
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(333154241, i13, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:630)");
                }
                nVar = new androidx.compose.ui.graphics.drawscope.n(((androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m())).S7(fJ), 0.0f, i19, 0, null, 26, null);
                androidx.compose.animation.core.i1 i1VarJ3 = androidx.compose.animation.core.n1.j(null, c0VarR, 0, 1);
                androidx.compose.animation.core.g1<Float> g1VarD2 = D0();
                int i27 = androidx.compose.animation.core.i1.f13005f;
                int i28 = androidx.compose.animation.core.g1.f12967d;
                n7VarD = androidx.compose.animation.core.n1.d(i1VarJ3, 0.0f, 1080.0f, g1VarD2, null, c0VarR, i27 | 432 | (i28 << 9), 8);
                n7VarD2 = androidx.compose.animation.core.n1.d(i1VarJ3, 0.0f, 360.0f, F0(), null, c0VarR, i27 | 432 | (i28 << 9), 8);
                n7VarD3 = androidx.compose.animation.core.n1.d(i1VarJ3, 0.1f, 0.87f, E0(), null, c0VarR, i27 | 432 | (i28 << 9), 8);
                c0Var2 = c0VarR;
                androidx.compose.ui.a0 a0VarW3 = androidx.compose.foundation.layout.i6.w(androidx.compose.foundation.m4.c(a0Var4), f31447d);
                boolean zD4 = c0Var2.D(n7VarD3);
                androidx.compose.ui.a0 a0Var7 = a0Var4;
                if ((57344 & i13) == 16384) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                boolean z18 = z11 | zD4;
                if ((458752 & i13) == 131072) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                boolean z19 = z18 | z12;
                if ((i13 & 896) == 256) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                zD = z19 | z13 | c0Var2.D(n7VarD) | c0Var2.D(n7VarD2) | ((((i13 & 7168) ^ 3072) <= 2048 && c0Var2.L(jG)) || (i13 & 3072) == 2048) | c0Var2.k0(nVar) | ((((i13 & com.planner5d.library.engine.input.f.b.B) ^ 48) <= 32 && c0Var2.L(jC)) || (i13 & 48) == 32);
                objI0 = c0Var2.i0();
                if (zD) {
                    j15 = jG;
                    j16 = jC;
                    f15 = fJ;
                    objI0 = new Function1() { // from class: androidx.compose.material3.ls
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return os.M(n7VarD3, i19, fH, f15, n7VarD, n7VarD2, j15, nVar, j16, (androidx.compose.ui.graphics.drawscope.f) obj);
                        }
                    };
                    c0Var2.Y(objI0);
                } else {
                    j15 = jG;
                    j16 = jC;
                    f15 = fJ;
                    objI0 = new Function1() { // from class: androidx.compose.material3.ls
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return os.M(n7VarD3, i19, fH, f15, n7VarD, n7VarD2, j15, nVar, j16, (androidx.compose.ui.graphics.drawscope.f) obj);
                        }
                    };
                    c0Var2.Y(objI0);
                }
                androidx.compose.foundation.f1.e(a0VarW3, (Function1) objI0, c0Var2, 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var7;
                i18 = i19;
                f13 = fH;
                f14 = f15;
                j14 = j15;
                j13 = j16;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var3 = a0Var2;
                j13 = jC;
                f13 = f12;
                f14 = fJ;
                i18 = iF;
                j14 = j12;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.ms
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return os.N(a0Var3, j13, f14, j14, i18, f13, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= 24576;
        iF = i10;
        i16 = i12 & 32;
        if (i16 != 0) {
            i13 |= androidx.profileinstaller.n.c.f73814m;
            f12 = f11;
        } else {
            f12 = f11;
            if ((i11 & androidx.profileinstaller.n.c.f73814m) == 0) {
                if (c0VarR.I(f12)) {
                    i17 = 131072;
                } else {
                    i17 = 65536;
                }
                i13 |= i17;
            }
        }
        if ((i13 & 74899) != 74898) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c0VarR.h(z10, i13 & 1)) {
            c0VarR.l0();
            if ((i11 & 1) != 0) {
                if (i21 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if ((i12 & 2) != 0) {
                    jC = ir.f29311a.c(c0VarR, 6);
                    i13 &= -113;
                }
                if (i22 != 0) {
                    fJ = ir.f29311a.j();
                }
                if ((i12 & 8) != 0) {
                    jG = ir.f29311a.g(c0VarR, 6);
                    i13 &= -7169;
                } else {
                    jG = j12;
                }
                if (i14 != 0) {
                    iF = ir.f29311a.f();
                }
                if (i16 != 0) {
                    fH = ir.f29311a.h();
                } else {
                    fH = f12;
                }
                i19 = iF;
            } else {
                if (i21 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if ((i12 & 2) != 0) {
                    jC = ir.f29311a.c(c0VarR, 6);
                    i13 &= -113;
                }
                if (i22 != 0) {
                    fJ = ir.f29311a.j();
                }
                if ((i12 & 8) != 0) {
                    jG = ir.f29311a.g(c0VarR, 6);
                    i13 &= -7169;
                } else {
                    jG = j12;
                }
                if (i14 != 0) {
                    iF = ir.f29311a.f();
                }
                if (i16 != 0) {
                    fH = ir.f29311a.h();
                } else {
                    fH = f12;
                }
                i19 = iF;
            }
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(333154241, i13, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:630)");
            }
            nVar = new androidx.compose.ui.graphics.drawscope.n(((androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m())).S7(fJ), 0.0f, i19, 0, null, 26, null);
            androidx.compose.animation.core.i1 i1VarJ4 = androidx.compose.animation.core.n1.j(null, c0VarR, 0, 1);
            androidx.compose.animation.core.g1<Float> g1VarD3 = D0();
            int i29 = androidx.compose.animation.core.i1.f13005f;
            int i210 = androidx.compose.animation.core.g1.f12967d;
            n7VarD = androidx.compose.animation.core.n1.d(i1VarJ4, 0.0f, 1080.0f, g1VarD3, null, c0VarR, i29 | 432 | (i210 << 9), 8);
            n7VarD2 = androidx.compose.animation.core.n1.d(i1VarJ4, 0.0f, 360.0f, F0(), null, c0VarR, i29 | 432 | (i210 << 9), 8);
            n7VarD3 = androidx.compose.animation.core.n1.d(i1VarJ4, 0.1f, 0.87f, E0(), null, c0VarR, i29 | 432 | (i210 << 9), 8);
            c0Var2 = c0VarR;
            androidx.compose.ui.a0 a0VarW4 = androidx.compose.foundation.layout.i6.w(androidx.compose.foundation.m4.c(a0Var4), f31447d);
            boolean zD5 = c0Var2.D(n7VarD3);
            androidx.compose.ui.a0 a0Var8 = a0Var4;
            if ((57344 & i13) == 16384) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean z110 = z11 | zD5;
            if ((458752 & i13) == 131072) {
                z12 = true;
            } else {
                z12 = false;
            }
            boolean z111 = z110 | z12;
            if ((i13 & 896) == 256) {
                z13 = true;
            } else {
                z13 = false;
            }
            zD = z111 | z13 | c0Var2.D(n7VarD) | c0Var2.D(n7VarD2) | ((((i13 & 7168) ^ 3072) <= 2048 && c0Var2.L(jG)) || (i13 & 3072) == 2048) | c0Var2.k0(nVar) | ((((i13 & com.planner5d.library.engine.input.f.b.B) ^ 48) <= 32 && c0Var2.L(jC)) || (i13 & 48) == 32);
            objI0 = c0Var2.i0();
            if (zD) {
                j15 = jG;
                j16 = jC;
                f15 = fJ;
                objI0 = new Function1() { // from class: androidx.compose.material3.ls
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return os.M(n7VarD3, i19, fH, f15, n7VarD, n7VarD2, j15, nVar, j16, (androidx.compose.ui.graphics.drawscope.f) obj);
                    }
                };
                c0Var2.Y(objI0);
            } else {
                j15 = jG;
                j16 = jC;
                f15 = fJ;
                objI0 = new Function1() { // from class: androidx.compose.material3.ls
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return os.M(n7VarD3, i19, fH, f15, n7VarD, n7VarD2, j15, nVar, j16, (androidx.compose.ui.graphics.drawscope.f) obj);
                    }
                };
                c0Var2.Y(objI0);
            }
            androidx.compose.foundation.f1.e(a0VarW4, (Function1) objI0, c0Var2, 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            a0Var3 = a0Var8;
            i18 = i19;
            f13 = fH;
            f14 = f15;
            j14 = j15;
            j13 = j16;
        } else {
            c0Var2 = c0VarR;
            c0Var2.u();
            a0Var3 = a0Var2;
            j13 = jC;
            f13 = f12;
            f14 = fJ;
            i18 = iF;
            j14 = j12;
        }
        s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.ms
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return os.N(a0Var3, j13, f14, j14, i18, f13, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @NotNull
    public static final androidx.compose.animation.core.g1<Float> F0() {
        return androidx.compose.animation.core.p.g(androidx.compose.animation.core.p.h(new Function1() { // from class: androidx.compose.material3.yr
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return os.t0((androidx.compose.animation.core.q1.b) obj);
            }
        }), null, 0L, 6, null);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0142  */
    /* JADX WARN: Code duplicated, block: B:104:0x014f  */
    /* JADX WARN: Code duplicated, block: B:107:0x0157  */
    /* JADX WARN: Code duplicated, block: B:109:0x015f  */
    /* JADX WARN: Code duplicated, block: B:112:0x017f  */
    /* JADX WARN: Code duplicated, block: B:114:0x018a  */
    /* JADX WARN: Code duplicated, block: B:117:0x019c  */
    /* JADX WARN: Code duplicated, block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0043  */
    /* JADX WARN: Code duplicated, block: B:28:0x0047  */
    /* JADX WARN: Code duplicated, block: B:30:0x004f  */
    /* JADX WARN: Code duplicated, block: B:31:0x0052  */
    /* JADX WARN: Code duplicated, block: B:34:0x0058  */
    /* JADX WARN: Code duplicated, block: B:37:0x005e  */
    /* JADX WARN: Code duplicated, block: B:39:0x0065  */
    /* JADX WARN: Code duplicated, block: B:41:0x0069  */
    /* JADX WARN: Code duplicated, block: B:43:0x0073  */
    /* JADX WARN: Code duplicated, block: B:44:0x0076  */
    /* JADX WARN: Code duplicated, block: B:48:0x007d  */
    /* JADX WARN: Code duplicated, block: B:50:0x0081  */
    /* JADX WARN: Code duplicated, block: B:52:0x0089  */
    /* JADX WARN: Code duplicated, block: B:53:0x008c  */
    /* JADX WARN: Code duplicated, block: B:56:0x0092  */
    /* JADX WARN: Code duplicated, block: B:59:0x009a  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:74:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:85:0x00ee A[PHI: r3 r6 r7 r11 r12
      0x00ee: PHI (r3v26 int) = (r3v20 int), (r3v27 int), (r3v28 int) binds: [B:97:0x0124, B:83:0x00eb, B:84:0x00ed] A[DONT_GENERATE, DONT_INLINE]
      0x00ee: PHI (r6v10 androidx.compose.ui.a0) = (r6v5 androidx.compose.ui.a0), (r6v2 androidx.compose.ui.a0), (r6v2 androidx.compose.ui.a0) binds: [B:97:0x0124, B:83:0x00eb, B:84:0x00ed] A[DONT_GENERATE, DONT_INLINE]
      0x00ee: PHI (r7v10 long) = (r7v7 long), (r7v6 long), (r7v6 long) binds: [B:97:0x0124, B:83:0x00eb, B:84:0x00ed] A[DONT_GENERATE, DONT_INLINE]
      0x00ee: PHI (r11v9 float) = (r11v5 float), (r11v3 float), (r11v3 float) binds: [B:97:0x0124, B:83:0x00eb, B:84:0x00ed] A[DONT_GENERATE, DONT_INLINE]
      0x00ee: PHI (r12v10 long) = (r12v7 long), (r12v6 long), (r12v6 long) binds: [B:97:0x0124, B:83:0x00eb, B:84:0x00ed] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:87:0x00fb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:88:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:91:0x0105  */
    /* JADX WARN: Code duplicated, block: B:93:0x010f  */
    /* JADX WARN: Code duplicated, block: B:96:0x011a  */
    /* JADX WARN: Code duplicated, block: B:98:0x0126  */
    @androidx.compose.runtime.o
    @kotlin.l(message = "Use the overload that takes `progress` as a lambda", replaceWith = @kotlin.b1(expression = "CircularProgressIndicator(\nprogress = { progress },\nmodifier = modifier,\ncolor = color,\nstrokeWidth = strokeWidth,\ntrackColor = trackColor,\nstrokeCap = strokeCap,\n)", imports = {}))
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void G(final float f10, @Nullable androidx.compose.ui.a0 a0Var, long j10, float f11, long j11, int i10, @Nullable androidx.compose.runtime.c0 c0Var, final int i11, final int i12) {
        int i13;
        androidx.compose.ui.a0 a0Var2;
        long jC;
        int i14;
        float fJ;
        int i15;
        long jK;
        int i16;
        int i17;
        int i18;
        boolean z10;
        androidx.compose.runtime.c0 c0Var2;
        final androidx.compose.ui.a0 a0Var3;
        final long j12;
        final float f12;
        final long j13;
        final int i19;
        androidx.compose.runtime.s5 s5VarT;
        int iD;
        boolean z11;
        float f13;
        long j14;
        int i20;
        androidx.compose.ui.a0 a0Var4;
        Object objI0;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1472321743);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (c0VarR.I(f10) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i21 = i12 & 2;
        if (i21 == 0) {
            if ((i11 & 48) == 0) {
                a0Var2 = a0Var;
                i13 |= c0VarR.D(a0Var2) ? 32 : 16;
            }
            if ((i11 & androidx.media3.exoplayer.a5.S0) == 0) {
                if ((i12 & 4) == 0) {
                    jC = j10;
                    int i22 = c0VarR.L(jC) ? 256 : 128;
                    i13 |= i22;
                } else {
                    jC = j10;
                }
                i13 |= i22;
            } else {
                jC = j10;
            }
            i14 = i12 & 8;
            if (i14 != 0) {
                if ((i11 & 3072) == 0) {
                    fJ = f11;
                    if (c0VarR.I(fJ)) {
                        i15 = 2048;
                    } else {
                        i15 = 1024;
                    }
                    i13 |= i15;
                }
                if ((i11 & 24576) == 0) {
                    if ((i12 & 16) == 0) {
                        jK = j11;
                        int i23 = c0VarR.L(jK) ? 16384 : 8192;
                        i13 |= i23;
                    } else {
                        jK = j11;
                    }
                    i13 |= i23;
                } else {
                    jK = j11;
                }
                i16 = i12 & 32;
                if (i16 != 0) {
                    if ((196608 & i11) == 0) {
                        i17 = i10;
                        if (c0VarR.K(i17)) {
                            i18 = 131072;
                        } else {
                            i18 = 65536;
                        }
                        i13 |= i18;
                    }
                    if ((i13 & 74899) != 74898) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i13 & 1)) {
                        c0VarR.l0();
                        if ((i11 & 1) != 0 || c0VarR.y()) {
                            if (i21 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if ((i12 & 4) != 0) {
                                jC = ir.f29311a.c(c0VarR, 6);
                                i13 &= -897;
                            }
                            if (i14 != 0) {
                                fJ = ir.f29311a.j();
                            }
                            if ((i12 & 16) != 0) {
                                jK = ir.f29311a.k(c0VarR, 6);
                                i13 &= -57345;
                            }
                            if (i16 != 0) {
                                iD = ir.f29311a.d();
                                z11 = false;
                                f13 = fJ;
                                j14 = jK;
                                i20 = -1472321743;
                                a0Var4 = a0Var2;
                            }
                            long j15 = jC;
                            c0VarR.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(i20, i13, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:705)");
                            }
                            if ((i13 & 14) == 4) {
                                z11 = true;
                            }
                            objI0 = c0VarR.i0();
                            if (z11 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = new Function0() { // from class: androidx.compose.material3.es
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Float.valueOf(os.P(f10));
                                    }
                                };
                                c0VarR.Y(objI0);
                            }
                            c0Var2 = c0VarR;
                            I((Function0) objI0, a0Var4, j15, f13, j14, iD, 0.0f, c0Var2, i13 & 524272, 64);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            a0Var3 = a0Var4;
                            j12 = j15;
                            f12 = f13;
                            j13 = j14;
                            i19 = iD;
                        } else {
                            c0VarR.u();
                            if ((i12 & 4) != 0) {
                                i13 &= -897;
                            }
                            if ((i12 & 16) != 0) {
                                i13 &= -57345;
                            }
                        }
                        f13 = fJ;
                        z11 = false;
                        i20 = -1472321743;
                        a0Var4 = a0Var2;
                        iD = i17;
                        j14 = jK;
                        long j16 = jC;
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(i20, i13, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:705)");
                        }
                        if ((i13 & 14) == 4) {
                            z11 = true;
                        }
                        objI0 = c0VarR.i0();
                        if (z11) {
                            objI0 = new Function0() { // from class: androidx.compose.material3.es
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Float.valueOf(os.P(f10));
                                }
                            };
                            c0VarR.Y(objI0);
                        } else {
                            objI0 = new Function0() { // from class: androidx.compose.material3.es
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Float.valueOf(os.P(f10));
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        c0Var2 = c0VarR;
                        I((Function0) objI0, a0Var4, j16, f13, j14, iD, 0.0f, c0Var2, i13 & 524272, 64);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var4;
                        j12 = j16;
                        f12 = f13;
                        j13 = j14;
                        i19 = iD;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        a0Var3 = a0Var2;
                        j12 = jC;
                        f12 = fJ;
                        j13 = jK;
                        i19 = i17;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.gs
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return os.Q(f10, a0Var3, j12, f12, j13, i19, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i13 |= androidx.profileinstaller.n.c.f73814m;
                i17 = i10;
                if ((i13 & 74899) != 74898) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i13 & 1)) {
                    c0VarR.l0();
                    if ((i11 & 1) != 0) {
                        if (i21 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if ((i12 & 4) != 0) {
                            jC = ir.f29311a.c(c0VarR, 6);
                            i13 &= -897;
                        }
                        if (i14 != 0) {
                            fJ = ir.f29311a.j();
                        }
                        if ((i12 & 16) != 0) {
                            jK = ir.f29311a.k(c0VarR, 6);
                            i13 &= -57345;
                        }
                        if (i16 != 0) {
                            iD = ir.f29311a.d();
                            z11 = false;
                            f13 = fJ;
                            j14 = jK;
                            i20 = -1472321743;
                            a0Var4 = a0Var2;
                        } else {
                            f13 = fJ;
                            z11 = false;
                            i20 = -1472321743;
                            a0Var4 = a0Var2;
                            iD = i17;
                            j14 = jK;
                        }
                    } else {
                        if (i21 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if ((i12 & 4) != 0) {
                            jC = ir.f29311a.c(c0VarR, 6);
                            i13 &= -897;
                        }
                        if (i14 != 0) {
                            fJ = ir.f29311a.j();
                        }
                        if ((i12 & 16) != 0) {
                            jK = ir.f29311a.k(c0VarR, 6);
                            i13 &= -57345;
                        }
                        if (i16 != 0) {
                            iD = ir.f29311a.d();
                            z11 = false;
                            f13 = fJ;
                            j14 = jK;
                            i20 = -1472321743;
                            a0Var4 = a0Var2;
                        } else {
                            f13 = fJ;
                            z11 = false;
                            i20 = -1472321743;
                            a0Var4 = a0Var2;
                            iD = i17;
                            j14 = jK;
                        }
                    }
                    long j17 = jC;
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(i20, i13, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:705)");
                    }
                    if ((i13 & 14) == 4) {
                        z11 = true;
                    }
                    objI0 = c0VarR.i0();
                    if (z11) {
                        objI0 = new Function0() { // from class: androidx.compose.material3.es
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Float.valueOf(os.P(f10));
                            }
                        };
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = new Function0() { // from class: androidx.compose.material3.es
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Float.valueOf(os.P(f10));
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    c0Var2 = c0VarR;
                    I((Function0) objI0, a0Var4, j17, f13, j14, iD, 0.0f, c0Var2, i13 & 524272, 64);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var4;
                    j12 = j17;
                    f12 = f13;
                    j13 = j14;
                    i19 = iD;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var3 = a0Var2;
                    j12 = jC;
                    f12 = fJ;
                    j13 = jK;
                    i19 = i17;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.gs
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return os.Q(f10, a0Var3, j12, f12, j13, i19, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 3072;
            fJ = f11;
            if ((i11 & 24576) == 0) {
                if ((i12 & 16) == 0) {
                    jK = j11;
                    if (c0VarR.L(jK)) {
                    }
                    i13 |= i23;
                } else {
                    jK = j11;
                }
                i13 |= i23;
            } else {
                jK = j11;
            }
            i16 = i12 & 32;
            if (i16 != 0) {
                if ((196608 & i11) == 0) {
                    i17 = i10;
                    if (c0VarR.K(i17)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i13 |= i18;
                }
                if ((i13 & 74899) != 74898) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i13 & 1)) {
                    c0VarR.l0();
                    if ((i11 & 1) != 0) {
                        if (i21 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if ((i12 & 4) != 0) {
                            jC = ir.f29311a.c(c0VarR, 6);
                            i13 &= -897;
                        }
                        if (i14 != 0) {
                            fJ = ir.f29311a.j();
                        }
                        if ((i12 & 16) != 0) {
                            jK = ir.f29311a.k(c0VarR, 6);
                            i13 &= -57345;
                        }
                        if (i16 != 0) {
                            iD = ir.f29311a.d();
                            z11 = false;
                            f13 = fJ;
                            j14 = jK;
                            i20 = -1472321743;
                            a0Var4 = a0Var2;
                        } else {
                            f13 = fJ;
                            z11 = false;
                            i20 = -1472321743;
                            a0Var4 = a0Var2;
                            iD = i17;
                            j14 = jK;
                        }
                    } else {
                        if (i21 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if ((i12 & 4) != 0) {
                            jC = ir.f29311a.c(c0VarR, 6);
                            i13 &= -897;
                        }
                        if (i14 != 0) {
                            fJ = ir.f29311a.j();
                        }
                        if ((i12 & 16) != 0) {
                            jK = ir.f29311a.k(c0VarR, 6);
                            i13 &= -57345;
                        }
                        if (i16 != 0) {
                            iD = ir.f29311a.d();
                            z11 = false;
                            f13 = fJ;
                            j14 = jK;
                            i20 = -1472321743;
                            a0Var4 = a0Var2;
                        } else {
                            f13 = fJ;
                            z11 = false;
                            i20 = -1472321743;
                            a0Var4 = a0Var2;
                            iD = i17;
                            j14 = jK;
                        }
                    }
                    long j18 = jC;
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(i20, i13, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:705)");
                    }
                    if ((i13 & 14) == 4) {
                        z11 = true;
                    }
                    objI0 = c0VarR.i0();
                    if (z11) {
                        objI0 = new Function0() { // from class: androidx.compose.material3.es
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Float.valueOf(os.P(f10));
                            }
                        };
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = new Function0() { // from class: androidx.compose.material3.es
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Float.valueOf(os.P(f10));
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    c0Var2 = c0VarR;
                    I((Function0) objI0, a0Var4, j18, f13, j14, iD, 0.0f, c0Var2, i13 & 524272, 64);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var4;
                    j12 = j18;
                    f12 = f13;
                    j13 = j14;
                    i19 = iD;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var3 = a0Var2;
                    j12 = jC;
                    f12 = fJ;
                    j13 = jK;
                    i19 = i17;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.gs
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return os.Q(f10, a0Var3, j12, f12, j13, i19, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= androidx.profileinstaller.n.c.f73814m;
            i17 = i10;
            if ((i13 & 74899) != 74898) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i13 & 1)) {
                c0VarR.l0();
                if ((i11 & 1) != 0) {
                    if (i21 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if ((i12 & 4) != 0) {
                        jC = ir.f29311a.c(c0VarR, 6);
                        i13 &= -897;
                    }
                    if (i14 != 0) {
                        fJ = ir.f29311a.j();
                    }
                    if ((i12 & 16) != 0) {
                        jK = ir.f29311a.k(c0VarR, 6);
                        i13 &= -57345;
                    }
                    if (i16 != 0) {
                        iD = ir.f29311a.d();
                        z11 = false;
                        f13 = fJ;
                        j14 = jK;
                        i20 = -1472321743;
                        a0Var4 = a0Var2;
                    } else {
                        f13 = fJ;
                        z11 = false;
                        i20 = -1472321743;
                        a0Var4 = a0Var2;
                        iD = i17;
                        j14 = jK;
                    }
                } else {
                    if (i21 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if ((i12 & 4) != 0) {
                        jC = ir.f29311a.c(c0VarR, 6);
                        i13 &= -897;
                    }
                    if (i14 != 0) {
                        fJ = ir.f29311a.j();
                    }
                    if ((i12 & 16) != 0) {
                        jK = ir.f29311a.k(c0VarR, 6);
                        i13 &= -57345;
                    }
                    if (i16 != 0) {
                        iD = ir.f29311a.d();
                        z11 = false;
                        f13 = fJ;
                        j14 = jK;
                        i20 = -1472321743;
                        a0Var4 = a0Var2;
                    } else {
                        f13 = fJ;
                        z11 = false;
                        i20 = -1472321743;
                        a0Var4 = a0Var2;
                        iD = i17;
                        j14 = jK;
                    }
                }
                long j19 = jC;
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(i20, i13, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:705)");
                }
                if ((i13 & 14) == 4) {
                    z11 = true;
                }
                objI0 = c0VarR.i0();
                if (z11) {
                    objI0 = new Function0() { // from class: androidx.compose.material3.es
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Float.valueOf(os.P(f10));
                        }
                    };
                    c0VarR.Y(objI0);
                } else {
                    objI0 = new Function0() { // from class: androidx.compose.material3.es
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Float.valueOf(os.P(f10));
                        }
                    };
                    c0VarR.Y(objI0);
                }
                c0Var2 = c0VarR;
                I((Function0) objI0, a0Var4, j19, f13, j14, iD, 0.0f, c0Var2, i13 & 524272, 64);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var4;
                j12 = j19;
                f12 = f13;
                j13 = j14;
                i19 = iD;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var3 = a0Var2;
                j12 = jC;
                f12 = fJ;
                j13 = jK;
                i19 = i17;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.gs
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return os.Q(f10, a0Var3, j12, f12, j13, i19, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= 48;
        a0Var2 = a0Var;
        if ((i11 & androidx.media3.exoplayer.a5.S0) == 0) {
            if ((i12 & 4) == 0) {
                jC = j10;
                if (c0VarR.L(jC)) {
                }
                i13 |= i22;
            } else {
                jC = j10;
            }
            i13 |= i22;
        } else {
            jC = j10;
        }
        i14 = i12 & 8;
        if (i14 != 0) {
            if ((i11 & 3072) == 0) {
                fJ = f11;
                if (c0VarR.I(fJ)) {
                    i15 = 2048;
                } else {
                    i15 = 1024;
                }
                i13 |= i15;
            }
            if ((i11 & 24576) == 0) {
                if ((i12 & 16) == 0) {
                    jK = j11;
                    if (c0VarR.L(jK)) {
                    }
                    i13 |= i23;
                } else {
                    jK = j11;
                }
                i13 |= i23;
            } else {
                jK = j11;
            }
            i16 = i12 & 32;
            if (i16 != 0) {
                if ((196608 & i11) == 0) {
                    i17 = i10;
                    if (c0VarR.K(i17)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i13 |= i18;
                }
                if ((i13 & 74899) != 74898) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i13 & 1)) {
                    c0VarR.l0();
                    if ((i11 & 1) != 0) {
                        if (i21 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if ((i12 & 4) != 0) {
                            jC = ir.f29311a.c(c0VarR, 6);
                            i13 &= -897;
                        }
                        if (i14 != 0) {
                            fJ = ir.f29311a.j();
                        }
                        if ((i12 & 16) != 0) {
                            jK = ir.f29311a.k(c0VarR, 6);
                            i13 &= -57345;
                        }
                        if (i16 != 0) {
                            iD = ir.f29311a.d();
                            z11 = false;
                            f13 = fJ;
                            j14 = jK;
                            i20 = -1472321743;
                            a0Var4 = a0Var2;
                        } else {
                            f13 = fJ;
                            z11 = false;
                            i20 = -1472321743;
                            a0Var4 = a0Var2;
                            iD = i17;
                            j14 = jK;
                        }
                    } else {
                        if (i21 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if ((i12 & 4) != 0) {
                            jC = ir.f29311a.c(c0VarR, 6);
                            i13 &= -897;
                        }
                        if (i14 != 0) {
                            fJ = ir.f29311a.j();
                        }
                        if ((i12 & 16) != 0) {
                            jK = ir.f29311a.k(c0VarR, 6);
                            i13 &= -57345;
                        }
                        if (i16 != 0) {
                            iD = ir.f29311a.d();
                            z11 = false;
                            f13 = fJ;
                            j14 = jK;
                            i20 = -1472321743;
                            a0Var4 = a0Var2;
                        } else {
                            f13 = fJ;
                            z11 = false;
                            i20 = -1472321743;
                            a0Var4 = a0Var2;
                            iD = i17;
                            j14 = jK;
                        }
                    }
                    long j110 = jC;
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(i20, i13, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:705)");
                    }
                    if ((i13 & 14) == 4) {
                        z11 = true;
                    }
                    objI0 = c0VarR.i0();
                    if (z11) {
                        objI0 = new Function0() { // from class: androidx.compose.material3.es
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Float.valueOf(os.P(f10));
                            }
                        };
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = new Function0() { // from class: androidx.compose.material3.es
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Float.valueOf(os.P(f10));
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    c0Var2 = c0VarR;
                    I((Function0) objI0, a0Var4, j110, f13, j14, iD, 0.0f, c0Var2, i13 & 524272, 64);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var4;
                    j12 = j110;
                    f12 = f13;
                    j13 = j14;
                    i19 = iD;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var3 = a0Var2;
                    j12 = jC;
                    f12 = fJ;
                    j13 = jK;
                    i19 = i17;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.gs
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return os.Q(f10, a0Var3, j12, f12, j13, i19, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= androidx.profileinstaller.n.c.f73814m;
            i17 = i10;
            if ((i13 & 74899) != 74898) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i13 & 1)) {
                c0VarR.l0();
                if ((i11 & 1) != 0) {
                    if (i21 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if ((i12 & 4) != 0) {
                        jC = ir.f29311a.c(c0VarR, 6);
                        i13 &= -897;
                    }
                    if (i14 != 0) {
                        fJ = ir.f29311a.j();
                    }
                    if ((i12 & 16) != 0) {
                        jK = ir.f29311a.k(c0VarR, 6);
                        i13 &= -57345;
                    }
                    if (i16 != 0) {
                        iD = ir.f29311a.d();
                        z11 = false;
                        f13 = fJ;
                        j14 = jK;
                        i20 = -1472321743;
                        a0Var4 = a0Var2;
                    } else {
                        f13 = fJ;
                        z11 = false;
                        i20 = -1472321743;
                        a0Var4 = a0Var2;
                        iD = i17;
                        j14 = jK;
                    }
                } else {
                    if (i21 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if ((i12 & 4) != 0) {
                        jC = ir.f29311a.c(c0VarR, 6);
                        i13 &= -897;
                    }
                    if (i14 != 0) {
                        fJ = ir.f29311a.j();
                    }
                    if ((i12 & 16) != 0) {
                        jK = ir.f29311a.k(c0VarR, 6);
                        i13 &= -57345;
                    }
                    if (i16 != 0) {
                        iD = ir.f29311a.d();
                        z11 = false;
                        f13 = fJ;
                        j14 = jK;
                        i20 = -1472321743;
                        a0Var4 = a0Var2;
                    } else {
                        f13 = fJ;
                        z11 = false;
                        i20 = -1472321743;
                        a0Var4 = a0Var2;
                        iD = i17;
                        j14 = jK;
                    }
                }
                long j111 = jC;
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(i20, i13, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:705)");
                }
                if ((i13 & 14) == 4) {
                    z11 = true;
                }
                objI0 = c0VarR.i0();
                if (z11) {
                    objI0 = new Function0() { // from class: androidx.compose.material3.es
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Float.valueOf(os.P(f10));
                        }
                    };
                    c0VarR.Y(objI0);
                } else {
                    objI0 = new Function0() { // from class: androidx.compose.material3.es
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Float.valueOf(os.P(f10));
                        }
                    };
                    c0VarR.Y(objI0);
                }
                c0Var2 = c0VarR;
                I((Function0) objI0, a0Var4, j111, f13, j14, iD, 0.0f, c0Var2, i13 & 524272, 64);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var4;
                j12 = j111;
                f12 = f13;
                j13 = j14;
                i19 = iD;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var3 = a0Var2;
                j12 = jC;
                f12 = fJ;
                j13 = jK;
                i19 = i17;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.gs
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return os.Q(f10, a0Var3, j12, f12, j13, i19, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= 3072;
        fJ = f11;
        if ((i11 & 24576) == 0) {
            if ((i12 & 16) == 0) {
                jK = j11;
                if (c0VarR.L(jK)) {
                }
                i13 |= i23;
            } else {
                jK = j11;
            }
            i13 |= i23;
        } else {
            jK = j11;
        }
        i16 = i12 & 32;
        if (i16 != 0) {
            if ((196608 & i11) == 0) {
                i17 = i10;
                if (c0VarR.K(i17)) {
                    i18 = 131072;
                } else {
                    i18 = 65536;
                }
                i13 |= i18;
            }
            if ((i13 & 74899) != 74898) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i13 & 1)) {
                c0VarR.l0();
                if ((i11 & 1) != 0) {
                    if (i21 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if ((i12 & 4) != 0) {
                        jC = ir.f29311a.c(c0VarR, 6);
                        i13 &= -897;
                    }
                    if (i14 != 0) {
                        fJ = ir.f29311a.j();
                    }
                    if ((i12 & 16) != 0) {
                        jK = ir.f29311a.k(c0VarR, 6);
                        i13 &= -57345;
                    }
                    if (i16 != 0) {
                        iD = ir.f29311a.d();
                        z11 = false;
                        f13 = fJ;
                        j14 = jK;
                        i20 = -1472321743;
                        a0Var4 = a0Var2;
                    } else {
                        f13 = fJ;
                        z11 = false;
                        i20 = -1472321743;
                        a0Var4 = a0Var2;
                        iD = i17;
                        j14 = jK;
                    }
                } else {
                    if (i21 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if ((i12 & 4) != 0) {
                        jC = ir.f29311a.c(c0VarR, 6);
                        i13 &= -897;
                    }
                    if (i14 != 0) {
                        fJ = ir.f29311a.j();
                    }
                    if ((i12 & 16) != 0) {
                        jK = ir.f29311a.k(c0VarR, 6);
                        i13 &= -57345;
                    }
                    if (i16 != 0) {
                        iD = ir.f29311a.d();
                        z11 = false;
                        f13 = fJ;
                        j14 = jK;
                        i20 = -1472321743;
                        a0Var4 = a0Var2;
                    } else {
                        f13 = fJ;
                        z11 = false;
                        i20 = -1472321743;
                        a0Var4 = a0Var2;
                        iD = i17;
                        j14 = jK;
                    }
                }
                long j112 = jC;
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(i20, i13, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:705)");
                }
                if ((i13 & 14) == 4) {
                    z11 = true;
                }
                objI0 = c0VarR.i0();
                if (z11) {
                    objI0 = new Function0() { // from class: androidx.compose.material3.es
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Float.valueOf(os.P(f10));
                        }
                    };
                    c0VarR.Y(objI0);
                } else {
                    objI0 = new Function0() { // from class: androidx.compose.material3.es
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Float.valueOf(os.P(f10));
                        }
                    };
                    c0VarR.Y(objI0);
                }
                c0Var2 = c0VarR;
                I((Function0) objI0, a0Var4, j112, f13, j14, iD, 0.0f, c0Var2, i13 & 524272, 64);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var4;
                j12 = j112;
                f12 = f13;
                j13 = j14;
                i19 = iD;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var3 = a0Var2;
                j12 = jC;
                f12 = fJ;
                j13 = jK;
                i19 = i17;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.gs
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return os.Q(f10, a0Var3, j12, f12, j13, i19, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= androidx.profileinstaller.n.c.f73814m;
        i17 = i10;
        if ((i13 & 74899) != 74898) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c0VarR.h(z10, i13 & 1)) {
            c0VarR.l0();
            if ((i11 & 1) != 0) {
                if (i21 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                }
                if ((i12 & 4) != 0) {
                    jC = ir.f29311a.c(c0VarR, 6);
                    i13 &= -897;
                }
                if (i14 != 0) {
                    fJ = ir.f29311a.j();
                }
                if ((i12 & 16) != 0) {
                    jK = ir.f29311a.k(c0VarR, 6);
                    i13 &= -57345;
                }
                if (i16 != 0) {
                    iD = ir.f29311a.d();
                    z11 = false;
                    f13 = fJ;
                    j14 = jK;
                    i20 = -1472321743;
                    a0Var4 = a0Var2;
                } else {
                    f13 = fJ;
                    z11 = false;
                    i20 = -1472321743;
                    a0Var4 = a0Var2;
                    iD = i17;
                    j14 = jK;
                }
            } else {
                if (i21 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                }
                if ((i12 & 4) != 0) {
                    jC = ir.f29311a.c(c0VarR, 6);
                    i13 &= -897;
                }
                if (i14 != 0) {
                    fJ = ir.f29311a.j();
                }
                if ((i12 & 16) != 0) {
                    jK = ir.f29311a.k(c0VarR, 6);
                    i13 &= -57345;
                }
                if (i16 != 0) {
                    iD = ir.f29311a.d();
                    z11 = false;
                    f13 = fJ;
                    j14 = jK;
                    i20 = -1472321743;
                    a0Var4 = a0Var2;
                } else {
                    f13 = fJ;
                    z11 = false;
                    i20 = -1472321743;
                    a0Var4 = a0Var2;
                    iD = i17;
                    j14 = jK;
                }
            }
            long j113 = jC;
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(i20, i13, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:705)");
            }
            if ((i13 & 14) == 4) {
                z11 = true;
            }
            objI0 = c0VarR.i0();
            if (z11) {
                objI0 = new Function0() { // from class: androidx.compose.material3.es
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Float.valueOf(os.P(f10));
                    }
                };
                c0VarR.Y(objI0);
            } else {
                objI0 = new Function0() { // from class: androidx.compose.material3.es
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Float.valueOf(os.P(f10));
                    }
                };
                c0VarR.Y(objI0);
            }
            c0Var2 = c0VarR;
            I((Function0) objI0, a0Var4, j113, f13, j14, iD, 0.0f, c0Var2, i13 & 524272, 64);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            a0Var3 = a0Var4;
            j12 = j113;
            f12 = f13;
            j13 = j14;
            i19 = iD;
        } else {
            c0Var2 = c0VarR;
            c0Var2.u();
            a0Var3 = a0Var2;
            j12 = jC;
            f12 = fJ;
            j13 = jK;
            i19 = i17;
        }
        s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.gs
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return os.Q(f10, a0Var3, j12, f12, j13, i19, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public static final float G0() {
        return f31447d;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x012b  */
    /* JADX WARN: Code duplicated, block: B:103:0x013c  */
    /* JADX WARN: Code duplicated, block: B:106:0x016d  */
    /* JADX WARN: Code duplicated, block: B:108:0x0177  */
    /* JADX WARN: Code duplicated, block: B:111:0x0187  */
    /* JADX WARN: Code duplicated, block: B:113:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0048  */
    /* JADX WARN: Code duplicated, block: B:28:0x004c  */
    /* JADX WARN: Code duplicated, block: B:30:0x0054  */
    /* JADX WARN: Code duplicated, block: B:31:0x0057  */
    /* JADX WARN: Code duplicated, block: B:34:0x005d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0063  */
    /* JADX WARN: Code duplicated, block: B:39:0x0068  */
    /* JADX WARN: Code duplicated, block: B:41:0x006c  */
    /* JADX WARN: Code duplicated, block: B:43:0x0074  */
    /* JADX WARN: Code duplicated, block: B:44:0x0077  */
    /* JADX WARN: Code duplicated, block: B:48:0x007e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0082  */
    /* JADX WARN: Code duplicated, block: B:52:0x008a  */
    /* JADX WARN: Code duplicated, block: B:53:0x008d  */
    /* JADX WARN: Code duplicated, block: B:56:0x0093  */
    /* JADX WARN: Code duplicated, block: B:59:0x009b  */
    /* JADX WARN: Code duplicated, block: B:61:0x009f  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:65:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:71:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:76:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:86:0x00ef A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:87:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:91:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:93:0x0104  */
    /* JADX WARN: Code duplicated, block: B:96:0x0110  */
    /* JADX WARN: Code duplicated, block: B:98:0x011a  */
    @androidx.compose.runtime.o
    @kotlin.l(level = kotlin.n.HIDDEN, message = "Use the overload that takes `gapSize`, see `LegacyCircularProgressIndicatorSample` on how to restore the previous behavior", replaceWith = @kotlin.b1(expression = "CircularProgressIndicator(progress, modifier, color, strokeWidth, trackColor, strokeCap, gapSize)", imports = {}))
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final /* synthetic */ void H(final Function0 function0, androidx.compose.ui.a0 a0Var, long j10, float f10, long j11, int i10, androidx.compose.runtime.c0 c0Var, final int i11, final int i12) {
        Function0 function1;
        int i13;
        androidx.compose.ui.a0 a0Var2;
        long jC;
        int i14;
        float fJ;
        int i15;
        long jE;
        int i16;
        int i17;
        int i18;
        boolean z10;
        androidx.compose.runtime.c0 c0Var2;
        final androidx.compose.ui.a0 a0Var3;
        final long j12;
        final float f11;
        final long j13;
        final int i19;
        androidx.compose.runtime.s5 s5VarT;
        androidx.compose.ui.a0 a0Var4;
        int iD;
        int i20;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-761680467);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
            function1 = function0;
        } else {
            function1 = function0;
            if ((i11 & 6) == 0) {
                i13 = (c0VarR.k0(function1) ? 4 : 2) | i11;
            } else {
                i13 = i11;
            }
        }
        int i21 = i12 & 2;
        if (i21 == 0) {
            if ((i11 & 48) == 0) {
                a0Var2 = a0Var;
                i13 |= c0VarR.D(a0Var2) ? 32 : 16;
            }
            if ((i11 & androidx.media3.exoplayer.a5.S0) == 0) {
                if ((i12 & 4) == 0) {
                    jC = j10;
                    int i22 = c0VarR.L(jC) ? 256 : 128;
                    i13 |= i22;
                } else {
                    jC = j10;
                }
                i13 |= i22;
            } else {
                jC = j10;
            }
            i14 = i12 & 8;
            if (i14 != 0) {
                if ((i11 & 3072) == 0) {
                    fJ = f10;
                    if (c0VarR.I(fJ)) {
                        i15 = 2048;
                    } else {
                        i15 = 1024;
                    }
                    i13 |= i15;
                }
                if ((i11 & 24576) == 0) {
                    if ((i12 & 16) == 0) {
                        jE = j11;
                        int i23 = c0VarR.L(jE) ? 16384 : 8192;
                        i13 |= i23;
                    } else {
                        jE = j11;
                    }
                    i13 |= i23;
                } else {
                    jE = j11;
                }
                i16 = i12 & 32;
                if (i16 != 0) {
                    if ((196608 & i11) == 0) {
                        i17 = i10;
                        if (c0VarR.K(i17)) {
                            i18 = 131072;
                        } else {
                            i18 = 65536;
                        }
                        i13 |= i18;
                    }
                    if ((74899 & i13) != 74898) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i13 & 1)) {
                        c0VarR.l0();
                        if ((i11 & 1) != 0 || c0VarR.y()) {
                            if (i21 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if ((i12 & 4) != 0) {
                                jC = ir.f29311a.c(c0VarR, 6);
                                i13 &= -897;
                            }
                            if (i14 != 0) {
                                fJ = ir.f29311a.j();
                            }
                            if ((i12 & 16) != 0) {
                                i13 &= -57345;
                                jE = ir.f29311a.e(c0VarR, 6);
                            }
                            if (i16 != 0) {
                                iD = ir.f29311a.d();
                            } else {
                                iD = i17;
                            }
                            i20 = -761680467;
                        } else {
                            c0VarR.u();
                            if ((i12 & 4) != 0) {
                                i13 &= -897;
                            }
                            if ((i12 & 16) != 0) {
                                i13 &= -57345;
                            }
                            jE = jE;
                            iD = i17;
                            i20 = -761680467;
                            a0Var4 = a0Var2;
                            jC = jC;
                            fJ = fJ;
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(i20, i13, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:480)");
                        }
                        c0Var2 = c0VarR;
                        I(function1, a0Var4, jC, fJ, jE, iD, ir.f29311a.h(), c0Var2, (i13 & 14) | 1572864 | (i13 & com.planner5d.library.engine.input.f.b.B) | (i13 & 896) | (i13 & 7168) | (57344 & i13) | (i13 & 458752), 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var4;
                        j12 = jC;
                        f11 = fJ;
                        j13 = jE;
                        i19 = iD;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        a0Var3 = a0Var2;
                        j12 = jC;
                        f11 = fJ;
                        j13 = jE;
                        i19 = i17;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.ur
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return os.O(function0, a0Var3, j12, f11, j13, i19, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i13 |= androidx.profileinstaller.n.c.f73814m;
                i17 = i10;
                if ((74899 & i13) != 74898) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i13 & 1)) {
                    c0VarR.l0();
                    if ((i11 & 1) != 0) {
                        if (i21 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if ((i12 & 4) != 0) {
                            jC = ir.f29311a.c(c0VarR, 6);
                            i13 &= -897;
                        }
                        if (i14 != 0) {
                            fJ = ir.f29311a.j();
                        }
                        if ((i12 & 16) != 0) {
                            i13 &= -57345;
                            jE = ir.f29311a.e(c0VarR, 6);
                        }
                        if (i16 != 0) {
                            iD = ir.f29311a.d();
                        } else {
                            iD = i17;
                        }
                        i20 = -761680467;
                    } else {
                        if (i21 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if ((i12 & 4) != 0) {
                            jC = ir.f29311a.c(c0VarR, 6);
                            i13 &= -897;
                        }
                        if (i14 != 0) {
                            fJ = ir.f29311a.j();
                        }
                        if ((i12 & 16) != 0) {
                            i13 &= -57345;
                            jE = ir.f29311a.e(c0VarR, 6);
                        }
                        if (i16 != 0) {
                            iD = ir.f29311a.d();
                        } else {
                            iD = i17;
                        }
                        i20 = -761680467;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(i20, i13, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:480)");
                    }
                    c0Var2 = c0VarR;
                    I(function1, a0Var4, jC, fJ, jE, iD, ir.f29311a.h(), c0Var2, (i13 & 14) | 1572864 | (i13 & com.planner5d.library.engine.input.f.b.B) | (i13 & 896) | (i13 & 7168) | (57344 & i13) | (i13 & 458752), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var4;
                    j12 = jC;
                    f11 = fJ;
                    j13 = jE;
                    i19 = iD;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var3 = a0Var2;
                    j12 = jC;
                    f11 = fJ;
                    j13 = jE;
                    i19 = i17;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.ur
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return os.O(function0, a0Var3, j12, f11, j13, i19, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 3072;
            fJ = f10;
            if ((i11 & 24576) == 0) {
                if ((i12 & 16) == 0) {
                    jE = j11;
                    if (c0VarR.L(jE)) {
                    }
                    i13 |= i23;
                } else {
                    jE = j11;
                }
                i13 |= i23;
            } else {
                jE = j11;
            }
            i16 = i12 & 32;
            if (i16 != 0) {
                if ((196608 & i11) == 0) {
                    i17 = i10;
                    if (c0VarR.K(i17)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i13 |= i18;
                }
                if ((74899 & i13) != 74898) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i13 & 1)) {
                    c0VarR.l0();
                    if ((i11 & 1) != 0) {
                        if (i21 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if ((i12 & 4) != 0) {
                            jC = ir.f29311a.c(c0VarR, 6);
                            i13 &= -897;
                        }
                        if (i14 != 0) {
                            fJ = ir.f29311a.j();
                        }
                        if ((i12 & 16) != 0) {
                            i13 &= -57345;
                            jE = ir.f29311a.e(c0VarR, 6);
                        }
                        if (i16 != 0) {
                            iD = ir.f29311a.d();
                        } else {
                            iD = i17;
                        }
                        i20 = -761680467;
                    } else {
                        if (i21 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if ((i12 & 4) != 0) {
                            jC = ir.f29311a.c(c0VarR, 6);
                            i13 &= -897;
                        }
                        if (i14 != 0) {
                            fJ = ir.f29311a.j();
                        }
                        if ((i12 & 16) != 0) {
                            i13 &= -57345;
                            jE = ir.f29311a.e(c0VarR, 6);
                        }
                        if (i16 != 0) {
                            iD = ir.f29311a.d();
                        } else {
                            iD = i17;
                        }
                        i20 = -761680467;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(i20, i13, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:480)");
                    }
                    c0Var2 = c0VarR;
                    I(function1, a0Var4, jC, fJ, jE, iD, ir.f29311a.h(), c0Var2, (i13 & 14) | 1572864 | (i13 & com.planner5d.library.engine.input.f.b.B) | (i13 & 896) | (i13 & 7168) | (57344 & i13) | (i13 & 458752), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var4;
                    j12 = jC;
                    f11 = fJ;
                    j13 = jE;
                    i19 = iD;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var3 = a0Var2;
                    j12 = jC;
                    f11 = fJ;
                    j13 = jE;
                    i19 = i17;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.ur
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return os.O(function0, a0Var3, j12, f11, j13, i19, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= androidx.profileinstaller.n.c.f73814m;
            i17 = i10;
            if ((74899 & i13) != 74898) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i13 & 1)) {
                c0VarR.l0();
                if ((i11 & 1) != 0) {
                    if (i21 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if ((i12 & 4) != 0) {
                        jC = ir.f29311a.c(c0VarR, 6);
                        i13 &= -897;
                    }
                    if (i14 != 0) {
                        fJ = ir.f29311a.j();
                    }
                    if ((i12 & 16) != 0) {
                        i13 &= -57345;
                        jE = ir.f29311a.e(c0VarR, 6);
                    }
                    if (i16 != 0) {
                        iD = ir.f29311a.d();
                    } else {
                        iD = i17;
                    }
                    i20 = -761680467;
                } else {
                    if (i21 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if ((i12 & 4) != 0) {
                        jC = ir.f29311a.c(c0VarR, 6);
                        i13 &= -897;
                    }
                    if (i14 != 0) {
                        fJ = ir.f29311a.j();
                    }
                    if ((i12 & 16) != 0) {
                        i13 &= -57345;
                        jE = ir.f29311a.e(c0VarR, 6);
                    }
                    if (i16 != 0) {
                        iD = ir.f29311a.d();
                    } else {
                        iD = i17;
                    }
                    i20 = -761680467;
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(i20, i13, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:480)");
                }
                c0Var2 = c0VarR;
                I(function1, a0Var4, jC, fJ, jE, iD, ir.f29311a.h(), c0Var2, (i13 & 14) | 1572864 | (i13 & com.planner5d.library.engine.input.f.b.B) | (i13 & 896) | (i13 & 7168) | (57344 & i13) | (i13 & 458752), 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var4;
                j12 = jC;
                f11 = fJ;
                j13 = jE;
                i19 = iD;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var3 = a0Var2;
                j12 = jC;
                f11 = fJ;
                j13 = jE;
                i19 = i17;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.ur
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return os.O(function0, a0Var3, j12, f11, j13, i19, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= 48;
        a0Var2 = a0Var;
        if ((i11 & androidx.media3.exoplayer.a5.S0) == 0) {
            if ((i12 & 4) == 0) {
                jC = j10;
                if (c0VarR.L(jC)) {
                }
                i13 |= i22;
            } else {
                jC = j10;
            }
            i13 |= i22;
        } else {
            jC = j10;
        }
        i14 = i12 & 8;
        if (i14 != 0) {
            if ((i11 & 3072) == 0) {
                fJ = f10;
                if (c0VarR.I(fJ)) {
                    i15 = 2048;
                } else {
                    i15 = 1024;
                }
                i13 |= i15;
            }
            if ((i11 & 24576) == 0) {
                if ((i12 & 16) == 0) {
                    jE = j11;
                    if (c0VarR.L(jE)) {
                    }
                    i13 |= i23;
                } else {
                    jE = j11;
                }
                i13 |= i23;
            } else {
                jE = j11;
            }
            i16 = i12 & 32;
            if (i16 != 0) {
                if ((196608 & i11) == 0) {
                    i17 = i10;
                    if (c0VarR.K(i17)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i13 |= i18;
                }
                if ((74899 & i13) != 74898) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i13 & 1)) {
                    c0VarR.l0();
                    if ((i11 & 1) != 0) {
                        if (i21 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if ((i12 & 4) != 0) {
                            jC = ir.f29311a.c(c0VarR, 6);
                            i13 &= -897;
                        }
                        if (i14 != 0) {
                            fJ = ir.f29311a.j();
                        }
                        if ((i12 & 16) != 0) {
                            i13 &= -57345;
                            jE = ir.f29311a.e(c0VarR, 6);
                        }
                        if (i16 != 0) {
                            iD = ir.f29311a.d();
                        } else {
                            iD = i17;
                        }
                        i20 = -761680467;
                    } else {
                        if (i21 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if ((i12 & 4) != 0) {
                            jC = ir.f29311a.c(c0VarR, 6);
                            i13 &= -897;
                        }
                        if (i14 != 0) {
                            fJ = ir.f29311a.j();
                        }
                        if ((i12 & 16) != 0) {
                            i13 &= -57345;
                            jE = ir.f29311a.e(c0VarR, 6);
                        }
                        if (i16 != 0) {
                            iD = ir.f29311a.d();
                        } else {
                            iD = i17;
                        }
                        i20 = -761680467;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(i20, i13, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:480)");
                    }
                    c0Var2 = c0VarR;
                    I(function1, a0Var4, jC, fJ, jE, iD, ir.f29311a.h(), c0Var2, (i13 & 14) | 1572864 | (i13 & com.planner5d.library.engine.input.f.b.B) | (i13 & 896) | (i13 & 7168) | (57344 & i13) | (i13 & 458752), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var4;
                    j12 = jC;
                    f11 = fJ;
                    j13 = jE;
                    i19 = iD;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var3 = a0Var2;
                    j12 = jC;
                    f11 = fJ;
                    j13 = jE;
                    i19 = i17;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.ur
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return os.O(function0, a0Var3, j12, f11, j13, i19, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= androidx.profileinstaller.n.c.f73814m;
            i17 = i10;
            if ((74899 & i13) != 74898) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i13 & 1)) {
                c0VarR.l0();
                if ((i11 & 1) != 0) {
                    if (i21 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if ((i12 & 4) != 0) {
                        jC = ir.f29311a.c(c0VarR, 6);
                        i13 &= -897;
                    }
                    if (i14 != 0) {
                        fJ = ir.f29311a.j();
                    }
                    if ((i12 & 16) != 0) {
                        i13 &= -57345;
                        jE = ir.f29311a.e(c0VarR, 6);
                    }
                    if (i16 != 0) {
                        iD = ir.f29311a.d();
                    } else {
                        iD = i17;
                    }
                    i20 = -761680467;
                } else {
                    if (i21 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if ((i12 & 4) != 0) {
                        jC = ir.f29311a.c(c0VarR, 6);
                        i13 &= -897;
                    }
                    if (i14 != 0) {
                        fJ = ir.f29311a.j();
                    }
                    if ((i12 & 16) != 0) {
                        i13 &= -57345;
                        jE = ir.f29311a.e(c0VarR, 6);
                    }
                    if (i16 != 0) {
                        iD = ir.f29311a.d();
                    } else {
                        iD = i17;
                    }
                    i20 = -761680467;
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(i20, i13, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:480)");
                }
                c0Var2 = c0VarR;
                I(function1, a0Var4, jC, fJ, jE, iD, ir.f29311a.h(), c0Var2, (i13 & 14) | 1572864 | (i13 & com.planner5d.library.engine.input.f.b.B) | (i13 & 896) | (i13 & 7168) | (57344 & i13) | (i13 & 458752), 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var4;
                j12 = jC;
                f11 = fJ;
                j13 = jE;
                i19 = iD;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var3 = a0Var2;
                j12 = jC;
                f11 = fJ;
                j13 = jE;
                i19 = i17;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.ur
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return os.O(function0, a0Var3, j12, f11, j13, i19, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= 3072;
        fJ = f10;
        if ((i11 & 24576) == 0) {
            if ((i12 & 16) == 0) {
                jE = j11;
                if (c0VarR.L(jE)) {
                }
                i13 |= i23;
            } else {
                jE = j11;
            }
            i13 |= i23;
        } else {
            jE = j11;
        }
        i16 = i12 & 32;
        if (i16 != 0) {
            if ((196608 & i11) == 0) {
                i17 = i10;
                if (c0VarR.K(i17)) {
                    i18 = 131072;
                } else {
                    i18 = 65536;
                }
                i13 |= i18;
            }
            if ((74899 & i13) != 74898) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i13 & 1)) {
                c0VarR.l0();
                if ((i11 & 1) != 0) {
                    if (i21 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if ((i12 & 4) != 0) {
                        jC = ir.f29311a.c(c0VarR, 6);
                        i13 &= -897;
                    }
                    if (i14 != 0) {
                        fJ = ir.f29311a.j();
                    }
                    if ((i12 & 16) != 0) {
                        i13 &= -57345;
                        jE = ir.f29311a.e(c0VarR, 6);
                    }
                    if (i16 != 0) {
                        iD = ir.f29311a.d();
                    } else {
                        iD = i17;
                    }
                    i20 = -761680467;
                } else {
                    if (i21 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if ((i12 & 4) != 0) {
                        jC = ir.f29311a.c(c0VarR, 6);
                        i13 &= -897;
                    }
                    if (i14 != 0) {
                        fJ = ir.f29311a.j();
                    }
                    if ((i12 & 16) != 0) {
                        i13 &= -57345;
                        jE = ir.f29311a.e(c0VarR, 6);
                    }
                    if (i16 != 0) {
                        iD = ir.f29311a.d();
                    } else {
                        iD = i17;
                    }
                    i20 = -761680467;
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(i20, i13, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:480)");
                }
                c0Var2 = c0VarR;
                I(function1, a0Var4, jC, fJ, jE, iD, ir.f29311a.h(), c0Var2, (i13 & 14) | 1572864 | (i13 & com.planner5d.library.engine.input.f.b.B) | (i13 & 896) | (i13 & 7168) | (57344 & i13) | (i13 & 458752), 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var4;
                j12 = jC;
                f11 = fJ;
                j13 = jE;
                i19 = iD;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var3 = a0Var2;
                j12 = jC;
                f11 = fJ;
                j13 = jE;
                i19 = i17;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.ur
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return os.O(function0, a0Var3, j12, f11, j13, i19, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= androidx.profileinstaller.n.c.f73814m;
        i17 = i10;
        if ((74899 & i13) != 74898) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c0VarR.h(z10, i13 & 1)) {
            c0VarR.l0();
            if ((i11 & 1) != 0) {
                if (i21 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if ((i12 & 4) != 0) {
                    jC = ir.f29311a.c(c0VarR, 6);
                    i13 &= -897;
                }
                if (i14 != 0) {
                    fJ = ir.f29311a.j();
                }
                if ((i12 & 16) != 0) {
                    i13 &= -57345;
                    jE = ir.f29311a.e(c0VarR, 6);
                }
                if (i16 != 0) {
                    iD = ir.f29311a.d();
                } else {
                    iD = i17;
                }
                i20 = -761680467;
            } else {
                if (i21 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if ((i12 & 4) != 0) {
                    jC = ir.f29311a.c(c0VarR, 6);
                    i13 &= -897;
                }
                if (i14 != 0) {
                    fJ = ir.f29311a.j();
                }
                if ((i12 & 16) != 0) {
                    i13 &= -57345;
                    jE = ir.f29311a.e(c0VarR, 6);
                }
                if (i16 != 0) {
                    iD = ir.f29311a.d();
                } else {
                    iD = i17;
                }
                i20 = -761680467;
            }
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(i20, i13, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:480)");
            }
            c0Var2 = c0VarR;
            I(function1, a0Var4, jC, fJ, jE, iD, ir.f29311a.h(), c0Var2, (i13 & 14) | 1572864 | (i13 & com.planner5d.library.engine.input.f.b.B) | (i13 & 896) | (i13 & 7168) | (57344 & i13) | (i13 & 458752), 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            a0Var3 = a0Var4;
            j12 = jC;
            f11 = fJ;
            j13 = jE;
            i19 = iD;
        } else {
            c0Var2 = c0VarR;
            c0Var2.u();
            a0Var3 = a0Var2;
            j12 = jC;
            f11 = fJ;
            j13 = jE;
            i19 = i17;
        }
        s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.ur
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return os.O(function0, a0Var3, j12, f11, j13, i19, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @NotNull
    public static final androidx.compose.animation.core.e0 H0() {
        return f31458o;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0121  */
    /* JADX WARN: Code duplicated, block: B:104:0x012c  */
    /* JADX WARN: Code duplicated, block: B:105:0x0136  */
    /* JADX WARN: Code duplicated, block: B:107:0x0139  */
    /* JADX WARN: Code duplicated, block: B:109:0x0142  */
    /* JADX WARN: Code duplicated, block: B:112:0x0154  */
    /* JADX WARN: Code duplicated, block: B:115:0x0162  */
    /* JADX WARN: Code duplicated, block: B:116:0x0164  */
    /* JADX WARN: Code duplicated, block: B:119:0x016b  */
    /* JADX WARN: Code duplicated, block: B:121:0x0173  */
    /* JADX WARN: Code duplicated, block: B:124:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:126:0x01be  */
    /* JADX WARN: Code duplicated, block: B:129:0x01dd  */
    /* JADX WARN: Code duplicated, block: B:130:0x01df  */
    /* JADX WARN: Code duplicated, block: B:133:0x01e8  */
    /* JADX WARN: Code duplicated, block: B:134:0x01ea  */
    /* JADX WARN: Code duplicated, block: B:137:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:138:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:141:0x0200  */
    /* JADX WARN: Code duplicated, block: B:143:0x0206  */
    /* JADX WARN: Code duplicated, block: B:149:0x021b  */
    /* JADX WARN: Code duplicated, block: B:151:0x0221  */
    /* JADX WARN: Code duplicated, block: B:157:0x0232  */
    /* JADX WARN: Code duplicated, block: B:161:0x0244  */
    /* JADX WARN: Code duplicated, block: B:164:0x0266  */
    /* JADX WARN: Code duplicated, block: B:166:0x0270  */
    /* JADX WARN: Code duplicated, block: B:169:0x0282  */
    /* JADX WARN: Code duplicated, block: B:171:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0048  */
    /* JADX WARN: Code duplicated, block: B:31:0x0057  */
    /* JADX WARN: Code duplicated, block: B:33:0x005b  */
    /* JADX WARN: Code duplicated, block: B:36:0x0061  */
    /* JADX WARN: Code duplicated, block: B:38:0x0066  */
    /* JADX WARN: Code duplicated, block: B:40:0x006a  */
    /* JADX WARN: Code duplicated, block: B:42:0x0072  */
    /* JADX WARN: Code duplicated, block: B:43:0x0075  */
    /* JADX WARN: Code duplicated, block: B:47:0x007c  */
    /* JADX WARN: Code duplicated, block: B:49:0x0082  */
    /* JADX WARN: Code duplicated, block: B:52:0x008b  */
    /* JADX WARN: Code duplicated, block: B:54:0x0090  */
    /* JADX WARN: Code duplicated, block: B:57:0x0098  */
    /* JADX WARN: Code duplicated, block: B:58:0x009d  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:68:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:77:0x00db  */
    /* JADX WARN: Code duplicated, block: B:78:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:93:0x0106 A[PHI: r3 r6 r7 r11 r13 r15
      0x0106: PHI (r3v32 int) = (r3v23 int), (r3v34 int) binds: [B:108:0x0140, B:92:0x0105] A[DONT_GENERATE, DONT_INLINE]
      0x0106: PHI (r6v8 androidx.compose.ui.a0) = (r6v5 androidx.compose.ui.a0), (r6v2 androidx.compose.ui.a0) binds: [B:108:0x0140, B:92:0x0105] A[DONT_GENERATE, DONT_INLINE]
      0x0106: PHI (r7v10 long) = (r7v7 long), (r7v11 long) binds: [B:108:0x0140, B:92:0x0105] A[DONT_GENERATE, DONT_INLINE]
      0x0106: PHI (r11v6 long) = (r11v3 long), (r11v1 long) binds: [B:108:0x0140, B:92:0x0105] A[DONT_GENERATE, DONT_INLINE]
      0x0106: PHI (r13v6 float) = (r13v3 float), (r13v2 float) binds: [B:108:0x0140, B:92:0x0105] A[DONT_GENERATE, DONT_INLINE]
      0x0106: PHI (r15v12 int) = (r15v2 int), (r15v1 int) binds: [B:108:0x0140, B:92:0x0105] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:95:0x010b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:96:0x010d  */
    /* JADX WARN: Code duplicated, block: B:99:0x0117  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void I(@NotNull final Function0<Float> function0, @Nullable androidx.compose.ui.a0 a0Var, long j10, float f10, long j11, int i10, float f11, @Nullable androidx.compose.runtime.c0 c0Var, final int i11, final int i12) {
        int i13;
        androidx.compose.ui.a0 a0Var2;
        long jC;
        int i14;
        float fJ;
        int i15;
        long j12;
        int i16;
        int iD;
        int i17;
        int i18;
        float f12;
        int i19;
        boolean z10;
        final long j13;
        final float f13;
        final float fH;
        final int i20;
        androidx.compose.runtime.s5 s5VarT;
        long jE;
        boolean z11;
        Object objI0;
        final Function0 function1;
        final androidx.compose.ui.graphics.drawscope.n nVar;
        boolean zD;
        Object objI1;
        boolean z12;
        boolean z13;
        boolean z14;
        boolean zK0;
        Object objI2;
        final long j14;
        final long j15;
        final float f14;
        int i21;
        int i22;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1798883595);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (c0VarR.k0(function0) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i23 = i12 & 2;
        if (i23 == 0) {
            if ((i11 & 48) == 0) {
                a0Var2 = a0Var;
                i13 |= c0VarR.D(a0Var2) ? 32 : 16;
            }
            if ((i11 & androidx.media3.exoplayer.a5.S0) == 0) {
                jC = j10;
                if ((i12 & 4) == 0 || !c0VarR.L(jC)) {
                    i22 = 128;
                } else {
                    i22 = 256;
                }
                i13 |= i22;
            } else {
                jC = j10;
            }
            i14 = i12 & 8;
            if (i14 != 0) {
                if ((i11 & 3072) == 0) {
                    fJ = f10;
                    if (c0VarR.I(fJ)) {
                        i15 = 2048;
                    } else {
                        i15 = 1024;
                    }
                    i13 |= i15;
                }
                if ((i11 & 24576) == 0) {
                    j12 = j11;
                    if ((i12 & 16) == 0 || !c0VarR.L(j12)) {
                        i21 = 8192;
                    } else {
                        i21 = 16384;
                    }
                    i13 |= i21;
                } else {
                    j12 = j11;
                }
                i16 = i12 & 32;
                if (i16 != 0) {
                    i13 |= androidx.profileinstaller.n.c.f73814m;
                    iD = i10;
                } else {
                    iD = i10;
                    if ((i11 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        if (c0VarR.K(iD)) {
                            i17 = 131072;
                        } else {
                            i17 = 65536;
                        }
                        i13 |= i17;
                    }
                }
                i18 = i12 & 64;
                if (i18 != 0) {
                    i13 |= 1572864;
                    f12 = f11;
                } else {
                    f12 = f11;
                    if ((i11 & 1572864) == 0) {
                        if (c0VarR.I(f12)) {
                            i19 = 1048576;
                        } else {
                            i19 = 524288;
                        }
                        i13 |= i19;
                    }
                }
                if ((i13 & 599187) != 599186) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i13 & 1)) {
                    c0VarR.l0();
                    if ((i11 & 1) != 0 || c0VarR.y()) {
                        if (i23 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if ((i12 & 4) != 0) {
                            jC = ir.f29311a.c(c0VarR, 6);
                            i13 &= -897;
                        }
                        if (i14 != 0) {
                            fJ = ir.f29311a.j();
                        }
                        if ((i12 & 16) != 0) {
                            jE = ir.f29311a.e(c0VarR, 6);
                            i13 &= -57345;
                        } else {
                            jE = j12;
                        }
                        if (i16 != 0) {
                            iD = ir.f29311a.d();
                        }
                        if (i18 != 0) {
                            fH = ir.f29311a.h();
                        }
                        i20 = iD;
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-1798883595, i13, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:526)");
                        }
                        if ((i13 & 14) == 4) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        objI0 = c0VarR.i0();
                        if (z11 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = new Function0() { // from class: androidx.compose.material3.hs
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Float.valueOf(os.R(function0));
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        function1 = (Function0) objI0;
                        nVar = new androidx.compose.ui.graphics.drawscope.n(((androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m())).S7(fJ), 0.0f, i20, 0, null, 26, null);
                        zD = c0VarR.D(function1);
                        objI1 = c0VarR.i0();
                        if (zD || objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI1 = new Function1() { // from class: androidx.compose.material3.is
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return os.S(function1, (androidx.compose.ui.semantics.e0) obj);
                                }
                            };
                            c0VarR.Y(objI1);
                        }
                        androidx.compose.ui.a0 a0VarW = androidx.compose.foundation.layout.i6.w(androidx.compose.ui.semantics.t.e(a0Var2, true, (Function1) objI1), f31447d);
                        boolean zD2 = c0VarR.D(function1);
                        if ((458752 & i13) == 131072) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        boolean z15 = z12 | zD2;
                        if ((3670016 & i13) == 1048576) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        boolean z16 = z15 | z13;
                        if ((i13 & 7168) == 2048) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        zK0 = z16 | z14 | ((((57344 & i13) ^ 24576) <= 16384 && c0VarR.L(jE)) || (i13 & 24576) == 16384) | c0VarR.k0(nVar) | ((((i13 & 896) ^ androidx.media3.exoplayer.a5.S0) <= 256 && c0VarR.L(jC)) || (i13 & androidx.media3.exoplayer.a5.S0) == 256);
                        objI2 = c0VarR.i0();
                        if (!zK0 || objI2 == androidx.compose.runtime.c0.f35327a.a()) {
                            j14 = jE;
                            j15 = jC;
                            f14 = fJ;
                            objI2 = new Function1() { // from class: androidx.compose.material3.js
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return os.T(function1, i20, fH, f14, j14, nVar, j15, (androidx.compose.ui.graphics.drawscope.f) obj);
                                }
                            };
                            c0VarR.Y(objI2);
                        } else {
                            j14 = jE;
                            j15 = jC;
                            f14 = fJ;
                        }
                        androidx.compose.foundation.f1.e(a0VarW, (Function1) objI2, c0VarR, 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        f13 = f14;
                        j12 = j14;
                        j13 = j15;
                    } else {
                        c0VarR.u();
                        if ((i12 & 4) != 0) {
                            i13 &= -897;
                        }
                        if ((i12 & 16) != 0) {
                            i13 &= -57345;
                        }
                        jE = j12;
                    }
                    fH = f12;
                    i20 = iD;
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1798883595, i13, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:526)");
                    }
                    if ((i13 & 14) == 4) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    objI0 = c0VarR.i0();
                    if (z11) {
                        objI0 = new Function0() { // from class: androidx.compose.material3.hs
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Float.valueOf(os.R(function0));
                            }
                        };
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = new Function0() { // from class: androidx.compose.material3.hs
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Float.valueOf(os.R(function0));
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    function1 = (Function0) objI0;
                    nVar = new androidx.compose.ui.graphics.drawscope.n(((androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m())).S7(fJ), 0.0f, i20, 0, null, 26, null);
                    zD = c0VarR.D(function1);
                    objI1 = c0VarR.i0();
                    if (zD) {
                        objI1 = new Function1() { // from class: androidx.compose.material3.is
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return os.S(function1, (androidx.compose.ui.semantics.e0) obj);
                            }
                        };
                        c0VarR.Y(objI1);
                    } else {
                        objI1 = new Function1() { // from class: androidx.compose.material3.is
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return os.S(function1, (androidx.compose.ui.semantics.e0) obj);
                            }
                        };
                        c0VarR.Y(objI1);
                    }
                    androidx.compose.ui.a0 a0VarW2 = androidx.compose.foundation.layout.i6.w(androidx.compose.ui.semantics.t.e(a0Var2, true, (Function1) objI1), f31447d);
                    boolean zD3 = c0VarR.D(function1);
                    if ((458752 & i13) == 131072) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    boolean z17 = z12 | zD3;
                    if ((3670016 & i13) == 1048576) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    boolean z18 = z17 | z13;
                    if ((i13 & 7168) == 2048) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    zK0 = z18 | z14 | ((((57344 & i13) ^ 24576) <= 16384 && c0VarR.L(jE)) || (i13 & 24576) == 16384) | c0VarR.k0(nVar) | ((((i13 & 896) ^ androidx.media3.exoplayer.a5.S0) <= 256 && c0VarR.L(jC)) || (i13 & androidx.media3.exoplayer.a5.S0) == 256);
                    objI2 = c0VarR.i0();
                    if (zK0) {
                        j14 = jE;
                        j15 = jC;
                        f14 = fJ;
                        objI2 = new Function1() { // from class: androidx.compose.material3.js
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return os.T(function1, i20, fH, f14, j14, nVar, j15, (androidx.compose.ui.graphics.drawscope.f) obj);
                            }
                        };
                        c0VarR.Y(objI2);
                    } else {
                        j14 = jE;
                        j15 = jC;
                        f14 = fJ;
                        objI2 = new Function1() { // from class: androidx.compose.material3.js
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return os.T(function1, i20, fH, f14, j14, nVar, j15, (androidx.compose.ui.graphics.drawscope.f) obj);
                            }
                        };
                        c0VarR.Y(objI2);
                    }
                    androidx.compose.foundation.f1.e(a0VarW2, (Function1) objI2, c0VarR, 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    f13 = f14;
                    j12 = j14;
                    j13 = j15;
                } else {
                    c0VarR.u();
                    j13 = jC;
                    f13 = fJ;
                    fH = f12;
                    i20 = iD;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    final androidx.compose.ui.a0 a0Var3 = a0Var2;
                    final long j16 = j12;
                    final int i24 = i20;
                    final float f15 = fH;
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.ks
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return os.U(function0, a0Var3, j13, f13, j16, i24, f15, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 3072;
            fJ = f10;
            if ((i11 & 24576) == 0) {
                j12 = j11;
                if ((i12 & 16) == 0) {
                    i21 = 8192;
                } else {
                    i21 = 8192;
                }
                i13 |= i21;
            } else {
                j12 = j11;
            }
            i16 = i12 & 32;
            if (i16 != 0) {
                i13 |= androidx.profileinstaller.n.c.f73814m;
                iD = i10;
            } else {
                iD = i10;
                if ((i11 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    if (c0VarR.K(iD)) {
                        i17 = 131072;
                    } else {
                        i17 = 65536;
                    }
                    i13 |= i17;
                }
            }
            i18 = i12 & 64;
            if (i18 != 0) {
                i13 |= 1572864;
                f12 = f11;
            } else {
                f12 = f11;
                if ((i11 & 1572864) == 0) {
                    if (c0VarR.I(f12)) {
                        i19 = 1048576;
                    } else {
                        i19 = 524288;
                    }
                    i13 |= i19;
                }
            }
            if ((i13 & 599187) != 599186) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i13 & 1)) {
                c0VarR.l0();
                if ((i11 & 1) != 0) {
                    if (i23 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if ((i12 & 4) != 0) {
                        jC = ir.f29311a.c(c0VarR, 6);
                        i13 &= -897;
                    }
                    if (i14 != 0) {
                        fJ = ir.f29311a.j();
                    }
                    if ((i12 & 16) != 0) {
                        jE = ir.f29311a.e(c0VarR, 6);
                        i13 &= -57345;
                    } else {
                        jE = j12;
                    }
                    if (i16 != 0) {
                        iD = ir.f29311a.d();
                    }
                    if (i18 != 0) {
                        fH = ir.f29311a.h();
                    } else {
                        fH = f12;
                    }
                } else {
                    if (i23 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if ((i12 & 4) != 0) {
                        jC = ir.f29311a.c(c0VarR, 6);
                        i13 &= -897;
                    }
                    if (i14 != 0) {
                        fJ = ir.f29311a.j();
                    }
                    if ((i12 & 16) != 0) {
                        jE = ir.f29311a.e(c0VarR, 6);
                        i13 &= -57345;
                    } else {
                        jE = j12;
                    }
                    if (i16 != 0) {
                        iD = ir.f29311a.d();
                    }
                    if (i18 != 0) {
                        fH = ir.f29311a.h();
                    } else {
                        fH = f12;
                    }
                }
                i20 = iD;
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1798883595, i13, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:526)");
                }
                if ((i13 & 14) == 4) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                objI0 = c0VarR.i0();
                if (z11) {
                    objI0 = new Function0() { // from class: androidx.compose.material3.hs
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Float.valueOf(os.R(function0));
                        }
                    };
                    c0VarR.Y(objI0);
                } else {
                    objI0 = new Function0() { // from class: androidx.compose.material3.hs
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Float.valueOf(os.R(function0));
                        }
                    };
                    c0VarR.Y(objI0);
                }
                function1 = (Function0) objI0;
                nVar = new androidx.compose.ui.graphics.drawscope.n(((androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m())).S7(fJ), 0.0f, i20, 0, null, 26, null);
                zD = c0VarR.D(function1);
                objI1 = c0VarR.i0();
                if (zD) {
                    objI1 = new Function1() { // from class: androidx.compose.material3.is
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return os.S(function1, (androidx.compose.ui.semantics.e0) obj);
                        }
                    };
                    c0VarR.Y(objI1);
                } else {
                    objI1 = new Function1() { // from class: androidx.compose.material3.is
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return os.S(function1, (androidx.compose.ui.semantics.e0) obj);
                        }
                    };
                    c0VarR.Y(objI1);
                }
                androidx.compose.ui.a0 a0VarW3 = androidx.compose.foundation.layout.i6.w(androidx.compose.ui.semantics.t.e(a0Var2, true, (Function1) objI1), f31447d);
                boolean zD4 = c0VarR.D(function1);
                if ((458752 & i13) == 131072) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                boolean z19 = z12 | zD4;
                if ((3670016 & i13) == 1048576) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                boolean z110 = z19 | z13;
                if ((i13 & 7168) == 2048) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                zK0 = z110 | z14 | ((((57344 & i13) ^ 24576) <= 16384 && c0VarR.L(jE)) || (i13 & 24576) == 16384) | c0VarR.k0(nVar) | ((((i13 & 896) ^ androidx.media3.exoplayer.a5.S0) <= 256 && c0VarR.L(jC)) || (i13 & androidx.media3.exoplayer.a5.S0) == 256);
                objI2 = c0VarR.i0();
                if (zK0) {
                    j14 = jE;
                    j15 = jC;
                    f14 = fJ;
                    objI2 = new Function1() { // from class: androidx.compose.material3.js
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return os.T(function1, i20, fH, f14, j14, nVar, j15, (androidx.compose.ui.graphics.drawscope.f) obj);
                        }
                    };
                    c0VarR.Y(objI2);
                } else {
                    j14 = jE;
                    j15 = jC;
                    f14 = fJ;
                    objI2 = new Function1() { // from class: androidx.compose.material3.js
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return os.T(function1, i20, fH, f14, j14, nVar, j15, (androidx.compose.ui.graphics.drawscope.f) obj);
                        }
                    };
                    c0VarR.Y(objI2);
                }
                androidx.compose.foundation.f1.e(a0VarW3, (Function1) objI2, c0VarR, 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                f13 = f14;
                j12 = j14;
                j13 = j15;
            } else {
                c0VarR.u();
                j13 = jC;
                f13 = fJ;
                fH = f12;
                i20 = iD;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                final androidx.compose.ui.a0 a0Var4 = a0Var2;
                final long j17 = j12;
                final int i25 = i20;
                final float f16 = fH;
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.ks
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return os.U(function0, a0Var4, j13, f13, j17, i25, f16, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= 48;
        a0Var2 = a0Var;
        if ((i11 & androidx.media3.exoplayer.a5.S0) == 0) {
            jC = j10;
            if ((i12 & 4) == 0) {
                i22 = 128;
            } else {
                i22 = 128;
            }
            i13 |= i22;
        } else {
            jC = j10;
        }
        i14 = i12 & 8;
        if (i14 != 0) {
            if ((i11 & 3072) == 0) {
                fJ = f10;
                if (c0VarR.I(fJ)) {
                    i15 = 2048;
                } else {
                    i15 = 1024;
                }
                i13 |= i15;
            }
            if ((i11 & 24576) == 0) {
                j12 = j11;
                if ((i12 & 16) == 0) {
                    i21 = 8192;
                } else {
                    i21 = 8192;
                }
                i13 |= i21;
            } else {
                j12 = j11;
            }
            i16 = i12 & 32;
            if (i16 != 0) {
                i13 |= androidx.profileinstaller.n.c.f73814m;
                iD = i10;
            } else {
                iD = i10;
                if ((i11 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    if (c0VarR.K(iD)) {
                        i17 = 131072;
                    } else {
                        i17 = 65536;
                    }
                    i13 |= i17;
                }
            }
            i18 = i12 & 64;
            if (i18 != 0) {
                i13 |= 1572864;
                f12 = f11;
            } else {
                f12 = f11;
                if ((i11 & 1572864) == 0) {
                    if (c0VarR.I(f12)) {
                        i19 = 1048576;
                    } else {
                        i19 = 524288;
                    }
                    i13 |= i19;
                }
            }
            if ((i13 & 599187) != 599186) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i13 & 1)) {
                c0VarR.l0();
                if ((i11 & 1) != 0) {
                    if (i23 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if ((i12 & 4) != 0) {
                        jC = ir.f29311a.c(c0VarR, 6);
                        i13 &= -897;
                    }
                    if (i14 != 0) {
                        fJ = ir.f29311a.j();
                    }
                    if ((i12 & 16) != 0) {
                        jE = ir.f29311a.e(c0VarR, 6);
                        i13 &= -57345;
                    } else {
                        jE = j12;
                    }
                    if (i16 != 0) {
                        iD = ir.f29311a.d();
                    }
                    if (i18 != 0) {
                        fH = ir.f29311a.h();
                    } else {
                        fH = f12;
                    }
                } else {
                    if (i23 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if ((i12 & 4) != 0) {
                        jC = ir.f29311a.c(c0VarR, 6);
                        i13 &= -897;
                    }
                    if (i14 != 0) {
                        fJ = ir.f29311a.j();
                    }
                    if ((i12 & 16) != 0) {
                        jE = ir.f29311a.e(c0VarR, 6);
                        i13 &= -57345;
                    } else {
                        jE = j12;
                    }
                    if (i16 != 0) {
                        iD = ir.f29311a.d();
                    }
                    if (i18 != 0) {
                        fH = ir.f29311a.h();
                    } else {
                        fH = f12;
                    }
                }
                i20 = iD;
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1798883595, i13, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:526)");
                }
                if ((i13 & 14) == 4) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                objI0 = c0VarR.i0();
                if (z11) {
                    objI0 = new Function0() { // from class: androidx.compose.material3.hs
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Float.valueOf(os.R(function0));
                        }
                    };
                    c0VarR.Y(objI0);
                } else {
                    objI0 = new Function0() { // from class: androidx.compose.material3.hs
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Float.valueOf(os.R(function0));
                        }
                    };
                    c0VarR.Y(objI0);
                }
                function1 = (Function0) objI0;
                nVar = new androidx.compose.ui.graphics.drawscope.n(((androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m())).S7(fJ), 0.0f, i20, 0, null, 26, null);
                zD = c0VarR.D(function1);
                objI1 = c0VarR.i0();
                if (zD) {
                    objI1 = new Function1() { // from class: androidx.compose.material3.is
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return os.S(function1, (androidx.compose.ui.semantics.e0) obj);
                        }
                    };
                    c0VarR.Y(objI1);
                } else {
                    objI1 = new Function1() { // from class: androidx.compose.material3.is
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return os.S(function1, (androidx.compose.ui.semantics.e0) obj);
                        }
                    };
                    c0VarR.Y(objI1);
                }
                androidx.compose.ui.a0 a0VarW4 = androidx.compose.foundation.layout.i6.w(androidx.compose.ui.semantics.t.e(a0Var2, true, (Function1) objI1), f31447d);
                boolean zD5 = c0VarR.D(function1);
                if ((458752 & i13) == 131072) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                boolean z111 = z12 | zD5;
                if ((3670016 & i13) == 1048576) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                boolean z112 = z111 | z13;
                if ((i13 & 7168) == 2048) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                zK0 = z112 | z14 | ((((57344 & i13) ^ 24576) <= 16384 && c0VarR.L(jE)) || (i13 & 24576) == 16384) | c0VarR.k0(nVar) | ((((i13 & 896) ^ androidx.media3.exoplayer.a5.S0) <= 256 && c0VarR.L(jC)) || (i13 & androidx.media3.exoplayer.a5.S0) == 256);
                objI2 = c0VarR.i0();
                if (zK0) {
                    j14 = jE;
                    j15 = jC;
                    f14 = fJ;
                    objI2 = new Function1() { // from class: androidx.compose.material3.js
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return os.T(function1, i20, fH, f14, j14, nVar, j15, (androidx.compose.ui.graphics.drawscope.f) obj);
                        }
                    };
                    c0VarR.Y(objI2);
                } else {
                    j14 = jE;
                    j15 = jC;
                    f14 = fJ;
                    objI2 = new Function1() { // from class: androidx.compose.material3.js
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return os.T(function1, i20, fH, f14, j14, nVar, j15, (androidx.compose.ui.graphics.drawscope.f) obj);
                        }
                    };
                    c0VarR.Y(objI2);
                }
                androidx.compose.foundation.f1.e(a0VarW4, (Function1) objI2, c0VarR, 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                f13 = f14;
                j12 = j14;
                j13 = j15;
            } else {
                c0VarR.u();
                j13 = jC;
                f13 = fJ;
                fH = f12;
                i20 = iD;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                final androidx.compose.ui.a0 a0Var5 = a0Var2;
                final long j18 = j12;
                final int i26 = i20;
                final float f17 = fH;
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.ks
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return os.U(function0, a0Var5, j13, f13, j18, i26, f17, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= 3072;
        fJ = f10;
        if ((i11 & 24576) == 0) {
            j12 = j11;
            if ((i12 & 16) == 0) {
                i21 = 8192;
            } else {
                i21 = 8192;
            }
            i13 |= i21;
        } else {
            j12 = j11;
        }
        i16 = i12 & 32;
        if (i16 != 0) {
            i13 |= androidx.profileinstaller.n.c.f73814m;
            iD = i10;
        } else {
            iD = i10;
            if ((i11 & androidx.profileinstaller.n.c.f73814m) == 0) {
                if (c0VarR.K(iD)) {
                    i17 = 131072;
                } else {
                    i17 = 65536;
                }
                i13 |= i17;
            }
        }
        i18 = i12 & 64;
        if (i18 != 0) {
            i13 |= 1572864;
            f12 = f11;
        } else {
            f12 = f11;
            if ((i11 & 1572864) == 0) {
                if (c0VarR.I(f12)) {
                    i19 = 1048576;
                } else {
                    i19 = 524288;
                }
                i13 |= i19;
            }
        }
        if ((i13 & 599187) != 599186) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c0VarR.h(z10, i13 & 1)) {
            c0VarR.l0();
            if ((i11 & 1) != 0) {
                if (i23 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                }
                if ((i12 & 4) != 0) {
                    jC = ir.f29311a.c(c0VarR, 6);
                    i13 &= -897;
                }
                if (i14 != 0) {
                    fJ = ir.f29311a.j();
                }
                if ((i12 & 16) != 0) {
                    jE = ir.f29311a.e(c0VarR, 6);
                    i13 &= -57345;
                } else {
                    jE = j12;
                }
                if (i16 != 0) {
                    iD = ir.f29311a.d();
                }
                if (i18 != 0) {
                    fH = ir.f29311a.h();
                } else {
                    fH = f12;
                }
            } else {
                if (i23 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                }
                if ((i12 & 4) != 0) {
                    jC = ir.f29311a.c(c0VarR, 6);
                    i13 &= -897;
                }
                if (i14 != 0) {
                    fJ = ir.f29311a.j();
                }
                if ((i12 & 16) != 0) {
                    jE = ir.f29311a.e(c0VarR, 6);
                    i13 &= -57345;
                } else {
                    jE = j12;
                }
                if (i16 != 0) {
                    iD = ir.f29311a.d();
                }
                if (i18 != 0) {
                    fH = ir.f29311a.h();
                } else {
                    fH = f12;
                }
            }
            i20 = iD;
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1798883595, i13, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:526)");
            }
            if ((i13 & 14) == 4) {
                z11 = true;
            } else {
                z11 = false;
            }
            objI0 = c0VarR.i0();
            if (z11) {
                objI0 = new Function0() { // from class: androidx.compose.material3.hs
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Float.valueOf(os.R(function0));
                    }
                };
                c0VarR.Y(objI0);
            } else {
                objI0 = new Function0() { // from class: androidx.compose.material3.hs
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Float.valueOf(os.R(function0));
                    }
                };
                c0VarR.Y(objI0);
            }
            function1 = (Function0) objI0;
            nVar = new androidx.compose.ui.graphics.drawscope.n(((androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m())).S7(fJ), 0.0f, i20, 0, null, 26, null);
            zD = c0VarR.D(function1);
            objI1 = c0VarR.i0();
            if (zD) {
                objI1 = new Function1() { // from class: androidx.compose.material3.is
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return os.S(function1, (androidx.compose.ui.semantics.e0) obj);
                    }
                };
                c0VarR.Y(objI1);
            } else {
                objI1 = new Function1() { // from class: androidx.compose.material3.is
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return os.S(function1, (androidx.compose.ui.semantics.e0) obj);
                    }
                };
                c0VarR.Y(objI1);
            }
            androidx.compose.ui.a0 a0VarW5 = androidx.compose.foundation.layout.i6.w(androidx.compose.ui.semantics.t.e(a0Var2, true, (Function1) objI1), f31447d);
            boolean zD6 = c0VarR.D(function1);
            if ((458752 & i13) == 131072) {
                z12 = true;
            } else {
                z12 = false;
            }
            boolean z113 = z12 | zD6;
            if ((3670016 & i13) == 1048576) {
                z13 = true;
            } else {
                z13 = false;
            }
            boolean z114 = z113 | z13;
            if ((i13 & 7168) == 2048) {
                z14 = true;
            } else {
                z14 = false;
            }
            zK0 = z114 | z14 | ((((57344 & i13) ^ 24576) <= 16384 && c0VarR.L(jE)) || (i13 & 24576) == 16384) | c0VarR.k0(nVar) | ((((i13 & 896) ^ androidx.media3.exoplayer.a5.S0) <= 256 && c0VarR.L(jC)) || (i13 & androidx.media3.exoplayer.a5.S0) == 256);
            objI2 = c0VarR.i0();
            if (zK0) {
                j14 = jE;
                j15 = jC;
                f14 = fJ;
                objI2 = new Function1() { // from class: androidx.compose.material3.js
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return os.T(function1, i20, fH, f14, j14, nVar, j15, (androidx.compose.ui.graphics.drawscope.f) obj);
                    }
                };
                c0VarR.Y(objI2);
            } else {
                j14 = jE;
                j15 = jC;
                f14 = fJ;
                objI2 = new Function1() { // from class: androidx.compose.material3.js
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return os.T(function1, i20, fH, f14, j14, nVar, j15, (androidx.compose.ui.graphics.drawscope.f) obj);
                    }
                };
                c0VarR.Y(objI2);
            }
            androidx.compose.foundation.f1.e(a0VarW5, (Function1) objI2, c0VarR, 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            f13 = f14;
            j12 = j14;
            j13 = j15;
        } else {
            c0VarR.u();
            j13 = jC;
            f13 = fJ;
            fH = f12;
            i20 = iD;
        }
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            final androidx.compose.ui.a0 a0Var6 = a0Var2;
            final long j19 = j12;
            final int i27 = i20;
            final float f18 = fH;
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.ks
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return os.U(function0, a0Var6, j13, f13, j19, i27, f18, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @NotNull
    public static final androidx.compose.animation.core.g1<Float> I0() {
        return androidx.compose.animation.core.p.g(androidx.compose.animation.core.p.h(new Function1() { // from class: androidx.compose.material3.jr
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return os.u0((androidx.compose.animation.core.q1.b) obj);
            }
        }), null, 0L, 6, null);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x015b  */
    /* JADX WARN: Code duplicated, block: B:103:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:37:0x0066  */
    /* JADX WARN: Code duplicated, block: B:39:0x006a  */
    /* JADX WARN: Code duplicated, block: B:41:0x0072  */
    /* JADX WARN: Code duplicated, block: B:42:0x0075  */
    /* JADX WARN: Code duplicated, block: B:45:0x007b  */
    /* JADX WARN: Code duplicated, block: B:48:0x0081  */
    /* JADX WARN: Code duplicated, block: B:50:0x0086  */
    /* JADX WARN: Code duplicated, block: B:52:0x008a  */
    /* JADX WARN: Code duplicated, block: B:54:0x0092  */
    /* JADX WARN: Code duplicated, block: B:55:0x0095  */
    /* JADX WARN: Code duplicated, block: B:59:0x009e  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:77:0x00cc A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:78:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:82:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:87:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:90:0x0104  */
    /* JADX WARN: Code duplicated, block: B:93:0x0113  */
    /* JADX WARN: Code duplicated, block: B:96:0x0140  */
    /* JADX WARN: Code duplicated, block: B:98:0x0149  */
    @androidx.compose.runtime.o
    @kotlin.l(level = kotlin.n.HIDDEN, message = "Use the overload that takes `gapSize`", replaceWith = @kotlin.b1(expression = "CircularProgressIndicator(modifier, color, strokeWidth, trackColor, strokeCap, gapSize)", imports = {}))
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final /* synthetic */ void J(androidx.compose.ui.a0 a0Var, long j10, float f10, long j11, int i10, androidx.compose.runtime.c0 c0Var, final int i11, final int i12) {
        androidx.compose.ui.a0 a0Var2;
        int i13;
        long jC;
        float fJ;
        long jG;
        int i14;
        int iF;
        int i15;
        boolean z10;
        androidx.compose.runtime.c0 c0Var2;
        final androidx.compose.ui.a0 a0Var3;
        final long j12;
        final float f11;
        final long j13;
        final int i16;
        androidx.compose.runtime.s5 s5VarT;
        androidx.compose.ui.a0 a0Var4;
        float f12;
        androidx.compose.ui.a0 a0Var5;
        long j14;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-115871647);
        int i17 = i12 & 1;
        if (i17 != 0) {
            i13 = i11 | 6;
            a0Var2 = a0Var;
        } else if ((i11 & 6) == 0) {
            a0Var2 = a0Var;
            i13 = (c0VarR.D(a0Var2) ? 4 : 2) | i11;
        } else {
            a0Var2 = a0Var;
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            if ((i12 & 2) == 0) {
                jC = j10;
                int i18 = c0VarR.L(jC) ? 32 : 16;
                i13 |= i18;
            } else {
                jC = j10;
            }
            i13 |= i18;
        } else {
            jC = j10;
        }
        int i19 = i12 & 4;
        if (i19 == 0) {
            if ((i11 & androidx.media3.exoplayer.a5.S0) == 0) {
                fJ = f10;
                i13 |= c0VarR.I(fJ) ? 256 : 128;
            }
            if ((i11 & 3072) == 0) {
                if ((i12 & 8) == 0) {
                    jG = j11;
                    int i20 = c0VarR.L(jG) ? 2048 : 1024;
                    i13 |= i20;
                } else {
                    jG = j11;
                }
                i13 |= i20;
            } else {
                jG = j11;
            }
            i14 = i12 & 16;
            if (i14 != 0) {
                if ((i11 & 24576) == 0) {
                    iF = i10;
                    if (c0VarR.K(iF)) {
                        i15 = 16384;
                    } else {
                        i15 = 8192;
                    }
                    i13 |= i15;
                }
                if ((i13 & 9363) != 9362) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i13 & 1)) {
                    c0VarR.l0();
                    if ((i11 & 1) != 0 || c0VarR.y()) {
                        if (i17 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if ((i12 & 2) != 0) {
                            jC = ir.f29311a.c(c0VarR, 6);
                            i13 &= -113;
                        }
                        if (i19 != 0) {
                            fJ = ir.f29311a.j();
                        }
                        if ((i12 & 8) != 0) {
                            jG = ir.f29311a.g(c0VarR, 6);
                            i13 &= -7169;
                        }
                        if (i14 != 0) {
                            iF = ir.f29311a.f();
                            f12 = fJ;
                            j14 = jG;
                            a0Var5 = a0Var4;
                        } else {
                            f12 = fJ;
                            a0Var5 = a0Var4;
                        }
                        long j15 = jC;
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-115871647, i13, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:594)");
                        }
                        c0Var2 = c0VarR;
                        F(a0Var5, j15, f12, j14, iF, ir.f29311a.h(), c0Var2, (i13 & 14) | androidx.profileinstaller.n.c.f73814m | (i13 & com.planner5d.library.engine.input.f.b.B) | (i13 & 896) | (i13 & 7168) | (57344 & i13), 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var5;
                        j12 = j15;
                        f11 = f12;
                        j13 = j14;
                        i16 = iF;
                    } else {
                        c0VarR.u();
                        if ((i12 & 2) != 0) {
                            i13 &= -113;
                        }
                        if ((i12 & 8) != 0) {
                            i13 &= -7169;
                        }
                        f12 = fJ;
                        a0Var5 = a0Var2;
                    }
                    j14 = jG;
                    long j16 = jC;
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-115871647, i13, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:594)");
                    }
                    c0Var2 = c0VarR;
                    F(a0Var5, j16, f12, j14, iF, ir.f29311a.h(), c0Var2, (i13 & 14) | androidx.profileinstaller.n.c.f73814m | (i13 & com.planner5d.library.engine.input.f.b.B) | (i13 & 896) | (i13 & 7168) | (57344 & i13), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var5;
                    j12 = j16;
                    f11 = f12;
                    j13 = j14;
                    i16 = iF;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var3 = a0Var2;
                    j12 = jC;
                    f11 = fJ;
                    j13 = jG;
                    i16 = iF;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.ns
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return os.V(a0Var3, j12, f11, j13, i16, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 24576;
            iF = i10;
            if ((i13 & 9363) != 9362) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i13 & 1)) {
                c0VarR.l0();
                if ((i11 & 1) != 0) {
                    if (i17 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if ((i12 & 2) != 0) {
                        jC = ir.f29311a.c(c0VarR, 6);
                        i13 &= -113;
                    }
                    if (i19 != 0) {
                        fJ = ir.f29311a.j();
                    }
                    if ((i12 & 8) != 0) {
                        jG = ir.f29311a.g(c0VarR, 6);
                        i13 &= -7169;
                    }
                    if (i14 != 0) {
                        iF = ir.f29311a.f();
                        f12 = fJ;
                        j14 = jG;
                        a0Var5 = a0Var4;
                    } else {
                        f12 = fJ;
                        a0Var5 = a0Var4;
                        j14 = jG;
                    }
                } else {
                    if (i17 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if ((i12 & 2) != 0) {
                        jC = ir.f29311a.c(c0VarR, 6);
                        i13 &= -113;
                    }
                    if (i19 != 0) {
                        fJ = ir.f29311a.j();
                    }
                    if ((i12 & 8) != 0) {
                        jG = ir.f29311a.g(c0VarR, 6);
                        i13 &= -7169;
                    }
                    if (i14 != 0) {
                        iF = ir.f29311a.f();
                        f12 = fJ;
                        j14 = jG;
                        a0Var5 = a0Var4;
                    } else {
                        f12 = fJ;
                        a0Var5 = a0Var4;
                        j14 = jG;
                    }
                }
                long j17 = jC;
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-115871647, i13, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:594)");
                }
                c0Var2 = c0VarR;
                F(a0Var5, j17, f12, j14, iF, ir.f29311a.h(), c0Var2, (i13 & 14) | androidx.profileinstaller.n.c.f73814m | (i13 & com.planner5d.library.engine.input.f.b.B) | (i13 & 896) | (i13 & 7168) | (57344 & i13), 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var5;
                j12 = j17;
                f11 = f12;
                j13 = j14;
                i16 = iF;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var3 = a0Var2;
                j12 = jC;
                f11 = fJ;
                j13 = jG;
                i16 = iF;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.ns
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return os.V(a0Var3, j12, f11, j13, i16, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= androidx.media3.exoplayer.a5.S0;
        fJ = f10;
        if ((i11 & 3072) == 0) {
            if ((i12 & 8) == 0) {
                jG = j11;
                if (c0VarR.L(jG)) {
                }
                i13 |= i20;
            } else {
                jG = j11;
            }
            i13 |= i20;
        } else {
            jG = j11;
        }
        i14 = i12 & 16;
        if (i14 != 0) {
            if ((i11 & 24576) == 0) {
                iF = i10;
                if (c0VarR.K(iF)) {
                    i15 = 16384;
                } else {
                    i15 = 8192;
                }
                i13 |= i15;
            }
            if ((i13 & 9363) != 9362) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i13 & 1)) {
                c0VarR.l0();
                if ((i11 & 1) != 0) {
                    if (i17 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if ((i12 & 2) != 0) {
                        jC = ir.f29311a.c(c0VarR, 6);
                        i13 &= -113;
                    }
                    if (i19 != 0) {
                        fJ = ir.f29311a.j();
                    }
                    if ((i12 & 8) != 0) {
                        jG = ir.f29311a.g(c0VarR, 6);
                        i13 &= -7169;
                    }
                    if (i14 != 0) {
                        iF = ir.f29311a.f();
                        f12 = fJ;
                        j14 = jG;
                        a0Var5 = a0Var4;
                    } else {
                        f12 = fJ;
                        a0Var5 = a0Var4;
                        j14 = jG;
                    }
                } else {
                    if (i17 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if ((i12 & 2) != 0) {
                        jC = ir.f29311a.c(c0VarR, 6);
                        i13 &= -113;
                    }
                    if (i19 != 0) {
                        fJ = ir.f29311a.j();
                    }
                    if ((i12 & 8) != 0) {
                        jG = ir.f29311a.g(c0VarR, 6);
                        i13 &= -7169;
                    }
                    if (i14 != 0) {
                        iF = ir.f29311a.f();
                        f12 = fJ;
                        j14 = jG;
                        a0Var5 = a0Var4;
                    } else {
                        f12 = fJ;
                        a0Var5 = a0Var4;
                        j14 = jG;
                    }
                }
                long j18 = jC;
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-115871647, i13, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:594)");
                }
                c0Var2 = c0VarR;
                F(a0Var5, j18, f12, j14, iF, ir.f29311a.h(), c0Var2, (i13 & 14) | androidx.profileinstaller.n.c.f73814m | (i13 & com.planner5d.library.engine.input.f.b.B) | (i13 & 896) | (i13 & 7168) | (57344 & i13), 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var5;
                j12 = j18;
                f11 = f12;
                j13 = j14;
                i16 = iF;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var3 = a0Var2;
                j12 = jC;
                f11 = fJ;
                j13 = jG;
                i16 = iF;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.ns
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return os.V(a0Var3, j12, f11, j13, i16, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= 24576;
        iF = i10;
        if ((i13 & 9363) != 9362) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c0VarR.h(z10, i13 & 1)) {
            c0VarR.l0();
            if ((i11 & 1) != 0) {
                if (i17 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if ((i12 & 2) != 0) {
                    jC = ir.f29311a.c(c0VarR, 6);
                    i13 &= -113;
                }
                if (i19 != 0) {
                    fJ = ir.f29311a.j();
                }
                if ((i12 & 8) != 0) {
                    jG = ir.f29311a.g(c0VarR, 6);
                    i13 &= -7169;
                }
                if (i14 != 0) {
                    iF = ir.f29311a.f();
                    f12 = fJ;
                    j14 = jG;
                    a0Var5 = a0Var4;
                } else {
                    f12 = fJ;
                    a0Var5 = a0Var4;
                    j14 = jG;
                }
            } else {
                if (i17 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if ((i12 & 2) != 0) {
                    jC = ir.f29311a.c(c0VarR, 6);
                    i13 &= -113;
                }
                if (i19 != 0) {
                    fJ = ir.f29311a.j();
                }
                if ((i12 & 8) != 0) {
                    jG = ir.f29311a.g(c0VarR, 6);
                    i13 &= -7169;
                }
                if (i14 != 0) {
                    iF = ir.f29311a.f();
                    f12 = fJ;
                    j14 = jG;
                    a0Var5 = a0Var4;
                } else {
                    f12 = fJ;
                    a0Var5 = a0Var4;
                    j14 = jG;
                }
            }
            long j19 = jC;
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-115871647, i13, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:594)");
            }
            c0Var2 = c0VarR;
            F(a0Var5, j19, f12, j14, iF, ir.f29311a.h(), c0Var2, (i13 & 14) | androidx.profileinstaller.n.c.f73814m | (i13 & com.planner5d.library.engine.input.f.b.B) | (i13 & 896) | (i13 & 7168) | (57344 & i13), 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            a0Var3 = a0Var5;
            j12 = j19;
            f11 = f12;
            j13 = j14;
            i16 = iF;
        } else {
            c0Var2 = c0VarR;
            c0Var2.u();
            a0Var3 = a0Var2;
            j12 = jC;
            f11 = fJ;
            j13 = jG;
            i16 = iF;
        }
        s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.ns
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return os.V(a0Var3, j12, f11, j13, i16, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @NotNull
    public static final androidx.compose.animation.core.g1<Float> J0() {
        return androidx.compose.animation.core.p.g(androidx.compose.animation.core.p.h(new Function1() { // from class: androidx.compose.material3.sr
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return os.v0((androidx.compose.animation.core.q1.b) obj);
            }
        }), null, 0L, 6, null);
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004d  */
    /* JADX WARN: Code duplicated, block: B:31:0x005c  */
    /* JADX WARN: Code duplicated, block: B:33:0x0060  */
    /* JADX WARN: Code duplicated, block: B:36:0x0066  */
    /* JADX WARN: Code duplicated, block: B:38:0x006b  */
    /* JADX WARN: Code duplicated, block: B:40:0x006f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0079  */
    /* JADX WARN: Code duplicated, block: B:43:0x007c  */
    /* JADX WARN: Code duplicated, block: B:47:0x0085  */
    /* JADX WARN: Code duplicated, block: B:48:0x0087  */
    /* JADX WARN: Code duplicated, block: B:51:0x0090  */
    /* JADX WARN: Code duplicated, block: B:53:0x0098  */
    /* JADX WARN: Code duplicated, block: B:60:0x00b0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:69:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:75:0x0105  */
    /* JADX WARN: Code duplicated, block: B:77:0x010e  */
    /* JADX WARN: Code duplicated, block: B:80:0x011b  */
    /* JADX WARN: Code duplicated, block: B:82:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.o
    @kotlin.l(level = kotlin.n.HIDDEN, message = "Maintained for binary compatibility")
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final /* synthetic */ void K(final float f10, androidx.compose.ui.a0 a0Var, long j10, float f11, androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        float f12;
        int i12;
        androidx.compose.ui.a0 a0Var2;
        long jC;
        int i13;
        float f13;
        int i14;
        boolean z10;
        final androidx.compose.ui.a0 a0Var3;
        final long j11;
        final float f14;
        androidx.compose.runtime.s5 s5VarT;
        androidx.compose.ui.a0 a0Var4;
        float fJ;
        long j12;
        androidx.compose.ui.a0 a0Var5;
        int i15;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(402841196);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
            f12 = f10;
        } else if ((i10 & 6) == 0) {
            f12 = f10;
            i12 = (c0VarR.I(f12) ? 4 : 2) | i10;
        } else {
            f12 = f10;
            i12 = i10;
        }
        int i16 = i11 & 2;
        if (i16 == 0) {
            if ((i10 & 48) == 0) {
                a0Var2 = a0Var;
                i12 |= c0VarR.D(a0Var2) ? 32 : 16;
            }
            if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                jC = j10;
                if ((i11 & 4) == 0 || !c0VarR.L(jC)) {
                    i15 = 128;
                } else {
                    i15 = 256;
                }
                i12 |= i15;
            } else {
                jC = j10;
            }
            i13 = i11 & 8;
            if (i13 != 0) {
                if ((i10 & 3072) == 0) {
                    f13 = f11;
                    if (c0VarR.I(f13)) {
                        i14 = 2048;
                    } else {
                        i14 = 1024;
                    }
                    i12 |= i14;
                }
                if ((i12 & 1171) != 1170) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0 || c0VarR.y()) {
                        if (i16 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if ((i11 & 4) != 0) {
                            jC = ir.f29311a.c(c0VarR, 6);
                            i12 &= -897;
                        }
                        if (i13 != 0) {
                            fJ = ir.f29311a.j();
                        } else {
                            fJ = f13;
                        }
                        j12 = jC;
                        a0Var5 = a0Var4;
                    } else {
                        c0VarR.u();
                        if ((i11 & 4) != 0) {
                            i12 &= -897;
                        }
                        a0Var5 = a0Var2;
                        fJ = f13;
                        j12 = jC;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(402841196, i12, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:723)");
                    }
                    ir irVar = ir.f29311a;
                    float f15 = fJ;
                    G(f12, a0Var5, j12, f15, irVar.k(c0VarR, 6), irVar.d(), c0VarR, (i12 & 14) | androidx.profileinstaller.n.c.f73814m | (i12 & com.planner5d.library.engine.input.f.b.B) | (i12 & 896) | (i12 & 7168), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var5;
                    j11 = j12;
                    f14 = f15;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    j11 = jC;
                    f14 = f13;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.xr
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return os.W(f10, a0Var3, j11, f14, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 3072;
            f13 = f11;
            if ((i12 & 1171) != 1170) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i16 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if ((i11 & 4) != 0) {
                        jC = ir.f29311a.c(c0VarR, 6);
                        i12 &= -897;
                    }
                    if (i13 != 0) {
                        fJ = ir.f29311a.j();
                    } else {
                        fJ = f13;
                    }
                    j12 = jC;
                    a0Var5 = a0Var4;
                } else {
                    if (i16 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if ((i11 & 4) != 0) {
                        jC = ir.f29311a.c(c0VarR, 6);
                        i12 &= -897;
                    }
                    if (i13 != 0) {
                        fJ = ir.f29311a.j();
                    } else {
                        fJ = f13;
                    }
                    j12 = jC;
                    a0Var5 = a0Var4;
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(402841196, i12, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:723)");
                }
                ir irVar2 = ir.f29311a;
                float f16 = fJ;
                G(f12, a0Var5, j12, f16, irVar2.k(c0VarR, 6), irVar2.d(), c0VarR, (i12 & 14) | androidx.profileinstaller.n.c.f73814m | (i12 & com.planner5d.library.engine.input.f.b.B) | (i12 & 896) | (i12 & 7168), 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var5;
                j11 = j12;
                f14 = f16;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                j11 = jC;
                f14 = f13;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.xr
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return os.W(f10, a0Var3, j11, f14, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 48;
        a0Var2 = a0Var;
        if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
            jC = j10;
            if ((i11 & 4) == 0) {
                i15 = 128;
            } else {
                i15 = 128;
            }
            i12 |= i15;
        } else {
            jC = j10;
        }
        i13 = i11 & 8;
        if (i13 != 0) {
            if ((i10 & 3072) == 0) {
                f13 = f11;
                if (c0VarR.I(f13)) {
                    i14 = 2048;
                } else {
                    i14 = 1024;
                }
                i12 |= i14;
            }
            if ((i12 & 1171) != 1170) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i16 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if ((i11 & 4) != 0) {
                        jC = ir.f29311a.c(c0VarR, 6);
                        i12 &= -897;
                    }
                    if (i13 != 0) {
                        fJ = ir.f29311a.j();
                    } else {
                        fJ = f13;
                    }
                    j12 = jC;
                    a0Var5 = a0Var4;
                } else {
                    if (i16 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if ((i11 & 4) != 0) {
                        jC = ir.f29311a.c(c0VarR, 6);
                        i12 &= -897;
                    }
                    if (i13 != 0) {
                        fJ = ir.f29311a.j();
                    } else {
                        fJ = f13;
                    }
                    j12 = jC;
                    a0Var5 = a0Var4;
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(402841196, i12, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:723)");
                }
                ir irVar3 = ir.f29311a;
                float f17 = fJ;
                G(f12, a0Var5, j12, f17, irVar3.k(c0VarR, 6), irVar3.d(), c0VarR, (i12 & 14) | androidx.profileinstaller.n.c.f73814m | (i12 & com.planner5d.library.engine.input.f.b.B) | (i12 & 896) | (i12 & 7168), 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var5;
                j11 = j12;
                f14 = f17;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                j11 = jC;
                f14 = f13;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.xr
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return os.W(f10, a0Var3, j11, f14, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 3072;
        f13 = f11;
        if ((i12 & 1171) != 1170) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c0VarR.h(z10, i12 & 1)) {
            c0VarR.l0();
            if ((i10 & 1) != 0) {
                if (i16 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if ((i11 & 4) != 0) {
                    jC = ir.f29311a.c(c0VarR, 6);
                    i12 &= -897;
                }
                if (i13 != 0) {
                    fJ = ir.f29311a.j();
                } else {
                    fJ = f13;
                }
                j12 = jC;
                a0Var5 = a0Var4;
            } else {
                if (i16 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if ((i11 & 4) != 0) {
                    jC = ir.f29311a.c(c0VarR, 6);
                    i12 &= -897;
                }
                if (i13 != 0) {
                    fJ = ir.f29311a.j();
                } else {
                    fJ = f13;
                }
                j12 = jC;
                a0Var5 = a0Var4;
            }
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(402841196, i12, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:723)");
            }
            ir irVar4 = ir.f29311a;
            float f18 = fJ;
            G(f12, a0Var5, j12, f18, irVar4.k(c0VarR, 6), irVar4.d(), c0VarR, (i12 & 14) | androidx.profileinstaller.n.c.f73814m | (i12 & com.planner5d.library.engine.input.f.b.B) | (i12 & 896) | (i12 & 7168), 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            a0Var3 = a0Var5;
            j11 = j12;
            f14 = f18;
        } else {
            c0VarR.u();
            a0Var3 = a0Var2;
            j11 = jC;
            f14 = f13;
        }
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.xr
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return os.W(f10, a0Var3, j11, f14, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @NotNull
    public static final androidx.compose.animation.core.e0 K0() {
        return f31457n;
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0069  */
    /* JADX WARN: Code duplicated, block: B:37:0x006b  */
    /* JADX WARN: Code duplicated, block: B:40:0x0074  */
    /* JADX WARN: Code duplicated, block: B:49:0x0091 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x0093  */
    /* JADX WARN: Code duplicated, block: B:51:0x0096  */
    /* JADX WARN: Code duplicated, block: B:54:0x009c  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:61:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:64:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:69:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:71:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.o
    @kotlin.l(level = kotlin.n.HIDDEN, message = "Maintained for binary compatibility")
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final /* synthetic */ void L(androidx.compose.ui.a0 a0Var, long j10, float f10, androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        androidx.compose.ui.a0 a0Var2;
        int i12;
        long jC;
        float f11;
        boolean z10;
        final androidx.compose.ui.a0 a0Var3;
        final long j11;
        final float f12;
        androidx.compose.runtime.s5 s5VarT;
        androidx.compose.ui.a0 a0Var4;
        float fJ;
        long j12;
        androidx.compose.ui.a0 a0Var5;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(947193756);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
            a0Var2 = a0Var;
        } else if ((i10 & 6) == 0) {
            a0Var2 = a0Var;
            i12 = (c0VarR.D(a0Var2) ? 4 : 2) | i10;
        } else {
            a0Var2 = a0Var;
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            jC = j10;
            i12 |= ((i11 & 2) == 0 && c0VarR.L(jC)) ? 32 : 16;
        } else {
            jC = j10;
        }
        int i14 = i11 & 4;
        if (i14 == 0) {
            if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                f11 = f10;
                i12 |= c0VarR.I(f11) ? 256 : 128;
            }
            if ((i12 & com.planner5d.library.engine.input.f.b.F1) != 146) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0 || c0VarR.y()) {
                    if (i13 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if ((i11 & 2) != 0) {
                        jC = ir.f29311a.c(c0VarR, 6);
                        i12 &= -113;
                    }
                    if (i14 != 0) {
                        fJ = ir.f29311a.j();
                    } else {
                        fJ = f11;
                    }
                    j12 = jC;
                    a0Var5 = a0Var4;
                } else {
                    c0VarR.u();
                    if ((i11 & 2) != 0) {
                        i12 &= -113;
                    }
                    fJ = f11;
                    j12 = jC;
                    a0Var5 = a0Var2;
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(947193756, i12, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:740)");
                }
                ir irVar = ir.f29311a;
                F(a0Var5, j12, fJ, irVar.k(c0VarR, 6), irVar.f(), 0.0f, c0VarR, (i12 & 14) | 24576 | (i12 & com.planner5d.library.engine.input.f.b.B) | (i12 & 896), 32);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var5;
                j11 = j12;
                f12 = fJ;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                j11 = jC;
                f12 = f11;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.ds
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return os.X(a0Var3, j11, f12, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= androidx.media3.exoplayer.a5.S0;
        f11 = f10;
        if ((i12 & com.planner5d.library.engine.input.f.b.F1) != 146) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c0VarR.h(z10, i12 & 1)) {
            c0VarR.l0();
            if ((i10 & 1) != 0) {
                if (i13 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if ((i11 & 2) != 0) {
                    jC = ir.f29311a.c(c0VarR, 6);
                    i12 &= -113;
                }
                if (i14 != 0) {
                    fJ = ir.f29311a.j();
                } else {
                    fJ = f11;
                }
                j12 = jC;
                a0Var5 = a0Var4;
            } else {
                if (i13 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if ((i11 & 2) != 0) {
                    jC = ir.f29311a.c(c0VarR, 6);
                    i12 &= -113;
                }
                if (i14 != 0) {
                    fJ = ir.f29311a.j();
                } else {
                    fJ = f11;
                }
                j12 = jC;
                a0Var5 = a0Var4;
            }
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(947193756, i12, -1, "androidx.compose.material3.CircularProgressIndicator (ProgressIndicator.kt:740)");
            }
            ir irVar2 = ir.f29311a;
            F(a0Var5, j12, fJ, irVar2.k(c0VarR, 6), irVar2.f(), 0.0f, c0VarR, (i12 & 14) | 24576 | (i12 & com.planner5d.library.engine.input.f.b.B) | (i12 & 896), 32);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            a0Var3 = a0Var5;
            j11 = j12;
            f12 = fJ;
        } else {
            c0VarR.u();
            a0Var3 = a0Var2;
            j11 = jC;
            f12 = f11;
        }
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.ds
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return os.X(a0Var3, j11, f12, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @NotNull
    public static final androidx.compose.animation.core.g1<Float> L0() {
        return androidx.compose.animation.core.p.g(androidx.compose.animation.core.p.h(new Function1() { // from class: androidx.compose.material3.as
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return os.w0((androidx.compose.animation.core.q1.b) obj);
            }
        }), null, 0L, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit M(androidx.compose.runtime.n7 n7Var, int i10, float f10, float f11, androidx.compose.runtime.n7 n7Var2, androidx.compose.runtime.n7 n7Var3, long j10, androidx.compose.ui.graphics.drawscope.n nVar, long j11, androidx.compose.ui.graphics.drawscope.f fVar) {
        float fFloatValue = ((Number) n7Var.getValue()).floatValue() * 360.0f;
        if (!androidx.compose.ui.graphics.u3.g(i10, androidx.compose.ui.graphics.u3.f38256b.a()) && Float.intBitsToFloat((int) (fVar.d() & com.rabbitmq.client.k0.f265952a)) <= Float.intBitsToFloat((int) (fVar.d() >> 32))) {
            f10 = androidx.compose.ui.unit.h.r(f10 + f11);
        }
        float fF3 = (f10 / ((float) (((double) fVar.F3(Float.intBitsToFloat((int) (fVar.d() >> 32)))) * 3.141592653589793d))) * 360.0f;
        float fFloatValue2 = ((Number) n7Var2.getValue()).floatValue() + ((Number) n7Var3.getValue()).floatValue();
        long jY = fVar.Y();
        androidx.compose.ui.graphics.drawscope.d dVarZ3 = fVar.Z3();
        long jD = dVarZ3.d();
        dVarZ3.f().save();
        try {
            dVarZ3.i().h(fFloatValue2, jY);
            y0(fVar, fFloatValue + Math.min(fFloatValue, fF3), (360.0f - fFloatValue) - (Math.min(fFloatValue, fF3) * 2), j10, nVar);
            A0(fVar, 0.0f, fFloatValue, j11, nVar);
            return Unit.f312394a;
        } finally {
            dVarZ3.f().B();
            dVarZ3.g(jD);
        }
    }

    @NotNull
    public static final androidx.compose.animation.core.g1<Float> M0() {
        return androidx.compose.animation.core.p.g(androidx.compose.animation.core.p.h(new Function1() { // from class: androidx.compose.material3.cs
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return os.x0((androidx.compose.animation.core.q1.b) obj);
            }
        }), null, 0L, 6, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit N(androidx.compose.ui.a0 a0Var, long j10, float f10, long j11, int i10, float f11, int i11, int i12, androidx.compose.runtime.c0 c0Var, int i13) {
        F(a0Var, j10, f10, j11, i10, f11, c0Var, androidx.compose.runtime.t4.a(i11 | 1), i12);
        return Unit.f312394a;
    }

    public static final float N0() {
        return f31445b;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit O(Function0 function0, androidx.compose.ui.a0 a0Var, long j10, float f10, long j11, int i10, int i11, int i12, androidx.compose.runtime.c0 c0Var, int i13) {
        H(function0, a0Var, j10, f10, j11, i10, c0Var, androidx.compose.runtime.t4.a(i11 | 1), i12);
        return Unit.f312394a;
    }

    public static final float O0() {
        return f31444a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float P(float f10) {
        return f10;
    }

    public static final float P0() {
        return f31446c;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Q(float f10, androidx.compose.ui.a0 a0Var, long j10, float f11, long j11, int i10, int i11, int i12, androidx.compose.runtime.c0 c0Var, int i13) {
        G(f10, a0Var, j10, f11, j11, i10, c0Var, androidx.compose.runtime.t4.a(i11 | 1), i12);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float R(Function0 function0) {
        float fFloatValue = ((Number) function0.invoke()).floatValue();
        if (fFloatValue < 0.0f) {
            fFloatValue = 0.0f;
        }
        if (fFloatValue > 1.0f) {
            return 1.0f;
        }
        return fFloatValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit S(Function0 function0, androidx.compose.ui.semantics.e0 e0Var) {
        Object objInvoke = function0.invoke();
        if (Float.isNaN(((Number) objInvoke).floatValue())) {
            objInvoke = null;
        }
        Float f10 = (Float) objInvoke;
        androidx.compose.ui.semantics.b0.J1(e0Var, new androidx.compose.ui.semantics.i(f10 != null ? f10.floatValue() : 0.0f, kotlin.ranges.r.e(0.0f, 1.0f), 0, 4, null));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit T(Function0 function0, int i10, float f10, float f11, long j10, androidx.compose.ui.graphics.drawscope.n nVar, long j11, androidx.compose.ui.graphics.drawscope.f fVar) {
        float fFloatValue = ((Number) function0.invoke()).floatValue() * 360.0f;
        if (!androidx.compose.ui.graphics.u3.g(i10, androidx.compose.ui.graphics.u3.f38256b.a()) && Float.intBitsToFloat((int) (fVar.d() & com.rabbitmq.client.k0.f265952a)) <= Float.intBitsToFloat((int) (fVar.d() >> 32))) {
            f10 = androidx.compose.ui.unit.h.r(f10 + f11);
        }
        float fF3 = (f10 / ((float) (((double) fVar.F3(Float.intBitsToFloat((int) (fVar.d() >> 32)))) * 3.141592653589793d))) * 360.0f;
        y0(fVar, 270.0f + fFloatValue + Math.min(fFloatValue, fF3), (360.0f - fFloatValue) - (Math.min(fFloatValue, fF3) * 2), j10, nVar);
        A0(fVar, 270.0f, fFloatValue, j11, nVar);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit U(Function0 function0, androidx.compose.ui.a0 a0Var, long j10, float f10, long j11, int i10, float f11, int i11, int i12, androidx.compose.runtime.c0 c0Var, int i13) {
        I(function0, a0Var, j10, f10, j11, i10, f11, c0Var, androidx.compose.runtime.t4.a(i11 | 1), i12);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit V(androidx.compose.ui.a0 a0Var, long j10, float f10, long j11, int i10, int i11, int i12, androidx.compose.runtime.c0 c0Var, int i13) {
        J(a0Var, j10, f10, j11, i10, c0Var, androidx.compose.runtime.t4.a(i11 | 1), i12);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit W(float f10, androidx.compose.ui.a0 a0Var, long j10, float f11, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        K(f10, a0Var, j10, f11, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit X(androidx.compose.ui.a0 a0Var, long j10, float f10, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        L(a0Var, j10, f10, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0084  */
    /* JADX WARN: Code duplicated, block: B:48:0x0086  */
    /* JADX WARN: Code duplicated, block: B:51:0x008f  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b2 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:65:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:69:0x00be  */
    /* JADX WARN: Code duplicated, block: B:72:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:76:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:79:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:82:0x0111  */
    /* JADX WARN: Code duplicated, block: B:84:0x011a  */
    /* JADX WARN: Code duplicated, block: B:87:0x0128  */
    /* JADX WARN: Code duplicated, block: B:89:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.o
    @kotlin.l(level = kotlin.n.HIDDEN, message = "Use the overload that takes `gapSize`, see `LegacyIndeterminateLinearProgressIndicatorSample` on how to restore the previous behavior", replaceWith = @kotlin.b1(expression = "LinearProgressIndicator(modifier, color, trackColor, strokeCap, gapSize)", imports = {}))
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final /* synthetic */ void Y(androidx.compose.ui.a0 a0Var, long j10, long j11, int i10, androidx.compose.runtime.c0 c0Var, final int i11, final int i12) {
        androidx.compose.ui.a0 a0Var2;
        int i13;
        long jM;
        long jQ;
        int i14;
        boolean z10;
        final androidx.compose.ui.a0 a0Var3;
        final long j12;
        final long j13;
        final int i15;
        androidx.compose.runtime.s5 s5VarT;
        androidx.compose.ui.a0 a0Var4;
        int iP;
        androidx.compose.ui.a0 a0Var5;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-476865359);
        int i16 = i12 & 1;
        if (i16 != 0) {
            i13 = i11 | 6;
            a0Var2 = a0Var;
        } else if ((i11 & 6) == 0) {
            a0Var2 = a0Var;
            i13 = (c0VarR.D(a0Var2) ? 4 : 2) | i11;
        } else {
            a0Var2 = a0Var;
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            if ((i12 & 2) == 0) {
                jM = j10;
                int i17 = c0VarR.L(jM) ? 32 : 16;
                i13 |= i17;
            } else {
                jM = j10;
            }
            i13 |= i17;
        } else {
            jM = j10;
        }
        if ((i11 & androidx.media3.exoplayer.a5.S0) == 0) {
            jQ = j11;
            i13 |= ((i12 & 4) == 0 && c0VarR.L(jQ)) ? 256 : 128;
        } else {
            jQ = j11;
        }
        int i18 = i12 & 8;
        if (i18 == 0) {
            if ((i11 & 3072) == 0) {
                i14 = i10;
                i13 |= c0VarR.K(i14) ? 2048 : 1024;
            }
            if ((i13 & 1171) != 1170) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i13 & 1)) {
                c0VarR.l0();
                if ((i11 & 1) != 0 || c0VarR.y()) {
                    if (i16 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if ((i12 & 2) != 0) {
                        jM = ir.f29311a.m(c0VarR, 6);
                        i13 &= -113;
                    }
                    if ((i12 & 4) != 0) {
                        jQ = ir.f29311a.q(c0VarR, 6);
                        i13 &= -897;
                    }
                    if (i18 != 0) {
                        iP = ir.f29311a.p();
                    } else {
                        iP = i14;
                    }
                    a0Var5 = a0Var4;
                } else {
                    c0VarR.u();
                    if ((i12 & 2) != 0) {
                        i13 &= -113;
                    }
                    if ((i12 & 4) != 0) {
                        i13 &= -897;
                    }
                    jQ = jQ;
                    iP = i14;
                    a0Var5 = a0Var2;
                }
                long j14 = jM;
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-476865359, i13, -1, "androidx.compose.material3.LinearProgressIndicator (ProgressIndicator.kt:219)");
                }
                e0(a0Var5, j14, jQ, iP, ir.f29311a.n(), c0VarR, (i13 & 14) | 24576 | (i13 & com.planner5d.library.engine.input.f.b.B) | (i13 & 896) | (i13 & 7168), 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var5;
                j12 = j14;
                j13 = jQ;
                i15 = iP;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                j12 = jM;
                j13 = jQ;
                i15 = i14;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.pr
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return os.f0(a0Var3, j12, j13, i15, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= 3072;
        i14 = i10;
        if ((i13 & 1171) != 1170) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c0VarR.h(z10, i13 & 1)) {
            c0VarR.l0();
            if ((i11 & 1) != 0) {
                if (i16 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if ((i12 & 2) != 0) {
                    jM = ir.f29311a.m(c0VarR, 6);
                    i13 &= -113;
                }
                if ((i12 & 4) != 0) {
                    jQ = ir.f29311a.q(c0VarR, 6);
                    i13 &= -897;
                }
                if (i18 != 0) {
                    iP = ir.f29311a.p();
                } else {
                    iP = i14;
                }
                a0Var5 = a0Var4;
            } else {
                if (i16 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if ((i12 & 2) != 0) {
                    jM = ir.f29311a.m(c0VarR, 6);
                    i13 &= -113;
                }
                if ((i12 & 4) != 0) {
                    jQ = ir.f29311a.q(c0VarR, 6);
                    i13 &= -897;
                }
                if (i18 != 0) {
                    iP = ir.f29311a.p();
                } else {
                    iP = i14;
                }
                a0Var5 = a0Var4;
            }
            long j15 = jM;
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-476865359, i13, -1, "androidx.compose.material3.LinearProgressIndicator (ProgressIndicator.kt:219)");
            }
            e0(a0Var5, j15, jQ, iP, ir.f29311a.n(), c0VarR, (i13 & 14) | 24576 | (i13 & com.planner5d.library.engine.input.f.b.B) | (i13 & 896) | (i13 & 7168), 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            a0Var3 = a0Var5;
            j12 = j15;
            j13 = jQ;
            i15 = iP;
        } else {
            c0VarR.u();
            a0Var3 = a0Var2;
            j12 = jM;
            j13 = jQ;
            i15 = i14;
        }
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.pr
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return os.f0(a0Var3, j12, j13, i15, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x011e  */
    /* JADX WARN: Code duplicated, block: B:104:0x012a  */
    /* JADX WARN: Code duplicated, block: B:106:0x0134  */
    /* JADX WARN: Code duplicated, block: B:107:0x013b  */
    /* JADX WARN: Code duplicated, block: B:109:0x013e  */
    /* JADX WARN: Code duplicated, block: B:112:0x0148  */
    /* JADX WARN: Code duplicated, block: B:114:0x0150  */
    /* JADX WARN: Code duplicated, block: B:116:0x0156  */
    /* JADX WARN: Code duplicated, block: B:122:0x0165  */
    /* JADX WARN: Code duplicated, block: B:123:0x0167  */
    /* JADX WARN: Code duplicated, block: B:126:0x016f  */
    /* JADX WARN: Code duplicated, block: B:128:0x0177  */
    /* JADX WARN: Code duplicated, block: B:131:0x018b  */
    /* JADX WARN: Code duplicated, block: B:134:0x0197  */
    /* JADX WARN: Code duplicated, block: B:137:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:138:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:141:0x01af  */
    /* JADX WARN: Code duplicated, block: B:143:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:146:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:148:0x01db  */
    /* JADX WARN: Code duplicated, block: B:151:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:152:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:155:0x0203  */
    /* JADX WARN: Code duplicated, block: B:156:0x0206  */
    /* JADX WARN: Code duplicated, block: B:159:0x0215  */
    /* JADX WARN: Code duplicated, block: B:161:0x021b  */
    /* JADX WARN: Code duplicated, block: B:167:0x022c  */
    /* JADX WARN: Code duplicated, block: B:169:0x0232  */
    /* JADX WARN: Code duplicated, block: B:175:0x0243  */
    /* JADX WARN: Code duplicated, block: B:177:0x0249  */
    /* JADX WARN: Code duplicated, block: B:183:0x0256  */
    /* JADX WARN: Code duplicated, block: B:187:0x0266  */
    /* JADX WARN: Code duplicated, block: B:190:0x0286  */
    /* JADX WARN: Code duplicated, block: B:192:0x0294  */
    /* JADX WARN: Code duplicated, block: B:195:0x02a6  */
    /* JADX WARN: Code duplicated, block: B:197:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0045  */
    /* JADX WARN: Code duplicated, block: B:31:0x0054  */
    /* JADX WARN: Code duplicated, block: B:33:0x0058  */
    /* JADX WARN: Code duplicated, block: B:36:0x005e  */
    /* JADX WARN: Code duplicated, block: B:41:0x006d  */
    /* JADX WARN: Code duplicated, block: B:43:0x0071  */
    /* JADX WARN: Code duplicated, block: B:46:0x0077  */
    /* JADX WARN: Code duplicated, block: B:48:0x007c  */
    /* JADX WARN: Code duplicated, block: B:50:0x0080  */
    /* JADX WARN: Code duplicated, block: B:52:0x0088  */
    /* JADX WARN: Code duplicated, block: B:53:0x008b  */
    /* JADX WARN: Code duplicated, block: B:57:0x0095  */
    /* JADX WARN: Code duplicated, block: B:58:0x009a  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:96:0x0112 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:97:0x0114  */
    /* JADX WARN: Code duplicated, block: B:98:0x0117  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void Z(@NotNull final Function0<Float> function0, @Nullable androidx.compose.ui.a0 a0Var, long j10, long j11, int i10, float f10, @Nullable Function1<? super androidx.compose.ui.graphics.drawscope.f, Unit> function1, @Nullable androidx.compose.runtime.c0 c0Var, final int i11, final int i12) {
        int i13;
        androidx.compose.ui.a0 a0Var2;
        final long jM;
        long jQ;
        int i14;
        int i15;
        int i16;
        int i17;
        float fN;
        int i18;
        boolean z10;
        boolean z11;
        final float f11;
        androidx.compose.ui.a0 a0Var3;
        final int i19;
        final long j12;
        final long j13;
        final Function1<? super androidx.compose.ui.graphics.drawscope.f, Unit> function2;
        androidx.compose.runtime.s5 s5VarT;
        final int iP;
        Function1<? super androidx.compose.ui.graphics.drawscope.f, Unit> function3;
        final float f12;
        final int i20;
        boolean z12;
        boolean z13;
        Object objI0;
        boolean z14;
        Object objI1;
        final Function0 function4;
        boolean zD;
        Object objI2;
        boolean z15;
        boolean z16;
        boolean z17;
        Object objI3;
        final Function1<? super androidx.compose.ui.graphics.drawscope.f, Unit> function5;
        final long j14;
        int i21;
        int i22;
        int i23;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-339970038);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (c0VarR.k0(function0) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i24 = i12 & 2;
        if (i24 == 0) {
            if ((i11 & 48) == 0) {
                a0Var2 = a0Var;
                i13 |= c0VarR.D(a0Var2) ? 32 : 16;
            }
            if ((i11 & androidx.media3.exoplayer.a5.S0) == 0) {
                jM = j10;
                if ((i12 & 4) == 0 || !c0VarR.L(jM)) {
                    i23 = 128;
                } else {
                    i23 = 256;
                }
                i13 |= i23;
            } else {
                jM = j10;
            }
            if ((i11 & 3072) == 0) {
                jQ = j11;
                if ((i12 & 8) == 0 || !c0VarR.L(jQ)) {
                    i22 = 1024;
                } else {
                    i22 = 2048;
                }
                i13 |= i22;
            } else {
                jQ = j11;
            }
            i14 = i12 & 16;
            if (i14 != 0) {
                if ((i11 & 24576) == 0) {
                    i15 = i10;
                    if (c0VarR.K(i15)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i13 |= i16;
                }
                i17 = i12 & 32;
                if (i17 != 0) {
                    i13 |= androidx.profileinstaller.n.c.f73814m;
                    fN = f10;
                } else {
                    fN = f10;
                    if ((i11 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        if (c0VarR.I(fN)) {
                            i18 = 131072;
                        } else {
                            i18 = 65536;
                        }
                        i13 |= i18;
                    }
                }
                if ((i11 & 1572864) != 0) {
                    if ((i12 & 64) == 0 || !c0VarR.k0(function1)) {
                        i21 = 524288;
                    } else {
                        i21 = 1048576;
                    }
                    i13 |= i21;
                }
                z10 = true;
                if ((i13 & 599187) != 599186) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (c0VarR.h(z11, i13 & 1)) {
                    c0VarR.l0();
                    if ((i11 & 1) != 0 || c0VarR.y()) {
                        if (i24 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var2;
                        }
                        if ((i12 & 4) != 0) {
                            jM = ir.f29311a.m(c0VarR, 6);
                            i13 &= -897;
                        }
                        if ((i12 & 8) != 0) {
                            jQ = ir.f29311a.q(c0VarR, 6);
                            i13 &= -7169;
                        }
                        if (i14 != 0) {
                            iP = ir.f29311a.p();
                        } else {
                            iP = i15;
                        }
                        if (i17 != 0) {
                            fN = ir.f29311a.n();
                        }
                        if ((i12 & 64) != 0) {
                            boolean z18 = (((i13 & 896) ^ androidx.media3.exoplayer.a5.S0) <= 256 && c0VarR.L(jM)) || (i13 & androidx.media3.exoplayer.a5.S0) == 256;
                            if ((57344 & i13) == 16384) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            z13 = z18 | z12;
                            objI0 = c0VarR.i0();
                            if (z13 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = new Function1() { // from class: androidx.compose.material3.kr
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return os.h0(jM, iP, (androidx.compose.ui.graphics.drawscope.f) obj);
                                    }
                                };
                                c0VarR.Y(objI0);
                            }
                            function3 = (Function1) objI0;
                            i13 &= -3670017;
                        } else {
                            function3 = function1;
                        }
                        f12 = fN;
                        i20 = iP;
                    } else {
                        c0VarR.u();
                        if ((i12 & 4) != 0) {
                            i13 &= -897;
                        }
                        if ((i12 & 8) != 0) {
                            i13 &= -7169;
                        }
                        if ((i12 & 64) != 0) {
                            i13 &= -3670017;
                        }
                        function3 = function1;
                        f12 = fN;
                        a0Var3 = a0Var2;
                        i20 = i15;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-339970038, i13, -1, "androidx.compose.material3.LinearProgressIndicator (ProgressIndicator.kt:153)");
                    }
                    if ((i13 & 14) == 4) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    objI1 = c0VarR.i0();
                    if (z14 || objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI1 = new Function0() { // from class: androidx.compose.material3.lr
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Float.valueOf(os.i0(function0));
                            }
                        };
                        c0VarR.Y(objI1);
                    }
                    function4 = (Function0) objI1;
                    androidx.compose.ui.a0 a0VarB2 = a0Var3.B2(androidx.compose.material3.internal.o.p());
                    zD = c0VarR.D(function4);
                    objI2 = c0VarR.i0();
                    if (zD || objI2 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI2 = new Function1() { // from class: androidx.compose.material3.mr
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return os.j0(function4, (androidx.compose.ui.semantics.e0) obj);
                            }
                        };
                        c0VarR.Y(objI2);
                    }
                    androidx.compose.ui.a0 a0VarY = androidx.compose.foundation.layout.i6.y(androidx.compose.ui.semantics.t.e(a0VarB2, true, (Function1) objI2), f31444a, f31445b);
                    if ((57344 & i13) == 16384) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    if ((458752 & i13) == 131072) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    boolean zD2 = z15 | z16 | c0VarR.D(function4) | ((((i13 & 7168) ^ 3072) <= 2048 && c0VarR.L(jQ)) || (i13 & 3072) == 2048) | ((((i13 & 896) ^ androidx.media3.exoplayer.a5.S0) <= 256 && c0VarR.L(jM)) || (i13 & androidx.media3.exoplayer.a5.S0) == 256);
                    if ((((3670016 & i13) ^ 1572864) > 1048576 || !c0VarR.D(function3)) && (i13 & 1572864) != 1048576) {
                    }
                    z17 = z10 | zD2;
                    objI3 = c0VarR.i0();
                    if (!z17 || objI3 == androidx.compose.runtime.c0.f35327a.a()) {
                        function5 = function3;
                        j14 = jM;
                        j13 = jQ;
                        objI3 = new Function1() { // from class: androidx.compose.material3.nr
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return os.k0(i20, f12, function4, j13, j14, function5, (androidx.compose.ui.graphics.drawscope.f) obj);
                            }
                        };
                        c0VarR.Y(objI3);
                    } else {
                        function5 = function3;
                        j14 = jM;
                        j13 = jQ;
                    }
                    androidx.compose.foundation.f1.e(a0VarY, (Function1) objI3, c0VarR, 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    i19 = i20;
                    f11 = f12;
                    j12 = j14;
                    function2 = function5;
                } else {
                    c0VarR.u();
                    f11 = fN;
                    a0Var3 = a0Var2;
                    i19 = i15;
                    j12 = jM;
                    j13 = jQ;
                    function2 = function1;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    final androidx.compose.ui.a0 a0Var4 = a0Var3;
                    final long j15 = j13;
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.or
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return os.g0(function0, a0Var4, j12, j15, i19, f11, function2, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 24576;
            i15 = i10;
            i17 = i12 & 32;
            if (i17 != 0) {
                i13 |= androidx.profileinstaller.n.c.f73814m;
                fN = f10;
            } else {
                fN = f10;
                if ((i11 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    if (c0VarR.I(fN)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i13 |= i18;
                }
            }
            if ((i11 & 1572864) != 0) {
                if ((i12 & 64) == 0) {
                    i21 = 524288;
                } else {
                    i21 = 524288;
                }
                i13 |= i21;
            }
            z10 = true;
            if ((i13 & 599187) != 599186) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (c0VarR.h(z11, i13 & 1)) {
                c0VarR.l0();
                if ((i11 & 1) != 0) {
                    if (i24 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if ((i12 & 4) != 0) {
                        jM = ir.f29311a.m(c0VarR, 6);
                        i13 &= -897;
                    }
                    if ((i12 & 8) != 0) {
                        jQ = ir.f29311a.q(c0VarR, 6);
                        i13 &= -7169;
                    }
                    if (i14 != 0) {
                        iP = ir.f29311a.p();
                    } else {
                        iP = i15;
                    }
                    if (i17 != 0) {
                        fN = ir.f29311a.n();
                    }
                    if ((i12 & 64) != 0) {
                        if (((i13 & 896) ^ androidx.media3.exoplayer.a5.S0) <= 256) {
                        }
                        if ((57344 & i13) == 16384) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        z13 = z18 | z12;
                        objI0 = c0VarR.i0();
                        if (z13) {
                            objI0 = new Function1() { // from class: androidx.compose.material3.kr
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return os.h0(jM, iP, (androidx.compose.ui.graphics.drawscope.f) obj);
                                }
                            };
                            c0VarR.Y(objI0);
                        } else {
                            objI0 = new Function1() { // from class: androidx.compose.material3.kr
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return os.h0(jM, iP, (androidx.compose.ui.graphics.drawscope.f) obj);
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        function3 = (Function1) objI0;
                        i13 &= -3670017;
                    } else {
                        function3 = function1;
                    }
                    f12 = fN;
                    i20 = iP;
                } else {
                    if (i24 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if ((i12 & 4) != 0) {
                        jM = ir.f29311a.m(c0VarR, 6);
                        i13 &= -897;
                    }
                    if ((i12 & 8) != 0) {
                        jQ = ir.f29311a.q(c0VarR, 6);
                        i13 &= -7169;
                    }
                    if (i14 != 0) {
                        iP = ir.f29311a.p();
                    } else {
                        iP = i15;
                    }
                    if (i17 != 0) {
                        fN = ir.f29311a.n();
                    }
                    if ((i12 & 64) != 0) {
                        if (((i13 & 896) ^ androidx.media3.exoplayer.a5.S0) <= 256) {
                        }
                        if ((57344 & i13) == 16384) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        z13 = z18 | z12;
                        objI0 = c0VarR.i0();
                        if (z13) {
                            objI0 = new Function1() { // from class: androidx.compose.material3.kr
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return os.h0(jM, iP, (androidx.compose.ui.graphics.drawscope.f) obj);
                                }
                            };
                            c0VarR.Y(objI0);
                        } else {
                            objI0 = new Function1() { // from class: androidx.compose.material3.kr
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return os.h0(jM, iP, (androidx.compose.ui.graphics.drawscope.f) obj);
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        function3 = (Function1) objI0;
                        i13 &= -3670017;
                    } else {
                        function3 = function1;
                    }
                    f12 = fN;
                    i20 = iP;
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-339970038, i13, -1, "androidx.compose.material3.LinearProgressIndicator (ProgressIndicator.kt:153)");
                }
                if ((i13 & 14) == 4) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                objI1 = c0VarR.i0();
                if (z14) {
                    objI1 = new Function0() { // from class: androidx.compose.material3.lr
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Float.valueOf(os.i0(function0));
                        }
                    };
                    c0VarR.Y(objI1);
                } else {
                    objI1 = new Function0() { // from class: androidx.compose.material3.lr
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Float.valueOf(os.i0(function0));
                        }
                    };
                    c0VarR.Y(objI1);
                }
                function4 = (Function0) objI1;
                androidx.compose.ui.a0 a0VarB3 = a0Var3.B2(androidx.compose.material3.internal.o.p());
                zD = c0VarR.D(function4);
                objI2 = c0VarR.i0();
                if (zD) {
                    objI2 = new Function1() { // from class: androidx.compose.material3.mr
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return os.j0(function4, (androidx.compose.ui.semantics.e0) obj);
                        }
                    };
                    c0VarR.Y(objI2);
                } else {
                    objI2 = new Function1() { // from class: androidx.compose.material3.mr
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return os.j0(function4, (androidx.compose.ui.semantics.e0) obj);
                        }
                    };
                    c0VarR.Y(objI2);
                }
                androidx.compose.ui.a0 a0VarY2 = androidx.compose.foundation.layout.i6.y(androidx.compose.ui.semantics.t.e(a0VarB3, true, (Function1) objI2), f31444a, f31445b);
                if ((57344 & i13) == 16384) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if ((458752 & i13) == 131072) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                boolean zD3 = z15 | z16 | c0VarR.D(function4) | ((((i13 & 7168) ^ 3072) <= 2048 && c0VarR.L(jQ)) || (i13 & 3072) == 2048) | ((((i13 & 896) ^ androidx.media3.exoplayer.a5.S0) <= 256 && c0VarR.L(jM)) || (i13 & androidx.media3.exoplayer.a5.S0) == 256);
                z10 = ((3670016 & i13) ^ 1572864) > 1048576 ? false : false;
                z17 = z10 | zD3;
                objI3 = c0VarR.i0();
                if (z17) {
                    function5 = function3;
                    j14 = jM;
                    j13 = jQ;
                    objI3 = new Function1() { // from class: androidx.compose.material3.nr
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return os.k0(i20, f12, function4, j13, j14, function5, (androidx.compose.ui.graphics.drawscope.f) obj);
                        }
                    };
                    c0VarR.Y(objI3);
                } else {
                    function5 = function3;
                    j14 = jM;
                    j13 = jQ;
                    objI3 = new Function1() { // from class: androidx.compose.material3.nr
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return os.k0(i20, f12, function4, j13, j14, function5, (androidx.compose.ui.graphics.drawscope.f) obj);
                        }
                    };
                    c0VarR.Y(objI3);
                }
                androidx.compose.foundation.f1.e(a0VarY2, (Function1) objI3, c0VarR, 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                i19 = i20;
                f11 = f12;
                j12 = j14;
                function2 = function5;
            } else {
                c0VarR.u();
                f11 = fN;
                a0Var3 = a0Var2;
                i19 = i15;
                j12 = jM;
                j13 = jQ;
                function2 = function1;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                final androidx.compose.ui.a0 a0Var5 = a0Var3;
                final long j16 = j13;
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.or
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return os.g0(function0, a0Var5, j12, j16, i19, f11, function2, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= 48;
        a0Var2 = a0Var;
        if ((i11 & androidx.media3.exoplayer.a5.S0) == 0) {
            jM = j10;
            if ((i12 & 4) == 0) {
                i23 = 128;
            } else {
                i23 = 128;
            }
            i13 |= i23;
        } else {
            jM = j10;
        }
        if ((i11 & 3072) == 0) {
            jQ = j11;
            if ((i12 & 8) == 0) {
                i22 = 1024;
            } else {
                i22 = 1024;
            }
            i13 |= i22;
        } else {
            jQ = j11;
        }
        i14 = i12 & 16;
        if (i14 != 0) {
            if ((i11 & 24576) == 0) {
                i15 = i10;
                if (c0VarR.K(i15)) {
                    i16 = 16384;
                } else {
                    i16 = 8192;
                }
                i13 |= i16;
            }
            i17 = i12 & 32;
            if (i17 != 0) {
                i13 |= androidx.profileinstaller.n.c.f73814m;
                fN = f10;
            } else {
                fN = f10;
                if ((i11 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    if (c0VarR.I(fN)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i13 |= i18;
                }
            }
            if ((i11 & 1572864) != 0) {
                if ((i12 & 64) == 0) {
                    i21 = 524288;
                } else {
                    i21 = 524288;
                }
                i13 |= i21;
            }
            z10 = true;
            if ((i13 & 599187) != 599186) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (c0VarR.h(z11, i13 & 1)) {
                c0VarR.l0();
                if ((i11 & 1) != 0) {
                    if (i24 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if ((i12 & 4) != 0) {
                        jM = ir.f29311a.m(c0VarR, 6);
                        i13 &= -897;
                    }
                    if ((i12 & 8) != 0) {
                        jQ = ir.f29311a.q(c0VarR, 6);
                        i13 &= -7169;
                    }
                    if (i14 != 0) {
                        iP = ir.f29311a.p();
                    } else {
                        iP = i15;
                    }
                    if (i17 != 0) {
                        fN = ir.f29311a.n();
                    }
                    if ((i12 & 64) != 0) {
                        if (((i13 & 896) ^ androidx.media3.exoplayer.a5.S0) <= 256) {
                        }
                        if ((57344 & i13) == 16384) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        z13 = z18 | z12;
                        objI0 = c0VarR.i0();
                        if (z13) {
                            objI0 = new Function1() { // from class: androidx.compose.material3.kr
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return os.h0(jM, iP, (androidx.compose.ui.graphics.drawscope.f) obj);
                                }
                            };
                            c0VarR.Y(objI0);
                        } else {
                            objI0 = new Function1() { // from class: androidx.compose.material3.kr
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return os.h0(jM, iP, (androidx.compose.ui.graphics.drawscope.f) obj);
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        function3 = (Function1) objI0;
                        i13 &= -3670017;
                    } else {
                        function3 = function1;
                    }
                    f12 = fN;
                    i20 = iP;
                } else {
                    if (i24 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if ((i12 & 4) != 0) {
                        jM = ir.f29311a.m(c0VarR, 6);
                        i13 &= -897;
                    }
                    if ((i12 & 8) != 0) {
                        jQ = ir.f29311a.q(c0VarR, 6);
                        i13 &= -7169;
                    }
                    if (i14 != 0) {
                        iP = ir.f29311a.p();
                    } else {
                        iP = i15;
                    }
                    if (i17 != 0) {
                        fN = ir.f29311a.n();
                    }
                    if ((i12 & 64) != 0) {
                        if (((i13 & 896) ^ androidx.media3.exoplayer.a5.S0) <= 256) {
                        }
                        if ((57344 & i13) == 16384) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        z13 = z18 | z12;
                        objI0 = c0VarR.i0();
                        if (z13) {
                            objI0 = new Function1() { // from class: androidx.compose.material3.kr
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return os.h0(jM, iP, (androidx.compose.ui.graphics.drawscope.f) obj);
                                }
                            };
                            c0VarR.Y(objI0);
                        } else {
                            objI0 = new Function1() { // from class: androidx.compose.material3.kr
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return os.h0(jM, iP, (androidx.compose.ui.graphics.drawscope.f) obj);
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        function3 = (Function1) objI0;
                        i13 &= -3670017;
                    } else {
                        function3 = function1;
                    }
                    f12 = fN;
                    i20 = iP;
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-339970038, i13, -1, "androidx.compose.material3.LinearProgressIndicator (ProgressIndicator.kt:153)");
                }
                if ((i13 & 14) == 4) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                objI1 = c0VarR.i0();
                if (z14) {
                    objI1 = new Function0() { // from class: androidx.compose.material3.lr
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Float.valueOf(os.i0(function0));
                        }
                    };
                    c0VarR.Y(objI1);
                } else {
                    objI1 = new Function0() { // from class: androidx.compose.material3.lr
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Float.valueOf(os.i0(function0));
                        }
                    };
                    c0VarR.Y(objI1);
                }
                function4 = (Function0) objI1;
                androidx.compose.ui.a0 a0VarB4 = a0Var3.B2(androidx.compose.material3.internal.o.p());
                zD = c0VarR.D(function4);
                objI2 = c0VarR.i0();
                if (zD) {
                    objI2 = new Function1() { // from class: androidx.compose.material3.mr
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return os.j0(function4, (androidx.compose.ui.semantics.e0) obj);
                        }
                    };
                    c0VarR.Y(objI2);
                } else {
                    objI2 = new Function1() { // from class: androidx.compose.material3.mr
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return os.j0(function4, (androidx.compose.ui.semantics.e0) obj);
                        }
                    };
                    c0VarR.Y(objI2);
                }
                androidx.compose.ui.a0 a0VarY3 = androidx.compose.foundation.layout.i6.y(androidx.compose.ui.semantics.t.e(a0VarB4, true, (Function1) objI2), f31444a, f31445b);
                if ((57344 & i13) == 16384) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                if ((458752 & i13) == 131072) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                boolean zD4 = z15 | z16 | c0VarR.D(function4) | ((((i13 & 7168) ^ 3072) <= 2048 && c0VarR.L(jQ)) || (i13 & 3072) == 2048) | ((((i13 & 896) ^ androidx.media3.exoplayer.a5.S0) <= 256 && c0VarR.L(jM)) || (i13 & androidx.media3.exoplayer.a5.S0) == 256);
                if (((3670016 & i13) ^ 1572864) > 1048576) {
                }
                z17 = z10 | zD4;
                objI3 = c0VarR.i0();
                if (z17) {
                    function5 = function3;
                    j14 = jM;
                    j13 = jQ;
                    objI3 = new Function1() { // from class: androidx.compose.material3.nr
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return os.k0(i20, f12, function4, j13, j14, function5, (androidx.compose.ui.graphics.drawscope.f) obj);
                        }
                    };
                    c0VarR.Y(objI3);
                } else {
                    function5 = function3;
                    j14 = jM;
                    j13 = jQ;
                    objI3 = new Function1() { // from class: androidx.compose.material3.nr
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return os.k0(i20, f12, function4, j13, j14, function5, (androidx.compose.ui.graphics.drawscope.f) obj);
                        }
                    };
                    c0VarR.Y(objI3);
                }
                androidx.compose.foundation.f1.e(a0VarY3, (Function1) objI3, c0VarR, 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                i19 = i20;
                f11 = f12;
                j12 = j14;
                function2 = function5;
            } else {
                c0VarR.u();
                f11 = fN;
                a0Var3 = a0Var2;
                i19 = i15;
                j12 = jM;
                j13 = jQ;
                function2 = function1;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                final androidx.compose.ui.a0 a0Var6 = a0Var3;
                final long j17 = j13;
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.or
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return os.g0(function0, a0Var6, j12, j17, i19, f11, function2, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= 24576;
        i15 = i10;
        i17 = i12 & 32;
        if (i17 != 0) {
            i13 |= androidx.profileinstaller.n.c.f73814m;
            fN = f10;
        } else {
            fN = f10;
            if ((i11 & androidx.profileinstaller.n.c.f73814m) == 0) {
                if (c0VarR.I(fN)) {
                    i18 = 131072;
                } else {
                    i18 = 65536;
                }
                i13 |= i18;
            }
        }
        if ((i11 & 1572864) != 0) {
            if ((i12 & 64) == 0) {
                i21 = 524288;
            } else {
                i21 = 524288;
            }
            i13 |= i21;
        }
        z10 = true;
        if ((i13 & 599187) != 599186) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (c0VarR.h(z11, i13 & 1)) {
            c0VarR.l0();
            if ((i11 & 1) != 0) {
                if (i24 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if ((i12 & 4) != 0) {
                    jM = ir.f29311a.m(c0VarR, 6);
                    i13 &= -897;
                }
                if ((i12 & 8) != 0) {
                    jQ = ir.f29311a.q(c0VarR, 6);
                    i13 &= -7169;
                }
                if (i14 != 0) {
                    iP = ir.f29311a.p();
                } else {
                    iP = i15;
                }
                if (i17 != 0) {
                    fN = ir.f29311a.n();
                }
                if ((i12 & 64) != 0) {
                    if (((i13 & 896) ^ androidx.media3.exoplayer.a5.S0) <= 256) {
                    }
                    if ((57344 & i13) == 16384) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    z13 = z18 | z12;
                    objI0 = c0VarR.i0();
                    if (z13) {
                        objI0 = new Function1() { // from class: androidx.compose.material3.kr
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return os.h0(jM, iP, (androidx.compose.ui.graphics.drawscope.f) obj);
                            }
                        };
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = new Function1() { // from class: androidx.compose.material3.kr
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return os.h0(jM, iP, (androidx.compose.ui.graphics.drawscope.f) obj);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    function3 = (Function1) objI0;
                    i13 &= -3670017;
                } else {
                    function3 = function1;
                }
                f12 = fN;
                i20 = iP;
            } else {
                if (i24 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if ((i12 & 4) != 0) {
                    jM = ir.f29311a.m(c0VarR, 6);
                    i13 &= -897;
                }
                if ((i12 & 8) != 0) {
                    jQ = ir.f29311a.q(c0VarR, 6);
                    i13 &= -7169;
                }
                if (i14 != 0) {
                    iP = ir.f29311a.p();
                } else {
                    iP = i15;
                }
                if (i17 != 0) {
                    fN = ir.f29311a.n();
                }
                if ((i12 & 64) != 0) {
                    if (((i13 & 896) ^ androidx.media3.exoplayer.a5.S0) <= 256) {
                    }
                    if ((57344 & i13) == 16384) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    z13 = z18 | z12;
                    objI0 = c0VarR.i0();
                    if (z13) {
                        objI0 = new Function1() { // from class: androidx.compose.material3.kr
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return os.h0(jM, iP, (androidx.compose.ui.graphics.drawscope.f) obj);
                            }
                        };
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = new Function1() { // from class: androidx.compose.material3.kr
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return os.h0(jM, iP, (androidx.compose.ui.graphics.drawscope.f) obj);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    function3 = (Function1) objI0;
                    i13 &= -3670017;
                } else {
                    function3 = function1;
                }
                f12 = fN;
                i20 = iP;
            }
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-339970038, i13, -1, "androidx.compose.material3.LinearProgressIndicator (ProgressIndicator.kt:153)");
            }
            if ((i13 & 14) == 4) {
                z14 = true;
            } else {
                z14 = false;
            }
            objI1 = c0VarR.i0();
            if (z14) {
                objI1 = new Function0() { // from class: androidx.compose.material3.lr
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Float.valueOf(os.i0(function0));
                    }
                };
                c0VarR.Y(objI1);
            } else {
                objI1 = new Function0() { // from class: androidx.compose.material3.lr
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Float.valueOf(os.i0(function0));
                    }
                };
                c0VarR.Y(objI1);
            }
            function4 = (Function0) objI1;
            androidx.compose.ui.a0 a0VarB5 = a0Var3.B2(androidx.compose.material3.internal.o.p());
            zD = c0VarR.D(function4);
            objI2 = c0VarR.i0();
            if (zD) {
                objI2 = new Function1() { // from class: androidx.compose.material3.mr
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return os.j0(function4, (androidx.compose.ui.semantics.e0) obj);
                    }
                };
                c0VarR.Y(objI2);
            } else {
                objI2 = new Function1() { // from class: androidx.compose.material3.mr
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return os.j0(function4, (androidx.compose.ui.semantics.e0) obj);
                    }
                };
                c0VarR.Y(objI2);
            }
            androidx.compose.ui.a0 a0VarY4 = androidx.compose.foundation.layout.i6.y(androidx.compose.ui.semantics.t.e(a0VarB5, true, (Function1) objI2), f31444a, f31445b);
            if ((57344 & i13) == 16384) {
                z15 = true;
            } else {
                z15 = false;
            }
            if ((458752 & i13) == 131072) {
                z16 = true;
            } else {
                z16 = false;
            }
            boolean zD5 = z15 | z16 | c0VarR.D(function4) | ((((i13 & 7168) ^ 3072) <= 2048 && c0VarR.L(jQ)) || (i13 & 3072) == 2048) | ((((i13 & 896) ^ androidx.media3.exoplayer.a5.S0) <= 256 && c0VarR.L(jM)) || (i13 & androidx.media3.exoplayer.a5.S0) == 256);
            if (((3670016 & i13) ^ 1572864) > 1048576) {
            }
            z17 = z10 | zD5;
            objI3 = c0VarR.i0();
            if (z17) {
                function5 = function3;
                j14 = jM;
                j13 = jQ;
                objI3 = new Function1() { // from class: androidx.compose.material3.nr
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return os.k0(i20, f12, function4, j13, j14, function5, (androidx.compose.ui.graphics.drawscope.f) obj);
                    }
                };
                c0VarR.Y(objI3);
            } else {
                function5 = function3;
                j14 = jM;
                j13 = jQ;
                objI3 = new Function1() { // from class: androidx.compose.material3.nr
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return os.k0(i20, f12, function4, j13, j14, function5, (androidx.compose.ui.graphics.drawscope.f) obj);
                    }
                };
                c0VarR.Y(objI3);
            }
            androidx.compose.foundation.f1.e(a0VarY4, (Function1) objI3, c0VarR, 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            i19 = i20;
            f11 = f12;
            j12 = j14;
            function2 = function5;
        } else {
            c0VarR.u();
            f11 = fN;
            a0Var3 = a0Var2;
            i19 = i15;
            j12 = jM;
            j13 = jQ;
            function2 = function1;
        }
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            final androidx.compose.ui.a0 a0Var7 = a0Var3;
            final long j18 = j13;
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.or
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return os.g0(function0, a0Var7, j12, j18, i19, f11, function2, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @androidx.compose.runtime.o
    @kotlin.l(level = kotlin.n.HIDDEN, message = "Maintained for binary compatibility")
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final /* synthetic */ void a0(androidx.compose.ui.a0 a0Var, long j10, long j11, androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        androidx.compose.ui.a0 a0Var2;
        int i12;
        long jM;
        long jQ;
        final androidx.compose.ui.a0 a0Var3;
        final long j12;
        final long j13;
        long j14;
        androidx.compose.ui.a0 a0Var4;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(585576195);
        int i13 = i11 & 1;
        if (i13 != 0) {
            i12 = i10 | 6;
            a0Var2 = a0Var;
        } else if ((i10 & 6) == 0) {
            a0Var2 = a0Var;
            i12 = (c0VarR.D(a0Var2) ? 4 : 2) | i10;
        } else {
            a0Var2 = a0Var;
            i12 = i10;
        }
        if ((i10 & 48) == 0) {
            if ((i11 & 2) == 0) {
                jM = j10;
                int i14 = c0VarR.L(jM) ? 32 : 16;
                i12 |= i14;
            } else {
                jM = j10;
            }
            i12 |= i14;
        } else {
            jM = j10;
        }
        if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
            if ((i11 & 4) == 0) {
                jQ = j11;
                int i15 = c0VarR.L(jQ) ? 256 : 128;
                i12 |= i15;
            } else {
                jQ = j11;
            }
            i12 |= i15;
        } else {
            jQ = j11;
        }
        if (c0VarR.h((i12 & com.planner5d.library.engine.input.f.b.F1) != 146, i12 & 1)) {
            c0VarR.l0();
            if ((i10 & 1) == 0 || c0VarR.y()) {
                androidx.compose.ui.a0 a0Var5 = i13 != 0 ? androidx.compose.ui.a0.E : a0Var2;
                if ((i11 & 2) != 0) {
                    jM = ir.f29311a.m(c0VarR, 6);
                    i12 &= -113;
                }
                if ((i11 & 4) != 0) {
                    jQ = ir.f29311a.q(c0VarR, 6);
                    i12 &= -897;
                }
                j14 = jQ;
                a0Var4 = a0Var5;
            } else {
                c0VarR.u();
                if ((i11 & 2) != 0) {
                    i12 &= -113;
                }
                if ((i11 & 4) != 0) {
                    i12 &= -897;
                }
                j14 = jQ;
                a0Var4 = a0Var2;
            }
            long j15 = jM;
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(585576195, i12, -1, "androidx.compose.material3.LinearProgressIndicator (ProgressIndicator.kt:391)");
            }
            e0(a0Var4, j15, j14, ir.f29311a.p(), 0.0f, c0VarR, (i12 & 14) | 3072 | (i12 & com.planner5d.library.engine.input.f.b.B) | (i12 & 896), 16);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            a0Var3 = a0Var4;
            j12 = j15;
            j13 = j14;
        } else {
            c0VarR.u();
            a0Var3 = a0Var2;
            j12 = jM;
            j13 = jQ;
        }
        androidx.compose.runtime.s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.zr
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return os.l0(a0Var3, j12, j13, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0157  */
    /* JADX WARN: Code duplicated, block: B:104:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004d  */
    /* JADX WARN: Code duplicated, block: B:31:0x005c  */
    /* JADX WARN: Code duplicated, block: B:33:0x0060  */
    /* JADX WARN: Code duplicated, block: B:36:0x0066  */
    /* JADX WARN: Code duplicated, block: B:41:0x0075  */
    /* JADX WARN: Code duplicated, block: B:43:0x0079  */
    /* JADX WARN: Code duplicated, block: B:46:0x007f  */
    /* JADX WARN: Code duplicated, block: B:48:0x0086  */
    /* JADX WARN: Code duplicated, block: B:50:0x008a  */
    /* JADX WARN: Code duplicated, block: B:52:0x0092  */
    /* JADX WARN: Code duplicated, block: B:53:0x0095  */
    /* JADX WARN: Code duplicated, block: B:57:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:61:0x00af  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:72:0x00cc A[PHI: r3 r6 r9 r11
      0x00cc: PHI (r3v24 int) = (r3v19 int), (r3v25 int), (r3v26 int) binds: [B:82:0x00ef, B:70:0x00c8, B:71:0x00ca] A[DONT_GENERATE, DONT_INLINE]
      0x00cc: PHI (r6v8 androidx.compose.ui.a0) = (r6v4 androidx.compose.ui.a0), (r6v3 androidx.compose.ui.a0), (r6v3 androidx.compose.ui.a0) binds: [B:82:0x00ef, B:70:0x00c8, B:71:0x00ca] A[DONT_GENERATE, DONT_INLINE]
      0x00cc: PHI (r9v8 long) = (r9v3 long), (r9v1 long), (r9v1 long) binds: [B:82:0x00ef, B:70:0x00c8, B:71:0x00ca] A[DONT_GENERATE, DONT_INLINE]
      0x00cc: PHI (r11v6 long) = (r11v2 long), (r11v1 long), (r11v1 long) binds: [B:82:0x00ef, B:70:0x00c8, B:71:0x00ca] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:74:0x00d1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:75:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:78:0x00db  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:86:0x0102  */
    /* JADX WARN: Code duplicated, block: B:89:0x010c  */
    /* JADX WARN: Code duplicated, block: B:92:0x0114  */
    /* JADX WARN: Code duplicated, block: B:94:0x011c  */
    /* JADX WARN: Code duplicated, block: B:97:0x013f  */
    /* JADX WARN: Code duplicated, block: B:99:0x0148  */
    @androidx.compose.runtime.o
    @kotlin.l(message = "Use the overload that takes `progress` as a lambda", replaceWith = @kotlin.b1(expression = "LinearProgressIndicator(\nprogress = { progress },\nmodifier = modifier,\ncolor = color,\ntrackColor = trackColor,\nstrokeCap = strokeCap,\n)", imports = {}))
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void b0(final float f10, @Nullable androidx.compose.ui.a0 a0Var, long j10, long j11, int i10, @Nullable androidx.compose.runtime.c0 c0Var, final int i11, final int i12) {
        int i13;
        androidx.compose.ui.a0 a0Var2;
        long jM;
        long jQ;
        int i14;
        int i15;
        int i16;
        boolean z10;
        androidx.compose.runtime.c0 c0Var2;
        final androidx.compose.ui.a0 a0Var3;
        final long j12;
        final long j13;
        final int i17;
        androidx.compose.runtime.s5 s5VarT;
        int iP;
        boolean z11;
        Object objI0;
        int i18;
        int i19;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(905419617);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (c0VarR.I(f10) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i20 = i12 & 2;
        if (i20 == 0) {
            if ((i11 & 48) == 0) {
                a0Var2 = a0Var;
                i13 |= c0VarR.D(a0Var2) ? 32 : 16;
            }
            if ((i11 & androidx.media3.exoplayer.a5.S0) == 0) {
                jM = j10;
                if ((i12 & 4) == 0 || !c0VarR.L(jM)) {
                    i19 = 128;
                } else {
                    i19 = 256;
                }
                i13 |= i19;
            } else {
                jM = j10;
            }
            if ((i11 & 3072) == 0) {
                jQ = j11;
                if ((i12 & 8) == 0 || !c0VarR.L(jQ)) {
                    i18 = 1024;
                } else {
                    i18 = 2048;
                }
                i13 |= i18;
            } else {
                jQ = j11;
            }
            i14 = i12 & 16;
            if (i14 != 0) {
                if ((i11 & 24576) == 0) {
                    i15 = i10;
                    if (c0VarR.K(i15)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i13 |= i16;
                }
                if ((i13 & 9363) != 9362) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i13 & 1)) {
                    c0VarR.l0();
                    if ((i11 & 1) != 0 || c0VarR.y()) {
                        if (i20 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if ((i12 & 4) != 0) {
                            jM = ir.f29311a.m(c0VarR, 6);
                            i13 &= -897;
                        }
                        if ((i12 & 8) != 0) {
                            jQ = ir.f29311a.q(c0VarR, 6);
                            i13 &= -7169;
                        }
                        if (i14 != 0) {
                            iP = ir.f29311a.p();
                        }
                        long j14 = jQ;
                        long j15 = jM;
                        androidx.compose.ui.a0 a0Var4 = a0Var2;
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(905419617, i13, -1, "androidx.compose.material3.LinearProgressIndicator (ProgressIndicator.kt:359)");
                        }
                        z11 = (i13 & 14) == 4;
                        objI0 = c0VarR.i0();
                        if (z11 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = new Function0() { // from class: androidx.compose.material3.tr
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Float.valueOf(os.n0(f10));
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        c0Var2 = c0VarR;
                        Z((Function0) objI0, a0Var4, j15, j14, iP, 0.0f, null, c0Var2, i13 & 65520, 96);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var4;
                        j12 = j15;
                        j13 = j14;
                        i17 = iP;
                    } else {
                        c0VarR.u();
                        if ((i12 & 4) != 0) {
                            i13 &= -897;
                        }
                        if ((i12 & 8) != 0) {
                            i13 &= -7169;
                        }
                    }
                    iP = i15;
                    long j16 = jQ;
                    long j17 = jM;
                    androidx.compose.ui.a0 a0Var5 = a0Var2;
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(905419617, i13, -1, "androidx.compose.material3.LinearProgressIndicator (ProgressIndicator.kt:359)");
                    }
                    if ((i13 & 14) == 4) {
                    }
                    objI0 = c0VarR.i0();
                    if (z11) {
                        objI0 = new Function0() { // from class: androidx.compose.material3.tr
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Float.valueOf(os.n0(f10));
                            }
                        };
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = new Function0() { // from class: androidx.compose.material3.tr
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Float.valueOf(os.n0(f10));
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    c0Var2 = c0VarR;
                    Z((Function0) objI0, a0Var5, j17, j16, iP, 0.0f, null, c0Var2, i13 & 65520, 96);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var5;
                    j12 = j17;
                    j13 = j16;
                    i17 = iP;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var3 = a0Var2;
                    j12 = jM;
                    j13 = jQ;
                    i17 = i15;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.vr
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return os.o0(f10, a0Var3, j12, j13, i17, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 24576;
            i15 = i10;
            if ((i13 & 9363) != 9362) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i13 & 1)) {
                c0VarR.l0();
                if ((i11 & 1) != 0) {
                    if (i20 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if ((i12 & 4) != 0) {
                        jM = ir.f29311a.m(c0VarR, 6);
                        i13 &= -897;
                    }
                    if ((i12 & 8) != 0) {
                        jQ = ir.f29311a.q(c0VarR, 6);
                        i13 &= -7169;
                    }
                    if (i14 != 0) {
                        iP = ir.f29311a.p();
                    } else {
                        iP = i15;
                    }
                } else {
                    if (i20 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if ((i12 & 4) != 0) {
                        jM = ir.f29311a.m(c0VarR, 6);
                        i13 &= -897;
                    }
                    if ((i12 & 8) != 0) {
                        jQ = ir.f29311a.q(c0VarR, 6);
                        i13 &= -7169;
                    }
                    if (i14 != 0) {
                        iP = ir.f29311a.p();
                    } else {
                        iP = i15;
                    }
                }
                long j18 = jQ;
                long j19 = jM;
                androidx.compose.ui.a0 a0Var6 = a0Var2;
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(905419617, i13, -1, "androidx.compose.material3.LinearProgressIndicator (ProgressIndicator.kt:359)");
                }
                if ((i13 & 14) == 4) {
                }
                objI0 = c0VarR.i0();
                if (z11) {
                    objI0 = new Function0() { // from class: androidx.compose.material3.tr
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Float.valueOf(os.n0(f10));
                        }
                    };
                    c0VarR.Y(objI0);
                } else {
                    objI0 = new Function0() { // from class: androidx.compose.material3.tr
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Float.valueOf(os.n0(f10));
                        }
                    };
                    c0VarR.Y(objI0);
                }
                c0Var2 = c0VarR;
                Z((Function0) objI0, a0Var6, j19, j18, iP, 0.0f, null, c0Var2, i13 & 65520, 96);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var6;
                j12 = j19;
                j13 = j18;
                i17 = iP;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var3 = a0Var2;
                j12 = jM;
                j13 = jQ;
                i17 = i15;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.vr
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return os.o0(f10, a0Var3, j12, j13, i17, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= 48;
        a0Var2 = a0Var;
        if ((i11 & androidx.media3.exoplayer.a5.S0) == 0) {
            jM = j10;
            if ((i12 & 4) == 0) {
                i19 = 128;
            } else {
                i19 = 128;
            }
            i13 |= i19;
        } else {
            jM = j10;
        }
        if ((i11 & 3072) == 0) {
            jQ = j11;
            if ((i12 & 8) == 0) {
                i18 = 1024;
            } else {
                i18 = 1024;
            }
            i13 |= i18;
        } else {
            jQ = j11;
        }
        i14 = i12 & 16;
        if (i14 != 0) {
            if ((i11 & 24576) == 0) {
                i15 = i10;
                if (c0VarR.K(i15)) {
                    i16 = 16384;
                } else {
                    i16 = 8192;
                }
                i13 |= i16;
            }
            if ((i13 & 9363) != 9362) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i13 & 1)) {
                c0VarR.l0();
                if ((i11 & 1) != 0) {
                    if (i20 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if ((i12 & 4) != 0) {
                        jM = ir.f29311a.m(c0VarR, 6);
                        i13 &= -897;
                    }
                    if ((i12 & 8) != 0) {
                        jQ = ir.f29311a.q(c0VarR, 6);
                        i13 &= -7169;
                    }
                    if (i14 != 0) {
                        iP = ir.f29311a.p();
                    } else {
                        iP = i15;
                    }
                } else {
                    if (i20 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if ((i12 & 4) != 0) {
                        jM = ir.f29311a.m(c0VarR, 6);
                        i13 &= -897;
                    }
                    if ((i12 & 8) != 0) {
                        jQ = ir.f29311a.q(c0VarR, 6);
                        i13 &= -7169;
                    }
                    if (i14 != 0) {
                        iP = ir.f29311a.p();
                    } else {
                        iP = i15;
                    }
                }
                long j110 = jQ;
                long j111 = jM;
                androidx.compose.ui.a0 a0Var7 = a0Var2;
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(905419617, i13, -1, "androidx.compose.material3.LinearProgressIndicator (ProgressIndicator.kt:359)");
                }
                if ((i13 & 14) == 4) {
                }
                objI0 = c0VarR.i0();
                if (z11) {
                    objI0 = new Function0() { // from class: androidx.compose.material3.tr
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Float.valueOf(os.n0(f10));
                        }
                    };
                    c0VarR.Y(objI0);
                } else {
                    objI0 = new Function0() { // from class: androidx.compose.material3.tr
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Float.valueOf(os.n0(f10));
                        }
                    };
                    c0VarR.Y(objI0);
                }
                c0Var2 = c0VarR;
                Z((Function0) objI0, a0Var7, j111, j110, iP, 0.0f, null, c0Var2, i13 & 65520, 96);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var7;
                j12 = j111;
                j13 = j110;
                i17 = iP;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var3 = a0Var2;
                j12 = jM;
                j13 = jQ;
                i17 = i15;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.vr
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return os.o0(f10, a0Var3, j12, j13, i17, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= 24576;
        i15 = i10;
        if ((i13 & 9363) != 9362) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c0VarR.h(z10, i13 & 1)) {
            c0VarR.l0();
            if ((i11 & 1) != 0) {
                if (i20 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                }
                if ((i12 & 4) != 0) {
                    jM = ir.f29311a.m(c0VarR, 6);
                    i13 &= -897;
                }
                if ((i12 & 8) != 0) {
                    jQ = ir.f29311a.q(c0VarR, 6);
                    i13 &= -7169;
                }
                if (i14 != 0) {
                    iP = ir.f29311a.p();
                } else {
                    iP = i15;
                }
            } else {
                if (i20 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                }
                if ((i12 & 4) != 0) {
                    jM = ir.f29311a.m(c0VarR, 6);
                    i13 &= -897;
                }
                if ((i12 & 8) != 0) {
                    jQ = ir.f29311a.q(c0VarR, 6);
                    i13 &= -7169;
                }
                if (i14 != 0) {
                    iP = ir.f29311a.p();
                } else {
                    iP = i15;
                }
            }
            long j112 = jQ;
            long j113 = jM;
            androidx.compose.ui.a0 a0Var8 = a0Var2;
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(905419617, i13, -1, "androidx.compose.material3.LinearProgressIndicator (ProgressIndicator.kt:359)");
            }
            if ((i13 & 14) == 4) {
            }
            objI0 = c0VarR.i0();
            if (z11) {
                objI0 = new Function0() { // from class: androidx.compose.material3.tr
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Float.valueOf(os.n0(f10));
                    }
                };
                c0VarR.Y(objI0);
            } else {
                objI0 = new Function0() { // from class: androidx.compose.material3.tr
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Float.valueOf(os.n0(f10));
                    }
                };
                c0VarR.Y(objI0);
            }
            c0Var2 = c0VarR;
            Z((Function0) objI0, a0Var8, j113, j112, iP, 0.0f, null, c0Var2, i13 & 65520, 96);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            a0Var3 = a0Var8;
            j12 = j113;
            j13 = j112;
            i17 = iP;
        } else {
            c0Var2 = c0VarR;
            c0Var2.u();
            a0Var3 = a0Var2;
            j12 = jM;
            j13 = jQ;
            i17 = i15;
        }
        s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.vr
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return os.o0(f10, a0Var3, j12, j13, i17, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:28:0x004d  */
    /* JADX WARN: Code duplicated, block: B:30:0x0055  */
    /* JADX WARN: Code duplicated, block: B:31:0x0058  */
    /* JADX WARN: Code duplicated, block: B:34:0x005e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0064  */
    /* JADX WARN: Code duplicated, block: B:42:0x0073  */
    /* JADX WARN: Code duplicated, block: B:44:0x0077  */
    /* JADX WARN: Code duplicated, block: B:47:0x007d  */
    /* JADX WARN: Code duplicated, block: B:49:0x0082  */
    /* JADX WARN: Code duplicated, block: B:51:0x0086  */
    /* JADX WARN: Code duplicated, block: B:53:0x008e  */
    /* JADX WARN: Code duplicated, block: B:54:0x0091  */
    /* JADX WARN: Code duplicated, block: B:58:0x009a  */
    /* JADX WARN: Code duplicated, block: B:59:0x009c  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:75:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:76:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:80:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:85:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:90:0x0105  */
    /* JADX WARN: Code duplicated, block: B:93:0x0134  */
    /* JADX WARN: Code duplicated, block: B:95:0x013c  */
    /* JADX WARN: Code duplicated, block: B:98:0x014c  */
    @androidx.compose.runtime.o
    @kotlin.l(level = kotlin.n.HIDDEN, message = "Use the overload that takes `gapSize` and `drawStopIndicator`, see `LegacyLinearProgressIndicatorSample` on how to restore the previous behavior", replaceWith = @kotlin.b1(expression = "LinearProgressIndicator(progress, modifier, color, trackColor, strokeCap, gapSize, drawStopIndicator)", imports = {}))
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final /* synthetic */ void c0(final Function0 function0, androidx.compose.ui.a0 a0Var, long j10, long j11, int i10, androidx.compose.runtime.c0 c0Var, final int i11, final int i12) {
        Function0 function1;
        int i13;
        androidx.compose.ui.a0 a0Var2;
        long j12;
        long jQ;
        int i14;
        int i15;
        int i16;
        boolean z10;
        androidx.compose.runtime.c0 c0Var2;
        final androidx.compose.ui.a0 a0Var3;
        final long j13;
        final long j14;
        final int i17;
        androidx.compose.runtime.s5 s5VarT;
        androidx.compose.ui.a0 a0Var4;
        long jM;
        int iP;
        androidx.compose.ui.a0 a0Var5;
        long j15;
        int i18;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1796992155);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
            function1 = function0;
        } else {
            function1 = function0;
            if ((i11 & 6) == 0) {
                i13 = (c0VarR.k0(function1) ? 4 : 2) | i11;
            } else {
                i13 = i11;
            }
        }
        int i19 = i12 & 2;
        if (i19 == 0) {
            if ((i11 & 48) == 0) {
                a0Var2 = a0Var;
                i13 |= c0VarR.D(a0Var2) ? 32 : 16;
            }
            if ((i11 & androidx.media3.exoplayer.a5.S0) == 0) {
                if ((i12 & 4) == 0) {
                    j12 = j10;
                    int i20 = c0VarR.L(j12) ? 256 : 128;
                    i13 |= i20;
                } else {
                    j12 = j10;
                }
                i13 |= i20;
            } else {
                j12 = j10;
            }
            if ((i11 & 3072) == 0) {
                jQ = j11;
                if ((i12 & 8) == 0 || !c0VarR.L(jQ)) {
                    i18 = 1024;
                } else {
                    i18 = 2048;
                }
                i13 |= i18;
            } else {
                jQ = j11;
            }
            i14 = i12 & 16;
            if (i14 != 0) {
                if ((i11 & 24576) == 0) {
                    i15 = i10;
                    if (c0VarR.K(i15)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i13 |= i16;
                }
                if ((i13 & 9363) != 9362) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i13 & 1)) {
                    c0VarR.l0();
                    if ((i11 & 1) != 0 || c0VarR.y()) {
                        if (i19 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if ((i12 & 4) != 0) {
                            jM = ir.f29311a.m(c0VarR, 6);
                            i13 &= -897;
                        } else {
                            jM = j12;
                        }
                        if ((i12 & 8) != 0) {
                            jQ = ir.f29311a.q(c0VarR, 6);
                            i13 &= -7169;
                        }
                        if (i14 != 0) {
                            iP = ir.f29311a.p();
                        } else {
                            iP = i15;
                        }
                        a0Var5 = a0Var4;
                        j15 = jM;
                    } else {
                        c0VarR.u();
                        if ((i12 & 4) != 0) {
                            i13 &= -897;
                        }
                        if ((i12 & 8) != 0) {
                            i13 &= -7169;
                        }
                        jQ = jQ;
                        iP = i15;
                        a0Var5 = a0Var2;
                        j15 = j12;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1796992155, i13, -1, "androidx.compose.material3.LinearProgressIndicator (ProgressIndicator.kt:100)");
                    }
                    c0Var2 = c0VarR;
                    Z(function1, a0Var5, j15, jQ, iP, ir.f29311a.n(), null, c0Var2, (i13 & 14) | androidx.profileinstaller.n.c.f73814m | (i13 & com.planner5d.library.engine.input.f.b.B) | (i13 & 896) | (i13 & 7168) | (i13 & 57344), 64);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var5;
                    j13 = j15;
                    j14 = jQ;
                    i17 = iP;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var3 = a0Var2;
                    j13 = j12;
                    j14 = jQ;
                    i17 = i15;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.fs
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return os.m0(function0, a0Var3, j13, j14, i17, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 24576;
            i15 = i10;
            if ((i13 & 9363) != 9362) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i13 & 1)) {
                c0VarR.l0();
                if ((i11 & 1) != 0) {
                    if (i19 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if ((i12 & 4) != 0) {
                        jM = ir.f29311a.m(c0VarR, 6);
                        i13 &= -897;
                    } else {
                        jM = j12;
                    }
                    if ((i12 & 8) != 0) {
                        jQ = ir.f29311a.q(c0VarR, 6);
                        i13 &= -7169;
                    }
                    if (i14 != 0) {
                        iP = ir.f29311a.p();
                    } else {
                        iP = i15;
                    }
                    a0Var5 = a0Var4;
                    j15 = jM;
                } else {
                    if (i19 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if ((i12 & 4) != 0) {
                        jM = ir.f29311a.m(c0VarR, 6);
                        i13 &= -897;
                    } else {
                        jM = j12;
                    }
                    if ((i12 & 8) != 0) {
                        jQ = ir.f29311a.q(c0VarR, 6);
                        i13 &= -7169;
                    }
                    if (i14 != 0) {
                        iP = ir.f29311a.p();
                    } else {
                        iP = i15;
                    }
                    a0Var5 = a0Var4;
                    j15 = jM;
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1796992155, i13, -1, "androidx.compose.material3.LinearProgressIndicator (ProgressIndicator.kt:100)");
                }
                c0Var2 = c0VarR;
                Z(function1, a0Var5, j15, jQ, iP, ir.f29311a.n(), null, c0Var2, (i13 & 14) | androidx.profileinstaller.n.c.f73814m | (i13 & com.planner5d.library.engine.input.f.b.B) | (i13 & 896) | (i13 & 7168) | (i13 & 57344), 64);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var5;
                j13 = j15;
                j14 = jQ;
                i17 = iP;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var3 = a0Var2;
                j13 = j12;
                j14 = jQ;
                i17 = i15;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.fs
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return os.m0(function0, a0Var3, j13, j14, i17, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= 48;
        a0Var2 = a0Var;
        if ((i11 & androidx.media3.exoplayer.a5.S0) == 0) {
            if ((i12 & 4) == 0) {
                j12 = j10;
                if (c0VarR.L(j12)) {
                }
                i13 |= i20;
            } else {
                j12 = j10;
            }
            i13 |= i20;
        } else {
            j12 = j10;
        }
        if ((i11 & 3072) == 0) {
            jQ = j11;
            if ((i12 & 8) == 0) {
                i18 = 1024;
            } else {
                i18 = 1024;
            }
            i13 |= i18;
        } else {
            jQ = j11;
        }
        i14 = i12 & 16;
        if (i14 != 0) {
            if ((i11 & 24576) == 0) {
                i15 = i10;
                if (c0VarR.K(i15)) {
                    i16 = 16384;
                } else {
                    i16 = 8192;
                }
                i13 |= i16;
            }
            if ((i13 & 9363) != 9362) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i13 & 1)) {
                c0VarR.l0();
                if ((i11 & 1) != 0) {
                    if (i19 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if ((i12 & 4) != 0) {
                        jM = ir.f29311a.m(c0VarR, 6);
                        i13 &= -897;
                    } else {
                        jM = j12;
                    }
                    if ((i12 & 8) != 0) {
                        jQ = ir.f29311a.q(c0VarR, 6);
                        i13 &= -7169;
                    }
                    if (i14 != 0) {
                        iP = ir.f29311a.p();
                    } else {
                        iP = i15;
                    }
                    a0Var5 = a0Var4;
                    j15 = jM;
                } else {
                    if (i19 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if ((i12 & 4) != 0) {
                        jM = ir.f29311a.m(c0VarR, 6);
                        i13 &= -897;
                    } else {
                        jM = j12;
                    }
                    if ((i12 & 8) != 0) {
                        jQ = ir.f29311a.q(c0VarR, 6);
                        i13 &= -7169;
                    }
                    if (i14 != 0) {
                        iP = ir.f29311a.p();
                    } else {
                        iP = i15;
                    }
                    a0Var5 = a0Var4;
                    j15 = jM;
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1796992155, i13, -1, "androidx.compose.material3.LinearProgressIndicator (ProgressIndicator.kt:100)");
                }
                c0Var2 = c0VarR;
                Z(function1, a0Var5, j15, jQ, iP, ir.f29311a.n(), null, c0Var2, (i13 & 14) | androidx.profileinstaller.n.c.f73814m | (i13 & com.planner5d.library.engine.input.f.b.B) | (i13 & 896) | (i13 & 7168) | (i13 & 57344), 64);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var5;
                j13 = j15;
                j14 = jQ;
                i17 = iP;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var3 = a0Var2;
                j13 = j12;
                j14 = jQ;
                i17 = i15;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.fs
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return os.m0(function0, a0Var3, j13, j14, i17, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= 24576;
        i15 = i10;
        if ((i13 & 9363) != 9362) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c0VarR.h(z10, i13 & 1)) {
            c0VarR.l0();
            if ((i11 & 1) != 0) {
                if (i19 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if ((i12 & 4) != 0) {
                    jM = ir.f29311a.m(c0VarR, 6);
                    i13 &= -897;
                } else {
                    jM = j12;
                }
                if ((i12 & 8) != 0) {
                    jQ = ir.f29311a.q(c0VarR, 6);
                    i13 &= -7169;
                }
                if (i14 != 0) {
                    iP = ir.f29311a.p();
                } else {
                    iP = i15;
                }
                a0Var5 = a0Var4;
                j15 = jM;
            } else {
                if (i19 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if ((i12 & 4) != 0) {
                    jM = ir.f29311a.m(c0VarR, 6);
                    i13 &= -897;
                } else {
                    jM = j12;
                }
                if ((i12 & 8) != 0) {
                    jQ = ir.f29311a.q(c0VarR, 6);
                    i13 &= -7169;
                }
                if (i14 != 0) {
                    iP = ir.f29311a.p();
                } else {
                    iP = i15;
                }
                a0Var5 = a0Var4;
                j15 = jM;
            }
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1796992155, i13, -1, "androidx.compose.material3.LinearProgressIndicator (ProgressIndicator.kt:100)");
            }
            c0Var2 = c0VarR;
            Z(function1, a0Var5, j15, jQ, iP, ir.f29311a.n(), null, c0Var2, (i13 & 14) | androidx.profileinstaller.n.c.f73814m | (i13 & com.planner5d.library.engine.input.f.b.B) | (i13 & 896) | (i13 & 7168) | (i13 & 57344), 64);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            a0Var3 = a0Var5;
            j13 = j15;
            j14 = jQ;
            i17 = iP;
        } else {
            c0Var2 = c0VarR;
            c0Var2.u();
            a0Var3 = a0Var2;
            j13 = j12;
            j14 = jQ;
            i17 = i15;
        }
        s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.fs
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return os.m0(function0, a0Var3, j13, j14, i17, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004c  */
    /* JADX WARN: Code duplicated, block: B:28:0x0050  */
    /* JADX WARN: Code duplicated, block: B:30:0x0058  */
    /* JADX WARN: Code duplicated, block: B:31:0x005b  */
    /* JADX WARN: Code duplicated, block: B:34:0x0061  */
    /* JADX WARN: Code duplicated, block: B:37:0x0067  */
    /* JADX WARN: Code duplicated, block: B:42:0x0076  */
    /* JADX WARN: Code duplicated, block: B:44:0x007a  */
    /* JADX WARN: Code duplicated, block: B:47:0x0082  */
    /* JADX WARN: Code duplicated, block: B:48:0x0084  */
    /* JADX WARN: Code duplicated, block: B:51:0x008d  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ae A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:76:0x00df  */
    /* JADX WARN: Code duplicated, block: B:79:0x0104  */
    /* JADX WARN: Code duplicated, block: B:81:0x010b  */
    /* JADX WARN: Code duplicated, block: B:84:0x0117  */
    /* JADX WARN: Code duplicated, block: B:86:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.o
    @kotlin.l(level = kotlin.n.HIDDEN, message = "Maintained for binary compatibility")
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final /* synthetic */ void d0(final float f10, androidx.compose.ui.a0 a0Var, long j10, long j11, androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        float f11;
        int i12;
        androidx.compose.ui.a0 a0Var2;
        long j12;
        long j13;
        boolean z10;
        final androidx.compose.ui.a0 a0Var3;
        final long j14;
        final long j15;
        androidx.compose.runtime.s5 s5VarT;
        androidx.compose.ui.a0 a0Var4;
        long jM;
        long jQ;
        androidx.compose.ui.a0 a0Var5;
        long j16;
        int i13;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-372717133);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
            f11 = f10;
        } else {
            f11 = f10;
            if ((i10 & 6) == 0) {
                i12 = (c0VarR.I(f11) ? 4 : 2) | i10;
            } else {
                i12 = i10;
            }
        }
        int i14 = i11 & 2;
        if (i14 == 0) {
            if ((i10 & 48) == 0) {
                a0Var2 = a0Var;
                i12 |= c0VarR.D(a0Var2) ? 32 : 16;
            }
            if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                if ((i11 & 4) == 0) {
                    j12 = j10;
                    int i15 = c0VarR.L(j12) ? 256 : 128;
                    i12 |= i15;
                } else {
                    j12 = j10;
                }
                i12 |= i15;
            } else {
                j12 = j10;
            }
            if ((i10 & 3072) == 0) {
                j13 = j11;
                if ((i11 & 8) == 0 || !c0VarR.L(j13)) {
                    i13 = 1024;
                } else {
                    i13 = 2048;
                }
                i12 |= i13;
            } else {
                j13 = j11;
            }
            if ((i12 & 1171) != 1170) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0 || c0VarR.y()) {
                    if (i14 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if ((i11 & 4) != 0) {
                        jM = ir.f29311a.m(c0VarR, 6);
                        i12 &= -897;
                    } else {
                        jM = j12;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        a0Var5 = a0Var4;
                        j16 = jM;
                        jQ = ir.f29311a.q(c0VarR, 6);
                    } else {
                        jQ = j13;
                        a0Var5 = a0Var4;
                        j16 = jM;
                    }
                } else {
                    c0VarR.u();
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                    }
                    jQ = j13;
                    a0Var5 = a0Var2;
                    j16 = j12;
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-372717133, i12, -1, "androidx.compose.material3.LinearProgressIndicator (ProgressIndicator.kt:376)");
                }
                b0(f11, a0Var5, j16, jQ, ir.f29311a.p(), c0VarR, (i12 & 14) | 24576 | (i12 & com.planner5d.library.engine.input.f.b.B) | (i12 & 896) | (i12 & 7168), 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var5;
                j14 = j16;
                j15 = jQ;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                j14 = j12;
                j15 = j13;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.bs
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return os.p0(f10, a0Var3, j14, j15, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 48;
        a0Var2 = a0Var;
        if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
            if ((i11 & 4) == 0) {
                j12 = j10;
                if (c0VarR.L(j12)) {
                }
                i12 |= i15;
            } else {
                j12 = j10;
            }
            i12 |= i15;
        } else {
            j12 = j10;
        }
        if ((i10 & 3072) == 0) {
            j13 = j11;
            if ((i11 & 8) == 0) {
                i13 = 1024;
            } else {
                i13 = 1024;
            }
            i12 |= i13;
        } else {
            j13 = j11;
        }
        if ((i12 & 1171) != 1170) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c0VarR.h(z10, i12 & 1)) {
            c0VarR.l0();
            if ((i10 & 1) != 0) {
                if (i14 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if ((i11 & 4) != 0) {
                    jM = ir.f29311a.m(c0VarR, 6);
                    i12 &= -897;
                } else {
                    jM = j12;
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    a0Var5 = a0Var4;
                    j16 = jM;
                    jQ = ir.f29311a.q(c0VarR, 6);
                } else {
                    jQ = j13;
                    a0Var5 = a0Var4;
                    j16 = jM;
                }
            } else {
                if (i14 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if ((i11 & 4) != 0) {
                    jM = ir.f29311a.m(c0VarR, 6);
                    i12 &= -897;
                } else {
                    jM = j12;
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    a0Var5 = a0Var4;
                    j16 = jM;
                    jQ = ir.f29311a.q(c0VarR, 6);
                } else {
                    jQ = j13;
                    a0Var5 = a0Var4;
                    j16 = jM;
                }
            }
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-372717133, i12, -1, "androidx.compose.material3.LinearProgressIndicator (ProgressIndicator.kt:376)");
            }
            b0(f11, a0Var5, j16, jQ, ir.f29311a.p(), c0VarR, (i12 & 14) | 24576 | (i12 & com.planner5d.library.engine.input.f.b.B) | (i12 & 896) | (i12 & 7168), 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            a0Var3 = a0Var5;
            j14 = j16;
            j15 = jQ;
        } else {
            c0VarR.u();
            a0Var3 = a0Var2;
            j14 = j12;
            j15 = j13;
        }
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.bs
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return os.p0(f10, a0Var3, j14, j15, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:103:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:109:0x0210  */
    /* JADX WARN: Code duplicated, block: B:111:0x0216  */
    /* JADX WARN: Code duplicated, block: B:117:0x022e  */
    /* JADX WARN: Code duplicated, block: B:121:0x023c  */
    /* JADX WARN: Code duplicated, block: B:124:0x0260  */
    /* JADX WARN: Code duplicated, block: B:126:0x026e  */
    /* JADX WARN: Code duplicated, block: B:129:0x027d  */
    /* JADX WARN: Code duplicated, block: B:131:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:46:0x007c  */
    /* JADX WARN: Code duplicated, block: B:48:0x0081  */
    /* JADX WARN: Code duplicated, block: B:50:0x0085  */
    /* JADX WARN: Code duplicated, block: B:52:0x008d  */
    /* JADX WARN: Code duplicated, block: B:53:0x0090  */
    /* JADX WARN: Code duplicated, block: B:57:0x009b  */
    /* JADX WARN: Code duplicated, block: B:58:0x009e  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c6 A[PHI: r2 r4 r9 r11 r14
      0x00c6: PHI (r2v8 androidx.compose.ui.a0) = (r2v4 androidx.compose.ui.a0), (r2v12 androidx.compose.ui.a0) binds: [B:86:0x00f7, B:72:0x00c4] A[DONT_GENERATE, DONT_INLINE]
      0x00c6: PHI (r4v33 int) = (r4v16 int), (r4v35 int) binds: [B:86:0x00f7, B:72:0x00c4] A[DONT_GENERATE, DONT_INLINE]
      0x00c6: PHI (r9v6 long) = (r9v3 long), (r9v1 long) binds: [B:86:0x00f7, B:72:0x00c4] A[DONT_GENERATE, DONT_INLINE]
      0x00c6: PHI (r11v5 long) = (r11v2 long), (r11v1 long) binds: [B:86:0x00f7, B:72:0x00c4] A[DONT_GENERATE, DONT_INLINE]
      0x00c6: PHI (r14v30 int) = (r14v3 int), (r14v2 int) binds: [B:86:0x00f7, B:72:0x00c4] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:75:0x00cd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:76:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:80:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:90:0x010b  */
    /* JADX WARN: Code duplicated, block: B:93:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:94:0x01db  */
    /* JADX WARN: Code duplicated, block: B:97:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:98:0x01e6  */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void e0(@Nullable androidx.compose.ui.a0 a0Var, long j10, long j11, int i10, float f10, @Nullable androidx.compose.runtime.c0 c0Var, final int i11, final int i12) {
        androidx.compose.ui.a0 a0Var2;
        int i13;
        long jM;
        long jQ;
        int iP;
        int i14;
        final float f11;
        int i15;
        boolean z10;
        androidx.compose.runtime.c0 c0Var2;
        final androidx.compose.ui.a0 a0Var3;
        final long j12;
        final long j13;
        final int i16;
        androidx.compose.runtime.s5 s5VarT;
        androidx.compose.ui.a0 a0Var4;
        final float fN;
        final int i17;
        final androidx.compose.runtime.n7<Float> n7VarD;
        final androidx.compose.runtime.n7<Float> n7VarD2;
        final androidx.compose.runtime.n7<Float> n7VarD3;
        final androidx.compose.runtime.n7<Float> n7VarD4;
        boolean z11;
        boolean z12;
        boolean zD;
        Object objI0;
        final long j14;
        final long j15;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(567589233);
        int i18 = i12 & 1;
        if (i18 != 0) {
            i13 = i11 | 6;
            a0Var2 = a0Var;
        } else if ((i11 & 6) == 0) {
            a0Var2 = a0Var;
            i13 = (c0VarR.D(a0Var2) ? 4 : 2) | i11;
        } else {
            a0Var2 = a0Var;
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            jM = j10;
            i13 |= ((i12 & 2) == 0 && c0VarR.L(jM)) ? 32 : 16;
        } else {
            jM = j10;
        }
        if ((i11 & androidx.media3.exoplayer.a5.S0) == 0) {
            jQ = j11;
            i13 |= ((i12 & 4) == 0 && c0VarR.L(jQ)) ? 256 : 128;
        } else {
            jQ = j11;
        }
        int i19 = i12 & 8;
        if (i19 == 0) {
            if ((i11 & 3072) == 0) {
                iP = i10;
                i13 |= c0VarR.K(iP) ? 2048 : 1024;
            }
            i14 = i12 & 16;
            if (i14 != 0) {
                if ((i11 & 24576) == 0) {
                    f11 = f10;
                    if (c0VarR.I(f11)) {
                        i15 = 16384;
                    } else {
                        i15 = 8192;
                    }
                    i13 |= i15;
                }
                if ((i13 & 9363) != 9362) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i13 & 1)) {
                    c0VarR.l0();
                    if ((i11 & 1) != 0 || c0VarR.y()) {
                        if (i18 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if ((i12 & 2) != 0) {
                            jM = ir.f29311a.m(c0VarR, 6);
                            i13 &= -113;
                        }
                        if ((i12 & 4) != 0) {
                            jQ = ir.f29311a.q(c0VarR, 6);
                            i13 &= -897;
                        }
                        if (i19 != 0) {
                            iP = ir.f29311a.p();
                        }
                        if (i14 != 0) {
                            fN = ir.f29311a.n();
                        }
                        i17 = iP;
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(567589233, i13, -1, "androidx.compose.material3.LinearProgressIndicator (ProgressIndicator.kt:254)");
                        }
                        androidx.compose.animation.core.i1 i1VarJ = androidx.compose.animation.core.n1.j(null, c0VarR, 0, 1);
                        androidx.compose.animation.core.g1<Float> g1VarI0 = I0();
                        int i20 = androidx.compose.animation.core.i1.f13005f;
                        int i21 = androidx.compose.animation.core.g1.f12967d;
                        n7VarD = androidx.compose.animation.core.n1.d(i1VarJ, 0.0f, 1.0f, g1VarI0, null, c0VarR, i20 | 432 | (i21 << 9), 8);
                        n7VarD2 = androidx.compose.animation.core.n1.d(i1VarJ, 0.0f, 1.0f, J0(), null, c0VarR, i20 | 432 | (i21 << 9), 8);
                        n7VarD3 = androidx.compose.animation.core.n1.d(i1VarJ, 0.0f, 1.0f, L0(), null, c0VarR, i20 | 432 | (i21 << 9), 8);
                        n7VarD4 = androidx.compose.animation.core.n1.d(i1VarJ, 0.0f, 1.0f, M0(), null, c0VarR, i20 | 432 | (i21 << 9), 8);
                        c0Var2 = c0VarR;
                        androidx.compose.ui.a0 a0VarY = androidx.compose.foundation.layout.i6.y(androidx.compose.foundation.m4.c(a0Var4.B2(androidx.compose.material3.internal.o.p())), f31444a, f31445b);
                        if ((i13 & 7168) == 2048) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        if ((57344 & i13) == 16384) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        zD = z12 | z11 | c0Var2.D(n7VarD) | ((((i13 & 896) ^ androidx.media3.exoplayer.a5.S0) <= 256 && c0Var2.L(jQ)) || (i13 & androidx.media3.exoplayer.a5.S0) == 256) | c0Var2.D(n7VarD2) | ((((i13 & com.planner5d.library.engine.input.f.b.B) ^ 48) <= 32 && c0Var2.L(jM)) || (i13 & 48) == 32) | c0Var2.D(n7VarD3) | c0Var2.D(n7VarD4);
                        objI0 = c0Var2.i0();
                        if (!zD || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            j14 = jM;
                            j15 = jQ;
                            objI0 = new Function1() { // from class: androidx.compose.material3.qr
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return os.q0(i17, fN, n7VarD, j15, n7VarD2, j14, n7VarD3, n7VarD4, (androidx.compose.ui.graphics.drawscope.f) obj);
                                }
                            };
                            c0Var2.Y(objI0);
                        } else {
                            j14 = jM;
                            j15 = jQ;
                        }
                        androidx.compose.foundation.f1.e(a0VarY, (Function1) objI0, c0Var2, 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var4;
                        i16 = i17;
                        f11 = fN;
                        j13 = j15;
                        j12 = j14;
                    } else {
                        c0VarR.u();
                        if ((i12 & 2) != 0) {
                            i13 &= -113;
                        }
                        if ((i12 & 4) != 0) {
                            i13 &= -897;
                        }
                        a0Var4 = a0Var2;
                    }
                    fN = f11;
                    i17 = iP;
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(567589233, i13, -1, "androidx.compose.material3.LinearProgressIndicator (ProgressIndicator.kt:254)");
                    }
                    androidx.compose.animation.core.i1 i1VarJ2 = androidx.compose.animation.core.n1.j(null, c0VarR, 0, 1);
                    androidx.compose.animation.core.g1<Float> g1VarI1 = I0();
                    int i22 = androidx.compose.animation.core.i1.f13005f;
                    int i23 = androidx.compose.animation.core.g1.f12967d;
                    n7VarD = androidx.compose.animation.core.n1.d(i1VarJ2, 0.0f, 1.0f, g1VarI1, null, c0VarR, i22 | 432 | (i23 << 9), 8);
                    n7VarD2 = androidx.compose.animation.core.n1.d(i1VarJ2, 0.0f, 1.0f, J0(), null, c0VarR, i22 | 432 | (i23 << 9), 8);
                    n7VarD3 = androidx.compose.animation.core.n1.d(i1VarJ2, 0.0f, 1.0f, L0(), null, c0VarR, i22 | 432 | (i23 << 9), 8);
                    n7VarD4 = androidx.compose.animation.core.n1.d(i1VarJ2, 0.0f, 1.0f, M0(), null, c0VarR, i22 | 432 | (i23 << 9), 8);
                    c0Var2 = c0VarR;
                    androidx.compose.ui.a0 a0VarY2 = androidx.compose.foundation.layout.i6.y(androidx.compose.foundation.m4.c(a0Var4.B2(androidx.compose.material3.internal.o.p())), f31444a, f31445b);
                    if ((i13 & 7168) == 2048) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if ((57344 & i13) == 16384) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    zD = z12 | z11 | c0Var2.D(n7VarD) | ((((i13 & 896) ^ androidx.media3.exoplayer.a5.S0) <= 256 && c0Var2.L(jQ)) || (i13 & androidx.media3.exoplayer.a5.S0) == 256) | c0Var2.D(n7VarD2) | ((((i13 & com.planner5d.library.engine.input.f.b.B) ^ 48) <= 32 && c0Var2.L(jM)) || (i13 & 48) == 32) | c0Var2.D(n7VarD3) | c0Var2.D(n7VarD4);
                    objI0 = c0Var2.i0();
                    if (zD) {
                        j14 = jM;
                        j15 = jQ;
                        objI0 = new Function1() { // from class: androidx.compose.material3.qr
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return os.q0(i17, fN, n7VarD, j15, n7VarD2, j14, n7VarD3, n7VarD4, (androidx.compose.ui.graphics.drawscope.f) obj);
                            }
                        };
                        c0Var2.Y(objI0);
                    } else {
                        j14 = jM;
                        j15 = jQ;
                        objI0 = new Function1() { // from class: androidx.compose.material3.qr
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return os.q0(i17, fN, n7VarD, j15, n7VarD2, j14, n7VarD3, n7VarD4, (androidx.compose.ui.graphics.drawscope.f) obj);
                            }
                        };
                        c0Var2.Y(objI0);
                    }
                    androidx.compose.foundation.f1.e(a0VarY2, (Function1) objI0, c0Var2, 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var4;
                    i16 = i17;
                    f11 = fN;
                    j13 = j15;
                    j12 = j14;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var3 = a0Var2;
                    j12 = jM;
                    j13 = jQ;
                    i16 = iP;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.rr
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return os.r0(a0Var3, j12, j13, i16, f11, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 24576;
            f11 = f10;
            if ((i13 & 9363) != 9362) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i13 & 1)) {
                c0VarR.l0();
                if ((i11 & 1) != 0) {
                    if (i18 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if ((i12 & 2) != 0) {
                        jM = ir.f29311a.m(c0VarR, 6);
                        i13 &= -113;
                    }
                    if ((i12 & 4) != 0) {
                        jQ = ir.f29311a.q(c0VarR, 6);
                        i13 &= -897;
                    }
                    if (i19 != 0) {
                        iP = ir.f29311a.p();
                    }
                    if (i14 != 0) {
                        fN = ir.f29311a.n();
                    } else {
                        fN = f11;
                    }
                } else {
                    if (i18 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if ((i12 & 2) != 0) {
                        jM = ir.f29311a.m(c0VarR, 6);
                        i13 &= -113;
                    }
                    if ((i12 & 4) != 0) {
                        jQ = ir.f29311a.q(c0VarR, 6);
                        i13 &= -897;
                    }
                    if (i19 != 0) {
                        iP = ir.f29311a.p();
                    }
                    if (i14 != 0) {
                        fN = ir.f29311a.n();
                    } else {
                        fN = f11;
                    }
                }
                i17 = iP;
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(567589233, i13, -1, "androidx.compose.material3.LinearProgressIndicator (ProgressIndicator.kt:254)");
                }
                androidx.compose.animation.core.i1 i1VarJ3 = androidx.compose.animation.core.n1.j(null, c0VarR, 0, 1);
                androidx.compose.animation.core.g1<Float> g1VarI2 = I0();
                int i24 = androidx.compose.animation.core.i1.f13005f;
                int i25 = androidx.compose.animation.core.g1.f12967d;
                n7VarD = androidx.compose.animation.core.n1.d(i1VarJ3, 0.0f, 1.0f, g1VarI2, null, c0VarR, i24 | 432 | (i25 << 9), 8);
                n7VarD2 = androidx.compose.animation.core.n1.d(i1VarJ3, 0.0f, 1.0f, J0(), null, c0VarR, i24 | 432 | (i25 << 9), 8);
                n7VarD3 = androidx.compose.animation.core.n1.d(i1VarJ3, 0.0f, 1.0f, L0(), null, c0VarR, i24 | 432 | (i25 << 9), 8);
                n7VarD4 = androidx.compose.animation.core.n1.d(i1VarJ3, 0.0f, 1.0f, M0(), null, c0VarR, i24 | 432 | (i25 << 9), 8);
                c0Var2 = c0VarR;
                androidx.compose.ui.a0 a0VarY3 = androidx.compose.foundation.layout.i6.y(androidx.compose.foundation.m4.c(a0Var4.B2(androidx.compose.material3.internal.o.p())), f31444a, f31445b);
                if ((i13 & 7168) == 2048) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if ((57344 & i13) == 16384) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                zD = z12 | z11 | c0Var2.D(n7VarD) | ((((i13 & 896) ^ androidx.media3.exoplayer.a5.S0) <= 256 && c0Var2.L(jQ)) || (i13 & androidx.media3.exoplayer.a5.S0) == 256) | c0Var2.D(n7VarD2) | ((((i13 & com.planner5d.library.engine.input.f.b.B) ^ 48) <= 32 && c0Var2.L(jM)) || (i13 & 48) == 32) | c0Var2.D(n7VarD3) | c0Var2.D(n7VarD4);
                objI0 = c0Var2.i0();
                if (zD) {
                    j14 = jM;
                    j15 = jQ;
                    objI0 = new Function1() { // from class: androidx.compose.material3.qr
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return os.q0(i17, fN, n7VarD, j15, n7VarD2, j14, n7VarD3, n7VarD4, (androidx.compose.ui.graphics.drawscope.f) obj);
                        }
                    };
                    c0Var2.Y(objI0);
                } else {
                    j14 = jM;
                    j15 = jQ;
                    objI0 = new Function1() { // from class: androidx.compose.material3.qr
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return os.q0(i17, fN, n7VarD, j15, n7VarD2, j14, n7VarD3, n7VarD4, (androidx.compose.ui.graphics.drawscope.f) obj);
                        }
                    };
                    c0Var2.Y(objI0);
                }
                androidx.compose.foundation.f1.e(a0VarY3, (Function1) objI0, c0Var2, 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var4;
                i16 = i17;
                f11 = fN;
                j13 = j15;
                j12 = j14;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var3 = a0Var2;
                j12 = jM;
                j13 = jQ;
                i16 = iP;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.rr
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return os.r0(a0Var3, j12, j13, i16, f11, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= 3072;
        iP = i10;
        i14 = i12 & 16;
        if (i14 != 0) {
            if ((i11 & 24576) == 0) {
                f11 = f10;
                if (c0VarR.I(f11)) {
                    i15 = 16384;
                } else {
                    i15 = 8192;
                }
                i13 |= i15;
            }
            if ((i13 & 9363) != 9362) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i13 & 1)) {
                c0VarR.l0();
                if ((i11 & 1) != 0) {
                    if (i18 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if ((i12 & 2) != 0) {
                        jM = ir.f29311a.m(c0VarR, 6);
                        i13 &= -113;
                    }
                    if ((i12 & 4) != 0) {
                        jQ = ir.f29311a.q(c0VarR, 6);
                        i13 &= -897;
                    }
                    if (i19 != 0) {
                        iP = ir.f29311a.p();
                    }
                    if (i14 != 0) {
                        fN = ir.f29311a.n();
                    } else {
                        fN = f11;
                    }
                } else {
                    if (i18 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if ((i12 & 2) != 0) {
                        jM = ir.f29311a.m(c0VarR, 6);
                        i13 &= -113;
                    }
                    if ((i12 & 4) != 0) {
                        jQ = ir.f29311a.q(c0VarR, 6);
                        i13 &= -897;
                    }
                    if (i19 != 0) {
                        iP = ir.f29311a.p();
                    }
                    if (i14 != 0) {
                        fN = ir.f29311a.n();
                    } else {
                        fN = f11;
                    }
                }
                i17 = iP;
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(567589233, i13, -1, "androidx.compose.material3.LinearProgressIndicator (ProgressIndicator.kt:254)");
                }
                androidx.compose.animation.core.i1 i1VarJ4 = androidx.compose.animation.core.n1.j(null, c0VarR, 0, 1);
                androidx.compose.animation.core.g1<Float> g1VarI3 = I0();
                int i26 = androidx.compose.animation.core.i1.f13005f;
                int i27 = androidx.compose.animation.core.g1.f12967d;
                n7VarD = androidx.compose.animation.core.n1.d(i1VarJ4, 0.0f, 1.0f, g1VarI3, null, c0VarR, i26 | 432 | (i27 << 9), 8);
                n7VarD2 = androidx.compose.animation.core.n1.d(i1VarJ4, 0.0f, 1.0f, J0(), null, c0VarR, i26 | 432 | (i27 << 9), 8);
                n7VarD3 = androidx.compose.animation.core.n1.d(i1VarJ4, 0.0f, 1.0f, L0(), null, c0VarR, i26 | 432 | (i27 << 9), 8);
                n7VarD4 = androidx.compose.animation.core.n1.d(i1VarJ4, 0.0f, 1.0f, M0(), null, c0VarR, i26 | 432 | (i27 << 9), 8);
                c0Var2 = c0VarR;
                androidx.compose.ui.a0 a0VarY4 = androidx.compose.foundation.layout.i6.y(androidx.compose.foundation.m4.c(a0Var4.B2(androidx.compose.material3.internal.o.p())), f31444a, f31445b);
                if ((i13 & 7168) == 2048) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if ((57344 & i13) == 16384) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                zD = z12 | z11 | c0Var2.D(n7VarD) | ((((i13 & 896) ^ androidx.media3.exoplayer.a5.S0) <= 256 && c0Var2.L(jQ)) || (i13 & androidx.media3.exoplayer.a5.S0) == 256) | c0Var2.D(n7VarD2) | ((((i13 & com.planner5d.library.engine.input.f.b.B) ^ 48) <= 32 && c0Var2.L(jM)) || (i13 & 48) == 32) | c0Var2.D(n7VarD3) | c0Var2.D(n7VarD4);
                objI0 = c0Var2.i0();
                if (zD) {
                    j14 = jM;
                    j15 = jQ;
                    objI0 = new Function1() { // from class: androidx.compose.material3.qr
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return os.q0(i17, fN, n7VarD, j15, n7VarD2, j14, n7VarD3, n7VarD4, (androidx.compose.ui.graphics.drawscope.f) obj);
                        }
                    };
                    c0Var2.Y(objI0);
                } else {
                    j14 = jM;
                    j15 = jQ;
                    objI0 = new Function1() { // from class: androidx.compose.material3.qr
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return os.q0(i17, fN, n7VarD, j15, n7VarD2, j14, n7VarD3, n7VarD4, (androidx.compose.ui.graphics.drawscope.f) obj);
                        }
                    };
                    c0Var2.Y(objI0);
                }
                androidx.compose.foundation.f1.e(a0VarY4, (Function1) objI0, c0Var2, 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var4;
                i16 = i17;
                f11 = fN;
                j13 = j15;
                j12 = j14;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var3 = a0Var2;
                j12 = jM;
                j13 = jQ;
                i16 = iP;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.rr
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return os.r0(a0Var3, j12, j13, i16, f11, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= 24576;
        f11 = f10;
        if ((i13 & 9363) != 9362) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c0VarR.h(z10, i13 & 1)) {
            c0VarR.l0();
            if ((i11 & 1) != 0) {
                if (i18 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if ((i12 & 2) != 0) {
                    jM = ir.f29311a.m(c0VarR, 6);
                    i13 &= -113;
                }
                if ((i12 & 4) != 0) {
                    jQ = ir.f29311a.q(c0VarR, 6);
                    i13 &= -897;
                }
                if (i19 != 0) {
                    iP = ir.f29311a.p();
                }
                if (i14 != 0) {
                    fN = ir.f29311a.n();
                } else {
                    fN = f11;
                }
            } else {
                if (i18 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if ((i12 & 2) != 0) {
                    jM = ir.f29311a.m(c0VarR, 6);
                    i13 &= -113;
                }
                if ((i12 & 4) != 0) {
                    jQ = ir.f29311a.q(c0VarR, 6);
                    i13 &= -897;
                }
                if (i19 != 0) {
                    iP = ir.f29311a.p();
                }
                if (i14 != 0) {
                    fN = ir.f29311a.n();
                } else {
                    fN = f11;
                }
            }
            i17 = iP;
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(567589233, i13, -1, "androidx.compose.material3.LinearProgressIndicator (ProgressIndicator.kt:254)");
            }
            androidx.compose.animation.core.i1 i1VarJ5 = androidx.compose.animation.core.n1.j(null, c0VarR, 0, 1);
            androidx.compose.animation.core.g1<Float> g1VarI4 = I0();
            int i28 = androidx.compose.animation.core.i1.f13005f;
            int i29 = androidx.compose.animation.core.g1.f12967d;
            n7VarD = androidx.compose.animation.core.n1.d(i1VarJ5, 0.0f, 1.0f, g1VarI4, null, c0VarR, i28 | 432 | (i29 << 9), 8);
            n7VarD2 = androidx.compose.animation.core.n1.d(i1VarJ5, 0.0f, 1.0f, J0(), null, c0VarR, i28 | 432 | (i29 << 9), 8);
            n7VarD3 = androidx.compose.animation.core.n1.d(i1VarJ5, 0.0f, 1.0f, L0(), null, c0VarR, i28 | 432 | (i29 << 9), 8);
            n7VarD4 = androidx.compose.animation.core.n1.d(i1VarJ5, 0.0f, 1.0f, M0(), null, c0VarR, i28 | 432 | (i29 << 9), 8);
            c0Var2 = c0VarR;
            androidx.compose.ui.a0 a0VarY5 = androidx.compose.foundation.layout.i6.y(androidx.compose.foundation.m4.c(a0Var4.B2(androidx.compose.material3.internal.o.p())), f31444a, f31445b);
            if ((i13 & 7168) == 2048) {
                z11 = true;
            } else {
                z11 = false;
            }
            if ((57344 & i13) == 16384) {
                z12 = true;
            } else {
                z12 = false;
            }
            zD = z12 | z11 | c0Var2.D(n7VarD) | ((((i13 & 896) ^ androidx.media3.exoplayer.a5.S0) <= 256 && c0Var2.L(jQ)) || (i13 & androidx.media3.exoplayer.a5.S0) == 256) | c0Var2.D(n7VarD2) | ((((i13 & com.planner5d.library.engine.input.f.b.B) ^ 48) <= 32 && c0Var2.L(jM)) || (i13 & 48) == 32) | c0Var2.D(n7VarD3) | c0Var2.D(n7VarD4);
            objI0 = c0Var2.i0();
            if (zD) {
                j14 = jM;
                j15 = jQ;
                objI0 = new Function1() { // from class: androidx.compose.material3.qr
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return os.q0(i17, fN, n7VarD, j15, n7VarD2, j14, n7VarD3, n7VarD4, (androidx.compose.ui.graphics.drawscope.f) obj);
                    }
                };
                c0Var2.Y(objI0);
            } else {
                j14 = jM;
                j15 = jQ;
                objI0 = new Function1() { // from class: androidx.compose.material3.qr
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return os.q0(i17, fN, n7VarD, j15, n7VarD2, j14, n7VarD3, n7VarD4, (androidx.compose.ui.graphics.drawscope.f) obj);
                    }
                };
                c0Var2.Y(objI0);
            }
            androidx.compose.foundation.f1.e(a0VarY5, (Function1) objI0, c0Var2, 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            a0Var3 = a0Var4;
            i16 = i17;
            f11 = fN;
            j13 = j15;
            j12 = j14;
        } else {
            c0Var2 = c0VarR;
            c0Var2.u();
            a0Var3 = a0Var2;
            j12 = jM;
            j13 = jQ;
            i16 = iP;
        }
        s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.rr
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return os.r0(a0Var3, j12, j13, i16, f11, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f0(androidx.compose.ui.a0 a0Var, long j10, long j11, int i10, int i11, int i12, androidx.compose.runtime.c0 c0Var, int i13) {
        Y(a0Var, j10, j11, i10, c0Var, androidx.compose.runtime.t4.a(i11 | 1), i12);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g0(Function0 function0, androidx.compose.ui.a0 a0Var, long j10, long j11, int i10, float f10, Function1 function1, int i11, int i12, androidx.compose.runtime.c0 c0Var, int i13) {
        Z(function0, a0Var, j10, j11, i10, f10, function1, c0Var, androidx.compose.runtime.t4.a(i11 | 1), i12);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h0(long j10, int i10, androidx.compose.ui.graphics.drawscope.f fVar) {
        ir irVar = ir.f29311a;
        irVar.a(fVar, irVar.r(), j10, i10);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float i0(Function0 function0) {
        float fFloatValue = ((Number) function0.invoke()).floatValue();
        if (fFloatValue < 0.0f) {
            fFloatValue = 0.0f;
        }
        if (fFloatValue > 1.0f) {
            return 1.0f;
        }
        return fFloatValue;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j0(Function0 function0, androidx.compose.ui.semantics.e0 e0Var) {
        Object objInvoke = function0.invoke();
        if (Float.isNaN(((Number) objInvoke).floatValue())) {
            objInvoke = null;
        }
        Float f10 = (Float) objInvoke;
        androidx.compose.ui.semantics.b0.J1(e0Var, new androidx.compose.ui.semantics.i(f10 != null ? f10.floatValue() : 0.0f, kotlin.ranges.r.e(0.0f, 1.0f), 0, 4, null));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k0(int i10, float f10, Function0 function0, long j10, long j11, Function1 function1, androidx.compose.ui.graphics.drawscope.f fVar) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (fVar.d() & com.rabbitmq.client.k0.f265952a));
        if (!androidx.compose.ui.graphics.u3.g(i10, androidx.compose.ui.graphics.u3.f38256b.a()) && Float.intBitsToFloat((int) (com.rabbitmq.client.k0.f265952a & fVar.d())) <= Float.intBitsToFloat((int) (fVar.d() >> 32))) {
            f10 = androidx.compose.ui.unit.h.r(f10 + fVar.F3(fIntBitsToFloat));
        }
        float fF3 = f10 / fVar.F3(Float.intBitsToFloat((int) (fVar.d() >> 32)));
        float fFloatValue = ((Number) function0.invoke()).floatValue();
        float fMin = fFloatValue + Math.min(fFloatValue, fF3);
        if (fMin <= 1.0f) {
            C0(fVar, fMin, 1.0f, j10, fIntBitsToFloat, i10);
        }
        C0(fVar, 0.0f, fFloatValue, j11, fIntBitsToFloat, i10);
        function1.invoke(fVar);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l0(androidx.compose.ui.a0 a0Var, long j10, long j11, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        a0(a0Var, j10, j11, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m0(Function0 function0, androidx.compose.ui.a0 a0Var, long j10, long j11, int i10, int i11, int i12, androidx.compose.runtime.c0 c0Var, int i13) {
        c0(function0, a0Var, j10, j11, i10, c0Var, androidx.compose.runtime.t4.a(i11 | 1), i12);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float n0(float f10) {
        return f10;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit o0(float f10, androidx.compose.ui.a0 a0Var, long j10, long j11, int i10, int i11, int i12, androidx.compose.runtime.c0 c0Var, int i13) {
        b0(f10, a0Var, j10, j11, i10, c0Var, androidx.compose.runtime.t4.a(i11 | 1), i12);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p0(float f10, androidx.compose.ui.a0 a0Var, long j10, long j11, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        d0(f10, a0Var, j10, j11, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q0(int i10, float f10, androidx.compose.runtime.n7 n7Var, long j10, androidx.compose.runtime.n7 n7Var2, long j11, androidx.compose.runtime.n7 n7Var3, androidx.compose.runtime.n7 n7Var4, androidx.compose.ui.graphics.drawscope.f fVar) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (fVar.d() & com.rabbitmq.client.k0.f265952a));
        if (!androidx.compose.ui.graphics.u3.g(i10, androidx.compose.ui.graphics.u3.f38256b.a()) && Float.intBitsToFloat((int) (com.rabbitmq.client.k0.f265952a & fVar.d())) <= Float.intBitsToFloat((int) (fVar.d() >> 32))) {
            f10 = androidx.compose.ui.unit.h.r(f10 + fVar.F3(fIntBitsToFloat));
        }
        float fF3 = f10 / fVar.F3(Float.intBitsToFloat((int) (fVar.d() >> 32)));
        if (((Number) n7Var.getValue()).floatValue() < 1.0f - fF3) {
            C0(fVar, ((Number) n7Var.getValue()).floatValue() > 0.0f ? ((Number) n7Var.getValue()).floatValue() + fF3 : 0.0f, 1.0f, j10, fIntBitsToFloat, i10);
        }
        if (((Number) n7Var.getValue()).floatValue() - ((Number) n7Var2.getValue()).floatValue() > 0.0f) {
            C0(fVar, ((Number) n7Var.getValue()).floatValue(), ((Number) n7Var2.getValue()).floatValue(), j11, fIntBitsToFloat, i10);
        }
        if (((Number) n7Var2.getValue()).floatValue() > fF3) {
            C0(fVar, ((Number) n7Var3.getValue()).floatValue() > 0.0f ? ((Number) n7Var3.getValue()).floatValue() + fF3 : 0.0f, ((Number) n7Var2.getValue()).floatValue() < 1.0f ? ((Number) n7Var2.getValue()).floatValue() - fF3 : 1.0f, j10, fIntBitsToFloat, i10);
        }
        if (((Number) n7Var3.getValue()).floatValue() - ((Number) n7Var4.getValue()).floatValue() > 0.0f) {
            C0(fVar, ((Number) n7Var3.getValue()).floatValue(), ((Number) n7Var4.getValue()).floatValue(), j11, fIntBitsToFloat, i10);
        }
        if (((Number) n7Var4.getValue()).floatValue() > fF3) {
            C0(fVar, 0.0f, ((Number) n7Var4.getValue()).floatValue() < 1.0f ? ((Number) n7Var4.getValue()).floatValue() - fF3 : 1.0f, j10, fIntBitsToFloat, i10);
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r0(androidx.compose.ui.a0 a0Var, long j10, long j11, int i10, float f10, int i11, int i12, androidx.compose.runtime.c0 c0Var, int i13) {
        e0(a0Var, j10, j11, i10, f10, c0Var, androidx.compose.runtime.t4.a(i11 | 1), i12);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit s0(androidx.compose.animation.core.q1.b bVar) {
        bVar.h(6000);
        bVar.i(bVar.a(Float.valueOf(0.87f), 3000), f31458o);
        bVar.a(Float.valueOf(0.1f), 6000);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t0(androidx.compose.animation.core.q1.b bVar) {
        bVar.h(6000);
        Float fValueOf = Float.valueOf(90.0f);
        bVar.i(bVar.a(fValueOf, 300), d0.i1.f268232a.c());
        bVar.a(fValueOf, 1500);
        Float fValueOf2 = Float.valueOf(180.0f);
        bVar.a(fValueOf2, 1800);
        bVar.a(fValueOf2, 3000);
        Float fValueOf3 = Float.valueOf(270.0f);
        bVar.a(fValueOf3, 3300);
        bVar.a(fValueOf3, 4500);
        Float fValueOf4 = Float.valueOf(360.0f);
        bVar.a(fValueOf4, 4800);
        bVar.a(fValueOf4, 6000);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit u0(androidx.compose.animation.core.q1.b bVar) {
        bVar.h(f31448e);
        bVar.i(bVar.a(Float.valueOf(0.0f), 0), f31457n);
        bVar.a(Float.valueOf(1.0f), 1000);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit v0(androidx.compose.animation.core.q1.b bVar) {
        bVar.h(f31448e);
        bVar.i(bVar.a(Float.valueOf(0.0f), 250), f31457n);
        bVar.a(Float.valueOf(1.0f), 1250);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit w0(androidx.compose.animation.core.q1.b bVar) {
        bVar.h(f31448e);
        bVar.i(bVar.a(Float.valueOf(0.0f), f31455l), f31457n);
        bVar.a(Float.valueOf(1.0f), 1500);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit x0(androidx.compose.animation.core.q1.b bVar) {
        bVar.h(f31448e);
        bVar.i(bVar.a(Float.valueOf(0.0f), 900), f31457n);
        bVar.a(Float.valueOf(1.0f), f31448e);
        return Unit.f312394a;
    }

    private static final void y0(androidx.compose.ui.graphics.drawscope.f fVar, float f10, float f11, long j10, androidx.compose.ui.graphics.drawscope.n nVar) {
        float f12 = 2;
        float fG = nVar.g() / f12;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (fVar.d() >> 32)) - (f12 * fG);
        androidx.compose.ui.graphics.drawscope.f.a2(fVar, j10, f10, f11, false, n0.g.g((((long) Float.floatToRawIntBits(fG)) & com.rabbitmq.client.k0.f265952a) | (Float.floatToRawIntBits(fG) << 32)), n0.n.f((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & com.rabbitmq.client.k0.f265952a)), 0.0f, nVar, null, 0, 832, null);
    }

    private static final void z0(androidx.compose.ui.graphics.drawscope.f fVar, long j10, androidx.compose.ui.graphics.drawscope.n nVar) {
        y0(fVar, 0.0f, 360.0f, j10, nVar);
    }
}

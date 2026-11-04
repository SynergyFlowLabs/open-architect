package androidx.compose.material3;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nIconButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IconButton.kt\nandroidx/compose/material3/IconButtonKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,935:1\n1282#2,6:936\n1282#2,6:982\n1282#2,6:1028\n1282#2,6:1034\n1282#2,6:1040\n1282#2,6:1046\n1282#2,6:1052\n70#3:942\n68#3,8:943\n77#3:981\n70#3:988\n68#3,8:989\n77#3:1027\n79#4,6:951\n86#4,3:966\n89#4,2:975\n93#4:980\n79#4,6:997\n86#4,3:1012\n89#4,2:1021\n93#4:1026\n347#5,9:957\n356#5,3:977\n347#5,9:1003\n356#5,3:1023\n4206#6,6:969\n4206#6,6:1015\n*S KotlinDebug\n*F\n+ 1 IconButton.kt\nandroidx/compose/material3/IconButtonKt\n*L\n174#1:936,6\n323#1:982,6\n442#1:1028,6\n558#1:1034,6\n678#1:1040,6\n701#1:1046,6\n733#1:1052,6\n175#1:942\n175#1:943,8\n175#1:981\n324#1:988\n324#1:989,8\n324#1:1027\n175#1:951,6\n175#1:966,3\n175#1:975,2\n175#1:980\n324#1:997,6\n324#1:1012,3\n324#1:1021,2\n324#1:1026\n175#1:957,9\n175#1:977,3\n324#1:1003,9\n324#1:1023,3\n175#1:969,6\n324#1:1015,6\n*E\n"})
public final class ei {

    @SourceDebugExtension({"SMAP\nIconButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IconButton.kt\nandroidx/compose/material3/IconButtonKt$SurfaceIconButton$2\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,935:1\n70#2:936\n68#2,8:937\n77#2:975\n79#3,6:945\n86#3,3:960\n89#3,2:969\n93#3:974\n347#4,9:951\n356#4,3:971\n4206#5,6:963\n*S KotlinDebug\n*F\n+ 1 IconButton.kt\nandroidx/compose/material3/IconButtonKt$SurfaceIconButton$2\n*L\n709#1:936\n709#1:937,8\n709#1:975\n709#1:945,6\n709#1:960,3\n709#1:969,2\n709#1:974\n709#1:951,9\n709#1:971,3\n709#1:963,6\n*E\n"})
    static final class a implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f27358a;

        /* JADX WARN: Multi-variable type inference failed */
        a(Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2) {
            this.f27358a = function2;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(669231714, i10, -1, "androidx.compose.material3.SurfaceIconButton.<anonymous> (IconButton.kt:708)");
            }
            androidx.compose.ui.a0 a0VarX = androidx.compose.foundation.layout.i6.x(androidx.compose.ui.a0.E, kh.S(kh.f30051a, 0, 1, null));
            androidx.compose.ui.e eVarI = androidx.compose.ui.e.f37317a.i();
            Function2<androidx.compose.runtime.c0, Integer, Unit> function2 = this.f27358a;
            androidx.compose.ui.layout.a1 a1VarK = androidx.compose.foundation.layout.x.k(eVarI, false);
            int iJ = androidx.compose.runtime.v.j(c0Var, 0);
            androidx.compose.runtime.b1 b1VarK = c0Var.k();
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0Var, a0VarX);
            androidx.compose.ui.node.g.a aVar = androidx.compose.ui.node.g.I;
            Function0<androidx.compose.ui.node.g> function0A = aVar.a();
            if (c0Var.S() == null) {
                androidx.compose.runtime.v.r();
            }
            c0Var.q();
            if (c0Var.P()) {
                c0Var.q0(function0A);
            } else {
                c0Var.l();
            }
            androidx.compose.runtime.c0 c0VarD = androidx.compose.runtime.y7.d(c0Var);
            androidx.compose.runtime.y7.n(c0VarD, a1VarK, aVar.e());
            androidx.compose.runtime.y7.n(c0VarD, b1VarK, aVar.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iJ))) {
                c0VarD.Y(Integer.valueOf(iJ));
                c0VarD.f(Integer.valueOf(iJ), function2B);
            }
            androidx.compose.runtime.y7.n(c0VarD, a0VarN, aVar.f());
            androidx.compose.foundation.layout.d0 d0Var = androidx.compose.foundation.layout.d0.f15956a;
            function2.invoke(c0Var, 0);
            c0Var.o();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var, Integer num) {
            c(c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    @SourceDebugExtension({"SMAP\nIconButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IconButton.kt\nandroidx/compose/material3/IconButtonKt$SurfaceIconToggleButton$2\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,935:1\n70#2:936\n68#2,8:937\n77#2:975\n79#3,6:945\n86#3,3:960\n89#3,2:969\n93#3:974\n347#4,9:951\n356#4,3:971\n4206#5,6:963\n*S KotlinDebug\n*F\n+ 1 IconButton.kt\nandroidx/compose/material3/IconButtonKt$SurfaceIconToggleButton$2\n*L\n741#1:936\n741#1:937,8\n741#1:975\n741#1:945,6\n741#1:960,3\n741#1:969,2\n741#1:974\n741#1:951,9\n741#1:971,3\n741#1:963,6\n*E\n"})
    static final class b implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f27359a;

        /* JADX WARN: Multi-variable type inference failed */
        b(Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2) {
            this.f27359a = function2;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1492028158, i10, -1, "androidx.compose.material3.SurfaceIconToggleButton.<anonymous> (IconButton.kt:740)");
            }
            androidx.compose.ui.a0 a0VarX = androidx.compose.foundation.layout.i6.x(androidx.compose.ui.a0.E, kh.S(kh.f30051a, 0, 1, null));
            androidx.compose.ui.e eVarI = androidx.compose.ui.e.f37317a.i();
            Function2<androidx.compose.runtime.c0, Integer, Unit> function2 = this.f27359a;
            androidx.compose.ui.layout.a1 a1VarK = androidx.compose.foundation.layout.x.k(eVarI, false);
            int iJ = androidx.compose.runtime.v.j(c0Var, 0);
            androidx.compose.runtime.b1 b1VarK = c0Var.k();
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0Var, a0VarX);
            androidx.compose.ui.node.g.a aVar = androidx.compose.ui.node.g.I;
            Function0<androidx.compose.ui.node.g> function0A = aVar.a();
            if (c0Var.S() == null) {
                androidx.compose.runtime.v.r();
            }
            c0Var.q();
            if (c0Var.P()) {
                c0Var.q0(function0A);
            } else {
                c0Var.l();
            }
            androidx.compose.runtime.c0 c0VarD = androidx.compose.runtime.y7.d(c0Var);
            androidx.compose.runtime.y7.n(c0VarD, a1VarK, aVar.e());
            androidx.compose.runtime.y7.n(c0VarD, b1VarK, aVar.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iJ))) {
                c0VarD.Y(Integer.valueOf(iJ));
                c0VarD.f(Integer.valueOf(iJ), function2B);
            }
            androidx.compose.runtime.y7.n(c0VarD, a0VarN, aVar.f());
            androidx.compose.foundation.layout.d0 d0Var = androidx.compose.foundation.layout.d0.f15956a;
            function2.invoke(c0Var, 0);
            c0Var.o();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        }

        @Override // kotlin.jvm.functions.Function2
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.runtime.c0 c0Var, Integer num) {
            c(c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    /* JADX WARN: Code duplicated, block: B:108:0x013b A[PHI: r0 r5 r6 r7 r8
      0x013b: PHI (r0v11 androidx.compose.ui.a0) = (r0v8 androidx.compose.ui.a0), (r0v17 androidx.compose.ui.a0) binds: [B:121:0x016c, B:107:0x0139] A[DONT_GENERATE, DONT_INLINE]
      0x013b: PHI (r5v13 int) = (r5v9 int), (r5v15 int) binds: [B:121:0x016c, B:107:0x0139] A[DONT_GENERATE, DONT_INLINE]
      0x013b: PHI (r6v13 boolean) = (r6v6 boolean), (r6v2 boolean) binds: [B:121:0x016c, B:107:0x0139] A[DONT_GENERATE, DONT_INLINE]
      0x013b: PHI (r7v14 androidx.compose.ui.graphics.q3) = (r7v9 androidx.compose.ui.graphics.q3), (r7v6 androidx.compose.ui.graphics.q3) binds: [B:121:0x016c, B:107:0x0139] A[DONT_GENERATE, DONT_INLINE]
      0x013b: PHI (r8v9 androidx.compose.material3.oi) = (r8v6 androidx.compose.material3.oi), (r8v4 androidx.compose.material3.oi) binds: [B:121:0x016c, B:107:0x0139] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:109:0x0142 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:110:0x0144  */
    /* JADX WARN: Code duplicated, block: B:111:0x0147  */
    /* JADX WARN: Code duplicated, block: B:113:0x014a  */
    /* JADX WARN: Code duplicated, block: B:116:0x0150  */
    /* JADX WARN: Code duplicated, block: B:119:0x015f  */
    /* JADX WARN: Code duplicated, block: B:120:0x016a  */
    /* JADX WARN: Code duplicated, block: B:122:0x016e  */
    /* JADX WARN: Code duplicated, block: B:125:0x017f  */
    /* JADX WARN: Code duplicated, block: B:128:0x0194  */
    /* JADX WARN: Code duplicated, block: B:131:0x01d0  */
    /* JADX WARN: Code duplicated, block: B:133:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:136:0x01ed  */
    /* JADX WARN: Code duplicated, block: B:138:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0065  */
    /* JADX WARN: Code duplicated, block: B:38:0x006a  */
    /* JADX WARN: Code duplicated, block: B:40:0x006e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0076  */
    /* JADX WARN: Code duplicated, block: B:43:0x0079  */
    /* JADX WARN: Code duplicated, block: B:47:0x0080  */
    /* JADX WARN: Code duplicated, block: B:49:0x0084  */
    /* JADX WARN: Code duplicated, block: B:51:0x008e  */
    /* JADX WARN: Code duplicated, block: B:52:0x0091  */
    /* JADX WARN: Code duplicated, block: B:55:0x0097  */
    /* JADX WARN: Code duplicated, block: B:58:0x009e  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:62:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:75:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:80:0x00de  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:91:0x0107  */
    /* JADX WARN: Code duplicated, block: B:92:0x0109  */
    /* JADX WARN: Code duplicated, block: B:95:0x0112  */
    /* JADX WARN: Code duplicated, block: B:97:0x0120  */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void A(final boolean z10, @NotNull final Function1<? super Boolean, Unit> function1, @Nullable androidx.compose.ui.a0 a0Var, boolean z11, @Nullable androidx.compose.ui.graphics.q3 q3Var, @Nullable oi oiVar, @Nullable androidx.compose.foundation.interaction.j jVar, @NotNull final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        boolean z12;
        int i12;
        Function1<? super Boolean, Unit> function3;
        androidx.compose.ui.a0 a0Var2;
        int i13;
        boolean z13;
        int i14;
        androidx.compose.ui.graphics.q3 q3VarU;
        oi oiVarO;
        int i15;
        androidx.compose.foundation.interaction.j jVar2;
        int i16;
        int i17;
        int i18;
        boolean z14;
        androidx.compose.runtime.c0 c0Var2;
        final androidx.compose.ui.a0 a0Var3;
        final boolean z15;
        final androidx.compose.ui.graphics.q3 q3Var2;
        final oi oiVar2;
        final androidx.compose.foundation.interaction.j jVar3;
        androidx.compose.runtime.s5 s5VarT;
        androidx.compose.ui.a0 a0Var4;
        int i19;
        androidx.compose.foundation.interaction.j jVar4;
        boolean z16;
        androidx.compose.ui.graphics.q3 q3Var3;
        oi oiVar3;
        Object objI0;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-436409269);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
            z12 = z10;
        } else {
            z12 = z10;
            if ((i10 & 6) == 0) {
                i12 = (c0VarR.G(z12) ? 4 : 2) | i10;
            } else {
                i12 = i10;
            }
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
            function3 = function1;
        } else {
            function3 = function1;
            if ((i10 & 48) == 0) {
                i12 |= c0VarR.k0(function3) ? 32 : 16;
            }
        }
        int i20 = i11 & 4;
        if (i20 == 0) {
            if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                a0Var2 = a0Var;
                i12 |= c0VarR.D(a0Var2) ? 256 : 128;
            }
            i13 = i11 & 8;
            if (i13 != 0) {
                if ((i10 & 3072) == 0) {
                    z13 = z11;
                    if (c0VarR.G(z13)) {
                        i14 = 2048;
                    } else {
                        i14 = 1024;
                    }
                    i12 |= i14;
                }
                if ((i10 & 24576) == 0) {
                    if ((i11 & 16) == 0) {
                        q3VarU = q3Var;
                        int i21 = c0VarR.D(q3VarU) ? 16384 : 8192;
                        i12 |= i21;
                    } else {
                        q3VarU = q3Var;
                    }
                    i12 |= i21;
                } else {
                    q3VarU = q3Var;
                }
                if ((196608 & i10) == 0) {
                    if ((i11 & 32) == 0) {
                        oiVarO = oiVar;
                        int i22 = c0VarR.D(oiVarO) ? 131072 : 65536;
                        i12 |= i22;
                    } else {
                        oiVarO = oiVar;
                    }
                    i12 |= i22;
                } else {
                    oiVarO = oiVar;
                }
                i15 = i11 & 64;
                if (i15 != 0) {
                    if ((i10 & 1572864) == 0) {
                        jVar2 = jVar;
                        if (c0VarR.D(jVar2)) {
                            i16 = 1048576;
                        } else {
                            i16 = 524288;
                        }
                        i12 |= i16;
                    }
                    if ((i11 & 128) != 0) {
                        if ((i10 & 12582912) == 0) {
                            if (c0VarR.k0(function2)) {
                                i17 = 8388608;
                            } else {
                                i17 = 4194304;
                            }
                            i12 |= i17;
                        }
                        i18 = i12;
                        if ((i12 & 4793491) != 4793490) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (c0VarR.h(z14, i18 & 1)) {
                            c0VarR.l0();
                            if ((i10 & 1) != 0 || c0VarR.y()) {
                                if (i20 != 0) {
                                    a0Var4 = androidx.compose.ui.a0.E;
                                } else {
                                    a0Var4 = a0Var2;
                                }
                                if (i13 != 0) {
                                    z13 = true;
                                }
                                if ((i11 & 16) != 0) {
                                    i18 &= -57345;
                                    q3VarU = kh.f30051a.u(c0VarR, 6);
                                }
                                if ((i11 & 32) != 0) {
                                    i19 = i18 & (-458753);
                                    oiVarO = kh.f30051a.o(c0VarR, 6);
                                } else {
                                    i19 = i18;
                                }
                                if (i15 != 0) {
                                    jVar4 = null;
                                    z16 = z13;
                                    q3Var3 = q3VarU;
                                    oiVar3 = oiVarO;
                                }
                                c0VarR.Z();
                                if (androidx.compose.runtime.m0.l0()) {
                                    androidx.compose.runtime.m0.A0(-436409269, i19, -1, "androidx.compose.material3.FilledTonalIconToggleButton (IconButton.kt:554)");
                                }
                                objI0 = c0VarR.i0();
                                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI0 = new Function1() { // from class: androidx.compose.material3.vh
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return ei.B((androidx.compose.ui.semantics.e0) obj);
                                        }
                                    };
                                    c0VarR.Y(objI0);
                                }
                                int i23 = i19 << 3;
                                c0Var2 = c0VarR;
                                X(z12, function3, androidx.compose.ui.semantics.t.f(a0Var4, false, (Function1) objI0, 1, null), z16, q3Var3, oiVar3, null, jVar4, function2, c0Var2, (i19 & 14) | 1572864 | (i19 & com.planner5d.library.engine.input.f.b.B) | (i19 & 7168) | (57344 & i19) | (458752 & i19) | (29360128 & i23) | (i23 & 234881024));
                                if (androidx.compose.runtime.m0.l0()) {
                                    androidx.compose.runtime.m0.z0();
                                }
                                a0Var3 = a0Var4;
                                z15 = z16;
                                q3Var2 = q3Var3;
                                oiVar2 = oiVar3;
                                jVar3 = jVar4;
                            } else {
                                c0VarR.u();
                                int i24 = (i11 & 16) != 0 ? i18 & (-57345) : i18;
                                if ((i11 & 32) != 0) {
                                    i24 &= -458753;
                                }
                                i19 = i24;
                                a0Var4 = a0Var2;
                            }
                            z16 = z13;
                            oiVar3 = oiVarO;
                            jVar4 = jVar2;
                            q3Var3 = q3VarU;
                            c0VarR.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(-436409269, i19, -1, "androidx.compose.material3.FilledTonalIconToggleButton (IconButton.kt:554)");
                            }
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = new Function1() { // from class: androidx.compose.material3.vh
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return ei.B((androidx.compose.ui.semantics.e0) obj);
                                    }
                                };
                                c0VarR.Y(objI0);
                            }
                            int i25 = i19 << 3;
                            c0Var2 = c0VarR;
                            X(z12, function3, androidx.compose.ui.semantics.t.f(a0Var4, false, (Function1) objI0, 1, null), z16, q3Var3, oiVar3, null, jVar4, function2, c0Var2, (i19 & 14) | 1572864 | (i19 & com.planner5d.library.engine.input.f.b.B) | (i19 & 7168) | (57344 & i19) | (458752 & i19) | (29360128 & i25) | (i25 & 234881024));
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            a0Var3 = a0Var4;
                            z15 = z16;
                            q3Var2 = q3Var3;
                            oiVar2 = oiVar3;
                            jVar3 = jVar4;
                        } else {
                            c0Var2 = c0VarR;
                            c0Var2.u();
                            a0Var3 = a0Var2;
                            z15 = z13;
                            q3Var2 = q3VarU;
                            oiVar2 = oiVarO;
                            jVar3 = jVar2;
                        }
                        s5VarT = c0Var2.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material3.wh
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return ei.C(z10, function1, a0Var3, z15, q3Var2, oiVar2, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i12 |= 12582912;
                    i18 = i12;
                    if ((i12 & 4793491) != 4793490) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c0VarR.h(z14, i18 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i20 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i13 != 0) {
                                z13 = true;
                            }
                            if ((i11 & 16) != 0) {
                                i18 &= -57345;
                                q3VarU = kh.f30051a.u(c0VarR, 6);
                            }
                            if ((i11 & 32) != 0) {
                                i19 = i18 & (-458753);
                                oiVarO = kh.f30051a.o(c0VarR, 6);
                            } else {
                                i19 = i18;
                            }
                            if (i15 != 0) {
                                jVar4 = null;
                                z16 = z13;
                                q3Var3 = q3VarU;
                                oiVar3 = oiVarO;
                            } else {
                                z16 = z13;
                                oiVar3 = oiVarO;
                                jVar4 = jVar2;
                                q3Var3 = q3VarU;
                            }
                        } else {
                            if (i20 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i13 != 0) {
                                z13 = true;
                            }
                            if ((i11 & 16) != 0) {
                                i18 &= -57345;
                                q3VarU = kh.f30051a.u(c0VarR, 6);
                            }
                            if ((i11 & 32) != 0) {
                                i19 = i18 & (-458753);
                                oiVarO = kh.f30051a.o(c0VarR, 6);
                            } else {
                                i19 = i18;
                            }
                            if (i15 != 0) {
                                jVar4 = null;
                                z16 = z13;
                                q3Var3 = q3VarU;
                                oiVar3 = oiVarO;
                            } else {
                                z16 = z13;
                                oiVar3 = oiVarO;
                                jVar4 = jVar2;
                                q3Var3 = q3VarU;
                            }
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-436409269, i19, -1, "androidx.compose.material3.FilledTonalIconToggleButton (IconButton.kt:554)");
                        }
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = new Function1() { // from class: androidx.compose.material3.vh
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return ei.B((androidx.compose.ui.semantics.e0) obj);
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        int i26 = i19 << 3;
                        c0Var2 = c0VarR;
                        X(z12, function3, androidx.compose.ui.semantics.t.f(a0Var4, false, (Function1) objI0, 1, null), z16, q3Var3, oiVar3, null, jVar4, function2, c0Var2, (i19 & 14) | 1572864 | (i19 & com.planner5d.library.engine.input.f.b.B) | (i19 & 7168) | (57344 & i19) | (458752 & i19) | (29360128 & i26) | (i26 & 234881024));
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var4;
                        z15 = z16;
                        q3Var2 = q3Var3;
                        oiVar2 = oiVar3;
                        jVar3 = jVar4;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        a0Var3 = a0Var2;
                        z15 = z13;
                        q3Var2 = q3VarU;
                        oiVar2 = oiVarO;
                        jVar3 = jVar2;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.wh
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return ei.C(z10, function1, a0Var3, z15, q3Var2, oiVar2, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 1572864;
                jVar2 = jVar;
                if ((i11 & 128) != 0) {
                    if ((i10 & 12582912) == 0) {
                        if (c0VarR.k0(function2)) {
                            i17 = 8388608;
                        } else {
                            i17 = 4194304;
                        }
                        i12 |= i17;
                    }
                    i18 = i12;
                    if ((i12 & 4793491) != 4793490) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c0VarR.h(z14, i18 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i20 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i13 != 0) {
                                z13 = true;
                            }
                            if ((i11 & 16) != 0) {
                                i18 &= -57345;
                                q3VarU = kh.f30051a.u(c0VarR, 6);
                            }
                            if ((i11 & 32) != 0) {
                                i19 = i18 & (-458753);
                                oiVarO = kh.f30051a.o(c0VarR, 6);
                            } else {
                                i19 = i18;
                            }
                            if (i15 != 0) {
                                jVar4 = null;
                                z16 = z13;
                                q3Var3 = q3VarU;
                                oiVar3 = oiVarO;
                            } else {
                                z16 = z13;
                                oiVar3 = oiVarO;
                                jVar4 = jVar2;
                                q3Var3 = q3VarU;
                            }
                        } else {
                            if (i20 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i13 != 0) {
                                z13 = true;
                            }
                            if ((i11 & 16) != 0) {
                                i18 &= -57345;
                                q3VarU = kh.f30051a.u(c0VarR, 6);
                            }
                            if ((i11 & 32) != 0) {
                                i19 = i18 & (-458753);
                                oiVarO = kh.f30051a.o(c0VarR, 6);
                            } else {
                                i19 = i18;
                            }
                            if (i15 != 0) {
                                jVar4 = null;
                                z16 = z13;
                                q3Var3 = q3VarU;
                                oiVar3 = oiVarO;
                            } else {
                                z16 = z13;
                                oiVar3 = oiVarO;
                                jVar4 = jVar2;
                                q3Var3 = q3VarU;
                            }
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-436409269, i19, -1, "androidx.compose.material3.FilledTonalIconToggleButton (IconButton.kt:554)");
                        }
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = new Function1() { // from class: androidx.compose.material3.vh
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return ei.B((androidx.compose.ui.semantics.e0) obj);
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        int i27 = i19 << 3;
                        c0Var2 = c0VarR;
                        X(z12, function3, androidx.compose.ui.semantics.t.f(a0Var4, false, (Function1) objI0, 1, null), z16, q3Var3, oiVar3, null, jVar4, function2, c0Var2, (i19 & 14) | 1572864 | (i19 & com.planner5d.library.engine.input.f.b.B) | (i19 & 7168) | (57344 & i19) | (458752 & i19) | (29360128 & i27) | (i27 & 234881024));
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var4;
                        z15 = z16;
                        q3Var2 = q3Var3;
                        oiVar2 = oiVar3;
                        jVar3 = jVar4;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        a0Var3 = a0Var2;
                        z15 = z13;
                        q3Var2 = q3VarU;
                        oiVar2 = oiVarO;
                        jVar3 = jVar2;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.wh
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return ei.C(z10, function1, a0Var3, z15, q3Var2, oiVar2, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 12582912;
                i18 = i12;
                if ((i12 & 4793491) != 4793490) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c0VarR.h(z14, i18 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i20 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if ((i11 & 16) != 0) {
                            i18 &= -57345;
                            q3VarU = kh.f30051a.u(c0VarR, 6);
                        }
                        if ((i11 & 32) != 0) {
                            i19 = i18 & (-458753);
                            oiVarO = kh.f30051a.o(c0VarR, 6);
                        } else {
                            i19 = i18;
                        }
                        if (i15 != 0) {
                            jVar4 = null;
                            z16 = z13;
                            q3Var3 = q3VarU;
                            oiVar3 = oiVarO;
                        } else {
                            z16 = z13;
                            oiVar3 = oiVarO;
                            jVar4 = jVar2;
                            q3Var3 = q3VarU;
                        }
                    } else {
                        if (i20 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if ((i11 & 16) != 0) {
                            i18 &= -57345;
                            q3VarU = kh.f30051a.u(c0VarR, 6);
                        }
                        if ((i11 & 32) != 0) {
                            i19 = i18 & (-458753);
                            oiVarO = kh.f30051a.o(c0VarR, 6);
                        } else {
                            i19 = i18;
                        }
                        if (i15 != 0) {
                            jVar4 = null;
                            z16 = z13;
                            q3Var3 = q3VarU;
                            oiVar3 = oiVarO;
                        } else {
                            z16 = z13;
                            oiVar3 = oiVarO;
                            jVar4 = jVar2;
                            q3Var3 = q3VarU;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-436409269, i19, -1, "androidx.compose.material3.FilledTonalIconToggleButton (IconButton.kt:554)");
                    }
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = new Function1() { // from class: androidx.compose.material3.vh
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return ei.B((androidx.compose.ui.semantics.e0) obj);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    int i28 = i19 << 3;
                    c0Var2 = c0VarR;
                    X(z12, function3, androidx.compose.ui.semantics.t.f(a0Var4, false, (Function1) objI0, 1, null), z16, q3Var3, oiVar3, null, jVar4, function2, c0Var2, (i19 & 14) | 1572864 | (i19 & com.planner5d.library.engine.input.f.b.B) | (i19 & 7168) | (57344 & i19) | (458752 & i19) | (29360128 & i28) | (i28 & 234881024));
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var4;
                    z15 = z16;
                    q3Var2 = q3Var3;
                    oiVar2 = oiVar3;
                    jVar3 = jVar4;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var3 = a0Var2;
                    z15 = z13;
                    q3Var2 = q3VarU;
                    oiVar2 = oiVarO;
                    jVar3 = jVar2;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.wh
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ei.C(z10, function1, a0Var3, z15, q3Var2, oiVar2, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 3072;
            z13 = z11;
            if ((i10 & 24576) == 0) {
                if ((i11 & 16) == 0) {
                    q3VarU = q3Var;
                    if (c0VarR.D(q3VarU)) {
                    }
                    i12 |= i21;
                } else {
                    q3VarU = q3Var;
                }
                i12 |= i21;
            } else {
                q3VarU = q3Var;
            }
            if ((196608 & i10) == 0) {
                if ((i11 & 32) == 0) {
                    oiVarO = oiVar;
                    if (c0VarR.D(oiVarO)) {
                    }
                    i12 |= i22;
                } else {
                    oiVarO = oiVar;
                }
                i12 |= i22;
            } else {
                oiVarO = oiVar;
            }
            i15 = i11 & 64;
            if (i15 != 0) {
                if ((i10 & 1572864) == 0) {
                    jVar2 = jVar;
                    if (c0VarR.D(jVar2)) {
                        i16 = 1048576;
                    } else {
                        i16 = 524288;
                    }
                    i12 |= i16;
                }
                if ((i11 & 128) != 0) {
                    if ((i10 & 12582912) == 0) {
                        if (c0VarR.k0(function2)) {
                            i17 = 8388608;
                        } else {
                            i17 = 4194304;
                        }
                        i12 |= i17;
                    }
                    i18 = i12;
                    if ((i12 & 4793491) != 4793490) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c0VarR.h(z14, i18 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i20 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i13 != 0) {
                                z13 = true;
                            }
                            if ((i11 & 16) != 0) {
                                i18 &= -57345;
                                q3VarU = kh.f30051a.u(c0VarR, 6);
                            }
                            if ((i11 & 32) != 0) {
                                i19 = i18 & (-458753);
                                oiVarO = kh.f30051a.o(c0VarR, 6);
                            } else {
                                i19 = i18;
                            }
                            if (i15 != 0) {
                                jVar4 = null;
                                z16 = z13;
                                q3Var3 = q3VarU;
                                oiVar3 = oiVarO;
                            } else {
                                z16 = z13;
                                oiVar3 = oiVarO;
                                jVar4 = jVar2;
                                q3Var3 = q3VarU;
                            }
                        } else {
                            if (i20 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i13 != 0) {
                                z13 = true;
                            }
                            if ((i11 & 16) != 0) {
                                i18 &= -57345;
                                q3VarU = kh.f30051a.u(c0VarR, 6);
                            }
                            if ((i11 & 32) != 0) {
                                i19 = i18 & (-458753);
                                oiVarO = kh.f30051a.o(c0VarR, 6);
                            } else {
                                i19 = i18;
                            }
                            if (i15 != 0) {
                                jVar4 = null;
                                z16 = z13;
                                q3Var3 = q3VarU;
                                oiVar3 = oiVarO;
                            } else {
                                z16 = z13;
                                oiVar3 = oiVarO;
                                jVar4 = jVar2;
                                q3Var3 = q3VarU;
                            }
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-436409269, i19, -1, "androidx.compose.material3.FilledTonalIconToggleButton (IconButton.kt:554)");
                        }
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = new Function1() { // from class: androidx.compose.material3.vh
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return ei.B((androidx.compose.ui.semantics.e0) obj);
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        int i29 = i19 << 3;
                        c0Var2 = c0VarR;
                        X(z12, function3, androidx.compose.ui.semantics.t.f(a0Var4, false, (Function1) objI0, 1, null), z16, q3Var3, oiVar3, null, jVar4, function2, c0Var2, (i19 & 14) | 1572864 | (i19 & com.planner5d.library.engine.input.f.b.B) | (i19 & 7168) | (57344 & i19) | (458752 & i19) | (29360128 & i29) | (i29 & 234881024));
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var4;
                        z15 = z16;
                        q3Var2 = q3Var3;
                        oiVar2 = oiVar3;
                        jVar3 = jVar4;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        a0Var3 = a0Var2;
                        z15 = z13;
                        q3Var2 = q3VarU;
                        oiVar2 = oiVarO;
                        jVar3 = jVar2;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.wh
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return ei.C(z10, function1, a0Var3, z15, q3Var2, oiVar2, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 12582912;
                i18 = i12;
                if ((i12 & 4793491) != 4793490) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c0VarR.h(z14, i18 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i20 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if ((i11 & 16) != 0) {
                            i18 &= -57345;
                            q3VarU = kh.f30051a.u(c0VarR, 6);
                        }
                        if ((i11 & 32) != 0) {
                            i19 = i18 & (-458753);
                            oiVarO = kh.f30051a.o(c0VarR, 6);
                        } else {
                            i19 = i18;
                        }
                        if (i15 != 0) {
                            jVar4 = null;
                            z16 = z13;
                            q3Var3 = q3VarU;
                            oiVar3 = oiVarO;
                        } else {
                            z16 = z13;
                            oiVar3 = oiVarO;
                            jVar4 = jVar2;
                            q3Var3 = q3VarU;
                        }
                    } else {
                        if (i20 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if ((i11 & 16) != 0) {
                            i18 &= -57345;
                            q3VarU = kh.f30051a.u(c0VarR, 6);
                        }
                        if ((i11 & 32) != 0) {
                            i19 = i18 & (-458753);
                            oiVarO = kh.f30051a.o(c0VarR, 6);
                        } else {
                            i19 = i18;
                        }
                        if (i15 != 0) {
                            jVar4 = null;
                            z16 = z13;
                            q3Var3 = q3VarU;
                            oiVar3 = oiVarO;
                        } else {
                            z16 = z13;
                            oiVar3 = oiVarO;
                            jVar4 = jVar2;
                            q3Var3 = q3VarU;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-436409269, i19, -1, "androidx.compose.material3.FilledTonalIconToggleButton (IconButton.kt:554)");
                    }
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = new Function1() { // from class: androidx.compose.material3.vh
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return ei.B((androidx.compose.ui.semantics.e0) obj);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    int i210 = i19 << 3;
                    c0Var2 = c0VarR;
                    X(z12, function3, androidx.compose.ui.semantics.t.f(a0Var4, false, (Function1) objI0, 1, null), z16, q3Var3, oiVar3, null, jVar4, function2, c0Var2, (i19 & 14) | 1572864 | (i19 & com.planner5d.library.engine.input.f.b.B) | (i19 & 7168) | (57344 & i19) | (458752 & i19) | (29360128 & i210) | (i210 & 234881024));
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var4;
                    z15 = z16;
                    q3Var2 = q3Var3;
                    oiVar2 = oiVar3;
                    jVar3 = jVar4;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var3 = a0Var2;
                    z15 = z13;
                    q3Var2 = q3VarU;
                    oiVar2 = oiVarO;
                    jVar3 = jVar2;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.wh
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ei.C(z10, function1, a0Var3, z15, q3Var2, oiVar2, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 1572864;
            jVar2 = jVar;
            if ((i11 & 128) != 0) {
                if ((i10 & 12582912) == 0) {
                    if (c0VarR.k0(function2)) {
                        i17 = 8388608;
                    } else {
                        i17 = 4194304;
                    }
                    i12 |= i17;
                }
                i18 = i12;
                if ((i12 & 4793491) != 4793490) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c0VarR.h(z14, i18 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i20 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if ((i11 & 16) != 0) {
                            i18 &= -57345;
                            q3VarU = kh.f30051a.u(c0VarR, 6);
                        }
                        if ((i11 & 32) != 0) {
                            i19 = i18 & (-458753);
                            oiVarO = kh.f30051a.o(c0VarR, 6);
                        } else {
                            i19 = i18;
                        }
                        if (i15 != 0) {
                            jVar4 = null;
                            z16 = z13;
                            q3Var3 = q3VarU;
                            oiVar3 = oiVarO;
                        } else {
                            z16 = z13;
                            oiVar3 = oiVarO;
                            jVar4 = jVar2;
                            q3Var3 = q3VarU;
                        }
                    } else {
                        if (i20 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if ((i11 & 16) != 0) {
                            i18 &= -57345;
                            q3VarU = kh.f30051a.u(c0VarR, 6);
                        }
                        if ((i11 & 32) != 0) {
                            i19 = i18 & (-458753);
                            oiVarO = kh.f30051a.o(c0VarR, 6);
                        } else {
                            i19 = i18;
                        }
                        if (i15 != 0) {
                            jVar4 = null;
                            z16 = z13;
                            q3Var3 = q3VarU;
                            oiVar3 = oiVarO;
                        } else {
                            z16 = z13;
                            oiVar3 = oiVarO;
                            jVar4 = jVar2;
                            q3Var3 = q3VarU;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-436409269, i19, -1, "androidx.compose.material3.FilledTonalIconToggleButton (IconButton.kt:554)");
                    }
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = new Function1() { // from class: androidx.compose.material3.vh
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return ei.B((androidx.compose.ui.semantics.e0) obj);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    int i211 = i19 << 3;
                    c0Var2 = c0VarR;
                    X(z12, function3, androidx.compose.ui.semantics.t.f(a0Var4, false, (Function1) objI0, 1, null), z16, q3Var3, oiVar3, null, jVar4, function2, c0Var2, (i19 & 14) | 1572864 | (i19 & com.planner5d.library.engine.input.f.b.B) | (i19 & 7168) | (57344 & i19) | (458752 & i19) | (29360128 & i211) | (i211 & 234881024));
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var4;
                    z15 = z16;
                    q3Var2 = q3Var3;
                    oiVar2 = oiVar3;
                    jVar3 = jVar4;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var3 = a0Var2;
                    z15 = z13;
                    q3Var2 = q3VarU;
                    oiVar2 = oiVarO;
                    jVar3 = jVar2;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.wh
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ei.C(z10, function1, a0Var3, z15, q3Var2, oiVar2, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 12582912;
            i18 = i12;
            if ((i12 & 4793491) != 4793490) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c0VarR.h(z14, i18 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i20 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    }
                    if ((i11 & 16) != 0) {
                        i18 &= -57345;
                        q3VarU = kh.f30051a.u(c0VarR, 6);
                    }
                    if ((i11 & 32) != 0) {
                        i19 = i18 & (-458753);
                        oiVarO = kh.f30051a.o(c0VarR, 6);
                    } else {
                        i19 = i18;
                    }
                    if (i15 != 0) {
                        jVar4 = null;
                        z16 = z13;
                        q3Var3 = q3VarU;
                        oiVar3 = oiVarO;
                    } else {
                        z16 = z13;
                        oiVar3 = oiVarO;
                        jVar4 = jVar2;
                        q3Var3 = q3VarU;
                    }
                } else {
                    if (i20 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    }
                    if ((i11 & 16) != 0) {
                        i18 &= -57345;
                        q3VarU = kh.f30051a.u(c0VarR, 6);
                    }
                    if ((i11 & 32) != 0) {
                        i19 = i18 & (-458753);
                        oiVarO = kh.f30051a.o(c0VarR, 6);
                    } else {
                        i19 = i18;
                    }
                    if (i15 != 0) {
                        jVar4 = null;
                        z16 = z13;
                        q3Var3 = q3VarU;
                        oiVar3 = oiVarO;
                    } else {
                        z16 = z13;
                        oiVar3 = oiVarO;
                        jVar4 = jVar2;
                        q3Var3 = q3VarU;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-436409269, i19, -1, "androidx.compose.material3.FilledTonalIconToggleButton (IconButton.kt:554)");
                }
                objI0 = c0VarR.i0();
                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = new Function1() { // from class: androidx.compose.material3.vh
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return ei.B((androidx.compose.ui.semantics.e0) obj);
                        }
                    };
                    c0VarR.Y(objI0);
                }
                int i212 = i19 << 3;
                c0Var2 = c0VarR;
                X(z12, function3, androidx.compose.ui.semantics.t.f(a0Var4, false, (Function1) objI0, 1, null), z16, q3Var3, oiVar3, null, jVar4, function2, c0Var2, (i19 & 14) | 1572864 | (i19 & com.planner5d.library.engine.input.f.b.B) | (i19 & 7168) | (57344 & i19) | (458752 & i19) | (29360128 & i212) | (i212 & 234881024));
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var4;
                z15 = z16;
                q3Var2 = q3Var3;
                oiVar2 = oiVar3;
                jVar3 = jVar4;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var3 = a0Var2;
                z15 = z13;
                q3Var2 = q3VarU;
                oiVar2 = oiVarO;
                jVar3 = jVar2;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.wh
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ei.C(z10, function1, a0Var3, z15, q3Var2, oiVar2, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= androidx.media3.exoplayer.a5.S0;
        a0Var2 = a0Var;
        i13 = i11 & 8;
        if (i13 != 0) {
            if ((i10 & 3072) == 0) {
                z13 = z11;
                if (c0VarR.G(z13)) {
                    i14 = 2048;
                } else {
                    i14 = 1024;
                }
                i12 |= i14;
            }
            if ((i10 & 24576) == 0) {
                if ((i11 & 16) == 0) {
                    q3VarU = q3Var;
                    if (c0VarR.D(q3VarU)) {
                    }
                    i12 |= i21;
                } else {
                    q3VarU = q3Var;
                }
                i12 |= i21;
            } else {
                q3VarU = q3Var;
            }
            if ((196608 & i10) == 0) {
                if ((i11 & 32) == 0) {
                    oiVarO = oiVar;
                    if (c0VarR.D(oiVarO)) {
                    }
                    i12 |= i22;
                } else {
                    oiVarO = oiVar;
                }
                i12 |= i22;
            } else {
                oiVarO = oiVar;
            }
            i15 = i11 & 64;
            if (i15 != 0) {
                if ((i10 & 1572864) == 0) {
                    jVar2 = jVar;
                    if (c0VarR.D(jVar2)) {
                        i16 = 1048576;
                    } else {
                        i16 = 524288;
                    }
                    i12 |= i16;
                }
                if ((i11 & 128) != 0) {
                    if ((i10 & 12582912) == 0) {
                        if (c0VarR.k0(function2)) {
                            i17 = 8388608;
                        } else {
                            i17 = 4194304;
                        }
                        i12 |= i17;
                    }
                    i18 = i12;
                    if ((i12 & 4793491) != 4793490) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c0VarR.h(z14, i18 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i20 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i13 != 0) {
                                z13 = true;
                            }
                            if ((i11 & 16) != 0) {
                                i18 &= -57345;
                                q3VarU = kh.f30051a.u(c0VarR, 6);
                            }
                            if ((i11 & 32) != 0) {
                                i19 = i18 & (-458753);
                                oiVarO = kh.f30051a.o(c0VarR, 6);
                            } else {
                                i19 = i18;
                            }
                            if (i15 != 0) {
                                jVar4 = null;
                                z16 = z13;
                                q3Var3 = q3VarU;
                                oiVar3 = oiVarO;
                            } else {
                                z16 = z13;
                                oiVar3 = oiVarO;
                                jVar4 = jVar2;
                                q3Var3 = q3VarU;
                            }
                        } else {
                            if (i20 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i13 != 0) {
                                z13 = true;
                            }
                            if ((i11 & 16) != 0) {
                                i18 &= -57345;
                                q3VarU = kh.f30051a.u(c0VarR, 6);
                            }
                            if ((i11 & 32) != 0) {
                                i19 = i18 & (-458753);
                                oiVarO = kh.f30051a.o(c0VarR, 6);
                            } else {
                                i19 = i18;
                            }
                            if (i15 != 0) {
                                jVar4 = null;
                                z16 = z13;
                                q3Var3 = q3VarU;
                                oiVar3 = oiVarO;
                            } else {
                                z16 = z13;
                                oiVar3 = oiVarO;
                                jVar4 = jVar2;
                                q3Var3 = q3VarU;
                            }
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-436409269, i19, -1, "androidx.compose.material3.FilledTonalIconToggleButton (IconButton.kt:554)");
                        }
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = new Function1() { // from class: androidx.compose.material3.vh
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return ei.B((androidx.compose.ui.semantics.e0) obj);
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        int i213 = i19 << 3;
                        c0Var2 = c0VarR;
                        X(z12, function3, androidx.compose.ui.semantics.t.f(a0Var4, false, (Function1) objI0, 1, null), z16, q3Var3, oiVar3, null, jVar4, function2, c0Var2, (i19 & 14) | 1572864 | (i19 & com.planner5d.library.engine.input.f.b.B) | (i19 & 7168) | (57344 & i19) | (458752 & i19) | (29360128 & i213) | (i213 & 234881024));
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var4;
                        z15 = z16;
                        q3Var2 = q3Var3;
                        oiVar2 = oiVar3;
                        jVar3 = jVar4;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        a0Var3 = a0Var2;
                        z15 = z13;
                        q3Var2 = q3VarU;
                        oiVar2 = oiVarO;
                        jVar3 = jVar2;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.wh
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return ei.C(z10, function1, a0Var3, z15, q3Var2, oiVar2, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 12582912;
                i18 = i12;
                if ((i12 & 4793491) != 4793490) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c0VarR.h(z14, i18 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i20 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if ((i11 & 16) != 0) {
                            i18 &= -57345;
                            q3VarU = kh.f30051a.u(c0VarR, 6);
                        }
                        if ((i11 & 32) != 0) {
                            i19 = i18 & (-458753);
                            oiVarO = kh.f30051a.o(c0VarR, 6);
                        } else {
                            i19 = i18;
                        }
                        if (i15 != 0) {
                            jVar4 = null;
                            z16 = z13;
                            q3Var3 = q3VarU;
                            oiVar3 = oiVarO;
                        } else {
                            z16 = z13;
                            oiVar3 = oiVarO;
                            jVar4 = jVar2;
                            q3Var3 = q3VarU;
                        }
                    } else {
                        if (i20 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if ((i11 & 16) != 0) {
                            i18 &= -57345;
                            q3VarU = kh.f30051a.u(c0VarR, 6);
                        }
                        if ((i11 & 32) != 0) {
                            i19 = i18 & (-458753);
                            oiVarO = kh.f30051a.o(c0VarR, 6);
                        } else {
                            i19 = i18;
                        }
                        if (i15 != 0) {
                            jVar4 = null;
                            z16 = z13;
                            q3Var3 = q3VarU;
                            oiVar3 = oiVarO;
                        } else {
                            z16 = z13;
                            oiVar3 = oiVarO;
                            jVar4 = jVar2;
                            q3Var3 = q3VarU;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-436409269, i19, -1, "androidx.compose.material3.FilledTonalIconToggleButton (IconButton.kt:554)");
                    }
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = new Function1() { // from class: androidx.compose.material3.vh
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return ei.B((androidx.compose.ui.semantics.e0) obj);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    int i214 = i19 << 3;
                    c0Var2 = c0VarR;
                    X(z12, function3, androidx.compose.ui.semantics.t.f(a0Var4, false, (Function1) objI0, 1, null), z16, q3Var3, oiVar3, null, jVar4, function2, c0Var2, (i19 & 14) | 1572864 | (i19 & com.planner5d.library.engine.input.f.b.B) | (i19 & 7168) | (57344 & i19) | (458752 & i19) | (29360128 & i214) | (i214 & 234881024));
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var4;
                    z15 = z16;
                    q3Var2 = q3Var3;
                    oiVar2 = oiVar3;
                    jVar3 = jVar4;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var3 = a0Var2;
                    z15 = z13;
                    q3Var2 = q3VarU;
                    oiVar2 = oiVarO;
                    jVar3 = jVar2;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.wh
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ei.C(z10, function1, a0Var3, z15, q3Var2, oiVar2, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 1572864;
            jVar2 = jVar;
            if ((i11 & 128) != 0) {
                if ((i10 & 12582912) == 0) {
                    if (c0VarR.k0(function2)) {
                        i17 = 8388608;
                    } else {
                        i17 = 4194304;
                    }
                    i12 |= i17;
                }
                i18 = i12;
                if ((i12 & 4793491) != 4793490) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c0VarR.h(z14, i18 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i20 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if ((i11 & 16) != 0) {
                            i18 &= -57345;
                            q3VarU = kh.f30051a.u(c0VarR, 6);
                        }
                        if ((i11 & 32) != 0) {
                            i19 = i18 & (-458753);
                            oiVarO = kh.f30051a.o(c0VarR, 6);
                        } else {
                            i19 = i18;
                        }
                        if (i15 != 0) {
                            jVar4 = null;
                            z16 = z13;
                            q3Var3 = q3VarU;
                            oiVar3 = oiVarO;
                        } else {
                            z16 = z13;
                            oiVar3 = oiVarO;
                            jVar4 = jVar2;
                            q3Var3 = q3VarU;
                        }
                    } else {
                        if (i20 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if ((i11 & 16) != 0) {
                            i18 &= -57345;
                            q3VarU = kh.f30051a.u(c0VarR, 6);
                        }
                        if ((i11 & 32) != 0) {
                            i19 = i18 & (-458753);
                            oiVarO = kh.f30051a.o(c0VarR, 6);
                        } else {
                            i19 = i18;
                        }
                        if (i15 != 0) {
                            jVar4 = null;
                            z16 = z13;
                            q3Var3 = q3VarU;
                            oiVar3 = oiVarO;
                        } else {
                            z16 = z13;
                            oiVar3 = oiVarO;
                            jVar4 = jVar2;
                            q3Var3 = q3VarU;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-436409269, i19, -1, "androidx.compose.material3.FilledTonalIconToggleButton (IconButton.kt:554)");
                    }
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = new Function1() { // from class: androidx.compose.material3.vh
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return ei.B((androidx.compose.ui.semantics.e0) obj);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    int i215 = i19 << 3;
                    c0Var2 = c0VarR;
                    X(z12, function3, androidx.compose.ui.semantics.t.f(a0Var4, false, (Function1) objI0, 1, null), z16, q3Var3, oiVar3, null, jVar4, function2, c0Var2, (i19 & 14) | 1572864 | (i19 & com.planner5d.library.engine.input.f.b.B) | (i19 & 7168) | (57344 & i19) | (458752 & i19) | (29360128 & i215) | (i215 & 234881024));
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var4;
                    z15 = z16;
                    q3Var2 = q3Var3;
                    oiVar2 = oiVar3;
                    jVar3 = jVar4;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var3 = a0Var2;
                    z15 = z13;
                    q3Var2 = q3VarU;
                    oiVar2 = oiVarO;
                    jVar3 = jVar2;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.wh
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ei.C(z10, function1, a0Var3, z15, q3Var2, oiVar2, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 12582912;
            i18 = i12;
            if ((i12 & 4793491) != 4793490) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c0VarR.h(z14, i18 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i20 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    }
                    if ((i11 & 16) != 0) {
                        i18 &= -57345;
                        q3VarU = kh.f30051a.u(c0VarR, 6);
                    }
                    if ((i11 & 32) != 0) {
                        i19 = i18 & (-458753);
                        oiVarO = kh.f30051a.o(c0VarR, 6);
                    } else {
                        i19 = i18;
                    }
                    if (i15 != 0) {
                        jVar4 = null;
                        z16 = z13;
                        q3Var3 = q3VarU;
                        oiVar3 = oiVarO;
                    } else {
                        z16 = z13;
                        oiVar3 = oiVarO;
                        jVar4 = jVar2;
                        q3Var3 = q3VarU;
                    }
                } else {
                    if (i20 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    }
                    if ((i11 & 16) != 0) {
                        i18 &= -57345;
                        q3VarU = kh.f30051a.u(c0VarR, 6);
                    }
                    if ((i11 & 32) != 0) {
                        i19 = i18 & (-458753);
                        oiVarO = kh.f30051a.o(c0VarR, 6);
                    } else {
                        i19 = i18;
                    }
                    if (i15 != 0) {
                        jVar4 = null;
                        z16 = z13;
                        q3Var3 = q3VarU;
                        oiVar3 = oiVarO;
                    } else {
                        z16 = z13;
                        oiVar3 = oiVarO;
                        jVar4 = jVar2;
                        q3Var3 = q3VarU;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-436409269, i19, -1, "androidx.compose.material3.FilledTonalIconToggleButton (IconButton.kt:554)");
                }
                objI0 = c0VarR.i0();
                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = new Function1() { // from class: androidx.compose.material3.vh
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return ei.B((androidx.compose.ui.semantics.e0) obj);
                        }
                    };
                    c0VarR.Y(objI0);
                }
                int i216 = i19 << 3;
                c0Var2 = c0VarR;
                X(z12, function3, androidx.compose.ui.semantics.t.f(a0Var4, false, (Function1) objI0, 1, null), z16, q3Var3, oiVar3, null, jVar4, function2, c0Var2, (i19 & 14) | 1572864 | (i19 & com.planner5d.library.engine.input.f.b.B) | (i19 & 7168) | (57344 & i19) | (458752 & i19) | (29360128 & i216) | (i216 & 234881024));
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var4;
                z15 = z16;
                q3Var2 = q3Var3;
                oiVar2 = oiVar3;
                jVar3 = jVar4;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var3 = a0Var2;
                z15 = z13;
                q3Var2 = q3VarU;
                oiVar2 = oiVarO;
                jVar3 = jVar2;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.wh
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ei.C(z10, function1, a0Var3, z15, q3Var2, oiVar2, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 3072;
        z13 = z11;
        if ((i10 & 24576) == 0) {
            if ((i11 & 16) == 0) {
                q3VarU = q3Var;
                if (c0VarR.D(q3VarU)) {
                }
                i12 |= i21;
            } else {
                q3VarU = q3Var;
            }
            i12 |= i21;
        } else {
            q3VarU = q3Var;
        }
        if ((196608 & i10) == 0) {
            if ((i11 & 32) == 0) {
                oiVarO = oiVar;
                if (c0VarR.D(oiVarO)) {
                }
                i12 |= i22;
            } else {
                oiVarO = oiVar;
            }
            i12 |= i22;
        } else {
            oiVarO = oiVar;
        }
        i15 = i11 & 64;
        if (i15 != 0) {
            if ((i10 & 1572864) == 0) {
                jVar2 = jVar;
                if (c0VarR.D(jVar2)) {
                    i16 = 1048576;
                } else {
                    i16 = 524288;
                }
                i12 |= i16;
            }
            if ((i11 & 128) != 0) {
                if ((i10 & 12582912) == 0) {
                    if (c0VarR.k0(function2)) {
                        i17 = 8388608;
                    } else {
                        i17 = 4194304;
                    }
                    i12 |= i17;
                }
                i18 = i12;
                if ((i12 & 4793491) != 4793490) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c0VarR.h(z14, i18 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i20 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if ((i11 & 16) != 0) {
                            i18 &= -57345;
                            q3VarU = kh.f30051a.u(c0VarR, 6);
                        }
                        if ((i11 & 32) != 0) {
                            i19 = i18 & (-458753);
                            oiVarO = kh.f30051a.o(c0VarR, 6);
                        } else {
                            i19 = i18;
                        }
                        if (i15 != 0) {
                            jVar4 = null;
                            z16 = z13;
                            q3Var3 = q3VarU;
                            oiVar3 = oiVarO;
                        } else {
                            z16 = z13;
                            oiVar3 = oiVarO;
                            jVar4 = jVar2;
                            q3Var3 = q3VarU;
                        }
                    } else {
                        if (i20 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if ((i11 & 16) != 0) {
                            i18 &= -57345;
                            q3VarU = kh.f30051a.u(c0VarR, 6);
                        }
                        if ((i11 & 32) != 0) {
                            i19 = i18 & (-458753);
                            oiVarO = kh.f30051a.o(c0VarR, 6);
                        } else {
                            i19 = i18;
                        }
                        if (i15 != 0) {
                            jVar4 = null;
                            z16 = z13;
                            q3Var3 = q3VarU;
                            oiVar3 = oiVarO;
                        } else {
                            z16 = z13;
                            oiVar3 = oiVarO;
                            jVar4 = jVar2;
                            q3Var3 = q3VarU;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-436409269, i19, -1, "androidx.compose.material3.FilledTonalIconToggleButton (IconButton.kt:554)");
                    }
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = new Function1() { // from class: androidx.compose.material3.vh
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return ei.B((androidx.compose.ui.semantics.e0) obj);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    int i217 = i19 << 3;
                    c0Var2 = c0VarR;
                    X(z12, function3, androidx.compose.ui.semantics.t.f(a0Var4, false, (Function1) objI0, 1, null), z16, q3Var3, oiVar3, null, jVar4, function2, c0Var2, (i19 & 14) | 1572864 | (i19 & com.planner5d.library.engine.input.f.b.B) | (i19 & 7168) | (57344 & i19) | (458752 & i19) | (29360128 & i217) | (i217 & 234881024));
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var4;
                    z15 = z16;
                    q3Var2 = q3Var3;
                    oiVar2 = oiVar3;
                    jVar3 = jVar4;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var3 = a0Var2;
                    z15 = z13;
                    q3Var2 = q3VarU;
                    oiVar2 = oiVarO;
                    jVar3 = jVar2;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.wh
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ei.C(z10, function1, a0Var3, z15, q3Var2, oiVar2, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 12582912;
            i18 = i12;
            if ((i12 & 4793491) != 4793490) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c0VarR.h(z14, i18 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i20 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    }
                    if ((i11 & 16) != 0) {
                        i18 &= -57345;
                        q3VarU = kh.f30051a.u(c0VarR, 6);
                    }
                    if ((i11 & 32) != 0) {
                        i19 = i18 & (-458753);
                        oiVarO = kh.f30051a.o(c0VarR, 6);
                    } else {
                        i19 = i18;
                    }
                    if (i15 != 0) {
                        jVar4 = null;
                        z16 = z13;
                        q3Var3 = q3VarU;
                        oiVar3 = oiVarO;
                    } else {
                        z16 = z13;
                        oiVar3 = oiVarO;
                        jVar4 = jVar2;
                        q3Var3 = q3VarU;
                    }
                } else {
                    if (i20 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    }
                    if ((i11 & 16) != 0) {
                        i18 &= -57345;
                        q3VarU = kh.f30051a.u(c0VarR, 6);
                    }
                    if ((i11 & 32) != 0) {
                        i19 = i18 & (-458753);
                        oiVarO = kh.f30051a.o(c0VarR, 6);
                    } else {
                        i19 = i18;
                    }
                    if (i15 != 0) {
                        jVar4 = null;
                        z16 = z13;
                        q3Var3 = q3VarU;
                        oiVar3 = oiVarO;
                    } else {
                        z16 = z13;
                        oiVar3 = oiVarO;
                        jVar4 = jVar2;
                        q3Var3 = q3VarU;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-436409269, i19, -1, "androidx.compose.material3.FilledTonalIconToggleButton (IconButton.kt:554)");
                }
                objI0 = c0VarR.i0();
                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = new Function1() { // from class: androidx.compose.material3.vh
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return ei.B((androidx.compose.ui.semantics.e0) obj);
                        }
                    };
                    c0VarR.Y(objI0);
                }
                int i218 = i19 << 3;
                c0Var2 = c0VarR;
                X(z12, function3, androidx.compose.ui.semantics.t.f(a0Var4, false, (Function1) objI0, 1, null), z16, q3Var3, oiVar3, null, jVar4, function2, c0Var2, (i19 & 14) | 1572864 | (i19 & com.planner5d.library.engine.input.f.b.B) | (i19 & 7168) | (57344 & i19) | (458752 & i19) | (29360128 & i218) | (i218 & 234881024));
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var4;
                z15 = z16;
                q3Var2 = q3Var3;
                oiVar2 = oiVar3;
                jVar3 = jVar4;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var3 = a0Var2;
                z15 = z13;
                q3Var2 = q3VarU;
                oiVar2 = oiVarO;
                jVar3 = jVar2;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.wh
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ei.C(z10, function1, a0Var3, z15, q3Var2, oiVar2, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 1572864;
        jVar2 = jVar;
        if ((i11 & 128) != 0) {
            if ((i10 & 12582912) == 0) {
                if (c0VarR.k0(function2)) {
                    i17 = 8388608;
                } else {
                    i17 = 4194304;
                }
                i12 |= i17;
            }
            i18 = i12;
            if ((i12 & 4793491) != 4793490) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c0VarR.h(z14, i18 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i20 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    }
                    if ((i11 & 16) != 0) {
                        i18 &= -57345;
                        q3VarU = kh.f30051a.u(c0VarR, 6);
                    }
                    if ((i11 & 32) != 0) {
                        i19 = i18 & (-458753);
                        oiVarO = kh.f30051a.o(c0VarR, 6);
                    } else {
                        i19 = i18;
                    }
                    if (i15 != 0) {
                        jVar4 = null;
                        z16 = z13;
                        q3Var3 = q3VarU;
                        oiVar3 = oiVarO;
                    } else {
                        z16 = z13;
                        oiVar3 = oiVarO;
                        jVar4 = jVar2;
                        q3Var3 = q3VarU;
                    }
                } else {
                    if (i20 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    }
                    if ((i11 & 16) != 0) {
                        i18 &= -57345;
                        q3VarU = kh.f30051a.u(c0VarR, 6);
                    }
                    if ((i11 & 32) != 0) {
                        i19 = i18 & (-458753);
                        oiVarO = kh.f30051a.o(c0VarR, 6);
                    } else {
                        i19 = i18;
                    }
                    if (i15 != 0) {
                        jVar4 = null;
                        z16 = z13;
                        q3Var3 = q3VarU;
                        oiVar3 = oiVarO;
                    } else {
                        z16 = z13;
                        oiVar3 = oiVarO;
                        jVar4 = jVar2;
                        q3Var3 = q3VarU;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-436409269, i19, -1, "androidx.compose.material3.FilledTonalIconToggleButton (IconButton.kt:554)");
                }
                objI0 = c0VarR.i0();
                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = new Function1() { // from class: androidx.compose.material3.vh
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return ei.B((androidx.compose.ui.semantics.e0) obj);
                        }
                    };
                    c0VarR.Y(objI0);
                }
                int i219 = i19 << 3;
                c0Var2 = c0VarR;
                X(z12, function3, androidx.compose.ui.semantics.t.f(a0Var4, false, (Function1) objI0, 1, null), z16, q3Var3, oiVar3, null, jVar4, function2, c0Var2, (i19 & 14) | 1572864 | (i19 & com.planner5d.library.engine.input.f.b.B) | (i19 & 7168) | (57344 & i19) | (458752 & i19) | (29360128 & i219) | (i219 & 234881024));
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var4;
                z15 = z16;
                q3Var2 = q3Var3;
                oiVar2 = oiVar3;
                jVar3 = jVar4;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var3 = a0Var2;
                z15 = z13;
                q3Var2 = q3VarU;
                oiVar2 = oiVarO;
                jVar3 = jVar2;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.wh
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ei.C(z10, function1, a0Var3, z15, q3Var2, oiVar2, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 12582912;
        i18 = i12;
        if ((i12 & 4793491) != 4793490) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c0VarR.h(z14, i18 & 1)) {
            c0VarR.l0();
            if ((i10 & 1) != 0) {
                if (i20 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if (i13 != 0) {
                    z13 = true;
                }
                if ((i11 & 16) != 0) {
                    i18 &= -57345;
                    q3VarU = kh.f30051a.u(c0VarR, 6);
                }
                if ((i11 & 32) != 0) {
                    i19 = i18 & (-458753);
                    oiVarO = kh.f30051a.o(c0VarR, 6);
                } else {
                    i19 = i18;
                }
                if (i15 != 0) {
                    jVar4 = null;
                    z16 = z13;
                    q3Var3 = q3VarU;
                    oiVar3 = oiVarO;
                } else {
                    z16 = z13;
                    oiVar3 = oiVarO;
                    jVar4 = jVar2;
                    q3Var3 = q3VarU;
                }
            } else {
                if (i20 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if (i13 != 0) {
                    z13 = true;
                }
                if ((i11 & 16) != 0) {
                    i18 &= -57345;
                    q3VarU = kh.f30051a.u(c0VarR, 6);
                }
                if ((i11 & 32) != 0) {
                    i19 = i18 & (-458753);
                    oiVarO = kh.f30051a.o(c0VarR, 6);
                } else {
                    i19 = i18;
                }
                if (i15 != 0) {
                    jVar4 = null;
                    z16 = z13;
                    q3Var3 = q3VarU;
                    oiVar3 = oiVarO;
                } else {
                    z16 = z13;
                    oiVar3 = oiVarO;
                    jVar4 = jVar2;
                    q3Var3 = q3VarU;
                }
            }
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-436409269, i19, -1, "androidx.compose.material3.FilledTonalIconToggleButton (IconButton.kt:554)");
            }
            objI0 = c0VarR.i0();
            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new Function1() { // from class: androidx.compose.material3.vh
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ei.B((androidx.compose.ui.semantics.e0) obj);
                    }
                };
                c0VarR.Y(objI0);
            }
            int i2110 = i19 << 3;
            c0Var2 = c0VarR;
            X(z12, function3, androidx.compose.ui.semantics.t.f(a0Var4, false, (Function1) objI0, 1, null), z16, q3Var3, oiVar3, null, jVar4, function2, c0Var2, (i19 & 14) | 1572864 | (i19 & com.planner5d.library.engine.input.f.b.B) | (i19 & 7168) | (57344 & i19) | (458752 & i19) | (29360128 & i2110) | (i2110 & 234881024));
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            a0Var3 = a0Var4;
            z15 = z16;
            q3Var2 = q3Var3;
            oiVar2 = oiVar3;
            jVar3 = jVar4;
        } else {
            c0Var2 = c0VarR;
            c0Var2.u();
            a0Var3 = a0Var2;
            z15 = z13;
            q3Var2 = q3VarU;
            oiVar2 = oiVarO;
            jVar3 = jVar2;
        }
        s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.wh
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ei.C(z10, function1, a0Var3, z15, q3Var2, oiVar2, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit B(androidx.compose.ui.semantics.e0 e0Var) {
        androidx.compose.ui.semantics.b0.K1(e0Var, androidx.compose.ui.semantics.j.f41124b.c());
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit C(boolean z10, Function1 function1, androidx.compose.ui.a0 a0Var, boolean z11, androidx.compose.ui.graphics.q3 q3Var, oi oiVar, androidx.compose.foundation.interaction.j jVar, Function2 function2, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        A(z10, function1, a0Var, z11, q3Var, oiVar, jVar, function2, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0113  */
    /* JADX WARN: Code duplicated, block: B:104:0x011a  */
    /* JADX WARN: Code duplicated, block: B:106:0x0126  */
    /* JADX WARN: Code duplicated, block: B:109:0x012c  */
    /* JADX WARN: Code duplicated, block: B:110:0x0136  */
    /* JADX WARN: Code duplicated, block: B:113:0x0141  */
    /* JADX WARN: Code duplicated, block: B:116:0x0171  */
    /* JADX WARN: Code duplicated, block: B:119:0x017c  */
    /* JADX WARN: Code duplicated, block: B:122:0x018f  */
    /* JADX WARN: Code duplicated, block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0045  */
    /* JADX WARN: Code duplicated, block: B:28:0x004a  */
    /* JADX WARN: Code duplicated, block: B:30:0x004e  */
    /* JADX WARN: Code duplicated, block: B:32:0x0058  */
    /* JADX WARN: Code duplicated, block: B:33:0x005b  */
    /* JADX WARN: Code duplicated, block: B:37:0x0062  */
    /* JADX WARN: Code duplicated, block: B:39:0x0066  */
    /* JADX WARN: Code duplicated, block: B:41:0x006e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0071  */
    /* JADX WARN: Code duplicated, block: B:45:0x0079  */
    /* JADX WARN: Code duplicated, block: B:48:0x007f  */
    /* JADX WARN: Code duplicated, block: B:50:0x0084  */
    /* JADX WARN: Code duplicated, block: B:52:0x0088  */
    /* JADX WARN: Code duplicated, block: B:54:0x0090  */
    /* JADX WARN: Code duplicated, block: B:55:0x0093  */
    /* JADX WARN: Code duplicated, block: B:59:0x009b  */
    /* JADX WARN: Code duplicated, block: B:61:0x009f  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:64:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:71:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:75:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:76:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:80:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:81:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:86:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:97:0x010a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:98:0x010c  */
    /* JADX WARN: Code duplicated, block: B:99:0x010f  */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void D(@NotNull final Function0<Unit> function0, @Nullable androidx.compose.ui.a0 a0Var, boolean z10, @Nullable jh jhVar, @Nullable androidx.compose.foundation.interaction.j jVar, @Nullable androidx.compose.ui.graphics.q3 q3Var, @NotNull final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        Function0<Unit> function1;
        int i12;
        androidx.compose.ui.a0 a0Var2;
        int i13;
        boolean z11;
        int i14;
        jh jhVarX;
        int i15;
        androidx.compose.foundation.interaction.j jVar2;
        int i16;
        androidx.compose.ui.graphics.q3 q3VarW;
        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function3;
        int i17;
        boolean z12;
        androidx.compose.runtime.c0 c0Var2;
        final androidx.compose.ui.a0 a0Var3;
        final boolean z13;
        final jh jhVar2;
        final androidx.compose.foundation.interaction.j jVar3;
        final androidx.compose.ui.graphics.q3 q3Var2;
        androidx.compose.runtime.s5 s5VarT;
        androidx.compose.ui.a0 a0Var4;
        androidx.compose.ui.a0 a0Var5;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1413012038);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
            function1 = function0;
        } else {
            function1 = function0;
            if ((i10 & 6) == 0) {
                i12 = (c0VarR.k0(function1) ? 4 : 2) | i10;
            } else {
                i12 = i10;
            }
        }
        int i18 = i11 & 2;
        if (i18 == 0) {
            if ((i10 & 48) == 0) {
                a0Var2 = a0Var;
                i12 |= c0VarR.D(a0Var2) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                    z11 = z10;
                    if (c0VarR.G(z11)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                if ((i10 & 3072) == 0) {
                    if ((i11 & 8) == 0) {
                        jhVarX = jhVar;
                        int i19 = c0VarR.D(jhVarX) ? 2048 : 1024;
                        i12 |= i19;
                    } else {
                        jhVarX = jhVar;
                    }
                    i12 |= i19;
                } else {
                    jhVarX = jhVar;
                }
                i15 = i11 & 16;
                if (i15 != 0) {
                    if ((i10 & 24576) == 0) {
                        jVar2 = jVar;
                        if (c0VarR.D(jVar2)) {
                            i16 = 16384;
                        } else {
                            i16 = 8192;
                        }
                        i12 |= i16;
                    }
                    if ((196608 & i10) == 0) {
                        if ((i11 & 32) == 0) {
                            q3VarW = q3Var;
                            int i20 = c0VarR.D(q3VarW) ? 131072 : 65536;
                            i12 |= i20;
                        } else {
                            q3VarW = q3Var;
                        }
                        i12 |= i20;
                    } else {
                        q3VarW = q3Var;
                    }
                    if ((i11 & 64) != 0) {
                        i12 |= 1572864;
                        function3 = function2;
                    } else {
                        function3 = function2;
                        if ((i10 & 1572864) == 0) {
                            if (c0VarR.k0(function3)) {
                                i17 = 1048576;
                            } else {
                                i17 = 524288;
                            }
                            i12 |= i17;
                        }
                    }
                    if ((599187 & i12) != 599186) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (c0VarR.h(z12, i12 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0 || c0VarR.y()) {
                            if (i18 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            }
                            if ((i11 & 8) != 0) {
                                i12 &= -7169;
                                jhVarX = kh.f30051a.x(c0VarR, 6);
                            }
                            if (i15 != 0) {
                                jVar2 = null;
                            }
                            if ((i11 & 32) != 0) {
                                i12 &= -458753;
                                a0Var5 = a0Var4;
                                q3VarW = kh.f30051a.w(c0VarR, 6);
                            } else {
                                a0Var5 = a0Var4;
                            }
                        } else {
                            c0VarR.u();
                            if ((i11 & 8) != 0) {
                                i12 &= -7169;
                            }
                            if ((i11 & 32) != 0) {
                                i12 &= -458753;
                            }
                            a0Var5 = a0Var2;
                        }
                        jh jhVar3 = jhVarX;
                        androidx.compose.foundation.interaction.j jVar4 = jVar2;
                        boolean z14 = z11;
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(1413012038, i12, -1, "androidx.compose.material3.IconButton (IconButton.kt:151)");
                        }
                        int i21 = i12 << 3;
                        c0Var2 = c0VarR;
                        H(a0Var5, function1, z14, q3VarW, jhVar3, jVar4, function3, c0Var2, ((i12 >> 3) & 14) | (i21 & com.planner5d.library.engine.input.f.b.B) | (i12 & 896) | ((i12 >> 6) & 7168) | (57344 & i21) | (i21 & 458752) | (i12 & 3670016));
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var5;
                        z13 = z14;
                        jhVar2 = jhVar3;
                        jVar3 = jVar4;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        a0Var3 = a0Var2;
                        z13 = z11;
                        jhVar2 = jhVarX;
                        jVar3 = jVar2;
                    }
                    q3Var2 = q3VarW;
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.zh
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return ei.G(function0, a0Var3, z13, jhVar2, jVar3, q3Var2, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 24576;
                jVar2 = jVar;
                if ((196608 & i10) == 0) {
                    if ((i11 & 32) == 0) {
                        q3VarW = q3Var;
                        if (c0VarR.D(q3VarW)) {
                        }
                        i12 |= i20;
                    } else {
                        q3VarW = q3Var;
                    }
                    i12 |= i20;
                } else {
                    q3VarW = q3Var;
                }
                if ((i11 & 64) != 0) {
                    i12 |= 1572864;
                    function3 = function2;
                } else {
                    function3 = function2;
                    if ((i10 & 1572864) == 0) {
                        if (c0VarR.k0(function3)) {
                            i17 = 1048576;
                        } else {
                            i17 = 524288;
                        }
                        i12 |= i17;
                    }
                }
                if ((599187 & i12) != 599186) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i18 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            jhVarX = kh.f30051a.x(c0VarR, 6);
                        }
                        if (i15 != 0) {
                            jVar2 = null;
                        }
                        if ((i11 & 32) != 0) {
                            i12 &= -458753;
                            a0Var5 = a0Var4;
                            q3VarW = kh.f30051a.w(c0VarR, 6);
                        } else {
                            a0Var5 = a0Var4;
                        }
                    } else {
                        if (i18 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            jhVarX = kh.f30051a.x(c0VarR, 6);
                        }
                        if (i15 != 0) {
                            jVar2 = null;
                        }
                        if ((i11 & 32) != 0) {
                            i12 &= -458753;
                            a0Var5 = a0Var4;
                            q3VarW = kh.f30051a.w(c0VarR, 6);
                        } else {
                            a0Var5 = a0Var4;
                        }
                    }
                    jh jhVar4 = jhVarX;
                    androidx.compose.foundation.interaction.j jVar5 = jVar2;
                    boolean z15 = z11;
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1413012038, i12, -1, "androidx.compose.material3.IconButton (IconButton.kt:151)");
                    }
                    int i22 = i12 << 3;
                    c0Var2 = c0VarR;
                    H(a0Var5, function1, z15, q3VarW, jhVar4, jVar5, function3, c0Var2, ((i12 >> 3) & 14) | (i22 & com.planner5d.library.engine.input.f.b.B) | (i12 & 896) | ((i12 >> 6) & 7168) | (57344 & i22) | (i22 & 458752) | (i12 & 3670016));
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var5;
                    z13 = z15;
                    jhVar2 = jhVar4;
                    jVar3 = jVar5;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var3 = a0Var2;
                    z13 = z11;
                    jhVar2 = jhVarX;
                    jVar3 = jVar2;
                }
                q3Var2 = q3VarW;
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.zh
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ei.G(function0, a0Var3, z13, jhVar2, jVar3, q3Var2, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= androidx.media3.exoplayer.a5.S0;
            z11 = z10;
            if ((i10 & 3072) == 0) {
                if ((i11 & 8) == 0) {
                    jhVarX = jhVar;
                    if (c0VarR.D(jhVarX)) {
                    }
                    i12 |= i19;
                } else {
                    jhVarX = jhVar;
                }
                i12 |= i19;
            } else {
                jhVarX = jhVar;
            }
            i15 = i11 & 16;
            if (i15 != 0) {
                if ((i10 & 24576) == 0) {
                    jVar2 = jVar;
                    if (c0VarR.D(jVar2)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i12 |= i16;
                }
                if ((196608 & i10) == 0) {
                    if ((i11 & 32) == 0) {
                        q3VarW = q3Var;
                        if (c0VarR.D(q3VarW)) {
                        }
                        i12 |= i20;
                    } else {
                        q3VarW = q3Var;
                    }
                    i12 |= i20;
                } else {
                    q3VarW = q3Var;
                }
                if ((i11 & 64) != 0) {
                    i12 |= 1572864;
                    function3 = function2;
                } else {
                    function3 = function2;
                    if ((i10 & 1572864) == 0) {
                        if (c0VarR.k0(function3)) {
                            i17 = 1048576;
                        } else {
                            i17 = 524288;
                        }
                        i12 |= i17;
                    }
                }
                if ((599187 & i12) != 599186) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i18 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            jhVarX = kh.f30051a.x(c0VarR, 6);
                        }
                        if (i15 != 0) {
                            jVar2 = null;
                        }
                        if ((i11 & 32) != 0) {
                            i12 &= -458753;
                            a0Var5 = a0Var4;
                            q3VarW = kh.f30051a.w(c0VarR, 6);
                        } else {
                            a0Var5 = a0Var4;
                        }
                    } else {
                        if (i18 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            jhVarX = kh.f30051a.x(c0VarR, 6);
                        }
                        if (i15 != 0) {
                            jVar2 = null;
                        }
                        if ((i11 & 32) != 0) {
                            i12 &= -458753;
                            a0Var5 = a0Var4;
                            q3VarW = kh.f30051a.w(c0VarR, 6);
                        } else {
                            a0Var5 = a0Var4;
                        }
                    }
                    jh jhVar5 = jhVarX;
                    androidx.compose.foundation.interaction.j jVar6 = jVar2;
                    boolean z16 = z11;
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1413012038, i12, -1, "androidx.compose.material3.IconButton (IconButton.kt:151)");
                    }
                    int i23 = i12 << 3;
                    c0Var2 = c0VarR;
                    H(a0Var5, function1, z16, q3VarW, jhVar5, jVar6, function3, c0Var2, ((i12 >> 3) & 14) | (i23 & com.planner5d.library.engine.input.f.b.B) | (i12 & 896) | ((i12 >> 6) & 7168) | (57344 & i23) | (i23 & 458752) | (i12 & 3670016));
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var5;
                    z13 = z16;
                    jhVar2 = jhVar5;
                    jVar3 = jVar6;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var3 = a0Var2;
                    z13 = z11;
                    jhVar2 = jhVarX;
                    jVar3 = jVar2;
                }
                q3Var2 = q3VarW;
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.zh
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ei.G(function0, a0Var3, z13, jhVar2, jVar3, q3Var2, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 24576;
            jVar2 = jVar;
            if ((196608 & i10) == 0) {
                if ((i11 & 32) == 0) {
                    q3VarW = q3Var;
                    if (c0VarR.D(q3VarW)) {
                    }
                    i12 |= i20;
                } else {
                    q3VarW = q3Var;
                }
                i12 |= i20;
            } else {
                q3VarW = q3Var;
            }
            if ((i11 & 64) != 0) {
                i12 |= 1572864;
                function3 = function2;
            } else {
                function3 = function2;
                if ((i10 & 1572864) == 0) {
                    if (c0VarR.k0(function3)) {
                        i17 = 1048576;
                    } else {
                        i17 = 524288;
                    }
                    i12 |= i17;
                }
            }
            if ((599187 & i12) != 599186) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        jhVarX = kh.f30051a.x(c0VarR, 6);
                    }
                    if (i15 != 0) {
                        jVar2 = null;
                    }
                    if ((i11 & 32) != 0) {
                        i12 &= -458753;
                        a0Var5 = a0Var4;
                        q3VarW = kh.f30051a.w(c0VarR, 6);
                    } else {
                        a0Var5 = a0Var4;
                    }
                } else {
                    if (i18 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        jhVarX = kh.f30051a.x(c0VarR, 6);
                    }
                    if (i15 != 0) {
                        jVar2 = null;
                    }
                    if ((i11 & 32) != 0) {
                        i12 &= -458753;
                        a0Var5 = a0Var4;
                        q3VarW = kh.f30051a.w(c0VarR, 6);
                    } else {
                        a0Var5 = a0Var4;
                    }
                }
                jh jhVar6 = jhVarX;
                androidx.compose.foundation.interaction.j jVar7 = jVar2;
                boolean z17 = z11;
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1413012038, i12, -1, "androidx.compose.material3.IconButton (IconButton.kt:151)");
                }
                int i24 = i12 << 3;
                c0Var2 = c0VarR;
                H(a0Var5, function1, z17, q3VarW, jhVar6, jVar7, function3, c0Var2, ((i12 >> 3) & 14) | (i24 & com.planner5d.library.engine.input.f.b.B) | (i12 & 896) | ((i12 >> 6) & 7168) | (57344 & i24) | (i24 & 458752) | (i12 & 3670016));
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var5;
                z13 = z17;
                jhVar2 = jhVar6;
                jVar3 = jVar7;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var3 = a0Var2;
                z13 = z11;
                jhVar2 = jhVarX;
                jVar3 = jVar2;
            }
            q3Var2 = q3VarW;
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.zh
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ei.G(function0, a0Var3, z13, jhVar2, jVar3, q3Var2, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 48;
        a0Var2 = a0Var;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                z11 = z10;
                if (c0VarR.G(z11)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            if ((i10 & 3072) == 0) {
                if ((i11 & 8) == 0) {
                    jhVarX = jhVar;
                    if (c0VarR.D(jhVarX)) {
                    }
                    i12 |= i19;
                } else {
                    jhVarX = jhVar;
                }
                i12 |= i19;
            } else {
                jhVarX = jhVar;
            }
            i15 = i11 & 16;
            if (i15 != 0) {
                if ((i10 & 24576) == 0) {
                    jVar2 = jVar;
                    if (c0VarR.D(jVar2)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i12 |= i16;
                }
                if ((196608 & i10) == 0) {
                    if ((i11 & 32) == 0) {
                        q3VarW = q3Var;
                        if (c0VarR.D(q3VarW)) {
                        }
                        i12 |= i20;
                    } else {
                        q3VarW = q3Var;
                    }
                    i12 |= i20;
                } else {
                    q3VarW = q3Var;
                }
                if ((i11 & 64) != 0) {
                    i12 |= 1572864;
                    function3 = function2;
                } else {
                    function3 = function2;
                    if ((i10 & 1572864) == 0) {
                        if (c0VarR.k0(function3)) {
                            i17 = 1048576;
                        } else {
                            i17 = 524288;
                        }
                        i12 |= i17;
                    }
                }
                if ((599187 & i12) != 599186) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i18 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            jhVarX = kh.f30051a.x(c0VarR, 6);
                        }
                        if (i15 != 0) {
                            jVar2 = null;
                        }
                        if ((i11 & 32) != 0) {
                            i12 &= -458753;
                            a0Var5 = a0Var4;
                            q3VarW = kh.f30051a.w(c0VarR, 6);
                        } else {
                            a0Var5 = a0Var4;
                        }
                    } else {
                        if (i18 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            jhVarX = kh.f30051a.x(c0VarR, 6);
                        }
                        if (i15 != 0) {
                            jVar2 = null;
                        }
                        if ((i11 & 32) != 0) {
                            i12 &= -458753;
                            a0Var5 = a0Var4;
                            q3VarW = kh.f30051a.w(c0VarR, 6);
                        } else {
                            a0Var5 = a0Var4;
                        }
                    }
                    jh jhVar7 = jhVarX;
                    androidx.compose.foundation.interaction.j jVar8 = jVar2;
                    boolean z18 = z11;
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1413012038, i12, -1, "androidx.compose.material3.IconButton (IconButton.kt:151)");
                    }
                    int i25 = i12 << 3;
                    c0Var2 = c0VarR;
                    H(a0Var5, function1, z18, q3VarW, jhVar7, jVar8, function3, c0Var2, ((i12 >> 3) & 14) | (i25 & com.planner5d.library.engine.input.f.b.B) | (i12 & 896) | ((i12 >> 6) & 7168) | (57344 & i25) | (i25 & 458752) | (i12 & 3670016));
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var5;
                    z13 = z18;
                    jhVar2 = jhVar7;
                    jVar3 = jVar8;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var3 = a0Var2;
                    z13 = z11;
                    jhVar2 = jhVarX;
                    jVar3 = jVar2;
                }
                q3Var2 = q3VarW;
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.zh
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ei.G(function0, a0Var3, z13, jhVar2, jVar3, q3Var2, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 24576;
            jVar2 = jVar;
            if ((196608 & i10) == 0) {
                if ((i11 & 32) == 0) {
                    q3VarW = q3Var;
                    if (c0VarR.D(q3VarW)) {
                    }
                    i12 |= i20;
                } else {
                    q3VarW = q3Var;
                }
                i12 |= i20;
            } else {
                q3VarW = q3Var;
            }
            if ((i11 & 64) != 0) {
                i12 |= 1572864;
                function3 = function2;
            } else {
                function3 = function2;
                if ((i10 & 1572864) == 0) {
                    if (c0VarR.k0(function3)) {
                        i17 = 1048576;
                    } else {
                        i17 = 524288;
                    }
                    i12 |= i17;
                }
            }
            if ((599187 & i12) != 599186) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        jhVarX = kh.f30051a.x(c0VarR, 6);
                    }
                    if (i15 != 0) {
                        jVar2 = null;
                    }
                    if ((i11 & 32) != 0) {
                        i12 &= -458753;
                        a0Var5 = a0Var4;
                        q3VarW = kh.f30051a.w(c0VarR, 6);
                    } else {
                        a0Var5 = a0Var4;
                    }
                } else {
                    if (i18 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        jhVarX = kh.f30051a.x(c0VarR, 6);
                    }
                    if (i15 != 0) {
                        jVar2 = null;
                    }
                    if ((i11 & 32) != 0) {
                        i12 &= -458753;
                        a0Var5 = a0Var4;
                        q3VarW = kh.f30051a.w(c0VarR, 6);
                    } else {
                        a0Var5 = a0Var4;
                    }
                }
                jh jhVar8 = jhVarX;
                androidx.compose.foundation.interaction.j jVar9 = jVar2;
                boolean z19 = z11;
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1413012038, i12, -1, "androidx.compose.material3.IconButton (IconButton.kt:151)");
                }
                int i26 = i12 << 3;
                c0Var2 = c0VarR;
                H(a0Var5, function1, z19, q3VarW, jhVar8, jVar9, function3, c0Var2, ((i12 >> 3) & 14) | (i26 & com.planner5d.library.engine.input.f.b.B) | (i12 & 896) | ((i12 >> 6) & 7168) | (57344 & i26) | (i26 & 458752) | (i12 & 3670016));
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var5;
                z13 = z19;
                jhVar2 = jhVar8;
                jVar3 = jVar9;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var3 = a0Var2;
                z13 = z11;
                jhVar2 = jhVarX;
                jVar3 = jVar2;
            }
            q3Var2 = q3VarW;
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.zh
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ei.G(function0, a0Var3, z13, jhVar2, jVar3, q3Var2, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= androidx.media3.exoplayer.a5.S0;
        z11 = z10;
        if ((i10 & 3072) == 0) {
            if ((i11 & 8) == 0) {
                jhVarX = jhVar;
                if (c0VarR.D(jhVarX)) {
                }
                i12 |= i19;
            } else {
                jhVarX = jhVar;
            }
            i12 |= i19;
        } else {
            jhVarX = jhVar;
        }
        i15 = i11 & 16;
        if (i15 != 0) {
            if ((i10 & 24576) == 0) {
                jVar2 = jVar;
                if (c0VarR.D(jVar2)) {
                    i16 = 16384;
                } else {
                    i16 = 8192;
                }
                i12 |= i16;
            }
            if ((196608 & i10) == 0) {
                if ((i11 & 32) == 0) {
                    q3VarW = q3Var;
                    if (c0VarR.D(q3VarW)) {
                    }
                    i12 |= i20;
                } else {
                    q3VarW = q3Var;
                }
                i12 |= i20;
            } else {
                q3VarW = q3Var;
            }
            if ((i11 & 64) != 0) {
                i12 |= 1572864;
                function3 = function2;
            } else {
                function3 = function2;
                if ((i10 & 1572864) == 0) {
                    if (c0VarR.k0(function3)) {
                        i17 = 1048576;
                    } else {
                        i17 = 524288;
                    }
                    i12 |= i17;
                }
            }
            if ((599187 & i12) != 599186) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        jhVarX = kh.f30051a.x(c0VarR, 6);
                    }
                    if (i15 != 0) {
                        jVar2 = null;
                    }
                    if ((i11 & 32) != 0) {
                        i12 &= -458753;
                        a0Var5 = a0Var4;
                        q3VarW = kh.f30051a.w(c0VarR, 6);
                    } else {
                        a0Var5 = a0Var4;
                    }
                } else {
                    if (i18 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        jhVarX = kh.f30051a.x(c0VarR, 6);
                    }
                    if (i15 != 0) {
                        jVar2 = null;
                    }
                    if ((i11 & 32) != 0) {
                        i12 &= -458753;
                        a0Var5 = a0Var4;
                        q3VarW = kh.f30051a.w(c0VarR, 6);
                    } else {
                        a0Var5 = a0Var4;
                    }
                }
                jh jhVar9 = jhVarX;
                androidx.compose.foundation.interaction.j jVar10 = jVar2;
                boolean z110 = z11;
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1413012038, i12, -1, "androidx.compose.material3.IconButton (IconButton.kt:151)");
                }
                int i27 = i12 << 3;
                c0Var2 = c0VarR;
                H(a0Var5, function1, z110, q3VarW, jhVar9, jVar10, function3, c0Var2, ((i12 >> 3) & 14) | (i27 & com.planner5d.library.engine.input.f.b.B) | (i12 & 896) | ((i12 >> 6) & 7168) | (57344 & i27) | (i27 & 458752) | (i12 & 3670016));
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var5;
                z13 = z110;
                jhVar2 = jhVar9;
                jVar3 = jVar10;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var3 = a0Var2;
                z13 = z11;
                jhVar2 = jhVarX;
                jVar3 = jVar2;
            }
            q3Var2 = q3VarW;
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.zh
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ei.G(function0, a0Var3, z13, jhVar2, jVar3, q3Var2, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 24576;
        jVar2 = jVar;
        if ((196608 & i10) == 0) {
            if ((i11 & 32) == 0) {
                q3VarW = q3Var;
                if (c0VarR.D(q3VarW)) {
                }
                i12 |= i20;
            } else {
                q3VarW = q3Var;
            }
            i12 |= i20;
        } else {
            q3VarW = q3Var;
        }
        if ((i11 & 64) != 0) {
            i12 |= 1572864;
            function3 = function2;
        } else {
            function3 = function2;
            if ((i10 & 1572864) == 0) {
                if (c0VarR.k0(function3)) {
                    i17 = 1048576;
                } else {
                    i17 = 524288;
                }
                i12 |= i17;
            }
        }
        if ((599187 & i12) != 599186) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (c0VarR.h(z12, i12 & 1)) {
            c0VarR.l0();
            if ((i10 & 1) != 0) {
                if (i18 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if (i13 != 0) {
                    z11 = true;
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    jhVarX = kh.f30051a.x(c0VarR, 6);
                }
                if (i15 != 0) {
                    jVar2 = null;
                }
                if ((i11 & 32) != 0) {
                    i12 &= -458753;
                    a0Var5 = a0Var4;
                    q3VarW = kh.f30051a.w(c0VarR, 6);
                } else {
                    a0Var5 = a0Var4;
                }
            } else {
                if (i18 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if (i13 != 0) {
                    z11 = true;
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    jhVarX = kh.f30051a.x(c0VarR, 6);
                }
                if (i15 != 0) {
                    jVar2 = null;
                }
                if ((i11 & 32) != 0) {
                    i12 &= -458753;
                    a0Var5 = a0Var4;
                    q3VarW = kh.f30051a.w(c0VarR, 6);
                } else {
                    a0Var5 = a0Var4;
                }
            }
            jh jhVar10 = jhVarX;
            androidx.compose.foundation.interaction.j jVar11 = jVar2;
            boolean z111 = z11;
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1413012038, i12, -1, "androidx.compose.material3.IconButton (IconButton.kt:151)");
            }
            int i28 = i12 << 3;
            c0Var2 = c0VarR;
            H(a0Var5, function1, z111, q3VarW, jhVar10, jVar11, function3, c0Var2, ((i12 >> 3) & 14) | (i28 & com.planner5d.library.engine.input.f.b.B) | (i12 & 896) | ((i12 >> 6) & 7168) | (57344 & i28) | (i28 & 458752) | (i12 & 3670016));
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            a0Var3 = a0Var5;
            z13 = z111;
            jhVar2 = jhVar10;
            jVar3 = jVar11;
        } else {
            c0Var2 = c0VarR;
            c0Var2.u();
            a0Var3 = a0Var2;
            z13 = z11;
            jhVar2 = jhVarX;
            jVar3 = jVar2;
        }
        q3Var2 = q3VarW;
        s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.zh
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ei.G(function0, a0Var3, z13, jhVar2, jVar3, q3Var2, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x013a  */
    /* JADX WARN: Code duplicated, block: B:103:0x0143  */
    /* JADX WARN: Code duplicated, block: B:106:0x0152  */
    /* JADX WARN: Code duplicated, block: B:108:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:28:0x004e  */
    /* JADX WARN: Code duplicated, block: B:30:0x0052  */
    /* JADX WARN: Code duplicated, block: B:32:0x005a  */
    /* JADX WARN: Code duplicated, block: B:33:0x005d  */
    /* JADX WARN: Code duplicated, block: B:37:0x0064  */
    /* JADX WARN: Code duplicated, block: B:39:0x0068  */
    /* JADX WARN: Code duplicated, block: B:41:0x0070  */
    /* JADX WARN: Code duplicated, block: B:42:0x0073  */
    /* JADX WARN: Code duplicated, block: B:45:0x0079  */
    /* JADX WARN: Code duplicated, block: B:48:0x007f  */
    /* JADX WARN: Code duplicated, block: B:50:0x0084  */
    /* JADX WARN: Code duplicated, block: B:52:0x0088  */
    /* JADX WARN: Code duplicated, block: B:54:0x0090  */
    /* JADX WARN: Code duplicated, block: B:55:0x0093  */
    /* JADX WARN: Code duplicated, block: B:59:0x009c  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:65:0x00af  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:83:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:84:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:87:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:90:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:91:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:93:0x0101  */
    /* JADX WARN: Code duplicated, block: B:95:0x0106  */
    /* JADX WARN: Code duplicated, block: B:98:0x0115  */
    @androidx.compose.runtime.o
    @kotlin.l(level = kotlin.n.HIDDEN, message = "Use overload with `shape`", replaceWith = @kotlin.b1(expression = "IconButton(onClick, modifier, enabled, colors, interactionSource, shape, content)", imports = {}))
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final /* synthetic */ void E(final Function0 function0, androidx.compose.ui.a0 a0Var, boolean z10, jh jhVar, androidx.compose.foundation.interaction.j jVar, final Function2 function2, androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        Function0 function1;
        int i12;
        androidx.compose.ui.a0 a0Var2;
        int i13;
        boolean z11;
        int i14;
        jh jhVar2;
        int i15;
        androidx.compose.foundation.interaction.j jVar2;
        int i16;
        Function2 function3;
        int i17;
        boolean z12;
        final androidx.compose.ui.a0 a0Var3;
        final boolean z13;
        final jh jhVar3;
        final androidx.compose.foundation.interaction.j jVar3;
        androidx.compose.runtime.s5 s5VarT;
        androidx.compose.ui.a0 a0Var4;
        jh jhVarX;
        androidx.compose.foundation.interaction.j jVar4;
        boolean z14;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-2096213317);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
            function1 = function0;
        } else {
            function1 = function0;
            if ((i10 & 6) == 0) {
                i12 = (c0VarR.k0(function1) ? 4 : 2) | i10;
            } else {
                i12 = i10;
            }
        }
        int i18 = i11 & 2;
        if (i18 == 0) {
            if ((i10 & 48) == 0) {
                a0Var2 = a0Var;
                i12 |= c0VarR.D(a0Var2) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                    z11 = z10;
                    if (c0VarR.G(z11)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                if ((i10 & 3072) == 0) {
                    if ((i11 & 8) == 0) {
                        jhVar2 = jhVar;
                        int i19 = c0VarR.D(jhVar2) ? 2048 : 1024;
                        i12 |= i19;
                    } else {
                        jhVar2 = jhVar;
                    }
                    i12 |= i19;
                } else {
                    jhVar2 = jhVar;
                }
                i15 = i11 & 16;
                if (i15 != 0) {
                    if ((i10 & 24576) == 0) {
                        jVar2 = jVar;
                        if (c0VarR.D(jVar2)) {
                            i16 = 16384;
                        } else {
                            i16 = 8192;
                        }
                        i12 |= i16;
                    }
                    if ((i11 & 32) != 0) {
                        i12 |= androidx.profileinstaller.n.c.f73814m;
                        function3 = function2;
                    } else {
                        function3 = function2;
                        if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                            if (c0VarR.k0(function3)) {
                                i17 = 131072;
                            } else {
                                i17 = 65536;
                            }
                            i12 |= i17;
                        }
                    }
                    if ((74899 & i12) != 74898) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (c0VarR.h(z12, i12 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0 || c0VarR.y()) {
                            if (i18 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            boolean z15 = i13 == 0 ? z11 : true;
                            if ((i11 & 8) != 0) {
                                jhVarX = kh.f30051a.x(c0VarR, 6);
                                i12 &= -7169;
                            } else {
                                jhVarX = jhVar2;
                            }
                            if (i15 != 0) {
                                jVar4 = null;
                            } else {
                                jVar4 = jVar2;
                            }
                            z14 = z15;
                        } else {
                            c0VarR.u();
                            if ((i11 & 8) != 0) {
                                i12 &= -7169;
                            }
                            a0Var4 = a0Var2;
                            jhVarX = jhVar2;
                            jVar4 = jVar2;
                            z14 = z11;
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-2096213317, i12, -1, "androidx.compose.material3.IconButton (IconButton.kt:93)");
                        }
                        androidx.compose.foundation.interaction.j jVar5 = jVar4;
                        D(function1, a0Var4, z14, jhVarX, jVar5, kh.f30051a.w(c0VarR, 6), function3, c0VarR, (65534 & i12) | ((i12 << 3) & 3670016), 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var4;
                        z13 = z14;
                        jhVar3 = jhVarX;
                        jVar3 = jVar5;
                    } else {
                        c0VarR.u();
                        a0Var3 = a0Var2;
                        z13 = z11;
                        jhVar3 = jhVar2;
                        jVar3 = jVar2;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.di
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return ei.F(function0, a0Var3, z13, jhVar3, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 24576;
                jVar2 = jVar;
                if ((i11 & 32) != 0) {
                    i12 |= androidx.profileinstaller.n.c.f73814m;
                    function3 = function2;
                } else {
                    function3 = function2;
                    if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        if (c0VarR.k0(function3)) {
                            i17 = 131072;
                        } else {
                            i17 = 65536;
                        }
                        i12 |= i17;
                    }
                }
                if ((74899 & i12) != 74898) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i18 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 == 0) {
                        }
                        if ((i11 & 8) != 0) {
                            jhVarX = kh.f30051a.x(c0VarR, 6);
                            i12 &= -7169;
                        } else {
                            jhVarX = jhVar2;
                        }
                        if (i15 != 0) {
                            jVar4 = null;
                        } else {
                            jVar4 = jVar2;
                        }
                        z14 = z15;
                    } else {
                        if (i18 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 == 0) {
                        }
                        if ((i11 & 8) != 0) {
                            jhVarX = kh.f30051a.x(c0VarR, 6);
                            i12 &= -7169;
                        } else {
                            jhVarX = jhVar2;
                        }
                        if (i15 != 0) {
                            jVar4 = null;
                        } else {
                            jVar4 = jVar2;
                        }
                        z14 = z15;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-2096213317, i12, -1, "androidx.compose.material3.IconButton (IconButton.kt:93)");
                    }
                    androidx.compose.foundation.interaction.j jVar6 = jVar4;
                    D(function1, a0Var4, z14, jhVarX, jVar6, kh.f30051a.w(c0VarR, 6), function3, c0VarR, (65534 & i12) | ((i12 << 3) & 3670016), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var4;
                    z13 = z14;
                    jhVar3 = jhVarX;
                    jVar3 = jVar6;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    z13 = z11;
                    jhVar3 = jhVar2;
                    jVar3 = jVar2;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.di
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ei.F(function0, a0Var3, z13, jhVar3, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= androidx.media3.exoplayer.a5.S0;
            z11 = z10;
            if ((i10 & 3072) == 0) {
                if ((i11 & 8) == 0) {
                    jhVar2 = jhVar;
                    if (c0VarR.D(jhVar2)) {
                    }
                    i12 |= i19;
                } else {
                    jhVar2 = jhVar;
                }
                i12 |= i19;
            } else {
                jhVar2 = jhVar;
            }
            i15 = i11 & 16;
            if (i15 != 0) {
                if ((i10 & 24576) == 0) {
                    jVar2 = jVar;
                    if (c0VarR.D(jVar2)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i12 |= i16;
                }
                if ((i11 & 32) != 0) {
                    i12 |= androidx.profileinstaller.n.c.f73814m;
                    function3 = function2;
                } else {
                    function3 = function2;
                    if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        if (c0VarR.k0(function3)) {
                            i17 = 131072;
                        } else {
                            i17 = 65536;
                        }
                        i12 |= i17;
                    }
                }
                if ((74899 & i12) != 74898) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i18 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 == 0) {
                        }
                        if ((i11 & 8) != 0) {
                            jhVarX = kh.f30051a.x(c0VarR, 6);
                            i12 &= -7169;
                        } else {
                            jhVarX = jhVar2;
                        }
                        if (i15 != 0) {
                            jVar4 = null;
                        } else {
                            jVar4 = jVar2;
                        }
                        z14 = z15;
                    } else {
                        if (i18 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 == 0) {
                        }
                        if ((i11 & 8) != 0) {
                            jhVarX = kh.f30051a.x(c0VarR, 6);
                            i12 &= -7169;
                        } else {
                            jhVarX = jhVar2;
                        }
                        if (i15 != 0) {
                            jVar4 = null;
                        } else {
                            jVar4 = jVar2;
                        }
                        z14 = z15;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-2096213317, i12, -1, "androidx.compose.material3.IconButton (IconButton.kt:93)");
                    }
                    androidx.compose.foundation.interaction.j jVar7 = jVar4;
                    D(function1, a0Var4, z14, jhVarX, jVar7, kh.f30051a.w(c0VarR, 6), function3, c0VarR, (65534 & i12) | ((i12 << 3) & 3670016), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var4;
                    z13 = z14;
                    jhVar3 = jhVarX;
                    jVar3 = jVar7;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    z13 = z11;
                    jhVar3 = jhVar2;
                    jVar3 = jVar2;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.di
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ei.F(function0, a0Var3, z13, jhVar3, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 24576;
            jVar2 = jVar;
            if ((i11 & 32) != 0) {
                i12 |= androidx.profileinstaller.n.c.f73814m;
                function3 = function2;
            } else {
                function3 = function2;
                if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    if (c0VarR.k0(function3)) {
                        i17 = 131072;
                    } else {
                        i17 = 65536;
                    }
                    i12 |= i17;
                }
            }
            if ((74899 & i12) != 74898) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 == 0) {
                    }
                    if ((i11 & 8) != 0) {
                        jhVarX = kh.f30051a.x(c0VarR, 6);
                        i12 &= -7169;
                    } else {
                        jhVarX = jhVar2;
                    }
                    if (i15 != 0) {
                        jVar4 = null;
                    } else {
                        jVar4 = jVar2;
                    }
                    z14 = z15;
                } else {
                    if (i18 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 == 0) {
                    }
                    if ((i11 & 8) != 0) {
                        jhVarX = kh.f30051a.x(c0VarR, 6);
                        i12 &= -7169;
                    } else {
                        jhVarX = jhVar2;
                    }
                    if (i15 != 0) {
                        jVar4 = null;
                    } else {
                        jVar4 = jVar2;
                    }
                    z14 = z15;
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-2096213317, i12, -1, "androidx.compose.material3.IconButton (IconButton.kt:93)");
                }
                androidx.compose.foundation.interaction.j jVar8 = jVar4;
                D(function1, a0Var4, z14, jhVarX, jVar8, kh.f30051a.w(c0VarR, 6), function3, c0VarR, (65534 & i12) | ((i12 << 3) & 3670016), 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var4;
                z13 = z14;
                jhVar3 = jhVarX;
                jVar3 = jVar8;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                z13 = z11;
                jhVar3 = jhVar2;
                jVar3 = jVar2;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.di
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ei.F(function0, a0Var3, z13, jhVar3, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 48;
        a0Var2 = a0Var;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                z11 = z10;
                if (c0VarR.G(z11)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            if ((i10 & 3072) == 0) {
                if ((i11 & 8) == 0) {
                    jhVar2 = jhVar;
                    if (c0VarR.D(jhVar2)) {
                    }
                    i12 |= i19;
                } else {
                    jhVar2 = jhVar;
                }
                i12 |= i19;
            } else {
                jhVar2 = jhVar;
            }
            i15 = i11 & 16;
            if (i15 != 0) {
                if ((i10 & 24576) == 0) {
                    jVar2 = jVar;
                    if (c0VarR.D(jVar2)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i12 |= i16;
                }
                if ((i11 & 32) != 0) {
                    i12 |= androidx.profileinstaller.n.c.f73814m;
                    function3 = function2;
                } else {
                    function3 = function2;
                    if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        if (c0VarR.k0(function3)) {
                            i17 = 131072;
                        } else {
                            i17 = 65536;
                        }
                        i12 |= i17;
                    }
                }
                if ((74899 & i12) != 74898) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i18 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 == 0) {
                        }
                        if ((i11 & 8) != 0) {
                            jhVarX = kh.f30051a.x(c0VarR, 6);
                            i12 &= -7169;
                        } else {
                            jhVarX = jhVar2;
                        }
                        if (i15 != 0) {
                            jVar4 = null;
                        } else {
                            jVar4 = jVar2;
                        }
                        z14 = z15;
                    } else {
                        if (i18 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 == 0) {
                        }
                        if ((i11 & 8) != 0) {
                            jhVarX = kh.f30051a.x(c0VarR, 6);
                            i12 &= -7169;
                        } else {
                            jhVarX = jhVar2;
                        }
                        if (i15 != 0) {
                            jVar4 = null;
                        } else {
                            jVar4 = jVar2;
                        }
                        z14 = z15;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-2096213317, i12, -1, "androidx.compose.material3.IconButton (IconButton.kt:93)");
                    }
                    androidx.compose.foundation.interaction.j jVar9 = jVar4;
                    D(function1, a0Var4, z14, jhVarX, jVar9, kh.f30051a.w(c0VarR, 6), function3, c0VarR, (65534 & i12) | ((i12 << 3) & 3670016), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var4;
                    z13 = z14;
                    jhVar3 = jhVarX;
                    jVar3 = jVar9;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    z13 = z11;
                    jhVar3 = jhVar2;
                    jVar3 = jVar2;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.di
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ei.F(function0, a0Var3, z13, jhVar3, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 24576;
            jVar2 = jVar;
            if ((i11 & 32) != 0) {
                i12 |= androidx.profileinstaller.n.c.f73814m;
                function3 = function2;
            } else {
                function3 = function2;
                if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    if (c0VarR.k0(function3)) {
                        i17 = 131072;
                    } else {
                        i17 = 65536;
                    }
                    i12 |= i17;
                }
            }
            if ((74899 & i12) != 74898) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 == 0) {
                    }
                    if ((i11 & 8) != 0) {
                        jhVarX = kh.f30051a.x(c0VarR, 6);
                        i12 &= -7169;
                    } else {
                        jhVarX = jhVar2;
                    }
                    if (i15 != 0) {
                        jVar4 = null;
                    } else {
                        jVar4 = jVar2;
                    }
                    z14 = z15;
                } else {
                    if (i18 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 == 0) {
                    }
                    if ((i11 & 8) != 0) {
                        jhVarX = kh.f30051a.x(c0VarR, 6);
                        i12 &= -7169;
                    } else {
                        jhVarX = jhVar2;
                    }
                    if (i15 != 0) {
                        jVar4 = null;
                    } else {
                        jVar4 = jVar2;
                    }
                    z14 = z15;
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-2096213317, i12, -1, "androidx.compose.material3.IconButton (IconButton.kt:93)");
                }
                androidx.compose.foundation.interaction.j jVar10 = jVar4;
                D(function1, a0Var4, z14, jhVarX, jVar10, kh.f30051a.w(c0VarR, 6), function3, c0VarR, (65534 & i12) | ((i12 << 3) & 3670016), 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var4;
                z13 = z14;
                jhVar3 = jhVarX;
                jVar3 = jVar10;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                z13 = z11;
                jhVar3 = jhVar2;
                jVar3 = jVar2;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.di
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ei.F(function0, a0Var3, z13, jhVar3, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= androidx.media3.exoplayer.a5.S0;
        z11 = z10;
        if ((i10 & 3072) == 0) {
            if ((i11 & 8) == 0) {
                jhVar2 = jhVar;
                if (c0VarR.D(jhVar2)) {
                }
                i12 |= i19;
            } else {
                jhVar2 = jhVar;
            }
            i12 |= i19;
        } else {
            jhVar2 = jhVar;
        }
        i15 = i11 & 16;
        if (i15 != 0) {
            if ((i10 & 24576) == 0) {
                jVar2 = jVar;
                if (c0VarR.D(jVar2)) {
                    i16 = 16384;
                } else {
                    i16 = 8192;
                }
                i12 |= i16;
            }
            if ((i11 & 32) != 0) {
                i12 |= androidx.profileinstaller.n.c.f73814m;
                function3 = function2;
            } else {
                function3 = function2;
                if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    if (c0VarR.k0(function3)) {
                        i17 = 131072;
                    } else {
                        i17 = 65536;
                    }
                    i12 |= i17;
                }
            }
            if ((74899 & i12) != 74898) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 == 0) {
                    }
                    if ((i11 & 8) != 0) {
                        jhVarX = kh.f30051a.x(c0VarR, 6);
                        i12 &= -7169;
                    } else {
                        jhVarX = jhVar2;
                    }
                    if (i15 != 0) {
                        jVar4 = null;
                    } else {
                        jVar4 = jVar2;
                    }
                    z14 = z15;
                } else {
                    if (i18 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 == 0) {
                    }
                    if ((i11 & 8) != 0) {
                        jhVarX = kh.f30051a.x(c0VarR, 6);
                        i12 &= -7169;
                    } else {
                        jhVarX = jhVar2;
                    }
                    if (i15 != 0) {
                        jVar4 = null;
                    } else {
                        jVar4 = jVar2;
                    }
                    z14 = z15;
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-2096213317, i12, -1, "androidx.compose.material3.IconButton (IconButton.kt:93)");
                }
                androidx.compose.foundation.interaction.j jVar11 = jVar4;
                D(function1, a0Var4, z14, jhVarX, jVar11, kh.f30051a.w(c0VarR, 6), function3, c0VarR, (65534 & i12) | ((i12 << 3) & 3670016), 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var4;
                z13 = z14;
                jhVar3 = jhVarX;
                jVar3 = jVar11;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                z13 = z11;
                jhVar3 = jhVar2;
                jVar3 = jVar2;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.di
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ei.F(function0, a0Var3, z13, jhVar3, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 24576;
        jVar2 = jVar;
        if ((i11 & 32) != 0) {
            i12 |= androidx.profileinstaller.n.c.f73814m;
            function3 = function2;
        } else {
            function3 = function2;
            if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                if (c0VarR.k0(function3)) {
                    i17 = 131072;
                } else {
                    i17 = 65536;
                }
                i12 |= i17;
            }
        }
        if ((74899 & i12) != 74898) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (c0VarR.h(z12, i12 & 1)) {
            c0VarR.l0();
            if ((i10 & 1) != 0) {
                if (i18 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if (i13 == 0) {
                }
                if ((i11 & 8) != 0) {
                    jhVarX = kh.f30051a.x(c0VarR, 6);
                    i12 &= -7169;
                } else {
                    jhVarX = jhVar2;
                }
                if (i15 != 0) {
                    jVar4 = null;
                } else {
                    jVar4 = jVar2;
                }
                z14 = z15;
            } else {
                if (i18 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if (i13 == 0) {
                }
                if ((i11 & 8) != 0) {
                    jhVarX = kh.f30051a.x(c0VarR, 6);
                    i12 &= -7169;
                } else {
                    jhVarX = jhVar2;
                }
                if (i15 != 0) {
                    jVar4 = null;
                } else {
                    jVar4 = jVar2;
                }
                z14 = z15;
            }
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-2096213317, i12, -1, "androidx.compose.material3.IconButton (IconButton.kt:93)");
            }
            androidx.compose.foundation.interaction.j jVar12 = jVar4;
            D(function1, a0Var4, z14, jhVarX, jVar12, kh.f30051a.w(c0VarR, 6), function3, c0VarR, (65534 & i12) | ((i12 << 3) & 3670016), 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            a0Var3 = a0Var4;
            z13 = z14;
            jhVar3 = jhVarX;
            jVar3 = jVar12;
        } else {
            c0VarR.u();
            a0Var3 = a0Var2;
            z13 = z11;
            jhVar3 = jhVar2;
            jVar3 = jVar2;
        }
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.di
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ei.F(function0, a0Var3, z13, jhVar3, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit F(Function0 function0, androidx.compose.ui.a0 a0Var, boolean z10, jh jhVar, androidx.compose.foundation.interaction.j jVar, Function2 function2, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        E(function0, a0Var, z10, jhVar, jVar, function2, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit G(Function0 function0, androidx.compose.ui.a0 a0Var, boolean z10, jh jhVar, androidx.compose.foundation.interaction.j jVar, androidx.compose.ui.graphics.q3 q3Var, Function2 function2, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        D(function0, a0Var, z10, jhVar, jVar, q3Var, function2, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    private static final void H(final androidx.compose.ui.a0 a0Var, final Function0<Unit> function0, final boolean z10, final androidx.compose.ui.graphics.q3 q3Var, final jh jhVar, final androidx.compose.foundation.interaction.j jVar, final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, androidx.compose.runtime.c0 c0Var, final int i10) {
        int i11;
        androidx.compose.foundation.interaction.j jVar2;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1134296466);
        if ((i10 & 6) == 0) {
            i11 = (c0VarR.D(a0Var) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c0VarR.k0(function0) ? 32 : 16;
        }
        if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
            i11 |= c0VarR.G(z10) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c0VarR.D(q3Var) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= c0VarR.D(jhVar) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= c0VarR.D(jVar) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i11 |= c0VarR.k0(function2) ? 1048576 : 524288;
        }
        if (c0VarR.h((599187 & i11) != 599186, i11 & 1)) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1134296466, i11, -1, "androidx.compose.material3.IconButtonImpl (IconButton.kt:171)");
            }
            if (jVar == null) {
                c0VarR.E(977045485);
                Object objI0 = c0VarR.i0();
                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = androidx.compose.foundation.interaction.i.a();
                    c0VarR.Y(objI0);
                }
                jVar2 = (androidx.compose.foundation.interaction.j) objI0;
                c0VarR.A();
            } else {
                c0VarR.E(862800938);
                c0VarR.A();
                jVar2 = jVar;
            }
            int i12 = i11;
            androidx.compose.ui.a0 a0VarC = androidx.compose.material3.internal.q1.c(androidx.compose.foundation.i1.f(androidx.compose.foundation.v.c(androidx.compose.ui.draw.j.a(androidx.compose.foundation.layout.i6.x(wi.j(a0Var), kh.S(kh.f30051a, 0, 1, null)), q3Var), jhVar.a(z10), q3Var), jVar2, gt.e(false, 0.0f, 0L, 7, null), z10, null, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.a()), function0, 8, null), null, 1, null);
            androidx.compose.ui.layout.a1 a1VarK = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), false);
            int iJ = androidx.compose.runtime.v.j(c0VarR, 0);
            androidx.compose.runtime.b1 b1VarK = c0VarR.k();
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0VarC);
            androidx.compose.ui.node.g.a aVar = androidx.compose.ui.node.g.I;
            Function0<androidx.compose.ui.node.g> function0A = aVar.a();
            if (c0VarR.S() == null) {
                androidx.compose.runtime.v.r();
            }
            c0VarR.q();
            if (c0VarR.P()) {
                c0VarR.q0(function0A);
            } else {
                c0VarR.l();
            }
            androidx.compose.runtime.c0 c0VarD = androidx.compose.runtime.y7.d(c0VarR);
            androidx.compose.runtime.y7.n(c0VarD, a1VarK, aVar.e());
            androidx.compose.runtime.y7.n(c0VarD, b1VarK, aVar.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iJ))) {
                c0VarD.Y(Integer.valueOf(iJ));
                c0VarD.f(Integer.valueOf(iJ), function2B);
            }
            androidx.compose.runtime.y7.n(c0VarD, a0VarN, aVar.f());
            androidx.compose.foundation.layout.d0 d0Var = androidx.compose.foundation.layout.d0.f15956a;
            androidx.compose.runtime.a1.e(c7.a().f(androidx.compose.ui.graphics.q0.n(jhVar.b(z10))), function2, c0VarR, androidx.compose.runtime.n4.f36267i | ((i12 >> 15) & com.planner5d.library.engine.input.f.b.B));
            c0VarR.o();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0VarR.u();
        }
        androidx.compose.runtime.s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.lh
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ei.I(a0Var, function0, z10, q3Var, jhVar, jVar, function2, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit I(androidx.compose.ui.a0 a0Var, Function0 function0, boolean z10, androidx.compose.ui.graphics.q3 q3Var, jh jhVar, androidx.compose.foundation.interaction.j jVar, Function2 function2, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        H(a0Var, function0, z10, q3Var, jhVar, jVar, function2, c0Var, androidx.compose.runtime.t4.a(i10 | 1));
        return Unit.f312394a;
    }

    /* JADX WARN: Code duplicated, block: B:109:0x0140 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:110:0x0142  */
    /* JADX WARN: Code duplicated, block: B:111:0x0145  */
    /* JADX WARN: Code duplicated, block: B:113:0x0148  */
    /* JADX WARN: Code duplicated, block: B:116:0x014f  */
    /* JADX WARN: Code duplicated, block: B:117:0x0159  */
    /* JADX WARN: Code duplicated, block: B:119:0x015d  */
    /* JADX WARN: Code duplicated, block: B:122:0x0163  */
    /* JADX WARN: Code duplicated, block: B:123:0x0178  */
    /* JADX WARN: Code duplicated, block: B:126:0x018d  */
    /* JADX WARN: Code duplicated, block: B:129:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:131:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:134:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:136:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x006b  */
    /* JADX WARN: Code duplicated, block: B:38:0x0072  */
    /* JADX WARN: Code duplicated, block: B:40:0x0076  */
    /* JADX WARN: Code duplicated, block: B:42:0x007e  */
    /* JADX WARN: Code duplicated, block: B:43:0x0081  */
    /* JADX WARN: Code duplicated, block: B:47:0x0088  */
    /* JADX WARN: Code duplicated, block: B:49:0x008c  */
    /* JADX WARN: Code duplicated, block: B:51:0x0094  */
    /* JADX WARN: Code duplicated, block: B:52:0x0097  */
    /* JADX WARN: Code duplicated, block: B:55:0x009d  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:73:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:74:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:80:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:86:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:91:0x0104  */
    /* JADX WARN: Code duplicated, block: B:92:0x0107  */
    /* JADX WARN: Code duplicated, block: B:95:0x0110  */
    /* JADX WARN: Code duplicated, block: B:97:0x011d  */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void J(final boolean z10, @NotNull final Function1<? super Boolean, Unit> function1, @Nullable androidx.compose.ui.a0 a0Var, boolean z11, @Nullable oi oiVar, @Nullable androidx.compose.foundation.interaction.j jVar, @Nullable androidx.compose.ui.graphics.q3 q3Var, @NotNull final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        boolean z12;
        int i12;
        Function1<? super Boolean, Unit> function3;
        androidx.compose.ui.a0 a0Var2;
        int i13;
        boolean z13;
        int i14;
        oi oiVarB;
        int i15;
        androidx.compose.foundation.interaction.j jVar2;
        int i16;
        androidx.compose.ui.graphics.q3 q3VarW;
        int i17;
        int i18;
        boolean z14;
        androidx.compose.runtime.c0 c0Var2;
        final androidx.compose.ui.a0 a0Var3;
        final boolean z15;
        final oi oiVar2;
        final androidx.compose.foundation.interaction.j jVar3;
        final androidx.compose.ui.graphics.q3 q3Var2;
        androidx.compose.runtime.s5 s5VarT;
        androidx.compose.ui.a0 a0Var4;
        int i19;
        oi oiVar3;
        androidx.compose.foundation.interaction.j jVar4;
        int i20;
        androidx.compose.ui.a0 a0Var5;
        int i21;
        boolean z16;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1031402037);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
            z12 = z10;
        } else {
            z12 = z10;
            if ((i10 & 6) == 0) {
                i12 = (c0VarR.G(z12) ? 4 : 2) | i10;
            } else {
                i12 = i10;
            }
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
            function3 = function1;
        } else {
            function3 = function1;
            if ((i10 & 48) == 0) {
                i12 |= c0VarR.k0(function3) ? 32 : 16;
            }
        }
        int i22 = i11 & 4;
        if (i22 == 0) {
            if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                a0Var2 = a0Var;
                i12 |= c0VarR.D(a0Var2) ? 256 : 128;
            }
            i13 = i11 & 8;
            if (i13 != 0) {
                if ((i10 & 3072) == 0) {
                    z13 = z11;
                    if (c0VarR.G(z13)) {
                        i14 = 2048;
                    } else {
                        i14 = 1024;
                    }
                    i12 |= i14;
                }
                if ((i10 & 24576) == 0) {
                    if ((i11 & 16) == 0) {
                        oiVarB = oiVar;
                        int i23 = c0VarR.D(oiVarB) ? 16384 : 8192;
                        i12 |= i23;
                    } else {
                        oiVarB = oiVar;
                    }
                    i12 |= i23;
                } else {
                    oiVarB = oiVar;
                }
                i15 = i11 & 32;
                if (i15 != 0) {
                    if ((196608 & i10) == 0) {
                        jVar2 = jVar;
                        if (c0VarR.D(jVar2)) {
                            i16 = 131072;
                        } else {
                            i16 = 65536;
                        }
                        i12 |= i16;
                    }
                    if ((1572864 & i10) == 0) {
                        if ((i11 & 64) == 0) {
                            q3VarW = q3Var;
                            int i24 = c0VarR.D(q3VarW) ? 1048576 : 524288;
                            i12 |= i24;
                        } else {
                            q3VarW = q3Var;
                        }
                        i12 |= i24;
                    } else {
                        q3VarW = q3Var;
                    }
                    if ((i11 & 128) != 0) {
                        if ((i10 & 12582912) == 0) {
                            if (c0VarR.k0(function2)) {
                                i17 = 8388608;
                            } else {
                                i17 = 4194304;
                            }
                            i12 |= i17;
                        }
                        i18 = i12;
                        if ((i12 & 4793491) != 4793490) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (c0VarR.h(z14, i18 & 1)) {
                            c0VarR.l0();
                            if ((i10 & 1) != 0 || c0VarR.y()) {
                                if (i22 != 0) {
                                    a0Var4 = androidx.compose.ui.a0.E;
                                } else {
                                    a0Var4 = a0Var2;
                                }
                                if (i13 != 0) {
                                    z13 = true;
                                }
                                if ((i11 & 16) != 0) {
                                    i19 = i18 & (-57345);
                                    oiVarB = kh.f30051a.B(c0VarR, 6);
                                } else {
                                    i19 = i18;
                                }
                                if (i15 != 0) {
                                    jVar2 = null;
                                }
                                if ((i11 & 64) != 0) {
                                    q3VarW = kh.f30051a.w(c0VarR, 6);
                                    z16 = z13;
                                    oiVar3 = oiVarB;
                                    jVar4 = jVar2;
                                    a0Var5 = a0Var4;
                                    i21 = (-3670017) & i19;
                                    i20 = -1031402037;
                                } else {
                                    oiVar3 = oiVarB;
                                    jVar4 = jVar2;
                                    i20 = -1031402037;
                                    a0Var5 = a0Var4;
                                    i21 = i19;
                                }
                                c0VarR.Z();
                                if (androidx.compose.runtime.m0.l0()) {
                                    androidx.compose.runtime.m0.A0(i20, i21, -1, "androidx.compose.material3.IconToggleButton (IconButton.kt:299)");
                                }
                                c0Var2 = c0VarR;
                                N(z12, function3, a0Var5, z16, oiVar3, jVar4, q3VarW, function2, c0Var2, i21 & 33554430, 0);
                                if (androidx.compose.runtime.m0.l0()) {
                                    androidx.compose.runtime.m0.z0();
                                }
                                a0Var3 = a0Var5;
                                z15 = z16;
                                oiVar2 = oiVar3;
                                jVar3 = jVar4;
                                q3Var2 = q3VarW;
                            } else {
                                c0VarR.u();
                                i21 = (i11 & 16) != 0 ? i18 & (-57345) : i18;
                                if ((i11 & 64) != 0) {
                                    i21 &= -3670017;
                                }
                                oiVar3 = oiVarB;
                                jVar4 = jVar2;
                                i20 = -1031402037;
                                a0Var5 = a0Var2;
                            }
                            z16 = z13;
                            c0VarR.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(i20, i21, -1, "androidx.compose.material3.IconToggleButton (IconButton.kt:299)");
                            }
                            c0Var2 = c0VarR;
                            N(z12, function3, a0Var5, z16, oiVar3, jVar4, q3VarW, function2, c0Var2, i21 & 33554430, 0);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            a0Var3 = a0Var5;
                            z15 = z16;
                            oiVar2 = oiVar3;
                            jVar3 = jVar4;
                            q3Var2 = q3VarW;
                        } else {
                            c0Var2 = c0VarR;
                            c0Var2.u();
                            a0Var3 = a0Var2;
                            z15 = z13;
                            oiVar2 = oiVarB;
                            jVar3 = jVar2;
                            q3Var2 = q3VarW;
                        }
                        s5VarT = c0Var2.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material3.rh
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return ei.M(z10, function1, a0Var3, z15, oiVar2, jVar3, q3Var2, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i12 |= 12582912;
                    i18 = i12;
                    if ((i12 & 4793491) != 4793490) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c0VarR.h(z14, i18 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i22 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i13 != 0) {
                                z13 = true;
                            }
                            if ((i11 & 16) != 0) {
                                i19 = i18 & (-57345);
                                oiVarB = kh.f30051a.B(c0VarR, 6);
                            } else {
                                i19 = i18;
                            }
                            if (i15 != 0) {
                                jVar2 = null;
                            }
                            if ((i11 & 64) != 0) {
                                q3VarW = kh.f30051a.w(c0VarR, 6);
                                z16 = z13;
                                oiVar3 = oiVarB;
                                jVar4 = jVar2;
                                a0Var5 = a0Var4;
                                i21 = (-3670017) & i19;
                                i20 = -1031402037;
                            } else {
                                oiVar3 = oiVarB;
                                jVar4 = jVar2;
                                i20 = -1031402037;
                                a0Var5 = a0Var4;
                                i21 = i19;
                                z16 = z13;
                            }
                        } else {
                            if (i22 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i13 != 0) {
                                z13 = true;
                            }
                            if ((i11 & 16) != 0) {
                                i19 = i18 & (-57345);
                                oiVarB = kh.f30051a.B(c0VarR, 6);
                            } else {
                                i19 = i18;
                            }
                            if (i15 != 0) {
                                jVar2 = null;
                            }
                            if ((i11 & 64) != 0) {
                                q3VarW = kh.f30051a.w(c0VarR, 6);
                                z16 = z13;
                                oiVar3 = oiVarB;
                                jVar4 = jVar2;
                                a0Var5 = a0Var4;
                                i21 = (-3670017) & i19;
                                i20 = -1031402037;
                            } else {
                                oiVar3 = oiVarB;
                                jVar4 = jVar2;
                                i20 = -1031402037;
                                a0Var5 = a0Var4;
                                i21 = i19;
                                z16 = z13;
                            }
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(i20, i21, -1, "androidx.compose.material3.IconToggleButton (IconButton.kt:299)");
                        }
                        c0Var2 = c0VarR;
                        N(z12, function3, a0Var5, z16, oiVar3, jVar4, q3VarW, function2, c0Var2, i21 & 33554430, 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var5;
                        z15 = z16;
                        oiVar2 = oiVar3;
                        jVar3 = jVar4;
                        q3Var2 = q3VarW;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        a0Var3 = a0Var2;
                        z15 = z13;
                        oiVar2 = oiVarB;
                        jVar3 = jVar2;
                        q3Var2 = q3VarW;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.rh
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return ei.M(z10, function1, a0Var3, z15, oiVar2, jVar3, q3Var2, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= androidx.profileinstaller.n.c.f73814m;
                jVar2 = jVar;
                if ((1572864 & i10) == 0) {
                    if ((i11 & 64) == 0) {
                        q3VarW = q3Var;
                        if (c0VarR.D(q3VarW)) {
                        }
                        i12 |= i24;
                    } else {
                        q3VarW = q3Var;
                    }
                    i12 |= i24;
                } else {
                    q3VarW = q3Var;
                }
                if ((i11 & 128) != 0) {
                    if ((i10 & 12582912) == 0) {
                        if (c0VarR.k0(function2)) {
                            i17 = 8388608;
                        } else {
                            i17 = 4194304;
                        }
                        i12 |= i17;
                    }
                    i18 = i12;
                    if ((i12 & 4793491) != 4793490) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c0VarR.h(z14, i18 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i22 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i13 != 0) {
                                z13 = true;
                            }
                            if ((i11 & 16) != 0) {
                                i19 = i18 & (-57345);
                                oiVarB = kh.f30051a.B(c0VarR, 6);
                            } else {
                                i19 = i18;
                            }
                            if (i15 != 0) {
                                jVar2 = null;
                            }
                            if ((i11 & 64) != 0) {
                                q3VarW = kh.f30051a.w(c0VarR, 6);
                                z16 = z13;
                                oiVar3 = oiVarB;
                                jVar4 = jVar2;
                                a0Var5 = a0Var4;
                                i21 = (-3670017) & i19;
                                i20 = -1031402037;
                            } else {
                                oiVar3 = oiVarB;
                                jVar4 = jVar2;
                                i20 = -1031402037;
                                a0Var5 = a0Var4;
                                i21 = i19;
                                z16 = z13;
                            }
                        } else {
                            if (i22 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i13 != 0) {
                                z13 = true;
                            }
                            if ((i11 & 16) != 0) {
                                i19 = i18 & (-57345);
                                oiVarB = kh.f30051a.B(c0VarR, 6);
                            } else {
                                i19 = i18;
                            }
                            if (i15 != 0) {
                                jVar2 = null;
                            }
                            if ((i11 & 64) != 0) {
                                q3VarW = kh.f30051a.w(c0VarR, 6);
                                z16 = z13;
                                oiVar3 = oiVarB;
                                jVar4 = jVar2;
                                a0Var5 = a0Var4;
                                i21 = (-3670017) & i19;
                                i20 = -1031402037;
                            } else {
                                oiVar3 = oiVarB;
                                jVar4 = jVar2;
                                i20 = -1031402037;
                                a0Var5 = a0Var4;
                                i21 = i19;
                                z16 = z13;
                            }
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(i20, i21, -1, "androidx.compose.material3.IconToggleButton (IconButton.kt:299)");
                        }
                        c0Var2 = c0VarR;
                        N(z12, function3, a0Var5, z16, oiVar3, jVar4, q3VarW, function2, c0Var2, i21 & 33554430, 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var5;
                        z15 = z16;
                        oiVar2 = oiVar3;
                        jVar3 = jVar4;
                        q3Var2 = q3VarW;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        a0Var3 = a0Var2;
                        z15 = z13;
                        oiVar2 = oiVarB;
                        jVar3 = jVar2;
                        q3Var2 = q3VarW;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.rh
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return ei.M(z10, function1, a0Var3, z15, oiVar2, jVar3, q3Var2, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 12582912;
                i18 = i12;
                if ((i12 & 4793491) != 4793490) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c0VarR.h(z14, i18 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if ((i11 & 16) != 0) {
                            i19 = i18 & (-57345);
                            oiVarB = kh.f30051a.B(c0VarR, 6);
                        } else {
                            i19 = i18;
                        }
                        if (i15 != 0) {
                            jVar2 = null;
                        }
                        if ((i11 & 64) != 0) {
                            q3VarW = kh.f30051a.w(c0VarR, 6);
                            z16 = z13;
                            oiVar3 = oiVarB;
                            jVar4 = jVar2;
                            a0Var5 = a0Var4;
                            i21 = (-3670017) & i19;
                            i20 = -1031402037;
                        } else {
                            oiVar3 = oiVarB;
                            jVar4 = jVar2;
                            i20 = -1031402037;
                            a0Var5 = a0Var4;
                            i21 = i19;
                            z16 = z13;
                        }
                    } else {
                        if (i22 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if ((i11 & 16) != 0) {
                            i19 = i18 & (-57345);
                            oiVarB = kh.f30051a.B(c0VarR, 6);
                        } else {
                            i19 = i18;
                        }
                        if (i15 != 0) {
                            jVar2 = null;
                        }
                        if ((i11 & 64) != 0) {
                            q3VarW = kh.f30051a.w(c0VarR, 6);
                            z16 = z13;
                            oiVar3 = oiVarB;
                            jVar4 = jVar2;
                            a0Var5 = a0Var4;
                            i21 = (-3670017) & i19;
                            i20 = -1031402037;
                        } else {
                            oiVar3 = oiVarB;
                            jVar4 = jVar2;
                            i20 = -1031402037;
                            a0Var5 = a0Var4;
                            i21 = i19;
                            z16 = z13;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(i20, i21, -1, "androidx.compose.material3.IconToggleButton (IconButton.kt:299)");
                    }
                    c0Var2 = c0VarR;
                    N(z12, function3, a0Var5, z16, oiVar3, jVar4, q3VarW, function2, c0Var2, i21 & 33554430, 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var5;
                    z15 = z16;
                    oiVar2 = oiVar3;
                    jVar3 = jVar4;
                    q3Var2 = q3VarW;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var3 = a0Var2;
                    z15 = z13;
                    oiVar2 = oiVarB;
                    jVar3 = jVar2;
                    q3Var2 = q3VarW;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.rh
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ei.M(z10, function1, a0Var3, z15, oiVar2, jVar3, q3Var2, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 3072;
            z13 = z11;
            if ((i10 & 24576) == 0) {
                if ((i11 & 16) == 0) {
                    oiVarB = oiVar;
                    if (c0VarR.D(oiVarB)) {
                    }
                    i12 |= i23;
                } else {
                    oiVarB = oiVar;
                }
                i12 |= i23;
            } else {
                oiVarB = oiVar;
            }
            i15 = i11 & 32;
            if (i15 != 0) {
                if ((196608 & i10) == 0) {
                    jVar2 = jVar;
                    if (c0VarR.D(jVar2)) {
                        i16 = 131072;
                    } else {
                        i16 = 65536;
                    }
                    i12 |= i16;
                }
                if ((1572864 & i10) == 0) {
                    if ((i11 & 64) == 0) {
                        q3VarW = q3Var;
                        if (c0VarR.D(q3VarW)) {
                        }
                        i12 |= i24;
                    } else {
                        q3VarW = q3Var;
                    }
                    i12 |= i24;
                } else {
                    q3VarW = q3Var;
                }
                if ((i11 & 128) != 0) {
                    if ((i10 & 12582912) == 0) {
                        if (c0VarR.k0(function2)) {
                            i17 = 8388608;
                        } else {
                            i17 = 4194304;
                        }
                        i12 |= i17;
                    }
                    i18 = i12;
                    if ((i12 & 4793491) != 4793490) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c0VarR.h(z14, i18 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i22 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i13 != 0) {
                                z13 = true;
                            }
                            if ((i11 & 16) != 0) {
                                i19 = i18 & (-57345);
                                oiVarB = kh.f30051a.B(c0VarR, 6);
                            } else {
                                i19 = i18;
                            }
                            if (i15 != 0) {
                                jVar2 = null;
                            }
                            if ((i11 & 64) != 0) {
                                q3VarW = kh.f30051a.w(c0VarR, 6);
                                z16 = z13;
                                oiVar3 = oiVarB;
                                jVar4 = jVar2;
                                a0Var5 = a0Var4;
                                i21 = (-3670017) & i19;
                                i20 = -1031402037;
                            } else {
                                oiVar3 = oiVarB;
                                jVar4 = jVar2;
                                i20 = -1031402037;
                                a0Var5 = a0Var4;
                                i21 = i19;
                                z16 = z13;
                            }
                        } else {
                            if (i22 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i13 != 0) {
                                z13 = true;
                            }
                            if ((i11 & 16) != 0) {
                                i19 = i18 & (-57345);
                                oiVarB = kh.f30051a.B(c0VarR, 6);
                            } else {
                                i19 = i18;
                            }
                            if (i15 != 0) {
                                jVar2 = null;
                            }
                            if ((i11 & 64) != 0) {
                                q3VarW = kh.f30051a.w(c0VarR, 6);
                                z16 = z13;
                                oiVar3 = oiVarB;
                                jVar4 = jVar2;
                                a0Var5 = a0Var4;
                                i21 = (-3670017) & i19;
                                i20 = -1031402037;
                            } else {
                                oiVar3 = oiVarB;
                                jVar4 = jVar2;
                                i20 = -1031402037;
                                a0Var5 = a0Var4;
                                i21 = i19;
                                z16 = z13;
                            }
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(i20, i21, -1, "androidx.compose.material3.IconToggleButton (IconButton.kt:299)");
                        }
                        c0Var2 = c0VarR;
                        N(z12, function3, a0Var5, z16, oiVar3, jVar4, q3VarW, function2, c0Var2, i21 & 33554430, 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var5;
                        z15 = z16;
                        oiVar2 = oiVar3;
                        jVar3 = jVar4;
                        q3Var2 = q3VarW;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        a0Var3 = a0Var2;
                        z15 = z13;
                        oiVar2 = oiVarB;
                        jVar3 = jVar2;
                        q3Var2 = q3VarW;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.rh
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return ei.M(z10, function1, a0Var3, z15, oiVar2, jVar3, q3Var2, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 12582912;
                i18 = i12;
                if ((i12 & 4793491) != 4793490) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c0VarR.h(z14, i18 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if ((i11 & 16) != 0) {
                            i19 = i18 & (-57345);
                            oiVarB = kh.f30051a.B(c0VarR, 6);
                        } else {
                            i19 = i18;
                        }
                        if (i15 != 0) {
                            jVar2 = null;
                        }
                        if ((i11 & 64) != 0) {
                            q3VarW = kh.f30051a.w(c0VarR, 6);
                            z16 = z13;
                            oiVar3 = oiVarB;
                            jVar4 = jVar2;
                            a0Var5 = a0Var4;
                            i21 = (-3670017) & i19;
                            i20 = -1031402037;
                        } else {
                            oiVar3 = oiVarB;
                            jVar4 = jVar2;
                            i20 = -1031402037;
                            a0Var5 = a0Var4;
                            i21 = i19;
                            z16 = z13;
                        }
                    } else {
                        if (i22 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if ((i11 & 16) != 0) {
                            i19 = i18 & (-57345);
                            oiVarB = kh.f30051a.B(c0VarR, 6);
                        } else {
                            i19 = i18;
                        }
                        if (i15 != 0) {
                            jVar2 = null;
                        }
                        if ((i11 & 64) != 0) {
                            q3VarW = kh.f30051a.w(c0VarR, 6);
                            z16 = z13;
                            oiVar3 = oiVarB;
                            jVar4 = jVar2;
                            a0Var5 = a0Var4;
                            i21 = (-3670017) & i19;
                            i20 = -1031402037;
                        } else {
                            oiVar3 = oiVarB;
                            jVar4 = jVar2;
                            i20 = -1031402037;
                            a0Var5 = a0Var4;
                            i21 = i19;
                            z16 = z13;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(i20, i21, -1, "androidx.compose.material3.IconToggleButton (IconButton.kt:299)");
                    }
                    c0Var2 = c0VarR;
                    N(z12, function3, a0Var5, z16, oiVar3, jVar4, q3VarW, function2, c0Var2, i21 & 33554430, 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var5;
                    z15 = z16;
                    oiVar2 = oiVar3;
                    jVar3 = jVar4;
                    q3Var2 = q3VarW;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var3 = a0Var2;
                    z15 = z13;
                    oiVar2 = oiVarB;
                    jVar3 = jVar2;
                    q3Var2 = q3VarW;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.rh
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ei.M(z10, function1, a0Var3, z15, oiVar2, jVar3, q3Var2, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= androidx.profileinstaller.n.c.f73814m;
            jVar2 = jVar;
            if ((1572864 & i10) == 0) {
                if ((i11 & 64) == 0) {
                    q3VarW = q3Var;
                    if (c0VarR.D(q3VarW)) {
                    }
                    i12 |= i24;
                } else {
                    q3VarW = q3Var;
                }
                i12 |= i24;
            } else {
                q3VarW = q3Var;
            }
            if ((i11 & 128) != 0) {
                if ((i10 & 12582912) == 0) {
                    if (c0VarR.k0(function2)) {
                        i17 = 8388608;
                    } else {
                        i17 = 4194304;
                    }
                    i12 |= i17;
                }
                i18 = i12;
                if ((i12 & 4793491) != 4793490) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c0VarR.h(z14, i18 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if ((i11 & 16) != 0) {
                            i19 = i18 & (-57345);
                            oiVarB = kh.f30051a.B(c0VarR, 6);
                        } else {
                            i19 = i18;
                        }
                        if (i15 != 0) {
                            jVar2 = null;
                        }
                        if ((i11 & 64) != 0) {
                            q3VarW = kh.f30051a.w(c0VarR, 6);
                            z16 = z13;
                            oiVar3 = oiVarB;
                            jVar4 = jVar2;
                            a0Var5 = a0Var4;
                            i21 = (-3670017) & i19;
                            i20 = -1031402037;
                        } else {
                            oiVar3 = oiVarB;
                            jVar4 = jVar2;
                            i20 = -1031402037;
                            a0Var5 = a0Var4;
                            i21 = i19;
                            z16 = z13;
                        }
                    } else {
                        if (i22 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if ((i11 & 16) != 0) {
                            i19 = i18 & (-57345);
                            oiVarB = kh.f30051a.B(c0VarR, 6);
                        } else {
                            i19 = i18;
                        }
                        if (i15 != 0) {
                            jVar2 = null;
                        }
                        if ((i11 & 64) != 0) {
                            q3VarW = kh.f30051a.w(c0VarR, 6);
                            z16 = z13;
                            oiVar3 = oiVarB;
                            jVar4 = jVar2;
                            a0Var5 = a0Var4;
                            i21 = (-3670017) & i19;
                            i20 = -1031402037;
                        } else {
                            oiVar3 = oiVarB;
                            jVar4 = jVar2;
                            i20 = -1031402037;
                            a0Var5 = a0Var4;
                            i21 = i19;
                            z16 = z13;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(i20, i21, -1, "androidx.compose.material3.IconToggleButton (IconButton.kt:299)");
                    }
                    c0Var2 = c0VarR;
                    N(z12, function3, a0Var5, z16, oiVar3, jVar4, q3VarW, function2, c0Var2, i21 & 33554430, 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var5;
                    z15 = z16;
                    oiVar2 = oiVar3;
                    jVar3 = jVar4;
                    q3Var2 = q3VarW;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var3 = a0Var2;
                    z15 = z13;
                    oiVar2 = oiVarB;
                    jVar3 = jVar2;
                    q3Var2 = q3VarW;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.rh
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ei.M(z10, function1, a0Var3, z15, oiVar2, jVar3, q3Var2, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 12582912;
            i18 = i12;
            if ((i12 & 4793491) != 4793490) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c0VarR.h(z14, i18 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i22 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    }
                    if ((i11 & 16) != 0) {
                        i19 = i18 & (-57345);
                        oiVarB = kh.f30051a.B(c0VarR, 6);
                    } else {
                        i19 = i18;
                    }
                    if (i15 != 0) {
                        jVar2 = null;
                    }
                    if ((i11 & 64) != 0) {
                        q3VarW = kh.f30051a.w(c0VarR, 6);
                        z16 = z13;
                        oiVar3 = oiVarB;
                        jVar4 = jVar2;
                        a0Var5 = a0Var4;
                        i21 = (-3670017) & i19;
                        i20 = -1031402037;
                    } else {
                        oiVar3 = oiVarB;
                        jVar4 = jVar2;
                        i20 = -1031402037;
                        a0Var5 = a0Var4;
                        i21 = i19;
                        z16 = z13;
                    }
                } else {
                    if (i22 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    }
                    if ((i11 & 16) != 0) {
                        i19 = i18 & (-57345);
                        oiVarB = kh.f30051a.B(c0VarR, 6);
                    } else {
                        i19 = i18;
                    }
                    if (i15 != 0) {
                        jVar2 = null;
                    }
                    if ((i11 & 64) != 0) {
                        q3VarW = kh.f30051a.w(c0VarR, 6);
                        z16 = z13;
                        oiVar3 = oiVarB;
                        jVar4 = jVar2;
                        a0Var5 = a0Var4;
                        i21 = (-3670017) & i19;
                        i20 = -1031402037;
                    } else {
                        oiVar3 = oiVarB;
                        jVar4 = jVar2;
                        i20 = -1031402037;
                        a0Var5 = a0Var4;
                        i21 = i19;
                        z16 = z13;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(i20, i21, -1, "androidx.compose.material3.IconToggleButton (IconButton.kt:299)");
                }
                c0Var2 = c0VarR;
                N(z12, function3, a0Var5, z16, oiVar3, jVar4, q3VarW, function2, c0Var2, i21 & 33554430, 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var5;
                z15 = z16;
                oiVar2 = oiVar3;
                jVar3 = jVar4;
                q3Var2 = q3VarW;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var3 = a0Var2;
                z15 = z13;
                oiVar2 = oiVarB;
                jVar3 = jVar2;
                q3Var2 = q3VarW;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.rh
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ei.M(z10, function1, a0Var3, z15, oiVar2, jVar3, q3Var2, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= androidx.media3.exoplayer.a5.S0;
        a0Var2 = a0Var;
        i13 = i11 & 8;
        if (i13 != 0) {
            if ((i10 & 3072) == 0) {
                z13 = z11;
                if (c0VarR.G(z13)) {
                    i14 = 2048;
                } else {
                    i14 = 1024;
                }
                i12 |= i14;
            }
            if ((i10 & 24576) == 0) {
                if ((i11 & 16) == 0) {
                    oiVarB = oiVar;
                    if (c0VarR.D(oiVarB)) {
                    }
                    i12 |= i23;
                } else {
                    oiVarB = oiVar;
                }
                i12 |= i23;
            } else {
                oiVarB = oiVar;
            }
            i15 = i11 & 32;
            if (i15 != 0) {
                if ((196608 & i10) == 0) {
                    jVar2 = jVar;
                    if (c0VarR.D(jVar2)) {
                        i16 = 131072;
                    } else {
                        i16 = 65536;
                    }
                    i12 |= i16;
                }
                if ((1572864 & i10) == 0) {
                    if ((i11 & 64) == 0) {
                        q3VarW = q3Var;
                        if (c0VarR.D(q3VarW)) {
                        }
                        i12 |= i24;
                    } else {
                        q3VarW = q3Var;
                    }
                    i12 |= i24;
                } else {
                    q3VarW = q3Var;
                }
                if ((i11 & 128) != 0) {
                    if ((i10 & 12582912) == 0) {
                        if (c0VarR.k0(function2)) {
                            i17 = 8388608;
                        } else {
                            i17 = 4194304;
                        }
                        i12 |= i17;
                    }
                    i18 = i12;
                    if ((i12 & 4793491) != 4793490) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c0VarR.h(z14, i18 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i22 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i13 != 0) {
                                z13 = true;
                            }
                            if ((i11 & 16) != 0) {
                                i19 = i18 & (-57345);
                                oiVarB = kh.f30051a.B(c0VarR, 6);
                            } else {
                                i19 = i18;
                            }
                            if (i15 != 0) {
                                jVar2 = null;
                            }
                            if ((i11 & 64) != 0) {
                                q3VarW = kh.f30051a.w(c0VarR, 6);
                                z16 = z13;
                                oiVar3 = oiVarB;
                                jVar4 = jVar2;
                                a0Var5 = a0Var4;
                                i21 = (-3670017) & i19;
                                i20 = -1031402037;
                            } else {
                                oiVar3 = oiVarB;
                                jVar4 = jVar2;
                                i20 = -1031402037;
                                a0Var5 = a0Var4;
                                i21 = i19;
                                z16 = z13;
                            }
                        } else {
                            if (i22 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i13 != 0) {
                                z13 = true;
                            }
                            if ((i11 & 16) != 0) {
                                i19 = i18 & (-57345);
                                oiVarB = kh.f30051a.B(c0VarR, 6);
                            } else {
                                i19 = i18;
                            }
                            if (i15 != 0) {
                                jVar2 = null;
                            }
                            if ((i11 & 64) != 0) {
                                q3VarW = kh.f30051a.w(c0VarR, 6);
                                z16 = z13;
                                oiVar3 = oiVarB;
                                jVar4 = jVar2;
                                a0Var5 = a0Var4;
                                i21 = (-3670017) & i19;
                                i20 = -1031402037;
                            } else {
                                oiVar3 = oiVarB;
                                jVar4 = jVar2;
                                i20 = -1031402037;
                                a0Var5 = a0Var4;
                                i21 = i19;
                                z16 = z13;
                            }
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(i20, i21, -1, "androidx.compose.material3.IconToggleButton (IconButton.kt:299)");
                        }
                        c0Var2 = c0VarR;
                        N(z12, function3, a0Var5, z16, oiVar3, jVar4, q3VarW, function2, c0Var2, i21 & 33554430, 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var5;
                        z15 = z16;
                        oiVar2 = oiVar3;
                        jVar3 = jVar4;
                        q3Var2 = q3VarW;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        a0Var3 = a0Var2;
                        z15 = z13;
                        oiVar2 = oiVarB;
                        jVar3 = jVar2;
                        q3Var2 = q3VarW;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.rh
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return ei.M(z10, function1, a0Var3, z15, oiVar2, jVar3, q3Var2, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 12582912;
                i18 = i12;
                if ((i12 & 4793491) != 4793490) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c0VarR.h(z14, i18 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if ((i11 & 16) != 0) {
                            i19 = i18 & (-57345);
                            oiVarB = kh.f30051a.B(c0VarR, 6);
                        } else {
                            i19 = i18;
                        }
                        if (i15 != 0) {
                            jVar2 = null;
                        }
                        if ((i11 & 64) != 0) {
                            q3VarW = kh.f30051a.w(c0VarR, 6);
                            z16 = z13;
                            oiVar3 = oiVarB;
                            jVar4 = jVar2;
                            a0Var5 = a0Var4;
                            i21 = (-3670017) & i19;
                            i20 = -1031402037;
                        } else {
                            oiVar3 = oiVarB;
                            jVar4 = jVar2;
                            i20 = -1031402037;
                            a0Var5 = a0Var4;
                            i21 = i19;
                            z16 = z13;
                        }
                    } else {
                        if (i22 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if ((i11 & 16) != 0) {
                            i19 = i18 & (-57345);
                            oiVarB = kh.f30051a.B(c0VarR, 6);
                        } else {
                            i19 = i18;
                        }
                        if (i15 != 0) {
                            jVar2 = null;
                        }
                        if ((i11 & 64) != 0) {
                            q3VarW = kh.f30051a.w(c0VarR, 6);
                            z16 = z13;
                            oiVar3 = oiVarB;
                            jVar4 = jVar2;
                            a0Var5 = a0Var4;
                            i21 = (-3670017) & i19;
                            i20 = -1031402037;
                        } else {
                            oiVar3 = oiVarB;
                            jVar4 = jVar2;
                            i20 = -1031402037;
                            a0Var5 = a0Var4;
                            i21 = i19;
                            z16 = z13;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(i20, i21, -1, "androidx.compose.material3.IconToggleButton (IconButton.kt:299)");
                    }
                    c0Var2 = c0VarR;
                    N(z12, function3, a0Var5, z16, oiVar3, jVar4, q3VarW, function2, c0Var2, i21 & 33554430, 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var5;
                    z15 = z16;
                    oiVar2 = oiVar3;
                    jVar3 = jVar4;
                    q3Var2 = q3VarW;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var3 = a0Var2;
                    z15 = z13;
                    oiVar2 = oiVarB;
                    jVar3 = jVar2;
                    q3Var2 = q3VarW;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.rh
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ei.M(z10, function1, a0Var3, z15, oiVar2, jVar3, q3Var2, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= androidx.profileinstaller.n.c.f73814m;
            jVar2 = jVar;
            if ((1572864 & i10) == 0) {
                if ((i11 & 64) == 0) {
                    q3VarW = q3Var;
                    if (c0VarR.D(q3VarW)) {
                    }
                    i12 |= i24;
                } else {
                    q3VarW = q3Var;
                }
                i12 |= i24;
            } else {
                q3VarW = q3Var;
            }
            if ((i11 & 128) != 0) {
                if ((i10 & 12582912) == 0) {
                    if (c0VarR.k0(function2)) {
                        i17 = 8388608;
                    } else {
                        i17 = 4194304;
                    }
                    i12 |= i17;
                }
                i18 = i12;
                if ((i12 & 4793491) != 4793490) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c0VarR.h(z14, i18 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if ((i11 & 16) != 0) {
                            i19 = i18 & (-57345);
                            oiVarB = kh.f30051a.B(c0VarR, 6);
                        } else {
                            i19 = i18;
                        }
                        if (i15 != 0) {
                            jVar2 = null;
                        }
                        if ((i11 & 64) != 0) {
                            q3VarW = kh.f30051a.w(c0VarR, 6);
                            z16 = z13;
                            oiVar3 = oiVarB;
                            jVar4 = jVar2;
                            a0Var5 = a0Var4;
                            i21 = (-3670017) & i19;
                            i20 = -1031402037;
                        } else {
                            oiVar3 = oiVarB;
                            jVar4 = jVar2;
                            i20 = -1031402037;
                            a0Var5 = a0Var4;
                            i21 = i19;
                            z16 = z13;
                        }
                    } else {
                        if (i22 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if ((i11 & 16) != 0) {
                            i19 = i18 & (-57345);
                            oiVarB = kh.f30051a.B(c0VarR, 6);
                        } else {
                            i19 = i18;
                        }
                        if (i15 != 0) {
                            jVar2 = null;
                        }
                        if ((i11 & 64) != 0) {
                            q3VarW = kh.f30051a.w(c0VarR, 6);
                            z16 = z13;
                            oiVar3 = oiVarB;
                            jVar4 = jVar2;
                            a0Var5 = a0Var4;
                            i21 = (-3670017) & i19;
                            i20 = -1031402037;
                        } else {
                            oiVar3 = oiVarB;
                            jVar4 = jVar2;
                            i20 = -1031402037;
                            a0Var5 = a0Var4;
                            i21 = i19;
                            z16 = z13;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(i20, i21, -1, "androidx.compose.material3.IconToggleButton (IconButton.kt:299)");
                    }
                    c0Var2 = c0VarR;
                    N(z12, function3, a0Var5, z16, oiVar3, jVar4, q3VarW, function2, c0Var2, i21 & 33554430, 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var5;
                    z15 = z16;
                    oiVar2 = oiVar3;
                    jVar3 = jVar4;
                    q3Var2 = q3VarW;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var3 = a0Var2;
                    z15 = z13;
                    oiVar2 = oiVarB;
                    jVar3 = jVar2;
                    q3Var2 = q3VarW;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.rh
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ei.M(z10, function1, a0Var3, z15, oiVar2, jVar3, q3Var2, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 12582912;
            i18 = i12;
            if ((i12 & 4793491) != 4793490) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c0VarR.h(z14, i18 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i22 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    }
                    if ((i11 & 16) != 0) {
                        i19 = i18 & (-57345);
                        oiVarB = kh.f30051a.B(c0VarR, 6);
                    } else {
                        i19 = i18;
                    }
                    if (i15 != 0) {
                        jVar2 = null;
                    }
                    if ((i11 & 64) != 0) {
                        q3VarW = kh.f30051a.w(c0VarR, 6);
                        z16 = z13;
                        oiVar3 = oiVarB;
                        jVar4 = jVar2;
                        a0Var5 = a0Var4;
                        i21 = (-3670017) & i19;
                        i20 = -1031402037;
                    } else {
                        oiVar3 = oiVarB;
                        jVar4 = jVar2;
                        i20 = -1031402037;
                        a0Var5 = a0Var4;
                        i21 = i19;
                        z16 = z13;
                    }
                } else {
                    if (i22 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    }
                    if ((i11 & 16) != 0) {
                        i19 = i18 & (-57345);
                        oiVarB = kh.f30051a.B(c0VarR, 6);
                    } else {
                        i19 = i18;
                    }
                    if (i15 != 0) {
                        jVar2 = null;
                    }
                    if ((i11 & 64) != 0) {
                        q3VarW = kh.f30051a.w(c0VarR, 6);
                        z16 = z13;
                        oiVar3 = oiVarB;
                        jVar4 = jVar2;
                        a0Var5 = a0Var4;
                        i21 = (-3670017) & i19;
                        i20 = -1031402037;
                    } else {
                        oiVar3 = oiVarB;
                        jVar4 = jVar2;
                        i20 = -1031402037;
                        a0Var5 = a0Var4;
                        i21 = i19;
                        z16 = z13;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(i20, i21, -1, "androidx.compose.material3.IconToggleButton (IconButton.kt:299)");
                }
                c0Var2 = c0VarR;
                N(z12, function3, a0Var5, z16, oiVar3, jVar4, q3VarW, function2, c0Var2, i21 & 33554430, 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var5;
                z15 = z16;
                oiVar2 = oiVar3;
                jVar3 = jVar4;
                q3Var2 = q3VarW;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var3 = a0Var2;
                z15 = z13;
                oiVar2 = oiVarB;
                jVar3 = jVar2;
                q3Var2 = q3VarW;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.rh
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ei.M(z10, function1, a0Var3, z15, oiVar2, jVar3, q3Var2, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 3072;
        z13 = z11;
        if ((i10 & 24576) == 0) {
            if ((i11 & 16) == 0) {
                oiVarB = oiVar;
                if (c0VarR.D(oiVarB)) {
                }
                i12 |= i23;
            } else {
                oiVarB = oiVar;
            }
            i12 |= i23;
        } else {
            oiVarB = oiVar;
        }
        i15 = i11 & 32;
        if (i15 != 0) {
            if ((196608 & i10) == 0) {
                jVar2 = jVar;
                if (c0VarR.D(jVar2)) {
                    i16 = 131072;
                } else {
                    i16 = 65536;
                }
                i12 |= i16;
            }
            if ((1572864 & i10) == 0) {
                if ((i11 & 64) == 0) {
                    q3VarW = q3Var;
                    if (c0VarR.D(q3VarW)) {
                    }
                    i12 |= i24;
                } else {
                    q3VarW = q3Var;
                }
                i12 |= i24;
            } else {
                q3VarW = q3Var;
            }
            if ((i11 & 128) != 0) {
                if ((i10 & 12582912) == 0) {
                    if (c0VarR.k0(function2)) {
                        i17 = 8388608;
                    } else {
                        i17 = 4194304;
                    }
                    i12 |= i17;
                }
                i18 = i12;
                if ((i12 & 4793491) != 4793490) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c0VarR.h(z14, i18 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i22 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if ((i11 & 16) != 0) {
                            i19 = i18 & (-57345);
                            oiVarB = kh.f30051a.B(c0VarR, 6);
                        } else {
                            i19 = i18;
                        }
                        if (i15 != 0) {
                            jVar2 = null;
                        }
                        if ((i11 & 64) != 0) {
                            q3VarW = kh.f30051a.w(c0VarR, 6);
                            z16 = z13;
                            oiVar3 = oiVarB;
                            jVar4 = jVar2;
                            a0Var5 = a0Var4;
                            i21 = (-3670017) & i19;
                            i20 = -1031402037;
                        } else {
                            oiVar3 = oiVarB;
                            jVar4 = jVar2;
                            i20 = -1031402037;
                            a0Var5 = a0Var4;
                            i21 = i19;
                            z16 = z13;
                        }
                    } else {
                        if (i22 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if ((i11 & 16) != 0) {
                            i19 = i18 & (-57345);
                            oiVarB = kh.f30051a.B(c0VarR, 6);
                        } else {
                            i19 = i18;
                        }
                        if (i15 != 0) {
                            jVar2 = null;
                        }
                        if ((i11 & 64) != 0) {
                            q3VarW = kh.f30051a.w(c0VarR, 6);
                            z16 = z13;
                            oiVar3 = oiVarB;
                            jVar4 = jVar2;
                            a0Var5 = a0Var4;
                            i21 = (-3670017) & i19;
                            i20 = -1031402037;
                        } else {
                            oiVar3 = oiVarB;
                            jVar4 = jVar2;
                            i20 = -1031402037;
                            a0Var5 = a0Var4;
                            i21 = i19;
                            z16 = z13;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(i20, i21, -1, "androidx.compose.material3.IconToggleButton (IconButton.kt:299)");
                    }
                    c0Var2 = c0VarR;
                    N(z12, function3, a0Var5, z16, oiVar3, jVar4, q3VarW, function2, c0Var2, i21 & 33554430, 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var5;
                    z15 = z16;
                    oiVar2 = oiVar3;
                    jVar3 = jVar4;
                    q3Var2 = q3VarW;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var3 = a0Var2;
                    z15 = z13;
                    oiVar2 = oiVarB;
                    jVar3 = jVar2;
                    q3Var2 = q3VarW;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.rh
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ei.M(z10, function1, a0Var3, z15, oiVar2, jVar3, q3Var2, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 12582912;
            i18 = i12;
            if ((i12 & 4793491) != 4793490) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c0VarR.h(z14, i18 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i22 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    }
                    if ((i11 & 16) != 0) {
                        i19 = i18 & (-57345);
                        oiVarB = kh.f30051a.B(c0VarR, 6);
                    } else {
                        i19 = i18;
                    }
                    if (i15 != 0) {
                        jVar2 = null;
                    }
                    if ((i11 & 64) != 0) {
                        q3VarW = kh.f30051a.w(c0VarR, 6);
                        z16 = z13;
                        oiVar3 = oiVarB;
                        jVar4 = jVar2;
                        a0Var5 = a0Var4;
                        i21 = (-3670017) & i19;
                        i20 = -1031402037;
                    } else {
                        oiVar3 = oiVarB;
                        jVar4 = jVar2;
                        i20 = -1031402037;
                        a0Var5 = a0Var4;
                        i21 = i19;
                        z16 = z13;
                    }
                } else {
                    if (i22 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    }
                    if ((i11 & 16) != 0) {
                        i19 = i18 & (-57345);
                        oiVarB = kh.f30051a.B(c0VarR, 6);
                    } else {
                        i19 = i18;
                    }
                    if (i15 != 0) {
                        jVar2 = null;
                    }
                    if ((i11 & 64) != 0) {
                        q3VarW = kh.f30051a.w(c0VarR, 6);
                        z16 = z13;
                        oiVar3 = oiVarB;
                        jVar4 = jVar2;
                        a0Var5 = a0Var4;
                        i21 = (-3670017) & i19;
                        i20 = -1031402037;
                    } else {
                        oiVar3 = oiVarB;
                        jVar4 = jVar2;
                        i20 = -1031402037;
                        a0Var5 = a0Var4;
                        i21 = i19;
                        z16 = z13;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(i20, i21, -1, "androidx.compose.material3.IconToggleButton (IconButton.kt:299)");
                }
                c0Var2 = c0VarR;
                N(z12, function3, a0Var5, z16, oiVar3, jVar4, q3VarW, function2, c0Var2, i21 & 33554430, 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var5;
                z15 = z16;
                oiVar2 = oiVar3;
                jVar3 = jVar4;
                q3Var2 = q3VarW;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var3 = a0Var2;
                z15 = z13;
                oiVar2 = oiVarB;
                jVar3 = jVar2;
                q3Var2 = q3VarW;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.rh
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ei.M(z10, function1, a0Var3, z15, oiVar2, jVar3, q3Var2, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= androidx.profileinstaller.n.c.f73814m;
        jVar2 = jVar;
        if ((1572864 & i10) == 0) {
            if ((i11 & 64) == 0) {
                q3VarW = q3Var;
                if (c0VarR.D(q3VarW)) {
                }
                i12 |= i24;
            } else {
                q3VarW = q3Var;
            }
            i12 |= i24;
        } else {
            q3VarW = q3Var;
        }
        if ((i11 & 128) != 0) {
            if ((i10 & 12582912) == 0) {
                if (c0VarR.k0(function2)) {
                    i17 = 8388608;
                } else {
                    i17 = 4194304;
                }
                i12 |= i17;
            }
            i18 = i12;
            if ((i12 & 4793491) != 4793490) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c0VarR.h(z14, i18 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i22 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    }
                    if ((i11 & 16) != 0) {
                        i19 = i18 & (-57345);
                        oiVarB = kh.f30051a.B(c0VarR, 6);
                    } else {
                        i19 = i18;
                    }
                    if (i15 != 0) {
                        jVar2 = null;
                    }
                    if ((i11 & 64) != 0) {
                        q3VarW = kh.f30051a.w(c0VarR, 6);
                        z16 = z13;
                        oiVar3 = oiVarB;
                        jVar4 = jVar2;
                        a0Var5 = a0Var4;
                        i21 = (-3670017) & i19;
                        i20 = -1031402037;
                    } else {
                        oiVar3 = oiVarB;
                        jVar4 = jVar2;
                        i20 = -1031402037;
                        a0Var5 = a0Var4;
                        i21 = i19;
                        z16 = z13;
                    }
                } else {
                    if (i22 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    }
                    if ((i11 & 16) != 0) {
                        i19 = i18 & (-57345);
                        oiVarB = kh.f30051a.B(c0VarR, 6);
                    } else {
                        i19 = i18;
                    }
                    if (i15 != 0) {
                        jVar2 = null;
                    }
                    if ((i11 & 64) != 0) {
                        q3VarW = kh.f30051a.w(c0VarR, 6);
                        z16 = z13;
                        oiVar3 = oiVarB;
                        jVar4 = jVar2;
                        a0Var5 = a0Var4;
                        i21 = (-3670017) & i19;
                        i20 = -1031402037;
                    } else {
                        oiVar3 = oiVarB;
                        jVar4 = jVar2;
                        i20 = -1031402037;
                        a0Var5 = a0Var4;
                        i21 = i19;
                        z16 = z13;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(i20, i21, -1, "androidx.compose.material3.IconToggleButton (IconButton.kt:299)");
                }
                c0Var2 = c0VarR;
                N(z12, function3, a0Var5, z16, oiVar3, jVar4, q3VarW, function2, c0Var2, i21 & 33554430, 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var5;
                z15 = z16;
                oiVar2 = oiVar3;
                jVar3 = jVar4;
                q3Var2 = q3VarW;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var3 = a0Var2;
                z15 = z13;
                oiVar2 = oiVarB;
                jVar3 = jVar2;
                q3Var2 = q3VarW;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.rh
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ei.M(z10, function1, a0Var3, z15, oiVar2, jVar3, q3Var2, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 12582912;
        i18 = i12;
        if ((i12 & 4793491) != 4793490) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c0VarR.h(z14, i18 & 1)) {
            c0VarR.l0();
            if ((i10 & 1) != 0) {
                if (i22 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if (i13 != 0) {
                    z13 = true;
                }
                if ((i11 & 16) != 0) {
                    i19 = i18 & (-57345);
                    oiVarB = kh.f30051a.B(c0VarR, 6);
                } else {
                    i19 = i18;
                }
                if (i15 != 0) {
                    jVar2 = null;
                }
                if ((i11 & 64) != 0) {
                    q3VarW = kh.f30051a.w(c0VarR, 6);
                    z16 = z13;
                    oiVar3 = oiVarB;
                    jVar4 = jVar2;
                    a0Var5 = a0Var4;
                    i21 = (-3670017) & i19;
                    i20 = -1031402037;
                } else {
                    oiVar3 = oiVarB;
                    jVar4 = jVar2;
                    i20 = -1031402037;
                    a0Var5 = a0Var4;
                    i21 = i19;
                    z16 = z13;
                }
            } else {
                if (i22 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if (i13 != 0) {
                    z13 = true;
                }
                if ((i11 & 16) != 0) {
                    i19 = i18 & (-57345);
                    oiVarB = kh.f30051a.B(c0VarR, 6);
                } else {
                    i19 = i18;
                }
                if (i15 != 0) {
                    jVar2 = null;
                }
                if ((i11 & 64) != 0) {
                    q3VarW = kh.f30051a.w(c0VarR, 6);
                    z16 = z13;
                    oiVar3 = oiVarB;
                    jVar4 = jVar2;
                    a0Var5 = a0Var4;
                    i21 = (-3670017) & i19;
                    i20 = -1031402037;
                } else {
                    oiVar3 = oiVarB;
                    jVar4 = jVar2;
                    i20 = -1031402037;
                    a0Var5 = a0Var4;
                    i21 = i19;
                    z16 = z13;
                }
            }
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(i20, i21, -1, "androidx.compose.material3.IconToggleButton (IconButton.kt:299)");
            }
            c0Var2 = c0VarR;
            N(z12, function3, a0Var5, z16, oiVar3, jVar4, q3VarW, function2, c0Var2, i21 & 33554430, 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            a0Var3 = a0Var5;
            z15 = z16;
            oiVar2 = oiVar3;
            jVar3 = jVar4;
            q3Var2 = q3VarW;
        } else {
            c0Var2 = c0VarR;
            c0Var2.u();
            a0Var3 = a0Var2;
            z15 = z13;
            oiVar2 = oiVarB;
            jVar3 = jVar2;
            q3Var2 = q3VarW;
        }
        s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.rh
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ei.M(z10, function1, a0Var3, z15, oiVar2, jVar3, q3Var2, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0116  */
    /* JADX WARN: Code duplicated, block: B:103:0x0121  */
    /* JADX WARN: Code duplicated, block: B:104:0x0127  */
    /* JADX WARN: Code duplicated, block: B:107:0x0132  */
    /* JADX WARN: Code duplicated, block: B:110:0x0158  */
    /* JADX WARN: Code duplicated, block: B:112:0x0161  */
    /* JADX WARN: Code duplicated, block: B:115:0x0172  */
    /* JADX WARN: Code duplicated, block: B:117:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0064  */
    /* JADX WARN: Code duplicated, block: B:38:0x0069  */
    /* JADX WARN: Code duplicated, block: B:40:0x006d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0075  */
    /* JADX WARN: Code duplicated, block: B:43:0x0078  */
    /* JADX WARN: Code duplicated, block: B:47:0x007f  */
    /* JADX WARN: Code duplicated, block: B:49:0x0083  */
    /* JADX WARN: Code duplicated, block: B:51:0x008b  */
    /* JADX WARN: Code duplicated, block: B:52:0x008e  */
    /* JADX WARN: Code duplicated, block: B:55:0x0096  */
    /* JADX WARN: Code duplicated, block: B:58:0x009e  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:64:0x00af  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:71:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:75:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:76:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:80:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:81:0x00df  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:94:0x0108 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:95:0x010a  */
    /* JADX WARN: Code duplicated, block: B:96:0x010d  */
    /* JADX WARN: Code duplicated, block: B:98:0x0110  */
    @androidx.compose.runtime.o
    @kotlin.l(level = kotlin.n.HIDDEN, message = "Use overload with `shape`", replaceWith = @kotlin.b1(expression = "IconToggleButton(checked, onCheckedChange, modifier, enabled, colors, interactionSource, shape, content)", imports = {}))
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final /* synthetic */ void K(final boolean z10, final Function1 function1, androidx.compose.ui.a0 a0Var, boolean z11, oi oiVar, androidx.compose.foundation.interaction.j jVar, final Function2 function2, androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        boolean z12;
        int i12;
        Function1 function3;
        androidx.compose.ui.a0 a0Var2;
        int i13;
        boolean z13;
        int i14;
        oi oiVarB;
        int i15;
        androidx.compose.foundation.interaction.j jVar2;
        int i16;
        int i17;
        boolean z14;
        androidx.compose.runtime.c0 c0Var2;
        final androidx.compose.ui.a0 a0Var3;
        final boolean z15;
        final oi oiVar2;
        final androidx.compose.foundation.interaction.j jVar3;
        androidx.compose.runtime.s5 s5VarT;
        androidx.compose.ui.a0 a0Var4;
        androidx.compose.ui.a0 a0Var5;
        androidx.compose.foundation.interaction.j jVar4;
        boolean z16;
        oi oiVar3;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1307193856);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
            z12 = z10;
        } else {
            z12 = z10;
            if ((i10 & 6) == 0) {
                i12 = (c0VarR.G(z12) ? 4 : 2) | i10;
            } else {
                i12 = i10;
            }
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
            function3 = function1;
        } else {
            function3 = function1;
            if ((i10 & 48) == 0) {
                i12 |= c0VarR.k0(function3) ? 32 : 16;
            }
        }
        int i18 = i11 & 4;
        if (i18 == 0) {
            if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                a0Var2 = a0Var;
                i12 |= c0VarR.D(a0Var2) ? 256 : 128;
            }
            i13 = i11 & 8;
            if (i13 != 0) {
                if ((i10 & 3072) == 0) {
                    z13 = z11;
                    if (c0VarR.G(z13)) {
                        i14 = 2048;
                    } else {
                        i14 = 1024;
                    }
                    i12 |= i14;
                }
                if ((i10 & 24576) == 0) {
                    if ((i11 & 16) == 0) {
                        oiVarB = oiVar;
                        int i19 = c0VarR.D(oiVarB) ? 16384 : 8192;
                        i12 |= i19;
                    } else {
                        oiVarB = oiVar;
                    }
                    i12 |= i19;
                } else {
                    oiVarB = oiVar;
                }
                i15 = i11 & 32;
                if (i15 != 0) {
                    if ((196608 & i10) == 0) {
                        jVar2 = jVar;
                        if (c0VarR.D(jVar2)) {
                            i16 = 131072;
                        } else {
                            i16 = 65536;
                        }
                        i12 |= i16;
                    }
                    if ((i11 & 64) != 0) {
                        if ((i10 & 1572864) == 0) {
                            if (c0VarR.k0(function2)) {
                                i17 = 1048576;
                            } else {
                                i17 = 524288;
                            }
                            i12 |= i17;
                        }
                        if ((599187 & i12) != 599186) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (c0VarR.h(z14, i12 & 1)) {
                            c0VarR.l0();
                            if ((i10 & 1) != 0 || c0VarR.y()) {
                                if (i18 != 0) {
                                    a0Var4 = androidx.compose.ui.a0.E;
                                } else {
                                    a0Var4 = a0Var2;
                                }
                                if (i13 != 0) {
                                    z13 = true;
                                }
                                if ((i11 & 16) != 0) {
                                    i12 &= -57345;
                                    oiVarB = kh.f30051a.B(c0VarR, 6);
                                }
                                if (i15 != 0) {
                                    a0Var5 = a0Var4;
                                    jVar4 = null;
                                    z16 = z13;
                                    oiVar3 = oiVarB;
                                } else {
                                    a0Var5 = a0Var4;
                                }
                                c0VarR.Z();
                                if (androidx.compose.runtime.m0.l0()) {
                                    androidx.compose.runtime.m0.A0(-1307193856, i12, -1, "androidx.compose.material3.IconToggleButton (IconButton.kt:243)");
                                }
                                c0Var2 = c0VarR;
                                J(z12, function3, a0Var5, z16, oiVar3, jVar4, kh.f30051a.w(c0VarR, 6), function2, c0Var2, (524286 & i12) | ((i12 << 3) & 29360128), 0);
                                if (androidx.compose.runtime.m0.l0()) {
                                    androidx.compose.runtime.m0.z0();
                                }
                                a0Var3 = a0Var5;
                                z15 = z16;
                                oiVar2 = oiVar3;
                                jVar3 = jVar4;
                            } else {
                                c0VarR.u();
                                if ((i11 & 16) != 0) {
                                    i12 &= -57345;
                                }
                                a0Var5 = a0Var2;
                            }
                            oiVar3 = oiVarB;
                            jVar4 = jVar2;
                            z16 = z13;
                            c0VarR.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(-1307193856, i12, -1, "androidx.compose.material3.IconToggleButton (IconButton.kt:243)");
                            }
                            c0Var2 = c0VarR;
                            J(z12, function3, a0Var5, z16, oiVar3, jVar4, kh.f30051a.w(c0VarR, 6), function2, c0Var2, (524286 & i12) | ((i12 << 3) & 29360128), 0);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            a0Var3 = a0Var5;
                            z15 = z16;
                            oiVar2 = oiVar3;
                            jVar3 = jVar4;
                        } else {
                            c0Var2 = c0VarR;
                            c0Var2.u();
                            a0Var3 = a0Var2;
                            z15 = z13;
                            oiVar2 = oiVarB;
                            jVar3 = jVar2;
                        }
                        s5VarT = c0Var2.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material3.sh
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return ei.L(z10, function1, a0Var3, z15, oiVar2, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i12 |= 1572864;
                    if ((599187 & i12) != 599186) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c0VarR.h(z14, i12 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i18 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i13 != 0) {
                                z13 = true;
                            }
                            if ((i11 & 16) != 0) {
                                i12 &= -57345;
                                oiVarB = kh.f30051a.B(c0VarR, 6);
                            }
                            if (i15 != 0) {
                                a0Var5 = a0Var4;
                                jVar4 = null;
                                z16 = z13;
                                oiVar3 = oiVarB;
                            } else {
                                a0Var5 = a0Var4;
                                oiVar3 = oiVarB;
                                jVar4 = jVar2;
                                z16 = z13;
                            }
                        } else {
                            if (i18 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i13 != 0) {
                                z13 = true;
                            }
                            if ((i11 & 16) != 0) {
                                i12 &= -57345;
                                oiVarB = kh.f30051a.B(c0VarR, 6);
                            }
                            if (i15 != 0) {
                                a0Var5 = a0Var4;
                                jVar4 = null;
                                z16 = z13;
                                oiVar3 = oiVarB;
                            } else {
                                a0Var5 = a0Var4;
                                oiVar3 = oiVarB;
                                jVar4 = jVar2;
                                z16 = z13;
                            }
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-1307193856, i12, -1, "androidx.compose.material3.IconToggleButton (IconButton.kt:243)");
                        }
                        c0Var2 = c0VarR;
                        J(z12, function3, a0Var5, z16, oiVar3, jVar4, kh.f30051a.w(c0VarR, 6), function2, c0Var2, (524286 & i12) | ((i12 << 3) & 29360128), 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var5;
                        z15 = z16;
                        oiVar2 = oiVar3;
                        jVar3 = jVar4;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        a0Var3 = a0Var2;
                        z15 = z13;
                        oiVar2 = oiVarB;
                        jVar3 = jVar2;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.sh
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return ei.L(z10, function1, a0Var3, z15, oiVar2, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= androidx.profileinstaller.n.c.f73814m;
                jVar2 = jVar;
                if ((i11 & 64) != 0) {
                    if ((i10 & 1572864) == 0) {
                        if (c0VarR.k0(function2)) {
                            i17 = 1048576;
                        } else {
                            i17 = 524288;
                        }
                        i12 |= i17;
                    }
                    if ((599187 & i12) != 599186) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c0VarR.h(z14, i12 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i18 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i13 != 0) {
                                z13 = true;
                            }
                            if ((i11 & 16) != 0) {
                                i12 &= -57345;
                                oiVarB = kh.f30051a.B(c0VarR, 6);
                            }
                            if (i15 != 0) {
                                a0Var5 = a0Var4;
                                jVar4 = null;
                                z16 = z13;
                                oiVar3 = oiVarB;
                            } else {
                                a0Var5 = a0Var4;
                                oiVar3 = oiVarB;
                                jVar4 = jVar2;
                                z16 = z13;
                            }
                        } else {
                            if (i18 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i13 != 0) {
                                z13 = true;
                            }
                            if ((i11 & 16) != 0) {
                                i12 &= -57345;
                                oiVarB = kh.f30051a.B(c0VarR, 6);
                            }
                            if (i15 != 0) {
                                a0Var5 = a0Var4;
                                jVar4 = null;
                                z16 = z13;
                                oiVar3 = oiVarB;
                            } else {
                                a0Var5 = a0Var4;
                                oiVar3 = oiVarB;
                                jVar4 = jVar2;
                                z16 = z13;
                            }
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-1307193856, i12, -1, "androidx.compose.material3.IconToggleButton (IconButton.kt:243)");
                        }
                        c0Var2 = c0VarR;
                        J(z12, function3, a0Var5, z16, oiVar3, jVar4, kh.f30051a.w(c0VarR, 6), function2, c0Var2, (524286 & i12) | ((i12 << 3) & 29360128), 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var5;
                        z15 = z16;
                        oiVar2 = oiVar3;
                        jVar3 = jVar4;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        a0Var3 = a0Var2;
                        z15 = z13;
                        oiVar2 = oiVarB;
                        jVar3 = jVar2;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.sh
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return ei.L(z10, function1, a0Var3, z15, oiVar2, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 1572864;
                if ((599187 & i12) != 599186) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c0VarR.h(z14, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i18 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                            oiVarB = kh.f30051a.B(c0VarR, 6);
                        }
                        if (i15 != 0) {
                            a0Var5 = a0Var4;
                            jVar4 = null;
                            z16 = z13;
                            oiVar3 = oiVarB;
                        } else {
                            a0Var5 = a0Var4;
                            oiVar3 = oiVarB;
                            jVar4 = jVar2;
                            z16 = z13;
                        }
                    } else {
                        if (i18 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                            oiVarB = kh.f30051a.B(c0VarR, 6);
                        }
                        if (i15 != 0) {
                            a0Var5 = a0Var4;
                            jVar4 = null;
                            z16 = z13;
                            oiVar3 = oiVarB;
                        } else {
                            a0Var5 = a0Var4;
                            oiVar3 = oiVarB;
                            jVar4 = jVar2;
                            z16 = z13;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1307193856, i12, -1, "androidx.compose.material3.IconToggleButton (IconButton.kt:243)");
                    }
                    c0Var2 = c0VarR;
                    J(z12, function3, a0Var5, z16, oiVar3, jVar4, kh.f30051a.w(c0VarR, 6), function2, c0Var2, (524286 & i12) | ((i12 << 3) & 29360128), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var5;
                    z15 = z16;
                    oiVar2 = oiVar3;
                    jVar3 = jVar4;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var3 = a0Var2;
                    z15 = z13;
                    oiVar2 = oiVarB;
                    jVar3 = jVar2;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.sh
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ei.L(z10, function1, a0Var3, z15, oiVar2, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 3072;
            z13 = z11;
            if ((i10 & 24576) == 0) {
                if ((i11 & 16) == 0) {
                    oiVarB = oiVar;
                    if (c0VarR.D(oiVarB)) {
                    }
                    i12 |= i19;
                } else {
                    oiVarB = oiVar;
                }
                i12 |= i19;
            } else {
                oiVarB = oiVar;
            }
            i15 = i11 & 32;
            if (i15 != 0) {
                if ((196608 & i10) == 0) {
                    jVar2 = jVar;
                    if (c0VarR.D(jVar2)) {
                        i16 = 131072;
                    } else {
                        i16 = 65536;
                    }
                    i12 |= i16;
                }
                if ((i11 & 64) != 0) {
                    if ((i10 & 1572864) == 0) {
                        if (c0VarR.k0(function2)) {
                            i17 = 1048576;
                        } else {
                            i17 = 524288;
                        }
                        i12 |= i17;
                    }
                    if ((599187 & i12) != 599186) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c0VarR.h(z14, i12 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i18 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i13 != 0) {
                                z13 = true;
                            }
                            if ((i11 & 16) != 0) {
                                i12 &= -57345;
                                oiVarB = kh.f30051a.B(c0VarR, 6);
                            }
                            if (i15 != 0) {
                                a0Var5 = a0Var4;
                                jVar4 = null;
                                z16 = z13;
                                oiVar3 = oiVarB;
                            } else {
                                a0Var5 = a0Var4;
                                oiVar3 = oiVarB;
                                jVar4 = jVar2;
                                z16 = z13;
                            }
                        } else {
                            if (i18 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i13 != 0) {
                                z13 = true;
                            }
                            if ((i11 & 16) != 0) {
                                i12 &= -57345;
                                oiVarB = kh.f30051a.B(c0VarR, 6);
                            }
                            if (i15 != 0) {
                                a0Var5 = a0Var4;
                                jVar4 = null;
                                z16 = z13;
                                oiVar3 = oiVarB;
                            } else {
                                a0Var5 = a0Var4;
                                oiVar3 = oiVarB;
                                jVar4 = jVar2;
                                z16 = z13;
                            }
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-1307193856, i12, -1, "androidx.compose.material3.IconToggleButton (IconButton.kt:243)");
                        }
                        c0Var2 = c0VarR;
                        J(z12, function3, a0Var5, z16, oiVar3, jVar4, kh.f30051a.w(c0VarR, 6), function2, c0Var2, (524286 & i12) | ((i12 << 3) & 29360128), 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var5;
                        z15 = z16;
                        oiVar2 = oiVar3;
                        jVar3 = jVar4;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        a0Var3 = a0Var2;
                        z15 = z13;
                        oiVar2 = oiVarB;
                        jVar3 = jVar2;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.sh
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return ei.L(z10, function1, a0Var3, z15, oiVar2, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 1572864;
                if ((599187 & i12) != 599186) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c0VarR.h(z14, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i18 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                            oiVarB = kh.f30051a.B(c0VarR, 6);
                        }
                        if (i15 != 0) {
                            a0Var5 = a0Var4;
                            jVar4 = null;
                            z16 = z13;
                            oiVar3 = oiVarB;
                        } else {
                            a0Var5 = a0Var4;
                            oiVar3 = oiVarB;
                            jVar4 = jVar2;
                            z16 = z13;
                        }
                    } else {
                        if (i18 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                            oiVarB = kh.f30051a.B(c0VarR, 6);
                        }
                        if (i15 != 0) {
                            a0Var5 = a0Var4;
                            jVar4 = null;
                            z16 = z13;
                            oiVar3 = oiVarB;
                        } else {
                            a0Var5 = a0Var4;
                            oiVar3 = oiVarB;
                            jVar4 = jVar2;
                            z16 = z13;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1307193856, i12, -1, "androidx.compose.material3.IconToggleButton (IconButton.kt:243)");
                    }
                    c0Var2 = c0VarR;
                    J(z12, function3, a0Var5, z16, oiVar3, jVar4, kh.f30051a.w(c0VarR, 6), function2, c0Var2, (524286 & i12) | ((i12 << 3) & 29360128), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var5;
                    z15 = z16;
                    oiVar2 = oiVar3;
                    jVar3 = jVar4;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var3 = a0Var2;
                    z15 = z13;
                    oiVar2 = oiVarB;
                    jVar3 = jVar2;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.sh
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ei.L(z10, function1, a0Var3, z15, oiVar2, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= androidx.profileinstaller.n.c.f73814m;
            jVar2 = jVar;
            if ((i11 & 64) != 0) {
                if ((i10 & 1572864) == 0) {
                    if (c0VarR.k0(function2)) {
                        i17 = 1048576;
                    } else {
                        i17 = 524288;
                    }
                    i12 |= i17;
                }
                if ((599187 & i12) != 599186) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c0VarR.h(z14, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i18 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                            oiVarB = kh.f30051a.B(c0VarR, 6);
                        }
                        if (i15 != 0) {
                            a0Var5 = a0Var4;
                            jVar4 = null;
                            z16 = z13;
                            oiVar3 = oiVarB;
                        } else {
                            a0Var5 = a0Var4;
                            oiVar3 = oiVarB;
                            jVar4 = jVar2;
                            z16 = z13;
                        }
                    } else {
                        if (i18 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                            oiVarB = kh.f30051a.B(c0VarR, 6);
                        }
                        if (i15 != 0) {
                            a0Var5 = a0Var4;
                            jVar4 = null;
                            z16 = z13;
                            oiVar3 = oiVarB;
                        } else {
                            a0Var5 = a0Var4;
                            oiVar3 = oiVarB;
                            jVar4 = jVar2;
                            z16 = z13;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1307193856, i12, -1, "androidx.compose.material3.IconToggleButton (IconButton.kt:243)");
                    }
                    c0Var2 = c0VarR;
                    J(z12, function3, a0Var5, z16, oiVar3, jVar4, kh.f30051a.w(c0VarR, 6), function2, c0Var2, (524286 & i12) | ((i12 << 3) & 29360128), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var5;
                    z15 = z16;
                    oiVar2 = oiVar3;
                    jVar3 = jVar4;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var3 = a0Var2;
                    z15 = z13;
                    oiVar2 = oiVarB;
                    jVar3 = jVar2;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.sh
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ei.L(z10, function1, a0Var3, z15, oiVar2, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 1572864;
            if ((599187 & i12) != 599186) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c0VarR.h(z14, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        oiVarB = kh.f30051a.B(c0VarR, 6);
                    }
                    if (i15 != 0) {
                        a0Var5 = a0Var4;
                        jVar4 = null;
                        z16 = z13;
                        oiVar3 = oiVarB;
                    } else {
                        a0Var5 = a0Var4;
                        oiVar3 = oiVarB;
                        jVar4 = jVar2;
                        z16 = z13;
                    }
                } else {
                    if (i18 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        oiVarB = kh.f30051a.B(c0VarR, 6);
                    }
                    if (i15 != 0) {
                        a0Var5 = a0Var4;
                        jVar4 = null;
                        z16 = z13;
                        oiVar3 = oiVarB;
                    } else {
                        a0Var5 = a0Var4;
                        oiVar3 = oiVarB;
                        jVar4 = jVar2;
                        z16 = z13;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1307193856, i12, -1, "androidx.compose.material3.IconToggleButton (IconButton.kt:243)");
                }
                c0Var2 = c0VarR;
                J(z12, function3, a0Var5, z16, oiVar3, jVar4, kh.f30051a.w(c0VarR, 6), function2, c0Var2, (524286 & i12) | ((i12 << 3) & 29360128), 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var5;
                z15 = z16;
                oiVar2 = oiVar3;
                jVar3 = jVar4;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var3 = a0Var2;
                z15 = z13;
                oiVar2 = oiVarB;
                jVar3 = jVar2;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.sh
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ei.L(z10, function1, a0Var3, z15, oiVar2, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= androidx.media3.exoplayer.a5.S0;
        a0Var2 = a0Var;
        i13 = i11 & 8;
        if (i13 != 0) {
            if ((i10 & 3072) == 0) {
                z13 = z11;
                if (c0VarR.G(z13)) {
                    i14 = 2048;
                } else {
                    i14 = 1024;
                }
                i12 |= i14;
            }
            if ((i10 & 24576) == 0) {
                if ((i11 & 16) == 0) {
                    oiVarB = oiVar;
                    if (c0VarR.D(oiVarB)) {
                    }
                    i12 |= i19;
                } else {
                    oiVarB = oiVar;
                }
                i12 |= i19;
            } else {
                oiVarB = oiVar;
            }
            i15 = i11 & 32;
            if (i15 != 0) {
                if ((196608 & i10) == 0) {
                    jVar2 = jVar;
                    if (c0VarR.D(jVar2)) {
                        i16 = 131072;
                    } else {
                        i16 = 65536;
                    }
                    i12 |= i16;
                }
                if ((i11 & 64) != 0) {
                    if ((i10 & 1572864) == 0) {
                        if (c0VarR.k0(function2)) {
                            i17 = 1048576;
                        } else {
                            i17 = 524288;
                        }
                        i12 |= i17;
                    }
                    if ((599187 & i12) != 599186) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c0VarR.h(z14, i12 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i18 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i13 != 0) {
                                z13 = true;
                            }
                            if ((i11 & 16) != 0) {
                                i12 &= -57345;
                                oiVarB = kh.f30051a.B(c0VarR, 6);
                            }
                            if (i15 != 0) {
                                a0Var5 = a0Var4;
                                jVar4 = null;
                                z16 = z13;
                                oiVar3 = oiVarB;
                            } else {
                                a0Var5 = a0Var4;
                                oiVar3 = oiVarB;
                                jVar4 = jVar2;
                                z16 = z13;
                            }
                        } else {
                            if (i18 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i13 != 0) {
                                z13 = true;
                            }
                            if ((i11 & 16) != 0) {
                                i12 &= -57345;
                                oiVarB = kh.f30051a.B(c0VarR, 6);
                            }
                            if (i15 != 0) {
                                a0Var5 = a0Var4;
                                jVar4 = null;
                                z16 = z13;
                                oiVar3 = oiVarB;
                            } else {
                                a0Var5 = a0Var4;
                                oiVar3 = oiVarB;
                                jVar4 = jVar2;
                                z16 = z13;
                            }
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-1307193856, i12, -1, "androidx.compose.material3.IconToggleButton (IconButton.kt:243)");
                        }
                        c0Var2 = c0VarR;
                        J(z12, function3, a0Var5, z16, oiVar3, jVar4, kh.f30051a.w(c0VarR, 6), function2, c0Var2, (524286 & i12) | ((i12 << 3) & 29360128), 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var5;
                        z15 = z16;
                        oiVar2 = oiVar3;
                        jVar3 = jVar4;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        a0Var3 = a0Var2;
                        z15 = z13;
                        oiVar2 = oiVarB;
                        jVar3 = jVar2;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.sh
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return ei.L(z10, function1, a0Var3, z15, oiVar2, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 1572864;
                if ((599187 & i12) != 599186) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c0VarR.h(z14, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i18 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                            oiVarB = kh.f30051a.B(c0VarR, 6);
                        }
                        if (i15 != 0) {
                            a0Var5 = a0Var4;
                            jVar4 = null;
                            z16 = z13;
                            oiVar3 = oiVarB;
                        } else {
                            a0Var5 = a0Var4;
                            oiVar3 = oiVarB;
                            jVar4 = jVar2;
                            z16 = z13;
                        }
                    } else {
                        if (i18 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                            oiVarB = kh.f30051a.B(c0VarR, 6);
                        }
                        if (i15 != 0) {
                            a0Var5 = a0Var4;
                            jVar4 = null;
                            z16 = z13;
                            oiVar3 = oiVarB;
                        } else {
                            a0Var5 = a0Var4;
                            oiVar3 = oiVarB;
                            jVar4 = jVar2;
                            z16 = z13;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1307193856, i12, -1, "androidx.compose.material3.IconToggleButton (IconButton.kt:243)");
                    }
                    c0Var2 = c0VarR;
                    J(z12, function3, a0Var5, z16, oiVar3, jVar4, kh.f30051a.w(c0VarR, 6), function2, c0Var2, (524286 & i12) | ((i12 << 3) & 29360128), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var5;
                    z15 = z16;
                    oiVar2 = oiVar3;
                    jVar3 = jVar4;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var3 = a0Var2;
                    z15 = z13;
                    oiVar2 = oiVarB;
                    jVar3 = jVar2;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.sh
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ei.L(z10, function1, a0Var3, z15, oiVar2, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= androidx.profileinstaller.n.c.f73814m;
            jVar2 = jVar;
            if ((i11 & 64) != 0) {
                if ((i10 & 1572864) == 0) {
                    if (c0VarR.k0(function2)) {
                        i17 = 1048576;
                    } else {
                        i17 = 524288;
                    }
                    i12 |= i17;
                }
                if ((599187 & i12) != 599186) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c0VarR.h(z14, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i18 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                            oiVarB = kh.f30051a.B(c0VarR, 6);
                        }
                        if (i15 != 0) {
                            a0Var5 = a0Var4;
                            jVar4 = null;
                            z16 = z13;
                            oiVar3 = oiVarB;
                        } else {
                            a0Var5 = a0Var4;
                            oiVar3 = oiVarB;
                            jVar4 = jVar2;
                            z16 = z13;
                        }
                    } else {
                        if (i18 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                            oiVarB = kh.f30051a.B(c0VarR, 6);
                        }
                        if (i15 != 0) {
                            a0Var5 = a0Var4;
                            jVar4 = null;
                            z16 = z13;
                            oiVar3 = oiVarB;
                        } else {
                            a0Var5 = a0Var4;
                            oiVar3 = oiVarB;
                            jVar4 = jVar2;
                            z16 = z13;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1307193856, i12, -1, "androidx.compose.material3.IconToggleButton (IconButton.kt:243)");
                    }
                    c0Var2 = c0VarR;
                    J(z12, function3, a0Var5, z16, oiVar3, jVar4, kh.f30051a.w(c0VarR, 6), function2, c0Var2, (524286 & i12) | ((i12 << 3) & 29360128), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var5;
                    z15 = z16;
                    oiVar2 = oiVar3;
                    jVar3 = jVar4;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var3 = a0Var2;
                    z15 = z13;
                    oiVar2 = oiVarB;
                    jVar3 = jVar2;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.sh
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ei.L(z10, function1, a0Var3, z15, oiVar2, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 1572864;
            if ((599187 & i12) != 599186) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c0VarR.h(z14, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        oiVarB = kh.f30051a.B(c0VarR, 6);
                    }
                    if (i15 != 0) {
                        a0Var5 = a0Var4;
                        jVar4 = null;
                        z16 = z13;
                        oiVar3 = oiVarB;
                    } else {
                        a0Var5 = a0Var4;
                        oiVar3 = oiVarB;
                        jVar4 = jVar2;
                        z16 = z13;
                    }
                } else {
                    if (i18 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        oiVarB = kh.f30051a.B(c0VarR, 6);
                    }
                    if (i15 != 0) {
                        a0Var5 = a0Var4;
                        jVar4 = null;
                        z16 = z13;
                        oiVar3 = oiVarB;
                    } else {
                        a0Var5 = a0Var4;
                        oiVar3 = oiVarB;
                        jVar4 = jVar2;
                        z16 = z13;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1307193856, i12, -1, "androidx.compose.material3.IconToggleButton (IconButton.kt:243)");
                }
                c0Var2 = c0VarR;
                J(z12, function3, a0Var5, z16, oiVar3, jVar4, kh.f30051a.w(c0VarR, 6), function2, c0Var2, (524286 & i12) | ((i12 << 3) & 29360128), 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var5;
                z15 = z16;
                oiVar2 = oiVar3;
                jVar3 = jVar4;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var3 = a0Var2;
                z15 = z13;
                oiVar2 = oiVarB;
                jVar3 = jVar2;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.sh
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ei.L(z10, function1, a0Var3, z15, oiVar2, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 3072;
        z13 = z11;
        if ((i10 & 24576) == 0) {
            if ((i11 & 16) == 0) {
                oiVarB = oiVar;
                if (c0VarR.D(oiVarB)) {
                }
                i12 |= i19;
            } else {
                oiVarB = oiVar;
            }
            i12 |= i19;
        } else {
            oiVarB = oiVar;
        }
        i15 = i11 & 32;
        if (i15 != 0) {
            if ((196608 & i10) == 0) {
                jVar2 = jVar;
                if (c0VarR.D(jVar2)) {
                    i16 = 131072;
                } else {
                    i16 = 65536;
                }
                i12 |= i16;
            }
            if ((i11 & 64) != 0) {
                if ((i10 & 1572864) == 0) {
                    if (c0VarR.k0(function2)) {
                        i17 = 1048576;
                    } else {
                        i17 = 524288;
                    }
                    i12 |= i17;
                }
                if ((599187 & i12) != 599186) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c0VarR.h(z14, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i18 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                            oiVarB = kh.f30051a.B(c0VarR, 6);
                        }
                        if (i15 != 0) {
                            a0Var5 = a0Var4;
                            jVar4 = null;
                            z16 = z13;
                            oiVar3 = oiVarB;
                        } else {
                            a0Var5 = a0Var4;
                            oiVar3 = oiVarB;
                            jVar4 = jVar2;
                            z16 = z13;
                        }
                    } else {
                        if (i18 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                            oiVarB = kh.f30051a.B(c0VarR, 6);
                        }
                        if (i15 != 0) {
                            a0Var5 = a0Var4;
                            jVar4 = null;
                            z16 = z13;
                            oiVar3 = oiVarB;
                        } else {
                            a0Var5 = a0Var4;
                            oiVar3 = oiVarB;
                            jVar4 = jVar2;
                            z16 = z13;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1307193856, i12, -1, "androidx.compose.material3.IconToggleButton (IconButton.kt:243)");
                    }
                    c0Var2 = c0VarR;
                    J(z12, function3, a0Var5, z16, oiVar3, jVar4, kh.f30051a.w(c0VarR, 6), function2, c0Var2, (524286 & i12) | ((i12 << 3) & 29360128), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var5;
                    z15 = z16;
                    oiVar2 = oiVar3;
                    jVar3 = jVar4;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var3 = a0Var2;
                    z15 = z13;
                    oiVar2 = oiVarB;
                    jVar3 = jVar2;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.sh
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ei.L(z10, function1, a0Var3, z15, oiVar2, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 1572864;
            if ((599187 & i12) != 599186) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c0VarR.h(z14, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        oiVarB = kh.f30051a.B(c0VarR, 6);
                    }
                    if (i15 != 0) {
                        a0Var5 = a0Var4;
                        jVar4 = null;
                        z16 = z13;
                        oiVar3 = oiVarB;
                    } else {
                        a0Var5 = a0Var4;
                        oiVar3 = oiVarB;
                        jVar4 = jVar2;
                        z16 = z13;
                    }
                } else {
                    if (i18 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        oiVarB = kh.f30051a.B(c0VarR, 6);
                    }
                    if (i15 != 0) {
                        a0Var5 = a0Var4;
                        jVar4 = null;
                        z16 = z13;
                        oiVar3 = oiVarB;
                    } else {
                        a0Var5 = a0Var4;
                        oiVar3 = oiVarB;
                        jVar4 = jVar2;
                        z16 = z13;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1307193856, i12, -1, "androidx.compose.material3.IconToggleButton (IconButton.kt:243)");
                }
                c0Var2 = c0VarR;
                J(z12, function3, a0Var5, z16, oiVar3, jVar4, kh.f30051a.w(c0VarR, 6), function2, c0Var2, (524286 & i12) | ((i12 << 3) & 29360128), 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var5;
                z15 = z16;
                oiVar2 = oiVar3;
                jVar3 = jVar4;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var3 = a0Var2;
                z15 = z13;
                oiVar2 = oiVarB;
                jVar3 = jVar2;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.sh
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ei.L(z10, function1, a0Var3, z15, oiVar2, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= androidx.profileinstaller.n.c.f73814m;
        jVar2 = jVar;
        if ((i11 & 64) != 0) {
            if ((i10 & 1572864) == 0) {
                if (c0VarR.k0(function2)) {
                    i17 = 1048576;
                } else {
                    i17 = 524288;
                }
                i12 |= i17;
            }
            if ((599187 & i12) != 599186) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c0VarR.h(z14, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        oiVarB = kh.f30051a.B(c0VarR, 6);
                    }
                    if (i15 != 0) {
                        a0Var5 = a0Var4;
                        jVar4 = null;
                        z16 = z13;
                        oiVar3 = oiVarB;
                    } else {
                        a0Var5 = a0Var4;
                        oiVar3 = oiVarB;
                        jVar4 = jVar2;
                        z16 = z13;
                    }
                } else {
                    if (i18 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        oiVarB = kh.f30051a.B(c0VarR, 6);
                    }
                    if (i15 != 0) {
                        a0Var5 = a0Var4;
                        jVar4 = null;
                        z16 = z13;
                        oiVar3 = oiVarB;
                    } else {
                        a0Var5 = a0Var4;
                        oiVar3 = oiVarB;
                        jVar4 = jVar2;
                        z16 = z13;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1307193856, i12, -1, "androidx.compose.material3.IconToggleButton (IconButton.kt:243)");
                }
                c0Var2 = c0VarR;
                J(z12, function3, a0Var5, z16, oiVar3, jVar4, kh.f30051a.w(c0VarR, 6), function2, c0Var2, (524286 & i12) | ((i12 << 3) & 29360128), 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var5;
                z15 = z16;
                oiVar2 = oiVar3;
                jVar3 = jVar4;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var3 = a0Var2;
                z15 = z13;
                oiVar2 = oiVarB;
                jVar3 = jVar2;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.sh
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ei.L(z10, function1, a0Var3, z15, oiVar2, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 1572864;
        if ((599187 & i12) != 599186) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c0VarR.h(z14, i12 & 1)) {
            c0VarR.l0();
            if ((i10 & 1) != 0) {
                if (i18 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if (i13 != 0) {
                    z13 = true;
                }
                if ((i11 & 16) != 0) {
                    i12 &= -57345;
                    oiVarB = kh.f30051a.B(c0VarR, 6);
                }
                if (i15 != 0) {
                    a0Var5 = a0Var4;
                    jVar4 = null;
                    z16 = z13;
                    oiVar3 = oiVarB;
                } else {
                    a0Var5 = a0Var4;
                    oiVar3 = oiVarB;
                    jVar4 = jVar2;
                    z16 = z13;
                }
            } else {
                if (i18 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if (i13 != 0) {
                    z13 = true;
                }
                if ((i11 & 16) != 0) {
                    i12 &= -57345;
                    oiVarB = kh.f30051a.B(c0VarR, 6);
                }
                if (i15 != 0) {
                    a0Var5 = a0Var4;
                    jVar4 = null;
                    z16 = z13;
                    oiVar3 = oiVarB;
                } else {
                    a0Var5 = a0Var4;
                    oiVar3 = oiVarB;
                    jVar4 = jVar2;
                    z16 = z13;
                }
            }
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1307193856, i12, -1, "androidx.compose.material3.IconToggleButton (IconButton.kt:243)");
            }
            c0Var2 = c0VarR;
            J(z12, function3, a0Var5, z16, oiVar3, jVar4, kh.f30051a.w(c0VarR, 6), function2, c0Var2, (524286 & i12) | ((i12 << 3) & 29360128), 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            a0Var3 = a0Var5;
            z15 = z16;
            oiVar2 = oiVar3;
            jVar3 = jVar4;
        } else {
            c0Var2 = c0VarR;
            c0Var2.u();
            a0Var3 = a0Var2;
            z15 = z13;
            oiVar2 = oiVarB;
            jVar3 = jVar2;
        }
        s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.sh
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ei.L(z10, function1, a0Var3, z15, oiVar2, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit L(boolean z10, Function1 function1, androidx.compose.ui.a0 a0Var, boolean z11, oi oiVar, androidx.compose.foundation.interaction.j jVar, Function2 function2, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        K(z10, function1, a0Var, z11, oiVar, jVar, function2, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit M(boolean z10, Function1 function1, androidx.compose.ui.a0 a0Var, boolean z11, oi oiVar, androidx.compose.foundation.interaction.j jVar, androidx.compose.ui.graphics.q3 q3Var, Function2 function2, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        J(z10, function1, a0Var, z11, oiVar, jVar, q3Var, function2, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    /* JADX WARN: Code duplicated, block: B:107:0x0139 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:108:0x013b  */
    /* JADX WARN: Code duplicated, block: B:109:0x013e  */
    /* JADX WARN: Code duplicated, block: B:111:0x0142  */
    /* JADX WARN: Code duplicated, block: B:114:0x0148  */
    /* JADX WARN: Code duplicated, block: B:115:0x0152  */
    /* JADX WARN: Code duplicated, block: B:117:0x0156  */
    /* JADX WARN: Code duplicated, block: B:120:0x015c  */
    /* JADX WARN: Code duplicated, block: B:122:0x016c  */
    /* JADX WARN: Code duplicated, block: B:125:0x0177  */
    /* JADX WARN: Code duplicated, block: B:127:0x0184  */
    /* JADX WARN: Code duplicated, block: B:129:0x0196  */
    /* JADX WARN: Code duplicated, block: B:131:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:134:0x0230  */
    /* JADX WARN: Code duplicated, block: B:137:0x023c  */
    /* JADX WARN: Code duplicated, block: B:138:0x0240  */
    /* JADX WARN: Code duplicated, block: B:141:0x0263  */
    /* JADX WARN: Code duplicated, block: B:143:0x0271  */
    /* JADX WARN: Code duplicated, block: B:146:0x02b5  */
    /* JADX WARN: Code duplicated, block: B:149:0x02bf  */
    /* JADX WARN: Code duplicated, block: B:152:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:154:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x006a  */
    /* JADX WARN: Code duplicated, block: B:38:0x006f  */
    /* JADX WARN: Code duplicated, block: B:40:0x0073  */
    /* JADX WARN: Code duplicated, block: B:42:0x007d  */
    /* JADX WARN: Code duplicated, block: B:43:0x0080  */
    /* JADX WARN: Code duplicated, block: B:47:0x0087  */
    /* JADX WARN: Code duplicated, block: B:49:0x008b  */
    /* JADX WARN: Code duplicated, block: B:51:0x0095  */
    /* JADX WARN: Code duplicated, block: B:52:0x0098  */
    /* JADX WARN: Code duplicated, block: B:55:0x009e  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:60:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:85:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:90:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:91:0x0102  */
    /* JADX WARN: Code duplicated, block: B:94:0x010b  */
    /* JADX WARN: Code duplicated, block: B:96:0x0119  */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    private static final void N(final boolean z10, final Function1<? super Boolean, Unit> function1, androidx.compose.ui.a0 a0Var, boolean z11, oi oiVar, androidx.compose.foundation.interaction.j jVar, androidx.compose.ui.graphics.q3 q3Var, final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        androidx.compose.ui.a0 a0Var2;
        int i13;
        boolean z12;
        int i14;
        oi oiVarD;
        int i15;
        androidx.compose.foundation.interaction.j jVar2;
        int i16;
        androidx.compose.ui.graphics.q3 q3VarW;
        int i17;
        int i18;
        boolean z13;
        final androidx.compose.ui.a0 a0Var3;
        final boolean z14;
        final oi oiVar2;
        final androidx.compose.foundation.interaction.j jVar3;
        final androidx.compose.ui.graphics.q3 q3Var2;
        androidx.compose.runtime.s5 s5VarT;
        androidx.compose.ui.a0 a0Var4;
        int i19;
        int i20;
        androidx.compose.ui.a0 a0Var5;
        androidx.compose.foundation.interaction.j jVar4;
        int iJ;
        Function0<androidx.compose.ui.node.g> function0A;
        androidx.compose.runtime.c0 c0VarD;
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B;
        Object objI0;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1724745099);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c0VarR.G(z10) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= c0VarR.k0(function1) ? 32 : 16;
        }
        int i21 = i11 & 4;
        if (i21 == 0) {
            if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                a0Var2 = a0Var;
                i12 |= c0VarR.D(a0Var2) ? 256 : 128;
            }
            i13 = i11 & 8;
            if (i13 != 0) {
                if ((i10 & 3072) == 0) {
                    z12 = z11;
                    if (c0VarR.G(z12)) {
                        i14 = 2048;
                    } else {
                        i14 = 1024;
                    }
                    i12 |= i14;
                }
                if ((i10 & 24576) == 0) {
                    if ((i11 & 16) == 0) {
                        oiVarD = oiVar;
                        int i22 = c0VarR.D(oiVarD) ? 16384 : 8192;
                        i12 |= i22;
                    } else {
                        oiVarD = oiVar;
                    }
                    i12 |= i22;
                } else {
                    oiVarD = oiVar;
                }
                i15 = i11 & 32;
                if (i15 != 0) {
                    if ((196608 & i10) == 0) {
                        jVar2 = jVar;
                        if (c0VarR.D(jVar2)) {
                            i16 = 131072;
                        } else {
                            i16 = 65536;
                        }
                        i12 |= i16;
                    }
                    if ((1572864 & i10) == 0) {
                        if ((i11 & 64) == 0) {
                            q3VarW = q3Var;
                            int i23 = c0VarR.D(q3VarW) ? 1048576 : 524288;
                            i12 |= i23;
                        } else {
                            q3VarW = q3Var;
                        }
                        i12 |= i23;
                    } else {
                        q3VarW = q3Var;
                    }
                    if ((i11 & 128) != 0) {
                        i12 |= 12582912;
                    } else if ((i10 & 12582912) == 0) {
                        if (c0VarR.k0(function2)) {
                            i17 = 8388608;
                        } else {
                            i17 = 4194304;
                        }
                        i12 |= i17;
                    }
                    i18 = i12;
                    if ((4793491 & i12) != 4793490) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (c0VarR.h(z13, i18 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0 || c0VarR.y()) {
                            if (i21 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i13 != 0) {
                                z12 = true;
                            }
                            if ((i11 & 16) != 0) {
                                i19 = i18 & (-57345);
                                oiVarD = kh.f30051a.D(c0VarR, 6);
                            } else {
                                i19 = i18;
                            }
                            if (i15 != 0) {
                                jVar2 = null;
                            }
                            if ((i11 & 64) != 0) {
                                q3VarW = kh.f30051a.w(c0VarR, 6);
                                i20 = i19 & (-3670017);
                            } else {
                                i20 = i19;
                            }
                            z14 = z12;
                            a0Var5 = a0Var4;
                        } else {
                            c0VarR.u();
                            int i24 = (i11 & 16) != 0 ? i18 & (-57345) : i18;
                            if ((i11 & 64) != 0) {
                                i24 &= -3670017;
                            }
                            boolean z15 = z12;
                            a0Var5 = a0Var2;
                            z14 = z15;
                            i20 = i24;
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(1724745099, i20, -1, "androidx.compose.material3.IconToggleButtonImpl (IconButton.kt:320)");
                        }
                        if (jVar2 == null) {
                            c0VarR.E(1187972528);
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = androidx.compose.foundation.interaction.i.a();
                                c0VarR.Y(objI0);
                            }
                            jVar4 = (androidx.compose.foundation.interaction.j) objI0;
                            c0VarR.A();
                        } else {
                            c0VarR.E(-377320953);
                            c0VarR.A();
                            jVar4 = jVar2;
                        }
                        androidx.compose.ui.a0 a0VarA = androidx.compose.ui.draw.j.a(androidx.compose.foundation.layout.i6.x(wi.j(a0Var5), kh.S(kh.f30051a, 0, 1, null)), q3VarW);
                        int i25 = ((i20 >> 9) & 14) | ((i20 << 3) & com.planner5d.library.engine.input.f.b.B) | ((i20 >> 6) & 896);
                        androidx.compose.ui.a0 a0VarA2 = androidx.compose.foundation.selection.e.a(androidx.compose.foundation.v.d(a0VarA, oiVarD.a(z14, z10, c0VarR, i25).getValue().M(), null, 2, null), z10, jVar4, gt.e(false, 0.0f, 0L, 7, null), z14, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.c()), function1);
                        androidx.compose.ui.layout.a1 a1VarK = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), false);
                        iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                        androidx.compose.runtime.b1 b1VarK = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0VarA2);
                        androidx.compose.ui.node.g.a aVar = androidx.compose.ui.node.g.I;
                        function0A = aVar.a();
                        if (c0VarR.S() == null) {
                            androidx.compose.runtime.v.r();
                        }
                        c0VarR.q();
                        if (c0VarR.P()) {
                            c0VarR.q0(function0A);
                        } else {
                            c0VarR.l();
                        }
                        c0VarD = androidx.compose.runtime.y7.d(c0VarR);
                        androidx.compose.runtime.y7.n(c0VarD, a1VarK, aVar.e());
                        androidx.compose.runtime.y7.n(c0VarD, b1VarK, aVar.g());
                        function2B = aVar.b();
                        if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iJ))) {
                            c0VarD.Y(Integer.valueOf(iJ));
                            c0VarD.f(Integer.valueOf(iJ), function2B);
                        }
                        androidx.compose.runtime.y7.n(c0VarD, a0VarN, aVar.f());
                        androidx.compose.foundation.layout.d0 d0Var = androidx.compose.foundation.layout.d0.f15956a;
                        androidx.compose.runtime.a1.e(c7.a().f(androidx.compose.ui.graphics.q0.n(oiVarD.b(z14, z10, c0VarR, i25).getValue().M())), function2, c0VarR, androidx.compose.runtime.n4.f36267i | ((i20 >> 18) & com.planner5d.library.engine.input.f.b.B));
                        c0VarR.o();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var5;
                    } else {
                        c0VarR.u();
                        a0Var3 = a0Var2;
                        z14 = z12;
                    }
                    oiVar2 = oiVarD;
                    jVar3 = jVar2;
                    q3Var2 = q3VarW;
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.bi
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return ei.O(z10, function1, a0Var3, z14, oiVar2, jVar3, q3Var2, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= androidx.profileinstaller.n.c.f73814m;
                jVar2 = jVar;
                if ((1572864 & i10) == 0) {
                    if ((i11 & 64) == 0) {
                        q3VarW = q3Var;
                        if (c0VarR.D(q3VarW)) {
                        }
                        i12 |= i23;
                    } else {
                        q3VarW = q3Var;
                    }
                    i12 |= i23;
                } else {
                    q3VarW = q3Var;
                }
                if ((i11 & 128) != 0) {
                    i12 |= 12582912;
                } else if ((i10 & 12582912) == 0) {
                    if (c0VarR.k0(function2)) {
                        i17 = 8388608;
                    } else {
                        i17 = 4194304;
                    }
                    i12 |= i17;
                }
                i18 = i12;
                if ((4793491 & i12) != 4793490) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (c0VarR.h(z13, i18 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i21 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        }
                        if ((i11 & 16) != 0) {
                            i19 = i18 & (-57345);
                            oiVarD = kh.f30051a.D(c0VarR, 6);
                        } else {
                            i19 = i18;
                        }
                        if (i15 != 0) {
                            jVar2 = null;
                        }
                        if ((i11 & 64) != 0) {
                            q3VarW = kh.f30051a.w(c0VarR, 6);
                            i20 = i19 & (-3670017);
                        } else {
                            i20 = i19;
                        }
                        z14 = z12;
                        a0Var5 = a0Var4;
                    } else {
                        if (i21 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        }
                        if ((i11 & 16) != 0) {
                            i19 = i18 & (-57345);
                            oiVarD = kh.f30051a.D(c0VarR, 6);
                        } else {
                            i19 = i18;
                        }
                        if (i15 != 0) {
                            jVar2 = null;
                        }
                        if ((i11 & 64) != 0) {
                            q3VarW = kh.f30051a.w(c0VarR, 6);
                            i20 = i19 & (-3670017);
                        } else {
                            i20 = i19;
                        }
                        z14 = z12;
                        a0Var5 = a0Var4;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1724745099, i20, -1, "androidx.compose.material3.IconToggleButtonImpl (IconButton.kt:320)");
                    }
                    if (jVar2 == null) {
                        c0VarR.E(1187972528);
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = androidx.compose.foundation.interaction.i.a();
                            c0VarR.Y(objI0);
                        }
                        jVar4 = (androidx.compose.foundation.interaction.j) objI0;
                        c0VarR.A();
                    } else {
                        c0VarR.E(-377320953);
                        c0VarR.A();
                        jVar4 = jVar2;
                    }
                    androidx.compose.ui.a0 a0VarA3 = androidx.compose.ui.draw.j.a(androidx.compose.foundation.layout.i6.x(wi.j(a0Var5), kh.S(kh.f30051a, 0, 1, null)), q3VarW);
                    int i26 = ((i20 >> 9) & 14) | ((i20 << 3) & com.planner5d.library.engine.input.f.b.B) | ((i20 >> 6) & 896);
                    androidx.compose.ui.a0 a0VarA4 = androidx.compose.foundation.selection.e.a(androidx.compose.foundation.v.d(a0VarA3, oiVarD.a(z14, z10, c0VarR, i26).getValue().M(), null, 2, null), z10, jVar4, gt.e(false, 0.0f, 0L, 7, null), z14, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.c()), function1);
                    androidx.compose.ui.layout.a1 a1VarK2 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), false);
                    iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                    androidx.compose.runtime.b1 b1VarK2 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN2 = androidx.compose.ui.m.n(c0VarR, a0VarA4);
                    androidx.compose.ui.node.g.a aVar2 = androidx.compose.ui.node.g.I;
                    function0A = aVar2.a();
                    if (c0VarR.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0VarR.q();
                    if (c0VarR.P()) {
                        c0VarR.q0(function0A);
                    } else {
                        c0VarR.l();
                    }
                    c0VarD = androidx.compose.runtime.y7.d(c0VarR);
                    androidx.compose.runtime.y7.n(c0VarD, a1VarK2, aVar2.e());
                    androidx.compose.runtime.y7.n(c0VarD, b1VarK2, aVar2.g());
                    function2B = aVar2.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iJ));
                        c0VarD.f(Integer.valueOf(iJ), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iJ));
                        c0VarD.f(Integer.valueOf(iJ), function2B);
                    }
                    androidx.compose.runtime.y7.n(c0VarD, a0VarN2, aVar2.f());
                    androidx.compose.foundation.layout.d0 d0Var2 = androidx.compose.foundation.layout.d0.f15956a;
                    androidx.compose.runtime.a1.e(c7.a().f(androidx.compose.ui.graphics.q0.n(oiVarD.b(z14, z10, c0VarR, i26).getValue().M())), function2, c0VarR, androidx.compose.runtime.n4.f36267i | ((i20 >> 18) & com.planner5d.library.engine.input.f.b.B));
                    c0VarR.o();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var5;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    z14 = z12;
                }
                oiVar2 = oiVarD;
                jVar3 = jVar2;
                q3Var2 = q3VarW;
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.bi
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ei.O(z10, function1, a0Var3, z14, oiVar2, jVar3, q3Var2, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 3072;
            z12 = z11;
            if ((i10 & 24576) == 0) {
                if ((i11 & 16) == 0) {
                    oiVarD = oiVar;
                    if (c0VarR.D(oiVarD)) {
                    }
                    i12 |= i22;
                } else {
                    oiVarD = oiVar;
                }
                i12 |= i22;
            } else {
                oiVarD = oiVar;
            }
            i15 = i11 & 32;
            if (i15 != 0) {
                if ((196608 & i10) == 0) {
                    jVar2 = jVar;
                    if (c0VarR.D(jVar2)) {
                        i16 = 131072;
                    } else {
                        i16 = 65536;
                    }
                    i12 |= i16;
                }
                if ((1572864 & i10) == 0) {
                    if ((i11 & 64) == 0) {
                        q3VarW = q3Var;
                        if (c0VarR.D(q3VarW)) {
                        }
                        i12 |= i23;
                    } else {
                        q3VarW = q3Var;
                    }
                    i12 |= i23;
                } else {
                    q3VarW = q3Var;
                }
                if ((i11 & 128) != 0) {
                    i12 |= 12582912;
                } else if ((i10 & 12582912) == 0) {
                    if (c0VarR.k0(function2)) {
                        i17 = 8388608;
                    } else {
                        i17 = 4194304;
                    }
                    i12 |= i17;
                }
                i18 = i12;
                if ((4793491 & i12) != 4793490) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (c0VarR.h(z13, i18 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i21 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        }
                        if ((i11 & 16) != 0) {
                            i19 = i18 & (-57345);
                            oiVarD = kh.f30051a.D(c0VarR, 6);
                        } else {
                            i19 = i18;
                        }
                        if (i15 != 0) {
                            jVar2 = null;
                        }
                        if ((i11 & 64) != 0) {
                            q3VarW = kh.f30051a.w(c0VarR, 6);
                            i20 = i19 & (-3670017);
                        } else {
                            i20 = i19;
                        }
                        z14 = z12;
                        a0Var5 = a0Var4;
                    } else {
                        if (i21 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        }
                        if ((i11 & 16) != 0) {
                            i19 = i18 & (-57345);
                            oiVarD = kh.f30051a.D(c0VarR, 6);
                        } else {
                            i19 = i18;
                        }
                        if (i15 != 0) {
                            jVar2 = null;
                        }
                        if ((i11 & 64) != 0) {
                            q3VarW = kh.f30051a.w(c0VarR, 6);
                            i20 = i19 & (-3670017);
                        } else {
                            i20 = i19;
                        }
                        z14 = z12;
                        a0Var5 = a0Var4;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1724745099, i20, -1, "androidx.compose.material3.IconToggleButtonImpl (IconButton.kt:320)");
                    }
                    if (jVar2 == null) {
                        c0VarR.E(1187972528);
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = androidx.compose.foundation.interaction.i.a();
                            c0VarR.Y(objI0);
                        }
                        jVar4 = (androidx.compose.foundation.interaction.j) objI0;
                        c0VarR.A();
                    } else {
                        c0VarR.E(-377320953);
                        c0VarR.A();
                        jVar4 = jVar2;
                    }
                    androidx.compose.ui.a0 a0VarA5 = androidx.compose.ui.draw.j.a(androidx.compose.foundation.layout.i6.x(wi.j(a0Var5), kh.S(kh.f30051a, 0, 1, null)), q3VarW);
                    int i27 = ((i20 >> 9) & 14) | ((i20 << 3) & com.planner5d.library.engine.input.f.b.B) | ((i20 >> 6) & 896);
                    androidx.compose.ui.a0 a0VarA6 = androidx.compose.foundation.selection.e.a(androidx.compose.foundation.v.d(a0VarA5, oiVarD.a(z14, z10, c0VarR, i27).getValue().M(), null, 2, null), z10, jVar4, gt.e(false, 0.0f, 0L, 7, null), z14, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.c()), function1);
                    androidx.compose.ui.layout.a1 a1VarK3 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), false);
                    iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                    androidx.compose.runtime.b1 b1VarK3 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN3 = androidx.compose.ui.m.n(c0VarR, a0VarA6);
                    androidx.compose.ui.node.g.a aVar3 = androidx.compose.ui.node.g.I;
                    function0A = aVar3.a();
                    if (c0VarR.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0VarR.q();
                    if (c0VarR.P()) {
                        c0VarR.q0(function0A);
                    } else {
                        c0VarR.l();
                    }
                    c0VarD = androidx.compose.runtime.y7.d(c0VarR);
                    androidx.compose.runtime.y7.n(c0VarD, a1VarK3, aVar3.e());
                    androidx.compose.runtime.y7.n(c0VarD, b1VarK3, aVar3.g());
                    function2B = aVar3.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iJ));
                        c0VarD.f(Integer.valueOf(iJ), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iJ));
                        c0VarD.f(Integer.valueOf(iJ), function2B);
                    }
                    androidx.compose.runtime.y7.n(c0VarD, a0VarN3, aVar3.f());
                    androidx.compose.foundation.layout.d0 d0Var3 = androidx.compose.foundation.layout.d0.f15956a;
                    androidx.compose.runtime.a1.e(c7.a().f(androidx.compose.ui.graphics.q0.n(oiVarD.b(z14, z10, c0VarR, i27).getValue().M())), function2, c0VarR, androidx.compose.runtime.n4.f36267i | ((i20 >> 18) & com.planner5d.library.engine.input.f.b.B));
                    c0VarR.o();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var5;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    z14 = z12;
                }
                oiVar2 = oiVarD;
                jVar3 = jVar2;
                q3Var2 = q3VarW;
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.bi
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ei.O(z10, function1, a0Var3, z14, oiVar2, jVar3, q3Var2, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= androidx.profileinstaller.n.c.f73814m;
            jVar2 = jVar;
            if ((1572864 & i10) == 0) {
                if ((i11 & 64) == 0) {
                    q3VarW = q3Var;
                    if (c0VarR.D(q3VarW)) {
                    }
                    i12 |= i23;
                } else {
                    q3VarW = q3Var;
                }
                i12 |= i23;
            } else {
                q3VarW = q3Var;
            }
            if ((i11 & 128) != 0) {
                i12 |= 12582912;
            } else if ((i10 & 12582912) == 0) {
                if (c0VarR.k0(function2)) {
                    i17 = 8388608;
                } else {
                    i17 = 4194304;
                }
                i12 |= i17;
            }
            i18 = i12;
            if ((4793491 & i12) != 4793490) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c0VarR.h(z13, i18 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i21 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    }
                    if ((i11 & 16) != 0) {
                        i19 = i18 & (-57345);
                        oiVarD = kh.f30051a.D(c0VarR, 6);
                    } else {
                        i19 = i18;
                    }
                    if (i15 != 0) {
                        jVar2 = null;
                    }
                    if ((i11 & 64) != 0) {
                        q3VarW = kh.f30051a.w(c0VarR, 6);
                        i20 = i19 & (-3670017);
                    } else {
                        i20 = i19;
                    }
                    z14 = z12;
                    a0Var5 = a0Var4;
                } else {
                    if (i21 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    }
                    if ((i11 & 16) != 0) {
                        i19 = i18 & (-57345);
                        oiVarD = kh.f30051a.D(c0VarR, 6);
                    } else {
                        i19 = i18;
                    }
                    if (i15 != 0) {
                        jVar2 = null;
                    }
                    if ((i11 & 64) != 0) {
                        q3VarW = kh.f30051a.w(c0VarR, 6);
                        i20 = i19 & (-3670017);
                    } else {
                        i20 = i19;
                    }
                    z14 = z12;
                    a0Var5 = a0Var4;
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1724745099, i20, -1, "androidx.compose.material3.IconToggleButtonImpl (IconButton.kt:320)");
                }
                if (jVar2 == null) {
                    c0VarR.E(1187972528);
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = androidx.compose.foundation.interaction.i.a();
                        c0VarR.Y(objI0);
                    }
                    jVar4 = (androidx.compose.foundation.interaction.j) objI0;
                    c0VarR.A();
                } else {
                    c0VarR.E(-377320953);
                    c0VarR.A();
                    jVar4 = jVar2;
                }
                androidx.compose.ui.a0 a0VarA7 = androidx.compose.ui.draw.j.a(androidx.compose.foundation.layout.i6.x(wi.j(a0Var5), kh.S(kh.f30051a, 0, 1, null)), q3VarW);
                int i28 = ((i20 >> 9) & 14) | ((i20 << 3) & com.planner5d.library.engine.input.f.b.B) | ((i20 >> 6) & 896);
                androidx.compose.ui.a0 a0VarA8 = androidx.compose.foundation.selection.e.a(androidx.compose.foundation.v.d(a0VarA7, oiVarD.a(z14, z10, c0VarR, i28).getValue().M(), null, 2, null), z10, jVar4, gt.e(false, 0.0f, 0L, 7, null), z14, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.c()), function1);
                androidx.compose.ui.layout.a1 a1VarK4 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), false);
                iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                androidx.compose.runtime.b1 b1VarK4 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN4 = androidx.compose.ui.m.n(c0VarR, a0VarA8);
                androidx.compose.ui.node.g.a aVar4 = androidx.compose.ui.node.g.I;
                function0A = aVar4.a();
                if (c0VarR.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0VarR.q();
                if (c0VarR.P()) {
                    c0VarR.q0(function0A);
                } else {
                    c0VarR.l();
                }
                c0VarD = androidx.compose.runtime.y7.d(c0VarR);
                androidx.compose.runtime.y7.n(c0VarD, a1VarK4, aVar4.e());
                androidx.compose.runtime.y7.n(c0VarD, b1VarK4, aVar4.g());
                function2B = aVar4.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iJ));
                    c0VarD.f(Integer.valueOf(iJ), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iJ));
                    c0VarD.f(Integer.valueOf(iJ), function2B);
                }
                androidx.compose.runtime.y7.n(c0VarD, a0VarN4, aVar4.f());
                androidx.compose.foundation.layout.d0 d0Var4 = androidx.compose.foundation.layout.d0.f15956a;
                androidx.compose.runtime.a1.e(c7.a().f(androidx.compose.ui.graphics.q0.n(oiVarD.b(z14, z10, c0VarR, i28).getValue().M())), function2, c0VarR, androidx.compose.runtime.n4.f36267i | ((i20 >> 18) & com.planner5d.library.engine.input.f.b.B));
                c0VarR.o();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var5;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                z14 = z12;
            }
            oiVar2 = oiVarD;
            jVar3 = jVar2;
            q3Var2 = q3VarW;
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.bi
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ei.O(z10, function1, a0Var3, z14, oiVar2, jVar3, q3Var2, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= androidx.media3.exoplayer.a5.S0;
        a0Var2 = a0Var;
        i13 = i11 & 8;
        if (i13 != 0) {
            if ((i10 & 3072) == 0) {
                z12 = z11;
                if (c0VarR.G(z12)) {
                    i14 = 2048;
                } else {
                    i14 = 1024;
                }
                i12 |= i14;
            }
            if ((i10 & 24576) == 0) {
                if ((i11 & 16) == 0) {
                    oiVarD = oiVar;
                    if (c0VarR.D(oiVarD)) {
                    }
                    i12 |= i22;
                } else {
                    oiVarD = oiVar;
                }
                i12 |= i22;
            } else {
                oiVarD = oiVar;
            }
            i15 = i11 & 32;
            if (i15 != 0) {
                if ((196608 & i10) == 0) {
                    jVar2 = jVar;
                    if (c0VarR.D(jVar2)) {
                        i16 = 131072;
                    } else {
                        i16 = 65536;
                    }
                    i12 |= i16;
                }
                if ((1572864 & i10) == 0) {
                    if ((i11 & 64) == 0) {
                        q3VarW = q3Var;
                        if (c0VarR.D(q3VarW)) {
                        }
                        i12 |= i23;
                    } else {
                        q3VarW = q3Var;
                    }
                    i12 |= i23;
                } else {
                    q3VarW = q3Var;
                }
                if ((i11 & 128) != 0) {
                    i12 |= 12582912;
                } else if ((i10 & 12582912) == 0) {
                    if (c0VarR.k0(function2)) {
                        i17 = 8388608;
                    } else {
                        i17 = 4194304;
                    }
                    i12 |= i17;
                }
                i18 = i12;
                if ((4793491 & i12) != 4793490) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (c0VarR.h(z13, i18 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i21 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        }
                        if ((i11 & 16) != 0) {
                            i19 = i18 & (-57345);
                            oiVarD = kh.f30051a.D(c0VarR, 6);
                        } else {
                            i19 = i18;
                        }
                        if (i15 != 0) {
                            jVar2 = null;
                        }
                        if ((i11 & 64) != 0) {
                            q3VarW = kh.f30051a.w(c0VarR, 6);
                            i20 = i19 & (-3670017);
                        } else {
                            i20 = i19;
                        }
                        z14 = z12;
                        a0Var5 = a0Var4;
                    } else {
                        if (i21 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        }
                        if ((i11 & 16) != 0) {
                            i19 = i18 & (-57345);
                            oiVarD = kh.f30051a.D(c0VarR, 6);
                        } else {
                            i19 = i18;
                        }
                        if (i15 != 0) {
                            jVar2 = null;
                        }
                        if ((i11 & 64) != 0) {
                            q3VarW = kh.f30051a.w(c0VarR, 6);
                            i20 = i19 & (-3670017);
                        } else {
                            i20 = i19;
                        }
                        z14 = z12;
                        a0Var5 = a0Var4;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1724745099, i20, -1, "androidx.compose.material3.IconToggleButtonImpl (IconButton.kt:320)");
                    }
                    if (jVar2 == null) {
                        c0VarR.E(1187972528);
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = androidx.compose.foundation.interaction.i.a();
                            c0VarR.Y(objI0);
                        }
                        jVar4 = (androidx.compose.foundation.interaction.j) objI0;
                        c0VarR.A();
                    } else {
                        c0VarR.E(-377320953);
                        c0VarR.A();
                        jVar4 = jVar2;
                    }
                    androidx.compose.ui.a0 a0VarA9 = androidx.compose.ui.draw.j.a(androidx.compose.foundation.layout.i6.x(wi.j(a0Var5), kh.S(kh.f30051a, 0, 1, null)), q3VarW);
                    int i29 = ((i20 >> 9) & 14) | ((i20 << 3) & com.planner5d.library.engine.input.f.b.B) | ((i20 >> 6) & 896);
                    androidx.compose.ui.a0 a0VarA10 = androidx.compose.foundation.selection.e.a(androidx.compose.foundation.v.d(a0VarA9, oiVarD.a(z14, z10, c0VarR, i29).getValue().M(), null, 2, null), z10, jVar4, gt.e(false, 0.0f, 0L, 7, null), z14, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.c()), function1);
                    androidx.compose.ui.layout.a1 a1VarK5 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), false);
                    iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                    androidx.compose.runtime.b1 b1VarK5 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN5 = androidx.compose.ui.m.n(c0VarR, a0VarA10);
                    androidx.compose.ui.node.g.a aVar5 = androidx.compose.ui.node.g.I;
                    function0A = aVar5.a();
                    if (c0VarR.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0VarR.q();
                    if (c0VarR.P()) {
                        c0VarR.q0(function0A);
                    } else {
                        c0VarR.l();
                    }
                    c0VarD = androidx.compose.runtime.y7.d(c0VarR);
                    androidx.compose.runtime.y7.n(c0VarD, a1VarK5, aVar5.e());
                    androidx.compose.runtime.y7.n(c0VarD, b1VarK5, aVar5.g());
                    function2B = aVar5.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iJ));
                        c0VarD.f(Integer.valueOf(iJ), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iJ));
                        c0VarD.f(Integer.valueOf(iJ), function2B);
                    }
                    androidx.compose.runtime.y7.n(c0VarD, a0VarN5, aVar5.f());
                    androidx.compose.foundation.layout.d0 d0Var5 = androidx.compose.foundation.layout.d0.f15956a;
                    androidx.compose.runtime.a1.e(c7.a().f(androidx.compose.ui.graphics.q0.n(oiVarD.b(z14, z10, c0VarR, i29).getValue().M())), function2, c0VarR, androidx.compose.runtime.n4.f36267i | ((i20 >> 18) & com.planner5d.library.engine.input.f.b.B));
                    c0VarR.o();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var5;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    z14 = z12;
                }
                oiVar2 = oiVarD;
                jVar3 = jVar2;
                q3Var2 = q3VarW;
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.bi
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ei.O(z10, function1, a0Var3, z14, oiVar2, jVar3, q3Var2, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= androidx.profileinstaller.n.c.f73814m;
            jVar2 = jVar;
            if ((1572864 & i10) == 0) {
                if ((i11 & 64) == 0) {
                    q3VarW = q3Var;
                    if (c0VarR.D(q3VarW)) {
                    }
                    i12 |= i23;
                } else {
                    q3VarW = q3Var;
                }
                i12 |= i23;
            } else {
                q3VarW = q3Var;
            }
            if ((i11 & 128) != 0) {
                i12 |= 12582912;
            } else if ((i10 & 12582912) == 0) {
                if (c0VarR.k0(function2)) {
                    i17 = 8388608;
                } else {
                    i17 = 4194304;
                }
                i12 |= i17;
            }
            i18 = i12;
            if ((4793491 & i12) != 4793490) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c0VarR.h(z13, i18 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i21 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    }
                    if ((i11 & 16) != 0) {
                        i19 = i18 & (-57345);
                        oiVarD = kh.f30051a.D(c0VarR, 6);
                    } else {
                        i19 = i18;
                    }
                    if (i15 != 0) {
                        jVar2 = null;
                    }
                    if ((i11 & 64) != 0) {
                        q3VarW = kh.f30051a.w(c0VarR, 6);
                        i20 = i19 & (-3670017);
                    } else {
                        i20 = i19;
                    }
                    z14 = z12;
                    a0Var5 = a0Var4;
                } else {
                    if (i21 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    }
                    if ((i11 & 16) != 0) {
                        i19 = i18 & (-57345);
                        oiVarD = kh.f30051a.D(c0VarR, 6);
                    } else {
                        i19 = i18;
                    }
                    if (i15 != 0) {
                        jVar2 = null;
                    }
                    if ((i11 & 64) != 0) {
                        q3VarW = kh.f30051a.w(c0VarR, 6);
                        i20 = i19 & (-3670017);
                    } else {
                        i20 = i19;
                    }
                    z14 = z12;
                    a0Var5 = a0Var4;
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1724745099, i20, -1, "androidx.compose.material3.IconToggleButtonImpl (IconButton.kt:320)");
                }
                if (jVar2 == null) {
                    c0VarR.E(1187972528);
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = androidx.compose.foundation.interaction.i.a();
                        c0VarR.Y(objI0);
                    }
                    jVar4 = (androidx.compose.foundation.interaction.j) objI0;
                    c0VarR.A();
                } else {
                    c0VarR.E(-377320953);
                    c0VarR.A();
                    jVar4 = jVar2;
                }
                androidx.compose.ui.a0 a0VarA11 = androidx.compose.ui.draw.j.a(androidx.compose.foundation.layout.i6.x(wi.j(a0Var5), kh.S(kh.f30051a, 0, 1, null)), q3VarW);
                int i210 = ((i20 >> 9) & 14) | ((i20 << 3) & com.planner5d.library.engine.input.f.b.B) | ((i20 >> 6) & 896);
                androidx.compose.ui.a0 a0VarA12 = androidx.compose.foundation.selection.e.a(androidx.compose.foundation.v.d(a0VarA11, oiVarD.a(z14, z10, c0VarR, i210).getValue().M(), null, 2, null), z10, jVar4, gt.e(false, 0.0f, 0L, 7, null), z14, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.c()), function1);
                androidx.compose.ui.layout.a1 a1VarK6 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), false);
                iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                androidx.compose.runtime.b1 b1VarK6 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN6 = androidx.compose.ui.m.n(c0VarR, a0VarA12);
                androidx.compose.ui.node.g.a aVar6 = androidx.compose.ui.node.g.I;
                function0A = aVar6.a();
                if (c0VarR.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0VarR.q();
                if (c0VarR.P()) {
                    c0VarR.q0(function0A);
                } else {
                    c0VarR.l();
                }
                c0VarD = androidx.compose.runtime.y7.d(c0VarR);
                androidx.compose.runtime.y7.n(c0VarD, a1VarK6, aVar6.e());
                androidx.compose.runtime.y7.n(c0VarD, b1VarK6, aVar6.g());
                function2B = aVar6.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iJ));
                    c0VarD.f(Integer.valueOf(iJ), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iJ));
                    c0VarD.f(Integer.valueOf(iJ), function2B);
                }
                androidx.compose.runtime.y7.n(c0VarD, a0VarN6, aVar6.f());
                androidx.compose.foundation.layout.d0 d0Var6 = androidx.compose.foundation.layout.d0.f15956a;
                androidx.compose.runtime.a1.e(c7.a().f(androidx.compose.ui.graphics.q0.n(oiVarD.b(z14, z10, c0VarR, i210).getValue().M())), function2, c0VarR, androidx.compose.runtime.n4.f36267i | ((i20 >> 18) & com.planner5d.library.engine.input.f.b.B));
                c0VarR.o();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var5;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                z14 = z12;
            }
            oiVar2 = oiVarD;
            jVar3 = jVar2;
            q3Var2 = q3VarW;
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.bi
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ei.O(z10, function1, a0Var3, z14, oiVar2, jVar3, q3Var2, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 3072;
        z12 = z11;
        if ((i10 & 24576) == 0) {
            if ((i11 & 16) == 0) {
                oiVarD = oiVar;
                if (c0VarR.D(oiVarD)) {
                }
                i12 |= i22;
            } else {
                oiVarD = oiVar;
            }
            i12 |= i22;
        } else {
            oiVarD = oiVar;
        }
        i15 = i11 & 32;
        if (i15 != 0) {
            if ((196608 & i10) == 0) {
                jVar2 = jVar;
                if (c0VarR.D(jVar2)) {
                    i16 = 131072;
                } else {
                    i16 = 65536;
                }
                i12 |= i16;
            }
            if ((1572864 & i10) == 0) {
                if ((i11 & 64) == 0) {
                    q3VarW = q3Var;
                    if (c0VarR.D(q3VarW)) {
                    }
                    i12 |= i23;
                } else {
                    q3VarW = q3Var;
                }
                i12 |= i23;
            } else {
                q3VarW = q3Var;
            }
            if ((i11 & 128) != 0) {
                i12 |= 12582912;
            } else if ((i10 & 12582912) == 0) {
                if (c0VarR.k0(function2)) {
                    i17 = 8388608;
                } else {
                    i17 = 4194304;
                }
                i12 |= i17;
            }
            i18 = i12;
            if ((4793491 & i12) != 4793490) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c0VarR.h(z13, i18 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i21 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    }
                    if ((i11 & 16) != 0) {
                        i19 = i18 & (-57345);
                        oiVarD = kh.f30051a.D(c0VarR, 6);
                    } else {
                        i19 = i18;
                    }
                    if (i15 != 0) {
                        jVar2 = null;
                    }
                    if ((i11 & 64) != 0) {
                        q3VarW = kh.f30051a.w(c0VarR, 6);
                        i20 = i19 & (-3670017);
                    } else {
                        i20 = i19;
                    }
                    z14 = z12;
                    a0Var5 = a0Var4;
                } else {
                    if (i21 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    }
                    if ((i11 & 16) != 0) {
                        i19 = i18 & (-57345);
                        oiVarD = kh.f30051a.D(c0VarR, 6);
                    } else {
                        i19 = i18;
                    }
                    if (i15 != 0) {
                        jVar2 = null;
                    }
                    if ((i11 & 64) != 0) {
                        q3VarW = kh.f30051a.w(c0VarR, 6);
                        i20 = i19 & (-3670017);
                    } else {
                        i20 = i19;
                    }
                    z14 = z12;
                    a0Var5 = a0Var4;
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1724745099, i20, -1, "androidx.compose.material3.IconToggleButtonImpl (IconButton.kt:320)");
                }
                if (jVar2 == null) {
                    c0VarR.E(1187972528);
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = androidx.compose.foundation.interaction.i.a();
                        c0VarR.Y(objI0);
                    }
                    jVar4 = (androidx.compose.foundation.interaction.j) objI0;
                    c0VarR.A();
                } else {
                    c0VarR.E(-377320953);
                    c0VarR.A();
                    jVar4 = jVar2;
                }
                androidx.compose.ui.a0 a0VarA13 = androidx.compose.ui.draw.j.a(androidx.compose.foundation.layout.i6.x(wi.j(a0Var5), kh.S(kh.f30051a, 0, 1, null)), q3VarW);
                int i211 = ((i20 >> 9) & 14) | ((i20 << 3) & com.planner5d.library.engine.input.f.b.B) | ((i20 >> 6) & 896);
                androidx.compose.ui.a0 a0VarA14 = androidx.compose.foundation.selection.e.a(androidx.compose.foundation.v.d(a0VarA13, oiVarD.a(z14, z10, c0VarR, i211).getValue().M(), null, 2, null), z10, jVar4, gt.e(false, 0.0f, 0L, 7, null), z14, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.c()), function1);
                androidx.compose.ui.layout.a1 a1VarK7 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), false);
                iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                androidx.compose.runtime.b1 b1VarK7 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN7 = androidx.compose.ui.m.n(c0VarR, a0VarA14);
                androidx.compose.ui.node.g.a aVar7 = androidx.compose.ui.node.g.I;
                function0A = aVar7.a();
                if (c0VarR.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0VarR.q();
                if (c0VarR.P()) {
                    c0VarR.q0(function0A);
                } else {
                    c0VarR.l();
                }
                c0VarD = androidx.compose.runtime.y7.d(c0VarR);
                androidx.compose.runtime.y7.n(c0VarD, a1VarK7, aVar7.e());
                androidx.compose.runtime.y7.n(c0VarD, b1VarK7, aVar7.g());
                function2B = aVar7.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iJ));
                    c0VarD.f(Integer.valueOf(iJ), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iJ));
                    c0VarD.f(Integer.valueOf(iJ), function2B);
                }
                androidx.compose.runtime.y7.n(c0VarD, a0VarN7, aVar7.f());
                androidx.compose.foundation.layout.d0 d0Var7 = androidx.compose.foundation.layout.d0.f15956a;
                androidx.compose.runtime.a1.e(c7.a().f(androidx.compose.ui.graphics.q0.n(oiVarD.b(z14, z10, c0VarR, i211).getValue().M())), function2, c0VarR, androidx.compose.runtime.n4.f36267i | ((i20 >> 18) & com.planner5d.library.engine.input.f.b.B));
                c0VarR.o();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var5;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                z14 = z12;
            }
            oiVar2 = oiVarD;
            jVar3 = jVar2;
            q3Var2 = q3VarW;
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.bi
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ei.O(z10, function1, a0Var3, z14, oiVar2, jVar3, q3Var2, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= androidx.profileinstaller.n.c.f73814m;
        jVar2 = jVar;
        if ((1572864 & i10) == 0) {
            if ((i11 & 64) == 0) {
                q3VarW = q3Var;
                if (c0VarR.D(q3VarW)) {
                }
                i12 |= i23;
            } else {
                q3VarW = q3Var;
            }
            i12 |= i23;
        } else {
            q3VarW = q3Var;
        }
        if ((i11 & 128) != 0) {
            i12 |= 12582912;
        } else if ((i10 & 12582912) == 0) {
            if (c0VarR.k0(function2)) {
                i17 = 8388608;
            } else {
                i17 = 4194304;
            }
            i12 |= i17;
        }
        i18 = i12;
        if ((4793491 & i12) != 4793490) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (c0VarR.h(z13, i18 & 1)) {
            c0VarR.l0();
            if ((i10 & 1) != 0) {
                if (i21 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if (i13 != 0) {
                    z12 = true;
                }
                if ((i11 & 16) != 0) {
                    i19 = i18 & (-57345);
                    oiVarD = kh.f30051a.D(c0VarR, 6);
                } else {
                    i19 = i18;
                }
                if (i15 != 0) {
                    jVar2 = null;
                }
                if ((i11 & 64) != 0) {
                    q3VarW = kh.f30051a.w(c0VarR, 6);
                    i20 = i19 & (-3670017);
                } else {
                    i20 = i19;
                }
                z14 = z12;
                a0Var5 = a0Var4;
            } else {
                if (i21 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if (i13 != 0) {
                    z12 = true;
                }
                if ((i11 & 16) != 0) {
                    i19 = i18 & (-57345);
                    oiVarD = kh.f30051a.D(c0VarR, 6);
                } else {
                    i19 = i18;
                }
                if (i15 != 0) {
                    jVar2 = null;
                }
                if ((i11 & 64) != 0) {
                    q3VarW = kh.f30051a.w(c0VarR, 6);
                    i20 = i19 & (-3670017);
                } else {
                    i20 = i19;
                }
                z14 = z12;
                a0Var5 = a0Var4;
            }
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1724745099, i20, -1, "androidx.compose.material3.IconToggleButtonImpl (IconButton.kt:320)");
            }
            if (jVar2 == null) {
                c0VarR.E(1187972528);
                objI0 = c0VarR.i0();
                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = androidx.compose.foundation.interaction.i.a();
                    c0VarR.Y(objI0);
                }
                jVar4 = (androidx.compose.foundation.interaction.j) objI0;
                c0VarR.A();
            } else {
                c0VarR.E(-377320953);
                c0VarR.A();
                jVar4 = jVar2;
            }
            androidx.compose.ui.a0 a0VarA15 = androidx.compose.ui.draw.j.a(androidx.compose.foundation.layout.i6.x(wi.j(a0Var5), kh.S(kh.f30051a, 0, 1, null)), q3VarW);
            int i212 = ((i20 >> 9) & 14) | ((i20 << 3) & com.planner5d.library.engine.input.f.b.B) | ((i20 >> 6) & 896);
            androidx.compose.ui.a0 a0VarA16 = androidx.compose.foundation.selection.e.a(androidx.compose.foundation.v.d(a0VarA15, oiVarD.a(z14, z10, c0VarR, i212).getValue().M(), null, 2, null), z10, jVar4, gt.e(false, 0.0f, 0L, 7, null), z14, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.c()), function1);
            androidx.compose.ui.layout.a1 a1VarK8 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), false);
            iJ = androidx.compose.runtime.v.j(c0VarR, 0);
            androidx.compose.runtime.b1 b1VarK8 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN8 = androidx.compose.ui.m.n(c0VarR, a0VarA16);
            androidx.compose.ui.node.g.a aVar8 = androidx.compose.ui.node.g.I;
            function0A = aVar8.a();
            if (c0VarR.S() == null) {
                androidx.compose.runtime.v.r();
            }
            c0VarR.q();
            if (c0VarR.P()) {
                c0VarR.q0(function0A);
            } else {
                c0VarR.l();
            }
            c0VarD = androidx.compose.runtime.y7.d(c0VarR);
            androidx.compose.runtime.y7.n(c0VarD, a1VarK8, aVar8.e());
            androidx.compose.runtime.y7.n(c0VarD, b1VarK8, aVar8.g());
            function2B = aVar8.b();
            if (c0VarD.P()) {
                c0VarD.Y(Integer.valueOf(iJ));
                c0VarD.f(Integer.valueOf(iJ), function2B);
            } else {
                c0VarD.Y(Integer.valueOf(iJ));
                c0VarD.f(Integer.valueOf(iJ), function2B);
            }
            androidx.compose.runtime.y7.n(c0VarD, a0VarN8, aVar8.f());
            androidx.compose.foundation.layout.d0 d0Var8 = androidx.compose.foundation.layout.d0.f15956a;
            androidx.compose.runtime.a1.e(c7.a().f(androidx.compose.ui.graphics.q0.n(oiVarD.b(z14, z10, c0VarR, i212).getValue().M())), function2, c0VarR, androidx.compose.runtime.n4.f36267i | ((i20 >> 18) & com.planner5d.library.engine.input.f.b.B));
            c0VarR.o();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            a0Var3 = a0Var5;
        } else {
            c0VarR.u();
            a0Var3 = a0Var2;
            z14 = z12;
        }
        oiVar2 = oiVarD;
        jVar3 = jVar2;
        q3Var2 = q3VarW;
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.bi
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ei.O(z10, function1, a0Var3, z14, oiVar2, jVar3, q3Var2, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit O(boolean z10, Function1 function1, androidx.compose.ui.a0 a0Var, boolean z11, oi oiVar, androidx.compose.foundation.interaction.j jVar, androidx.compose.ui.graphics.q3 q3Var, Function2 function2, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        N(z10, function1, a0Var, z11, oiVar, jVar, q3Var, function2, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    /* JADX WARN: Code duplicated, block: B:111:0x0144 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:112:0x0146  */
    /* JADX WARN: Code duplicated, block: B:113:0x0149  */
    /* JADX WARN: Code duplicated, block: B:115:0x014d  */
    /* JADX WARN: Code duplicated, block: B:118:0x0156  */
    /* JADX WARN: Code duplicated, block: B:121:0x0163  */
    /* JADX WARN: Code duplicated, block: B:124:0x0170  */
    /* JADX WARN: Code duplicated, block: B:126:0x0180  */
    /* JADX WARN: Code duplicated, block: B:128:0x018e  */
    /* JADX WARN: Code duplicated, block: B:131:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:134:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:136:0x01c4  */
    /* JADX WARN: Code duplicated, block: B:139:0x01d5  */
    /* JADX WARN: Code duplicated, block: B:141:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004c  */
    /* JADX WARN: Code duplicated, block: B:28:0x0051  */
    /* JADX WARN: Code duplicated, block: B:30:0x0055  */
    /* JADX WARN: Code duplicated, block: B:32:0x005d  */
    /* JADX WARN: Code duplicated, block: B:33:0x0060  */
    /* JADX WARN: Code duplicated, block: B:37:0x0067  */
    /* JADX WARN: Code duplicated, block: B:39:0x006b  */
    /* JADX WARN: Code duplicated, block: B:41:0x0073  */
    /* JADX WARN: Code duplicated, block: B:42:0x0076  */
    /* JADX WARN: Code duplicated, block: B:45:0x007e  */
    /* JADX WARN: Code duplicated, block: B:48:0x0084  */
    /* JADX WARN: Code duplicated, block: B:50:0x0088  */
    /* JADX WARN: Code duplicated, block: B:52:0x0090  */
    /* JADX WARN: Code duplicated, block: B:53:0x0093  */
    /* JADX WARN: Code duplicated, block: B:56:0x0099  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ac  */
    /* JADX WARN: Code duplicated, block: B:64:0x00af  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:76:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:77:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:81:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:83:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:87:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:88:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:92:0x0102  */
    /* JADX WARN: Code duplicated, block: B:93:0x0105  */
    /* JADX WARN: Code duplicated, block: B:96:0x010e  */
    /* JADX WARN: Code duplicated, block: B:98:0x011b  */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void P(@NotNull final Function0<Unit> function0, @Nullable androidx.compose.ui.a0 a0Var, boolean z10, @Nullable androidx.compose.ui.graphics.q3 q3Var, @Nullable jh jhVar, @Nullable androidx.compose.foundation.a1 a1Var, @Nullable androidx.compose.foundation.interaction.j jVar, @NotNull final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        Function0<Unit> function1;
        int i12;
        androidx.compose.ui.a0 a0Var2;
        int i13;
        boolean z11;
        int i14;
        androidx.compose.ui.graphics.q3 q3VarV;
        jh jhVarG;
        androidx.compose.foundation.a1 a1Var2;
        int i15;
        androidx.compose.foundation.interaction.j jVar2;
        int i16;
        int i17;
        boolean z12;
        androidx.compose.runtime.c0 c0Var2;
        final androidx.compose.ui.a0 a0Var3;
        final boolean z13;
        final androidx.compose.ui.graphics.q3 q3Var2;
        final jh jhVar2;
        final androidx.compose.foundation.a1 a1Var3;
        final androidx.compose.foundation.interaction.j jVar3;
        androidx.compose.runtime.s5 s5VarT;
        androidx.compose.ui.a0 a0Var4;
        androidx.compose.foundation.interaction.j jVar4;
        int i18;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1481353380);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
            function1 = function0;
        } else {
            function1 = function0;
            if ((i10 & 6) == 0) {
                i12 = (c0VarR.k0(function1) ? 4 : 2) | i10;
            } else {
                i12 = i10;
            }
        }
        int i19 = i11 & 2;
        if (i19 == 0) {
            if ((i10 & 48) == 0) {
                a0Var2 = a0Var;
                i12 |= c0VarR.D(a0Var2) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                    z11 = z10;
                    if (c0VarR.G(z11)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                if ((i10 & 3072) == 0) {
                    if ((i11 & 8) == 0) {
                        q3VarV = q3Var;
                        int i20 = c0VarR.D(q3VarV) ? 2048 : 1024;
                        i12 |= i20;
                    } else {
                        q3VarV = q3Var;
                    }
                    i12 |= i20;
                } else {
                    q3VarV = q3Var;
                }
                if ((i10 & 24576) == 0) {
                    if ((i11 & 16) == 0) {
                        jhVarG = jhVar;
                        int i21 = c0VarR.D(jhVarG) ? 16384 : 8192;
                        i12 |= i21;
                    } else {
                        jhVarG = jhVar;
                    }
                    i12 |= i21;
                } else {
                    jhVarG = jhVar;
                }
                if ((196608 & i10) == 0) {
                    if ((i11 & 32) == 0) {
                        a1Var2 = a1Var;
                        int i22 = c0VarR.D(a1Var2) ? 131072 : 65536;
                        i12 |= i22;
                    } else {
                        a1Var2 = a1Var;
                    }
                    i12 |= i22;
                } else {
                    a1Var2 = a1Var;
                }
                i15 = i11 & 64;
                if (i15 != 0) {
                    if ((1572864 & i10) == 0) {
                        jVar2 = jVar;
                        if (c0VarR.D(jVar2)) {
                            i16 = 1048576;
                        } else {
                            i16 = 524288;
                        }
                        i12 |= i16;
                    }
                    if ((i11 & 128) != 0) {
                        if ((i10 & 12582912) == 0) {
                            if (c0VarR.k0(function2)) {
                                i17 = 8388608;
                            } else {
                                i17 = 4194304;
                            }
                            i12 |= i17;
                        }
                        if ((i12 & 4793491) != 4793490) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (c0VarR.h(z12, i12 & 1)) {
                            c0VarR.l0();
                            if ((i10 & 1) != 0 || c0VarR.y()) {
                                if (i19 != 0) {
                                    a0Var4 = androidx.compose.ui.a0.E;
                                } else {
                                    a0Var4 = a0Var2;
                                }
                                if (i13 != 0) {
                                    z11 = true;
                                }
                                if ((i11 & 8) != 0) {
                                    i12 &= -7169;
                                    q3VarV = kh.f30051a.v(c0VarR, 6);
                                }
                                if ((i11 & 16) != 0) {
                                    i12 &= -57345;
                                    jhVarG = kh.f30051a.G(c0VarR, 6);
                                }
                                if ((i11 & 32) != 0) {
                                    androidx.compose.foundation.a1 a1VarF = kh.f30051a.F(z11, c0VarR, ((i12 >> 6) & 14) | 48);
                                    i12 &= -458753;
                                    a1Var2 = a1VarF;
                                }
                                if (i15 != 0) {
                                    jVar4 = null;
                                } else {
                                    jVar4 = jVar2;
                                }
                                i18 = -1481353380;
                            } else {
                                c0VarR.u();
                                if ((i11 & 8) != 0) {
                                    i12 &= -7169;
                                }
                                if ((i11 & 16) != 0) {
                                    i12 &= -57345;
                                }
                                if ((i11 & 32) != 0) {
                                    i12 &= -458753;
                                }
                                z11 = z11;
                                jhVarG = jhVarG;
                                a1Var2 = a1Var2;
                                jVar4 = jVar2;
                                i18 = -1481353380;
                                a0Var4 = a0Var2;
                                q3VarV = q3VarV;
                            }
                            c0VarR.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(i18, i12, -1, "androidx.compose.material3.OutlinedIconButton (IconButton.kt:616)");
                            }
                            c0Var2 = c0VarR;
                            U(function1, a0Var4, z11, q3VarV, jhVarG, a1Var2, jVar4, function2, c0Var2, i12 & 33554430);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            a0Var3 = a0Var4;
                            z13 = z11;
                            q3Var2 = q3VarV;
                            jhVar2 = jhVarG;
                            a1Var3 = a1Var2;
                            jVar3 = jVar4;
                        } else {
                            c0Var2 = c0VarR;
                            c0Var2.u();
                            a0Var3 = a0Var2;
                            z13 = z11;
                            q3Var2 = q3VarV;
                            jhVar2 = jhVarG;
                            a1Var3 = a1Var2;
                            jVar3 = jVar2;
                        }
                        s5VarT = c0Var2.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material3.mh
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return ei.Q(function0, a0Var3, z13, q3Var2, jhVar2, a1Var3, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i12 |= 12582912;
                    if ((i12 & 4793491) != 4793490) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (c0VarR.h(z12, i12 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i19 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            }
                            if ((i11 & 8) != 0) {
                                i12 &= -7169;
                                q3VarV = kh.f30051a.v(c0VarR, 6);
                            }
                            if ((i11 & 16) != 0) {
                                i12 &= -57345;
                                jhVarG = kh.f30051a.G(c0VarR, 6);
                            }
                            if ((i11 & 32) != 0) {
                                androidx.compose.foundation.a1 a1VarF2 = kh.f30051a.F(z11, c0VarR, ((i12 >> 6) & 14) | 48);
                                i12 &= -458753;
                                a1Var2 = a1VarF2;
                            }
                            if (i15 != 0) {
                                jVar4 = null;
                            } else {
                                jVar4 = jVar2;
                            }
                            i18 = -1481353380;
                        } else {
                            if (i19 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            }
                            if ((i11 & 8) != 0) {
                                i12 &= -7169;
                                q3VarV = kh.f30051a.v(c0VarR, 6);
                            }
                            if ((i11 & 16) != 0) {
                                i12 &= -57345;
                                jhVarG = kh.f30051a.G(c0VarR, 6);
                            }
                            if ((i11 & 32) != 0) {
                                androidx.compose.foundation.a1 a1VarF3 = kh.f30051a.F(z11, c0VarR, ((i12 >> 6) & 14) | 48);
                                i12 &= -458753;
                                a1Var2 = a1VarF3;
                            }
                            if (i15 != 0) {
                                jVar4 = null;
                            } else {
                                jVar4 = jVar2;
                            }
                            i18 = -1481353380;
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(i18, i12, -1, "androidx.compose.material3.OutlinedIconButton (IconButton.kt:616)");
                        }
                        c0Var2 = c0VarR;
                        U(function1, a0Var4, z11, q3VarV, jhVarG, a1Var2, jVar4, function2, c0Var2, i12 & 33554430);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var4;
                        z13 = z11;
                        q3Var2 = q3VarV;
                        jhVar2 = jhVarG;
                        a1Var3 = a1Var2;
                        jVar3 = jVar4;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        a0Var3 = a0Var2;
                        z13 = z11;
                        q3Var2 = q3VarV;
                        jhVar2 = jhVarG;
                        a1Var3 = a1Var2;
                        jVar3 = jVar2;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.mh
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return ei.Q(function0, a0Var3, z13, q3Var2, jhVar2, a1Var3, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 1572864;
                jVar2 = jVar;
                if ((i11 & 128) != 0) {
                    if ((i10 & 12582912) == 0) {
                        if (c0VarR.k0(function2)) {
                            i17 = 8388608;
                        } else {
                            i17 = 4194304;
                        }
                        i12 |= i17;
                    }
                    if ((i12 & 4793491) != 4793490) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (c0VarR.h(z12, i12 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i19 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            }
                            if ((i11 & 8) != 0) {
                                i12 &= -7169;
                                q3VarV = kh.f30051a.v(c0VarR, 6);
                            }
                            if ((i11 & 16) != 0) {
                                i12 &= -57345;
                                jhVarG = kh.f30051a.G(c0VarR, 6);
                            }
                            if ((i11 & 32) != 0) {
                                androidx.compose.foundation.a1 a1VarF4 = kh.f30051a.F(z11, c0VarR, ((i12 >> 6) & 14) | 48);
                                i12 &= -458753;
                                a1Var2 = a1VarF4;
                            }
                            if (i15 != 0) {
                                jVar4 = null;
                            } else {
                                jVar4 = jVar2;
                            }
                            i18 = -1481353380;
                        } else {
                            if (i19 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            }
                            if ((i11 & 8) != 0) {
                                i12 &= -7169;
                                q3VarV = kh.f30051a.v(c0VarR, 6);
                            }
                            if ((i11 & 16) != 0) {
                                i12 &= -57345;
                                jhVarG = kh.f30051a.G(c0VarR, 6);
                            }
                            if ((i11 & 32) != 0) {
                                androidx.compose.foundation.a1 a1VarF5 = kh.f30051a.F(z11, c0VarR, ((i12 >> 6) & 14) | 48);
                                i12 &= -458753;
                                a1Var2 = a1VarF5;
                            }
                            if (i15 != 0) {
                                jVar4 = null;
                            } else {
                                jVar4 = jVar2;
                            }
                            i18 = -1481353380;
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(i18, i12, -1, "androidx.compose.material3.OutlinedIconButton (IconButton.kt:616)");
                        }
                        c0Var2 = c0VarR;
                        U(function1, a0Var4, z11, q3VarV, jhVarG, a1Var2, jVar4, function2, c0Var2, i12 & 33554430);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var4;
                        z13 = z11;
                        q3Var2 = q3VarV;
                        jhVar2 = jhVarG;
                        a1Var3 = a1Var2;
                        jVar3 = jVar4;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        a0Var3 = a0Var2;
                        z13 = z11;
                        q3Var2 = q3VarV;
                        jhVar2 = jhVarG;
                        a1Var3 = a1Var2;
                        jVar3 = jVar2;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.mh
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return ei.Q(function0, a0Var3, z13, q3Var2, jhVar2, a1Var3, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 12582912;
                if ((i12 & 4793491) != 4793490) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i19 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            q3VarV = kh.f30051a.v(c0VarR, 6);
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                            jhVarG = kh.f30051a.G(c0VarR, 6);
                        }
                        if ((i11 & 32) != 0) {
                            androidx.compose.foundation.a1 a1VarF6 = kh.f30051a.F(z11, c0VarR, ((i12 >> 6) & 14) | 48);
                            i12 &= -458753;
                            a1Var2 = a1VarF6;
                        }
                        if (i15 != 0) {
                            jVar4 = null;
                        } else {
                            jVar4 = jVar2;
                        }
                        i18 = -1481353380;
                    } else {
                        if (i19 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            q3VarV = kh.f30051a.v(c0VarR, 6);
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                            jhVarG = kh.f30051a.G(c0VarR, 6);
                        }
                        if ((i11 & 32) != 0) {
                            androidx.compose.foundation.a1 a1VarF7 = kh.f30051a.F(z11, c0VarR, ((i12 >> 6) & 14) | 48);
                            i12 &= -458753;
                            a1Var2 = a1VarF7;
                        }
                        if (i15 != 0) {
                            jVar4 = null;
                        } else {
                            jVar4 = jVar2;
                        }
                        i18 = -1481353380;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(i18, i12, -1, "androidx.compose.material3.OutlinedIconButton (IconButton.kt:616)");
                    }
                    c0Var2 = c0VarR;
                    U(function1, a0Var4, z11, q3VarV, jhVarG, a1Var2, jVar4, function2, c0Var2, i12 & 33554430);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var4;
                    z13 = z11;
                    q3Var2 = q3VarV;
                    jhVar2 = jhVarG;
                    a1Var3 = a1Var2;
                    jVar3 = jVar4;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var3 = a0Var2;
                    z13 = z11;
                    q3Var2 = q3VarV;
                    jhVar2 = jhVarG;
                    a1Var3 = a1Var2;
                    jVar3 = jVar2;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.mh
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ei.Q(function0, a0Var3, z13, q3Var2, jhVar2, a1Var3, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= androidx.media3.exoplayer.a5.S0;
            z11 = z10;
            if ((i10 & 3072) == 0) {
                if ((i11 & 8) == 0) {
                    q3VarV = q3Var;
                    if (c0VarR.D(q3VarV)) {
                    }
                    i12 |= i20;
                } else {
                    q3VarV = q3Var;
                }
                i12 |= i20;
            } else {
                q3VarV = q3Var;
            }
            if ((i10 & 24576) == 0) {
                if ((i11 & 16) == 0) {
                    jhVarG = jhVar;
                    if (c0VarR.D(jhVarG)) {
                    }
                    i12 |= i21;
                } else {
                    jhVarG = jhVar;
                }
                i12 |= i21;
            } else {
                jhVarG = jhVar;
            }
            if ((196608 & i10) == 0) {
                if ((i11 & 32) == 0) {
                    a1Var2 = a1Var;
                    if (c0VarR.D(a1Var2)) {
                    }
                    i12 |= i22;
                } else {
                    a1Var2 = a1Var;
                }
                i12 |= i22;
            } else {
                a1Var2 = a1Var;
            }
            i15 = i11 & 64;
            if (i15 != 0) {
                if ((1572864 & i10) == 0) {
                    jVar2 = jVar;
                    if (c0VarR.D(jVar2)) {
                        i16 = 1048576;
                    } else {
                        i16 = 524288;
                    }
                    i12 |= i16;
                }
                if ((i11 & 128) != 0) {
                    if ((i10 & 12582912) == 0) {
                        if (c0VarR.k0(function2)) {
                            i17 = 8388608;
                        } else {
                            i17 = 4194304;
                        }
                        i12 |= i17;
                    }
                    if ((i12 & 4793491) != 4793490) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (c0VarR.h(z12, i12 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i19 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            }
                            if ((i11 & 8) != 0) {
                                i12 &= -7169;
                                q3VarV = kh.f30051a.v(c0VarR, 6);
                            }
                            if ((i11 & 16) != 0) {
                                i12 &= -57345;
                                jhVarG = kh.f30051a.G(c0VarR, 6);
                            }
                            if ((i11 & 32) != 0) {
                                androidx.compose.foundation.a1 a1VarF8 = kh.f30051a.F(z11, c0VarR, ((i12 >> 6) & 14) | 48);
                                i12 &= -458753;
                                a1Var2 = a1VarF8;
                            }
                            if (i15 != 0) {
                                jVar4 = null;
                            } else {
                                jVar4 = jVar2;
                            }
                            i18 = -1481353380;
                        } else {
                            if (i19 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            }
                            if ((i11 & 8) != 0) {
                                i12 &= -7169;
                                q3VarV = kh.f30051a.v(c0VarR, 6);
                            }
                            if ((i11 & 16) != 0) {
                                i12 &= -57345;
                                jhVarG = kh.f30051a.G(c0VarR, 6);
                            }
                            if ((i11 & 32) != 0) {
                                androidx.compose.foundation.a1 a1VarF9 = kh.f30051a.F(z11, c0VarR, ((i12 >> 6) & 14) | 48);
                                i12 &= -458753;
                                a1Var2 = a1VarF9;
                            }
                            if (i15 != 0) {
                                jVar4 = null;
                            } else {
                                jVar4 = jVar2;
                            }
                            i18 = -1481353380;
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(i18, i12, -1, "androidx.compose.material3.OutlinedIconButton (IconButton.kt:616)");
                        }
                        c0Var2 = c0VarR;
                        U(function1, a0Var4, z11, q3VarV, jhVarG, a1Var2, jVar4, function2, c0Var2, i12 & 33554430);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var4;
                        z13 = z11;
                        q3Var2 = q3VarV;
                        jhVar2 = jhVarG;
                        a1Var3 = a1Var2;
                        jVar3 = jVar4;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        a0Var3 = a0Var2;
                        z13 = z11;
                        q3Var2 = q3VarV;
                        jhVar2 = jhVarG;
                        a1Var3 = a1Var2;
                        jVar3 = jVar2;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.mh
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return ei.Q(function0, a0Var3, z13, q3Var2, jhVar2, a1Var3, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 12582912;
                if ((i12 & 4793491) != 4793490) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i19 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            q3VarV = kh.f30051a.v(c0VarR, 6);
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                            jhVarG = kh.f30051a.G(c0VarR, 6);
                        }
                        if ((i11 & 32) != 0) {
                            androidx.compose.foundation.a1 a1VarF10 = kh.f30051a.F(z11, c0VarR, ((i12 >> 6) & 14) | 48);
                            i12 &= -458753;
                            a1Var2 = a1VarF10;
                        }
                        if (i15 != 0) {
                            jVar4 = null;
                        } else {
                            jVar4 = jVar2;
                        }
                        i18 = -1481353380;
                    } else {
                        if (i19 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            q3VarV = kh.f30051a.v(c0VarR, 6);
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                            jhVarG = kh.f30051a.G(c0VarR, 6);
                        }
                        if ((i11 & 32) != 0) {
                            androidx.compose.foundation.a1 a1VarF11 = kh.f30051a.F(z11, c0VarR, ((i12 >> 6) & 14) | 48);
                            i12 &= -458753;
                            a1Var2 = a1VarF11;
                        }
                        if (i15 != 0) {
                            jVar4 = null;
                        } else {
                            jVar4 = jVar2;
                        }
                        i18 = -1481353380;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(i18, i12, -1, "androidx.compose.material3.OutlinedIconButton (IconButton.kt:616)");
                    }
                    c0Var2 = c0VarR;
                    U(function1, a0Var4, z11, q3VarV, jhVarG, a1Var2, jVar4, function2, c0Var2, i12 & 33554430);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var4;
                    z13 = z11;
                    q3Var2 = q3VarV;
                    jhVar2 = jhVarG;
                    a1Var3 = a1Var2;
                    jVar3 = jVar4;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var3 = a0Var2;
                    z13 = z11;
                    q3Var2 = q3VarV;
                    jhVar2 = jhVarG;
                    a1Var3 = a1Var2;
                    jVar3 = jVar2;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.mh
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ei.Q(function0, a0Var3, z13, q3Var2, jhVar2, a1Var3, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 1572864;
            jVar2 = jVar;
            if ((i11 & 128) != 0) {
                if ((i10 & 12582912) == 0) {
                    if (c0VarR.k0(function2)) {
                        i17 = 8388608;
                    } else {
                        i17 = 4194304;
                    }
                    i12 |= i17;
                }
                if ((i12 & 4793491) != 4793490) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i19 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            q3VarV = kh.f30051a.v(c0VarR, 6);
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                            jhVarG = kh.f30051a.G(c0VarR, 6);
                        }
                        if ((i11 & 32) != 0) {
                            androidx.compose.foundation.a1 a1VarF12 = kh.f30051a.F(z11, c0VarR, ((i12 >> 6) & 14) | 48);
                            i12 &= -458753;
                            a1Var2 = a1VarF12;
                        }
                        if (i15 != 0) {
                            jVar4 = null;
                        } else {
                            jVar4 = jVar2;
                        }
                        i18 = -1481353380;
                    } else {
                        if (i19 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            q3VarV = kh.f30051a.v(c0VarR, 6);
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                            jhVarG = kh.f30051a.G(c0VarR, 6);
                        }
                        if ((i11 & 32) != 0) {
                            androidx.compose.foundation.a1 a1VarF13 = kh.f30051a.F(z11, c0VarR, ((i12 >> 6) & 14) | 48);
                            i12 &= -458753;
                            a1Var2 = a1VarF13;
                        }
                        if (i15 != 0) {
                            jVar4 = null;
                        } else {
                            jVar4 = jVar2;
                        }
                        i18 = -1481353380;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(i18, i12, -1, "androidx.compose.material3.OutlinedIconButton (IconButton.kt:616)");
                    }
                    c0Var2 = c0VarR;
                    U(function1, a0Var4, z11, q3VarV, jhVarG, a1Var2, jVar4, function2, c0Var2, i12 & 33554430);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var4;
                    z13 = z11;
                    q3Var2 = q3VarV;
                    jhVar2 = jhVarG;
                    a1Var3 = a1Var2;
                    jVar3 = jVar4;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var3 = a0Var2;
                    z13 = z11;
                    q3Var2 = q3VarV;
                    jhVar2 = jhVarG;
                    a1Var3 = a1Var2;
                    jVar3 = jVar2;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.mh
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ei.Q(function0, a0Var3, z13, q3Var2, jhVar2, a1Var3, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 12582912;
            if ((i12 & 4793491) != 4793490) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i19 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        q3VarV = kh.f30051a.v(c0VarR, 6);
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        jhVarG = kh.f30051a.G(c0VarR, 6);
                    }
                    if ((i11 & 32) != 0) {
                        androidx.compose.foundation.a1 a1VarF14 = kh.f30051a.F(z11, c0VarR, ((i12 >> 6) & 14) | 48);
                        i12 &= -458753;
                        a1Var2 = a1VarF14;
                    }
                    if (i15 != 0) {
                        jVar4 = null;
                    } else {
                        jVar4 = jVar2;
                    }
                    i18 = -1481353380;
                } else {
                    if (i19 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        q3VarV = kh.f30051a.v(c0VarR, 6);
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        jhVarG = kh.f30051a.G(c0VarR, 6);
                    }
                    if ((i11 & 32) != 0) {
                        androidx.compose.foundation.a1 a1VarF15 = kh.f30051a.F(z11, c0VarR, ((i12 >> 6) & 14) | 48);
                        i12 &= -458753;
                        a1Var2 = a1VarF15;
                    }
                    if (i15 != 0) {
                        jVar4 = null;
                    } else {
                        jVar4 = jVar2;
                    }
                    i18 = -1481353380;
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(i18, i12, -1, "androidx.compose.material3.OutlinedIconButton (IconButton.kt:616)");
                }
                c0Var2 = c0VarR;
                U(function1, a0Var4, z11, q3VarV, jhVarG, a1Var2, jVar4, function2, c0Var2, i12 & 33554430);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var4;
                z13 = z11;
                q3Var2 = q3VarV;
                jhVar2 = jhVarG;
                a1Var3 = a1Var2;
                jVar3 = jVar4;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var3 = a0Var2;
                z13 = z11;
                q3Var2 = q3VarV;
                jhVar2 = jhVarG;
                a1Var3 = a1Var2;
                jVar3 = jVar2;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.mh
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ei.Q(function0, a0Var3, z13, q3Var2, jhVar2, a1Var3, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 48;
        a0Var2 = a0Var;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                z11 = z10;
                if (c0VarR.G(z11)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            if ((i10 & 3072) == 0) {
                if ((i11 & 8) == 0) {
                    q3VarV = q3Var;
                    if (c0VarR.D(q3VarV)) {
                    }
                    i12 |= i20;
                } else {
                    q3VarV = q3Var;
                }
                i12 |= i20;
            } else {
                q3VarV = q3Var;
            }
            if ((i10 & 24576) == 0) {
                if ((i11 & 16) == 0) {
                    jhVarG = jhVar;
                    if (c0VarR.D(jhVarG)) {
                    }
                    i12 |= i21;
                } else {
                    jhVarG = jhVar;
                }
                i12 |= i21;
            } else {
                jhVarG = jhVar;
            }
            if ((196608 & i10) == 0) {
                if ((i11 & 32) == 0) {
                    a1Var2 = a1Var;
                    if (c0VarR.D(a1Var2)) {
                    }
                    i12 |= i22;
                } else {
                    a1Var2 = a1Var;
                }
                i12 |= i22;
            } else {
                a1Var2 = a1Var;
            }
            i15 = i11 & 64;
            if (i15 != 0) {
                if ((1572864 & i10) == 0) {
                    jVar2 = jVar;
                    if (c0VarR.D(jVar2)) {
                        i16 = 1048576;
                    } else {
                        i16 = 524288;
                    }
                    i12 |= i16;
                }
                if ((i11 & 128) != 0) {
                    if ((i10 & 12582912) == 0) {
                        if (c0VarR.k0(function2)) {
                            i17 = 8388608;
                        } else {
                            i17 = 4194304;
                        }
                        i12 |= i17;
                    }
                    if ((i12 & 4793491) != 4793490) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (c0VarR.h(z12, i12 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i19 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            }
                            if ((i11 & 8) != 0) {
                                i12 &= -7169;
                                q3VarV = kh.f30051a.v(c0VarR, 6);
                            }
                            if ((i11 & 16) != 0) {
                                i12 &= -57345;
                                jhVarG = kh.f30051a.G(c0VarR, 6);
                            }
                            if ((i11 & 32) != 0) {
                                androidx.compose.foundation.a1 a1VarF16 = kh.f30051a.F(z11, c0VarR, ((i12 >> 6) & 14) | 48);
                                i12 &= -458753;
                                a1Var2 = a1VarF16;
                            }
                            if (i15 != 0) {
                                jVar4 = null;
                            } else {
                                jVar4 = jVar2;
                            }
                            i18 = -1481353380;
                        } else {
                            if (i19 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            }
                            if ((i11 & 8) != 0) {
                                i12 &= -7169;
                                q3VarV = kh.f30051a.v(c0VarR, 6);
                            }
                            if ((i11 & 16) != 0) {
                                i12 &= -57345;
                                jhVarG = kh.f30051a.G(c0VarR, 6);
                            }
                            if ((i11 & 32) != 0) {
                                androidx.compose.foundation.a1 a1VarF17 = kh.f30051a.F(z11, c0VarR, ((i12 >> 6) & 14) | 48);
                                i12 &= -458753;
                                a1Var2 = a1VarF17;
                            }
                            if (i15 != 0) {
                                jVar4 = null;
                            } else {
                                jVar4 = jVar2;
                            }
                            i18 = -1481353380;
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(i18, i12, -1, "androidx.compose.material3.OutlinedIconButton (IconButton.kt:616)");
                        }
                        c0Var2 = c0VarR;
                        U(function1, a0Var4, z11, q3VarV, jhVarG, a1Var2, jVar4, function2, c0Var2, i12 & 33554430);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var4;
                        z13 = z11;
                        q3Var2 = q3VarV;
                        jhVar2 = jhVarG;
                        a1Var3 = a1Var2;
                        jVar3 = jVar4;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        a0Var3 = a0Var2;
                        z13 = z11;
                        q3Var2 = q3VarV;
                        jhVar2 = jhVarG;
                        a1Var3 = a1Var2;
                        jVar3 = jVar2;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.mh
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return ei.Q(function0, a0Var3, z13, q3Var2, jhVar2, a1Var3, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 12582912;
                if ((i12 & 4793491) != 4793490) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i19 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            q3VarV = kh.f30051a.v(c0VarR, 6);
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                            jhVarG = kh.f30051a.G(c0VarR, 6);
                        }
                        if ((i11 & 32) != 0) {
                            androidx.compose.foundation.a1 a1VarF18 = kh.f30051a.F(z11, c0VarR, ((i12 >> 6) & 14) | 48);
                            i12 &= -458753;
                            a1Var2 = a1VarF18;
                        }
                        if (i15 != 0) {
                            jVar4 = null;
                        } else {
                            jVar4 = jVar2;
                        }
                        i18 = -1481353380;
                    } else {
                        if (i19 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            q3VarV = kh.f30051a.v(c0VarR, 6);
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                            jhVarG = kh.f30051a.G(c0VarR, 6);
                        }
                        if ((i11 & 32) != 0) {
                            androidx.compose.foundation.a1 a1VarF19 = kh.f30051a.F(z11, c0VarR, ((i12 >> 6) & 14) | 48);
                            i12 &= -458753;
                            a1Var2 = a1VarF19;
                        }
                        if (i15 != 0) {
                            jVar4 = null;
                        } else {
                            jVar4 = jVar2;
                        }
                        i18 = -1481353380;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(i18, i12, -1, "androidx.compose.material3.OutlinedIconButton (IconButton.kt:616)");
                    }
                    c0Var2 = c0VarR;
                    U(function1, a0Var4, z11, q3VarV, jhVarG, a1Var2, jVar4, function2, c0Var2, i12 & 33554430);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var4;
                    z13 = z11;
                    q3Var2 = q3VarV;
                    jhVar2 = jhVarG;
                    a1Var3 = a1Var2;
                    jVar3 = jVar4;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var3 = a0Var2;
                    z13 = z11;
                    q3Var2 = q3VarV;
                    jhVar2 = jhVarG;
                    a1Var3 = a1Var2;
                    jVar3 = jVar2;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.mh
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ei.Q(function0, a0Var3, z13, q3Var2, jhVar2, a1Var3, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 1572864;
            jVar2 = jVar;
            if ((i11 & 128) != 0) {
                if ((i10 & 12582912) == 0) {
                    if (c0VarR.k0(function2)) {
                        i17 = 8388608;
                    } else {
                        i17 = 4194304;
                    }
                    i12 |= i17;
                }
                if ((i12 & 4793491) != 4793490) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i19 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            q3VarV = kh.f30051a.v(c0VarR, 6);
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                            jhVarG = kh.f30051a.G(c0VarR, 6);
                        }
                        if ((i11 & 32) != 0) {
                            androidx.compose.foundation.a1 a1VarF110 = kh.f30051a.F(z11, c0VarR, ((i12 >> 6) & 14) | 48);
                            i12 &= -458753;
                            a1Var2 = a1VarF110;
                        }
                        if (i15 != 0) {
                            jVar4 = null;
                        } else {
                            jVar4 = jVar2;
                        }
                        i18 = -1481353380;
                    } else {
                        if (i19 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            q3VarV = kh.f30051a.v(c0VarR, 6);
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                            jhVarG = kh.f30051a.G(c0VarR, 6);
                        }
                        if ((i11 & 32) != 0) {
                            androidx.compose.foundation.a1 a1VarF111 = kh.f30051a.F(z11, c0VarR, ((i12 >> 6) & 14) | 48);
                            i12 &= -458753;
                            a1Var2 = a1VarF111;
                        }
                        if (i15 != 0) {
                            jVar4 = null;
                        } else {
                            jVar4 = jVar2;
                        }
                        i18 = -1481353380;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(i18, i12, -1, "androidx.compose.material3.OutlinedIconButton (IconButton.kt:616)");
                    }
                    c0Var2 = c0VarR;
                    U(function1, a0Var4, z11, q3VarV, jhVarG, a1Var2, jVar4, function2, c0Var2, i12 & 33554430);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var4;
                    z13 = z11;
                    q3Var2 = q3VarV;
                    jhVar2 = jhVarG;
                    a1Var3 = a1Var2;
                    jVar3 = jVar4;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var3 = a0Var2;
                    z13 = z11;
                    q3Var2 = q3VarV;
                    jhVar2 = jhVarG;
                    a1Var3 = a1Var2;
                    jVar3 = jVar2;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.mh
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ei.Q(function0, a0Var3, z13, q3Var2, jhVar2, a1Var3, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 12582912;
            if ((i12 & 4793491) != 4793490) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i19 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        q3VarV = kh.f30051a.v(c0VarR, 6);
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        jhVarG = kh.f30051a.G(c0VarR, 6);
                    }
                    if ((i11 & 32) != 0) {
                        androidx.compose.foundation.a1 a1VarF112 = kh.f30051a.F(z11, c0VarR, ((i12 >> 6) & 14) | 48);
                        i12 &= -458753;
                        a1Var2 = a1VarF112;
                    }
                    if (i15 != 0) {
                        jVar4 = null;
                    } else {
                        jVar4 = jVar2;
                    }
                    i18 = -1481353380;
                } else {
                    if (i19 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        q3VarV = kh.f30051a.v(c0VarR, 6);
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        jhVarG = kh.f30051a.G(c0VarR, 6);
                    }
                    if ((i11 & 32) != 0) {
                        androidx.compose.foundation.a1 a1VarF113 = kh.f30051a.F(z11, c0VarR, ((i12 >> 6) & 14) | 48);
                        i12 &= -458753;
                        a1Var2 = a1VarF113;
                    }
                    if (i15 != 0) {
                        jVar4 = null;
                    } else {
                        jVar4 = jVar2;
                    }
                    i18 = -1481353380;
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(i18, i12, -1, "androidx.compose.material3.OutlinedIconButton (IconButton.kt:616)");
                }
                c0Var2 = c0VarR;
                U(function1, a0Var4, z11, q3VarV, jhVarG, a1Var2, jVar4, function2, c0Var2, i12 & 33554430);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var4;
                z13 = z11;
                q3Var2 = q3VarV;
                jhVar2 = jhVarG;
                a1Var3 = a1Var2;
                jVar3 = jVar4;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var3 = a0Var2;
                z13 = z11;
                q3Var2 = q3VarV;
                jhVar2 = jhVarG;
                a1Var3 = a1Var2;
                jVar3 = jVar2;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.mh
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ei.Q(function0, a0Var3, z13, q3Var2, jhVar2, a1Var3, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= androidx.media3.exoplayer.a5.S0;
        z11 = z10;
        if ((i10 & 3072) == 0) {
            if ((i11 & 8) == 0) {
                q3VarV = q3Var;
                if (c0VarR.D(q3VarV)) {
                }
                i12 |= i20;
            } else {
                q3VarV = q3Var;
            }
            i12 |= i20;
        } else {
            q3VarV = q3Var;
        }
        if ((i10 & 24576) == 0) {
            if ((i11 & 16) == 0) {
                jhVarG = jhVar;
                if (c0VarR.D(jhVarG)) {
                }
                i12 |= i21;
            } else {
                jhVarG = jhVar;
            }
            i12 |= i21;
        } else {
            jhVarG = jhVar;
        }
        if ((196608 & i10) == 0) {
            if ((i11 & 32) == 0) {
                a1Var2 = a1Var;
                if (c0VarR.D(a1Var2)) {
                }
                i12 |= i22;
            } else {
                a1Var2 = a1Var;
            }
            i12 |= i22;
        } else {
            a1Var2 = a1Var;
        }
        i15 = i11 & 64;
        if (i15 != 0) {
            if ((1572864 & i10) == 0) {
                jVar2 = jVar;
                if (c0VarR.D(jVar2)) {
                    i16 = 1048576;
                } else {
                    i16 = 524288;
                }
                i12 |= i16;
            }
            if ((i11 & 128) != 0) {
                if ((i10 & 12582912) == 0) {
                    if (c0VarR.k0(function2)) {
                        i17 = 8388608;
                    } else {
                        i17 = 4194304;
                    }
                    i12 |= i17;
                }
                if ((i12 & 4793491) != 4793490) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i19 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            q3VarV = kh.f30051a.v(c0VarR, 6);
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                            jhVarG = kh.f30051a.G(c0VarR, 6);
                        }
                        if ((i11 & 32) != 0) {
                            androidx.compose.foundation.a1 a1VarF114 = kh.f30051a.F(z11, c0VarR, ((i12 >> 6) & 14) | 48);
                            i12 &= -458753;
                            a1Var2 = a1VarF114;
                        }
                        if (i15 != 0) {
                            jVar4 = null;
                        } else {
                            jVar4 = jVar2;
                        }
                        i18 = -1481353380;
                    } else {
                        if (i19 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            q3VarV = kh.f30051a.v(c0VarR, 6);
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                            jhVarG = kh.f30051a.G(c0VarR, 6);
                        }
                        if ((i11 & 32) != 0) {
                            androidx.compose.foundation.a1 a1VarF115 = kh.f30051a.F(z11, c0VarR, ((i12 >> 6) & 14) | 48);
                            i12 &= -458753;
                            a1Var2 = a1VarF115;
                        }
                        if (i15 != 0) {
                            jVar4 = null;
                        } else {
                            jVar4 = jVar2;
                        }
                        i18 = -1481353380;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(i18, i12, -1, "androidx.compose.material3.OutlinedIconButton (IconButton.kt:616)");
                    }
                    c0Var2 = c0VarR;
                    U(function1, a0Var4, z11, q3VarV, jhVarG, a1Var2, jVar4, function2, c0Var2, i12 & 33554430);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var4;
                    z13 = z11;
                    q3Var2 = q3VarV;
                    jhVar2 = jhVarG;
                    a1Var3 = a1Var2;
                    jVar3 = jVar4;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var3 = a0Var2;
                    z13 = z11;
                    q3Var2 = q3VarV;
                    jhVar2 = jhVarG;
                    a1Var3 = a1Var2;
                    jVar3 = jVar2;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.mh
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ei.Q(function0, a0Var3, z13, q3Var2, jhVar2, a1Var3, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 12582912;
            if ((i12 & 4793491) != 4793490) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i19 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        q3VarV = kh.f30051a.v(c0VarR, 6);
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        jhVarG = kh.f30051a.G(c0VarR, 6);
                    }
                    if ((i11 & 32) != 0) {
                        androidx.compose.foundation.a1 a1VarF116 = kh.f30051a.F(z11, c0VarR, ((i12 >> 6) & 14) | 48);
                        i12 &= -458753;
                        a1Var2 = a1VarF116;
                    }
                    if (i15 != 0) {
                        jVar4 = null;
                    } else {
                        jVar4 = jVar2;
                    }
                    i18 = -1481353380;
                } else {
                    if (i19 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        q3VarV = kh.f30051a.v(c0VarR, 6);
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        jhVarG = kh.f30051a.G(c0VarR, 6);
                    }
                    if ((i11 & 32) != 0) {
                        androidx.compose.foundation.a1 a1VarF117 = kh.f30051a.F(z11, c0VarR, ((i12 >> 6) & 14) | 48);
                        i12 &= -458753;
                        a1Var2 = a1VarF117;
                    }
                    if (i15 != 0) {
                        jVar4 = null;
                    } else {
                        jVar4 = jVar2;
                    }
                    i18 = -1481353380;
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(i18, i12, -1, "androidx.compose.material3.OutlinedIconButton (IconButton.kt:616)");
                }
                c0Var2 = c0VarR;
                U(function1, a0Var4, z11, q3VarV, jhVarG, a1Var2, jVar4, function2, c0Var2, i12 & 33554430);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var4;
                z13 = z11;
                q3Var2 = q3VarV;
                jhVar2 = jhVarG;
                a1Var3 = a1Var2;
                jVar3 = jVar4;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var3 = a0Var2;
                z13 = z11;
                q3Var2 = q3VarV;
                jhVar2 = jhVarG;
                a1Var3 = a1Var2;
                jVar3 = jVar2;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.mh
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ei.Q(function0, a0Var3, z13, q3Var2, jhVar2, a1Var3, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 1572864;
        jVar2 = jVar;
        if ((i11 & 128) != 0) {
            if ((i10 & 12582912) == 0) {
                if (c0VarR.k0(function2)) {
                    i17 = 8388608;
                } else {
                    i17 = 4194304;
                }
                i12 |= i17;
            }
            if ((i12 & 4793491) != 4793490) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i19 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        q3VarV = kh.f30051a.v(c0VarR, 6);
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        jhVarG = kh.f30051a.G(c0VarR, 6);
                    }
                    if ((i11 & 32) != 0) {
                        androidx.compose.foundation.a1 a1VarF118 = kh.f30051a.F(z11, c0VarR, ((i12 >> 6) & 14) | 48);
                        i12 &= -458753;
                        a1Var2 = a1VarF118;
                    }
                    if (i15 != 0) {
                        jVar4 = null;
                    } else {
                        jVar4 = jVar2;
                    }
                    i18 = -1481353380;
                } else {
                    if (i19 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        q3VarV = kh.f30051a.v(c0VarR, 6);
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        jhVarG = kh.f30051a.G(c0VarR, 6);
                    }
                    if ((i11 & 32) != 0) {
                        androidx.compose.foundation.a1 a1VarF119 = kh.f30051a.F(z11, c0VarR, ((i12 >> 6) & 14) | 48);
                        i12 &= -458753;
                        a1Var2 = a1VarF119;
                    }
                    if (i15 != 0) {
                        jVar4 = null;
                    } else {
                        jVar4 = jVar2;
                    }
                    i18 = -1481353380;
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(i18, i12, -1, "androidx.compose.material3.OutlinedIconButton (IconButton.kt:616)");
                }
                c0Var2 = c0VarR;
                U(function1, a0Var4, z11, q3VarV, jhVarG, a1Var2, jVar4, function2, c0Var2, i12 & 33554430);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var4;
                z13 = z11;
                q3Var2 = q3VarV;
                jhVar2 = jhVarG;
                a1Var3 = a1Var2;
                jVar3 = jVar4;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var3 = a0Var2;
                z13 = z11;
                q3Var2 = q3VarV;
                jhVar2 = jhVarG;
                a1Var3 = a1Var2;
                jVar3 = jVar2;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.mh
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ei.Q(function0, a0Var3, z13, q3Var2, jhVar2, a1Var3, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 12582912;
        if ((i12 & 4793491) != 4793490) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (c0VarR.h(z12, i12 & 1)) {
            c0VarR.l0();
            if ((i10 & 1) != 0) {
                if (i19 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if (i13 != 0) {
                    z11 = true;
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    q3VarV = kh.f30051a.v(c0VarR, 6);
                }
                if ((i11 & 16) != 0) {
                    i12 &= -57345;
                    jhVarG = kh.f30051a.G(c0VarR, 6);
                }
                if ((i11 & 32) != 0) {
                    androidx.compose.foundation.a1 a1VarF1110 = kh.f30051a.F(z11, c0VarR, ((i12 >> 6) & 14) | 48);
                    i12 &= -458753;
                    a1Var2 = a1VarF1110;
                }
                if (i15 != 0) {
                    jVar4 = null;
                } else {
                    jVar4 = jVar2;
                }
                i18 = -1481353380;
            } else {
                if (i19 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if (i13 != 0) {
                    z11 = true;
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    q3VarV = kh.f30051a.v(c0VarR, 6);
                }
                if ((i11 & 16) != 0) {
                    i12 &= -57345;
                    jhVarG = kh.f30051a.G(c0VarR, 6);
                }
                if ((i11 & 32) != 0) {
                    androidx.compose.foundation.a1 a1VarF1111 = kh.f30051a.F(z11, c0VarR, ((i12 >> 6) & 14) | 48);
                    i12 &= -458753;
                    a1Var2 = a1VarF1111;
                }
                if (i15 != 0) {
                    jVar4 = null;
                } else {
                    jVar4 = jVar2;
                }
                i18 = -1481353380;
            }
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(i18, i12, -1, "androidx.compose.material3.OutlinedIconButton (IconButton.kt:616)");
            }
            c0Var2 = c0VarR;
            U(function1, a0Var4, z11, q3VarV, jhVarG, a1Var2, jVar4, function2, c0Var2, i12 & 33554430);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            a0Var3 = a0Var4;
            z13 = z11;
            q3Var2 = q3VarV;
            jhVar2 = jhVarG;
            a1Var3 = a1Var2;
            jVar3 = jVar4;
        } else {
            c0Var2 = c0VarR;
            c0Var2.u();
            a0Var3 = a0Var2;
            z13 = z11;
            q3Var2 = q3VarV;
            jhVar2 = jhVarG;
            a1Var3 = a1Var2;
            jVar3 = jVar2;
        }
        s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.mh
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ei.Q(function0, a0Var3, z13, q3Var2, jhVar2, a1Var3, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Q(Function0 function0, androidx.compose.ui.a0 a0Var, boolean z10, androidx.compose.ui.graphics.q3 q3Var, jh jhVar, androidx.compose.foundation.a1 a1Var, androidx.compose.foundation.interaction.j jVar, Function2 function2, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        P(function0, a0Var, z10, q3Var, jhVar, a1Var, jVar, function2, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0126  */
    /* JADX WARN: Code duplicated, block: B:104:0x0128  */
    /* JADX WARN: Code duplicated, block: B:107:0x0131  */
    /* JADX WARN: Code duplicated, block: B:109:0x0142  */
    /* JADX WARN: Code duplicated, block: B:123:0x0167 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:124:0x0169  */
    /* JADX WARN: Code duplicated, block: B:126:0x016f  */
    /* JADX WARN: Code duplicated, block: B:129:0x0176  */
    /* JADX WARN: Code duplicated, block: B:130:0x0181  */
    /* JADX WARN: Code duplicated, block: B:133:0x0189  */
    /* JADX WARN: Code duplicated, block: B:136:0x0196  */
    /* JADX WARN: Code duplicated, block: B:137:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:139:0x01af  */
    /* JADX WARN: Code duplicated, block: B:142:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:145:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:148:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:150:0x0200  */
    /* JADX WARN: Code duplicated, block: B:153:0x0211  */
    /* JADX WARN: Code duplicated, block: B:155:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0048  */
    /* JADX WARN: Code duplicated, block: B:28:0x004f  */
    /* JADX WARN: Code duplicated, block: B:30:0x0053  */
    /* JADX WARN: Code duplicated, block: B:32:0x005d  */
    /* JADX WARN: Code duplicated, block: B:33:0x0060  */
    /* JADX WARN: Code duplicated, block: B:37:0x0067  */
    /* JADX WARN: Code duplicated, block: B:39:0x006c  */
    /* JADX WARN: Code duplicated, block: B:41:0x0070  */
    /* JADX WARN: Code duplicated, block: B:43:0x0078  */
    /* JADX WARN: Code duplicated, block: B:44:0x007b  */
    /* JADX WARN: Code duplicated, block: B:48:0x0082  */
    /* JADX WARN: Code duplicated, block: B:50:0x0086  */
    /* JADX WARN: Code duplicated, block: B:52:0x008e  */
    /* JADX WARN: Code duplicated, block: B:53:0x0091  */
    /* JADX WARN: Code duplicated, block: B:56:0x0099  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:74:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:85:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:92:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:94:0x0104  */
    /* JADX WARN: Code duplicated, block: B:96:0x0108  */
    /* JADX WARN: Code duplicated, block: B:98:0x0112  */
    /* JADX WARN: Code duplicated, block: B:99:0x0115  */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void R(final boolean z10, @NotNull final Function1<? super Boolean, Unit> function1, @Nullable androidx.compose.ui.a0 a0Var, boolean z11, @Nullable androidx.compose.ui.graphics.q3 q3Var, @Nullable oi oiVar, @Nullable androidx.compose.foundation.a1 a1Var, @Nullable androidx.compose.foundation.interaction.j jVar, @NotNull final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        int i13;
        androidx.compose.ui.a0 a0Var2;
        int i14;
        int i15;
        boolean z12;
        int i16;
        androidx.compose.ui.graphics.q3 q3VarV;
        oi oiVarM;
        androidx.compose.foundation.a1 a1VarL;
        int i17;
        androidx.compose.foundation.interaction.j jVar2;
        int i18;
        int i19;
        int i20;
        boolean z13;
        final androidx.compose.ui.a0 a0Var3;
        final boolean z14;
        final androidx.compose.ui.graphics.q3 q3Var2;
        final oi oiVar2;
        final androidx.compose.foundation.a1 a1Var2;
        final androidx.compose.foundation.interaction.j jVar3;
        androidx.compose.runtime.s5 s5VarT;
        int i21;
        int i22;
        Object objI0;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1703707081);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c0VarR.G(z10) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) == 0) {
            if ((i10 & 48) == 0) {
                i12 |= c0VarR.k0(function1) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                    a0Var2 = a0Var;
                    if (c0VarR.D(a0Var2)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                i15 = i11 & 8;
                if (i15 != 0) {
                    if ((i10 & 3072) == 0) {
                        z12 = z11;
                        if (c0VarR.G(z12)) {
                            i16 = 2048;
                        } else {
                            i16 = 1024;
                        }
                        i12 |= i16;
                    }
                    if ((i10 & 24576) == 0) {
                        if ((i11 & 16) == 0) {
                            q3VarV = q3Var;
                            int i23 = c0VarR.D(q3VarV) ? 16384 : 8192;
                            i12 |= i23;
                        } else {
                            q3VarV = q3Var;
                        }
                        i12 |= i23;
                    } else {
                        q3VarV = q3Var;
                    }
                    if ((196608 & i10) == 0) {
                        if ((i11 & 32) == 0) {
                            oiVarM = oiVar;
                            int i24 = c0VarR.D(oiVarM) ? 131072 : 65536;
                            i12 |= i24;
                        } else {
                            oiVarM = oiVar;
                        }
                        i12 |= i24;
                    } else {
                        oiVarM = oiVar;
                    }
                    if ((1572864 & i10) == 0) {
                        if ((i11 & 64) == 0) {
                            a1VarL = a1Var;
                            int i25 = c0VarR.D(a1VarL) ? 1048576 : 524288;
                            i12 |= i25;
                        } else {
                            a1VarL = a1Var;
                        }
                        i12 |= i25;
                    } else {
                        a1VarL = a1Var;
                    }
                    i17 = i11 & 128;
                    if (i17 != 0) {
                        if ((12582912 & i10) == 0) {
                            jVar2 = jVar;
                            if (c0VarR.D(jVar2)) {
                                i18 = 8388608;
                            } else {
                                i18 = 4194304;
                            }
                            i12 |= i18;
                        }
                        if ((i11 & 256) != 0) {
                            if ((i10 & 100663296) == 0) {
                                if (c0VarR.k0(function2)) {
                                    i19 = 67108864;
                                } else {
                                    i19 = com.google.api.client.googleapis.media.a.f115410j;
                                }
                                i12 |= i19;
                            }
                            i20 = i12;
                            if ((i12 & 38347923) != 38347922) {
                                z13 = true;
                            } else {
                                z13 = false;
                            }
                            if (c0VarR.h(z13, i20 & 1)) {
                                c0VarR.l0();
                                if ((i10 & 1) != 0 || c0VarR.y()) {
                                    if (i13 != 0) {
                                        a0Var2 = androidx.compose.ui.a0.E;
                                    }
                                    if (i15 != 0) {
                                        z12 = true;
                                    }
                                    if ((i11 & 16) != 0) {
                                        i21 = i20 & (-57345);
                                        q3VarV = kh.f30051a.v(c0VarR, 6);
                                    } else {
                                        i21 = i20;
                                    }
                                    if ((i11 & 32) != 0) {
                                        i21 &= -458753;
                                        oiVarM = kh.f30051a.M(c0VarR, 6);
                                    }
                                    if ((i11 & 64) != 0) {
                                        a1VarL = kh.f30051a.L(z12, z10, c0VarR, ((i21 >> 9) & 14) | androidx.media3.exoplayer.a5.S0 | ((i21 << 3) & com.planner5d.library.engine.input.f.b.B));
                                        i22 = i21 & (-3670017);
                                    } else {
                                        i22 = i21;
                                    }
                                    if (i17 != 0) {
                                        jVar2 = null;
                                    }
                                } else {
                                    c0VarR.u();
                                    i22 = (i11 & 16) != 0 ? i20 & (-57345) : i20;
                                    if ((i11 & 32) != 0) {
                                        i22 &= -458753;
                                    }
                                    if ((i11 & 64) != 0) {
                                        i22 &= -3670017;
                                    }
                                }
                                androidx.compose.ui.graphics.q3 q3Var3 = q3VarV;
                                androidx.compose.foundation.a1 a1Var3 = a1VarL;
                                androidx.compose.ui.a0 a0Var4 = a0Var2;
                                oi oiVar3 = oiVarM;
                                c0VarR.Z();
                                if (androidx.compose.runtime.m0.l0()) {
                                    androidx.compose.runtime.m0.A0(-1703707081, i22, -1, "androidx.compose.material3.OutlinedIconToggleButton (IconButton.kt:674)");
                                }
                                objI0 = c0VarR.i0();
                                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI0 = new Function1() { // from class: androidx.compose.material3.ph
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return ei.S((androidx.compose.ui.semantics.e0) obj);
                                        }
                                    };
                                    c0VarR.Y(objI0);
                                }
                                boolean z15 = z12;
                                androidx.compose.foundation.interaction.j jVar4 = jVar2;
                                X(z10, function1, androidx.compose.ui.semantics.t.f(a0Var4, false, (Function1) objI0, 1, null), z15, q3Var3, oiVar3, a1Var3, jVar4, function2, c0VarR, i22 & 268434558);
                                if (androidx.compose.runtime.m0.l0()) {
                                    androidx.compose.runtime.m0.z0();
                                }
                                jVar3 = jVar4;
                                a1Var2 = a1Var3;
                                oiVar2 = oiVar3;
                                q3Var2 = q3Var3;
                                z14 = z15;
                                a0Var3 = a0Var4;
                            } else {
                                c0VarR.u();
                                a0Var3 = a0Var2;
                                z14 = z12;
                                q3Var2 = q3VarV;
                                oiVar2 = oiVarM;
                                a1Var2 = a1VarL;
                                jVar3 = jVar2;
                            }
                            s5VarT = c0VarR.T();
                            if (s5VarT != null) {
                                s5VarT.a(new Function2() { // from class: androidx.compose.material3.qh
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return ei.T(z10, function1, a0Var3, z14, q3Var2, oiVar2, a1Var2, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                    }
                                });
                            }
                        }
                        i12 |= 100663296;
                        i20 = i12;
                        if ((i12 & 38347923) != 38347922) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (c0VarR.h(z13, i20 & 1)) {
                            c0VarR.l0();
                            if ((i10 & 1) != 0) {
                                if (i13 != 0) {
                                    a0Var2 = androidx.compose.ui.a0.E;
                                }
                                if (i15 != 0) {
                                    z12 = true;
                                }
                                if ((i11 & 16) != 0) {
                                    i21 = i20 & (-57345);
                                    q3VarV = kh.f30051a.v(c0VarR, 6);
                                } else {
                                    i21 = i20;
                                }
                                if ((i11 & 32) != 0) {
                                    i21 &= -458753;
                                    oiVarM = kh.f30051a.M(c0VarR, 6);
                                }
                                if ((i11 & 64) != 0) {
                                    a1VarL = kh.f30051a.L(z12, z10, c0VarR, ((i21 >> 9) & 14) | androidx.media3.exoplayer.a5.S0 | ((i21 << 3) & com.planner5d.library.engine.input.f.b.B));
                                    i22 = i21 & (-3670017);
                                } else {
                                    i22 = i21;
                                }
                                if (i17 != 0) {
                                    jVar2 = null;
                                }
                            } else {
                                if (i13 != 0) {
                                    a0Var2 = androidx.compose.ui.a0.E;
                                }
                                if (i15 != 0) {
                                    z12 = true;
                                }
                                if ((i11 & 16) != 0) {
                                    i21 = i20 & (-57345);
                                    q3VarV = kh.f30051a.v(c0VarR, 6);
                                } else {
                                    i21 = i20;
                                }
                                if ((i11 & 32) != 0) {
                                    i21 &= -458753;
                                    oiVarM = kh.f30051a.M(c0VarR, 6);
                                }
                                if ((i11 & 64) != 0) {
                                    a1VarL = kh.f30051a.L(z12, z10, c0VarR, ((i21 >> 9) & 14) | androidx.media3.exoplayer.a5.S0 | ((i21 << 3) & com.planner5d.library.engine.input.f.b.B));
                                    i22 = i21 & (-3670017);
                                } else {
                                    i22 = i21;
                                }
                                if (i17 != 0) {
                                    jVar2 = null;
                                }
                            }
                            androidx.compose.ui.graphics.q3 q3Var4 = q3VarV;
                            androidx.compose.foundation.a1 a1Var4 = a1VarL;
                            androidx.compose.ui.a0 a0Var5 = a0Var2;
                            oi oiVar4 = oiVarM;
                            c0VarR.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(-1703707081, i22, -1, "androidx.compose.material3.OutlinedIconToggleButton (IconButton.kt:674)");
                            }
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = new Function1() { // from class: androidx.compose.material3.ph
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return ei.S((androidx.compose.ui.semantics.e0) obj);
                                    }
                                };
                                c0VarR.Y(objI0);
                            }
                            boolean z16 = z12;
                            androidx.compose.foundation.interaction.j jVar5 = jVar2;
                            X(z10, function1, androidx.compose.ui.semantics.t.f(a0Var5, false, (Function1) objI0, 1, null), z16, q3Var4, oiVar4, a1Var4, jVar5, function2, c0VarR, i22 & 268434558);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            jVar3 = jVar5;
                            a1Var2 = a1Var4;
                            oiVar2 = oiVar4;
                            q3Var2 = q3Var4;
                            z14 = z16;
                            a0Var3 = a0Var5;
                        } else {
                            c0VarR.u();
                            a0Var3 = a0Var2;
                            z14 = z12;
                            q3Var2 = q3VarV;
                            oiVar2 = oiVarM;
                            a1Var2 = a1VarL;
                            jVar3 = jVar2;
                        }
                        s5VarT = c0VarR.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material3.qh
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return ei.T(z10, function1, a0Var3, z14, q3Var2, oiVar2, a1Var2, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i12 |= 12582912;
                    jVar2 = jVar;
                    if ((i11 & 256) != 0) {
                        if ((i10 & 100663296) == 0) {
                            if (c0VarR.k0(function2)) {
                                i19 = 67108864;
                            } else {
                                i19 = com.google.api.client.googleapis.media.a.f115410j;
                            }
                            i12 |= i19;
                        }
                        i20 = i12;
                        if ((i12 & 38347923) != 38347922) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (c0VarR.h(z13, i20 & 1)) {
                            c0VarR.l0();
                            if ((i10 & 1) != 0) {
                                if (i13 != 0) {
                                    a0Var2 = androidx.compose.ui.a0.E;
                                }
                                if (i15 != 0) {
                                    z12 = true;
                                }
                                if ((i11 & 16) != 0) {
                                    i21 = i20 & (-57345);
                                    q3VarV = kh.f30051a.v(c0VarR, 6);
                                } else {
                                    i21 = i20;
                                }
                                if ((i11 & 32) != 0) {
                                    i21 &= -458753;
                                    oiVarM = kh.f30051a.M(c0VarR, 6);
                                }
                                if ((i11 & 64) != 0) {
                                    a1VarL = kh.f30051a.L(z12, z10, c0VarR, ((i21 >> 9) & 14) | androidx.media3.exoplayer.a5.S0 | ((i21 << 3) & com.planner5d.library.engine.input.f.b.B));
                                    i22 = i21 & (-3670017);
                                } else {
                                    i22 = i21;
                                }
                                if (i17 != 0) {
                                    jVar2 = null;
                                }
                            } else {
                                if (i13 != 0) {
                                    a0Var2 = androidx.compose.ui.a0.E;
                                }
                                if (i15 != 0) {
                                    z12 = true;
                                }
                                if ((i11 & 16) != 0) {
                                    i21 = i20 & (-57345);
                                    q3VarV = kh.f30051a.v(c0VarR, 6);
                                } else {
                                    i21 = i20;
                                }
                                if ((i11 & 32) != 0) {
                                    i21 &= -458753;
                                    oiVarM = kh.f30051a.M(c0VarR, 6);
                                }
                                if ((i11 & 64) != 0) {
                                    a1VarL = kh.f30051a.L(z12, z10, c0VarR, ((i21 >> 9) & 14) | androidx.media3.exoplayer.a5.S0 | ((i21 << 3) & com.planner5d.library.engine.input.f.b.B));
                                    i22 = i21 & (-3670017);
                                } else {
                                    i22 = i21;
                                }
                                if (i17 != 0) {
                                    jVar2 = null;
                                }
                            }
                            androidx.compose.ui.graphics.q3 q3Var5 = q3VarV;
                            androidx.compose.foundation.a1 a1Var5 = a1VarL;
                            androidx.compose.ui.a0 a0Var6 = a0Var2;
                            oi oiVar5 = oiVarM;
                            c0VarR.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(-1703707081, i22, -1, "androidx.compose.material3.OutlinedIconToggleButton (IconButton.kt:674)");
                            }
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = new Function1() { // from class: androidx.compose.material3.ph
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return ei.S((androidx.compose.ui.semantics.e0) obj);
                                    }
                                };
                                c0VarR.Y(objI0);
                            }
                            boolean z17 = z12;
                            androidx.compose.foundation.interaction.j jVar6 = jVar2;
                            X(z10, function1, androidx.compose.ui.semantics.t.f(a0Var6, false, (Function1) objI0, 1, null), z17, q3Var5, oiVar5, a1Var5, jVar6, function2, c0VarR, i22 & 268434558);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            jVar3 = jVar6;
                            a1Var2 = a1Var5;
                            oiVar2 = oiVar5;
                            q3Var2 = q3Var5;
                            z14 = z17;
                            a0Var3 = a0Var6;
                        } else {
                            c0VarR.u();
                            a0Var3 = a0Var2;
                            z14 = z12;
                            q3Var2 = q3VarV;
                            oiVar2 = oiVarM;
                            a1Var2 = a1VarL;
                            jVar3 = jVar2;
                        }
                        s5VarT = c0VarR.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material3.qh
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return ei.T(z10, function1, a0Var3, z14, q3Var2, oiVar2, a1Var2, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i12 |= 100663296;
                    i20 = i12;
                    if ((i12 & 38347923) != 38347922) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (c0VarR.h(z13, i20 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i13 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i15 != 0) {
                                z12 = true;
                            }
                            if ((i11 & 16) != 0) {
                                i21 = i20 & (-57345);
                                q3VarV = kh.f30051a.v(c0VarR, 6);
                            } else {
                                i21 = i20;
                            }
                            if ((i11 & 32) != 0) {
                                i21 &= -458753;
                                oiVarM = kh.f30051a.M(c0VarR, 6);
                            }
                            if ((i11 & 64) != 0) {
                                a1VarL = kh.f30051a.L(z12, z10, c0VarR, ((i21 >> 9) & 14) | androidx.media3.exoplayer.a5.S0 | ((i21 << 3) & com.planner5d.library.engine.input.f.b.B));
                                i22 = i21 & (-3670017);
                            } else {
                                i22 = i21;
                            }
                            if (i17 != 0) {
                                jVar2 = null;
                            }
                        } else {
                            if (i13 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i15 != 0) {
                                z12 = true;
                            }
                            if ((i11 & 16) != 0) {
                                i21 = i20 & (-57345);
                                q3VarV = kh.f30051a.v(c0VarR, 6);
                            } else {
                                i21 = i20;
                            }
                            if ((i11 & 32) != 0) {
                                i21 &= -458753;
                                oiVarM = kh.f30051a.M(c0VarR, 6);
                            }
                            if ((i11 & 64) != 0) {
                                a1VarL = kh.f30051a.L(z12, z10, c0VarR, ((i21 >> 9) & 14) | androidx.media3.exoplayer.a5.S0 | ((i21 << 3) & com.planner5d.library.engine.input.f.b.B));
                                i22 = i21 & (-3670017);
                            } else {
                                i22 = i21;
                            }
                            if (i17 != 0) {
                                jVar2 = null;
                            }
                        }
                        androidx.compose.ui.graphics.q3 q3Var6 = q3VarV;
                        androidx.compose.foundation.a1 a1Var6 = a1VarL;
                        androidx.compose.ui.a0 a0Var7 = a0Var2;
                        oi oiVar6 = oiVarM;
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-1703707081, i22, -1, "androidx.compose.material3.OutlinedIconToggleButton (IconButton.kt:674)");
                        }
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = new Function1() { // from class: androidx.compose.material3.ph
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return ei.S((androidx.compose.ui.semantics.e0) obj);
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        boolean z18 = z12;
                        androidx.compose.foundation.interaction.j jVar7 = jVar2;
                        X(z10, function1, androidx.compose.ui.semantics.t.f(a0Var7, false, (Function1) objI0, 1, null), z18, q3Var6, oiVar6, a1Var6, jVar7, function2, c0VarR, i22 & 268434558);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        jVar3 = jVar7;
                        a1Var2 = a1Var6;
                        oiVar2 = oiVar6;
                        q3Var2 = q3Var6;
                        z14 = z18;
                        a0Var3 = a0Var7;
                    } else {
                        c0VarR.u();
                        a0Var3 = a0Var2;
                        z14 = z12;
                        q3Var2 = q3VarV;
                        oiVar2 = oiVarM;
                        a1Var2 = a1VarL;
                        jVar3 = jVar2;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.qh
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return ei.T(z10, function1, a0Var3, z14, q3Var2, oiVar2, a1Var2, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 3072;
                z12 = z11;
                if ((i10 & 24576) == 0) {
                    if ((i11 & 16) == 0) {
                        q3VarV = q3Var;
                        if (c0VarR.D(q3VarV)) {
                        }
                        i12 |= i23;
                    } else {
                        q3VarV = q3Var;
                    }
                    i12 |= i23;
                } else {
                    q3VarV = q3Var;
                }
                if ((196608 & i10) == 0) {
                    if ((i11 & 32) == 0) {
                        oiVarM = oiVar;
                        if (c0VarR.D(oiVarM)) {
                        }
                        i12 |= i24;
                    } else {
                        oiVarM = oiVar;
                    }
                    i12 |= i24;
                } else {
                    oiVarM = oiVar;
                }
                if ((1572864 & i10) == 0) {
                    if ((i11 & 64) == 0) {
                        a1VarL = a1Var;
                        if (c0VarR.D(a1VarL)) {
                        }
                        i12 |= i25;
                    } else {
                        a1VarL = a1Var;
                    }
                    i12 |= i25;
                } else {
                    a1VarL = a1Var;
                }
                i17 = i11 & 128;
                if (i17 != 0) {
                    if ((12582912 & i10) == 0) {
                        jVar2 = jVar;
                        if (c0VarR.D(jVar2)) {
                            i18 = 8388608;
                        } else {
                            i18 = 4194304;
                        }
                        i12 |= i18;
                    }
                    if ((i11 & 256) != 0) {
                        if ((i10 & 100663296) == 0) {
                            if (c0VarR.k0(function2)) {
                                i19 = 67108864;
                            } else {
                                i19 = com.google.api.client.googleapis.media.a.f115410j;
                            }
                            i12 |= i19;
                        }
                        i20 = i12;
                        if ((i12 & 38347923) != 38347922) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (c0VarR.h(z13, i20 & 1)) {
                            c0VarR.l0();
                            if ((i10 & 1) != 0) {
                                if (i13 != 0) {
                                    a0Var2 = androidx.compose.ui.a0.E;
                                }
                                if (i15 != 0) {
                                    z12 = true;
                                }
                                if ((i11 & 16) != 0) {
                                    i21 = i20 & (-57345);
                                    q3VarV = kh.f30051a.v(c0VarR, 6);
                                } else {
                                    i21 = i20;
                                }
                                if ((i11 & 32) != 0) {
                                    i21 &= -458753;
                                    oiVarM = kh.f30051a.M(c0VarR, 6);
                                }
                                if ((i11 & 64) != 0) {
                                    a1VarL = kh.f30051a.L(z12, z10, c0VarR, ((i21 >> 9) & 14) | androidx.media3.exoplayer.a5.S0 | ((i21 << 3) & com.planner5d.library.engine.input.f.b.B));
                                    i22 = i21 & (-3670017);
                                } else {
                                    i22 = i21;
                                }
                                if (i17 != 0) {
                                    jVar2 = null;
                                }
                            } else {
                                if (i13 != 0) {
                                    a0Var2 = androidx.compose.ui.a0.E;
                                }
                                if (i15 != 0) {
                                    z12 = true;
                                }
                                if ((i11 & 16) != 0) {
                                    i21 = i20 & (-57345);
                                    q3VarV = kh.f30051a.v(c0VarR, 6);
                                } else {
                                    i21 = i20;
                                }
                                if ((i11 & 32) != 0) {
                                    i21 &= -458753;
                                    oiVarM = kh.f30051a.M(c0VarR, 6);
                                }
                                if ((i11 & 64) != 0) {
                                    a1VarL = kh.f30051a.L(z12, z10, c0VarR, ((i21 >> 9) & 14) | androidx.media3.exoplayer.a5.S0 | ((i21 << 3) & com.planner5d.library.engine.input.f.b.B));
                                    i22 = i21 & (-3670017);
                                } else {
                                    i22 = i21;
                                }
                                if (i17 != 0) {
                                    jVar2 = null;
                                }
                            }
                            androidx.compose.ui.graphics.q3 q3Var7 = q3VarV;
                            androidx.compose.foundation.a1 a1Var7 = a1VarL;
                            androidx.compose.ui.a0 a0Var8 = a0Var2;
                            oi oiVar7 = oiVarM;
                            c0VarR.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(-1703707081, i22, -1, "androidx.compose.material3.OutlinedIconToggleButton (IconButton.kt:674)");
                            }
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = new Function1() { // from class: androidx.compose.material3.ph
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return ei.S((androidx.compose.ui.semantics.e0) obj);
                                    }
                                };
                                c0VarR.Y(objI0);
                            }
                            boolean z19 = z12;
                            androidx.compose.foundation.interaction.j jVar8 = jVar2;
                            X(z10, function1, androidx.compose.ui.semantics.t.f(a0Var8, false, (Function1) objI0, 1, null), z19, q3Var7, oiVar7, a1Var7, jVar8, function2, c0VarR, i22 & 268434558);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            jVar3 = jVar8;
                            a1Var2 = a1Var7;
                            oiVar2 = oiVar7;
                            q3Var2 = q3Var7;
                            z14 = z19;
                            a0Var3 = a0Var8;
                        } else {
                            c0VarR.u();
                            a0Var3 = a0Var2;
                            z14 = z12;
                            q3Var2 = q3VarV;
                            oiVar2 = oiVarM;
                            a1Var2 = a1VarL;
                            jVar3 = jVar2;
                        }
                        s5VarT = c0VarR.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material3.qh
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return ei.T(z10, function1, a0Var3, z14, q3Var2, oiVar2, a1Var2, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i12 |= 100663296;
                    i20 = i12;
                    if ((i12 & 38347923) != 38347922) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (c0VarR.h(z13, i20 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i13 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i15 != 0) {
                                z12 = true;
                            }
                            if ((i11 & 16) != 0) {
                                i21 = i20 & (-57345);
                                q3VarV = kh.f30051a.v(c0VarR, 6);
                            } else {
                                i21 = i20;
                            }
                            if ((i11 & 32) != 0) {
                                i21 &= -458753;
                                oiVarM = kh.f30051a.M(c0VarR, 6);
                            }
                            if ((i11 & 64) != 0) {
                                a1VarL = kh.f30051a.L(z12, z10, c0VarR, ((i21 >> 9) & 14) | androidx.media3.exoplayer.a5.S0 | ((i21 << 3) & com.planner5d.library.engine.input.f.b.B));
                                i22 = i21 & (-3670017);
                            } else {
                                i22 = i21;
                            }
                            if (i17 != 0) {
                                jVar2 = null;
                            }
                        } else {
                            if (i13 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i15 != 0) {
                                z12 = true;
                            }
                            if ((i11 & 16) != 0) {
                                i21 = i20 & (-57345);
                                q3VarV = kh.f30051a.v(c0VarR, 6);
                            } else {
                                i21 = i20;
                            }
                            if ((i11 & 32) != 0) {
                                i21 &= -458753;
                                oiVarM = kh.f30051a.M(c0VarR, 6);
                            }
                            if ((i11 & 64) != 0) {
                                a1VarL = kh.f30051a.L(z12, z10, c0VarR, ((i21 >> 9) & 14) | androidx.media3.exoplayer.a5.S0 | ((i21 << 3) & com.planner5d.library.engine.input.f.b.B));
                                i22 = i21 & (-3670017);
                            } else {
                                i22 = i21;
                            }
                            if (i17 != 0) {
                                jVar2 = null;
                            }
                        }
                        androidx.compose.ui.graphics.q3 q3Var8 = q3VarV;
                        androidx.compose.foundation.a1 a1Var8 = a1VarL;
                        androidx.compose.ui.a0 a0Var9 = a0Var2;
                        oi oiVar8 = oiVarM;
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-1703707081, i22, -1, "androidx.compose.material3.OutlinedIconToggleButton (IconButton.kt:674)");
                        }
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = new Function1() { // from class: androidx.compose.material3.ph
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return ei.S((androidx.compose.ui.semantics.e0) obj);
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        boolean z110 = z12;
                        androidx.compose.foundation.interaction.j jVar9 = jVar2;
                        X(z10, function1, androidx.compose.ui.semantics.t.f(a0Var9, false, (Function1) objI0, 1, null), z110, q3Var8, oiVar8, a1Var8, jVar9, function2, c0VarR, i22 & 268434558);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        jVar3 = jVar9;
                        a1Var2 = a1Var8;
                        oiVar2 = oiVar8;
                        q3Var2 = q3Var8;
                        z14 = z110;
                        a0Var3 = a0Var9;
                    } else {
                        c0VarR.u();
                        a0Var3 = a0Var2;
                        z14 = z12;
                        q3Var2 = q3VarV;
                        oiVar2 = oiVarM;
                        a1Var2 = a1VarL;
                        jVar3 = jVar2;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.qh
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return ei.T(z10, function1, a0Var3, z14, q3Var2, oiVar2, a1Var2, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 12582912;
                jVar2 = jVar;
                if ((i11 & 256) != 0) {
                    if ((i10 & 100663296) == 0) {
                        if (c0VarR.k0(function2)) {
                            i19 = 67108864;
                        } else {
                            i19 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i12 |= i19;
                    }
                    i20 = i12;
                    if ((i12 & 38347923) != 38347922) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (c0VarR.h(z13, i20 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i13 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i15 != 0) {
                                z12 = true;
                            }
                            if ((i11 & 16) != 0) {
                                i21 = i20 & (-57345);
                                q3VarV = kh.f30051a.v(c0VarR, 6);
                            } else {
                                i21 = i20;
                            }
                            if ((i11 & 32) != 0) {
                                i21 &= -458753;
                                oiVarM = kh.f30051a.M(c0VarR, 6);
                            }
                            if ((i11 & 64) != 0) {
                                a1VarL = kh.f30051a.L(z12, z10, c0VarR, ((i21 >> 9) & 14) | androidx.media3.exoplayer.a5.S0 | ((i21 << 3) & com.planner5d.library.engine.input.f.b.B));
                                i22 = i21 & (-3670017);
                            } else {
                                i22 = i21;
                            }
                            if (i17 != 0) {
                                jVar2 = null;
                            }
                        } else {
                            if (i13 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i15 != 0) {
                                z12 = true;
                            }
                            if ((i11 & 16) != 0) {
                                i21 = i20 & (-57345);
                                q3VarV = kh.f30051a.v(c0VarR, 6);
                            } else {
                                i21 = i20;
                            }
                            if ((i11 & 32) != 0) {
                                i21 &= -458753;
                                oiVarM = kh.f30051a.M(c0VarR, 6);
                            }
                            if ((i11 & 64) != 0) {
                                a1VarL = kh.f30051a.L(z12, z10, c0VarR, ((i21 >> 9) & 14) | androidx.media3.exoplayer.a5.S0 | ((i21 << 3) & com.planner5d.library.engine.input.f.b.B));
                                i22 = i21 & (-3670017);
                            } else {
                                i22 = i21;
                            }
                            if (i17 != 0) {
                                jVar2 = null;
                            }
                        }
                        androidx.compose.ui.graphics.q3 q3Var9 = q3VarV;
                        androidx.compose.foundation.a1 a1Var9 = a1VarL;
                        androidx.compose.ui.a0 a0Var10 = a0Var2;
                        oi oiVar9 = oiVarM;
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-1703707081, i22, -1, "androidx.compose.material3.OutlinedIconToggleButton (IconButton.kt:674)");
                        }
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = new Function1() { // from class: androidx.compose.material3.ph
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return ei.S((androidx.compose.ui.semantics.e0) obj);
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        boolean z111 = z12;
                        androidx.compose.foundation.interaction.j jVar10 = jVar2;
                        X(z10, function1, androidx.compose.ui.semantics.t.f(a0Var10, false, (Function1) objI0, 1, null), z111, q3Var9, oiVar9, a1Var9, jVar10, function2, c0VarR, i22 & 268434558);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        jVar3 = jVar10;
                        a1Var2 = a1Var9;
                        oiVar2 = oiVar9;
                        q3Var2 = q3Var9;
                        z14 = z111;
                        a0Var3 = a0Var10;
                    } else {
                        c0VarR.u();
                        a0Var3 = a0Var2;
                        z14 = z12;
                        q3Var2 = q3VarV;
                        oiVar2 = oiVarM;
                        a1Var2 = a1VarL;
                        jVar3 = jVar2;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.qh
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return ei.T(z10, function1, a0Var3, z14, q3Var2, oiVar2, a1Var2, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 100663296;
                i20 = i12;
                if ((i12 & 38347923) != 38347922) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (c0VarR.h(z13, i20 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i13 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i15 != 0) {
                            z12 = true;
                        }
                        if ((i11 & 16) != 0) {
                            i21 = i20 & (-57345);
                            q3VarV = kh.f30051a.v(c0VarR, 6);
                        } else {
                            i21 = i20;
                        }
                        if ((i11 & 32) != 0) {
                            i21 &= -458753;
                            oiVarM = kh.f30051a.M(c0VarR, 6);
                        }
                        if ((i11 & 64) != 0) {
                            a1VarL = kh.f30051a.L(z12, z10, c0VarR, ((i21 >> 9) & 14) | androidx.media3.exoplayer.a5.S0 | ((i21 << 3) & com.planner5d.library.engine.input.f.b.B));
                            i22 = i21 & (-3670017);
                        } else {
                            i22 = i21;
                        }
                        if (i17 != 0) {
                            jVar2 = null;
                        }
                    } else {
                        if (i13 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i15 != 0) {
                            z12 = true;
                        }
                        if ((i11 & 16) != 0) {
                            i21 = i20 & (-57345);
                            q3VarV = kh.f30051a.v(c0VarR, 6);
                        } else {
                            i21 = i20;
                        }
                        if ((i11 & 32) != 0) {
                            i21 &= -458753;
                            oiVarM = kh.f30051a.M(c0VarR, 6);
                        }
                        if ((i11 & 64) != 0) {
                            a1VarL = kh.f30051a.L(z12, z10, c0VarR, ((i21 >> 9) & 14) | androidx.media3.exoplayer.a5.S0 | ((i21 << 3) & com.planner5d.library.engine.input.f.b.B));
                            i22 = i21 & (-3670017);
                        } else {
                            i22 = i21;
                        }
                        if (i17 != 0) {
                            jVar2 = null;
                        }
                    }
                    androidx.compose.ui.graphics.q3 q3Var10 = q3VarV;
                    androidx.compose.foundation.a1 a1Var10 = a1VarL;
                    androidx.compose.ui.a0 a0Var11 = a0Var2;
                    oi oiVar10 = oiVarM;
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1703707081, i22, -1, "androidx.compose.material3.OutlinedIconToggleButton (IconButton.kt:674)");
                    }
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = new Function1() { // from class: androidx.compose.material3.ph
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return ei.S((androidx.compose.ui.semantics.e0) obj);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    boolean z112 = z12;
                    androidx.compose.foundation.interaction.j jVar11 = jVar2;
                    X(z10, function1, androidx.compose.ui.semantics.t.f(a0Var11, false, (Function1) objI0, 1, null), z112, q3Var10, oiVar10, a1Var10, jVar11, function2, c0VarR, i22 & 268434558);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    jVar3 = jVar11;
                    a1Var2 = a1Var10;
                    oiVar2 = oiVar10;
                    q3Var2 = q3Var10;
                    z14 = z112;
                    a0Var3 = a0Var11;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    z14 = z12;
                    q3Var2 = q3VarV;
                    oiVar2 = oiVarM;
                    a1Var2 = a1VarL;
                    jVar3 = jVar2;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.qh
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ei.T(z10, function1, a0Var3, z14, q3Var2, oiVar2, a1Var2, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= androidx.media3.exoplayer.a5.S0;
            a0Var2 = a0Var;
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 3072) == 0) {
                    z12 = z11;
                    if (c0VarR.G(z12)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                if ((i10 & 24576) == 0) {
                    if ((i11 & 16) == 0) {
                        q3VarV = q3Var;
                        if (c0VarR.D(q3VarV)) {
                        }
                        i12 |= i23;
                    } else {
                        q3VarV = q3Var;
                    }
                    i12 |= i23;
                } else {
                    q3VarV = q3Var;
                }
                if ((196608 & i10) == 0) {
                    if ((i11 & 32) == 0) {
                        oiVarM = oiVar;
                        if (c0VarR.D(oiVarM)) {
                        }
                        i12 |= i24;
                    } else {
                        oiVarM = oiVar;
                    }
                    i12 |= i24;
                } else {
                    oiVarM = oiVar;
                }
                if ((1572864 & i10) == 0) {
                    if ((i11 & 64) == 0) {
                        a1VarL = a1Var;
                        if (c0VarR.D(a1VarL)) {
                        }
                        i12 |= i25;
                    } else {
                        a1VarL = a1Var;
                    }
                    i12 |= i25;
                } else {
                    a1VarL = a1Var;
                }
                i17 = i11 & 128;
                if (i17 != 0) {
                    if ((12582912 & i10) == 0) {
                        jVar2 = jVar;
                        if (c0VarR.D(jVar2)) {
                            i18 = 8388608;
                        } else {
                            i18 = 4194304;
                        }
                        i12 |= i18;
                    }
                    if ((i11 & 256) != 0) {
                        if ((i10 & 100663296) == 0) {
                            if (c0VarR.k0(function2)) {
                                i19 = 67108864;
                            } else {
                                i19 = com.google.api.client.googleapis.media.a.f115410j;
                            }
                            i12 |= i19;
                        }
                        i20 = i12;
                        if ((i12 & 38347923) != 38347922) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (c0VarR.h(z13, i20 & 1)) {
                            c0VarR.l0();
                            if ((i10 & 1) != 0) {
                                if (i13 != 0) {
                                    a0Var2 = androidx.compose.ui.a0.E;
                                }
                                if (i15 != 0) {
                                    z12 = true;
                                }
                                if ((i11 & 16) != 0) {
                                    i21 = i20 & (-57345);
                                    q3VarV = kh.f30051a.v(c0VarR, 6);
                                } else {
                                    i21 = i20;
                                }
                                if ((i11 & 32) != 0) {
                                    i21 &= -458753;
                                    oiVarM = kh.f30051a.M(c0VarR, 6);
                                }
                                if ((i11 & 64) != 0) {
                                    a1VarL = kh.f30051a.L(z12, z10, c0VarR, ((i21 >> 9) & 14) | androidx.media3.exoplayer.a5.S0 | ((i21 << 3) & com.planner5d.library.engine.input.f.b.B));
                                    i22 = i21 & (-3670017);
                                } else {
                                    i22 = i21;
                                }
                                if (i17 != 0) {
                                    jVar2 = null;
                                }
                            } else {
                                if (i13 != 0) {
                                    a0Var2 = androidx.compose.ui.a0.E;
                                }
                                if (i15 != 0) {
                                    z12 = true;
                                }
                                if ((i11 & 16) != 0) {
                                    i21 = i20 & (-57345);
                                    q3VarV = kh.f30051a.v(c0VarR, 6);
                                } else {
                                    i21 = i20;
                                }
                                if ((i11 & 32) != 0) {
                                    i21 &= -458753;
                                    oiVarM = kh.f30051a.M(c0VarR, 6);
                                }
                                if ((i11 & 64) != 0) {
                                    a1VarL = kh.f30051a.L(z12, z10, c0VarR, ((i21 >> 9) & 14) | androidx.media3.exoplayer.a5.S0 | ((i21 << 3) & com.planner5d.library.engine.input.f.b.B));
                                    i22 = i21 & (-3670017);
                                } else {
                                    i22 = i21;
                                }
                                if (i17 != 0) {
                                    jVar2 = null;
                                }
                            }
                            androidx.compose.ui.graphics.q3 q3Var11 = q3VarV;
                            androidx.compose.foundation.a1 a1Var11 = a1VarL;
                            androidx.compose.ui.a0 a0Var12 = a0Var2;
                            oi oiVar11 = oiVarM;
                            c0VarR.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(-1703707081, i22, -1, "androidx.compose.material3.OutlinedIconToggleButton (IconButton.kt:674)");
                            }
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = new Function1() { // from class: androidx.compose.material3.ph
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return ei.S((androidx.compose.ui.semantics.e0) obj);
                                    }
                                };
                                c0VarR.Y(objI0);
                            }
                            boolean z113 = z12;
                            androidx.compose.foundation.interaction.j jVar12 = jVar2;
                            X(z10, function1, androidx.compose.ui.semantics.t.f(a0Var12, false, (Function1) objI0, 1, null), z113, q3Var11, oiVar11, a1Var11, jVar12, function2, c0VarR, i22 & 268434558);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            jVar3 = jVar12;
                            a1Var2 = a1Var11;
                            oiVar2 = oiVar11;
                            q3Var2 = q3Var11;
                            z14 = z113;
                            a0Var3 = a0Var12;
                        } else {
                            c0VarR.u();
                            a0Var3 = a0Var2;
                            z14 = z12;
                            q3Var2 = q3VarV;
                            oiVar2 = oiVarM;
                            a1Var2 = a1VarL;
                            jVar3 = jVar2;
                        }
                        s5VarT = c0VarR.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material3.qh
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return ei.T(z10, function1, a0Var3, z14, q3Var2, oiVar2, a1Var2, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i12 |= 100663296;
                    i20 = i12;
                    if ((i12 & 38347923) != 38347922) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (c0VarR.h(z13, i20 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i13 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i15 != 0) {
                                z12 = true;
                            }
                            if ((i11 & 16) != 0) {
                                i21 = i20 & (-57345);
                                q3VarV = kh.f30051a.v(c0VarR, 6);
                            } else {
                                i21 = i20;
                            }
                            if ((i11 & 32) != 0) {
                                i21 &= -458753;
                                oiVarM = kh.f30051a.M(c0VarR, 6);
                            }
                            if ((i11 & 64) != 0) {
                                a1VarL = kh.f30051a.L(z12, z10, c0VarR, ((i21 >> 9) & 14) | androidx.media3.exoplayer.a5.S0 | ((i21 << 3) & com.planner5d.library.engine.input.f.b.B));
                                i22 = i21 & (-3670017);
                            } else {
                                i22 = i21;
                            }
                            if (i17 != 0) {
                                jVar2 = null;
                            }
                        } else {
                            if (i13 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i15 != 0) {
                                z12 = true;
                            }
                            if ((i11 & 16) != 0) {
                                i21 = i20 & (-57345);
                                q3VarV = kh.f30051a.v(c0VarR, 6);
                            } else {
                                i21 = i20;
                            }
                            if ((i11 & 32) != 0) {
                                i21 &= -458753;
                                oiVarM = kh.f30051a.M(c0VarR, 6);
                            }
                            if ((i11 & 64) != 0) {
                                a1VarL = kh.f30051a.L(z12, z10, c0VarR, ((i21 >> 9) & 14) | androidx.media3.exoplayer.a5.S0 | ((i21 << 3) & com.planner5d.library.engine.input.f.b.B));
                                i22 = i21 & (-3670017);
                            } else {
                                i22 = i21;
                            }
                            if (i17 != 0) {
                                jVar2 = null;
                            }
                        }
                        androidx.compose.ui.graphics.q3 q3Var12 = q3VarV;
                        androidx.compose.foundation.a1 a1Var12 = a1VarL;
                        androidx.compose.ui.a0 a0Var13 = a0Var2;
                        oi oiVar12 = oiVarM;
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-1703707081, i22, -1, "androidx.compose.material3.OutlinedIconToggleButton (IconButton.kt:674)");
                        }
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = new Function1() { // from class: androidx.compose.material3.ph
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return ei.S((androidx.compose.ui.semantics.e0) obj);
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        boolean z114 = z12;
                        androidx.compose.foundation.interaction.j jVar13 = jVar2;
                        X(z10, function1, androidx.compose.ui.semantics.t.f(a0Var13, false, (Function1) objI0, 1, null), z114, q3Var12, oiVar12, a1Var12, jVar13, function2, c0VarR, i22 & 268434558);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        jVar3 = jVar13;
                        a1Var2 = a1Var12;
                        oiVar2 = oiVar12;
                        q3Var2 = q3Var12;
                        z14 = z114;
                        a0Var3 = a0Var13;
                    } else {
                        c0VarR.u();
                        a0Var3 = a0Var2;
                        z14 = z12;
                        q3Var2 = q3VarV;
                        oiVar2 = oiVarM;
                        a1Var2 = a1VarL;
                        jVar3 = jVar2;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.qh
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return ei.T(z10, function1, a0Var3, z14, q3Var2, oiVar2, a1Var2, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 12582912;
                jVar2 = jVar;
                if ((i11 & 256) != 0) {
                    if ((i10 & 100663296) == 0) {
                        if (c0VarR.k0(function2)) {
                            i19 = 67108864;
                        } else {
                            i19 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i12 |= i19;
                    }
                    i20 = i12;
                    if ((i12 & 38347923) != 38347922) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (c0VarR.h(z13, i20 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i13 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i15 != 0) {
                                z12 = true;
                            }
                            if ((i11 & 16) != 0) {
                                i21 = i20 & (-57345);
                                q3VarV = kh.f30051a.v(c0VarR, 6);
                            } else {
                                i21 = i20;
                            }
                            if ((i11 & 32) != 0) {
                                i21 &= -458753;
                                oiVarM = kh.f30051a.M(c0VarR, 6);
                            }
                            if ((i11 & 64) != 0) {
                                a1VarL = kh.f30051a.L(z12, z10, c0VarR, ((i21 >> 9) & 14) | androidx.media3.exoplayer.a5.S0 | ((i21 << 3) & com.planner5d.library.engine.input.f.b.B));
                                i22 = i21 & (-3670017);
                            } else {
                                i22 = i21;
                            }
                            if (i17 != 0) {
                                jVar2 = null;
                            }
                        } else {
                            if (i13 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i15 != 0) {
                                z12 = true;
                            }
                            if ((i11 & 16) != 0) {
                                i21 = i20 & (-57345);
                                q3VarV = kh.f30051a.v(c0VarR, 6);
                            } else {
                                i21 = i20;
                            }
                            if ((i11 & 32) != 0) {
                                i21 &= -458753;
                                oiVarM = kh.f30051a.M(c0VarR, 6);
                            }
                            if ((i11 & 64) != 0) {
                                a1VarL = kh.f30051a.L(z12, z10, c0VarR, ((i21 >> 9) & 14) | androidx.media3.exoplayer.a5.S0 | ((i21 << 3) & com.planner5d.library.engine.input.f.b.B));
                                i22 = i21 & (-3670017);
                            } else {
                                i22 = i21;
                            }
                            if (i17 != 0) {
                                jVar2 = null;
                            }
                        }
                        androidx.compose.ui.graphics.q3 q3Var13 = q3VarV;
                        androidx.compose.foundation.a1 a1Var13 = a1VarL;
                        androidx.compose.ui.a0 a0Var14 = a0Var2;
                        oi oiVar13 = oiVarM;
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-1703707081, i22, -1, "androidx.compose.material3.OutlinedIconToggleButton (IconButton.kt:674)");
                        }
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = new Function1() { // from class: androidx.compose.material3.ph
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return ei.S((androidx.compose.ui.semantics.e0) obj);
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        boolean z115 = z12;
                        androidx.compose.foundation.interaction.j jVar14 = jVar2;
                        X(z10, function1, androidx.compose.ui.semantics.t.f(a0Var14, false, (Function1) objI0, 1, null), z115, q3Var13, oiVar13, a1Var13, jVar14, function2, c0VarR, i22 & 268434558);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        jVar3 = jVar14;
                        a1Var2 = a1Var13;
                        oiVar2 = oiVar13;
                        q3Var2 = q3Var13;
                        z14 = z115;
                        a0Var3 = a0Var14;
                    } else {
                        c0VarR.u();
                        a0Var3 = a0Var2;
                        z14 = z12;
                        q3Var2 = q3VarV;
                        oiVar2 = oiVarM;
                        a1Var2 = a1VarL;
                        jVar3 = jVar2;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.qh
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return ei.T(z10, function1, a0Var3, z14, q3Var2, oiVar2, a1Var2, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 100663296;
                i20 = i12;
                if ((i12 & 38347923) != 38347922) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (c0VarR.h(z13, i20 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i13 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i15 != 0) {
                            z12 = true;
                        }
                        if ((i11 & 16) != 0) {
                            i21 = i20 & (-57345);
                            q3VarV = kh.f30051a.v(c0VarR, 6);
                        } else {
                            i21 = i20;
                        }
                        if ((i11 & 32) != 0) {
                            i21 &= -458753;
                            oiVarM = kh.f30051a.M(c0VarR, 6);
                        }
                        if ((i11 & 64) != 0) {
                            a1VarL = kh.f30051a.L(z12, z10, c0VarR, ((i21 >> 9) & 14) | androidx.media3.exoplayer.a5.S0 | ((i21 << 3) & com.planner5d.library.engine.input.f.b.B));
                            i22 = i21 & (-3670017);
                        } else {
                            i22 = i21;
                        }
                        if (i17 != 0) {
                            jVar2 = null;
                        }
                    } else {
                        if (i13 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i15 != 0) {
                            z12 = true;
                        }
                        if ((i11 & 16) != 0) {
                            i21 = i20 & (-57345);
                            q3VarV = kh.f30051a.v(c0VarR, 6);
                        } else {
                            i21 = i20;
                        }
                        if ((i11 & 32) != 0) {
                            i21 &= -458753;
                            oiVarM = kh.f30051a.M(c0VarR, 6);
                        }
                        if ((i11 & 64) != 0) {
                            a1VarL = kh.f30051a.L(z12, z10, c0VarR, ((i21 >> 9) & 14) | androidx.media3.exoplayer.a5.S0 | ((i21 << 3) & com.planner5d.library.engine.input.f.b.B));
                            i22 = i21 & (-3670017);
                        } else {
                            i22 = i21;
                        }
                        if (i17 != 0) {
                            jVar2 = null;
                        }
                    }
                    androidx.compose.ui.graphics.q3 q3Var14 = q3VarV;
                    androidx.compose.foundation.a1 a1Var14 = a1VarL;
                    androidx.compose.ui.a0 a0Var15 = a0Var2;
                    oi oiVar14 = oiVarM;
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1703707081, i22, -1, "androidx.compose.material3.OutlinedIconToggleButton (IconButton.kt:674)");
                    }
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = new Function1() { // from class: androidx.compose.material3.ph
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return ei.S((androidx.compose.ui.semantics.e0) obj);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    boolean z116 = z12;
                    androidx.compose.foundation.interaction.j jVar15 = jVar2;
                    X(z10, function1, androidx.compose.ui.semantics.t.f(a0Var15, false, (Function1) objI0, 1, null), z116, q3Var14, oiVar14, a1Var14, jVar15, function2, c0VarR, i22 & 268434558);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    jVar3 = jVar15;
                    a1Var2 = a1Var14;
                    oiVar2 = oiVar14;
                    q3Var2 = q3Var14;
                    z14 = z116;
                    a0Var3 = a0Var15;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    z14 = z12;
                    q3Var2 = q3VarV;
                    oiVar2 = oiVarM;
                    a1Var2 = a1VarL;
                    jVar3 = jVar2;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.qh
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ei.T(z10, function1, a0Var3, z14, q3Var2, oiVar2, a1Var2, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 3072;
            z12 = z11;
            if ((i10 & 24576) == 0) {
                if ((i11 & 16) == 0) {
                    q3VarV = q3Var;
                    if (c0VarR.D(q3VarV)) {
                    }
                    i12 |= i23;
                } else {
                    q3VarV = q3Var;
                }
                i12 |= i23;
            } else {
                q3VarV = q3Var;
            }
            if ((196608 & i10) == 0) {
                if ((i11 & 32) == 0) {
                    oiVarM = oiVar;
                    if (c0VarR.D(oiVarM)) {
                    }
                    i12 |= i24;
                } else {
                    oiVarM = oiVar;
                }
                i12 |= i24;
            } else {
                oiVarM = oiVar;
            }
            if ((1572864 & i10) == 0) {
                if ((i11 & 64) == 0) {
                    a1VarL = a1Var;
                    if (c0VarR.D(a1VarL)) {
                    }
                    i12 |= i25;
                } else {
                    a1VarL = a1Var;
                }
                i12 |= i25;
            } else {
                a1VarL = a1Var;
            }
            i17 = i11 & 128;
            if (i17 != 0) {
                if ((12582912 & i10) == 0) {
                    jVar2 = jVar;
                    if (c0VarR.D(jVar2)) {
                        i18 = 8388608;
                    } else {
                        i18 = 4194304;
                    }
                    i12 |= i18;
                }
                if ((i11 & 256) != 0) {
                    if ((i10 & 100663296) == 0) {
                        if (c0VarR.k0(function2)) {
                            i19 = 67108864;
                        } else {
                            i19 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i12 |= i19;
                    }
                    i20 = i12;
                    if ((i12 & 38347923) != 38347922) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (c0VarR.h(z13, i20 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i13 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i15 != 0) {
                                z12 = true;
                            }
                            if ((i11 & 16) != 0) {
                                i21 = i20 & (-57345);
                                q3VarV = kh.f30051a.v(c0VarR, 6);
                            } else {
                                i21 = i20;
                            }
                            if ((i11 & 32) != 0) {
                                i21 &= -458753;
                                oiVarM = kh.f30051a.M(c0VarR, 6);
                            }
                            if ((i11 & 64) != 0) {
                                a1VarL = kh.f30051a.L(z12, z10, c0VarR, ((i21 >> 9) & 14) | androidx.media3.exoplayer.a5.S0 | ((i21 << 3) & com.planner5d.library.engine.input.f.b.B));
                                i22 = i21 & (-3670017);
                            } else {
                                i22 = i21;
                            }
                            if (i17 != 0) {
                                jVar2 = null;
                            }
                        } else {
                            if (i13 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i15 != 0) {
                                z12 = true;
                            }
                            if ((i11 & 16) != 0) {
                                i21 = i20 & (-57345);
                                q3VarV = kh.f30051a.v(c0VarR, 6);
                            } else {
                                i21 = i20;
                            }
                            if ((i11 & 32) != 0) {
                                i21 &= -458753;
                                oiVarM = kh.f30051a.M(c0VarR, 6);
                            }
                            if ((i11 & 64) != 0) {
                                a1VarL = kh.f30051a.L(z12, z10, c0VarR, ((i21 >> 9) & 14) | androidx.media3.exoplayer.a5.S0 | ((i21 << 3) & com.planner5d.library.engine.input.f.b.B));
                                i22 = i21 & (-3670017);
                            } else {
                                i22 = i21;
                            }
                            if (i17 != 0) {
                                jVar2 = null;
                            }
                        }
                        androidx.compose.ui.graphics.q3 q3Var15 = q3VarV;
                        androidx.compose.foundation.a1 a1Var15 = a1VarL;
                        androidx.compose.ui.a0 a0Var16 = a0Var2;
                        oi oiVar15 = oiVarM;
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-1703707081, i22, -1, "androidx.compose.material3.OutlinedIconToggleButton (IconButton.kt:674)");
                        }
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = new Function1() { // from class: androidx.compose.material3.ph
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return ei.S((androidx.compose.ui.semantics.e0) obj);
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        boolean z117 = z12;
                        androidx.compose.foundation.interaction.j jVar16 = jVar2;
                        X(z10, function1, androidx.compose.ui.semantics.t.f(a0Var16, false, (Function1) objI0, 1, null), z117, q3Var15, oiVar15, a1Var15, jVar16, function2, c0VarR, i22 & 268434558);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        jVar3 = jVar16;
                        a1Var2 = a1Var15;
                        oiVar2 = oiVar15;
                        q3Var2 = q3Var15;
                        z14 = z117;
                        a0Var3 = a0Var16;
                    } else {
                        c0VarR.u();
                        a0Var3 = a0Var2;
                        z14 = z12;
                        q3Var2 = q3VarV;
                        oiVar2 = oiVarM;
                        a1Var2 = a1VarL;
                        jVar3 = jVar2;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.qh
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return ei.T(z10, function1, a0Var3, z14, q3Var2, oiVar2, a1Var2, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 100663296;
                i20 = i12;
                if ((i12 & 38347923) != 38347922) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (c0VarR.h(z13, i20 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i13 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i15 != 0) {
                            z12 = true;
                        }
                        if ((i11 & 16) != 0) {
                            i21 = i20 & (-57345);
                            q3VarV = kh.f30051a.v(c0VarR, 6);
                        } else {
                            i21 = i20;
                        }
                        if ((i11 & 32) != 0) {
                            i21 &= -458753;
                            oiVarM = kh.f30051a.M(c0VarR, 6);
                        }
                        if ((i11 & 64) != 0) {
                            a1VarL = kh.f30051a.L(z12, z10, c0VarR, ((i21 >> 9) & 14) | androidx.media3.exoplayer.a5.S0 | ((i21 << 3) & com.planner5d.library.engine.input.f.b.B));
                            i22 = i21 & (-3670017);
                        } else {
                            i22 = i21;
                        }
                        if (i17 != 0) {
                            jVar2 = null;
                        }
                    } else {
                        if (i13 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i15 != 0) {
                            z12 = true;
                        }
                        if ((i11 & 16) != 0) {
                            i21 = i20 & (-57345);
                            q3VarV = kh.f30051a.v(c0VarR, 6);
                        } else {
                            i21 = i20;
                        }
                        if ((i11 & 32) != 0) {
                            i21 &= -458753;
                            oiVarM = kh.f30051a.M(c0VarR, 6);
                        }
                        if ((i11 & 64) != 0) {
                            a1VarL = kh.f30051a.L(z12, z10, c0VarR, ((i21 >> 9) & 14) | androidx.media3.exoplayer.a5.S0 | ((i21 << 3) & com.planner5d.library.engine.input.f.b.B));
                            i22 = i21 & (-3670017);
                        } else {
                            i22 = i21;
                        }
                        if (i17 != 0) {
                            jVar2 = null;
                        }
                    }
                    androidx.compose.ui.graphics.q3 q3Var16 = q3VarV;
                    androidx.compose.foundation.a1 a1Var16 = a1VarL;
                    androidx.compose.ui.a0 a0Var17 = a0Var2;
                    oi oiVar16 = oiVarM;
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1703707081, i22, -1, "androidx.compose.material3.OutlinedIconToggleButton (IconButton.kt:674)");
                    }
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = new Function1() { // from class: androidx.compose.material3.ph
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return ei.S((androidx.compose.ui.semantics.e0) obj);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    boolean z118 = z12;
                    androidx.compose.foundation.interaction.j jVar17 = jVar2;
                    X(z10, function1, androidx.compose.ui.semantics.t.f(a0Var17, false, (Function1) objI0, 1, null), z118, q3Var16, oiVar16, a1Var16, jVar17, function2, c0VarR, i22 & 268434558);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    jVar3 = jVar17;
                    a1Var2 = a1Var16;
                    oiVar2 = oiVar16;
                    q3Var2 = q3Var16;
                    z14 = z118;
                    a0Var3 = a0Var17;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    z14 = z12;
                    q3Var2 = q3VarV;
                    oiVar2 = oiVarM;
                    a1Var2 = a1VarL;
                    jVar3 = jVar2;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.qh
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ei.T(z10, function1, a0Var3, z14, q3Var2, oiVar2, a1Var2, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 12582912;
            jVar2 = jVar;
            if ((i11 & 256) != 0) {
                if ((i10 & 100663296) == 0) {
                    if (c0VarR.k0(function2)) {
                        i19 = 67108864;
                    } else {
                        i19 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i12 |= i19;
                }
                i20 = i12;
                if ((i12 & 38347923) != 38347922) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (c0VarR.h(z13, i20 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i13 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i15 != 0) {
                            z12 = true;
                        }
                        if ((i11 & 16) != 0) {
                            i21 = i20 & (-57345);
                            q3VarV = kh.f30051a.v(c0VarR, 6);
                        } else {
                            i21 = i20;
                        }
                        if ((i11 & 32) != 0) {
                            i21 &= -458753;
                            oiVarM = kh.f30051a.M(c0VarR, 6);
                        }
                        if ((i11 & 64) != 0) {
                            a1VarL = kh.f30051a.L(z12, z10, c0VarR, ((i21 >> 9) & 14) | androidx.media3.exoplayer.a5.S0 | ((i21 << 3) & com.planner5d.library.engine.input.f.b.B));
                            i22 = i21 & (-3670017);
                        } else {
                            i22 = i21;
                        }
                        if (i17 != 0) {
                            jVar2 = null;
                        }
                    } else {
                        if (i13 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i15 != 0) {
                            z12 = true;
                        }
                        if ((i11 & 16) != 0) {
                            i21 = i20 & (-57345);
                            q3VarV = kh.f30051a.v(c0VarR, 6);
                        } else {
                            i21 = i20;
                        }
                        if ((i11 & 32) != 0) {
                            i21 &= -458753;
                            oiVarM = kh.f30051a.M(c0VarR, 6);
                        }
                        if ((i11 & 64) != 0) {
                            a1VarL = kh.f30051a.L(z12, z10, c0VarR, ((i21 >> 9) & 14) | androidx.media3.exoplayer.a5.S0 | ((i21 << 3) & com.planner5d.library.engine.input.f.b.B));
                            i22 = i21 & (-3670017);
                        } else {
                            i22 = i21;
                        }
                        if (i17 != 0) {
                            jVar2 = null;
                        }
                    }
                    androidx.compose.ui.graphics.q3 q3Var17 = q3VarV;
                    androidx.compose.foundation.a1 a1Var17 = a1VarL;
                    androidx.compose.ui.a0 a0Var18 = a0Var2;
                    oi oiVar17 = oiVarM;
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1703707081, i22, -1, "androidx.compose.material3.OutlinedIconToggleButton (IconButton.kt:674)");
                    }
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = new Function1() { // from class: androidx.compose.material3.ph
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return ei.S((androidx.compose.ui.semantics.e0) obj);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    boolean z119 = z12;
                    androidx.compose.foundation.interaction.j jVar18 = jVar2;
                    X(z10, function1, androidx.compose.ui.semantics.t.f(a0Var18, false, (Function1) objI0, 1, null), z119, q3Var17, oiVar17, a1Var17, jVar18, function2, c0VarR, i22 & 268434558);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    jVar3 = jVar18;
                    a1Var2 = a1Var17;
                    oiVar2 = oiVar17;
                    q3Var2 = q3Var17;
                    z14 = z119;
                    a0Var3 = a0Var18;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    z14 = z12;
                    q3Var2 = q3VarV;
                    oiVar2 = oiVarM;
                    a1Var2 = a1VarL;
                    jVar3 = jVar2;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.qh
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ei.T(z10, function1, a0Var3, z14, q3Var2, oiVar2, a1Var2, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 100663296;
            i20 = i12;
            if ((i12 & 38347923) != 38347922) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c0VarR.h(z13, i20 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i13 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i15 != 0) {
                        z12 = true;
                    }
                    if ((i11 & 16) != 0) {
                        i21 = i20 & (-57345);
                        q3VarV = kh.f30051a.v(c0VarR, 6);
                    } else {
                        i21 = i20;
                    }
                    if ((i11 & 32) != 0) {
                        i21 &= -458753;
                        oiVarM = kh.f30051a.M(c0VarR, 6);
                    }
                    if ((i11 & 64) != 0) {
                        a1VarL = kh.f30051a.L(z12, z10, c0VarR, ((i21 >> 9) & 14) | androidx.media3.exoplayer.a5.S0 | ((i21 << 3) & com.planner5d.library.engine.input.f.b.B));
                        i22 = i21 & (-3670017);
                    } else {
                        i22 = i21;
                    }
                    if (i17 != 0) {
                        jVar2 = null;
                    }
                } else {
                    if (i13 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i15 != 0) {
                        z12 = true;
                    }
                    if ((i11 & 16) != 0) {
                        i21 = i20 & (-57345);
                        q3VarV = kh.f30051a.v(c0VarR, 6);
                    } else {
                        i21 = i20;
                    }
                    if ((i11 & 32) != 0) {
                        i21 &= -458753;
                        oiVarM = kh.f30051a.M(c0VarR, 6);
                    }
                    if ((i11 & 64) != 0) {
                        a1VarL = kh.f30051a.L(z12, z10, c0VarR, ((i21 >> 9) & 14) | androidx.media3.exoplayer.a5.S0 | ((i21 << 3) & com.planner5d.library.engine.input.f.b.B));
                        i22 = i21 & (-3670017);
                    } else {
                        i22 = i21;
                    }
                    if (i17 != 0) {
                        jVar2 = null;
                    }
                }
                androidx.compose.ui.graphics.q3 q3Var18 = q3VarV;
                androidx.compose.foundation.a1 a1Var18 = a1VarL;
                androidx.compose.ui.a0 a0Var19 = a0Var2;
                oi oiVar18 = oiVarM;
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1703707081, i22, -1, "androidx.compose.material3.OutlinedIconToggleButton (IconButton.kt:674)");
                }
                objI0 = c0VarR.i0();
                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = new Function1() { // from class: androidx.compose.material3.ph
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return ei.S((androidx.compose.ui.semantics.e0) obj);
                        }
                    };
                    c0VarR.Y(objI0);
                }
                boolean z1110 = z12;
                androidx.compose.foundation.interaction.j jVar19 = jVar2;
                X(z10, function1, androidx.compose.ui.semantics.t.f(a0Var19, false, (Function1) objI0, 1, null), z1110, q3Var18, oiVar18, a1Var18, jVar19, function2, c0VarR, i22 & 268434558);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                jVar3 = jVar19;
                a1Var2 = a1Var18;
                oiVar2 = oiVar18;
                q3Var2 = q3Var18;
                z14 = z1110;
                a0Var3 = a0Var19;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                z14 = z12;
                q3Var2 = q3VarV;
                oiVar2 = oiVarM;
                a1Var2 = a1VarL;
                jVar3 = jVar2;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.qh
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ei.T(z10, function1, a0Var3, z14, q3Var2, oiVar2, a1Var2, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 48;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                a0Var2 = a0Var;
                if (c0VarR.D(a0Var2)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 3072) == 0) {
                    z12 = z11;
                    if (c0VarR.G(z12)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                if ((i10 & 24576) == 0) {
                    if ((i11 & 16) == 0) {
                        q3VarV = q3Var;
                        if (c0VarR.D(q3VarV)) {
                        }
                        i12 |= i23;
                    } else {
                        q3VarV = q3Var;
                    }
                    i12 |= i23;
                } else {
                    q3VarV = q3Var;
                }
                if ((196608 & i10) == 0) {
                    if ((i11 & 32) == 0) {
                        oiVarM = oiVar;
                        if (c0VarR.D(oiVarM)) {
                        }
                        i12 |= i24;
                    } else {
                        oiVarM = oiVar;
                    }
                    i12 |= i24;
                } else {
                    oiVarM = oiVar;
                }
                if ((1572864 & i10) == 0) {
                    if ((i11 & 64) == 0) {
                        a1VarL = a1Var;
                        if (c0VarR.D(a1VarL)) {
                        }
                        i12 |= i25;
                    } else {
                        a1VarL = a1Var;
                    }
                    i12 |= i25;
                } else {
                    a1VarL = a1Var;
                }
                i17 = i11 & 128;
                if (i17 != 0) {
                    if ((12582912 & i10) == 0) {
                        jVar2 = jVar;
                        if (c0VarR.D(jVar2)) {
                            i18 = 8388608;
                        } else {
                            i18 = 4194304;
                        }
                        i12 |= i18;
                    }
                    if ((i11 & 256) != 0) {
                        if ((i10 & 100663296) == 0) {
                            if (c0VarR.k0(function2)) {
                                i19 = 67108864;
                            } else {
                                i19 = com.google.api.client.googleapis.media.a.f115410j;
                            }
                            i12 |= i19;
                        }
                        i20 = i12;
                        if ((i12 & 38347923) != 38347922) {
                            z13 = true;
                        } else {
                            z13 = false;
                        }
                        if (c0VarR.h(z13, i20 & 1)) {
                            c0VarR.l0();
                            if ((i10 & 1) != 0) {
                                if (i13 != 0) {
                                    a0Var2 = androidx.compose.ui.a0.E;
                                }
                                if (i15 != 0) {
                                    z12 = true;
                                }
                                if ((i11 & 16) != 0) {
                                    i21 = i20 & (-57345);
                                    q3VarV = kh.f30051a.v(c0VarR, 6);
                                } else {
                                    i21 = i20;
                                }
                                if ((i11 & 32) != 0) {
                                    i21 &= -458753;
                                    oiVarM = kh.f30051a.M(c0VarR, 6);
                                }
                                if ((i11 & 64) != 0) {
                                    a1VarL = kh.f30051a.L(z12, z10, c0VarR, ((i21 >> 9) & 14) | androidx.media3.exoplayer.a5.S0 | ((i21 << 3) & com.planner5d.library.engine.input.f.b.B));
                                    i22 = i21 & (-3670017);
                                } else {
                                    i22 = i21;
                                }
                                if (i17 != 0) {
                                    jVar2 = null;
                                }
                            } else {
                                if (i13 != 0) {
                                    a0Var2 = androidx.compose.ui.a0.E;
                                }
                                if (i15 != 0) {
                                    z12 = true;
                                }
                                if ((i11 & 16) != 0) {
                                    i21 = i20 & (-57345);
                                    q3VarV = kh.f30051a.v(c0VarR, 6);
                                } else {
                                    i21 = i20;
                                }
                                if ((i11 & 32) != 0) {
                                    i21 &= -458753;
                                    oiVarM = kh.f30051a.M(c0VarR, 6);
                                }
                                if ((i11 & 64) != 0) {
                                    a1VarL = kh.f30051a.L(z12, z10, c0VarR, ((i21 >> 9) & 14) | androidx.media3.exoplayer.a5.S0 | ((i21 << 3) & com.planner5d.library.engine.input.f.b.B));
                                    i22 = i21 & (-3670017);
                                } else {
                                    i22 = i21;
                                }
                                if (i17 != 0) {
                                    jVar2 = null;
                                }
                            }
                            androidx.compose.ui.graphics.q3 q3Var19 = q3VarV;
                            androidx.compose.foundation.a1 a1Var19 = a1VarL;
                            androidx.compose.ui.a0 a0Var110 = a0Var2;
                            oi oiVar19 = oiVarM;
                            c0VarR.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(-1703707081, i22, -1, "androidx.compose.material3.OutlinedIconToggleButton (IconButton.kt:674)");
                            }
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = new Function1() { // from class: androidx.compose.material3.ph
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return ei.S((androidx.compose.ui.semantics.e0) obj);
                                    }
                                };
                                c0VarR.Y(objI0);
                            }
                            boolean z1111 = z12;
                            androidx.compose.foundation.interaction.j jVar110 = jVar2;
                            X(z10, function1, androidx.compose.ui.semantics.t.f(a0Var110, false, (Function1) objI0, 1, null), z1111, q3Var19, oiVar19, a1Var19, jVar110, function2, c0VarR, i22 & 268434558);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            jVar3 = jVar110;
                            a1Var2 = a1Var19;
                            oiVar2 = oiVar19;
                            q3Var2 = q3Var19;
                            z14 = z1111;
                            a0Var3 = a0Var110;
                        } else {
                            c0VarR.u();
                            a0Var3 = a0Var2;
                            z14 = z12;
                            q3Var2 = q3VarV;
                            oiVar2 = oiVarM;
                            a1Var2 = a1VarL;
                            jVar3 = jVar2;
                        }
                        s5VarT = c0VarR.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material3.qh
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return ei.T(z10, function1, a0Var3, z14, q3Var2, oiVar2, a1Var2, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i12 |= 100663296;
                    i20 = i12;
                    if ((i12 & 38347923) != 38347922) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (c0VarR.h(z13, i20 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i13 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i15 != 0) {
                                z12 = true;
                            }
                            if ((i11 & 16) != 0) {
                                i21 = i20 & (-57345);
                                q3VarV = kh.f30051a.v(c0VarR, 6);
                            } else {
                                i21 = i20;
                            }
                            if ((i11 & 32) != 0) {
                                i21 &= -458753;
                                oiVarM = kh.f30051a.M(c0VarR, 6);
                            }
                            if ((i11 & 64) != 0) {
                                a1VarL = kh.f30051a.L(z12, z10, c0VarR, ((i21 >> 9) & 14) | androidx.media3.exoplayer.a5.S0 | ((i21 << 3) & com.planner5d.library.engine.input.f.b.B));
                                i22 = i21 & (-3670017);
                            } else {
                                i22 = i21;
                            }
                            if (i17 != 0) {
                                jVar2 = null;
                            }
                        } else {
                            if (i13 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i15 != 0) {
                                z12 = true;
                            }
                            if ((i11 & 16) != 0) {
                                i21 = i20 & (-57345);
                                q3VarV = kh.f30051a.v(c0VarR, 6);
                            } else {
                                i21 = i20;
                            }
                            if ((i11 & 32) != 0) {
                                i21 &= -458753;
                                oiVarM = kh.f30051a.M(c0VarR, 6);
                            }
                            if ((i11 & 64) != 0) {
                                a1VarL = kh.f30051a.L(z12, z10, c0VarR, ((i21 >> 9) & 14) | androidx.media3.exoplayer.a5.S0 | ((i21 << 3) & com.planner5d.library.engine.input.f.b.B));
                                i22 = i21 & (-3670017);
                            } else {
                                i22 = i21;
                            }
                            if (i17 != 0) {
                                jVar2 = null;
                            }
                        }
                        androidx.compose.ui.graphics.q3 q3Var110 = q3VarV;
                        androidx.compose.foundation.a1 a1Var110 = a1VarL;
                        androidx.compose.ui.a0 a0Var111 = a0Var2;
                        oi oiVar110 = oiVarM;
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-1703707081, i22, -1, "androidx.compose.material3.OutlinedIconToggleButton (IconButton.kt:674)");
                        }
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = new Function1() { // from class: androidx.compose.material3.ph
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return ei.S((androidx.compose.ui.semantics.e0) obj);
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        boolean z1112 = z12;
                        androidx.compose.foundation.interaction.j jVar111 = jVar2;
                        X(z10, function1, androidx.compose.ui.semantics.t.f(a0Var111, false, (Function1) objI0, 1, null), z1112, q3Var110, oiVar110, a1Var110, jVar111, function2, c0VarR, i22 & 268434558);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        jVar3 = jVar111;
                        a1Var2 = a1Var110;
                        oiVar2 = oiVar110;
                        q3Var2 = q3Var110;
                        z14 = z1112;
                        a0Var3 = a0Var111;
                    } else {
                        c0VarR.u();
                        a0Var3 = a0Var2;
                        z14 = z12;
                        q3Var2 = q3VarV;
                        oiVar2 = oiVarM;
                        a1Var2 = a1VarL;
                        jVar3 = jVar2;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.qh
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return ei.T(z10, function1, a0Var3, z14, q3Var2, oiVar2, a1Var2, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 12582912;
                jVar2 = jVar;
                if ((i11 & 256) != 0) {
                    if ((i10 & 100663296) == 0) {
                        if (c0VarR.k0(function2)) {
                            i19 = 67108864;
                        } else {
                            i19 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i12 |= i19;
                    }
                    i20 = i12;
                    if ((i12 & 38347923) != 38347922) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (c0VarR.h(z13, i20 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i13 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i15 != 0) {
                                z12 = true;
                            }
                            if ((i11 & 16) != 0) {
                                i21 = i20 & (-57345);
                                q3VarV = kh.f30051a.v(c0VarR, 6);
                            } else {
                                i21 = i20;
                            }
                            if ((i11 & 32) != 0) {
                                i21 &= -458753;
                                oiVarM = kh.f30051a.M(c0VarR, 6);
                            }
                            if ((i11 & 64) != 0) {
                                a1VarL = kh.f30051a.L(z12, z10, c0VarR, ((i21 >> 9) & 14) | androidx.media3.exoplayer.a5.S0 | ((i21 << 3) & com.planner5d.library.engine.input.f.b.B));
                                i22 = i21 & (-3670017);
                            } else {
                                i22 = i21;
                            }
                            if (i17 != 0) {
                                jVar2 = null;
                            }
                        } else {
                            if (i13 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i15 != 0) {
                                z12 = true;
                            }
                            if ((i11 & 16) != 0) {
                                i21 = i20 & (-57345);
                                q3VarV = kh.f30051a.v(c0VarR, 6);
                            } else {
                                i21 = i20;
                            }
                            if ((i11 & 32) != 0) {
                                i21 &= -458753;
                                oiVarM = kh.f30051a.M(c0VarR, 6);
                            }
                            if ((i11 & 64) != 0) {
                                a1VarL = kh.f30051a.L(z12, z10, c0VarR, ((i21 >> 9) & 14) | androidx.media3.exoplayer.a5.S0 | ((i21 << 3) & com.planner5d.library.engine.input.f.b.B));
                                i22 = i21 & (-3670017);
                            } else {
                                i22 = i21;
                            }
                            if (i17 != 0) {
                                jVar2 = null;
                            }
                        }
                        androidx.compose.ui.graphics.q3 q3Var111 = q3VarV;
                        androidx.compose.foundation.a1 a1Var111 = a1VarL;
                        androidx.compose.ui.a0 a0Var112 = a0Var2;
                        oi oiVar111 = oiVarM;
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-1703707081, i22, -1, "androidx.compose.material3.OutlinedIconToggleButton (IconButton.kt:674)");
                        }
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = new Function1() { // from class: androidx.compose.material3.ph
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return ei.S((androidx.compose.ui.semantics.e0) obj);
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        boolean z1113 = z12;
                        androidx.compose.foundation.interaction.j jVar112 = jVar2;
                        X(z10, function1, androidx.compose.ui.semantics.t.f(a0Var112, false, (Function1) objI0, 1, null), z1113, q3Var111, oiVar111, a1Var111, jVar112, function2, c0VarR, i22 & 268434558);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        jVar3 = jVar112;
                        a1Var2 = a1Var111;
                        oiVar2 = oiVar111;
                        q3Var2 = q3Var111;
                        z14 = z1113;
                        a0Var3 = a0Var112;
                    } else {
                        c0VarR.u();
                        a0Var3 = a0Var2;
                        z14 = z12;
                        q3Var2 = q3VarV;
                        oiVar2 = oiVarM;
                        a1Var2 = a1VarL;
                        jVar3 = jVar2;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.qh
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return ei.T(z10, function1, a0Var3, z14, q3Var2, oiVar2, a1Var2, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 100663296;
                i20 = i12;
                if ((i12 & 38347923) != 38347922) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (c0VarR.h(z13, i20 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i13 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i15 != 0) {
                            z12 = true;
                        }
                        if ((i11 & 16) != 0) {
                            i21 = i20 & (-57345);
                            q3VarV = kh.f30051a.v(c0VarR, 6);
                        } else {
                            i21 = i20;
                        }
                        if ((i11 & 32) != 0) {
                            i21 &= -458753;
                            oiVarM = kh.f30051a.M(c0VarR, 6);
                        }
                        if ((i11 & 64) != 0) {
                            a1VarL = kh.f30051a.L(z12, z10, c0VarR, ((i21 >> 9) & 14) | androidx.media3.exoplayer.a5.S0 | ((i21 << 3) & com.planner5d.library.engine.input.f.b.B));
                            i22 = i21 & (-3670017);
                        } else {
                            i22 = i21;
                        }
                        if (i17 != 0) {
                            jVar2 = null;
                        }
                    } else {
                        if (i13 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i15 != 0) {
                            z12 = true;
                        }
                        if ((i11 & 16) != 0) {
                            i21 = i20 & (-57345);
                            q3VarV = kh.f30051a.v(c0VarR, 6);
                        } else {
                            i21 = i20;
                        }
                        if ((i11 & 32) != 0) {
                            i21 &= -458753;
                            oiVarM = kh.f30051a.M(c0VarR, 6);
                        }
                        if ((i11 & 64) != 0) {
                            a1VarL = kh.f30051a.L(z12, z10, c0VarR, ((i21 >> 9) & 14) | androidx.media3.exoplayer.a5.S0 | ((i21 << 3) & com.planner5d.library.engine.input.f.b.B));
                            i22 = i21 & (-3670017);
                        } else {
                            i22 = i21;
                        }
                        if (i17 != 0) {
                            jVar2 = null;
                        }
                    }
                    androidx.compose.ui.graphics.q3 q3Var112 = q3VarV;
                    androidx.compose.foundation.a1 a1Var112 = a1VarL;
                    androidx.compose.ui.a0 a0Var113 = a0Var2;
                    oi oiVar112 = oiVarM;
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1703707081, i22, -1, "androidx.compose.material3.OutlinedIconToggleButton (IconButton.kt:674)");
                    }
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = new Function1() { // from class: androidx.compose.material3.ph
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return ei.S((androidx.compose.ui.semantics.e0) obj);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    boolean z1114 = z12;
                    androidx.compose.foundation.interaction.j jVar113 = jVar2;
                    X(z10, function1, androidx.compose.ui.semantics.t.f(a0Var113, false, (Function1) objI0, 1, null), z1114, q3Var112, oiVar112, a1Var112, jVar113, function2, c0VarR, i22 & 268434558);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    jVar3 = jVar113;
                    a1Var2 = a1Var112;
                    oiVar2 = oiVar112;
                    q3Var2 = q3Var112;
                    z14 = z1114;
                    a0Var3 = a0Var113;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    z14 = z12;
                    q3Var2 = q3VarV;
                    oiVar2 = oiVarM;
                    a1Var2 = a1VarL;
                    jVar3 = jVar2;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.qh
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ei.T(z10, function1, a0Var3, z14, q3Var2, oiVar2, a1Var2, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 3072;
            z12 = z11;
            if ((i10 & 24576) == 0) {
                if ((i11 & 16) == 0) {
                    q3VarV = q3Var;
                    if (c0VarR.D(q3VarV)) {
                    }
                    i12 |= i23;
                } else {
                    q3VarV = q3Var;
                }
                i12 |= i23;
            } else {
                q3VarV = q3Var;
            }
            if ((196608 & i10) == 0) {
                if ((i11 & 32) == 0) {
                    oiVarM = oiVar;
                    if (c0VarR.D(oiVarM)) {
                    }
                    i12 |= i24;
                } else {
                    oiVarM = oiVar;
                }
                i12 |= i24;
            } else {
                oiVarM = oiVar;
            }
            if ((1572864 & i10) == 0) {
                if ((i11 & 64) == 0) {
                    a1VarL = a1Var;
                    if (c0VarR.D(a1VarL)) {
                    }
                    i12 |= i25;
                } else {
                    a1VarL = a1Var;
                }
                i12 |= i25;
            } else {
                a1VarL = a1Var;
            }
            i17 = i11 & 128;
            if (i17 != 0) {
                if ((12582912 & i10) == 0) {
                    jVar2 = jVar;
                    if (c0VarR.D(jVar2)) {
                        i18 = 8388608;
                    } else {
                        i18 = 4194304;
                    }
                    i12 |= i18;
                }
                if ((i11 & 256) != 0) {
                    if ((i10 & 100663296) == 0) {
                        if (c0VarR.k0(function2)) {
                            i19 = 67108864;
                        } else {
                            i19 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i12 |= i19;
                    }
                    i20 = i12;
                    if ((i12 & 38347923) != 38347922) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (c0VarR.h(z13, i20 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i13 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i15 != 0) {
                                z12 = true;
                            }
                            if ((i11 & 16) != 0) {
                                i21 = i20 & (-57345);
                                q3VarV = kh.f30051a.v(c0VarR, 6);
                            } else {
                                i21 = i20;
                            }
                            if ((i11 & 32) != 0) {
                                i21 &= -458753;
                                oiVarM = kh.f30051a.M(c0VarR, 6);
                            }
                            if ((i11 & 64) != 0) {
                                a1VarL = kh.f30051a.L(z12, z10, c0VarR, ((i21 >> 9) & 14) | androidx.media3.exoplayer.a5.S0 | ((i21 << 3) & com.planner5d.library.engine.input.f.b.B));
                                i22 = i21 & (-3670017);
                            } else {
                                i22 = i21;
                            }
                            if (i17 != 0) {
                                jVar2 = null;
                            }
                        } else {
                            if (i13 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i15 != 0) {
                                z12 = true;
                            }
                            if ((i11 & 16) != 0) {
                                i21 = i20 & (-57345);
                                q3VarV = kh.f30051a.v(c0VarR, 6);
                            } else {
                                i21 = i20;
                            }
                            if ((i11 & 32) != 0) {
                                i21 &= -458753;
                                oiVarM = kh.f30051a.M(c0VarR, 6);
                            }
                            if ((i11 & 64) != 0) {
                                a1VarL = kh.f30051a.L(z12, z10, c0VarR, ((i21 >> 9) & 14) | androidx.media3.exoplayer.a5.S0 | ((i21 << 3) & com.planner5d.library.engine.input.f.b.B));
                                i22 = i21 & (-3670017);
                            } else {
                                i22 = i21;
                            }
                            if (i17 != 0) {
                                jVar2 = null;
                            }
                        }
                        androidx.compose.ui.graphics.q3 q3Var113 = q3VarV;
                        androidx.compose.foundation.a1 a1Var113 = a1VarL;
                        androidx.compose.ui.a0 a0Var114 = a0Var2;
                        oi oiVar113 = oiVarM;
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-1703707081, i22, -1, "androidx.compose.material3.OutlinedIconToggleButton (IconButton.kt:674)");
                        }
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = new Function1() { // from class: androidx.compose.material3.ph
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return ei.S((androidx.compose.ui.semantics.e0) obj);
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        boolean z1115 = z12;
                        androidx.compose.foundation.interaction.j jVar114 = jVar2;
                        X(z10, function1, androidx.compose.ui.semantics.t.f(a0Var114, false, (Function1) objI0, 1, null), z1115, q3Var113, oiVar113, a1Var113, jVar114, function2, c0VarR, i22 & 268434558);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        jVar3 = jVar114;
                        a1Var2 = a1Var113;
                        oiVar2 = oiVar113;
                        q3Var2 = q3Var113;
                        z14 = z1115;
                        a0Var3 = a0Var114;
                    } else {
                        c0VarR.u();
                        a0Var3 = a0Var2;
                        z14 = z12;
                        q3Var2 = q3VarV;
                        oiVar2 = oiVarM;
                        a1Var2 = a1VarL;
                        jVar3 = jVar2;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.qh
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return ei.T(z10, function1, a0Var3, z14, q3Var2, oiVar2, a1Var2, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 100663296;
                i20 = i12;
                if ((i12 & 38347923) != 38347922) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (c0VarR.h(z13, i20 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i13 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i15 != 0) {
                            z12 = true;
                        }
                        if ((i11 & 16) != 0) {
                            i21 = i20 & (-57345);
                            q3VarV = kh.f30051a.v(c0VarR, 6);
                        } else {
                            i21 = i20;
                        }
                        if ((i11 & 32) != 0) {
                            i21 &= -458753;
                            oiVarM = kh.f30051a.M(c0VarR, 6);
                        }
                        if ((i11 & 64) != 0) {
                            a1VarL = kh.f30051a.L(z12, z10, c0VarR, ((i21 >> 9) & 14) | androidx.media3.exoplayer.a5.S0 | ((i21 << 3) & com.planner5d.library.engine.input.f.b.B));
                            i22 = i21 & (-3670017);
                        } else {
                            i22 = i21;
                        }
                        if (i17 != 0) {
                            jVar2 = null;
                        }
                    } else {
                        if (i13 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i15 != 0) {
                            z12 = true;
                        }
                        if ((i11 & 16) != 0) {
                            i21 = i20 & (-57345);
                            q3VarV = kh.f30051a.v(c0VarR, 6);
                        } else {
                            i21 = i20;
                        }
                        if ((i11 & 32) != 0) {
                            i21 &= -458753;
                            oiVarM = kh.f30051a.M(c0VarR, 6);
                        }
                        if ((i11 & 64) != 0) {
                            a1VarL = kh.f30051a.L(z12, z10, c0VarR, ((i21 >> 9) & 14) | androidx.media3.exoplayer.a5.S0 | ((i21 << 3) & com.planner5d.library.engine.input.f.b.B));
                            i22 = i21 & (-3670017);
                        } else {
                            i22 = i21;
                        }
                        if (i17 != 0) {
                            jVar2 = null;
                        }
                    }
                    androidx.compose.ui.graphics.q3 q3Var114 = q3VarV;
                    androidx.compose.foundation.a1 a1Var114 = a1VarL;
                    androidx.compose.ui.a0 a0Var115 = a0Var2;
                    oi oiVar114 = oiVarM;
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1703707081, i22, -1, "androidx.compose.material3.OutlinedIconToggleButton (IconButton.kt:674)");
                    }
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = new Function1() { // from class: androidx.compose.material3.ph
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return ei.S((androidx.compose.ui.semantics.e0) obj);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    boolean z1116 = z12;
                    androidx.compose.foundation.interaction.j jVar115 = jVar2;
                    X(z10, function1, androidx.compose.ui.semantics.t.f(a0Var115, false, (Function1) objI0, 1, null), z1116, q3Var114, oiVar114, a1Var114, jVar115, function2, c0VarR, i22 & 268434558);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    jVar3 = jVar115;
                    a1Var2 = a1Var114;
                    oiVar2 = oiVar114;
                    q3Var2 = q3Var114;
                    z14 = z1116;
                    a0Var3 = a0Var115;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    z14 = z12;
                    q3Var2 = q3VarV;
                    oiVar2 = oiVarM;
                    a1Var2 = a1VarL;
                    jVar3 = jVar2;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.qh
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ei.T(z10, function1, a0Var3, z14, q3Var2, oiVar2, a1Var2, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 12582912;
            jVar2 = jVar;
            if ((i11 & 256) != 0) {
                if ((i10 & 100663296) == 0) {
                    if (c0VarR.k0(function2)) {
                        i19 = 67108864;
                    } else {
                        i19 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i12 |= i19;
                }
                i20 = i12;
                if ((i12 & 38347923) != 38347922) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (c0VarR.h(z13, i20 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i13 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i15 != 0) {
                            z12 = true;
                        }
                        if ((i11 & 16) != 0) {
                            i21 = i20 & (-57345);
                            q3VarV = kh.f30051a.v(c0VarR, 6);
                        } else {
                            i21 = i20;
                        }
                        if ((i11 & 32) != 0) {
                            i21 &= -458753;
                            oiVarM = kh.f30051a.M(c0VarR, 6);
                        }
                        if ((i11 & 64) != 0) {
                            a1VarL = kh.f30051a.L(z12, z10, c0VarR, ((i21 >> 9) & 14) | androidx.media3.exoplayer.a5.S0 | ((i21 << 3) & com.planner5d.library.engine.input.f.b.B));
                            i22 = i21 & (-3670017);
                        } else {
                            i22 = i21;
                        }
                        if (i17 != 0) {
                            jVar2 = null;
                        }
                    } else {
                        if (i13 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i15 != 0) {
                            z12 = true;
                        }
                        if ((i11 & 16) != 0) {
                            i21 = i20 & (-57345);
                            q3VarV = kh.f30051a.v(c0VarR, 6);
                        } else {
                            i21 = i20;
                        }
                        if ((i11 & 32) != 0) {
                            i21 &= -458753;
                            oiVarM = kh.f30051a.M(c0VarR, 6);
                        }
                        if ((i11 & 64) != 0) {
                            a1VarL = kh.f30051a.L(z12, z10, c0VarR, ((i21 >> 9) & 14) | androidx.media3.exoplayer.a5.S0 | ((i21 << 3) & com.planner5d.library.engine.input.f.b.B));
                            i22 = i21 & (-3670017);
                        } else {
                            i22 = i21;
                        }
                        if (i17 != 0) {
                            jVar2 = null;
                        }
                    }
                    androidx.compose.ui.graphics.q3 q3Var115 = q3VarV;
                    androidx.compose.foundation.a1 a1Var115 = a1VarL;
                    androidx.compose.ui.a0 a0Var116 = a0Var2;
                    oi oiVar115 = oiVarM;
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1703707081, i22, -1, "androidx.compose.material3.OutlinedIconToggleButton (IconButton.kt:674)");
                    }
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = new Function1() { // from class: androidx.compose.material3.ph
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return ei.S((androidx.compose.ui.semantics.e0) obj);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    boolean z1117 = z12;
                    androidx.compose.foundation.interaction.j jVar116 = jVar2;
                    X(z10, function1, androidx.compose.ui.semantics.t.f(a0Var116, false, (Function1) objI0, 1, null), z1117, q3Var115, oiVar115, a1Var115, jVar116, function2, c0VarR, i22 & 268434558);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    jVar3 = jVar116;
                    a1Var2 = a1Var115;
                    oiVar2 = oiVar115;
                    q3Var2 = q3Var115;
                    z14 = z1117;
                    a0Var3 = a0Var116;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    z14 = z12;
                    q3Var2 = q3VarV;
                    oiVar2 = oiVarM;
                    a1Var2 = a1VarL;
                    jVar3 = jVar2;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.qh
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ei.T(z10, function1, a0Var3, z14, q3Var2, oiVar2, a1Var2, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 100663296;
            i20 = i12;
            if ((i12 & 38347923) != 38347922) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c0VarR.h(z13, i20 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i13 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i15 != 0) {
                        z12 = true;
                    }
                    if ((i11 & 16) != 0) {
                        i21 = i20 & (-57345);
                        q3VarV = kh.f30051a.v(c0VarR, 6);
                    } else {
                        i21 = i20;
                    }
                    if ((i11 & 32) != 0) {
                        i21 &= -458753;
                        oiVarM = kh.f30051a.M(c0VarR, 6);
                    }
                    if ((i11 & 64) != 0) {
                        a1VarL = kh.f30051a.L(z12, z10, c0VarR, ((i21 >> 9) & 14) | androidx.media3.exoplayer.a5.S0 | ((i21 << 3) & com.planner5d.library.engine.input.f.b.B));
                        i22 = i21 & (-3670017);
                    } else {
                        i22 = i21;
                    }
                    if (i17 != 0) {
                        jVar2 = null;
                    }
                } else {
                    if (i13 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i15 != 0) {
                        z12 = true;
                    }
                    if ((i11 & 16) != 0) {
                        i21 = i20 & (-57345);
                        q3VarV = kh.f30051a.v(c0VarR, 6);
                    } else {
                        i21 = i20;
                    }
                    if ((i11 & 32) != 0) {
                        i21 &= -458753;
                        oiVarM = kh.f30051a.M(c0VarR, 6);
                    }
                    if ((i11 & 64) != 0) {
                        a1VarL = kh.f30051a.L(z12, z10, c0VarR, ((i21 >> 9) & 14) | androidx.media3.exoplayer.a5.S0 | ((i21 << 3) & com.planner5d.library.engine.input.f.b.B));
                        i22 = i21 & (-3670017);
                    } else {
                        i22 = i21;
                    }
                    if (i17 != 0) {
                        jVar2 = null;
                    }
                }
                androidx.compose.ui.graphics.q3 q3Var116 = q3VarV;
                androidx.compose.foundation.a1 a1Var116 = a1VarL;
                androidx.compose.ui.a0 a0Var117 = a0Var2;
                oi oiVar116 = oiVarM;
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1703707081, i22, -1, "androidx.compose.material3.OutlinedIconToggleButton (IconButton.kt:674)");
                }
                objI0 = c0VarR.i0();
                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = new Function1() { // from class: androidx.compose.material3.ph
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return ei.S((androidx.compose.ui.semantics.e0) obj);
                        }
                    };
                    c0VarR.Y(objI0);
                }
                boolean z1118 = z12;
                androidx.compose.foundation.interaction.j jVar117 = jVar2;
                X(z10, function1, androidx.compose.ui.semantics.t.f(a0Var117, false, (Function1) objI0, 1, null), z1118, q3Var116, oiVar116, a1Var116, jVar117, function2, c0VarR, i22 & 268434558);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                jVar3 = jVar117;
                a1Var2 = a1Var116;
                oiVar2 = oiVar116;
                q3Var2 = q3Var116;
                z14 = z1118;
                a0Var3 = a0Var117;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                z14 = z12;
                q3Var2 = q3VarV;
                oiVar2 = oiVarM;
                a1Var2 = a1VarL;
                jVar3 = jVar2;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.qh
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ei.T(z10, function1, a0Var3, z14, q3Var2, oiVar2, a1Var2, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= androidx.media3.exoplayer.a5.S0;
        a0Var2 = a0Var;
        i15 = i11 & 8;
        if (i15 != 0) {
            if ((i10 & 3072) == 0) {
                z12 = z11;
                if (c0VarR.G(z12)) {
                    i16 = 2048;
                } else {
                    i16 = 1024;
                }
                i12 |= i16;
            }
            if ((i10 & 24576) == 0) {
                if ((i11 & 16) == 0) {
                    q3VarV = q3Var;
                    if (c0VarR.D(q3VarV)) {
                    }
                    i12 |= i23;
                } else {
                    q3VarV = q3Var;
                }
                i12 |= i23;
            } else {
                q3VarV = q3Var;
            }
            if ((196608 & i10) == 0) {
                if ((i11 & 32) == 0) {
                    oiVarM = oiVar;
                    if (c0VarR.D(oiVarM)) {
                    }
                    i12 |= i24;
                } else {
                    oiVarM = oiVar;
                }
                i12 |= i24;
            } else {
                oiVarM = oiVar;
            }
            if ((1572864 & i10) == 0) {
                if ((i11 & 64) == 0) {
                    a1VarL = a1Var;
                    if (c0VarR.D(a1VarL)) {
                    }
                    i12 |= i25;
                } else {
                    a1VarL = a1Var;
                }
                i12 |= i25;
            } else {
                a1VarL = a1Var;
            }
            i17 = i11 & 128;
            if (i17 != 0) {
                if ((12582912 & i10) == 0) {
                    jVar2 = jVar;
                    if (c0VarR.D(jVar2)) {
                        i18 = 8388608;
                    } else {
                        i18 = 4194304;
                    }
                    i12 |= i18;
                }
                if ((i11 & 256) != 0) {
                    if ((i10 & 100663296) == 0) {
                        if (c0VarR.k0(function2)) {
                            i19 = 67108864;
                        } else {
                            i19 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i12 |= i19;
                    }
                    i20 = i12;
                    if ((i12 & 38347923) != 38347922) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (c0VarR.h(z13, i20 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i13 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i15 != 0) {
                                z12 = true;
                            }
                            if ((i11 & 16) != 0) {
                                i21 = i20 & (-57345);
                                q3VarV = kh.f30051a.v(c0VarR, 6);
                            } else {
                                i21 = i20;
                            }
                            if ((i11 & 32) != 0) {
                                i21 &= -458753;
                                oiVarM = kh.f30051a.M(c0VarR, 6);
                            }
                            if ((i11 & 64) != 0) {
                                a1VarL = kh.f30051a.L(z12, z10, c0VarR, ((i21 >> 9) & 14) | androidx.media3.exoplayer.a5.S0 | ((i21 << 3) & com.planner5d.library.engine.input.f.b.B));
                                i22 = i21 & (-3670017);
                            } else {
                                i22 = i21;
                            }
                            if (i17 != 0) {
                                jVar2 = null;
                            }
                        } else {
                            if (i13 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i15 != 0) {
                                z12 = true;
                            }
                            if ((i11 & 16) != 0) {
                                i21 = i20 & (-57345);
                                q3VarV = kh.f30051a.v(c0VarR, 6);
                            } else {
                                i21 = i20;
                            }
                            if ((i11 & 32) != 0) {
                                i21 &= -458753;
                                oiVarM = kh.f30051a.M(c0VarR, 6);
                            }
                            if ((i11 & 64) != 0) {
                                a1VarL = kh.f30051a.L(z12, z10, c0VarR, ((i21 >> 9) & 14) | androidx.media3.exoplayer.a5.S0 | ((i21 << 3) & com.planner5d.library.engine.input.f.b.B));
                                i22 = i21 & (-3670017);
                            } else {
                                i22 = i21;
                            }
                            if (i17 != 0) {
                                jVar2 = null;
                            }
                        }
                        androidx.compose.ui.graphics.q3 q3Var117 = q3VarV;
                        androidx.compose.foundation.a1 a1Var117 = a1VarL;
                        androidx.compose.ui.a0 a0Var118 = a0Var2;
                        oi oiVar117 = oiVarM;
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-1703707081, i22, -1, "androidx.compose.material3.OutlinedIconToggleButton (IconButton.kt:674)");
                        }
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = new Function1() { // from class: androidx.compose.material3.ph
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return ei.S((androidx.compose.ui.semantics.e0) obj);
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        boolean z1119 = z12;
                        androidx.compose.foundation.interaction.j jVar118 = jVar2;
                        X(z10, function1, androidx.compose.ui.semantics.t.f(a0Var118, false, (Function1) objI0, 1, null), z1119, q3Var117, oiVar117, a1Var117, jVar118, function2, c0VarR, i22 & 268434558);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        jVar3 = jVar118;
                        a1Var2 = a1Var117;
                        oiVar2 = oiVar117;
                        q3Var2 = q3Var117;
                        z14 = z1119;
                        a0Var3 = a0Var118;
                    } else {
                        c0VarR.u();
                        a0Var3 = a0Var2;
                        z14 = z12;
                        q3Var2 = q3VarV;
                        oiVar2 = oiVarM;
                        a1Var2 = a1VarL;
                        jVar3 = jVar2;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.qh
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return ei.T(z10, function1, a0Var3, z14, q3Var2, oiVar2, a1Var2, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 100663296;
                i20 = i12;
                if ((i12 & 38347923) != 38347922) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (c0VarR.h(z13, i20 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i13 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i15 != 0) {
                            z12 = true;
                        }
                        if ((i11 & 16) != 0) {
                            i21 = i20 & (-57345);
                            q3VarV = kh.f30051a.v(c0VarR, 6);
                        } else {
                            i21 = i20;
                        }
                        if ((i11 & 32) != 0) {
                            i21 &= -458753;
                            oiVarM = kh.f30051a.M(c0VarR, 6);
                        }
                        if ((i11 & 64) != 0) {
                            a1VarL = kh.f30051a.L(z12, z10, c0VarR, ((i21 >> 9) & 14) | androidx.media3.exoplayer.a5.S0 | ((i21 << 3) & com.planner5d.library.engine.input.f.b.B));
                            i22 = i21 & (-3670017);
                        } else {
                            i22 = i21;
                        }
                        if (i17 != 0) {
                            jVar2 = null;
                        }
                    } else {
                        if (i13 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i15 != 0) {
                            z12 = true;
                        }
                        if ((i11 & 16) != 0) {
                            i21 = i20 & (-57345);
                            q3VarV = kh.f30051a.v(c0VarR, 6);
                        } else {
                            i21 = i20;
                        }
                        if ((i11 & 32) != 0) {
                            i21 &= -458753;
                            oiVarM = kh.f30051a.M(c0VarR, 6);
                        }
                        if ((i11 & 64) != 0) {
                            a1VarL = kh.f30051a.L(z12, z10, c0VarR, ((i21 >> 9) & 14) | androidx.media3.exoplayer.a5.S0 | ((i21 << 3) & com.planner5d.library.engine.input.f.b.B));
                            i22 = i21 & (-3670017);
                        } else {
                            i22 = i21;
                        }
                        if (i17 != 0) {
                            jVar2 = null;
                        }
                    }
                    androidx.compose.ui.graphics.q3 q3Var118 = q3VarV;
                    androidx.compose.foundation.a1 a1Var118 = a1VarL;
                    androidx.compose.ui.a0 a0Var119 = a0Var2;
                    oi oiVar118 = oiVarM;
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1703707081, i22, -1, "androidx.compose.material3.OutlinedIconToggleButton (IconButton.kt:674)");
                    }
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = new Function1() { // from class: androidx.compose.material3.ph
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return ei.S((androidx.compose.ui.semantics.e0) obj);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    boolean z11110 = z12;
                    androidx.compose.foundation.interaction.j jVar119 = jVar2;
                    X(z10, function1, androidx.compose.ui.semantics.t.f(a0Var119, false, (Function1) objI0, 1, null), z11110, q3Var118, oiVar118, a1Var118, jVar119, function2, c0VarR, i22 & 268434558);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    jVar3 = jVar119;
                    a1Var2 = a1Var118;
                    oiVar2 = oiVar118;
                    q3Var2 = q3Var118;
                    z14 = z11110;
                    a0Var3 = a0Var119;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    z14 = z12;
                    q3Var2 = q3VarV;
                    oiVar2 = oiVarM;
                    a1Var2 = a1VarL;
                    jVar3 = jVar2;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.qh
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ei.T(z10, function1, a0Var3, z14, q3Var2, oiVar2, a1Var2, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 12582912;
            jVar2 = jVar;
            if ((i11 & 256) != 0) {
                if ((i10 & 100663296) == 0) {
                    if (c0VarR.k0(function2)) {
                        i19 = 67108864;
                    } else {
                        i19 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i12 |= i19;
                }
                i20 = i12;
                if ((i12 & 38347923) != 38347922) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (c0VarR.h(z13, i20 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i13 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i15 != 0) {
                            z12 = true;
                        }
                        if ((i11 & 16) != 0) {
                            i21 = i20 & (-57345);
                            q3VarV = kh.f30051a.v(c0VarR, 6);
                        } else {
                            i21 = i20;
                        }
                        if ((i11 & 32) != 0) {
                            i21 &= -458753;
                            oiVarM = kh.f30051a.M(c0VarR, 6);
                        }
                        if ((i11 & 64) != 0) {
                            a1VarL = kh.f30051a.L(z12, z10, c0VarR, ((i21 >> 9) & 14) | androidx.media3.exoplayer.a5.S0 | ((i21 << 3) & com.planner5d.library.engine.input.f.b.B));
                            i22 = i21 & (-3670017);
                        } else {
                            i22 = i21;
                        }
                        if (i17 != 0) {
                            jVar2 = null;
                        }
                    } else {
                        if (i13 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i15 != 0) {
                            z12 = true;
                        }
                        if ((i11 & 16) != 0) {
                            i21 = i20 & (-57345);
                            q3VarV = kh.f30051a.v(c0VarR, 6);
                        } else {
                            i21 = i20;
                        }
                        if ((i11 & 32) != 0) {
                            i21 &= -458753;
                            oiVarM = kh.f30051a.M(c0VarR, 6);
                        }
                        if ((i11 & 64) != 0) {
                            a1VarL = kh.f30051a.L(z12, z10, c0VarR, ((i21 >> 9) & 14) | androidx.media3.exoplayer.a5.S0 | ((i21 << 3) & com.planner5d.library.engine.input.f.b.B));
                            i22 = i21 & (-3670017);
                        } else {
                            i22 = i21;
                        }
                        if (i17 != 0) {
                            jVar2 = null;
                        }
                    }
                    androidx.compose.ui.graphics.q3 q3Var119 = q3VarV;
                    androidx.compose.foundation.a1 a1Var119 = a1VarL;
                    androidx.compose.ui.a0 a0Var1110 = a0Var2;
                    oi oiVar119 = oiVarM;
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1703707081, i22, -1, "androidx.compose.material3.OutlinedIconToggleButton (IconButton.kt:674)");
                    }
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = new Function1() { // from class: androidx.compose.material3.ph
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return ei.S((androidx.compose.ui.semantics.e0) obj);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    boolean z11111 = z12;
                    androidx.compose.foundation.interaction.j jVar1110 = jVar2;
                    X(z10, function1, androidx.compose.ui.semantics.t.f(a0Var1110, false, (Function1) objI0, 1, null), z11111, q3Var119, oiVar119, a1Var119, jVar1110, function2, c0VarR, i22 & 268434558);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    jVar3 = jVar1110;
                    a1Var2 = a1Var119;
                    oiVar2 = oiVar119;
                    q3Var2 = q3Var119;
                    z14 = z11111;
                    a0Var3 = a0Var1110;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    z14 = z12;
                    q3Var2 = q3VarV;
                    oiVar2 = oiVarM;
                    a1Var2 = a1VarL;
                    jVar3 = jVar2;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.qh
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ei.T(z10, function1, a0Var3, z14, q3Var2, oiVar2, a1Var2, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 100663296;
            i20 = i12;
            if ((i12 & 38347923) != 38347922) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c0VarR.h(z13, i20 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i13 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i15 != 0) {
                        z12 = true;
                    }
                    if ((i11 & 16) != 0) {
                        i21 = i20 & (-57345);
                        q3VarV = kh.f30051a.v(c0VarR, 6);
                    } else {
                        i21 = i20;
                    }
                    if ((i11 & 32) != 0) {
                        i21 &= -458753;
                        oiVarM = kh.f30051a.M(c0VarR, 6);
                    }
                    if ((i11 & 64) != 0) {
                        a1VarL = kh.f30051a.L(z12, z10, c0VarR, ((i21 >> 9) & 14) | androidx.media3.exoplayer.a5.S0 | ((i21 << 3) & com.planner5d.library.engine.input.f.b.B));
                        i22 = i21 & (-3670017);
                    } else {
                        i22 = i21;
                    }
                    if (i17 != 0) {
                        jVar2 = null;
                    }
                } else {
                    if (i13 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i15 != 0) {
                        z12 = true;
                    }
                    if ((i11 & 16) != 0) {
                        i21 = i20 & (-57345);
                        q3VarV = kh.f30051a.v(c0VarR, 6);
                    } else {
                        i21 = i20;
                    }
                    if ((i11 & 32) != 0) {
                        i21 &= -458753;
                        oiVarM = kh.f30051a.M(c0VarR, 6);
                    }
                    if ((i11 & 64) != 0) {
                        a1VarL = kh.f30051a.L(z12, z10, c0VarR, ((i21 >> 9) & 14) | androidx.media3.exoplayer.a5.S0 | ((i21 << 3) & com.planner5d.library.engine.input.f.b.B));
                        i22 = i21 & (-3670017);
                    } else {
                        i22 = i21;
                    }
                    if (i17 != 0) {
                        jVar2 = null;
                    }
                }
                androidx.compose.ui.graphics.q3 q3Var1110 = q3VarV;
                androidx.compose.foundation.a1 a1Var1110 = a1VarL;
                androidx.compose.ui.a0 a0Var1111 = a0Var2;
                oi oiVar1110 = oiVarM;
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1703707081, i22, -1, "androidx.compose.material3.OutlinedIconToggleButton (IconButton.kt:674)");
                }
                objI0 = c0VarR.i0();
                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = new Function1() { // from class: androidx.compose.material3.ph
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return ei.S((androidx.compose.ui.semantics.e0) obj);
                        }
                    };
                    c0VarR.Y(objI0);
                }
                boolean z11112 = z12;
                androidx.compose.foundation.interaction.j jVar1111 = jVar2;
                X(z10, function1, androidx.compose.ui.semantics.t.f(a0Var1111, false, (Function1) objI0, 1, null), z11112, q3Var1110, oiVar1110, a1Var1110, jVar1111, function2, c0VarR, i22 & 268434558);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                jVar3 = jVar1111;
                a1Var2 = a1Var1110;
                oiVar2 = oiVar1110;
                q3Var2 = q3Var1110;
                z14 = z11112;
                a0Var3 = a0Var1111;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                z14 = z12;
                q3Var2 = q3VarV;
                oiVar2 = oiVarM;
                a1Var2 = a1VarL;
                jVar3 = jVar2;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.qh
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ei.T(z10, function1, a0Var3, z14, q3Var2, oiVar2, a1Var2, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 3072;
        z12 = z11;
        if ((i10 & 24576) == 0) {
            if ((i11 & 16) == 0) {
                q3VarV = q3Var;
                if (c0VarR.D(q3VarV)) {
                }
                i12 |= i23;
            } else {
                q3VarV = q3Var;
            }
            i12 |= i23;
        } else {
            q3VarV = q3Var;
        }
        if ((196608 & i10) == 0) {
            if ((i11 & 32) == 0) {
                oiVarM = oiVar;
                if (c0VarR.D(oiVarM)) {
                }
                i12 |= i24;
            } else {
                oiVarM = oiVar;
            }
            i12 |= i24;
        } else {
            oiVarM = oiVar;
        }
        if ((1572864 & i10) == 0) {
            if ((i11 & 64) == 0) {
                a1VarL = a1Var;
                if (c0VarR.D(a1VarL)) {
                }
                i12 |= i25;
            } else {
                a1VarL = a1Var;
            }
            i12 |= i25;
        } else {
            a1VarL = a1Var;
        }
        i17 = i11 & 128;
        if (i17 != 0) {
            if ((12582912 & i10) == 0) {
                jVar2 = jVar;
                if (c0VarR.D(jVar2)) {
                    i18 = 8388608;
                } else {
                    i18 = 4194304;
                }
                i12 |= i18;
            }
            if ((i11 & 256) != 0) {
                if ((i10 & 100663296) == 0) {
                    if (c0VarR.k0(function2)) {
                        i19 = 67108864;
                    } else {
                        i19 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i12 |= i19;
                }
                i20 = i12;
                if ((i12 & 38347923) != 38347922) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (c0VarR.h(z13, i20 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i13 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i15 != 0) {
                            z12 = true;
                        }
                        if ((i11 & 16) != 0) {
                            i21 = i20 & (-57345);
                            q3VarV = kh.f30051a.v(c0VarR, 6);
                        } else {
                            i21 = i20;
                        }
                        if ((i11 & 32) != 0) {
                            i21 &= -458753;
                            oiVarM = kh.f30051a.M(c0VarR, 6);
                        }
                        if ((i11 & 64) != 0) {
                            a1VarL = kh.f30051a.L(z12, z10, c0VarR, ((i21 >> 9) & 14) | androidx.media3.exoplayer.a5.S0 | ((i21 << 3) & com.planner5d.library.engine.input.f.b.B));
                            i22 = i21 & (-3670017);
                        } else {
                            i22 = i21;
                        }
                        if (i17 != 0) {
                            jVar2 = null;
                        }
                    } else {
                        if (i13 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i15 != 0) {
                            z12 = true;
                        }
                        if ((i11 & 16) != 0) {
                            i21 = i20 & (-57345);
                            q3VarV = kh.f30051a.v(c0VarR, 6);
                        } else {
                            i21 = i20;
                        }
                        if ((i11 & 32) != 0) {
                            i21 &= -458753;
                            oiVarM = kh.f30051a.M(c0VarR, 6);
                        }
                        if ((i11 & 64) != 0) {
                            a1VarL = kh.f30051a.L(z12, z10, c0VarR, ((i21 >> 9) & 14) | androidx.media3.exoplayer.a5.S0 | ((i21 << 3) & com.planner5d.library.engine.input.f.b.B));
                            i22 = i21 & (-3670017);
                        } else {
                            i22 = i21;
                        }
                        if (i17 != 0) {
                            jVar2 = null;
                        }
                    }
                    androidx.compose.ui.graphics.q3 q3Var1111 = q3VarV;
                    androidx.compose.foundation.a1 a1Var1111 = a1VarL;
                    androidx.compose.ui.a0 a0Var1112 = a0Var2;
                    oi oiVar1111 = oiVarM;
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1703707081, i22, -1, "androidx.compose.material3.OutlinedIconToggleButton (IconButton.kt:674)");
                    }
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = new Function1() { // from class: androidx.compose.material3.ph
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return ei.S((androidx.compose.ui.semantics.e0) obj);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    boolean z11113 = z12;
                    androidx.compose.foundation.interaction.j jVar1112 = jVar2;
                    X(z10, function1, androidx.compose.ui.semantics.t.f(a0Var1112, false, (Function1) objI0, 1, null), z11113, q3Var1111, oiVar1111, a1Var1111, jVar1112, function2, c0VarR, i22 & 268434558);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    jVar3 = jVar1112;
                    a1Var2 = a1Var1111;
                    oiVar2 = oiVar1111;
                    q3Var2 = q3Var1111;
                    z14 = z11113;
                    a0Var3 = a0Var1112;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    z14 = z12;
                    q3Var2 = q3VarV;
                    oiVar2 = oiVarM;
                    a1Var2 = a1VarL;
                    jVar3 = jVar2;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.qh
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ei.T(z10, function1, a0Var3, z14, q3Var2, oiVar2, a1Var2, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 100663296;
            i20 = i12;
            if ((i12 & 38347923) != 38347922) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c0VarR.h(z13, i20 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i13 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i15 != 0) {
                        z12 = true;
                    }
                    if ((i11 & 16) != 0) {
                        i21 = i20 & (-57345);
                        q3VarV = kh.f30051a.v(c0VarR, 6);
                    } else {
                        i21 = i20;
                    }
                    if ((i11 & 32) != 0) {
                        i21 &= -458753;
                        oiVarM = kh.f30051a.M(c0VarR, 6);
                    }
                    if ((i11 & 64) != 0) {
                        a1VarL = kh.f30051a.L(z12, z10, c0VarR, ((i21 >> 9) & 14) | androidx.media3.exoplayer.a5.S0 | ((i21 << 3) & com.planner5d.library.engine.input.f.b.B));
                        i22 = i21 & (-3670017);
                    } else {
                        i22 = i21;
                    }
                    if (i17 != 0) {
                        jVar2 = null;
                    }
                } else {
                    if (i13 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i15 != 0) {
                        z12 = true;
                    }
                    if ((i11 & 16) != 0) {
                        i21 = i20 & (-57345);
                        q3VarV = kh.f30051a.v(c0VarR, 6);
                    } else {
                        i21 = i20;
                    }
                    if ((i11 & 32) != 0) {
                        i21 &= -458753;
                        oiVarM = kh.f30051a.M(c0VarR, 6);
                    }
                    if ((i11 & 64) != 0) {
                        a1VarL = kh.f30051a.L(z12, z10, c0VarR, ((i21 >> 9) & 14) | androidx.media3.exoplayer.a5.S0 | ((i21 << 3) & com.planner5d.library.engine.input.f.b.B));
                        i22 = i21 & (-3670017);
                    } else {
                        i22 = i21;
                    }
                    if (i17 != 0) {
                        jVar2 = null;
                    }
                }
                androidx.compose.ui.graphics.q3 q3Var1112 = q3VarV;
                androidx.compose.foundation.a1 a1Var1112 = a1VarL;
                androidx.compose.ui.a0 a0Var1113 = a0Var2;
                oi oiVar1112 = oiVarM;
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1703707081, i22, -1, "androidx.compose.material3.OutlinedIconToggleButton (IconButton.kt:674)");
                }
                objI0 = c0VarR.i0();
                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = new Function1() { // from class: androidx.compose.material3.ph
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return ei.S((androidx.compose.ui.semantics.e0) obj);
                        }
                    };
                    c0VarR.Y(objI0);
                }
                boolean z11114 = z12;
                androidx.compose.foundation.interaction.j jVar1113 = jVar2;
                X(z10, function1, androidx.compose.ui.semantics.t.f(a0Var1113, false, (Function1) objI0, 1, null), z11114, q3Var1112, oiVar1112, a1Var1112, jVar1113, function2, c0VarR, i22 & 268434558);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                jVar3 = jVar1113;
                a1Var2 = a1Var1112;
                oiVar2 = oiVar1112;
                q3Var2 = q3Var1112;
                z14 = z11114;
                a0Var3 = a0Var1113;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                z14 = z12;
                q3Var2 = q3VarV;
                oiVar2 = oiVarM;
                a1Var2 = a1VarL;
                jVar3 = jVar2;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.qh
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ei.T(z10, function1, a0Var3, z14, q3Var2, oiVar2, a1Var2, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 12582912;
        jVar2 = jVar;
        if ((i11 & 256) != 0) {
            if ((i10 & 100663296) == 0) {
                if (c0VarR.k0(function2)) {
                    i19 = 67108864;
                } else {
                    i19 = com.google.api.client.googleapis.media.a.f115410j;
                }
                i12 |= i19;
            }
            i20 = i12;
            if ((i12 & 38347923) != 38347922) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c0VarR.h(z13, i20 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i13 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i15 != 0) {
                        z12 = true;
                    }
                    if ((i11 & 16) != 0) {
                        i21 = i20 & (-57345);
                        q3VarV = kh.f30051a.v(c0VarR, 6);
                    } else {
                        i21 = i20;
                    }
                    if ((i11 & 32) != 0) {
                        i21 &= -458753;
                        oiVarM = kh.f30051a.M(c0VarR, 6);
                    }
                    if ((i11 & 64) != 0) {
                        a1VarL = kh.f30051a.L(z12, z10, c0VarR, ((i21 >> 9) & 14) | androidx.media3.exoplayer.a5.S0 | ((i21 << 3) & com.planner5d.library.engine.input.f.b.B));
                        i22 = i21 & (-3670017);
                    } else {
                        i22 = i21;
                    }
                    if (i17 != 0) {
                        jVar2 = null;
                    }
                } else {
                    if (i13 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i15 != 0) {
                        z12 = true;
                    }
                    if ((i11 & 16) != 0) {
                        i21 = i20 & (-57345);
                        q3VarV = kh.f30051a.v(c0VarR, 6);
                    } else {
                        i21 = i20;
                    }
                    if ((i11 & 32) != 0) {
                        i21 &= -458753;
                        oiVarM = kh.f30051a.M(c0VarR, 6);
                    }
                    if ((i11 & 64) != 0) {
                        a1VarL = kh.f30051a.L(z12, z10, c0VarR, ((i21 >> 9) & 14) | androidx.media3.exoplayer.a5.S0 | ((i21 << 3) & com.planner5d.library.engine.input.f.b.B));
                        i22 = i21 & (-3670017);
                    } else {
                        i22 = i21;
                    }
                    if (i17 != 0) {
                        jVar2 = null;
                    }
                }
                androidx.compose.ui.graphics.q3 q3Var1113 = q3VarV;
                androidx.compose.foundation.a1 a1Var1113 = a1VarL;
                androidx.compose.ui.a0 a0Var1114 = a0Var2;
                oi oiVar1113 = oiVarM;
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1703707081, i22, -1, "androidx.compose.material3.OutlinedIconToggleButton (IconButton.kt:674)");
                }
                objI0 = c0VarR.i0();
                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = new Function1() { // from class: androidx.compose.material3.ph
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return ei.S((androidx.compose.ui.semantics.e0) obj);
                        }
                    };
                    c0VarR.Y(objI0);
                }
                boolean z11115 = z12;
                androidx.compose.foundation.interaction.j jVar1114 = jVar2;
                X(z10, function1, androidx.compose.ui.semantics.t.f(a0Var1114, false, (Function1) objI0, 1, null), z11115, q3Var1113, oiVar1113, a1Var1113, jVar1114, function2, c0VarR, i22 & 268434558);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                jVar3 = jVar1114;
                a1Var2 = a1Var1113;
                oiVar2 = oiVar1113;
                q3Var2 = q3Var1113;
                z14 = z11115;
                a0Var3 = a0Var1114;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                z14 = z12;
                q3Var2 = q3VarV;
                oiVar2 = oiVarM;
                a1Var2 = a1VarL;
                jVar3 = jVar2;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.qh
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ei.T(z10, function1, a0Var3, z14, q3Var2, oiVar2, a1Var2, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 100663296;
        i20 = i12;
        if ((i12 & 38347923) != 38347922) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (c0VarR.h(z13, i20 & 1)) {
            c0VarR.l0();
            if ((i10 & 1) != 0) {
                if (i13 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                }
                if (i15 != 0) {
                    z12 = true;
                }
                if ((i11 & 16) != 0) {
                    i21 = i20 & (-57345);
                    q3VarV = kh.f30051a.v(c0VarR, 6);
                } else {
                    i21 = i20;
                }
                if ((i11 & 32) != 0) {
                    i21 &= -458753;
                    oiVarM = kh.f30051a.M(c0VarR, 6);
                }
                if ((i11 & 64) != 0) {
                    a1VarL = kh.f30051a.L(z12, z10, c0VarR, ((i21 >> 9) & 14) | androidx.media3.exoplayer.a5.S0 | ((i21 << 3) & com.planner5d.library.engine.input.f.b.B));
                    i22 = i21 & (-3670017);
                } else {
                    i22 = i21;
                }
                if (i17 != 0) {
                    jVar2 = null;
                }
            } else {
                if (i13 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                }
                if (i15 != 0) {
                    z12 = true;
                }
                if ((i11 & 16) != 0) {
                    i21 = i20 & (-57345);
                    q3VarV = kh.f30051a.v(c0VarR, 6);
                } else {
                    i21 = i20;
                }
                if ((i11 & 32) != 0) {
                    i21 &= -458753;
                    oiVarM = kh.f30051a.M(c0VarR, 6);
                }
                if ((i11 & 64) != 0) {
                    a1VarL = kh.f30051a.L(z12, z10, c0VarR, ((i21 >> 9) & 14) | androidx.media3.exoplayer.a5.S0 | ((i21 << 3) & com.planner5d.library.engine.input.f.b.B));
                    i22 = i21 & (-3670017);
                } else {
                    i22 = i21;
                }
                if (i17 != 0) {
                    jVar2 = null;
                }
            }
            androidx.compose.ui.graphics.q3 q3Var1114 = q3VarV;
            androidx.compose.foundation.a1 a1Var1114 = a1VarL;
            androidx.compose.ui.a0 a0Var1115 = a0Var2;
            oi oiVar1114 = oiVarM;
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1703707081, i22, -1, "androidx.compose.material3.OutlinedIconToggleButton (IconButton.kt:674)");
            }
            objI0 = c0VarR.i0();
            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new Function1() { // from class: androidx.compose.material3.ph
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ei.S((androidx.compose.ui.semantics.e0) obj);
                    }
                };
                c0VarR.Y(objI0);
            }
            boolean z11116 = z12;
            androidx.compose.foundation.interaction.j jVar1115 = jVar2;
            X(z10, function1, androidx.compose.ui.semantics.t.f(a0Var1115, false, (Function1) objI0, 1, null), z11116, q3Var1114, oiVar1114, a1Var1114, jVar1115, function2, c0VarR, i22 & 268434558);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            jVar3 = jVar1115;
            a1Var2 = a1Var1114;
            oiVar2 = oiVar1114;
            q3Var2 = q3Var1114;
            z14 = z11116;
            a0Var3 = a0Var1115;
        } else {
            c0VarR.u();
            a0Var3 = a0Var2;
            z14 = z12;
            q3Var2 = q3VarV;
            oiVar2 = oiVarM;
            a1Var2 = a1VarL;
            jVar3 = jVar2;
        }
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.qh
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ei.T(z10, function1, a0Var3, z14, q3Var2, oiVar2, a1Var2, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit S(androidx.compose.ui.semantics.e0 e0Var) {
        androidx.compose.ui.semantics.b0.K1(e0Var, androidx.compose.ui.semantics.j.f41124b.c());
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit T(boolean z10, Function1 function1, androidx.compose.ui.a0 a0Var, boolean z11, androidx.compose.ui.graphics.q3 q3Var, oi oiVar, androidx.compose.foundation.a1 a1Var, androidx.compose.foundation.interaction.j jVar, Function2 function2, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        R(z10, function1, a0Var, z11, q3Var, oiVar, a1Var, jVar, function2, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    private static final void U(final Function0<Unit> function0, final androidx.compose.ui.a0 a0Var, final boolean z10, final androidx.compose.ui.graphics.q3 q3Var, final jh jhVar, final androidx.compose.foundation.a1 a1Var, final androidx.compose.foundation.interaction.j jVar, final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, androidx.compose.runtime.c0 c0Var, final int i10) {
        int i11;
        androidx.compose.runtime.c0 c0Var2;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-171935091);
        if ((i10 & 6) == 0) {
            i11 = (c0VarR.k0(function0) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c0VarR.D(a0Var) ? 32 : 16;
        }
        if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
            i11 |= c0VarR.G(z10) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c0VarR.D(q3Var) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= c0VarR.D(jhVar) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= c0VarR.D(a1Var) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i11 |= c0VarR.D(jVar) ? 1048576 : 524288;
        }
        if ((12582912 & i10) == 0) {
            i11 |= c0VarR.k0(function2) ? 8388608 : 4194304;
        }
        if (c0VarR.h((4793491 & i11) != 4793490, i11 & 1)) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-171935091, i11, -1, "androidx.compose.material3.SurfaceIconButton (IconButton.kt:698)");
            }
            Object objI0 = c0VarR.i0();
            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new Function1() { // from class: androidx.compose.material3.xh
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ei.V((androidx.compose.ui.semantics.e0) obj);
                    }
                };
                c0VarR.Y(objI0);
            }
            int i12 = i11 << 9;
            c0Var2 = c0VarR;
            u10.f(function0, androidx.compose.ui.semantics.t.f(a0Var, false, (Function1) objI0, 1, null), z10, q3Var, jhVar.a(z10), jhVar.b(z10), 0.0f, 0.0f, a1Var, jVar, androidx.compose.runtime.internal.w.e(669231714, true, new a(function2), c0VarR, 54), c0Var2, (i11 & 8078) | (234881024 & i12) | (i12 & 1879048192), 6, 192);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0Var2 = c0VarR;
            c0Var2.u();
        }
        androidx.compose.runtime.s5 s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.yh
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ei.W(function0, a0Var, z10, q3Var, jhVar, a1Var, jVar, function2, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit V(androidx.compose.ui.semantics.e0 e0Var) {
        androidx.compose.ui.semantics.b0.K1(e0Var, androidx.compose.ui.semantics.j.f41124b.a());
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit W(Function0 function0, androidx.compose.ui.a0 a0Var, boolean z10, androidx.compose.ui.graphics.q3 q3Var, jh jhVar, androidx.compose.foundation.a1 a1Var, androidx.compose.foundation.interaction.j jVar, Function2 function2, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        U(function0, a0Var, z10, q3Var, jhVar, a1Var, jVar, function2, c0Var, androidx.compose.runtime.t4.a(i10 | 1));
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    private static final void X(final boolean z10, final Function1<? super Boolean, Unit> function1, final androidx.compose.ui.a0 a0Var, final boolean z11, final androidx.compose.ui.graphics.q3 q3Var, final oi oiVar, final androidx.compose.foundation.a1 a1Var, final androidx.compose.foundation.interaction.j jVar, final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, androidx.compose.runtime.c0 c0Var, final int i10) {
        int i11;
        Function1<? super Boolean, Unit> function3;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1118363928);
        if ((i10 & 6) == 0) {
            i11 = (c0VarR.G(z10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            function3 = function1;
            i11 |= c0VarR.k0(function3) ? 32 : 16;
        } else {
            function3 = function1;
        }
        if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
            i11 |= c0VarR.D(a0Var) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c0VarR.G(z11) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= c0VarR.D(q3Var) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= c0VarR.D(oiVar) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i11 |= c0VarR.D(a1Var) ? 1048576 : 524288;
        }
        if ((12582912 & i10) == 0) {
            i11 |= c0VarR.D(jVar) ? 8388608 : 4194304;
        }
        if ((100663296 & i10) == 0) {
            i11 |= c0VarR.k0(function2) ? 67108864 : com.google.api.client.googleapis.media.a.f115410j;
        }
        if (c0VarR.h((38347923 & i11) != 38347922, i11 & 1)) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1118363928, i11, -1, "androidx.compose.material3.SurfaceIconToggleButton (IconButton.kt:728)");
            }
            Object objI0 = c0VarR.i0();
            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new Function1() { // from class: androidx.compose.material3.nh
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ei.Y((androidx.compose.ui.semantics.e0) obj);
                    }
                };
                c0VarR.Y(objI0);
            }
            androidx.compose.ui.a0 a0VarF = androidx.compose.ui.semantics.t.f(a0Var, false, (Function1) objI0, 1, null);
            int i12 = i11 >> 9;
            int i13 = (i12 & 896) | (i12 & 14) | ((i11 << 3) & com.planner5d.library.engine.input.f.b.B);
            u10.e(z10, function3, a0VarF, z11, q3Var, oiVar.a(z11, z10, c0VarR, i13).getValue().M(), oiVar.b(z11, z10, c0VarR, i13).getValue().M(), 0.0f, 0.0f, a1Var, jVar, androidx.compose.runtime.internal.w.e(1492028158, true, new b(function2), c0VarR, 54), c0VarR, (64638 & i11) | (1879048192 & (i11 << 9)), ((i11 >> 21) & 14) | 48, androidx.media3.exoplayer.a5.S0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0VarR.u();
        }
        androidx.compose.runtime.s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.oh
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ei.Z(z10, function1, a0Var, z11, q3Var, oiVar, a1Var, jVar, function2, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Y(androidx.compose.ui.semantics.e0 e0Var) {
        androidx.compose.ui.semantics.b0.K1(e0Var, androidx.compose.ui.semantics.j.f41124b.c());
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Z(boolean z10, Function1 function1, androidx.compose.ui.a0 a0Var, boolean z11, androidx.compose.ui.graphics.q3 q3Var, oi oiVar, androidx.compose.foundation.a1 a1Var, androidx.compose.foundation.interaction.j jVar, Function2 function2, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        X(z10, function1, a0Var, z11, q3Var, oiVar, a1Var, jVar, function2, c0Var, androidx.compose.runtime.t4.a(i10 | 1));
        return Unit.f312394a;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x011e  */
    /* JADX WARN: Code duplicated, block: B:104:0x0127  */
    /* JADX WARN: Code duplicated, block: B:107:0x0134  */
    /* JADX WARN: Code duplicated, block: B:109:0x013e  */
    /* JADX WARN: Code duplicated, block: B:111:0x0147  */
    /* JADX WARN: Code duplicated, block: B:114:0x0154  */
    /* JADX WARN: Code duplicated, block: B:117:0x0187  */
    /* JADX WARN: Code duplicated, block: B:119:0x0192  */
    /* JADX WARN: Code duplicated, block: B:122:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0046  */
    /* JADX WARN: Code duplicated, block: B:28:0x004d  */
    /* JADX WARN: Code duplicated, block: B:30:0x0051  */
    /* JADX WARN: Code duplicated, block: B:32:0x005b  */
    /* JADX WARN: Code duplicated, block: B:33:0x005e  */
    /* JADX WARN: Code duplicated, block: B:37:0x0065  */
    /* JADX WARN: Code duplicated, block: B:39:0x0069  */
    /* JADX WARN: Code duplicated, block: B:41:0x0071  */
    /* JADX WARN: Code duplicated, block: B:42:0x0074  */
    /* JADX WARN: Code duplicated, block: B:45:0x007a  */
    /* JADX WARN: Code duplicated, block: B:48:0x0080  */
    /* JADX WARN: Code duplicated, block: B:50:0x0084  */
    /* JADX WARN: Code duplicated, block: B:52:0x008c  */
    /* JADX WARN: Code duplicated, block: B:53:0x008f  */
    /* JADX WARN: Code duplicated, block: B:56:0x0095  */
    /* JADX WARN: Code duplicated, block: B:59:0x009f  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:65:0x00af  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:76:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:85:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:97:0x0115 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:98:0x0117  */
    /* JADX WARN: Code duplicated, block: B:99:0x011a  */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void t(@NotNull final Function0<Unit> function0, @Nullable androidx.compose.ui.a0 a0Var, boolean z10, @Nullable androidx.compose.ui.graphics.q3 q3Var, @Nullable jh jhVar, @Nullable androidx.compose.foundation.interaction.j jVar, @NotNull final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        Function0<Unit> function1;
        int i12;
        androidx.compose.ui.a0 a0Var2;
        int i13;
        boolean z11;
        int i14;
        androidx.compose.ui.graphics.q3 q3VarU;
        jh jhVarI;
        int i15;
        androidx.compose.foundation.interaction.j jVar2;
        int i16;
        int i17;
        boolean z12;
        androidx.compose.runtime.c0 c0Var2;
        final androidx.compose.ui.a0 a0Var3;
        final boolean z13;
        final androidx.compose.ui.graphics.q3 q3Var2;
        final jh jhVar2;
        final androidx.compose.foundation.interaction.j jVar3;
        androidx.compose.runtime.s5 s5VarT;
        androidx.compose.ui.a0 a0Var4;
        androidx.compose.foundation.interaction.j jVar4;
        jh jhVar3;
        androidx.compose.ui.a0 a0Var5;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(947208840);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
            function1 = function0;
        } else {
            function1 = function0;
            if ((i10 & 6) == 0) {
                i12 = (c0VarR.k0(function1) ? 4 : 2) | i10;
            } else {
                i12 = i10;
            }
        }
        int i18 = i11 & 2;
        if (i18 == 0) {
            if ((i10 & 48) == 0) {
                a0Var2 = a0Var;
                i12 |= c0VarR.D(a0Var2) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                    z11 = z10;
                    if (c0VarR.G(z11)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                if ((i10 & 3072) == 0) {
                    if ((i11 & 8) == 0) {
                        q3VarU = q3Var;
                        int i19 = c0VarR.D(q3VarU) ? 2048 : 1024;
                        i12 |= i19;
                    } else {
                        q3VarU = q3Var;
                    }
                    i12 |= i19;
                } else {
                    q3VarU = q3Var;
                }
                if ((i10 & 24576) == 0) {
                    if ((i11 & 16) == 0) {
                        jhVarI = jhVar;
                        int i20 = c0VarR.D(jhVarI) ? 16384 : 8192;
                        i12 |= i20;
                    } else {
                        jhVarI = jhVar;
                    }
                    i12 |= i20;
                } else {
                    jhVarI = jhVar;
                }
                i15 = i11 & 32;
                if (i15 != 0) {
                    if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        jVar2 = jVar;
                        if (c0VarR.D(jVar2)) {
                            i16 = 131072;
                        } else {
                            i16 = 65536;
                        }
                        i12 |= i16;
                    }
                    if ((i11 & 64) != 0) {
                        if ((i10 & 1572864) == 0) {
                            if (c0VarR.k0(function2)) {
                                i17 = 1048576;
                            } else {
                                i17 = 524288;
                            }
                            i12 |= i17;
                        }
                        if ((599187 & i12) != 599186) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (c0VarR.h(z12, i12 & 1)) {
                            c0VarR.l0();
                            if ((i10 & 1) != 0 || c0VarR.y()) {
                                if (i18 != 0) {
                                    a0Var4 = androidx.compose.ui.a0.E;
                                } else {
                                    a0Var4 = a0Var2;
                                }
                                if (i13 != 0) {
                                    z11 = true;
                                }
                                if ((i11 & 8) != 0) {
                                    i12 &= -7169;
                                    q3VarU = kh.f30051a.u(c0VarR, 6);
                                }
                                if ((i11 & 16) != 0) {
                                    i12 &= -57345;
                                    jhVarI = kh.f30051a.i(c0VarR, 6);
                                }
                                if (i15 != 0) {
                                    jVar4 = null;
                                } else {
                                    jVar4 = jVar2;
                                }
                                jhVar3 = jhVarI;
                                a0Var5 = a0Var4;
                            } else {
                                c0VarR.u();
                                if ((i11 & 8) != 0) {
                                    i12 &= -7169;
                                }
                                if ((i11 & 16) != 0) {
                                    i12 &= -57345;
                                }
                                z11 = z11;
                                q3VarU = q3VarU;
                                jVar4 = jVar2;
                                jhVar3 = jhVarI;
                                a0Var5 = a0Var2;
                            }
                            c0VarR.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(947208840, i12, -1, "androidx.compose.material3.FilledIconButton (IconButton.kt:385)");
                            }
                            int i21 = (i12 & 14) | androidx.profileinstaller.n.c.f73814m | (i12 & com.planner5d.library.engine.input.f.b.B) | (i12 & 896) | (i12 & 7168) | (57344 & i12);
                            int i22 = i12 << 3;
                            c0Var2 = c0VarR;
                            U(function1, a0Var5, z11, q3VarU, jhVar3, null, jVar4, function2, c0Var2, i21 | (3670016 & i22) | (i22 & 29360128));
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            a0Var3 = a0Var5;
                            z13 = z11;
                            q3Var2 = q3VarU;
                            jhVar2 = jhVar3;
                            jVar3 = jVar4;
                        } else {
                            c0Var2 = c0VarR;
                            c0Var2.u();
                            a0Var3 = a0Var2;
                            z13 = z11;
                            q3Var2 = q3VarU;
                            jhVar2 = jhVarI;
                            jVar3 = jVar2;
                        }
                        s5VarT = c0Var2.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material3.ai
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return ei.u(function0, a0Var3, z13, q3Var2, jhVar2, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i12 |= 1572864;
                    if ((599187 & i12) != 599186) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (c0VarR.h(z12, i12 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i18 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            }
                            if ((i11 & 8) != 0) {
                                i12 &= -7169;
                                q3VarU = kh.f30051a.u(c0VarR, 6);
                            }
                            if ((i11 & 16) != 0) {
                                i12 &= -57345;
                                jhVarI = kh.f30051a.i(c0VarR, 6);
                            }
                            if (i15 != 0) {
                                jVar4 = null;
                            } else {
                                jVar4 = jVar2;
                            }
                            jhVar3 = jhVarI;
                            a0Var5 = a0Var4;
                        } else {
                            if (i18 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            }
                            if ((i11 & 8) != 0) {
                                i12 &= -7169;
                                q3VarU = kh.f30051a.u(c0VarR, 6);
                            }
                            if ((i11 & 16) != 0) {
                                i12 &= -57345;
                                jhVarI = kh.f30051a.i(c0VarR, 6);
                            }
                            if (i15 != 0) {
                                jVar4 = null;
                            } else {
                                jVar4 = jVar2;
                            }
                            jhVar3 = jhVarI;
                            a0Var5 = a0Var4;
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(947208840, i12, -1, "androidx.compose.material3.FilledIconButton (IconButton.kt:385)");
                        }
                        int i23 = (i12 & 14) | androidx.profileinstaller.n.c.f73814m | (i12 & com.planner5d.library.engine.input.f.b.B) | (i12 & 896) | (i12 & 7168) | (57344 & i12);
                        int i24 = i12 << 3;
                        c0Var2 = c0VarR;
                        U(function1, a0Var5, z11, q3VarU, jhVar3, null, jVar4, function2, c0Var2, i23 | (3670016 & i24) | (i24 & 29360128));
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var5;
                        z13 = z11;
                        q3Var2 = q3VarU;
                        jhVar2 = jhVar3;
                        jVar3 = jVar4;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        a0Var3 = a0Var2;
                        z13 = z11;
                        q3Var2 = q3VarU;
                        jhVar2 = jhVarI;
                        jVar3 = jVar2;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.ai
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return ei.u(function0, a0Var3, z13, q3Var2, jhVar2, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= androidx.profileinstaller.n.c.f73814m;
                jVar2 = jVar;
                if ((i11 & 64) != 0) {
                    if ((i10 & 1572864) == 0) {
                        if (c0VarR.k0(function2)) {
                            i17 = 1048576;
                        } else {
                            i17 = 524288;
                        }
                        i12 |= i17;
                    }
                    if ((599187 & i12) != 599186) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (c0VarR.h(z12, i12 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i18 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            }
                            if ((i11 & 8) != 0) {
                                i12 &= -7169;
                                q3VarU = kh.f30051a.u(c0VarR, 6);
                            }
                            if ((i11 & 16) != 0) {
                                i12 &= -57345;
                                jhVarI = kh.f30051a.i(c0VarR, 6);
                            }
                            if (i15 != 0) {
                                jVar4 = null;
                            } else {
                                jVar4 = jVar2;
                            }
                            jhVar3 = jhVarI;
                            a0Var5 = a0Var4;
                        } else {
                            if (i18 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            }
                            if ((i11 & 8) != 0) {
                                i12 &= -7169;
                                q3VarU = kh.f30051a.u(c0VarR, 6);
                            }
                            if ((i11 & 16) != 0) {
                                i12 &= -57345;
                                jhVarI = kh.f30051a.i(c0VarR, 6);
                            }
                            if (i15 != 0) {
                                jVar4 = null;
                            } else {
                                jVar4 = jVar2;
                            }
                            jhVar3 = jhVarI;
                            a0Var5 = a0Var4;
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(947208840, i12, -1, "androidx.compose.material3.FilledIconButton (IconButton.kt:385)");
                        }
                        int i25 = (i12 & 14) | androidx.profileinstaller.n.c.f73814m | (i12 & com.planner5d.library.engine.input.f.b.B) | (i12 & 896) | (i12 & 7168) | (57344 & i12);
                        int i26 = i12 << 3;
                        c0Var2 = c0VarR;
                        U(function1, a0Var5, z11, q3VarU, jhVar3, null, jVar4, function2, c0Var2, i25 | (3670016 & i26) | (i26 & 29360128));
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var5;
                        z13 = z11;
                        q3Var2 = q3VarU;
                        jhVar2 = jhVar3;
                        jVar3 = jVar4;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        a0Var3 = a0Var2;
                        z13 = z11;
                        q3Var2 = q3VarU;
                        jhVar2 = jhVarI;
                        jVar3 = jVar2;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.ai
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return ei.u(function0, a0Var3, z13, q3Var2, jhVar2, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 1572864;
                if ((599187 & i12) != 599186) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i18 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            q3VarU = kh.f30051a.u(c0VarR, 6);
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                            jhVarI = kh.f30051a.i(c0VarR, 6);
                        }
                        if (i15 != 0) {
                            jVar4 = null;
                        } else {
                            jVar4 = jVar2;
                        }
                        jhVar3 = jhVarI;
                        a0Var5 = a0Var4;
                    } else {
                        if (i18 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            q3VarU = kh.f30051a.u(c0VarR, 6);
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                            jhVarI = kh.f30051a.i(c0VarR, 6);
                        }
                        if (i15 != 0) {
                            jVar4 = null;
                        } else {
                            jVar4 = jVar2;
                        }
                        jhVar3 = jhVarI;
                        a0Var5 = a0Var4;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(947208840, i12, -1, "androidx.compose.material3.FilledIconButton (IconButton.kt:385)");
                    }
                    int i27 = (i12 & 14) | androidx.profileinstaller.n.c.f73814m | (i12 & com.planner5d.library.engine.input.f.b.B) | (i12 & 896) | (i12 & 7168) | (57344 & i12);
                    int i28 = i12 << 3;
                    c0Var2 = c0VarR;
                    U(function1, a0Var5, z11, q3VarU, jhVar3, null, jVar4, function2, c0Var2, i27 | (3670016 & i28) | (i28 & 29360128));
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var5;
                    z13 = z11;
                    q3Var2 = q3VarU;
                    jhVar2 = jhVar3;
                    jVar3 = jVar4;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var3 = a0Var2;
                    z13 = z11;
                    q3Var2 = q3VarU;
                    jhVar2 = jhVarI;
                    jVar3 = jVar2;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.ai
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ei.u(function0, a0Var3, z13, q3Var2, jhVar2, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= androidx.media3.exoplayer.a5.S0;
            z11 = z10;
            if ((i10 & 3072) == 0) {
                if ((i11 & 8) == 0) {
                    q3VarU = q3Var;
                    if (c0VarR.D(q3VarU)) {
                    }
                    i12 |= i19;
                } else {
                    q3VarU = q3Var;
                }
                i12 |= i19;
            } else {
                q3VarU = q3Var;
            }
            if ((i10 & 24576) == 0) {
                if ((i11 & 16) == 0) {
                    jhVarI = jhVar;
                    if (c0VarR.D(jhVarI)) {
                    }
                    i12 |= i20;
                } else {
                    jhVarI = jhVar;
                }
                i12 |= i20;
            } else {
                jhVarI = jhVar;
            }
            i15 = i11 & 32;
            if (i15 != 0) {
                if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    jVar2 = jVar;
                    if (c0VarR.D(jVar2)) {
                        i16 = 131072;
                    } else {
                        i16 = 65536;
                    }
                    i12 |= i16;
                }
                if ((i11 & 64) != 0) {
                    if ((i10 & 1572864) == 0) {
                        if (c0VarR.k0(function2)) {
                            i17 = 1048576;
                        } else {
                            i17 = 524288;
                        }
                        i12 |= i17;
                    }
                    if ((599187 & i12) != 599186) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (c0VarR.h(z12, i12 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i18 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            }
                            if ((i11 & 8) != 0) {
                                i12 &= -7169;
                                q3VarU = kh.f30051a.u(c0VarR, 6);
                            }
                            if ((i11 & 16) != 0) {
                                i12 &= -57345;
                                jhVarI = kh.f30051a.i(c0VarR, 6);
                            }
                            if (i15 != 0) {
                                jVar4 = null;
                            } else {
                                jVar4 = jVar2;
                            }
                            jhVar3 = jhVarI;
                            a0Var5 = a0Var4;
                        } else {
                            if (i18 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            }
                            if ((i11 & 8) != 0) {
                                i12 &= -7169;
                                q3VarU = kh.f30051a.u(c0VarR, 6);
                            }
                            if ((i11 & 16) != 0) {
                                i12 &= -57345;
                                jhVarI = kh.f30051a.i(c0VarR, 6);
                            }
                            if (i15 != 0) {
                                jVar4 = null;
                            } else {
                                jVar4 = jVar2;
                            }
                            jhVar3 = jhVarI;
                            a0Var5 = a0Var4;
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(947208840, i12, -1, "androidx.compose.material3.FilledIconButton (IconButton.kt:385)");
                        }
                        int i29 = (i12 & 14) | androidx.profileinstaller.n.c.f73814m | (i12 & com.planner5d.library.engine.input.f.b.B) | (i12 & 896) | (i12 & 7168) | (57344 & i12);
                        int i210 = i12 << 3;
                        c0Var2 = c0VarR;
                        U(function1, a0Var5, z11, q3VarU, jhVar3, null, jVar4, function2, c0Var2, i29 | (3670016 & i210) | (i210 & 29360128));
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var5;
                        z13 = z11;
                        q3Var2 = q3VarU;
                        jhVar2 = jhVar3;
                        jVar3 = jVar4;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        a0Var3 = a0Var2;
                        z13 = z11;
                        q3Var2 = q3VarU;
                        jhVar2 = jhVarI;
                        jVar3 = jVar2;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.ai
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return ei.u(function0, a0Var3, z13, q3Var2, jhVar2, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 1572864;
                if ((599187 & i12) != 599186) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i18 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            q3VarU = kh.f30051a.u(c0VarR, 6);
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                            jhVarI = kh.f30051a.i(c0VarR, 6);
                        }
                        if (i15 != 0) {
                            jVar4 = null;
                        } else {
                            jVar4 = jVar2;
                        }
                        jhVar3 = jhVarI;
                        a0Var5 = a0Var4;
                    } else {
                        if (i18 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            q3VarU = kh.f30051a.u(c0VarR, 6);
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                            jhVarI = kh.f30051a.i(c0VarR, 6);
                        }
                        if (i15 != 0) {
                            jVar4 = null;
                        } else {
                            jVar4 = jVar2;
                        }
                        jhVar3 = jhVarI;
                        a0Var5 = a0Var4;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(947208840, i12, -1, "androidx.compose.material3.FilledIconButton (IconButton.kt:385)");
                    }
                    int i211 = (i12 & 14) | androidx.profileinstaller.n.c.f73814m | (i12 & com.planner5d.library.engine.input.f.b.B) | (i12 & 896) | (i12 & 7168) | (57344 & i12);
                    int i212 = i12 << 3;
                    c0Var2 = c0VarR;
                    U(function1, a0Var5, z11, q3VarU, jhVar3, null, jVar4, function2, c0Var2, i211 | (3670016 & i212) | (i212 & 29360128));
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var5;
                    z13 = z11;
                    q3Var2 = q3VarU;
                    jhVar2 = jhVar3;
                    jVar3 = jVar4;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var3 = a0Var2;
                    z13 = z11;
                    q3Var2 = q3VarU;
                    jhVar2 = jhVarI;
                    jVar3 = jVar2;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.ai
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ei.u(function0, a0Var3, z13, q3Var2, jhVar2, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= androidx.profileinstaller.n.c.f73814m;
            jVar2 = jVar;
            if ((i11 & 64) != 0) {
                if ((i10 & 1572864) == 0) {
                    if (c0VarR.k0(function2)) {
                        i17 = 1048576;
                    } else {
                        i17 = 524288;
                    }
                    i12 |= i17;
                }
                if ((599187 & i12) != 599186) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i18 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            q3VarU = kh.f30051a.u(c0VarR, 6);
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                            jhVarI = kh.f30051a.i(c0VarR, 6);
                        }
                        if (i15 != 0) {
                            jVar4 = null;
                        } else {
                            jVar4 = jVar2;
                        }
                        jhVar3 = jhVarI;
                        a0Var5 = a0Var4;
                    } else {
                        if (i18 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            q3VarU = kh.f30051a.u(c0VarR, 6);
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                            jhVarI = kh.f30051a.i(c0VarR, 6);
                        }
                        if (i15 != 0) {
                            jVar4 = null;
                        } else {
                            jVar4 = jVar2;
                        }
                        jhVar3 = jhVarI;
                        a0Var5 = a0Var4;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(947208840, i12, -1, "androidx.compose.material3.FilledIconButton (IconButton.kt:385)");
                    }
                    int i213 = (i12 & 14) | androidx.profileinstaller.n.c.f73814m | (i12 & com.planner5d.library.engine.input.f.b.B) | (i12 & 896) | (i12 & 7168) | (57344 & i12);
                    int i214 = i12 << 3;
                    c0Var2 = c0VarR;
                    U(function1, a0Var5, z11, q3VarU, jhVar3, null, jVar4, function2, c0Var2, i213 | (3670016 & i214) | (i214 & 29360128));
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var5;
                    z13 = z11;
                    q3Var2 = q3VarU;
                    jhVar2 = jhVar3;
                    jVar3 = jVar4;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var3 = a0Var2;
                    z13 = z11;
                    q3Var2 = q3VarU;
                    jhVar2 = jhVarI;
                    jVar3 = jVar2;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.ai
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ei.u(function0, a0Var3, z13, q3Var2, jhVar2, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 1572864;
            if ((599187 & i12) != 599186) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        q3VarU = kh.f30051a.u(c0VarR, 6);
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        jhVarI = kh.f30051a.i(c0VarR, 6);
                    }
                    if (i15 != 0) {
                        jVar4 = null;
                    } else {
                        jVar4 = jVar2;
                    }
                    jhVar3 = jhVarI;
                    a0Var5 = a0Var4;
                } else {
                    if (i18 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        q3VarU = kh.f30051a.u(c0VarR, 6);
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        jhVarI = kh.f30051a.i(c0VarR, 6);
                    }
                    if (i15 != 0) {
                        jVar4 = null;
                    } else {
                        jVar4 = jVar2;
                    }
                    jhVar3 = jhVarI;
                    a0Var5 = a0Var4;
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(947208840, i12, -1, "androidx.compose.material3.FilledIconButton (IconButton.kt:385)");
                }
                int i215 = (i12 & 14) | androidx.profileinstaller.n.c.f73814m | (i12 & com.planner5d.library.engine.input.f.b.B) | (i12 & 896) | (i12 & 7168) | (57344 & i12);
                int i216 = i12 << 3;
                c0Var2 = c0VarR;
                U(function1, a0Var5, z11, q3VarU, jhVar3, null, jVar4, function2, c0Var2, i215 | (3670016 & i216) | (i216 & 29360128));
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var5;
                z13 = z11;
                q3Var2 = q3VarU;
                jhVar2 = jhVar3;
                jVar3 = jVar4;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var3 = a0Var2;
                z13 = z11;
                q3Var2 = q3VarU;
                jhVar2 = jhVarI;
                jVar3 = jVar2;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.ai
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ei.u(function0, a0Var3, z13, q3Var2, jhVar2, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 48;
        a0Var2 = a0Var;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                z11 = z10;
                if (c0VarR.G(z11)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            if ((i10 & 3072) == 0) {
                if ((i11 & 8) == 0) {
                    q3VarU = q3Var;
                    if (c0VarR.D(q3VarU)) {
                    }
                    i12 |= i19;
                } else {
                    q3VarU = q3Var;
                }
                i12 |= i19;
            } else {
                q3VarU = q3Var;
            }
            if ((i10 & 24576) == 0) {
                if ((i11 & 16) == 0) {
                    jhVarI = jhVar;
                    if (c0VarR.D(jhVarI)) {
                    }
                    i12 |= i20;
                } else {
                    jhVarI = jhVar;
                }
                i12 |= i20;
            } else {
                jhVarI = jhVar;
            }
            i15 = i11 & 32;
            if (i15 != 0) {
                if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    jVar2 = jVar;
                    if (c0VarR.D(jVar2)) {
                        i16 = 131072;
                    } else {
                        i16 = 65536;
                    }
                    i12 |= i16;
                }
                if ((i11 & 64) != 0) {
                    if ((i10 & 1572864) == 0) {
                        if (c0VarR.k0(function2)) {
                            i17 = 1048576;
                        } else {
                            i17 = 524288;
                        }
                        i12 |= i17;
                    }
                    if ((599187 & i12) != 599186) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (c0VarR.h(z12, i12 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i18 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            }
                            if ((i11 & 8) != 0) {
                                i12 &= -7169;
                                q3VarU = kh.f30051a.u(c0VarR, 6);
                            }
                            if ((i11 & 16) != 0) {
                                i12 &= -57345;
                                jhVarI = kh.f30051a.i(c0VarR, 6);
                            }
                            if (i15 != 0) {
                                jVar4 = null;
                            } else {
                                jVar4 = jVar2;
                            }
                            jhVar3 = jhVarI;
                            a0Var5 = a0Var4;
                        } else {
                            if (i18 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            }
                            if ((i11 & 8) != 0) {
                                i12 &= -7169;
                                q3VarU = kh.f30051a.u(c0VarR, 6);
                            }
                            if ((i11 & 16) != 0) {
                                i12 &= -57345;
                                jhVarI = kh.f30051a.i(c0VarR, 6);
                            }
                            if (i15 != 0) {
                                jVar4 = null;
                            } else {
                                jVar4 = jVar2;
                            }
                            jhVar3 = jhVarI;
                            a0Var5 = a0Var4;
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(947208840, i12, -1, "androidx.compose.material3.FilledIconButton (IconButton.kt:385)");
                        }
                        int i217 = (i12 & 14) | androidx.profileinstaller.n.c.f73814m | (i12 & com.planner5d.library.engine.input.f.b.B) | (i12 & 896) | (i12 & 7168) | (57344 & i12);
                        int i218 = i12 << 3;
                        c0Var2 = c0VarR;
                        U(function1, a0Var5, z11, q3VarU, jhVar3, null, jVar4, function2, c0Var2, i217 | (3670016 & i218) | (i218 & 29360128));
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var5;
                        z13 = z11;
                        q3Var2 = q3VarU;
                        jhVar2 = jhVar3;
                        jVar3 = jVar4;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        a0Var3 = a0Var2;
                        z13 = z11;
                        q3Var2 = q3VarU;
                        jhVar2 = jhVarI;
                        jVar3 = jVar2;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.ai
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return ei.u(function0, a0Var3, z13, q3Var2, jhVar2, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 1572864;
                if ((599187 & i12) != 599186) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i18 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            q3VarU = kh.f30051a.u(c0VarR, 6);
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                            jhVarI = kh.f30051a.i(c0VarR, 6);
                        }
                        if (i15 != 0) {
                            jVar4 = null;
                        } else {
                            jVar4 = jVar2;
                        }
                        jhVar3 = jhVarI;
                        a0Var5 = a0Var4;
                    } else {
                        if (i18 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            q3VarU = kh.f30051a.u(c0VarR, 6);
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                            jhVarI = kh.f30051a.i(c0VarR, 6);
                        }
                        if (i15 != 0) {
                            jVar4 = null;
                        } else {
                            jVar4 = jVar2;
                        }
                        jhVar3 = jhVarI;
                        a0Var5 = a0Var4;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(947208840, i12, -1, "androidx.compose.material3.FilledIconButton (IconButton.kt:385)");
                    }
                    int i219 = (i12 & 14) | androidx.profileinstaller.n.c.f73814m | (i12 & com.planner5d.library.engine.input.f.b.B) | (i12 & 896) | (i12 & 7168) | (57344 & i12);
                    int i2110 = i12 << 3;
                    c0Var2 = c0VarR;
                    U(function1, a0Var5, z11, q3VarU, jhVar3, null, jVar4, function2, c0Var2, i219 | (3670016 & i2110) | (i2110 & 29360128));
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var5;
                    z13 = z11;
                    q3Var2 = q3VarU;
                    jhVar2 = jhVar3;
                    jVar3 = jVar4;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var3 = a0Var2;
                    z13 = z11;
                    q3Var2 = q3VarU;
                    jhVar2 = jhVarI;
                    jVar3 = jVar2;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.ai
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ei.u(function0, a0Var3, z13, q3Var2, jhVar2, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= androidx.profileinstaller.n.c.f73814m;
            jVar2 = jVar;
            if ((i11 & 64) != 0) {
                if ((i10 & 1572864) == 0) {
                    if (c0VarR.k0(function2)) {
                        i17 = 1048576;
                    } else {
                        i17 = 524288;
                    }
                    i12 |= i17;
                }
                if ((599187 & i12) != 599186) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i18 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            q3VarU = kh.f30051a.u(c0VarR, 6);
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                            jhVarI = kh.f30051a.i(c0VarR, 6);
                        }
                        if (i15 != 0) {
                            jVar4 = null;
                        } else {
                            jVar4 = jVar2;
                        }
                        jhVar3 = jhVarI;
                        a0Var5 = a0Var4;
                    } else {
                        if (i18 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            q3VarU = kh.f30051a.u(c0VarR, 6);
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                            jhVarI = kh.f30051a.i(c0VarR, 6);
                        }
                        if (i15 != 0) {
                            jVar4 = null;
                        } else {
                            jVar4 = jVar2;
                        }
                        jhVar3 = jhVarI;
                        a0Var5 = a0Var4;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(947208840, i12, -1, "androidx.compose.material3.FilledIconButton (IconButton.kt:385)");
                    }
                    int i2111 = (i12 & 14) | androidx.profileinstaller.n.c.f73814m | (i12 & com.planner5d.library.engine.input.f.b.B) | (i12 & 896) | (i12 & 7168) | (57344 & i12);
                    int i2112 = i12 << 3;
                    c0Var2 = c0VarR;
                    U(function1, a0Var5, z11, q3VarU, jhVar3, null, jVar4, function2, c0Var2, i2111 | (3670016 & i2112) | (i2112 & 29360128));
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var5;
                    z13 = z11;
                    q3Var2 = q3VarU;
                    jhVar2 = jhVar3;
                    jVar3 = jVar4;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var3 = a0Var2;
                    z13 = z11;
                    q3Var2 = q3VarU;
                    jhVar2 = jhVarI;
                    jVar3 = jVar2;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.ai
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ei.u(function0, a0Var3, z13, q3Var2, jhVar2, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 1572864;
            if ((599187 & i12) != 599186) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        q3VarU = kh.f30051a.u(c0VarR, 6);
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        jhVarI = kh.f30051a.i(c0VarR, 6);
                    }
                    if (i15 != 0) {
                        jVar4 = null;
                    } else {
                        jVar4 = jVar2;
                    }
                    jhVar3 = jhVarI;
                    a0Var5 = a0Var4;
                } else {
                    if (i18 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        q3VarU = kh.f30051a.u(c0VarR, 6);
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        jhVarI = kh.f30051a.i(c0VarR, 6);
                    }
                    if (i15 != 0) {
                        jVar4 = null;
                    } else {
                        jVar4 = jVar2;
                    }
                    jhVar3 = jhVarI;
                    a0Var5 = a0Var4;
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(947208840, i12, -1, "androidx.compose.material3.FilledIconButton (IconButton.kt:385)");
                }
                int i2113 = (i12 & 14) | androidx.profileinstaller.n.c.f73814m | (i12 & com.planner5d.library.engine.input.f.b.B) | (i12 & 896) | (i12 & 7168) | (57344 & i12);
                int i2114 = i12 << 3;
                c0Var2 = c0VarR;
                U(function1, a0Var5, z11, q3VarU, jhVar3, null, jVar4, function2, c0Var2, i2113 | (3670016 & i2114) | (i2114 & 29360128));
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var5;
                z13 = z11;
                q3Var2 = q3VarU;
                jhVar2 = jhVar3;
                jVar3 = jVar4;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var3 = a0Var2;
                z13 = z11;
                q3Var2 = q3VarU;
                jhVar2 = jhVarI;
                jVar3 = jVar2;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.ai
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ei.u(function0, a0Var3, z13, q3Var2, jhVar2, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= androidx.media3.exoplayer.a5.S0;
        z11 = z10;
        if ((i10 & 3072) == 0) {
            if ((i11 & 8) == 0) {
                q3VarU = q3Var;
                if (c0VarR.D(q3VarU)) {
                }
                i12 |= i19;
            } else {
                q3VarU = q3Var;
            }
            i12 |= i19;
        } else {
            q3VarU = q3Var;
        }
        if ((i10 & 24576) == 0) {
            if ((i11 & 16) == 0) {
                jhVarI = jhVar;
                if (c0VarR.D(jhVarI)) {
                }
                i12 |= i20;
            } else {
                jhVarI = jhVar;
            }
            i12 |= i20;
        } else {
            jhVarI = jhVar;
        }
        i15 = i11 & 32;
        if (i15 != 0) {
            if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                jVar2 = jVar;
                if (c0VarR.D(jVar2)) {
                    i16 = 131072;
                } else {
                    i16 = 65536;
                }
                i12 |= i16;
            }
            if ((i11 & 64) != 0) {
                if ((i10 & 1572864) == 0) {
                    if (c0VarR.k0(function2)) {
                        i17 = 1048576;
                    } else {
                        i17 = 524288;
                    }
                    i12 |= i17;
                }
                if ((599187 & i12) != 599186) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i18 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            q3VarU = kh.f30051a.u(c0VarR, 6);
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                            jhVarI = kh.f30051a.i(c0VarR, 6);
                        }
                        if (i15 != 0) {
                            jVar4 = null;
                        } else {
                            jVar4 = jVar2;
                        }
                        jhVar3 = jhVarI;
                        a0Var5 = a0Var4;
                    } else {
                        if (i18 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            q3VarU = kh.f30051a.u(c0VarR, 6);
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                            jhVarI = kh.f30051a.i(c0VarR, 6);
                        }
                        if (i15 != 0) {
                            jVar4 = null;
                        } else {
                            jVar4 = jVar2;
                        }
                        jhVar3 = jhVarI;
                        a0Var5 = a0Var4;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(947208840, i12, -1, "androidx.compose.material3.FilledIconButton (IconButton.kt:385)");
                    }
                    int i2115 = (i12 & 14) | androidx.profileinstaller.n.c.f73814m | (i12 & com.planner5d.library.engine.input.f.b.B) | (i12 & 896) | (i12 & 7168) | (57344 & i12);
                    int i2116 = i12 << 3;
                    c0Var2 = c0VarR;
                    U(function1, a0Var5, z11, q3VarU, jhVar3, null, jVar4, function2, c0Var2, i2115 | (3670016 & i2116) | (i2116 & 29360128));
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var5;
                    z13 = z11;
                    q3Var2 = q3VarU;
                    jhVar2 = jhVar3;
                    jVar3 = jVar4;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var3 = a0Var2;
                    z13 = z11;
                    q3Var2 = q3VarU;
                    jhVar2 = jhVarI;
                    jVar3 = jVar2;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.ai
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ei.u(function0, a0Var3, z13, q3Var2, jhVar2, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 1572864;
            if ((599187 & i12) != 599186) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        q3VarU = kh.f30051a.u(c0VarR, 6);
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        jhVarI = kh.f30051a.i(c0VarR, 6);
                    }
                    if (i15 != 0) {
                        jVar4 = null;
                    } else {
                        jVar4 = jVar2;
                    }
                    jhVar3 = jhVarI;
                    a0Var5 = a0Var4;
                } else {
                    if (i18 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        q3VarU = kh.f30051a.u(c0VarR, 6);
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        jhVarI = kh.f30051a.i(c0VarR, 6);
                    }
                    if (i15 != 0) {
                        jVar4 = null;
                    } else {
                        jVar4 = jVar2;
                    }
                    jhVar3 = jhVarI;
                    a0Var5 = a0Var4;
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(947208840, i12, -1, "androidx.compose.material3.FilledIconButton (IconButton.kt:385)");
                }
                int i2117 = (i12 & 14) | androidx.profileinstaller.n.c.f73814m | (i12 & com.planner5d.library.engine.input.f.b.B) | (i12 & 896) | (i12 & 7168) | (57344 & i12);
                int i2118 = i12 << 3;
                c0Var2 = c0VarR;
                U(function1, a0Var5, z11, q3VarU, jhVar3, null, jVar4, function2, c0Var2, i2117 | (3670016 & i2118) | (i2118 & 29360128));
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var5;
                z13 = z11;
                q3Var2 = q3VarU;
                jhVar2 = jhVar3;
                jVar3 = jVar4;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var3 = a0Var2;
                z13 = z11;
                q3Var2 = q3VarU;
                jhVar2 = jhVarI;
                jVar3 = jVar2;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.ai
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ei.u(function0, a0Var3, z13, q3Var2, jhVar2, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= androidx.profileinstaller.n.c.f73814m;
        jVar2 = jVar;
        if ((i11 & 64) != 0) {
            if ((i10 & 1572864) == 0) {
                if (c0VarR.k0(function2)) {
                    i17 = 1048576;
                } else {
                    i17 = 524288;
                }
                i12 |= i17;
            }
            if ((599187 & i12) != 599186) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        q3VarU = kh.f30051a.u(c0VarR, 6);
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        jhVarI = kh.f30051a.i(c0VarR, 6);
                    }
                    if (i15 != 0) {
                        jVar4 = null;
                    } else {
                        jVar4 = jVar2;
                    }
                    jhVar3 = jhVarI;
                    a0Var5 = a0Var4;
                } else {
                    if (i18 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        q3VarU = kh.f30051a.u(c0VarR, 6);
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        jhVarI = kh.f30051a.i(c0VarR, 6);
                    }
                    if (i15 != 0) {
                        jVar4 = null;
                    } else {
                        jVar4 = jVar2;
                    }
                    jhVar3 = jhVarI;
                    a0Var5 = a0Var4;
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(947208840, i12, -1, "androidx.compose.material3.FilledIconButton (IconButton.kt:385)");
                }
                int i2119 = (i12 & 14) | androidx.profileinstaller.n.c.f73814m | (i12 & com.planner5d.library.engine.input.f.b.B) | (i12 & 896) | (i12 & 7168) | (57344 & i12);
                int i21110 = i12 << 3;
                c0Var2 = c0VarR;
                U(function1, a0Var5, z11, q3VarU, jhVar3, null, jVar4, function2, c0Var2, i2119 | (3670016 & i21110) | (i21110 & 29360128));
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var5;
                z13 = z11;
                q3Var2 = q3VarU;
                jhVar2 = jhVar3;
                jVar3 = jVar4;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var3 = a0Var2;
                z13 = z11;
                q3Var2 = q3VarU;
                jhVar2 = jhVarI;
                jVar3 = jVar2;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.ai
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ei.u(function0, a0Var3, z13, q3Var2, jhVar2, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 1572864;
        if ((599187 & i12) != 599186) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (c0VarR.h(z12, i12 & 1)) {
            c0VarR.l0();
            if ((i10 & 1) != 0) {
                if (i18 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if (i13 != 0) {
                    z11 = true;
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    q3VarU = kh.f30051a.u(c0VarR, 6);
                }
                if ((i11 & 16) != 0) {
                    i12 &= -57345;
                    jhVarI = kh.f30051a.i(c0VarR, 6);
                }
                if (i15 != 0) {
                    jVar4 = null;
                } else {
                    jVar4 = jVar2;
                }
                jhVar3 = jhVarI;
                a0Var5 = a0Var4;
            } else {
                if (i18 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if (i13 != 0) {
                    z11 = true;
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    q3VarU = kh.f30051a.u(c0VarR, 6);
                }
                if ((i11 & 16) != 0) {
                    i12 &= -57345;
                    jhVarI = kh.f30051a.i(c0VarR, 6);
                }
                if (i15 != 0) {
                    jVar4 = null;
                } else {
                    jVar4 = jVar2;
                }
                jhVar3 = jhVarI;
                a0Var5 = a0Var4;
            }
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(947208840, i12, -1, "androidx.compose.material3.FilledIconButton (IconButton.kt:385)");
            }
            int i21111 = (i12 & 14) | androidx.profileinstaller.n.c.f73814m | (i12 & com.planner5d.library.engine.input.f.b.B) | (i12 & 896) | (i12 & 7168) | (57344 & i12);
            int i21112 = i12 << 3;
            c0Var2 = c0VarR;
            U(function1, a0Var5, z11, q3VarU, jhVar3, null, jVar4, function2, c0Var2, i21111 | (3670016 & i21112) | (i21112 & 29360128));
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            a0Var3 = a0Var5;
            z13 = z11;
            q3Var2 = q3VarU;
            jhVar2 = jhVar3;
            jVar3 = jVar4;
        } else {
            c0Var2 = c0VarR;
            c0Var2.u();
            a0Var3 = a0Var2;
            z13 = z11;
            q3Var2 = q3VarU;
            jhVar2 = jhVarI;
            jVar3 = jVar2;
        }
        s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.ai
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ei.u(function0, a0Var3, z13, q3Var2, jhVar2, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit u(Function0 function0, androidx.compose.ui.a0 a0Var, boolean z10, androidx.compose.ui.graphics.q3 q3Var, jh jhVar, androidx.compose.foundation.interaction.j jVar, Function2 function2, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        t(function0, a0Var, z10, q3Var, jhVar, jVar, function2, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    /* JADX WARN: Code duplicated, block: B:108:0x0146 A[PHI: r0 r5 r6 r7 r8
      0x0146: PHI (r0v11 androidx.compose.ui.a0) = (r0v8 androidx.compose.ui.a0), (r0v18 androidx.compose.ui.a0) binds: [B:121:0x017a, B:107:0x0143] A[DONT_GENERATE, DONT_INLINE]
      0x0146: PHI (r5v14 int) = (r5v9 int), (r5v17 int) binds: [B:121:0x017a, B:107:0x0143] A[DONT_GENERATE, DONT_INLINE]
      0x0146: PHI (r6v13 boolean) = (r6v5 boolean), (r6v2 boolean) binds: [B:121:0x017a, B:107:0x0143] A[DONT_GENERATE, DONT_INLINE]
      0x0146: PHI (r7v15 androidx.compose.ui.graphics.q3) = (r7v10 androidx.compose.ui.graphics.q3), (r7v7 androidx.compose.ui.graphics.q3) binds: [B:121:0x017a, B:107:0x0143] A[DONT_GENERATE, DONT_INLINE]
      0x0146: PHI (r8v8 androidx.compose.material3.oi) = (r8v5 androidx.compose.material3.oi), (r8v3 androidx.compose.material3.oi) binds: [B:121:0x017a, B:107:0x0143] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:109:0x014f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:110:0x0151  */
    /* JADX WARN: Code duplicated, block: B:111:0x0154  */
    /* JADX WARN: Code duplicated, block: B:113:0x0157  */
    /* JADX WARN: Code duplicated, block: B:116:0x015e  */
    /* JADX WARN: Code duplicated, block: B:119:0x016d  */
    /* JADX WARN: Code duplicated, block: B:120:0x0178  */
    /* JADX WARN: Code duplicated, block: B:122:0x017c  */
    /* JADX WARN: Code duplicated, block: B:125:0x018c  */
    /* JADX WARN: Code duplicated, block: B:128:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:131:0x01df  */
    /* JADX WARN: Code duplicated, block: B:133:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:136:0x01fb  */
    /* JADX WARN: Code duplicated, block: B:138:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0067  */
    /* JADX WARN: Code duplicated, block: B:38:0x006c  */
    /* JADX WARN: Code duplicated, block: B:40:0x0070  */
    /* JADX WARN: Code duplicated, block: B:42:0x0078  */
    /* JADX WARN: Code duplicated, block: B:43:0x007b  */
    /* JADX WARN: Code duplicated, block: B:47:0x0082  */
    /* JADX WARN: Code duplicated, block: B:49:0x0086  */
    /* JADX WARN: Code duplicated, block: B:51:0x0090  */
    /* JADX WARN: Code duplicated, block: B:52:0x0093  */
    /* JADX WARN: Code duplicated, block: B:55:0x009b  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:66:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:73:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:82:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:84:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:87:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:91:0x010f  */
    /* JADX WARN: Code duplicated, block: B:92:0x0111  */
    /* JADX WARN: Code duplicated, block: B:95:0x011a  */
    /* JADX WARN: Code duplicated, block: B:97:0x0128  */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void v(final boolean z10, @NotNull final Function1<? super Boolean, Unit> function1, @Nullable androidx.compose.ui.a0 a0Var, boolean z11, @Nullable androidx.compose.ui.graphics.q3 q3Var, @Nullable oi oiVar, @Nullable androidx.compose.foundation.interaction.j jVar, @NotNull final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        boolean z12;
        int i12;
        Function1<? super Boolean, Unit> function3;
        androidx.compose.ui.a0 a0Var2;
        int i13;
        boolean z13;
        int i14;
        androidx.compose.ui.graphics.q3 q3VarU;
        oi oiVarK;
        int i15;
        androidx.compose.foundation.interaction.j jVar2;
        int i16;
        int i17;
        int i18;
        boolean z14;
        androidx.compose.runtime.c0 c0Var2;
        final androidx.compose.ui.a0 a0Var3;
        final boolean z15;
        final androidx.compose.ui.graphics.q3 q3Var2;
        final oi oiVar2;
        final androidx.compose.foundation.interaction.j jVar3;
        androidx.compose.runtime.s5 s5VarT;
        androidx.compose.ui.a0 a0Var4;
        int i19;
        androidx.compose.foundation.interaction.j jVar4;
        boolean z16;
        androidx.compose.ui.graphics.q3 q3Var3;
        oi oiVar3;
        Object objI0;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-713829427);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
            z12 = z10;
        } else {
            z12 = z10;
            if ((i10 & 6) == 0) {
                i12 = (c0VarR.G(z12) ? 4 : 2) | i10;
            } else {
                i12 = i10;
            }
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
            function3 = function1;
        } else {
            function3 = function1;
            if ((i10 & 48) == 0) {
                i12 |= c0VarR.k0(function3) ? 32 : 16;
            }
        }
        int i20 = i11 & 4;
        if (i20 == 0) {
            if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                a0Var2 = a0Var;
                i12 |= c0VarR.D(a0Var2) ? 256 : 128;
            }
            i13 = i11 & 8;
            if (i13 != 0) {
                if ((i10 & 3072) == 0) {
                    z13 = z11;
                    if (c0VarR.G(z13)) {
                        i14 = 2048;
                    } else {
                        i14 = 1024;
                    }
                    i12 |= i14;
                }
                if ((i10 & 24576) == 0) {
                    if ((i11 & 16) == 0) {
                        q3VarU = q3Var;
                        int i21 = c0VarR.D(q3VarU) ? 16384 : 8192;
                        i12 |= i21;
                    } else {
                        q3VarU = q3Var;
                    }
                    i12 |= i21;
                } else {
                    q3VarU = q3Var;
                }
                if ((196608 & i10) == 0) {
                    if ((i11 & 32) == 0) {
                        oiVarK = oiVar;
                        int i22 = c0VarR.D(oiVarK) ? 131072 : 65536;
                        i12 |= i22;
                    } else {
                        oiVarK = oiVar;
                    }
                    i12 |= i22;
                } else {
                    oiVarK = oiVar;
                }
                i15 = i11 & 64;
                if (i15 != 0) {
                    if ((i10 & 1572864) == 0) {
                        jVar2 = jVar;
                        if (c0VarR.D(jVar2)) {
                            i16 = 1048576;
                        } else {
                            i16 = 524288;
                        }
                        i12 |= i16;
                    }
                    if ((i11 & 128) != 0) {
                        if ((i10 & 12582912) == 0) {
                            if (c0VarR.k0(function2)) {
                                i17 = 8388608;
                            } else {
                                i17 = 4194304;
                            }
                            i12 |= i17;
                        }
                        i18 = i12;
                        if ((i12 & 4793491) != 4793490) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (c0VarR.h(z14, i18 & 1)) {
                            c0VarR.l0();
                            if ((i10 & 1) != 0 || c0VarR.y()) {
                                if (i20 != 0) {
                                    a0Var4 = androidx.compose.ui.a0.E;
                                } else {
                                    a0Var4 = a0Var2;
                                }
                                if (i13 != 0) {
                                    z13 = true;
                                }
                                if ((i11 & 16) != 0) {
                                    i18 &= -57345;
                                    q3VarU = kh.f30051a.u(c0VarR, 6);
                                }
                                if ((i11 & 32) != 0) {
                                    i19 = i18 & (-458753);
                                    oiVarK = kh.f30051a.k(c0VarR, 6);
                                } else {
                                    i19 = i18;
                                }
                                if (i15 != 0) {
                                    jVar4 = null;
                                    z16 = z13;
                                    q3Var3 = q3VarU;
                                    oiVar3 = oiVarK;
                                }
                                c0VarR.Z();
                                if (androidx.compose.runtime.m0.l0()) {
                                    androidx.compose.runtime.m0.A0(-713829427, i19, -1, "androidx.compose.material3.FilledIconToggleButton (IconButton.kt:438)");
                                }
                                objI0 = c0VarR.i0();
                                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI0 = new Function1() { // from class: androidx.compose.material3.th
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return ei.w((androidx.compose.ui.semantics.e0) obj);
                                        }
                                    };
                                    c0VarR.Y(objI0);
                                }
                                int i23 = i19 << 3;
                                c0Var2 = c0VarR;
                                X(z12, function3, androidx.compose.ui.semantics.t.f(a0Var4, false, (Function1) objI0, 1, null), z16, q3Var3, oiVar3, null, jVar4, function2, c0Var2, (i19 & 14) | 1572864 | (i19 & com.planner5d.library.engine.input.f.b.B) | (i19 & 7168) | (57344 & i19) | (458752 & i19) | (29360128 & i23) | (i23 & 234881024));
                                if (androidx.compose.runtime.m0.l0()) {
                                    androidx.compose.runtime.m0.z0();
                                }
                                a0Var3 = a0Var4;
                                z15 = z16;
                                q3Var2 = q3Var3;
                                oiVar2 = oiVar3;
                                jVar3 = jVar4;
                            } else {
                                c0VarR.u();
                                int i24 = (i11 & 16) != 0 ? i18 & (-57345) : i18;
                                if ((i11 & 32) != 0) {
                                    i24 &= -458753;
                                }
                                i19 = i24;
                                a0Var4 = a0Var2;
                            }
                            z16 = z13;
                            oiVar3 = oiVarK;
                            jVar4 = jVar2;
                            q3Var3 = q3VarU;
                            c0VarR.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(-713829427, i19, -1, "androidx.compose.material3.FilledIconToggleButton (IconButton.kt:438)");
                            }
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = new Function1() { // from class: androidx.compose.material3.th
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return ei.w((androidx.compose.ui.semantics.e0) obj);
                                    }
                                };
                                c0VarR.Y(objI0);
                            }
                            int i25 = i19 << 3;
                            c0Var2 = c0VarR;
                            X(z12, function3, androidx.compose.ui.semantics.t.f(a0Var4, false, (Function1) objI0, 1, null), z16, q3Var3, oiVar3, null, jVar4, function2, c0Var2, (i19 & 14) | 1572864 | (i19 & com.planner5d.library.engine.input.f.b.B) | (i19 & 7168) | (57344 & i19) | (458752 & i19) | (29360128 & i25) | (i25 & 234881024));
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            a0Var3 = a0Var4;
                            z15 = z16;
                            q3Var2 = q3Var3;
                            oiVar2 = oiVar3;
                            jVar3 = jVar4;
                        } else {
                            c0Var2 = c0VarR;
                            c0Var2.u();
                            a0Var3 = a0Var2;
                            z15 = z13;
                            q3Var2 = q3VarU;
                            oiVar2 = oiVarK;
                            jVar3 = jVar2;
                        }
                        s5VarT = c0Var2.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material3.uh
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return ei.x(z10, function1, a0Var3, z15, q3Var2, oiVar2, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i12 |= 12582912;
                    i18 = i12;
                    if ((i12 & 4793491) != 4793490) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c0VarR.h(z14, i18 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i20 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i13 != 0) {
                                z13 = true;
                            }
                            if ((i11 & 16) != 0) {
                                i18 &= -57345;
                                q3VarU = kh.f30051a.u(c0VarR, 6);
                            }
                            if ((i11 & 32) != 0) {
                                i19 = i18 & (-458753);
                                oiVarK = kh.f30051a.k(c0VarR, 6);
                            } else {
                                i19 = i18;
                            }
                            if (i15 != 0) {
                                jVar4 = null;
                                z16 = z13;
                                q3Var3 = q3VarU;
                                oiVar3 = oiVarK;
                            } else {
                                z16 = z13;
                                oiVar3 = oiVarK;
                                jVar4 = jVar2;
                                q3Var3 = q3VarU;
                            }
                        } else {
                            if (i20 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i13 != 0) {
                                z13 = true;
                            }
                            if ((i11 & 16) != 0) {
                                i18 &= -57345;
                                q3VarU = kh.f30051a.u(c0VarR, 6);
                            }
                            if ((i11 & 32) != 0) {
                                i19 = i18 & (-458753);
                                oiVarK = kh.f30051a.k(c0VarR, 6);
                            } else {
                                i19 = i18;
                            }
                            if (i15 != 0) {
                                jVar4 = null;
                                z16 = z13;
                                q3Var3 = q3VarU;
                                oiVar3 = oiVarK;
                            } else {
                                z16 = z13;
                                oiVar3 = oiVarK;
                                jVar4 = jVar2;
                                q3Var3 = q3VarU;
                            }
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-713829427, i19, -1, "androidx.compose.material3.FilledIconToggleButton (IconButton.kt:438)");
                        }
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = new Function1() { // from class: androidx.compose.material3.th
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return ei.w((androidx.compose.ui.semantics.e0) obj);
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        int i26 = i19 << 3;
                        c0Var2 = c0VarR;
                        X(z12, function3, androidx.compose.ui.semantics.t.f(a0Var4, false, (Function1) objI0, 1, null), z16, q3Var3, oiVar3, null, jVar4, function2, c0Var2, (i19 & 14) | 1572864 | (i19 & com.planner5d.library.engine.input.f.b.B) | (i19 & 7168) | (57344 & i19) | (458752 & i19) | (29360128 & i26) | (i26 & 234881024));
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var4;
                        z15 = z16;
                        q3Var2 = q3Var3;
                        oiVar2 = oiVar3;
                        jVar3 = jVar4;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        a0Var3 = a0Var2;
                        z15 = z13;
                        q3Var2 = q3VarU;
                        oiVar2 = oiVarK;
                        jVar3 = jVar2;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.uh
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return ei.x(z10, function1, a0Var3, z15, q3Var2, oiVar2, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 1572864;
                jVar2 = jVar;
                if ((i11 & 128) != 0) {
                    if ((i10 & 12582912) == 0) {
                        if (c0VarR.k0(function2)) {
                            i17 = 8388608;
                        } else {
                            i17 = 4194304;
                        }
                        i12 |= i17;
                    }
                    i18 = i12;
                    if ((i12 & 4793491) != 4793490) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c0VarR.h(z14, i18 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i20 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i13 != 0) {
                                z13 = true;
                            }
                            if ((i11 & 16) != 0) {
                                i18 &= -57345;
                                q3VarU = kh.f30051a.u(c0VarR, 6);
                            }
                            if ((i11 & 32) != 0) {
                                i19 = i18 & (-458753);
                                oiVarK = kh.f30051a.k(c0VarR, 6);
                            } else {
                                i19 = i18;
                            }
                            if (i15 != 0) {
                                jVar4 = null;
                                z16 = z13;
                                q3Var3 = q3VarU;
                                oiVar3 = oiVarK;
                            } else {
                                z16 = z13;
                                oiVar3 = oiVarK;
                                jVar4 = jVar2;
                                q3Var3 = q3VarU;
                            }
                        } else {
                            if (i20 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i13 != 0) {
                                z13 = true;
                            }
                            if ((i11 & 16) != 0) {
                                i18 &= -57345;
                                q3VarU = kh.f30051a.u(c0VarR, 6);
                            }
                            if ((i11 & 32) != 0) {
                                i19 = i18 & (-458753);
                                oiVarK = kh.f30051a.k(c0VarR, 6);
                            } else {
                                i19 = i18;
                            }
                            if (i15 != 0) {
                                jVar4 = null;
                                z16 = z13;
                                q3Var3 = q3VarU;
                                oiVar3 = oiVarK;
                            } else {
                                z16 = z13;
                                oiVar3 = oiVarK;
                                jVar4 = jVar2;
                                q3Var3 = q3VarU;
                            }
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-713829427, i19, -1, "androidx.compose.material3.FilledIconToggleButton (IconButton.kt:438)");
                        }
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = new Function1() { // from class: androidx.compose.material3.th
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return ei.w((androidx.compose.ui.semantics.e0) obj);
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        int i27 = i19 << 3;
                        c0Var2 = c0VarR;
                        X(z12, function3, androidx.compose.ui.semantics.t.f(a0Var4, false, (Function1) objI0, 1, null), z16, q3Var3, oiVar3, null, jVar4, function2, c0Var2, (i19 & 14) | 1572864 | (i19 & com.planner5d.library.engine.input.f.b.B) | (i19 & 7168) | (57344 & i19) | (458752 & i19) | (29360128 & i27) | (i27 & 234881024));
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var4;
                        z15 = z16;
                        q3Var2 = q3Var3;
                        oiVar2 = oiVar3;
                        jVar3 = jVar4;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        a0Var3 = a0Var2;
                        z15 = z13;
                        q3Var2 = q3VarU;
                        oiVar2 = oiVarK;
                        jVar3 = jVar2;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.uh
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return ei.x(z10, function1, a0Var3, z15, q3Var2, oiVar2, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 12582912;
                i18 = i12;
                if ((i12 & 4793491) != 4793490) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c0VarR.h(z14, i18 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i20 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if ((i11 & 16) != 0) {
                            i18 &= -57345;
                            q3VarU = kh.f30051a.u(c0VarR, 6);
                        }
                        if ((i11 & 32) != 0) {
                            i19 = i18 & (-458753);
                            oiVarK = kh.f30051a.k(c0VarR, 6);
                        } else {
                            i19 = i18;
                        }
                        if (i15 != 0) {
                            jVar4 = null;
                            z16 = z13;
                            q3Var3 = q3VarU;
                            oiVar3 = oiVarK;
                        } else {
                            z16 = z13;
                            oiVar3 = oiVarK;
                            jVar4 = jVar2;
                            q3Var3 = q3VarU;
                        }
                    } else {
                        if (i20 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if ((i11 & 16) != 0) {
                            i18 &= -57345;
                            q3VarU = kh.f30051a.u(c0VarR, 6);
                        }
                        if ((i11 & 32) != 0) {
                            i19 = i18 & (-458753);
                            oiVarK = kh.f30051a.k(c0VarR, 6);
                        } else {
                            i19 = i18;
                        }
                        if (i15 != 0) {
                            jVar4 = null;
                            z16 = z13;
                            q3Var3 = q3VarU;
                            oiVar3 = oiVarK;
                        } else {
                            z16 = z13;
                            oiVar3 = oiVarK;
                            jVar4 = jVar2;
                            q3Var3 = q3VarU;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-713829427, i19, -1, "androidx.compose.material3.FilledIconToggleButton (IconButton.kt:438)");
                    }
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = new Function1() { // from class: androidx.compose.material3.th
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return ei.w((androidx.compose.ui.semantics.e0) obj);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    int i28 = i19 << 3;
                    c0Var2 = c0VarR;
                    X(z12, function3, androidx.compose.ui.semantics.t.f(a0Var4, false, (Function1) objI0, 1, null), z16, q3Var3, oiVar3, null, jVar4, function2, c0Var2, (i19 & 14) | 1572864 | (i19 & com.planner5d.library.engine.input.f.b.B) | (i19 & 7168) | (57344 & i19) | (458752 & i19) | (29360128 & i28) | (i28 & 234881024));
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var4;
                    z15 = z16;
                    q3Var2 = q3Var3;
                    oiVar2 = oiVar3;
                    jVar3 = jVar4;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var3 = a0Var2;
                    z15 = z13;
                    q3Var2 = q3VarU;
                    oiVar2 = oiVarK;
                    jVar3 = jVar2;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.uh
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ei.x(z10, function1, a0Var3, z15, q3Var2, oiVar2, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 3072;
            z13 = z11;
            if ((i10 & 24576) == 0) {
                if ((i11 & 16) == 0) {
                    q3VarU = q3Var;
                    if (c0VarR.D(q3VarU)) {
                    }
                    i12 |= i21;
                } else {
                    q3VarU = q3Var;
                }
                i12 |= i21;
            } else {
                q3VarU = q3Var;
            }
            if ((196608 & i10) == 0) {
                if ((i11 & 32) == 0) {
                    oiVarK = oiVar;
                    if (c0VarR.D(oiVarK)) {
                    }
                    i12 |= i22;
                } else {
                    oiVarK = oiVar;
                }
                i12 |= i22;
            } else {
                oiVarK = oiVar;
            }
            i15 = i11 & 64;
            if (i15 != 0) {
                if ((i10 & 1572864) == 0) {
                    jVar2 = jVar;
                    if (c0VarR.D(jVar2)) {
                        i16 = 1048576;
                    } else {
                        i16 = 524288;
                    }
                    i12 |= i16;
                }
                if ((i11 & 128) != 0) {
                    if ((i10 & 12582912) == 0) {
                        if (c0VarR.k0(function2)) {
                            i17 = 8388608;
                        } else {
                            i17 = 4194304;
                        }
                        i12 |= i17;
                    }
                    i18 = i12;
                    if ((i12 & 4793491) != 4793490) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c0VarR.h(z14, i18 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i20 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i13 != 0) {
                                z13 = true;
                            }
                            if ((i11 & 16) != 0) {
                                i18 &= -57345;
                                q3VarU = kh.f30051a.u(c0VarR, 6);
                            }
                            if ((i11 & 32) != 0) {
                                i19 = i18 & (-458753);
                                oiVarK = kh.f30051a.k(c0VarR, 6);
                            } else {
                                i19 = i18;
                            }
                            if (i15 != 0) {
                                jVar4 = null;
                                z16 = z13;
                                q3Var3 = q3VarU;
                                oiVar3 = oiVarK;
                            } else {
                                z16 = z13;
                                oiVar3 = oiVarK;
                                jVar4 = jVar2;
                                q3Var3 = q3VarU;
                            }
                        } else {
                            if (i20 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i13 != 0) {
                                z13 = true;
                            }
                            if ((i11 & 16) != 0) {
                                i18 &= -57345;
                                q3VarU = kh.f30051a.u(c0VarR, 6);
                            }
                            if ((i11 & 32) != 0) {
                                i19 = i18 & (-458753);
                                oiVarK = kh.f30051a.k(c0VarR, 6);
                            } else {
                                i19 = i18;
                            }
                            if (i15 != 0) {
                                jVar4 = null;
                                z16 = z13;
                                q3Var3 = q3VarU;
                                oiVar3 = oiVarK;
                            } else {
                                z16 = z13;
                                oiVar3 = oiVarK;
                                jVar4 = jVar2;
                                q3Var3 = q3VarU;
                            }
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-713829427, i19, -1, "androidx.compose.material3.FilledIconToggleButton (IconButton.kt:438)");
                        }
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = new Function1() { // from class: androidx.compose.material3.th
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return ei.w((androidx.compose.ui.semantics.e0) obj);
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        int i29 = i19 << 3;
                        c0Var2 = c0VarR;
                        X(z12, function3, androidx.compose.ui.semantics.t.f(a0Var4, false, (Function1) objI0, 1, null), z16, q3Var3, oiVar3, null, jVar4, function2, c0Var2, (i19 & 14) | 1572864 | (i19 & com.planner5d.library.engine.input.f.b.B) | (i19 & 7168) | (57344 & i19) | (458752 & i19) | (29360128 & i29) | (i29 & 234881024));
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var4;
                        z15 = z16;
                        q3Var2 = q3Var3;
                        oiVar2 = oiVar3;
                        jVar3 = jVar4;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        a0Var3 = a0Var2;
                        z15 = z13;
                        q3Var2 = q3VarU;
                        oiVar2 = oiVarK;
                        jVar3 = jVar2;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.uh
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return ei.x(z10, function1, a0Var3, z15, q3Var2, oiVar2, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 12582912;
                i18 = i12;
                if ((i12 & 4793491) != 4793490) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c0VarR.h(z14, i18 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i20 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if ((i11 & 16) != 0) {
                            i18 &= -57345;
                            q3VarU = kh.f30051a.u(c0VarR, 6);
                        }
                        if ((i11 & 32) != 0) {
                            i19 = i18 & (-458753);
                            oiVarK = kh.f30051a.k(c0VarR, 6);
                        } else {
                            i19 = i18;
                        }
                        if (i15 != 0) {
                            jVar4 = null;
                            z16 = z13;
                            q3Var3 = q3VarU;
                            oiVar3 = oiVarK;
                        } else {
                            z16 = z13;
                            oiVar3 = oiVarK;
                            jVar4 = jVar2;
                            q3Var3 = q3VarU;
                        }
                    } else {
                        if (i20 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if ((i11 & 16) != 0) {
                            i18 &= -57345;
                            q3VarU = kh.f30051a.u(c0VarR, 6);
                        }
                        if ((i11 & 32) != 0) {
                            i19 = i18 & (-458753);
                            oiVarK = kh.f30051a.k(c0VarR, 6);
                        } else {
                            i19 = i18;
                        }
                        if (i15 != 0) {
                            jVar4 = null;
                            z16 = z13;
                            q3Var3 = q3VarU;
                            oiVar3 = oiVarK;
                        } else {
                            z16 = z13;
                            oiVar3 = oiVarK;
                            jVar4 = jVar2;
                            q3Var3 = q3VarU;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-713829427, i19, -1, "androidx.compose.material3.FilledIconToggleButton (IconButton.kt:438)");
                    }
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = new Function1() { // from class: androidx.compose.material3.th
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return ei.w((androidx.compose.ui.semantics.e0) obj);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    int i210 = i19 << 3;
                    c0Var2 = c0VarR;
                    X(z12, function3, androidx.compose.ui.semantics.t.f(a0Var4, false, (Function1) objI0, 1, null), z16, q3Var3, oiVar3, null, jVar4, function2, c0Var2, (i19 & 14) | 1572864 | (i19 & com.planner5d.library.engine.input.f.b.B) | (i19 & 7168) | (57344 & i19) | (458752 & i19) | (29360128 & i210) | (i210 & 234881024));
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var4;
                    z15 = z16;
                    q3Var2 = q3Var3;
                    oiVar2 = oiVar3;
                    jVar3 = jVar4;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var3 = a0Var2;
                    z15 = z13;
                    q3Var2 = q3VarU;
                    oiVar2 = oiVarK;
                    jVar3 = jVar2;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.uh
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ei.x(z10, function1, a0Var3, z15, q3Var2, oiVar2, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 1572864;
            jVar2 = jVar;
            if ((i11 & 128) != 0) {
                if ((i10 & 12582912) == 0) {
                    if (c0VarR.k0(function2)) {
                        i17 = 8388608;
                    } else {
                        i17 = 4194304;
                    }
                    i12 |= i17;
                }
                i18 = i12;
                if ((i12 & 4793491) != 4793490) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c0VarR.h(z14, i18 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i20 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if ((i11 & 16) != 0) {
                            i18 &= -57345;
                            q3VarU = kh.f30051a.u(c0VarR, 6);
                        }
                        if ((i11 & 32) != 0) {
                            i19 = i18 & (-458753);
                            oiVarK = kh.f30051a.k(c0VarR, 6);
                        } else {
                            i19 = i18;
                        }
                        if (i15 != 0) {
                            jVar4 = null;
                            z16 = z13;
                            q3Var3 = q3VarU;
                            oiVar3 = oiVarK;
                        } else {
                            z16 = z13;
                            oiVar3 = oiVarK;
                            jVar4 = jVar2;
                            q3Var3 = q3VarU;
                        }
                    } else {
                        if (i20 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if ((i11 & 16) != 0) {
                            i18 &= -57345;
                            q3VarU = kh.f30051a.u(c0VarR, 6);
                        }
                        if ((i11 & 32) != 0) {
                            i19 = i18 & (-458753);
                            oiVarK = kh.f30051a.k(c0VarR, 6);
                        } else {
                            i19 = i18;
                        }
                        if (i15 != 0) {
                            jVar4 = null;
                            z16 = z13;
                            q3Var3 = q3VarU;
                            oiVar3 = oiVarK;
                        } else {
                            z16 = z13;
                            oiVar3 = oiVarK;
                            jVar4 = jVar2;
                            q3Var3 = q3VarU;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-713829427, i19, -1, "androidx.compose.material3.FilledIconToggleButton (IconButton.kt:438)");
                    }
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = new Function1() { // from class: androidx.compose.material3.th
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return ei.w((androidx.compose.ui.semantics.e0) obj);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    int i211 = i19 << 3;
                    c0Var2 = c0VarR;
                    X(z12, function3, androidx.compose.ui.semantics.t.f(a0Var4, false, (Function1) objI0, 1, null), z16, q3Var3, oiVar3, null, jVar4, function2, c0Var2, (i19 & 14) | 1572864 | (i19 & com.planner5d.library.engine.input.f.b.B) | (i19 & 7168) | (57344 & i19) | (458752 & i19) | (29360128 & i211) | (i211 & 234881024));
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var4;
                    z15 = z16;
                    q3Var2 = q3Var3;
                    oiVar2 = oiVar3;
                    jVar3 = jVar4;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var3 = a0Var2;
                    z15 = z13;
                    q3Var2 = q3VarU;
                    oiVar2 = oiVarK;
                    jVar3 = jVar2;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.uh
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ei.x(z10, function1, a0Var3, z15, q3Var2, oiVar2, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 12582912;
            i18 = i12;
            if ((i12 & 4793491) != 4793490) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c0VarR.h(z14, i18 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i20 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    }
                    if ((i11 & 16) != 0) {
                        i18 &= -57345;
                        q3VarU = kh.f30051a.u(c0VarR, 6);
                    }
                    if ((i11 & 32) != 0) {
                        i19 = i18 & (-458753);
                        oiVarK = kh.f30051a.k(c0VarR, 6);
                    } else {
                        i19 = i18;
                    }
                    if (i15 != 0) {
                        jVar4 = null;
                        z16 = z13;
                        q3Var3 = q3VarU;
                        oiVar3 = oiVarK;
                    } else {
                        z16 = z13;
                        oiVar3 = oiVarK;
                        jVar4 = jVar2;
                        q3Var3 = q3VarU;
                    }
                } else {
                    if (i20 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    }
                    if ((i11 & 16) != 0) {
                        i18 &= -57345;
                        q3VarU = kh.f30051a.u(c0VarR, 6);
                    }
                    if ((i11 & 32) != 0) {
                        i19 = i18 & (-458753);
                        oiVarK = kh.f30051a.k(c0VarR, 6);
                    } else {
                        i19 = i18;
                    }
                    if (i15 != 0) {
                        jVar4 = null;
                        z16 = z13;
                        q3Var3 = q3VarU;
                        oiVar3 = oiVarK;
                    } else {
                        z16 = z13;
                        oiVar3 = oiVarK;
                        jVar4 = jVar2;
                        q3Var3 = q3VarU;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-713829427, i19, -1, "androidx.compose.material3.FilledIconToggleButton (IconButton.kt:438)");
                }
                objI0 = c0VarR.i0();
                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = new Function1() { // from class: androidx.compose.material3.th
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return ei.w((androidx.compose.ui.semantics.e0) obj);
                        }
                    };
                    c0VarR.Y(objI0);
                }
                int i212 = i19 << 3;
                c0Var2 = c0VarR;
                X(z12, function3, androidx.compose.ui.semantics.t.f(a0Var4, false, (Function1) objI0, 1, null), z16, q3Var3, oiVar3, null, jVar4, function2, c0Var2, (i19 & 14) | 1572864 | (i19 & com.planner5d.library.engine.input.f.b.B) | (i19 & 7168) | (57344 & i19) | (458752 & i19) | (29360128 & i212) | (i212 & 234881024));
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var4;
                z15 = z16;
                q3Var2 = q3Var3;
                oiVar2 = oiVar3;
                jVar3 = jVar4;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var3 = a0Var2;
                z15 = z13;
                q3Var2 = q3VarU;
                oiVar2 = oiVarK;
                jVar3 = jVar2;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.uh
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ei.x(z10, function1, a0Var3, z15, q3Var2, oiVar2, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= androidx.media3.exoplayer.a5.S0;
        a0Var2 = a0Var;
        i13 = i11 & 8;
        if (i13 != 0) {
            if ((i10 & 3072) == 0) {
                z13 = z11;
                if (c0VarR.G(z13)) {
                    i14 = 2048;
                } else {
                    i14 = 1024;
                }
                i12 |= i14;
            }
            if ((i10 & 24576) == 0) {
                if ((i11 & 16) == 0) {
                    q3VarU = q3Var;
                    if (c0VarR.D(q3VarU)) {
                    }
                    i12 |= i21;
                } else {
                    q3VarU = q3Var;
                }
                i12 |= i21;
            } else {
                q3VarU = q3Var;
            }
            if ((196608 & i10) == 0) {
                if ((i11 & 32) == 0) {
                    oiVarK = oiVar;
                    if (c0VarR.D(oiVarK)) {
                    }
                    i12 |= i22;
                } else {
                    oiVarK = oiVar;
                }
                i12 |= i22;
            } else {
                oiVarK = oiVar;
            }
            i15 = i11 & 64;
            if (i15 != 0) {
                if ((i10 & 1572864) == 0) {
                    jVar2 = jVar;
                    if (c0VarR.D(jVar2)) {
                        i16 = 1048576;
                    } else {
                        i16 = 524288;
                    }
                    i12 |= i16;
                }
                if ((i11 & 128) != 0) {
                    if ((i10 & 12582912) == 0) {
                        if (c0VarR.k0(function2)) {
                            i17 = 8388608;
                        } else {
                            i17 = 4194304;
                        }
                        i12 |= i17;
                    }
                    i18 = i12;
                    if ((i12 & 4793491) != 4793490) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c0VarR.h(z14, i18 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i20 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i13 != 0) {
                                z13 = true;
                            }
                            if ((i11 & 16) != 0) {
                                i18 &= -57345;
                                q3VarU = kh.f30051a.u(c0VarR, 6);
                            }
                            if ((i11 & 32) != 0) {
                                i19 = i18 & (-458753);
                                oiVarK = kh.f30051a.k(c0VarR, 6);
                            } else {
                                i19 = i18;
                            }
                            if (i15 != 0) {
                                jVar4 = null;
                                z16 = z13;
                                q3Var3 = q3VarU;
                                oiVar3 = oiVarK;
                            } else {
                                z16 = z13;
                                oiVar3 = oiVarK;
                                jVar4 = jVar2;
                                q3Var3 = q3VarU;
                            }
                        } else {
                            if (i20 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i13 != 0) {
                                z13 = true;
                            }
                            if ((i11 & 16) != 0) {
                                i18 &= -57345;
                                q3VarU = kh.f30051a.u(c0VarR, 6);
                            }
                            if ((i11 & 32) != 0) {
                                i19 = i18 & (-458753);
                                oiVarK = kh.f30051a.k(c0VarR, 6);
                            } else {
                                i19 = i18;
                            }
                            if (i15 != 0) {
                                jVar4 = null;
                                z16 = z13;
                                q3Var3 = q3VarU;
                                oiVar3 = oiVarK;
                            } else {
                                z16 = z13;
                                oiVar3 = oiVarK;
                                jVar4 = jVar2;
                                q3Var3 = q3VarU;
                            }
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-713829427, i19, -1, "androidx.compose.material3.FilledIconToggleButton (IconButton.kt:438)");
                        }
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = new Function1() { // from class: androidx.compose.material3.th
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return ei.w((androidx.compose.ui.semantics.e0) obj);
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        int i213 = i19 << 3;
                        c0Var2 = c0VarR;
                        X(z12, function3, androidx.compose.ui.semantics.t.f(a0Var4, false, (Function1) objI0, 1, null), z16, q3Var3, oiVar3, null, jVar4, function2, c0Var2, (i19 & 14) | 1572864 | (i19 & com.planner5d.library.engine.input.f.b.B) | (i19 & 7168) | (57344 & i19) | (458752 & i19) | (29360128 & i213) | (i213 & 234881024));
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var4;
                        z15 = z16;
                        q3Var2 = q3Var3;
                        oiVar2 = oiVar3;
                        jVar3 = jVar4;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        a0Var3 = a0Var2;
                        z15 = z13;
                        q3Var2 = q3VarU;
                        oiVar2 = oiVarK;
                        jVar3 = jVar2;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.uh
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return ei.x(z10, function1, a0Var3, z15, q3Var2, oiVar2, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 12582912;
                i18 = i12;
                if ((i12 & 4793491) != 4793490) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c0VarR.h(z14, i18 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i20 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if ((i11 & 16) != 0) {
                            i18 &= -57345;
                            q3VarU = kh.f30051a.u(c0VarR, 6);
                        }
                        if ((i11 & 32) != 0) {
                            i19 = i18 & (-458753);
                            oiVarK = kh.f30051a.k(c0VarR, 6);
                        } else {
                            i19 = i18;
                        }
                        if (i15 != 0) {
                            jVar4 = null;
                            z16 = z13;
                            q3Var3 = q3VarU;
                            oiVar3 = oiVarK;
                        } else {
                            z16 = z13;
                            oiVar3 = oiVarK;
                            jVar4 = jVar2;
                            q3Var3 = q3VarU;
                        }
                    } else {
                        if (i20 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if ((i11 & 16) != 0) {
                            i18 &= -57345;
                            q3VarU = kh.f30051a.u(c0VarR, 6);
                        }
                        if ((i11 & 32) != 0) {
                            i19 = i18 & (-458753);
                            oiVarK = kh.f30051a.k(c0VarR, 6);
                        } else {
                            i19 = i18;
                        }
                        if (i15 != 0) {
                            jVar4 = null;
                            z16 = z13;
                            q3Var3 = q3VarU;
                            oiVar3 = oiVarK;
                        } else {
                            z16 = z13;
                            oiVar3 = oiVarK;
                            jVar4 = jVar2;
                            q3Var3 = q3VarU;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-713829427, i19, -1, "androidx.compose.material3.FilledIconToggleButton (IconButton.kt:438)");
                    }
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = new Function1() { // from class: androidx.compose.material3.th
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return ei.w((androidx.compose.ui.semantics.e0) obj);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    int i214 = i19 << 3;
                    c0Var2 = c0VarR;
                    X(z12, function3, androidx.compose.ui.semantics.t.f(a0Var4, false, (Function1) objI0, 1, null), z16, q3Var3, oiVar3, null, jVar4, function2, c0Var2, (i19 & 14) | 1572864 | (i19 & com.planner5d.library.engine.input.f.b.B) | (i19 & 7168) | (57344 & i19) | (458752 & i19) | (29360128 & i214) | (i214 & 234881024));
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var4;
                    z15 = z16;
                    q3Var2 = q3Var3;
                    oiVar2 = oiVar3;
                    jVar3 = jVar4;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var3 = a0Var2;
                    z15 = z13;
                    q3Var2 = q3VarU;
                    oiVar2 = oiVarK;
                    jVar3 = jVar2;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.uh
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ei.x(z10, function1, a0Var3, z15, q3Var2, oiVar2, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 1572864;
            jVar2 = jVar;
            if ((i11 & 128) != 0) {
                if ((i10 & 12582912) == 0) {
                    if (c0VarR.k0(function2)) {
                        i17 = 8388608;
                    } else {
                        i17 = 4194304;
                    }
                    i12 |= i17;
                }
                i18 = i12;
                if ((i12 & 4793491) != 4793490) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c0VarR.h(z14, i18 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i20 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if ((i11 & 16) != 0) {
                            i18 &= -57345;
                            q3VarU = kh.f30051a.u(c0VarR, 6);
                        }
                        if ((i11 & 32) != 0) {
                            i19 = i18 & (-458753);
                            oiVarK = kh.f30051a.k(c0VarR, 6);
                        } else {
                            i19 = i18;
                        }
                        if (i15 != 0) {
                            jVar4 = null;
                            z16 = z13;
                            q3Var3 = q3VarU;
                            oiVar3 = oiVarK;
                        } else {
                            z16 = z13;
                            oiVar3 = oiVarK;
                            jVar4 = jVar2;
                            q3Var3 = q3VarU;
                        }
                    } else {
                        if (i20 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if ((i11 & 16) != 0) {
                            i18 &= -57345;
                            q3VarU = kh.f30051a.u(c0VarR, 6);
                        }
                        if ((i11 & 32) != 0) {
                            i19 = i18 & (-458753);
                            oiVarK = kh.f30051a.k(c0VarR, 6);
                        } else {
                            i19 = i18;
                        }
                        if (i15 != 0) {
                            jVar4 = null;
                            z16 = z13;
                            q3Var3 = q3VarU;
                            oiVar3 = oiVarK;
                        } else {
                            z16 = z13;
                            oiVar3 = oiVarK;
                            jVar4 = jVar2;
                            q3Var3 = q3VarU;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-713829427, i19, -1, "androidx.compose.material3.FilledIconToggleButton (IconButton.kt:438)");
                    }
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = new Function1() { // from class: androidx.compose.material3.th
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return ei.w((androidx.compose.ui.semantics.e0) obj);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    int i215 = i19 << 3;
                    c0Var2 = c0VarR;
                    X(z12, function3, androidx.compose.ui.semantics.t.f(a0Var4, false, (Function1) objI0, 1, null), z16, q3Var3, oiVar3, null, jVar4, function2, c0Var2, (i19 & 14) | 1572864 | (i19 & com.planner5d.library.engine.input.f.b.B) | (i19 & 7168) | (57344 & i19) | (458752 & i19) | (29360128 & i215) | (i215 & 234881024));
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var4;
                    z15 = z16;
                    q3Var2 = q3Var3;
                    oiVar2 = oiVar3;
                    jVar3 = jVar4;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var3 = a0Var2;
                    z15 = z13;
                    q3Var2 = q3VarU;
                    oiVar2 = oiVarK;
                    jVar3 = jVar2;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.uh
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ei.x(z10, function1, a0Var3, z15, q3Var2, oiVar2, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 12582912;
            i18 = i12;
            if ((i12 & 4793491) != 4793490) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c0VarR.h(z14, i18 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i20 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    }
                    if ((i11 & 16) != 0) {
                        i18 &= -57345;
                        q3VarU = kh.f30051a.u(c0VarR, 6);
                    }
                    if ((i11 & 32) != 0) {
                        i19 = i18 & (-458753);
                        oiVarK = kh.f30051a.k(c0VarR, 6);
                    } else {
                        i19 = i18;
                    }
                    if (i15 != 0) {
                        jVar4 = null;
                        z16 = z13;
                        q3Var3 = q3VarU;
                        oiVar3 = oiVarK;
                    } else {
                        z16 = z13;
                        oiVar3 = oiVarK;
                        jVar4 = jVar2;
                        q3Var3 = q3VarU;
                    }
                } else {
                    if (i20 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    }
                    if ((i11 & 16) != 0) {
                        i18 &= -57345;
                        q3VarU = kh.f30051a.u(c0VarR, 6);
                    }
                    if ((i11 & 32) != 0) {
                        i19 = i18 & (-458753);
                        oiVarK = kh.f30051a.k(c0VarR, 6);
                    } else {
                        i19 = i18;
                    }
                    if (i15 != 0) {
                        jVar4 = null;
                        z16 = z13;
                        q3Var3 = q3VarU;
                        oiVar3 = oiVarK;
                    } else {
                        z16 = z13;
                        oiVar3 = oiVarK;
                        jVar4 = jVar2;
                        q3Var3 = q3VarU;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-713829427, i19, -1, "androidx.compose.material3.FilledIconToggleButton (IconButton.kt:438)");
                }
                objI0 = c0VarR.i0();
                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = new Function1() { // from class: androidx.compose.material3.th
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return ei.w((androidx.compose.ui.semantics.e0) obj);
                        }
                    };
                    c0VarR.Y(objI0);
                }
                int i216 = i19 << 3;
                c0Var2 = c0VarR;
                X(z12, function3, androidx.compose.ui.semantics.t.f(a0Var4, false, (Function1) objI0, 1, null), z16, q3Var3, oiVar3, null, jVar4, function2, c0Var2, (i19 & 14) | 1572864 | (i19 & com.planner5d.library.engine.input.f.b.B) | (i19 & 7168) | (57344 & i19) | (458752 & i19) | (29360128 & i216) | (i216 & 234881024));
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var4;
                z15 = z16;
                q3Var2 = q3Var3;
                oiVar2 = oiVar3;
                jVar3 = jVar4;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var3 = a0Var2;
                z15 = z13;
                q3Var2 = q3VarU;
                oiVar2 = oiVarK;
                jVar3 = jVar2;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.uh
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ei.x(z10, function1, a0Var3, z15, q3Var2, oiVar2, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 3072;
        z13 = z11;
        if ((i10 & 24576) == 0) {
            if ((i11 & 16) == 0) {
                q3VarU = q3Var;
                if (c0VarR.D(q3VarU)) {
                }
                i12 |= i21;
            } else {
                q3VarU = q3Var;
            }
            i12 |= i21;
        } else {
            q3VarU = q3Var;
        }
        if ((196608 & i10) == 0) {
            if ((i11 & 32) == 0) {
                oiVarK = oiVar;
                if (c0VarR.D(oiVarK)) {
                }
                i12 |= i22;
            } else {
                oiVarK = oiVar;
            }
            i12 |= i22;
        } else {
            oiVarK = oiVar;
        }
        i15 = i11 & 64;
        if (i15 != 0) {
            if ((i10 & 1572864) == 0) {
                jVar2 = jVar;
                if (c0VarR.D(jVar2)) {
                    i16 = 1048576;
                } else {
                    i16 = 524288;
                }
                i12 |= i16;
            }
            if ((i11 & 128) != 0) {
                if ((i10 & 12582912) == 0) {
                    if (c0VarR.k0(function2)) {
                        i17 = 8388608;
                    } else {
                        i17 = 4194304;
                    }
                    i12 |= i17;
                }
                i18 = i12;
                if ((i12 & 4793491) != 4793490) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c0VarR.h(z14, i18 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i20 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if ((i11 & 16) != 0) {
                            i18 &= -57345;
                            q3VarU = kh.f30051a.u(c0VarR, 6);
                        }
                        if ((i11 & 32) != 0) {
                            i19 = i18 & (-458753);
                            oiVarK = kh.f30051a.k(c0VarR, 6);
                        } else {
                            i19 = i18;
                        }
                        if (i15 != 0) {
                            jVar4 = null;
                            z16 = z13;
                            q3Var3 = q3VarU;
                            oiVar3 = oiVarK;
                        } else {
                            z16 = z13;
                            oiVar3 = oiVarK;
                            jVar4 = jVar2;
                            q3Var3 = q3VarU;
                        }
                    } else {
                        if (i20 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            z13 = true;
                        }
                        if ((i11 & 16) != 0) {
                            i18 &= -57345;
                            q3VarU = kh.f30051a.u(c0VarR, 6);
                        }
                        if ((i11 & 32) != 0) {
                            i19 = i18 & (-458753);
                            oiVarK = kh.f30051a.k(c0VarR, 6);
                        } else {
                            i19 = i18;
                        }
                        if (i15 != 0) {
                            jVar4 = null;
                            z16 = z13;
                            q3Var3 = q3VarU;
                            oiVar3 = oiVarK;
                        } else {
                            z16 = z13;
                            oiVar3 = oiVarK;
                            jVar4 = jVar2;
                            q3Var3 = q3VarU;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-713829427, i19, -1, "androidx.compose.material3.FilledIconToggleButton (IconButton.kt:438)");
                    }
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = new Function1() { // from class: androidx.compose.material3.th
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return ei.w((androidx.compose.ui.semantics.e0) obj);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    int i217 = i19 << 3;
                    c0Var2 = c0VarR;
                    X(z12, function3, androidx.compose.ui.semantics.t.f(a0Var4, false, (Function1) objI0, 1, null), z16, q3Var3, oiVar3, null, jVar4, function2, c0Var2, (i19 & 14) | 1572864 | (i19 & com.planner5d.library.engine.input.f.b.B) | (i19 & 7168) | (57344 & i19) | (458752 & i19) | (29360128 & i217) | (i217 & 234881024));
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var4;
                    z15 = z16;
                    q3Var2 = q3Var3;
                    oiVar2 = oiVar3;
                    jVar3 = jVar4;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var3 = a0Var2;
                    z15 = z13;
                    q3Var2 = q3VarU;
                    oiVar2 = oiVarK;
                    jVar3 = jVar2;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.uh
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ei.x(z10, function1, a0Var3, z15, q3Var2, oiVar2, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 12582912;
            i18 = i12;
            if ((i12 & 4793491) != 4793490) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c0VarR.h(z14, i18 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i20 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    }
                    if ((i11 & 16) != 0) {
                        i18 &= -57345;
                        q3VarU = kh.f30051a.u(c0VarR, 6);
                    }
                    if ((i11 & 32) != 0) {
                        i19 = i18 & (-458753);
                        oiVarK = kh.f30051a.k(c0VarR, 6);
                    } else {
                        i19 = i18;
                    }
                    if (i15 != 0) {
                        jVar4 = null;
                        z16 = z13;
                        q3Var3 = q3VarU;
                        oiVar3 = oiVarK;
                    } else {
                        z16 = z13;
                        oiVar3 = oiVarK;
                        jVar4 = jVar2;
                        q3Var3 = q3VarU;
                    }
                } else {
                    if (i20 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    }
                    if ((i11 & 16) != 0) {
                        i18 &= -57345;
                        q3VarU = kh.f30051a.u(c0VarR, 6);
                    }
                    if ((i11 & 32) != 0) {
                        i19 = i18 & (-458753);
                        oiVarK = kh.f30051a.k(c0VarR, 6);
                    } else {
                        i19 = i18;
                    }
                    if (i15 != 0) {
                        jVar4 = null;
                        z16 = z13;
                        q3Var3 = q3VarU;
                        oiVar3 = oiVarK;
                    } else {
                        z16 = z13;
                        oiVar3 = oiVarK;
                        jVar4 = jVar2;
                        q3Var3 = q3VarU;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-713829427, i19, -1, "androidx.compose.material3.FilledIconToggleButton (IconButton.kt:438)");
                }
                objI0 = c0VarR.i0();
                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = new Function1() { // from class: androidx.compose.material3.th
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return ei.w((androidx.compose.ui.semantics.e0) obj);
                        }
                    };
                    c0VarR.Y(objI0);
                }
                int i218 = i19 << 3;
                c0Var2 = c0VarR;
                X(z12, function3, androidx.compose.ui.semantics.t.f(a0Var4, false, (Function1) objI0, 1, null), z16, q3Var3, oiVar3, null, jVar4, function2, c0Var2, (i19 & 14) | 1572864 | (i19 & com.planner5d.library.engine.input.f.b.B) | (i19 & 7168) | (57344 & i19) | (458752 & i19) | (29360128 & i218) | (i218 & 234881024));
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var4;
                z15 = z16;
                q3Var2 = q3Var3;
                oiVar2 = oiVar3;
                jVar3 = jVar4;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var3 = a0Var2;
                z15 = z13;
                q3Var2 = q3VarU;
                oiVar2 = oiVarK;
                jVar3 = jVar2;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.uh
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ei.x(z10, function1, a0Var3, z15, q3Var2, oiVar2, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 1572864;
        jVar2 = jVar;
        if ((i11 & 128) != 0) {
            if ((i10 & 12582912) == 0) {
                if (c0VarR.k0(function2)) {
                    i17 = 8388608;
                } else {
                    i17 = 4194304;
                }
                i12 |= i17;
            }
            i18 = i12;
            if ((i12 & 4793491) != 4793490) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c0VarR.h(z14, i18 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i20 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    }
                    if ((i11 & 16) != 0) {
                        i18 &= -57345;
                        q3VarU = kh.f30051a.u(c0VarR, 6);
                    }
                    if ((i11 & 32) != 0) {
                        i19 = i18 & (-458753);
                        oiVarK = kh.f30051a.k(c0VarR, 6);
                    } else {
                        i19 = i18;
                    }
                    if (i15 != 0) {
                        jVar4 = null;
                        z16 = z13;
                        q3Var3 = q3VarU;
                        oiVar3 = oiVarK;
                    } else {
                        z16 = z13;
                        oiVar3 = oiVarK;
                        jVar4 = jVar2;
                        q3Var3 = q3VarU;
                    }
                } else {
                    if (i20 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        z13 = true;
                    }
                    if ((i11 & 16) != 0) {
                        i18 &= -57345;
                        q3VarU = kh.f30051a.u(c0VarR, 6);
                    }
                    if ((i11 & 32) != 0) {
                        i19 = i18 & (-458753);
                        oiVarK = kh.f30051a.k(c0VarR, 6);
                    } else {
                        i19 = i18;
                    }
                    if (i15 != 0) {
                        jVar4 = null;
                        z16 = z13;
                        q3Var3 = q3VarU;
                        oiVar3 = oiVarK;
                    } else {
                        z16 = z13;
                        oiVar3 = oiVarK;
                        jVar4 = jVar2;
                        q3Var3 = q3VarU;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-713829427, i19, -1, "androidx.compose.material3.FilledIconToggleButton (IconButton.kt:438)");
                }
                objI0 = c0VarR.i0();
                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = new Function1() { // from class: androidx.compose.material3.th
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return ei.w((androidx.compose.ui.semantics.e0) obj);
                        }
                    };
                    c0VarR.Y(objI0);
                }
                int i219 = i19 << 3;
                c0Var2 = c0VarR;
                X(z12, function3, androidx.compose.ui.semantics.t.f(a0Var4, false, (Function1) objI0, 1, null), z16, q3Var3, oiVar3, null, jVar4, function2, c0Var2, (i19 & 14) | 1572864 | (i19 & com.planner5d.library.engine.input.f.b.B) | (i19 & 7168) | (57344 & i19) | (458752 & i19) | (29360128 & i219) | (i219 & 234881024));
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var4;
                z15 = z16;
                q3Var2 = q3Var3;
                oiVar2 = oiVar3;
                jVar3 = jVar4;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var3 = a0Var2;
                z15 = z13;
                q3Var2 = q3VarU;
                oiVar2 = oiVarK;
                jVar3 = jVar2;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.uh
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ei.x(z10, function1, a0Var3, z15, q3Var2, oiVar2, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 12582912;
        i18 = i12;
        if ((i12 & 4793491) != 4793490) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c0VarR.h(z14, i18 & 1)) {
            c0VarR.l0();
            if ((i10 & 1) != 0) {
                if (i20 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if (i13 != 0) {
                    z13 = true;
                }
                if ((i11 & 16) != 0) {
                    i18 &= -57345;
                    q3VarU = kh.f30051a.u(c0VarR, 6);
                }
                if ((i11 & 32) != 0) {
                    i19 = i18 & (-458753);
                    oiVarK = kh.f30051a.k(c0VarR, 6);
                } else {
                    i19 = i18;
                }
                if (i15 != 0) {
                    jVar4 = null;
                    z16 = z13;
                    q3Var3 = q3VarU;
                    oiVar3 = oiVarK;
                } else {
                    z16 = z13;
                    oiVar3 = oiVarK;
                    jVar4 = jVar2;
                    q3Var3 = q3VarU;
                }
            } else {
                if (i20 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if (i13 != 0) {
                    z13 = true;
                }
                if ((i11 & 16) != 0) {
                    i18 &= -57345;
                    q3VarU = kh.f30051a.u(c0VarR, 6);
                }
                if ((i11 & 32) != 0) {
                    i19 = i18 & (-458753);
                    oiVarK = kh.f30051a.k(c0VarR, 6);
                } else {
                    i19 = i18;
                }
                if (i15 != 0) {
                    jVar4 = null;
                    z16 = z13;
                    q3Var3 = q3VarU;
                    oiVar3 = oiVarK;
                } else {
                    z16 = z13;
                    oiVar3 = oiVarK;
                    jVar4 = jVar2;
                    q3Var3 = q3VarU;
                }
            }
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-713829427, i19, -1, "androidx.compose.material3.FilledIconToggleButton (IconButton.kt:438)");
            }
            objI0 = c0VarR.i0();
            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new Function1() { // from class: androidx.compose.material3.th
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return ei.w((androidx.compose.ui.semantics.e0) obj);
                    }
                };
                c0VarR.Y(objI0);
            }
            int i2110 = i19 << 3;
            c0Var2 = c0VarR;
            X(z12, function3, androidx.compose.ui.semantics.t.f(a0Var4, false, (Function1) objI0, 1, null), z16, q3Var3, oiVar3, null, jVar4, function2, c0Var2, (i19 & 14) | 1572864 | (i19 & com.planner5d.library.engine.input.f.b.B) | (i19 & 7168) | (57344 & i19) | (458752 & i19) | (29360128 & i2110) | (i2110 & 234881024));
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            a0Var3 = a0Var4;
            z15 = z16;
            q3Var2 = q3Var3;
            oiVar2 = oiVar3;
            jVar3 = jVar4;
        } else {
            c0Var2 = c0VarR;
            c0Var2.u();
            a0Var3 = a0Var2;
            z15 = z13;
            q3Var2 = q3VarU;
            oiVar2 = oiVarK;
            jVar3 = jVar2;
        }
        s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.uh
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ei.x(z10, function1, a0Var3, z15, q3Var2, oiVar2, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit w(androidx.compose.ui.semantics.e0 e0Var) {
        androidx.compose.ui.semantics.b0.K1(e0Var, androidx.compose.ui.semantics.j.f41124b.c());
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit x(boolean z10, Function1 function1, androidx.compose.ui.a0 a0Var, boolean z11, androidx.compose.ui.graphics.q3 q3Var, oi oiVar, androidx.compose.foundation.interaction.j jVar, Function2 function2, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        v(z10, function1, a0Var, z11, q3Var, oiVar, jVar, function2, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x011f  */
    /* JADX WARN: Code duplicated, block: B:104:0x0128  */
    /* JADX WARN: Code duplicated, block: B:107:0x0136  */
    /* JADX WARN: Code duplicated, block: B:109:0x0140  */
    /* JADX WARN: Code duplicated, block: B:111:0x0148  */
    /* JADX WARN: Code duplicated, block: B:114:0x0155  */
    /* JADX WARN: Code duplicated, block: B:117:0x018a  */
    /* JADX WARN: Code duplicated, block: B:119:0x0193  */
    /* JADX WARN: Code duplicated, block: B:122:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0048  */
    /* JADX WARN: Code duplicated, block: B:28:0x004d  */
    /* JADX WARN: Code duplicated, block: B:30:0x0051  */
    /* JADX WARN: Code duplicated, block: B:32:0x0059  */
    /* JADX WARN: Code duplicated, block: B:33:0x005c  */
    /* JADX WARN: Code duplicated, block: B:37:0x0063  */
    /* JADX WARN: Code duplicated, block: B:39:0x0067  */
    /* JADX WARN: Code duplicated, block: B:41:0x006f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0072  */
    /* JADX WARN: Code duplicated, block: B:45:0x007a  */
    /* JADX WARN: Code duplicated, block: B:48:0x0080  */
    /* JADX WARN: Code duplicated, block: B:50:0x0084  */
    /* JADX WARN: Code duplicated, block: B:52:0x008c  */
    /* JADX WARN: Code duplicated, block: B:53:0x008f  */
    /* JADX WARN: Code duplicated, block: B:56:0x0095  */
    /* JADX WARN: Code duplicated, block: B:59:0x009f  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:76:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:87:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:97:0x0116 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:98:0x0118  */
    /* JADX WARN: Code duplicated, block: B:99:0x011b  */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void y(@NotNull final Function0<Unit> function0, @Nullable androidx.compose.ui.a0 a0Var, boolean z10, @Nullable androidx.compose.ui.graphics.q3 q3Var, @Nullable jh jhVar, @Nullable androidx.compose.foundation.interaction.j jVar, @NotNull final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        Function0<Unit> function1;
        int i12;
        androidx.compose.ui.a0 a0Var2;
        int i13;
        boolean z11;
        int i14;
        androidx.compose.ui.graphics.q3 q3VarU;
        jh jhVarM;
        int i15;
        androidx.compose.foundation.interaction.j jVar2;
        int i16;
        int i17;
        boolean z12;
        androidx.compose.runtime.c0 c0Var2;
        final androidx.compose.ui.a0 a0Var3;
        final boolean z13;
        final androidx.compose.ui.graphics.q3 q3Var2;
        final jh jhVar2;
        final androidx.compose.foundation.interaction.j jVar3;
        androidx.compose.runtime.s5 s5VarT;
        androidx.compose.ui.a0 a0Var4;
        androidx.compose.foundation.interaction.j jVar4;
        jh jhVar3;
        androidx.compose.ui.a0 a0Var5;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-399178234);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
            function1 = function0;
        } else {
            function1 = function0;
            if ((i10 & 6) == 0) {
                i12 = (c0VarR.k0(function1) ? 4 : 2) | i10;
            } else {
                i12 = i10;
            }
        }
        int i18 = i11 & 2;
        if (i18 == 0) {
            if ((i10 & 48) == 0) {
                a0Var2 = a0Var;
                i12 |= c0VarR.D(a0Var2) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                    z11 = z10;
                    if (c0VarR.G(z11)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                if ((i10 & 3072) == 0) {
                    if ((i11 & 8) == 0) {
                        q3VarU = q3Var;
                        int i19 = c0VarR.D(q3VarU) ? 2048 : 1024;
                        i12 |= i19;
                    } else {
                        q3VarU = q3Var;
                    }
                    i12 |= i19;
                } else {
                    q3VarU = q3Var;
                }
                if ((i10 & 24576) == 0) {
                    if ((i11 & 16) == 0) {
                        jhVarM = jhVar;
                        int i20 = c0VarR.D(jhVarM) ? 16384 : 8192;
                        i12 |= i20;
                    } else {
                        jhVarM = jhVar;
                    }
                    i12 |= i20;
                } else {
                    jhVarM = jhVar;
                }
                i15 = i11 & 32;
                if (i15 != 0) {
                    if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        jVar2 = jVar;
                        if (c0VarR.D(jVar2)) {
                            i16 = 131072;
                        } else {
                            i16 = 65536;
                        }
                        i12 |= i16;
                    }
                    if ((i11 & 64) != 0) {
                        if ((i10 & 1572864) == 0) {
                            if (c0VarR.k0(function2)) {
                                i17 = 1048576;
                            } else {
                                i17 = 524288;
                            }
                            i12 |= i17;
                        }
                        if ((599187 & i12) != 599186) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (c0VarR.h(z12, i12 & 1)) {
                            c0VarR.l0();
                            if ((i10 & 1) != 0 || c0VarR.y()) {
                                if (i18 != 0) {
                                    a0Var4 = androidx.compose.ui.a0.E;
                                } else {
                                    a0Var4 = a0Var2;
                                }
                                if (i13 != 0) {
                                    z11 = true;
                                }
                                if ((i11 & 8) != 0) {
                                    i12 &= -7169;
                                    q3VarU = kh.f30051a.u(c0VarR, 6);
                                }
                                if ((i11 & 16) != 0) {
                                    i12 &= -57345;
                                    jhVarM = kh.f30051a.m(c0VarR, 6);
                                }
                                if (i15 != 0) {
                                    jVar4 = null;
                                } else {
                                    jVar4 = jVar2;
                                }
                                jhVar3 = jhVarM;
                                a0Var5 = a0Var4;
                            } else {
                                c0VarR.u();
                                if ((i11 & 8) != 0) {
                                    i12 &= -7169;
                                }
                                if ((i11 & 16) != 0) {
                                    i12 &= -57345;
                                }
                                z11 = z11;
                                q3VarU = q3VarU;
                                jVar4 = jVar2;
                                jhVar3 = jhVarM;
                                a0Var5 = a0Var2;
                            }
                            c0VarR.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(-399178234, i12, -1, "androidx.compose.material3.FilledTonalIconButton (IconButton.kt:495)");
                            }
                            int i21 = (i12 & 14) | androidx.profileinstaller.n.c.f73814m | (i12 & com.planner5d.library.engine.input.f.b.B) | (i12 & 896) | (i12 & 7168) | (57344 & i12);
                            int i22 = i12 << 3;
                            c0Var2 = c0VarR;
                            U(function1, a0Var5, z11, q3VarU, jhVar3, null, jVar4, function2, c0Var2, i21 | (3670016 & i22) | (i22 & 29360128));
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            a0Var3 = a0Var5;
                            z13 = z11;
                            q3Var2 = q3VarU;
                            jhVar2 = jhVar3;
                            jVar3 = jVar4;
                        } else {
                            c0Var2 = c0VarR;
                            c0Var2.u();
                            a0Var3 = a0Var2;
                            z13 = z11;
                            q3Var2 = q3VarU;
                            jhVar2 = jhVarM;
                            jVar3 = jVar2;
                        }
                        s5VarT = c0Var2.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material3.ci
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return ei.z(function0, a0Var3, z13, q3Var2, jhVar2, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i12 |= 1572864;
                    if ((599187 & i12) != 599186) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (c0VarR.h(z12, i12 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i18 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            }
                            if ((i11 & 8) != 0) {
                                i12 &= -7169;
                                q3VarU = kh.f30051a.u(c0VarR, 6);
                            }
                            if ((i11 & 16) != 0) {
                                i12 &= -57345;
                                jhVarM = kh.f30051a.m(c0VarR, 6);
                            }
                            if (i15 != 0) {
                                jVar4 = null;
                            } else {
                                jVar4 = jVar2;
                            }
                            jhVar3 = jhVarM;
                            a0Var5 = a0Var4;
                        } else {
                            if (i18 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            }
                            if ((i11 & 8) != 0) {
                                i12 &= -7169;
                                q3VarU = kh.f30051a.u(c0VarR, 6);
                            }
                            if ((i11 & 16) != 0) {
                                i12 &= -57345;
                                jhVarM = kh.f30051a.m(c0VarR, 6);
                            }
                            if (i15 != 0) {
                                jVar4 = null;
                            } else {
                                jVar4 = jVar2;
                            }
                            jhVar3 = jhVarM;
                            a0Var5 = a0Var4;
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-399178234, i12, -1, "androidx.compose.material3.FilledTonalIconButton (IconButton.kt:495)");
                        }
                        int i23 = (i12 & 14) | androidx.profileinstaller.n.c.f73814m | (i12 & com.planner5d.library.engine.input.f.b.B) | (i12 & 896) | (i12 & 7168) | (57344 & i12);
                        int i24 = i12 << 3;
                        c0Var2 = c0VarR;
                        U(function1, a0Var5, z11, q3VarU, jhVar3, null, jVar4, function2, c0Var2, i23 | (3670016 & i24) | (i24 & 29360128));
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var5;
                        z13 = z11;
                        q3Var2 = q3VarU;
                        jhVar2 = jhVar3;
                        jVar3 = jVar4;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        a0Var3 = a0Var2;
                        z13 = z11;
                        q3Var2 = q3VarU;
                        jhVar2 = jhVarM;
                        jVar3 = jVar2;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.ci
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return ei.z(function0, a0Var3, z13, q3Var2, jhVar2, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= androidx.profileinstaller.n.c.f73814m;
                jVar2 = jVar;
                if ((i11 & 64) != 0) {
                    if ((i10 & 1572864) == 0) {
                        if (c0VarR.k0(function2)) {
                            i17 = 1048576;
                        } else {
                            i17 = 524288;
                        }
                        i12 |= i17;
                    }
                    if ((599187 & i12) != 599186) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (c0VarR.h(z12, i12 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i18 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            }
                            if ((i11 & 8) != 0) {
                                i12 &= -7169;
                                q3VarU = kh.f30051a.u(c0VarR, 6);
                            }
                            if ((i11 & 16) != 0) {
                                i12 &= -57345;
                                jhVarM = kh.f30051a.m(c0VarR, 6);
                            }
                            if (i15 != 0) {
                                jVar4 = null;
                            } else {
                                jVar4 = jVar2;
                            }
                            jhVar3 = jhVarM;
                            a0Var5 = a0Var4;
                        } else {
                            if (i18 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            }
                            if ((i11 & 8) != 0) {
                                i12 &= -7169;
                                q3VarU = kh.f30051a.u(c0VarR, 6);
                            }
                            if ((i11 & 16) != 0) {
                                i12 &= -57345;
                                jhVarM = kh.f30051a.m(c0VarR, 6);
                            }
                            if (i15 != 0) {
                                jVar4 = null;
                            } else {
                                jVar4 = jVar2;
                            }
                            jhVar3 = jhVarM;
                            a0Var5 = a0Var4;
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-399178234, i12, -1, "androidx.compose.material3.FilledTonalIconButton (IconButton.kt:495)");
                        }
                        int i25 = (i12 & 14) | androidx.profileinstaller.n.c.f73814m | (i12 & com.planner5d.library.engine.input.f.b.B) | (i12 & 896) | (i12 & 7168) | (57344 & i12);
                        int i26 = i12 << 3;
                        c0Var2 = c0VarR;
                        U(function1, a0Var5, z11, q3VarU, jhVar3, null, jVar4, function2, c0Var2, i25 | (3670016 & i26) | (i26 & 29360128));
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var5;
                        z13 = z11;
                        q3Var2 = q3VarU;
                        jhVar2 = jhVar3;
                        jVar3 = jVar4;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        a0Var3 = a0Var2;
                        z13 = z11;
                        q3Var2 = q3VarU;
                        jhVar2 = jhVarM;
                        jVar3 = jVar2;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.ci
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return ei.z(function0, a0Var3, z13, q3Var2, jhVar2, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 1572864;
                if ((599187 & i12) != 599186) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i18 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            q3VarU = kh.f30051a.u(c0VarR, 6);
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                            jhVarM = kh.f30051a.m(c0VarR, 6);
                        }
                        if (i15 != 0) {
                            jVar4 = null;
                        } else {
                            jVar4 = jVar2;
                        }
                        jhVar3 = jhVarM;
                        a0Var5 = a0Var4;
                    } else {
                        if (i18 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            q3VarU = kh.f30051a.u(c0VarR, 6);
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                            jhVarM = kh.f30051a.m(c0VarR, 6);
                        }
                        if (i15 != 0) {
                            jVar4 = null;
                        } else {
                            jVar4 = jVar2;
                        }
                        jhVar3 = jhVarM;
                        a0Var5 = a0Var4;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-399178234, i12, -1, "androidx.compose.material3.FilledTonalIconButton (IconButton.kt:495)");
                    }
                    int i27 = (i12 & 14) | androidx.profileinstaller.n.c.f73814m | (i12 & com.planner5d.library.engine.input.f.b.B) | (i12 & 896) | (i12 & 7168) | (57344 & i12);
                    int i28 = i12 << 3;
                    c0Var2 = c0VarR;
                    U(function1, a0Var5, z11, q3VarU, jhVar3, null, jVar4, function2, c0Var2, i27 | (3670016 & i28) | (i28 & 29360128));
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var5;
                    z13 = z11;
                    q3Var2 = q3VarU;
                    jhVar2 = jhVar3;
                    jVar3 = jVar4;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var3 = a0Var2;
                    z13 = z11;
                    q3Var2 = q3VarU;
                    jhVar2 = jhVarM;
                    jVar3 = jVar2;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.ci
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ei.z(function0, a0Var3, z13, q3Var2, jhVar2, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= androidx.media3.exoplayer.a5.S0;
            z11 = z10;
            if ((i10 & 3072) == 0) {
                if ((i11 & 8) == 0) {
                    q3VarU = q3Var;
                    if (c0VarR.D(q3VarU)) {
                    }
                    i12 |= i19;
                } else {
                    q3VarU = q3Var;
                }
                i12 |= i19;
            } else {
                q3VarU = q3Var;
            }
            if ((i10 & 24576) == 0) {
                if ((i11 & 16) == 0) {
                    jhVarM = jhVar;
                    if (c0VarR.D(jhVarM)) {
                    }
                    i12 |= i20;
                } else {
                    jhVarM = jhVar;
                }
                i12 |= i20;
            } else {
                jhVarM = jhVar;
            }
            i15 = i11 & 32;
            if (i15 != 0) {
                if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    jVar2 = jVar;
                    if (c0VarR.D(jVar2)) {
                        i16 = 131072;
                    } else {
                        i16 = 65536;
                    }
                    i12 |= i16;
                }
                if ((i11 & 64) != 0) {
                    if ((i10 & 1572864) == 0) {
                        if (c0VarR.k0(function2)) {
                            i17 = 1048576;
                        } else {
                            i17 = 524288;
                        }
                        i12 |= i17;
                    }
                    if ((599187 & i12) != 599186) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (c0VarR.h(z12, i12 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i18 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            }
                            if ((i11 & 8) != 0) {
                                i12 &= -7169;
                                q3VarU = kh.f30051a.u(c0VarR, 6);
                            }
                            if ((i11 & 16) != 0) {
                                i12 &= -57345;
                                jhVarM = kh.f30051a.m(c0VarR, 6);
                            }
                            if (i15 != 0) {
                                jVar4 = null;
                            } else {
                                jVar4 = jVar2;
                            }
                            jhVar3 = jhVarM;
                            a0Var5 = a0Var4;
                        } else {
                            if (i18 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            }
                            if ((i11 & 8) != 0) {
                                i12 &= -7169;
                                q3VarU = kh.f30051a.u(c0VarR, 6);
                            }
                            if ((i11 & 16) != 0) {
                                i12 &= -57345;
                                jhVarM = kh.f30051a.m(c0VarR, 6);
                            }
                            if (i15 != 0) {
                                jVar4 = null;
                            } else {
                                jVar4 = jVar2;
                            }
                            jhVar3 = jhVarM;
                            a0Var5 = a0Var4;
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-399178234, i12, -1, "androidx.compose.material3.FilledTonalIconButton (IconButton.kt:495)");
                        }
                        int i29 = (i12 & 14) | androidx.profileinstaller.n.c.f73814m | (i12 & com.planner5d.library.engine.input.f.b.B) | (i12 & 896) | (i12 & 7168) | (57344 & i12);
                        int i210 = i12 << 3;
                        c0Var2 = c0VarR;
                        U(function1, a0Var5, z11, q3VarU, jhVar3, null, jVar4, function2, c0Var2, i29 | (3670016 & i210) | (i210 & 29360128));
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var5;
                        z13 = z11;
                        q3Var2 = q3VarU;
                        jhVar2 = jhVar3;
                        jVar3 = jVar4;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        a0Var3 = a0Var2;
                        z13 = z11;
                        q3Var2 = q3VarU;
                        jhVar2 = jhVarM;
                        jVar3 = jVar2;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.ci
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return ei.z(function0, a0Var3, z13, q3Var2, jhVar2, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 1572864;
                if ((599187 & i12) != 599186) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i18 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            q3VarU = kh.f30051a.u(c0VarR, 6);
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                            jhVarM = kh.f30051a.m(c0VarR, 6);
                        }
                        if (i15 != 0) {
                            jVar4 = null;
                        } else {
                            jVar4 = jVar2;
                        }
                        jhVar3 = jhVarM;
                        a0Var5 = a0Var4;
                    } else {
                        if (i18 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            q3VarU = kh.f30051a.u(c0VarR, 6);
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                            jhVarM = kh.f30051a.m(c0VarR, 6);
                        }
                        if (i15 != 0) {
                            jVar4 = null;
                        } else {
                            jVar4 = jVar2;
                        }
                        jhVar3 = jhVarM;
                        a0Var5 = a0Var4;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-399178234, i12, -1, "androidx.compose.material3.FilledTonalIconButton (IconButton.kt:495)");
                    }
                    int i211 = (i12 & 14) | androidx.profileinstaller.n.c.f73814m | (i12 & com.planner5d.library.engine.input.f.b.B) | (i12 & 896) | (i12 & 7168) | (57344 & i12);
                    int i212 = i12 << 3;
                    c0Var2 = c0VarR;
                    U(function1, a0Var5, z11, q3VarU, jhVar3, null, jVar4, function2, c0Var2, i211 | (3670016 & i212) | (i212 & 29360128));
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var5;
                    z13 = z11;
                    q3Var2 = q3VarU;
                    jhVar2 = jhVar3;
                    jVar3 = jVar4;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var3 = a0Var2;
                    z13 = z11;
                    q3Var2 = q3VarU;
                    jhVar2 = jhVarM;
                    jVar3 = jVar2;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.ci
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ei.z(function0, a0Var3, z13, q3Var2, jhVar2, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= androidx.profileinstaller.n.c.f73814m;
            jVar2 = jVar;
            if ((i11 & 64) != 0) {
                if ((i10 & 1572864) == 0) {
                    if (c0VarR.k0(function2)) {
                        i17 = 1048576;
                    } else {
                        i17 = 524288;
                    }
                    i12 |= i17;
                }
                if ((599187 & i12) != 599186) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i18 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            q3VarU = kh.f30051a.u(c0VarR, 6);
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                            jhVarM = kh.f30051a.m(c0VarR, 6);
                        }
                        if (i15 != 0) {
                            jVar4 = null;
                        } else {
                            jVar4 = jVar2;
                        }
                        jhVar3 = jhVarM;
                        a0Var5 = a0Var4;
                    } else {
                        if (i18 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            q3VarU = kh.f30051a.u(c0VarR, 6);
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                            jhVarM = kh.f30051a.m(c0VarR, 6);
                        }
                        if (i15 != 0) {
                            jVar4 = null;
                        } else {
                            jVar4 = jVar2;
                        }
                        jhVar3 = jhVarM;
                        a0Var5 = a0Var4;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-399178234, i12, -1, "androidx.compose.material3.FilledTonalIconButton (IconButton.kt:495)");
                    }
                    int i213 = (i12 & 14) | androidx.profileinstaller.n.c.f73814m | (i12 & com.planner5d.library.engine.input.f.b.B) | (i12 & 896) | (i12 & 7168) | (57344 & i12);
                    int i214 = i12 << 3;
                    c0Var2 = c0VarR;
                    U(function1, a0Var5, z11, q3VarU, jhVar3, null, jVar4, function2, c0Var2, i213 | (3670016 & i214) | (i214 & 29360128));
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var5;
                    z13 = z11;
                    q3Var2 = q3VarU;
                    jhVar2 = jhVar3;
                    jVar3 = jVar4;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var3 = a0Var2;
                    z13 = z11;
                    q3Var2 = q3VarU;
                    jhVar2 = jhVarM;
                    jVar3 = jVar2;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.ci
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ei.z(function0, a0Var3, z13, q3Var2, jhVar2, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 1572864;
            if ((599187 & i12) != 599186) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        q3VarU = kh.f30051a.u(c0VarR, 6);
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        jhVarM = kh.f30051a.m(c0VarR, 6);
                    }
                    if (i15 != 0) {
                        jVar4 = null;
                    } else {
                        jVar4 = jVar2;
                    }
                    jhVar3 = jhVarM;
                    a0Var5 = a0Var4;
                } else {
                    if (i18 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        q3VarU = kh.f30051a.u(c0VarR, 6);
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        jhVarM = kh.f30051a.m(c0VarR, 6);
                    }
                    if (i15 != 0) {
                        jVar4 = null;
                    } else {
                        jVar4 = jVar2;
                    }
                    jhVar3 = jhVarM;
                    a0Var5 = a0Var4;
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-399178234, i12, -1, "androidx.compose.material3.FilledTonalIconButton (IconButton.kt:495)");
                }
                int i215 = (i12 & 14) | androidx.profileinstaller.n.c.f73814m | (i12 & com.planner5d.library.engine.input.f.b.B) | (i12 & 896) | (i12 & 7168) | (57344 & i12);
                int i216 = i12 << 3;
                c0Var2 = c0VarR;
                U(function1, a0Var5, z11, q3VarU, jhVar3, null, jVar4, function2, c0Var2, i215 | (3670016 & i216) | (i216 & 29360128));
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var5;
                z13 = z11;
                q3Var2 = q3VarU;
                jhVar2 = jhVar3;
                jVar3 = jVar4;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var3 = a0Var2;
                z13 = z11;
                q3Var2 = q3VarU;
                jhVar2 = jhVarM;
                jVar3 = jVar2;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.ci
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ei.z(function0, a0Var3, z13, q3Var2, jhVar2, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 48;
        a0Var2 = a0Var;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                z11 = z10;
                if (c0VarR.G(z11)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            if ((i10 & 3072) == 0) {
                if ((i11 & 8) == 0) {
                    q3VarU = q3Var;
                    if (c0VarR.D(q3VarU)) {
                    }
                    i12 |= i19;
                } else {
                    q3VarU = q3Var;
                }
                i12 |= i19;
            } else {
                q3VarU = q3Var;
            }
            if ((i10 & 24576) == 0) {
                if ((i11 & 16) == 0) {
                    jhVarM = jhVar;
                    if (c0VarR.D(jhVarM)) {
                    }
                    i12 |= i20;
                } else {
                    jhVarM = jhVar;
                }
                i12 |= i20;
            } else {
                jhVarM = jhVar;
            }
            i15 = i11 & 32;
            if (i15 != 0) {
                if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    jVar2 = jVar;
                    if (c0VarR.D(jVar2)) {
                        i16 = 131072;
                    } else {
                        i16 = 65536;
                    }
                    i12 |= i16;
                }
                if ((i11 & 64) != 0) {
                    if ((i10 & 1572864) == 0) {
                        if (c0VarR.k0(function2)) {
                            i17 = 1048576;
                        } else {
                            i17 = 524288;
                        }
                        i12 |= i17;
                    }
                    if ((599187 & i12) != 599186) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (c0VarR.h(z12, i12 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i18 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            }
                            if ((i11 & 8) != 0) {
                                i12 &= -7169;
                                q3VarU = kh.f30051a.u(c0VarR, 6);
                            }
                            if ((i11 & 16) != 0) {
                                i12 &= -57345;
                                jhVarM = kh.f30051a.m(c0VarR, 6);
                            }
                            if (i15 != 0) {
                                jVar4 = null;
                            } else {
                                jVar4 = jVar2;
                            }
                            jhVar3 = jhVarM;
                            a0Var5 = a0Var4;
                        } else {
                            if (i18 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            }
                            if ((i11 & 8) != 0) {
                                i12 &= -7169;
                                q3VarU = kh.f30051a.u(c0VarR, 6);
                            }
                            if ((i11 & 16) != 0) {
                                i12 &= -57345;
                                jhVarM = kh.f30051a.m(c0VarR, 6);
                            }
                            if (i15 != 0) {
                                jVar4 = null;
                            } else {
                                jVar4 = jVar2;
                            }
                            jhVar3 = jhVarM;
                            a0Var5 = a0Var4;
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-399178234, i12, -1, "androidx.compose.material3.FilledTonalIconButton (IconButton.kt:495)");
                        }
                        int i217 = (i12 & 14) | androidx.profileinstaller.n.c.f73814m | (i12 & com.planner5d.library.engine.input.f.b.B) | (i12 & 896) | (i12 & 7168) | (57344 & i12);
                        int i218 = i12 << 3;
                        c0Var2 = c0VarR;
                        U(function1, a0Var5, z11, q3VarU, jhVar3, null, jVar4, function2, c0Var2, i217 | (3670016 & i218) | (i218 & 29360128));
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var5;
                        z13 = z11;
                        q3Var2 = q3VarU;
                        jhVar2 = jhVar3;
                        jVar3 = jVar4;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        a0Var3 = a0Var2;
                        z13 = z11;
                        q3Var2 = q3VarU;
                        jhVar2 = jhVarM;
                        jVar3 = jVar2;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.ci
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return ei.z(function0, a0Var3, z13, q3Var2, jhVar2, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 1572864;
                if ((599187 & i12) != 599186) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i18 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            q3VarU = kh.f30051a.u(c0VarR, 6);
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                            jhVarM = kh.f30051a.m(c0VarR, 6);
                        }
                        if (i15 != 0) {
                            jVar4 = null;
                        } else {
                            jVar4 = jVar2;
                        }
                        jhVar3 = jhVarM;
                        a0Var5 = a0Var4;
                    } else {
                        if (i18 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            q3VarU = kh.f30051a.u(c0VarR, 6);
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                            jhVarM = kh.f30051a.m(c0VarR, 6);
                        }
                        if (i15 != 0) {
                            jVar4 = null;
                        } else {
                            jVar4 = jVar2;
                        }
                        jhVar3 = jhVarM;
                        a0Var5 = a0Var4;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-399178234, i12, -1, "androidx.compose.material3.FilledTonalIconButton (IconButton.kt:495)");
                    }
                    int i219 = (i12 & 14) | androidx.profileinstaller.n.c.f73814m | (i12 & com.planner5d.library.engine.input.f.b.B) | (i12 & 896) | (i12 & 7168) | (57344 & i12);
                    int i2110 = i12 << 3;
                    c0Var2 = c0VarR;
                    U(function1, a0Var5, z11, q3VarU, jhVar3, null, jVar4, function2, c0Var2, i219 | (3670016 & i2110) | (i2110 & 29360128));
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var5;
                    z13 = z11;
                    q3Var2 = q3VarU;
                    jhVar2 = jhVar3;
                    jVar3 = jVar4;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var3 = a0Var2;
                    z13 = z11;
                    q3Var2 = q3VarU;
                    jhVar2 = jhVarM;
                    jVar3 = jVar2;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.ci
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ei.z(function0, a0Var3, z13, q3Var2, jhVar2, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= androidx.profileinstaller.n.c.f73814m;
            jVar2 = jVar;
            if ((i11 & 64) != 0) {
                if ((i10 & 1572864) == 0) {
                    if (c0VarR.k0(function2)) {
                        i17 = 1048576;
                    } else {
                        i17 = 524288;
                    }
                    i12 |= i17;
                }
                if ((599187 & i12) != 599186) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i18 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            q3VarU = kh.f30051a.u(c0VarR, 6);
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                            jhVarM = kh.f30051a.m(c0VarR, 6);
                        }
                        if (i15 != 0) {
                            jVar4 = null;
                        } else {
                            jVar4 = jVar2;
                        }
                        jhVar3 = jhVarM;
                        a0Var5 = a0Var4;
                    } else {
                        if (i18 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            q3VarU = kh.f30051a.u(c0VarR, 6);
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                            jhVarM = kh.f30051a.m(c0VarR, 6);
                        }
                        if (i15 != 0) {
                            jVar4 = null;
                        } else {
                            jVar4 = jVar2;
                        }
                        jhVar3 = jhVarM;
                        a0Var5 = a0Var4;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-399178234, i12, -1, "androidx.compose.material3.FilledTonalIconButton (IconButton.kt:495)");
                    }
                    int i2111 = (i12 & 14) | androidx.profileinstaller.n.c.f73814m | (i12 & com.planner5d.library.engine.input.f.b.B) | (i12 & 896) | (i12 & 7168) | (57344 & i12);
                    int i2112 = i12 << 3;
                    c0Var2 = c0VarR;
                    U(function1, a0Var5, z11, q3VarU, jhVar3, null, jVar4, function2, c0Var2, i2111 | (3670016 & i2112) | (i2112 & 29360128));
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var5;
                    z13 = z11;
                    q3Var2 = q3VarU;
                    jhVar2 = jhVar3;
                    jVar3 = jVar4;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var3 = a0Var2;
                    z13 = z11;
                    q3Var2 = q3VarU;
                    jhVar2 = jhVarM;
                    jVar3 = jVar2;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.ci
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ei.z(function0, a0Var3, z13, q3Var2, jhVar2, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 1572864;
            if ((599187 & i12) != 599186) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        q3VarU = kh.f30051a.u(c0VarR, 6);
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        jhVarM = kh.f30051a.m(c0VarR, 6);
                    }
                    if (i15 != 0) {
                        jVar4 = null;
                    } else {
                        jVar4 = jVar2;
                    }
                    jhVar3 = jhVarM;
                    a0Var5 = a0Var4;
                } else {
                    if (i18 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        q3VarU = kh.f30051a.u(c0VarR, 6);
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        jhVarM = kh.f30051a.m(c0VarR, 6);
                    }
                    if (i15 != 0) {
                        jVar4 = null;
                    } else {
                        jVar4 = jVar2;
                    }
                    jhVar3 = jhVarM;
                    a0Var5 = a0Var4;
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-399178234, i12, -1, "androidx.compose.material3.FilledTonalIconButton (IconButton.kt:495)");
                }
                int i2113 = (i12 & 14) | androidx.profileinstaller.n.c.f73814m | (i12 & com.planner5d.library.engine.input.f.b.B) | (i12 & 896) | (i12 & 7168) | (57344 & i12);
                int i2114 = i12 << 3;
                c0Var2 = c0VarR;
                U(function1, a0Var5, z11, q3VarU, jhVar3, null, jVar4, function2, c0Var2, i2113 | (3670016 & i2114) | (i2114 & 29360128));
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var5;
                z13 = z11;
                q3Var2 = q3VarU;
                jhVar2 = jhVar3;
                jVar3 = jVar4;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var3 = a0Var2;
                z13 = z11;
                q3Var2 = q3VarU;
                jhVar2 = jhVarM;
                jVar3 = jVar2;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.ci
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ei.z(function0, a0Var3, z13, q3Var2, jhVar2, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= androidx.media3.exoplayer.a5.S0;
        z11 = z10;
        if ((i10 & 3072) == 0) {
            if ((i11 & 8) == 0) {
                q3VarU = q3Var;
                if (c0VarR.D(q3VarU)) {
                }
                i12 |= i19;
            } else {
                q3VarU = q3Var;
            }
            i12 |= i19;
        } else {
            q3VarU = q3Var;
        }
        if ((i10 & 24576) == 0) {
            if ((i11 & 16) == 0) {
                jhVarM = jhVar;
                if (c0VarR.D(jhVarM)) {
                }
                i12 |= i20;
            } else {
                jhVarM = jhVar;
            }
            i12 |= i20;
        } else {
            jhVarM = jhVar;
        }
        i15 = i11 & 32;
        if (i15 != 0) {
            if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                jVar2 = jVar;
                if (c0VarR.D(jVar2)) {
                    i16 = 131072;
                } else {
                    i16 = 65536;
                }
                i12 |= i16;
            }
            if ((i11 & 64) != 0) {
                if ((i10 & 1572864) == 0) {
                    if (c0VarR.k0(function2)) {
                        i17 = 1048576;
                    } else {
                        i17 = 524288;
                    }
                    i12 |= i17;
                }
                if ((599187 & i12) != 599186) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i18 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            q3VarU = kh.f30051a.u(c0VarR, 6);
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                            jhVarM = kh.f30051a.m(c0VarR, 6);
                        }
                        if (i15 != 0) {
                            jVar4 = null;
                        } else {
                            jVar4 = jVar2;
                        }
                        jhVar3 = jhVarM;
                        a0Var5 = a0Var4;
                    } else {
                        if (i18 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            q3VarU = kh.f30051a.u(c0VarR, 6);
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                            jhVarM = kh.f30051a.m(c0VarR, 6);
                        }
                        if (i15 != 0) {
                            jVar4 = null;
                        } else {
                            jVar4 = jVar2;
                        }
                        jhVar3 = jhVarM;
                        a0Var5 = a0Var4;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-399178234, i12, -1, "androidx.compose.material3.FilledTonalIconButton (IconButton.kt:495)");
                    }
                    int i2115 = (i12 & 14) | androidx.profileinstaller.n.c.f73814m | (i12 & com.planner5d.library.engine.input.f.b.B) | (i12 & 896) | (i12 & 7168) | (57344 & i12);
                    int i2116 = i12 << 3;
                    c0Var2 = c0VarR;
                    U(function1, a0Var5, z11, q3VarU, jhVar3, null, jVar4, function2, c0Var2, i2115 | (3670016 & i2116) | (i2116 & 29360128));
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var5;
                    z13 = z11;
                    q3Var2 = q3VarU;
                    jhVar2 = jhVar3;
                    jVar3 = jVar4;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var3 = a0Var2;
                    z13 = z11;
                    q3Var2 = q3VarU;
                    jhVar2 = jhVarM;
                    jVar3 = jVar2;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.ci
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return ei.z(function0, a0Var3, z13, q3Var2, jhVar2, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 1572864;
            if ((599187 & i12) != 599186) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        q3VarU = kh.f30051a.u(c0VarR, 6);
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        jhVarM = kh.f30051a.m(c0VarR, 6);
                    }
                    if (i15 != 0) {
                        jVar4 = null;
                    } else {
                        jVar4 = jVar2;
                    }
                    jhVar3 = jhVarM;
                    a0Var5 = a0Var4;
                } else {
                    if (i18 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        q3VarU = kh.f30051a.u(c0VarR, 6);
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        jhVarM = kh.f30051a.m(c0VarR, 6);
                    }
                    if (i15 != 0) {
                        jVar4 = null;
                    } else {
                        jVar4 = jVar2;
                    }
                    jhVar3 = jhVarM;
                    a0Var5 = a0Var4;
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-399178234, i12, -1, "androidx.compose.material3.FilledTonalIconButton (IconButton.kt:495)");
                }
                int i2117 = (i12 & 14) | androidx.profileinstaller.n.c.f73814m | (i12 & com.planner5d.library.engine.input.f.b.B) | (i12 & 896) | (i12 & 7168) | (57344 & i12);
                int i2118 = i12 << 3;
                c0Var2 = c0VarR;
                U(function1, a0Var5, z11, q3VarU, jhVar3, null, jVar4, function2, c0Var2, i2117 | (3670016 & i2118) | (i2118 & 29360128));
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var5;
                z13 = z11;
                q3Var2 = q3VarU;
                jhVar2 = jhVar3;
                jVar3 = jVar4;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var3 = a0Var2;
                z13 = z11;
                q3Var2 = q3VarU;
                jhVar2 = jhVarM;
                jVar3 = jVar2;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.ci
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ei.z(function0, a0Var3, z13, q3Var2, jhVar2, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= androidx.profileinstaller.n.c.f73814m;
        jVar2 = jVar;
        if ((i11 & 64) != 0) {
            if ((i10 & 1572864) == 0) {
                if (c0VarR.k0(function2)) {
                    i17 = 1048576;
                } else {
                    i17 = 524288;
                }
                i12 |= i17;
            }
            if ((599187 & i12) != 599186) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        q3VarU = kh.f30051a.u(c0VarR, 6);
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        jhVarM = kh.f30051a.m(c0VarR, 6);
                    }
                    if (i15 != 0) {
                        jVar4 = null;
                    } else {
                        jVar4 = jVar2;
                    }
                    jhVar3 = jhVarM;
                    a0Var5 = a0Var4;
                } else {
                    if (i18 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        q3VarU = kh.f30051a.u(c0VarR, 6);
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        jhVarM = kh.f30051a.m(c0VarR, 6);
                    }
                    if (i15 != 0) {
                        jVar4 = null;
                    } else {
                        jVar4 = jVar2;
                    }
                    jhVar3 = jhVarM;
                    a0Var5 = a0Var4;
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-399178234, i12, -1, "androidx.compose.material3.FilledTonalIconButton (IconButton.kt:495)");
                }
                int i2119 = (i12 & 14) | androidx.profileinstaller.n.c.f73814m | (i12 & com.planner5d.library.engine.input.f.b.B) | (i12 & 896) | (i12 & 7168) | (57344 & i12);
                int i21110 = i12 << 3;
                c0Var2 = c0VarR;
                U(function1, a0Var5, z11, q3VarU, jhVar3, null, jVar4, function2, c0Var2, i2119 | (3670016 & i21110) | (i21110 & 29360128));
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var5;
                z13 = z11;
                q3Var2 = q3VarU;
                jhVar2 = jhVar3;
                jVar3 = jVar4;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var3 = a0Var2;
                z13 = z11;
                q3Var2 = q3VarU;
                jhVar2 = jhVarM;
                jVar3 = jVar2;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.ci
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return ei.z(function0, a0Var3, z13, q3Var2, jhVar2, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 1572864;
        if ((599187 & i12) != 599186) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (c0VarR.h(z12, i12 & 1)) {
            c0VarR.l0();
            if ((i10 & 1) != 0) {
                if (i18 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if (i13 != 0) {
                    z11 = true;
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    q3VarU = kh.f30051a.u(c0VarR, 6);
                }
                if ((i11 & 16) != 0) {
                    i12 &= -57345;
                    jhVarM = kh.f30051a.m(c0VarR, 6);
                }
                if (i15 != 0) {
                    jVar4 = null;
                } else {
                    jVar4 = jVar2;
                }
                jhVar3 = jhVarM;
                a0Var5 = a0Var4;
            } else {
                if (i18 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if (i13 != 0) {
                    z11 = true;
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    q3VarU = kh.f30051a.u(c0VarR, 6);
                }
                if ((i11 & 16) != 0) {
                    i12 &= -57345;
                    jhVarM = kh.f30051a.m(c0VarR, 6);
                }
                if (i15 != 0) {
                    jVar4 = null;
                } else {
                    jVar4 = jVar2;
                }
                jhVar3 = jhVarM;
                a0Var5 = a0Var4;
            }
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-399178234, i12, -1, "androidx.compose.material3.FilledTonalIconButton (IconButton.kt:495)");
            }
            int i21111 = (i12 & 14) | androidx.profileinstaller.n.c.f73814m | (i12 & com.planner5d.library.engine.input.f.b.B) | (i12 & 896) | (i12 & 7168) | (57344 & i12);
            int i21112 = i12 << 3;
            c0Var2 = c0VarR;
            U(function1, a0Var5, z11, q3VarU, jhVar3, null, jVar4, function2, c0Var2, i21111 | (3670016 & i21112) | (i21112 & 29360128));
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            a0Var3 = a0Var5;
            z13 = z11;
            q3Var2 = q3VarU;
            jhVar2 = jhVar3;
            jVar3 = jVar4;
        } else {
            c0Var2 = c0VarR;
            c0Var2.u();
            a0Var3 = a0Var2;
            z13 = z11;
            q3Var2 = q3VarU;
            jhVar2 = jhVarM;
            jVar3 = jVar2;
        }
        s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.ci
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return ei.z(function0, a0Var3, z13, q3Var2, jhVar2, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit z(Function0 function0, androidx.compose.ui.a0 a0Var, boolean z10, androidx.compose.ui.graphics.q3 q3Var, jh jhVar, androidx.compose.foundation.interaction.j jVar, Function2 function2, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        y(function0, a0Var, z10, q3Var, jhVar, jVar, function2, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }
}

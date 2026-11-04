package androidx.compose.material;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Button.kt\nandroidx/compose/material/ButtonKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 4 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,613:1\n1282#2,6:614\n1282#2,6:620\n113#3:626\n85#4:627\n*S KotlinDebug\n*F\n+ 1 Button.kt\nandroidx/compose/material/ButtonKt\n*L\n108#1:614,6\n112#1:620,6\n118#1:626\n109#1:627\n*E\n"})
public final class t3 {

    static final class a implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> f24968a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.foundation.layout.g5 f24969b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ pj.n<androidx.compose.foundation.layout.x5, androidx.compose.runtime.c0, Integer, Unit> f24970c;

        /* JADX INFO: renamed from: androidx.compose.material.t3$a$a, reason: collision with other inner class name */
        static final class C0200a implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ androidx.compose.foundation.layout.g5 f24971a;

            /* JADX INFO: renamed from: b, reason: collision with root package name */
            final /* synthetic */ pj.n<androidx.compose.foundation.layout.x5, androidx.compose.runtime.c0, Integer, Unit> f24972b;

            /* JADX INFO: renamed from: androidx.compose.material.t3$a$a$a, reason: collision with other inner class name */
            @SourceDebugExtension({"SMAP\nButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Button.kt\nandroidx/compose/material/ButtonKt$Button$2$1$1\n+ 2 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,613:1\n99#2,6:614\n106#2:650\n79#3,6:620\n86#3,3:635\n89#3,2:644\n93#3:649\n347#4,9:626\n356#4,3:646\n4206#5,6:638\n*S KotlinDebug\n*F\n+ 1 Button.kt\nandroidx/compose/material/ButtonKt$Button$2$1$1\n*L\n123#1:614,6\n123#1:650\n123#1:620,6\n123#1:635,3\n123#1:644,2\n123#1:649\n123#1:626,9\n123#1:646,3\n123#1:638,6\n*E\n"})
            static final class C0201a implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ androidx.compose.foundation.layout.g5 f24973a;

                /* JADX INFO: renamed from: b, reason: collision with root package name */
                final /* synthetic */ pj.n<androidx.compose.foundation.layout.x5, androidx.compose.runtime.c0, Integer, Unit> f24974b;

                /* JADX WARN: Multi-variable type inference failed */
                C0201a(androidx.compose.foundation.layout.g5 g5Var, pj.n<? super androidx.compose.foundation.layout.x5, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar) {
                    this.f24973a = g5Var;
                    this.f24974b = nVar;
                }

                @androidx.compose.runtime.o
                @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
                    if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                        c0Var.u();
                        return;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(165539859, i10, -1, "androidx.compose.material.Button.<anonymous>.<anonymous>.<anonymous> (Button.kt:122)");
                    }
                    androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
                    p3 p3Var = p3.f24148a;
                    androidx.compose.ui.a0 a0VarP = androidx.compose.foundation.layout.d5.p(androidx.compose.foundation.layout.i6.a(aVar, p3Var.h(), p3Var.g()), this.f24973a);
                    androidx.compose.foundation.layout.q.f fVarM = androidx.compose.foundation.layout.q.f16330a.m();
                    androidx.compose.ui.e.c cVarQ = androidx.compose.ui.e.f37317a.q();
                    pj.n<androidx.compose.foundation.layout.x5, androidx.compose.runtime.c0, Integer, Unit> nVar = this.f24974b;
                    androidx.compose.ui.layout.a1 a1VarE = androidx.compose.foundation.layout.u5.e(fVarM, cVarQ, c0Var, 54);
                    int iJ = androidx.compose.runtime.v.j(c0Var, 0);
                    androidx.compose.runtime.b1 b1VarK = c0Var.k();
                    androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0Var, a0VarP);
                    androidx.compose.ui.node.g.a aVar2 = androidx.compose.ui.node.g.I;
                    Function0<androidx.compose.ui.node.g> function0A = aVar2.a();
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
                    androidx.compose.runtime.y7.n(c0VarD, a1VarE, aVar2.e());
                    androidx.compose.runtime.y7.n(c0VarD, b1VarK, aVar2.g());
                    Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar2.b();
                    if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iJ))) {
                        c0VarD.Y(Integer.valueOf(iJ));
                        c0VarD.f(Integer.valueOf(iJ), function2B);
                    }
                    androidx.compose.runtime.y7.n(c0VarD, a0VarN, aVar2.f());
                    nVar.invoke(androidx.compose.foundation.layout.y5.f16577a, c0Var, 6);
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

            /* JADX WARN: Multi-variable type inference failed */
            C0200a(androidx.compose.foundation.layout.g5 g5Var, pj.n<? super androidx.compose.foundation.layout.x5, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar) {
                this.f24971a = g5Var;
                this.f24972b = nVar;
            }

            @androidx.compose.runtime.o
            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
            public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
                if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                    c0Var.u();
                    return;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-869936862, i10, -1, "androidx.compose.material.Button.<anonymous>.<anonymous> (Button.kt:121)");
                }
                wk.l(x9.f25488a.c(c0Var, 6).e(), androidx.compose.runtime.internal.w.e(165539859, true, new C0201a(this.f24971a, this.f24972b), c0Var, 54), c0Var, 48);
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

        /* JADX WARN: Multi-variable type inference failed */
        a(androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7Var, androidx.compose.foundation.layout.g5 g5Var, pj.n<? super androidx.compose.foundation.layout.x5, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar) {
            this.f24968a = n7Var;
            this.f24969b = g5Var;
            this.f24970c = nVar;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-20345758, i10, -1, "androidx.compose.material.Button.<anonymous> (Button.kt:120)");
            }
            androidx.compose.runtime.a1.e(w4.c().f(Float.valueOf(androidx.compose.ui.graphics.q0.A(t3.d(this.f24968a)))), androidx.compose.runtime.internal.w.e(-869936862, true, new C0200a(this.f24969b, this.f24970c), c0Var, 54), c0Var, androidx.compose.runtime.n4.f36267i | 48);
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

    /* JADX WARN: Code duplicated, block: B:102:0x0126  */
    /* JADX WARN: Code duplicated, block: B:104:0x012a  */
    /* JADX WARN: Code duplicated, block: B:106:0x012e  */
    /* JADX WARN: Code duplicated, block: B:108:0x0134  */
    /* JADX WARN: Code duplicated, block: B:109:0x0137  */
    /* JADX WARN: Code duplicated, block: B:113:0x0147  */
    /* JADX WARN: Code duplicated, block: B:114:0x0149  */
    /* JADX WARN: Code duplicated, block: B:117:0x0152  */
    /* JADX WARN: Code duplicated, block: B:119:0x0163  */
    /* JADX WARN: Code duplicated, block: B:133:0x019a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:134:0x019c  */
    /* JADX WARN: Code duplicated, block: B:135:0x019f  */
    /* JADX WARN: Code duplicated, block: B:137:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:138:0x01a5  */
    /* JADX WARN: Code duplicated, block: B:140:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:141:0x01ac  */
    /* JADX WARN: Code duplicated, block: B:144:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:145:0x01cd  */
    /* JADX WARN: Code duplicated, block: B:148:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:149:0x01e1  */
    /* JADX WARN: Code duplicated, block: B:151:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:152:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:155:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:156:0x020e  */
    /* JADX WARN: Code duplicated, block: B:158:0x0219  */
    /* JADX WARN: Code duplicated, block: B:160:0x0228  */
    /* JADX WARN: Code duplicated, block: B:163:0x0234  */
    /* JADX WARN: Code duplicated, block: B:165:0x023f  */
    /* JADX WARN: Code duplicated, block: B:167:0x0251  */
    /* JADX WARN: Code duplicated, block: B:169:0x025e  */
    /* JADX WARN: Code duplicated, block: B:172:0x0284  */
    /* JADX WARN: Code duplicated, block: B:175:0x02c9  */
    /* JADX WARN: Code duplicated, block: B:176:0x02d4  */
    /* JADX WARN: Code duplicated, block: B:178:0x02e5  */
    /* JADX WARN: Code duplicated, block: B:179:0x02f0  */
    /* JADX WARN: Code duplicated, block: B:182:0x0332  */
    /* JADX WARN: Code duplicated, block: B:184:0x0346  */
    /* JADX WARN: Code duplicated, block: B:187:0x0360  */
    /* JADX WARN: Code duplicated, block: B:189:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004d  */
    /* JADX WARN: Code duplicated, block: B:28:0x0052  */
    /* JADX WARN: Code duplicated, block: B:30:0x0056  */
    /* JADX WARN: Code duplicated, block: B:32:0x005e  */
    /* JADX WARN: Code duplicated, block: B:33:0x0061  */
    /* JADX WARN: Code duplicated, block: B:37:0x0068  */
    /* JADX WARN: Code duplicated, block: B:39:0x006f  */
    /* JADX WARN: Code duplicated, block: B:41:0x0073  */
    /* JADX WARN: Code duplicated, block: B:43:0x007b  */
    /* JADX WARN: Code duplicated, block: B:44:0x007e  */
    /* JADX WARN: Code duplicated, block: B:48:0x0085  */
    /* JADX WARN: Code duplicated, block: B:50:0x0089  */
    /* JADX WARN: Code duplicated, block: B:52:0x0091  */
    /* JADX WARN: Code duplicated, block: B:53:0x0094  */
    /* JADX WARN: Code duplicated, block: B:56:0x009c  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b4 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:67:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:73:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:85:0x00f1 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:88:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:91:0x0102  */
    /* JADX WARN: Code duplicated, block: B:93:0x0109  */
    /* JADX WARN: Code duplicated, block: B:95:0x010d  */
    /* JADX WARN: Code duplicated, block: B:97:0x0119  */
    /* JADX WARN: Code duplicated, block: B:98:0x011c  */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void c(@NotNull final Function0<Unit> function0, @Nullable androidx.compose.ui.a0 a0Var, boolean z10, @Nullable androidx.compose.foundation.interaction.j jVar, @Nullable q3 q3Var, @Nullable androidx.compose.ui.graphics.q3 q3Var2, @Nullable androidx.compose.foundation.a1 a1Var, @Nullable o3 o3Var, @Nullable androidx.compose.foundation.layout.g5 g5Var, @NotNull final pj.n<? super androidx.compose.foundation.layout.x5, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        androidx.compose.ui.a0 a0Var2;
        int i13;
        boolean z11;
        int i14;
        int i15;
        androidx.compose.foundation.interaction.j jVar2;
        int i16;
        q3 q3VarB;
        int i17;
        int i18;
        int i19;
        int i20;
        int i21;
        int i22;
        boolean z12;
        androidx.compose.runtime.c0 c0Var2;
        final androidx.compose.ui.graphics.q3 q3Var3;
        final androidx.compose.foundation.a1 a1Var2;
        final androidx.compose.ui.a0 a0Var3;
        final boolean z13;
        final androidx.compose.foundation.interaction.j jVar3;
        final q3 q3Var4;
        final o3 o3Var2;
        final androidx.compose.foundation.layout.g5 g5Var2;
        androidx.compose.runtime.s5 s5VarT;
        androidx.compose.ui.a0 a0Var4;
        boolean z14;
        androidx.compose.foundation.interaction.j jVar4;
        int i23;
        androidx.compose.ui.graphics.q3 q3VarE;
        androidx.compose.foundation.a1 a1Var3;
        androidx.compose.runtime.c0 c0Var3;
        o3 o3VarA;
        androidx.compose.foundation.layout.g5 g5VarD;
        androidx.compose.ui.graphics.q3 q3Var5;
        androidx.compose.foundation.a1 a1Var4;
        boolean z15;
        int i24;
        androidx.compose.foundation.interaction.j jVar5;
        int i25;
        Object objI0;
        androidx.compose.runtime.n7<androidx.compose.ui.unit.h> n7VarA;
        float fR;
        Object objI1;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1084573925);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c0VarR.k0(function0) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i26 = i11 & 2;
        if (i26 == 0) {
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
                i15 = i11 & 8;
                if (i15 != 0) {
                    if ((i10 & 3072) == 0) {
                        jVar2 = jVar;
                        if (c0VarR.D(jVar2)) {
                            i16 = 2048;
                        } else {
                            i16 = 1024;
                        }
                        i12 |= i16;
                    }
                    if ((i10 & 24576) == 0) {
                        if ((i11 & 16) == 0) {
                            q3VarB = q3Var;
                            int i27 = c0VarR.D(q3VarB) ? 16384 : 8192;
                            i12 |= i27;
                        } else {
                            q3VarB = q3Var;
                        }
                        i12 |= i27;
                    } else {
                        q3VarB = q3Var;
                    }
                    if ((196608 & i10) != 0) {
                        i12 |= ((i11 & 32) == 0 || !c0VarR.D(q3Var2)) ? 65536 : 131072;
                    }
                    i17 = i11 & 64;
                    if (i17 != 0) {
                        i12 |= 1572864;
                    } else if ((i10 & 1572864) == 0) {
                        if (c0VarR.D(a1Var)) {
                            i18 = 1048576;
                        } else {
                            i18 = 524288;
                        }
                        i12 |= i18;
                    }
                    if ((i10 & 12582912) != 0) {
                        i12 |= ((i11 & 128) == 0 || !c0VarR.D(o3Var)) ? 4194304 : 8388608;
                    }
                    i19 = i11 & 256;
                    if (i19 != 0) {
                        if ((i10 & 100663296) == 0) {
                            if (c0VarR.D(g5Var)) {
                                i20 = 67108864;
                            } else {
                                i20 = com.google.api.client.googleapis.media.a.f115410j;
                            }
                            i12 |= i20;
                        }
                        if ((i11 & 512) != 0) {
                            i12 |= 805306368;
                        } else if ((i10 & 805306368) == 0) {
                            if (c0VarR.k0(nVar)) {
                                i21 = 536870912;
                            } else {
                                i21 = 268435456;
                            }
                            i12 |= i21;
                        }
                        i22 = i12;
                        if ((306783379 & i22) != 306783378) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (c0VarR.h(z12, i22 & 1)) {
                            c0VarR.l0();
                            if ((i10 & 1) != 0 || c0VarR.y()) {
                                if (i26 != 0) {
                                    a0Var4 = androidx.compose.ui.a0.E;
                                } else {
                                    a0Var4 = a0Var2;
                                }
                                if (i13 != 0) {
                                    z14 = true;
                                } else {
                                    z14 = z11;
                                }
                                if (i15 != 0) {
                                    jVar4 = null;
                                } else {
                                    jVar4 = jVar2;
                                }
                                if ((i11 & 16) != 0) {
                                    i23 = i22 & (-57345);
                                    q3VarB = p3.f24148a.b(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0VarR, androidx.profileinstaller.n.c.f73814m, 31);
                                } else {
                                    i23 = i22;
                                }
                                if ((i11 & 32) != 0) {
                                    q3VarE = x9.f25488a.b(c0VarR, 6).e();
                                    i23 &= -458753;
                                } else {
                                    q3VarE = q3Var2;
                                }
                                if (i17 != 0) {
                                    a1Var3 = null;
                                } else {
                                    a1Var3 = a1Var;
                                }
                                if ((i11 & 128) != 0) {
                                    o3VarA = p3.f24148a.a(0L, 0L, 0L, 0L, c0VarR, 24576, 15);
                                    c0Var3 = c0VarR;
                                    i23 &= -29360129;
                                } else {
                                    c0Var3 = c0VarR;
                                    o3VarA = o3Var;
                                }
                                if (i19 != 0) {
                                    g5VarD = p3.f24148a.d();
                                } else {
                                    g5VarD = g5Var;
                                }
                                q3Var5 = q3VarE;
                                a1Var4 = a1Var3;
                                z15 = z14;
                                a0Var2 = a0Var4;
                                i24 = i23;
                            } else {
                                c0VarR.u();
                                i24 = (i11 & 16) != 0 ? i22 & (-57345) : i22;
                                if ((i11 & 32) != 0) {
                                    i24 &= -458753;
                                }
                                if ((i11 & 128) != 0) {
                                    i24 &= -29360129;
                                }
                                q3Var5 = q3Var2;
                                a1Var4 = a1Var;
                                z15 = z11;
                                jVar4 = jVar2;
                                g5VarD = g5Var;
                                c0Var3 = c0VarR;
                                o3VarA = o3Var;
                            }
                            c0Var3.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(-1084573925, i24, -1, "androidx.compose.material.Button (Button.kt:105)");
                            }
                            if (jVar4 == null) {
                                c0Var3.E(497772480);
                                objI1 = c0Var3.i0();
                                if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI1 = androidx.compose.foundation.interaction.i.a();
                                    c0Var3.Y(objI1);
                                }
                                jVar5 = (androidx.compose.foundation.interaction.j) objI1;
                                c0Var3.A();
                            } else {
                                c0Var3.E(1401529847);
                                c0Var3.A();
                                jVar5 = jVar4;
                            }
                            i25 = i24 >> 6;
                            int i28 = (i25 & 14) | ((i24 >> 18) & com.planner5d.library.engine.input.f.b.B);
                            androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarB = o3VarA.b(z15, c0Var3, i28);
                            objI0 = c0Var3.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = new Function1() { // from class: androidx.compose.material.r3
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return t3.e((androidx.compose.ui.semantics.e0) obj);
                                    }
                                };
                                c0Var3.Y(objI0);
                            }
                            androidx.compose.ui.a0 a0VarF = androidx.compose.ui.semantics.t.f(a0Var2, false, (Function1) objI0, 1, null);
                            long jM = o3VarA.a(z15, c0Var3, i28).getValue().M();
                            long jW = androidx.compose.ui.graphics.q0.w(d(n7VarB), 1.0f, 0.0f, 0.0f, 0.0f, 14, null);
                            if (q3VarB == null) {
                                c0Var3.E(498179137);
                                c0Var3.A();
                                n7VarA = null;
                            } else {
                                c0Var3.E(1401543616);
                                n7VarA = q3VarB.a(z15, jVar5, c0Var3, i25 & 910);
                                c0Var3.A();
                            }
                            if (n7VarA != null) {
                                fR = n7VarA.getValue().O();
                            } else {
                                fR = androidx.compose.ui.unit.h.r(0);
                            }
                            androidx.compose.ui.a0 a0Var5 = a0Var2;
                            androidx.compose.runtime.c0 c0Var4 = c0Var3;
                            ah.f(function0, a0VarF, z15, q3Var5, jM, jW, a1Var4, fR, jVar5, androidx.compose.runtime.internal.w.e(-20345758, true, new a(n7VarB, g5VarD, nVar), c0Var3, 54), c0Var4, (i24 & 14) | 805306368 | (i24 & 896) | (i25 & 7168) | (i24 & 3670016), 0);
                            c0Var2 = c0Var4;
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            q3 q3Var6 = q3VarB;
                            g5Var2 = g5VarD;
                            q3Var4 = q3Var6;
                            o3Var2 = o3VarA;
                            z13 = z15;
                            q3Var3 = q3Var5;
                            a1Var2 = a1Var4;
                            a0Var3 = a0Var5;
                            jVar3 = jVar4;
                        } else {
                            c0Var2 = c0VarR;
                            c0Var2.u();
                            q3Var3 = q3Var2;
                            a1Var2 = a1Var;
                            a0Var3 = a0Var2;
                            z13 = z11;
                            jVar3 = jVar2;
                            q3Var4 = q3VarB;
                            o3Var2 = o3Var;
                            g5Var2 = g5Var;
                        }
                        s5VarT = c0Var2.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material.s3
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return t3.f(function0, a0Var3, z13, jVar3, q3Var4, q3Var3, a1Var2, o3Var2, g5Var2, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i12 |= 100663296;
                    if ((i11 & 512) != 0) {
                        i12 |= 805306368;
                    } else if ((i10 & 805306368) == 0) {
                        if (c0VarR.k0(nVar)) {
                            i21 = 536870912;
                        } else {
                            i21 = 268435456;
                        }
                        i12 |= i21;
                    }
                    i22 = i12;
                    if ((306783379 & i22) != 306783378) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (c0VarR.h(z12, i22 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i26 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i13 != 0) {
                                z14 = true;
                            } else {
                                z14 = z11;
                            }
                            if (i15 != 0) {
                                jVar4 = null;
                            } else {
                                jVar4 = jVar2;
                            }
                            if ((i11 & 16) != 0) {
                                i23 = i22 & (-57345);
                                q3VarB = p3.f24148a.b(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0VarR, androidx.profileinstaller.n.c.f73814m, 31);
                            } else {
                                i23 = i22;
                            }
                            if ((i11 & 32) != 0) {
                                q3VarE = x9.f25488a.b(c0VarR, 6).e();
                                i23 &= -458753;
                            } else {
                                q3VarE = q3Var2;
                            }
                            if (i17 != 0) {
                                a1Var3 = null;
                            } else {
                                a1Var3 = a1Var;
                            }
                            if ((i11 & 128) != 0) {
                                o3VarA = p3.f24148a.a(0L, 0L, 0L, 0L, c0VarR, 24576, 15);
                                c0Var3 = c0VarR;
                                i23 &= -29360129;
                            } else {
                                c0Var3 = c0VarR;
                                o3VarA = o3Var;
                            }
                            if (i19 != 0) {
                                g5VarD = p3.f24148a.d();
                            } else {
                                g5VarD = g5Var;
                            }
                            q3Var5 = q3VarE;
                            a1Var4 = a1Var3;
                            z15 = z14;
                            a0Var2 = a0Var4;
                            i24 = i23;
                        } else {
                            if (i26 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i13 != 0) {
                                z14 = true;
                            } else {
                                z14 = z11;
                            }
                            if (i15 != 0) {
                                jVar4 = null;
                            } else {
                                jVar4 = jVar2;
                            }
                            if ((i11 & 16) != 0) {
                                i23 = i22 & (-57345);
                                q3VarB = p3.f24148a.b(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0VarR, androidx.profileinstaller.n.c.f73814m, 31);
                            } else {
                                i23 = i22;
                            }
                            if ((i11 & 32) != 0) {
                                q3VarE = x9.f25488a.b(c0VarR, 6).e();
                                i23 &= -458753;
                            } else {
                                q3VarE = q3Var2;
                            }
                            if (i17 != 0) {
                                a1Var3 = null;
                            } else {
                                a1Var3 = a1Var;
                            }
                            if ((i11 & 128) != 0) {
                                o3VarA = p3.f24148a.a(0L, 0L, 0L, 0L, c0VarR, 24576, 15);
                                c0Var3 = c0VarR;
                                i23 &= -29360129;
                            } else {
                                c0Var3 = c0VarR;
                                o3VarA = o3Var;
                            }
                            if (i19 != 0) {
                                g5VarD = p3.f24148a.d();
                            } else {
                                g5VarD = g5Var;
                            }
                            q3Var5 = q3VarE;
                            a1Var4 = a1Var3;
                            z15 = z14;
                            a0Var2 = a0Var4;
                            i24 = i23;
                        }
                        c0Var3.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-1084573925, i24, -1, "androidx.compose.material.Button (Button.kt:105)");
                        }
                        if (jVar4 == null) {
                            c0Var3.E(497772480);
                            objI1 = c0Var3.i0();
                            if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI1 = androidx.compose.foundation.interaction.i.a();
                                c0Var3.Y(objI1);
                            }
                            jVar5 = (androidx.compose.foundation.interaction.j) objI1;
                            c0Var3.A();
                        } else {
                            c0Var3.E(1401529847);
                            c0Var3.A();
                            jVar5 = jVar4;
                        }
                        i25 = i24 >> 6;
                        int i29 = (i25 & 14) | ((i24 >> 18) & com.planner5d.library.engine.input.f.b.B);
                        androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarB2 = o3VarA.b(z15, c0Var3, i29);
                        objI0 = c0Var3.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = new Function1() { // from class: androidx.compose.material.r3
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return t3.e((androidx.compose.ui.semantics.e0) obj);
                                }
                            };
                            c0Var3.Y(objI0);
                        }
                        androidx.compose.ui.a0 a0VarF2 = androidx.compose.ui.semantics.t.f(a0Var2, false, (Function1) objI0, 1, null);
                        long jM2 = o3VarA.a(z15, c0Var3, i29).getValue().M();
                        long jW2 = androidx.compose.ui.graphics.q0.w(d(n7VarB2), 1.0f, 0.0f, 0.0f, 0.0f, 14, null);
                        if (q3VarB == null) {
                            c0Var3.E(498179137);
                            c0Var3.A();
                            n7VarA = null;
                        } else {
                            c0Var3.E(1401543616);
                            n7VarA = q3VarB.a(z15, jVar5, c0Var3, i25 & 910);
                            c0Var3.A();
                        }
                        if (n7VarA != null) {
                            fR = n7VarA.getValue().O();
                        } else {
                            fR = androidx.compose.ui.unit.h.r(0);
                        }
                        androidx.compose.ui.a0 a0Var6 = a0Var2;
                        androidx.compose.runtime.c0 c0Var5 = c0Var3;
                        ah.f(function0, a0VarF2, z15, q3Var5, jM2, jW2, a1Var4, fR, jVar5, androidx.compose.runtime.internal.w.e(-20345758, true, new a(n7VarB2, g5VarD, nVar), c0Var3, 54), c0Var5, (i24 & 14) | 805306368 | (i24 & 896) | (i25 & 7168) | (i24 & 3670016), 0);
                        c0Var2 = c0Var5;
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        q3 q3Var7 = q3VarB;
                        g5Var2 = g5VarD;
                        q3Var4 = q3Var7;
                        o3Var2 = o3VarA;
                        z13 = z15;
                        q3Var3 = q3Var5;
                        a1Var2 = a1Var4;
                        a0Var3 = a0Var6;
                        jVar3 = jVar4;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        q3Var3 = q3Var2;
                        a1Var2 = a1Var;
                        a0Var3 = a0Var2;
                        z13 = z11;
                        jVar3 = jVar2;
                        q3Var4 = q3VarB;
                        o3Var2 = o3Var;
                        g5Var2 = g5Var;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material.s3
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return t3.f(function0, a0Var3, z13, jVar3, q3Var4, q3Var3, a1Var2, o3Var2, g5Var2, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 3072;
                jVar2 = jVar;
                if ((i10 & 24576) == 0) {
                    if ((i11 & 16) == 0) {
                        q3VarB = q3Var;
                        if (c0VarR.D(q3VarB)) {
                        }
                        i12 |= i27;
                    } else {
                        q3VarB = q3Var;
                    }
                    i12 |= i27;
                } else {
                    q3VarB = q3Var;
                }
                if ((196608 & i10) != 0) {
                    i12 |= ((i11 & 32) == 0 || !c0VarR.D(q3Var2)) ? 65536 : 131072;
                }
                i17 = i11 & 64;
                if (i17 != 0) {
                    i12 |= 1572864;
                } else if ((i10 & 1572864) == 0) {
                    if (c0VarR.D(a1Var)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i12 |= i18;
                }
                if ((i10 & 12582912) != 0) {
                    i12 |= ((i11 & 128) == 0 || !c0VarR.D(o3Var)) ? 4194304 : 8388608;
                }
                i19 = i11 & 256;
                if (i19 != 0) {
                    if ((i10 & 100663296) == 0) {
                        if (c0VarR.D(g5Var)) {
                            i20 = 67108864;
                        } else {
                            i20 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i12 |= i20;
                    }
                    if ((i11 & 512) != 0) {
                        i12 |= 805306368;
                    } else if ((i10 & 805306368) == 0) {
                        if (c0VarR.k0(nVar)) {
                            i21 = 536870912;
                        } else {
                            i21 = 268435456;
                        }
                        i12 |= i21;
                    }
                    i22 = i12;
                    if ((306783379 & i22) != 306783378) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (c0VarR.h(z12, i22 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i26 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i13 != 0) {
                                z14 = true;
                            } else {
                                z14 = z11;
                            }
                            if (i15 != 0) {
                                jVar4 = null;
                            } else {
                                jVar4 = jVar2;
                            }
                            if ((i11 & 16) != 0) {
                                i23 = i22 & (-57345);
                                q3VarB = p3.f24148a.b(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0VarR, androidx.profileinstaller.n.c.f73814m, 31);
                            } else {
                                i23 = i22;
                            }
                            if ((i11 & 32) != 0) {
                                q3VarE = x9.f25488a.b(c0VarR, 6).e();
                                i23 &= -458753;
                            } else {
                                q3VarE = q3Var2;
                            }
                            if (i17 != 0) {
                                a1Var3 = null;
                            } else {
                                a1Var3 = a1Var;
                            }
                            if ((i11 & 128) != 0) {
                                o3VarA = p3.f24148a.a(0L, 0L, 0L, 0L, c0VarR, 24576, 15);
                                c0Var3 = c0VarR;
                                i23 &= -29360129;
                            } else {
                                c0Var3 = c0VarR;
                                o3VarA = o3Var;
                            }
                            if (i19 != 0) {
                                g5VarD = p3.f24148a.d();
                            } else {
                                g5VarD = g5Var;
                            }
                            q3Var5 = q3VarE;
                            a1Var4 = a1Var3;
                            z15 = z14;
                            a0Var2 = a0Var4;
                            i24 = i23;
                        } else {
                            if (i26 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i13 != 0) {
                                z14 = true;
                            } else {
                                z14 = z11;
                            }
                            if (i15 != 0) {
                                jVar4 = null;
                            } else {
                                jVar4 = jVar2;
                            }
                            if ((i11 & 16) != 0) {
                                i23 = i22 & (-57345);
                                q3VarB = p3.f24148a.b(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0VarR, androidx.profileinstaller.n.c.f73814m, 31);
                            } else {
                                i23 = i22;
                            }
                            if ((i11 & 32) != 0) {
                                q3VarE = x9.f25488a.b(c0VarR, 6).e();
                                i23 &= -458753;
                            } else {
                                q3VarE = q3Var2;
                            }
                            if (i17 != 0) {
                                a1Var3 = null;
                            } else {
                                a1Var3 = a1Var;
                            }
                            if ((i11 & 128) != 0) {
                                o3VarA = p3.f24148a.a(0L, 0L, 0L, 0L, c0VarR, 24576, 15);
                                c0Var3 = c0VarR;
                                i23 &= -29360129;
                            } else {
                                c0Var3 = c0VarR;
                                o3VarA = o3Var;
                            }
                            if (i19 != 0) {
                                g5VarD = p3.f24148a.d();
                            } else {
                                g5VarD = g5Var;
                            }
                            q3Var5 = q3VarE;
                            a1Var4 = a1Var3;
                            z15 = z14;
                            a0Var2 = a0Var4;
                            i24 = i23;
                        }
                        c0Var3.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-1084573925, i24, -1, "androidx.compose.material.Button (Button.kt:105)");
                        }
                        if (jVar4 == null) {
                            c0Var3.E(497772480);
                            objI1 = c0Var3.i0();
                            if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI1 = androidx.compose.foundation.interaction.i.a();
                                c0Var3.Y(objI1);
                            }
                            jVar5 = (androidx.compose.foundation.interaction.j) objI1;
                            c0Var3.A();
                        } else {
                            c0Var3.E(1401529847);
                            c0Var3.A();
                            jVar5 = jVar4;
                        }
                        i25 = i24 >> 6;
                        int i210 = (i25 & 14) | ((i24 >> 18) & com.planner5d.library.engine.input.f.b.B);
                        androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarB3 = o3VarA.b(z15, c0Var3, i210);
                        objI0 = c0Var3.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = new Function1() { // from class: androidx.compose.material.r3
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return t3.e((androidx.compose.ui.semantics.e0) obj);
                                }
                            };
                            c0Var3.Y(objI0);
                        }
                        androidx.compose.ui.a0 a0VarF3 = androidx.compose.ui.semantics.t.f(a0Var2, false, (Function1) objI0, 1, null);
                        long jM3 = o3VarA.a(z15, c0Var3, i210).getValue().M();
                        long jW3 = androidx.compose.ui.graphics.q0.w(d(n7VarB3), 1.0f, 0.0f, 0.0f, 0.0f, 14, null);
                        if (q3VarB == null) {
                            c0Var3.E(498179137);
                            c0Var3.A();
                            n7VarA = null;
                        } else {
                            c0Var3.E(1401543616);
                            n7VarA = q3VarB.a(z15, jVar5, c0Var3, i25 & 910);
                            c0Var3.A();
                        }
                        if (n7VarA != null) {
                            fR = n7VarA.getValue().O();
                        } else {
                            fR = androidx.compose.ui.unit.h.r(0);
                        }
                        androidx.compose.ui.a0 a0Var7 = a0Var2;
                        androidx.compose.runtime.c0 c0Var6 = c0Var3;
                        ah.f(function0, a0VarF3, z15, q3Var5, jM3, jW3, a1Var4, fR, jVar5, androidx.compose.runtime.internal.w.e(-20345758, true, new a(n7VarB3, g5VarD, nVar), c0Var3, 54), c0Var6, (i24 & 14) | 805306368 | (i24 & 896) | (i25 & 7168) | (i24 & 3670016), 0);
                        c0Var2 = c0Var6;
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        q3 q3Var8 = q3VarB;
                        g5Var2 = g5VarD;
                        q3Var4 = q3Var8;
                        o3Var2 = o3VarA;
                        z13 = z15;
                        q3Var3 = q3Var5;
                        a1Var2 = a1Var4;
                        a0Var3 = a0Var7;
                        jVar3 = jVar4;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        q3Var3 = q3Var2;
                        a1Var2 = a1Var;
                        a0Var3 = a0Var2;
                        z13 = z11;
                        jVar3 = jVar2;
                        q3Var4 = q3VarB;
                        o3Var2 = o3Var;
                        g5Var2 = g5Var;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material.s3
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return t3.f(function0, a0Var3, z13, jVar3, q3Var4, q3Var3, a1Var2, o3Var2, g5Var2, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 100663296;
                if ((i11 & 512) != 0) {
                    i12 |= 805306368;
                } else if ((i10 & 805306368) == 0) {
                    if (c0VarR.k0(nVar)) {
                        i21 = 536870912;
                    } else {
                        i21 = 268435456;
                    }
                    i12 |= i21;
                }
                i22 = i12;
                if ((306783379 & i22) != 306783378) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i22 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i26 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        if (i15 != 0) {
                            jVar4 = null;
                        } else {
                            jVar4 = jVar2;
                        }
                        if ((i11 & 16) != 0) {
                            i23 = i22 & (-57345);
                            q3VarB = p3.f24148a.b(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0VarR, androidx.profileinstaller.n.c.f73814m, 31);
                        } else {
                            i23 = i22;
                        }
                        if ((i11 & 32) != 0) {
                            q3VarE = x9.f25488a.b(c0VarR, 6).e();
                            i23 &= -458753;
                        } else {
                            q3VarE = q3Var2;
                        }
                        if (i17 != 0) {
                            a1Var3 = null;
                        } else {
                            a1Var3 = a1Var;
                        }
                        if ((i11 & 128) != 0) {
                            o3VarA = p3.f24148a.a(0L, 0L, 0L, 0L, c0VarR, 24576, 15);
                            c0Var3 = c0VarR;
                            i23 &= -29360129;
                        } else {
                            c0Var3 = c0VarR;
                            o3VarA = o3Var;
                        }
                        if (i19 != 0) {
                            g5VarD = p3.f24148a.d();
                        } else {
                            g5VarD = g5Var;
                        }
                        q3Var5 = q3VarE;
                        a1Var4 = a1Var3;
                        z15 = z14;
                        a0Var2 = a0Var4;
                        i24 = i23;
                    } else {
                        if (i26 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        if (i15 != 0) {
                            jVar4 = null;
                        } else {
                            jVar4 = jVar2;
                        }
                        if ((i11 & 16) != 0) {
                            i23 = i22 & (-57345);
                            q3VarB = p3.f24148a.b(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0VarR, androidx.profileinstaller.n.c.f73814m, 31);
                        } else {
                            i23 = i22;
                        }
                        if ((i11 & 32) != 0) {
                            q3VarE = x9.f25488a.b(c0VarR, 6).e();
                            i23 &= -458753;
                        } else {
                            q3VarE = q3Var2;
                        }
                        if (i17 != 0) {
                            a1Var3 = null;
                        } else {
                            a1Var3 = a1Var;
                        }
                        if ((i11 & 128) != 0) {
                            o3VarA = p3.f24148a.a(0L, 0L, 0L, 0L, c0VarR, 24576, 15);
                            c0Var3 = c0VarR;
                            i23 &= -29360129;
                        } else {
                            c0Var3 = c0VarR;
                            o3VarA = o3Var;
                        }
                        if (i19 != 0) {
                            g5VarD = p3.f24148a.d();
                        } else {
                            g5VarD = g5Var;
                        }
                        q3Var5 = q3VarE;
                        a1Var4 = a1Var3;
                        z15 = z14;
                        a0Var2 = a0Var4;
                        i24 = i23;
                    }
                    c0Var3.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1084573925, i24, -1, "androidx.compose.material.Button (Button.kt:105)");
                    }
                    if (jVar4 == null) {
                        c0Var3.E(497772480);
                        objI1 = c0Var3.i0();
                        if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI1 = androidx.compose.foundation.interaction.i.a();
                            c0Var3.Y(objI1);
                        }
                        jVar5 = (androidx.compose.foundation.interaction.j) objI1;
                        c0Var3.A();
                    } else {
                        c0Var3.E(1401529847);
                        c0Var3.A();
                        jVar5 = jVar4;
                    }
                    i25 = i24 >> 6;
                    int i211 = (i25 & 14) | ((i24 >> 18) & com.planner5d.library.engine.input.f.b.B);
                    androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarB4 = o3VarA.b(z15, c0Var3, i211);
                    objI0 = c0Var3.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = new Function1() { // from class: androidx.compose.material.r3
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return t3.e((androidx.compose.ui.semantics.e0) obj);
                            }
                        };
                        c0Var3.Y(objI0);
                    }
                    androidx.compose.ui.a0 a0VarF4 = androidx.compose.ui.semantics.t.f(a0Var2, false, (Function1) objI0, 1, null);
                    long jM4 = o3VarA.a(z15, c0Var3, i211).getValue().M();
                    long jW4 = androidx.compose.ui.graphics.q0.w(d(n7VarB4), 1.0f, 0.0f, 0.0f, 0.0f, 14, null);
                    if (q3VarB == null) {
                        c0Var3.E(498179137);
                        c0Var3.A();
                        n7VarA = null;
                    } else {
                        c0Var3.E(1401543616);
                        n7VarA = q3VarB.a(z15, jVar5, c0Var3, i25 & 910);
                        c0Var3.A();
                    }
                    if (n7VarA != null) {
                        fR = n7VarA.getValue().O();
                    } else {
                        fR = androidx.compose.ui.unit.h.r(0);
                    }
                    androidx.compose.ui.a0 a0Var8 = a0Var2;
                    androidx.compose.runtime.c0 c0Var7 = c0Var3;
                    ah.f(function0, a0VarF4, z15, q3Var5, jM4, jW4, a1Var4, fR, jVar5, androidx.compose.runtime.internal.w.e(-20345758, true, new a(n7VarB4, g5VarD, nVar), c0Var3, 54), c0Var7, (i24 & 14) | 805306368 | (i24 & 896) | (i25 & 7168) | (i24 & 3670016), 0);
                    c0Var2 = c0Var7;
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    q3 q3Var9 = q3VarB;
                    g5Var2 = g5VarD;
                    q3Var4 = q3Var9;
                    o3Var2 = o3VarA;
                    z13 = z15;
                    q3Var3 = q3Var5;
                    a1Var2 = a1Var4;
                    a0Var3 = a0Var8;
                    jVar3 = jVar4;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    q3Var3 = q3Var2;
                    a1Var2 = a1Var;
                    a0Var3 = a0Var2;
                    z13 = z11;
                    jVar3 = jVar2;
                    q3Var4 = q3VarB;
                    o3Var2 = o3Var;
                    g5Var2 = g5Var;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.s3
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return t3.f(function0, a0Var3, z13, jVar3, q3Var4, q3Var3, a1Var2, o3Var2, g5Var2, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= androidx.media3.exoplayer.a5.S0;
            z11 = z10;
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 3072) == 0) {
                    jVar2 = jVar;
                    if (c0VarR.D(jVar2)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                if ((i10 & 24576) == 0) {
                    if ((i11 & 16) == 0) {
                        q3VarB = q3Var;
                        if (c0VarR.D(q3VarB)) {
                        }
                        i12 |= i27;
                    } else {
                        q3VarB = q3Var;
                    }
                    i12 |= i27;
                } else {
                    q3VarB = q3Var;
                }
                if ((196608 & i10) != 0) {
                    i12 |= ((i11 & 32) == 0 || !c0VarR.D(q3Var2)) ? 65536 : 131072;
                }
                i17 = i11 & 64;
                if (i17 != 0) {
                    i12 |= 1572864;
                } else if ((i10 & 1572864) == 0) {
                    if (c0VarR.D(a1Var)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i12 |= i18;
                }
                if ((i10 & 12582912) != 0) {
                    i12 |= ((i11 & 128) == 0 || !c0VarR.D(o3Var)) ? 4194304 : 8388608;
                }
                i19 = i11 & 256;
                if (i19 != 0) {
                    if ((i10 & 100663296) == 0) {
                        if (c0VarR.D(g5Var)) {
                            i20 = 67108864;
                        } else {
                            i20 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i12 |= i20;
                    }
                    if ((i11 & 512) != 0) {
                        i12 |= 805306368;
                    } else if ((i10 & 805306368) == 0) {
                        if (c0VarR.k0(nVar)) {
                            i21 = 536870912;
                        } else {
                            i21 = 268435456;
                        }
                        i12 |= i21;
                    }
                    i22 = i12;
                    if ((306783379 & i22) != 306783378) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (c0VarR.h(z12, i22 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i26 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i13 != 0) {
                                z14 = true;
                            } else {
                                z14 = z11;
                            }
                            if (i15 != 0) {
                                jVar4 = null;
                            } else {
                                jVar4 = jVar2;
                            }
                            if ((i11 & 16) != 0) {
                                i23 = i22 & (-57345);
                                q3VarB = p3.f24148a.b(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0VarR, androidx.profileinstaller.n.c.f73814m, 31);
                            } else {
                                i23 = i22;
                            }
                            if ((i11 & 32) != 0) {
                                q3VarE = x9.f25488a.b(c0VarR, 6).e();
                                i23 &= -458753;
                            } else {
                                q3VarE = q3Var2;
                            }
                            if (i17 != 0) {
                                a1Var3 = null;
                            } else {
                                a1Var3 = a1Var;
                            }
                            if ((i11 & 128) != 0) {
                                o3VarA = p3.f24148a.a(0L, 0L, 0L, 0L, c0VarR, 24576, 15);
                                c0Var3 = c0VarR;
                                i23 &= -29360129;
                            } else {
                                c0Var3 = c0VarR;
                                o3VarA = o3Var;
                            }
                            if (i19 != 0) {
                                g5VarD = p3.f24148a.d();
                            } else {
                                g5VarD = g5Var;
                            }
                            q3Var5 = q3VarE;
                            a1Var4 = a1Var3;
                            z15 = z14;
                            a0Var2 = a0Var4;
                            i24 = i23;
                        } else {
                            if (i26 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i13 != 0) {
                                z14 = true;
                            } else {
                                z14 = z11;
                            }
                            if (i15 != 0) {
                                jVar4 = null;
                            } else {
                                jVar4 = jVar2;
                            }
                            if ((i11 & 16) != 0) {
                                i23 = i22 & (-57345);
                                q3VarB = p3.f24148a.b(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0VarR, androidx.profileinstaller.n.c.f73814m, 31);
                            } else {
                                i23 = i22;
                            }
                            if ((i11 & 32) != 0) {
                                q3VarE = x9.f25488a.b(c0VarR, 6).e();
                                i23 &= -458753;
                            } else {
                                q3VarE = q3Var2;
                            }
                            if (i17 != 0) {
                                a1Var3 = null;
                            } else {
                                a1Var3 = a1Var;
                            }
                            if ((i11 & 128) != 0) {
                                o3VarA = p3.f24148a.a(0L, 0L, 0L, 0L, c0VarR, 24576, 15);
                                c0Var3 = c0VarR;
                                i23 &= -29360129;
                            } else {
                                c0Var3 = c0VarR;
                                o3VarA = o3Var;
                            }
                            if (i19 != 0) {
                                g5VarD = p3.f24148a.d();
                            } else {
                                g5VarD = g5Var;
                            }
                            q3Var5 = q3VarE;
                            a1Var4 = a1Var3;
                            z15 = z14;
                            a0Var2 = a0Var4;
                            i24 = i23;
                        }
                        c0Var3.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-1084573925, i24, -1, "androidx.compose.material.Button (Button.kt:105)");
                        }
                        if (jVar4 == null) {
                            c0Var3.E(497772480);
                            objI1 = c0Var3.i0();
                            if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI1 = androidx.compose.foundation.interaction.i.a();
                                c0Var3.Y(objI1);
                            }
                            jVar5 = (androidx.compose.foundation.interaction.j) objI1;
                            c0Var3.A();
                        } else {
                            c0Var3.E(1401529847);
                            c0Var3.A();
                            jVar5 = jVar4;
                        }
                        i25 = i24 >> 6;
                        int i212 = (i25 & 14) | ((i24 >> 18) & com.planner5d.library.engine.input.f.b.B);
                        androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarB5 = o3VarA.b(z15, c0Var3, i212);
                        objI0 = c0Var3.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = new Function1() { // from class: androidx.compose.material.r3
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return t3.e((androidx.compose.ui.semantics.e0) obj);
                                }
                            };
                            c0Var3.Y(objI0);
                        }
                        androidx.compose.ui.a0 a0VarF5 = androidx.compose.ui.semantics.t.f(a0Var2, false, (Function1) objI0, 1, null);
                        long jM5 = o3VarA.a(z15, c0Var3, i212).getValue().M();
                        long jW5 = androidx.compose.ui.graphics.q0.w(d(n7VarB5), 1.0f, 0.0f, 0.0f, 0.0f, 14, null);
                        if (q3VarB == null) {
                            c0Var3.E(498179137);
                            c0Var3.A();
                            n7VarA = null;
                        } else {
                            c0Var3.E(1401543616);
                            n7VarA = q3VarB.a(z15, jVar5, c0Var3, i25 & 910);
                            c0Var3.A();
                        }
                        if (n7VarA != null) {
                            fR = n7VarA.getValue().O();
                        } else {
                            fR = androidx.compose.ui.unit.h.r(0);
                        }
                        androidx.compose.ui.a0 a0Var9 = a0Var2;
                        androidx.compose.runtime.c0 c0Var8 = c0Var3;
                        ah.f(function0, a0VarF5, z15, q3Var5, jM5, jW5, a1Var4, fR, jVar5, androidx.compose.runtime.internal.w.e(-20345758, true, new a(n7VarB5, g5VarD, nVar), c0Var3, 54), c0Var8, (i24 & 14) | 805306368 | (i24 & 896) | (i25 & 7168) | (i24 & 3670016), 0);
                        c0Var2 = c0Var8;
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        q3 q3Var10 = q3VarB;
                        g5Var2 = g5VarD;
                        q3Var4 = q3Var10;
                        o3Var2 = o3VarA;
                        z13 = z15;
                        q3Var3 = q3Var5;
                        a1Var2 = a1Var4;
                        a0Var3 = a0Var9;
                        jVar3 = jVar4;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        q3Var3 = q3Var2;
                        a1Var2 = a1Var;
                        a0Var3 = a0Var2;
                        z13 = z11;
                        jVar3 = jVar2;
                        q3Var4 = q3VarB;
                        o3Var2 = o3Var;
                        g5Var2 = g5Var;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material.s3
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return t3.f(function0, a0Var3, z13, jVar3, q3Var4, q3Var3, a1Var2, o3Var2, g5Var2, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 100663296;
                if ((i11 & 512) != 0) {
                    i12 |= 805306368;
                } else if ((i10 & 805306368) == 0) {
                    if (c0VarR.k0(nVar)) {
                        i21 = 536870912;
                    } else {
                        i21 = 268435456;
                    }
                    i12 |= i21;
                }
                i22 = i12;
                if ((306783379 & i22) != 306783378) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i22 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i26 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        if (i15 != 0) {
                            jVar4 = null;
                        } else {
                            jVar4 = jVar2;
                        }
                        if ((i11 & 16) != 0) {
                            i23 = i22 & (-57345);
                            q3VarB = p3.f24148a.b(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0VarR, androidx.profileinstaller.n.c.f73814m, 31);
                        } else {
                            i23 = i22;
                        }
                        if ((i11 & 32) != 0) {
                            q3VarE = x9.f25488a.b(c0VarR, 6).e();
                            i23 &= -458753;
                        } else {
                            q3VarE = q3Var2;
                        }
                        if (i17 != 0) {
                            a1Var3 = null;
                        } else {
                            a1Var3 = a1Var;
                        }
                        if ((i11 & 128) != 0) {
                            o3VarA = p3.f24148a.a(0L, 0L, 0L, 0L, c0VarR, 24576, 15);
                            c0Var3 = c0VarR;
                            i23 &= -29360129;
                        } else {
                            c0Var3 = c0VarR;
                            o3VarA = o3Var;
                        }
                        if (i19 != 0) {
                            g5VarD = p3.f24148a.d();
                        } else {
                            g5VarD = g5Var;
                        }
                        q3Var5 = q3VarE;
                        a1Var4 = a1Var3;
                        z15 = z14;
                        a0Var2 = a0Var4;
                        i24 = i23;
                    } else {
                        if (i26 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        if (i15 != 0) {
                            jVar4 = null;
                        } else {
                            jVar4 = jVar2;
                        }
                        if ((i11 & 16) != 0) {
                            i23 = i22 & (-57345);
                            q3VarB = p3.f24148a.b(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0VarR, androidx.profileinstaller.n.c.f73814m, 31);
                        } else {
                            i23 = i22;
                        }
                        if ((i11 & 32) != 0) {
                            q3VarE = x9.f25488a.b(c0VarR, 6).e();
                            i23 &= -458753;
                        } else {
                            q3VarE = q3Var2;
                        }
                        if (i17 != 0) {
                            a1Var3 = null;
                        } else {
                            a1Var3 = a1Var;
                        }
                        if ((i11 & 128) != 0) {
                            o3VarA = p3.f24148a.a(0L, 0L, 0L, 0L, c0VarR, 24576, 15);
                            c0Var3 = c0VarR;
                            i23 &= -29360129;
                        } else {
                            c0Var3 = c0VarR;
                            o3VarA = o3Var;
                        }
                        if (i19 != 0) {
                            g5VarD = p3.f24148a.d();
                        } else {
                            g5VarD = g5Var;
                        }
                        q3Var5 = q3VarE;
                        a1Var4 = a1Var3;
                        z15 = z14;
                        a0Var2 = a0Var4;
                        i24 = i23;
                    }
                    c0Var3.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1084573925, i24, -1, "androidx.compose.material.Button (Button.kt:105)");
                    }
                    if (jVar4 == null) {
                        c0Var3.E(497772480);
                        objI1 = c0Var3.i0();
                        if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI1 = androidx.compose.foundation.interaction.i.a();
                            c0Var3.Y(objI1);
                        }
                        jVar5 = (androidx.compose.foundation.interaction.j) objI1;
                        c0Var3.A();
                    } else {
                        c0Var3.E(1401529847);
                        c0Var3.A();
                        jVar5 = jVar4;
                    }
                    i25 = i24 >> 6;
                    int i213 = (i25 & 14) | ((i24 >> 18) & com.planner5d.library.engine.input.f.b.B);
                    androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarB6 = o3VarA.b(z15, c0Var3, i213);
                    objI0 = c0Var3.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = new Function1() { // from class: androidx.compose.material.r3
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return t3.e((androidx.compose.ui.semantics.e0) obj);
                            }
                        };
                        c0Var3.Y(objI0);
                    }
                    androidx.compose.ui.a0 a0VarF6 = androidx.compose.ui.semantics.t.f(a0Var2, false, (Function1) objI0, 1, null);
                    long jM6 = o3VarA.a(z15, c0Var3, i213).getValue().M();
                    long jW6 = androidx.compose.ui.graphics.q0.w(d(n7VarB6), 1.0f, 0.0f, 0.0f, 0.0f, 14, null);
                    if (q3VarB == null) {
                        c0Var3.E(498179137);
                        c0Var3.A();
                        n7VarA = null;
                    } else {
                        c0Var3.E(1401543616);
                        n7VarA = q3VarB.a(z15, jVar5, c0Var3, i25 & 910);
                        c0Var3.A();
                    }
                    if (n7VarA != null) {
                        fR = n7VarA.getValue().O();
                    } else {
                        fR = androidx.compose.ui.unit.h.r(0);
                    }
                    androidx.compose.ui.a0 a0Var10 = a0Var2;
                    androidx.compose.runtime.c0 c0Var9 = c0Var3;
                    ah.f(function0, a0VarF6, z15, q3Var5, jM6, jW6, a1Var4, fR, jVar5, androidx.compose.runtime.internal.w.e(-20345758, true, new a(n7VarB6, g5VarD, nVar), c0Var3, 54), c0Var9, (i24 & 14) | 805306368 | (i24 & 896) | (i25 & 7168) | (i24 & 3670016), 0);
                    c0Var2 = c0Var9;
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    q3 q3Var11 = q3VarB;
                    g5Var2 = g5VarD;
                    q3Var4 = q3Var11;
                    o3Var2 = o3VarA;
                    z13 = z15;
                    q3Var3 = q3Var5;
                    a1Var2 = a1Var4;
                    a0Var3 = a0Var10;
                    jVar3 = jVar4;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    q3Var3 = q3Var2;
                    a1Var2 = a1Var;
                    a0Var3 = a0Var2;
                    z13 = z11;
                    jVar3 = jVar2;
                    q3Var4 = q3VarB;
                    o3Var2 = o3Var;
                    g5Var2 = g5Var;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.s3
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return t3.f(function0, a0Var3, z13, jVar3, q3Var4, q3Var3, a1Var2, o3Var2, g5Var2, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 3072;
            jVar2 = jVar;
            if ((i10 & 24576) == 0) {
                if ((i11 & 16) == 0) {
                    q3VarB = q3Var;
                    if (c0VarR.D(q3VarB)) {
                    }
                    i12 |= i27;
                } else {
                    q3VarB = q3Var;
                }
                i12 |= i27;
            } else {
                q3VarB = q3Var;
            }
            if ((196608 & i10) != 0) {
                i12 |= ((i11 & 32) == 0 || !c0VarR.D(q3Var2)) ? 65536 : 131072;
            }
            i17 = i11 & 64;
            if (i17 != 0) {
                i12 |= 1572864;
            } else if ((i10 & 1572864) == 0) {
                if (c0VarR.D(a1Var)) {
                    i18 = 1048576;
                } else {
                    i18 = 524288;
                }
                i12 |= i18;
            }
            if ((i10 & 12582912) != 0) {
                i12 |= ((i11 & 128) == 0 || !c0VarR.D(o3Var)) ? 4194304 : 8388608;
            }
            i19 = i11 & 256;
            if (i19 != 0) {
                if ((i10 & 100663296) == 0) {
                    if (c0VarR.D(g5Var)) {
                        i20 = 67108864;
                    } else {
                        i20 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i12 |= i20;
                }
                if ((i11 & 512) != 0) {
                    i12 |= 805306368;
                } else if ((i10 & 805306368) == 0) {
                    if (c0VarR.k0(nVar)) {
                        i21 = 536870912;
                    } else {
                        i21 = 268435456;
                    }
                    i12 |= i21;
                }
                i22 = i12;
                if ((306783379 & i22) != 306783378) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i22 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i26 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        if (i15 != 0) {
                            jVar4 = null;
                        } else {
                            jVar4 = jVar2;
                        }
                        if ((i11 & 16) != 0) {
                            i23 = i22 & (-57345);
                            q3VarB = p3.f24148a.b(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0VarR, androidx.profileinstaller.n.c.f73814m, 31);
                        } else {
                            i23 = i22;
                        }
                        if ((i11 & 32) != 0) {
                            q3VarE = x9.f25488a.b(c0VarR, 6).e();
                            i23 &= -458753;
                        } else {
                            q3VarE = q3Var2;
                        }
                        if (i17 != 0) {
                            a1Var3 = null;
                        } else {
                            a1Var3 = a1Var;
                        }
                        if ((i11 & 128) != 0) {
                            o3VarA = p3.f24148a.a(0L, 0L, 0L, 0L, c0VarR, 24576, 15);
                            c0Var3 = c0VarR;
                            i23 &= -29360129;
                        } else {
                            c0Var3 = c0VarR;
                            o3VarA = o3Var;
                        }
                        if (i19 != 0) {
                            g5VarD = p3.f24148a.d();
                        } else {
                            g5VarD = g5Var;
                        }
                        q3Var5 = q3VarE;
                        a1Var4 = a1Var3;
                        z15 = z14;
                        a0Var2 = a0Var4;
                        i24 = i23;
                    } else {
                        if (i26 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        if (i15 != 0) {
                            jVar4 = null;
                        } else {
                            jVar4 = jVar2;
                        }
                        if ((i11 & 16) != 0) {
                            i23 = i22 & (-57345);
                            q3VarB = p3.f24148a.b(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0VarR, androidx.profileinstaller.n.c.f73814m, 31);
                        } else {
                            i23 = i22;
                        }
                        if ((i11 & 32) != 0) {
                            q3VarE = x9.f25488a.b(c0VarR, 6).e();
                            i23 &= -458753;
                        } else {
                            q3VarE = q3Var2;
                        }
                        if (i17 != 0) {
                            a1Var3 = null;
                        } else {
                            a1Var3 = a1Var;
                        }
                        if ((i11 & 128) != 0) {
                            o3VarA = p3.f24148a.a(0L, 0L, 0L, 0L, c0VarR, 24576, 15);
                            c0Var3 = c0VarR;
                            i23 &= -29360129;
                        } else {
                            c0Var3 = c0VarR;
                            o3VarA = o3Var;
                        }
                        if (i19 != 0) {
                            g5VarD = p3.f24148a.d();
                        } else {
                            g5VarD = g5Var;
                        }
                        q3Var5 = q3VarE;
                        a1Var4 = a1Var3;
                        z15 = z14;
                        a0Var2 = a0Var4;
                        i24 = i23;
                    }
                    c0Var3.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1084573925, i24, -1, "androidx.compose.material.Button (Button.kt:105)");
                    }
                    if (jVar4 == null) {
                        c0Var3.E(497772480);
                        objI1 = c0Var3.i0();
                        if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI1 = androidx.compose.foundation.interaction.i.a();
                            c0Var3.Y(objI1);
                        }
                        jVar5 = (androidx.compose.foundation.interaction.j) objI1;
                        c0Var3.A();
                    } else {
                        c0Var3.E(1401529847);
                        c0Var3.A();
                        jVar5 = jVar4;
                    }
                    i25 = i24 >> 6;
                    int i214 = (i25 & 14) | ((i24 >> 18) & com.planner5d.library.engine.input.f.b.B);
                    androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarB7 = o3VarA.b(z15, c0Var3, i214);
                    objI0 = c0Var3.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = new Function1() { // from class: androidx.compose.material.r3
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return t3.e((androidx.compose.ui.semantics.e0) obj);
                            }
                        };
                        c0Var3.Y(objI0);
                    }
                    androidx.compose.ui.a0 a0VarF7 = androidx.compose.ui.semantics.t.f(a0Var2, false, (Function1) objI0, 1, null);
                    long jM7 = o3VarA.a(z15, c0Var3, i214).getValue().M();
                    long jW7 = androidx.compose.ui.graphics.q0.w(d(n7VarB7), 1.0f, 0.0f, 0.0f, 0.0f, 14, null);
                    if (q3VarB == null) {
                        c0Var3.E(498179137);
                        c0Var3.A();
                        n7VarA = null;
                    } else {
                        c0Var3.E(1401543616);
                        n7VarA = q3VarB.a(z15, jVar5, c0Var3, i25 & 910);
                        c0Var3.A();
                    }
                    if (n7VarA != null) {
                        fR = n7VarA.getValue().O();
                    } else {
                        fR = androidx.compose.ui.unit.h.r(0);
                    }
                    androidx.compose.ui.a0 a0Var11 = a0Var2;
                    androidx.compose.runtime.c0 c0Var10 = c0Var3;
                    ah.f(function0, a0VarF7, z15, q3Var5, jM7, jW7, a1Var4, fR, jVar5, androidx.compose.runtime.internal.w.e(-20345758, true, new a(n7VarB7, g5VarD, nVar), c0Var3, 54), c0Var10, (i24 & 14) | 805306368 | (i24 & 896) | (i25 & 7168) | (i24 & 3670016), 0);
                    c0Var2 = c0Var10;
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    q3 q3Var12 = q3VarB;
                    g5Var2 = g5VarD;
                    q3Var4 = q3Var12;
                    o3Var2 = o3VarA;
                    z13 = z15;
                    q3Var3 = q3Var5;
                    a1Var2 = a1Var4;
                    a0Var3 = a0Var11;
                    jVar3 = jVar4;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    q3Var3 = q3Var2;
                    a1Var2 = a1Var;
                    a0Var3 = a0Var2;
                    z13 = z11;
                    jVar3 = jVar2;
                    q3Var4 = q3VarB;
                    o3Var2 = o3Var;
                    g5Var2 = g5Var;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.s3
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return t3.f(function0, a0Var3, z13, jVar3, q3Var4, q3Var3, a1Var2, o3Var2, g5Var2, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 100663296;
            if ((i11 & 512) != 0) {
                i12 |= 805306368;
            } else if ((i10 & 805306368) == 0) {
                if (c0VarR.k0(nVar)) {
                    i21 = 536870912;
                } else {
                    i21 = 268435456;
                }
                i12 |= i21;
            }
            i22 = i12;
            if ((306783379 & i22) != 306783378) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i22 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i26 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    if (i15 != 0) {
                        jVar4 = null;
                    } else {
                        jVar4 = jVar2;
                    }
                    if ((i11 & 16) != 0) {
                        i23 = i22 & (-57345);
                        q3VarB = p3.f24148a.b(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0VarR, androidx.profileinstaller.n.c.f73814m, 31);
                    } else {
                        i23 = i22;
                    }
                    if ((i11 & 32) != 0) {
                        q3VarE = x9.f25488a.b(c0VarR, 6).e();
                        i23 &= -458753;
                    } else {
                        q3VarE = q3Var2;
                    }
                    if (i17 != 0) {
                        a1Var3 = null;
                    } else {
                        a1Var3 = a1Var;
                    }
                    if ((i11 & 128) != 0) {
                        o3VarA = p3.f24148a.a(0L, 0L, 0L, 0L, c0VarR, 24576, 15);
                        c0Var3 = c0VarR;
                        i23 &= -29360129;
                    } else {
                        c0Var3 = c0VarR;
                        o3VarA = o3Var;
                    }
                    if (i19 != 0) {
                        g5VarD = p3.f24148a.d();
                    } else {
                        g5VarD = g5Var;
                    }
                    q3Var5 = q3VarE;
                    a1Var4 = a1Var3;
                    z15 = z14;
                    a0Var2 = a0Var4;
                    i24 = i23;
                } else {
                    if (i26 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    if (i15 != 0) {
                        jVar4 = null;
                    } else {
                        jVar4 = jVar2;
                    }
                    if ((i11 & 16) != 0) {
                        i23 = i22 & (-57345);
                        q3VarB = p3.f24148a.b(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0VarR, androidx.profileinstaller.n.c.f73814m, 31);
                    } else {
                        i23 = i22;
                    }
                    if ((i11 & 32) != 0) {
                        q3VarE = x9.f25488a.b(c0VarR, 6).e();
                        i23 &= -458753;
                    } else {
                        q3VarE = q3Var2;
                    }
                    if (i17 != 0) {
                        a1Var3 = null;
                    } else {
                        a1Var3 = a1Var;
                    }
                    if ((i11 & 128) != 0) {
                        o3VarA = p3.f24148a.a(0L, 0L, 0L, 0L, c0VarR, 24576, 15);
                        c0Var3 = c0VarR;
                        i23 &= -29360129;
                    } else {
                        c0Var3 = c0VarR;
                        o3VarA = o3Var;
                    }
                    if (i19 != 0) {
                        g5VarD = p3.f24148a.d();
                    } else {
                        g5VarD = g5Var;
                    }
                    q3Var5 = q3VarE;
                    a1Var4 = a1Var3;
                    z15 = z14;
                    a0Var2 = a0Var4;
                    i24 = i23;
                }
                c0Var3.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1084573925, i24, -1, "androidx.compose.material.Button (Button.kt:105)");
                }
                if (jVar4 == null) {
                    c0Var3.E(497772480);
                    objI1 = c0Var3.i0();
                    if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI1 = androidx.compose.foundation.interaction.i.a();
                        c0Var3.Y(objI1);
                    }
                    jVar5 = (androidx.compose.foundation.interaction.j) objI1;
                    c0Var3.A();
                } else {
                    c0Var3.E(1401529847);
                    c0Var3.A();
                    jVar5 = jVar4;
                }
                i25 = i24 >> 6;
                int i215 = (i25 & 14) | ((i24 >> 18) & com.planner5d.library.engine.input.f.b.B);
                androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarB8 = o3VarA.b(z15, c0Var3, i215);
                objI0 = c0Var3.i0();
                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = new Function1() { // from class: androidx.compose.material.r3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return t3.e((androidx.compose.ui.semantics.e0) obj);
                        }
                    };
                    c0Var3.Y(objI0);
                }
                androidx.compose.ui.a0 a0VarF8 = androidx.compose.ui.semantics.t.f(a0Var2, false, (Function1) objI0, 1, null);
                long jM8 = o3VarA.a(z15, c0Var3, i215).getValue().M();
                long jW8 = androidx.compose.ui.graphics.q0.w(d(n7VarB8), 1.0f, 0.0f, 0.0f, 0.0f, 14, null);
                if (q3VarB == null) {
                    c0Var3.E(498179137);
                    c0Var3.A();
                    n7VarA = null;
                } else {
                    c0Var3.E(1401543616);
                    n7VarA = q3VarB.a(z15, jVar5, c0Var3, i25 & 910);
                    c0Var3.A();
                }
                if (n7VarA != null) {
                    fR = n7VarA.getValue().O();
                } else {
                    fR = androidx.compose.ui.unit.h.r(0);
                }
                androidx.compose.ui.a0 a0Var12 = a0Var2;
                androidx.compose.runtime.c0 c0Var11 = c0Var3;
                ah.f(function0, a0VarF8, z15, q3Var5, jM8, jW8, a1Var4, fR, jVar5, androidx.compose.runtime.internal.w.e(-20345758, true, new a(n7VarB8, g5VarD, nVar), c0Var3, 54), c0Var11, (i24 & 14) | 805306368 | (i24 & 896) | (i25 & 7168) | (i24 & 3670016), 0);
                c0Var2 = c0Var11;
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                q3 q3Var13 = q3VarB;
                g5Var2 = g5VarD;
                q3Var4 = q3Var13;
                o3Var2 = o3VarA;
                z13 = z15;
                q3Var3 = q3Var5;
                a1Var2 = a1Var4;
                a0Var3 = a0Var12;
                jVar3 = jVar4;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                q3Var3 = q3Var2;
                a1Var2 = a1Var;
                a0Var3 = a0Var2;
                z13 = z11;
                jVar3 = jVar2;
                q3Var4 = q3VarB;
                o3Var2 = o3Var;
                g5Var2 = g5Var;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material.s3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return t3.f(function0, a0Var3, z13, jVar3, q3Var4, q3Var3, a1Var2, o3Var2, g5Var2, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
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
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 3072) == 0) {
                    jVar2 = jVar;
                    if (c0VarR.D(jVar2)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                if ((i10 & 24576) == 0) {
                    if ((i11 & 16) == 0) {
                        q3VarB = q3Var;
                        if (c0VarR.D(q3VarB)) {
                        }
                        i12 |= i27;
                    } else {
                        q3VarB = q3Var;
                    }
                    i12 |= i27;
                } else {
                    q3VarB = q3Var;
                }
                if ((196608 & i10) != 0) {
                    i12 |= ((i11 & 32) == 0 || !c0VarR.D(q3Var2)) ? 65536 : 131072;
                }
                i17 = i11 & 64;
                if (i17 != 0) {
                    i12 |= 1572864;
                } else if ((i10 & 1572864) == 0) {
                    if (c0VarR.D(a1Var)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i12 |= i18;
                }
                if ((i10 & 12582912) != 0) {
                    i12 |= ((i11 & 128) == 0 || !c0VarR.D(o3Var)) ? 4194304 : 8388608;
                }
                i19 = i11 & 256;
                if (i19 != 0) {
                    if ((i10 & 100663296) == 0) {
                        if (c0VarR.D(g5Var)) {
                            i20 = 67108864;
                        } else {
                            i20 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i12 |= i20;
                    }
                    if ((i11 & 512) != 0) {
                        i12 |= 805306368;
                    } else if ((i10 & 805306368) == 0) {
                        if (c0VarR.k0(nVar)) {
                            i21 = 536870912;
                        } else {
                            i21 = 268435456;
                        }
                        i12 |= i21;
                    }
                    i22 = i12;
                    if ((306783379 & i22) != 306783378) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (c0VarR.h(z12, i22 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i26 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i13 != 0) {
                                z14 = true;
                            } else {
                                z14 = z11;
                            }
                            if (i15 != 0) {
                                jVar4 = null;
                            } else {
                                jVar4 = jVar2;
                            }
                            if ((i11 & 16) != 0) {
                                i23 = i22 & (-57345);
                                q3VarB = p3.f24148a.b(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0VarR, androidx.profileinstaller.n.c.f73814m, 31);
                            } else {
                                i23 = i22;
                            }
                            if ((i11 & 32) != 0) {
                                q3VarE = x9.f25488a.b(c0VarR, 6).e();
                                i23 &= -458753;
                            } else {
                                q3VarE = q3Var2;
                            }
                            if (i17 != 0) {
                                a1Var3 = null;
                            } else {
                                a1Var3 = a1Var;
                            }
                            if ((i11 & 128) != 0) {
                                o3VarA = p3.f24148a.a(0L, 0L, 0L, 0L, c0VarR, 24576, 15);
                                c0Var3 = c0VarR;
                                i23 &= -29360129;
                            } else {
                                c0Var3 = c0VarR;
                                o3VarA = o3Var;
                            }
                            if (i19 != 0) {
                                g5VarD = p3.f24148a.d();
                            } else {
                                g5VarD = g5Var;
                            }
                            q3Var5 = q3VarE;
                            a1Var4 = a1Var3;
                            z15 = z14;
                            a0Var2 = a0Var4;
                            i24 = i23;
                        } else {
                            if (i26 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i13 != 0) {
                                z14 = true;
                            } else {
                                z14 = z11;
                            }
                            if (i15 != 0) {
                                jVar4 = null;
                            } else {
                                jVar4 = jVar2;
                            }
                            if ((i11 & 16) != 0) {
                                i23 = i22 & (-57345);
                                q3VarB = p3.f24148a.b(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0VarR, androidx.profileinstaller.n.c.f73814m, 31);
                            } else {
                                i23 = i22;
                            }
                            if ((i11 & 32) != 0) {
                                q3VarE = x9.f25488a.b(c0VarR, 6).e();
                                i23 &= -458753;
                            } else {
                                q3VarE = q3Var2;
                            }
                            if (i17 != 0) {
                                a1Var3 = null;
                            } else {
                                a1Var3 = a1Var;
                            }
                            if ((i11 & 128) != 0) {
                                o3VarA = p3.f24148a.a(0L, 0L, 0L, 0L, c0VarR, 24576, 15);
                                c0Var3 = c0VarR;
                                i23 &= -29360129;
                            } else {
                                c0Var3 = c0VarR;
                                o3VarA = o3Var;
                            }
                            if (i19 != 0) {
                                g5VarD = p3.f24148a.d();
                            } else {
                                g5VarD = g5Var;
                            }
                            q3Var5 = q3VarE;
                            a1Var4 = a1Var3;
                            z15 = z14;
                            a0Var2 = a0Var4;
                            i24 = i23;
                        }
                        c0Var3.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-1084573925, i24, -1, "androidx.compose.material.Button (Button.kt:105)");
                        }
                        if (jVar4 == null) {
                            c0Var3.E(497772480);
                            objI1 = c0Var3.i0();
                            if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI1 = androidx.compose.foundation.interaction.i.a();
                                c0Var3.Y(objI1);
                            }
                            jVar5 = (androidx.compose.foundation.interaction.j) objI1;
                            c0Var3.A();
                        } else {
                            c0Var3.E(1401529847);
                            c0Var3.A();
                            jVar5 = jVar4;
                        }
                        i25 = i24 >> 6;
                        int i216 = (i25 & 14) | ((i24 >> 18) & com.planner5d.library.engine.input.f.b.B);
                        androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarB9 = o3VarA.b(z15, c0Var3, i216);
                        objI0 = c0Var3.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = new Function1() { // from class: androidx.compose.material.r3
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return t3.e((androidx.compose.ui.semantics.e0) obj);
                                }
                            };
                            c0Var3.Y(objI0);
                        }
                        androidx.compose.ui.a0 a0VarF9 = androidx.compose.ui.semantics.t.f(a0Var2, false, (Function1) objI0, 1, null);
                        long jM9 = o3VarA.a(z15, c0Var3, i216).getValue().M();
                        long jW9 = androidx.compose.ui.graphics.q0.w(d(n7VarB9), 1.0f, 0.0f, 0.0f, 0.0f, 14, null);
                        if (q3VarB == null) {
                            c0Var3.E(498179137);
                            c0Var3.A();
                            n7VarA = null;
                        } else {
                            c0Var3.E(1401543616);
                            n7VarA = q3VarB.a(z15, jVar5, c0Var3, i25 & 910);
                            c0Var3.A();
                        }
                        if (n7VarA != null) {
                            fR = n7VarA.getValue().O();
                        } else {
                            fR = androidx.compose.ui.unit.h.r(0);
                        }
                        androidx.compose.ui.a0 a0Var13 = a0Var2;
                        androidx.compose.runtime.c0 c0Var12 = c0Var3;
                        ah.f(function0, a0VarF9, z15, q3Var5, jM9, jW9, a1Var4, fR, jVar5, androidx.compose.runtime.internal.w.e(-20345758, true, new a(n7VarB9, g5VarD, nVar), c0Var3, 54), c0Var12, (i24 & 14) | 805306368 | (i24 & 896) | (i25 & 7168) | (i24 & 3670016), 0);
                        c0Var2 = c0Var12;
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        q3 q3Var14 = q3VarB;
                        g5Var2 = g5VarD;
                        q3Var4 = q3Var14;
                        o3Var2 = o3VarA;
                        z13 = z15;
                        q3Var3 = q3Var5;
                        a1Var2 = a1Var4;
                        a0Var3 = a0Var13;
                        jVar3 = jVar4;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        q3Var3 = q3Var2;
                        a1Var2 = a1Var;
                        a0Var3 = a0Var2;
                        z13 = z11;
                        jVar3 = jVar2;
                        q3Var4 = q3VarB;
                        o3Var2 = o3Var;
                        g5Var2 = g5Var;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material.s3
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return t3.f(function0, a0Var3, z13, jVar3, q3Var4, q3Var3, a1Var2, o3Var2, g5Var2, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 100663296;
                if ((i11 & 512) != 0) {
                    i12 |= 805306368;
                } else if ((i10 & 805306368) == 0) {
                    if (c0VarR.k0(nVar)) {
                        i21 = 536870912;
                    } else {
                        i21 = 268435456;
                    }
                    i12 |= i21;
                }
                i22 = i12;
                if ((306783379 & i22) != 306783378) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i22 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i26 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        if (i15 != 0) {
                            jVar4 = null;
                        } else {
                            jVar4 = jVar2;
                        }
                        if ((i11 & 16) != 0) {
                            i23 = i22 & (-57345);
                            q3VarB = p3.f24148a.b(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0VarR, androidx.profileinstaller.n.c.f73814m, 31);
                        } else {
                            i23 = i22;
                        }
                        if ((i11 & 32) != 0) {
                            q3VarE = x9.f25488a.b(c0VarR, 6).e();
                            i23 &= -458753;
                        } else {
                            q3VarE = q3Var2;
                        }
                        if (i17 != 0) {
                            a1Var3 = null;
                        } else {
                            a1Var3 = a1Var;
                        }
                        if ((i11 & 128) != 0) {
                            o3VarA = p3.f24148a.a(0L, 0L, 0L, 0L, c0VarR, 24576, 15);
                            c0Var3 = c0VarR;
                            i23 &= -29360129;
                        } else {
                            c0Var3 = c0VarR;
                            o3VarA = o3Var;
                        }
                        if (i19 != 0) {
                            g5VarD = p3.f24148a.d();
                        } else {
                            g5VarD = g5Var;
                        }
                        q3Var5 = q3VarE;
                        a1Var4 = a1Var3;
                        z15 = z14;
                        a0Var2 = a0Var4;
                        i24 = i23;
                    } else {
                        if (i26 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        if (i15 != 0) {
                            jVar4 = null;
                        } else {
                            jVar4 = jVar2;
                        }
                        if ((i11 & 16) != 0) {
                            i23 = i22 & (-57345);
                            q3VarB = p3.f24148a.b(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0VarR, androidx.profileinstaller.n.c.f73814m, 31);
                        } else {
                            i23 = i22;
                        }
                        if ((i11 & 32) != 0) {
                            q3VarE = x9.f25488a.b(c0VarR, 6).e();
                            i23 &= -458753;
                        } else {
                            q3VarE = q3Var2;
                        }
                        if (i17 != 0) {
                            a1Var3 = null;
                        } else {
                            a1Var3 = a1Var;
                        }
                        if ((i11 & 128) != 0) {
                            o3VarA = p3.f24148a.a(0L, 0L, 0L, 0L, c0VarR, 24576, 15);
                            c0Var3 = c0VarR;
                            i23 &= -29360129;
                        } else {
                            c0Var3 = c0VarR;
                            o3VarA = o3Var;
                        }
                        if (i19 != 0) {
                            g5VarD = p3.f24148a.d();
                        } else {
                            g5VarD = g5Var;
                        }
                        q3Var5 = q3VarE;
                        a1Var4 = a1Var3;
                        z15 = z14;
                        a0Var2 = a0Var4;
                        i24 = i23;
                    }
                    c0Var3.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1084573925, i24, -1, "androidx.compose.material.Button (Button.kt:105)");
                    }
                    if (jVar4 == null) {
                        c0Var3.E(497772480);
                        objI1 = c0Var3.i0();
                        if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI1 = androidx.compose.foundation.interaction.i.a();
                            c0Var3.Y(objI1);
                        }
                        jVar5 = (androidx.compose.foundation.interaction.j) objI1;
                        c0Var3.A();
                    } else {
                        c0Var3.E(1401529847);
                        c0Var3.A();
                        jVar5 = jVar4;
                    }
                    i25 = i24 >> 6;
                    int i217 = (i25 & 14) | ((i24 >> 18) & com.planner5d.library.engine.input.f.b.B);
                    androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarB10 = o3VarA.b(z15, c0Var3, i217);
                    objI0 = c0Var3.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = new Function1() { // from class: androidx.compose.material.r3
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return t3.e((androidx.compose.ui.semantics.e0) obj);
                            }
                        };
                        c0Var3.Y(objI0);
                    }
                    androidx.compose.ui.a0 a0VarF10 = androidx.compose.ui.semantics.t.f(a0Var2, false, (Function1) objI0, 1, null);
                    long jM10 = o3VarA.a(z15, c0Var3, i217).getValue().M();
                    long jW10 = androidx.compose.ui.graphics.q0.w(d(n7VarB10), 1.0f, 0.0f, 0.0f, 0.0f, 14, null);
                    if (q3VarB == null) {
                        c0Var3.E(498179137);
                        c0Var3.A();
                        n7VarA = null;
                    } else {
                        c0Var3.E(1401543616);
                        n7VarA = q3VarB.a(z15, jVar5, c0Var3, i25 & 910);
                        c0Var3.A();
                    }
                    if (n7VarA != null) {
                        fR = n7VarA.getValue().O();
                    } else {
                        fR = androidx.compose.ui.unit.h.r(0);
                    }
                    androidx.compose.ui.a0 a0Var14 = a0Var2;
                    androidx.compose.runtime.c0 c0Var13 = c0Var3;
                    ah.f(function0, a0VarF10, z15, q3Var5, jM10, jW10, a1Var4, fR, jVar5, androidx.compose.runtime.internal.w.e(-20345758, true, new a(n7VarB10, g5VarD, nVar), c0Var3, 54), c0Var13, (i24 & 14) | 805306368 | (i24 & 896) | (i25 & 7168) | (i24 & 3670016), 0);
                    c0Var2 = c0Var13;
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    q3 q3Var15 = q3VarB;
                    g5Var2 = g5VarD;
                    q3Var4 = q3Var15;
                    o3Var2 = o3VarA;
                    z13 = z15;
                    q3Var3 = q3Var5;
                    a1Var2 = a1Var4;
                    a0Var3 = a0Var14;
                    jVar3 = jVar4;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    q3Var3 = q3Var2;
                    a1Var2 = a1Var;
                    a0Var3 = a0Var2;
                    z13 = z11;
                    jVar3 = jVar2;
                    q3Var4 = q3VarB;
                    o3Var2 = o3Var;
                    g5Var2 = g5Var;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.s3
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return t3.f(function0, a0Var3, z13, jVar3, q3Var4, q3Var3, a1Var2, o3Var2, g5Var2, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 3072;
            jVar2 = jVar;
            if ((i10 & 24576) == 0) {
                if ((i11 & 16) == 0) {
                    q3VarB = q3Var;
                    if (c0VarR.D(q3VarB)) {
                    }
                    i12 |= i27;
                } else {
                    q3VarB = q3Var;
                }
                i12 |= i27;
            } else {
                q3VarB = q3Var;
            }
            if ((196608 & i10) != 0) {
                i12 |= ((i11 & 32) == 0 || !c0VarR.D(q3Var2)) ? 65536 : 131072;
            }
            i17 = i11 & 64;
            if (i17 != 0) {
                i12 |= 1572864;
            } else if ((i10 & 1572864) == 0) {
                if (c0VarR.D(a1Var)) {
                    i18 = 1048576;
                } else {
                    i18 = 524288;
                }
                i12 |= i18;
            }
            if ((i10 & 12582912) != 0) {
                i12 |= ((i11 & 128) == 0 || !c0VarR.D(o3Var)) ? 4194304 : 8388608;
            }
            i19 = i11 & 256;
            if (i19 != 0) {
                if ((i10 & 100663296) == 0) {
                    if (c0VarR.D(g5Var)) {
                        i20 = 67108864;
                    } else {
                        i20 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i12 |= i20;
                }
                if ((i11 & 512) != 0) {
                    i12 |= 805306368;
                } else if ((i10 & 805306368) == 0) {
                    if (c0VarR.k0(nVar)) {
                        i21 = 536870912;
                    } else {
                        i21 = 268435456;
                    }
                    i12 |= i21;
                }
                i22 = i12;
                if ((306783379 & i22) != 306783378) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i22 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i26 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        if (i15 != 0) {
                            jVar4 = null;
                        } else {
                            jVar4 = jVar2;
                        }
                        if ((i11 & 16) != 0) {
                            i23 = i22 & (-57345);
                            q3VarB = p3.f24148a.b(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0VarR, androidx.profileinstaller.n.c.f73814m, 31);
                        } else {
                            i23 = i22;
                        }
                        if ((i11 & 32) != 0) {
                            q3VarE = x9.f25488a.b(c0VarR, 6).e();
                            i23 &= -458753;
                        } else {
                            q3VarE = q3Var2;
                        }
                        if (i17 != 0) {
                            a1Var3 = null;
                        } else {
                            a1Var3 = a1Var;
                        }
                        if ((i11 & 128) != 0) {
                            o3VarA = p3.f24148a.a(0L, 0L, 0L, 0L, c0VarR, 24576, 15);
                            c0Var3 = c0VarR;
                            i23 &= -29360129;
                        } else {
                            c0Var3 = c0VarR;
                            o3VarA = o3Var;
                        }
                        if (i19 != 0) {
                            g5VarD = p3.f24148a.d();
                        } else {
                            g5VarD = g5Var;
                        }
                        q3Var5 = q3VarE;
                        a1Var4 = a1Var3;
                        z15 = z14;
                        a0Var2 = a0Var4;
                        i24 = i23;
                    } else {
                        if (i26 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        if (i15 != 0) {
                            jVar4 = null;
                        } else {
                            jVar4 = jVar2;
                        }
                        if ((i11 & 16) != 0) {
                            i23 = i22 & (-57345);
                            q3VarB = p3.f24148a.b(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0VarR, androidx.profileinstaller.n.c.f73814m, 31);
                        } else {
                            i23 = i22;
                        }
                        if ((i11 & 32) != 0) {
                            q3VarE = x9.f25488a.b(c0VarR, 6).e();
                            i23 &= -458753;
                        } else {
                            q3VarE = q3Var2;
                        }
                        if (i17 != 0) {
                            a1Var3 = null;
                        } else {
                            a1Var3 = a1Var;
                        }
                        if ((i11 & 128) != 0) {
                            o3VarA = p3.f24148a.a(0L, 0L, 0L, 0L, c0VarR, 24576, 15);
                            c0Var3 = c0VarR;
                            i23 &= -29360129;
                        } else {
                            c0Var3 = c0VarR;
                            o3VarA = o3Var;
                        }
                        if (i19 != 0) {
                            g5VarD = p3.f24148a.d();
                        } else {
                            g5VarD = g5Var;
                        }
                        q3Var5 = q3VarE;
                        a1Var4 = a1Var3;
                        z15 = z14;
                        a0Var2 = a0Var4;
                        i24 = i23;
                    }
                    c0Var3.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1084573925, i24, -1, "androidx.compose.material.Button (Button.kt:105)");
                    }
                    if (jVar4 == null) {
                        c0Var3.E(497772480);
                        objI1 = c0Var3.i0();
                        if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI1 = androidx.compose.foundation.interaction.i.a();
                            c0Var3.Y(objI1);
                        }
                        jVar5 = (androidx.compose.foundation.interaction.j) objI1;
                        c0Var3.A();
                    } else {
                        c0Var3.E(1401529847);
                        c0Var3.A();
                        jVar5 = jVar4;
                    }
                    i25 = i24 >> 6;
                    int i218 = (i25 & 14) | ((i24 >> 18) & com.planner5d.library.engine.input.f.b.B);
                    androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarB11 = o3VarA.b(z15, c0Var3, i218);
                    objI0 = c0Var3.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = new Function1() { // from class: androidx.compose.material.r3
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return t3.e((androidx.compose.ui.semantics.e0) obj);
                            }
                        };
                        c0Var3.Y(objI0);
                    }
                    androidx.compose.ui.a0 a0VarF11 = androidx.compose.ui.semantics.t.f(a0Var2, false, (Function1) objI0, 1, null);
                    long jM11 = o3VarA.a(z15, c0Var3, i218).getValue().M();
                    long jW11 = androidx.compose.ui.graphics.q0.w(d(n7VarB11), 1.0f, 0.0f, 0.0f, 0.0f, 14, null);
                    if (q3VarB == null) {
                        c0Var3.E(498179137);
                        c0Var3.A();
                        n7VarA = null;
                    } else {
                        c0Var3.E(1401543616);
                        n7VarA = q3VarB.a(z15, jVar5, c0Var3, i25 & 910);
                        c0Var3.A();
                    }
                    if (n7VarA != null) {
                        fR = n7VarA.getValue().O();
                    } else {
                        fR = androidx.compose.ui.unit.h.r(0);
                    }
                    androidx.compose.ui.a0 a0Var15 = a0Var2;
                    androidx.compose.runtime.c0 c0Var14 = c0Var3;
                    ah.f(function0, a0VarF11, z15, q3Var5, jM11, jW11, a1Var4, fR, jVar5, androidx.compose.runtime.internal.w.e(-20345758, true, new a(n7VarB11, g5VarD, nVar), c0Var3, 54), c0Var14, (i24 & 14) | 805306368 | (i24 & 896) | (i25 & 7168) | (i24 & 3670016), 0);
                    c0Var2 = c0Var14;
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    q3 q3Var16 = q3VarB;
                    g5Var2 = g5VarD;
                    q3Var4 = q3Var16;
                    o3Var2 = o3VarA;
                    z13 = z15;
                    q3Var3 = q3Var5;
                    a1Var2 = a1Var4;
                    a0Var3 = a0Var15;
                    jVar3 = jVar4;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    q3Var3 = q3Var2;
                    a1Var2 = a1Var;
                    a0Var3 = a0Var2;
                    z13 = z11;
                    jVar3 = jVar2;
                    q3Var4 = q3VarB;
                    o3Var2 = o3Var;
                    g5Var2 = g5Var;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.s3
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return t3.f(function0, a0Var3, z13, jVar3, q3Var4, q3Var3, a1Var2, o3Var2, g5Var2, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 100663296;
            if ((i11 & 512) != 0) {
                i12 |= 805306368;
            } else if ((i10 & 805306368) == 0) {
                if (c0VarR.k0(nVar)) {
                    i21 = 536870912;
                } else {
                    i21 = 268435456;
                }
                i12 |= i21;
            }
            i22 = i12;
            if ((306783379 & i22) != 306783378) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i22 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i26 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    if (i15 != 0) {
                        jVar4 = null;
                    } else {
                        jVar4 = jVar2;
                    }
                    if ((i11 & 16) != 0) {
                        i23 = i22 & (-57345);
                        q3VarB = p3.f24148a.b(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0VarR, androidx.profileinstaller.n.c.f73814m, 31);
                    } else {
                        i23 = i22;
                    }
                    if ((i11 & 32) != 0) {
                        q3VarE = x9.f25488a.b(c0VarR, 6).e();
                        i23 &= -458753;
                    } else {
                        q3VarE = q3Var2;
                    }
                    if (i17 != 0) {
                        a1Var3 = null;
                    } else {
                        a1Var3 = a1Var;
                    }
                    if ((i11 & 128) != 0) {
                        o3VarA = p3.f24148a.a(0L, 0L, 0L, 0L, c0VarR, 24576, 15);
                        c0Var3 = c0VarR;
                        i23 &= -29360129;
                    } else {
                        c0Var3 = c0VarR;
                        o3VarA = o3Var;
                    }
                    if (i19 != 0) {
                        g5VarD = p3.f24148a.d();
                    } else {
                        g5VarD = g5Var;
                    }
                    q3Var5 = q3VarE;
                    a1Var4 = a1Var3;
                    z15 = z14;
                    a0Var2 = a0Var4;
                    i24 = i23;
                } else {
                    if (i26 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    if (i15 != 0) {
                        jVar4 = null;
                    } else {
                        jVar4 = jVar2;
                    }
                    if ((i11 & 16) != 0) {
                        i23 = i22 & (-57345);
                        q3VarB = p3.f24148a.b(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0VarR, androidx.profileinstaller.n.c.f73814m, 31);
                    } else {
                        i23 = i22;
                    }
                    if ((i11 & 32) != 0) {
                        q3VarE = x9.f25488a.b(c0VarR, 6).e();
                        i23 &= -458753;
                    } else {
                        q3VarE = q3Var2;
                    }
                    if (i17 != 0) {
                        a1Var3 = null;
                    } else {
                        a1Var3 = a1Var;
                    }
                    if ((i11 & 128) != 0) {
                        o3VarA = p3.f24148a.a(0L, 0L, 0L, 0L, c0VarR, 24576, 15);
                        c0Var3 = c0VarR;
                        i23 &= -29360129;
                    } else {
                        c0Var3 = c0VarR;
                        o3VarA = o3Var;
                    }
                    if (i19 != 0) {
                        g5VarD = p3.f24148a.d();
                    } else {
                        g5VarD = g5Var;
                    }
                    q3Var5 = q3VarE;
                    a1Var4 = a1Var3;
                    z15 = z14;
                    a0Var2 = a0Var4;
                    i24 = i23;
                }
                c0Var3.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1084573925, i24, -1, "androidx.compose.material.Button (Button.kt:105)");
                }
                if (jVar4 == null) {
                    c0Var3.E(497772480);
                    objI1 = c0Var3.i0();
                    if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI1 = androidx.compose.foundation.interaction.i.a();
                        c0Var3.Y(objI1);
                    }
                    jVar5 = (androidx.compose.foundation.interaction.j) objI1;
                    c0Var3.A();
                } else {
                    c0Var3.E(1401529847);
                    c0Var3.A();
                    jVar5 = jVar4;
                }
                i25 = i24 >> 6;
                int i219 = (i25 & 14) | ((i24 >> 18) & com.planner5d.library.engine.input.f.b.B);
                androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarB12 = o3VarA.b(z15, c0Var3, i219);
                objI0 = c0Var3.i0();
                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = new Function1() { // from class: androidx.compose.material.r3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return t3.e((androidx.compose.ui.semantics.e0) obj);
                        }
                    };
                    c0Var3.Y(objI0);
                }
                androidx.compose.ui.a0 a0VarF12 = androidx.compose.ui.semantics.t.f(a0Var2, false, (Function1) objI0, 1, null);
                long jM12 = o3VarA.a(z15, c0Var3, i219).getValue().M();
                long jW12 = androidx.compose.ui.graphics.q0.w(d(n7VarB12), 1.0f, 0.0f, 0.0f, 0.0f, 14, null);
                if (q3VarB == null) {
                    c0Var3.E(498179137);
                    c0Var3.A();
                    n7VarA = null;
                } else {
                    c0Var3.E(1401543616);
                    n7VarA = q3VarB.a(z15, jVar5, c0Var3, i25 & 910);
                    c0Var3.A();
                }
                if (n7VarA != null) {
                    fR = n7VarA.getValue().O();
                } else {
                    fR = androidx.compose.ui.unit.h.r(0);
                }
                androidx.compose.ui.a0 a0Var16 = a0Var2;
                androidx.compose.runtime.c0 c0Var15 = c0Var3;
                ah.f(function0, a0VarF12, z15, q3Var5, jM12, jW12, a1Var4, fR, jVar5, androidx.compose.runtime.internal.w.e(-20345758, true, new a(n7VarB12, g5VarD, nVar), c0Var3, 54), c0Var15, (i24 & 14) | 805306368 | (i24 & 896) | (i25 & 7168) | (i24 & 3670016), 0);
                c0Var2 = c0Var15;
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                q3 q3Var17 = q3VarB;
                g5Var2 = g5VarD;
                q3Var4 = q3Var17;
                o3Var2 = o3VarA;
                z13 = z15;
                q3Var3 = q3Var5;
                a1Var2 = a1Var4;
                a0Var3 = a0Var16;
                jVar3 = jVar4;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                q3Var3 = q3Var2;
                a1Var2 = a1Var;
                a0Var3 = a0Var2;
                z13 = z11;
                jVar3 = jVar2;
                q3Var4 = q3VarB;
                o3Var2 = o3Var;
                g5Var2 = g5Var;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material.s3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return t3.f(function0, a0Var3, z13, jVar3, q3Var4, q3Var3, a1Var2, o3Var2, g5Var2, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= androidx.media3.exoplayer.a5.S0;
        z11 = z10;
        i15 = i11 & 8;
        if (i15 != 0) {
            if ((i10 & 3072) == 0) {
                jVar2 = jVar;
                if (c0VarR.D(jVar2)) {
                    i16 = 2048;
                } else {
                    i16 = 1024;
                }
                i12 |= i16;
            }
            if ((i10 & 24576) == 0) {
                if ((i11 & 16) == 0) {
                    q3VarB = q3Var;
                    if (c0VarR.D(q3VarB)) {
                    }
                    i12 |= i27;
                } else {
                    q3VarB = q3Var;
                }
                i12 |= i27;
            } else {
                q3VarB = q3Var;
            }
            if ((196608 & i10) != 0) {
                i12 |= ((i11 & 32) == 0 || !c0VarR.D(q3Var2)) ? 65536 : 131072;
            }
            i17 = i11 & 64;
            if (i17 != 0) {
                i12 |= 1572864;
            } else if ((i10 & 1572864) == 0) {
                if (c0VarR.D(a1Var)) {
                    i18 = 1048576;
                } else {
                    i18 = 524288;
                }
                i12 |= i18;
            }
            if ((i10 & 12582912) != 0) {
                i12 |= ((i11 & 128) == 0 || !c0VarR.D(o3Var)) ? 4194304 : 8388608;
            }
            i19 = i11 & 256;
            if (i19 != 0) {
                if ((i10 & 100663296) == 0) {
                    if (c0VarR.D(g5Var)) {
                        i20 = 67108864;
                    } else {
                        i20 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i12 |= i20;
                }
                if ((i11 & 512) != 0) {
                    i12 |= 805306368;
                } else if ((i10 & 805306368) == 0) {
                    if (c0VarR.k0(nVar)) {
                        i21 = 536870912;
                    } else {
                        i21 = 268435456;
                    }
                    i12 |= i21;
                }
                i22 = i12;
                if ((306783379 & i22) != 306783378) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i22 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i26 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        if (i15 != 0) {
                            jVar4 = null;
                        } else {
                            jVar4 = jVar2;
                        }
                        if ((i11 & 16) != 0) {
                            i23 = i22 & (-57345);
                            q3VarB = p3.f24148a.b(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0VarR, androidx.profileinstaller.n.c.f73814m, 31);
                        } else {
                            i23 = i22;
                        }
                        if ((i11 & 32) != 0) {
                            q3VarE = x9.f25488a.b(c0VarR, 6).e();
                            i23 &= -458753;
                        } else {
                            q3VarE = q3Var2;
                        }
                        if (i17 != 0) {
                            a1Var3 = null;
                        } else {
                            a1Var3 = a1Var;
                        }
                        if ((i11 & 128) != 0) {
                            o3VarA = p3.f24148a.a(0L, 0L, 0L, 0L, c0VarR, 24576, 15);
                            c0Var3 = c0VarR;
                            i23 &= -29360129;
                        } else {
                            c0Var3 = c0VarR;
                            o3VarA = o3Var;
                        }
                        if (i19 != 0) {
                            g5VarD = p3.f24148a.d();
                        } else {
                            g5VarD = g5Var;
                        }
                        q3Var5 = q3VarE;
                        a1Var4 = a1Var3;
                        z15 = z14;
                        a0Var2 = a0Var4;
                        i24 = i23;
                    } else {
                        if (i26 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            z14 = true;
                        } else {
                            z14 = z11;
                        }
                        if (i15 != 0) {
                            jVar4 = null;
                        } else {
                            jVar4 = jVar2;
                        }
                        if ((i11 & 16) != 0) {
                            i23 = i22 & (-57345);
                            q3VarB = p3.f24148a.b(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0VarR, androidx.profileinstaller.n.c.f73814m, 31);
                        } else {
                            i23 = i22;
                        }
                        if ((i11 & 32) != 0) {
                            q3VarE = x9.f25488a.b(c0VarR, 6).e();
                            i23 &= -458753;
                        } else {
                            q3VarE = q3Var2;
                        }
                        if (i17 != 0) {
                            a1Var3 = null;
                        } else {
                            a1Var3 = a1Var;
                        }
                        if ((i11 & 128) != 0) {
                            o3VarA = p3.f24148a.a(0L, 0L, 0L, 0L, c0VarR, 24576, 15);
                            c0Var3 = c0VarR;
                            i23 &= -29360129;
                        } else {
                            c0Var3 = c0VarR;
                            o3VarA = o3Var;
                        }
                        if (i19 != 0) {
                            g5VarD = p3.f24148a.d();
                        } else {
                            g5VarD = g5Var;
                        }
                        q3Var5 = q3VarE;
                        a1Var4 = a1Var3;
                        z15 = z14;
                        a0Var2 = a0Var4;
                        i24 = i23;
                    }
                    c0Var3.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1084573925, i24, -1, "androidx.compose.material.Button (Button.kt:105)");
                    }
                    if (jVar4 == null) {
                        c0Var3.E(497772480);
                        objI1 = c0Var3.i0();
                        if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI1 = androidx.compose.foundation.interaction.i.a();
                            c0Var3.Y(objI1);
                        }
                        jVar5 = (androidx.compose.foundation.interaction.j) objI1;
                        c0Var3.A();
                    } else {
                        c0Var3.E(1401529847);
                        c0Var3.A();
                        jVar5 = jVar4;
                    }
                    i25 = i24 >> 6;
                    int i2110 = (i25 & 14) | ((i24 >> 18) & com.planner5d.library.engine.input.f.b.B);
                    androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarB13 = o3VarA.b(z15, c0Var3, i2110);
                    objI0 = c0Var3.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = new Function1() { // from class: androidx.compose.material.r3
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return t3.e((androidx.compose.ui.semantics.e0) obj);
                            }
                        };
                        c0Var3.Y(objI0);
                    }
                    androidx.compose.ui.a0 a0VarF13 = androidx.compose.ui.semantics.t.f(a0Var2, false, (Function1) objI0, 1, null);
                    long jM13 = o3VarA.a(z15, c0Var3, i2110).getValue().M();
                    long jW13 = androidx.compose.ui.graphics.q0.w(d(n7VarB13), 1.0f, 0.0f, 0.0f, 0.0f, 14, null);
                    if (q3VarB == null) {
                        c0Var3.E(498179137);
                        c0Var3.A();
                        n7VarA = null;
                    } else {
                        c0Var3.E(1401543616);
                        n7VarA = q3VarB.a(z15, jVar5, c0Var3, i25 & 910);
                        c0Var3.A();
                    }
                    if (n7VarA != null) {
                        fR = n7VarA.getValue().O();
                    } else {
                        fR = androidx.compose.ui.unit.h.r(0);
                    }
                    androidx.compose.ui.a0 a0Var17 = a0Var2;
                    androidx.compose.runtime.c0 c0Var16 = c0Var3;
                    ah.f(function0, a0VarF13, z15, q3Var5, jM13, jW13, a1Var4, fR, jVar5, androidx.compose.runtime.internal.w.e(-20345758, true, new a(n7VarB13, g5VarD, nVar), c0Var3, 54), c0Var16, (i24 & 14) | 805306368 | (i24 & 896) | (i25 & 7168) | (i24 & 3670016), 0);
                    c0Var2 = c0Var16;
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    q3 q3Var18 = q3VarB;
                    g5Var2 = g5VarD;
                    q3Var4 = q3Var18;
                    o3Var2 = o3VarA;
                    z13 = z15;
                    q3Var3 = q3Var5;
                    a1Var2 = a1Var4;
                    a0Var3 = a0Var17;
                    jVar3 = jVar4;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    q3Var3 = q3Var2;
                    a1Var2 = a1Var;
                    a0Var3 = a0Var2;
                    z13 = z11;
                    jVar3 = jVar2;
                    q3Var4 = q3VarB;
                    o3Var2 = o3Var;
                    g5Var2 = g5Var;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.s3
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return t3.f(function0, a0Var3, z13, jVar3, q3Var4, q3Var3, a1Var2, o3Var2, g5Var2, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 100663296;
            if ((i11 & 512) != 0) {
                i12 |= 805306368;
            } else if ((i10 & 805306368) == 0) {
                if (c0VarR.k0(nVar)) {
                    i21 = 536870912;
                } else {
                    i21 = 268435456;
                }
                i12 |= i21;
            }
            i22 = i12;
            if ((306783379 & i22) != 306783378) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i22 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i26 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    if (i15 != 0) {
                        jVar4 = null;
                    } else {
                        jVar4 = jVar2;
                    }
                    if ((i11 & 16) != 0) {
                        i23 = i22 & (-57345);
                        q3VarB = p3.f24148a.b(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0VarR, androidx.profileinstaller.n.c.f73814m, 31);
                    } else {
                        i23 = i22;
                    }
                    if ((i11 & 32) != 0) {
                        q3VarE = x9.f25488a.b(c0VarR, 6).e();
                        i23 &= -458753;
                    } else {
                        q3VarE = q3Var2;
                    }
                    if (i17 != 0) {
                        a1Var3 = null;
                    } else {
                        a1Var3 = a1Var;
                    }
                    if ((i11 & 128) != 0) {
                        o3VarA = p3.f24148a.a(0L, 0L, 0L, 0L, c0VarR, 24576, 15);
                        c0Var3 = c0VarR;
                        i23 &= -29360129;
                    } else {
                        c0Var3 = c0VarR;
                        o3VarA = o3Var;
                    }
                    if (i19 != 0) {
                        g5VarD = p3.f24148a.d();
                    } else {
                        g5VarD = g5Var;
                    }
                    q3Var5 = q3VarE;
                    a1Var4 = a1Var3;
                    z15 = z14;
                    a0Var2 = a0Var4;
                    i24 = i23;
                } else {
                    if (i26 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    if (i15 != 0) {
                        jVar4 = null;
                    } else {
                        jVar4 = jVar2;
                    }
                    if ((i11 & 16) != 0) {
                        i23 = i22 & (-57345);
                        q3VarB = p3.f24148a.b(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0VarR, androidx.profileinstaller.n.c.f73814m, 31);
                    } else {
                        i23 = i22;
                    }
                    if ((i11 & 32) != 0) {
                        q3VarE = x9.f25488a.b(c0VarR, 6).e();
                        i23 &= -458753;
                    } else {
                        q3VarE = q3Var2;
                    }
                    if (i17 != 0) {
                        a1Var3 = null;
                    } else {
                        a1Var3 = a1Var;
                    }
                    if ((i11 & 128) != 0) {
                        o3VarA = p3.f24148a.a(0L, 0L, 0L, 0L, c0VarR, 24576, 15);
                        c0Var3 = c0VarR;
                        i23 &= -29360129;
                    } else {
                        c0Var3 = c0VarR;
                        o3VarA = o3Var;
                    }
                    if (i19 != 0) {
                        g5VarD = p3.f24148a.d();
                    } else {
                        g5VarD = g5Var;
                    }
                    q3Var5 = q3VarE;
                    a1Var4 = a1Var3;
                    z15 = z14;
                    a0Var2 = a0Var4;
                    i24 = i23;
                }
                c0Var3.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1084573925, i24, -1, "androidx.compose.material.Button (Button.kt:105)");
                }
                if (jVar4 == null) {
                    c0Var3.E(497772480);
                    objI1 = c0Var3.i0();
                    if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI1 = androidx.compose.foundation.interaction.i.a();
                        c0Var3.Y(objI1);
                    }
                    jVar5 = (androidx.compose.foundation.interaction.j) objI1;
                    c0Var3.A();
                } else {
                    c0Var3.E(1401529847);
                    c0Var3.A();
                    jVar5 = jVar4;
                }
                i25 = i24 >> 6;
                int i2111 = (i25 & 14) | ((i24 >> 18) & com.planner5d.library.engine.input.f.b.B);
                androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarB14 = o3VarA.b(z15, c0Var3, i2111);
                objI0 = c0Var3.i0();
                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = new Function1() { // from class: androidx.compose.material.r3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return t3.e((androidx.compose.ui.semantics.e0) obj);
                        }
                    };
                    c0Var3.Y(objI0);
                }
                androidx.compose.ui.a0 a0VarF14 = androidx.compose.ui.semantics.t.f(a0Var2, false, (Function1) objI0, 1, null);
                long jM14 = o3VarA.a(z15, c0Var3, i2111).getValue().M();
                long jW14 = androidx.compose.ui.graphics.q0.w(d(n7VarB14), 1.0f, 0.0f, 0.0f, 0.0f, 14, null);
                if (q3VarB == null) {
                    c0Var3.E(498179137);
                    c0Var3.A();
                    n7VarA = null;
                } else {
                    c0Var3.E(1401543616);
                    n7VarA = q3VarB.a(z15, jVar5, c0Var3, i25 & 910);
                    c0Var3.A();
                }
                if (n7VarA != null) {
                    fR = n7VarA.getValue().O();
                } else {
                    fR = androidx.compose.ui.unit.h.r(0);
                }
                androidx.compose.ui.a0 a0Var18 = a0Var2;
                androidx.compose.runtime.c0 c0Var17 = c0Var3;
                ah.f(function0, a0VarF14, z15, q3Var5, jM14, jW14, a1Var4, fR, jVar5, androidx.compose.runtime.internal.w.e(-20345758, true, new a(n7VarB14, g5VarD, nVar), c0Var3, 54), c0Var17, (i24 & 14) | 805306368 | (i24 & 896) | (i25 & 7168) | (i24 & 3670016), 0);
                c0Var2 = c0Var17;
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                q3 q3Var19 = q3VarB;
                g5Var2 = g5VarD;
                q3Var4 = q3Var19;
                o3Var2 = o3VarA;
                z13 = z15;
                q3Var3 = q3Var5;
                a1Var2 = a1Var4;
                a0Var3 = a0Var18;
                jVar3 = jVar4;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                q3Var3 = q3Var2;
                a1Var2 = a1Var;
                a0Var3 = a0Var2;
                z13 = z11;
                jVar3 = jVar2;
                q3Var4 = q3VarB;
                o3Var2 = o3Var;
                g5Var2 = g5Var;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material.s3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return t3.f(function0, a0Var3, z13, jVar3, q3Var4, q3Var3, a1Var2, o3Var2, g5Var2, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 3072;
        jVar2 = jVar;
        if ((i10 & 24576) == 0) {
            if ((i11 & 16) == 0) {
                q3VarB = q3Var;
                if (c0VarR.D(q3VarB)) {
                }
                i12 |= i27;
            } else {
                q3VarB = q3Var;
            }
            i12 |= i27;
        } else {
            q3VarB = q3Var;
        }
        if ((196608 & i10) != 0) {
            i12 |= ((i11 & 32) == 0 || !c0VarR.D(q3Var2)) ? 65536 : 131072;
        }
        i17 = i11 & 64;
        if (i17 != 0) {
            i12 |= 1572864;
        } else if ((i10 & 1572864) == 0) {
            if (c0VarR.D(a1Var)) {
                i18 = 1048576;
            } else {
                i18 = 524288;
            }
            i12 |= i18;
        }
        if ((i10 & 12582912) != 0) {
            i12 |= ((i11 & 128) == 0 || !c0VarR.D(o3Var)) ? 4194304 : 8388608;
        }
        i19 = i11 & 256;
        if (i19 != 0) {
            if ((i10 & 100663296) == 0) {
                if (c0VarR.D(g5Var)) {
                    i20 = 67108864;
                } else {
                    i20 = com.google.api.client.googleapis.media.a.f115410j;
                }
                i12 |= i20;
            }
            if ((i11 & 512) != 0) {
                i12 |= 805306368;
            } else if ((i10 & 805306368) == 0) {
                if (c0VarR.k0(nVar)) {
                    i21 = 536870912;
                } else {
                    i21 = 268435456;
                }
                i12 |= i21;
            }
            i22 = i12;
            if ((306783379 & i22) != 306783378) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i22 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i26 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    if (i15 != 0) {
                        jVar4 = null;
                    } else {
                        jVar4 = jVar2;
                    }
                    if ((i11 & 16) != 0) {
                        i23 = i22 & (-57345);
                        q3VarB = p3.f24148a.b(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0VarR, androidx.profileinstaller.n.c.f73814m, 31);
                    } else {
                        i23 = i22;
                    }
                    if ((i11 & 32) != 0) {
                        q3VarE = x9.f25488a.b(c0VarR, 6).e();
                        i23 &= -458753;
                    } else {
                        q3VarE = q3Var2;
                    }
                    if (i17 != 0) {
                        a1Var3 = null;
                    } else {
                        a1Var3 = a1Var;
                    }
                    if ((i11 & 128) != 0) {
                        o3VarA = p3.f24148a.a(0L, 0L, 0L, 0L, c0VarR, 24576, 15);
                        c0Var3 = c0VarR;
                        i23 &= -29360129;
                    } else {
                        c0Var3 = c0VarR;
                        o3VarA = o3Var;
                    }
                    if (i19 != 0) {
                        g5VarD = p3.f24148a.d();
                    } else {
                        g5VarD = g5Var;
                    }
                    q3Var5 = q3VarE;
                    a1Var4 = a1Var3;
                    z15 = z14;
                    a0Var2 = a0Var4;
                    i24 = i23;
                } else {
                    if (i26 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        z14 = true;
                    } else {
                        z14 = z11;
                    }
                    if (i15 != 0) {
                        jVar4 = null;
                    } else {
                        jVar4 = jVar2;
                    }
                    if ((i11 & 16) != 0) {
                        i23 = i22 & (-57345);
                        q3VarB = p3.f24148a.b(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0VarR, androidx.profileinstaller.n.c.f73814m, 31);
                    } else {
                        i23 = i22;
                    }
                    if ((i11 & 32) != 0) {
                        q3VarE = x9.f25488a.b(c0VarR, 6).e();
                        i23 &= -458753;
                    } else {
                        q3VarE = q3Var2;
                    }
                    if (i17 != 0) {
                        a1Var3 = null;
                    } else {
                        a1Var3 = a1Var;
                    }
                    if ((i11 & 128) != 0) {
                        o3VarA = p3.f24148a.a(0L, 0L, 0L, 0L, c0VarR, 24576, 15);
                        c0Var3 = c0VarR;
                        i23 &= -29360129;
                    } else {
                        c0Var3 = c0VarR;
                        o3VarA = o3Var;
                    }
                    if (i19 != 0) {
                        g5VarD = p3.f24148a.d();
                    } else {
                        g5VarD = g5Var;
                    }
                    q3Var5 = q3VarE;
                    a1Var4 = a1Var3;
                    z15 = z14;
                    a0Var2 = a0Var4;
                    i24 = i23;
                }
                c0Var3.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1084573925, i24, -1, "androidx.compose.material.Button (Button.kt:105)");
                }
                if (jVar4 == null) {
                    c0Var3.E(497772480);
                    objI1 = c0Var3.i0();
                    if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI1 = androidx.compose.foundation.interaction.i.a();
                        c0Var3.Y(objI1);
                    }
                    jVar5 = (androidx.compose.foundation.interaction.j) objI1;
                    c0Var3.A();
                } else {
                    c0Var3.E(1401529847);
                    c0Var3.A();
                    jVar5 = jVar4;
                }
                i25 = i24 >> 6;
                int i2112 = (i25 & 14) | ((i24 >> 18) & com.planner5d.library.engine.input.f.b.B);
                androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarB15 = o3VarA.b(z15, c0Var3, i2112);
                objI0 = c0Var3.i0();
                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = new Function1() { // from class: androidx.compose.material.r3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return t3.e((androidx.compose.ui.semantics.e0) obj);
                        }
                    };
                    c0Var3.Y(objI0);
                }
                androidx.compose.ui.a0 a0VarF15 = androidx.compose.ui.semantics.t.f(a0Var2, false, (Function1) objI0, 1, null);
                long jM15 = o3VarA.a(z15, c0Var3, i2112).getValue().M();
                long jW15 = androidx.compose.ui.graphics.q0.w(d(n7VarB15), 1.0f, 0.0f, 0.0f, 0.0f, 14, null);
                if (q3VarB == null) {
                    c0Var3.E(498179137);
                    c0Var3.A();
                    n7VarA = null;
                } else {
                    c0Var3.E(1401543616);
                    n7VarA = q3VarB.a(z15, jVar5, c0Var3, i25 & 910);
                    c0Var3.A();
                }
                if (n7VarA != null) {
                    fR = n7VarA.getValue().O();
                } else {
                    fR = androidx.compose.ui.unit.h.r(0);
                }
                androidx.compose.ui.a0 a0Var19 = a0Var2;
                androidx.compose.runtime.c0 c0Var18 = c0Var3;
                ah.f(function0, a0VarF15, z15, q3Var5, jM15, jW15, a1Var4, fR, jVar5, androidx.compose.runtime.internal.w.e(-20345758, true, new a(n7VarB15, g5VarD, nVar), c0Var3, 54), c0Var18, (i24 & 14) | 805306368 | (i24 & 896) | (i25 & 7168) | (i24 & 3670016), 0);
                c0Var2 = c0Var18;
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                q3 q3Var110 = q3VarB;
                g5Var2 = g5VarD;
                q3Var4 = q3Var110;
                o3Var2 = o3VarA;
                z13 = z15;
                q3Var3 = q3Var5;
                a1Var2 = a1Var4;
                a0Var3 = a0Var19;
                jVar3 = jVar4;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                q3Var3 = q3Var2;
                a1Var2 = a1Var;
                a0Var3 = a0Var2;
                z13 = z11;
                jVar3 = jVar2;
                q3Var4 = q3VarB;
                o3Var2 = o3Var;
                g5Var2 = g5Var;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material.s3
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return t3.f(function0, a0Var3, z13, jVar3, q3Var4, q3Var3, a1Var2, o3Var2, g5Var2, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 100663296;
        if ((i11 & 512) != 0) {
            i12 |= 805306368;
        } else if ((i10 & 805306368) == 0) {
            if (c0VarR.k0(nVar)) {
                i21 = 536870912;
            } else {
                i21 = 268435456;
            }
            i12 |= i21;
        }
        i22 = i12;
        if ((306783379 & i22) != 306783378) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (c0VarR.h(z12, i22 & 1)) {
            c0VarR.l0();
            if ((i10 & 1) != 0) {
                if (i26 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if (i13 != 0) {
                    z14 = true;
                } else {
                    z14 = z11;
                }
                if (i15 != 0) {
                    jVar4 = null;
                } else {
                    jVar4 = jVar2;
                }
                if ((i11 & 16) != 0) {
                    i23 = i22 & (-57345);
                    q3VarB = p3.f24148a.b(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0VarR, androidx.profileinstaller.n.c.f73814m, 31);
                } else {
                    i23 = i22;
                }
                if ((i11 & 32) != 0) {
                    q3VarE = x9.f25488a.b(c0VarR, 6).e();
                    i23 &= -458753;
                } else {
                    q3VarE = q3Var2;
                }
                if (i17 != 0) {
                    a1Var3 = null;
                } else {
                    a1Var3 = a1Var;
                }
                if ((i11 & 128) != 0) {
                    o3VarA = p3.f24148a.a(0L, 0L, 0L, 0L, c0VarR, 24576, 15);
                    c0Var3 = c0VarR;
                    i23 &= -29360129;
                } else {
                    c0Var3 = c0VarR;
                    o3VarA = o3Var;
                }
                if (i19 != 0) {
                    g5VarD = p3.f24148a.d();
                } else {
                    g5VarD = g5Var;
                }
                q3Var5 = q3VarE;
                a1Var4 = a1Var3;
                z15 = z14;
                a0Var2 = a0Var4;
                i24 = i23;
            } else {
                if (i26 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if (i13 != 0) {
                    z14 = true;
                } else {
                    z14 = z11;
                }
                if (i15 != 0) {
                    jVar4 = null;
                } else {
                    jVar4 = jVar2;
                }
                if ((i11 & 16) != 0) {
                    i23 = i22 & (-57345);
                    q3VarB = p3.f24148a.b(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0VarR, androidx.profileinstaller.n.c.f73814m, 31);
                } else {
                    i23 = i22;
                }
                if ((i11 & 32) != 0) {
                    q3VarE = x9.f25488a.b(c0VarR, 6).e();
                    i23 &= -458753;
                } else {
                    q3VarE = q3Var2;
                }
                if (i17 != 0) {
                    a1Var3 = null;
                } else {
                    a1Var3 = a1Var;
                }
                if ((i11 & 128) != 0) {
                    o3VarA = p3.f24148a.a(0L, 0L, 0L, 0L, c0VarR, 24576, 15);
                    c0Var3 = c0VarR;
                    i23 &= -29360129;
                } else {
                    c0Var3 = c0VarR;
                    o3VarA = o3Var;
                }
                if (i19 != 0) {
                    g5VarD = p3.f24148a.d();
                } else {
                    g5VarD = g5Var;
                }
                q3Var5 = q3VarE;
                a1Var4 = a1Var3;
                z15 = z14;
                a0Var2 = a0Var4;
                i24 = i23;
            }
            c0Var3.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1084573925, i24, -1, "androidx.compose.material.Button (Button.kt:105)");
            }
            if (jVar4 == null) {
                c0Var3.E(497772480);
                objI1 = c0Var3.i0();
                if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI1 = androidx.compose.foundation.interaction.i.a();
                    c0Var3.Y(objI1);
                }
                jVar5 = (androidx.compose.foundation.interaction.j) objI1;
                c0Var3.A();
            } else {
                c0Var3.E(1401529847);
                c0Var3.A();
                jVar5 = jVar4;
            }
            i25 = i24 >> 6;
            int i2113 = (i25 & 14) | ((i24 >> 18) & com.planner5d.library.engine.input.f.b.B);
            androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarB16 = o3VarA.b(z15, c0Var3, i2113);
            objI0 = c0Var3.i0();
            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new Function1() { // from class: androidx.compose.material.r3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return t3.e((androidx.compose.ui.semantics.e0) obj);
                    }
                };
                c0Var3.Y(objI0);
            }
            androidx.compose.ui.a0 a0VarF16 = androidx.compose.ui.semantics.t.f(a0Var2, false, (Function1) objI0, 1, null);
            long jM16 = o3VarA.a(z15, c0Var3, i2113).getValue().M();
            long jW16 = androidx.compose.ui.graphics.q0.w(d(n7VarB16), 1.0f, 0.0f, 0.0f, 0.0f, 14, null);
            if (q3VarB == null) {
                c0Var3.E(498179137);
                c0Var3.A();
                n7VarA = null;
            } else {
                c0Var3.E(1401543616);
                n7VarA = q3VarB.a(z15, jVar5, c0Var3, i25 & 910);
                c0Var3.A();
            }
            if (n7VarA != null) {
                fR = n7VarA.getValue().O();
            } else {
                fR = androidx.compose.ui.unit.h.r(0);
            }
            androidx.compose.ui.a0 a0Var110 = a0Var2;
            androidx.compose.runtime.c0 c0Var19 = c0Var3;
            ah.f(function0, a0VarF16, z15, q3Var5, jM16, jW16, a1Var4, fR, jVar5, androidx.compose.runtime.internal.w.e(-20345758, true, new a(n7VarB16, g5VarD, nVar), c0Var3, 54), c0Var19, (i24 & 14) | 805306368 | (i24 & 896) | (i25 & 7168) | (i24 & 3670016), 0);
            c0Var2 = c0Var19;
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            q3 q3Var111 = q3VarB;
            g5Var2 = g5VarD;
            q3Var4 = q3Var111;
            o3Var2 = o3VarA;
            z13 = z15;
            q3Var3 = q3Var5;
            a1Var2 = a1Var4;
            a0Var3 = a0Var110;
            jVar3 = jVar4;
        } else {
            c0Var2 = c0VarR;
            c0Var2.u();
            q3Var3 = q3Var2;
            a1Var2 = a1Var;
            a0Var3 = a0Var2;
            z13 = z11;
            jVar3 = jVar2;
            q3Var4 = q3VarB;
            o3Var2 = o3Var;
            g5Var2 = g5Var;
        }
        s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material.s3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return t3.f(function0, a0Var3, z13, jVar3, q3Var4, q3Var3, a1Var2, o3Var2, g5Var2, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final long d(androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7Var) {
        return n7Var.getValue().M();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(androidx.compose.ui.semantics.e0 e0Var) {
        androidx.compose.ui.semantics.b0.K1(e0Var, androidx.compose.ui.semantics.j.f41124b.a());
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(Function0 function0, androidx.compose.ui.a0 a0Var, boolean z10, androidx.compose.foundation.interaction.j jVar, q3 q3Var, androidx.compose.ui.graphics.q3 q3Var2, androidx.compose.foundation.a1 a1Var, o3 o3Var, androidx.compose.foundation.layout.g5 g5Var, pj.n nVar, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        c(function0, a0Var, z10, jVar, q3Var, q3Var2, a1Var, o3Var, g5Var, nVar, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void g(@NotNull Function0<Unit> function0, @Nullable androidx.compose.ui.a0 a0Var, boolean z10, @Nullable androidx.compose.foundation.interaction.j jVar, @Nullable q3 q3Var, @Nullable androidx.compose.ui.graphics.q3 q3Var2, @Nullable androidx.compose.foundation.a1 a1Var, @Nullable o3 o3Var, @Nullable androidx.compose.foundation.layout.g5 g5Var, @NotNull pj.n<? super androidx.compose.foundation.layout.x5, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        androidx.compose.ui.a0 a0Var2 = (i11 & 2) != 0 ? androidx.compose.ui.a0.E : a0Var;
        boolean z11 = (i11 & 4) != 0 ? true : z10;
        androidx.compose.foundation.interaction.j jVar2 = (i11 & 8) != 0 ? null : jVar;
        q3 q3Var3 = (i11 & 16) != 0 ? null : q3Var;
        androidx.compose.ui.graphics.q3 q3VarE = (i11 & 32) != 0 ? x9.f25488a.b(c0Var, 6).e() : q3Var2;
        androidx.compose.foundation.a1 a1VarI = (i11 & 64) != 0 ? p3.f24148a.i(c0Var, 6) : a1Var;
        o3 o3VarL = (i11 & 128) != 0 ? p3.f24148a.l(0L, 0L, 0L, c0Var, 3072, 7) : o3Var;
        androidx.compose.foundation.layout.g5 g5VarD = (i11 & 256) != 0 ? p3.f24148a.d() : g5Var;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-1445054947, i10, -1, "androidx.compose.material.OutlinedButton (Button.kt:181)");
        }
        c(function0, a0Var2, z11, jVar2, q3Var3, q3VarE, a1VarI, o3VarL, g5VarD, nVar, c0Var, i10 & 2147483646, 0);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void h(@NotNull Function0<Unit> function0, @Nullable androidx.compose.ui.a0 a0Var, boolean z10, @Nullable androidx.compose.foundation.interaction.j jVar, @Nullable q3 q3Var, @Nullable androidx.compose.ui.graphics.q3 q3Var2, @Nullable androidx.compose.foundation.a1 a1Var, @Nullable o3 o3Var, @Nullable androidx.compose.foundation.layout.g5 g5Var, @NotNull pj.n<? super androidx.compose.foundation.layout.x5, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        androidx.compose.ui.a0 a0Var2 = (i11 & 2) != 0 ? androidx.compose.ui.a0.E : a0Var;
        boolean z11 = (i11 & 4) != 0 ? true : z10;
        androidx.compose.foundation.interaction.j jVar2 = (i11 & 8) != 0 ? null : jVar;
        q3 q3Var3 = (i11 & 16) != 0 ? null : q3Var;
        androidx.compose.ui.graphics.q3 q3VarE = (i11 & 32) != 0 ? x9.f25488a.b(c0Var, 6).e() : q3Var2;
        androidx.compose.foundation.a1 a1Var2 = (i11 & 64) == 0 ? a1Var : null;
        o3 o3VarM = (i11 & 128) != 0 ? p3.f24148a.m(0L, 0L, 0L, c0Var, 3072, 7) : o3Var;
        androidx.compose.foundation.layout.g5 g5VarK = (i11 & 256) != 0 ? p3.f24148a.k() : g5Var;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(724562088, i10, -1, "androidx.compose.material.TextButton (Button.kt:238)");
        }
        c(function0, a0Var2, z11, jVar2, q3Var3, q3VarE, a1Var2, o3VarM, g5VarK, nVar, c0Var, i10 & 2147483646, 0);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
    }
}

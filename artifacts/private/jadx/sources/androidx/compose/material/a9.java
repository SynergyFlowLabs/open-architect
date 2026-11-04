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
@SourceDebugExtension({"SMAP\nFloatingActionButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatingActionButton.kt\nandroidx/compose/material/FloatingActionButtonKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,398:1\n1282#2,6:399\n1282#2,6:405\n113#3:411\n113#3:412\n113#3:413\n113#3:414\n*S KotlinDebug\n*F\n+ 1 FloatingActionButton.kt\nandroidx/compose/material/FloatingActionButtonKt\n*L\n93#1:399,6\n96#1:405,6\n394#1:411\n395#1:412\n396#1:413\n397#1:414\n*E\n"})
public final class a9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f21983a = androidx.compose.ui.unit.h.r(56);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f21984b = androidx.compose.ui.unit.h.r(48);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f21985c = androidx.compose.ui.unit.h.r(12);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final float f21986d = androidx.compose.ui.unit.h.r(20);

    @SourceDebugExtension({"SMAP\nFloatingActionButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatingActionButton.kt\nandroidx/compose/material/FloatingActionButtonKt$ExtendedFloatingActionButton$1\n+ 2 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,398:1\n99#2:399\n96#2,9:400\n106#2:439\n79#3,6:409\n86#3,3:424\n89#3,2:433\n93#3:438\n347#4,9:415\n356#4,3:435\n4206#5,6:427\n*S KotlinDebug\n*F\n+ 1 FloatingActionButton.kt\nandroidx/compose/material/FloatingActionButtonKt$ExtendedFloatingActionButton$1\n*L\n171#1:399\n171#1:400,9\n171#1:439\n171#1:409,6\n171#1:424,3\n171#1:433,2\n171#1:438\n171#1:415,9\n171#1:435,3\n171#1:427,6\n*E\n"})
    static final class a implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f21987a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f21988b;

        /* JADX WARN: Multi-variable type inference failed */
        a(Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function3) {
            this.f21987a = function2;
            this.f21988b = function3;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-555697957, i10, -1, "androidx.compose.material.ExtendedFloatingActionButton.<anonymous> (FloatingActionButton.kt:169)");
            }
            float f10 = this.f21987a == null ? a9.f21986d : a9.f21985c;
            androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
            androidx.compose.ui.a0 a0VarV = androidx.compose.foundation.layout.d5.v(aVar, f10, 0.0f, a9.f21986d, 0.0f, 10, null);
            androidx.compose.ui.e.c cVarQ = androidx.compose.ui.e.f37317a.q();
            Function2<androidx.compose.runtime.c0, Integer, Unit> function2 = this.f21987a;
            Function2<androidx.compose.runtime.c0, Integer, Unit> function3 = this.f21988b;
            androidx.compose.ui.layout.a1 a1VarE = androidx.compose.foundation.layout.u5.e(androidx.compose.foundation.layout.q.f16330a.w(), cVarQ, c0Var, 48);
            int iJ = androidx.compose.runtime.v.j(c0Var, 0);
            androidx.compose.runtime.b1 b1VarK = c0Var.k();
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0Var, a0VarV);
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
            androidx.compose.foundation.layout.y5 y5Var = androidx.compose.foundation.layout.y5.f16577a;
            if (function2 != null) {
                c0Var.E(185611238);
                function2.invoke(c0Var, 0);
                androidx.compose.foundation.layout.l6.a(androidx.compose.foundation.layout.i6.B(aVar, a9.f21985c), c0Var, 6);
                c0Var.A();
            } else {
                c0Var.E(185708299);
                c0Var.A();
            }
            function3.invoke(c0Var, 0);
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

    static final class b implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f21989a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f21990b;

        static final class a implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f21991a;

            /* JADX INFO: renamed from: androidx.compose.material.a9$b$a$a, reason: collision with other inner class name */
            @SourceDebugExtension({"SMAP\nFloatingActionButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 FloatingActionButton.kt\nandroidx/compose/material/FloatingActionButtonKt$FloatingActionButton$2$1$1\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,398:1\n70#2:399\n68#2,8:400\n77#2:438\n79#3,6:408\n86#3,3:423\n89#3,2:432\n93#3:437\n347#4,9:414\n356#4,3:434\n4206#5,6:426\n*S KotlinDebug\n*F\n+ 1 FloatingActionButton.kt\nandroidx/compose/material/FloatingActionButtonKt$FloatingActionButton$2$1$1\n*L\n105#1:399\n105#1:400,8\n105#1:438\n105#1:408,6\n105#1:423,3\n105#1:432,2\n105#1:437\n105#1:414,9\n105#1:434,3\n105#1:426,6\n*E\n"})
            static final class C0167a implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

                /* JADX INFO: renamed from: a, reason: collision with root package name */
                final /* synthetic */ Function2<androidx.compose.runtime.c0, Integer, Unit> f21992a;

                /* JADX WARN: Multi-variable type inference failed */
                C0167a(Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2) {
                    this.f21992a = function2;
                }

                @androidx.compose.runtime.o
                @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
                public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
                    if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                        c0Var.u();
                        return;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1686273317, i10, -1, "androidx.compose.material.FloatingActionButton.<anonymous>.<anonymous>.<anonymous> (FloatingActionButton.kt:104)");
                    }
                    androidx.compose.ui.a0 a0VarA = androidx.compose.foundation.layout.i6.a(androidx.compose.ui.a0.E, a9.f21983a, a9.f21983a);
                    androidx.compose.ui.e eVarI = androidx.compose.ui.e.f37317a.i();
                    Function2<androidx.compose.runtime.c0, Integer, Unit> function2 = this.f21992a;
                    androidx.compose.ui.layout.a1 a1VarK = androidx.compose.foundation.layout.x.k(eVarI, false);
                    int iJ = androidx.compose.runtime.v.j(c0Var, 0);
                    androidx.compose.runtime.b1 b1VarK = c0Var.k();
                    androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0Var, a0VarA);
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

            /* JADX WARN: Multi-variable type inference failed */
            a(Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2) {
                this.f21991a = function2;
            }

            @androidx.compose.runtime.o
            @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
            public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
                if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                    c0Var.u();
                    return;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1072292694, i10, -1, "androidx.compose.material.FloatingActionButton.<anonymous>.<anonymous> (FloatingActionButton.kt:103)");
                }
                wk.l(x9.f25488a.c(c0Var, 6).e(), androidx.compose.runtime.internal.w.e(-1686273317, true, new C0167a(this.f21991a), c0Var, 54), c0Var, 48);
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
        b(long j10, Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2) {
            this.f21989a = j10;
            this.f21990b = function2;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1823447062, i10, -1, "androidx.compose.material.FloatingActionButton.<anonymous> (FloatingActionButton.kt:102)");
            }
            androidx.compose.runtime.a1.e(w4.c().f(Float.valueOf(androidx.compose.ui.graphics.q0.A(this.f21989a))), androidx.compose.runtime.internal.w.e(-1072292694, true, new a(this.f21990b), c0Var, 54), c0Var, androidx.compose.runtime.n4.f36267i | 48);
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

    /* JADX WARN: Code duplicated, block: B:100:0x011d  */
    /* JADX WARN: Code duplicated, block: B:101:0x011f  */
    /* JADX WARN: Code duplicated, block: B:104:0x0128  */
    /* JADX WARN: Code duplicated, block: B:106:0x013c  */
    /* JADX WARN: Code duplicated, block: B:123:0x0171 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:124:0x0173  */
    /* JADX WARN: Code duplicated, block: B:127:0x0179  */
    /* JADX WARN: Code duplicated, block: B:129:0x017c  */
    /* JADX WARN: Code duplicated, block: B:132:0x0181  */
    /* JADX WARN: Code duplicated, block: B:135:0x019c  */
    /* JADX WARN: Code duplicated, block: B:136:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:139:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:140:0x01bf  */
    /* JADX WARN: Code duplicated, block: B:143:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:145:0x01fa  */
    /* JADX WARN: Code duplicated, block: B:148:0x020b  */
    /* JADX WARN: Code duplicated, block: B:151:0x026b  */
    /* JADX WARN: Code duplicated, block: B:153:0x0281  */
    /* JADX WARN: Code duplicated, block: B:156:0x029a  */
    /* JADX WARN: Code duplicated, block: B:158:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0068  */
    /* JADX WARN: Code duplicated, block: B:38:0x006d  */
    /* JADX WARN: Code duplicated, block: B:40:0x0071  */
    /* JADX WARN: Code duplicated, block: B:42:0x0079  */
    /* JADX WARN: Code duplicated, block: B:43:0x007c  */
    /* JADX WARN: Code duplicated, block: B:47:0x0083  */
    /* JADX WARN: Code duplicated, block: B:49:0x008a  */
    /* JADX WARN: Code duplicated, block: B:51:0x008e  */
    /* JADX WARN: Code duplicated, block: B:53:0x0096  */
    /* JADX WARN: Code duplicated, block: B:54:0x0099  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:79:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:84:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:86:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:91:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:93:0x0102  */
    /* JADX WARN: Code duplicated, block: B:94:0x0105  */
    /* JADX WARN: Code duplicated, block: B:97:0x010c  */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void d(@NotNull final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, @NotNull final Function0<Unit> function0, @Nullable androidx.compose.ui.a0 a0Var, @Nullable Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function3, @Nullable androidx.compose.foundation.interaction.j jVar, @Nullable androidx.compose.ui.graphics.q3 q3Var, long j10, long j11, @Nullable v8 v8Var, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        Function0<Unit> function1;
        androidx.compose.ui.a0 a0Var2;
        int i13;
        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function4;
        int i14;
        int i15;
        androidx.compose.foundation.interaction.j jVar2;
        int i16;
        androidx.compose.ui.graphics.q3 q3VarA;
        final v8 v8Var2;
        boolean z10;
        final androidx.compose.ui.a0 a0Var3;
        androidx.compose.runtime.c0 c0Var2;
        final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function5;
        final androidx.compose.foundation.interaction.j jVar3;
        final androidx.compose.ui.graphics.q3 q3Var2;
        final long j12;
        final long j13;
        androidx.compose.runtime.s5 s5VarT;
        int i17;
        long jL;
        long jD;
        androidx.compose.runtime.c0 c0Var3;
        v8 v8VarB;
        long j14;
        long j15;
        int i18;
        int i19;
        int i20;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1506973027);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c0VarR.k0(function2) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
            function1 = function0;
        } else {
            function1 = function0;
            if ((i10 & 48) == 0) {
                i12 |= c0VarR.k0(function1) ? 32 : 16;
            }
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
                    function4 = function3;
                    if (c0VarR.k0(function4)) {
                        i14 = 2048;
                    } else {
                        i14 = 1024;
                    }
                    i12 |= i14;
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
                            q3VarA = q3Var;
                            int i22 = c0VarR.D(q3VarA) ? 131072 : 65536;
                            i12 |= i22;
                        } else {
                            q3VarA = q3Var;
                        }
                        i12 |= i22;
                    } else {
                        q3VarA = q3Var;
                    }
                    if ((1572864 & i10) != 0) {
                        if ((i11 & 64) == 0 || !c0VarR.L(j10)) {
                            i20 = 524288;
                        } else {
                            i20 = 1048576;
                        }
                        i12 |= i20;
                    }
                    if ((i10 & 12582912) != 0) {
                        if ((i11 & 128) == 0 || !c0VarR.L(j11)) {
                            i19 = 4194304;
                        } else {
                            i19 = 8388608;
                        }
                        i12 |= i19;
                    }
                    if ((100663296 & i10) == 0) {
                        if ((i11 & 256) == 0) {
                            v8Var2 = v8Var;
                            if (c0VarR.D(v8Var2)) {
                                i18 = 67108864;
                            }
                            i12 |= i18;
                        } else {
                            v8Var2 = v8Var;
                        }
                        i18 = com.google.api.client.googleapis.media.a.f115410j;
                        i12 |= i18;
                    } else {
                        v8Var2 = v8Var;
                    }
                    if ((i12 & 38347923) != 38347922) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i12 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0 || c0VarR.y()) {
                            if (i21 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i13 != 0) {
                                function4 = null;
                            }
                            if (i15 != 0) {
                                jVar2 = null;
                            }
                            if ((i11 & 32) != 0) {
                                i12 &= -458753;
                                q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                            }
                            if ((i11 & 64) != 0) {
                                i17 = i12 & (-3670017);
                                jL = x9.f25488a.a(c0VarR, 6).l();
                            } else {
                                i17 = i12;
                                jL = j10;
                            }
                            if ((i11 & 128) != 0) {
                                jD = n4.d(jL, c0VarR, (i17 >> 18) & 14);
                                i17 &= -29360129;
                            } else {
                                jD = j11;
                            }
                            if ((i11 & 256) != 0) {
                                c0Var3 = c0VarR;
                                i17 &= -234881025;
                                v8VarB = u8.f25154a.b(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                            } else {
                                c0Var3 = c0VarR;
                                v8VarB = v8Var2;
                            }
                            j14 = jD;
                            j15 = jL;
                            i12 = i17;
                        } else {
                            c0VarR.u();
                            if ((i11 & 32) != 0) {
                                i12 &= -458753;
                            }
                            if ((i11 & 64) != 0) {
                                i12 &= -3670017;
                            }
                            if ((i11 & 128) != 0) {
                                i12 &= -29360129;
                            }
                            if ((i11 & 256) != 0) {
                                i12 &= -234881025;
                            }
                            j15 = j10;
                            j14 = j11;
                            c0Var3 = c0VarR;
                            jVar2 = jVar2;
                            v8VarB = v8Var2;
                        }
                        androidx.compose.ui.graphics.q3 q3Var3 = q3VarA;
                        c0Var3.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-1506973027, i12, -1, "androidx.compose.material.ExtendedFloatingActionButton (FloatingActionButton.kt:159)");
                        }
                        float f10 = f21984b;
                        int i23 = i12 >> 6;
                        f(function1, androidx.compose.foundation.layout.i6.A(a0Var2, f10, f10, 0.0f, 0.0f, 12, null), jVar2, q3Var3, j15, j14, v8VarB, androidx.compose.runtime.internal.w.e(-555697957, true, new a(function4, function2), c0Var3, 54), c0Var3, 12582912 | ((i12 >> 3) & 14) | (i23 & 896) | (i23 & 7168) | (57344 & i23) | (458752 & i23) | (i23 & 3670016), 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var2;
                        c0Var2 = c0Var3;
                        function5 = function4;
                        jVar3 = jVar2;
                        q3Var2 = q3Var3;
                        j12 = j15;
                        j13 = j14;
                        v8Var2 = v8VarB;
                    } else {
                        c0VarR.u();
                        a0Var3 = a0Var2;
                        c0Var2 = c0VarR;
                        function5 = function4;
                        jVar3 = jVar2;
                        q3Var2 = q3VarA;
                        j12 = j10;
                        j13 = j11;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material.z8
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return a9.e(function2, function0, a0Var3, function5, jVar3, q3Var2, j12, j13, v8Var2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 24576;
                jVar2 = jVar;
                if ((196608 & i10) == 0) {
                    if ((i11 & 32) == 0) {
                        q3VarA = q3Var;
                        if (c0VarR.D(q3VarA)) {
                        }
                        i12 |= i22;
                    } else {
                        q3VarA = q3Var;
                    }
                    i12 |= i22;
                } else {
                    q3VarA = q3Var;
                }
                if ((1572864 & i10) != 0) {
                    if ((i11 & 64) == 0) {
                        i20 = 524288;
                    } else {
                        i20 = 524288;
                    }
                    i12 |= i20;
                }
                if ((i10 & 12582912) != 0) {
                    if ((i11 & 128) == 0) {
                        i19 = 4194304;
                    } else {
                        i19 = 4194304;
                    }
                    i12 |= i19;
                }
                if ((100663296 & i10) == 0) {
                    if ((i11 & 256) == 0) {
                        v8Var2 = v8Var;
                        if (c0VarR.D(v8Var2)) {
                            i18 = 67108864;
                        }
                        i12 |= i18;
                    } else {
                        v8Var2 = v8Var;
                    }
                    i18 = com.google.api.client.googleapis.media.a.f115410j;
                    i12 |= i18;
                } else {
                    v8Var2 = v8Var;
                }
                if ((i12 & 38347923) != 38347922) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i21 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            function4 = null;
                        }
                        if (i15 != 0) {
                            jVar2 = null;
                        }
                        if ((i11 & 32) != 0) {
                            i12 &= -458753;
                            q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                        }
                        if ((i11 & 64) != 0) {
                            i17 = i12 & (-3670017);
                            jL = x9.f25488a.a(c0VarR, 6).l();
                        } else {
                            i17 = i12;
                            jL = j10;
                        }
                        if ((i11 & 128) != 0) {
                            jD = n4.d(jL, c0VarR, (i17 >> 18) & 14);
                            i17 &= -29360129;
                        } else {
                            jD = j11;
                        }
                        if ((i11 & 256) != 0) {
                            c0Var3 = c0VarR;
                            i17 &= -234881025;
                            v8VarB = u8.f25154a.b(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                        } else {
                            c0Var3 = c0VarR;
                            v8VarB = v8Var2;
                        }
                        j14 = jD;
                        j15 = jL;
                        i12 = i17;
                    } else {
                        if (i21 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            function4 = null;
                        }
                        if (i15 != 0) {
                            jVar2 = null;
                        }
                        if ((i11 & 32) != 0) {
                            i12 &= -458753;
                            q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                        }
                        if ((i11 & 64) != 0) {
                            i17 = i12 & (-3670017);
                            jL = x9.f25488a.a(c0VarR, 6).l();
                        } else {
                            i17 = i12;
                            jL = j10;
                        }
                        if ((i11 & 128) != 0) {
                            jD = n4.d(jL, c0VarR, (i17 >> 18) & 14);
                            i17 &= -29360129;
                        } else {
                            jD = j11;
                        }
                        if ((i11 & 256) != 0) {
                            c0Var3 = c0VarR;
                            i17 &= -234881025;
                            v8VarB = u8.f25154a.b(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                        } else {
                            c0Var3 = c0VarR;
                            v8VarB = v8Var2;
                        }
                        j14 = jD;
                        j15 = jL;
                        i12 = i17;
                    }
                    androidx.compose.ui.graphics.q3 q3Var4 = q3VarA;
                    c0Var3.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1506973027, i12, -1, "androidx.compose.material.ExtendedFloatingActionButton (FloatingActionButton.kt:159)");
                    }
                    float f11 = f21984b;
                    int i24 = i12 >> 6;
                    f(function1, androidx.compose.foundation.layout.i6.A(a0Var2, f11, f11, 0.0f, 0.0f, 12, null), jVar2, q3Var4, j15, j14, v8VarB, androidx.compose.runtime.internal.w.e(-555697957, true, new a(function4, function2), c0Var3, 54), c0Var3, 12582912 | ((i12 >> 3) & 14) | (i24 & 896) | (i24 & 7168) | (57344 & i24) | (458752 & i24) | (i24 & 3670016), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var2;
                    c0Var2 = c0Var3;
                    function5 = function4;
                    jVar3 = jVar2;
                    q3Var2 = q3Var4;
                    j12 = j15;
                    j13 = j14;
                    v8Var2 = v8VarB;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    c0Var2 = c0VarR;
                    function5 = function4;
                    jVar3 = jVar2;
                    q3Var2 = q3VarA;
                    j12 = j10;
                    j13 = j11;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.z8
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return a9.e(function2, function0, a0Var3, function5, jVar3, q3Var2, j12, j13, v8Var2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 3072;
            function4 = function3;
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
                        q3VarA = q3Var;
                        if (c0VarR.D(q3VarA)) {
                        }
                        i12 |= i22;
                    } else {
                        q3VarA = q3Var;
                    }
                    i12 |= i22;
                } else {
                    q3VarA = q3Var;
                }
                if ((1572864 & i10) != 0) {
                    if ((i11 & 64) == 0) {
                        i20 = 524288;
                    } else {
                        i20 = 524288;
                    }
                    i12 |= i20;
                }
                if ((i10 & 12582912) != 0) {
                    if ((i11 & 128) == 0) {
                        i19 = 4194304;
                    } else {
                        i19 = 4194304;
                    }
                    i12 |= i19;
                }
                if ((100663296 & i10) == 0) {
                    if ((i11 & 256) == 0) {
                        v8Var2 = v8Var;
                        if (c0VarR.D(v8Var2)) {
                            i18 = 67108864;
                        }
                        i12 |= i18;
                    } else {
                        v8Var2 = v8Var;
                    }
                    i18 = com.google.api.client.googleapis.media.a.f115410j;
                    i12 |= i18;
                } else {
                    v8Var2 = v8Var;
                }
                if ((i12 & 38347923) != 38347922) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i21 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            function4 = null;
                        }
                        if (i15 != 0) {
                            jVar2 = null;
                        }
                        if ((i11 & 32) != 0) {
                            i12 &= -458753;
                            q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                        }
                        if ((i11 & 64) != 0) {
                            i17 = i12 & (-3670017);
                            jL = x9.f25488a.a(c0VarR, 6).l();
                        } else {
                            i17 = i12;
                            jL = j10;
                        }
                        if ((i11 & 128) != 0) {
                            jD = n4.d(jL, c0VarR, (i17 >> 18) & 14);
                            i17 &= -29360129;
                        } else {
                            jD = j11;
                        }
                        if ((i11 & 256) != 0) {
                            c0Var3 = c0VarR;
                            i17 &= -234881025;
                            v8VarB = u8.f25154a.b(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                        } else {
                            c0Var3 = c0VarR;
                            v8VarB = v8Var2;
                        }
                        j14 = jD;
                        j15 = jL;
                        i12 = i17;
                    } else {
                        if (i21 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            function4 = null;
                        }
                        if (i15 != 0) {
                            jVar2 = null;
                        }
                        if ((i11 & 32) != 0) {
                            i12 &= -458753;
                            q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                        }
                        if ((i11 & 64) != 0) {
                            i17 = i12 & (-3670017);
                            jL = x9.f25488a.a(c0VarR, 6).l();
                        } else {
                            i17 = i12;
                            jL = j10;
                        }
                        if ((i11 & 128) != 0) {
                            jD = n4.d(jL, c0VarR, (i17 >> 18) & 14);
                            i17 &= -29360129;
                        } else {
                            jD = j11;
                        }
                        if ((i11 & 256) != 0) {
                            c0Var3 = c0VarR;
                            i17 &= -234881025;
                            v8VarB = u8.f25154a.b(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                        } else {
                            c0Var3 = c0VarR;
                            v8VarB = v8Var2;
                        }
                        j14 = jD;
                        j15 = jL;
                        i12 = i17;
                    }
                    androidx.compose.ui.graphics.q3 q3Var5 = q3VarA;
                    c0Var3.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1506973027, i12, -1, "androidx.compose.material.ExtendedFloatingActionButton (FloatingActionButton.kt:159)");
                    }
                    float f12 = f21984b;
                    int i25 = i12 >> 6;
                    f(function1, androidx.compose.foundation.layout.i6.A(a0Var2, f12, f12, 0.0f, 0.0f, 12, null), jVar2, q3Var5, j15, j14, v8VarB, androidx.compose.runtime.internal.w.e(-555697957, true, new a(function4, function2), c0Var3, 54), c0Var3, 12582912 | ((i12 >> 3) & 14) | (i25 & 896) | (i25 & 7168) | (57344 & i25) | (458752 & i25) | (i25 & 3670016), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var2;
                    c0Var2 = c0Var3;
                    function5 = function4;
                    jVar3 = jVar2;
                    q3Var2 = q3Var5;
                    j12 = j15;
                    j13 = j14;
                    v8Var2 = v8VarB;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    c0Var2 = c0VarR;
                    function5 = function4;
                    jVar3 = jVar2;
                    q3Var2 = q3VarA;
                    j12 = j10;
                    j13 = j11;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.z8
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return a9.e(function2, function0, a0Var3, function5, jVar3, q3Var2, j12, j13, v8Var2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 24576;
            jVar2 = jVar;
            if ((196608 & i10) == 0) {
                if ((i11 & 32) == 0) {
                    q3VarA = q3Var;
                    if (c0VarR.D(q3VarA)) {
                    }
                    i12 |= i22;
                } else {
                    q3VarA = q3Var;
                }
                i12 |= i22;
            } else {
                q3VarA = q3Var;
            }
            if ((1572864 & i10) != 0) {
                if ((i11 & 64) == 0) {
                    i20 = 524288;
                } else {
                    i20 = 524288;
                }
                i12 |= i20;
            }
            if ((i10 & 12582912) != 0) {
                if ((i11 & 128) == 0) {
                    i19 = 4194304;
                } else {
                    i19 = 4194304;
                }
                i12 |= i19;
            }
            if ((100663296 & i10) == 0) {
                if ((i11 & 256) == 0) {
                    v8Var2 = v8Var;
                    if (c0VarR.D(v8Var2)) {
                        i18 = 67108864;
                    }
                    i12 |= i18;
                } else {
                    v8Var2 = v8Var;
                }
                i18 = com.google.api.client.googleapis.media.a.f115410j;
                i12 |= i18;
            } else {
                v8Var2 = v8Var;
            }
            if ((i12 & 38347923) != 38347922) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i21 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i13 != 0) {
                        function4 = null;
                    }
                    if (i15 != 0) {
                        jVar2 = null;
                    }
                    if ((i11 & 32) != 0) {
                        i12 &= -458753;
                        q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                    }
                    if ((i11 & 64) != 0) {
                        i17 = i12 & (-3670017);
                        jL = x9.f25488a.a(c0VarR, 6).l();
                    } else {
                        i17 = i12;
                        jL = j10;
                    }
                    if ((i11 & 128) != 0) {
                        jD = n4.d(jL, c0VarR, (i17 >> 18) & 14);
                        i17 &= -29360129;
                    } else {
                        jD = j11;
                    }
                    if ((i11 & 256) != 0) {
                        c0Var3 = c0VarR;
                        i17 &= -234881025;
                        v8VarB = u8.f25154a.b(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                    } else {
                        c0Var3 = c0VarR;
                        v8VarB = v8Var2;
                    }
                    j14 = jD;
                    j15 = jL;
                    i12 = i17;
                } else {
                    if (i21 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i13 != 0) {
                        function4 = null;
                    }
                    if (i15 != 0) {
                        jVar2 = null;
                    }
                    if ((i11 & 32) != 0) {
                        i12 &= -458753;
                        q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                    }
                    if ((i11 & 64) != 0) {
                        i17 = i12 & (-3670017);
                        jL = x9.f25488a.a(c0VarR, 6).l();
                    } else {
                        i17 = i12;
                        jL = j10;
                    }
                    if ((i11 & 128) != 0) {
                        jD = n4.d(jL, c0VarR, (i17 >> 18) & 14);
                        i17 &= -29360129;
                    } else {
                        jD = j11;
                    }
                    if ((i11 & 256) != 0) {
                        c0Var3 = c0VarR;
                        i17 &= -234881025;
                        v8VarB = u8.f25154a.b(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                    } else {
                        c0Var3 = c0VarR;
                        v8VarB = v8Var2;
                    }
                    j14 = jD;
                    j15 = jL;
                    i12 = i17;
                }
                androidx.compose.ui.graphics.q3 q3Var6 = q3VarA;
                c0Var3.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1506973027, i12, -1, "androidx.compose.material.ExtendedFloatingActionButton (FloatingActionButton.kt:159)");
                }
                float f13 = f21984b;
                int i26 = i12 >> 6;
                f(function1, androidx.compose.foundation.layout.i6.A(a0Var2, f13, f13, 0.0f, 0.0f, 12, null), jVar2, q3Var6, j15, j14, v8VarB, androidx.compose.runtime.internal.w.e(-555697957, true, new a(function4, function2), c0Var3, 54), c0Var3, 12582912 | ((i12 >> 3) & 14) | (i26 & 896) | (i26 & 7168) | (57344 & i26) | (458752 & i26) | (i26 & 3670016), 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var2;
                c0Var2 = c0Var3;
                function5 = function4;
                jVar3 = jVar2;
                q3Var2 = q3Var6;
                j12 = j15;
                j13 = j14;
                v8Var2 = v8VarB;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                c0Var2 = c0VarR;
                function5 = function4;
                jVar3 = jVar2;
                q3Var2 = q3VarA;
                j12 = j10;
                j13 = j11;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material.z8
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return a9.e(function2, function0, a0Var3, function5, jVar3, q3Var2, j12, j13, v8Var2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= androidx.media3.exoplayer.a5.S0;
        a0Var2 = a0Var;
        i13 = i11 & 8;
        if (i13 != 0) {
            if ((i10 & 3072) == 0) {
                function4 = function3;
                if (c0VarR.k0(function4)) {
                    i14 = 2048;
                } else {
                    i14 = 1024;
                }
                i12 |= i14;
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
                        q3VarA = q3Var;
                        if (c0VarR.D(q3VarA)) {
                        }
                        i12 |= i22;
                    } else {
                        q3VarA = q3Var;
                    }
                    i12 |= i22;
                } else {
                    q3VarA = q3Var;
                }
                if ((1572864 & i10) != 0) {
                    if ((i11 & 64) == 0) {
                        i20 = 524288;
                    } else {
                        i20 = 524288;
                    }
                    i12 |= i20;
                }
                if ((i10 & 12582912) != 0) {
                    if ((i11 & 128) == 0) {
                        i19 = 4194304;
                    } else {
                        i19 = 4194304;
                    }
                    i12 |= i19;
                }
                if ((100663296 & i10) == 0) {
                    if ((i11 & 256) == 0) {
                        v8Var2 = v8Var;
                        if (c0VarR.D(v8Var2)) {
                            i18 = 67108864;
                        }
                        i12 |= i18;
                    } else {
                        v8Var2 = v8Var;
                    }
                    i18 = com.google.api.client.googleapis.media.a.f115410j;
                    i12 |= i18;
                } else {
                    v8Var2 = v8Var;
                }
                if ((i12 & 38347923) != 38347922) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i21 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            function4 = null;
                        }
                        if (i15 != 0) {
                            jVar2 = null;
                        }
                        if ((i11 & 32) != 0) {
                            i12 &= -458753;
                            q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                        }
                        if ((i11 & 64) != 0) {
                            i17 = i12 & (-3670017);
                            jL = x9.f25488a.a(c0VarR, 6).l();
                        } else {
                            i17 = i12;
                            jL = j10;
                        }
                        if ((i11 & 128) != 0) {
                            jD = n4.d(jL, c0VarR, (i17 >> 18) & 14);
                            i17 &= -29360129;
                        } else {
                            jD = j11;
                        }
                        if ((i11 & 256) != 0) {
                            c0Var3 = c0VarR;
                            i17 &= -234881025;
                            v8VarB = u8.f25154a.b(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                        } else {
                            c0Var3 = c0VarR;
                            v8VarB = v8Var2;
                        }
                        j14 = jD;
                        j15 = jL;
                        i12 = i17;
                    } else {
                        if (i21 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            function4 = null;
                        }
                        if (i15 != 0) {
                            jVar2 = null;
                        }
                        if ((i11 & 32) != 0) {
                            i12 &= -458753;
                            q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                        }
                        if ((i11 & 64) != 0) {
                            i17 = i12 & (-3670017);
                            jL = x9.f25488a.a(c0VarR, 6).l();
                        } else {
                            i17 = i12;
                            jL = j10;
                        }
                        if ((i11 & 128) != 0) {
                            jD = n4.d(jL, c0VarR, (i17 >> 18) & 14);
                            i17 &= -29360129;
                        } else {
                            jD = j11;
                        }
                        if ((i11 & 256) != 0) {
                            c0Var3 = c0VarR;
                            i17 &= -234881025;
                            v8VarB = u8.f25154a.b(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                        } else {
                            c0Var3 = c0VarR;
                            v8VarB = v8Var2;
                        }
                        j14 = jD;
                        j15 = jL;
                        i12 = i17;
                    }
                    androidx.compose.ui.graphics.q3 q3Var7 = q3VarA;
                    c0Var3.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1506973027, i12, -1, "androidx.compose.material.ExtendedFloatingActionButton (FloatingActionButton.kt:159)");
                    }
                    float f14 = f21984b;
                    int i27 = i12 >> 6;
                    f(function1, androidx.compose.foundation.layout.i6.A(a0Var2, f14, f14, 0.0f, 0.0f, 12, null), jVar2, q3Var7, j15, j14, v8VarB, androidx.compose.runtime.internal.w.e(-555697957, true, new a(function4, function2), c0Var3, 54), c0Var3, 12582912 | ((i12 >> 3) & 14) | (i27 & 896) | (i27 & 7168) | (57344 & i27) | (458752 & i27) | (i27 & 3670016), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var2;
                    c0Var2 = c0Var3;
                    function5 = function4;
                    jVar3 = jVar2;
                    q3Var2 = q3Var7;
                    j12 = j15;
                    j13 = j14;
                    v8Var2 = v8VarB;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    c0Var2 = c0VarR;
                    function5 = function4;
                    jVar3 = jVar2;
                    q3Var2 = q3VarA;
                    j12 = j10;
                    j13 = j11;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.z8
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return a9.e(function2, function0, a0Var3, function5, jVar3, q3Var2, j12, j13, v8Var2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 24576;
            jVar2 = jVar;
            if ((196608 & i10) == 0) {
                if ((i11 & 32) == 0) {
                    q3VarA = q3Var;
                    if (c0VarR.D(q3VarA)) {
                    }
                    i12 |= i22;
                } else {
                    q3VarA = q3Var;
                }
                i12 |= i22;
            } else {
                q3VarA = q3Var;
            }
            if ((1572864 & i10) != 0) {
                if ((i11 & 64) == 0) {
                    i20 = 524288;
                } else {
                    i20 = 524288;
                }
                i12 |= i20;
            }
            if ((i10 & 12582912) != 0) {
                if ((i11 & 128) == 0) {
                    i19 = 4194304;
                } else {
                    i19 = 4194304;
                }
                i12 |= i19;
            }
            if ((100663296 & i10) == 0) {
                if ((i11 & 256) == 0) {
                    v8Var2 = v8Var;
                    if (c0VarR.D(v8Var2)) {
                        i18 = 67108864;
                    }
                    i12 |= i18;
                } else {
                    v8Var2 = v8Var;
                }
                i18 = com.google.api.client.googleapis.media.a.f115410j;
                i12 |= i18;
            } else {
                v8Var2 = v8Var;
            }
            if ((i12 & 38347923) != 38347922) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i21 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i13 != 0) {
                        function4 = null;
                    }
                    if (i15 != 0) {
                        jVar2 = null;
                    }
                    if ((i11 & 32) != 0) {
                        i12 &= -458753;
                        q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                    }
                    if ((i11 & 64) != 0) {
                        i17 = i12 & (-3670017);
                        jL = x9.f25488a.a(c0VarR, 6).l();
                    } else {
                        i17 = i12;
                        jL = j10;
                    }
                    if ((i11 & 128) != 0) {
                        jD = n4.d(jL, c0VarR, (i17 >> 18) & 14);
                        i17 &= -29360129;
                    } else {
                        jD = j11;
                    }
                    if ((i11 & 256) != 0) {
                        c0Var3 = c0VarR;
                        i17 &= -234881025;
                        v8VarB = u8.f25154a.b(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                    } else {
                        c0Var3 = c0VarR;
                        v8VarB = v8Var2;
                    }
                    j14 = jD;
                    j15 = jL;
                    i12 = i17;
                } else {
                    if (i21 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i13 != 0) {
                        function4 = null;
                    }
                    if (i15 != 0) {
                        jVar2 = null;
                    }
                    if ((i11 & 32) != 0) {
                        i12 &= -458753;
                        q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                    }
                    if ((i11 & 64) != 0) {
                        i17 = i12 & (-3670017);
                        jL = x9.f25488a.a(c0VarR, 6).l();
                    } else {
                        i17 = i12;
                        jL = j10;
                    }
                    if ((i11 & 128) != 0) {
                        jD = n4.d(jL, c0VarR, (i17 >> 18) & 14);
                        i17 &= -29360129;
                    } else {
                        jD = j11;
                    }
                    if ((i11 & 256) != 0) {
                        c0Var3 = c0VarR;
                        i17 &= -234881025;
                        v8VarB = u8.f25154a.b(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                    } else {
                        c0Var3 = c0VarR;
                        v8VarB = v8Var2;
                    }
                    j14 = jD;
                    j15 = jL;
                    i12 = i17;
                }
                androidx.compose.ui.graphics.q3 q3Var8 = q3VarA;
                c0Var3.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1506973027, i12, -1, "androidx.compose.material.ExtendedFloatingActionButton (FloatingActionButton.kt:159)");
                }
                float f15 = f21984b;
                int i28 = i12 >> 6;
                f(function1, androidx.compose.foundation.layout.i6.A(a0Var2, f15, f15, 0.0f, 0.0f, 12, null), jVar2, q3Var8, j15, j14, v8VarB, androidx.compose.runtime.internal.w.e(-555697957, true, new a(function4, function2), c0Var3, 54), c0Var3, 12582912 | ((i12 >> 3) & 14) | (i28 & 896) | (i28 & 7168) | (57344 & i28) | (458752 & i28) | (i28 & 3670016), 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var2;
                c0Var2 = c0Var3;
                function5 = function4;
                jVar3 = jVar2;
                q3Var2 = q3Var8;
                j12 = j15;
                j13 = j14;
                v8Var2 = v8VarB;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                c0Var2 = c0VarR;
                function5 = function4;
                jVar3 = jVar2;
                q3Var2 = q3VarA;
                j12 = j10;
                j13 = j11;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material.z8
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return a9.e(function2, function0, a0Var3, function5, jVar3, q3Var2, j12, j13, v8Var2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 3072;
        function4 = function3;
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
                    q3VarA = q3Var;
                    if (c0VarR.D(q3VarA)) {
                    }
                    i12 |= i22;
                } else {
                    q3VarA = q3Var;
                }
                i12 |= i22;
            } else {
                q3VarA = q3Var;
            }
            if ((1572864 & i10) != 0) {
                if ((i11 & 64) == 0) {
                    i20 = 524288;
                } else {
                    i20 = 524288;
                }
                i12 |= i20;
            }
            if ((i10 & 12582912) != 0) {
                if ((i11 & 128) == 0) {
                    i19 = 4194304;
                } else {
                    i19 = 4194304;
                }
                i12 |= i19;
            }
            if ((100663296 & i10) == 0) {
                if ((i11 & 256) == 0) {
                    v8Var2 = v8Var;
                    if (c0VarR.D(v8Var2)) {
                        i18 = 67108864;
                    }
                    i12 |= i18;
                } else {
                    v8Var2 = v8Var;
                }
                i18 = com.google.api.client.googleapis.media.a.f115410j;
                i12 |= i18;
            } else {
                v8Var2 = v8Var;
            }
            if ((i12 & 38347923) != 38347922) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i21 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i13 != 0) {
                        function4 = null;
                    }
                    if (i15 != 0) {
                        jVar2 = null;
                    }
                    if ((i11 & 32) != 0) {
                        i12 &= -458753;
                        q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                    }
                    if ((i11 & 64) != 0) {
                        i17 = i12 & (-3670017);
                        jL = x9.f25488a.a(c0VarR, 6).l();
                    } else {
                        i17 = i12;
                        jL = j10;
                    }
                    if ((i11 & 128) != 0) {
                        jD = n4.d(jL, c0VarR, (i17 >> 18) & 14);
                        i17 &= -29360129;
                    } else {
                        jD = j11;
                    }
                    if ((i11 & 256) != 0) {
                        c0Var3 = c0VarR;
                        i17 &= -234881025;
                        v8VarB = u8.f25154a.b(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                    } else {
                        c0Var3 = c0VarR;
                        v8VarB = v8Var2;
                    }
                    j14 = jD;
                    j15 = jL;
                    i12 = i17;
                } else {
                    if (i21 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i13 != 0) {
                        function4 = null;
                    }
                    if (i15 != 0) {
                        jVar2 = null;
                    }
                    if ((i11 & 32) != 0) {
                        i12 &= -458753;
                        q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                    }
                    if ((i11 & 64) != 0) {
                        i17 = i12 & (-3670017);
                        jL = x9.f25488a.a(c0VarR, 6).l();
                    } else {
                        i17 = i12;
                        jL = j10;
                    }
                    if ((i11 & 128) != 0) {
                        jD = n4.d(jL, c0VarR, (i17 >> 18) & 14);
                        i17 &= -29360129;
                    } else {
                        jD = j11;
                    }
                    if ((i11 & 256) != 0) {
                        c0Var3 = c0VarR;
                        i17 &= -234881025;
                        v8VarB = u8.f25154a.b(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                    } else {
                        c0Var3 = c0VarR;
                        v8VarB = v8Var2;
                    }
                    j14 = jD;
                    j15 = jL;
                    i12 = i17;
                }
                androidx.compose.ui.graphics.q3 q3Var9 = q3VarA;
                c0Var3.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1506973027, i12, -1, "androidx.compose.material.ExtendedFloatingActionButton (FloatingActionButton.kt:159)");
                }
                float f16 = f21984b;
                int i29 = i12 >> 6;
                f(function1, androidx.compose.foundation.layout.i6.A(a0Var2, f16, f16, 0.0f, 0.0f, 12, null), jVar2, q3Var9, j15, j14, v8VarB, androidx.compose.runtime.internal.w.e(-555697957, true, new a(function4, function2), c0Var3, 54), c0Var3, 12582912 | ((i12 >> 3) & 14) | (i29 & 896) | (i29 & 7168) | (57344 & i29) | (458752 & i29) | (i29 & 3670016), 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var2;
                c0Var2 = c0Var3;
                function5 = function4;
                jVar3 = jVar2;
                q3Var2 = q3Var9;
                j12 = j15;
                j13 = j14;
                v8Var2 = v8VarB;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                c0Var2 = c0VarR;
                function5 = function4;
                jVar3 = jVar2;
                q3Var2 = q3VarA;
                j12 = j10;
                j13 = j11;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material.z8
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return a9.e(function2, function0, a0Var3, function5, jVar3, q3Var2, j12, j13, v8Var2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 24576;
        jVar2 = jVar;
        if ((196608 & i10) == 0) {
            if ((i11 & 32) == 0) {
                q3VarA = q3Var;
                if (c0VarR.D(q3VarA)) {
                }
                i12 |= i22;
            } else {
                q3VarA = q3Var;
            }
            i12 |= i22;
        } else {
            q3VarA = q3Var;
        }
        if ((1572864 & i10) != 0) {
            if ((i11 & 64) == 0) {
                i20 = 524288;
            } else {
                i20 = 524288;
            }
            i12 |= i20;
        }
        if ((i10 & 12582912) != 0) {
            if ((i11 & 128) == 0) {
                i19 = 4194304;
            } else {
                i19 = 4194304;
            }
            i12 |= i19;
        }
        if ((100663296 & i10) == 0) {
            if ((i11 & 256) == 0) {
                v8Var2 = v8Var;
                if (c0VarR.D(v8Var2)) {
                    i18 = 67108864;
                }
                i12 |= i18;
            } else {
                v8Var2 = v8Var;
            }
            i18 = com.google.api.client.googleapis.media.a.f115410j;
            i12 |= i18;
        } else {
            v8Var2 = v8Var;
        }
        if ((i12 & 38347923) != 38347922) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c0VarR.h(z10, i12 & 1)) {
            c0VarR.l0();
            if ((i10 & 1) != 0) {
                if (i21 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                }
                if (i13 != 0) {
                    function4 = null;
                }
                if (i15 != 0) {
                    jVar2 = null;
                }
                if ((i11 & 32) != 0) {
                    i12 &= -458753;
                    q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                }
                if ((i11 & 64) != 0) {
                    i17 = i12 & (-3670017);
                    jL = x9.f25488a.a(c0VarR, 6).l();
                } else {
                    i17 = i12;
                    jL = j10;
                }
                if ((i11 & 128) != 0) {
                    jD = n4.d(jL, c0VarR, (i17 >> 18) & 14);
                    i17 &= -29360129;
                } else {
                    jD = j11;
                }
                if ((i11 & 256) != 0) {
                    c0Var3 = c0VarR;
                    i17 &= -234881025;
                    v8VarB = u8.f25154a.b(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                } else {
                    c0Var3 = c0VarR;
                    v8VarB = v8Var2;
                }
                j14 = jD;
                j15 = jL;
                i12 = i17;
            } else {
                if (i21 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                }
                if (i13 != 0) {
                    function4 = null;
                }
                if (i15 != 0) {
                    jVar2 = null;
                }
                if ((i11 & 32) != 0) {
                    i12 &= -458753;
                    q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                }
                if ((i11 & 64) != 0) {
                    i17 = i12 & (-3670017);
                    jL = x9.f25488a.a(c0VarR, 6).l();
                } else {
                    i17 = i12;
                    jL = j10;
                }
                if ((i11 & 128) != 0) {
                    jD = n4.d(jL, c0VarR, (i17 >> 18) & 14);
                    i17 &= -29360129;
                } else {
                    jD = j11;
                }
                if ((i11 & 256) != 0) {
                    c0Var3 = c0VarR;
                    i17 &= -234881025;
                    v8VarB = u8.f25154a.b(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                } else {
                    c0Var3 = c0VarR;
                    v8VarB = v8Var2;
                }
                j14 = jD;
                j15 = jL;
                i12 = i17;
            }
            androidx.compose.ui.graphics.q3 q3Var10 = q3VarA;
            c0Var3.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1506973027, i12, -1, "androidx.compose.material.ExtendedFloatingActionButton (FloatingActionButton.kt:159)");
            }
            float f17 = f21984b;
            int i210 = i12 >> 6;
            f(function1, androidx.compose.foundation.layout.i6.A(a0Var2, f17, f17, 0.0f, 0.0f, 12, null), jVar2, q3Var10, j15, j14, v8VarB, androidx.compose.runtime.internal.w.e(-555697957, true, new a(function4, function2), c0Var3, 54), c0Var3, 12582912 | ((i12 >> 3) & 14) | (i210 & 896) | (i210 & 7168) | (57344 & i210) | (458752 & i210) | (i210 & 3670016), 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            a0Var3 = a0Var2;
            c0Var2 = c0Var3;
            function5 = function4;
            jVar3 = jVar2;
            q3Var2 = q3Var10;
            j12 = j15;
            j13 = j14;
            v8Var2 = v8VarB;
        } else {
            c0VarR.u();
            a0Var3 = a0Var2;
            c0Var2 = c0VarR;
            function5 = function4;
            jVar3 = jVar2;
            q3Var2 = q3VarA;
            j12 = j10;
            j13 = j11;
        }
        s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material.z8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return a9.e(function2, function0, a0Var3, function5, jVar3, q3Var2, j12, j13, v8Var2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(Function2 function2, Function0 function0, androidx.compose.ui.a0 a0Var, Function2 function3, androidx.compose.foundation.interaction.j jVar, androidx.compose.ui.graphics.q3 q3Var, long j10, long j11, v8 v8Var, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        d(function2, function0, a0Var, function3, jVar, q3Var, j10, j11, v8Var, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    /* JADX WARN: Code duplicated, block: B:112:0x014a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:113:0x014c  */
    /* JADX WARN: Code duplicated, block: B:114:0x014f  */
    /* JADX WARN: Code duplicated, block: B:116:0x0153  */
    /* JADX WARN: Code duplicated, block: B:119:0x0159  */
    /* JADX WARN: Code duplicated, block: B:120:0x0170  */
    /* JADX WARN: Code duplicated, block: B:123:0x0175  */
    /* JADX WARN: Code duplicated, block: B:124:0x0182  */
    /* JADX WARN: Code duplicated, block: B:127:0x0187  */
    /* JADX WARN: Code duplicated, block: B:130:0x0195  */
    /* JADX WARN: Code duplicated, block: B:132:0x01ce  */
    /* JADX WARN: Code duplicated, block: B:135:0x01db  */
    /* JADX WARN: Code duplicated, block: B:137:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:139:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:141:0x0202  */
    /* JADX WARN: Code duplicated, block: B:144:0x0219  */
    /* JADX WARN: Code duplicated, block: B:147:0x0274  */
    /* JADX WARN: Code duplicated, block: B:150:0x0285  */
    /* JADX WARN: Code duplicated, block: B:153:0x0298  */
    /* JADX WARN: Code duplicated, block: B:155:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004f  */
    /* JADX WARN: Code duplicated, block: B:28:0x0054  */
    /* JADX WARN: Code duplicated, block: B:30:0x0058  */
    /* JADX WARN: Code duplicated, block: B:32:0x0060  */
    /* JADX WARN: Code duplicated, block: B:33:0x0063  */
    /* JADX WARN: Code duplicated, block: B:37:0x006a  */
    /* JADX WARN: Code duplicated, block: B:39:0x006e  */
    /* JADX WARN: Code duplicated, block: B:41:0x0076  */
    /* JADX WARN: Code duplicated, block: B:42:0x0079  */
    /* JADX WARN: Code duplicated, block: B:45:0x007f  */
    /* JADX WARN: Code duplicated, block: B:48:0x0087  */
    /* JADX WARN: Code duplicated, block: B:50:0x008b  */
    /* JADX WARN: Code duplicated, block: B:52:0x0093  */
    /* JADX WARN: Code duplicated, block: B:53:0x0096  */
    /* JADX WARN: Code duplicated, block: B:56:0x009c  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:63:0x00af  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c7  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:80:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:85:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:86:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:90:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:91:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:94:0x0107  */
    /* JADX WARN: Code duplicated, block: B:96:0x0117  */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    public static final void f(@NotNull final Function0<Unit> function0, @Nullable androidx.compose.ui.a0 a0Var, @Nullable androidx.compose.foundation.interaction.j jVar, @Nullable androidx.compose.ui.graphics.q3 q3Var, long j10, long j11, @Nullable v8 v8Var, @NotNull final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        Function0<Unit> function1;
        int i12;
        int i13;
        androidx.compose.foundation.interaction.j jVar2;
        int i14;
        androidx.compose.ui.graphics.q3 q3Var2;
        long j12;
        long jD;
        int i15;
        boolean z10;
        androidx.compose.runtime.c0 c0Var2;
        final androidx.compose.foundation.interaction.j jVar3;
        final androidx.compose.ui.graphics.q3 q3Var3;
        final long j13;
        final long j14;
        final v8 v8Var2;
        final androidx.compose.ui.a0 a0Var2;
        androidx.compose.runtime.s5 s5VarT;
        androidx.compose.ui.a0 a0Var3;
        androidx.compose.ui.graphics.q3 q3VarA;
        long jL;
        androidx.compose.runtime.c0 c0Var3;
        v8 v8VarB;
        androidx.compose.ui.graphics.q3 q3Var4;
        long j15;
        boolean z11;
        int i16;
        androidx.compose.foundation.interaction.j jVar4;
        Object objI0;
        Object objI1;
        int i17;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-482679837);
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
                i12 |= c0VarR.D(a0Var) ? 32 : 16;
            }
            i13 = i11 & 4;
            if (i13 != 0) {
                if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                    jVar2 = jVar;
                    if (c0VarR.D(jVar2)) {
                        i14 = 256;
                    } else {
                        i14 = 128;
                    }
                    i12 |= i14;
                }
                if ((i10 & 3072) == 0) {
                    if ((i11 & 8) == 0) {
                        q3Var2 = q3Var;
                        int i19 = c0VarR.D(q3Var2) ? 2048 : 1024;
                        i12 |= i19;
                    } else {
                        q3Var2 = q3Var;
                    }
                    i12 |= i19;
                } else {
                    q3Var2 = q3Var;
                }
                if ((i10 & 24576) == 0) {
                    if ((i11 & 16) == 0) {
                        j12 = j10;
                        int i20 = c0VarR.L(j12) ? 16384 : 8192;
                        i12 |= i20;
                    } else {
                        j12 = j10;
                    }
                    i12 |= i20;
                } else {
                    j12 = j10;
                }
                if ((196608 & i10) == 0) {
                    if ((i11 & 32) == 0) {
                        jD = j11;
                        int i21 = c0VarR.L(jD) ? 131072 : 65536;
                        i12 |= i21;
                    } else {
                        jD = j11;
                    }
                    i12 |= i21;
                } else {
                    jD = j11;
                }
                if ((i10 & 1572864) != 0) {
                    if ((i11 & 64) == 0 || !c0VarR.D(v8Var)) {
                        i17 = 524288;
                    } else {
                        i17 = 1048576;
                    }
                    i12 |= i17;
                }
                if ((i11 & 128) != 0) {
                    i12 |= 12582912;
                } else if ((i10 & 12582912) == 0) {
                    if (c0VarR.k0(function2)) {
                        i15 = 8388608;
                    } else {
                        i15 = 4194304;
                    }
                    i12 |= i15;
                }
                if ((4793491 & i12) != 4793490) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0 || c0VarR.y()) {
                        if (i18 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var;
                        }
                        if (i13 != 0) {
                            jVar2 = null;
                        }
                        if ((i11 & 8) != 0) {
                            q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                            i12 &= -7169;
                        } else {
                            q3VarA = q3Var2;
                        }
                        if ((i11 & 16) != 0) {
                            jL = x9.f25488a.a(c0VarR, 6).l();
                            i12 &= -57345;
                        } else {
                            jL = j12;
                        }
                        if ((i11 & 32) != 0) {
                            jD = n4.d(jL, c0VarR, (i12 >> 12) & 14);
                            i12 &= -458753;
                        }
                        if ((i11 & 64) != 0) {
                            v8VarB = u8.f25154a.b(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                            c0Var3 = c0VarR;
                            i12 &= -3670017;
                        } else {
                            c0Var3 = c0VarR;
                            v8VarB = v8Var;
                        }
                        q3Var4 = q3VarA;
                        j15 = jL;
                        z11 = false;
                        i16 = -482679837;
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
                        if ((i11 & 64) != 0) {
                            i12 &= -3670017;
                        }
                        a0Var3 = a0Var;
                        c0Var3 = c0VarR;
                        q3Var4 = q3Var2;
                        j15 = j12;
                        z11 = false;
                        i16 = -482679837;
                        v8VarB = v8Var;
                    }
                    c0Var3.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(i16, i12, -1, "androidx.compose.material.FloatingActionButton (FloatingActionButton.kt:90)");
                    }
                    if (jVar2 == null) {
                        c0Var3.E(36083320);
                        objI1 = c0Var3.i0();
                        if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI1 = androidx.compose.foundation.interaction.i.a();
                            c0Var3.Y(objI1);
                        }
                        jVar4 = (androidx.compose.foundation.interaction.j) objI1;
                        c0Var3.A();
                    } else {
                        c0Var3.E(1163327);
                        c0Var3.A();
                        jVar4 = jVar2;
                    }
                    objI0 = c0Var3.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = new Function1() { // from class: androidx.compose.material.x8
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return a9.g((androidx.compose.ui.semantics.e0) obj);
                            }
                        };
                        c0Var3.Y(objI0);
                    }
                    a0Var = a0Var3;
                    long j16 = jD;
                    ah.f(function1, androidx.compose.ui.semantics.t.f(a0Var3, z11, (Function1) objI0, 1, null), false, q3Var4, j15, j16, null, v8VarB.a(jVar4, c0Var3, (i12 >> 15) & com.planner5d.library.engine.input.f.b.B).getValue().O(), jVar4, androidx.compose.runtime.internal.w.e(-1823447062, true, new b(jD, function2), c0Var3, 54), c0Var3, (i12 & 14) | 805306368 | (i12 & 7168) | (57344 & i12) | (i12 & 458752), 68);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    v8Var2 = v8VarB;
                    c0Var2 = c0Var3;
                    jVar3 = jVar2;
                    q3Var3 = q3Var4;
                    j13 = j15;
                    j14 = j16;
                } else {
                    c0VarR.u();
                    c0Var2 = c0VarR;
                    jVar3 = jVar2;
                    q3Var3 = q3Var2;
                    j13 = j12;
                    j14 = jD;
                    v8Var2 = v8Var;
                }
                a0Var2 = a0Var;
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.y8
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return a9.h(function0, a0Var2, jVar3, q3Var3, j13, j14, v8Var2, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= androidx.media3.exoplayer.a5.S0;
            jVar2 = jVar;
            if ((i10 & 3072) == 0) {
                if ((i11 & 8) == 0) {
                    q3Var2 = q3Var;
                    if (c0VarR.D(q3Var2)) {
                    }
                    i12 |= i19;
                } else {
                    q3Var2 = q3Var;
                }
                i12 |= i19;
            } else {
                q3Var2 = q3Var;
            }
            if ((i10 & 24576) == 0) {
                if ((i11 & 16) == 0) {
                    j12 = j10;
                    if (c0VarR.L(j12)) {
                    }
                    i12 |= i20;
                } else {
                    j12 = j10;
                }
                i12 |= i20;
            } else {
                j12 = j10;
            }
            if ((196608 & i10) == 0) {
                if ((i11 & 32) == 0) {
                    jD = j11;
                    if (c0VarR.L(jD)) {
                    }
                    i12 |= i21;
                } else {
                    jD = j11;
                }
                i12 |= i21;
            } else {
                jD = j11;
            }
            if ((i10 & 1572864) != 0) {
                if ((i11 & 64) == 0) {
                    i17 = 524288;
                } else {
                    i17 = 524288;
                }
                i12 |= i17;
            }
            if ((i11 & 128) != 0) {
                i12 |= 12582912;
            } else if ((i10 & 12582912) == 0) {
                if (c0VarR.k0(function2)) {
                    i15 = 8388608;
                } else {
                    i15 = 4194304;
                }
                i12 |= i15;
            }
            if ((4793491 & i12) != 4793490) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var;
                    }
                    if (i13 != 0) {
                        jVar2 = null;
                    }
                    if ((i11 & 8) != 0) {
                        q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                        i12 &= -7169;
                    } else {
                        q3VarA = q3Var2;
                    }
                    if ((i11 & 16) != 0) {
                        jL = x9.f25488a.a(c0VarR, 6).l();
                        i12 &= -57345;
                    } else {
                        jL = j12;
                    }
                    if ((i11 & 32) != 0) {
                        jD = n4.d(jL, c0VarR, (i12 >> 12) & 14);
                        i12 &= -458753;
                    }
                    if ((i11 & 64) != 0) {
                        v8VarB = u8.f25154a.b(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                        c0Var3 = c0VarR;
                        i12 &= -3670017;
                    } else {
                        c0Var3 = c0VarR;
                        v8VarB = v8Var;
                    }
                    q3Var4 = q3VarA;
                    j15 = jL;
                    z11 = false;
                    i16 = -482679837;
                } else {
                    if (i18 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var;
                    }
                    if (i13 != 0) {
                        jVar2 = null;
                    }
                    if ((i11 & 8) != 0) {
                        q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                        i12 &= -7169;
                    } else {
                        q3VarA = q3Var2;
                    }
                    if ((i11 & 16) != 0) {
                        jL = x9.f25488a.a(c0VarR, 6).l();
                        i12 &= -57345;
                    } else {
                        jL = j12;
                    }
                    if ((i11 & 32) != 0) {
                        jD = n4.d(jL, c0VarR, (i12 >> 12) & 14);
                        i12 &= -458753;
                    }
                    if ((i11 & 64) != 0) {
                        v8VarB = u8.f25154a.b(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                        c0Var3 = c0VarR;
                        i12 &= -3670017;
                    } else {
                        c0Var3 = c0VarR;
                        v8VarB = v8Var;
                    }
                    q3Var4 = q3VarA;
                    j15 = jL;
                    z11 = false;
                    i16 = -482679837;
                }
                c0Var3.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(i16, i12, -1, "androidx.compose.material.FloatingActionButton (FloatingActionButton.kt:90)");
                }
                if (jVar2 == null) {
                    c0Var3.E(36083320);
                    objI1 = c0Var3.i0();
                    if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI1 = androidx.compose.foundation.interaction.i.a();
                        c0Var3.Y(objI1);
                    }
                    jVar4 = (androidx.compose.foundation.interaction.j) objI1;
                    c0Var3.A();
                } else {
                    c0Var3.E(1163327);
                    c0Var3.A();
                    jVar4 = jVar2;
                }
                objI0 = c0Var3.i0();
                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = new Function1() { // from class: androidx.compose.material.x8
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return a9.g((androidx.compose.ui.semantics.e0) obj);
                        }
                    };
                    c0Var3.Y(objI0);
                }
                a0Var = a0Var3;
                long j17 = jD;
                ah.f(function1, androidx.compose.ui.semantics.t.f(a0Var3, z11, (Function1) objI0, 1, null), false, q3Var4, j15, j17, null, v8VarB.a(jVar4, c0Var3, (i12 >> 15) & com.planner5d.library.engine.input.f.b.B).getValue().O(), jVar4, androidx.compose.runtime.internal.w.e(-1823447062, true, new b(jD, function2), c0Var3, 54), c0Var3, (i12 & 14) | 805306368 | (i12 & 7168) | (57344 & i12) | (i12 & 458752), 68);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                v8Var2 = v8VarB;
                c0Var2 = c0Var3;
                jVar3 = jVar2;
                q3Var3 = q3Var4;
                j13 = j15;
                j14 = j17;
            } else {
                c0VarR.u();
                c0Var2 = c0VarR;
                jVar3 = jVar2;
                q3Var3 = q3Var2;
                j13 = j12;
                j14 = jD;
                v8Var2 = v8Var;
            }
            a0Var2 = a0Var;
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material.y8
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return a9.h(function0, a0Var2, jVar3, q3Var3, j13, j14, v8Var2, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 48;
        i13 = i11 & 4;
        if (i13 != 0) {
            if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                jVar2 = jVar;
                if (c0VarR.D(jVar2)) {
                    i14 = 256;
                } else {
                    i14 = 128;
                }
                i12 |= i14;
            }
            if ((i10 & 3072) == 0) {
                if ((i11 & 8) == 0) {
                    q3Var2 = q3Var;
                    if (c0VarR.D(q3Var2)) {
                    }
                    i12 |= i19;
                } else {
                    q3Var2 = q3Var;
                }
                i12 |= i19;
            } else {
                q3Var2 = q3Var;
            }
            if ((i10 & 24576) == 0) {
                if ((i11 & 16) == 0) {
                    j12 = j10;
                    if (c0VarR.L(j12)) {
                    }
                    i12 |= i20;
                } else {
                    j12 = j10;
                }
                i12 |= i20;
            } else {
                j12 = j10;
            }
            if ((196608 & i10) == 0) {
                if ((i11 & 32) == 0) {
                    jD = j11;
                    if (c0VarR.L(jD)) {
                    }
                    i12 |= i21;
                } else {
                    jD = j11;
                }
                i12 |= i21;
            } else {
                jD = j11;
            }
            if ((i10 & 1572864) != 0) {
                if ((i11 & 64) == 0) {
                    i17 = 524288;
                } else {
                    i17 = 524288;
                }
                i12 |= i17;
            }
            if ((i11 & 128) != 0) {
                i12 |= 12582912;
            } else if ((i10 & 12582912) == 0) {
                if (c0VarR.k0(function2)) {
                    i15 = 8388608;
                } else {
                    i15 = 4194304;
                }
                i12 |= i15;
            }
            if ((4793491 & i12) != 4793490) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var;
                    }
                    if (i13 != 0) {
                        jVar2 = null;
                    }
                    if ((i11 & 8) != 0) {
                        q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                        i12 &= -7169;
                    } else {
                        q3VarA = q3Var2;
                    }
                    if ((i11 & 16) != 0) {
                        jL = x9.f25488a.a(c0VarR, 6).l();
                        i12 &= -57345;
                    } else {
                        jL = j12;
                    }
                    if ((i11 & 32) != 0) {
                        jD = n4.d(jL, c0VarR, (i12 >> 12) & 14);
                        i12 &= -458753;
                    }
                    if ((i11 & 64) != 0) {
                        v8VarB = u8.f25154a.b(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                        c0Var3 = c0VarR;
                        i12 &= -3670017;
                    } else {
                        c0Var3 = c0VarR;
                        v8VarB = v8Var;
                    }
                    q3Var4 = q3VarA;
                    j15 = jL;
                    z11 = false;
                    i16 = -482679837;
                } else {
                    if (i18 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var;
                    }
                    if (i13 != 0) {
                        jVar2 = null;
                    }
                    if ((i11 & 8) != 0) {
                        q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                        i12 &= -7169;
                    } else {
                        q3VarA = q3Var2;
                    }
                    if ((i11 & 16) != 0) {
                        jL = x9.f25488a.a(c0VarR, 6).l();
                        i12 &= -57345;
                    } else {
                        jL = j12;
                    }
                    if ((i11 & 32) != 0) {
                        jD = n4.d(jL, c0VarR, (i12 >> 12) & 14);
                        i12 &= -458753;
                    }
                    if ((i11 & 64) != 0) {
                        v8VarB = u8.f25154a.b(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                        c0Var3 = c0VarR;
                        i12 &= -3670017;
                    } else {
                        c0Var3 = c0VarR;
                        v8VarB = v8Var;
                    }
                    q3Var4 = q3VarA;
                    j15 = jL;
                    z11 = false;
                    i16 = -482679837;
                }
                c0Var3.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(i16, i12, -1, "androidx.compose.material.FloatingActionButton (FloatingActionButton.kt:90)");
                }
                if (jVar2 == null) {
                    c0Var3.E(36083320);
                    objI1 = c0Var3.i0();
                    if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI1 = androidx.compose.foundation.interaction.i.a();
                        c0Var3.Y(objI1);
                    }
                    jVar4 = (androidx.compose.foundation.interaction.j) objI1;
                    c0Var3.A();
                } else {
                    c0Var3.E(1163327);
                    c0Var3.A();
                    jVar4 = jVar2;
                }
                objI0 = c0Var3.i0();
                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = new Function1() { // from class: androidx.compose.material.x8
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return a9.g((androidx.compose.ui.semantics.e0) obj);
                        }
                    };
                    c0Var3.Y(objI0);
                }
                a0Var = a0Var3;
                long j18 = jD;
                ah.f(function1, androidx.compose.ui.semantics.t.f(a0Var3, z11, (Function1) objI0, 1, null), false, q3Var4, j15, j18, null, v8VarB.a(jVar4, c0Var3, (i12 >> 15) & com.planner5d.library.engine.input.f.b.B).getValue().O(), jVar4, androidx.compose.runtime.internal.w.e(-1823447062, true, new b(jD, function2), c0Var3, 54), c0Var3, (i12 & 14) | 805306368 | (i12 & 7168) | (57344 & i12) | (i12 & 458752), 68);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                v8Var2 = v8VarB;
                c0Var2 = c0Var3;
                jVar3 = jVar2;
                q3Var3 = q3Var4;
                j13 = j15;
                j14 = j18;
            } else {
                c0VarR.u();
                c0Var2 = c0VarR;
                jVar3 = jVar2;
                q3Var3 = q3Var2;
                j13 = j12;
                j14 = jD;
                v8Var2 = v8Var;
            }
            a0Var2 = a0Var;
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material.y8
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return a9.h(function0, a0Var2, jVar3, q3Var3, j13, j14, v8Var2, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= androidx.media3.exoplayer.a5.S0;
        jVar2 = jVar;
        if ((i10 & 3072) == 0) {
            if ((i11 & 8) == 0) {
                q3Var2 = q3Var;
                if (c0VarR.D(q3Var2)) {
                }
                i12 |= i19;
            } else {
                q3Var2 = q3Var;
            }
            i12 |= i19;
        } else {
            q3Var2 = q3Var;
        }
        if ((i10 & 24576) == 0) {
            if ((i11 & 16) == 0) {
                j12 = j10;
                if (c0VarR.L(j12)) {
                }
                i12 |= i20;
            } else {
                j12 = j10;
            }
            i12 |= i20;
        } else {
            j12 = j10;
        }
        if ((196608 & i10) == 0) {
            if ((i11 & 32) == 0) {
                jD = j11;
                if (c0VarR.L(jD)) {
                }
                i12 |= i21;
            } else {
                jD = j11;
            }
            i12 |= i21;
        } else {
            jD = j11;
        }
        if ((i10 & 1572864) != 0) {
            if ((i11 & 64) == 0) {
                i17 = 524288;
            } else {
                i17 = 524288;
            }
            i12 |= i17;
        }
        if ((i11 & 128) != 0) {
            i12 |= 12582912;
        } else if ((i10 & 12582912) == 0) {
            if (c0VarR.k0(function2)) {
                i15 = 8388608;
            } else {
                i15 = 4194304;
            }
            i12 |= i15;
        }
        if ((4793491 & i12) != 4793490) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c0VarR.h(z10, i12 & 1)) {
            c0VarR.l0();
            if ((i10 & 1) != 0) {
                if (i18 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var;
                }
                if (i13 != 0) {
                    jVar2 = null;
                }
                if ((i11 & 8) != 0) {
                    q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                    i12 &= -7169;
                } else {
                    q3VarA = q3Var2;
                }
                if ((i11 & 16) != 0) {
                    jL = x9.f25488a.a(c0VarR, 6).l();
                    i12 &= -57345;
                } else {
                    jL = j12;
                }
                if ((i11 & 32) != 0) {
                    jD = n4.d(jL, c0VarR, (i12 >> 12) & 14);
                    i12 &= -458753;
                }
                if ((i11 & 64) != 0) {
                    v8VarB = u8.f25154a.b(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                    c0Var3 = c0VarR;
                    i12 &= -3670017;
                } else {
                    c0Var3 = c0VarR;
                    v8VarB = v8Var;
                }
                q3Var4 = q3VarA;
                j15 = jL;
                z11 = false;
                i16 = -482679837;
            } else {
                if (i18 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var;
                }
                if (i13 != 0) {
                    jVar2 = null;
                }
                if ((i11 & 8) != 0) {
                    q3VarA = x9.f25488a.b(c0VarR, 6).e().a(androidx.compose.foundation.shape.g.b(50));
                    i12 &= -7169;
                } else {
                    q3VarA = q3Var2;
                }
                if ((i11 & 16) != 0) {
                    jL = x9.f25488a.a(c0VarR, 6).l();
                    i12 &= -57345;
                } else {
                    jL = j12;
                }
                if ((i11 & 32) != 0) {
                    jD = n4.d(jL, c0VarR, (i12 >> 12) & 14);
                    i12 &= -458753;
                }
                if ((i11 & 64) != 0) {
                    v8VarB = u8.f25154a.b(0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 24576, 15);
                    c0Var3 = c0VarR;
                    i12 &= -3670017;
                } else {
                    c0Var3 = c0VarR;
                    v8VarB = v8Var;
                }
                q3Var4 = q3VarA;
                j15 = jL;
                z11 = false;
                i16 = -482679837;
            }
            c0Var3.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(i16, i12, -1, "androidx.compose.material.FloatingActionButton (FloatingActionButton.kt:90)");
            }
            if (jVar2 == null) {
                c0Var3.E(36083320);
                objI1 = c0Var3.i0();
                if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI1 = androidx.compose.foundation.interaction.i.a();
                    c0Var3.Y(objI1);
                }
                jVar4 = (androidx.compose.foundation.interaction.j) objI1;
                c0Var3.A();
            } else {
                c0Var3.E(1163327);
                c0Var3.A();
                jVar4 = jVar2;
            }
            objI0 = c0Var3.i0();
            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new Function1() { // from class: androidx.compose.material.x8
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return a9.g((androidx.compose.ui.semantics.e0) obj);
                    }
                };
                c0Var3.Y(objI0);
            }
            a0Var = a0Var3;
            long j19 = jD;
            ah.f(function1, androidx.compose.ui.semantics.t.f(a0Var3, z11, (Function1) objI0, 1, null), false, q3Var4, j15, j19, null, v8VarB.a(jVar4, c0Var3, (i12 >> 15) & com.planner5d.library.engine.input.f.b.B).getValue().O(), jVar4, androidx.compose.runtime.internal.w.e(-1823447062, true, new b(jD, function2), c0Var3, 54), c0Var3, (i12 & 14) | 805306368 | (i12 & 7168) | (57344 & i12) | (i12 & 458752), 68);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            v8Var2 = v8VarB;
            c0Var2 = c0Var3;
            jVar3 = jVar2;
            q3Var3 = q3Var4;
            j13 = j15;
            j14 = j19;
        } else {
            c0VarR.u();
            c0Var2 = c0VarR;
            jVar3 = jVar2;
            q3Var3 = q3Var2;
            j13 = j12;
            j14 = jD;
            v8Var2 = v8Var;
        }
        a0Var2 = a0Var;
        s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material.y8
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return a9.h(function0, a0Var2, jVar3, q3Var3, j13, j14, v8Var2, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(androidx.compose.ui.semantics.e0 e0Var) {
        androidx.compose.ui.semantics.b0.K1(e0Var, androidx.compose.ui.semantics.j.f41124b.a());
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(Function0 function0, androidx.compose.ui.a0 a0Var, androidx.compose.foundation.interaction.j jVar, androidx.compose.ui.graphics.q3 q3Var, long j10, long j11, v8 v8Var, Function2 function2, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        f(function0, a0Var, jVar, q3Var, j10, j11, v8Var, function2, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }
}

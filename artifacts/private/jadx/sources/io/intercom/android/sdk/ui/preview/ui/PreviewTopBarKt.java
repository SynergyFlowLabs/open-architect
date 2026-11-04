package io.intercom.android.sdk.ui.preview.ui;

import androidx.compose.foundation.layout.i6;
import androidx.compose.foundation.layout.u5;
import androidx.compose.foundation.layout.y5;
import androidx.compose.material3.ei;
import androidx.compose.runtime.b1;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.y7;
import androidx.compose.ui.graphics.q0;
import androidx.compose.ui.layout.a1;
import androidx.media3.exoplayer.a5;
import io.intercom.android.sdk.ui.IntercomPreviews;
import io.intercom.android.sdk.ui.theme.IntercomThemeKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nPreviewTopBar.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PreviewTopBar.kt\nio/intercom/android/sdk/ui/preview/ui/PreviewTopBarKt\n+ 2 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,108:1\n99#2,6:109\n99#2:142\n95#2,10:143\n106#2:183\n106#2:187\n80#3,6:115\n87#3,3:130\n90#3,2:139\n80#3,6:153\n87#3,3:168\n90#3,2:177\n94#3:182\n94#3:186\n391#4,9:121\n400#4:141\n391#4,9:159\n400#4,3:179\n401#4,2:184\n4360#5,6:133\n4360#5,6:171\n*S KotlinDebug\n*F\n+ 1 PreviewTopBar.kt\nio/intercom/android/sdk/ui/preview/ui/PreviewTopBarKt\n*L\n33#1:109,6\n51#1:142\n51#1:143,10\n51#1:183\n33#1:187\n33#1:115,6\n33#1:130,3\n33#1:139,2\n51#1:153,6\n51#1:168,3\n51#1:177,2\n51#1:182\n33#1:186\n33#1:121,9\n33#1:141\n51#1:159,9\n51#1:179,3\n33#1:184,2\n33#1:133,6\n51#1:171,6\n*E\n"})
public final class PreviewTopBarKt {
    /* JADX WARN: Code duplicated, block: B:101:0x0134  */
    /* JADX WARN: Code duplicated, block: B:102:0x0137  */
    /* JADX WARN: Code duplicated, block: B:104:0x013b  */
    /* JADX WARN: Code duplicated, block: B:106:0x0143  */
    /* JADX WARN: Code duplicated, block: B:107:0x014b  */
    /* JADX WARN: Code duplicated, block: B:110:0x01a7  */
    /* JADX WARN: Code duplicated, block: B:113:0x01b3  */
    /* JADX WARN: Code duplicated, block: B:114:0x01b7  */
    /* JADX WARN: Code duplicated, block: B:117:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:119:0x01e4  */
    /* JADX WARN: Code duplicated, block: B:122:0x0245  */
    /* JADX WARN: Code duplicated, block: B:125:0x0251  */
    /* JADX WARN: Code duplicated, block: B:126:0x0255  */
    /* JADX WARN: Code duplicated, block: B:129:0x0274  */
    /* JADX WARN: Code duplicated, block: B:131:0x0282  */
    /* JADX WARN: Code duplicated, block: B:134:0x029f  */
    /* JADX WARN: Code duplicated, block: B:137:0x02c2  */
    /* JADX WARN: Code duplicated, block: B:140:0x02e8  */
    /* JADX WARN: Code duplicated, block: B:141:0x0305  */
    /* JADX WARN: Code duplicated, block: B:145:0x0323  */
    /* JADX WARN: Code duplicated, block: B:147:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0077  */
    /* JADX WARN: Code duplicated, block: B:38:0x007c  */
    /* JADX WARN: Code duplicated, block: B:40:0x0080  */
    /* JADX WARN: Code duplicated, block: B:42:0x008a  */
    /* JADX WARN: Code duplicated, block: B:43:0x008d  */
    /* JADX WARN: Code duplicated, block: B:47:0x0094  */
    /* JADX WARN: Code duplicated, block: B:48:0x0097  */
    /* JADX WARN: Code duplicated, block: B:50:0x009d  */
    /* JADX WARN: Code duplicated, block: B:52:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:53:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:57:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:59:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:63:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:64:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:69:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:71:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:73:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:74:0x00df  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:80:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:82:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:84:0x0101  */
    /* JADX WARN: Code duplicated, block: B:85:0x0104  */
    /* JADX WARN: Code duplicated, block: B:89:0x0113  */
    /* JADX WARN: Code duplicated, block: B:93:0x0124 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:94:0x0126  */
    /* JADX WARN: Code duplicated, block: B:95:0x0129  */
    /* JADX WARN: Code duplicated, block: B:98:0x012d  */
    /* JADX WARN: Code duplicated, block: B:99:0x0130  */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void PreviewTopBar(@Nullable androidx.compose.ui.a0 a0Var, final boolean z10, boolean z11, boolean z12, @NotNull final Function0<Unit> onBackCLick, @NotNull final Function0<Unit> onDeleteClick, @Nullable Function0<Unit> function0, @Nullable Function0<Unit> function1, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        androidx.compose.ui.a0 a0Var2;
        int i12;
        boolean z13;
        int i13;
        boolean z14;
        int i14;
        int i15;
        int i16;
        int i17;
        Function0<Unit> function2;
        int i18;
        int i19;
        int i20;
        int i21;
        androidx.compose.ui.a0 a0Var3;
        boolean z15;
        boolean z16;
        Function0<Unit> function3;
        int iHashCode;
        Function0<androidx.compose.ui.node.g> function0A;
        androidx.compose.runtime.c0 c0VarD;
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B;
        ComposableSingletons$PreviewTopBarKt composableSingletons$PreviewTopBarKt;
        int iHashCode2;
        Function0<androidx.compose.ui.node.g> function0A2;
        androidx.compose.runtime.c0 c0VarD2;
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B2;
        Function0<Unit> function4;
        final Function0<Unit> function5;
        final Function0<Unit> function6;
        final boolean z17;
        s5 s5VarT;
        Intrinsics.checkNotNullParameter(onBackCLick, "onBackCLick");
        Intrinsics.checkNotNullParameter(onDeleteClick, "onDeleteClick");
        androidx.compose.runtime.c0 c0VarR = c0Var.R(312640005);
        int i22 = i11 & 1;
        if (i22 != 0) {
            i12 = i10 | 6;
            a0Var2 = a0Var;
        } else if ((i10 & 14) == 0) {
            a0Var2 = a0Var;
            i12 = (c0VarR.D(a0Var2) ? 4 : 2) | i10;
        } else {
            a0Var2 = a0Var;
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & com.planner5d.library.engine.input.f.b.B) == 0) {
            i12 |= c0VarR.G(z10) ? 32 : 16;
        }
        int i23 = i11 & 4;
        if (i23 == 0) {
            if ((i10 & 896) == 0) {
                z13 = z11;
                i12 |= c0VarR.G(z13) ? 256 : 128;
            }
            i13 = i11 & 8;
            if (i13 != 0) {
                if ((i10 & 7168) == 0) {
                    z14 = z12;
                    if (c0VarR.G(z14)) {
                        i14 = 2048;
                    } else {
                        i14 = 1024;
                    }
                    i12 |= i14;
                }
                if ((i11 & 16) != 0) {
                    i12 |= 24576;
                } else if ((57344 & i10) == 0) {
                    if (c0VarR.k0(onBackCLick)) {
                        i15 = 16384;
                    } else {
                        i15 = 8192;
                    }
                    i12 |= i15;
                }
                if ((i11 & 32) != 0) {
                    if ((458752 & i10) == 0) {
                        if (c0VarR.k0(onDeleteClick)) {
                            i16 = 131072;
                        } else {
                            i16 = 65536;
                        }
                    }
                    i17 = i11 & 64;
                    if (i17 != 0) {
                        if ((3670016 & i10) == 0) {
                            function2 = function0;
                            if (c0VarR.k0(function2)) {
                                i18 = 1048576;
                            } else {
                                i18 = 524288;
                            }
                            i12 |= i18;
                        }
                        i19 = i11 & 128;
                        if (i19 != 0) {
                            i12 |= 12582912;
                        } else if ((i10 & 29360128) == 0) {
                            if (c0VarR.k0(function1)) {
                                i20 = 8388608;
                            } else {
                                i20 = 4194304;
                            }
                            i12 |= i20;
                        }
                        i21 = i12;
                        if ((i21 & 23967451) == 4793490 || !c0VarR.d()) {
                            if (i22 != 0) {
                                a0Var3 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var3 = a0Var2;
                            }
                            if (i23 != 0) {
                                z15 = false;
                            } else {
                                z15 = z13;
                            }
                            if (i13 != 0) {
                                z16 = false;
                            } else {
                                z16 = z14;
                            }
                            if (i17 != 0) {
                                function2 = new Function0() { // from class: io.intercom.android.sdk.ui.preview.ui.x
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Unit.f312394a;
                                    }
                                };
                            }
                            if (i19 != 0) {
                                function3 = new Function0() { // from class: io.intercom.android.sdk.ui.preview.ui.y
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return Unit.f312394a;
                                    }
                                };
                            } else {
                                function3 = function1;
                            }
                            androidx.compose.ui.a0 a0VarD = androidx.compose.foundation.v.d(i6.F(i6.h(a0Var3, 0.0f, 1, null), null, false, 3, null), q0.w(q0.f38131b.a(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
                            androidx.compose.ui.e.a aVar = androidx.compose.ui.e.f37317a;
                            androidx.compose.ui.e.c cVarQ = aVar.q();
                            androidx.compose.foundation.layout.q qVar = androidx.compose.foundation.layout.q.f16330a;
                            a1 a1VarE = u5.e(qVar.s(), cVarQ, c0VarR, 54);
                            iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                            b1 b1VarK = c0VarR.k();
                            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0VarD);
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
                            c0VarD = y7.d(c0VarR);
                            y7.n(c0VarD, a1VarE, aVar2.e());
                            y7.n(c0VarD, b1VarK, aVar2.g());
                            function2B = aVar2.b();
                            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                                c0VarD.Y(Integer.valueOf(iHashCode));
                                c0VarD.f(Integer.valueOf(iHashCode), function2B);
                            }
                            y7.n(c0VarD, a0VarN, aVar2.f());
                            y5 y5Var = y5.f16577a;
                            composableSingletons$PreviewTopBarKt = ComposableSingletons$PreviewTopBarKt.INSTANCE;
                            androidx.compose.ui.a0 a0Var4 = a0Var3;
                            ei.D(onBackCLick, null, false, null, null, null, composableSingletons$PreviewTopBarKt.m613getLambda1$intercom_sdk_ui_release(), c0VarR, ((i21 >> 12) & 14) | 1572864, 62);
                            androidx.compose.ui.e.c cVarQ2 = aVar.q();
                            androidx.compose.ui.a0.a aVar3 = androidx.compose.ui.a0.E;
                            a1 a1VarE2 = u5.e(qVar.w(), cVarQ2, c0VarR, 48);
                            iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                            b1 b1VarK2 = c0VarR.k();
                            androidx.compose.ui.a0 a0VarN2 = androidx.compose.ui.m.n(c0VarR, aVar3);
                            function0A2 = aVar2.a();
                            if (c0VarR.S() == null) {
                                androidx.compose.runtime.v.r();
                            }
                            c0VarR.q();
                            if (c0VarR.P()) {
                                c0VarR.q0(function0A2);
                            } else {
                                c0VarR.l();
                            }
                            c0VarD2 = y7.d(c0VarR);
                            y7.n(c0VarD2, a1VarE2, aVar2.e());
                            y7.n(c0VarD2, b1VarK2, aVar2.g());
                            function2B2 = aVar2.b();
                            if (c0VarD2.P() || !Intrinsics.areEqual(c0VarD2.i0(), Integer.valueOf(iHashCode2))) {
                                c0VarD2.Y(Integer.valueOf(iHashCode2));
                                c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                            }
                            y7.n(c0VarD2, a0VarN2, aVar2.f());
                            c0VarR.E(881566524);
                            if (z10) {
                                ei.D(onDeleteClick, null, false, null, null, null, composableSingletons$PreviewTopBarKt.m614getLambda2$intercom_sdk_ui_release(), c0VarR, ((i21 >> 15) & 14) | 1572864, 62);
                            }
                            c0VarR.A();
                            c0VarR.E(881579446);
                            if (z15) {
                                ei.D(function2, null, false, null, null, null, composableSingletons$PreviewTopBarKt.m615getLambda3$intercom_sdk_ui_release(), c0VarR, ((i21 >> 18) & 14) | 1572864, 62);
                            }
                            Function0<Unit> function7 = function2;
                            c0VarR.A();
                            c0VarR.E(881592201);
                            if (z16) {
                                function4 = function3;
                                ei.D(function4, null, false, null, null, null, composableSingletons$PreviewTopBarKt.m616getLambda4$intercom_sdk_ui_release(), c0VarR, ((i21 >> 21) & 14) | 1572864, 62);
                            } else {
                                function4 = function3;
                            }
                            c0VarR.A();
                            c0VarR.o();
                            c0VarR.o();
                            function5 = function7;
                            function6 = function4;
                            z17 = z15;
                            z14 = z16;
                            a0Var2 = a0Var4;
                        } else {
                            c0VarR.u();
                            z17 = z13;
                            function5 = function2;
                            function6 = function1;
                        }
                        s5VarT = c0VarR.T();
                        if (s5VarT != null) {
                            final androidx.compose.ui.a0 a0Var5 = a0Var2;
                            final boolean z18 = z14;
                            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.ui.preview.ui.z
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return PreviewTopBarKt.PreviewTopBar$lambda$4(a0Var5, z10, z17, z18, onBackCLick, onDeleteClick, function5, function6, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i12 |= 1572864;
                    function2 = function0;
                    i19 = i11 & 128;
                    if (i19 != 0) {
                        i12 |= 12582912;
                    } else if ((i10 & 29360128) == 0) {
                        if (c0VarR.k0(function1)) {
                            i20 = 8388608;
                        } else {
                            i20 = 4194304;
                        }
                        i12 |= i20;
                    }
                    i21 = i12;
                    if ((i21 & 23967451) == 4793490) {
                        if (i22 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var2;
                        }
                        if (i23 != 0) {
                            z15 = false;
                        } else {
                            z15 = z13;
                        }
                        if (i13 != 0) {
                            z16 = false;
                        } else {
                            z16 = z14;
                        }
                        if (i17 != 0) {
                            function2 = new Function0() { // from class: io.intercom.android.sdk.ui.preview.ui.x
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.f312394a;
                                }
                            };
                        }
                        if (i19 != 0) {
                            function3 = new Function0() { // from class: io.intercom.android.sdk.ui.preview.ui.y
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.f312394a;
                                }
                            };
                        } else {
                            function3 = function1;
                        }
                        androidx.compose.ui.a0 a0VarD2 = androidx.compose.foundation.v.d(i6.F(i6.h(a0Var3, 0.0f, 1, null), null, false, 3, null), q0.w(q0.f38131b.a(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
                        androidx.compose.ui.e.a aVar4 = androidx.compose.ui.e.f37317a;
                        androidx.compose.ui.e.c cVarQ3 = aVar4.q();
                        androidx.compose.foundation.layout.q qVar2 = androidx.compose.foundation.layout.q.f16330a;
                        a1 a1VarE3 = u5.e(qVar2.s(), cVarQ3, c0VarR, 54);
                        iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        b1 b1VarK3 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN3 = androidx.compose.ui.m.n(c0VarR, a0VarD2);
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
                        c0VarD = y7.d(c0VarR);
                        y7.n(c0VarD, a1VarE3, aVar5.e());
                        y7.n(c0VarD, b1VarK3, aVar5.g());
                        function2B = aVar5.b();
                        if (c0VarD.P()) {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        } else {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        }
                        y7.n(c0VarD, a0VarN3, aVar5.f());
                        y5 y5Var2 = y5.f16577a;
                        composableSingletons$PreviewTopBarKt = ComposableSingletons$PreviewTopBarKt.INSTANCE;
                        androidx.compose.ui.a0 a0Var6 = a0Var3;
                        ei.D(onBackCLick, null, false, null, null, null, composableSingletons$PreviewTopBarKt.m613getLambda1$intercom_sdk_ui_release(), c0VarR, ((i21 >> 12) & 14) | 1572864, 62);
                        androidx.compose.ui.e.c cVarQ4 = aVar4.q();
                        androidx.compose.ui.a0.a aVar6 = androidx.compose.ui.a0.E;
                        a1 a1VarE4 = u5.e(qVar2.w(), cVarQ4, c0VarR, 48);
                        iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        b1 b1VarK4 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN4 = androidx.compose.ui.m.n(c0VarR, aVar6);
                        function0A2 = aVar5.a();
                        if (c0VarR.S() == null) {
                            androidx.compose.runtime.v.r();
                        }
                        c0VarR.q();
                        if (c0VarR.P()) {
                            c0VarR.q0(function0A2);
                        } else {
                            c0VarR.l();
                        }
                        c0VarD2 = y7.d(c0VarR);
                        y7.n(c0VarD2, a1VarE4, aVar5.e());
                        y7.n(c0VarD2, b1VarK4, aVar5.g());
                        function2B2 = aVar5.b();
                        if (c0VarD2.P()) {
                            c0VarD2.Y(Integer.valueOf(iHashCode2));
                            c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                        } else {
                            c0VarD2.Y(Integer.valueOf(iHashCode2));
                            c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                        }
                        y7.n(c0VarD2, a0VarN4, aVar5.f());
                        c0VarR.E(881566524);
                        if (z10) {
                            ei.D(onDeleteClick, null, false, null, null, null, composableSingletons$PreviewTopBarKt.m614getLambda2$intercom_sdk_ui_release(), c0VarR, ((i21 >> 15) & 14) | 1572864, 62);
                        }
                        c0VarR.A();
                        c0VarR.E(881579446);
                        if (z15) {
                            ei.D(function2, null, false, null, null, null, composableSingletons$PreviewTopBarKt.m615getLambda3$intercom_sdk_ui_release(), c0VarR, ((i21 >> 18) & 14) | 1572864, 62);
                        }
                        Function0<Unit> function8 = function2;
                        c0VarR.A();
                        c0VarR.E(881592201);
                        if (z16) {
                            function4 = function3;
                            ei.D(function4, null, false, null, null, null, composableSingletons$PreviewTopBarKt.m616getLambda4$intercom_sdk_ui_release(), c0VarR, ((i21 >> 21) & 14) | 1572864, 62);
                        } else {
                            function4 = function3;
                        }
                        c0VarR.A();
                        c0VarR.o();
                        c0VarR.o();
                        function5 = function8;
                        function6 = function4;
                        z17 = z15;
                        z14 = z16;
                        a0Var2 = a0Var6;
                    } else {
                        if (i22 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var2;
                        }
                        if (i23 != 0) {
                            z15 = false;
                        } else {
                            z15 = z13;
                        }
                        if (i13 != 0) {
                            z16 = false;
                        } else {
                            z16 = z14;
                        }
                        if (i17 != 0) {
                            function2 = new Function0() { // from class: io.intercom.android.sdk.ui.preview.ui.x
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.f312394a;
                                }
                            };
                        }
                        if (i19 != 0) {
                            function3 = new Function0() { // from class: io.intercom.android.sdk.ui.preview.ui.y
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.f312394a;
                                }
                            };
                        } else {
                            function3 = function1;
                        }
                        androidx.compose.ui.a0 a0VarD3 = androidx.compose.foundation.v.d(i6.F(i6.h(a0Var3, 0.0f, 1, null), null, false, 3, null), q0.w(q0.f38131b.a(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
                        androidx.compose.ui.e.a aVar7 = androidx.compose.ui.e.f37317a;
                        androidx.compose.ui.e.c cVarQ5 = aVar7.q();
                        androidx.compose.foundation.layout.q qVar3 = androidx.compose.foundation.layout.q.f16330a;
                        a1 a1VarE5 = u5.e(qVar3.s(), cVarQ5, c0VarR, 54);
                        iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        b1 b1VarK5 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN5 = androidx.compose.ui.m.n(c0VarR, a0VarD3);
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
                        c0VarD = y7.d(c0VarR);
                        y7.n(c0VarD, a1VarE5, aVar8.e());
                        y7.n(c0VarD, b1VarK5, aVar8.g());
                        function2B = aVar8.b();
                        if (c0VarD.P()) {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        } else {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        }
                        y7.n(c0VarD, a0VarN5, aVar8.f());
                        y5 y5Var3 = y5.f16577a;
                        composableSingletons$PreviewTopBarKt = ComposableSingletons$PreviewTopBarKt.INSTANCE;
                        androidx.compose.ui.a0 a0Var7 = a0Var3;
                        ei.D(onBackCLick, null, false, null, null, null, composableSingletons$PreviewTopBarKt.m613getLambda1$intercom_sdk_ui_release(), c0VarR, ((i21 >> 12) & 14) | 1572864, 62);
                        androidx.compose.ui.e.c cVarQ6 = aVar7.q();
                        androidx.compose.ui.a0.a aVar9 = androidx.compose.ui.a0.E;
                        a1 a1VarE6 = u5.e(qVar3.w(), cVarQ6, c0VarR, 48);
                        iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        b1 b1VarK6 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN6 = androidx.compose.ui.m.n(c0VarR, aVar9);
                        function0A2 = aVar8.a();
                        if (c0VarR.S() == null) {
                            androidx.compose.runtime.v.r();
                        }
                        c0VarR.q();
                        if (c0VarR.P()) {
                            c0VarR.q0(function0A2);
                        } else {
                            c0VarR.l();
                        }
                        c0VarD2 = y7.d(c0VarR);
                        y7.n(c0VarD2, a1VarE6, aVar8.e());
                        y7.n(c0VarD2, b1VarK6, aVar8.g());
                        function2B2 = aVar8.b();
                        if (c0VarD2.P()) {
                            c0VarD2.Y(Integer.valueOf(iHashCode2));
                            c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                        } else {
                            c0VarD2.Y(Integer.valueOf(iHashCode2));
                            c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                        }
                        y7.n(c0VarD2, a0VarN6, aVar8.f());
                        c0VarR.E(881566524);
                        if (z10) {
                            ei.D(onDeleteClick, null, false, null, null, null, composableSingletons$PreviewTopBarKt.m614getLambda2$intercom_sdk_ui_release(), c0VarR, ((i21 >> 15) & 14) | 1572864, 62);
                        }
                        c0VarR.A();
                        c0VarR.E(881579446);
                        if (z15) {
                            ei.D(function2, null, false, null, null, null, composableSingletons$PreviewTopBarKt.m615getLambda3$intercom_sdk_ui_release(), c0VarR, ((i21 >> 18) & 14) | 1572864, 62);
                        }
                        Function0<Unit> function9 = function2;
                        c0VarR.A();
                        c0VarR.E(881592201);
                        if (z16) {
                            function4 = function3;
                            ei.D(function4, null, false, null, null, null, composableSingletons$PreviewTopBarKt.m616getLambda4$intercom_sdk_ui_release(), c0VarR, ((i21 >> 21) & 14) | 1572864, 62);
                        } else {
                            function4 = function3;
                        }
                        c0VarR.A();
                        c0VarR.o();
                        c0VarR.o();
                        function5 = function9;
                        function6 = function4;
                        z17 = z15;
                        z14 = z16;
                        a0Var2 = a0Var7;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        final androidx.compose.ui.a0 a0Var8 = a0Var2;
                        final boolean z19 = z14;
                        s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.ui.preview.ui.z
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return PreviewTopBarKt.PreviewTopBar$lambda$4(a0Var8, z10, z17, z19, onBackCLick, onDeleteClick, function5, function6, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i16 = androidx.profileinstaller.n.c.f73814m;
                i12 |= i16;
                i17 = i11 & 64;
                if (i17 != 0) {
                    if ((3670016 & i10) == 0) {
                        function2 = function0;
                        if (c0VarR.k0(function2)) {
                            i18 = 1048576;
                        } else {
                            i18 = 524288;
                        }
                        i12 |= i18;
                    }
                    i19 = i11 & 128;
                    if (i19 != 0) {
                        i12 |= 12582912;
                    } else if ((i10 & 29360128) == 0) {
                        if (c0VarR.k0(function1)) {
                            i20 = 8388608;
                        } else {
                            i20 = 4194304;
                        }
                        i12 |= i20;
                    }
                    i21 = i12;
                    if ((i21 & 23967451) == 4793490) {
                        if (i22 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var2;
                        }
                        if (i23 != 0) {
                            z15 = false;
                        } else {
                            z15 = z13;
                        }
                        if (i13 != 0) {
                            z16 = false;
                        } else {
                            z16 = z14;
                        }
                        if (i17 != 0) {
                            function2 = new Function0() { // from class: io.intercom.android.sdk.ui.preview.ui.x
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.f312394a;
                                }
                            };
                        }
                        if (i19 != 0) {
                            function3 = new Function0() { // from class: io.intercom.android.sdk.ui.preview.ui.y
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.f312394a;
                                }
                            };
                        } else {
                            function3 = function1;
                        }
                        androidx.compose.ui.a0 a0VarD4 = androidx.compose.foundation.v.d(i6.F(i6.h(a0Var3, 0.0f, 1, null), null, false, 3, null), q0.w(q0.f38131b.a(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
                        androidx.compose.ui.e.a aVar10 = androidx.compose.ui.e.f37317a;
                        androidx.compose.ui.e.c cVarQ7 = aVar10.q();
                        androidx.compose.foundation.layout.q qVar4 = androidx.compose.foundation.layout.q.f16330a;
                        a1 a1VarE7 = u5.e(qVar4.s(), cVarQ7, c0VarR, 54);
                        iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        b1 b1VarK7 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN7 = androidx.compose.ui.m.n(c0VarR, a0VarD4);
                        androidx.compose.ui.node.g.a aVar11 = androidx.compose.ui.node.g.I;
                        function0A = aVar11.a();
                        if (c0VarR.S() == null) {
                            androidx.compose.runtime.v.r();
                        }
                        c0VarR.q();
                        if (c0VarR.P()) {
                            c0VarR.q0(function0A);
                        } else {
                            c0VarR.l();
                        }
                        c0VarD = y7.d(c0VarR);
                        y7.n(c0VarD, a1VarE7, aVar11.e());
                        y7.n(c0VarD, b1VarK7, aVar11.g());
                        function2B = aVar11.b();
                        if (c0VarD.P()) {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        } else {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        }
                        y7.n(c0VarD, a0VarN7, aVar11.f());
                        y5 y5Var4 = y5.f16577a;
                        composableSingletons$PreviewTopBarKt = ComposableSingletons$PreviewTopBarKt.INSTANCE;
                        androidx.compose.ui.a0 a0Var9 = a0Var3;
                        ei.D(onBackCLick, null, false, null, null, null, composableSingletons$PreviewTopBarKt.m613getLambda1$intercom_sdk_ui_release(), c0VarR, ((i21 >> 12) & 14) | 1572864, 62);
                        androidx.compose.ui.e.c cVarQ8 = aVar10.q();
                        androidx.compose.ui.a0.a aVar12 = androidx.compose.ui.a0.E;
                        a1 a1VarE8 = u5.e(qVar4.w(), cVarQ8, c0VarR, 48);
                        iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        b1 b1VarK8 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN8 = androidx.compose.ui.m.n(c0VarR, aVar12);
                        function0A2 = aVar11.a();
                        if (c0VarR.S() == null) {
                            androidx.compose.runtime.v.r();
                        }
                        c0VarR.q();
                        if (c0VarR.P()) {
                            c0VarR.q0(function0A2);
                        } else {
                            c0VarR.l();
                        }
                        c0VarD2 = y7.d(c0VarR);
                        y7.n(c0VarD2, a1VarE8, aVar11.e());
                        y7.n(c0VarD2, b1VarK8, aVar11.g());
                        function2B2 = aVar11.b();
                        if (c0VarD2.P()) {
                            c0VarD2.Y(Integer.valueOf(iHashCode2));
                            c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                        } else {
                            c0VarD2.Y(Integer.valueOf(iHashCode2));
                            c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                        }
                        y7.n(c0VarD2, a0VarN8, aVar11.f());
                        c0VarR.E(881566524);
                        if (z10) {
                            ei.D(onDeleteClick, null, false, null, null, null, composableSingletons$PreviewTopBarKt.m614getLambda2$intercom_sdk_ui_release(), c0VarR, ((i21 >> 15) & 14) | 1572864, 62);
                        }
                        c0VarR.A();
                        c0VarR.E(881579446);
                        if (z15) {
                            ei.D(function2, null, false, null, null, null, composableSingletons$PreviewTopBarKt.m615getLambda3$intercom_sdk_ui_release(), c0VarR, ((i21 >> 18) & 14) | 1572864, 62);
                        }
                        Function0<Unit> function10 = function2;
                        c0VarR.A();
                        c0VarR.E(881592201);
                        if (z16) {
                            function4 = function3;
                            ei.D(function4, null, false, null, null, null, composableSingletons$PreviewTopBarKt.m616getLambda4$intercom_sdk_ui_release(), c0VarR, ((i21 >> 21) & 14) | 1572864, 62);
                        } else {
                            function4 = function3;
                        }
                        c0VarR.A();
                        c0VarR.o();
                        c0VarR.o();
                        function5 = function10;
                        function6 = function4;
                        z17 = z15;
                        z14 = z16;
                        a0Var2 = a0Var9;
                    } else {
                        if (i22 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var2;
                        }
                        if (i23 != 0) {
                            z15 = false;
                        } else {
                            z15 = z13;
                        }
                        if (i13 != 0) {
                            z16 = false;
                        } else {
                            z16 = z14;
                        }
                        if (i17 != 0) {
                            function2 = new Function0() { // from class: io.intercom.android.sdk.ui.preview.ui.x
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.f312394a;
                                }
                            };
                        }
                        if (i19 != 0) {
                            function3 = new Function0() { // from class: io.intercom.android.sdk.ui.preview.ui.y
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.f312394a;
                                }
                            };
                        } else {
                            function3 = function1;
                        }
                        androidx.compose.ui.a0 a0VarD5 = androidx.compose.foundation.v.d(i6.F(i6.h(a0Var3, 0.0f, 1, null), null, false, 3, null), q0.w(q0.f38131b.a(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
                        androidx.compose.ui.e.a aVar13 = androidx.compose.ui.e.f37317a;
                        androidx.compose.ui.e.c cVarQ9 = aVar13.q();
                        androidx.compose.foundation.layout.q qVar5 = androidx.compose.foundation.layout.q.f16330a;
                        a1 a1VarE9 = u5.e(qVar5.s(), cVarQ9, c0VarR, 54);
                        iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        b1 b1VarK9 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN9 = androidx.compose.ui.m.n(c0VarR, a0VarD5);
                        androidx.compose.ui.node.g.a aVar14 = androidx.compose.ui.node.g.I;
                        function0A = aVar14.a();
                        if (c0VarR.S() == null) {
                            androidx.compose.runtime.v.r();
                        }
                        c0VarR.q();
                        if (c0VarR.P()) {
                            c0VarR.q0(function0A);
                        } else {
                            c0VarR.l();
                        }
                        c0VarD = y7.d(c0VarR);
                        y7.n(c0VarD, a1VarE9, aVar14.e());
                        y7.n(c0VarD, b1VarK9, aVar14.g());
                        function2B = aVar14.b();
                        if (c0VarD.P()) {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        } else {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        }
                        y7.n(c0VarD, a0VarN9, aVar14.f());
                        y5 y5Var5 = y5.f16577a;
                        composableSingletons$PreviewTopBarKt = ComposableSingletons$PreviewTopBarKt.INSTANCE;
                        androidx.compose.ui.a0 a0Var10 = a0Var3;
                        ei.D(onBackCLick, null, false, null, null, null, composableSingletons$PreviewTopBarKt.m613getLambda1$intercom_sdk_ui_release(), c0VarR, ((i21 >> 12) & 14) | 1572864, 62);
                        androidx.compose.ui.e.c cVarQ10 = aVar13.q();
                        androidx.compose.ui.a0.a aVar15 = androidx.compose.ui.a0.E;
                        a1 a1VarE10 = u5.e(qVar5.w(), cVarQ10, c0VarR, 48);
                        iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        b1 b1VarK10 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN10 = androidx.compose.ui.m.n(c0VarR, aVar15);
                        function0A2 = aVar14.a();
                        if (c0VarR.S() == null) {
                            androidx.compose.runtime.v.r();
                        }
                        c0VarR.q();
                        if (c0VarR.P()) {
                            c0VarR.q0(function0A2);
                        } else {
                            c0VarR.l();
                        }
                        c0VarD2 = y7.d(c0VarR);
                        y7.n(c0VarD2, a1VarE10, aVar14.e());
                        y7.n(c0VarD2, b1VarK10, aVar14.g());
                        function2B2 = aVar14.b();
                        if (c0VarD2.P()) {
                            c0VarD2.Y(Integer.valueOf(iHashCode2));
                            c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                        } else {
                            c0VarD2.Y(Integer.valueOf(iHashCode2));
                            c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                        }
                        y7.n(c0VarD2, a0VarN10, aVar14.f());
                        c0VarR.E(881566524);
                        if (z10) {
                            ei.D(onDeleteClick, null, false, null, null, null, composableSingletons$PreviewTopBarKt.m614getLambda2$intercom_sdk_ui_release(), c0VarR, ((i21 >> 15) & 14) | 1572864, 62);
                        }
                        c0VarR.A();
                        c0VarR.E(881579446);
                        if (z15) {
                            ei.D(function2, null, false, null, null, null, composableSingletons$PreviewTopBarKt.m615getLambda3$intercom_sdk_ui_release(), c0VarR, ((i21 >> 18) & 14) | 1572864, 62);
                        }
                        Function0<Unit> function11 = function2;
                        c0VarR.A();
                        c0VarR.E(881592201);
                        if (z16) {
                            function4 = function3;
                            ei.D(function4, null, false, null, null, null, composableSingletons$PreviewTopBarKt.m616getLambda4$intercom_sdk_ui_release(), c0VarR, ((i21 >> 21) & 14) | 1572864, 62);
                        } else {
                            function4 = function3;
                        }
                        c0VarR.A();
                        c0VarR.o();
                        c0VarR.o();
                        function5 = function11;
                        function6 = function4;
                        z17 = z15;
                        z14 = z16;
                        a0Var2 = a0Var10;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        final androidx.compose.ui.a0 a0Var11 = a0Var2;
                        final boolean z110 = z14;
                        s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.ui.preview.ui.z
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return PreviewTopBarKt.PreviewTopBar$lambda$4(a0Var11, z10, z17, z110, onBackCLick, onDeleteClick, function5, function6, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 1572864;
                function2 = function0;
                i19 = i11 & 128;
                if (i19 != 0) {
                    i12 |= 12582912;
                } else if ((i10 & 29360128) == 0) {
                    if (c0VarR.k0(function1)) {
                        i20 = 8388608;
                    } else {
                        i20 = 4194304;
                    }
                    i12 |= i20;
                }
                i21 = i12;
                if ((i21 & 23967451) == 4793490) {
                    if (i22 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if (i23 != 0) {
                        z15 = false;
                    } else {
                        z15 = z13;
                    }
                    if (i13 != 0) {
                        z16 = false;
                    } else {
                        z16 = z14;
                    }
                    if (i17 != 0) {
                        function2 = new Function0() { // from class: io.intercom.android.sdk.ui.preview.ui.x
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.f312394a;
                            }
                        };
                    }
                    if (i19 != 0) {
                        function3 = new Function0() { // from class: io.intercom.android.sdk.ui.preview.ui.y
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.f312394a;
                            }
                        };
                    } else {
                        function3 = function1;
                    }
                    androidx.compose.ui.a0 a0VarD6 = androidx.compose.foundation.v.d(i6.F(i6.h(a0Var3, 0.0f, 1, null), null, false, 3, null), q0.w(q0.f38131b.a(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
                    androidx.compose.ui.e.a aVar16 = androidx.compose.ui.e.f37317a;
                    androidx.compose.ui.e.c cVarQ11 = aVar16.q();
                    androidx.compose.foundation.layout.q qVar6 = androidx.compose.foundation.layout.q.f16330a;
                    a1 a1VarE11 = u5.e(qVar6.s(), cVarQ11, c0VarR, 54);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK11 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN11 = androidx.compose.ui.m.n(c0VarR, a0VarD6);
                    androidx.compose.ui.node.g.a aVar17 = androidx.compose.ui.node.g.I;
                    function0A = aVar17.a();
                    if (c0VarR.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0VarR.q();
                    if (c0VarR.P()) {
                        c0VarR.q0(function0A);
                    } else {
                        c0VarR.l();
                    }
                    c0VarD = y7.d(c0VarR);
                    y7.n(c0VarD, a1VarE11, aVar17.e());
                    y7.n(c0VarD, b1VarK11, aVar17.g());
                    function2B = aVar17.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN11, aVar17.f());
                    y5 y5Var6 = y5.f16577a;
                    composableSingletons$PreviewTopBarKt = ComposableSingletons$PreviewTopBarKt.INSTANCE;
                    androidx.compose.ui.a0 a0Var12 = a0Var3;
                    ei.D(onBackCLick, null, false, null, null, null, composableSingletons$PreviewTopBarKt.m613getLambda1$intercom_sdk_ui_release(), c0VarR, ((i21 >> 12) & 14) | 1572864, 62);
                    androidx.compose.ui.e.c cVarQ12 = aVar16.q();
                    androidx.compose.ui.a0.a aVar18 = androidx.compose.ui.a0.E;
                    a1 a1VarE12 = u5.e(qVar6.w(), cVarQ12, c0VarR, 48);
                    iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK12 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN12 = androidx.compose.ui.m.n(c0VarR, aVar18);
                    function0A2 = aVar17.a();
                    if (c0VarR.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0VarR.q();
                    if (c0VarR.P()) {
                        c0VarR.q0(function0A2);
                    } else {
                        c0VarR.l();
                    }
                    c0VarD2 = y7.d(c0VarR);
                    y7.n(c0VarD2, a1VarE12, aVar17.e());
                    y7.n(c0VarD2, b1VarK12, aVar17.g());
                    function2B2 = aVar17.b();
                    if (c0VarD2.P()) {
                        c0VarD2.Y(Integer.valueOf(iHashCode2));
                        c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                    } else {
                        c0VarD2.Y(Integer.valueOf(iHashCode2));
                        c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                    }
                    y7.n(c0VarD2, a0VarN12, aVar17.f());
                    c0VarR.E(881566524);
                    if (z10) {
                        ei.D(onDeleteClick, null, false, null, null, null, composableSingletons$PreviewTopBarKt.m614getLambda2$intercom_sdk_ui_release(), c0VarR, ((i21 >> 15) & 14) | 1572864, 62);
                    }
                    c0VarR.A();
                    c0VarR.E(881579446);
                    if (z15) {
                        ei.D(function2, null, false, null, null, null, composableSingletons$PreviewTopBarKt.m615getLambda3$intercom_sdk_ui_release(), c0VarR, ((i21 >> 18) & 14) | 1572864, 62);
                    }
                    Function0<Unit> function12 = function2;
                    c0VarR.A();
                    c0VarR.E(881592201);
                    if (z16) {
                        function4 = function3;
                        ei.D(function4, null, false, null, null, null, composableSingletons$PreviewTopBarKt.m616getLambda4$intercom_sdk_ui_release(), c0VarR, ((i21 >> 21) & 14) | 1572864, 62);
                    } else {
                        function4 = function3;
                    }
                    c0VarR.A();
                    c0VarR.o();
                    c0VarR.o();
                    function5 = function12;
                    function6 = function4;
                    z17 = z15;
                    z14 = z16;
                    a0Var2 = a0Var12;
                } else {
                    if (i22 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if (i23 != 0) {
                        z15 = false;
                    } else {
                        z15 = z13;
                    }
                    if (i13 != 0) {
                        z16 = false;
                    } else {
                        z16 = z14;
                    }
                    if (i17 != 0) {
                        function2 = new Function0() { // from class: io.intercom.android.sdk.ui.preview.ui.x
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.f312394a;
                            }
                        };
                    }
                    if (i19 != 0) {
                        function3 = new Function0() { // from class: io.intercom.android.sdk.ui.preview.ui.y
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.f312394a;
                            }
                        };
                    } else {
                        function3 = function1;
                    }
                    androidx.compose.ui.a0 a0VarD7 = androidx.compose.foundation.v.d(i6.F(i6.h(a0Var3, 0.0f, 1, null), null, false, 3, null), q0.w(q0.f38131b.a(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
                    androidx.compose.ui.e.a aVar19 = androidx.compose.ui.e.f37317a;
                    androidx.compose.ui.e.c cVarQ13 = aVar19.q();
                    androidx.compose.foundation.layout.q qVar7 = androidx.compose.foundation.layout.q.f16330a;
                    a1 a1VarE13 = u5.e(qVar7.s(), cVarQ13, c0VarR, 54);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK13 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN13 = androidx.compose.ui.m.n(c0VarR, a0VarD7);
                    androidx.compose.ui.node.g.a aVar110 = androidx.compose.ui.node.g.I;
                    function0A = aVar110.a();
                    if (c0VarR.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0VarR.q();
                    if (c0VarR.P()) {
                        c0VarR.q0(function0A);
                    } else {
                        c0VarR.l();
                    }
                    c0VarD = y7.d(c0VarR);
                    y7.n(c0VarD, a1VarE13, aVar110.e());
                    y7.n(c0VarD, b1VarK13, aVar110.g());
                    function2B = aVar110.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN13, aVar110.f());
                    y5 y5Var7 = y5.f16577a;
                    composableSingletons$PreviewTopBarKt = ComposableSingletons$PreviewTopBarKt.INSTANCE;
                    androidx.compose.ui.a0 a0Var13 = a0Var3;
                    ei.D(onBackCLick, null, false, null, null, null, composableSingletons$PreviewTopBarKt.m613getLambda1$intercom_sdk_ui_release(), c0VarR, ((i21 >> 12) & 14) | 1572864, 62);
                    androidx.compose.ui.e.c cVarQ14 = aVar19.q();
                    androidx.compose.ui.a0.a aVar111 = androidx.compose.ui.a0.E;
                    a1 a1VarE14 = u5.e(qVar7.w(), cVarQ14, c0VarR, 48);
                    iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK14 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN14 = androidx.compose.ui.m.n(c0VarR, aVar111);
                    function0A2 = aVar110.a();
                    if (c0VarR.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0VarR.q();
                    if (c0VarR.P()) {
                        c0VarR.q0(function0A2);
                    } else {
                        c0VarR.l();
                    }
                    c0VarD2 = y7.d(c0VarR);
                    y7.n(c0VarD2, a1VarE14, aVar110.e());
                    y7.n(c0VarD2, b1VarK14, aVar110.g());
                    function2B2 = aVar110.b();
                    if (c0VarD2.P()) {
                        c0VarD2.Y(Integer.valueOf(iHashCode2));
                        c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                    } else {
                        c0VarD2.Y(Integer.valueOf(iHashCode2));
                        c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                    }
                    y7.n(c0VarD2, a0VarN14, aVar110.f());
                    c0VarR.E(881566524);
                    if (z10) {
                        ei.D(onDeleteClick, null, false, null, null, null, composableSingletons$PreviewTopBarKt.m614getLambda2$intercom_sdk_ui_release(), c0VarR, ((i21 >> 15) & 14) | 1572864, 62);
                    }
                    c0VarR.A();
                    c0VarR.E(881579446);
                    if (z15) {
                        ei.D(function2, null, false, null, null, null, composableSingletons$PreviewTopBarKt.m615getLambda3$intercom_sdk_ui_release(), c0VarR, ((i21 >> 18) & 14) | 1572864, 62);
                    }
                    Function0<Unit> function13 = function2;
                    c0VarR.A();
                    c0VarR.E(881592201);
                    if (z16) {
                        function4 = function3;
                        ei.D(function4, null, false, null, null, null, composableSingletons$PreviewTopBarKt.m616getLambda4$intercom_sdk_ui_release(), c0VarR, ((i21 >> 21) & 14) | 1572864, 62);
                    } else {
                        function4 = function3;
                    }
                    c0VarR.A();
                    c0VarR.o();
                    c0VarR.o();
                    function5 = function13;
                    function6 = function4;
                    z17 = z15;
                    z14 = z16;
                    a0Var2 = a0Var13;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    final androidx.compose.ui.a0 a0Var14 = a0Var2;
                    final boolean z111 = z14;
                    s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.ui.preview.ui.z
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return PreviewTopBarKt.PreviewTopBar$lambda$4(a0Var14, z10, z17, z111, onBackCLick, onDeleteClick, function5, function6, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 3072;
            z14 = z12;
            if ((i11 & 16) != 0) {
                i12 |= 24576;
            } else if ((57344 & i10) == 0) {
                if (c0VarR.k0(onBackCLick)) {
                    i15 = 16384;
                } else {
                    i15 = 8192;
                }
                i12 |= i15;
            }
            if ((i11 & 32) != 0) {
                if ((458752 & i10) == 0) {
                    if (c0VarR.k0(onDeleteClick)) {
                        i16 = 131072;
                    } else {
                        i16 = 65536;
                    }
                }
                i17 = i11 & 64;
                if (i17 != 0) {
                    if ((3670016 & i10) == 0) {
                        function2 = function0;
                        if (c0VarR.k0(function2)) {
                            i18 = 1048576;
                        } else {
                            i18 = 524288;
                        }
                        i12 |= i18;
                    }
                    i19 = i11 & 128;
                    if (i19 != 0) {
                        i12 |= 12582912;
                    } else if ((i10 & 29360128) == 0) {
                        if (c0VarR.k0(function1)) {
                            i20 = 8388608;
                        } else {
                            i20 = 4194304;
                        }
                        i12 |= i20;
                    }
                    i21 = i12;
                    if ((i21 & 23967451) == 4793490) {
                        if (i22 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var2;
                        }
                        if (i23 != 0) {
                            z15 = false;
                        } else {
                            z15 = z13;
                        }
                        if (i13 != 0) {
                            z16 = false;
                        } else {
                            z16 = z14;
                        }
                        if (i17 != 0) {
                            function2 = new Function0() { // from class: io.intercom.android.sdk.ui.preview.ui.x
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.f312394a;
                                }
                            };
                        }
                        if (i19 != 0) {
                            function3 = new Function0() { // from class: io.intercom.android.sdk.ui.preview.ui.y
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.f312394a;
                                }
                            };
                        } else {
                            function3 = function1;
                        }
                        androidx.compose.ui.a0 a0VarD8 = androidx.compose.foundation.v.d(i6.F(i6.h(a0Var3, 0.0f, 1, null), null, false, 3, null), q0.w(q0.f38131b.a(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
                        androidx.compose.ui.e.a aVar112 = androidx.compose.ui.e.f37317a;
                        androidx.compose.ui.e.c cVarQ15 = aVar112.q();
                        androidx.compose.foundation.layout.q qVar8 = androidx.compose.foundation.layout.q.f16330a;
                        a1 a1VarE15 = u5.e(qVar8.s(), cVarQ15, c0VarR, 54);
                        iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        b1 b1VarK15 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN15 = androidx.compose.ui.m.n(c0VarR, a0VarD8);
                        androidx.compose.ui.node.g.a aVar113 = androidx.compose.ui.node.g.I;
                        function0A = aVar113.a();
                        if (c0VarR.S() == null) {
                            androidx.compose.runtime.v.r();
                        }
                        c0VarR.q();
                        if (c0VarR.P()) {
                            c0VarR.q0(function0A);
                        } else {
                            c0VarR.l();
                        }
                        c0VarD = y7.d(c0VarR);
                        y7.n(c0VarD, a1VarE15, aVar113.e());
                        y7.n(c0VarD, b1VarK15, aVar113.g());
                        function2B = aVar113.b();
                        if (c0VarD.P()) {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        } else {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        }
                        y7.n(c0VarD, a0VarN15, aVar113.f());
                        y5 y5Var8 = y5.f16577a;
                        composableSingletons$PreviewTopBarKt = ComposableSingletons$PreviewTopBarKt.INSTANCE;
                        androidx.compose.ui.a0 a0Var15 = a0Var3;
                        ei.D(onBackCLick, null, false, null, null, null, composableSingletons$PreviewTopBarKt.m613getLambda1$intercom_sdk_ui_release(), c0VarR, ((i21 >> 12) & 14) | 1572864, 62);
                        androidx.compose.ui.e.c cVarQ16 = aVar112.q();
                        androidx.compose.ui.a0.a aVar114 = androidx.compose.ui.a0.E;
                        a1 a1VarE16 = u5.e(qVar8.w(), cVarQ16, c0VarR, 48);
                        iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        b1 b1VarK16 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN16 = androidx.compose.ui.m.n(c0VarR, aVar114);
                        function0A2 = aVar113.a();
                        if (c0VarR.S() == null) {
                            androidx.compose.runtime.v.r();
                        }
                        c0VarR.q();
                        if (c0VarR.P()) {
                            c0VarR.q0(function0A2);
                        } else {
                            c0VarR.l();
                        }
                        c0VarD2 = y7.d(c0VarR);
                        y7.n(c0VarD2, a1VarE16, aVar113.e());
                        y7.n(c0VarD2, b1VarK16, aVar113.g());
                        function2B2 = aVar113.b();
                        if (c0VarD2.P()) {
                            c0VarD2.Y(Integer.valueOf(iHashCode2));
                            c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                        } else {
                            c0VarD2.Y(Integer.valueOf(iHashCode2));
                            c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                        }
                        y7.n(c0VarD2, a0VarN16, aVar113.f());
                        c0VarR.E(881566524);
                        if (z10) {
                            ei.D(onDeleteClick, null, false, null, null, null, composableSingletons$PreviewTopBarKt.m614getLambda2$intercom_sdk_ui_release(), c0VarR, ((i21 >> 15) & 14) | 1572864, 62);
                        }
                        c0VarR.A();
                        c0VarR.E(881579446);
                        if (z15) {
                            ei.D(function2, null, false, null, null, null, composableSingletons$PreviewTopBarKt.m615getLambda3$intercom_sdk_ui_release(), c0VarR, ((i21 >> 18) & 14) | 1572864, 62);
                        }
                        Function0<Unit> function14 = function2;
                        c0VarR.A();
                        c0VarR.E(881592201);
                        if (z16) {
                            function4 = function3;
                            ei.D(function4, null, false, null, null, null, composableSingletons$PreviewTopBarKt.m616getLambda4$intercom_sdk_ui_release(), c0VarR, ((i21 >> 21) & 14) | 1572864, 62);
                        } else {
                            function4 = function3;
                        }
                        c0VarR.A();
                        c0VarR.o();
                        c0VarR.o();
                        function5 = function14;
                        function6 = function4;
                        z17 = z15;
                        z14 = z16;
                        a0Var2 = a0Var15;
                    } else {
                        if (i22 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var2;
                        }
                        if (i23 != 0) {
                            z15 = false;
                        } else {
                            z15 = z13;
                        }
                        if (i13 != 0) {
                            z16 = false;
                        } else {
                            z16 = z14;
                        }
                        if (i17 != 0) {
                            function2 = new Function0() { // from class: io.intercom.android.sdk.ui.preview.ui.x
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.f312394a;
                                }
                            };
                        }
                        if (i19 != 0) {
                            function3 = new Function0() { // from class: io.intercom.android.sdk.ui.preview.ui.y
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.f312394a;
                                }
                            };
                        } else {
                            function3 = function1;
                        }
                        androidx.compose.ui.a0 a0VarD9 = androidx.compose.foundation.v.d(i6.F(i6.h(a0Var3, 0.0f, 1, null), null, false, 3, null), q0.w(q0.f38131b.a(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
                        androidx.compose.ui.e.a aVar115 = androidx.compose.ui.e.f37317a;
                        androidx.compose.ui.e.c cVarQ17 = aVar115.q();
                        androidx.compose.foundation.layout.q qVar9 = androidx.compose.foundation.layout.q.f16330a;
                        a1 a1VarE17 = u5.e(qVar9.s(), cVarQ17, c0VarR, 54);
                        iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        b1 b1VarK17 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN17 = androidx.compose.ui.m.n(c0VarR, a0VarD9);
                        androidx.compose.ui.node.g.a aVar116 = androidx.compose.ui.node.g.I;
                        function0A = aVar116.a();
                        if (c0VarR.S() == null) {
                            androidx.compose.runtime.v.r();
                        }
                        c0VarR.q();
                        if (c0VarR.P()) {
                            c0VarR.q0(function0A);
                        } else {
                            c0VarR.l();
                        }
                        c0VarD = y7.d(c0VarR);
                        y7.n(c0VarD, a1VarE17, aVar116.e());
                        y7.n(c0VarD, b1VarK17, aVar116.g());
                        function2B = aVar116.b();
                        if (c0VarD.P()) {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        } else {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        }
                        y7.n(c0VarD, a0VarN17, aVar116.f());
                        y5 y5Var9 = y5.f16577a;
                        composableSingletons$PreviewTopBarKt = ComposableSingletons$PreviewTopBarKt.INSTANCE;
                        androidx.compose.ui.a0 a0Var16 = a0Var3;
                        ei.D(onBackCLick, null, false, null, null, null, composableSingletons$PreviewTopBarKt.m613getLambda1$intercom_sdk_ui_release(), c0VarR, ((i21 >> 12) & 14) | 1572864, 62);
                        androidx.compose.ui.e.c cVarQ18 = aVar115.q();
                        androidx.compose.ui.a0.a aVar117 = androidx.compose.ui.a0.E;
                        a1 a1VarE18 = u5.e(qVar9.w(), cVarQ18, c0VarR, 48);
                        iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        b1 b1VarK18 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN18 = androidx.compose.ui.m.n(c0VarR, aVar117);
                        function0A2 = aVar116.a();
                        if (c0VarR.S() == null) {
                            androidx.compose.runtime.v.r();
                        }
                        c0VarR.q();
                        if (c0VarR.P()) {
                            c0VarR.q0(function0A2);
                        } else {
                            c0VarR.l();
                        }
                        c0VarD2 = y7.d(c0VarR);
                        y7.n(c0VarD2, a1VarE18, aVar116.e());
                        y7.n(c0VarD2, b1VarK18, aVar116.g());
                        function2B2 = aVar116.b();
                        if (c0VarD2.P()) {
                            c0VarD2.Y(Integer.valueOf(iHashCode2));
                            c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                        } else {
                            c0VarD2.Y(Integer.valueOf(iHashCode2));
                            c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                        }
                        y7.n(c0VarD2, a0VarN18, aVar116.f());
                        c0VarR.E(881566524);
                        if (z10) {
                            ei.D(onDeleteClick, null, false, null, null, null, composableSingletons$PreviewTopBarKt.m614getLambda2$intercom_sdk_ui_release(), c0VarR, ((i21 >> 15) & 14) | 1572864, 62);
                        }
                        c0VarR.A();
                        c0VarR.E(881579446);
                        if (z15) {
                            ei.D(function2, null, false, null, null, null, composableSingletons$PreviewTopBarKt.m615getLambda3$intercom_sdk_ui_release(), c0VarR, ((i21 >> 18) & 14) | 1572864, 62);
                        }
                        Function0<Unit> function15 = function2;
                        c0VarR.A();
                        c0VarR.E(881592201);
                        if (z16) {
                            function4 = function3;
                            ei.D(function4, null, false, null, null, null, composableSingletons$PreviewTopBarKt.m616getLambda4$intercom_sdk_ui_release(), c0VarR, ((i21 >> 21) & 14) | 1572864, 62);
                        } else {
                            function4 = function3;
                        }
                        c0VarR.A();
                        c0VarR.o();
                        c0VarR.o();
                        function5 = function15;
                        function6 = function4;
                        z17 = z15;
                        z14 = z16;
                        a0Var2 = a0Var16;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        final androidx.compose.ui.a0 a0Var17 = a0Var2;
                        final boolean z112 = z14;
                        s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.ui.preview.ui.z
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return PreviewTopBarKt.PreviewTopBar$lambda$4(a0Var17, z10, z17, z112, onBackCLick, onDeleteClick, function5, function6, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 1572864;
                function2 = function0;
                i19 = i11 & 128;
                if (i19 != 0) {
                    i12 |= 12582912;
                } else if ((i10 & 29360128) == 0) {
                    if (c0VarR.k0(function1)) {
                        i20 = 8388608;
                    } else {
                        i20 = 4194304;
                    }
                    i12 |= i20;
                }
                i21 = i12;
                if ((i21 & 23967451) == 4793490) {
                    if (i22 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if (i23 != 0) {
                        z15 = false;
                    } else {
                        z15 = z13;
                    }
                    if (i13 != 0) {
                        z16 = false;
                    } else {
                        z16 = z14;
                    }
                    if (i17 != 0) {
                        function2 = new Function0() { // from class: io.intercom.android.sdk.ui.preview.ui.x
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.f312394a;
                            }
                        };
                    }
                    if (i19 != 0) {
                        function3 = new Function0() { // from class: io.intercom.android.sdk.ui.preview.ui.y
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.f312394a;
                            }
                        };
                    } else {
                        function3 = function1;
                    }
                    androidx.compose.ui.a0 a0VarD10 = androidx.compose.foundation.v.d(i6.F(i6.h(a0Var3, 0.0f, 1, null), null, false, 3, null), q0.w(q0.f38131b.a(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
                    androidx.compose.ui.e.a aVar118 = androidx.compose.ui.e.f37317a;
                    androidx.compose.ui.e.c cVarQ19 = aVar118.q();
                    androidx.compose.foundation.layout.q qVar10 = androidx.compose.foundation.layout.q.f16330a;
                    a1 a1VarE19 = u5.e(qVar10.s(), cVarQ19, c0VarR, 54);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK19 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN19 = androidx.compose.ui.m.n(c0VarR, a0VarD10);
                    androidx.compose.ui.node.g.a aVar119 = androidx.compose.ui.node.g.I;
                    function0A = aVar119.a();
                    if (c0VarR.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0VarR.q();
                    if (c0VarR.P()) {
                        c0VarR.q0(function0A);
                    } else {
                        c0VarR.l();
                    }
                    c0VarD = y7.d(c0VarR);
                    y7.n(c0VarD, a1VarE19, aVar119.e());
                    y7.n(c0VarD, b1VarK19, aVar119.g());
                    function2B = aVar119.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN19, aVar119.f());
                    y5 y5Var10 = y5.f16577a;
                    composableSingletons$PreviewTopBarKt = ComposableSingletons$PreviewTopBarKt.INSTANCE;
                    androidx.compose.ui.a0 a0Var18 = a0Var3;
                    ei.D(onBackCLick, null, false, null, null, null, composableSingletons$PreviewTopBarKt.m613getLambda1$intercom_sdk_ui_release(), c0VarR, ((i21 >> 12) & 14) | 1572864, 62);
                    androidx.compose.ui.e.c cVarQ110 = aVar118.q();
                    androidx.compose.ui.a0.a aVar1110 = androidx.compose.ui.a0.E;
                    a1 a1VarE110 = u5.e(qVar10.w(), cVarQ110, c0VarR, 48);
                    iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK110 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN110 = androidx.compose.ui.m.n(c0VarR, aVar1110);
                    function0A2 = aVar119.a();
                    if (c0VarR.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0VarR.q();
                    if (c0VarR.P()) {
                        c0VarR.q0(function0A2);
                    } else {
                        c0VarR.l();
                    }
                    c0VarD2 = y7.d(c0VarR);
                    y7.n(c0VarD2, a1VarE110, aVar119.e());
                    y7.n(c0VarD2, b1VarK110, aVar119.g());
                    function2B2 = aVar119.b();
                    if (c0VarD2.P()) {
                        c0VarD2.Y(Integer.valueOf(iHashCode2));
                        c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                    } else {
                        c0VarD2.Y(Integer.valueOf(iHashCode2));
                        c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                    }
                    y7.n(c0VarD2, a0VarN110, aVar119.f());
                    c0VarR.E(881566524);
                    if (z10) {
                        ei.D(onDeleteClick, null, false, null, null, null, composableSingletons$PreviewTopBarKt.m614getLambda2$intercom_sdk_ui_release(), c0VarR, ((i21 >> 15) & 14) | 1572864, 62);
                    }
                    c0VarR.A();
                    c0VarR.E(881579446);
                    if (z15) {
                        ei.D(function2, null, false, null, null, null, composableSingletons$PreviewTopBarKt.m615getLambda3$intercom_sdk_ui_release(), c0VarR, ((i21 >> 18) & 14) | 1572864, 62);
                    }
                    Function0<Unit> function16 = function2;
                    c0VarR.A();
                    c0VarR.E(881592201);
                    if (z16) {
                        function4 = function3;
                        ei.D(function4, null, false, null, null, null, composableSingletons$PreviewTopBarKt.m616getLambda4$intercom_sdk_ui_release(), c0VarR, ((i21 >> 21) & 14) | 1572864, 62);
                    } else {
                        function4 = function3;
                    }
                    c0VarR.A();
                    c0VarR.o();
                    c0VarR.o();
                    function5 = function16;
                    function6 = function4;
                    z17 = z15;
                    z14 = z16;
                    a0Var2 = a0Var18;
                } else {
                    if (i22 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if (i23 != 0) {
                        z15 = false;
                    } else {
                        z15 = z13;
                    }
                    if (i13 != 0) {
                        z16 = false;
                    } else {
                        z16 = z14;
                    }
                    if (i17 != 0) {
                        function2 = new Function0() { // from class: io.intercom.android.sdk.ui.preview.ui.x
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.f312394a;
                            }
                        };
                    }
                    if (i19 != 0) {
                        function3 = new Function0() { // from class: io.intercom.android.sdk.ui.preview.ui.y
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.f312394a;
                            }
                        };
                    } else {
                        function3 = function1;
                    }
                    androidx.compose.ui.a0 a0VarD11 = androidx.compose.foundation.v.d(i6.F(i6.h(a0Var3, 0.0f, 1, null), null, false, 3, null), q0.w(q0.f38131b.a(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
                    androidx.compose.ui.e.a aVar1111 = androidx.compose.ui.e.f37317a;
                    androidx.compose.ui.e.c cVarQ111 = aVar1111.q();
                    androidx.compose.foundation.layout.q qVar11 = androidx.compose.foundation.layout.q.f16330a;
                    a1 a1VarE111 = u5.e(qVar11.s(), cVarQ111, c0VarR, 54);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK111 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN111 = androidx.compose.ui.m.n(c0VarR, a0VarD11);
                    androidx.compose.ui.node.g.a aVar1112 = androidx.compose.ui.node.g.I;
                    function0A = aVar1112.a();
                    if (c0VarR.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0VarR.q();
                    if (c0VarR.P()) {
                        c0VarR.q0(function0A);
                    } else {
                        c0VarR.l();
                    }
                    c0VarD = y7.d(c0VarR);
                    y7.n(c0VarD, a1VarE111, aVar1112.e());
                    y7.n(c0VarD, b1VarK111, aVar1112.g());
                    function2B = aVar1112.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN111, aVar1112.f());
                    y5 y5Var11 = y5.f16577a;
                    composableSingletons$PreviewTopBarKt = ComposableSingletons$PreviewTopBarKt.INSTANCE;
                    androidx.compose.ui.a0 a0Var19 = a0Var3;
                    ei.D(onBackCLick, null, false, null, null, null, composableSingletons$PreviewTopBarKt.m613getLambda1$intercom_sdk_ui_release(), c0VarR, ((i21 >> 12) & 14) | 1572864, 62);
                    androidx.compose.ui.e.c cVarQ112 = aVar1111.q();
                    androidx.compose.ui.a0.a aVar1113 = androidx.compose.ui.a0.E;
                    a1 a1VarE112 = u5.e(qVar11.w(), cVarQ112, c0VarR, 48);
                    iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK112 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN112 = androidx.compose.ui.m.n(c0VarR, aVar1113);
                    function0A2 = aVar1112.a();
                    if (c0VarR.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0VarR.q();
                    if (c0VarR.P()) {
                        c0VarR.q0(function0A2);
                    } else {
                        c0VarR.l();
                    }
                    c0VarD2 = y7.d(c0VarR);
                    y7.n(c0VarD2, a1VarE112, aVar1112.e());
                    y7.n(c0VarD2, b1VarK112, aVar1112.g());
                    function2B2 = aVar1112.b();
                    if (c0VarD2.P()) {
                        c0VarD2.Y(Integer.valueOf(iHashCode2));
                        c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                    } else {
                        c0VarD2.Y(Integer.valueOf(iHashCode2));
                        c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                    }
                    y7.n(c0VarD2, a0VarN112, aVar1112.f());
                    c0VarR.E(881566524);
                    if (z10) {
                        ei.D(onDeleteClick, null, false, null, null, null, composableSingletons$PreviewTopBarKt.m614getLambda2$intercom_sdk_ui_release(), c0VarR, ((i21 >> 15) & 14) | 1572864, 62);
                    }
                    c0VarR.A();
                    c0VarR.E(881579446);
                    if (z15) {
                        ei.D(function2, null, false, null, null, null, composableSingletons$PreviewTopBarKt.m615getLambda3$intercom_sdk_ui_release(), c0VarR, ((i21 >> 18) & 14) | 1572864, 62);
                    }
                    Function0<Unit> function17 = function2;
                    c0VarR.A();
                    c0VarR.E(881592201);
                    if (z16) {
                        function4 = function3;
                        ei.D(function4, null, false, null, null, null, composableSingletons$PreviewTopBarKt.m616getLambda4$intercom_sdk_ui_release(), c0VarR, ((i21 >> 21) & 14) | 1572864, 62);
                    } else {
                        function4 = function3;
                    }
                    c0VarR.A();
                    c0VarR.o();
                    c0VarR.o();
                    function5 = function17;
                    function6 = function4;
                    z17 = z15;
                    z14 = z16;
                    a0Var2 = a0Var19;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    final androidx.compose.ui.a0 a0Var110 = a0Var2;
                    final boolean z113 = z14;
                    s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.ui.preview.ui.z
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return PreviewTopBarKt.PreviewTopBar$lambda$4(a0Var110, z10, z17, z113, onBackCLick, onDeleteClick, function5, function6, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i16 = androidx.profileinstaller.n.c.f73814m;
            i12 |= i16;
            i17 = i11 & 64;
            if (i17 != 0) {
                if ((3670016 & i10) == 0) {
                    function2 = function0;
                    if (c0VarR.k0(function2)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i12 |= i18;
                }
                i19 = i11 & 128;
                if (i19 != 0) {
                    i12 |= 12582912;
                } else if ((i10 & 29360128) == 0) {
                    if (c0VarR.k0(function1)) {
                        i20 = 8388608;
                    } else {
                        i20 = 4194304;
                    }
                    i12 |= i20;
                }
                i21 = i12;
                if ((i21 & 23967451) == 4793490) {
                    if (i22 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if (i23 != 0) {
                        z15 = false;
                    } else {
                        z15 = z13;
                    }
                    if (i13 != 0) {
                        z16 = false;
                    } else {
                        z16 = z14;
                    }
                    if (i17 != 0) {
                        function2 = new Function0() { // from class: io.intercom.android.sdk.ui.preview.ui.x
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.f312394a;
                            }
                        };
                    }
                    if (i19 != 0) {
                        function3 = new Function0() { // from class: io.intercom.android.sdk.ui.preview.ui.y
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.f312394a;
                            }
                        };
                    } else {
                        function3 = function1;
                    }
                    androidx.compose.ui.a0 a0VarD12 = androidx.compose.foundation.v.d(i6.F(i6.h(a0Var3, 0.0f, 1, null), null, false, 3, null), q0.w(q0.f38131b.a(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
                    androidx.compose.ui.e.a aVar1114 = androidx.compose.ui.e.f37317a;
                    androidx.compose.ui.e.c cVarQ113 = aVar1114.q();
                    androidx.compose.foundation.layout.q qVar12 = androidx.compose.foundation.layout.q.f16330a;
                    a1 a1VarE113 = u5.e(qVar12.s(), cVarQ113, c0VarR, 54);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK113 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN113 = androidx.compose.ui.m.n(c0VarR, a0VarD12);
                    androidx.compose.ui.node.g.a aVar1115 = androidx.compose.ui.node.g.I;
                    function0A = aVar1115.a();
                    if (c0VarR.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0VarR.q();
                    if (c0VarR.P()) {
                        c0VarR.q0(function0A);
                    } else {
                        c0VarR.l();
                    }
                    c0VarD = y7.d(c0VarR);
                    y7.n(c0VarD, a1VarE113, aVar1115.e());
                    y7.n(c0VarD, b1VarK113, aVar1115.g());
                    function2B = aVar1115.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN113, aVar1115.f());
                    y5 y5Var12 = y5.f16577a;
                    composableSingletons$PreviewTopBarKt = ComposableSingletons$PreviewTopBarKt.INSTANCE;
                    androidx.compose.ui.a0 a0Var111 = a0Var3;
                    ei.D(onBackCLick, null, false, null, null, null, composableSingletons$PreviewTopBarKt.m613getLambda1$intercom_sdk_ui_release(), c0VarR, ((i21 >> 12) & 14) | 1572864, 62);
                    androidx.compose.ui.e.c cVarQ114 = aVar1114.q();
                    androidx.compose.ui.a0.a aVar1116 = androidx.compose.ui.a0.E;
                    a1 a1VarE114 = u5.e(qVar12.w(), cVarQ114, c0VarR, 48);
                    iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK114 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN114 = androidx.compose.ui.m.n(c0VarR, aVar1116);
                    function0A2 = aVar1115.a();
                    if (c0VarR.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0VarR.q();
                    if (c0VarR.P()) {
                        c0VarR.q0(function0A2);
                    } else {
                        c0VarR.l();
                    }
                    c0VarD2 = y7.d(c0VarR);
                    y7.n(c0VarD2, a1VarE114, aVar1115.e());
                    y7.n(c0VarD2, b1VarK114, aVar1115.g());
                    function2B2 = aVar1115.b();
                    if (c0VarD2.P()) {
                        c0VarD2.Y(Integer.valueOf(iHashCode2));
                        c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                    } else {
                        c0VarD2.Y(Integer.valueOf(iHashCode2));
                        c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                    }
                    y7.n(c0VarD2, a0VarN114, aVar1115.f());
                    c0VarR.E(881566524);
                    if (z10) {
                        ei.D(onDeleteClick, null, false, null, null, null, composableSingletons$PreviewTopBarKt.m614getLambda2$intercom_sdk_ui_release(), c0VarR, ((i21 >> 15) & 14) | 1572864, 62);
                    }
                    c0VarR.A();
                    c0VarR.E(881579446);
                    if (z15) {
                        ei.D(function2, null, false, null, null, null, composableSingletons$PreviewTopBarKt.m615getLambda3$intercom_sdk_ui_release(), c0VarR, ((i21 >> 18) & 14) | 1572864, 62);
                    }
                    Function0<Unit> function18 = function2;
                    c0VarR.A();
                    c0VarR.E(881592201);
                    if (z16) {
                        function4 = function3;
                        ei.D(function4, null, false, null, null, null, composableSingletons$PreviewTopBarKt.m616getLambda4$intercom_sdk_ui_release(), c0VarR, ((i21 >> 21) & 14) | 1572864, 62);
                    } else {
                        function4 = function3;
                    }
                    c0VarR.A();
                    c0VarR.o();
                    c0VarR.o();
                    function5 = function18;
                    function6 = function4;
                    z17 = z15;
                    z14 = z16;
                    a0Var2 = a0Var111;
                } else {
                    if (i22 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if (i23 != 0) {
                        z15 = false;
                    } else {
                        z15 = z13;
                    }
                    if (i13 != 0) {
                        z16 = false;
                    } else {
                        z16 = z14;
                    }
                    if (i17 != 0) {
                        function2 = new Function0() { // from class: io.intercom.android.sdk.ui.preview.ui.x
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.f312394a;
                            }
                        };
                    }
                    if (i19 != 0) {
                        function3 = new Function0() { // from class: io.intercom.android.sdk.ui.preview.ui.y
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.f312394a;
                            }
                        };
                    } else {
                        function3 = function1;
                    }
                    androidx.compose.ui.a0 a0VarD13 = androidx.compose.foundation.v.d(i6.F(i6.h(a0Var3, 0.0f, 1, null), null, false, 3, null), q0.w(q0.f38131b.a(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
                    androidx.compose.ui.e.a aVar1117 = androidx.compose.ui.e.f37317a;
                    androidx.compose.ui.e.c cVarQ115 = aVar1117.q();
                    androidx.compose.foundation.layout.q qVar13 = androidx.compose.foundation.layout.q.f16330a;
                    a1 a1VarE115 = u5.e(qVar13.s(), cVarQ115, c0VarR, 54);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK115 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN115 = androidx.compose.ui.m.n(c0VarR, a0VarD13);
                    androidx.compose.ui.node.g.a aVar1118 = androidx.compose.ui.node.g.I;
                    function0A = aVar1118.a();
                    if (c0VarR.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0VarR.q();
                    if (c0VarR.P()) {
                        c0VarR.q0(function0A);
                    } else {
                        c0VarR.l();
                    }
                    c0VarD = y7.d(c0VarR);
                    y7.n(c0VarD, a1VarE115, aVar1118.e());
                    y7.n(c0VarD, b1VarK115, aVar1118.g());
                    function2B = aVar1118.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN115, aVar1118.f());
                    y5 y5Var13 = y5.f16577a;
                    composableSingletons$PreviewTopBarKt = ComposableSingletons$PreviewTopBarKt.INSTANCE;
                    androidx.compose.ui.a0 a0Var112 = a0Var3;
                    ei.D(onBackCLick, null, false, null, null, null, composableSingletons$PreviewTopBarKt.m613getLambda1$intercom_sdk_ui_release(), c0VarR, ((i21 >> 12) & 14) | 1572864, 62);
                    androidx.compose.ui.e.c cVarQ116 = aVar1117.q();
                    androidx.compose.ui.a0.a aVar1119 = androidx.compose.ui.a0.E;
                    a1 a1VarE116 = u5.e(qVar13.w(), cVarQ116, c0VarR, 48);
                    iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK116 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN116 = androidx.compose.ui.m.n(c0VarR, aVar1119);
                    function0A2 = aVar1118.a();
                    if (c0VarR.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0VarR.q();
                    if (c0VarR.P()) {
                        c0VarR.q0(function0A2);
                    } else {
                        c0VarR.l();
                    }
                    c0VarD2 = y7.d(c0VarR);
                    y7.n(c0VarD2, a1VarE116, aVar1118.e());
                    y7.n(c0VarD2, b1VarK116, aVar1118.g());
                    function2B2 = aVar1118.b();
                    if (c0VarD2.P()) {
                        c0VarD2.Y(Integer.valueOf(iHashCode2));
                        c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                    } else {
                        c0VarD2.Y(Integer.valueOf(iHashCode2));
                        c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                    }
                    y7.n(c0VarD2, a0VarN116, aVar1118.f());
                    c0VarR.E(881566524);
                    if (z10) {
                        ei.D(onDeleteClick, null, false, null, null, null, composableSingletons$PreviewTopBarKt.m614getLambda2$intercom_sdk_ui_release(), c0VarR, ((i21 >> 15) & 14) | 1572864, 62);
                    }
                    c0VarR.A();
                    c0VarR.E(881579446);
                    if (z15) {
                        ei.D(function2, null, false, null, null, null, composableSingletons$PreviewTopBarKt.m615getLambda3$intercom_sdk_ui_release(), c0VarR, ((i21 >> 18) & 14) | 1572864, 62);
                    }
                    Function0<Unit> function19 = function2;
                    c0VarR.A();
                    c0VarR.E(881592201);
                    if (z16) {
                        function4 = function3;
                        ei.D(function4, null, false, null, null, null, composableSingletons$PreviewTopBarKt.m616getLambda4$intercom_sdk_ui_release(), c0VarR, ((i21 >> 21) & 14) | 1572864, 62);
                    } else {
                        function4 = function3;
                    }
                    c0VarR.A();
                    c0VarR.o();
                    c0VarR.o();
                    function5 = function19;
                    function6 = function4;
                    z17 = z15;
                    z14 = z16;
                    a0Var2 = a0Var112;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    final androidx.compose.ui.a0 a0Var113 = a0Var2;
                    final boolean z114 = z14;
                    s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.ui.preview.ui.z
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return PreviewTopBarKt.PreviewTopBar$lambda$4(a0Var113, z10, z17, z114, onBackCLick, onDeleteClick, function5, function6, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 1572864;
            function2 = function0;
            i19 = i11 & 128;
            if (i19 != 0) {
                i12 |= 12582912;
            } else if ((i10 & 29360128) == 0) {
                if (c0VarR.k0(function1)) {
                    i20 = 8388608;
                } else {
                    i20 = 4194304;
                }
                i12 |= i20;
            }
            i21 = i12;
            if ((i21 & 23967451) == 4793490) {
                if (i22 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if (i23 != 0) {
                    z15 = false;
                } else {
                    z15 = z13;
                }
                if (i13 != 0) {
                    z16 = false;
                } else {
                    z16 = z14;
                }
                if (i17 != 0) {
                    function2 = new Function0() { // from class: io.intercom.android.sdk.ui.preview.ui.x
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.f312394a;
                        }
                    };
                }
                if (i19 != 0) {
                    function3 = new Function0() { // from class: io.intercom.android.sdk.ui.preview.ui.y
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.f312394a;
                        }
                    };
                } else {
                    function3 = function1;
                }
                androidx.compose.ui.a0 a0VarD14 = androidx.compose.foundation.v.d(i6.F(i6.h(a0Var3, 0.0f, 1, null), null, false, 3, null), q0.w(q0.f38131b.a(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
                androidx.compose.ui.e.a aVar11110 = androidx.compose.ui.e.f37317a;
                androidx.compose.ui.e.c cVarQ117 = aVar11110.q();
                androidx.compose.foundation.layout.q qVar14 = androidx.compose.foundation.layout.q.f16330a;
                a1 a1VarE117 = u5.e(qVar14.s(), cVarQ117, c0VarR, 54);
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK117 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN117 = androidx.compose.ui.m.n(c0VarR, a0VarD14);
                androidx.compose.ui.node.g.a aVar11111 = androidx.compose.ui.node.g.I;
                function0A = aVar11111.a();
                if (c0VarR.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0VarR.q();
                if (c0VarR.P()) {
                    c0VarR.q0(function0A);
                } else {
                    c0VarR.l();
                }
                c0VarD = y7.d(c0VarR);
                y7.n(c0VarD, a1VarE117, aVar11111.e());
                y7.n(c0VarD, b1VarK117, aVar11111.g());
                function2B = aVar11111.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN117, aVar11111.f());
                y5 y5Var14 = y5.f16577a;
                composableSingletons$PreviewTopBarKt = ComposableSingletons$PreviewTopBarKt.INSTANCE;
                androidx.compose.ui.a0 a0Var114 = a0Var3;
                ei.D(onBackCLick, null, false, null, null, null, composableSingletons$PreviewTopBarKt.m613getLambda1$intercom_sdk_ui_release(), c0VarR, ((i21 >> 12) & 14) | 1572864, 62);
                androidx.compose.ui.e.c cVarQ118 = aVar11110.q();
                androidx.compose.ui.a0.a aVar11112 = androidx.compose.ui.a0.E;
                a1 a1VarE118 = u5.e(qVar14.w(), cVarQ118, c0VarR, 48);
                iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK118 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN118 = androidx.compose.ui.m.n(c0VarR, aVar11112);
                function0A2 = aVar11111.a();
                if (c0VarR.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0VarR.q();
                if (c0VarR.P()) {
                    c0VarR.q0(function0A2);
                } else {
                    c0VarR.l();
                }
                c0VarD2 = y7.d(c0VarR);
                y7.n(c0VarD2, a1VarE118, aVar11111.e());
                y7.n(c0VarD2, b1VarK118, aVar11111.g());
                function2B2 = aVar11111.b();
                if (c0VarD2.P()) {
                    c0VarD2.Y(Integer.valueOf(iHashCode2));
                    c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                } else {
                    c0VarD2.Y(Integer.valueOf(iHashCode2));
                    c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                }
                y7.n(c0VarD2, a0VarN118, aVar11111.f());
                c0VarR.E(881566524);
                if (z10) {
                    ei.D(onDeleteClick, null, false, null, null, null, composableSingletons$PreviewTopBarKt.m614getLambda2$intercom_sdk_ui_release(), c0VarR, ((i21 >> 15) & 14) | 1572864, 62);
                }
                c0VarR.A();
                c0VarR.E(881579446);
                if (z15) {
                    ei.D(function2, null, false, null, null, null, composableSingletons$PreviewTopBarKt.m615getLambda3$intercom_sdk_ui_release(), c0VarR, ((i21 >> 18) & 14) | 1572864, 62);
                }
                Function0<Unit> function110 = function2;
                c0VarR.A();
                c0VarR.E(881592201);
                if (z16) {
                    function4 = function3;
                    ei.D(function4, null, false, null, null, null, composableSingletons$PreviewTopBarKt.m616getLambda4$intercom_sdk_ui_release(), c0VarR, ((i21 >> 21) & 14) | 1572864, 62);
                } else {
                    function4 = function3;
                }
                c0VarR.A();
                c0VarR.o();
                c0VarR.o();
                function5 = function110;
                function6 = function4;
                z17 = z15;
                z14 = z16;
                a0Var2 = a0Var114;
            } else {
                if (i22 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if (i23 != 0) {
                    z15 = false;
                } else {
                    z15 = z13;
                }
                if (i13 != 0) {
                    z16 = false;
                } else {
                    z16 = z14;
                }
                if (i17 != 0) {
                    function2 = new Function0() { // from class: io.intercom.android.sdk.ui.preview.ui.x
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.f312394a;
                        }
                    };
                }
                if (i19 != 0) {
                    function3 = new Function0() { // from class: io.intercom.android.sdk.ui.preview.ui.y
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.f312394a;
                        }
                    };
                } else {
                    function3 = function1;
                }
                androidx.compose.ui.a0 a0VarD15 = androidx.compose.foundation.v.d(i6.F(i6.h(a0Var3, 0.0f, 1, null), null, false, 3, null), q0.w(q0.f38131b.a(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
                androidx.compose.ui.e.a aVar11113 = androidx.compose.ui.e.f37317a;
                androidx.compose.ui.e.c cVarQ119 = aVar11113.q();
                androidx.compose.foundation.layout.q qVar15 = androidx.compose.foundation.layout.q.f16330a;
                a1 a1VarE119 = u5.e(qVar15.s(), cVarQ119, c0VarR, 54);
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK119 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN119 = androidx.compose.ui.m.n(c0VarR, a0VarD15);
                androidx.compose.ui.node.g.a aVar11114 = androidx.compose.ui.node.g.I;
                function0A = aVar11114.a();
                if (c0VarR.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0VarR.q();
                if (c0VarR.P()) {
                    c0VarR.q0(function0A);
                } else {
                    c0VarR.l();
                }
                c0VarD = y7.d(c0VarR);
                y7.n(c0VarD, a1VarE119, aVar11114.e());
                y7.n(c0VarD, b1VarK119, aVar11114.g());
                function2B = aVar11114.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN119, aVar11114.f());
                y5 y5Var15 = y5.f16577a;
                composableSingletons$PreviewTopBarKt = ComposableSingletons$PreviewTopBarKt.INSTANCE;
                androidx.compose.ui.a0 a0Var115 = a0Var3;
                ei.D(onBackCLick, null, false, null, null, null, composableSingletons$PreviewTopBarKt.m613getLambda1$intercom_sdk_ui_release(), c0VarR, ((i21 >> 12) & 14) | 1572864, 62);
                androidx.compose.ui.e.c cVarQ1110 = aVar11113.q();
                androidx.compose.ui.a0.a aVar11115 = androidx.compose.ui.a0.E;
                a1 a1VarE1110 = u5.e(qVar15.w(), cVarQ1110, c0VarR, 48);
                iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK1110 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN1110 = androidx.compose.ui.m.n(c0VarR, aVar11115);
                function0A2 = aVar11114.a();
                if (c0VarR.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0VarR.q();
                if (c0VarR.P()) {
                    c0VarR.q0(function0A2);
                } else {
                    c0VarR.l();
                }
                c0VarD2 = y7.d(c0VarR);
                y7.n(c0VarD2, a1VarE1110, aVar11114.e());
                y7.n(c0VarD2, b1VarK1110, aVar11114.g());
                function2B2 = aVar11114.b();
                if (c0VarD2.P()) {
                    c0VarD2.Y(Integer.valueOf(iHashCode2));
                    c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                } else {
                    c0VarD2.Y(Integer.valueOf(iHashCode2));
                    c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                }
                y7.n(c0VarD2, a0VarN1110, aVar11114.f());
                c0VarR.E(881566524);
                if (z10) {
                    ei.D(onDeleteClick, null, false, null, null, null, composableSingletons$PreviewTopBarKt.m614getLambda2$intercom_sdk_ui_release(), c0VarR, ((i21 >> 15) & 14) | 1572864, 62);
                }
                c0VarR.A();
                c0VarR.E(881579446);
                if (z15) {
                    ei.D(function2, null, false, null, null, null, composableSingletons$PreviewTopBarKt.m615getLambda3$intercom_sdk_ui_release(), c0VarR, ((i21 >> 18) & 14) | 1572864, 62);
                }
                Function0<Unit> function111 = function2;
                c0VarR.A();
                c0VarR.E(881592201);
                if (z16) {
                    function4 = function3;
                    ei.D(function4, null, false, null, null, null, composableSingletons$PreviewTopBarKt.m616getLambda4$intercom_sdk_ui_release(), c0VarR, ((i21 >> 21) & 14) | 1572864, 62);
                } else {
                    function4 = function3;
                }
                c0VarR.A();
                c0VarR.o();
                c0VarR.o();
                function5 = function111;
                function6 = function4;
                z17 = z15;
                z14 = z16;
                a0Var2 = a0Var115;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                final androidx.compose.ui.a0 a0Var116 = a0Var2;
                final boolean z115 = z14;
                s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.ui.preview.ui.z
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return PreviewTopBarKt.PreviewTopBar$lambda$4(a0Var116, z10, z17, z115, onBackCLick, onDeleteClick, function5, function6, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= a5.S0;
        z13 = z11;
        i13 = i11 & 8;
        if (i13 != 0) {
            if ((i10 & 7168) == 0) {
                z14 = z12;
                if (c0VarR.G(z14)) {
                    i14 = 2048;
                } else {
                    i14 = 1024;
                }
                i12 |= i14;
            }
            if ((i11 & 16) != 0) {
                i12 |= 24576;
            } else if ((57344 & i10) == 0) {
                if (c0VarR.k0(onBackCLick)) {
                    i15 = 16384;
                } else {
                    i15 = 8192;
                }
                i12 |= i15;
            }
            if ((i11 & 32) != 0) {
                if ((458752 & i10) == 0) {
                    if (c0VarR.k0(onDeleteClick)) {
                        i16 = 131072;
                    } else {
                        i16 = 65536;
                    }
                }
                i17 = i11 & 64;
                if (i17 != 0) {
                    if ((3670016 & i10) == 0) {
                        function2 = function0;
                        if (c0VarR.k0(function2)) {
                            i18 = 1048576;
                        } else {
                            i18 = 524288;
                        }
                        i12 |= i18;
                    }
                    i19 = i11 & 128;
                    if (i19 != 0) {
                        i12 |= 12582912;
                    } else if ((i10 & 29360128) == 0) {
                        if (c0VarR.k0(function1)) {
                            i20 = 8388608;
                        } else {
                            i20 = 4194304;
                        }
                        i12 |= i20;
                    }
                    i21 = i12;
                    if ((i21 & 23967451) == 4793490) {
                        if (i22 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var2;
                        }
                        if (i23 != 0) {
                            z15 = false;
                        } else {
                            z15 = z13;
                        }
                        if (i13 != 0) {
                            z16 = false;
                        } else {
                            z16 = z14;
                        }
                        if (i17 != 0) {
                            function2 = new Function0() { // from class: io.intercom.android.sdk.ui.preview.ui.x
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.f312394a;
                                }
                            };
                        }
                        if (i19 != 0) {
                            function3 = new Function0() { // from class: io.intercom.android.sdk.ui.preview.ui.y
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.f312394a;
                                }
                            };
                        } else {
                            function3 = function1;
                        }
                        androidx.compose.ui.a0 a0VarD16 = androidx.compose.foundation.v.d(i6.F(i6.h(a0Var3, 0.0f, 1, null), null, false, 3, null), q0.w(q0.f38131b.a(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
                        androidx.compose.ui.e.a aVar11116 = androidx.compose.ui.e.f37317a;
                        androidx.compose.ui.e.c cVarQ1111 = aVar11116.q();
                        androidx.compose.foundation.layout.q qVar16 = androidx.compose.foundation.layout.q.f16330a;
                        a1 a1VarE1111 = u5.e(qVar16.s(), cVarQ1111, c0VarR, 54);
                        iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        b1 b1VarK1111 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN1111 = androidx.compose.ui.m.n(c0VarR, a0VarD16);
                        androidx.compose.ui.node.g.a aVar11117 = androidx.compose.ui.node.g.I;
                        function0A = aVar11117.a();
                        if (c0VarR.S() == null) {
                            androidx.compose.runtime.v.r();
                        }
                        c0VarR.q();
                        if (c0VarR.P()) {
                            c0VarR.q0(function0A);
                        } else {
                            c0VarR.l();
                        }
                        c0VarD = y7.d(c0VarR);
                        y7.n(c0VarD, a1VarE1111, aVar11117.e());
                        y7.n(c0VarD, b1VarK1111, aVar11117.g());
                        function2B = aVar11117.b();
                        if (c0VarD.P()) {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        } else {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        }
                        y7.n(c0VarD, a0VarN1111, aVar11117.f());
                        y5 y5Var16 = y5.f16577a;
                        composableSingletons$PreviewTopBarKt = ComposableSingletons$PreviewTopBarKt.INSTANCE;
                        androidx.compose.ui.a0 a0Var117 = a0Var3;
                        ei.D(onBackCLick, null, false, null, null, null, composableSingletons$PreviewTopBarKt.m613getLambda1$intercom_sdk_ui_release(), c0VarR, ((i21 >> 12) & 14) | 1572864, 62);
                        androidx.compose.ui.e.c cVarQ1112 = aVar11116.q();
                        androidx.compose.ui.a0.a aVar11118 = androidx.compose.ui.a0.E;
                        a1 a1VarE1112 = u5.e(qVar16.w(), cVarQ1112, c0VarR, 48);
                        iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        b1 b1VarK1112 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN1112 = androidx.compose.ui.m.n(c0VarR, aVar11118);
                        function0A2 = aVar11117.a();
                        if (c0VarR.S() == null) {
                            androidx.compose.runtime.v.r();
                        }
                        c0VarR.q();
                        if (c0VarR.P()) {
                            c0VarR.q0(function0A2);
                        } else {
                            c0VarR.l();
                        }
                        c0VarD2 = y7.d(c0VarR);
                        y7.n(c0VarD2, a1VarE1112, aVar11117.e());
                        y7.n(c0VarD2, b1VarK1112, aVar11117.g());
                        function2B2 = aVar11117.b();
                        if (c0VarD2.P()) {
                            c0VarD2.Y(Integer.valueOf(iHashCode2));
                            c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                        } else {
                            c0VarD2.Y(Integer.valueOf(iHashCode2));
                            c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                        }
                        y7.n(c0VarD2, a0VarN1112, aVar11117.f());
                        c0VarR.E(881566524);
                        if (z10) {
                            ei.D(onDeleteClick, null, false, null, null, null, composableSingletons$PreviewTopBarKt.m614getLambda2$intercom_sdk_ui_release(), c0VarR, ((i21 >> 15) & 14) | 1572864, 62);
                        }
                        c0VarR.A();
                        c0VarR.E(881579446);
                        if (z15) {
                            ei.D(function2, null, false, null, null, null, composableSingletons$PreviewTopBarKt.m615getLambda3$intercom_sdk_ui_release(), c0VarR, ((i21 >> 18) & 14) | 1572864, 62);
                        }
                        Function0<Unit> function112 = function2;
                        c0VarR.A();
                        c0VarR.E(881592201);
                        if (z16) {
                            function4 = function3;
                            ei.D(function4, null, false, null, null, null, composableSingletons$PreviewTopBarKt.m616getLambda4$intercom_sdk_ui_release(), c0VarR, ((i21 >> 21) & 14) | 1572864, 62);
                        } else {
                            function4 = function3;
                        }
                        c0VarR.A();
                        c0VarR.o();
                        c0VarR.o();
                        function5 = function112;
                        function6 = function4;
                        z17 = z15;
                        z14 = z16;
                        a0Var2 = a0Var117;
                    } else {
                        if (i22 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var2;
                        }
                        if (i23 != 0) {
                            z15 = false;
                        } else {
                            z15 = z13;
                        }
                        if (i13 != 0) {
                            z16 = false;
                        } else {
                            z16 = z14;
                        }
                        if (i17 != 0) {
                            function2 = new Function0() { // from class: io.intercom.android.sdk.ui.preview.ui.x
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.f312394a;
                                }
                            };
                        }
                        if (i19 != 0) {
                            function3 = new Function0() { // from class: io.intercom.android.sdk.ui.preview.ui.y
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Unit.f312394a;
                                }
                            };
                        } else {
                            function3 = function1;
                        }
                        androidx.compose.ui.a0 a0VarD17 = androidx.compose.foundation.v.d(i6.F(i6.h(a0Var3, 0.0f, 1, null), null, false, 3, null), q0.w(q0.f38131b.a(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
                        androidx.compose.ui.e.a aVar11119 = androidx.compose.ui.e.f37317a;
                        androidx.compose.ui.e.c cVarQ1113 = aVar11119.q();
                        androidx.compose.foundation.layout.q qVar17 = androidx.compose.foundation.layout.q.f16330a;
                        a1 a1VarE1113 = u5.e(qVar17.s(), cVarQ1113, c0VarR, 54);
                        iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        b1 b1VarK1113 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN1113 = androidx.compose.ui.m.n(c0VarR, a0VarD17);
                        androidx.compose.ui.node.g.a aVar111110 = androidx.compose.ui.node.g.I;
                        function0A = aVar111110.a();
                        if (c0VarR.S() == null) {
                            androidx.compose.runtime.v.r();
                        }
                        c0VarR.q();
                        if (c0VarR.P()) {
                            c0VarR.q0(function0A);
                        } else {
                            c0VarR.l();
                        }
                        c0VarD = y7.d(c0VarR);
                        y7.n(c0VarD, a1VarE1113, aVar111110.e());
                        y7.n(c0VarD, b1VarK1113, aVar111110.g());
                        function2B = aVar111110.b();
                        if (c0VarD.P()) {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        } else {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        }
                        y7.n(c0VarD, a0VarN1113, aVar111110.f());
                        y5 y5Var17 = y5.f16577a;
                        composableSingletons$PreviewTopBarKt = ComposableSingletons$PreviewTopBarKt.INSTANCE;
                        androidx.compose.ui.a0 a0Var118 = a0Var3;
                        ei.D(onBackCLick, null, false, null, null, null, composableSingletons$PreviewTopBarKt.m613getLambda1$intercom_sdk_ui_release(), c0VarR, ((i21 >> 12) & 14) | 1572864, 62);
                        androidx.compose.ui.e.c cVarQ1114 = aVar11119.q();
                        androidx.compose.ui.a0.a aVar111111 = androidx.compose.ui.a0.E;
                        a1 a1VarE1114 = u5.e(qVar17.w(), cVarQ1114, c0VarR, 48);
                        iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        b1 b1VarK1114 = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN1114 = androidx.compose.ui.m.n(c0VarR, aVar111111);
                        function0A2 = aVar111110.a();
                        if (c0VarR.S() == null) {
                            androidx.compose.runtime.v.r();
                        }
                        c0VarR.q();
                        if (c0VarR.P()) {
                            c0VarR.q0(function0A2);
                        } else {
                            c0VarR.l();
                        }
                        c0VarD2 = y7.d(c0VarR);
                        y7.n(c0VarD2, a1VarE1114, aVar111110.e());
                        y7.n(c0VarD2, b1VarK1114, aVar111110.g());
                        function2B2 = aVar111110.b();
                        if (c0VarD2.P()) {
                            c0VarD2.Y(Integer.valueOf(iHashCode2));
                            c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                        } else {
                            c0VarD2.Y(Integer.valueOf(iHashCode2));
                            c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                        }
                        y7.n(c0VarD2, a0VarN1114, aVar111110.f());
                        c0VarR.E(881566524);
                        if (z10) {
                            ei.D(onDeleteClick, null, false, null, null, null, composableSingletons$PreviewTopBarKt.m614getLambda2$intercom_sdk_ui_release(), c0VarR, ((i21 >> 15) & 14) | 1572864, 62);
                        }
                        c0VarR.A();
                        c0VarR.E(881579446);
                        if (z15) {
                            ei.D(function2, null, false, null, null, null, composableSingletons$PreviewTopBarKt.m615getLambda3$intercom_sdk_ui_release(), c0VarR, ((i21 >> 18) & 14) | 1572864, 62);
                        }
                        Function0<Unit> function113 = function2;
                        c0VarR.A();
                        c0VarR.E(881592201);
                        if (z16) {
                            function4 = function3;
                            ei.D(function4, null, false, null, null, null, composableSingletons$PreviewTopBarKt.m616getLambda4$intercom_sdk_ui_release(), c0VarR, ((i21 >> 21) & 14) | 1572864, 62);
                        } else {
                            function4 = function3;
                        }
                        c0VarR.A();
                        c0VarR.o();
                        c0VarR.o();
                        function5 = function113;
                        function6 = function4;
                        z17 = z15;
                        z14 = z16;
                        a0Var2 = a0Var118;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        final androidx.compose.ui.a0 a0Var119 = a0Var2;
                        final boolean z116 = z14;
                        s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.ui.preview.ui.z
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return PreviewTopBarKt.PreviewTopBar$lambda$4(a0Var119, z10, z17, z116, onBackCLick, onDeleteClick, function5, function6, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 1572864;
                function2 = function0;
                i19 = i11 & 128;
                if (i19 != 0) {
                    i12 |= 12582912;
                } else if ((i10 & 29360128) == 0) {
                    if (c0VarR.k0(function1)) {
                        i20 = 8388608;
                    } else {
                        i20 = 4194304;
                    }
                    i12 |= i20;
                }
                i21 = i12;
                if ((i21 & 23967451) == 4793490) {
                    if (i22 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if (i23 != 0) {
                        z15 = false;
                    } else {
                        z15 = z13;
                    }
                    if (i13 != 0) {
                        z16 = false;
                    } else {
                        z16 = z14;
                    }
                    if (i17 != 0) {
                        function2 = new Function0() { // from class: io.intercom.android.sdk.ui.preview.ui.x
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.f312394a;
                            }
                        };
                    }
                    if (i19 != 0) {
                        function3 = new Function0() { // from class: io.intercom.android.sdk.ui.preview.ui.y
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.f312394a;
                            }
                        };
                    } else {
                        function3 = function1;
                    }
                    androidx.compose.ui.a0 a0VarD18 = androidx.compose.foundation.v.d(i6.F(i6.h(a0Var3, 0.0f, 1, null), null, false, 3, null), q0.w(q0.f38131b.a(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
                    androidx.compose.ui.e.a aVar111112 = androidx.compose.ui.e.f37317a;
                    androidx.compose.ui.e.c cVarQ1115 = aVar111112.q();
                    androidx.compose.foundation.layout.q qVar18 = androidx.compose.foundation.layout.q.f16330a;
                    a1 a1VarE1115 = u5.e(qVar18.s(), cVarQ1115, c0VarR, 54);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK1115 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN1115 = androidx.compose.ui.m.n(c0VarR, a0VarD18);
                    androidx.compose.ui.node.g.a aVar111113 = androidx.compose.ui.node.g.I;
                    function0A = aVar111113.a();
                    if (c0VarR.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0VarR.q();
                    if (c0VarR.P()) {
                        c0VarR.q0(function0A);
                    } else {
                        c0VarR.l();
                    }
                    c0VarD = y7.d(c0VarR);
                    y7.n(c0VarD, a1VarE1115, aVar111113.e());
                    y7.n(c0VarD, b1VarK1115, aVar111113.g());
                    function2B = aVar111113.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN1115, aVar111113.f());
                    y5 y5Var18 = y5.f16577a;
                    composableSingletons$PreviewTopBarKt = ComposableSingletons$PreviewTopBarKt.INSTANCE;
                    androidx.compose.ui.a0 a0Var1110 = a0Var3;
                    ei.D(onBackCLick, null, false, null, null, null, composableSingletons$PreviewTopBarKt.m613getLambda1$intercom_sdk_ui_release(), c0VarR, ((i21 >> 12) & 14) | 1572864, 62);
                    androidx.compose.ui.e.c cVarQ1116 = aVar111112.q();
                    androidx.compose.ui.a0.a aVar111114 = androidx.compose.ui.a0.E;
                    a1 a1VarE1116 = u5.e(qVar18.w(), cVarQ1116, c0VarR, 48);
                    iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK1116 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN1116 = androidx.compose.ui.m.n(c0VarR, aVar111114);
                    function0A2 = aVar111113.a();
                    if (c0VarR.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0VarR.q();
                    if (c0VarR.P()) {
                        c0VarR.q0(function0A2);
                    } else {
                        c0VarR.l();
                    }
                    c0VarD2 = y7.d(c0VarR);
                    y7.n(c0VarD2, a1VarE1116, aVar111113.e());
                    y7.n(c0VarD2, b1VarK1116, aVar111113.g());
                    function2B2 = aVar111113.b();
                    if (c0VarD2.P()) {
                        c0VarD2.Y(Integer.valueOf(iHashCode2));
                        c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                    } else {
                        c0VarD2.Y(Integer.valueOf(iHashCode2));
                        c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                    }
                    y7.n(c0VarD2, a0VarN1116, aVar111113.f());
                    c0VarR.E(881566524);
                    if (z10) {
                        ei.D(onDeleteClick, null, false, null, null, null, composableSingletons$PreviewTopBarKt.m614getLambda2$intercom_sdk_ui_release(), c0VarR, ((i21 >> 15) & 14) | 1572864, 62);
                    }
                    c0VarR.A();
                    c0VarR.E(881579446);
                    if (z15) {
                        ei.D(function2, null, false, null, null, null, composableSingletons$PreviewTopBarKt.m615getLambda3$intercom_sdk_ui_release(), c0VarR, ((i21 >> 18) & 14) | 1572864, 62);
                    }
                    Function0<Unit> function114 = function2;
                    c0VarR.A();
                    c0VarR.E(881592201);
                    if (z16) {
                        function4 = function3;
                        ei.D(function4, null, false, null, null, null, composableSingletons$PreviewTopBarKt.m616getLambda4$intercom_sdk_ui_release(), c0VarR, ((i21 >> 21) & 14) | 1572864, 62);
                    } else {
                        function4 = function3;
                    }
                    c0VarR.A();
                    c0VarR.o();
                    c0VarR.o();
                    function5 = function114;
                    function6 = function4;
                    z17 = z15;
                    z14 = z16;
                    a0Var2 = a0Var1110;
                } else {
                    if (i22 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if (i23 != 0) {
                        z15 = false;
                    } else {
                        z15 = z13;
                    }
                    if (i13 != 0) {
                        z16 = false;
                    } else {
                        z16 = z14;
                    }
                    if (i17 != 0) {
                        function2 = new Function0() { // from class: io.intercom.android.sdk.ui.preview.ui.x
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.f312394a;
                            }
                        };
                    }
                    if (i19 != 0) {
                        function3 = new Function0() { // from class: io.intercom.android.sdk.ui.preview.ui.y
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.f312394a;
                            }
                        };
                    } else {
                        function3 = function1;
                    }
                    androidx.compose.ui.a0 a0VarD19 = androidx.compose.foundation.v.d(i6.F(i6.h(a0Var3, 0.0f, 1, null), null, false, 3, null), q0.w(q0.f38131b.a(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
                    androidx.compose.ui.e.a aVar111115 = androidx.compose.ui.e.f37317a;
                    androidx.compose.ui.e.c cVarQ1117 = aVar111115.q();
                    androidx.compose.foundation.layout.q qVar19 = androidx.compose.foundation.layout.q.f16330a;
                    a1 a1VarE1117 = u5.e(qVar19.s(), cVarQ1117, c0VarR, 54);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK1117 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN1117 = androidx.compose.ui.m.n(c0VarR, a0VarD19);
                    androidx.compose.ui.node.g.a aVar111116 = androidx.compose.ui.node.g.I;
                    function0A = aVar111116.a();
                    if (c0VarR.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0VarR.q();
                    if (c0VarR.P()) {
                        c0VarR.q0(function0A);
                    } else {
                        c0VarR.l();
                    }
                    c0VarD = y7.d(c0VarR);
                    y7.n(c0VarD, a1VarE1117, aVar111116.e());
                    y7.n(c0VarD, b1VarK1117, aVar111116.g());
                    function2B = aVar111116.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN1117, aVar111116.f());
                    y5 y5Var19 = y5.f16577a;
                    composableSingletons$PreviewTopBarKt = ComposableSingletons$PreviewTopBarKt.INSTANCE;
                    androidx.compose.ui.a0 a0Var1111 = a0Var3;
                    ei.D(onBackCLick, null, false, null, null, null, composableSingletons$PreviewTopBarKt.m613getLambda1$intercom_sdk_ui_release(), c0VarR, ((i21 >> 12) & 14) | 1572864, 62);
                    androidx.compose.ui.e.c cVarQ1118 = aVar111115.q();
                    androidx.compose.ui.a0.a aVar111117 = androidx.compose.ui.a0.E;
                    a1 a1VarE1118 = u5.e(qVar19.w(), cVarQ1118, c0VarR, 48);
                    iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK1118 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN1118 = androidx.compose.ui.m.n(c0VarR, aVar111117);
                    function0A2 = aVar111116.a();
                    if (c0VarR.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0VarR.q();
                    if (c0VarR.P()) {
                        c0VarR.q0(function0A2);
                    } else {
                        c0VarR.l();
                    }
                    c0VarD2 = y7.d(c0VarR);
                    y7.n(c0VarD2, a1VarE1118, aVar111116.e());
                    y7.n(c0VarD2, b1VarK1118, aVar111116.g());
                    function2B2 = aVar111116.b();
                    if (c0VarD2.P()) {
                        c0VarD2.Y(Integer.valueOf(iHashCode2));
                        c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                    } else {
                        c0VarD2.Y(Integer.valueOf(iHashCode2));
                        c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                    }
                    y7.n(c0VarD2, a0VarN1118, aVar111116.f());
                    c0VarR.E(881566524);
                    if (z10) {
                        ei.D(onDeleteClick, null, false, null, null, null, composableSingletons$PreviewTopBarKt.m614getLambda2$intercom_sdk_ui_release(), c0VarR, ((i21 >> 15) & 14) | 1572864, 62);
                    }
                    c0VarR.A();
                    c0VarR.E(881579446);
                    if (z15) {
                        ei.D(function2, null, false, null, null, null, composableSingletons$PreviewTopBarKt.m615getLambda3$intercom_sdk_ui_release(), c0VarR, ((i21 >> 18) & 14) | 1572864, 62);
                    }
                    Function0<Unit> function115 = function2;
                    c0VarR.A();
                    c0VarR.E(881592201);
                    if (z16) {
                        function4 = function3;
                        ei.D(function4, null, false, null, null, null, composableSingletons$PreviewTopBarKt.m616getLambda4$intercom_sdk_ui_release(), c0VarR, ((i21 >> 21) & 14) | 1572864, 62);
                    } else {
                        function4 = function3;
                    }
                    c0VarR.A();
                    c0VarR.o();
                    c0VarR.o();
                    function5 = function115;
                    function6 = function4;
                    z17 = z15;
                    z14 = z16;
                    a0Var2 = a0Var1111;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    final androidx.compose.ui.a0 a0Var1112 = a0Var2;
                    final boolean z117 = z14;
                    s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.ui.preview.ui.z
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return PreviewTopBarKt.PreviewTopBar$lambda$4(a0Var1112, z10, z17, z117, onBackCLick, onDeleteClick, function5, function6, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i16 = androidx.profileinstaller.n.c.f73814m;
            i12 |= i16;
            i17 = i11 & 64;
            if (i17 != 0) {
                if ((3670016 & i10) == 0) {
                    function2 = function0;
                    if (c0VarR.k0(function2)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i12 |= i18;
                }
                i19 = i11 & 128;
                if (i19 != 0) {
                    i12 |= 12582912;
                } else if ((i10 & 29360128) == 0) {
                    if (c0VarR.k0(function1)) {
                        i20 = 8388608;
                    } else {
                        i20 = 4194304;
                    }
                    i12 |= i20;
                }
                i21 = i12;
                if ((i21 & 23967451) == 4793490) {
                    if (i22 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if (i23 != 0) {
                        z15 = false;
                    } else {
                        z15 = z13;
                    }
                    if (i13 != 0) {
                        z16 = false;
                    } else {
                        z16 = z14;
                    }
                    if (i17 != 0) {
                        function2 = new Function0() { // from class: io.intercom.android.sdk.ui.preview.ui.x
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.f312394a;
                            }
                        };
                    }
                    if (i19 != 0) {
                        function3 = new Function0() { // from class: io.intercom.android.sdk.ui.preview.ui.y
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.f312394a;
                            }
                        };
                    } else {
                        function3 = function1;
                    }
                    androidx.compose.ui.a0 a0VarD110 = androidx.compose.foundation.v.d(i6.F(i6.h(a0Var3, 0.0f, 1, null), null, false, 3, null), q0.w(q0.f38131b.a(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
                    androidx.compose.ui.e.a aVar111118 = androidx.compose.ui.e.f37317a;
                    androidx.compose.ui.e.c cVarQ1119 = aVar111118.q();
                    androidx.compose.foundation.layout.q qVar110 = androidx.compose.foundation.layout.q.f16330a;
                    a1 a1VarE1119 = u5.e(qVar110.s(), cVarQ1119, c0VarR, 54);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK1119 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN1119 = androidx.compose.ui.m.n(c0VarR, a0VarD110);
                    androidx.compose.ui.node.g.a aVar111119 = androidx.compose.ui.node.g.I;
                    function0A = aVar111119.a();
                    if (c0VarR.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0VarR.q();
                    if (c0VarR.P()) {
                        c0VarR.q0(function0A);
                    } else {
                        c0VarR.l();
                    }
                    c0VarD = y7.d(c0VarR);
                    y7.n(c0VarD, a1VarE1119, aVar111119.e());
                    y7.n(c0VarD, b1VarK1119, aVar111119.g());
                    function2B = aVar111119.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN1119, aVar111119.f());
                    y5 y5Var110 = y5.f16577a;
                    composableSingletons$PreviewTopBarKt = ComposableSingletons$PreviewTopBarKt.INSTANCE;
                    androidx.compose.ui.a0 a0Var1113 = a0Var3;
                    ei.D(onBackCLick, null, false, null, null, null, composableSingletons$PreviewTopBarKt.m613getLambda1$intercom_sdk_ui_release(), c0VarR, ((i21 >> 12) & 14) | 1572864, 62);
                    androidx.compose.ui.e.c cVarQ11110 = aVar111118.q();
                    androidx.compose.ui.a0.a aVar1111110 = androidx.compose.ui.a0.E;
                    a1 a1VarE11110 = u5.e(qVar110.w(), cVarQ11110, c0VarR, 48);
                    iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK11110 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN11110 = androidx.compose.ui.m.n(c0VarR, aVar1111110);
                    function0A2 = aVar111119.a();
                    if (c0VarR.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0VarR.q();
                    if (c0VarR.P()) {
                        c0VarR.q0(function0A2);
                    } else {
                        c0VarR.l();
                    }
                    c0VarD2 = y7.d(c0VarR);
                    y7.n(c0VarD2, a1VarE11110, aVar111119.e());
                    y7.n(c0VarD2, b1VarK11110, aVar111119.g());
                    function2B2 = aVar111119.b();
                    if (c0VarD2.P()) {
                        c0VarD2.Y(Integer.valueOf(iHashCode2));
                        c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                    } else {
                        c0VarD2.Y(Integer.valueOf(iHashCode2));
                        c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                    }
                    y7.n(c0VarD2, a0VarN11110, aVar111119.f());
                    c0VarR.E(881566524);
                    if (z10) {
                        ei.D(onDeleteClick, null, false, null, null, null, composableSingletons$PreviewTopBarKt.m614getLambda2$intercom_sdk_ui_release(), c0VarR, ((i21 >> 15) & 14) | 1572864, 62);
                    }
                    c0VarR.A();
                    c0VarR.E(881579446);
                    if (z15) {
                        ei.D(function2, null, false, null, null, null, composableSingletons$PreviewTopBarKt.m615getLambda3$intercom_sdk_ui_release(), c0VarR, ((i21 >> 18) & 14) | 1572864, 62);
                    }
                    Function0<Unit> function116 = function2;
                    c0VarR.A();
                    c0VarR.E(881592201);
                    if (z16) {
                        function4 = function3;
                        ei.D(function4, null, false, null, null, null, composableSingletons$PreviewTopBarKt.m616getLambda4$intercom_sdk_ui_release(), c0VarR, ((i21 >> 21) & 14) | 1572864, 62);
                    } else {
                        function4 = function3;
                    }
                    c0VarR.A();
                    c0VarR.o();
                    c0VarR.o();
                    function5 = function116;
                    function6 = function4;
                    z17 = z15;
                    z14 = z16;
                    a0Var2 = a0Var1113;
                } else {
                    if (i22 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if (i23 != 0) {
                        z15 = false;
                    } else {
                        z15 = z13;
                    }
                    if (i13 != 0) {
                        z16 = false;
                    } else {
                        z16 = z14;
                    }
                    if (i17 != 0) {
                        function2 = new Function0() { // from class: io.intercom.android.sdk.ui.preview.ui.x
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.f312394a;
                            }
                        };
                    }
                    if (i19 != 0) {
                        function3 = new Function0() { // from class: io.intercom.android.sdk.ui.preview.ui.y
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.f312394a;
                            }
                        };
                    } else {
                        function3 = function1;
                    }
                    androidx.compose.ui.a0 a0VarD111 = androidx.compose.foundation.v.d(i6.F(i6.h(a0Var3, 0.0f, 1, null), null, false, 3, null), q0.w(q0.f38131b.a(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
                    androidx.compose.ui.e.a aVar1111111 = androidx.compose.ui.e.f37317a;
                    androidx.compose.ui.e.c cVarQ11111 = aVar1111111.q();
                    androidx.compose.foundation.layout.q qVar111 = androidx.compose.foundation.layout.q.f16330a;
                    a1 a1VarE11111 = u5.e(qVar111.s(), cVarQ11111, c0VarR, 54);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK11111 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN11111 = androidx.compose.ui.m.n(c0VarR, a0VarD111);
                    androidx.compose.ui.node.g.a aVar1111112 = androidx.compose.ui.node.g.I;
                    function0A = aVar1111112.a();
                    if (c0VarR.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0VarR.q();
                    if (c0VarR.P()) {
                        c0VarR.q0(function0A);
                    } else {
                        c0VarR.l();
                    }
                    c0VarD = y7.d(c0VarR);
                    y7.n(c0VarD, a1VarE11111, aVar1111112.e());
                    y7.n(c0VarD, b1VarK11111, aVar1111112.g());
                    function2B = aVar1111112.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN11111, aVar1111112.f());
                    y5 y5Var111 = y5.f16577a;
                    composableSingletons$PreviewTopBarKt = ComposableSingletons$PreviewTopBarKt.INSTANCE;
                    androidx.compose.ui.a0 a0Var1114 = a0Var3;
                    ei.D(onBackCLick, null, false, null, null, null, composableSingletons$PreviewTopBarKt.m613getLambda1$intercom_sdk_ui_release(), c0VarR, ((i21 >> 12) & 14) | 1572864, 62);
                    androidx.compose.ui.e.c cVarQ11112 = aVar1111111.q();
                    androidx.compose.ui.a0.a aVar1111113 = androidx.compose.ui.a0.E;
                    a1 a1VarE11112 = u5.e(qVar111.w(), cVarQ11112, c0VarR, 48);
                    iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK11112 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN11112 = androidx.compose.ui.m.n(c0VarR, aVar1111113);
                    function0A2 = aVar1111112.a();
                    if (c0VarR.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0VarR.q();
                    if (c0VarR.P()) {
                        c0VarR.q0(function0A2);
                    } else {
                        c0VarR.l();
                    }
                    c0VarD2 = y7.d(c0VarR);
                    y7.n(c0VarD2, a1VarE11112, aVar1111112.e());
                    y7.n(c0VarD2, b1VarK11112, aVar1111112.g());
                    function2B2 = aVar1111112.b();
                    if (c0VarD2.P()) {
                        c0VarD2.Y(Integer.valueOf(iHashCode2));
                        c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                    } else {
                        c0VarD2.Y(Integer.valueOf(iHashCode2));
                        c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                    }
                    y7.n(c0VarD2, a0VarN11112, aVar1111112.f());
                    c0VarR.E(881566524);
                    if (z10) {
                        ei.D(onDeleteClick, null, false, null, null, null, composableSingletons$PreviewTopBarKt.m614getLambda2$intercom_sdk_ui_release(), c0VarR, ((i21 >> 15) & 14) | 1572864, 62);
                    }
                    c0VarR.A();
                    c0VarR.E(881579446);
                    if (z15) {
                        ei.D(function2, null, false, null, null, null, composableSingletons$PreviewTopBarKt.m615getLambda3$intercom_sdk_ui_release(), c0VarR, ((i21 >> 18) & 14) | 1572864, 62);
                    }
                    Function0<Unit> function117 = function2;
                    c0VarR.A();
                    c0VarR.E(881592201);
                    if (z16) {
                        function4 = function3;
                        ei.D(function4, null, false, null, null, null, composableSingletons$PreviewTopBarKt.m616getLambda4$intercom_sdk_ui_release(), c0VarR, ((i21 >> 21) & 14) | 1572864, 62);
                    } else {
                        function4 = function3;
                    }
                    c0VarR.A();
                    c0VarR.o();
                    c0VarR.o();
                    function5 = function117;
                    function6 = function4;
                    z17 = z15;
                    z14 = z16;
                    a0Var2 = a0Var1114;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    final androidx.compose.ui.a0 a0Var1115 = a0Var2;
                    final boolean z118 = z14;
                    s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.ui.preview.ui.z
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return PreviewTopBarKt.PreviewTopBar$lambda$4(a0Var1115, z10, z17, z118, onBackCLick, onDeleteClick, function5, function6, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 1572864;
            function2 = function0;
            i19 = i11 & 128;
            if (i19 != 0) {
                i12 |= 12582912;
            } else if ((i10 & 29360128) == 0) {
                if (c0VarR.k0(function1)) {
                    i20 = 8388608;
                } else {
                    i20 = 4194304;
                }
                i12 |= i20;
            }
            i21 = i12;
            if ((i21 & 23967451) == 4793490) {
                if (i22 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if (i23 != 0) {
                    z15 = false;
                } else {
                    z15 = z13;
                }
                if (i13 != 0) {
                    z16 = false;
                } else {
                    z16 = z14;
                }
                if (i17 != 0) {
                    function2 = new Function0() { // from class: io.intercom.android.sdk.ui.preview.ui.x
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.f312394a;
                        }
                    };
                }
                if (i19 != 0) {
                    function3 = new Function0() { // from class: io.intercom.android.sdk.ui.preview.ui.y
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.f312394a;
                        }
                    };
                } else {
                    function3 = function1;
                }
                androidx.compose.ui.a0 a0VarD112 = androidx.compose.foundation.v.d(i6.F(i6.h(a0Var3, 0.0f, 1, null), null, false, 3, null), q0.w(q0.f38131b.a(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
                androidx.compose.ui.e.a aVar1111114 = androidx.compose.ui.e.f37317a;
                androidx.compose.ui.e.c cVarQ11113 = aVar1111114.q();
                androidx.compose.foundation.layout.q qVar112 = androidx.compose.foundation.layout.q.f16330a;
                a1 a1VarE11113 = u5.e(qVar112.s(), cVarQ11113, c0VarR, 54);
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK11113 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN11113 = androidx.compose.ui.m.n(c0VarR, a0VarD112);
                androidx.compose.ui.node.g.a aVar1111115 = androidx.compose.ui.node.g.I;
                function0A = aVar1111115.a();
                if (c0VarR.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0VarR.q();
                if (c0VarR.P()) {
                    c0VarR.q0(function0A);
                } else {
                    c0VarR.l();
                }
                c0VarD = y7.d(c0VarR);
                y7.n(c0VarD, a1VarE11113, aVar1111115.e());
                y7.n(c0VarD, b1VarK11113, aVar1111115.g());
                function2B = aVar1111115.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN11113, aVar1111115.f());
                y5 y5Var112 = y5.f16577a;
                composableSingletons$PreviewTopBarKt = ComposableSingletons$PreviewTopBarKt.INSTANCE;
                androidx.compose.ui.a0 a0Var1116 = a0Var3;
                ei.D(onBackCLick, null, false, null, null, null, composableSingletons$PreviewTopBarKt.m613getLambda1$intercom_sdk_ui_release(), c0VarR, ((i21 >> 12) & 14) | 1572864, 62);
                androidx.compose.ui.e.c cVarQ11114 = aVar1111114.q();
                androidx.compose.ui.a0.a aVar1111116 = androidx.compose.ui.a0.E;
                a1 a1VarE11114 = u5.e(qVar112.w(), cVarQ11114, c0VarR, 48);
                iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK11114 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN11114 = androidx.compose.ui.m.n(c0VarR, aVar1111116);
                function0A2 = aVar1111115.a();
                if (c0VarR.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0VarR.q();
                if (c0VarR.P()) {
                    c0VarR.q0(function0A2);
                } else {
                    c0VarR.l();
                }
                c0VarD2 = y7.d(c0VarR);
                y7.n(c0VarD2, a1VarE11114, aVar1111115.e());
                y7.n(c0VarD2, b1VarK11114, aVar1111115.g());
                function2B2 = aVar1111115.b();
                if (c0VarD2.P()) {
                    c0VarD2.Y(Integer.valueOf(iHashCode2));
                    c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                } else {
                    c0VarD2.Y(Integer.valueOf(iHashCode2));
                    c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                }
                y7.n(c0VarD2, a0VarN11114, aVar1111115.f());
                c0VarR.E(881566524);
                if (z10) {
                    ei.D(onDeleteClick, null, false, null, null, null, composableSingletons$PreviewTopBarKt.m614getLambda2$intercom_sdk_ui_release(), c0VarR, ((i21 >> 15) & 14) | 1572864, 62);
                }
                c0VarR.A();
                c0VarR.E(881579446);
                if (z15) {
                    ei.D(function2, null, false, null, null, null, composableSingletons$PreviewTopBarKt.m615getLambda3$intercom_sdk_ui_release(), c0VarR, ((i21 >> 18) & 14) | 1572864, 62);
                }
                Function0<Unit> function118 = function2;
                c0VarR.A();
                c0VarR.E(881592201);
                if (z16) {
                    function4 = function3;
                    ei.D(function4, null, false, null, null, null, composableSingletons$PreviewTopBarKt.m616getLambda4$intercom_sdk_ui_release(), c0VarR, ((i21 >> 21) & 14) | 1572864, 62);
                } else {
                    function4 = function3;
                }
                c0VarR.A();
                c0VarR.o();
                c0VarR.o();
                function5 = function118;
                function6 = function4;
                z17 = z15;
                z14 = z16;
                a0Var2 = a0Var1116;
            } else {
                if (i22 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if (i23 != 0) {
                    z15 = false;
                } else {
                    z15 = z13;
                }
                if (i13 != 0) {
                    z16 = false;
                } else {
                    z16 = z14;
                }
                if (i17 != 0) {
                    function2 = new Function0() { // from class: io.intercom.android.sdk.ui.preview.ui.x
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.f312394a;
                        }
                    };
                }
                if (i19 != 0) {
                    function3 = new Function0() { // from class: io.intercom.android.sdk.ui.preview.ui.y
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.f312394a;
                        }
                    };
                } else {
                    function3 = function1;
                }
                androidx.compose.ui.a0 a0VarD113 = androidx.compose.foundation.v.d(i6.F(i6.h(a0Var3, 0.0f, 1, null), null, false, 3, null), q0.w(q0.f38131b.a(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
                androidx.compose.ui.e.a aVar1111117 = androidx.compose.ui.e.f37317a;
                androidx.compose.ui.e.c cVarQ11115 = aVar1111117.q();
                androidx.compose.foundation.layout.q qVar113 = androidx.compose.foundation.layout.q.f16330a;
                a1 a1VarE11115 = u5.e(qVar113.s(), cVarQ11115, c0VarR, 54);
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK11115 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN11115 = androidx.compose.ui.m.n(c0VarR, a0VarD113);
                androidx.compose.ui.node.g.a aVar1111118 = androidx.compose.ui.node.g.I;
                function0A = aVar1111118.a();
                if (c0VarR.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0VarR.q();
                if (c0VarR.P()) {
                    c0VarR.q0(function0A);
                } else {
                    c0VarR.l();
                }
                c0VarD = y7.d(c0VarR);
                y7.n(c0VarD, a1VarE11115, aVar1111118.e());
                y7.n(c0VarD, b1VarK11115, aVar1111118.g());
                function2B = aVar1111118.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN11115, aVar1111118.f());
                y5 y5Var113 = y5.f16577a;
                composableSingletons$PreviewTopBarKt = ComposableSingletons$PreviewTopBarKt.INSTANCE;
                androidx.compose.ui.a0 a0Var1117 = a0Var3;
                ei.D(onBackCLick, null, false, null, null, null, composableSingletons$PreviewTopBarKt.m613getLambda1$intercom_sdk_ui_release(), c0VarR, ((i21 >> 12) & 14) | 1572864, 62);
                androidx.compose.ui.e.c cVarQ11116 = aVar1111117.q();
                androidx.compose.ui.a0.a aVar1111119 = androidx.compose.ui.a0.E;
                a1 a1VarE11116 = u5.e(qVar113.w(), cVarQ11116, c0VarR, 48);
                iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK11116 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN11116 = androidx.compose.ui.m.n(c0VarR, aVar1111119);
                function0A2 = aVar1111118.a();
                if (c0VarR.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0VarR.q();
                if (c0VarR.P()) {
                    c0VarR.q0(function0A2);
                } else {
                    c0VarR.l();
                }
                c0VarD2 = y7.d(c0VarR);
                y7.n(c0VarD2, a1VarE11116, aVar1111118.e());
                y7.n(c0VarD2, b1VarK11116, aVar1111118.g());
                function2B2 = aVar1111118.b();
                if (c0VarD2.P()) {
                    c0VarD2.Y(Integer.valueOf(iHashCode2));
                    c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                } else {
                    c0VarD2.Y(Integer.valueOf(iHashCode2));
                    c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                }
                y7.n(c0VarD2, a0VarN11116, aVar1111118.f());
                c0VarR.E(881566524);
                if (z10) {
                    ei.D(onDeleteClick, null, false, null, null, null, composableSingletons$PreviewTopBarKt.m614getLambda2$intercom_sdk_ui_release(), c0VarR, ((i21 >> 15) & 14) | 1572864, 62);
                }
                c0VarR.A();
                c0VarR.E(881579446);
                if (z15) {
                    ei.D(function2, null, false, null, null, null, composableSingletons$PreviewTopBarKt.m615getLambda3$intercom_sdk_ui_release(), c0VarR, ((i21 >> 18) & 14) | 1572864, 62);
                }
                Function0<Unit> function119 = function2;
                c0VarR.A();
                c0VarR.E(881592201);
                if (z16) {
                    function4 = function3;
                    ei.D(function4, null, false, null, null, null, composableSingletons$PreviewTopBarKt.m616getLambda4$intercom_sdk_ui_release(), c0VarR, ((i21 >> 21) & 14) | 1572864, 62);
                } else {
                    function4 = function3;
                }
                c0VarR.A();
                c0VarR.o();
                c0VarR.o();
                function5 = function119;
                function6 = function4;
                z17 = z15;
                z14 = z16;
                a0Var2 = a0Var1117;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                final androidx.compose.ui.a0 a0Var1118 = a0Var2;
                final boolean z119 = z14;
                s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.ui.preview.ui.z
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return PreviewTopBarKt.PreviewTopBar$lambda$4(a0Var1118, z10, z17, z119, onBackCLick, onDeleteClick, function5, function6, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 3072;
        z14 = z12;
        if ((i11 & 16) != 0) {
            i12 |= 24576;
        } else if ((57344 & i10) == 0) {
            if (c0VarR.k0(onBackCLick)) {
                i15 = 16384;
            } else {
                i15 = 8192;
            }
            i12 |= i15;
        }
        if ((i11 & 32) != 0) {
            if ((458752 & i10) == 0) {
                if (c0VarR.k0(onDeleteClick)) {
                    i16 = 131072;
                } else {
                    i16 = 65536;
                }
            }
            i17 = i11 & 64;
            if (i17 != 0) {
                if ((3670016 & i10) == 0) {
                    function2 = function0;
                    if (c0VarR.k0(function2)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i12 |= i18;
                }
                i19 = i11 & 128;
                if (i19 != 0) {
                    i12 |= 12582912;
                } else if ((i10 & 29360128) == 0) {
                    if (c0VarR.k0(function1)) {
                        i20 = 8388608;
                    } else {
                        i20 = 4194304;
                    }
                    i12 |= i20;
                }
                i21 = i12;
                if ((i21 & 23967451) == 4793490) {
                    if (i22 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if (i23 != 0) {
                        z15 = false;
                    } else {
                        z15 = z13;
                    }
                    if (i13 != 0) {
                        z16 = false;
                    } else {
                        z16 = z14;
                    }
                    if (i17 != 0) {
                        function2 = new Function0() { // from class: io.intercom.android.sdk.ui.preview.ui.x
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.f312394a;
                            }
                        };
                    }
                    if (i19 != 0) {
                        function3 = new Function0() { // from class: io.intercom.android.sdk.ui.preview.ui.y
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.f312394a;
                            }
                        };
                    } else {
                        function3 = function1;
                    }
                    androidx.compose.ui.a0 a0VarD114 = androidx.compose.foundation.v.d(i6.F(i6.h(a0Var3, 0.0f, 1, null), null, false, 3, null), q0.w(q0.f38131b.a(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
                    androidx.compose.ui.e.a aVar11111110 = androidx.compose.ui.e.f37317a;
                    androidx.compose.ui.e.c cVarQ11117 = aVar11111110.q();
                    androidx.compose.foundation.layout.q qVar114 = androidx.compose.foundation.layout.q.f16330a;
                    a1 a1VarE11117 = u5.e(qVar114.s(), cVarQ11117, c0VarR, 54);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK11117 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN11117 = androidx.compose.ui.m.n(c0VarR, a0VarD114);
                    androidx.compose.ui.node.g.a aVar11111111 = androidx.compose.ui.node.g.I;
                    function0A = aVar11111111.a();
                    if (c0VarR.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0VarR.q();
                    if (c0VarR.P()) {
                        c0VarR.q0(function0A);
                    } else {
                        c0VarR.l();
                    }
                    c0VarD = y7.d(c0VarR);
                    y7.n(c0VarD, a1VarE11117, aVar11111111.e());
                    y7.n(c0VarD, b1VarK11117, aVar11111111.g());
                    function2B = aVar11111111.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN11117, aVar11111111.f());
                    y5 y5Var114 = y5.f16577a;
                    composableSingletons$PreviewTopBarKt = ComposableSingletons$PreviewTopBarKt.INSTANCE;
                    androidx.compose.ui.a0 a0Var1119 = a0Var3;
                    ei.D(onBackCLick, null, false, null, null, null, composableSingletons$PreviewTopBarKt.m613getLambda1$intercom_sdk_ui_release(), c0VarR, ((i21 >> 12) & 14) | 1572864, 62);
                    androidx.compose.ui.e.c cVarQ11118 = aVar11111110.q();
                    androidx.compose.ui.a0.a aVar11111112 = androidx.compose.ui.a0.E;
                    a1 a1VarE11118 = u5.e(qVar114.w(), cVarQ11118, c0VarR, 48);
                    iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK11118 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN11118 = androidx.compose.ui.m.n(c0VarR, aVar11111112);
                    function0A2 = aVar11111111.a();
                    if (c0VarR.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0VarR.q();
                    if (c0VarR.P()) {
                        c0VarR.q0(function0A2);
                    } else {
                        c0VarR.l();
                    }
                    c0VarD2 = y7.d(c0VarR);
                    y7.n(c0VarD2, a1VarE11118, aVar11111111.e());
                    y7.n(c0VarD2, b1VarK11118, aVar11111111.g());
                    function2B2 = aVar11111111.b();
                    if (c0VarD2.P()) {
                        c0VarD2.Y(Integer.valueOf(iHashCode2));
                        c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                    } else {
                        c0VarD2.Y(Integer.valueOf(iHashCode2));
                        c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                    }
                    y7.n(c0VarD2, a0VarN11118, aVar11111111.f());
                    c0VarR.E(881566524);
                    if (z10) {
                        ei.D(onDeleteClick, null, false, null, null, null, composableSingletons$PreviewTopBarKt.m614getLambda2$intercom_sdk_ui_release(), c0VarR, ((i21 >> 15) & 14) | 1572864, 62);
                    }
                    c0VarR.A();
                    c0VarR.E(881579446);
                    if (z15) {
                        ei.D(function2, null, false, null, null, null, composableSingletons$PreviewTopBarKt.m615getLambda3$intercom_sdk_ui_release(), c0VarR, ((i21 >> 18) & 14) | 1572864, 62);
                    }
                    Function0<Unit> function1110 = function2;
                    c0VarR.A();
                    c0VarR.E(881592201);
                    if (z16) {
                        function4 = function3;
                        ei.D(function4, null, false, null, null, null, composableSingletons$PreviewTopBarKt.m616getLambda4$intercom_sdk_ui_release(), c0VarR, ((i21 >> 21) & 14) | 1572864, 62);
                    } else {
                        function4 = function3;
                    }
                    c0VarR.A();
                    c0VarR.o();
                    c0VarR.o();
                    function5 = function1110;
                    function6 = function4;
                    z17 = z15;
                    z14 = z16;
                    a0Var2 = a0Var1119;
                } else {
                    if (i22 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if (i23 != 0) {
                        z15 = false;
                    } else {
                        z15 = z13;
                    }
                    if (i13 != 0) {
                        z16 = false;
                    } else {
                        z16 = z14;
                    }
                    if (i17 != 0) {
                        function2 = new Function0() { // from class: io.intercom.android.sdk.ui.preview.ui.x
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.f312394a;
                            }
                        };
                    }
                    if (i19 != 0) {
                        function3 = new Function0() { // from class: io.intercom.android.sdk.ui.preview.ui.y
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Unit.f312394a;
                            }
                        };
                    } else {
                        function3 = function1;
                    }
                    androidx.compose.ui.a0 a0VarD115 = androidx.compose.foundation.v.d(i6.F(i6.h(a0Var3, 0.0f, 1, null), null, false, 3, null), q0.w(q0.f38131b.a(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
                    androidx.compose.ui.e.a aVar11111113 = androidx.compose.ui.e.f37317a;
                    androidx.compose.ui.e.c cVarQ11119 = aVar11111113.q();
                    androidx.compose.foundation.layout.q qVar115 = androidx.compose.foundation.layout.q.f16330a;
                    a1 a1VarE11119 = u5.e(qVar115.s(), cVarQ11119, c0VarR, 54);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK11119 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN11119 = androidx.compose.ui.m.n(c0VarR, a0VarD115);
                    androidx.compose.ui.node.g.a aVar11111114 = androidx.compose.ui.node.g.I;
                    function0A = aVar11111114.a();
                    if (c0VarR.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0VarR.q();
                    if (c0VarR.P()) {
                        c0VarR.q0(function0A);
                    } else {
                        c0VarR.l();
                    }
                    c0VarD = y7.d(c0VarR);
                    y7.n(c0VarD, a1VarE11119, aVar11111114.e());
                    y7.n(c0VarD, b1VarK11119, aVar11111114.g());
                    function2B = aVar11111114.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN11119, aVar11111114.f());
                    y5 y5Var115 = y5.f16577a;
                    composableSingletons$PreviewTopBarKt = ComposableSingletons$PreviewTopBarKt.INSTANCE;
                    androidx.compose.ui.a0 a0Var11110 = a0Var3;
                    ei.D(onBackCLick, null, false, null, null, null, composableSingletons$PreviewTopBarKt.m613getLambda1$intercom_sdk_ui_release(), c0VarR, ((i21 >> 12) & 14) | 1572864, 62);
                    androidx.compose.ui.e.c cVarQ111110 = aVar11111113.q();
                    androidx.compose.ui.a0.a aVar11111115 = androidx.compose.ui.a0.E;
                    a1 a1VarE111110 = u5.e(qVar115.w(), cVarQ111110, c0VarR, 48);
                    iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK111110 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN111110 = androidx.compose.ui.m.n(c0VarR, aVar11111115);
                    function0A2 = aVar11111114.a();
                    if (c0VarR.S() == null) {
                        androidx.compose.runtime.v.r();
                    }
                    c0VarR.q();
                    if (c0VarR.P()) {
                        c0VarR.q0(function0A2);
                    } else {
                        c0VarR.l();
                    }
                    c0VarD2 = y7.d(c0VarR);
                    y7.n(c0VarD2, a1VarE111110, aVar11111114.e());
                    y7.n(c0VarD2, b1VarK111110, aVar11111114.g());
                    function2B2 = aVar11111114.b();
                    if (c0VarD2.P()) {
                        c0VarD2.Y(Integer.valueOf(iHashCode2));
                        c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                    } else {
                        c0VarD2.Y(Integer.valueOf(iHashCode2));
                        c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                    }
                    y7.n(c0VarD2, a0VarN111110, aVar11111114.f());
                    c0VarR.E(881566524);
                    if (z10) {
                        ei.D(onDeleteClick, null, false, null, null, null, composableSingletons$PreviewTopBarKt.m614getLambda2$intercom_sdk_ui_release(), c0VarR, ((i21 >> 15) & 14) | 1572864, 62);
                    }
                    c0VarR.A();
                    c0VarR.E(881579446);
                    if (z15) {
                        ei.D(function2, null, false, null, null, null, composableSingletons$PreviewTopBarKt.m615getLambda3$intercom_sdk_ui_release(), c0VarR, ((i21 >> 18) & 14) | 1572864, 62);
                    }
                    Function0<Unit> function1111 = function2;
                    c0VarR.A();
                    c0VarR.E(881592201);
                    if (z16) {
                        function4 = function3;
                        ei.D(function4, null, false, null, null, null, composableSingletons$PreviewTopBarKt.m616getLambda4$intercom_sdk_ui_release(), c0VarR, ((i21 >> 21) & 14) | 1572864, 62);
                    } else {
                        function4 = function3;
                    }
                    c0VarR.A();
                    c0VarR.o();
                    c0VarR.o();
                    function5 = function1111;
                    function6 = function4;
                    z17 = z15;
                    z14 = z16;
                    a0Var2 = a0Var11110;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    final androidx.compose.ui.a0 a0Var11111 = a0Var2;
                    final boolean z1110 = z14;
                    s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.ui.preview.ui.z
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return PreviewTopBarKt.PreviewTopBar$lambda$4(a0Var11111, z10, z17, z1110, onBackCLick, onDeleteClick, function5, function6, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 1572864;
            function2 = function0;
            i19 = i11 & 128;
            if (i19 != 0) {
                i12 |= 12582912;
            } else if ((i10 & 29360128) == 0) {
                if (c0VarR.k0(function1)) {
                    i20 = 8388608;
                } else {
                    i20 = 4194304;
                }
                i12 |= i20;
            }
            i21 = i12;
            if ((i21 & 23967451) == 4793490) {
                if (i22 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if (i23 != 0) {
                    z15 = false;
                } else {
                    z15 = z13;
                }
                if (i13 != 0) {
                    z16 = false;
                } else {
                    z16 = z14;
                }
                if (i17 != 0) {
                    function2 = new Function0() { // from class: io.intercom.android.sdk.ui.preview.ui.x
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.f312394a;
                        }
                    };
                }
                if (i19 != 0) {
                    function3 = new Function0() { // from class: io.intercom.android.sdk.ui.preview.ui.y
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.f312394a;
                        }
                    };
                } else {
                    function3 = function1;
                }
                androidx.compose.ui.a0 a0VarD116 = androidx.compose.foundation.v.d(i6.F(i6.h(a0Var3, 0.0f, 1, null), null, false, 3, null), q0.w(q0.f38131b.a(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
                androidx.compose.ui.e.a aVar11111116 = androidx.compose.ui.e.f37317a;
                androidx.compose.ui.e.c cVarQ111111 = aVar11111116.q();
                androidx.compose.foundation.layout.q qVar116 = androidx.compose.foundation.layout.q.f16330a;
                a1 a1VarE111111 = u5.e(qVar116.s(), cVarQ111111, c0VarR, 54);
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK111111 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN111111 = androidx.compose.ui.m.n(c0VarR, a0VarD116);
                androidx.compose.ui.node.g.a aVar11111117 = androidx.compose.ui.node.g.I;
                function0A = aVar11111117.a();
                if (c0VarR.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0VarR.q();
                if (c0VarR.P()) {
                    c0VarR.q0(function0A);
                } else {
                    c0VarR.l();
                }
                c0VarD = y7.d(c0VarR);
                y7.n(c0VarD, a1VarE111111, aVar11111117.e());
                y7.n(c0VarD, b1VarK111111, aVar11111117.g());
                function2B = aVar11111117.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN111111, aVar11111117.f());
                y5 y5Var116 = y5.f16577a;
                composableSingletons$PreviewTopBarKt = ComposableSingletons$PreviewTopBarKt.INSTANCE;
                androidx.compose.ui.a0 a0Var11112 = a0Var3;
                ei.D(onBackCLick, null, false, null, null, null, composableSingletons$PreviewTopBarKt.m613getLambda1$intercom_sdk_ui_release(), c0VarR, ((i21 >> 12) & 14) | 1572864, 62);
                androidx.compose.ui.e.c cVarQ111112 = aVar11111116.q();
                androidx.compose.ui.a0.a aVar11111118 = androidx.compose.ui.a0.E;
                a1 a1VarE111112 = u5.e(qVar116.w(), cVarQ111112, c0VarR, 48);
                iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK111112 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN111112 = androidx.compose.ui.m.n(c0VarR, aVar11111118);
                function0A2 = aVar11111117.a();
                if (c0VarR.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0VarR.q();
                if (c0VarR.P()) {
                    c0VarR.q0(function0A2);
                } else {
                    c0VarR.l();
                }
                c0VarD2 = y7.d(c0VarR);
                y7.n(c0VarD2, a1VarE111112, aVar11111117.e());
                y7.n(c0VarD2, b1VarK111112, aVar11111117.g());
                function2B2 = aVar11111117.b();
                if (c0VarD2.P()) {
                    c0VarD2.Y(Integer.valueOf(iHashCode2));
                    c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                } else {
                    c0VarD2.Y(Integer.valueOf(iHashCode2));
                    c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                }
                y7.n(c0VarD2, a0VarN111112, aVar11111117.f());
                c0VarR.E(881566524);
                if (z10) {
                    ei.D(onDeleteClick, null, false, null, null, null, composableSingletons$PreviewTopBarKt.m614getLambda2$intercom_sdk_ui_release(), c0VarR, ((i21 >> 15) & 14) | 1572864, 62);
                }
                c0VarR.A();
                c0VarR.E(881579446);
                if (z15) {
                    ei.D(function2, null, false, null, null, null, composableSingletons$PreviewTopBarKt.m615getLambda3$intercom_sdk_ui_release(), c0VarR, ((i21 >> 18) & 14) | 1572864, 62);
                }
                Function0<Unit> function1112 = function2;
                c0VarR.A();
                c0VarR.E(881592201);
                if (z16) {
                    function4 = function3;
                    ei.D(function4, null, false, null, null, null, composableSingletons$PreviewTopBarKt.m616getLambda4$intercom_sdk_ui_release(), c0VarR, ((i21 >> 21) & 14) | 1572864, 62);
                } else {
                    function4 = function3;
                }
                c0VarR.A();
                c0VarR.o();
                c0VarR.o();
                function5 = function1112;
                function6 = function4;
                z17 = z15;
                z14 = z16;
                a0Var2 = a0Var11112;
            } else {
                if (i22 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if (i23 != 0) {
                    z15 = false;
                } else {
                    z15 = z13;
                }
                if (i13 != 0) {
                    z16 = false;
                } else {
                    z16 = z14;
                }
                if (i17 != 0) {
                    function2 = new Function0() { // from class: io.intercom.android.sdk.ui.preview.ui.x
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.f312394a;
                        }
                    };
                }
                if (i19 != 0) {
                    function3 = new Function0() { // from class: io.intercom.android.sdk.ui.preview.ui.y
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.f312394a;
                        }
                    };
                } else {
                    function3 = function1;
                }
                androidx.compose.ui.a0 a0VarD117 = androidx.compose.foundation.v.d(i6.F(i6.h(a0Var3, 0.0f, 1, null), null, false, 3, null), q0.w(q0.f38131b.a(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
                androidx.compose.ui.e.a aVar11111119 = androidx.compose.ui.e.f37317a;
                androidx.compose.ui.e.c cVarQ111113 = aVar11111119.q();
                androidx.compose.foundation.layout.q qVar117 = androidx.compose.foundation.layout.q.f16330a;
                a1 a1VarE111113 = u5.e(qVar117.s(), cVarQ111113, c0VarR, 54);
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK111113 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN111113 = androidx.compose.ui.m.n(c0VarR, a0VarD117);
                androidx.compose.ui.node.g.a aVar111111110 = androidx.compose.ui.node.g.I;
                function0A = aVar111111110.a();
                if (c0VarR.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0VarR.q();
                if (c0VarR.P()) {
                    c0VarR.q0(function0A);
                } else {
                    c0VarR.l();
                }
                c0VarD = y7.d(c0VarR);
                y7.n(c0VarD, a1VarE111113, aVar111111110.e());
                y7.n(c0VarD, b1VarK111113, aVar111111110.g());
                function2B = aVar111111110.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN111113, aVar111111110.f());
                y5 y5Var117 = y5.f16577a;
                composableSingletons$PreviewTopBarKt = ComposableSingletons$PreviewTopBarKt.INSTANCE;
                androidx.compose.ui.a0 a0Var11113 = a0Var3;
                ei.D(onBackCLick, null, false, null, null, null, composableSingletons$PreviewTopBarKt.m613getLambda1$intercom_sdk_ui_release(), c0VarR, ((i21 >> 12) & 14) | 1572864, 62);
                androidx.compose.ui.e.c cVarQ111114 = aVar11111119.q();
                androidx.compose.ui.a0.a aVar111111111 = androidx.compose.ui.a0.E;
                a1 a1VarE111114 = u5.e(qVar117.w(), cVarQ111114, c0VarR, 48);
                iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK111114 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN111114 = androidx.compose.ui.m.n(c0VarR, aVar111111111);
                function0A2 = aVar111111110.a();
                if (c0VarR.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0VarR.q();
                if (c0VarR.P()) {
                    c0VarR.q0(function0A2);
                } else {
                    c0VarR.l();
                }
                c0VarD2 = y7.d(c0VarR);
                y7.n(c0VarD2, a1VarE111114, aVar111111110.e());
                y7.n(c0VarD2, b1VarK111114, aVar111111110.g());
                function2B2 = aVar111111110.b();
                if (c0VarD2.P()) {
                    c0VarD2.Y(Integer.valueOf(iHashCode2));
                    c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                } else {
                    c0VarD2.Y(Integer.valueOf(iHashCode2));
                    c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                }
                y7.n(c0VarD2, a0VarN111114, aVar111111110.f());
                c0VarR.E(881566524);
                if (z10) {
                    ei.D(onDeleteClick, null, false, null, null, null, composableSingletons$PreviewTopBarKt.m614getLambda2$intercom_sdk_ui_release(), c0VarR, ((i21 >> 15) & 14) | 1572864, 62);
                }
                c0VarR.A();
                c0VarR.E(881579446);
                if (z15) {
                    ei.D(function2, null, false, null, null, null, composableSingletons$PreviewTopBarKt.m615getLambda3$intercom_sdk_ui_release(), c0VarR, ((i21 >> 18) & 14) | 1572864, 62);
                }
                Function0<Unit> function1113 = function2;
                c0VarR.A();
                c0VarR.E(881592201);
                if (z16) {
                    function4 = function3;
                    ei.D(function4, null, false, null, null, null, composableSingletons$PreviewTopBarKt.m616getLambda4$intercom_sdk_ui_release(), c0VarR, ((i21 >> 21) & 14) | 1572864, 62);
                } else {
                    function4 = function3;
                }
                c0VarR.A();
                c0VarR.o();
                c0VarR.o();
                function5 = function1113;
                function6 = function4;
                z17 = z15;
                z14 = z16;
                a0Var2 = a0Var11113;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                final androidx.compose.ui.a0 a0Var11114 = a0Var2;
                final boolean z1111 = z14;
                s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.ui.preview.ui.z
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return PreviewTopBarKt.PreviewTopBar$lambda$4(a0Var11114, z10, z17, z1111, onBackCLick, onDeleteClick, function5, function6, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i16 = androidx.profileinstaller.n.c.f73814m;
        i12 |= i16;
        i17 = i11 & 64;
        if (i17 != 0) {
            if ((3670016 & i10) == 0) {
                function2 = function0;
                if (c0VarR.k0(function2)) {
                    i18 = 1048576;
                } else {
                    i18 = 524288;
                }
                i12 |= i18;
            }
            i19 = i11 & 128;
            if (i19 != 0) {
                i12 |= 12582912;
            } else if ((i10 & 29360128) == 0) {
                if (c0VarR.k0(function1)) {
                    i20 = 8388608;
                } else {
                    i20 = 4194304;
                }
                i12 |= i20;
            }
            i21 = i12;
            if ((i21 & 23967451) == 4793490) {
                if (i22 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if (i23 != 0) {
                    z15 = false;
                } else {
                    z15 = z13;
                }
                if (i13 != 0) {
                    z16 = false;
                } else {
                    z16 = z14;
                }
                if (i17 != 0) {
                    function2 = new Function0() { // from class: io.intercom.android.sdk.ui.preview.ui.x
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.f312394a;
                        }
                    };
                }
                if (i19 != 0) {
                    function3 = new Function0() { // from class: io.intercom.android.sdk.ui.preview.ui.y
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.f312394a;
                        }
                    };
                } else {
                    function3 = function1;
                }
                androidx.compose.ui.a0 a0VarD118 = androidx.compose.foundation.v.d(i6.F(i6.h(a0Var3, 0.0f, 1, null), null, false, 3, null), q0.w(q0.f38131b.a(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
                androidx.compose.ui.e.a aVar111111112 = androidx.compose.ui.e.f37317a;
                androidx.compose.ui.e.c cVarQ111115 = aVar111111112.q();
                androidx.compose.foundation.layout.q qVar118 = androidx.compose.foundation.layout.q.f16330a;
                a1 a1VarE111115 = u5.e(qVar118.s(), cVarQ111115, c0VarR, 54);
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK111115 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN111115 = androidx.compose.ui.m.n(c0VarR, a0VarD118);
                androidx.compose.ui.node.g.a aVar111111113 = androidx.compose.ui.node.g.I;
                function0A = aVar111111113.a();
                if (c0VarR.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0VarR.q();
                if (c0VarR.P()) {
                    c0VarR.q0(function0A);
                } else {
                    c0VarR.l();
                }
                c0VarD = y7.d(c0VarR);
                y7.n(c0VarD, a1VarE111115, aVar111111113.e());
                y7.n(c0VarD, b1VarK111115, aVar111111113.g());
                function2B = aVar111111113.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN111115, aVar111111113.f());
                y5 y5Var118 = y5.f16577a;
                composableSingletons$PreviewTopBarKt = ComposableSingletons$PreviewTopBarKt.INSTANCE;
                androidx.compose.ui.a0 a0Var11115 = a0Var3;
                ei.D(onBackCLick, null, false, null, null, null, composableSingletons$PreviewTopBarKt.m613getLambda1$intercom_sdk_ui_release(), c0VarR, ((i21 >> 12) & 14) | 1572864, 62);
                androidx.compose.ui.e.c cVarQ111116 = aVar111111112.q();
                androidx.compose.ui.a0.a aVar111111114 = androidx.compose.ui.a0.E;
                a1 a1VarE111116 = u5.e(qVar118.w(), cVarQ111116, c0VarR, 48);
                iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK111116 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN111116 = androidx.compose.ui.m.n(c0VarR, aVar111111114);
                function0A2 = aVar111111113.a();
                if (c0VarR.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0VarR.q();
                if (c0VarR.P()) {
                    c0VarR.q0(function0A2);
                } else {
                    c0VarR.l();
                }
                c0VarD2 = y7.d(c0VarR);
                y7.n(c0VarD2, a1VarE111116, aVar111111113.e());
                y7.n(c0VarD2, b1VarK111116, aVar111111113.g());
                function2B2 = aVar111111113.b();
                if (c0VarD2.P()) {
                    c0VarD2.Y(Integer.valueOf(iHashCode2));
                    c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                } else {
                    c0VarD2.Y(Integer.valueOf(iHashCode2));
                    c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                }
                y7.n(c0VarD2, a0VarN111116, aVar111111113.f());
                c0VarR.E(881566524);
                if (z10) {
                    ei.D(onDeleteClick, null, false, null, null, null, composableSingletons$PreviewTopBarKt.m614getLambda2$intercom_sdk_ui_release(), c0VarR, ((i21 >> 15) & 14) | 1572864, 62);
                }
                c0VarR.A();
                c0VarR.E(881579446);
                if (z15) {
                    ei.D(function2, null, false, null, null, null, composableSingletons$PreviewTopBarKt.m615getLambda3$intercom_sdk_ui_release(), c0VarR, ((i21 >> 18) & 14) | 1572864, 62);
                }
                Function0<Unit> function1114 = function2;
                c0VarR.A();
                c0VarR.E(881592201);
                if (z16) {
                    function4 = function3;
                    ei.D(function4, null, false, null, null, null, composableSingletons$PreviewTopBarKt.m616getLambda4$intercom_sdk_ui_release(), c0VarR, ((i21 >> 21) & 14) | 1572864, 62);
                } else {
                    function4 = function3;
                }
                c0VarR.A();
                c0VarR.o();
                c0VarR.o();
                function5 = function1114;
                function6 = function4;
                z17 = z15;
                z14 = z16;
                a0Var2 = a0Var11115;
            } else {
                if (i22 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if (i23 != 0) {
                    z15 = false;
                } else {
                    z15 = z13;
                }
                if (i13 != 0) {
                    z16 = false;
                } else {
                    z16 = z14;
                }
                if (i17 != 0) {
                    function2 = new Function0() { // from class: io.intercom.android.sdk.ui.preview.ui.x
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.f312394a;
                        }
                    };
                }
                if (i19 != 0) {
                    function3 = new Function0() { // from class: io.intercom.android.sdk.ui.preview.ui.y
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Unit.f312394a;
                        }
                    };
                } else {
                    function3 = function1;
                }
                androidx.compose.ui.a0 a0VarD119 = androidx.compose.foundation.v.d(i6.F(i6.h(a0Var3, 0.0f, 1, null), null, false, 3, null), q0.w(q0.f38131b.a(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
                androidx.compose.ui.e.a aVar111111115 = androidx.compose.ui.e.f37317a;
                androidx.compose.ui.e.c cVarQ111117 = aVar111111115.q();
                androidx.compose.foundation.layout.q qVar119 = androidx.compose.foundation.layout.q.f16330a;
                a1 a1VarE111117 = u5.e(qVar119.s(), cVarQ111117, c0VarR, 54);
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK111117 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN111117 = androidx.compose.ui.m.n(c0VarR, a0VarD119);
                androidx.compose.ui.node.g.a aVar111111116 = androidx.compose.ui.node.g.I;
                function0A = aVar111111116.a();
                if (c0VarR.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0VarR.q();
                if (c0VarR.P()) {
                    c0VarR.q0(function0A);
                } else {
                    c0VarR.l();
                }
                c0VarD = y7.d(c0VarR);
                y7.n(c0VarD, a1VarE111117, aVar111111116.e());
                y7.n(c0VarD, b1VarK111117, aVar111111116.g());
                function2B = aVar111111116.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN111117, aVar111111116.f());
                y5 y5Var119 = y5.f16577a;
                composableSingletons$PreviewTopBarKt = ComposableSingletons$PreviewTopBarKt.INSTANCE;
                androidx.compose.ui.a0 a0Var11116 = a0Var3;
                ei.D(onBackCLick, null, false, null, null, null, composableSingletons$PreviewTopBarKt.m613getLambda1$intercom_sdk_ui_release(), c0VarR, ((i21 >> 12) & 14) | 1572864, 62);
                androidx.compose.ui.e.c cVarQ111118 = aVar111111115.q();
                androidx.compose.ui.a0.a aVar111111117 = androidx.compose.ui.a0.E;
                a1 a1VarE111118 = u5.e(qVar119.w(), cVarQ111118, c0VarR, 48);
                iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK111118 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN111118 = androidx.compose.ui.m.n(c0VarR, aVar111111117);
                function0A2 = aVar111111116.a();
                if (c0VarR.S() == null) {
                    androidx.compose.runtime.v.r();
                }
                c0VarR.q();
                if (c0VarR.P()) {
                    c0VarR.q0(function0A2);
                } else {
                    c0VarR.l();
                }
                c0VarD2 = y7.d(c0VarR);
                y7.n(c0VarD2, a1VarE111118, aVar111111116.e());
                y7.n(c0VarD2, b1VarK111118, aVar111111116.g());
                function2B2 = aVar111111116.b();
                if (c0VarD2.P()) {
                    c0VarD2.Y(Integer.valueOf(iHashCode2));
                    c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                } else {
                    c0VarD2.Y(Integer.valueOf(iHashCode2));
                    c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
                }
                y7.n(c0VarD2, a0VarN111118, aVar111111116.f());
                c0VarR.E(881566524);
                if (z10) {
                    ei.D(onDeleteClick, null, false, null, null, null, composableSingletons$PreviewTopBarKt.m614getLambda2$intercom_sdk_ui_release(), c0VarR, ((i21 >> 15) & 14) | 1572864, 62);
                }
                c0VarR.A();
                c0VarR.E(881579446);
                if (z15) {
                    ei.D(function2, null, false, null, null, null, composableSingletons$PreviewTopBarKt.m615getLambda3$intercom_sdk_ui_release(), c0VarR, ((i21 >> 18) & 14) | 1572864, 62);
                }
                Function0<Unit> function1115 = function2;
                c0VarR.A();
                c0VarR.E(881592201);
                if (z16) {
                    function4 = function3;
                    ei.D(function4, null, false, null, null, null, composableSingletons$PreviewTopBarKt.m616getLambda4$intercom_sdk_ui_release(), c0VarR, ((i21 >> 21) & 14) | 1572864, 62);
                } else {
                    function4 = function3;
                }
                c0VarR.A();
                c0VarR.o();
                c0VarR.o();
                function5 = function1115;
                function6 = function4;
                z17 = z15;
                z14 = z16;
                a0Var2 = a0Var11116;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                final androidx.compose.ui.a0 a0Var11117 = a0Var2;
                final boolean z1112 = z14;
                s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.ui.preview.ui.z
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return PreviewTopBarKt.PreviewTopBar$lambda$4(a0Var11117, z10, z17, z1112, onBackCLick, onDeleteClick, function5, function6, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 1572864;
        function2 = function0;
        i19 = i11 & 128;
        if (i19 != 0) {
            i12 |= 12582912;
        } else if ((i10 & 29360128) == 0) {
            if (c0VarR.k0(function1)) {
                i20 = 8388608;
            } else {
                i20 = 4194304;
            }
            i12 |= i20;
        }
        i21 = i12;
        if ((i21 & 23967451) == 4793490) {
            if (i22 != 0) {
                a0Var3 = androidx.compose.ui.a0.E;
            } else {
                a0Var3 = a0Var2;
            }
            if (i23 != 0) {
                z15 = false;
            } else {
                z15 = z13;
            }
            if (i13 != 0) {
                z16 = false;
            } else {
                z16 = z14;
            }
            if (i17 != 0) {
                function2 = new Function0() { // from class: io.intercom.android.sdk.ui.preview.ui.x
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.f312394a;
                    }
                };
            }
            if (i19 != 0) {
                function3 = new Function0() { // from class: io.intercom.android.sdk.ui.preview.ui.y
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.f312394a;
                    }
                };
            } else {
                function3 = function1;
            }
            androidx.compose.ui.a0 a0VarD1110 = androidx.compose.foundation.v.d(i6.F(i6.h(a0Var3, 0.0f, 1, null), null, false, 3, null), q0.w(q0.f38131b.a(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
            androidx.compose.ui.e.a aVar111111118 = androidx.compose.ui.e.f37317a;
            androidx.compose.ui.e.c cVarQ111119 = aVar111111118.q();
            androidx.compose.foundation.layout.q qVar1110 = androidx.compose.foundation.layout.q.f16330a;
            a1 a1VarE111119 = u5.e(qVar1110.s(), cVarQ111119, c0VarR, 54);
            iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            b1 b1VarK111119 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN111119 = androidx.compose.ui.m.n(c0VarR, a0VarD1110);
            androidx.compose.ui.node.g.a aVar111111119 = androidx.compose.ui.node.g.I;
            function0A = aVar111111119.a();
            if (c0VarR.S() == null) {
                androidx.compose.runtime.v.r();
            }
            c0VarR.q();
            if (c0VarR.P()) {
                c0VarR.q0(function0A);
            } else {
                c0VarR.l();
            }
            c0VarD = y7.d(c0VarR);
            y7.n(c0VarD, a1VarE111119, aVar111111119.e());
            y7.n(c0VarD, b1VarK111119, aVar111111119.g());
            function2B = aVar111111119.b();
            if (c0VarD.P()) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            } else {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            y7.n(c0VarD, a0VarN111119, aVar111111119.f());
            y5 y5Var1110 = y5.f16577a;
            composableSingletons$PreviewTopBarKt = ComposableSingletons$PreviewTopBarKt.INSTANCE;
            androidx.compose.ui.a0 a0Var11118 = a0Var3;
            ei.D(onBackCLick, null, false, null, null, null, composableSingletons$PreviewTopBarKt.m613getLambda1$intercom_sdk_ui_release(), c0VarR, ((i21 >> 12) & 14) | 1572864, 62);
            androidx.compose.ui.e.c cVarQ1111110 = aVar111111118.q();
            androidx.compose.ui.a0.a aVar1111111110 = androidx.compose.ui.a0.E;
            a1 a1VarE1111110 = u5.e(qVar1110.w(), cVarQ1111110, c0VarR, 48);
            iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            b1 b1VarK1111110 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN1111110 = androidx.compose.ui.m.n(c0VarR, aVar1111111110);
            function0A2 = aVar111111119.a();
            if (c0VarR.S() == null) {
                androidx.compose.runtime.v.r();
            }
            c0VarR.q();
            if (c0VarR.P()) {
                c0VarR.q0(function0A2);
            } else {
                c0VarR.l();
            }
            c0VarD2 = y7.d(c0VarR);
            y7.n(c0VarD2, a1VarE1111110, aVar111111119.e());
            y7.n(c0VarD2, b1VarK1111110, aVar111111119.g());
            function2B2 = aVar111111119.b();
            if (c0VarD2.P()) {
                c0VarD2.Y(Integer.valueOf(iHashCode2));
                c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
            } else {
                c0VarD2.Y(Integer.valueOf(iHashCode2));
                c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
            }
            y7.n(c0VarD2, a0VarN1111110, aVar111111119.f());
            c0VarR.E(881566524);
            if (z10) {
                ei.D(onDeleteClick, null, false, null, null, null, composableSingletons$PreviewTopBarKt.m614getLambda2$intercom_sdk_ui_release(), c0VarR, ((i21 >> 15) & 14) | 1572864, 62);
            }
            c0VarR.A();
            c0VarR.E(881579446);
            if (z15) {
                ei.D(function2, null, false, null, null, null, composableSingletons$PreviewTopBarKt.m615getLambda3$intercom_sdk_ui_release(), c0VarR, ((i21 >> 18) & 14) | 1572864, 62);
            }
            Function0<Unit> function1116 = function2;
            c0VarR.A();
            c0VarR.E(881592201);
            if (z16) {
                function4 = function3;
                ei.D(function4, null, false, null, null, null, composableSingletons$PreviewTopBarKt.m616getLambda4$intercom_sdk_ui_release(), c0VarR, ((i21 >> 21) & 14) | 1572864, 62);
            } else {
                function4 = function3;
            }
            c0VarR.A();
            c0VarR.o();
            c0VarR.o();
            function5 = function1116;
            function6 = function4;
            z17 = z15;
            z14 = z16;
            a0Var2 = a0Var11118;
        } else {
            if (i22 != 0) {
                a0Var3 = androidx.compose.ui.a0.E;
            } else {
                a0Var3 = a0Var2;
            }
            if (i23 != 0) {
                z15 = false;
            } else {
                z15 = z13;
            }
            if (i13 != 0) {
                z16 = false;
            } else {
                z16 = z14;
            }
            if (i17 != 0) {
                function2 = new Function0() { // from class: io.intercom.android.sdk.ui.preview.ui.x
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.f312394a;
                    }
                };
            }
            if (i19 != 0) {
                function3 = new Function0() { // from class: io.intercom.android.sdk.ui.preview.ui.y
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Unit.f312394a;
                    }
                };
            } else {
                function3 = function1;
            }
            androidx.compose.ui.a0 a0VarD1111 = androidx.compose.foundation.v.d(i6.F(i6.h(a0Var3, 0.0f, 1, null), null, false, 3, null), q0.w(q0.f38131b.a(), 0.5f, 0.0f, 0.0f, 0.0f, 14, null), null, 2, null);
            androidx.compose.ui.e.a aVar1111111111 = androidx.compose.ui.e.f37317a;
            androidx.compose.ui.e.c cVarQ1111111 = aVar1111111111.q();
            androidx.compose.foundation.layout.q qVar1111 = androidx.compose.foundation.layout.q.f16330a;
            a1 a1VarE1111111 = u5.e(qVar1111.s(), cVarQ1111111, c0VarR, 54);
            iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            b1 b1VarK1111111 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN1111111 = androidx.compose.ui.m.n(c0VarR, a0VarD1111);
            androidx.compose.ui.node.g.a aVar1111111112 = androidx.compose.ui.node.g.I;
            function0A = aVar1111111112.a();
            if (c0VarR.S() == null) {
                androidx.compose.runtime.v.r();
            }
            c0VarR.q();
            if (c0VarR.P()) {
                c0VarR.q0(function0A);
            } else {
                c0VarR.l();
            }
            c0VarD = y7.d(c0VarR);
            y7.n(c0VarD, a1VarE1111111, aVar1111111112.e());
            y7.n(c0VarD, b1VarK1111111, aVar1111111112.g());
            function2B = aVar1111111112.b();
            if (c0VarD.P()) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            } else {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            y7.n(c0VarD, a0VarN1111111, aVar1111111112.f());
            y5 y5Var1111 = y5.f16577a;
            composableSingletons$PreviewTopBarKt = ComposableSingletons$PreviewTopBarKt.INSTANCE;
            androidx.compose.ui.a0 a0Var11119 = a0Var3;
            ei.D(onBackCLick, null, false, null, null, null, composableSingletons$PreviewTopBarKt.m613getLambda1$intercom_sdk_ui_release(), c0VarR, ((i21 >> 12) & 14) | 1572864, 62);
            androidx.compose.ui.e.c cVarQ1111112 = aVar1111111111.q();
            androidx.compose.ui.a0.a aVar1111111113 = androidx.compose.ui.a0.E;
            a1 a1VarE1111112 = u5.e(qVar1111.w(), cVarQ1111112, c0VarR, 48);
            iHashCode2 = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            b1 b1VarK1111112 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN1111112 = androidx.compose.ui.m.n(c0VarR, aVar1111111113);
            function0A2 = aVar1111111112.a();
            if (c0VarR.S() == null) {
                androidx.compose.runtime.v.r();
            }
            c0VarR.q();
            if (c0VarR.P()) {
                c0VarR.q0(function0A2);
            } else {
                c0VarR.l();
            }
            c0VarD2 = y7.d(c0VarR);
            y7.n(c0VarD2, a1VarE1111112, aVar1111111112.e());
            y7.n(c0VarD2, b1VarK1111112, aVar1111111112.g());
            function2B2 = aVar1111111112.b();
            if (c0VarD2.P()) {
                c0VarD2.Y(Integer.valueOf(iHashCode2));
                c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
            } else {
                c0VarD2.Y(Integer.valueOf(iHashCode2));
                c0VarD2.f(Integer.valueOf(iHashCode2), function2B2);
            }
            y7.n(c0VarD2, a0VarN1111112, aVar1111111112.f());
            c0VarR.E(881566524);
            if (z10) {
                ei.D(onDeleteClick, null, false, null, null, null, composableSingletons$PreviewTopBarKt.m614getLambda2$intercom_sdk_ui_release(), c0VarR, ((i21 >> 15) & 14) | 1572864, 62);
            }
            c0VarR.A();
            c0VarR.E(881579446);
            if (z15) {
                ei.D(function2, null, false, null, null, null, composableSingletons$PreviewTopBarKt.m615getLambda3$intercom_sdk_ui_release(), c0VarR, ((i21 >> 18) & 14) | 1572864, 62);
            }
            Function0<Unit> function1117 = function2;
            c0VarR.A();
            c0VarR.E(881592201);
            if (z16) {
                function4 = function3;
                ei.D(function4, null, false, null, null, null, composableSingletons$PreviewTopBarKt.m616getLambda4$intercom_sdk_ui_release(), c0VarR, ((i21 >> 21) & 14) | 1572864, 62);
            } else {
                function4 = function3;
            }
            c0VarR.A();
            c0VarR.o();
            c0VarR.o();
            function5 = function1117;
            function6 = function4;
            z17 = z15;
            z14 = z16;
            a0Var2 = a0Var11119;
        }
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            final androidx.compose.ui.a0 a0Var111110 = a0Var2;
            final boolean z1113 = z14;
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.ui.preview.ui.z
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PreviewTopBarKt.PreviewTopBar$lambda$4(a0Var111110, z10, z17, z1113, onBackCLick, onDeleteClick, function5, function6, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewTopBar$lambda$4(androidx.compose.ui.a0 a0Var, boolean z10, boolean z11, boolean z12, Function0 onBackCLick, Function0 onDeleteClick, Function0 function0, Function0 function1, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        Intrinsics.checkNotNullParameter(onBackCLick, "$onBackCLick");
        Intrinsics.checkNotNullParameter(onDeleteClick, "$onDeleteClick");
        PreviewTopBar(a0Var, z10, z11, z12, onBackCLick, onDeleteClick, function0, function1, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @IntercomPreviews
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    private static final void PreviewTopBarPreview(androidx.compose.runtime.c0 c0Var, final int i10) {
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1899188968);
        if (i10 == 0 && c0VarR.d()) {
            c0VarR.u();
        } else {
            IntercomThemeKt.IntercomTheme(null, null, null, ComposableSingletons$PreviewTopBarKt.INSTANCE.m618getLambda6$intercom_sdk_ui_release(), c0VarR, 3072, 7);
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.ui.preview.ui.a0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return PreviewTopBarKt.PreviewTopBarPreview$lambda$5(i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit PreviewTopBarPreview$lambda$5(int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        PreviewTopBarPreview(c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }
}

package io.intercom.android.sdk.ui.component;

import androidx.compose.foundation.layout.d5;
import androidx.compose.foundation.layout.u5;
import androidx.compose.foundation.layout.x5;
import androidx.compose.foundation.layout.y5;
import androidx.compose.foundation.t0;
import androidx.compose.material3.q50;
import androidx.compose.runtime.b1;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.y7;
import androidx.compose.ui.layout.a1;
import androidx.media3.exoplayer.a5;
import io.intercom.android.sdk.ui.theme.IntercomTheme;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes13.dex */
@SourceDebugExtension({"SMAP\nBoxedTextLayout.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BoxedTextLayout.kt\nio/intercom/android/sdk/ui/component/BoxedTextLayoutKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 Row.kt\nandroidx/compose/foundation/layout/RowKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,61:1\n113#2:62\n113#2:63\n113#2:64\n99#3,6:65\n106#3:101\n80#4,6:71\n87#4,3:86\n90#4,2:95\n94#4:100\n391#5,9:77\n400#5,3:97\n4360#6,6:89\n*S KotlinDebug\n*F\n+ 1 BoxedTextLayout.kt\nio/intercom/android/sdk/ui/component/BoxedTextLayoutKt\n*L\n31#1:62\n36#1:63\n38#1:64\n28#1:65,6\n28#1:101\n28#1:71,6\n28#1:86,3\n28#1:95,2\n28#1:100\n28#1:77,9\n28#1:97,3\n28#1:89,6\n*E\n"})
public final class BoxedTextLayoutKt {
    /* JADX WARN: Code duplicated, block: B:101:0x018b  */
    /* JADX WARN: Code duplicated, block: B:102:0x018f  */
    /* JADX WARN: Code duplicated, block: B:105:0x01ae  */
    /* JADX WARN: Code duplicated, block: B:107:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:110:0x01db  */
    /* JADX WARN: Code duplicated, block: B:113:0x0258  */
    /* JADX WARN: Code duplicated, block: B:117:0x027a  */
    /* JADX WARN: Code duplicated, block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:57:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:61:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:64:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:68:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:73:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:75:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:83:0x00fb A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:85:0x0100  */
    /* JADX WARN: Code duplicated, block: B:88:0x0106  */
    /* JADX WARN: Code duplicated, block: B:89:0x0113  */
    /* JADX WARN: Code duplicated, block: B:92:0x0117  */
    /* JADX WARN: Code duplicated, block: B:95:0x011e  */
    /* JADX WARN: Code duplicated, block: B:98:0x017f  */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable][androidx.compose.ui.UiComposable]]")
    /* JADX INFO: renamed from: BoxedTextLayout-Y0xEhic, reason: not valid java name */
    public static final void m572BoxedTextLayoutY0xEhic(@Nullable androidx.compose.ui.a0 a0Var, @NotNull final String text, final long j10, long j11, @Nullable pj.n<? super x5, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar, @Nullable pj.n<? super x5, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar2, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        androidx.compose.ui.a0 a0Var2;
        int i12;
        long j12;
        pj.n<? super x5, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar3;
        int i13;
        pj.n<? super x5, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar4;
        int i14;
        androidx.compose.ui.a0 a0Var3;
        long jM714getPrimaryText0d7_KjU;
        int i15;
        pj.n<? super x5, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar5;
        int iHashCode;
        Function0<androidx.compose.ui.node.g> function0A;
        androidx.compose.runtime.c0 c0VarD;
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B;
        y5 y5Var;
        androidx.compose.runtime.c0 c0Var2;
        final long j13;
        final pj.n<? super x5, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar6;
        final androidx.compose.ui.a0 a0Var4;
        final pj.n<? super x5, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar7;
        s5 s5VarT;
        Intrinsics.checkNotNullParameter(text, "text");
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1728859823);
        int i16 = i11 & 1;
        if (i16 != 0) {
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
            i12 |= c0VarR.D(text) ? 32 : 16;
        }
        if ((i11 & 4) != 0) {
            i12 |= a5.S0;
        } else if ((i10 & 896) == 0) {
            i12 |= c0VarR.L(j10) ? 256 : 128;
        }
        if ((i10 & 7168) == 0) {
            if ((i11 & 8) == 0) {
                j12 = j11;
                int i17 = c0VarR.L(j12) ? 2048 : 1024;
                i12 |= i17;
            } else {
                j12 = j11;
            }
            i12 |= i17;
        } else {
            j12 = j11;
        }
        int i18 = i11 & 16;
        if (i18 == 0) {
            if ((57344 & i10) == 0) {
                nVar3 = nVar;
                i12 |= c0VarR.k0(nVar3) ? 16384 : 8192;
            }
            i13 = i11 & 32;
            if (i13 != 0) {
                if ((458752 & i10) == 0) {
                    nVar4 = nVar2;
                    if (c0VarR.k0(nVar4)) {
                        i14 = 131072;
                    } else {
                        i14 = 65536;
                    }
                    i12 |= i14;
                }
                if ((374491 & i12) == 74898 || !c0VarR.d()) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0 || c0VarR.y()) {
                        if (i16 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var2;
                        }
                        if ((i11 & 8) != 0) {
                            jM714getPrimaryText0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m714getPrimaryText0d7_KjU();
                            i12 &= -7169;
                        } else {
                            jM714getPrimaryText0d7_KjU = j12;
                        }
                        if (i18 != 0) {
                            nVar3 = null;
                        }
                        i15 = i12;
                        if (i13 != 0) {
                            nVar4 = null;
                        }
                    } else {
                        c0VarR.u();
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                        }
                        a0Var3 = a0Var2;
                        i15 = i12;
                        jM714getPrimaryText0d7_KjU = j12;
                    }
                    nVar5 = nVar3;
                    c0VarR.Z();
                    float fR = androidx.compose.ui.unit.h.r(1);
                    IntercomTheme intercomTheme = IntercomTheme.INSTANCE;
                    float f10 = 8;
                    androidx.compose.ui.a0 a0VarR = d5.r(androidx.compose.ui.draw.j.a(t0.i(a0Var3, fR, j10, intercomTheme.getShapes(c0VarR, 6).m()), androidx.compose.foundation.shape.o.c(2)), androidx.compose.ui.unit.h.r(f10));
                    a1 a1VarE = u5.e(androidx.compose.foundation.layout.q.f16330a.G(androidx.compose.ui.unit.h.r(f10)), androidx.compose.ui.e.f37317a.q(), c0VarR, 54);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0VarR);
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
                    c0VarD = y7.d(c0VarR);
                    y7.n(c0VarD, a1VarE, aVar.e());
                    y7.n(c0VarD, b1VarK, aVar.g());
                    function2B = aVar.b();
                    if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN, aVar.f());
                    y5Var = y5.f16577a;
                    c0VarR.E(581650633);
                    if (nVar5 != null) {
                        nVar5.invoke(y5Var, c0VarR, Integer.valueOf(6 | ((i15 >> 9) & com.planner5d.library.engine.input.f.b.B)));
                    }
                    c0VarR.A();
                    long j14 = jM714getPrimaryText0d7_KjU;
                    androidx.compose.ui.a0 a0Var5 = a0Var3;
                    q50.t(text, y5Var.h(androidx.compose.ui.a0.E, 1.0f, false), j14, null, 0L, null, null, null, 0L, null, null, 0L, androidx.compose.ui.text.style.v.f42256b.c(), false, 1, 0, null, intercomTheme.getTypography(c0VarR, 6).getType04(), c0VarR, (i15 >> 3) & 910, 24960, 110584);
                    c0Var2 = c0VarR;
                    c0Var2.E(581663143);
                    nVar4 = nVar4;
                    if (nVar4 != null) {
                        nVar4.invoke(y5Var, c0Var2, Integer.valueOf(6 | ((i15 >> 12) & com.planner5d.library.engine.input.f.b.B)));
                    }
                    c0Var2.A();
                    c0Var2.o();
                    j13 = j14;
                    nVar6 = nVar5;
                    a0Var4 = a0Var5;
                } else {
                    c0VarR.u();
                    c0Var2 = c0VarR;
                    a0Var4 = a0Var2;
                    j13 = j12;
                    nVar6 = nVar3;
                }
                nVar7 = nVar4;
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.ui.component.a
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return BoxedTextLayoutKt.BoxedTextLayout_Y0xEhic$lambda$1(a0Var4, text, j10, j13, nVar6, nVar7, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= androidx.profileinstaller.n.c.f73814m;
            nVar4 = nVar2;
            if ((374491 & i12) == 74898) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i16 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if ((i11 & 8) != 0) {
                        jM714getPrimaryText0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m714getPrimaryText0d7_KjU();
                        i12 &= -7169;
                    } else {
                        jM714getPrimaryText0d7_KjU = j12;
                    }
                    if (i18 != 0) {
                        nVar3 = null;
                    }
                    i15 = i12;
                    if (i13 != 0) {
                        nVar4 = null;
                    }
                } else {
                    if (i16 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if ((i11 & 8) != 0) {
                        jM714getPrimaryText0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m714getPrimaryText0d7_KjU();
                        i12 &= -7169;
                    } else {
                        jM714getPrimaryText0d7_KjU = j12;
                    }
                    if (i18 != 0) {
                        nVar3 = null;
                    }
                    i15 = i12;
                    if (i13 != 0) {
                        nVar4 = null;
                    }
                }
                nVar5 = nVar3;
                c0VarR.Z();
                float fR2 = androidx.compose.ui.unit.h.r(1);
                IntercomTheme intercomTheme2 = IntercomTheme.INSTANCE;
                float f11 = 8;
                androidx.compose.ui.a0 a0VarR2 = d5.r(androidx.compose.ui.draw.j.a(t0.i(a0Var3, fR2, j10, intercomTheme2.getShapes(c0VarR, 6).m()), androidx.compose.foundation.shape.o.c(2)), androidx.compose.ui.unit.h.r(f11));
                a1 a1VarE2 = u5.e(androidx.compose.foundation.layout.q.f16330a.G(androidx.compose.ui.unit.h.r(f11)), androidx.compose.ui.e.f37317a.q(), c0VarR, 54);
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK2 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN2 = androidx.compose.ui.m.n(c0VarR, a0VarR2);
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
                y7.n(c0VarD, a1VarE2, aVar2.e());
                y7.n(c0VarD, b1VarK2, aVar2.g());
                function2B = aVar2.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN2, aVar2.f());
                y5Var = y5.f16577a;
                c0VarR.E(581650633);
                if (nVar5 != null) {
                    nVar5.invoke(y5Var, c0VarR, Integer.valueOf(6 | ((i15 >> 9) & com.planner5d.library.engine.input.f.b.B)));
                }
                c0VarR.A();
                long j15 = jM714getPrimaryText0d7_KjU;
                androidx.compose.ui.a0 a0Var6 = a0Var3;
                q50.t(text, y5Var.h(androidx.compose.ui.a0.E, 1.0f, false), j15, null, 0L, null, null, null, 0L, null, null, 0L, androidx.compose.ui.text.style.v.f42256b.c(), false, 1, 0, null, intercomTheme2.getTypography(c0VarR, 6).getType04(), c0VarR, (i15 >> 3) & 910, 24960, 110584);
                c0Var2 = c0VarR;
                c0Var2.E(581663143);
                nVar4 = nVar4;
                if (nVar4 != null) {
                    nVar4.invoke(y5Var, c0Var2, Integer.valueOf(6 | ((i15 >> 12) & com.planner5d.library.engine.input.f.b.B)));
                }
                c0Var2.A();
                c0Var2.o();
                j13 = j15;
                nVar6 = nVar5;
                a0Var4 = a0Var6;
            } else {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i16 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if ((i11 & 8) != 0) {
                        jM714getPrimaryText0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m714getPrimaryText0d7_KjU();
                        i12 &= -7169;
                    } else {
                        jM714getPrimaryText0d7_KjU = j12;
                    }
                    if (i18 != 0) {
                        nVar3 = null;
                    }
                    i15 = i12;
                    if (i13 != 0) {
                        nVar4 = null;
                    }
                } else {
                    if (i16 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if ((i11 & 8) != 0) {
                        jM714getPrimaryText0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m714getPrimaryText0d7_KjU();
                        i12 &= -7169;
                    } else {
                        jM714getPrimaryText0d7_KjU = j12;
                    }
                    if (i18 != 0) {
                        nVar3 = null;
                    }
                    i15 = i12;
                    if (i13 != 0) {
                        nVar4 = null;
                    }
                }
                nVar5 = nVar3;
                c0VarR.Z();
                float fR3 = androidx.compose.ui.unit.h.r(1);
                IntercomTheme intercomTheme3 = IntercomTheme.INSTANCE;
                float f12 = 8;
                androidx.compose.ui.a0 a0VarR3 = d5.r(androidx.compose.ui.draw.j.a(t0.i(a0Var3, fR3, j10, intercomTheme3.getShapes(c0VarR, 6).m()), androidx.compose.foundation.shape.o.c(2)), androidx.compose.ui.unit.h.r(f12));
                a1 a1VarE3 = u5.e(androidx.compose.foundation.layout.q.f16330a.G(androidx.compose.ui.unit.h.r(f12)), androidx.compose.ui.e.f37317a.q(), c0VarR, 54);
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK3 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN3 = androidx.compose.ui.m.n(c0VarR, a0VarR3);
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
                c0VarD = y7.d(c0VarR);
                y7.n(c0VarD, a1VarE3, aVar3.e());
                y7.n(c0VarD, b1VarK3, aVar3.g());
                function2B = aVar3.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN3, aVar3.f());
                y5Var = y5.f16577a;
                c0VarR.E(581650633);
                if (nVar5 != null) {
                    nVar5.invoke(y5Var, c0VarR, Integer.valueOf(6 | ((i15 >> 9) & com.planner5d.library.engine.input.f.b.B)));
                }
                c0VarR.A();
                long j16 = jM714getPrimaryText0d7_KjU;
                androidx.compose.ui.a0 a0Var7 = a0Var3;
                q50.t(text, y5Var.h(androidx.compose.ui.a0.E, 1.0f, false), j16, null, 0L, null, null, null, 0L, null, null, 0L, androidx.compose.ui.text.style.v.f42256b.c(), false, 1, 0, null, intercomTheme3.getTypography(c0VarR, 6).getType04(), c0VarR, (i15 >> 3) & 910, 24960, 110584);
                c0Var2 = c0VarR;
                c0Var2.E(581663143);
                nVar4 = nVar4;
                if (nVar4 != null) {
                    nVar4.invoke(y5Var, c0Var2, Integer.valueOf(6 | ((i15 >> 12) & com.planner5d.library.engine.input.f.b.B)));
                }
                c0Var2.A();
                c0Var2.o();
                j13 = j16;
                nVar6 = nVar5;
                a0Var4 = a0Var7;
            }
            nVar7 = nVar4;
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.ui.component.a
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return BoxedTextLayoutKt.BoxedTextLayout_Y0xEhic$lambda$1(a0Var4, text, j10, j13, nVar6, nVar7, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 24576;
        nVar3 = nVar;
        i13 = i11 & 32;
        if (i13 != 0) {
            if ((458752 & i10) == 0) {
                nVar4 = nVar2;
                if (c0VarR.k0(nVar4)) {
                    i14 = 131072;
                } else {
                    i14 = 65536;
                }
                i12 |= i14;
            }
            if ((374491 & i12) == 74898) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i16 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if ((i11 & 8) != 0) {
                        jM714getPrimaryText0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m714getPrimaryText0d7_KjU();
                        i12 &= -7169;
                    } else {
                        jM714getPrimaryText0d7_KjU = j12;
                    }
                    if (i18 != 0) {
                        nVar3 = null;
                    }
                    i15 = i12;
                    if (i13 != 0) {
                        nVar4 = null;
                    }
                } else {
                    if (i16 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if ((i11 & 8) != 0) {
                        jM714getPrimaryText0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m714getPrimaryText0d7_KjU();
                        i12 &= -7169;
                    } else {
                        jM714getPrimaryText0d7_KjU = j12;
                    }
                    if (i18 != 0) {
                        nVar3 = null;
                    }
                    i15 = i12;
                    if (i13 != 0) {
                        nVar4 = null;
                    }
                }
                nVar5 = nVar3;
                c0VarR.Z();
                float fR4 = androidx.compose.ui.unit.h.r(1);
                IntercomTheme intercomTheme4 = IntercomTheme.INSTANCE;
                float f13 = 8;
                androidx.compose.ui.a0 a0VarR4 = d5.r(androidx.compose.ui.draw.j.a(t0.i(a0Var3, fR4, j10, intercomTheme4.getShapes(c0VarR, 6).m()), androidx.compose.foundation.shape.o.c(2)), androidx.compose.ui.unit.h.r(f13));
                a1 a1VarE4 = u5.e(androidx.compose.foundation.layout.q.f16330a.G(androidx.compose.ui.unit.h.r(f13)), androidx.compose.ui.e.f37317a.q(), c0VarR, 54);
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK4 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN4 = androidx.compose.ui.m.n(c0VarR, a0VarR4);
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
                c0VarD = y7.d(c0VarR);
                y7.n(c0VarD, a1VarE4, aVar4.e());
                y7.n(c0VarD, b1VarK4, aVar4.g());
                function2B = aVar4.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN4, aVar4.f());
                y5Var = y5.f16577a;
                c0VarR.E(581650633);
                if (nVar5 != null) {
                    nVar5.invoke(y5Var, c0VarR, Integer.valueOf(6 | ((i15 >> 9) & com.planner5d.library.engine.input.f.b.B)));
                }
                c0VarR.A();
                long j17 = jM714getPrimaryText0d7_KjU;
                androidx.compose.ui.a0 a0Var8 = a0Var3;
                q50.t(text, y5Var.h(androidx.compose.ui.a0.E, 1.0f, false), j17, null, 0L, null, null, null, 0L, null, null, 0L, androidx.compose.ui.text.style.v.f42256b.c(), false, 1, 0, null, intercomTheme4.getTypography(c0VarR, 6).getType04(), c0VarR, (i15 >> 3) & 910, 24960, 110584);
                c0Var2 = c0VarR;
                c0Var2.E(581663143);
                nVar4 = nVar4;
                if (nVar4 != null) {
                    nVar4.invoke(y5Var, c0Var2, Integer.valueOf(6 | ((i15 >> 12) & com.planner5d.library.engine.input.f.b.B)));
                }
                c0Var2.A();
                c0Var2.o();
                j13 = j17;
                nVar6 = nVar5;
                a0Var4 = a0Var8;
            } else {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i16 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if ((i11 & 8) != 0) {
                        jM714getPrimaryText0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m714getPrimaryText0d7_KjU();
                        i12 &= -7169;
                    } else {
                        jM714getPrimaryText0d7_KjU = j12;
                    }
                    if (i18 != 0) {
                        nVar3 = null;
                    }
                    i15 = i12;
                    if (i13 != 0) {
                        nVar4 = null;
                    }
                } else {
                    if (i16 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if ((i11 & 8) != 0) {
                        jM714getPrimaryText0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m714getPrimaryText0d7_KjU();
                        i12 &= -7169;
                    } else {
                        jM714getPrimaryText0d7_KjU = j12;
                    }
                    if (i18 != 0) {
                        nVar3 = null;
                    }
                    i15 = i12;
                    if (i13 != 0) {
                        nVar4 = null;
                    }
                }
                nVar5 = nVar3;
                c0VarR.Z();
                float fR5 = androidx.compose.ui.unit.h.r(1);
                IntercomTheme intercomTheme5 = IntercomTheme.INSTANCE;
                float f14 = 8;
                androidx.compose.ui.a0 a0VarR5 = d5.r(androidx.compose.ui.draw.j.a(t0.i(a0Var3, fR5, j10, intercomTheme5.getShapes(c0VarR, 6).m()), androidx.compose.foundation.shape.o.c(2)), androidx.compose.ui.unit.h.r(f14));
                a1 a1VarE5 = u5.e(androidx.compose.foundation.layout.q.f16330a.G(androidx.compose.ui.unit.h.r(f14)), androidx.compose.ui.e.f37317a.q(), c0VarR, 54);
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK5 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN5 = androidx.compose.ui.m.n(c0VarR, a0VarR5);
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
                y7.n(c0VarD, a1VarE5, aVar5.e());
                y7.n(c0VarD, b1VarK5, aVar5.g());
                function2B = aVar5.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN5, aVar5.f());
                y5Var = y5.f16577a;
                c0VarR.E(581650633);
                if (nVar5 != null) {
                    nVar5.invoke(y5Var, c0VarR, Integer.valueOf(6 | ((i15 >> 9) & com.planner5d.library.engine.input.f.b.B)));
                }
                c0VarR.A();
                long j18 = jM714getPrimaryText0d7_KjU;
                androidx.compose.ui.a0 a0Var9 = a0Var3;
                q50.t(text, y5Var.h(androidx.compose.ui.a0.E, 1.0f, false), j18, null, 0L, null, null, null, 0L, null, null, 0L, androidx.compose.ui.text.style.v.f42256b.c(), false, 1, 0, null, intercomTheme5.getTypography(c0VarR, 6).getType04(), c0VarR, (i15 >> 3) & 910, 24960, 110584);
                c0Var2 = c0VarR;
                c0Var2.E(581663143);
                nVar4 = nVar4;
                if (nVar4 != null) {
                    nVar4.invoke(y5Var, c0Var2, Integer.valueOf(6 | ((i15 >> 12) & com.planner5d.library.engine.input.f.b.B)));
                }
                c0Var2.A();
                c0Var2.o();
                j13 = j18;
                nVar6 = nVar5;
                a0Var4 = a0Var9;
            }
            nVar7 = nVar4;
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.ui.component.a
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return BoxedTextLayoutKt.BoxedTextLayout_Y0xEhic$lambda$1(a0Var4, text, j10, j13, nVar6, nVar7, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= androidx.profileinstaller.n.c.f73814m;
        nVar4 = nVar2;
        if ((374491 & i12) == 74898) {
            c0VarR.l0();
            if ((i10 & 1) != 0) {
                if (i16 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if ((i11 & 8) != 0) {
                    jM714getPrimaryText0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m714getPrimaryText0d7_KjU();
                    i12 &= -7169;
                } else {
                    jM714getPrimaryText0d7_KjU = j12;
                }
                if (i18 != 0) {
                    nVar3 = null;
                }
                i15 = i12;
                if (i13 != 0) {
                    nVar4 = null;
                }
            } else {
                if (i16 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if ((i11 & 8) != 0) {
                    jM714getPrimaryText0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m714getPrimaryText0d7_KjU();
                    i12 &= -7169;
                } else {
                    jM714getPrimaryText0d7_KjU = j12;
                }
                if (i18 != 0) {
                    nVar3 = null;
                }
                i15 = i12;
                if (i13 != 0) {
                    nVar4 = null;
                }
            }
            nVar5 = nVar3;
            c0VarR.Z();
            float fR6 = androidx.compose.ui.unit.h.r(1);
            IntercomTheme intercomTheme6 = IntercomTheme.INSTANCE;
            float f15 = 8;
            androidx.compose.ui.a0 a0VarR6 = d5.r(androidx.compose.ui.draw.j.a(t0.i(a0Var3, fR6, j10, intercomTheme6.getShapes(c0VarR, 6).m()), androidx.compose.foundation.shape.o.c(2)), androidx.compose.ui.unit.h.r(f15));
            a1 a1VarE6 = u5.e(androidx.compose.foundation.layout.q.f16330a.G(androidx.compose.ui.unit.h.r(f15)), androidx.compose.ui.e.f37317a.q(), c0VarR, 54);
            iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            b1 b1VarK6 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN6 = androidx.compose.ui.m.n(c0VarR, a0VarR6);
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
            c0VarD = y7.d(c0VarR);
            y7.n(c0VarD, a1VarE6, aVar6.e());
            y7.n(c0VarD, b1VarK6, aVar6.g());
            function2B = aVar6.b();
            if (c0VarD.P()) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            } else {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            y7.n(c0VarD, a0VarN6, aVar6.f());
            y5Var = y5.f16577a;
            c0VarR.E(581650633);
            if (nVar5 != null) {
                nVar5.invoke(y5Var, c0VarR, Integer.valueOf(6 | ((i15 >> 9) & com.planner5d.library.engine.input.f.b.B)));
            }
            c0VarR.A();
            long j19 = jM714getPrimaryText0d7_KjU;
            androidx.compose.ui.a0 a0Var10 = a0Var3;
            q50.t(text, y5Var.h(androidx.compose.ui.a0.E, 1.0f, false), j19, null, 0L, null, null, null, 0L, null, null, 0L, androidx.compose.ui.text.style.v.f42256b.c(), false, 1, 0, null, intercomTheme6.getTypography(c0VarR, 6).getType04(), c0VarR, (i15 >> 3) & 910, 24960, 110584);
            c0Var2 = c0VarR;
            c0Var2.E(581663143);
            nVar4 = nVar4;
            if (nVar4 != null) {
                nVar4.invoke(y5Var, c0Var2, Integer.valueOf(6 | ((i15 >> 12) & com.planner5d.library.engine.input.f.b.B)));
            }
            c0Var2.A();
            c0Var2.o();
            j13 = j19;
            nVar6 = nVar5;
            a0Var4 = a0Var10;
        } else {
            c0VarR.l0();
            if ((i10 & 1) != 0) {
                if (i16 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if ((i11 & 8) != 0) {
                    jM714getPrimaryText0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m714getPrimaryText0d7_KjU();
                    i12 &= -7169;
                } else {
                    jM714getPrimaryText0d7_KjU = j12;
                }
                if (i18 != 0) {
                    nVar3 = null;
                }
                i15 = i12;
                if (i13 != 0) {
                    nVar4 = null;
                }
            } else {
                if (i16 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if ((i11 & 8) != 0) {
                    jM714getPrimaryText0d7_KjU = IntercomTheme.INSTANCE.getColors(c0VarR, 6).m714getPrimaryText0d7_KjU();
                    i12 &= -7169;
                } else {
                    jM714getPrimaryText0d7_KjU = j12;
                }
                if (i18 != 0) {
                    nVar3 = null;
                }
                i15 = i12;
                if (i13 != 0) {
                    nVar4 = null;
                }
            }
            nVar5 = nVar3;
            c0VarR.Z();
            float fR7 = androidx.compose.ui.unit.h.r(1);
            IntercomTheme intercomTheme7 = IntercomTheme.INSTANCE;
            float f16 = 8;
            androidx.compose.ui.a0 a0VarR7 = d5.r(androidx.compose.ui.draw.j.a(t0.i(a0Var3, fR7, j10, intercomTheme7.getShapes(c0VarR, 6).m()), androidx.compose.foundation.shape.o.c(2)), androidx.compose.ui.unit.h.r(f16));
            a1 a1VarE7 = u5.e(androidx.compose.foundation.layout.q.f16330a.G(androidx.compose.ui.unit.h.r(f16)), androidx.compose.ui.e.f37317a.q(), c0VarR, 54);
            iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            b1 b1VarK7 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN7 = androidx.compose.ui.m.n(c0VarR, a0VarR7);
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
            c0VarD = y7.d(c0VarR);
            y7.n(c0VarD, a1VarE7, aVar7.e());
            y7.n(c0VarD, b1VarK7, aVar7.g());
            function2B = aVar7.b();
            if (c0VarD.P()) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            } else {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            y7.n(c0VarD, a0VarN7, aVar7.f());
            y5Var = y5.f16577a;
            c0VarR.E(581650633);
            if (nVar5 != null) {
                nVar5.invoke(y5Var, c0VarR, Integer.valueOf(6 | ((i15 >> 9) & com.planner5d.library.engine.input.f.b.B)));
            }
            c0VarR.A();
            long j110 = jM714getPrimaryText0d7_KjU;
            androidx.compose.ui.a0 a0Var11 = a0Var3;
            q50.t(text, y5Var.h(androidx.compose.ui.a0.E, 1.0f, false), j110, null, 0L, null, null, null, 0L, null, null, 0L, androidx.compose.ui.text.style.v.f42256b.c(), false, 1, 0, null, intercomTheme7.getTypography(c0VarR, 6).getType04(), c0VarR, (i15 >> 3) & 910, 24960, 110584);
            c0Var2 = c0VarR;
            c0Var2.E(581663143);
            nVar4 = nVar4;
            if (nVar4 != null) {
                nVar4.invoke(y5Var, c0Var2, Integer.valueOf(6 | ((i15 >> 12) & com.planner5d.library.engine.input.f.b.B)));
            }
            c0Var2.A();
            c0Var2.o();
            j13 = j110;
            nVar6 = nVar5;
            a0Var4 = a0Var11;
        }
        nVar7 = nVar4;
        s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: io.intercom.android.sdk.ui.component.a
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return BoxedTextLayoutKt.BoxedTextLayout_Y0xEhic$lambda$1(a0Var4, text, j10, j13, nVar6, nVar7, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit BoxedTextLayout_Y0xEhic$lambda$1(androidx.compose.ui.a0 a0Var, String text, long j10, long j11, pj.n nVar, pj.n nVar2, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        Intrinsics.checkNotNullParameter(text, "$text");
        m572BoxedTextLayoutY0xEhic(a0Var, text, j10, j11, nVar, nVar2, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }
}

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
@SourceDebugExtension({"SMAP\nSwitch.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Switch.kt\nandroidx/compose/material3/SwitchKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n+ 7 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,631:1\n1282#2,6:632\n70#3:638\n67#3,9:639\n70#3:676\n68#3,8:677\n77#3:715\n77#3:719\n79#4,6:648\n86#4,3:663\n89#4,2:672\n79#4,6:685\n86#4,3:700\n89#4,2:709\n93#4:714\n93#4:718\n347#5,9:654\n356#5:674\n347#5,9:691\n356#5,3:711\n357#5,2:716\n4206#6,6:666\n4206#6,6:703\n60#7:675\n52#7,9:720\n*S KotlinDebug\n*F\n+ 1 Switch.kt\nandroidx/compose/material3/SwitchKt\n*L\n101#1:632,6\n149#1:638\n149#1:639,9\n154#1:676\n154#1:677,8\n154#1:715\n149#1:719\n149#1:648,6\n149#1:663,3\n149#1:672,2\n154#1:685,6\n154#1:700,3\n154#1:709,2\n154#1:714\n149#1:718\n149#1:654,9\n149#1:674\n154#1:691,9\n154#1:711,3\n149#1:716,2\n149#1:666,6\n154#1:703,6\n168#1:675\n629#1:720,9\n*E\n"})
public final class t20 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f33060a;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f33061b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f33062c;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final float f33063d;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final float f33064e;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.animation.core.l2<Float> f33065f;

    static {
        d0.y2 y2Var = d0.y2.f269421a;
        float fX = y2Var.x();
        f33060a = fX;
        f33061b = y2Var.T();
        f33062c = y2Var.M();
        float fJ = y2Var.J();
        f33063d = fJ;
        f33064e = androidx.compose.ui.unit.h.r(androidx.compose.ui.unit.h.r(fJ - fX) / 2);
        f33065f = new androidx.compose.animation.core.l2<>(0, 1, null);
    }

    /* JADX WARN: Code duplicated, block: B:102:0x0123  */
    /* JADX WARN: Code duplicated, block: B:104:0x012e  */
    /* JADX WARN: Code duplicated, block: B:106:0x0137  */
    /* JADX WARN: Code duplicated, block: B:109:0x0147  */
    /* JADX WARN: Code duplicated, block: B:111:0x0152  */
    /* JADX WARN: Code duplicated, block: B:113:0x0164  */
    /* JADX WARN: Code duplicated, block: B:115:0x0172  */
    /* JADX WARN: Code duplicated, block: B:117:0x017f  */
    /* JADX WARN: Code duplicated, block: B:118:0x01a0  */
    /* JADX WARN: Code duplicated, block: B:121:0x01ec  */
    /* JADX WARN: Code duplicated, block: B:123:0x01f9  */
    /* JADX WARN: Code duplicated, block: B:126:0x020a  */
    /* JADX WARN: Code duplicated, block: B:128:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0061  */
    /* JADX WARN: Code duplicated, block: B:38:0x0066  */
    /* JADX WARN: Code duplicated, block: B:40:0x006a  */
    /* JADX WARN: Code duplicated, block: B:42:0x0074  */
    /* JADX WARN: Code duplicated, block: B:43:0x0077  */
    /* JADX WARN: Code duplicated, block: B:47:0x007e  */
    /* JADX WARN: Code duplicated, block: B:49:0x0083  */
    /* JADX WARN: Code duplicated, block: B:51:0x0087  */
    /* JADX WARN: Code duplicated, block: B:53:0x008f  */
    /* JADX WARN: Code duplicated, block: B:54:0x0092  */
    /* JADX WARN: Code duplicated, block: B:58:0x009a  */
    /* JADX WARN: Code duplicated, block: B:60:0x009e  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:71:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:75:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:76:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:84:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:93:0x0111 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:94:0x0113  */
    /* JADX WARN: Code duplicated, block: B:95:0x0116  */
    /* JADX WARN: Code duplicated, block: B:97:0x011a  */
    /* JADX WARN: Code duplicated, block: B:99:0x011d  */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void c(final boolean z10, @Nullable final Function1<? super Boolean, Unit> function1, @Nullable androidx.compose.ui.a0 a0Var, @Nullable Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, boolean z11, @Nullable p20 p20Var, @Nullable androidx.compose.foundation.interaction.j jVar, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        boolean z12;
        int i12;
        androidx.compose.ui.a0 a0Var2;
        int i13;
        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function3;
        int i14;
        int i15;
        boolean z13;
        int i16;
        p20 p20VarA;
        int i17;
        androidx.compose.foundation.interaction.j jVar2;
        int i18;
        boolean z14;
        androidx.compose.runtime.c0 c0Var2;
        final androidx.compose.ui.a0 a0Var3;
        final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function4;
        final boolean z15;
        final p20 p20Var2;
        final androidx.compose.foundation.interaction.j jVar3;
        androidx.compose.runtime.s5 s5VarT;
        androidx.compose.ui.a0 a0Var4;
        androidx.compose.foundation.interaction.j jVar4;
        Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function5;
        androidx.compose.ui.a0 a0Var5;
        androidx.compose.foundation.interaction.j jVar5;
        boolean z16;
        boolean z17;
        androidx.compose.ui.a0 a0VarA;
        Object objI0;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-263339167);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
            z12 = z10;
        } else if ((i10 & 6) == 0) {
            z12 = z10;
            i12 = (c0VarR.G(z12) ? 4 : 2) | i10;
        } else {
            z12 = z10;
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= c0VarR.k0(function1) ? 32 : 16;
        }
        int i19 = i11 & 4;
        if (i19 == 0) {
            if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                a0Var2 = a0Var;
                i12 |= c0VarR.D(a0Var2) ? 256 : 128;
            }
            i13 = i11 & 8;
            if (i13 != 0) {
                if ((i10 & 3072) == 0) {
                    function3 = function2;
                    if (c0VarR.k0(function3)) {
                        i14 = 2048;
                    } else {
                        i14 = 1024;
                    }
                    i12 |= i14;
                }
                i15 = i11 & 16;
                if (i15 != 0) {
                    if ((i10 & 24576) == 0) {
                        z13 = z11;
                        if (c0VarR.G(z13)) {
                            i16 = 16384;
                        } else {
                            i16 = 8192;
                        }
                        i12 |= i16;
                    }
                    if ((196608 & i10) == 0) {
                        if ((i11 & 32) == 0) {
                            p20VarA = p20Var;
                            int i20 = c0VarR.D(p20VarA) ? 131072 : 65536;
                            i12 |= i20;
                        } else {
                            p20VarA = p20Var;
                        }
                        i12 |= i20;
                    } else {
                        p20VarA = p20Var;
                    }
                    i17 = i11 & 64;
                    if (i17 != 0) {
                        if ((1572864 & i10) == 0) {
                            jVar2 = jVar;
                            if (c0VarR.D(jVar2)) {
                                i18 = 1048576;
                            } else {
                                i18 = 524288;
                            }
                            i12 |= i18;
                        }
                        if ((i12 & 599187) != 599186) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if (c0VarR.h(z14, i12 & 1)) {
                            c0VarR.l0();
                            if ((i10 & 1) != 0 || c0VarR.y()) {
                                if (i19 != 0) {
                                    a0Var4 = androidx.compose.ui.a0.E;
                                } else {
                                    a0Var4 = a0Var2;
                                }
                                if (i13 != 0) {
                                    function3 = null;
                                }
                                if (i15 != 0) {
                                    z13 = true;
                                }
                                if ((i11 & 32) != 0) {
                                    i12 &= -458753;
                                    p20VarA = q20.f32058a.a(c0VarR, 6);
                                }
                                if (i17 != 0) {
                                    jVar4 = null;
                                } else {
                                    jVar4 = jVar2;
                                }
                                function5 = function3;
                                a0Var5 = a0Var4;
                            } else {
                                c0VarR.u();
                                if ((i11 & 32) != 0) {
                                    i12 &= -458753;
                                }
                                i12 = i12;
                                z13 = z13;
                                p20VarA = p20VarA;
                                jVar4 = jVar2;
                                function5 = function3;
                                a0Var5 = a0Var2;
                            }
                            c0VarR.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(-263339167, i12, -1, "androidx.compose.material3.Switch (Switch.kt:98)");
                            }
                            if (jVar4 == null) {
                                c0VarR.E(1768604058);
                                objI0 = c0VarR.i0();
                                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI0 = androidx.compose.foundation.interaction.i.a();
                                    c0VarR.Y(objI0);
                                }
                                c0VarR.A();
                                jVar5 = (androidx.compose.foundation.interaction.j) objI0;
                            } else {
                                c0VarR.E(334145757);
                                c0VarR.A();
                                jVar5 = jVar4;
                            }
                            if (function1 != null) {
                                z16 = z13;
                                z17 = false;
                                a0VarA = androidx.compose.foundation.selection.e.a(wi.j(androidx.compose.ui.a0.E), z12, jVar5, null, z16, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.g()), function1);
                            } else {
                                z16 = z13;
                                z17 = false;
                                a0VarA = androidx.compose.ui.a0.E;
                            }
                            int i21 = i12 << 3;
                            int i22 = i12 >> 6;
                            c0Var2 = c0VarR;
                            androidx.compose.ui.a0 a0Var6 = a0Var5;
                            e(androidx.compose.foundation.layout.i6.q(androidx.compose.foundation.layout.i6.H(a0Var5.B2(a0VarA), androidx.compose.ui.e.f37317a.i(), z17, 2, null), f33062c, f33063d), z10, z16, p20VarA, function5, jVar5, cx.i(d0.y2.f269421a.n(), c0VarR, 6), c0Var2, (i21 & com.planner5d.library.engine.input.f.b.B) | (i22 & 896) | (i22 & 7168) | (i21 & 57344));
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            a0Var3 = a0Var6;
                            z15 = z16;
                            p20Var2 = p20VarA;
                            function4 = function5;
                            jVar3 = jVar4;
                        } else {
                            c0Var2 = c0VarR;
                            c0Var2.u();
                            a0Var3 = a0Var2;
                            function4 = function3;
                            z15 = z13;
                            p20Var2 = p20VarA;
                            jVar3 = jVar2;
                        }
                        s5VarT = c0Var2.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material3.r20
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return t20.d(z10, function1, a0Var3, function4, z15, p20Var2, jVar3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i12 |= 1572864;
                    jVar2 = jVar;
                    if ((i12 & 599187) != 599186) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c0VarR.h(z14, i12 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i19 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i13 != 0) {
                                function3 = null;
                            }
                            if (i15 != 0) {
                                z13 = true;
                            }
                            if ((i11 & 32) != 0) {
                                i12 &= -458753;
                                p20VarA = q20.f32058a.a(c0VarR, 6);
                            }
                            if (i17 != 0) {
                                jVar4 = null;
                            } else {
                                jVar4 = jVar2;
                            }
                            function5 = function3;
                            a0Var5 = a0Var4;
                        } else {
                            if (i19 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i13 != 0) {
                                function3 = null;
                            }
                            if (i15 != 0) {
                                z13 = true;
                            }
                            if ((i11 & 32) != 0) {
                                i12 &= -458753;
                                p20VarA = q20.f32058a.a(c0VarR, 6);
                            }
                            if (i17 != 0) {
                                jVar4 = null;
                            } else {
                                jVar4 = jVar2;
                            }
                            function5 = function3;
                            a0Var5 = a0Var4;
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-263339167, i12, -1, "androidx.compose.material3.Switch (Switch.kt:98)");
                        }
                        if (jVar4 == null) {
                            c0VarR.E(1768604058);
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = androidx.compose.foundation.interaction.i.a();
                                c0VarR.Y(objI0);
                            }
                            c0VarR.A();
                            jVar5 = (androidx.compose.foundation.interaction.j) objI0;
                        } else {
                            c0VarR.E(334145757);
                            c0VarR.A();
                            jVar5 = jVar4;
                        }
                        if (function1 != null) {
                            z16 = z13;
                            z17 = false;
                            a0VarA = androidx.compose.foundation.selection.e.a(wi.j(androidx.compose.ui.a0.E), z12, jVar5, null, z16, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.g()), function1);
                        } else {
                            z16 = z13;
                            z17 = false;
                            a0VarA = androidx.compose.ui.a0.E;
                        }
                        int i23 = i12 << 3;
                        int i24 = i12 >> 6;
                        c0Var2 = c0VarR;
                        androidx.compose.ui.a0 a0Var7 = a0Var5;
                        e(androidx.compose.foundation.layout.i6.q(androidx.compose.foundation.layout.i6.H(a0Var5.B2(a0VarA), androidx.compose.ui.e.f37317a.i(), z17, 2, null), f33062c, f33063d), z10, z16, p20VarA, function5, jVar5, cx.i(d0.y2.f269421a.n(), c0VarR, 6), c0Var2, (i23 & com.planner5d.library.engine.input.f.b.B) | (i24 & 896) | (i24 & 7168) | (i23 & 57344));
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var7;
                        z15 = z16;
                        p20Var2 = p20VarA;
                        function4 = function5;
                        jVar3 = jVar4;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        a0Var3 = a0Var2;
                        function4 = function3;
                        z15 = z13;
                        p20Var2 = p20VarA;
                        jVar3 = jVar2;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.r20
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return t20.d(z10, function1, a0Var3, function4, z15, p20Var2, jVar3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 24576;
                z13 = z11;
                if ((196608 & i10) == 0) {
                    if ((i11 & 32) == 0) {
                        p20VarA = p20Var;
                        if (c0VarR.D(p20VarA)) {
                        }
                        i12 |= i20;
                    } else {
                        p20VarA = p20Var;
                    }
                    i12 |= i20;
                } else {
                    p20VarA = p20Var;
                }
                i17 = i11 & 64;
                if (i17 != 0) {
                    if ((1572864 & i10) == 0) {
                        jVar2 = jVar;
                        if (c0VarR.D(jVar2)) {
                            i18 = 1048576;
                        } else {
                            i18 = 524288;
                        }
                        i12 |= i18;
                    }
                    if ((i12 & 599187) != 599186) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c0VarR.h(z14, i12 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i19 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i13 != 0) {
                                function3 = null;
                            }
                            if (i15 != 0) {
                                z13 = true;
                            }
                            if ((i11 & 32) != 0) {
                                i12 &= -458753;
                                p20VarA = q20.f32058a.a(c0VarR, 6);
                            }
                            if (i17 != 0) {
                                jVar4 = null;
                            } else {
                                jVar4 = jVar2;
                            }
                            function5 = function3;
                            a0Var5 = a0Var4;
                        } else {
                            if (i19 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i13 != 0) {
                                function3 = null;
                            }
                            if (i15 != 0) {
                                z13 = true;
                            }
                            if ((i11 & 32) != 0) {
                                i12 &= -458753;
                                p20VarA = q20.f32058a.a(c0VarR, 6);
                            }
                            if (i17 != 0) {
                                jVar4 = null;
                            } else {
                                jVar4 = jVar2;
                            }
                            function5 = function3;
                            a0Var5 = a0Var4;
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-263339167, i12, -1, "androidx.compose.material3.Switch (Switch.kt:98)");
                        }
                        if (jVar4 == null) {
                            c0VarR.E(1768604058);
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = androidx.compose.foundation.interaction.i.a();
                                c0VarR.Y(objI0);
                            }
                            c0VarR.A();
                            jVar5 = (androidx.compose.foundation.interaction.j) objI0;
                        } else {
                            c0VarR.E(334145757);
                            c0VarR.A();
                            jVar5 = jVar4;
                        }
                        if (function1 != null) {
                            z16 = z13;
                            z17 = false;
                            a0VarA = androidx.compose.foundation.selection.e.a(wi.j(androidx.compose.ui.a0.E), z12, jVar5, null, z16, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.g()), function1);
                        } else {
                            z16 = z13;
                            z17 = false;
                            a0VarA = androidx.compose.ui.a0.E;
                        }
                        int i25 = i12 << 3;
                        int i26 = i12 >> 6;
                        c0Var2 = c0VarR;
                        androidx.compose.ui.a0 a0Var8 = a0Var5;
                        e(androidx.compose.foundation.layout.i6.q(androidx.compose.foundation.layout.i6.H(a0Var5.B2(a0VarA), androidx.compose.ui.e.f37317a.i(), z17, 2, null), f33062c, f33063d), z10, z16, p20VarA, function5, jVar5, cx.i(d0.y2.f269421a.n(), c0VarR, 6), c0Var2, (i25 & com.planner5d.library.engine.input.f.b.B) | (i26 & 896) | (i26 & 7168) | (i25 & 57344));
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var8;
                        z15 = z16;
                        p20Var2 = p20VarA;
                        function4 = function5;
                        jVar3 = jVar4;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        a0Var3 = a0Var2;
                        function4 = function3;
                        z15 = z13;
                        p20Var2 = p20VarA;
                        jVar3 = jVar2;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.r20
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return t20.d(z10, function1, a0Var3, function4, z15, p20Var2, jVar3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 1572864;
                jVar2 = jVar;
                if ((i12 & 599187) != 599186) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c0VarR.h(z14, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i19 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            function3 = null;
                        }
                        if (i15 != 0) {
                            z13 = true;
                        }
                        if ((i11 & 32) != 0) {
                            i12 &= -458753;
                            p20VarA = q20.f32058a.a(c0VarR, 6);
                        }
                        if (i17 != 0) {
                            jVar4 = null;
                        } else {
                            jVar4 = jVar2;
                        }
                        function5 = function3;
                        a0Var5 = a0Var4;
                    } else {
                        if (i19 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            function3 = null;
                        }
                        if (i15 != 0) {
                            z13 = true;
                        }
                        if ((i11 & 32) != 0) {
                            i12 &= -458753;
                            p20VarA = q20.f32058a.a(c0VarR, 6);
                        }
                        if (i17 != 0) {
                            jVar4 = null;
                        } else {
                            jVar4 = jVar2;
                        }
                        function5 = function3;
                        a0Var5 = a0Var4;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-263339167, i12, -1, "androidx.compose.material3.Switch (Switch.kt:98)");
                    }
                    if (jVar4 == null) {
                        c0VarR.E(1768604058);
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = androidx.compose.foundation.interaction.i.a();
                            c0VarR.Y(objI0);
                        }
                        c0VarR.A();
                        jVar5 = (androidx.compose.foundation.interaction.j) objI0;
                    } else {
                        c0VarR.E(334145757);
                        c0VarR.A();
                        jVar5 = jVar4;
                    }
                    if (function1 != null) {
                        z16 = z13;
                        z17 = false;
                        a0VarA = androidx.compose.foundation.selection.e.a(wi.j(androidx.compose.ui.a0.E), z12, jVar5, null, z16, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.g()), function1);
                    } else {
                        z16 = z13;
                        z17 = false;
                        a0VarA = androidx.compose.ui.a0.E;
                    }
                    int i27 = i12 << 3;
                    int i28 = i12 >> 6;
                    c0Var2 = c0VarR;
                    androidx.compose.ui.a0 a0Var9 = a0Var5;
                    e(androidx.compose.foundation.layout.i6.q(androidx.compose.foundation.layout.i6.H(a0Var5.B2(a0VarA), androidx.compose.ui.e.f37317a.i(), z17, 2, null), f33062c, f33063d), z10, z16, p20VarA, function5, jVar5, cx.i(d0.y2.f269421a.n(), c0VarR, 6), c0Var2, (i27 & com.planner5d.library.engine.input.f.b.B) | (i28 & 896) | (i28 & 7168) | (i27 & 57344));
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var9;
                    z15 = z16;
                    p20Var2 = p20VarA;
                    function4 = function5;
                    jVar3 = jVar4;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var3 = a0Var2;
                    function4 = function3;
                    z15 = z13;
                    p20Var2 = p20VarA;
                    jVar3 = jVar2;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.r20
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return t20.d(z10, function1, a0Var3, function4, z15, p20Var2, jVar3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 3072;
            function3 = function2;
            i15 = i11 & 16;
            if (i15 != 0) {
                if ((i10 & 24576) == 0) {
                    z13 = z11;
                    if (c0VarR.G(z13)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i12 |= i16;
                }
                if ((196608 & i10) == 0) {
                    if ((i11 & 32) == 0) {
                        p20VarA = p20Var;
                        if (c0VarR.D(p20VarA)) {
                        }
                        i12 |= i20;
                    } else {
                        p20VarA = p20Var;
                    }
                    i12 |= i20;
                } else {
                    p20VarA = p20Var;
                }
                i17 = i11 & 64;
                if (i17 != 0) {
                    if ((1572864 & i10) == 0) {
                        jVar2 = jVar;
                        if (c0VarR.D(jVar2)) {
                            i18 = 1048576;
                        } else {
                            i18 = 524288;
                        }
                        i12 |= i18;
                    }
                    if ((i12 & 599187) != 599186) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c0VarR.h(z14, i12 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i19 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i13 != 0) {
                                function3 = null;
                            }
                            if (i15 != 0) {
                                z13 = true;
                            }
                            if ((i11 & 32) != 0) {
                                i12 &= -458753;
                                p20VarA = q20.f32058a.a(c0VarR, 6);
                            }
                            if (i17 != 0) {
                                jVar4 = null;
                            } else {
                                jVar4 = jVar2;
                            }
                            function5 = function3;
                            a0Var5 = a0Var4;
                        } else {
                            if (i19 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i13 != 0) {
                                function3 = null;
                            }
                            if (i15 != 0) {
                                z13 = true;
                            }
                            if ((i11 & 32) != 0) {
                                i12 &= -458753;
                                p20VarA = q20.f32058a.a(c0VarR, 6);
                            }
                            if (i17 != 0) {
                                jVar4 = null;
                            } else {
                                jVar4 = jVar2;
                            }
                            function5 = function3;
                            a0Var5 = a0Var4;
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-263339167, i12, -1, "androidx.compose.material3.Switch (Switch.kt:98)");
                        }
                        if (jVar4 == null) {
                            c0VarR.E(1768604058);
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = androidx.compose.foundation.interaction.i.a();
                                c0VarR.Y(objI0);
                            }
                            c0VarR.A();
                            jVar5 = (androidx.compose.foundation.interaction.j) objI0;
                        } else {
                            c0VarR.E(334145757);
                            c0VarR.A();
                            jVar5 = jVar4;
                        }
                        if (function1 != null) {
                            z16 = z13;
                            z17 = false;
                            a0VarA = androidx.compose.foundation.selection.e.a(wi.j(androidx.compose.ui.a0.E), z12, jVar5, null, z16, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.g()), function1);
                        } else {
                            z16 = z13;
                            z17 = false;
                            a0VarA = androidx.compose.ui.a0.E;
                        }
                        int i29 = i12 << 3;
                        int i210 = i12 >> 6;
                        c0Var2 = c0VarR;
                        androidx.compose.ui.a0 a0Var10 = a0Var5;
                        e(androidx.compose.foundation.layout.i6.q(androidx.compose.foundation.layout.i6.H(a0Var5.B2(a0VarA), androidx.compose.ui.e.f37317a.i(), z17, 2, null), f33062c, f33063d), z10, z16, p20VarA, function5, jVar5, cx.i(d0.y2.f269421a.n(), c0VarR, 6), c0Var2, (i29 & com.planner5d.library.engine.input.f.b.B) | (i210 & 896) | (i210 & 7168) | (i29 & 57344));
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var10;
                        z15 = z16;
                        p20Var2 = p20VarA;
                        function4 = function5;
                        jVar3 = jVar4;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        a0Var3 = a0Var2;
                        function4 = function3;
                        z15 = z13;
                        p20Var2 = p20VarA;
                        jVar3 = jVar2;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.r20
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return t20.d(z10, function1, a0Var3, function4, z15, p20Var2, jVar3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 1572864;
                jVar2 = jVar;
                if ((i12 & 599187) != 599186) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c0VarR.h(z14, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i19 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            function3 = null;
                        }
                        if (i15 != 0) {
                            z13 = true;
                        }
                        if ((i11 & 32) != 0) {
                            i12 &= -458753;
                            p20VarA = q20.f32058a.a(c0VarR, 6);
                        }
                        if (i17 != 0) {
                            jVar4 = null;
                        } else {
                            jVar4 = jVar2;
                        }
                        function5 = function3;
                        a0Var5 = a0Var4;
                    } else {
                        if (i19 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            function3 = null;
                        }
                        if (i15 != 0) {
                            z13 = true;
                        }
                        if ((i11 & 32) != 0) {
                            i12 &= -458753;
                            p20VarA = q20.f32058a.a(c0VarR, 6);
                        }
                        if (i17 != 0) {
                            jVar4 = null;
                        } else {
                            jVar4 = jVar2;
                        }
                        function5 = function3;
                        a0Var5 = a0Var4;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-263339167, i12, -1, "androidx.compose.material3.Switch (Switch.kt:98)");
                    }
                    if (jVar4 == null) {
                        c0VarR.E(1768604058);
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = androidx.compose.foundation.interaction.i.a();
                            c0VarR.Y(objI0);
                        }
                        c0VarR.A();
                        jVar5 = (androidx.compose.foundation.interaction.j) objI0;
                    } else {
                        c0VarR.E(334145757);
                        c0VarR.A();
                        jVar5 = jVar4;
                    }
                    if (function1 != null) {
                        z16 = z13;
                        z17 = false;
                        a0VarA = androidx.compose.foundation.selection.e.a(wi.j(androidx.compose.ui.a0.E), z12, jVar5, null, z16, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.g()), function1);
                    } else {
                        z16 = z13;
                        z17 = false;
                        a0VarA = androidx.compose.ui.a0.E;
                    }
                    int i211 = i12 << 3;
                    int i212 = i12 >> 6;
                    c0Var2 = c0VarR;
                    androidx.compose.ui.a0 a0Var11 = a0Var5;
                    e(androidx.compose.foundation.layout.i6.q(androidx.compose.foundation.layout.i6.H(a0Var5.B2(a0VarA), androidx.compose.ui.e.f37317a.i(), z17, 2, null), f33062c, f33063d), z10, z16, p20VarA, function5, jVar5, cx.i(d0.y2.f269421a.n(), c0VarR, 6), c0Var2, (i211 & com.planner5d.library.engine.input.f.b.B) | (i212 & 896) | (i212 & 7168) | (i211 & 57344));
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var11;
                    z15 = z16;
                    p20Var2 = p20VarA;
                    function4 = function5;
                    jVar3 = jVar4;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var3 = a0Var2;
                    function4 = function3;
                    z15 = z13;
                    p20Var2 = p20VarA;
                    jVar3 = jVar2;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.r20
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return t20.d(z10, function1, a0Var3, function4, z15, p20Var2, jVar3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 24576;
            z13 = z11;
            if ((196608 & i10) == 0) {
                if ((i11 & 32) == 0) {
                    p20VarA = p20Var;
                    if (c0VarR.D(p20VarA)) {
                    }
                    i12 |= i20;
                } else {
                    p20VarA = p20Var;
                }
                i12 |= i20;
            } else {
                p20VarA = p20Var;
            }
            i17 = i11 & 64;
            if (i17 != 0) {
                if ((1572864 & i10) == 0) {
                    jVar2 = jVar;
                    if (c0VarR.D(jVar2)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i12 |= i18;
                }
                if ((i12 & 599187) != 599186) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c0VarR.h(z14, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i19 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            function3 = null;
                        }
                        if (i15 != 0) {
                            z13 = true;
                        }
                        if ((i11 & 32) != 0) {
                            i12 &= -458753;
                            p20VarA = q20.f32058a.a(c0VarR, 6);
                        }
                        if (i17 != 0) {
                            jVar4 = null;
                        } else {
                            jVar4 = jVar2;
                        }
                        function5 = function3;
                        a0Var5 = a0Var4;
                    } else {
                        if (i19 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            function3 = null;
                        }
                        if (i15 != 0) {
                            z13 = true;
                        }
                        if ((i11 & 32) != 0) {
                            i12 &= -458753;
                            p20VarA = q20.f32058a.a(c0VarR, 6);
                        }
                        if (i17 != 0) {
                            jVar4 = null;
                        } else {
                            jVar4 = jVar2;
                        }
                        function5 = function3;
                        a0Var5 = a0Var4;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-263339167, i12, -1, "androidx.compose.material3.Switch (Switch.kt:98)");
                    }
                    if (jVar4 == null) {
                        c0VarR.E(1768604058);
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = androidx.compose.foundation.interaction.i.a();
                            c0VarR.Y(objI0);
                        }
                        c0VarR.A();
                        jVar5 = (androidx.compose.foundation.interaction.j) objI0;
                    } else {
                        c0VarR.E(334145757);
                        c0VarR.A();
                        jVar5 = jVar4;
                    }
                    if (function1 != null) {
                        z16 = z13;
                        z17 = false;
                        a0VarA = androidx.compose.foundation.selection.e.a(wi.j(androidx.compose.ui.a0.E), z12, jVar5, null, z16, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.g()), function1);
                    } else {
                        z16 = z13;
                        z17 = false;
                        a0VarA = androidx.compose.ui.a0.E;
                    }
                    int i213 = i12 << 3;
                    int i214 = i12 >> 6;
                    c0Var2 = c0VarR;
                    androidx.compose.ui.a0 a0Var12 = a0Var5;
                    e(androidx.compose.foundation.layout.i6.q(androidx.compose.foundation.layout.i6.H(a0Var5.B2(a0VarA), androidx.compose.ui.e.f37317a.i(), z17, 2, null), f33062c, f33063d), z10, z16, p20VarA, function5, jVar5, cx.i(d0.y2.f269421a.n(), c0VarR, 6), c0Var2, (i213 & com.planner5d.library.engine.input.f.b.B) | (i214 & 896) | (i214 & 7168) | (i213 & 57344));
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var12;
                    z15 = z16;
                    p20Var2 = p20VarA;
                    function4 = function5;
                    jVar3 = jVar4;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var3 = a0Var2;
                    function4 = function3;
                    z15 = z13;
                    p20Var2 = p20VarA;
                    jVar3 = jVar2;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.r20
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return t20.d(z10, function1, a0Var3, function4, z15, p20Var2, jVar3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 1572864;
            jVar2 = jVar;
            if ((i12 & 599187) != 599186) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c0VarR.h(z14, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i19 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        function3 = null;
                    }
                    if (i15 != 0) {
                        z13 = true;
                    }
                    if ((i11 & 32) != 0) {
                        i12 &= -458753;
                        p20VarA = q20.f32058a.a(c0VarR, 6);
                    }
                    if (i17 != 0) {
                        jVar4 = null;
                    } else {
                        jVar4 = jVar2;
                    }
                    function5 = function3;
                    a0Var5 = a0Var4;
                } else {
                    if (i19 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        function3 = null;
                    }
                    if (i15 != 0) {
                        z13 = true;
                    }
                    if ((i11 & 32) != 0) {
                        i12 &= -458753;
                        p20VarA = q20.f32058a.a(c0VarR, 6);
                    }
                    if (i17 != 0) {
                        jVar4 = null;
                    } else {
                        jVar4 = jVar2;
                    }
                    function5 = function3;
                    a0Var5 = a0Var4;
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-263339167, i12, -1, "androidx.compose.material3.Switch (Switch.kt:98)");
                }
                if (jVar4 == null) {
                    c0VarR.E(1768604058);
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = androidx.compose.foundation.interaction.i.a();
                        c0VarR.Y(objI0);
                    }
                    c0VarR.A();
                    jVar5 = (androidx.compose.foundation.interaction.j) objI0;
                } else {
                    c0VarR.E(334145757);
                    c0VarR.A();
                    jVar5 = jVar4;
                }
                if (function1 != null) {
                    z16 = z13;
                    z17 = false;
                    a0VarA = androidx.compose.foundation.selection.e.a(wi.j(androidx.compose.ui.a0.E), z12, jVar5, null, z16, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.g()), function1);
                } else {
                    z16 = z13;
                    z17 = false;
                    a0VarA = androidx.compose.ui.a0.E;
                }
                int i215 = i12 << 3;
                int i216 = i12 >> 6;
                c0Var2 = c0VarR;
                androidx.compose.ui.a0 a0Var13 = a0Var5;
                e(androidx.compose.foundation.layout.i6.q(androidx.compose.foundation.layout.i6.H(a0Var5.B2(a0VarA), androidx.compose.ui.e.f37317a.i(), z17, 2, null), f33062c, f33063d), z10, z16, p20VarA, function5, jVar5, cx.i(d0.y2.f269421a.n(), c0VarR, 6), c0Var2, (i215 & com.planner5d.library.engine.input.f.b.B) | (i216 & 896) | (i216 & 7168) | (i215 & 57344));
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var13;
                z15 = z16;
                p20Var2 = p20VarA;
                function4 = function5;
                jVar3 = jVar4;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var3 = a0Var2;
                function4 = function3;
                z15 = z13;
                p20Var2 = p20VarA;
                jVar3 = jVar2;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.r20
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return t20.d(z10, function1, a0Var3, function4, z15, p20Var2, jVar3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= androidx.media3.exoplayer.a5.S0;
        a0Var2 = a0Var;
        i13 = i11 & 8;
        if (i13 != 0) {
            if ((i10 & 3072) == 0) {
                function3 = function2;
                if (c0VarR.k0(function3)) {
                    i14 = 2048;
                } else {
                    i14 = 1024;
                }
                i12 |= i14;
            }
            i15 = i11 & 16;
            if (i15 != 0) {
                if ((i10 & 24576) == 0) {
                    z13 = z11;
                    if (c0VarR.G(z13)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i12 |= i16;
                }
                if ((196608 & i10) == 0) {
                    if ((i11 & 32) == 0) {
                        p20VarA = p20Var;
                        if (c0VarR.D(p20VarA)) {
                        }
                        i12 |= i20;
                    } else {
                        p20VarA = p20Var;
                    }
                    i12 |= i20;
                } else {
                    p20VarA = p20Var;
                }
                i17 = i11 & 64;
                if (i17 != 0) {
                    if ((1572864 & i10) == 0) {
                        jVar2 = jVar;
                        if (c0VarR.D(jVar2)) {
                            i18 = 1048576;
                        } else {
                            i18 = 524288;
                        }
                        i12 |= i18;
                    }
                    if ((i12 & 599187) != 599186) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c0VarR.h(z14, i12 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i19 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i13 != 0) {
                                function3 = null;
                            }
                            if (i15 != 0) {
                                z13 = true;
                            }
                            if ((i11 & 32) != 0) {
                                i12 &= -458753;
                                p20VarA = q20.f32058a.a(c0VarR, 6);
                            }
                            if (i17 != 0) {
                                jVar4 = null;
                            } else {
                                jVar4 = jVar2;
                            }
                            function5 = function3;
                            a0Var5 = a0Var4;
                        } else {
                            if (i19 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i13 != 0) {
                                function3 = null;
                            }
                            if (i15 != 0) {
                                z13 = true;
                            }
                            if ((i11 & 32) != 0) {
                                i12 &= -458753;
                                p20VarA = q20.f32058a.a(c0VarR, 6);
                            }
                            if (i17 != 0) {
                                jVar4 = null;
                            } else {
                                jVar4 = jVar2;
                            }
                            function5 = function3;
                            a0Var5 = a0Var4;
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-263339167, i12, -1, "androidx.compose.material3.Switch (Switch.kt:98)");
                        }
                        if (jVar4 == null) {
                            c0VarR.E(1768604058);
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = androidx.compose.foundation.interaction.i.a();
                                c0VarR.Y(objI0);
                            }
                            c0VarR.A();
                            jVar5 = (androidx.compose.foundation.interaction.j) objI0;
                        } else {
                            c0VarR.E(334145757);
                            c0VarR.A();
                            jVar5 = jVar4;
                        }
                        if (function1 != null) {
                            z16 = z13;
                            z17 = false;
                            a0VarA = androidx.compose.foundation.selection.e.a(wi.j(androidx.compose.ui.a0.E), z12, jVar5, null, z16, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.g()), function1);
                        } else {
                            z16 = z13;
                            z17 = false;
                            a0VarA = androidx.compose.ui.a0.E;
                        }
                        int i217 = i12 << 3;
                        int i218 = i12 >> 6;
                        c0Var2 = c0VarR;
                        androidx.compose.ui.a0 a0Var14 = a0Var5;
                        e(androidx.compose.foundation.layout.i6.q(androidx.compose.foundation.layout.i6.H(a0Var5.B2(a0VarA), androidx.compose.ui.e.f37317a.i(), z17, 2, null), f33062c, f33063d), z10, z16, p20VarA, function5, jVar5, cx.i(d0.y2.f269421a.n(), c0VarR, 6), c0Var2, (i217 & com.planner5d.library.engine.input.f.b.B) | (i218 & 896) | (i218 & 7168) | (i217 & 57344));
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var14;
                        z15 = z16;
                        p20Var2 = p20VarA;
                        function4 = function5;
                        jVar3 = jVar4;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        a0Var3 = a0Var2;
                        function4 = function3;
                        z15 = z13;
                        p20Var2 = p20VarA;
                        jVar3 = jVar2;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.r20
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return t20.d(z10, function1, a0Var3, function4, z15, p20Var2, jVar3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 1572864;
                jVar2 = jVar;
                if ((i12 & 599187) != 599186) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c0VarR.h(z14, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i19 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            function3 = null;
                        }
                        if (i15 != 0) {
                            z13 = true;
                        }
                        if ((i11 & 32) != 0) {
                            i12 &= -458753;
                            p20VarA = q20.f32058a.a(c0VarR, 6);
                        }
                        if (i17 != 0) {
                            jVar4 = null;
                        } else {
                            jVar4 = jVar2;
                        }
                        function5 = function3;
                        a0Var5 = a0Var4;
                    } else {
                        if (i19 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            function3 = null;
                        }
                        if (i15 != 0) {
                            z13 = true;
                        }
                        if ((i11 & 32) != 0) {
                            i12 &= -458753;
                            p20VarA = q20.f32058a.a(c0VarR, 6);
                        }
                        if (i17 != 0) {
                            jVar4 = null;
                        } else {
                            jVar4 = jVar2;
                        }
                        function5 = function3;
                        a0Var5 = a0Var4;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-263339167, i12, -1, "androidx.compose.material3.Switch (Switch.kt:98)");
                    }
                    if (jVar4 == null) {
                        c0VarR.E(1768604058);
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = androidx.compose.foundation.interaction.i.a();
                            c0VarR.Y(objI0);
                        }
                        c0VarR.A();
                        jVar5 = (androidx.compose.foundation.interaction.j) objI0;
                    } else {
                        c0VarR.E(334145757);
                        c0VarR.A();
                        jVar5 = jVar4;
                    }
                    if (function1 != null) {
                        z16 = z13;
                        z17 = false;
                        a0VarA = androidx.compose.foundation.selection.e.a(wi.j(androidx.compose.ui.a0.E), z12, jVar5, null, z16, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.g()), function1);
                    } else {
                        z16 = z13;
                        z17 = false;
                        a0VarA = androidx.compose.ui.a0.E;
                    }
                    int i219 = i12 << 3;
                    int i2110 = i12 >> 6;
                    c0Var2 = c0VarR;
                    androidx.compose.ui.a0 a0Var15 = a0Var5;
                    e(androidx.compose.foundation.layout.i6.q(androidx.compose.foundation.layout.i6.H(a0Var5.B2(a0VarA), androidx.compose.ui.e.f37317a.i(), z17, 2, null), f33062c, f33063d), z10, z16, p20VarA, function5, jVar5, cx.i(d0.y2.f269421a.n(), c0VarR, 6), c0Var2, (i219 & com.planner5d.library.engine.input.f.b.B) | (i2110 & 896) | (i2110 & 7168) | (i219 & 57344));
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var15;
                    z15 = z16;
                    p20Var2 = p20VarA;
                    function4 = function5;
                    jVar3 = jVar4;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var3 = a0Var2;
                    function4 = function3;
                    z15 = z13;
                    p20Var2 = p20VarA;
                    jVar3 = jVar2;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.r20
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return t20.d(z10, function1, a0Var3, function4, z15, p20Var2, jVar3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 24576;
            z13 = z11;
            if ((196608 & i10) == 0) {
                if ((i11 & 32) == 0) {
                    p20VarA = p20Var;
                    if (c0VarR.D(p20VarA)) {
                    }
                    i12 |= i20;
                } else {
                    p20VarA = p20Var;
                }
                i12 |= i20;
            } else {
                p20VarA = p20Var;
            }
            i17 = i11 & 64;
            if (i17 != 0) {
                if ((1572864 & i10) == 0) {
                    jVar2 = jVar;
                    if (c0VarR.D(jVar2)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i12 |= i18;
                }
                if ((i12 & 599187) != 599186) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c0VarR.h(z14, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i19 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            function3 = null;
                        }
                        if (i15 != 0) {
                            z13 = true;
                        }
                        if ((i11 & 32) != 0) {
                            i12 &= -458753;
                            p20VarA = q20.f32058a.a(c0VarR, 6);
                        }
                        if (i17 != 0) {
                            jVar4 = null;
                        } else {
                            jVar4 = jVar2;
                        }
                        function5 = function3;
                        a0Var5 = a0Var4;
                    } else {
                        if (i19 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            function3 = null;
                        }
                        if (i15 != 0) {
                            z13 = true;
                        }
                        if ((i11 & 32) != 0) {
                            i12 &= -458753;
                            p20VarA = q20.f32058a.a(c0VarR, 6);
                        }
                        if (i17 != 0) {
                            jVar4 = null;
                        } else {
                            jVar4 = jVar2;
                        }
                        function5 = function3;
                        a0Var5 = a0Var4;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-263339167, i12, -1, "androidx.compose.material3.Switch (Switch.kt:98)");
                    }
                    if (jVar4 == null) {
                        c0VarR.E(1768604058);
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = androidx.compose.foundation.interaction.i.a();
                            c0VarR.Y(objI0);
                        }
                        c0VarR.A();
                        jVar5 = (androidx.compose.foundation.interaction.j) objI0;
                    } else {
                        c0VarR.E(334145757);
                        c0VarR.A();
                        jVar5 = jVar4;
                    }
                    if (function1 != null) {
                        z16 = z13;
                        z17 = false;
                        a0VarA = androidx.compose.foundation.selection.e.a(wi.j(androidx.compose.ui.a0.E), z12, jVar5, null, z16, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.g()), function1);
                    } else {
                        z16 = z13;
                        z17 = false;
                        a0VarA = androidx.compose.ui.a0.E;
                    }
                    int i2111 = i12 << 3;
                    int i2112 = i12 >> 6;
                    c0Var2 = c0VarR;
                    androidx.compose.ui.a0 a0Var16 = a0Var5;
                    e(androidx.compose.foundation.layout.i6.q(androidx.compose.foundation.layout.i6.H(a0Var5.B2(a0VarA), androidx.compose.ui.e.f37317a.i(), z17, 2, null), f33062c, f33063d), z10, z16, p20VarA, function5, jVar5, cx.i(d0.y2.f269421a.n(), c0VarR, 6), c0Var2, (i2111 & com.planner5d.library.engine.input.f.b.B) | (i2112 & 896) | (i2112 & 7168) | (i2111 & 57344));
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var16;
                    z15 = z16;
                    p20Var2 = p20VarA;
                    function4 = function5;
                    jVar3 = jVar4;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var3 = a0Var2;
                    function4 = function3;
                    z15 = z13;
                    p20Var2 = p20VarA;
                    jVar3 = jVar2;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.r20
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return t20.d(z10, function1, a0Var3, function4, z15, p20Var2, jVar3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 1572864;
            jVar2 = jVar;
            if ((i12 & 599187) != 599186) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c0VarR.h(z14, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i19 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        function3 = null;
                    }
                    if (i15 != 0) {
                        z13 = true;
                    }
                    if ((i11 & 32) != 0) {
                        i12 &= -458753;
                        p20VarA = q20.f32058a.a(c0VarR, 6);
                    }
                    if (i17 != 0) {
                        jVar4 = null;
                    } else {
                        jVar4 = jVar2;
                    }
                    function5 = function3;
                    a0Var5 = a0Var4;
                } else {
                    if (i19 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        function3 = null;
                    }
                    if (i15 != 0) {
                        z13 = true;
                    }
                    if ((i11 & 32) != 0) {
                        i12 &= -458753;
                        p20VarA = q20.f32058a.a(c0VarR, 6);
                    }
                    if (i17 != 0) {
                        jVar4 = null;
                    } else {
                        jVar4 = jVar2;
                    }
                    function5 = function3;
                    a0Var5 = a0Var4;
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-263339167, i12, -1, "androidx.compose.material3.Switch (Switch.kt:98)");
                }
                if (jVar4 == null) {
                    c0VarR.E(1768604058);
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = androidx.compose.foundation.interaction.i.a();
                        c0VarR.Y(objI0);
                    }
                    c0VarR.A();
                    jVar5 = (androidx.compose.foundation.interaction.j) objI0;
                } else {
                    c0VarR.E(334145757);
                    c0VarR.A();
                    jVar5 = jVar4;
                }
                if (function1 != null) {
                    z16 = z13;
                    z17 = false;
                    a0VarA = androidx.compose.foundation.selection.e.a(wi.j(androidx.compose.ui.a0.E), z12, jVar5, null, z16, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.g()), function1);
                } else {
                    z16 = z13;
                    z17 = false;
                    a0VarA = androidx.compose.ui.a0.E;
                }
                int i2113 = i12 << 3;
                int i2114 = i12 >> 6;
                c0Var2 = c0VarR;
                androidx.compose.ui.a0 a0Var17 = a0Var5;
                e(androidx.compose.foundation.layout.i6.q(androidx.compose.foundation.layout.i6.H(a0Var5.B2(a0VarA), androidx.compose.ui.e.f37317a.i(), z17, 2, null), f33062c, f33063d), z10, z16, p20VarA, function5, jVar5, cx.i(d0.y2.f269421a.n(), c0VarR, 6), c0Var2, (i2113 & com.planner5d.library.engine.input.f.b.B) | (i2114 & 896) | (i2114 & 7168) | (i2113 & 57344));
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var17;
                z15 = z16;
                p20Var2 = p20VarA;
                function4 = function5;
                jVar3 = jVar4;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var3 = a0Var2;
                function4 = function3;
                z15 = z13;
                p20Var2 = p20VarA;
                jVar3 = jVar2;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.r20
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return t20.d(z10, function1, a0Var3, function4, z15, p20Var2, jVar3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 3072;
        function3 = function2;
        i15 = i11 & 16;
        if (i15 != 0) {
            if ((i10 & 24576) == 0) {
                z13 = z11;
                if (c0VarR.G(z13)) {
                    i16 = 16384;
                } else {
                    i16 = 8192;
                }
                i12 |= i16;
            }
            if ((196608 & i10) == 0) {
                if ((i11 & 32) == 0) {
                    p20VarA = p20Var;
                    if (c0VarR.D(p20VarA)) {
                    }
                    i12 |= i20;
                } else {
                    p20VarA = p20Var;
                }
                i12 |= i20;
            } else {
                p20VarA = p20Var;
            }
            i17 = i11 & 64;
            if (i17 != 0) {
                if ((1572864 & i10) == 0) {
                    jVar2 = jVar;
                    if (c0VarR.D(jVar2)) {
                        i18 = 1048576;
                    } else {
                        i18 = 524288;
                    }
                    i12 |= i18;
                }
                if ((i12 & 599187) != 599186) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c0VarR.h(z14, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i19 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            function3 = null;
                        }
                        if (i15 != 0) {
                            z13 = true;
                        }
                        if ((i11 & 32) != 0) {
                            i12 &= -458753;
                            p20VarA = q20.f32058a.a(c0VarR, 6);
                        }
                        if (i17 != 0) {
                            jVar4 = null;
                        } else {
                            jVar4 = jVar2;
                        }
                        function5 = function3;
                        a0Var5 = a0Var4;
                    } else {
                        if (i19 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            function3 = null;
                        }
                        if (i15 != 0) {
                            z13 = true;
                        }
                        if ((i11 & 32) != 0) {
                            i12 &= -458753;
                            p20VarA = q20.f32058a.a(c0VarR, 6);
                        }
                        if (i17 != 0) {
                            jVar4 = null;
                        } else {
                            jVar4 = jVar2;
                        }
                        function5 = function3;
                        a0Var5 = a0Var4;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-263339167, i12, -1, "androidx.compose.material3.Switch (Switch.kt:98)");
                    }
                    if (jVar4 == null) {
                        c0VarR.E(1768604058);
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = androidx.compose.foundation.interaction.i.a();
                            c0VarR.Y(objI0);
                        }
                        c0VarR.A();
                        jVar5 = (androidx.compose.foundation.interaction.j) objI0;
                    } else {
                        c0VarR.E(334145757);
                        c0VarR.A();
                        jVar5 = jVar4;
                    }
                    if (function1 != null) {
                        z16 = z13;
                        z17 = false;
                        a0VarA = androidx.compose.foundation.selection.e.a(wi.j(androidx.compose.ui.a0.E), z12, jVar5, null, z16, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.g()), function1);
                    } else {
                        z16 = z13;
                        z17 = false;
                        a0VarA = androidx.compose.ui.a0.E;
                    }
                    int i2115 = i12 << 3;
                    int i2116 = i12 >> 6;
                    c0Var2 = c0VarR;
                    androidx.compose.ui.a0 a0Var18 = a0Var5;
                    e(androidx.compose.foundation.layout.i6.q(androidx.compose.foundation.layout.i6.H(a0Var5.B2(a0VarA), androidx.compose.ui.e.f37317a.i(), z17, 2, null), f33062c, f33063d), z10, z16, p20VarA, function5, jVar5, cx.i(d0.y2.f269421a.n(), c0VarR, 6), c0Var2, (i2115 & com.planner5d.library.engine.input.f.b.B) | (i2116 & 896) | (i2116 & 7168) | (i2115 & 57344));
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var18;
                    z15 = z16;
                    p20Var2 = p20VarA;
                    function4 = function5;
                    jVar3 = jVar4;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var3 = a0Var2;
                    function4 = function3;
                    z15 = z13;
                    p20Var2 = p20VarA;
                    jVar3 = jVar2;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.r20
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return t20.d(z10, function1, a0Var3, function4, z15, p20Var2, jVar3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 1572864;
            jVar2 = jVar;
            if ((i12 & 599187) != 599186) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c0VarR.h(z14, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i19 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        function3 = null;
                    }
                    if (i15 != 0) {
                        z13 = true;
                    }
                    if ((i11 & 32) != 0) {
                        i12 &= -458753;
                        p20VarA = q20.f32058a.a(c0VarR, 6);
                    }
                    if (i17 != 0) {
                        jVar4 = null;
                    } else {
                        jVar4 = jVar2;
                    }
                    function5 = function3;
                    a0Var5 = a0Var4;
                } else {
                    if (i19 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        function3 = null;
                    }
                    if (i15 != 0) {
                        z13 = true;
                    }
                    if ((i11 & 32) != 0) {
                        i12 &= -458753;
                        p20VarA = q20.f32058a.a(c0VarR, 6);
                    }
                    if (i17 != 0) {
                        jVar4 = null;
                    } else {
                        jVar4 = jVar2;
                    }
                    function5 = function3;
                    a0Var5 = a0Var4;
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-263339167, i12, -1, "androidx.compose.material3.Switch (Switch.kt:98)");
                }
                if (jVar4 == null) {
                    c0VarR.E(1768604058);
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = androidx.compose.foundation.interaction.i.a();
                        c0VarR.Y(objI0);
                    }
                    c0VarR.A();
                    jVar5 = (androidx.compose.foundation.interaction.j) objI0;
                } else {
                    c0VarR.E(334145757);
                    c0VarR.A();
                    jVar5 = jVar4;
                }
                if (function1 != null) {
                    z16 = z13;
                    z17 = false;
                    a0VarA = androidx.compose.foundation.selection.e.a(wi.j(androidx.compose.ui.a0.E), z12, jVar5, null, z16, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.g()), function1);
                } else {
                    z16 = z13;
                    z17 = false;
                    a0VarA = androidx.compose.ui.a0.E;
                }
                int i2117 = i12 << 3;
                int i2118 = i12 >> 6;
                c0Var2 = c0VarR;
                androidx.compose.ui.a0 a0Var19 = a0Var5;
                e(androidx.compose.foundation.layout.i6.q(androidx.compose.foundation.layout.i6.H(a0Var5.B2(a0VarA), androidx.compose.ui.e.f37317a.i(), z17, 2, null), f33062c, f33063d), z10, z16, p20VarA, function5, jVar5, cx.i(d0.y2.f269421a.n(), c0VarR, 6), c0Var2, (i2117 & com.planner5d.library.engine.input.f.b.B) | (i2118 & 896) | (i2118 & 7168) | (i2117 & 57344));
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var19;
                z15 = z16;
                p20Var2 = p20VarA;
                function4 = function5;
                jVar3 = jVar4;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var3 = a0Var2;
                function4 = function3;
                z15 = z13;
                p20Var2 = p20VarA;
                jVar3 = jVar2;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.r20
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return t20.d(z10, function1, a0Var3, function4, z15, p20Var2, jVar3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 24576;
        z13 = z11;
        if ((196608 & i10) == 0) {
            if ((i11 & 32) == 0) {
                p20VarA = p20Var;
                if (c0VarR.D(p20VarA)) {
                }
                i12 |= i20;
            } else {
                p20VarA = p20Var;
            }
            i12 |= i20;
        } else {
            p20VarA = p20Var;
        }
        i17 = i11 & 64;
        if (i17 != 0) {
            if ((1572864 & i10) == 0) {
                jVar2 = jVar;
                if (c0VarR.D(jVar2)) {
                    i18 = 1048576;
                } else {
                    i18 = 524288;
                }
                i12 |= i18;
            }
            if ((i12 & 599187) != 599186) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c0VarR.h(z14, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i19 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        function3 = null;
                    }
                    if (i15 != 0) {
                        z13 = true;
                    }
                    if ((i11 & 32) != 0) {
                        i12 &= -458753;
                        p20VarA = q20.f32058a.a(c0VarR, 6);
                    }
                    if (i17 != 0) {
                        jVar4 = null;
                    } else {
                        jVar4 = jVar2;
                    }
                    function5 = function3;
                    a0Var5 = a0Var4;
                } else {
                    if (i19 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        function3 = null;
                    }
                    if (i15 != 0) {
                        z13 = true;
                    }
                    if ((i11 & 32) != 0) {
                        i12 &= -458753;
                        p20VarA = q20.f32058a.a(c0VarR, 6);
                    }
                    if (i17 != 0) {
                        jVar4 = null;
                    } else {
                        jVar4 = jVar2;
                    }
                    function5 = function3;
                    a0Var5 = a0Var4;
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-263339167, i12, -1, "androidx.compose.material3.Switch (Switch.kt:98)");
                }
                if (jVar4 == null) {
                    c0VarR.E(1768604058);
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = androidx.compose.foundation.interaction.i.a();
                        c0VarR.Y(objI0);
                    }
                    c0VarR.A();
                    jVar5 = (androidx.compose.foundation.interaction.j) objI0;
                } else {
                    c0VarR.E(334145757);
                    c0VarR.A();
                    jVar5 = jVar4;
                }
                if (function1 != null) {
                    z16 = z13;
                    z17 = false;
                    a0VarA = androidx.compose.foundation.selection.e.a(wi.j(androidx.compose.ui.a0.E), z12, jVar5, null, z16, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.g()), function1);
                } else {
                    z16 = z13;
                    z17 = false;
                    a0VarA = androidx.compose.ui.a0.E;
                }
                int i2119 = i12 << 3;
                int i21110 = i12 >> 6;
                c0Var2 = c0VarR;
                androidx.compose.ui.a0 a0Var110 = a0Var5;
                e(androidx.compose.foundation.layout.i6.q(androidx.compose.foundation.layout.i6.H(a0Var5.B2(a0VarA), androidx.compose.ui.e.f37317a.i(), z17, 2, null), f33062c, f33063d), z10, z16, p20VarA, function5, jVar5, cx.i(d0.y2.f269421a.n(), c0VarR, 6), c0Var2, (i2119 & com.planner5d.library.engine.input.f.b.B) | (i21110 & 896) | (i21110 & 7168) | (i2119 & 57344));
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var110;
                z15 = z16;
                p20Var2 = p20VarA;
                function4 = function5;
                jVar3 = jVar4;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var3 = a0Var2;
                function4 = function3;
                z15 = z13;
                p20Var2 = p20VarA;
                jVar3 = jVar2;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.r20
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return t20.d(z10, function1, a0Var3, function4, z15, p20Var2, jVar3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 1572864;
        jVar2 = jVar;
        if ((i12 & 599187) != 599186) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c0VarR.h(z14, i12 & 1)) {
            c0VarR.l0();
            if ((i10 & 1) != 0) {
                if (i19 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if (i13 != 0) {
                    function3 = null;
                }
                if (i15 != 0) {
                    z13 = true;
                }
                if ((i11 & 32) != 0) {
                    i12 &= -458753;
                    p20VarA = q20.f32058a.a(c0VarR, 6);
                }
                if (i17 != 0) {
                    jVar4 = null;
                } else {
                    jVar4 = jVar2;
                }
                function5 = function3;
                a0Var5 = a0Var4;
            } else {
                if (i19 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if (i13 != 0) {
                    function3 = null;
                }
                if (i15 != 0) {
                    z13 = true;
                }
                if ((i11 & 32) != 0) {
                    i12 &= -458753;
                    p20VarA = q20.f32058a.a(c0VarR, 6);
                }
                if (i17 != 0) {
                    jVar4 = null;
                } else {
                    jVar4 = jVar2;
                }
                function5 = function3;
                a0Var5 = a0Var4;
            }
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-263339167, i12, -1, "androidx.compose.material3.Switch (Switch.kt:98)");
            }
            if (jVar4 == null) {
                c0VarR.E(1768604058);
                objI0 = c0VarR.i0();
                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = androidx.compose.foundation.interaction.i.a();
                    c0VarR.Y(objI0);
                }
                c0VarR.A();
                jVar5 = (androidx.compose.foundation.interaction.j) objI0;
            } else {
                c0VarR.E(334145757);
                c0VarR.A();
                jVar5 = jVar4;
            }
            if (function1 != null) {
                z16 = z13;
                z17 = false;
                a0VarA = androidx.compose.foundation.selection.e.a(wi.j(androidx.compose.ui.a0.E), z12, jVar5, null, z16, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.g()), function1);
            } else {
                z16 = z13;
                z17 = false;
                a0VarA = androidx.compose.ui.a0.E;
            }
            int i21111 = i12 << 3;
            int i21112 = i12 >> 6;
            c0Var2 = c0VarR;
            androidx.compose.ui.a0 a0Var111 = a0Var5;
            e(androidx.compose.foundation.layout.i6.q(androidx.compose.foundation.layout.i6.H(a0Var5.B2(a0VarA), androidx.compose.ui.e.f37317a.i(), z17, 2, null), f33062c, f33063d), z10, z16, p20VarA, function5, jVar5, cx.i(d0.y2.f269421a.n(), c0VarR, 6), c0Var2, (i21111 & com.planner5d.library.engine.input.f.b.B) | (i21112 & 896) | (i21112 & 7168) | (i21111 & 57344));
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            a0Var3 = a0Var111;
            z15 = z16;
            p20Var2 = p20VarA;
            function4 = function5;
            jVar3 = jVar4;
        } else {
            c0Var2 = c0VarR;
            c0Var2.u();
            a0Var3 = a0Var2;
            function4 = function3;
            z15 = z13;
            p20Var2 = p20VarA;
            jVar3 = jVar2;
        }
        s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.r20
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return t20.d(z10, function1, a0Var3, function4, z15, p20Var2, jVar3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(boolean z10, Function1 function1, androidx.compose.ui.a0 a0Var, Function2 function2, boolean z11, p20 p20Var, androidx.compose.foundation.interaction.j jVar, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        c(z10, function1, a0Var, function2, z11, p20Var, jVar, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    private static final void e(final androidx.compose.ui.a0 a0Var, final boolean z10, final boolean z11, final p20 p20Var, final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, final androidx.compose.foundation.interaction.h hVar, androidx.compose.ui.graphics.q3 q3Var, androidx.compose.runtime.c0 c0Var, final int i10) {
        int i11;
        final androidx.compose.ui.graphics.q3 q3Var2 = q3Var;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-670917213);
        if ((i10 & 6) == 0) {
            i11 = (c0VarR.D(a0Var) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c0VarR.G(z10) ? 32 : 16;
        }
        if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
            i11 |= c0VarR.G(z11) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c0VarR.D(p20Var) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= c0VarR.k0(function2) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= c0VarR.D(hVar) ? 131072 : 65536;
        }
        if ((1572864 & i10) == 0) {
            i11 |= c0VarR.D(q3Var2) ? 1048576 : 524288;
        }
        if (c0VarR.h((599187 & i11) != 599186, i11 & 1)) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-670917213, i11, -1, "androidx.compose.material3.SwitchImpl (Switch.kt:143)");
            }
            long jV = p20Var.v(z11, z10);
            long jU = p20Var.u(z11, z10);
            d0.y2 y2Var = d0.y2.f269421a;
            androidx.compose.ui.graphics.q3 q3VarI = cx.i(y2Var.L(), c0VarR, 6);
            androidx.compose.ui.a0 a0VarC = androidx.compose.foundation.v.c(androidx.compose.foundation.t0.i(a0Var, y2Var.K(), p20Var.a(z11, z10), q3VarI), jV, q3VarI);
            androidx.compose.ui.e.a aVar = androidx.compose.ui.e.f37317a;
            androidx.compose.ui.layout.a1 a1VarK = androidx.compose.foundation.layout.x.k(aVar.C(), false);
            int iJ = androidx.compose.runtime.v.j(c0VarR, 0);
            androidx.compose.runtime.b1 b1VarK = c0VarR.k();
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0VarC);
            androidx.compose.ui.node.g.a aVar2 = androidx.compose.ui.node.g.I;
            Function0<androidx.compose.ui.node.g> function0A = aVar2.a();
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
            androidx.compose.runtime.y7.n(c0VarD, a1VarK, aVar2.e());
            androidx.compose.runtime.y7.n(c0VarD, b1VarK, aVar2.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar2.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iJ))) {
                c0VarD.Y(Integer.valueOf(iJ));
                c0VarD.f(Integer.valueOf(iJ), function2B);
            }
            androidx.compose.runtime.y7.n(c0VarD, a0VarN, aVar2.f());
            androidx.compose.ui.a0 a0VarD = androidx.compose.foundation.w2.d(androidx.compose.foundation.layout.d0.f15956a.b(androidx.compose.ui.a0.E, aVar.o()).B2(new ThumbElement(hVar, z10, hm.b(d0.h1.FastSpatial, c0VarR, 6))), hVar, gt.e(false, androidx.compose.ui.unit.h.r(y2Var.I() / 2), 0L, 4, null));
            q3Var2 = q3Var;
            androidx.compose.ui.a0 a0VarC2 = androidx.compose.foundation.v.c(a0VarD, jU, q3Var2);
            androidx.compose.ui.layout.a1 a1VarK2 = androidx.compose.foundation.layout.x.k(aVar.i(), false);
            int iJ2 = androidx.compose.runtime.v.j(c0VarR, 0);
            androidx.compose.runtime.b1 b1VarK2 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN2 = androidx.compose.ui.m.n(c0VarR, a0VarC2);
            Function0<androidx.compose.ui.node.g> function0A2 = aVar2.a();
            if (c0VarR.S() == null) {
                androidx.compose.runtime.v.r();
            }
            c0VarR.q();
            if (c0VarR.P()) {
                c0VarR.q0(function0A2);
            } else {
                c0VarR.l();
            }
            androidx.compose.runtime.c0 c0VarD2 = androidx.compose.runtime.y7.d(c0VarR);
            androidx.compose.runtime.y7.n(c0VarD2, a1VarK2, aVar2.e());
            androidx.compose.runtime.y7.n(c0VarD2, b1VarK2, aVar2.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B2 = aVar2.b();
            if (c0VarD2.P() || !Intrinsics.areEqual(c0VarD2.i0(), Integer.valueOf(iJ2))) {
                c0VarD2.Y(Integer.valueOf(iJ2));
                c0VarD2.f(Integer.valueOf(iJ2), function2B2);
            }
            androidx.compose.runtime.y7.n(c0VarD2, a0VarN2, aVar2.f());
            if (function2 != null) {
                c0VarR.E(1235836927);
                androidx.compose.runtime.a1.e(c7.a().f(androidx.compose.ui.graphics.q0.n(p20Var.t(z11, z10))), function2, c0VarR, androidx.compose.runtime.n4.f36267i | ((i11 >> 9) & com.planner5d.library.engine.input.f.b.B));
                c0VarR.A();
            } else {
                c0VarR.E(1236071411);
                c0VarR.A();
            }
            c0VarR.o();
            c0VarR.o();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0VarR.u();
        }
        androidx.compose.runtime.s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.s20
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return t20.f(a0Var, z10, z11, p20Var, function2, hVar, q3Var2, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(androidx.compose.ui.a0 a0Var, boolean z10, boolean z11, p20 p20Var, Function2 function2, androidx.compose.foundation.interaction.h hVar, androidx.compose.ui.graphics.q3 q3Var, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        e(a0Var, z10, z11, p20Var, function2, hVar, q3Var, c0Var, androidx.compose.runtime.t4.a(i10 | 1));
        return Unit.f312394a;
    }

    public static final float k() {
        return f33060a;
    }

    public static final float l() {
        return f33061b;
    }
}

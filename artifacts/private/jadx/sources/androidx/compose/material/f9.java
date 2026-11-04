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
@SourceDebugExtension({"SMAP\nIconButton.kt\nKotlin\n*S Kotlin\n*F\n+ 1 IconButton.kt\nandroidx/compose/material/IconButtonKt\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 7 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,127:1\n70#2:128\n68#2,8:129\n77#2:168\n70#2:169\n68#2,8:170\n77#2:209\n79#3,6:137\n86#3,3:152\n89#3,2:161\n93#3:167\n79#3,6:178\n86#3,3:193\n89#3,2:202\n93#3:208\n347#4,9:143\n356#4:163\n357#4,2:165\n347#4,9:184\n356#4:204\n357#4,2:206\n4206#5,6:155\n4206#5,6:196\n75#6:164\n75#6:205\n113#7:210\n*S KotlinDebug\n*F\n+ 1 IconButton.kt\nandroidx/compose/material/IconButtonKt\n*L\n62#1:128\n62#1:129,8\n62#1:168\n106#1:169\n106#1:170,8\n106#1:209\n62#1:137,6\n62#1:152,3\n62#1:161,2\n62#1:167\n106#1:178,6\n106#1:193,3\n106#1:202,2\n106#1:208\n62#1:143,9\n62#1:163\n62#1:165,2\n106#1:184,9\n106#1:204\n106#1:206,2\n62#1:155,6\n106#1:196,6\n75#1:164\n120#1:205\n126#1:210\n*E\n"})
public final class f9 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f22730a = androidx.compose.ui.unit.h.r(24);

    /* JADX WARN: Code duplicated, block: B:100:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004e  */
    /* JADX WARN: Code duplicated, block: B:28:0x0053  */
    /* JADX WARN: Code duplicated, block: B:30:0x0057  */
    /* JADX WARN: Code duplicated, block: B:32:0x005f  */
    /* JADX WARN: Code duplicated, block: B:33:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x0069  */
    /* JADX WARN: Code duplicated, block: B:39:0x006e  */
    /* JADX WARN: Code duplicated, block: B:41:0x0072  */
    /* JADX WARN: Code duplicated, block: B:43:0x007a  */
    /* JADX WARN: Code duplicated, block: B:44:0x007d  */
    /* JADX WARN: Code duplicated, block: B:48:0x0084  */
    /* JADX WARN: Code duplicated, block: B:49:0x0087  */
    /* JADX WARN: Code duplicated, block: B:51:0x008b  */
    /* JADX WARN: Code duplicated, block: B:53:0x0091  */
    /* JADX WARN: Code duplicated, block: B:54:0x0094  */
    /* JADX WARN: Code duplicated, block: B:58:0x009f  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ab A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:63:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:76:0x0112  */
    /* JADX WARN: Code duplicated, block: B:79:0x011e  */
    /* JADX WARN: Code duplicated, block: B:80:0x0122  */
    /* JADX WARN: Code duplicated, block: B:83:0x0141  */
    /* JADX WARN: Code duplicated, block: B:85:0x014f  */
    /* JADX WARN: Code duplicated, block: B:88:0x0168  */
    /* JADX WARN: Code duplicated, block: B:90:0x0180  */
    /* JADX WARN: Code duplicated, block: B:93:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:95:0x01b4  */
    /* JADX WARN: Code duplicated, block: B:98:0x01c2  */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void c(@NotNull final Function0<Unit> function0, @Nullable androidx.compose.ui.a0 a0Var, boolean z10, @Nullable androidx.compose.foundation.interaction.j jVar, @NotNull final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        Function0<Unit> function1;
        int i12;
        androidx.compose.ui.a0 a0Var2;
        int i13;
        boolean z11;
        int i14;
        int i15;
        int i16;
        int i17;
        boolean z12;
        final androidx.compose.ui.a0 a0Var3;
        final boolean z13;
        final androidx.compose.foundation.interaction.j jVar2;
        androidx.compose.runtime.s5 s5VarT;
        androidx.compose.ui.a0 a0Var4;
        boolean z14;
        androidx.compose.foundation.interaction.j jVar3;
        int iJ;
        Function0<androidx.compose.ui.node.g> function0A;
        androidx.compose.runtime.c0 c0VarD;
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B;
        float fB;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1316660641);
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
                i15 = i11 & 8;
                if (i15 != 0) {
                    if ((i10 & 3072) == 0) {
                        if (c0VarR.D(jVar)) {
                            i16 = 2048;
                        } else {
                            i16 = 1024;
                        }
                        i12 |= i16;
                    }
                    if ((i11 & 16) != 0) {
                        i12 |= 24576;
                    } else if ((i10 & 24576) == 0) {
                        if (c0VarR.k0(function2)) {
                            i17 = 16384;
                        } else {
                            i17 = 8192;
                        }
                        i12 |= i17;
                    }
                    if ((i12 & 9363) != 9362) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (c0VarR.h(z12, i12 & 1)) {
                        if (i18 != 0) {
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
                            jVar3 = null;
                        } else {
                            jVar3 = jVar;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(1316660641, i12, -1, "androidx.compose.material.IconButton (IconButton.kt:60)");
                        }
                        androidx.compose.ui.a0 a0VarF = androidx.compose.foundation.i1.f(l9.h(a0Var4), jVar3, wd.h(false, f22730a, 0L, 4, null), z14, null, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.a()), function1, 8, null);
                        androidx.compose.ui.layout.a1 a1VarK = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), false);
                        iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                        androidx.compose.runtime.b1 b1VarK = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0VarF);
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
                        if (z14) {
                            c0VarR.E(-1874697310);
                            fB = ((Number) c0VarR.W(w4.c())).floatValue();
                        } else {
                            c0VarR.E(-1874696477);
                            fB = u4.f25148a.b(c0VarR, 6);
                        }
                        c0VarR.A();
                        androidx.compose.runtime.a1.e(w4.c().f(Float.valueOf(fB)), function2, c0VarR, ((i12 >> 9) & com.planner5d.library.engine.input.f.b.B) | androidx.compose.runtime.n4.f36267i);
                        c0VarR.o();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var4;
                        jVar2 = jVar3;
                        z13 = z14;
                    } else {
                        c0VarR.u();
                        a0Var3 = a0Var2;
                        z13 = z11;
                        jVar2 = jVar;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material.d9
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return f9.d(function0, a0Var3, z13, jVar2, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 3072;
                if ((i11 & 16) != 0) {
                    i12 |= 24576;
                } else if ((i10 & 24576) == 0) {
                    if (c0VarR.k0(function2)) {
                        i17 = 16384;
                    } else {
                        i17 = 8192;
                    }
                    i12 |= i17;
                }
                if ((i12 & 9363) != 9362) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    if (i18 != 0) {
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
                        jVar3 = null;
                    } else {
                        jVar3 = jVar;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1316660641, i12, -1, "androidx.compose.material.IconButton (IconButton.kt:60)");
                    }
                    androidx.compose.ui.a0 a0VarF2 = androidx.compose.foundation.i1.f(l9.h(a0Var4), jVar3, wd.h(false, f22730a, 0L, 4, null), z14, null, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.a()), function1, 8, null);
                    androidx.compose.ui.layout.a1 a1VarK2 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), false);
                    iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                    androidx.compose.runtime.b1 b1VarK2 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN2 = androidx.compose.ui.m.n(c0VarR, a0VarF2);
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
                    if (z14) {
                        c0VarR.E(-1874697310);
                        fB = ((Number) c0VarR.W(w4.c())).floatValue();
                    } else {
                        c0VarR.E(-1874696477);
                        fB = u4.f25148a.b(c0VarR, 6);
                    }
                    c0VarR.A();
                    androidx.compose.runtime.a1.e(w4.c().f(Float.valueOf(fB)), function2, c0VarR, ((i12 >> 9) & com.planner5d.library.engine.input.f.b.B) | androidx.compose.runtime.n4.f36267i);
                    c0VarR.o();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var4;
                    jVar2 = jVar3;
                    z13 = z14;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    z13 = z11;
                    jVar2 = jVar;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.d9
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return f9.d(function0, a0Var3, z13, jVar2, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= androidx.media3.exoplayer.a5.S0;
            z11 = z10;
            i15 = i11 & 8;
            if (i15 != 0) {
                if ((i10 & 3072) == 0) {
                    if (c0VarR.D(jVar)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                if ((i11 & 16) != 0) {
                    i12 |= 24576;
                } else if ((i10 & 24576) == 0) {
                    if (c0VarR.k0(function2)) {
                        i17 = 16384;
                    } else {
                        i17 = 8192;
                    }
                    i12 |= i17;
                }
                if ((i12 & 9363) != 9362) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    if (i18 != 0) {
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
                        jVar3 = null;
                    } else {
                        jVar3 = jVar;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1316660641, i12, -1, "androidx.compose.material.IconButton (IconButton.kt:60)");
                    }
                    androidx.compose.ui.a0 a0VarF3 = androidx.compose.foundation.i1.f(l9.h(a0Var4), jVar3, wd.h(false, f22730a, 0L, 4, null), z14, null, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.a()), function1, 8, null);
                    androidx.compose.ui.layout.a1 a1VarK3 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), false);
                    iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                    androidx.compose.runtime.b1 b1VarK3 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN3 = androidx.compose.ui.m.n(c0VarR, a0VarF3);
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
                    if (z14) {
                        c0VarR.E(-1874697310);
                        fB = ((Number) c0VarR.W(w4.c())).floatValue();
                    } else {
                        c0VarR.E(-1874696477);
                        fB = u4.f25148a.b(c0VarR, 6);
                    }
                    c0VarR.A();
                    androidx.compose.runtime.a1.e(w4.c().f(Float.valueOf(fB)), function2, c0VarR, ((i12 >> 9) & com.planner5d.library.engine.input.f.b.B) | androidx.compose.runtime.n4.f36267i);
                    c0VarR.o();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var4;
                    jVar2 = jVar3;
                    z13 = z14;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    z13 = z11;
                    jVar2 = jVar;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.d9
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return f9.d(function0, a0Var3, z13, jVar2, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 3072;
            if ((i11 & 16) != 0) {
                i12 |= 24576;
            } else if ((i10 & 24576) == 0) {
                if (c0VarR.k0(function2)) {
                    i17 = 16384;
                } else {
                    i17 = 8192;
                }
                i12 |= i17;
            }
            if ((i12 & 9363) != 9362) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i12 & 1)) {
                if (i18 != 0) {
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
                    jVar3 = null;
                } else {
                    jVar3 = jVar;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1316660641, i12, -1, "androidx.compose.material.IconButton (IconButton.kt:60)");
                }
                androidx.compose.ui.a0 a0VarF4 = androidx.compose.foundation.i1.f(l9.h(a0Var4), jVar3, wd.h(false, f22730a, 0L, 4, null), z14, null, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.a()), function1, 8, null);
                androidx.compose.ui.layout.a1 a1VarK4 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), false);
                iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                androidx.compose.runtime.b1 b1VarK4 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN4 = androidx.compose.ui.m.n(c0VarR, a0VarF4);
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
                if (z14) {
                    c0VarR.E(-1874697310);
                    fB = ((Number) c0VarR.W(w4.c())).floatValue();
                } else {
                    c0VarR.E(-1874696477);
                    fB = u4.f25148a.b(c0VarR, 6);
                }
                c0VarR.A();
                androidx.compose.runtime.a1.e(w4.c().f(Float.valueOf(fB)), function2, c0VarR, ((i12 >> 9) & com.planner5d.library.engine.input.f.b.B) | androidx.compose.runtime.n4.f36267i);
                c0VarR.o();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var4;
                jVar2 = jVar3;
                z13 = z14;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                z13 = z11;
                jVar2 = jVar;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material.d9
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return f9.d(function0, a0Var3, z13, jVar2, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
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
                    if (c0VarR.D(jVar)) {
                        i16 = 2048;
                    } else {
                        i16 = 1024;
                    }
                    i12 |= i16;
                }
                if ((i11 & 16) != 0) {
                    i12 |= 24576;
                } else if ((i10 & 24576) == 0) {
                    if (c0VarR.k0(function2)) {
                        i17 = 16384;
                    } else {
                        i17 = 8192;
                    }
                    i12 |= i17;
                }
                if ((i12 & 9363) != 9362) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    if (i18 != 0) {
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
                        jVar3 = null;
                    } else {
                        jVar3 = jVar;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1316660641, i12, -1, "androidx.compose.material.IconButton (IconButton.kt:60)");
                    }
                    androidx.compose.ui.a0 a0VarF5 = androidx.compose.foundation.i1.f(l9.h(a0Var4), jVar3, wd.h(false, f22730a, 0L, 4, null), z14, null, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.a()), function1, 8, null);
                    androidx.compose.ui.layout.a1 a1VarK5 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), false);
                    iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                    androidx.compose.runtime.b1 b1VarK5 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN5 = androidx.compose.ui.m.n(c0VarR, a0VarF5);
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
                    if (z14) {
                        c0VarR.E(-1874697310);
                        fB = ((Number) c0VarR.W(w4.c())).floatValue();
                    } else {
                        c0VarR.E(-1874696477);
                        fB = u4.f25148a.b(c0VarR, 6);
                    }
                    c0VarR.A();
                    androidx.compose.runtime.a1.e(w4.c().f(Float.valueOf(fB)), function2, c0VarR, ((i12 >> 9) & com.planner5d.library.engine.input.f.b.B) | androidx.compose.runtime.n4.f36267i);
                    c0VarR.o();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var4;
                    jVar2 = jVar3;
                    z13 = z14;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    z13 = z11;
                    jVar2 = jVar;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.d9
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return f9.d(function0, a0Var3, z13, jVar2, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 3072;
            if ((i11 & 16) != 0) {
                i12 |= 24576;
            } else if ((i10 & 24576) == 0) {
                if (c0VarR.k0(function2)) {
                    i17 = 16384;
                } else {
                    i17 = 8192;
                }
                i12 |= i17;
            }
            if ((i12 & 9363) != 9362) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i12 & 1)) {
                if (i18 != 0) {
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
                    jVar3 = null;
                } else {
                    jVar3 = jVar;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1316660641, i12, -1, "androidx.compose.material.IconButton (IconButton.kt:60)");
                }
                androidx.compose.ui.a0 a0VarF6 = androidx.compose.foundation.i1.f(l9.h(a0Var4), jVar3, wd.h(false, f22730a, 0L, 4, null), z14, null, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.a()), function1, 8, null);
                androidx.compose.ui.layout.a1 a1VarK6 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), false);
                iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                androidx.compose.runtime.b1 b1VarK6 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN6 = androidx.compose.ui.m.n(c0VarR, a0VarF6);
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
                if (z14) {
                    c0VarR.E(-1874697310);
                    fB = ((Number) c0VarR.W(w4.c())).floatValue();
                } else {
                    c0VarR.E(-1874696477);
                    fB = u4.f25148a.b(c0VarR, 6);
                }
                c0VarR.A();
                androidx.compose.runtime.a1.e(w4.c().f(Float.valueOf(fB)), function2, c0VarR, ((i12 >> 9) & com.planner5d.library.engine.input.f.b.B) | androidx.compose.runtime.n4.f36267i);
                c0VarR.o();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var4;
                jVar2 = jVar3;
                z13 = z14;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                z13 = z11;
                jVar2 = jVar;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material.d9
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return f9.d(function0, a0Var3, z13, jVar2, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= androidx.media3.exoplayer.a5.S0;
        z11 = z10;
        i15 = i11 & 8;
        if (i15 != 0) {
            if ((i10 & 3072) == 0) {
                if (c0VarR.D(jVar)) {
                    i16 = 2048;
                } else {
                    i16 = 1024;
                }
                i12 |= i16;
            }
            if ((i11 & 16) != 0) {
                i12 |= 24576;
            } else if ((i10 & 24576) == 0) {
                if (c0VarR.k0(function2)) {
                    i17 = 16384;
                } else {
                    i17 = 8192;
                }
                i12 |= i17;
            }
            if ((i12 & 9363) != 9362) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i12 & 1)) {
                if (i18 != 0) {
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
                    jVar3 = null;
                } else {
                    jVar3 = jVar;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1316660641, i12, -1, "androidx.compose.material.IconButton (IconButton.kt:60)");
                }
                androidx.compose.ui.a0 a0VarF7 = androidx.compose.foundation.i1.f(l9.h(a0Var4), jVar3, wd.h(false, f22730a, 0L, 4, null), z14, null, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.a()), function1, 8, null);
                androidx.compose.ui.layout.a1 a1VarK7 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), false);
                iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                androidx.compose.runtime.b1 b1VarK7 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN7 = androidx.compose.ui.m.n(c0VarR, a0VarF7);
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
                if (z14) {
                    c0VarR.E(-1874697310);
                    fB = ((Number) c0VarR.W(w4.c())).floatValue();
                } else {
                    c0VarR.E(-1874696477);
                    fB = u4.f25148a.b(c0VarR, 6);
                }
                c0VarR.A();
                androidx.compose.runtime.a1.e(w4.c().f(Float.valueOf(fB)), function2, c0VarR, ((i12 >> 9) & com.planner5d.library.engine.input.f.b.B) | androidx.compose.runtime.n4.f36267i);
                c0VarR.o();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var4;
                jVar2 = jVar3;
                z13 = z14;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                z13 = z11;
                jVar2 = jVar;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material.d9
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return f9.d(function0, a0Var3, z13, jVar2, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 3072;
        if ((i11 & 16) != 0) {
            i12 |= 24576;
        } else if ((i10 & 24576) == 0) {
            if (c0VarR.k0(function2)) {
                i17 = 16384;
            } else {
                i17 = 8192;
            }
            i12 |= i17;
        }
        if ((i12 & 9363) != 9362) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (c0VarR.h(z12, i12 & 1)) {
            if (i18 != 0) {
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
                jVar3 = null;
            } else {
                jVar3 = jVar;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1316660641, i12, -1, "androidx.compose.material.IconButton (IconButton.kt:60)");
            }
            androidx.compose.ui.a0 a0VarF8 = androidx.compose.foundation.i1.f(l9.h(a0Var4), jVar3, wd.h(false, f22730a, 0L, 4, null), z14, null, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.a()), function1, 8, null);
            androidx.compose.ui.layout.a1 a1VarK8 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), false);
            iJ = androidx.compose.runtime.v.j(c0VarR, 0);
            androidx.compose.runtime.b1 b1VarK8 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN8 = androidx.compose.ui.m.n(c0VarR, a0VarF8);
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
            if (z14) {
                c0VarR.E(-1874697310);
                fB = ((Number) c0VarR.W(w4.c())).floatValue();
            } else {
                c0VarR.E(-1874696477);
                fB = u4.f25148a.b(c0VarR, 6);
            }
            c0VarR.A();
            androidx.compose.runtime.a1.e(w4.c().f(Float.valueOf(fB)), function2, c0VarR, ((i12 >> 9) & com.planner5d.library.engine.input.f.b.B) | androidx.compose.runtime.n4.f36267i);
            c0VarR.o();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            a0Var3 = a0Var4;
            jVar2 = jVar3;
            z13 = z14;
        } else {
            c0VarR.u();
            a0Var3 = a0Var2;
            z13 = z11;
            jVar2 = jVar;
        }
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material.d9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return f9.d(function0, a0Var3, z13, jVar2, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(Function0 function0, androidx.compose.ui.a0 a0Var, boolean z10, androidx.compose.foundation.interaction.j jVar, Function2 function2, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        c(function0, a0Var, z10, jVar, function2, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0196  */
    /* JADX WARN: Code duplicated, block: B:103:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:105:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:108:0x01d6  */
    /* JADX WARN: Code duplicated, block: B:110:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0062  */
    /* JADX WARN: Code duplicated, block: B:38:0x0067  */
    /* JADX WARN: Code duplicated, block: B:40:0x006b  */
    /* JADX WARN: Code duplicated, block: B:42:0x0073  */
    /* JADX WARN: Code duplicated, block: B:43:0x0076  */
    /* JADX WARN: Code duplicated, block: B:47:0x007d  */
    /* JADX WARN: Code duplicated, block: B:49:0x0084  */
    /* JADX WARN: Code duplicated, block: B:51:0x0088  */
    /* JADX WARN: Code duplicated, block: B:53:0x0090  */
    /* JADX WARN: Code duplicated, block: B:54:0x0093  */
    /* JADX WARN: Code duplicated, block: B:58:0x009c  */
    /* JADX WARN: Code duplicated, block: B:59:0x009e  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:68:0x00ba  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c6 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:73:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:74:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:76:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:79:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:80:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:83:0x00de  */
    /* JADX WARN: Code duplicated, block: B:86:0x0128  */
    /* JADX WARN: Code duplicated, block: B:89:0x0134  */
    /* JADX WARN: Code duplicated, block: B:90:0x0138  */
    /* JADX WARN: Code duplicated, block: B:93:0x0157  */
    /* JADX WARN: Code duplicated, block: B:95:0x0165  */
    /* JADX WARN: Code duplicated, block: B:98:0x017e  */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void e(final boolean z10, @NotNull final Function1<? super Boolean, Unit> function1, @Nullable androidx.compose.ui.a0 a0Var, boolean z11, @Nullable androidx.compose.foundation.interaction.j jVar, @NotNull final Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        boolean z12;
        int i12;
        Function1<? super Boolean, Unit> function3;
        androidx.compose.ui.a0 a0Var2;
        int i13;
        boolean z13;
        int i14;
        int i15;
        androidx.compose.foundation.interaction.j jVar2;
        int i16;
        int i17;
        boolean z14;
        final androidx.compose.ui.a0 a0Var3;
        final boolean z15;
        final androidx.compose.foundation.interaction.j jVar3;
        androidx.compose.runtime.s5 s5VarT;
        boolean z16;
        androidx.compose.foundation.interaction.j jVar4;
        int iJ;
        Function0<androidx.compose.ui.node.g> function0A;
        androidx.compose.runtime.c0 c0VarD;
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B;
        float fB;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1097147314);
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
                    } else if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        if (c0VarR.k0(function2)) {
                            i17 = 131072;
                        } else {
                            i17 = 65536;
                        }
                        i12 |= i17;
                    }
                    if ((74899 & i12) != 74898) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if (c0VarR.h(z14, i12 & 1)) {
                        if (i18 != 0) {
                            a0Var3 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var3 = a0Var2;
                        }
                        if (i13 != 0) {
                            z16 = true;
                        } else {
                            z16 = z13;
                        }
                        if (i15 != 0) {
                            jVar4 = null;
                        } else {
                            jVar4 = jVar2;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(1097147314, i12, -1, "androidx.compose.material.IconToggleButton (IconButton.kt:104)");
                        }
                        androidx.compose.ui.a0 a0VarA = androidx.compose.foundation.selection.e.a(l9.h(a0Var3), z12, jVar4, wd.h(false, f22730a, 0L, 4, null), z16, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.c()), function3);
                        androidx.compose.ui.layout.a1 a1VarK = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), false);
                        iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                        androidx.compose.runtime.b1 b1VarK = c0VarR.k();
                        androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0VarA);
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
                        if (z16) {
                            c0VarR.E(1952142323);
                            fB = ((Number) c0VarR.W(w4.c())).floatValue();
                        } else {
                            c0VarR.E(1952143156);
                            fB = u4.f25148a.b(c0VarR, 6);
                        }
                        c0VarR.A();
                        androidx.compose.runtime.a1.e(w4.c().f(Float.valueOf(fB)), function2, c0VarR, ((i12 >> 12) & com.planner5d.library.engine.input.f.b.B) | androidx.compose.runtime.n4.f36267i);
                        c0VarR.o();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        jVar3 = jVar4;
                        z15 = z16;
                    } else {
                        c0VarR.u();
                        a0Var3 = a0Var2;
                        z15 = z13;
                        jVar3 = jVar2;
                    }
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material.e9
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return f9.f(z10, function1, a0Var3, z15, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 24576;
                jVar2 = jVar;
                if ((i11 & 32) != 0) {
                    i12 |= androidx.profileinstaller.n.c.f73814m;
                } else if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    if (c0VarR.k0(function2)) {
                        i17 = 131072;
                    } else {
                        i17 = 65536;
                    }
                    i12 |= i17;
                }
                if ((74899 & i12) != 74898) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c0VarR.h(z14, i12 & 1)) {
                    if (i18 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if (i13 != 0) {
                        z16 = true;
                    } else {
                        z16 = z13;
                    }
                    if (i15 != 0) {
                        jVar4 = null;
                    } else {
                        jVar4 = jVar2;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1097147314, i12, -1, "androidx.compose.material.IconToggleButton (IconButton.kt:104)");
                    }
                    androidx.compose.ui.a0 a0VarA2 = androidx.compose.foundation.selection.e.a(l9.h(a0Var3), z12, jVar4, wd.h(false, f22730a, 0L, 4, null), z16, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.c()), function3);
                    androidx.compose.ui.layout.a1 a1VarK2 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), false);
                    iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                    androidx.compose.runtime.b1 b1VarK2 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN2 = androidx.compose.ui.m.n(c0VarR, a0VarA2);
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
                    if (z16) {
                        c0VarR.E(1952142323);
                        fB = ((Number) c0VarR.W(w4.c())).floatValue();
                    } else {
                        c0VarR.E(1952143156);
                        fB = u4.f25148a.b(c0VarR, 6);
                    }
                    c0VarR.A();
                    androidx.compose.runtime.a1.e(w4.c().f(Float.valueOf(fB)), function2, c0VarR, ((i12 >> 12) & com.planner5d.library.engine.input.f.b.B) | androidx.compose.runtime.n4.f36267i);
                    c0VarR.o();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    jVar3 = jVar4;
                    z15 = z16;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    z15 = z13;
                    jVar3 = jVar2;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.e9
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return f9.f(z10, function1, a0Var3, z15, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 3072;
            z13 = z11;
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
                } else if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    if (c0VarR.k0(function2)) {
                        i17 = 131072;
                    } else {
                        i17 = 65536;
                    }
                    i12 |= i17;
                }
                if ((74899 & i12) != 74898) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c0VarR.h(z14, i12 & 1)) {
                    if (i18 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if (i13 != 0) {
                        z16 = true;
                    } else {
                        z16 = z13;
                    }
                    if (i15 != 0) {
                        jVar4 = null;
                    } else {
                        jVar4 = jVar2;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1097147314, i12, -1, "androidx.compose.material.IconToggleButton (IconButton.kt:104)");
                    }
                    androidx.compose.ui.a0 a0VarA3 = androidx.compose.foundation.selection.e.a(l9.h(a0Var3), z12, jVar4, wd.h(false, f22730a, 0L, 4, null), z16, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.c()), function3);
                    androidx.compose.ui.layout.a1 a1VarK3 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), false);
                    iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                    androidx.compose.runtime.b1 b1VarK3 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN3 = androidx.compose.ui.m.n(c0VarR, a0VarA3);
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
                    if (z16) {
                        c0VarR.E(1952142323);
                        fB = ((Number) c0VarR.W(w4.c())).floatValue();
                    } else {
                        c0VarR.E(1952143156);
                        fB = u4.f25148a.b(c0VarR, 6);
                    }
                    c0VarR.A();
                    androidx.compose.runtime.a1.e(w4.c().f(Float.valueOf(fB)), function2, c0VarR, ((i12 >> 12) & com.planner5d.library.engine.input.f.b.B) | androidx.compose.runtime.n4.f36267i);
                    c0VarR.o();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    jVar3 = jVar4;
                    z15 = z16;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    z15 = z13;
                    jVar3 = jVar2;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.e9
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return f9.f(z10, function1, a0Var3, z15, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 24576;
            jVar2 = jVar;
            if ((i11 & 32) != 0) {
                i12 |= androidx.profileinstaller.n.c.f73814m;
            } else if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                if (c0VarR.k0(function2)) {
                    i17 = 131072;
                } else {
                    i17 = 65536;
                }
                i12 |= i17;
            }
            if ((74899 & i12) != 74898) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c0VarR.h(z14, i12 & 1)) {
                if (i18 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if (i13 != 0) {
                    z16 = true;
                } else {
                    z16 = z13;
                }
                if (i15 != 0) {
                    jVar4 = null;
                } else {
                    jVar4 = jVar2;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1097147314, i12, -1, "androidx.compose.material.IconToggleButton (IconButton.kt:104)");
                }
                androidx.compose.ui.a0 a0VarA4 = androidx.compose.foundation.selection.e.a(l9.h(a0Var3), z12, jVar4, wd.h(false, f22730a, 0L, 4, null), z16, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.c()), function3);
                androidx.compose.ui.layout.a1 a1VarK4 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), false);
                iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                androidx.compose.runtime.b1 b1VarK4 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN4 = androidx.compose.ui.m.n(c0VarR, a0VarA4);
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
                if (z16) {
                    c0VarR.E(1952142323);
                    fB = ((Number) c0VarR.W(w4.c())).floatValue();
                } else {
                    c0VarR.E(1952143156);
                    fB = u4.f25148a.b(c0VarR, 6);
                }
                c0VarR.A();
                androidx.compose.runtime.a1.e(w4.c().f(Float.valueOf(fB)), function2, c0VarR, ((i12 >> 12) & com.planner5d.library.engine.input.f.b.B) | androidx.compose.runtime.n4.f36267i);
                c0VarR.o();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                jVar3 = jVar4;
                z15 = z16;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                z15 = z13;
                jVar3 = jVar2;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material.e9
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return f9.f(z10, function1, a0Var3, z15, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
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
                } else if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    if (c0VarR.k0(function2)) {
                        i17 = 131072;
                    } else {
                        i17 = 65536;
                    }
                    i12 |= i17;
                }
                if ((74899 & i12) != 74898) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if (c0VarR.h(z14, i12 & 1)) {
                    if (i18 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if (i13 != 0) {
                        z16 = true;
                    } else {
                        z16 = z13;
                    }
                    if (i15 != 0) {
                        jVar4 = null;
                    } else {
                        jVar4 = jVar2;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1097147314, i12, -1, "androidx.compose.material.IconToggleButton (IconButton.kt:104)");
                    }
                    androidx.compose.ui.a0 a0VarA5 = androidx.compose.foundation.selection.e.a(l9.h(a0Var3), z12, jVar4, wd.h(false, f22730a, 0L, 4, null), z16, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.c()), function3);
                    androidx.compose.ui.layout.a1 a1VarK5 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), false);
                    iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                    androidx.compose.runtime.b1 b1VarK5 = c0VarR.k();
                    androidx.compose.ui.a0 a0VarN5 = androidx.compose.ui.m.n(c0VarR, a0VarA5);
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
                    if (z16) {
                        c0VarR.E(1952142323);
                        fB = ((Number) c0VarR.W(w4.c())).floatValue();
                    } else {
                        c0VarR.E(1952143156);
                        fB = u4.f25148a.b(c0VarR, 6);
                    }
                    c0VarR.A();
                    androidx.compose.runtime.a1.e(w4.c().f(Float.valueOf(fB)), function2, c0VarR, ((i12 >> 12) & com.planner5d.library.engine.input.f.b.B) | androidx.compose.runtime.n4.f36267i);
                    c0VarR.o();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    jVar3 = jVar4;
                    z15 = z16;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    z15 = z13;
                    jVar3 = jVar2;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.e9
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return f9.f(z10, function1, a0Var3, z15, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 24576;
            jVar2 = jVar;
            if ((i11 & 32) != 0) {
                i12 |= androidx.profileinstaller.n.c.f73814m;
            } else if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                if (c0VarR.k0(function2)) {
                    i17 = 131072;
                } else {
                    i17 = 65536;
                }
                i12 |= i17;
            }
            if ((74899 & i12) != 74898) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c0VarR.h(z14, i12 & 1)) {
                if (i18 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if (i13 != 0) {
                    z16 = true;
                } else {
                    z16 = z13;
                }
                if (i15 != 0) {
                    jVar4 = null;
                } else {
                    jVar4 = jVar2;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1097147314, i12, -1, "androidx.compose.material.IconToggleButton (IconButton.kt:104)");
                }
                androidx.compose.ui.a0 a0VarA6 = androidx.compose.foundation.selection.e.a(l9.h(a0Var3), z12, jVar4, wd.h(false, f22730a, 0L, 4, null), z16, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.c()), function3);
                androidx.compose.ui.layout.a1 a1VarK6 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), false);
                iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                androidx.compose.runtime.b1 b1VarK6 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN6 = androidx.compose.ui.m.n(c0VarR, a0VarA6);
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
                if (z16) {
                    c0VarR.E(1952142323);
                    fB = ((Number) c0VarR.W(w4.c())).floatValue();
                } else {
                    c0VarR.E(1952143156);
                    fB = u4.f25148a.b(c0VarR, 6);
                }
                c0VarR.A();
                androidx.compose.runtime.a1.e(w4.c().f(Float.valueOf(fB)), function2, c0VarR, ((i12 >> 12) & com.planner5d.library.engine.input.f.b.B) | androidx.compose.runtime.n4.f36267i);
                c0VarR.o();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                jVar3 = jVar4;
                z15 = z16;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                z15 = z13;
                jVar3 = jVar2;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material.e9
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return f9.f(z10, function1, a0Var3, z15, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 3072;
        z13 = z11;
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
            } else if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                if (c0VarR.k0(function2)) {
                    i17 = 131072;
                } else {
                    i17 = 65536;
                }
                i12 |= i17;
            }
            if ((74899 & i12) != 74898) {
                z14 = true;
            } else {
                z14 = false;
            }
            if (c0VarR.h(z14, i12 & 1)) {
                if (i18 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if (i13 != 0) {
                    z16 = true;
                } else {
                    z16 = z13;
                }
                if (i15 != 0) {
                    jVar4 = null;
                } else {
                    jVar4 = jVar2;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1097147314, i12, -1, "androidx.compose.material.IconToggleButton (IconButton.kt:104)");
                }
                androidx.compose.ui.a0 a0VarA7 = androidx.compose.foundation.selection.e.a(l9.h(a0Var3), z12, jVar4, wd.h(false, f22730a, 0L, 4, null), z16, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.c()), function3);
                androidx.compose.ui.layout.a1 a1VarK7 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), false);
                iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                androidx.compose.runtime.b1 b1VarK7 = c0VarR.k();
                androidx.compose.ui.a0 a0VarN7 = androidx.compose.ui.m.n(c0VarR, a0VarA7);
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
                if (z16) {
                    c0VarR.E(1952142323);
                    fB = ((Number) c0VarR.W(w4.c())).floatValue();
                } else {
                    c0VarR.E(1952143156);
                    fB = u4.f25148a.b(c0VarR, 6);
                }
                c0VarR.A();
                androidx.compose.runtime.a1.e(w4.c().f(Float.valueOf(fB)), function2, c0VarR, ((i12 >> 12) & com.planner5d.library.engine.input.f.b.B) | androidx.compose.runtime.n4.f36267i);
                c0VarR.o();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                jVar3 = jVar4;
                z15 = z16;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                z15 = z13;
                jVar3 = jVar2;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material.e9
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return f9.f(z10, function1, a0Var3, z15, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 24576;
        jVar2 = jVar;
        if ((i11 & 32) != 0) {
            i12 |= androidx.profileinstaller.n.c.f73814m;
        } else if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
            if (c0VarR.k0(function2)) {
                i17 = 131072;
            } else {
                i17 = 65536;
            }
            i12 |= i17;
        }
        if ((74899 & i12) != 74898) {
            z14 = true;
        } else {
            z14 = false;
        }
        if (c0VarR.h(z14, i12 & 1)) {
            if (i18 != 0) {
                a0Var3 = androidx.compose.ui.a0.E;
            } else {
                a0Var3 = a0Var2;
            }
            if (i13 != 0) {
                z16 = true;
            } else {
                z16 = z13;
            }
            if (i15 != 0) {
                jVar4 = null;
            } else {
                jVar4 = jVar2;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1097147314, i12, -1, "androidx.compose.material.IconToggleButton (IconButton.kt:104)");
            }
            androidx.compose.ui.a0 a0VarA8 = androidx.compose.foundation.selection.e.a(l9.h(a0Var3), z12, jVar4, wd.h(false, f22730a, 0L, 4, null), z16, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.c()), function3);
            androidx.compose.ui.layout.a1 a1VarK8 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.i(), false);
            iJ = androidx.compose.runtime.v.j(c0VarR, 0);
            androidx.compose.runtime.b1 b1VarK8 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN8 = androidx.compose.ui.m.n(c0VarR, a0VarA8);
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
            if (z16) {
                c0VarR.E(1952142323);
                fB = ((Number) c0VarR.W(w4.c())).floatValue();
            } else {
                c0VarR.E(1952143156);
                fB = u4.f25148a.b(c0VarR, 6);
            }
            c0VarR.A();
            androidx.compose.runtime.a1.e(w4.c().f(Float.valueOf(fB)), function2, c0VarR, ((i12 >> 12) & com.planner5d.library.engine.input.f.b.B) | androidx.compose.runtime.n4.f36267i);
            c0VarR.o();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            jVar3 = jVar4;
            z15 = z16;
        } else {
            c0VarR.u();
            a0Var3 = a0Var2;
            z15 = z13;
            jVar3 = jVar2;
        }
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material.e9
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return f9.f(z10, function1, a0Var3, z15, jVar3, function2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(boolean z10, Function1 function1, androidx.compose.ui.a0 a0Var, boolean z11, androidx.compose.foundation.interaction.j jVar, Function2 function2, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        e(z10, function1, a0Var, z11, jVar, function2, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }
}

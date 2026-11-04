package androidx.compose.foundation.contextmenu;

import androidx.annotation.l1;
import androidx.compose.foundation.layout.d0;
import androidx.compose.runtime.b1;
import androidx.compose.runtime.c0;
import androidx.compose.runtime.m0;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.y7;
import androidx.compose.ui.a0;
import androidx.compose.ui.layout.a1;
import androidx.media3.exoplayer.a5;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nContextMenuArea.android.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ContextMenuArea.android.kt\nandroidx/compose/foundation/contextmenu/ContextMenuArea_androidKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,88:1\n1282#2,6:89\n1282#2,6:95\n1282#2,6:142\n70#3:101\n67#3,9:102\n77#3:141\n80#4,6:111\n87#4,3:126\n90#4,2:135\n94#4:140\n391#5,9:117\n400#5,3:137\n4360#6,6:129\n*S KotlinDebug\n*F\n+ 1 ContextMenuArea.android.kt\nandroidx/compose/foundation/contextmenu/ContextMenuArea_androidKt\n*L\n45#1:89,6\n50#1:95,6\n79#1:142,6\n57#1:101\n57#1:102,9\n57#1:141\n57#1:111,6\n57#1:126,3\n57#1:135,2\n57#1:140\n57#1:117,9\n57#1:137,3\n57#1:129,6\n*E\n"})
public final class g {
    @androidx.compose.runtime.o
    @l1
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void f(@NotNull final r rVar, @NotNull final Function0<Unit> function0, @Nullable a0 a0Var, @NotNull final Function1<? super p, Unit> function1, @Nullable c0 c0Var, final int i10, final int i11) {
        int i12;
        c0 c0Var2;
        final a0 a0Var2;
        s5 s5VarT;
        Function2<? super c0, ? super Integer, Unit> function2;
        c0 c0VarR = c0Var.R(645832757);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c0VarR.D(rVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= c0VarR.k0(function0) ? 32 : 16;
        }
        int i13 = i11 & 4;
        if (i13 != 0) {
            i12 |= a5.S0;
        } else if ((i10 & a5.S0) == 0) {
            i12 |= c0VarR.D(a0Var) ? 256 : 128;
        }
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            i12 |= c0VarR.k0(function1) ? 2048 : 1024;
        }
        if (c0VarR.h((i12 & 1171) != 1170, i12 & 1)) {
            if (i13 != 0) {
                a0Var = a0.E;
            }
            a0Var2 = a0Var;
            if (m0.l0()) {
                m0.A0(645832757, i12, -1, "androidx.compose.foundation.contextmenu.ContextMenu (ContextMenuArea.android.kt:73)");
            }
            r.a aVarA = rVar.a();
            if (aVarA instanceof r.a.b) {
                r.a.b bVar = (r.a.b) aVarA;
                boolean zD = c0VarR.D(bVar);
                Object objI0 = c0VarR.i0();
                if (zD || objI0 == c0.f35327a.a()) {
                    m mVar = new m(androidx.compose.ui.unit.r.g(bVar.a()), (Function2) null, 2, (DefaultConstructorMarker) null);
                    c0VarR.Y(mVar);
                    objI0 = mVar;
                }
                c0Var2 = c0VarR;
                z.o((m) objI0, function0, a0Var2, function1, c0Var2, i12 & 8176, 0);
                if (m0.l0()) {
                    m0.z0();
                }
            } else {
                if (m0.l0()) {
                    m0.z0();
                }
                s5VarT = c0VarR.T();
                if (s5VarT == null) {
                    return;
                } else {
                    function2 = new Function2() { // from class: androidx.compose.foundation.contextmenu.b
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return g.g(rVar, function0, a0Var2, function1, i10, i11, (c0) obj, ((Integer) obj2).intValue());
                        }
                    };
                }
            }
            s5VarT.a(function2);
        }
        c0Var2 = c0VarR;
        c0Var2.u();
        a0Var2 = a0Var;
        s5VarT = c0Var2.T();
        if (s5VarT != null) {
            function2 = new Function2() { // from class: androidx.compose.foundation.contextmenu.c
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return g.h(rVar, function0, a0Var2, function1, i10, i11, (c0) obj, ((Integer) obj2).intValue());
                }
            };
            s5VarT.a(function2);
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(r rVar, Function0 function0, a0 a0Var, Function1 function1, int i10, int i11, c0 c0Var, int i12) {
        f(rVar, function0, a0Var, function1, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(r rVar, Function0 function0, a0 a0Var, Function1 function1, int i10, int i11, c0 c0Var, int i12) {
        f(rVar, function0, a0Var, function1, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x012b  */
    /* JADX WARN: Code duplicated, block: B:103:0x0131  */
    /* JADX WARN: Code duplicated, block: B:104:0x0133  */
    /* JADX WARN: Code duplicated, block: B:107:0x013b  */
    /* JADX WARN: Code duplicated, block: B:109:0x0143  */
    /* JADX WARN: Code duplicated, block: B:111:0x0155  */
    /* JADX WARN: Code duplicated, block: B:114:0x0186  */
    /* JADX WARN: Code duplicated, block: B:117:0x0192  */
    /* JADX WARN: Code duplicated, block: B:118:0x0196  */
    /* JADX WARN: Code duplicated, block: B:121:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:123:0x01c3  */
    /* JADX WARN: Code duplicated, block: B:126:0x0202  */
    /* JADX WARN: Code duplicated, block: B:128:0x0208  */
    /* JADX WARN: Code duplicated, block: B:131:0x0212  */
    /* JADX WARN: Code duplicated, block: B:133:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004b  */
    /* JADX WARN: Code duplicated, block: B:28:0x0050  */
    /* JADX WARN: Code duplicated, block: B:30:0x0054  */
    /* JADX WARN: Code duplicated, block: B:32:0x005c  */
    /* JADX WARN: Code duplicated, block: B:33:0x005f  */
    /* JADX WARN: Code duplicated, block: B:37:0x0066  */
    /* JADX WARN: Code duplicated, block: B:39:0x006b  */
    /* JADX WARN: Code duplicated, block: B:41:0x006f  */
    /* JADX WARN: Code duplicated, block: B:43:0x0077  */
    /* JADX WARN: Code duplicated, block: B:44:0x007a  */
    /* JADX WARN: Code duplicated, block: B:48:0x0081  */
    /* JADX WARN: Code duplicated, block: B:50:0x0086  */
    /* JADX WARN: Code duplicated, block: B:52:0x008a  */
    /* JADX WARN: Code duplicated, block: B:54:0x0092  */
    /* JADX WARN: Code duplicated, block: B:55:0x0095  */
    /* JADX WARN: Code duplicated, block: B:59:0x009e  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:70:0x00be  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:75:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:76:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:80:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:81:0x00df  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e8 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:85:0x00ea  */
    /* JADX WARN: Code duplicated, block: B:87:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:91:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:95:0x0110  */
    /* JADX WARN: Code duplicated, block: B:97:0x011b  */
    /* JADX WARN: Code duplicated, block: B:99:0x0128  */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void i(@NotNull final r rVar, @NotNull final Function0<Unit> function0, @NotNull final Function1<? super p, Unit> function1, @Nullable a0 a0Var, boolean z10, @Nullable Function0<Unit> function2, @NotNull final Function2<? super c0, ? super Integer, Unit> function3, @Nullable c0 c0Var, final int i10, final int i11) {
        int i12;
        Function0<Unit> function4;
        int i13;
        int i14;
        a0 a0Var2;
        int i15;
        int i16;
        boolean z11;
        int i17;
        int i18;
        final Function0<Unit> function5;
        int i19;
        int i20;
        boolean z12;
        final boolean z13;
        final Function0<Unit> function6;
        s5 s5VarT;
        a0 a0VarC;
        int iHashCode;
        Function0<androidx.compose.ui.node.g> function0A;
        c0 c0VarD;
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B;
        boolean z14;
        boolean z15;
        boolean z16;
        Object objI0;
        Object objI1;
        c0 c0VarR = c0Var.R(1877873755);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c0VarR.D(rVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) == 0) {
            if ((i10 & 48) == 0) {
                function4 = function0;
                i12 |= c0VarR.k0(function4) ? 32 : 16;
            }
            if ((i11 & 4) != 0) {
                if ((i10 & a5.S0) == 0) {
                    if (c0VarR.k0(function1)) {
                        i13 = 256;
                    } else {
                        i13 = 128;
                    }
                    i12 |= i13;
                }
                i14 = i11 & 8;
                if (i14 != 0) {
                    if ((i10 & 3072) == 0) {
                        a0Var2 = a0Var;
                        if (c0VarR.D(a0Var2)) {
                            i15 = 2048;
                        } else {
                            i15 = 1024;
                        }
                        i12 |= i15;
                    }
                    i16 = i11 & 16;
                    if (i16 != 0) {
                        if ((i10 & 24576) == 0) {
                            z11 = z10;
                            if (c0VarR.G(z11)) {
                                i17 = 16384;
                            } else {
                                i17 = 8192;
                            }
                            i12 |= i17;
                        }
                        i18 = i11 & 32;
                        if (i18 != 0) {
                            if ((196608 & i10) == 0) {
                                function5 = function2;
                                if (c0VarR.k0(function5)) {
                                    i19 = 131072;
                                } else {
                                    i19 = 65536;
                                }
                                i12 |= i19;
                            }
                            if ((i11 & 64) != 0) {
                                i12 |= 1572864;
                            } else if ((i10 & 1572864) == 0) {
                                if (c0VarR.k0(function3)) {
                                    i20 = 1048576;
                                } else {
                                    i20 = 524288;
                                }
                                i12 |= i20;
                            }
                            if ((i12 & 599187) != 599186) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            if (c0VarR.h(z12, i12 & 1)) {
                                if (i14 != 0) {
                                    a0Var2 = a0.E;
                                }
                                if (i16 != 0) {
                                    z11 = true;
                                }
                                if (i18 != 0) {
                                    objI1 = c0VarR.i0();
                                    if (objI1 == c0.f35327a.a()) {
                                        objI1 = new Function0() { // from class: androidx.compose.foundation.contextmenu.d
                                            @Override // kotlin.jvm.functions.Function0
                                            public final Object invoke() {
                                                return g.j();
                                            }
                                        };
                                        c0VarR.Y(objI1);
                                    }
                                    function5 = (Function0) objI1;
                                }
                                if (m0.l0()) {
                                    m0.A0(1877873755, i12, -1, "androidx.compose.foundation.contextmenu.ContextMenuArea (ContextMenuArea.android.kt:46)");
                                }
                                if (z11) {
                                    c0VarR.E(1788348907);
                                    if ((458752 & i12) == 131072) {
                                        z14 = true;
                                    } else {
                                        z14 = false;
                                    }
                                    if ((i12 & 14) == 4) {
                                        z15 = true;
                                    } else {
                                        z15 = false;
                                    }
                                    z16 = z14 | z15;
                                    objI0 = c0VarR.i0();
                                    if (z16 || objI0 == c0.f35327a.a()) {
                                        objI0 = new Function1() { // from class: androidx.compose.foundation.contextmenu.e
                                            @Override // kotlin.jvm.functions.Function1
                                            public final Object invoke(Object obj) {
                                                return g.k(function5, rVar, (n0.g) obj);
                                            }
                                        };
                                        c0VarR.Y(objI0);
                                    }
                                    a0VarC = j.c(a0Var2, (Function1) objI0);
                                    c0VarR.A();
                                } else {
                                    c0VarR.E(1788505767);
                                    c0VarR.A();
                                    a0VarC = a0Var2;
                                }
                                a1 a1VarK = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), true);
                                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                                b1 b1VarK = c0VarR.k();
                                a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0VarC);
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
                                y7.n(c0VarD, a1VarK, aVar.e());
                                y7.n(c0VarD, b1VarK, aVar.g());
                                function2B = aVar.b();
                                if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                                    c0VarD.Y(Integer.valueOf(iHashCode));
                                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                                }
                                y7.n(c0VarD, a0VarN, aVar.f());
                                d0 d0Var = d0.f15956a;
                                function3.invoke(c0VarR, Integer.valueOf((i12 >> 18) & 14));
                                f(rVar, function4, null, function1, c0VarR, (i12 & okhttp3.internal.ws.g.f334652s) | ((i12 << 3) & 7168), 4);
                                c0VarR.o();
                                if (m0.l0()) {
                                    m0.z0();
                                }
                            } else {
                                c0VarR.u();
                            }
                            z13 = z11;
                            function6 = function5;
                            s5VarT = c0VarR.T();
                            if (s5VarT != null) {
                                final a0 a0Var3 = a0Var2;
                                s5VarT.a(new Function2() { // from class: androidx.compose.foundation.contextmenu.f
                                    @Override // kotlin.jvm.functions.Function2
                                    public final Object invoke(Object obj, Object obj2) {
                                        return g.l(rVar, function0, function1, a0Var3, z13, function6, function3, i10, i11, (c0) obj, ((Integer) obj2).intValue());
                                    }
                                });
                            }
                        }
                        i12 |= androidx.profileinstaller.n.c.f73814m;
                        function5 = function2;
                        if ((i11 & 64) != 0) {
                            i12 |= 1572864;
                        } else if ((i10 & 1572864) == 0) {
                            if (c0VarR.k0(function3)) {
                                i20 = 1048576;
                            } else {
                                i20 = 524288;
                            }
                            i12 |= i20;
                        }
                        if ((i12 & 599187) != 599186) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (c0VarR.h(z12, i12 & 1)) {
                            if (i14 != 0) {
                                a0Var2 = a0.E;
                            }
                            if (i16 != 0) {
                                z11 = true;
                            }
                            if (i18 != 0) {
                                objI1 = c0VarR.i0();
                                if (objI1 == c0.f35327a.a()) {
                                    objI1 = new Function0() { // from class: androidx.compose.foundation.contextmenu.d
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return g.j();
                                        }
                                    };
                                    c0VarR.Y(objI1);
                                }
                                function5 = (Function0) objI1;
                            }
                            if (m0.l0()) {
                                m0.A0(1877873755, i12, -1, "androidx.compose.foundation.contextmenu.ContextMenuArea (ContextMenuArea.android.kt:46)");
                            }
                            if (z11) {
                                c0VarR.E(1788348907);
                                if ((458752 & i12) == 131072) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                if ((i12 & 14) == 4) {
                                    z15 = true;
                                } else {
                                    z15 = false;
                                }
                                z16 = z14 | z15;
                                objI0 = c0VarR.i0();
                                if (z16) {
                                    objI0 = new Function1() { // from class: androidx.compose.foundation.contextmenu.e
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return g.k(function5, rVar, (n0.g) obj);
                                        }
                                    };
                                    c0VarR.Y(objI0);
                                } else {
                                    objI0 = new Function1() { // from class: androidx.compose.foundation.contextmenu.e
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return g.k(function5, rVar, (n0.g) obj);
                                        }
                                    };
                                    c0VarR.Y(objI0);
                                }
                                a0VarC = j.c(a0Var2, (Function1) objI0);
                                c0VarR.A();
                            } else {
                                c0VarR.E(1788505767);
                                c0VarR.A();
                                a0VarC = a0Var2;
                            }
                            a1 a1VarK2 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), true);
                            iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                            b1 b1VarK2 = c0VarR.k();
                            a0 a0VarN2 = androidx.compose.ui.m.n(c0VarR, a0VarC);
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
                            y7.n(c0VarD, a1VarK2, aVar2.e());
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
                            d0 d0Var2 = d0.f15956a;
                            function3.invoke(c0VarR, Integer.valueOf((i12 >> 18) & 14));
                            f(rVar, function4, null, function1, c0VarR, (i12 & okhttp3.internal.ws.g.f334652s) | ((i12 << 3) & 7168), 4);
                            c0VarR.o();
                            if (m0.l0()) {
                                m0.z0();
                            }
                        } else {
                            c0VarR.u();
                        }
                        z13 = z11;
                        function6 = function5;
                        s5VarT = c0VarR.T();
                        if (s5VarT != null) {
                            final a0 a0Var4 = a0Var2;
                            s5VarT.a(new Function2() { // from class: androidx.compose.foundation.contextmenu.f
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return g.l(rVar, function0, function1, a0Var4, z13, function6, function3, i10, i11, (c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i12 |= 24576;
                    z11 = z10;
                    i18 = i11 & 32;
                    if (i18 != 0) {
                        if ((196608 & i10) == 0) {
                            function5 = function2;
                            if (c0VarR.k0(function5)) {
                                i19 = 131072;
                            } else {
                                i19 = 65536;
                            }
                            i12 |= i19;
                        }
                        if ((i11 & 64) != 0) {
                            i12 |= 1572864;
                        } else if ((i10 & 1572864) == 0) {
                            if (c0VarR.k0(function3)) {
                                i20 = 1048576;
                            } else {
                                i20 = 524288;
                            }
                            i12 |= i20;
                        }
                        if ((i12 & 599187) != 599186) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (c0VarR.h(z12, i12 & 1)) {
                            if (i14 != 0) {
                                a0Var2 = a0.E;
                            }
                            if (i16 != 0) {
                                z11 = true;
                            }
                            if (i18 != 0) {
                                objI1 = c0VarR.i0();
                                if (objI1 == c0.f35327a.a()) {
                                    objI1 = new Function0() { // from class: androidx.compose.foundation.contextmenu.d
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return g.j();
                                        }
                                    };
                                    c0VarR.Y(objI1);
                                }
                                function5 = (Function0) objI1;
                            }
                            if (m0.l0()) {
                                m0.A0(1877873755, i12, -1, "androidx.compose.foundation.contextmenu.ContextMenuArea (ContextMenuArea.android.kt:46)");
                            }
                            if (z11) {
                                c0VarR.E(1788348907);
                                if ((458752 & i12) == 131072) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                if ((i12 & 14) == 4) {
                                    z15 = true;
                                } else {
                                    z15 = false;
                                }
                                z16 = z14 | z15;
                                objI0 = c0VarR.i0();
                                if (z16) {
                                    objI0 = new Function1() { // from class: androidx.compose.foundation.contextmenu.e
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return g.k(function5, rVar, (n0.g) obj);
                                        }
                                    };
                                    c0VarR.Y(objI0);
                                } else {
                                    objI0 = new Function1() { // from class: androidx.compose.foundation.contextmenu.e
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return g.k(function5, rVar, (n0.g) obj);
                                        }
                                    };
                                    c0VarR.Y(objI0);
                                }
                                a0VarC = j.c(a0Var2, (Function1) objI0);
                                c0VarR.A();
                            } else {
                                c0VarR.E(1788505767);
                                c0VarR.A();
                                a0VarC = a0Var2;
                            }
                            a1 a1VarK3 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), true);
                            iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                            b1 b1VarK3 = c0VarR.k();
                            a0 a0VarN3 = androidx.compose.ui.m.n(c0VarR, a0VarC);
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
                            y7.n(c0VarD, a1VarK3, aVar3.e());
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
                            d0 d0Var3 = d0.f15956a;
                            function3.invoke(c0VarR, Integer.valueOf((i12 >> 18) & 14));
                            f(rVar, function4, null, function1, c0VarR, (i12 & okhttp3.internal.ws.g.f334652s) | ((i12 << 3) & 7168), 4);
                            c0VarR.o();
                            if (m0.l0()) {
                                m0.z0();
                            }
                        } else {
                            c0VarR.u();
                        }
                        z13 = z11;
                        function6 = function5;
                        s5VarT = c0VarR.T();
                        if (s5VarT != null) {
                            final a0 a0Var5 = a0Var2;
                            s5VarT.a(new Function2() { // from class: androidx.compose.foundation.contextmenu.f
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return g.l(rVar, function0, function1, a0Var5, z13, function6, function3, i10, i11, (c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i12 |= androidx.profileinstaller.n.c.f73814m;
                    function5 = function2;
                    if ((i11 & 64) != 0) {
                        i12 |= 1572864;
                    } else if ((i10 & 1572864) == 0) {
                        if (c0VarR.k0(function3)) {
                            i20 = 1048576;
                        } else {
                            i20 = 524288;
                        }
                        i12 |= i20;
                    }
                    if ((i12 & 599187) != 599186) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (c0VarR.h(z12, i12 & 1)) {
                        if (i14 != 0) {
                            a0Var2 = a0.E;
                        }
                        if (i16 != 0) {
                            z11 = true;
                        }
                        if (i18 != 0) {
                            objI1 = c0VarR.i0();
                            if (objI1 == c0.f35327a.a()) {
                                objI1 = new Function0() { // from class: androidx.compose.foundation.contextmenu.d
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return g.j();
                                    }
                                };
                                c0VarR.Y(objI1);
                            }
                            function5 = (Function0) objI1;
                        }
                        if (m0.l0()) {
                            m0.A0(1877873755, i12, -1, "androidx.compose.foundation.contextmenu.ContextMenuArea (ContextMenuArea.android.kt:46)");
                        }
                        if (z11) {
                            c0VarR.E(1788348907);
                            if ((458752 & i12) == 131072) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            if ((i12 & 14) == 4) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            z16 = z14 | z15;
                            objI0 = c0VarR.i0();
                            if (z16) {
                                objI0 = new Function1() { // from class: androidx.compose.foundation.contextmenu.e
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return g.k(function5, rVar, (n0.g) obj);
                                    }
                                };
                                c0VarR.Y(objI0);
                            } else {
                                objI0 = new Function1() { // from class: androidx.compose.foundation.contextmenu.e
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return g.k(function5, rVar, (n0.g) obj);
                                    }
                                };
                                c0VarR.Y(objI0);
                            }
                            a0VarC = j.c(a0Var2, (Function1) objI0);
                            c0VarR.A();
                        } else {
                            c0VarR.E(1788505767);
                            c0VarR.A();
                            a0VarC = a0Var2;
                        }
                        a1 a1VarK4 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), true);
                        iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        b1 b1VarK4 = c0VarR.k();
                        a0 a0VarN4 = androidx.compose.ui.m.n(c0VarR, a0VarC);
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
                        y7.n(c0VarD, a1VarK4, aVar4.e());
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
                        d0 d0Var4 = d0.f15956a;
                        function3.invoke(c0VarR, Integer.valueOf((i12 >> 18) & 14));
                        f(rVar, function4, null, function1, c0VarR, (i12 & okhttp3.internal.ws.g.f334652s) | ((i12 << 3) & 7168), 4);
                        c0VarR.o();
                        if (m0.l0()) {
                            m0.z0();
                        }
                    } else {
                        c0VarR.u();
                    }
                    z13 = z11;
                    function6 = function5;
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        final a0 a0Var6 = a0Var2;
                        s5VarT.a(new Function2() { // from class: androidx.compose.foundation.contextmenu.f
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return g.l(rVar, function0, function1, a0Var6, z13, function6, function3, i10, i11, (c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 3072;
                a0Var2 = a0Var;
                i16 = i11 & 16;
                if (i16 != 0) {
                    if ((i10 & 24576) == 0) {
                        z11 = z10;
                        if (c0VarR.G(z11)) {
                            i17 = 16384;
                        } else {
                            i17 = 8192;
                        }
                        i12 |= i17;
                    }
                    i18 = i11 & 32;
                    if (i18 != 0) {
                        if ((196608 & i10) == 0) {
                            function5 = function2;
                            if (c0VarR.k0(function5)) {
                                i19 = 131072;
                            } else {
                                i19 = 65536;
                            }
                            i12 |= i19;
                        }
                        if ((i11 & 64) != 0) {
                            i12 |= 1572864;
                        } else if ((i10 & 1572864) == 0) {
                            if (c0VarR.k0(function3)) {
                                i20 = 1048576;
                            } else {
                                i20 = 524288;
                            }
                            i12 |= i20;
                        }
                        if ((i12 & 599187) != 599186) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (c0VarR.h(z12, i12 & 1)) {
                            if (i14 != 0) {
                                a0Var2 = a0.E;
                            }
                            if (i16 != 0) {
                                z11 = true;
                            }
                            if (i18 != 0) {
                                objI1 = c0VarR.i0();
                                if (objI1 == c0.f35327a.a()) {
                                    objI1 = new Function0() { // from class: androidx.compose.foundation.contextmenu.d
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return g.j();
                                        }
                                    };
                                    c0VarR.Y(objI1);
                                }
                                function5 = (Function0) objI1;
                            }
                            if (m0.l0()) {
                                m0.A0(1877873755, i12, -1, "androidx.compose.foundation.contextmenu.ContextMenuArea (ContextMenuArea.android.kt:46)");
                            }
                            if (z11) {
                                c0VarR.E(1788348907);
                                if ((458752 & i12) == 131072) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                if ((i12 & 14) == 4) {
                                    z15 = true;
                                } else {
                                    z15 = false;
                                }
                                z16 = z14 | z15;
                                objI0 = c0VarR.i0();
                                if (z16) {
                                    objI0 = new Function1() { // from class: androidx.compose.foundation.contextmenu.e
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return g.k(function5, rVar, (n0.g) obj);
                                        }
                                    };
                                    c0VarR.Y(objI0);
                                } else {
                                    objI0 = new Function1() { // from class: androidx.compose.foundation.contextmenu.e
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return g.k(function5, rVar, (n0.g) obj);
                                        }
                                    };
                                    c0VarR.Y(objI0);
                                }
                                a0VarC = j.c(a0Var2, (Function1) objI0);
                                c0VarR.A();
                            } else {
                                c0VarR.E(1788505767);
                                c0VarR.A();
                                a0VarC = a0Var2;
                            }
                            a1 a1VarK5 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), true);
                            iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                            b1 b1VarK5 = c0VarR.k();
                            a0 a0VarN5 = androidx.compose.ui.m.n(c0VarR, a0VarC);
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
                            y7.n(c0VarD, a1VarK5, aVar5.e());
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
                            d0 d0Var5 = d0.f15956a;
                            function3.invoke(c0VarR, Integer.valueOf((i12 >> 18) & 14));
                            f(rVar, function4, null, function1, c0VarR, (i12 & okhttp3.internal.ws.g.f334652s) | ((i12 << 3) & 7168), 4);
                            c0VarR.o();
                            if (m0.l0()) {
                                m0.z0();
                            }
                        } else {
                            c0VarR.u();
                        }
                        z13 = z11;
                        function6 = function5;
                        s5VarT = c0VarR.T();
                        if (s5VarT != null) {
                            final a0 a0Var7 = a0Var2;
                            s5VarT.a(new Function2() { // from class: androidx.compose.foundation.contextmenu.f
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return g.l(rVar, function0, function1, a0Var7, z13, function6, function3, i10, i11, (c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i12 |= androidx.profileinstaller.n.c.f73814m;
                    function5 = function2;
                    if ((i11 & 64) != 0) {
                        i12 |= 1572864;
                    } else if ((i10 & 1572864) == 0) {
                        if (c0VarR.k0(function3)) {
                            i20 = 1048576;
                        } else {
                            i20 = 524288;
                        }
                        i12 |= i20;
                    }
                    if ((i12 & 599187) != 599186) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (c0VarR.h(z12, i12 & 1)) {
                        if (i14 != 0) {
                            a0Var2 = a0.E;
                        }
                        if (i16 != 0) {
                            z11 = true;
                        }
                        if (i18 != 0) {
                            objI1 = c0VarR.i0();
                            if (objI1 == c0.f35327a.a()) {
                                objI1 = new Function0() { // from class: androidx.compose.foundation.contextmenu.d
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return g.j();
                                    }
                                };
                                c0VarR.Y(objI1);
                            }
                            function5 = (Function0) objI1;
                        }
                        if (m0.l0()) {
                            m0.A0(1877873755, i12, -1, "androidx.compose.foundation.contextmenu.ContextMenuArea (ContextMenuArea.android.kt:46)");
                        }
                        if (z11) {
                            c0VarR.E(1788348907);
                            if ((458752 & i12) == 131072) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            if ((i12 & 14) == 4) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            z16 = z14 | z15;
                            objI0 = c0VarR.i0();
                            if (z16) {
                                objI0 = new Function1() { // from class: androidx.compose.foundation.contextmenu.e
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return g.k(function5, rVar, (n0.g) obj);
                                    }
                                };
                                c0VarR.Y(objI0);
                            } else {
                                objI0 = new Function1() { // from class: androidx.compose.foundation.contextmenu.e
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return g.k(function5, rVar, (n0.g) obj);
                                    }
                                };
                                c0VarR.Y(objI0);
                            }
                            a0VarC = j.c(a0Var2, (Function1) objI0);
                            c0VarR.A();
                        } else {
                            c0VarR.E(1788505767);
                            c0VarR.A();
                            a0VarC = a0Var2;
                        }
                        a1 a1VarK6 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), true);
                        iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        b1 b1VarK6 = c0VarR.k();
                        a0 a0VarN6 = androidx.compose.ui.m.n(c0VarR, a0VarC);
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
                        y7.n(c0VarD, a1VarK6, aVar6.e());
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
                        d0 d0Var6 = d0.f15956a;
                        function3.invoke(c0VarR, Integer.valueOf((i12 >> 18) & 14));
                        f(rVar, function4, null, function1, c0VarR, (i12 & okhttp3.internal.ws.g.f334652s) | ((i12 << 3) & 7168), 4);
                        c0VarR.o();
                        if (m0.l0()) {
                            m0.z0();
                        }
                    } else {
                        c0VarR.u();
                    }
                    z13 = z11;
                    function6 = function5;
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        final a0 a0Var8 = a0Var2;
                        s5VarT.a(new Function2() { // from class: androidx.compose.foundation.contextmenu.f
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return g.l(rVar, function0, function1, a0Var8, z13, function6, function3, i10, i11, (c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 24576;
                z11 = z10;
                i18 = i11 & 32;
                if (i18 != 0) {
                    if ((196608 & i10) == 0) {
                        function5 = function2;
                        if (c0VarR.k0(function5)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                        i12 |= i19;
                    }
                    if ((i11 & 64) != 0) {
                        i12 |= 1572864;
                    } else if ((i10 & 1572864) == 0) {
                        if (c0VarR.k0(function3)) {
                            i20 = 1048576;
                        } else {
                            i20 = 524288;
                        }
                        i12 |= i20;
                    }
                    if ((i12 & 599187) != 599186) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (c0VarR.h(z12, i12 & 1)) {
                        if (i14 != 0) {
                            a0Var2 = a0.E;
                        }
                        if (i16 != 0) {
                            z11 = true;
                        }
                        if (i18 != 0) {
                            objI1 = c0VarR.i0();
                            if (objI1 == c0.f35327a.a()) {
                                objI1 = new Function0() { // from class: androidx.compose.foundation.contextmenu.d
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return g.j();
                                    }
                                };
                                c0VarR.Y(objI1);
                            }
                            function5 = (Function0) objI1;
                        }
                        if (m0.l0()) {
                            m0.A0(1877873755, i12, -1, "androidx.compose.foundation.contextmenu.ContextMenuArea (ContextMenuArea.android.kt:46)");
                        }
                        if (z11) {
                            c0VarR.E(1788348907);
                            if ((458752 & i12) == 131072) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            if ((i12 & 14) == 4) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            z16 = z14 | z15;
                            objI0 = c0VarR.i0();
                            if (z16) {
                                objI0 = new Function1() { // from class: androidx.compose.foundation.contextmenu.e
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return g.k(function5, rVar, (n0.g) obj);
                                    }
                                };
                                c0VarR.Y(objI0);
                            } else {
                                objI0 = new Function1() { // from class: androidx.compose.foundation.contextmenu.e
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return g.k(function5, rVar, (n0.g) obj);
                                    }
                                };
                                c0VarR.Y(objI0);
                            }
                            a0VarC = j.c(a0Var2, (Function1) objI0);
                            c0VarR.A();
                        } else {
                            c0VarR.E(1788505767);
                            c0VarR.A();
                            a0VarC = a0Var2;
                        }
                        a1 a1VarK7 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), true);
                        iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        b1 b1VarK7 = c0VarR.k();
                        a0 a0VarN7 = androidx.compose.ui.m.n(c0VarR, a0VarC);
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
                        y7.n(c0VarD, a1VarK7, aVar7.e());
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
                        d0 d0Var7 = d0.f15956a;
                        function3.invoke(c0VarR, Integer.valueOf((i12 >> 18) & 14));
                        f(rVar, function4, null, function1, c0VarR, (i12 & okhttp3.internal.ws.g.f334652s) | ((i12 << 3) & 7168), 4);
                        c0VarR.o();
                        if (m0.l0()) {
                            m0.z0();
                        }
                    } else {
                        c0VarR.u();
                    }
                    z13 = z11;
                    function6 = function5;
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        final a0 a0Var9 = a0Var2;
                        s5VarT.a(new Function2() { // from class: androidx.compose.foundation.contextmenu.f
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return g.l(rVar, function0, function1, a0Var9, z13, function6, function3, i10, i11, (c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= androidx.profileinstaller.n.c.f73814m;
                function5 = function2;
                if ((i11 & 64) != 0) {
                    i12 |= 1572864;
                } else if ((i10 & 1572864) == 0) {
                    if (c0VarR.k0(function3)) {
                        i20 = 1048576;
                    } else {
                        i20 = 524288;
                    }
                    i12 |= i20;
                }
                if ((i12 & 599187) != 599186) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    if (i14 != 0) {
                        a0Var2 = a0.E;
                    }
                    if (i16 != 0) {
                        z11 = true;
                    }
                    if (i18 != 0) {
                        objI1 = c0VarR.i0();
                        if (objI1 == c0.f35327a.a()) {
                            objI1 = new Function0() { // from class: androidx.compose.foundation.contextmenu.d
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return g.j();
                                }
                            };
                            c0VarR.Y(objI1);
                        }
                        function5 = (Function0) objI1;
                    }
                    if (m0.l0()) {
                        m0.A0(1877873755, i12, -1, "androidx.compose.foundation.contextmenu.ContextMenuArea (ContextMenuArea.android.kt:46)");
                    }
                    if (z11) {
                        c0VarR.E(1788348907);
                        if ((458752 & i12) == 131072) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if ((i12 & 14) == 4) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        z16 = z14 | z15;
                        objI0 = c0VarR.i0();
                        if (z16) {
                            objI0 = new Function1() { // from class: androidx.compose.foundation.contextmenu.e
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return g.k(function5, rVar, (n0.g) obj);
                                }
                            };
                            c0VarR.Y(objI0);
                        } else {
                            objI0 = new Function1() { // from class: androidx.compose.foundation.contextmenu.e
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return g.k(function5, rVar, (n0.g) obj);
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        a0VarC = j.c(a0Var2, (Function1) objI0);
                        c0VarR.A();
                    } else {
                        c0VarR.E(1788505767);
                        c0VarR.A();
                        a0VarC = a0Var2;
                    }
                    a1 a1VarK8 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), true);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK8 = c0VarR.k();
                    a0 a0VarN8 = androidx.compose.ui.m.n(c0VarR, a0VarC);
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
                    y7.n(c0VarD, a1VarK8, aVar8.e());
                    y7.n(c0VarD, b1VarK8, aVar8.g());
                    function2B = aVar8.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN8, aVar8.f());
                    d0 d0Var8 = d0.f15956a;
                    function3.invoke(c0VarR, Integer.valueOf((i12 >> 18) & 14));
                    f(rVar, function4, null, function1, c0VarR, (i12 & okhttp3.internal.ws.g.f334652s) | ((i12 << 3) & 7168), 4);
                    c0VarR.o();
                    if (m0.l0()) {
                        m0.z0();
                    }
                } else {
                    c0VarR.u();
                }
                z13 = z11;
                function6 = function5;
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    final a0 a0Var10 = a0Var2;
                    s5VarT.a(new Function2() { // from class: androidx.compose.foundation.contextmenu.f
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return g.l(rVar, function0, function1, a0Var10, z13, function6, function3, i10, i11, (c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= a5.S0;
            i14 = i11 & 8;
            if (i14 != 0) {
                if ((i10 & 3072) == 0) {
                    a0Var2 = a0Var;
                    if (c0VarR.D(a0Var2)) {
                        i15 = 2048;
                    } else {
                        i15 = 1024;
                    }
                    i12 |= i15;
                }
                i16 = i11 & 16;
                if (i16 != 0) {
                    if ((i10 & 24576) == 0) {
                        z11 = z10;
                        if (c0VarR.G(z11)) {
                            i17 = 16384;
                        } else {
                            i17 = 8192;
                        }
                        i12 |= i17;
                    }
                    i18 = i11 & 32;
                    if (i18 != 0) {
                        if ((196608 & i10) == 0) {
                            function5 = function2;
                            if (c0VarR.k0(function5)) {
                                i19 = 131072;
                            } else {
                                i19 = 65536;
                            }
                            i12 |= i19;
                        }
                        if ((i11 & 64) != 0) {
                            i12 |= 1572864;
                        } else if ((i10 & 1572864) == 0) {
                            if (c0VarR.k0(function3)) {
                                i20 = 1048576;
                            } else {
                                i20 = 524288;
                            }
                            i12 |= i20;
                        }
                        if ((i12 & 599187) != 599186) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (c0VarR.h(z12, i12 & 1)) {
                            if (i14 != 0) {
                                a0Var2 = a0.E;
                            }
                            if (i16 != 0) {
                                z11 = true;
                            }
                            if (i18 != 0) {
                                objI1 = c0VarR.i0();
                                if (objI1 == c0.f35327a.a()) {
                                    objI1 = new Function0() { // from class: androidx.compose.foundation.contextmenu.d
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return g.j();
                                        }
                                    };
                                    c0VarR.Y(objI1);
                                }
                                function5 = (Function0) objI1;
                            }
                            if (m0.l0()) {
                                m0.A0(1877873755, i12, -1, "androidx.compose.foundation.contextmenu.ContextMenuArea (ContextMenuArea.android.kt:46)");
                            }
                            if (z11) {
                                c0VarR.E(1788348907);
                                if ((458752 & i12) == 131072) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                if ((i12 & 14) == 4) {
                                    z15 = true;
                                } else {
                                    z15 = false;
                                }
                                z16 = z14 | z15;
                                objI0 = c0VarR.i0();
                                if (z16) {
                                    objI0 = new Function1() { // from class: androidx.compose.foundation.contextmenu.e
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return g.k(function5, rVar, (n0.g) obj);
                                        }
                                    };
                                    c0VarR.Y(objI0);
                                } else {
                                    objI0 = new Function1() { // from class: androidx.compose.foundation.contextmenu.e
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return g.k(function5, rVar, (n0.g) obj);
                                        }
                                    };
                                    c0VarR.Y(objI0);
                                }
                                a0VarC = j.c(a0Var2, (Function1) objI0);
                                c0VarR.A();
                            } else {
                                c0VarR.E(1788505767);
                                c0VarR.A();
                                a0VarC = a0Var2;
                            }
                            a1 a1VarK9 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), true);
                            iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                            b1 b1VarK9 = c0VarR.k();
                            a0 a0VarN9 = androidx.compose.ui.m.n(c0VarR, a0VarC);
                            androidx.compose.ui.node.g.a aVar9 = androidx.compose.ui.node.g.I;
                            function0A = aVar9.a();
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
                            y7.n(c0VarD, a1VarK9, aVar9.e());
                            y7.n(c0VarD, b1VarK9, aVar9.g());
                            function2B = aVar9.b();
                            if (c0VarD.P()) {
                                c0VarD.Y(Integer.valueOf(iHashCode));
                                c0VarD.f(Integer.valueOf(iHashCode), function2B);
                            } else {
                                c0VarD.Y(Integer.valueOf(iHashCode));
                                c0VarD.f(Integer.valueOf(iHashCode), function2B);
                            }
                            y7.n(c0VarD, a0VarN9, aVar9.f());
                            d0 d0Var9 = d0.f15956a;
                            function3.invoke(c0VarR, Integer.valueOf((i12 >> 18) & 14));
                            f(rVar, function4, null, function1, c0VarR, (i12 & okhttp3.internal.ws.g.f334652s) | ((i12 << 3) & 7168), 4);
                            c0VarR.o();
                            if (m0.l0()) {
                                m0.z0();
                            }
                        } else {
                            c0VarR.u();
                        }
                        z13 = z11;
                        function6 = function5;
                        s5VarT = c0VarR.T();
                        if (s5VarT != null) {
                            final a0 a0Var11 = a0Var2;
                            s5VarT.a(new Function2() { // from class: androidx.compose.foundation.contextmenu.f
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return g.l(rVar, function0, function1, a0Var11, z13, function6, function3, i10, i11, (c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i12 |= androidx.profileinstaller.n.c.f73814m;
                    function5 = function2;
                    if ((i11 & 64) != 0) {
                        i12 |= 1572864;
                    } else if ((i10 & 1572864) == 0) {
                        if (c0VarR.k0(function3)) {
                            i20 = 1048576;
                        } else {
                            i20 = 524288;
                        }
                        i12 |= i20;
                    }
                    if ((i12 & 599187) != 599186) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (c0VarR.h(z12, i12 & 1)) {
                        if (i14 != 0) {
                            a0Var2 = a0.E;
                        }
                        if (i16 != 0) {
                            z11 = true;
                        }
                        if (i18 != 0) {
                            objI1 = c0VarR.i0();
                            if (objI1 == c0.f35327a.a()) {
                                objI1 = new Function0() { // from class: androidx.compose.foundation.contextmenu.d
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return g.j();
                                    }
                                };
                                c0VarR.Y(objI1);
                            }
                            function5 = (Function0) objI1;
                        }
                        if (m0.l0()) {
                            m0.A0(1877873755, i12, -1, "androidx.compose.foundation.contextmenu.ContextMenuArea (ContextMenuArea.android.kt:46)");
                        }
                        if (z11) {
                            c0VarR.E(1788348907);
                            if ((458752 & i12) == 131072) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            if ((i12 & 14) == 4) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            z16 = z14 | z15;
                            objI0 = c0VarR.i0();
                            if (z16) {
                                objI0 = new Function1() { // from class: androidx.compose.foundation.contextmenu.e
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return g.k(function5, rVar, (n0.g) obj);
                                    }
                                };
                                c0VarR.Y(objI0);
                            } else {
                                objI0 = new Function1() { // from class: androidx.compose.foundation.contextmenu.e
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return g.k(function5, rVar, (n0.g) obj);
                                    }
                                };
                                c0VarR.Y(objI0);
                            }
                            a0VarC = j.c(a0Var2, (Function1) objI0);
                            c0VarR.A();
                        } else {
                            c0VarR.E(1788505767);
                            c0VarR.A();
                            a0VarC = a0Var2;
                        }
                        a1 a1VarK10 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), true);
                        iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        b1 b1VarK10 = c0VarR.k();
                        a0 a0VarN10 = androidx.compose.ui.m.n(c0VarR, a0VarC);
                        androidx.compose.ui.node.g.a aVar10 = androidx.compose.ui.node.g.I;
                        function0A = aVar10.a();
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
                        y7.n(c0VarD, a1VarK10, aVar10.e());
                        y7.n(c0VarD, b1VarK10, aVar10.g());
                        function2B = aVar10.b();
                        if (c0VarD.P()) {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        } else {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        }
                        y7.n(c0VarD, a0VarN10, aVar10.f());
                        d0 d0Var10 = d0.f15956a;
                        function3.invoke(c0VarR, Integer.valueOf((i12 >> 18) & 14));
                        f(rVar, function4, null, function1, c0VarR, (i12 & okhttp3.internal.ws.g.f334652s) | ((i12 << 3) & 7168), 4);
                        c0VarR.o();
                        if (m0.l0()) {
                            m0.z0();
                        }
                    } else {
                        c0VarR.u();
                    }
                    z13 = z11;
                    function6 = function5;
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        final a0 a0Var12 = a0Var2;
                        s5VarT.a(new Function2() { // from class: androidx.compose.foundation.contextmenu.f
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return g.l(rVar, function0, function1, a0Var12, z13, function6, function3, i10, i11, (c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 24576;
                z11 = z10;
                i18 = i11 & 32;
                if (i18 != 0) {
                    if ((196608 & i10) == 0) {
                        function5 = function2;
                        if (c0VarR.k0(function5)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                        i12 |= i19;
                    }
                    if ((i11 & 64) != 0) {
                        i12 |= 1572864;
                    } else if ((i10 & 1572864) == 0) {
                        if (c0VarR.k0(function3)) {
                            i20 = 1048576;
                        } else {
                            i20 = 524288;
                        }
                        i12 |= i20;
                    }
                    if ((i12 & 599187) != 599186) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (c0VarR.h(z12, i12 & 1)) {
                        if (i14 != 0) {
                            a0Var2 = a0.E;
                        }
                        if (i16 != 0) {
                            z11 = true;
                        }
                        if (i18 != 0) {
                            objI1 = c0VarR.i0();
                            if (objI1 == c0.f35327a.a()) {
                                objI1 = new Function0() { // from class: androidx.compose.foundation.contextmenu.d
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return g.j();
                                    }
                                };
                                c0VarR.Y(objI1);
                            }
                            function5 = (Function0) objI1;
                        }
                        if (m0.l0()) {
                            m0.A0(1877873755, i12, -1, "androidx.compose.foundation.contextmenu.ContextMenuArea (ContextMenuArea.android.kt:46)");
                        }
                        if (z11) {
                            c0VarR.E(1788348907);
                            if ((458752 & i12) == 131072) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            if ((i12 & 14) == 4) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            z16 = z14 | z15;
                            objI0 = c0VarR.i0();
                            if (z16) {
                                objI0 = new Function1() { // from class: androidx.compose.foundation.contextmenu.e
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return g.k(function5, rVar, (n0.g) obj);
                                    }
                                };
                                c0VarR.Y(objI0);
                            } else {
                                objI0 = new Function1() { // from class: androidx.compose.foundation.contextmenu.e
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return g.k(function5, rVar, (n0.g) obj);
                                    }
                                };
                                c0VarR.Y(objI0);
                            }
                            a0VarC = j.c(a0Var2, (Function1) objI0);
                            c0VarR.A();
                        } else {
                            c0VarR.E(1788505767);
                            c0VarR.A();
                            a0VarC = a0Var2;
                        }
                        a1 a1VarK11 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), true);
                        iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        b1 b1VarK11 = c0VarR.k();
                        a0 a0VarN11 = androidx.compose.ui.m.n(c0VarR, a0VarC);
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
                        y7.n(c0VarD, a1VarK11, aVar11.e());
                        y7.n(c0VarD, b1VarK11, aVar11.g());
                        function2B = aVar11.b();
                        if (c0VarD.P()) {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        } else {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        }
                        y7.n(c0VarD, a0VarN11, aVar11.f());
                        d0 d0Var11 = d0.f15956a;
                        function3.invoke(c0VarR, Integer.valueOf((i12 >> 18) & 14));
                        f(rVar, function4, null, function1, c0VarR, (i12 & okhttp3.internal.ws.g.f334652s) | ((i12 << 3) & 7168), 4);
                        c0VarR.o();
                        if (m0.l0()) {
                            m0.z0();
                        }
                    } else {
                        c0VarR.u();
                    }
                    z13 = z11;
                    function6 = function5;
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        final a0 a0Var13 = a0Var2;
                        s5VarT.a(new Function2() { // from class: androidx.compose.foundation.contextmenu.f
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return g.l(rVar, function0, function1, a0Var13, z13, function6, function3, i10, i11, (c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= androidx.profileinstaller.n.c.f73814m;
                function5 = function2;
                if ((i11 & 64) != 0) {
                    i12 |= 1572864;
                } else if ((i10 & 1572864) == 0) {
                    if (c0VarR.k0(function3)) {
                        i20 = 1048576;
                    } else {
                        i20 = 524288;
                    }
                    i12 |= i20;
                }
                if ((i12 & 599187) != 599186) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    if (i14 != 0) {
                        a0Var2 = a0.E;
                    }
                    if (i16 != 0) {
                        z11 = true;
                    }
                    if (i18 != 0) {
                        objI1 = c0VarR.i0();
                        if (objI1 == c0.f35327a.a()) {
                            objI1 = new Function0() { // from class: androidx.compose.foundation.contextmenu.d
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return g.j();
                                }
                            };
                            c0VarR.Y(objI1);
                        }
                        function5 = (Function0) objI1;
                    }
                    if (m0.l0()) {
                        m0.A0(1877873755, i12, -1, "androidx.compose.foundation.contextmenu.ContextMenuArea (ContextMenuArea.android.kt:46)");
                    }
                    if (z11) {
                        c0VarR.E(1788348907);
                        if ((458752 & i12) == 131072) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if ((i12 & 14) == 4) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        z16 = z14 | z15;
                        objI0 = c0VarR.i0();
                        if (z16) {
                            objI0 = new Function1() { // from class: androidx.compose.foundation.contextmenu.e
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return g.k(function5, rVar, (n0.g) obj);
                                }
                            };
                            c0VarR.Y(objI0);
                        } else {
                            objI0 = new Function1() { // from class: androidx.compose.foundation.contextmenu.e
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return g.k(function5, rVar, (n0.g) obj);
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        a0VarC = j.c(a0Var2, (Function1) objI0);
                        c0VarR.A();
                    } else {
                        c0VarR.E(1788505767);
                        c0VarR.A();
                        a0VarC = a0Var2;
                    }
                    a1 a1VarK12 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), true);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK12 = c0VarR.k();
                    a0 a0VarN12 = androidx.compose.ui.m.n(c0VarR, a0VarC);
                    androidx.compose.ui.node.g.a aVar12 = androidx.compose.ui.node.g.I;
                    function0A = aVar12.a();
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
                    y7.n(c0VarD, a1VarK12, aVar12.e());
                    y7.n(c0VarD, b1VarK12, aVar12.g());
                    function2B = aVar12.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN12, aVar12.f());
                    d0 d0Var12 = d0.f15956a;
                    function3.invoke(c0VarR, Integer.valueOf((i12 >> 18) & 14));
                    f(rVar, function4, null, function1, c0VarR, (i12 & okhttp3.internal.ws.g.f334652s) | ((i12 << 3) & 7168), 4);
                    c0VarR.o();
                    if (m0.l0()) {
                        m0.z0();
                    }
                } else {
                    c0VarR.u();
                }
                z13 = z11;
                function6 = function5;
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    final a0 a0Var14 = a0Var2;
                    s5VarT.a(new Function2() { // from class: androidx.compose.foundation.contextmenu.f
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return g.l(rVar, function0, function1, a0Var14, z13, function6, function3, i10, i11, (c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 3072;
            a0Var2 = a0Var;
            i16 = i11 & 16;
            if (i16 != 0) {
                if ((i10 & 24576) == 0) {
                    z11 = z10;
                    if (c0VarR.G(z11)) {
                        i17 = 16384;
                    } else {
                        i17 = 8192;
                    }
                    i12 |= i17;
                }
                i18 = i11 & 32;
                if (i18 != 0) {
                    if ((196608 & i10) == 0) {
                        function5 = function2;
                        if (c0VarR.k0(function5)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                        i12 |= i19;
                    }
                    if ((i11 & 64) != 0) {
                        i12 |= 1572864;
                    } else if ((i10 & 1572864) == 0) {
                        if (c0VarR.k0(function3)) {
                            i20 = 1048576;
                        } else {
                            i20 = 524288;
                        }
                        i12 |= i20;
                    }
                    if ((i12 & 599187) != 599186) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (c0VarR.h(z12, i12 & 1)) {
                        if (i14 != 0) {
                            a0Var2 = a0.E;
                        }
                        if (i16 != 0) {
                            z11 = true;
                        }
                        if (i18 != 0) {
                            objI1 = c0VarR.i0();
                            if (objI1 == c0.f35327a.a()) {
                                objI1 = new Function0() { // from class: androidx.compose.foundation.contextmenu.d
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return g.j();
                                    }
                                };
                                c0VarR.Y(objI1);
                            }
                            function5 = (Function0) objI1;
                        }
                        if (m0.l0()) {
                            m0.A0(1877873755, i12, -1, "androidx.compose.foundation.contextmenu.ContextMenuArea (ContextMenuArea.android.kt:46)");
                        }
                        if (z11) {
                            c0VarR.E(1788348907);
                            if ((458752 & i12) == 131072) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            if ((i12 & 14) == 4) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            z16 = z14 | z15;
                            objI0 = c0VarR.i0();
                            if (z16) {
                                objI0 = new Function1() { // from class: androidx.compose.foundation.contextmenu.e
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return g.k(function5, rVar, (n0.g) obj);
                                    }
                                };
                                c0VarR.Y(objI0);
                            } else {
                                objI0 = new Function1() { // from class: androidx.compose.foundation.contextmenu.e
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return g.k(function5, rVar, (n0.g) obj);
                                    }
                                };
                                c0VarR.Y(objI0);
                            }
                            a0VarC = j.c(a0Var2, (Function1) objI0);
                            c0VarR.A();
                        } else {
                            c0VarR.E(1788505767);
                            c0VarR.A();
                            a0VarC = a0Var2;
                        }
                        a1 a1VarK13 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), true);
                        iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        b1 b1VarK13 = c0VarR.k();
                        a0 a0VarN13 = androidx.compose.ui.m.n(c0VarR, a0VarC);
                        androidx.compose.ui.node.g.a aVar13 = androidx.compose.ui.node.g.I;
                        function0A = aVar13.a();
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
                        y7.n(c0VarD, a1VarK13, aVar13.e());
                        y7.n(c0VarD, b1VarK13, aVar13.g());
                        function2B = aVar13.b();
                        if (c0VarD.P()) {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        } else {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        }
                        y7.n(c0VarD, a0VarN13, aVar13.f());
                        d0 d0Var13 = d0.f15956a;
                        function3.invoke(c0VarR, Integer.valueOf((i12 >> 18) & 14));
                        f(rVar, function4, null, function1, c0VarR, (i12 & okhttp3.internal.ws.g.f334652s) | ((i12 << 3) & 7168), 4);
                        c0VarR.o();
                        if (m0.l0()) {
                            m0.z0();
                        }
                    } else {
                        c0VarR.u();
                    }
                    z13 = z11;
                    function6 = function5;
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        final a0 a0Var15 = a0Var2;
                        s5VarT.a(new Function2() { // from class: androidx.compose.foundation.contextmenu.f
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return g.l(rVar, function0, function1, a0Var15, z13, function6, function3, i10, i11, (c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= androidx.profileinstaller.n.c.f73814m;
                function5 = function2;
                if ((i11 & 64) != 0) {
                    i12 |= 1572864;
                } else if ((i10 & 1572864) == 0) {
                    if (c0VarR.k0(function3)) {
                        i20 = 1048576;
                    } else {
                        i20 = 524288;
                    }
                    i12 |= i20;
                }
                if ((i12 & 599187) != 599186) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    if (i14 != 0) {
                        a0Var2 = a0.E;
                    }
                    if (i16 != 0) {
                        z11 = true;
                    }
                    if (i18 != 0) {
                        objI1 = c0VarR.i0();
                        if (objI1 == c0.f35327a.a()) {
                            objI1 = new Function0() { // from class: androidx.compose.foundation.contextmenu.d
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return g.j();
                                }
                            };
                            c0VarR.Y(objI1);
                        }
                        function5 = (Function0) objI1;
                    }
                    if (m0.l0()) {
                        m0.A0(1877873755, i12, -1, "androidx.compose.foundation.contextmenu.ContextMenuArea (ContextMenuArea.android.kt:46)");
                    }
                    if (z11) {
                        c0VarR.E(1788348907);
                        if ((458752 & i12) == 131072) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if ((i12 & 14) == 4) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        z16 = z14 | z15;
                        objI0 = c0VarR.i0();
                        if (z16) {
                            objI0 = new Function1() { // from class: androidx.compose.foundation.contextmenu.e
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return g.k(function5, rVar, (n0.g) obj);
                                }
                            };
                            c0VarR.Y(objI0);
                        } else {
                            objI0 = new Function1() { // from class: androidx.compose.foundation.contextmenu.e
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return g.k(function5, rVar, (n0.g) obj);
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        a0VarC = j.c(a0Var2, (Function1) objI0);
                        c0VarR.A();
                    } else {
                        c0VarR.E(1788505767);
                        c0VarR.A();
                        a0VarC = a0Var2;
                    }
                    a1 a1VarK14 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), true);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK14 = c0VarR.k();
                    a0 a0VarN14 = androidx.compose.ui.m.n(c0VarR, a0VarC);
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
                    y7.n(c0VarD, a1VarK14, aVar14.e());
                    y7.n(c0VarD, b1VarK14, aVar14.g());
                    function2B = aVar14.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN14, aVar14.f());
                    d0 d0Var14 = d0.f15956a;
                    function3.invoke(c0VarR, Integer.valueOf((i12 >> 18) & 14));
                    f(rVar, function4, null, function1, c0VarR, (i12 & okhttp3.internal.ws.g.f334652s) | ((i12 << 3) & 7168), 4);
                    c0VarR.o();
                    if (m0.l0()) {
                        m0.z0();
                    }
                } else {
                    c0VarR.u();
                }
                z13 = z11;
                function6 = function5;
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    final a0 a0Var16 = a0Var2;
                    s5VarT.a(new Function2() { // from class: androidx.compose.foundation.contextmenu.f
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return g.l(rVar, function0, function1, a0Var16, z13, function6, function3, i10, i11, (c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 24576;
            z11 = z10;
            i18 = i11 & 32;
            if (i18 != 0) {
                if ((196608 & i10) == 0) {
                    function5 = function2;
                    if (c0VarR.k0(function5)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                    i12 |= i19;
                }
                if ((i11 & 64) != 0) {
                    i12 |= 1572864;
                } else if ((i10 & 1572864) == 0) {
                    if (c0VarR.k0(function3)) {
                        i20 = 1048576;
                    } else {
                        i20 = 524288;
                    }
                    i12 |= i20;
                }
                if ((i12 & 599187) != 599186) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    if (i14 != 0) {
                        a0Var2 = a0.E;
                    }
                    if (i16 != 0) {
                        z11 = true;
                    }
                    if (i18 != 0) {
                        objI1 = c0VarR.i0();
                        if (objI1 == c0.f35327a.a()) {
                            objI1 = new Function0() { // from class: androidx.compose.foundation.contextmenu.d
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return g.j();
                                }
                            };
                            c0VarR.Y(objI1);
                        }
                        function5 = (Function0) objI1;
                    }
                    if (m0.l0()) {
                        m0.A0(1877873755, i12, -1, "androidx.compose.foundation.contextmenu.ContextMenuArea (ContextMenuArea.android.kt:46)");
                    }
                    if (z11) {
                        c0VarR.E(1788348907);
                        if ((458752 & i12) == 131072) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if ((i12 & 14) == 4) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        z16 = z14 | z15;
                        objI0 = c0VarR.i0();
                        if (z16) {
                            objI0 = new Function1() { // from class: androidx.compose.foundation.contextmenu.e
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return g.k(function5, rVar, (n0.g) obj);
                                }
                            };
                            c0VarR.Y(objI0);
                        } else {
                            objI0 = new Function1() { // from class: androidx.compose.foundation.contextmenu.e
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return g.k(function5, rVar, (n0.g) obj);
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        a0VarC = j.c(a0Var2, (Function1) objI0);
                        c0VarR.A();
                    } else {
                        c0VarR.E(1788505767);
                        c0VarR.A();
                        a0VarC = a0Var2;
                    }
                    a1 a1VarK15 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), true);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK15 = c0VarR.k();
                    a0 a0VarN15 = androidx.compose.ui.m.n(c0VarR, a0VarC);
                    androidx.compose.ui.node.g.a aVar15 = androidx.compose.ui.node.g.I;
                    function0A = aVar15.a();
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
                    y7.n(c0VarD, a1VarK15, aVar15.e());
                    y7.n(c0VarD, b1VarK15, aVar15.g());
                    function2B = aVar15.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN15, aVar15.f());
                    d0 d0Var15 = d0.f15956a;
                    function3.invoke(c0VarR, Integer.valueOf((i12 >> 18) & 14));
                    f(rVar, function4, null, function1, c0VarR, (i12 & okhttp3.internal.ws.g.f334652s) | ((i12 << 3) & 7168), 4);
                    c0VarR.o();
                    if (m0.l0()) {
                        m0.z0();
                    }
                } else {
                    c0VarR.u();
                }
                z13 = z11;
                function6 = function5;
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    final a0 a0Var17 = a0Var2;
                    s5VarT.a(new Function2() { // from class: androidx.compose.foundation.contextmenu.f
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return g.l(rVar, function0, function1, a0Var17, z13, function6, function3, i10, i11, (c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= androidx.profileinstaller.n.c.f73814m;
            function5 = function2;
            if ((i11 & 64) != 0) {
                i12 |= 1572864;
            } else if ((i10 & 1572864) == 0) {
                if (c0VarR.k0(function3)) {
                    i20 = 1048576;
                } else {
                    i20 = 524288;
                }
                i12 |= i20;
            }
            if ((i12 & 599187) != 599186) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i12 & 1)) {
                if (i14 != 0) {
                    a0Var2 = a0.E;
                }
                if (i16 != 0) {
                    z11 = true;
                }
                if (i18 != 0) {
                    objI1 = c0VarR.i0();
                    if (objI1 == c0.f35327a.a()) {
                        objI1 = new Function0() { // from class: androidx.compose.foundation.contextmenu.d
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return g.j();
                            }
                        };
                        c0VarR.Y(objI1);
                    }
                    function5 = (Function0) objI1;
                }
                if (m0.l0()) {
                    m0.A0(1877873755, i12, -1, "androidx.compose.foundation.contextmenu.ContextMenuArea (ContextMenuArea.android.kt:46)");
                }
                if (z11) {
                    c0VarR.E(1788348907);
                    if ((458752 & i12) == 131072) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if ((i12 & 14) == 4) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    z16 = z14 | z15;
                    objI0 = c0VarR.i0();
                    if (z16) {
                        objI0 = new Function1() { // from class: androidx.compose.foundation.contextmenu.e
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return g.k(function5, rVar, (n0.g) obj);
                            }
                        };
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = new Function1() { // from class: androidx.compose.foundation.contextmenu.e
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return g.k(function5, rVar, (n0.g) obj);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    a0VarC = j.c(a0Var2, (Function1) objI0);
                    c0VarR.A();
                } else {
                    c0VarR.E(1788505767);
                    c0VarR.A();
                    a0VarC = a0Var2;
                }
                a1 a1VarK16 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), true);
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK16 = c0VarR.k();
                a0 a0VarN16 = androidx.compose.ui.m.n(c0VarR, a0VarC);
                androidx.compose.ui.node.g.a aVar16 = androidx.compose.ui.node.g.I;
                function0A = aVar16.a();
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
                y7.n(c0VarD, a1VarK16, aVar16.e());
                y7.n(c0VarD, b1VarK16, aVar16.g());
                function2B = aVar16.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN16, aVar16.f());
                d0 d0Var16 = d0.f15956a;
                function3.invoke(c0VarR, Integer.valueOf((i12 >> 18) & 14));
                f(rVar, function4, null, function1, c0VarR, (i12 & okhttp3.internal.ws.g.f334652s) | ((i12 << 3) & 7168), 4);
                c0VarR.o();
                if (m0.l0()) {
                    m0.z0();
                }
            } else {
                c0VarR.u();
            }
            z13 = z11;
            function6 = function5;
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                final a0 a0Var18 = a0Var2;
                s5VarT.a(new Function2() { // from class: androidx.compose.foundation.contextmenu.f
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return g.l(rVar, function0, function1, a0Var18, z13, function6, function3, i10, i11, (c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 48;
        function4 = function0;
        if ((i11 & 4) != 0) {
            if ((i10 & a5.S0) == 0) {
                if (c0VarR.k0(function1)) {
                    i13 = 256;
                } else {
                    i13 = 128;
                }
                i12 |= i13;
            }
            i14 = i11 & 8;
            if (i14 != 0) {
                if ((i10 & 3072) == 0) {
                    a0Var2 = a0Var;
                    if (c0VarR.D(a0Var2)) {
                        i15 = 2048;
                    } else {
                        i15 = 1024;
                    }
                    i12 |= i15;
                }
                i16 = i11 & 16;
                if (i16 != 0) {
                    if ((i10 & 24576) == 0) {
                        z11 = z10;
                        if (c0VarR.G(z11)) {
                            i17 = 16384;
                        } else {
                            i17 = 8192;
                        }
                        i12 |= i17;
                    }
                    i18 = i11 & 32;
                    if (i18 != 0) {
                        if ((196608 & i10) == 0) {
                            function5 = function2;
                            if (c0VarR.k0(function5)) {
                                i19 = 131072;
                            } else {
                                i19 = 65536;
                            }
                            i12 |= i19;
                        }
                        if ((i11 & 64) != 0) {
                            i12 |= 1572864;
                        } else if ((i10 & 1572864) == 0) {
                            if (c0VarR.k0(function3)) {
                                i20 = 1048576;
                            } else {
                                i20 = 524288;
                            }
                            i12 |= i20;
                        }
                        if ((i12 & 599187) != 599186) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (c0VarR.h(z12, i12 & 1)) {
                            if (i14 != 0) {
                                a0Var2 = a0.E;
                            }
                            if (i16 != 0) {
                                z11 = true;
                            }
                            if (i18 != 0) {
                                objI1 = c0VarR.i0();
                                if (objI1 == c0.f35327a.a()) {
                                    objI1 = new Function0() { // from class: androidx.compose.foundation.contextmenu.d
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return g.j();
                                        }
                                    };
                                    c0VarR.Y(objI1);
                                }
                                function5 = (Function0) objI1;
                            }
                            if (m0.l0()) {
                                m0.A0(1877873755, i12, -1, "androidx.compose.foundation.contextmenu.ContextMenuArea (ContextMenuArea.android.kt:46)");
                            }
                            if (z11) {
                                c0VarR.E(1788348907);
                                if ((458752 & i12) == 131072) {
                                    z14 = true;
                                } else {
                                    z14 = false;
                                }
                                if ((i12 & 14) == 4) {
                                    z15 = true;
                                } else {
                                    z15 = false;
                                }
                                z16 = z14 | z15;
                                objI0 = c0VarR.i0();
                                if (z16) {
                                    objI0 = new Function1() { // from class: androidx.compose.foundation.contextmenu.e
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return g.k(function5, rVar, (n0.g) obj);
                                        }
                                    };
                                    c0VarR.Y(objI0);
                                } else {
                                    objI0 = new Function1() { // from class: androidx.compose.foundation.contextmenu.e
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return g.k(function5, rVar, (n0.g) obj);
                                        }
                                    };
                                    c0VarR.Y(objI0);
                                }
                                a0VarC = j.c(a0Var2, (Function1) objI0);
                                c0VarR.A();
                            } else {
                                c0VarR.E(1788505767);
                                c0VarR.A();
                                a0VarC = a0Var2;
                            }
                            a1 a1VarK17 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), true);
                            iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                            b1 b1VarK17 = c0VarR.k();
                            a0 a0VarN17 = androidx.compose.ui.m.n(c0VarR, a0VarC);
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
                            y7.n(c0VarD, a1VarK17, aVar17.e());
                            y7.n(c0VarD, b1VarK17, aVar17.g());
                            function2B = aVar17.b();
                            if (c0VarD.P()) {
                                c0VarD.Y(Integer.valueOf(iHashCode));
                                c0VarD.f(Integer.valueOf(iHashCode), function2B);
                            } else {
                                c0VarD.Y(Integer.valueOf(iHashCode));
                                c0VarD.f(Integer.valueOf(iHashCode), function2B);
                            }
                            y7.n(c0VarD, a0VarN17, aVar17.f());
                            d0 d0Var17 = d0.f15956a;
                            function3.invoke(c0VarR, Integer.valueOf((i12 >> 18) & 14));
                            f(rVar, function4, null, function1, c0VarR, (i12 & okhttp3.internal.ws.g.f334652s) | ((i12 << 3) & 7168), 4);
                            c0VarR.o();
                            if (m0.l0()) {
                                m0.z0();
                            }
                        } else {
                            c0VarR.u();
                        }
                        z13 = z11;
                        function6 = function5;
                        s5VarT = c0VarR.T();
                        if (s5VarT != null) {
                            final a0 a0Var19 = a0Var2;
                            s5VarT.a(new Function2() { // from class: androidx.compose.foundation.contextmenu.f
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return g.l(rVar, function0, function1, a0Var19, z13, function6, function3, i10, i11, (c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i12 |= androidx.profileinstaller.n.c.f73814m;
                    function5 = function2;
                    if ((i11 & 64) != 0) {
                        i12 |= 1572864;
                    } else if ((i10 & 1572864) == 0) {
                        if (c0VarR.k0(function3)) {
                            i20 = 1048576;
                        } else {
                            i20 = 524288;
                        }
                        i12 |= i20;
                    }
                    if ((i12 & 599187) != 599186) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (c0VarR.h(z12, i12 & 1)) {
                        if (i14 != 0) {
                            a0Var2 = a0.E;
                        }
                        if (i16 != 0) {
                            z11 = true;
                        }
                        if (i18 != 0) {
                            objI1 = c0VarR.i0();
                            if (objI1 == c0.f35327a.a()) {
                                objI1 = new Function0() { // from class: androidx.compose.foundation.contextmenu.d
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return g.j();
                                    }
                                };
                                c0VarR.Y(objI1);
                            }
                            function5 = (Function0) objI1;
                        }
                        if (m0.l0()) {
                            m0.A0(1877873755, i12, -1, "androidx.compose.foundation.contextmenu.ContextMenuArea (ContextMenuArea.android.kt:46)");
                        }
                        if (z11) {
                            c0VarR.E(1788348907);
                            if ((458752 & i12) == 131072) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            if ((i12 & 14) == 4) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            z16 = z14 | z15;
                            objI0 = c0VarR.i0();
                            if (z16) {
                                objI0 = new Function1() { // from class: androidx.compose.foundation.contextmenu.e
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return g.k(function5, rVar, (n0.g) obj);
                                    }
                                };
                                c0VarR.Y(objI0);
                            } else {
                                objI0 = new Function1() { // from class: androidx.compose.foundation.contextmenu.e
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return g.k(function5, rVar, (n0.g) obj);
                                    }
                                };
                                c0VarR.Y(objI0);
                            }
                            a0VarC = j.c(a0Var2, (Function1) objI0);
                            c0VarR.A();
                        } else {
                            c0VarR.E(1788505767);
                            c0VarR.A();
                            a0VarC = a0Var2;
                        }
                        a1 a1VarK18 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), true);
                        iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        b1 b1VarK18 = c0VarR.k();
                        a0 a0VarN18 = androidx.compose.ui.m.n(c0VarR, a0VarC);
                        androidx.compose.ui.node.g.a aVar18 = androidx.compose.ui.node.g.I;
                        function0A = aVar18.a();
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
                        y7.n(c0VarD, a1VarK18, aVar18.e());
                        y7.n(c0VarD, b1VarK18, aVar18.g());
                        function2B = aVar18.b();
                        if (c0VarD.P()) {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        } else {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        }
                        y7.n(c0VarD, a0VarN18, aVar18.f());
                        d0 d0Var18 = d0.f15956a;
                        function3.invoke(c0VarR, Integer.valueOf((i12 >> 18) & 14));
                        f(rVar, function4, null, function1, c0VarR, (i12 & okhttp3.internal.ws.g.f334652s) | ((i12 << 3) & 7168), 4);
                        c0VarR.o();
                        if (m0.l0()) {
                            m0.z0();
                        }
                    } else {
                        c0VarR.u();
                    }
                    z13 = z11;
                    function6 = function5;
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        final a0 a0Var110 = a0Var2;
                        s5VarT.a(new Function2() { // from class: androidx.compose.foundation.contextmenu.f
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return g.l(rVar, function0, function1, a0Var110, z13, function6, function3, i10, i11, (c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 24576;
                z11 = z10;
                i18 = i11 & 32;
                if (i18 != 0) {
                    if ((196608 & i10) == 0) {
                        function5 = function2;
                        if (c0VarR.k0(function5)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                        i12 |= i19;
                    }
                    if ((i11 & 64) != 0) {
                        i12 |= 1572864;
                    } else if ((i10 & 1572864) == 0) {
                        if (c0VarR.k0(function3)) {
                            i20 = 1048576;
                        } else {
                            i20 = 524288;
                        }
                        i12 |= i20;
                    }
                    if ((i12 & 599187) != 599186) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (c0VarR.h(z12, i12 & 1)) {
                        if (i14 != 0) {
                            a0Var2 = a0.E;
                        }
                        if (i16 != 0) {
                            z11 = true;
                        }
                        if (i18 != 0) {
                            objI1 = c0VarR.i0();
                            if (objI1 == c0.f35327a.a()) {
                                objI1 = new Function0() { // from class: androidx.compose.foundation.contextmenu.d
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return g.j();
                                    }
                                };
                                c0VarR.Y(objI1);
                            }
                            function5 = (Function0) objI1;
                        }
                        if (m0.l0()) {
                            m0.A0(1877873755, i12, -1, "androidx.compose.foundation.contextmenu.ContextMenuArea (ContextMenuArea.android.kt:46)");
                        }
                        if (z11) {
                            c0VarR.E(1788348907);
                            if ((458752 & i12) == 131072) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            if ((i12 & 14) == 4) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            z16 = z14 | z15;
                            objI0 = c0VarR.i0();
                            if (z16) {
                                objI0 = new Function1() { // from class: androidx.compose.foundation.contextmenu.e
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return g.k(function5, rVar, (n0.g) obj);
                                    }
                                };
                                c0VarR.Y(objI0);
                            } else {
                                objI0 = new Function1() { // from class: androidx.compose.foundation.contextmenu.e
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return g.k(function5, rVar, (n0.g) obj);
                                    }
                                };
                                c0VarR.Y(objI0);
                            }
                            a0VarC = j.c(a0Var2, (Function1) objI0);
                            c0VarR.A();
                        } else {
                            c0VarR.E(1788505767);
                            c0VarR.A();
                            a0VarC = a0Var2;
                        }
                        a1 a1VarK19 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), true);
                        iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        b1 b1VarK19 = c0VarR.k();
                        a0 a0VarN19 = androidx.compose.ui.m.n(c0VarR, a0VarC);
                        androidx.compose.ui.node.g.a aVar19 = androidx.compose.ui.node.g.I;
                        function0A = aVar19.a();
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
                        y7.n(c0VarD, a1VarK19, aVar19.e());
                        y7.n(c0VarD, b1VarK19, aVar19.g());
                        function2B = aVar19.b();
                        if (c0VarD.P()) {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        } else {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        }
                        y7.n(c0VarD, a0VarN19, aVar19.f());
                        d0 d0Var19 = d0.f15956a;
                        function3.invoke(c0VarR, Integer.valueOf((i12 >> 18) & 14));
                        f(rVar, function4, null, function1, c0VarR, (i12 & okhttp3.internal.ws.g.f334652s) | ((i12 << 3) & 7168), 4);
                        c0VarR.o();
                        if (m0.l0()) {
                            m0.z0();
                        }
                    } else {
                        c0VarR.u();
                    }
                    z13 = z11;
                    function6 = function5;
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        final a0 a0Var111 = a0Var2;
                        s5VarT.a(new Function2() { // from class: androidx.compose.foundation.contextmenu.f
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return g.l(rVar, function0, function1, a0Var111, z13, function6, function3, i10, i11, (c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= androidx.profileinstaller.n.c.f73814m;
                function5 = function2;
                if ((i11 & 64) != 0) {
                    i12 |= 1572864;
                } else if ((i10 & 1572864) == 0) {
                    if (c0VarR.k0(function3)) {
                        i20 = 1048576;
                    } else {
                        i20 = 524288;
                    }
                    i12 |= i20;
                }
                if ((i12 & 599187) != 599186) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    if (i14 != 0) {
                        a0Var2 = a0.E;
                    }
                    if (i16 != 0) {
                        z11 = true;
                    }
                    if (i18 != 0) {
                        objI1 = c0VarR.i0();
                        if (objI1 == c0.f35327a.a()) {
                            objI1 = new Function0() { // from class: androidx.compose.foundation.contextmenu.d
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return g.j();
                                }
                            };
                            c0VarR.Y(objI1);
                        }
                        function5 = (Function0) objI1;
                    }
                    if (m0.l0()) {
                        m0.A0(1877873755, i12, -1, "androidx.compose.foundation.contextmenu.ContextMenuArea (ContextMenuArea.android.kt:46)");
                    }
                    if (z11) {
                        c0VarR.E(1788348907);
                        if ((458752 & i12) == 131072) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if ((i12 & 14) == 4) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        z16 = z14 | z15;
                        objI0 = c0VarR.i0();
                        if (z16) {
                            objI0 = new Function1() { // from class: androidx.compose.foundation.contextmenu.e
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return g.k(function5, rVar, (n0.g) obj);
                                }
                            };
                            c0VarR.Y(objI0);
                        } else {
                            objI0 = new Function1() { // from class: androidx.compose.foundation.contextmenu.e
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return g.k(function5, rVar, (n0.g) obj);
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        a0VarC = j.c(a0Var2, (Function1) objI0);
                        c0VarR.A();
                    } else {
                        c0VarR.E(1788505767);
                        c0VarR.A();
                        a0VarC = a0Var2;
                    }
                    a1 a1VarK110 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), true);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK110 = c0VarR.k();
                    a0 a0VarN110 = androidx.compose.ui.m.n(c0VarR, a0VarC);
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
                    y7.n(c0VarD, a1VarK110, aVar110.e());
                    y7.n(c0VarD, b1VarK110, aVar110.g());
                    function2B = aVar110.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN110, aVar110.f());
                    d0 d0Var110 = d0.f15956a;
                    function3.invoke(c0VarR, Integer.valueOf((i12 >> 18) & 14));
                    f(rVar, function4, null, function1, c0VarR, (i12 & okhttp3.internal.ws.g.f334652s) | ((i12 << 3) & 7168), 4);
                    c0VarR.o();
                    if (m0.l0()) {
                        m0.z0();
                    }
                } else {
                    c0VarR.u();
                }
                z13 = z11;
                function6 = function5;
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    final a0 a0Var112 = a0Var2;
                    s5VarT.a(new Function2() { // from class: androidx.compose.foundation.contextmenu.f
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return g.l(rVar, function0, function1, a0Var112, z13, function6, function3, i10, i11, (c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 3072;
            a0Var2 = a0Var;
            i16 = i11 & 16;
            if (i16 != 0) {
                if ((i10 & 24576) == 0) {
                    z11 = z10;
                    if (c0VarR.G(z11)) {
                        i17 = 16384;
                    } else {
                        i17 = 8192;
                    }
                    i12 |= i17;
                }
                i18 = i11 & 32;
                if (i18 != 0) {
                    if ((196608 & i10) == 0) {
                        function5 = function2;
                        if (c0VarR.k0(function5)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                        i12 |= i19;
                    }
                    if ((i11 & 64) != 0) {
                        i12 |= 1572864;
                    } else if ((i10 & 1572864) == 0) {
                        if (c0VarR.k0(function3)) {
                            i20 = 1048576;
                        } else {
                            i20 = 524288;
                        }
                        i12 |= i20;
                    }
                    if ((i12 & 599187) != 599186) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (c0VarR.h(z12, i12 & 1)) {
                        if (i14 != 0) {
                            a0Var2 = a0.E;
                        }
                        if (i16 != 0) {
                            z11 = true;
                        }
                        if (i18 != 0) {
                            objI1 = c0VarR.i0();
                            if (objI1 == c0.f35327a.a()) {
                                objI1 = new Function0() { // from class: androidx.compose.foundation.contextmenu.d
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return g.j();
                                    }
                                };
                                c0VarR.Y(objI1);
                            }
                            function5 = (Function0) objI1;
                        }
                        if (m0.l0()) {
                            m0.A0(1877873755, i12, -1, "androidx.compose.foundation.contextmenu.ContextMenuArea (ContextMenuArea.android.kt:46)");
                        }
                        if (z11) {
                            c0VarR.E(1788348907);
                            if ((458752 & i12) == 131072) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            if ((i12 & 14) == 4) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            z16 = z14 | z15;
                            objI0 = c0VarR.i0();
                            if (z16) {
                                objI0 = new Function1() { // from class: androidx.compose.foundation.contextmenu.e
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return g.k(function5, rVar, (n0.g) obj);
                                    }
                                };
                                c0VarR.Y(objI0);
                            } else {
                                objI0 = new Function1() { // from class: androidx.compose.foundation.contextmenu.e
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return g.k(function5, rVar, (n0.g) obj);
                                    }
                                };
                                c0VarR.Y(objI0);
                            }
                            a0VarC = j.c(a0Var2, (Function1) objI0);
                            c0VarR.A();
                        } else {
                            c0VarR.E(1788505767);
                            c0VarR.A();
                            a0VarC = a0Var2;
                        }
                        a1 a1VarK111 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), true);
                        iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        b1 b1VarK111 = c0VarR.k();
                        a0 a0VarN111 = androidx.compose.ui.m.n(c0VarR, a0VarC);
                        androidx.compose.ui.node.g.a aVar111 = androidx.compose.ui.node.g.I;
                        function0A = aVar111.a();
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
                        y7.n(c0VarD, a1VarK111, aVar111.e());
                        y7.n(c0VarD, b1VarK111, aVar111.g());
                        function2B = aVar111.b();
                        if (c0VarD.P()) {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        } else {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        }
                        y7.n(c0VarD, a0VarN111, aVar111.f());
                        d0 d0Var111 = d0.f15956a;
                        function3.invoke(c0VarR, Integer.valueOf((i12 >> 18) & 14));
                        f(rVar, function4, null, function1, c0VarR, (i12 & okhttp3.internal.ws.g.f334652s) | ((i12 << 3) & 7168), 4);
                        c0VarR.o();
                        if (m0.l0()) {
                            m0.z0();
                        }
                    } else {
                        c0VarR.u();
                    }
                    z13 = z11;
                    function6 = function5;
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        final a0 a0Var113 = a0Var2;
                        s5VarT.a(new Function2() { // from class: androidx.compose.foundation.contextmenu.f
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return g.l(rVar, function0, function1, a0Var113, z13, function6, function3, i10, i11, (c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= androidx.profileinstaller.n.c.f73814m;
                function5 = function2;
                if ((i11 & 64) != 0) {
                    i12 |= 1572864;
                } else if ((i10 & 1572864) == 0) {
                    if (c0VarR.k0(function3)) {
                        i20 = 1048576;
                    } else {
                        i20 = 524288;
                    }
                    i12 |= i20;
                }
                if ((i12 & 599187) != 599186) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    if (i14 != 0) {
                        a0Var2 = a0.E;
                    }
                    if (i16 != 0) {
                        z11 = true;
                    }
                    if (i18 != 0) {
                        objI1 = c0VarR.i0();
                        if (objI1 == c0.f35327a.a()) {
                            objI1 = new Function0() { // from class: androidx.compose.foundation.contextmenu.d
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return g.j();
                                }
                            };
                            c0VarR.Y(objI1);
                        }
                        function5 = (Function0) objI1;
                    }
                    if (m0.l0()) {
                        m0.A0(1877873755, i12, -1, "androidx.compose.foundation.contextmenu.ContextMenuArea (ContextMenuArea.android.kt:46)");
                    }
                    if (z11) {
                        c0VarR.E(1788348907);
                        if ((458752 & i12) == 131072) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if ((i12 & 14) == 4) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        z16 = z14 | z15;
                        objI0 = c0VarR.i0();
                        if (z16) {
                            objI0 = new Function1() { // from class: androidx.compose.foundation.contextmenu.e
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return g.k(function5, rVar, (n0.g) obj);
                                }
                            };
                            c0VarR.Y(objI0);
                        } else {
                            objI0 = new Function1() { // from class: androidx.compose.foundation.contextmenu.e
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return g.k(function5, rVar, (n0.g) obj);
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        a0VarC = j.c(a0Var2, (Function1) objI0);
                        c0VarR.A();
                    } else {
                        c0VarR.E(1788505767);
                        c0VarR.A();
                        a0VarC = a0Var2;
                    }
                    a1 a1VarK112 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), true);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK112 = c0VarR.k();
                    a0 a0VarN112 = androidx.compose.ui.m.n(c0VarR, a0VarC);
                    androidx.compose.ui.node.g.a aVar112 = androidx.compose.ui.node.g.I;
                    function0A = aVar112.a();
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
                    y7.n(c0VarD, a1VarK112, aVar112.e());
                    y7.n(c0VarD, b1VarK112, aVar112.g());
                    function2B = aVar112.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN112, aVar112.f());
                    d0 d0Var112 = d0.f15956a;
                    function3.invoke(c0VarR, Integer.valueOf((i12 >> 18) & 14));
                    f(rVar, function4, null, function1, c0VarR, (i12 & okhttp3.internal.ws.g.f334652s) | ((i12 << 3) & 7168), 4);
                    c0VarR.o();
                    if (m0.l0()) {
                        m0.z0();
                    }
                } else {
                    c0VarR.u();
                }
                z13 = z11;
                function6 = function5;
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    final a0 a0Var114 = a0Var2;
                    s5VarT.a(new Function2() { // from class: androidx.compose.foundation.contextmenu.f
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return g.l(rVar, function0, function1, a0Var114, z13, function6, function3, i10, i11, (c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 24576;
            z11 = z10;
            i18 = i11 & 32;
            if (i18 != 0) {
                if ((196608 & i10) == 0) {
                    function5 = function2;
                    if (c0VarR.k0(function5)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                    i12 |= i19;
                }
                if ((i11 & 64) != 0) {
                    i12 |= 1572864;
                } else if ((i10 & 1572864) == 0) {
                    if (c0VarR.k0(function3)) {
                        i20 = 1048576;
                    } else {
                        i20 = 524288;
                    }
                    i12 |= i20;
                }
                if ((i12 & 599187) != 599186) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    if (i14 != 0) {
                        a0Var2 = a0.E;
                    }
                    if (i16 != 0) {
                        z11 = true;
                    }
                    if (i18 != 0) {
                        objI1 = c0VarR.i0();
                        if (objI1 == c0.f35327a.a()) {
                            objI1 = new Function0() { // from class: androidx.compose.foundation.contextmenu.d
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return g.j();
                                }
                            };
                            c0VarR.Y(objI1);
                        }
                        function5 = (Function0) objI1;
                    }
                    if (m0.l0()) {
                        m0.A0(1877873755, i12, -1, "androidx.compose.foundation.contextmenu.ContextMenuArea (ContextMenuArea.android.kt:46)");
                    }
                    if (z11) {
                        c0VarR.E(1788348907);
                        if ((458752 & i12) == 131072) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if ((i12 & 14) == 4) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        z16 = z14 | z15;
                        objI0 = c0VarR.i0();
                        if (z16) {
                            objI0 = new Function1() { // from class: androidx.compose.foundation.contextmenu.e
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return g.k(function5, rVar, (n0.g) obj);
                                }
                            };
                            c0VarR.Y(objI0);
                        } else {
                            objI0 = new Function1() { // from class: androidx.compose.foundation.contextmenu.e
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return g.k(function5, rVar, (n0.g) obj);
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        a0VarC = j.c(a0Var2, (Function1) objI0);
                        c0VarR.A();
                    } else {
                        c0VarR.E(1788505767);
                        c0VarR.A();
                        a0VarC = a0Var2;
                    }
                    a1 a1VarK113 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), true);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK113 = c0VarR.k();
                    a0 a0VarN113 = androidx.compose.ui.m.n(c0VarR, a0VarC);
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
                    y7.n(c0VarD, a1VarK113, aVar113.e());
                    y7.n(c0VarD, b1VarK113, aVar113.g());
                    function2B = aVar113.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN113, aVar113.f());
                    d0 d0Var113 = d0.f15956a;
                    function3.invoke(c0VarR, Integer.valueOf((i12 >> 18) & 14));
                    f(rVar, function4, null, function1, c0VarR, (i12 & okhttp3.internal.ws.g.f334652s) | ((i12 << 3) & 7168), 4);
                    c0VarR.o();
                    if (m0.l0()) {
                        m0.z0();
                    }
                } else {
                    c0VarR.u();
                }
                z13 = z11;
                function6 = function5;
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    final a0 a0Var115 = a0Var2;
                    s5VarT.a(new Function2() { // from class: androidx.compose.foundation.contextmenu.f
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return g.l(rVar, function0, function1, a0Var115, z13, function6, function3, i10, i11, (c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= androidx.profileinstaller.n.c.f73814m;
            function5 = function2;
            if ((i11 & 64) != 0) {
                i12 |= 1572864;
            } else if ((i10 & 1572864) == 0) {
                if (c0VarR.k0(function3)) {
                    i20 = 1048576;
                } else {
                    i20 = 524288;
                }
                i12 |= i20;
            }
            if ((i12 & 599187) != 599186) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i12 & 1)) {
                if (i14 != 0) {
                    a0Var2 = a0.E;
                }
                if (i16 != 0) {
                    z11 = true;
                }
                if (i18 != 0) {
                    objI1 = c0VarR.i0();
                    if (objI1 == c0.f35327a.a()) {
                        objI1 = new Function0() { // from class: androidx.compose.foundation.contextmenu.d
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return g.j();
                            }
                        };
                        c0VarR.Y(objI1);
                    }
                    function5 = (Function0) objI1;
                }
                if (m0.l0()) {
                    m0.A0(1877873755, i12, -1, "androidx.compose.foundation.contextmenu.ContextMenuArea (ContextMenuArea.android.kt:46)");
                }
                if (z11) {
                    c0VarR.E(1788348907);
                    if ((458752 & i12) == 131072) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if ((i12 & 14) == 4) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    z16 = z14 | z15;
                    objI0 = c0VarR.i0();
                    if (z16) {
                        objI0 = new Function1() { // from class: androidx.compose.foundation.contextmenu.e
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return g.k(function5, rVar, (n0.g) obj);
                            }
                        };
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = new Function1() { // from class: androidx.compose.foundation.contextmenu.e
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return g.k(function5, rVar, (n0.g) obj);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    a0VarC = j.c(a0Var2, (Function1) objI0);
                    c0VarR.A();
                } else {
                    c0VarR.E(1788505767);
                    c0VarR.A();
                    a0VarC = a0Var2;
                }
                a1 a1VarK114 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), true);
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK114 = c0VarR.k();
                a0 a0VarN114 = androidx.compose.ui.m.n(c0VarR, a0VarC);
                androidx.compose.ui.node.g.a aVar114 = androidx.compose.ui.node.g.I;
                function0A = aVar114.a();
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
                y7.n(c0VarD, a1VarK114, aVar114.e());
                y7.n(c0VarD, b1VarK114, aVar114.g());
                function2B = aVar114.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN114, aVar114.f());
                d0 d0Var114 = d0.f15956a;
                function3.invoke(c0VarR, Integer.valueOf((i12 >> 18) & 14));
                f(rVar, function4, null, function1, c0VarR, (i12 & okhttp3.internal.ws.g.f334652s) | ((i12 << 3) & 7168), 4);
                c0VarR.o();
                if (m0.l0()) {
                    m0.z0();
                }
            } else {
                c0VarR.u();
            }
            z13 = z11;
            function6 = function5;
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                final a0 a0Var116 = a0Var2;
                s5VarT.a(new Function2() { // from class: androidx.compose.foundation.contextmenu.f
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return g.l(rVar, function0, function1, a0Var116, z13, function6, function3, i10, i11, (c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= a5.S0;
        i14 = i11 & 8;
        if (i14 != 0) {
            if ((i10 & 3072) == 0) {
                a0Var2 = a0Var;
                if (c0VarR.D(a0Var2)) {
                    i15 = 2048;
                } else {
                    i15 = 1024;
                }
                i12 |= i15;
            }
            i16 = i11 & 16;
            if (i16 != 0) {
                if ((i10 & 24576) == 0) {
                    z11 = z10;
                    if (c0VarR.G(z11)) {
                        i17 = 16384;
                    } else {
                        i17 = 8192;
                    }
                    i12 |= i17;
                }
                i18 = i11 & 32;
                if (i18 != 0) {
                    if ((196608 & i10) == 0) {
                        function5 = function2;
                        if (c0VarR.k0(function5)) {
                            i19 = 131072;
                        } else {
                            i19 = 65536;
                        }
                        i12 |= i19;
                    }
                    if ((i11 & 64) != 0) {
                        i12 |= 1572864;
                    } else if ((i10 & 1572864) == 0) {
                        if (c0VarR.k0(function3)) {
                            i20 = 1048576;
                        } else {
                            i20 = 524288;
                        }
                        i12 |= i20;
                    }
                    if ((i12 & 599187) != 599186) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (c0VarR.h(z12, i12 & 1)) {
                        if (i14 != 0) {
                            a0Var2 = a0.E;
                        }
                        if (i16 != 0) {
                            z11 = true;
                        }
                        if (i18 != 0) {
                            objI1 = c0VarR.i0();
                            if (objI1 == c0.f35327a.a()) {
                                objI1 = new Function0() { // from class: androidx.compose.foundation.contextmenu.d
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return g.j();
                                    }
                                };
                                c0VarR.Y(objI1);
                            }
                            function5 = (Function0) objI1;
                        }
                        if (m0.l0()) {
                            m0.A0(1877873755, i12, -1, "androidx.compose.foundation.contextmenu.ContextMenuArea (ContextMenuArea.android.kt:46)");
                        }
                        if (z11) {
                            c0VarR.E(1788348907);
                            if ((458752 & i12) == 131072) {
                                z14 = true;
                            } else {
                                z14 = false;
                            }
                            if ((i12 & 14) == 4) {
                                z15 = true;
                            } else {
                                z15 = false;
                            }
                            z16 = z14 | z15;
                            objI0 = c0VarR.i0();
                            if (z16) {
                                objI0 = new Function1() { // from class: androidx.compose.foundation.contextmenu.e
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return g.k(function5, rVar, (n0.g) obj);
                                    }
                                };
                                c0VarR.Y(objI0);
                            } else {
                                objI0 = new Function1() { // from class: androidx.compose.foundation.contextmenu.e
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return g.k(function5, rVar, (n0.g) obj);
                                    }
                                };
                                c0VarR.Y(objI0);
                            }
                            a0VarC = j.c(a0Var2, (Function1) objI0);
                            c0VarR.A();
                        } else {
                            c0VarR.E(1788505767);
                            c0VarR.A();
                            a0VarC = a0Var2;
                        }
                        a1 a1VarK115 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), true);
                        iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                        b1 b1VarK115 = c0VarR.k();
                        a0 a0VarN115 = androidx.compose.ui.m.n(c0VarR, a0VarC);
                        androidx.compose.ui.node.g.a aVar115 = androidx.compose.ui.node.g.I;
                        function0A = aVar115.a();
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
                        y7.n(c0VarD, a1VarK115, aVar115.e());
                        y7.n(c0VarD, b1VarK115, aVar115.g());
                        function2B = aVar115.b();
                        if (c0VarD.P()) {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        } else {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        }
                        y7.n(c0VarD, a0VarN115, aVar115.f());
                        d0 d0Var115 = d0.f15956a;
                        function3.invoke(c0VarR, Integer.valueOf((i12 >> 18) & 14));
                        f(rVar, function4, null, function1, c0VarR, (i12 & okhttp3.internal.ws.g.f334652s) | ((i12 << 3) & 7168), 4);
                        c0VarR.o();
                        if (m0.l0()) {
                            m0.z0();
                        }
                    } else {
                        c0VarR.u();
                    }
                    z13 = z11;
                    function6 = function5;
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        final a0 a0Var117 = a0Var2;
                        s5VarT.a(new Function2() { // from class: androidx.compose.foundation.contextmenu.f
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return g.l(rVar, function0, function1, a0Var117, z13, function6, function3, i10, i11, (c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= androidx.profileinstaller.n.c.f73814m;
                function5 = function2;
                if ((i11 & 64) != 0) {
                    i12 |= 1572864;
                } else if ((i10 & 1572864) == 0) {
                    if (c0VarR.k0(function3)) {
                        i20 = 1048576;
                    } else {
                        i20 = 524288;
                    }
                    i12 |= i20;
                }
                if ((i12 & 599187) != 599186) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    if (i14 != 0) {
                        a0Var2 = a0.E;
                    }
                    if (i16 != 0) {
                        z11 = true;
                    }
                    if (i18 != 0) {
                        objI1 = c0VarR.i0();
                        if (objI1 == c0.f35327a.a()) {
                            objI1 = new Function0() { // from class: androidx.compose.foundation.contextmenu.d
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return g.j();
                                }
                            };
                            c0VarR.Y(objI1);
                        }
                        function5 = (Function0) objI1;
                    }
                    if (m0.l0()) {
                        m0.A0(1877873755, i12, -1, "androidx.compose.foundation.contextmenu.ContextMenuArea (ContextMenuArea.android.kt:46)");
                    }
                    if (z11) {
                        c0VarR.E(1788348907);
                        if ((458752 & i12) == 131072) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if ((i12 & 14) == 4) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        z16 = z14 | z15;
                        objI0 = c0VarR.i0();
                        if (z16) {
                            objI0 = new Function1() { // from class: androidx.compose.foundation.contextmenu.e
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return g.k(function5, rVar, (n0.g) obj);
                                }
                            };
                            c0VarR.Y(objI0);
                        } else {
                            objI0 = new Function1() { // from class: androidx.compose.foundation.contextmenu.e
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return g.k(function5, rVar, (n0.g) obj);
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        a0VarC = j.c(a0Var2, (Function1) objI0);
                        c0VarR.A();
                    } else {
                        c0VarR.E(1788505767);
                        c0VarR.A();
                        a0VarC = a0Var2;
                    }
                    a1 a1VarK116 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), true);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK116 = c0VarR.k();
                    a0 a0VarN116 = androidx.compose.ui.m.n(c0VarR, a0VarC);
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
                    y7.n(c0VarD, a1VarK116, aVar116.e());
                    y7.n(c0VarD, b1VarK116, aVar116.g());
                    function2B = aVar116.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN116, aVar116.f());
                    d0 d0Var116 = d0.f15956a;
                    function3.invoke(c0VarR, Integer.valueOf((i12 >> 18) & 14));
                    f(rVar, function4, null, function1, c0VarR, (i12 & okhttp3.internal.ws.g.f334652s) | ((i12 << 3) & 7168), 4);
                    c0VarR.o();
                    if (m0.l0()) {
                        m0.z0();
                    }
                } else {
                    c0VarR.u();
                }
                z13 = z11;
                function6 = function5;
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    final a0 a0Var118 = a0Var2;
                    s5VarT.a(new Function2() { // from class: androidx.compose.foundation.contextmenu.f
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return g.l(rVar, function0, function1, a0Var118, z13, function6, function3, i10, i11, (c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 24576;
            z11 = z10;
            i18 = i11 & 32;
            if (i18 != 0) {
                if ((196608 & i10) == 0) {
                    function5 = function2;
                    if (c0VarR.k0(function5)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                    i12 |= i19;
                }
                if ((i11 & 64) != 0) {
                    i12 |= 1572864;
                } else if ((i10 & 1572864) == 0) {
                    if (c0VarR.k0(function3)) {
                        i20 = 1048576;
                    } else {
                        i20 = 524288;
                    }
                    i12 |= i20;
                }
                if ((i12 & 599187) != 599186) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    if (i14 != 0) {
                        a0Var2 = a0.E;
                    }
                    if (i16 != 0) {
                        z11 = true;
                    }
                    if (i18 != 0) {
                        objI1 = c0VarR.i0();
                        if (objI1 == c0.f35327a.a()) {
                            objI1 = new Function0() { // from class: androidx.compose.foundation.contextmenu.d
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return g.j();
                                }
                            };
                            c0VarR.Y(objI1);
                        }
                        function5 = (Function0) objI1;
                    }
                    if (m0.l0()) {
                        m0.A0(1877873755, i12, -1, "androidx.compose.foundation.contextmenu.ContextMenuArea (ContextMenuArea.android.kt:46)");
                    }
                    if (z11) {
                        c0VarR.E(1788348907);
                        if ((458752 & i12) == 131072) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if ((i12 & 14) == 4) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        z16 = z14 | z15;
                        objI0 = c0VarR.i0();
                        if (z16) {
                            objI0 = new Function1() { // from class: androidx.compose.foundation.contextmenu.e
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return g.k(function5, rVar, (n0.g) obj);
                                }
                            };
                            c0VarR.Y(objI0);
                        } else {
                            objI0 = new Function1() { // from class: androidx.compose.foundation.contextmenu.e
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return g.k(function5, rVar, (n0.g) obj);
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        a0VarC = j.c(a0Var2, (Function1) objI0);
                        c0VarR.A();
                    } else {
                        c0VarR.E(1788505767);
                        c0VarR.A();
                        a0VarC = a0Var2;
                    }
                    a1 a1VarK117 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), true);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK117 = c0VarR.k();
                    a0 a0VarN117 = androidx.compose.ui.m.n(c0VarR, a0VarC);
                    androidx.compose.ui.node.g.a aVar117 = androidx.compose.ui.node.g.I;
                    function0A = aVar117.a();
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
                    y7.n(c0VarD, a1VarK117, aVar117.e());
                    y7.n(c0VarD, b1VarK117, aVar117.g());
                    function2B = aVar117.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN117, aVar117.f());
                    d0 d0Var117 = d0.f15956a;
                    function3.invoke(c0VarR, Integer.valueOf((i12 >> 18) & 14));
                    f(rVar, function4, null, function1, c0VarR, (i12 & okhttp3.internal.ws.g.f334652s) | ((i12 << 3) & 7168), 4);
                    c0VarR.o();
                    if (m0.l0()) {
                        m0.z0();
                    }
                } else {
                    c0VarR.u();
                }
                z13 = z11;
                function6 = function5;
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    final a0 a0Var119 = a0Var2;
                    s5VarT.a(new Function2() { // from class: androidx.compose.foundation.contextmenu.f
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return g.l(rVar, function0, function1, a0Var119, z13, function6, function3, i10, i11, (c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= androidx.profileinstaller.n.c.f73814m;
            function5 = function2;
            if ((i11 & 64) != 0) {
                i12 |= 1572864;
            } else if ((i10 & 1572864) == 0) {
                if (c0VarR.k0(function3)) {
                    i20 = 1048576;
                } else {
                    i20 = 524288;
                }
                i12 |= i20;
            }
            if ((i12 & 599187) != 599186) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i12 & 1)) {
                if (i14 != 0) {
                    a0Var2 = a0.E;
                }
                if (i16 != 0) {
                    z11 = true;
                }
                if (i18 != 0) {
                    objI1 = c0VarR.i0();
                    if (objI1 == c0.f35327a.a()) {
                        objI1 = new Function0() { // from class: androidx.compose.foundation.contextmenu.d
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return g.j();
                            }
                        };
                        c0VarR.Y(objI1);
                    }
                    function5 = (Function0) objI1;
                }
                if (m0.l0()) {
                    m0.A0(1877873755, i12, -1, "androidx.compose.foundation.contextmenu.ContextMenuArea (ContextMenuArea.android.kt:46)");
                }
                if (z11) {
                    c0VarR.E(1788348907);
                    if ((458752 & i12) == 131072) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if ((i12 & 14) == 4) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    z16 = z14 | z15;
                    objI0 = c0VarR.i0();
                    if (z16) {
                        objI0 = new Function1() { // from class: androidx.compose.foundation.contextmenu.e
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return g.k(function5, rVar, (n0.g) obj);
                            }
                        };
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = new Function1() { // from class: androidx.compose.foundation.contextmenu.e
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return g.k(function5, rVar, (n0.g) obj);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    a0VarC = j.c(a0Var2, (Function1) objI0);
                    c0VarR.A();
                } else {
                    c0VarR.E(1788505767);
                    c0VarR.A();
                    a0VarC = a0Var2;
                }
                a1 a1VarK118 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), true);
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK118 = c0VarR.k();
                a0 a0VarN118 = androidx.compose.ui.m.n(c0VarR, a0VarC);
                androidx.compose.ui.node.g.a aVar118 = androidx.compose.ui.node.g.I;
                function0A = aVar118.a();
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
                y7.n(c0VarD, a1VarK118, aVar118.e());
                y7.n(c0VarD, b1VarK118, aVar118.g());
                function2B = aVar118.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN118, aVar118.f());
                d0 d0Var118 = d0.f15956a;
                function3.invoke(c0VarR, Integer.valueOf((i12 >> 18) & 14));
                f(rVar, function4, null, function1, c0VarR, (i12 & okhttp3.internal.ws.g.f334652s) | ((i12 << 3) & 7168), 4);
                c0VarR.o();
                if (m0.l0()) {
                    m0.z0();
                }
            } else {
                c0VarR.u();
            }
            z13 = z11;
            function6 = function5;
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                final a0 a0Var1110 = a0Var2;
                s5VarT.a(new Function2() { // from class: androidx.compose.foundation.contextmenu.f
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return g.l(rVar, function0, function1, a0Var1110, z13, function6, function3, i10, i11, (c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 3072;
        a0Var2 = a0Var;
        i16 = i11 & 16;
        if (i16 != 0) {
            if ((i10 & 24576) == 0) {
                z11 = z10;
                if (c0VarR.G(z11)) {
                    i17 = 16384;
                } else {
                    i17 = 8192;
                }
                i12 |= i17;
            }
            i18 = i11 & 32;
            if (i18 != 0) {
                if ((196608 & i10) == 0) {
                    function5 = function2;
                    if (c0VarR.k0(function5)) {
                        i19 = 131072;
                    } else {
                        i19 = 65536;
                    }
                    i12 |= i19;
                }
                if ((i11 & 64) != 0) {
                    i12 |= 1572864;
                } else if ((i10 & 1572864) == 0) {
                    if (c0VarR.k0(function3)) {
                        i20 = 1048576;
                    } else {
                        i20 = 524288;
                    }
                    i12 |= i20;
                }
                if ((i12 & 599187) != 599186) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    if (i14 != 0) {
                        a0Var2 = a0.E;
                    }
                    if (i16 != 0) {
                        z11 = true;
                    }
                    if (i18 != 0) {
                        objI1 = c0VarR.i0();
                        if (objI1 == c0.f35327a.a()) {
                            objI1 = new Function0() { // from class: androidx.compose.foundation.contextmenu.d
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return g.j();
                                }
                            };
                            c0VarR.Y(objI1);
                        }
                        function5 = (Function0) objI1;
                    }
                    if (m0.l0()) {
                        m0.A0(1877873755, i12, -1, "androidx.compose.foundation.contextmenu.ContextMenuArea (ContextMenuArea.android.kt:46)");
                    }
                    if (z11) {
                        c0VarR.E(1788348907);
                        if ((458752 & i12) == 131072) {
                            z14 = true;
                        } else {
                            z14 = false;
                        }
                        if ((i12 & 14) == 4) {
                            z15 = true;
                        } else {
                            z15 = false;
                        }
                        z16 = z14 | z15;
                        objI0 = c0VarR.i0();
                        if (z16) {
                            objI0 = new Function1() { // from class: androidx.compose.foundation.contextmenu.e
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return g.k(function5, rVar, (n0.g) obj);
                                }
                            };
                            c0VarR.Y(objI0);
                        } else {
                            objI0 = new Function1() { // from class: androidx.compose.foundation.contextmenu.e
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return g.k(function5, rVar, (n0.g) obj);
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        a0VarC = j.c(a0Var2, (Function1) objI0);
                        c0VarR.A();
                    } else {
                        c0VarR.E(1788505767);
                        c0VarR.A();
                        a0VarC = a0Var2;
                    }
                    a1 a1VarK119 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), true);
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                    b1 b1VarK119 = c0VarR.k();
                    a0 a0VarN119 = androidx.compose.ui.m.n(c0VarR, a0VarC);
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
                    y7.n(c0VarD, a1VarK119, aVar119.e());
                    y7.n(c0VarD, b1VarK119, aVar119.g());
                    function2B = aVar119.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    y7.n(c0VarD, a0VarN119, aVar119.f());
                    d0 d0Var119 = d0.f15956a;
                    function3.invoke(c0VarR, Integer.valueOf((i12 >> 18) & 14));
                    f(rVar, function4, null, function1, c0VarR, (i12 & okhttp3.internal.ws.g.f334652s) | ((i12 << 3) & 7168), 4);
                    c0VarR.o();
                    if (m0.l0()) {
                        m0.z0();
                    }
                } else {
                    c0VarR.u();
                }
                z13 = z11;
                function6 = function5;
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    final a0 a0Var1111 = a0Var2;
                    s5VarT.a(new Function2() { // from class: androidx.compose.foundation.contextmenu.f
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return g.l(rVar, function0, function1, a0Var1111, z13, function6, function3, i10, i11, (c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= androidx.profileinstaller.n.c.f73814m;
            function5 = function2;
            if ((i11 & 64) != 0) {
                i12 |= 1572864;
            } else if ((i10 & 1572864) == 0) {
                if (c0VarR.k0(function3)) {
                    i20 = 1048576;
                } else {
                    i20 = 524288;
                }
                i12 |= i20;
            }
            if ((i12 & 599187) != 599186) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i12 & 1)) {
                if (i14 != 0) {
                    a0Var2 = a0.E;
                }
                if (i16 != 0) {
                    z11 = true;
                }
                if (i18 != 0) {
                    objI1 = c0VarR.i0();
                    if (objI1 == c0.f35327a.a()) {
                        objI1 = new Function0() { // from class: androidx.compose.foundation.contextmenu.d
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return g.j();
                            }
                        };
                        c0VarR.Y(objI1);
                    }
                    function5 = (Function0) objI1;
                }
                if (m0.l0()) {
                    m0.A0(1877873755, i12, -1, "androidx.compose.foundation.contextmenu.ContextMenuArea (ContextMenuArea.android.kt:46)");
                }
                if (z11) {
                    c0VarR.E(1788348907);
                    if ((458752 & i12) == 131072) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if ((i12 & 14) == 4) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    z16 = z14 | z15;
                    objI0 = c0VarR.i0();
                    if (z16) {
                        objI0 = new Function1() { // from class: androidx.compose.foundation.contextmenu.e
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return g.k(function5, rVar, (n0.g) obj);
                            }
                        };
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = new Function1() { // from class: androidx.compose.foundation.contextmenu.e
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return g.k(function5, rVar, (n0.g) obj);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    a0VarC = j.c(a0Var2, (Function1) objI0);
                    c0VarR.A();
                } else {
                    c0VarR.E(1788505767);
                    c0VarR.A();
                    a0VarC = a0Var2;
                }
                a1 a1VarK1110 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), true);
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK1110 = c0VarR.k();
                a0 a0VarN1110 = androidx.compose.ui.m.n(c0VarR, a0VarC);
                androidx.compose.ui.node.g.a aVar1110 = androidx.compose.ui.node.g.I;
                function0A = aVar1110.a();
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
                y7.n(c0VarD, a1VarK1110, aVar1110.e());
                y7.n(c0VarD, b1VarK1110, aVar1110.g());
                function2B = aVar1110.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN1110, aVar1110.f());
                d0 d0Var1110 = d0.f15956a;
                function3.invoke(c0VarR, Integer.valueOf((i12 >> 18) & 14));
                f(rVar, function4, null, function1, c0VarR, (i12 & okhttp3.internal.ws.g.f334652s) | ((i12 << 3) & 7168), 4);
                c0VarR.o();
                if (m0.l0()) {
                    m0.z0();
                }
            } else {
                c0VarR.u();
            }
            z13 = z11;
            function6 = function5;
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                final a0 a0Var1112 = a0Var2;
                s5VarT.a(new Function2() { // from class: androidx.compose.foundation.contextmenu.f
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return g.l(rVar, function0, function1, a0Var1112, z13, function6, function3, i10, i11, (c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 24576;
        z11 = z10;
        i18 = i11 & 32;
        if (i18 != 0) {
            if ((196608 & i10) == 0) {
                function5 = function2;
                if (c0VarR.k0(function5)) {
                    i19 = 131072;
                } else {
                    i19 = 65536;
                }
                i12 |= i19;
            }
            if ((i11 & 64) != 0) {
                i12 |= 1572864;
            } else if ((i10 & 1572864) == 0) {
                if (c0VarR.k0(function3)) {
                    i20 = 1048576;
                } else {
                    i20 = 524288;
                }
                i12 |= i20;
            }
            if ((i12 & 599187) != 599186) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i12 & 1)) {
                if (i14 != 0) {
                    a0Var2 = a0.E;
                }
                if (i16 != 0) {
                    z11 = true;
                }
                if (i18 != 0) {
                    objI1 = c0VarR.i0();
                    if (objI1 == c0.f35327a.a()) {
                        objI1 = new Function0() { // from class: androidx.compose.foundation.contextmenu.d
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return g.j();
                            }
                        };
                        c0VarR.Y(objI1);
                    }
                    function5 = (Function0) objI1;
                }
                if (m0.l0()) {
                    m0.A0(1877873755, i12, -1, "androidx.compose.foundation.contextmenu.ContextMenuArea (ContextMenuArea.android.kt:46)");
                }
                if (z11) {
                    c0VarR.E(1788348907);
                    if ((458752 & i12) == 131072) {
                        z14 = true;
                    } else {
                        z14 = false;
                    }
                    if ((i12 & 14) == 4) {
                        z15 = true;
                    } else {
                        z15 = false;
                    }
                    z16 = z14 | z15;
                    objI0 = c0VarR.i0();
                    if (z16) {
                        objI0 = new Function1() { // from class: androidx.compose.foundation.contextmenu.e
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return g.k(function5, rVar, (n0.g) obj);
                            }
                        };
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = new Function1() { // from class: androidx.compose.foundation.contextmenu.e
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return g.k(function5, rVar, (n0.g) obj);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    a0VarC = j.c(a0Var2, (Function1) objI0);
                    c0VarR.A();
                } else {
                    c0VarR.E(1788505767);
                    c0VarR.A();
                    a0VarC = a0Var2;
                }
                a1 a1VarK1111 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), true);
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
                b1 b1VarK1111 = c0VarR.k();
                a0 a0VarN1111 = androidx.compose.ui.m.n(c0VarR, a0VarC);
                androidx.compose.ui.node.g.a aVar1111 = androidx.compose.ui.node.g.I;
                function0A = aVar1111.a();
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
                y7.n(c0VarD, a1VarK1111, aVar1111.e());
                y7.n(c0VarD, b1VarK1111, aVar1111.g());
                function2B = aVar1111.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                y7.n(c0VarD, a0VarN1111, aVar1111.f());
                d0 d0Var1111 = d0.f15956a;
                function3.invoke(c0VarR, Integer.valueOf((i12 >> 18) & 14));
                f(rVar, function4, null, function1, c0VarR, (i12 & okhttp3.internal.ws.g.f334652s) | ((i12 << 3) & 7168), 4);
                c0VarR.o();
                if (m0.l0()) {
                    m0.z0();
                }
            } else {
                c0VarR.u();
            }
            z13 = z11;
            function6 = function5;
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                final a0 a0Var1113 = a0Var2;
                s5VarT.a(new Function2() { // from class: androidx.compose.foundation.contextmenu.f
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return g.l(rVar, function0, function1, a0Var1113, z13, function6, function3, i10, i11, (c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= androidx.profileinstaller.n.c.f73814m;
        function5 = function2;
        if ((i11 & 64) != 0) {
            i12 |= 1572864;
        } else if ((i10 & 1572864) == 0) {
            if (c0VarR.k0(function3)) {
                i20 = 1048576;
            } else {
                i20 = 524288;
            }
            i12 |= i20;
        }
        if ((i12 & 599187) != 599186) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (c0VarR.h(z12, i12 & 1)) {
            if (i14 != 0) {
                a0Var2 = a0.E;
            }
            if (i16 != 0) {
                z11 = true;
            }
            if (i18 != 0) {
                objI1 = c0VarR.i0();
                if (objI1 == c0.f35327a.a()) {
                    objI1 = new Function0() { // from class: androidx.compose.foundation.contextmenu.d
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return g.j();
                        }
                    };
                    c0VarR.Y(objI1);
                }
                function5 = (Function0) objI1;
            }
            if (m0.l0()) {
                m0.A0(1877873755, i12, -1, "androidx.compose.foundation.contextmenu.ContextMenuArea (ContextMenuArea.android.kt:46)");
            }
            if (z11) {
                c0VarR.E(1788348907);
                if ((458752 & i12) == 131072) {
                    z14 = true;
                } else {
                    z14 = false;
                }
                if ((i12 & 14) == 4) {
                    z15 = true;
                } else {
                    z15 = false;
                }
                z16 = z14 | z15;
                objI0 = c0VarR.i0();
                if (z16) {
                    objI0 = new Function1() { // from class: androidx.compose.foundation.contextmenu.e
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return g.k(function5, rVar, (n0.g) obj);
                        }
                    };
                    c0VarR.Y(objI0);
                } else {
                    objI0 = new Function1() { // from class: androidx.compose.foundation.contextmenu.e
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return g.k(function5, rVar, (n0.g) obj);
                        }
                    };
                    c0VarR.Y(objI0);
                }
                a0VarC = j.c(a0Var2, (Function1) objI0);
                c0VarR.A();
            } else {
                c0VarR.E(1788505767);
                c0VarR.A();
                a0VarC = a0Var2;
            }
            a1 a1VarK1112 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), true);
            iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, 0));
            b1 b1VarK1112 = c0VarR.k();
            a0 a0VarN1112 = androidx.compose.ui.m.n(c0VarR, a0VarC);
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
            y7.n(c0VarD, a1VarK1112, aVar1112.e());
            y7.n(c0VarD, b1VarK1112, aVar1112.g());
            function2B = aVar1112.b();
            if (c0VarD.P()) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            } else {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            y7.n(c0VarD, a0VarN1112, aVar1112.f());
            d0 d0Var1112 = d0.f15956a;
            function3.invoke(c0VarR, Integer.valueOf((i12 >> 18) & 14));
            f(rVar, function4, null, function1, c0VarR, (i12 & okhttp3.internal.ws.g.f334652s) | ((i12 << 3) & 7168), 4);
            c0VarR.o();
            if (m0.l0()) {
                m0.z0();
            }
        } else {
            c0VarR.u();
        }
        z13 = z11;
        function6 = function5;
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            final a0 a0Var1114 = a0Var2;
            s5VarT.a(new Function2() { // from class: androidx.compose.foundation.contextmenu.f
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return g.l(rVar, function0, function1, a0Var1114, z13, function6, function3, i10, i11, (c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j() {
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(Function0 function0, r rVar, n0.g gVar) {
        function0.invoke();
        rVar.b(new r.a.b(gVar.B(), null));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(r rVar, Function0 function0, Function1 function1, a0 a0Var, boolean z10, Function0 function2, Function2 function3, int i10, int i11, c0 c0Var, int i12) {
        i(rVar, function0, function1, a0Var, z10, function2, function3, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }
}

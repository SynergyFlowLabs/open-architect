package androidx.compose.material3;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Card.kt\nandroidx/compose/material3/CardKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n*L\n1#1,847:1\n1282#2,6:848\n*S KotlinDebug\n*F\n+ 1 Card.kt\nandroidx/compose/material3/CardKt\n*L\n148#1:848,6\n*E\n"})
public final class m4 {

    @SourceDebugExtension({"SMAP\nCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Card.kt\nandroidx/compose/material3/CardKt$Card$1\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,847:1\n87#2:848\n83#2,10:849\n94#2:889\n79#3,6:859\n86#3,3:874\n89#3,2:883\n93#3:888\n347#4,9:865\n356#4,3:885\n4206#5,6:877\n*S KotlinDebug\n*F\n+ 1 Card.kt\nandroidx/compose/material3/CardKt$Card$1\n*L\n96#1:848\n96#1:849,10\n96#1:889\n96#1:859,6\n96#1:874,3\n96#1:883,2\n96#1:888\n96#1:865,9\n96#1:885,3\n96#1:877,6\n*E\n"})
    static final class a implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ pj.n<androidx.compose.foundation.layout.m0, androidx.compose.runtime.c0, Integer, Unit> f30529a;

        /* JADX WARN: Multi-variable type inference failed */
        a(pj.n<? super androidx.compose.foundation.layout.m0, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar) {
            this.f30529a = nVar;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-97109725, i10, -1, "androidx.compose.material3.Card.<anonymous> (Card.kt:95)");
            }
            pj.n<androidx.compose.foundation.layout.m0, androidx.compose.runtime.c0, Integer, Unit> nVar = this.f30529a;
            androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
            androidx.compose.ui.layout.a1 a1VarB = androidx.compose.foundation.layout.j0.b(androidx.compose.foundation.layout.q.f16330a.y(), androidx.compose.ui.e.f37317a.u(), c0Var, 0);
            int iJ = androidx.compose.runtime.v.j(c0Var, 0);
            androidx.compose.runtime.b1 b1VarK = c0Var.k();
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0Var, aVar);
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
            androidx.compose.runtime.y7.n(c0VarD, a1VarB, aVar2.e());
            androidx.compose.runtime.y7.n(c0VarD, b1VarK, aVar2.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar2.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iJ))) {
                c0VarD.Y(Integer.valueOf(iJ));
                c0VarD.f(Integer.valueOf(iJ), function2B);
            }
            androidx.compose.runtime.y7.n(c0VarD, a0VarN, aVar2.f());
            nVar.invoke(androidx.compose.foundation.layout.n0.f16227a, c0Var, 6);
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

    @SourceDebugExtension({"SMAP\nCard.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Card.kt\nandroidx/compose/material3/CardKt$Card$3\n+ 2 Column.kt\nandroidx/compose/foundation/layout/ColumnKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,847:1\n87#2:848\n83#2,10:849\n94#2:889\n79#3,6:859\n86#3,3:874\n89#3,2:883\n93#3:888\n347#4,9:865\n356#4,3:885\n4206#5,6:877\n*S KotlinDebug\n*F\n+ 1 Card.kt\nandroidx/compose/material3/CardKt$Card$3\n*L\n160#1:848\n160#1:849,10\n160#1:889\n160#1:859,6\n160#1:874,3\n160#1:883,2\n160#1:888\n160#1:865,9\n160#1:885,3\n160#1:877,6\n*E\n"})
    static final class b implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ pj.n<androidx.compose.foundation.layout.m0, androidx.compose.runtime.c0, Integer, Unit> f30530a;

        /* JADX WARN: Multi-variable type inference failed */
        b(pj.n<? super androidx.compose.foundation.layout.m0, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar) {
            this.f30530a = nVar;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1347531112, i10, -1, "androidx.compose.material3.Card.<anonymous> (Card.kt:159)");
            }
            pj.n<androidx.compose.foundation.layout.m0, androidx.compose.runtime.c0, Integer, Unit> nVar = this.f30530a;
            androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
            androidx.compose.ui.layout.a1 a1VarB = androidx.compose.foundation.layout.j0.b(androidx.compose.foundation.layout.q.f16330a.y(), androidx.compose.ui.e.f37317a.u(), c0Var, 0);
            int iJ = androidx.compose.runtime.v.j(c0Var, 0);
            androidx.compose.runtime.b1 b1VarK = c0Var.k();
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0Var, aVar);
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
            androidx.compose.runtime.y7.n(c0VarD, a1VarB, aVar2.e());
            androidx.compose.runtime.y7.n(c0VarD, b1VarK, aVar2.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar2.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iJ))) {
                c0VarD.Y(Integer.valueOf(iJ));
                c0VarD.f(Integer.valueOf(iJ), function2B);
            }
            androidx.compose.runtime.y7.n(c0VarD, a0VarN, aVar2.f());
            nVar.invoke(androidx.compose.foundation.layout.n0.f16227a, c0Var, 6);
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

    /* JADX WARN: Code duplicated, block: B:101:0x0128  */
    /* JADX WARN: Code duplicated, block: B:102:0x0145  */
    /* JADX WARN: Code duplicated, block: B:105:0x0152  */
    /* JADX WARN: Code duplicated, block: B:106:0x0156  */
    /* JADX WARN: Code duplicated, block: B:109:0x0164  */
    /* JADX WARN: Code duplicated, block: B:112:0x01bb  */
    /* JADX WARN: Code duplicated, block: B:114:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:117:0x01d8  */
    /* JADX WARN: Code duplicated, block: B:119:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:60:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:73:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:88:0x0102 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:89:0x0104  */
    /* JADX WARN: Code duplicated, block: B:90:0x0107  */
    /* JADX WARN: Code duplicated, block: B:93:0x010c  */
    /* JADX WARN: Code duplicated, block: B:94:0x0115  */
    /* JADX WARN: Code duplicated, block: B:97:0x011a  */
    /* JADX WARN: Code duplicated, block: B:98:0x0123  */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void g(@Nullable androidx.compose.ui.a0 a0Var, @Nullable androidx.compose.ui.graphics.q3 q3Var, @Nullable d4 d4Var, @Nullable f4 f4Var, @Nullable androidx.compose.foundation.a1 a1Var, @NotNull final pj.n<? super androidx.compose.foundation.layout.m0, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        androidx.compose.ui.a0 a0Var2;
        int i12;
        androidx.compose.ui.graphics.q3 q3Var2;
        d4 d4Var2;
        f4 f4VarC;
        androidx.compose.foundation.a1 a1Var2;
        int i13;
        boolean z10;
        final androidx.compose.ui.a0 a0Var3;
        final androidx.compose.ui.graphics.q3 q3Var3;
        final d4 d4Var3;
        final f4 f4Var2;
        final androidx.compose.foundation.a1 a1Var3;
        androidx.compose.runtime.s5 s5VarT;
        androidx.compose.ui.a0 a0Var4;
        androidx.compose.ui.graphics.q3 q3VarL;
        d4 d4VarA;
        boolean z11;
        androidx.compose.ui.a0 a0Var5;
        f4 f4Var3;
        androidx.compose.foundation.a1 a1Var4;
        androidx.compose.ui.graphics.q3 q3Var4;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1359693790);
        int i14 = i11 & 1;
        if (i14 != 0) {
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
                q3Var2 = q3Var;
                int i15 = c0VarR.D(q3Var2) ? 32 : 16;
                i12 |= i15;
            } else {
                q3Var2 = q3Var;
            }
            i12 |= i15;
        } else {
            q3Var2 = q3Var;
        }
        if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
            if ((i11 & 4) == 0) {
                d4Var2 = d4Var;
                int i16 = c0VarR.D(d4Var2) ? 256 : 128;
                i12 |= i16;
            } else {
                d4Var2 = d4Var;
            }
            i12 |= i16;
        } else {
            d4Var2 = d4Var;
        }
        if ((i10 & 3072) == 0) {
            if ((i11 & 8) == 0) {
                f4VarC = f4Var;
                int i17 = c0VarR.D(f4VarC) ? 2048 : 1024;
                i12 |= i17;
            } else {
                f4VarC = f4Var;
            }
            i12 |= i17;
        } else {
            f4VarC = f4Var;
        }
        int i18 = i11 & 16;
        if (i18 == 0) {
            if ((i10 & 24576) == 0) {
                a1Var2 = a1Var;
                i12 |= c0VarR.D(a1Var2) ? 16384 : 8192;
            }
            if ((i11 & 32) != 0) {
                i12 |= androidx.profileinstaller.n.c.f73814m;
            } else if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                if (c0VarR.k0(nVar)) {
                    i13 = 131072;
                } else {
                    i13 = 65536;
                }
                i12 |= i13;
            }
            if ((74899 & i12) != 74898) {
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
                    if ((i11 & 2) != 0) {
                        q3VarL = e4.f27241a.l(c0VarR, 6);
                        i12 &= -113;
                    } else {
                        q3VarL = q3Var2;
                    }
                    if ((i11 & 4) != 0) {
                        d4VarA = e4.f27241a.a(c0VarR, 6);
                        i12 &= -897;
                    } else {
                        d4VarA = d4Var2;
                    }
                    if ((i11 & 8) != 0) {
                        z11 = true;
                        f4VarC = e4.f27241a.c(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 1572864, 63);
                        i12 &= -7169;
                    } else {
                        z11 = true;
                    }
                    f4 f4Var4 = f4VarC;
                    a0Var5 = a0Var4;
                    f4Var3 = f4Var4;
                    if (i18 != 0) {
                        q3Var4 = q3VarL;
                        a1Var4 = null;
                    } else {
                        a1Var4 = a1Var;
                        q3Var4 = q3VarL;
                    }
                } else {
                    c0VarR.u();
                    if ((i11 & 2) != 0) {
                        i12 &= -113;
                    }
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                    }
                    f4Var3 = f4VarC;
                    a1Var4 = a1Var2;
                    a0Var5 = a0Var2;
                    q3Var4 = q3Var2;
                    d4VarA = d4Var2;
                    z11 = true;
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1359693790, i12, -1, "androidx.compose.material3.Card (Card.kt:86)");
                }
                u10.c(a0Var5, q3Var4, d4VarA.a(z11), d4VarA.b(z11), 0.0f, f4Var3.f(z11, null, c0VarR, ((i12 >> 3) & 896) | 54).getValue().O(), a1Var4, androidx.compose.runtime.internal.w.e(-97109725, z11, new a(nVar), c0VarR, 54), c0VarR, (i12 & 14) | 12582912 | (i12 & com.planner5d.library.engine.input.f.b.B) | (3670016 & (i12 << 6)), 16);
                c0VarR = c0VarR;
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                d4Var3 = d4VarA;
                q3Var3 = q3Var4;
                a1Var3 = a1Var4;
                f4Var2 = f4Var3;
                a0Var3 = a0Var5;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                q3Var3 = q3Var2;
                d4Var3 = d4Var2;
                f4Var2 = f4VarC;
                a1Var3 = a1Var;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.i4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return m4.i(a0Var3, q3Var3, d4Var3, f4Var2, a1Var3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 24576;
        a1Var2 = a1Var;
        if ((i11 & 32) != 0) {
            i12 |= androidx.profileinstaller.n.c.f73814m;
        } else if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
            if (c0VarR.k0(nVar)) {
                i13 = 131072;
            } else {
                i13 = 65536;
            }
            i12 |= i13;
        }
        if ((74899 & i12) != 74898) {
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
                if ((i11 & 2) != 0) {
                    q3VarL = e4.f27241a.l(c0VarR, 6);
                    i12 &= -113;
                } else {
                    q3VarL = q3Var2;
                }
                if ((i11 & 4) != 0) {
                    d4VarA = e4.f27241a.a(c0VarR, 6);
                    i12 &= -897;
                } else {
                    d4VarA = d4Var2;
                }
                if ((i11 & 8) != 0) {
                    z11 = true;
                    f4VarC = e4.f27241a.c(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 1572864, 63);
                    i12 &= -7169;
                } else {
                    z11 = true;
                }
                f4 f4Var5 = f4VarC;
                a0Var5 = a0Var4;
                f4Var3 = f4Var5;
                if (i18 != 0) {
                    q3Var4 = q3VarL;
                    a1Var4 = null;
                } else {
                    a1Var4 = a1Var;
                    q3Var4 = q3VarL;
                }
            } else {
                if (i14 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if ((i11 & 2) != 0) {
                    q3VarL = e4.f27241a.l(c0VarR, 6);
                    i12 &= -113;
                } else {
                    q3VarL = q3Var2;
                }
                if ((i11 & 4) != 0) {
                    d4VarA = e4.f27241a.a(c0VarR, 6);
                    i12 &= -897;
                } else {
                    d4VarA = d4Var2;
                }
                if ((i11 & 8) != 0) {
                    z11 = true;
                    f4VarC = e4.f27241a.c(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 1572864, 63);
                    i12 &= -7169;
                } else {
                    z11 = true;
                }
                f4 f4Var6 = f4VarC;
                a0Var5 = a0Var4;
                f4Var3 = f4Var6;
                if (i18 != 0) {
                    q3Var4 = q3VarL;
                    a1Var4 = null;
                } else {
                    a1Var4 = a1Var;
                    q3Var4 = q3VarL;
                }
            }
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1359693790, i12, -1, "androidx.compose.material3.Card (Card.kt:86)");
            }
            u10.c(a0Var5, q3Var4, d4VarA.a(z11), d4VarA.b(z11), 0.0f, f4Var3.f(z11, null, c0VarR, ((i12 >> 3) & 896) | 54).getValue().O(), a1Var4, androidx.compose.runtime.internal.w.e(-97109725, z11, new a(nVar), c0VarR, 54), c0VarR, (i12 & 14) | 12582912 | (i12 & com.planner5d.library.engine.input.f.b.B) | (3670016 & (i12 << 6)), 16);
            c0VarR = c0VarR;
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            d4Var3 = d4VarA;
            q3Var3 = q3Var4;
            a1Var3 = a1Var4;
            f4Var2 = f4Var3;
            a0Var3 = a0Var5;
        } else {
            c0VarR.u();
            a0Var3 = a0Var2;
            q3Var3 = q3Var2;
            d4Var3 = d4Var2;
            f4Var2 = f4VarC;
            a1Var3 = a1Var;
        }
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.i4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return m4.i(a0Var3, q3Var3, d4Var3, f4Var2, a1Var3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0123  */
    /* JADX WARN: Code duplicated, block: B:102:0x0125  */
    /* JADX WARN: Code duplicated, block: B:105:0x012e  */
    /* JADX WARN: Code duplicated, block: B:107:0x013c  */
    /* JADX WARN: Code duplicated, block: B:121:0x016a A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:122:0x016c  */
    /* JADX WARN: Code duplicated, block: B:124:0x0171  */
    /* JADX WARN: Code duplicated, block: B:127:0x0177  */
    /* JADX WARN: Code duplicated, block: B:130:0x0184  */
    /* JADX WARN: Code duplicated, block: B:131:0x018d  */
    /* JADX WARN: Code duplicated, block: B:134:0x0192  */
    /* JADX WARN: Code duplicated, block: B:135:0x01af  */
    /* JADX WARN: Code duplicated, block: B:138:0x01b8  */
    /* JADX WARN: Code duplicated, block: B:139:0x01ba  */
    /* JADX WARN: Code duplicated, block: B:141:0x01be  */
    /* JADX WARN: Code duplicated, block: B:142:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:145:0x01de  */
    /* JADX WARN: Code duplicated, block: B:147:0x01eb  */
    /* JADX WARN: Code duplicated, block: B:149:0x01fd  */
    /* JADX WARN: Code duplicated, block: B:151:0x020a  */
    /* JADX WARN: Code duplicated, block: B:154:0x0261  */
    /* JADX WARN: Code duplicated, block: B:156:0x026d  */
    /* JADX WARN: Code duplicated, block: B:159:0x0286  */
    /* JADX WARN: Code duplicated, block: B:161:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0052  */
    /* JADX WARN: Code duplicated, block: B:28:0x0059  */
    /* JADX WARN: Code duplicated, block: B:30:0x005d  */
    /* JADX WARN: Code duplicated, block: B:32:0x0065  */
    /* JADX WARN: Code duplicated, block: B:33:0x0068  */
    /* JADX WARN: Code duplicated, block: B:37:0x006f  */
    /* JADX WARN: Code duplicated, block: B:39:0x0073  */
    /* JADX WARN: Code duplicated, block: B:41:0x007d  */
    /* JADX WARN: Code duplicated, block: B:42:0x0080  */
    /* JADX WARN: Code duplicated, block: B:45:0x0086  */
    /* JADX WARN: Code duplicated, block: B:48:0x008e  */
    /* JADX WARN: Code duplicated, block: B:50:0x0092  */
    /* JADX WARN: Code duplicated, block: B:52:0x009a  */
    /* JADX WARN: Code duplicated, block: B:53:0x009d  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:59:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b9 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:67:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:72:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d2  */
    /* JADX WARN: Code duplicated, block: B:76:0x00da  */
    /* JADX WARN: Code duplicated, block: B:77:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:82:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:87:0x00fc  */
    /* JADX WARN: Code duplicated, block: B:91:0x0106  */
    /* JADX WARN: Code duplicated, block: B:92:0x0109  */
    /* JADX WARN: Code duplicated, block: B:94:0x010d  */
    /* JADX WARN: Code duplicated, block: B:96:0x0113  */
    /* JADX WARN: Code duplicated, block: B:97:0x0116  */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void h(@NotNull final Function0<Unit> function0, @Nullable androidx.compose.ui.a0 a0Var, boolean z10, @Nullable androidx.compose.ui.graphics.q3 q3Var, @Nullable d4 d4Var, @Nullable f4 f4Var, @Nullable androidx.compose.foundation.a1 a1Var, @Nullable androidx.compose.foundation.interaction.j jVar, @NotNull final pj.n<? super androidx.compose.foundation.layout.m0, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        androidx.compose.ui.a0 a0Var2;
        int i13;
        boolean z11;
        int i14;
        androidx.compose.ui.graphics.q3 q3VarL;
        d4 d4Var2;
        int i15;
        androidx.compose.foundation.a1 a1Var2;
        int i16;
        int i17;
        int i18;
        int i19;
        boolean z12;
        boolean z13;
        androidx.compose.runtime.c0 c0Var2;
        final f4 f4Var2;
        final androidx.compose.ui.a0 a0Var3;
        final boolean z14;
        final androidx.compose.ui.graphics.q3 q3Var2;
        final d4 d4Var3;
        final androidx.compose.foundation.a1 a1Var3;
        final androidx.compose.foundation.interaction.j jVar2;
        androidx.compose.runtime.s5 s5VarT;
        d4 d4VarA;
        androidx.compose.runtime.c0 c0Var3;
        f4 f4VarC;
        androidx.compose.foundation.a1 a1Var4;
        androidx.compose.ui.a0 a0Var4;
        androidx.compose.ui.graphics.q3 q3Var3;
        androidx.compose.foundation.a1 a1Var5;
        int i20;
        boolean z15;
        androidx.compose.foundation.interaction.j jVar3;
        androidx.compose.foundation.interaction.j jVar4;
        Object objI0;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(2136075085);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c0VarR.k0(function0) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i21 = i11 & 2;
        if (i21 == 0) {
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
                        q3VarL = q3Var;
                        int i22 = c0VarR.D(q3VarL) ? 2048 : 1024;
                        i12 |= i22;
                    } else {
                        q3VarL = q3Var;
                    }
                    i12 |= i22;
                } else {
                    q3VarL = q3Var;
                }
                if ((i10 & 24576) == 0) {
                    if ((i11 & 16) == 0) {
                        d4Var2 = d4Var;
                        int i23 = c0VarR.D(d4Var2) ? 16384 : 8192;
                        i12 |= i23;
                    } else {
                        d4Var2 = d4Var;
                    }
                    i12 |= i23;
                } else {
                    d4Var2 = d4Var;
                }
                if ((196608 & i10) != 0) {
                    i12 |= ((i11 & 32) == 0 || !c0VarR.D(f4Var)) ? 65536 : 131072;
                }
                i15 = i11 & 64;
                if (i15 != 0) {
                    if ((1572864 & i10) == 0) {
                        a1Var2 = a1Var;
                        if (c0VarR.D(a1Var2)) {
                            i16 = 1048576;
                        } else {
                            i16 = 524288;
                        }
                        i12 |= i16;
                    }
                    i17 = i11 & 128;
                    if (i17 != 0) {
                        i12 |= 12582912;
                    } else if ((i10 & 12582912) == 0) {
                        if (c0VarR.D(jVar)) {
                            i18 = 8388608;
                        } else {
                            i18 = 4194304;
                        }
                        i12 |= i18;
                    }
                    if ((i11 & 256) != 0) {
                        i12 |= 100663296;
                    } else if ((i10 & 100663296) == 0) {
                        if (c0VarR.k0(nVar)) {
                            i19 = 67108864;
                        } else {
                            i19 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i12 |= i19;
                    }
                    z12 = true;
                    if ((38347923 & i12) != 38347922) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (c0VarR.h(z13, i12 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0 || c0VarR.y()) {
                            if (i21 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            }
                            if ((i11 & 8) != 0) {
                                i12 &= -7169;
                                q3VarL = e4.f27241a.l(c0VarR, 6);
                            }
                            if ((i11 & 16) != 0) {
                                d4VarA = e4.f27241a.a(c0VarR, 6);
                                i12 &= -57345;
                            } else {
                                d4VarA = d4Var2;
                            }
                            if ((i11 & 32) != 0) {
                                f4VarC = e4.f27241a.c(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 1572864, 63);
                                c0Var3 = c0VarR;
                                i12 &= -458753;
                            } else {
                                c0Var3 = c0VarR;
                                f4VarC = f4Var;
                            }
                            if (i15 != 0) {
                                a1Var4 = null;
                            } else {
                                a1Var4 = a1Var;
                            }
                            if (i17 != 0) {
                                androidx.compose.ui.a0 a0Var5 = a0Var2;
                                i20 = i12;
                                jVar3 = null;
                                a0Var4 = a0Var5;
                                q3Var3 = q3VarL;
                                a1Var5 = a1Var4;
                                z15 = z11;
                            } else {
                                a0Var4 = a0Var2;
                                q3Var3 = q3VarL;
                                a1Var5 = a1Var4;
                                i20 = i12;
                                z15 = z11;
                            }
                            c0Var3.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(2136075085, i20, -1, "androidx.compose.material3.Card (Card.kt:145)");
                            }
                            if (jVar3 == null) {
                                c0Var3.E(1577885006);
                                objI0 = c0Var3.i0();
                                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI0 = androidx.compose.foundation.interaction.i.a();
                                    c0Var3.Y(objI0);
                                }
                                jVar4 = (androidx.compose.foundation.interaction.j) objI0;
                                c0Var3.A();
                            } else {
                                c0Var3.E(-226195799);
                                c0Var3.A();
                                jVar4 = jVar3;
                            }
                            c0Var2 = c0Var3;
                            u10.f(function0, a0Var4, z15, q3Var3, d4VarA.a(z15), d4VarA.b(z15), 0.0f, f4VarC.f(z15, jVar4, c0Var3, ((i20 >> 6) & 14) | ((i20 >> 9) & 896)).getValue().O(), a1Var5, jVar4, androidx.compose.runtime.internal.w.e(-1347531112, z12, new b(nVar), c0Var3, 54), c0Var2, (i20 & 8190) | (234881024 & (i20 << 6)), 6, 64);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            d4Var3 = d4VarA;
                            f4Var2 = f4VarC;
                            jVar2 = jVar3;
                            a0Var3 = a0Var4;
                            z14 = z15;
                            q3Var2 = q3Var3;
                            a1Var3 = a1Var5;
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
                            q3Var3 = q3VarL;
                            d4VarA = d4Var2;
                            z12 = true;
                            a1Var5 = a1Var2;
                            c0Var3 = c0VarR;
                            a0Var4 = a0Var2;
                            z15 = z11;
                            f4VarC = f4Var;
                            i20 = i12;
                        }
                        jVar3 = jVar;
                        c0Var3.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(2136075085, i20, -1, "androidx.compose.material3.Card (Card.kt:145)");
                        }
                        if (jVar3 == null) {
                            c0Var3.E(1577885006);
                            objI0 = c0Var3.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = androidx.compose.foundation.interaction.i.a();
                                c0Var3.Y(objI0);
                            }
                            jVar4 = (androidx.compose.foundation.interaction.j) objI0;
                            c0Var3.A();
                        } else {
                            c0Var3.E(-226195799);
                            c0Var3.A();
                            jVar4 = jVar3;
                        }
                        c0Var2 = c0Var3;
                        u10.f(function0, a0Var4, z15, q3Var3, d4VarA.a(z15), d4VarA.b(z15), 0.0f, f4VarC.f(z15, jVar4, c0Var3, ((i20 >> 6) & 14) | ((i20 >> 9) & 896)).getValue().O(), a1Var5, jVar4, androidx.compose.runtime.internal.w.e(-1347531112, z12, new b(nVar), c0Var3, 54), c0Var2, (i20 & 8190) | (234881024 & (i20 << 6)), 6, 64);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        d4Var3 = d4VarA;
                        f4Var2 = f4VarC;
                        jVar2 = jVar3;
                        a0Var3 = a0Var4;
                        z14 = z15;
                        q3Var2 = q3Var3;
                        a1Var3 = a1Var5;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        f4Var2 = f4Var;
                        a0Var3 = a0Var2;
                        z14 = z11;
                        q3Var2 = q3VarL;
                        d4Var3 = d4Var2;
                        a1Var3 = a1Var;
                        jVar2 = jVar;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.g4
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return m4.j(function0, a0Var3, z14, q3Var2, d4Var3, f4Var2, a1Var3, jVar2, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 1572864;
                a1Var2 = a1Var;
                i17 = i11 & 128;
                if (i17 != 0) {
                    i12 |= 12582912;
                } else if ((i10 & 12582912) == 0) {
                    if (c0VarR.D(jVar)) {
                        i18 = 8388608;
                    } else {
                        i18 = 4194304;
                    }
                    i12 |= i18;
                }
                if ((i11 & 256) != 0) {
                    i12 |= 100663296;
                } else if ((i10 & 100663296) == 0) {
                    if (c0VarR.k0(nVar)) {
                        i19 = 67108864;
                    } else {
                        i19 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i12 |= i19;
                }
                z12 = true;
                if ((38347923 & i12) != 38347922) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (c0VarR.h(z13, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i21 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            q3VarL = e4.f27241a.l(c0VarR, 6);
                        }
                        if ((i11 & 16) != 0) {
                            d4VarA = e4.f27241a.a(c0VarR, 6);
                            i12 &= -57345;
                        } else {
                            d4VarA = d4Var2;
                        }
                        if ((i11 & 32) != 0) {
                            f4VarC = e4.f27241a.c(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 1572864, 63);
                            c0Var3 = c0VarR;
                            i12 &= -458753;
                        } else {
                            c0Var3 = c0VarR;
                            f4VarC = f4Var;
                        }
                        if (i15 != 0) {
                            a1Var4 = null;
                        } else {
                            a1Var4 = a1Var;
                        }
                        if (i17 != 0) {
                            androidx.compose.ui.a0 a0Var6 = a0Var2;
                            i20 = i12;
                            jVar3 = null;
                            a0Var4 = a0Var6;
                            q3Var3 = q3VarL;
                            a1Var5 = a1Var4;
                            z15 = z11;
                        } else {
                            a0Var4 = a0Var2;
                            q3Var3 = q3VarL;
                            a1Var5 = a1Var4;
                            i20 = i12;
                            z15 = z11;
                            jVar3 = jVar;
                        }
                    } else {
                        if (i21 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            q3VarL = e4.f27241a.l(c0VarR, 6);
                        }
                        if ((i11 & 16) != 0) {
                            d4VarA = e4.f27241a.a(c0VarR, 6);
                            i12 &= -57345;
                        } else {
                            d4VarA = d4Var2;
                        }
                        if ((i11 & 32) != 0) {
                            f4VarC = e4.f27241a.c(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 1572864, 63);
                            c0Var3 = c0VarR;
                            i12 &= -458753;
                        } else {
                            c0Var3 = c0VarR;
                            f4VarC = f4Var;
                        }
                        if (i15 != 0) {
                            a1Var4 = null;
                        } else {
                            a1Var4 = a1Var;
                        }
                        if (i17 != 0) {
                            androidx.compose.ui.a0 a0Var7 = a0Var2;
                            i20 = i12;
                            jVar3 = null;
                            a0Var4 = a0Var7;
                            q3Var3 = q3VarL;
                            a1Var5 = a1Var4;
                            z15 = z11;
                        } else {
                            a0Var4 = a0Var2;
                            q3Var3 = q3VarL;
                            a1Var5 = a1Var4;
                            i20 = i12;
                            z15 = z11;
                            jVar3 = jVar;
                        }
                    }
                    c0Var3.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(2136075085, i20, -1, "androidx.compose.material3.Card (Card.kt:145)");
                    }
                    if (jVar3 == null) {
                        c0Var3.E(1577885006);
                        objI0 = c0Var3.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = androidx.compose.foundation.interaction.i.a();
                            c0Var3.Y(objI0);
                        }
                        jVar4 = (androidx.compose.foundation.interaction.j) objI0;
                        c0Var3.A();
                    } else {
                        c0Var3.E(-226195799);
                        c0Var3.A();
                        jVar4 = jVar3;
                    }
                    c0Var2 = c0Var3;
                    u10.f(function0, a0Var4, z15, q3Var3, d4VarA.a(z15), d4VarA.b(z15), 0.0f, f4VarC.f(z15, jVar4, c0Var3, ((i20 >> 6) & 14) | ((i20 >> 9) & 896)).getValue().O(), a1Var5, jVar4, androidx.compose.runtime.internal.w.e(-1347531112, z12, new b(nVar), c0Var3, 54), c0Var2, (i20 & 8190) | (234881024 & (i20 << 6)), 6, 64);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    d4Var3 = d4VarA;
                    f4Var2 = f4VarC;
                    jVar2 = jVar3;
                    a0Var3 = a0Var4;
                    z14 = z15;
                    q3Var2 = q3Var3;
                    a1Var3 = a1Var5;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    f4Var2 = f4Var;
                    a0Var3 = a0Var2;
                    z14 = z11;
                    q3Var2 = q3VarL;
                    d4Var3 = d4Var2;
                    a1Var3 = a1Var;
                    jVar2 = jVar;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.g4
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return m4.j(function0, a0Var3, z14, q3Var2, d4Var3, f4Var2, a1Var3, jVar2, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= androidx.media3.exoplayer.a5.S0;
            z11 = z10;
            if ((i10 & 3072) == 0) {
                if ((i11 & 8) == 0) {
                    q3VarL = q3Var;
                    if (c0VarR.D(q3VarL)) {
                    }
                    i12 |= i22;
                } else {
                    q3VarL = q3Var;
                }
                i12 |= i22;
            } else {
                q3VarL = q3Var;
            }
            if ((i10 & 24576) == 0) {
                if ((i11 & 16) == 0) {
                    d4Var2 = d4Var;
                    if (c0VarR.D(d4Var2)) {
                    }
                    i12 |= i23;
                } else {
                    d4Var2 = d4Var;
                }
                i12 |= i23;
            } else {
                d4Var2 = d4Var;
            }
            if ((196608 & i10) != 0) {
                i12 |= ((i11 & 32) == 0 || !c0VarR.D(f4Var)) ? 65536 : 131072;
            }
            i15 = i11 & 64;
            if (i15 != 0) {
                if ((1572864 & i10) == 0) {
                    a1Var2 = a1Var;
                    if (c0VarR.D(a1Var2)) {
                        i16 = 1048576;
                    } else {
                        i16 = 524288;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 128;
                if (i17 != 0) {
                    i12 |= 12582912;
                } else if ((i10 & 12582912) == 0) {
                    if (c0VarR.D(jVar)) {
                        i18 = 8388608;
                    } else {
                        i18 = 4194304;
                    }
                    i12 |= i18;
                }
                if ((i11 & 256) != 0) {
                    i12 |= 100663296;
                } else if ((i10 & 100663296) == 0) {
                    if (c0VarR.k0(nVar)) {
                        i19 = 67108864;
                    } else {
                        i19 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i12 |= i19;
                }
                z12 = true;
                if ((38347923 & i12) != 38347922) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (c0VarR.h(z13, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i21 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            q3VarL = e4.f27241a.l(c0VarR, 6);
                        }
                        if ((i11 & 16) != 0) {
                            d4VarA = e4.f27241a.a(c0VarR, 6);
                            i12 &= -57345;
                        } else {
                            d4VarA = d4Var2;
                        }
                        if ((i11 & 32) != 0) {
                            f4VarC = e4.f27241a.c(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 1572864, 63);
                            c0Var3 = c0VarR;
                            i12 &= -458753;
                        } else {
                            c0Var3 = c0VarR;
                            f4VarC = f4Var;
                        }
                        if (i15 != 0) {
                            a1Var4 = null;
                        } else {
                            a1Var4 = a1Var;
                        }
                        if (i17 != 0) {
                            androidx.compose.ui.a0 a0Var8 = a0Var2;
                            i20 = i12;
                            jVar3 = null;
                            a0Var4 = a0Var8;
                            q3Var3 = q3VarL;
                            a1Var5 = a1Var4;
                            z15 = z11;
                        } else {
                            a0Var4 = a0Var2;
                            q3Var3 = q3VarL;
                            a1Var5 = a1Var4;
                            i20 = i12;
                            z15 = z11;
                            jVar3 = jVar;
                        }
                    } else {
                        if (i21 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            q3VarL = e4.f27241a.l(c0VarR, 6);
                        }
                        if ((i11 & 16) != 0) {
                            d4VarA = e4.f27241a.a(c0VarR, 6);
                            i12 &= -57345;
                        } else {
                            d4VarA = d4Var2;
                        }
                        if ((i11 & 32) != 0) {
                            f4VarC = e4.f27241a.c(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 1572864, 63);
                            c0Var3 = c0VarR;
                            i12 &= -458753;
                        } else {
                            c0Var3 = c0VarR;
                            f4VarC = f4Var;
                        }
                        if (i15 != 0) {
                            a1Var4 = null;
                        } else {
                            a1Var4 = a1Var;
                        }
                        if (i17 != 0) {
                            androidx.compose.ui.a0 a0Var9 = a0Var2;
                            i20 = i12;
                            jVar3 = null;
                            a0Var4 = a0Var9;
                            q3Var3 = q3VarL;
                            a1Var5 = a1Var4;
                            z15 = z11;
                        } else {
                            a0Var4 = a0Var2;
                            q3Var3 = q3VarL;
                            a1Var5 = a1Var4;
                            i20 = i12;
                            z15 = z11;
                            jVar3 = jVar;
                        }
                    }
                    c0Var3.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(2136075085, i20, -1, "androidx.compose.material3.Card (Card.kt:145)");
                    }
                    if (jVar3 == null) {
                        c0Var3.E(1577885006);
                        objI0 = c0Var3.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = androidx.compose.foundation.interaction.i.a();
                            c0Var3.Y(objI0);
                        }
                        jVar4 = (androidx.compose.foundation.interaction.j) objI0;
                        c0Var3.A();
                    } else {
                        c0Var3.E(-226195799);
                        c0Var3.A();
                        jVar4 = jVar3;
                    }
                    c0Var2 = c0Var3;
                    u10.f(function0, a0Var4, z15, q3Var3, d4VarA.a(z15), d4VarA.b(z15), 0.0f, f4VarC.f(z15, jVar4, c0Var3, ((i20 >> 6) & 14) | ((i20 >> 9) & 896)).getValue().O(), a1Var5, jVar4, androidx.compose.runtime.internal.w.e(-1347531112, z12, new b(nVar), c0Var3, 54), c0Var2, (i20 & 8190) | (234881024 & (i20 << 6)), 6, 64);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    d4Var3 = d4VarA;
                    f4Var2 = f4VarC;
                    jVar2 = jVar3;
                    a0Var3 = a0Var4;
                    z14 = z15;
                    q3Var2 = q3Var3;
                    a1Var3 = a1Var5;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    f4Var2 = f4Var;
                    a0Var3 = a0Var2;
                    z14 = z11;
                    q3Var2 = q3VarL;
                    d4Var3 = d4Var2;
                    a1Var3 = a1Var;
                    jVar2 = jVar;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.g4
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return m4.j(function0, a0Var3, z14, q3Var2, d4Var3, f4Var2, a1Var3, jVar2, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 1572864;
            a1Var2 = a1Var;
            i17 = i11 & 128;
            if (i17 != 0) {
                i12 |= 12582912;
            } else if ((i10 & 12582912) == 0) {
                if (c0VarR.D(jVar)) {
                    i18 = 8388608;
                } else {
                    i18 = 4194304;
                }
                i12 |= i18;
            }
            if ((i11 & 256) != 0) {
                i12 |= 100663296;
            } else if ((i10 & 100663296) == 0) {
                if (c0VarR.k0(nVar)) {
                    i19 = 67108864;
                } else {
                    i19 = com.google.api.client.googleapis.media.a.f115410j;
                }
                i12 |= i19;
            }
            z12 = true;
            if ((38347923 & i12) != 38347922) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c0VarR.h(z13, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i21 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        q3VarL = e4.f27241a.l(c0VarR, 6);
                    }
                    if ((i11 & 16) != 0) {
                        d4VarA = e4.f27241a.a(c0VarR, 6);
                        i12 &= -57345;
                    } else {
                        d4VarA = d4Var2;
                    }
                    if ((i11 & 32) != 0) {
                        f4VarC = e4.f27241a.c(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 1572864, 63);
                        c0Var3 = c0VarR;
                        i12 &= -458753;
                    } else {
                        c0Var3 = c0VarR;
                        f4VarC = f4Var;
                    }
                    if (i15 != 0) {
                        a1Var4 = null;
                    } else {
                        a1Var4 = a1Var;
                    }
                    if (i17 != 0) {
                        androidx.compose.ui.a0 a0Var10 = a0Var2;
                        i20 = i12;
                        jVar3 = null;
                        a0Var4 = a0Var10;
                        q3Var3 = q3VarL;
                        a1Var5 = a1Var4;
                        z15 = z11;
                    } else {
                        a0Var4 = a0Var2;
                        q3Var3 = q3VarL;
                        a1Var5 = a1Var4;
                        i20 = i12;
                        z15 = z11;
                        jVar3 = jVar;
                    }
                } else {
                    if (i21 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        q3VarL = e4.f27241a.l(c0VarR, 6);
                    }
                    if ((i11 & 16) != 0) {
                        d4VarA = e4.f27241a.a(c0VarR, 6);
                        i12 &= -57345;
                    } else {
                        d4VarA = d4Var2;
                    }
                    if ((i11 & 32) != 0) {
                        f4VarC = e4.f27241a.c(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 1572864, 63);
                        c0Var3 = c0VarR;
                        i12 &= -458753;
                    } else {
                        c0Var3 = c0VarR;
                        f4VarC = f4Var;
                    }
                    if (i15 != 0) {
                        a1Var4 = null;
                    } else {
                        a1Var4 = a1Var;
                    }
                    if (i17 != 0) {
                        androidx.compose.ui.a0 a0Var11 = a0Var2;
                        i20 = i12;
                        jVar3 = null;
                        a0Var4 = a0Var11;
                        q3Var3 = q3VarL;
                        a1Var5 = a1Var4;
                        z15 = z11;
                    } else {
                        a0Var4 = a0Var2;
                        q3Var3 = q3VarL;
                        a1Var5 = a1Var4;
                        i20 = i12;
                        z15 = z11;
                        jVar3 = jVar;
                    }
                }
                c0Var3.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(2136075085, i20, -1, "androidx.compose.material3.Card (Card.kt:145)");
                }
                if (jVar3 == null) {
                    c0Var3.E(1577885006);
                    objI0 = c0Var3.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = androidx.compose.foundation.interaction.i.a();
                        c0Var3.Y(objI0);
                    }
                    jVar4 = (androidx.compose.foundation.interaction.j) objI0;
                    c0Var3.A();
                } else {
                    c0Var3.E(-226195799);
                    c0Var3.A();
                    jVar4 = jVar3;
                }
                c0Var2 = c0Var3;
                u10.f(function0, a0Var4, z15, q3Var3, d4VarA.a(z15), d4VarA.b(z15), 0.0f, f4VarC.f(z15, jVar4, c0Var3, ((i20 >> 6) & 14) | ((i20 >> 9) & 896)).getValue().O(), a1Var5, jVar4, androidx.compose.runtime.internal.w.e(-1347531112, z12, new b(nVar), c0Var3, 54), c0Var2, (i20 & 8190) | (234881024 & (i20 << 6)), 6, 64);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                d4Var3 = d4VarA;
                f4Var2 = f4VarC;
                jVar2 = jVar3;
                a0Var3 = a0Var4;
                z14 = z15;
                q3Var2 = q3Var3;
                a1Var3 = a1Var5;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                f4Var2 = f4Var;
                a0Var3 = a0Var2;
                z14 = z11;
                q3Var2 = q3VarL;
                d4Var3 = d4Var2;
                a1Var3 = a1Var;
                jVar2 = jVar;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.g4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return m4.j(function0, a0Var3, z14, q3Var2, d4Var3, f4Var2, a1Var3, jVar2, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
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
                    q3VarL = q3Var;
                    if (c0VarR.D(q3VarL)) {
                    }
                    i12 |= i22;
                } else {
                    q3VarL = q3Var;
                }
                i12 |= i22;
            } else {
                q3VarL = q3Var;
            }
            if ((i10 & 24576) == 0) {
                if ((i11 & 16) == 0) {
                    d4Var2 = d4Var;
                    if (c0VarR.D(d4Var2)) {
                    }
                    i12 |= i23;
                } else {
                    d4Var2 = d4Var;
                }
                i12 |= i23;
            } else {
                d4Var2 = d4Var;
            }
            if ((196608 & i10) != 0) {
                i12 |= ((i11 & 32) == 0 || !c0VarR.D(f4Var)) ? 65536 : 131072;
            }
            i15 = i11 & 64;
            if (i15 != 0) {
                if ((1572864 & i10) == 0) {
                    a1Var2 = a1Var;
                    if (c0VarR.D(a1Var2)) {
                        i16 = 1048576;
                    } else {
                        i16 = 524288;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 128;
                if (i17 != 0) {
                    i12 |= 12582912;
                } else if ((i10 & 12582912) == 0) {
                    if (c0VarR.D(jVar)) {
                        i18 = 8388608;
                    } else {
                        i18 = 4194304;
                    }
                    i12 |= i18;
                }
                if ((i11 & 256) != 0) {
                    i12 |= 100663296;
                } else if ((i10 & 100663296) == 0) {
                    if (c0VarR.k0(nVar)) {
                        i19 = 67108864;
                    } else {
                        i19 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i12 |= i19;
                }
                z12 = true;
                if ((38347923 & i12) != 38347922) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (c0VarR.h(z13, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i21 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            q3VarL = e4.f27241a.l(c0VarR, 6);
                        }
                        if ((i11 & 16) != 0) {
                            d4VarA = e4.f27241a.a(c0VarR, 6);
                            i12 &= -57345;
                        } else {
                            d4VarA = d4Var2;
                        }
                        if ((i11 & 32) != 0) {
                            f4VarC = e4.f27241a.c(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 1572864, 63);
                            c0Var3 = c0VarR;
                            i12 &= -458753;
                        } else {
                            c0Var3 = c0VarR;
                            f4VarC = f4Var;
                        }
                        if (i15 != 0) {
                            a1Var4 = null;
                        } else {
                            a1Var4 = a1Var;
                        }
                        if (i17 != 0) {
                            androidx.compose.ui.a0 a0Var12 = a0Var2;
                            i20 = i12;
                            jVar3 = null;
                            a0Var4 = a0Var12;
                            q3Var3 = q3VarL;
                            a1Var5 = a1Var4;
                            z15 = z11;
                        } else {
                            a0Var4 = a0Var2;
                            q3Var3 = q3VarL;
                            a1Var5 = a1Var4;
                            i20 = i12;
                            z15 = z11;
                            jVar3 = jVar;
                        }
                    } else {
                        if (i21 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            q3VarL = e4.f27241a.l(c0VarR, 6);
                        }
                        if ((i11 & 16) != 0) {
                            d4VarA = e4.f27241a.a(c0VarR, 6);
                            i12 &= -57345;
                        } else {
                            d4VarA = d4Var2;
                        }
                        if ((i11 & 32) != 0) {
                            f4VarC = e4.f27241a.c(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 1572864, 63);
                            c0Var3 = c0VarR;
                            i12 &= -458753;
                        } else {
                            c0Var3 = c0VarR;
                            f4VarC = f4Var;
                        }
                        if (i15 != 0) {
                            a1Var4 = null;
                        } else {
                            a1Var4 = a1Var;
                        }
                        if (i17 != 0) {
                            androidx.compose.ui.a0 a0Var13 = a0Var2;
                            i20 = i12;
                            jVar3 = null;
                            a0Var4 = a0Var13;
                            q3Var3 = q3VarL;
                            a1Var5 = a1Var4;
                            z15 = z11;
                        } else {
                            a0Var4 = a0Var2;
                            q3Var3 = q3VarL;
                            a1Var5 = a1Var4;
                            i20 = i12;
                            z15 = z11;
                            jVar3 = jVar;
                        }
                    }
                    c0Var3.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(2136075085, i20, -1, "androidx.compose.material3.Card (Card.kt:145)");
                    }
                    if (jVar3 == null) {
                        c0Var3.E(1577885006);
                        objI0 = c0Var3.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = androidx.compose.foundation.interaction.i.a();
                            c0Var3.Y(objI0);
                        }
                        jVar4 = (androidx.compose.foundation.interaction.j) objI0;
                        c0Var3.A();
                    } else {
                        c0Var3.E(-226195799);
                        c0Var3.A();
                        jVar4 = jVar3;
                    }
                    c0Var2 = c0Var3;
                    u10.f(function0, a0Var4, z15, q3Var3, d4VarA.a(z15), d4VarA.b(z15), 0.0f, f4VarC.f(z15, jVar4, c0Var3, ((i20 >> 6) & 14) | ((i20 >> 9) & 896)).getValue().O(), a1Var5, jVar4, androidx.compose.runtime.internal.w.e(-1347531112, z12, new b(nVar), c0Var3, 54), c0Var2, (i20 & 8190) | (234881024 & (i20 << 6)), 6, 64);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    d4Var3 = d4VarA;
                    f4Var2 = f4VarC;
                    jVar2 = jVar3;
                    a0Var3 = a0Var4;
                    z14 = z15;
                    q3Var2 = q3Var3;
                    a1Var3 = a1Var5;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    f4Var2 = f4Var;
                    a0Var3 = a0Var2;
                    z14 = z11;
                    q3Var2 = q3VarL;
                    d4Var3 = d4Var2;
                    a1Var3 = a1Var;
                    jVar2 = jVar;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.g4
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return m4.j(function0, a0Var3, z14, q3Var2, d4Var3, f4Var2, a1Var3, jVar2, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 1572864;
            a1Var2 = a1Var;
            i17 = i11 & 128;
            if (i17 != 0) {
                i12 |= 12582912;
            } else if ((i10 & 12582912) == 0) {
                if (c0VarR.D(jVar)) {
                    i18 = 8388608;
                } else {
                    i18 = 4194304;
                }
                i12 |= i18;
            }
            if ((i11 & 256) != 0) {
                i12 |= 100663296;
            } else if ((i10 & 100663296) == 0) {
                if (c0VarR.k0(nVar)) {
                    i19 = 67108864;
                } else {
                    i19 = com.google.api.client.googleapis.media.a.f115410j;
                }
                i12 |= i19;
            }
            z12 = true;
            if ((38347923 & i12) != 38347922) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c0VarR.h(z13, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i21 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        q3VarL = e4.f27241a.l(c0VarR, 6);
                    }
                    if ((i11 & 16) != 0) {
                        d4VarA = e4.f27241a.a(c0VarR, 6);
                        i12 &= -57345;
                    } else {
                        d4VarA = d4Var2;
                    }
                    if ((i11 & 32) != 0) {
                        f4VarC = e4.f27241a.c(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 1572864, 63);
                        c0Var3 = c0VarR;
                        i12 &= -458753;
                    } else {
                        c0Var3 = c0VarR;
                        f4VarC = f4Var;
                    }
                    if (i15 != 0) {
                        a1Var4 = null;
                    } else {
                        a1Var4 = a1Var;
                    }
                    if (i17 != 0) {
                        androidx.compose.ui.a0 a0Var14 = a0Var2;
                        i20 = i12;
                        jVar3 = null;
                        a0Var4 = a0Var14;
                        q3Var3 = q3VarL;
                        a1Var5 = a1Var4;
                        z15 = z11;
                    } else {
                        a0Var4 = a0Var2;
                        q3Var3 = q3VarL;
                        a1Var5 = a1Var4;
                        i20 = i12;
                        z15 = z11;
                        jVar3 = jVar;
                    }
                } else {
                    if (i21 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        q3VarL = e4.f27241a.l(c0VarR, 6);
                    }
                    if ((i11 & 16) != 0) {
                        d4VarA = e4.f27241a.a(c0VarR, 6);
                        i12 &= -57345;
                    } else {
                        d4VarA = d4Var2;
                    }
                    if ((i11 & 32) != 0) {
                        f4VarC = e4.f27241a.c(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 1572864, 63);
                        c0Var3 = c0VarR;
                        i12 &= -458753;
                    } else {
                        c0Var3 = c0VarR;
                        f4VarC = f4Var;
                    }
                    if (i15 != 0) {
                        a1Var4 = null;
                    } else {
                        a1Var4 = a1Var;
                    }
                    if (i17 != 0) {
                        androidx.compose.ui.a0 a0Var15 = a0Var2;
                        i20 = i12;
                        jVar3 = null;
                        a0Var4 = a0Var15;
                        q3Var3 = q3VarL;
                        a1Var5 = a1Var4;
                        z15 = z11;
                    } else {
                        a0Var4 = a0Var2;
                        q3Var3 = q3VarL;
                        a1Var5 = a1Var4;
                        i20 = i12;
                        z15 = z11;
                        jVar3 = jVar;
                    }
                }
                c0Var3.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(2136075085, i20, -1, "androidx.compose.material3.Card (Card.kt:145)");
                }
                if (jVar3 == null) {
                    c0Var3.E(1577885006);
                    objI0 = c0Var3.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = androidx.compose.foundation.interaction.i.a();
                        c0Var3.Y(objI0);
                    }
                    jVar4 = (androidx.compose.foundation.interaction.j) objI0;
                    c0Var3.A();
                } else {
                    c0Var3.E(-226195799);
                    c0Var3.A();
                    jVar4 = jVar3;
                }
                c0Var2 = c0Var3;
                u10.f(function0, a0Var4, z15, q3Var3, d4VarA.a(z15), d4VarA.b(z15), 0.0f, f4VarC.f(z15, jVar4, c0Var3, ((i20 >> 6) & 14) | ((i20 >> 9) & 896)).getValue().O(), a1Var5, jVar4, androidx.compose.runtime.internal.w.e(-1347531112, z12, new b(nVar), c0Var3, 54), c0Var2, (i20 & 8190) | (234881024 & (i20 << 6)), 6, 64);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                d4Var3 = d4VarA;
                f4Var2 = f4VarC;
                jVar2 = jVar3;
                a0Var3 = a0Var4;
                z14 = z15;
                q3Var2 = q3Var3;
                a1Var3 = a1Var5;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                f4Var2 = f4Var;
                a0Var3 = a0Var2;
                z14 = z11;
                q3Var2 = q3VarL;
                d4Var3 = d4Var2;
                a1Var3 = a1Var;
                jVar2 = jVar;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.g4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return m4.j(function0, a0Var3, z14, q3Var2, d4Var3, f4Var2, a1Var3, jVar2, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= androidx.media3.exoplayer.a5.S0;
        z11 = z10;
        if ((i10 & 3072) == 0) {
            if ((i11 & 8) == 0) {
                q3VarL = q3Var;
                if (c0VarR.D(q3VarL)) {
                }
                i12 |= i22;
            } else {
                q3VarL = q3Var;
            }
            i12 |= i22;
        } else {
            q3VarL = q3Var;
        }
        if ((i10 & 24576) == 0) {
            if ((i11 & 16) == 0) {
                d4Var2 = d4Var;
                if (c0VarR.D(d4Var2)) {
                }
                i12 |= i23;
            } else {
                d4Var2 = d4Var;
            }
            i12 |= i23;
        } else {
            d4Var2 = d4Var;
        }
        if ((196608 & i10) != 0) {
            i12 |= ((i11 & 32) == 0 || !c0VarR.D(f4Var)) ? 65536 : 131072;
        }
        i15 = i11 & 64;
        if (i15 != 0) {
            if ((1572864 & i10) == 0) {
                a1Var2 = a1Var;
                if (c0VarR.D(a1Var2)) {
                    i16 = 1048576;
                } else {
                    i16 = 524288;
                }
                i12 |= i16;
            }
            i17 = i11 & 128;
            if (i17 != 0) {
                i12 |= 12582912;
            } else if ((i10 & 12582912) == 0) {
                if (c0VarR.D(jVar)) {
                    i18 = 8388608;
                } else {
                    i18 = 4194304;
                }
                i12 |= i18;
            }
            if ((i11 & 256) != 0) {
                i12 |= 100663296;
            } else if ((i10 & 100663296) == 0) {
                if (c0VarR.k0(nVar)) {
                    i19 = 67108864;
                } else {
                    i19 = com.google.api.client.googleapis.media.a.f115410j;
                }
                i12 |= i19;
            }
            z12 = true;
            if ((38347923 & i12) != 38347922) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c0VarR.h(z13, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i21 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        q3VarL = e4.f27241a.l(c0VarR, 6);
                    }
                    if ((i11 & 16) != 0) {
                        d4VarA = e4.f27241a.a(c0VarR, 6);
                        i12 &= -57345;
                    } else {
                        d4VarA = d4Var2;
                    }
                    if ((i11 & 32) != 0) {
                        f4VarC = e4.f27241a.c(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 1572864, 63);
                        c0Var3 = c0VarR;
                        i12 &= -458753;
                    } else {
                        c0Var3 = c0VarR;
                        f4VarC = f4Var;
                    }
                    if (i15 != 0) {
                        a1Var4 = null;
                    } else {
                        a1Var4 = a1Var;
                    }
                    if (i17 != 0) {
                        androidx.compose.ui.a0 a0Var16 = a0Var2;
                        i20 = i12;
                        jVar3 = null;
                        a0Var4 = a0Var16;
                        q3Var3 = q3VarL;
                        a1Var5 = a1Var4;
                        z15 = z11;
                    } else {
                        a0Var4 = a0Var2;
                        q3Var3 = q3VarL;
                        a1Var5 = a1Var4;
                        i20 = i12;
                        z15 = z11;
                        jVar3 = jVar;
                    }
                } else {
                    if (i21 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        q3VarL = e4.f27241a.l(c0VarR, 6);
                    }
                    if ((i11 & 16) != 0) {
                        d4VarA = e4.f27241a.a(c0VarR, 6);
                        i12 &= -57345;
                    } else {
                        d4VarA = d4Var2;
                    }
                    if ((i11 & 32) != 0) {
                        f4VarC = e4.f27241a.c(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 1572864, 63);
                        c0Var3 = c0VarR;
                        i12 &= -458753;
                    } else {
                        c0Var3 = c0VarR;
                        f4VarC = f4Var;
                    }
                    if (i15 != 0) {
                        a1Var4 = null;
                    } else {
                        a1Var4 = a1Var;
                    }
                    if (i17 != 0) {
                        androidx.compose.ui.a0 a0Var17 = a0Var2;
                        i20 = i12;
                        jVar3 = null;
                        a0Var4 = a0Var17;
                        q3Var3 = q3VarL;
                        a1Var5 = a1Var4;
                        z15 = z11;
                    } else {
                        a0Var4 = a0Var2;
                        q3Var3 = q3VarL;
                        a1Var5 = a1Var4;
                        i20 = i12;
                        z15 = z11;
                        jVar3 = jVar;
                    }
                }
                c0Var3.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(2136075085, i20, -1, "androidx.compose.material3.Card (Card.kt:145)");
                }
                if (jVar3 == null) {
                    c0Var3.E(1577885006);
                    objI0 = c0Var3.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = androidx.compose.foundation.interaction.i.a();
                        c0Var3.Y(objI0);
                    }
                    jVar4 = (androidx.compose.foundation.interaction.j) objI0;
                    c0Var3.A();
                } else {
                    c0Var3.E(-226195799);
                    c0Var3.A();
                    jVar4 = jVar3;
                }
                c0Var2 = c0Var3;
                u10.f(function0, a0Var4, z15, q3Var3, d4VarA.a(z15), d4VarA.b(z15), 0.0f, f4VarC.f(z15, jVar4, c0Var3, ((i20 >> 6) & 14) | ((i20 >> 9) & 896)).getValue().O(), a1Var5, jVar4, androidx.compose.runtime.internal.w.e(-1347531112, z12, new b(nVar), c0Var3, 54), c0Var2, (i20 & 8190) | (234881024 & (i20 << 6)), 6, 64);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                d4Var3 = d4VarA;
                f4Var2 = f4VarC;
                jVar2 = jVar3;
                a0Var3 = a0Var4;
                z14 = z15;
                q3Var2 = q3Var3;
                a1Var3 = a1Var5;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                f4Var2 = f4Var;
                a0Var3 = a0Var2;
                z14 = z11;
                q3Var2 = q3VarL;
                d4Var3 = d4Var2;
                a1Var3 = a1Var;
                jVar2 = jVar;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.g4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return m4.j(function0, a0Var3, z14, q3Var2, d4Var3, f4Var2, a1Var3, jVar2, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 1572864;
        a1Var2 = a1Var;
        i17 = i11 & 128;
        if (i17 != 0) {
            i12 |= 12582912;
        } else if ((i10 & 12582912) == 0) {
            if (c0VarR.D(jVar)) {
                i18 = 8388608;
            } else {
                i18 = 4194304;
            }
            i12 |= i18;
        }
        if ((i11 & 256) != 0) {
            i12 |= 100663296;
        } else if ((i10 & 100663296) == 0) {
            if (c0VarR.k0(nVar)) {
                i19 = 67108864;
            } else {
                i19 = com.google.api.client.googleapis.media.a.f115410j;
            }
            i12 |= i19;
        }
        z12 = true;
        if ((38347923 & i12) != 38347922) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (c0VarR.h(z13, i12 & 1)) {
            c0VarR.l0();
            if ((i10 & 1) != 0) {
                if (i21 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                }
                if (i13 != 0) {
                    z11 = true;
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    q3VarL = e4.f27241a.l(c0VarR, 6);
                }
                if ((i11 & 16) != 0) {
                    d4VarA = e4.f27241a.a(c0VarR, 6);
                    i12 &= -57345;
                } else {
                    d4VarA = d4Var2;
                }
                if ((i11 & 32) != 0) {
                    f4VarC = e4.f27241a.c(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 1572864, 63);
                    c0Var3 = c0VarR;
                    i12 &= -458753;
                } else {
                    c0Var3 = c0VarR;
                    f4VarC = f4Var;
                }
                if (i15 != 0) {
                    a1Var4 = null;
                } else {
                    a1Var4 = a1Var;
                }
                if (i17 != 0) {
                    androidx.compose.ui.a0 a0Var18 = a0Var2;
                    i20 = i12;
                    jVar3 = null;
                    a0Var4 = a0Var18;
                    q3Var3 = q3VarL;
                    a1Var5 = a1Var4;
                    z15 = z11;
                } else {
                    a0Var4 = a0Var2;
                    q3Var3 = q3VarL;
                    a1Var5 = a1Var4;
                    i20 = i12;
                    z15 = z11;
                    jVar3 = jVar;
                }
            } else {
                if (i21 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                }
                if (i13 != 0) {
                    z11 = true;
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    q3VarL = e4.f27241a.l(c0VarR, 6);
                }
                if ((i11 & 16) != 0) {
                    d4VarA = e4.f27241a.a(c0VarR, 6);
                    i12 &= -57345;
                } else {
                    d4VarA = d4Var2;
                }
                if ((i11 & 32) != 0) {
                    f4VarC = e4.f27241a.c(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 1572864, 63);
                    c0Var3 = c0VarR;
                    i12 &= -458753;
                } else {
                    c0Var3 = c0VarR;
                    f4VarC = f4Var;
                }
                if (i15 != 0) {
                    a1Var4 = null;
                } else {
                    a1Var4 = a1Var;
                }
                if (i17 != 0) {
                    androidx.compose.ui.a0 a0Var19 = a0Var2;
                    i20 = i12;
                    jVar3 = null;
                    a0Var4 = a0Var19;
                    q3Var3 = q3VarL;
                    a1Var5 = a1Var4;
                    z15 = z11;
                } else {
                    a0Var4 = a0Var2;
                    q3Var3 = q3VarL;
                    a1Var5 = a1Var4;
                    i20 = i12;
                    z15 = z11;
                    jVar3 = jVar;
                }
            }
            c0Var3.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(2136075085, i20, -1, "androidx.compose.material3.Card (Card.kt:145)");
            }
            if (jVar3 == null) {
                c0Var3.E(1577885006);
                objI0 = c0Var3.i0();
                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = androidx.compose.foundation.interaction.i.a();
                    c0Var3.Y(objI0);
                }
                jVar4 = (androidx.compose.foundation.interaction.j) objI0;
                c0Var3.A();
            } else {
                c0Var3.E(-226195799);
                c0Var3.A();
                jVar4 = jVar3;
            }
            c0Var2 = c0Var3;
            u10.f(function0, a0Var4, z15, q3Var3, d4VarA.a(z15), d4VarA.b(z15), 0.0f, f4VarC.f(z15, jVar4, c0Var3, ((i20 >> 6) & 14) | ((i20 >> 9) & 896)).getValue().O(), a1Var5, jVar4, androidx.compose.runtime.internal.w.e(-1347531112, z12, new b(nVar), c0Var3, 54), c0Var2, (i20 & 8190) | (234881024 & (i20 << 6)), 6, 64);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            d4Var3 = d4VarA;
            f4Var2 = f4VarC;
            jVar2 = jVar3;
            a0Var3 = a0Var4;
            z14 = z15;
            q3Var2 = q3Var3;
            a1Var3 = a1Var5;
        } else {
            c0Var2 = c0VarR;
            c0Var2.u();
            f4Var2 = f4Var;
            a0Var3 = a0Var2;
            z14 = z11;
            q3Var2 = q3VarL;
            d4Var3 = d4Var2;
            a1Var3 = a1Var;
            jVar2 = jVar;
        }
        s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.g4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return m4.j(function0, a0Var3, z14, q3Var2, d4Var3, f4Var2, a1Var3, jVar2, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(androidx.compose.ui.a0 a0Var, androidx.compose.ui.graphics.q3 q3Var, d4 d4Var, f4 f4Var, androidx.compose.foundation.a1 a1Var, pj.n nVar, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        g(a0Var, q3Var, d4Var, f4Var, a1Var, nVar, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(Function0 function0, androidx.compose.ui.a0 a0Var, boolean z10, androidx.compose.ui.graphics.q3 q3Var, d4 d4Var, f4 f4Var, androidx.compose.foundation.a1 a1Var, androidx.compose.foundation.interaction.j jVar, pj.n nVar, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        h(function0, a0Var, z10, q3Var, d4Var, f4Var, a1Var, jVar, nVar, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x015d  */
    /* JADX WARN: Code duplicated, block: B:103:0x016c  */
    /* JADX WARN: Code duplicated, block: B:105:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:59:0x00a3  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d7 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:79:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:80:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:84:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:88:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:91:0x0100  */
    /* JADX WARN: Code duplicated, block: B:92:0x0118  */
    /* JADX WARN: Code duplicated, block: B:95:0x0126  */
    /* JADX WARN: Code duplicated, block: B:98:0x0153  */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void k(@Nullable androidx.compose.ui.a0 a0Var, @Nullable androidx.compose.ui.graphics.q3 q3Var, @Nullable d4 d4Var, @Nullable f4 f4Var, @NotNull final pj.n<? super androidx.compose.foundation.layout.m0, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        androidx.compose.ui.a0 a0Var2;
        int i12;
        androidx.compose.ui.graphics.q3 q3Var2;
        d4 d4Var2;
        f4 f4Var2;
        boolean z10;
        androidx.compose.runtime.c0 c0Var2;
        final androidx.compose.ui.a0 a0Var3;
        final androidx.compose.ui.graphics.q3 q3Var3;
        final d4 d4Var3;
        final f4 f4Var3;
        androidx.compose.runtime.s5 s5VarT;
        androidx.compose.ui.a0 a0Var4;
        androidx.compose.ui.graphics.q3 q3VarJ;
        d4 d4VarD;
        androidx.compose.runtime.c0 c0Var3;
        androidx.compose.ui.graphics.q3 q3Var4;
        d4 d4Var4;
        f4 f4VarF;
        androidx.compose.ui.a0 a0Var5;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1464672362);
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
                q3Var2 = q3Var;
                int i14 = c0VarR.D(q3Var2) ? 32 : 16;
                i12 |= i14;
            } else {
                q3Var2 = q3Var;
            }
            i12 |= i14;
        } else {
            q3Var2 = q3Var;
        }
        if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
            if ((i11 & 4) == 0) {
                d4Var2 = d4Var;
                int i15 = c0VarR.D(d4Var2) ? 256 : 128;
                i12 |= i15;
            } else {
                d4Var2 = d4Var;
            }
            i12 |= i15;
        } else {
            d4Var2 = d4Var;
        }
        if ((i10 & 3072) == 0) {
            if ((i11 & 8) == 0) {
                f4Var2 = f4Var;
                int i16 = c0VarR.D(f4Var2) ? 2048 : 1024;
                i12 |= i16;
            } else {
                f4Var2 = f4Var;
            }
            i12 |= i16;
        } else {
            f4Var2 = f4Var;
        }
        if ((i11 & 16) == 0) {
            if ((i10 & 24576) == 0) {
                i12 |= c0VarR.k0(nVar) ? 16384 : 8192;
            }
            if ((i12 & 9363) != 9362) {
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
                        q3VarJ = e4.f27241a.j(c0VarR, 6);
                        i12 &= -113;
                    } else {
                        q3VarJ = q3Var2;
                    }
                    if ((i11 & 4) != 0) {
                        d4VarD = e4.f27241a.d(c0VarR, 6);
                        i12 &= -897;
                    } else {
                        d4VarD = d4Var2;
                    }
                    if ((i11 & 8) != 0) {
                        c0Var3 = c0VarR;
                        i12 &= -7169;
                        a0Var5 = a0Var4;
                        q3Var4 = q3VarJ;
                        d4Var4 = d4VarD;
                        f4VarF = e4.f27241a.f(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0Var3, 1572864, 63);
                    } else {
                        c0Var3 = c0VarR;
                        q3Var4 = q3VarJ;
                        d4Var4 = d4VarD;
                        f4VarF = f4Var2;
                        a0Var5 = a0Var4;
                    }
                } else {
                    c0VarR.u();
                    if ((i11 & 2) != 0) {
                        i12 &= -113;
                    }
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                    }
                    q3Var4 = q3Var2;
                    d4Var4 = d4Var2;
                    f4VarF = f4Var2;
                    c0Var3 = c0VarR;
                    a0Var5 = a0Var2;
                }
                c0Var3.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1464672362, i12, -1, "androidx.compose.material3.ElevatedCard (Card.kt:197)");
                }
                androidx.compose.runtime.c0 c0Var4 = c0Var3;
                g(a0Var5, q3Var4, d4Var4, f4VarF, null, nVar, c0Var4, (i12 & 14) | 24576 | (i12 & com.planner5d.library.engine.input.f.b.B) | (i12 & 896) | (i12 & 7168) | ((i12 << 3) & 458752), 0);
                c0Var2 = c0Var4;
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var5;
                q3Var3 = q3Var4;
                d4Var3 = d4Var4;
                f4Var3 = f4VarF;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var3 = a0Var2;
                q3Var3 = q3Var2;
                d4Var3 = d4Var2;
                f4Var3 = f4Var2;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.k4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return m4.m(a0Var3, q3Var3, d4Var3, f4Var3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 24576;
        if ((i12 & 9363) != 9362) {
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
                    q3VarJ = e4.f27241a.j(c0VarR, 6);
                    i12 &= -113;
                } else {
                    q3VarJ = q3Var2;
                }
                if ((i11 & 4) != 0) {
                    d4VarD = e4.f27241a.d(c0VarR, 6);
                    i12 &= -897;
                } else {
                    d4VarD = d4Var2;
                }
                if ((i11 & 8) != 0) {
                    c0Var3 = c0VarR;
                    i12 &= -7169;
                    a0Var5 = a0Var4;
                    q3Var4 = q3VarJ;
                    d4Var4 = d4VarD;
                    f4VarF = e4.f27241a.f(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0Var3, 1572864, 63);
                } else {
                    c0Var3 = c0VarR;
                    q3Var4 = q3VarJ;
                    d4Var4 = d4VarD;
                    f4VarF = f4Var2;
                    a0Var5 = a0Var4;
                }
            } else {
                if (i13 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if ((i11 & 2) != 0) {
                    q3VarJ = e4.f27241a.j(c0VarR, 6);
                    i12 &= -113;
                } else {
                    q3VarJ = q3Var2;
                }
                if ((i11 & 4) != 0) {
                    d4VarD = e4.f27241a.d(c0VarR, 6);
                    i12 &= -897;
                } else {
                    d4VarD = d4Var2;
                }
                if ((i11 & 8) != 0) {
                    c0Var3 = c0VarR;
                    i12 &= -7169;
                    a0Var5 = a0Var4;
                    q3Var4 = q3VarJ;
                    d4Var4 = d4VarD;
                    f4VarF = e4.f27241a.f(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0Var3, 1572864, 63);
                } else {
                    c0Var3 = c0VarR;
                    q3Var4 = q3VarJ;
                    d4Var4 = d4VarD;
                    f4VarF = f4Var2;
                    a0Var5 = a0Var4;
                }
            }
            c0Var3.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1464672362, i12, -1, "androidx.compose.material3.ElevatedCard (Card.kt:197)");
            }
            androidx.compose.runtime.c0 c0Var5 = c0Var3;
            g(a0Var5, q3Var4, d4Var4, f4VarF, null, nVar, c0Var5, (i12 & 14) | 24576 | (i12 & com.planner5d.library.engine.input.f.b.B) | (i12 & 896) | (i12 & 7168) | ((i12 << 3) & 458752), 0);
            c0Var2 = c0Var5;
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            a0Var3 = a0Var5;
            q3Var3 = q3Var4;
            d4Var3 = d4Var4;
            f4Var3 = f4VarF;
        } else {
            c0Var2 = c0VarR;
            c0Var2.u();
            a0Var3 = a0Var2;
            q3Var3 = q3Var2;
            d4Var3 = d4Var2;
            f4Var3 = f4Var2;
        }
        s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.k4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return m4.m(a0Var3, q3Var3, d4Var3, f4Var3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:111:0x013f A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:112:0x0141  */
    /* JADX WARN: Code duplicated, block: B:114:0x0146  */
    /* JADX WARN: Code duplicated, block: B:117:0x014d  */
    /* JADX WARN: Code duplicated, block: B:120:0x015a  */
    /* JADX WARN: Code duplicated, block: B:121:0x0162  */
    /* JADX WARN: Code duplicated, block: B:124:0x0168  */
    /* JADX WARN: Code duplicated, block: B:125:0x0182  */
    /* JADX WARN: Code duplicated, block: B:127:0x0186  */
    /* JADX WARN: Code duplicated, block: B:129:0x0195  */
    /* JADX WARN: Code duplicated, block: B:132:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:135:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:137:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:140:0x0209  */
    /* JADX WARN: Code duplicated, block: B:142:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004c  */
    /* JADX WARN: Code duplicated, block: B:28:0x0051  */
    /* JADX WARN: Code duplicated, block: B:30:0x0055  */
    /* JADX WARN: Code duplicated, block: B:32:0x005d  */
    /* JADX WARN: Code duplicated, block: B:33:0x0060  */
    /* JADX WARN: Code duplicated, block: B:37:0x0067  */
    /* JADX WARN: Code duplicated, block: B:39:0x006b  */
    /* JADX WARN: Code duplicated, block: B:41:0x0073  */
    /* JADX WARN: Code duplicated, block: B:42:0x0076  */
    /* JADX WARN: Code duplicated, block: B:45:0x007c  */
    /* JADX WARN: Code duplicated, block: B:48:0x0082  */
    /* JADX WARN: Code duplicated, block: B:50:0x0086  */
    /* JADX WARN: Code duplicated, block: B:52:0x008e  */
    /* JADX WARN: Code duplicated, block: B:53:0x0091  */
    /* JADX WARN: Code duplicated, block: B:56:0x0099  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b7  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:76:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:77:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:81:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e0  */
    /* JADX WARN: Code duplicated, block: B:85:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:87:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:88:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:92:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:93:0x0100  */
    /* JADX WARN: Code duplicated, block: B:96:0x0109  */
    /* JADX WARN: Code duplicated, block: B:98:0x0116  */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void l(@NotNull final Function0<Unit> function0, @Nullable androidx.compose.ui.a0 a0Var, boolean z10, @Nullable androidx.compose.ui.graphics.q3 q3Var, @Nullable d4 d4Var, @Nullable f4 f4Var, @Nullable androidx.compose.foundation.interaction.j jVar, @NotNull final pj.n<? super androidx.compose.foundation.layout.m0, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        Function0<Unit> function1;
        int i12;
        androidx.compose.ui.a0 a0Var2;
        int i13;
        boolean z11;
        int i14;
        androidx.compose.ui.graphics.q3 q3VarJ;
        d4 d4Var2;
        f4 f4VarF;
        int i15;
        androidx.compose.foundation.interaction.j jVar2;
        int i16;
        int i17;
        boolean z12;
        androidx.compose.runtime.c0 c0Var2;
        final androidx.compose.ui.a0 a0Var3;
        final boolean z13;
        final androidx.compose.ui.graphics.q3 q3Var2;
        final d4 d4Var3;
        final f4 f4Var2;
        final androidx.compose.foundation.interaction.j jVar3;
        androidx.compose.runtime.s5 s5VarT;
        d4 d4VarD;
        androidx.compose.runtime.c0 c0Var3;
        androidx.compose.foundation.interaction.j jVar4;
        androidx.compose.ui.a0 a0Var4;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-129138571);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
            function1 = function0;
        } else if ((i10 & 6) == 0) {
            function1 = function0;
            i12 = (c0VarR.k0(function1) ? 4 : 2) | i10;
        } else {
            function1 = function0;
            i12 = i10;
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
                        q3VarJ = q3Var;
                        int i19 = c0VarR.D(q3VarJ) ? 2048 : 1024;
                        i12 |= i19;
                    } else {
                        q3VarJ = q3Var;
                    }
                    i12 |= i19;
                } else {
                    q3VarJ = q3Var;
                }
                if ((i10 & 24576) == 0) {
                    if ((i11 & 16) == 0) {
                        d4Var2 = d4Var;
                        int i20 = c0VarR.D(d4Var2) ? 16384 : 8192;
                        i12 |= i20;
                    } else {
                        d4Var2 = d4Var;
                    }
                    i12 |= i20;
                } else {
                    d4Var2 = d4Var;
                }
                if ((196608 & i10) == 0) {
                    if ((i11 & 32) == 0) {
                        f4VarF = f4Var;
                        int i21 = c0VarR.D(f4VarF) ? 131072 : 65536;
                        i12 |= i21;
                    } else {
                        f4VarF = f4Var;
                    }
                    i12 |= i21;
                } else {
                    f4VarF = f4Var;
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
                            if (c0VarR.k0(nVar)) {
                                i17 = 8388608;
                            } else {
                                i17 = 4194304;
                            }
                            i12 |= i17;
                        }
                        if ((4793491 & i12) != 4793490) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (c0VarR.h(z12, i12 & 1)) {
                            c0VarR.l0();
                            if ((i10 & 1) != 0 || c0VarR.y()) {
                                if (i18 != 0) {
                                    a0Var2 = androidx.compose.ui.a0.E;
                                }
                                if (i13 != 0) {
                                    z11 = true;
                                }
                                if ((i11 & 8) != 0) {
                                    i12 &= -7169;
                                    q3VarJ = e4.f27241a.j(c0VarR, 6);
                                }
                                if ((i11 & 16) != 0) {
                                    d4VarD = e4.f27241a.d(c0VarR, 6);
                                    i12 &= -57345;
                                } else {
                                    d4VarD = d4Var2;
                                }
                                if ((i11 & 32) != 0) {
                                    c0Var3 = c0VarR;
                                    i12 &= -458753;
                                    f4VarF = e4.f27241a.f(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0Var3, 1572864, 63);
                                } else {
                                    c0Var3 = c0VarR;
                                }
                                if (i15 != 0) {
                                    jVar4 = null;
                                } else {
                                    jVar4 = jVar;
                                }
                                a0Var4 = a0Var2;
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
                                c0Var3 = c0VarR;
                                q3VarJ = q3VarJ;
                                d4VarD = d4Var2;
                                f4VarF = f4VarF;
                                jVar4 = jVar2;
                                a0Var4 = a0Var2;
                                z11 = z11;
                            }
                            c0Var3.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(-129138571, i12, -1, "androidx.compose.material3.ElevatedCard (Card.kt:250)");
                            }
                            int i22 = i12 << 3;
                            h(function1, a0Var4, z11, q3VarJ, d4VarD, f4VarF, null, jVar4, nVar, c0Var3, (i12 & 14) | 1572864 | (i12 & com.planner5d.library.engine.input.f.b.B) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (458752 & i12) | (29360128 & i22) | (i22 & 234881024), 0);
                            androidx.compose.foundation.interaction.j jVar5 = jVar4;
                            c0Var2 = c0Var3;
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            jVar3 = jVar5;
                            a0Var3 = a0Var4;
                            z13 = z11;
                            q3Var2 = q3VarJ;
                            d4Var3 = d4VarD;
                            f4Var2 = f4VarF;
                        } else {
                            c0Var2 = c0VarR;
                            c0Var2.u();
                            a0Var3 = a0Var2;
                            z13 = z11;
                            q3Var2 = q3VarJ;
                            d4Var3 = d4Var2;
                            f4Var2 = f4VarF;
                            jVar3 = jVar;
                        }
                        s5VarT = c0Var2.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material3.j4
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return m4.n(function0, a0Var3, z13, q3Var2, d4Var3, f4Var2, jVar3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i12 |= 12582912;
                    if ((4793491 & i12) != 4793490) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (c0VarR.h(z12, i12 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i18 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            }
                            if ((i11 & 8) != 0) {
                                i12 &= -7169;
                                q3VarJ = e4.f27241a.j(c0VarR, 6);
                            }
                            if ((i11 & 16) != 0) {
                                d4VarD = e4.f27241a.d(c0VarR, 6);
                                i12 &= -57345;
                            } else {
                                d4VarD = d4Var2;
                            }
                            if ((i11 & 32) != 0) {
                                c0Var3 = c0VarR;
                                i12 &= -458753;
                                f4VarF = e4.f27241a.f(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0Var3, 1572864, 63);
                            } else {
                                c0Var3 = c0VarR;
                            }
                            if (i15 != 0) {
                                jVar4 = null;
                            } else {
                                jVar4 = jVar;
                            }
                            a0Var4 = a0Var2;
                        } else {
                            if (i18 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            }
                            if ((i11 & 8) != 0) {
                                i12 &= -7169;
                                q3VarJ = e4.f27241a.j(c0VarR, 6);
                            }
                            if ((i11 & 16) != 0) {
                                d4VarD = e4.f27241a.d(c0VarR, 6);
                                i12 &= -57345;
                            } else {
                                d4VarD = d4Var2;
                            }
                            if ((i11 & 32) != 0) {
                                c0Var3 = c0VarR;
                                i12 &= -458753;
                                f4VarF = e4.f27241a.f(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0Var3, 1572864, 63);
                            } else {
                                c0Var3 = c0VarR;
                            }
                            if (i15 != 0) {
                                jVar4 = null;
                            } else {
                                jVar4 = jVar;
                            }
                            a0Var4 = a0Var2;
                        }
                        c0Var3.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-129138571, i12, -1, "androidx.compose.material3.ElevatedCard (Card.kt:250)");
                        }
                        int i23 = i12 << 3;
                        h(function1, a0Var4, z11, q3VarJ, d4VarD, f4VarF, null, jVar4, nVar, c0Var3, (i12 & 14) | 1572864 | (i12 & com.planner5d.library.engine.input.f.b.B) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (458752 & i12) | (29360128 & i23) | (i23 & 234881024), 0);
                        androidx.compose.foundation.interaction.j jVar6 = jVar4;
                        c0Var2 = c0Var3;
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        jVar3 = jVar6;
                        a0Var3 = a0Var4;
                        z13 = z11;
                        q3Var2 = q3VarJ;
                        d4Var3 = d4VarD;
                        f4Var2 = f4VarF;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        a0Var3 = a0Var2;
                        z13 = z11;
                        q3Var2 = q3VarJ;
                        d4Var3 = d4Var2;
                        f4Var2 = f4VarF;
                        jVar3 = jVar;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.j4
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return m4.n(function0, a0Var3, z13, q3Var2, d4Var3, f4Var2, jVar3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 1572864;
                jVar2 = jVar;
                if ((i11 & 128) != 0) {
                    if ((i10 & 12582912) == 0) {
                        if (c0VarR.k0(nVar)) {
                            i17 = 8388608;
                        } else {
                            i17 = 4194304;
                        }
                        i12 |= i17;
                    }
                    if ((4793491 & i12) != 4793490) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (c0VarR.h(z12, i12 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i18 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            }
                            if ((i11 & 8) != 0) {
                                i12 &= -7169;
                                q3VarJ = e4.f27241a.j(c0VarR, 6);
                            }
                            if ((i11 & 16) != 0) {
                                d4VarD = e4.f27241a.d(c0VarR, 6);
                                i12 &= -57345;
                            } else {
                                d4VarD = d4Var2;
                            }
                            if ((i11 & 32) != 0) {
                                c0Var3 = c0VarR;
                                i12 &= -458753;
                                f4VarF = e4.f27241a.f(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0Var3, 1572864, 63);
                            } else {
                                c0Var3 = c0VarR;
                            }
                            if (i15 != 0) {
                                jVar4 = null;
                            } else {
                                jVar4 = jVar;
                            }
                            a0Var4 = a0Var2;
                        } else {
                            if (i18 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            }
                            if ((i11 & 8) != 0) {
                                i12 &= -7169;
                                q3VarJ = e4.f27241a.j(c0VarR, 6);
                            }
                            if ((i11 & 16) != 0) {
                                d4VarD = e4.f27241a.d(c0VarR, 6);
                                i12 &= -57345;
                            } else {
                                d4VarD = d4Var2;
                            }
                            if ((i11 & 32) != 0) {
                                c0Var3 = c0VarR;
                                i12 &= -458753;
                                f4VarF = e4.f27241a.f(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0Var3, 1572864, 63);
                            } else {
                                c0Var3 = c0VarR;
                            }
                            if (i15 != 0) {
                                jVar4 = null;
                            } else {
                                jVar4 = jVar;
                            }
                            a0Var4 = a0Var2;
                        }
                        c0Var3.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-129138571, i12, -1, "androidx.compose.material3.ElevatedCard (Card.kt:250)");
                        }
                        int i24 = i12 << 3;
                        h(function1, a0Var4, z11, q3VarJ, d4VarD, f4VarF, null, jVar4, nVar, c0Var3, (i12 & 14) | 1572864 | (i12 & com.planner5d.library.engine.input.f.b.B) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (458752 & i12) | (29360128 & i24) | (i24 & 234881024), 0);
                        androidx.compose.foundation.interaction.j jVar7 = jVar4;
                        c0Var2 = c0Var3;
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        jVar3 = jVar7;
                        a0Var3 = a0Var4;
                        z13 = z11;
                        q3Var2 = q3VarJ;
                        d4Var3 = d4VarD;
                        f4Var2 = f4VarF;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        a0Var3 = a0Var2;
                        z13 = z11;
                        q3Var2 = q3VarJ;
                        d4Var3 = d4Var2;
                        f4Var2 = f4VarF;
                        jVar3 = jVar;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.j4
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return m4.n(function0, a0Var3, z13, q3Var2, d4Var3, f4Var2, jVar3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 12582912;
                if ((4793491 & i12) != 4793490) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i18 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            q3VarJ = e4.f27241a.j(c0VarR, 6);
                        }
                        if ((i11 & 16) != 0) {
                            d4VarD = e4.f27241a.d(c0VarR, 6);
                            i12 &= -57345;
                        } else {
                            d4VarD = d4Var2;
                        }
                        if ((i11 & 32) != 0) {
                            c0Var3 = c0VarR;
                            i12 &= -458753;
                            f4VarF = e4.f27241a.f(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0Var3, 1572864, 63);
                        } else {
                            c0Var3 = c0VarR;
                        }
                        if (i15 != 0) {
                            jVar4 = null;
                        } else {
                            jVar4 = jVar;
                        }
                        a0Var4 = a0Var2;
                    } else {
                        if (i18 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            q3VarJ = e4.f27241a.j(c0VarR, 6);
                        }
                        if ((i11 & 16) != 0) {
                            d4VarD = e4.f27241a.d(c0VarR, 6);
                            i12 &= -57345;
                        } else {
                            d4VarD = d4Var2;
                        }
                        if ((i11 & 32) != 0) {
                            c0Var3 = c0VarR;
                            i12 &= -458753;
                            f4VarF = e4.f27241a.f(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0Var3, 1572864, 63);
                        } else {
                            c0Var3 = c0VarR;
                        }
                        if (i15 != 0) {
                            jVar4 = null;
                        } else {
                            jVar4 = jVar;
                        }
                        a0Var4 = a0Var2;
                    }
                    c0Var3.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-129138571, i12, -1, "androidx.compose.material3.ElevatedCard (Card.kt:250)");
                    }
                    int i25 = i12 << 3;
                    h(function1, a0Var4, z11, q3VarJ, d4VarD, f4VarF, null, jVar4, nVar, c0Var3, (i12 & 14) | 1572864 | (i12 & com.planner5d.library.engine.input.f.b.B) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (458752 & i12) | (29360128 & i25) | (i25 & 234881024), 0);
                    androidx.compose.foundation.interaction.j jVar8 = jVar4;
                    c0Var2 = c0Var3;
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    jVar3 = jVar8;
                    a0Var3 = a0Var4;
                    z13 = z11;
                    q3Var2 = q3VarJ;
                    d4Var3 = d4VarD;
                    f4Var2 = f4VarF;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var3 = a0Var2;
                    z13 = z11;
                    q3Var2 = q3VarJ;
                    d4Var3 = d4Var2;
                    f4Var2 = f4VarF;
                    jVar3 = jVar;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.j4
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return m4.n(function0, a0Var3, z13, q3Var2, d4Var3, f4Var2, jVar3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= androidx.media3.exoplayer.a5.S0;
            z11 = z10;
            if ((i10 & 3072) == 0) {
                if ((i11 & 8) == 0) {
                    q3VarJ = q3Var;
                    if (c0VarR.D(q3VarJ)) {
                    }
                    i12 |= i19;
                } else {
                    q3VarJ = q3Var;
                }
                i12 |= i19;
            } else {
                q3VarJ = q3Var;
            }
            if ((i10 & 24576) == 0) {
                if ((i11 & 16) == 0) {
                    d4Var2 = d4Var;
                    if (c0VarR.D(d4Var2)) {
                    }
                    i12 |= i20;
                } else {
                    d4Var2 = d4Var;
                }
                i12 |= i20;
            } else {
                d4Var2 = d4Var;
            }
            if ((196608 & i10) == 0) {
                if ((i11 & 32) == 0) {
                    f4VarF = f4Var;
                    if (c0VarR.D(f4VarF)) {
                    }
                    i12 |= i21;
                } else {
                    f4VarF = f4Var;
                }
                i12 |= i21;
            } else {
                f4VarF = f4Var;
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
                        if (c0VarR.k0(nVar)) {
                            i17 = 8388608;
                        } else {
                            i17 = 4194304;
                        }
                        i12 |= i17;
                    }
                    if ((4793491 & i12) != 4793490) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (c0VarR.h(z12, i12 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i18 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            }
                            if ((i11 & 8) != 0) {
                                i12 &= -7169;
                                q3VarJ = e4.f27241a.j(c0VarR, 6);
                            }
                            if ((i11 & 16) != 0) {
                                d4VarD = e4.f27241a.d(c0VarR, 6);
                                i12 &= -57345;
                            } else {
                                d4VarD = d4Var2;
                            }
                            if ((i11 & 32) != 0) {
                                c0Var3 = c0VarR;
                                i12 &= -458753;
                                f4VarF = e4.f27241a.f(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0Var3, 1572864, 63);
                            } else {
                                c0Var3 = c0VarR;
                            }
                            if (i15 != 0) {
                                jVar4 = null;
                            } else {
                                jVar4 = jVar;
                            }
                            a0Var4 = a0Var2;
                        } else {
                            if (i18 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            }
                            if ((i11 & 8) != 0) {
                                i12 &= -7169;
                                q3VarJ = e4.f27241a.j(c0VarR, 6);
                            }
                            if ((i11 & 16) != 0) {
                                d4VarD = e4.f27241a.d(c0VarR, 6);
                                i12 &= -57345;
                            } else {
                                d4VarD = d4Var2;
                            }
                            if ((i11 & 32) != 0) {
                                c0Var3 = c0VarR;
                                i12 &= -458753;
                                f4VarF = e4.f27241a.f(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0Var3, 1572864, 63);
                            } else {
                                c0Var3 = c0VarR;
                            }
                            if (i15 != 0) {
                                jVar4 = null;
                            } else {
                                jVar4 = jVar;
                            }
                            a0Var4 = a0Var2;
                        }
                        c0Var3.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-129138571, i12, -1, "androidx.compose.material3.ElevatedCard (Card.kt:250)");
                        }
                        int i26 = i12 << 3;
                        h(function1, a0Var4, z11, q3VarJ, d4VarD, f4VarF, null, jVar4, nVar, c0Var3, (i12 & 14) | 1572864 | (i12 & com.planner5d.library.engine.input.f.b.B) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (458752 & i12) | (29360128 & i26) | (i26 & 234881024), 0);
                        androidx.compose.foundation.interaction.j jVar9 = jVar4;
                        c0Var2 = c0Var3;
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        jVar3 = jVar9;
                        a0Var3 = a0Var4;
                        z13 = z11;
                        q3Var2 = q3VarJ;
                        d4Var3 = d4VarD;
                        f4Var2 = f4VarF;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        a0Var3 = a0Var2;
                        z13 = z11;
                        q3Var2 = q3VarJ;
                        d4Var3 = d4Var2;
                        f4Var2 = f4VarF;
                        jVar3 = jVar;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.j4
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return m4.n(function0, a0Var3, z13, q3Var2, d4Var3, f4Var2, jVar3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 12582912;
                if ((4793491 & i12) != 4793490) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i18 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            q3VarJ = e4.f27241a.j(c0VarR, 6);
                        }
                        if ((i11 & 16) != 0) {
                            d4VarD = e4.f27241a.d(c0VarR, 6);
                            i12 &= -57345;
                        } else {
                            d4VarD = d4Var2;
                        }
                        if ((i11 & 32) != 0) {
                            c0Var3 = c0VarR;
                            i12 &= -458753;
                            f4VarF = e4.f27241a.f(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0Var3, 1572864, 63);
                        } else {
                            c0Var3 = c0VarR;
                        }
                        if (i15 != 0) {
                            jVar4 = null;
                        } else {
                            jVar4 = jVar;
                        }
                        a0Var4 = a0Var2;
                    } else {
                        if (i18 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            q3VarJ = e4.f27241a.j(c0VarR, 6);
                        }
                        if ((i11 & 16) != 0) {
                            d4VarD = e4.f27241a.d(c0VarR, 6);
                            i12 &= -57345;
                        } else {
                            d4VarD = d4Var2;
                        }
                        if ((i11 & 32) != 0) {
                            c0Var3 = c0VarR;
                            i12 &= -458753;
                            f4VarF = e4.f27241a.f(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0Var3, 1572864, 63);
                        } else {
                            c0Var3 = c0VarR;
                        }
                        if (i15 != 0) {
                            jVar4 = null;
                        } else {
                            jVar4 = jVar;
                        }
                        a0Var4 = a0Var2;
                    }
                    c0Var3.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-129138571, i12, -1, "androidx.compose.material3.ElevatedCard (Card.kt:250)");
                    }
                    int i27 = i12 << 3;
                    h(function1, a0Var4, z11, q3VarJ, d4VarD, f4VarF, null, jVar4, nVar, c0Var3, (i12 & 14) | 1572864 | (i12 & com.planner5d.library.engine.input.f.b.B) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (458752 & i12) | (29360128 & i27) | (i27 & 234881024), 0);
                    androidx.compose.foundation.interaction.j jVar10 = jVar4;
                    c0Var2 = c0Var3;
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    jVar3 = jVar10;
                    a0Var3 = a0Var4;
                    z13 = z11;
                    q3Var2 = q3VarJ;
                    d4Var3 = d4VarD;
                    f4Var2 = f4VarF;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var3 = a0Var2;
                    z13 = z11;
                    q3Var2 = q3VarJ;
                    d4Var3 = d4Var2;
                    f4Var2 = f4VarF;
                    jVar3 = jVar;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.j4
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return m4.n(function0, a0Var3, z13, q3Var2, d4Var3, f4Var2, jVar3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 1572864;
            jVar2 = jVar;
            if ((i11 & 128) != 0) {
                if ((i10 & 12582912) == 0) {
                    if (c0VarR.k0(nVar)) {
                        i17 = 8388608;
                    } else {
                        i17 = 4194304;
                    }
                    i12 |= i17;
                }
                if ((4793491 & i12) != 4793490) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i18 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            q3VarJ = e4.f27241a.j(c0VarR, 6);
                        }
                        if ((i11 & 16) != 0) {
                            d4VarD = e4.f27241a.d(c0VarR, 6);
                            i12 &= -57345;
                        } else {
                            d4VarD = d4Var2;
                        }
                        if ((i11 & 32) != 0) {
                            c0Var3 = c0VarR;
                            i12 &= -458753;
                            f4VarF = e4.f27241a.f(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0Var3, 1572864, 63);
                        } else {
                            c0Var3 = c0VarR;
                        }
                        if (i15 != 0) {
                            jVar4 = null;
                        } else {
                            jVar4 = jVar;
                        }
                        a0Var4 = a0Var2;
                    } else {
                        if (i18 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            q3VarJ = e4.f27241a.j(c0VarR, 6);
                        }
                        if ((i11 & 16) != 0) {
                            d4VarD = e4.f27241a.d(c0VarR, 6);
                            i12 &= -57345;
                        } else {
                            d4VarD = d4Var2;
                        }
                        if ((i11 & 32) != 0) {
                            c0Var3 = c0VarR;
                            i12 &= -458753;
                            f4VarF = e4.f27241a.f(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0Var3, 1572864, 63);
                        } else {
                            c0Var3 = c0VarR;
                        }
                        if (i15 != 0) {
                            jVar4 = null;
                        } else {
                            jVar4 = jVar;
                        }
                        a0Var4 = a0Var2;
                    }
                    c0Var3.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-129138571, i12, -1, "androidx.compose.material3.ElevatedCard (Card.kt:250)");
                    }
                    int i28 = i12 << 3;
                    h(function1, a0Var4, z11, q3VarJ, d4VarD, f4VarF, null, jVar4, nVar, c0Var3, (i12 & 14) | 1572864 | (i12 & com.planner5d.library.engine.input.f.b.B) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (458752 & i12) | (29360128 & i28) | (i28 & 234881024), 0);
                    androidx.compose.foundation.interaction.j jVar11 = jVar4;
                    c0Var2 = c0Var3;
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    jVar3 = jVar11;
                    a0Var3 = a0Var4;
                    z13 = z11;
                    q3Var2 = q3VarJ;
                    d4Var3 = d4VarD;
                    f4Var2 = f4VarF;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var3 = a0Var2;
                    z13 = z11;
                    q3Var2 = q3VarJ;
                    d4Var3 = d4Var2;
                    f4Var2 = f4VarF;
                    jVar3 = jVar;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.j4
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return m4.n(function0, a0Var3, z13, q3Var2, d4Var3, f4Var2, jVar3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 12582912;
            if ((4793491 & i12) != 4793490) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        q3VarJ = e4.f27241a.j(c0VarR, 6);
                    }
                    if ((i11 & 16) != 0) {
                        d4VarD = e4.f27241a.d(c0VarR, 6);
                        i12 &= -57345;
                    } else {
                        d4VarD = d4Var2;
                    }
                    if ((i11 & 32) != 0) {
                        c0Var3 = c0VarR;
                        i12 &= -458753;
                        f4VarF = e4.f27241a.f(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0Var3, 1572864, 63);
                    } else {
                        c0Var3 = c0VarR;
                    }
                    if (i15 != 0) {
                        jVar4 = null;
                    } else {
                        jVar4 = jVar;
                    }
                    a0Var4 = a0Var2;
                } else {
                    if (i18 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        q3VarJ = e4.f27241a.j(c0VarR, 6);
                    }
                    if ((i11 & 16) != 0) {
                        d4VarD = e4.f27241a.d(c0VarR, 6);
                        i12 &= -57345;
                    } else {
                        d4VarD = d4Var2;
                    }
                    if ((i11 & 32) != 0) {
                        c0Var3 = c0VarR;
                        i12 &= -458753;
                        f4VarF = e4.f27241a.f(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0Var3, 1572864, 63);
                    } else {
                        c0Var3 = c0VarR;
                    }
                    if (i15 != 0) {
                        jVar4 = null;
                    } else {
                        jVar4 = jVar;
                    }
                    a0Var4 = a0Var2;
                }
                c0Var3.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-129138571, i12, -1, "androidx.compose.material3.ElevatedCard (Card.kt:250)");
                }
                int i29 = i12 << 3;
                h(function1, a0Var4, z11, q3VarJ, d4VarD, f4VarF, null, jVar4, nVar, c0Var3, (i12 & 14) | 1572864 | (i12 & com.planner5d.library.engine.input.f.b.B) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (458752 & i12) | (29360128 & i29) | (i29 & 234881024), 0);
                androidx.compose.foundation.interaction.j jVar12 = jVar4;
                c0Var2 = c0Var3;
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                jVar3 = jVar12;
                a0Var3 = a0Var4;
                z13 = z11;
                q3Var2 = q3VarJ;
                d4Var3 = d4VarD;
                f4Var2 = f4VarF;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var3 = a0Var2;
                z13 = z11;
                q3Var2 = q3VarJ;
                d4Var3 = d4Var2;
                f4Var2 = f4VarF;
                jVar3 = jVar;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.j4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return m4.n(function0, a0Var3, z13, q3Var2, d4Var3, f4Var2, jVar3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
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
                    q3VarJ = q3Var;
                    if (c0VarR.D(q3VarJ)) {
                    }
                    i12 |= i19;
                } else {
                    q3VarJ = q3Var;
                }
                i12 |= i19;
            } else {
                q3VarJ = q3Var;
            }
            if ((i10 & 24576) == 0) {
                if ((i11 & 16) == 0) {
                    d4Var2 = d4Var;
                    if (c0VarR.D(d4Var2)) {
                    }
                    i12 |= i20;
                } else {
                    d4Var2 = d4Var;
                }
                i12 |= i20;
            } else {
                d4Var2 = d4Var;
            }
            if ((196608 & i10) == 0) {
                if ((i11 & 32) == 0) {
                    f4VarF = f4Var;
                    if (c0VarR.D(f4VarF)) {
                    }
                    i12 |= i21;
                } else {
                    f4VarF = f4Var;
                }
                i12 |= i21;
            } else {
                f4VarF = f4Var;
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
                        if (c0VarR.k0(nVar)) {
                            i17 = 8388608;
                        } else {
                            i17 = 4194304;
                        }
                        i12 |= i17;
                    }
                    if ((4793491 & i12) != 4793490) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (c0VarR.h(z12, i12 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i18 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            }
                            if ((i11 & 8) != 0) {
                                i12 &= -7169;
                                q3VarJ = e4.f27241a.j(c0VarR, 6);
                            }
                            if ((i11 & 16) != 0) {
                                d4VarD = e4.f27241a.d(c0VarR, 6);
                                i12 &= -57345;
                            } else {
                                d4VarD = d4Var2;
                            }
                            if ((i11 & 32) != 0) {
                                c0Var3 = c0VarR;
                                i12 &= -458753;
                                f4VarF = e4.f27241a.f(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0Var3, 1572864, 63);
                            } else {
                                c0Var3 = c0VarR;
                            }
                            if (i15 != 0) {
                                jVar4 = null;
                            } else {
                                jVar4 = jVar;
                            }
                            a0Var4 = a0Var2;
                        } else {
                            if (i18 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            }
                            if ((i11 & 8) != 0) {
                                i12 &= -7169;
                                q3VarJ = e4.f27241a.j(c0VarR, 6);
                            }
                            if ((i11 & 16) != 0) {
                                d4VarD = e4.f27241a.d(c0VarR, 6);
                                i12 &= -57345;
                            } else {
                                d4VarD = d4Var2;
                            }
                            if ((i11 & 32) != 0) {
                                c0Var3 = c0VarR;
                                i12 &= -458753;
                                f4VarF = e4.f27241a.f(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0Var3, 1572864, 63);
                            } else {
                                c0Var3 = c0VarR;
                            }
                            if (i15 != 0) {
                                jVar4 = null;
                            } else {
                                jVar4 = jVar;
                            }
                            a0Var4 = a0Var2;
                        }
                        c0Var3.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-129138571, i12, -1, "androidx.compose.material3.ElevatedCard (Card.kt:250)");
                        }
                        int i210 = i12 << 3;
                        h(function1, a0Var4, z11, q3VarJ, d4VarD, f4VarF, null, jVar4, nVar, c0Var3, (i12 & 14) | 1572864 | (i12 & com.planner5d.library.engine.input.f.b.B) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (458752 & i12) | (29360128 & i210) | (i210 & 234881024), 0);
                        androidx.compose.foundation.interaction.j jVar13 = jVar4;
                        c0Var2 = c0Var3;
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        jVar3 = jVar13;
                        a0Var3 = a0Var4;
                        z13 = z11;
                        q3Var2 = q3VarJ;
                        d4Var3 = d4VarD;
                        f4Var2 = f4VarF;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        a0Var3 = a0Var2;
                        z13 = z11;
                        q3Var2 = q3VarJ;
                        d4Var3 = d4Var2;
                        f4Var2 = f4VarF;
                        jVar3 = jVar;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.j4
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return m4.n(function0, a0Var3, z13, q3Var2, d4Var3, f4Var2, jVar3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 12582912;
                if ((4793491 & i12) != 4793490) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i18 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            q3VarJ = e4.f27241a.j(c0VarR, 6);
                        }
                        if ((i11 & 16) != 0) {
                            d4VarD = e4.f27241a.d(c0VarR, 6);
                            i12 &= -57345;
                        } else {
                            d4VarD = d4Var2;
                        }
                        if ((i11 & 32) != 0) {
                            c0Var3 = c0VarR;
                            i12 &= -458753;
                            f4VarF = e4.f27241a.f(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0Var3, 1572864, 63);
                        } else {
                            c0Var3 = c0VarR;
                        }
                        if (i15 != 0) {
                            jVar4 = null;
                        } else {
                            jVar4 = jVar;
                        }
                        a0Var4 = a0Var2;
                    } else {
                        if (i18 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            q3VarJ = e4.f27241a.j(c0VarR, 6);
                        }
                        if ((i11 & 16) != 0) {
                            d4VarD = e4.f27241a.d(c0VarR, 6);
                            i12 &= -57345;
                        } else {
                            d4VarD = d4Var2;
                        }
                        if ((i11 & 32) != 0) {
                            c0Var3 = c0VarR;
                            i12 &= -458753;
                            f4VarF = e4.f27241a.f(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0Var3, 1572864, 63);
                        } else {
                            c0Var3 = c0VarR;
                        }
                        if (i15 != 0) {
                            jVar4 = null;
                        } else {
                            jVar4 = jVar;
                        }
                        a0Var4 = a0Var2;
                    }
                    c0Var3.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-129138571, i12, -1, "androidx.compose.material3.ElevatedCard (Card.kt:250)");
                    }
                    int i211 = i12 << 3;
                    h(function1, a0Var4, z11, q3VarJ, d4VarD, f4VarF, null, jVar4, nVar, c0Var3, (i12 & 14) | 1572864 | (i12 & com.planner5d.library.engine.input.f.b.B) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (458752 & i12) | (29360128 & i211) | (i211 & 234881024), 0);
                    androidx.compose.foundation.interaction.j jVar14 = jVar4;
                    c0Var2 = c0Var3;
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    jVar3 = jVar14;
                    a0Var3 = a0Var4;
                    z13 = z11;
                    q3Var2 = q3VarJ;
                    d4Var3 = d4VarD;
                    f4Var2 = f4VarF;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var3 = a0Var2;
                    z13 = z11;
                    q3Var2 = q3VarJ;
                    d4Var3 = d4Var2;
                    f4Var2 = f4VarF;
                    jVar3 = jVar;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.j4
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return m4.n(function0, a0Var3, z13, q3Var2, d4Var3, f4Var2, jVar3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 1572864;
            jVar2 = jVar;
            if ((i11 & 128) != 0) {
                if ((i10 & 12582912) == 0) {
                    if (c0VarR.k0(nVar)) {
                        i17 = 8388608;
                    } else {
                        i17 = 4194304;
                    }
                    i12 |= i17;
                }
                if ((4793491 & i12) != 4793490) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i18 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            q3VarJ = e4.f27241a.j(c0VarR, 6);
                        }
                        if ((i11 & 16) != 0) {
                            d4VarD = e4.f27241a.d(c0VarR, 6);
                            i12 &= -57345;
                        } else {
                            d4VarD = d4Var2;
                        }
                        if ((i11 & 32) != 0) {
                            c0Var3 = c0VarR;
                            i12 &= -458753;
                            f4VarF = e4.f27241a.f(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0Var3, 1572864, 63);
                        } else {
                            c0Var3 = c0VarR;
                        }
                        if (i15 != 0) {
                            jVar4 = null;
                        } else {
                            jVar4 = jVar;
                        }
                        a0Var4 = a0Var2;
                    } else {
                        if (i18 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            q3VarJ = e4.f27241a.j(c0VarR, 6);
                        }
                        if ((i11 & 16) != 0) {
                            d4VarD = e4.f27241a.d(c0VarR, 6);
                            i12 &= -57345;
                        } else {
                            d4VarD = d4Var2;
                        }
                        if ((i11 & 32) != 0) {
                            c0Var3 = c0VarR;
                            i12 &= -458753;
                            f4VarF = e4.f27241a.f(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0Var3, 1572864, 63);
                        } else {
                            c0Var3 = c0VarR;
                        }
                        if (i15 != 0) {
                            jVar4 = null;
                        } else {
                            jVar4 = jVar;
                        }
                        a0Var4 = a0Var2;
                    }
                    c0Var3.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-129138571, i12, -1, "androidx.compose.material3.ElevatedCard (Card.kt:250)");
                    }
                    int i212 = i12 << 3;
                    h(function1, a0Var4, z11, q3VarJ, d4VarD, f4VarF, null, jVar4, nVar, c0Var3, (i12 & 14) | 1572864 | (i12 & com.planner5d.library.engine.input.f.b.B) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (458752 & i12) | (29360128 & i212) | (i212 & 234881024), 0);
                    androidx.compose.foundation.interaction.j jVar15 = jVar4;
                    c0Var2 = c0Var3;
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    jVar3 = jVar15;
                    a0Var3 = a0Var4;
                    z13 = z11;
                    q3Var2 = q3VarJ;
                    d4Var3 = d4VarD;
                    f4Var2 = f4VarF;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var3 = a0Var2;
                    z13 = z11;
                    q3Var2 = q3VarJ;
                    d4Var3 = d4Var2;
                    f4Var2 = f4VarF;
                    jVar3 = jVar;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.j4
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return m4.n(function0, a0Var3, z13, q3Var2, d4Var3, f4Var2, jVar3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 12582912;
            if ((4793491 & i12) != 4793490) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        q3VarJ = e4.f27241a.j(c0VarR, 6);
                    }
                    if ((i11 & 16) != 0) {
                        d4VarD = e4.f27241a.d(c0VarR, 6);
                        i12 &= -57345;
                    } else {
                        d4VarD = d4Var2;
                    }
                    if ((i11 & 32) != 0) {
                        c0Var3 = c0VarR;
                        i12 &= -458753;
                        f4VarF = e4.f27241a.f(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0Var3, 1572864, 63);
                    } else {
                        c0Var3 = c0VarR;
                    }
                    if (i15 != 0) {
                        jVar4 = null;
                    } else {
                        jVar4 = jVar;
                    }
                    a0Var4 = a0Var2;
                } else {
                    if (i18 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        q3VarJ = e4.f27241a.j(c0VarR, 6);
                    }
                    if ((i11 & 16) != 0) {
                        d4VarD = e4.f27241a.d(c0VarR, 6);
                        i12 &= -57345;
                    } else {
                        d4VarD = d4Var2;
                    }
                    if ((i11 & 32) != 0) {
                        c0Var3 = c0VarR;
                        i12 &= -458753;
                        f4VarF = e4.f27241a.f(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0Var3, 1572864, 63);
                    } else {
                        c0Var3 = c0VarR;
                    }
                    if (i15 != 0) {
                        jVar4 = null;
                    } else {
                        jVar4 = jVar;
                    }
                    a0Var4 = a0Var2;
                }
                c0Var3.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-129138571, i12, -1, "androidx.compose.material3.ElevatedCard (Card.kt:250)");
                }
                int i213 = i12 << 3;
                h(function1, a0Var4, z11, q3VarJ, d4VarD, f4VarF, null, jVar4, nVar, c0Var3, (i12 & 14) | 1572864 | (i12 & com.planner5d.library.engine.input.f.b.B) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (458752 & i12) | (29360128 & i213) | (i213 & 234881024), 0);
                androidx.compose.foundation.interaction.j jVar16 = jVar4;
                c0Var2 = c0Var3;
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                jVar3 = jVar16;
                a0Var3 = a0Var4;
                z13 = z11;
                q3Var2 = q3VarJ;
                d4Var3 = d4VarD;
                f4Var2 = f4VarF;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var3 = a0Var2;
                z13 = z11;
                q3Var2 = q3VarJ;
                d4Var3 = d4Var2;
                f4Var2 = f4VarF;
                jVar3 = jVar;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.j4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return m4.n(function0, a0Var3, z13, q3Var2, d4Var3, f4Var2, jVar3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= androidx.media3.exoplayer.a5.S0;
        z11 = z10;
        if ((i10 & 3072) == 0) {
            if ((i11 & 8) == 0) {
                q3VarJ = q3Var;
                if (c0VarR.D(q3VarJ)) {
                }
                i12 |= i19;
            } else {
                q3VarJ = q3Var;
            }
            i12 |= i19;
        } else {
            q3VarJ = q3Var;
        }
        if ((i10 & 24576) == 0) {
            if ((i11 & 16) == 0) {
                d4Var2 = d4Var;
                if (c0VarR.D(d4Var2)) {
                }
                i12 |= i20;
            } else {
                d4Var2 = d4Var;
            }
            i12 |= i20;
        } else {
            d4Var2 = d4Var;
        }
        if ((196608 & i10) == 0) {
            if ((i11 & 32) == 0) {
                f4VarF = f4Var;
                if (c0VarR.D(f4VarF)) {
                }
                i12 |= i21;
            } else {
                f4VarF = f4Var;
            }
            i12 |= i21;
        } else {
            f4VarF = f4Var;
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
                    if (c0VarR.k0(nVar)) {
                        i17 = 8388608;
                    } else {
                        i17 = 4194304;
                    }
                    i12 |= i17;
                }
                if ((4793491 & i12) != 4793490) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i18 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            q3VarJ = e4.f27241a.j(c0VarR, 6);
                        }
                        if ((i11 & 16) != 0) {
                            d4VarD = e4.f27241a.d(c0VarR, 6);
                            i12 &= -57345;
                        } else {
                            d4VarD = d4Var2;
                        }
                        if ((i11 & 32) != 0) {
                            c0Var3 = c0VarR;
                            i12 &= -458753;
                            f4VarF = e4.f27241a.f(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0Var3, 1572864, 63);
                        } else {
                            c0Var3 = c0VarR;
                        }
                        if (i15 != 0) {
                            jVar4 = null;
                        } else {
                            jVar4 = jVar;
                        }
                        a0Var4 = a0Var2;
                    } else {
                        if (i18 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            q3VarJ = e4.f27241a.j(c0VarR, 6);
                        }
                        if ((i11 & 16) != 0) {
                            d4VarD = e4.f27241a.d(c0VarR, 6);
                            i12 &= -57345;
                        } else {
                            d4VarD = d4Var2;
                        }
                        if ((i11 & 32) != 0) {
                            c0Var3 = c0VarR;
                            i12 &= -458753;
                            f4VarF = e4.f27241a.f(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0Var3, 1572864, 63);
                        } else {
                            c0Var3 = c0VarR;
                        }
                        if (i15 != 0) {
                            jVar4 = null;
                        } else {
                            jVar4 = jVar;
                        }
                        a0Var4 = a0Var2;
                    }
                    c0Var3.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-129138571, i12, -1, "androidx.compose.material3.ElevatedCard (Card.kt:250)");
                    }
                    int i214 = i12 << 3;
                    h(function1, a0Var4, z11, q3VarJ, d4VarD, f4VarF, null, jVar4, nVar, c0Var3, (i12 & 14) | 1572864 | (i12 & com.planner5d.library.engine.input.f.b.B) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (458752 & i12) | (29360128 & i214) | (i214 & 234881024), 0);
                    androidx.compose.foundation.interaction.j jVar17 = jVar4;
                    c0Var2 = c0Var3;
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    jVar3 = jVar17;
                    a0Var3 = a0Var4;
                    z13 = z11;
                    q3Var2 = q3VarJ;
                    d4Var3 = d4VarD;
                    f4Var2 = f4VarF;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var3 = a0Var2;
                    z13 = z11;
                    q3Var2 = q3VarJ;
                    d4Var3 = d4Var2;
                    f4Var2 = f4VarF;
                    jVar3 = jVar;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.j4
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return m4.n(function0, a0Var3, z13, q3Var2, d4Var3, f4Var2, jVar3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 12582912;
            if ((4793491 & i12) != 4793490) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        q3VarJ = e4.f27241a.j(c0VarR, 6);
                    }
                    if ((i11 & 16) != 0) {
                        d4VarD = e4.f27241a.d(c0VarR, 6);
                        i12 &= -57345;
                    } else {
                        d4VarD = d4Var2;
                    }
                    if ((i11 & 32) != 0) {
                        c0Var3 = c0VarR;
                        i12 &= -458753;
                        f4VarF = e4.f27241a.f(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0Var3, 1572864, 63);
                    } else {
                        c0Var3 = c0VarR;
                    }
                    if (i15 != 0) {
                        jVar4 = null;
                    } else {
                        jVar4 = jVar;
                    }
                    a0Var4 = a0Var2;
                } else {
                    if (i18 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        q3VarJ = e4.f27241a.j(c0VarR, 6);
                    }
                    if ((i11 & 16) != 0) {
                        d4VarD = e4.f27241a.d(c0VarR, 6);
                        i12 &= -57345;
                    } else {
                        d4VarD = d4Var2;
                    }
                    if ((i11 & 32) != 0) {
                        c0Var3 = c0VarR;
                        i12 &= -458753;
                        f4VarF = e4.f27241a.f(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0Var3, 1572864, 63);
                    } else {
                        c0Var3 = c0VarR;
                    }
                    if (i15 != 0) {
                        jVar4 = null;
                    } else {
                        jVar4 = jVar;
                    }
                    a0Var4 = a0Var2;
                }
                c0Var3.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-129138571, i12, -1, "androidx.compose.material3.ElevatedCard (Card.kt:250)");
                }
                int i215 = i12 << 3;
                h(function1, a0Var4, z11, q3VarJ, d4VarD, f4VarF, null, jVar4, nVar, c0Var3, (i12 & 14) | 1572864 | (i12 & com.planner5d.library.engine.input.f.b.B) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (458752 & i12) | (29360128 & i215) | (i215 & 234881024), 0);
                androidx.compose.foundation.interaction.j jVar18 = jVar4;
                c0Var2 = c0Var3;
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                jVar3 = jVar18;
                a0Var3 = a0Var4;
                z13 = z11;
                q3Var2 = q3VarJ;
                d4Var3 = d4VarD;
                f4Var2 = f4VarF;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var3 = a0Var2;
                z13 = z11;
                q3Var2 = q3VarJ;
                d4Var3 = d4Var2;
                f4Var2 = f4VarF;
                jVar3 = jVar;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.j4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return m4.n(function0, a0Var3, z13, q3Var2, d4Var3, f4Var2, jVar3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 1572864;
        jVar2 = jVar;
        if ((i11 & 128) != 0) {
            if ((i10 & 12582912) == 0) {
                if (c0VarR.k0(nVar)) {
                    i17 = 8388608;
                } else {
                    i17 = 4194304;
                }
                i12 |= i17;
            }
            if ((4793491 & i12) != 4793490) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        q3VarJ = e4.f27241a.j(c0VarR, 6);
                    }
                    if ((i11 & 16) != 0) {
                        d4VarD = e4.f27241a.d(c0VarR, 6);
                        i12 &= -57345;
                    } else {
                        d4VarD = d4Var2;
                    }
                    if ((i11 & 32) != 0) {
                        c0Var3 = c0VarR;
                        i12 &= -458753;
                        f4VarF = e4.f27241a.f(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0Var3, 1572864, 63);
                    } else {
                        c0Var3 = c0VarR;
                    }
                    if (i15 != 0) {
                        jVar4 = null;
                    } else {
                        jVar4 = jVar;
                    }
                    a0Var4 = a0Var2;
                } else {
                    if (i18 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        q3VarJ = e4.f27241a.j(c0VarR, 6);
                    }
                    if ((i11 & 16) != 0) {
                        d4VarD = e4.f27241a.d(c0VarR, 6);
                        i12 &= -57345;
                    } else {
                        d4VarD = d4Var2;
                    }
                    if ((i11 & 32) != 0) {
                        c0Var3 = c0VarR;
                        i12 &= -458753;
                        f4VarF = e4.f27241a.f(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0Var3, 1572864, 63);
                    } else {
                        c0Var3 = c0VarR;
                    }
                    if (i15 != 0) {
                        jVar4 = null;
                    } else {
                        jVar4 = jVar;
                    }
                    a0Var4 = a0Var2;
                }
                c0Var3.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-129138571, i12, -1, "androidx.compose.material3.ElevatedCard (Card.kt:250)");
                }
                int i216 = i12 << 3;
                h(function1, a0Var4, z11, q3VarJ, d4VarD, f4VarF, null, jVar4, nVar, c0Var3, (i12 & 14) | 1572864 | (i12 & com.planner5d.library.engine.input.f.b.B) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (458752 & i12) | (29360128 & i216) | (i216 & 234881024), 0);
                androidx.compose.foundation.interaction.j jVar19 = jVar4;
                c0Var2 = c0Var3;
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                jVar3 = jVar19;
                a0Var3 = a0Var4;
                z13 = z11;
                q3Var2 = q3VarJ;
                d4Var3 = d4VarD;
                f4Var2 = f4VarF;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var3 = a0Var2;
                z13 = z11;
                q3Var2 = q3VarJ;
                d4Var3 = d4Var2;
                f4Var2 = f4VarF;
                jVar3 = jVar;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.j4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return m4.n(function0, a0Var3, z13, q3Var2, d4Var3, f4Var2, jVar3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 12582912;
        if ((4793491 & i12) != 4793490) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (c0VarR.h(z12, i12 & 1)) {
            c0VarR.l0();
            if ((i10 & 1) != 0) {
                if (i18 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                }
                if (i13 != 0) {
                    z11 = true;
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    q3VarJ = e4.f27241a.j(c0VarR, 6);
                }
                if ((i11 & 16) != 0) {
                    d4VarD = e4.f27241a.d(c0VarR, 6);
                    i12 &= -57345;
                } else {
                    d4VarD = d4Var2;
                }
                if ((i11 & 32) != 0) {
                    c0Var3 = c0VarR;
                    i12 &= -458753;
                    f4VarF = e4.f27241a.f(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0Var3, 1572864, 63);
                } else {
                    c0Var3 = c0VarR;
                }
                if (i15 != 0) {
                    jVar4 = null;
                } else {
                    jVar4 = jVar;
                }
                a0Var4 = a0Var2;
            } else {
                if (i18 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                }
                if (i13 != 0) {
                    z11 = true;
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    q3VarJ = e4.f27241a.j(c0VarR, 6);
                }
                if ((i11 & 16) != 0) {
                    d4VarD = e4.f27241a.d(c0VarR, 6);
                    i12 &= -57345;
                } else {
                    d4VarD = d4Var2;
                }
                if ((i11 & 32) != 0) {
                    c0Var3 = c0VarR;
                    i12 &= -458753;
                    f4VarF = e4.f27241a.f(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0Var3, 1572864, 63);
                } else {
                    c0Var3 = c0VarR;
                }
                if (i15 != 0) {
                    jVar4 = null;
                } else {
                    jVar4 = jVar;
                }
                a0Var4 = a0Var2;
            }
            c0Var3.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-129138571, i12, -1, "androidx.compose.material3.ElevatedCard (Card.kt:250)");
            }
            int i217 = i12 << 3;
            h(function1, a0Var4, z11, q3VarJ, d4VarD, f4VarF, null, jVar4, nVar, c0Var3, (i12 & 14) | 1572864 | (i12 & com.planner5d.library.engine.input.f.b.B) | (i12 & 896) | (i12 & 7168) | (57344 & i12) | (458752 & i12) | (29360128 & i217) | (i217 & 234881024), 0);
            androidx.compose.foundation.interaction.j jVar110 = jVar4;
            c0Var2 = c0Var3;
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            jVar3 = jVar110;
            a0Var3 = a0Var4;
            z13 = z11;
            q3Var2 = q3VarJ;
            d4Var3 = d4VarD;
            f4Var2 = f4VarF;
        } else {
            c0Var2 = c0VarR;
            c0Var2.u();
            a0Var3 = a0Var2;
            z13 = z11;
            q3Var2 = q3VarJ;
            d4Var3 = d4Var2;
            f4Var2 = f4VarF;
            jVar3 = jVar;
        }
        s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.j4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return m4.n(function0, a0Var3, z13, q3Var2, d4Var3, f4Var2, jVar3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(androidx.compose.ui.a0 a0Var, androidx.compose.ui.graphics.q3 q3Var, d4 d4Var, f4 f4Var, pj.n nVar, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        k(a0Var, q3Var, d4Var, f4Var, nVar, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n(Function0 function0, androidx.compose.ui.a0 a0Var, boolean z10, androidx.compose.ui.graphics.q3 q3Var, d4 d4Var, f4 f4Var, androidx.compose.foundation.interaction.j jVar, pj.n nVar, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        l(function0, a0Var, z10, q3Var, d4Var, f4Var, jVar, nVar, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x011f  */
    /* JADX WARN: Code duplicated, block: B:102:0x0128  */
    /* JADX WARN: Code duplicated, block: B:105:0x012d  */
    /* JADX WARN: Code duplicated, block: B:106:0x014a  */
    /* JADX WARN: Code duplicated, block: B:109:0x0151  */
    /* JADX WARN: Code duplicated, block: B:111:0x0163  */
    /* JADX WARN: Code duplicated, block: B:114:0x0172  */
    /* JADX WARN: Code duplicated, block: B:117:0x018c  */
    /* JADX WARN: Code duplicated, block: B:119:0x0198  */
    /* JADX WARN: Code duplicated, block: B:122:0x01ab  */
    /* JADX WARN: Code duplicated, block: B:124:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:70:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:74:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:92:0x0105 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:93:0x0107  */
    /* JADX WARN: Code duplicated, block: B:94:0x010a  */
    /* JADX WARN: Code duplicated, block: B:97:0x0111  */
    /* JADX WARN: Code duplicated, block: B:98:0x011a  */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void o(@Nullable androidx.compose.ui.a0 a0Var, @Nullable androidx.compose.ui.graphics.q3 q3Var, @Nullable d4 d4Var, @Nullable f4 f4Var, @Nullable androidx.compose.foundation.a1 a1Var, @NotNull final pj.n<? super androidx.compose.foundation.layout.m0, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        androidx.compose.ui.a0 a0Var2;
        int i12;
        androidx.compose.ui.graphics.q3 q3Var2;
        d4 d4Var2;
        f4 f4VarP;
        androidx.compose.foundation.a1 a1Var2;
        boolean z10;
        androidx.compose.runtime.c0 c0Var2;
        final androidx.compose.ui.a0 a0Var3;
        final androidx.compose.ui.graphics.q3 q3Var3;
        final d4 d4Var3;
        final f4 f4Var2;
        final androidx.compose.foundation.a1 a1Var3;
        androidx.compose.runtime.s5 s5VarT;
        androidx.compose.ui.a0 a0Var4;
        androidx.compose.ui.graphics.q3 q3VarK;
        d4 d4VarN;
        int i13;
        androidx.compose.runtime.c0 c0Var3;
        androidx.compose.foundation.a1 a1VarM;
        f4 f4Var3;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1945643296);
        int i14 = i11 & 1;
        if (i14 != 0) {
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
                q3Var2 = q3Var;
                int i15 = c0VarR.D(q3Var2) ? 32 : 16;
                i12 |= i15;
            } else {
                q3Var2 = q3Var;
            }
            i12 |= i15;
        } else {
            q3Var2 = q3Var;
        }
        if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
            if ((i11 & 4) == 0) {
                d4Var2 = d4Var;
                int i16 = c0VarR.D(d4Var2) ? 256 : 128;
                i12 |= i16;
            } else {
                d4Var2 = d4Var;
            }
            i12 |= i16;
        } else {
            d4Var2 = d4Var;
        }
        if ((i10 & 3072) == 0) {
            if ((i11 & 8) == 0) {
                f4VarP = f4Var;
                int i17 = c0VarR.D(f4VarP) ? 2048 : 1024;
                i12 |= i17;
            } else {
                f4VarP = f4Var;
            }
            i12 |= i17;
        } else {
            f4VarP = f4Var;
        }
        if ((i10 & 24576) == 0) {
            if ((i11 & 16) == 0) {
                a1Var2 = a1Var;
                int i18 = c0VarR.D(a1Var2) ? 16384 : 8192;
                i12 |= i18;
            } else {
                a1Var2 = a1Var;
            }
            i12 |= i18;
        } else {
            a1Var2 = a1Var;
        }
        if ((i11 & 32) == 0) {
            if ((i10 & androidx.profileinstaller.n.c.f73814m) == 0) {
                i12 |= c0VarR.k0(nVar) ? 131072 : 65536;
            }
            if ((74899 & i12) != 74898) {
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
                    if ((i11 & 2) != 0) {
                        q3VarK = e4.f27241a.k(c0VarR, 6);
                        i12 &= -113;
                    } else {
                        q3VarK = q3Var2;
                    }
                    if ((i11 & 4) != 0) {
                        d4VarN = e4.f27241a.n(c0VarR, 6);
                        i12 &= -897;
                    } else {
                        d4VarN = d4Var2;
                    }
                    if ((i11 & 8) != 0) {
                        c0Var3 = c0VarR;
                        i12 &= -7169;
                        i13 = 1;
                        f4VarP = e4.f27241a.p(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0Var3, 1572864, 63);
                    } else {
                        i13 = 1;
                        c0Var3 = c0VarR;
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        a1VarM = e4.f27241a.m(false, c0Var3, 48, i13);
                    } else {
                        a1VarM = a1Var;
                    }
                    f4Var3 = f4VarP;
                } else {
                    c0VarR.u();
                    if ((i11 & 2) != 0) {
                        i12 &= -113;
                    }
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                    }
                    q3VarK = q3Var2;
                    d4VarN = d4Var2;
                    f4Var3 = f4VarP;
                    a1VarM = a1Var2;
                    c0Var3 = c0VarR;
                    a0Var4 = a0Var2;
                }
                c0Var3.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1945643296, i12, -1, "androidx.compose.material3.OutlinedCard (Card.kt:298)");
                }
                androidx.compose.runtime.c0 c0Var4 = c0Var3;
                g(a0Var4, q3VarK, d4VarN, f4Var3, a1VarM, nVar, c0Var4, 524286 & i12, 0);
                c0Var2 = c0Var4;
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var4;
                q3Var3 = q3VarK;
                d4Var3 = d4VarN;
                f4Var2 = f4Var3;
                a1Var3 = a1VarM;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var3 = a0Var2;
                q3Var3 = q3Var2;
                d4Var3 = d4Var2;
                f4Var2 = f4VarP;
                a1Var3 = a1Var;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.h4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return m4.q(a0Var3, q3Var3, d4Var3, f4Var2, a1Var3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= androidx.profileinstaller.n.c.f73814m;
        if ((74899 & i12) != 74898) {
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
                if ((i11 & 2) != 0) {
                    q3VarK = e4.f27241a.k(c0VarR, 6);
                    i12 &= -113;
                } else {
                    q3VarK = q3Var2;
                }
                if ((i11 & 4) != 0) {
                    d4VarN = e4.f27241a.n(c0VarR, 6);
                    i12 &= -897;
                } else {
                    d4VarN = d4Var2;
                }
                if ((i11 & 8) != 0) {
                    c0Var3 = c0VarR;
                    i12 &= -7169;
                    i13 = 1;
                    f4VarP = e4.f27241a.p(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0Var3, 1572864, 63);
                } else {
                    i13 = 1;
                    c0Var3 = c0VarR;
                }
                if ((i11 & 16) != 0) {
                    i12 &= -57345;
                    a1VarM = e4.f27241a.m(false, c0Var3, 48, i13);
                } else {
                    a1VarM = a1Var;
                }
                f4Var3 = f4VarP;
            } else {
                if (i14 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if ((i11 & 2) != 0) {
                    q3VarK = e4.f27241a.k(c0VarR, 6);
                    i12 &= -113;
                } else {
                    q3VarK = q3Var2;
                }
                if ((i11 & 4) != 0) {
                    d4VarN = e4.f27241a.n(c0VarR, 6);
                    i12 &= -897;
                } else {
                    d4VarN = d4Var2;
                }
                if ((i11 & 8) != 0) {
                    c0Var3 = c0VarR;
                    i12 &= -7169;
                    i13 = 1;
                    f4VarP = e4.f27241a.p(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0Var3, 1572864, 63);
                } else {
                    i13 = 1;
                    c0Var3 = c0VarR;
                }
                if ((i11 & 16) != 0) {
                    i12 &= -57345;
                    a1VarM = e4.f27241a.m(false, c0Var3, 48, i13);
                } else {
                    a1VarM = a1Var;
                }
                f4Var3 = f4VarP;
            }
            c0Var3.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1945643296, i12, -1, "androidx.compose.material3.OutlinedCard (Card.kt:298)");
            }
            androidx.compose.runtime.c0 c0Var5 = c0Var3;
            g(a0Var4, q3VarK, d4VarN, f4Var3, a1VarM, nVar, c0Var5, 524286 & i12, 0);
            c0Var2 = c0Var5;
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            a0Var3 = a0Var4;
            q3Var3 = q3VarK;
            d4Var3 = d4VarN;
            f4Var2 = f4Var3;
            a1Var3 = a1VarM;
        } else {
            c0Var2 = c0VarR;
            c0Var2.u();
            a0Var3 = a0Var2;
            q3Var3 = q3Var2;
            d4Var3 = d4Var2;
            f4Var2 = f4VarP;
            a1Var3 = a1Var;
        }
        s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.h4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return m4.q(a0Var3, q3Var3, d4Var3, f4Var2, a1Var3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0128  */
    /* JADX WARN: Code duplicated, block: B:104:0x012b  */
    /* JADX WARN: Code duplicated, block: B:107:0x0135  */
    /* JADX WARN: Code duplicated, block: B:109:0x0145  */
    /* JADX WARN: Code duplicated, block: B:125:0x017b A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:126:0x017d  */
    /* JADX WARN: Code duplicated, block: B:128:0x0183  */
    /* JADX WARN: Code duplicated, block: B:131:0x018c  */
    /* JADX WARN: Code duplicated, block: B:134:0x019a  */
    /* JADX WARN: Code duplicated, block: B:137:0x01a8  */
    /* JADX WARN: Code duplicated, block: B:138:0x01c7  */
    /* JADX WARN: Code duplicated, block: B:141:0x01cf  */
    /* JADX WARN: Code duplicated, block: B:142:0x01df  */
    /* JADX WARN: Code duplicated, block: B:144:0x01e3  */
    /* JADX WARN: Code duplicated, block: B:146:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:149:0x0202  */
    /* JADX WARN: Code duplicated, block: B:152:0x0225  */
    /* JADX WARN: Code duplicated, block: B:154:0x0239  */
    /* JADX WARN: Code duplicated, block: B:157:0x024f  */
    /* JADX WARN: Code duplicated, block: B:159:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x004e  */
    /* JADX WARN: Code duplicated, block: B:28:0x0053  */
    /* JADX WARN: Code duplicated, block: B:30:0x0057  */
    /* JADX WARN: Code duplicated, block: B:32:0x005f  */
    /* JADX WARN: Code duplicated, block: B:33:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x0069  */
    /* JADX WARN: Code duplicated, block: B:39:0x006d  */
    /* JADX WARN: Code duplicated, block: B:41:0x0075  */
    /* JADX WARN: Code duplicated, block: B:42:0x0078  */
    /* JADX WARN: Code duplicated, block: B:45:0x007e  */
    /* JADX WARN: Code duplicated, block: B:48:0x0086  */
    /* JADX WARN: Code duplicated, block: B:50:0x008a  */
    /* JADX WARN: Code duplicated, block: B:52:0x0092  */
    /* JADX WARN: Code duplicated, block: B:53:0x0095  */
    /* JADX WARN: Code duplicated, block: B:56:0x009d  */
    /* JADX WARN: Code duplicated, block: B:59:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:61:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b2  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:67:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d5 A[ADDED_TO_REGION] */
    /* JADX WARN: Code duplicated, block: B:78:0x00db  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e3  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:85:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f4  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:92:0x0101  */
    /* JADX WARN: Code duplicated, block: B:94:0x0108  */
    /* JADX WARN: Code duplicated, block: B:96:0x010c  */
    /* JADX WARN: Code duplicated, block: B:98:0x0114  */
    /* JADX WARN: Code duplicated, block: B:99:0x0117  */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void p(@NotNull final Function0<Unit> function0, @Nullable androidx.compose.ui.a0 a0Var, boolean z10, @Nullable androidx.compose.ui.graphics.q3 q3Var, @Nullable d4 d4Var, @Nullable f4 f4Var, @Nullable androidx.compose.foundation.a1 a1Var, @Nullable androidx.compose.foundation.interaction.j jVar, @NotNull final pj.n<? super androidx.compose.foundation.layout.m0, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        androidx.compose.ui.a0 a0Var2;
        int i13;
        boolean z11;
        int i14;
        androidx.compose.ui.graphics.q3 q3VarK;
        d4 d4VarN;
        f4 f4VarP;
        int i15;
        androidx.compose.foundation.interaction.j jVar2;
        int i16;
        int i17;
        boolean z12;
        androidx.compose.runtime.c0 c0Var2;
        final androidx.compose.ui.a0 a0Var3;
        final boolean z13;
        final androidx.compose.ui.graphics.q3 q3Var2;
        final d4 d4Var2;
        final f4 f4Var2;
        final androidx.compose.foundation.a1 a1Var2;
        final androidx.compose.foundation.interaction.j jVar3;
        androidx.compose.runtime.s5 s5VarT;
        androidx.compose.runtime.c0 c0Var3;
        androidx.compose.foundation.a1 a1VarM;
        androidx.compose.foundation.interaction.j jVar4;
        androidx.compose.ui.a0 a0Var4;
        boolean z14;
        androidx.compose.ui.graphics.q3 q3Var3;
        d4 d4Var3;
        f4 f4Var3;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1401605899);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c0VarR.k0(function0) ? 4 : 2) | i10;
        } else {
            i12 = i10;
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
                        q3VarK = q3Var;
                        int i19 = c0VarR.D(q3VarK) ? 2048 : 1024;
                        i12 |= i19;
                    } else {
                        q3VarK = q3Var;
                    }
                    i12 |= i19;
                } else {
                    q3VarK = q3Var;
                }
                if ((i10 & 24576) == 0) {
                    if ((i11 & 16) == 0) {
                        d4VarN = d4Var;
                        int i20 = c0VarR.D(d4VarN) ? 16384 : 8192;
                        i12 |= i20;
                    } else {
                        d4VarN = d4Var;
                    }
                    i12 |= i20;
                } else {
                    d4VarN = d4Var;
                }
                if ((196608 & i10) == 0) {
                    if ((i11 & 32) == 0) {
                        f4VarP = f4Var;
                        int i21 = c0VarR.D(f4VarP) ? 131072 : 65536;
                        i12 |= i21;
                    } else {
                        f4VarP = f4Var;
                    }
                    i12 |= i21;
                } else {
                    f4VarP = f4Var;
                }
                if ((1572864 & i10) != 0) {
                    i12 |= ((i11 & 64) == 0 || !c0VarR.D(a1Var)) ? 524288 : 1048576;
                }
                i15 = i11 & 128;
                if (i15 != 0) {
                    if ((12582912 & i10) == 0) {
                        jVar2 = jVar;
                        if (c0VarR.D(jVar2)) {
                            i16 = 8388608;
                        } else {
                            i16 = 4194304;
                        }
                        i12 |= i16;
                    }
                    if ((i11 & 256) != 0) {
                        if ((i10 & 100663296) == 0) {
                            if (c0VarR.k0(nVar)) {
                                i17 = 67108864;
                            } else {
                                i17 = com.google.api.client.googleapis.media.a.f115410j;
                            }
                            i12 |= i17;
                        }
                        if ((i12 & 38347923) != 38347922) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        if (c0VarR.h(z12, i12 & 1)) {
                            c0VarR.l0();
                            if ((i10 & 1) != 0 || c0VarR.y()) {
                                if (i18 != 0) {
                                    a0Var2 = androidx.compose.ui.a0.E;
                                }
                                if (i13 != 0) {
                                    z11 = true;
                                }
                                if ((i11 & 8) != 0) {
                                    i12 &= -7169;
                                    q3VarK = e4.f27241a.k(c0VarR, 6);
                                }
                                if ((i11 & 16) != 0) {
                                    i12 &= -57345;
                                    d4VarN = e4.f27241a.n(c0VarR, 6);
                                }
                                if ((i11 & 32) != 0) {
                                    c0Var3 = c0VarR;
                                    i12 &= -458753;
                                    f4VarP = e4.f27241a.p(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 1572864, 63);
                                } else {
                                    c0Var3 = c0VarR;
                                }
                                if ((i11 & 64) != 0) {
                                    a1VarM = e4.f27241a.m(z11, c0Var3, ((i12 >> 6) & 14) | 48, 0);
                                    i12 &= -3670017;
                                } else {
                                    a1VarM = a1Var;
                                }
                                if (i15 != 0) {
                                    jVar4 = null;
                                } else {
                                    jVar4 = jVar;
                                }
                                a0Var4 = a0Var2;
                                z14 = z11;
                                q3Var3 = q3VarK;
                                d4Var3 = d4VarN;
                                f4Var3 = f4VarP;
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
                                a1VarM = a1Var;
                                c0Var3 = c0VarR;
                                a0Var4 = a0Var2;
                                z14 = z11;
                                d4Var3 = d4VarN;
                                f4Var3 = f4VarP;
                                jVar4 = jVar2;
                                q3Var3 = q3VarK;
                            }
                            c0Var3.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(1401605899, i12, -1, "androidx.compose.material3.OutlinedCard (Card.kt:353)");
                            }
                            c0Var2 = c0Var3;
                            h(function0, a0Var4, z14, q3Var3, d4Var3, f4Var3, a1VarM, jVar4, nVar, c0Var2, i12 & 268435454, 0);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            a0Var3 = a0Var4;
                            z13 = z14;
                            q3Var2 = q3Var3;
                            d4Var2 = d4Var3;
                            f4Var2 = f4Var3;
                            a1Var2 = a1VarM;
                            jVar3 = jVar4;
                        } else {
                            c0Var2 = c0VarR;
                            c0Var2.u();
                            a0Var3 = a0Var2;
                            z13 = z11;
                            q3Var2 = q3VarK;
                            d4Var2 = d4VarN;
                            f4Var2 = f4VarP;
                            a1Var2 = a1Var;
                            jVar3 = jVar;
                        }
                        s5VarT = c0Var2.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.material3.l4
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return m4.r(function0, a0Var3, z13, q3Var2, d4Var2, f4Var2, a1Var2, jVar3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i12 |= 100663296;
                    if ((i12 & 38347923) != 38347922) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (c0VarR.h(z12, i12 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i18 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            }
                            if ((i11 & 8) != 0) {
                                i12 &= -7169;
                                q3VarK = e4.f27241a.k(c0VarR, 6);
                            }
                            if ((i11 & 16) != 0) {
                                i12 &= -57345;
                                d4VarN = e4.f27241a.n(c0VarR, 6);
                            }
                            if ((i11 & 32) != 0) {
                                c0Var3 = c0VarR;
                                i12 &= -458753;
                                f4VarP = e4.f27241a.p(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 1572864, 63);
                            } else {
                                c0Var3 = c0VarR;
                            }
                            if ((i11 & 64) != 0) {
                                a1VarM = e4.f27241a.m(z11, c0Var3, ((i12 >> 6) & 14) | 48, 0);
                                i12 &= -3670017;
                            } else {
                                a1VarM = a1Var;
                            }
                            if (i15 != 0) {
                                jVar4 = null;
                            } else {
                                jVar4 = jVar;
                            }
                            a0Var4 = a0Var2;
                            z14 = z11;
                            q3Var3 = q3VarK;
                            d4Var3 = d4VarN;
                            f4Var3 = f4VarP;
                        } else {
                            if (i18 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            }
                            if ((i11 & 8) != 0) {
                                i12 &= -7169;
                                q3VarK = e4.f27241a.k(c0VarR, 6);
                            }
                            if ((i11 & 16) != 0) {
                                i12 &= -57345;
                                d4VarN = e4.f27241a.n(c0VarR, 6);
                            }
                            if ((i11 & 32) != 0) {
                                c0Var3 = c0VarR;
                                i12 &= -458753;
                                f4VarP = e4.f27241a.p(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 1572864, 63);
                            } else {
                                c0Var3 = c0VarR;
                            }
                            if ((i11 & 64) != 0) {
                                a1VarM = e4.f27241a.m(z11, c0Var3, ((i12 >> 6) & 14) | 48, 0);
                                i12 &= -3670017;
                            } else {
                                a1VarM = a1Var;
                            }
                            if (i15 != 0) {
                                jVar4 = null;
                            } else {
                                jVar4 = jVar;
                            }
                            a0Var4 = a0Var2;
                            z14 = z11;
                            q3Var3 = q3VarK;
                            d4Var3 = d4VarN;
                            f4Var3 = f4VarP;
                        }
                        c0Var3.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(1401605899, i12, -1, "androidx.compose.material3.OutlinedCard (Card.kt:353)");
                        }
                        c0Var2 = c0Var3;
                        h(function0, a0Var4, z14, q3Var3, d4Var3, f4Var3, a1VarM, jVar4, nVar, c0Var2, i12 & 268435454, 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var4;
                        z13 = z14;
                        q3Var2 = q3Var3;
                        d4Var2 = d4Var3;
                        f4Var2 = f4Var3;
                        a1Var2 = a1VarM;
                        jVar3 = jVar4;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        a0Var3 = a0Var2;
                        z13 = z11;
                        q3Var2 = q3VarK;
                        d4Var2 = d4VarN;
                        f4Var2 = f4VarP;
                        a1Var2 = a1Var;
                        jVar3 = jVar;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.l4
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return m4.r(function0, a0Var3, z13, q3Var2, d4Var2, f4Var2, a1Var2, jVar3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 12582912;
                jVar2 = jVar;
                if ((i11 & 256) != 0) {
                    if ((i10 & 100663296) == 0) {
                        if (c0VarR.k0(nVar)) {
                            i17 = 67108864;
                        } else {
                            i17 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i12 |= i17;
                    }
                    if ((i12 & 38347923) != 38347922) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (c0VarR.h(z12, i12 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i18 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            }
                            if ((i11 & 8) != 0) {
                                i12 &= -7169;
                                q3VarK = e4.f27241a.k(c0VarR, 6);
                            }
                            if ((i11 & 16) != 0) {
                                i12 &= -57345;
                                d4VarN = e4.f27241a.n(c0VarR, 6);
                            }
                            if ((i11 & 32) != 0) {
                                c0Var3 = c0VarR;
                                i12 &= -458753;
                                f4VarP = e4.f27241a.p(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 1572864, 63);
                            } else {
                                c0Var3 = c0VarR;
                            }
                            if ((i11 & 64) != 0) {
                                a1VarM = e4.f27241a.m(z11, c0Var3, ((i12 >> 6) & 14) | 48, 0);
                                i12 &= -3670017;
                            } else {
                                a1VarM = a1Var;
                            }
                            if (i15 != 0) {
                                jVar4 = null;
                            } else {
                                jVar4 = jVar;
                            }
                            a0Var4 = a0Var2;
                            z14 = z11;
                            q3Var3 = q3VarK;
                            d4Var3 = d4VarN;
                            f4Var3 = f4VarP;
                        } else {
                            if (i18 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            }
                            if ((i11 & 8) != 0) {
                                i12 &= -7169;
                                q3VarK = e4.f27241a.k(c0VarR, 6);
                            }
                            if ((i11 & 16) != 0) {
                                i12 &= -57345;
                                d4VarN = e4.f27241a.n(c0VarR, 6);
                            }
                            if ((i11 & 32) != 0) {
                                c0Var3 = c0VarR;
                                i12 &= -458753;
                                f4VarP = e4.f27241a.p(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 1572864, 63);
                            } else {
                                c0Var3 = c0VarR;
                            }
                            if ((i11 & 64) != 0) {
                                a1VarM = e4.f27241a.m(z11, c0Var3, ((i12 >> 6) & 14) | 48, 0);
                                i12 &= -3670017;
                            } else {
                                a1VarM = a1Var;
                            }
                            if (i15 != 0) {
                                jVar4 = null;
                            } else {
                                jVar4 = jVar;
                            }
                            a0Var4 = a0Var2;
                            z14 = z11;
                            q3Var3 = q3VarK;
                            d4Var3 = d4VarN;
                            f4Var3 = f4VarP;
                        }
                        c0Var3.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(1401605899, i12, -1, "androidx.compose.material3.OutlinedCard (Card.kt:353)");
                        }
                        c0Var2 = c0Var3;
                        h(function0, a0Var4, z14, q3Var3, d4Var3, f4Var3, a1VarM, jVar4, nVar, c0Var2, i12 & 268435454, 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var4;
                        z13 = z14;
                        q3Var2 = q3Var3;
                        d4Var2 = d4Var3;
                        f4Var2 = f4Var3;
                        a1Var2 = a1VarM;
                        jVar3 = jVar4;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        a0Var3 = a0Var2;
                        z13 = z11;
                        q3Var2 = q3VarK;
                        d4Var2 = d4VarN;
                        f4Var2 = f4VarP;
                        a1Var2 = a1Var;
                        jVar3 = jVar;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.l4
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return m4.r(function0, a0Var3, z13, q3Var2, d4Var2, f4Var2, a1Var2, jVar3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 100663296;
                if ((i12 & 38347923) != 38347922) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i18 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            q3VarK = e4.f27241a.k(c0VarR, 6);
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                            d4VarN = e4.f27241a.n(c0VarR, 6);
                        }
                        if ((i11 & 32) != 0) {
                            c0Var3 = c0VarR;
                            i12 &= -458753;
                            f4VarP = e4.f27241a.p(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 1572864, 63);
                        } else {
                            c0Var3 = c0VarR;
                        }
                        if ((i11 & 64) != 0) {
                            a1VarM = e4.f27241a.m(z11, c0Var3, ((i12 >> 6) & 14) | 48, 0);
                            i12 &= -3670017;
                        } else {
                            a1VarM = a1Var;
                        }
                        if (i15 != 0) {
                            jVar4 = null;
                        } else {
                            jVar4 = jVar;
                        }
                        a0Var4 = a0Var2;
                        z14 = z11;
                        q3Var3 = q3VarK;
                        d4Var3 = d4VarN;
                        f4Var3 = f4VarP;
                    } else {
                        if (i18 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            q3VarK = e4.f27241a.k(c0VarR, 6);
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                            d4VarN = e4.f27241a.n(c0VarR, 6);
                        }
                        if ((i11 & 32) != 0) {
                            c0Var3 = c0VarR;
                            i12 &= -458753;
                            f4VarP = e4.f27241a.p(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 1572864, 63);
                        } else {
                            c0Var3 = c0VarR;
                        }
                        if ((i11 & 64) != 0) {
                            a1VarM = e4.f27241a.m(z11, c0Var3, ((i12 >> 6) & 14) | 48, 0);
                            i12 &= -3670017;
                        } else {
                            a1VarM = a1Var;
                        }
                        if (i15 != 0) {
                            jVar4 = null;
                        } else {
                            jVar4 = jVar;
                        }
                        a0Var4 = a0Var2;
                        z14 = z11;
                        q3Var3 = q3VarK;
                        d4Var3 = d4VarN;
                        f4Var3 = f4VarP;
                    }
                    c0Var3.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1401605899, i12, -1, "androidx.compose.material3.OutlinedCard (Card.kt:353)");
                    }
                    c0Var2 = c0Var3;
                    h(function0, a0Var4, z14, q3Var3, d4Var3, f4Var3, a1VarM, jVar4, nVar, c0Var2, i12 & 268435454, 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var4;
                    z13 = z14;
                    q3Var2 = q3Var3;
                    d4Var2 = d4Var3;
                    f4Var2 = f4Var3;
                    a1Var2 = a1VarM;
                    jVar3 = jVar4;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var3 = a0Var2;
                    z13 = z11;
                    q3Var2 = q3VarK;
                    d4Var2 = d4VarN;
                    f4Var2 = f4VarP;
                    a1Var2 = a1Var;
                    jVar3 = jVar;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.l4
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return m4.r(function0, a0Var3, z13, q3Var2, d4Var2, f4Var2, a1Var2, jVar3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= androidx.media3.exoplayer.a5.S0;
            z11 = z10;
            if ((i10 & 3072) == 0) {
                if ((i11 & 8) == 0) {
                    q3VarK = q3Var;
                    if (c0VarR.D(q3VarK)) {
                    }
                    i12 |= i19;
                } else {
                    q3VarK = q3Var;
                }
                i12 |= i19;
            } else {
                q3VarK = q3Var;
            }
            if ((i10 & 24576) == 0) {
                if ((i11 & 16) == 0) {
                    d4VarN = d4Var;
                    if (c0VarR.D(d4VarN)) {
                    }
                    i12 |= i20;
                } else {
                    d4VarN = d4Var;
                }
                i12 |= i20;
            } else {
                d4VarN = d4Var;
            }
            if ((196608 & i10) == 0) {
                if ((i11 & 32) == 0) {
                    f4VarP = f4Var;
                    if (c0VarR.D(f4VarP)) {
                    }
                    i12 |= i21;
                } else {
                    f4VarP = f4Var;
                }
                i12 |= i21;
            } else {
                f4VarP = f4Var;
            }
            if ((1572864 & i10) != 0) {
                i12 |= ((i11 & 64) == 0 || !c0VarR.D(a1Var)) ? 524288 : 1048576;
            }
            i15 = i11 & 128;
            if (i15 != 0) {
                if ((12582912 & i10) == 0) {
                    jVar2 = jVar;
                    if (c0VarR.D(jVar2)) {
                        i16 = 8388608;
                    } else {
                        i16 = 4194304;
                    }
                    i12 |= i16;
                }
                if ((i11 & 256) != 0) {
                    if ((i10 & 100663296) == 0) {
                        if (c0VarR.k0(nVar)) {
                            i17 = 67108864;
                        } else {
                            i17 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i12 |= i17;
                    }
                    if ((i12 & 38347923) != 38347922) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (c0VarR.h(z12, i12 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i18 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            }
                            if ((i11 & 8) != 0) {
                                i12 &= -7169;
                                q3VarK = e4.f27241a.k(c0VarR, 6);
                            }
                            if ((i11 & 16) != 0) {
                                i12 &= -57345;
                                d4VarN = e4.f27241a.n(c0VarR, 6);
                            }
                            if ((i11 & 32) != 0) {
                                c0Var3 = c0VarR;
                                i12 &= -458753;
                                f4VarP = e4.f27241a.p(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 1572864, 63);
                            } else {
                                c0Var3 = c0VarR;
                            }
                            if ((i11 & 64) != 0) {
                                a1VarM = e4.f27241a.m(z11, c0Var3, ((i12 >> 6) & 14) | 48, 0);
                                i12 &= -3670017;
                            } else {
                                a1VarM = a1Var;
                            }
                            if (i15 != 0) {
                                jVar4 = null;
                            } else {
                                jVar4 = jVar;
                            }
                            a0Var4 = a0Var2;
                            z14 = z11;
                            q3Var3 = q3VarK;
                            d4Var3 = d4VarN;
                            f4Var3 = f4VarP;
                        } else {
                            if (i18 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            }
                            if ((i11 & 8) != 0) {
                                i12 &= -7169;
                                q3VarK = e4.f27241a.k(c0VarR, 6);
                            }
                            if ((i11 & 16) != 0) {
                                i12 &= -57345;
                                d4VarN = e4.f27241a.n(c0VarR, 6);
                            }
                            if ((i11 & 32) != 0) {
                                c0Var3 = c0VarR;
                                i12 &= -458753;
                                f4VarP = e4.f27241a.p(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 1572864, 63);
                            } else {
                                c0Var3 = c0VarR;
                            }
                            if ((i11 & 64) != 0) {
                                a1VarM = e4.f27241a.m(z11, c0Var3, ((i12 >> 6) & 14) | 48, 0);
                                i12 &= -3670017;
                            } else {
                                a1VarM = a1Var;
                            }
                            if (i15 != 0) {
                                jVar4 = null;
                            } else {
                                jVar4 = jVar;
                            }
                            a0Var4 = a0Var2;
                            z14 = z11;
                            q3Var3 = q3VarK;
                            d4Var3 = d4VarN;
                            f4Var3 = f4VarP;
                        }
                        c0Var3.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(1401605899, i12, -1, "androidx.compose.material3.OutlinedCard (Card.kt:353)");
                        }
                        c0Var2 = c0Var3;
                        h(function0, a0Var4, z14, q3Var3, d4Var3, f4Var3, a1VarM, jVar4, nVar, c0Var2, i12 & 268435454, 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var4;
                        z13 = z14;
                        q3Var2 = q3Var3;
                        d4Var2 = d4Var3;
                        f4Var2 = f4Var3;
                        a1Var2 = a1VarM;
                        jVar3 = jVar4;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        a0Var3 = a0Var2;
                        z13 = z11;
                        q3Var2 = q3VarK;
                        d4Var2 = d4VarN;
                        f4Var2 = f4VarP;
                        a1Var2 = a1Var;
                        jVar3 = jVar;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.l4
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return m4.r(function0, a0Var3, z13, q3Var2, d4Var2, f4Var2, a1Var2, jVar3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 100663296;
                if ((i12 & 38347923) != 38347922) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i18 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            q3VarK = e4.f27241a.k(c0VarR, 6);
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                            d4VarN = e4.f27241a.n(c0VarR, 6);
                        }
                        if ((i11 & 32) != 0) {
                            c0Var3 = c0VarR;
                            i12 &= -458753;
                            f4VarP = e4.f27241a.p(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 1572864, 63);
                        } else {
                            c0Var3 = c0VarR;
                        }
                        if ((i11 & 64) != 0) {
                            a1VarM = e4.f27241a.m(z11, c0Var3, ((i12 >> 6) & 14) | 48, 0);
                            i12 &= -3670017;
                        } else {
                            a1VarM = a1Var;
                        }
                        if (i15 != 0) {
                            jVar4 = null;
                        } else {
                            jVar4 = jVar;
                        }
                        a0Var4 = a0Var2;
                        z14 = z11;
                        q3Var3 = q3VarK;
                        d4Var3 = d4VarN;
                        f4Var3 = f4VarP;
                    } else {
                        if (i18 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            q3VarK = e4.f27241a.k(c0VarR, 6);
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                            d4VarN = e4.f27241a.n(c0VarR, 6);
                        }
                        if ((i11 & 32) != 0) {
                            c0Var3 = c0VarR;
                            i12 &= -458753;
                            f4VarP = e4.f27241a.p(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 1572864, 63);
                        } else {
                            c0Var3 = c0VarR;
                        }
                        if ((i11 & 64) != 0) {
                            a1VarM = e4.f27241a.m(z11, c0Var3, ((i12 >> 6) & 14) | 48, 0);
                            i12 &= -3670017;
                        } else {
                            a1VarM = a1Var;
                        }
                        if (i15 != 0) {
                            jVar4 = null;
                        } else {
                            jVar4 = jVar;
                        }
                        a0Var4 = a0Var2;
                        z14 = z11;
                        q3Var3 = q3VarK;
                        d4Var3 = d4VarN;
                        f4Var3 = f4VarP;
                    }
                    c0Var3.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1401605899, i12, -1, "androidx.compose.material3.OutlinedCard (Card.kt:353)");
                    }
                    c0Var2 = c0Var3;
                    h(function0, a0Var4, z14, q3Var3, d4Var3, f4Var3, a1VarM, jVar4, nVar, c0Var2, i12 & 268435454, 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var4;
                    z13 = z14;
                    q3Var2 = q3Var3;
                    d4Var2 = d4Var3;
                    f4Var2 = f4Var3;
                    a1Var2 = a1VarM;
                    jVar3 = jVar4;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var3 = a0Var2;
                    z13 = z11;
                    q3Var2 = q3VarK;
                    d4Var2 = d4VarN;
                    f4Var2 = f4VarP;
                    a1Var2 = a1Var;
                    jVar3 = jVar;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.l4
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return m4.r(function0, a0Var3, z13, q3Var2, d4Var2, f4Var2, a1Var2, jVar3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 12582912;
            jVar2 = jVar;
            if ((i11 & 256) != 0) {
                if ((i10 & 100663296) == 0) {
                    if (c0VarR.k0(nVar)) {
                        i17 = 67108864;
                    } else {
                        i17 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i12 |= i17;
                }
                if ((i12 & 38347923) != 38347922) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i18 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            q3VarK = e4.f27241a.k(c0VarR, 6);
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                            d4VarN = e4.f27241a.n(c0VarR, 6);
                        }
                        if ((i11 & 32) != 0) {
                            c0Var3 = c0VarR;
                            i12 &= -458753;
                            f4VarP = e4.f27241a.p(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 1572864, 63);
                        } else {
                            c0Var3 = c0VarR;
                        }
                        if ((i11 & 64) != 0) {
                            a1VarM = e4.f27241a.m(z11, c0Var3, ((i12 >> 6) & 14) | 48, 0);
                            i12 &= -3670017;
                        } else {
                            a1VarM = a1Var;
                        }
                        if (i15 != 0) {
                            jVar4 = null;
                        } else {
                            jVar4 = jVar;
                        }
                        a0Var4 = a0Var2;
                        z14 = z11;
                        q3Var3 = q3VarK;
                        d4Var3 = d4VarN;
                        f4Var3 = f4VarP;
                    } else {
                        if (i18 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            q3VarK = e4.f27241a.k(c0VarR, 6);
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                            d4VarN = e4.f27241a.n(c0VarR, 6);
                        }
                        if ((i11 & 32) != 0) {
                            c0Var3 = c0VarR;
                            i12 &= -458753;
                            f4VarP = e4.f27241a.p(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 1572864, 63);
                        } else {
                            c0Var3 = c0VarR;
                        }
                        if ((i11 & 64) != 0) {
                            a1VarM = e4.f27241a.m(z11, c0Var3, ((i12 >> 6) & 14) | 48, 0);
                            i12 &= -3670017;
                        } else {
                            a1VarM = a1Var;
                        }
                        if (i15 != 0) {
                            jVar4 = null;
                        } else {
                            jVar4 = jVar;
                        }
                        a0Var4 = a0Var2;
                        z14 = z11;
                        q3Var3 = q3VarK;
                        d4Var3 = d4VarN;
                        f4Var3 = f4VarP;
                    }
                    c0Var3.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1401605899, i12, -1, "androidx.compose.material3.OutlinedCard (Card.kt:353)");
                    }
                    c0Var2 = c0Var3;
                    h(function0, a0Var4, z14, q3Var3, d4Var3, f4Var3, a1VarM, jVar4, nVar, c0Var2, i12 & 268435454, 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var4;
                    z13 = z14;
                    q3Var2 = q3Var3;
                    d4Var2 = d4Var3;
                    f4Var2 = f4Var3;
                    a1Var2 = a1VarM;
                    jVar3 = jVar4;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var3 = a0Var2;
                    z13 = z11;
                    q3Var2 = q3VarK;
                    d4Var2 = d4VarN;
                    f4Var2 = f4VarP;
                    a1Var2 = a1Var;
                    jVar3 = jVar;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.l4
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return m4.r(function0, a0Var3, z13, q3Var2, d4Var2, f4Var2, a1Var2, jVar3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 100663296;
            if ((i12 & 38347923) != 38347922) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        q3VarK = e4.f27241a.k(c0VarR, 6);
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        d4VarN = e4.f27241a.n(c0VarR, 6);
                    }
                    if ((i11 & 32) != 0) {
                        c0Var3 = c0VarR;
                        i12 &= -458753;
                        f4VarP = e4.f27241a.p(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 1572864, 63);
                    } else {
                        c0Var3 = c0VarR;
                    }
                    if ((i11 & 64) != 0) {
                        a1VarM = e4.f27241a.m(z11, c0Var3, ((i12 >> 6) & 14) | 48, 0);
                        i12 &= -3670017;
                    } else {
                        a1VarM = a1Var;
                    }
                    if (i15 != 0) {
                        jVar4 = null;
                    } else {
                        jVar4 = jVar;
                    }
                    a0Var4 = a0Var2;
                    z14 = z11;
                    q3Var3 = q3VarK;
                    d4Var3 = d4VarN;
                    f4Var3 = f4VarP;
                } else {
                    if (i18 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        q3VarK = e4.f27241a.k(c0VarR, 6);
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        d4VarN = e4.f27241a.n(c0VarR, 6);
                    }
                    if ((i11 & 32) != 0) {
                        c0Var3 = c0VarR;
                        i12 &= -458753;
                        f4VarP = e4.f27241a.p(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 1572864, 63);
                    } else {
                        c0Var3 = c0VarR;
                    }
                    if ((i11 & 64) != 0) {
                        a1VarM = e4.f27241a.m(z11, c0Var3, ((i12 >> 6) & 14) | 48, 0);
                        i12 &= -3670017;
                    } else {
                        a1VarM = a1Var;
                    }
                    if (i15 != 0) {
                        jVar4 = null;
                    } else {
                        jVar4 = jVar;
                    }
                    a0Var4 = a0Var2;
                    z14 = z11;
                    q3Var3 = q3VarK;
                    d4Var3 = d4VarN;
                    f4Var3 = f4VarP;
                }
                c0Var3.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1401605899, i12, -1, "androidx.compose.material3.OutlinedCard (Card.kt:353)");
                }
                c0Var2 = c0Var3;
                h(function0, a0Var4, z14, q3Var3, d4Var3, f4Var3, a1VarM, jVar4, nVar, c0Var2, i12 & 268435454, 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var4;
                z13 = z14;
                q3Var2 = q3Var3;
                d4Var2 = d4Var3;
                f4Var2 = f4Var3;
                a1Var2 = a1VarM;
                jVar3 = jVar4;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var3 = a0Var2;
                z13 = z11;
                q3Var2 = q3VarK;
                d4Var2 = d4VarN;
                f4Var2 = f4VarP;
                a1Var2 = a1Var;
                jVar3 = jVar;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.l4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return m4.r(function0, a0Var3, z13, q3Var2, d4Var2, f4Var2, a1Var2, jVar3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
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
                    q3VarK = q3Var;
                    if (c0VarR.D(q3VarK)) {
                    }
                    i12 |= i19;
                } else {
                    q3VarK = q3Var;
                }
                i12 |= i19;
            } else {
                q3VarK = q3Var;
            }
            if ((i10 & 24576) == 0) {
                if ((i11 & 16) == 0) {
                    d4VarN = d4Var;
                    if (c0VarR.D(d4VarN)) {
                    }
                    i12 |= i20;
                } else {
                    d4VarN = d4Var;
                }
                i12 |= i20;
            } else {
                d4VarN = d4Var;
            }
            if ((196608 & i10) == 0) {
                if ((i11 & 32) == 0) {
                    f4VarP = f4Var;
                    if (c0VarR.D(f4VarP)) {
                    }
                    i12 |= i21;
                } else {
                    f4VarP = f4Var;
                }
                i12 |= i21;
            } else {
                f4VarP = f4Var;
            }
            if ((1572864 & i10) != 0) {
                i12 |= ((i11 & 64) == 0 || !c0VarR.D(a1Var)) ? 524288 : 1048576;
            }
            i15 = i11 & 128;
            if (i15 != 0) {
                if ((12582912 & i10) == 0) {
                    jVar2 = jVar;
                    if (c0VarR.D(jVar2)) {
                        i16 = 8388608;
                    } else {
                        i16 = 4194304;
                    }
                    i12 |= i16;
                }
                if ((i11 & 256) != 0) {
                    if ((i10 & 100663296) == 0) {
                        if (c0VarR.k0(nVar)) {
                            i17 = 67108864;
                        } else {
                            i17 = com.google.api.client.googleapis.media.a.f115410j;
                        }
                        i12 |= i17;
                    }
                    if ((i12 & 38347923) != 38347922) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (c0VarR.h(z12, i12 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0) {
                            if (i18 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            }
                            if ((i11 & 8) != 0) {
                                i12 &= -7169;
                                q3VarK = e4.f27241a.k(c0VarR, 6);
                            }
                            if ((i11 & 16) != 0) {
                                i12 &= -57345;
                                d4VarN = e4.f27241a.n(c0VarR, 6);
                            }
                            if ((i11 & 32) != 0) {
                                c0Var3 = c0VarR;
                                i12 &= -458753;
                                f4VarP = e4.f27241a.p(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 1572864, 63);
                            } else {
                                c0Var3 = c0VarR;
                            }
                            if ((i11 & 64) != 0) {
                                a1VarM = e4.f27241a.m(z11, c0Var3, ((i12 >> 6) & 14) | 48, 0);
                                i12 &= -3670017;
                            } else {
                                a1VarM = a1Var;
                            }
                            if (i15 != 0) {
                                jVar4 = null;
                            } else {
                                jVar4 = jVar;
                            }
                            a0Var4 = a0Var2;
                            z14 = z11;
                            q3Var3 = q3VarK;
                            d4Var3 = d4VarN;
                            f4Var3 = f4VarP;
                        } else {
                            if (i18 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            }
                            if ((i11 & 8) != 0) {
                                i12 &= -7169;
                                q3VarK = e4.f27241a.k(c0VarR, 6);
                            }
                            if ((i11 & 16) != 0) {
                                i12 &= -57345;
                                d4VarN = e4.f27241a.n(c0VarR, 6);
                            }
                            if ((i11 & 32) != 0) {
                                c0Var3 = c0VarR;
                                i12 &= -458753;
                                f4VarP = e4.f27241a.p(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 1572864, 63);
                            } else {
                                c0Var3 = c0VarR;
                            }
                            if ((i11 & 64) != 0) {
                                a1VarM = e4.f27241a.m(z11, c0Var3, ((i12 >> 6) & 14) | 48, 0);
                                i12 &= -3670017;
                            } else {
                                a1VarM = a1Var;
                            }
                            if (i15 != 0) {
                                jVar4 = null;
                            } else {
                                jVar4 = jVar;
                            }
                            a0Var4 = a0Var2;
                            z14 = z11;
                            q3Var3 = q3VarK;
                            d4Var3 = d4VarN;
                            f4Var3 = f4VarP;
                        }
                        c0Var3.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(1401605899, i12, -1, "androidx.compose.material3.OutlinedCard (Card.kt:353)");
                        }
                        c0Var2 = c0Var3;
                        h(function0, a0Var4, z14, q3Var3, d4Var3, f4Var3, a1VarM, jVar4, nVar, c0Var2, i12 & 268435454, 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var4;
                        z13 = z14;
                        q3Var2 = q3Var3;
                        d4Var2 = d4Var3;
                        f4Var2 = f4Var3;
                        a1Var2 = a1VarM;
                        jVar3 = jVar4;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        a0Var3 = a0Var2;
                        z13 = z11;
                        q3Var2 = q3VarK;
                        d4Var2 = d4VarN;
                        f4Var2 = f4VarP;
                        a1Var2 = a1Var;
                        jVar3 = jVar;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.l4
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return m4.r(function0, a0Var3, z13, q3Var2, d4Var2, f4Var2, a1Var2, jVar3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 100663296;
                if ((i12 & 38347923) != 38347922) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i18 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            q3VarK = e4.f27241a.k(c0VarR, 6);
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                            d4VarN = e4.f27241a.n(c0VarR, 6);
                        }
                        if ((i11 & 32) != 0) {
                            c0Var3 = c0VarR;
                            i12 &= -458753;
                            f4VarP = e4.f27241a.p(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 1572864, 63);
                        } else {
                            c0Var3 = c0VarR;
                        }
                        if ((i11 & 64) != 0) {
                            a1VarM = e4.f27241a.m(z11, c0Var3, ((i12 >> 6) & 14) | 48, 0);
                            i12 &= -3670017;
                        } else {
                            a1VarM = a1Var;
                        }
                        if (i15 != 0) {
                            jVar4 = null;
                        } else {
                            jVar4 = jVar;
                        }
                        a0Var4 = a0Var2;
                        z14 = z11;
                        q3Var3 = q3VarK;
                        d4Var3 = d4VarN;
                        f4Var3 = f4VarP;
                    } else {
                        if (i18 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            q3VarK = e4.f27241a.k(c0VarR, 6);
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                            d4VarN = e4.f27241a.n(c0VarR, 6);
                        }
                        if ((i11 & 32) != 0) {
                            c0Var3 = c0VarR;
                            i12 &= -458753;
                            f4VarP = e4.f27241a.p(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 1572864, 63);
                        } else {
                            c0Var3 = c0VarR;
                        }
                        if ((i11 & 64) != 0) {
                            a1VarM = e4.f27241a.m(z11, c0Var3, ((i12 >> 6) & 14) | 48, 0);
                            i12 &= -3670017;
                        } else {
                            a1VarM = a1Var;
                        }
                        if (i15 != 0) {
                            jVar4 = null;
                        } else {
                            jVar4 = jVar;
                        }
                        a0Var4 = a0Var2;
                        z14 = z11;
                        q3Var3 = q3VarK;
                        d4Var3 = d4VarN;
                        f4Var3 = f4VarP;
                    }
                    c0Var3.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1401605899, i12, -1, "androidx.compose.material3.OutlinedCard (Card.kt:353)");
                    }
                    c0Var2 = c0Var3;
                    h(function0, a0Var4, z14, q3Var3, d4Var3, f4Var3, a1VarM, jVar4, nVar, c0Var2, i12 & 268435454, 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var4;
                    z13 = z14;
                    q3Var2 = q3Var3;
                    d4Var2 = d4Var3;
                    f4Var2 = f4Var3;
                    a1Var2 = a1VarM;
                    jVar3 = jVar4;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var3 = a0Var2;
                    z13 = z11;
                    q3Var2 = q3VarK;
                    d4Var2 = d4VarN;
                    f4Var2 = f4VarP;
                    a1Var2 = a1Var;
                    jVar3 = jVar;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.l4
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return m4.r(function0, a0Var3, z13, q3Var2, d4Var2, f4Var2, a1Var2, jVar3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 12582912;
            jVar2 = jVar;
            if ((i11 & 256) != 0) {
                if ((i10 & 100663296) == 0) {
                    if (c0VarR.k0(nVar)) {
                        i17 = 67108864;
                    } else {
                        i17 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i12 |= i17;
                }
                if ((i12 & 38347923) != 38347922) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i18 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            q3VarK = e4.f27241a.k(c0VarR, 6);
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                            d4VarN = e4.f27241a.n(c0VarR, 6);
                        }
                        if ((i11 & 32) != 0) {
                            c0Var3 = c0VarR;
                            i12 &= -458753;
                            f4VarP = e4.f27241a.p(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 1572864, 63);
                        } else {
                            c0Var3 = c0VarR;
                        }
                        if ((i11 & 64) != 0) {
                            a1VarM = e4.f27241a.m(z11, c0Var3, ((i12 >> 6) & 14) | 48, 0);
                            i12 &= -3670017;
                        } else {
                            a1VarM = a1Var;
                        }
                        if (i15 != 0) {
                            jVar4 = null;
                        } else {
                            jVar4 = jVar;
                        }
                        a0Var4 = a0Var2;
                        z14 = z11;
                        q3Var3 = q3VarK;
                        d4Var3 = d4VarN;
                        f4Var3 = f4VarP;
                    } else {
                        if (i18 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            q3VarK = e4.f27241a.k(c0VarR, 6);
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                            d4VarN = e4.f27241a.n(c0VarR, 6);
                        }
                        if ((i11 & 32) != 0) {
                            c0Var3 = c0VarR;
                            i12 &= -458753;
                            f4VarP = e4.f27241a.p(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 1572864, 63);
                        } else {
                            c0Var3 = c0VarR;
                        }
                        if ((i11 & 64) != 0) {
                            a1VarM = e4.f27241a.m(z11, c0Var3, ((i12 >> 6) & 14) | 48, 0);
                            i12 &= -3670017;
                        } else {
                            a1VarM = a1Var;
                        }
                        if (i15 != 0) {
                            jVar4 = null;
                        } else {
                            jVar4 = jVar;
                        }
                        a0Var4 = a0Var2;
                        z14 = z11;
                        q3Var3 = q3VarK;
                        d4Var3 = d4VarN;
                        f4Var3 = f4VarP;
                    }
                    c0Var3.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1401605899, i12, -1, "androidx.compose.material3.OutlinedCard (Card.kt:353)");
                    }
                    c0Var2 = c0Var3;
                    h(function0, a0Var4, z14, q3Var3, d4Var3, f4Var3, a1VarM, jVar4, nVar, c0Var2, i12 & 268435454, 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var4;
                    z13 = z14;
                    q3Var2 = q3Var3;
                    d4Var2 = d4Var3;
                    f4Var2 = f4Var3;
                    a1Var2 = a1VarM;
                    jVar3 = jVar4;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var3 = a0Var2;
                    z13 = z11;
                    q3Var2 = q3VarK;
                    d4Var2 = d4VarN;
                    f4Var2 = f4VarP;
                    a1Var2 = a1Var;
                    jVar3 = jVar;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.l4
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return m4.r(function0, a0Var3, z13, q3Var2, d4Var2, f4Var2, a1Var2, jVar3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 100663296;
            if ((i12 & 38347923) != 38347922) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        q3VarK = e4.f27241a.k(c0VarR, 6);
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        d4VarN = e4.f27241a.n(c0VarR, 6);
                    }
                    if ((i11 & 32) != 0) {
                        c0Var3 = c0VarR;
                        i12 &= -458753;
                        f4VarP = e4.f27241a.p(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 1572864, 63);
                    } else {
                        c0Var3 = c0VarR;
                    }
                    if ((i11 & 64) != 0) {
                        a1VarM = e4.f27241a.m(z11, c0Var3, ((i12 >> 6) & 14) | 48, 0);
                        i12 &= -3670017;
                    } else {
                        a1VarM = a1Var;
                    }
                    if (i15 != 0) {
                        jVar4 = null;
                    } else {
                        jVar4 = jVar;
                    }
                    a0Var4 = a0Var2;
                    z14 = z11;
                    q3Var3 = q3VarK;
                    d4Var3 = d4VarN;
                    f4Var3 = f4VarP;
                } else {
                    if (i18 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        q3VarK = e4.f27241a.k(c0VarR, 6);
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        d4VarN = e4.f27241a.n(c0VarR, 6);
                    }
                    if ((i11 & 32) != 0) {
                        c0Var3 = c0VarR;
                        i12 &= -458753;
                        f4VarP = e4.f27241a.p(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 1572864, 63);
                    } else {
                        c0Var3 = c0VarR;
                    }
                    if ((i11 & 64) != 0) {
                        a1VarM = e4.f27241a.m(z11, c0Var3, ((i12 >> 6) & 14) | 48, 0);
                        i12 &= -3670017;
                    } else {
                        a1VarM = a1Var;
                    }
                    if (i15 != 0) {
                        jVar4 = null;
                    } else {
                        jVar4 = jVar;
                    }
                    a0Var4 = a0Var2;
                    z14 = z11;
                    q3Var3 = q3VarK;
                    d4Var3 = d4VarN;
                    f4Var3 = f4VarP;
                }
                c0Var3.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1401605899, i12, -1, "androidx.compose.material3.OutlinedCard (Card.kt:353)");
                }
                c0Var2 = c0Var3;
                h(function0, a0Var4, z14, q3Var3, d4Var3, f4Var3, a1VarM, jVar4, nVar, c0Var2, i12 & 268435454, 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var4;
                z13 = z14;
                q3Var2 = q3Var3;
                d4Var2 = d4Var3;
                f4Var2 = f4Var3;
                a1Var2 = a1VarM;
                jVar3 = jVar4;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var3 = a0Var2;
                z13 = z11;
                q3Var2 = q3VarK;
                d4Var2 = d4VarN;
                f4Var2 = f4VarP;
                a1Var2 = a1Var;
                jVar3 = jVar;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.l4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return m4.r(function0, a0Var3, z13, q3Var2, d4Var2, f4Var2, a1Var2, jVar3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= androidx.media3.exoplayer.a5.S0;
        z11 = z10;
        if ((i10 & 3072) == 0) {
            if ((i11 & 8) == 0) {
                q3VarK = q3Var;
                if (c0VarR.D(q3VarK)) {
                }
                i12 |= i19;
            } else {
                q3VarK = q3Var;
            }
            i12 |= i19;
        } else {
            q3VarK = q3Var;
        }
        if ((i10 & 24576) == 0) {
            if ((i11 & 16) == 0) {
                d4VarN = d4Var;
                if (c0VarR.D(d4VarN)) {
                }
                i12 |= i20;
            } else {
                d4VarN = d4Var;
            }
            i12 |= i20;
        } else {
            d4VarN = d4Var;
        }
        if ((196608 & i10) == 0) {
            if ((i11 & 32) == 0) {
                f4VarP = f4Var;
                if (c0VarR.D(f4VarP)) {
                }
                i12 |= i21;
            } else {
                f4VarP = f4Var;
            }
            i12 |= i21;
        } else {
            f4VarP = f4Var;
        }
        if ((1572864 & i10) != 0) {
            i12 |= ((i11 & 64) == 0 || !c0VarR.D(a1Var)) ? 524288 : 1048576;
        }
        i15 = i11 & 128;
        if (i15 != 0) {
            if ((12582912 & i10) == 0) {
                jVar2 = jVar;
                if (c0VarR.D(jVar2)) {
                    i16 = 8388608;
                } else {
                    i16 = 4194304;
                }
                i12 |= i16;
            }
            if ((i11 & 256) != 0) {
                if ((i10 & 100663296) == 0) {
                    if (c0VarR.k0(nVar)) {
                        i17 = 67108864;
                    } else {
                        i17 = com.google.api.client.googleapis.media.a.f115410j;
                    }
                    i12 |= i17;
                }
                if ((i12 & 38347923) != 38347922) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i18 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            q3VarK = e4.f27241a.k(c0VarR, 6);
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                            d4VarN = e4.f27241a.n(c0VarR, 6);
                        }
                        if ((i11 & 32) != 0) {
                            c0Var3 = c0VarR;
                            i12 &= -458753;
                            f4VarP = e4.f27241a.p(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 1572864, 63);
                        } else {
                            c0Var3 = c0VarR;
                        }
                        if ((i11 & 64) != 0) {
                            a1VarM = e4.f27241a.m(z11, c0Var3, ((i12 >> 6) & 14) | 48, 0);
                            i12 &= -3670017;
                        } else {
                            a1VarM = a1Var;
                        }
                        if (i15 != 0) {
                            jVar4 = null;
                        } else {
                            jVar4 = jVar;
                        }
                        a0Var4 = a0Var2;
                        z14 = z11;
                        q3Var3 = q3VarK;
                        d4Var3 = d4VarN;
                        f4Var3 = f4VarP;
                    } else {
                        if (i18 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            q3VarK = e4.f27241a.k(c0VarR, 6);
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                            d4VarN = e4.f27241a.n(c0VarR, 6);
                        }
                        if ((i11 & 32) != 0) {
                            c0Var3 = c0VarR;
                            i12 &= -458753;
                            f4VarP = e4.f27241a.p(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 1572864, 63);
                        } else {
                            c0Var3 = c0VarR;
                        }
                        if ((i11 & 64) != 0) {
                            a1VarM = e4.f27241a.m(z11, c0Var3, ((i12 >> 6) & 14) | 48, 0);
                            i12 &= -3670017;
                        } else {
                            a1VarM = a1Var;
                        }
                        if (i15 != 0) {
                            jVar4 = null;
                        } else {
                            jVar4 = jVar;
                        }
                        a0Var4 = a0Var2;
                        z14 = z11;
                        q3Var3 = q3VarK;
                        d4Var3 = d4VarN;
                        f4Var3 = f4VarP;
                    }
                    c0Var3.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1401605899, i12, -1, "androidx.compose.material3.OutlinedCard (Card.kt:353)");
                    }
                    c0Var2 = c0Var3;
                    h(function0, a0Var4, z14, q3Var3, d4Var3, f4Var3, a1VarM, jVar4, nVar, c0Var2, i12 & 268435454, 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var4;
                    z13 = z14;
                    q3Var2 = q3Var3;
                    d4Var2 = d4Var3;
                    f4Var2 = f4Var3;
                    a1Var2 = a1VarM;
                    jVar3 = jVar4;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var3 = a0Var2;
                    z13 = z11;
                    q3Var2 = q3VarK;
                    d4Var2 = d4VarN;
                    f4Var2 = f4VarP;
                    a1Var2 = a1Var;
                    jVar3 = jVar;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.l4
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return m4.r(function0, a0Var3, z13, q3Var2, d4Var2, f4Var2, a1Var2, jVar3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 100663296;
            if ((i12 & 38347923) != 38347922) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        q3VarK = e4.f27241a.k(c0VarR, 6);
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        d4VarN = e4.f27241a.n(c0VarR, 6);
                    }
                    if ((i11 & 32) != 0) {
                        c0Var3 = c0VarR;
                        i12 &= -458753;
                        f4VarP = e4.f27241a.p(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 1572864, 63);
                    } else {
                        c0Var3 = c0VarR;
                    }
                    if ((i11 & 64) != 0) {
                        a1VarM = e4.f27241a.m(z11, c0Var3, ((i12 >> 6) & 14) | 48, 0);
                        i12 &= -3670017;
                    } else {
                        a1VarM = a1Var;
                    }
                    if (i15 != 0) {
                        jVar4 = null;
                    } else {
                        jVar4 = jVar;
                    }
                    a0Var4 = a0Var2;
                    z14 = z11;
                    q3Var3 = q3VarK;
                    d4Var3 = d4VarN;
                    f4Var3 = f4VarP;
                } else {
                    if (i18 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        q3VarK = e4.f27241a.k(c0VarR, 6);
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        d4VarN = e4.f27241a.n(c0VarR, 6);
                    }
                    if ((i11 & 32) != 0) {
                        c0Var3 = c0VarR;
                        i12 &= -458753;
                        f4VarP = e4.f27241a.p(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 1572864, 63);
                    } else {
                        c0Var3 = c0VarR;
                    }
                    if ((i11 & 64) != 0) {
                        a1VarM = e4.f27241a.m(z11, c0Var3, ((i12 >> 6) & 14) | 48, 0);
                        i12 &= -3670017;
                    } else {
                        a1VarM = a1Var;
                    }
                    if (i15 != 0) {
                        jVar4 = null;
                    } else {
                        jVar4 = jVar;
                    }
                    a0Var4 = a0Var2;
                    z14 = z11;
                    q3Var3 = q3VarK;
                    d4Var3 = d4VarN;
                    f4Var3 = f4VarP;
                }
                c0Var3.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1401605899, i12, -1, "androidx.compose.material3.OutlinedCard (Card.kt:353)");
                }
                c0Var2 = c0Var3;
                h(function0, a0Var4, z14, q3Var3, d4Var3, f4Var3, a1VarM, jVar4, nVar, c0Var2, i12 & 268435454, 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var4;
                z13 = z14;
                q3Var2 = q3Var3;
                d4Var2 = d4Var3;
                f4Var2 = f4Var3;
                a1Var2 = a1VarM;
                jVar3 = jVar4;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var3 = a0Var2;
                z13 = z11;
                q3Var2 = q3VarK;
                d4Var2 = d4VarN;
                f4Var2 = f4VarP;
                a1Var2 = a1Var;
                jVar3 = jVar;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.l4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return m4.r(function0, a0Var3, z13, q3Var2, d4Var2, f4Var2, a1Var2, jVar3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 12582912;
        jVar2 = jVar;
        if ((i11 & 256) != 0) {
            if ((i10 & 100663296) == 0) {
                if (c0VarR.k0(nVar)) {
                    i17 = 67108864;
                } else {
                    i17 = com.google.api.client.googleapis.media.a.f115410j;
                }
                i12 |= i17;
            }
            if ((i12 & 38347923) != 38347922) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        q3VarK = e4.f27241a.k(c0VarR, 6);
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        d4VarN = e4.f27241a.n(c0VarR, 6);
                    }
                    if ((i11 & 32) != 0) {
                        c0Var3 = c0VarR;
                        i12 &= -458753;
                        f4VarP = e4.f27241a.p(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 1572864, 63);
                    } else {
                        c0Var3 = c0VarR;
                    }
                    if ((i11 & 64) != 0) {
                        a1VarM = e4.f27241a.m(z11, c0Var3, ((i12 >> 6) & 14) | 48, 0);
                        i12 &= -3670017;
                    } else {
                        a1VarM = a1Var;
                    }
                    if (i15 != 0) {
                        jVar4 = null;
                    } else {
                        jVar4 = jVar;
                    }
                    a0Var4 = a0Var2;
                    z14 = z11;
                    q3Var3 = q3VarK;
                    d4Var3 = d4VarN;
                    f4Var3 = f4VarP;
                } else {
                    if (i18 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        q3VarK = e4.f27241a.k(c0VarR, 6);
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        d4VarN = e4.f27241a.n(c0VarR, 6);
                    }
                    if ((i11 & 32) != 0) {
                        c0Var3 = c0VarR;
                        i12 &= -458753;
                        f4VarP = e4.f27241a.p(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 1572864, 63);
                    } else {
                        c0Var3 = c0VarR;
                    }
                    if ((i11 & 64) != 0) {
                        a1VarM = e4.f27241a.m(z11, c0Var3, ((i12 >> 6) & 14) | 48, 0);
                        i12 &= -3670017;
                    } else {
                        a1VarM = a1Var;
                    }
                    if (i15 != 0) {
                        jVar4 = null;
                    } else {
                        jVar4 = jVar;
                    }
                    a0Var4 = a0Var2;
                    z14 = z11;
                    q3Var3 = q3VarK;
                    d4Var3 = d4VarN;
                    f4Var3 = f4VarP;
                }
                c0Var3.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1401605899, i12, -1, "androidx.compose.material3.OutlinedCard (Card.kt:353)");
                }
                c0Var2 = c0Var3;
                h(function0, a0Var4, z14, q3Var3, d4Var3, f4Var3, a1VarM, jVar4, nVar, c0Var2, i12 & 268435454, 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var4;
                z13 = z14;
                q3Var2 = q3Var3;
                d4Var2 = d4Var3;
                f4Var2 = f4Var3;
                a1Var2 = a1VarM;
                jVar3 = jVar4;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var3 = a0Var2;
                z13 = z11;
                q3Var2 = q3VarK;
                d4Var2 = d4VarN;
                f4Var2 = f4VarP;
                a1Var2 = a1Var;
                jVar3 = jVar;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.l4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return m4.r(function0, a0Var3, z13, q3Var2, d4Var2, f4Var2, a1Var2, jVar3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 100663296;
        if ((i12 & 38347923) != 38347922) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (c0VarR.h(z12, i12 & 1)) {
            c0VarR.l0();
            if ((i10 & 1) != 0) {
                if (i18 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                }
                if (i13 != 0) {
                    z11 = true;
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    q3VarK = e4.f27241a.k(c0VarR, 6);
                }
                if ((i11 & 16) != 0) {
                    i12 &= -57345;
                    d4VarN = e4.f27241a.n(c0VarR, 6);
                }
                if ((i11 & 32) != 0) {
                    c0Var3 = c0VarR;
                    i12 &= -458753;
                    f4VarP = e4.f27241a.p(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 1572864, 63);
                } else {
                    c0Var3 = c0VarR;
                }
                if ((i11 & 64) != 0) {
                    a1VarM = e4.f27241a.m(z11, c0Var3, ((i12 >> 6) & 14) | 48, 0);
                    i12 &= -3670017;
                } else {
                    a1VarM = a1Var;
                }
                if (i15 != 0) {
                    jVar4 = null;
                } else {
                    jVar4 = jVar;
                }
                a0Var4 = a0Var2;
                z14 = z11;
                q3Var3 = q3VarK;
                d4Var3 = d4VarN;
                f4Var3 = f4VarP;
            } else {
                if (i18 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                }
                if (i13 != 0) {
                    z11 = true;
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    q3VarK = e4.f27241a.k(c0VarR, 6);
                }
                if ((i11 & 16) != 0) {
                    i12 &= -57345;
                    d4VarN = e4.f27241a.n(c0VarR, 6);
                }
                if ((i11 & 32) != 0) {
                    c0Var3 = c0VarR;
                    i12 &= -458753;
                    f4VarP = e4.f27241a.p(0.0f, 0.0f, 0.0f, 0.0f, 0.0f, 0.0f, c0VarR, 1572864, 63);
                } else {
                    c0Var3 = c0VarR;
                }
                if ((i11 & 64) != 0) {
                    a1VarM = e4.f27241a.m(z11, c0Var3, ((i12 >> 6) & 14) | 48, 0);
                    i12 &= -3670017;
                } else {
                    a1VarM = a1Var;
                }
                if (i15 != 0) {
                    jVar4 = null;
                } else {
                    jVar4 = jVar;
                }
                a0Var4 = a0Var2;
                z14 = z11;
                q3Var3 = q3VarK;
                d4Var3 = d4VarN;
                f4Var3 = f4VarP;
            }
            c0Var3.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1401605899, i12, -1, "androidx.compose.material3.OutlinedCard (Card.kt:353)");
            }
            c0Var2 = c0Var3;
            h(function0, a0Var4, z14, q3Var3, d4Var3, f4Var3, a1VarM, jVar4, nVar, c0Var2, i12 & 268435454, 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            a0Var3 = a0Var4;
            z13 = z14;
            q3Var2 = q3Var3;
            d4Var2 = d4Var3;
            f4Var2 = f4Var3;
            a1Var2 = a1VarM;
            jVar3 = jVar4;
        } else {
            c0Var2 = c0VarR;
            c0Var2.u();
            a0Var3 = a0Var2;
            z13 = z11;
            q3Var2 = q3VarK;
            d4Var2 = d4VarN;
            f4Var2 = f4VarP;
            a1Var2 = a1Var;
            jVar3 = jVar;
        }
        s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.l4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return m4.r(function0, a0Var3, z13, q3Var2, d4Var2, f4Var2, a1Var2, jVar3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q(androidx.compose.ui.a0 a0Var, androidx.compose.ui.graphics.q3 q3Var, d4 d4Var, f4 f4Var, androidx.compose.foundation.a1 a1Var, pj.n nVar, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        o(a0Var, q3Var, d4Var, f4Var, a1Var, nVar, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r(Function0 function0, androidx.compose.ui.a0 a0Var, boolean z10, androidx.compose.ui.graphics.q3 q3Var, d4 d4Var, f4 f4Var, androidx.compose.foundation.a1 a1Var, androidx.compose.foundation.interaction.j jVar, pj.n nVar, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        p(function0, a0Var, z10, q3Var, d4Var, f4Var, a1Var, jVar, nVar, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }
}

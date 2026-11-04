package androidx.compose.foundation;

import androidx.compose.runtime.s5;
import androidx.compose.runtime.y7;
import androidx.compose.ui.graphics.painter.BitmapPainter;
import androidx.compose.ui.graphics.vector.VectorPainter;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nImage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Image.kt\nandroidx/compose/foundation/ImageKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,276:1\n1282#2,6:277\n1282#2,6:283\n1282#2,6:289\n122#3,6:295\n129#3,4:310\n133#3:320\n135#3:323\n316#4,9:301\n325#4,2:321\n4360#5,6:314\n*S KotlinDebug\n*F\n+ 1 Image.kt\nandroidx/compose/foundation/ImageKt\n*L\n158#1:277,6\n251#1:283,6\n272#1:289,6\n261#1:295,6\n261#1:310,4\n261#1:320\n261#1:323\n261#1:301,9\n261#1:321,2\n261#1:314,6\n*E\n"})
public final class s2 {

    static final class a implements androidx.compose.ui.layout.a1 {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f18610a = new a();

        a() {
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit g(androidx.compose.ui.layout.i2.a aVar) {
            return Unit.f312394a;
        }

        @Override // androidx.compose.ui.layout.a1
        public final androidx.compose.ui.layout.b1 a(androidx.compose.ui.layout.c1 c1Var, List<? extends androidx.compose.ui.layout.z0> list, long j10) {
            return androidx.compose.ui.layout.c1.h6(c1Var, androidx.compose.ui.unit.b.r(j10), androidx.compose.ui.unit.b.q(j10), null, new Function1() { // from class: androidx.compose.foundation.r2
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    return s2.a.g((androidx.compose.ui.layout.i2.a) obj);
                }
            }, 4, null);
        }
    }

    @androidx.compose.runtime.o
    @kotlin.l(level = kotlin.n.HIDDEN, message = "Consider usage of the Image composable that consumes an optional FilterQuality parameter", replaceWith = @kotlin.b1(expression = "Image(bitmap, contentDescription, modifier, alignment, contentScale, alpha, colorFilter, DefaultFilterQuality)", imports = {"androidx.compose.foundation", "androidx.compose.ui.graphics.DefaultAlpha", "androidx.compose.ui.Alignment", "androidx.compose.ui.graphics.drawscope.DrawScope.Companion.DefaultFilterQuality", "androidx.compose.ui.layout.ContentScale.Fit"}))
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final /* synthetic */ void c(androidx.compose.ui.graphics.t1 t1Var, String str, androidx.compose.ui.a0 a0Var, androidx.compose.ui.e eVar, androidx.compose.ui.layout.l lVar, float f10, androidx.compose.ui.graphics.r0 r0Var, androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        if ((i11 & 4) != 0) {
            a0Var = androidx.compose.ui.a0.E;
        }
        androidx.compose.ui.a0 a0Var2 = a0Var;
        androidx.compose.ui.e eVarI = (i11 & 8) != 0 ? androidx.compose.ui.e.f37317a.i() : eVar;
        androidx.compose.ui.layout.l lVarI = (i11 & 16) != 0 ? androidx.compose.ui.layout.l.f39405a.i() : lVar;
        float f11 = (i11 & 32) != 0 ? 1.0f : f10;
        androidx.compose.ui.graphics.r0 r0Var2 = (i11 & 64) != 0 ? null : r0Var;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-2123228673, i10, -1, "androidx.compose.foundation.Image (Image.kt:98)");
        }
        h(t1Var, str, a0Var2, eVarI, lVarI, f11, r0Var2, androidx.compose.ui.graphics.l1.f37840b.b(), c0Var, i10 & 4194302, 0);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0133  */
    /* JADX WARN: Code duplicated, block: B:103:0x0141  */
    /* JADX WARN: Code duplicated, block: B:104:0x0143  */
    /* JADX WARN: Code duplicated, block: B:107:0x014a  */
    /* JADX WARN: Code duplicated, block: B:109:0x0152  */
    /* JADX WARN: Code duplicated, block: B:111:0x0165  */
    /* JADX WARN: Code duplicated, block: B:114:0x018e  */
    /* JADX WARN: Code duplicated, block: B:117:0x01b1  */
    /* JADX WARN: Code duplicated, block: B:120:0x01bd  */
    /* JADX WARN: Code duplicated, block: B:121:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:124:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:126:0x01f5  */
    /* JADX WARN: Code duplicated, block: B:129:0x020c  */
    /* JADX WARN: Code duplicated, block: B:132:0x0215  */
    /* JADX WARN: Code duplicated, block: B:135:0x0223  */
    /* JADX WARN: Code duplicated, block: B:137:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0066  */
    /* JADX WARN: Code duplicated, block: B:38:0x006d  */
    /* JADX WARN: Code duplicated, block: B:40:0x0071  */
    /* JADX WARN: Code duplicated, block: B:42:0x0079  */
    /* JADX WARN: Code duplicated, block: B:43:0x007c  */
    /* JADX WARN: Code duplicated, block: B:47:0x0083  */
    /* JADX WARN: Code duplicated, block: B:49:0x008a  */
    /* JADX WARN: Code duplicated, block: B:51:0x008e  */
    /* JADX WARN: Code duplicated, block: B:53:0x0096  */
    /* JADX WARN: Code duplicated, block: B:54:0x0099  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a6  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:64:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:74:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:79:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:83:0x00ef A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f6  */
    /* JADX WARN: Code duplicated, block: B:87:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:89:0x0102  */
    /* JADX WARN: Code duplicated, block: B:90:0x0110  */
    /* JADX WARN: Code duplicated, block: B:92:0x0115  */
    /* JADX WARN: Code duplicated, block: B:95:0x011b  */
    /* JADX WARN: Code duplicated, block: B:96:0x011e  */
    /* JADX WARN: Code duplicated, block: B:99:0x0126  */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void d(@NotNull final androidx.compose.ui.graphics.painter.b bVar, @Nullable final String str, @Nullable androidx.compose.ui.a0 a0Var, @Nullable androidx.compose.ui.e eVar, @Nullable androidx.compose.ui.layout.l lVar, float f10, @Nullable androidx.compose.ui.graphics.r0 r0Var, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        androidx.compose.ui.graphics.painter.b bVar2;
        int i12;
        androidx.compose.ui.a0 a0Var2;
        int i13;
        androidx.compose.ui.e eVar2;
        int i14;
        int i15;
        int i16;
        int i17;
        float f11;
        int i18;
        int i19;
        androidx.compose.ui.graphics.r0 r0Var2;
        int i20;
        boolean z10;
        final androidx.compose.ui.graphics.r0 r0Var3;
        final androidx.compose.ui.e eVar3;
        final androidx.compose.ui.layout.l lVar2;
        final androidx.compose.ui.a0 a0Var3;
        final float f12;
        s5 s5VarT;
        androidx.compose.ui.e eVarI;
        int i21;
        androidx.compose.ui.layout.l lVarI;
        androidx.compose.ui.graphics.r0 r0Var4;
        int i22;
        androidx.compose.ui.a0 a0VarF;
        Object objI0;
        int iHashCode;
        Function0<androidx.compose.ui.node.g> function0A;
        androidx.compose.runtime.c0 c0VarD;
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B;
        boolean z11;
        Object objI1;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1142754848);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
            bVar2 = bVar;
        } else {
            bVar2 = bVar;
            if ((i10 & 6) == 0) {
                i12 = (c0VarR.k0(bVar2) ? 4 : 2) | i10;
            } else {
                i12 = i10;
            }
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= c0VarR.D(str) ? 32 : 16;
        }
        int i23 = i11 & 4;
        if (i23 == 0) {
            if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                a0Var2 = a0Var;
                i12 |= c0VarR.D(a0Var2) ? 256 : 128;
            }
            i13 = i11 & 8;
            if (i13 != 0) {
                if ((i10 & 3072) == 0) {
                    eVar2 = eVar;
                    if (c0VarR.D(eVar2)) {
                        i14 = 2048;
                    } else {
                        i14 = 1024;
                    }
                    i12 |= i14;
                }
                i15 = i11 & 16;
                if (i15 != 0) {
                    if ((i10 & 24576) == 0) {
                        if (c0VarR.D(lVar)) {
                            i16 = 16384;
                        } else {
                            i16 = 8192;
                        }
                        i12 |= i16;
                    }
                    i17 = i11 & 32;
                    if (i17 != 0) {
                        if ((196608 & i10) == 0) {
                            f11 = f10;
                            if (c0VarR.I(f11)) {
                                i18 = 131072;
                            } else {
                                i18 = 65536;
                            }
                            i12 |= i18;
                        }
                        i19 = i11 & 64;
                        if (i19 != 0) {
                            i12 |= 1572864;
                            r0Var2 = r0Var;
                        } else {
                            r0Var2 = r0Var;
                            if ((i10 & 1572864) == 0) {
                                if (c0VarR.D(r0Var2)) {
                                    i20 = 1048576;
                                } else {
                                    i20 = 524288;
                                }
                                i12 |= i20;
                            }
                        }
                        if ((i12 & 599187) != 599186) {
                            z10 = true;
                        } else {
                            z10 = false;
                        }
                        if (c0VarR.h(z10, i12 & 1)) {
                            if (i23 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i13 != 0) {
                                eVarI = androidx.compose.ui.e.f37317a.i();
                            } else {
                                eVarI = eVar2;
                            }
                            if (i15 != 0) {
                                lVarI = androidx.compose.ui.layout.l.f39405a.i();
                                i21 = i17;
                            } else {
                                i21 = i17;
                                lVarI = lVar;
                            }
                            if (i21 != 0) {
                                f11 = 1.0f;
                            }
                            if (i19 != 0) {
                                r0Var4 = null;
                            } else {
                                r0Var4 = r0Var2;
                            }
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(1142754848, i12, -1, "androidx.compose.foundation.Image (Image.kt:247)");
                            }
                            if (str != null) {
                                c0VarR.E(1899234820);
                                androidx.compose.ui.a0.a aVar = androidx.compose.ui.a0.E;
                                if ((i12 & com.planner5d.library.engine.input.f.b.B) == 32) {
                                    z11 = true;
                                } else {
                                    z11 = false;
                                }
                                objI1 = c0VarR.i0();
                                if (z11 || objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI1 = new Function1() { // from class: androidx.compose.foundation.p2
                                        @Override // kotlin.jvm.functions.Function1
                                        public final Object invoke(Object obj) {
                                            return s2.f(str, (androidx.compose.ui.semantics.e0) obj);
                                        }
                                    };
                                    c0VarR.Y(objI1);
                                }
                                i22 = 0;
                                a0VarF = androidx.compose.ui.semantics.t.f(aVar, false, (Function1) objI1, 1, null);
                                c0VarR.A();
                            } else {
                                i22 = 0;
                                c0VarR.E(1899393602);
                                c0VarR.A();
                                a0VarF = androidx.compose.ui.a0.E;
                            }
                            androidx.compose.ui.a0 a0VarB = androidx.compose.ui.draw.t.b(androidx.compose.ui.draw.j.b(a0Var2.B2(a0VarF)), bVar2, false, eVarI, lVarI, f11, r0Var4, 2, null);
                            objI0 = c0VarR.i0();
                            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = a.f18610a;
                                c0VarR.Y(objI0);
                            }
                            androidx.compose.ui.layout.a1 a1Var = (androidx.compose.ui.layout.a1) objI0;
                            iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, i22));
                            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0VarB);
                            androidx.compose.runtime.b1 b1VarK = c0VarR.k();
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
                            y7.n(c0VarD, a1Var, aVar2.e());
                            y7.n(c0VarD, b1VarK, aVar2.g());
                            y7.n(c0VarD, a0VarN, aVar2.f());
                            function2B = aVar2.b();
                            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iHashCode))) {
                                c0VarD.Y(Integer.valueOf(iHashCode));
                                c0VarD.f(Integer.valueOf(iHashCode), function2B);
                            }
                            c0VarR.o();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            eVar3 = eVarI;
                            lVar2 = lVarI;
                            r0Var3 = r0Var4;
                        } else {
                            c0VarR.u();
                            r0Var3 = r0Var2;
                            eVar3 = eVar2;
                            lVar2 = lVar;
                        }
                        a0Var3 = a0Var2;
                        f12 = f11;
                        s5VarT = c0VarR.T();
                        if (s5VarT != null) {
                            s5VarT.a(new Function2() { // from class: androidx.compose.foundation.q2
                                @Override // kotlin.jvm.functions.Function2
                                public final Object invoke(Object obj, Object obj2) {
                                    return s2.g(bVar, str, a0Var3, eVar3, lVar2, f12, r0Var3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                                }
                            });
                        }
                    }
                    i12 |= androidx.profileinstaller.n.c.f73814m;
                    f11 = f10;
                    i19 = i11 & 64;
                    if (i19 != 0) {
                        i12 |= 1572864;
                        r0Var2 = r0Var;
                    } else {
                        r0Var2 = r0Var;
                        if ((i10 & 1572864) == 0) {
                            if (c0VarR.D(r0Var2)) {
                                i20 = 1048576;
                            } else {
                                i20 = 524288;
                            }
                            i12 |= i20;
                        }
                    }
                    if ((i12 & 599187) != 599186) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i12 & 1)) {
                        if (i23 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            eVarI = androidx.compose.ui.e.f37317a.i();
                        } else {
                            eVarI = eVar2;
                        }
                        if (i15 != 0) {
                            lVarI = androidx.compose.ui.layout.l.f39405a.i();
                            i21 = i17;
                        } else {
                            i21 = i17;
                            lVarI = lVar;
                        }
                        if (i21 != 0) {
                            f11 = 1.0f;
                        }
                        if (i19 != 0) {
                            r0Var4 = null;
                        } else {
                            r0Var4 = r0Var2;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(1142754848, i12, -1, "androidx.compose.foundation.Image (Image.kt:247)");
                        }
                        if (str != null) {
                            c0VarR.E(1899234820);
                            androidx.compose.ui.a0.a aVar3 = androidx.compose.ui.a0.E;
                            if ((i12 & com.planner5d.library.engine.input.f.b.B) == 32) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            objI1 = c0VarR.i0();
                            if (z11) {
                                objI1 = new Function1() { // from class: androidx.compose.foundation.p2
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return s2.f(str, (androidx.compose.ui.semantics.e0) obj);
                                    }
                                };
                                c0VarR.Y(objI1);
                            } else {
                                objI1 = new Function1() { // from class: androidx.compose.foundation.p2
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return s2.f(str, (androidx.compose.ui.semantics.e0) obj);
                                    }
                                };
                                c0VarR.Y(objI1);
                            }
                            i22 = 0;
                            a0VarF = androidx.compose.ui.semantics.t.f(aVar3, false, (Function1) objI1, 1, null);
                            c0VarR.A();
                        } else {
                            i22 = 0;
                            c0VarR.E(1899393602);
                            c0VarR.A();
                            a0VarF = androidx.compose.ui.a0.E;
                        }
                        androidx.compose.ui.a0 a0VarB2 = androidx.compose.ui.draw.t.b(androidx.compose.ui.draw.j.b(a0Var2.B2(a0VarF)), bVar2, false, eVarI, lVarI, f11, r0Var4, 2, null);
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = a.f18610a;
                            c0VarR.Y(objI0);
                        }
                        androidx.compose.ui.layout.a1 a1Var2 = (androidx.compose.ui.layout.a1) objI0;
                        iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, i22));
                        androidx.compose.ui.a0 a0VarN2 = androidx.compose.ui.m.n(c0VarR, a0VarB2);
                        androidx.compose.runtime.b1 b1VarK2 = c0VarR.k();
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
                        y7.n(c0VarD, a1Var2, aVar4.e());
                        y7.n(c0VarD, b1VarK2, aVar4.g());
                        y7.n(c0VarD, a0VarN2, aVar4.f());
                        function2B = aVar4.b();
                        if (c0VarD.P()) {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        } else {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        }
                        c0VarR.o();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        eVar3 = eVarI;
                        lVar2 = lVarI;
                        r0Var3 = r0Var4;
                    } else {
                        c0VarR.u();
                        r0Var3 = r0Var2;
                        eVar3 = eVar2;
                        lVar2 = lVar;
                    }
                    a0Var3 = a0Var2;
                    f12 = f11;
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.foundation.q2
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return s2.g(bVar, str, a0Var3, eVar3, lVar2, f12, r0Var3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 24576;
                i17 = i11 & 32;
                if (i17 != 0) {
                    if ((196608 & i10) == 0) {
                        f11 = f10;
                        if (c0VarR.I(f11)) {
                            i18 = 131072;
                        } else {
                            i18 = 65536;
                        }
                        i12 |= i18;
                    }
                    i19 = i11 & 64;
                    if (i19 != 0) {
                        i12 |= 1572864;
                        r0Var2 = r0Var;
                    } else {
                        r0Var2 = r0Var;
                        if ((i10 & 1572864) == 0) {
                            if (c0VarR.D(r0Var2)) {
                                i20 = 1048576;
                            } else {
                                i20 = 524288;
                            }
                            i12 |= i20;
                        }
                    }
                    if ((i12 & 599187) != 599186) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i12 & 1)) {
                        if (i23 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            eVarI = androidx.compose.ui.e.f37317a.i();
                        } else {
                            eVarI = eVar2;
                        }
                        if (i15 != 0) {
                            lVarI = androidx.compose.ui.layout.l.f39405a.i();
                            i21 = i17;
                        } else {
                            i21 = i17;
                            lVarI = lVar;
                        }
                        if (i21 != 0) {
                            f11 = 1.0f;
                        }
                        if (i19 != 0) {
                            r0Var4 = null;
                        } else {
                            r0Var4 = r0Var2;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(1142754848, i12, -1, "androidx.compose.foundation.Image (Image.kt:247)");
                        }
                        if (str != null) {
                            c0VarR.E(1899234820);
                            androidx.compose.ui.a0.a aVar5 = androidx.compose.ui.a0.E;
                            if ((i12 & com.planner5d.library.engine.input.f.b.B) == 32) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            objI1 = c0VarR.i0();
                            if (z11) {
                                objI1 = new Function1() { // from class: androidx.compose.foundation.p2
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return s2.f(str, (androidx.compose.ui.semantics.e0) obj);
                                    }
                                };
                                c0VarR.Y(objI1);
                            } else {
                                objI1 = new Function1() { // from class: androidx.compose.foundation.p2
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return s2.f(str, (androidx.compose.ui.semantics.e0) obj);
                                    }
                                };
                                c0VarR.Y(objI1);
                            }
                            i22 = 0;
                            a0VarF = androidx.compose.ui.semantics.t.f(aVar5, false, (Function1) objI1, 1, null);
                            c0VarR.A();
                        } else {
                            i22 = 0;
                            c0VarR.E(1899393602);
                            c0VarR.A();
                            a0VarF = androidx.compose.ui.a0.E;
                        }
                        androidx.compose.ui.a0 a0VarB3 = androidx.compose.ui.draw.t.b(androidx.compose.ui.draw.j.b(a0Var2.B2(a0VarF)), bVar2, false, eVarI, lVarI, f11, r0Var4, 2, null);
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = a.f18610a;
                            c0VarR.Y(objI0);
                        }
                        androidx.compose.ui.layout.a1 a1Var3 = (androidx.compose.ui.layout.a1) objI0;
                        iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, i22));
                        androidx.compose.ui.a0 a0VarN3 = androidx.compose.ui.m.n(c0VarR, a0VarB3);
                        androidx.compose.runtime.b1 b1VarK3 = c0VarR.k();
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
                        y7.n(c0VarD, a1Var3, aVar6.e());
                        y7.n(c0VarD, b1VarK3, aVar6.g());
                        y7.n(c0VarD, a0VarN3, aVar6.f());
                        function2B = aVar6.b();
                        if (c0VarD.P()) {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        } else {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        }
                        c0VarR.o();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        eVar3 = eVarI;
                        lVar2 = lVarI;
                        r0Var3 = r0Var4;
                    } else {
                        c0VarR.u();
                        r0Var3 = r0Var2;
                        eVar3 = eVar2;
                        lVar2 = lVar;
                    }
                    a0Var3 = a0Var2;
                    f12 = f11;
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.foundation.q2
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return s2.g(bVar, str, a0Var3, eVar3, lVar2, f12, r0Var3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= androidx.profileinstaller.n.c.f73814m;
                f11 = f10;
                i19 = i11 & 64;
                if (i19 != 0) {
                    i12 |= 1572864;
                    r0Var2 = r0Var;
                } else {
                    r0Var2 = r0Var;
                    if ((i10 & 1572864) == 0) {
                        if (c0VarR.D(r0Var2)) {
                            i20 = 1048576;
                        } else {
                            i20 = 524288;
                        }
                        i12 |= i20;
                    }
                }
                if ((i12 & 599187) != 599186) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i12 & 1)) {
                    if (i23 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i13 != 0) {
                        eVarI = androidx.compose.ui.e.f37317a.i();
                    } else {
                        eVarI = eVar2;
                    }
                    if (i15 != 0) {
                        lVarI = androidx.compose.ui.layout.l.f39405a.i();
                        i21 = i17;
                    } else {
                        i21 = i17;
                        lVarI = lVar;
                    }
                    if (i21 != 0) {
                        f11 = 1.0f;
                    }
                    if (i19 != 0) {
                        r0Var4 = null;
                    } else {
                        r0Var4 = r0Var2;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1142754848, i12, -1, "androidx.compose.foundation.Image (Image.kt:247)");
                    }
                    if (str != null) {
                        c0VarR.E(1899234820);
                        androidx.compose.ui.a0.a aVar7 = androidx.compose.ui.a0.E;
                        if ((i12 & com.planner5d.library.engine.input.f.b.B) == 32) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        objI1 = c0VarR.i0();
                        if (z11) {
                            objI1 = new Function1() { // from class: androidx.compose.foundation.p2
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return s2.f(str, (androidx.compose.ui.semantics.e0) obj);
                                }
                            };
                            c0VarR.Y(objI1);
                        } else {
                            objI1 = new Function1() { // from class: androidx.compose.foundation.p2
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return s2.f(str, (androidx.compose.ui.semantics.e0) obj);
                                }
                            };
                            c0VarR.Y(objI1);
                        }
                        i22 = 0;
                        a0VarF = androidx.compose.ui.semantics.t.f(aVar7, false, (Function1) objI1, 1, null);
                        c0VarR.A();
                    } else {
                        i22 = 0;
                        c0VarR.E(1899393602);
                        c0VarR.A();
                        a0VarF = androidx.compose.ui.a0.E;
                    }
                    androidx.compose.ui.a0 a0VarB4 = androidx.compose.ui.draw.t.b(androidx.compose.ui.draw.j.b(a0Var2.B2(a0VarF)), bVar2, false, eVarI, lVarI, f11, r0Var4, 2, null);
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = a.f18610a;
                        c0VarR.Y(objI0);
                    }
                    androidx.compose.ui.layout.a1 a1Var4 = (androidx.compose.ui.layout.a1) objI0;
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, i22));
                    androidx.compose.ui.a0 a0VarN4 = androidx.compose.ui.m.n(c0VarR, a0VarB4);
                    androidx.compose.runtime.b1 b1VarK4 = c0VarR.k();
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
                    y7.n(c0VarD, a1Var4, aVar8.e());
                    y7.n(c0VarD, b1VarK4, aVar8.g());
                    y7.n(c0VarD, a0VarN4, aVar8.f());
                    function2B = aVar8.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    c0VarR.o();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    eVar3 = eVarI;
                    lVar2 = lVarI;
                    r0Var3 = r0Var4;
                } else {
                    c0VarR.u();
                    r0Var3 = r0Var2;
                    eVar3 = eVar2;
                    lVar2 = lVar;
                }
                a0Var3 = a0Var2;
                f12 = f11;
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.foundation.q2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return s2.g(bVar, str, a0Var3, eVar3, lVar2, f12, r0Var3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 3072;
            eVar2 = eVar;
            i15 = i11 & 16;
            if (i15 != 0) {
                if ((i10 & 24576) == 0) {
                    if (c0VarR.D(lVar)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 32;
                if (i17 != 0) {
                    if ((196608 & i10) == 0) {
                        f11 = f10;
                        if (c0VarR.I(f11)) {
                            i18 = 131072;
                        } else {
                            i18 = 65536;
                        }
                        i12 |= i18;
                    }
                    i19 = i11 & 64;
                    if (i19 != 0) {
                        i12 |= 1572864;
                        r0Var2 = r0Var;
                    } else {
                        r0Var2 = r0Var;
                        if ((i10 & 1572864) == 0) {
                            if (c0VarR.D(r0Var2)) {
                                i20 = 1048576;
                            } else {
                                i20 = 524288;
                            }
                            i12 |= i20;
                        }
                    }
                    if ((i12 & 599187) != 599186) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i12 & 1)) {
                        if (i23 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            eVarI = androidx.compose.ui.e.f37317a.i();
                        } else {
                            eVarI = eVar2;
                        }
                        if (i15 != 0) {
                            lVarI = androidx.compose.ui.layout.l.f39405a.i();
                            i21 = i17;
                        } else {
                            i21 = i17;
                            lVarI = lVar;
                        }
                        if (i21 != 0) {
                            f11 = 1.0f;
                        }
                        if (i19 != 0) {
                            r0Var4 = null;
                        } else {
                            r0Var4 = r0Var2;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(1142754848, i12, -1, "androidx.compose.foundation.Image (Image.kt:247)");
                        }
                        if (str != null) {
                            c0VarR.E(1899234820);
                            androidx.compose.ui.a0.a aVar9 = androidx.compose.ui.a0.E;
                            if ((i12 & com.planner5d.library.engine.input.f.b.B) == 32) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            objI1 = c0VarR.i0();
                            if (z11) {
                                objI1 = new Function1() { // from class: androidx.compose.foundation.p2
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return s2.f(str, (androidx.compose.ui.semantics.e0) obj);
                                    }
                                };
                                c0VarR.Y(objI1);
                            } else {
                                objI1 = new Function1() { // from class: androidx.compose.foundation.p2
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return s2.f(str, (androidx.compose.ui.semantics.e0) obj);
                                    }
                                };
                                c0VarR.Y(objI1);
                            }
                            i22 = 0;
                            a0VarF = androidx.compose.ui.semantics.t.f(aVar9, false, (Function1) objI1, 1, null);
                            c0VarR.A();
                        } else {
                            i22 = 0;
                            c0VarR.E(1899393602);
                            c0VarR.A();
                            a0VarF = androidx.compose.ui.a0.E;
                        }
                        androidx.compose.ui.a0 a0VarB5 = androidx.compose.ui.draw.t.b(androidx.compose.ui.draw.j.b(a0Var2.B2(a0VarF)), bVar2, false, eVarI, lVarI, f11, r0Var4, 2, null);
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = a.f18610a;
                            c0VarR.Y(objI0);
                        }
                        androidx.compose.ui.layout.a1 a1Var5 = (androidx.compose.ui.layout.a1) objI0;
                        iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, i22));
                        androidx.compose.ui.a0 a0VarN5 = androidx.compose.ui.m.n(c0VarR, a0VarB5);
                        androidx.compose.runtime.b1 b1VarK5 = c0VarR.k();
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
                        y7.n(c0VarD, a1Var5, aVar10.e());
                        y7.n(c0VarD, b1VarK5, aVar10.g());
                        y7.n(c0VarD, a0VarN5, aVar10.f());
                        function2B = aVar10.b();
                        if (c0VarD.P()) {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        } else {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        }
                        c0VarR.o();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        eVar3 = eVarI;
                        lVar2 = lVarI;
                        r0Var3 = r0Var4;
                    } else {
                        c0VarR.u();
                        r0Var3 = r0Var2;
                        eVar3 = eVar2;
                        lVar2 = lVar;
                    }
                    a0Var3 = a0Var2;
                    f12 = f11;
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.foundation.q2
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return s2.g(bVar, str, a0Var3, eVar3, lVar2, f12, r0Var3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= androidx.profileinstaller.n.c.f73814m;
                f11 = f10;
                i19 = i11 & 64;
                if (i19 != 0) {
                    i12 |= 1572864;
                    r0Var2 = r0Var;
                } else {
                    r0Var2 = r0Var;
                    if ((i10 & 1572864) == 0) {
                        if (c0VarR.D(r0Var2)) {
                            i20 = 1048576;
                        } else {
                            i20 = 524288;
                        }
                        i12 |= i20;
                    }
                }
                if ((i12 & 599187) != 599186) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i12 & 1)) {
                    if (i23 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i13 != 0) {
                        eVarI = androidx.compose.ui.e.f37317a.i();
                    } else {
                        eVarI = eVar2;
                    }
                    if (i15 != 0) {
                        lVarI = androidx.compose.ui.layout.l.f39405a.i();
                        i21 = i17;
                    } else {
                        i21 = i17;
                        lVarI = lVar;
                    }
                    if (i21 != 0) {
                        f11 = 1.0f;
                    }
                    if (i19 != 0) {
                        r0Var4 = null;
                    } else {
                        r0Var4 = r0Var2;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1142754848, i12, -1, "androidx.compose.foundation.Image (Image.kt:247)");
                    }
                    if (str != null) {
                        c0VarR.E(1899234820);
                        androidx.compose.ui.a0.a aVar11 = androidx.compose.ui.a0.E;
                        if ((i12 & com.planner5d.library.engine.input.f.b.B) == 32) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        objI1 = c0VarR.i0();
                        if (z11) {
                            objI1 = new Function1() { // from class: androidx.compose.foundation.p2
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return s2.f(str, (androidx.compose.ui.semantics.e0) obj);
                                }
                            };
                            c0VarR.Y(objI1);
                        } else {
                            objI1 = new Function1() { // from class: androidx.compose.foundation.p2
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return s2.f(str, (androidx.compose.ui.semantics.e0) obj);
                                }
                            };
                            c0VarR.Y(objI1);
                        }
                        i22 = 0;
                        a0VarF = androidx.compose.ui.semantics.t.f(aVar11, false, (Function1) objI1, 1, null);
                        c0VarR.A();
                    } else {
                        i22 = 0;
                        c0VarR.E(1899393602);
                        c0VarR.A();
                        a0VarF = androidx.compose.ui.a0.E;
                    }
                    androidx.compose.ui.a0 a0VarB6 = androidx.compose.ui.draw.t.b(androidx.compose.ui.draw.j.b(a0Var2.B2(a0VarF)), bVar2, false, eVarI, lVarI, f11, r0Var4, 2, null);
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = a.f18610a;
                        c0VarR.Y(objI0);
                    }
                    androidx.compose.ui.layout.a1 a1Var6 = (androidx.compose.ui.layout.a1) objI0;
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, i22));
                    androidx.compose.ui.a0 a0VarN6 = androidx.compose.ui.m.n(c0VarR, a0VarB6);
                    androidx.compose.runtime.b1 b1VarK6 = c0VarR.k();
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
                    y7.n(c0VarD, a1Var6, aVar12.e());
                    y7.n(c0VarD, b1VarK6, aVar12.g());
                    y7.n(c0VarD, a0VarN6, aVar12.f());
                    function2B = aVar12.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    c0VarR.o();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    eVar3 = eVarI;
                    lVar2 = lVarI;
                    r0Var3 = r0Var4;
                } else {
                    c0VarR.u();
                    r0Var3 = r0Var2;
                    eVar3 = eVar2;
                    lVar2 = lVar;
                }
                a0Var3 = a0Var2;
                f12 = f11;
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.foundation.q2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return s2.g(bVar, str, a0Var3, eVar3, lVar2, f12, r0Var3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 24576;
            i17 = i11 & 32;
            if (i17 != 0) {
                if ((196608 & i10) == 0) {
                    f11 = f10;
                    if (c0VarR.I(f11)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i12 |= i18;
                }
                i19 = i11 & 64;
                if (i19 != 0) {
                    i12 |= 1572864;
                    r0Var2 = r0Var;
                } else {
                    r0Var2 = r0Var;
                    if ((i10 & 1572864) == 0) {
                        if (c0VarR.D(r0Var2)) {
                            i20 = 1048576;
                        } else {
                            i20 = 524288;
                        }
                        i12 |= i20;
                    }
                }
                if ((i12 & 599187) != 599186) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i12 & 1)) {
                    if (i23 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i13 != 0) {
                        eVarI = androidx.compose.ui.e.f37317a.i();
                    } else {
                        eVarI = eVar2;
                    }
                    if (i15 != 0) {
                        lVarI = androidx.compose.ui.layout.l.f39405a.i();
                        i21 = i17;
                    } else {
                        i21 = i17;
                        lVarI = lVar;
                    }
                    if (i21 != 0) {
                        f11 = 1.0f;
                    }
                    if (i19 != 0) {
                        r0Var4 = null;
                    } else {
                        r0Var4 = r0Var2;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1142754848, i12, -1, "androidx.compose.foundation.Image (Image.kt:247)");
                    }
                    if (str != null) {
                        c0VarR.E(1899234820);
                        androidx.compose.ui.a0.a aVar13 = androidx.compose.ui.a0.E;
                        if ((i12 & com.planner5d.library.engine.input.f.b.B) == 32) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        objI1 = c0VarR.i0();
                        if (z11) {
                            objI1 = new Function1() { // from class: androidx.compose.foundation.p2
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return s2.f(str, (androidx.compose.ui.semantics.e0) obj);
                                }
                            };
                            c0VarR.Y(objI1);
                        } else {
                            objI1 = new Function1() { // from class: androidx.compose.foundation.p2
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return s2.f(str, (androidx.compose.ui.semantics.e0) obj);
                                }
                            };
                            c0VarR.Y(objI1);
                        }
                        i22 = 0;
                        a0VarF = androidx.compose.ui.semantics.t.f(aVar13, false, (Function1) objI1, 1, null);
                        c0VarR.A();
                    } else {
                        i22 = 0;
                        c0VarR.E(1899393602);
                        c0VarR.A();
                        a0VarF = androidx.compose.ui.a0.E;
                    }
                    androidx.compose.ui.a0 a0VarB7 = androidx.compose.ui.draw.t.b(androidx.compose.ui.draw.j.b(a0Var2.B2(a0VarF)), bVar2, false, eVarI, lVarI, f11, r0Var4, 2, null);
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = a.f18610a;
                        c0VarR.Y(objI0);
                    }
                    androidx.compose.ui.layout.a1 a1Var7 = (androidx.compose.ui.layout.a1) objI0;
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, i22));
                    androidx.compose.ui.a0 a0VarN7 = androidx.compose.ui.m.n(c0VarR, a0VarB7);
                    androidx.compose.runtime.b1 b1VarK7 = c0VarR.k();
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
                    y7.n(c0VarD, a1Var7, aVar14.e());
                    y7.n(c0VarD, b1VarK7, aVar14.g());
                    y7.n(c0VarD, a0VarN7, aVar14.f());
                    function2B = aVar14.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    c0VarR.o();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    eVar3 = eVarI;
                    lVar2 = lVarI;
                    r0Var3 = r0Var4;
                } else {
                    c0VarR.u();
                    r0Var3 = r0Var2;
                    eVar3 = eVar2;
                    lVar2 = lVar;
                }
                a0Var3 = a0Var2;
                f12 = f11;
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.foundation.q2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return s2.g(bVar, str, a0Var3, eVar3, lVar2, f12, r0Var3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= androidx.profileinstaller.n.c.f73814m;
            f11 = f10;
            i19 = i11 & 64;
            if (i19 != 0) {
                i12 |= 1572864;
                r0Var2 = r0Var;
            } else {
                r0Var2 = r0Var;
                if ((i10 & 1572864) == 0) {
                    if (c0VarR.D(r0Var2)) {
                        i20 = 1048576;
                    } else {
                        i20 = 524288;
                    }
                    i12 |= i20;
                }
            }
            if ((i12 & 599187) != 599186) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i12 & 1)) {
                if (i23 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                }
                if (i13 != 0) {
                    eVarI = androidx.compose.ui.e.f37317a.i();
                } else {
                    eVarI = eVar2;
                }
                if (i15 != 0) {
                    lVarI = androidx.compose.ui.layout.l.f39405a.i();
                    i21 = i17;
                } else {
                    i21 = i17;
                    lVarI = lVar;
                }
                if (i21 != 0) {
                    f11 = 1.0f;
                }
                if (i19 != 0) {
                    r0Var4 = null;
                } else {
                    r0Var4 = r0Var2;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1142754848, i12, -1, "androidx.compose.foundation.Image (Image.kt:247)");
                }
                if (str != null) {
                    c0VarR.E(1899234820);
                    androidx.compose.ui.a0.a aVar15 = androidx.compose.ui.a0.E;
                    if ((i12 & com.planner5d.library.engine.input.f.b.B) == 32) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    objI1 = c0VarR.i0();
                    if (z11) {
                        objI1 = new Function1() { // from class: androidx.compose.foundation.p2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return s2.f(str, (androidx.compose.ui.semantics.e0) obj);
                            }
                        };
                        c0VarR.Y(objI1);
                    } else {
                        objI1 = new Function1() { // from class: androidx.compose.foundation.p2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return s2.f(str, (androidx.compose.ui.semantics.e0) obj);
                            }
                        };
                        c0VarR.Y(objI1);
                    }
                    i22 = 0;
                    a0VarF = androidx.compose.ui.semantics.t.f(aVar15, false, (Function1) objI1, 1, null);
                    c0VarR.A();
                } else {
                    i22 = 0;
                    c0VarR.E(1899393602);
                    c0VarR.A();
                    a0VarF = androidx.compose.ui.a0.E;
                }
                androidx.compose.ui.a0 a0VarB8 = androidx.compose.ui.draw.t.b(androidx.compose.ui.draw.j.b(a0Var2.B2(a0VarF)), bVar2, false, eVarI, lVarI, f11, r0Var4, 2, null);
                objI0 = c0VarR.i0();
                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = a.f18610a;
                    c0VarR.Y(objI0);
                }
                androidx.compose.ui.layout.a1 a1Var8 = (androidx.compose.ui.layout.a1) objI0;
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, i22));
                androidx.compose.ui.a0 a0VarN8 = androidx.compose.ui.m.n(c0VarR, a0VarB8);
                androidx.compose.runtime.b1 b1VarK8 = c0VarR.k();
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
                y7.n(c0VarD, a1Var8, aVar16.e());
                y7.n(c0VarD, b1VarK8, aVar16.g());
                y7.n(c0VarD, a0VarN8, aVar16.f());
                function2B = aVar16.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                c0VarR.o();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                eVar3 = eVarI;
                lVar2 = lVarI;
                r0Var3 = r0Var4;
            } else {
                c0VarR.u();
                r0Var3 = r0Var2;
                eVar3 = eVar2;
                lVar2 = lVar;
            }
            a0Var3 = a0Var2;
            f12 = f11;
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.foundation.q2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return s2.g(bVar, str, a0Var3, eVar3, lVar2, f12, r0Var3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= androidx.media3.exoplayer.a5.S0;
        a0Var2 = a0Var;
        i13 = i11 & 8;
        if (i13 != 0) {
            if ((i10 & 3072) == 0) {
                eVar2 = eVar;
                if (c0VarR.D(eVar2)) {
                    i14 = 2048;
                } else {
                    i14 = 1024;
                }
                i12 |= i14;
            }
            i15 = i11 & 16;
            if (i15 != 0) {
                if ((i10 & 24576) == 0) {
                    if (c0VarR.D(lVar)) {
                        i16 = 16384;
                    } else {
                        i16 = 8192;
                    }
                    i12 |= i16;
                }
                i17 = i11 & 32;
                if (i17 != 0) {
                    if ((196608 & i10) == 0) {
                        f11 = f10;
                        if (c0VarR.I(f11)) {
                            i18 = 131072;
                        } else {
                            i18 = 65536;
                        }
                        i12 |= i18;
                    }
                    i19 = i11 & 64;
                    if (i19 != 0) {
                        i12 |= 1572864;
                        r0Var2 = r0Var;
                    } else {
                        r0Var2 = r0Var;
                        if ((i10 & 1572864) == 0) {
                            if (c0VarR.D(r0Var2)) {
                                i20 = 1048576;
                            } else {
                                i20 = 524288;
                            }
                            i12 |= i20;
                        }
                    }
                    if ((i12 & 599187) != 599186) {
                        z10 = true;
                    } else {
                        z10 = false;
                    }
                    if (c0VarR.h(z10, i12 & 1)) {
                        if (i23 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            eVarI = androidx.compose.ui.e.f37317a.i();
                        } else {
                            eVarI = eVar2;
                        }
                        if (i15 != 0) {
                            lVarI = androidx.compose.ui.layout.l.f39405a.i();
                            i21 = i17;
                        } else {
                            i21 = i17;
                            lVarI = lVar;
                        }
                        if (i21 != 0) {
                            f11 = 1.0f;
                        }
                        if (i19 != 0) {
                            r0Var4 = null;
                        } else {
                            r0Var4 = r0Var2;
                        }
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(1142754848, i12, -1, "androidx.compose.foundation.Image (Image.kt:247)");
                        }
                        if (str != null) {
                            c0VarR.E(1899234820);
                            androidx.compose.ui.a0.a aVar17 = androidx.compose.ui.a0.E;
                            if ((i12 & com.planner5d.library.engine.input.f.b.B) == 32) {
                                z11 = true;
                            } else {
                                z11 = false;
                            }
                            objI1 = c0VarR.i0();
                            if (z11) {
                                objI1 = new Function1() { // from class: androidx.compose.foundation.p2
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return s2.f(str, (androidx.compose.ui.semantics.e0) obj);
                                    }
                                };
                                c0VarR.Y(objI1);
                            } else {
                                objI1 = new Function1() { // from class: androidx.compose.foundation.p2
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return s2.f(str, (androidx.compose.ui.semantics.e0) obj);
                                    }
                                };
                                c0VarR.Y(objI1);
                            }
                            i22 = 0;
                            a0VarF = androidx.compose.ui.semantics.t.f(aVar17, false, (Function1) objI1, 1, null);
                            c0VarR.A();
                        } else {
                            i22 = 0;
                            c0VarR.E(1899393602);
                            c0VarR.A();
                            a0VarF = androidx.compose.ui.a0.E;
                        }
                        androidx.compose.ui.a0 a0VarB9 = androidx.compose.ui.draw.t.b(androidx.compose.ui.draw.j.b(a0Var2.B2(a0VarF)), bVar2, false, eVarI, lVarI, f11, r0Var4, 2, null);
                        objI0 = c0VarR.i0();
                        if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                            objI0 = a.f18610a;
                            c0VarR.Y(objI0);
                        }
                        androidx.compose.ui.layout.a1 a1Var9 = (androidx.compose.ui.layout.a1) objI0;
                        iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, i22));
                        androidx.compose.ui.a0 a0VarN9 = androidx.compose.ui.m.n(c0VarR, a0VarB9);
                        androidx.compose.runtime.b1 b1VarK9 = c0VarR.k();
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
                        y7.n(c0VarD, a1Var9, aVar18.e());
                        y7.n(c0VarD, b1VarK9, aVar18.g());
                        y7.n(c0VarD, a0VarN9, aVar18.f());
                        function2B = aVar18.b();
                        if (c0VarD.P()) {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        } else {
                            c0VarD.Y(Integer.valueOf(iHashCode));
                            c0VarD.f(Integer.valueOf(iHashCode), function2B);
                        }
                        c0VarR.o();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        eVar3 = eVarI;
                        lVar2 = lVarI;
                        r0Var3 = r0Var4;
                    } else {
                        c0VarR.u();
                        r0Var3 = r0Var2;
                        eVar3 = eVar2;
                        lVar2 = lVar;
                    }
                    a0Var3 = a0Var2;
                    f12 = f11;
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.foundation.q2
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return s2.g(bVar, str, a0Var3, eVar3, lVar2, f12, r0Var3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= androidx.profileinstaller.n.c.f73814m;
                f11 = f10;
                i19 = i11 & 64;
                if (i19 != 0) {
                    i12 |= 1572864;
                    r0Var2 = r0Var;
                } else {
                    r0Var2 = r0Var;
                    if ((i10 & 1572864) == 0) {
                        if (c0VarR.D(r0Var2)) {
                            i20 = 1048576;
                        } else {
                            i20 = 524288;
                        }
                        i12 |= i20;
                    }
                }
                if ((i12 & 599187) != 599186) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i12 & 1)) {
                    if (i23 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i13 != 0) {
                        eVarI = androidx.compose.ui.e.f37317a.i();
                    } else {
                        eVarI = eVar2;
                    }
                    if (i15 != 0) {
                        lVarI = androidx.compose.ui.layout.l.f39405a.i();
                        i21 = i17;
                    } else {
                        i21 = i17;
                        lVarI = lVar;
                    }
                    if (i21 != 0) {
                        f11 = 1.0f;
                    }
                    if (i19 != 0) {
                        r0Var4 = null;
                    } else {
                        r0Var4 = r0Var2;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1142754848, i12, -1, "androidx.compose.foundation.Image (Image.kt:247)");
                    }
                    if (str != null) {
                        c0VarR.E(1899234820);
                        androidx.compose.ui.a0.a aVar19 = androidx.compose.ui.a0.E;
                        if ((i12 & com.planner5d.library.engine.input.f.b.B) == 32) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        objI1 = c0VarR.i0();
                        if (z11) {
                            objI1 = new Function1() { // from class: androidx.compose.foundation.p2
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return s2.f(str, (androidx.compose.ui.semantics.e0) obj);
                                }
                            };
                            c0VarR.Y(objI1);
                        } else {
                            objI1 = new Function1() { // from class: androidx.compose.foundation.p2
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return s2.f(str, (androidx.compose.ui.semantics.e0) obj);
                                }
                            };
                            c0VarR.Y(objI1);
                        }
                        i22 = 0;
                        a0VarF = androidx.compose.ui.semantics.t.f(aVar19, false, (Function1) objI1, 1, null);
                        c0VarR.A();
                    } else {
                        i22 = 0;
                        c0VarR.E(1899393602);
                        c0VarR.A();
                        a0VarF = androidx.compose.ui.a0.E;
                    }
                    androidx.compose.ui.a0 a0VarB10 = androidx.compose.ui.draw.t.b(androidx.compose.ui.draw.j.b(a0Var2.B2(a0VarF)), bVar2, false, eVarI, lVarI, f11, r0Var4, 2, null);
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = a.f18610a;
                        c0VarR.Y(objI0);
                    }
                    androidx.compose.ui.layout.a1 a1Var10 = (androidx.compose.ui.layout.a1) objI0;
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, i22));
                    androidx.compose.ui.a0 a0VarN10 = androidx.compose.ui.m.n(c0VarR, a0VarB10);
                    androidx.compose.runtime.b1 b1VarK10 = c0VarR.k();
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
                    y7.n(c0VarD, a1Var10, aVar110.e());
                    y7.n(c0VarD, b1VarK10, aVar110.g());
                    y7.n(c0VarD, a0VarN10, aVar110.f());
                    function2B = aVar110.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    c0VarR.o();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    eVar3 = eVarI;
                    lVar2 = lVarI;
                    r0Var3 = r0Var4;
                } else {
                    c0VarR.u();
                    r0Var3 = r0Var2;
                    eVar3 = eVar2;
                    lVar2 = lVar;
                }
                a0Var3 = a0Var2;
                f12 = f11;
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.foundation.q2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return s2.g(bVar, str, a0Var3, eVar3, lVar2, f12, r0Var3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 24576;
            i17 = i11 & 32;
            if (i17 != 0) {
                if ((196608 & i10) == 0) {
                    f11 = f10;
                    if (c0VarR.I(f11)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i12 |= i18;
                }
                i19 = i11 & 64;
                if (i19 != 0) {
                    i12 |= 1572864;
                    r0Var2 = r0Var;
                } else {
                    r0Var2 = r0Var;
                    if ((i10 & 1572864) == 0) {
                        if (c0VarR.D(r0Var2)) {
                            i20 = 1048576;
                        } else {
                            i20 = 524288;
                        }
                        i12 |= i20;
                    }
                }
                if ((i12 & 599187) != 599186) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i12 & 1)) {
                    if (i23 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i13 != 0) {
                        eVarI = androidx.compose.ui.e.f37317a.i();
                    } else {
                        eVarI = eVar2;
                    }
                    if (i15 != 0) {
                        lVarI = androidx.compose.ui.layout.l.f39405a.i();
                        i21 = i17;
                    } else {
                        i21 = i17;
                        lVarI = lVar;
                    }
                    if (i21 != 0) {
                        f11 = 1.0f;
                    }
                    if (i19 != 0) {
                        r0Var4 = null;
                    } else {
                        r0Var4 = r0Var2;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1142754848, i12, -1, "androidx.compose.foundation.Image (Image.kt:247)");
                    }
                    if (str != null) {
                        c0VarR.E(1899234820);
                        androidx.compose.ui.a0.a aVar111 = androidx.compose.ui.a0.E;
                        if ((i12 & com.planner5d.library.engine.input.f.b.B) == 32) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        objI1 = c0VarR.i0();
                        if (z11) {
                            objI1 = new Function1() { // from class: androidx.compose.foundation.p2
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return s2.f(str, (androidx.compose.ui.semantics.e0) obj);
                                }
                            };
                            c0VarR.Y(objI1);
                        } else {
                            objI1 = new Function1() { // from class: androidx.compose.foundation.p2
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return s2.f(str, (androidx.compose.ui.semantics.e0) obj);
                                }
                            };
                            c0VarR.Y(objI1);
                        }
                        i22 = 0;
                        a0VarF = androidx.compose.ui.semantics.t.f(aVar111, false, (Function1) objI1, 1, null);
                        c0VarR.A();
                    } else {
                        i22 = 0;
                        c0VarR.E(1899393602);
                        c0VarR.A();
                        a0VarF = androidx.compose.ui.a0.E;
                    }
                    androidx.compose.ui.a0 a0VarB11 = androidx.compose.ui.draw.t.b(androidx.compose.ui.draw.j.b(a0Var2.B2(a0VarF)), bVar2, false, eVarI, lVarI, f11, r0Var4, 2, null);
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = a.f18610a;
                        c0VarR.Y(objI0);
                    }
                    androidx.compose.ui.layout.a1 a1Var11 = (androidx.compose.ui.layout.a1) objI0;
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, i22));
                    androidx.compose.ui.a0 a0VarN11 = androidx.compose.ui.m.n(c0VarR, a0VarB11);
                    androidx.compose.runtime.b1 b1VarK11 = c0VarR.k();
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
                    y7.n(c0VarD, a1Var11, aVar112.e());
                    y7.n(c0VarD, b1VarK11, aVar112.g());
                    y7.n(c0VarD, a0VarN11, aVar112.f());
                    function2B = aVar112.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    c0VarR.o();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    eVar3 = eVarI;
                    lVar2 = lVarI;
                    r0Var3 = r0Var4;
                } else {
                    c0VarR.u();
                    r0Var3 = r0Var2;
                    eVar3 = eVar2;
                    lVar2 = lVar;
                }
                a0Var3 = a0Var2;
                f12 = f11;
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.foundation.q2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return s2.g(bVar, str, a0Var3, eVar3, lVar2, f12, r0Var3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= androidx.profileinstaller.n.c.f73814m;
            f11 = f10;
            i19 = i11 & 64;
            if (i19 != 0) {
                i12 |= 1572864;
                r0Var2 = r0Var;
            } else {
                r0Var2 = r0Var;
                if ((i10 & 1572864) == 0) {
                    if (c0VarR.D(r0Var2)) {
                        i20 = 1048576;
                    } else {
                        i20 = 524288;
                    }
                    i12 |= i20;
                }
            }
            if ((i12 & 599187) != 599186) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i12 & 1)) {
                if (i23 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                }
                if (i13 != 0) {
                    eVarI = androidx.compose.ui.e.f37317a.i();
                } else {
                    eVarI = eVar2;
                }
                if (i15 != 0) {
                    lVarI = androidx.compose.ui.layout.l.f39405a.i();
                    i21 = i17;
                } else {
                    i21 = i17;
                    lVarI = lVar;
                }
                if (i21 != 0) {
                    f11 = 1.0f;
                }
                if (i19 != 0) {
                    r0Var4 = null;
                } else {
                    r0Var4 = r0Var2;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1142754848, i12, -1, "androidx.compose.foundation.Image (Image.kt:247)");
                }
                if (str != null) {
                    c0VarR.E(1899234820);
                    androidx.compose.ui.a0.a aVar113 = androidx.compose.ui.a0.E;
                    if ((i12 & com.planner5d.library.engine.input.f.b.B) == 32) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    objI1 = c0VarR.i0();
                    if (z11) {
                        objI1 = new Function1() { // from class: androidx.compose.foundation.p2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return s2.f(str, (androidx.compose.ui.semantics.e0) obj);
                            }
                        };
                        c0VarR.Y(objI1);
                    } else {
                        objI1 = new Function1() { // from class: androidx.compose.foundation.p2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return s2.f(str, (androidx.compose.ui.semantics.e0) obj);
                            }
                        };
                        c0VarR.Y(objI1);
                    }
                    i22 = 0;
                    a0VarF = androidx.compose.ui.semantics.t.f(aVar113, false, (Function1) objI1, 1, null);
                    c0VarR.A();
                } else {
                    i22 = 0;
                    c0VarR.E(1899393602);
                    c0VarR.A();
                    a0VarF = androidx.compose.ui.a0.E;
                }
                androidx.compose.ui.a0 a0VarB12 = androidx.compose.ui.draw.t.b(androidx.compose.ui.draw.j.b(a0Var2.B2(a0VarF)), bVar2, false, eVarI, lVarI, f11, r0Var4, 2, null);
                objI0 = c0VarR.i0();
                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = a.f18610a;
                    c0VarR.Y(objI0);
                }
                androidx.compose.ui.layout.a1 a1Var12 = (androidx.compose.ui.layout.a1) objI0;
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, i22));
                androidx.compose.ui.a0 a0VarN12 = androidx.compose.ui.m.n(c0VarR, a0VarB12);
                androidx.compose.runtime.b1 b1VarK12 = c0VarR.k();
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
                y7.n(c0VarD, a1Var12, aVar114.e());
                y7.n(c0VarD, b1VarK12, aVar114.g());
                y7.n(c0VarD, a0VarN12, aVar114.f());
                function2B = aVar114.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                c0VarR.o();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                eVar3 = eVarI;
                lVar2 = lVarI;
                r0Var3 = r0Var4;
            } else {
                c0VarR.u();
                r0Var3 = r0Var2;
                eVar3 = eVar2;
                lVar2 = lVar;
            }
            a0Var3 = a0Var2;
            f12 = f11;
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.foundation.q2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return s2.g(bVar, str, a0Var3, eVar3, lVar2, f12, r0Var3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 3072;
        eVar2 = eVar;
        i15 = i11 & 16;
        if (i15 != 0) {
            if ((i10 & 24576) == 0) {
                if (c0VarR.D(lVar)) {
                    i16 = 16384;
                } else {
                    i16 = 8192;
                }
                i12 |= i16;
            }
            i17 = i11 & 32;
            if (i17 != 0) {
                if ((196608 & i10) == 0) {
                    f11 = f10;
                    if (c0VarR.I(f11)) {
                        i18 = 131072;
                    } else {
                        i18 = 65536;
                    }
                    i12 |= i18;
                }
                i19 = i11 & 64;
                if (i19 != 0) {
                    i12 |= 1572864;
                    r0Var2 = r0Var;
                } else {
                    r0Var2 = r0Var;
                    if ((i10 & 1572864) == 0) {
                        if (c0VarR.D(r0Var2)) {
                            i20 = 1048576;
                        } else {
                            i20 = 524288;
                        }
                        i12 |= i20;
                    }
                }
                if ((i12 & 599187) != 599186) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i12 & 1)) {
                    if (i23 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i13 != 0) {
                        eVarI = androidx.compose.ui.e.f37317a.i();
                    } else {
                        eVarI = eVar2;
                    }
                    if (i15 != 0) {
                        lVarI = androidx.compose.ui.layout.l.f39405a.i();
                        i21 = i17;
                    } else {
                        i21 = i17;
                        lVarI = lVar;
                    }
                    if (i21 != 0) {
                        f11 = 1.0f;
                    }
                    if (i19 != 0) {
                        r0Var4 = null;
                    } else {
                        r0Var4 = r0Var2;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1142754848, i12, -1, "androidx.compose.foundation.Image (Image.kt:247)");
                    }
                    if (str != null) {
                        c0VarR.E(1899234820);
                        androidx.compose.ui.a0.a aVar115 = androidx.compose.ui.a0.E;
                        if ((i12 & com.planner5d.library.engine.input.f.b.B) == 32) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        objI1 = c0VarR.i0();
                        if (z11) {
                            objI1 = new Function1() { // from class: androidx.compose.foundation.p2
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return s2.f(str, (androidx.compose.ui.semantics.e0) obj);
                                }
                            };
                            c0VarR.Y(objI1);
                        } else {
                            objI1 = new Function1() { // from class: androidx.compose.foundation.p2
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return s2.f(str, (androidx.compose.ui.semantics.e0) obj);
                                }
                            };
                            c0VarR.Y(objI1);
                        }
                        i22 = 0;
                        a0VarF = androidx.compose.ui.semantics.t.f(aVar115, false, (Function1) objI1, 1, null);
                        c0VarR.A();
                    } else {
                        i22 = 0;
                        c0VarR.E(1899393602);
                        c0VarR.A();
                        a0VarF = androidx.compose.ui.a0.E;
                    }
                    androidx.compose.ui.a0 a0VarB13 = androidx.compose.ui.draw.t.b(androidx.compose.ui.draw.j.b(a0Var2.B2(a0VarF)), bVar2, false, eVarI, lVarI, f11, r0Var4, 2, null);
                    objI0 = c0VarR.i0();
                    if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = a.f18610a;
                        c0VarR.Y(objI0);
                    }
                    androidx.compose.ui.layout.a1 a1Var13 = (androidx.compose.ui.layout.a1) objI0;
                    iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, i22));
                    androidx.compose.ui.a0 a0VarN13 = androidx.compose.ui.m.n(c0VarR, a0VarB13);
                    androidx.compose.runtime.b1 b1VarK13 = c0VarR.k();
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
                    y7.n(c0VarD, a1Var13, aVar116.e());
                    y7.n(c0VarD, b1VarK13, aVar116.g());
                    y7.n(c0VarD, a0VarN13, aVar116.f());
                    function2B = aVar116.b();
                    if (c0VarD.P()) {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iHashCode));
                        c0VarD.f(Integer.valueOf(iHashCode), function2B);
                    }
                    c0VarR.o();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    eVar3 = eVarI;
                    lVar2 = lVarI;
                    r0Var3 = r0Var4;
                } else {
                    c0VarR.u();
                    r0Var3 = r0Var2;
                    eVar3 = eVar2;
                    lVar2 = lVar;
                }
                a0Var3 = a0Var2;
                f12 = f11;
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.foundation.q2
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return s2.g(bVar, str, a0Var3, eVar3, lVar2, f12, r0Var3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= androidx.profileinstaller.n.c.f73814m;
            f11 = f10;
            i19 = i11 & 64;
            if (i19 != 0) {
                i12 |= 1572864;
                r0Var2 = r0Var;
            } else {
                r0Var2 = r0Var;
                if ((i10 & 1572864) == 0) {
                    if (c0VarR.D(r0Var2)) {
                        i20 = 1048576;
                    } else {
                        i20 = 524288;
                    }
                    i12 |= i20;
                }
            }
            if ((i12 & 599187) != 599186) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i12 & 1)) {
                if (i23 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                }
                if (i13 != 0) {
                    eVarI = androidx.compose.ui.e.f37317a.i();
                } else {
                    eVarI = eVar2;
                }
                if (i15 != 0) {
                    lVarI = androidx.compose.ui.layout.l.f39405a.i();
                    i21 = i17;
                } else {
                    i21 = i17;
                    lVarI = lVar;
                }
                if (i21 != 0) {
                    f11 = 1.0f;
                }
                if (i19 != 0) {
                    r0Var4 = null;
                } else {
                    r0Var4 = r0Var2;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1142754848, i12, -1, "androidx.compose.foundation.Image (Image.kt:247)");
                }
                if (str != null) {
                    c0VarR.E(1899234820);
                    androidx.compose.ui.a0.a aVar117 = androidx.compose.ui.a0.E;
                    if ((i12 & com.planner5d.library.engine.input.f.b.B) == 32) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    objI1 = c0VarR.i0();
                    if (z11) {
                        objI1 = new Function1() { // from class: androidx.compose.foundation.p2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return s2.f(str, (androidx.compose.ui.semantics.e0) obj);
                            }
                        };
                        c0VarR.Y(objI1);
                    } else {
                        objI1 = new Function1() { // from class: androidx.compose.foundation.p2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return s2.f(str, (androidx.compose.ui.semantics.e0) obj);
                            }
                        };
                        c0VarR.Y(objI1);
                    }
                    i22 = 0;
                    a0VarF = androidx.compose.ui.semantics.t.f(aVar117, false, (Function1) objI1, 1, null);
                    c0VarR.A();
                } else {
                    i22 = 0;
                    c0VarR.E(1899393602);
                    c0VarR.A();
                    a0VarF = androidx.compose.ui.a0.E;
                }
                androidx.compose.ui.a0 a0VarB14 = androidx.compose.ui.draw.t.b(androidx.compose.ui.draw.j.b(a0Var2.B2(a0VarF)), bVar2, false, eVarI, lVarI, f11, r0Var4, 2, null);
                objI0 = c0VarR.i0();
                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = a.f18610a;
                    c0VarR.Y(objI0);
                }
                androidx.compose.ui.layout.a1 a1Var14 = (androidx.compose.ui.layout.a1) objI0;
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, i22));
                androidx.compose.ui.a0 a0VarN14 = androidx.compose.ui.m.n(c0VarR, a0VarB14);
                androidx.compose.runtime.b1 b1VarK14 = c0VarR.k();
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
                y7.n(c0VarD, a1Var14, aVar118.e());
                y7.n(c0VarD, b1VarK14, aVar118.g());
                y7.n(c0VarD, a0VarN14, aVar118.f());
                function2B = aVar118.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                c0VarR.o();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                eVar3 = eVarI;
                lVar2 = lVarI;
                r0Var3 = r0Var4;
            } else {
                c0VarR.u();
                r0Var3 = r0Var2;
                eVar3 = eVar2;
                lVar2 = lVar;
            }
            a0Var3 = a0Var2;
            f12 = f11;
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.foundation.q2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return s2.g(bVar, str, a0Var3, eVar3, lVar2, f12, r0Var3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 24576;
        i17 = i11 & 32;
        if (i17 != 0) {
            if ((196608 & i10) == 0) {
                f11 = f10;
                if (c0VarR.I(f11)) {
                    i18 = 131072;
                } else {
                    i18 = 65536;
                }
                i12 |= i18;
            }
            i19 = i11 & 64;
            if (i19 != 0) {
                i12 |= 1572864;
                r0Var2 = r0Var;
            } else {
                r0Var2 = r0Var;
                if ((i10 & 1572864) == 0) {
                    if (c0VarR.D(r0Var2)) {
                        i20 = 1048576;
                    } else {
                        i20 = 524288;
                    }
                    i12 |= i20;
                }
            }
            if ((i12 & 599187) != 599186) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i12 & 1)) {
                if (i23 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                }
                if (i13 != 0) {
                    eVarI = androidx.compose.ui.e.f37317a.i();
                } else {
                    eVarI = eVar2;
                }
                if (i15 != 0) {
                    lVarI = androidx.compose.ui.layout.l.f39405a.i();
                    i21 = i17;
                } else {
                    i21 = i17;
                    lVarI = lVar;
                }
                if (i21 != 0) {
                    f11 = 1.0f;
                }
                if (i19 != 0) {
                    r0Var4 = null;
                } else {
                    r0Var4 = r0Var2;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1142754848, i12, -1, "androidx.compose.foundation.Image (Image.kt:247)");
                }
                if (str != null) {
                    c0VarR.E(1899234820);
                    androidx.compose.ui.a0.a aVar119 = androidx.compose.ui.a0.E;
                    if ((i12 & com.planner5d.library.engine.input.f.b.B) == 32) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    objI1 = c0VarR.i0();
                    if (z11) {
                        objI1 = new Function1() { // from class: androidx.compose.foundation.p2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return s2.f(str, (androidx.compose.ui.semantics.e0) obj);
                            }
                        };
                        c0VarR.Y(objI1);
                    } else {
                        objI1 = new Function1() { // from class: androidx.compose.foundation.p2
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return s2.f(str, (androidx.compose.ui.semantics.e0) obj);
                            }
                        };
                        c0VarR.Y(objI1);
                    }
                    i22 = 0;
                    a0VarF = androidx.compose.ui.semantics.t.f(aVar119, false, (Function1) objI1, 1, null);
                    c0VarR.A();
                } else {
                    i22 = 0;
                    c0VarR.E(1899393602);
                    c0VarR.A();
                    a0VarF = androidx.compose.ui.a0.E;
                }
                androidx.compose.ui.a0 a0VarB15 = androidx.compose.ui.draw.t.b(androidx.compose.ui.draw.j.b(a0Var2.B2(a0VarF)), bVar2, false, eVarI, lVarI, f11, r0Var4, 2, null);
                objI0 = c0VarR.i0();
                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = a.f18610a;
                    c0VarR.Y(objI0);
                }
                androidx.compose.ui.layout.a1 a1Var15 = (androidx.compose.ui.layout.a1) objI0;
                iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, i22));
                androidx.compose.ui.a0 a0VarN15 = androidx.compose.ui.m.n(c0VarR, a0VarB15);
                androidx.compose.runtime.b1 b1VarK15 = c0VarR.k();
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
                y7.n(c0VarD, a1Var15, aVar1110.e());
                y7.n(c0VarD, b1VarK15, aVar1110.g());
                y7.n(c0VarD, a0VarN15, aVar1110.f());
                function2B = aVar1110.b();
                if (c0VarD.P()) {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iHashCode));
                    c0VarD.f(Integer.valueOf(iHashCode), function2B);
                }
                c0VarR.o();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                eVar3 = eVarI;
                lVar2 = lVarI;
                r0Var3 = r0Var4;
            } else {
                c0VarR.u();
                r0Var3 = r0Var2;
                eVar3 = eVar2;
                lVar2 = lVar;
            }
            a0Var3 = a0Var2;
            f12 = f11;
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.foundation.q2
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return s2.g(bVar, str, a0Var3, eVar3, lVar2, f12, r0Var3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= androidx.profileinstaller.n.c.f73814m;
        f11 = f10;
        i19 = i11 & 64;
        if (i19 != 0) {
            i12 |= 1572864;
            r0Var2 = r0Var;
        } else {
            r0Var2 = r0Var;
            if ((i10 & 1572864) == 0) {
                if (c0VarR.D(r0Var2)) {
                    i20 = 1048576;
                } else {
                    i20 = 524288;
                }
                i12 |= i20;
            }
        }
        if ((i12 & 599187) != 599186) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c0VarR.h(z10, i12 & 1)) {
            if (i23 != 0) {
                a0Var2 = androidx.compose.ui.a0.E;
            }
            if (i13 != 0) {
                eVarI = androidx.compose.ui.e.f37317a.i();
            } else {
                eVarI = eVar2;
            }
            if (i15 != 0) {
                lVarI = androidx.compose.ui.layout.l.f39405a.i();
                i21 = i17;
            } else {
                i21 = i17;
                lVarI = lVar;
            }
            if (i21 != 0) {
                f11 = 1.0f;
            }
            if (i19 != 0) {
                r0Var4 = null;
            } else {
                r0Var4 = r0Var2;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1142754848, i12, -1, "androidx.compose.foundation.Image (Image.kt:247)");
            }
            if (str != null) {
                c0VarR.E(1899234820);
                androidx.compose.ui.a0.a aVar1111 = androidx.compose.ui.a0.E;
                if ((i12 & com.planner5d.library.engine.input.f.b.B) == 32) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                objI1 = c0VarR.i0();
                if (z11) {
                    objI1 = new Function1() { // from class: androidx.compose.foundation.p2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return s2.f(str, (androidx.compose.ui.semantics.e0) obj);
                        }
                    };
                    c0VarR.Y(objI1);
                } else {
                    objI1 = new Function1() { // from class: androidx.compose.foundation.p2
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return s2.f(str, (androidx.compose.ui.semantics.e0) obj);
                        }
                    };
                    c0VarR.Y(objI1);
                }
                i22 = 0;
                a0VarF = androidx.compose.ui.semantics.t.f(aVar1111, false, (Function1) objI1, 1, null);
                c0VarR.A();
            } else {
                i22 = 0;
                c0VarR.E(1899393602);
                c0VarR.A();
                a0VarF = androidx.compose.ui.a0.E;
            }
            androidx.compose.ui.a0 a0VarB16 = androidx.compose.ui.draw.t.b(androidx.compose.ui.draw.j.b(a0Var2.B2(a0VarF)), bVar2, false, eVarI, lVarI, f11, r0Var4, 2, null);
            objI0 = c0VarR.i0();
            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = a.f18610a;
                c0VarR.Y(objI0);
            }
            androidx.compose.ui.layout.a1 a1Var16 = (androidx.compose.ui.layout.a1) objI0;
            iHashCode = Long.hashCode(androidx.compose.runtime.v.l(c0VarR, i22));
            androidx.compose.ui.a0 a0VarN16 = androidx.compose.ui.m.n(c0VarR, a0VarB16);
            androidx.compose.runtime.b1 b1VarK16 = c0VarR.k();
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
            y7.n(c0VarD, a1Var16, aVar1112.e());
            y7.n(c0VarD, b1VarK16, aVar1112.g());
            y7.n(c0VarD, a0VarN16, aVar1112.f());
            function2B = aVar1112.b();
            if (c0VarD.P()) {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            } else {
                c0VarD.Y(Integer.valueOf(iHashCode));
                c0VarD.f(Integer.valueOf(iHashCode), function2B);
            }
            c0VarR.o();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            eVar3 = eVarI;
            lVar2 = lVarI;
            r0Var3 = r0Var4;
        } else {
            c0VarR.u();
            r0Var3 = r0Var2;
            eVar3 = eVar2;
            lVar2 = lVar;
        }
        a0Var3 = a0Var2;
        f12 = f11;
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.foundation.q2
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return s2.g(bVar, str, a0Var3, eVar3, lVar2, f12, r0Var3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void e(@NotNull androidx.compose.ui.graphics.vector.d dVar, @Nullable String str, @Nullable androidx.compose.ui.a0 a0Var, @Nullable androidx.compose.ui.e eVar, @Nullable androidx.compose.ui.layout.l lVar, float f10, @Nullable androidx.compose.ui.graphics.r0 r0Var, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        if ((i11 & 4) != 0) {
            a0Var = androidx.compose.ui.a0.E;
        }
        androidx.compose.ui.a0 a0Var2 = a0Var;
        if ((i11 & 8) != 0) {
            eVar = androidx.compose.ui.e.f37317a.i();
        }
        androidx.compose.ui.e eVar2 = eVar;
        androidx.compose.ui.layout.l lVarI = (i11 & 16) != 0 ? androidx.compose.ui.layout.l.f39405a.i() : lVar;
        float f11 = (i11 & 32) != 0 ? 1.0f : f10;
        androidx.compose.ui.graphics.r0 r0Var2 = (i11 & 64) != 0 ? null : r0Var;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(1595907091, i10, -1, "androidx.compose.foundation.Image (Image.kt:202)");
        }
        d(androidx.compose.ui.graphics.vector.u.j(dVar, c0Var, i10 & 14), str, a0Var2, eVar2, lVarI, f11, r0Var2, c0Var, VectorPainter.f38280o | (i10 & com.planner5d.library.engine.input.f.b.B) | (i10 & 896) | (i10 & 7168) | (57344 & i10) | (458752 & i10) | (3670016 & i10), 0);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(String str, androidx.compose.ui.semantics.e0 e0Var) {
        androidx.compose.ui.semantics.b0.v1(e0Var, str);
        androidx.compose.ui.semantics.b0.K1(e0Var, androidx.compose.ui.semantics.j.f41124b.e());
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(androidx.compose.ui.graphics.painter.b bVar, String str, androidx.compose.ui.a0 a0Var, androidx.compose.ui.e eVar, androidx.compose.ui.layout.l lVar, float f10, androidx.compose.ui.graphics.r0 r0Var, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        d(bVar, str, a0Var, eVar, lVar, f10, r0Var, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void h(@NotNull androidx.compose.ui.graphics.t1 t1Var, @Nullable String str, @Nullable androidx.compose.ui.a0 a0Var, @Nullable androidx.compose.ui.e eVar, @Nullable androidx.compose.ui.layout.l lVar, float f10, @Nullable androidx.compose.ui.graphics.r0 r0Var, int i10, @Nullable androidx.compose.runtime.c0 c0Var, int i11, int i12) {
        androidx.compose.ui.a0 a0Var2 = (i12 & 4) != 0 ? androidx.compose.ui.a0.E : a0Var;
        androidx.compose.ui.e eVarI = (i12 & 8) != 0 ? androidx.compose.ui.e.f37317a.i() : eVar;
        androidx.compose.ui.layout.l lVarI = (i12 & 16) != 0 ? androidx.compose.ui.layout.l.f39405a.i() : lVar;
        float f11 = (i12 & 32) != 0 ? 1.0f : f10;
        androidx.compose.ui.graphics.r0 r0Var2 = (i12 & 64) != 0 ? null : r0Var;
        int iB = (i12 & 128) != 0 ? androidx.compose.ui.graphics.drawscope.f.H.b() : i10;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-1396260732, i11, -1, "androidx.compose.foundation.Image (Image.kt:156)");
        }
        boolean zD = c0Var.D(t1Var);
        Object objI0 = c0Var.i0();
        if (zD || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
            objI0 = androidx.compose.ui.graphics.painter.a.b(t1Var, 0L, 0L, iB, 6, null);
            c0Var.Y(objI0);
        }
        d((BitmapPainter) objI0, str, a0Var2, eVarI, lVarI, f11, r0Var2, c0Var, i11 & 4194288, 0);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
    }
}

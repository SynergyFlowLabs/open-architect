package androidx.compose.foundation.layout;

import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nBoxWithConstraints.kt\nKotlin\n*S Kotlin\n*F\n+ 1 BoxWithConstraints.kt\nandroidx/compose/foundation/layout/BoxWithConstraintsKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,128:1\n1282#2,6:129\n1#3:135\n*S KotlinDebug\n*F\n+ 1 BoxWithConstraints.kt\nandroidx/compose/foundation/layout/BoxWithConstraintsKt\n*L\n64#1:129,6\n*E\n"})
public final class g0 {

    static final class a implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ pj.n<h0, androidx.compose.runtime.c0, Integer, Unit> f16029a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ i0 f16030b;

        /* JADX WARN: Multi-variable type inference failed */
        a(pj.n<? super h0, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar, i0 i0Var) {
            this.f16029a = nVar;
            this.f16030b = i0Var;
        }

        @androidx.compose.runtime.o
        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            boolean z10;
            if ((i10 & 3) != 2) {
                z10 = true;
                boolean z11 = !false;
            } else {
                z10 = false;
            }
            if (!c0Var.h(z10, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-431986394, i10, -1, "androidx.compose.foundation.layout.BoxWithConstraints.<anonymous>.<anonymous>.<anonymous> (BoxWithConstraints.kt:65)");
            }
            this.f16029a.invoke(this.f16030b, c0Var, 0);
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

    /* JADX WARN: Code duplicated, block: B:26:0x0051  */
    /* JADX WARN: Code duplicated, block: B:28:0x0056  */
    /* JADX WARN: Code duplicated, block: B:30:0x005a  */
    /* JADX WARN: Code duplicated, block: B:32:0x0062  */
    /* JADX WARN: Code duplicated, block: B:33:0x0065  */
    /* JADX WARN: Code duplicated, block: B:37:0x006e  */
    /* JADX WARN: Code duplicated, block: B:38:0x0071  */
    /* JADX WARN: Code duplicated, block: B:40:0x0075  */
    /* JADX WARN: Code duplicated, block: B:42:0x007b  */
    /* JADX WARN: Code duplicated, block: B:43:0x007e  */
    /* JADX WARN: Code duplicated, block: B:47:0x0089  */
    /* JADX WARN: Code duplicated, block: B:48:0x008b  */
    /* JADX WARN: Code duplicated, block: B:51:0x0094 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:52:0x0096  */
    /* JADX WARN: Code duplicated, block: B:53:0x0099  */
    /* JADX WARN: Code duplicated, block: B:55:0x009d  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:61:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:65:0x00bf  */
    /* JADX WARN: Code duplicated, block: B:68:0x00cb  */
    /* JADX WARN: Code duplicated, block: B:70:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:73:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:74:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:77:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:79:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.o
    @androidx.compose.ui.h0
    public static final void c(@Nullable androidx.compose.ui.a0 a0Var, @Nullable androidx.compose.ui.e eVar, boolean z10, @NotNull final pj.n<? super h0, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        androidx.compose.ui.a0 a0Var2;
        int i12;
        androidx.compose.ui.e eVar2;
        int i13;
        boolean z11;
        int i14;
        int i15;
        boolean z12;
        androidx.compose.ui.a0 a0Var3;
        androidx.compose.ui.e eVarC;
        androidx.compose.runtime.s5 s5VarT;
        final androidx.compose.ui.layout.a1 a1VarK;
        boolean zD;
        Object objI0;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(380139498);
        int i16 = i11 & 1;
        if (i16 != 0) {
            i12 = i10 | 6;
            a0Var2 = a0Var;
        } else if ((i10 & 6) == 0) {
            a0Var2 = a0Var;
            i12 = (c0VarR.D(a0Var2) ? 4 : 2) | i10;
        } else {
            a0Var2 = a0Var;
            i12 = i10;
        }
        int i17 = i11 & 2;
        if (i17 == 0) {
            if ((i10 & 48) == 0) {
                eVar2 = eVar;
                i12 |= c0VarR.D(eVar2) ? 32 : 16;
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
                if ((i11 & 8) != 0) {
                    i12 |= 3072;
                } else if ((i10 & 3072) == 0) {
                    if (c0VarR.k0(nVar)) {
                        i15 = 2048;
                    } else {
                        i15 = 1024;
                    }
                    i12 |= i15;
                }
                if ((i12 & 1171) != 1170) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    if (i16 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if (i17 != 0) {
                        eVarC = androidx.compose.ui.e.f37317a.C();
                    } else {
                        eVarC = eVar2;
                    }
                    if (i13 != 0) {
                        z11 = false;
                    }
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(380139498, i12, -1, "androidx.compose.foundation.layout.BoxWithConstraints (BoxWithConstraints.kt:61)");
                    }
                    a1VarK = x.k(eVarC, z11);
                    zD = c0VarR.D(a1VarK) | ((i12 & 7168) == 2048);
                    objI0 = c0VarR.i0();
                    if (zD || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                        objI0 = new Function2() { // from class: androidx.compose.foundation.layout.e0
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return g0.d(a1VarK, nVar, (androidx.compose.ui.layout.b3) obj, (androidx.compose.ui.unit.b) obj2);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    androidx.compose.ui.layout.z2.a(a0Var3, (Function2) objI0, c0VarR, i12 & 14, 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    eVarC = eVar2;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    final androidx.compose.ui.a0 a0Var4 = a0Var3;
                    final androidx.compose.ui.e eVar3 = eVarC;
                    final boolean z13 = z11;
                    s5VarT.a(new Function2() { // from class: androidx.compose.foundation.layout.f0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return g0.e(a0Var4, eVar3, z13, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= androidx.media3.exoplayer.a5.S0;
            z11 = z10;
            if ((i11 & 8) != 0) {
                i12 |= 3072;
            } else if ((i10 & 3072) == 0) {
                if (c0VarR.k0(nVar)) {
                    i15 = 2048;
                } else {
                    i15 = 1024;
                }
                i12 |= i15;
            }
            if ((i12 & 1171) != 1170) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i12 & 1)) {
                if (i16 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if (i17 != 0) {
                    eVarC = androidx.compose.ui.e.f37317a.C();
                } else {
                    eVarC = eVar2;
                }
                if (i13 != 0) {
                    z11 = false;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(380139498, i12, -1, "androidx.compose.foundation.layout.BoxWithConstraints (BoxWithConstraints.kt:61)");
                }
                a1VarK = x.k(eVarC, z11);
                zD = c0VarR.D(a1VarK) | ((i12 & 7168) == 2048);
                objI0 = c0VarR.i0();
                if (zD) {
                    objI0 = new Function2() { // from class: androidx.compose.foundation.layout.e0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return g0.d(a1VarK, nVar, (androidx.compose.ui.layout.b3) obj, (androidx.compose.ui.unit.b) obj2);
                        }
                    };
                    c0VarR.Y(objI0);
                } else {
                    objI0 = new Function2() { // from class: androidx.compose.foundation.layout.e0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return g0.d(a1VarK, nVar, (androidx.compose.ui.layout.b3) obj, (androidx.compose.ui.unit.b) obj2);
                        }
                    };
                    c0VarR.Y(objI0);
                }
                androidx.compose.ui.layout.z2.a(a0Var3, (Function2) objI0, c0VarR, i12 & 14, 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                eVarC = eVar2;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                final androidx.compose.ui.a0 a0Var5 = a0Var3;
                final androidx.compose.ui.e eVar4 = eVarC;
                final boolean z14 = z11;
                s5VarT.a(new Function2() { // from class: androidx.compose.foundation.layout.f0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return g0.e(a0Var5, eVar4, z14, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 48;
        eVar2 = eVar;
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
            if ((i11 & 8) != 0) {
                i12 |= 3072;
            } else if ((i10 & 3072) == 0) {
                if (c0VarR.k0(nVar)) {
                    i15 = 2048;
                } else {
                    i15 = 1024;
                }
                i12 |= i15;
            }
            if ((i12 & 1171) != 1170) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i12 & 1)) {
                if (i16 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if (i17 != 0) {
                    eVarC = androidx.compose.ui.e.f37317a.C();
                } else {
                    eVarC = eVar2;
                }
                if (i13 != 0) {
                    z11 = false;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(380139498, i12, -1, "androidx.compose.foundation.layout.BoxWithConstraints (BoxWithConstraints.kt:61)");
                }
                a1VarK = x.k(eVarC, z11);
                zD = c0VarR.D(a1VarK) | ((i12 & 7168) == 2048);
                objI0 = c0VarR.i0();
                if (zD) {
                    objI0 = new Function2() { // from class: androidx.compose.foundation.layout.e0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return g0.d(a1VarK, nVar, (androidx.compose.ui.layout.b3) obj, (androidx.compose.ui.unit.b) obj2);
                        }
                    };
                    c0VarR.Y(objI0);
                } else {
                    objI0 = new Function2() { // from class: androidx.compose.foundation.layout.e0
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return g0.d(a1VarK, nVar, (androidx.compose.ui.layout.b3) obj, (androidx.compose.ui.unit.b) obj2);
                        }
                    };
                    c0VarR.Y(objI0);
                }
                androidx.compose.ui.layout.z2.a(a0Var3, (Function2) objI0, c0VarR, i12 & 14, 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                eVarC = eVar2;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                final androidx.compose.ui.a0 a0Var6 = a0Var3;
                final androidx.compose.ui.e eVar5 = eVarC;
                final boolean z15 = z11;
                s5VarT.a(new Function2() { // from class: androidx.compose.foundation.layout.f0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return g0.e(a0Var6, eVar5, z15, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= androidx.media3.exoplayer.a5.S0;
        z11 = z10;
        if ((i11 & 8) != 0) {
            i12 |= 3072;
        } else if ((i10 & 3072) == 0) {
            if (c0VarR.k0(nVar)) {
                i15 = 2048;
            } else {
                i15 = 1024;
            }
            i12 |= i15;
        }
        if ((i12 & 1171) != 1170) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (c0VarR.h(z12, i12 & 1)) {
            if (i16 != 0) {
                a0Var3 = androidx.compose.ui.a0.E;
            } else {
                a0Var3 = a0Var2;
            }
            if (i17 != 0) {
                eVarC = androidx.compose.ui.e.f37317a.C();
            } else {
                eVarC = eVar2;
            }
            if (i13 != 0) {
                z11 = false;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(380139498, i12, -1, "androidx.compose.foundation.layout.BoxWithConstraints (BoxWithConstraints.kt:61)");
            }
            a1VarK = x.k(eVarC, z11);
            zD = c0VarR.D(a1VarK) | ((i12 & 7168) == 2048);
            objI0 = c0VarR.i0();
            if (zD) {
                objI0 = new Function2() { // from class: androidx.compose.foundation.layout.e0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return g0.d(a1VarK, nVar, (androidx.compose.ui.layout.b3) obj, (androidx.compose.ui.unit.b) obj2);
                    }
                };
                c0VarR.Y(objI0);
            } else {
                objI0 = new Function2() { // from class: androidx.compose.foundation.layout.e0
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return g0.d(a1VarK, nVar, (androidx.compose.ui.layout.b3) obj, (androidx.compose.ui.unit.b) obj2);
                    }
                };
                c0VarR.Y(objI0);
            }
            androidx.compose.ui.layout.z2.a(a0Var3, (Function2) objI0, c0VarR, i12 & 14, 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0VarR.u();
            a0Var3 = a0Var2;
            eVarC = eVar2;
        }
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            final androidx.compose.ui.a0 a0Var7 = a0Var3;
            final androidx.compose.ui.e eVar6 = eVarC;
            final boolean z16 = z11;
            s5VarT.a(new Function2() { // from class: androidx.compose.foundation.layout.f0
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return g0.e(a0Var7, eVar6, z16, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.layout.b1 d(androidx.compose.ui.layout.a1 a1Var, pj.n nVar, androidx.compose.ui.layout.b3 b3Var, androidx.compose.ui.unit.b bVar) {
        return a1Var.a(b3Var, b3Var.S4(Unit.f312394a, androidx.compose.runtime.internal.w.c(-431986394, true, new a(nVar, new i0(b3Var, bVar.x(), null)))), bVar.x());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(androidx.compose.ui.a0 a0Var, androidx.compose.ui.e eVar, boolean z10, pj.n nVar, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        c(a0Var, eVar, z10, nVar, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }
}

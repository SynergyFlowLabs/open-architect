package androidx.compose.material;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@androidx.compose.runtime.internal.w0(parameters = 1)
@SourceDebugExtension({"SMAP\nTabRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TabRow.kt\nandroidx/compose/material/TabRowDefaults\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,489:1\n75#2:490\n75#2:491\n110#3:492\n113#4:493\n113#4:494\n113#4:495\n*S KotlinDebug\n*F\n+ 1 TabRow.kt\nandroidx/compose/material/TabRowDefaults\n*L\n355#1:490\n372#1:491\n387#1:492\n412#1:493\n415#1:494\n418#1:495\n*E\n"})
public final class wi {

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    public static final float f25420b = 0.12f;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    public static final int f25424f = 0;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    public static final wi f25419a = new wi();

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f25421c = androidx.compose.ui.unit.h.r(1);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final float f25422d = androidx.compose.ui.unit.h.r(2);

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final float f25423e = androidx.compose.ui.unit.h.r(52);

    @SourceDebugExtension({"SMAP\nInspectableValue.kt\nKotlin\n*S Kotlin\n*F\n+ 1 InspectableValue.kt\nandroidx/compose/ui/platform/InspectableValueKt$debugInspectorInfo$1\n+ 2 TabRow.kt\nandroidx/compose/material/TabRowDefaults\n*L\n1#1,110:1\n388#2,3:111\n*E\n"})
    public static final class a extends kotlin.jvm.internal.l0 implements Function1<androidx.compose.ui.platform.t2, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ti f25425a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(ti tiVar) {
            super(1);
            this.f25425a = tiVar;
        }

        public final void c(androidx.compose.ui.platform.t2 t2Var) {
            t2Var.d("tabIndicatorOffset");
            t2Var.e(this.f25425a);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.ui.platform.t2 t2Var) {
            c(t2Var);
            return Unit.f312394a;
        }
    }

    @SourceDebugExtension({"SMAP\nTabRow.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TabRow.kt\nandroidx/compose/material/TabRowDefaults$tabIndicatorOffset$2\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 4 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,489:1\n1282#2,6:490\n85#3:496\n85#3:497\n32#4:498\n80#5:499\n*S KotlinDebug\n*F\n+ 1 TabRow.kt\nandroidx/compose/material/TabRowDefaults$tabIndicatorOffset$2\n*L\n404#1:490,6\n393#1:496\n398#1:497\n404#1:498\n404#1:499\n*E\n"})
    static final class b implements pj.n<androidx.compose.ui.a0, androidx.compose.runtime.c0, Integer, androidx.compose.ui.a0> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ ti f25426a;

        b(ti tiVar) {
            this.f25426a = tiVar;
        }

        private static final float f(androidx.compose.runtime.n7<androidx.compose.ui.unit.h> n7Var) {
            return n7Var.getValue().O();
        }

        private static final float i(androidx.compose.runtime.n7<androidx.compose.ui.unit.h> n7Var) {
            return n7Var.getValue().O();
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final androidx.compose.ui.unit.q k(androidx.compose.runtime.n7 n7Var, androidx.compose.ui.unit.d dVar) {
            return androidx.compose.ui.unit.q.c(androidx.compose.ui.unit.q.f((((long) dVar.g6(i(n7Var))) << 32) | (((long) 0) & com.rabbitmq.client.k0.f265952a)));
        }

        @androidx.compose.runtime.o
        public final androidx.compose.ui.a0 d(androidx.compose.ui.a0 a0Var, androidx.compose.runtime.c0 c0Var, int i10) {
            c0Var.E(-398757863);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-398757863, i10, -1, "androidx.compose.material.TabRowDefaults.tabIndicatorOffset.<anonymous> (TabRow.kt:391)");
            }
            androidx.compose.runtime.n7<androidx.compose.ui.unit.h> n7VarD = androidx.compose.animation.core.f.d(this.f25426a.c(), androidx.compose.animation.core.p.t(250, 0, androidx.compose.animation.core.u0.d(), 2, null), null, null, c0Var, 0, 12);
            final androidx.compose.runtime.n7<androidx.compose.ui.unit.h> n7VarD2 = androidx.compose.animation.core.f.d(this.f25426a.a(), androidx.compose.animation.core.p.t(250, 0, androidx.compose.animation.core.u0.d(), 2, null), null, null, c0Var, 0, 12);
            androidx.compose.ui.a0 a0VarH = androidx.compose.foundation.layout.i6.H(androidx.compose.foundation.layout.i6.h(a0Var, 0.0f, 1, null), androidx.compose.ui.e.f37317a.g(), false, 2, null);
            boolean zD = c0Var.D(n7VarD2);
            Object objI0 = c0Var.i0();
            if (zD || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new Function1() { // from class: androidx.compose.material.xi
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return wi.b.k(n7VarD2, (androidx.compose.ui.unit.d) obj);
                    }
                };
                c0Var.Y(objI0);
            }
            androidx.compose.ui.a0 a0VarB = androidx.compose.foundation.layout.i6.B(androidx.compose.foundation.layout.s4.j(a0VarH, (Function1) objI0), f(n7VarD));
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            c0Var.A();
            return a0VarB;
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ androidx.compose.ui.a0 invoke(androidx.compose.ui.a0 a0Var, androidx.compose.runtime.c0 c0Var, Integer num) {
            return d(a0Var, c0Var, num.intValue());
        }
    }

    private wi() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit d(wi wiVar, androidx.compose.ui.a0 a0Var, float f10, long j10, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        wiVar.c(a0Var, f10, j10, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit f(wi wiVar, androidx.compose.ui.a0 a0Var, float f10, long j10, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        wiVar.e(a0Var, f10, j10, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    /* JADX WARN: Code duplicated, block: B:47:0x0085  */
    /* JADX WARN: Code duplicated, block: B:48:0x0087  */
    /* JADX WARN: Code duplicated, block: B:51:0x0090  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b1 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:68:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:76:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:79:0x0112  */
    /* JADX WARN: Code duplicated, block: B:81:0x0119  */
    /* JADX WARN: Code duplicated, block: B:84:0x0124  */
    /* JADX WARN: Code duplicated, block: B:86:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public final void c(@Nullable androidx.compose.ui.a0 a0Var, float f10, long j10, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        final androidx.compose.ui.a0 a0Var2;
        int i12;
        float f11;
        long jW;
        boolean z10;
        final float f12;
        final long j11;
        androidx.compose.runtime.s5 s5VarT;
        androidx.compose.ui.a0 a0Var3;
        float f13;
        float f14;
        long j12;
        androidx.compose.ui.a0 a0Var4;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(910934799);
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
                f11 = f10;
                int i14 = c0VarR.I(f11) ? 32 : 16;
                i12 |= i14;
            } else {
                f11 = f10;
            }
            i12 |= i14;
        } else {
            f11 = f10;
        }
        if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
            jW = j10;
            i12 |= ((i11 & 4) == 0 && c0VarR.L(jW)) ? 256 : 128;
        } else {
            jW = j10;
        }
        if ((i11 & 8) == 0) {
            if ((i10 & 3072) == 0) {
                i12 |= c0VarR.D(this) ? 2048 : 1024;
            }
            if ((i12 & 1171) != 1170) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0 || c0VarR.y()) {
                    if (i13 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if ((i11 & 2) != 0) {
                        f13 = f25421c;
                        i12 &= -113;
                    } else {
                        f13 = f11;
                    }
                    if ((i11 & 4) != 0) {
                        jW = androidx.compose.ui.graphics.q0.w(((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
                        i12 &= -897;
                    }
                    f14 = f13;
                    j12 = jW;
                    a0Var4 = a0Var3;
                } else {
                    c0VarR.u();
                    if ((i11 & 2) != 0) {
                        i12 &= -113;
                    }
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                    }
                    f14 = f11;
                    j12 = jW;
                    a0Var4 = a0Var2;
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(910934799, i12, -1, "androidx.compose.material.TabRowDefaults.Divider (TabRow.kt:355)");
                }
                u5.b(a0Var4, j12, f14, 0.0f, c0VarR, (i12 & 14) | ((i12 >> 3) & com.planner5d.library.engine.input.f.b.B) | ((i12 << 3) & 896), 8);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var2 = a0Var4;
                j11 = j12;
                f12 = f14;
            } else {
                c0VarR.u();
                f12 = f11;
                j11 = jW;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material.ui
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return wi.d(this.f25174a, a0Var2, f12, j11, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 3072;
        if ((i12 & 1171) != 1170) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c0VarR.h(z10, i12 & 1)) {
            c0VarR.l0();
            if ((i10 & 1) != 0) {
                if (i13 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if ((i11 & 2) != 0) {
                    f13 = f25421c;
                    i12 &= -113;
                } else {
                    f13 = f11;
                }
                if ((i11 & 4) != 0) {
                    jW = androidx.compose.ui.graphics.q0.w(((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
                    i12 &= -897;
                }
                f14 = f13;
                j12 = jW;
                a0Var4 = a0Var3;
            } else {
                if (i13 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if ((i11 & 2) != 0) {
                    f13 = f25421c;
                    i12 &= -113;
                } else {
                    f13 = f11;
                }
                if ((i11 & 4) != 0) {
                    jW = androidx.compose.ui.graphics.q0.w(((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M(), 0.12f, 0.0f, 0.0f, 0.0f, 14, null);
                    i12 &= -897;
                }
                f14 = f13;
                j12 = jW;
                a0Var4 = a0Var3;
            }
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(910934799, i12, -1, "androidx.compose.material.TabRowDefaults.Divider (TabRow.kt:355)");
            }
            u5.b(a0Var4, j12, f14, 0.0f, c0VarR, (i12 & 14) | ((i12 >> 3) & com.planner5d.library.engine.input.f.b.B) | ((i12 << 3) & 896), 8);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            a0Var2 = a0Var4;
            j11 = j12;
            f12 = f14;
        } else {
            c0VarR.u();
            f12 = f11;
            j11 = jW;
        }
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material.ui
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return wi.d(this.f25174a, a0Var2, f12, j11, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:48:0x0086  */
    /* JADX WARN: Code duplicated, block: B:49:0x0089  */
    /* JADX WARN: Code duplicated, block: B:52:0x0092  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b4 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:66:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:70:0x00be  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:74:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:77:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:80:0x0107  */
    /* JADX WARN: Code duplicated, block: B:82:0x010c  */
    /* JADX WARN: Code duplicated, block: B:85:0x011a  */
    /* JADX WARN: Code duplicated, block: B:87:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public final void e(@Nullable androidx.compose.ui.a0 a0Var, float f10, long j10, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        androidx.compose.ui.a0 a0Var2;
        int i12;
        float f11;
        long jM;
        wi wiVar;
        boolean z10;
        final androidx.compose.ui.a0 a0Var3;
        final float f12;
        final long j11;
        androidx.compose.runtime.s5 s5VarT;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1499002201);
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
                f11 = f10;
                int i14 = c0VarR.I(f11) ? 32 : 16;
                i12 |= i14;
            } else {
                f11 = f10;
            }
            i12 |= i14;
        } else {
            f11 = f10;
        }
        if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
            if ((i11 & 4) == 0) {
                jM = j10;
                int i15 = c0VarR.L(jM) ? 256 : 128;
                i12 |= i15;
            } else {
                jM = j10;
            }
            i12 |= i15;
        } else {
            jM = j10;
        }
        if ((i11 & 8) == 0) {
            if ((i10 & 3072) == 0) {
                wiVar = this;
                i12 |= c0VarR.D(wiVar) ? 2048 : 1024;
            }
            if ((i12 & 1171) != 1170) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0 || c0VarR.y()) {
                    if (i13 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if ((i11 & 2) != 0) {
                        f12 = f25422d;
                        i12 &= -113;
                    } else {
                        f12 = f11;
                    }
                    if ((i11 & 4) != 0) {
                        jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                        i12 &= -897;
                    }
                } else {
                    c0VarR.u();
                    if ((i11 & 2) != 0) {
                        i12 &= -113;
                    }
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                    }
                    a0Var3 = a0Var2;
                    f12 = f11;
                }
                long j12 = jM;
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1499002201, i12, -1, "androidx.compose.material.TabRowDefaults.Indicator (TabRow.kt:372)");
                }
                androidx.compose.foundation.layout.x.b(androidx.compose.foundation.v.d(androidx.compose.foundation.layout.i6.i(androidx.compose.foundation.layout.i6.h(a0Var3, 0.0f, 1, null), f12), j12, null, 2, null), c0VarR, 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                j11 = j12;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                f12 = f11;
                j11 = jM;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                final wi wiVar2 = wiVar;
                s5VarT.a(new Function2() { // from class: androidx.compose.material.vi
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return wi.f(this.f25305a, a0Var3, f12, j11, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 3072;
        wiVar = this;
        if ((i12 & 1171) != 1170) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c0VarR.h(z10, i12 & 1)) {
            c0VarR.l0();
            if ((i10 & 1) != 0) {
                if (i13 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if ((i11 & 2) != 0) {
                    f12 = f25422d;
                    i12 &= -113;
                } else {
                    f12 = f11;
                }
                if ((i11 & 4) != 0) {
                    jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                    i12 &= -897;
                }
            } else {
                if (i13 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if ((i11 & 2) != 0) {
                    f12 = f25422d;
                    i12 &= -113;
                } else {
                    f12 = f11;
                }
                if ((i11 & 4) != 0) {
                    jM = ((androidx.compose.ui.graphics.q0) c0VarR.W(x4.a())).M();
                    i12 &= -897;
                }
            }
            long j13 = jM;
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1499002201, i12, -1, "androidx.compose.material.TabRowDefaults.Indicator (TabRow.kt:372)");
            }
            androidx.compose.foundation.layout.x.b(androidx.compose.foundation.v.d(androidx.compose.foundation.layout.i6.i(androidx.compose.foundation.layout.i6.h(a0Var3, 0.0f, 1, null), f12), j13, null, 2, null), c0VarR, 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            j11 = j13;
        } else {
            c0VarR.u();
            a0Var3 = a0Var2;
            f12 = f11;
            j11 = jM;
        }
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            final wi wiVar3 = wiVar;
            s5VarT.a(new Function2() { // from class: androidx.compose.material.vi
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return wi.f(this.f25305a, a0Var3, f12, j11, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    public final float g() {
        return f25421c;
    }

    public final float h() {
        return f25422d;
    }

    public final float i() {
        return f25423e;
    }

    @NotNull
    public final androidx.compose.ui.a0 j(@NotNull androidx.compose.ui.a0 a0Var, @NotNull ti tiVar) {
        return androidx.compose.ui.m.f(a0Var, androidx.compose.ui.platform.r2.e() ? new a(tiVar) : androidx.compose.ui.platform.r2.b(), new b(tiVar));
    }
}

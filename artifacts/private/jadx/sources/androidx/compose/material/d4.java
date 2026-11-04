package androidx.compose.material;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nCheckbox.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Checkbox.kt\nandroidx/compose/material/CheckboxKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Transition.kt\nandroidx/compose/animation/core/TransitionKt\n+ 4 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 5 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 6 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 7 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 8 CornerRadius.kt\nandroidx/compose/ui/geometry/CornerRadiusKt\n+ 9 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 10 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n+ 11 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,482:1\n1282#2,6:483\n1282#2,6:507\n1282#2,6:513\n1925#3:489\n1923#3:490\n1832#3,7:491\n1925#3:498\n1923#3:499\n1832#3,7:500\n57#4:519\n57#4:554\n60#5:520\n53#5,3:523\n53#5,3:527\n53#5,3:531\n53#5,3:535\n53#5,3:539\n53#5,3:543\n53#5,3:547\n53#5,3:551\n60#5:555\n22#6:521\n22#6:556\n33#7:522\n33#7:534\n33#7:546\n33#8:526\n33#8:538\n33#8:550\n30#9:530\n30#9:542\n85#10:557\n85#10:558\n85#10:559\n85#10:560\n85#10:561\n113#11:562\n113#11:563\n113#11:564\n113#11:565\n113#11:566\n*S KotlinDebug\n*F\n+ 1 Checkbox.kt\nandroidx/compose/material/CheckboxKt\n*L\n96#1:483,6\n292#1:507,6\n296#1:513,6\n260#1:489\n260#1:490\n260#1:491,7\n277#1:498\n277#1:499\n277#1:500,7\n322#1:519\n356#1:554\n322#1:520\n326#1:523,3\n327#1:527,3\n333#1:531,3\n334#1:535,3\n335#1:539,3\n340#1:543,3\n341#1:547,3\n342#1:551,3\n356#1:555\n322#1:521\n356#1:556\n326#1:522\n334#1:534\n341#1:546\n327#1:526\n335#1:538\n342#1:550\n333#1:530\n340#1:542\n260#1:557\n277#1:558\n293#1:559\n294#1:560\n295#1:561\n477#1:562\n478#1:563\n479#1:564\n480#1:565\n481#1:566\n*E\n"})
public final class d4 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f22482a = 50;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f22483b = 100;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f22484c = 100;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final float f22486e;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final float f22488g;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final float f22489h;

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final float f22485d = androidx.compose.ui.unit.h.r(24);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final float f22487f = androidx.compose.ui.unit.h.r(20);

    static final class a implements pj.n<androidx.compose.animation.core.l3.b<v0.a>, androidx.compose.runtime.c0, Integer, androidx.compose.animation.core.y0<Float>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f22490a = new a();

        a() {
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final androidx.compose.animation.core.y0<Float> c(androidx.compose.animation.core.l3.b<v0.a> bVar, androidx.compose.runtime.c0 c0Var, int i10) {
            androidx.compose.animation.core.y0<Float> y0VarO;
            c0Var.E(1075283605);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1075283605, i10, -1, "androidx.compose.material.CheckboxImpl.<anonymous> (Checkbox.kt:278)");
            }
            v0.a aVarL = bVar.l();
            v0.a aVar = v0.a.Off;
            if (aVarL == aVar) {
                y0VarO = androidx.compose.animation.core.p.p(0, 1, null);
            } else {
                y0VarO = bVar.j() == aVar ? androidx.compose.animation.core.p.o(100) : androidx.compose.animation.core.p.t(100, 0, null, 6, null);
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            c0Var.A();
            return y0VarO;
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ androidx.compose.animation.core.y0<Float> invoke(androidx.compose.animation.core.l3.b<v0.a> bVar, androidx.compose.runtime.c0 c0Var, Integer num) {
            return c(bVar, c0Var, num.intValue());
        }
    }

    static final class b implements pj.n<androidx.compose.animation.core.l3.b<v0.a>, androidx.compose.runtime.c0, Integer, androidx.compose.animation.core.y0<Float>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f22491a = new b();

        b() {
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final androidx.compose.animation.core.y0<Float> c(androidx.compose.animation.core.l3.b<v0.a> bVar, androidx.compose.runtime.c0 c0Var, int i10) {
            androidx.compose.animation.core.y0<Float> y0VarO;
            c0Var.E(-1707702900);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1707702900, i10, -1, "androidx.compose.material.CheckboxImpl.<anonymous> (Checkbox.kt:261)");
            }
            v0.a aVarL = bVar.l();
            v0.a aVar = v0.a.Off;
            if (aVarL == aVar) {
                y0VarO = androidx.compose.animation.core.p.t(100, 0, null, 6, null);
            } else {
                y0VarO = bVar.j() == aVar ? androidx.compose.animation.core.p.o(100) : androidx.compose.animation.core.p.r(0.0f, 0.0f, null, 7, null);
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            c0Var.A();
            return y0VarO;
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ androidx.compose.animation.core.y0<Float> invoke(androidx.compose.animation.core.l3.b<v0.a> bVar, androidx.compose.runtime.c0 c0Var, Integer num) {
            return c(bVar, c0Var, num.intValue());
        }
    }

    public /* synthetic */ class c {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f22492a;

        static {
            int[] iArr = new int[v0.a.values().length];
            try {
                iArr[v0.a.On.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[v0.a.Off.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[v0.a.Indeterminate.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f22492a = iArr;
        }
    }

    static {
        float f10 = 2;
        f22486e = androidx.compose.ui.unit.h.r(f10);
        f22488g = androidx.compose.ui.unit.h.r(f10);
        f22489h = androidx.compose.ui.unit.h.r(f10);
    }

    /* JADX WARN: Code duplicated, block: B:101:0x0147  */
    /* JADX WARN: Code duplicated, block: B:103:0x0151  */
    /* JADX WARN: Code duplicated, block: B:104:0x0154  */
    /* JADX WARN: Code duplicated, block: B:107:0x015b  */
    /* JADX WARN: Code duplicated, block: B:110:0x0165  */
    /* JADX WARN: Code duplicated, block: B:112:0x016d  */
    /* JADX WARN: Code duplicated, block: B:115:0x017f  */
    /* JADX WARN: Code duplicated, block: B:118:0x0199  */
    /* JADX WARN: Code duplicated, block: B:121:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:124:0x01af  */
    /* JADX WARN: Code duplicated, block: B:126:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0061  */
    /* JADX WARN: Code duplicated, block: B:38:0x0068  */
    /* JADX WARN: Code duplicated, block: B:40:0x006c  */
    /* JADX WARN: Code duplicated, block: B:42:0x0074  */
    /* JADX WARN: Code duplicated, block: B:43:0x0077  */
    /* JADX WARN: Code duplicated, block: B:47:0x007e  */
    /* JADX WARN: Code duplicated, block: B:49:0x0083  */
    /* JADX WARN: Code duplicated, block: B:51:0x0087  */
    /* JADX WARN: Code duplicated, block: B:53:0x0091  */
    /* JADX WARN: Code duplicated, block: B:54:0x0094  */
    /* JADX WARN: Code duplicated, block: B:58:0x009c  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a0  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:66:0x00b1  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c2  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c5  */
    /* JADX WARN: Code duplicated, block: B:73:0x00d1  */
    /* JADX WARN: Code duplicated, block: B:75:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:82:0x00f0 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:83:0x00f2  */
    /* JADX WARN: Code duplicated, block: B:84:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:87:0x00fb  */
    /* JADX WARN: Code duplicated, block: B:89:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:90:0x0104  */
    /* JADX WARN: Code duplicated, block: B:93:0x010a  */
    /* JADX WARN: Code duplicated, block: B:95:0x012c  */
    /* JADX WARN: Code duplicated, block: B:98:0x0139  */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void f(final boolean z10, @Nullable final Function1<? super Boolean, Unit> function1, @Nullable androidx.compose.ui.a0 a0Var, boolean z11, @Nullable androidx.compose.foundation.interaction.j jVar, @Nullable w3 w3Var, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        androidx.compose.ui.a0 a0Var2;
        int i13;
        boolean z12;
        int i14;
        int i15;
        androidx.compose.foundation.interaction.j jVar2;
        int i16;
        w3 w3Var2;
        boolean z13;
        final androidx.compose.ui.a0 a0Var3;
        final boolean z14;
        final androidx.compose.foundation.interaction.j jVar3;
        final w3 w3Var3;
        androidx.compose.runtime.s5 s5VarT;
        Function0 function0;
        androidx.compose.ui.a0 a0Var4;
        boolean z15;
        androidx.compose.foundation.interaction.j jVar4;
        boolean z16;
        boolean z17;
        Object objI0;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-2118660998);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c0VarR.G(z10) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= c0VarR.k0(function1) ? 32 : 16;
        }
        int i17 = i11 & 4;
        if (i17 == 0) {
            if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                a0Var2 = a0Var;
                i12 |= c0VarR.D(a0Var2) ? 256 : 128;
            }
            i13 = i11 & 8;
            if (i13 != 0) {
                if ((i10 & 3072) == 0) {
                    z12 = z11;
                    if (c0VarR.G(z12)) {
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
                            w3Var2 = w3Var;
                            int i18 = c0VarR.D(w3Var2) ? 131072 : 65536;
                            i12 |= i18;
                        } else {
                            w3Var2 = w3Var;
                        }
                        i12 |= i18;
                    } else {
                        w3Var2 = w3Var;
                    }
                    if ((74899 & i12) != 74898) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (c0VarR.h(z13, i12 & 1)) {
                        c0VarR.l0();
                        function0 = null;
                        if ((i10 & 1) != 0 || c0VarR.y()) {
                            if (i17 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i13 != 0) {
                                z15 = true;
                            } else {
                                z15 = z12;
                            }
                            if (i15 != 0) {
                                jVar4 = null;
                            } else {
                                jVar4 = jVar2;
                            }
                            if ((i11 & 32) != 0) {
                                w3 w3VarA = x3.f25473a.a(0L, 0L, 0L, 0L, 0L, c0VarR, androidx.profileinstaller.n.c.f73814m, 31);
                                c0VarR = c0VarR;
                                i12 &= -458753;
                                w3Var2 = w3VarA;
                            }
                            jVar2 = jVar4;
                        } else {
                            c0VarR.u();
                            if ((i11 & 32) != 0) {
                                i12 &= -458753;
                            }
                            z15 = z12;
                            a0Var4 = a0Var2;
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-2118660998, i12, -1, "androidx.compose.material.Checkbox (Checkbox.kt:90)");
                        }
                        v0.a aVarA = v0.b.a(z10);
                        if (function1 != null) {
                            c0VarR.E(1809984331);
                            if ((i12 & com.planner5d.library.engine.input.f.b.B) == 32) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            z17 = z16 | ((i12 & 14) == 4);
                            objI0 = c0VarR.i0();
                            if (z17 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = new Function0() { // from class: androidx.compose.material.b4
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return d4.g(function1, z10);
                                    }
                                };
                                c0VarR.Y(objI0);
                            }
                            function0 = (Function0) objI0;
                            c0VarR.A();
                        } else {
                            c0VarR.E(1810049027);
                            c0VarR.A();
                        }
                        q(aVarA, function0, a0Var4, z15, jVar2, w3Var2, c0VarR, i12 & 524160, 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var4;
                        z14 = z15;
                    } else {
                        c0VarR.u();
                        a0Var3 = a0Var2;
                        z14 = z12;
                    }
                    jVar3 = jVar2;
                    w3Var3 = w3Var2;
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material.c4
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return d4.h(z10, function1, a0Var3, z14, jVar3, w3Var3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 24576;
                jVar2 = jVar;
                if ((196608 & i10) == 0) {
                    if ((i11 & 32) == 0) {
                        w3Var2 = w3Var;
                        if (c0VarR.D(w3Var2)) {
                        }
                        i12 |= i18;
                    } else {
                        w3Var2 = w3Var;
                    }
                    i12 |= i18;
                } else {
                    w3Var2 = w3Var;
                }
                if ((74899 & i12) != 74898) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (c0VarR.h(z13, i12 & 1)) {
                    c0VarR.l0();
                    function0 = null;
                    if ((i10 & 1) != 0) {
                        if (i17 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            z15 = true;
                        } else {
                            z15 = z12;
                        }
                        if (i15 != 0) {
                            jVar4 = null;
                        } else {
                            jVar4 = jVar2;
                        }
                        if ((i11 & 32) != 0) {
                            w3 w3VarA2 = x3.f25473a.a(0L, 0L, 0L, 0L, 0L, c0VarR, androidx.profileinstaller.n.c.f73814m, 31);
                            c0VarR = c0VarR;
                            i12 &= -458753;
                            w3Var2 = w3VarA2;
                        }
                        jVar2 = jVar4;
                    } else {
                        if (i17 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            z15 = true;
                        } else {
                            z15 = z12;
                        }
                        if (i15 != 0) {
                            jVar4 = null;
                        } else {
                            jVar4 = jVar2;
                        }
                        if ((i11 & 32) != 0) {
                            w3 w3VarA3 = x3.f25473a.a(0L, 0L, 0L, 0L, 0L, c0VarR, androidx.profileinstaller.n.c.f73814m, 31);
                            c0VarR = c0VarR;
                            i12 &= -458753;
                            w3Var2 = w3VarA3;
                        }
                        jVar2 = jVar4;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-2118660998, i12, -1, "androidx.compose.material.Checkbox (Checkbox.kt:90)");
                    }
                    v0.a aVarA2 = v0.b.a(z10);
                    if (function1 != null) {
                        c0VarR.E(1809984331);
                        if ((i12 & com.planner5d.library.engine.input.f.b.B) == 32) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        z17 = z16 | ((i12 & 14) == 4);
                        objI0 = c0VarR.i0();
                        if (z17) {
                            objI0 = new Function0() { // from class: androidx.compose.material.b4
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return d4.g(function1, z10);
                                }
                            };
                            c0VarR.Y(objI0);
                        } else {
                            objI0 = new Function0() { // from class: androidx.compose.material.b4
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return d4.g(function1, z10);
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        function0 = (Function0) objI0;
                        c0VarR.A();
                    } else {
                        c0VarR.E(1810049027);
                        c0VarR.A();
                    }
                    q(aVarA2, function0, a0Var4, z15, jVar2, w3Var2, c0VarR, i12 & 524160, 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var4;
                    z14 = z15;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    z14 = z12;
                }
                jVar3 = jVar2;
                w3Var3 = w3Var2;
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.c4
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return d4.h(z10, function1, a0Var3, z14, jVar3, w3Var3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 3072;
            z12 = z11;
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
                        w3Var2 = w3Var;
                        if (c0VarR.D(w3Var2)) {
                        }
                        i12 |= i18;
                    } else {
                        w3Var2 = w3Var;
                    }
                    i12 |= i18;
                } else {
                    w3Var2 = w3Var;
                }
                if ((74899 & i12) != 74898) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (c0VarR.h(z13, i12 & 1)) {
                    c0VarR.l0();
                    function0 = null;
                    if ((i10 & 1) != 0) {
                        if (i17 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            z15 = true;
                        } else {
                            z15 = z12;
                        }
                        if (i15 != 0) {
                            jVar4 = null;
                        } else {
                            jVar4 = jVar2;
                        }
                        if ((i11 & 32) != 0) {
                            w3 w3VarA4 = x3.f25473a.a(0L, 0L, 0L, 0L, 0L, c0VarR, androidx.profileinstaller.n.c.f73814m, 31);
                            c0VarR = c0VarR;
                            i12 &= -458753;
                            w3Var2 = w3VarA4;
                        }
                        jVar2 = jVar4;
                    } else {
                        if (i17 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            z15 = true;
                        } else {
                            z15 = z12;
                        }
                        if (i15 != 0) {
                            jVar4 = null;
                        } else {
                            jVar4 = jVar2;
                        }
                        if ((i11 & 32) != 0) {
                            w3 w3VarA5 = x3.f25473a.a(0L, 0L, 0L, 0L, 0L, c0VarR, androidx.profileinstaller.n.c.f73814m, 31);
                            c0VarR = c0VarR;
                            i12 &= -458753;
                            w3Var2 = w3VarA5;
                        }
                        jVar2 = jVar4;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-2118660998, i12, -1, "androidx.compose.material.Checkbox (Checkbox.kt:90)");
                    }
                    v0.a aVarA3 = v0.b.a(z10);
                    if (function1 != null) {
                        c0VarR.E(1809984331);
                        if ((i12 & com.planner5d.library.engine.input.f.b.B) == 32) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        z17 = z16 | ((i12 & 14) == 4);
                        objI0 = c0VarR.i0();
                        if (z17) {
                            objI0 = new Function0() { // from class: androidx.compose.material.b4
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return d4.g(function1, z10);
                                }
                            };
                            c0VarR.Y(objI0);
                        } else {
                            objI0 = new Function0() { // from class: androidx.compose.material.b4
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return d4.g(function1, z10);
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        function0 = (Function0) objI0;
                        c0VarR.A();
                    } else {
                        c0VarR.E(1810049027);
                        c0VarR.A();
                    }
                    q(aVarA3, function0, a0Var4, z15, jVar2, w3Var2, c0VarR, i12 & 524160, 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var4;
                    z14 = z15;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    z14 = z12;
                }
                jVar3 = jVar2;
                w3Var3 = w3Var2;
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.c4
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return d4.h(z10, function1, a0Var3, z14, jVar3, w3Var3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 24576;
            jVar2 = jVar;
            if ((196608 & i10) == 0) {
                if ((i11 & 32) == 0) {
                    w3Var2 = w3Var;
                    if (c0VarR.D(w3Var2)) {
                    }
                    i12 |= i18;
                } else {
                    w3Var2 = w3Var;
                }
                i12 |= i18;
            } else {
                w3Var2 = w3Var;
            }
            if ((74899 & i12) != 74898) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c0VarR.h(z13, i12 & 1)) {
                c0VarR.l0();
                function0 = null;
                if ((i10 & 1) != 0) {
                    if (i17 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        z15 = true;
                    } else {
                        z15 = z12;
                    }
                    if (i15 != 0) {
                        jVar4 = null;
                    } else {
                        jVar4 = jVar2;
                    }
                    if ((i11 & 32) != 0) {
                        w3 w3VarA6 = x3.f25473a.a(0L, 0L, 0L, 0L, 0L, c0VarR, androidx.profileinstaller.n.c.f73814m, 31);
                        c0VarR = c0VarR;
                        i12 &= -458753;
                        w3Var2 = w3VarA6;
                    }
                    jVar2 = jVar4;
                } else {
                    if (i17 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        z15 = true;
                    } else {
                        z15 = z12;
                    }
                    if (i15 != 0) {
                        jVar4 = null;
                    } else {
                        jVar4 = jVar2;
                    }
                    if ((i11 & 32) != 0) {
                        w3 w3VarA7 = x3.f25473a.a(0L, 0L, 0L, 0L, 0L, c0VarR, androidx.profileinstaller.n.c.f73814m, 31);
                        c0VarR = c0VarR;
                        i12 &= -458753;
                        w3Var2 = w3VarA7;
                    }
                    jVar2 = jVar4;
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-2118660998, i12, -1, "androidx.compose.material.Checkbox (Checkbox.kt:90)");
                }
                v0.a aVarA4 = v0.b.a(z10);
                if (function1 != null) {
                    c0VarR.E(1809984331);
                    if ((i12 & com.planner5d.library.engine.input.f.b.B) == 32) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    z17 = z16 | ((i12 & 14) == 4);
                    objI0 = c0VarR.i0();
                    if (z17) {
                        objI0 = new Function0() { // from class: androidx.compose.material.b4
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return d4.g(function1, z10);
                            }
                        };
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = new Function0() { // from class: androidx.compose.material.b4
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return d4.g(function1, z10);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    function0 = (Function0) objI0;
                    c0VarR.A();
                } else {
                    c0VarR.E(1810049027);
                    c0VarR.A();
                }
                q(aVarA4, function0, a0Var4, z15, jVar2, w3Var2, c0VarR, i12 & 524160, 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var4;
                z14 = z15;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                z14 = z12;
            }
            jVar3 = jVar2;
            w3Var3 = w3Var2;
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material.c4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return d4.h(z10, function1, a0Var3, z14, jVar3, w3Var3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= androidx.media3.exoplayer.a5.S0;
        a0Var2 = a0Var;
        i13 = i11 & 8;
        if (i13 != 0) {
            if ((i10 & 3072) == 0) {
                z12 = z11;
                if (c0VarR.G(z12)) {
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
                        w3Var2 = w3Var;
                        if (c0VarR.D(w3Var2)) {
                        }
                        i12 |= i18;
                    } else {
                        w3Var2 = w3Var;
                    }
                    i12 |= i18;
                } else {
                    w3Var2 = w3Var;
                }
                if ((74899 & i12) != 74898) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (c0VarR.h(z13, i12 & 1)) {
                    c0VarR.l0();
                    function0 = null;
                    if ((i10 & 1) != 0) {
                        if (i17 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            z15 = true;
                        } else {
                            z15 = z12;
                        }
                        if (i15 != 0) {
                            jVar4 = null;
                        } else {
                            jVar4 = jVar2;
                        }
                        if ((i11 & 32) != 0) {
                            w3 w3VarA8 = x3.f25473a.a(0L, 0L, 0L, 0L, 0L, c0VarR, androidx.profileinstaller.n.c.f73814m, 31);
                            c0VarR = c0VarR;
                            i12 &= -458753;
                            w3Var2 = w3VarA8;
                        }
                        jVar2 = jVar4;
                    } else {
                        if (i17 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            z15 = true;
                        } else {
                            z15 = z12;
                        }
                        if (i15 != 0) {
                            jVar4 = null;
                        } else {
                            jVar4 = jVar2;
                        }
                        if ((i11 & 32) != 0) {
                            w3 w3VarA9 = x3.f25473a.a(0L, 0L, 0L, 0L, 0L, c0VarR, androidx.profileinstaller.n.c.f73814m, 31);
                            c0VarR = c0VarR;
                            i12 &= -458753;
                            w3Var2 = w3VarA9;
                        }
                        jVar2 = jVar4;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-2118660998, i12, -1, "androidx.compose.material.Checkbox (Checkbox.kt:90)");
                    }
                    v0.a aVarA5 = v0.b.a(z10);
                    if (function1 != null) {
                        c0VarR.E(1809984331);
                        if ((i12 & com.planner5d.library.engine.input.f.b.B) == 32) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        z17 = z16 | ((i12 & 14) == 4);
                        objI0 = c0VarR.i0();
                        if (z17) {
                            objI0 = new Function0() { // from class: androidx.compose.material.b4
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return d4.g(function1, z10);
                                }
                            };
                            c0VarR.Y(objI0);
                        } else {
                            objI0 = new Function0() { // from class: androidx.compose.material.b4
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return d4.g(function1, z10);
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        function0 = (Function0) objI0;
                        c0VarR.A();
                    } else {
                        c0VarR.E(1810049027);
                        c0VarR.A();
                    }
                    q(aVarA5, function0, a0Var4, z15, jVar2, w3Var2, c0VarR, i12 & 524160, 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var4;
                    z14 = z15;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    z14 = z12;
                }
                jVar3 = jVar2;
                w3Var3 = w3Var2;
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.c4
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return d4.h(z10, function1, a0Var3, z14, jVar3, w3Var3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 24576;
            jVar2 = jVar;
            if ((196608 & i10) == 0) {
                if ((i11 & 32) == 0) {
                    w3Var2 = w3Var;
                    if (c0VarR.D(w3Var2)) {
                    }
                    i12 |= i18;
                } else {
                    w3Var2 = w3Var;
                }
                i12 |= i18;
            } else {
                w3Var2 = w3Var;
            }
            if ((74899 & i12) != 74898) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c0VarR.h(z13, i12 & 1)) {
                c0VarR.l0();
                function0 = null;
                if ((i10 & 1) != 0) {
                    if (i17 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        z15 = true;
                    } else {
                        z15 = z12;
                    }
                    if (i15 != 0) {
                        jVar4 = null;
                    } else {
                        jVar4 = jVar2;
                    }
                    if ((i11 & 32) != 0) {
                        w3 w3VarA10 = x3.f25473a.a(0L, 0L, 0L, 0L, 0L, c0VarR, androidx.profileinstaller.n.c.f73814m, 31);
                        c0VarR = c0VarR;
                        i12 &= -458753;
                        w3Var2 = w3VarA10;
                    }
                    jVar2 = jVar4;
                } else {
                    if (i17 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        z15 = true;
                    } else {
                        z15 = z12;
                    }
                    if (i15 != 0) {
                        jVar4 = null;
                    } else {
                        jVar4 = jVar2;
                    }
                    if ((i11 & 32) != 0) {
                        w3 w3VarA11 = x3.f25473a.a(0L, 0L, 0L, 0L, 0L, c0VarR, androidx.profileinstaller.n.c.f73814m, 31);
                        c0VarR = c0VarR;
                        i12 &= -458753;
                        w3Var2 = w3VarA11;
                    }
                    jVar2 = jVar4;
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-2118660998, i12, -1, "androidx.compose.material.Checkbox (Checkbox.kt:90)");
                }
                v0.a aVarA6 = v0.b.a(z10);
                if (function1 != null) {
                    c0VarR.E(1809984331);
                    if ((i12 & com.planner5d.library.engine.input.f.b.B) == 32) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    z17 = z16 | ((i12 & 14) == 4);
                    objI0 = c0VarR.i0();
                    if (z17) {
                        objI0 = new Function0() { // from class: androidx.compose.material.b4
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return d4.g(function1, z10);
                            }
                        };
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = new Function0() { // from class: androidx.compose.material.b4
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return d4.g(function1, z10);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    function0 = (Function0) objI0;
                    c0VarR.A();
                } else {
                    c0VarR.E(1810049027);
                    c0VarR.A();
                }
                q(aVarA6, function0, a0Var4, z15, jVar2, w3Var2, c0VarR, i12 & 524160, 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var4;
                z14 = z15;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                z14 = z12;
            }
            jVar3 = jVar2;
            w3Var3 = w3Var2;
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material.c4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return d4.h(z10, function1, a0Var3, z14, jVar3, w3Var3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 3072;
        z12 = z11;
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
                    w3Var2 = w3Var;
                    if (c0VarR.D(w3Var2)) {
                    }
                    i12 |= i18;
                } else {
                    w3Var2 = w3Var;
                }
                i12 |= i18;
            } else {
                w3Var2 = w3Var;
            }
            if ((74899 & i12) != 74898) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c0VarR.h(z13, i12 & 1)) {
                c0VarR.l0();
                function0 = null;
                if ((i10 & 1) != 0) {
                    if (i17 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        z15 = true;
                    } else {
                        z15 = z12;
                    }
                    if (i15 != 0) {
                        jVar4 = null;
                    } else {
                        jVar4 = jVar2;
                    }
                    if ((i11 & 32) != 0) {
                        w3 w3VarA12 = x3.f25473a.a(0L, 0L, 0L, 0L, 0L, c0VarR, androidx.profileinstaller.n.c.f73814m, 31);
                        c0VarR = c0VarR;
                        i12 &= -458753;
                        w3Var2 = w3VarA12;
                    }
                    jVar2 = jVar4;
                } else {
                    if (i17 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        z15 = true;
                    } else {
                        z15 = z12;
                    }
                    if (i15 != 0) {
                        jVar4 = null;
                    } else {
                        jVar4 = jVar2;
                    }
                    if ((i11 & 32) != 0) {
                        w3 w3VarA13 = x3.f25473a.a(0L, 0L, 0L, 0L, 0L, c0VarR, androidx.profileinstaller.n.c.f73814m, 31);
                        c0VarR = c0VarR;
                        i12 &= -458753;
                        w3Var2 = w3VarA13;
                    }
                    jVar2 = jVar4;
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-2118660998, i12, -1, "androidx.compose.material.Checkbox (Checkbox.kt:90)");
                }
                v0.a aVarA7 = v0.b.a(z10);
                if (function1 != null) {
                    c0VarR.E(1809984331);
                    if ((i12 & com.planner5d.library.engine.input.f.b.B) == 32) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    z17 = z16 | ((i12 & 14) == 4);
                    objI0 = c0VarR.i0();
                    if (z17) {
                        objI0 = new Function0() { // from class: androidx.compose.material.b4
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return d4.g(function1, z10);
                            }
                        };
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = new Function0() { // from class: androidx.compose.material.b4
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return d4.g(function1, z10);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    function0 = (Function0) objI0;
                    c0VarR.A();
                } else {
                    c0VarR.E(1810049027);
                    c0VarR.A();
                }
                q(aVarA7, function0, a0Var4, z15, jVar2, w3Var2, c0VarR, i12 & 524160, 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var4;
                z14 = z15;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                z14 = z12;
            }
            jVar3 = jVar2;
            w3Var3 = w3Var2;
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material.c4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return d4.h(z10, function1, a0Var3, z14, jVar3, w3Var3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 24576;
        jVar2 = jVar;
        if ((196608 & i10) == 0) {
            if ((i11 & 32) == 0) {
                w3Var2 = w3Var;
                if (c0VarR.D(w3Var2)) {
                }
                i12 |= i18;
            } else {
                w3Var2 = w3Var;
            }
            i12 |= i18;
        } else {
            w3Var2 = w3Var;
        }
        if ((74899 & i12) != 74898) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (c0VarR.h(z13, i12 & 1)) {
            c0VarR.l0();
            function0 = null;
            if ((i10 & 1) != 0) {
                if (i17 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if (i13 != 0) {
                    z15 = true;
                } else {
                    z15 = z12;
                }
                if (i15 != 0) {
                    jVar4 = null;
                } else {
                    jVar4 = jVar2;
                }
                if ((i11 & 32) != 0) {
                    w3 w3VarA14 = x3.f25473a.a(0L, 0L, 0L, 0L, 0L, c0VarR, androidx.profileinstaller.n.c.f73814m, 31);
                    c0VarR = c0VarR;
                    i12 &= -458753;
                    w3Var2 = w3VarA14;
                }
                jVar2 = jVar4;
            } else {
                if (i17 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if (i13 != 0) {
                    z15 = true;
                } else {
                    z15 = z12;
                }
                if (i15 != 0) {
                    jVar4 = null;
                } else {
                    jVar4 = jVar2;
                }
                if ((i11 & 32) != 0) {
                    w3 w3VarA15 = x3.f25473a.a(0L, 0L, 0L, 0L, 0L, c0VarR, androidx.profileinstaller.n.c.f73814m, 31);
                    c0VarR = c0VarR;
                    i12 &= -458753;
                    w3Var2 = w3VarA15;
                }
                jVar2 = jVar4;
            }
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-2118660998, i12, -1, "androidx.compose.material.Checkbox (Checkbox.kt:90)");
            }
            v0.a aVarA8 = v0.b.a(z10);
            if (function1 != null) {
                c0VarR.E(1809984331);
                if ((i12 & com.planner5d.library.engine.input.f.b.B) == 32) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                z17 = z16 | ((i12 & 14) == 4);
                objI0 = c0VarR.i0();
                if (z17) {
                    objI0 = new Function0() { // from class: androidx.compose.material.b4
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return d4.g(function1, z10);
                        }
                    };
                    c0VarR.Y(objI0);
                } else {
                    objI0 = new Function0() { // from class: androidx.compose.material.b4
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return d4.g(function1, z10);
                        }
                    };
                    c0VarR.Y(objI0);
                }
                function0 = (Function0) objI0;
                c0VarR.A();
            } else {
                c0VarR.E(1810049027);
                c0VarR.A();
            }
            q(aVarA8, function0, a0Var4, z15, jVar2, w3Var2, c0VarR, i12 & 524160, 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            a0Var3 = a0Var4;
            z14 = z15;
        } else {
            c0VarR.u();
            a0Var3 = a0Var2;
            z14 = z12;
        }
        jVar3 = jVar2;
        w3Var3 = w3Var2;
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material.c4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return d4.h(z10, function1, a0Var3, z14, jVar3, w3Var3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(Function1 function1, boolean z10) {
        function1.invoke(Boolean.valueOf(!z10));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit h(boolean z10, Function1 function1, androidx.compose.ui.a0 a0Var, boolean z11, androidx.compose.foundation.interaction.j jVar, w3 w3Var, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        f(z10, function1, a0Var, z11, jVar, w3Var, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x01be  */
    /* JADX WARN: Code duplicated, block: B:104:0x01c5  */
    /* JADX WARN: Code duplicated, block: B:107:0x01f7  */
    /* JADX WARN: Code duplicated, block: B:112:0x025e  */
    /* JADX WARN: Code duplicated, block: B:115:0x0280  */
    /* JADX WARN: Code duplicated, block: B:72:0x011e  */
    /* JADX WARN: Code duplicated, block: B:75:0x0165  */
    /* JADX WARN: Code duplicated, block: B:85:0x0181  */
    /* JADX WARN: Code duplicated, block: B:88:0x0189  */
    /* JADX WARN: Code duplicated, block: B:91:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:94:0x01af  */
    /* JADX WARN: Code duplicated, block: B:96:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:98:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:99:0x01b8  */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    private static final void i(final boolean z10, final v0.a aVar, final androidx.compose.ui.a0 a0Var, final w3 w3Var, androidx.compose.runtime.c0 c0Var, final int i10) {
        int i11;
        float f10;
        int i12;
        float f11;
        int i13;
        final androidx.compose.runtime.n7 n7VarD;
        int i14;
        float f12;
        int i15;
        int i16;
        final androidx.compose.runtime.n7 n7VarD2;
        Object objI0;
        androidx.compose.runtime.c0.a aVar2;
        final v3 v3Var;
        final androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarB;
        final androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarA;
        final androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarC;
        boolean zD;
        Object objI1;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-2118895727);
        if ((i10 & 6) == 0) {
            i11 = (c0VarR.G(z10) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c0VarR.K(aVar.ordinal()) ? 32 : 16;
        }
        if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
            i11 |= c0VarR.D(a0Var) ? 256 : 128;
        }
        if ((i10 & 3072) == 0) {
            i11 |= c0VarR.D(w3Var) ? 2048 : 1024;
        }
        if (c0VarR.h((i11 & 1171) != 1170, i11 & 1)) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-2118895727, i11, -1, "androidx.compose.material.CheckboxImpl (Checkbox.kt:256)");
            }
            int i17 = i11 >> 3;
            int i18 = i17 & 14;
            int i19 = i11;
            androidx.compose.animation.core.l3 l3VarJ = androidx.compose.animation.core.w3.J(aVar, null, c0VarR, i18, 2);
            b bVar = b.f22491a;
            kotlin.jvm.internal.z zVar = kotlin.jvm.internal.z.f312833a;
            androidx.compose.animation.core.z3<Float, androidx.compose.animation.core.s> z3VarP = androidx.compose.animation.core.t4.P(zVar);
            v0.a aVar3 = (v0.a) l3VarJ.p();
            c0VarR.E(-1798345588);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1798345588, 0, -1, "androidx.compose.material.CheckboxImpl.<anonymous> (Checkbox.kt:268)");
            }
            int[] iArr = c.f22492a;
            int i20 = iArr[aVar3.ordinal()];
            float f13 = 0.0f;
            if (i20 == 1) {
                f10 = 1.0f;
            } else if (i20 != 2) {
                if (i20 != 3) {
                    throw new kotlin.k0();
                }
                f10 = 1.0f;
            } else {
                f10 = 0.0f;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            c0VarR.A();
            Float fValueOf = Float.valueOf(f10);
            v0.a aVar4 = (v0.a) l3VarJ.y();
            c0VarR.E(-1798345588);
            if (androidx.compose.runtime.m0.l0()) {
                i12 = -1;
                androidx.compose.runtime.m0.A0(-1798345588, 0, -1, "androidx.compose.material.CheckboxImpl.<anonymous> (Checkbox.kt:268)");
            } else {
                i12 = -1;
            }
            int i21 = iArr[aVar4.ordinal()];
            if (i21 != 1) {
                if (i21 == 2) {
                    f11 = 0.0f;
                } else if (i21 != 3) {
                    throw new kotlin.k0();
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                c0VarR.A();
                i13 = i12;
                n7VarD = androidx.compose.animation.core.w3.D(l3VarJ, fValueOf, Float.valueOf(f11), bVar.invoke(l3VarJ.w(), c0VarR, 0), z3VarP, "FloatAnimation", c0VarR, 0);
                a aVar5 = a.f22490a;
                androidx.compose.animation.core.z3<Float, androidx.compose.animation.core.s> z3VarP2 = androidx.compose.animation.core.t4.P(zVar);
                v0.a aVar6 = (v0.a) l3VarJ.p();
                c0VarR.E(-2098942571);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-2098942571, 0, i13, "androidx.compose.material.CheckboxImpl.<anonymous> (Checkbox.kt:285)");
                }
                i14 = iArr[aVar6.ordinal()];
                if (i14 != 1 || i14 == 2) {
                    f12 = 0.0f;
                } else {
                    if (i14 != 3) {
                        throw new kotlin.k0();
                    }
                    f12 = 1.0f;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                c0VarR.A();
                Float fValueOf2 = Float.valueOf(f12);
                v0.a aVar7 = (v0.a) l3VarJ.y();
                c0VarR.E(-2098942571);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-2098942571, 0, i13, "androidx.compose.material.CheckboxImpl.<anonymous> (Checkbox.kt:285)");
                }
                i15 = iArr[aVar7.ordinal()];
                if (i15 != 1) {
                    i16 = 2;
                    if (i15 != 2) {
                        if (i15 == 3) {
                            throw new kotlin.k0();
                        }
                        f13 = 1.0f;
                    }
                } else {
                    i16 = 2;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                c0VarR.A();
                Float fValueOf3 = Float.valueOf(f13);
                androidx.compose.animation.core.y0<Float> y0VarInvoke = aVar5.invoke(l3VarJ.w(), c0VarR, 0);
                int i22 = i16;
                n7VarD2 = androidx.compose.animation.core.w3.D(l3VarJ, fValueOf2, fValueOf3, y0VarInvoke, z3VarP2, "FloatAnimation", c0VarR, 0);
                objI0 = c0VarR.i0();
                aVar2 = androidx.compose.runtime.c0.f35327a;
                if (objI0 == aVar2.a()) {
                    objI0 = new v3(null, null, null, 7, null);
                    c0VarR.Y(objI0);
                }
                v3Var = (v3) objI0;
                n7VarB = w3Var.b(aVar, c0VarR, i18 | ((i19 >> 6) & com.planner5d.library.engine.input.f.b.B));
                int i23 = (i17 & 896) | (i19 & okhttp3.internal.ws.g.f334652s);
                n7VarA = w3Var.a(z10, aVar, c0VarR, i23);
                n7VarC = w3Var.c(z10, aVar, c0VarR, i23);
                androidx.compose.ui.a0 a0VarO = androidx.compose.foundation.layout.i6.o(androidx.compose.foundation.layout.i6.H(a0Var, androidx.compose.ui.e.f37317a.i(), false, i22, null), f22487f);
                zD = c0VarR.D(n7VarA) | c0VarR.D(n7VarC) | c0VarR.D(n7VarB) | c0VarR.D(n7VarD) | c0VarR.D(n7VarD2);
                objI1 = c0VarR.i0();
                if (zD || objI1 == aVar2.a()) {
                    objI1 = new Function1() { // from class: androidx.compose.material.y3
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return d4.l(v3Var, n7VarA, n7VarC, n7VarB, n7VarD, n7VarD2, (androidx.compose.ui.graphics.drawscope.f) obj);
                        }
                    };
                    c0VarR.Y(objI1);
                }
                androidx.compose.foundation.f1.e(a0VarO, (Function1) objI1, c0VarR, 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
            }
            f11 = 1.0f;
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            c0VarR.A();
            i13 = i12;
            n7VarD = androidx.compose.animation.core.w3.D(l3VarJ, fValueOf, Float.valueOf(f11), bVar.invoke(l3VarJ.w(), c0VarR, 0), z3VarP, "FloatAnimation", c0VarR, 0);
            a aVar8 = a.f22490a;
            androidx.compose.animation.core.z3<Float, androidx.compose.animation.core.s> z3VarP3 = androidx.compose.animation.core.t4.P(zVar);
            v0.a aVar9 = (v0.a) l3VarJ.p();
            c0VarR.E(-2098942571);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-2098942571, 0, i13, "androidx.compose.material.CheckboxImpl.<anonymous> (Checkbox.kt:285)");
            }
            i14 = iArr[aVar9.ordinal()];
            if (i14 != 1) {
                f12 = 0.0f;
            } else {
                f12 = 0.0f;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            c0VarR.A();
            Float fValueOf4 = Float.valueOf(f12);
            v0.a aVar10 = (v0.a) l3VarJ.y();
            c0VarR.E(-2098942571);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-2098942571, 0, i13, "androidx.compose.material.CheckboxImpl.<anonymous> (Checkbox.kt:285)");
            }
            i15 = iArr[aVar10.ordinal()];
            if (i15 != 1) {
                i16 = 2;
                if (i15 != 2) {
                    if (i15 == 3) {
                        throw new kotlin.k0();
                    }
                    f13 = 1.0f;
                }
            } else {
                i16 = 2;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            c0VarR.A();
            Float fValueOf5 = Float.valueOf(f13);
            androidx.compose.animation.core.y0<Float> y0VarInvoke2 = aVar8.invoke(l3VarJ.w(), c0VarR, 0);
            int i24 = i16;
            n7VarD2 = androidx.compose.animation.core.w3.D(l3VarJ, fValueOf4, fValueOf5, y0VarInvoke2, z3VarP3, "FloatAnimation", c0VarR, 0);
            objI0 = c0VarR.i0();
            aVar2 = androidx.compose.runtime.c0.f35327a;
            if (objI0 == aVar2.a()) {
                objI0 = new v3(null, null, null, 7, null);
                c0VarR.Y(objI0);
            }
            v3Var = (v3) objI0;
            n7VarB = w3Var.b(aVar, c0VarR, i18 | ((i19 >> 6) & com.planner5d.library.engine.input.f.b.B));
            int i25 = (i17 & 896) | (i19 & okhttp3.internal.ws.g.f334652s);
            n7VarA = w3Var.a(z10, aVar, c0VarR, i25);
            n7VarC = w3Var.c(z10, aVar, c0VarR, i25);
            androidx.compose.ui.a0 a0VarO2 = androidx.compose.foundation.layout.i6.o(androidx.compose.foundation.layout.i6.H(a0Var, androidx.compose.ui.e.f37317a.i(), false, i24, null), f22487f);
            zD = c0VarR.D(n7VarA) | c0VarR.D(n7VarC) | c0VarR.D(n7VarB) | c0VarR.D(n7VarD) | c0VarR.D(n7VarD2);
            objI1 = c0VarR.i0();
            if (zD) {
                objI1 = new Function1() { // from class: androidx.compose.material.y3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return d4.l(v3Var, n7VarA, n7VarC, n7VarB, n7VarD, n7VarD2, (androidx.compose.ui.graphics.drawscope.f) obj);
                    }
                };
                c0VarR.Y(objI1);
            } else {
                objI1 = new Function1() { // from class: androidx.compose.material.y3
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return d4.l(v3Var, n7VarA, n7VarC, n7VarB, n7VarD, n7VarD2, (androidx.compose.ui.graphics.drawscope.f) obj);
                    }
                };
                c0VarR.Y(objI1);
            }
            androidx.compose.foundation.f1.e(a0VarO2, (Function1) objI1, c0VarR, 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0VarR.u();
        }
        androidx.compose.runtime.s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material.z3
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return d4.m(z10, aVar, a0Var, w3Var, i10, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    private static final long j(androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7Var) {
        return n7Var.getValue().M();
    }

    private static final long k(androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7Var) {
        return n7Var.getValue().M();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(v3 v3Var, androidx.compose.runtime.n7 n7Var, androidx.compose.runtime.n7 n7Var2, androidx.compose.runtime.n7 n7Var3, androidx.compose.runtime.n7 n7Var4, androidx.compose.runtime.n7 n7Var5, androidx.compose.ui.graphics.drawscope.f fVar) {
        float fFloor = (float) Math.floor(fVar.S7(f22488g));
        s(fVar, j(n7Var), k(n7Var2), fVar.S7(f22489h), fFloor);
        t(fVar, p(n7Var3), n(n7Var4), o(n7Var5), fFloor, v3Var);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(boolean z10, v0.a aVar, androidx.compose.ui.a0 a0Var, w3 w3Var, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        i(z10, aVar, a0Var, w3Var, c0Var, androidx.compose.runtime.t4.a(i10 | 1));
        return Unit.f312394a;
    }

    private static final float n(androidx.compose.runtime.n7<Float> n7Var) {
        return n7Var.getValue().floatValue();
    }

    private static final float o(androidx.compose.runtime.n7<Float> n7Var) {
        return n7Var.getValue().floatValue();
    }

    private static final long p(androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7Var) {
        return n7Var.getValue().M();
    }

    /* JADX WARN: Code duplicated, block: B:100:0x013d  */
    /* JADX WARN: Code duplicated, block: B:101:0x0166  */
    /* JADX WARN: Code duplicated, block: B:103:0x016b  */
    /* JADX WARN: Code duplicated, block: B:104:0x0172  */
    /* JADX WARN: Code duplicated, block: B:107:0x01a1  */
    /* JADX WARN: Code duplicated, block: B:110:0x01a9  */
    /* JADX WARN: Code duplicated, block: B:113:0x01b9  */
    /* JADX WARN: Code duplicated, block: B:115:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x005f  */
    /* JADX WARN: Code duplicated, block: B:38:0x0064  */
    /* JADX WARN: Code duplicated, block: B:40:0x0068  */
    /* JADX WARN: Code duplicated, block: B:42:0x0072  */
    /* JADX WARN: Code duplicated, block: B:43:0x0075  */
    /* JADX WARN: Code duplicated, block: B:47:0x007c  */
    /* JADX WARN: Code duplicated, block: B:49:0x0081  */
    /* JADX WARN: Code duplicated, block: B:51:0x0085  */
    /* JADX WARN: Code duplicated, block: B:53:0x008d  */
    /* JADX WARN: Code duplicated, block: B:54:0x0090  */
    /* JADX WARN: Code duplicated, block: B:58:0x0098  */
    /* JADX WARN: Code duplicated, block: B:60:0x009c  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a4  */
    /* JADX WARN: Code duplicated, block: B:63:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:66:0x00af  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bb  */
    /* JADX WARN: Code duplicated, block: B:70:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c6  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:83:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:84:0x00ee  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f1  */
    /* JADX WARN: Code duplicated, block: B:87:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:90:0x00f9  */
    /* JADX WARN: Code duplicated, block: B:93:0x00fe  */
    /* JADX WARN: Code duplicated, block: B:95:0x0122  */
    /* JADX WARN: Code duplicated, block: B:98:0x0133  */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void q(@NotNull final v0.a aVar, @Nullable final Function0<Unit> function0, @Nullable androidx.compose.ui.a0 a0Var, boolean z10, @Nullable androidx.compose.foundation.interaction.j jVar, @Nullable w3 w3Var, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        androidx.compose.ui.a0 a0Var2;
        int i13;
        boolean z11;
        int i14;
        int i15;
        androidx.compose.foundation.interaction.j jVar2;
        int i16;
        w3 w3VarA;
        boolean z12;
        androidx.compose.runtime.c0 c0Var2;
        final androidx.compose.ui.a0 a0Var3;
        final boolean z13;
        final w3 w3Var2;
        final androidx.compose.foundation.interaction.j jVar3;
        androidx.compose.runtime.s5 s5VarT;
        androidx.compose.ui.a0 a0Var4;
        boolean z14;
        androidx.compose.foundation.interaction.j jVar4;
        int i17;
        androidx.compose.ui.a0 a0VarG;
        androidx.compose.ui.a0 a0VarH;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(2031255194);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c0VarR.K(aVar.ordinal()) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= c0VarR.k0(function0) ? 32 : 16;
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
                    z11 = z10;
                    if (c0VarR.G(z11)) {
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
                            w3VarA = w3Var;
                            int i19 = c0VarR.D(w3VarA) ? 131072 : 65536;
                            i12 |= i19;
                        } else {
                            w3VarA = w3Var;
                        }
                        i12 |= i19;
                    } else {
                        w3VarA = w3Var;
                    }
                    if ((74899 & i12) != 74898) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (c0VarR.h(z12, i12 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0 || c0VarR.y()) {
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
                                jVar4 = null;
                            } else {
                                jVar4 = jVar2;
                            }
                            if ((i11 & 32) != 0) {
                                c0Var2 = c0VarR;
                                i17 = i12 & (-458753);
                                w3VarA = x3.f25473a.a(0L, 0L, 0L, 0L, 0L, c0Var2, androidx.profileinstaller.n.c.f73814m, 31);
                            } else {
                                c0Var2 = c0VarR;
                                i17 = i12;
                            }
                            jVar2 = jVar4;
                        } else {
                            c0VarR.u();
                            if ((i11 & 32) != 0) {
                                i12 &= -458753;
                            }
                            i17 = i12;
                            c0Var2 = c0VarR;
                            z14 = z11;
                            jVar2 = jVar2;
                            a0Var4 = a0Var2;
                        }
                        c0Var2.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(2031255194, i17, -1, "androidx.compose.material.TriStateCheckbox (Checkbox.kt:138)");
                        }
                        if (function0 != null) {
                            boolean z15 = z14;
                            a0VarG = androidx.compose.foundation.selection.e.g(androidx.compose.ui.a0.E, aVar, jVar2, wd.h(false, f22485d, 0L, 4, null), z15, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.c()), function0);
                            z14 = z15;
                        } else {
                            a0VarG = androidx.compose.ui.a0.E;
                        }
                        if (function0 != null) {
                            a0VarH = l9.h(androidx.compose.ui.a0.E);
                        } else {
                            a0VarH = androidx.compose.ui.a0.E;
                        }
                        w3 w3Var3 = w3VarA;
                        i(z14, aVar, androidx.compose.foundation.layout.d5.r(a0Var4.B2(a0VarH).B2(a0VarG), f22486e), w3Var3, c0Var2, ((i17 >> 9) & 14) | ((i17 << 3) & com.planner5d.library.engine.input.f.b.B) | ((i17 >> 6) & 7168));
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        w3Var2 = w3Var3;
                        a0Var3 = a0Var4;
                        z13 = z14;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        a0Var3 = a0Var2;
                        z13 = z11;
                        w3Var2 = w3VarA;
                    }
                    jVar3 = jVar2;
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material.a4
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return d4.r(aVar, function0, a0Var3, z13, jVar3, w3Var2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 24576;
                jVar2 = jVar;
                if ((196608 & i10) == 0) {
                    if ((i11 & 32) == 0) {
                        w3VarA = w3Var;
                        if (c0VarR.D(w3VarA)) {
                        }
                        i12 |= i19;
                    } else {
                        w3VarA = w3Var;
                    }
                    i12 |= i19;
                } else {
                    w3VarA = w3Var;
                }
                if ((74899 & i12) != 74898) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
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
                            jVar4 = null;
                        } else {
                            jVar4 = jVar2;
                        }
                        if ((i11 & 32) != 0) {
                            c0Var2 = c0VarR;
                            i17 = i12 & (-458753);
                            w3VarA = x3.f25473a.a(0L, 0L, 0L, 0L, 0L, c0Var2, androidx.profileinstaller.n.c.f73814m, 31);
                        } else {
                            c0Var2 = c0VarR;
                            i17 = i12;
                        }
                        jVar2 = jVar4;
                    } else {
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
                            jVar4 = null;
                        } else {
                            jVar4 = jVar2;
                        }
                        if ((i11 & 32) != 0) {
                            c0Var2 = c0VarR;
                            i17 = i12 & (-458753);
                            w3VarA = x3.f25473a.a(0L, 0L, 0L, 0L, 0L, c0Var2, androidx.profileinstaller.n.c.f73814m, 31);
                        } else {
                            c0Var2 = c0VarR;
                            i17 = i12;
                        }
                        jVar2 = jVar4;
                    }
                    c0Var2.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(2031255194, i17, -1, "androidx.compose.material.TriStateCheckbox (Checkbox.kt:138)");
                    }
                    if (function0 != null) {
                        boolean z16 = z14;
                        a0VarG = androidx.compose.foundation.selection.e.g(androidx.compose.ui.a0.E, aVar, jVar2, wd.h(false, f22485d, 0L, 4, null), z16, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.c()), function0);
                        z14 = z16;
                    } else {
                        a0VarG = androidx.compose.ui.a0.E;
                    }
                    if (function0 != null) {
                        a0VarH = l9.h(androidx.compose.ui.a0.E);
                    } else {
                        a0VarH = androidx.compose.ui.a0.E;
                    }
                    w3 w3Var4 = w3VarA;
                    i(z14, aVar, androidx.compose.foundation.layout.d5.r(a0Var4.B2(a0VarH).B2(a0VarG), f22486e), w3Var4, c0Var2, ((i17 >> 9) & 14) | ((i17 << 3) & com.planner5d.library.engine.input.f.b.B) | ((i17 >> 6) & 7168));
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    w3Var2 = w3Var4;
                    a0Var3 = a0Var4;
                    z13 = z14;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var3 = a0Var2;
                    z13 = z11;
                    w3Var2 = w3VarA;
                }
                jVar3 = jVar2;
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.a4
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return d4.r(aVar, function0, a0Var3, z13, jVar3, w3Var2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 3072;
            z11 = z10;
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
                        w3VarA = w3Var;
                        if (c0VarR.D(w3VarA)) {
                        }
                        i12 |= i19;
                    } else {
                        w3VarA = w3Var;
                    }
                    i12 |= i19;
                } else {
                    w3VarA = w3Var;
                }
                if ((74899 & i12) != 74898) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
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
                            jVar4 = null;
                        } else {
                            jVar4 = jVar2;
                        }
                        if ((i11 & 32) != 0) {
                            c0Var2 = c0VarR;
                            i17 = i12 & (-458753);
                            w3VarA = x3.f25473a.a(0L, 0L, 0L, 0L, 0L, c0Var2, androidx.profileinstaller.n.c.f73814m, 31);
                        } else {
                            c0Var2 = c0VarR;
                            i17 = i12;
                        }
                        jVar2 = jVar4;
                    } else {
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
                            jVar4 = null;
                        } else {
                            jVar4 = jVar2;
                        }
                        if ((i11 & 32) != 0) {
                            c0Var2 = c0VarR;
                            i17 = i12 & (-458753);
                            w3VarA = x3.f25473a.a(0L, 0L, 0L, 0L, 0L, c0Var2, androidx.profileinstaller.n.c.f73814m, 31);
                        } else {
                            c0Var2 = c0VarR;
                            i17 = i12;
                        }
                        jVar2 = jVar4;
                    }
                    c0Var2.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(2031255194, i17, -1, "androidx.compose.material.TriStateCheckbox (Checkbox.kt:138)");
                    }
                    if (function0 != null) {
                        boolean z17 = z14;
                        a0VarG = androidx.compose.foundation.selection.e.g(androidx.compose.ui.a0.E, aVar, jVar2, wd.h(false, f22485d, 0L, 4, null), z17, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.c()), function0);
                        z14 = z17;
                    } else {
                        a0VarG = androidx.compose.ui.a0.E;
                    }
                    if (function0 != null) {
                        a0VarH = l9.h(androidx.compose.ui.a0.E);
                    } else {
                        a0VarH = androidx.compose.ui.a0.E;
                    }
                    w3 w3Var5 = w3VarA;
                    i(z14, aVar, androidx.compose.foundation.layout.d5.r(a0Var4.B2(a0VarH).B2(a0VarG), f22486e), w3Var5, c0Var2, ((i17 >> 9) & 14) | ((i17 << 3) & com.planner5d.library.engine.input.f.b.B) | ((i17 >> 6) & 7168));
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    w3Var2 = w3Var5;
                    a0Var3 = a0Var4;
                    z13 = z14;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var3 = a0Var2;
                    z13 = z11;
                    w3Var2 = w3VarA;
                }
                jVar3 = jVar2;
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.a4
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return d4.r(aVar, function0, a0Var3, z13, jVar3, w3Var2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 24576;
            jVar2 = jVar;
            if ((196608 & i10) == 0) {
                if ((i11 & 32) == 0) {
                    w3VarA = w3Var;
                    if (c0VarR.D(w3VarA)) {
                    }
                    i12 |= i19;
                } else {
                    w3VarA = w3Var;
                }
                i12 |= i19;
            } else {
                w3VarA = w3Var;
            }
            if ((74899 & i12) != 74898) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
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
                        jVar4 = null;
                    } else {
                        jVar4 = jVar2;
                    }
                    if ((i11 & 32) != 0) {
                        c0Var2 = c0VarR;
                        i17 = i12 & (-458753);
                        w3VarA = x3.f25473a.a(0L, 0L, 0L, 0L, 0L, c0Var2, androidx.profileinstaller.n.c.f73814m, 31);
                    } else {
                        c0Var2 = c0VarR;
                        i17 = i12;
                    }
                    jVar2 = jVar4;
                } else {
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
                        jVar4 = null;
                    } else {
                        jVar4 = jVar2;
                    }
                    if ((i11 & 32) != 0) {
                        c0Var2 = c0VarR;
                        i17 = i12 & (-458753);
                        w3VarA = x3.f25473a.a(0L, 0L, 0L, 0L, 0L, c0Var2, androidx.profileinstaller.n.c.f73814m, 31);
                    } else {
                        c0Var2 = c0VarR;
                        i17 = i12;
                    }
                    jVar2 = jVar4;
                }
                c0Var2.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(2031255194, i17, -1, "androidx.compose.material.TriStateCheckbox (Checkbox.kt:138)");
                }
                if (function0 != null) {
                    boolean z18 = z14;
                    a0VarG = androidx.compose.foundation.selection.e.g(androidx.compose.ui.a0.E, aVar, jVar2, wd.h(false, f22485d, 0L, 4, null), z18, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.c()), function0);
                    z14 = z18;
                } else {
                    a0VarG = androidx.compose.ui.a0.E;
                }
                if (function0 != null) {
                    a0VarH = l9.h(androidx.compose.ui.a0.E);
                } else {
                    a0VarH = androidx.compose.ui.a0.E;
                }
                w3 w3Var6 = w3VarA;
                i(z14, aVar, androidx.compose.foundation.layout.d5.r(a0Var4.B2(a0VarH).B2(a0VarG), f22486e), w3Var6, c0Var2, ((i17 >> 9) & 14) | ((i17 << 3) & com.planner5d.library.engine.input.f.b.B) | ((i17 >> 6) & 7168));
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                w3Var2 = w3Var6;
                a0Var3 = a0Var4;
                z13 = z14;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var3 = a0Var2;
                z13 = z11;
                w3Var2 = w3VarA;
            }
            jVar3 = jVar2;
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material.a4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return d4.r(aVar, function0, a0Var3, z13, jVar3, w3Var2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= androidx.media3.exoplayer.a5.S0;
        a0Var2 = a0Var;
        i13 = i11 & 8;
        if (i13 != 0) {
            if ((i10 & 3072) == 0) {
                z11 = z10;
                if (c0VarR.G(z11)) {
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
                        w3VarA = w3Var;
                        if (c0VarR.D(w3VarA)) {
                        }
                        i12 |= i19;
                    } else {
                        w3VarA = w3Var;
                    }
                    i12 |= i19;
                } else {
                    w3VarA = w3Var;
                }
                if ((74899 & i12) != 74898) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
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
                            jVar4 = null;
                        } else {
                            jVar4 = jVar2;
                        }
                        if ((i11 & 32) != 0) {
                            c0Var2 = c0VarR;
                            i17 = i12 & (-458753);
                            w3VarA = x3.f25473a.a(0L, 0L, 0L, 0L, 0L, c0Var2, androidx.profileinstaller.n.c.f73814m, 31);
                        } else {
                            c0Var2 = c0VarR;
                            i17 = i12;
                        }
                        jVar2 = jVar4;
                    } else {
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
                            jVar4 = null;
                        } else {
                            jVar4 = jVar2;
                        }
                        if ((i11 & 32) != 0) {
                            c0Var2 = c0VarR;
                            i17 = i12 & (-458753);
                            w3VarA = x3.f25473a.a(0L, 0L, 0L, 0L, 0L, c0Var2, androidx.profileinstaller.n.c.f73814m, 31);
                        } else {
                            c0Var2 = c0VarR;
                            i17 = i12;
                        }
                        jVar2 = jVar4;
                    }
                    c0Var2.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(2031255194, i17, -1, "androidx.compose.material.TriStateCheckbox (Checkbox.kt:138)");
                    }
                    if (function0 != null) {
                        boolean z19 = z14;
                        a0VarG = androidx.compose.foundation.selection.e.g(androidx.compose.ui.a0.E, aVar, jVar2, wd.h(false, f22485d, 0L, 4, null), z19, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.c()), function0);
                        z14 = z19;
                    } else {
                        a0VarG = androidx.compose.ui.a0.E;
                    }
                    if (function0 != null) {
                        a0VarH = l9.h(androidx.compose.ui.a0.E);
                    } else {
                        a0VarH = androidx.compose.ui.a0.E;
                    }
                    w3 w3Var7 = w3VarA;
                    i(z14, aVar, androidx.compose.foundation.layout.d5.r(a0Var4.B2(a0VarH).B2(a0VarG), f22486e), w3Var7, c0Var2, ((i17 >> 9) & 14) | ((i17 << 3) & com.planner5d.library.engine.input.f.b.B) | ((i17 >> 6) & 7168));
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    w3Var2 = w3Var7;
                    a0Var3 = a0Var4;
                    z13 = z14;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var3 = a0Var2;
                    z13 = z11;
                    w3Var2 = w3VarA;
                }
                jVar3 = jVar2;
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.a4
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return d4.r(aVar, function0, a0Var3, z13, jVar3, w3Var2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 24576;
            jVar2 = jVar;
            if ((196608 & i10) == 0) {
                if ((i11 & 32) == 0) {
                    w3VarA = w3Var;
                    if (c0VarR.D(w3VarA)) {
                    }
                    i12 |= i19;
                } else {
                    w3VarA = w3Var;
                }
                i12 |= i19;
            } else {
                w3VarA = w3Var;
            }
            if ((74899 & i12) != 74898) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
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
                        jVar4 = null;
                    } else {
                        jVar4 = jVar2;
                    }
                    if ((i11 & 32) != 0) {
                        c0Var2 = c0VarR;
                        i17 = i12 & (-458753);
                        w3VarA = x3.f25473a.a(0L, 0L, 0L, 0L, 0L, c0Var2, androidx.profileinstaller.n.c.f73814m, 31);
                    } else {
                        c0Var2 = c0VarR;
                        i17 = i12;
                    }
                    jVar2 = jVar4;
                } else {
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
                        jVar4 = null;
                    } else {
                        jVar4 = jVar2;
                    }
                    if ((i11 & 32) != 0) {
                        c0Var2 = c0VarR;
                        i17 = i12 & (-458753);
                        w3VarA = x3.f25473a.a(0L, 0L, 0L, 0L, 0L, c0Var2, androidx.profileinstaller.n.c.f73814m, 31);
                    } else {
                        c0Var2 = c0VarR;
                        i17 = i12;
                    }
                    jVar2 = jVar4;
                }
                c0Var2.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(2031255194, i17, -1, "androidx.compose.material.TriStateCheckbox (Checkbox.kt:138)");
                }
                if (function0 != null) {
                    boolean z110 = z14;
                    a0VarG = androidx.compose.foundation.selection.e.g(androidx.compose.ui.a0.E, aVar, jVar2, wd.h(false, f22485d, 0L, 4, null), z110, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.c()), function0);
                    z14 = z110;
                } else {
                    a0VarG = androidx.compose.ui.a0.E;
                }
                if (function0 != null) {
                    a0VarH = l9.h(androidx.compose.ui.a0.E);
                } else {
                    a0VarH = androidx.compose.ui.a0.E;
                }
                w3 w3Var8 = w3VarA;
                i(z14, aVar, androidx.compose.foundation.layout.d5.r(a0Var4.B2(a0VarH).B2(a0VarG), f22486e), w3Var8, c0Var2, ((i17 >> 9) & 14) | ((i17 << 3) & com.planner5d.library.engine.input.f.b.B) | ((i17 >> 6) & 7168));
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                w3Var2 = w3Var8;
                a0Var3 = a0Var4;
                z13 = z14;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var3 = a0Var2;
                z13 = z11;
                w3Var2 = w3VarA;
            }
            jVar3 = jVar2;
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material.a4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return d4.r(aVar, function0, a0Var3, z13, jVar3, w3Var2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 3072;
        z11 = z10;
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
                    w3VarA = w3Var;
                    if (c0VarR.D(w3VarA)) {
                    }
                    i12 |= i19;
                } else {
                    w3VarA = w3Var;
                }
                i12 |= i19;
            } else {
                w3VarA = w3Var;
            }
            if ((74899 & i12) != 74898) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
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
                        jVar4 = null;
                    } else {
                        jVar4 = jVar2;
                    }
                    if ((i11 & 32) != 0) {
                        c0Var2 = c0VarR;
                        i17 = i12 & (-458753);
                        w3VarA = x3.f25473a.a(0L, 0L, 0L, 0L, 0L, c0Var2, androidx.profileinstaller.n.c.f73814m, 31);
                    } else {
                        c0Var2 = c0VarR;
                        i17 = i12;
                    }
                    jVar2 = jVar4;
                } else {
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
                        jVar4 = null;
                    } else {
                        jVar4 = jVar2;
                    }
                    if ((i11 & 32) != 0) {
                        c0Var2 = c0VarR;
                        i17 = i12 & (-458753);
                        w3VarA = x3.f25473a.a(0L, 0L, 0L, 0L, 0L, c0Var2, androidx.profileinstaller.n.c.f73814m, 31);
                    } else {
                        c0Var2 = c0VarR;
                        i17 = i12;
                    }
                    jVar2 = jVar4;
                }
                c0Var2.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(2031255194, i17, -1, "androidx.compose.material.TriStateCheckbox (Checkbox.kt:138)");
                }
                if (function0 != null) {
                    boolean z111 = z14;
                    a0VarG = androidx.compose.foundation.selection.e.g(androidx.compose.ui.a0.E, aVar, jVar2, wd.h(false, f22485d, 0L, 4, null), z111, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.c()), function0);
                    z14 = z111;
                } else {
                    a0VarG = androidx.compose.ui.a0.E;
                }
                if (function0 != null) {
                    a0VarH = l9.h(androidx.compose.ui.a0.E);
                } else {
                    a0VarH = androidx.compose.ui.a0.E;
                }
                w3 w3Var9 = w3VarA;
                i(z14, aVar, androidx.compose.foundation.layout.d5.r(a0Var4.B2(a0VarH).B2(a0VarG), f22486e), w3Var9, c0Var2, ((i17 >> 9) & 14) | ((i17 << 3) & com.planner5d.library.engine.input.f.b.B) | ((i17 >> 6) & 7168));
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                w3Var2 = w3Var9;
                a0Var3 = a0Var4;
                z13 = z14;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var3 = a0Var2;
                z13 = z11;
                w3Var2 = w3VarA;
            }
            jVar3 = jVar2;
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material.a4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return d4.r(aVar, function0, a0Var3, z13, jVar3, w3Var2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 24576;
        jVar2 = jVar;
        if ((196608 & i10) == 0) {
            if ((i11 & 32) == 0) {
                w3VarA = w3Var;
                if (c0VarR.D(w3VarA)) {
                }
                i12 |= i19;
            } else {
                w3VarA = w3Var;
            }
            i12 |= i19;
        } else {
            w3VarA = w3Var;
        }
        if ((74899 & i12) != 74898) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (c0VarR.h(z12, i12 & 1)) {
            c0VarR.l0();
            if ((i10 & 1) != 0) {
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
                    jVar4 = null;
                } else {
                    jVar4 = jVar2;
                }
                if ((i11 & 32) != 0) {
                    c0Var2 = c0VarR;
                    i17 = i12 & (-458753);
                    w3VarA = x3.f25473a.a(0L, 0L, 0L, 0L, 0L, c0Var2, androidx.profileinstaller.n.c.f73814m, 31);
                } else {
                    c0Var2 = c0VarR;
                    i17 = i12;
                }
                jVar2 = jVar4;
            } else {
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
                    jVar4 = null;
                } else {
                    jVar4 = jVar2;
                }
                if ((i11 & 32) != 0) {
                    c0Var2 = c0VarR;
                    i17 = i12 & (-458753);
                    w3VarA = x3.f25473a.a(0L, 0L, 0L, 0L, 0L, c0Var2, androidx.profileinstaller.n.c.f73814m, 31);
                } else {
                    c0Var2 = c0VarR;
                    i17 = i12;
                }
                jVar2 = jVar4;
            }
            c0Var2.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(2031255194, i17, -1, "androidx.compose.material.TriStateCheckbox (Checkbox.kt:138)");
            }
            if (function0 != null) {
                boolean z112 = z14;
                a0VarG = androidx.compose.foundation.selection.e.g(androidx.compose.ui.a0.E, aVar, jVar2, wd.h(false, f22485d, 0L, 4, null), z112, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.c()), function0);
                z14 = z112;
            } else {
                a0VarG = androidx.compose.ui.a0.E;
            }
            if (function0 != null) {
                a0VarH = l9.h(androidx.compose.ui.a0.E);
            } else {
                a0VarH = androidx.compose.ui.a0.E;
            }
            w3 w3Var10 = w3VarA;
            i(z14, aVar, androidx.compose.foundation.layout.d5.r(a0Var4.B2(a0VarH).B2(a0VarG), f22486e), w3Var10, c0Var2, ((i17 >> 9) & 14) | ((i17 << 3) & com.planner5d.library.engine.input.f.b.B) | ((i17 >> 6) & 7168));
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            w3Var2 = w3Var10;
            a0Var3 = a0Var4;
            z13 = z14;
        } else {
            c0Var2 = c0VarR;
            c0Var2.u();
            a0Var3 = a0Var2;
            z13 = z11;
            w3Var2 = w3VarA;
        }
        jVar3 = jVar2;
        s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material.a4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return d4.r(aVar, function0, a0Var3, z13, jVar3, w3Var2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit r(v0.a aVar, Function0 function0, androidx.compose.ui.a0 a0Var, boolean z10, androidx.compose.foundation.interaction.j jVar, w3 w3Var, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        q(aVar, function0, a0Var, z10, jVar, w3Var, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    private static final void s(androidx.compose.ui.graphics.drawscope.f fVar, long j10, long j11, float f10, float f11) {
        float f12 = f11 / 2.0f;
        androidx.compose.ui.graphics.drawscope.n nVar = new androidx.compose.ui.graphics.drawscope.n(f11, 0.0f, 0, 0, null, 30, null);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (fVar.d() >> 32));
        if (androidx.compose.ui.graphics.q0.y(j10, j11)) {
            androidx.compose.ui.graphics.drawscope.f.y8(fVar, j10, 0L, n0.n.f((((long) Float.floatToRawIntBits(fIntBitsToFloat)) & com.rabbitmq.client.k0.f265952a) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32)), n0.a.e((((long) Float.floatToRawIntBits(f10)) << 32) | (((long) Float.floatToRawIntBits(f10)) & com.rabbitmq.client.k0.f265952a)), androidx.compose.ui.graphics.drawscope.m.f37744a, 0.0f, null, 0, 226, null);
            return;
        }
        long jG = n0.g.g((((long) Float.floatToRawIntBits(f11)) << 32) | (((long) Float.floatToRawIntBits(f11)) & com.rabbitmq.client.k0.f265952a));
        float f13 = fIntBitsToFloat - (2 * f11);
        long jF = n0.n.f((((long) Float.floatToRawIntBits(f13)) << 32) | (((long) Float.floatToRawIntBits(f13)) & com.rabbitmq.client.k0.f265952a));
        float fMax = Math.max(0.0f, f10 - f11);
        androidx.compose.ui.graphics.drawscope.f.y8(fVar, j10, jG, jF, n0.a.e((((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(fMax)) & com.rabbitmq.client.k0.f265952a)), androidx.compose.ui.graphics.drawscope.m.f37744a, 0.0f, null, 0, 224, null);
        float f14 = fIntBitsToFloat - f11;
        float f15 = f10 - f12;
        androidx.compose.ui.graphics.drawscope.f.y8(fVar, j11, n0.g.g((((long) Float.floatToRawIntBits(f12)) << 32) | (((long) Float.floatToRawIntBits(f12)) & com.rabbitmq.client.k0.f265952a)), n0.n.f((((long) Float.floatToRawIntBits(f14)) & com.rabbitmq.client.k0.f265952a) | (Float.floatToRawIntBits(f14) << 32)), n0.a.e((((long) Float.floatToRawIntBits(f15)) & com.rabbitmq.client.k0.f265952a) | (Float.floatToRawIntBits(f15) << 32)), nVar, 0.0f, null, 0, 224, null);
    }

    private static final void t(androidx.compose.ui.graphics.drawscope.f fVar, long j10, float f10, float f11, float f12, v3 v3Var) {
        androidx.compose.ui.graphics.drawscope.n nVar = new androidx.compose.ui.graphics.drawscope.n(f12, 0.0f, androidx.compose.ui.graphics.u3.f38256b.c(), 0, null, 26, null);
        float fIntBitsToFloat = Float.intBitsToFloat((int) (fVar.d() >> 32));
        float fR = androidx.compose.ui.util.e.r(0.4f, 0.5f, f11);
        float fR2 = androidx.compose.ui.util.e.r(0.7f, 0.5f, f11);
        float fR3 = androidx.compose.ui.util.e.r(0.5f, 0.5f, f11);
        float fR4 = androidx.compose.ui.util.e.r(0.3f, 0.5f, f11);
        v3Var.a().reset();
        v3Var.a().A(0.2f * fIntBitsToFloat, fR3 * fIntBitsToFloat);
        v3Var.a().F(fR * fIntBitsToFloat, fR2 * fIntBitsToFloat);
        v3Var.a().F(0.8f * fIntBitsToFloat, fIntBitsToFloat * fR4);
        v3Var.b().d(v3Var.a(), false);
        v3Var.c().reset();
        v3Var.b().b(0.0f, v3Var.b().getLength() * f10, v3Var.c(), true);
        androidx.compose.ui.graphics.drawscope.f.K1(fVar, v3Var.c(), j10, 0.0f, nVar, null, 0, 52, null);
    }
}

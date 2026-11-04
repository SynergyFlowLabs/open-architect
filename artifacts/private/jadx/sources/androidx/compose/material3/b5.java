package androidx.compose.material3;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nCheckbox.kt\nKotlin\n*S Kotlin\n*F\n+ 1 Checkbox.kt\nandroidx/compose/material3/CheckboxKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 4 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 5 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 6 Transition.kt\nandroidx/compose/animation/core/TransitionKt\n+ 7 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 8 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 9 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 10 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 11 CornerRadius.kt\nandroidx/compose/ui/geometry/CornerRadiusKt\n+ 12 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 13 Dp.kt\nandroidx/compose/ui/unit/DpKt\n*L\n1#1,739:1\n75#2:740\n75#2:754\n1#3:741\n1282#4,6:742\n1282#4,6:748\n1282#4,6:774\n1282#4,6:780\n60#5:755\n1925#6:756\n1923#6:757\n1832#6,7:758\n1925#6:765\n1923#6:766\n1832#6,7:767\n57#7:786\n57#7:821\n60#8:787\n53#8,3:790\n53#8,3:794\n53#8,3:798\n53#8,3:802\n53#8,3:806\n53#8,3:810\n53#8,3:814\n53#8,3:818\n60#8:822\n22#9:788\n22#9:823\n33#10:789\n33#10:801\n33#10:813\n33#11:793\n33#11:805\n33#11:817\n30#12:797\n30#12:809\n113#13:824\n113#13:825\n113#13:826\n*S KotlinDebug\n*F\n+ 1 Checkbox.kt\nandroidx/compose/material3/CheckboxKt\n*L\n99#1:740\n216#1:754\n104#1:742,6\n167#1:748,6\n440#1:774,6\n444#1:780,6\n285#1:755\n406#1:756\n406#1:757\n406#1:758,7\n424#1:765\n424#1:766\n424#1:767,7\n463#1:786\n496#1:821\n463#1:787\n467#1:790,3\n468#1:794,3\n474#1:798,3\n475#1:802,3\n476#1:806,3\n481#1:810,3\n482#1:814,3\n483#1:818,3\n496#1:822\n463#1:788\n496#1:823\n467#1:789\n475#1:801\n482#1:813\n468#1:793\n476#1:805\n483#1:817\n474#1:797\n481#1:809\n736#1:824\n737#1:825\n738#1:826\n*E\n"})
public final class b5 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f26197a = 100;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f26198b;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f26199c = androidx.compose.ui.unit.h.r(20);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final float f26200d;

    static final class a implements pj.n<androidx.compose.animation.core.l3.b<v0.a>, androidx.compose.runtime.c0, Integer, androidx.compose.animation.core.y0<Float>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.core.y0<Float> f26201a;

        a(androidx.compose.animation.core.y0<Float> y0Var) {
            this.f26201a = y0Var;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final androidx.compose.animation.core.y0<Float> c(androidx.compose.animation.core.l3.b<v0.a> bVar, androidx.compose.runtime.c0 c0Var, int i10) {
            androidx.compose.animation.core.y0<Float> y0VarO;
            c0Var.E(630790831);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(630790831, i10, -1, "androidx.compose.material3.CheckboxImpl.<anonymous> (Checkbox.kt:425)");
            }
            v0.a aVarL = bVar.l();
            v0.a aVar = v0.a.Off;
            if (aVarL == aVar) {
                y0VarO = androidx.compose.animation.core.p.p(0, 1, null);
            } else {
                y0VarO = bVar.j() == aVar ? androidx.compose.animation.core.p.o(100) : this.f26201a;
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
        final /* synthetic */ androidx.compose.animation.core.y0<Float> f26202a;

        b(androidx.compose.animation.core.y0<Float> y0Var) {
            this.f26202a = y0Var;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final androidx.compose.animation.core.y0<Float> c(androidx.compose.animation.core.l3.b<v0.a> bVar, androidx.compose.runtime.c0 c0Var, int i10) {
            c0Var.E(1780794470);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1780794470, i10, -1, "androidx.compose.material3.CheckboxImpl.<anonymous> (Checkbox.kt:407)");
            }
            v0.a aVarL = bVar.l();
            v0.a aVar = v0.a.Off;
            androidx.compose.animation.core.y0<Float> y0VarO = (aVarL != aVar && bVar.j() == aVar) ? androidx.compose.animation.core.p.o(100) : this.f26202a;
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
        public static final /* synthetic */ int[] f26203a;

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
            f26203a = iArr;
        }
    }

    static {
        float f10 = 2;
        f26198b = androidx.compose.ui.unit.h.r(f10);
        f26200d = androidx.compose.ui.unit.h.r(f10);
    }

    /* JADX WARN: Code duplicated, block: B:100:0x014b  */
    /* JADX WARN: Code duplicated, block: B:103:0x0154  */
    /* JADX WARN: Code duplicated, block: B:106:0x015e  */
    /* JADX WARN: Code duplicated, block: B:108:0x0166  */
    /* JADX WARN: Code duplicated, block: B:110:0x0178  */
    /* JADX WARN: Code duplicated, block: B:113:0x01c1  */
    /* JADX WARN: Code duplicated, block: B:115:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:118:0x01dc  */
    /* JADX WARN: Code duplicated, block: B:120:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0061  */
    /* JADX WARN: Code duplicated, block: B:38:0x0066  */
    /* JADX WARN: Code duplicated, block: B:40:0x006a  */
    /* JADX WARN: Code duplicated, block: B:42:0x0072  */
    /* JADX WARN: Code duplicated, block: B:43:0x0075  */
    /* JADX WARN: Code duplicated, block: B:47:0x007c  */
    /* JADX WARN: Code duplicated, block: B:49:0x0080  */
    /* JADX WARN: Code duplicated, block: B:51:0x0088  */
    /* JADX WARN: Code duplicated, block: B:52:0x008b  */
    /* JADX WARN: Code duplicated, block: B:55:0x0091  */
    /* JADX WARN: Code duplicated, block: B:58:0x009b  */
    /* JADX WARN: Code duplicated, block: B:60:0x009f  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:64:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:65:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:73:0x00ca  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e5 A[PHI: r4 r9 r11 r12
      0x00e5: PHI (r4v26 int) = (r4v20 int), (r4v17 int), (r4v27 int) binds: [B:90:0x0106, B:79:0x00e1, B:80:0x00e3] A[DONT_GENERATE, DONT_INLINE]
      0x00e5: PHI (r9v21 androidx.compose.ui.a0) = (r9v4 androidx.compose.ui.a0), (r9v2 androidx.compose.ui.a0), (r9v2 androidx.compose.ui.a0) binds: [B:90:0x0106, B:79:0x00e1, B:80:0x00e3] A[DONT_GENERATE, DONT_INLINE]
      0x00e5: PHI (r11v7 boolean) = (r11v3 boolean), (r11v2 boolean), (r11v2 boolean) binds: [B:90:0x0106, B:79:0x00e1, B:80:0x00e3] A[DONT_GENERATE, DONT_INLINE]
      0x00e5: PHI (r12v12 androidx.compose.material3.r4) = (r12v8 androidx.compose.material3.r4), (r12v7 androidx.compose.material3.r4), (r12v7 androidx.compose.material3.r4) binds: [B:90:0x0106, B:79:0x00e1, B:80:0x00e3] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:83:0x00ed A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:86:0x00f5  */
    /* JADX WARN: Code duplicated, block: B:89:0x00fd  */
    /* JADX WARN: Code duplicated, block: B:91:0x0108  */
    /* JADX WARN: Code duplicated, block: B:94:0x0118  */
    /* JADX WARN: Code duplicated, block: B:97:0x013e  */
    /* JADX WARN: Code duplicated, block: B:99:0x0148  */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void i(final boolean z10, @Nullable final Function1<? super Boolean, Unit> function1, @Nullable androidx.compose.ui.a0 a0Var, boolean z11, @Nullable r4 r4Var, @Nullable androidx.compose.foundation.interaction.j jVar, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        androidx.compose.ui.a0 a0Var2;
        int i13;
        boolean z12;
        int i14;
        r4 r4VarA;
        int i15;
        androidx.compose.foundation.interaction.j jVar2;
        int i16;
        boolean z13;
        androidx.compose.runtime.c0 c0Var2;
        final androidx.compose.ui.a0 a0Var3;
        final boolean z14;
        final r4 r4Var2;
        final androidx.compose.foundation.interaction.j jVar3;
        androidx.compose.runtime.s5 s5VarT;
        boolean z15;
        r4 r4Var3;
        androidx.compose.foundation.interaction.j jVar4;
        Function0 function0;
        boolean z16;
        boolean z17;
        Object objI0;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1406741137);
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
                if ((i10 & 24576) == 0) {
                    if ((i11 & 16) == 0) {
                        r4VarA = r4Var;
                        int i18 = c0VarR.D(r4VarA) ? 16384 : 8192;
                        i12 |= i18;
                    } else {
                        r4VarA = r4Var;
                    }
                    i12 |= i18;
                } else {
                    r4VarA = r4Var;
                }
                i15 = i11 & 32;
                if (i15 != 0) {
                    if ((196608 & i10) == 0) {
                        jVar2 = jVar;
                        if (c0VarR.D(jVar2)) {
                            i16 = 131072;
                        } else {
                            i16 = 65536;
                        }
                        i12 |= i16;
                    }
                    if ((74899 & i12) != 74898) {
                        z13 = true;
                    } else {
                        z13 = false;
                    }
                    if (c0VarR.h(z13, i12 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0 || c0VarR.y()) {
                            if (i17 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if (i13 != 0) {
                                z12 = true;
                            }
                            if ((i11 & 16) != 0) {
                                i12 &= -57345;
                                r4VarA = s4.f32691a.a(c0VarR, 6);
                            }
                            if (i15 != 0) {
                                z15 = z12;
                                r4Var3 = r4VarA;
                                jVar4 = null;
                            }
                            androidx.compose.ui.a0 a0Var4 = a0Var2;
                            c0VarR.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(-1406741137, i12, -1, "androidx.compose.material3.Checkbox (Checkbox.kt:97)");
                            }
                            float fFloor = (float) Math.floor(((androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m())).S7(s4.f32691a.d()));
                            v0.a aVarA = v0.b.a(z10);
                            if (function1 != null) {
                                c0VarR.E(2066152950);
                                if ((i12 & com.planner5d.library.engine.input.f.b.B) == 32) {
                                    z16 = true;
                                } else {
                                    z16 = false;
                                }
                                z17 = z16 | ((i12 & 14) == 4);
                                objI0 = c0VarR.i0();
                                if (z17 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                    objI0 = new Function0() { // from class: androidx.compose.material3.z4
                                        @Override // kotlin.jvm.functions.Function0
                                        public final Object invoke() {
                                            return b5.k(function1, z10);
                                        }
                                    };
                                    c0VarR.Y(objI0);
                                }
                                c0VarR.A();
                                function0 = (Function0) objI0;
                            } else {
                                c0VarR.E(2066218639);
                                c0VarR.A();
                                function0 = null;
                            }
                            c0Var2 = c0VarR;
                            s(aVarA, function0, new androidx.compose.ui.graphics.drawscope.n(fFloor, 0.0f, androidx.compose.ui.graphics.u3.f38256b.c(), 0, null, 26, null), new androidx.compose.ui.graphics.drawscope.n(fFloor, 0.0f, 0, 0, null, 30, null), a0Var4, z15, r4Var3, jVar4, c0Var2, (i12 << 6) & 33546240, 0);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            a0Var3 = a0Var4;
                            z14 = z15;
                            r4Var2 = r4Var3;
                            jVar3 = jVar4;
                        } else {
                            c0VarR.u();
                            if ((i11 & 16) != 0) {
                                i12 &= -57345;
                            }
                        }
                        z15 = z12;
                        jVar4 = jVar2;
                        r4Var3 = r4VarA;
                        androidx.compose.ui.a0 a0Var5 = a0Var2;
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-1406741137, i12, -1, "androidx.compose.material3.Checkbox (Checkbox.kt:97)");
                        }
                        float fFloor2 = (float) Math.floor(((androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m())).S7(s4.f32691a.d()));
                        v0.a aVarA2 = v0.b.a(z10);
                        if (function1 != null) {
                            c0VarR.E(2066152950);
                            if ((i12 & com.planner5d.library.engine.input.f.b.B) == 32) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            z17 = z16 | ((i12 & 14) == 4);
                            objI0 = c0VarR.i0();
                            if (z17) {
                                objI0 = new Function0() { // from class: androidx.compose.material3.z4
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return b5.k(function1, z10);
                                    }
                                };
                                c0VarR.Y(objI0);
                            } else {
                                objI0 = new Function0() { // from class: androidx.compose.material3.z4
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return b5.k(function1, z10);
                                    }
                                };
                                c0VarR.Y(objI0);
                            }
                            c0VarR.A();
                            function0 = (Function0) objI0;
                        } else {
                            c0VarR.E(2066218639);
                            c0VarR.A();
                            function0 = null;
                        }
                        c0Var2 = c0VarR;
                        s(aVarA2, function0, new androidx.compose.ui.graphics.drawscope.n(fFloor2, 0.0f, androidx.compose.ui.graphics.u3.f38256b.c(), 0, null, 26, null), new androidx.compose.ui.graphics.drawscope.n(fFloor2, 0.0f, 0, 0, null, 30, null), a0Var5, z15, r4Var3, jVar4, c0Var2, (i12 << 6) & 33546240, 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var5;
                        z14 = z15;
                        r4Var2 = r4Var3;
                        jVar3 = jVar4;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        a0Var3 = a0Var2;
                        z14 = z12;
                        r4Var2 = r4VarA;
                        jVar3 = jVar2;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.a5
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return b5.l(z10, function1, a0Var3, z14, r4Var2, jVar3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= androidx.profileinstaller.n.c.f73814m;
                jVar2 = jVar;
                if ((74899 & i12) != 74898) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (c0VarR.h(z13, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i17 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                            r4VarA = s4.f32691a.a(c0VarR, 6);
                        }
                        if (i15 != 0) {
                            z15 = z12;
                            r4Var3 = r4VarA;
                            jVar4 = null;
                        } else {
                            z15 = z12;
                            jVar4 = jVar2;
                            r4Var3 = r4VarA;
                        }
                    } else {
                        if (i17 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                            r4VarA = s4.f32691a.a(c0VarR, 6);
                        }
                        if (i15 != 0) {
                            z15 = z12;
                            r4Var3 = r4VarA;
                            jVar4 = null;
                        } else {
                            z15 = z12;
                            jVar4 = jVar2;
                            r4Var3 = r4VarA;
                        }
                    }
                    androidx.compose.ui.a0 a0Var6 = a0Var2;
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1406741137, i12, -1, "androidx.compose.material3.Checkbox (Checkbox.kt:97)");
                    }
                    float fFloor3 = (float) Math.floor(((androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m())).S7(s4.f32691a.d()));
                    v0.a aVarA3 = v0.b.a(z10);
                    if (function1 != null) {
                        c0VarR.E(2066152950);
                        if ((i12 & com.planner5d.library.engine.input.f.b.B) == 32) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        z17 = z16 | ((i12 & 14) == 4);
                        objI0 = c0VarR.i0();
                        if (z17) {
                            objI0 = new Function0() { // from class: androidx.compose.material3.z4
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return b5.k(function1, z10);
                                }
                            };
                            c0VarR.Y(objI0);
                        } else {
                            objI0 = new Function0() { // from class: androidx.compose.material3.z4
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return b5.k(function1, z10);
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        c0VarR.A();
                        function0 = (Function0) objI0;
                    } else {
                        c0VarR.E(2066218639);
                        c0VarR.A();
                        function0 = null;
                    }
                    c0Var2 = c0VarR;
                    s(aVarA3, function0, new androidx.compose.ui.graphics.drawscope.n(fFloor3, 0.0f, androidx.compose.ui.graphics.u3.f38256b.c(), 0, null, 26, null), new androidx.compose.ui.graphics.drawscope.n(fFloor3, 0.0f, 0, 0, null, 30, null), a0Var6, z15, r4Var3, jVar4, c0Var2, (i12 << 6) & 33546240, 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var6;
                    z14 = z15;
                    r4Var2 = r4Var3;
                    jVar3 = jVar4;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var3 = a0Var2;
                    z14 = z12;
                    r4Var2 = r4VarA;
                    jVar3 = jVar2;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.a5
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return b5.l(z10, function1, a0Var3, z14, r4Var2, jVar3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 3072;
            z12 = z11;
            if ((i10 & 24576) == 0) {
                if ((i11 & 16) == 0) {
                    r4VarA = r4Var;
                    if (c0VarR.D(r4VarA)) {
                    }
                    i12 |= i18;
                } else {
                    r4VarA = r4Var;
                }
                i12 |= i18;
            } else {
                r4VarA = r4Var;
            }
            i15 = i11 & 32;
            if (i15 != 0) {
                if ((196608 & i10) == 0) {
                    jVar2 = jVar;
                    if (c0VarR.D(jVar2)) {
                        i16 = 131072;
                    } else {
                        i16 = 65536;
                    }
                    i12 |= i16;
                }
                if ((74899 & i12) != 74898) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (c0VarR.h(z13, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i17 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                            r4VarA = s4.f32691a.a(c0VarR, 6);
                        }
                        if (i15 != 0) {
                            z15 = z12;
                            r4Var3 = r4VarA;
                            jVar4 = null;
                        } else {
                            z15 = z12;
                            jVar4 = jVar2;
                            r4Var3 = r4VarA;
                        }
                    } else {
                        if (i17 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                            r4VarA = s4.f32691a.a(c0VarR, 6);
                        }
                        if (i15 != 0) {
                            z15 = z12;
                            r4Var3 = r4VarA;
                            jVar4 = null;
                        } else {
                            z15 = z12;
                            jVar4 = jVar2;
                            r4Var3 = r4VarA;
                        }
                    }
                    androidx.compose.ui.a0 a0Var7 = a0Var2;
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1406741137, i12, -1, "androidx.compose.material3.Checkbox (Checkbox.kt:97)");
                    }
                    float fFloor4 = (float) Math.floor(((androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m())).S7(s4.f32691a.d()));
                    v0.a aVarA4 = v0.b.a(z10);
                    if (function1 != null) {
                        c0VarR.E(2066152950);
                        if ((i12 & com.planner5d.library.engine.input.f.b.B) == 32) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        z17 = z16 | ((i12 & 14) == 4);
                        objI0 = c0VarR.i0();
                        if (z17) {
                            objI0 = new Function0() { // from class: androidx.compose.material3.z4
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return b5.k(function1, z10);
                                }
                            };
                            c0VarR.Y(objI0);
                        } else {
                            objI0 = new Function0() { // from class: androidx.compose.material3.z4
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return b5.k(function1, z10);
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        c0VarR.A();
                        function0 = (Function0) objI0;
                    } else {
                        c0VarR.E(2066218639);
                        c0VarR.A();
                        function0 = null;
                    }
                    c0Var2 = c0VarR;
                    s(aVarA4, function0, new androidx.compose.ui.graphics.drawscope.n(fFloor4, 0.0f, androidx.compose.ui.graphics.u3.f38256b.c(), 0, null, 26, null), new androidx.compose.ui.graphics.drawscope.n(fFloor4, 0.0f, 0, 0, null, 30, null), a0Var7, z15, r4Var3, jVar4, c0Var2, (i12 << 6) & 33546240, 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var7;
                    z14 = z15;
                    r4Var2 = r4Var3;
                    jVar3 = jVar4;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var3 = a0Var2;
                    z14 = z12;
                    r4Var2 = r4VarA;
                    jVar3 = jVar2;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.a5
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return b5.l(z10, function1, a0Var3, z14, r4Var2, jVar3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= androidx.profileinstaller.n.c.f73814m;
            jVar2 = jVar;
            if ((74899 & i12) != 74898) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c0VarR.h(z13, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i17 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        r4VarA = s4.f32691a.a(c0VarR, 6);
                    }
                    if (i15 != 0) {
                        z15 = z12;
                        r4Var3 = r4VarA;
                        jVar4 = null;
                    } else {
                        z15 = z12;
                        jVar4 = jVar2;
                        r4Var3 = r4VarA;
                    }
                } else {
                    if (i17 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        r4VarA = s4.f32691a.a(c0VarR, 6);
                    }
                    if (i15 != 0) {
                        z15 = z12;
                        r4Var3 = r4VarA;
                        jVar4 = null;
                    } else {
                        z15 = z12;
                        jVar4 = jVar2;
                        r4Var3 = r4VarA;
                    }
                }
                androidx.compose.ui.a0 a0Var8 = a0Var2;
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1406741137, i12, -1, "androidx.compose.material3.Checkbox (Checkbox.kt:97)");
                }
                float fFloor5 = (float) Math.floor(((androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m())).S7(s4.f32691a.d()));
                v0.a aVarA5 = v0.b.a(z10);
                if (function1 != null) {
                    c0VarR.E(2066152950);
                    if ((i12 & com.planner5d.library.engine.input.f.b.B) == 32) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    z17 = z16 | ((i12 & 14) == 4);
                    objI0 = c0VarR.i0();
                    if (z17) {
                        objI0 = new Function0() { // from class: androidx.compose.material3.z4
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return b5.k(function1, z10);
                            }
                        };
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = new Function0() { // from class: androidx.compose.material3.z4
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return b5.k(function1, z10);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    c0VarR.A();
                    function0 = (Function0) objI0;
                } else {
                    c0VarR.E(2066218639);
                    c0VarR.A();
                    function0 = null;
                }
                c0Var2 = c0VarR;
                s(aVarA5, function0, new androidx.compose.ui.graphics.drawscope.n(fFloor5, 0.0f, androidx.compose.ui.graphics.u3.f38256b.c(), 0, null, 26, null), new androidx.compose.ui.graphics.drawscope.n(fFloor5, 0.0f, 0, 0, null, 30, null), a0Var8, z15, r4Var3, jVar4, c0Var2, (i12 << 6) & 33546240, 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var8;
                z14 = z15;
                r4Var2 = r4Var3;
                jVar3 = jVar4;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var3 = a0Var2;
                z14 = z12;
                r4Var2 = r4VarA;
                jVar3 = jVar2;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.a5
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return b5.l(z10, function1, a0Var3, z14, r4Var2, jVar3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
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
            if ((i10 & 24576) == 0) {
                if ((i11 & 16) == 0) {
                    r4VarA = r4Var;
                    if (c0VarR.D(r4VarA)) {
                    }
                    i12 |= i18;
                } else {
                    r4VarA = r4Var;
                }
                i12 |= i18;
            } else {
                r4VarA = r4Var;
            }
            i15 = i11 & 32;
            if (i15 != 0) {
                if ((196608 & i10) == 0) {
                    jVar2 = jVar;
                    if (c0VarR.D(jVar2)) {
                        i16 = 131072;
                    } else {
                        i16 = 65536;
                    }
                    i12 |= i16;
                }
                if ((74899 & i12) != 74898) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (c0VarR.h(z13, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i17 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                            r4VarA = s4.f32691a.a(c0VarR, 6);
                        }
                        if (i15 != 0) {
                            z15 = z12;
                            r4Var3 = r4VarA;
                            jVar4 = null;
                        } else {
                            z15 = z12;
                            jVar4 = jVar2;
                            r4Var3 = r4VarA;
                        }
                    } else {
                        if (i17 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                            r4VarA = s4.f32691a.a(c0VarR, 6);
                        }
                        if (i15 != 0) {
                            z15 = z12;
                            r4Var3 = r4VarA;
                            jVar4 = null;
                        } else {
                            z15 = z12;
                            jVar4 = jVar2;
                            r4Var3 = r4VarA;
                        }
                    }
                    androidx.compose.ui.a0 a0Var9 = a0Var2;
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1406741137, i12, -1, "androidx.compose.material3.Checkbox (Checkbox.kt:97)");
                    }
                    float fFloor6 = (float) Math.floor(((androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m())).S7(s4.f32691a.d()));
                    v0.a aVarA6 = v0.b.a(z10);
                    if (function1 != null) {
                        c0VarR.E(2066152950);
                        if ((i12 & com.planner5d.library.engine.input.f.b.B) == 32) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        z17 = z16 | ((i12 & 14) == 4);
                        objI0 = c0VarR.i0();
                        if (z17) {
                            objI0 = new Function0() { // from class: androidx.compose.material3.z4
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return b5.k(function1, z10);
                                }
                            };
                            c0VarR.Y(objI0);
                        } else {
                            objI0 = new Function0() { // from class: androidx.compose.material3.z4
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return b5.k(function1, z10);
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        c0VarR.A();
                        function0 = (Function0) objI0;
                    } else {
                        c0VarR.E(2066218639);
                        c0VarR.A();
                        function0 = null;
                    }
                    c0Var2 = c0VarR;
                    s(aVarA6, function0, new androidx.compose.ui.graphics.drawscope.n(fFloor6, 0.0f, androidx.compose.ui.graphics.u3.f38256b.c(), 0, null, 26, null), new androidx.compose.ui.graphics.drawscope.n(fFloor6, 0.0f, 0, 0, null, 30, null), a0Var9, z15, r4Var3, jVar4, c0Var2, (i12 << 6) & 33546240, 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var9;
                    z14 = z15;
                    r4Var2 = r4Var3;
                    jVar3 = jVar4;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var3 = a0Var2;
                    z14 = z12;
                    r4Var2 = r4VarA;
                    jVar3 = jVar2;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.a5
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return b5.l(z10, function1, a0Var3, z14, r4Var2, jVar3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= androidx.profileinstaller.n.c.f73814m;
            jVar2 = jVar;
            if ((74899 & i12) != 74898) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c0VarR.h(z13, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i17 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        r4VarA = s4.f32691a.a(c0VarR, 6);
                    }
                    if (i15 != 0) {
                        z15 = z12;
                        r4Var3 = r4VarA;
                        jVar4 = null;
                    } else {
                        z15 = z12;
                        jVar4 = jVar2;
                        r4Var3 = r4VarA;
                    }
                } else {
                    if (i17 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        r4VarA = s4.f32691a.a(c0VarR, 6);
                    }
                    if (i15 != 0) {
                        z15 = z12;
                        r4Var3 = r4VarA;
                        jVar4 = null;
                    } else {
                        z15 = z12;
                        jVar4 = jVar2;
                        r4Var3 = r4VarA;
                    }
                }
                androidx.compose.ui.a0 a0Var10 = a0Var2;
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1406741137, i12, -1, "androidx.compose.material3.Checkbox (Checkbox.kt:97)");
                }
                float fFloor7 = (float) Math.floor(((androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m())).S7(s4.f32691a.d()));
                v0.a aVarA7 = v0.b.a(z10);
                if (function1 != null) {
                    c0VarR.E(2066152950);
                    if ((i12 & com.planner5d.library.engine.input.f.b.B) == 32) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    z17 = z16 | ((i12 & 14) == 4);
                    objI0 = c0VarR.i0();
                    if (z17) {
                        objI0 = new Function0() { // from class: androidx.compose.material3.z4
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return b5.k(function1, z10);
                            }
                        };
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = new Function0() { // from class: androidx.compose.material3.z4
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return b5.k(function1, z10);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    c0VarR.A();
                    function0 = (Function0) objI0;
                } else {
                    c0VarR.E(2066218639);
                    c0VarR.A();
                    function0 = null;
                }
                c0Var2 = c0VarR;
                s(aVarA7, function0, new androidx.compose.ui.graphics.drawscope.n(fFloor7, 0.0f, androidx.compose.ui.graphics.u3.f38256b.c(), 0, null, 26, null), new androidx.compose.ui.graphics.drawscope.n(fFloor7, 0.0f, 0, 0, null, 30, null), a0Var10, z15, r4Var3, jVar4, c0Var2, (i12 << 6) & 33546240, 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var10;
                z14 = z15;
                r4Var2 = r4Var3;
                jVar3 = jVar4;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var3 = a0Var2;
                z14 = z12;
                r4Var2 = r4VarA;
                jVar3 = jVar2;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.a5
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return b5.l(z10, function1, a0Var3, z14, r4Var2, jVar3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 3072;
        z12 = z11;
        if ((i10 & 24576) == 0) {
            if ((i11 & 16) == 0) {
                r4VarA = r4Var;
                if (c0VarR.D(r4VarA)) {
                }
                i12 |= i18;
            } else {
                r4VarA = r4Var;
            }
            i12 |= i18;
        } else {
            r4VarA = r4Var;
        }
        i15 = i11 & 32;
        if (i15 != 0) {
            if ((196608 & i10) == 0) {
                jVar2 = jVar;
                if (c0VarR.D(jVar2)) {
                    i16 = 131072;
                } else {
                    i16 = 65536;
                }
                i12 |= i16;
            }
            if ((74899 & i12) != 74898) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c0VarR.h(z13, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i17 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        r4VarA = s4.f32691a.a(c0VarR, 6);
                    }
                    if (i15 != 0) {
                        z15 = z12;
                        r4Var3 = r4VarA;
                        jVar4 = null;
                    } else {
                        z15 = z12;
                        jVar4 = jVar2;
                        r4Var3 = r4VarA;
                    }
                } else {
                    if (i17 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        r4VarA = s4.f32691a.a(c0VarR, 6);
                    }
                    if (i15 != 0) {
                        z15 = z12;
                        r4Var3 = r4VarA;
                        jVar4 = null;
                    } else {
                        z15 = z12;
                        jVar4 = jVar2;
                        r4Var3 = r4VarA;
                    }
                }
                androidx.compose.ui.a0 a0Var11 = a0Var2;
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1406741137, i12, -1, "androidx.compose.material3.Checkbox (Checkbox.kt:97)");
                }
                float fFloor8 = (float) Math.floor(((androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m())).S7(s4.f32691a.d()));
                v0.a aVarA8 = v0.b.a(z10);
                if (function1 != null) {
                    c0VarR.E(2066152950);
                    if ((i12 & com.planner5d.library.engine.input.f.b.B) == 32) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    z17 = z16 | ((i12 & 14) == 4);
                    objI0 = c0VarR.i0();
                    if (z17) {
                        objI0 = new Function0() { // from class: androidx.compose.material3.z4
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return b5.k(function1, z10);
                            }
                        };
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = new Function0() { // from class: androidx.compose.material3.z4
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return b5.k(function1, z10);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    c0VarR.A();
                    function0 = (Function0) objI0;
                } else {
                    c0VarR.E(2066218639);
                    c0VarR.A();
                    function0 = null;
                }
                c0Var2 = c0VarR;
                s(aVarA8, function0, new androidx.compose.ui.graphics.drawscope.n(fFloor8, 0.0f, androidx.compose.ui.graphics.u3.f38256b.c(), 0, null, 26, null), new androidx.compose.ui.graphics.drawscope.n(fFloor8, 0.0f, 0, 0, null, 30, null), a0Var11, z15, r4Var3, jVar4, c0Var2, (i12 << 6) & 33546240, 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var11;
                z14 = z15;
                r4Var2 = r4Var3;
                jVar3 = jVar4;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var3 = a0Var2;
                z14 = z12;
                r4Var2 = r4VarA;
                jVar3 = jVar2;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.a5
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return b5.l(z10, function1, a0Var3, z14, r4Var2, jVar3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= androidx.profileinstaller.n.c.f73814m;
        jVar2 = jVar;
        if ((74899 & i12) != 74898) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (c0VarR.h(z13, i12 & 1)) {
            c0VarR.l0();
            if ((i10 & 1) != 0) {
                if (i17 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                }
                if (i13 != 0) {
                    z12 = true;
                }
                if ((i11 & 16) != 0) {
                    i12 &= -57345;
                    r4VarA = s4.f32691a.a(c0VarR, 6);
                }
                if (i15 != 0) {
                    z15 = z12;
                    r4Var3 = r4VarA;
                    jVar4 = null;
                } else {
                    z15 = z12;
                    jVar4 = jVar2;
                    r4Var3 = r4VarA;
                }
            } else {
                if (i17 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                }
                if (i13 != 0) {
                    z12 = true;
                }
                if ((i11 & 16) != 0) {
                    i12 &= -57345;
                    r4VarA = s4.f32691a.a(c0VarR, 6);
                }
                if (i15 != 0) {
                    z15 = z12;
                    r4Var3 = r4VarA;
                    jVar4 = null;
                } else {
                    z15 = z12;
                    jVar4 = jVar2;
                    r4Var3 = r4VarA;
                }
            }
            androidx.compose.ui.a0 a0Var12 = a0Var2;
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1406741137, i12, -1, "androidx.compose.material3.Checkbox (Checkbox.kt:97)");
            }
            float fFloor9 = (float) Math.floor(((androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m())).S7(s4.f32691a.d()));
            v0.a aVarA9 = v0.b.a(z10);
            if (function1 != null) {
                c0VarR.E(2066152950);
                if ((i12 & com.planner5d.library.engine.input.f.b.B) == 32) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                z17 = z16 | ((i12 & 14) == 4);
                objI0 = c0VarR.i0();
                if (z17) {
                    objI0 = new Function0() { // from class: androidx.compose.material3.z4
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return b5.k(function1, z10);
                        }
                    };
                    c0VarR.Y(objI0);
                } else {
                    objI0 = new Function0() { // from class: androidx.compose.material3.z4
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return b5.k(function1, z10);
                        }
                    };
                    c0VarR.Y(objI0);
                }
                c0VarR.A();
                function0 = (Function0) objI0;
            } else {
                c0VarR.E(2066218639);
                c0VarR.A();
                function0 = null;
            }
            c0Var2 = c0VarR;
            s(aVarA9, function0, new androidx.compose.ui.graphics.drawscope.n(fFloor9, 0.0f, androidx.compose.ui.graphics.u3.f38256b.c(), 0, null, 26, null), new androidx.compose.ui.graphics.drawscope.n(fFloor9, 0.0f, 0, 0, null, 30, null), a0Var12, z15, r4Var3, jVar4, c0Var2, (i12 << 6) & 33546240, 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            a0Var3 = a0Var12;
            z14 = z15;
            r4Var2 = r4Var3;
            jVar3 = jVar4;
        } else {
            c0Var2 = c0VarR;
            c0Var2.u();
            a0Var3 = a0Var2;
            z14 = z12;
            r4Var2 = r4VarA;
            jVar3 = jVar2;
        }
        s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.a5
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return b5.l(z10, function1, a0Var3, z14, r4Var2, jVar3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:100:0x0129 A[PHI: r6 r8 r12 r15
      0x0129: PHI (r6v28 int) = (r6v22 int), (r6v31 int) binds: [B:112:0x0160, B:99:0x0125] A[DONT_GENERATE, DONT_INLINE]
      0x0129: PHI (r8v11 androidx.compose.ui.a0) = (r8v5 androidx.compose.ui.a0), (r8v2 androidx.compose.ui.a0) binds: [B:112:0x0160, B:99:0x0125] A[DONT_GENERATE, DONT_INLINE]
      0x0129: PHI (r12v8 boolean) = (r12v4 boolean), (r12v3 boolean) binds: [B:112:0x0160, B:99:0x0125] A[DONT_GENERATE, DONT_INLINE]
      0x0129: PHI (r15v13 androidx.compose.material3.r4) = (r15v9 androidx.compose.material3.r4), (r15v8 androidx.compose.material3.r4) binds: [B:112:0x0160, B:99:0x0125] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:104:0x0146 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:105:0x0148  */
    /* JADX WARN: Code duplicated, block: B:107:0x014d  */
    /* JADX WARN: Code duplicated, block: B:110:0x0153  */
    /* JADX WARN: Code duplicated, block: B:111:0x015e  */
    /* JADX WARN: Code duplicated, block: B:113:0x0162  */
    /* JADX WARN: Code duplicated, block: B:116:0x016e  */
    /* JADX WARN: Code duplicated, block: B:119:0x017a  */
    /* JADX WARN: Code duplicated, block: B:121:0x0184  */
    /* JADX WARN: Code duplicated, block: B:122:0x0189  */
    /* JADX WARN: Code duplicated, block: B:125:0x0192  */
    /* JADX WARN: Code duplicated, block: B:128:0x019e  */
    /* JADX WARN: Code duplicated, block: B:130:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:133:0x01b5  */
    /* JADX WARN: Code duplicated, block: B:136:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:138:0x01df  */
    /* JADX WARN: Code duplicated, block: B:141:0x01ee  */
    /* JADX WARN: Code duplicated, block: B:143:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x0099  */
    /* JADX WARN: Code duplicated, block: B:58:0x009f  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:62:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:67:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b9  */
    /* JADX WARN: Code duplicated, block: B:71:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:72:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:75:0x00cd  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d7  */
    /* JADX WARN: Code duplicated, block: B:79:0x00dc  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:83:0x00e8  */
    /* JADX WARN: Code duplicated, block: B:84:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:88:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:89:0x0102  */
    /* JADX WARN: Code duplicated, block: B:92:0x010c  */
    /* JADX WARN: Code duplicated, block: B:94:0x0117  */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void j(final boolean z10, @Nullable final Function1<? super Boolean, Unit> function1, @NotNull final androidx.compose.ui.graphics.drawscope.n nVar, @NotNull final androidx.compose.ui.graphics.drawscope.n nVar2, @Nullable androidx.compose.ui.a0 a0Var, boolean z11, @Nullable r4 r4Var, @Nullable androidx.compose.foundation.interaction.j jVar, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        androidx.compose.ui.graphics.drawscope.n nVar3;
        androidx.compose.ui.graphics.drawscope.n nVar4;
        androidx.compose.ui.a0 a0Var2;
        int i13;
        boolean z12;
        int i14;
        r4 r4VarA;
        int i15;
        androidx.compose.foundation.interaction.j jVar2;
        int i16;
        int i17;
        boolean z13;
        androidx.compose.runtime.c0 c0Var2;
        final androidx.compose.ui.a0 a0Var3;
        final boolean z14;
        final androidx.compose.foundation.interaction.j jVar3;
        final r4 r4Var2;
        androidx.compose.runtime.s5 s5VarT;
        Function0 function0;
        int i18;
        androidx.compose.foundation.interaction.j jVar4;
        r4 r4Var3;
        boolean z15;
        int i19;
        int i20;
        boolean z16;
        boolean z17;
        Object objI0;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(534932591);
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
        if ((i11 & 4) != 0) {
            i12 |= androidx.media3.exoplayer.a5.S0;
            nVar3 = nVar;
        } else {
            nVar3 = nVar;
            if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                i12 |= c0VarR.k0(nVar3) ? 256 : 128;
            }
        }
        if ((i11 & 8) != 0) {
            i12 |= 3072;
            nVar4 = nVar2;
        } else {
            nVar4 = nVar2;
            if ((i10 & 3072) == 0) {
                i12 |= c0VarR.k0(nVar4) ? 2048 : 1024;
            }
        }
        int i21 = i11 & 16;
        if (i21 == 0) {
            if ((i10 & 24576) == 0) {
                a0Var2 = a0Var;
                i12 |= c0VarR.D(a0Var2) ? 16384 : 8192;
            }
            i13 = i11 & 32;
            if (i13 != 0) {
                if ((196608 & i10) == 0) {
                    z12 = z11;
                    if (c0VarR.G(z12)) {
                        i14 = 131072;
                    } else {
                        i14 = 65536;
                    }
                    i12 |= i14;
                }
                if ((1572864 & i10) == 0) {
                    if ((i11 & 64) == 0) {
                        r4VarA = r4Var;
                        int i22 = c0VarR.D(r4VarA) ? 1048576 : 524288;
                        i12 |= i22;
                    } else {
                        r4VarA = r4Var;
                    }
                    i12 |= i22;
                } else {
                    r4VarA = r4Var;
                }
                i15 = i11 & 128;
                if (i15 != 0) {
                    i12 |= 12582912;
                    jVar2 = jVar;
                } else {
                    jVar2 = jVar;
                    if ((i10 & 12582912) == 0) {
                        if (c0VarR.D(jVar2)) {
                            i16 = 8388608;
                        } else {
                            i16 = 4194304;
                        }
                        i12 |= i16;
                    }
                }
                i17 = i12;
                if ((i12 & 4793491) != 4793490) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (c0VarR.h(z13, i17 & 1)) {
                    c0VarR.l0();
                    function0 = null;
                    if ((i10 & 1) != 0 || c0VarR.y()) {
                        if (i21 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if (i13 != 0) {
                            z12 = true;
                        }
                        if ((i11 & 64) != 0) {
                            i18 = i17 & (-3670017);
                            r4VarA = s4.f32691a.a(c0VarR, 6);
                        } else {
                            i18 = i17;
                        }
                        if (i15 != 0) {
                            jVar4 = null;
                        }
                        z15 = z12;
                        r4Var3 = r4VarA;
                        i20 = 32;
                        i19 = 534932591;
                        androidx.compose.ui.a0 a0Var4 = a0Var2;
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(i19, i18, -1, "androidx.compose.material3.Checkbox (Checkbox.kt:161)");
                        }
                        v0.a aVarA = v0.b.a(z10);
                        if (function1 != null) {
                            c0VarR.E(1848599606);
                            if ((i18 & com.planner5d.library.engine.input.f.b.B) == i20) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            z17 = z16 | ((i18 & 14) == 4);
                            objI0 = c0VarR.i0();
                            if (z17 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                objI0 = new Function0() { // from class: androidx.compose.material3.w4
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return b5.m(function1, z10);
                                    }
                                };
                                c0VarR.Y(objI0);
                            }
                            function0 = (Function0) objI0;
                            c0VarR.A();
                        } else {
                            c0VarR.E(1848665295);
                            c0VarR.A();
                        }
                        c0Var2 = c0VarR;
                        s(aVarA, function0, nVar3, nVar4, a0Var4, z15, r4Var3, jVar4, c0Var2, i18 & 33554304, 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var4;
                        z14 = z15;
                        r4Var2 = r4Var3;
                        jVar3 = jVar4;
                    } else {
                        c0VarR.u();
                        if ((i11 & 64) != 0) {
                            i18 = i17 & (-3670017);
                        } else {
                            jVar4 = jVar2;
                            z15 = z12;
                            i18 = i17;
                            i20 = 32;
                            i19 = 534932591;
                            r4Var3 = r4VarA;
                        }
                        androidx.compose.ui.a0 a0Var5 = a0Var2;
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(i19, i18, -1, "androidx.compose.material3.Checkbox (Checkbox.kt:161)");
                        }
                        v0.a aVarA2 = v0.b.a(z10);
                        if (function1 != null) {
                            c0VarR.E(1848599606);
                            if ((i18 & com.planner5d.library.engine.input.f.b.B) == i20) {
                                z16 = true;
                            } else {
                                z16 = false;
                            }
                            z17 = z16 | ((i18 & 14) == 4);
                            objI0 = c0VarR.i0();
                            if (z17) {
                                objI0 = new Function0() { // from class: androidx.compose.material3.w4
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return b5.m(function1, z10);
                                    }
                                };
                                c0VarR.Y(objI0);
                            } else {
                                objI0 = new Function0() { // from class: androidx.compose.material3.w4
                                    @Override // kotlin.jvm.functions.Function0
                                    public final Object invoke() {
                                        return b5.m(function1, z10);
                                    }
                                };
                                c0VarR.Y(objI0);
                            }
                            function0 = (Function0) objI0;
                            c0VarR.A();
                        } else {
                            c0VarR.E(1848665295);
                            c0VarR.A();
                        }
                        c0Var2 = c0VarR;
                        s(aVarA2, function0, nVar3, nVar4, a0Var5, z15, r4Var3, jVar4, c0Var2, i18 & 33554304, 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var5;
                        z14 = z15;
                        r4Var2 = r4Var3;
                        jVar3 = jVar4;
                    }
                    jVar4 = jVar2;
                    z15 = z12;
                    r4Var3 = r4VarA;
                    i20 = 32;
                    i19 = 534932591;
                    androidx.compose.ui.a0 a0Var6 = a0Var2;
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(i19, i18, -1, "androidx.compose.material3.Checkbox (Checkbox.kt:161)");
                    }
                    v0.a aVarA3 = v0.b.a(z10);
                    if (function1 != null) {
                        c0VarR.E(1848599606);
                        if ((i18 & com.planner5d.library.engine.input.f.b.B) == i20) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        z17 = z16 | ((i18 & 14) == 4);
                        objI0 = c0VarR.i0();
                        if (z17) {
                            objI0 = new Function0() { // from class: androidx.compose.material3.w4
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return b5.m(function1, z10);
                                }
                            };
                            c0VarR.Y(objI0);
                        } else {
                            objI0 = new Function0() { // from class: androidx.compose.material3.w4
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return b5.m(function1, z10);
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        function0 = (Function0) objI0;
                        c0VarR.A();
                    } else {
                        c0VarR.E(1848665295);
                        c0VarR.A();
                    }
                    c0Var2 = c0VarR;
                    s(aVarA3, function0, nVar3, nVar4, a0Var6, z15, r4Var3, jVar4, c0Var2, i18 & 33554304, 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var6;
                    z14 = z15;
                    r4Var2 = r4Var3;
                    jVar3 = jVar4;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var3 = a0Var2;
                    z14 = z12;
                    jVar3 = jVar2;
                    r4Var2 = r4VarA;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.x4
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return b5.n(z10, function1, nVar, nVar2, a0Var3, z14, r4Var2, jVar3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= androidx.profileinstaller.n.c.f73814m;
            z12 = z11;
            if ((1572864 & i10) == 0) {
                if ((i11 & 64) == 0) {
                    r4VarA = r4Var;
                    if (c0VarR.D(r4VarA)) {
                    }
                    i12 |= i22;
                } else {
                    r4VarA = r4Var;
                }
                i12 |= i22;
            } else {
                r4VarA = r4Var;
            }
            i15 = i11 & 128;
            if (i15 != 0) {
                i12 |= 12582912;
                jVar2 = jVar;
            } else {
                jVar2 = jVar;
                if ((i10 & 12582912) == 0) {
                    if (c0VarR.D(jVar2)) {
                        i16 = 8388608;
                    } else {
                        i16 = 4194304;
                    }
                    i12 |= i16;
                }
            }
            i17 = i12;
            if ((i12 & 4793491) != 4793490) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c0VarR.h(z13, i17 & 1)) {
                c0VarR.l0();
                function0 = null;
                if ((i10 & 1) != 0) {
                    if (i21 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    }
                    if ((i11 & 64) != 0) {
                        i18 = i17 & (-3670017);
                        r4VarA = s4.f32691a.a(c0VarR, 6);
                    } else {
                        i18 = i17;
                    }
                    if (i15 != 0) {
                        jVar4 = null;
                    } else {
                        jVar4 = jVar2;
                    }
                    z15 = z12;
                    r4Var3 = r4VarA;
                    i20 = 32;
                    i19 = 534932591;
                } else {
                    if (i21 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    }
                    if ((i11 & 64) != 0) {
                        i18 = i17 & (-3670017);
                        r4VarA = s4.f32691a.a(c0VarR, 6);
                    } else {
                        i18 = i17;
                    }
                    if (i15 != 0) {
                        jVar4 = null;
                    } else {
                        jVar4 = jVar2;
                    }
                    z15 = z12;
                    r4Var3 = r4VarA;
                    i20 = 32;
                    i19 = 534932591;
                }
                androidx.compose.ui.a0 a0Var7 = a0Var2;
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(i19, i18, -1, "androidx.compose.material3.Checkbox (Checkbox.kt:161)");
                }
                v0.a aVarA4 = v0.b.a(z10);
                if (function1 != null) {
                    c0VarR.E(1848599606);
                    if ((i18 & com.planner5d.library.engine.input.f.b.B) == i20) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    z17 = z16 | ((i18 & 14) == 4);
                    objI0 = c0VarR.i0();
                    if (z17) {
                        objI0 = new Function0() { // from class: androidx.compose.material3.w4
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return b5.m(function1, z10);
                            }
                        };
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = new Function0() { // from class: androidx.compose.material3.w4
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return b5.m(function1, z10);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    function0 = (Function0) objI0;
                    c0VarR.A();
                } else {
                    c0VarR.E(1848665295);
                    c0VarR.A();
                }
                c0Var2 = c0VarR;
                s(aVarA4, function0, nVar3, nVar4, a0Var7, z15, r4Var3, jVar4, c0Var2, i18 & 33554304, 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var7;
                z14 = z15;
                r4Var2 = r4Var3;
                jVar3 = jVar4;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var3 = a0Var2;
                z14 = z12;
                jVar3 = jVar2;
                r4Var2 = r4VarA;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.x4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return b5.n(z10, function1, nVar, nVar2, a0Var3, z14, r4Var2, jVar3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 24576;
        a0Var2 = a0Var;
        i13 = i11 & 32;
        if (i13 != 0) {
            if ((196608 & i10) == 0) {
                z12 = z11;
                if (c0VarR.G(z12)) {
                    i14 = 131072;
                } else {
                    i14 = 65536;
                }
                i12 |= i14;
            }
            if ((1572864 & i10) == 0) {
                if ((i11 & 64) == 0) {
                    r4VarA = r4Var;
                    if (c0VarR.D(r4VarA)) {
                    }
                    i12 |= i22;
                } else {
                    r4VarA = r4Var;
                }
                i12 |= i22;
            } else {
                r4VarA = r4Var;
            }
            i15 = i11 & 128;
            if (i15 != 0) {
                i12 |= 12582912;
                jVar2 = jVar;
            } else {
                jVar2 = jVar;
                if ((i10 & 12582912) == 0) {
                    if (c0VarR.D(jVar2)) {
                        i16 = 8388608;
                    } else {
                        i16 = 4194304;
                    }
                    i12 |= i16;
                }
            }
            i17 = i12;
            if ((i12 & 4793491) != 4793490) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c0VarR.h(z13, i17 & 1)) {
                c0VarR.l0();
                function0 = null;
                if ((i10 & 1) != 0) {
                    if (i21 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    }
                    if ((i11 & 64) != 0) {
                        i18 = i17 & (-3670017);
                        r4VarA = s4.f32691a.a(c0VarR, 6);
                    } else {
                        i18 = i17;
                    }
                    if (i15 != 0) {
                        jVar4 = null;
                    } else {
                        jVar4 = jVar2;
                    }
                    z15 = z12;
                    r4Var3 = r4VarA;
                    i20 = 32;
                    i19 = 534932591;
                } else {
                    if (i21 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if (i13 != 0) {
                        z12 = true;
                    }
                    if ((i11 & 64) != 0) {
                        i18 = i17 & (-3670017);
                        r4VarA = s4.f32691a.a(c0VarR, 6);
                    } else {
                        i18 = i17;
                    }
                    if (i15 != 0) {
                        jVar4 = null;
                    } else {
                        jVar4 = jVar2;
                    }
                    z15 = z12;
                    r4Var3 = r4VarA;
                    i20 = 32;
                    i19 = 534932591;
                }
                androidx.compose.ui.a0 a0Var8 = a0Var2;
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(i19, i18, -1, "androidx.compose.material3.Checkbox (Checkbox.kt:161)");
                }
                v0.a aVarA5 = v0.b.a(z10);
                if (function1 != null) {
                    c0VarR.E(1848599606);
                    if ((i18 & com.planner5d.library.engine.input.f.b.B) == i20) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    z17 = z16 | ((i18 & 14) == 4);
                    objI0 = c0VarR.i0();
                    if (z17) {
                        objI0 = new Function0() { // from class: androidx.compose.material3.w4
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return b5.m(function1, z10);
                            }
                        };
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = new Function0() { // from class: androidx.compose.material3.w4
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return b5.m(function1, z10);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    function0 = (Function0) objI0;
                    c0VarR.A();
                } else {
                    c0VarR.E(1848665295);
                    c0VarR.A();
                }
                c0Var2 = c0VarR;
                s(aVarA5, function0, nVar3, nVar4, a0Var8, z15, r4Var3, jVar4, c0Var2, i18 & 33554304, 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var8;
                z14 = z15;
                r4Var2 = r4Var3;
                jVar3 = jVar4;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var3 = a0Var2;
                z14 = z12;
                jVar3 = jVar2;
                r4Var2 = r4VarA;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.x4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return b5.n(z10, function1, nVar, nVar2, a0Var3, z14, r4Var2, jVar3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= androidx.profileinstaller.n.c.f73814m;
        z12 = z11;
        if ((1572864 & i10) == 0) {
            if ((i11 & 64) == 0) {
                r4VarA = r4Var;
                if (c0VarR.D(r4VarA)) {
                }
                i12 |= i22;
            } else {
                r4VarA = r4Var;
            }
            i12 |= i22;
        } else {
            r4VarA = r4Var;
        }
        i15 = i11 & 128;
        if (i15 != 0) {
            i12 |= 12582912;
            jVar2 = jVar;
        } else {
            jVar2 = jVar;
            if ((i10 & 12582912) == 0) {
                if (c0VarR.D(jVar2)) {
                    i16 = 8388608;
                } else {
                    i16 = 4194304;
                }
                i12 |= i16;
            }
        }
        i17 = i12;
        if ((i12 & 4793491) != 4793490) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (c0VarR.h(z13, i17 & 1)) {
            c0VarR.l0();
            function0 = null;
            if ((i10 & 1) != 0) {
                if (i21 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                }
                if (i13 != 0) {
                    z12 = true;
                }
                if ((i11 & 64) != 0) {
                    i18 = i17 & (-3670017);
                    r4VarA = s4.f32691a.a(c0VarR, 6);
                } else {
                    i18 = i17;
                }
                if (i15 != 0) {
                    jVar4 = null;
                } else {
                    jVar4 = jVar2;
                }
                z15 = z12;
                r4Var3 = r4VarA;
                i20 = 32;
                i19 = 534932591;
            } else {
                if (i21 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                }
                if (i13 != 0) {
                    z12 = true;
                }
                if ((i11 & 64) != 0) {
                    i18 = i17 & (-3670017);
                    r4VarA = s4.f32691a.a(c0VarR, 6);
                } else {
                    i18 = i17;
                }
                if (i15 != 0) {
                    jVar4 = null;
                } else {
                    jVar4 = jVar2;
                }
                z15 = z12;
                r4Var3 = r4VarA;
                i20 = 32;
                i19 = 534932591;
            }
            androidx.compose.ui.a0 a0Var9 = a0Var2;
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(i19, i18, -1, "androidx.compose.material3.Checkbox (Checkbox.kt:161)");
            }
            v0.a aVarA6 = v0.b.a(z10);
            if (function1 != null) {
                c0VarR.E(1848599606);
                if ((i18 & com.planner5d.library.engine.input.f.b.B) == i20) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                z17 = z16 | ((i18 & 14) == 4);
                objI0 = c0VarR.i0();
                if (z17) {
                    objI0 = new Function0() { // from class: androidx.compose.material3.w4
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return b5.m(function1, z10);
                        }
                    };
                    c0VarR.Y(objI0);
                } else {
                    objI0 = new Function0() { // from class: androidx.compose.material3.w4
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return b5.m(function1, z10);
                        }
                    };
                    c0VarR.Y(objI0);
                }
                function0 = (Function0) objI0;
                c0VarR.A();
            } else {
                c0VarR.E(1848665295);
                c0VarR.A();
            }
            c0Var2 = c0VarR;
            s(aVarA6, function0, nVar3, nVar4, a0Var9, z15, r4Var3, jVar4, c0Var2, i18 & 33554304, 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            a0Var3 = a0Var9;
            z14 = z15;
            r4Var2 = r4Var3;
            jVar3 = jVar4;
        } else {
            c0Var2 = c0VarR;
            c0Var2.u();
            a0Var3 = a0Var2;
            z14 = z12;
            jVar3 = jVar2;
            r4Var2 = r4VarA;
        }
        s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.x4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return b5.n(z10, function1, nVar, nVar2, a0Var3, z14, r4Var2, jVar3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(Function1 function1, boolean z10) {
        function1.invoke(Boolean.valueOf(!z10));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l(boolean z10, Function1 function1, androidx.compose.ui.a0 a0Var, boolean z11, r4 r4Var, androidx.compose.foundation.interaction.j jVar, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        i(z10, function1, a0Var, z11, r4Var, jVar, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m(Function1 function1, boolean z10) {
        function1.invoke(Boolean.valueOf(!z10));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit n(boolean z10, Function1 function1, androidx.compose.ui.graphics.drawscope.n nVar, androidx.compose.ui.graphics.drawscope.n nVar2, androidx.compose.ui.a0 a0Var, boolean z11, r4 r4Var, androidx.compose.foundation.interaction.j jVar, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        j(z10, function1, nVar, nVar2, a0Var, z11, r4Var, jVar, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    private static final void o(final boolean z10, final v0.a aVar, final androidx.compose.ui.a0 a0Var, final r4 r4Var, final androidx.compose.ui.graphics.drawscope.n nVar, final androidx.compose.ui.graphics.drawscope.n nVar2, androidx.compose.runtime.c0 c0Var, final int i10) {
        int i11;
        androidx.compose.runtime.c0 c0Var2;
        float f10;
        float f11;
        float f12;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-891330208);
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
            i11 |= c0VarR.D(r4Var) ? 2048 : 1024;
        }
        if ((i10 & 24576) == 0) {
            i11 |= c0VarR.k0(nVar) ? 16384 : 8192;
        }
        if ((196608 & i10) == 0) {
            i11 |= c0VarR.k0(nVar2) ? 131072 : 65536;
        }
        if (c0VarR.h((74899 & i11) != 74898, i11 & 1)) {
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-891330208, i11, -1, "androidx.compose.material3.CheckboxImpl (Checkbox.kt:401)");
            }
            int i12 = i11 >> 3;
            int i13 = i12 & 14;
            androidx.compose.animation.core.l3 l3VarJ = androidx.compose.animation.core.w3.J(aVar, null, c0VarR, i13, 2);
            androidx.compose.animation.core.y0 y0VarB = hm.b(d0.h1.DefaultSpatial, c0VarR, 6);
            b bVar = new b(y0VarB);
            kotlin.jvm.internal.z zVar = kotlin.jvm.internal.z.f312833a;
            androidx.compose.animation.core.z3<Float, androidx.compose.animation.core.s> z3VarP = androidx.compose.animation.core.t4.P(zVar);
            v0.a aVar2 = (v0.a) l3VarJ.p();
            c0VarR.E(-768316570);
            int i14 = i11;
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-768316570, 0, -1, "androidx.compose.material3.CheckboxImpl.<anonymous> (Checkbox.kt:415)");
            }
            int[] iArr = c.f26203a;
            int i15 = iArr[aVar2.ordinal()];
            float f13 = 0.0f;
            if (i15 == 1) {
                f10 = 1.0f;
            } else if (i15 != 2) {
                if (i15 != 3) {
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
            v0.a aVar3 = (v0.a) l3VarJ.y();
            c0VarR.E(-768316570);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-768316570, 0, -1, "androidx.compose.material3.CheckboxImpl.<anonymous> (Checkbox.kt:415)");
            }
            int i16 = iArr[aVar3.ordinal()];
            if (i16 == 1) {
                f11 = 1.0f;
            } else if (i16 != 2) {
                if (i16 != 3) {
                    throw new kotlin.k0();
                }
                f11 = 1.0f;
            } else {
                f11 = 0.0f;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            c0VarR.A();
            final androidx.compose.runtime.n7 n7VarD = androidx.compose.animation.core.w3.D(l3VarJ, fValueOf, Float.valueOf(f11), bVar.invoke(l3VarJ.w(), c0VarR, 0), z3VarP, "FloatAnimation", c0VarR, 0);
            a aVar4 = new a(y0VarB);
            androidx.compose.animation.core.z3<Float, androidx.compose.animation.core.s> z3VarP2 = androidx.compose.animation.core.t4.P(zVar);
            v0.a aVar5 = (v0.a) l3VarJ.p();
            c0VarR.E(1840054703);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1840054703, 0, -1, "androidx.compose.material3.CheckboxImpl.<anonymous> (Checkbox.kt:433)");
            }
            int i17 = iArr[aVar5.ordinal()];
            if (i17 == 1 || i17 == 2) {
                f12 = 0.0f;
            } else {
                if (i17 != 3) {
                    throw new kotlin.k0();
                }
                f12 = 1.0f;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            c0VarR.A();
            Float fValueOf2 = Float.valueOf(f12);
            v0.a aVar6 = (v0.a) l3VarJ.y();
            c0VarR.E(1840054703);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1840054703, 0, -1, "androidx.compose.material3.CheckboxImpl.<anonymous> (Checkbox.kt:433)");
            }
            int i18 = iArr[aVar6.ordinal()];
            if (i18 != 1 && i18 != 2) {
                if (i18 != 3) {
                    throw new kotlin.k0();
                }
                f13 = 1.0f;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            c0VarR.A();
            final androidx.compose.runtime.n7 n7VarD2 = androidx.compose.animation.core.w3.D(l3VarJ, fValueOf2, Float.valueOf(f13), aVar4.invoke(l3VarJ.w(), c0VarR, 0), z3VarP2, "FloatAnimation", c0VarR, 0);
            c0Var2 = c0VarR;
            Object objI0 = c0Var2.i0();
            androidx.compose.runtime.c0.a aVar7 = androidx.compose.runtime.c0.f35327a;
            if (objI0 == aVar7.a()) {
                Object q4Var = new q4(null, null, null, 7, null);
                c0Var2.Y(q4Var);
                objI0 = q4Var;
            }
            final q4 q4Var2 = (q4) objI0;
            final androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarC = r4Var.c(aVar, c0Var2, i13 | ((i14 >> 6) & com.planner5d.library.engine.input.f.b.B));
            int i19 = (i14 & okhttp3.internal.ws.g.f334652s) | (i12 & 896);
            final androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarB = r4Var.b(z10, aVar, c0Var2, i19);
            final androidx.compose.runtime.n7<androidx.compose.ui.graphics.q0> n7VarA = r4Var.a(z10, aVar, c0Var2, i19);
            androidx.compose.ui.a0 a0VarO = androidx.compose.foundation.layout.i6.o(androidx.compose.foundation.layout.i6.H(a0Var, androidx.compose.ui.e.f37317a.i(), false, 2, null), f26199c);
            boolean zD = c0Var2.D(n7VarB) | c0Var2.D(n7VarA) | c0Var2.k0(nVar2) | c0Var2.D(n7VarC) | c0Var2.D(n7VarD) | c0Var2.D(n7VarD2) | c0Var2.k0(nVar);
            Object objI1 = c0Var2.i0();
            if (zD || objI1 == aVar7.a()) {
                Object obj = new Function1() { // from class: androidx.compose.material3.t4
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return b5.p(n7VarB, n7VarA, nVar2, n7VarC, n7VarD, n7VarD2, nVar, q4Var2, (androidx.compose.ui.graphics.drawscope.f) obj2);
                    }
                };
                c0Var2.Y(obj);
                objI1 = obj;
            }
            androidx.compose.foundation.f1.e(a0VarO, (Function1) objI1, c0Var2, 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0Var2 = c0VarR;
            c0Var2.u();
        }
        androidx.compose.runtime.s5 s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.u4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return b5.q(z10, aVar, a0Var, r4Var, nVar, nVar2, i10, (androidx.compose.runtime.c0) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit p(androidx.compose.runtime.n7 n7Var, androidx.compose.runtime.n7 n7Var2, androidx.compose.ui.graphics.drawscope.n nVar, androidx.compose.runtime.n7 n7Var3, androidx.compose.runtime.n7 n7Var4, androidx.compose.runtime.n7 n7Var5, androidx.compose.ui.graphics.drawscope.n nVar2, q4 q4Var, androidx.compose.ui.graphics.drawscope.f fVar) {
        v(fVar, ((androidx.compose.ui.graphics.q0) n7Var.getValue()).M(), ((androidx.compose.ui.graphics.q0) n7Var2.getValue()).M(), fVar.S7(f26200d), nVar);
        w(fVar, ((androidx.compose.ui.graphics.q0) n7Var3.getValue()).M(), ((Number) n7Var4.getValue()).floatValue(), ((Number) n7Var5.getValue()).floatValue(), nVar2, q4Var);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q(boolean z10, v0.a aVar, androidx.compose.ui.a0 a0Var, r4 r4Var, androidx.compose.ui.graphics.drawscope.n nVar, androidx.compose.ui.graphics.drawscope.n nVar2, int i10, androidx.compose.runtime.c0 c0Var, int i11) {
        o(z10, aVar, a0Var, r4Var, nVar, nVar2, c0Var, androidx.compose.runtime.t4.a(i10 | 1));
        return Unit.f312394a;
    }

    /* JADX WARN: Code duplicated, block: B:100:0x018b  */
    /* JADX WARN: Code duplicated, block: B:102:0x0195  */
    /* JADX WARN: Code duplicated, block: B:105:0x01a4  */
    /* JADX WARN: Code duplicated, block: B:107:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0060  */
    /* JADX WARN: Code duplicated, block: B:38:0x0065  */
    /* JADX WARN: Code duplicated, block: B:40:0x0069  */
    /* JADX WARN: Code duplicated, block: B:42:0x0071  */
    /* JADX WARN: Code duplicated, block: B:43:0x0074  */
    /* JADX WARN: Code duplicated, block: B:47:0x007b  */
    /* JADX WARN: Code duplicated, block: B:49:0x007f  */
    /* JADX WARN: Code duplicated, block: B:51:0x0087  */
    /* JADX WARN: Code duplicated, block: B:52:0x008a  */
    /* JADX WARN: Code duplicated, block: B:55:0x0092  */
    /* JADX WARN: Code duplicated, block: B:58:0x009c  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:62:0x00a5  */
    /* JADX WARN: Code duplicated, block: B:64:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:69:0x00bd  */
    /* JADX WARN: Code duplicated, block: B:70:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c9  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d4  */
    /* JADX WARN: Code duplicated, block: B:83:0x00ea A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:84:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:85:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:91:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:93:0x0103  */
    /* JADX WARN: Code duplicated, block: B:94:0x010c  */
    /* JADX WARN: Code duplicated, block: B:97:0x011b  */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void r(@NotNull final v0.a aVar, @Nullable final Function0<Unit> function0, @Nullable androidx.compose.ui.a0 a0Var, boolean z10, @Nullable r4 r4Var, @Nullable androidx.compose.foundation.interaction.j jVar, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        Function0<Unit> function1;
        androidx.compose.ui.a0 a0Var2;
        int i13;
        boolean z11;
        int i14;
        r4 r4VarA;
        int i15;
        androidx.compose.foundation.interaction.j jVar2;
        int i16;
        boolean z12;
        androidx.compose.runtime.c0 c0Var2;
        final androidx.compose.ui.a0 a0Var3;
        final boolean z13;
        final r4 r4Var2;
        final androidx.compose.foundation.interaction.j jVar3;
        androidx.compose.runtime.s5 s5VarT;
        int i17;
        androidx.compose.ui.a0 a0Var4;
        boolean z14;
        androidx.compose.ui.a0 a0Var5;
        boolean z15;
        r4 r4Var3;
        androidx.compose.foundation.interaction.j jVar4;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1608358065);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c0VarR.K(aVar.ordinal()) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        if ((i11 & 2) != 0) {
            i12 |= 48;
            function1 = function0;
        } else {
            function1 = function0;
            if ((i10 & 48) == 0) {
                i12 |= c0VarR.k0(function1) ? 32 : 16;
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
                    z11 = z10;
                    if (c0VarR.G(z11)) {
                        i14 = 2048;
                    } else {
                        i14 = 1024;
                    }
                    i12 |= i14;
                }
                if ((i10 & 24576) == 0) {
                    if ((i11 & 16) == 0) {
                        r4VarA = r4Var;
                        int i19 = c0VarR.D(r4VarA) ? 16384 : 8192;
                        i12 |= i19;
                    } else {
                        r4VarA = r4Var;
                    }
                    i12 |= i19;
                } else {
                    r4VarA = r4Var;
                }
                i15 = i11 & 32;
                if (i15 != 0) {
                    if ((196608 & i10) == 0) {
                        jVar2 = jVar;
                        if (c0VarR.D(jVar2)) {
                            i16 = 131072;
                        } else {
                            i16 = 65536;
                        }
                        i12 |= i16;
                    }
                    if ((74899 & i12) != 74898) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (c0VarR.h(z12, i12 & 1)) {
                        c0VarR.l0();
                        i17 = 6;
                        if ((i10 & 1) != 0 || c0VarR.y()) {
                            if (i18 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            z14 = i13 == 0 ? z11 : true;
                            if ((i11 & 16) != 0) {
                                i12 &= -57345;
                                r4VarA = s4.f32691a.a(c0VarR, 6);
                            }
                            if (i15 != 0) {
                                a0Var5 = a0Var4;
                                z15 = z14;
                                i17 = 6;
                                jVar4 = null;
                                r4Var3 = r4VarA;
                            } else {
                                a0Var5 = a0Var4;
                                z15 = z14;
                                r4Var3 = r4VarA;
                            }
                            c0VarR.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(-1608358065, i12, -1, "androidx.compose.material3.TriStateCheckbox (Checkbox.kt:214)");
                            }
                            float fFloor = (float) Math.floor(((androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m())).S7(s4.f32691a.d()));
                            androidx.compose.ui.graphics.drawscope.n nVar = new androidx.compose.ui.graphics.drawscope.n(fFloor, 0.0f, androidx.compose.ui.graphics.u3.f38256b.c(), 0, null, 26, null);
                            androidx.compose.ui.graphics.drawscope.n nVar2 = new androidx.compose.ui.graphics.drawscope.n(fFloor, 0.0f, 0, 0, null, 30, null);
                            int i20 = i12 & okhttp3.internal.ws.g.f334652s;
                            int i21 = i12 << i17;
                            c0Var2 = c0VarR;
                            s(aVar, function1, nVar, nVar2, a0Var5, z15, r4Var3, jVar4, c0Var2, i20 | (57344 & i21) | (458752 & i21) | (3670016 & i21) | (i21 & 29360128), 0);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                            a0Var3 = a0Var5;
                            z13 = z15;
                            r4Var2 = r4Var3;
                            jVar3 = jVar4;
                        } else {
                            c0VarR.u();
                            if ((i11 & 16) != 0) {
                                i12 &= -57345;
                            }
                            a0Var5 = a0Var2;
                            z15 = z11;
                            r4Var3 = r4VarA;
                        }
                        jVar4 = jVar2;
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-1608358065, i12, -1, "androidx.compose.material3.TriStateCheckbox (Checkbox.kt:214)");
                        }
                        float fFloor2 = (float) Math.floor(((androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m())).S7(s4.f32691a.d()));
                        androidx.compose.ui.graphics.drawscope.n nVar3 = new androidx.compose.ui.graphics.drawscope.n(fFloor2, 0.0f, androidx.compose.ui.graphics.u3.f38256b.c(), 0, null, 26, null);
                        androidx.compose.ui.graphics.drawscope.n nVar4 = new androidx.compose.ui.graphics.drawscope.n(fFloor2, 0.0f, 0, 0, null, 30, null);
                        int i22 = i12 & okhttp3.internal.ws.g.f334652s;
                        int i23 = i12 << i17;
                        c0Var2 = c0VarR;
                        s(aVar, function1, nVar3, nVar4, a0Var5, z15, r4Var3, jVar4, c0Var2, i22 | (57344 & i23) | (458752 & i23) | (3670016 & i23) | (i23 & 29360128), 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        a0Var3 = a0Var5;
                        z13 = z15;
                        r4Var2 = r4Var3;
                        jVar3 = jVar4;
                    } else {
                        c0Var2 = c0VarR;
                        c0Var2.u();
                        a0Var3 = a0Var2;
                        z13 = z11;
                        r4Var2 = r4VarA;
                        jVar3 = jVar2;
                    }
                    s5VarT = c0Var2.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.y4
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return b5.t(aVar, function0, a0Var3, z13, r4Var2, jVar3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= androidx.profileinstaller.n.c.f73814m;
                jVar2 = jVar;
                if ((74899 & i12) != 74898) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    c0VarR.l0();
                    i17 = 6;
                    if ((i10 & 1) != 0) {
                        if (i18 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 == 0) {
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                            r4VarA = s4.f32691a.a(c0VarR, 6);
                        }
                        if (i15 != 0) {
                            a0Var5 = a0Var4;
                            z15 = z14;
                            i17 = 6;
                            jVar4 = null;
                            r4Var3 = r4VarA;
                        } else {
                            a0Var5 = a0Var4;
                            z15 = z14;
                            r4Var3 = r4VarA;
                            jVar4 = jVar2;
                        }
                    } else {
                        if (i18 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 == 0) {
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                            r4VarA = s4.f32691a.a(c0VarR, 6);
                        }
                        if (i15 != 0) {
                            a0Var5 = a0Var4;
                            z15 = z14;
                            i17 = 6;
                            jVar4 = null;
                            r4Var3 = r4VarA;
                        } else {
                            a0Var5 = a0Var4;
                            z15 = z14;
                            r4Var3 = r4VarA;
                            jVar4 = jVar2;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1608358065, i12, -1, "androidx.compose.material3.TriStateCheckbox (Checkbox.kt:214)");
                    }
                    float fFloor3 = (float) Math.floor(((androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m())).S7(s4.f32691a.d()));
                    androidx.compose.ui.graphics.drawscope.n nVar5 = new androidx.compose.ui.graphics.drawscope.n(fFloor3, 0.0f, androidx.compose.ui.graphics.u3.f38256b.c(), 0, null, 26, null);
                    androidx.compose.ui.graphics.drawscope.n nVar6 = new androidx.compose.ui.graphics.drawscope.n(fFloor3, 0.0f, 0, 0, null, 30, null);
                    int i24 = i12 & okhttp3.internal.ws.g.f334652s;
                    int i25 = i12 << i17;
                    c0Var2 = c0VarR;
                    s(aVar, function1, nVar5, nVar6, a0Var5, z15, r4Var3, jVar4, c0Var2, i24 | (57344 & i25) | (458752 & i25) | (3670016 & i25) | (i25 & 29360128), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var5;
                    z13 = z15;
                    r4Var2 = r4Var3;
                    jVar3 = jVar4;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var3 = a0Var2;
                    z13 = z11;
                    r4Var2 = r4VarA;
                    jVar3 = jVar2;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.y4
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return b5.t(aVar, function0, a0Var3, z13, r4Var2, jVar3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 3072;
            z11 = z10;
            if ((i10 & 24576) == 0) {
                if ((i11 & 16) == 0) {
                    r4VarA = r4Var;
                    if (c0VarR.D(r4VarA)) {
                    }
                    i12 |= i19;
                } else {
                    r4VarA = r4Var;
                }
                i12 |= i19;
            } else {
                r4VarA = r4Var;
            }
            i15 = i11 & 32;
            if (i15 != 0) {
                if ((196608 & i10) == 0) {
                    jVar2 = jVar;
                    if (c0VarR.D(jVar2)) {
                        i16 = 131072;
                    } else {
                        i16 = 65536;
                    }
                    i12 |= i16;
                }
                if ((74899 & i12) != 74898) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    c0VarR.l0();
                    i17 = 6;
                    if ((i10 & 1) != 0) {
                        if (i18 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 == 0) {
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                            r4VarA = s4.f32691a.a(c0VarR, 6);
                        }
                        if (i15 != 0) {
                            a0Var5 = a0Var4;
                            z15 = z14;
                            i17 = 6;
                            jVar4 = null;
                            r4Var3 = r4VarA;
                        } else {
                            a0Var5 = a0Var4;
                            z15 = z14;
                            r4Var3 = r4VarA;
                            jVar4 = jVar2;
                        }
                    } else {
                        if (i18 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 == 0) {
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                            r4VarA = s4.f32691a.a(c0VarR, 6);
                        }
                        if (i15 != 0) {
                            a0Var5 = a0Var4;
                            z15 = z14;
                            i17 = 6;
                            jVar4 = null;
                            r4Var3 = r4VarA;
                        } else {
                            a0Var5 = a0Var4;
                            z15 = z14;
                            r4Var3 = r4VarA;
                            jVar4 = jVar2;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1608358065, i12, -1, "androidx.compose.material3.TriStateCheckbox (Checkbox.kt:214)");
                    }
                    float fFloor4 = (float) Math.floor(((androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m())).S7(s4.f32691a.d()));
                    androidx.compose.ui.graphics.drawscope.n nVar7 = new androidx.compose.ui.graphics.drawscope.n(fFloor4, 0.0f, androidx.compose.ui.graphics.u3.f38256b.c(), 0, null, 26, null);
                    androidx.compose.ui.graphics.drawscope.n nVar8 = new androidx.compose.ui.graphics.drawscope.n(fFloor4, 0.0f, 0, 0, null, 30, null);
                    int i26 = i12 & okhttp3.internal.ws.g.f334652s;
                    int i27 = i12 << i17;
                    c0Var2 = c0VarR;
                    s(aVar, function1, nVar7, nVar8, a0Var5, z15, r4Var3, jVar4, c0Var2, i26 | (57344 & i27) | (458752 & i27) | (3670016 & i27) | (i27 & 29360128), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var5;
                    z13 = z15;
                    r4Var2 = r4Var3;
                    jVar3 = jVar4;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var3 = a0Var2;
                    z13 = z11;
                    r4Var2 = r4VarA;
                    jVar3 = jVar2;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.y4
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return b5.t(aVar, function0, a0Var3, z13, r4Var2, jVar3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= androidx.profileinstaller.n.c.f73814m;
            jVar2 = jVar;
            if ((74899 & i12) != 74898) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i12 & 1)) {
                c0VarR.l0();
                i17 = 6;
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 == 0) {
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        r4VarA = s4.f32691a.a(c0VarR, 6);
                    }
                    if (i15 != 0) {
                        a0Var5 = a0Var4;
                        z15 = z14;
                        i17 = 6;
                        jVar4 = null;
                        r4Var3 = r4VarA;
                    } else {
                        a0Var5 = a0Var4;
                        z15 = z14;
                        r4Var3 = r4VarA;
                        jVar4 = jVar2;
                    }
                } else {
                    if (i18 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 == 0) {
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        r4VarA = s4.f32691a.a(c0VarR, 6);
                    }
                    if (i15 != 0) {
                        a0Var5 = a0Var4;
                        z15 = z14;
                        i17 = 6;
                        jVar4 = null;
                        r4Var3 = r4VarA;
                    } else {
                        a0Var5 = a0Var4;
                        z15 = z14;
                        r4Var3 = r4VarA;
                        jVar4 = jVar2;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1608358065, i12, -1, "androidx.compose.material3.TriStateCheckbox (Checkbox.kt:214)");
                }
                float fFloor5 = (float) Math.floor(((androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m())).S7(s4.f32691a.d()));
                androidx.compose.ui.graphics.drawscope.n nVar9 = new androidx.compose.ui.graphics.drawscope.n(fFloor5, 0.0f, androidx.compose.ui.graphics.u3.f38256b.c(), 0, null, 26, null);
                androidx.compose.ui.graphics.drawscope.n nVar10 = new androidx.compose.ui.graphics.drawscope.n(fFloor5, 0.0f, 0, 0, null, 30, null);
                int i28 = i12 & okhttp3.internal.ws.g.f334652s;
                int i29 = i12 << i17;
                c0Var2 = c0VarR;
                s(aVar, function1, nVar9, nVar10, a0Var5, z15, r4Var3, jVar4, c0Var2, i28 | (57344 & i29) | (458752 & i29) | (3670016 & i29) | (i29 & 29360128), 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var5;
                z13 = z15;
                r4Var2 = r4Var3;
                jVar3 = jVar4;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var3 = a0Var2;
                z13 = z11;
                r4Var2 = r4VarA;
                jVar3 = jVar2;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.y4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return b5.t(aVar, function0, a0Var3, z13, r4Var2, jVar3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
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
            if ((i10 & 24576) == 0) {
                if ((i11 & 16) == 0) {
                    r4VarA = r4Var;
                    if (c0VarR.D(r4VarA)) {
                    }
                    i12 |= i19;
                } else {
                    r4VarA = r4Var;
                }
                i12 |= i19;
            } else {
                r4VarA = r4Var;
            }
            i15 = i11 & 32;
            if (i15 != 0) {
                if ((196608 & i10) == 0) {
                    jVar2 = jVar;
                    if (c0VarR.D(jVar2)) {
                        i16 = 131072;
                    } else {
                        i16 = 65536;
                    }
                    i12 |= i16;
                }
                if ((74899 & i12) != 74898) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    c0VarR.l0();
                    i17 = 6;
                    if ((i10 & 1) != 0) {
                        if (i18 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 == 0) {
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                            r4VarA = s4.f32691a.a(c0VarR, 6);
                        }
                        if (i15 != 0) {
                            a0Var5 = a0Var4;
                            z15 = z14;
                            i17 = 6;
                            jVar4 = null;
                            r4Var3 = r4VarA;
                        } else {
                            a0Var5 = a0Var4;
                            z15 = z14;
                            r4Var3 = r4VarA;
                            jVar4 = jVar2;
                        }
                    } else {
                        if (i18 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 == 0) {
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                            r4VarA = s4.f32691a.a(c0VarR, 6);
                        }
                        if (i15 != 0) {
                            a0Var5 = a0Var4;
                            z15 = z14;
                            i17 = 6;
                            jVar4 = null;
                            r4Var3 = r4VarA;
                        } else {
                            a0Var5 = a0Var4;
                            z15 = z14;
                            r4Var3 = r4VarA;
                            jVar4 = jVar2;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1608358065, i12, -1, "androidx.compose.material3.TriStateCheckbox (Checkbox.kt:214)");
                    }
                    float fFloor6 = (float) Math.floor(((androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m())).S7(s4.f32691a.d()));
                    androidx.compose.ui.graphics.drawscope.n nVar11 = new androidx.compose.ui.graphics.drawscope.n(fFloor6, 0.0f, androidx.compose.ui.graphics.u3.f38256b.c(), 0, null, 26, null);
                    androidx.compose.ui.graphics.drawscope.n nVar12 = new androidx.compose.ui.graphics.drawscope.n(fFloor6, 0.0f, 0, 0, null, 30, null);
                    int i210 = i12 & okhttp3.internal.ws.g.f334652s;
                    int i211 = i12 << i17;
                    c0Var2 = c0VarR;
                    s(aVar, function1, nVar11, nVar12, a0Var5, z15, r4Var3, jVar4, c0Var2, i210 | (57344 & i211) | (458752 & i211) | (3670016 & i211) | (i211 & 29360128), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var5;
                    z13 = z15;
                    r4Var2 = r4Var3;
                    jVar3 = jVar4;
                } else {
                    c0Var2 = c0VarR;
                    c0Var2.u();
                    a0Var3 = a0Var2;
                    z13 = z11;
                    r4Var2 = r4VarA;
                    jVar3 = jVar2;
                }
                s5VarT = c0Var2.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.y4
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return b5.t(aVar, function0, a0Var3, z13, r4Var2, jVar3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= androidx.profileinstaller.n.c.f73814m;
            jVar2 = jVar;
            if ((74899 & i12) != 74898) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i12 & 1)) {
                c0VarR.l0();
                i17 = 6;
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 == 0) {
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        r4VarA = s4.f32691a.a(c0VarR, 6);
                    }
                    if (i15 != 0) {
                        a0Var5 = a0Var4;
                        z15 = z14;
                        i17 = 6;
                        jVar4 = null;
                        r4Var3 = r4VarA;
                    } else {
                        a0Var5 = a0Var4;
                        z15 = z14;
                        r4Var3 = r4VarA;
                        jVar4 = jVar2;
                    }
                } else {
                    if (i18 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 == 0) {
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        r4VarA = s4.f32691a.a(c0VarR, 6);
                    }
                    if (i15 != 0) {
                        a0Var5 = a0Var4;
                        z15 = z14;
                        i17 = 6;
                        jVar4 = null;
                        r4Var3 = r4VarA;
                    } else {
                        a0Var5 = a0Var4;
                        z15 = z14;
                        r4Var3 = r4VarA;
                        jVar4 = jVar2;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1608358065, i12, -1, "androidx.compose.material3.TriStateCheckbox (Checkbox.kt:214)");
                }
                float fFloor7 = (float) Math.floor(((androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m())).S7(s4.f32691a.d()));
                androidx.compose.ui.graphics.drawscope.n nVar13 = new androidx.compose.ui.graphics.drawscope.n(fFloor7, 0.0f, androidx.compose.ui.graphics.u3.f38256b.c(), 0, null, 26, null);
                androidx.compose.ui.graphics.drawscope.n nVar14 = new androidx.compose.ui.graphics.drawscope.n(fFloor7, 0.0f, 0, 0, null, 30, null);
                int i212 = i12 & okhttp3.internal.ws.g.f334652s;
                int i213 = i12 << i17;
                c0Var2 = c0VarR;
                s(aVar, function1, nVar13, nVar14, a0Var5, z15, r4Var3, jVar4, c0Var2, i212 | (57344 & i213) | (458752 & i213) | (3670016 & i213) | (i213 & 29360128), 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var5;
                z13 = z15;
                r4Var2 = r4Var3;
                jVar3 = jVar4;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var3 = a0Var2;
                z13 = z11;
                r4Var2 = r4VarA;
                jVar3 = jVar2;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.y4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return b5.t(aVar, function0, a0Var3, z13, r4Var2, jVar3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 3072;
        z11 = z10;
        if ((i10 & 24576) == 0) {
            if ((i11 & 16) == 0) {
                r4VarA = r4Var;
                if (c0VarR.D(r4VarA)) {
                }
                i12 |= i19;
            } else {
                r4VarA = r4Var;
            }
            i12 |= i19;
        } else {
            r4VarA = r4Var;
        }
        i15 = i11 & 32;
        if (i15 != 0) {
            if ((196608 & i10) == 0) {
                jVar2 = jVar;
                if (c0VarR.D(jVar2)) {
                    i16 = 131072;
                } else {
                    i16 = 65536;
                }
                i12 |= i16;
            }
            if ((74899 & i12) != 74898) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i12 & 1)) {
                c0VarR.l0();
                i17 = 6;
                if ((i10 & 1) != 0) {
                    if (i18 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 == 0) {
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        r4VarA = s4.f32691a.a(c0VarR, 6);
                    }
                    if (i15 != 0) {
                        a0Var5 = a0Var4;
                        z15 = z14;
                        i17 = 6;
                        jVar4 = null;
                        r4Var3 = r4VarA;
                    } else {
                        a0Var5 = a0Var4;
                        z15 = z14;
                        r4Var3 = r4VarA;
                        jVar4 = jVar2;
                    }
                } else {
                    if (i18 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 == 0) {
                    }
                    if ((i11 & 16) != 0) {
                        i12 &= -57345;
                        r4VarA = s4.f32691a.a(c0VarR, 6);
                    }
                    if (i15 != 0) {
                        a0Var5 = a0Var4;
                        z15 = z14;
                        i17 = 6;
                        jVar4 = null;
                        r4Var3 = r4VarA;
                    } else {
                        a0Var5 = a0Var4;
                        z15 = z14;
                        r4Var3 = r4VarA;
                        jVar4 = jVar2;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1608358065, i12, -1, "androidx.compose.material3.TriStateCheckbox (Checkbox.kt:214)");
                }
                float fFloor8 = (float) Math.floor(((androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m())).S7(s4.f32691a.d()));
                androidx.compose.ui.graphics.drawscope.n nVar15 = new androidx.compose.ui.graphics.drawscope.n(fFloor8, 0.0f, androidx.compose.ui.graphics.u3.f38256b.c(), 0, null, 26, null);
                androidx.compose.ui.graphics.drawscope.n nVar16 = new androidx.compose.ui.graphics.drawscope.n(fFloor8, 0.0f, 0, 0, null, 30, null);
                int i214 = i12 & okhttp3.internal.ws.g.f334652s;
                int i215 = i12 << i17;
                c0Var2 = c0VarR;
                s(aVar, function1, nVar15, nVar16, a0Var5, z15, r4Var3, jVar4, c0Var2, i214 | (57344 & i215) | (458752 & i215) | (3670016 & i215) | (i215 & 29360128), 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var5;
                z13 = z15;
                r4Var2 = r4Var3;
                jVar3 = jVar4;
            } else {
                c0Var2 = c0VarR;
                c0Var2.u();
                a0Var3 = a0Var2;
                z13 = z11;
                r4Var2 = r4VarA;
                jVar3 = jVar2;
            }
            s5VarT = c0Var2.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.y4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return b5.t(aVar, function0, a0Var3, z13, r4Var2, jVar3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= androidx.profileinstaller.n.c.f73814m;
        jVar2 = jVar;
        if ((74899 & i12) != 74898) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (c0VarR.h(z12, i12 & 1)) {
            c0VarR.l0();
            i17 = 6;
            if ((i10 & 1) != 0) {
                if (i18 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if (i13 == 0) {
                }
                if ((i11 & 16) != 0) {
                    i12 &= -57345;
                    r4VarA = s4.f32691a.a(c0VarR, 6);
                }
                if (i15 != 0) {
                    a0Var5 = a0Var4;
                    z15 = z14;
                    i17 = 6;
                    jVar4 = null;
                    r4Var3 = r4VarA;
                } else {
                    a0Var5 = a0Var4;
                    z15 = z14;
                    r4Var3 = r4VarA;
                    jVar4 = jVar2;
                }
            } else {
                if (i18 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if (i13 == 0) {
                }
                if ((i11 & 16) != 0) {
                    i12 &= -57345;
                    r4VarA = s4.f32691a.a(c0VarR, 6);
                }
                if (i15 != 0) {
                    a0Var5 = a0Var4;
                    z15 = z14;
                    i17 = 6;
                    jVar4 = null;
                    r4Var3 = r4VarA;
                } else {
                    a0Var5 = a0Var4;
                    z15 = z14;
                    r4Var3 = r4VarA;
                    jVar4 = jVar2;
                }
            }
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1608358065, i12, -1, "androidx.compose.material3.TriStateCheckbox (Checkbox.kt:214)");
            }
            float fFloor9 = (float) Math.floor(((androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m())).S7(s4.f32691a.d()));
            androidx.compose.ui.graphics.drawscope.n nVar17 = new androidx.compose.ui.graphics.drawscope.n(fFloor9, 0.0f, androidx.compose.ui.graphics.u3.f38256b.c(), 0, null, 26, null);
            androidx.compose.ui.graphics.drawscope.n nVar18 = new androidx.compose.ui.graphics.drawscope.n(fFloor9, 0.0f, 0, 0, null, 30, null);
            int i216 = i12 & okhttp3.internal.ws.g.f334652s;
            int i217 = i12 << i17;
            c0Var2 = c0VarR;
            s(aVar, function1, nVar17, nVar18, a0Var5, z15, r4Var3, jVar4, c0Var2, i216 | (57344 & i217) | (458752 & i217) | (3670016 & i217) | (i217 & 29360128), 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            a0Var3 = a0Var5;
            z13 = z15;
            r4Var2 = r4Var3;
            jVar3 = jVar4;
        } else {
            c0Var2 = c0VarR;
            c0Var2.u();
            a0Var3 = a0Var2;
            z13 = z11;
            r4Var2 = r4VarA;
            jVar3 = jVar2;
        }
        s5VarT = c0Var2.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.y4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return b5.t(aVar, function0, a0Var3, z13, r4Var2, jVar3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x012d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:103:0x012f  */
    /* JADX WARN: Code duplicated, block: B:104:0x0132  */
    /* JADX WARN: Code duplicated, block: B:106:0x0135  */
    /* JADX WARN: Code duplicated, block: B:109:0x013b  */
    /* JADX WARN: Code duplicated, block: B:111:0x0145  */
    /* JADX WARN: Code duplicated, block: B:113:0x014b  */
    /* JADX WARN: Code duplicated, block: B:116:0x0158  */
    /* JADX WARN: Code duplicated, block: B:118:0x0163  */
    /* JADX WARN: Code duplicated, block: B:119:0x0196  */
    /* JADX WARN: Code duplicated, block: B:121:0x019b  */
    /* JADX WARN: Code duplicated, block: B:122:0x01a2  */
    /* JADX WARN: Code duplicated, block: B:125:0x01de  */
    /* JADX WARN: Code duplicated, block: B:128:0x01e9  */
    /* JADX WARN: Code duplicated, block: B:131:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:133:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:56:0x00a2  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a8  */
    /* JADX WARN: Code duplicated, block: B:60:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b5  */
    /* JADX WARN: Code duplicated, block: B:63:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c0  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c4  */
    /* JADX WARN: Code duplicated, block: B:71:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:72:0x00cf  */
    /* JADX WARN: Code duplicated, block: B:75:0x00d5  */
    /* JADX WARN: Code duplicated, block: B:78:0x00dd  */
    /* JADX WARN: Code duplicated, block: B:80:0x00e1  */
    /* JADX WARN: Code duplicated, block: B:82:0x00e4  */
    /* JADX WARN: Code duplicated, block: B:84:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:85:0x00ef  */
    /* JADX WARN: Code duplicated, block: B:89:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:90:0x0102  */
    /* JADX WARN: Code duplicated, block: B:93:0x010b  */
    /* JADX WARN: Code duplicated, block: B:95:0x0116  */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void s(@NotNull final v0.a aVar, @Nullable final Function0<Unit> function0, @NotNull final androidx.compose.ui.graphics.drawscope.n nVar, @NotNull final androidx.compose.ui.graphics.drawscope.n nVar2, @Nullable androidx.compose.ui.a0 a0Var, boolean z10, @Nullable r4 r4Var, @Nullable androidx.compose.foundation.interaction.j jVar, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        androidx.compose.ui.graphics.drawscope.n nVar3;
        androidx.compose.ui.a0 a0Var2;
        int i13;
        boolean z11;
        int i14;
        r4 r4VarA;
        int i15;
        androidx.compose.foundation.interaction.j jVar2;
        int i16;
        boolean z12;
        final androidx.compose.ui.a0 a0Var3;
        final boolean z13;
        final r4 r4Var2;
        final androidx.compose.foundation.interaction.j jVar3;
        androidx.compose.runtime.s5 s5VarT;
        androidx.compose.ui.a0 a0Var4;
        androidx.compose.ui.a0 a0Var5;
        androidx.compose.ui.a0 a0VarG;
        androidx.compose.ui.a0 a0VarJ;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-406243761);
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
        if ((i11 & 4) != 0) {
            i12 |= androidx.media3.exoplayer.a5.S0;
        } else if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
            i12 |= c0VarR.k0(nVar) ? 256 : 128;
        }
        if ((i11 & 8) != 0) {
            i12 |= 3072;
            nVar3 = nVar2;
        } else {
            nVar3 = nVar2;
            if ((i10 & 3072) == 0) {
                i12 |= c0VarR.k0(nVar3) ? 2048 : 1024;
            }
        }
        int i17 = i11 & 16;
        if (i17 == 0) {
            if ((i10 & 24576) == 0) {
                a0Var2 = a0Var;
                i12 |= c0VarR.D(a0Var2) ? 16384 : 8192;
            }
            i13 = i11 & 32;
            if (i13 != 0) {
                if ((196608 & i10) == 0) {
                    z11 = z10;
                    if (c0VarR.G(z11)) {
                        i14 = 131072;
                    } else {
                        i14 = 65536;
                    }
                    i12 |= i14;
                }
                if ((1572864 & i10) == 0) {
                    if ((i11 & 64) == 0) {
                        r4VarA = r4Var;
                        int i18 = c0VarR.D(r4VarA) ? 1048576 : 524288;
                        i12 |= i18;
                    } else {
                        r4VarA = r4Var;
                    }
                    i12 |= i18;
                } else {
                    r4VarA = r4Var;
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
                    if ((i12 & 4793491) != 4793490) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    if (c0VarR.h(z12, i12 & 1)) {
                        c0VarR.l0();
                        if ((i10 & 1) != 0 || c0VarR.y()) {
                            if (i17 != 0) {
                                a0Var4 = androidx.compose.ui.a0.E;
                            } else {
                                a0Var4 = a0Var2;
                            }
                            if (i13 != 0) {
                                z11 = true;
                            }
                            if ((i11 & 64) != 0) {
                                i12 &= -3670017;
                                r4VarA = s4.f32691a.a(c0VarR, 6);
                            }
                            if (i15 != 0) {
                                jVar2 = null;
                            } else {
                                jVar2 = jVar2;
                            }
                            a0Var5 = a0Var4;
                        } else {
                            c0VarR.u();
                            if ((i11 & 64) != 0) {
                                i12 &= -3670017;
                            }
                            i12 = i12;
                            z11 = z11;
                            jVar2 = jVar2;
                            a0Var5 = a0Var2;
                        }
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-406243761, i12, -1, "androidx.compose.material3.TriStateCheckbox (Checkbox.kt:275)");
                        }
                        if (function0 != null) {
                            boolean z14 = z11;
                            a0VarG = androidx.compose.foundation.selection.e.g(androidx.compose.ui.a0.E, aVar, jVar2, gt.e(false, androidx.compose.ui.unit.h.r(d0.q.f268665a.F() / 2), 0L, 4, null), z14, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.c()), function0);
                            z11 = z14;
                        } else {
                            a0VarG = androidx.compose.ui.a0.E;
                        }
                        if (function0 != null) {
                            a0VarJ = wi.j(androidx.compose.ui.a0.E);
                        } else {
                            a0VarJ = androidx.compose.ui.a0.E;
                        }
                        androidx.compose.ui.a0 a0VarR = androidx.compose.foundation.layout.d5.r(a0Var5.B2(a0VarJ).B2(a0VarG), f26198b);
                        int i19 = i12 << 6;
                        r4 r4Var3 = r4VarA;
                        o(z11, aVar, a0VarR, r4Var3, nVar, nVar3, c0VarR, ((i12 >> 15) & 14) | ((i12 << 3) & com.planner5d.library.engine.input.f.b.B) | ((i12 >> 9) & 7168) | (57344 & i19) | (i19 & 458752));
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        z13 = z11;
                        a0Var3 = a0Var5;
                        r4Var2 = r4Var3;
                    } else {
                        c0VarR.u();
                        a0Var3 = a0Var2;
                        z13 = z11;
                        r4Var2 = r4VarA;
                    }
                    jVar3 = jVar2;
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        s5VarT.a(new Function2() { // from class: androidx.compose.material3.v4
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return b5.u(aVar, function0, nVar, nVar2, a0Var3, z13, r4Var2, jVar3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i12 |= 12582912;
                jVar2 = jVar;
                if ((i12 & 4793491) != 4793490) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i17 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 64) != 0) {
                            i12 &= -3670017;
                            r4VarA = s4.f32691a.a(c0VarR, 6);
                        }
                        if (i15 != 0) {
                            jVar2 = null;
                        } else {
                            jVar2 = jVar2;
                        }
                        a0Var5 = a0Var4;
                    } else {
                        if (i17 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 64) != 0) {
                            i12 &= -3670017;
                            r4VarA = s4.f32691a.a(c0VarR, 6);
                        }
                        if (i15 != 0) {
                            jVar2 = null;
                        } else {
                            jVar2 = jVar2;
                        }
                        a0Var5 = a0Var4;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-406243761, i12, -1, "androidx.compose.material3.TriStateCheckbox (Checkbox.kt:275)");
                    }
                    if (function0 != null) {
                        boolean z15 = z11;
                        a0VarG = androidx.compose.foundation.selection.e.g(androidx.compose.ui.a0.E, aVar, jVar2, gt.e(false, androidx.compose.ui.unit.h.r(d0.q.f268665a.F() / 2), 0L, 4, null), z15, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.c()), function0);
                        z11 = z15;
                    } else {
                        a0VarG = androidx.compose.ui.a0.E;
                    }
                    if (function0 != null) {
                        a0VarJ = wi.j(androidx.compose.ui.a0.E);
                    } else {
                        a0VarJ = androidx.compose.ui.a0.E;
                    }
                    androidx.compose.ui.a0 a0VarR2 = androidx.compose.foundation.layout.d5.r(a0Var5.B2(a0VarJ).B2(a0VarG), f26198b);
                    int i110 = i12 << 6;
                    r4 r4Var4 = r4VarA;
                    o(z11, aVar, a0VarR2, r4Var4, nVar, nVar3, c0VarR, ((i12 >> 15) & 14) | ((i12 << 3) & com.planner5d.library.engine.input.f.b.B) | ((i12 >> 9) & 7168) | (57344 & i110) | (i110 & 458752));
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    z13 = z11;
                    a0Var3 = a0Var5;
                    r4Var2 = r4Var4;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    z13 = z11;
                    r4Var2 = r4VarA;
                }
                jVar3 = jVar2;
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.v4
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return b5.u(aVar, function0, nVar, nVar2, a0Var3, z13, r4Var2, jVar3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= androidx.profileinstaller.n.c.f73814m;
            z11 = z10;
            if ((1572864 & i10) == 0) {
                if ((i11 & 64) == 0) {
                    r4VarA = r4Var;
                    if (c0VarR.D(r4VarA)) {
                    }
                    i12 |= i18;
                } else {
                    r4VarA = r4Var;
                }
                i12 |= i18;
            } else {
                r4VarA = r4Var;
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
                if ((i12 & 4793491) != 4793490) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i17 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 64) != 0) {
                            i12 &= -3670017;
                            r4VarA = s4.f32691a.a(c0VarR, 6);
                        }
                        if (i15 != 0) {
                            jVar2 = null;
                        } else {
                            jVar2 = jVar2;
                        }
                        a0Var5 = a0Var4;
                    } else {
                        if (i17 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 64) != 0) {
                            i12 &= -3670017;
                            r4VarA = s4.f32691a.a(c0VarR, 6);
                        }
                        if (i15 != 0) {
                            jVar2 = null;
                        } else {
                            jVar2 = jVar2;
                        }
                        a0Var5 = a0Var4;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-406243761, i12, -1, "androidx.compose.material3.TriStateCheckbox (Checkbox.kt:275)");
                    }
                    if (function0 != null) {
                        boolean z16 = z11;
                        a0VarG = androidx.compose.foundation.selection.e.g(androidx.compose.ui.a0.E, aVar, jVar2, gt.e(false, androidx.compose.ui.unit.h.r(d0.q.f268665a.F() / 2), 0L, 4, null), z16, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.c()), function0);
                        z11 = z16;
                    } else {
                        a0VarG = androidx.compose.ui.a0.E;
                    }
                    if (function0 != null) {
                        a0VarJ = wi.j(androidx.compose.ui.a0.E);
                    } else {
                        a0VarJ = androidx.compose.ui.a0.E;
                    }
                    androidx.compose.ui.a0 a0VarR3 = androidx.compose.foundation.layout.d5.r(a0Var5.B2(a0VarJ).B2(a0VarG), f26198b);
                    int i111 = i12 << 6;
                    r4 r4Var5 = r4VarA;
                    o(z11, aVar, a0VarR3, r4Var5, nVar, nVar3, c0VarR, ((i12 >> 15) & 14) | ((i12 << 3) & com.planner5d.library.engine.input.f.b.B) | ((i12 >> 9) & 7168) | (57344 & i111) | (i111 & 458752));
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    z13 = z11;
                    a0Var3 = a0Var5;
                    r4Var2 = r4Var5;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    z13 = z11;
                    r4Var2 = r4VarA;
                }
                jVar3 = jVar2;
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.v4
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return b5.u(aVar, function0, nVar, nVar2, a0Var3, z13, r4Var2, jVar3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 12582912;
            jVar2 = jVar;
            if ((i12 & 4793491) != 4793490) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i17 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 64) != 0) {
                        i12 &= -3670017;
                        r4VarA = s4.f32691a.a(c0VarR, 6);
                    }
                    if (i15 != 0) {
                        jVar2 = null;
                    } else {
                        jVar2 = jVar2;
                    }
                    a0Var5 = a0Var4;
                } else {
                    if (i17 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 64) != 0) {
                        i12 &= -3670017;
                        r4VarA = s4.f32691a.a(c0VarR, 6);
                    }
                    if (i15 != 0) {
                        jVar2 = null;
                    } else {
                        jVar2 = jVar2;
                    }
                    a0Var5 = a0Var4;
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-406243761, i12, -1, "androidx.compose.material3.TriStateCheckbox (Checkbox.kt:275)");
                }
                if (function0 != null) {
                    boolean z17 = z11;
                    a0VarG = androidx.compose.foundation.selection.e.g(androidx.compose.ui.a0.E, aVar, jVar2, gt.e(false, androidx.compose.ui.unit.h.r(d0.q.f268665a.F() / 2), 0L, 4, null), z17, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.c()), function0);
                    z11 = z17;
                } else {
                    a0VarG = androidx.compose.ui.a0.E;
                }
                if (function0 != null) {
                    a0VarJ = wi.j(androidx.compose.ui.a0.E);
                } else {
                    a0VarJ = androidx.compose.ui.a0.E;
                }
                androidx.compose.ui.a0 a0VarR4 = androidx.compose.foundation.layout.d5.r(a0Var5.B2(a0VarJ).B2(a0VarG), f26198b);
                int i112 = i12 << 6;
                r4 r4Var6 = r4VarA;
                o(z11, aVar, a0VarR4, r4Var6, nVar, nVar3, c0VarR, ((i12 >> 15) & 14) | ((i12 << 3) & com.planner5d.library.engine.input.f.b.B) | ((i12 >> 9) & 7168) | (57344 & i112) | (i112 & 458752));
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                z13 = z11;
                a0Var3 = a0Var5;
                r4Var2 = r4Var6;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                z13 = z11;
                r4Var2 = r4VarA;
            }
            jVar3 = jVar2;
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.v4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return b5.u(aVar, function0, nVar, nVar2, a0Var3, z13, r4Var2, jVar3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 24576;
        a0Var2 = a0Var;
        i13 = i11 & 32;
        if (i13 != 0) {
            if ((196608 & i10) == 0) {
                z11 = z10;
                if (c0VarR.G(z11)) {
                    i14 = 131072;
                } else {
                    i14 = 65536;
                }
                i12 |= i14;
            }
            if ((1572864 & i10) == 0) {
                if ((i11 & 64) == 0) {
                    r4VarA = r4Var;
                    if (c0VarR.D(r4VarA)) {
                    }
                    i12 |= i18;
                } else {
                    r4VarA = r4Var;
                }
                i12 |= i18;
            } else {
                r4VarA = r4Var;
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
                if ((i12 & 4793491) != 4793490) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                if (c0VarR.h(z12, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0) {
                        if (i17 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 64) != 0) {
                            i12 &= -3670017;
                            r4VarA = s4.f32691a.a(c0VarR, 6);
                        }
                        if (i15 != 0) {
                            jVar2 = null;
                        } else {
                            jVar2 = jVar2;
                        }
                        a0Var5 = a0Var4;
                    } else {
                        if (i17 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if (i13 != 0) {
                            z11 = true;
                        }
                        if ((i11 & 64) != 0) {
                            i12 &= -3670017;
                            r4VarA = s4.f32691a.a(c0VarR, 6);
                        }
                        if (i15 != 0) {
                            jVar2 = null;
                        } else {
                            jVar2 = jVar2;
                        }
                        a0Var5 = a0Var4;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-406243761, i12, -1, "androidx.compose.material3.TriStateCheckbox (Checkbox.kt:275)");
                    }
                    if (function0 != null) {
                        boolean z18 = z11;
                        a0VarG = androidx.compose.foundation.selection.e.g(androidx.compose.ui.a0.E, aVar, jVar2, gt.e(false, androidx.compose.ui.unit.h.r(d0.q.f268665a.F() / 2), 0L, 4, null), z18, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.c()), function0);
                        z11 = z18;
                    } else {
                        a0VarG = androidx.compose.ui.a0.E;
                    }
                    if (function0 != null) {
                        a0VarJ = wi.j(androidx.compose.ui.a0.E);
                    } else {
                        a0VarJ = androidx.compose.ui.a0.E;
                    }
                    androidx.compose.ui.a0 a0VarR5 = androidx.compose.foundation.layout.d5.r(a0Var5.B2(a0VarJ).B2(a0VarG), f26198b);
                    int i113 = i12 << 6;
                    r4 r4Var7 = r4VarA;
                    o(z11, aVar, a0VarR5, r4Var7, nVar, nVar3, c0VarR, ((i12 >> 15) & 14) | ((i12 << 3) & com.planner5d.library.engine.input.f.b.B) | ((i12 >> 9) & 7168) | (57344 & i113) | (i113 & 458752));
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    z13 = z11;
                    a0Var3 = a0Var5;
                    r4Var2 = r4Var7;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    z13 = z11;
                    r4Var2 = r4VarA;
                }
                jVar3 = jVar2;
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material3.v4
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return b5.u(aVar, function0, nVar, nVar2, a0Var3, z13, r4Var2, jVar3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 12582912;
            jVar2 = jVar;
            if ((i12 & 4793491) != 4793490) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i17 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 64) != 0) {
                        i12 &= -3670017;
                        r4VarA = s4.f32691a.a(c0VarR, 6);
                    }
                    if (i15 != 0) {
                        jVar2 = null;
                    } else {
                        jVar2 = jVar2;
                    }
                    a0Var5 = a0Var4;
                } else {
                    if (i17 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 64) != 0) {
                        i12 &= -3670017;
                        r4VarA = s4.f32691a.a(c0VarR, 6);
                    }
                    if (i15 != 0) {
                        jVar2 = null;
                    } else {
                        jVar2 = jVar2;
                    }
                    a0Var5 = a0Var4;
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-406243761, i12, -1, "androidx.compose.material3.TriStateCheckbox (Checkbox.kt:275)");
                }
                if (function0 != null) {
                    boolean z19 = z11;
                    a0VarG = androidx.compose.foundation.selection.e.g(androidx.compose.ui.a0.E, aVar, jVar2, gt.e(false, androidx.compose.ui.unit.h.r(d0.q.f268665a.F() / 2), 0L, 4, null), z19, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.c()), function0);
                    z11 = z19;
                } else {
                    a0VarG = androidx.compose.ui.a0.E;
                }
                if (function0 != null) {
                    a0VarJ = wi.j(androidx.compose.ui.a0.E);
                } else {
                    a0VarJ = androidx.compose.ui.a0.E;
                }
                androidx.compose.ui.a0 a0VarR6 = androidx.compose.foundation.layout.d5.r(a0Var5.B2(a0VarJ).B2(a0VarG), f26198b);
                int i114 = i12 << 6;
                r4 r4Var8 = r4VarA;
                o(z11, aVar, a0VarR6, r4Var8, nVar, nVar3, c0VarR, ((i12 >> 15) & 14) | ((i12 << 3) & com.planner5d.library.engine.input.f.b.B) | ((i12 >> 9) & 7168) | (57344 & i114) | (i114 & 458752));
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                z13 = z11;
                a0Var3 = a0Var5;
                r4Var2 = r4Var8;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                z13 = z11;
                r4Var2 = r4VarA;
            }
            jVar3 = jVar2;
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.v4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return b5.u(aVar, function0, nVar, nVar2, a0Var3, z13, r4Var2, jVar3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= androidx.profileinstaller.n.c.f73814m;
        z11 = z10;
        if ((1572864 & i10) == 0) {
            if ((i11 & 64) == 0) {
                r4VarA = r4Var;
                if (c0VarR.D(r4VarA)) {
                }
                i12 |= i18;
            } else {
                r4VarA = r4Var;
            }
            i12 |= i18;
        } else {
            r4VarA = r4Var;
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
            if ((i12 & 4793491) != 4793490) {
                z12 = true;
            } else {
                z12 = false;
            }
            if (c0VarR.h(z12, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i17 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 64) != 0) {
                        i12 &= -3670017;
                        r4VarA = s4.f32691a.a(c0VarR, 6);
                    }
                    if (i15 != 0) {
                        jVar2 = null;
                    } else {
                        jVar2 = jVar2;
                    }
                    a0Var5 = a0Var4;
                } else {
                    if (i17 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if (i13 != 0) {
                        z11 = true;
                    }
                    if ((i11 & 64) != 0) {
                        i12 &= -3670017;
                        r4VarA = s4.f32691a.a(c0VarR, 6);
                    }
                    if (i15 != 0) {
                        jVar2 = null;
                    } else {
                        jVar2 = jVar2;
                    }
                    a0Var5 = a0Var4;
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-406243761, i12, -1, "androidx.compose.material3.TriStateCheckbox (Checkbox.kt:275)");
                }
                if (function0 != null) {
                    boolean z110 = z11;
                    a0VarG = androidx.compose.foundation.selection.e.g(androidx.compose.ui.a0.E, aVar, jVar2, gt.e(false, androidx.compose.ui.unit.h.r(d0.q.f268665a.F() / 2), 0L, 4, null), z110, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.c()), function0);
                    z11 = z110;
                } else {
                    a0VarG = androidx.compose.ui.a0.E;
                }
                if (function0 != null) {
                    a0VarJ = wi.j(androidx.compose.ui.a0.E);
                } else {
                    a0VarJ = androidx.compose.ui.a0.E;
                }
                androidx.compose.ui.a0 a0VarR7 = androidx.compose.foundation.layout.d5.r(a0Var5.B2(a0VarJ).B2(a0VarG), f26198b);
                int i115 = i12 << 6;
                r4 r4Var9 = r4VarA;
                o(z11, aVar, a0VarR7, r4Var9, nVar, nVar3, c0VarR, ((i12 >> 15) & 14) | ((i12 << 3) & com.planner5d.library.engine.input.f.b.B) | ((i12 >> 9) & 7168) | (57344 & i115) | (i115 & 458752));
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                z13 = z11;
                a0Var3 = a0Var5;
                r4Var2 = r4Var9;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                z13 = z11;
                r4Var2 = r4VarA;
            }
            jVar3 = jVar2;
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.v4
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return b5.u(aVar, function0, nVar, nVar2, a0Var3, z13, r4Var2, jVar3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 12582912;
        jVar2 = jVar;
        if ((i12 & 4793491) != 4793490) {
            z12 = true;
        } else {
            z12 = false;
        }
        if (c0VarR.h(z12, i12 & 1)) {
            c0VarR.l0();
            if ((i10 & 1) != 0) {
                if (i17 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if (i13 != 0) {
                    z11 = true;
                }
                if ((i11 & 64) != 0) {
                    i12 &= -3670017;
                    r4VarA = s4.f32691a.a(c0VarR, 6);
                }
                if (i15 != 0) {
                    jVar2 = null;
                } else {
                    jVar2 = jVar2;
                }
                a0Var5 = a0Var4;
            } else {
                if (i17 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if (i13 != 0) {
                    z11 = true;
                }
                if ((i11 & 64) != 0) {
                    i12 &= -3670017;
                    r4VarA = s4.f32691a.a(c0VarR, 6);
                }
                if (i15 != 0) {
                    jVar2 = null;
                } else {
                    jVar2 = jVar2;
                }
                a0Var5 = a0Var4;
            }
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-406243761, i12, -1, "androidx.compose.material3.TriStateCheckbox (Checkbox.kt:275)");
            }
            if (function0 != null) {
                boolean z111 = z11;
                a0VarG = androidx.compose.foundation.selection.e.g(androidx.compose.ui.a0.E, aVar, jVar2, gt.e(false, androidx.compose.ui.unit.h.r(d0.q.f268665a.F() / 2), 0L, 4, null), z111, androidx.compose.ui.semantics.j.j(androidx.compose.ui.semantics.j.f41124b.c()), function0);
                z11 = z111;
            } else {
                a0VarG = androidx.compose.ui.a0.E;
            }
            if (function0 != null) {
                a0VarJ = wi.j(androidx.compose.ui.a0.E);
            } else {
                a0VarJ = androidx.compose.ui.a0.E;
            }
            androidx.compose.ui.a0 a0VarR8 = androidx.compose.foundation.layout.d5.r(a0Var5.B2(a0VarJ).B2(a0VarG), f26198b);
            int i116 = i12 << 6;
            r4 r4Var10 = r4VarA;
            o(z11, aVar, a0VarR8, r4Var10, nVar, nVar3, c0VarR, ((i12 >> 15) & 14) | ((i12 << 3) & com.planner5d.library.engine.input.f.b.B) | ((i12 >> 9) & 7168) | (57344 & i116) | (i116 & 458752));
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            z13 = z11;
            a0Var3 = a0Var5;
            r4Var2 = r4Var10;
        } else {
            c0VarR.u();
            a0Var3 = a0Var2;
            z13 = z11;
            r4Var2 = r4VarA;
        }
        jVar3 = jVar2;
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.v4
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return b5.u(aVar, function0, nVar, nVar2, a0Var3, z13, r4Var2, jVar3, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit t(v0.a aVar, Function0 function0, androidx.compose.ui.a0 a0Var, boolean z10, r4 r4Var, androidx.compose.foundation.interaction.j jVar, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        r(aVar, function0, a0Var, z10, r4Var, jVar, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit u(v0.a aVar, Function0 function0, androidx.compose.ui.graphics.drawscope.n nVar, androidx.compose.ui.graphics.drawscope.n nVar2, androidx.compose.ui.a0 a0Var, boolean z10, r4 r4Var, androidx.compose.foundation.interaction.j jVar, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        s(aVar, function0, nVar, nVar2, a0Var, z10, r4Var, jVar, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    private static final void v(androidx.compose.ui.graphics.drawscope.f fVar, long j10, long j11, float f10, androidx.compose.ui.graphics.drawscope.n nVar) {
        float fG = nVar.g() / 2.0f;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (fVar.d() >> 32));
        if (androidx.compose.ui.graphics.q0.y(j10, j11)) {
            androidx.compose.ui.graphics.drawscope.f.y8(fVar, j10, 0L, n0.n.f((((long) Float.floatToRawIntBits(fIntBitsToFloat)) & com.rabbitmq.client.k0.f265952a) | (Float.floatToRawIntBits(fIntBitsToFloat) << 32)), n0.a.e((((long) Float.floatToRawIntBits(f10)) << 32) | (((long) Float.floatToRawIntBits(f10)) & com.rabbitmq.client.k0.f265952a)), androidx.compose.ui.graphics.drawscope.m.f37744a, 0.0f, null, 0, 226, null);
            return;
        }
        long jG = n0.g.g((((long) Float.floatToRawIntBits(nVar.g())) << 32) | (((long) Float.floatToRawIntBits(nVar.g())) & com.rabbitmq.client.k0.f265952a));
        float f11 = 2;
        long jF = n0.n.f((((long) Float.floatToRawIntBits(fIntBitsToFloat - (nVar.g() * f11))) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat - (nVar.g() * f11))) & com.rabbitmq.client.k0.f265952a));
        float fMax = Math.max(0.0f, f10 - nVar.g());
        androidx.compose.ui.graphics.drawscope.f.y8(fVar, j10, jG, jF, n0.a.e((((long) Float.floatToRawIntBits(fMax)) << 32) | (((long) Float.floatToRawIntBits(fMax)) & com.rabbitmq.client.k0.f265952a)), androidx.compose.ui.graphics.drawscope.m.f37744a, 0.0f, null, 0, 224, null);
        long jG2 = n0.g.g((((long) Float.floatToRawIntBits(fG)) << 32) | (((long) Float.floatToRawIntBits(fG)) & com.rabbitmq.client.k0.f265952a));
        float fG2 = fIntBitsToFloat - nVar.g();
        float f12 = f10 - fG;
        androidx.compose.ui.graphics.drawscope.f.y8(fVar, j11, jG2, n0.n.f((((long) Float.floatToRawIntBits(fIntBitsToFloat - nVar.g())) & com.rabbitmq.client.k0.f265952a) | (Float.floatToRawIntBits(fG2) << 32)), n0.a.e((((long) Float.floatToRawIntBits(f12)) << 32) | (((long) Float.floatToRawIntBits(f12)) & com.rabbitmq.client.k0.f265952a)), nVar, 0.0f, null, 0, 224, null);
    }

    private static final void w(androidx.compose.ui.graphics.drawscope.f fVar, long j10, float f10, float f11, androidx.compose.ui.graphics.drawscope.n nVar, q4 q4Var) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (fVar.d() >> 32));
        float fR = androidx.compose.ui.util.e.r(0.4f, 0.5f, f11);
        float fR2 = androidx.compose.ui.util.e.r(0.7f, 0.5f, f11);
        float fR3 = androidx.compose.ui.util.e.r(0.5f, 0.5f, f11);
        float fR4 = androidx.compose.ui.util.e.r(0.3f, 0.5f, f11);
        q4Var.a().P();
        q4Var.a().A(0.2f * fIntBitsToFloat, fR3 * fIntBitsToFloat);
        q4Var.a().F(fR * fIntBitsToFloat, fR2 * fIntBitsToFloat);
        q4Var.a().F(0.8f * fIntBitsToFloat, fIntBitsToFloat * fR4);
        q4Var.b().d(q4Var.a(), false);
        q4Var.c().P();
        q4Var.b().b(0.0f, q4Var.b().getLength() * f10, q4Var.c(), true);
        androidx.compose.ui.graphics.drawscope.f.K1(fVar, q4Var.c(), j10, 0.0f, nVar, null, 0, 52, null);
    }
}

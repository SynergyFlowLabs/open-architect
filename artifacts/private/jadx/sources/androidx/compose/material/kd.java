package androidx.compose.material;

import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nProgressIndicator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 ProgressIndicator.kt\nandroidx/compose/material/ProgressIndicatorKt\n+ 2 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 3 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n+ 4 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 5 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 6 Size.kt\nandroidx/compose/ui/geometry/Size\n+ 7 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 8 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 9 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 10 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 11 Size.kt\nandroidx/compose/ui/geometry/SizeKt\n+ 12 Dp.kt\nandroidx/compose/ui/unit/Dp\n+ 13 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,608:1\n113#2:609\n113#2:740\n113#2:741\n65#3,10:610\n65#3,10:675\n1#4:620\n1282#5,6:621\n1282#5,6:627\n1282#5,6:633\n1282#5,6:639\n1282#5,6:645\n1282#5,6:651\n1282#5,6:686\n1282#5,6:693\n1282#5,6:699\n1282#5,6:705\n57#6:657\n61#6:660\n57#6:711\n61#6:726\n61#6:733\n60#7:658\n70#7:661\n53#7,3:664\n53#7,3:668\n53#7,3:672\n60#7:712\n53#7,3:715\n53#7,3:719\n70#7:727\n70#7:734\n22#8:659\n22#8:662\n22#8:713\n22#8:728\n22#8:735\n30#9:663\n30#9:667\n30#9:671\n30#9:714\n75#10:685\n75#10:692\n33#11:718\n60#12,4:722\n85#13:729\n85#13:730\n85#13:731\n85#13:732\n85#13:736\n85#13:737\n85#13:738\n85#13:739\n*S KotlinDebug\n*F\n+ 1 ProgressIndicator.kt\nandroidx/compose/material/ProgressIndicatorKt\n*L\n58#1:609\n551#1:740\n555#1:741\n110#1:610,10\n315#1:675,10\n116#1:621,6\n156#1:627,6\n169#1:633,6\n182#1:639,6\n195#1:645,6\n207#1:651,6\n321#1:686,6\n388#1:693,6\n402#1:699,6\n409#1:705,6\n243#1:657\n244#1:660\n464#1:711\n117#1:726\n208#1:733\n243#1:658\n244#1:661\n255#1:664,3\n267#1:668,3\n268#1:672,3\n464#1:712\n470#1:715,3\n471#1:719,3\n117#1:727\n208#1:734\n243#1:659\n244#1:662\n464#1:713\n117#1:728\n208#1:735\n255#1:663\n267#1:667\n268#1:671\n470#1:714\n316#1:685\n355#1:692\n471#1:718\n533#1:722,4\n151#1:729\n164#1:730\n177#1:731\n190#1:732\n360#1:736\n374#1:737\n383#1:738\n397#1:739\n*E\n"})
public final class kd {

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    private static final int f23521d = 1800;

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final int f23522e = 750;

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final int f23523f = 850;

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final int f23524g = 567;

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final int f23525h = 533;

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final int f23526i = 0;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final int f23527j = 333;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final int f23528k = 1000;

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    private static final int f23529l = 1267;

    /* JADX INFO: renamed from: q, reason: collision with root package name */
    private static final int f23534q = 5;

    /* JADX INFO: renamed from: r, reason: collision with root package name */
    private static final int f23535r = 1332;

    /* JADX INFO: renamed from: s, reason: collision with root package name */
    private static final float f23536s = -90.0f;

    /* JADX INFO: renamed from: t, reason: collision with root package name */
    private static final float f23537t = 286.0f;

    /* JADX INFO: renamed from: u, reason: collision with root package name */
    private static final float f23538u = 290.0f;

    /* JADX INFO: renamed from: v, reason: collision with root package name */
    private static final float f23539v = 216.0f;

    /* JADX INFO: renamed from: w, reason: collision with root package name */
    private static final int f23540w = 666;

    /* JADX INFO: renamed from: x, reason: collision with root package name */
    private static final int f23541x = 666;

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final float f23518a = oc.f24062a.b();

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f23519b = androidx.compose.ui.unit.h.r(240);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f23520c = androidx.compose.ui.unit.h.r(40);

    /* JADX INFO: renamed from: m, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.animation.core.e0 f23530m = new androidx.compose.animation.core.e0(0.2f, 0.0f, 0.8f, 1.0f);

    /* JADX INFO: renamed from: n, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.animation.core.e0 f23531n = new androidx.compose.animation.core.e0(0.4f, 0.0f, 1.0f, 1.0f);

    /* JADX INFO: renamed from: o, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.animation.core.e0 f23532o = new androidx.compose.animation.core.e0(0.0f, 0.0f, 0.65f, 1.0f);

    /* JADX INFO: renamed from: p, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.animation.core.e0 f23533p = new androidx.compose.animation.core.e0(0.1f, 0.0f, 0.45f, 1.0f);

    /* JADX INFO: renamed from: y, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.animation.core.e0 f23542y = new androidx.compose.animation.core.e0(0.4f, 0.0f, 0.2f, 1.0f);

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit A(float f10, androidx.compose.ui.a0 a0Var, long j10, float f11, long j11, int i10, int i11, int i12, androidx.compose.runtime.c0 c0Var, int i13) {
        v(f10, a0Var, j10, f11, j11, i10, c0Var, androidx.compose.runtime.t4.a(i11 | 1), i12);
        return Unit.f312394a;
    }

    private static final int B(androidx.compose.runtime.n7<Integer> n7Var) {
        return n7Var.getValue().intValue();
    }

    private static final float C(androidx.compose.runtime.n7<Float> n7Var) {
        return n7Var.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit D(androidx.compose.animation.core.q1.b bVar) {
        bVar.h(f23535r);
        int i10 = 2 >> 0;
        bVar.i(bVar.a(Float.valueOf(0.0f), 0), f23542y);
        bVar.a(Float.valueOf(f23538u), com.planner5d.library.widget.editor.editor2d.drawable.c.f254878a);
        return Unit.f312394a;
    }

    private static final float E(androidx.compose.runtime.n7<Float> n7Var) {
        return n7Var.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit F(androidx.compose.animation.core.q1.b bVar) {
        bVar.h(f23535r);
        bVar.i(bVar.a(Float.valueOf(0.0f), com.planner5d.library.widget.editor.editor2d.drawable.c.f254878a), f23542y);
        bVar.a(Float.valueOf(f23538u), bVar.e());
        return Unit.f312394a;
    }

    private static final float G(androidx.compose.runtime.n7<Float> n7Var) {
        return n7Var.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit H(long j10, androidx.compose.ui.graphics.drawscope.n nVar, float f10, long j11, androidx.compose.runtime.n7 n7Var, androidx.compose.runtime.n7 n7Var2, androidx.compose.runtime.n7 n7Var3, androidx.compose.runtime.n7 n7Var4, androidx.compose.ui.graphics.drawscope.f fVar) {
        e0(fVar, j10, nVar);
        g0(fVar, G(n7Var3) + ((B(n7Var) * f23539v) % 360.0f) + f23536s + C(n7Var4), f10, Math.abs(E(n7Var2) - G(n7Var3)), j11, nVar);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit I(androidx.compose.ui.a0 a0Var, long j10, float f10, long j11, int i10, int i11, int i12, androidx.compose.runtime.c0 c0Var, int i13) {
        w(a0Var, j10, f10, j11, i10, c0Var, androidx.compose.runtime.t4.a(i11 | 1), i12);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit J(float f10, androidx.compose.ui.a0 a0Var, long j10, float f11, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        x(f10, a0Var, j10, f11, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit K(androidx.compose.ui.a0 a0Var, long j10, float f10, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        y(a0Var, j10, f10, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void L(@Nullable androidx.compose.ui.a0 a0Var, long j10, long j11, int i10, @Nullable androidx.compose.runtime.c0 c0Var, final int i11, final int i12) {
        androidx.compose.ui.a0 a0Var2;
        int i13;
        long j12;
        long j13;
        int iA;
        final androidx.compose.ui.a0 a0Var3;
        final int i14;
        final long j14;
        final long j15;
        androidx.compose.ui.a0 a0Var4;
        long jW;
        int i15;
        long j16;
        long j17;
        final long j18;
        final int i16;
        final long j19;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1501635280);
        int i17 = i12 & 1;
        if (i17 != 0) {
            i13 = i11 | 6;
            a0Var2 = a0Var;
        } else if ((i11 & 6) == 0) {
            a0Var2 = a0Var;
            i13 = (c0VarR.D(a0Var2) ? 4 : 2) | i11;
        } else {
            a0Var2 = a0Var;
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            j12 = j10;
            i13 |= ((i12 & 2) == 0 && c0VarR.L(j12)) ? 32 : 16;
        } else {
            j12 = j10;
        }
        if ((i11 & androidx.media3.exoplayer.a5.S0) == 0) {
            j13 = j11;
            i13 |= ((i12 & 4) == 0 && c0VarR.L(j13)) ? 256 : 128;
        } else {
            j13 = j11;
        }
        if ((i11 & 3072) == 0) {
            if ((i12 & 8) == 0) {
                iA = i10;
                int i18 = c0VarR.K(iA) ? 2048 : 1024;
                i13 |= i18;
            } else {
                iA = i10;
            }
            i13 |= i18;
        } else {
            iA = i10;
        }
        if (c0VarR.h((i13 & 1171) != 1170, i13 & 1)) {
            c0VarR.l0();
            if ((i11 & 1) == 0 || c0VarR.y()) {
                a0Var4 = i17 != 0 ? androidx.compose.ui.a0.E : a0Var2;
                if ((i12 & 2) != 0) {
                    j12 = x9.f25488a.a(c0VarR, 6).j();
                    i13 &= -113;
                }
                long j20 = j12;
                if ((i12 & 4) != 0) {
                    jW = androidx.compose.ui.graphics.q0.w(j20, 0.24f, 0.0f, 0.0f, 0.0f, 14, null);
                    i13 &= -897;
                } else {
                    jW = j13;
                }
                if ((i12 & 8) != 0) {
                    i13 &= -7169;
                    iA = androidx.compose.ui.graphics.u3.f38256b.a();
                }
                long j21 = jW;
                i15 = i13;
                j16 = j20;
                j17 = j21;
            } else {
                c0VarR.u();
                if ((i12 & 2) != 0) {
                    i13 &= -113;
                }
                if ((i12 & 4) != 0) {
                    i13 &= -897;
                }
                if ((i12 & 8) != 0) {
                    i13 &= -7169;
                }
                a0Var4 = a0Var2;
                j17 = j13;
                long j22 = j12;
                i15 = i13;
                j16 = j22;
            }
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1501635280, i15, -1, "androidx.compose.material.LinearProgressIndicator (ProgressIndicator.kt:144)");
            }
            androidx.compose.animation.core.i1 i1VarJ = androidx.compose.animation.core.n1.j(null, c0VarR, 0, 1);
            Object objI0 = c0VarR.i0();
            androidx.compose.runtime.c0.a aVar = androidx.compose.runtime.c0.f35327a;
            if (objI0 == aVar.a()) {
                objI0 = new Function1() { // from class: androidx.compose.material.sc
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return kd.X((androidx.compose.animation.core.q1.b) obj);
                    }
                };
                c0VarR.Y(objI0);
            }
            androidx.compose.animation.core.g1 g1VarG = androidx.compose.animation.core.p.g(androidx.compose.animation.core.p.h((Function1) objI0), null, 0L, 6, null);
            int i19 = androidx.compose.animation.core.i1.f13005f;
            int i20 = androidx.compose.animation.core.g1.f12967d;
            int i21 = i15;
            androidx.compose.ui.a0 a0Var5 = a0Var4;
            long j23 = j17;
            final androidx.compose.runtime.n7<Float> n7VarD = androidx.compose.animation.core.n1.d(i1VarJ, 0.0f, 1.0f, g1VarG, null, c0VarR, (i20 << 9) | i19 | 432, 8);
            Object objI1 = c0VarR.i0();
            if (objI1 == aVar.a()) {
                objI1 = new Function1() { // from class: androidx.compose.material.tc
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return kd.P((androidx.compose.animation.core.q1.b) obj);
                    }
                };
                c0VarR.Y(objI1);
            }
            final androidx.compose.runtime.n7<Float> n7VarD2 = androidx.compose.animation.core.n1.d(i1VarJ, 0.0f, 1.0f, androidx.compose.animation.core.p.g(androidx.compose.animation.core.p.h((Function1) objI1), null, 0L, 6, null), null, c0VarR, i19 | 432 | (i20 << 9), 8);
            Object objI2 = c0VarR.i0();
            if (objI2 == aVar.a()) {
                objI2 = new Function1() { // from class: androidx.compose.material.uc
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return kd.R((androidx.compose.animation.core.q1.b) obj);
                    }
                };
                c0VarR.Y(objI2);
            }
            final androidx.compose.runtime.n7<Float> n7VarD3 = androidx.compose.animation.core.n1.d(i1VarJ, 0.0f, 1.0f, androidx.compose.animation.core.p.g(androidx.compose.animation.core.p.h((Function1) objI2), null, 0L, 6, null), null, c0VarR, i19 | 432 | (i20 << 9), 8);
            Object objI3 = c0VarR.i0();
            if (objI3 == aVar.a()) {
                objI3 = new Function1() { // from class: androidx.compose.material.vc
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return kd.T((androidx.compose.animation.core.q1.b) obj);
                    }
                };
                c0VarR.Y(objI3);
            }
            final androidx.compose.runtime.n7<Float> n7VarD4 = androidx.compose.animation.core.n1.d(i1VarJ, 0.0f, 1.0f, androidx.compose.animation.core.p.g(androidx.compose.animation.core.p.h((Function1) objI3), null, 0L, 6, null), null, c0VarR, i19 | 432 | (i20 << 9), 8);
            androidx.compose.ui.a0 a0VarY = androidx.compose.foundation.layout.i6.y(androidx.compose.foundation.m4.c(j0(a0Var5)), f23519b, f23518a);
            boolean zD = ((((i21 & 7168) ^ 3072) > 2048 && c0VarR.K(iA)) || (i21 & 3072) == 2048) | ((((i21 & 896) ^ androidx.media3.exoplayer.a5.S0) > 256 && c0VarR.L(j23)) || (i21 & androidx.media3.exoplayer.a5.S0) == 256) | c0VarR.D(n7VarD) | c0VarR.D(n7VarD2) | ((((i21 & com.planner5d.library.engine.input.f.b.B) ^ 48) > 32 && c0VarR.L(j16)) || (i21 & 48) == 32) | c0VarR.D(n7VarD3) | c0VarR.D(n7VarD4);
            Object objI4 = c0VarR.i0();
            if (zD || objI4 == aVar.a()) {
                j18 = j16;
                i16 = iA;
                j19 = j23;
                objI4 = new Function1() { // from class: androidx.compose.material.wc
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return kd.V(j19, i16, j18, n7VarD, n7VarD2, n7VarD3, n7VarD4, (androidx.compose.ui.graphics.drawscope.f) obj);
                    }
                };
                c0VarR.Y(objI4);
            } else {
                j18 = j16;
                i16 = iA;
                j19 = j23;
            }
            androidx.compose.foundation.f1.e(a0VarY, (Function1) objI4, c0VarR, 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            a0Var3 = a0Var5;
            j15 = j19;
            i14 = i16;
            j14 = j18;
        } else {
            c0VarR.u();
            a0Var3 = a0Var2;
            i14 = iA;
            j14 = j12;
            j15 = j13;
        }
        androidx.compose.runtime.s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material.xc
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return kd.W(a0Var3, j14, j15, i14, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    @androidx.compose.runtime.o
    @kotlin.l(level = kotlin.n.HIDDEN, message = "Maintained for binary compatibility")
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final /* synthetic */ void M(androidx.compose.ui.a0 a0Var, long j10, long j11, androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        androidx.compose.ui.a0 a0Var2;
        int i12;
        long j12;
        long j13;
        final androidx.compose.ui.a0 a0Var3;
        final long j14;
        final long j15;
        long jW;
        long j16;
        androidx.compose.ui.a0 a0Var4;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-819397058);
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
                j12 = j10;
                int i14 = c0VarR.L(j12) ? 32 : 16;
                i12 |= i14;
            } else {
                j12 = j10;
            }
            i12 |= i14;
        } else {
            j12 = j10;
        }
        if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
            if ((i11 & 4) == 0) {
                j13 = j11;
                int i15 = c0VarR.L(j13) ? 256 : 128;
                i12 |= i15;
            } else {
                j13 = j11;
            }
            i12 |= i15;
        } else {
            j13 = j11;
        }
        if (c0VarR.h((i12 & com.planner5d.library.engine.input.f.b.F1) != 146, i12 & 1)) {
            c0VarR.l0();
            if ((i10 & 1) == 0 || c0VarR.y()) {
                androidx.compose.ui.a0 a0Var5 = i13 != 0 ? androidx.compose.ui.a0.E : a0Var2;
                if ((i11 & 2) != 0) {
                    j12 = x9.f25488a.a(c0VarR, 6).j();
                    i12 &= -113;
                }
                long j17 = j12;
                if ((i11 & 4) != 0) {
                    i12 &= -897;
                    a0Var4 = a0Var5;
                    jW = androidx.compose.ui.graphics.q0.w(j17, 0.24f, 0.0f, 0.0f, 0.0f, 14, null);
                    j16 = j17;
                } else {
                    jW = j13;
                    j16 = j17;
                    a0Var4 = a0Var5;
                }
            } else {
                c0VarR.u();
                if ((i11 & 2) != 0) {
                    i12 &= -113;
                }
                if ((i11 & 4) != 0) {
                    i12 &= -897;
                }
                jW = j13;
                a0Var4 = a0Var2;
                j16 = j12;
            }
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-819397058, i12, -1, "androidx.compose.material.LinearProgressIndicator (ProgressIndicator.kt:233)");
            }
            L(a0Var4, j16, jW, androidx.compose.ui.graphics.u3.f38256b.a(), c0VarR, i12 & androidx.media3.exoplayer.analytics.b.f62802b0, 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            a0Var3 = a0Var4;
            j14 = j16;
            j15 = jW;
        } else {
            c0VarR.u();
            a0Var3 = a0Var2;
            j14 = j12;
            j15 = j13;
        }
        androidx.compose.runtime.s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material.rc
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return kd.Z(a0Var3, j14, j15, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:103:0x0142  */
    /* JADX WARN: Code duplicated, block: B:105:0x0145  */
    /* JADX WARN: Code duplicated, block: B:136:0x01ca  */
    /* JADX WARN: Code duplicated, block: B:139:0x01e7  */
    /* JADX WARN: Code duplicated, block: B:141:0x01ef  */
    /* JADX WARN: Code duplicated, block: B:144:0x01ff  */
    /* JADX WARN: Code duplicated, block: B:146:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0043  */
    /* JADX WARN: Code duplicated, block: B:31:0x0052  */
    /* JADX WARN: Code duplicated, block: B:33:0x0056  */
    /* JADX WARN: Code duplicated, block: B:36:0x005e  */
    /* JADX WARN: Code duplicated, block: B:41:0x006d  */
    /* JADX WARN: Code duplicated, block: B:43:0x0071  */
    /* JADX WARN: Code duplicated, block: B:46:0x0077  */
    /* JADX WARN: Code duplicated, block: B:48:0x007b  */
    /* JADX WARN: Code duplicated, block: B:50:0x0085  */
    /* JADX WARN: Code duplicated, block: B:51:0x0088  */
    /* JADX WARN: Code duplicated, block: B:54:0x0090  */
    /* JADX WARN: Code duplicated, block: B:57:0x009b  */
    /* JADX WARN: Code duplicated, block: B:58:0x009e  */
    /* JADX WARN: Code duplicated, block: B:61:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:76:0x00ce A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:77:0x00d0  */
    /* JADX WARN: Code duplicated, block: B:78:0x00d3  */
    /* JADX WARN: Code duplicated, block: B:81:0x00d8  */
    /* JADX WARN: Code duplicated, block: B:84:0x00eb  */
    /* JADX WARN: Code duplicated, block: B:85:0x00ff  */
    /* JADX WARN: Code duplicated, block: B:88:0x0104  */
    /* JADX WARN: Code duplicated, block: B:92:0x0119  */
    /* JADX WARN: Code duplicated, block: B:95:0x0124  */
    /* JADX WARN: Code duplicated, block: B:96:0x0126  */
    /* JADX WARN: Code duplicated, block: B:99:0x012e  */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void N(@androidx.annotation.x(from = 0.0d, to = 1.0d) final float f10, @Nullable androidx.compose.ui.a0 a0Var, long j10, long j11, int i10, @Nullable androidx.compose.runtime.c0 c0Var, final int i11, final int i12) {
        int i13;
        androidx.compose.ui.a0 a0Var2;
        long j12;
        long j13;
        int iA;
        boolean z10;
        boolean z11;
        androidx.compose.ui.a0 a0Var3;
        final int i14;
        final long j14;
        final long j15;
        androidx.compose.runtime.s5 s5VarT;
        long j16;
        long jW;
        float f11;
        Float fValueOf;
        boolean z12;
        Object objI0;
        final int i15;
        final long j17;
        int i16;
        int i17;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-531984864);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (c0VarR.I(f10) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i18 = i12 & 2;
        if (i18 == 0) {
            if ((i11 & 48) == 0) {
                a0Var2 = a0Var;
                i13 |= c0VarR.D(a0Var2) ? 32 : 16;
            }
            if ((i11 & androidx.media3.exoplayer.a5.S0) == 0) {
                j12 = j10;
                if ((i12 & 4) == 0 || !c0VarR.L(j12)) {
                    i17 = 128;
                } else {
                    i17 = 256;
                }
                i13 |= i17;
            } else {
                j12 = j10;
            }
            if ((i11 & 3072) == 0) {
                j13 = j11;
                if ((i12 & 8) == 0 || !c0VarR.L(j13)) {
                    i16 = 1024;
                } else {
                    i16 = 2048;
                }
                i13 |= i16;
            } else {
                j13 = j11;
            }
            if ((i11 & 24576) == 0) {
                if ((i12 & 16) == 0) {
                    iA = i10;
                    int i19 = c0VarR.K(iA) ? 16384 : 8192;
                    i13 |= i19;
                } else {
                    iA = i10;
                }
                i13 |= i19;
            } else {
                iA = i10;
            }
            z10 = true;
            if ((i13 & 9363) != 9362) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (c0VarR.h(z11, i13 & 1)) {
                c0VarR.l0();
                if ((i11 & 1) != 0 || c0VarR.y()) {
                    if (i18 != 0) {
                        a0Var3 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var3 = a0Var2;
                    }
                    if ((i12 & 4) != 0) {
                        j12 = x9.f25488a.a(c0VarR, 6).j();
                        i13 &= -897;
                    }
                    j16 = j12;
                    if ((i12 & 8) != 0) {
                        jW = androidx.compose.ui.graphics.q0.w(j16, 0.24f, 0.0f, 0.0f, 0.0f, 14, null);
                        i13 &= -7169;
                    } else {
                        jW = j13;
                    }
                    if ((i12 & 16) != 0) {
                        i13 &= -57345;
                        iA = androidx.compose.ui.graphics.u3.f38256b.a();
                    }
                    j13 = jW;
                    j12 = j16;
                } else {
                    c0VarR.u();
                    if ((i12 & 4) != 0) {
                        i13 &= -897;
                    }
                    if ((i12 & 8) != 0) {
                        i13 &= -7169;
                    }
                    if ((i12 & 16) != 0) {
                        i13 &= -57345;
                    }
                    a0Var3 = a0Var2;
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-531984864, i13, -1, "androidx.compose.material.LinearProgressIndicator (ProgressIndicator.kt:108)");
                }
                if (f10 < 0.0f) {
                    f11 = 0.0f;
                } else {
                    f11 = f10;
                }
                if (f11 > 1.0f) {
                    f11 = 1.0f;
                }
                androidx.compose.ui.a0 a0VarJ0 = j0(a0Var3);
                fValueOf = Float.valueOf(f11);
                if (Float.isNaN(fValueOf.floatValue())) {
                    fValueOf = null;
                }
                androidx.compose.ui.a0 a0VarY = androidx.compose.foundation.layout.i6.y(androidx.compose.foundation.m4.e(a0VarJ0, fValueOf != null ? fValueOf.floatValue() : 0.0f, null, 0, 6, null), f23519b, f23518a);
                boolean zI = ((((i13 & 7168) ^ 3072) <= 2048 && c0VarR.L(j13)) || (i13 & 3072) == 2048) | ((((57344 & i13) ^ 24576) <= 16384 && c0VarR.K(iA)) || (i13 & 24576) == 16384) | c0VarR.I(f11);
                if ((((i13 & 896) ^ androidx.media3.exoplayer.a5.S0) > 256 || !c0VarR.L(j12)) && (i13 & androidx.media3.exoplayer.a5.S0) != 256) {
                }
                z12 = zI | z10;
                objI0 = c0VarR.i0();
                if (!z12 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    final float f12 = f11;
                    i15 = iA;
                    j14 = j12;
                    j17 = j13;
                    objI0 = new Function1() { // from class: androidx.compose.material.zc
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return kd.a0(j17, i15, f12, j14, (androidx.compose.ui.graphics.drawscope.f) obj);
                        }
                    };
                    c0VarR.Y(objI0);
                } else {
                    i15 = iA;
                    j14 = j12;
                    j17 = j13;
                }
                androidx.compose.foundation.f1.e(a0VarY, (Function1) objI0, c0VarR, 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                j15 = j17;
                i14 = i15;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                i14 = iA;
                j14 = j12;
                j15 = j13;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                final androidx.compose.ui.a0 a0Var4 = a0Var3;
                final long j18 = j14;
                s5VarT.a(new Function2() { // from class: androidx.compose.material.bd
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return kd.b0(f10, a0Var4, j18, j15, i14, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= 48;
        a0Var2 = a0Var;
        if ((i11 & androidx.media3.exoplayer.a5.S0) == 0) {
            j12 = j10;
            if ((i12 & 4) == 0) {
                i17 = 128;
            } else {
                i17 = 128;
            }
            i13 |= i17;
        } else {
            j12 = j10;
        }
        if ((i11 & 3072) == 0) {
            j13 = j11;
            if ((i12 & 8) == 0) {
                i16 = 1024;
            } else {
                i16 = 1024;
            }
            i13 |= i16;
        } else {
            j13 = j11;
        }
        if ((i11 & 24576) == 0) {
            if ((i12 & 16) == 0) {
                iA = i10;
                if (c0VarR.K(iA)) {
                }
                i13 |= i19;
            } else {
                iA = i10;
            }
            i13 |= i19;
        } else {
            iA = i10;
        }
        z10 = true;
        if ((i13 & 9363) != 9362) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (c0VarR.h(z11, i13 & 1)) {
            c0VarR.l0();
            if ((i11 & 1) != 0) {
                if (i18 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if ((i12 & 4) != 0) {
                    j12 = x9.f25488a.a(c0VarR, 6).j();
                    i13 &= -897;
                }
                j16 = j12;
                if ((i12 & 8) != 0) {
                    jW = androidx.compose.ui.graphics.q0.w(j16, 0.24f, 0.0f, 0.0f, 0.0f, 14, null);
                    i13 &= -7169;
                } else {
                    jW = j13;
                }
                if ((i12 & 16) != 0) {
                    i13 &= -57345;
                    iA = androidx.compose.ui.graphics.u3.f38256b.a();
                }
                j13 = jW;
                j12 = j16;
            } else {
                if (i18 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if ((i12 & 4) != 0) {
                    j12 = x9.f25488a.a(c0VarR, 6).j();
                    i13 &= -897;
                }
                j16 = j12;
                if ((i12 & 8) != 0) {
                    jW = androidx.compose.ui.graphics.q0.w(j16, 0.24f, 0.0f, 0.0f, 0.0f, 14, null);
                    i13 &= -7169;
                } else {
                    jW = j13;
                }
                if ((i12 & 16) != 0) {
                    i13 &= -57345;
                    iA = androidx.compose.ui.graphics.u3.f38256b.a();
                }
                j13 = jW;
                j12 = j16;
            }
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-531984864, i13, -1, "androidx.compose.material.LinearProgressIndicator (ProgressIndicator.kt:108)");
            }
            if (f10 < 0.0f) {
                f11 = 0.0f;
            } else {
                f11 = f10;
            }
            if (f11 > 1.0f) {
                f11 = 1.0f;
            }
            androidx.compose.ui.a0 a0VarJ1 = j0(a0Var3);
            fValueOf = Float.valueOf(f11);
            if (Float.isNaN(fValueOf.floatValue())) {
                fValueOf = null;
            }
            androidx.compose.ui.a0 a0VarY2 = androidx.compose.foundation.layout.i6.y(androidx.compose.foundation.m4.e(a0VarJ1, fValueOf != null ? fValueOf.floatValue() : 0.0f, null, 0, 6, null), f23519b, f23518a);
            boolean zI2 = ((((i13 & 7168) ^ 3072) <= 2048 && c0VarR.L(j13)) || (i13 & 3072) == 2048) | ((((57344 & i13) ^ 24576) <= 16384 && c0VarR.K(iA)) || (i13 & 24576) == 16384) | c0VarR.I(f11);
            z10 = ((i13 & 896) ^ androidx.media3.exoplayer.a5.S0) > 256 ? false : false;
            z12 = zI2 | z10;
            objI0 = c0VarR.i0();
            if (z12) {
                final float f13 = f11;
                i15 = iA;
                j14 = j12;
                j17 = j13;
                objI0 = new Function1() { // from class: androidx.compose.material.zc
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return kd.a0(j17, i15, f13, j14, (androidx.compose.ui.graphics.drawscope.f) obj);
                    }
                };
                c0VarR.Y(objI0);
            } else {
                final float f14 = f11;
                i15 = iA;
                j14 = j12;
                j17 = j13;
                objI0 = new Function1() { // from class: androidx.compose.material.zc
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return kd.a0(j17, i15, f14, j14, (androidx.compose.ui.graphics.drawscope.f) obj);
                    }
                };
                c0VarR.Y(objI0);
            }
            androidx.compose.foundation.f1.e(a0VarY2, (Function1) objI0, c0VarR, 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            j15 = j17;
            i14 = i15;
        } else {
            c0VarR.u();
            a0Var3 = a0Var2;
            i14 = iA;
            j14 = j12;
            j15 = j13;
        }
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            final androidx.compose.ui.a0 a0Var5 = a0Var3;
            final long j19 = j14;
            s5VarT.a(new Function2() { // from class: androidx.compose.material.bd
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return kd.b0(f10, a0Var5, j19, j15, i14, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004c  */
    /* JADX WARN: Code duplicated, block: B:28:0x0050  */
    /* JADX WARN: Code duplicated, block: B:30:0x0058  */
    /* JADX WARN: Code duplicated, block: B:31:0x005b  */
    /* JADX WARN: Code duplicated, block: B:34:0x0061  */
    /* JADX WARN: Code duplicated, block: B:37:0x0067  */
    /* JADX WARN: Code duplicated, block: B:42:0x0076  */
    /* JADX WARN: Code duplicated, block: B:44:0x007a  */
    /* JADX WARN: Code duplicated, block: B:47:0x0082  */
    /* JADX WARN: Code duplicated, block: B:48:0x0084  */
    /* JADX WARN: Code duplicated, block: B:51:0x008d  */
    /* JADX WARN: Code duplicated, block: B:63:0x00ae A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:64:0x00b0  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:68:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c8  */
    /* JADX WARN: Code duplicated, block: B:72:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:73:0x00e6  */
    /* JADX WARN: Code duplicated, block: B:76:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:79:0x010e  */
    /* JADX WARN: Code duplicated, block: B:81:0x0116  */
    /* JADX WARN: Code duplicated, block: B:84:0x0122  */
    /* JADX WARN: Code duplicated, block: B:86:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.o
    @kotlin.l(level = kotlin.n.HIDDEN, message = "Maintained for binary compatibility")
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final /* synthetic */ void O(final float f10, androidx.compose.ui.a0 a0Var, long j10, long j11, androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        float f11;
        int i12;
        androidx.compose.ui.a0 a0Var2;
        long j12;
        long j13;
        boolean z10;
        final androidx.compose.ui.a0 a0Var3;
        final long j14;
        final long j15;
        androidx.compose.runtime.s5 s5VarT;
        androidx.compose.ui.a0 a0Var4;
        long j16;
        long jW;
        long j17;
        androidx.compose.ui.a0 a0Var5;
        int i13;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-850309746);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
            f11 = f10;
        } else {
            f11 = f10;
            if ((i10 & 6) == 0) {
                i12 = (c0VarR.I(f11) ? 4 : 2) | i10;
            } else {
                i12 = i10;
            }
        }
        int i14 = i11 & 2;
        if (i14 == 0) {
            if ((i10 & 48) == 0) {
                a0Var2 = a0Var;
                i12 |= c0VarR.D(a0Var2) ? 32 : 16;
            }
            if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                if ((i11 & 4) == 0) {
                    j12 = j10;
                    int i15 = c0VarR.L(j12) ? 256 : 128;
                    i12 |= i15;
                } else {
                    j12 = j10;
                }
                i12 |= i15;
            } else {
                j12 = j10;
            }
            if ((i10 & 3072) == 0) {
                j13 = j11;
                if ((i11 & 8) == 0 || !c0VarR.L(j13)) {
                    i13 = 1024;
                } else {
                    i13 = 2048;
                }
                i12 |= i13;
            } else {
                j13 = j11;
            }
            if ((i12 & 1171) != 1170) {
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
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                        j16 = x9.f25488a.a(c0VarR, 6).j();
                    } else {
                        j16 = j12;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        a0Var5 = a0Var4;
                        jW = androidx.compose.ui.graphics.q0.w(j16, 0.24f, 0.0f, 0.0f, 0.0f, 14, null);
                        j17 = j16;
                    } else {
                        jW = j13;
                        j17 = j16;
                        a0Var5 = a0Var4;
                    }
                } else {
                    c0VarR.u();
                    if ((i11 & 4) != 0) {
                        i12 &= -897;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                    }
                    jW = j13;
                    a0Var5 = a0Var2;
                    j17 = j12;
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-850309746, i12, -1, "androidx.compose.material.LinearProgressIndicator (ProgressIndicator.kt:225)");
                }
                N(f11, a0Var5, j17, jW, androidx.compose.ui.graphics.u3.f38256b.a(), c0VarR, i12 & 8190, 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var5;
                j14 = j17;
                j15 = jW;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                j14 = j12;
                j15 = j13;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material.pc
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return kd.c0(f10, a0Var3, j14, j15, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 48;
        a0Var2 = a0Var;
        if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
            if ((i11 & 4) == 0) {
                j12 = j10;
                if (c0VarR.L(j12)) {
                }
                i12 |= i15;
            } else {
                j12 = j10;
            }
            i12 |= i15;
        } else {
            j12 = j10;
        }
        if ((i10 & 3072) == 0) {
            j13 = j11;
            if ((i11 & 8) == 0) {
                i13 = 1024;
            } else {
                i13 = 1024;
            }
            i12 |= i13;
        } else {
            j13 = j11;
        }
        if ((i12 & 1171) != 1170) {
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
                if ((i11 & 4) != 0) {
                    i12 &= -897;
                    j16 = x9.f25488a.a(c0VarR, 6).j();
                } else {
                    j16 = j12;
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    a0Var5 = a0Var4;
                    jW = androidx.compose.ui.graphics.q0.w(j16, 0.24f, 0.0f, 0.0f, 0.0f, 14, null);
                    j17 = j16;
                } else {
                    jW = j13;
                    j17 = j16;
                    a0Var5 = a0Var4;
                }
            } else {
                if (i14 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if ((i11 & 4) != 0) {
                    i12 &= -897;
                    j16 = x9.f25488a.a(c0VarR, 6).j();
                } else {
                    j16 = j12;
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    a0Var5 = a0Var4;
                    jW = androidx.compose.ui.graphics.q0.w(j16, 0.24f, 0.0f, 0.0f, 0.0f, 14, null);
                    j17 = j16;
                } else {
                    jW = j13;
                    j17 = j16;
                    a0Var5 = a0Var4;
                }
            }
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-850309746, i12, -1, "androidx.compose.material.LinearProgressIndicator (ProgressIndicator.kt:225)");
            }
            N(f11, a0Var5, j17, jW, androidx.compose.ui.graphics.u3.f38256b.a(), c0VarR, i12 & 8190, 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            a0Var3 = a0Var5;
            j14 = j17;
            j15 = jW;
        } else {
            c0VarR.u();
            a0Var3 = a0Var2;
            j14 = j12;
            j15 = j13;
        }
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material.pc
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return kd.c0(f10, a0Var3, j14, j15, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit P(androidx.compose.animation.core.q1.b bVar) {
        bVar.h(f23521d);
        bVar.i(bVar.a(Float.valueOf(0.0f), f23527j), f23531n);
        bVar.a(Float.valueOf(1.0f), 1183);
        return Unit.f312394a;
    }

    private static final float Q(androidx.compose.runtime.n7<Float> n7Var) {
        return n7Var.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit R(androidx.compose.animation.core.q1.b bVar) {
        bVar.h(f23521d);
        bVar.i(bVar.a(Float.valueOf(0.0f), 1000), f23532o);
        bVar.a(Float.valueOf(1.0f), 1567);
        return Unit.f312394a;
    }

    private static final float S(androidx.compose.runtime.n7<Float> n7Var) {
        return n7Var.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit T(androidx.compose.animation.core.q1.b bVar) {
        bVar.h(f23521d);
        bVar.i(bVar.a(Float.valueOf(0.0f), f23529l), f23533p);
        bVar.a(Float.valueOf(1.0f), f23521d);
        return Unit.f312394a;
    }

    private static final float U(androidx.compose.runtime.n7<Float> n7Var) {
        return n7Var.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit V(long j10, int i10, long j11, androidx.compose.runtime.n7 n7Var, androidx.compose.runtime.n7 n7Var2, androidx.compose.runtime.n7 n7Var3, androidx.compose.runtime.n7 n7Var4, androidx.compose.ui.graphics.drawscope.f fVar) {
        int i11;
        androidx.compose.ui.graphics.drawscope.f fVar2;
        float f10;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (fVar.d() & com.rabbitmq.client.k0.f265952a));
        i0(fVar, j10, fIntBitsToFloat, i10);
        if (Y(n7Var) - Q(n7Var2) > 0.0f) {
            float fY = Y(n7Var);
            float fQ = Q(n7Var2);
            i11 = i10;
            f10 = fIntBitsToFloat;
            fVar2 = fVar;
            h0(fVar2, fY, fQ, j11, f10, i11);
        } else {
            i11 = i10;
            fVar2 = fVar;
            f10 = fIntBitsToFloat;
        }
        if (S(n7Var3) - U(n7Var4) > 0.0f) {
            h0(fVar2, S(n7Var3), U(n7Var4), j11, f10, i11);
        }
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit W(androidx.compose.ui.a0 a0Var, long j10, long j11, int i10, int i11, int i12, androidx.compose.runtime.c0 c0Var, int i13) {
        L(a0Var, j10, j11, i10, c0Var, androidx.compose.runtime.t4.a(i11 | 1), i12);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit X(androidx.compose.animation.core.q1.b bVar) {
        bVar.h(f23521d);
        bVar.i(bVar.a(Float.valueOf(0.0f), 0), f23530m);
        bVar.a(Float.valueOf(1.0f), f23522e);
        return Unit.f312394a;
    }

    private static final float Y(androidx.compose.runtime.n7<Float> n7Var) {
        return n7Var.getValue().floatValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit Z(androidx.compose.ui.a0 a0Var, long j10, long j11, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        M(a0Var, j10, j11, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit a0(long j10, int i10, float f10, long j11, androidx.compose.ui.graphics.drawscope.f fVar) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (fVar.d() & com.rabbitmq.client.k0.f265952a));
        i0(fVar, j10, fIntBitsToFloat, i10);
        int i11 = 0 << 0;
        h0(fVar, 0.0f, f10, j11, fIntBitsToFloat, i10);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit b0(float f10, androidx.compose.ui.a0 a0Var, long j10, long j11, int i10, int i11, int i12, androidx.compose.runtime.c0 c0Var, int i13) {
        N(f10, a0Var, j10, j11, i10, c0Var, androidx.compose.runtime.t4.a(i11 | 1), i12);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit c0(float f10, androidx.compose.ui.a0 a0Var, long j10, long j11, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        O(f10, a0Var, j10, j11, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    private static final void d0(androidx.compose.ui.graphics.drawscope.f fVar, float f10, float f11, long j10, androidx.compose.ui.graphics.drawscope.n nVar) {
        float f12 = 2;
        float fG = nVar.g() / f12;
        float fIntBitsToFloat = Float.intBitsToFloat((int) (fVar.d() >> 32)) - (f12 * fG);
        androidx.compose.ui.graphics.drawscope.f.a2(fVar, j10, f10, f11, false, n0.g.g((((long) Float.floatToRawIntBits(fG)) & com.rabbitmq.client.k0.f265952a) | (Float.floatToRawIntBits(fG) << 32)), n0.n.f((((long) Float.floatToRawIntBits(fIntBitsToFloat)) << 32) | (((long) Float.floatToRawIntBits(fIntBitsToFloat)) & com.rabbitmq.client.k0.f265952a)), 0.0f, nVar, null, 0, 832, null);
    }

    private static final void e0(androidx.compose.ui.graphics.drawscope.f fVar, long j10, androidx.compose.ui.graphics.drawscope.n nVar) {
        d0(fVar, 0.0f, 360.0f, j10, nVar);
    }

    private static final void f0(androidx.compose.ui.graphics.drawscope.f fVar, float f10, float f11, long j10, androidx.compose.ui.graphics.drawscope.n nVar) {
        d0(fVar, f10, f11, j10, nVar);
    }

    private static final void g0(androidx.compose.ui.graphics.drawscope.f fVar, float f10, float f11, float f12, long j10, androidx.compose.ui.graphics.drawscope.n nVar) {
        d0(fVar, f10 + (androidx.compose.ui.graphics.u3.g(nVar.c(), androidx.compose.ui.graphics.u3.f38256b.a()) ? 0.0f : ((f11 / androidx.compose.ui.unit.h.r(f23520c / 2)) * 57.29578f) / 2.0f), Math.max(f12, 0.1f), j10, nVar);
    }

    private static final void h0(androidx.compose.ui.graphics.drawscope.f fVar, float f10, float f11, long j10, float f12, int i10) {
        float fIntBitsToFloat = Float.intBitsToFloat((int) (fVar.d() >> 32));
        float fIntBitsToFloat2 = Float.intBitsToFloat((int) (fVar.d() & com.rabbitmq.client.k0.f265952a));
        float f13 = 2;
        float f14 = fIntBitsToFloat2 / f13;
        boolean z10 = fVar.getLayoutDirection() == androidx.compose.ui.unit.w.Ltr;
        float f15 = (z10 ? f10 : 1.0f - f11) * fIntBitsToFloat;
        float f16 = (z10 ? f11 : 1.0f - f10) * fIntBitsToFloat;
        if (androidx.compose.ui.graphics.u3.g(i10, androidx.compose.ui.graphics.u3.f38256b.a()) || fIntBitsToFloat2 > fIntBitsToFloat) {
            androidx.compose.ui.graphics.drawscope.f.j2(fVar, j10, n0.g.g((((long) Float.floatToRawIntBits(f15)) << 32) | (((long) Float.floatToRawIntBits(f14)) & com.rabbitmq.client.k0.f265952a)), n0.g.g((((long) Float.floatToRawIntBits(f16)) << 32) | (((long) Float.floatToRawIntBits(f14)) & com.rabbitmq.client.k0.f265952a)), f12, 0, null, 0.0f, null, 0, 496, null);
            return;
        }
        float f17 = f12 / f13;
        kotlin.ranges.f<Float> fVarE = kotlin.ranges.r.e(f17, fIntBitsToFloat - f17);
        float fFloatValue = ((Number) kotlin.ranges.r.N(Float.valueOf(f15), fVarE)).floatValue();
        float fFloatValue2 = ((Number) kotlin.ranges.r.N(Float.valueOf(f16), fVarE)).floatValue();
        if (Math.abs(f11 - f10) > 0.0f) {
            androidx.compose.ui.graphics.drawscope.f.j2(fVar, j10, n0.g.g((((long) Float.floatToRawIntBits(fFloatValue)) << 32) | (((long) Float.floatToRawIntBits(f14)) & com.rabbitmq.client.k0.f265952a)), n0.g.g((((long) Float.floatToRawIntBits(fFloatValue2)) << 32) | (((long) Float.floatToRawIntBits(f14)) & com.rabbitmq.client.k0.f265952a)), f12, i10, null, 0.0f, null, 0, 480, null);
        }
    }

    private static final void i0(androidx.compose.ui.graphics.drawscope.f fVar, long j10, float f10, int i10) {
        h0(fVar, 0.0f, 1.0f, j10, f10, i10);
    }

    @NotNull
    public static final androidx.compose.ui.a0 j0(@NotNull androidx.compose.ui.a0 a0Var) {
        final float fR = androidx.compose.ui.unit.h.r(10);
        return androidx.compose.foundation.layout.d5.t(androidx.compose.ui.semantics.t.e(androidx.compose.ui.layout.q0.a(a0Var, new pj.n() { // from class: androidx.compose.material.gd
            @Override // pj.n
            public final Object invoke(Object obj, Object obj2, Object obj3) {
                return kd.k0(fR, (androidx.compose.ui.layout.c1) obj, (androidx.compose.ui.layout.z0) obj2, (androidx.compose.ui.unit.b) obj3);
            }
        }), true, new Function1() { // from class: androidx.compose.material.hd
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return kd.m0((androidx.compose.ui.semantics.e0) obj);
            }
        }), 0.0f, fR, 1, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final androidx.compose.ui.layout.b1 k0(float f10, androidx.compose.ui.layout.c1 c1Var, androidx.compose.ui.layout.z0 z0Var, androidx.compose.ui.unit.b bVar) {
        final int iG6 = c1Var.g6(f10);
        long jX = bVar.x();
        int i10 = iG6 * 2;
        boolean z10 = true;
        final androidx.compose.ui.layout.i2 i2VarP0 = z0Var.P0(androidx.compose.ui.unit.c.q(jX, 0, i10));
        return androidx.compose.ui.layout.c1.h6(c1Var, i2VarP0.h1(), i2VarP0.c1() - i10, null, new Function1() { // from class: androidx.compose.material.ad
            @Override // kotlin.jvm.functions.Function1
            public final Object invoke(Object obj) {
                return kd.l0(i2VarP0, iG6, (androidx.compose.ui.layout.i2.a) obj);
            }
        }, 4, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit l0(androidx.compose.ui.layout.i2 i2Var, int i10, androidx.compose.ui.layout.i2.a aVar) {
        androidx.compose.ui.layout.i2.a.P(aVar, i2Var, 0, -i10, 0.0f, 4, null);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit m0(androidx.compose.ui.semantics.e0 e0Var) {
        return Unit.f312394a;
    }

    /* JADX WARN: Code duplicated, block: B:101:0x013a  */
    /* JADX WARN: Code duplicated, block: B:102:0x013c  */
    /* JADX WARN: Code duplicated, block: B:105:0x0144  */
    /* JADX WARN: Code duplicated, block: B:109:0x0175  */
    /* JADX WARN: Code duplicated, block: B:111:0x0178  */
    /* JADX WARN: Code duplicated, block: B:114:0x01a3  */
    /* JADX WARN: Code duplicated, block: B:115:0x01a6  */
    /* JADX WARN: Code duplicated, block: B:118:0x01b6  */
    /* JADX WARN: Code duplicated, block: B:120:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:126:0x01cb  */
    /* JADX WARN: Code duplicated, block: B:128:0x01d3  */
    /* JADX WARN: Code duplicated, block: B:131:0x01f2  */
    /* JADX WARN: Code duplicated, block: B:133:0x01f8  */
    /* JADX WARN: Code duplicated, block: B:136:0x0206  */
    /* JADX WARN: Code duplicated, block: B:138:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:26:0x0049  */
    /* JADX WARN: Code duplicated, block: B:31:0x0058  */
    /* JADX WARN: Code duplicated, block: B:33:0x005c  */
    /* JADX WARN: Code duplicated, block: B:36:0x0062  */
    /* JADX WARN: Code duplicated, block: B:38:0x0067  */
    /* JADX WARN: Code duplicated, block: B:40:0x006b  */
    /* JADX WARN: Code duplicated, block: B:42:0x0073  */
    /* JADX WARN: Code duplicated, block: B:43:0x0076  */
    /* JADX WARN: Code duplicated, block: B:47:0x007d  */
    /* JADX WARN: Code duplicated, block: B:49:0x0082  */
    /* JADX WARN: Code duplicated, block: B:51:0x0086  */
    /* JADX WARN: Code duplicated, block: B:53:0x008e  */
    /* JADX WARN: Code duplicated, block: B:54:0x0091  */
    /* JADX WARN: Code duplicated, block: B:58:0x009b  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a1  */
    /* JADX WARN: Code duplicated, block: B:63:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:65:0x00af  */
    /* JADX WARN: Code duplicated, block: B:68:0x00be  */
    /* JADX WARN: Code duplicated, block: B:69:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:72:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:74:0x00d6  */
    /* JADX WARN: Code duplicated, block: B:83:0x00eb A[PHI: r3 r5 r8 r10 r14
      0x00eb: PHI (r3v27 int) = (r3v18 int), (r3v28 int), (r3v29 int) binds: [B:94:0x0118, B:81:0x00e8, B:82:0x00ea] A[DONT_GENERATE, DONT_INLINE]
      0x00eb: PHI (r5v9 androidx.compose.ui.a0) = (r5v6 androidx.compose.ui.a0), (r5v2 androidx.compose.ui.a0), (r5v2 androidx.compose.ui.a0) binds: [B:94:0x0118, B:81:0x00e8, B:82:0x00ea] A[DONT_GENERATE, DONT_INLINE]
      0x00eb: PHI (r8v9 float) = (r8v5 float), (r8v2 float), (r8v2 float) binds: [B:94:0x0118, B:81:0x00e8, B:82:0x00ea] A[DONT_GENERATE, DONT_INLINE]
      0x00eb: PHI (r10v8 long) = (r10v5 long), (r10v1 long), (r10v1 long) binds: [B:94:0x0118, B:81:0x00e8, B:82:0x00ea] A[DONT_GENERATE, DONT_INLINE]
      0x00eb: PHI (r14v7 long) = (r14v4 long), (r14v2 long), (r14v2 long) binds: [B:94:0x0118, B:81:0x00e8, B:82:0x00ea] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:84:0x00ee A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:85:0x00f0  */
    /* JADX WARN: Code duplicated, block: B:88:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:90:0x0106  */
    /* JADX WARN: Code duplicated, block: B:92:0x0110  */
    /* JADX WARN: Code duplicated, block: B:95:0x011a  */
    /* JADX WARN: Code duplicated, block: B:98:0x012c  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void v(@androidx.annotation.x(from = 0.0d, to = 1.0d) final float f10, @Nullable androidx.compose.ui.a0 a0Var, long j10, float f11, long j11, int i10, @Nullable androidx.compose.runtime.c0 c0Var, final int i11, final int i12) {
        int i13;
        androidx.compose.ui.a0 a0Var2;
        long j12;
        int i14;
        float fB;
        int i15;
        int i16;
        long jS;
        int i17;
        int i18;
        boolean z10;
        boolean z11;
        int iA;
        final long j13;
        final long j14;
        androidx.compose.runtime.s5 s5VarT;
        float f12;
        final androidx.compose.ui.graphics.drawscope.n nVar;
        Float fValueOf;
        boolean z12;
        boolean z13;
        Object objI0;
        int i19;
        int i20;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1746618448);
        if ((i12 & 1) != 0) {
            i13 = i11 | 6;
        } else if ((i11 & 6) == 0) {
            i13 = (c0VarR.I(f10) ? 4 : 2) | i11;
        } else {
            i13 = i11;
        }
        int i21 = i12 & 2;
        if (i21 == 0) {
            if ((i11 & 48) == 0) {
                a0Var2 = a0Var;
                i13 |= c0VarR.D(a0Var2) ? 32 : 16;
            }
            if ((i11 & androidx.media3.exoplayer.a5.S0) == 0) {
                j12 = j10;
                if ((i12 & 4) == 0 || !c0VarR.L(j12)) {
                    i20 = 128;
                } else {
                    i20 = 256;
                }
                i13 |= i20;
            } else {
                j12 = j10;
            }
            i14 = i12 & 8;
            if (i14 != 0) {
                if ((i11 & 3072) == 0) {
                    fB = f11;
                    if (c0VarR.I(fB)) {
                        i15 = 2048;
                    } else {
                        i15 = 1024;
                    }
                    i13 |= i15;
                }
                i16 = i12 & 16;
                if (i16 != 0) {
                    if ((i11 & 24576) == 0) {
                        jS = j11;
                        if (c0VarR.L(jS)) {
                            i17 = 16384;
                        } else {
                            i17 = 8192;
                        }
                        i13 |= i17;
                    }
                    if ((i11 & androidx.profileinstaller.n.c.f73814m) == 0) {
                        i18 = i10;
                        if ((i12 & 32) == 0 || !c0VarR.K(i18)) {
                            i19 = 65536;
                        } else {
                            i19 = 131072;
                        }
                        i13 |= i19;
                    } else {
                        i18 = i10;
                    }
                    z10 = true;
                    if ((i13 & 74899) != 74898) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    if (c0VarR.h(z11, i13 & 1)) {
                        c0VarR.l0();
                        if ((i11 & 1) != 0 || c0VarR.y()) {
                            if (i21 != 0) {
                                a0Var2 = androidx.compose.ui.a0.E;
                            }
                            if ((i12 & 4) != 0) {
                                j12 = x9.f25488a.a(c0VarR, 6).j();
                                i13 &= -897;
                            }
                            if (i14 != 0) {
                                fB = oc.f24062a.b();
                            }
                            if (i16 != 0) {
                                jS = androidx.compose.ui.graphics.q0.f38131b.s();
                            }
                            if ((i12 & 32) != 0) {
                                i13 &= -458753;
                                iA = androidx.compose.ui.graphics.u3.f38256b.a();
                            }
                            c0VarR.Z();
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.A0(1746618448, i13, -1, "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:313)");
                            }
                            if (f10 < 0.0f) {
                                f12 = 0.0f;
                            } else {
                                f12 = f10;
                            }
                            if (f12 > 1.0f) {
                                f12 = 1.0f;
                            }
                            nVar = new androidx.compose.ui.graphics.drawscope.n(((androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m())).S7(fB), 0.0f, iA, 0, null, 26, null);
                            fValueOf = Float.valueOf(f12);
                            if (Float.isNaN(fValueOf.floatValue())) {
                                fValueOf = null;
                            }
                            androidx.compose.ui.a0 a0VarW = androidx.compose.foundation.layout.i6.w(androidx.compose.foundation.m4.e(a0Var2, fValueOf != null ? fValueOf.floatValue() : 0.0f, null, 0, 6, null), f23520c);
                            boolean zI = c0VarR.I(f12);
                            if ((57344 & i13) == 16384) {
                                z12 = true;
                            } else {
                                z12 = false;
                            }
                            boolean zK0 = zI | z12 | c0VarR.k0(nVar);
                            if ((((i13 & 896) ^ androidx.media3.exoplayer.a5.S0) > 256 || !c0VarR.L(j12)) && (i13 & androidx.media3.exoplayer.a5.S0) != 256) {
                            }
                            z13 = zK0 | z10;
                            objI0 = c0VarR.i0();
                            if (z13 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                                final float f13 = f12;
                                final long j15 = j12;
                                final long j16 = jS;
                                objI0 = new Function1() { // from class: androidx.compose.material.id
                                    @Override // kotlin.jvm.functions.Function1
                                    public final Object invoke(Object obj) {
                                        return kd.z(f13, j16, nVar, j15, (androidx.compose.ui.graphics.drawscope.f) obj);
                                    }
                                };
                                c0VarR.Y(objI0);
                            }
                            androidx.compose.foundation.f1.e(a0VarW, (Function1) objI0, c0VarR, 0);
                            if (androidx.compose.runtime.m0.l0()) {
                                androidx.compose.runtime.m0.z0();
                            }
                        } else {
                            c0VarR.u();
                            if ((i12 & 4) != 0) {
                                i13 &= -897;
                            }
                            if ((i12 & 32) != 0) {
                                i13 &= -458753;
                            }
                        }
                        iA = i18;
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(1746618448, i13, -1, "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:313)");
                        }
                        if (f10 < 0.0f) {
                            f12 = 0.0f;
                        } else {
                            f12 = f10;
                        }
                        if (f12 > 1.0f) {
                            f12 = 1.0f;
                        }
                        nVar = new androidx.compose.ui.graphics.drawscope.n(((androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m())).S7(fB), 0.0f, iA, 0, null, 26, null);
                        fValueOf = Float.valueOf(f12);
                        if (Float.isNaN(fValueOf.floatValue())) {
                            fValueOf = null;
                        }
                        androidx.compose.ui.a0 a0VarW2 = androidx.compose.foundation.layout.i6.w(androidx.compose.foundation.m4.e(a0Var2, fValueOf != null ? fValueOf.floatValue() : 0.0f, null, 0, 6, null), f23520c);
                        boolean zI2 = c0VarR.I(f12);
                        if ((57344 & i13) == 16384) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        boolean zK1 = zI2 | z12 | c0VarR.k0(nVar);
                        z10 = ((i13 & 896) ^ androidx.media3.exoplayer.a5.S0) > 256 ? false : false;
                        z13 = zK1 | z10;
                        objI0 = c0VarR.i0();
                        if (z13) {
                            final float f14 = f12;
                            final long j17 = j12;
                            final long j18 = jS;
                            objI0 = new Function1() { // from class: androidx.compose.material.id
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return kd.z(f14, j18, nVar, j17, (androidx.compose.ui.graphics.drawscope.f) obj);
                                }
                            };
                            c0VarR.Y(objI0);
                        } else {
                            final float f15 = f12;
                            final long j19 = j12;
                            final long j110 = jS;
                            objI0 = new Function1() { // from class: androidx.compose.material.id
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return kd.z(f15, j110, nVar, j19, (androidx.compose.ui.graphics.drawscope.f) obj);
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        androidx.compose.foundation.f1.e(a0VarW2, (Function1) objI0, c0VarR, 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                    } else {
                        c0VarR.u();
                        iA = i18;
                    }
                    j13 = j12;
                    j14 = jS;
                    s5VarT = c0VarR.T();
                    if (s5VarT != null) {
                        final androidx.compose.ui.a0 a0Var3 = a0Var2;
                        final float f16 = fB;
                        final int i22 = iA;
                        s5VarT.a(new Function2() { // from class: androidx.compose.material.jd
                            @Override // kotlin.jvm.functions.Function2
                            public final Object invoke(Object obj, Object obj2) {
                                return kd.A(f10, a0Var3, j13, f16, j14, i22, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                            }
                        });
                    }
                }
                i13 |= 24576;
                jS = j11;
                if ((i11 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    i18 = i10;
                    if ((i12 & 32) == 0) {
                        i19 = 65536;
                    } else {
                        i19 = 65536;
                    }
                    i13 |= i19;
                } else {
                    i18 = i10;
                }
                z10 = true;
                if ((i13 & 74899) != 74898) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (c0VarR.h(z11, i13 & 1)) {
                    c0VarR.l0();
                    if ((i11 & 1) != 0) {
                        if (i21 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if ((i12 & 4) != 0) {
                            j12 = x9.f25488a.a(c0VarR, 6).j();
                            i13 &= -897;
                        }
                        if (i14 != 0) {
                            fB = oc.f24062a.b();
                        }
                        if (i16 != 0) {
                            jS = androidx.compose.ui.graphics.q0.f38131b.s();
                        }
                        if ((i12 & 32) != 0) {
                            i13 &= -458753;
                            iA = androidx.compose.ui.graphics.u3.f38256b.a();
                        } else {
                            iA = i18;
                        }
                    } else {
                        if (i21 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if ((i12 & 4) != 0) {
                            j12 = x9.f25488a.a(c0VarR, 6).j();
                            i13 &= -897;
                        }
                        if (i14 != 0) {
                            fB = oc.f24062a.b();
                        }
                        if (i16 != 0) {
                            jS = androidx.compose.ui.graphics.q0.f38131b.s();
                        }
                        if ((i12 & 32) != 0) {
                            i13 &= -458753;
                            iA = androidx.compose.ui.graphics.u3.f38256b.a();
                        } else {
                            iA = i18;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1746618448, i13, -1, "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:313)");
                    }
                    if (f10 < 0.0f) {
                        f12 = 0.0f;
                    } else {
                        f12 = f10;
                    }
                    if (f12 > 1.0f) {
                        f12 = 1.0f;
                    }
                    nVar = new androidx.compose.ui.graphics.drawscope.n(((androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m())).S7(fB), 0.0f, iA, 0, null, 26, null);
                    fValueOf = Float.valueOf(f12);
                    if (Float.isNaN(fValueOf.floatValue())) {
                        fValueOf = null;
                    }
                    androidx.compose.ui.a0 a0VarW3 = androidx.compose.foundation.layout.i6.w(androidx.compose.foundation.m4.e(a0Var2, fValueOf != null ? fValueOf.floatValue() : 0.0f, null, 0, 6, null), f23520c);
                    boolean zI3 = c0VarR.I(f12);
                    if ((57344 & i13) == 16384) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    boolean zK2 = zI3 | z12 | c0VarR.k0(nVar);
                    if (((i13 & 896) ^ androidx.media3.exoplayer.a5.S0) > 256) {
                    }
                    z13 = zK2 | z10;
                    objI0 = c0VarR.i0();
                    if (z13) {
                        final float f17 = f12;
                        final long j111 = j12;
                        final long j112 = jS;
                        objI0 = new Function1() { // from class: androidx.compose.material.id
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return kd.z(f17, j112, nVar, j111, (androidx.compose.ui.graphics.drawscope.f) obj);
                            }
                        };
                        c0VarR.Y(objI0);
                    } else {
                        final float f18 = f12;
                        final long j113 = j12;
                        final long j114 = jS;
                        objI0 = new Function1() { // from class: androidx.compose.material.id
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return kd.z(f18, j114, nVar, j113, (androidx.compose.ui.graphics.drawscope.f) obj);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    androidx.compose.foundation.f1.e(a0VarW3, (Function1) objI0, c0VarR, 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                } else {
                    c0VarR.u();
                    iA = i18;
                }
                j13 = j12;
                j14 = jS;
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    final androidx.compose.ui.a0 a0Var4 = a0Var2;
                    final float f19 = fB;
                    final int i23 = iA;
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.jd
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return kd.A(f10, a0Var4, j13, f19, j14, i23, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 3072;
            fB = f11;
            i16 = i12 & 16;
            if (i16 != 0) {
                if ((i11 & 24576) == 0) {
                    jS = j11;
                    if (c0VarR.L(jS)) {
                        i17 = 16384;
                    } else {
                        i17 = 8192;
                    }
                    i13 |= i17;
                }
                if ((i11 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    i18 = i10;
                    if ((i12 & 32) == 0) {
                        i19 = 65536;
                    } else {
                        i19 = 65536;
                    }
                    i13 |= i19;
                } else {
                    i18 = i10;
                }
                z10 = true;
                if ((i13 & 74899) != 74898) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (c0VarR.h(z11, i13 & 1)) {
                    c0VarR.l0();
                    if ((i11 & 1) != 0) {
                        if (i21 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if ((i12 & 4) != 0) {
                            j12 = x9.f25488a.a(c0VarR, 6).j();
                            i13 &= -897;
                        }
                        if (i14 != 0) {
                            fB = oc.f24062a.b();
                        }
                        if (i16 != 0) {
                            jS = androidx.compose.ui.graphics.q0.f38131b.s();
                        }
                        if ((i12 & 32) != 0) {
                            i13 &= -458753;
                            iA = androidx.compose.ui.graphics.u3.f38256b.a();
                        } else {
                            iA = i18;
                        }
                    } else {
                        if (i21 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if ((i12 & 4) != 0) {
                            j12 = x9.f25488a.a(c0VarR, 6).j();
                            i13 &= -897;
                        }
                        if (i14 != 0) {
                            fB = oc.f24062a.b();
                        }
                        if (i16 != 0) {
                            jS = androidx.compose.ui.graphics.q0.f38131b.s();
                        }
                        if ((i12 & 32) != 0) {
                            i13 &= -458753;
                            iA = androidx.compose.ui.graphics.u3.f38256b.a();
                        } else {
                            iA = i18;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1746618448, i13, -1, "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:313)");
                    }
                    if (f10 < 0.0f) {
                        f12 = 0.0f;
                    } else {
                        f12 = f10;
                    }
                    if (f12 > 1.0f) {
                        f12 = 1.0f;
                    }
                    nVar = new androidx.compose.ui.graphics.drawscope.n(((androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m())).S7(fB), 0.0f, iA, 0, null, 26, null);
                    fValueOf = Float.valueOf(f12);
                    if (Float.isNaN(fValueOf.floatValue())) {
                        fValueOf = null;
                    }
                    androidx.compose.ui.a0 a0VarW4 = androidx.compose.foundation.layout.i6.w(androidx.compose.foundation.m4.e(a0Var2, fValueOf != null ? fValueOf.floatValue() : 0.0f, null, 0, 6, null), f23520c);
                    boolean zI4 = c0VarR.I(f12);
                    if ((57344 & i13) == 16384) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    boolean zK3 = zI4 | z12 | c0VarR.k0(nVar);
                    if (((i13 & 896) ^ androidx.media3.exoplayer.a5.S0) > 256) {
                    }
                    z13 = zK3 | z10;
                    objI0 = c0VarR.i0();
                    if (z13) {
                        final float f110 = f12;
                        final long j115 = j12;
                        final long j116 = jS;
                        objI0 = new Function1() { // from class: androidx.compose.material.id
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return kd.z(f110, j116, nVar, j115, (androidx.compose.ui.graphics.drawscope.f) obj);
                            }
                        };
                        c0VarR.Y(objI0);
                    } else {
                        final float f111 = f12;
                        final long j117 = j12;
                        final long j118 = jS;
                        objI0 = new Function1() { // from class: androidx.compose.material.id
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return kd.z(f111, j118, nVar, j117, (androidx.compose.ui.graphics.drawscope.f) obj);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    androidx.compose.foundation.f1.e(a0VarW4, (Function1) objI0, c0VarR, 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                } else {
                    c0VarR.u();
                    iA = i18;
                }
                j13 = j12;
                j14 = jS;
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    final androidx.compose.ui.a0 a0Var5 = a0Var2;
                    final float f112 = fB;
                    final int i24 = iA;
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.jd
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return kd.A(f10, a0Var5, j13, f112, j14, i24, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 24576;
            jS = j11;
            if ((i11 & androidx.profileinstaller.n.c.f73814m) == 0) {
                i18 = i10;
                if ((i12 & 32) == 0) {
                    i19 = 65536;
                } else {
                    i19 = 65536;
                }
                i13 |= i19;
            } else {
                i18 = i10;
            }
            z10 = true;
            if ((i13 & 74899) != 74898) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (c0VarR.h(z11, i13 & 1)) {
                c0VarR.l0();
                if ((i11 & 1) != 0) {
                    if (i21 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if ((i12 & 4) != 0) {
                        j12 = x9.f25488a.a(c0VarR, 6).j();
                        i13 &= -897;
                    }
                    if (i14 != 0) {
                        fB = oc.f24062a.b();
                    }
                    if (i16 != 0) {
                        jS = androidx.compose.ui.graphics.q0.f38131b.s();
                    }
                    if ((i12 & 32) != 0) {
                        i13 &= -458753;
                        iA = androidx.compose.ui.graphics.u3.f38256b.a();
                    } else {
                        iA = i18;
                    }
                } else {
                    if (i21 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if ((i12 & 4) != 0) {
                        j12 = x9.f25488a.a(c0VarR, 6).j();
                        i13 &= -897;
                    }
                    if (i14 != 0) {
                        fB = oc.f24062a.b();
                    }
                    if (i16 != 0) {
                        jS = androidx.compose.ui.graphics.q0.f38131b.s();
                    }
                    if ((i12 & 32) != 0) {
                        i13 &= -458753;
                        iA = androidx.compose.ui.graphics.u3.f38256b.a();
                    } else {
                        iA = i18;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1746618448, i13, -1, "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:313)");
                }
                if (f10 < 0.0f) {
                    f12 = 0.0f;
                } else {
                    f12 = f10;
                }
                if (f12 > 1.0f) {
                    f12 = 1.0f;
                }
                nVar = new androidx.compose.ui.graphics.drawscope.n(((androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m())).S7(fB), 0.0f, iA, 0, null, 26, null);
                fValueOf = Float.valueOf(f12);
                if (Float.isNaN(fValueOf.floatValue())) {
                    fValueOf = null;
                }
                androidx.compose.ui.a0 a0VarW5 = androidx.compose.foundation.layout.i6.w(androidx.compose.foundation.m4.e(a0Var2, fValueOf != null ? fValueOf.floatValue() : 0.0f, null, 0, 6, null), f23520c);
                boolean zI5 = c0VarR.I(f12);
                if ((57344 & i13) == 16384) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                boolean zK4 = zI5 | z12 | c0VarR.k0(nVar);
                if (((i13 & 896) ^ androidx.media3.exoplayer.a5.S0) > 256) {
                }
                z13 = zK4 | z10;
                objI0 = c0VarR.i0();
                if (z13) {
                    final float f113 = f12;
                    final long j119 = j12;
                    final long j1110 = jS;
                    objI0 = new Function1() { // from class: androidx.compose.material.id
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return kd.z(f113, j1110, nVar, j119, (androidx.compose.ui.graphics.drawscope.f) obj);
                        }
                    };
                    c0VarR.Y(objI0);
                } else {
                    final float f114 = f12;
                    final long j1111 = j12;
                    final long j1112 = jS;
                    objI0 = new Function1() { // from class: androidx.compose.material.id
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return kd.z(f114, j1112, nVar, j1111, (androidx.compose.ui.graphics.drawscope.f) obj);
                        }
                    };
                    c0VarR.Y(objI0);
                }
                androidx.compose.foundation.f1.e(a0VarW5, (Function1) objI0, c0VarR, 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
            } else {
                c0VarR.u();
                iA = i18;
            }
            j13 = j12;
            j14 = jS;
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                final androidx.compose.ui.a0 a0Var6 = a0Var2;
                final float f115 = fB;
                final int i25 = iA;
                s5VarT.a(new Function2() { // from class: androidx.compose.material.jd
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return kd.A(f10, a0Var6, j13, f115, j14, i25, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= 48;
        a0Var2 = a0Var;
        if ((i11 & androidx.media3.exoplayer.a5.S0) == 0) {
            j12 = j10;
            if ((i12 & 4) == 0) {
                i20 = 128;
            } else {
                i20 = 128;
            }
            i13 |= i20;
        } else {
            j12 = j10;
        }
        i14 = i12 & 8;
        if (i14 != 0) {
            if ((i11 & 3072) == 0) {
                fB = f11;
                if (c0VarR.I(fB)) {
                    i15 = 2048;
                } else {
                    i15 = 1024;
                }
                i13 |= i15;
            }
            i16 = i12 & 16;
            if (i16 != 0) {
                if ((i11 & 24576) == 0) {
                    jS = j11;
                    if (c0VarR.L(jS)) {
                        i17 = 16384;
                    } else {
                        i17 = 8192;
                    }
                    i13 |= i17;
                }
                if ((i11 & androidx.profileinstaller.n.c.f73814m) == 0) {
                    i18 = i10;
                    if ((i12 & 32) == 0) {
                        i19 = 65536;
                    } else {
                        i19 = 65536;
                    }
                    i13 |= i19;
                } else {
                    i18 = i10;
                }
                z10 = true;
                if ((i13 & 74899) != 74898) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                if (c0VarR.h(z11, i13 & 1)) {
                    c0VarR.l0();
                    if ((i11 & 1) != 0) {
                        if (i21 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if ((i12 & 4) != 0) {
                            j12 = x9.f25488a.a(c0VarR, 6).j();
                            i13 &= -897;
                        }
                        if (i14 != 0) {
                            fB = oc.f24062a.b();
                        }
                        if (i16 != 0) {
                            jS = androidx.compose.ui.graphics.q0.f38131b.s();
                        }
                        if ((i12 & 32) != 0) {
                            i13 &= -458753;
                            iA = androidx.compose.ui.graphics.u3.f38256b.a();
                        } else {
                            iA = i18;
                        }
                    } else {
                        if (i21 != 0) {
                            a0Var2 = androidx.compose.ui.a0.E;
                        }
                        if ((i12 & 4) != 0) {
                            j12 = x9.f25488a.a(c0VarR, 6).j();
                            i13 &= -897;
                        }
                        if (i14 != 0) {
                            fB = oc.f24062a.b();
                        }
                        if (i16 != 0) {
                            jS = androidx.compose.ui.graphics.q0.f38131b.s();
                        }
                        if ((i12 & 32) != 0) {
                            i13 &= -458753;
                            iA = androidx.compose.ui.graphics.u3.f38256b.a();
                        } else {
                            iA = i18;
                        }
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(1746618448, i13, -1, "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:313)");
                    }
                    if (f10 < 0.0f) {
                        f12 = 0.0f;
                    } else {
                        f12 = f10;
                    }
                    if (f12 > 1.0f) {
                        f12 = 1.0f;
                    }
                    nVar = new androidx.compose.ui.graphics.drawscope.n(((androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m())).S7(fB), 0.0f, iA, 0, null, 26, null);
                    fValueOf = Float.valueOf(f12);
                    if (Float.isNaN(fValueOf.floatValue())) {
                        fValueOf = null;
                    }
                    androidx.compose.ui.a0 a0VarW6 = androidx.compose.foundation.layout.i6.w(androidx.compose.foundation.m4.e(a0Var2, fValueOf != null ? fValueOf.floatValue() : 0.0f, null, 0, 6, null), f23520c);
                    boolean zI6 = c0VarR.I(f12);
                    if ((57344 & i13) == 16384) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    boolean zK5 = zI6 | z12 | c0VarR.k0(nVar);
                    if (((i13 & 896) ^ androidx.media3.exoplayer.a5.S0) > 256) {
                    }
                    z13 = zK5 | z10;
                    objI0 = c0VarR.i0();
                    if (z13) {
                        final float f116 = f12;
                        final long j1113 = j12;
                        final long j1114 = jS;
                        objI0 = new Function1() { // from class: androidx.compose.material.id
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return kd.z(f116, j1114, nVar, j1113, (androidx.compose.ui.graphics.drawscope.f) obj);
                            }
                        };
                        c0VarR.Y(objI0);
                    } else {
                        final float f117 = f12;
                        final long j1115 = j12;
                        final long j1116 = jS;
                        objI0 = new Function1() { // from class: androidx.compose.material.id
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return kd.z(f117, j1116, nVar, j1115, (androidx.compose.ui.graphics.drawscope.f) obj);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    androidx.compose.foundation.f1.e(a0VarW6, (Function1) objI0, c0VarR, 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                } else {
                    c0VarR.u();
                    iA = i18;
                }
                j13 = j12;
                j14 = jS;
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    final androidx.compose.ui.a0 a0Var7 = a0Var2;
                    final float f118 = fB;
                    final int i26 = iA;
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.jd
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return kd.A(f10, a0Var7, j13, f118, j14, i26, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 24576;
            jS = j11;
            if ((i11 & androidx.profileinstaller.n.c.f73814m) == 0) {
                i18 = i10;
                if ((i12 & 32) == 0) {
                    i19 = 65536;
                } else {
                    i19 = 65536;
                }
                i13 |= i19;
            } else {
                i18 = i10;
            }
            z10 = true;
            if ((i13 & 74899) != 74898) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (c0VarR.h(z11, i13 & 1)) {
                c0VarR.l0();
                if ((i11 & 1) != 0) {
                    if (i21 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if ((i12 & 4) != 0) {
                        j12 = x9.f25488a.a(c0VarR, 6).j();
                        i13 &= -897;
                    }
                    if (i14 != 0) {
                        fB = oc.f24062a.b();
                    }
                    if (i16 != 0) {
                        jS = androidx.compose.ui.graphics.q0.f38131b.s();
                    }
                    if ((i12 & 32) != 0) {
                        i13 &= -458753;
                        iA = androidx.compose.ui.graphics.u3.f38256b.a();
                    } else {
                        iA = i18;
                    }
                } else {
                    if (i21 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if ((i12 & 4) != 0) {
                        j12 = x9.f25488a.a(c0VarR, 6).j();
                        i13 &= -897;
                    }
                    if (i14 != 0) {
                        fB = oc.f24062a.b();
                    }
                    if (i16 != 0) {
                        jS = androidx.compose.ui.graphics.q0.f38131b.s();
                    }
                    if ((i12 & 32) != 0) {
                        i13 &= -458753;
                        iA = androidx.compose.ui.graphics.u3.f38256b.a();
                    } else {
                        iA = i18;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1746618448, i13, -1, "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:313)");
                }
                if (f10 < 0.0f) {
                    f12 = 0.0f;
                } else {
                    f12 = f10;
                }
                if (f12 > 1.0f) {
                    f12 = 1.0f;
                }
                nVar = new androidx.compose.ui.graphics.drawscope.n(((androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m())).S7(fB), 0.0f, iA, 0, null, 26, null);
                fValueOf = Float.valueOf(f12);
                if (Float.isNaN(fValueOf.floatValue())) {
                    fValueOf = null;
                }
                androidx.compose.ui.a0 a0VarW7 = androidx.compose.foundation.layout.i6.w(androidx.compose.foundation.m4.e(a0Var2, fValueOf != null ? fValueOf.floatValue() : 0.0f, null, 0, 6, null), f23520c);
                boolean zI7 = c0VarR.I(f12);
                if ((57344 & i13) == 16384) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                boolean zK6 = zI7 | z12 | c0VarR.k0(nVar);
                if (((i13 & 896) ^ androidx.media3.exoplayer.a5.S0) > 256) {
                }
                z13 = zK6 | z10;
                objI0 = c0VarR.i0();
                if (z13) {
                    final float f119 = f12;
                    final long j1117 = j12;
                    final long j1118 = jS;
                    objI0 = new Function1() { // from class: androidx.compose.material.id
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return kd.z(f119, j1118, nVar, j1117, (androidx.compose.ui.graphics.drawscope.f) obj);
                        }
                    };
                    c0VarR.Y(objI0);
                } else {
                    final float f1110 = f12;
                    final long j1119 = j12;
                    final long j11110 = jS;
                    objI0 = new Function1() { // from class: androidx.compose.material.id
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return kd.z(f1110, j11110, nVar, j1119, (androidx.compose.ui.graphics.drawscope.f) obj);
                        }
                    };
                    c0VarR.Y(objI0);
                }
                androidx.compose.foundation.f1.e(a0VarW7, (Function1) objI0, c0VarR, 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
            } else {
                c0VarR.u();
                iA = i18;
            }
            j13 = j12;
            j14 = jS;
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                final androidx.compose.ui.a0 a0Var8 = a0Var2;
                final float f1111 = fB;
                final int i27 = iA;
                s5VarT.a(new Function2() { // from class: androidx.compose.material.jd
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return kd.A(f10, a0Var8, j13, f1111, j14, i27, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= 3072;
        fB = f11;
        i16 = i12 & 16;
        if (i16 != 0) {
            if ((i11 & 24576) == 0) {
                jS = j11;
                if (c0VarR.L(jS)) {
                    i17 = 16384;
                } else {
                    i17 = 8192;
                }
                i13 |= i17;
            }
            if ((i11 & androidx.profileinstaller.n.c.f73814m) == 0) {
                i18 = i10;
                if ((i12 & 32) == 0) {
                    i19 = 65536;
                } else {
                    i19 = 65536;
                }
                i13 |= i19;
            } else {
                i18 = i10;
            }
            z10 = true;
            if ((i13 & 74899) != 74898) {
                z11 = true;
            } else {
                z11 = false;
            }
            if (c0VarR.h(z11, i13 & 1)) {
                c0VarR.l0();
                if ((i11 & 1) != 0) {
                    if (i21 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if ((i12 & 4) != 0) {
                        j12 = x9.f25488a.a(c0VarR, 6).j();
                        i13 &= -897;
                    }
                    if (i14 != 0) {
                        fB = oc.f24062a.b();
                    }
                    if (i16 != 0) {
                        jS = androidx.compose.ui.graphics.q0.f38131b.s();
                    }
                    if ((i12 & 32) != 0) {
                        i13 &= -458753;
                        iA = androidx.compose.ui.graphics.u3.f38256b.a();
                    } else {
                        iA = i18;
                    }
                } else {
                    if (i21 != 0) {
                        a0Var2 = androidx.compose.ui.a0.E;
                    }
                    if ((i12 & 4) != 0) {
                        j12 = x9.f25488a.a(c0VarR, 6).j();
                        i13 &= -897;
                    }
                    if (i14 != 0) {
                        fB = oc.f24062a.b();
                    }
                    if (i16 != 0) {
                        jS = androidx.compose.ui.graphics.q0.f38131b.s();
                    }
                    if ((i12 & 32) != 0) {
                        i13 &= -458753;
                        iA = androidx.compose.ui.graphics.u3.f38256b.a();
                    } else {
                        iA = i18;
                    }
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1746618448, i13, -1, "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:313)");
                }
                if (f10 < 0.0f) {
                    f12 = 0.0f;
                } else {
                    f12 = f10;
                }
                if (f12 > 1.0f) {
                    f12 = 1.0f;
                }
                nVar = new androidx.compose.ui.graphics.drawscope.n(((androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m())).S7(fB), 0.0f, iA, 0, null, 26, null);
                fValueOf = Float.valueOf(f12);
                if (Float.isNaN(fValueOf.floatValue())) {
                    fValueOf = null;
                }
                androidx.compose.ui.a0 a0VarW8 = androidx.compose.foundation.layout.i6.w(androidx.compose.foundation.m4.e(a0Var2, fValueOf != null ? fValueOf.floatValue() : 0.0f, null, 0, 6, null), f23520c);
                boolean zI8 = c0VarR.I(f12);
                if ((57344 & i13) == 16384) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                boolean zK7 = zI8 | z12 | c0VarR.k0(nVar);
                if (((i13 & 896) ^ androidx.media3.exoplayer.a5.S0) > 256) {
                }
                z13 = zK7 | z10;
                objI0 = c0VarR.i0();
                if (z13) {
                    final float f1112 = f12;
                    final long j11111 = j12;
                    final long j11112 = jS;
                    objI0 = new Function1() { // from class: androidx.compose.material.id
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return kd.z(f1112, j11112, nVar, j11111, (androidx.compose.ui.graphics.drawscope.f) obj);
                        }
                    };
                    c0VarR.Y(objI0);
                } else {
                    final float f1113 = f12;
                    final long j11113 = j12;
                    final long j11114 = jS;
                    objI0 = new Function1() { // from class: androidx.compose.material.id
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return kd.z(f1113, j11114, nVar, j11113, (androidx.compose.ui.graphics.drawscope.f) obj);
                        }
                    };
                    c0VarR.Y(objI0);
                }
                androidx.compose.foundation.f1.e(a0VarW8, (Function1) objI0, c0VarR, 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
            } else {
                c0VarR.u();
                iA = i18;
            }
            j13 = j12;
            j14 = jS;
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                final androidx.compose.ui.a0 a0Var9 = a0Var2;
                final float f1114 = fB;
                final int i28 = iA;
                s5VarT.a(new Function2() { // from class: androidx.compose.material.jd
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return kd.A(f10, a0Var9, j13, f1114, j14, i28, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= 24576;
        jS = j11;
        if ((i11 & androidx.profileinstaller.n.c.f73814m) == 0) {
            i18 = i10;
            if ((i12 & 32) == 0) {
                i19 = 65536;
            } else {
                i19 = 65536;
            }
            i13 |= i19;
        } else {
            i18 = i10;
        }
        z10 = true;
        if ((i13 & 74899) != 74898) {
            z11 = true;
        } else {
            z11 = false;
        }
        if (c0VarR.h(z11, i13 & 1)) {
            c0VarR.l0();
            if ((i11 & 1) != 0) {
                if (i21 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                }
                if ((i12 & 4) != 0) {
                    j12 = x9.f25488a.a(c0VarR, 6).j();
                    i13 &= -897;
                }
                if (i14 != 0) {
                    fB = oc.f24062a.b();
                }
                if (i16 != 0) {
                    jS = androidx.compose.ui.graphics.q0.f38131b.s();
                }
                if ((i12 & 32) != 0) {
                    i13 &= -458753;
                    iA = androidx.compose.ui.graphics.u3.f38256b.a();
                } else {
                    iA = i18;
                }
            } else {
                if (i21 != 0) {
                    a0Var2 = androidx.compose.ui.a0.E;
                }
                if ((i12 & 4) != 0) {
                    j12 = x9.f25488a.a(c0VarR, 6).j();
                    i13 &= -897;
                }
                if (i14 != 0) {
                    fB = oc.f24062a.b();
                }
                if (i16 != 0) {
                    jS = androidx.compose.ui.graphics.q0.f38131b.s();
                }
                if ((i12 & 32) != 0) {
                    i13 &= -458753;
                    iA = androidx.compose.ui.graphics.u3.f38256b.a();
                } else {
                    iA = i18;
                }
            }
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1746618448, i13, -1, "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:313)");
            }
            if (f10 < 0.0f) {
                f12 = 0.0f;
            } else {
                f12 = f10;
            }
            if (f12 > 1.0f) {
                f12 = 1.0f;
            }
            nVar = new androidx.compose.ui.graphics.drawscope.n(((androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m())).S7(fB), 0.0f, iA, 0, null, 26, null);
            fValueOf = Float.valueOf(f12);
            if (Float.isNaN(fValueOf.floatValue())) {
                fValueOf = null;
            }
            androidx.compose.ui.a0 a0VarW9 = androidx.compose.foundation.layout.i6.w(androidx.compose.foundation.m4.e(a0Var2, fValueOf != null ? fValueOf.floatValue() : 0.0f, null, 0, 6, null), f23520c);
            boolean zI9 = c0VarR.I(f12);
            if ((57344 & i13) == 16384) {
                z12 = true;
            } else {
                z12 = false;
            }
            boolean zK8 = zI9 | z12 | c0VarR.k0(nVar);
            if (((i13 & 896) ^ androidx.media3.exoplayer.a5.S0) > 256) {
            }
            z13 = zK8 | z10;
            objI0 = c0VarR.i0();
            if (z13) {
                final float f1115 = f12;
                final long j11115 = j12;
                final long j11116 = jS;
                objI0 = new Function1() { // from class: androidx.compose.material.id
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return kd.z(f1115, j11116, nVar, j11115, (androidx.compose.ui.graphics.drawscope.f) obj);
                    }
                };
                c0VarR.Y(objI0);
            } else {
                final float f1116 = f12;
                final long j11117 = j12;
                final long j11118 = jS;
                objI0 = new Function1() { // from class: androidx.compose.material.id
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return kd.z(f1116, j11118, nVar, j11117, (androidx.compose.ui.graphics.drawscope.f) obj);
                    }
                };
                c0VarR.Y(objI0);
            }
            androidx.compose.foundation.f1.e(a0VarW9, (Function1) objI0, c0VarR, 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0VarR.u();
            iA = i18;
        }
        j13 = j12;
        j14 = jS;
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            final androidx.compose.ui.a0 a0Var10 = a0Var2;
            final float f1117 = fB;
            final int i29 = iA;
            s5VarT.a(new Function2() { // from class: androidx.compose.material.jd
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return kd.A(f10, a0Var10, j13, f1117, j14, i29, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:102:0x02a8  */
    /* JADX WARN: Code duplicated, block: B:103:0x02ab  */
    /* JADX WARN: Code duplicated, block: B:106:0x02cc  */
    /* JADX WARN: Code duplicated, block: B:107:0x02cf  */
    /* JADX WARN: Code duplicated, block: B:110:0x02da  */
    /* JADX WARN: Code duplicated, block: B:112:0x02e0  */
    /* JADX WARN: Code duplicated, block: B:118:0x02ef  */
    /* JADX WARN: Code duplicated, block: B:122:0x02f9  */
    /* JADX WARN: Code duplicated, block: B:125:0x031d  */
    /* JADX WARN: Code duplicated, block: B:127:0x032b  */
    /* JADX WARN: Code duplicated, block: B:130:0x033b  */
    /* JADX WARN: Code duplicated, block: B:132:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x006b  */
    /* JADX WARN: Code duplicated, block: B:38:0x0070  */
    /* JADX WARN: Code duplicated, block: B:40:0x0074  */
    /* JADX WARN: Code duplicated, block: B:42:0x007c  */
    /* JADX WARN: Code duplicated, block: B:43:0x007f  */
    /* JADX WARN: Code duplicated, block: B:47:0x0087  */
    /* JADX WARN: Code duplicated, block: B:49:0x008b  */
    /* JADX WARN: Code duplicated, block: B:51:0x0093  */
    /* JADX WARN: Code duplicated, block: B:52:0x0096  */
    /* JADX WARN: Code duplicated, block: B:55:0x009d  */
    /* JADX WARN: Code duplicated, block: B:58:0x00a9  */
    /* JADX WARN: Code duplicated, block: B:59:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:62:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:64:0x00be  */
    /* JADX WARN: Code duplicated, block: B:76:0x00dd A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:77:0x00df  */
    /* JADX WARN: Code duplicated, block: B:78:0x00e2  */
    /* JADX WARN: Code duplicated, block: B:81:0x00e7  */
    /* JADX WARN: Code duplicated, block: B:83:0x00f7  */
    /* JADX WARN: Code duplicated, block: B:85:0x0101  */
    /* JADX WARN: Code duplicated, block: B:86:0x0108  */
    /* JADX WARN: Code duplicated, block: B:89:0x010e  */
    /* JADX WARN: Code duplicated, block: B:90:0x011c  */
    /* JADX WARN: Code duplicated, block: B:93:0x0128  */
    /* JADX WARN: Code duplicated, block: B:96:0x01f3  */
    /* JADX WARN: Code duplicated, block: B:99:0x024a  */
    /* JADX WARN: Type inference fix 'apply assigned field type' failed
    java.lang.UnsupportedOperationException: ArgType.getObject(), call class: class jadx.core.dex.instructions.args.ArgType$UnknownArg
    	at jadx.core.dex.instructions.args.ArgType.getObject(ArgType.java:596)
    	at jadx.core.dex.attributes.nodes.ClassTypeVarsAttr.getTypeVarsMapFor(ClassTypeVarsAttr.java:35)
    	at jadx.core.dex.nodes.utils.TypeUtils.replaceClassGenerics(TypeUtils.java:177)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.insertExplicitUseCast(FixTypesVisitor.java:397)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.tryFieldTypeWithNewCasts(FixTypesVisitor.java:359)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.applyFieldType(FixTypesVisitor.java:309)
    	at jadx.core.dex.visitors.typeinference.FixTypesVisitor.visit(FixTypesVisitor.java:94)
     */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final void w(@Nullable androidx.compose.ui.a0 a0Var, long j10, float f10, long j11, int i10, @Nullable androidx.compose.runtime.c0 c0Var, final int i11, final int i12) {
        androidx.compose.ui.a0 a0Var2;
        int i13;
        long j12;
        float fB;
        int i14;
        int i15;
        int i16;
        boolean z10;
        final androidx.compose.ui.a0 a0Var3;
        final int i17;
        final long j13;
        final float f11;
        final long j14;
        androidx.compose.runtime.s5 s5VarT;
        androidx.compose.ui.a0 a0Var4;
        long jS;
        final long j15;
        int iC;
        long j16;
        int i18;
        final float f12;
        final androidx.compose.ui.graphics.drawscope.n nVar;
        final androidx.compose.runtime.n7 n7VarF;
        final androidx.compose.runtime.n7<Float> n7VarD;
        Object objI0;
        androidx.compose.runtime.c0.a aVar;
        final androidx.compose.runtime.n7<Float> n7VarD2;
        Object objI1;
        final androidx.compose.runtime.n7<Float> n7VarD3;
        boolean z11;
        boolean z12;
        boolean z13;
        Object objI2;
        final long j17;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1119119072);
        int i19 = i12 & 1;
        if (i19 != 0) {
            i13 = i11 | 6;
            a0Var2 = a0Var;
        } else if ((i11 & 6) == 0) {
            a0Var2 = a0Var;
            i13 = (c0VarR.D(a0Var2) ? 4 : 2) | i11;
        } else {
            a0Var2 = a0Var;
            i13 = i11;
        }
        if ((i11 & 48) == 0) {
            j12 = j10;
            i13 |= ((i12 & 2) == 0 && c0VarR.L(j12)) ? 32 : 16;
        } else {
            j12 = j10;
        }
        int i20 = i12 & 4;
        if (i20 == 0) {
            if ((i11 & androidx.media3.exoplayer.a5.S0) == 0) {
                fB = f10;
                i13 |= c0VarR.I(fB) ? 256 : 128;
            }
            i14 = i12 & 8;
            if (i14 != 0) {
                if ((i11 & 3072) == 0) {
                    if (c0VarR.L(j11)) {
                        i15 = 2048;
                    } else {
                        i15 = 1024;
                    }
                    i13 |= i15;
                }
                if ((i11 & 24576) == 0) {
                    if ((i12 & 16) == 0) {
                        i16 = i10;
                        int i21 = c0VarR.K(i16) ? 16384 : 8192;
                        i13 |= i21;
                    } else {
                        i16 = i10;
                    }
                    i13 |= i21;
                } else {
                    i16 = i10;
                }
                if ((i13 & 9363) != 9362) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i13 & 1)) {
                    c0VarR.l0();
                    if ((i11 & 1) != 0 || c0VarR.y()) {
                        if (i19 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if ((i12 & 2) != 0) {
                            i13 &= -113;
                            j12 = x9.f25488a.a(c0VarR, 6).j();
                        }
                        if (i20 != 0) {
                            fB = oc.f24062a.b();
                        }
                        if (i14 != 0) {
                            jS = androidx.compose.ui.graphics.q0.f38131b.s();
                        } else {
                            jS = j11;
                        }
                        if ((i12 & 16) != 0) {
                            j15 = jS;
                            iC = androidx.compose.ui.graphics.u3.f38256b.c();
                            j16 = j12;
                            i18 = i13 & (-57345);
                        } else {
                            j15 = jS;
                        }
                        f12 = fB;
                        c0VarR.Z();
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.A0(-1119119072, i18, -1, "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:353)");
                        }
                        nVar = new androidx.compose.ui.graphics.drawscope.n(((androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m())).S7(f12), 0.0f, iC, 0, null, 26, null);
                        int i22 = iC;
                        androidx.compose.animation.core.i1 i1VarJ = androidx.compose.animation.core.n1.j(null, c0VarR, 0, 1);
                        androidx.compose.animation.core.z3<Integer, androidx.compose.animation.core.s> z3VarQ = androidx.compose.animation.core.t4.Q(kotlin.jvm.internal.i0.f312739a);
                        androidx.compose.ui.a0 a0Var5 = a0Var4;
                        androidx.compose.animation.core.g1 g1VarG = androidx.compose.animation.core.p.g(androidx.compose.animation.core.p.t(6660, 0, androidx.compose.animation.core.u0.e(), 2, null), null, 0L, 6, null);
                        int i23 = androidx.compose.animation.core.i1.f13005f;
                        int i24 = androidx.compose.animation.core.g1.f12967d;
                        n7VarF = androidx.compose.animation.core.n1.f(i1VarJ, 0, 5, z3VarQ, g1VarG, null, c0VarR, i23 | 432 | (i24 << 12), 16);
                        n7VarD = androidx.compose.animation.core.n1.d(i1VarJ, 0.0f, f23537t, androidx.compose.animation.core.p.g(androidx.compose.animation.core.p.t(f23535r, 0, androidx.compose.animation.core.u0.e(), 2, null), null, 0L, 6, null), null, c0VarR, i23 | 432 | (i24 << 9), 8);
                        objI0 = c0VarR.i0();
                        aVar = androidx.compose.runtime.c0.f35327a;
                        if (objI0 == aVar.a()) {
                            objI0 = new Function1() { // from class: androidx.compose.material.cd
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return kd.D((androidx.compose.animation.core.q1.b) obj);
                                }
                            };
                            c0VarR.Y(objI0);
                        }
                        n7VarD2 = androidx.compose.animation.core.n1.d(i1VarJ, 0.0f, f23538u, androidx.compose.animation.core.p.g(androidx.compose.animation.core.p.h((Function1) objI0), null, 0L, 6, null), null, c0VarR, i23 | 432 | (i24 << 9), 8);
                        objI1 = c0VarR.i0();
                        if (objI1 == aVar.a()) {
                            objI1 = new Function1() { // from class: androidx.compose.material.dd
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return kd.F((androidx.compose.animation.core.q1.b) obj);
                                }
                            };
                            c0VarR.Y(objI1);
                        }
                        n7VarD3 = androidx.compose.animation.core.n1.d(i1VarJ, 0.0f, f23538u, androidx.compose.animation.core.p.g(androidx.compose.animation.core.p.h((Function1) objI1), null, 0L, 6, null), null, c0VarR, i23 | 432 | (i24 << 9), 8);
                        androidx.compose.ui.a0 a0VarW = androidx.compose.foundation.layout.i6.w(androidx.compose.foundation.m4.c(a0Var5), f23520c);
                        if ((i18 & 7168) == 2048) {
                            z11 = true;
                        } else {
                            z11 = false;
                        }
                        boolean zK0 = c0VarR.k0(nVar) | z11 | c0VarR.D(n7VarF) | c0VarR.D(n7VarD2) | c0VarR.D(n7VarD3) | c0VarR.D(n7VarD);
                        if ((i18 & 896) == 256) {
                            z12 = true;
                        } else {
                            z12 = false;
                        }
                        z13 = zK0 | z12 | ((((i18 & com.planner5d.library.engine.input.f.b.B) ^ 48) <= 32 && c0VarR.L(j16)) || (i18 & 48) == 32);
                        objI2 = c0VarR.i0();
                        if (!z13 || objI2 == aVar.a()) {
                            j17 = j16;
                            objI2 = new Function1() { // from class: androidx.compose.material.ed
                                @Override // kotlin.jvm.functions.Function1
                                public final Object invoke(Object obj) {
                                    return kd.H(j15, nVar, f12, j17, n7VarF, n7VarD2, n7VarD3, n7VarD, (androidx.compose.ui.graphics.drawscope.f) obj);
                                }
                            };
                            c0VarR.Y(objI2);
                        } else {
                            j17 = j16;
                        }
                        androidx.compose.foundation.f1.e(a0VarW, (Function1) objI2, c0VarR, 0);
                        if (androidx.compose.runtime.m0.l0()) {
                            androidx.compose.runtime.m0.z0();
                        }
                        i17 = i22;
                        j14 = j15;
                        f11 = f12;
                        j13 = j17;
                        a0Var3 = a0Var5;
                    } else {
                        c0VarR.u();
                        if ((i12 & 2) != 0) {
                            i13 &= -113;
                        }
                        if ((i12 & 16) != 0) {
                            i13 &= -57345;
                        }
                        j15 = j11;
                        a0Var4 = a0Var2;
                    }
                    i18 = i13;
                    iC = i16;
                    j16 = j12;
                    f12 = fB;
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-1119119072, i18, -1, "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:353)");
                    }
                    nVar = new androidx.compose.ui.graphics.drawscope.n(((androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m())).S7(f12), 0.0f, iC, 0, null, 26, null);
                    int i25 = iC;
                    androidx.compose.animation.core.i1 i1VarJ2 = androidx.compose.animation.core.n1.j(null, c0VarR, 0, 1);
                    androidx.compose.animation.core.z3<Integer, androidx.compose.animation.core.s> z3VarQ2 = androidx.compose.animation.core.t4.Q(kotlin.jvm.internal.i0.f312739a);
                    androidx.compose.ui.a0 a0Var6 = a0Var4;
                    androidx.compose.animation.core.g1 g1VarG2 = androidx.compose.animation.core.p.g(androidx.compose.animation.core.p.t(6660, 0, androidx.compose.animation.core.u0.e(), 2, null), null, 0L, 6, null);
                    int i26 = androidx.compose.animation.core.i1.f13005f;
                    int i27 = androidx.compose.animation.core.g1.f12967d;
                    n7VarF = androidx.compose.animation.core.n1.f(i1VarJ2, 0, 5, z3VarQ2, g1VarG2, null, c0VarR, i26 | 432 | (i27 << 12), 16);
                    n7VarD = androidx.compose.animation.core.n1.d(i1VarJ2, 0.0f, f23537t, androidx.compose.animation.core.p.g(androidx.compose.animation.core.p.t(f23535r, 0, androidx.compose.animation.core.u0.e(), 2, null), null, 0L, 6, null), null, c0VarR, i26 | 432 | (i27 << 9), 8);
                    objI0 = c0VarR.i0();
                    aVar = androidx.compose.runtime.c0.f35327a;
                    if (objI0 == aVar.a()) {
                        objI0 = new Function1() { // from class: androidx.compose.material.cd
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return kd.D((androidx.compose.animation.core.q1.b) obj);
                            }
                        };
                        c0VarR.Y(objI0);
                    }
                    n7VarD2 = androidx.compose.animation.core.n1.d(i1VarJ2, 0.0f, f23538u, androidx.compose.animation.core.p.g(androidx.compose.animation.core.p.h((Function1) objI0), null, 0L, 6, null), null, c0VarR, i26 | 432 | (i27 << 9), 8);
                    objI1 = c0VarR.i0();
                    if (objI1 == aVar.a()) {
                        objI1 = new Function1() { // from class: androidx.compose.material.dd
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return kd.F((androidx.compose.animation.core.q1.b) obj);
                            }
                        };
                        c0VarR.Y(objI1);
                    }
                    n7VarD3 = androidx.compose.animation.core.n1.d(i1VarJ2, 0.0f, f23538u, androidx.compose.animation.core.p.g(androidx.compose.animation.core.p.h((Function1) objI1), null, 0L, 6, null), null, c0VarR, i26 | 432 | (i27 << 9), 8);
                    androidx.compose.ui.a0 a0VarW2 = androidx.compose.foundation.layout.i6.w(androidx.compose.foundation.m4.c(a0Var6), f23520c);
                    if ((i18 & 7168) == 2048) {
                        z11 = true;
                    } else {
                        z11 = false;
                    }
                    boolean zK1 = c0VarR.k0(nVar) | z11 | c0VarR.D(n7VarF) | c0VarR.D(n7VarD2) | c0VarR.D(n7VarD3) | c0VarR.D(n7VarD);
                    if ((i18 & 896) == 256) {
                        z12 = true;
                    } else {
                        z12 = false;
                    }
                    z13 = zK1 | z12 | ((((i18 & com.planner5d.library.engine.input.f.b.B) ^ 48) <= 32 && c0VarR.L(j16)) || (i18 & 48) == 32);
                    objI2 = c0VarR.i0();
                    if (z13) {
                        j17 = j16;
                        objI2 = new Function1() { // from class: androidx.compose.material.ed
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return kd.H(j15, nVar, f12, j17, n7VarF, n7VarD2, n7VarD3, n7VarD, (androidx.compose.ui.graphics.drawscope.f) obj);
                            }
                        };
                        c0VarR.Y(objI2);
                    } else {
                        j17 = j16;
                        objI2 = new Function1() { // from class: androidx.compose.material.ed
                            @Override // kotlin.jvm.functions.Function1
                            public final Object invoke(Object obj) {
                                return kd.H(j15, nVar, f12, j17, n7VarF, n7VarD2, n7VarD3, n7VarD, (androidx.compose.ui.graphics.drawscope.f) obj);
                            }
                        };
                        c0VarR.Y(objI2);
                    }
                    androidx.compose.foundation.f1.e(a0VarW2, (Function1) objI2, c0VarR, 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    i17 = i25;
                    j14 = j15;
                    f11 = f12;
                    j13 = j17;
                    a0Var3 = a0Var6;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    i17 = i16;
                    j13 = j12;
                    f11 = fB;
                    j14 = j11;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.fd
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return kd.I(a0Var3, j13, f11, j14, i17, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i13 |= 3072;
            if ((i11 & 24576) == 0) {
                if ((i12 & 16) == 0) {
                    i16 = i10;
                    if (c0VarR.K(i16)) {
                    }
                    i13 |= i21;
                } else {
                    i16 = i10;
                }
                i13 |= i21;
            } else {
                i16 = i10;
            }
            if ((i13 & 9363) != 9362) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i13 & 1)) {
                c0VarR.l0();
                if ((i11 & 1) != 0) {
                    if (i19 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if ((i12 & 2) != 0) {
                        i13 &= -113;
                        j12 = x9.f25488a.a(c0VarR, 6).j();
                    }
                    if (i20 != 0) {
                        fB = oc.f24062a.b();
                    }
                    if (i14 != 0) {
                        jS = androidx.compose.ui.graphics.q0.f38131b.s();
                    } else {
                        jS = j11;
                    }
                    if ((i12 & 16) != 0) {
                        j15 = jS;
                        iC = androidx.compose.ui.graphics.u3.f38256b.c();
                        j16 = j12;
                        i18 = i13 & (-57345);
                    } else {
                        j15 = jS;
                        i18 = i13;
                        iC = i16;
                        j16 = j12;
                    }
                } else {
                    if (i19 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if ((i12 & 2) != 0) {
                        i13 &= -113;
                        j12 = x9.f25488a.a(c0VarR, 6).j();
                    }
                    if (i20 != 0) {
                        fB = oc.f24062a.b();
                    }
                    if (i14 != 0) {
                        jS = androidx.compose.ui.graphics.q0.f38131b.s();
                    } else {
                        jS = j11;
                    }
                    if ((i12 & 16) != 0) {
                        j15 = jS;
                        iC = androidx.compose.ui.graphics.u3.f38256b.c();
                        j16 = j12;
                        i18 = i13 & (-57345);
                    } else {
                        j15 = jS;
                        i18 = i13;
                        iC = i16;
                        j16 = j12;
                    }
                }
                f12 = fB;
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1119119072, i18, -1, "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:353)");
                }
                nVar = new androidx.compose.ui.graphics.drawscope.n(((androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m())).S7(f12), 0.0f, iC, 0, null, 26, null);
                int i28 = iC;
                androidx.compose.animation.core.i1 i1VarJ3 = androidx.compose.animation.core.n1.j(null, c0VarR, 0, 1);
                androidx.compose.animation.core.z3<Integer, androidx.compose.animation.core.s> z3VarQ3 = androidx.compose.animation.core.t4.Q(kotlin.jvm.internal.i0.f312739a);
                androidx.compose.ui.a0 a0Var7 = a0Var4;
                androidx.compose.animation.core.g1 g1VarG3 = androidx.compose.animation.core.p.g(androidx.compose.animation.core.p.t(6660, 0, androidx.compose.animation.core.u0.e(), 2, null), null, 0L, 6, null);
                int i29 = androidx.compose.animation.core.i1.f13005f;
                int i210 = androidx.compose.animation.core.g1.f12967d;
                n7VarF = androidx.compose.animation.core.n1.f(i1VarJ3, 0, 5, z3VarQ3, g1VarG3, null, c0VarR, i29 | 432 | (i210 << 12), 16);
                n7VarD = androidx.compose.animation.core.n1.d(i1VarJ3, 0.0f, f23537t, androidx.compose.animation.core.p.g(androidx.compose.animation.core.p.t(f23535r, 0, androidx.compose.animation.core.u0.e(), 2, null), null, 0L, 6, null), null, c0VarR, i29 | 432 | (i210 << 9), 8);
                objI0 = c0VarR.i0();
                aVar = androidx.compose.runtime.c0.f35327a;
                if (objI0 == aVar.a()) {
                    objI0 = new Function1() { // from class: androidx.compose.material.cd
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return kd.D((androidx.compose.animation.core.q1.b) obj);
                        }
                    };
                    c0VarR.Y(objI0);
                }
                n7VarD2 = androidx.compose.animation.core.n1.d(i1VarJ3, 0.0f, f23538u, androidx.compose.animation.core.p.g(androidx.compose.animation.core.p.h((Function1) objI0), null, 0L, 6, null), null, c0VarR, i29 | 432 | (i210 << 9), 8);
                objI1 = c0VarR.i0();
                if (objI1 == aVar.a()) {
                    objI1 = new Function1() { // from class: androidx.compose.material.dd
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return kd.F((androidx.compose.animation.core.q1.b) obj);
                        }
                    };
                    c0VarR.Y(objI1);
                }
                n7VarD3 = androidx.compose.animation.core.n1.d(i1VarJ3, 0.0f, f23538u, androidx.compose.animation.core.p.g(androidx.compose.animation.core.p.h((Function1) objI1), null, 0L, 6, null), null, c0VarR, i29 | 432 | (i210 << 9), 8);
                androidx.compose.ui.a0 a0VarW3 = androidx.compose.foundation.layout.i6.w(androidx.compose.foundation.m4.c(a0Var7), f23520c);
                if ((i18 & 7168) == 2048) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                boolean zK2 = c0VarR.k0(nVar) | z11 | c0VarR.D(n7VarF) | c0VarR.D(n7VarD2) | c0VarR.D(n7VarD3) | c0VarR.D(n7VarD);
                if ((i18 & 896) == 256) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                z13 = zK2 | z12 | ((((i18 & com.planner5d.library.engine.input.f.b.B) ^ 48) <= 32 && c0VarR.L(j16)) || (i18 & 48) == 32);
                objI2 = c0VarR.i0();
                if (z13) {
                    j17 = j16;
                    objI2 = new Function1() { // from class: androidx.compose.material.ed
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return kd.H(j15, nVar, f12, j17, n7VarF, n7VarD2, n7VarD3, n7VarD, (androidx.compose.ui.graphics.drawscope.f) obj);
                        }
                    };
                    c0VarR.Y(objI2);
                } else {
                    j17 = j16;
                    objI2 = new Function1() { // from class: androidx.compose.material.ed
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return kd.H(j15, nVar, f12, j17, n7VarF, n7VarD2, n7VarD3, n7VarD, (androidx.compose.ui.graphics.drawscope.f) obj);
                        }
                    };
                    c0VarR.Y(objI2);
                }
                androidx.compose.foundation.f1.e(a0VarW3, (Function1) objI2, c0VarR, 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                i17 = i28;
                j14 = j15;
                f11 = f12;
                j13 = j17;
                a0Var3 = a0Var7;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                i17 = i16;
                j13 = j12;
                f11 = fB;
                j14 = j11;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material.fd
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return kd.I(a0Var3, j13, f11, j14, i17, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= androidx.media3.exoplayer.a5.S0;
        fB = f10;
        i14 = i12 & 8;
        if (i14 != 0) {
            if ((i11 & 3072) == 0) {
                if (c0VarR.L(j11)) {
                    i15 = 2048;
                } else {
                    i15 = 1024;
                }
                i13 |= i15;
            }
            if ((i11 & 24576) == 0) {
                if ((i12 & 16) == 0) {
                    i16 = i10;
                    if (c0VarR.K(i16)) {
                    }
                    i13 |= i21;
                } else {
                    i16 = i10;
                }
                i13 |= i21;
            } else {
                i16 = i10;
            }
            if ((i13 & 9363) != 9362) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i13 & 1)) {
                c0VarR.l0();
                if ((i11 & 1) != 0) {
                    if (i19 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if ((i12 & 2) != 0) {
                        i13 &= -113;
                        j12 = x9.f25488a.a(c0VarR, 6).j();
                    }
                    if (i20 != 0) {
                        fB = oc.f24062a.b();
                    }
                    if (i14 != 0) {
                        jS = androidx.compose.ui.graphics.q0.f38131b.s();
                    } else {
                        jS = j11;
                    }
                    if ((i12 & 16) != 0) {
                        j15 = jS;
                        iC = androidx.compose.ui.graphics.u3.f38256b.c();
                        j16 = j12;
                        i18 = i13 & (-57345);
                    } else {
                        j15 = jS;
                        i18 = i13;
                        iC = i16;
                        j16 = j12;
                    }
                } else {
                    if (i19 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if ((i12 & 2) != 0) {
                        i13 &= -113;
                        j12 = x9.f25488a.a(c0VarR, 6).j();
                    }
                    if (i20 != 0) {
                        fB = oc.f24062a.b();
                    }
                    if (i14 != 0) {
                        jS = androidx.compose.ui.graphics.q0.f38131b.s();
                    } else {
                        jS = j11;
                    }
                    if ((i12 & 16) != 0) {
                        j15 = jS;
                        iC = androidx.compose.ui.graphics.u3.f38256b.c();
                        j16 = j12;
                        i18 = i13 & (-57345);
                    } else {
                        j15 = jS;
                        i18 = i13;
                        iC = i16;
                        j16 = j12;
                    }
                }
                f12 = fB;
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-1119119072, i18, -1, "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:353)");
                }
                nVar = new androidx.compose.ui.graphics.drawscope.n(((androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m())).S7(f12), 0.0f, iC, 0, null, 26, null);
                int i211 = iC;
                androidx.compose.animation.core.i1 i1VarJ4 = androidx.compose.animation.core.n1.j(null, c0VarR, 0, 1);
                androidx.compose.animation.core.z3<Integer, androidx.compose.animation.core.s> z3VarQ4 = androidx.compose.animation.core.t4.Q(kotlin.jvm.internal.i0.f312739a);
                androidx.compose.ui.a0 a0Var8 = a0Var4;
                androidx.compose.animation.core.g1 g1VarG4 = androidx.compose.animation.core.p.g(androidx.compose.animation.core.p.t(6660, 0, androidx.compose.animation.core.u0.e(), 2, null), null, 0L, 6, null);
                int i212 = androidx.compose.animation.core.i1.f13005f;
                int i213 = androidx.compose.animation.core.g1.f12967d;
                n7VarF = androidx.compose.animation.core.n1.f(i1VarJ4, 0, 5, z3VarQ4, g1VarG4, null, c0VarR, i212 | 432 | (i213 << 12), 16);
                n7VarD = androidx.compose.animation.core.n1.d(i1VarJ4, 0.0f, f23537t, androidx.compose.animation.core.p.g(androidx.compose.animation.core.p.t(f23535r, 0, androidx.compose.animation.core.u0.e(), 2, null), null, 0L, 6, null), null, c0VarR, i212 | 432 | (i213 << 9), 8);
                objI0 = c0VarR.i0();
                aVar = androidx.compose.runtime.c0.f35327a;
                if (objI0 == aVar.a()) {
                    objI0 = new Function1() { // from class: androidx.compose.material.cd
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return kd.D((androidx.compose.animation.core.q1.b) obj);
                        }
                    };
                    c0VarR.Y(objI0);
                }
                n7VarD2 = androidx.compose.animation.core.n1.d(i1VarJ4, 0.0f, f23538u, androidx.compose.animation.core.p.g(androidx.compose.animation.core.p.h((Function1) objI0), null, 0L, 6, null), null, c0VarR, i212 | 432 | (i213 << 9), 8);
                objI1 = c0VarR.i0();
                if (objI1 == aVar.a()) {
                    objI1 = new Function1() { // from class: androidx.compose.material.dd
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return kd.F((androidx.compose.animation.core.q1.b) obj);
                        }
                    };
                    c0VarR.Y(objI1);
                }
                n7VarD3 = androidx.compose.animation.core.n1.d(i1VarJ4, 0.0f, f23538u, androidx.compose.animation.core.p.g(androidx.compose.animation.core.p.h((Function1) objI1), null, 0L, 6, null), null, c0VarR, i212 | 432 | (i213 << 9), 8);
                androidx.compose.ui.a0 a0VarW4 = androidx.compose.foundation.layout.i6.w(androidx.compose.foundation.m4.c(a0Var8), f23520c);
                if ((i18 & 7168) == 2048) {
                    z11 = true;
                } else {
                    z11 = false;
                }
                boolean zK3 = c0VarR.k0(nVar) | z11 | c0VarR.D(n7VarF) | c0VarR.D(n7VarD2) | c0VarR.D(n7VarD3) | c0VarR.D(n7VarD);
                if ((i18 & 896) == 256) {
                    z12 = true;
                } else {
                    z12 = false;
                }
                z13 = zK3 | z12 | ((((i18 & com.planner5d.library.engine.input.f.b.B) ^ 48) <= 32 && c0VarR.L(j16)) || (i18 & 48) == 32);
                objI2 = c0VarR.i0();
                if (z13) {
                    j17 = j16;
                    objI2 = new Function1() { // from class: androidx.compose.material.ed
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return kd.H(j15, nVar, f12, j17, n7VarF, n7VarD2, n7VarD3, n7VarD, (androidx.compose.ui.graphics.drawscope.f) obj);
                        }
                    };
                    c0VarR.Y(objI2);
                } else {
                    j17 = j16;
                    objI2 = new Function1() { // from class: androidx.compose.material.ed
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            return kd.H(j15, nVar, f12, j17, n7VarF, n7VarD2, n7VarD3, n7VarD, (androidx.compose.ui.graphics.drawscope.f) obj);
                        }
                    };
                    c0VarR.Y(objI2);
                }
                androidx.compose.foundation.f1.e(a0VarW4, (Function1) objI2, c0VarR, 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                i17 = i211;
                j14 = j15;
                f11 = f12;
                j13 = j17;
                a0Var3 = a0Var8;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                i17 = i16;
                j13 = j12;
                f11 = fB;
                j14 = j11;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material.fd
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return kd.I(a0Var3, j13, f11, j14, i17, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i13 |= 3072;
        if ((i11 & 24576) == 0) {
            if ((i12 & 16) == 0) {
                i16 = i10;
                if (c0VarR.K(i16)) {
                }
                i13 |= i21;
            } else {
                i16 = i10;
            }
            i13 |= i21;
        } else {
            i16 = i10;
        }
        if ((i13 & 9363) != 9362) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c0VarR.h(z10, i13 & 1)) {
            c0VarR.l0();
            if ((i11 & 1) != 0) {
                if (i19 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if ((i12 & 2) != 0) {
                    i13 &= -113;
                    j12 = x9.f25488a.a(c0VarR, 6).j();
                }
                if (i20 != 0) {
                    fB = oc.f24062a.b();
                }
                if (i14 != 0) {
                    jS = androidx.compose.ui.graphics.q0.f38131b.s();
                } else {
                    jS = j11;
                }
                if ((i12 & 16) != 0) {
                    j15 = jS;
                    iC = androidx.compose.ui.graphics.u3.f38256b.c();
                    j16 = j12;
                    i18 = i13 & (-57345);
                } else {
                    j15 = jS;
                    i18 = i13;
                    iC = i16;
                    j16 = j12;
                }
            } else {
                if (i19 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if ((i12 & 2) != 0) {
                    i13 &= -113;
                    j12 = x9.f25488a.a(c0VarR, 6).j();
                }
                if (i20 != 0) {
                    fB = oc.f24062a.b();
                }
                if (i14 != 0) {
                    jS = androidx.compose.ui.graphics.q0.f38131b.s();
                } else {
                    jS = j11;
                }
                if ((i12 & 16) != 0) {
                    j15 = jS;
                    iC = androidx.compose.ui.graphics.u3.f38256b.c();
                    j16 = j12;
                    i18 = i13 & (-57345);
                } else {
                    j15 = jS;
                    i18 = i13;
                    iC = i16;
                    j16 = j12;
                }
            }
            f12 = fB;
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1119119072, i18, -1, "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:353)");
            }
            nVar = new androidx.compose.ui.graphics.drawscope.n(((androidx.compose.ui.unit.d) c0VarR.W(androidx.compose.ui.platform.q1.m())).S7(f12), 0.0f, iC, 0, null, 26, null);
            int i214 = iC;
            androidx.compose.animation.core.i1 i1VarJ5 = androidx.compose.animation.core.n1.j(null, c0VarR, 0, 1);
            androidx.compose.animation.core.z3<Integer, androidx.compose.animation.core.s> z3VarQ5 = androidx.compose.animation.core.t4.Q(kotlin.jvm.internal.i0.f312739a);
            androidx.compose.ui.a0 a0Var9 = a0Var4;
            androidx.compose.animation.core.g1 g1VarG5 = androidx.compose.animation.core.p.g(androidx.compose.animation.core.p.t(6660, 0, androidx.compose.animation.core.u0.e(), 2, null), null, 0L, 6, null);
            int i215 = androidx.compose.animation.core.i1.f13005f;
            int i216 = androidx.compose.animation.core.g1.f12967d;
            n7VarF = androidx.compose.animation.core.n1.f(i1VarJ5, 0, 5, z3VarQ5, g1VarG5, null, c0VarR, i215 | 432 | (i216 << 12), 16);
            n7VarD = androidx.compose.animation.core.n1.d(i1VarJ5, 0.0f, f23537t, androidx.compose.animation.core.p.g(androidx.compose.animation.core.p.t(f23535r, 0, androidx.compose.animation.core.u0.e(), 2, null), null, 0L, 6, null), null, c0VarR, i215 | 432 | (i216 << 9), 8);
            objI0 = c0VarR.i0();
            aVar = androidx.compose.runtime.c0.f35327a;
            if (objI0 == aVar.a()) {
                objI0 = new Function1() { // from class: androidx.compose.material.cd
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return kd.D((androidx.compose.animation.core.q1.b) obj);
                    }
                };
                c0VarR.Y(objI0);
            }
            n7VarD2 = androidx.compose.animation.core.n1.d(i1VarJ5, 0.0f, f23538u, androidx.compose.animation.core.p.g(androidx.compose.animation.core.p.h((Function1) objI0), null, 0L, 6, null), null, c0VarR, i215 | 432 | (i216 << 9), 8);
            objI1 = c0VarR.i0();
            if (objI1 == aVar.a()) {
                objI1 = new Function1() { // from class: androidx.compose.material.dd
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return kd.F((androidx.compose.animation.core.q1.b) obj);
                    }
                };
                c0VarR.Y(objI1);
            }
            n7VarD3 = androidx.compose.animation.core.n1.d(i1VarJ5, 0.0f, f23538u, androidx.compose.animation.core.p.g(androidx.compose.animation.core.p.h((Function1) objI1), null, 0L, 6, null), null, c0VarR, i215 | 432 | (i216 << 9), 8);
            androidx.compose.ui.a0 a0VarW5 = androidx.compose.foundation.layout.i6.w(androidx.compose.foundation.m4.c(a0Var9), f23520c);
            if ((i18 & 7168) == 2048) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean zK4 = c0VarR.k0(nVar) | z11 | c0VarR.D(n7VarF) | c0VarR.D(n7VarD2) | c0VarR.D(n7VarD3) | c0VarR.D(n7VarD);
            if ((i18 & 896) == 256) {
                z12 = true;
            } else {
                z12 = false;
            }
            z13 = zK4 | z12 | ((((i18 & com.planner5d.library.engine.input.f.b.B) ^ 48) <= 32 && c0VarR.L(j16)) || (i18 & 48) == 32);
            objI2 = c0VarR.i0();
            if (z13) {
                j17 = j16;
                objI2 = new Function1() { // from class: androidx.compose.material.ed
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return kd.H(j15, nVar, f12, j17, n7VarF, n7VarD2, n7VarD3, n7VarD, (androidx.compose.ui.graphics.drawscope.f) obj);
                    }
                };
                c0VarR.Y(objI2);
            } else {
                j17 = j16;
                objI2 = new Function1() { // from class: androidx.compose.material.ed
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return kd.H(j15, nVar, f12, j17, n7VarF, n7VarD2, n7VarD3, n7VarD, (androidx.compose.ui.graphics.drawscope.f) obj);
                    }
                };
                c0VarR.Y(objI2);
            }
            androidx.compose.foundation.f1.e(a0VarW5, (Function1) objI2, c0VarR, 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            i17 = i214;
            j14 = j15;
            f11 = f12;
            j13 = j17;
            a0Var3 = a0Var9;
        } else {
            c0VarR.u();
            a0Var3 = a0Var2;
            i17 = i16;
            j13 = j12;
            f11 = fB;
            j14 = j11;
        }
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material.fd
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return kd.I(a0Var3, j13, f11, j14, i17, i11, i12, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:26:0x004a  */
    /* JADX WARN: Code duplicated, block: B:31:0x0059  */
    /* JADX WARN: Code duplicated, block: B:33:0x005d  */
    /* JADX WARN: Code duplicated, block: B:36:0x0063  */
    /* JADX WARN: Code duplicated, block: B:38:0x006a  */
    /* JADX WARN: Code duplicated, block: B:40:0x006e  */
    /* JADX WARN: Code duplicated, block: B:42:0x0076  */
    /* JADX WARN: Code duplicated, block: B:43:0x0079  */
    /* JADX WARN: Code duplicated, block: B:47:0x0082  */
    /* JADX WARN: Code duplicated, block: B:48:0x0084  */
    /* JADX WARN: Code duplicated, block: B:51:0x008d  */
    /* JADX WARN: Code duplicated, block: B:53:0x0094  */
    /* JADX WARN: Code duplicated, block: B:60:0x00a9 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:61:0x00ab  */
    /* JADX WARN: Code duplicated, block: B:62:0x00ae  */
    /* JADX WARN: Code duplicated, block: B:65:0x00b4  */
    /* JADX WARN: Code duplicated, block: B:67:0x00c3  */
    /* JADX WARN: Code duplicated, block: B:69:0x00ce  */
    /* JADX WARN: Code duplicated, block: B:72:0x00d9  */
    /* JADX WARN: Code duplicated, block: B:75:0x0105  */
    /* JADX WARN: Code duplicated, block: B:77:0x010d  */
    /* JADX WARN: Code duplicated, block: B:80:0x0119  */
    /* JADX WARN: Code duplicated, block: B:82:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.o
    @kotlin.l(level = kotlin.n.HIDDEN, message = "Maintained for binary compatibility")
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final /* synthetic */ void x(final float f10, androidx.compose.ui.a0 a0Var, long j10, float f11, androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        float f12;
        int i12;
        androidx.compose.ui.a0 a0Var2;
        long j11;
        int i13;
        float f13;
        int i14;
        boolean z10;
        final androidx.compose.ui.a0 a0Var3;
        final long j12;
        final float f14;
        androidx.compose.runtime.s5 s5VarT;
        androidx.compose.ui.a0 a0Var4;
        float fB;
        long j13;
        androidx.compose.ui.a0 a0Var5;
        int i15;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-409649739);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
            f12 = f10;
        } else if ((i10 & 6) == 0) {
            f12 = f10;
            i12 = (c0VarR.I(f12) ? 4 : 2) | i10;
        } else {
            f12 = f10;
            i12 = i10;
        }
        int i16 = i11 & 2;
        if (i16 == 0) {
            if ((i10 & 48) == 0) {
                a0Var2 = a0Var;
                i12 |= c0VarR.D(a0Var2) ? 32 : 16;
            }
            if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                j11 = j10;
                if ((i11 & 4) == 0 || !c0VarR.L(j11)) {
                    i15 = 128;
                } else {
                    i15 = 256;
                }
                i12 |= i15;
            } else {
                j11 = j10;
            }
            i13 = i11 & 8;
            if (i13 != 0) {
                if ((i10 & 3072) == 0) {
                    f13 = f11;
                    if (c0VarR.I(f13)) {
                        i14 = 2048;
                    } else {
                        i14 = 1024;
                    }
                    i12 |= i14;
                }
                if ((i12 & 1171) != 1170) {
                    z10 = true;
                } else {
                    z10 = false;
                }
                if (c0VarR.h(z10, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0 || c0VarR.y()) {
                        if (i16 != 0) {
                            a0Var4 = androidx.compose.ui.a0.E;
                        } else {
                            a0Var4 = a0Var2;
                        }
                        if ((i11 & 4) != 0) {
                            j11 = x9.f25488a.a(c0VarR, 6).j();
                            i12 &= -897;
                        }
                        if (i13 != 0) {
                            fB = oc.f24062a.b();
                        } else {
                            fB = f13;
                        }
                        j13 = j11;
                        a0Var5 = a0Var4;
                    } else {
                        c0VarR.u();
                        if ((i11 & 4) != 0) {
                            i12 &= -897;
                        }
                        fB = f13;
                        j13 = j11;
                        a0Var5 = a0Var2;
                    }
                    c0VarR.Z();
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.A0(-409649739, i12, -1, "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:430)");
                    }
                    v(f12, a0Var5, j13, fB, androidx.compose.ui.graphics.q0.f38131b.s(), androidx.compose.ui.graphics.u3.f38256b.a(), c0VarR, (i12 & 14) | 24576 | (i12 & com.planner5d.library.engine.input.f.b.B) | (i12 & 896) | (i12 & 7168), 0);
                    if (androidx.compose.runtime.m0.l0()) {
                        androidx.compose.runtime.m0.z0();
                    }
                    a0Var3 = a0Var5;
                    j12 = j13;
                    f14 = fB;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    j12 = j11;
                    f14 = f13;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.yc
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return kd.J(f10, a0Var3, j12, f14, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= 3072;
            f13 = f11;
            if ((i12 & 1171) != 1170) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i16 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if ((i11 & 4) != 0) {
                        j11 = x9.f25488a.a(c0VarR, 6).j();
                        i12 &= -897;
                    }
                    if (i13 != 0) {
                        fB = oc.f24062a.b();
                    } else {
                        fB = f13;
                    }
                    j13 = j11;
                    a0Var5 = a0Var4;
                } else {
                    if (i16 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if ((i11 & 4) != 0) {
                        j11 = x9.f25488a.a(c0VarR, 6).j();
                        i12 &= -897;
                    }
                    if (i13 != 0) {
                        fB = oc.f24062a.b();
                    } else {
                        fB = f13;
                    }
                    j13 = j11;
                    a0Var5 = a0Var4;
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-409649739, i12, -1, "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:430)");
                }
                v(f12, a0Var5, j13, fB, androidx.compose.ui.graphics.q0.f38131b.s(), androidx.compose.ui.graphics.u3.f38256b.a(), c0VarR, (i12 & 14) | 24576 | (i12 & com.planner5d.library.engine.input.f.b.B) | (i12 & 896) | (i12 & 7168), 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var5;
                j12 = j13;
                f14 = fB;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                j12 = j11;
                f14 = f13;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material.yc
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return kd.J(f10, a0Var3, j12, f14, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 48;
        a0Var2 = a0Var;
        if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
            j11 = j10;
            if ((i11 & 4) == 0) {
                i15 = 128;
            } else {
                i15 = 128;
            }
            i12 |= i15;
        } else {
            j11 = j10;
        }
        i13 = i11 & 8;
        if (i13 != 0) {
            if ((i10 & 3072) == 0) {
                f13 = f11;
                if (c0VarR.I(f13)) {
                    i14 = 2048;
                } else {
                    i14 = 1024;
                }
                i12 |= i14;
            }
            if ((i12 & 1171) != 1170) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i16 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if ((i11 & 4) != 0) {
                        j11 = x9.f25488a.a(c0VarR, 6).j();
                        i12 &= -897;
                    }
                    if (i13 != 0) {
                        fB = oc.f24062a.b();
                    } else {
                        fB = f13;
                    }
                    j13 = j11;
                    a0Var5 = a0Var4;
                } else {
                    if (i16 != 0) {
                        a0Var4 = androidx.compose.ui.a0.E;
                    } else {
                        a0Var4 = a0Var2;
                    }
                    if ((i11 & 4) != 0) {
                        j11 = x9.f25488a.a(c0VarR, 6).j();
                        i12 &= -897;
                    }
                    if (i13 != 0) {
                        fB = oc.f24062a.b();
                    } else {
                        fB = f13;
                    }
                    j13 = j11;
                    a0Var5 = a0Var4;
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-409649739, i12, -1, "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:430)");
                }
                v(f12, a0Var5, j13, fB, androidx.compose.ui.graphics.q0.f38131b.s(), androidx.compose.ui.graphics.u3.f38256b.a(), c0VarR, (i12 & 14) | 24576 | (i12 & com.planner5d.library.engine.input.f.b.B) | (i12 & 896) | (i12 & 7168), 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var5;
                j12 = j13;
                f14 = fB;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                j12 = j11;
                f14 = f13;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material.yc
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return kd.J(f10, a0Var3, j12, f14, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 3072;
        f13 = f11;
        if ((i12 & 1171) != 1170) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c0VarR.h(z10, i12 & 1)) {
            c0VarR.l0();
            if ((i10 & 1) != 0) {
                if (i16 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if ((i11 & 4) != 0) {
                    j11 = x9.f25488a.a(c0VarR, 6).j();
                    i12 &= -897;
                }
                if (i13 != 0) {
                    fB = oc.f24062a.b();
                } else {
                    fB = f13;
                }
                j13 = j11;
                a0Var5 = a0Var4;
            } else {
                if (i16 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if ((i11 & 4) != 0) {
                    j11 = x9.f25488a.a(c0VarR, 6).j();
                    i12 &= -897;
                }
                if (i13 != 0) {
                    fB = oc.f24062a.b();
                } else {
                    fB = f13;
                }
                j13 = j11;
                a0Var5 = a0Var4;
            }
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-409649739, i12, -1, "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:430)");
            }
            v(f12, a0Var5, j13, fB, androidx.compose.ui.graphics.q0.f38131b.s(), androidx.compose.ui.graphics.u3.f38256b.a(), c0VarR, (i12 & 14) | 24576 | (i12 & com.planner5d.library.engine.input.f.b.B) | (i12 & 896) | (i12 & 7168), 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            a0Var3 = a0Var5;
            j12 = j13;
            f14 = fB;
        } else {
            c0VarR.u();
            a0Var3 = a0Var2;
            j12 = j11;
            f14 = f13;
        }
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material.yc
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return kd.J(f10, a0Var3, j12, f14, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX WARN: Code duplicated, block: B:36:0x0066  */
    /* JADX WARN: Code duplicated, block: B:37:0x0068  */
    /* JADX WARN: Code duplicated, block: B:40:0x0071  */
    /* JADX WARN: Code duplicated, block: B:49:0x008d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:50:0x008f  */
    /* JADX WARN: Code duplicated, block: B:51:0x0092  */
    /* JADX WARN: Code duplicated, block: B:54:0x0098  */
    /* JADX WARN: Code duplicated, block: B:56:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:58:0x00b3  */
    /* JADX WARN: Code duplicated, block: B:61:0x00be  */
    /* JADX WARN: Code duplicated, block: B:64:0x00e5  */
    /* JADX WARN: Code duplicated, block: B:66:0x00ed  */
    /* JADX WARN: Code duplicated, block: B:69:0x00fa  */
    /* JADX WARN: Code duplicated, block: B:71:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.o
    @kotlin.l(level = kotlin.n.HIDDEN, message = "Maintained for binary compatibility")
    @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
    public static final /* synthetic */ void y(androidx.compose.ui.a0 a0Var, long j10, float f10, androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        androidx.compose.ui.a0 a0Var2;
        int i12;
        long j11;
        float f11;
        boolean z10;
        final androidx.compose.ui.a0 a0Var3;
        final long j12;
        final float f12;
        androidx.compose.runtime.s5 s5VarT;
        androidx.compose.ui.a0 a0Var4;
        float fB;
        long j13;
        androidx.compose.ui.a0 a0Var5;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-392089979);
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
            j11 = j10;
            i12 |= ((i11 & 2) == 0 && c0VarR.L(j11)) ? 32 : 16;
        } else {
            j11 = j10;
        }
        int i14 = i11 & 4;
        if (i14 == 0) {
            if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                f11 = f10;
                i12 |= c0VarR.I(f11) ? 256 : 128;
            }
            if ((i12 & com.planner5d.library.engine.input.f.b.F1) != 146) {
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
                        j11 = x9.f25488a.a(c0VarR, 6).j();
                        i12 &= -113;
                    }
                    if (i14 != 0) {
                        fB = oc.f24062a.b();
                    } else {
                        fB = f11;
                    }
                    j13 = j11;
                    a0Var5 = a0Var4;
                } else {
                    c0VarR.u();
                    if ((i11 & 2) != 0) {
                        i12 &= -113;
                    }
                    fB = f11;
                    j13 = j11;
                    a0Var5 = a0Var2;
                }
                c0VarR.Z();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-392089979, i12, -1, "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:446)");
                }
                w(a0Var5, j13, fB, androidx.compose.ui.graphics.q0.f38131b.s(), androidx.compose.ui.graphics.u3.f38256b.c(), c0VarR, (i12 & 14) | 3072 | (i12 & com.planner5d.library.engine.input.f.b.B) | (i12 & 896), 0);
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var5;
                j12 = j13;
                f12 = fB;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                j12 = j11;
                f12 = f11;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material.qc
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return kd.K(a0Var3, j12, f12, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= androidx.media3.exoplayer.a5.S0;
        f11 = f10;
        if ((i12 & com.planner5d.library.engine.input.f.b.F1) != 146) {
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
                    j11 = x9.f25488a.a(c0VarR, 6).j();
                    i12 &= -113;
                }
                if (i14 != 0) {
                    fB = oc.f24062a.b();
                } else {
                    fB = f11;
                }
                j13 = j11;
                a0Var5 = a0Var4;
            } else {
                if (i13 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if ((i11 & 2) != 0) {
                    j11 = x9.f25488a.a(c0VarR, 6).j();
                    i12 &= -113;
                }
                if (i14 != 0) {
                    fB = oc.f24062a.b();
                } else {
                    fB = f11;
                }
                j13 = j11;
                a0Var5 = a0Var4;
            }
            c0VarR.Z();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-392089979, i12, -1, "androidx.compose.material.CircularProgressIndicator (ProgressIndicator.kt:446)");
            }
            w(a0Var5, j13, fB, androidx.compose.ui.graphics.q0.f38131b.s(), androidx.compose.ui.graphics.u3.f38256b.c(), c0VarR, (i12 & 14) | 3072 | (i12 & com.planner5d.library.engine.input.f.b.B) | (i12 & 896), 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            a0Var3 = a0Var5;
            j12 = j13;
            f12 = fB;
        } else {
            c0VarR.u();
            a0Var3 = a0Var2;
            j12 = j11;
            f12 = f11;
        }
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material.qc
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return kd.K(a0Var3, j12, f12, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit z(float f10, long j10, androidx.compose.ui.graphics.drawscope.n nVar, long j11, androidx.compose.ui.graphics.drawscope.f fVar) {
        e0(fVar, j10, nVar);
        f0(fVar, 270.0f, f10 * 360.0f, j11, nVar);
        return Unit.f312394a;
    }
}

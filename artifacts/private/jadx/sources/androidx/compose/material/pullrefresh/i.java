package androidx.compose.material.pullrefresh;

import androidx.compose.animation.core.u0;
import androidx.compose.animation.core.y3;
import androidx.compose.animation.y;
import androidx.compose.foundation.f1;
import androidx.compose.foundation.layout.d0;
import androidx.compose.foundation.layout.i6;
import androidx.compose.foundation.layout.x;
import androidx.compose.material.kd;
import androidx.compose.material.n4;
import androidx.compose.material.q7;
import androidx.compose.material.t7;
import androidx.compose.material.u7;
import androidx.compose.material.x9;
import androidx.compose.runtime.b1;
import androidx.compose.runtime.c0;
import androidx.compose.runtime.internal.w;
import androidx.compose.runtime.m0;
import androidx.compose.runtime.n7;
import androidx.compose.runtime.s5;
import androidx.compose.runtime.t;
import androidx.compose.runtime.t4;
import androidx.compose.runtime.v;
import androidx.compose.runtime.w6;
import androidx.compose.runtime.y7;
import androidx.compose.ui.a0;
import androidx.compose.ui.graphics.k2;
import androidx.compose.ui.graphics.m2;
import androidx.compose.ui.graphics.q0;
import androidx.compose.ui.graphics.u;
import androidx.compose.ui.graphics.u3;
import androidx.compose.ui.layout.a1;
import androidx.compose.ui.semantics.e0;
import androidx.media3.exoplayer.a5;
import com.canhub.cropper.core.CropImageOptions;
import com.google.android.material.internal.p0;
import com.rabbitmq.client.k0;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nPullRefreshIndicator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PullRefreshIndicator.kt\nandroidx/compose/material/pullrefresh/PullRefreshIndicatorKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 4 Dp.kt\nandroidx/compose/ui/unit/DpKt\n+ 5 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n+ 9 fake.kt\nkotlin/jvm/internal/FakeKt\n+ 10 MathHelpers.kt\nandroidx/compose/ui/util/MathHelpersKt\n+ 11 Rect.kt\nandroidx/compose/ui/geometry/Rect\n+ 12 Offset.kt\nandroidx/compose/ui/geometry/Offset\n+ 13 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 14 InlineClassHelper.jvm.kt\nandroidx/compose/ui/util/InlineClassHelper_jvmKt\n+ 15 Offset.kt\nandroidx/compose/ui/geometry/OffsetKt\n+ 16 DrawScope.kt\nandroidx/compose/ui/graphics/drawscope/DrawScopeKt\n+ 17 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,228:1\n1282#2,6:229\n1282#2,3:278\n1285#2,3:282\n1282#2,6:285\n1282#2,6:291\n75#3:235\n113#4:236\n113#4:367\n118#4:368\n118#4:369\n113#4:370\n113#4:371\n113#4:372\n70#5:237\n67#5,9:238\n77#5:277\n79#6,6:247\n86#6,3:262\n89#6,2:271\n93#6:276\n347#7,9:253\n356#7,3:273\n4206#8,6:265\n1#9:281\n65#10,10:297\n56#11,6:307\n65#12:313\n69#12:316\n65#12:351\n69#12:354\n65#12:357\n69#12:360\n60#13:314\n70#13:317\n53#13,3:319\n60#13:352\n70#13:355\n60#13:358\n70#13:361\n22#14:315\n22#14:353\n22#14:356\n22#14:359\n22#14:362\n30#15:318\n137#16,2:322\n249#16,14:324\n137#16,2:340\n249#16,9:342\n259#16,4:363\n85#17:338\n85#17:339\n*S KotlinDebug\n*F\n+ 1 PullRefreshIndicator.kt\nandroidx/compose/material/pullrefresh/PullRefreshIndicatorKt\n*L\n84#1:229,6\n126#1:278,3\n126#1:282,3\n129#1:285,6\n134#1:291,6\n89#1:235\n98#1:236\n216#1:367\n218#1:368\n219#1:369\n220#1:370\n221#1:371\n222#1:372\n93#1:237\n93#1:238,9\n93#1:277\n93#1:247,6\n93#1:262,3\n93#1:271,2\n93#1:276\n93#1:253,9\n93#1:273,3\n93#1:265,6\n176#1:297,10\n204#1:307,6\n207#1:313\n207#1:316\n142#1:351\n143#1:354\n144#1:357\n145#1:360\n207#1:314\n207#1:317\n207#1:319,3\n142#1:352\n143#1:355\n144#1:358\n145#1:361\n207#1:315\n142#1:353\n143#1:356\n144#1:359\n145#1:362\n207#1:318\n210#1:322,2\n210#1:324,14\n138#1:340,2\n138#1:342,9\n138#1:363,4\n84#1:338\n129#1:339\n*E\n"})
public final class i {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f24314a = 100;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final float f24315b = 0.8f;

    /* JADX INFO: renamed from: j, reason: collision with root package name */
    private static final float f24323j = 0.3f;

    /* JADX INFO: renamed from: k, reason: collision with root package name */
    private static final float f24324k = 1.0f;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final float f24316c = androidx.compose.ui.unit.h.r(40);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final androidx.compose.foundation.shape.n f24317d = androidx.compose.foundation.shape.o.k();

    /* JADX INFO: renamed from: e, reason: collision with root package name */
    private static final float f24318e = androidx.compose.ui.unit.h.r((float) 7.5d);

    /* JADX INFO: renamed from: f, reason: collision with root package name */
    private static final float f24319f = androidx.compose.ui.unit.h.r((float) 2.5d);

    /* JADX INFO: renamed from: g, reason: collision with root package name */
    private static final float f24320g = androidx.compose.ui.unit.h.r(10);

    /* JADX INFO: renamed from: h, reason: collision with root package name */
    private static final float f24321h = androidx.compose.ui.unit.h.r(5);

    /* JADX INFO: renamed from: i, reason: collision with root package name */
    private static final float f24322i = androidx.compose.ui.unit.h.r(6);

    /* JADX INFO: renamed from: l, reason: collision with root package name */
    @NotNull
    private static final y3<Float> f24325l = androidx.compose.animation.core.p.t(300, 0, u0.e(), 2, null);

    @SourceDebugExtension({"SMAP\nPullRefreshIndicator.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PullRefreshIndicator.kt\nandroidx/compose/material/pullrefresh/PullRefreshIndicatorKt$PullRefreshIndicator$1$1\n+ 2 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 3 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 4 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 5 Composer.kt\nandroidx/compose/runtime/Updater\n+ 6 Dp.kt\nandroidx/compose/ui/unit/Dp\n*L\n1#1,228:1\n70#2:229\n68#2,8:230\n77#2:270\n79#3,6:238\n86#3,3:253\n89#3,2:262\n93#3:269\n347#4,9:244\n356#4:264\n357#4,2:267\n4206#5,6:256\n49#6:265\n68#6:266\n*S KotlinDebug\n*F\n+ 1 PullRefreshIndicator.kt\nandroidx/compose/material/pullrefresh/PullRefreshIndicatorKt$PullRefreshIndicator$1$1\n*L\n105#1:229\n105#1:230,8\n105#1:270\n105#1:238,6\n105#1:253,3\n105#1:262,2\n105#1:269\n105#1:244,9\n105#1:264\n105#1:267,2\n105#1:256,6\n106#1:265\n106#1:266\n*E\n"})
    static final class a implements pj.n<Boolean, c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ long f24326a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ q f24327b;

        a(long j10, q qVar) {
            this.f24326a = j10;
            this.f24327b = qVar;
        }

        @androidx.compose.runtime.o
        @t(applier = "androidx.compose.ui.UiComposable")
        public final void c(boolean z10, c0 c0Var, int i10) {
            int i11;
            if ((i10 & 6) == 0) {
                i11 = (c0Var.G(z10) ? 4 : 2) | i10;
            } else {
                i11 = i10;
            }
            if (!c0Var.h((i11 & 19) != 18, i11 & 1)) {
                c0Var.u();
                return;
            }
            if (m0.l0()) {
                m0.A0(1853731063, i11, -1, "androidx.compose.material.pullrefresh.PullRefreshIndicator.<anonymous>.<anonymous> (PullRefreshIndicator.kt:104)");
            }
            a0.a aVar = a0.E;
            a0 a0VarF = i6.f(aVar, 0.0f, 1, null);
            androidx.compose.ui.e eVarI = androidx.compose.ui.e.f37317a.i();
            long j10 = this.f24326a;
            q qVar = this.f24327b;
            a1 a1VarK = x.k(eVarI, false);
            int iJ = v.j(c0Var, 0);
            b1 b1VarK = c0Var.k();
            a0 a0VarN = androidx.compose.ui.m.n(c0Var, a0VarF);
            androidx.compose.ui.node.g.a aVar2 = androidx.compose.ui.node.g.I;
            Function0<androidx.compose.ui.node.g> function0A = aVar2.a();
            if (c0Var.S() == null) {
                v.r();
            }
            c0Var.q();
            if (c0Var.P()) {
                c0Var.q0(function0A);
            } else {
                c0Var.l();
            }
            c0 c0VarD = y7.d(c0Var);
            y7.n(c0VarD, a1VarK, aVar2.e());
            y7.n(c0VarD, b1VarK, aVar2.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar2.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iJ))) {
                c0VarD.Y(Integer.valueOf(iJ));
                c0VarD.f(Integer.valueOf(iJ), function2B);
            }
            y7.n(c0VarD, a0VarN, aVar2.f());
            d0 d0Var = d0.f15956a;
            float fR = androidx.compose.ui.unit.h.r(androidx.compose.ui.unit.h.r(i.f24318e + i.f24319f) * 2);
            if (z10) {
                c0Var.E(-1916609863);
                kd.w(i6.w(aVar, fR), j10, i.f24319f, 0L, 0, c0Var, 390, 24);
                c0Var.A();
            } else {
                c0Var.E(-1916362142);
                i.h(qVar, j10, i6.w(aVar, fR), c0Var, a5.S0);
                c0Var.A();
            }
            c0Var.o();
            if (m0.l0()) {
                m0.z0();
            }
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ Unit invoke(Boolean bool, c0 c0Var, Integer num) {
            c(bool.booleanValue(), c0Var, num.intValue());
            return Unit.f312394a;
        }
    }

    static {
        boolean z10 = true & false;
    }

    private static final androidx.compose.material.pullrefresh.a g(float f10) {
        float f11 = 0.0f;
        float fMax = (Math.max(Math.min(1.0f, f10) - 0.4f, 0.0f) * 5) / 3;
        float fAbs = Math.abs(f10) - 1.0f;
        if (fAbs >= 0.0f) {
            f11 = fAbs;
        }
        if (f11 > 2.0f) {
            f11 = 2.0f;
        }
        float fPow = (((0.4f * fMax) - 0.25f) + (f11 - (((float) Math.pow(f11, 2)) / 4))) * 0.5f;
        float f12 = CropImageOptions.S3;
        return new androidx.compose.material.pullrefresh.a(fPow, fPow * f12, ((0.8f * fMax) + fPow) * f12, Math.min(1.0f, fMax));
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.o
    @u7
    @t(applier = "androidx.compose.ui.UiComposable")
    public static final void h(final q qVar, final long j10, final a0 a0Var, c0 c0Var, final int i10) {
        int i11;
        int i12;
        c0 c0VarR = c0Var.R(-486016981);
        if ((i10 & 6) == 0) {
            i11 = (c0VarR.k0(qVar) ? 4 : 2) | i10;
        } else {
            i11 = i10;
        }
        if ((i10 & 48) == 0) {
            i11 |= c0VarR.L(j10) ? 32 : 16;
        }
        if ((i10 & a5.S0) == 0) {
            i11 |= c0VarR.D(a0Var) ? 256 : 128;
        }
        if (c0VarR.h((i11 & com.planner5d.library.engine.input.f.b.F1) != 146, i11 & 1)) {
            if (m0.l0()) {
                m0.A0(-486016981, i11, -1, "androidx.compose.material.pullrefresh.CircularArrowIndicator (PullRefreshIndicator.kt:124)");
            }
            Object objI0 = c0VarR.i0();
            c0.a aVar = c0.f35327a;
            Object obj = objI0;
            if (objI0 == aVar.a()) {
                k2 k2VarA = u.a();
                k2VarA.M(m2.f38048b.a());
                c0VarR.Y(k2VarA);
                obj = k2VarA;
            }
            final k2 k2Var = (k2) obj;
            boolean zD = c0VarR.D(qVar);
            Object objI1 = c0VarR.i0();
            if (zD || objI1 == aVar.a()) {
                objI1 = w6.e(new Function0() { // from class: androidx.compose.material.pullrefresh.e
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Float.valueOf(i.l(qVar));
                    }
                });
                c0VarR.Y(objI1);
            }
            boolean z10 = true;
            final n7<Float> n7VarF = androidx.compose.animation.core.f.f(m((n7) objI1), f24325l, 0.0f, null, null, c0VarR, 48, 28);
            Object objI2 = c0VarR.i0();
            if (objI2 == aVar.a()) {
                objI2 = new Function1() { // from class: androidx.compose.material.pullrefresh.f
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return i.i((e0) obj2);
                    }
                };
                c0VarR.Y(objI2);
            }
            a0 a0VarF = androidx.compose.ui.semantics.t.f(a0Var, false, (Function1) objI2, 1, null);
            boolean zK0 = c0VarR.k0(qVar) | c0VarR.D(n7VarF);
            if ((i11 & com.planner5d.library.engine.input.f.b.B) != 32) {
                z10 = false;
            }
            boolean zK1 = zK0 | z10 | c0VarR.k0(k2Var);
            Object objI3 = c0VarR.i0();
            if (zK1 || objI3 == aVar.a()) {
                i12 = 0;
                Function1 function1 = new Function1() { // from class: androidx.compose.material.pullrefresh.g
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj2) {
                        return i.j(qVar, n7VarF, j10, k2Var, (androidx.compose.ui.graphics.drawscope.f) obj2);
                    }
                };
                c0VarR.Y(function1);
                objI3 = function1;
            } else {
                i12 = 0;
            }
            f1.e(a0VarF, (Function1) objI3, c0VarR, i12);
            if (m0.l0()) {
                m0.z0();
            }
        } else {
            c0VarR.u();
        }
        s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material.pullrefresh.h
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj2, Object obj3) {
                    return i.k(qVar, j10, a0Var, i10, (c0) obj2, ((Integer) obj3).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit i(e0 e0Var) {
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit j(q qVar, n7 n7Var, long j10, k2 k2Var, androidx.compose.ui.graphics.drawscope.f fVar) throws Throwable {
        androidx.compose.ui.graphics.drawscope.d dVar;
        long j11;
        androidx.compose.material.pullrefresh.a aVarG = g(qVar.k());
        float fFloatValue = ((Number) n7Var.getValue()).floatValue();
        float fB = aVarG.b();
        long jY = fVar.Y();
        androidx.compose.ui.graphics.drawscope.d dVarZ3 = fVar.Z3();
        long jD = dVarZ3.d();
        dVarZ3.f().save();
        try {
            dVarZ3.i().h(fB, jY);
            float fS7 = fVar.S7(f24318e);
            float f10 = f24319f;
            float fS8 = fS7 + (fVar.S7(f10) / 2.0f);
            n0.j jVar = new n0.j(Float.intBitsToFloat((int) (n0.o.b(fVar.d()) >> 32)) - fS8, Float.intBitsToFloat((int) (n0.o.b(fVar.d()) & k0.f265952a)) - fS8, Float.intBitsToFloat((int) (n0.o.b(fVar.d()) >> 32)) + fS8, Float.intBitsToFloat((int) (n0.o.b(fVar.d()) & k0.f265952a)) + fS8);
            try {
                j11 = jD;
                try {
                    try {
                        androidx.compose.ui.graphics.drawscope.f.a2(fVar, j10, aVarG.d(), aVarG.a() - aVarG.d(), false, jVar.E(), jVar.z(), fFloatValue, new androidx.compose.ui.graphics.drawscope.n(fVar.S7(f10), 0.0f, u3.f38256b.c(), 0, null, 26, null), null, 0, p0.f112892a, null);
                        u(fVar, k2Var, jVar, j10, fFloatValue, aVarG);
                        dVarZ3.f().B();
                        dVarZ3.g(j11);
                        return Unit.f312394a;
                    } catch (Throwable th2) {
                        th = th2;
                        dVar = dVarZ3;
                        j11 = j11;
                        dVar.f().B();
                        dVar.g(j11);
                        throw th;
                    }
                } catch (Throwable th3) {
                    th = th3;
                    dVar = dVarZ3;
                }
            } catch (Throwable th4) {
                th = th4;
                dVar = dVarZ3;
                j11 = jD;
            }
        } catch (Throwable th5) {
            th = th5;
            dVar = dVarZ3;
            j11 = jD;
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k(q qVar, long j10, a0 a0Var, int i10, c0 c0Var, int i11) {
        h(qVar, j10, a0Var, c0Var, t4.a(i10 | 1));
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final float l(q qVar) {
        if (qVar.k() >= 1.0f) {
            return 1.0f;
        }
        return f24323j;
    }

    private static final float m(n7<Float> n7Var) {
        return n7Var.getValue().floatValue();
    }

    /* JADX WARN: Code duplicated, block: B:100:0x012e  */
    /* JADX WARN: Code duplicated, block: B:101:0x0130  */
    /* JADX WARN: Code duplicated, block: B:104:0x013c  */
    /* JADX WARN: Code duplicated, block: B:106:0x0144  */
    /* JADX WARN: Code duplicated, block: B:109:0x015e  */
    /* JADX WARN: Code duplicated, block: B:110:0x016b  */
    /* JADX WARN: Code duplicated, block: B:112:0x0196  */
    /* JADX WARN: Code duplicated, block: B:113:0x019b  */
    /* JADX WARN: Code duplicated, block: B:116:0x01ad  */
    /* JADX WARN: Code duplicated, block: B:118:0x01b2  */
    /* JADX WARN: Code duplicated, block: B:121:0x01f4  */
    /* JADX WARN: Code duplicated, block: B:124:0x0200  */
    /* JADX WARN: Code duplicated, block: B:125:0x0204  */
    /* JADX WARN: Code duplicated, block: B:128:0x0223  */
    /* JADX WARN: Code duplicated, block: B:130:0x0231  */
    /* JADX WARN: Code duplicated, block: B:133:0x0278  */
    /* JADX WARN: Code duplicated, block: B:135:0x0285  */
    /* JADX WARN: Code duplicated, block: B:138:0x0292  */
    /* JADX WARN: Code duplicated, block: B:140:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Code duplicated, block: B:36:0x0060  */
    /* JADX WARN: Code duplicated, block: B:38:0x0064  */
    /* JADX WARN: Code duplicated, block: B:40:0x006c  */
    /* JADX WARN: Code duplicated, block: B:41:0x006f  */
    /* JADX WARN: Code duplicated, block: B:44:0x0075  */
    /* JADX WARN: Code duplicated, block: B:47:0x007b  */
    /* JADX WARN: Code duplicated, block: B:49:0x007f  */
    /* JADX WARN: Code duplicated, block: B:51:0x0087  */
    /* JADX WARN: Code duplicated, block: B:52:0x008a  */
    /* JADX WARN: Code duplicated, block: B:55:0x0090  */
    /* JADX WARN: Code duplicated, block: B:58:0x0098  */
    /* JADX WARN: Code duplicated, block: B:60:0x009c  */
    /* JADX WARN: Code duplicated, block: B:62:0x009f  */
    /* JADX WARN: Code duplicated, block: B:64:0x00a7  */
    /* JADX WARN: Code duplicated, block: B:65:0x00aa  */
    /* JADX WARN: Code duplicated, block: B:69:0x00b6  */
    /* JADX WARN: Code duplicated, block: B:70:0x00b8  */
    /* JADX WARN: Code duplicated, block: B:73:0x00c1  */
    /* JADX WARN: Code duplicated, block: B:75:0x00cc  */
    /* JADX WARN: Code duplicated, block: B:84:0x00e2 A[PHI: r3 r6 r7 r10
      0x00e2: PHI (r3v29 int) = (r3v22 int), (r3v31 int), (r3v32 int) binds: [B:93:0x010f, B:82:0x00de, B:83:0x00e0] A[DONT_GENERATE, DONT_INLINE]
      0x00e2: PHI (r6v9 androidx.compose.ui.a0) = (r6v5 androidx.compose.ui.a0), (r6v2 androidx.compose.ui.a0), (r6v2 androidx.compose.ui.a0) binds: [B:93:0x010f, B:82:0x00de, B:83:0x00e0] A[DONT_GENERATE, DONT_INLINE]
      0x00e2: PHI (r7v22 long) = (r7v7 long), (r7v6 long), (r7v6 long) binds: [B:93:0x010f, B:82:0x00de, B:83:0x00e0] A[DONT_GENERATE, DONT_INLINE]
      0x00e2: PHI (r10v16 long) = (r10v4 long), (r10v2 long), (r10v2 long) binds: [B:93:0x010f, B:82:0x00de, B:83:0x00e0] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:85:0x00ea A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:86:0x00ec  */
    /* JADX WARN: Code duplicated, block: B:89:0x00f3  */
    /* JADX WARN: Code duplicated, block: B:92:0x0104  */
    /* JADX WARN: Code duplicated, block: B:94:0x0111  */
    /* JADX WARN: Code duplicated, block: B:97:0x0120  */
    @androidx.compose.runtime.o
    @u7
    @t(applier = "androidx.compose.ui.UiComposable")
    public static final void n(final boolean z10, @NotNull final q qVar, @Nullable a0 a0Var, long j10, long j11, boolean z11, @Nullable c0 c0Var, final int i10, final int i11) {
        int i12;
        a0 a0Var2;
        long jN;
        long j12;
        int i13;
        boolean z12;
        int i14;
        boolean z13;
        final a0 a0Var3;
        final long j13;
        final long j14;
        final boolean z14;
        s5 s5VarT;
        int i15;
        long j15;
        boolean z15;
        int i16;
        boolean z16;
        boolean zD;
        Object objI0;
        n7 n7Var;
        q7 q7Var;
        long j16;
        q0 q0VarN;
        long jM;
        float fR;
        int iJ;
        Function0<androidx.compose.ui.node.g> function0A;
        c0 c0VarD;
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B;
        c0 c0VarR = c0Var.R(308716636);
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
            i12 |= c0VarR.k0(qVar) ? 32 : 16;
        }
        int i17 = i11 & 4;
        if (i17 == 0) {
            if ((i10 & a5.S0) == 0) {
                a0Var2 = a0Var;
                i12 |= c0VarR.D(a0Var2) ? 256 : 128;
            }
            if ((i10 & 3072) == 0) {
                if ((i11 & 8) == 0) {
                    jN = j10;
                    int i18 = c0VarR.L(jN) ? 2048 : 1024;
                    i12 |= i18;
                } else {
                    jN = j10;
                }
                i12 |= i18;
            } else {
                jN = j10;
            }
            if ((i10 & 24576) == 0) {
                if ((i11 & 16) == 0) {
                    j12 = j11;
                    int i19 = c0VarR.L(j12) ? 16384 : 8192;
                    i12 |= i19;
                } else {
                    j12 = j11;
                }
                i12 |= i19;
            } else {
                j12 = j11;
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
                if ((74899 & i12) != 74898) {
                    z13 = true;
                } else {
                    z13 = false;
                }
                if (c0VarR.h(z13, i12 & 1)) {
                    c0VarR.l0();
                    if ((i10 & 1) != 0 || c0VarR.y()) {
                        if (i17 != 0) {
                            a0Var2 = a0.E;
                        }
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                            jN = x9.f25488a.a(c0VarR, 6).n();
                        }
                        if ((i11 & 16) != 0) {
                            long jD = n4.d(jN, c0VarR, (i12 >> 9) & 14);
                            i12 &= -57345;
                            j12 = jD;
                        }
                        if (i13 != 0) {
                            long j17 = j12;
                            i15 = i12;
                            j15 = j17;
                            z15 = false;
                        }
                        c0VarR.Z();
                        if (m0.l0()) {
                            m0.A0(308716636, i15, -1, "androidx.compose.material.pullrefresh.PullRefreshIndicator (PullRefreshIndicator.kt:81)");
                        }
                        i16 = i15 & 14;
                        if (i16 == 4) {
                            z16 = true;
                        } else {
                            z16 = false;
                        }
                        zD = z16 | c0VarR.D(qVar);
                        objI0 = c0VarR.i0();
                        if (zD || objI0 == c0.f35327a.a()) {
                            objI0 = w6.e(new Function0() { // from class: androidx.compose.material.pullrefresh.c
                                @Override // kotlin.jvm.functions.Function0
                                public final Object invoke() {
                                    return Boolean.valueOf(i.o(z10, qVar));
                                }
                            });
                            c0VarR.Y(objI0);
                        }
                        n7Var = (n7) objI0;
                        q7Var = (q7) c0VarR.W(t7.h());
                        if (q7Var == null) {
                            c0VarR.E(1453247536);
                            c0VarR.A();
                            j16 = jN;
                            q0VarN = null;
                        } else {
                            c0VarR.E(323973617);
                            long j18 = jN;
                            long jA = q7Var.a(j18, f24322i, c0VarR, ((i15 >> 9) & 14) | 48);
                            j16 = j18;
                            c0VarR.A();
                            q0VarN = q0.n(jA);
                        }
                        if (q0VarN != null) {
                            jM = q0VarN.M();
                        } else {
                            jM = j16;
                        }
                        a0 a0VarC = l.c(i6.w(a0Var2, f24316c), qVar, z15);
                        if (p(n7Var)) {
                            fR = f24322i;
                        } else {
                            fR = androidx.compose.ui.unit.h.r(0);
                        }
                        float f10 = fR;
                        androidx.compose.foundation.shape.n nVar = f24317d;
                        a0 a0VarC2 = androidx.compose.foundation.v.c(androidx.compose.ui.draw.x.f(a0VarC, f10, nVar, true, 0L, 0L, 24, null), jM, nVar);
                        a1 a1VarK = x.k(androidx.compose.ui.e.f37317a.C(), false);
                        iJ = v.j(c0VarR, 0);
                        b1 b1VarK = c0VarR.k();
                        a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0VarC2);
                        androidx.compose.ui.node.g.a aVar = androidx.compose.ui.node.g.I;
                        function0A = aVar.a();
                        if (c0VarR.S() == null) {
                            v.r();
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
                        if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iJ))) {
                            c0VarD.Y(Integer.valueOf(iJ));
                            c0VarD.f(Integer.valueOf(iJ), function2B);
                        }
                        y7.n(c0VarD, a0VarN, aVar.f());
                        d0 d0Var = d0.f15956a;
                        y.b(Boolean.valueOf(z10), null, androidx.compose.animation.core.p.t(100, 0, null, 6, null), null, w.e(1853731063, true, new a(j15, qVar), c0VarR, 54), c0VarR, i16 | 24960, 10);
                        c0VarR.o();
                        if (m0.l0()) {
                            m0.z0();
                        }
                        long j19 = j15;
                        a0Var3 = a0Var2;
                        j14 = j19;
                        z14 = z15;
                        j13 = j16;
                    } else {
                        c0VarR.u();
                        if ((i11 & 8) != 0) {
                            i12 &= -7169;
                        }
                        if ((i11 & 16) != 0) {
                            i12 &= -57345;
                        }
                    }
                    long j20 = j12;
                    i15 = i12;
                    j15 = j20;
                    z15 = z12;
                    c0VarR.Z();
                    if (m0.l0()) {
                        m0.A0(308716636, i15, -1, "androidx.compose.material.pullrefresh.PullRefreshIndicator (PullRefreshIndicator.kt:81)");
                    }
                    i16 = i15 & 14;
                    if (i16 == 4) {
                        z16 = true;
                    } else {
                        z16 = false;
                    }
                    zD = z16 | c0VarR.D(qVar);
                    objI0 = c0VarR.i0();
                    if (zD) {
                        objI0 = w6.e(new Function0() { // from class: androidx.compose.material.pullrefresh.c
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Boolean.valueOf(i.o(z10, qVar));
                            }
                        });
                        c0VarR.Y(objI0);
                    } else {
                        objI0 = w6.e(new Function0() { // from class: androidx.compose.material.pullrefresh.c
                            @Override // kotlin.jvm.functions.Function0
                            public final Object invoke() {
                                return Boolean.valueOf(i.o(z10, qVar));
                            }
                        });
                        c0VarR.Y(objI0);
                    }
                    n7Var = (n7) objI0;
                    q7Var = (q7) c0VarR.W(t7.h());
                    if (q7Var == null) {
                        c0VarR.E(1453247536);
                        c0VarR.A();
                        j16 = jN;
                        q0VarN = null;
                    } else {
                        c0VarR.E(323973617);
                        long j110 = jN;
                        long jA2 = q7Var.a(j110, f24322i, c0VarR, ((i15 >> 9) & 14) | 48);
                        j16 = j110;
                        c0VarR.A();
                        q0VarN = q0.n(jA2);
                    }
                    if (q0VarN != null) {
                        jM = q0VarN.M();
                    } else {
                        jM = j16;
                    }
                    a0 a0VarC3 = l.c(i6.w(a0Var2, f24316c), qVar, z15);
                    if (p(n7Var)) {
                        fR = f24322i;
                    } else {
                        fR = androidx.compose.ui.unit.h.r(0);
                    }
                    float f11 = fR;
                    androidx.compose.foundation.shape.n nVar2 = f24317d;
                    a0 a0VarC4 = androidx.compose.foundation.v.c(androidx.compose.ui.draw.x.f(a0VarC3, f11, nVar2, true, 0L, 0L, 24, null), jM, nVar2);
                    a1 a1VarK2 = x.k(androidx.compose.ui.e.f37317a.C(), false);
                    iJ = v.j(c0VarR, 0);
                    b1 b1VarK2 = c0VarR.k();
                    a0 a0VarN2 = androidx.compose.ui.m.n(c0VarR, a0VarC4);
                    androidx.compose.ui.node.g.a aVar2 = androidx.compose.ui.node.g.I;
                    function0A = aVar2.a();
                    if (c0VarR.S() == null) {
                        v.r();
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
                        c0VarD.Y(Integer.valueOf(iJ));
                        c0VarD.f(Integer.valueOf(iJ), function2B);
                    } else {
                        c0VarD.Y(Integer.valueOf(iJ));
                        c0VarD.f(Integer.valueOf(iJ), function2B);
                    }
                    y7.n(c0VarD, a0VarN2, aVar2.f());
                    d0 d0Var2 = d0.f15956a;
                    y.b(Boolean.valueOf(z10), null, androidx.compose.animation.core.p.t(100, 0, null, 6, null), null, w.e(1853731063, true, new a(j15, qVar), c0VarR, 54), c0VarR, i16 | 24960, 10);
                    c0VarR.o();
                    if (m0.l0()) {
                        m0.z0();
                    }
                    long j111 = j15;
                    a0Var3 = a0Var2;
                    j14 = j111;
                    z14 = z15;
                    j13 = j16;
                } else {
                    c0VarR.u();
                    a0Var3 = a0Var2;
                    j13 = jN;
                    j14 = j12;
                    z14 = z12;
                }
                s5VarT = c0VarR.T();
                if (s5VarT != null) {
                    s5VarT.a(new Function2() { // from class: androidx.compose.material.pullrefresh.d
                        @Override // kotlin.jvm.functions.Function2
                        public final Object invoke(Object obj, Object obj2) {
                            return i.q(z10, qVar, a0Var3, j13, j14, z14, i10, i11, (c0) obj, ((Integer) obj2).intValue());
                        }
                    });
                }
            }
            i12 |= androidx.profileinstaller.n.c.f73814m;
            z12 = z11;
            if ((74899 & i12) != 74898) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c0VarR.h(z13, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i17 != 0) {
                        a0Var2 = a0.E;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        jN = x9.f25488a.a(c0VarR, 6).n();
                    }
                    if ((i11 & 16) != 0) {
                        long jD2 = n4.d(jN, c0VarR, (i12 >> 9) & 14);
                        i12 &= -57345;
                        j12 = jD2;
                    }
                    if (i13 != 0) {
                        long j112 = j12;
                        i15 = i12;
                        j15 = j112;
                        z15 = false;
                    } else {
                        long j21 = j12;
                        i15 = i12;
                        j15 = j21;
                        z15 = z12;
                    }
                } else {
                    if (i17 != 0) {
                        a0Var2 = a0.E;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        jN = x9.f25488a.a(c0VarR, 6).n();
                    }
                    if ((i11 & 16) != 0) {
                        long jD3 = n4.d(jN, c0VarR, (i12 >> 9) & 14);
                        i12 &= -57345;
                        j12 = jD3;
                    }
                    if (i13 != 0) {
                        long j113 = j12;
                        i15 = i12;
                        j15 = j113;
                        z15 = false;
                    } else {
                        long j22 = j12;
                        i15 = i12;
                        j15 = j22;
                        z15 = z12;
                    }
                }
                c0VarR.Z();
                if (m0.l0()) {
                    m0.A0(308716636, i15, -1, "androidx.compose.material.pullrefresh.PullRefreshIndicator (PullRefreshIndicator.kt:81)");
                }
                i16 = i15 & 14;
                if (i16 == 4) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                zD = z16 | c0VarR.D(qVar);
                objI0 = c0VarR.i0();
                if (zD) {
                    objI0 = w6.e(new Function0() { // from class: androidx.compose.material.pullrefresh.c
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Boolean.valueOf(i.o(z10, qVar));
                        }
                    });
                    c0VarR.Y(objI0);
                } else {
                    objI0 = w6.e(new Function0() { // from class: androidx.compose.material.pullrefresh.c
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Boolean.valueOf(i.o(z10, qVar));
                        }
                    });
                    c0VarR.Y(objI0);
                }
                n7Var = (n7) objI0;
                q7Var = (q7) c0VarR.W(t7.h());
                if (q7Var == null) {
                    c0VarR.E(1453247536);
                    c0VarR.A();
                    j16 = jN;
                    q0VarN = null;
                } else {
                    c0VarR.E(323973617);
                    long j114 = jN;
                    long jA3 = q7Var.a(j114, f24322i, c0VarR, ((i15 >> 9) & 14) | 48);
                    j16 = j114;
                    c0VarR.A();
                    q0VarN = q0.n(jA3);
                }
                if (q0VarN != null) {
                    jM = q0VarN.M();
                } else {
                    jM = j16;
                }
                a0 a0VarC5 = l.c(i6.w(a0Var2, f24316c), qVar, z15);
                if (p(n7Var)) {
                    fR = f24322i;
                } else {
                    fR = androidx.compose.ui.unit.h.r(0);
                }
                float f12 = fR;
                androidx.compose.foundation.shape.n nVar3 = f24317d;
                a0 a0VarC6 = androidx.compose.foundation.v.c(androidx.compose.ui.draw.x.f(a0VarC5, f12, nVar3, true, 0L, 0L, 24, null), jM, nVar3);
                a1 a1VarK3 = x.k(androidx.compose.ui.e.f37317a.C(), false);
                iJ = v.j(c0VarR, 0);
                b1 b1VarK3 = c0VarR.k();
                a0 a0VarN3 = androidx.compose.ui.m.n(c0VarR, a0VarC6);
                androidx.compose.ui.node.g.a aVar3 = androidx.compose.ui.node.g.I;
                function0A = aVar3.a();
                if (c0VarR.S() == null) {
                    v.r();
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
                    c0VarD.Y(Integer.valueOf(iJ));
                    c0VarD.f(Integer.valueOf(iJ), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iJ));
                    c0VarD.f(Integer.valueOf(iJ), function2B);
                }
                y7.n(c0VarD, a0VarN3, aVar3.f());
                d0 d0Var3 = d0.f15956a;
                y.b(Boolean.valueOf(z10), null, androidx.compose.animation.core.p.t(100, 0, null, 6, null), null, w.e(1853731063, true, new a(j15, qVar), c0VarR, 54), c0VarR, i16 | 24960, 10);
                c0VarR.o();
                if (m0.l0()) {
                    m0.z0();
                }
                long j115 = j15;
                a0Var3 = a0Var2;
                j14 = j115;
                z14 = z15;
                j13 = j16;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                j13 = jN;
                j14 = j12;
                z14 = z12;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material.pullrefresh.d
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return i.q(z10, qVar, a0Var3, j13, j14, z14, i10, i11, (c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= a5.S0;
        a0Var2 = a0Var;
        if ((i10 & 3072) == 0) {
            if ((i11 & 8) == 0) {
                jN = j10;
                if (c0VarR.L(jN)) {
                }
                i12 |= i18;
            } else {
                jN = j10;
            }
            i12 |= i18;
        } else {
            jN = j10;
        }
        if ((i10 & 24576) == 0) {
            if ((i11 & 16) == 0) {
                j12 = j11;
                if (c0VarR.L(j12)) {
                }
                i12 |= i19;
            } else {
                j12 = j11;
            }
            i12 |= i19;
        } else {
            j12 = j11;
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
            if ((74899 & i12) != 74898) {
                z13 = true;
            } else {
                z13 = false;
            }
            if (c0VarR.h(z13, i12 & 1)) {
                c0VarR.l0();
                if ((i10 & 1) != 0) {
                    if (i17 != 0) {
                        a0Var2 = a0.E;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        jN = x9.f25488a.a(c0VarR, 6).n();
                    }
                    if ((i11 & 16) != 0) {
                        long jD4 = n4.d(jN, c0VarR, (i12 >> 9) & 14);
                        i12 &= -57345;
                        j12 = jD4;
                    }
                    if (i13 != 0) {
                        long j116 = j12;
                        i15 = i12;
                        j15 = j116;
                        z15 = false;
                    } else {
                        long j23 = j12;
                        i15 = i12;
                        j15 = j23;
                        z15 = z12;
                    }
                } else {
                    if (i17 != 0) {
                        a0Var2 = a0.E;
                    }
                    if ((i11 & 8) != 0) {
                        i12 &= -7169;
                        jN = x9.f25488a.a(c0VarR, 6).n();
                    }
                    if ((i11 & 16) != 0) {
                        long jD5 = n4.d(jN, c0VarR, (i12 >> 9) & 14);
                        i12 &= -57345;
                        j12 = jD5;
                    }
                    if (i13 != 0) {
                        long j117 = j12;
                        i15 = i12;
                        j15 = j117;
                        z15 = false;
                    } else {
                        long j24 = j12;
                        i15 = i12;
                        j15 = j24;
                        z15 = z12;
                    }
                }
                c0VarR.Z();
                if (m0.l0()) {
                    m0.A0(308716636, i15, -1, "androidx.compose.material.pullrefresh.PullRefreshIndicator (PullRefreshIndicator.kt:81)");
                }
                i16 = i15 & 14;
                if (i16 == 4) {
                    z16 = true;
                } else {
                    z16 = false;
                }
                zD = z16 | c0VarR.D(qVar);
                objI0 = c0VarR.i0();
                if (zD) {
                    objI0 = w6.e(new Function0() { // from class: androidx.compose.material.pullrefresh.c
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Boolean.valueOf(i.o(z10, qVar));
                        }
                    });
                    c0VarR.Y(objI0);
                } else {
                    objI0 = w6.e(new Function0() { // from class: androidx.compose.material.pullrefresh.c
                        @Override // kotlin.jvm.functions.Function0
                        public final Object invoke() {
                            return Boolean.valueOf(i.o(z10, qVar));
                        }
                    });
                    c0VarR.Y(objI0);
                }
                n7Var = (n7) objI0;
                q7Var = (q7) c0VarR.W(t7.h());
                if (q7Var == null) {
                    c0VarR.E(1453247536);
                    c0VarR.A();
                    j16 = jN;
                    q0VarN = null;
                } else {
                    c0VarR.E(323973617);
                    long j118 = jN;
                    long jA4 = q7Var.a(j118, f24322i, c0VarR, ((i15 >> 9) & 14) | 48);
                    j16 = j118;
                    c0VarR.A();
                    q0VarN = q0.n(jA4);
                }
                if (q0VarN != null) {
                    jM = q0VarN.M();
                } else {
                    jM = j16;
                }
                a0 a0VarC7 = l.c(i6.w(a0Var2, f24316c), qVar, z15);
                if (p(n7Var)) {
                    fR = f24322i;
                } else {
                    fR = androidx.compose.ui.unit.h.r(0);
                }
                float f13 = fR;
                androidx.compose.foundation.shape.n nVar4 = f24317d;
                a0 a0VarC8 = androidx.compose.foundation.v.c(androidx.compose.ui.draw.x.f(a0VarC7, f13, nVar4, true, 0L, 0L, 24, null), jM, nVar4);
                a1 a1VarK4 = x.k(androidx.compose.ui.e.f37317a.C(), false);
                iJ = v.j(c0VarR, 0);
                b1 b1VarK4 = c0VarR.k();
                a0 a0VarN4 = androidx.compose.ui.m.n(c0VarR, a0VarC8);
                androidx.compose.ui.node.g.a aVar4 = androidx.compose.ui.node.g.I;
                function0A = aVar4.a();
                if (c0VarR.S() == null) {
                    v.r();
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
                    c0VarD.Y(Integer.valueOf(iJ));
                    c0VarD.f(Integer.valueOf(iJ), function2B);
                } else {
                    c0VarD.Y(Integer.valueOf(iJ));
                    c0VarD.f(Integer.valueOf(iJ), function2B);
                }
                y7.n(c0VarD, a0VarN4, aVar4.f());
                d0 d0Var4 = d0.f15956a;
                y.b(Boolean.valueOf(z10), null, androidx.compose.animation.core.p.t(100, 0, null, 6, null), null, w.e(1853731063, true, new a(j15, qVar), c0VarR, 54), c0VarR, i16 | 24960, 10);
                c0VarR.o();
                if (m0.l0()) {
                    m0.z0();
                }
                long j119 = j15;
                a0Var3 = a0Var2;
                j14 = j119;
                z14 = z15;
                j13 = j16;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
                j13 = jN;
                j14 = j12;
                z14 = z12;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material.pullrefresh.d
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return i.q(z10, qVar, a0Var3, j13, j14, z14, i10, i11, (c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= androidx.profileinstaller.n.c.f73814m;
        z12 = z11;
        if ((74899 & i12) != 74898) {
            z13 = true;
        } else {
            z13 = false;
        }
        if (c0VarR.h(z13, i12 & 1)) {
            c0VarR.l0();
            if ((i10 & 1) != 0) {
                if (i17 != 0) {
                    a0Var2 = a0.E;
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    jN = x9.f25488a.a(c0VarR, 6).n();
                }
                if ((i11 & 16) != 0) {
                    long jD6 = n4.d(jN, c0VarR, (i12 >> 9) & 14);
                    i12 &= -57345;
                    j12 = jD6;
                }
                if (i13 != 0) {
                    long j1110 = j12;
                    i15 = i12;
                    j15 = j1110;
                    z15 = false;
                } else {
                    long j25 = j12;
                    i15 = i12;
                    j15 = j25;
                    z15 = z12;
                }
            } else {
                if (i17 != 0) {
                    a0Var2 = a0.E;
                }
                if ((i11 & 8) != 0) {
                    i12 &= -7169;
                    jN = x9.f25488a.a(c0VarR, 6).n();
                }
                if ((i11 & 16) != 0) {
                    long jD7 = n4.d(jN, c0VarR, (i12 >> 9) & 14);
                    i12 &= -57345;
                    j12 = jD7;
                }
                if (i13 != 0) {
                    long j1111 = j12;
                    i15 = i12;
                    j15 = j1111;
                    z15 = false;
                } else {
                    long j26 = j12;
                    i15 = i12;
                    j15 = j26;
                    z15 = z12;
                }
            }
            c0VarR.Z();
            if (m0.l0()) {
                m0.A0(308716636, i15, -1, "androidx.compose.material.pullrefresh.PullRefreshIndicator (PullRefreshIndicator.kt:81)");
            }
            i16 = i15 & 14;
            if (i16 == 4) {
                z16 = true;
            } else {
                z16 = false;
            }
            zD = z16 | c0VarR.D(qVar);
            objI0 = c0VarR.i0();
            if (zD) {
                objI0 = w6.e(new Function0() { // from class: androidx.compose.material.pullrefresh.c
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Boolean.valueOf(i.o(z10, qVar));
                    }
                });
                c0VarR.Y(objI0);
            } else {
                objI0 = w6.e(new Function0() { // from class: androidx.compose.material.pullrefresh.c
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return Boolean.valueOf(i.o(z10, qVar));
                    }
                });
                c0VarR.Y(objI0);
            }
            n7Var = (n7) objI0;
            q7Var = (q7) c0VarR.W(t7.h());
            if (q7Var == null) {
                c0VarR.E(1453247536);
                c0VarR.A();
                j16 = jN;
                q0VarN = null;
            } else {
                c0VarR.E(323973617);
                long j1112 = jN;
                long jA5 = q7Var.a(j1112, f24322i, c0VarR, ((i15 >> 9) & 14) | 48);
                j16 = j1112;
                c0VarR.A();
                q0VarN = q0.n(jA5);
            }
            if (q0VarN != null) {
                jM = q0VarN.M();
            } else {
                jM = j16;
            }
            a0 a0VarC9 = l.c(i6.w(a0Var2, f24316c), qVar, z15);
            if (p(n7Var)) {
                fR = f24322i;
            } else {
                fR = androidx.compose.ui.unit.h.r(0);
            }
            float f14 = fR;
            androidx.compose.foundation.shape.n nVar5 = f24317d;
            a0 a0VarC10 = androidx.compose.foundation.v.c(androidx.compose.ui.draw.x.f(a0VarC9, f14, nVar5, true, 0L, 0L, 24, null), jM, nVar5);
            a1 a1VarK5 = x.k(androidx.compose.ui.e.f37317a.C(), false);
            iJ = v.j(c0VarR, 0);
            b1 b1VarK5 = c0VarR.k();
            a0 a0VarN5 = androidx.compose.ui.m.n(c0VarR, a0VarC10);
            androidx.compose.ui.node.g.a aVar5 = androidx.compose.ui.node.g.I;
            function0A = aVar5.a();
            if (c0VarR.S() == null) {
                v.r();
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
                c0VarD.Y(Integer.valueOf(iJ));
                c0VarD.f(Integer.valueOf(iJ), function2B);
            } else {
                c0VarD.Y(Integer.valueOf(iJ));
                c0VarD.f(Integer.valueOf(iJ), function2B);
            }
            y7.n(c0VarD, a0VarN5, aVar5.f());
            d0 d0Var5 = d0.f15956a;
            y.b(Boolean.valueOf(z10), null, androidx.compose.animation.core.p.t(100, 0, null, 6, null), null, w.e(1853731063, true, new a(j15, qVar), c0VarR, 54), c0VarR, i16 | 24960, 10);
            c0VarR.o();
            if (m0.l0()) {
                m0.z0();
            }
            long j1113 = j15;
            a0Var3 = a0Var2;
            j14 = j1113;
            z14 = z15;
            j13 = j16;
        } else {
            c0VarR.u();
            a0Var3 = a0Var2;
            j13 = jN;
            j14 = j12;
            z14 = z12;
        }
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material.pullrefresh.d
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return i.q(z10, qVar, a0Var3, j13, j14, z14, i10, i11, (c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean o(boolean z10, q qVar) {
        return z10 || qVar.j() > 0.5f;
    }

    private static final boolean p(n7<Boolean> n7Var) {
        return n7Var.getValue().booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit q(boolean z10, q qVar, a0 a0Var, long j10, long j11, boolean z11, int i10, int i11, c0 c0Var, int i12) {
        n(z10, qVar, a0Var, j10, j11, z11, c0Var, t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    private static final void u(androidx.compose.ui.graphics.drawscope.f fVar, k2 k2Var, n0.j jVar, long j10, float f10, androidx.compose.material.pullrefresh.a aVar) {
        k2Var.reset();
        k2Var.A(0.0f, 0.0f);
        float f11 = f24320g;
        k2Var.F(fVar.S7(f11) * aVar.c(), 0.0f);
        k2Var.F((fVar.S7(f11) * aVar.c()) / 2, fVar.S7(f24321h) * aVar.c());
        float fMin = ((Math.min(jVar.x() - jVar.t(), jVar.j() - jVar.B()) / 2.0f) + Float.intBitsToFloat((int) (jVar.o() >> 32))) - ((fVar.S7(f11) * aVar.c()) / 2.0f);
        k2Var.m(n0.g.g((((long) Float.floatToRawIntBits(Float.intBitsToFloat((int) (jVar.o() & k0.f265952a)) + (fVar.S7(f24319f) / 2.0f))) & k0.f265952a) | (Float.floatToRawIntBits(fMin) << 32)));
        k2Var.close();
        float fA = aVar.a();
        long jY = fVar.Y();
        androidx.compose.ui.graphics.drawscope.d dVarZ3 = fVar.Z3();
        long jD = dVarZ3.d();
        dVarZ3.f().save();
        try {
            dVarZ3.i().h(fA, jY);
            androidx.compose.ui.graphics.drawscope.f.K1(fVar, k2Var, j10, f10, null, null, 0, 56, null);
        } finally {
            dVarZ3.f().B();
            dVarZ3.g(jD);
        }
    }
}

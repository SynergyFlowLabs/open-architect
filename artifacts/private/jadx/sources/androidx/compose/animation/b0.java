package androidx.compose.animation;

import androidx.compose.animation.core.j5;
import androidx.compose.animation.core.l3;
import androidx.compose.animation.core.q2;
import androidx.compose.animation.core.t4;
import androidx.compose.animation.core.w3;
import androidx.compose.animation.core.z3;
import androidx.compose.runtime.d7;
import androidx.compose.runtime.k7;
import androidx.compose.runtime.n3;
import androidx.compose.runtime.n7;
import androidx.compose.ui.graphics.a4;
import androidx.media3.exoplayer.a5;
import kotlin.TuplesKt;
import kotlin.Unit;
import kotlin.collections.MapsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nEnterExitTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EnterExitTransition.kt\nandroidx/compose/animation/EnterExitTransitionKt\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 SnapshotState.kt\nandroidx/compose/runtime/SnapshotStateKt__SnapshotStateKt\n*L\n1#1,1274:1\n1282#2,6:1275\n1282#2,6:1281\n1282#2,6:1287\n1282#2,6:1293\n1282#2,6:1299\n1282#2,6:1305\n1282#2,6:1311\n1282#2,6:1317\n1282#2,6:1323\n1282#2,6:1329\n85#3:1335\n117#3,2:1336\n85#3:1338\n117#3,2:1339\n*S KotlinDebug\n*F\n+ 1 EnterExitTransition.kt\nandroidx/compose/animation/EnterExitTransitionKt\n*L\n859#1:1275,6\n871#1:1281,6\n877#1:1287,6\n884#1:1293,6\n893#1:1299,6\n914#1:1305,6\n934#1:1311,6\n969#1:1317,6\n977#1:1323,6\n989#1:1329,6\n914#1:1335\n914#1:1336,2\n934#1:1338\n934#1:1339,2\n*E\n"})
public final class b0 {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    @NotNull
    private static final z3<androidx.compose.ui.graphics.z3, androidx.compose.animation.core.t> f12625a = t4.K(a.f12629a, b.f12631a);

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    @NotNull
    private static final q2<Float> f12626b = androidx.compose.animation.core.p.r(0.0f, 400.0f, null, 5, null);

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    @NotNull
    private static final q2<androidx.compose.ui.unit.q> f12627c = androidx.compose.animation.core.p.r(0.0f, 400.0f, androidx.compose.ui.unit.q.c(j5.d(androidx.compose.ui.unit.q.f42709b)), 1, null);

    /* JADX INFO: renamed from: d, reason: collision with root package name */
    @NotNull
    private static final q2<androidx.compose.ui.unit.u> f12628d = androidx.compose.animation.core.p.r(0.0f, 400.0f, androidx.compose.ui.unit.u.b(j5.e(androidx.compose.ui.unit.u.f42720b)), 1, null);

    static final class a extends kotlin.jvm.internal.l0 implements Function1<androidx.compose.ui.graphics.z3, androidx.compose.animation.core.t> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final a f12629a = new a();

        a() {
            super(1);
        }

        public final androidx.compose.animation.core.t c(long j10) {
            return new androidx.compose.animation.core.t(androidx.compose.ui.graphics.z3.k(j10), androidx.compose.ui.graphics.z3.l(j10));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ androidx.compose.animation.core.t invoke(androidx.compose.ui.graphics.z3 z3Var) {
            return c(z3Var.o());
        }
    }

    @SourceDebugExtension({"SMAP\nEnterExitTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EnterExitTransition.kt\nandroidx/compose/animation/EnterExitTransitionKt$slideOutHorizontally$2\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n*L\n1#1,1274:1\n54#2:1275\n85#3:1276\n80#3:1278\n32#4:1277\n*S KotlinDebug\n*F\n+ 1 EnterExitTransition.kt\nandroidx/compose/animation/EnterExitTransitionKt$slideOutHorizontally$2\n*L\n760#1:1275\n760#1:1276\n760#1:1278\n760#1:1277\n*E\n"})
    static final class a0 extends kotlin.jvm.internal.l0 implements Function1<androidx.compose.ui.unit.u, androidx.compose.ui.unit.q> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1<Integer, Integer> f12630a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a0(Function1<? super Integer, Integer> function1) {
            super(1);
            this.f12630a = function1;
        }

        public final long c(long j10) {
            return androidx.compose.ui.unit.q.f((((long) this.f12630a.invoke(Integer.valueOf((int) (j10 >> 32))).intValue()) << 32) | (((long) 0) & com.rabbitmq.client.k0.f265952a));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ androidx.compose.ui.unit.q invoke(androidx.compose.ui.unit.u uVar) {
            return androidx.compose.ui.unit.q.c(c(uVar.q()));
        }
    }

    static final class b extends kotlin.jvm.internal.l0 implements Function1<androidx.compose.animation.core.t, androidx.compose.ui.graphics.z3> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final b f12631a = new b();

        b() {
            super(1);
        }

        public final long c(androidx.compose.animation.core.t tVar) {
            return a4.a(tVar.f(), tVar.g());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ androidx.compose.ui.graphics.z3 invoke(androidx.compose.animation.core.t tVar) {
            return androidx.compose.ui.graphics.z3.b(c(tVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX INFO: renamed from: androidx.compose.animation.b0$b0, reason: collision with other inner class name */
    public static final class C0055b0 extends kotlin.jvm.internal.l0 implements Function1<Integer, Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final C0055b0 f12632a = new C0055b0();

        C0055b0() {
            super(1);
        }

        public final Integer c(int i10) {
            return Integer.valueOf((-i10) / 2);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
            return c(num.intValue());
        }
    }

    static final class c extends kotlin.jvm.internal.l0 implements Function1<l3.b<androidx.compose.animation.z>, androidx.compose.animation.core.y0<Float>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ d0 f12633a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ f0 f12634b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(d0 d0Var, f0 f0Var) {
            super(1);
            this.f12633a = d0Var;
            this.f12634b = f0Var;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.animation.core.y0<Float> invoke(l3.b<androidx.compose.animation.z> bVar) {
            androidx.compose.animation.core.y0<Float> y0VarF;
            androidx.compose.animation.core.y0<Float> y0VarF2;
            androidx.compose.animation.z zVar = androidx.compose.animation.z.PreEnter;
            androidx.compose.animation.z zVar2 = androidx.compose.animation.z.Visible;
            if (bVar.f(zVar, zVar2)) {
                j0 j0VarK = this.f12633a.b().k();
                return (j0VarK == null || (y0VarF2 = j0VarK.f()) == null) ? b0.f12626b : y0VarF2;
            }
            if (!bVar.f(zVar2, androidx.compose.animation.z.PostExit)) {
                return b0.f12626b;
            }
            j0 j0VarK2 = this.f12634b.c().k();
            if (j0VarK2 != null && (y0VarF = j0VarK2.f()) != null) {
                return y0VarF;
            }
            return b0.f12626b;
        }
    }

    @SourceDebugExtension({"SMAP\nEnterExitTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EnterExitTransition.kt\nandroidx/compose/animation/EnterExitTransitionKt$slideOutVertically$2\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n*L\n1#1,1274:1\n59#2:1275\n90#3:1276\n80#3:1278\n32#4:1277\n*S KotlinDebug\n*F\n+ 1 EnterExitTransition.kt\nandroidx/compose/animation/EnterExitTransitionKt$slideOutVertically$2\n*L\n788#1:1275\n788#1:1276\n788#1:1278\n788#1:1277\n*E\n"})
    static final class c0 extends kotlin.jvm.internal.l0 implements Function1<androidx.compose.ui.unit.u, androidx.compose.ui.unit.q> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1<Integer, Integer> f12635a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        c0(Function1<? super Integer, Integer> function1) {
            super(1);
            this.f12635a = function1;
        }

        public final long c(long j10) {
            return androidx.compose.ui.unit.q.f((((long) 0) << 32) | (com.rabbitmq.client.k0.f265952a & ((long) this.f12635a.invoke(Integer.valueOf((int) (j10 & com.rabbitmq.client.k0.f265952a))).intValue())));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ androidx.compose.ui.unit.q invoke(androidx.compose.ui.unit.u uVar) {
            return androidx.compose.ui.unit.q.c(c(uVar.q()));
        }
    }

    static final class d extends kotlin.jvm.internal.l0 implements Function1<androidx.compose.animation.z, Float> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ d0 f12636a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ f0 f12637b;

        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f12638a;

            static {
                int[] iArr = new int[androidx.compose.animation.z.values().length];
                try {
                    iArr[androidx.compose.animation.z.Visible.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[androidx.compose.animation.z.PreEnter.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[androidx.compose.animation.z.PostExit.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f12638a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        d(d0 d0Var, f0 f0Var) {
            super(1);
            this.f12636a = d0Var;
            this.f12637b = f0Var;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Float invoke(androidx.compose.animation.z zVar) {
            int i10 = a.f12638a[zVar.ordinal()];
            float fE = 1.0f;
            if (i10 != 1) {
                if (i10 == 2) {
                    j0 j0VarK = this.f12636a.b().k();
                    if (j0VarK != null) {
                        fE = j0VarK.e();
                    }
                } else {
                    if (i10 != 3) {
                        throw new kotlin.k0();
                    }
                    j0 j0VarK2 = this.f12637b.c().k();
                    if (j0VarK2 != null) {
                        fE = j0VarK2.e();
                    }
                }
            }
            return Float.valueOf(fE);
        }
    }

    static final class e extends kotlin.jvm.internal.l0 implements Function1<androidx.compose.ui.graphics.r1, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ n7<Float> f12639a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ n7<Float> f12640b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ n7<androidx.compose.ui.graphics.z3> f12641c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(n7<Float> n7Var, n7<Float> n7Var2, n7<androidx.compose.ui.graphics.z3> n7Var3) {
            super(1);
            this.f12639a = n7Var;
            this.f12640b = n7Var2;
            this.f12641c = n7Var3;
        }

        public final void c(androidx.compose.ui.graphics.r1 r1Var) {
            n7<Float> n7Var = this.f12639a;
            r1Var.setAlpha(n7Var != null ? n7Var.getValue().floatValue() : 1.0f);
            n7<Float> n7Var2 = this.f12640b;
            r1Var.z(n7Var2 != null ? n7Var2.getValue().floatValue() : 1.0f);
            n7<Float> n7Var3 = this.f12640b;
            r1Var.C(n7Var3 != null ? n7Var3.getValue().floatValue() : 1.0f);
            n7<androidx.compose.ui.graphics.z3> n7Var4 = this.f12641c;
            r1Var.W1(n7Var4 != null ? n7Var4.getValue().o() : androidx.compose.ui.graphics.z3.f38723b.a());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.ui.graphics.r1 r1Var) {
            c(r1Var);
            return Unit.f312394a;
        }
    }

    static final class f extends kotlin.jvm.internal.l0 implements Function1<l3.b<androidx.compose.animation.z>, androidx.compose.animation.core.y0<Float>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ d0 f12642a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ f0 f12643b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(d0 d0Var, f0 f0Var) {
            super(1);
            this.f12642a = d0Var;
            this.f12643b = f0Var;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.animation.core.y0<Float> invoke(l3.b<androidx.compose.animation.z> bVar) {
            androidx.compose.animation.core.y0<Float> y0VarF;
            androidx.compose.animation.core.y0<Float> y0VarF2;
            androidx.compose.animation.z zVar = androidx.compose.animation.z.PreEnter;
            androidx.compose.animation.z zVar2 = androidx.compose.animation.z.Visible;
            if (!bVar.f(zVar, zVar2)) {
                if (!bVar.f(zVar2, androidx.compose.animation.z.PostExit)) {
                    return b0.f12626b;
                }
                t0 t0VarM = this.f12643b.c().m();
                return (t0VarM == null || (y0VarF = t0VarM.f()) == null) ? b0.f12626b : y0VarF;
            }
            t0 t0VarM2 = this.f12642a.b().m();
            if (t0VarM2 != null && (y0VarF2 = t0VarM2.f()) != null) {
                return y0VarF2;
            }
            return b0.f12626b;
        }
    }

    static final class g extends kotlin.jvm.internal.l0 implements Function1<androidx.compose.animation.z, Float> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ d0 f12644a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ f0 f12645b;

        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f12646a;

            static {
                int[] iArr = new int[androidx.compose.animation.z.values().length];
                try {
                    iArr[androidx.compose.animation.z.Visible.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[androidx.compose.animation.z.PreEnter.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[androidx.compose.animation.z.PostExit.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f12646a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        g(d0 d0Var, f0 f0Var) {
            super(1);
            this.f12644a = d0Var;
            this.f12645b = f0Var;
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final Float invoke(androidx.compose.animation.z zVar) {
            int i10 = a.f12646a[zVar.ordinal()];
            float fG = 1.0f;
            if (i10 != 1) {
                if (i10 != 2) {
                    int i11 = 7 ^ 3;
                    if (i10 != 3) {
                        throw new kotlin.k0();
                    }
                    t0 t0VarM = this.f12645b.c().m();
                    if (t0VarM != null) {
                        fG = t0VarM.g();
                    }
                } else {
                    t0 t0VarM2 = this.f12644a.b().m();
                    if (t0VarM2 != null) {
                        fG = t0VarM2.g();
                    }
                }
            }
            return Float.valueOf(fG);
        }
    }

    static final class h extends kotlin.jvm.internal.l0 implements Function1<l3.b<androidx.compose.animation.z>, androidx.compose.animation.core.y0<androidx.compose.ui.graphics.z3>> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final h f12647a = new h();

        h() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* JADX INFO: renamed from: c, reason: merged with bridge method [inline-methods] */
        public final androidx.compose.animation.core.y0<androidx.compose.ui.graphics.z3> invoke(l3.b<androidx.compose.animation.z> bVar) {
            return androidx.compose.animation.core.p.r(0.0f, 0.0f, null, 7, null);
        }
    }

    static final class i extends kotlin.jvm.internal.l0 implements Function1<androidx.compose.animation.z, androidx.compose.ui.graphics.z3> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.graphics.z3 f12648a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ d0 f12649b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ f0 f12650c;

        public /* synthetic */ class a {

            /* JADX INFO: renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f12651a;

            static {
                int[] iArr = new int[androidx.compose.animation.z.values().length];
                try {
                    iArr[androidx.compose.animation.z.Visible.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[androidx.compose.animation.z.PreEnter.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[androidx.compose.animation.z.PostExit.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                f12651a = iArr;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        i(androidx.compose.ui.graphics.z3 z3Var, d0 d0Var, f0 f0Var) {
            super(1);
            this.f12648a = z3Var;
            this.f12649b = d0Var;
            this.f12650c = f0Var;
        }

        public final long c(androidx.compose.animation.z zVar) {
            androidx.compose.ui.graphics.z3 z3VarB;
            long jH;
            long jH2;
            int i10 = a.f12651a[zVar.ordinal()];
            if (i10 != 1) {
                z3VarB = null;
                if (i10 == 2) {
                    t0 t0VarM = this.f12649b.b().m();
                    if (t0VarM != null) {
                        jH = t0VarM.h();
                    } else {
                        t0 t0VarM2 = this.f12650c.c().m();
                        if (t0VarM2 != null) {
                            jH = t0VarM2.h();
                        }
                    }
                    z3VarB = androidx.compose.ui.graphics.z3.b(jH);
                } else {
                    if (i10 != 3) {
                        throw new kotlin.k0();
                    }
                    t0 t0VarM3 = this.f12650c.c().m();
                    if (t0VarM3 != null) {
                        jH2 = t0VarM3.h();
                    } else {
                        t0 t0VarM4 = this.f12649b.b().m();
                        if (t0VarM4 != null) {
                            jH2 = t0VarM4.h();
                        }
                    }
                    z3VarB = androidx.compose.ui.graphics.z3.b(jH2);
                }
            } else {
                z3VarB = this.f12648a;
            }
            return z3VarB != null ? z3VarB.o() : androidx.compose.ui.graphics.z3.f38723b.a();
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ androidx.compose.ui.graphics.z3 invoke(androidx.compose.animation.z zVar) {
            return androidx.compose.ui.graphics.z3.b(c(zVar));
        }
    }

    static final class j extends kotlin.jvm.internal.l0 implements Function0<Boolean> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final j f12652a = new j();

        j() {
            super(0);
        }

        /* JADX WARN: Can't rename method to resolve collision */
        @Override // kotlin.jvm.functions.Function0
        public final Boolean invoke() {
            return Boolean.TRUE;
        }
    }

    static final class k extends kotlin.jvm.internal.l0 implements Function1<androidx.compose.ui.graphics.r1, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ boolean f12653a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ Function0<Boolean> f12654b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        k(boolean z10, Function0<Boolean> function0) {
            super(1);
            this.f12653a = z10;
            this.f12654b = function0;
        }

        public final void c(androidx.compose.ui.graphics.r1 r1Var) {
            r1Var.O(!this.f12653a && this.f12654b.invoke().booleanValue());
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(androidx.compose.ui.graphics.r1 r1Var) {
            c(r1Var);
            return Unit.f312394a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class l extends kotlin.jvm.internal.l0 implements Function1<Integer, Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final l f12655a = new l();

        l() {
            super(1);
        }

        public final Integer c(int i10) {
            return 0;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
            return c(num.intValue());
        }
    }

    @SourceDebugExtension({"SMAP\nEnterExitTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EnterExitTransition.kt\nandroidx/compose/animation/EnterExitTransitionKt$expandHorizontally$2\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n*L\n1#1,1274:1\n54#2:1275\n59#2:1277\n85#3:1276\n90#3:1278\n80#3:1280\n30#4:1279\n*S KotlinDebug\n*F\n+ 1 EnterExitTransition.kt\nandroidx/compose/animation/EnterExitTransitionKt$expandHorizontally$2\n*L\n554#1:1275\n554#1:1277\n554#1:1276\n554#1:1278\n554#1:1280\n554#1:1279\n*E\n"})
    static final class m extends kotlin.jvm.internal.l0 implements Function1<androidx.compose.ui.unit.u, androidx.compose.ui.unit.u> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1<Integer, Integer> f12656a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        m(Function1<? super Integer, Integer> function1) {
            super(1);
            this.f12656a = function1;
        }

        public final long c(long j10) {
            return androidx.compose.ui.unit.u.e((((long) ((int) (j10 & com.rabbitmq.client.k0.f265952a))) & com.rabbitmq.client.k0.f265952a) | (((long) this.f12656a.invoke(Integer.valueOf((int) (j10 >> 32))).intValue()) << 32));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ androidx.compose.ui.unit.u invoke(androidx.compose.ui.unit.u uVar) {
            return androidx.compose.ui.unit.u.b(c(uVar.q()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SourceDebugExtension({"SMAP\nEnterExitTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EnterExitTransition.kt\nandroidx/compose/animation/EnterExitTransitionKt$expandIn$1\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,1274:1\n30#2:1275\n80#3:1276\n*S KotlinDebug\n*F\n+ 1 EnterExitTransition.kt\nandroidx/compose/animation/EnterExitTransitionKt$expandIn$1\n*L\n473#1:1275\n473#1:1276\n*E\n"})
    public static final class n extends kotlin.jvm.internal.l0 implements Function1<androidx.compose.ui.unit.u, androidx.compose.ui.unit.u> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final n f12657a = new n();

        n() {
            super(1);
        }

        public final long c(long j10) {
            long j11 = 0;
            return androidx.compose.ui.unit.u.e((j11 & com.rabbitmq.client.k0.f265952a) | (j11 << 32));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ androidx.compose.ui.unit.u invoke(androidx.compose.ui.unit.u uVar) {
            return androidx.compose.ui.unit.u.b(c(uVar.q()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class o extends kotlin.jvm.internal.l0 implements Function1<Integer, Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final o f12658a = new o();

        o() {
            super(1);
        }

        public final Integer c(int i10) {
            return 0;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
            return c(num.intValue());
        }
    }

    @SourceDebugExtension({"SMAP\nEnterExitTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EnterExitTransition.kt\nandroidx/compose/animation/EnterExitTransitionKt$expandVertically$2\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n*L\n1#1,1274:1\n54#2:1275\n59#2:1277\n85#3:1276\n90#3:1278\n80#3:1280\n30#4:1279\n*S KotlinDebug\n*F\n+ 1 EnterExitTransition.kt\nandroidx/compose/animation/EnterExitTransitionKt$expandVertically$2\n*L\n592#1:1275\n592#1:1277\n592#1:1276\n592#1:1278\n592#1:1280\n592#1:1279\n*E\n"})
    static final class p extends kotlin.jvm.internal.l0 implements Function1<androidx.compose.ui.unit.u, androidx.compose.ui.unit.u> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1<Integer, Integer> f12659a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        p(Function1<? super Integer, Integer> function1) {
            super(1);
            this.f12659a = function1;
        }

        public final long c(long j10) {
            return androidx.compose.ui.unit.u.e((((long) ((int) (j10 >> 32))) << 32) | (((long) this.f12659a.invoke(Integer.valueOf((int) (j10 & com.rabbitmq.client.k0.f265952a))).intValue()) & com.rabbitmq.client.k0.f265952a));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ androidx.compose.ui.unit.u invoke(androidx.compose.ui.unit.u uVar) {
            return androidx.compose.ui.unit.u.b(c(uVar.q()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class q extends kotlin.jvm.internal.l0 implements Function1<Integer, Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final q f12660a = new q();

        q() {
            super(1);
        }

        public final Integer c(int i10) {
            return 0;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
            return c(num.intValue());
        }
    }

    @SourceDebugExtension({"SMAP\nEnterExitTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EnterExitTransition.kt\nandroidx/compose/animation/EnterExitTransitionKt$shrinkHorizontally$2\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n*L\n1#1,1274:1\n54#2:1275\n59#2:1277\n85#3:1276\n90#3:1278\n80#3:1280\n30#4:1279\n*S KotlinDebug\n*F\n+ 1 EnterExitTransition.kt\nandroidx/compose/animation/EnterExitTransitionKt$shrinkHorizontally$2\n*L\n631#1:1275\n631#1:1277\n631#1:1276\n631#1:1278\n631#1:1280\n631#1:1279\n*E\n"})
    static final class r extends kotlin.jvm.internal.l0 implements Function1<androidx.compose.ui.unit.u, androidx.compose.ui.unit.u> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1<Integer, Integer> f12661a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        r(Function1<? super Integer, Integer> function1) {
            super(1);
            this.f12661a = function1;
        }

        public final long c(long j10) {
            return androidx.compose.ui.unit.u.e((((long) ((int) (j10 & com.rabbitmq.client.k0.f265952a))) & com.rabbitmq.client.k0.f265952a) | (((long) this.f12661a.invoke(Integer.valueOf((int) (j10 >> 32))).intValue()) << 32));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ androidx.compose.ui.unit.u invoke(androidx.compose.ui.unit.u uVar) {
            return androidx.compose.ui.unit.u.b(c(uVar.q()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @SourceDebugExtension({"SMAP\nEnterExitTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EnterExitTransition.kt\nandroidx/compose/animation/EnterExitTransitionKt$shrinkOut$1\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n*L\n1#1,1274:1\n30#2:1275\n80#3:1276\n*S KotlinDebug\n*F\n+ 1 EnterExitTransition.kt\nandroidx/compose/animation/EnterExitTransitionKt$shrinkOut$1\n*L\n513#1:1275\n513#1:1276\n*E\n"})
    public static final class s extends kotlin.jvm.internal.l0 implements Function1<androidx.compose.ui.unit.u, androidx.compose.ui.unit.u> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final s f12662a = new s();

        s() {
            super(1);
        }

        public final long c(long j10) {
            long j11 = 0;
            return androidx.compose.ui.unit.u.e((j11 & com.rabbitmq.client.k0.f265952a) | (j11 << 32));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ androidx.compose.ui.unit.u invoke(androidx.compose.ui.unit.u uVar) {
            return androidx.compose.ui.unit.u.b(c(uVar.q()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class t extends kotlin.jvm.internal.l0 implements Function1<Integer, Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final t f12663a = new t();

        t() {
            super(1);
        }

        public final Integer c(int i10) {
            return 0;
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
            return c(num.intValue());
        }
    }

    @SourceDebugExtension({"SMAP\nEnterExitTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EnterExitTransition.kt\nandroidx/compose/animation/EnterExitTransitionKt$shrinkVertically$2\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 IntSize.kt\nandroidx/compose/ui/unit/IntSizeKt\n*L\n1#1,1274:1\n54#2:1275\n59#2:1277\n85#3:1276\n90#3:1278\n80#3:1280\n30#4:1279\n*S KotlinDebug\n*F\n+ 1 EnterExitTransition.kt\nandroidx/compose/animation/EnterExitTransitionKt$shrinkVertically$2\n*L\n670#1:1275\n670#1:1277\n670#1:1276\n670#1:1278\n670#1:1280\n670#1:1279\n*E\n"})
    static final class u extends kotlin.jvm.internal.l0 implements Function1<androidx.compose.ui.unit.u, androidx.compose.ui.unit.u> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1<Integer, Integer> f12664a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        u(Function1<? super Integer, Integer> function1) {
            super(1);
            this.f12664a = function1;
        }

        public final long c(long j10) {
            return androidx.compose.ui.unit.u.e((((long) ((int) (j10 >> 32))) << 32) | (((long) this.f12664a.invoke(Integer.valueOf((int) (j10 & com.rabbitmq.client.k0.f265952a))).intValue()) & com.rabbitmq.client.k0.f265952a));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ androidx.compose.ui.unit.u invoke(androidx.compose.ui.unit.u uVar) {
            return androidx.compose.ui.unit.u.b(c(uVar.q()));
        }
    }

    static final class v extends kotlin.jvm.internal.l0 implements Function1<Integer, Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final v f12665a = new v();

        v() {
            super(1);
        }

        public final Integer c(int i10) {
            return Integer.valueOf((-i10) / 2);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
            return c(num.intValue());
        }
    }

    @SourceDebugExtension({"SMAP\nEnterExitTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EnterExitTransition.kt\nandroidx/compose/animation/EnterExitTransitionKt$slideInHorizontally$2\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n*L\n1#1,1274:1\n54#2:1275\n85#3:1276\n80#3:1278\n32#4:1277\n*S KotlinDebug\n*F\n+ 1 EnterExitTransition.kt\nandroidx/compose/animation/EnterExitTransitionKt$slideInHorizontally$2\n*L\n700#1:1275\n700#1:1276\n700#1:1278\n700#1:1277\n*E\n"})
    static final class w extends kotlin.jvm.internal.l0 implements Function1<androidx.compose.ui.unit.u, androidx.compose.ui.unit.q> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1<Integer, Integer> f12666a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        w(Function1<? super Integer, Integer> function1) {
            super(1);
            this.f12666a = function1;
        }

        public final long c(long j10) {
            return androidx.compose.ui.unit.q.f((((long) this.f12666a.invoke(Integer.valueOf((int) (j10 >> 32))).intValue()) << 32) | (((long) 0) & com.rabbitmq.client.k0.f265952a));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ androidx.compose.ui.unit.q invoke(androidx.compose.ui.unit.u uVar) {
            return androidx.compose.ui.unit.q.c(c(uVar.q()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final class x extends kotlin.jvm.internal.l0 implements Function1<Integer, Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final x f12667a = new x();

        x() {
            super(1);
        }

        public final Integer c(int i10) {
            return Integer.valueOf((-i10) / 2);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
            return c(num.intValue());
        }
    }

    @SourceDebugExtension({"SMAP\nEnterExitTransition.kt\nKotlin\n*S Kotlin\n*F\n+ 1 EnterExitTransition.kt\nandroidx/compose/animation/EnterExitTransitionKt$slideInVertically$2\n+ 2 IntSize.kt\nandroidx/compose/ui/unit/IntSize\n+ 3 InlineClassHelper.kt\nandroidx/compose/ui/util/InlineClassHelperKt\n+ 4 IntOffset.kt\nandroidx/compose/ui/unit/IntOffsetKt\n*L\n1#1,1274:1\n59#2:1275\n90#3:1276\n80#3:1278\n32#4:1277\n*S KotlinDebug\n*F\n+ 1 EnterExitTransition.kt\nandroidx/compose/animation/EnterExitTransitionKt$slideInVertically$2\n*L\n730#1:1275\n730#1:1276\n730#1:1278\n730#1:1277\n*E\n"})
    static final class y extends kotlin.jvm.internal.l0 implements Function1<androidx.compose.ui.unit.u, androidx.compose.ui.unit.q> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ Function1<Integer, Integer> f12668a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        y(Function1<? super Integer, Integer> function1) {
            super(1);
            this.f12668a = function1;
        }

        public final long c(long j10) {
            return androidx.compose.ui.unit.q.f((((long) 0) << 32) | (com.rabbitmq.client.k0.f265952a & ((long) this.f12668a.invoke(Integer.valueOf((int) (j10 & com.rabbitmq.client.k0.f265952a))).intValue())));
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ androidx.compose.ui.unit.q invoke(androidx.compose.ui.unit.u uVar) {
            return androidx.compose.ui.unit.q.c(c(uVar.q()));
        }
    }

    static final class z extends kotlin.jvm.internal.l0 implements Function1<Integer, Integer> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final z f12669a = new z();

        z() {
            super(1);
        }

        public final Integer c(int i10) {
            return Integer.valueOf((-i10) / 2);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Integer invoke(Integer num) {
            return c(num.intValue());
        }
    }

    static {
        int i10 = 7 & 0;
    }

    public static /* synthetic */ f0 A(androidx.compose.animation.core.y0 y0Var, androidx.compose.ui.e eVar, boolean z10, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            y0Var = androidx.compose.animation.core.p.r(0.0f, 400.0f, androidx.compose.ui.unit.u.b(j5.e(androidx.compose.ui.unit.u.f42720b)), 1, null);
        }
        if ((i10 & 2) != 0) {
            eVar = androidx.compose.ui.e.f37317a.e();
        }
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        if ((i10 & 8) != 0) {
            function1 = s.f12662a;
        }
        return z(y0Var, eVar, z10, function1);
    }

    @k7
    @NotNull
    public static final f0 B(@NotNull androidx.compose.animation.core.y0<androidx.compose.ui.unit.u> y0Var, @NotNull androidx.compose.ui.e.c cVar, boolean z10, @NotNull Function1<? super Integer, Integer> function1) {
        return z(y0Var, Q(cVar), z10, new u(function1));
    }

    public static /* synthetic */ f0 C(androidx.compose.animation.core.y0 y0Var, androidx.compose.ui.e.c cVar, boolean z10, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            y0Var = androidx.compose.animation.core.p.r(0.0f, 400.0f, androidx.compose.ui.unit.u.b(j5.e(androidx.compose.ui.unit.u.f42720b)), 1, null);
        }
        if ((i10 & 2) != 0) {
            cVar = androidx.compose.ui.e.f37317a.a();
        }
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        if ((i10 & 8) != 0) {
            function1 = t.f12663a;
        }
        return B(y0Var, cVar, z10, function1);
    }

    @k7
    @NotNull
    public static final d0 D(@NotNull androidx.compose.animation.core.y0<androidx.compose.ui.unit.q> y0Var, @NotNull Function1<? super androidx.compose.ui.unit.u, androidx.compose.ui.unit.q> function1) {
        return new e0(new p1(null, new k1(function1, y0Var), null, null, false, null, 61, null));
    }

    public static /* synthetic */ d0 E(androidx.compose.animation.core.y0 y0Var, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            y0Var = androidx.compose.animation.core.p.r(0.0f, 400.0f, androidx.compose.ui.unit.q.c(j5.d(androidx.compose.ui.unit.q.f42709b)), 1, null);
        }
        return D(y0Var, function1);
    }

    @k7
    @NotNull
    public static final d0 F(@NotNull androidx.compose.animation.core.y0<androidx.compose.ui.unit.q> y0Var, @NotNull Function1<? super Integer, Integer> function1) {
        return D(y0Var, new w(function1));
    }

    public static /* synthetic */ d0 G(androidx.compose.animation.core.y0 y0Var, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            y0Var = androidx.compose.animation.core.p.r(0.0f, 400.0f, androidx.compose.ui.unit.q.c(j5.d(androidx.compose.ui.unit.q.f42709b)), 1, null);
        }
        if ((i10 & 2) != 0) {
            function1 = v.f12665a;
        }
        return F(y0Var, function1);
    }

    @k7
    @NotNull
    public static final d0 H(@NotNull androidx.compose.animation.core.y0<androidx.compose.ui.unit.q> y0Var, @NotNull Function1<? super Integer, Integer> function1) {
        return D(y0Var, new y(function1));
    }

    public static /* synthetic */ d0 I(androidx.compose.animation.core.y0 y0Var, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            y0Var = androidx.compose.animation.core.p.r(0.0f, 400.0f, androidx.compose.ui.unit.q.c(j5.d(androidx.compose.ui.unit.q.f42709b)), 1, null);
        }
        if ((i10 & 2) != 0) {
            function1 = x.f12667a;
        }
        return H(y0Var, function1);
    }

    @k7
    @NotNull
    public static final f0 J(@NotNull androidx.compose.animation.core.y0<androidx.compose.ui.unit.q> y0Var, @NotNull Function1<? super androidx.compose.ui.unit.u, androidx.compose.ui.unit.q> function1) {
        return new g0(new p1(null, new k1(function1, y0Var), null, null, false, null, 61, null));
    }

    public static /* synthetic */ f0 K(androidx.compose.animation.core.y0 y0Var, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            y0Var = androidx.compose.animation.core.p.r(0.0f, 400.0f, androidx.compose.ui.unit.q.c(j5.d(androidx.compose.ui.unit.q.f42709b)), 1, null);
        }
        return J(y0Var, function1);
    }

    @k7
    @NotNull
    public static final f0 L(@NotNull androidx.compose.animation.core.y0<androidx.compose.ui.unit.q> y0Var, @NotNull Function1<? super Integer, Integer> function1) {
        return J(y0Var, new a0(function1));
    }

    public static /* synthetic */ f0 M(androidx.compose.animation.core.y0 y0Var, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            int i11 = 1 >> 1;
            y0Var = androidx.compose.animation.core.p.r(0.0f, 400.0f, androidx.compose.ui.unit.q.c(j5.d(androidx.compose.ui.unit.q.f42709b)), 1, null);
        }
        if ((i10 & 2) != 0) {
            function1 = z.f12669a;
        }
        return L(y0Var, function1);
    }

    @k7
    @NotNull
    public static final f0 N(@NotNull androidx.compose.animation.core.y0<androidx.compose.ui.unit.q> y0Var, @NotNull Function1<? super Integer, Integer> function1) {
        return J(y0Var, new c0(function1));
    }

    public static /* synthetic */ f0 O(androidx.compose.animation.core.y0 y0Var, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            y0Var = androidx.compose.animation.core.p.r(0.0f, 400.0f, androidx.compose.ui.unit.q.c(j5.d(androidx.compose.ui.unit.q.f42709b)), 1, null);
        }
        if ((i10 & 2) != 0) {
            function1 = C0055b0.f12632a;
        }
        return N(y0Var, function1);
    }

    private static final androidx.compose.ui.e P(androidx.compose.ui.e.b bVar) {
        androidx.compose.ui.e.a aVar = androidx.compose.ui.e.f37317a;
        if (Intrinsics.areEqual(bVar, aVar.u())) {
            return aVar.o();
        }
        return Intrinsics.areEqual(bVar, aVar.s()) ? aVar.k() : aVar.i();
    }

    private static final androidx.compose.ui.e Q(androidx.compose.ui.e.c cVar) {
        androidx.compose.ui.e.a aVar = androidx.compose.ui.e.f37317a;
        if (Intrinsics.areEqual(cVar, aVar.w())) {
            return aVar.y();
        }
        return Intrinsics.areEqual(cVar, aVar.a()) ? aVar.c() : aVar.i();
    }

    @androidx.compose.runtime.o
    @NotNull
    public static final d0 R(@NotNull l3<androidx.compose.animation.z> l3Var, @NotNull d0 d0Var, @Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(21614502, i10, -1, "androidx.compose.animation.trackActiveEnter (EnterExitTransition.kt:908)");
        }
        boolean z10 = (((i10 & 14) ^ 6) > 4 && c0Var.D(l3Var)) || (i10 & 6) == 4;
        Object objI0 = c0Var.i0();
        if (z10 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
            objI0 = d7.g(d0Var, null, 2, null);
            c0Var.Y(objI0);
        }
        n3 n3Var = (n3) objI0;
        if (l3Var.p() == l3Var.y() && l3Var.p() == androidx.compose.animation.z.Visible) {
            if (l3Var.E()) {
                T(n3Var, d0Var);
            } else {
                T(n3Var, d0.f13416a.a());
            }
        } else if (l3Var.y() == androidx.compose.animation.z.Visible) {
            T(n3Var, S(n3Var).c(d0Var));
        }
        d0 d0VarS = S(n3Var);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return d0VarS;
    }

    private static final d0 S(n3<d0> n3Var) {
        return n3Var.getValue();
    }

    private static final void T(n3<d0> n3Var, d0 d0Var) {
        n3Var.setValue(d0Var);
    }

    @androidx.compose.runtime.o
    @NotNull
    public static final f0 U(@NotNull l3<androidx.compose.animation.z> l3Var, @NotNull f0 f0Var, @Nullable androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(-1363864804, i10, -1, "androidx.compose.animation.trackActiveExit (EnterExitTransition.kt:928)");
        }
        boolean z10 = (((i10 & 14) ^ 6) > 4 && c0Var.D(l3Var)) || (i10 & 6) == 4;
        Object objI0 = c0Var.i0();
        if (z10 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
            objI0 = d7.g(f0Var, null, 2, null);
            c0Var.Y(objI0);
        }
        n3 n3Var = (n3) objI0;
        if (l3Var.p() == l3Var.y() && l3Var.p() == androidx.compose.animation.z.Visible) {
            if (l3Var.E()) {
                V(n3Var, f0Var);
            } else {
                V(n3Var, f0.f13493a.b());
            }
        } else if (l3Var.y() != androidx.compose.animation.z.Visible) {
            V(n3Var, W(n3Var).d(f0Var));
        }
        f0 f0VarW = W(n3Var);
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return f0VarW;
    }

    private static final void V(n3<f0> n3Var, f0 f0Var) {
        n3Var.setValue(f0Var);
    }

    private static final f0 W(n3<f0> n3Var) {
        return n3Var.getValue();
    }

    @NotNull
    public static final d0 X(@NotNull d0 d0Var, @NotNull q1 q1Var) {
        return new e0(new p1(null, null, null, null, false, MapsKt.mapOf(TuplesKt.to(q1Var.a(), q1Var)), 31, null));
    }

    @NotNull
    public static final f0 Y(@NotNull f0 f0Var, @NotNull q1 q1Var) {
        return new g0(new p1(null, null, null, null, false, MapsKt.mapOf(TuplesKt.to(q1Var.a(), q1Var)), 31, null));
    }

    /* JADX WARN: Code duplicated, block: B:43:0x012a A[PHI: r1
      0x012a: PHI (r1v12 androidx.compose.animation.d0) = (r1v10 androidx.compose.animation.d0), (r1v14 androidx.compose.animation.d0) binds: [B:42:0x0128, B:38:0x011f] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:47:0x0137  */
    /* JADX WARN: Code duplicated, block: B:50:0x0140  */
    /* JADX WARN: Code duplicated, block: B:53:0x0146 A[PHI: r2
      0x0146: PHI (r2v11 androidx.compose.animation.f0) = (r2v9 androidx.compose.animation.f0), (r2v12 androidx.compose.animation.f0) binds: [B:52:0x0144, B:48:0x013d] A[DONT_GENERATE, DONT_INLINE]] */
    /* JADX WARN: Code duplicated, block: B:54:0x0148  */
    /* JADX WARN: Code duplicated, block: B:57:0x0158  */
    /* JADX WARN: Code duplicated, block: B:59:0x015e  */
    /* JADX WARN: Code duplicated, block: B:65:0x0170  */
    /* JADX WARN: Code duplicated, block: B:67:0x0178  */
    /* JADX WARN: Code duplicated, block: B:70:0x0190  */
    @androidx.compose.runtime.o
    private static final m0 e(final l3<androidx.compose.animation.z> l3Var, d0 d0Var, f0 f0Var, String str, androidx.compose.runtime.c0 c0Var, int i10) {
        final l3.a aVar;
        final l3.a aVar2;
        d0 d0Var2;
        boolean z10;
        f0 f0Var2;
        boolean z11;
        boolean zK0;
        Object objI0;
        androidx.compose.runtime.c0 c0Var2 = c0Var;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(642253525, i10, -1, "androidx.compose.animation.createGraphicsLayerBlock (EnterExitTransition.kt:956)");
        }
        boolean z12 = true;
        boolean z13 = (d0Var.b().k() == null && f0Var.c().k() == null) ? false : true;
        boolean z14 = (d0Var.b().m() == null && f0Var.c().m() == null) ? false : true;
        l3.a aVarB = null;
        if (z13) {
            c0Var2.E(-703859581);
            z3<Float, androidx.compose.animation.core.s> z3VarP = t4.P(kotlin.jvm.internal.z.f312833a);
            Object objI1 = c0Var2.i0();
            if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                objI1 = str + " alpha";
                c0Var2.Y(objI1);
            }
            l3.a aVarB2 = w3.B(l3Var, z3VarP, (String) objI1, c0Var2, (i10 & 14) | a5.S0, 0);
            c0Var2 = c0Var2;
            c0Var2.A();
            aVar = aVarB2;
        } else {
            c0Var2.E(-703690136);
            c0Var2.A();
            aVar = null;
        }
        if (z14) {
            c0Var2.E(-703622493);
            z3<Float, androidx.compose.animation.core.s> z3VarP2 = t4.P(kotlin.jvm.internal.z.f312833a);
            Object objI2 = c0Var2.i0();
            if (objI2 == androidx.compose.runtime.c0.f35327a.a()) {
                objI2 = str + " scale";
                c0Var2.Y(objI2);
            }
            l3.a aVarB3 = w3.B(l3Var, z3VarP2, (String) objI2, c0Var2, (i10 & 14) | a5.S0, 0);
            c0Var2.A();
            aVar2 = aVarB3;
        } else {
            c0Var2.E(-703453048);
            c0Var2.A();
            aVar2 = null;
        }
        if (z14) {
            c0Var2.E(-703375392);
            aVarB = w3.B(l3Var, f12625a, "TransformOriginInterruptionHandling", c0Var2, (i10 & 14) | a5.S0, 0);
            c0Var2.A();
        } else {
            c0Var2.E(-703203064);
            c0Var2.A();
        }
        boolean zK1 = c0Var2.k0(aVar);
        if (((i10 & com.planner5d.library.engine.input.f.b.B) ^ 48) > 32) {
            d0Var2 = d0Var;
            if (c0Var2.D(d0Var2)) {
                z10 = true;
            }
            boolean z15 = zK1 | z10;
            if (((i10 & 896) ^ a5.S0) > 256) {
                f0Var2 = f0Var;
                if (!c0Var2.D(f0Var2)) {
                    z11 = true;
                }
                boolean zK2 = z15 | z11 | c0Var2.k0(aVar2);
                if ((((i10 & 14) ^ 6) > 4 || !c0Var2.D(l3Var)) && (i10 & 6) != 4) {
                }
                zK0 = zK2 | z12 | c0Var2.k0(aVarB);
                objI0 = c0Var2.i0();
                if (zK0 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    final d0 d0Var3 = d0Var2;
                    final f0 f0Var3 = f0Var2;
                    final l3.a aVar3 = aVarB;
                    m0 m0Var = new m0() { // from class: androidx.compose.animation.a0
                        @Override // androidx.compose.animation.m0
                        public final Function1 r() {
                            return b0.f(aVar, aVar2, l3Var, d0Var3, f0Var3, aVar3);
                        }
                    };
                    c0Var2.Y(m0Var);
                    objI0 = m0Var;
                }
                m0 m0Var2 = (m0) objI0;
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                return m0Var2;
            }
            f0Var2 = f0Var;
            if ((i10 & a5.S0) == 256) {
                z11 = true;
            } else {
                z11 = false;
            }
            boolean zK3 = z15 | z11 | c0Var2.k0(aVar2);
            z12 = ((i10 & 14) ^ 6) > 4 ? false : false;
            zK0 = zK3 | z12 | c0Var2.k0(aVarB);
            objI0 = c0Var2.i0();
            if (zK0) {
                final d0 d0Var4 = d0Var2;
                final f0 f0Var4 = f0Var2;
                final l3.a aVar4 = aVarB;
                m0 m0Var3 = new m0() { // from class: androidx.compose.animation.a0
                    @Override // androidx.compose.animation.m0
                    public final Function1 r() {
                        return b0.f(aVar, aVar2, l3Var, d0Var4, f0Var4, aVar4);
                    }
                };
                c0Var2.Y(m0Var3);
                objI0 = m0Var3;
            } else {
                final d0 d0Var5 = d0Var2;
                final f0 f0Var5 = f0Var2;
                final l3.a aVar5 = aVarB;
                m0 m0Var4 = new m0() { // from class: androidx.compose.animation.a0
                    @Override // androidx.compose.animation.m0
                    public final Function1 r() {
                        return b0.f(aVar, aVar2, l3Var, d0Var5, f0Var5, aVar5);
                    }
                };
                c0Var2.Y(m0Var4);
                objI0 = m0Var4;
            }
            m0 m0Var5 = (m0) objI0;
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            return m0Var5;
        }
        d0Var2 = d0Var;
        if ((i10 & 48) == 32) {
            z10 = true;
        } else {
            z10 = false;
        }
        boolean z16 = zK1 | z10;
        if (((i10 & 896) ^ a5.S0) > 256) {
            f0Var2 = f0Var;
            if (!c0Var2.D(f0Var2)) {
                z11 = true;
            }
            boolean zK4 = z16 | z11 | c0Var2.k0(aVar2);
            if (((i10 & 14) ^ 6) > 4) {
            }
            zK0 = zK4 | z12 | c0Var2.k0(aVarB);
            objI0 = c0Var2.i0();
            if (zK0) {
                final d0 d0Var6 = d0Var2;
                final f0 f0Var6 = f0Var2;
                final l3.a aVar6 = aVarB;
                m0 m0Var6 = new m0() { // from class: androidx.compose.animation.a0
                    @Override // androidx.compose.animation.m0
                    public final Function1 r() {
                        return b0.f(aVar, aVar2, l3Var, d0Var6, f0Var6, aVar6);
                    }
                };
                c0Var2.Y(m0Var6);
                objI0 = m0Var6;
            } else {
                final d0 d0Var7 = d0Var2;
                final f0 f0Var7 = f0Var2;
                final l3.a aVar7 = aVarB;
                m0 m0Var7 = new m0() { // from class: androidx.compose.animation.a0
                    @Override // androidx.compose.animation.m0
                    public final Function1 r() {
                        return b0.f(aVar, aVar2, l3Var, d0Var7, f0Var7, aVar7);
                    }
                };
                c0Var2.Y(m0Var7);
                objI0 = m0Var7;
            }
            m0 m0Var8 = (m0) objI0;
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            return m0Var8;
        }
        f0Var2 = f0Var;
        if ((i10 & a5.S0) == 256) {
            z11 = true;
        } else {
            z11 = false;
        }
        boolean zK5 = z16 | z11 | c0Var2.k0(aVar2);
        if (((i10 & 14) ^ 6) > 4) {
        }
        zK0 = zK5 | z12 | c0Var2.k0(aVarB);
        objI0 = c0Var2.i0();
        if (zK0) {
            final d0 d0Var8 = d0Var2;
            final f0 f0Var8 = f0Var2;
            final l3.a aVar8 = aVarB;
            m0 m0Var9 = new m0() { // from class: androidx.compose.animation.a0
                @Override // androidx.compose.animation.m0
                public final Function1 r() {
                    return b0.f(aVar, aVar2, l3Var, d0Var8, f0Var8, aVar8);
                }
            };
            c0Var2.Y(m0Var9);
            objI0 = m0Var9;
        } else {
            final d0 d0Var9 = d0Var2;
            final f0 f0Var9 = f0Var2;
            final l3.a aVar9 = aVarB;
            m0 m0Var10 = new m0() { // from class: androidx.compose.animation.a0
                @Override // androidx.compose.animation.m0
                public final Function1 r() {
                    return b0.f(aVar, aVar2, l3Var, d0Var9, f0Var9, aVar9);
                }
            };
            c0Var2.Y(m0Var10);
            objI0 = m0Var10;
        }
        m0 m0Var11 = (m0) objI0;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return m0Var11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Code duplicated, block: B:18:0x0056  */
    public static final Function1 f(l3.a aVar, l3.a aVar2, l3 l3Var, d0 d0Var, f0 f0Var, l3.a aVar3) {
        androidx.compose.ui.graphics.z3 z3VarB;
        n7 n7VarA = aVar != null ? aVar.a(new c(d0Var, f0Var), new d(d0Var, f0Var)) : null;
        n7 n7VarA2 = aVar2 != null ? aVar2.a(new f(d0Var, f0Var), new g(d0Var, f0Var)) : null;
        if (l3Var.p() == androidx.compose.animation.z.PreEnter) {
            t0 t0VarM = d0Var.b().m();
            if (t0VarM == null && (t0VarM = f0Var.c().m()) == null) {
                z3VarB = null;
            } else {
                z3VarB = androidx.compose.ui.graphics.z3.b(t0VarM.h());
            }
        } else {
            t0 t0VarM2 = f0Var.c().m();
            if (t0VarM2 == null && (t0VarM2 = d0Var.b().m()) == null) {
                z3VarB = null;
            } else {
                z3VarB = androidx.compose.ui.graphics.z3.b(t0VarM2.h());
            }
        }
        return new e(n7VarA, n7VarA2, aVar3 != null ? aVar3.a(h.f12647a, new i(z3VarB, d0Var, f0Var)) : null);
    }

    @androidx.compose.runtime.o
    @NotNull
    public static final androidx.compose.ui.a0 g(@NotNull l3<androidx.compose.animation.z> l3Var, @NotNull d0 d0Var, @NotNull f0 f0Var, @Nullable Function0<Boolean> function0, @NotNull String str, @Nullable androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        Function0<Boolean> function1;
        l3.a aVar;
        l3.a aVar2;
        androidx.compose.animation.u uVarI;
        if ((i11 & 4) != 0) {
            Object objI0 = c0Var.i0();
            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = j.f12652a;
                c0Var.Y(objI0);
            }
            function1 = (Function0) objI0;
        } else {
            function1 = function0;
        }
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(28261782, i10, -1, "androidx.compose.animation.createModifier (EnterExitTransition.kt:860)");
        }
        int i12 = i10 & 14;
        d0 d0VarR = R(l3Var, d0Var, c0Var, i10 & okhttp3.internal.ws.g.f334652s);
        int i13 = i10 >> 3;
        f0 f0VarU = U(l3Var, f0Var, c0Var, (i13 & com.planner5d.library.engine.input.f.b.B) | i12);
        boolean z10 = true;
        boolean z11 = (d0VarR.b().n() == null && f0VarU.c().n() == null) ? false : true;
        boolean z12 = (d0VarR.b().i() == null && f0VarU.c().i() == null) ? false : true;
        l3.a aVarB = null;
        if (z11) {
            c0Var.E(133838277);
            z3<androidx.compose.ui.unit.q, androidx.compose.animation.core.t> z3VarN = t4.N(androidx.compose.ui.unit.q.f42709b);
            Object objI1 = c0Var.i0();
            if (objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                objI1 = str + " slide";
                c0Var.Y(objI1);
            }
            l3.a aVarB2 = w3.B(l3Var, z3VarN, (String) objI1, c0Var, i12 | a5.S0, 0);
            c0Var.A();
            aVar = aVarB2;
        } else {
            c0Var.E(133944080);
            c0Var.A();
            aVar = null;
        }
        if (z12) {
            c0Var.E(134035871);
            z3<androidx.compose.ui.unit.u, androidx.compose.animation.core.t> z3VarO = t4.O(androidx.compose.ui.unit.u.f42720b);
            Object objI2 = c0Var.i0();
            if (objI2 == androidx.compose.runtime.c0.f35327a.a()) {
                objI2 = str + " shrink/expand";
                c0Var.Y(objI2);
            }
            l3.a aVarB3 = w3.B(l3Var, z3VarO, (String) objI2, c0Var, i12 | a5.S0, 0);
            c0Var.A();
            aVar2 = aVarB3;
        } else {
            c0Var.E(134146695);
            c0Var.A();
            aVar2 = null;
        }
        if (z12) {
            c0Var.E(134220321);
            z3<androidx.compose.ui.unit.q, androidx.compose.animation.core.t> z3VarN2 = t4.N(androidx.compose.ui.unit.q.f42709b);
            Object objI3 = c0Var.i0();
            if (objI3 == androidx.compose.runtime.c0.f35327a.a()) {
                objI3 = str + " InterruptionHandlingOffset";
                c0Var.Y(objI3);
            }
            aVarB = w3.B(l3Var, z3VarN2, (String) objI3, c0Var, i12 | a5.S0, 0);
            c0Var.A();
        } else {
            c0Var.E(134390727);
            c0Var.A();
        }
        androidx.compose.animation.u uVarI2 = d0VarR.b().i();
        boolean z13 = ((uVarI2 == null || uVarI2.i()) && ((uVarI = f0VarU.c().i()) == null || uVarI.i()) && z12) ? false : true;
        m0 m0VarE = e(l3Var, d0VarR, f0VarU, str, c0Var, i12 | (i13 & 7168));
        androidx.compose.ui.a0.a aVar3 = androidx.compose.ui.a0.E;
        boolean zG = c0Var.G(z13);
        if ((((i10 & 7168) ^ 3072) <= 2048 || !c0Var.D(function1)) && (i10 & 3072) != 2048) {
            z10 = false;
        }
        boolean z14 = zG | z10;
        Object objI4 = c0Var.i0();
        if (z14 || objI4 == androidx.compose.runtime.c0.f35327a.a()) {
            objI4 = new k(z13, function1);
            c0Var.Y(objI4);
        }
        androidx.compose.ui.a0 a0VarB2 = androidx.compose.ui.graphics.q1.a(aVar3, (Function1) objI4).B2(new EnterExitTransitionElement(l3Var, aVar2, aVarB, aVar, d0VarR, f0VarU, function1, m0VarE));
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return a0VarB2;
    }

    @k7
    @NotNull
    public static final d0 h(@NotNull androidx.compose.animation.core.y0<androidx.compose.ui.unit.u> y0Var, @NotNull androidx.compose.ui.e.b bVar, boolean z10, @NotNull Function1<? super Integer, Integer> function1) {
        return j(y0Var, P(bVar), z10, new m(function1));
    }

    public static /* synthetic */ d0 i(androidx.compose.animation.core.y0 y0Var, androidx.compose.ui.e.b bVar, boolean z10, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            y0Var = androidx.compose.animation.core.p.r(0.0f, 400.0f, androidx.compose.ui.unit.u.b(j5.e(androidx.compose.ui.unit.u.f42720b)), 1, null);
        }
        if ((i10 & 2) != 0) {
            bVar = androidx.compose.ui.e.f37317a.s();
        }
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        if ((i10 & 8) != 0) {
            function1 = l.f12655a;
        }
        return h(y0Var, bVar, z10, function1);
    }

    @k7
    @NotNull
    public static final d0 j(@NotNull androidx.compose.animation.core.y0<androidx.compose.ui.unit.u> y0Var, @NotNull androidx.compose.ui.e eVar, boolean z10, @NotNull Function1<? super androidx.compose.ui.unit.u, androidx.compose.ui.unit.u> function1) {
        return new e0(new p1(null, null, new androidx.compose.animation.u(eVar, function1, y0Var, z10), null, false, null, 59, null));
    }

    public static /* synthetic */ d0 k(androidx.compose.animation.core.y0 y0Var, androidx.compose.ui.e eVar, boolean z10, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            y0Var = androidx.compose.animation.core.p.r(0.0f, 400.0f, androidx.compose.ui.unit.u.b(j5.e(androidx.compose.ui.unit.u.f42720b)), 1, null);
        }
        if ((i10 & 2) != 0) {
            eVar = androidx.compose.ui.e.f37317a.e();
        }
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        if ((i10 & 8) != 0) {
            function1 = n.f12657a;
        }
        return j(y0Var, eVar, z10, function1);
    }

    @k7
    @NotNull
    public static final d0 l(@NotNull androidx.compose.animation.core.y0<androidx.compose.ui.unit.u> y0Var, @NotNull androidx.compose.ui.e.c cVar, boolean z10, @NotNull Function1<? super Integer, Integer> function1) {
        return j(y0Var, Q(cVar), z10, new p(function1));
    }

    public static /* synthetic */ d0 m(androidx.compose.animation.core.y0 y0Var, androidx.compose.ui.e.c cVar, boolean z10, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            y0Var = androidx.compose.animation.core.p.r(0.0f, 400.0f, androidx.compose.ui.unit.u.b(j5.e(androidx.compose.ui.unit.u.f42720b)), 1, null);
        }
        if ((i10 & 2) != 0) {
            cVar = androidx.compose.ui.e.f37317a.a();
        }
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        if ((i10 & 8) != 0) {
            function1 = o.f12658a;
        }
        return l(y0Var, cVar, z10, function1);
    }

    @k7
    @NotNull
    public static final d0 n(@NotNull androidx.compose.animation.core.y0<Float> y0Var, float f10) {
        return new e0(new p1(new j0(f10, y0Var), null, null, null, false, null, 62, null));
    }

    public static /* synthetic */ d0 o(androidx.compose.animation.core.y0 y0Var, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            int i11 = 4 >> 5;
            y0Var = androidx.compose.animation.core.p.r(0.0f, 400.0f, null, 5, null);
        }
        if ((i10 & 2) != 0) {
            f10 = 0.0f;
        }
        return n(y0Var, f10);
    }

    @k7
    @NotNull
    public static final f0 p(@NotNull androidx.compose.animation.core.y0<Float> y0Var, float f10) {
        return new g0(new p1(new j0(f10, y0Var), null, null, null, false, null, 62, null));
    }

    public static /* synthetic */ f0 q(androidx.compose.animation.core.y0 y0Var, float f10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            y0Var = androidx.compose.animation.core.p.r(0.0f, 400.0f, null, 5, null);
        }
        if ((i10 & 2) != 0) {
            f10 = 0.0f;
        }
        return p(y0Var, f10);
    }

    @Nullable
    public static final <T extends q1> T r(@NotNull d0 d0Var, @NotNull r1<T> r1Var) {
        q1 q1Var = d0Var.b().j().get(r1Var);
        if (q1Var instanceof q1) {
            return (T) q1Var;
        }
        return null;
    }

    @Nullable
    public static final <T extends q1> T s(@NotNull f0 f0Var, @NotNull r1<T> r1Var) {
        q1 q1Var = f0Var.c().j().get(r1Var);
        if (q1Var instanceof q1) {
            return (T) q1Var;
        }
        return null;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @k7
    @NotNull
    public static final d0 t(@NotNull androidx.compose.animation.core.y0<Float> y0Var, float f10, long j10) {
        return new e0(new p1(null, null, null, new t0(f10, j10, y0Var, null), false, 0 == true ? 1 : 0, 55, null));
    }

    public static /* synthetic */ d0 u(androidx.compose.animation.core.y0 y0Var, float f10, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            y0Var = androidx.compose.animation.core.p.r(0.0f, 400.0f, null, 5, null);
        }
        if ((i10 & 2) != 0) {
            f10 = 0.0f;
        }
        if ((i10 & 4) != 0) {
            j10 = androidx.compose.ui.graphics.z3.f38723b.a();
        }
        return t(y0Var, f10, j10);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @k7
    @NotNull
    public static final f0 v(@NotNull androidx.compose.animation.core.y0<Float> y0Var, float f10, long j10) {
        return new g0(new p1(null, null, null, new t0(f10, j10, y0Var, null), false, 0 == true ? 1 : 0, 55, null));
    }

    public static /* synthetic */ f0 w(androidx.compose.animation.core.y0 y0Var, float f10, long j10, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            y0Var = androidx.compose.animation.core.p.r(0.0f, 400.0f, null, 5, null);
        }
        if ((i10 & 2) != 0) {
            f10 = 0.0f;
        }
        if ((i10 & 4) != 0) {
            j10 = androidx.compose.ui.graphics.z3.f38723b.a();
        }
        return v(y0Var, f10, j10);
    }

    @k7
    @NotNull
    public static final f0 x(@NotNull androidx.compose.animation.core.y0<androidx.compose.ui.unit.u> y0Var, @NotNull androidx.compose.ui.e.b bVar, boolean z10, @NotNull Function1<? super Integer, Integer> function1) {
        return z(y0Var, P(bVar), z10, new r(function1));
    }

    public static /* synthetic */ f0 y(androidx.compose.animation.core.y0 y0Var, androidx.compose.ui.e.b bVar, boolean z10, Function1 function1, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            y0Var = androidx.compose.animation.core.p.r(0.0f, 400.0f, androidx.compose.ui.unit.u.b(j5.e(androidx.compose.ui.unit.u.f42720b)), 1, null);
        }
        if ((i10 & 2) != 0) {
            bVar = androidx.compose.ui.e.f37317a.s();
        }
        if ((i10 & 4) != 0) {
            z10 = true;
        }
        if ((i10 & 8) != 0) {
            function1 = q.f12660a;
        }
        return x(y0Var, bVar, z10, function1);
    }

    @k7
    @NotNull
    public static final f0 z(@NotNull androidx.compose.animation.core.y0<androidx.compose.ui.unit.u> y0Var, @NotNull androidx.compose.ui.e eVar, boolean z10, @NotNull Function1<? super androidx.compose.ui.unit.u, androidx.compose.ui.unit.u> function1) {
        return new g0(new p1(null, null, new androidx.compose.animation.u(eVar, function1, y0Var, z10), null, false, null, 59, null));
    }
}

package androidx.compose.material;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* JADX INFO: loaded from: classes.dex */
@SourceDebugExtension({"SMAP\nSnackbarHost.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnackbarHost.kt\nandroidx/compose/material/SnackbarHostKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 5 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 6 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 7 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 8 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,362:1\n75#2:363\n1282#3,6:364\n1282#3,6:370\n1282#3,6:442\n1282#3,6:448\n1282#3,6:454\n1282#3,6:460\n1282#3,6:466\n150#4,3:376\n34#4,6:379\n153#4:385\n197#4,2:386\n34#4,6:388\n199#4:394\n34#4,6:432\n70#5:395\n67#5,9:396\n77#5:441\n79#6,6:405\n86#6,3:420\n89#6,2:429\n93#6:440\n347#7,9:411\n356#7:431\n357#7,2:438\n4206#8,6:423\n*S KotlinDebug\n*F\n+ 1 SnackbarHost.kt\nandroidx/compose/material/SnackbarHostKt\n*L\n158#1:363\n159#1:364,6\n247#1:370,6\n340#1:442,6\n342#1:448,6\n343#1:454,6\n352#1:460,6\n353#1:466,6\n251#1:376,3\n251#1:379,6\n251#1:385\n256#1:386,2\n256#1:388,6\n256#1:394\n318#1:432,6\n316#1:395\n316#1:396,9\n316#1:441\n316#1:405,6\n316#1:420,3\n316#1:429,2\n316#1:440\n316#1:411,9\n316#1:431\n316#1:438,2\n316#1:423,6\n*E\n"})
public final class hg {

    /* JADX INFO: renamed from: a, reason: collision with root package name */
    private static final int f23055a = 150;

    /* JADX INFO: renamed from: b, reason: collision with root package name */
    private static final int f23056b = 75;

    /* JADX INFO: renamed from: c, reason: collision with root package name */
    private static final int f23057c = 0;

    @SourceDebugExtension({"SMAP\nSnackbarHost.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnackbarHost.kt\nandroidx/compose/material/SnackbarHostKt$FadeInFadeOutWithScale$1$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,362:1\n1282#2,6:363\n1282#2,6:369\n70#3:375\n67#3,9:376\n77#3:415\n79#4,6:385\n86#4,3:400\n89#4,2:409\n93#4:414\n347#5,9:391\n356#5,3:411\n4206#6,6:403\n*S KotlinDebug\n*F\n+ 1 SnackbarHost.kt\nandroidx/compose/material/SnackbarHostKt$FadeInFadeOutWithScale$1$1\n*L\n276#1:363,6\n300#1:369,6\n294#1:375\n294#1:376,9\n294#1:415\n294#1:385,6\n294#1:400,3\n294#1:409,2\n294#1:414\n294#1:391,9\n294#1:411,3\n294#1:403,6\n*E\n"})
    static final class a implements pj.n<Function2<? super androidx.compose.runtime.c0, ? super Integer, ? extends Unit>, androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ xf f23058a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ xf f23059b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ List<xf> f23060c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ s8<xf> f23061d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ String f23062e;

        a(xf xfVar, xf xfVar2, List<xf> list, s8<xf> s8Var, String str) {
            this.f23058a = xfVar;
            this.f23059b = xfVar2;
            this.f23060c = list;
            this.f23061d = s8Var;
            this.f23062e = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit m(final xf xfVar, s8 s8Var) {
            if (!Intrinsics.areEqual(xfVar, s8Var.a())) {
                CollectionsKt.removeAll(s8Var.b(), new Function1() { // from class: androidx.compose.material.eg
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(hg.a.n(xfVar, (r8) obj));
                    }
                });
                androidx.compose.runtime.q4 q4VarC = s8Var.c();
                if (q4VarC != null) {
                    q4VarC.invalidate();
                }
            }
            return Unit.f312394a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean n(xf xfVar, r8 r8Var) {
            return Intrinsics.areEqual(r8Var.e(), xfVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit s(boolean z10, String str, final xf xfVar, androidx.compose.ui.semantics.e0 e0Var) {
            if (z10) {
                androidx.compose.ui.semantics.b0.E1(e0Var, androidx.compose.ui.semantics.g.f41102b.b());
            }
            androidx.compose.ui.semantics.b0.G1(e0Var, str);
            androidx.compose.ui.semantics.b0.p(e0Var, null, new Function0() { // from class: androidx.compose.material.dg
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Boolean.valueOf(hg.a.v(xfVar));
                }
            }, 1, null);
            return Unit.f312394a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean v(xf xfVar) {
            xfVar.dismiss();
            return true;
        }

        @Override // pj.n
        public /* bridge */ /* synthetic */ Unit invoke(Function2<? super androidx.compose.runtime.c0, ? super Integer, ? extends Unit> function2, androidx.compose.runtime.c0 c0Var, Integer num) {
            k(function2, c0Var, num.intValue());
            return Unit.f312394a;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
        public final void k(Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit> function2, androidx.compose.runtime.c0 c0Var, int i10) {
            int i11;
            if ((i10 & 6) == 0) {
                i11 = i10 | (c0Var.k0(function2) ? 4 : 2);
            } else {
                i11 = i10;
            }
            if (!c0Var.h((i11 & 19) != 18, i11 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1032415134, i11, -1, "androidx.compose.material.FadeInFadeOutWithScale.<anonymous>.<anonymous> (SnackbarHost.kt:257)");
            }
            final boolean zAreEqual = Intrinsics.areEqual(this.f23058a, this.f23059b);
            int i12 = zAreEqual ? 150 : 75;
            int i13 = (!zAreEqual || androidx.compose.ui.util.d.f(this.f23060c).size() == 1) ? 0 : 75;
            androidx.compose.animation.core.y3 y3VarS = androidx.compose.animation.core.p.s(i12, i13, androidx.compose.animation.core.u0.e());
            boolean zK0 = c0Var.k0(this.f23058a) | c0Var.k0(this.f23061d);
            final xf xfVar = this.f23058a;
            final s8<xf> s8Var = this.f23061d;
            Object objI0 = c0Var.i0();
            if (zK0 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new Function0() { // from class: androidx.compose.material.fg
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return hg.a.m(xfVar, s8Var);
                    }
                };
                c0Var.Y(objI0);
            }
            androidx.compose.runtime.n7 n7VarJ = hg.j(y3VarS, zAreEqual, (Function0) objI0, c0Var, 0, 0);
            androidx.compose.runtime.n7 n7VarL = hg.l(androidx.compose.animation.core.p.s(i12, i13, androidx.compose.animation.core.u0.d()), zAreEqual, c0Var, 0);
            androidx.compose.ui.a0 a0VarD = androidx.compose.ui.graphics.q1.d(androidx.compose.ui.a0.E, (124895 & 1) != 0 ? 1.0f : ((Number) n7VarL.getValue()).floatValue(), (124895 & 2) != 0 ? 1.0f : ((Number) n7VarL.getValue()).floatValue(), (124895 & 4) == 0 ? ((Number) n7VarJ.getValue()).floatValue() : 1.0f, (124895 & 8) != 0 ? 0.0f : 0.0f, (124895 & 16) != 0 ? 0.0f : 0.0f, (124895 & 32) != 0 ? 0.0f : 0.0f, (124895 & 64) != 0 ? 0.0f : 0.0f, (124895 & 128) != 0 ? 0.0f : 0.0f, (124895 & 256) == 0 ? 0.0f : 0.0f, (124895 & 512) != 0 ? 8.0f : 0.0f, (124895 & 1024) != 0 ? androidx.compose.ui.graphics.z3.f38723b.a() : 0L, (124895 & 2048) != 0 ? androidx.compose.ui.graphics.d3.a() : null, (124895 & 4096) != 0 ? false : false, (124895 & 8192) != 0 ? null : null, (124895 & 16384) != 0 ? androidx.compose.ui.graphics.s1.b() : 0L, (32768 & 124895) != 0 ? androidx.compose.ui.graphics.s1.b() : 0L, (124895 & 65536) != 0 ? androidx.compose.ui.graphics.h1.f37790b.a() : 0);
            boolean zG = c0Var.G(zAreEqual) | c0Var.D(this.f23062e) | c0Var.k0(this.f23058a);
            final String str = this.f23062e;
            final xf xfVar2 = this.f23058a;
            Object objI1 = c0Var.i0();
            if (zG || objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                objI1 = new Function1() { // from class: androidx.compose.material.gg
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return hg.a.s(zAreEqual, str, xfVar2, (androidx.compose.ui.semantics.e0) obj);
                    }
                };
                c0Var.Y(objI1);
            }
            androidx.compose.ui.a0 a0VarF = androidx.compose.ui.semantics.t.f(a0VarD, false, (Function1) objI1, 1, null);
            androidx.compose.ui.layout.a1 a1VarK = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
            int iJ = androidx.compose.runtime.v.j(c0Var, 0);
            androidx.compose.runtime.b1 b1VarK = c0Var.k();
            androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0Var, a0VarF);
            androidx.compose.ui.node.g.a aVar = androidx.compose.ui.node.g.I;
            Function0<androidx.compose.ui.node.g> function0A = aVar.a();
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
            androidx.compose.runtime.y7.n(c0VarD, a1VarK, aVar.e());
            androidx.compose.runtime.y7.n(c0VarD, b1VarK, aVar.g());
            Function2<androidx.compose.ui.node.g, Integer, Unit> function2B = aVar.b();
            if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iJ))) {
                c0VarD.Y(Integer.valueOf(iJ));
                c0VarD.f(Integer.valueOf(iJ), function2B);
            }
            androidx.compose.runtime.y7.n(c0VarD, a0VarN, aVar.f());
            androidx.compose.foundation.layout.d0 d0Var = androidx.compose.foundation.layout.d0.f15956a;
            function2.invoke(c0Var, Integer.valueOf(i11 & 14));
            c0Var.o();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        }
    }

    static final class b implements Function2<androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ pj.n<xf, androidx.compose.runtime.c0, Integer, Unit> f23063a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ xf f23064b;

        /* JADX WARN: Multi-variable type inference failed */
        b(pj.n<? super xf, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar, xf xfVar) {
            this.f23063a = nVar;
            this.f23064b = xfVar;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(2017516783, i10, -1, "androidx.compose.material.FadeInFadeOutWithScale.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SnackbarHost.kt:317)");
            }
            pj.n<xf, androidx.compose.runtime.c0, Integer, Unit> nVar = this.f23063a;
            xf xfVar = this.f23064b;
            Intrinsics.checkNotNull(xfVar);
            nVar.invoke(xfVar, c0Var, 0);
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

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.SnackbarHostKt$SnackbarHost$1$1", f = "SnackbarHost.kt", i = {}, l = {166}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f23065a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ xf f23066b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.platform.c f23067c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(xf xfVar, androidx.compose.ui.platform.c cVar, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f23066b = xfVar;
            this.f23067c = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new c(this.f23066b, this.f23067c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f23065a;
            if (i10 == 0) {
                ResultKt.m(obj);
                xf xfVar = this.f23066b;
                if (xfVar != null) {
                    long jM = hg.m(xfVar.getDuration(), this.f23066b.S() != null, this.f23067c);
                    this.f23065a = 1;
                    if (kotlinx.coroutines.d1.b(jM, this) == objL) {
                        return objL;
                    }
                }
                return Unit.f312394a;
            }
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.m(obj);
            this.f23066b.dismiss();
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f23068a;

        static {
            int[] iArr = new int[zf.values().length];
            try {
                iArr[zf.Indefinite.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[zf.Long.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[zf.Short.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f23068a = iArr;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.SnackbarHostKt$animatedOpacity$2$1", f = "SnackbarHost.kt", i = {}, l = {344}, m = "invokeSuspend", n = {}, s = {})
    static final class e extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f23069a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.core.c<Float, androidx.compose.animation.core.s> f23070b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f23071c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.core.o<Float> f23072d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f23073e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(androidx.compose.animation.core.c<Float, androidx.compose.animation.core.s> cVar, boolean z10, androidx.compose.animation.core.o<Float> oVar, Function0<Unit> function0, kotlin.coroutines.d<? super e> dVar) {
            super(2, dVar);
            this.f23070b = cVar;
            this.f23071c = z10;
            this.f23072d = oVar;
            this.f23073e = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new e(this.f23070b, this.f23071c, this.f23072d, this.f23073e, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            e eVar;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f23069a;
            if (i10 == 0) {
                ResultKt.m(obj);
                androidx.compose.animation.core.c<Float, androidx.compose.animation.core.s> cVar = this.f23070b;
                Float fE = kotlin.coroutines.jvm.internal.b.e(this.f23071c ? 1.0f : 0.0f);
                androidx.compose.animation.core.o<Float> oVar = this.f23072d;
                this.f23069a = 1;
                eVar = this;
                if (androidx.compose.animation.core.c.i(cVar, fE, oVar, null, null, eVar, 12, null) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
                eVar = this;
            }
            eVar.f23073e.invoke();
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((e) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material.SnackbarHostKt$animatedScale$1$1", f = "SnackbarHost.kt", i = {}, l = {354}, m = "invokeSuspend", n = {}, s = {})
    static final class f extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f23074a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.core.c<Float, androidx.compose.animation.core.s> f23075b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f23076c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.core.o<Float> f23077d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(androidx.compose.animation.core.c<Float, androidx.compose.animation.core.s> cVar, boolean z10, androidx.compose.animation.core.o<Float> oVar, kotlin.coroutines.d<? super f> dVar) {
            super(2, dVar);
            this.f23075b = cVar;
            this.f23076c = z10;
            this.f23077d = oVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new f(this.f23075b, this.f23076c, this.f23077d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f23074a;
            if (i10 == 0) {
                ResultKt.m(obj);
                androidx.compose.animation.core.c<Float, androidx.compose.animation.core.s> cVar = this.f23075b;
                Float fE = kotlin.coroutines.jvm.internal.b.e(this.f23076c ? 1.0f : 0.8f);
                androidx.compose.animation.core.o<Float> oVar = this.f23077d;
                this.f23074a = 1;
                if (androidx.compose.animation.core.c.i(cVar, fE, oVar, null, null, this, 12, null) == objL) {
                    return objL;
                }
            } else {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.m(obj);
            }
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((f) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    /* JADX WARN: Code duplicated, block: B:29:0x0052  */
    /* JADX WARN: Code duplicated, block: B:30:0x0055  */
    /* JADX WARN: Code duplicated, block: B:32:0x0059  */
    /* JADX WARN: Code duplicated, block: B:34:0x005f  */
    /* JADX WARN: Code duplicated, block: B:35:0x0062  */
    /* JADX WARN: Code duplicated, block: B:39:0x006d  */
    /* JADX WARN: Code duplicated, block: B:40:0x006f  */
    /* JADX WARN: Code duplicated, block: B:43:0x0079 A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:44:0x007b  */
    /* JADX WARN: Code duplicated, block: B:45:0x007f  */
    /* JADX WARN: Code duplicated, block: B:48:0x0086  */
    /* JADX WARN: Code duplicated, block: B:51:0x009a  */
    /* JADX WARN: Code duplicated, block: B:54:0x00bc  */
    /* JADX WARN: Code duplicated, block: B:56:0x00dc A[LOOP:0: B:55:0x00da->B:56:0x00dc, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:59:0x00f8  */
    /* JADX WARN: Code duplicated, block: B:62:0x0118 A[LOOP:1: B:61:0x0116->B:62:0x0118, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:64:0x0152  */
    /* JADX WARN: Code duplicated, block: B:67:0x017f  */
    /* JADX WARN: Code duplicated, block: B:70:0x018b  */
    /* JADX WARN: Code duplicated, block: B:71:0x018f  */
    /* JADX WARN: Code duplicated, block: B:76:0x01bc  */
    /* JADX WARN: Code duplicated, block: B:79:0x01ee A[LOOP:2: B:78:0x01ec->B:79:0x01ee, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:82:0x0229  */
    /* JADX WARN: Code duplicated, block: B:84:0x022f  */
    /* JADX WARN: Code duplicated, block: B:87:0x0239  */
    /* JADX WARN: Code duplicated, block: B:92:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    private static final void d(final xf xfVar, androidx.compose.ui.a0 a0Var, final pj.n<? super xf, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar, androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        androidx.compose.ui.a0 a0Var2;
        int i13;
        int i14;
        boolean z10;
        final androidx.compose.ui.a0 a0Var3;
        androidx.compose.runtime.s5 s5VarT;
        androidx.compose.ui.a0 a0Var4;
        Object objI0;
        s8 s8Var;
        int i15;
        String strA;
        int i16;
        int iJ;
        Function0<androidx.compose.ui.node.g> function0A;
        androidx.compose.runtime.c0 c0VarD;
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B;
        List listB;
        int size;
        List listB2;
        ArrayList arrayList;
        int size2;
        int i17;
        List mutableList;
        List listF;
        List listB3;
        int size3;
        int i18;
        xf xfVar2 = xfVar;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1354335728);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = ((i10 & 8) == 0 ? c0VarR.D(xfVar2) : c0VarR.k0(xfVar2) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i19 = i11 & 2;
        if (i19 == 0) {
            if ((i10 & 48) == 0) {
                a0Var2 = a0Var;
                i12 |= c0VarR.D(a0Var2) ? 32 : 16;
            }
            if ((i11 & 4) != 0) {
                i12 |= androidx.media3.exoplayer.a5.S0;
            } else if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
                if (c0VarR.k0(nVar)) {
                    i13 = 256;
                } else {
                    i13 = 128;
                }
                i12 |= i13;
            }
            if ((i12 & com.planner5d.library.engine.input.f.b.F1) != 146) {
                z10 = true;
            } else {
                z10 = false;
            }
            if (c0VarR.h(z10, i12 & 1)) {
                if (i19 != 0) {
                    a0Var4 = androidx.compose.ui.a0.E;
                } else {
                    a0Var4 = a0Var2;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(1354335728, i12, -1, "androidx.compose.material.FadeInFadeOutWithScale (SnackbarHost.kt:245)");
                }
                objI0 = c0VarR.i0();
                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = new s8();
                    c0VarR.Y(objI0);
                }
                s8Var = (s8) objI0;
                i15 = 6;
                strA = ug.a(tg.f25008b.h(), c0VarR, 6);
                if (Intrinsics.areEqual(xfVar2, s8Var.a())) {
                    i16 = 6;
                    c0VarR.E(95900978);
                    c0VarR.A();
                } else {
                    c0VarR.E(141556995);
                    s8Var.d(xfVar2);
                    listB2 = s8Var.b();
                    arrayList = new ArrayList(listB2.size());
                    size2 = listB2.size();
                    for (i17 = 0; i17 < size2; i17++) {
                        arrayList.add((xf) ((r8) listB2.get(i17)).e());
                    }
                    mutableList = CollectionsKt.toMutableList((Collection) arrayList);
                    if (!mutableList.contains(xfVar2)) {
                        mutableList.add(xfVar2);
                    }
                    s8Var.b().clear();
                    listF = androidx.compose.ui.util.d.f(mutableList);
                    listB3 = s8Var.b();
                    i18 = 0;
                    for (size3 = listF.size(); i18 < size3; size3 = size3) {
                        xf xfVar3 = (xf) listF.get(i18);
                        listB3.add(new r8(xfVar3, androidx.compose.runtime.internal.w.e(-1032415134, true, new a(xfVar3, xfVar2, mutableList, s8Var, strA), c0VarR, 54)));
                        i18++;
                        xfVar2 = xfVar;
                        i15 = i15;
                    }
                    i16 = i15;
                    c0VarR.A();
                }
                androidx.compose.ui.layout.a1 a1VarK = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
                iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                androidx.compose.runtime.b1 b1VarK = c0VarR.k();
                androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0Var4);
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
                c0VarD = androidx.compose.runtime.y7.d(c0VarR);
                androidx.compose.runtime.y7.n(c0VarD, a1VarK, aVar.e());
                androidx.compose.runtime.y7.n(c0VarD, b1VarK, aVar.g());
                function2B = aVar.b();
                if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iJ))) {
                    c0VarD.Y(Integer.valueOf(iJ));
                    c0VarD.f(Integer.valueOf(iJ), function2B);
                }
                androidx.compose.runtime.y7.n(c0VarD, a0VarN, aVar.f());
                androidx.compose.foundation.layout.d0 d0Var = androidx.compose.foundation.layout.d0.f15956a;
                s8Var.f(androidx.compose.runtime.v.q(c0VarR, 0));
                c0VarR.E(-1757732554);
                listB = s8Var.b();
                size = listB.size();
                for (i14 = 0; i14 < size; i14++) {
                    r8 r8Var = (r8) listB.get(i14);
                    xf xfVar4 = (xf) r8Var.a();
                    pj.n<Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit>, androidx.compose.runtime.c0, Integer, Unit> nVarB = r8Var.b();
                    c0VarR.m0(-1515535286, xfVar4);
                    nVarB.invoke(androidx.compose.runtime.internal.w.e(2017516783, true, new b(nVar, xfVar4), c0VarR, 54), c0VarR, Integer.valueOf(i16));
                    c0VarR.v0();
                }
                c0VarR.A();
                c0VarR.o();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
                a0Var3 = a0Var4;
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                s5VarT.a(new Function2() { // from class: androidx.compose.material.bg
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return hg.e(xfVar, a0Var3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                    }
                });
            }
        }
        i12 |= 48;
        a0Var2 = a0Var;
        if ((i11 & 4) != 0) {
            i12 |= androidx.media3.exoplayer.a5.S0;
        } else if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
            if (c0VarR.k0(nVar)) {
                i13 = 256;
            } else {
                i13 = 128;
            }
            i12 |= i13;
        }
        if ((i12 & com.planner5d.library.engine.input.f.b.F1) != 146) {
            z10 = true;
        } else {
            z10 = false;
        }
        if (c0VarR.h(z10, i12 & 1)) {
            if (i19 != 0) {
                a0Var4 = androidx.compose.ui.a0.E;
            } else {
                a0Var4 = a0Var2;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1354335728, i12, -1, "androidx.compose.material.FadeInFadeOutWithScale (SnackbarHost.kt:245)");
            }
            objI0 = c0VarR.i0();
            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new s8();
                c0VarR.Y(objI0);
            }
            s8Var = (s8) objI0;
            i15 = 6;
            strA = ug.a(tg.f25008b.h(), c0VarR, 6);
            if (Intrinsics.areEqual(xfVar2, s8Var.a())) {
                c0VarR.E(141556995);
                s8Var.d(xfVar2);
                listB2 = s8Var.b();
                arrayList = new ArrayList(listB2.size());
                size2 = listB2.size();
                while (i17 < size2) {
                    arrayList.add((xf) ((r8) listB2.get(i17)).e());
                }
                mutableList = CollectionsKt.toMutableList((Collection) arrayList);
                if (!mutableList.contains(xfVar2)) {
                    mutableList.add(xfVar2);
                }
                s8Var.b().clear();
                listF = androidx.compose.ui.util.d.f(mutableList);
                listB3 = s8Var.b();
                i18 = 0;
                while (i18 < size3) {
                    xf xfVar5 = (xf) listF.get(i18);
                    listB3.add(new r8(xfVar5, androidx.compose.runtime.internal.w.e(-1032415134, true, new a(xfVar5, xfVar2, mutableList, s8Var, strA), c0VarR, 54)));
                    i18++;
                    xfVar2 = xfVar;
                    i15 = i15;
                }
                i16 = i15;
                c0VarR.A();
            } else {
                i16 = 6;
                c0VarR.E(95900978);
                c0VarR.A();
            }
            androidx.compose.ui.layout.a1 a1VarK2 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
            iJ = androidx.compose.runtime.v.j(c0VarR, 0);
            androidx.compose.runtime.b1 b1VarK2 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN2 = androidx.compose.ui.m.n(c0VarR, a0Var4);
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
            c0VarD = androidx.compose.runtime.y7.d(c0VarR);
            androidx.compose.runtime.y7.n(c0VarD, a1VarK2, aVar2.e());
            androidx.compose.runtime.y7.n(c0VarD, b1VarK2, aVar2.g());
            function2B = aVar2.b();
            if (c0VarD.P()) {
                c0VarD.Y(Integer.valueOf(iJ));
                c0VarD.f(Integer.valueOf(iJ), function2B);
            } else {
                c0VarD.Y(Integer.valueOf(iJ));
                c0VarD.f(Integer.valueOf(iJ), function2B);
            }
            androidx.compose.runtime.y7.n(c0VarD, a0VarN2, aVar2.f());
            androidx.compose.foundation.layout.d0 d0Var2 = androidx.compose.foundation.layout.d0.f15956a;
            s8Var.f(androidx.compose.runtime.v.q(c0VarR, 0));
            c0VarR.E(-1757732554);
            listB = s8Var.b();
            size = listB.size();
            while (i14 < size) {
                r8 r8Var2 = (r8) listB.get(i14);
                xf xfVar6 = (xf) r8Var2.a();
                pj.n<Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit>, androidx.compose.runtime.c0, Integer, Unit> nVarB2 = r8Var2.b();
                c0VarR.m0(-1515535286, xfVar6);
                nVarB2.invoke(androidx.compose.runtime.internal.w.e(2017516783, true, new b(nVar, xfVar6), c0VarR, 54), c0VarR, Integer.valueOf(i16));
                c0VarR.v0();
            }
            c0VarR.A();
            c0VarR.o();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            a0Var3 = a0Var4;
        } else {
            c0VarR.u();
            a0Var3 = a0Var2;
        }
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material.bg
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return hg.e(xfVar, a0Var3, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(xf xfVar, androidx.compose.ui.a0 a0Var, pj.n nVar, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        d(xfVar, a0Var, nVar, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void f(@NotNull final ig igVar, @Nullable androidx.compose.ui.a0 a0Var, @Nullable pj.n<? super xf, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        final androidx.compose.ui.a0 a0Var2;
        final pj.n<? super xf, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar2;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(1351125615);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c0VarR.D(igVar) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i13 = i11 & 2;
        if (i13 != 0) {
            i12 |= 48;
        } else if ((i10 & 48) == 0) {
            i12 |= c0VarR.D(a0Var) ? 32 : 16;
        }
        int i14 = i11 & 4;
        if (i14 != 0) {
            i12 |= androidx.media3.exoplayer.a5.S0;
        } else if ((i10 & androidx.media3.exoplayer.a5.S0) == 0) {
            i12 |= c0VarR.k0(nVar) ? 256 : 128;
        }
        if (c0VarR.h((i12 & com.planner5d.library.engine.input.f.b.F1) != 146, i12 & 1)) {
            if (i13 != 0) {
                a0Var = androidx.compose.ui.a0.E;
            }
            androidx.compose.ui.a0 a0Var3 = a0Var;
            if (i14 != 0) {
                nVar = s4.f24892a.a();
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(1351125615, i12, -1, "androidx.compose.material.SnackbarHost (SnackbarHost.kt:155)");
            }
            xf xfVarB = igVar.b();
            androidx.compose.ui.platform.c cVar = (androidx.compose.ui.platform.c) c0VarR.W(androidx.compose.ui.platform.q1.c());
            boolean zK0 = c0VarR.k0(xfVarB) | c0VarR.k0(cVar);
            Object objI0 = c0VarR.i0();
            if (zK0 || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new c(xfVarB, cVar, null);
                c0VarR.Y(objI0);
            }
            androidx.compose.runtime.b2.i(xfVarB, (Function2) objI0, c0VarR, 0);
            pj.n<? super xf, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar3 = nVar;
            d(igVar.b(), a0Var3, nVar3, c0VarR, i12 & 1008, 0);
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
            a0Var2 = a0Var3;
            nVar2 = nVar3;
        } else {
            c0VarR.u();
            a0Var2 = a0Var;
            nVar2 = nVar;
        }
        androidx.compose.runtime.s5 s5VarT = c0VarR.T();
        if (s5VarT != null) {
            s5VarT.a(new Function2() { // from class: androidx.compose.material.cg
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return hg.g(igVar, a0Var2, nVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(ig igVar, androidx.compose.ui.a0 a0Var, pj.n nVar, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        f(igVar, a0Var, nVar, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.o
    public static final androidx.compose.runtime.n7<Float> j(androidx.compose.animation.core.o<Float> oVar, boolean z10, Function0<Unit> function0, androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        if ((i11 & 4) != 0) {
            Object objI0 = c0Var.i0();
            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new Function0() { // from class: androidx.compose.material.ag
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return hg.k();
                    }
                };
                c0Var.Y(objI0);
            }
            function0 = (Function0) objI0;
        }
        Function0<Unit> function1 = function0;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(1016418159, i10, -1, "androidx.compose.material.animatedOpacity (SnackbarHost.kt:340)");
        }
        Object objI1 = c0Var.i0();
        androidx.compose.runtime.c0.a aVar = androidx.compose.runtime.c0.f35327a;
        if (objI1 == aVar.a()) {
            objI1 = androidx.compose.animation.core.d.b(!z10 ? 1.0f : 0.0f, 0.0f, 2, null);
            c0Var.Y(objI1);
        }
        androidx.compose.animation.core.c cVar = (androidx.compose.animation.core.c) objI1;
        Boolean boolValueOf = Boolean.valueOf(z10);
        int i12 = 4 >> 1;
        boolean zK0 = c0Var.k0(cVar) | ((((i10 & com.planner5d.library.engine.input.f.b.B) ^ 48) > 32 && c0Var.G(z10)) || (i10 & 48) == 32) | c0Var.k0(oVar) | ((((i10 & 896) ^ androidx.media3.exoplayer.a5.S0) > 256 && c0Var.D(function1)) || (i10 & androidx.media3.exoplayer.a5.S0) == 256);
        Object objI2 = c0Var.i0();
        if (zK0 || objI2 == aVar.a()) {
            Object eVar = new e(cVar, z10, oVar, function1, null);
            c0Var.Y(eVar);
            objI2 = eVar;
        }
        androidx.compose.runtime.b2.i(boolValueOf, (Function2) objI2, c0Var, (i10 >> 3) & 14);
        androidx.compose.runtime.n7<Float> n7VarJ = cVar.j();
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return n7VarJ;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit k() {
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.o
    public static final androidx.compose.runtime.n7<Float> l(androidx.compose.animation.core.o<Float> oVar, boolean z10, androidx.compose.runtime.c0 c0Var, int i10) {
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(2003504988, i10, -1, "androidx.compose.material.animatedScale (SnackbarHost.kt:350)");
        }
        Object objI0 = c0Var.i0();
        androidx.compose.runtime.c0.a aVar = androidx.compose.runtime.c0.f35327a;
        if (objI0 == aVar.a()) {
            objI0 = androidx.compose.animation.core.d.b(!z10 ? 1.0f : 0.8f, 0.0f, 2, null);
            c0Var.Y(objI0);
        }
        androidx.compose.animation.core.c cVar = (androidx.compose.animation.core.c) objI0;
        Boolean boolValueOf = Boolean.valueOf(z10);
        boolean zK0 = c0Var.k0(cVar) | ((((i10 & com.planner5d.library.engine.input.f.b.B) ^ 48) > 32 && c0Var.G(z10)) || (i10 & 48) == 32) | c0Var.k0(oVar);
        Object objI1 = c0Var.i0();
        if (zK0 || objI1 == aVar.a()) {
            objI1 = new f(cVar, z10, oVar, null);
            c0Var.Y(objI1);
        }
        androidx.compose.runtime.b2.i(boolValueOf, (Function2) objI1, c0Var, (i10 >> 3) & 14);
        androidx.compose.runtime.n7<Float> n7VarJ = cVar.j();
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.z0();
        }
        return n7VarJ;
    }

    public static final long m(@NotNull zf zfVar, boolean z10, @Nullable androidx.compose.ui.platform.c cVar) {
        long j10;
        int i10 = d.f23068a[zfVar.ordinal()];
        if (i10 == 1) {
            j10 = Long.MAX_VALUE;
        } else if (i10 == 2) {
            j10 = 10000;
        } else {
            if (i10 != 3) {
                throw new kotlin.k0();
            }
            j10 = 4000;
        }
        long j11 = j10;
        return cVar == null ? j11 : cVar.a(j11, true, true, z10);
    }
}

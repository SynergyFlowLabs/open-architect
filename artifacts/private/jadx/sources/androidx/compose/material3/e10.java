package androidx.compose.material3;

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
@SourceDebugExtension({"SMAP\nSnackbarHost.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnackbarHost.kt\nandroidx/compose/material3/SnackbarHostKt\n+ 2 CompositionLocal.kt\nandroidx/compose/runtime/CompositionLocal\n+ 3 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 4 Strings.android.kt\nandroidx/compose/material3/internal/Strings$Companion\n+ 5 ListUtils.kt\nandroidx/compose/ui/util/ListUtilsKt\n+ 6 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 7 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 8 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 9 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,423:1\n75#2:424\n1282#3,6:425\n1282#3,6:432\n1282#3,6:504\n1282#3,6:510\n1282#3,6:516\n1282#3,6:522\n1282#3,6:528\n78#4:431\n150#5,3:438\n34#5,6:441\n153#5:447\n197#5,2:448\n34#5,6:450\n199#5:456\n34#5,6:494\n70#6:457\n67#6,9:458\n77#6:503\n79#7,6:467\n86#7,3:482\n89#7,2:491\n93#7:502\n347#8,9:473\n356#8:493\n357#8,2:500\n4206#9,6:485\n*S KotlinDebug\n*F\n+ 1 SnackbarHost.kt\nandroidx/compose/material3/SnackbarHostKt\n*L\n223#1:424\n224#1:425,6\n329#1:432,6\n405#1:504,6\n407#1:510,6\n408#1:516,6\n417#1:522,6\n418#1:528,6\n328#1:431\n332#1:438,3\n332#1:441,6\n332#1:447\n337#1:448,2\n337#1:450,6\n337#1:456\n383#1:494,6\n381#1:457\n381#1:458,9\n381#1:503\n381#1:467,6\n381#1:482,3\n381#1:491,2\n381#1:502\n381#1:473,9\n381#1:493\n381#1:500,2\n381#1:485,6\n*E\n"})
public final class e10 {

    @SourceDebugExtension({"SMAP\nSnackbarHost.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SnackbarHost.kt\nandroidx/compose/material3/SnackbarHostKt$FadeInFadeOutWithScale$1$1\n+ 2 Composer.kt\nandroidx/compose/runtime/ComposerKt\n+ 3 Box.kt\nandroidx/compose/foundation/layout/BoxKt\n+ 4 Layout.kt\nandroidx/compose/ui/layout/LayoutKt\n+ 5 Composables.kt\nandroidx/compose/runtime/ComposablesKt\n+ 6 Composer.kt\nandroidx/compose/runtime/Updater\n*L\n1#1,423:1\n1282#2,6:424\n1282#2,6:430\n70#3:436\n67#3,9:437\n77#3:476\n79#4,6:446\n86#4,3:461\n89#4,2:470\n93#4:475\n347#5,9:452\n356#5,3:472\n4206#6,6:464\n*S KotlinDebug\n*F\n+ 1 SnackbarHost.kt\nandroidx/compose/material3/SnackbarHostKt$FadeInFadeOutWithScale$1$1\n*L\n345#1:424,6\n365#1:430,6\n359#1:436\n359#1:437,9\n359#1:476\n359#1:446,6\n359#1:461,3\n359#1:470,2\n359#1:475\n359#1:452,9\n359#1:472,3\n359#1:464,6\n*E\n"})
    static final class a implements pj.n<Function2<? super androidx.compose.runtime.c0, ? super Integer, ? extends Unit>, androidx.compose.runtime.c0, Integer, Unit> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        final /* synthetic */ u00 f27207a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ u00 f27208b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ kg<u00> f27209c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ String f27210d;

        a(u00 u00Var, u00 u00Var2, kg<u00> kgVar, String str) {
            this.f27207a = u00Var;
            this.f27208b = u00Var2;
            this.f27209c = kgVar;
            this.f27210d = str;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit m(final u00 u00Var, kg kgVar) {
            if (!Intrinsics.areEqual(u00Var, kgVar.a())) {
                CollectionsKt.removeAll(kgVar.b(), new Function1() { // from class: androidx.compose.material3.b10
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return Boolean.valueOf(e10.a.n(u00Var, (jg) obj));
                    }
                });
                androidx.compose.runtime.q4 q4VarC = kgVar.c();
                if (q4VarC != null) {
                    q4VarC.invalidate();
                }
            }
            return Unit.f312394a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean n(u00 u00Var, jg jgVar) {
            return Intrinsics.areEqual(jgVar.e(), u00Var);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final Unit s(boolean z10, String str, final u00 u00Var, androidx.compose.ui.semantics.e0 e0Var) {
            if (z10) {
                androidx.compose.ui.semantics.b0.E1(e0Var, androidx.compose.ui.semantics.g.f41102b.b());
            }
            int i10 = 7 ^ 0;
            androidx.compose.ui.semantics.b0.p(e0Var, null, new Function0() { // from class: androidx.compose.material3.a10
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    return Boolean.valueOf(e10.a.v(u00Var));
                }
            }, 1, null);
            androidx.compose.ui.semantics.b0.G1(e0Var, str);
            return Unit.f312394a;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final boolean v(u00 u00Var) {
            u00Var.dismiss();
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
                androidx.compose.runtime.m0.A0(-1952400805, i11, -1, "androidx.compose.material3.FadeInFadeOutWithScale.<anonymous>.<anonymous> (SnackbarHost.kt:338)");
            }
            final boolean zAreEqual = Intrinsics.areEqual(this.f27207a, this.f27208b);
            androidx.compose.animation.core.y0 y0VarB = hm.b(d0.h1.FastEffects, c0Var, 6);
            boolean zD = c0Var.D(this.f27207a) | c0Var.k0(this.f27209c);
            final u00 u00Var = this.f27207a;
            final kg<u00> kgVar = this.f27209c;
            Object objI0 = c0Var.i0();
            if (zD || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new Function0() { // from class: androidx.compose.material3.c10
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return e10.a.m(u00Var, kgVar);
                    }
                };
                c0Var.Y(objI0);
            }
            androidx.compose.runtime.n7 n7VarJ = e10.j(y0VarB, zAreEqual, (Function0) objI0, c0Var, 0, 0);
            androidx.compose.runtime.n7 n7VarL = e10.l(hm.b(d0.h1.FastSpatial, c0Var, 6), zAreEqual, c0Var, 0);
            androidx.compose.ui.a0 a0VarD = androidx.compose.ui.graphics.q1.d(androidx.compose.ui.a0.E, (124895 & 1) != 0 ? 1.0f : ((Number) n7VarL.getValue()).floatValue(), (124895 & 2) != 0 ? 1.0f : ((Number) n7VarL.getValue()).floatValue(), (124895 & 4) == 0 ? ((Number) n7VarJ.getValue()).floatValue() : 1.0f, (124895 & 8) != 0 ? 0.0f : 0.0f, (124895 & 16) != 0 ? 0.0f : 0.0f, (124895 & 32) != 0 ? 0.0f : 0.0f, (124895 & 64) != 0 ? 0.0f : 0.0f, (124895 & 128) != 0 ? 0.0f : 0.0f, (124895 & 256) == 0 ? 0.0f : 0.0f, (124895 & 512) != 0 ? 8.0f : 0.0f, (124895 & 1024) != 0 ? androidx.compose.ui.graphics.z3.f38723b.a() : 0L, (124895 & 2048) != 0 ? androidx.compose.ui.graphics.d3.a() : null, (124895 & 4096) != 0 ? false : false, (124895 & 8192) != 0 ? null : null, (124895 & 16384) != 0 ? androidx.compose.ui.graphics.s1.b() : 0L, (32768 & 124895) != 0 ? androidx.compose.ui.graphics.s1.b() : 0L, (124895 & 65536) != 0 ? androidx.compose.ui.graphics.h1.f37790b.a() : 0);
            boolean zG = c0Var.G(zAreEqual) | c0Var.D(this.f27207a) | c0Var.D(this.f27210d);
            final String str = this.f27210d;
            final u00 u00Var2 = this.f27207a;
            Object objI1 = c0Var.i0();
            if (zG || objI1 == androidx.compose.runtime.c0.f35327a.a()) {
                objI1 = new Function1() { // from class: androidx.compose.material3.d10
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        return e10.a.s(zAreEqual, str, u00Var2, (androidx.compose.ui.semantics.e0) obj);
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
        final /* synthetic */ pj.n<u00, androidx.compose.runtime.c0, Integer, Unit> f27211a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ u00 f27212b;

        /* JADX WARN: Multi-variable type inference failed */
        b(pj.n<? super u00, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar, u00 u00Var) {
            this.f27211a = nVar;
            this.f27212b = u00Var;
        }

        @androidx.compose.runtime.o
        @androidx.compose.runtime.t(applier = "androidx.compose.ui.UiComposable")
        public final void c(androidx.compose.runtime.c0 c0Var, int i10) {
            if (!c0Var.h((i10 & 3) != 2, i10 & 1)) {
                c0Var.u();
                return;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1893791890, i10, -1, "androidx.compose.material3.FadeInFadeOutWithScale.<anonymous>.<anonymous>.<anonymous>.<anonymous> (SnackbarHost.kt:382)");
            }
            pj.n<u00, androidx.compose.runtime.c0, Integer, Unit> nVar = this.f27211a;
            u00 u00Var = this.f27212b;
            Intrinsics.checkNotNull(u00Var);
            nVar.invoke(u00Var, c0Var, 0);
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

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.SnackbarHostKt$SnackbarHost$1$1", f = "SnackbarHost.kt", i = {}, l = {231}, m = "invokeSuspend", n = {}, s = {})
    static final class c extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f27213a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ u00 f27214b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ androidx.compose.ui.platform.c f27215c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        c(u00 u00Var, androidx.compose.ui.platform.c cVar, kotlin.coroutines.d<? super c> dVar) {
            super(2, dVar);
            this.f27214b = u00Var;
            this.f27215c = cVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new c(this.f27214b, this.f27215c, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f27213a;
            if (i10 == 0) {
                ResultKt.m(obj);
                u00 u00Var = this.f27214b;
                if (u00Var != null) {
                    long jM = e10.m(u00Var.a().getDuration(), this.f27214b.a().S() != null, this.f27215c);
                    this.f27213a = 1;
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
            this.f27214b.dismiss();
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((c) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    public /* synthetic */ class d {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f27216a;

        static {
            int[] iArr = new int[w00.values().length];
            try {
                iArr[w00.Indefinite.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[w00.Long.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[w00.Short.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f27216a = iArr;
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.SnackbarHostKt$animatedOpacity$2$1", f = "SnackbarHost.kt", i = {}, l = {com.google.api.client.http.a0.f115563p}, m = "invokeSuspend", n = {}, s = {})
    static final class e extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f27217a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.core.c<Float, androidx.compose.animation.core.s> f27218b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f27219c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.core.o<Float> f27220d;

        /* JADX INFO: renamed from: e, reason: collision with root package name */
        final /* synthetic */ Function0<Unit> f27221e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        e(androidx.compose.animation.core.c<Float, androidx.compose.animation.core.s> cVar, boolean z10, androidx.compose.animation.core.o<Float> oVar, Function0<Unit> function0, kotlin.coroutines.d<? super e> dVar) {
            super(2, dVar);
            this.f27218b = cVar;
            this.f27219c = z10;
            this.f27220d = oVar;
            this.f27221e = function0;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new e(this.f27218b, this.f27219c, this.f27220d, this.f27221e, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            e eVar;
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f27217a;
            if (i10 == 0) {
                ResultKt.m(obj);
                androidx.compose.animation.core.c<Float, androidx.compose.animation.core.s> cVar = this.f27218b;
                Float fE = kotlin.coroutines.jvm.internal.b.e(this.f27219c ? 1.0f : 0.0f);
                androidx.compose.animation.core.o<Float> oVar = this.f27220d;
                this.f27217a = 1;
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
            eVar.f27221e.invoke();
            return Unit.f312394a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(kotlinx.coroutines.s0 s0Var, kotlin.coroutines.d<? super Unit> dVar) {
            return ((e) create(s0Var, dVar)).invokeSuspend(Unit.f312394a);
        }
    }

    @kotlin.coroutines.jvm.internal.f(c = "androidx.compose.material3.SnackbarHostKt$animatedScale$1$1", f = "SnackbarHost.kt", i = {}, l = {419}, m = "invokeSuspend", n = {}, s = {})
    static final class f extends kotlin.coroutines.jvm.internal.o implements Function2<kotlinx.coroutines.s0, kotlin.coroutines.d<? super Unit>, Object> {

        /* JADX INFO: renamed from: a, reason: collision with root package name */
        int f27222a;

        /* JADX INFO: renamed from: b, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.core.c<Float, androidx.compose.animation.core.s> f27223b;

        /* JADX INFO: renamed from: c, reason: collision with root package name */
        final /* synthetic */ boolean f27224c;

        /* JADX INFO: renamed from: d, reason: collision with root package name */
        final /* synthetic */ androidx.compose.animation.core.o<Float> f27225d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        f(androidx.compose.animation.core.c<Float, androidx.compose.animation.core.s> cVar, boolean z10, androidx.compose.animation.core.o<Float> oVar, kotlin.coroutines.d<? super f> dVar) {
            super(2, dVar);
            this.f27223b = cVar;
            this.f27224c = z10;
            this.f27225d = oVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new f(this.f27223b, this.f27224c, this.f27225d, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Object objL = kotlin.coroutines.intrinsics.b.l();
            int i10 = this.f27222a;
            if (i10 == 0) {
                ResultKt.m(obj);
                androidx.compose.animation.core.c<Float, androidx.compose.animation.core.s> cVar = this.f27223b;
                Float fE = kotlin.coroutines.jvm.internal.b.e(this.f27224c ? 1.0f : 0.8f);
                androidx.compose.animation.core.o<Float> oVar = this.f27225d;
                this.f27222a = 1;
                boolean z10 = false & false;
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

    /* JADX WARN: Code duplicated, block: B:26:0x0047  */
    /* JADX WARN: Code duplicated, block: B:27:0x004a  */
    /* JADX WARN: Code duplicated, block: B:29:0x004e  */
    /* JADX WARN: Code duplicated, block: B:31:0x0054  */
    /* JADX WARN: Code duplicated, block: B:32:0x0057  */
    /* JADX WARN: Code duplicated, block: B:36:0x0062  */
    /* JADX WARN: Code duplicated, block: B:37:0x0064  */
    /* JADX WARN: Code duplicated, block: B:40:0x006d A[DONT_INVERT] */
    /* JADX WARN: Code duplicated, block: B:41:0x006f  */
    /* JADX WARN: Code duplicated, block: B:42:0x0072  */
    /* JADX WARN: Code duplicated, block: B:45:0x0079  */
    /* JADX WARN: Code duplicated, block: B:48:0x0097  */
    /* JADX WARN: Code duplicated, block: B:51:0x00ad  */
    /* JADX WARN: Code duplicated, block: B:53:0x00cd A[LOOP:0: B:52:0x00cb->B:53:0x00cd, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:56:0x00e9  */
    /* JADX WARN: Code duplicated, block: B:59:0x0107 A[LOOP:1: B:58:0x0105->B:59:0x0107, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:61:0x012f  */
    /* JADX WARN: Code duplicated, block: B:64:0x015b  */
    /* JADX WARN: Code duplicated, block: B:67:0x0167  */
    /* JADX WARN: Code duplicated, block: B:68:0x016b  */
    /* JADX WARN: Code duplicated, block: B:73:0x0198  */
    /* JADX WARN: Code duplicated, block: B:76:0x01cb A[LOOP:2: B:75:0x01c9->B:76:0x01cb, LOOP_END] */
    /* JADX WARN: Code duplicated, block: B:79:0x0207  */
    /* JADX WARN: Code duplicated, block: B:80:0x020b  */
    /* JADX WARN: Code duplicated, block: B:83:0x0215  */
    /* JADX WARN: Code duplicated, block: B:88:? A[RETURN, SYNTHETIC] */
    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    private static final void d(final u00 u00Var, androidx.compose.ui.a0 a0Var, final pj.n<? super u00, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar, androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        androidx.compose.ui.a0 a0Var2;
        int i13;
        boolean z10;
        androidx.compose.ui.a0 a0Var3;
        androidx.compose.runtime.s5 s5VarT;
        String strB;
        Object objI0;
        kg kgVar;
        int iJ;
        Function0<androidx.compose.ui.node.g> function0A;
        androidx.compose.runtime.c0 c0VarD;
        Function2<androidx.compose.ui.node.g, Integer, Unit> function2B;
        List listB;
        int size;
        int i14;
        List listB2;
        ArrayList arrayList;
        int size2;
        int i15;
        List mutableList;
        List listF;
        List listB3;
        int size3;
        int i16;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-977568115);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c0VarR.D(u00Var) ? 4 : 2) | i10;
        } else {
            i12 = i10;
        }
        int i17 = i11 & 2;
        if (i17 == 0) {
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
                if (i17 != 0) {
                    a0Var3 = androidx.compose.ui.a0.E;
                } else {
                    a0Var3 = a0Var2;
                }
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.A0(-977568115, i12, -1, "androidx.compose.material3.FadeInFadeOutWithScale (SnackbarHost.kt:326)");
                }
                androidx.compose.material3.internal.l3.a aVar = androidx.compose.material3.internal.l3.f29010b;
                strB = androidx.compose.material3.internal.m3.b(androidx.compose.material3.internal.l3.b(ps.b.S), c0VarR, 0);
                objI0 = c0VarR.i0();
                if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                    objI0 = new kg();
                    c0VarR.Y(objI0);
                }
                kgVar = (kg) objI0;
                if (Intrinsics.areEqual(u00Var, kgVar.a())) {
                    c0VarR.E(1443908949);
                    c0VarR.A();
                } else {
                    c0VarR.E(1154891761);
                    kgVar.d(u00Var);
                    listB2 = kgVar.b();
                    arrayList = new ArrayList(listB2.size());
                    size2 = listB2.size();
                    for (i15 = 0; i15 < size2; i15++) {
                        arrayList.add((u00) ((jg) listB2.get(i15)).e());
                    }
                    mutableList = CollectionsKt.toMutableList((Collection) arrayList);
                    if (!mutableList.contains(u00Var)) {
                        mutableList.add(u00Var);
                    }
                    kgVar.b().clear();
                    listF = androidx.compose.ui.util.d.f(mutableList);
                    listB3 = kgVar.b();
                    size3 = listF.size();
                    i16 = 0;
                    while (i16 < size3) {
                        u00 u00Var2 = (u00) listF.get(i16);
                        listB3.add(new jg(u00Var2, androidx.compose.runtime.internal.w.e(-1952400805, true, new a(u00Var2, u00Var, kgVar, strB), c0VarR, 54)));
                        i16++;
                        strB = strB;
                    }
                    c0VarR.A();
                }
                androidx.compose.ui.layout.a1 a1VarK = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
                iJ = androidx.compose.runtime.v.j(c0VarR, 0);
                androidx.compose.runtime.b1 b1VarK = c0VarR.k();
                androidx.compose.ui.a0 a0VarN = androidx.compose.ui.m.n(c0VarR, a0Var3);
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
                androidx.compose.runtime.y7.n(c0VarD, a1VarK, aVar2.e());
                androidx.compose.runtime.y7.n(c0VarD, b1VarK, aVar2.g());
                function2B = aVar2.b();
                if (c0VarD.P() || !Intrinsics.areEqual(c0VarD.i0(), Integer.valueOf(iJ))) {
                    c0VarD.Y(Integer.valueOf(iJ));
                    c0VarD.f(Integer.valueOf(iJ), function2B);
                }
                androidx.compose.runtime.y7.n(c0VarD, a0VarN, aVar2.f());
                androidx.compose.foundation.layout.d0 d0Var = androidx.compose.foundation.layout.d0.f15956a;
                kgVar.f(androidx.compose.runtime.v.q(c0VarR, 0));
                c0VarR.E(-1888182177);
                listB = kgVar.b();
                size = listB.size();
                for (i14 = 0; i14 < size; i14++) {
                    jg jgVar = (jg) listB.get(i14);
                    u00 u00Var3 = (u00) jgVar.a();
                    pj.n<Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit>, androidx.compose.runtime.c0, Integer, Unit> nVarB = jgVar.b();
                    c0VarR.m0(1325010085, u00Var3);
                    nVarB.invoke(androidx.compose.runtime.internal.w.e(-1893791890, true, new b(nVar, u00Var3), c0VarR, 54), c0VarR, 6);
                    c0VarR.v0();
                }
                c0VarR.A();
                c0VarR.o();
                if (androidx.compose.runtime.m0.l0()) {
                    androidx.compose.runtime.m0.z0();
                }
            } else {
                c0VarR.u();
                a0Var3 = a0Var2;
            }
            s5VarT = c0VarR.T();
            if (s5VarT != null) {
                final androidx.compose.ui.a0 a0Var4 = a0Var3;
                s5VarT.a(new Function2() { // from class: androidx.compose.material3.z00
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        return e10.e(u00Var, a0Var4, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
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
            if (i17 != 0) {
                a0Var3 = androidx.compose.ui.a0.E;
            } else {
                a0Var3 = a0Var2;
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-977568115, i12, -1, "androidx.compose.material3.FadeInFadeOutWithScale (SnackbarHost.kt:326)");
            }
            androidx.compose.material3.internal.l3.a aVar3 = androidx.compose.material3.internal.l3.f29010b;
            strB = androidx.compose.material3.internal.m3.b(androidx.compose.material3.internal.l3.b(ps.b.S), c0VarR, 0);
            objI0 = c0VarR.i0();
            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new kg();
                c0VarR.Y(objI0);
            }
            kgVar = (kg) objI0;
            if (Intrinsics.areEqual(u00Var, kgVar.a())) {
                c0VarR.E(1154891761);
                kgVar.d(u00Var);
                listB2 = kgVar.b();
                arrayList = new ArrayList(listB2.size());
                size2 = listB2.size();
                while (i15 < size2) {
                    arrayList.add((u00) ((jg) listB2.get(i15)).e());
                }
                mutableList = CollectionsKt.toMutableList((Collection) arrayList);
                if (!mutableList.contains(u00Var)) {
                    mutableList.add(u00Var);
                }
                kgVar.b().clear();
                listF = androidx.compose.ui.util.d.f(mutableList);
                listB3 = kgVar.b();
                size3 = listF.size();
                i16 = 0;
                while (i16 < size3) {
                    u00 u00Var4 = (u00) listF.get(i16);
                    listB3.add(new jg(u00Var4, androidx.compose.runtime.internal.w.e(-1952400805, true, new a(u00Var4, u00Var, kgVar, strB), c0VarR, 54)));
                    i16++;
                    strB = strB;
                }
                c0VarR.A();
            } else {
                c0VarR.E(1443908949);
                c0VarR.A();
            }
            androidx.compose.ui.layout.a1 a1VarK2 = androidx.compose.foundation.layout.x.k(androidx.compose.ui.e.f37317a.C(), false);
            iJ = androidx.compose.runtime.v.j(c0VarR, 0);
            androidx.compose.runtime.b1 b1VarK2 = c0VarR.k();
            androidx.compose.ui.a0 a0VarN2 = androidx.compose.ui.m.n(c0VarR, a0Var3);
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
            c0VarD = androidx.compose.runtime.y7.d(c0VarR);
            androidx.compose.runtime.y7.n(c0VarD, a1VarK2, aVar4.e());
            androidx.compose.runtime.y7.n(c0VarD, b1VarK2, aVar4.g());
            function2B = aVar4.b();
            if (c0VarD.P()) {
                c0VarD.Y(Integer.valueOf(iJ));
                c0VarD.f(Integer.valueOf(iJ), function2B);
            } else {
                c0VarD.Y(Integer.valueOf(iJ));
                c0VarD.f(Integer.valueOf(iJ), function2B);
            }
            androidx.compose.runtime.y7.n(c0VarD, a0VarN2, aVar4.f());
            androidx.compose.foundation.layout.d0 d0Var2 = androidx.compose.foundation.layout.d0.f15956a;
            kgVar.f(androidx.compose.runtime.v.q(c0VarR, 0));
            c0VarR.E(-1888182177);
            listB = kgVar.b();
            size = listB.size();
            while (i14 < size) {
                jg jgVar2 = (jg) listB.get(i14);
                u00 u00Var5 = (u00) jgVar2.a();
                pj.n<Function2<? super androidx.compose.runtime.c0, ? super Integer, Unit>, androidx.compose.runtime.c0, Integer, Unit> nVarB2 = jgVar2.b();
                c0VarR.m0(1325010085, u00Var5);
                nVarB2.invoke(androidx.compose.runtime.internal.w.e(-1893791890, true, new b(nVar, u00Var5), c0VarR, 54), c0VarR, 6);
                c0VarR.v0();
            }
            c0VarR.A();
            c0VarR.o();
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.z0();
            }
        } else {
            c0VarR.u();
            a0Var3 = a0Var2;
        }
        s5VarT = c0VarR.T();
        if (s5VarT != null) {
            final androidx.compose.ui.a0 a0Var5 = a0Var3;
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.z00
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return e10.e(u00Var, a0Var5, nVar, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit e(u00 u00Var, androidx.compose.ui.a0 a0Var, pj.n nVar, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        d(u00Var, a0Var, nVar, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    @androidx.compose.runtime.o
    @androidx.compose.runtime.p(scheme = "[androidx.compose.ui.UiComposable[androidx.compose.ui.UiComposable]]")
    public static final void f(@NotNull final f10 f10Var, @Nullable androidx.compose.ui.a0 a0Var, @Nullable pj.n<? super u00, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar, @Nullable androidx.compose.runtime.c0 c0Var, final int i10, final int i11) {
        int i12;
        final androidx.compose.ui.a0 a0Var2;
        final pj.n<? super u00, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar2;
        androidx.compose.runtime.c0 c0VarR = c0Var.R(-1077081618);
        if ((i11 & 1) != 0) {
            i12 = i10 | 6;
        } else if ((i10 & 6) == 0) {
            i12 = (c0VarR.D(f10Var) ? 4 : 2) | i10;
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
                nVar = x6.f34394a.a();
            }
            if (androidx.compose.runtime.m0.l0()) {
                androidx.compose.runtime.m0.A0(-1077081618, i12, -1, "androidx.compose.material3.SnackbarHost (SnackbarHost.kt:220)");
            }
            u00 u00VarB = f10Var.b();
            androidx.compose.ui.platform.c cVar = (androidx.compose.ui.platform.c) c0VarR.W(androidx.compose.ui.platform.q1.c());
            boolean zD = c0VarR.D(u00VarB) | c0VarR.k0(cVar);
            Object objI0 = c0VarR.i0();
            if (zD || objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new c(u00VarB, cVar, null);
                c0VarR.Y(objI0);
            }
            androidx.compose.runtime.b2.i(u00VarB, (Function2) objI0, c0VarR, 0);
            pj.n<? super u00, ? super androidx.compose.runtime.c0, ? super Integer, Unit> nVar3 = nVar;
            d(f10Var.b(), a0Var3, nVar3, c0VarR, i12 & 1008, 0);
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
            s5VarT.a(new Function2() { // from class: androidx.compose.material3.x00
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    return e10.g(f10Var, a0Var2, nVar2, i10, i11, (androidx.compose.runtime.c0) obj, ((Integer) obj2).intValue());
                }
            });
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit g(f10 f10Var, androidx.compose.ui.a0 a0Var, pj.n nVar, int i10, int i11, androidx.compose.runtime.c0 c0Var, int i12) {
        f(f10Var, a0Var, nVar, c0Var, androidx.compose.runtime.t4.a(i10 | 1), i11);
        return Unit.f312394a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    @androidx.compose.runtime.o
    public static final androidx.compose.runtime.n7<Float> j(androidx.compose.animation.core.o<Float> oVar, boolean z10, Function0<Unit> function0, androidx.compose.runtime.c0 c0Var, int i10, int i11) {
        if ((i11 & 4) != 0) {
            Object objI0 = c0Var.i0();
            if (objI0 == androidx.compose.runtime.c0.f35327a.a()) {
                objI0 = new Function0() { // from class: androidx.compose.material3.y00
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        return e10.k();
                    }
                };
                c0Var.Y(objI0);
            }
            function0 = (Function0) objI0;
        }
        Function0<Unit> function1 = function0;
        if (androidx.compose.runtime.m0.l0()) {
            androidx.compose.runtime.m0.A0(1431889134, i10, -1, "androidx.compose.material3.animatedOpacity (SnackbarHost.kt:405)");
        }
        Object objI1 = c0Var.i0();
        androidx.compose.runtime.c0.a aVar = androidx.compose.runtime.c0.f35327a;
        if (objI1 == aVar.a()) {
            objI1 = androidx.compose.animation.core.d.b(!z10 ? 1.0f : 0.0f, 0.0f, 2, null);
            c0Var.Y(objI1);
        }
        androidx.compose.animation.core.c cVar = (androidx.compose.animation.core.c) objI1;
        Boolean boolValueOf = Boolean.valueOf(z10);
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
            androidx.compose.runtime.m0.A0(1966809761, i10, -1, "androidx.compose.material3.animatedScale (SnackbarHost.kt:415)");
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

    public static final long m(@NotNull w00 w00Var, boolean z10, @Nullable androidx.compose.ui.platform.c cVar) {
        long j10;
        int i10 = d.f27216a[w00Var.ordinal()];
        if (i10 == 1) {
            j10 = Long.MAX_VALUE;
        } else if (i10 != 2) {
            int i11 = 4 & 3;
            if (i10 != 3) {
                throw new kotlin.k0();
            }
            j10 = 4000;
        } else {
            j10 = 10000;
        }
        long j11 = j10;
        return cVar == null ? j11 : cVar.a(j11, true, true, z10);
    }
}
